package deob;

@ObfuscatedName("fm")
public class class175 extends class62 {

    @ObfuscatedName("fm.n")
    public class187 field2871 = new class187(128);

    @ObfuscatedName("fm.g")
    public int field2858 = 256;

    @ObfuscatedName("fm.a")
    public int field2878 = 1000000;

    @ObfuscatedName("fm.m")
    public int[] field2864 = new int[16];

    @ObfuscatedName("fm.s")
    public int[] field2860 = new int[16];

    @ObfuscatedName("fm.j")
    public int[] field2862 = new int[16];

    @ObfuscatedName("fm.f")
    public int[] field2863 = new int[16];

    @ObfuscatedName("fm.b")
    public int[] field2885 = new int[16];

    @ObfuscatedName("fm.t")
    public int[] field2865 = new int[16];

    @ObfuscatedName("fm.i")
    public int[] field2866 = new int[16];

    @ObfuscatedName("fm.c")
    public int[] field2867 = new int[16];

    @ObfuscatedName("fm.k")
    public int[] field2857 = new int[16];

    @ObfuscatedName("fm.p")
    public int[] field2869 = new int[16];

    @ObfuscatedName("fm.y")
    public int[] field2870 = new int[16];

    @ObfuscatedName("fm.z")
    public int[] field2882 = new int[16];

    @ObfuscatedName("fm.u")
    public int[] field2872 = new int[16];

    @ObfuscatedName("fm.w")
    public int[] field2861 = new int[16];

    @ObfuscatedName("fm.d")
    public int[] field2877 = new int[16];

    @ObfuscatedName("fm.l")
    public class178[][] field2884 = new class178[16][128];

    @ObfuscatedName("fm.aj")
    public class178[][] field2876 = new class178[16][128];

    @ObfuscatedName("fm.aq")
    public class173 field2859 = new class173();

    @ObfuscatedName("fm.al")
    public boolean field2873;

    @ObfuscatedName("fm.az")
    public int field2879;

    @ObfuscatedName("fm.ah")
    public int field2880;

    @ObfuscatedName("fm.ag")
    public long field2881;

    @ObfuscatedName("fm.ad")
    public long field2868;

    @ObfuscatedName("fm.ao")
    public class177 field2883 = new class177(this);

    public class175() {
        this.method3322();
    }

    @ObfuscatedName("fm.n(IB)V")
    public synchronized void method3246(int arg0) {
        this.field2858 = arg0;
    }

    @ObfuscatedName("fm.g(I)I")
    public int method3352() {
        return this.field2858;
    }

