package deob;

@ObfuscatedName("fm")
public class class175 extends class62 {

    @ObfuscatedName("fm.p")
    public class187 field2870 = new class187(128);

    @ObfuscatedName("fm.k")
    public int field2869 = 256;

    @ObfuscatedName("fm.e")
    public int field2862 = 1000000;

    @ObfuscatedName("fm.f")
    public int[] field2863 = new int[16];

    @ObfuscatedName("fm.t")
    public int[] field2888 = new int[16];

    @ObfuscatedName("fm.s")
    public int[] field2865 = new int[16];

    @ObfuscatedName("fm.c")
    public int[] field2874 = new int[16];

    @ObfuscatedName("fm.d")
    public int[] field2867 = new int[16];

    @ObfuscatedName("fm.v")
    public int[] field2868 = new int[16];

    @ObfuscatedName("fm.m")
    public int[] field2860 = new int[16];

    @ObfuscatedName("fm.h")
    public int[] field2861 = new int[16];

    @ObfuscatedName("fm.n")
    public int[] field2871 = new int[16];

    @ObfuscatedName("fm.g")
    public int[] field2873 = new int[16];

    @ObfuscatedName("fm.l")
    public int[] field2878 = new int[16];

    @ObfuscatedName("fm.u")
    public int[] field2864 = new int[16];

    @ObfuscatedName("fm.j")
    public int[] field2876 = new int[16];

    @ObfuscatedName("fm.z")
    public int[] field2877 = new int[16];

    @ObfuscatedName("fm.b")
    public int[] field2875 = new int[16];

    @ObfuscatedName("fm.a")
    public class178[][] field2879 = new class178[16][128];

    @ObfuscatedName("fm.ag")
    public class178[][] field2880 = new class178[16][128];

    @ObfuscatedName("fm.am")
    public class173 field2881 = new class173();

    @ObfuscatedName("fm.aa")
    public boolean field2882;

    @ObfuscatedName("fm.az")
    public int field2883;

    @ObfuscatedName("fm.aq")
    public int field2884;

    @ObfuscatedName("fm.ak")
    public long field2885;

    @ObfuscatedName("fm.ar")
    public long field2886;

    @ObfuscatedName("fm.al")
    public class177 field2887 = new class177(this);

    public class175() {
        this.method3319();
    }

    @ObfuscatedName("fm.p(IB)V")
    public synchronized void method3246(int arg0) {
        this.field2869 = arg0;
    }

    @ObfuscatedName("fm.k(I)I")
    public int method3247() {
        return this.field2869;
    }

