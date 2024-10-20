package deob;

@ObfuscatedName("fa")
public class class178 extends class65 {

    @ObfuscatedName("fa.j")
    public class190 field2905 = new class190(128);

    @ObfuscatedName("fa.y")
    public int field2911 = 256;

    @ObfuscatedName("fa.z")
    public int field2889 = 1000000;

    @ObfuscatedName("fa.l")
    public int[] field2890 = new int[16];

    @ObfuscatedName("fa.d")
    public int[] field2908 = new int[16];

    @ObfuscatedName("fa.f")
    public int[] field2892 = new int[16];

    @ObfuscatedName("fa.i")
    public int[] field2888 = new int[16];

    @ObfuscatedName("fa.a")
    public int[] field2907 = new int[16];

    @ObfuscatedName("fa.o")
    public int[] field2895 = new int[16];

    @ObfuscatedName("fa.u")
    public int[] field2891 = new int[16];

    @ObfuscatedName("fa.m")
    public int[] field2897 = new int[16];

    @ObfuscatedName("fa.e")
    public int[] field2898 = new int[16];

    @ObfuscatedName("fa.h")
    public int[] field2899 = new int[16];

    @ObfuscatedName("fa.p")
    public int[] field2900 = new int[16];

    @ObfuscatedName("fa.c")
    public int[] field2901 = new int[16];

    @ObfuscatedName("fa.x")
    public int[] field2902 = new int[16];

    @ObfuscatedName("fa.q")
    public int[] field2887 = new int[16];

    @ObfuscatedName("fa.b")
    public int[] field2904 = new int[16];

    @ObfuscatedName("fa.k")
    public class181[][] field2903 = new class181[16][128];

    @ObfuscatedName("fa.at")
    public class181[][] field2896 = new class181[16][128];

    @ObfuscatedName("fa.au")
    public class176 field2906 = new class176();

    @ObfuscatedName("fa.aa")
    public boolean field2909;

    @ObfuscatedName("fa.ak")
    public int field2894;

    @ObfuscatedName("fa.an")
    public int field2910;

    @ObfuscatedName("fa.ad")
    public long field2893;

    @ObfuscatedName("fa.ap")
    public long field2912;

    @ObfuscatedName("fa.ag")
    public class180 field2913 = new class180(this);

    public class178() {
        this.method3317();
    }

    @ObfuscatedName("fa.j(II)V")
    public synchronized void method3311(int arg0) {
        this.field2911 = arg0;
    }

    @ObfuscatedName("fa.y(B)I")
    public int method3362() {
        return this.field2911;
    }

