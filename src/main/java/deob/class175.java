package deob;

@ObfuscatedName("fq")
public class class175 extends class62 {

    @ObfuscatedName("fq.b")
    public class187 field2866 = new class187(128);

    @ObfuscatedName("fq.e")
    public int field2848 = 256;

    @ObfuscatedName("fq.a")
    public int field2860 = 1000000;

    @ObfuscatedName("fq.k")
    public int[] field2855 = new int[16];

    @ObfuscatedName("fq.p")
    public int[] field2851 = new int[16];

    @ObfuscatedName("fq.l")
    public int[] field2852 = new int[16];

    @ObfuscatedName("fq.u")
    public int[] field2849 = new int[16];

    @ObfuscatedName("fq.o")
    public int[] field2854 = new int[16];

    @ObfuscatedName("fq.m")
    public int[] field2865 = new int[16];

    @ObfuscatedName("fq.q")
    public int[] field2856 = new int[16];

    @ObfuscatedName("fq.v")
    public int[] field2857 = new int[16];

    @ObfuscatedName("fq.n")
    public int[] field2868 = new int[16];

    @ObfuscatedName("fq.w")
    public int[] field2861 = new int[16];

    @ObfuscatedName("fq.g")
    public int[] field2862 = new int[16];

    @ObfuscatedName("fq.f")
    public int[] field2863 = new int[16];

    @ObfuscatedName("fq.y")
    public int[] field2864 = new int[16];

    @ObfuscatedName("fq.j")
    public int[] field2874 = new int[16];

    @ObfuscatedName("fq.x")
    public int[] field2858 = new int[16];

    @ObfuscatedName("fq.d")
    public class178[][] field2850 = new class178[16][128];

    @ObfuscatedName("fq.ax")
    public class178[][] field2867 = new class178[16][128];

    @ObfuscatedName("fq.ag")
    public class173 field2869 = new class173();

    @ObfuscatedName("fq.ai")
    public boolean field2870;

    @ObfuscatedName("fq.ar")
    public int field2871;

    @ObfuscatedName("fq.aw")
    public int field2875;

    @ObfuscatedName("fq.ac")
    public long field2873;

    @ObfuscatedName("fq.ap")
    public long field2872;

    @ObfuscatedName("fq.al")
    public class177 field2853 = new class177(this);

    public class175() {
        this.method3233();
    }

    @ObfuscatedName("fq.b(II)V")
    public synchronized void method3219(int arg0) {
        this.field2848 = arg0;
    }

    @ObfuscatedName("fq.e(I)I")
    public int method3133() {
        return this.field2848;
    }