    @ObfuscatedName("fm.e(Lfl;Lff;Lbn;IB)Z")
    public synchronized boolean method3302(class171 arg0, class158 arg1, class55 arg2, int arg3) {
        arg0.method3166();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class188 var7 = (class188) arg0.field2827.method3412(); var7 != null; var7 = (class188) arg0.field2827.method3410()) {
            int var8 = (int) var7.field3015;
            class172 var9 = (class172) this.field2870.method3405((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method2901(var8);
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
                this.field2870.method3406(var11, (long) var8);
            }
            if (!var9.method3184(arg2, var7.field2994, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3167();
        }
        return var5;
    }

    @ObfuscatedName("fm.f(I)V")
    public synchronized void method3249() {
        for (class172 var1 = (class172) this.field2870.method3412(); var1 != null; var1 = (class172) this.field2870.method3410()) {
            var1.method3179();
        }
    }

    @ObfuscatedName("fm.w(I)V")
    public synchronized void method3250() {
        for (class172 var1 = (class172) this.field2870.method3412(); var1 != null; var1 = (class172) this.field2870.method3410()) {
            var1.method3533();
        }
    }

    @ObfuscatedName("fm.v(Lfl;ZI)V")
    public synchronized void method3287(class171 arg0, boolean arg1) {
        this.method3252();
        this.field2881.method3185(arg0.field2828);
        this.field2882 = arg1;
        this.field2885 = 0L;
        int var3 = this.field2881.method3189();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2881.method3198(var4);
            this.field2881.method3193(var4);
            this.field2881.method3191(var4);
        }
        this.field2883 = this.field2881.method3228();
        this.field2884 = this.field2881.field2845[this.field2883];
        this.field2886 = this.field2881.method3188(this.field2884);
    }

    @ObfuscatedName("fm.h(I)V")
    public synchronized void method3252() {
        this.field2881.method3187();
        this.method3319();
    }

    @ObfuscatedName("fm.n(I)Z")
    public synchronized boolean method3253() {
        return this.field2881.method3186();
    }

    @ObfuscatedName("fm.x(III)V")
    public synchronized void method3254(int arg0, int arg1) {
        this.method3331(arg0, arg1);
    }

    @ObfuscatedName("fm.o(III)V")
    public void method3331(int arg0, int arg1) {
        this.field2874[arg0] = arg1;
        this.field2868[arg0] = arg1 & 0xFFFFFF80;
        this.method3256(arg0, arg1);
    }

    @ObfuscatedName("fm.r(IIB)V")
    public void method3256(int arg0, int arg1) {
        if (this.field2867[arg0] != arg1) {
            this.field2867[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2880[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("fm.y(IIII)V")
    public void method3257(int arg0, int arg1, int arg2) {
        this.method3259(arg0, arg1, 64);
        if ((this.field2873[arg0] & 0x2) != 0) {
            for (class178 var4 = (class178) this.field2887.field2903.method3443(); var4 != null; var4 = (class178) this.field2887.field2903.method3446()) {
                if (var4.field2915 == arg0 && var4.field2910 < 0) {
                    this.field2879[arg0][var4.field2914] = null;
                    this.field2879[arg0][arg1] = var4;
                    int var5 = (var4.field2919 * var4.field2918 >> 12) + var4.field2917;
                    var4.field2917 += arg1 - var4.field2914 << 8;
                    var4.field2918 = var5 - var4.field2917;
                    var4.field2919 = 4096;
                    var4.field2914 = arg1;
                    return;
                }
            }
        }
        class172 var6 = (class172) this.field2870.method3405((long) this.field2867[arg0]);
        if (var6 == null) {
            return;
        }
        class58 var7 = var6.field2830[arg1];
        if (var7 == null) {
            return;
        }
        class178 var8 = new class178();
        var8.field2915 = arg0;
        var8.field2927 = var6;
        var8.field2916 = var7;
        var8.field2912 = var6.field2838[arg1];
        var8.field2913 = var6.field2829[arg1];
        var8.field2914 = arg1;
        var8.field2911 = var6.field2836 * arg2 * arg2 * var6.field2832[arg1] + 1024 >> 11;
        var8.field2923 = var6.field2833[arg1] & 0xFF;
        var8.field2917 = (arg1 << 8) - (var6.field2831[arg1] & 0x7FFF);
        var8.field2931 = 0;
        var8.field2921 = 0;
        var8.field2922 = 0;
        var8.field2910 = -1;
        var8.field2909 = 0;
        if (this.field2876[arg0] == 0) {
            var8.field2924 = class60.method1138(var7, this.method3271(var8), this.method3279(var8), this.method3266(var8));
        } else {
            var8.field2924 = class60.method1138(var7, this.method3271(var8), 0, this.method3266(var8));
            this.method3258(var8, var6.field2831[arg1] < 0);
        }
        if (var6.field2831[arg1] < 0) {
            var8.field2924.method1140(-1);
        }
        if (var8.field2913 >= 0) {
            class178 var9 = this.field2880[arg0][var8.field2913];
            if (var9 != null && var9.field2910 < 0) {
                this.field2879[arg0][var9.field2914] = null;
                var9.field2910 = 0;
            }
            this.field2880[arg0][var8.field2913] = var8;
        }
        this.field2887.field2903.method3437(var8);
        this.field2879[arg0][arg1] = var8;
    }

    @ObfuscatedName("fm.i(Lfq;ZB)V")
    public void method3258(class178 arg0, boolean arg1) {
        int var3 = arg0.field2916.field1171.length;
        int var5;
        if (arg1 && arg0.field2916.field1174) {
            int var4 = var3 + var3 - arg0.field2916.field1172;
            var5 = (int) ((long) this.field2876[arg0.field2915] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2924.method1147(true);
            }
        } else {
            var5 = (int) ((long) this.field2876[arg0.field2915] * (long) var3 >> 6);
        }
        arg0.field2924.method1159(var5);
    }

    @ObfuscatedName("fm.q(IIIB)V")
    public void method3259(int arg0, int arg1, int arg2) {
        class178 var4 = this.field2879[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2879[arg0][arg1] = null;
        if ((this.field2873[arg0] & 0x2) == 0) {
            var4.field2910 = 0;
            return;
        }
        for (class178 var5 = (class178) this.field2887.field2903.method3442(); var5 != null; var5 = (class178) this.field2887.field2903.method3444()) {
            if (var4.field2915 == var5.field2915 && var5.field2910 < 0 && var4 != var5) {
                var4.field2910 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("fm.g(IIII)V")
    public void method3260(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("fm.l(IIB)V")
    public void method3261(int arg0, int arg1) {
    }

    @ObfuscatedName("fm.aq(IIB)V")
    public void method3262(int arg0, int arg1) {
        this.field2860[arg0] = arg1;
    }

    @ObfuscatedName("fm.ak(IB)V")
    public void method3263(int arg0) {
        for (class178 var2 = (class178) this.field2887.field2903.method3442(); var2 != null; var2 = (class178) this.field2887.field2903.method3444()) {
            if (arg0 < 0 || var2.field2915 == arg0) {
                if (var2.field2924 != null) {
                    var2.field2924.method1209(Statics.field1494 / 100);
                    if (var2.field2924.method1154()) {
                        this.field2887.field2902.method1006(var2.field2924);
                    }
                    var2.method3362();
                }
                if (var2.field2910 < 0) {
                    this.field2879[var2.field2915][var2.field2914] = null;
                }
                var2.method3533();
            }
        }
    }

    @ObfuscatedName("fm.ar(IB)V")
    public void method3264(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3264(var2);
            }
            return;
        }
        this.field2863[arg0] = 12800;
        this.field2888[arg0] = 8192;
        this.field2865[arg0] = 16383;
        this.field2860[arg0] = 8192;
        this.field2861[arg0] = 0;
        this.field2871[arg0] = 8192;
        this.method3267(arg0);
        this.method3316(arg0);
        this.field2873[arg0] = 0;
        this.field2878[arg0] = 32767;
        this.field2864[arg0] = 256;
        this.field2876[arg0] = 0;
        this.method3270(arg0, 8192);
    }

    @ObfuscatedName("fm.ao(II)V")
    public void method3315(int arg0) {
        for (class178 var2 = (class178) this.field2887.field2903.method3442(); var2 != null; var2 = (class178) this.field2887.field2903.method3444()) {
            if ((arg0 < 0 || var2.field2915 == arg0) && var2.field2910 < 0) {
                this.field2879[var2.field2915][var2.field2914] = null;
                var2.field2910 = 0;
            }
        }
    }

    @ObfuscatedName("fm.af(B)V")
    public void method3319() {
        this.method3263(-1);
        this.method3264(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2867[var1] = this.field2874[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2868[var2] = this.field2874[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("fm.aj(II)V")
    public void method3267(int arg0) {
        if ((this.field2873[arg0] & 0x2) == 0) {
            return;
        }
        for (class178 var2 = (class178) this.field2887.field2903.method3442(); var2 != null; var2 = (class178) this.field2887.field2903.method3444()) {
            if (var2.field2915 == arg0 && this.field2879[arg0][var2.field2914] == null && var2.field2910 < 0) {
                var2.field2910 = 0;
            }
        }
    }

    @ObfuscatedName("fm.aw(II)V")
    public void method3316(int arg0) {
        if ((this.field2873[arg0] & 0x4) == 0) {
            return;
        }
        for (class178 var2 = (class178) this.field2887.field2903.method3442(); var2 != null; var2 = (class178) this.field2887.field2903.method3444()) {
            if (var2.field2915 == arg0) {
                var2.field2929 = 0;
            }
        }
    }

    @ObfuscatedName("fm.ab(IB)V")
    public void method3269(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3259(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3257(var6, var7, var8);
            } else {
                this.method3259(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3260(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2868[var12] = (var14 << 14) + (this.field2868[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2868[var12] = (var14 << 7) + (this.field2868[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2861[var12] = (var14 << 7) + (this.field2861[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2861[var12] = (this.field2861[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2871[var12] = (var14 << 7) + (this.field2871[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2871[var12] = (this.field2871[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2863[var12] = (var14 << 7) + (this.field2863[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2863[var12] = (this.field2863[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2888[var12] = (var14 << 7) + (this.field2888[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2888[var12] = (this.field2888[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2865[var12] = (var14 << 7) + (this.field2865[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2865[var12] = (this.field2865[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2873[var12] |= 0x1;
                } else {
                    this.field2873[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2873[var12] |= 0x2;
                } else {
                    this.method3267(var12);
                    this.field2873[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2878[var12] = (var14 << 7) + (this.field2878[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2878[var12] = (this.field2878[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2878[var12] = (var14 << 7) + (this.field2878[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2878[var12] = (this.field2878[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3263(var12);
            }
            if (var13 == 121) {
                this.method3264(var12);
            }
            if (var13 == 123) {
                this.method3315(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2878[var12];
                if (var15 == 16384) {
                    this.field2864[var12] = (var14 << 7) + (this.field2864[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2878[var12];
                if (var16 == 16384) {
                    this.field2864[var12] = (this.field2864[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2876[var12] = (var14 << 7) + (this.field2876[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2876[var12] = (this.field2876[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2873[var12] |= 0x4;
                } else {
                    this.method3316(var12);
                    this.field2873[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3270(var12, (var14 << 7) + (this.field2877[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3270(var12, (this.field2877[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3256(var17, this.field2868[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3261(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method3262(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3319();
            }
        }
    }

    @ObfuscatedName("fm.ad(III)V")
    public void method3270(int arg0, int arg1) {
        this.field2877[arg0] = arg1;
        this.field2875[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("fm.ae(Lfq;I)I")
    public int method3271(class178 arg0) {
        int var2 = (arg0.field2919 * arg0.field2918 >> 12) + arg0.field2917;
        int var3 = ((this.field2860[arg0.field2915] - 8192) * this.field2864[arg0.field2915] >> 12) + var2;
        class176 var4 = arg0.field2912;
        if (var4.field2901 > 0 && (var4.field2895 > 0 || this.field2861[arg0.field2915] > 0)) {
            int var5 = var4.field2895 << 2;
            int var6 = var4.field2897 << 1;
            if (arg0.field2925 < var6) {
                var5 = arg0.field2925 * var5 / var6;
            }
            int var7 = (this.field2861[arg0.field2915] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2926 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2916.field1170 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1494 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("fm.ay(Lfq;I)I")
    public int method3279(class178 arg0) {
        class176 var2 = arg0.field2912;
        int var3 = this.field2865[arg0.field2915] * this.field2863[arg0.field2915] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2911 * var4 + 16384 >> 15;
        int var6 = this.field2869 * var5 + 128 >> 8;
        if (var2.field2891 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2931 * 1.953125E-5D * (double) var2.field2891) + 0.5D);
        }
        if (var2.field2889 != null) {
            int var7 = arg0.field2921;
            int var8 = var2.field2889[arg0.field2922 + 1];
            if (arg0.field2922 < var2.field2889.length - 2) {
                int var9 = (var2.field2889[arg0.field2922] & 0xFF) << 8;
                int var10 = (var2.field2889[arg0.field2922 + 2] & 0xFF) << 8;
                var8 += (var2.field2889[arg0.field2922 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2910 > 0 && var2.field2890 != null) {
            int var11 = arg0.field2910;
            int var12 = var2.field2890[arg0.field2909 + 1];
            if (arg0.field2909 < var2.field2890.length - 2) {
                int var13 = (var2.field2890[arg0.field2909] & 0xFF) << 8;
                int var14 = (var2.field2890[arg0.field2909 + 2] & 0xFF) << 8;
                var12 += (var2.field2890[arg0.field2909 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("fm.ap(Lfq;B)I")
    public int method3266(class178 arg0) {
        int var2 = this.field2888[arg0.field2915];
        return var2 < 8192 ? arg0.field2923 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2923) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("fm.t()Lbv;")
    public synchronized class62 method1001() {
        return this.field2887;
    }

    @ObfuscatedName("fm.s()Lbv;")
    public synchronized class62 method991() {
        return null;
    }

    @ObfuscatedName("fm.c()I")
    public synchronized int method992() {
        return 0;
    }

    @ObfuscatedName("fm.d([III)V")
    public synchronized void method986(int[] arg0, int arg1, int arg2) {
        if (this.field2881.method3186()) {
            int var4 = this.field2862 * this.field2881.field2842 / Statics.field1494;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2885;
                if (this.field2886 - var5 >= 0L) {
                    this.field2885 = var5;
                    break;
                }
                int var7 = (int) ((this.field2886 - this.field2885 + (long) var4 - 1L) / (long) var4);
                this.field2885 += (long) var4 * (long) var7;
                this.field2887.method986(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3322();
            } while (this.field2881.method3186());
        }
        this.field2887.method986(arg0, arg1, arg2);
    }

    @ObfuscatedName("fm.m(I)V")
    public synchronized void method995(int arg0) {
        if (this.field2881.method3186()) {
            int var2 = this.field2862 * this.field2881.field2842 / Statics.field1494;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2885;
                if (this.field2886 - var3 >= 0L) {
                    this.field2885 = var3;
                    break;
                }
                int var5 = (int) ((this.field2886 - this.field2885 + (long) var2 - 1L) / (long) var2);
                this.field2885 += (long) var2 * (long) var5;
                this.field2887.method995(var5);
                arg0 -= var5;
                this.method3322();
            } while (this.field2881.method3186());
        }
        this.field2887.method995(arg0);
    }

    @ObfuscatedName("fm.av(I)V")
    public void method3322() {
        int var1 = this.field2883;
        int var2 = this.field2884;
        long var3 = this.field2886;
        while (this.field2884 == var2) {
            while (this.field2881.field2845[var1] == var2) {
                this.field2881.method3198(var1);
                int var5 = this.field2881.method3206(var1);
                if (var5 == 1) {
                    this.field2881.method3192();
                    this.field2881.method3191(var1);
                    if (this.field2881.method3199()) {
                        if (!this.field2882 || var2 == 0) {
                            this.method3319();
                            this.field2881.method3187();
                            return;
                        }
                        this.field2881.method3200(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3269(var5);
                }
                this.field2881.method3193(var1);
                this.field2881.method3191(var1);
            }
            var1 = this.field2881.method3228();
            var2 = this.field2881.field2845[var1];
            var3 = this.field2881.method3188(var2);
        }
        this.field2883 = var1;
        this.field2884 = var2;
        this.field2886 = var3;
    }

    @ObfuscatedName("fm.ah(Lfq;I)Z")
    public boolean method3275(class178 arg0) {
        if (arg0.field2924 != null) {
            return false;
        }
        if (arg0.field2910 >= 0) {
            arg0.method3533();
            if (arg0.field2913 > 0 && this.field2880[arg0.field2915][arg0.field2913] == arg0) {
                this.field2880[arg0.field2915][arg0.field2913] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("fm.at(Lfq;[IIIB)Z")
    public boolean method3276(class178 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2928 = Statics.field1494 / 100;
        if (arg0.field2910 >= 0 && arg0.field2924 == null || arg0.field2924.method1153()) {
            arg0.method3362();
            arg0.method3533();
            if (arg0.field2913 > 0 && this.field2880[arg0.field2915][arg0.field2913] == arg0) {
                this.field2880[arg0.field2915][arg0.field2913] = null;
            }
            return true;
        }
        int var5 = arg0.field2919;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2871[arg0.field2915] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2919 = var6;
        }
        arg0.field2924.method1170(this.method3271(arg0));
        class176 var7 = arg0.field2912;
        boolean var8 = false;
        arg0.field2925++;
        arg0.field2926 += var7.field2901;
        double var9 = (double) ((arg0.field2914 - 60 << 8) + (arg0.field2919 * arg0.field2918 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2891 > 0) {
            if (var7.field2894 > 0) {
                arg0.field2931 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2894 * var9) + 0.5D);
            } else {
                arg0.field2931 += 128;
            }
        }
        if (var7.field2889 != null) {
            if (var7.field2900 > 0) {
                arg0.field2921 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2900 * var9) + 0.5D);
            } else {
                arg0.field2921 += 128;
            }
            while (arg0.field2922 < var7.field2889.length - 2 && arg0.field2921 > (var7.field2889[arg0.field2922 + 2] & 0xFF) << 8) {
                arg0.field2922 += 2;
            }
            if (arg0.field2922 == var7.field2889.length - 2 && var7.field2889[arg0.field2922 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2910 >= 0 && var7.field2890 != null && (this.field2873[arg0.field2915] & 0x1) == 0 && (arg0.field2913 < 0 || this.field2880[arg0.field2915][arg0.field2913] != arg0)) {
            if (var7.field2892 > 0) {
                arg0.field2910 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2892 * var9) + 0.5D);
            } else {
                arg0.field2910 += 128;
            }
            while (arg0.field2909 < var7.field2890.length - 2 && arg0.field2910 > (var7.field2890[arg0.field2909 + 2] & 0xFF) << 8) {
                arg0.field2909 += 2;
            }
            if (arg0.field2909 == var7.field2890.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2924.method1267(arg0.field2928, this.method3279(arg0), this.method3266(arg0));
            return false;
        }
        arg0.field2924.method1209(arg0.field2928);
        if (arg1 == null) {
            arg0.field2924.method995(arg3);
        } else {
            arg0.field2924.method986(arg1, arg2, arg3);
        }
        if (arg0.field2924.method1154()) {
            this.field2887.field2902.method1006(arg0.field2924);
        }
        arg0.method3362();
        if (arg0.field2910 >= 0) {
            arg0.method3533();
            if (arg0.field2913 > 0 && this.field2880[arg0.field2915][arg0.field2913] == arg0) {
                this.field2880[arg0.field2915][arg0.field2913] = null;
            }
        }
        return true;
    }
}
