package deob;

@ObfuscatedName("fp")
public class class175 extends class62 {

    @ObfuscatedName("fp.t")
    public class187 field2857 = new class187(128);

    @ObfuscatedName("fp.b")
    public int field2877 = 256;

    @ObfuscatedName("fp.p")
    public int field2873 = 1000000;

    @ObfuscatedName("fp.e")
    public int[] field2868 = new int[16];

    @ObfuscatedName("fp.i")
    public int[] field2858 = new int[16];

    @ObfuscatedName("fp.o")
    public int[] field2859 = new int[16];

    @ObfuscatedName("fp.f")
    public int[] field2855 = new int[16];

    @ObfuscatedName("fp.d")
    public int[] field2861 = new int[16];

    @ObfuscatedName("fp.j")
    public int[] field2862 = new int[16];

    @ObfuscatedName("fp.x")
    public int[] field2863 = new int[16];

    @ObfuscatedName("fp.v")
    public int[] field2864 = new int[16];

    @ObfuscatedName("fp.a")
    public int[] field2865 = new int[16];

    @ObfuscatedName("fp.q")
    public int[] field2866 = new int[16];

    @ObfuscatedName("fp.g")
    public int[] field2867 = new int[16];

    @ObfuscatedName("fp.z")
    public int[] field2860 = new int[16];

    @ObfuscatedName("fp.m")
    public int[] field2869 = new int[16];

    @ObfuscatedName("fp.y")
    public int[] field2870 = new int[16];

    @ObfuscatedName("fp.n")
    public int[] field2871 = new int[16];

    @ObfuscatedName("fp.s")
    public class178[][] field2854 = new class178[16][128];

    @ObfuscatedName("fp.ac")
    public class178[][] field2878 = new class178[16][128];

    @ObfuscatedName("fp.au")
    public class173 field2874 = new class173();

    @ObfuscatedName("fp.ap")
    public boolean field2875;

    @ObfuscatedName("fp.ah")
    public int field2876;

    @ObfuscatedName("fp.ae")
    public int field2872;

    @ObfuscatedName("fp.ag")
    public long field2856;

    @ObfuscatedName("fp.as")
    public long field2879;

    @ObfuscatedName("fp.at")
    public class177 field2880 = new class177(this);

    public class175() {
        this.method3231();
    }

    @ObfuscatedName("fp.t(IB)V")
    public synchronized void method3281(int arg0) {
        this.field2877 = arg0;
    }

    @ObfuscatedName("fp.b(B)I")
    public int method3212() {
        return this.field2877;
    }

