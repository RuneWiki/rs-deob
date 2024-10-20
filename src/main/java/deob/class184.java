package deob;

@ObfuscatedName("gj")
public class class184 extends class67 {

    @ObfuscatedName("gj.h")
    public class196 field2951 = new class196(128);

    @ObfuscatedName("gj.q")
    public int field2933 = 256;

    @ObfuscatedName("gj.v")
    public int field2934 = 1000000;

    @ObfuscatedName("gj.n")
    public int[] field2954 = new int[16];

    @ObfuscatedName("gj.f")
    public int[] field2943 = new int[16];

    @ObfuscatedName("gj.g")
    public int[] field2937 = new int[16];

    @ObfuscatedName("gj.o")
    public int[] field2955 = new int[16];

    @ObfuscatedName("gj.s")
    public int[] field2939 = new int[16];

    @ObfuscatedName("gj.k")
    public int[] field2940 = new int[16];

    @ObfuscatedName("gj.b")
    public int[] field2941 = new int[16];

    @ObfuscatedName("gj.c")
    public int[] field2932 = new int[16];

    @ObfuscatedName("gj.l")
    public int[] field2945 = new int[16];

    @ObfuscatedName("gj.u")
    public int[] field2938 = new int[16];

    @ObfuscatedName("gj.m")
    public int[] field2946 = new int[16];

    @ObfuscatedName("gj.t")
    public int[] field2947 = new int[16];

    @ObfuscatedName("gj.z")
    public int[] field2948 = new int[16];

    @ObfuscatedName("gj.e")
    public int[] field2949 = new int[16];

    @ObfuscatedName("gj.y")
    public int[] field2950 = new int[16];

    @ObfuscatedName("gj.a")
    public class187[][] field2942 = new class187[16][128];

    @ObfuscatedName("gj.at")
    public class187[][] field2952 = new class187[16][128];

    @ObfuscatedName("gj.aa")
    public class182 field2936 = new class182();

    @ObfuscatedName("gj.ad")
    public boolean field2957;

    @ObfuscatedName("gj.af")
    public int field2956;

    @ObfuscatedName("gj.ag")
    public int field2935;

    @ObfuscatedName("gj.as")
    public long field2953;

    @ObfuscatedName("gj.al")
    public long field2958;

    @ObfuscatedName("gj.am")
    public class186 field2959 = new class186(this);

    public class184() {
        this.method3445();
    }

    @ObfuscatedName("gj.h(II)V")
    public synchronized void method3420(int arg0) {
        this.field2933 = arg0;
    }

    @ObfuscatedName("gj.q(I)I")
    public int method3421() {
        return this.field2933;
    }

