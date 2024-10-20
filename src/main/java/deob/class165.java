package deob;

@ObfuscatedName("fe")
public class class165 extends class61 {

    @ObfuscatedName("fe.g")
    public class177 field2733 = new class177(128);

    @ObfuscatedName("fe.j")
    public int field2730 = 256;

    @ObfuscatedName("fe.z")
    public int field2731 = 1000000;

    @ObfuscatedName("fe.b")
    public int[] field2732 = new int[16];

    @ObfuscatedName("fe.k")
    public int[] field2740 = new int[16];

    @ObfuscatedName("fe.c")
    public int[] field2734 = new int[16];

    @ObfuscatedName("fe.l")
    public int[] field2729 = new int[16];

    @ObfuscatedName("fe.n")
    public int[] field2736 = new int[16];

    @ObfuscatedName("fe.d")
    public int[] field2758 = new int[16];

    @ObfuscatedName("fe.h")
    public int[] field2752 = new int[16];

    @ObfuscatedName("fe.y")
    public int[] field2739 = new int[16];

    @ObfuscatedName("fe.p")
    public int[] field2735 = new int[16];

    @ObfuscatedName("fe.q")
    public int[] field2742 = new int[16];

    @ObfuscatedName("fe.x")
    public int[] field2747 = new int[16];

    @ObfuscatedName("fe.t")
    public int[] field2744 = new int[16];

    @ObfuscatedName("fe.e")
    public int[] field2743 = new int[16];

    @ObfuscatedName("fe.m")
    public int[] field2746 = new int[16];

    @ObfuscatedName("fe.o")
    public int[] field2745 = new int[16];

    @ObfuscatedName("fe.a")
    public class168[][] field2748 = new class168[16][128];

    @ObfuscatedName("fe.am")
    public class168[][] field2749 = new class168[16][128];

    @ObfuscatedName("fe.ac")
    public class163 field2759 = new class163();

    @ObfuscatedName("fe.ap")
    public boolean field2751;

    @ObfuscatedName("fe.aq")
    public int field2737;

    @ObfuscatedName("fe.az")
    public int field2753;

    @ObfuscatedName("fe.ae")
    public long field2754;

    @ObfuscatedName("fe.at")
    public long field2755;

    @ObfuscatedName("fe.as")
    public class167 field2750 = new class167(this);

    public class165() {
        this.method2984();
    }

    @ObfuscatedName("fe.g(IB)V")
    public synchronized void method2965(int arg0) {
        this.field2730 = arg0;
    }

    @ObfuscatedName("fe.j(I)I")
    public int method2966() {
        return this.field2730;
    }

