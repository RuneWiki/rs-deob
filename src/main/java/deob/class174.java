package deob;

@ObfuscatedName("ff")
public class class174 extends class62 {

    @ObfuscatedName("ff.e")
    public class186 field2809 = new class186(128);

    @ObfuscatedName("ff.a")
    public int field2806 = 256;

    @ObfuscatedName("ff.l")
    public int field2832 = 1000000;

    @ObfuscatedName("ff.c")
    public int[] field2808 = new int[16];

    @ObfuscatedName("ff.u")
    public int[] field2807 = new int[16];

    @ObfuscatedName("ff.i")
    public int[] field2810 = new int[16];

    @ObfuscatedName("ff.r")
    public int[] field2823 = new int[16];

    @ObfuscatedName("ff.f")
    public int[] field2812 = new int[16];

    @ObfuscatedName("ff.g")
    public int[] field2813 = new int[16];

    @ObfuscatedName("ff.o")
    public int[] field2814 = new int[16];

    @ObfuscatedName("ff.h")
    public int[] field2815 = new int[16];

    @ObfuscatedName("ff.s")
    public int[] field2805 = new int[16];

    @ObfuscatedName("ff.d")
    public int[] field2817 = new int[16];

    @ObfuscatedName("ff.b")
    public int[] field2829 = new int[16];

    @ObfuscatedName("ff.x")
    public int[] field2819 = new int[16];

    @ObfuscatedName("ff.n")
    public int[] field2820 = new int[16];

    @ObfuscatedName("ff.v")
    public int[] field2821 = new int[16];

    @ObfuscatedName("ff.p")
    public int[] field2822 = new int[16];

    @ObfuscatedName("ff.k")
    public class177[][] field2818 = new class177[16][128];

    @ObfuscatedName("ff.ax")
    public class177[][] field2824 = new class177[16][128];

    @ObfuscatedName("ff.ap")
    public class172 field2825 = new class172();

    @ObfuscatedName("ff.ao")
    public boolean field2826;

    @ObfuscatedName("ff.ai")
    public int field2827;

    @ObfuscatedName("ff.aw")
    public int field2811;

    @ObfuscatedName("ff.am")
    public long field2828;

    @ObfuscatedName("ff.au")
    public long field2830;

    @ObfuscatedName("ff.ae")
    public class176 field2831 = new class176(this);

    public class174() {
        this.method3187();
    }

    @ObfuscatedName("ff.e(IB)V")
    public synchronized void method3169(int arg0) {
        this.field2806 = arg0;
    }

    @ObfuscatedName("ff.a(I)I")
    public int method3268() {
        return this.field2806;
    }

