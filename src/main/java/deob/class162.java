package deob;

@ObfuscatedName("fv")
public class class162 extends class60 {

    @ObfuscatedName("fv.k")
    public class174 field2731 = new class174(128);

    @ObfuscatedName("fv.b")
    public int field2722 = 256;

    @ObfuscatedName("fv.e")
    public int field2721 = 1000000;

    @ObfuscatedName("fv.i")
    public int[] field2724 = new int[16];

    @ObfuscatedName("fv.t")
    public int[] field2725 = new int[16];

    @ObfuscatedName("fv.z")
    public int[] field2726 = new int[16];

    @ObfuscatedName("fv.g")
    public int[] field2735 = new int[16];

    @ObfuscatedName("fv.c")
    public int[] field2728 = new int[16];

    @ObfuscatedName("fv.o")
    public int[] field2729 = new int[16];

    @ObfuscatedName("fv.q")
    public int[] field2741 = new int[16];

    @ObfuscatedName("fv.y")
    public int[] field2740 = new int[16];

    @ObfuscatedName("fv.p")
    public int[] field2738 = new int[16];

    @ObfuscatedName("fv.v")
    public int[] field2745 = new int[16];

    @ObfuscatedName("fv.s")
    public int[] field2723 = new int[16];

    @ObfuscatedName("fv.r")
    public int[] field2749 = new int[16];

    @ObfuscatedName("fv.j")
    public int[] field2736 = new int[16];

    @ObfuscatedName("fv.h")
    public int[] field2730 = new int[16];

    @ObfuscatedName("fv.d")
    public int[] field2737 = new int[16];

    @ObfuscatedName("fv.l")
    public class165[][] field2739 = new class165[16][128];

    @ObfuscatedName("fv.ag")
    public class165[][] field2733 = new class165[16][128];

    @ObfuscatedName("fv.au")
    public class160 field2727 = new class160();

    @ObfuscatedName("fv.ak")
    public boolean field2742;

    @ObfuscatedName("fv.aw")
    public int field2743;

    @ObfuscatedName("fv.at")
    public int field2744;

    @ObfuscatedName("fv.ah")
    public long field2734;

    @ObfuscatedName("fv.aj")
    public long field2746;

    @ObfuscatedName("fv.an")
    public class164 field2747 = new class164(this);

    public class162() {
        this.method3047();
    }

    @ObfuscatedName("fv.k(II)V")
    public synchronized void method3030(int arg0) {
        this.field2722 = arg0;
    }

    @ObfuscatedName("fv.b(B)I")
    public int method3031() {
        return this.field2722;
    }

