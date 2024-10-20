package deob;

@ObfuscatedName("fj")
public class class163 extends class60 {

    @ObfuscatedName("fj.p")
    public class175 field2745 = new class175(128);

    @ObfuscatedName("fj.g")
    public int field2724 = 256;

    @ObfuscatedName("fj.x")
    public int field2725 = 1000000;

    @ObfuscatedName("fj.c")
    public int[] field2741 = new int[16];

    @ObfuscatedName("fj.n")
    public int[] field2727 = new int[16];

    @ObfuscatedName("fj.s")
    public int[] field2743 = new int[16];

    @ObfuscatedName("fj.r")
    public int[] field2729 = new int[16];

    @ObfuscatedName("fj.u")
    public int[] field2730 = new int[16];

    @ObfuscatedName("fj.d")
    public int[] field2731 = new int[16];

    @ObfuscatedName("fj.h")
    public int[] field2723 = new int[16];

    @ObfuscatedName("fj.a")
    public int[] field2733 = new int[16];

    @ObfuscatedName("fj.y")
    public int[] field2734 = new int[16];

    @ObfuscatedName("fj.q")
    public int[] field2737 = new int[16];

    @ObfuscatedName("fj.j")
    public int[] field2738 = new int[16];

    @ObfuscatedName("fj.o")
    public int[] field2752 = new int[16];

    @ObfuscatedName("fj.i")
    public int[] field2740 = new int[16];

    @ObfuscatedName("fj.m")
    public int[] field2749 = new int[16];

    @ObfuscatedName("fj.f")
    public int[] field2742 = new int[16];

    @ObfuscatedName("fj.k")
    public class166[][] field2728 = new class166[16][128];

    @ObfuscatedName("fj.an")
    public class166[][] field2726 = new class166[16][128];

    @ObfuscatedName("fj.aw")
    public class161 field2732 = new class161();

    @ObfuscatedName("fj.at")
    public boolean field2746;

    @ObfuscatedName("fj.al")
    public int field2747;

    @ObfuscatedName("fj.as")
    public int field2748;

    @ObfuscatedName("fj.ak")
    public long field2744;

    @ObfuscatedName("fj.aa")
    public long field2750;

    @ObfuscatedName("fj.ao")
    public class165 field2739 = new class165(this);

    public class163() {
        this.method3133();
    }

    @ObfuscatedName("fj.p(II)V")
    public synchronized void method3104(int arg0) {
        this.field2724 = arg0;
    }

    @ObfuscatedName("fj.g(I)I")
    public int method3105() {
        return this.field2724;
    }

