package deob;

@ObfuscatedName("fj")
public class class165 extends class61 {

    @ObfuscatedName("fj.e")
    public class177 field2760 = new class177(128);

    @ObfuscatedName("fj.v")
    public int field2743 = 256;

    @ObfuscatedName("fj.k")
    public int field2744 = 1000000;

    @ObfuscatedName("fj.g")
    public int[] field2739 = new int[16];

    @ObfuscatedName("fj.q")
    public int[] field2740 = new int[16];

    @ObfuscatedName("fj.l")
    public int[] field2741 = new int[16];

    @ObfuscatedName("fj.a")
    public int[] field2748 = new int[16];

    @ObfuscatedName("fj.b")
    public int[] field2738 = new int[16];

    @ObfuscatedName("fj.z")
    public int[] field2755 = new int[16];

    @ObfuscatedName("fj.j")
    public int[] field2745 = new int[16];

    @ObfuscatedName("fj.p")
    public int[] field2746 = new int[16];

    @ObfuscatedName("fj.n")
    public int[] field2747 = new int[16];

    @ObfuscatedName("fj.u")
    public int[] field2749 = new int[16];

    @ObfuscatedName("fj.y")
    public int[] field2750 = new int[16];

    @ObfuscatedName("fj.o")
    public int[] field2751 = new int[16];

    @ObfuscatedName("fj.m")
    public int[] field2742 = new int[16];

    @ObfuscatedName("fj.h")
    public int[] field2753 = new int[16];

    @ObfuscatedName("fj.x")
    public int[] field2754 = new int[16];

    @ObfuscatedName("fj.d")
    public class168[][] field2764 = new class168[16][128];

    @ObfuscatedName("fj.ac")
    public class168[][] field2756 = new class168[16][128];

    @ObfuscatedName("fj.ax")
    public class163 field2757 = new class163();

    @ObfuscatedName("fj.af")
    public boolean field2758;

    @ObfuscatedName("fj.am")
    public int field2759;

    @ObfuscatedName("fj.ah")
    public int field2752;

    @ObfuscatedName("fj.ar")
    public long field2761;

    @ObfuscatedName("fj.ad")
    public long field2762;

    @ObfuscatedName("fj.ao")
    public class167 field2763 = new class167(this);

    public class165() {
        this.method3053();
    }

    @ObfuscatedName("fj.e(IB)V")
    public synchronized void method3131(int arg0) {
        this.field2743 = arg0;
    }

    @ObfuscatedName("fj.v(I)I")
    public int method3036() {
        return this.field2743;
    }

