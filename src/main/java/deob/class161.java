package deob;

@ObfuscatedName("fy")
public class class161 extends class60 {

    @ObfuscatedName("fy.y")
    public class173 field2696 = new class173(128);

    @ObfuscatedName("fy.u")
    public int field2688 = 256;

    @ObfuscatedName("fy.k")
    public int field2689 = 1000000;

    @ObfuscatedName("fy.v")
    public int[] field2690 = new int[16];

    @ObfuscatedName("fy.l")
    public int[] field2700 = new int[16];

    @ObfuscatedName("fy.g")
    public int[] field2694 = new int[16];

    @ObfuscatedName("fy.a")
    public int[] field2693 = new int[16];

    @ObfuscatedName("fy.x")
    public int[] field2702 = new int[16];

    @ObfuscatedName("fy.r")
    public int[] field2691 = new int[16];

    @ObfuscatedName("fy.c")
    public int[] field2699 = new int[16];

    @ObfuscatedName("fy.f")
    public int[] field2697 = new int[16];

    @ObfuscatedName("fy.o")
    public int[] field2698 = new int[16];

    @ObfuscatedName("fy.b")
    public int[] field2701 = new int[16];

    @ObfuscatedName("fy.i")
    public int[] field2692 = new int[16];

    @ObfuscatedName("fy.h")
    public int[] field2706 = new int[16];

    @ObfuscatedName("fy.q")
    public int[] field2687 = new int[16];

    @ObfuscatedName("fy.d")
    public int[] field2703 = new int[16];

    @ObfuscatedName("fy.z")
    public int[] field2704 = new int[16];

    @ObfuscatedName("fy.e")
    public class164[][] field2705 = new class164[16][128];

    @ObfuscatedName("fy.av")
    public class164[][] field2695 = new class164[16][128];

    @ObfuscatedName("fy.al")
    public class159 field2707 = new class159();

    @ObfuscatedName("fy.aq")
    public boolean field2708;

    @ObfuscatedName("fy.aa")
    public int field2709;

    @ObfuscatedName("fy.ah")
    public int field2710;

    @ObfuscatedName("fy.au")
    public long field2711;

    @ObfuscatedName("fy.ai")
    public long field2712;

    @ObfuscatedName("fy.ab")
    public class163 field2713 = new class163(this);

    public class161() {
        this.method3032();
    }

    @ObfuscatedName("fy.y(II)V")
    public synchronized void method3013(int arg0) {
        this.field2688 = arg0;
    }

    @ObfuscatedName("fy.u(I)I")
    public int method3014() {
        return this.field2688;
    }