    @ObfuscatedName("fq.a(Lfs;Lfj;Lbw;II)Z")
    public synchronized boolean method3134(class171 arg0, class158 arg1, class55 arg2, int arg3) {
        arg0.method3056();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class188 var7 = (class188) arg0.field2810.method3286(); var7 != null; var7 = (class188) arg0.field2810.method3291()) {
            int var8 = (int) var7.field3006;
            class172 var9 = (class172) this.field2866.method3297((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method2860(var8);
                class172 var11;
                if (var10 == null) {
                    var11 = null;
                } else {
                    var11 = new class172(var10);
                }
                var9 = var11;
                if (var11 == null) {
                    var5 = false;
                    continue;
                }
                this.field2866.method3288(var11, (long) var8);
            }
            if (!var9.method3067(arg2, var7.field2985, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3054();
        }
        return var5;
    }

    @ObfuscatedName("fq.k(I)V")
    public synchronized void method3135() {
        for (class172 var1 = (class172) this.field2866.method3286(); var1 != null; var1 = (class172) this.field2866.method3291()) {
            var1.method3068();
        }
    }

    @ObfuscatedName("fq.p(B)V")
    public synchronized void method3201() {
        for (class172 var1 = (class172) this.field2866.method3286(); var1 != null; var1 = (class172) this.field2866.method3291()) {
            var1.method3414();
        }
    }

    @ObfuscatedName("fq.q(Lfs;ZI)V")
    public synchronized void method3160(class171 arg0, boolean arg1) {
        this.method3180();
        this.field2869.method3112(arg0.field2811);
        this.field2870 = arg1;
        this.field2873 = 0L;
        int var3 = this.field2869.method3108();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2869.method3079(var4);
            this.field2869.method3081(var4);
            this.field2869.method3114(var4);
        }
        this.field2871 = this.field2869.method3087();
        this.field2875 = this.field2869.field2821[this.field2871];
        this.field2872 = this.field2869.method3082(this.field2875);
    }

    @ObfuscatedName("fq.n(B)V")
    public synchronized void method3180() {
        this.field2869.method3104();
        this.method3233();
    }

    @ObfuscatedName("fq.z(I)Z")
    public synchronized boolean method3158() {
        return this.field2869.method3077();
    }

    @ObfuscatedName("fq.r(III)V")
    public synchronized void method3139(int arg0, int arg1) {
        this.method3140(arg0, arg1);
    }

    @ObfuscatedName("fq.i(III)V")
    public void method3140(int arg0, int arg1) {
        this.field2849[arg0] = arg1;
        this.field2865[arg0] = arg1 & 0xFFFFFF80;
        this.method3141(arg0, arg1);
    }

    @ObfuscatedName("fq.s(III)V")
    public void method3141(int arg0, int arg1) {
        if (this.field2854[arg0] != arg1) {
            this.field2854[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2867[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("fq.c(IIII)V")
    public void method3142(int arg0, int arg1, int arg2) {
        this.method3144(arg0, arg1, 64);
        if ((this.field2861[arg0] & 0x2) != 0) {
            for (class178 var4 = (class178) this.field2853.field2889.method3325(); var4 != null; var4 = (class178) this.field2853.field2889.method3317()) {
                if (var4.field2915 == arg0 && var4.field2913 < 0) {
                    this.field2850[arg0][var4.field2900] = null;
                    this.field2850[arg0][arg1] = var4;
                    int var5 = (var4.field2912 * var4.field2905 >> 12) + var4.field2903;
                    var4.field2903 += arg1 - var4.field2900 << 8;
                    var4.field2912 = var5 - var4.field2903;
                    var4.field2905 = 4096;
                    var4.field2900 = arg1;
                    return;
                }
            }
        }
        class172 var6 = (class172) this.field2866.method3297((long) this.field2854[arg0]);
        if (var6 == null) {
            return;
        }
        class58 var7 = var6.field2813[arg1];
        if (var7 == null) {
            return;
        }
        class178 var8 = new class178();
        var8.field2915 = arg0;
        var8.field2896 = var6;
        var8.field2897 = var7;
        var8.field2898 = var6.field2817[arg1];
        var8.field2899 = var6.field2818[arg1];
        var8.field2900 = arg1;
        var8.field2910 = var6.field2815 * arg2 * arg2 * var6.field2814[arg1] + 1024 >> 11;
        var8.field2902 = var6.field2812[arg1] & 0xFF;
        var8.field2903 = (arg1 << 8) - (var6.field2816[arg1] & 0x7FFF);
        var8.field2909 = 0;
        var8.field2907 = 0;
        var8.field2908 = 0;
        var8.field2913 = -1;
        var8.field2904 = 0;
        if (this.field2864[arg0] == 0) {
            var8.field2895 = class60.method1169(var7, this.method3156(var8), this.method3157(var8), this.method3161(var8));
        } else {
            var8.field2895 = class60.method1169(var7, this.method3156(var8), 0, this.method3161(var8));
            this.method3143(var8, var6.field2816[arg1] < 0);
        }
        if (var6.field2816[arg1] < 0) {
            var8.field2895.method1122(-1);
        }
        if (var8.field2899 >= 0) {
            class178 var9 = this.field2867[arg0][var8.field2899];
            if (var9 != null && var9.field2913 < 0) {
                this.field2850[arg0][var9.field2900] = null;
                var9.field2913 = 0;
            }
            this.field2867[arg0][var8.field2899] = var8;
        }
        this.field2853.field2889.method3319(var8);
        this.field2850[arg0][arg1] = var8;
    }

    @ObfuscatedName("fq.t(Lfb;ZI)V")
    public void method3143(class178 arg0, boolean arg1) {
        int var3 = arg0.field2897.field1168.length;
        int var5;
        if (arg1 && arg0.field2897.field1170) {
            int var4 = var3 + var3 - arg0.field2897.field1169;
            var5 = (int) ((long) this.field2864[arg0.field2915] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2895.method1128(true);
            }
        } else {
            var5 = (int) ((long) this.field2864[arg0.field2915] * (long) var3 >> 6);
        }
        arg0.field2895.method1127(var5);
    }

    @ObfuscatedName("fq.h(IIIB)V")
    public void method3144(int arg0, int arg1, int arg2) {
        class178 var4 = this.field2850[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2850[arg0][arg1] = null;
        if ((this.field2861[arg0] & 0x2) == 0) {
            var4.field2913 = 0;
            return;
        }
        for (class178 var5 = (class178) this.field2853.field2889.method3324(); var5 != null; var5 = (class178) this.field2853.field2889.method3326()) {
            if (var4.field2915 == var5.field2915 && var5.field2913 < 0 && var4 != var5) {
                var4.field2913 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("fq.w(IIII)V")
    public void method3145(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("fq.aw(III)V")
    public void method3146(int arg0, int arg1) {
    }

    @ObfuscatedName("fq.ac(III)V")
    public void method3147(int arg0, int arg1) {
        this.field2856[arg0] = arg1;
    }

    @ObfuscatedName("fq.ap(II)V")
    public void method3163(int arg0) {
        for (class178 var2 = (class178) this.field2853.field2889.method3324(); var2 != null; var2 = (class178) this.field2853.field2889.method3326()) {
            if (arg0 < 0 || var2.field2915 == arg0) {
                if (var2.field2895 != null) {
                    var2.field2895.method1132(Statics.field1124 / 100);
                    if (var2.field2895.method1170()) {
                        this.field2853.field2890.method971(var2.field2895);
                    }
                    var2.method3240();
                }
                if (var2.field2913 < 0) {
                    this.field2850[var2.field2915][var2.field2900] = null;
                }
                var2.method3414();
            }
        }
    }

    @ObfuscatedName("fq.ak(II)V")
    public void method3132(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3132(var2);
            }
            return;
        }
        this.field2855[arg0] = 12800;
        this.field2851[arg0] = 8192;
        this.field2852[arg0] = 16383;
        this.field2856[arg0] = 8192;
        this.field2857[arg0] = 0;
        this.field2868[arg0] = 8192;
        this.method3217(arg0);
        this.method3153(arg0);
        this.field2861[arg0] = 0;
        this.field2862[arg0] = 32767;
        this.field2863[arg0] = 256;
        this.field2864[arg0] = 0;
        this.method3155(arg0, 8192);
    }

    @ObfuscatedName("fq.at(II)V")
    public void method3150(int arg0) {
        for (class178 var2 = (class178) this.field2853.field2889.method3324(); var2 != null; var2 = (class178) this.field2853.field2889.method3326()) {
            if ((arg0 < 0 || var2.field2915 == arg0) && var2.field2913 < 0) {
                this.field2850[var2.field2915][var2.field2900] = null;
                var2.field2913 = 0;
            }
        }
    }

    @ObfuscatedName("fq.au(I)V")
    public void method3233() {
        this.method3163(-1);
        this.method3132(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2854[var1] = this.field2849[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2865[var2] = this.field2849[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("fq.aa(II)V")
    public void method3217(int arg0) {
        if ((this.field2861[arg0] & 0x2) == 0) {
            return;
        }
        for (class178 var2 = (class178) this.field2853.field2889.method3324(); var2 != null; var2 = (class178) this.field2853.field2889.method3326()) {
            if (var2.field2915 == arg0 && this.field2850[arg0][var2.field2900] == null && var2.field2913 < 0) {
                var2.field2913 = 0;
            }
        }
    }

    @ObfuscatedName("fq.az(II)V")
    public void method3153(int arg0) {
        if ((this.field2861[arg0] & 0x4) == 0) {
            return;
        }
        for (class178 var2 = (class178) this.field2853.field2889.method3324(); var2 != null; var2 = (class178) this.field2853.field2889.method3326()) {
            if (var2.field2915 == arg0) {
                var2.field2906 = 0;
            }
        }
    }

    @ObfuscatedName("fq.ae(II)V")
    public void method3154(int arg0) {
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
                this.method3142(var6, var7, var8);
            } else {
                this.method3144(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3145(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2865[var12] = (var14 << 14) + (this.field2865[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2865[var12] = (var14 << 7) + (this.field2865[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2857[var12] = (var14 << 7) + (this.field2857[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2857[var12] = (this.field2857[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2868[var12] = (var14 << 7) + (this.field2868[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2868[var12] = (this.field2868[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2855[var12] = (var14 << 7) + (this.field2855[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2855[var12] = (this.field2855[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2851[var12] = (var14 << 7) + (this.field2851[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2851[var12] = (this.field2851[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2852[var12] = (var14 << 7) + (this.field2852[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2852[var12] = (this.field2852[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2861[var12] |= 0x1;
                } else {
                    this.field2861[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2861[var12] |= 0x2;
                } else {
                    this.method3217(var12);
                    this.field2861[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2862[var12] = (var14 << 7) + (this.field2862[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2862[var12] = (this.field2862[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2862[var12] = (var14 << 7) + (this.field2862[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2862[var12] = (this.field2862[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3163(var12);
            }
            if (var13 == 121) {
                this.method3132(var12);
            }
            if (var13 == 123) {
                this.method3150(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2862[var12];
                if (var15 == 16384) {
                    this.field2863[var12] = (var14 << 7) + (this.field2863[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2862[var12];
                if (var16 == 16384) {
                    this.field2863[var12] = (this.field2863[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2864[var12] = (var14 << 7) + (this.field2864[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2864[var12] = (this.field2864[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2861[var12] |= 0x4;
                } else {
                    this.method3153(var12);
                    this.field2861[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3155(var12, (var14 << 7) + (this.field2874[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3155(var12, (this.field2874[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3141(var17, this.field2865[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3146(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method3147(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3233();
            }
        }
    }

    @ObfuscatedName("fq.ah(IIB)V")
    public void method3155(int arg0, int arg1) {
        this.field2874[arg0] = arg1;
        this.field2858[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("fq.an(Lfb;I)I")
    public int method3156(class178 arg0) {
        int var2 = (arg0.field2912 * arg0.field2905 >> 12) + arg0.field2903;
        int var3 = ((this.field2856[arg0.field2915] - 8192) * this.field2863[arg0.field2915] >> 12) + var2;
        class176 var4 = arg0.field2898;
        if (var4.field2883 > 0 && (var4.field2876 > 0 || this.field2857[arg0.field2915] > 0)) {
            int var5 = var4.field2876 << 2;
            int var6 = var4.field2884 << 1;
            if (arg0.field2911 < var6) {
                var5 = arg0.field2911 * var5 / var6;
            }
            int var7 = (this.field2857[arg0.field2915] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2901 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2897.field1167 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1124 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("fq.aq(Lfb;I)I")
    public int method3157(class178 arg0) {
        class176 var2 = arg0.field2898;
        int var3 = this.field2855[arg0.field2915] * this.field2852[arg0.field2915] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2910 * var4 + 16384 >> 15;
        int var6 = this.field2848 * var5 + 128 >> 8;
        if (var2.field2878 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2909 * 1.953125E-5D * (double) var2.field2878) + 0.5D);
        }
        if (var2.field2887 != null) {
            int var7 = arg0.field2907;
            int var8 = var2.field2887[arg0.field2908 + 1];
            if (arg0.field2908 < var2.field2887.length - 2) {
                int var9 = (var2.field2887[arg0.field2908] & 0xFF) << 8;
                int var10 = (var2.field2887[arg0.field2908 + 2] & 0xFF) << 8;
                var8 += (var2.field2887[arg0.field2908 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2913 > 0 && var2.field2877 != null) {
            int var11 = arg0.field2913;
            int var12 = var2.field2877[arg0.field2904 + 1];
            if (arg0.field2904 < var2.field2877.length - 2) {
                int var13 = (var2.field2877[arg0.field2904] & 0xFF) << 8;
                int var14 = (var2.field2877[arg0.field2904 + 2] & 0xFF) << 8;
                var12 += (var2.field2877[arg0.field2904 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("fq.as(Lfb;I)I")
    public int method3161(class178 arg0) {
        int var2 = this.field2851[arg0.field2915];
        return var2 < 8192 ? arg0.field2902 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2902) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("fq.l()Lbk;")
    public synchronized class62 method976() {
        return this.field2853;
    }

    @ObfuscatedName("fq.u()Lbk;")
    public synchronized class62 method984() {
        return null;
    }

    @ObfuscatedName("fq.o()I")
    public synchronized int method978() {
        return 0;
    }

    @ObfuscatedName("fq.m([III)V")
    public synchronized void method979(int[] arg0, int arg1, int arg2) {
        if (this.field2869.method3077()) {
            int var4 = this.field2860 * this.field2869.field2822 / Statics.field1124;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2873;
                if (this.field2872 - var5 >= 0L) {
                    this.field2873 = var5;
                    break;
                }
                int var7 = (int) ((this.field2872 - this.field2873 + (long) var4 - 1L) / (long) var4);
                this.field2873 += (long) var4 * (long) var7;
                this.field2853.method979(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3162();
            } while (this.field2869.method3077());
        }
        this.field2853.method979(arg0, arg1, arg2);
    }

    @ObfuscatedName("fq.v(I)V")
    public synchronized void method981(int arg0) {
        if (this.field2869.method3077()) {
            int var2 = this.field2860 * this.field2869.field2822 / Statics.field1124;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2873;
                if (this.field2872 - var3 >= 0L) {
                    this.field2873 = var3;
                    break;
                }
                int var5 = (int) ((this.field2872 - this.field2873 + (long) var2 - 1L) / (long) var2);
                this.field2873 += (long) var2 * (long) var5;
                this.field2853.method981(var5);
                arg0 -= var5;
                this.method3162();
            } while (this.field2869.method3077());
        }
        this.field2853.method981(arg0);
    }

    @ObfuscatedName("fq.ay(B)V")
    public void method3162() {
        int var1 = this.field2871;
        int var2 = this.field2875;
        long var3 = this.field2872;
        while (this.field2875 == var2) {
            while (this.field2869.field2821[var1] == var2) {
                this.field2869.method3079(var1);
                int var5 = this.field2869.method3083(var1);
                if (var5 == 1) {
                    this.field2869.method3115();
                    this.field2869.method3114(var1);
                    if (this.field2869.method3086()) {
                        if (!this.field2870 || var2 == 0) {
                            this.method3233();
                            this.field2869.method3104();
                            return;
                        }
                        this.field2869.method3089(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3154(var5);
                }
                this.field2869.method3081(var1);
                this.field2869.method3114(var1);
            }
            var1 = this.field2869.method3087();
            var2 = this.field2869.field2821[var1];
            var3 = this.field2869.method3082(var2);
        }
        this.field2871 = var1;
        this.field2875 = var2;
        this.field2872 = var3;
    }

    @ObfuscatedName("fq.ad(Lfb;I)Z")
    public boolean method3173(class178 arg0) {
        if (arg0.field2895 != null) {
            return false;
        }
        if (arg0.field2913 >= 0) {
            arg0.method3414();
            if (arg0.field2899 > 0 && this.field2867[arg0.field2915][arg0.field2899] == arg0) {
                this.field2867[arg0.field2915][arg0.field2899] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("fq.af(Lfb;[IIII)Z")
    public boolean method3164(class178 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2914 = Statics.field1124 / 100;
        if (arg0.field2913 >= 0 && arg0.field2895 == null || arg0.field2895.method1139()) {
            arg0.method3240();
            arg0.method3414();
            if (arg0.field2899 > 0 && this.field2867[arg0.field2915][arg0.field2899] == arg0) {
                this.field2867[arg0.field2915][arg0.field2899] = null;
            }
            return true;
        }
        int var5 = arg0.field2905;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2868[arg0.field2915] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2905 = var6;
        }
        arg0.field2895.method1133(this.method3156(arg0));
        class176 var7 = arg0.field2898;
        boolean var8 = false;
        arg0.field2911++;
        arg0.field2901 += var7.field2883;
        double var9 = (double) ((arg0.field2900 - 60 << 8) + (arg0.field2912 * arg0.field2905 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2878 > 0) {
            if (var7.field2881 > 0) {
                arg0.field2909 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2881 * var9) + 0.5D);
            } else {
                arg0.field2909 += 128;
            }
        }
        if (var7.field2887 != null) {
            if (var7.field2879 > 0) {
                arg0.field2907 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2879 * var9) + 0.5D);
            } else {
                arg0.field2907 += 128;
            }
            while (arg0.field2908 < var7.field2887.length - 2 && arg0.field2907 > (var7.field2887[arg0.field2908 + 2] & 0xFF) << 8) {
                arg0.field2908 += 2;
            }
            if (arg0.field2908 == var7.field2887.length - 2 && var7.field2887[arg0.field2908 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2913 >= 0 && var7.field2877 != null && (this.field2861[arg0.field2915] & 0x1) == 0 && (arg0.field2899 < 0 || this.field2867[arg0.field2915][arg0.field2899] != arg0)) {
            if (var7.field2882 > 0) {
                arg0.field2913 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2882 * var9) + 0.5D);
            } else {
                arg0.field2913 += 128;
            }
            while (arg0.field2904 < var7.field2877.length - 2 && arg0.field2913 > (var7.field2877[arg0.field2904 + 2] & 0xFF) << 8) {
                arg0.field2904 += 2;
            }
            if (arg0.field2904 == var7.field2877.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2895.method1131(arg0.field2914, this.method3157(arg0), this.method3161(arg0));
            return false;
        }
        arg0.field2895.method1132(arg0.field2914);
        if (arg1 == null) {
            arg0.field2895.method981(arg3);
        } else {
            arg0.field2895.method979(arg1, arg2, arg3);
        }
        if (arg0.field2895.method1170()) {
            this.field2853.field2890.method971(arg0.field2895);
        }
        arg0.method3240();
        if (arg0.field2913 >= 0) {
            arg0.method3414();
            if (arg0.field2899 > 0 && this.field2867[arg0.field2915][arg0.field2899] == arg0) {
                this.field2867[arg0.field2915][arg0.field2899] = null;
            }
        }
        return true;
    }
}
