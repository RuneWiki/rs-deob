package deob;

@ObfuscatedName("hw")
public class class216 extends class119 {

    @ObfuscatedName("hw.s")
    public class202 field2623 = new class202(128);

    @ObfuscatedName("hw.g")
    public int field2640 = 256;

    @ObfuscatedName("hw.m")
    public int field2641 = 1000000;

    @ObfuscatedName("hw.h")
    public int[] field2645 = new int[16];

    @ObfuscatedName("hw.i")
    public int[] field2626 = new int[16];

    @ObfuscatedName("hw.t")
    public int[] field2627 = new int[16];

    @ObfuscatedName("hw.d")
    public int[] field2622 = new int[16];

    @ObfuscatedName("hw.z")
    public int[] field2636 = new int[16];

    @ObfuscatedName("hw.k")
    public int[] field2630 = new int[16];

    @ObfuscatedName("hw.c")
    public int[] field2631 = new int[16];

    @ObfuscatedName("hw.o")
    public int[] field2632 = new int[16];

    @ObfuscatedName("hw.l")
    public int[] field2633 = new int[16];

    @ObfuscatedName("hw.p")
    public int[] field2628 = new int[16];

    @ObfuscatedName("hw.y")
    public int[] field2635 = new int[16];

    @ObfuscatedName("hw.n")
    public int[] field2624 = new int[16];

    @ObfuscatedName("hw.j")
    public int[] field2637 = new int[16];

    @ObfuscatedName("hw.e")
    public int[] field2647 = new int[16];

    @ObfuscatedName("hw.v")
    public int[] field2639 = new int[16];

    @ObfuscatedName("hw.a")
    public class217[][] field2625 = new class217[16][128];

    @ObfuscatedName("hw.ad")
    public class217[][] field2629 = new class217[16][128];

    @ObfuscatedName("hw.al")
    public class218 field2642 = new class218();

    @ObfuscatedName("hw.aq")
    public boolean field2643;

    @ObfuscatedName("hw.ar")
    public int field2644;

    @ObfuscatedName("hw.an")
    public int field2638;

    @ObfuscatedName("hw.af")
    public long field2646;

    @ObfuscatedName("hw.as")
    public long field2634;

    @ObfuscatedName("hw.ax")
    public class220 field2648 = new class220(this);

    public class216() {
        this.method3893();
    }

    @ObfuscatedName("hw.s(IB)V")
    public synchronized void method3853(int arg0) {
        this.field2640 = arg0;
    }

    @ObfuscatedName("hw.g(I)I")
    public int method3935() {
        return this.field2640;
    }

