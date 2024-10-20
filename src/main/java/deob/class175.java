package deob;

@ObfuscatedName("fg")
public class class175 extends class62 {

    @ObfuscatedName("fg.n")
    public class187 field2876 = new class187(128);

    @ObfuscatedName("fg.d")
    public int field2860 = 256;

    @ObfuscatedName("fg.z")
    public int field2861 = 1000000;

    @ObfuscatedName("fg.y")
    public int[] field2862 = new int[16];

    @ObfuscatedName("fg.e")
    public int[] field2866 = new int[16];

    @ObfuscatedName("fg.g")
    public int[] field2864 = new int[16];

    @ObfuscatedName("fg.f")
    public int[] field2865 = new int[16];

    @ObfuscatedName("fg.m")
    public int[] field2863 = new int[16];

    @ObfuscatedName("fg.a")
    public int[] field2859 = new int[16];

    @ObfuscatedName("fg.h")
    public int[] field2867 = new int[16];

    @ObfuscatedName("fg.l")
    public int[] field2869 = new int[16];

    @ObfuscatedName("fg.u")
    public int[] field2870 = new int[16];

    @ObfuscatedName("fg.c")
    public int[] field2872 = new int[16];

    @ObfuscatedName("fg.p")
    public int[] field2873 = new int[16];

    @ObfuscatedName("fg.o")
    public int[] field2874 = new int[16];

    @ObfuscatedName("fg.b")
    public int[] field2875 = new int[16];

    @ObfuscatedName("fg.t")
    public int[] field2886 = new int[16];

    @ObfuscatedName("fg.w")
    public int[] field2877 = new int[16];

    @ObfuscatedName("fg.i")
    public class178[][] field2885 = new class178[16][128];

    @ObfuscatedName("fg.ad")
    public class178[][] field2879 = new class178[16][128];

    @ObfuscatedName("fg.ak")
    public class173 field2884 = new class173();

    @ObfuscatedName("fg.ae")
    public boolean field2878;

    @ObfuscatedName("fg.ax")
    public int field2882;

    @ObfuscatedName("fg.al")
    public int field2871;

    @ObfuscatedName("fg.ar")
    public long field2883;

    @ObfuscatedName("fg.as")
    public long field2868;

    @ObfuscatedName("fg.ab")
    public class177 field2881 = new class177(this);

    public class175() {
        this.method3315();
    }

    @ObfuscatedName("fg.n(II)V")
    public synchronized void method3296(int arg0) {
        this.field2860 = arg0;
    }

    @ObfuscatedName("fg.d(B)I")
    public int method3299() {
        return this.field2860;
    }