    @ObfuscatedName("fp.p(Lfe;Lfj;Lbs;II)Z")
    public synchronized boolean method3213(class171 arg0, class158 arg1, class55 arg2, int arg3) {
        arg0.method3120();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class188 var7 = (class188) arg0.field2816.method3384(); var7 != null; var7 = (class188) arg0.field2816.method3377()) {
            int var8 = (int) var7.field3015;
            class172 var9 = (class172) this.field2857.method3382((long) var8);
            if (var9 == null) {
                var9 = class172.method3083(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field2857.method3391(var9, (long) var8);
            }
            if (!var9.method3130(arg2, var7.field2994, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3121();
        }
        return var5;
    }

    @ObfuscatedName("fp.e(I)V")
    public synchronized void method3267() {
        for (class172 var1 = (class172) this.field2857.method3384(); var1 != null; var1 = (class172) this.field2857.method3377()) {
            var1.method3131();
        }
    }

    @ObfuscatedName("fp.i(B)V")
    public synchronized void method3215() {
        for (class172 var1 = (class172) this.field2857.method3384(); var1 != null; var1 = (class172) this.field2857.method3377()) {
            var1.method3506();
        }
    }

    @ObfuscatedName("fp.x(Lfe;ZI)V")
    public synchronized void method3308(class171 arg0, boolean arg1) {
        this.method3217();
        this.field2874.method3152(arg0.field2815);
        this.field2875 = arg1;
        this.field2856 = 0L;
        int var3 = this.field2874.method3146();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2874.method3161(var4);
            this.field2874.method3178(var4);
            this.field2874.method3148(var4);
        }
        this.field2876 = this.field2874.method3155();
        this.field2872 = this.field2874.field2831[this.field2876];
        this.field2879 = this.field2874.method3154(this.field2872);
    }

    @ObfuscatedName("fp.a(B)V")
    public synchronized void method3217() {
        this.field2874.method3169();
        this.method3231();
    }

    @ObfuscatedName("fp.l(B)Z")
    public synchronized boolean method3218() {
        return this.field2874.method3145();
    }

    @ObfuscatedName("fp.h(III)V")
    public synchronized void method3219(int arg0, int arg1) {
        this.method3254(arg0, arg1);
    }

    @ObfuscatedName("fp.c(III)V")
    public void method3254(int arg0, int arg1) {
        this.field2855[arg0] = arg1;
        this.field2862[arg0] = arg1 & 0xFFFFFF80;
        this.method3221(arg0, arg1);
    }

    @ObfuscatedName("fp.u(III)V")
    public void method3221(int arg0, int arg1) {
        if (this.field2861[arg0] != arg1) {
            this.field2861[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2878[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("fp.r(IIIB)V")
    public void method3222(int arg0, int arg1, int arg2) {
        this.method3224(arg0, arg1, 64);
        if ((this.field2866[arg0] & 0x2) != 0) {
            for (class178 var4 = (class178) this.field2880.field2896.method3438(); var4 != null; var4 = (class178) this.field2880.field2896.method3414()) {
                if (var4.field2907 == arg0 && var4.field2924 < 0) {
                    this.field2854[arg0][var4.field2922] = null;
                    this.field2854[arg0][arg1] = var4;
                    int var5 = (var4.field2912 * var4.field2902 >> 12) + var4.field2909;
                    var4.field2909 += arg1 - var4.field2922 << 8;
                    var4.field2902 = var5 - var4.field2909;
                    var4.field2912 = 4096;
                    var4.field2922 = arg1;
                    return;
                }
            }
        }
        class172 var6 = (class172) this.field2857.method3382((long) this.field2861[arg0]);
        if (var6 == null) {
            return;
        }
        class58 var7 = var6.field2817[arg1];
        if (var7 == null) {
            return;
        }
        class178 var8 = new class178();
        var8.field2907 = arg0;
        var8.field2903 = var6;
        var8.field2904 = var7;
        var8.field2905 = var6.field2823[arg1];
        var8.field2906 = var6.field2822[arg1];
        var8.field2922 = arg1;
        var8.field2908 = var6.field2830 * arg2 * arg2 * var6.field2820[arg1] + 1024 >> 11;
        var8.field2916 = var6.field2818[arg1] & 0xFF;
        var8.field2909 = (arg1 << 8) - (var6.field2819[arg1] & 0x7FFF);
        var8.field2913 = 0;
        var8.field2914 = 0;
        var8.field2915 = 0;
        var8.field2924 = -1;
        var8.field2917 = 0;
        if (this.field2869[arg0] == 0) {
            var8.field2920 = class60.method1260(var7, this.method3236(var8), this.method3271(var8), this.method3237(var8));
        } else {
            var8.field2920 = class60.method1260(var7, this.method3236(var8), 0, this.method3237(var8));
            this.method3270(var8, var6.field2819[arg1] < 0);
        }
        if (var6.field2819[arg1] < 0) {
            var8.field2920.method1189(-1);
        }
        if (var8.field2906 >= 0) {
            class178 var9 = this.field2878[arg0][var8.field2906];
            if (var9 != null && var9.field2924 < 0) {
                this.field2854[arg0][var9.field2922] = null;
                var9.field2924 = 0;
            }
            this.field2878[arg0][var8.field2906] = var8;
        }
        this.field2880.field2896.method3442(var8);
        this.field2854[arg0][arg1] = var8;
    }

    @ObfuscatedName("fp.k(Lfd;ZI)V")
    public void method3270(class178 arg0, boolean arg1) {
        int var3 = arg0.field2904.field1144.length;
        int var5;
        if (arg1 && arg0.field2904.field1145) {
            int var4 = var3 + var3 - arg0.field2904.field1143;
            var5 = (int) ((long) this.field2869[arg0.field2907] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2920.method1227(true);
            }
        } else {
            var5 = (int) ((long) this.field2869[arg0.field2907] * (long) var3 >> 6);
        }
        arg0.field2920.method1199(var5);
    }

    @ObfuscatedName("fp.w(IIII)V")
    public void method3224(int arg0, int arg1, int arg2) {
        class178 var4 = this.field2854[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2854[arg0][arg1] = null;
        if ((this.field2866[arg0] & 0x2) == 0) {
            var4.field2924 = 0;
            return;
        }
        for (class178 var5 = (class178) this.field2880.field2896.method3415(); var5 != null; var5 = (class178) this.field2880.field2896.method3419()) {
            if (var4.field2907 == var5.field2907 && var5.field2924 < 0 && var4 != var5) {
                var4.field2924 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("fp.q(IIIB)V")
    public void method3291(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("fp.g(III)V")
    public void method3226(int arg0, int arg1) {
    }

    @ObfuscatedName("fp.z(III)V")
    public void method3211(int arg0, int arg1) {
        this.field2863[arg0] = arg1;
    }

    @ObfuscatedName("fp.m(II)V")
    public void method3228(int arg0) {
        for (class178 var2 = (class178) this.field2880.field2896.method3415(); var2 != null; var2 = (class178) this.field2880.field2896.method3419()) {
            if (arg0 < 0 || var2.field2907 == arg0) {
                if (var2.field2920 != null) {
                    var2.field2920.method1205(Statics.field1106 / 100);
                    if (var2.field2920.method1204()) {
                        this.field2880.field2897.method1078(var2.field2920);
                    }
                    var2.method3330();
                }
                if (var2.field2924 < 0) {
                    this.field2854[var2.field2907][var2.field2922] = null;
                }
                var2.method3506();
            }
        }
    }

    @ObfuscatedName("fp.y(II)V")
    public void method3229(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3229(var2);
            }
            return;
        }
        this.field2868[arg0] = 12800;
        this.field2858[arg0] = 8192;
        this.field2859[arg0] = 16383;
        this.field2863[arg0] = 8192;
        this.field2864[arg0] = 0;
        this.field2865[arg0] = 8192;
        this.method3232(arg0);
        this.method3233(arg0);
        this.field2866[arg0] = 0;
        this.field2867[arg0] = 32767;
        this.field2860[arg0] = 256;
        this.field2869[arg0] = 0;
        this.method3275(arg0, 8192);
    }

    @ObfuscatedName("fp.n(II)V")
    public void method3230(int arg0) {
        for (class178 var2 = (class178) this.field2880.field2896.method3415(); var2 != null; var2 = (class178) this.field2880.field2896.method3419()) {
            if ((arg0 < 0 || var2.field2907 == arg0) && var2.field2924 < 0) {
                this.field2854[var2.field2907][var2.field2922] = null;
                var2.field2924 = 0;
            }
        }
    }

    @ObfuscatedName("fp.s(I)V")
    public void method3231() {
        this.method3228(-1);
        this.method3229(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2861[var1] = this.field2855[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2862[var2] = this.field2855[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("fp.ak(II)V")
    public void method3232(int arg0) {
        if ((this.field2866[arg0] & 0x2) == 0) {
            return;
        }
        for (class178 var2 = (class178) this.field2880.field2896.method3415(); var2 != null; var2 = (class178) this.field2880.field2896.method3419()) {
            if (var2.field2907 == arg0 && this.field2854[arg0][var2.field2922] == null && var2.field2924 < 0) {
                var2.field2924 = 0;
            }
        }
    }

    @ObfuscatedName("fp.ar(IB)V")
    public void method3233(int arg0) {
        if ((this.field2866[arg0] & 0x4) == 0) {
            return;
        }
        for (class178 var2 = (class178) this.field2880.field2896.method3415(); var2 != null; var2 = (class178) this.field2880.field2896.method3419()) {
            if (var2.field2907 == arg0) {
                var2.field2923 = 0;
            }
        }
    }

    @ObfuscatedName("fp.ai(IB)V")
    public void method3245(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3224(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3222(var6, var7, var8);
            } else {
                this.method3224(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3291(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2862[var12] = (var14 << 14) + (this.field2862[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2862[var12] = (var14 << 7) + (this.field2862[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2864[var12] = (var14 << 7) + (this.field2864[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2864[var12] = (this.field2864[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2865[var12] = (var14 << 7) + (this.field2865[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2865[var12] = (this.field2865[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2868[var12] = (var14 << 7) + (this.field2868[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2868[var12] = (this.field2868[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2858[var12] = (var14 << 7) + (this.field2858[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2858[var12] = (this.field2858[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2859[var12] = (var14 << 7) + (this.field2859[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2859[var12] = (this.field2859[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2866[var12] |= 0x1;
                } else {
                    this.field2866[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2866[var12] |= 0x2;
                } else {
                    this.method3232(var12);
                    this.field2866[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2867[var12] = (var14 << 7) + (this.field2867[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2867[var12] = (this.field2867[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2867[var12] = (var14 << 7) + (this.field2867[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2867[var12] = (this.field2867[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3228(var12);
            }
            if (var13 == 121) {
                this.method3229(var12);
            }
            if (var13 == 123) {
                this.method3230(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2867[var12];
                if (var15 == 16384) {
                    this.field2860[var12] = (var14 << 7) + (this.field2860[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2867[var12];
                if (var16 == 16384) {
                    this.field2860[var12] = (this.field2860[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2869[var12] = (var14 << 7) + (this.field2869[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2869[var12] = (this.field2869[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2866[var12] |= 0x4;
                } else {
                    this.method3233(var12);
                    this.field2866[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3275(var12, (var14 << 7) + (this.field2870[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3275(var12, (this.field2870[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3221(var17, this.field2862[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3226(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method3211(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3231();
            }
        }
    }

    @ObfuscatedName("fp.ax(III)V")
    public void method3275(int arg0, int arg1) {
        this.field2870[arg0] = arg1;
        this.field2871[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("fp.aq(Lfd;I)I")
    public int method3236(class178 arg0) {
        int var2 = (arg0.field2912 * arg0.field2902 >> 12) + arg0.field2909;
        int var3 = ((this.field2863[arg0.field2907] - 8192) * this.field2860[arg0.field2907] >> 12) + var2;
        class176 var4 = arg0.field2905;
        if (var4.field2889 > 0 && (var4.field2882 > 0 || this.field2864[arg0.field2907] > 0)) {
            int var5 = var4.field2882 << 2;
            int var6 = var4.field2883 << 1;
            if (arg0.field2918 < var6) {
                var5 = arg0.field2918 * var5 / var6;
            }
            int var7 = (this.field2864[arg0.field2907] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2919 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2904.field1141 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1106 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("fp.ad(Lfd;I)I")
    public int method3271(class178 arg0) {
        class176 var2 = arg0.field2905;
        int var3 = this.field2859[arg0.field2907] * this.field2868[arg0.field2907] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2908 * var4 + 16384 >> 15;
        int var6 = this.field2877 * var5 + 128 >> 8;
        if (var2.field2884 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2913 * 1.953125E-5D * (double) var2.field2884) + 0.5D);
        }
        if (var2.field2890 != null) {
            int var7 = arg0.field2914;
            int var8 = var2.field2890[arg0.field2915 + 1];
            if (arg0.field2915 < var2.field2890.length - 2) {
                int var9 = (var2.field2890[arg0.field2915] & 0xFF) << 8;
                int var10 = (var2.field2890[arg0.field2915 + 2] & 0xFF) << 8;
                var8 += (var2.field2890[arg0.field2915 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2924 > 0 && var2.field2891 != null) {
            int var11 = arg0.field2924;
            int var12 = var2.field2891[arg0.field2917 + 1];
            if (arg0.field2917 < var2.field2891.length - 2) {
                int var13 = (var2.field2891[arg0.field2917] & 0xFF) << 8;
                int var14 = (var2.field2891[arg0.field2917 + 2] & 0xFF) << 8;
                var12 += (var2.field2891[arg0.field2917 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("fp.af(Lfd;I)I")
    public int method3237(class178 arg0) {
        int var2 = this.field2858[arg0.field2907];
        return var2 < 8192 ? arg0.field2916 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2916) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("fp.o()Lbw;")
    public synchronized class62 method1038() {
        return this.field2880;
    }

    @ObfuscatedName("fp.f()Lbw;")
    public synchronized class62 method1047() {
        return null;
    }

    @ObfuscatedName("fp.d()I")
    public synchronized int method1040() {
        return 0;
    }

    @ObfuscatedName("fp.j([III)V")
    public synchronized void method1041(int[] arg0, int arg1, int arg2) {
        if (this.field2874.method3145()) {
            int var4 = this.field2873 * this.field2874.field2832 / Statics.field1106;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2856;
                if (this.field2879 - var5 >= 0L) {
                    this.field2856 = var5;
                    break;
                }
                int var7 = (int) ((this.field2879 - this.field2856 + (long) var4 - 1L) / (long) var4);
                this.field2856 += (long) var4 * (long) var7;
                this.field2880.method1041(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3307();
            } while (this.field2874.method3145());
        }
        this.field2880.method1041(arg0, arg1, arg2);
    }

    @ObfuscatedName("fp.v(I)V")
    public synchronized void method1043(int arg0) {
        if (this.field2874.method3145()) {
            int var2 = this.field2873 * this.field2874.field2832 / Statics.field1106;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2856;
                if (this.field2879 - var3 >= 0L) {
                    this.field2856 = var3;
                    break;
                }
                int var5 = (int) ((this.field2879 - this.field2856 + (long) var2 - 1L) / (long) var2);
                this.field2856 += (long) var2 * (long) var5;
                this.field2880.method1043(var5);
                arg0 -= var5;
                this.method3307();
            } while (this.field2874.method3145());
        }
        this.field2880.method1043(arg0);
    }

    @ObfuscatedName("fp.av(I)V")
    public void method3307() {
        int var1 = this.field2876;
        int var2 = this.field2872;
        long var3 = this.field2879;
        while (this.field2872 == var2) {
            while (this.field2874.field2831[var1] == var2) {
                this.field2874.method3161(var1);
                int var5 = this.field2874.method3151(var1);
                if (var5 == 1) {
                    this.field2874.method3174();
                    this.field2874.method3148(var1);
                    if (this.field2874.method3156()) {
                        if (!this.field2875 || var2 == 0) {
                            this.method3231();
                            this.field2874.method3169();
                            return;
                        }
                        this.field2874.method3157(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3245(var5);
                }
                this.field2874.method3178(var1);
                this.field2874.method3148(var1);
            }
            var1 = this.field2874.method3155();
            var2 = this.field2874.field2831[var1];
            var3 = this.field2874.method3154(var2);
        }
        this.field2876 = var1;
        this.field2872 = var2;
        this.field2879 = var3;
    }

    @ObfuscatedName("fp.an(Lfd;B)Z")
    public boolean method3241(class178 arg0) {
        if (arg0.field2920 != null) {
            return false;
        }
        if (arg0.field2924 >= 0) {
            arg0.method3506();
            if (arg0.field2906 > 0 && this.field2878[arg0.field2907][arg0.field2906] == arg0) {
                this.field2878[arg0.field2907][arg0.field2906] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("fp.am(Lfd;[IIII)Z")
    public boolean method3256(class178 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2921 = Statics.field1106 / 100;
        if (arg0.field2924 >= 0 && arg0.field2920 == null || arg0.field2920.method1283()) {
            arg0.method3330();
            arg0.method3506();
            if (arg0.field2906 > 0 && this.field2878[arg0.field2907][arg0.field2906] == arg0) {
                this.field2878[arg0.field2907][arg0.field2906] = null;
            }
            return true;
        }
        int var5 = arg0.field2912;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2865[arg0.field2907] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2912 = var6;
        }
        arg0.field2920.method1200(this.method3236(arg0));
        class176 var7 = arg0.field2905;
        boolean var8 = false;
        arg0.field2918++;
        arg0.field2919 += var7.field2889;
        double var9 = (double) ((arg0.field2922 - 60 << 8) + (arg0.field2912 * arg0.field2902 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2884 > 0) {
            if (var7.field2887 > 0) {
                arg0.field2913 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2887 * var9) + 0.5D);
            } else {
                arg0.field2913 += 128;
            }
        }
        if (var7.field2890 != null) {
            if (var7.field2885 > 0) {
                arg0.field2914 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2885 * var9) + 0.5D);
            } else {
                arg0.field2914 += 128;
            }
            while (arg0.field2915 < var7.field2890.length - 2 && arg0.field2914 > (var7.field2890[arg0.field2915 + 2] & 0xFF) << 8) {
                arg0.field2915 += 2;
            }
            if (arg0.field2915 == var7.field2890.length - 2 && var7.field2890[arg0.field2915 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2924 >= 0 && var7.field2891 != null && (this.field2866[arg0.field2907] & 0x1) == 0 && (arg0.field2906 < 0 || this.field2878[arg0.field2907][arg0.field2906] != arg0)) {
            if (var7.field2886 > 0) {
                arg0.field2924 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2886 * var9) + 0.5D);
            } else {
                arg0.field2924 += 128;
            }
            while (arg0.field2917 < var7.field2891.length - 2 && arg0.field2924 > (var7.field2891[arg0.field2917 + 2] & 0xFF) << 8) {
                arg0.field2917 += 2;
            }
            if (arg0.field2917 == var7.field2891.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2920.method1310(arg0.field2921, this.method3271(arg0), this.method3237(arg0));
            return false;
        }
        arg0.field2920.method1205(arg0.field2921);
        if (arg1 == null) {
            arg0.field2920.method1043(arg3);
        } else {
            arg0.field2920.method1041(arg1, arg2, arg3);
        }
        if (arg0.field2920.method1204()) {
            this.field2880.field2897.method1078(arg0.field2920);
        }
        arg0.method3330();
        if (arg0.field2924 >= 0) {
            arg0.method3506();
            if (arg0.field2906 > 0 && this.field2878[arg0.field2907][arg0.field2906] == arg0) {
                this.field2878[arg0.field2907][arg0.field2906] = null;
            }
        }
        return true;
    }
}