    @ObfuscatedName("hw.m(Lhu;Lir;Ldh;II)Z")
    public synchronized boolean method3855(class221 arg0, class247 arg1, class112 arg2, int arg3) {
        arg0.method4026();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class211 var7 = (class211) arg0.field2702.method3693(); var7 != null; var7 = (class211) arg0.field2702.method3694()) {
            int var8 = (int) var7.field2585;
            class219 var9 = (class219) this.field2623.method3704((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method4207(var8);
                class219 var11;
                if (var10 == null) {
                    var11 = null;
                } else {
                    var11 = new class219(var10);
                }
                var9 = var11;
                if (var11 == null) {
                    var5 = false;
                    continue;
                }
                this.field2623.method3691(var11, (long) var8);
            }
            if (!var9.method4014(arg2, var7.field2600, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method4028();
        }
        return var5;
    }

    @ObfuscatedName("hw.h(I)V")
    public synchronized void method3895() {
        for (class219 var1 = (class219) this.field2623.method3693(); var1 != null; var1 = (class219) this.field2623.method3694()) {
            var1.method4006();
        }
    }

    @ObfuscatedName("hw.i(B)V")
    public synchronized void method3857() {
        for (class219 var1 = (class219) this.field2623.method3693(); var1 != null; var1 = (class219) this.field2623.method3694()) {
            var1.method3740();
        }
    }

    @ObfuscatedName("hw.k(Lhu;ZI)V")
    public synchronized void method3858(class221 arg0, boolean arg1) {
        this.method3859();
        this.field2642.method3977(arg0.field2701);
        this.field2643 = arg1;
        this.field2646 = 0L;
        int var3 = this.field2642.method3962();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2642.method4001(var4);
            this.field2642.method3966(var4);
            this.field2642.method3964(var4);
        }
        this.field2644 = this.field2642.method3971();
        this.field2638 = this.field2642.field2675[this.field2644];
        this.field2634 = this.field2642.method3970(this.field2638);
    }

    @ObfuscatedName("hw.o(I)V")
    public synchronized void method3859() {
        this.field2642.method3960();
        this.method3893();
    }

    @ObfuscatedName("hw.l(I)Z")
    public synchronized boolean method3930() {
        return this.field2642.method3984();
    }

    @ObfuscatedName("hw.f(III)V")
    public synchronized void method3861(int arg0, int arg1) {
        this.method3862(arg0, arg1);
    }

    @ObfuscatedName("hw.q(III)V")
    public void method3862(int arg0, int arg1) {
        this.field2622[arg0] = arg1;
        this.field2630[arg0] = arg1 & 0xFFFFFF80;
        this.method3884(arg0, arg1);
    }

    @ObfuscatedName("hw.r(III)V")
    public void method3884(int arg0, int arg1) {
        if (this.field2636[arg0] != arg1) {
            this.field2636[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2629[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("hw.x(IIII)V")
    public void method3863(int arg0, int arg1, int arg2) {
        this.method3865(arg0, arg1, 64);
        if ((this.field2628[arg0] & 0x2) != 0) {
            for (class217 var4 = (class217) this.field2648.field2697.method3753(); var4 != null; var4 = (class217) this.field2648.field2697.method3745()) {
                if (var4.field2650 == arg0 && var4.field2663 < 0) {
                    this.field2625[arg0][var4.field2654] = null;
                    this.field2625[arg0][arg1] = var4;
                    int var5 = (var4.field2658 * var4.field2649 >> 12) + var4.field2657;
                    var4.field2657 += arg1 - var4.field2654 << 8;
                    var4.field2658 = var5 - var4.field2657;
                    var4.field2649 = 4096;
                    var4.field2654 = arg1;
                    return;
                }
            }
        }
        class219 var6 = (class219) this.field2623.method3704((long) this.field2636[arg0]);
        if (var6 == null) {
            return;
        }
        class107 var7 = var6.field2685[arg1];
        if (var7 == null) {
            return;
        }
        class217 var8 = new class217();
        var8.field2650 = arg0;
        var8.field2656 = var6;
        var8.field2660 = var7;
        var8.field2651 = var6.field2690[arg1];
        var8.field2653 = var6.field2691[arg1];
        var8.field2654 = arg1;
        var8.field2655 = var6.field2686 * arg2 * arg2 * var6.field2688[arg1] + 1024 >> 11;
        var8.field2652 = var6.field2689[arg1] & 0xFF;
        var8.field2657 = (arg1 << 8) - (var6.field2687[arg1] & 0x7FFF);
        var8.field2667 = 0;
        var8.field2661 = 0;
        var8.field2662 = 0;
        var8.field2663 = -1;
        var8.field2659 = 0;
        if (this.field2637[arg0] == 0) {
            var8.field2668 = class117.method2225(var7, this.method3919(var8), this.method3897(var8), this.method3856(var8));
        } else {
            var8.field2668 = class117.method2225(var7, this.method3919(var8), 0, this.method3856(var8));
            this.method3864(var8, var6.field2687[arg1] < 0);
        }
        if (var6.field2687[arg1] < 0) {
            var8.field2668.method2227(-1);
        }
        if (var8.field2653 >= 0) {
            class217 var9 = this.field2629[arg0][var8.field2653];
            if (var9 != null && var9.field2663 < 0) {
                this.field2625[arg0][var9.field2654] = null;
                var9.field2663 = 0;
            }
            this.field2629[arg0][var8.field2653] = var8;
        }
        this.field2648.field2697.method3747(var8);
        this.field2625[arg0][arg1] = var8;
    }

    @ObfuscatedName("hw.u(Lhh;ZB)V")
    public void method3864(class217 arg0, boolean arg1) {
        int var3 = arg0.field2660.field1527.length;
        int var5;
        if (arg1 && arg0.field2660.field1529) {
            int var4 = var3 + var3 - arg0.field2660.field1526;
            var5 = (int) ((long) this.field2637[arg0.field2650] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2668.method2345(true);
            }
        } else {
            var5 = (int) ((long) this.field2637[arg0.field2650] * (long) var3 >> 6);
        }
        arg0.field2668.method2233(var5);
    }

    @ObfuscatedName("hw.a(IIII)V")
    public void method3865(int arg0, int arg1, int arg2) {
        class217 var4 = this.field2625[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2625[arg0][arg1] = null;
        if ((this.field2628[arg0] & 0x2) == 0) {
            var4.field2663 = 0;
            return;
        }
        for (class217 var5 = (class217) this.field2648.field2697.method3752(); var5 != null; var5 = (class217) this.field2648.field2697.method3762()) {
            if (var4.field2650 == var5.field2650 && var5.field2663 < 0 && var4 != var5) {
                var4.field2663 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("hw.ad(IIIB)V")
    public void method3887(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("hw.al(III)V")
    public void method3867(int arg0, int arg1) {
    }

    @ObfuscatedName("hw.aq(IIS)V")
    public void method3871(int arg0, int arg1) {
        this.field2631[arg0] = arg1;
    }

    @ObfuscatedName("hw.ar(II)V")
    public void method3869(int arg0) {
        for (class217 var2 = (class217) this.field2648.field2697.method3752(); var2 != null; var2 = (class217) this.field2648.field2697.method3762()) {
            if (arg0 < 0 || var2.field2650 == arg0) {
                if (var2.field2668 != null) {
                    var2.field2668.method2319(Statics.field1562 / 100);
                    if (var2.field2668.method2364()) {
                        this.field2648.field2696.method1992(var2.field2668);
                    }
                    var2.method3957();
                }
                if (var2.field2663 < 0) {
                    this.field2625[var2.field2650][var2.field2654] = null;
                }
                var2.method3740();
            }
        }
    }

    @ObfuscatedName("hw.an(II)V")
    public void method3870(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3870(var2);
            }
            return;
        }
        this.field2645[arg0] = 12800;
        this.field2626[arg0] = 8192;
        this.field2627[arg0] = 16383;
        this.field2631[arg0] = 8192;
        this.field2632[arg0] = 0;
        this.field2633[arg0] = 8192;
        this.method3873(arg0);
        this.method3885(arg0);
        this.field2628[arg0] = 0;
        this.field2635[arg0] = 32767;
        this.field2624[arg0] = 256;
        this.field2637[arg0] = 0;
        this.method3876(arg0, 8192);
    }

    @ObfuscatedName("hw.af(II)V")
    public void method3866(int arg0) {
        for (class217 var2 = (class217) this.field2648.field2697.method3752(); var2 != null; var2 = (class217) this.field2648.field2697.method3762()) {
            if ((arg0 < 0 || var2.field2650 == arg0) && var2.field2663 < 0) {
                this.field2625[var2.field2650][var2.field2654] = null;
                var2.field2663 = 0;
            }
        }
    }

    @ObfuscatedName("hw.as(I)V")
    public void method3893() {
        this.method3869(-1);
        this.method3870(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2636[var1] = this.field2622[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2630[var2] = this.field2622[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("hw.ax(II)V")
    public void method3873(int arg0) {
        if ((this.field2628[arg0] & 0x2) == 0) {
            return;
        }
        for (class217 var2 = (class217) this.field2648.field2697.method3752(); var2 != null; var2 = (class217) this.field2648.field2697.method3762()) {
            if (var2.field2650 == arg0 && this.field2625[arg0][var2.field2654] == null && var2.field2663 < 0) {
                var2.field2663 = 0;
            }
        }
    }

    @ObfuscatedName("hw.ae(IB)V")
    public void method3885(int arg0) {
        if ((this.field2628[arg0] & 0x4) == 0) {
            return;
        }
        for (class217 var2 = (class217) this.field2648.field2697.method3752(); var2 != null; var2 = (class217) this.field2648.field2697.method3762()) {
            if (var2.field2650 == arg0) {
                var2.field2669 = 0;
            }
        }
    }

    @ObfuscatedName("hw.ao(IB)V")
    public void method3875(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3865(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3863(var6, var7, var8);
            } else {
                this.method3865(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3887(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2630[var12] = (var14 << 14) + (this.field2630[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2630[var12] = (var14 << 7) + (this.field2630[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2632[var12] = (var14 << 7) + (this.field2632[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2632[var12] = (this.field2632[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2633[var12] = (var14 << 7) + (this.field2633[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2633[var12] = (this.field2633[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2645[var12] = (var14 << 7) + (this.field2645[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2645[var12] = (this.field2645[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2626[var12] = (var14 << 7) + (this.field2626[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2626[var12] = (this.field2626[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2627[var12] = (var14 << 7) + (this.field2627[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2627[var12] = (this.field2627[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2628[var12] |= 0x1;
                } else {
                    this.field2628[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2628[var12] |= 0x2;
                } else {
                    this.method3873(var12);
                    this.field2628[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2635[var12] = (var14 << 7) + (this.field2635[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2635[var12] = (this.field2635[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2635[var12] = (var14 << 7) + (this.field2635[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2635[var12] = (this.field2635[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3869(var12);
            }
            if (var13 == 121) {
                this.method3870(var12);
            }
            if (var13 == 123) {
                this.method3866(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2635[var12];
                if (var15 == 16384) {
                    this.field2624[var12] = (var14 << 7) + (this.field2624[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2635[var12];
                if (var16 == 16384) {
                    this.field2624[var12] = (this.field2624[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2637[var12] = (var14 << 7) + (this.field2637[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2637[var12] = (this.field2637[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2628[var12] |= 0x4;
                } else {
                    this.method3885(var12);
                    this.field2628[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3876(var12, (var14 << 7) + (this.field2647[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3876(var12, (this.field2647[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3884(var17, this.field2630[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3867(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method3871(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3893();
            }
        }
    }

    @ObfuscatedName("hw.av(IIB)V")
    public void method3876(int arg0, int arg1) {
        this.field2647[arg0] = arg1;
        this.field2639[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("hw.au(Lhh;I)I")
    public int method3919(class217 arg0) {
        int var2 = (arg0.field2658 * arg0.field2649 >> 12) + arg0.field2657;
        int var3 = ((this.field2631[arg0.field2650] - 8192) * this.field2624[arg0.field2650] >> 12) + var2;
        class214 var4 = arg0.field2651;
        if (var4.field2612 > 0 && (var4.field2611 > 0 || this.field2632[arg0.field2650] > 0)) {
            int var5 = var4.field2611 << 2;
            int var6 = var4.field2613 << 1;
            if (arg0.field2665 < var6) {
                var5 = arg0.field2665 * var5 / var6;
            }
            int var7 = (this.field2632[arg0.field2650] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2666 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2660.field1525 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1562 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("hw.ay(Lhh;I)I")
    public int method3897(class217 arg0) {
        class214 var2 = arg0.field2651;
        int var3 = this.field2645[arg0.field2650] * this.field2627[arg0.field2650] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2655 * var4 + 16384 >> 15;
        int var6 = this.field2640 * var5 + 128 >> 8;
        if (var2.field2607 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2667 * 1.953125E-5D * (double) var2.field2607) + 0.5D);
        }
        if (var2.field2606 != null) {
            int var7 = arg0.field2661;
            int var8 = var2.field2606[arg0.field2662 + 1];
            if (arg0.field2662 < var2.field2606.length - 2) {
                int var9 = (var2.field2606[arg0.field2662] & 0xFF) << 8;
                int var10 = (var2.field2606[arg0.field2662 + 2] & 0xFF) << 8;
                var8 += (var2.field2606[arg0.field2662 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2663 > 0 && var2.field2609 != null) {
            int var11 = arg0.field2663;
            int var12 = var2.field2609[arg0.field2659 + 1];
            if (arg0.field2659 < var2.field2609.length - 2) {
                int var13 = (var2.field2609[arg0.field2659] & 0xFF) << 8;
                int var14 = (var2.field2609[arg0.field2659 + 2] & 0xFF) << 8;
                var12 += (var2.field2609[arg0.field2659 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("hw.at(Lhh;B)I")
    public int method3856(class217 arg0) {
        int var2 = this.field2626[arg0.field2650];
        return var2 < 8192 ? arg0.field2652 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2652) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("hw.w()Ldb;")
    public synchronized class119 method1984() {
        return this.field2648;
    }

    @ObfuscatedName("hw.t()Ldb;")
    public synchronized class119 method1985() {
        return null;
    }

    @ObfuscatedName("hw.d()I")
    public synchronized int method1986() {
        return 0;
    }

    @ObfuscatedName("hw.z([III)V")
    public synchronized void method1999(int[] arg0, int arg1, int arg2) {
        if (this.field2642.method3984()) {
            int var4 = this.field2641 * this.field2642.field2684 / Statics.field1562;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2646;
                if (this.field2634 - var5 >= 0L) {
                    this.field2646 = var5;
                    break;
                }
                int var7 = (int) ((this.field2634 - this.field2646 + (long) var4 - 1L) / (long) var4);
                this.field2646 += (long) var4 * (long) var7;
                this.field2648.method1999(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3874();
            } while (this.field2642.method3984());
        }
        this.field2648.method1999(arg0, arg1, arg2);
    }

    @ObfuscatedName("hw.c(I)V")
    public synchronized void method1989(int arg0) {
        if (this.field2642.method3984()) {
            int var2 = this.field2641 * this.field2642.field2684 / Statics.field1562;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2646;
                if (this.field2634 - var3 >= 0L) {
                    this.field2646 = var3;
                    break;
                }
                int var5 = (int) ((this.field2634 - this.field2646 + (long) var2 - 1L) / (long) var2);
                this.field2646 += (long) var2 * (long) var5;
                this.field2648.method1989(var5);
                arg0 -= var5;
                this.method3874();
            } while (this.field2642.method3984());
        }
        this.field2648.method1989(arg0);
    }

    @ObfuscatedName("hw.ac(I)V")
    public void method3874() {
        int var1 = this.field2644;
        int var2 = this.field2638;
        long var3 = this.field2634;
        while (this.field2638 == var2) {
            while (this.field2642.field2675[var1] == var2) {
                this.field2642.method4001(var1);
                int var5 = this.field2642.method3958(var1);
                if (var5 == 1) {
                    this.field2642.method3972();
                    this.field2642.method3964(var1);
                    if (this.field2642.method3973()) {
                        if (!this.field2643 || var2 == 0) {
                            this.method3893();
                            this.field2642.method3960();
                            return;
                        }
                        this.field2642.method3961(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3875(var5);
                }
                this.field2642.method3966(var1);
                this.field2642.method3964(var1);
            }
            var1 = this.field2642.method3971();
            var2 = this.field2642.field2675[var1];
            var3 = this.field2642.method3970(var2);
        }
        this.field2644 = var1;
        this.field2638 = var2;
        this.field2634 = var3;
    }

    @ObfuscatedName("hw.bj(Lhh;S)Z")
    public boolean method3882(class217 arg0) {
        if (arg0.field2668 != null) {
            return false;
        }
        if (arg0.field2663 >= 0) {
            arg0.method3740();
            if (arg0.field2653 > 0 && this.field2629[arg0.field2650][arg0.field2653] == arg0) {
                this.field2629[arg0.field2650][arg0.field2653] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("hw.bo(Lhh;[IIII)Z")
    public boolean method3883(class217 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2670 = Statics.field1562 / 100;
        if (arg0.field2663 >= 0 && arg0.field2668 == null || arg0.field2668.method2241()) {
            arg0.method3957();
            arg0.method3740();
            if (arg0.field2653 > 0 && this.field2629[arg0.field2650][arg0.field2653] == arg0) {
                this.field2629[arg0.field2650][arg0.field2653] = null;
            }
            return true;
        }
        int var5 = arg0.field2649;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2633[arg0.field2650] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2649 = var6;
        }
        arg0.field2668.method2348(this.method3919(arg0));
        class214 var7 = arg0.field2651;
        boolean var8 = false;
        arg0.field2665++;
        arg0.field2666 += var7.field2612;
        double var9 = (double) ((arg0.field2654 - 60 << 8) + (arg0.field2658 * arg0.field2649 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2607 > 0) {
            if (var7.field2610 > 0) {
                arg0.field2667 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2610 * var9) + 0.5D);
            } else {
                arg0.field2667 += 128;
            }
        }
        if (var7.field2606 != null) {
            if (var7.field2608 > 0) {
                arg0.field2661 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2608 * var9) + 0.5D);
            } else {
                arg0.field2661 += 128;
            }
            while (arg0.field2662 < var7.field2606.length - 2 && arg0.field2661 > (var7.field2606[arg0.field2662 + 2] & 0xFF) << 8) {
                arg0.field2662 += 2;
            }
            if (arg0.field2662 == var7.field2606.length - 2 && var7.field2606[arg0.field2662 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2663 >= 0 && var7.field2609 != null && (this.field2628[arg0.field2650] & 0x1) == 0 && (arg0.field2653 < 0 || this.field2629[arg0.field2650][arg0.field2653] != arg0)) {
            if (var7.field2605 > 0) {
                arg0.field2663 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2605 * var9) + 0.5D);
            } else {
                arg0.field2663 += 128;
            }
            while (arg0.field2659 < var7.field2609.length - 2 && arg0.field2663 > (var7.field2609[arg0.field2659 + 2] & 0xFF) << 8) {
                arg0.field2659 += 2;
            }
            if (arg0.field2659 == var7.field2609.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2668.method2270(arg0.field2670, this.method3897(arg0), this.method3856(arg0));
            return false;
        }
        arg0.field2668.method2319(arg0.field2670);
        if (arg1 == null) {
            arg0.field2668.method1989(arg3);
        } else {
            arg0.field2668.method1999(arg1, arg2, arg3);
        }
        if (arg0.field2668.method2364()) {
            this.field2648.field2696.method1992(arg0.field2668);
        }
        arg0.method3957();
        if (arg0.field2663 >= 0) {
            arg0.method3740();
            if (arg0.field2653 > 0 && this.field2629[arg0.field2650][arg0.field2653] == arg0) {
                this.field2629[arg0.field2650][arg0.field2653] = null;
            }
        }
        return true;
    }
}
