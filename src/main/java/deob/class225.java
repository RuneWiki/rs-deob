package deob;

@ObfuscatedName("ho")
public class class225 extends class117 {

    @ObfuscatedName("ho.b")
    public class211 field2675 = new class211(128);

    @ObfuscatedName("ho.q")
    public int field2652 = 256;

    @ObfuscatedName("ho.o")
    public int field2653 = 1000000;

    @ObfuscatedName("ho.p")
    public int[] field2654 = new int[16];

    @ObfuscatedName("ho.a")
    public int[] field2655 = new int[16];

    @ObfuscatedName("ho.h")
    public int[] field2671 = new int[16];

    @ObfuscatedName("ho.l")
    public int[] field2657 = new int[16];

    @ObfuscatedName("ho.y")
    public int[] field2658 = new int[16];

    @ObfuscatedName("ho.g")
    public int[] field2659 = new int[16];

    @ObfuscatedName("ho.c")
    public int[] field2660 = new int[16];

    @ObfuscatedName("ho.u")
    public int[] field2661 = new int[16];

    @ObfuscatedName("ho.r")
    public int[] field2673 = new int[16];

    @ObfuscatedName("ho.w")
    public int[] field2662 = new int[16];

    @ObfuscatedName("ho.j")
    public int[] field2665 = new int[16];

    @ObfuscatedName("ho.z")
    public int[] field2680 = new int[16];

    @ObfuscatedName("ho.e")
    public int[] field2667 = new int[16];

    @ObfuscatedName("ho.k")
    public int[] field2668 = new int[16];

    @ObfuscatedName("ho.n")
    public int[] field2669 = new int[16];

    @ObfuscatedName("ho.i")
    public class226[][] field2670 = new class226[16][128];

    @ObfuscatedName("ho.av")
    public class226[][] field2674 = new class226[16][128];

    @ObfuscatedName("ho.ao")
    public class227 field2672 = new class227();

    @ObfuscatedName("ho.am")
    public boolean field2681;

    @ObfuscatedName("ho.aj")
    public int field2656;

    @ObfuscatedName("ho.ah")
    public int field2666;

    @ObfuscatedName("ho.af")
    public long field2676;

    @ObfuscatedName("ho.ai")
    public long field2677;

    @ObfuscatedName("ho.aq")
    public class229 field2678 = new class229(this);

    public class225() {
        this.method3842();
    }

    @ObfuscatedName("ho.b(II)V")
    public synchronized void method3822(int arg0) {
        this.field2652 = arg0;
    }

    @ObfuscatedName("ho.q(I)I")
    public int method3823() {
        return this.field2652;
    }

