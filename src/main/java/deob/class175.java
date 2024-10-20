package deob;

@ObfuscatedName("fa")
public class class175 extends class62 {

    @ObfuscatedName("fa.y")
    public class187 field2883 = new class187(128);

    @ObfuscatedName("fa.k")
    public int field2880 = 256;

    @ObfuscatedName("fa.g")
    public int field2892 = 1000000;

    @ObfuscatedName("fa.n")
    public int[] field2906 = new int[16];

    @ObfuscatedName("fa.t")
    public int[] field2885 = new int[16];

    @ObfuscatedName("fa.e")
    public int[] field2884 = new int[16];

    @ObfuscatedName("fa.q")
    public int[] field2904 = new int[16];

    @ObfuscatedName("fa.z")
    public int[] field2890 = new int[16];

    @ObfuscatedName("fa.v")
    public int[] field2887 = new int[16];

    @ObfuscatedName("fa.b")
    public int[] field2888 = new int[16];

    @ObfuscatedName("fa.f")
    public int[] field2889 = new int[16];

    @ObfuscatedName("fa.i")
    public int[] field2891 = new int[16];

    @ObfuscatedName("fa.m")
    public int[] field2900 = new int[16];

    @ObfuscatedName("fa.a")
    public int[] field2886 = new int[16];

    @ObfuscatedName("fa.p")
    public int[] field2894 = new int[16];

    @ObfuscatedName("fa.c")
    public int[] field2895 = new int[16];

    @ObfuscatedName("fa.u")
    public int[] field2896 = new int[16];

    @ObfuscatedName("fa.d")
    public int[] field2897 = new int[16];

    @ObfuscatedName("fa.o")
    public class178[][] field2898 = new class178[16][128];

    @ObfuscatedName("fa.aj")
    public class178[][] field2899 = new class178[16][128];

    @ObfuscatedName("fa.au")
    public class173 field2879 = new class173();

    @ObfuscatedName("fa.ah")
    public boolean field2893;

    @ObfuscatedName("fa.ab")
    public int field2902;

    @ObfuscatedName("fa.am")
    public int field2903;

    @ObfuscatedName("fa.ar")
    public long field2901;

    @ObfuscatedName("fa.an")
    public long field2905;

    @ObfuscatedName("fa.az")
    public class177 field2881 = new class177(this);

    public class175() {
        this.method3280();
    }

    @ObfuscatedName("fa.y(II)V")
    public synchronized void method3208(int arg0) {
        this.field2880 = arg0;
    }

    @ObfuscatedName("fa.k(I)I")
    public int method3254() {
        return this.field2880;
    }

