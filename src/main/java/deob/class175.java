package deob;

@ObfuscatedName("ft")
public class class175 extends class62 {

    @ObfuscatedName("ft.o")
    public class187 field2871 = new class187(128);

    @ObfuscatedName("ft.l")
    public int field2855 = 256;

    @ObfuscatedName("ft.g")
    public int field2851 = 1000000;

    @ObfuscatedName("ft.u")
    public int[] field2852 = new int[16];

    @ObfuscatedName("ft.q")
    public int[] field2853 = new int[16];

    @ObfuscatedName("ft.r")
    public int[] field2854 = new int[16];

    @ObfuscatedName("ft.v")
    public int[] field2850 = new int[16];

    @ObfuscatedName("ft.y")
    public int[] field2873 = new int[16];

    @ObfuscatedName("ft.k")
    public int[] field2857 = new int[16];

    @ObfuscatedName("ft.c")
    public int[] field2858 = new int[16];

    @ObfuscatedName("ft.j")
    public int[] field2859 = new int[16];

    @ObfuscatedName("ft.m")
    public int[] field2860 = new int[16];

    @ObfuscatedName("ft.w")
    public int[] field2862 = new int[16];

    @ObfuscatedName("ft.p")
    public int[] field2876 = new int[16];

    @ObfuscatedName("ft.z")
    public int[] field2864 = new int[16];

    @ObfuscatedName("ft.s")
    public int[] field2865 = new int[16];

    @ObfuscatedName("ft.d")
    public int[] field2866 = new int[16];

    @ObfuscatedName("ft.b")
    public int[] field2867 = new int[16];

    @ObfuscatedName("ft.e")
    public class178[][] field2870 = new class178[16][128];

    @ObfuscatedName("ft.ar")
    public class178[][] field2869 = new class178[16][128];

    @ObfuscatedName("ft.av")
    public class173 field2875 = new class173();

    @ObfuscatedName("ft.ae")
    public boolean field2856;

    @ObfuscatedName("ft.aq")
    public int field2872;

    @ObfuscatedName("ft.ay")
    public int field2863;

    @ObfuscatedName("ft.ac")
    public long field2874;

    @ObfuscatedName("ft.ao")
    public long field2877;

    @ObfuscatedName("ft.ab")
    public class177 field2868 = new class177(this);

    public class175() {
        this.method3326();
    }

    @ObfuscatedName("ft.o(IS)V")
    public synchronized void method3306(int arg0) {
        this.field2855 = arg0;
    }

    @ObfuscatedName("ft.l(I)I")
    public int method3273() {
        return this.field2855;
    }

