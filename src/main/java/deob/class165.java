package deob;

@ObfuscatedName("fq")
public class class165 extends class61 {

    @ObfuscatedName("fq.c")
    public class177 field2760 = new class177(128);

    @ObfuscatedName("fq.j")
    public int field2736 = 256;

    @ObfuscatedName("fq.y")
    public int field2745 = 1000000;

    @ObfuscatedName("fq.r")
    public int[] field2738 = new int[16];

    @ObfuscatedName("fq.f")
    public int[] field2753 = new int[16];

    @ObfuscatedName("fq.l")
    public int[] field2746 = new int[16];

    @ObfuscatedName("fq.b")
    public int[] field2741 = new int[16];

    @ObfuscatedName("fq.k")
    public int[] field2742 = new int[16];

    @ObfuscatedName("fq.g")
    public int[] field2743 = new int[16];

    @ObfuscatedName("fq.v")
    public int[] field2744 = new int[16];

    @ObfuscatedName("fq.i")
    public int[] field2739 = new int[16];

    @ObfuscatedName("fq.x")
    public int[] field2750 = new int[16];

    @ObfuscatedName("fq.a")
    public int[] field2757 = new int[16];

    @ObfuscatedName("fq.d")
    public int[] field2735 = new int[16];

    @ObfuscatedName("fq.m")
    public int[] field2749 = new int[16];

    @ObfuscatedName("fq.q")
    public int[] field2752 = new int[16];

    @ObfuscatedName("fq.e")
    public int[] field2758 = new int[16];

    @ObfuscatedName("fq.t")
    public int[] field2754 = new int[16];

    @ObfuscatedName("fq.o")
    public class168[][] field2755 = new class168[16][128];

    @ObfuscatedName("fq.at")
    public class168[][] field2756 = new class168[16][128];

    @ObfuscatedName("fq.ag")
    public class163 field2759 = new class163();

    @ObfuscatedName("fq.ae")
    public boolean field2740;

    @ObfuscatedName("fq.ak")
    public int field2737;

    @ObfuscatedName("fq.ap")
    public int field2751;

    @ObfuscatedName("fq.ao")
    public long field2761;

    @ObfuscatedName("fq.ac")
    public long field2762;

    @ObfuscatedName("fq.as")
    public class167 field2763 = new class167(this);

    public class165() {
        this.method3055();
    }

    @ObfuscatedName("fq.c(II)V")
    public synchronized void method3056(int arg0) {
        this.field2736 = arg0;
    }

    @ObfuscatedName("fq.j(B)I")
    public int method3057() {
        return this.field2736;
    }

