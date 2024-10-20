package deob;

@ObfuscatedName("hq")
public class class216 extends class117 {

    @ObfuscatedName("hq.p")
    public class202 field2620 = new class202(128);

    @ObfuscatedName("hq.i")
    public int field2618 = 256;

    @ObfuscatedName("hq.s")
    public int field2604 = 1000000;

    @ObfuscatedName("hq.j")
    public int[] field2605 = new int[16];

    @ObfuscatedName("hq.a")
    public int[] field2611 = new int[16];

    @ObfuscatedName("hq.t")
    public int[] field2612 = new int[16];

    @ObfuscatedName("hq.r")
    public int[] field2608 = new int[16];

    @ObfuscatedName("hq.m")
    public int[] field2603 = new int[16];

    @ObfuscatedName("hq.h")
    public int[] field2610 = new int[16];

    @ObfuscatedName("hq.o")
    public int[] field2631 = new int[16];

    @ObfuscatedName("hq.x")
    public int[] field2606 = new int[16];

    @ObfuscatedName("hq.q")
    public int[] field2613 = new int[16];

    @ObfuscatedName("hq.k")
    public int[] field2602 = new int[16];

    @ObfuscatedName("hq.e")
    public int[] field2617 = new int[16];

    @ObfuscatedName("hq.u")
    public int[] field2629 = new int[16];

    @ObfuscatedName("hq.g")
    public int[] field2619 = new int[16];

    @ObfuscatedName("hq.z")
    public int[] field2607 = new int[16];

    @ObfuscatedName("hq.b")
    public int[] field2621 = new int[16];

    @ObfuscatedName("hq.c")
    public class217[][] field2622 = new class217[16][128];

    @ObfuscatedName("hq.aa")
    public class217[][] field2623 = new class217[16][128];

    @ObfuscatedName("hq.ap")
    public class218 field2624 = new class218();

    @ObfuscatedName("hq.ao")
    public boolean field2625;

    @ObfuscatedName("hq.ar")
    public int field2626;

    @ObfuscatedName("hq.ay")
    public int field2627;

    @ObfuscatedName("hq.ax")
    public long field2628;

    @ObfuscatedName("hq.ae")
    public long field2609;

    @ObfuscatedName("hq.ah")
    public class220 field2630 = new class220(this);

    public class216() {
        this.method3686();
    }

    @ObfuscatedName("hq.p(II)V")
    public synchronized void method3667(int arg0) {
        this.field2618 = arg0;
    }

    @ObfuscatedName("hq.i(I)I")
    public int method3668() {
        return this.field2618;
    }

