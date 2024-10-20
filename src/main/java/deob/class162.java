package deob;

@ObfuscatedName("fu")
public class class162 extends class60 {

    @ObfuscatedName("fu.t")
    public class174 field2723 = new class174(128);

    @ObfuscatedName("fu.s")
    public int field2718 = 256;

    @ObfuscatedName("fu.f")
    public int field2719 = 1000000;

    @ObfuscatedName("fu.e")
    public int[] field2717 = new int[16];

    @ObfuscatedName("fu.d")
    public int[] field2726 = new int[16];

    @ObfuscatedName("fu.n")
    public int[] field2722 = new int[16];

    @ObfuscatedName("fu.v")
    public int[] field2725 = new int[16];

    @ObfuscatedName("fu.z")
    public int[] field2724 = new int[16];

    @ObfuscatedName("fu.j")
    public int[] field2729 = new int[16];

    @ObfuscatedName("fu.u")
    public int[] field2743 = new int[16];

    @ObfuscatedName("fu.g")
    public int[] field2727 = new int[16];

    @ObfuscatedName("fu.a")
    public int[] field2728 = new int[16];

    @ObfuscatedName("fu.r")
    public int[] field2720 = new int[16];

    @ObfuscatedName("fu.k")
    public int[] field2730 = new int[16];

    @ObfuscatedName("fu.b")
    public int[] field2731 = new int[16];

    @ObfuscatedName("fu.h")
    public int[] field2732 = new int[16];

    @ObfuscatedName("fu.i")
    public int[] field2733 = new int[16];

    @ObfuscatedName("fu.o")
    public int[] field2746 = new int[16];

    @ObfuscatedName("fu.m")
    public class165[][] field2721 = new class165[16][128];

    @ObfuscatedName("fu.ak")
    public class165[][] field2736 = new class165[16][128];

    @ObfuscatedName("fu.aw")
    public class160 field2737 = new class160();

    @ObfuscatedName("fu.af")
    public boolean field2738;

    @ObfuscatedName("fu.ab")
    public int field2739;

    @ObfuscatedName("fu.ao")
    public int field2740;

    @ObfuscatedName("fu.ah")
    public long field2741;

    @ObfuscatedName("fu.ae")
    public long field2742;

    @ObfuscatedName("fu.ax")
    public class164 field2734 = new class164(this);

    public class162() {
        this.method3059();
    }

    @ObfuscatedName("fu.t(II)V")
    public synchronized void method3069(int arg0) {
        this.field2718 = arg0;
    }

    @ObfuscatedName("fu.s(B)I")
    public int method3035() {
        return this.field2718;
    }