    @ObfuscatedName("fq.y(Lfc;Ler;Lbh;II)Z")
    public synchronized boolean method3058(class161 arg0, class149 arg1, class54 arg2, int arg3) {
        arg0.method2975();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class178 var7 = (class178) arg0.field2697.method3220(); var7 != null; var7 = (class178) arg0.field2697.method3210()) {
            int var8 = (int) var7.field2886;
            class162 var9 = (class162) this.field2760.method3206((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method2751(var8);
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
                this.field2760.method3207(var11, (long) var8);
            }
            if (!var9.method2987(arg2, var7.field2865, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method2976();
        }
        return var5;
    }

    @ObfuscatedName("fq.r(B)V")
    public synchronized void method3059() {
        for (class162 var1 = (class162) this.field2760.method3220(); var1 != null; var1 = (class162) this.field2760.method3210()) {
            var1.method2985();
        }
    }

    @ObfuscatedName("fq.f(B)V")
    public synchronized void method3060() {
        for (class162 var1 = (class162) this.field2760.method3220(); var1 != null; var1 = (class162) this.field2760.method3210()) {
            var1.method3334();
        }
    }

    @ObfuscatedName("fq.v(Lfc;ZI)V")
    public synchronized void method3126(class161 arg0, boolean arg1) {
        this.method3107();
        this.field2759.method2993(arg0.field2696);
        this.field2740 = arg1;
        this.field2761 = 0L;
        int var3 = this.field2759.method2997();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2759.method3042(var4);
            this.field2759.method3000(var4);
            this.field2759.method2998(var4);
        }
        this.field2737 = this.field2759.method3006();
        this.field2751 = this.field2759.field2723[this.field2737];
        this.field2762 = this.field2759.method3004(this.field2751);
    }

    @ObfuscatedName("fq.x(B)V")
    public synchronized void method3107() {
        this.field2759.method2994();
        this.method3055();
    }

    @ObfuscatedName("fq.h(B)Z")
    public synchronized boolean method3063() {
        return this.field2759.method2995();
    }

    @ObfuscatedName("fq.w(IIB)V")
    public synchronized void method3092(int arg0, int arg1) {
        this.method3065(arg0, arg1);
    }

    @ObfuscatedName("fq.s(III)V")
    public void method3065(int arg0, int arg1) {
        this.field2741[arg0] = arg1;
        this.field2743[arg0] = arg1 & 0xFFFFFF80;
        this.method3099(arg0, arg1);
    }

    @ObfuscatedName("fq.p(III)V")
    public void method3099(int arg0, int arg1) {
        if (this.field2742[arg0] != arg1) {
            this.field2742[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2756[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("fq.z(IIII)V")
    public void method3085(int arg0, int arg1, int arg2) {
        this.method3081(arg0, arg1, 64);
        if ((this.field2757[arg0] & 0x2) != 0) {
            for (class168 var4 = (class168) this.field2763.field2776.method3247(); var4 != null; var4 = (class168) this.field2763.field2776.method3246()) {
                if (var4.field2784 == arg0 && var4.field2794 < 0) {
                    this.field2755[arg0][var4.field2785] = null;
                    this.field2755[arg0][arg1] = var4;
                    int var5 = (var4.field2796 * var4.field2789 >> 12) + var4.field2788;
                    var4.field2788 += arg1 - var4.field2785 << 8;
                    var4.field2796 = var5 - var4.field2788;
                    var4.field2789 = 4096;
                    var4.field2785 = arg1;
                    return;
                }
            }
        }
        class162 var6 = (class162) this.field2760.method3206((long) this.field2742[arg0]);
        if (var6 == null) {
            return;
        }
        class57 var7 = var6.field2698[arg1];
        if (var7 == null) {
            return;
        }
        class168 var8 = new class168();
        var8.field2784 = arg0;
        var8.field2781 = var6;
        var8.field2790 = var7;
        var8.field2783 = var6.field2709[arg1];
        var8.field2797 = var6.field2704[arg1];
        var8.field2785 = arg1;
        var8.field2786 = var6.field2705 * arg2 * arg2 * var6.field2701[arg1] + 1024 >> 11;
        var8.field2787 = var6.field2702[arg1] & 0xFF;
        var8.field2788 = (arg1 << 8) - (var6.field2700[arg1] & 0x7FFF);
        var8.field2791 = 0;
        var8.field2804 = 0;
        var8.field2793 = 0;
        var8.field2794 = -1;
        var8.field2795 = 0;
        if (this.field2752[arg0] == 0) {
            var8.field2798 = class59.method1228(var7, this.method3079(var8), this.method3084(var8), this.method3083(var8));
        } else {
            var8.field2798 = class59.method1228(var7, this.method3079(var8), 0, this.method3083(var8));
            this.method3067(var8, var6.field2700[arg1] < 0);
        }
        if (var6.field2700[arg1] < 0) {
            var8.field2798.method1152(-1);
        }
        if (var8.field2797 >= 0) {
            class168 var9 = this.field2756[arg0][var8.field2797];
            if (var9 != null && var9.field2794 < 0) {
                this.field2755[arg0][var9.field2785] = null;
                var9.field2794 = 0;
            }
            this.field2756[arg0][var8.field2797] = var8;
        }
        this.field2763.field2776.method3241(var8);
        this.field2755[arg0][arg1] = var8;
    }

    @ObfuscatedName("fq.n(Lfj;ZB)V")
    public void method3067(class168 arg0, boolean arg1) {
        int var3 = arg0.field2790.field1130.length;
        int var5;
        if (arg1 && arg0.field2790.field1129) {
            int var4 = var3 + var3 - arg0.field2790.field1133;
            var5 = (int) ((long) this.field2752[arg0.field2784] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2798.method1109(true);
            }
        } else {
            var5 = (int) ((long) this.field2752[arg0.field2784] * (long) var3 >> 6);
        }
        arg0.field2798.method1162(var5);
    }

    @ObfuscatedName("fq.u(IIIB)V")
    public void method3081(int arg0, int arg1, int arg2) {
        class168 var4 = this.field2755[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2755[arg0][arg1] = null;
        if ((this.field2757[arg0] & 0x2) == 0) {
            var4.field2794 = 0;
            return;
        }
        for (class168 var5 = (class168) this.field2763.field2776.method3249(); var5 != null; var5 = (class168) this.field2763.field2776.method3248()) {
            if (var4.field2784 == var5.field2784 && var5.field2794 < 0 && var4 != var5) {
                var4.field2794 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("fq.a(IIII)V")
    public void method3068(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("fq.d(III)V")
    public void method3069(int arg0, int arg1) {
    }

    @ObfuscatedName("fq.m(III)V")
    public void method3070(int arg0, int arg1) {
        this.field2744[arg0] = arg1;
    }

    @ObfuscatedName("fq.q(IB)V")
    public void method3082(int arg0) {
        for (class168 var2 = (class168) this.field2763.field2776.method3249(); var2 != null; var2 = (class168) this.field2763.field2776.method3248()) {
            if (arg0 < 0 || var2.field2784 == arg0) {
                if (var2.field2798 != null) {
                    var2.field2798.method1123(Statics.field1814 / 100);
                    if (var2.field2798.method1165()) {
                        this.field2763.field2777.method956(var2.field2798);
                    }
                    var2.method3155();
                }
                if (var2.field2794 < 0) {
                    this.field2755[var2.field2784][var2.field2785] = null;
                }
                var2.method3334();
            }
        }
    }

    @ObfuscatedName("fq.e(II)V")
    public void method3072(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3072(var2);
            }
            return;
        }
        this.field2738[arg0] = 12800;
        this.field2753[arg0] = 8192;
        this.field2746[arg0] = 16383;
        this.field2744[arg0] = 8192;
        this.field2739[arg0] = 0;
        this.field2750[arg0] = 8192;
        this.method3075(arg0);
        this.method3076(arg0);
        this.field2757[arg0] = 0;
        this.field2735[arg0] = 32767;
        this.field2749[arg0] = 256;
        this.field2752[arg0] = 0;
        this.method3078(arg0, 8192);
    }

    @ObfuscatedName("fq.t(IB)V")
    public void method3073(int arg0) {
        for (class168 var2 = (class168) this.field2763.field2776.method3249(); var2 != null; var2 = (class168) this.field2763.field2776.method3248()) {
            if ((arg0 < 0 || var2.field2784 == arg0) && var2.field2794 < 0) {
                this.field2755[var2.field2784][var2.field2785] = null;
                var2.field2794 = 0;
            }
        }
    }

    @ObfuscatedName("fq.o(I)V")
    public void method3055() {
        this.method3082(-1);
        this.method3072(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2742[var1] = this.field2741[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2743[var2] = this.field2741[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("fq.aj(IB)V")
    public void method3075(int arg0) {
        if ((this.field2757[arg0] & 0x2) == 0) {
            return;
        }
        for (class168 var2 = (class168) this.field2763.field2776.method3249(); var2 != null; var2 = (class168) this.field2763.field2776.method3248()) {
            if (var2.field2784 == arg0 && this.field2755[arg0][var2.field2785] == null && var2.field2794 < 0) {
                var2.field2794 = 0;
            }
        }
    }

    @ObfuscatedName("fq.am(II)V")
    public void method3076(int arg0) {
        if ((this.field2757[arg0] & 0x4) == 0) {
            return;
        }
        for (class168 var2 = (class168) this.field2763.field2776.method3249(); var2 != null; var2 = (class168) this.field2763.field2776.method3248()) {
            if (var2.field2784 == arg0) {
                var2.field2782 = 0;
            }
        }
    }

    @ObfuscatedName("fq.ay(IB)V")
    public void method3077(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3081(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3085(var6, var7, var8);
            } else {
                this.method3081(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3068(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2743[var12] = (var14 << 14) + (this.field2743[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2743[var12] = (var14 << 7) + (this.field2743[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2739[var12] = (var14 << 7) + (this.field2739[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2739[var12] = (this.field2739[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2750[var12] = (var14 << 7) + (this.field2750[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2750[var12] = (this.field2750[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2738[var12] = (var14 << 7) + (this.field2738[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2738[var12] = (this.field2738[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2753[var12] = (var14 << 7) + (this.field2753[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2753[var12] = (this.field2753[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2746[var12] = (var14 << 7) + (this.field2746[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2746[var12] = (this.field2746[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2757[var12] |= 0x1;
                } else {
                    this.field2757[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2757[var12] |= 0x2;
                } else {
                    this.method3075(var12);
                    this.field2757[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2735[var12] = (var14 << 7) + (this.field2735[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2735[var12] = (this.field2735[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2735[var12] = (var14 << 7) + (this.field2735[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2735[var12] = (this.field2735[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3082(var12);
            }
            if (var13 == 121) {
                this.method3072(var12);
            }
            if (var13 == 123) {
                this.method3073(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2735[var12];
                if (var15 == 16384) {
                    this.field2749[var12] = (var14 << 7) + (this.field2749[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2735[var12];
                if (var16 == 16384) {
                    this.field2749[var12] = (this.field2749[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2752[var12] = (var14 << 7) + (this.field2752[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2752[var12] = (this.field2752[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2757[var12] |= 0x4;
                } else {
                    this.method3076(var12);
                    this.field2757[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3078(var12, (var14 << 7) + (this.field2758[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3078(var12, (this.field2758[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3099(var17, this.field2743[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3069(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method3070(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3055();
            }
        }
    }

    @ObfuscatedName("fq.au(III)V")
    public void method3078(int arg0, int arg1) {
        this.field2758[arg0] = arg1;
        this.field2754[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("fq.aa(Lfj;I)I")
    public int method3079(class168 arg0) {
        int var2 = (arg0.field2796 * arg0.field2789 >> 12) + arg0.field2788;
        int var3 = ((this.field2744[arg0.field2784] - 8192) * this.field2749[arg0.field2784] >> 12) + var2;
        class166 var4 = arg0.field2783;
        if (var4.field2769 > 0 && (var4.field2773 > 0 || this.field2739[arg0.field2784] > 0)) {
            int var5 = var4.field2773 << 2;
            int var6 = var4.field2774 << 1;
            if (arg0.field2801 < var6) {
                var5 = arg0.field2801 * var5 / var6;
            }
            int var7 = (this.field2739[arg0.field2784] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2792 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2790.field1131 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1814 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("fq.av(Lfj;B)I")
    public int method3084(class168 arg0) {
        class166 var2 = arg0.field2783;
        int var3 = this.field2746[arg0.field2784] * this.field2738[arg0.field2784] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2786 * var4 + 16384 >> 15;
        int var6 = this.field2736 * var5 + 128 >> 8;
        if (var2.field2768 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2791 * 1.953125E-5D * (double) var2.field2768) + 0.5D);
        }
        if (var2.field2766 != null) {
            int var7 = arg0.field2804;
            int var8 = var2.field2766[arg0.field2793 + 1];
            if (arg0.field2793 < var2.field2766.length - 2) {
                int var9 = (var2.field2766[arg0.field2793] & 0xFF) << 8;
                int var10 = (var2.field2766[arg0.field2793 + 2] & 0xFF) << 8;
                var8 += (var2.field2766[arg0.field2793 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2794 > 0 && var2.field2772 != null) {
            int var11 = arg0.field2794;
            int var12 = var2.field2772[arg0.field2795 + 1];
            if (arg0.field2795 < var2.field2772.length - 2) {
                int var13 = (var2.field2772[arg0.field2795] & 0xFF) << 8;
                int var14 = (var2.field2772[arg0.field2795 + 2] & 0xFF) << 8;
                var12 += (var2.field2772[arg0.field2795 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("fq.aw(Lfj;I)I")
    public int method3083(class168 arg0) {
        int var2 = this.field2753[arg0.field2784];
        return var2 < 8192 ? arg0.field2787 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2787) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("fq.l()Lbr;")
    public synchronized class61 method961() {
        return this.field2763;
    }

    @ObfuscatedName("fq.b()Lbr;")
    public synchronized class61 method962() {
        return null;
    }

    @ObfuscatedName("fq.k()I")
    public synchronized int method963() {
        return 0;
    }

    @ObfuscatedName("fq.g([III)V")
    public synchronized void method986(int[] arg0, int arg1, int arg2) {
        if (this.field2759.method2995()) {
            int var4 = this.field2745 * this.field2759.field2710 / Statics.field1814;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2761;
                if (this.field2762 - var5 >= 0L) {
                    this.field2761 = var5;
                    break;
                }
                int var7 = (int) ((this.field2762 - this.field2761 + (long) var4 - 1L) / (long) var4);
                this.field2761 += (long) var4 * (long) var7;
                this.field2763.method986(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3139();
            } while (this.field2759.method2995());
        }
        this.field2763.method986(arg0, arg1, arg2);
    }

    @ObfuscatedName("fq.i(I)V")
    public synchronized void method964(int arg0) {
        if (this.field2759.method2995()) {
            int var2 = this.field2745 * this.field2759.field2710 / Statics.field1814;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2761;
                if (this.field2762 - var3 >= 0L) {
                    this.field2761 = var3;
                    break;
                }
                int var5 = (int) ((this.field2762 - this.field2761 + (long) var2 - 1L) / (long) var2);
                this.field2761 += (long) var2 * (long) var5;
                this.field2763.method964(var5);
                arg0 -= var5;
                this.method3139();
            } while (this.field2759.method2995());
        }
        this.field2763.method964(arg0);
    }

    @ObfuscatedName("fq.al(I)V")
    public void method3139() {
        int var1 = this.field2737;
        int var2 = this.field2751;
        long var3 = this.field2762;
        while (this.field2751 == var2) {
            while (this.field2759.field2723[var1] == var2) {
                this.field2759.method3042(var1);
                int var5 = this.field2759.method3001(var1);
                if (var5 == 1) {
                    this.field2759.method2999();
                    this.field2759.method2998(var1);
                    if (this.field2759.method3030()) {
                        if (!this.field2740 || var2 == 0) {
                            this.method3055();
                            this.field2759.method2994();
                            return;
                        }
                        this.field2759.method3039(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3077(var5);
                }
                this.field2759.method3000(var1);
                this.field2759.method2998(var1);
            }
            var1 = this.field2759.method3006();
            var2 = this.field2759.field2723[var1];
            var3 = this.field2759.method3004(var2);
        }
        this.field2737 = var1;
        this.field2751 = var2;
        this.field2762 = var3;
    }

    @ObfuscatedName("fq.ar(Lfj;I)Z")
    public boolean method3090(class168 arg0) {
        if (arg0.field2798 != null) {
            return false;
        }
        if (arg0.field2794 >= 0) {
            arg0.method3334();
            if (arg0.field2797 > 0 && this.field2756[arg0.field2784][arg0.field2797] == arg0) {
                this.field2756[arg0.field2784][arg0.field2797] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("fq.ax(Lfj;[IIII)Z")
    public boolean method3137(class168 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2799 = Statics.field1814 / 100;
        if (arg0.field2794 >= 0 && arg0.field2798 == null || arg0.field2798.method1125()) {
            arg0.method3155();
            arg0.method3334();
            if (arg0.field2797 > 0 && this.field2756[arg0.field2784][arg0.field2797] == arg0) {
                this.field2756[arg0.field2784][arg0.field2797] = null;
            }
            return true;
        }
        int var5 = arg0.field2789;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2750[arg0.field2784] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2789 = var6;
        }
        arg0.field2798.method1221(this.method3079(arg0));
        class166 var7 = arg0.field2783;
        boolean var8 = false;
        arg0.field2801++;
        arg0.field2792 += var7.field2769;
        double var9 = (double) ((arg0.field2785 - 60 << 8) + (arg0.field2796 * arg0.field2789 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2768 > 0) {
            if (var7.field2771 > 0) {
                arg0.field2791 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2771 * var9) + 0.5D);
            } else {
                arg0.field2791 += 128;
            }
        }
        if (var7.field2766 != null) {
            if (var7.field2767 > 0) {
                arg0.field2804 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2767 * var9) + 0.5D);
            } else {
                arg0.field2804 += 128;
            }
            while (arg0.field2793 < var7.field2766.length - 2 && arg0.field2804 > (var7.field2766[arg0.field2793 + 2] & 0xFF) << 8) {
                arg0.field2793 += 2;
            }
            if (arg0.field2793 == var7.field2766.length - 2 && var7.field2766[arg0.field2793 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2794 >= 0 && var7.field2772 != null && (this.field2757[arg0.field2784] & 0x1) == 0 && (arg0.field2797 < 0 || this.field2756[arg0.field2784][arg0.field2797] != arg0)) {
            if (var7.field2770 > 0) {
                arg0.field2794 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2770 * var9) + 0.5D);
            } else {
                arg0.field2794 += 128;
            }
            while (arg0.field2795 < var7.field2772.length - 2 && arg0.field2794 > (var7.field2772[arg0.field2795 + 2] & 0xFF) << 8) {
                arg0.field2795 += 2;
            }
            if (arg0.field2795 == var7.field2772.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2798.method1122(arg0.field2799, this.method3084(arg0), this.method3083(arg0));
            return false;
        }
        arg0.field2798.method1123(arg0.field2799);
        if (arg1 == null) {
            arg0.field2798.method964(arg3);
        } else {
            arg0.field2798.method986(arg1, arg2, arg3);
        }
        if (arg0.field2798.method1165()) {
            this.field2763.field2777.method956(arg0.field2798);
        }
        arg0.method3155();
        if (arg0.field2794 >= 0) {
            arg0.method3334();
            if (arg0.field2797 > 0 && this.field2756[arg0.field2784][arg0.field2797] == arg0) {
                this.field2756[arg0.field2784][arg0.field2797] = null;
            }
        }
        return true;
    }
}