    @ObfuscatedName("fm.a(Lfk;Lfi;Lbl;II)Z")
    public synchronized boolean method3279(class171 arg0, class158 arg1, class55 arg2, int arg3) {
        arg0.method3159();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class188 var7 = (class188) arg0.field2816.method3428(); var7 != null; var7 = (class188) arg0.field2816.method3432()) {
            int var8 = (int) var7.field3018;
            class172 var9 = (class172) this.field2871.method3425((long) var8);
            if (var9 == null) {
                var9 = class172.method99(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field2871.method3426(var9, (long) var8);
            }
            if (!var9.method3164(arg2, var7.field2997, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3154();
        }
        return var5;
    }

    @ObfuscatedName("fm.m(I)V")
    public synchronized void method3268() {
        for (class172 var1 = (class172) this.field2871.method3428(); var1 != null; var1 = (class172) this.field2871.method3432()) {
            var1.method3165();
        }
    }

    @ObfuscatedName("fm.s(I)V")
    public synchronized void method3250() {
        for (class172 var1 = (class172) this.field2871.method3428(); var1 != null; var1 = (class172) this.field2871.method3432()) {
            var1.method3554();
        }
    }

    @ObfuscatedName("fm.i(Lfk;ZI)V")
    public synchronized void method3251(class171 arg0, boolean arg1) {
        this.method3252();
        this.field2859.method3172(arg0.field2815);
        this.field2873 = arg1;
        this.field2881 = 0L;
        int var3 = this.field2859.method3200();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2859.method3176(var4);
            this.field2859.method3204(var4);
            this.field2859.method3177(var4);
        }
        this.field2879 = this.field2859.method3184();
        this.field2880 = this.field2859.field2840[this.field2879];
        this.field2868 = this.field2859.method3183(this.field2880);
    }

    @ObfuscatedName("fm.k(I)V")
    public synchronized void method3252() {
        this.field2859.method3213();
        this.method3322();
    }

    @ObfuscatedName("fm.x(I)Z")
    public synchronized boolean method3253() {
        return this.field2859.method3181();
    }

    @ObfuscatedName("fm.e(III)V")
    public synchronized void method3308(int arg0, int arg1) {
        this.method3287(arg0, arg1);
    }

    @ObfuscatedName("fm.q(III)V")
    public void method3287(int arg0, int arg1) {
        this.field2863[arg0] = arg1;
        this.field2865[arg0] = arg1 & 0xFFFFFF80;
        this.method3256(arg0, arg1);
    }

    @ObfuscatedName("fm.o(III)V")
    public void method3256(int arg0, int arg1) {
        if (this.field2885[arg0] != arg1) {
            this.field2885[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2876[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("fm.r(IIIB)V")
    public void method3257(int arg0, int arg1, int arg2) {
        this.method3259(arg0, arg1, 64);
        if ((this.field2869[arg0] & 0x2) != 0) {
            for (class178 var4 = (class178) this.field2883.field2898.method3469(); var4 != null; var4 = (class178) this.field2883.field2898.method3471()) {
                if (var4.field2908 == arg0 && var4.field2917 < 0) {
                    this.field2884[arg0][var4.field2918] = null;
                    this.field2884[arg0][arg1] = var4;
                    int var5 = (var4.field2923 * var4.field2912 >> 12) + var4.field2922;
                    var4.field2922 += arg1 - var4.field2918 << 8;
                    var4.field2912 = var5 - var4.field2922;
                    var4.field2923 = 4096;
                    var4.field2918 = arg1;
                    return;
                }
            }
        }
        class172 var6 = (class172) this.field2871.method3425((long) this.field2885[arg0]);
        if (var6 == null) {
            return;
        }
        class58 var7 = var6.field2824[arg1];
        if (var7 == null) {
            return;
        }
        class178 var8 = new class178();
        var8.field2908 = arg0;
        var8.field2904 = var6;
        var8.field2905 = var7;
        var8.field2906 = var6.field2822[arg1];
        var8.field2907 = var6.field2828[arg1];
        var8.field2918 = arg1;
        var8.field2909 = var6.field2817 * arg2 * arg2 * var6.field2820[arg1] + 1024 >> 11;
        var8.field2910 = var6.field2821[arg1] & 0xFF;
        var8.field2922 = (arg1 << 8) - (var6.field2819[arg1] & 0x7FFF);
        var8.field2911 = 0;
        var8.field2915 = 0;
        var8.field2916 = 0;
        var8.field2917 = -1;
        var8.field2920 = 0;
        if (this.field2872[arg0] == 0) {
            var8.field2921 = class60.method1168(var7, this.method3324(var8), this.method3272(var8), this.method3273(var8));
        } else {
            var8.field2921 = class60.method1168(var7, this.method3324(var8), 0, this.method3273(var8));
            this.method3258(var8, var6.field2819[arg1] < 0);
        }
        if (var6.field2819[arg1] < 0) {
            var8.field2921.method1170(-1);
        }
        if (var8.field2907 >= 0) {
            class178 var9 = this.field2876[arg0][var8.field2907];
            if (var9 != null && var9.field2917 < 0) {
                this.field2884[arg0][var9.field2918] = null;
                var9.field2917 = 0;
            }
            this.field2876[arg0][var8.field2907] = var8;
        }
        this.field2883.field2898.method3463(var8);
        this.field2884[arg0][arg1] = var8;
    }

    @ObfuscatedName("fm.v(Lfa;ZB)V")
    public void method3258(class178 arg0, boolean arg1) {
        int var3 = arg0.field2905.field1186.length;
        int var5;
        if (arg1 && arg0.field2905.field1187) {
            int var4 = var3 + var3 - arg0.field2905.field1188;
            var5 = (int) ((long) this.field2872[arg0.field2908] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2921.method1282(true);
            }
        } else {
            var5 = (int) ((long) this.field2872[arg0.field2908] * (long) var3 >> 6);
        }
        arg0.field2921.method1176(var5);
    }

    @ObfuscatedName("fm.h(IIII)V")
    public void method3259(int arg0, int arg1, int arg2) {
        class178 var4 = this.field2884[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2884[arg0][arg1] = null;
        if ((this.field2869[arg0] & 0x2) == 0) {
            var4.field2917 = 0;
            return;
        }
        for (class178 var5 = (class178) this.field2883.field2898.method3468(); var5 != null; var5 = (class178) this.field2883.field2898.method3470()) {
            if (var4.field2908 == var5.field2908 && var5.field2917 < 0 && var4 != var5) {
                var4.field2917 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("fm.p(IIII)V")
    public void method3248(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("fm.y(IIB)V")
    public void method3261(int arg0, int arg1) {
    }

    @ObfuscatedName("fm.z(III)V")
    public void method3247(int arg0, int arg1) {
        this.field2866[arg0] = arg1;
    }

    @ObfuscatedName("fm.u(II)V")
    public void method3263(int arg0) {
        for (class178 var2 = (class178) this.field2883.field2898.method3468(); var2 != null; var2 = (class178) this.field2883.field2898.method3470()) {
            if (arg0 < 0 || var2.field2908 == arg0) {
                if (var2.field2921 != null) {
                    var2.field2921.method1223(Statics.field1142 / 100);
                    if (var2.field2921.method1185()) {
                        this.field2883.field2899.method993(var2.field2921);
                    }
                    var2.method3374();
                }
                if (var2.field2917 < 0) {
                    this.field2884[var2.field2908][var2.field2918] = null;
                }
                var2.method3554();
            }
        }
    }

    @ObfuscatedName("fm.w(II)V")
    public void method3264(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3264(var2);
            }
            return;
        }
        this.field2864[arg0] = 12800;
        this.field2860[arg0] = 8192;
        this.field2862[arg0] = 16383;
        this.field2866[arg0] = 8192;
        this.field2867[arg0] = 0;
        this.field2857[arg0] = 8192;
        this.method3271(arg0);
        this.method3318(arg0);
        this.field2869[arg0] = 0;
        this.field2870[arg0] = 32767;
        this.field2882[arg0] = 256;
        this.field2872[arg0] = 0;
        this.method3270(arg0, 8192);
    }

    @ObfuscatedName("fm.d(II)V")
    public void method3265(int arg0) {
        for (class178 var2 = (class178) this.field2883.field2898.method3468(); var2 != null; var2 = (class178) this.field2883.field2898.method3470()) {
            if ((arg0 < 0 || var2.field2908 == arg0) && var2.field2917 < 0) {
                this.field2884[var2.field2908][var2.field2918] = null;
                var2.field2917 = 0;
            }
        }
    }

    @ObfuscatedName("fm.ar(I)V")
    public void method3322() {
        this.method3263(-1);
        this.method3264(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2885[var1] = this.field2863[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2865[var2] = this.field2863[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("fm.ai(II)V")
    public void method3271(int arg0) {
        if ((this.field2869[arg0] & 0x2) == 0) {
            return;
        }
        for (class178 var2 = (class178) this.field2883.field2898.method3468(); var2 != null; var2 = (class178) this.field2883.field2898.method3470()) {
            if (var2.field2908 == arg0 && this.field2884[arg0][var2.field2918] == null && var2.field2917 < 0) {
                var2.field2917 = 0;
            }
        }
    }

    @ObfuscatedName("fm.aw(IB)V")
    public void method3318(int arg0) {
        if ((this.field2869[arg0] & 0x4) == 0) {
            return;
        }
        for (class178 var2 = (class178) this.field2883.field2898.method3468(); var2 != null; var2 = (class178) this.field2883.field2898.method3470()) {
            if (var2.field2908 == arg0) {
                var2.field2914 = 0;
            }
        }
    }

    @ObfuscatedName("fm.av(II)V")
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
            this.method3248(var9, var10, var11);
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
                this.field2867[var12] = (var14 << 7) + (this.field2867[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2867[var12] = (this.field2867[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2857[var12] = (var14 << 7) + (this.field2857[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2857[var12] = (this.field2857[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2864[var12] = (var14 << 7) + (this.field2864[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2864[var12] = (this.field2864[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2860[var12] = (var14 << 7) + (this.field2860[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2860[var12] = (this.field2860[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2862[var12] = (var14 << 7) + (this.field2862[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2862[var12] = (this.field2862[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2869[var12] |= 0x1;
                } else {
                    this.field2869[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2869[var12] |= 0x2;
                } else {
                    this.method3271(var12);
                    this.field2869[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2870[var12] = (var14 << 7) + (this.field2870[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2870[var12] = (this.field2870[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2870[var12] = (var14 << 7) + (this.field2870[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2870[var12] = (this.field2870[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3263(var12);
            }
            if (var13 == 121) {
                this.method3264(var12);
            }
            if (var13 == 123) {
                this.method3265(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2870[var12];
                if (var15 == 16384) {
                    this.field2882[var12] = (var14 << 7) + (this.field2882[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2870[var12];
                if (var16 == 16384) {
                    this.field2882[var12] = (this.field2882[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2872[var12] = (var14 << 7) + (this.field2872[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2872[var12] = (this.field2872[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2869[var12] |= 0x4;
                } else {
                    this.method3318(var12);
                    this.field2869[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3270(var12, (var14 << 7) + (this.field2861[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3270(var12, (this.field2861[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3256(var17, this.field2865[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3261(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method3247(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3322();
            }
        }
    }

    @ObfuscatedName("fm.af(III)V")
    public void method3270(int arg0, int arg1) {
        this.field2861[arg0] = arg1;
        this.field2877[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("fm.ae(Lfa;I)I")
    public int method3324(class178 arg0) {
        int var2 = (arg0.field2923 * arg0.field2912 >> 12) + arg0.field2922;
        int var3 = ((this.field2866[arg0.field2908] - 8192) * this.field2882[arg0.field2908] >> 12) + var2;
        class176 var4 = arg0.field2906;
        if (var4.field2886 > 0 && (var4.field2892 > 0 || this.field2867[arg0.field2908] > 0)) {
            int var5 = var4.field2892 << 2;
            int var6 = var4.field2894 << 1;
            if (arg0.field2903 < var6) {
                var5 = arg0.field2903 * var5 / var6;
            }
            int var7 = (this.field2867[arg0.field2908] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2919 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2905.field1190 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1142 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("fm.aa(Lfa;I)I")
    public int method3272(class178 arg0) {
        class176 var2 = arg0.field2906;
        int var3 = this.field2864[arg0.field2908] * this.field2862[arg0.field2908] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2909 * var4 + 16384 >> 15;
        int var6 = this.field2858 * var5 + 128 >> 8;
        if (var2.field2889 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2911 * 1.953125E-5D * (double) var2.field2889) + 0.5D);
        }
        if (var2.field2888 != null) {
            int var7 = arg0.field2915;
            int var8 = var2.field2888[arg0.field2916 + 1];
            if (arg0.field2916 < var2.field2888.length - 2) {
                int var9 = (var2.field2888[arg0.field2916] & 0xFF) << 8;
                int var10 = (var2.field2888[arg0.field2916 + 2] & 0xFF) << 8;
                var8 += (var2.field2888[arg0.field2916 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2917 > 0 && var2.field2887 != null) {
            int var11 = arg0.field2917;
            int var12 = var2.field2887[arg0.field2920 + 1];
            if (arg0.field2920 < var2.field2887.length - 2) {
                int var13 = (var2.field2887[arg0.field2920] & 0xFF) << 8;
                int var14 = (var2.field2887[arg0.field2920 + 2] & 0xFF) << 8;
                var12 += (var2.field2887[arg0.field2920 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("fm.ay(Lfa;I)I")
    public int method3273(class178 arg0) {
        int var2 = this.field2860[arg0.field2908];
        return var2 < 8192 ? arg0.field2910 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2910) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("fm.j()Lbh;")
    public synchronized class62 method998() {
        return this.field2883;
    }

    @ObfuscatedName("fm.f()Lbh;")
    public synchronized class62 method999() {
        return null;
    }

    @ObfuscatedName("fm.b()I")
    public synchronized int method1000() {
        return 0;
    }

    @ObfuscatedName("fm.t([III)V")
    public synchronized void method1001(int[] arg0, int arg1, int arg2) {
        if (this.field2859.method3181()) {
            int var4 = this.field2878 * this.field2859.field2830 / Statics.field1142;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2881;
                if (this.field2868 - var5 >= 0L) {
                    this.field2881 = var5;
                    break;
                }
                int var7 = (int) ((this.field2868 - this.field2881 + (long) var4 - 1L) / (long) var4);
                this.field2881 += (long) var4 * (long) var7;
                this.field2883.method1001(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3275();
            } while (this.field2859.method3181());
        }
        this.field2883.method1001(arg0, arg1, arg2);
    }

    @ObfuscatedName("fm.c(I)V")
    public synchronized void method1022(int arg0) {
        if (this.field2859.method3181()) {
            int var2 = this.field2878 * this.field2859.field2830 / Statics.field1142;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2881;
                if (this.field2868 - var3 >= 0L) {
                    this.field2881 = var3;
                    break;
                }
                int var5 = (int) ((this.field2868 - this.field2881 + (long) var2 - 1L) / (long) var2);
                this.field2881 += (long) var2 * (long) var5;
                this.field2883.method1022(var5);
                arg0 -= var5;
                this.method3275();
            } while (this.field2859.method3181());
        }
        this.field2883.method1022(arg0);
    }

    @ObfuscatedName("fm.ac(I)V")
    public void method3275() {
        int var1 = this.field2879;
        int var2 = this.field2880;
        long var3 = this.field2868;
        while (this.field2880 == var2) {
            while (this.field2859.field2840[var1] == var2) {
                this.field2859.method3176(var1);
                int var5 = this.field2859.method3210(var1);
                if (var5 == 1) {
                    this.field2859.method3205();
                    this.field2859.method3177(var1);
                    if (this.field2859.method3185()) {
                        if (!this.field2873 || var2 == 0) {
                            this.method3322();
                            this.field2859.method3213();
                            return;
                        }
                        this.field2859.method3186(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3269(var5);
                }
                this.field2859.method3204(var1);
                this.field2859.method3177(var1);
            }
            var1 = this.field2859.method3184();
            var2 = this.field2859.field2840[var1];
            var3 = this.field2859.method3183(var2);
        }
        this.field2879 = var1;
        this.field2880 = var2;
        this.field2868 = var3;
    }

    @ObfuscatedName("fm.ab(Lfa;I)Z")
    public boolean method3276(class178 arg0) {
        if (arg0.field2921 != null) {
            return false;
        }
        if (arg0.field2917 >= 0) {
            arg0.method3554();
            if (arg0.field2907 > 0 && this.field2876[arg0.field2908][arg0.field2907] == arg0) {
                this.field2876[arg0.field2908][arg0.field2907] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("fm.ap(Lfa;[IIII)Z")
    public boolean method3301(class178 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2913 = Statics.field1142 / 100;
        if (arg0.field2917 >= 0 && arg0.field2921 == null || arg0.field2921.method1184()) {
            arg0.method3374();
            arg0.method3554();
            if (arg0.field2907 > 0 && this.field2876[arg0.field2908][arg0.field2907] == arg0) {
                this.field2876[arg0.field2908][arg0.field2907] = null;
            }
            return true;
        }
        int var5 = arg0.field2923;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2857[arg0.field2908] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2923 = var6;
        }
        arg0.field2921.method1243(this.method3324(arg0));
        class176 var7 = arg0.field2906;
        boolean var8 = false;
        arg0.field2903++;
        arg0.field2919 += var7.field2886;
        double var9 = (double) ((arg0.field2918 - 60 << 8) + (arg0.field2923 * arg0.field2912 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2889 > 0) {
            if (var7.field2891 > 0) {
                arg0.field2911 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2891 * var9) + 0.5D);
            } else {
                arg0.field2911 += 128;
            }
        }
        if (var7.field2888 != null) {
            if (var7.field2893 > 0) {
                arg0.field2915 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2893 * var9) + 0.5D);
            } else {
                arg0.field2915 += 128;
            }
            while (arg0.field2916 < var7.field2888.length - 2 && arg0.field2915 > (var7.field2888[arg0.field2916 + 2] & 0xFF) << 8) {
                arg0.field2916 += 2;
            }
            if (arg0.field2916 == var7.field2888.length - 2 && var7.field2888[arg0.field2916 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2917 >= 0 && var7.field2887 != null && (this.field2869[arg0.field2908] & 0x1) == 0 && (arg0.field2907 < 0 || this.field2876[arg0.field2908][arg0.field2907] != arg0)) {
            if (var7.field2890 > 0) {
                arg0.field2917 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2890 * var9) + 0.5D);
            } else {
                arg0.field2917 += 128;
            }
            while (arg0.field2920 < var7.field2887.length - 2 && arg0.field2917 > (var7.field2887[arg0.field2920 + 2] & 0xFF) << 8) {
                arg0.field2920 += 2;
            }
            if (arg0.field2920 == var7.field2887.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2921.method1202(arg0.field2913, this.method3272(arg0), this.method3273(arg0));
            return false;
        }
        arg0.field2921.method1223(arg0.field2913);
        if (arg1 == null) {
            arg0.field2921.method1022(arg3);
        } else {
            arg0.field2921.method1001(arg1, arg2, arg3);
        }
        if (arg0.field2921.method1185()) {
            this.field2883.field2899.method993(arg0.field2921);
        }
        arg0.method3374();
        if (arg0.field2917 >= 0) {
            arg0.method3554();
            if (arg0.field2907 > 0 && this.field2876[arg0.field2908][arg0.field2907] == arg0) {
                this.field2876[arg0.field2908][arg0.field2907] = null;
            }
        }
        return true;
    }
}
