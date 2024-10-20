package deob;

@ObfuscatedName("fx")
public class class175 extends class62 {

    @ObfuscatedName("fx.n")
    public class187 field2879 = new class187(128);

    @ObfuscatedName("fx.o")
    public int field2871 = 256;

    @ObfuscatedName("fx.a")
    public int field2872 = 1000000;

    @ObfuscatedName("fx.m")
    public int[] field2883 = new int[16];

    @ObfuscatedName("fx.h")
    public int[] field2870 = new int[16];

    @ObfuscatedName("fx.i")
    public int[] field2886 = new int[16];

    @ObfuscatedName("fx.r")
    public int[] field2876 = new int[16];

    @ObfuscatedName("fx.l")
    public int[] field2882 = new int[16];

    @ObfuscatedName("fx.f")
    public int[] field2878 = new int[16];

    @ObfuscatedName("fx.e")
    public int[] field2877 = new int[16];

    @ObfuscatedName("fx.z")
    public int[] field2892 = new int[16];

    @ObfuscatedName("fx.v")
    public int[] field2881 = new int[16];

    @ObfuscatedName("fx.p")
    public int[] field2887 = new int[16];

    @ObfuscatedName("fx.d")
    public int[] field2884 = new int[16];

    @ObfuscatedName("fx.j")
    public int[] field2885 = new int[16];

    @ObfuscatedName("fx.k")
    public int[] field2893 = new int[16];

    @ObfuscatedName("fx.y")
    public int[] field2875 = new int[16];

    @ObfuscatedName("fx.c")
    public int[] field2898 = new int[16];

    @ObfuscatedName("fx.g")
    public class178[][] field2889 = new class178[16][128];

    @ObfuscatedName("fx.av")
    public class178[][] field2890 = new class178[16][128];

    @ObfuscatedName("fx.ag")
    public class173 field2891 = new class173();

    @ObfuscatedName("fx.aq")
    public boolean field2873;

    @ObfuscatedName("fx.an")
    public int field2888;

    @ObfuscatedName("fx.ao")
    public int field2894;

    @ObfuscatedName("fx.aj")
    public long field2895;

    @ObfuscatedName("fx.ax")
    public long field2896;

    @ObfuscatedName("fx.ac")
    public class177 field2897 = new class177(this);

    public class175() {
        this.method3272();
    }

    @ObfuscatedName("fx.n(IB)V")
    public synchronized void method3254(int arg0) {
        this.field2871 = arg0;
    }

    @ObfuscatedName("fx.o(B)I")
    public int method3255() {
        return this.field2871;
    }

