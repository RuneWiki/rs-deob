package deob;

@ObfuscatedName("go")
public class class184 extends class67 {

    @ObfuscatedName("go.v")
    public class196 field2988 = new class196(128);

    @ObfuscatedName("go.f")
    public int field2969 = 256;

    @ObfuscatedName("go.i")
    public int field2979 = 1000000;

    @ObfuscatedName("go.d")
    public int[] field2971 = new int[16];

    @ObfuscatedName("go.o")
    public int[] field2972 = new int[16];

    @ObfuscatedName("go.c")
    public int[] field2973 = new int[16];

    @ObfuscatedName("go.p")
    public int[] field2974 = new int[16];

    @ObfuscatedName("go.j")
    public int[] field2975 = new int[16];

    @ObfuscatedName("go.a")
    public int[] field2976 = new int[16];

    @ObfuscatedName("go.y")
    public int[] field2991 = new int[16];

    @ObfuscatedName("go.h")
    public int[] field2968 = new int[16];

    @ObfuscatedName("go.z")
    public int[] field2994 = new int[16];

    @ObfuscatedName("go.m")
    public int[] field2981 = new int[16];

    @ObfuscatedName("go.e")
    public int[] field2970 = new int[16];

    @ObfuscatedName("go.k")
    public int[] field2983 = new int[16];

    @ObfuscatedName("go.r")
    public int[] field2984 = new int[16];

    @ObfuscatedName("go.b")
    public int[] field2985 = new int[16];

    @ObfuscatedName("go.t")
    public int[] field2986 = new int[16];

    @ObfuscatedName("go.g")
    public class187[][] field2987 = new class187[16][128];

    @ObfuscatedName("go.af")
    public class187[][] field2982 = new class187[16][128];

    @ObfuscatedName("go.ad")
    public class182 field2989 = new class182();

    @ObfuscatedName("go.ak")
    public boolean field2990;

    @ObfuscatedName("go.ai")
    public int field2993;

    @ObfuscatedName("go.au")
    public int field2978;

    @ObfuscatedName("go.ar")
    public long field2992;

    @ObfuscatedName("go.aw")
    public long field2977;

    @ObfuscatedName("go.at")
    public class186 field2995 = new class186(this);

    public class184() {
        this.method3385();
    }

    @ObfuscatedName("go.v(II)V")
    public synchronized void method3365(int arg0) {
        this.field2969 = arg0;
    }

    @ObfuscatedName("go.f(I)I")
    public int method3389() {
        return this.field2969;
    }

