package deob;

@ObfuscatedName("ff")
public class class163 extends class60 {

    @ObfuscatedName("ff.k")
    public class175 field2732 = new class175(128);

    @ObfuscatedName("ff.y")
    public int field2728 = 256;

    @ObfuscatedName("ff.s")
    public int field2729 = 1000000;

    @ObfuscatedName("ff.g")
    public int[] field2730 = new int[16];

    @ObfuscatedName("ff.h")
    public int[] field2731 = new int[16];

    @ObfuscatedName("ff.l")
    public int[] field2751 = new int[16];

    @ObfuscatedName("ff.e")
    public int[] field2745 = new int[16];

    @ObfuscatedName("ff.u")
    public int[] field2734 = new int[16];

    @ObfuscatedName("ff.j")
    public int[] field2755 = new int[16];

    @ObfuscatedName("ff.c")
    public int[] field2733 = new int[16];

    @ObfuscatedName("ff.d")
    public int[] field2737 = new int[16];

    @ObfuscatedName("ff.v")
    public int[] field2738 = new int[16];

    @ObfuscatedName("ff.w")
    public int[] field2741 = new int[16];

    @ObfuscatedName("ff.b")
    public int[] field2742 = new int[16];

    @ObfuscatedName("ff.x")
    public int[] field2727 = new int[16];

    @ObfuscatedName("ff.q")
    public int[] field2744 = new int[16];

    @ObfuscatedName("ff.o")
    public int[] field2736 = new int[16];

    @ObfuscatedName("ff.m")
    public int[] field2746 = new int[16];

    @ObfuscatedName("ff.f")
    public class166[][] field2747 = new class166[16][128];

    @ObfuscatedName("ff.ab")
    public class166[][] field2735 = new class166[16][128];

    @ObfuscatedName("ff.al")
    public class161 field2749 = new class161();

    @ObfuscatedName("ff.an")
    public boolean field2750;

    @ObfuscatedName("ff.aw")
    public int field2740;

    @ObfuscatedName("ff.ar")
    public int field2752;

    @ObfuscatedName("ff.ai")
    public long field2753;

    @ObfuscatedName("ff.aj")
    public long field2754;

    @ObfuscatedName("ff.ao")
    public class165 field2743 = new class165(this);

    public class163() {
        this.method3096();
    }

    @ObfuscatedName("ff.k(II)V")
    public synchronized void method3170(int arg0) {
        this.field2728 = arg0;
    }

    @ObfuscatedName("ff.y(I)I")
    public int method3080() {
        return this.field2728;
    }