    @ObfuscatedName("gj.v(Lfq;Lfv;Lbk;II)Z")
    public synchronized boolean method3422(class180 arg0, class167 arg1, class60 arg2, int arg3) {
        arg0.method3337();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class197 var7 = (class197) arg0.field2899.method3577(); var7 != null; var7 = (class197) arg0.field2899.method3578()) {
            int var8 = (int) var7.field3093;
            class181 var9 = (class181) this.field2951.method3584((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method3077(var8);
                class181 var11;
                if (var10 == null) {
                    var11 = null;
                } else {
                    var11 = new class181(var10);
                }
                var9 = var11;
                if (var11 == null) {
                    var5 = false;
                    continue;
                }
                this.field2951.method3575(var11, (long) var8);
            }
            if (!var9.method3349(arg2, var7.field3073, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3345();
        }
        return var5;
    }

    @ObfuscatedName("gj.n(B)V")
    public synchronized void method3423() {
        for (class181 var1 = (class181) this.field2951.method3577(); var1 != null; var1 = (class181) this.field2951.method3578()) {
            var1.method3348();
        }
    }

    @ObfuscatedName("gj.f(B)V")
    public synchronized void method3424() {
        for (class181 var1 = (class181) this.field2951.method3577(); var1 != null; var1 = (class181) this.field2951.method3578()) {
            var1.method3711();
        }
    }

    @ObfuscatedName("gj.b(Lfq;ZI)V")
    public synchronized void method3429(class180 arg0, boolean arg1) {
        this.method3426();
        this.field2936.method3398(arg0.field2898);
        this.field2957 = arg1;
        this.field2953 = 0L;
        int var3 = this.field2936.method3356();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2936.method3367(var4);
            this.field2936.method3374(var4);
            this.field2936.method3358(var4);
        }
        this.field2956 = this.field2936.method3371();
        this.field2935 = this.field2936.field2914[this.field2956];
        this.field2958 = this.field2936.method3364(this.field2935);
    }

    @ObfuscatedName("gj.l(B)V")
    public synchronized void method3426() {
        this.field2936.method3354();
        this.method3445();
    }

    @ObfuscatedName("gj.p(I)Z")
    public synchronized boolean method3425() {
        return this.field2936.method3391();
    }

    @ObfuscatedName("gj.d(IIB)V")
    public synchronized void method3515(int arg0, int arg1) {
        this.method3435(arg0, arg1);
    }

    @ObfuscatedName("gj.i(IIB)V")
    public void method3435(int arg0, int arg1) {
        this.field2955[arg0] = arg1;
        this.field2940[arg0] = arg1 & 0xFFFFFF80;
        this.method3430(arg0, arg1);
    }

    @ObfuscatedName("gj.x(III)V")
    public void method3430(int arg0, int arg1) {
        if (this.field2939[arg0] != arg1) {
            this.field2939[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2952[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("gj.j(IIII)V")
    public void method3431(int arg0, int arg1, int arg2) {
        this.method3457(arg0, arg1, 64);
        if ((this.field2938[arg0] & 0x2) != 0) {
            for (class187 var4 = (class187) this.field2959.field2972.method3607(); var4 != null; var4 = (class187) this.field2959.field2972.method3617()) {
                if (var4.field3002 == arg0 && var4.field2990 < 0) {
                    this.field2942[arg0][var4.field2984] = null;
                    this.field2942[arg0][arg1] = var4;
                    int var5 = (var4.field2989 * var4.field2988 >> 12) + var4.field2993;
                    var4.field2993 += arg1 - var4.field2984 << 8;
                    var4.field2988 = var5 - var4.field2993;
                    var4.field2989 = 4096;
                    var4.field2984 = arg1;
                    return;
                }
            }
        }
        class181 var6 = (class181) this.field2951.method3584((long) this.field2939[arg0]);
        if (var6 == null) {
            return;
        }
        class63 var7 = var6.field2901[arg1];
        if (var7 == null) {
            return;
        }
        class187 var8 = new class187();
        var8.field3002 = arg0;
        var8.field2980 = var6;
        var8.field2981 = var7;
        var8.field2997 = var6.field2904[arg1];
        var8.field2983 = var6.field2900[arg1];
        var8.field2984 = arg1;
        var8.field2987 = var6.field2905 * arg2 * arg2 * var6.field2906[arg1] + 1024 >> 11;
        var8.field2986 = var6.field2903[arg1] & 0xFF;
        var8.field2993 = (arg1 << 8) - (var6.field2902[arg1] & 0x7FFF);
        var8.field2979 = 0;
        var8.field2991 = 0;
        var8.field2992 = 0;
        var8.field2990 = -1;
        var8.field2994 = 0;
        if (this.field2948[arg0] == 0) {
            var8.field2985 = class65.method1309(var7, this.method3444(var8), this.method3458(var8), this.method3428(var8));
        } else {
            var8.field2985 = class65.method1309(var7, this.method3444(var8), 0, this.method3428(var8));
            this.method3500(var8, var6.field2902[arg1] < 0);
        }
        if (var6.field2902[arg1] < 0) {
            var8.field2985.method1287(-1);
        }
        if (var8.field2983 >= 0) {
            class187 var9 = this.field2952[arg0][var8.field2983];
            if (var9 != null && var9.field2990 < 0) {
                this.field2942[arg0][var9.field2984] = null;
                var9.field2990 = 0;
            }
            this.field2952[arg0][var8.field2983] = var8;
        }
        this.field2959.field2972.method3609(var8);
        this.field2942[arg0][arg1] = var8;
    }

    @ObfuscatedName("gj.w(Lgi;ZI)V")
    public void method3500(class187 arg0, boolean arg1) {
        int var3 = arg0.field2981.field1237.length;
        int var5;
        if (arg1 && arg0.field2981.field1240) {
            int var4 = var3 + var3 - arg0.field2981.field1236;
            var5 = (int) ((long) this.field2948[arg0.field3002] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2985.method1292(true);
            }
        } else {
            var5 = (int) ((long) this.field2948[arg0.field3002] * (long) var3 >> 6);
        }
        arg0.field2985.method1332(var5);
    }

    @ObfuscatedName("gj.r(IIIB)V")
    public void method3457(int arg0, int arg1, int arg2) {
        class187 var4 = this.field2942[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2942[arg0][arg1] = null;
        if ((this.field2938[arg0] & 0x2) == 0) {
            var4.field2990 = 0;
            return;
        }
        for (class187 var5 = (class187) this.field2959.field2972.method3611(); var5 != null; var5 = (class187) this.field2959.field2972.method3616()) {
            if (var4.field3002 == var5.field3002 && var5.field2990 < 0 && var4 != var5) {
                var4.field2990 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("gj.u(IIIB)V")
    public void method3434(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("gj.m(III)V")
    public void method3432(int arg0, int arg1) {
    }

    @ObfuscatedName("gj.t(IIB)V")
    public void method3436(int arg0, int arg1) {
        this.field2941[arg0] = arg1;
    }

    @ObfuscatedName("gj.z(II)V")
    public void method3448(int arg0) {
        for (class187 var2 = (class187) this.field2959.field2972.method3611(); var2 != null; var2 = (class187) this.field2959.field2972.method3616()) {
            if (arg0 < 0 || var2.field3002 == arg0) {
                if (var2.field2985 != null) {
                    var2.field2985.method1362(Statics.field1189 / 100);
                    if (var2.field2985.method1299()) {
                        this.field2959.field2977.method1119(var2.field2985);
                    }
                    var2.method3529();
                }
                if (var2.field2990 < 0) {
                    this.field2942[var2.field3002][var2.field2984] = null;
                }
                var2.method3711();
            }
        }
    }

    @ObfuscatedName("gj.e(II)V")
    public void method3438(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3438(var2);
            }
            return;
        }
        this.field2954[arg0] = 12800;
        this.field2943[arg0] = 8192;
        this.field2937[arg0] = 16383;
        this.field2941[arg0] = 8192;
        this.field2932[arg0] = 0;
        this.field2945[arg0] = 8192;
        this.method3440(arg0);
        this.method3442(arg0);
        this.field2938[arg0] = 0;
        this.field2946[arg0] = 32767;
        this.field2947[arg0] = 256;
        this.field2948[arg0] = 0;
        this.method3443(arg0, 8192);
    }

    @ObfuscatedName("gj.y(II)V")
    public void method3439(int arg0) {
        for (class187 var2 = (class187) this.field2959.field2972.method3611(); var2 != null; var2 = (class187) this.field2959.field2972.method3616()) {
            if ((arg0 < 0 || var2.field3002 == arg0) && var2.field2990 < 0) {
                this.field2942[var2.field3002][var2.field2984] = null;
                var2.field2990 = 0;
            }
        }
    }

    @ObfuscatedName("gj.ab(B)V")
    public void method3445() {
        this.method3448(-1);
        this.method3438(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2939[var1] = this.field2955[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2940[var2] = this.field2955[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("gj.an(II)V")
    public void method3440(int arg0) {
        if ((this.field2938[arg0] & 0x2) == 0) {
            return;
        }
        for (class187 var2 = (class187) this.field2959.field2972.method3611(); var2 != null; var2 = (class187) this.field2959.field2972.method3616()) {
            if (var2.field3002 == arg0 && this.field2942[arg0][var2.field2984] == null && var2.field2990 < 0) {
                var2.field2990 = 0;
            }
        }
    }

    @ObfuscatedName("gj.ak(IB)V")
    public void method3442(int arg0) {
        if ((this.field2938[arg0] & 0x4) == 0) {
            return;
        }
        for (class187 var2 = (class187) this.field2959.field2972.method3611(); var2 != null; var2 = (class187) this.field2959.field2972.method3616()) {
            if (var2.field3002 == arg0) {
                var2.field2999 = 0;
            }
        }
    }

    @ObfuscatedName("gj.ay(II)V")
    public void method3469(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3457(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3431(var6, var7, var8);
            } else {
                this.method3457(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3434(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2940[var12] = (var14 << 14) + (this.field2940[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2940[var12] = (var14 << 7) + (this.field2940[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2932[var12] = (var14 << 7) + (this.field2932[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2932[var12] = (this.field2932[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2945[var12] = (var14 << 7) + (this.field2945[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2945[var12] = (this.field2945[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2954[var12] = (var14 << 7) + (this.field2954[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2954[var12] = (this.field2954[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2943[var12] = (var14 << 7) + (this.field2943[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2943[var12] = (this.field2943[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2937[var12] = (var14 << 7) + (this.field2937[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2937[var12] = (this.field2937[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2938[var12] |= 0x1;
                } else {
                    this.field2938[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2938[var12] |= 0x2;
                } else {
                    this.method3440(var12);
                    this.field2938[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2946[var12] = (var14 << 7) + (this.field2946[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2946[var12] = (this.field2946[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2946[var12] = (var14 << 7) + (this.field2946[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2946[var12] = (this.field2946[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3448(var12);
            }
            if (var13 == 121) {
                this.method3438(var12);
            }
            if (var13 == 123) {
                this.method3439(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2946[var12];
                if (var15 == 16384) {
                    this.field2947[var12] = (var14 << 7) + (this.field2947[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2946[var12];
                if (var16 == 16384) {
                    this.field2947[var12] = (this.field2947[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2948[var12] = (var14 << 7) + (this.field2948[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2948[var12] = (this.field2948[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2938[var12] |= 0x4;
                } else {
                    this.method3442(var12);
                    this.field2938[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3443(var12, (var14 << 7) + (this.field2949[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3443(var12, (this.field2949[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3430(var17, this.field2940[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3432(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method3436(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3445();
            }
        }
    }

    @ObfuscatedName("gj.aw(III)V")
    public void method3443(int arg0, int arg1) {
        this.field2949[arg0] = arg1;
        this.field2950[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("gj.av(Lgi;I)I")
    public int method3444(class187 arg0) {
        int var2 = (arg0.field2989 * arg0.field2988 >> 12) + arg0.field2993;
        int var3 = ((this.field2941[arg0.field3002] - 8192) * this.field2947[arg0.field3002] >> 12) + var2;
        class185 var4 = arg0.field2997;
        if (var4.field2970 > 0 && (var4.field2966 > 0 || this.field2932[arg0.field3002] > 0)) {
            int var5 = var4.field2966 << 2;
            int var6 = var4.field2967 << 1;
            if (arg0.field2995 < var6) {
                var5 = arg0.field2995 * var5 / var6;
            }
            int var7 = (this.field2932[arg0.field3002] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2996 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2981.field1239 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1189 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("gj.ax(Lgi;B)I")
    public int method3458(class187 arg0) {
        class185 var2 = arg0.field2997;
        int var3 = this.field2954[arg0.field3002] * this.field2937[arg0.field3002] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2987 * var4 + 16384 >> 15;
        int var6 = this.field2933 * var5 + 128 >> 8;
        if (var2.field2960 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2979 * 1.953125E-5D * (double) var2.field2960) + 0.5D);
        }
        if (var2.field2969 != null) {
            int var7 = arg0.field2991;
            int var8 = var2.field2969[arg0.field2992 + 1];
            if (arg0.field2992 < var2.field2969.length - 2) {
                int var9 = (var2.field2969[arg0.field2992] & 0xFF) << 8;
                int var10 = (var2.field2969[arg0.field2992 + 2] & 0xFF) << 8;
                var8 += (var2.field2969[arg0.field2992 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2990 > 0 && var2.field2968 != null) {
            int var11 = arg0.field2990;
            int var12 = var2.field2968[arg0.field2994 + 1];
            if (arg0.field2994 < var2.field2968.length - 2) {
                int var13 = (var2.field2968[arg0.field2994] & 0xFF) << 8;
                int var14 = (var2.field2968[arg0.field2994 + 2] & 0xFF) << 8;
                var12 += (var2.field2968[arg0.field2994 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("gj.ai(Lgi;I)I")
    public int method3428(class187 arg0) {
        int var2 = this.field2943[arg0.field3002];
        return var2 < 8192 ? arg0.field2986 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2986) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("gj.g()Lbo;")
    public synchronized class67 method1124() {
        return this.field2959;
    }

    @ObfuscatedName("gj.o()Lbo;")
    public synchronized class67 method1157() {
        return null;
    }

    @ObfuscatedName("gj.s()I")
    public synchronized int method1127() {
        return 0;
    }

    @ObfuscatedName("gj.k([III)V")
    public synchronized void method1143(int[] arg0, int arg1, int arg2) {
        if (this.field2936.method3391()) {
            int var4 = this.field2934 * this.field2936.field2911 / Statics.field1189;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2953;
                if (this.field2958 - var5 >= 0L) {
                    this.field2953 = var5;
                    break;
                }
                int var7 = (int) ((this.field2958 - this.field2953 + (long) var4 - 1L) / (long) var4);
                this.field2953 += (long) var4 * (long) var7;
                this.field2959.method1143(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3427();
            } while (this.field2936.method3391());
        }
        this.field2959.method1143(arg0, arg1, arg2);
    }

    @ObfuscatedName("gj.c(I)V")
    public synchronized void method1129(int arg0) {
        if (this.field2936.method3391()) {
            int var2 = this.field2934 * this.field2936.field2911 / Statics.field1189;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2953;
                if (this.field2958 - var3 >= 0L) {
                    this.field2953 = var3;
                    break;
                }
                int var5 = (int) ((this.field2958 - this.field2953 + (long) var2 - 1L) / (long) var2);
                this.field2953 += (long) var2 * (long) var5;
                this.field2959.method1129(var5);
                arg0 -= var5;
                this.method3427();
            } while (this.field2936.method3391());
        }
        this.field2959.method1129(arg0);
    }

    @ObfuscatedName("gj.ae(I)V")
    public void method3427() {
        int var1 = this.field2956;
        int var2 = this.field2935;
        long var3 = this.field2958;
        while (this.field2935 == var2) {
            while (this.field2936.field2914[var1] == var2) {
                this.field2936.method3367(var1);
                int var5 = this.field2936.method3361(var1);
                if (var5 == 1) {
                    this.field2936.method3359();
                    this.field2936.method3358(var1);
                    if (this.field2936.method3365()) {
                        if (!this.field2957 || var2 == 0) {
                            this.method3445();
                            this.field2936.method3354();
                            return;
                        }
                        this.field2936.method3353(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3469(var5);
                }
                this.field2936.method3374(var1);
                this.field2936.method3358(var1);
            }
            var1 = this.field2936.method3371();
            var2 = this.field2936.field2914[var1];
            var3 = this.field2936.method3364(var2);
        }
        this.field2956 = var1;
        this.field2935 = var2;
        this.field2958 = var3;
    }

    @ObfuscatedName("gj.aj(Lgi;I)Z")
    public boolean method3450(class187 arg0) {
        if (arg0.field2985 != null) {
            return false;
        }
        if (arg0.field2990 >= 0) {
            arg0.method3711();
            if (arg0.field2983 > 0 && this.field2952[arg0.field3002][arg0.field2983] == arg0) {
                this.field2952[arg0.field3002][arg0.field2983] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("gj.ah(Lgi;[IIIB)Z")
    public boolean method3451(class187 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2998 = Statics.field1189 / 100;
        if (arg0.field2990 >= 0 && arg0.field2985 == null || arg0.field2985.method1393()) {
            arg0.method3529();
            arg0.method3711();
            if (arg0.field2983 > 0 && this.field2952[arg0.field3002][arg0.field2983] == arg0) {
                this.field2952[arg0.field3002][arg0.field2983] = null;
            }
            return true;
        }
        int var5 = arg0.field2989;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2945[arg0.field3002] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2989 = var6;
        }
        arg0.field2985.method1280(this.method3444(arg0));
        class185 var7 = arg0.field2997;
        boolean var8 = false;
        arg0.field2995++;
        arg0.field2996 += var7.field2970;
        double var9 = (double) ((arg0.field2984 - 60 << 8) + (arg0.field2989 * arg0.field2988 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2960 > 0) {
            if (var7.field2965 > 0) {
                arg0.field2979 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2965 * var9) + 0.5D);
            } else {
                arg0.field2979 += 128;
            }
        }
        if (var7.field2969 != null) {
            if (var7.field2963 > 0) {
                arg0.field2991 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2963 * var9) + 0.5D);
            } else {
                arg0.field2991 += 128;
            }
            while (arg0.field2992 < var7.field2969.length - 2 && arg0.field2991 > (var7.field2969[arg0.field2992 + 2] & 0xFF) << 8) {
                arg0.field2992 += 2;
            }
            if (arg0.field2992 == var7.field2969.length - 2 && var7.field2969[arg0.field2992 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2990 >= 0 && var7.field2968 != null && (this.field2938[arg0.field3002] & 0x1) == 0 && (arg0.field2983 < 0 || this.field2952[arg0.field3002][arg0.field2983] != arg0)) {
            if (var7.field2964 > 0) {
                arg0.field2990 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2964 * var9) + 0.5D);
            } else {
                arg0.field2990 += 128;
            }
            while (arg0.field2994 < var7.field2968.length - 2 && arg0.field2990 > (var7.field2968[arg0.field2994 + 2] & 0xFF) << 8) {
                arg0.field2994 += 2;
            }
            if (arg0.field2994 == var7.field2968.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2985.method1382(arg0.field2998, this.method3458(arg0), this.method3428(arg0));
            return false;
        }
        arg0.field2985.method1362(arg0.field2998);
        if (arg1 == null) {
            arg0.field2985.method1129(arg3);
        } else {
            arg0.field2985.method1143(arg1, arg2, arg3);
        }
        if (arg0.field2985.method1299()) {
            this.field2959.field2977.method1119(arg0.field2985);
        }
        arg0.method3529();
        if (arg0.field2990 >= 0) {
            arg0.method3711();
            if (arg0.field2983 > 0 && this.field2952[arg0.field3002][arg0.field2983] == arg0) {
                this.field2952[arg0.field3002][arg0.field2983] = null;
            }
        }
        return true;
    }
}