    @ObfuscatedName("fu.f(Lff;Leg;Lbf;II)Z")
    public synchronized boolean method3136(class158 arg0, class146 arg1, class53 arg2, int arg3) {
        arg0.method2964();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class175 var7 = (class175) arg0.field2679.method3202(); var7 != null; var7 = (class175) arg0.field2679.method3203()) {
            int var8 = (int) var7.field2864;
            class159 var9 = (class159) this.field2723.method3204((long) var8);
            if (var9 == null) {
                var9 = class159.method586(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field2723.method3212(var9, (long) var8);
            }
            if (!var9.method2966(arg2, var7.field2843, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method2962();
        }
        return var5;
    }

    @ObfuscatedName("fu.e(I)V")
    public synchronized void method3037() {
        for (class159 var1 = (class159) this.field2723.method3202(); var1 != null; var1 = (class159) this.field2723.method3203()) {
            var1.method2967();
        }
    }

    @ObfuscatedName("fu.d(B)V")
    public synchronized void method3058() {
        for (class159 var1 = (class159) this.field2723.method3202(); var1 != null; var1 = (class159) this.field2723.method3203()) {
            var1.method3316();
        }
    }

    @ObfuscatedName("fu.u(Lff;ZB)V")
    public synchronized void method3067(class158 arg0, boolean arg1) {
        this.method3038();
        this.field2737.method2973(arg0.field2678);
        this.field2738 = arg1;
        this.field2741 = 0L;
        int var3 = this.field2737.method2997();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2737.method2976(var4);
            this.field2737.method2979(var4);
            this.field2737.method2977(var4);
        }
        this.field2739 = this.field2737.method3009();
        this.field2740 = this.field2737.field2697[this.field2739];
        this.field2742 = this.field2737.method3010(this.field2740);
    }

    @ObfuscatedName("fu.a(B)V")
    public synchronized void method3038() {
        this.field2737.method2994();
        this.method3059();
    }

    @ObfuscatedName("fu.c(I)Z")
    public synchronized boolean method3039() {
        return this.field2737.method2974();
    }

    @ObfuscatedName("fu.w(III)V")
    public synchronized void method3083(int arg0, int arg1) {
        this.method3099(arg0, arg1);
    }

    @ObfuscatedName("fu.l(III)V")
    public void method3099(int arg0, int arg1) {
        this.field2725[arg0] = arg1;
        this.field2729[arg0] = arg1 & 0xFFFFFF80;
        this.method3050(arg0, arg1);
    }

    @ObfuscatedName("fu.q(III)V")
    public void method3050(int arg0, int arg1) {
        if (this.field2724[arg0] != arg1) {
            this.field2724[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2736[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("fu.x(IIIB)V")
    public void method3042(int arg0, int arg1, int arg2) {
        this.method3044(arg0, arg1, 64);
        if ((this.field2720[arg0] & 0x2) != 0) {
            for (class165 var4 = (class165) this.field2734.field2761.method3235(); var4 != null; var4 = (class165) this.field2734.field2761.method3242()) {
                if (var4.field2788 == arg0 && var4.field2781 < 0) {
                    this.field2721[arg0][var4.field2772] = null;
                    this.field2721[arg0][arg1] = var4;
                    int var5 = (var4.field2776 * var4.field2774 >> 12) + var4.field2775;
                    var4.field2775 += arg1 - var4.field2772 << 8;
                    var4.field2776 = var5 - var4.field2775;
                    var4.field2774 = 4096;
                    var4.field2772 = arg1;
                    return;
                }
            }
        }
        class159 var6 = (class159) this.field2723.method3204((long) this.field2724[arg0]);
        if (var6 == null) {
            return;
        }
        class56 var7 = var6.field2685[arg1];
        if (var7 == null) {
            return;
        }
        class165 var8 = new class165();
        var8.field2788 = arg0;
        var8.field2768 = var6;
        var8.field2769 = var7;
        var8.field2770 = var6.field2688[arg1];
        var8.field2771 = var6.field2680[arg1];
        var8.field2772 = arg1;
        var8.field2773 = var6.field2686 * arg2 * arg2 * var6.field2683[arg1] + 1024 >> 11;
        var8.field2789 = var6.field2684[arg1] & 0xFF;
        var8.field2775 = (arg1 << 8) - (var6.field2682[arg1] & 0x7FFF);
        var8.field2777 = 0;
        var8.field2767 = 0;
        var8.field2780 = 0;
        var8.field2781 = -1;
        var8.field2782 = 0;
        if (this.field2732[arg0] == 0) {
            var8.field2785 = class58.method1073(var7, this.method3056(var8), this.method3057(var8), this.method3055(var8));
        } else {
            var8.field2785 = class58.method1073(var7, this.method3056(var8), 0, this.method3055(var8));
            this.method3043(var8, var6.field2682[arg1] < 0);
        }
        if (var6.field2682[arg1] < 0) {
            var8.field2785.method1075(-1);
        }
        if (var8.field2771 >= 0) {
            class165 var9 = this.field2736[arg0][var8.field2771];
            if (var9 != null && var9.field2781 < 0) {
                this.field2721[arg0][var9.field2772] = null;
                var9.field2781 = 0;
            }
            this.field2736[arg0][var8.field2771] = var8;
        }
        this.field2734.field2761.method3260(var8);
        this.field2721[arg0][arg1] = var8;
    }

    @ObfuscatedName("fu.p(Lfw;ZI)V")
    public void method3043(class165 arg0, boolean arg1) {
        int var3 = arg0.field2769.field1121.length;
        int var5;
        if (arg1 && arg0.field2769.field1122) {
            int var4 = var3 + var3 - arg0.field2769.field1120;
            var5 = (int) ((long) this.field2732[arg0.field2788] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2785.method1195(true);
            }
        } else {
            var5 = (int) ((long) this.field2732[arg0.field2788] * (long) var3 >> 6);
        }
        arg0.field2785.method1081(var5);
    }

    @ObfuscatedName("fu.y(IIII)V")
    public void method3044(int arg0, int arg1, int arg2) {
        class165 var4 = this.field2721[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2721[arg0][arg1] = null;
        if ((this.field2720[arg0] & 0x2) == 0) {
            var4.field2781 = 0;
            return;
        }
        for (class165 var5 = (class165) this.field2734.field2761.method3239(); var5 != null; var5 = (class165) this.field2734.field2761.method3248()) {
            if (var4.field2788 == var5.field2788 && var5.field2781 < 0 && var4 != var5) {
                var4.field2781 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("fu.r(IIII)V")
    public void method3078(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("fu.k(III)V")
    public void method3046(int arg0, int arg1) {
    }

    @ObfuscatedName("fu.b(III)V")
    public void method3098(int arg0, int arg1) {
        this.field2743[arg0] = arg1;
    }

    @ObfuscatedName("fu.h(IB)V")
    public void method3128(int arg0) {
        for (class165 var2 = (class165) this.field2734.field2761.method3239(); var2 != null; var2 = (class165) this.field2734.field2761.method3248()) {
            if (arg0 < 0 || var2.field2788 == arg0) {
                if (var2.field2785 != null) {
                    var2.field2785.method1086(Statics.field1085 / 100);
                    if (var2.field2785.method1090()) {
                        this.field2734.field2764.method924(var2.field2785);
                    }
                    var2.method3154();
                }
                if (var2.field2781 < 0) {
                    this.field2721[var2.field2788][var2.field2772] = null;
                }
                var2.method3316();
            }
        }
    }

    @ObfuscatedName("fu.ae(II)V")
    public void method3049(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3049(var2);
            }
            return;
        }
        this.field2717[arg0] = 12800;
        this.field2726[arg0] = 8192;
        this.field2722[arg0] = 16383;
        this.field2743[arg0] = 8192;
        this.field2727[arg0] = 0;
        this.field2728[arg0] = 8192;
        this.method3052(arg0);
        this.method3053(arg0);
        this.field2720[arg0] = 0;
        this.field2730[arg0] = 32767;
        this.field2731[arg0] = 256;
        this.field2732[arg0] = 0;
        this.method3139(arg0, 8192);
    }

    @ObfuscatedName("fu.ax(II)V")
    public void method3126(int arg0) {
        for (class165 var2 = (class165) this.field2734.field2761.method3239(); var2 != null; var2 = (class165) this.field2734.field2761.method3248()) {
            if ((arg0 < 0 || var2.field2788 == arg0) && var2.field2781 < 0) {
                this.field2721[var2.field2788][var2.field2772] = null;
                var2.field2781 = 0;
            }
        }
    }

    @ObfuscatedName("fu.ar(B)V")
    public void method3059() {
        this.method3128(-1);
        this.method3049(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2724[var1] = this.field2725[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2729[var2] = this.field2725[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("fu.aq(IB)V")
    public void method3052(int arg0) {
        if ((this.field2720[arg0] & 0x2) == 0) {
            return;
        }
        for (class165 var2 = (class165) this.field2734.field2761.method3239(); var2 != null; var2 = (class165) this.field2734.field2761.method3248()) {
            if (var2.field2788 == arg0 && this.field2721[arg0][var2.field2772] == null && var2.field2781 < 0) {
                var2.field2781 = 0;
            }
        }
    }

    @ObfuscatedName("fu.az(II)V")
    public void method3053(int arg0) {
        if ((this.field2720[arg0] & 0x4) == 0) {
            return;
        }
        for (class165 var2 = (class165) this.field2734.field2761.method3239(); var2 != null; var2 = (class165) this.field2734.field2761.method3248()) {
            if (var2.field2788 == arg0) {
                var2.field2778 = 0;
            }
        }
    }

    @ObfuscatedName("fu.an(II)V")
    public void method3054(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3044(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3042(var6, var7, var8);
            } else {
                this.method3044(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3078(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2729[var12] = (var14 << 14) + (this.field2729[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2729[var12] = (var14 << 7) + (this.field2729[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2727[var12] = (var14 << 7) + (this.field2727[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2727[var12] = (this.field2727[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2728[var12] = (var14 << 7) + (this.field2728[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2728[var12] = (this.field2728[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2717[var12] = (var14 << 7) + (this.field2717[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2717[var12] = (this.field2717[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2726[var12] = (var14 << 7) + (this.field2726[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2726[var12] = (this.field2726[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2722[var12] = (var14 << 7) + (this.field2722[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2722[var12] = (this.field2722[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2720[var12] |= 0x1;
                } else {
                    this.field2720[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2720[var12] |= 0x2;
                } else {
                    this.method3052(var12);
                    this.field2720[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2730[var12] = (var14 << 7) + (this.field2730[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2730[var12] = (this.field2730[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2730[var12] = (var14 << 7) + (this.field2730[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2730[var12] = (this.field2730[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3128(var12);
            }
            if (var13 == 121) {
                this.method3049(var12);
            }
            if (var13 == 123) {
                this.method3126(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2730[var12];
                if (var15 == 16384) {
                    this.field2731[var12] = (var14 << 7) + (this.field2731[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2730[var12];
                if (var16 == 16384) {
                    this.field2731[var12] = (this.field2731[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2732[var12] = (var14 << 7) + (this.field2732[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2732[var12] = (this.field2732[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2720[var12] |= 0x4;
                } else {
                    this.method3053(var12);
                    this.field2720[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3139(var12, (var14 << 7) + (this.field2733[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3139(var12, (this.field2733[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3050(var17, this.field2729[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3046(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method3098(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3059();
            }
        }
    }

    @ObfuscatedName("fu.at(IIB)V")
    public void method3139(int arg0, int arg1) {
        this.field2733[arg0] = arg1;
        this.field2746[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("fu.aa(Lfw;B)I")
    public int method3056(class165 arg0) {
        int var2 = (arg0.field2776 * arg0.field2774 >> 12) + arg0.field2775;
        int var3 = ((this.field2743[arg0.field2788] - 8192) * this.field2731[arg0.field2788] >> 12) + var2;
        class163 var4 = arg0.field2770;
        if (var4.field2756 > 0 && (var4.field2748 > 0 || this.field2727[arg0.field2788] > 0)) {
            int var5 = var4.field2748 << 2;
            int var6 = var4.field2753 << 1;
            if (arg0.field2783 < var6) {
                var5 = arg0.field2783 * var5 / var6;
            }
            int var7 = (this.field2727[arg0.field2788] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2784 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2769.field1119 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1085 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("fu.ag(Lfw;I)I")
    public int method3057(class165 arg0) {
        class163 var2 = arg0.field2770;
        int var3 = this.field2722[arg0.field2788] * this.field2717[arg0.field2788] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2773 * var4 + 16384 >> 15;
        int var6 = this.field2718 * var5 + 128 >> 8;
        if (var2.field2759 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2777 * 1.953125E-5D * (double) var2.field2759) + 0.5D);
        }
        if (var2.field2750 != null) {
            int var7 = arg0.field2767;
            int var8 = var2.field2750[arg0.field2780 + 1];
            if (arg0.field2780 < var2.field2750.length - 2) {
                int var9 = (var2.field2750[arg0.field2780] & 0xFF) << 8;
                int var10 = (var2.field2750[arg0.field2780 + 2] & 0xFF) << 8;
                var8 += (var2.field2750[arg0.field2780 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2781 > 0 && var2.field2749 != null) {
            int var11 = arg0.field2781;
            int var12 = var2.field2749[arg0.field2782 + 1];
            if (arg0.field2782 < var2.field2749.length - 2) {
                int var13 = (var2.field2749[arg0.field2782] & 0xFF) << 8;
                int var14 = (var2.field2749[arg0.field2782 + 2] & 0xFF) << 8;
                var12 += (var2.field2749[arg0.field2782 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("fu.au(Lfw;I)I")
    public int method3055(class165 arg0) {
        int var2 = this.field2726[arg0.field2788];
        return var2 < 8192 ? arg0.field2789 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2789) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("fu.n()Lbe;")
    public synchronized class60 method929() {
        return this.field2734;
    }

    @ObfuscatedName("fu.v()Lbe;")
    public synchronized class60 method928() {
        return null;
    }

    @ObfuscatedName("fu.z()I")
    public synchronized int method931() {
        return 0;
    }

    @ObfuscatedName("fu.j([III)V")
    public synchronized void method932(int[] arg0, int arg1, int arg2) {
        if (this.field2737.method2974()) {
            int var4 = this.field2719 * this.field2737.field2694 / Statics.field1085;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2741;
                if (this.field2742 - var5 >= 0L) {
                    this.field2741 = var5;
                    break;
                }
                int var7 = (int) ((this.field2742 - this.field2741 + (long) var4 - 1L) / (long) var4);
                this.field2741 += (long) var4 * (long) var7;
                this.field2734.method932(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3064();
            } while (this.field2737.method2974());
        }
        this.field2734.method932(arg0, arg1, arg2);
    }

    @ObfuscatedName("fu.g(I)V")
    public synchronized void method934(int arg0) {
        if (this.field2737.method2974()) {
            int var2 = this.field2719 * this.field2737.field2694 / Statics.field1085;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2741;
                if (this.field2742 - var3 >= 0L) {
                    this.field2741 = var3;
                    break;
                }
                int var5 = (int) ((this.field2742 - this.field2741 + (long) var2 - 1L) / (long) var2);
                this.field2741 += (long) var2 * (long) var5;
                this.field2734.method934(var5);
                arg0 -= var5;
                this.method3064();
            } while (this.field2737.method2974());
        }
        this.field2734.method934(arg0);
    }

    @ObfuscatedName("fu.aj(I)V")
    public void method3064() {
        int var1 = this.field2739;
        int var2 = this.field2740;
        long var3 = this.field2742;
        while (this.field2740 == var2) {
            while (this.field2737.field2697[var1] == var2) {
                this.field2737.method2976(var1);
                int var5 = this.field2737.method2980(var1);
                if (var5 == 1) {
                    this.field2737.method2978();
                    this.field2737.method2977(var1);
                    if (this.field2737.method2985()) {
                        if (!this.field2738 || var2 == 0) {
                            this.method3059();
                            this.field2737.method2994();
                            return;
                        }
                        this.field2737.method3008(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3054(var5);
                }
                this.field2737.method2979(var1);
                this.field2737.method2977(var1);
            }
            var1 = this.field2737.method3009();
            var2 = this.field2737.field2697[var1];
            var3 = this.field2737.method3010(var2);
        }
        this.field2739 = var1;
        this.field2740 = var2;
        this.field2742 = var3;
    }

    @ObfuscatedName("fu.ay(Lfw;B)Z")
    public boolean method3133(class165 arg0) {
        if (arg0.field2785 != null) {
            return false;
        }
        if (arg0.field2781 >= 0) {
            arg0.method3316();
            if (arg0.field2771 > 0 && this.field2736[arg0.field2788][arg0.field2771] == arg0) {
                this.field2736[arg0.field2788][arg0.field2771] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("fu.ac(Lfw;[IIII)Z")
    public boolean method3061(class165 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2786 = Statics.field1085 / 100;
        if (arg0.field2781 >= 0 && arg0.field2785 == null || arg0.field2785.method1160()) {
            arg0.method3154();
            arg0.method3316();
            if (arg0.field2771 > 0 && this.field2736[arg0.field2788][arg0.field2771] == arg0) {
                this.field2736[arg0.field2788][arg0.field2771] = null;
            }
            return true;
        }
        int var5 = arg0.field2774;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2728[arg0.field2788] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2774 = var6;
        }
        arg0.field2785.method1216(this.method3056(arg0));
        class163 var7 = arg0.field2770;
        boolean var8 = false;
        arg0.field2783++;
        arg0.field2784 += var7.field2756;
        double var9 = (double) ((arg0.field2772 - 60 << 8) + (arg0.field2776 * arg0.field2774 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2759 > 0) {
            if (var7.field2754 > 0) {
                arg0.field2777 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2754 * var9) + 0.5D);
            } else {
                arg0.field2777 += 128;
            }
        }
        if (var7.field2750 != null) {
            if (var7.field2751 > 0) {
                arg0.field2767 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2751 * var9) + 0.5D);
            } else {
                arg0.field2767 += 128;
            }
            while (arg0.field2780 < var7.field2750.length - 2 && arg0.field2767 > (var7.field2750[arg0.field2780 + 2] & 0xFF) << 8) {
                arg0.field2780 += 2;
            }
            if (arg0.field2780 == var7.field2750.length - 2 && var7.field2750[arg0.field2780 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2781 >= 0 && var7.field2749 != null && (this.field2720[arg0.field2788] & 0x1) == 0 && (arg0.field2771 < 0 || this.field2736[arg0.field2788][arg0.field2771] != arg0)) {
            if (var7.field2752 > 0) {
                arg0.field2781 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2752 * var9) + 0.5D);
            } else {
                arg0.field2781 += 128;
            }
            while (arg0.field2782 < var7.field2749.length - 2 && arg0.field2781 > (var7.field2749[arg0.field2782 + 2] & 0xFF) << 8) {
                arg0.field2782 += 2;
            }
            if (arg0.field2782 == var7.field2749.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2785.method1085(arg0.field2786, this.method3057(arg0), this.method3055(arg0));
            return false;
        }
        arg0.field2785.method1086(arg0.field2786);
        if (arg1 == null) {
            arg0.field2785.method934(arg3);
        } else {
            arg0.field2785.method932(arg1, arg2, arg3);
        }
        if (arg0.field2785.method1090()) {
            this.field2734.field2764.method924(arg0.field2785);
        }
        arg0.method3154();
        if (arg0.field2781 >= 0) {
            arg0.method3316();
            if (arg0.field2771 > 0 && this.field2736[arg0.field2788][arg0.field2771] == arg0) {
                this.field2736[arg0.field2788][arg0.field2771] = null;
            }
        }
        return true;
    }
}