    @ObfuscatedName("fx.a(Lfh;Lfd;Lbb;II)Z")
    public synchronized boolean method3266(class171 arg0, class158 arg1, class55 arg2, int arg3) {
        arg0.method3165();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class188 var7 = (class188) arg0.field2832.method3411(); var7 != null; var7 = (class188) arg0.field2832.method3417()) {
            int var8 = (int) var7.field3018;
            class172 var9 = (class172) this.field2879.method3418((long) var8);
            if (var9 == null) {
                var9 = class172.method91(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field2879.method3410(var9, (long) var8);
            }
            if (!var9.method3176(arg2, var7.field2998, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3164();
        }
        return var5;
    }

    @ObfuscatedName("fx.w(I)V")
    public synchronized void method3306() {
        for (class172 var1 = (class172) this.field2879.method3411(); var1 != null; var1 = (class172) this.field2879.method3417()) {
            var1.method3177();
        }
    }

    @ObfuscatedName("fx.m(I)V")
    public synchronized void method3285() {
        for (class172 var1 = (class172) this.field2879.method3411(); var1 != null; var1 = (class172) this.field2879.method3417()) {
            var1.method3540();
        }
    }

    @ObfuscatedName("fx.f(Lfh;ZI)V")
    public synchronized void method3259(class171 arg0, boolean arg1) {
        this.method3260();
        this.field2891.method3184(arg0.field2833);
        this.field2873 = arg1;
        this.field2895 = 0L;
        int var3 = this.field2891.method3238();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2891.method3192(var4);
            this.field2891.method3217(var4);
            this.field2891.method3189(var4);
        }
        this.field2888 = this.field2891.method3196();
        this.field2894 = this.field2891.field2858[this.field2888];
        this.field2896 = this.field2891.method3229(this.field2894);
    }

    @ObfuscatedName("fx.z(B)V")
    public synchronized void method3260() {
        this.field2891.method3188();
        this.method3272();
    }

    @ObfuscatedName("fx.v(B)Z")
    public synchronized boolean method3261() {
        return this.field2891.method3199();
    }

    @ObfuscatedName("fx.x(IIB)V")
    public synchronized void method3267(int arg0, int arg1) {
        this.method3263(arg0, arg1);
    }

    @ObfuscatedName("fx.q(III)V")
    public void method3263(int arg0, int arg1) {
        this.field2876[arg0] = arg1;
        this.field2878[arg0] = arg1 & 0xFFFFFF80;
        this.method3264(arg0, arg1);
    }

    @ObfuscatedName("fx.b(III)V")
    public void method3264(int arg0, int arg1) {
        if (this.field2882[arg0] != arg1) {
            this.field2882[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2890[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("fx.u(IIII)V")
    public void method3265(int arg0, int arg1, int arg2) {
        this.method3316(arg0, arg1, 64);
        if ((this.field2887[arg0] & 0x2) != 0) {
            for (class178 var4 = (class178) this.field2897.field2910.method3447(); var4 != null; var4 = (class178) this.field2897.field2910.method3449()) {
                if (var4.field2934 == arg0 && var4.field2930 < 0) {
                    this.field2889[arg0][var4.field2927] = null;
                    this.field2889[arg0][arg1] = var4;
                    int var5 = (var4.field2926 * var4.field2925 >> 12) + var4.field2916;
                    var4.field2916 += arg1 - var4.field2927 << 8;
                    var4.field2925 = var5 - var4.field2916;
                    var4.field2926 = 4096;
                    var4.field2927 = arg1;
                    return;
                }
            }
        }
        class172 var6 = (class172) this.field2879.method3418((long) this.field2882[arg0]);
        if (var6 == null) {
            return;
        }
        class58 var7 = var6.field2835[arg1];
        if (var7 == null) {
            return;
        }
        class178 var8 = new class178();
        var8.field2934 = arg0;
        var8.field2921 = var6;
        var8.field2918 = var7;
        var8.field2919 = var6.field2839[arg1];
        var8.field2920 = var6.field2834[arg1];
        var8.field2927 = arg1;
        var8.field2922 = var6.field2842 * arg2 * arg2 * var6.field2837[arg1] + 1024 >> 11;
        var8.field2923 = var6.field2838[arg1] & 0xFF;
        var8.field2916 = (arg1 << 8) - (var6.field2836[arg1] & 0x7FFF);
        var8.field2924 = 0;
        var8.field2928 = 0;
        var8.field2929 = 0;
        var8.field2930 = -1;
        var8.field2933 = 0;
        if (this.field2893[arg0] == 0) {
            var8.field2938 = class60.method1189(var7, this.method3277(var8), this.method3256(var8), this.method3343(var8));
        } else {
            var8.field2938 = class60.method1189(var7, this.method3277(var8), 0, this.method3343(var8));
            this.method3253(var8, var6.field2836[arg1] < 0);
        }
        if (var6.field2836[arg1] < 0) {
            var8.field2938.method1191(-1);
        }
        if (var8.field2920 >= 0) {
            class178 var9 = this.field2890[arg0][var8.field2920];
            if (var9 != null && var9.field2930 < 0) {
                this.field2889[arg0][var9.field2927] = null;
                var9.field2930 = 0;
            }
            this.field2890[arg0][var8.field2920] = var8;
        }
        this.field2897.field2910.method3441(var8);
        this.field2889[arg0][arg1] = var8;
    }

    @ObfuscatedName("fx.t(Lfj;ZB)V")
    public void method3253(class178 arg0, boolean arg1) {
        int var3 = arg0.field2918.field1181.length;
        int var5;
        if (arg1 && arg0.field2918.field1180) {
            int var4 = var3 + var3 - arg0.field2918.field1182;
            var5 = (int) ((long) this.field2893[arg0.field2934] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2938.method1265(true);
            }
        } else {
            var5 = (int) ((long) this.field2893[arg0.field2934] * (long) var3 >> 6);
        }
        arg0.field2938.method1197(var5);
    }

    @ObfuscatedName("fx.s(IIII)V")
    public void method3316(int arg0, int arg1, int arg2) {
        class178 var4 = this.field2889[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2889[arg0][arg1] = null;
        if ((this.field2887[arg0] & 0x2) == 0) {
            var4.field2930 = 0;
            return;
        }
        for (class178 var5 = (class178) this.field2897.field2910.method3451(); var5 != null; var5 = (class178) this.field2897.field2910.method3448()) {
            if (var4.field2934 == var5.field2934 && var5.field2930 < 0 && var4 != var5) {
                var4.field2930 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("fx.p(IIIB)V")
    public void method3304(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("fx.d(III)V")
    public void method3269(int arg0, int arg1) {
    }

    @ObfuscatedName("fx.j(IIB)V")
    public void method3321(int arg0, int arg1) {
        this.field2877[arg0] = arg1;
    }

    @ObfuscatedName("fx.k(II)V")
    public void method3270(int arg0) {
        for (class178 var2 = (class178) this.field2897.field2910.method3451(); var2 != null; var2 = (class178) this.field2897.field2910.method3448()) {
            if (arg0 < 0 || var2.field2934 == arg0) {
                if (var2.field2938 != null) {
                    var2.field2938.method1261(Statics.field1141 / 100);
                    if (var2.field2938.method1206()) {
                        this.field2897.field2911.method1031(var2.field2938);
                    }
                    var2.method3361();
                }
                if (var2.field2930 < 0) {
                    this.field2889[var2.field2934][var2.field2927] = null;
                }
                var2.method3540();
            }
        }
    }

    @ObfuscatedName("fx.y(II)V")
    public void method3318(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3318(var2);
            }
            return;
        }
        this.field2883[arg0] = 12800;
        this.field2870[arg0] = 8192;
        this.field2886[arg0] = 16383;
        this.field2877[arg0] = 8192;
        this.field2892[arg0] = 0;
        this.field2881[arg0] = 8192;
        this.method3338(arg0);
        this.method3274(arg0);
        this.field2887[arg0] = 0;
        this.field2884[arg0] = 32767;
        this.field2885[arg0] = 256;
        this.field2893[arg0] = 0;
        this.method3276(arg0, 8192);
    }

    @ObfuscatedName("fx.c(II)V")
    public void method3297(int arg0) {
        for (class178 var2 = (class178) this.field2897.field2910.method3451(); var2 != null; var2 = (class178) this.field2897.field2910.method3448()) {
            if ((arg0 < 0 || var2.field2934 == arg0) && var2.field2930 < 0) {
                this.field2889[var2.field2934][var2.field2927] = null;
                var2.field2930 = 0;
            }
        }
    }

    @ObfuscatedName("fx.au(I)V")
    public void method3272() {
        this.method3270(-1);
        this.method3318(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2882[var1] = this.field2876[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2878[var2] = this.field2876[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("fx.ap(II)V")
    public void method3338(int arg0) {
        if ((this.field2887[arg0] & 0x2) == 0) {
            return;
        }
        for (class178 var2 = (class178) this.field2897.field2910.method3451(); var2 != null; var2 = (class178) this.field2897.field2910.method3448()) {
            if (var2.field2934 == arg0 && this.field2889[arg0][var2.field2927] == null && var2.field2930 < 0) {
                var2.field2930 = 0;
            }
        }
    }

    @ObfuscatedName("fx.ar(II)V")
    public void method3274(int arg0) {
        if ((this.field2887[arg0] & 0x4) == 0) {
            return;
        }
        for (class178 var2 = (class178) this.field2897.field2910.method3451(); var2 != null; var2 = (class178) this.field2897.field2910.method3448()) {
            if (var2.field2934 == arg0) {
                var2.field2937 = 0;
            }
        }
    }

    @ObfuscatedName("fx.ah(IB)V")
    public void method3275(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3316(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3265(var6, var7, var8);
            } else {
                this.method3316(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3304(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2878[var12] = (var14 << 14) + (this.field2878[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2878[var12] = (var14 << 7) + (this.field2878[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2892[var12] = (var14 << 7) + (this.field2892[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2892[var12] = (this.field2892[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2881[var12] = (var14 << 7) + (this.field2881[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2881[var12] = (this.field2881[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2883[var12] = (var14 << 7) + (this.field2883[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2883[var12] = (this.field2883[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2870[var12] = (var14 << 7) + (this.field2870[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2870[var12] = (this.field2870[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2886[var12] = (var14 << 7) + (this.field2886[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2886[var12] = (this.field2886[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2887[var12] |= 0x1;
                } else {
                    this.field2887[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2887[var12] |= 0x2;
                } else {
                    this.method3338(var12);
                    this.field2887[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2884[var12] = (var14 << 7) + (this.field2884[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2884[var12] = (this.field2884[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2884[var12] = (var14 << 7) + (this.field2884[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2884[var12] = (this.field2884[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3270(var12);
            }
            if (var13 == 121) {
                this.method3318(var12);
            }
            if (var13 == 123) {
                this.method3297(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2884[var12];
                if (var15 == 16384) {
                    this.field2885[var12] = (var14 << 7) + (this.field2885[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2884[var12];
                if (var16 == 16384) {
                    this.field2885[var12] = (this.field2885[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2893[var12] = (var14 << 7) + (this.field2893[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2893[var12] = (this.field2893[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2887[var12] |= 0x4;
                } else {
                    this.method3274(var12);
                    this.field2887[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3276(var12, (var14 << 7) + (this.field2875[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3276(var12, (this.field2875[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3264(var17, this.field2878[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3269(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method3321(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3272();
            }
        }
    }

    @ObfuscatedName("fx.at(III)V")
    public void method3276(int arg0, int arg1) {
        this.field2875[arg0] = arg1;
        this.field2898[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("fx.as(Lfj;I)I")
    public int method3277(class178 arg0) {
        int var2 = (arg0.field2926 * arg0.field2925 >> 12) + arg0.field2916;
        int var3 = ((this.field2877[arg0.field2934] - 8192) * this.field2885[arg0.field2934] >> 12) + var2;
        class176 var4 = arg0.field2919;
        if (var4.field2907 > 0 && (var4.field2903 > 0 || this.field2892[arg0.field2934] > 0)) {
            int var5 = var4.field2903 << 2;
            int var6 = var4.field2908 << 1;
            if (arg0.field2932 < var6) {
                var5 = arg0.field2932 * var5 / var6;
            }
            int var7 = (this.field2892[arg0.field2934] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2935 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2918.field1184 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1141 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("fx.af(Lfj;I)I")
    public int method3256(class178 arg0) {
        class176 var2 = arg0.field2919;
        int var3 = this.field2886[arg0.field2934] * this.field2883[arg0.field2934] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2922 * var4 + 16384 >> 15;
        int var6 = this.field2871 * var5 + 128 >> 8;
        if (var2.field2900 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2924 * 1.953125E-5D * (double) var2.field2900) + 0.5D);
        }
        if (var2.field2906 != null) {
            int var7 = arg0.field2928;
            int var8 = var2.field2906[arg0.field2929 + 1];
            if (arg0.field2929 < var2.field2906.length - 2) {
                int var9 = (var2.field2906[arg0.field2929] & 0xFF) << 8;
                int var10 = (var2.field2906[arg0.field2929 + 2] & 0xFF) << 8;
                var8 += (var2.field2906[arg0.field2929 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2930 > 0 && var2.field2905 != null) {
            int var11 = arg0.field2930;
            int var12 = var2.field2905[arg0.field2933 + 1];
            if (arg0.field2933 < var2.field2905.length - 2) {
                int var13 = (var2.field2905[arg0.field2933] & 0xFF) << 8;
                int var14 = (var2.field2905[arg0.field2933 + 2] & 0xFF) << 8;
                var12 += (var2.field2905[arg0.field2933 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("fx.aa(Lfj;I)I")
    public int method3343(class178 arg0) {
        int var2 = this.field2870[arg0.field2934];
        return var2 < 8192 ? arg0.field2923 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2923) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("fx.h()Lby;")
    public synchronized class62 method1045() {
        return this.field2897;
    }

    @ObfuscatedName("fx.i()Lby;")
    public synchronized class62 method1037() {
        return null;
    }

    @ObfuscatedName("fx.r()I")
    public synchronized int method1048() {
        return 0;
    }

    @ObfuscatedName("fx.l([III)V")
    public synchronized void method1030(int[] arg0, int arg1, int arg2) {
        if (this.field2891.method3199()) {
            int var4 = this.field2872 * this.field2891.field2846 / Statics.field1141;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2895;
                if (this.field2896 - var5 >= 0L) {
                    this.field2895 = var5;
                    break;
                }
                int var7 = (int) ((this.field2896 - this.field2895 + (long) var4 - 1L) / (long) var4);
                this.field2895 += (long) var4 * (long) var7;
                this.field2897.method1030(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3280();
            } while (this.field2891.method3199());
        }
        this.field2897.method1030(arg0, arg1, arg2);
    }

    @ObfuscatedName("fx.e(I)V")
    public synchronized void method1041(int arg0) {
        if (this.field2891.method3199()) {
            int var2 = this.field2872 * this.field2891.field2846 / Statics.field1141;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2895;
                if (this.field2896 - var3 >= 0L) {
                    this.field2895 = var3;
                    break;
                }
                int var5 = (int) ((this.field2896 - this.field2895 + (long) var2 - 1L) / (long) var2);
                this.field2895 += (long) var2 * (long) var5;
                this.field2897.method1041(var5);
                arg0 -= var5;
                this.method3280();
            } while (this.field2891.method3199());
        }
        this.field2897.method1041(arg0);
    }

    @ObfuscatedName("fx.ad(B)V")
    public void method3280() {
        int var1 = this.field2888;
        int var2 = this.field2894;
        long var3 = this.field2896;
        while (this.field2894 == var2) {
            while (this.field2891.field2858[var1] == var2) {
                this.field2891.method3192(var1);
                int var5 = this.field2891.method3191(var1);
                if (var5 == 1) {
                    this.field2891.method3190();
                    this.field2891.method3189(var1);
                    if (this.field2891.method3185()) {
                        if (!this.field2873 || var2 == 0) {
                            this.method3272();
                            this.field2891.method3188();
                            return;
                        }
                        this.field2891.method3197(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3275(var5);
                }
                this.field2891.method3217(var1);
                this.field2891.method3189(var1);
            }
            var1 = this.field2891.method3196();
            var2 = this.field2891.field2858[var1];
            var3 = this.field2891.method3229(var2);
        }
        this.field2888 = var1;
        this.field2894 = var2;
        this.field2896 = var3;
    }

    @ObfuscatedName("fx.ai(Lfj;B)Z")
    public boolean method3281(class178 arg0) {
        if (arg0.field2938 != null) {
            return false;
        }
        if (arg0.field2930 >= 0) {
            arg0.method3540();
            if (arg0.field2920 > 0 && this.field2890[arg0.field2934][arg0.field2920] == arg0) {
                this.field2890[arg0.field2934][arg0.field2920] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("fx.aw(Lfj;[IIII)Z")
    public boolean method3295(class178 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2917 = Statics.field1141 / 100;
        if (arg0.field2930 >= 0 && arg0.field2938 == null || arg0.field2938.method1205()) {
            arg0.method3361();
            arg0.method3540();
            if (arg0.field2920 > 0 && this.field2890[arg0.field2934][arg0.field2920] == arg0) {
                this.field2890[arg0.field2934][arg0.field2920] = null;
            }
            return true;
        }
        int var5 = arg0.field2926;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2881[arg0.field2934] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2926 = var6;
        }
        arg0.field2938.method1207(this.method3277(arg0));
        class176 var7 = arg0.field2919;
        boolean var8 = false;
        arg0.field2932++;
        arg0.field2935 += var7.field2907;
        double var9 = (double) ((arg0.field2927 - 60 << 8) + (arg0.field2926 * arg0.field2925 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2900 > 0) {
            if (var7.field2902 > 0) {
                arg0.field2924 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2902 * var9) + 0.5D);
            } else {
                arg0.field2924 += 128;
            }
        }
        if (var7.field2906 != null) {
            if (var7.field2901 > 0) {
                arg0.field2928 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2901 * var9) + 0.5D);
            } else {
                arg0.field2928 += 128;
            }
            while (arg0.field2929 < var7.field2906.length - 2 && arg0.field2928 > (var7.field2906[arg0.field2929 + 2] & 0xFF) << 8) {
                arg0.field2929 += 2;
            }
            if (arg0.field2929 == var7.field2906.length - 2 && var7.field2906[arg0.field2929 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2930 >= 0 && var7.field2905 != null && (this.field2887[arg0.field2934] & 0x1) == 0 && (arg0.field2920 < 0 || this.field2890[arg0.field2934][arg0.field2920] != arg0)) {
            if (var7.field2904 > 0) {
                arg0.field2930 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2904 * var9) + 0.5D);
            } else {
                arg0.field2930 += 128;
            }
            while (arg0.field2933 < var7.field2905.length - 2 && arg0.field2930 > (var7.field2905[arg0.field2933 + 2] & 0xFF) << 8) {
                arg0.field2933 += 2;
            }
            if (arg0.field2933 == var7.field2905.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2938.method1201(arg0.field2917, this.method3256(arg0), this.method3343(arg0));
            return false;
        }
        arg0.field2938.method1261(arg0.field2917);
        if (arg1 == null) {
            arg0.field2938.method1041(arg3);
        } else {
            arg0.field2938.method1030(arg1, arg2, arg3);
        }
        if (arg0.field2938.method1206()) {
            this.field2897.field2911.method1031(arg0.field2938);
        }
        arg0.method3361();
        if (arg0.field2930 >= 0) {
            arg0.method3540();
            if (arg0.field2920 > 0 && this.field2890[arg0.field2934][arg0.field2920] == arg0) {
                this.field2890[arg0.field2934][arg0.field2920] = null;
            }
        }
        return true;
    }
}