    @ObfuscatedName("fa.z(Lfx;Lfh;Lbf;II)Z")
    public synchronized boolean method3313(class174 arg0, class161 arg1, class58 arg2, int arg3) {
        arg0.method3230();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class191 var7 = (class191) arg0.field2852.method3462(); var7 != null; var7 = (class191) arg0.field2852.method3468()) {
            int var8 = (int) var7.field3043;
            class175 var9 = (class175) this.field2905.method3459((long) var8);
            if (var9 == null) {
                var9 = class175.method695(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field2905.method3463(var9, (long) var8);
            }
            if (!var9.method3233(arg2, var7.field3023, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3224();
        }
        return var5;
    }

    @ObfuscatedName("fa.l(I)V")
    public synchronized void method3314() {
        for (class175 var1 = (class175) this.field2905.method3462(); var1 != null; var1 = (class175) this.field2905.method3468()) {
            var1.method3234();
        }
    }

    @ObfuscatedName("fa.w(I)V")
    public synchronized void method3326() {
        for (class175 var1 = (class175) this.field2905.method3462(); var1 != null; var1 = (class175) this.field2905.method3468()) {
            var1.method3563();
        }
    }

    @ObfuscatedName("fa.o(Lfx;ZI)V")
    public synchronized void method3316(class174 arg0, boolean arg1) {
        this.method3350();
        this.field2906.method3242(arg0.field2851);
        this.field2909 = arg1;
        this.field2893 = 0L;
        int var3 = this.field2906.method3245();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2906.method3246(var4);
            this.field2906.method3249(var4);
            this.field2906.method3284(var4);
        }
        this.field2894 = this.field2906.method3271();
        this.field2910 = this.field2906.field2871[this.field2894];
        this.field2912 = this.field2906.method3264(this.field2910);
    }

    @ObfuscatedName("fa.m(I)V")
    public synchronized void method3350() {
        this.field2906.method3243();
        this.method3317();
    }

    @ObfuscatedName("fa.e(I)Z")
    public synchronized boolean method3318() {
        return this.field2906.method3256();
    }

    @ObfuscatedName("fa.v(III)V")
    public synchronized void method3319(int arg0, int arg1) {
        this.method3320(arg0, arg1);
    }

    @ObfuscatedName("fa.r(IIB)V")
    public void method3320(int arg0, int arg1) {
        this.field2888[arg0] = arg1;
        this.field2895[arg0] = arg1 & 0xFFFFFF80;
        this.method3312(arg0, arg1);
    }

    @ObfuscatedName("fa.t(III)V")
    public void method3312(int arg0, int arg1) {
        if (this.field2907[arg0] != arg1) {
            this.field2907[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2896[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("fa.g(IIIS)V")
    public void method3344(int arg0, int arg1, int arg2) {
        this.method3370(arg0, arg1, 64);
        if ((this.field2899[arg0] & 0x2) != 0) {
            for (class181 var4 = (class181) this.field2913.field2927.method3491(); var4 != null; var4 = (class181) this.field2913.field2927.method3487()) {
                if (var4.field2946 == arg0 && var4.field2937 < 0) {
                    this.field2903[arg0][var4.field2935] = null;
                    this.field2903[arg0][arg1] = var4;
                    int var5 = (var4.field2951 * var4.field2942 >> 12) + var4.field2944;
                    var4.field2944 += arg1 - var4.field2935 << 8;
                    var4.field2951 = var5 - var4.field2944;
                    var4.field2942 = 4096;
                    var4.field2935 = arg1;
                    return;
                }
            }
        }
        class175 var6 = (class175) this.field2905.method3459((long) this.field2907[arg0]);
        if (var6 == null) {
            return;
        }
        class61 var7 = var6.field2854[arg1];
        if (var7 == null) {
            return;
        }
        class181 var8 = new class181();
        var8.field2946 = arg0;
        var8.field2933 = var6;
        var8.field2934 = var7;
        var8.field2945 = var6.field2855[arg1];
        var8.field2936 = var6.field2860[arg1];
        var8.field2935 = arg1;
        var8.field2938 = var6.field2859 * arg2 * arg2 * var6.field2856[arg1] + 1024 >> 11;
        var8.field2939 = var6.field2857[arg1] & 0xFF;
        var8.field2944 = (arg1 << 8) - (var6.field2858[arg1] & 0x7FFF);
        var8.field2943 = 0;
        var8.field2941 = 0;
        var8.field2940 = 0;
        var8.field2937 = -1;
        var8.field2947 = 0;
        if (this.field2902[arg0] == 0) {
            var8.field2950 = class63.method1310(var7, this.method3336(var8), this.method3337(var8), this.method3338(var8));
        } else {
            var8.field2950 = class63.method1310(var7, this.method3336(var8), 0, this.method3338(var8));
            this.method3395(var8, var6.field2858[arg1] < 0);
        }
        if (var6.field2858[arg1] < 0) {
            var8.field2950.method1355(-1);
        }
        if (var8.field2936 >= 0) {
            class181 var9 = this.field2896[arg0][var8.field2936];
            if (var9 != null && var9.field2937 < 0) {
                this.field2903[arg0][var9.field2935] = null;
                var9.field2937 = 0;
            }
            this.field2896[arg0][var8.field2936] = var8;
        }
        this.field2913.field2927.method3485(var8);
        this.field2903[arg0][arg1] = var8;
    }

    @ObfuscatedName("fa.s(Lfn;ZI)V")
    public void method3395(class181 arg0, boolean arg1) {
        int var3 = arg0.field2934.field1199.length;
        int var5;
        if (arg1 && arg0.field2934.field1202) {
            int var4 = var3 + var3 - arg0.field2934.field1201;
            var5 = (int) ((long) this.field2902[arg0.field2946] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2950.method1319(true);
            }
        } else {
            var5 = (int) ((long) this.field2902[arg0.field2946] * (long) var3 >> 6);
        }
        arg0.field2950.method1318(var5);
    }

    @ObfuscatedName("fa.n(IIII)V")
    public void method3370(int arg0, int arg1, int arg2) {
        class181 var4 = this.field2903[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2903[arg0][arg1] = null;
        if ((this.field2899[arg0] & 0x2) == 0) {
            var4.field2937 = 0;
            return;
        }
        for (class181 var5 = (class181) this.field2913.field2927.method3490(); var5 != null; var5 = (class181) this.field2913.field2927.method3492()) {
            if (var4.field2946 == var5.field2946 && var5.field2937 < 0 && var4 != var5) {
                var4.field2937 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("fa.h(IIIB)V")
    public void method3327(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("fa.p(III)V")
    public void method3360(int arg0, int arg1) {
    }

    @ObfuscatedName("fa.ap(III)V")
    public void method3331(int arg0, int arg1) {
        this.field2891[arg0] = arg1;
    }

    @ObfuscatedName("fa.ag(II)V")
    public void method3328(int arg0) {
        for (class181 var2 = (class181) this.field2913.field2927.method3490(); var2 != null; var2 = (class181) this.field2913.field2927.method3492()) {
            if (arg0 < 0 || var2.field2946 == arg0) {
                if (var2.field2950 != null) {
                    var2.field2950.method1323(Statics.field1163 / 100);
                    if (var2.field2950.method1365()) {
                        this.field2913.field2928.method1184(var2.field2950);
                    }
                    var2.method3419();
                }
                if (var2.field2937 < 0) {
                    this.field2903[var2.field2946][var2.field2935] = null;
                }
                var2.method3563();
            }
        }
    }

    @ObfuscatedName("fa.aj(II)V")
    public void method3325(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3325(var2);
            }
            return;
        }
        this.field2890[arg0] = 12800;
        this.field2908[arg0] = 8192;
        this.field2892[arg0] = 16383;
        this.field2891[arg0] = 8192;
        this.field2897[arg0] = 0;
        this.field2898[arg0] = 8192;
        this.method3332(arg0);
        this.method3333(arg0);
        this.field2899[arg0] = 0;
        this.field2900[arg0] = 32767;
        this.field2901[arg0] = 256;
        this.field2902[arg0] = 0;
        this.method3335(arg0, 8192);
    }

    @ObfuscatedName("fa.av(II)V")
    public void method3403(int arg0) {
        for (class181 var2 = (class181) this.field2913.field2927.method3490(); var2 != null; var2 = (class181) this.field2913.field2927.method3492()) {
            if ((arg0 < 0 || var2.field2946 == arg0) && var2.field2937 < 0) {
                this.field2903[var2.field2946][var2.field2935] = null;
                var2.field2937 = 0;
            }
        }
    }

    @ObfuscatedName("fa.ae(I)V")
    public void method3317() {
        this.method3328(-1);
        this.method3325(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2907[var1] = this.field2888[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2895[var2] = this.field2888[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("fa.ax(II)V")
    public void method3332(int arg0) {
        if ((this.field2899[arg0] & 0x2) == 0) {
            return;
        }
        for (class181 var2 = (class181) this.field2913.field2927.method3490(); var2 != null; var2 = (class181) this.field2913.field2927.method3492()) {
            if (var2.field2946 == arg0 && this.field2903[arg0][var2.field2935] == null && var2.field2937 < 0) {
                var2.field2937 = 0;
            }
        }
    }

    @ObfuscatedName("fa.aw(II)V")
    public void method3333(int arg0) {
        if ((this.field2899[arg0] & 0x4) == 0) {
            return;
        }
        for (class181 var2 = (class181) this.field2913.field2927.method3490(); var2 != null; var2 = (class181) this.field2913.field2927.method3492()) {
            if (var2.field2946 == arg0) {
                var2.field2953 = 0;
            }
        }
    }

    @ObfuscatedName("fa.al(II)V")
    public void method3384(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3370(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3344(var6, var7, var8);
            } else {
                this.method3370(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3327(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2895[var12] = (var14 << 14) + (this.field2895[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2895[var12] = (var14 << 7) + (this.field2895[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2897[var12] = (var14 << 7) + (this.field2897[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2897[var12] = (this.field2897[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2898[var12] = (var14 << 7) + (this.field2898[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2898[var12] = (this.field2898[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2890[var12] = (var14 << 7) + (this.field2890[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2890[var12] = (this.field2890[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2908[var12] = (var14 << 7) + (this.field2908[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2908[var12] = (this.field2908[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2892[var12] = (var14 << 7) + (this.field2892[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2892[var12] = (this.field2892[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2899[var12] |= 0x1;
                } else {
                    this.field2899[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2899[var12] |= 0x2;
                } else {
                    this.method3332(var12);
                    this.field2899[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2900[var12] = (var14 << 7) + (this.field2900[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2900[var12] = (this.field2900[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2900[var12] = (var14 << 7) + (this.field2900[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2900[var12] = (this.field2900[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3328(var12);
            }
            if (var13 == 121) {
                this.method3325(var12);
            }
            if (var13 == 123) {
                this.method3403(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2900[var12];
                if (var15 == 16384) {
                    this.field2901[var12] = (var14 << 7) + (this.field2901[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2900[var12];
                if (var16 == 16384) {
                    this.field2901[var12] = (this.field2901[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2902[var12] = (var14 << 7) + (this.field2902[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2902[var12] = (this.field2902[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2899[var12] |= 0x4;
                } else {
                    this.method3333(var12);
                    this.field2899[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3335(var12, (var14 << 7) + (this.field2887[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3335(var12, (this.field2887[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3312(var17, this.field2895[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3360(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method3331(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3317();
            }
        }
    }

    @ObfuscatedName("fa.az(III)V")
    public void method3335(int arg0, int arg1) {
        this.field2887[arg0] = arg1;
        this.field2904[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("fa.as(Lfn;B)I")
    public int method3336(class181 arg0) {
        int var2 = (arg0.field2951 * arg0.field2942 >> 12) + arg0.field2944;
        int var3 = ((this.field2891[arg0.field2946] - 8192) * this.field2901[arg0.field2946] >> 12) + var2;
        class179 var4 = arg0.field2945;
        if (var4.field2921 > 0 && (var4.field2920 > 0 || this.field2897[arg0.field2946] > 0)) {
            int var5 = var4.field2920 << 2;
            int var6 = var4.field2919 << 1;
            if (arg0.field2948 < var6) {
                var5 = arg0.field2948 * var5 / var6;
            }
            int var7 = (this.field2897[arg0.field2946] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2949 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2934.field1203 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1163 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("fa.am(Lfn;I)I")
    public int method3337(class181 arg0) {
        class179 var2 = arg0.field2945;
        int var3 = this.field2890[arg0.field2946] * this.field2892[arg0.field2946] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2938 * var4 + 16384 >> 15;
        int var6 = this.field2911 * var5 + 128 >> 8;
        if (var2.field2916 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2943 * 1.953125E-5D * (double) var2.field2916) + 0.5D);
        }
        if (var2.field2914 != null) {
            int var7 = arg0.field2941;
            int var8 = var2.field2914[arg0.field2940 + 1];
            if (arg0.field2940 < var2.field2914.length - 2) {
                int var9 = (var2.field2914[arg0.field2940] & 0xFF) << 8;
                int var10 = (var2.field2914[arg0.field2940 + 2] & 0xFF) << 8;
                var8 += (var2.field2914[arg0.field2940 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2937 > 0 && var2.field2915 != null) {
            int var11 = arg0.field2937;
            int var12 = var2.field2915[arg0.field2947 + 1];
            if (arg0.field2947 < var2.field2915.length - 2) {
                int var13 = (var2.field2915[arg0.field2947] & 0xFF) << 8;
                int var14 = (var2.field2915[arg0.field2947 + 2] & 0xFF) << 8;
                var12 += (var2.field2915[arg0.field2947 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("fa.ay(Lfn;B)I")
    public int method3338(class181 arg0) {
        int var2 = this.field2908[arg0.field2946];
        return var2 < 8192 ? arg0.field2939 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2939) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("fa.d()Lbx;")
    public synchronized class65 method1155() {
        return this.field2913;
    }

    @ObfuscatedName("fa.f()Lbx;")
    public synchronized class65 method1156() {
        return null;
    }

    @ObfuscatedName("fa.i()I")
    public synchronized int method1157() {
        return 0;
    }

    @ObfuscatedName("fa.a([III)V")
    public synchronized void method1158(int[] arg0, int arg1, int arg2) {
        if (this.field2906.method3256()) {
            int var4 = this.field2889 * this.field2906.field2870 / Statics.field1163;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2893;
                if (this.field2912 - var5 >= 0L) {
                    this.field2893 = var5;
                    break;
                }
                int var7 = (int) ((this.field2912 - this.field2893 + (long) var4 - 1L) / (long) var4);
                this.field2893 += (long) var4 * (long) var7;
                this.field2913.method1158(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3383();
            } while (this.field2906.method3256());
        }
        this.field2913.method1158(arg0, arg1, arg2);
    }

    @ObfuscatedName("fa.u(I)V")
    public synchronized void method1160(int arg0) {
        if (this.field2906.method3256()) {
            int var2 = this.field2889 * this.field2906.field2870 / Statics.field1163;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2893;
                if (this.field2912 - var3 >= 0L) {
                    this.field2893 = var3;
                    break;
                }
                int var5 = (int) ((this.field2912 - this.field2893 + (long) var2 - 1L) / (long) var2);
                this.field2893 += (long) var2 * (long) var5;
                this.field2913.method1160(var5);
                arg0 -= var5;
                this.method3383();
            } while (this.field2906.method3256());
        }
        this.field2913.method1160(arg0);
    }

    @ObfuscatedName("fa.ao(I)V")
    public void method3383() {
        int var1 = this.field2894;
        int var2 = this.field2910;
        long var3 = this.field2912;
        while (this.field2910 == var2) {
            while (this.field2906.field2871[var1] == var2) {
                this.field2906.method3246(var1);
                int var5 = this.field2906.method3250(var1);
                if (var5 == 1) {
                    this.field2906.method3263();
                    this.field2906.method3284(var1);
                    if (this.field2906.method3254()) {
                        if (!this.field2909 || var2 == 0) {
                            this.method3317();
                            this.field2906.method3243();
                            return;
                        }
                        this.field2906.method3255(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3384(var5);
                }
                this.field2906.method3249(var1);
                this.field2906.method3284(var1);
            }
            var1 = this.field2906.method3271();
            var2 = this.field2906.field2871[var1];
            var3 = this.field2906.method3264(var2);
        }
        this.field2894 = var1;
        this.field2910 = var2;
        this.field2912 = var3;
    }

    @ObfuscatedName("fa.aq(Lfn;I)Z")
    public boolean method3343(class181 arg0) {
        if (arg0.field2950 != null) {
            return false;
        }
        if (arg0.field2937 >= 0) {
            arg0.method3563();
            if (arg0.field2936 > 0 && this.field2896[arg0.field2946][arg0.field2936] == arg0) {
                this.field2896[arg0.field2946][arg0.field2936] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("fa.af(Lfn;[IIIB)Z")
    public boolean method3399(class181 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2956 = Statics.field1163 / 100;
        if (arg0.field2937 >= 0 && arg0.field2950 == null || arg0.field2950.method1420()) {
            arg0.method3419();
            arg0.method3563();
            if (arg0.field2936 > 0 && this.field2896[arg0.field2946][arg0.field2936] == arg0) {
                this.field2896[arg0.field2946][arg0.field2936] = null;
            }
            return true;
        }
        int var5 = arg0.field2942;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2898[arg0.field2946] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2942 = var6;
        }
        arg0.field2950.method1324(this.method3336(arg0));
        class179 var7 = arg0.field2945;
        boolean var8 = false;
        arg0.field2948++;
        arg0.field2949 += var7.field2921;
        double var9 = (double) ((arg0.field2935 - 60 << 8) + (arg0.field2951 * arg0.field2942 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2916 > 0) {
            if (var7.field2925 > 0) {
                arg0.field2943 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2925 * var9) + 0.5D);
            } else {
                arg0.field2943 += 128;
            }
        }
        if (var7.field2914 != null) {
            if (var7.field2917 > 0) {
                arg0.field2941 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2917 * var9) + 0.5D);
            } else {
                arg0.field2941 += 128;
            }
            while (arg0.field2940 < var7.field2914.length - 2 && arg0.field2941 > (var7.field2914[arg0.field2940 + 2] & 0xFF) << 8) {
                arg0.field2940 += 2;
            }
            if (arg0.field2940 == var7.field2914.length - 2 && var7.field2914[arg0.field2940 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2937 >= 0 && var7.field2915 != null && (this.field2899[arg0.field2946] & 0x1) == 0 && (arg0.field2936 < 0 || this.field2896[arg0.field2946][arg0.field2936] != arg0)) {
            if (var7.field2922 > 0) {
                arg0.field2937 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2922 * var9) + 0.5D);
            } else {
                arg0.field2937 += 128;
            }
            while (arg0.field2947 < var7.field2915.length - 2 && arg0.field2937 > (var7.field2915[arg0.field2947 + 2] & 0xFF) << 8) {
                arg0.field2947 += 2;
            }
            if (arg0.field2947 == var7.field2915.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2950.method1367(arg0.field2956, this.method3337(arg0), this.method3338(arg0));
            return false;
        }
        arg0.field2950.method1323(arg0.field2956);
        if (arg1 == null) {
            arg0.field2950.method1160(arg3);
        } else {
            arg0.field2950.method1158(arg1, arg2, arg3);
        }
        if (arg0.field2950.method1365()) {
            this.field2913.field2928.method1184(arg0.field2950);
        }
        arg0.method3419();
        if (arg0.field2937 >= 0) {
            arg0.method3563();
            if (arg0.field2936 > 0 && this.field2896[arg0.field2946][arg0.field2936] == arg0) {
                this.field2896[arg0.field2946][arg0.field2936] = null;
            }
        }
        return true;
    }
}