    @ObfuscatedName("fe.z(Lfd;Lei;Lbs;II)Z")
    public synchronized boolean method3041(class161 arg0, class149 arg1, class54 arg2, int arg3) {
        arg0.method2897();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class178 var7 = (class178) arg0.field2695.method3139(); var7 != null; var7 = (class178) arg0.field2695.method3146()) {
            int var8 = (int) var7.field2887;
            class162 var9 = (class162) this.field2733.method3140((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method2665(var8);
                class162 var11;
                if (var10 == null) {
                    var11 = null;
                } else {
                    var11 = new class162(var10);
                }
                var9 = var11;
                if (var11 == null) {
                    var5 = false;
                    continue;
                }
                this.field2733.method3137(var11, (long) var8);
            }
            if (!var9.method2907(arg2, var7.field2865, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method2898();
        }
        return var5;
    }

    @ObfuscatedName("fe.b(I)V")
    public synchronized void method3059() {
        for (class162 var1 = (class162) this.field2733.method3139(); var1 != null; var1 = (class162) this.field2733.method3146()) {
            var1.method2906();
        }
    }

    @ObfuscatedName("fe.k(B)V")
    public synchronized void method3039() {
        for (class162 var1 = (class162) this.field2733.method3139(); var1 != null; var1 = (class162) this.field2733.method3146()) {
            var1.method3259();
        }
    }

    @ObfuscatedName("fe.d(Lfd;ZS)V")
    public synchronized void method2970(class161 arg0, boolean arg1) {
        this.method3058();
        this.field2759.method2912(arg0.field2694);
        this.field2751 = arg1;
        this.field2754 = 0L;
        int var3 = this.field2759.method2919();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2759.method2915(var4);
            this.field2759.method2918(var4);
            this.field2759.method2914(var4);
        }
        this.field2737 = this.field2759.method2916();
        this.field2753 = this.field2759.field2709[this.field2737];
        this.field2755 = this.field2759.method2910(this.field2753);
    }

    @ObfuscatedName("fe.y(I)V")
    public synchronized void method3058() {
        this.field2759.method2913();
        this.method2984();
    }

    @ObfuscatedName("fe.p(I)Z")
    public synchronized boolean method3064() {
        return this.field2759.method2953();
    }

    @ObfuscatedName("fe.i(III)V")
    public synchronized void method3014(int arg0, int arg1) {
        this.method3019(arg0, arg1);
    }

    @ObfuscatedName("fe.s(III)V")
    public void method3019(int arg0, int arg1) {
        this.field2729[arg0] = arg1;
        this.field2758[arg0] = arg1 & 0xFFFFFF80;
        this.method3012(arg0, arg1);
    }

    @ObfuscatedName("fe.f(IIB)V")
    public void method3012(int arg0, int arg1) {
        if (this.field2736[arg0] != arg1) {
            this.field2736[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2749[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("fe.u(IIIB)V")
    public void method2975(int arg0, int arg1, int arg2) {
        this.method2977(arg0, arg1, 64);
        if ((this.field2742[arg0] & 0x2) != 0) {
            for (class168 var4 = (class168) this.field2750.field2775.method3183(); var4 != null; var4 = (class168) this.field2750.field2775.method3167()) {
                if (var4.field2785 == arg0 && var4.field2790 < 0) {
                    this.field2748[arg0][var4.field2781] = null;
                    this.field2748[arg0][arg1] = var4;
                    int var5 = (var4.field2787 * var4.field2786 >> 12) + var4.field2783;
                    var4.field2783 += arg1 - var4.field2781 << 8;
                    var4.field2787 = var5 - var4.field2783;
                    var4.field2786 = 4096;
                    var4.field2781 = arg1;
                    return;
                }
            }
        }
        class162 var6 = (class162) this.field2733.method3140((long) this.field2736[arg0]);
        if (var6 == null) {
            return;
        }
        class57 var7 = var6.field2697[arg1];
        if (var7 == null) {
            return;
        }
        class168 var8 = new class168();
        var8.field2785 = arg0;
        var8.field2778 = var6;
        var8.field2776 = var7;
        var8.field2792 = var6.field2703[arg1];
        var8.field2780 = var6.field2702[arg1];
        var8.field2781 = arg1;
        var8.field2782 = var6.field2701 * arg2 * arg2 * var6.field2699[arg1] + 1024 >> 11;
        var8.field2777 = var6.field2700[arg1] & 0xFF;
        var8.field2783 = (arg1 << 8) - (var6.field2698[arg1] & 0x7FFF);
        var8.field2779 = 0;
        var8.field2788 = 0;
        var8.field2789 = 0;
        var8.field2790 = -1;
        var8.field2791 = 0;
        if (this.field2743[arg0] == 0) {
            var8.field2794 = class59.method1153(var7, this.method2988(var8), this.method2989(var8), this.method2990(var8));
        } else {
            var8.field2794 = class59.method1153(var7, this.method2988(var8), 0, this.method2990(var8));
            this.method2976(var8, var6.field2698[arg1] < 0);
        }
        if (var6.field2698[arg1] < 0) {
            var8.field2794.method1068(-1);
        }
        if (var8.field2780 >= 0) {
            class168 var9 = this.field2749[arg0][var8.field2780];
            if (var9 != null && var9.field2790 < 0) {
                this.field2748[arg0][var9.field2781] = null;
                var9.field2790 = 0;
            }
            this.field2749[arg0][var8.field2780] = var8;
        }
        this.field2750.field2775.method3169(var8);
        this.field2748[arg0][arg1] = var8;
    }

    @ObfuscatedName("fe.v(Lfq;ZI)V")
    public void method2976(class168 arg0, boolean arg1) {
        int var3 = arg0.field2776.field1137.length;
        int var5;
        if (arg1 && arg0.field2776.field1141) {
            int var4 = var3 + var3 - arg0.field2776.field1139;
            var5 = (int) ((long) this.field2743[arg0.field2785] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2794.method1075(true);
            }
        } else {
            var5 = (int) ((long) this.field2743[arg0.field2785] * (long) var3 >> 6);
        }
        arg0.field2794.method1164(var5);
    }

    @ObfuscatedName("fe.r(IIIB)V")
    public void method2977(int arg0, int arg1, int arg2) {
        class168 var4 = this.field2748[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2748[arg0][arg1] = null;
        if ((this.field2742[arg0] & 0x2) == 0) {
            var4.field2790 = 0;
            return;
        }
        for (class168 var5 = (class168) this.field2750.field2775.method3174(); var5 != null; var5 = (class168) this.field2750.field2775.method3176()) {
            if (var4.field2785 == var5.field2785 && var5.field2790 < 0 && var4 != var5) {
                var4.field2790 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("fe.q(IIIB)V")
    public void method2978(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("fe.x(III)V")
    public void method2979(int arg0, int arg1) {
    }

    @ObfuscatedName("fe.t(IIS)V")
    public void method2980(int arg0, int arg1) {
        this.field2752[arg0] = arg1;
    }

    @ObfuscatedName("fe.e(IB)V")
    public void method2981(int arg0) {
        for (class168 var2 = (class168) this.field2750.field2775.method3174(); var2 != null; var2 = (class168) this.field2750.field2775.method3176()) {
            if (arg0 < 0 || var2.field2785 == arg0) {
                if (var2.field2794 != null) {
                    var2.field2794.method1079(Statics.field1093 / 100);
                    if (var2.field2794.method1083()) {
                        this.field2750.field2773.method913(var2.field2794);
                    }
                    var2.method3085();
                }
                if (var2.field2790 < 0) {
                    this.field2748[var2.field2785][var2.field2781] = null;
                }
                var2.method3259();
            }
        }
    }

    @ObfuscatedName("fe.m(II)V")
    public void method2982(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method2982(var2);
            }
            return;
        }
        this.field2732[arg0] = 12800;
        this.field2740[arg0] = 8192;
        this.field2734[arg0] = 16383;
        this.field2752[arg0] = 8192;
        this.field2739[arg0] = 0;
        this.field2735[arg0] = 8192;
        this.method2964(arg0);
        this.method2973(arg0);
        this.field2742[arg0] = 0;
        this.field2747[arg0] = 32767;
        this.field2744[arg0] = 256;
        this.field2743[arg0] = 0;
        this.method3053(arg0, 8192);
    }

    @ObfuscatedName("fe.o(II)V")
    public void method2983(int arg0) {
        for (class168 var2 = (class168) this.field2750.field2775.method3174(); var2 != null; var2 = (class168) this.field2750.field2775.method3176()) {
            if ((arg0 < 0 || var2.field2785 == arg0) && var2.field2790 < 0) {
                this.field2748[var2.field2785][var2.field2781] = null;
                var2.field2790 = 0;
            }
        }
    }

    @ObfuscatedName("fe.a(I)V")
    public void method2984() {
        this.method2981(-1);
        this.method2982(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2736[var1] = this.field2729[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2758[var2] = this.field2729[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("fe.am(II)V")
    public void method2964(int arg0) {
        if ((this.field2742[arg0] & 0x2) == 0) {
            return;
        }
        for (class168 var2 = (class168) this.field2750.field2775.method3174(); var2 != null; var2 = (class168) this.field2750.field2775.method3176()) {
            if (var2.field2785 == arg0 && this.field2748[arg0][var2.field2781] == null && var2.field2790 < 0) {
                var2.field2790 = 0;
            }
        }
    }

    @ObfuscatedName("fe.ac(II)V")
    public void method2973(int arg0) {
        if ((this.field2742[arg0] & 0x4) == 0) {
            return;
        }
        for (class168 var2 = (class168) this.field2750.field2775.method3174(); var2 != null; var2 = (class168) this.field2750.field2775.method3176()) {
            if (var2.field2785 == arg0) {
                var2.field2796 = 0;
            }
        }
    }

    @ObfuscatedName("fe.an(IB)V")
    public void method2987(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method2977(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method2975(var6, var7, var8);
            } else {
                this.method2977(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method2978(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2758[var12] = (var14 << 14) + (this.field2758[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2758[var12] = (var14 << 7) + (this.field2758[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2739[var12] = (var14 << 7) + (this.field2739[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2739[var12] = (this.field2739[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2735[var12] = (var14 << 7) + (this.field2735[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2735[var12] = (this.field2735[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2732[var12] = (var14 << 7) + (this.field2732[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2732[var12] = (this.field2732[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2740[var12] = (var14 << 7) + (this.field2740[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2740[var12] = (this.field2740[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2734[var12] = (var14 << 7) + (this.field2734[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2734[var12] = (this.field2734[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2742[var12] |= 0x1;
                } else {
                    this.field2742[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2742[var12] |= 0x2;
                } else {
                    this.method2964(var12);
                    this.field2742[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2747[var12] = (var14 << 7) + (this.field2747[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2747[var12] = (this.field2747[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2747[var12] = (var14 << 7) + (this.field2747[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2747[var12] = (this.field2747[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method2981(var12);
            }
            if (var13 == 121) {
                this.method2982(var12);
            }
            if (var13 == 123) {
                this.method2983(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2747[var12];
                if (var15 == 16384) {
                    this.field2744[var12] = (var14 << 7) + (this.field2744[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2747[var12];
                if (var16 == 16384) {
                    this.field2744[var12] = (this.field2744[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2743[var12] = (var14 << 7) + (this.field2743[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2743[var12] = (this.field2743[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2742[var12] |= 0x4;
                } else {
                    this.method2973(var12);
                    this.field2742[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3053(var12, (var14 << 7) + (this.field2746[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3053(var12, (this.field2746[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3012(var17, this.field2758[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method2979(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method2980(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method2984();
            }
        }
    }

    @ObfuscatedName("fe.al(III)V")
    public void method3053(int arg0, int arg1) {
        this.field2746[arg0] = arg1;
        this.field2745[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("fe.ag(Lfq;I)I")
    public int method2988(class168 arg0) {
        int var2 = (arg0.field2787 * arg0.field2786 >> 12) + arg0.field2783;
        int var3 = ((this.field2752[arg0.field2785] - 8192) * this.field2744[arg0.field2785] >> 12) + var2;
        class166 var4 = arg0.field2792;
        if (var4.field2767 > 0 && (var4.field2766 > 0 || this.field2739[arg0.field2785] > 0)) {
            int var5 = var4.field2766 << 2;
            int var6 = var4.field2760 << 1;
            if (arg0.field2784 < var6) {
                var5 = arg0.field2784 * var5 / var6;
            }
            int var7 = (this.field2739[arg0.field2785] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2793 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2776.field1138 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1093 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("fe.ah(Lfq;I)I")
    public int method2989(class168 arg0) {
        class166 var2 = arg0.field2792;
        int var3 = this.field2734[arg0.field2785] * this.field2732[arg0.field2785] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2782 * var4 + 16384 >> 15;
        int var6 = this.field2730 * var5 + 128 >> 8;
        if (var2.field2762 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2779 * 1.953125E-5D * (double) var2.field2762) + 0.5D);
        }
        if (var2.field2768 != null) {
            int var7 = arg0.field2788;
            int var8 = var2.field2768[arg0.field2789 + 1];
            if (arg0.field2789 < var2.field2768.length - 2) {
                int var9 = (var2.field2768[arg0.field2789] & 0xFF) << 8;
                int var10 = (var2.field2768[arg0.field2789 + 2] & 0xFF) << 8;
                var8 += (var2.field2768[arg0.field2789 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2790 > 0 && var2.field2761 != null) {
            int var11 = arg0.field2790;
            int var12 = var2.field2761[arg0.field2791 + 1];
            if (arg0.field2791 < var2.field2761.length - 2) {
                int var13 = (var2.field2761[arg0.field2791] & 0xFF) << 8;
                int var14 = (var2.field2761[arg0.field2791 + 2] & 0xFF) << 8;
                var12 += (var2.field2761[arg0.field2791 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("fe.aw(Lfq;I)I")
    public int method2990(class168 arg0) {
        int var2 = this.field2740[arg0.field2785];
        return var2 < 8192 ? arg0.field2777 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2777) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("fe.c()Lbr;")
    public synchronized class61 method936() {
        return this.field2750;
    }

    @ObfuscatedName("fe.w()Lbr;")
    public synchronized class61 method919() {
        return null;
    }

    @ObfuscatedName("fe.l()I")
    public synchronized int method914() {
        return 0;
    }

    @ObfuscatedName("fe.n([III)V")
    public synchronized void method912(int[] arg0, int arg1, int arg2) {
        if (this.field2759.method2953()) {
            int var4 = this.field2731 * this.field2759.field2706 / Statics.field1093;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2754;
                if (this.field2755 - var5 >= 0L) {
                    this.field2754 = var5;
                    break;
                }
                int var7 = (int) ((this.field2755 - this.field2754 + (long) var4 - 1L) / (long) var4);
                this.field2754 += (long) var4 * (long) var7;
                this.field2750.method912(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3072();
            } while (this.field2759.method2953());
        }
        this.field2750.method912(arg0, arg1, arg2);
    }

    @ObfuscatedName("fe.h(I)V")
    public synchronized void method949(int arg0) {
        if (this.field2759.method2953()) {
            int var2 = this.field2731 * this.field2759.field2706 / Statics.field1093;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2754;
                if (this.field2755 - var3 >= 0L) {
                    this.field2754 = var3;
                    break;
                }
                int var5 = (int) ((this.field2755 - this.field2754 + (long) var2 - 1L) / (long) var2);
                this.field2754 += (long) var2 * (long) var5;
                this.field2750.method949(var5);
                arg0 -= var5;
                this.method3072();
            } while (this.field2759.method2953());
        }
        this.field2750.method949(arg0);
    }

    @ObfuscatedName("fe.ai(B)V")
    public void method3072() {
        int var1 = this.field2737;
        int var2 = this.field2753;
        long var3 = this.field2755;
        while (this.field2753 == var2) {
            while (this.field2759.field2709[var1] == var2) {
                this.field2759.method2915(var1);
                int var5 = this.field2759.method2950(var1);
                if (var5 == 1) {
                    this.field2759.method2917();
                    this.field2759.method2914(var1);
                    if (this.field2759.method2924()) {
                        if (!this.field2751 || var2 == 0) {
                            this.method2984();
                            this.field2759.method2913();
                            return;
                        }
                        this.field2759.method2925(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method2987(var5);
                }
                this.field2759.method2918(var1);
                this.field2759.method2914(var1);
            }
            var1 = this.field2759.method2916();
            var2 = this.field2759.field2709[var1];
            var3 = this.field2759.method2910(var2);
        }
        this.field2737 = var1;
        this.field2753 = var2;
        this.field2755 = var3;
    }

    @ObfuscatedName("fe.ak(Lfq;S)Z")
    public boolean method2993(class168 arg0) {
        if (arg0.field2794 != null) {
            return false;
        }
        if (arg0.field2790 >= 0) {
            arg0.method3259();
            if (arg0.field2780 > 0 && this.field2749[arg0.field2785][arg0.field2780] == arg0) {
                this.field2749[arg0.field2785][arg0.field2780] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("fe.au(Lfq;[IIII)Z")
    public boolean method3008(class168 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2795 = Statics.field1093 / 100;
        if (arg0.field2790 >= 0 && arg0.field2794 == null || arg0.field2794.method1082()) {
            arg0.method3085();
            arg0.method3259();
            if (arg0.field2780 > 0 && this.field2749[arg0.field2785][arg0.field2780] == arg0) {
                this.field2749[arg0.field2785][arg0.field2780] = null;
            }
            return true;
        }
        int var5 = arg0.field2786;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2735[arg0.field2785] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2786 = var6;
        }
        arg0.field2794.method1080(this.method2988(arg0));
        class166 var7 = arg0.field2792;
        boolean var8 = false;
        arg0.field2784++;
        arg0.field2793 += var7.field2767;
        double var9 = (double) ((arg0.field2781 - 60 << 8) + (arg0.field2787 * arg0.field2786 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2762 > 0) {
            if (var7.field2765 > 0) {
                arg0.field2779 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2765 * var9) + 0.5D);
            } else {
                arg0.field2779 += 128;
            }
        }
        if (var7.field2768 != null) {
            if (var7.field2763 > 0) {
                arg0.field2788 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2763 * var9) + 0.5D);
            } else {
                arg0.field2788 += 128;
            }
            while (arg0.field2789 < var7.field2768.length - 2 && arg0.field2788 > (var7.field2768[arg0.field2789 + 2] & 0xFF) << 8) {
                arg0.field2789 += 2;
            }
            if (arg0.field2789 == var7.field2768.length - 2 && var7.field2768[arg0.field2789 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2790 >= 0 && var7.field2761 != null && (this.field2742[arg0.field2785] & 0x1) == 0 && (arg0.field2780 < 0 || this.field2749[arg0.field2785][arg0.field2780] != arg0)) {
            if (var7.field2764 > 0) {
                arg0.field2790 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2764 * var9) + 0.5D);
            } else {
                arg0.field2790 += 128;
            }
            while (arg0.field2791 < var7.field2761.length - 2 && arg0.field2790 > (var7.field2761[arg0.field2791 + 2] & 0xFF) << 8) {
                arg0.field2791 += 2;
            }
            if (arg0.field2791 == var7.field2761.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2794.method1078(arg0.field2795, this.method2989(arg0), this.method2990(arg0));
            return false;
        }
        arg0.field2794.method1079(arg0.field2795);
        if (arg1 == null) {
            arg0.field2794.method949(arg3);
        } else {
            arg0.field2794.method912(arg1, arg2, arg3);
        }
        if (arg0.field2794.method1083()) {
            this.field2750.field2773.method913(arg0.field2794);
        }
        arg0.method3085();
        if (arg0.field2790 >= 0) {
            arg0.method3259();
            if (arg0.field2780 > 0 && this.field2749[arg0.field2785][arg0.field2780] == arg0) {
                this.field2749[arg0.field2785][arg0.field2780] = null;
            }
        }
        return true;
    }
}