    @ObfuscatedName("ft.g(Lfa;Lfg;Lbx;II)Z")
    public synchronized boolean method3360(class171 arg0, class158 arg1, class55 arg2, int arg3) {
        arg0.method3180();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class188 var7 = (class188) arg0.field2814.method3438(); var7 != null; var7 = (class188) arg0.field2814.method3439()) {
            int var8 = (int) var7.field3015;
            class172 var9 = (class172) this.field2871.method3435((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method2957(var8);
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
                this.field2871.method3436(var11, (long) var8);
            }
            if (!var9.method3189(arg2, var7.field2993, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3183();
        }
        return var5;
    }

    @ObfuscatedName("ft.u(I)V")
    public synchronized void method3275() {
        for (class172 var1 = (class172) this.field2871.method3438(); var1 != null; var1 = (class172) this.field2871.method3439()) {
            var1.method3191();
        }
    }

    @ObfuscatedName("ft.q(I)V")
    public synchronized void method3276() {
        for (class172 var1 = (class172) this.field2871.method3438(); var1 != null; var1 = (class172) this.field2871.method3439()) {
            var1.method3564();
        }
    }

    @ObfuscatedName("ft.c(Lfa;ZI)V")
    public synchronized void method3305(class171 arg0, boolean arg1) {
        this.method3277();
        this.field2875.method3202(arg0.field2815);
        this.field2856 = arg1;
        this.field2874 = 0L;
        int var3 = this.field2875.method3219();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2875.method3204(var4);
            this.field2875.method3207(var4);
            this.field2875.method3200(var4);
        }
        this.field2872 = this.field2875.method3229();
        this.field2863 = this.field2875.field2829[this.field2872];
        this.field2877 = this.field2875.method3211(this.field2863);
    }

    @ObfuscatedName("ft.m(I)V")
    public synchronized void method3277() {
        this.field2875.method3201();
        this.method3326();
    }

    @ObfuscatedName("ft.a(I)Z")
    public synchronized boolean method3278() {
        return this.field2875.method3221();
    }

    @ObfuscatedName("ft.f(IIS)V")
    public synchronized void method3279(int arg0, int arg1) {
        this.method3280(arg0, arg1);
    }

    @ObfuscatedName("ft.i(III)V")
    public void method3280(int arg0, int arg1) {
        this.field2850[arg0] = arg1;
        this.field2857[arg0] = arg1 & 0xFFFFFF80;
        this.method3281(arg0, arg1);
    }

    @ObfuscatedName("ft.n(III)V")
    public void method3281(int arg0, int arg1) {
        if (this.field2873[arg0] != arg1) {
            this.field2873[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2869[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("ft.x(IIII)V")
    public void method3339(int arg0, int arg1, int arg2) {
        this.method3284(arg0, arg1, 64);
        if ((this.field2862[arg0] & 0x2) != 0) {
            for (class178 var4 = (class178) this.field2868.field2894.method3469(); var4 != null; var4 = (class178) this.field2868.field2894.method3494()) {
                if (var4.field2916 == arg0 && var4.field2912 < 0) {
                    this.field2870[arg0][var4.field2903] = null;
                    this.field2870[arg0][arg1] = var4;
                    int var5 = (var4.field2919 * var4.field2908 >> 12) + var4.field2906;
                    var4.field2906 += arg1 - var4.field2903 << 8;
                    var4.field2919 = var5 - var4.field2906;
                    var4.field2908 = 4096;
                    var4.field2903 = arg1;
                    return;
                }
            }
        }
        class172 var6 = (class172) this.field2871.method3435((long) this.field2873[arg0]);
        if (var6 == null) {
            return;
        }
        class58 var7 = var6.field2816[arg1];
        if (var7 == null) {
            return;
        }
        class178 var8 = new class178();
        var8.field2916 = arg0;
        var8.field2899 = var6;
        var8.field2900 = var7;
        var8.field2917 = var6.field2821[arg1];
        var8.field2913 = var6.field2822[arg1];
        var8.field2903 = arg1;
        var8.field2904 = var6.field2819 * arg2 * arg2 * var6.field2823[arg1] + 1024 >> 11;
        var8.field2905 = var6.field2820[arg1] & 0xFF;
        var8.field2906 = (arg1 << 8) - (var6.field2818[arg1] & 0x7FFF);
        var8.field2909 = 0;
        var8.field2910 = 0;
        var8.field2898 = 0;
        var8.field2912 = -1;
        var8.field2911 = 0;
        if (this.field2865[arg0] == 0) {
            var8.field2915 = class60.method1185(var7, this.method3295(var8), this.method3344(var8), this.method3365(var8));
        } else {
            var8.field2915 = class60.method1185(var7, this.method3295(var8), 0, this.method3365(var8));
            this.method3283(var8, var6.field2818[arg1] < 0);
        }
        if (var6.field2818[arg1] < 0) {
            var8.field2915.method1187(-1);
        }
        if (var8.field2913 >= 0) {
            class178 var9 = this.field2869[arg0][var8.field2913];
            if (var9 != null && var9.field2912 < 0) {
                this.field2870[arg0][var9.field2903] = null;
                var9.field2912 = 0;
            }
            this.field2869[arg0][var8.field2913] = var8;
        }
        this.field2868.field2894.method3470(var8);
        this.field2870[arg0][arg1] = var8;
    }

    @ObfuscatedName("ft.h(Lfy;ZI)V")
    public void method3283(class178 arg0, boolean arg1) {
        int var3 = arg0.field2900.field1155.length;
        int var5;
        if (arg1 && arg0.field2900.field1156) {
            int var4 = var3 + var3 - arg0.field2900.field1157;
            var5 = (int) ((long) this.field2865[arg0.field2916] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2915.method1194(true);
            }
        } else {
            var5 = (int) ((long) this.field2865[arg0.field2916] * (long) var3 >> 6);
        }
        arg0.field2915.method1193(var5);
    }

    @ObfuscatedName("ft.t(IIII)V")
    public void method3284(int arg0, int arg1, int arg2) {
        class178 var4 = this.field2870[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2870[arg0][arg1] = null;
        if ((this.field2862[arg0] & 0x2) == 0) {
            var4.field2912 = 0;
            return;
        }
        for (class178 var5 = (class178) this.field2868.field2894.method3499(); var5 != null; var5 = (class178) this.field2868.field2894.method3482()) {
            if (var4.field2916 == var5.field2916 && var5.field2912 < 0 && var4 != var5) {
                var4.field2912 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("ft.w(IIIS)V")
    public void method3285(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("ft.p(III)V")
    public void method3286(int arg0, int arg1) {
    }

    @ObfuscatedName("ft.z(III)V")
    public void method3287(int arg0, int arg1) {
        this.field2858[arg0] = arg1;
    }

    @ObfuscatedName("ft.ao(II)V")
    public void method3288(int arg0) {
        for (class178 var2 = (class178) this.field2868.field2894.method3499(); var2 != null; var2 = (class178) this.field2868.field2894.method3482()) {
            if (arg0 < 0 || var2.field2916 == arg0) {
                if (var2.field2915 != null) {
                    var2.field2915.method1198(Statics.field1685 / 100);
                    if (var2.field2915.method1202()) {
                        this.field2868.field2893.method1026(var2.field2915);
                    }
                    var2.method3392();
                }
                if (var2.field2912 < 0) {
                    this.field2870[var2.field2916][var2.field2903] = null;
                }
                var2.method3564();
            }
        }
    }

    @ObfuscatedName("ft.ab(IB)V")
    public void method3271(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3271(var2);
            }
            return;
        }
        this.field2852[arg0] = 12800;
        this.field2853[arg0] = 8192;
        this.field2854[arg0] = 16383;
        this.field2858[arg0] = 8192;
        this.field2859[arg0] = 0;
        this.field2860[arg0] = 8192;
        this.method3291(arg0);
        this.method3376(arg0);
        this.field2862[arg0] = 0;
        this.field2876[arg0] = 32767;
        this.field2864[arg0] = 256;
        this.field2865[arg0] = 0;
        this.method3294(arg0, 8192);
    }

    @ObfuscatedName("ft.ad(II)V")
    public void method3290(int arg0) {
        for (class178 var2 = (class178) this.field2868.field2894.method3499(); var2 != null; var2 = (class178) this.field2868.field2894.method3482()) {
            if ((arg0 < 0 || var2.field2916 == arg0) && var2.field2912 < 0) {
                this.field2870[var2.field2916][var2.field2903] = null;
                var2.field2912 = 0;
            }
        }
    }

    @ObfuscatedName("ft.aw(I)V")
    public void method3326() {
        this.method3288(-1);
        this.method3271(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2873[var1] = this.field2850[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2857[var2] = this.field2850[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("ft.as(II)V")
    public void method3291(int arg0) {
        if ((this.field2862[arg0] & 0x2) == 0) {
            return;
        }
        for (class178 var2 = (class178) this.field2868.field2894.method3499(); var2 != null; var2 = (class178) this.field2868.field2894.method3482()) {
            if (var2.field2916 == arg0 && this.field2870[arg0][var2.field2903] == null && var2.field2912 < 0) {
                var2.field2912 = 0;
            }
        }
    }

    @ObfuscatedName("ft.ag(II)V")
    public void method3376(int arg0) {
        if ((this.field2862[arg0] & 0x4) == 0) {
            return;
        }
        for (class178 var2 = (class178) this.field2868.field2894.method3499(); var2 != null; var2 = (class178) this.field2868.field2894.method3482()) {
            if (var2.field2916 == arg0) {
                var2.field2902 = 0;
            }
        }
    }

    @ObfuscatedName("ft.an(IB)V")
    public void method3293(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3284(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3339(var6, var7, var8);
            } else {
                this.method3284(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3285(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2857[var12] = (var14 << 14) + (this.field2857[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2857[var12] = (var14 << 7) + (this.field2857[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2859[var12] = (var14 << 7) + (this.field2859[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2859[var12] = (this.field2859[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2860[var12] = (var14 << 7) + (this.field2860[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2860[var12] = (this.field2860[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2852[var12] = (var14 << 7) + (this.field2852[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2852[var12] = (this.field2852[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2853[var12] = (var14 << 7) + (this.field2853[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2853[var12] = (this.field2853[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2854[var12] = (var14 << 7) + (this.field2854[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2854[var12] = (this.field2854[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2862[var12] |= 0x1;
                } else {
                    this.field2862[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2862[var12] |= 0x2;
                } else {
                    this.method3291(var12);
                    this.field2862[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2876[var12] = (var14 << 7) + (this.field2876[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2876[var12] = (this.field2876[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2876[var12] = (var14 << 7) + (this.field2876[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2876[var12] = (this.field2876[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3288(var12);
            }
            if (var13 == 121) {
                this.method3271(var12);
            }
            if (var13 == 123) {
                this.method3290(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2876[var12];
                if (var15 == 16384) {
                    this.field2864[var12] = (var14 << 7) + (this.field2864[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2876[var12];
                if (var16 == 16384) {
                    this.field2864[var12] = (this.field2864[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2865[var12] = (var14 << 7) + (this.field2865[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2865[var12] = (this.field2865[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2862[var12] |= 0x4;
                } else {
                    this.method3376(var12);
                    this.field2862[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3294(var12, (var14 << 7) + (this.field2866[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3294(var12, (this.field2866[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3281(var17, this.field2857[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3286(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method3287(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3326();
            }
        }
    }

    @ObfuscatedName("ft.au(IIB)V")
    public void method3294(int arg0, int arg1) {
        this.field2866[arg0] = arg1;
        this.field2867[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("ft.am(Lfy;B)I")
    public int method3295(class178 arg0) {
        int var2 = (arg0.field2919 * arg0.field2908 >> 12) + arg0.field2906;
        int var3 = ((this.field2858[arg0.field2916] - 8192) * this.field2864[arg0.field2916] >> 12) + var2;
        class176 var4 = arg0.field2917;
        if (var4.field2885 > 0 && (var4.field2888 > 0 || this.field2859[arg0.field2916] > 0)) {
            int var5 = var4.field2888 << 2;
            int var6 = var4.field2886 << 1;
            if (arg0.field2914 < var6) {
                var5 = arg0.field2914 * var5 / var6;
            }
            int var7 = (this.field2859[arg0.field2916] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2901 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2900.field1158 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1685 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("ft.aj(Lfy;I)I")
    public int method3344(class178 arg0) {
        class176 var2 = arg0.field2917;
        int var3 = this.field2854[arg0.field2916] * this.field2852[arg0.field2916] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2904 * var4 + 16384 >> 15;
        int var6 = this.field2855 * var5 + 128 >> 8;
        if (var2.field2880 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2909 * 1.953125E-5D * (double) var2.field2880) + 0.5D);
        }
        if (var2.field2884 != null) {
            int var7 = arg0.field2910;
            int var8 = var2.field2884[arg0.field2898 + 1];
            if (arg0.field2898 < var2.field2884.length - 2) {
                int var9 = (var2.field2884[arg0.field2898] & 0xFF) << 8;
                int var10 = (var2.field2884[arg0.field2898 + 2] & 0xFF) << 8;
                var8 += (var2.field2884[arg0.field2898 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2912 > 0 && var2.field2879 != null) {
            int var11 = arg0.field2912;
            int var12 = var2.field2879[arg0.field2911 + 1];
            if (arg0.field2911 < var2.field2879.length - 2) {
                int var13 = (var2.field2879[arg0.field2911] & 0xFF) << 8;
                int var14 = (var2.field2879[arg0.field2911 + 2] & 0xFF) << 8;
                var12 += (var2.field2879[arg0.field2911 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("ft.ah(Lfy;I)I")
    public int method3365(class178 arg0) {
        int var2 = this.field2853[arg0.field2916];
        return var2 < 8192 ? arg0.field2905 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2905) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("ft.r()Lbo;")
    public synchronized class62 method1058() {
        return this.field2868;
    }

    @ObfuscatedName("ft.v()Lbo;")
    public synchronized class62 method1036() {
        return null;
    }

    @ObfuscatedName("ft.y()I")
    public synchronized int method1031() {
        return 0;
    }

    @ObfuscatedName("ft.k([III)V")
    public synchronized void method1037(int[] arg0, int arg1, int arg2) {
        if (this.field2875.method3221()) {
            int var4 = this.field2851 * this.field2875.field2826 / Statics.field1685;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2874;
                if (this.field2877 - var5 >= 0L) {
                    this.field2874 = var5;
                    break;
                }
                int var7 = (int) ((this.field2877 - this.field2874 + (long) var4 - 1L) / (long) var4);
                this.field2874 += (long) var4 * (long) var7;
                this.field2868.method1037(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3384();
            } while (this.field2875.method3221());
        }
        this.field2868.method1037(arg0, arg1, arg2);
    }

    @ObfuscatedName("ft.j(I)V")
    public synchronized void method1043(int arg0) {
        if (this.field2875.method3221()) {
            int var2 = this.field2851 * this.field2875.field2826 / Statics.field1685;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2874;
                if (this.field2877 - var3 >= 0L) {
                    this.field2874 = var3;
                    break;
                }
                int var5 = (int) ((this.field2877 - this.field2874 + (long) var2 - 1L) / (long) var2);
                this.field2874 += (long) var2 * (long) var5;
                this.field2868.method1043(var5);
                arg0 -= var5;
                this.method3384();
            } while (this.field2875.method3221());
        }
        this.field2868.method1043(arg0);
    }

    @ObfuscatedName("ft.ba(B)V")
    public void method3384() {
        int var1 = this.field2872;
        int var2 = this.field2863;
        long var3 = this.field2877;
        while (this.field2863 == var2) {
            while (this.field2875.field2829[var1] == var2) {
                this.field2875.method3204(var1);
                int var5 = this.field2875.method3208(var1);
                if (var5 == 1) {
                    this.field2875.method3206();
                    this.field2875.method3200(var1);
                    if (this.field2875.method3213()) {
                        if (!this.field2856 || var2 == 0) {
                            this.method3326();
                            this.field2875.method3201();
                            return;
                        }
                        this.field2875.method3214(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3293(var5);
                }
                this.field2875.method3207(var1);
                this.field2875.method3200(var1);
            }
            var1 = this.field2875.method3229();
            var2 = this.field2875.field2829[var1];
            var3 = this.field2875.method3211(var2);
        }
        this.field2872 = var1;
        this.field2863 = var2;
        this.field2877 = var3;
    }

    @ObfuscatedName("ft.bm(Lfy;S)Z")
    public boolean method3289(class178 arg0) {
        if (arg0.field2915 != null) {
            return false;
        }
        if (arg0.field2912 >= 0) {
            arg0.method3564();
            if (arg0.field2913 > 0 && this.field2869[arg0.field2916][arg0.field2913] == arg0) {
                this.field2869[arg0.field2916][arg0.field2913] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("ft.bx(Lfy;[IIII)Z")
    public boolean method3300(class178 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2907 = Statics.field1685 / 100;
        if (arg0.field2912 >= 0 && arg0.field2915 == null || arg0.field2915.method1248()) {
            arg0.method3392();
            arg0.method3564();
            if (arg0.field2913 > 0 && this.field2869[arg0.field2916][arg0.field2913] == arg0) {
                this.field2869[arg0.field2916][arg0.field2913] = null;
            }
            return true;
        }
        int var5 = arg0.field2908;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2860[arg0.field2916] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2908 = var6;
        }
        arg0.field2915.method1199(this.method3295(arg0));
        class176 var7 = arg0.field2917;
        boolean var8 = false;
        arg0.field2914++;
        arg0.field2901 += var7.field2885;
        double var9 = (double) ((arg0.field2903 - 60 << 8) + (arg0.field2919 * arg0.field2908 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2880 > 0) {
            if (var7.field2883 > 0) {
                arg0.field2909 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2883 * var9) + 0.5D);
            } else {
                arg0.field2909 += 128;
            }
        }
        if (var7.field2884 != null) {
            if (var7.field2881 > 0) {
                arg0.field2910 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2881 * var9) + 0.5D);
            } else {
                arg0.field2910 += 128;
            }
            while (arg0.field2898 < var7.field2884.length - 2 && arg0.field2910 > (var7.field2884[arg0.field2898 + 2] & 0xFF) << 8) {
                arg0.field2898 += 2;
            }
            if (arg0.field2898 == var7.field2884.length - 2 && var7.field2884[arg0.field2898 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2912 >= 0 && var7.field2879 != null && (this.field2862[arg0.field2916] & 0x1) == 0 && (arg0.field2913 < 0 || this.field2869[arg0.field2916][arg0.field2913] != arg0)) {
            if (var7.field2882 > 0) {
                arg0.field2912 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2882 * var9) + 0.5D);
            } else {
                arg0.field2912 += 128;
            }
            while (arg0.field2911 < var7.field2879.length - 2 && arg0.field2912 > (var7.field2879[arg0.field2911 + 2] & 0xFF) << 8) {
                arg0.field2911 += 2;
            }
            if (arg0.field2911 == var7.field2879.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2915.method1191(arg0.field2907, this.method3344(arg0), this.method3365(arg0));
            return false;
        }
        arg0.field2915.method1198(arg0.field2907);
        if (arg1 == null) {
            arg0.field2915.method1043(arg3);
        } else {
            arg0.field2915.method1037(arg1, arg2, arg3);
        }
        if (arg0.field2915.method1202()) {
            this.field2868.field2893.method1026(arg0.field2915);
        }
        arg0.method3392();
        if (arg0.field2912 >= 0) {
            arg0.method3564();
            if (arg0.field2913 > 0 && this.field2869[arg0.field2916][arg0.field2913] == arg0) {
                this.field2869[arg0.field2916][arg0.field2913] = null;
            }
        }
        return true;
    }
}