    @ObfuscatedName("hq.w(Lhk;Lik;Lde;II)Z")
    public synchronized boolean method3753(class221 arg0, class247 arg1, class110 arg2, int arg3) {
        arg0.method3844();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class211 var7 = (class211) arg0.field2683.method3520(); var7 != null; var7 = (class211) arg0.field2683.method3516()) {
            int var8 = (int) var7.field2563;
            class219 var9 = (class219) this.field2620.method3517((long) var8);
            if (var9 == null) {
                var9 = class219.method1901(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field2620.method3518(var9, (long) var8);
            }
            if (!var9.method3827(arg2, var7.field2577, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3845();
        }
        return var5;
    }

    @ObfuscatedName("hq.s(B)V")
    public synchronized void method3740() {
        for (class219 var1 = (class219) this.field2620.method3520(); var1 != null; var1 = (class219) this.field2620.method3516()) {
            var1.method3828();
        }
    }

    @ObfuscatedName("hq.j(I)V")
    public synchronized void method3705() {
        for (class219 var1 = (class219) this.field2620.method3520(); var1 != null; var1 = (class219) this.field2620.method3516()) {
            var1.method3561();
        }
    }

    @ObfuscatedName("hq.h(Lhk;ZB)V")
    public synchronized void method3672(class221 arg0, boolean arg1) {
        this.method3673();
        this.field2624.method3791(arg0.field2682);
        this.field2625 = arg1;
        this.field2628 = 0L;
        int var3 = this.field2624.method3779();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2624.method3780(var4);
            this.field2624.method3783(var4);
            this.field2624.method3781(var4);
        }
        this.field2626 = this.field2624.method3787();
        this.field2627 = this.field2624.field2657[this.field2626];
        this.field2609 = this.field2624.method3792(this.field2627);
    }

    @ObfuscatedName("hq.x(I)V")
    public synchronized void method3673() {
        this.field2624.method3777();
        this.method3686();
    }

    @ObfuscatedName("hq.q(I)Z")
    public synchronized boolean method3674() {
        return this.field2624.method3778();
    }

    @ObfuscatedName("hq.d(III)V")
    public synchronized void method3675(int arg0, int arg1) {
        this.method3676(arg0, arg1);
    }

    @ObfuscatedName("hq.l(III)V")
    public void method3676(int arg0, int arg1) {
        this.field2608[arg0] = arg1;
        this.field2610[arg0] = arg1 & 0xFFFFFF80;
        this.method3666(arg0, arg1);
    }

    @ObfuscatedName("hq.f(IIB)V")
    public void method3666(int arg0, int arg1) {
        if (this.field2603[arg0] != arg1) {
            this.field2603[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2623[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("hq.k(IIII)V")
    public void method3670(int arg0, int arg1, int arg2) {
        this.method3680(arg0, arg1, 64);
        if ((this.field2602[arg0] & 0x2) != 0) {
            for (class217 var4 = (class217) this.field2630.field2677.method3573(); var4 != null; var4 = (class217) this.field2630.field2677.method3574()) {
                if (var4.field2649 == arg0 && var4.field2632 < 0) {
                    this.field2622[arg0][var4.field2637] = null;
                    this.field2622[arg0][arg1] = var4;
                    int var5 = (var4.field2642 * var4.field2641 >> 12) + var4.field2640;
                    var4.field2640 += arg1 - var4.field2637 << 8;
                    var4.field2641 = var5 - var4.field2640;
                    var4.field2642 = 4096;
                    var4.field2637 = arg1;
                    return;
                }
            }
        }
        class219 var6 = (class219) this.field2620.method3517((long) this.field2603[arg0]);
        if (var6 == null) {
            return;
        }
        class105 var7 = var6.field2670[arg1];
        if (var7 == null) {
            return;
        }
        class217 var8 = new class217();
        var8.field2649 = arg0;
        var8.field2652 = var6;
        var8.field2634 = var7;
        var8.field2635 = var6.field2672[arg1];
        var8.field2636 = var6.field2673[arg1];
        var8.field2637 = arg1;
        var8.field2638 = var6.field2669 * arg2 * arg2 * var6.field2667[arg1] + 1024 >> 11;
        var8.field2639 = var6.field2671[arg1] & 0xFF;
        var8.field2640 = (arg1 << 8) - (var6.field2675[arg1] & 0x7FFF);
        var8.field2643 = 0;
        var8.field2644 = 0;
        var8.field2645 = 0;
        var8.field2632 = -1;
        var8.field2633 = 0;
        if (this.field2619[arg0] == 0) {
            var8.field2650 = class115.method2244(var7, this.method3691(var8), this.method3692(var8), this.method3693(var8));
        } else {
            var8.field2650 = class115.method2244(var7, this.method3691(var8), 0, this.method3693(var8));
            this.method3697(var8, var6.field2675[arg1] < 0);
        }
        if (var6.field2675[arg1] < 0) {
            var8.field2650.method2126(-1);
        }
        if (var8.field2636 >= 0) {
            class217 var9 = this.field2623[arg0][var8.field2636];
            if (var9 != null && var9.field2632 < 0) {
                this.field2622[arg0][var9.field2637] = null;
                var9.field2632 = 0;
            }
            this.field2623[arg0][var8.field2636] = var8;
        }
        this.field2630.field2677.method3572(var8);
        this.field2622[arg0][arg1] = var8;
    }

    @ObfuscatedName("hq.e(Lhz;ZI)V")
    public void method3697(class217 arg0, boolean arg1) {
        int var3 = arg0.field2634.field1501.length;
        int var5;
        if (arg1 && arg0.field2634.field1504) {
            int var4 = var3 + var3 - arg0.field2634.field1502;
            var5 = (int) ((long) this.field2619[arg0.field2649] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2650.method2133(true);
            }
        } else {
            var5 = (int) ((long) this.field2619[arg0.field2649] * (long) var3 >> 6);
        }
        arg0.field2650.method2132(var5);
    }

    @ObfuscatedName("hq.u(IIII)V")
    public void method3680(int arg0, int arg1, int arg2) {
        class217 var4 = this.field2622[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2622[arg0][arg1] = null;
        if ((this.field2602[arg0] & 0x2) == 0) {
            var4.field2632 = 0;
            return;
        }
        for (class217 var5 = (class217) this.field2630.field2677.method3581(); var5 != null; var5 = (class217) this.field2630.field2677.method3597()) {
            if (var4.field2649 == var5.field2649 && var5.field2632 < 0 && var4 != var5) {
                var4.field2632 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("hq.z(IIIB)V")
    public void method3763(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("hq.ae(III)V")
    public void method3682(int arg0, int arg1) {
    }

    @ObfuscatedName("hq.ah(III)V")
    public void method3677(int arg0, int arg1) {
        this.field2631[arg0] = arg1;
    }

    @ObfuscatedName("hq.ai(IB)V")
    public void method3696(int arg0) {
        for (class217 var2 = (class217) this.field2630.field2677.method3581(); var2 != null; var2 = (class217) this.field2630.field2677.method3597()) {
            if (arg0 < 0 || var2.field2649 == arg0) {
                if (var2.field2650 != null) {
                    var2.field2650.method2136(Statics.field311 / 100);
                    if (var2.field2650.method2140()) {
                        this.field2630.field2680.method1938(var2.field2650);
                    }
                    var2.method3769();
                }
                if (var2.field2632 < 0) {
                    this.field2622[var2.field2649][var2.field2637] = null;
                }
                var2.method3561();
            }
        }
    }

    @ObfuscatedName("hq.au(II)V")
    public void method3756(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3756(var2);
            }
            return;
        }
        this.field2605[arg0] = 12800;
        this.field2611[arg0] = 8192;
        this.field2612[arg0] = 16383;
        this.field2631[arg0] = 8192;
        this.field2606[arg0] = 0;
        this.field2613[arg0] = 8192;
        this.method3724(arg0);
        this.method3688(arg0);
        this.field2602[arg0] = 0;
        this.field2617[arg0] = 32767;
        this.field2629[arg0] = 256;
        this.field2619[arg0] = 0;
        this.method3690(arg0, 8192);
    }

    @ObfuscatedName("hq.am(IB)V")
    public void method3700(int arg0) {
        for (class217 var2 = (class217) this.field2630.field2677.method3581(); var2 != null; var2 = (class217) this.field2630.field2677.method3597()) {
            if ((arg0 < 0 || var2.field2649 == arg0) && var2.field2632 < 0) {
                this.field2622[var2.field2649][var2.field2637] = null;
                var2.field2632 = 0;
            }
        }
    }

    @ObfuscatedName("hq.af(I)V")
    public void method3686() {
        this.method3696(-1);
        this.method3756(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2603[var1] = this.field2608[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2610[var2] = this.field2608[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("hq.av(II)V")
    public void method3724(int arg0) {
        if ((this.field2602[arg0] & 0x2) == 0) {
            return;
        }
        for (class217 var2 = (class217) this.field2630.field2677.method3581(); var2 != null; var2 = (class217) this.field2630.field2677.method3597()) {
            if (var2.field2649 == arg0 && this.field2622[arg0][var2.field2637] == null && var2.field2632 < 0) {
                var2.field2632 = 0;
            }
        }
    }

    @ObfuscatedName("hq.aw(II)V")
    public void method3688(int arg0) {
        if ((this.field2602[arg0] & 0x4) == 0) {
            return;
        }
        for (class217 var2 = (class217) this.field2630.field2677.method3581(); var2 != null; var2 = (class217) this.field2630.field2677.method3597()) {
            if (var2.field2649 == arg0) {
                var2.field2647 = 0;
            }
        }
    }

    @ObfuscatedName("hq.ad(II)V")
    public void method3689(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3680(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3670(var6, var7, var8);
            } else {
                this.method3680(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3763(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2610[var12] = (var14 << 14) + (this.field2610[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2610[var12] = (var14 << 7) + (this.field2610[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2606[var12] = (var14 << 7) + (this.field2606[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2606[var12] = (this.field2606[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2613[var12] = (var14 << 7) + (this.field2613[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2613[var12] = (this.field2613[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2605[var12] = (var14 << 7) + (this.field2605[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2605[var12] = (this.field2605[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2611[var12] = (var14 << 7) + (this.field2611[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2611[var12] = (this.field2611[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2612[var12] = (var14 << 7) + (this.field2612[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2612[var12] = (this.field2612[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2602[var12] |= 0x1;
                } else {
                    this.field2602[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2602[var12] |= 0x2;
                } else {
                    this.method3724(var12);
                    this.field2602[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2617[var12] = (var14 << 7) + (this.field2617[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2617[var12] = (this.field2617[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2617[var12] = (var14 << 7) + (this.field2617[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2617[var12] = (this.field2617[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3696(var12);
            }
            if (var13 == 121) {
                this.method3756(var12);
            }
            if (var13 == 123) {
                this.method3700(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2617[var12];
                if (var15 == 16384) {
                    this.field2629[var12] = (var14 << 7) + (this.field2629[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2617[var12];
                if (var16 == 16384) {
                    this.field2629[var12] = (this.field2629[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2619[var12] = (var14 << 7) + (this.field2619[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2619[var12] = (this.field2619[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2602[var12] |= 0x4;
                } else {
                    this.method3688(var12);
                    this.field2602[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3690(var12, (var14 << 7) + (this.field2607[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3690(var12, (this.field2607[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3666(var17, this.field2610[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3682(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method3677(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3686();
            }
        }
    }

    @ObfuscatedName("hq.ab(III)V")
    public void method3690(int arg0, int arg1) {
        this.field2607[arg0] = arg1;
        this.field2621[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("hq.ac(Lhz;I)I")
    public int method3691(class217 arg0) {
        int var2 = (arg0.field2642 * arg0.field2641 >> 12) + arg0.field2640;
        int var3 = ((this.field2631[arg0.field2649] - 8192) * this.field2629[arg0.field2649] >> 12) + var2;
        class214 var4 = arg0.field2635;
        if (var4.field2589 > 0 && (var4.field2590 > 0 || this.field2606[arg0.field2649] > 0)) {
            int var5 = var4.field2590 << 2;
            int var6 = var4.field2582 << 1;
            if (arg0.field2648 < var6) {
                var5 = arg0.field2648 * var5 / var6;
            }
            int var7 = (this.field2606[arg0.field2649] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2646 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2634.field1503 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field311 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("hq.ak(Lhz;I)I")
    public int method3692(class217 arg0) {
        class214 var2 = arg0.field2635;
        int var3 = this.field2612[arg0.field2649] * this.field2605[arg0.field2649] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2638 * var4 + 16384 >> 15;
        int var6 = this.field2618 * var5 + 128 >> 8;
        if (var2.field2588 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2643 * 1.953125E-5D * (double) var2.field2588) + 0.5D);
        }
        if (var2.field2586 != null) {
            int var7 = arg0.field2644;
            int var8 = var2.field2586[arg0.field2645 + 1];
            if (arg0.field2645 < var2.field2586.length - 2) {
                int var9 = (var2.field2586[arg0.field2645] & 0xFF) << 8;
                int var10 = (var2.field2586[arg0.field2645 + 2] & 0xFF) << 8;
                var8 += (var2.field2586[arg0.field2645 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2632 > 0 && var2.field2583 != null) {
            int var11 = arg0.field2632;
            int var12 = var2.field2583[arg0.field2633 + 1];
            if (arg0.field2633 < var2.field2583.length - 2) {
                int var13 = (var2.field2583[arg0.field2633] & 0xFF) << 8;
                int var14 = (var2.field2583[arg0.field2633 + 2] & 0xFF) << 8;
                var12 += (var2.field2583[arg0.field2633 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("hq.az(Lhz;B)I")
    public int method3693(class217 arg0) {
        int var2 = this.field2611[arg0.field2649];
        return var2 < 8192 ? arg0.field2639 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2639) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("hq.a()Ldj;")
    public synchronized class117 method1915() {
        return this.field2630;
    }

    @ObfuscatedName("hq.t()Ldj;")
    public synchronized class117 method1909() {
        return null;
    }

    @ObfuscatedName("hq.r()I")
    public synchronized int method1910() {
        return 0;
    }

    @ObfuscatedName("hq.m([III)V")
    public synchronized void method1923(int[] arg0, int arg1, int arg2) {
        if (this.field2624.method3778()) {
            int var4 = this.field2604 * this.field2624.field2654 / Statics.field311;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2628;
                if (this.field2609 - var5 >= 0L) {
                    this.field2628 = var5;
                    break;
                }
                int var7 = (int) ((this.field2609 - this.field2628 + (long) var4 - 1L) / (long) var4);
                this.field2628 += (long) var4 * (long) var7;
                this.field2630.method1923(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3694();
            } while (this.field2624.method3778());
        }
        this.field2630.method1923(arg0, arg1, arg2);
    }

    @ObfuscatedName("hq.o(I)V")
    public synchronized void method1913(int arg0) {
        if (this.field2624.method3778()) {
            int var2 = this.field2604 * this.field2624.field2654 / Statics.field311;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2628;
                if (this.field2609 - var3 >= 0L) {
                    this.field2628 = var3;
                    break;
                }
                int var5 = (int) ((this.field2609 - this.field2628 + (long) var2 - 1L) / (long) var2);
                this.field2628 += (long) var2 * (long) var5;
                this.field2630.method1913(var5);
                arg0 -= var5;
                this.method3694();
            } while (this.field2624.method3778());
        }
        this.field2630.method1913(arg0);
    }

    @ObfuscatedName("hq.as(B)V")
    public void method3694() {
        int var1 = this.field2626;
        int var2 = this.field2627;
        long var3 = this.field2609;
        while (this.field2627 == var2) {
            while (this.field2624.field2657[var1] == var2) {
                this.field2624.method3780(var1);
                int var5 = this.field2624.method3784(var1);
                if (var5 == 1) {
                    this.field2624.method3818();
                    this.field2624.method3781(var1);
                    if (this.field2624.method3788()) {
                        if (!this.field2625 || var2 == 0) {
                            this.method3686();
                            this.field2624.method3777();
                            return;
                        }
                        this.field2624.method3822(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3689(var5);
                }
                this.field2624.method3783(var1);
                this.field2624.method3781(var1);
            }
            var1 = this.field2624.method3787();
            var2 = this.field2624.field2657[var1];
            var3 = this.field2624.method3792(var2);
        }
        this.field2626 = var1;
        this.field2627 = var2;
        this.field2609 = var3;
    }

    @ObfuscatedName("hq.at(Lhz;B)Z")
    public boolean method3695(class217 arg0) {
        if (arg0.field2650 != null) {
            return false;
        }
        if (arg0.field2632 >= 0) {
            arg0.method3561();
            if (arg0.field2636 > 0 && this.field2623[arg0.field2649][arg0.field2636] == arg0) {
                this.field2623[arg0.field2649][arg0.field2636] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("hq.aj(Lhz;[IIII)Z")
    public boolean method3746(class217 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2651 = Statics.field311 / 100;
        if (arg0.field2632 >= 0 && arg0.field2650 == null || arg0.field2650.method2139()) {
            arg0.method3769();
            arg0.method3561();
            if (arg0.field2636 > 0 && this.field2623[arg0.field2649][arg0.field2636] == arg0) {
                this.field2623[arg0.field2649][arg0.field2636] = null;
            }
            return true;
        }
        int var5 = arg0.field2642;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2613[arg0.field2649] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2642 = var6;
        }
        arg0.field2650.method2137(this.method3691(arg0));
        class214 var7 = arg0.field2635;
        boolean var8 = false;
        arg0.field2648++;
        arg0.field2646 += var7.field2589;
        double var9 = (double) ((arg0.field2637 - 60 << 8) + (arg0.field2642 * arg0.field2641 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2588 > 0) {
            if (var7.field2587 > 0) {
                arg0.field2643 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2587 * var9) + 0.5D);
            } else {
                arg0.field2643 += 128;
            }
        }
        if (var7.field2586 != null) {
            if (var7.field2585 > 0) {
                arg0.field2644 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2585 * var9) + 0.5D);
            } else {
                arg0.field2644 += 128;
            }
            while (arg0.field2645 < var7.field2586.length - 2 && arg0.field2644 > (var7.field2586[arg0.field2645 + 2] & 0xFF) << 8) {
                arg0.field2645 += 2;
            }
            if (arg0.field2645 == var7.field2586.length - 2 && var7.field2586[arg0.field2645 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2632 >= 0 && var7.field2583 != null && (this.field2602[arg0.field2649] & 0x1) == 0 && (arg0.field2636 < 0 || this.field2623[arg0.field2649][arg0.field2636] != arg0)) {
            if (var7.field2584 > 0) {
                arg0.field2632 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2584 * var9) + 0.5D);
            } else {
                arg0.field2632 += 128;
            }
            while (arg0.field2633 < var7.field2583.length - 2 && arg0.field2632 > (var7.field2583[arg0.field2633 + 2] & 0xFF) << 8) {
                arg0.field2633 += 2;
            }
            if (arg0.field2633 == var7.field2583.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2650.method2130(arg0.field2651, this.method3692(arg0), this.method3693(arg0));
            return false;
        }
        arg0.field2650.method2136(arg0.field2651);
        if (arg1 == null) {
            arg0.field2650.method1913(arg3);
        } else {
            arg0.field2650.method1923(arg1, arg2, arg3);
        }
        if (arg0.field2650.method2140()) {
            this.field2630.field2680.method1938(arg0.field2650);
        }
        arg0.method3769();
        if (arg0.field2632 >= 0) {
            arg0.method3561();
            if (arg0.field2636 > 0 && this.field2623[arg0.field2649][arg0.field2636] == arg0) {
                this.field2623[arg0.field2649][arg0.field2636] = null;
            }
        }
        return true;
    }
}