    @ObfuscatedName("fv.e(Lfa;Ley;Lbl;II)Z")
    public synchronized boolean method3029(class158 arg0, class146 arg1, class53 arg2, int arg3) {
        arg0.method2940();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class175 var7 = (class175) arg0.field2684.method3199(); var7 != null; var7 = (class175) arg0.field2684.method3193()) {
            int var8 = (int) var7.field2867;
            class159 var9 = (class159) this.field2731.method3197((long) var8);
            if (var9 == null) {
                var9 = class159.method2897(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field2731.method3191(var9, (long) var8);
            }
            if (!var9.method2958(arg2, var7.field2846, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method2939();
        }
        return var5;
    }

    @ObfuscatedName("fv.i(I)V")
    public synchronized void method3032() {
        for (class159 var1 = (class159) this.field2731.method3199(); var1 != null; var1 = (class159) this.field2731.method3193()) {
            var1.method2947();
        }
    }

    @ObfuscatedName("fv.t(I)V")
    public synchronized void method3121() {
        for (class159 var1 = (class159) this.field2731.method3199(); var1 != null; var1 = (class159) this.field2731.method3193()) {
            var1.method3321();
        }
    }

    @ObfuscatedName("fv.q(Lfa;ZB)V")
    public synchronized void method3099(class158 arg0, boolean arg1) {
        this.method3103();
        this.field2727.method2975(arg0.field2683);
        this.field2742 = arg1;
        this.field2734 = 0L;
        int var3 = this.field2727.method2966();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2727.method2974(var4);
            this.field2727.method2970(var4);
            this.field2727.method2968(var4);
        }
        this.field2743 = this.field2727.method2989();
        this.field2744 = this.field2727.field2702[this.field2743];
        this.field2746 = this.field2727.method3003(this.field2744);
    }

    @ObfuscatedName("fv.y(B)V")
    public synchronized void method3103() {
        this.field2727.method2964();
        this.method3047();
    }

    @ObfuscatedName("fv.p(B)Z")
    public synchronized boolean method3036() {
        return this.field2727.method2965();
    }

    @ObfuscatedName("fv.m(IIB)V")
    public synchronized void method3037(int arg0, int arg1) {
        this.method3108(arg0, arg1);
    }

    @ObfuscatedName("fv.a(III)V")
    public void method3108(int arg0, int arg1) {
        this.field2735[arg0] = arg1;
        this.field2729[arg0] = arg1 & 0xFFFFFF80;
        this.method3039(arg0, arg1);
    }

    @ObfuscatedName("fv.u(III)V")
    public void method3039(int arg0, int arg1) {
        if (this.field2728[arg0] != arg1) {
            this.field2728[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2733[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("fv.n(IIII)V")
    public void method3050(int arg0, int arg1, int arg2) {
        this.method3038(arg0, arg1, 64);
        if ((this.field2745[arg0] & 0x2) != 0) {
            for (class165 var4 = (class165) this.field2747.field2769.method3239(); var4 != null; var4 = (class165) this.field2747.field2769.method3231()) {
                if (var4.field2779 == arg0 && var4.field2777 < 0) {
                    this.field2739[arg0][var4.field2772] = null;
                    this.field2739[arg0][arg1] = var4;
                    int var5 = (var4.field2782 * var4.field2781 >> 12) + var4.field2780;
                    var4.field2780 += arg1 - var4.field2772 << 8;
                    var4.field2781 = var5 - var4.field2780;
                    var4.field2782 = 4096;
                    var4.field2772 = arg1;
                    return;
                }
            }
        }
        class159 var6 = (class159) this.field2731.method3197((long) this.field2728[arg0]);
        if (var6 == null) {
            return;
        }
        class56 var7 = var6.field2686[arg1];
        if (var7 == null) {
            return;
        }
        class165 var8 = new class165();
        var8.field2779 = arg0;
        var8.field2773 = var6;
        var8.field2774 = var7;
        var8.field2775 = var6.field2692[arg1];
        var8.field2786 = var6.field2688[arg1];
        var8.field2772 = arg1;
        var8.field2778 = var6.field2691 * arg2 * arg2 * var6.field2685[arg1] + 1024 >> 11;
        var8.field2783 = var6.field2689[arg1] & 0xFF;
        var8.field2780 = (arg1 << 8) - (var6.field2693[arg1] & 0x7FFF);
        var8.field2791 = 0;
        var8.field2788 = 0;
        var8.field2785 = 0;
        var8.field2777 = -1;
        var8.field2787 = 0;
        if (this.field2736[arg0] == 0) {
            var8.field2790 = class58.method1101(var7, this.method3051(var8), this.method3042(var8), this.method3127(var8));
        } else {
            var8.field2790 = class58.method1101(var7, this.method3051(var8), 0, this.method3127(var8));
            this.method3041(var8, var6.field2693[arg1] < 0);
        }
        if (var6.field2693[arg1] < 0) {
            var8.field2790.method1097(-1);
        }
        if (var8.field2786 >= 0) {
            class165 var9 = this.field2733[arg0][var8.field2786];
            if (var9 != null && var9.field2777 < 0) {
                this.field2739[arg0][var9.field2772] = null;
                var9.field2777 = 0;
            }
            this.field2733[arg0][var8.field2786] = var8;
        }
        this.field2747.field2769.method3223(var8);
        this.field2739[arg0][arg1] = var8;
    }

    @ObfuscatedName("fv.x(Lfd;ZI)V")
    public void method3041(class165 arg0, boolean arg1) {
        int var3 = arg0.field2774.field1130.length;
        int var5;
        if (arg1 && arg0.field2774.field1132) {
            int var4 = var3 + var3 - arg0.field2774.field1129;
            var5 = (int) ((long) this.field2736[arg0.field2779] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2790.method1103(true);
            }
        } else {
            var5 = (int) ((long) this.field2736[arg0.field2779] * (long) var3 >> 6);
        }
        arg0.field2790.method1102(var5);
    }

    @ObfuscatedName("fv.f(IIII)V")
    public void method3038(int arg0, int arg1, int arg2) {
        class165 var4 = this.field2739[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2739[arg0][arg1] = null;
        if ((this.field2745[arg0] & 0x2) == 0) {
            var4.field2777 = 0;
            return;
        }
        for (class165 var5 = (class165) this.field2747.field2769.method3228(); var5 != null; var5 = (class165) this.field2747.field2769.method3254()) {
            if (var4.field2779 == var5.field2779 && var5.field2777 < 0 && var4 != var5) {
                var4.field2777 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("fv.v(IIII)V")
    public void method3110(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("fv.s(III)V")
    public void method3054(int arg0, int arg1) {
    }

    @ObfuscatedName("fv.r(III)V")
    public void method3043(int arg0, int arg1) {
        this.field2741[arg0] = arg1;
    }

    @ObfuscatedName("fv.j(II)V")
    public void method3060(int arg0) {
        for (class165 var2 = (class165) this.field2747.field2769.method3228(); var2 != null; var2 = (class165) this.field2747.field2769.method3254()) {
            if (arg0 < 0 || var2.field2779 == arg0) {
                if (var2.field2790 != null) {
                    var2.field2790.method1107(Statics.field1075 / 100);
                    if (var2.field2790.method1208()) {
                        this.field2747.field2768.method958(var2.field2790);
                    }
                    var2.method3143();
                }
                if (var2.field2777 < 0) {
                    this.field2739[var2.field2779][var2.field2772] = null;
                }
                var2.method3321();
            }
        }
    }

    @ObfuscatedName("fv.h(II)V")
    public void method3045(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3045(var2);
            }
            return;
        }
        this.field2724[arg0] = 12800;
        this.field2725[arg0] = 8192;
        this.field2726[arg0] = 16383;
        this.field2741[arg0] = 8192;
        this.field2740[arg0] = 0;
        this.field2738[arg0] = 8192;
        this.method3048(arg0);
        this.method3049(arg0);
        this.field2745[arg0] = 0;
        this.field2723[arg0] = 32767;
        this.field2749[arg0] = 256;
        this.field2736[arg0] = 0;
        this.method3087(arg0, 8192);
    }

    @ObfuscatedName("fv.at(II)V")
    public void method3046(int arg0) {
        for (class165 var2 = (class165) this.field2747.field2769.method3228(); var2 != null; var2 = (class165) this.field2747.field2769.method3254()) {
            if ((arg0 < 0 || var2.field2779 == arg0) && var2.field2777 < 0) {
                this.field2739[var2.field2779][var2.field2772] = null;
                var2.field2777 = 0;
            }
        }
    }

    @ObfuscatedName("fv.aj(I)V")
    public void method3047() {
        this.method3060(-1);
        this.method3045(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2728[var1] = this.field2735[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2729[var2] = this.field2735[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("fv.an(IB)V")
    public void method3048(int arg0) {
        if ((this.field2745[arg0] & 0x2) == 0) {
            return;
        }
        for (class165 var2 = (class165) this.field2747.field2769.method3228(); var2 != null; var2 = (class165) this.field2747.field2769.method3254()) {
            if (var2.field2779 == arg0 && this.field2739[arg0][var2.field2772] == null && var2.field2777 < 0) {
                var2.field2777 = 0;
            }
        }
    }

    @ObfuscatedName("fv.ay(II)V")
    public void method3049(int arg0) {
        if ((this.field2745[arg0] & 0x4) == 0) {
            return;
        }
        for (class165 var2 = (class165) this.field2747.field2769.method3228(); var2 != null; var2 = (class165) this.field2747.field2769.method3254()) {
            if (var2.field2779 == arg0) {
                var2.field2792 = 0;
            }
        }
    }

    @ObfuscatedName("fv.ab(II)V")
    public void method3033(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3038(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3050(var6, var7, var8);
            } else {
                this.method3038(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3110(var9, var10, var11);
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
                this.field2740[var12] = (var14 << 7) + (this.field2740[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2740[var12] = (this.field2740[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2738[var12] = (var14 << 7) + (this.field2738[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2738[var12] = (this.field2738[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2724[var12] = (var14 << 7) + (this.field2724[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2724[var12] = (this.field2724[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2725[var12] = (var14 << 7) + (this.field2725[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2725[var12] = (this.field2725[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2726[var12] = (var14 << 7) + (this.field2726[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2726[var12] = (this.field2726[var12] & 0xFFFFFF80) + var14;
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
                    this.method3048(var12);
                    this.field2745[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2723[var12] = (var14 << 7) + (this.field2723[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2723[var12] = (this.field2723[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2723[var12] = (var14 << 7) + (this.field2723[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2723[var12] = (this.field2723[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3060(var12);
            }
            if (var13 == 121) {
                this.method3045(var12);
            }
            if (var13 == 123) {
                this.method3046(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2723[var12];
                if (var15 == 16384) {
                    this.field2749[var12] = (var14 << 7) + (this.field2749[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2723[var12];
                if (var16 == 16384) {
                    this.field2749[var12] = (this.field2749[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2736[var12] = (var14 << 7) + (this.field2736[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2736[var12] = (this.field2736[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2745[var12] |= 0x4;
                } else {
                    this.method3049(var12);
                    this.field2745[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3087(var12, (var14 << 7) + (this.field2730[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3087(var12, (this.field2730[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3039(var17, this.field2729[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3054(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method3043(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3047();
            }
        }
    }

    @ObfuscatedName("fv.az(III)V")
    public void method3087(int arg0, int arg1) {
        this.field2730[arg0] = arg1;
        this.field2737[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("fv.ad(Lfd;I)I")
    public int method3051(class165 arg0) {
        int var2 = (arg0.field2782 * arg0.field2781 >> 12) + arg0.field2780;
        int var3 = ((this.field2741[arg0.field2779] - 8192) * this.field2749[arg0.field2779] >> 12) + var2;
        class163 var4 = arg0.field2775;
        if (var4.field2759 > 0 && (var4.field2758 > 0 || this.field2740[arg0.field2779] > 0)) {
            int var5 = var4.field2758 << 2;
            int var6 = var4.field2760 << 1;
            if (arg0.field2789 < var6) {
                var5 = arg0.field2789 * var5 / var6;
            }
            int var7 = (this.field2740[arg0.field2779] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2776 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2774.field1128 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1075 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("fv.ao(Lfd;I)I")
    public int method3042(class165 arg0) {
        class163 var2 = arg0.field2775;
        int var3 = this.field2726[arg0.field2779] * this.field2724[arg0.field2779] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2778 * var4 + 16384 >> 15;
        int var6 = this.field2722 * var5 + 128 >> 8;
        if (var2.field2754 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2791 * 1.953125E-5D * (double) var2.field2754) + 0.5D);
        }
        if (var2.field2755 != null) {
            int var7 = arg0.field2788;
            int var8 = var2.field2755[arg0.field2785 + 1];
            if (arg0.field2785 < var2.field2755.length - 2) {
                int var9 = (var2.field2755[arg0.field2785] & 0xFF) << 8;
                int var10 = (var2.field2755[arg0.field2785 + 2] & 0xFF) << 8;
                var8 += (var2.field2755[arg0.field2785 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2777 > 0 && var2.field2756 != null) {
            int var11 = arg0.field2777;
            int var12 = var2.field2756[arg0.field2787 + 1];
            if (arg0.field2787 < var2.field2756.length - 2) {
                int var13 = (var2.field2756[arg0.field2787] & 0xFF) << 8;
                int var14 = (var2.field2756[arg0.field2787 + 2] & 0xFF) << 8;
                var12 += (var2.field2756[arg0.field2787 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("fv.am(Lfd;I)I")
    public int method3127(class165 arg0) {
        int var2 = this.field2725[arg0.field2779];
        return var2 < 8192 ? arg0.field2783 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2783) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("fv.z()Lbh;")
    public synchronized class60 method948() {
        return this.field2747;
    }

    @ObfuscatedName("fv.g()Lbh;")
    public synchronized class60 method942() {
        return null;
    }

    @ObfuscatedName("fv.c()I")
    public synchronized int method951() {
        return 0;
    }

    @ObfuscatedName("fv.o([III)V")
    public synchronized void method979(int[] arg0, int arg1, int arg2) {
        if (this.field2727.method2965()) {
            int var4 = this.field2721 * this.field2727.field2698 / Statics.field1075;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2734;
                if (this.field2746 - var5 >= 0L) {
                    this.field2734 = var5;
                    break;
                }
                int var7 = (int) ((this.field2746 - this.field2734 + (long) var4 - 1L) / (long) var4);
                this.field2734 += (long) var4 * (long) var7;
                this.field2747.method979(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3055();
            } while (this.field2727.method2965());
        }
        this.field2747.method979(arg0, arg1, arg2);
    }

    @ObfuscatedName("fv.w(I)V")
    public synchronized void method943(int arg0) {
        if (this.field2727.method2965()) {
            int var2 = this.field2721 * this.field2727.field2698 / Statics.field1075;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2734;
                if (this.field2746 - var3 >= 0L) {
                    this.field2734 = var3;
                    break;
                }
                int var5 = (int) ((this.field2746 - this.field2734 + (long) var2 - 1L) / (long) var2);
                this.field2734 += (long) var2 * (long) var5;
                this.field2747.method943(var5);
                arg0 -= var5;
                this.method3055();
            } while (this.field2727.method2965());
        }
        this.field2747.method943(arg0);
    }

    @ObfuscatedName("fv.al(B)V")
    public void method3055() {
        int var1 = this.field2743;
        int var2 = this.field2744;
        long var3 = this.field2746;
        while (this.field2744 == var2) {
            while (this.field2727.field2702[var1] == var2) {
                this.field2727.method2974(var1);
                int var5 = this.field2727.method2971(var1);
                if (var5 == 1) {
                    this.field2727.method2962();
                    this.field2727.method2968(var1);
                    if (this.field2727.method3008()) {
                        if (!this.field2742 || var2 == 0) {
                            this.method3047();
                            this.field2727.method2964();
                            return;
                        }
                        this.field2727.method2999(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3033(var5);
                }
                this.field2727.method2970(var1);
                this.field2727.method2968(var1);
            }
            var1 = this.field2727.method2989();
            var2 = this.field2727.field2702[var1];
            var3 = this.field2727.method3003(var2);
        }
        this.field2743 = var1;
        this.field2744 = var2;
        this.field2746 = var3;
    }

    @ObfuscatedName("fv.ac(Lfd;I)Z")
    public boolean method3056(class165 arg0) {
        if (arg0.field2790 != null) {
            return false;
        }
        if (arg0.field2777 >= 0) {
            arg0.method3321();
            if (arg0.field2786 > 0 && this.field2733[arg0.field2779][arg0.field2786] == arg0) {
                this.field2733[arg0.field2779][arg0.field2786] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("fv.ax(Lfd;[IIIB)Z")
    public boolean method3057(class165 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2784 = Statics.field1075 / 100;
        if (arg0.field2777 >= 0 && arg0.field2790 == null || arg0.field2790.method1179()) {
            arg0.method3143();
            arg0.method3321();
            if (arg0.field2786 > 0 && this.field2733[arg0.field2779][arg0.field2786] == arg0) {
                this.field2733[arg0.field2779][arg0.field2786] = null;
            }
            return true;
        }
        int var5 = arg0.field2782;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2738[arg0.field2779] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2782 = var6;
        }
        arg0.field2790.method1117(this.method3051(arg0));
        class163 var7 = arg0.field2775;
        boolean var8 = false;
        arg0.field2789++;
        arg0.field2776 += var7.field2759;
        double var9 = (double) ((arg0.field2772 - 60 << 8) + (arg0.field2782 * arg0.field2781 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2754 > 0) {
            if (var7.field2757 > 0) {
                arg0.field2791 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2757 * var9) + 0.5D);
            } else {
                arg0.field2791 += 128;
            }
        }
        if (var7.field2755 != null) {
            if (var7.field2752 > 0) {
                arg0.field2788 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2752 * var9) + 0.5D);
            } else {
                arg0.field2788 += 128;
            }
            while (arg0.field2785 < var7.field2755.length - 2 && arg0.field2788 > (var7.field2755[arg0.field2785 + 2] & 0xFF) << 8) {
                arg0.field2785 += 2;
            }
            if (arg0.field2785 == var7.field2755.length - 2 && var7.field2755[arg0.field2785 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2777 >= 0 && var7.field2756 != null && (this.field2745[arg0.field2779] & 0x1) == 0 && (arg0.field2786 < 0 || this.field2733[arg0.field2779][arg0.field2786] != arg0)) {
            if (var7.field2761 > 0) {
                arg0.field2777 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2761 * var9) + 0.5D);
            } else {
                arg0.field2777 += 128;
            }
            while (arg0.field2787 < var7.field2756.length - 2 && arg0.field2777 > (var7.field2756[arg0.field2787 + 2] & 0xFF) << 8) {
                arg0.field2787 += 2;
            }
            if (arg0.field2787 == var7.field2756.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2790.method1115(arg0.field2784, this.method3042(arg0), this.method3127(arg0));
            return false;
        }
        arg0.field2790.method1107(arg0.field2784);
        if (arg1 == null) {
            arg0.field2790.method943(arg3);
        } else {
            arg0.field2790.method979(arg1, arg2, arg3);
        }
        if (arg0.field2790.method1208()) {
            this.field2747.field2768.method958(arg0.field2790);
        }
        arg0.method3143();
        if (arg0.field2777 >= 0) {
            arg0.method3321();
            if (arg0.field2786 > 0 && this.field2733[arg0.field2779][arg0.field2786] == arg0) {
                this.field2733[arg0.field2779][arg0.field2786] = null;
            }
        }
        return true;
    }
}
