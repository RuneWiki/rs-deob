package deob;

@ObfuscatedName("fo")
public class class163 extends class60 {

    @ObfuscatedName("fo.n")
    public class175 field2731 = new class175(128);

    @ObfuscatedName("fo.x")
    public int field2728 = 256;

    @ObfuscatedName("fo.k")
    public int field2748 = 1000000;

    @ObfuscatedName("fo.i")
    public int[] field2727 = new int[16];

    @ObfuscatedName("fo.d")
    public int[] field2730 = new int[16];

    @ObfuscatedName("fo.q")
    public int[] field2732 = new int[16];

    @ObfuscatedName("fo.m")
    public int[] field2733 = new int[16];

    @ObfuscatedName("fo.a")
    public int[] field2734 = new int[16];

    @ObfuscatedName("fo.e")
    public int[] field2735 = new int[16];

    @ObfuscatedName("fo.o")
    public int[] field2747 = new int[16];

    @ObfuscatedName("fo.v")
    public int[] field2737 = new int[16];

    @ObfuscatedName("fo.z")
    public int[] field2738 = new int[16];

    @ObfuscatedName("fo.f")
    public int[] field2740 = new int[16];

    @ObfuscatedName("fo.g")
    public int[] field2741 = new int[16];

    @ObfuscatedName("fo.s")
    public int[] field2742 = new int[16];

    @ObfuscatedName("fo.y")
    public int[] field2744 = new int[16];

    @ObfuscatedName("fo.p")
    public int[] field2746 = new int[16];

    @ObfuscatedName("fo.b")
    public int[] field2745 = new int[16];

    @ObfuscatedName("fo.l")
    public class166[][] field2757 = new class166[16][128];

    @ObfuscatedName("fo.al")
    public class166[][] field2729 = new class166[16][128];

    @ObfuscatedName("fo.aa")
    public class161 field2743 = new class161();

    @ObfuscatedName("fo.ar")
    public boolean field2749;

    @ObfuscatedName("fo.ak")
    public int field2750;

    @ObfuscatedName("fo.ay")
    public int field2751;

    @ObfuscatedName("fo.aw")
    public long field2752;

    @ObfuscatedName("fo.av")
    public long field2753;

    @ObfuscatedName("fo.at")
    public class165 field2754 = new class165(this);

    public class163() {
        this.method3007();
    }

    @ObfuscatedName("fo.n(II)V")
    public synchronized void method3051(int arg0) {
        this.field2728 = arg0;
    }

    @ObfuscatedName("fo.x(I)I")
    public int method3008() {
        return this.field2728;
    }