    @ObfuscatedName("fj.x(Lfy;Ler;Lbj;II)Z")
    public synchronized boolean method3106(class159 arg0, class147 arg1, class53 arg2, int arg3) {
        arg0.method3004();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class176 var7 = (class176) arg0.field2690.method3277(); var7 != null; var7 = (class176) arg0.field2690.method3267()) {
            int var8 = (int) var7.field2881;
            class160 var9 = (class160) this.field2745.method3263((long) var8);
            if (var9 == null) {
                var9 = class160.method2631(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field2745.method3264(var9, (long) var8);
            }
            if (!var9.method3019(arg2, var7.field2859, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3005();
        }
        return var5;
    }

    @ObfuscatedName("fj.c(I)V")
    public synchronized void method3135() {
        for (class160 var1 = (class160) this.field2745.method3277(); var1 != null; var1 = (class160) this.field2745.method3267()) {
            var1.method3017();
        }
    }

    @ObfuscatedName("fj.n(I)V")
    public synchronized void method3108() {
        for (class160 var1 = (class160) this.field2745.method3277(); var1 != null; var1 = (class160) this.field2745.method3267()) {
            var1.method3378();
        }
    }

    @ObfuscatedName("fj.d(Lfy;ZB)V")
    public synchronized void method3202(class159 arg0, boolean arg1) {
        this.method3109();
        this.field2732.method3028(arg0.field2691);
        this.field2746 = arg1;
        this.field2744 = 0L;
        int var3 = this.field2732.method3031();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2732.method3047(var4);
            this.field2732.method3035(var4);
            this.field2732.method3033(var4);
        }
        this.field2747 = this.field2732.method3040();
        this.field2748 = this.field2732.field2708[this.field2747];
        this.field2750 = this.field2732.method3039(this.field2748);
    }

    @ObfuscatedName("fj.a(B)V")
    public synchronized void method3109() {
        this.field2732.method3074();
        this.method3133();
    }

    @ObfuscatedName("fj.y(B)Z")
    public synchronized boolean method3110() {
        return this.field2732.method3081();
    }

    @ObfuscatedName("fj.v(III)V")
    public synchronized void method3111(int arg0, int arg1) {
        this.method3112(arg0, arg1);
    }

    @ObfuscatedName("fj.e(III)V")
    public void method3112(int arg0, int arg1) {
        this.field2729[arg0] = arg1;
        this.field2731[arg0] = arg1 & 0xFFFFFF80;
        this.method3113(arg0, arg1);
    }

    @ObfuscatedName("fj.b(III)V")
    public void method3113(int arg0, int arg1) {
        if (this.field2730[arg0] != arg1) {
            this.field2730[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2726[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("fj.z(IIII)V")
    public void method3114(int arg0, int arg1, int arg2) {
        this.method3116(arg0, arg1, 64);
        if ((this.field2737[arg0] & 0x2) != 0) {
            for (class166 var4 = (class166) this.field2739.field2767.method3299(); var4 != null; var4 = (class166) this.field2739.field2767.method3317()) {
                if (var4.field2785 == arg0 && var4.field2769 < 0) {
                    this.field2728[arg0][var4.field2774] = null;
                    this.field2728[arg0][arg1] = var4;
                    int var5 = (var4.field2782 * var4.field2779 >> 12) + var4.field2777;
                    var4.field2777 += arg1 - var4.field2774 << 8;
                    var4.field2782 = var5 - var4.field2777;
                    var4.field2779 = 4096;
                    var4.field2774 = arg1;
                    return;
                }
            }
        }
        class160 var6 = (class160) this.field2745.method3263((long) this.field2730[arg0]);
        if (var6 == null) {
            return;
        }
        class56 var7 = var6.field2694[arg1];
        if (var7 == null) {
            return;
        }
        class166 var8 = new class166();
        var8.field2785 = arg0;
        var8.field2770 = var6;
        var8.field2771 = var7;
        var8.field2789 = var6.field2699[arg1];
        var8.field2773 = var6.field2698[arg1];
        var8.field2774 = arg1;
        var8.field2775 = var6.field2696 * arg2 * arg2 * var6.field2693[arg1] + 1024 >> 11;
        var8.field2776 = var6.field2697[arg1] & 0xFF;
        var8.field2777 = (arg1 << 8) - (var6.field2702[arg1] & 0x7FFF);
        var8.field2780 = 0;
        var8.field2783 = 0;
        var8.field2781 = 0;
        var8.field2769 = -1;
        var8.field2772 = 0;
        if (this.field2740[arg0] == 0) {
            var8.field2787 = class58.method1267(var7, this.method3142(var8), this.method3128(var8), this.method3189(var8));
        } else {
            var8.field2787 = class58.method1267(var7, this.method3142(var8), 0, this.method3189(var8));
            this.method3115(var8, var6.field2702[arg1] < 0);
        }
        if (var6.field2702[arg1] < 0) {
            var8.field2787.method1265(-1);
        }
        if (var8.field2773 >= 0) {
            class166 var9 = this.field2726[arg0][var8.field2773];
            if (var9 != null && var9.field2769 < 0) {
                this.field2728[arg0][var9.field2774] = null;
                var9.field2769 = 0;
            }
            this.field2726[arg0][var8.field2773] = var8;
        }
        this.field2739.field2767.method3291(var8);
        this.field2728[arg0][arg1] = var8;
    }

    @ObfuscatedName("fj.l(Lfr;ZI)V")
    public void method3115(class166 arg0, boolean arg1) {
        int var3 = arg0.field2771.field1122.length;
        int var5;
        if (arg1 && arg0.field2771.field1125) {
            int var4 = var3 + var3 - arg0.field2771.field1123;
            var5 = (int) ((long) this.field2740[arg0.field2785] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2787.method1161(true);
            }
        } else {
            var5 = (int) ((long) this.field2740[arg0.field2785] * (long) var3 >> 6);
        }
        arg0.field2787.method1160(var5);
    }

    @ObfuscatedName("fj.t(IIII)V")
    public void method3116(int arg0, int arg1, int arg2) {
        class166 var4 = this.field2728[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2728[arg0][arg1] = null;
        if ((this.field2737[arg0] & 0x2) == 0) {
            var4.field2769 = 0;
            return;
        }
        for (class166 var5 = (class166) this.field2739.field2767.method3303(); var5 != null; var5 = (class166) this.field2739.field2767.method3300()) {
            if (var4.field2785 == var5.field2785 && var5.field2769 < 0 && var4 != var5) {
                var4.field2769 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("fj.q(IIIB)V")
    public void method3117(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("fj.j(III)V")
    public void method3136(int arg0, int arg1) {
    }

    @ObfuscatedName("fj.o(III)V")
    public void method3141(int arg0, int arg1) {
        this.field2723[arg0] = arg1;
    }

    @ObfuscatedName("fj.i(II)V")
    public void method3120(int arg0) {
        for (class166 var2 = (class166) this.field2739.field2767.method3303(); var2 != null; var2 = (class166) this.field2739.field2767.method3300()) {
            if (arg0 < 0 || var2.field2785 == arg0) {
                if (var2.field2787 != null) {
                    var2.field2787.method1226(Statics.field2674 / 100);
                    if (var2.field2787.method1169()) {
                        this.field2739.field2766.method1001(var2.field2787);
                    }
                    var2.method3216();
                }
                if (var2.field2769 < 0) {
                    this.field2728[var2.field2785][var2.field2774] = null;
                }
                var2.method3378();
            }
        }
    }

    @ObfuscatedName("fj.aa(II)V")
    public void method3121(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3121(var2);
            }
            return;
        }
        this.field2741[arg0] = 12800;
        this.field2727[arg0] = 8192;
        this.field2743[arg0] = 16383;
        this.field2723[arg0] = 8192;
        this.field2733[arg0] = 0;
        this.field2734[arg0] = 8192;
        this.method3124(arg0);
        this.method3125(arg0);
        this.field2737[arg0] = 0;
        this.field2738[arg0] = 32767;
        this.field2752[arg0] = 256;
        this.field2740[arg0] = 0;
        this.method3127(arg0, 8192);
    }

    @ObfuscatedName("fj.ao(IB)V")
    public void method3122(int arg0) {
        for (class166 var2 = (class166) this.field2739.field2767.method3303(); var2 != null; var2 = (class166) this.field2739.field2767.method3300()) {
            if ((arg0 < 0 || var2.field2785 == arg0) && var2.field2769 < 0) {
                this.field2728[var2.field2785][var2.field2774] = null;
                var2.field2769 = 0;
            }
        }
    }

    @ObfuscatedName("fj.az(S)V")
    public void method3133() {
        this.method3120(-1);
        this.method3121(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2730[var1] = this.field2729[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2731[var2] = this.field2729[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("fj.ae(II)V")
    public void method3124(int arg0) {
        if ((this.field2737[arg0] & 0x2) == 0) {
            return;
        }
        for (class166 var2 = (class166) this.field2739.field2767.method3303(); var2 != null; var2 = (class166) this.field2739.field2767.method3300()) {
            if (var2.field2785 == arg0 && this.field2728[arg0][var2.field2774] == null && var2.field2769 < 0) {
                var2.field2769 = 0;
            }
        }
    }

    @ObfuscatedName("fj.av(IB)V")
    public void method3125(int arg0) {
        if ((this.field2737[arg0] & 0x4) == 0) {
            return;
        }
        for (class166 var2 = (class166) this.field2739.field2767.method3303(); var2 != null; var2 = (class166) this.field2739.field2767.method3300()) {
            if (var2.field2785 == arg0) {
                var2.field2778 = 0;
            }
        }
    }

    @ObfuscatedName("fj.ai(IB)V")
    public void method3126(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3116(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3114(var6, var7, var8);
            } else {
                this.method3116(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3117(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2731[var12] = (var14 << 14) + (this.field2731[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2731[var12] = (var14 << 7) + (this.field2731[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2733[var12] = (var14 << 7) + (this.field2733[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2733[var12] = (this.field2733[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2734[var12] = (var14 << 7) + (this.field2734[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2734[var12] = (this.field2734[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2741[var12] = (var14 << 7) + (this.field2741[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2741[var12] = (this.field2741[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2727[var12] = (var14 << 7) + (this.field2727[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2727[var12] = (this.field2727[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2743[var12] = (var14 << 7) + (this.field2743[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2743[var12] = (this.field2743[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2737[var12] |= 0x1;
                } else {
                    this.field2737[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2737[var12] |= 0x2;
                } else {
                    this.method3124(var12);
                    this.field2737[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2738[var12] = (var14 << 7) + (this.field2738[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2738[var12] = (this.field2738[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2738[var12] = (var14 << 7) + (this.field2738[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2738[var12] = (this.field2738[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3120(var12);
            }
            if (var13 == 121) {
                this.method3121(var12);
            }
            if (var13 == 123) {
                this.method3122(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2738[var12];
                if (var15 == 16384) {
                    this.field2752[var12] = (var14 << 7) + (this.field2752[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2738[var12];
                if (var16 == 16384) {
                    this.field2752[var12] = (this.field2752[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2740[var12] = (var14 << 7) + (this.field2740[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2740[var12] = (this.field2740[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2737[var12] |= 0x4;
                } else {
                    this.method3125(var12);
                    this.field2737[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3127(var12, (var14 << 7) + (this.field2749[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3127(var12, (this.field2749[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3113(var17, this.field2731[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3136(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method3141(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3133();
            }
        }
    }

    @ObfuscatedName("fj.aq(III)V")
    public void method3127(int arg0, int arg1) {
        this.field2749[arg0] = arg1;
        this.field2742[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("fj.ad(Lfr;I)I")
    public int method3142(class166 arg0) {
        int var2 = (arg0.field2782 * arg0.field2779 >> 12) + arg0.field2777;
        int var3 = ((this.field2723[arg0.field2785] - 8192) * this.field2752[arg0.field2785] >> 12) + var2;
        class164 var4 = arg0.field2789;
        if (var4.field2760 > 0 && (var4.field2759 > 0 || this.field2733[arg0.field2785] > 0)) {
            int var5 = var4.field2759 << 2;
            int var6 = var4.field2753 << 1;
            if (arg0.field2784 < var6) {
                var5 = arg0.field2784 * var5 / var6;
            }
            int var7 = (this.field2733[arg0.field2785] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2786 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2771.field1124 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field2674 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("fj.au(Lfr;B)I")
    public int method3128(class166 arg0) {
        class164 var2 = arg0.field2789;
        int var3 = this.field2743[arg0.field2785] * this.field2741[arg0.field2785] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2775 * var4 + 16384 >> 15;
        int var6 = this.field2724 * var5 + 128 >> 8;
        if (var2.field2764 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2780 * 1.953125E-5D * (double) var2.field2764) + 0.5D);
        }
        if (var2.field2754 != null) {
            int var7 = arg0.field2783;
            int var8 = var2.field2754[arg0.field2781 + 1];
            if (arg0.field2781 < var2.field2754.length - 2) {
                int var9 = (var2.field2754[arg0.field2781] & 0xFF) << 8;
                int var10 = (var2.field2754[arg0.field2781 + 2] & 0xFF) << 8;
                var8 += (var2.field2754[arg0.field2781 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2769 > 0 && var2.field2755 != null) {
            int var11 = arg0.field2769;
            int var12 = var2.field2755[arg0.field2772 + 1];
            if (arg0.field2772 < var2.field2755.length - 2) {
                int var13 = (var2.field2755[arg0.field2772] & 0xFF) << 8;
                int var14 = (var2.field2755[arg0.field2772 + 2] & 0xFF) << 8;
                var12 += (var2.field2755[arg0.field2772 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("fj.ag(Lfr;B)I")
    public int method3189(class166 arg0) {
        int var2 = this.field2727[arg0.field2785];
        return var2 < 8192 ? arg0.field2776 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2776) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("fj.s()Lbn;")
    public synchronized class60 method1005() {
        return this.field2739;
    }

    @ObfuscatedName("fj.r()Lbn;")
    public synchronized class60 method1029() {
        return null;
    }

    @ObfuscatedName("fj.w()I")
    public synchronized int method1030() {
        return 0;
    }

    @ObfuscatedName("fj.u([III)V")
    public synchronized void method1008(int[] arg0, int arg1, int arg2) {
        if (this.field2732.method3081()) {
            int var4 = this.field2725 * this.field2732.field2716 / Statics.field2674;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2744;
                if (this.field2750 - var5 >= 0L) {
                    this.field2744 = var5;
                    break;
                }
                int var7 = (int) ((this.field2750 - this.field2744 + (long) var4 - 1L) / (long) var4);
                this.field2744 += (long) var4 * (long) var7;
                this.field2739.method1008(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3130();
            } while (this.field2732.method3081());
        }
        this.field2739.method1008(arg0, arg1, arg2);
    }

    @ObfuscatedName("fj.h(I)V")
    public synchronized void method1010(int arg0) {
        if (this.field2732.method3081()) {
            int var2 = this.field2725 * this.field2732.field2716 / Statics.field2674;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2744;
                if (this.field2750 - var3 >= 0L) {
                    this.field2744 = var3;
                    break;
                }
                int var5 = (int) ((this.field2750 - this.field2744 + (long) var2 - 1L) / (long) var2);
                this.field2744 += (long) var2 * (long) var5;
                this.field2739.method1010(var5);
                arg0 -= var5;
                this.method3130();
            } while (this.field2732.method3081());
        }
        this.field2739.method1010(arg0);
    }

    @ObfuscatedName("fj.ar(I)V")
    public void method3130() {
        int var1 = this.field2747;
        int var2 = this.field2748;
        long var3 = this.field2750;
        while (this.field2748 == var2) {
            while (this.field2732.field2708[var1] == var2) {
                this.field2732.method3047(var1);
                int var5 = this.field2732.method3036(var1);
                if (var5 == 1) {
                    this.field2732.method3034();
                    this.field2732.method3033(var1);
                    if (this.field2732.method3030()) {
                        if (!this.field2746 || var2 == 0) {
                            this.method3133();
                            this.field2732.method3074();
                            return;
                        }
                        this.field2732.method3067(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3126(var5);
                }
                this.field2732.method3035(var1);
                this.field2732.method3033(var1);
            }
            var1 = this.field2732.method3040();
            var2 = this.field2732.field2708[var1];
            var3 = this.field2732.method3039(var2);
        }
        this.field2747 = var1;
        this.field2748 = var2;
        this.field2750 = var3;
    }

    @ObfuscatedName("fj.am(Lfr;I)Z")
    public boolean method3167(class166 arg0) {
        if (arg0.field2787 != null) {
            return false;
        }
        if (arg0.field2769 >= 0) {
            arg0.method3378();
            if (arg0.field2773 > 0 && this.field2726[arg0.field2785][arg0.field2773] == arg0) {
                this.field2726[arg0.field2785][arg0.field2773] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("fj.ab(Lfr;[IIIB)Z")
    public boolean method3132(class166 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2788 = Statics.field2674 / 100;
        if (arg0.field2769 >= 0 && arg0.field2787 == null || arg0.field2787.method1212()) {
            arg0.method3216();
            arg0.method3378();
            if (arg0.field2773 > 0 && this.field2726[arg0.field2785][arg0.field2773] == arg0) {
                this.field2726[arg0.field2785][arg0.field2773] = null;
            }
            return true;
        }
        int var5 = arg0.field2779;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2734[arg0.field2785] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2779 = var6;
        }
        arg0.field2787.method1166(this.method3142(arg0));
        class164 var7 = arg0.field2789;
        boolean var8 = false;
        arg0.field2784++;
        arg0.field2786 += var7.field2760;
        double var9 = (double) ((arg0.field2774 - 60 << 8) + (arg0.field2782 * arg0.field2779 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2764 > 0) {
            if (var7.field2758 > 0) {
                arg0.field2780 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2758 * var9) + 0.5D);
            } else {
                arg0.field2780 += 128;
            }
        }
        if (var7.field2754 != null) {
            if (var7.field2756 > 0) {
                arg0.field2783 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2756 * var9) + 0.5D);
            } else {
                arg0.field2783 += 128;
            }
            while (arg0.field2781 < var7.field2754.length - 2 && arg0.field2783 > (var7.field2754[arg0.field2781 + 2] & 0xFF) << 8) {
                arg0.field2781 += 2;
            }
            if (arg0.field2781 == var7.field2754.length - 2 && var7.field2754[arg0.field2781 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2769 >= 0 && var7.field2755 != null && (this.field2737[arg0.field2785] & 0x1) == 0 && (arg0.field2773 < 0 || this.field2726[arg0.field2785][arg0.field2773] != arg0)) {
            if (var7.field2757 > 0) {
                arg0.field2769 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2757 * var9) + 0.5D);
            } else {
                arg0.field2769 += 128;
            }
            while (arg0.field2772 < var7.field2755.length - 2 && arg0.field2769 > (var7.field2755[arg0.field2772 + 2] & 0xFF) << 8) {
                arg0.field2772 += 2;
            }
            if (arg0.field2772 == var7.field2755.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2787.method1164(arg0.field2788, this.method3128(arg0), this.method3189(arg0));
            return false;
        }
        arg0.field2787.method1226(arg0.field2788);
        if (arg1 == null) {
            arg0.field2787.method1010(arg3);
        } else {
            arg0.field2787.method1008(arg1, arg2, arg3);
        }
        if (arg0.field2787.method1169()) {
            this.field2739.field2766.method1001(arg0.field2787);
        }
        arg0.method3216();
        if (arg0.field2769 >= 0) {
            arg0.method3378();
            if (arg0.field2773 > 0 && this.field2726[arg0.field2785][arg0.field2773] == arg0) {
                this.field2726[arg0.field2785][arg0.field2773] = null;
            }
        }
        return true;
    }
}