    @ObfuscatedName("fa.g(Lft;Lfd;Lbn;IB)Z")
    public synchronized boolean method3210(class171 arg0, class158 arg1, class55 arg2, int arg3) {
        arg0.method3118();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class188 var7 = (class188) arg0.field2841.method3360(); var7 != null; var7 = (class188) arg0.field2841.method3373()) {
            int var8 = (int) var7.field3024;
            class172 var9 = (class172) this.field2883.method3357((long) var8);
            if (var9 == null) {
                var9 = class172.method159(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field2883.method3358(var9, (long) var8);
            }
            if (!var9.method3130(arg2, var7.field3004, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3119();
        }
        return var5;
    }

    @ObfuscatedName("fa.n(B)V")
    public synchronized void method3211() {
        for (class172 var1 = (class172) this.field2883.method3360(); var1 != null; var1 = (class172) this.field2883.method3373()) {
            var1.method3131();
        }
    }

    @ObfuscatedName("fa.t(I)V")
    public synchronized void method3212() {
        for (class172 var1 = (class172) this.field2883.method3360(); var1 != null; var1 = (class172) this.field2883.method3373()) {
            var1.method3482();
        }
    }

    @ObfuscatedName("fa.b(Lft;ZI)V")
    public synchronized void method3213(class171 arg0, boolean arg1) {
        this.method3214();
        this.field2879.method3140(arg0.field2842);
        this.field2893 = arg1;
        this.field2901 = 0L;
        int var3 = this.field2879.method3142();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2879.method3143(var4);
            this.field2879.method3146(var4);
            this.field2879.method3144(var4);
        }
        this.field2902 = this.field2879.method3159();
        this.field2903 = this.field2879.field2861[this.field2902];
        this.field2905 = this.field2879.method3150(this.field2903);
    }

    @ObfuscatedName("fa.i(I)V")
    public synchronized void method3214() {
        this.field2879.method3141();
        this.method3280();
    }

    @ObfuscatedName("fa.w(I)Z")
    public synchronized boolean method3275() {
        return this.field2879.method3177();
    }

    @ObfuscatedName("fa.l(III)V")
    public synchronized void method3216(int arg0, int arg1) {
        this.method3217(arg0, arg1);
    }

    @ObfuscatedName("fa.j(III)V")
    public void method3217(int arg0, int arg1) {
        this.field2904[arg0] = arg1;
        this.field2887[arg0] = arg1 & 0xFFFFFF80;
        this.method3258(arg0, arg1);
    }

    @ObfuscatedName("fa.s(III)V")
    public void method3258(int arg0, int arg1) {
        if (this.field2890[arg0] != arg1) {
            this.field2890[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2899[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("fa.r(IIII)V")
    public void method3218(int arg0, int arg1, int arg2) {
        this.method3226(arg0, arg1, 64);
        if ((this.field2900[arg0] & 0x2) != 0) {
            for (class178 var4 = (class178) this.field2881.field2920.method3411(); var4 != null; var4 = (class178) this.field2881.field2920.method3399()) {
                if (var4.field2924 == arg0 && var4.field2937 < 0) {
                    this.field2898[arg0][var4.field2938] = null;
                    this.field2898[arg0][arg1] = var4;
                    int var5 = (var4.field2933 * var4.field2932 >> 12) + var4.field2931;
                    var4.field2931 += arg1 - var4.field2938 << 8;
                    var4.field2932 = var5 - var4.field2931;
                    var4.field2933 = 4096;
                    var4.field2938 = arg1;
                    return;
                }
            }
        }
        class172 var6 = (class172) this.field2883.method3357((long) this.field2890[arg0]);
        if (var6 == null) {
            return;
        }
        class58 var7 = var6.field2844[arg1];
        if (var7 == null) {
            return;
        }
        class178 var8 = new class178();
        var8.field2924 = arg0;
        var8.field2945 = var6;
        var8.field2925 = var7;
        var8.field2936 = var6.field2854[arg1];
        var8.field2927 = var6.field2849[arg1];
        var8.field2938 = arg1;
        var8.field2944 = var6.field2847 * arg2 * arg2 * var6.field2856[arg1] + 1024 >> 11;
        var8.field2926 = var6.field2848[arg1] & 0xFF;
        var8.field2931 = (arg1 << 8) - (var6.field2845[arg1] & 0x7FFF);
        var8.field2934 = 0;
        var8.field2935 = 0;
        var8.field2943 = 0;
        var8.field2937 = -1;
        var8.field2929 = 0;
        if (this.field2895[arg0] == 0) {
            var8.field2941 = class60.method1216(var7, this.method3295(var8), this.method3229(var8), this.method3238(var8));
        } else {
            var8.field2941 = class60.method1216(var7, this.method3295(var8), 0, this.method3238(var8));
            this.method3236(var8, var6.field2845[arg1] < 0);
        }
        if (var6.field2845[arg1] < 0) {
            var8.field2941.method1199(-1);
        }
        if (var8.field2927 >= 0) {
            class178 var9 = this.field2899[arg0][var8.field2927];
            if (var9 != null && var9.field2937 < 0) {
                this.field2898[arg0][var9.field2938] = null;
                var9.field2937 = 0;
            }
            this.field2899[arg0][var8.field2927] = var8;
        }
        this.field2881.field2920.method3391(var8);
        this.field2898[arg0][arg1] = var8;
    }

    @ObfuscatedName("fa.h(Lfm;ZI)V")
    public void method3236(class178 arg0, boolean arg1) {
        int var3 = arg0.field2925.field1161.length;
        int var5;
        if (arg1 && arg0.field2925.field1160) {
            int var4 = var3 + var3 - arg0.field2925.field1162;
            var5 = (int) ((long) this.field2895[arg0.field2924] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2941.method1168(true);
            }
        } else {
            var5 = (int) ((long) this.field2895[arg0.field2924] * (long) var3 >> 6);
        }
        arg0.field2941.method1161(var5);
    }

    @ObfuscatedName("fa.x(IIII)V")
    public void method3226(int arg0, int arg1, int arg2) {
        class178 var4 = this.field2898[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2898[arg0][arg1] = null;
        if ((this.field2900[arg0] & 0x2) == 0) {
            var4.field2937 = 0;
            return;
        }
        for (class178 var5 = (class178) this.field2881.field2920.method3396(); var5 != null; var5 = (class178) this.field2881.field2920.method3398()) {
            if (var4.field2924 == var5.field2924 && var5.field2937 < 0 && var4 != var5) {
                var4.field2937 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("fa.m(IIII)V")
    public void method3268(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("fa.a(III)V")
    public void method3260(int arg0, int arg1) {
    }

    @ObfuscatedName("fa.p(III)V")
    public void method3220(int arg0, int arg1) {
        this.field2888[arg0] = arg1;
    }

    @ObfuscatedName("fa.c(II)V")
    public void method3221(int arg0) {
        for (class178 var2 = (class178) this.field2881.field2920.method3396(); var2 != null; var2 = (class178) this.field2881.field2920.method3398()) {
            if (arg0 < 0 || var2.field2924 == arg0) {
                if (var2.field2941 != null) {
                    var2.field2941.method1172(Statics.field1126 / 100);
                    if (var2.field2941.method1228()) {
                        this.field2881.field2919.method1045(var2.field2941);
                    }
                    var2.method3318();
                }
                if (var2.field2937 < 0) {
                    this.field2898[var2.field2924][var2.field2938] = null;
                }
                var2.method3482();
            }
        }
    }

    @ObfuscatedName("fa.u(II)V")
    public void method3222(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3222(var2);
            }
            return;
        }
        this.field2906[arg0] = 12800;
        this.field2885[arg0] = 8192;
        this.field2884[arg0] = 16383;
        this.field2888[arg0] = 8192;
        this.field2889[arg0] = 0;
        this.field2891[arg0] = 8192;
        this.method3225(arg0);
        this.method3259(arg0);
        this.field2900[arg0] = 0;
        this.field2886[arg0] = 32767;
        this.field2894[arg0] = 256;
        this.field2895[arg0] = 0;
        this.method3237(arg0, 8192);
    }

    @ObfuscatedName("fa.d(II)V")
    public void method3300(int arg0) {
        for (class178 var2 = (class178) this.field2881.field2920.method3396(); var2 != null; var2 = (class178) this.field2881.field2920.method3398()) {
            if ((arg0 < 0 || var2.field2924 == arg0) && var2.field2937 < 0) {
                this.field2898[var2.field2924][var2.field2938] = null;
                var2.field2937 = 0;
            }
        }
    }

    @ObfuscatedName("fa.o(I)V")
    public void method3280() {
        this.method3221(-1);
        this.method3222(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2890[var1] = this.field2904[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2887[var2] = this.field2904[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("fa.ag(II)V")
    public void method3225(int arg0) {
        if ((this.field2900[arg0] & 0x2) == 0) {
            return;
        }
        for (class178 var2 = (class178) this.field2881.field2920.method3396(); var2 != null; var2 = (class178) this.field2881.field2920.method3398()) {
            if (var2.field2924 == arg0 && this.field2898[arg0][var2.field2938] == null && var2.field2937 < 0) {
                var2.field2937 = 0;
            }
        }
    }

    @ObfuscatedName("fa.as(IS)V")
    public void method3259(int arg0) {
        if ((this.field2900[arg0] & 0x4) == 0) {
            return;
        }
        for (class178 var2 = (class178) this.field2881.field2920.method3396(); var2 != null; var2 = (class178) this.field2881.field2920.method3398()) {
            if (var2.field2924 == arg0) {
                var2.field2940 = 0;
            }
        }
    }

    @ObfuscatedName("fa.aq(II)V")
    public void method3227(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3226(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3218(var6, var7, var8);
            } else {
                this.method3226(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3268(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2887[var12] = (var14 << 14) + (this.field2887[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2887[var12] = (var14 << 7) + (this.field2887[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2889[var12] = (var14 << 7) + (this.field2889[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2889[var12] = (this.field2889[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2891[var12] = (var14 << 7) + (this.field2891[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2891[var12] = (this.field2891[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2906[var12] = (var14 << 7) + (this.field2906[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2906[var12] = (this.field2906[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2885[var12] = (var14 << 7) + (this.field2885[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2885[var12] = (this.field2885[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2884[var12] = (var14 << 7) + (this.field2884[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2884[var12] = (this.field2884[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2900[var12] |= 0x1;
                } else {
                    this.field2900[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2900[var12] |= 0x2;
                } else {
                    this.method3225(var12);
                    this.field2900[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2886[var12] = (var14 << 7) + (this.field2886[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2886[var12] = (this.field2886[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2886[var12] = (var14 << 7) + (this.field2886[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2886[var12] = (this.field2886[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3221(var12);
            }
            if (var13 == 121) {
                this.method3222(var12);
            }
            if (var13 == 123) {
                this.method3300(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2886[var12];
                if (var15 == 16384) {
                    this.field2894[var12] = (var14 << 7) + (this.field2894[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2886[var12];
                if (var16 == 16384) {
                    this.field2894[var12] = (this.field2894[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2895[var12] = (var14 << 7) + (this.field2895[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2895[var12] = (this.field2895[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2900[var12] |= 0x4;
                } else {
                    this.method3259(var12);
                    this.field2900[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3237(var12, (var14 << 7) + (this.field2896[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3237(var12, (this.field2896[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3258(var17, this.field2887[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3260(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method3220(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3280();
            }
        }
    }

    @ObfuscatedName("fa.aw(III)V")
    public void method3237(int arg0, int arg1) {
        this.field2896[arg0] = arg1;
        this.field2897[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("fa.ax(Lfm;I)I")
    public int method3295(class178 arg0) {
        int var2 = (arg0.field2933 * arg0.field2932 >> 12) + arg0.field2931;
        int var3 = ((this.field2888[arg0.field2924] - 8192) * this.field2894[arg0.field2924] >> 12) + var2;
        class176 var4 = arg0.field2936;
        if (var4.field2914 > 0 && (var4.field2913 > 0 || this.field2889[arg0.field2924] > 0)) {
            int var5 = var4.field2913 << 2;
            int var6 = var4.field2915 << 1;
            if (arg0.field2939 < var6) {
                var5 = arg0.field2939 * var5 / var6;
            }
            int var7 = (this.field2889[arg0.field2924] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2928 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2925.field1164 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1126 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("fa.ae(Lfm;I)I")
    public int method3229(class178 arg0) {
        class176 var2 = arg0.field2936;
        int var3 = this.field2884[arg0.field2924] * this.field2906[arg0.field2924] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2944 * var4 + 16384 >> 15;
        int var6 = this.field2880 * var5 + 128 >> 8;
        if (var2.field2909 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2934 * 1.953125E-5D * (double) var2.field2909) + 0.5D);
        }
        if (var2.field2910 != null) {
            int var7 = arg0.field2935;
            int var8 = var2.field2910[arg0.field2943 + 1];
            if (arg0.field2943 < var2.field2910.length - 2) {
                int var9 = (var2.field2910[arg0.field2943] & 0xFF) << 8;
                int var10 = (var2.field2910[arg0.field2943 + 2] & 0xFF) << 8;
                var8 += (var2.field2910[arg0.field2943 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2937 > 0 && var2.field2916 != null) {
            int var11 = arg0.field2937;
            int var12 = var2.field2916[arg0.field2929 + 1];
            if (arg0.field2929 < var2.field2916.length - 2) {
                int var13 = (var2.field2916[arg0.field2929] & 0xFF) << 8;
                int var14 = (var2.field2916[arg0.field2929 + 2] & 0xFF) << 8;
                var12 += (var2.field2916[arg0.field2929 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("fa.aa(Lfm;I)I")
    public int method3238(class178 arg0) {
        int var2 = this.field2885[arg0.field2924];
        return var2 < 8192 ? arg0.field2926 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2926) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("fa.e()Lbk;")
    public synchronized class62 method1009() {
        return this.field2881;
    }

    @ObfuscatedName("fa.q()Lbk;")
    public synchronized class62 method1007() {
        return null;
    }

    @ObfuscatedName("fa.z()I")
    public synchronized int method1006() {
        return 0;
    }

    @ObfuscatedName("fa.v([III)V")
    public synchronized void method1005(int[] arg0, int arg1, int arg2) {
        if (this.field2879.method3177()) {
            int var4 = this.field2892 * this.field2879.field2857 / Statics.field1126;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2901;
                if (this.field2905 - var5 >= 0L) {
                    this.field2901 = var5;
                    break;
                }
                int var7 = (int) ((this.field2905 - this.field2901 + (long) var4 - 1L) / (long) var4);
                this.field2901 += (long) var4 * (long) var7;
                this.field2881.method1005(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3233();
            } while (this.field2879.method3177());
        }
        this.field2881.method1005(arg0, arg1, arg2);
    }

    @ObfuscatedName("fa.f(I)V")
    public synchronized void method1011(int arg0) {
        if (this.field2879.method3177()) {
            int var2 = this.field2892 * this.field2879.field2857 / Statics.field1126;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2901;
                if (this.field2905 - var3 >= 0L) {
                    this.field2901 = var3;
                    break;
                }
                int var5 = (int) ((this.field2905 - this.field2901 + (long) var2 - 1L) / (long) var2);
                this.field2901 += (long) var2 * (long) var5;
                this.field2881.method1011(var5);
                arg0 -= var5;
                this.method3233();
            } while (this.field2879.method3177());
        }
        this.field2881.method1011(arg0);
    }

    @ObfuscatedName("fa.ak(I)V")
    public void method3233() {
        int var1 = this.field2902;
        int var2 = this.field2903;
        long var3 = this.field2905;
        while (this.field2903 == var2) {
            while (this.field2879.field2861[var1] == var2) {
                this.field2879.method3143(var1);
                int var5 = this.field2879.method3147(var1);
                if (var5 == 1) {
                    this.field2879.method3145();
                    this.field2879.method3144(var1);
                    if (this.field2879.method3139()) {
                        if (!this.field2893 || var2 == 0) {
                            this.method3280();
                            this.field2879.method3141();
                            return;
                        }
                        this.field2879.method3153(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3227(var5);
                }
                this.field2879.method3146(var1);
                this.field2879.method3144(var1);
            }
            var1 = this.field2879.method3159();
            var2 = this.field2879.field2861[var1];
            var3 = this.field2879.method3150(var2);
        }
        this.field2902 = var1;
        this.field2903 = var2;
        this.field2905 = var3;
    }

    @ObfuscatedName("fa.ad(Lfm;I)Z")
    public boolean method3234(class178 arg0) {
        if (arg0.field2941 != null) {
            return false;
        }
        if (arg0.field2937 >= 0) {
            arg0.method3482();
            if (arg0.field2927 > 0 && this.field2899[arg0.field2924][arg0.field2927] == arg0) {
                this.field2899[arg0.field2924][arg0.field2927] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("fa.bt(Lfm;[IIII)Z")
    public boolean method3245(class178 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2942 = Statics.field1126 / 100;
        if (arg0.field2937 >= 0 && arg0.field2941 == null || arg0.field2941.method1175()) {
            arg0.method3318();
            arg0.method3482();
            if (arg0.field2927 > 0 && this.field2899[arg0.field2924][arg0.field2927] == arg0) {
                this.field2899[arg0.field2924][arg0.field2927] = null;
            }
            return true;
        }
        int var5 = arg0.field2933;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2891[arg0.field2924] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2933 = var6;
        }
        arg0.field2941.method1160(this.method3295(arg0));
        class176 var7 = arg0.field2936;
        boolean var8 = false;
        arg0.field2939++;
        arg0.field2928 += var7.field2914;
        double var9 = (double) ((arg0.field2938 - 60 << 8) + (arg0.field2933 * arg0.field2932 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2909 > 0) {
            if (var7.field2912 > 0) {
                arg0.field2934 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2912 * var9) + 0.5D);
            } else {
                arg0.field2934 += 128;
            }
        }
        if (var7.field2910 != null) {
            if (var7.field2908 > 0) {
                arg0.field2935 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2908 * var9) + 0.5D);
            } else {
                arg0.field2935 += 128;
            }
            while (arg0.field2943 < var7.field2910.length - 2 && arg0.field2935 > (var7.field2910[arg0.field2943 + 2] & 0xFF) << 8) {
                arg0.field2943 += 2;
            }
            if (arg0.field2943 == var7.field2910.length - 2 && var7.field2910[arg0.field2943 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2937 >= 0 && var7.field2916 != null && (this.field2900[arg0.field2924] & 0x1) == 0 && (arg0.field2927 < 0 || this.field2899[arg0.field2924][arg0.field2927] != arg0)) {
            if (var7.field2907 > 0) {
                arg0.field2937 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2907 * var9) + 0.5D);
            } else {
                arg0.field2937 += 128;
            }
            while (arg0.field2929 < var7.field2916.length - 2 && arg0.field2937 > (var7.field2916[arg0.field2929 + 2] & 0xFF) << 8) {
                arg0.field2929 += 2;
            }
            if (arg0.field2929 == var7.field2916.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2941.method1171(arg0.field2942, this.method3229(arg0), this.method3238(arg0));
            return false;
        }
        arg0.field2941.method1172(arg0.field2942);
        if (arg1 == null) {
            arg0.field2941.method1011(arg3);
        } else {
            arg0.field2941.method1005(arg1, arg2, arg3);
        }
        if (arg0.field2941.method1228()) {
            this.field2881.field2919.method1045(arg0.field2941);
        }
        arg0.method3318();
        if (arg0.field2937 >= 0) {
            arg0.method3482();
            if (arg0.field2927 > 0 && this.field2899[arg0.field2924][arg0.field2927] == arg0) {
                this.field2899[arg0.field2924][arg0.field2927] = null;
            }
        }
        return true;
    }
}
