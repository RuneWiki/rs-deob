package deob;

@ObfuscatedName("fj")
public class class165 extends class61 {

    @ObfuscatedName("fj.x")
    public class177 field2734 = new class177(128);

    @ObfuscatedName("fj.v")
    public int field2741 = 256;

    @ObfuscatedName("fj.m")
    public int field2756 = 1000000;

    @ObfuscatedName("fj.e")
    public int[] field2736 = new int[16];

    @ObfuscatedName("fj.h")
    public int[] field2737 = new int[16];

    @ObfuscatedName("fj.p")
    public int[] field2738 = new int[16];

    @ObfuscatedName("fj.j")
    public int[] field2761 = new int[16];

    @ObfuscatedName("fj.i")
    public int[] field2740 = new int[16];

    @ObfuscatedName("fj.u")
    public int[] field2755 = new int[16];

    @ObfuscatedName("fj.l")
    public int[] field2742 = new int[16];

    @ObfuscatedName("fj.k")
    public int[] field2743 = new int[16];

    @ObfuscatedName("fj.q")
    public int[] field2733 = new int[16];

    @ObfuscatedName("fj.t")
    public int[] field2745 = new int[16];

    @ObfuscatedName("fj.o")
    public int[] field2748 = new int[16];

    @ObfuscatedName("fj.z")
    public int[] field2739 = new int[16];

    @ObfuscatedName("fj.d")
    public int[] field2735 = new int[16];

    @ObfuscatedName("fj.y")
    public int[] field2746 = new int[16];

    @ObfuscatedName("fj.a")
    public int[] field2750 = new int[16];

    @ObfuscatedName("fj.n")
    public class168[][] field2751 = new class168[16][128];

    @ObfuscatedName("fj.ae")
    public class168[][] field2752 = new class168[16][128];

    @ObfuscatedName("fj.ay")
    public class163 field2753 = new class163();

    @ObfuscatedName("fj.ac")
    public boolean field2754;

    @ObfuscatedName("fj.ag")
    public int field2744;

    @ObfuscatedName("fj.am")
    public int field2747;

    @ObfuscatedName("fj.au")
    public long field2757;

    @ObfuscatedName("fj.ai")
    public long field2758;

    @ObfuscatedName("fj.ab")
    public class167 field2759 = new class167(this);

    public class165() {
        this.method3082();
    }

    @ObfuscatedName("fj.x(II)V")
    public synchronized void method3140(int arg0) {
        this.field2741 = arg0;
    }

    @ObfuscatedName("fj.v(I)I")
    public int method3052() {
        return this.field2741;
    }