    @ObfuscatedName("ff.s(Lfg;Lei;Lbm;II)Z")
    public synchronized boolean method3122(class159 arg0, class147 arg1, class53 arg2, int arg3) {
        arg0.method2994();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class176 var7 = (class176) arg0.field2694.method3252(); var7 != null; var7 = (class176) arg0.field2694.method3248()) {
            int var8 = (int) var7.field2879;
            class160 var9 = (class160) this.field2732.method3244((long) var8);
            if (var9 == null) {
                var9 = class160.method1872(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field2732.method3253(var9, (long) var8);
            }
            if (!var9.method2996(arg2, var7.field2857, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method2983();
        }
        return var5;
    }

    @ObfuscatedName("ff.g(I)V")
    public synchronized void method3081() {
        for (class160 var1 = (class160) this.field2732.method3252(); var1 != null; var1 = (class160) this.field2732.method3248()) {
            var1.method3002();
        }
    }

    @ObfuscatedName("ff.h(I)V")
    public synchronized void method3104() {
        for (class160 var1 = (class160) this.field2732.method3252(); var1 != null; var1 = (class160) this.field2732.method3248()) {
            var1.method3365();
        }
    }

    @ObfuscatedName("ff.c(Lfg;ZI)V")
    public synchronized void method3155(class159 arg0, boolean arg1) {
        this.method3084();
        this.field2749.method3009(arg0.field2693);
        this.field2750 = arg1;
        this.field2753 = 0L;
        int var3 = this.field2749.method3012();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2749.method3013(var4);
            this.field2749.method3016(var4);
            this.field2749.method3014(var4);
        }
        this.field2740 = this.field2749.method3021();
        this.field2752 = this.field2749.field2708[this.field2740];
        this.field2754 = this.field2749.method3020(this.field2752);
    }

    @ObfuscatedName("ff.v(S)V")
    public synchronized void method3084() {
        this.field2749.method3010();
        this.method3096();
    }

    @ObfuscatedName("ff.n(I)Z")
    public synchronized boolean method3085() {
        return this.field2749.method3025();
    }

    @ObfuscatedName("ff.z(III)V")
    public synchronized void method3163(int arg0, int arg1) {
        this.method3102(arg0, arg1);
    }

    @ObfuscatedName("ff.a(III)V")
    public void method3102(int arg0, int arg1) {
        this.field2745[arg0] = arg1;
        this.field2755[arg0] = arg1 & 0xFFFFFF80;
        this.method3087(arg0, arg1);
    }

    @ObfuscatedName("ff.t(III)V")
    public void method3087(int arg0, int arg1) {
        if (this.field2734[arg0] != arg1) {
            this.field2734[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2735[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("ff.p(IIII)V")
    public void method3088(int arg0, int arg1, int arg2) {
        this.method3144(arg0, arg1, 64);
        if ((this.field2741[arg0] & 0x2) != 0) {
            for (class166 var4 = (class166) this.field2743.field2768.method3299(); var4 != null; var4 = (class166) this.field2743.field2768.method3291()) {
                if (var4.field2784 == arg0 && var4.field2786 < 0) {
                    this.field2747[arg0][var4.field2772] = null;
                    this.field2747[arg0][arg1] = var4;
                    int var5 = (var4.field2776 * var4.field2775 >> 12) + var4.field2780;
                    var4.field2780 += arg1 - var4.field2772 << 8;
                    var4.field2776 = var5 - var4.field2780;
                    var4.field2775 = 4096;
                    var4.field2772 = arg1;
                    return;
                }
            }
        }
        class160 var6 = (class160) this.field2732.method3244((long) this.field2734[arg0]);
        if (var6 == null) {
            return;
        }
        class56 var7 = var6.field2699[arg1];
        if (var7 == null) {
            return;
        }
        class166 var8 = new class166();
        var8.field2784 = arg0;
        var8.field2773 = var6;
        var8.field2774 = var7;
        var8.field2794 = var6.field2697[arg1];
        var8.field2778 = var6.field2701[arg1];
        var8.field2772 = arg1;
        var8.field2781 = var6.field2700 * arg2 * arg2 * var6.field2698[arg1] + 1024 >> 11;
        var8.field2777 = var6.field2695[arg1] & 0xFF;
        var8.field2780 = (arg1 << 8) - (var6.field2696[arg1] & 0x7FFF);
        var8.field2783 = 0;
        var8.field2791 = 0;
        var8.field2785 = 0;
        var8.field2786 = -1;
        var8.field2787 = 0;
        if (this.field2744[arg0] == 0) {
            var8.field2790 = class58.method1110(var7, this.method3101(var8), this.method3140(var8), this.method3103(var8));
        } else {
            var8.field2790 = class58.method1110(var7, this.method3101(var8), 0, this.method3103(var8));
            this.method3089(var8, var6.field2696[arg1] < 0);
        }
        if (var6.field2696[arg1] < 0) {
            var8.field2790.method1112(-1);
        }
        if (var8.field2778 >= 0) {
            class166 var9 = this.field2735[arg0][var8.field2778];
            if (var9 != null && var9.field2786 < 0) {
                this.field2747[arg0][var9.field2772] = null;
                var9.field2786 = 0;
            }
            this.field2735[arg0][var8.field2778] = var8;
        }
        this.field2743.field2768.method3271(var8);
        this.field2747[arg0][arg1] = var8;
    }

    @ObfuscatedName("ff.i(Lfr;ZS)V")
    public void method3089(class166 arg0, boolean arg1) {
        int var3 = arg0.field2774.field1112.length;
        int var5;
        if (arg1 && arg0.field2774.field1113) {
            int var4 = var3 + var3 - arg0.field2774.field1110;
            var5 = (int) ((long) this.field2744[arg0.field2784] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2790.method1127(true);
            }
        } else {
            var5 = (int) ((long) this.field2744[arg0.field2784] * (long) var3 >> 6);
        }
        arg0.field2790.method1181(var5);
    }

    @ObfuscatedName("ff.r(IIII)V")
    public void method3144(int arg0, int arg1, int arg2) {
        class166 var4 = this.field2747[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2747[arg0][arg1] = null;
        if ((this.field2741[arg0] & 0x2) == 0) {
            var4.field2786 = 0;
            return;
        }
        for (class166 var5 = (class166) this.field2743.field2768.method3301(); var5 != null; var5 = (class166) this.field2743.field2768.method3278()) {
            if (var4.field2784 == var5.field2784 && var5.field2786 < 0 && var4 != var5) {
                var4.field2786 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("ff.w(IIIB)V")
    public void method3166(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("ff.b(III)V")
    public void method3141(int arg0, int arg1) {
    }

    @ObfuscatedName("ff.x(IIB)V")
    public void method3092(int arg0, int arg1) {
        this.field2733[arg0] = arg1;
    }

    @ObfuscatedName("ff.q(II)V")
    public void method3160(int arg0) {
        for (class166 var2 = (class166) this.field2743.field2768.method3301(); var2 != null; var2 = (class166) this.field2743.field2768.method3278()) {
            if (arg0 < 0 || var2.field2784 == arg0) {
                if (var2.field2790 != null) {
                    var2.field2790.method1123(Statics.field1074 / 100);
                    if (var2.field2790.method1150()) {
                        this.field2743.field2767.method946(var2.field2790);
                    }
                    var2.method3184();
                }
                if (var2.field2786 < 0) {
                    this.field2747[var2.field2784][var2.field2772] = null;
                }
                var2.method3365();
            }
        }
    }

    @ObfuscatedName("ff.o(IB)V")
    public void method3094(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3094(var2);
            }
            return;
        }
        this.field2730[arg0] = 12800;
        this.field2731[arg0] = 8192;
        this.field2751[arg0] = 16383;
        this.field2733[arg0] = 8192;
        this.field2737[arg0] = 0;
        this.field2738[arg0] = 8192;
        this.method3097(arg0);
        this.method3098(arg0);
        this.field2741[arg0] = 0;
        this.field2742[arg0] = 32767;
        this.field2727[arg0] = 256;
        this.field2744[arg0] = 0;
        this.method3100(arg0, 8192);
    }

    @ObfuscatedName("ff.m(II)V")
    public void method3095(int arg0) {
        for (class166 var2 = (class166) this.field2743.field2768.method3301(); var2 != null; var2 = (class166) this.field2743.field2768.method3278()) {
            if ((arg0 < 0 || var2.field2784 == arg0) && var2.field2786 < 0) {
                this.field2747[var2.field2784][var2.field2772] = null;
                var2.field2786 = 0;
            }
        }
    }

    @ObfuscatedName("ff.f(B)V")
    public void method3096() {
        this.method3160(-1);
        this.method3094(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2734[var1] = this.field2745[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2755[var2] = this.field2745[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("ff.ab(II)V")
    public void method3097(int arg0) {
        if ((this.field2741[arg0] & 0x2) == 0) {
            return;
        }
        for (class166 var2 = (class166) this.field2743.field2768.method3301(); var2 != null; var2 = (class166) this.field2743.field2768.method3278()) {
            if (var2.field2784 == arg0 && this.field2747[arg0][var2.field2772] == null && var2.field2786 < 0) {
                var2.field2786 = 0;
            }
        }
    }

    @ObfuscatedName("ff.al(II)V")
    public void method3098(int arg0) {
        if ((this.field2741[arg0] & 0x4) == 0) {
            return;
        }
        for (class166 var2 = (class166) this.field2743.field2768.method3301(); var2 != null; var2 = (class166) this.field2743.field2768.method3278()) {
            if (var2.field2784 == arg0) {
                var2.field2792 = 0;
            }
        }
    }

    @ObfuscatedName("ff.as(IS)V")
    public void method3099(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3144(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3088(var6, var7, var8);
            } else {
                this.method3144(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3166(var9, var10, var11);
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
                this.field2737[var12] = (var14 << 7) + (this.field2737[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2737[var12] = (this.field2737[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2738[var12] = (var14 << 7) + (this.field2738[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2738[var12] = (this.field2738[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2730[var12] = (var14 << 7) + (this.field2730[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2730[var12] = (this.field2730[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2731[var12] = (var14 << 7) + (this.field2731[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2731[var12] = (this.field2731[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2751[var12] = (var14 << 7) + (this.field2751[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2751[var12] = (this.field2751[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2741[var12] |= 0x1;
                } else {
                    this.field2741[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2741[var12] |= 0x2;
                } else {
                    this.method3097(var12);
                    this.field2741[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2742[var12] = (var14 << 7) + (this.field2742[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2742[var12] = (this.field2742[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2742[var12] = (var14 << 7) + (this.field2742[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2742[var12] = (this.field2742[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3160(var12);
            }
            if (var13 == 121) {
                this.method3094(var12);
            }
            if (var13 == 123) {
                this.method3095(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2742[var12];
                if (var15 == 16384) {
                    this.field2727[var12] = (var14 << 7) + (this.field2727[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2742[var12];
                if (var16 == 16384) {
                    this.field2727[var12] = (this.field2727[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2744[var12] = (var14 << 7) + (this.field2744[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2744[var12] = (this.field2744[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2741[var12] |= 0x4;
                } else {
                    this.method3098(var12);
                    this.field2741[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3100(var12, (var14 << 7) + (this.field2736[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3100(var12, (this.field2736[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3087(var17, this.field2755[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3141(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method3092(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3096();
            }
        }
    }

    @ObfuscatedName("ff.au(IIB)V")
    public void method3100(int arg0, int arg1) {
        this.field2736[arg0] = arg1;
        this.field2746[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("ff.ac(Lfr;I)I")
    public int method3101(class166 arg0) {
        int var2 = (arg0.field2776 * arg0.field2775 >> 12) + arg0.field2780;
        int var3 = ((this.field2733[arg0.field2784] - 8192) * this.field2727[arg0.field2784] >> 12) + var2;
        class164 var4 = arg0.field2794;
        if (var4.field2763 > 0 && (var4.field2762 > 0 || this.field2737[arg0.field2784] > 0)) {
            int var5 = var4.field2762 << 2;
            int var6 = var4.field2764 << 1;
            if (arg0.field2782 < var6) {
                var5 = arg0.field2782 * var5 / var6;
            }
            int var7 = (this.field2737[arg0.field2784] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2789 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2774.field1111 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1074 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("ff.av(Lfr;I)I")
    public int method3140(class166 arg0) {
        class164 var2 = arg0.field2794;
        int var3 = this.field2730[arg0.field2784] * this.field2751[arg0.field2784] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2781 * var4 + 16384 >> 15;
        int var6 = this.field2728 * var5 + 128 >> 8;
        if (var2.field2761 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2783 * 1.953125E-5D * (double) var2.field2761) + 0.5D);
        }
        if (var2.field2757 != null) {
            int var7 = arg0.field2791;
            int var8 = var2.field2757[arg0.field2785 + 1];
            if (arg0.field2785 < var2.field2757.length - 2) {
                int var9 = (var2.field2757[arg0.field2785] & 0xFF) << 8;
                int var10 = (var2.field2757[arg0.field2785 + 2] & 0xFF) << 8;
                var8 += (var2.field2757[arg0.field2785 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2786 > 0 && var2.field2758 != null) {
            int var11 = arg0.field2786;
            int var12 = var2.field2758[arg0.field2787 + 1];
            if (arg0.field2787 < var2.field2758.length - 2) {
                int var13 = (var2.field2758[arg0.field2787] & 0xFF) << 8;
                int var14 = (var2.field2758[arg0.field2787 + 2] & 0xFF) << 8;
                var12 += (var2.field2758[arg0.field2787 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("ff.ak(Lfr;B)I")
    public int method3103(class166 arg0) {
        int var2 = this.field2731[arg0.field2784];
        return var2 < 8192 ? arg0.field2777 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2777) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("ff.l()Lbl;")
    public synchronized class60 method951() {
        return this.field2743;
    }

    @ObfuscatedName("ff.e()Lbl;")
    public synchronized class60 method950() {
        return null;
    }

    @ObfuscatedName("ff.u()I")
    public synchronized int method984() {
        return 0;
    }

    @ObfuscatedName("ff.j([III)V")
    public synchronized void method954(int[] arg0, int arg1, int arg2) {
        if (this.field2749.method3025()) {
            int var4 = this.field2729 * this.field2749.field2705 / Statics.field1074;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2753;
                if (this.field2754 - var5 >= 0L) {
                    this.field2753 = var5;
                    break;
                }
                int var7 = (int) ((this.field2754 - this.field2753 + (long) var4 - 1L) / (long) var4);
                this.field2753 += (long) var4 * (long) var7;
                this.field2743.method954(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3078();
            } while (this.field2749.method3025());
        }
        this.field2743.method954(arg0, arg1, arg2);
    }

    @ObfuscatedName("ff.d(I)V")
    public synchronized void method956(int arg0) {
        if (this.field2749.method3025()) {
            int var2 = this.field2729 * this.field2749.field2705 / Statics.field1074;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2753;
                if (this.field2754 - var3 >= 0L) {
                    this.field2753 = var3;
                    break;
                }
                int var5 = (int) ((this.field2754 - this.field2753 + (long) var2 - 1L) / (long) var2);
                this.field2753 += (long) var2 * (long) var5;
                this.field2743.method956(var5);
                arg0 -= var5;
                this.method3078();
            } while (this.field2749.method3025());
        }
        this.field2743.method956(arg0);
    }

    @ObfuscatedName("ff.ae(I)V")
    public void method3078() {
        int var1 = this.field2740;
        int var2 = this.field2752;
        long var3 = this.field2754;
        while (this.field2752 == var2) {
            while (this.field2749.field2708[var1] == var2) {
                this.field2749.method3013(var1);
                int var5 = this.field2749.method3017(var1);
                if (var5 == 1) {
                    this.field2749.method3015();
                    this.field2749.method3014(var1);
                    if (this.field2749.method3056()) {
                        if (!this.field2750 || var2 == 0) {
                            this.method3096();
                            this.field2749.method3010();
                            return;
                        }
                        this.field2749.method3023(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3099(var5);
                }
                this.field2749.method3016(var1);
                this.field2749.method3014(var1);
            }
            var1 = this.field2749.method3021();
            var2 = this.field2749.field2708[var1];
            var3 = this.field2749.method3020(var2);
        }
        this.field2740 = var1;
        this.field2752 = var2;
        this.field2754 = var3;
    }

    @ObfuscatedName("ff.at(Lfr;B)Z")
    public boolean method3139(class166 arg0) {
        if (arg0.field2790 != null) {
            return false;
        }
        if (arg0.field2786 >= 0) {
            arg0.method3365();
            if (arg0.field2778 > 0 && this.field2735[arg0.field2784][arg0.field2778] == arg0) {
                this.field2735[arg0.field2784][arg0.field2778] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("ff.ag(Lfr;[IIIB)Z")
    public boolean method3146(class166 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2779 = Statics.field1074 / 100;
        if (arg0.field2786 >= 0 && arg0.field2790 == null || arg0.field2790.method1126()) {
            arg0.method3184();
            arg0.method3365();
            if (arg0.field2778 > 0 && this.field2735[arg0.field2784][arg0.field2778] == arg0) {
                this.field2735[arg0.field2784][arg0.field2778] = null;
            }
            return true;
        }
        int var5 = arg0.field2775;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2738[arg0.field2784] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2775 = var6;
        }
        arg0.field2790.method1124(this.method3101(arg0));
        class164 var7 = arg0.field2794;
        boolean var8 = false;
        arg0.field2782++;
        arg0.field2789 += var7.field2763;
        double var9 = (double) ((arg0.field2772 - 60 << 8) + (arg0.field2776 * arg0.field2775 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2761 > 0) {
            if (var7.field2760 > 0) {
                arg0.field2783 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2760 * var9) + 0.5D);
            } else {
                arg0.field2783 += 128;
            }
        }
        if (var7.field2757 != null) {
            if (var7.field2759 > 0) {
                arg0.field2791 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2759 * var9) + 0.5D);
            } else {
                arg0.field2791 += 128;
            }
            while (arg0.field2785 < var7.field2757.length - 2 && arg0.field2791 > (var7.field2757[arg0.field2785 + 2] & 0xFF) << 8) {
                arg0.field2785 += 2;
            }
            if (arg0.field2785 == var7.field2757.length - 2 && var7.field2757[arg0.field2785 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2786 >= 0 && var7.field2758 != null && (this.field2741[arg0.field2784] & 0x1) == 0 && (arg0.field2778 < 0 || this.field2735[arg0.field2784][arg0.field2778] != arg0)) {
            if (var7.field2756 > 0) {
                arg0.field2786 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2756 * var9) + 0.5D);
            } else {
                arg0.field2786 += 128;
            }
            while (arg0.field2787 < var7.field2758.length - 2 && arg0.field2786 > (var7.field2758[arg0.field2787 + 2] & 0xFF) << 8) {
                arg0.field2787 += 2;
            }
            if (arg0.field2787 == var7.field2758.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2790.method1122(arg0.field2779, this.method3140(arg0), this.method3103(arg0));
            return false;
        }
        arg0.field2790.method1123(arg0.field2779);
        if (arg1 == null) {
            arg0.field2790.method956(arg3);
        } else {
            arg0.field2790.method954(arg1, arg2, arg3);
        }
        if (arg0.field2790.method1150()) {
            this.field2743.field2767.method946(arg0.field2790);
        }
        arg0.method3184();
        if (arg0.field2786 >= 0) {
            arg0.method3365();
            if (arg0.field2778 > 0 && this.field2735[arg0.field2784][arg0.field2778] == arg0) {
                this.field2735[arg0.field2784][arg0.field2778] = null;
            }
        }
        return true;
    }
}