    @ObfuscatedName("ff.l(Lfw;Lfv;Lbm;II)Z")
    public synchronized boolean method3170(class170 arg0, class158 arg1, class55 arg2, int arg3) {
        arg0.method3080();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class187 var7 = (class187) arg0.field2772.method3341(); var7 != null; var7 = (class187) arg0.field2772.method3346()) {
            int var8 = (int) var7.field2963;
            class171 var9 = (class171) this.field2809.method3339((long) var8);
            if (var9 == null) {
                var9 = class171.method2120(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field2809.method3338(var9, (long) var8);
            }
            if (!var9.method3087(arg2, var7.field2942, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3081();
        }
        return var5;
    }

    @ObfuscatedName("ff.c(I)V")
    public synchronized void method3172() {
        for (class171 var1 = (class171) this.field2809.method3341(); var1 != null; var1 = (class171) this.field2809.method3346()) {
            var1.method3088();
        }
    }

    @ObfuscatedName("ff.u(I)V")
    public synchronized void method3267() {
        for (class171 var1 = (class171) this.field2809.method3341(); var1 != null; var1 = (class171) this.field2809.method3346()) {
            var1.method3463();
        }
    }

    @ObfuscatedName("ff.g(Lfw;ZI)V")
    public synchronized void method3173(class170 arg0, boolean arg1) {
        this.method3174();
        this.field2825.method3124(arg0.field2773);
        this.field2826 = arg1;
        this.field2828 = 0L;
        int var3 = this.field2825.method3141();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2825.method3117(var4);
            this.field2825.method3107(var4);
            this.field2825.method3105(var4);
        }
        this.field2827 = this.field2825.method3098();
        this.field2811 = this.field2825.field2784[this.field2827];
        this.field2830 = this.field2825.method3113(this.field2811);
    }

    @ObfuscatedName("ff.h(I)V")
    public synchronized void method3174() {
        this.field2825.method3101();
        this.method3187();
    }

    @ObfuscatedName("ff.s(I)Z")
    public synchronized boolean method3195() {
        return this.field2825.method3102();
    }

    @ObfuscatedName("ff.j(III)V")
    public synchronized void method3182(int arg0, int arg1) {
        this.method3256(arg0, arg1);
    }

    @ObfuscatedName("ff.m(III)V")
    public void method3256(int arg0, int arg1) {
        this.field2823[arg0] = arg1;
        this.field2813[arg0] = arg1 & 0xFFFFFF80;
        this.method3177(arg0, arg1);
    }

    @ObfuscatedName("ff.t(III)V")
    public void method3177(int arg0, int arg1) {
        if (this.field2812[arg0] != arg1) {
            this.field2812[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2824[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("ff.z(IIII)V")
    public void method3178(int arg0, int arg1, int arg2) {
        this.method3180(arg0, arg1, 64);
        if ((this.field2817[arg0] & 0x2) != 0) {
            for (class177 var4 = (class177) this.field2831.field2849.method3379(); var4 != null; var4 = (class177) this.field2831.field2849.method3395()) {
                if (var4.field2864 == arg0 && var4.field2850 < 0) {
                    this.field2818[arg0][var4.field2859] = null;
                    this.field2818[arg0][arg1] = var4;
                    int var5 = (var4.field2860 * var4.field2853 >> 12) + var4.field2858;
                    var4.field2858 += arg1 - var4.field2859 << 8;
                    var4.field2853 = var5 - var4.field2858;
                    var4.field2860 = 4096;
                    var4.field2859 = arg1;
                    return;
                }
            }
        }
        class171 var6 = (class171) this.field2809.method3339((long) this.field2812[arg0]);
        if (var6 == null) {
            return;
        }
        class58 var7 = var6.field2780[arg1];
        if (var7 == null) {
            return;
        }
        class177 var8 = new class177();
        var8.field2864 = arg0;
        var8.field2851 = var6;
        var8.field2855 = var7;
        var8.field2863 = var6.field2779[arg1];
        var8.field2854 = var6.field2775[arg1];
        var8.field2859 = arg1;
        var8.field2856 = var6.field2777 * arg2 * arg2 * var6.field2774[arg1] + 1024 >> 11;
        var8.field2857 = var6.field2778[arg1] & 0xFF;
        var8.field2858 = (arg1 << 8) - (var6.field2776[arg1] & 0x7FFF);
        var8.field2867 = 0;
        var8.field2852 = 0;
        var8.field2861 = 0;
        var8.field2850 = -1;
        var8.field2865 = 0;
        if (this.field2820[arg0] == 0) {
            var8.field2868 = class60.method1195(var7, this.method3194(var8), this.method3193(var8), this.method3277(var8));
        } else {
            var8.field2868 = class60.method1195(var7, this.method3194(var8), 0, this.method3277(var8));
            this.method3175(var8, var6.field2776[arg1] < 0);
        }
        if (var6.field2776[arg1] < 0) {
            var8.field2868.method1262(-1);
        }
        if (var8.field2854 >= 0) {
            class177 var9 = this.field2824[arg0][var8.field2854];
            if (var9 != null && var9.field2850 < 0) {
                this.field2818[arg0][var9.field2859] = null;
                var9.field2850 = 0;
            }
            this.field2824[arg0][var8.field2854] = var8;
        }
        this.field2831.field2849.method3374(var8);
        this.field2818[arg0][arg1] = var8;
    }

    @ObfuscatedName("ff.y(Lfm;ZB)V")
    public void method3175(class177 arg0, boolean arg1) {
        int var3 = arg0.field2855.field1111.length;
        int var5;
        if (arg1 && arg0.field2855.field1114) {
            int var4 = var3 + var3 - arg0.field2855.field1112;
            var5 = (int) ((long) this.field2820[arg0.field2864] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2868.method1258(true);
            }
        } else {
            var5 = (int) ((long) this.field2820[arg0.field2864] * (long) var3 >> 6);
        }
        arg0.field2868.method1165(var5);
    }

    @ObfuscatedName("ff.q(IIII)V")
    public void method3180(int arg0, int arg1, int arg2) {
        class177 var4 = this.field2818[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2818[arg0][arg1] = null;
        if ((this.field2817[arg0] & 0x2) == 0) {
            var4.field2850 = 0;
            return;
        }
        for (class177 var5 = (class177) this.field2831.field2849.method3378(); var5 != null; var5 = (class177) this.field2831.field2849.method3394()) {
            if (var4.field2864 == var5.field2864 && var5.field2850 < 0 && var4 != var5) {
                var4.field2850 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("ff.d(IIIB)V")
    public void method3181(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("ff.b(IIB)V")
    public void method3214(int arg0, int arg1) {
    }

    @ObfuscatedName("ff.x(III)V")
    public void method3183(int arg0, int arg1) {
        this.field2814[arg0] = arg1;
    }

    @ObfuscatedName("ff.n(II)V")
    public void method3184(int arg0) {
        for (class177 var2 = (class177) this.field2831.field2849.method3378(); var2 != null; var2 = (class177) this.field2831.field2849.method3394()) {
            if (arg0 < 0 || var2.field2864 == arg0) {
                if (var2.field2868 != null) {
                    var2.field2868.method1279(Statics.field1064 / 100);
                    if (var2.field2868.method1174()) {
                        this.field2831.field2844.method999(var2.field2868);
                    }
                    var2.method3290();
                }
                if (var2.field2850 < 0) {
                    this.field2818[var2.field2864][var2.field2859] = null;
                }
                var2.method3463();
            }
        }
    }

    @ObfuscatedName("ff.aw(II)V")
    public void method3168(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3168(var2);
            }
            return;
        }
        this.field2808[arg0] = 12800;
        this.field2807[arg0] = 8192;
        this.field2810[arg0] = 16383;
        this.field2814[arg0] = 8192;
        this.field2815[arg0] = 0;
        this.field2805[arg0] = 8192;
        this.method3188(arg0);
        this.method3189(arg0);
        this.field2817[arg0] = 0;
        this.field2829[arg0] = 32767;
        this.field2819[arg0] = 256;
        this.field2820[arg0] = 0;
        this.method3191(arg0, 8192);
    }

    @ObfuscatedName("ff.am(IB)V")
    public void method3186(int arg0) {
        for (class177 var2 = (class177) this.field2831.field2849.method3378(); var2 != null; var2 = (class177) this.field2831.field2849.method3394()) {
            if ((arg0 < 0 || var2.field2864 == arg0) && var2.field2850 < 0) {
                this.field2818[var2.field2864][var2.field2859] = null;
                var2.field2850 = 0;
            }
        }
    }

    @ObfuscatedName("ff.au(I)V")
    public void method3187() {
        this.method3184(-1);
        this.method3168(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2812[var1] = this.field2823[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2813[var2] = this.field2823[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("ff.ae(II)V")
    public void method3188(int arg0) {
        if ((this.field2817[arg0] & 0x2) == 0) {
            return;
        }
        for (class177 var2 = (class177) this.field2831.field2849.method3378(); var2 != null; var2 = (class177) this.field2831.field2849.method3394()) {
            if (var2.field2864 == arg0 && this.field2818[arg0][var2.field2859] == null && var2.field2850 < 0) {
                var2.field2850 = 0;
            }
        }
    }

    @ObfuscatedName("ff.ag(IB)V")
    public void method3189(int arg0) {
        if ((this.field2817[arg0] & 0x4) == 0) {
            return;
        }
        for (class177 var2 = (class177) this.field2831.field2849.method3378(); var2 != null; var2 = (class177) this.field2831.field2849.method3394()) {
            if (var2.field2864 == arg0) {
                var2.field2870 = 0;
            }
        }
    }

    @ObfuscatedName("ff.aj(IB)V")
    public void method3210(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3180(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3178(var6, var7, var8);
            } else {
                this.method3180(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3181(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2813[var12] = (var14 << 14) + (this.field2813[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2813[var12] = (var14 << 7) + (this.field2813[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2815[var12] = (var14 << 7) + (this.field2815[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2815[var12] = (this.field2815[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2805[var12] = (var14 << 7) + (this.field2805[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2805[var12] = (this.field2805[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2808[var12] = (var14 << 7) + (this.field2808[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2808[var12] = (this.field2808[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2807[var12] = (var14 << 7) + (this.field2807[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2807[var12] = (this.field2807[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2810[var12] = (var14 << 7) + (this.field2810[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2810[var12] = (this.field2810[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2817[var12] |= 0x1;
                } else {
                    this.field2817[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2817[var12] |= 0x2;
                } else {
                    this.method3188(var12);
                    this.field2817[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2829[var12] = (var14 << 7) + (this.field2829[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2829[var12] = (this.field2829[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2829[var12] = (var14 << 7) + (this.field2829[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2829[var12] = (this.field2829[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3184(var12);
            }
            if (var13 == 121) {
                this.method3168(var12);
            }
            if (var13 == 123) {
                this.method3186(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2829[var12];
                if (var15 == 16384) {
                    this.field2819[var12] = (var14 << 7) + (this.field2819[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2829[var12];
                if (var16 == 16384) {
                    this.field2819[var12] = (this.field2819[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2820[var12] = (var14 << 7) + (this.field2820[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2820[var12] = (this.field2820[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2817[var12] |= 0x4;
                } else {
                    this.method3189(var12);
                    this.field2817[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3191(var12, (var14 << 7) + (this.field2821[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3191(var12, (this.field2821[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3177(var17, this.field2813[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3214(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method3183(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3187();
            }
        }
    }

    @ObfuscatedName("ff.ah(III)V")
    public void method3191(int arg0, int arg1) {
        this.field2821[arg0] = arg1;
        this.field2822[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("ff.at(Lfm;B)I")
    public int method3194(class177 arg0) {
        int var2 = (arg0.field2860 * arg0.field2853 >> 12) + arg0.field2858;
        int var3 = ((this.field2814[arg0.field2864] - 8192) * this.field2819[arg0.field2864] >> 12) + var2;
        class175 var4 = arg0.field2863;
        if (var4.field2839 > 0 && (var4.field2836 > 0 || this.field2815[arg0.field2864] > 0)) {
            int var5 = var4.field2836 << 2;
            int var6 = var4.field2838 << 1;
            if (arg0.field2866 < var6) {
                var5 = arg0.field2866 * var5 / var6;
            }
            int var7 = (this.field2815[arg0.field2864] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2862 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2855.field1110 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1064 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("ff.al(Lfm;I)I")
    public int method3193(class177 arg0) {
        class175 var2 = arg0.field2863;
        int var3 = this.field2808[arg0.field2864] * this.field2810[arg0.field2864] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2856 * var4 + 16384 >> 15;
        int var6 = this.field2806 * var5 + 128 >> 8;
        if (var2.field2835 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2867 * 1.953125E-5D * (double) var2.field2835) + 0.5D);
        }
        if (var2.field2833 != null) {
            int var7 = arg0.field2852;
            int var8 = var2.field2833[arg0.field2861 + 1];
            if (arg0.field2861 < var2.field2833.length - 2) {
                int var9 = (var2.field2833[arg0.field2861] & 0xFF) << 8;
                int var10 = (var2.field2833[arg0.field2861 + 2] & 0xFF) << 8;
                var8 += (var2.field2833[arg0.field2861 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2850 > 0 && var2.field2834 != null) {
            int var11 = arg0.field2850;
            int var12 = var2.field2834[arg0.field2865 + 1];
            if (arg0.field2865 < var2.field2834.length - 2) {
                int var13 = (var2.field2834[arg0.field2865] & 0xFF) << 8;
                int var14 = (var2.field2834[arg0.field2865 + 2] & 0xFF) << 8;
                var12 += (var2.field2834[arg0.field2865 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("ff.ak(Lfm;I)I")
    public int method3277(class177 arg0) {
        int var2 = this.field2807[arg0.field2864];
        return var2 < 8192 ? arg0.field2857 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2857) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("ff.w()Lbu;")
    public synchronized class62 method1004() {
        return this.field2831;
    }

    @ObfuscatedName("ff.i()Lbu;")
    public synchronized class62 method1009() {
        return null;
    }

    @ObfuscatedName("ff.r()I")
    public synchronized int method1006() {
        return 0;
    }

    @ObfuscatedName("ff.f([III)V")
    public synchronized void method1007(int[] arg0, int arg1, int arg2) {
        if (this.field2825.method3102()) {
            int var4 = this.field2832 * this.field2825.field2786 / Statics.field1064;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2828;
                if (this.field2830 - var5 >= 0L) {
                    this.field2828 = var5;
                    break;
                }
                int var7 = (int) ((this.field2830 - this.field2828 + (long) var4 - 1L) / (long) var4);
                this.field2828 += (long) var4 * (long) var7;
                this.field2831.method1007(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3264();
            } while (this.field2825.method3102());
        }
        this.field2831.method1007(arg0, arg1, arg2);
    }

    @ObfuscatedName("ff.o(I)V")
    public synchronized void method1030(int arg0) {
        if (this.field2825.method3102()) {
            int var2 = this.field2832 * this.field2825.field2786 / Statics.field1064;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2828;
                if (this.field2830 - var3 >= 0L) {
                    this.field2828 = var3;
                    break;
                }
                int var5 = (int) ((this.field2830 - this.field2828 + (long) var2 - 1L) / (long) var2);
                this.field2828 += (long) var2 * (long) var5;
                this.field2831.method1030(var5);
                arg0 -= var5;
                this.method3264();
            } while (this.field2825.method3102());
        }
        this.field2831.method1030(arg0);
    }

    @ObfuscatedName("ff.ar(I)V")
    public void method3264() {
        int var1 = this.field2827;
        int var2 = this.field2811;
        long var3 = this.field2830;
        while (this.field2811 == var2) {
            while (this.field2825.field2784[var1] == var2) {
                this.field2825.method3117(var1);
                int var5 = this.field2825.method3143(var1);
                if (var5 == 1) {
                    this.field2825.method3106();
                    this.field2825.method3105(var1);
                    if (this.field2825.method3140()) {
                        if (!this.field2826 || var2 == 0) {
                            this.method3187();
                            this.field2825.method3101();
                            return;
                        }
                        this.field2825.method3133(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3210(var5);
                }
                this.field2825.method3107(var1);
                this.field2825.method3105(var1);
            }
            var1 = this.field2825.method3098();
            var2 = this.field2825.field2784[var1];
            var3 = this.field2825.method3113(var2);
        }
        this.field2827 = var1;
        this.field2811 = var2;
        this.field2830 = var3;
    }

    @ObfuscatedName("ff.aq(Lfm;B)Z")
    public boolean method3227(class177 arg0) {
        if (arg0.field2868 != null) {
            return false;
        }
        if (arg0.field2850 >= 0) {
            arg0.method3463();
            if (arg0.field2854 > 0 && this.field2824[arg0.field2864][arg0.field2854] == arg0) {
                this.field2824[arg0.field2864][arg0.field2854] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("ff.ac(Lfm;[IIIB)Z")
    public boolean method3198(class177 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2869 = Statics.field1064 / 100;
        if (arg0.field2850 >= 0 && arg0.field2868 == null || arg0.field2868.method1173()) {
            arg0.method3290();
            arg0.method3463();
            if (arg0.field2854 > 0 && this.field2824[arg0.field2864][arg0.field2854] == arg0) {
                this.field2824[arg0.field2864][arg0.field2854] = null;
            }
            return true;
        }
        int var5 = arg0.field2860;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2805[arg0.field2864] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2860 = var6;
        }
        arg0.field2868.method1171(this.method3194(arg0));
        class175 var7 = arg0.field2863;
        boolean var8 = false;
        arg0.field2866++;
        arg0.field2862 += var7.field2839;
        double var9 = (double) ((arg0.field2859 - 60 << 8) + (arg0.field2860 * arg0.field2853 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2835 > 0) {
            if (var7.field2840 > 0) {
                arg0.field2867 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2840 * var9) + 0.5D);
            } else {
                arg0.field2867 += 128;
            }
        }
        if (var7.field2833 != null) {
            if (var7.field2841 > 0) {
                arg0.field2852 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2841 * var9) + 0.5D);
            } else {
                arg0.field2852 += 128;
            }
            while (arg0.field2861 < var7.field2833.length - 2 && arg0.field2852 > (var7.field2833[arg0.field2861 + 2] & 0xFF) << 8) {
                arg0.field2861 += 2;
            }
            if (arg0.field2861 == var7.field2833.length - 2 && var7.field2833[arg0.field2861 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2850 >= 0 && var7.field2834 != null && (this.field2817[arg0.field2864] & 0x1) == 0 && (arg0.field2854 < 0 || this.field2824[arg0.field2864][arg0.field2854] != arg0)) {
            if (var7.field2837 > 0) {
                arg0.field2850 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2837 * var9) + 0.5D);
            } else {
                arg0.field2850 += 128;
            }
            while (arg0.field2865 < var7.field2834.length - 2 && arg0.field2850 > (var7.field2834[arg0.field2865 + 2] & 0xFF) << 8) {
                arg0.field2865 += 2;
            }
            if (arg0.field2865 == var7.field2834.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2868.method1169(arg0.field2869, this.method3193(arg0), this.method3277(arg0));
            return false;
        }
        arg0.field2868.method1279(arg0.field2869);
        if (arg1 == null) {
            arg0.field2868.method1030(arg3);
        } else {
            arg0.field2868.method1007(arg1, arg2, arg3);
        }
        if (arg0.field2868.method1174()) {
            this.field2831.field2844.method999(arg0.field2868);
        }
        arg0.method3290();
        if (arg0.field2850 >= 0) {
            arg0.method3463();
            if (arg0.field2854 > 0 && this.field2824[arg0.field2864][arg0.field2854] == arg0) {
                this.field2824[arg0.field2864][arg0.field2854] = null;
            }
        }
        return true;
    }
}