    @ObfuscatedName("fj.m(Lft;Ley;Lby;II)Z")
    public synchronized boolean method3086(class161 arg0, class149 arg1, class54 arg2, int arg3) {
        arg0.method2964();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class178 var7 = (class178) arg0.field2696.method3217(); var7 != null; var7 = (class178) arg0.field2696.method3218()) {
            int var8 = (int) var7.field2882;
            class162 var9 = (class162) this.field2734.method3214((long) var8);
            if (var9 == null) {
                var9 = class162.method2385(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field2734.method3215(var9, (long) var8);
            }
            if (!var9.method2975(arg2, var7.field2860, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method2965();
        }
        return var5;
    }

    @ObfuscatedName("fj.e(I)V")
    public synchronized void method3054() {
        for (class162 var1 = (class162) this.field2734.method3217(); var1 != null; var1 = (class162) this.field2734.method3218()) {
            var1.method2976();
        }
    }

    @ObfuscatedName("fj.h(I)V")
    public synchronized void method3055() {
        for (class162 var1 = (class162) this.field2734.method3217(); var1 != null; var1 = (class162) this.field2734.method3218()) {
            var1.method3352();
        }
    }

    @ObfuscatedName("fj.l(Lft;ZB)V")
    public synchronized void method3056(class161 arg0, boolean arg1) {
        this.method3057();
        this.field2753.method3009(arg0.field2695);
        this.field2754 = arg1;
        this.field2757 = 0L;
        int var3 = this.field2753.method2990();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2753.method2991(var4);
            this.field2753.method2999(var4);
            this.field2753.method2992(var4);
        }
        this.field2744 = this.field2753.method3008();
        this.field2747 = this.field2753.field2717[this.field2744];
        this.field2758 = this.field2753.method2998(this.field2747);
    }

    @ObfuscatedName("fj.q(I)V")
    public synchronized void method3057() {
        this.field2753.method2988();
        this.method3082();
    }

    @ObfuscatedName("fj.b(I)Z")
    public synchronized boolean method3122() {
        return this.field2753.method2989();
    }

    @ObfuscatedName("fj.w(IIB)V")
    public synchronized void method3059(int arg0, int arg1) {
        this.method3060(arg0, arg1);
    }

    @ObfuscatedName("fj.g(III)V")
    public void method3060(int arg0, int arg1) {
        this.field2761[arg0] = arg1;
        this.field2755[arg0] = arg1 & 0xFFFFFF80;
        this.method3116(arg0, arg1);
    }

    @ObfuscatedName("fj.s(III)V")
    public void method3116(int arg0, int arg1) {
        if (this.field2740[arg0] != arg1) {
            this.field2740[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2752[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("fj.c(IIII)V")
    public void method3062(int arg0, int arg1, int arg2) {
        this.method3064(arg0, arg1, 64);
        if ((this.field2745[arg0] & 0x2) != 0) {
            for (class168 var4 = (class168) this.field2759.field2775.method3253(); var4 != null; var4 = (class168) this.field2759.field2775.method3255()) {
                if (var4.field2788 == arg0 && var4.field2792 < 0) {
                    this.field2751[arg0][var4.field2783] = null;
                    this.field2751[arg0][arg1] = var4;
                    int var5 = (var4.field2791 * var4.field2786 >> 12) + var4.field2782;
                    var4.field2782 += arg1 - var4.field2783 << 8;
                    var4.field2786 = var5 - var4.field2782;
                    var4.field2791 = 4096;
                    var4.field2783 = arg1;
                    return;
                }
            }
        }
        class162 var6 = (class162) this.field2734.method3214((long) this.field2740[arg0]);
        if (var6 == null) {
            return;
        }
        class57 var7 = var6.field2698[arg1];
        if (var7 == null) {
            return;
        }
        class168 var8 = new class168();
        var8.field2788 = arg0;
        var8.field2779 = var6;
        var8.field2780 = var7;
        var8.field2781 = var6.field2702[arg1];
        var8.field2797 = var6.field2697[arg1];
        var8.field2783 = arg1;
        var8.field2787 = var6.field2701 * arg2 * arg2 * var6.field2703[arg1] + 1024 >> 11;
        var8.field2785 = var6.field2700[arg1] & 0xFF;
        var8.field2782 = (arg1 << 8) - (var6.field2699[arg1] & 0x7FFF);
        var8.field2789 = 0;
        var8.field2790 = 0;
        var8.field2778 = 0;
        var8.field2792 = -1;
        var8.field2793 = 0;
        if (this.field2735[arg0] == 0) {
            var8.field2796 = class59.method1134(var7, this.method3083(var8), this.method3143(var8), this.method3053(var8));
        } else {
            var8.field2796 = class59.method1134(var7, this.method3083(var8), 0, this.method3053(var8));
            this.method3058(var8, var6.field2699[arg1] < 0);
        }
        if (var6.field2699[arg1] < 0) {
            var8.field2796.method1136(-1);
        }
        if (var8.field2797 >= 0) {
            class168 var9 = this.field2752[arg0][var8.field2797];
            if (var9 != null && var9.field2792 < 0) {
                this.field2751[arg0][var9.field2783] = null;
                var9.field2792 = 0;
            }
            this.field2752[arg0][var8.field2797] = var8;
        }
        this.field2759.field2775.method3246(var8);
        this.field2751[arg0][arg1] = var8;
    }

    @ObfuscatedName("fj.r(Lfl;ZI)V")
    public void method3058(class168 arg0, boolean arg1) {
        int var3 = arg0.field2780.field1145.length;
        int var5;
        if (arg1 && arg0.field2780.field1144) {
            int var4 = var3 + var3 - arg0.field2780.field1148;
            var5 = (int) ((long) this.field2735[arg0.field2788] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2796.method1143(true);
            }
        } else {
            var5 = (int) ((long) this.field2735[arg0.field2788] * (long) var3 >> 6);
        }
        arg0.field2796.method1201(var5);
    }

    @ObfuscatedName("fj.f(IIII)V")
    public void method3064(int arg0, int arg1, int arg2) {
        class168 var4 = this.field2751[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2751[arg0][arg1] = null;
        if ((this.field2745[arg0] & 0x2) == 0) {
            var4.field2792 = 0;
            return;
        }
        for (class168 var5 = (class168) this.field2759.field2775.method3251(); var5 != null; var5 = (class168) this.field2759.field2775.method3272()) {
            if (var4.field2788 == var5.field2788 && var5.field2792 < 0 && var4 != var5) {
                var4.field2792 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("fj.t(IIII)V")
    public void method3065(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("fj.o(IIB)V")
    public void method3066(int arg0, int arg1) {
    }

    @ObfuscatedName("fj.z(III)V")
    public void method3067(int arg0, int arg1) {
        this.field2742[arg0] = arg1;
    }

    @ObfuscatedName("fj.d(II)V")
    public void method3076(int arg0) {
        for (class168 var2 = (class168) this.field2759.field2775.method3251(); var2 != null; var2 = (class168) this.field2759.field2775.method3272()) {
            if (arg0 < 0 || var2.field2788 == arg0) {
                if (var2.field2796 != null) {
                    var2.field2796.method1147(Statics.field1096 / 100);
                    if (var2.field2796.method1151()) {
                        this.field2759.field2776.method972(var2.field2796);
                    }
                    var2.method3165();
                }
                if (var2.field2792 < 0) {
                    this.field2751[var2.field2788][var2.field2783] = null;
                }
                var2.method3352();
            }
        }
    }

    @ObfuscatedName("fj.y(II)V")
    public void method3148(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3148(var2);
            }
            return;
        }
        this.field2736[arg0] = 12800;
        this.field2737[arg0] = 8192;
        this.field2738[arg0] = 16383;
        this.field2742[arg0] = 8192;
        this.field2743[arg0] = 0;
        this.field2733[arg0] = 8192;
        this.method3071(arg0);
        this.method3072(arg0);
        this.field2745[arg0] = 0;
        this.field2748[arg0] = 32767;
        this.field2739[arg0] = 256;
        this.field2735[arg0] = 0;
        this.method3074(arg0, 8192);
    }

    @ObfuscatedName("fj.a(II)V")
    public void method3087(int arg0) {
        for (class168 var2 = (class168) this.field2759.field2775.method3251(); var2 != null; var2 = (class168) this.field2759.field2775.method3272()) {
            if ((arg0 < 0 || var2.field2788 == arg0) && var2.field2792 < 0) {
                this.field2751[var2.field2788][var2.field2783] = null;
                var2.field2792 = 0;
            }
        }
    }

    @ObfuscatedName("fj.n(I)V")
    public void method3082() {
        this.method3076(-1);
        this.method3148(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2740[var1] = this.field2761[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2755[var2] = this.field2761[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("fj.ae(II)V")
    public void method3071(int arg0) {
        if ((this.field2745[arg0] & 0x2) == 0) {
            return;
        }
        for (class168 var2 = (class168) this.field2759.field2775.method3251(); var2 != null; var2 = (class168) this.field2759.field2775.method3272()) {
            if (var2.field2788 == arg0 && this.field2751[arg0][var2.field2783] == null && var2.field2792 < 0) {
                var2.field2792 = 0;
            }
        }
    }

    @ObfuscatedName("fj.ay(II)V")
    public void method3072(int arg0) {
        if ((this.field2745[arg0] & 0x4) == 0) {
            return;
        }
        for (class168 var2 = (class168) this.field2759.field2775.method3251(); var2 != null; var2 = (class168) this.field2759.field2775.method3272()) {
            if (var2.field2788 == arg0) {
                var2.field2798 = 0;
            }
        }
    }

    @ObfuscatedName("fj.ac(IB)V")
    public void method3073(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3064(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3062(var6, var7, var8);
            } else {
                this.method3064(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3065(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2755[var12] = (var14 << 14) + (this.field2755[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2755[var12] = (var14 << 7) + (this.field2755[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2743[var12] = (var14 << 7) + (this.field2743[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2743[var12] = (this.field2743[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2733[var12] = (var14 << 7) + (this.field2733[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2733[var12] = (this.field2733[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2736[var12] = (var14 << 7) + (this.field2736[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2736[var12] = (this.field2736[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2737[var12] = (var14 << 7) + (this.field2737[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2737[var12] = (this.field2737[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2738[var12] = (var14 << 7) + (this.field2738[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2738[var12] = (this.field2738[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2745[var12] |= 0x1;
                } else {
                    this.field2745[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2745[var12] |= 0x2;
                } else {
                    this.method3071(var12);
                    this.field2745[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2748[var12] = (var14 << 7) + (this.field2748[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2748[var12] = (this.field2748[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2748[var12] = (var14 << 7) + (this.field2748[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2748[var12] = (this.field2748[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3076(var12);
            }
            if (var13 == 121) {
                this.method3148(var12);
            }
            if (var13 == 123) {
                this.method3087(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2748[var12];
                if (var15 == 16384) {
                    this.field2739[var12] = (var14 << 7) + (this.field2739[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2748[var12];
                if (var16 == 16384) {
                    this.field2739[var12] = (this.field2739[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2735[var12] = (var14 << 7) + (this.field2735[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2735[var12] = (this.field2735[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2745[var12] |= 0x4;
                } else {
                    this.method3072(var12);
                    this.field2745[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3074(var12, (var14 << 7) + (this.field2746[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3074(var12, (this.field2746[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3116(var17, this.field2755[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3066(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method3067(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3082();
            }
        }
    }

    @ObfuscatedName("fj.ag(III)V")
    public void method3074(int arg0, int arg1) {
        this.field2746[arg0] = arg1;
        this.field2750[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("fj.aj(Lfl;I)I")
    public int method3083(class168 arg0) {
        int var2 = (arg0.field2791 * arg0.field2786 >> 12) + arg0.field2782;
        int var3 = ((this.field2742[arg0.field2788] - 8192) * this.field2739[arg0.field2788] >> 12) + var2;
        class166 var4 = arg0.field2781;
        if (var4.field2769 > 0 && (var4.field2767 > 0 || this.field2743[arg0.field2788] > 0)) {
            int var5 = var4.field2767 << 2;
            int var6 = var4.field2766 << 1;
            if (arg0.field2794 < var6) {
                var5 = arg0.field2794 * var5 / var6;
            }
            int var7 = (this.field2743[arg0.field2788] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2795 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2780.field1146 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1096 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("fj.ao(Lfl;I)I")
    public int method3143(class168 arg0) {
        class166 var2 = arg0.field2781;
        int var3 = this.field2738[arg0.field2788] * this.field2736[arg0.field2788] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2787 * var4 + 16384 >> 15;
        int var6 = this.field2741 * var5 + 128 >> 8;
        if (var2.field2764 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2789 * 1.953125E-5D * (double) var2.field2764) + 0.5D);
        }
        if (var2.field2768 != null) {
            int var7 = arg0.field2790;
            int var8 = var2.field2768[arg0.field2778 + 1];
            if (arg0.field2778 < var2.field2768.length - 2) {
                int var9 = (var2.field2768[arg0.field2778] & 0xFF) << 8;
                int var10 = (var2.field2768[arg0.field2778 + 2] & 0xFF) << 8;
                var8 += (var2.field2768[arg0.field2778 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2792 > 0 && var2.field2763 != null) {
            int var11 = arg0.field2792;
            int var12 = var2.field2763[arg0.field2793 + 1];
            if (arg0.field2793 < var2.field2763.length - 2) {
                int var13 = (var2.field2763[arg0.field2793] & 0xFF) << 8;
                int var14 = (var2.field2763[arg0.field2793 + 2] & 0xFF) << 8;
                var12 += (var2.field2763[arg0.field2793 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("fj.bk(Lfl;I)I")
    public int method3053(class168 arg0) {
        int var2 = this.field2737[arg0.field2788];
        return var2 < 8192 ? arg0.field2785 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2785) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("fj.p()Lbh;")
    public synchronized class61 method977() {
        return this.field2759;
    }

    @ObfuscatedName("fj.j()Lbh;")
    public synchronized class61 method975() {
        return null;
    }

    @ObfuscatedName("fj.i()I")
    public synchronized int method979() {
        return 0;
    }

    @ObfuscatedName("fj.u([III)V")
    public synchronized void method980(int[] arg0, int arg1, int arg2) {
        if (this.field2753.method2989()) {
            int var4 = this.field2756 * this.field2753.field2708 / Statics.field1096;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2757;
                if (this.field2758 - var5 >= 0L) {
                    this.field2757 = var5;
                    break;
                }
                int var7 = (int) ((this.field2758 - this.field2757 + (long) var4 - 1L) / (long) var4);
                this.field2757 += (long) var4 * (long) var7;
                this.field2759.method980(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3078();
            } while (this.field2753.method2989());
        }
        this.field2759.method980(arg0, arg1, arg2);
    }

    @ObfuscatedName("fj.k(I)V")
    public synchronized void method982(int arg0) {
        if (this.field2753.method2989()) {
            int var2 = this.field2756 * this.field2753.field2708 / Statics.field1096;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2757;
                if (this.field2758 - var3 >= 0L) {
                    this.field2757 = var3;
                    break;
                }
                int var5 = (int) ((this.field2758 - this.field2757 + (long) var2 - 1L) / (long) var2);
                this.field2757 += (long) var2 * (long) var5;
                this.field2759.method982(var5);
                arg0 -= var5;
                this.method3078();
            } while (this.field2753.method2989());
        }
        this.field2759.method982(arg0);
    }

    @ObfuscatedName("fj.by(B)V")
    public void method3078() {
        int var1 = this.field2744;
        int var2 = this.field2747;
        long var3 = this.field2758;
        while (this.field2747 == var2) {
            while (this.field2753.field2717[var1] == var2) {
                this.field2753.method2991(var1);
                int var5 = this.field2753.method2995(var1);
                if (var5 == 1) {
                    this.field2753.method2997();
                    this.field2753.method2992(var1);
                    if (this.field2753.method3000()) {
                        if (!this.field2754 || var2 == 0) {
                            this.method3082();
                            this.field2753.method2988();
                            return;
                        }
                        this.field2753.method3023(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3073(var5);
                }
                this.field2753.method2999(var1);
                this.field2753.method2992(var1);
            }
            var1 = this.field2753.method3008();
            var2 = this.field2753.field2717[var1];
            var3 = this.field2753.method2998(var2);
        }
        this.field2744 = var1;
        this.field2747 = var2;
        this.field2758 = var3;
    }

    @ObfuscatedName("fj.bp(Lfl;I)Z")
    public boolean method3079(class168 arg0) {
        if (arg0.field2796 != null) {
            return false;
        }
        if (arg0.field2792 >= 0) {
            arg0.method3352();
            if (arg0.field2797 > 0 && this.field2752[arg0.field2788][arg0.field2797] == arg0) {
                this.field2752[arg0.field2788][arg0.field2797] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("fj.bn(Lfl;[IIIS)Z")
    public boolean method3136(class168 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2784 = Statics.field1096 / 100;
        if (arg0.field2792 >= 0 && arg0.field2796 == null || arg0.field2796.method1150()) {
            arg0.method3165();
            arg0.method3352();
            if (arg0.field2797 > 0 && this.field2752[arg0.field2788][arg0.field2797] == arg0) {
                this.field2752[arg0.field2788][arg0.field2797] = null;
            }
            return true;
        }
        int var5 = arg0.field2791;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2733[arg0.field2788] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2791 = var6;
        }
        arg0.field2796.method1157(this.method3083(arg0));
        class166 var7 = arg0.field2781;
        boolean var8 = false;
        arg0.field2794++;
        arg0.field2795 += var7.field2769;
        double var9 = (double) ((arg0.field2783 - 60 << 8) + (arg0.field2791 * arg0.field2786 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2764 > 0) {
            if (var7.field2762 > 0) {
                arg0.field2789 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2762 * var9) + 0.5D);
            } else {
                arg0.field2789 += 128;
            }
        }
        if (var7.field2768 != null) {
            if (var7.field2770 > 0) {
                arg0.field2790 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2770 * var9) + 0.5D);
            } else {
                arg0.field2790 += 128;
            }
            while (arg0.field2778 < var7.field2768.length - 2 && arg0.field2790 > (var7.field2768[arg0.field2778 + 2] & 0xFF) << 8) {
                arg0.field2778 += 2;
            }
            if (arg0.field2778 == var7.field2768.length - 2 && var7.field2768[arg0.field2778 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2792 >= 0 && var7.field2763 != null && (this.field2745[arg0.field2788] & 0x1) == 0 && (arg0.field2797 < 0 || this.field2752[arg0.field2788][arg0.field2797] != arg0)) {
            if (var7.field2765 > 0) {
                arg0.field2792 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2765 * var9) + 0.5D);
            } else {
                arg0.field2792 += 128;
            }
            while (arg0.field2793 < var7.field2763.length - 2 && arg0.field2792 > (var7.field2763[arg0.field2793 + 2] & 0xFF) << 8) {
                arg0.field2793 += 2;
            }
            if (arg0.field2793 == var7.field2763.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2796.method1146(arg0.field2784, this.method3143(arg0), this.method3053(arg0));
            return false;
        }
        arg0.field2796.method1147(arg0.field2784);
        if (arg1 == null) {
            arg0.field2796.method982(arg3);
        } else {
            arg0.field2796.method980(arg1, arg2, arg3);
        }
        if (arg0.field2796.method1151()) {
            this.field2759.field2776.method972(arg0.field2796);
        }
        arg0.method3165();
        if (arg0.field2792 >= 0) {
            arg0.method3352();
            if (arg0.field2797 > 0 && this.field2752[arg0.field2788][arg0.field2797] == arg0) {
                this.field2752[arg0.field2788][arg0.field2797] = null;
            }
        }
        return true;
    }
}