    @ObfuscatedName("fo.k(Lfz;Lej;Lbf;IB)Z")
    public synchronized boolean method2992(class159 arg0, class147 arg1, class53 arg2, int arg3) {
        arg0.method2896();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class176 var7 = (class176) arg0.field2690.method3153(); var7 != null; var7 = (class176) arg0.field2690.method3151()) {
            int var8 = (int) var7.field2888;
            class160 var9 = (class160) this.field2731.method3149((long) var8);
            if (var9 == null) {
                var9 = class160.method2630(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field2731.method3156(var9, (long) var8);
            }
            if (!var9.method2905(arg2, var7.field2866, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method2902();
        }
        return var5;
    }

    @ObfuscatedName("fo.i(B)V")
    public synchronized void method2993() {
        for (class160 var1 = (class160) this.field2731.method3153(); var1 != null; var1 = (class160) this.field2731.method3151()) {
            var1.method2907();
        }
    }

    @ObfuscatedName("fo.d(B)V")
    public synchronized void method2994() {
        for (class160 var1 = (class160) this.field2731.method3153(); var1 != null; var1 = (class160) this.field2731.method3151()) {
            var1.method3277();
        }
    }

    @ObfuscatedName("fo.e(Lfz;ZI)V")
    public synchronized void method3041(class159 arg0, boolean arg1) {
        this.method2996();
        this.field2743.method2940(arg0.field2691);
        this.field2749 = arg1;
        this.field2752 = 0L;
        int var3 = this.field2743.method2919();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2743.method2920(var4);
            this.field2743.method2923(var4);
            this.field2743.method2916(var4);
        }
        this.field2750 = this.field2743.method2928();
        this.field2751 = this.field2743.field2702[this.field2750];
        this.field2753 = this.field2743.method2927(this.field2751);
    }

    @ObfuscatedName("fo.v(B)V")
    public synchronized void method2996() {
        this.field2743.method2942();
        this.method3007();
    }

    @ObfuscatedName("fo.z(I)Z")
    public synchronized boolean method3073() {
        return this.field2743.method2933();
    }

    @ObfuscatedName("fo.j(III)V")
    public synchronized void method2997(int arg0, int arg1) {
        this.method2998(arg0, arg1);
    }

    @ObfuscatedName("fo.r(III)V")
    public void method2998(int arg0, int arg1) {
        this.field2733[arg0] = arg1;
        this.field2735[arg0] = arg1 & 0xFFFFFF80;
        this.method2999(arg0, arg1);
    }

    @ObfuscatedName("fo.c(III)V")
    public void method2999(int arg0, int arg1) {
        if (this.field2734[arg0] != arg1) {
            this.field2734[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2729[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("fo.u(IIII)V")
    public void method2991(int arg0, int arg1, int arg2) {
        this.method3002(arg0, arg1, 64);
        if ((this.field2740[arg0] & 0x2) != 0) {
            for (class166 var4 = (class166) this.field2754.field2774.method3187(); var4 != null; var4 = (class166) this.field2754.field2774.method3194()) {
                if (var4.field2803 == arg0 && var4.field2795 < 0) {
                    this.field2757[arg0][var4.field2792] = null;
                    this.field2757[arg0][arg1] = var4;
                    int var5 = (var4.field2790 * var4.field2789 >> 12) + var4.field2781;
                    var4.field2781 += arg1 - var4.field2792 << 8;
                    var4.field2790 = var5 - var4.field2781;
                    var4.field2789 = 4096;
                    var4.field2792 = arg1;
                    return;
                }
            }
        }
        class160 var6 = (class160) this.field2731.method3149((long) this.field2734[arg0]);
        if (var6 == null) {
            return;
        }
        class56 var7 = var6.field2693[arg1];
        if (var7 == null) {
            return;
        }
        class166 var8 = new class166();
        var8.field2803 = arg0;
        var8.field2782 = var6;
        var8.field2783 = var7;
        var8.field2787 = var6.field2697[arg1];
        var8.field2785 = var6.field2692[arg1];
        var8.field2792 = arg1;
        var8.field2786 = var6.field2699 * arg2 * arg2 * var6.field2695[arg1] + 1024 >> 11;
        var8.field2788 = var6.field2696[arg1] & 0xFF;
        var8.field2781 = (arg1 << 8) - (var6.field2694[arg1] & 0x7FFF);
        var8.field2784 = 0;
        var8.field2793 = 0;
        var8.field2794 = 0;
        var8.field2795 = -1;
        var8.field2796 = 0;
        if (this.field2744[arg0] == 0) {
            var8.field2799 = class58.method1115(var7, this.method3012(var8), this.method3013(var8), this.method3014(var8));
        } else {
            var8.field2799 = class58.method1115(var7, this.method3012(var8), 0, this.method3014(var8));
            this.method3000(var8, var6.field2694[arg1] < 0);
        }
        if (var6.field2694[arg1] < 0) {
            var8.field2799.method1117(-1);
        }
        if (var8.field2785 >= 0) {
            class166 var9 = this.field2729[arg0][var8.field2785];
            if (var9 != null && var9.field2795 < 0) {
                this.field2757[arg0][var9.field2792] = null;
                var9.field2795 = 0;
            }
            this.field2729[arg0][var8.field2785] = var8;
        }
        this.field2754.field2774.method3181(var8);
        this.field2757[arg0][arg1] = var8;
    }

    @ObfuscatedName("fo.h(Lff;ZI)V")
    public void method3000(class166 arg0, boolean arg1) {
        int var3 = arg0.field2783.field1127.length;
        int var5;
        if (arg1 && arg0.field2783.field1130) {
            int var4 = var3 + var3 - arg0.field2783.field1126;
            var5 = (int) ((long) this.field2744[arg0.field2803] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2799.method1124(true);
            }
        } else {
            var5 = (int) ((long) this.field2744[arg0.field2803] * (long) var3 >> 6);
        }
        arg0.field2799.method1123(var5);
    }

    @ObfuscatedName("fo.t(IIII)V")
    public void method3002(int arg0, int arg1, int arg2) {
        class166 var4 = this.field2757[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2757[arg0][arg1] = null;
        if ((this.field2740[arg0] & 0x2) == 0) {
            var4.field2795 = 0;
            return;
        }
        for (class166 var5 = (class166) this.field2754.field2774.method3179(); var5 != null; var5 = (class166) this.field2754.field2774.method3199()) {
            if (var4.field2803 == var5.field2803 && var5.field2795 < 0 && var4 != var5) {
                var4.field2795 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("fo.f(IIIB)V")
    public void method3020(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("fo.g(III)V")
    public void method3003(int arg0, int arg1) {
    }

    @ObfuscatedName("fo.s(III)V")
    public void method3021(int arg0, int arg1) {
        this.field2747[arg0] = arg1;
    }

    @ObfuscatedName("fo.y(II)V")
    public void method3004(int arg0) {
        for (class166 var2 = (class166) this.field2754.field2774.method3179(); var2 != null; var2 = (class166) this.field2754.field2774.method3199()) {
            if (arg0 < 0 || var2.field2803 == arg0) {
                if (var2.field2799 != null) {
                    var2.field2799.method1128(Statics.field1082 / 100);
                    if (var2.field2799.method1132()) {
                        this.field2754.field2775.method956(var2.field2799);
                    }
                    var2.method3104();
                }
                if (var2.field2795 < 0) {
                    this.field2757[var2.field2803][var2.field2792] = null;
                }
                var2.method3277();
            }
        }
    }

    @ObfuscatedName("fo.p(II)V")
    public void method3005(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3005(var2);
            }
            return;
        }
        this.field2727[arg0] = 12800;
        this.field2730[arg0] = 8192;
        this.field2732[arg0] = 16383;
        this.field2747[arg0] = 8192;
        this.field2737[arg0] = 0;
        this.field2738[arg0] = 8192;
        this.method3055(arg0);
        this.method3080(arg0);
        this.field2740[arg0] = 0;
        this.field2741[arg0] = 32767;
        this.field2742[arg0] = 256;
        this.field2744[arg0] = 0;
        this.method3011(arg0, 8192);
    }

    @ObfuscatedName("fo.b(IB)V")
    public void method3024(int arg0) {
        for (class166 var2 = (class166) this.field2754.field2774.method3179(); var2 != null; var2 = (class166) this.field2754.field2774.method3199()) {
            if ((arg0 < 0 || var2.field2803 == arg0) && var2.field2795 < 0) {
                this.field2757[var2.field2803][var2.field2792] = null;
                var2.field2795 = 0;
            }
        }
    }

    @ObfuscatedName("fo.l(I)V")
    public void method3007() {
        this.method3004(-1);
        this.method3005(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2734[var1] = this.field2733[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2735[var2] = this.field2733[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("fo.al(II)V")
    public void method3055(int arg0) {
        if ((this.field2740[arg0] & 0x2) == 0) {
            return;
        }
        for (class166 var2 = (class166) this.field2754.field2774.method3179(); var2 != null; var2 = (class166) this.field2754.field2774.method3199()) {
            if (var2.field2803 == arg0 && this.field2757[arg0][var2.field2792] == null && var2.field2795 < 0) {
                var2.field2795 = 0;
            }
        }
    }

    @ObfuscatedName("fo.aa(II)V")
    public void method3080(int arg0) {
        if ((this.field2740[arg0] & 0x4) == 0) {
            return;
        }
        for (class166 var2 = (class166) this.field2754.field2774.method3179(); var2 != null; var2 = (class166) this.field2754.field2774.method3199()) {
            if (var2.field2803 == arg0) {
                var2.field2801 = 0;
            }
        }
    }

    @ObfuscatedName("fo.ae(II)V")
    public void method3010(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3002(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method2991(var6, var7, var8);
            } else {
                this.method3002(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3020(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2735[var12] = (var14 << 14) + (this.field2735[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2735[var12] = (var14 << 7) + (this.field2735[var12] & 0xFFFFC07F);
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
                this.field2727[var12] = (var14 << 7) + (this.field2727[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2727[var12] = (this.field2727[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2730[var12] = (var14 << 7) + (this.field2730[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2730[var12] = (this.field2730[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2732[var12] = (var14 << 7) + (this.field2732[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2732[var12] = (this.field2732[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2740[var12] |= 0x1;
                } else {
                    this.field2740[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2740[var12] |= 0x2;
                } else {
                    this.method3055(var12);
                    this.field2740[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2741[var12] = (var14 << 7) + (this.field2741[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2741[var12] = (this.field2741[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2741[var12] = (var14 << 7) + (this.field2741[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2741[var12] = (this.field2741[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3004(var12);
            }
            if (var13 == 121) {
                this.method3005(var12);
            }
            if (var13 == 123) {
                this.method3024(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2741[var12];
                if (var15 == 16384) {
                    this.field2742[var12] = (var14 << 7) + (this.field2742[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2741[var12];
                if (var16 == 16384) {
                    this.field2742[var12] = (this.field2742[var12] & 0xFFFFFF80) + var14;
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
                    this.field2740[var12] |= 0x4;
                } else {
                    this.method3080(var12);
                    this.field2740[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3011(var12, (var14 << 7) + (this.field2746[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3011(var12, (this.field2746[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method2999(var17, this.field2735[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3003(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method3021(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3007();
            }
        }
    }

    @ObfuscatedName("fo.ai(IIB)V")
    public void method3011(int arg0, int arg1) {
        this.field2746[arg0] = arg1;
        this.field2745[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("fo.as(Lff;I)I")
    public int method3012(class166 arg0) {
        int var2 = (arg0.field2790 * arg0.field2789 >> 12) + arg0.field2781;
        int var3 = ((this.field2747[arg0.field2803] - 8192) * this.field2742[arg0.field2803] >> 12) + var2;
        class164 var4 = arg0.field2787;
        if (var4.field2765 > 0 && (var4.field2764 > 0 || this.field2737[arg0.field2803] > 0)) {
            int var5 = var4.field2764 << 2;
            int var6 = var4.field2759 << 1;
            if (arg0.field2797 < var6) {
                var5 = arg0.field2797 * var5 / var6;
            }
            int var7 = (this.field2737[arg0.field2803] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2798 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2783.field1129 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1082 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("fo.aj(Lff;I)I")
    public int method3013(class166 arg0) {
        class164 var2 = arg0.field2787;
        int var3 = this.field2732[arg0.field2803] * this.field2727[arg0.field2803] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2786 * var4 + 16384 >> 15;
        int var6 = this.field2728 * var5 + 128 >> 8;
        if (var2.field2770 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2784 * 1.953125E-5D * (double) var2.field2770) + 0.5D);
        }
        if (var2.field2766 != null) {
            int var7 = arg0.field2793;
            int var8 = var2.field2766[arg0.field2794 + 1];
            if (arg0.field2794 < var2.field2766.length - 2) {
                int var9 = (var2.field2766[arg0.field2794] & 0xFF) << 8;
                int var10 = (var2.field2766[arg0.field2794 + 2] & 0xFF) << 8;
                var8 += (var2.field2766[arg0.field2794 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2795 > 0 && var2.field2769 != null) {
            int var11 = arg0.field2795;
            int var12 = var2.field2769[arg0.field2796 + 1];
            if (arg0.field2796 < var2.field2769.length - 2) {
                int var13 = (var2.field2769[arg0.field2796] & 0xFF) << 8;
                int var14 = (var2.field2769[arg0.field2796 + 2] & 0xFF) << 8;
                var12 += (var2.field2769[arg0.field2796 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("fo.ao(Lff;I)I")
    public int method3014(class166 arg0) {
        int var2 = this.field2730[arg0.field2803];
        return var2 < 8192 ? arg0.field2788 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2788) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("fo.q()Lbn;")
    public synchronized class60 method961() {
        return this.field2754;
    }

    @ObfuscatedName("fo.m()Lbn;")
    public synchronized class60 method962() {
        return null;
    }

    @ObfuscatedName("fo.a()I")
    public synchronized int method967() {
        return 0;
    }

    @ObfuscatedName("fo.w([III)V")
    public synchronized void method963(int[] arg0, int arg1, int arg2) {
        if (this.field2743.method2933()) {
            int var4 = this.field2748 * this.field2743.field2703 / Statics.field1082;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2752;
                if (this.field2753 - var5 >= 0L) {
                    this.field2752 = var5;
                    break;
                }
                int var7 = (int) ((this.field2753 - this.field2752 + (long) var4 - 1L) / (long) var4);
                this.field2752 += (long) var4 * (long) var7;
                this.field2754.method963(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3037();
            } while (this.field2743.method2933());
        }
        this.field2754.method963(arg0, arg1, arg2);
    }

    @ObfuscatedName("fo.o(I)V")
    public synchronized void method966(int arg0) {
        if (this.field2743.method2933()) {
            int var2 = this.field2748 * this.field2743.field2703 / Statics.field1082;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2752;
                if (this.field2753 - var3 >= 0L) {
                    this.field2752 = var3;
                    break;
                }
                int var5 = (int) ((this.field2753 - this.field2752 + (long) var2 - 1L) / (long) var2);
                this.field2752 += (long) var2 * (long) var5;
                this.field2754.method966(var5);
                arg0 -= var5;
                this.method3037();
            } while (this.field2743.method2933());
        }
        this.field2754.method966(arg0);
    }

    @ObfuscatedName("fo.ag(B)V")
    public void method3037() {
        int var1 = this.field2750;
        int var2 = this.field2751;
        long var3 = this.field2753;
        while (this.field2751 == var2) {
            while (this.field2743.field2702[var1] == var2) {
                this.field2743.method2920(var1);
                int var5 = this.field2743.method2924(var1);
                if (var5 == 1) {
                    this.field2743.method2956();
                    this.field2743.method2916(var1);
                    if (this.field2743.method2966()) {
                        if (!this.field2749 || var2 == 0) {
                            this.method3007();
                            this.field2743.method2942();
                            return;
                        }
                        this.field2743.method2930(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3010(var5);
                }
                this.field2743.method2923(var1);
                this.field2743.method2916(var1);
            }
            var1 = this.field2743.method2928();
            var2 = this.field2743.field2702[var1];
            var3 = this.field2743.method2927(var2);
        }
        this.field2750 = var1;
        this.field2751 = var2;
        this.field2753 = var3;
    }

    @ObfuscatedName("fo.aq(Lff;I)Z")
    public boolean method3019(class166 arg0) {
        if (arg0.field2799 != null) {
            return false;
        }
        if (arg0.field2795 >= 0) {
            arg0.method3277();
            if (arg0.field2785 > 0 && this.field2729[arg0.field2803][arg0.field2785] == arg0) {
                this.field2729[arg0.field2803][arg0.field2785] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("fo.an(Lff;[IIIB)Z")
    public boolean method3018(class166 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2800 = Statics.field1082 / 100;
        if (arg0.field2795 >= 0 && arg0.field2799 == null || arg0.field2799.method1114()) {
            arg0.method3104();
            arg0.method3277();
            if (arg0.field2785 > 0 && this.field2729[arg0.field2803][arg0.field2785] == arg0) {
                this.field2729[arg0.field2803][arg0.field2785] = null;
            }
            return true;
        }
        int var5 = arg0.field2789;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2738[arg0.field2803] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2789 = var6;
        }
        arg0.field2799.method1155(this.method3012(arg0));
        class164 var7 = arg0.field2787;
        boolean var8 = false;
        arg0.field2797++;
        arg0.field2798 += var7.field2765;
        double var9 = (double) ((arg0.field2792 - 60 << 8) + (arg0.field2790 * arg0.field2789 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2770 > 0) {
            if (var7.field2772 > 0) {
                arg0.field2784 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2772 * var9) + 0.5D);
            } else {
                arg0.field2784 += 128;
            }
        }
        if (var7.field2766 != null) {
            if (var7.field2758 > 0) {
                arg0.field2793 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2758 * var9) + 0.5D);
            } else {
                arg0.field2793 += 128;
            }
            while (arg0.field2794 < var7.field2766.length - 2 && arg0.field2793 > (var7.field2766[arg0.field2794 + 2] & 0xFF) << 8) {
                arg0.field2794 += 2;
            }
            if (arg0.field2794 == var7.field2766.length - 2 && var7.field2766[arg0.field2794 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2795 >= 0 && var7.field2769 != null && (this.field2740[arg0.field2803] & 0x1) == 0 && (arg0.field2785 < 0 || this.field2729[arg0.field2803][arg0.field2785] != arg0)) {
            if (var7.field2762 > 0) {
                arg0.field2795 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2762 * var9) + 0.5D);
            } else {
                arg0.field2795 += 128;
            }
            while (arg0.field2796 < var7.field2769.length - 2 && arg0.field2795 > (var7.field2769[arg0.field2796 + 2] & 0xFF) << 8) {
                arg0.field2796 += 2;
            }
            if (arg0.field2796 == var7.field2769.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2799.method1127(arg0.field2800, this.method3013(arg0), this.method3014(arg0));
            return false;
        }
        arg0.field2799.method1128(arg0.field2800);
        if (arg1 == null) {
            arg0.field2799.method966(arg3);
        } else {
            arg0.field2799.method963(arg1, arg2, arg3);
        }
        if (arg0.field2799.method1132()) {
            this.field2754.field2775.method956(arg0.field2799);
        }
        arg0.method3104();
        if (arg0.field2795 >= 0) {
            arg0.method3277();
            if (arg0.field2785 > 0 && this.field2729[arg0.field2803][arg0.field2785] == arg0) {
                this.field2729[arg0.field2803][arg0.field2785] = null;
            }
        }
        return true;
    }
}