    @ObfuscatedName("fg.z(Lfu;Lfs;Lbw;II)Z")
    public synchronized boolean method3298(class171 arg0, class158 arg1, class55 arg2, int arg3) {
        arg0.method3226();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class188 var7 = (class188) arg0.field2819.method3448(); var7 != null; var7 = (class188) arg0.field2819.method3449()) {
            int var8 = (int) var7.field3007;
            class172 var9 = (class172) this.field2876.method3445((long) var8);
            if (var9 == null) {
                var9 = class172.method678(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field2876.method3446(var9, (long) var8);
            }
            if (!var9.method3236(arg2, var7.field2987, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3225();
        }
        return var5;
    }

    @ObfuscatedName("fg.y(I)V")
    public synchronized void method3336() {
        for (class172 var1 = (class172) this.field2876.method3448(); var1 != null; var1 = (class172) this.field2876.method3449()) {
            var1.method3234();
        }
    }

    @ObfuscatedName("fg.e(B)V")
    public synchronized void method3300() {
        for (class172 var1 = (class172) this.field2876.method3448(); var1 != null; var1 = (class172) this.field2876.method3449()) {
            var1.method3562();
        }
    }

    @ObfuscatedName("fg.h(Lfu;ZI)V")
    public synchronized void method3301(class171 arg0, boolean arg1) {
        this.method3302();
        this.field2884.method3241(arg0.field2820);
        this.field2878 = arg1;
        this.field2883 = 0L;
        int var3 = this.field2884.method3239();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2884.method3245(var4);
            this.field2884.method3249(var4);
            this.field2884.method3271(var4);
        }
        this.field2882 = this.field2884.method3252();
        this.field2871 = this.field2884.field2842[this.field2882];
        this.field2868 = this.field2884.method3251(this.field2871);
    }

    @ObfuscatedName("fg.u(I)V")
    public synchronized void method3302() {
        this.field2884.method3242();
        this.method3315();
    }

    @ObfuscatedName("fg.q(I)Z")
    public synchronized boolean method3303() {
        return this.field2884.method3269();
    }

    @ObfuscatedName("fg.k(IIB)V")
    public synchronized void method3304(int arg0, int arg1) {
        this.method3305(arg0, arg1);
    }

    @ObfuscatedName("fg.x(III)V")
    public void method3305(int arg0, int arg1) {
        this.field2865[arg0] = arg1;
        this.field2859[arg0] = arg1 & 0xFFFFFF80;
        this.method3306(arg0, arg1);
    }

    @ObfuscatedName("fg.r(IIB)V")
    public void method3306(int arg0, int arg1) {
        if (this.field2863[arg0] != arg1) {
            this.field2863[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2879[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("fg.j(IIII)V")
    public void method3307(int arg0, int arg1, int arg2) {
        this.method3353(arg0, arg1, 64);
        if ((this.field2872[arg0] & 0x2) != 0) {
            for (class178 var4 = (class178) this.field2881.field2898.method3482(); var4 != null; var4 = (class178) this.field2881.field2898.method3484()) {
                if (var4.field2917 == arg0 && var4.field2921 < 0) {
                    this.field2885[arg0][var4.field2910] = null;
                    this.field2885[arg0][arg1] = var4;
                    int var5 = (var4.field2915 * var4.field2908 >> 12) + var4.field2905;
                    var4.field2905 += arg1 - var4.field2910 << 8;
                    var4.field2908 = var5 - var4.field2905;
                    var4.field2915 = 4096;
                    var4.field2910 = arg1;
                    return;
                }
            }
        }
        class172 var6 = (class172) this.field2876.method3445((long) this.field2863[arg0]);
        if (var6 == null) {
            return;
        }
        class58 var7 = var6.field2822[arg1];
        if (var7 == null) {
            return;
        }
        class178 var8 = new class178();
        var8.field2917 = arg0;
        var8.field2906 = var6;
        var8.field2907 = var7;
        var8.field2912 = var6.field2826[arg1];
        var8.field2913 = var6.field2827[arg1];
        var8.field2910 = arg1;
        var8.field2911 = var6.field2824 * arg2 * arg2 * var6.field2837[arg1] + 1024 >> 11;
        var8.field2914 = var6.field2835[arg1] & 0xFF;
        var8.field2905 = (arg1 << 8) - (var6.field2823[arg1] & 0x7FFF);
        var8.field2916 = 0;
        var8.field2919 = 0;
        var8.field2918 = 0;
        var8.field2921 = -1;
        var8.field2920 = 0;
        if (this.field2875[arg0] == 0) {
            var8.field2923 = class60.method1216(var7, this.method3320(var8), this.method3339(var8), this.method3322(var8));
        } else {
            var8.field2923 = class60.method1216(var7, this.method3320(var8), 0, this.method3322(var8));
            this.method3308(var8, var6.field2823[arg1] < 0);
        }
        if (var6.field2823[arg1] < 0) {
            var8.field2923.method1162(-1);
        }
        if (var8.field2913 >= 0) {
            class178 var9 = this.field2879[arg0][var8.field2913];
            if (var9 != null && var9.field2921 < 0) {
                this.field2885[arg0][var9.field2910] = null;
                var9.field2921 = 0;
            }
            this.field2879[arg0][var8.field2913] = var8;
        }
        this.field2881.field2898.method3477(var8);
        this.field2885[arg0][arg1] = var8;
    }

    @ObfuscatedName("fg.s(Lfm;ZI)V")
    public void method3308(class178 arg0, boolean arg1) {
        int var3 = arg0.field2907.field1168.length;
        int var5;
        if (arg1 && arg0.field2907.field1169) {
            int var4 = var3 + var3 - arg0.field2907.field1166;
            var5 = (int) ((long) this.field2875[arg0.field2917] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2923.method1248(true);
            }
        } else {
            var5 = (int) ((long) this.field2875[arg0.field2917] * (long) var3 >> 6);
        }
        arg0.field2923.method1254(var5);
    }

    @ObfuscatedName("fg.v(IIIB)V")
    public void method3353(int arg0, int arg1, int arg2) {
        class178 var4 = this.field2885[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2885[arg0][arg1] = null;
        if ((this.field2872[arg0] & 0x2) == 0) {
            var4.field2921 = 0;
            return;
        }
        for (class178 var5 = (class178) this.field2881.field2898.method3497(); var5 != null; var5 = (class178) this.field2881.field2898.method3475()) {
            if (var4.field2917 == var5.field2917 && var5.field2921 < 0 && var4 != var5) {
                var4.field2921 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("fg.c(IIII)V")
    public void method3331(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("fg.p(IIB)V")
    public void method3310(int arg0, int arg1) {
    }

    @ObfuscatedName("fg.o(IIS)V")
    public void method3311(int arg0, int arg1) {
        this.field2867[arg0] = arg1;
    }

    @ObfuscatedName("fg.b(IB)V")
    public void method3312(int arg0) {
        for (class178 var2 = (class178) this.field2881.field2898.method3497(); var2 != null; var2 = (class178) this.field2881.field2898.method3475()) {
            if (arg0 < 0 || var2.field2917 == arg0) {
                if (var2.field2923 != null) {
                    var2.field2923.method1173(Statics.field3058 / 100);
                    if (var2.field2923.method1214()) {
                        this.field2881.field2900.method1021(var2.field2923);
                    }
                    var2.method3401();
                }
                if (var2.field2921 < 0) {
                    this.field2885[var2.field2917][var2.field2910] = null;
                }
                var2.method3562();
            }
        }
    }

    @ObfuscatedName("fg.t(IB)V")
    public void method3313(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3313(var2);
            }
            return;
        }
        this.field2862[arg0] = 12800;
        this.field2866[arg0] = 8192;
        this.field2864[arg0] = 16383;
        this.field2867[arg0] = 8192;
        this.field2869[arg0] = 0;
        this.field2870[arg0] = 8192;
        this.method3330(arg0);
        this.method3297(arg0);
        this.field2872[arg0] = 0;
        this.field2873[arg0] = 32767;
        this.field2874[arg0] = 256;
        this.field2875[arg0] = 0;
        this.method3368(arg0, 8192);
    }

    @ObfuscatedName("fg.w(IS)V")
    public void method3314(int arg0) {
        for (class178 var2 = (class178) this.field2881.field2898.method3497(); var2 != null; var2 = (class178) this.field2881.field2898.method3475()) {
            if ((arg0 < 0 || var2.field2917 == arg0) && var2.field2921 < 0) {
                this.field2885[var2.field2917][var2.field2910] = null;
                var2.field2921 = 0;
            }
        }
    }

    @ObfuscatedName("fg.i(I)V")
    public void method3315() {
        this.method3312(-1);
        this.method3313(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2863[var1] = this.field2865[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2859[var2] = this.field2865[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("fg.an(IB)V")
    public void method3330(int arg0) {
        if ((this.field2872[arg0] & 0x2) == 0) {
            return;
        }
        for (class178 var2 = (class178) this.field2881.field2898.method3497(); var2 != null; var2 = (class178) this.field2881.field2898.method3475()) {
            if (var2.field2917 == arg0 && this.field2885[arg0][var2.field2910] == null && var2.field2921 < 0) {
                var2.field2921 = 0;
            }
        }
    }

    @ObfuscatedName("fg.aw(IB)V")
    public void method3297(int arg0) {
        if ((this.field2872[arg0] & 0x4) == 0) {
            return;
        }
        for (class178 var2 = (class178) this.field2881.field2898.method3497(); var2 != null; var2 = (class178) this.field2881.field2898.method3475()) {
            if (var2.field2917 == arg0) {
                var2.field2909 = 0;
            }
        }
    }

    @ObfuscatedName("fg.ah(II)V")
    public void method3318(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3353(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3307(var6, var7, var8);
            } else {
                this.method3353(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3331(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2859[var12] = (var14 << 14) + (this.field2859[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2859[var12] = (var14 << 7) + (this.field2859[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2869[var12] = (var14 << 7) + (this.field2869[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2869[var12] = (this.field2869[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2870[var12] = (var14 << 7) + (this.field2870[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2870[var12] = (this.field2870[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2862[var12] = (var14 << 7) + (this.field2862[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2862[var12] = (this.field2862[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2866[var12] = (var14 << 7) + (this.field2866[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2866[var12] = (this.field2866[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2864[var12] = (var14 << 7) + (this.field2864[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2864[var12] = (this.field2864[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2872[var12] |= 0x1;
                } else {
                    this.field2872[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2872[var12] |= 0x2;
                } else {
                    this.method3330(var12);
                    this.field2872[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2873[var12] = (var14 << 7) + (this.field2873[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2873[var12] = (this.field2873[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2873[var12] = (var14 << 7) + (this.field2873[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2873[var12] = (this.field2873[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3312(var12);
            }
            if (var13 == 121) {
                this.method3313(var12);
            }
            if (var13 == 123) {
                this.method3314(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2873[var12];
                if (var15 == 16384) {
                    this.field2874[var12] = (var14 << 7) + (this.field2874[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2873[var12];
                if (var16 == 16384) {
                    this.field2874[var12] = (this.field2874[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2875[var12] = (var14 << 7) + (this.field2875[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2875[var12] = (this.field2875[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2872[var12] |= 0x4;
                } else {
                    this.method3297(var12);
                    this.field2872[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3368(var12, (var14 << 7) + (this.field2886[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3368(var12, (this.field2886[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3306(var17, this.field2859[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3310(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method3311(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3315();
            }
        }
    }

    @ObfuscatedName("fg.aq(III)V")
    public void method3368(int arg0, int arg1) {
        this.field2886[arg0] = arg1;
        this.field2877[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("fg.am(Lfm;I)I")
    public int method3320(class178 arg0) {
        int var2 = (arg0.field2915 * arg0.field2908 >> 12) + arg0.field2905;
        int var3 = ((this.field2867[arg0.field2917] - 8192) * this.field2874[arg0.field2917] >> 12) + var2;
        class176 var4 = arg0.field2912;
        if (var4.field2890 > 0 && (var4.field2893 > 0 || this.field2869[arg0.field2917] > 0)) {
            int var5 = var4.field2893 << 2;
            int var6 = var4.field2895 << 1;
            if (arg0.field2925 < var6) {
                var5 = arg0.field2925 * var5 / var6;
            }
            int var7 = (this.field2869[arg0.field2917] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2922 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2907.field1167 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field3058 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("fg.aj(Lfm;I)I")
    public int method3339(class178 arg0) {
        class176 var2 = arg0.field2912;
        int var3 = this.field2862[arg0.field2917] * this.field2864[arg0.field2917] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2911 * var4 + 16384 >> 15;
        int var6 = this.field2860 * var5 + 128 >> 8;
        if (var2.field2892 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2916 * 1.953125E-5D * (double) var2.field2892) + 0.5D);
        }
        if (var2.field2889 != null) {
            int var7 = arg0.field2919;
            int var8 = var2.field2889[arg0.field2918 + 1];
            if (arg0.field2918 < var2.field2889.length - 2) {
                int var9 = (var2.field2889[arg0.field2918] & 0xFF) << 8;
                int var10 = (var2.field2889[arg0.field2918 + 2] & 0xFF) << 8;
                var8 += (var2.field2889[arg0.field2918 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2921 > 0 && var2.field2888 != null) {
            int var11 = arg0.field2921;
            int var12 = var2.field2888[arg0.field2920 + 1];
            if (arg0.field2920 < var2.field2888.length - 2) {
                int var13 = (var2.field2888[arg0.field2920] & 0xFF) << 8;
                int var14 = (var2.field2888[arg0.field2920 + 2] & 0xFF) << 8;
                var12 += (var2.field2888[arg0.field2920 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("fg.ag(Lfm;B)I")
    public int method3322(class178 arg0) {
        int var2 = this.field2866[arg0.field2917];
        return var2 < 8192 ? arg0.field2914 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2914) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("fg.g()Lbu;")
    public synchronized class62 method1020() {
        return this.field2881;
    }

    @ObfuscatedName("fg.f()Lbu;")
    public synchronized class62 method1046() {
        return null;
    }

    @ObfuscatedName("fg.m()I")
    public synchronized int method1009() {
        return 0;
    }

    @ObfuscatedName("fg.a([III)V")
    public synchronized void method1012(int[] arg0, int arg1, int arg2) {
        if (this.field2884.method3269()) {
            int var4 = this.field2861 * this.field2884.field2848 / Statics.field3058;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2883;
                if (this.field2868 - var5 >= 0L) {
                    this.field2883 = var5;
                    break;
                }
                int var7 = (int) ((this.field2868 - this.field2883 + (long) var4 - 1L) / (long) var4);
                this.field2883 += (long) var4 * (long) var7;
                this.field2881.method1012(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3324();
            } while (this.field2884.method3269());
        }
        this.field2881.method1012(arg0, arg1, arg2);
    }

    @ObfuscatedName("fg.l(I)V")
    public synchronized void method1014(int arg0) {
        if (this.field2884.method3269()) {
            int var2 = this.field2861 * this.field2884.field2848 / Statics.field3058;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2883;
                if (this.field2868 - var3 >= 0L) {
                    this.field2883 = var3;
                    break;
                }
                int var5 = (int) ((this.field2868 - this.field2883 + (long) var2 - 1L) / (long) var2);
                this.field2883 += (long) var2 * (long) var5;
                this.field2881.method1014(var5);
                arg0 -= var5;
                this.method3324();
            } while (this.field2884.method3269());
        }
        this.field2881.method1014(arg0);
    }

    @ObfuscatedName("fg.ap(I)V")
    public void method3324() {
        int var1 = this.field2882;
        int var2 = this.field2871;
        long var3 = this.field2868;
        while (this.field2871 == var2) {
            while (this.field2884.field2842[var1] == var2) {
                this.field2884.method3245(var1);
                int var5 = this.field2884.method3248(var1);
                if (var5 == 1) {
                    this.field2884.method3244();
                    this.field2884.method3271(var1);
                    if (this.field2884.method3253()) {
                        if (!this.field2878 || var2 == 0) {
                            this.method3315();
                            this.field2884.method3242();
                            return;
                        }
                        this.field2884.method3254(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3318(var5);
                }
                this.field2884.method3249(var1);
                this.field2884.method3271(var1);
            }
            var1 = this.field2884.method3252();
            var2 = this.field2884.field2842[var1];
            var3 = this.field2884.method3251(var2);
        }
        this.field2882 = var1;
        this.field2871 = var2;
        this.field2868 = var3;
    }

    @ObfuscatedName("fg.af(Lfm;B)Z")
    public boolean method3333(class178 arg0) {
        if (arg0.field2923 != null) {
            return false;
        }
        if (arg0.field2921 >= 0) {
            arg0.method3562();
            if (arg0.field2913 > 0 && this.field2879[arg0.field2917][arg0.field2913] == arg0) {
                this.field2879[arg0.field2917][arg0.field2913] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("fg.au(Lfm;[IIIB)Z")
    public boolean method3326(class178 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2924 = Statics.field3058 / 100;
        if (arg0.field2921 >= 0 && arg0.field2923 == null || arg0.field2923.method1176()) {
            arg0.method3401();
            arg0.method3562();
            if (arg0.field2913 > 0 && this.field2879[arg0.field2917][arg0.field2913] == arg0) {
                this.field2879[arg0.field2917][arg0.field2913] = null;
            }
            return true;
        }
        int var5 = arg0.field2915;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2870[arg0.field2917] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2915 = var6;
        }
        arg0.field2923.method1229(this.method3320(arg0));
        class176 var7 = arg0.field2912;
        boolean var8 = false;
        arg0.field2925++;
        arg0.field2922 += var7.field2890;
        double var9 = (double) ((arg0.field2910 - 60 << 8) + (arg0.field2915 * arg0.field2908 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2892 > 0) {
            if (var7.field2894 > 0) {
                arg0.field2916 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2894 * var9) + 0.5D);
            } else {
                arg0.field2916 += 128;
            }
        }
        if (var7.field2889 != null) {
            if (var7.field2887 > 0) {
                arg0.field2919 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2887 * var9) + 0.5D);
            } else {
                arg0.field2919 += 128;
            }
            while (arg0.field2918 < var7.field2889.length - 2 && arg0.field2919 > (var7.field2889[arg0.field2918 + 2] & 0xFF) << 8) {
                arg0.field2918 += 2;
            }
            if (arg0.field2918 == var7.field2889.length - 2 && var7.field2889[arg0.field2918 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2921 >= 0 && var7.field2888 != null && (this.field2872[arg0.field2917] & 0x1) == 0 && (arg0.field2913 < 0 || this.field2879[arg0.field2917][arg0.field2913] != arg0)) {
            if (var7.field2891 > 0) {
                arg0.field2921 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2891 * var9) + 0.5D);
            } else {
                arg0.field2921 += 128;
            }
            while (arg0.field2920 < var7.field2888.length - 2 && arg0.field2921 > (var7.field2888[arg0.field2920 + 2] & 0xFF) << 8) {
                arg0.field2920 += 2;
            }
            if (arg0.field2920 == var7.field2888.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2923.method1172(arg0.field2924, this.method3339(arg0), this.method3322(arg0));
            return false;
        }
        arg0.field2923.method1173(arg0.field2924);
        if (arg1 == null) {
            arg0.field2923.method1014(arg3);
        } else {
            arg0.field2923.method1012(arg1, arg2, arg3);
        }
        if (arg0.field2923.method1214()) {
            this.field2881.field2900.method1021(arg0.field2923);
        }
        arg0.method3401();
        if (arg0.field2921 >= 0) {
            arg0.method3562();
            if (arg0.field2913 > 0 && this.field2879[arg0.field2917][arg0.field2913] == arg0) {
                this.field2879[arg0.field2917][arg0.field2913] = null;
            }
        }
        return true;
    }
}