    @ObfuscatedName("go.i(Lfs;Lfh;Lbm;IB)Z")
    public synchronized boolean method3367(class180 arg0, class167 arg1, class60 arg2, int arg3) {
        arg0.method3285();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class197 var7 = (class197) arg0.field2929.method3525(); var7 != null; var7 = (class197) arg0.field2929.method3528()) {
            int var8 = (int) var7.field3115;
            class181 var9 = (class181) this.field2988.method3524((long) var8);
            if (var9 == null) {
                var9 = class181.method192(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field2988.method3526(var9, (long) var8);
            }
            if (!var9.method3287(arg2, var7.field3094, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3278();
        }
        return var5;
    }

    @ObfuscatedName("go.d(I)V")
    public synchronized void method3417() {
        for (class181 var1 = (class181) this.field2988.method3525(); var1 != null; var1 = (class181) this.field2988.method3528()) {
            var1.method3288();
        }
    }

    @ObfuscatedName("go.o(I)V")
    public synchronized void method3420() {
        for (class181 var1 = (class181) this.field2988.method3525(); var1 != null; var1 = (class181) this.field2988.method3528()) {
            var1.method3645();
        }
    }

    @ObfuscatedName("go.y(Lfs;ZI)V")
    public synchronized void method3370(class180 arg0, boolean arg1) {
        this.method3371();
        this.field2989.method3300(arg0.field2928);
        this.field2990 = arg1;
        this.field2992 = 0L;
        int var3 = this.field2989.method3303();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2989.method3311(var4);
            this.field2989.method3307(var4);
            this.field2989.method3305(var4);
        }
        this.field2993 = this.field2989.method3347();
        this.field2978 = this.field2989.field2940[this.field2993];
        this.field2977 = this.field2989.method3328(this.field2978);
    }

    @ObfuscatedName("go.z(I)V")
    public synchronized void method3371() {
        this.field2989.method3318();
        this.method3385();
    }

    @ObfuscatedName("go.w(I)Z")
    public synchronized boolean method3432() {
        return this.field2989.method3302();
    }

    @ObfuscatedName("go.l(III)V")
    public synchronized void method3459(int arg0, int arg1) {
        this.method3374(arg0, arg1);
    }

    @ObfuscatedName("go.q(IIB)V")
    public void method3374(int arg0, int arg1) {
        this.field2974[arg0] = arg1;
        this.field2976[arg0] = arg1 & 0xFFFFFF80;
        this.method3375(arg0, arg1);
    }

    @ObfuscatedName("go.x(III)V")
    public void method3375(int arg0, int arg1) {
        if (this.field2975[arg0] != arg1) {
            this.field2975[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2982[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("go.s(IIII)V")
    public void method3376(int arg0, int arg1, int arg2) {
        this.method3434(arg0, arg1, 64);
        if ((this.field2981[arg0] & 0x2) != 0) {
            for (class187 var4 = (class187) this.field2995.field3013.method3556(); var4 != null; var4 = (class187) this.field2995.field3013.method3582()) {
                if (var4.field3021 == arg0 && var4.field3025 < 0) {
                    this.field2987[arg0][var4.field3014] = null;
                    this.field2987[arg0][arg1] = var4;
                    int var5 = (var4.field3024 * var4.field3018 >> 12) + var4.field3022;
                    var4.field3022 += arg1 - var4.field3014 << 8;
                    var4.field3018 = var5 - var4.field3022;
                    var4.field3024 = 4096;
                    var4.field3014 = arg1;
                    return;
                }
            }
        }
        class181 var6 = (class181) this.field2988.method3524((long) this.field2975[arg0]);
        if (var6 == null) {
            return;
        }
        class63 var7 = var6.field2931[arg1];
        if (var7 == null) {
            return;
        }
        class187 var8 = new class187();
        var8.field3021 = arg0;
        var8.field3015 = var6;
        var8.field3016 = var7;
        var8.field3017 = var6.field2935[arg1];
        var8.field3027 = var6.field2937[arg1];
        var8.field3014 = arg1;
        var8.field3020 = var6.field2933 * arg2 * arg2 * var6.field2930[arg1] + 1024 >> 11;
        var8.field3031 = var6.field2934[arg1] & 0xFF;
        var8.field3022 = (arg1 << 8) - (var6.field2932[arg1] & 0x7FFF);
        var8.field3032 = 0;
        var8.field3019 = 0;
        var8.field3028 = 0;
        var8.field3025 = -1;
        var8.field3029 = 0;
        if (this.field2984[arg0] == 0) {
            var8.field3026 = class65.method1289(var7, this.method3390(var8), this.method3391(var8), this.method3392(var8));
        } else {
            var8.field3026 = class65.method1289(var7, this.method3390(var8), 0, this.method3392(var8));
            this.method3377(var8, var6.field2932[arg1] < 0);
        }
        if (var6.field2932[arg1] < 0) {
            var8.field3026.method1368(-1);
        }
        if (var8.field3027 >= 0) {
            class187 var9 = this.field2982[arg0][var8.field3027];
            if (var9 != null && var9.field3025 < 0) {
                this.field2987[arg0][var9.field3014] = null;
                var9.field3025 = 0;
            }
            this.field2982[arg0][var8.field3027] = var8;
        }
        this.field2995.field3013.method3558(var8);
        this.field2987[arg0][arg1] = var8;
    }

    @ObfuscatedName("go.n(Lgb;ZB)V")
    public void method3377(class187 arg0, boolean arg1) {
        int var3 = arg0.field3016.field1229.length;
        int var5;
        if (arg1 && arg0.field3016.field1228) {
            int var4 = var3 + var3 - arg0.field3016.field1232;
            var5 = (int) ((long) this.field2984[arg0.field3021] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field3026.method1283(true);
            }
        } else {
            var5 = (int) ((long) this.field2984[arg0.field3021] * (long) var3 >> 6);
        }
        arg0.field3026.method1282(var5);
    }

    @ObfuscatedName("go.u(IIIS)V")
    public void method3434(int arg0, int arg1, int arg2) {
        class187 var4 = this.field2987[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2987[arg0][arg1] = null;
        if ((this.field2981[arg0] & 0x2) == 0) {
            var4.field3025 = 0;
            return;
        }
        for (class187 var5 = (class187) this.field2995.field3013.method3563(); var5 != null; var5 = (class187) this.field2995.field3013.method3565()) {
            if (var4.field3021 == var5.field3021 && var5.field3025 < 0 && var4 != var5) {
                var4.field3025 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("go.m(IIII)V")
    public void method3379(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("go.e(III)V")
    public void method3369(int arg0, int arg1) {
    }

    @ObfuscatedName("go.k(III)V")
    public void method3397(int arg0, int arg1) {
        this.field2991[arg0] = arg1;
    }

    @ObfuscatedName("go.r(II)V")
    public void method3382(int arg0) {
        for (class187 var2 = (class187) this.field2995.field3013.method3563(); var2 != null; var2 = (class187) this.field2995.field3013.method3565()) {
            if (arg0 < 0 || var2.field3021 == arg0) {
                if (var2.field3026 != null) {
                    var2.field3026.method1287(Statics.field1170 / 100);
                    if (var2.field3026.method1291()) {
                        this.field2995.field3012.method1112(var2.field3026);
                    }
                    var2.method3478();
                }
                if (var2.field3025 < 0) {
                    this.field2987[var2.field3021][var2.field3014] = null;
                }
                var2.method3645();
            }
        }
    }

    @ObfuscatedName("go.at(II)V")
    public void method3383(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3383(var2);
            }
            return;
        }
        this.field2971[arg0] = 12800;
        this.field2972[arg0] = 8192;
        this.field2973[arg0] = 16383;
        this.field2991[arg0] = 8192;
        this.field2968[arg0] = 0;
        this.field2994[arg0] = 8192;
        this.method3386(arg0);
        this.method3424(arg0);
        this.field2981[arg0] = 0;
        this.field2970[arg0] = 32767;
        this.field2983[arg0] = 256;
        this.field2984[arg0] = 0;
        this.method3415(arg0, 8192);
    }

    @ObfuscatedName("go.al(II)V")
    public void method3384(int arg0) {
        for (class187 var2 = (class187) this.field2995.field3013.method3563(); var2 != null; var2 = (class187) this.field2995.field3013.method3565()) {
            if ((arg0 < 0 || var2.field3021 == arg0) && var2.field3025 < 0) {
                this.field2987[var2.field3021][var2.field3014] = null;
                var2.field3025 = 0;
            }
        }
    }

    @ObfuscatedName("go.aj(I)V")
    public void method3385() {
        this.method3382(-1);
        this.method3383(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2975[var1] = this.field2974[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2976[var2] = this.field2974[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("go.ag(II)V")
    public void method3386(int arg0) {
        if ((this.field2981[arg0] & 0x2) == 0) {
            return;
        }
        for (class187 var2 = (class187) this.field2995.field3013.method3563(); var2 != null; var2 = (class187) this.field2995.field3013.method3565()) {
            if (var2.field3021 == arg0 && this.field2987[arg0][var2.field3014] == null && var2.field3025 < 0) {
                var2.field3025 = 0;
            }
        }
    }

    @ObfuscatedName("go.av(IS)V")
    public void method3424(int arg0) {
        if ((this.field2981[arg0] & 0x4) == 0) {
            return;
        }
        for (class187 var2 = (class187) this.field2995.field3013.method3563(); var2 != null; var2 = (class187) this.field2995.field3013.method3565()) {
            if (var2.field3021 == arg0) {
                var2.field3034 = 0;
            }
        }
    }

    @ObfuscatedName("go.am(IB)V")
    public void method3423(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3434(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3376(var6, var7, var8);
            } else {
                this.method3434(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3379(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2976[var12] = (var14 << 14) + (this.field2976[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2976[var12] = (var14 << 7) + (this.field2976[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2968[var12] = (var14 << 7) + (this.field2968[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2968[var12] = (this.field2968[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2994[var12] = (var14 << 7) + (this.field2994[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2994[var12] = (this.field2994[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2971[var12] = (var14 << 7) + (this.field2971[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2971[var12] = (this.field2971[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2972[var12] = (var14 << 7) + (this.field2972[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2972[var12] = (this.field2972[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2973[var12] = (var14 << 7) + (this.field2973[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2973[var12] = (this.field2973[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2981[var12] |= 0x1;
                } else {
                    this.field2981[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2981[var12] |= 0x2;
                } else {
                    this.method3386(var12);
                    this.field2981[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2970[var12] = (var14 << 7) + (this.field2970[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2970[var12] = (this.field2970[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2970[var12] = (var14 << 7) + (this.field2970[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2970[var12] = (this.field2970[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3382(var12);
            }
            if (var13 == 121) {
                this.method3383(var12);
            }
            if (var13 == 123) {
                this.method3384(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2970[var12];
                if (var15 == 16384) {
                    this.field2983[var12] = (var14 << 7) + (this.field2983[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2970[var12];
                if (var16 == 16384) {
                    this.field2983[var12] = (this.field2983[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2984[var12] = (var14 << 7) + (this.field2984[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2984[var12] = (this.field2984[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2981[var12] |= 0x4;
                } else {
                    this.method3424(var12);
                    this.field2981[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3415(var12, (var14 << 7) + (this.field2985[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3415(var12, (this.field2985[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3375(var17, this.field2976[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3369(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method3397(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3385();
            }
        }
    }

    @ObfuscatedName("go.ae(IIB)V")
    public void method3415(int arg0, int arg1) {
        this.field2985[arg0] = arg1;
        this.field2986[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("go.ap(Lgb;B)I")
    public int method3390(class187 arg0) {
        int var2 = (arg0.field3024 * arg0.field3018 >> 12) + arg0.field3022;
        int var3 = ((this.field2991[arg0.field3021] - 8192) * this.field2983[arg0.field3021] >> 12) + var2;
        class185 var4 = arg0.field3017;
        if (var4.field3004 > 0 && (var4.field3003 > 0 || this.field2968[arg0.field3021] > 0)) {
            int var5 = var4.field3003 << 2;
            int var6 = var4.field2997 << 1;
            if (arg0.field3030 < var6) {
                var5 = arg0.field3030 * var5 / var6;
            }
            int var7 = (this.field2968[arg0.field3021] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field3023 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field3016.field1230 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1170 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("go.ax(Lgb;I)I")
    public int method3391(class187 arg0) {
        class185 var2 = arg0.field3017;
        int var3 = this.field2973[arg0.field3021] * this.field2971[arg0.field3021] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field3020 * var4 + 16384 >> 15;
        int var6 = this.field2969 * var5 + 128 >> 8;
        if (var2.field2999 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field3032 * 1.953125E-5D * (double) var2.field2999) + 0.5D);
        }
        if (var2.field3002 != null) {
            int var7 = arg0.field3019;
            int var8 = var2.field3002[arg0.field3028 + 1];
            if (arg0.field3028 < var2.field3002.length - 2) {
                int var9 = (var2.field3002[arg0.field3028] & 0xFF) << 8;
                int var10 = (var2.field3002[arg0.field3028 + 2] & 0xFF) << 8;
                var8 += (var2.field3002[arg0.field3028 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field3025 > 0 && var2.field2998 != null) {
            int var11 = arg0.field3025;
            int var12 = var2.field2998[arg0.field3029 + 1];
            if (arg0.field3029 < var2.field2998.length - 2) {
                int var13 = (var2.field2998[arg0.field3029] & 0xFF) << 8;
                int var14 = (var2.field2998[arg0.field3029 + 2] & 0xFF) << 8;
                var12 += (var2.field2998[arg0.field3029 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("go.ab(Lgb;I)I")
    public int method3392(class187 arg0) {
        int var2 = this.field2972[arg0.field3021];
        return var2 < 8192 ? arg0.field3031 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field3031) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("go.c()Lbk;")
    public synchronized class67 method1139() {
        return this.field2995;
    }

    @ObfuscatedName("go.p()Lbk;")
    public synchronized class67 method1118() {
        return null;
    }

    @ObfuscatedName("go.j()I")
    public synchronized int method1119() {
        return 0;
    }

    @ObfuscatedName("go.a([III)V")
    public synchronized void method1149(int[] arg0, int arg1, int arg2) {
        if (this.field2989.method3302()) {
            int var4 = this.field2979 * this.field2989.field2941 / Statics.field1170;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2992;
                if (this.field2977 - var5 >= 0L) {
                    this.field2992 = var5;
                    break;
                }
                int var7 = (int) ((this.field2977 - this.field2992 + (long) var4 - 1L) / (long) var4);
                this.field2992 += (long) var4 * (long) var7;
                this.field2995.method1149(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3402();
            } while (this.field2989.method3302());
        }
        this.field2995.method1149(arg0, arg1, arg2);
    }

    @ObfuscatedName("go.h(I)V")
    public synchronized void method1122(int arg0) {
        if (this.field2989.method3302()) {
            int var2 = this.field2979 * this.field2989.field2941 / Statics.field1170;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2992;
                if (this.field2977 - var3 >= 0L) {
                    this.field2992 = var3;
                    break;
                }
                int var5 = (int) ((this.field2977 - this.field2992 + (long) var2 - 1L) / (long) var2);
                this.field2992 += (long) var2 * (long) var5;
                this.field2995.method1122(var5);
                arg0 -= var5;
                this.method3402();
            } while (this.field2989.method3302());
        }
        this.field2995.method1122(arg0);
    }

    @ObfuscatedName("go.as(I)V")
    public void method3402() {
        int var1 = this.field2993;
        int var2 = this.field2978;
        long var3 = this.field2977;
        while (this.field2978 == var2) {
            while (this.field2989.field2940[var1] == var2) {
                this.field2989.method3311(var1);
                int var5 = this.field2989.method3323(var1);
                if (var5 == 1) {
                    this.field2989.method3306();
                    this.field2989.method3305(var1);
                    if (this.field2989.method3313()) {
                        if (!this.field2990 || var2 == 0) {
                            this.method3385();
                            this.field2989.method3318();
                            return;
                        }
                        this.field2989.method3314(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3423(var5);
                }
                this.field2989.method3307(var1);
                this.field2989.method3305(var1);
            }
            var1 = this.field2989.method3347();
            var2 = this.field2989.field2940[var1];
            var3 = this.field2989.method3328(var2);
        }
        this.field2993 = var1;
        this.field2978 = var2;
        this.field2977 = var3;
    }

    @ObfuscatedName("go.ah(Lgb;I)Z")
    public boolean method3396(class187 arg0) {
        if (arg0.field3026 != null) {
            return false;
        }
        if (arg0.field3025 >= 0) {
            arg0.method3645();
            if (arg0.field3027 > 0 && this.field2982[arg0.field3021][arg0.field3027] == arg0) {
                this.field2982[arg0.field3021][arg0.field3027] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("go.aq(Lgb;[IIII)Z")
    public boolean method3414(class187 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field3033 = Statics.field1170 / 100;
        if (arg0.field3025 >= 0 && arg0.field3026 == null || arg0.field3026.method1397()) {
            arg0.method3478();
            arg0.method3645();
            if (arg0.field3027 > 0 && this.field2982[arg0.field3021][arg0.field3027] == arg0) {
                this.field2982[arg0.field3021][arg0.field3027] = null;
            }
            return true;
        }
        int var5 = arg0.field3024;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2994[arg0.field3021] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field3024 = var6;
        }
        arg0.field3026.method1273(this.method3390(arg0));
        class185 var7 = arg0.field3017;
        boolean var8 = false;
        arg0.field3030++;
        arg0.field3023 += var7.field3004;
        double var9 = (double) ((arg0.field3014 - 60 << 8) + (arg0.field3024 * arg0.field3018 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2999 > 0) {
            if (var7.field3005 > 0) {
                arg0.field3032 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3005 * var9) + 0.5D);
            } else {
                arg0.field3032 += 128;
            }
        }
        if (var7.field3002 != null) {
            if (var7.field3000 > 0) {
                arg0.field3019 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3000 * var9) + 0.5D);
            } else {
                arg0.field3019 += 128;
            }
            while (arg0.field3028 < var7.field3002.length - 2 && arg0.field3019 > (var7.field3002[arg0.field3028 + 2] & 0xFF) << 8) {
                arg0.field3028 += 2;
            }
            if (arg0.field3028 == var7.field3002.length - 2 && var7.field3002[arg0.field3028 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field3025 >= 0 && var7.field2998 != null && (this.field2981[arg0.field3021] & 0x1) == 0 && (arg0.field3027 < 0 || this.field2982[arg0.field3021][arg0.field3027] != arg0)) {
            if (var7.field3001 > 0) {
                arg0.field3025 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3001 * var9) + 0.5D);
            } else {
                arg0.field3025 += 128;
            }
            while (arg0.field3029 < var7.field2998.length - 2 && arg0.field3025 > (var7.field2998[arg0.field3029 + 2] & 0xFF) << 8) {
                arg0.field3029 += 2;
            }
            if (arg0.field3029 == var7.field2998.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field3026.method1286(arg0.field3033, this.method3391(arg0), this.method3392(arg0));
            return false;
        }
        arg0.field3026.method1287(arg0.field3033);
        if (arg1 == null) {
            arg0.field3026.method1122(arg3);
        } else {
            arg0.field3026.method1149(arg1, arg2, arg3);
        }
        if (arg0.field3026.method1291()) {
            this.field2995.field3012.method1112(arg0.field3026);
        }
        arg0.method3478();
        if (arg0.field3025 >= 0) {
            arg0.method3645();
            if (arg0.field3027 > 0 && this.field2982[arg0.field3021][arg0.field3027] == arg0) {
                this.field2982[arg0.field3021][arg0.field3027] = null;
            }
        }
        return true;
    }
}