    @ObfuscatedName("ho.o(Lhv;Lie;Ldo;II)Z")
    public synchronized boolean method3824(class230 arg0, class256 arg1, class110 arg2, int arg3) {
        arg0.method4000();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class220 var7 = (class220) arg0.field2730.method3677(); var7 != null; var7 = (class220) arg0.field2730.method3678()) {
            int var8 = (int) var7.field2613;
            class228 var9 = (class228) this.field2675.method3674((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method4167(var8);
                class228 var11;
                if (var10 == null) {
                    var11 = null;
                } else {
                    var11 = new class228(var10);
                }
                var9 = var11;
                if (var11 == null) {
                    var5 = false;
                    continue;
                }
                this.field2675.method3675(var11, (long) var8);
            }
            if (!var9.method3992(arg2, var7.field2627, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method4001();
        }
        return var5;
    }

    @ObfuscatedName("ho.p(B)V")
    public synchronized void method3910() {
        for (class228 var1 = (class228) this.field2675.method3677(); var1 != null; var1 = (class228) this.field2675.method3678()) {
            var1.method3987();
        }
    }

    @ObfuscatedName("ho.a(B)V")
    public synchronized void method3826() {
        for (class228 var1 = (class228) this.field2675.method3677(); var1 != null; var1 = (class228) this.field2675.method3678()) {
            var1.method3726();
        }
    }

    @ObfuscatedName("ho.c(Lhv;ZI)V")
    public synchronized void method3883(class230 arg0, boolean arg1) {
        this.method3828();
        this.field2672.method3971(arg0.field2729);
        this.field2681 = arg1;
        this.field2676 = 0L;
        int var3 = this.field2672.method3936();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2672.method3982(var4);
            this.field2672.method3940(var4);
            this.field2672.method3980(var4);
        }
        this.field2656 = this.field2672.method3945();
        this.field2666 = this.field2672.field2707[this.field2656];
        this.field2677 = this.field2672.method3948(this.field2666);
    }

    @ObfuscatedName("ho.t(I)V")
    public synchronized void method3828() {
        this.field2672.method3934();
        this.method3842();
    }

    @ObfuscatedName("ho.f(S)Z")
    public synchronized boolean method3855() {
        return this.field2672.method3935();
    }

    @ObfuscatedName("ho.m(IIB)V")
    public synchronized void method3830(int arg0, int arg1) {
        this.method3831(arg0, arg1);
    }

    @ObfuscatedName("ho.x(IIB)V")
    public void method3831(int arg0, int arg1) {
        this.field2657[arg0] = arg1;
        this.field2659[arg0] = arg1 & 0xFFFFFF80;
        this.method3832(arg0, arg1);
    }

    @ObfuscatedName("ho.w(III)V")
    public void method3832(int arg0, int arg1) {
        if (this.field2658[arg0] != arg1) {
            this.field2658[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2674[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("ho.j(IIII)V")
    public void method3833(int arg0, int arg1, int arg2) {
        this.method3821(arg0, arg1, 64);
        if ((this.field2662[arg0] & 0x2) != 0) {
            for (class226 var4 = (class226) this.field2678.field2726.method3733(); var4 != null; var4 = (class226) this.field2678.field2726.method3742()) {
                if (var4.field2695 == arg0 && var4.field2696 < 0) {
                    this.field2670[arg0][var4.field2687] = null;
                    this.field2670[arg0][arg1] = var4;
                    int var5 = (var4.field2692 * var4.field2685 >> 12) + var4.field2688;
                    var4.field2688 += arg1 - var4.field2687 << 8;
                    var4.field2685 = var5 - var4.field2688;
                    var4.field2692 = 4096;
                    var4.field2687 = arg1;
                    return;
                }
            }
        }
        class228 var6 = (class228) this.field2675.method3674((long) this.field2658[arg0]);
        if (var6 == null) {
            return;
        }
        class105 var7 = var6.field2718[arg1];
        if (var7 == null) {
            return;
        }
        class226 var8 = new class226();
        var8.field2695 = arg0;
        var8.field2683 = var6;
        var8.field2684 = var7;
        var8.field2690 = var6.field2722[arg1];
        var8.field2686 = var6.field2724[arg1];
        var8.field2687 = arg1;
        var8.field2682 = var6.field2717 * arg2 * arg2 * var6.field2720[arg1] + 1024 >> 11;
        var8.field2689 = var6.field2723[arg1] & 0xFF;
        var8.field2688 = (arg1 << 8) - (var6.field2719[arg1] & 0x7FFF);
        var8.field2693 = 0;
        var8.field2694 = 0;
        var8.field2701 = 0;
        var8.field2696 = -1;
        var8.field2697 = 0;
        if (this.field2667[arg0] == 0) {
            var8.field2700 = class115.method2144(var7, this.method3847(var8), this.method3848(var8), this.method3849(var8));
        } else {
            var8.field2700 = class115.method2144(var7, this.method3847(var8), 0, this.method3849(var8));
            this.method3834(var8, var6.field2719[arg1] < 0);
        }
        if (var6.field2719[arg1] < 0) {
            var8.field2700.method2146(-1);
        }
        if (var8.field2686 >= 0) {
            class226 var9 = this.field2674[arg0][var8.field2686];
            if (var9 != null && var9.field2696 < 0) {
                this.field2670[arg0][var9.field2687] = null;
                var9.field2696 = 0;
            }
            this.field2674[arg0][var8.field2686] = var8;
        }
        this.field2678.field2726.method3741(var8);
        this.field2670[arg0][arg1] = var8;
    }

    @ObfuscatedName("ho.z(Lhs;ZB)V")
    public void method3834(class226 arg0, boolean arg1) {
        int var3 = arg0.field2684.field1495.length;
        int var5;
        if (arg1 && arg0.field2684.field1498) {
            int var4 = var3 + var3 - arg0.field2684.field1496;
            var5 = (int) ((long) this.field2667[arg0.field2695] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2700.method2152(true);
            }
        } else {
            var5 = (int) ((long) this.field2667[arg0.field2695] * (long) var3 >> 6);
        }
        arg0.field2700.method2172(var5);
    }

    @ObfuscatedName("ho.e(IIII)V")
    public void method3821(int arg0, int arg1, int arg2) {
        class226 var4 = this.field2670[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2670[arg0][arg1] = null;
        if ((this.field2662[arg0] & 0x2) == 0) {
            var4.field2696 = 0;
            return;
        }
        for (class226 var5 = (class226) this.field2678.field2726.method3739(); var5 != null; var5 = (class226) this.field2678.field2726.method3745()) {
            if (var4.field2695 == var5.field2695 && var5.field2696 < 0 && var4 != var5) {
                var4.field2696 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("ho.k(IIIB)V")
    public void method3836(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("ho.ao(III)V")
    public void method3837(int arg0, int arg1) {
    }

    @ObfuscatedName("ho.am(IIB)V")
    public void method3903(int arg0, int arg1) {
        this.field2660[arg0] = arg1;
    }

    @ObfuscatedName("ho.aj(II)V")
    public void method3839(int arg0) {
        for (class226 var2 = (class226) this.field2678.field2726.method3739(); var2 != null; var2 = (class226) this.field2678.field2726.method3745()) {
            if (arg0 < 0 || var2.field2695 == arg0) {
                if (var2.field2700 != null) {
                    var2.field2700.method2157(Statics.field1523 / 100);
                    if (var2.field2700.method2161()) {
                        this.field2678.field2727.method1918(var2.field2700);
                    }
                    var2.method3927();
                }
                if (var2.field2696 < 0) {
                    this.field2670[var2.field2695][var2.field2687] = null;
                }
                var2.method3726();
            }
        }
    }

    @ObfuscatedName("ho.ah(IB)V")
    public void method3840(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3840(var2);
            }
            return;
        }
        this.field2654[arg0] = 12800;
        this.field2655[arg0] = 8192;
        this.field2671[arg0] = 16383;
        this.field2660[arg0] = 8192;
        this.field2661[arg0] = 0;
        this.field2673[arg0] = 8192;
        this.method3913(arg0);
        this.method3844(arg0);
        this.field2662[arg0] = 0;
        this.field2665[arg0] = 32767;
        this.field2680[arg0] = 256;
        this.field2667[arg0] = 0;
        this.method3846(arg0, 8192);
    }

    @ObfuscatedName("ho.af(IB)V")
    public void method3897(int arg0) {
        for (class226 var2 = (class226) this.field2678.field2726.method3739(); var2 != null; var2 = (class226) this.field2678.field2726.method3745()) {
            if ((arg0 < 0 || var2.field2695 == arg0) && var2.field2696 < 0) {
                this.field2670[var2.field2695][var2.field2687] = null;
                var2.field2696 = 0;
            }
        }
    }

    @ObfuscatedName("ho.ai(I)V")
    public void method3842() {
        this.method3839(-1);
        this.method3840(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2658[var1] = this.field2657[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2659[var2] = this.field2657[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("ho.ad(II)V")
    public void method3913(int arg0) {
        if ((this.field2662[arg0] & 0x2) == 0) {
            return;
        }
        for (class226 var2 = (class226) this.field2678.field2726.method3739(); var2 != null; var2 = (class226) this.field2678.field2726.method3745()) {
            if (var2.field2695 == arg0 && this.field2670[arg0][var2.field2687] == null && var2.field2696 < 0) {
                var2.field2696 = 0;
            }
        }
    }

    @ObfuscatedName("ho.ay(IS)V")
    public void method3844(int arg0) {
        if ((this.field2662[arg0] & 0x4) == 0) {
            return;
        }
        for (class226 var2 = (class226) this.field2678.field2726.method3739(); var2 != null; var2 = (class226) this.field2678.field2726.method3745()) {
            if (var2.field2695 == arg0) {
                var2.field2702 = 0;
            }
        }
    }

    @ObfuscatedName("ho.at(II)V")
    public void method3856(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3821(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3833(var6, var7, var8);
            } else {
                this.method3821(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3836(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2659[var12] = (var14 << 14) + (this.field2659[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2659[var12] = (var14 << 7) + (this.field2659[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2661[var12] = (var14 << 7) + (this.field2661[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2661[var12] = (this.field2661[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2673[var12] = (var14 << 7) + (this.field2673[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2673[var12] = (this.field2673[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2654[var12] = (var14 << 7) + (this.field2654[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2654[var12] = (this.field2654[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2655[var12] = (var14 << 7) + (this.field2655[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2655[var12] = (this.field2655[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2671[var12] = (var14 << 7) + (this.field2671[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2671[var12] = (this.field2671[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2662[var12] |= 0x1;
                } else {
                    this.field2662[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2662[var12] |= 0x2;
                } else {
                    this.method3913(var12);
                    this.field2662[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2665[var12] = (var14 << 7) + (this.field2665[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2665[var12] = (this.field2665[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2665[var12] = (var14 << 7) + (this.field2665[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2665[var12] = (this.field2665[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3839(var12);
            }
            if (var13 == 121) {
                this.method3840(var12);
            }
            if (var13 == 123) {
                this.method3897(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2665[var12];
                if (var15 == 16384) {
                    this.field2680[var12] = (var14 << 7) + (this.field2680[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2665[var12];
                if (var16 == 16384) {
                    this.field2680[var12] = (this.field2680[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2667[var12] = (var14 << 7) + (this.field2667[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2667[var12] = (this.field2667[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2662[var12] |= 0x4;
                } else {
                    this.method3844(var12);
                    this.field2662[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3846(var12, (var14 << 7) + (this.field2668[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3846(var12, (this.field2668[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3832(var17, this.field2659[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3837(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method3903(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3842();
            }
        }
    }

    @ObfuscatedName("ho.aa(III)V")
    public void method3846(int arg0, int arg1) {
        this.field2668[arg0] = arg1;
        this.field2669[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("ho.an(Lhs;I)I")
    public int method3847(class226 arg0) {
        int var2 = (arg0.field2692 * arg0.field2685 >> 12) + arg0.field2688;
        int var3 = ((this.field2660[arg0.field2695] - 8192) * this.field2680[arg0.field2695] >> 12) + var2;
        class223 var4 = arg0.field2690;
        if (var4.field2641 > 0 && (var4.field2638 > 0 || this.field2661[arg0.field2695] > 0)) {
            int var5 = var4.field2638 << 2;
            int var6 = var4.field2640 << 1;
            if (arg0.field2698 < var6) {
                var5 = arg0.field2698 * var5 / var6;
            }
            int var7 = (this.field2661[arg0.field2695] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2691 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2684.field1497 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1523 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("ho.bh(Lhs;I)I")
    public int method3848(class226 arg0) {
        class223 var2 = arg0.field2690;
        int var3 = this.field2671[arg0.field2695] * this.field2654[arg0.field2695] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2682 * var4 + 16384 >> 15;
        int var6 = this.field2652 * var5 + 128 >> 8;
        if (var2.field2634 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2693 * 1.953125E-5D * (double) var2.field2634) + 0.5D);
        }
        if (var2.field2632 != null) {
            int var7 = arg0.field2694;
            int var8 = var2.field2632[arg0.field2701 + 1];
            if (arg0.field2701 < var2.field2632.length - 2) {
                int var9 = (var2.field2632[arg0.field2701] & 0xFF) << 8;
                int var10 = (var2.field2632[arg0.field2701 + 2] & 0xFF) << 8;
                var8 += (var2.field2632[arg0.field2701 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2696 > 0 && var2.field2636 != null) {
            int var11 = arg0.field2696;
            int var12 = var2.field2636[arg0.field2697 + 1];
            if (arg0.field2697 < var2.field2636.length - 2) {
                int var13 = (var2.field2636[arg0.field2697] & 0xFF) << 8;
                int var14 = (var2.field2636[arg0.field2697 + 2] & 0xFF) << 8;
                var12 += (var2.field2636[arg0.field2697 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("ho.bx(Lhs;I)I")
    public int method3849(class226 arg0) {
        int var2 = this.field2655[arg0.field2695];
        return var2 < 8192 ? arg0.field2689 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2689) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("ho.h()Ldn;")
    public synchronized class117 method1949() {
        return this.field2678;
    }

    @ObfuscatedName("ho.l()Ldn;")
    public synchronized class117 method1922() {
        return null;
    }

    @ObfuscatedName("ho.y()I")
    public synchronized int method1925() {
        return 0;
    }

    @ObfuscatedName("ho.g([III)V")
    public synchronized void method1926(int[] arg0, int arg1, int arg2) {
        if (this.field2672.method3935()) {
            int var4 = this.field2653 * this.field2672.field2710 / Statics.field1523;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2676;
                if (this.field2677 - var5 >= 0L) {
                    this.field2676 = var5;
                    break;
                }
                int var7 = (int) ((this.field2677 - this.field2676 + (long) var4 - 1L) / (long) var4);
                this.field2676 += (long) var4 * (long) var7;
                this.field2678.method1926(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3889();
            } while (this.field2672.method3935());
        }
        this.field2678.method1926(arg0, arg1, arg2);
    }

    @ObfuscatedName("ho.u(I)V")
    public synchronized void method1928(int arg0) {
        if (this.field2672.method3935()) {
            int var2 = this.field2653 * this.field2672.field2710 / Statics.field1523;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2676;
                if (this.field2677 - var3 >= 0L) {
                    this.field2676 = var3;
                    break;
                }
                int var5 = (int) ((this.field2677 - this.field2676 + (long) var2 - 1L) / (long) var2);
                this.field2676 += (long) var2 * (long) var5;
                this.field2678.method1928(var5);
                arg0 -= var5;
                this.method3889();
            } while (this.field2672.method3935());
        }
        this.field2678.method1928(arg0);
    }

    @ObfuscatedName("ho.bb(I)V")
    public void method3889() {
        int var1 = this.field2656;
        int var2 = this.field2666;
        long var3 = this.field2677;
        while (this.field2666 == var2) {
            while (this.field2672.field2707[var1] == var2) {
                this.field2672.method3982(var1);
                int var5 = this.field2672.method3941(var1);
                if (var5 == 1) {
                    this.field2672.method3937();
                    this.field2672.method3980(var1);
                    if (this.field2672.method3947()) {
                        if (!this.field2681 || var2 == 0) {
                            this.method3842();
                            this.field2672.method3934();
                            return;
                        }
                        this.field2672.method3963(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3856(var5);
                }
                this.field2672.method3940(var1);
                this.field2672.method3980(var1);
            }
            var1 = this.field2672.method3945();
            var2 = this.field2672.field2707[var1];
            var3 = this.field2672.method3948(var2);
        }
        this.field2656 = var1;
        this.field2666 = var2;
        this.field2677 = var3;
    }

    @ObfuscatedName("ho.bf(Lhs;I)Z")
    public boolean method3850(class226 arg0) {
        if (arg0.field2700 != null) {
            return false;
        }
        if (arg0.field2696 >= 0) {
            arg0.method3726();
            if (arg0.field2686 > 0 && this.field2674[arg0.field2695][arg0.field2686] == arg0) {
                this.field2674[arg0.field2695][arg0.field2686] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("ho.bp(Lhs;[IIII)Z")
    public boolean method3859(class226 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2699 = Statics.field1523 / 100;
        if (arg0.field2696 >= 0 && arg0.field2700 == null || arg0.field2700.method2160()) {
            arg0.method3927();
            arg0.method3726();
            if (arg0.field2686 > 0 && this.field2674[arg0.field2695][arg0.field2686] == arg0) {
                this.field2674[arg0.field2695][arg0.field2686] = null;
            }
            return true;
        }
        int var5 = arg0.field2692;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2673[arg0.field2695] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2692 = var6;
        }
        arg0.field2700.method2269(this.method3847(arg0));
        class223 var7 = arg0.field2690;
        boolean var8 = false;
        arg0.field2698++;
        arg0.field2691 += var7.field2641;
        double var9 = (double) ((arg0.field2687 - 60 << 8) + (arg0.field2692 * arg0.field2685 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2634 > 0) {
            if (var7.field2637 > 0) {
                arg0.field2693 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2637 * var9) + 0.5D);
            } else {
                arg0.field2693 += 128;
            }
        }
        if (var7.field2632 != null) {
            if (var7.field2643 > 0) {
                arg0.field2694 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2643 * var9) + 0.5D);
            } else {
                arg0.field2694 += 128;
            }
            while (arg0.field2701 < var7.field2632.length - 2 && arg0.field2694 > (var7.field2632[arg0.field2701 + 2] & 0xFF) << 8) {
                arg0.field2701 += 2;
            }
            if (arg0.field2701 == var7.field2632.length - 2 && var7.field2632[arg0.field2701 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2696 >= 0 && var7.field2636 != null && (this.field2662[arg0.field2695] & 0x1) == 0 && (arg0.field2686 < 0 || this.field2674[arg0.field2695][arg0.field2686] != arg0)) {
            if (var7.field2639 > 0) {
                arg0.field2696 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2639 * var9) + 0.5D);
            } else {
                arg0.field2696 += 128;
            }
            while (arg0.field2697 < var7.field2636.length - 2 && arg0.field2696 > (var7.field2636[arg0.field2697 + 2] & 0xFF) << 8) {
                arg0.field2697 += 2;
            }
            if (arg0.field2697 == var7.field2636.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2700.method2156(arg0.field2699, this.method3848(arg0), this.method3849(arg0));
            return false;
        }
        arg0.field2700.method2157(arg0.field2699);
        if (arg1 == null) {
            arg0.field2700.method1928(arg3);
        } else {
            arg0.field2700.method1926(arg1, arg2, arg3);
        }
        if (arg0.field2700.method2161()) {
            this.field2678.field2727.method1918(arg0.field2700);
        }
        arg0.method3927();
        if (arg0.field2696 >= 0) {
            arg0.method3726();
            if (arg0.field2686 > 0 && this.field2674[arg0.field2695][arg0.field2686] == arg0) {
                this.field2674[arg0.field2695][arg0.field2686] = null;
            }
        }
        return true;
    }
}