    @ObfuscatedName("fy.k(Lfq;Lev;Lbw;II)Z")
    public synchronized boolean method3030(class157 arg0, class145 arg1, class53 arg2, int arg3) {
        arg0.method2930();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class174 var7 = (class174) arg0.field2653.method3170(); var7 != null; var7 = (class174) arg0.field2653.method3174()) {
            int var8 = (int) var7.field2830;
            class158 var9 = (class158) this.field2696.method3171((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method2733(var8);
                class158 var11;
                if (var10 == null) {
                    var11 = null;
                } else {
                    var11 = new class158(var10);
                }
                var9 = var11;
                if (var11 == null) {
                    var5 = false;
                    continue;
                }
                this.field2696.method3172(var11, (long) var8);
            }
            if (!var9.method2940(arg2, var7.field2813, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method2933();
        }
        return var5;
    }

    @ObfuscatedName("fy.v(I)V")
    public synchronized void method3016() {
        for (class158 var1 = (class158) this.field2696.method3170(); var1 != null; var1 = (class158) this.field2696.method3174()) {
            var1.method2943();
        }
    }

    @ObfuscatedName("fy.l(I)V")
    public synchronized void method3017() {
        for (class158 var1 = (class158) this.field2696.method3170(); var1 != null; var1 = (class158) this.field2696.method3174()) {
            var1.method3268();
        }
    }

    @ObfuscatedName("fy.w(Lfq;ZI)V")
    public synchronized void method3051(class157 arg0, boolean arg1) {
        this.method3050();
        this.field2707.method2946(arg0.field2652);
        this.field2708 = arg1;
        this.field2711 = 0L;
        int var3 = this.field2707.method2979();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2707.method2954(var4);
            this.field2707.method2953(var4);
            this.field2707.method2951(var4);
        }
        this.field2709 = this.field2707.method2958();
        this.field2710 = this.field2707.field2667[this.field2709];
        this.field2712 = this.field2707.method2957(this.field2710);
    }

    @ObfuscatedName("fy.f(I)V")
    public synchronized void method3050() {
        this.field2707.method2947();
        this.method3032();
    }

    @ObfuscatedName("fy.o(B)Z")
    public synchronized boolean method3100() {
        return this.field2707.method2948();
    }

    @ObfuscatedName("fy.p(III)V")
    public synchronized void method3020(int arg0, int arg1) {
        this.method3021(arg0, arg1);
    }

    @ObfuscatedName("fy.n(III)V")
    public void method3021(int arg0, int arg1) {
        this.field2693[arg0] = arg1;
        this.field2691[arg0] = arg1 & 0xFFFFFF80;
        this.method3022(arg0, arg1);
    }

    @ObfuscatedName("fy.m(III)V")
    public void method3022(int arg0, int arg1) {
        if (this.field2702[arg0] != arg1) {
            this.field2702[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2695[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("fy.s(IIII)V")
    public void method3028(int arg0, int arg1, int arg2) {
        this.method3061(arg0, arg1, 64);
        if ((this.field2701[arg0] & 0x2) != 0) {
            for (class164 var4 = (class164) this.field2713.field2729.method3208(); var4 != null; var4 = (class164) this.field2713.field2729.method3212()) {
                if (var4.field2748 == arg0 && var4.field2747 < 0) {
                    this.field2705[arg0][var4.field2738] = null;
                    this.field2705[arg0][arg1] = var4;
                    int var5 = (var4.field2743 * var4.field2742 >> 12) + var4.field2741;
                    var4.field2741 += arg1 - var4.field2738 << 8;
                    var4.field2742 = var5 - var4.field2741;
                    var4.field2743 = 4096;
                    var4.field2738 = arg1;
                    return;
                }
            }
        }
        class158 var6 = (class158) this.field2696.method3171((long) this.field2702[arg0]);
        if (var6 == null) {
            return;
        }
        class56 var7 = var6.field2655[arg1];
        if (var7 == null) {
            return;
        }
        class164 var8 = new class164();
        var8.field2748 = arg0;
        var8.field2749 = var6;
        var8.field2735 = var7;
        var8.field2736 = var6.field2659[arg1];
        var8.field2737 = var6.field2658[arg1];
        var8.field2738 = arg1;
        var8.field2754 = var6.field2660 * arg2 * arg2 * var6.field2657[arg1] + 1024 >> 11;
        var8.field2740 = var6.field2654[arg1] & 0xFF;
        var8.field2741 = (arg1 << 8) - (var6.field2656[arg1] & 0x7FFF);
        var8.field2744 = 0;
        var8.field2739 = 0;
        var8.field2746 = 0;
        var8.field2747 = -1;
        var8.field2751 = 0;
        if (this.field2687[arg0] == 0) {
            var8.field2734 = class58.method1105(var7, this.method3037(var8), this.method3095(var8), this.method3046(var8));
        } else {
            var8.field2734 = class58.method1105(var7, this.method3037(var8), 0, this.method3046(var8));
            this.method3024(var8, var6.field2656[arg1] < 0);
        }
        if (var6.field2656[arg1] < 0) {
            var8.field2734.method1174(-1);
        }
        if (var8.field2737 >= 0) {
            class164 var9 = this.field2695[arg0][var8.field2737];
            if (var9 != null && var9.field2747 < 0) {
                this.field2705[arg0][var9.field2738] = null;
                var9.field2747 = 0;
            }
            this.field2695[arg0][var8.field2737] = var8;
        }
        this.field2713.field2729.method3202(var8);
        this.field2705[arg0][arg1] = var8;
    }

    @ObfuscatedName("fy.t(Lfd;ZB)V")
    public void method3024(class164 arg0, boolean arg1) {
        int var3 = arg0.field2735.field1116.length;
        int var5;
        if (arg1 && arg0.field2735.field1119) {
            int var4 = var3 + var3 - arg0.field2735.field1117;
            var5 = (int) ((long) this.field2687[arg0.field2748] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2734.method1098(true);
            }
        } else {
            var5 = (int) ((long) this.field2687[arg0.field2748] * (long) var3 >> 6);
        }
        arg0.field2734.method1097(var5);
    }

    @ObfuscatedName("fy.j(IIII)V")
    public void method3061(int arg0, int arg1, int arg2) {
        class164 var4 = this.field2705[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2705[arg0][arg1] = null;
        if ((this.field2701[arg0] & 0x2) == 0) {
            var4.field2747 = 0;
            return;
        }
        for (class164 var5 = (class164) this.field2713.field2729.method3234(); var5 != null; var5 = (class164) this.field2713.field2729.method3209()) {
            if (var4.field2748 == var5.field2748 && var5.field2747 < 0 && var4 != var5) {
                var4.field2747 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("fy.b(IIIB)V")
    public void method3081(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("fy.i(III)V")
    public void method3089(int arg0, int arg1) {
    }

    @ObfuscatedName("fy.aq(III)V")
    public void method3049(int arg0, int arg1) {
        this.field2699[arg0] = arg1;
    }

    @ObfuscatedName("fy.aa(IB)V")
    public void method3029(int arg0) {
        for (class164 var2 = (class164) this.field2713.field2729.method3234(); var2 != null; var2 = (class164) this.field2713.field2729.method3209()) {
            if (arg0 < 0 || var2.field2748 == arg0) {
                if (var2.field2734 != null) {
                    var2.field2734.method1102(Statics.field1069 / 100);
                    if (var2.field2734.method1106()) {
                        this.field2713.field2730.method973(var2.field2734);
                    }
                    var2.method3127();
                }
                if (var2.field2747 < 0) {
                    this.field2705[var2.field2748][var2.field2738] = null;
                }
                var2.method3268();
            }
        }
    }

    @ObfuscatedName("fy.au(IB)V")
    public void method3026(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3026(var2);
            }
            return;
        }
        this.field2690[arg0] = 12800;
        this.field2700[arg0] = 8192;
        this.field2694[arg0] = 16383;
        this.field2699[arg0] = 8192;
        this.field2697[arg0] = 0;
        this.field2698[arg0] = 8192;
        this.method3033(arg0);
        this.method3034(arg0);
        this.field2701[arg0] = 0;
        this.field2692[arg0] = 32767;
        this.field2706[arg0] = 256;
        this.field2687[arg0] = 0;
        this.method3036(arg0, 8192);
    }

    @ObfuscatedName("fy.ai(II)V")
    public void method3031(int arg0) {
        for (class164 var2 = (class164) this.field2713.field2729.method3234(); var2 != null; var2 = (class164) this.field2713.field2729.method3209()) {
            if ((arg0 < 0 || var2.field2748 == arg0) && var2.field2747 < 0) {
                this.field2705[var2.field2748][var2.field2738] = null;
                var2.field2747 = 0;
            }
        }
    }

    @ObfuscatedName("fy.ag(I)V")
    public void method3032() {
        this.method3029(-1);
        this.method3026(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2702[var1] = this.field2693[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2691[var2] = this.field2693[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("fy.ax(IB)V")
    public void method3033(int arg0) {
        if ((this.field2701[arg0] & 0x2) == 0) {
            return;
        }
        for (class164 var2 = (class164) this.field2713.field2729.method3234(); var2 != null; var2 = (class164) this.field2713.field2729.method3209()) {
            if (var2.field2748 == arg0 && this.field2705[arg0][var2.field2738] == null && var2.field2747 < 0) {
                var2.field2747 = 0;
            }
        }
    }

    @ObfuscatedName("fy.af(IB)V")
    public void method3034(int arg0) {
        if ((this.field2701[arg0] & 0x4) == 0) {
            return;
        }
        for (class164 var2 = (class164) this.field2713.field2729.method3234(); var2 != null; var2 = (class164) this.field2713.field2729.method3209()) {
            if (var2.field2748 == arg0) {
                var2.field2753 = 0;
            }
        }
    }

    @ObfuscatedName("fy.ao(IB)V")
    public void method3038(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3061(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3028(var6, var7, var8);
            } else {
                this.method3061(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3081(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2691[var12] = (var14 << 14) + (this.field2691[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2691[var12] = (var14 << 7) + (this.field2691[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2697[var12] = (var14 << 7) + (this.field2697[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2697[var12] = (this.field2697[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2698[var12] = (var14 << 7) + (this.field2698[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2698[var12] = (this.field2698[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2690[var12] = (var14 << 7) + (this.field2690[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2690[var12] = (this.field2690[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2700[var12] = (var14 << 7) + (this.field2700[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2700[var12] = (this.field2700[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2694[var12] = (var14 << 7) + (this.field2694[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2694[var12] = (this.field2694[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2701[var12] |= 0x1;
                } else {
                    this.field2701[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2701[var12] |= 0x2;
                } else {
                    this.method3033(var12);
                    this.field2701[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2692[var12] = (var14 << 7) + (this.field2692[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2692[var12] = (this.field2692[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2692[var12] = (var14 << 7) + (this.field2692[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2692[var12] = (this.field2692[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3029(var12);
            }
            if (var13 == 121) {
                this.method3026(var12);
            }
            if (var13 == 123) {
                this.method3031(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2692[var12];
                if (var15 == 16384) {
                    this.field2706[var12] = (var14 << 7) + (this.field2706[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2692[var12];
                if (var16 == 16384) {
                    this.field2706[var12] = (this.field2706[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2687[var12] = (var14 << 7) + (this.field2687[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2687[var12] = (this.field2687[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2701[var12] |= 0x4;
                } else {
                    this.method3034(var12);
                    this.field2701[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3036(var12, (var14 << 7) + (this.field2703[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3036(var12, (this.field2703[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3022(var17, this.field2691[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3089(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method3049(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3032();
            }
        }
    }

    @ObfuscatedName("fy.ac(IIB)V")
    public void method3036(int arg0, int arg1) {
        this.field2703[arg0] = arg1;
        this.field2704[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("fy.aj(Lfd;I)I")
    public int method3037(class164 arg0) {
        int var2 = (arg0.field2743 * arg0.field2742 >> 12) + arg0.field2741;
        int var3 = ((this.field2699[arg0.field2748] - 8192) * this.field2706[arg0.field2748] >> 12) + var2;
        class162 var4 = arg0.field2736;
        if (var4.field2715 > 0 && (var4.field2721 > 0 || this.field2697[arg0.field2748] > 0)) {
            int var5 = var4.field2721 << 2;
            int var6 = var4.field2723 << 1;
            if (arg0.field2733 < var6) {
                var5 = arg0.field2733 * var5 / var6;
            }
            int var7 = (this.field2697[arg0.field2748] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2750 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2735.field1115 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1069 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("fy.ap(Lfd;B)I")
    public int method3095(class164 arg0) {
        class162 var2 = arg0.field2736;
        int var3 = this.field2694[arg0.field2748] * this.field2690[arg0.field2748] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2754 * var4 + 16384 >> 15;
        int var6 = this.field2688 * var5 + 128 >> 8;
        if (var2.field2722 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2744 * 1.953125E-5D * (double) var2.field2722) + 0.5D);
        }
        if (var2.field2724 != null) {
            int var7 = arg0.field2739;
            int var8 = var2.field2724[arg0.field2746 + 1];
            if (arg0.field2746 < var2.field2724.length - 2) {
                int var9 = (var2.field2724[arg0.field2746] & 0xFF) << 8;
                int var10 = (var2.field2724[arg0.field2746 + 2] & 0xFF) << 8;
                var8 += (var2.field2724[arg0.field2746 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2747 > 0 && var2.field2716 != null) {
            int var11 = arg0.field2747;
            int var12 = var2.field2716[arg0.field2751 + 1];
            if (arg0.field2751 < var2.field2716.length - 2) {
                int var13 = (var2.field2716[arg0.field2751] & 0xFF) << 8;
                int var14 = (var2.field2716[arg0.field2751 + 2] & 0xFF) << 8;
                var12 += (var2.field2716[arg0.field2751 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("fy.ae(Lfd;I)I")
    public int method3046(class164 arg0) {
        int var2 = this.field2700[arg0.field2748];
        return var2 < 8192 ? arg0.field2740 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2740) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("fy.g()Lba;")
    public synchronized class60 method948() {
        return this.field2713;
    }

    @ObfuscatedName("fy.a()Lba;")
    public synchronized class60 method949() {
        return null;
    }

    @ObfuscatedName("fy.x()I")
    public synchronized int method965() {
        return 0;
    }

    @ObfuscatedName("fy.r([III)V")
    public synchronized void method951(int[] arg0, int arg1, int arg2) {
        if (this.field2707.method2948()) {
            int var4 = this.field2689 * this.field2707.field2664 / Statics.field1069;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2711;
                if (this.field2712 - var5 >= 0L) {
                    this.field2711 = var5;
                    break;
                }
                int var7 = (int) ((this.field2712 - this.field2711 + (long) var4 - 1L) / (long) var4);
                this.field2711 += (long) var4 * (long) var7;
                this.field2713.method951(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3041();
            } while (this.field2707.method2948());
        }
        this.field2713.method951(arg0, arg1, arg2);
    }

    @ObfuscatedName("fy.c(I)V")
    public synchronized void method953(int arg0) {
        if (this.field2707.method2948()) {
            int var2 = this.field2689 * this.field2707.field2664 / Statics.field1069;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2711;
                if (this.field2712 - var3 >= 0L) {
                    this.field2711 = var3;
                    break;
                }
                int var5 = (int) ((this.field2712 - this.field2711 + (long) var2 - 1L) / (long) var2);
                this.field2711 += (long) var2 * (long) var5;
                this.field2713.method953(var5);
                arg0 -= var5;
                this.method3041();
            } while (this.field2707.method2948());
        }
        this.field2713.method953(arg0);
    }

    @ObfuscatedName("fy.at(S)V")
    public void method3041() {
        int var1 = this.field2709;
        int var2 = this.field2710;
        long var3 = this.field2712;
        while (this.field2710 == var2) {
            while (this.field2707.field2667[var1] == var2) {
                this.field2707.method2954(var1);
                int var5 = this.field2707.method2998(var1);
                if (var5 == 1) {
                    this.field2707.method2952();
                    this.field2707.method2951(var1);
                    if (this.field2707.method2976()) {
                        if (!this.field2708 || var2 == 0) {
                            this.method3032();
                            this.field2707.method2947();
                            return;
                        }
                        this.field2707.method2962(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3038(var5);
                }
                this.field2707.method2953(var1);
                this.field2707.method2951(var1);
            }
            var1 = this.field2707.method2958();
            var2 = this.field2707.field2667[var1];
            var3 = this.field2707.method2957(var2);
        }
        this.field2709 = var1;
        this.field2710 = var2;
        this.field2712 = var3;
    }

    @ObfuscatedName("fy.as(Lfd;S)Z")
    public boolean method3104(class164 arg0) {
        if (arg0.field2734 != null) {
            return false;
        }
        if (arg0.field2747 >= 0) {
            arg0.method3268();
            if (arg0.field2737 > 0 && this.field2695[arg0.field2748][arg0.field2737] == arg0) {
                this.field2695[arg0.field2748][arg0.field2737] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("fy.aw(Lfd;[IIIB)Z")
    public boolean method3043(class164 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2752 = Statics.field1069 / 100;
        if (arg0.field2747 >= 0 && arg0.field2734 == null || arg0.field2734.method1184()) {
            arg0.method3127();
            arg0.method3268();
            if (arg0.field2737 > 0 && this.field2695[arg0.field2748][arg0.field2737] == arg0) {
                this.field2695[arg0.field2748][arg0.field2737] = null;
            }
            return true;
        }
        int var5 = arg0.field2743;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2698[arg0.field2748] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2743 = var6;
        }
        arg0.field2734.method1103(this.method3037(arg0));
        class162 var7 = arg0.field2736;
        boolean var8 = false;
        arg0.field2733++;
        arg0.field2750 += var7.field2715;
        double var9 = (double) ((arg0.field2738 - 60 << 8) + (arg0.field2743 * arg0.field2742 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2722 > 0) {
            if (var7.field2717 > 0) {
                arg0.field2744 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2717 * var9) + 0.5D);
            } else {
                arg0.field2744 += 128;
            }
        }
        if (var7.field2724 != null) {
            if (var7.field2718 > 0) {
                arg0.field2739 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2718 * var9) + 0.5D);
            } else {
                arg0.field2739 += 128;
            }
            while (arg0.field2746 < var7.field2724.length - 2 && arg0.field2739 > (var7.field2724[arg0.field2746 + 2] & 0xFF) << 8) {
                arg0.field2746 += 2;
            }
            if (arg0.field2746 == var7.field2724.length - 2 && var7.field2724[arg0.field2746 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2747 >= 0 && var7.field2716 != null && (this.field2701[arg0.field2748] & 0x1) == 0 && (arg0.field2737 < 0 || this.field2695[arg0.field2748][arg0.field2737] != arg0)) {
            if (var7.field2727 > 0) {
                arg0.field2747 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2727 * var9) + 0.5D);
            } else {
                arg0.field2747 += 128;
            }
            while (arg0.field2751 < var7.field2716.length - 2 && arg0.field2747 > (var7.field2716[arg0.field2751 + 2] & 0xFF) << 8) {
                arg0.field2751 += 2;
            }
            if (arg0.field2751 == var7.field2716.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2734.method1197(arg0.field2752, this.method3095(arg0), this.method3046(arg0));
            return false;
        }
        arg0.field2734.method1102(arg0.field2752);
        if (arg1 == null) {
            arg0.field2734.method953(arg3);
        } else {
            arg0.field2734.method951(arg1, arg2, arg3);
        }
        if (arg0.field2734.method1106()) {
            this.field2713.field2730.method973(arg0.field2734);
        }
        arg0.method3127();
        if (arg0.field2747 >= 0) {
            arg0.method3268();
            if (arg0.field2737 > 0 && this.field2695[arg0.field2748][arg0.field2737] == arg0) {
                this.field2695[arg0.field2748][arg0.field2737] = null;
            }
        }
        return true;
    }
}