    @ObfuscatedName("fj.k(Lft;Lep;Lbq;IB)Z")
    public synchronized boolean method3037(class161 arg0, class149 arg1, class54 arg2, int arg3) {
        arg0.method2942();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class178 var7 = (class178) arg0.field2700.method3205(); var7 != null; var7 = (class178) arg0.field2700.method3196()) {
            int var8 = (int) var7.field2894;
            class162 var9 = (class162) this.field2760.method3192((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method2725(var8);
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
                this.field2760.method3193(var11, (long) var8);
            }
            if (!var9.method2954(arg2, var7.field2874, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method2943();
        }
        return var5;
    }

    @ObfuscatedName("fj.g(I)V")
    public synchronized void method3038() {
        for (class162 var1 = (class162) this.field2760.method3205(); var1 != null; var1 = (class162) this.field2760.method3196()) {
            var1.method2957();
        }
    }

    @ObfuscatedName("fj.q(I)V")
    public synchronized void method3039() {
        for (class162 var1 = (class162) this.field2760.method3205(); var1 != null; var1 = (class162) this.field2760.method3196()) {
            var1.method3324();
        }
    }

    @ObfuscatedName("fj.w(Lft;ZI)V")
    public synchronized void method3079(class161 arg0, boolean arg1) {
        this.method3062();
        this.field2757.method3011(arg0.field2701);
        this.field2758 = arg1;
        this.field2761 = 0L;
        int var3 = this.field2757.method2967();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2757.method2995(var4);
            this.field2757.method2971(var4);
            this.field2757.method2965(var4);
        }
        this.field2759 = this.field2757.method2975();
        this.field2752 = this.field2757.field2720[this.field2759];
        this.field2762 = this.field2757.method3004(this.field2752);
    }

    @ObfuscatedName("fj.p(I)V")
    public synchronized void method3062() {
        this.field2757.method3008();
        this.method3053();
    }

    @ObfuscatedName("fj.n(I)Z")
    public synchronized boolean method3041() {
        return this.field2757.method2966();
    }

    @ObfuscatedName("fj.r(III)V")
    public synchronized void method3043(int arg0, int arg1) {
        this.method3044(arg0, arg1);
    }

    @ObfuscatedName("fj.s(III)V")
    public void method3044(int arg0, int arg1) {
        this.field2748[arg0] = arg1;
        this.field2755[arg0] = arg1 & 0xFFFFFF80;
        this.method3045(arg0, arg1);
    }

    @ObfuscatedName("fj.f(III)V")
    public void method3045(int arg0, int arg1) {
        if (this.field2738[arg0] != arg1) {
            this.field2738[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2756[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("fj.c(IIIB)V")
    public void method3059(int arg0, int arg1, int arg2) {
        this.method3047(arg0, arg1, 64);
        if ((this.field2749[arg0] & 0x2) != 0) {
            for (class168 var4 = (class168) this.field2763.field2783.method3230(); var4 != null; var4 = (class168) this.field2763.field2783.method3249()) {
                if (var4.field2792 == arg0 && var4.field2801 < 0) {
                    this.field2764[arg0][var4.field2794] = null;
                    this.field2764[arg0][arg1] = var4;
                    int var5 = (var4.field2799 * var4.field2798 >> 12) + var4.field2803;
                    var4.field2803 += arg1 - var4.field2794 << 8;
                    var4.field2798 = var5 - var4.field2803;
                    var4.field2799 = 4096;
                    var4.field2794 = arg1;
                    return;
                }
            }
        }
        class162 var6 = (class162) this.field2760.method3192((long) this.field2738[arg0]);
        if (var6 == null) {
            return;
        }
        class57 var7 = var6.field2703[arg1];
        if (var7 == null) {
            return;
        }
        class168 var8 = new class168();
        var8.field2792 = arg0;
        var8.field2790 = var6;
        var8.field2796 = var7;
        var8.field2802 = var6.field2704[arg1];
        var8.field2793 = var6.field2708[arg1];
        var8.field2794 = arg1;
        var8.field2795 = var6.field2713 * arg2 * arg2 * var6.field2707[arg1] + 1024 >> 11;
        var8.field2791 = var6.field2706[arg1] & 0xFF;
        var8.field2803 = (arg1 << 8) - (var6.field2709[arg1] & 0x7FFF);
        var8.field2800 = 0;
        var8.field2811 = 0;
        var8.field2789 = 0;
        var8.field2801 = -1;
        var8.field2804 = 0;
        if (this.field2742[arg0] == 0) {
            var8.field2807 = class59.method1229(var7, this.method3096(var8), this.method3042(var8), this.method3060(var8));
        } else {
            var8.field2807 = class59.method1229(var7, this.method3096(var8), 0, this.method3060(var8));
            this.method3046(var8, var6.field2709[arg1] < 0);
        }
        if (var6.field2709[arg1] < 0) {
            var8.field2807.method1113(-1);
        }
        if (var8.field2793 >= 0) {
            class168 var9 = this.field2756[arg0][var8.field2793];
            if (var9 != null && var9.field2801 < 0) {
                this.field2764[arg0][var9.field2794] = null;
                var9.field2801 = 0;
            }
            this.field2756[arg0][var8.field2793] = var8;
        }
        this.field2763.field2783.method3224(var8);
        this.field2764[arg0][arg1] = var8;
    }

    @ObfuscatedName("fj.t(Lfs;ZI)V")
    public void method3046(class168 arg0, boolean arg1) {
        int var3 = arg0.field2796.field1153.length;
        int var5;
        if (arg1 && arg0.field2796.field1157) {
            int var4 = var3 + var3 - arg0.field2796.field1155;
            var5 = (int) ((long) this.field2742[arg0.field2792] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2807.method1120(true);
            }
        } else {
            var5 = (int) ((long) this.field2742[arg0.field2792] * (long) var3 >> 6);
        }
        arg0.field2807.method1109(var5);
    }

    @ObfuscatedName("fj.i(IIIB)V")
    public void method3047(int arg0, int arg1, int arg2) {
        class168 var4 = this.field2764[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2764[arg0][arg1] = null;
        if ((this.field2749[arg0] & 0x2) == 0) {
            var4.field2801 = 0;
            return;
        }
        for (class168 var5 = (class168) this.field2763.field2783.method3226(); var5 != null; var5 = (class168) this.field2763.field2783.method3231()) {
            if (var4.field2792 == var5.field2792 && var5.field2801 < 0 && var4 != var5) {
                var4.field2801 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("fj.u(IIIB)V")
    public void method3118(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("fj.y(IIB)V")
    public void method3048(int arg0, int arg1) {
    }

    @ObfuscatedName("fj.o(III)V")
    public void method3049(int arg0, int arg1) {
        this.field2745[arg0] = arg1;
    }

    @ObfuscatedName("fj.m(II)V")
    public void method3107(int arg0) {
        for (class168 var2 = (class168) this.field2763.field2783.method3226(); var2 != null; var2 = (class168) this.field2763.field2783.method3231()) {
            if (arg0 < 0 || var2.field2792 == arg0) {
                if (var2.field2807 != null) {
                    var2.field2807.method1189(Statics.field1108 / 100);
                    if (var2.field2807.method1212()) {
                        this.field2763.field2784.method956(var2.field2807);
                    }
                    var2.method3145();
                }
                if (var2.field2801 < 0) {
                    this.field2764[var2.field2792][var2.field2794] = null;
                }
                var2.method3324();
            }
        }
    }

    @ObfuscatedName("fj.h(II)V")
    public void method3051(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3051(var2);
            }
            return;
        }
        this.field2739[arg0] = 12800;
        this.field2740[arg0] = 8192;
        this.field2741[arg0] = 16383;
        this.field2745[arg0] = 8192;
        this.field2746[arg0] = 0;
        this.field2747[arg0] = 8192;
        this.method3054(arg0);
        this.method3055(arg0);
        this.field2749[arg0] = 0;
        this.field2750[arg0] = 32767;
        this.field2751[arg0] = 256;
        this.field2742[arg0] = 0;
        this.method3057(arg0, 8192);
    }

    @ObfuscatedName("fj.ao(II)V")
    public void method3052(int arg0) {
        for (class168 var2 = (class168) this.field2763.field2783.method3226(); var2 != null; var2 = (class168) this.field2763.field2783.method3231()) {
            if ((arg0 < 0 || var2.field2792 == arg0) && var2.field2801 < 0) {
                this.field2764[var2.field2792][var2.field2794] = null;
                var2.field2801 = 0;
            }
        }
    }

    @ObfuscatedName("fj.ae(B)V")
    public void method3053() {
        this.method3107(-1);
        this.method3051(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2738[var1] = this.field2748[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2755[var2] = this.field2748[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("fj.at(II)V")
    public void method3054(int arg0) {
        if ((this.field2749[arg0] & 0x2) == 0) {
            return;
        }
        for (class168 var2 = (class168) this.field2763.field2783.method3226(); var2 != null; var2 = (class168) this.field2763.field2783.method3231()) {
            if (var2.field2792 == arg0 && this.field2764[arg0][var2.field2794] == null && var2.field2801 < 0) {
                var2.field2801 = 0;
            }
        }
    }

    @ObfuscatedName("fj.an(IB)V")
    public void method3055(int arg0) {
        if ((this.field2749[arg0] & 0x4) == 0) {
            return;
        }
        for (class168 var2 = (class168) this.field2763.field2783.method3226(); var2 != null; var2 = (class168) this.field2763.field2783.method3231()) {
            if (var2.field2792 == arg0) {
                var2.field2809 = 0;
            }
        }
    }

    @ObfuscatedName("fj.ay(IB)V")
    public void method3034(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3047(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3059(var6, var7, var8);
            } else {
                this.method3047(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3118(var9, var10, var11);
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
                this.field2746[var12] = (var14 << 7) + (this.field2746[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2746[var12] = (this.field2746[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2747[var12] = (var14 << 7) + (this.field2747[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2747[var12] = (this.field2747[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2739[var12] = (var14 << 7) + (this.field2739[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2739[var12] = (this.field2739[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2740[var12] = (var14 << 7) + (this.field2740[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2740[var12] = (this.field2740[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2741[var12] = (var14 << 7) + (this.field2741[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2741[var12] = (this.field2741[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2749[var12] |= 0x1;
                } else {
                    this.field2749[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2749[var12] |= 0x2;
                } else {
                    this.method3054(var12);
                    this.field2749[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2750[var12] = (var14 << 7) + (this.field2750[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2750[var12] = (this.field2750[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2750[var12] = (var14 << 7) + (this.field2750[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2750[var12] = (this.field2750[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3107(var12);
            }
            if (var13 == 121) {
                this.method3051(var12);
            }
            if (var13 == 123) {
                this.method3052(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2750[var12];
                if (var15 == 16384) {
                    this.field2751[var12] = (var14 << 7) + (this.field2751[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2750[var12];
                if (var16 == 16384) {
                    this.field2751[var12] = (this.field2751[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2742[var12] = (var14 << 7) + (this.field2742[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2742[var12] = (this.field2742[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2749[var12] |= 0x4;
                } else {
                    this.method3055(var12);
                    this.field2749[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3057(var12, (var14 << 7) + (this.field2753[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3057(var12, (this.field2753[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3045(var17, this.field2755[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3048(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method3049(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3053();
            }
        }
    }

    @ObfuscatedName("fj.aw(IIS)V")
    public void method3057(int arg0, int arg1) {
        this.field2753[arg0] = arg1;
        this.field2754[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("fj.ak(Lfs;I)I")
    public int method3096(class168 arg0) {
        int var2 = (arg0.field2799 * arg0.field2798 >> 12) + arg0.field2803;
        int var3 = ((this.field2745[arg0.field2792] - 8192) * this.field2751[arg0.field2792] >> 12) + var2;
        class166 var4 = arg0.field2802;
        if (var4.field2773 > 0 && (var4.field2779 > 0 || this.field2746[arg0.field2792] > 0)) {
            int var5 = var4.field2779 << 2;
            int var6 = var4.field2774 << 1;
            if (arg0.field2805 < var6) {
                var5 = arg0.field2805 * var5 / var6;
            }
            int var7 = (this.field2746[arg0.field2792] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2806 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2796.field1154 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1108 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("fj.aq(Lfs;I)I")
    public int method3042(class168 arg0) {
        class166 var2 = arg0.field2802;
        int var3 = this.field2741[arg0.field2792] * this.field2739[arg0.field2792] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2795 * var4 + 16384 >> 15;
        int var6 = this.field2743 * var5 + 128 >> 8;
        if (var2.field2772 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2800 * 1.953125E-5D * (double) var2.field2772) + 0.5D);
        }
        if (var2.field2781 != null) {
            int var7 = arg0.field2811;
            int var8 = var2.field2781[arg0.field2789 + 1];
            if (arg0.field2789 < var2.field2781.length - 2) {
                int var9 = (var2.field2781[arg0.field2789] & 0xFF) << 8;
                int var10 = (var2.field2781[arg0.field2789 + 2] & 0xFF) << 8;
                var8 += (var2.field2781[arg0.field2789 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2801 > 0 && var2.field2767 != null) {
            int var11 = arg0.field2801;
            int var12 = var2.field2767[arg0.field2804 + 1];
            if (arg0.field2804 < var2.field2767.length - 2) {
                int var13 = (var2.field2767[arg0.field2804] & 0xFF) << 8;
                int var14 = (var2.field2767[arg0.field2804 + 2] & 0xFF) << 8;
                var12 += (var2.field2767[arg0.field2804 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("fj.aa(Lfs;B)I")
    public int method3060(class168 arg0) {
        int var2 = this.field2740[arg0.field2792];
        return var2 < 8192 ? arg0.field2791 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2791) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("fj.l()Lbz;")
    public synchronized class61 method980() {
        return this.field2763;
    }

    @ObfuscatedName("fj.a()Lbz;")
    public synchronized class61 method946() {
        return null;
    }

    @ObfuscatedName("fj.b()I")
    public synchronized int method950() {
        return 0;
    }

    @ObfuscatedName("fj.z([III)V")
    public synchronized void method952(int[] arg0, int arg1, int arg2) {
        if (this.field2757.method2966()) {
            int var4 = this.field2744 * this.field2757.field2715 / Statics.field1108;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2761;
                if (this.field2762 - var5 >= 0L) {
                    this.field2761 = var5;
                    break;
                }
                int var7 = (int) ((this.field2762 - this.field2761 + (long) var4 - 1L) / (long) var4);
                this.field2761 += (long) var4 * (long) var7;
                this.field2763.method952(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3063();
            } while (this.field2757.method2966());
        }
        this.field2763.method952(arg0, arg1, arg2);
    }

    @ObfuscatedName("fj.j(I)V")
    public synchronized void method957(int arg0) {
        if (this.field2757.method2966()) {
            int var2 = this.field2744 * this.field2757.field2715 / Statics.field1108;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2761;
                if (this.field2762 - var3 >= 0L) {
                    this.field2761 = var3;
                    break;
                }
                int var5 = (int) ((this.field2762 - this.field2761 + (long) var2 - 1L) / (long) var2);
                this.field2761 += (long) var2 * (long) var5;
                this.field2763.method957(var5);
                arg0 -= var5;
                this.method3063();
            } while (this.field2757.method2966());
        }
        this.field2763.method957(arg0);
    }

    @ObfuscatedName("fj.aj(I)V")
    public void method3063() {
        int var1 = this.field2759;
        int var2 = this.field2752;
        long var3 = this.field2762;
        while (this.field2752 == var2) {
            while (this.field2757.field2720[var1] == var2) {
                this.field2757.method2995(var1);
                int var5 = this.field2757.method2999(var1);
                if (var5 == 1) {
                    this.field2757.method2970();
                    this.field2757.method2965(var1);
                    if (this.field2757.method2976()) {
                        if (!this.field2758 || var2 == 0) {
                            this.method3053();
                            this.field2757.method3008();
                            return;
                        }
                        this.field2757.method2977(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3034(var5);
                }
                this.field2757.method2971(var1);
                this.field2757.method2965(var1);
            }
            var1 = this.field2757.method2975();
            var2 = this.field2757.field2720[var1];
            var3 = this.field2757.method3004(var2);
        }
        this.field2759 = var1;
        this.field2752 = var2;
        this.field2762 = var3;
    }

    @ObfuscatedName("fj.au(Lfs;I)Z")
    public boolean method3064(class168 arg0) {
        if (arg0.field2807 != null) {
            return false;
        }
        if (arg0.field2801 >= 0) {
            arg0.method3324();
            if (arg0.field2793 > 0 && this.field2756[arg0.field2792][arg0.field2793] == arg0) {
                this.field2756[arg0.field2792][arg0.field2793] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("fj.al(Lfs;[IIII)Z")
    public boolean method3065(class168 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2808 = Statics.field1108 / 100;
        if (arg0.field2801 >= 0 && arg0.field2807 == null || arg0.field2807.method1127()) {
            arg0.method3145();
            arg0.method3324();
            if (arg0.field2793 > 0 && this.field2756[arg0.field2792][arg0.field2793] == arg0) {
                this.field2756[arg0.field2792][arg0.field2793] = null;
            }
            return true;
        }
        int var5 = arg0.field2799;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2747[arg0.field2792] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2799 = var6;
        }
        arg0.field2807.method1125(this.method3096(arg0));
        class166 var7 = arg0.field2802;
        boolean var8 = false;
        arg0.field2805++;
        arg0.field2806 += var7.field2773;
        double var9 = (double) ((arg0.field2794 - 60 << 8) + (arg0.field2799 * arg0.field2798 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2772 > 0) {
            if (var7.field2766 > 0) {
                arg0.field2800 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2766 * var9) + 0.5D);
            } else {
                arg0.field2800 += 128;
            }
        }
        if (var7.field2781 != null) {
            if (var7.field2769 > 0) {
                arg0.field2811 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2769 * var9) + 0.5D);
            } else {
                arg0.field2811 += 128;
            }
            while (arg0.field2789 < var7.field2781.length - 2 && arg0.field2811 > (var7.field2781[arg0.field2789 + 2] & 0xFF) << 8) {
                arg0.field2789 += 2;
            }
            if (arg0.field2789 == var7.field2781.length - 2 && var7.field2781[arg0.field2789 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2801 >= 0 && var7.field2767 != null && (this.field2749[arg0.field2792] & 0x1) == 0 && (arg0.field2793 < 0 || this.field2756[arg0.field2792][arg0.field2793] != arg0)) {
            if (var7.field2770 > 0) {
                arg0.field2801 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2770 * var9) + 0.5D);
            } else {
                arg0.field2801 += 128;
            }
            while (arg0.field2804 < var7.field2767.length - 2 && arg0.field2801 > (var7.field2767[arg0.field2804 + 2] & 0xFF) << 8) {
                arg0.field2804 += 2;
            }
            if (arg0.field2804 == var7.field2767.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2807.method1128(arg0.field2808, this.method3042(arg0), this.method3060(arg0));
            return false;
        }
        arg0.field2807.method1189(arg0.field2808);
        if (arg1 == null) {
            arg0.field2807.method957(arg3);
        } else {
            arg0.field2807.method952(arg1, arg2, arg3);
        }
        if (arg0.field2807.method1212()) {
            this.field2763.field2784.method956(arg0.field2807);
        }
        arg0.method3145();
        if (arg0.field2801 >= 0) {
            arg0.method3324();
            if (arg0.field2793 > 0 && this.field2756[arg0.field2792][arg0.field2793] == arg0) {
                this.field2756[arg0.field2792][arg0.field2793] = null;
            }
        }
        return true;
    }
}
