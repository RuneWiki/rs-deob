package deob;

@ObfuscatedName("gu")
public class class188 extends class70 {

    @ObfuscatedName("gu.s")
    public class200 field3039 = new class200(128);

    @ObfuscatedName("gu.z")
    public int field3012 = 256;

    @ObfuscatedName("gu.t")
    public int field3017 = 1000000;

    @ObfuscatedName("gu.y")
    public int[] field3014 = new int[16];

    @ObfuscatedName("gu.p")
    public int[] field3015 = new int[16];

    @ObfuscatedName("gu.g")
    public int[] field3016 = new int[16];

    @ObfuscatedName("gu.m")
    public int[] field3030 = new int[16];

    @ObfuscatedName("gu.f")
    public int[] field3018 = new int[16];

    @ObfuscatedName("gu.k")
    public int[] field3038 = new int[16];

    @ObfuscatedName("gu.h")
    public int[] field3020 = new int[16];

    @ObfuscatedName("gu.r")
    public int[] field3021 = new int[16];

    @ObfuscatedName("gu.u")
    public int[] field3022 = new int[16];

    @ObfuscatedName("gu.c")
    public int[] field3023 = new int[16];

    @ObfuscatedName("gu.i")
    public int[] field3033 = new int[16];

    @ObfuscatedName("gu.x")
    public int[] field3025 = new int[16];

    @ObfuscatedName("gu.v")
    public int[] field3026 = new int[16];

    @ObfuscatedName("gu.l")
    public int[] field3027 = new int[16];

    @ObfuscatedName("gu.e")
    public int[] field3028 = new int[16];

    @ObfuscatedName("gu.j")
    public class191[][] field3029 = new class191[16][128];

    @ObfuscatedName("gu.ae")
    public class191[][] field3036 = new class191[16][128];

    @ObfuscatedName("gu.ah")
    public class186 field3031 = new class186();

    @ObfuscatedName("gu.am")
    public boolean field3032;

    @ObfuscatedName("gu.aa")
    public int field3034;

    @ObfuscatedName("gu.ax")
    public int field3019;

    @ObfuscatedName("gu.ac")
    public long field3035;

    @ObfuscatedName("gu.ar")
    public long field3011;

    @ObfuscatedName("gu.an")
    public class190 field3037 = new class190(this);

    public class188() {
        this.method3410();
    }

    @ObfuscatedName("gu.s(IB)V")
    public synchronized void method3422(int arg0) {
        this.field3012 = arg0;
    }

    @ObfuscatedName("gu.z(B)I")
    public int method3392() {
        return this.field3012;
    }

    @ObfuscatedName("gu.t(Lgr;Lfu;Lbm;II)Z")
    public synchronized boolean method3424(class184 arg0, class171 arg1, class63 arg2, int arg3) {
        arg0.method3313();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class201 var7 = (class201) arg0.field2970.method3560(); var7 != null; var7 = (class201) arg0.field2970.method3565()) {
            int var8 = (int) var7.field3167;
            class185 var9 = (class185) this.field3039.method3555((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method3121(var8);
                class185 var11;
                if (var10 == null) {
                    var11 = null;
                } else {
                    var11 = new class185(var10);
                }
                var9 = var11;
                if (var11 == null) {
                    var5 = false;
                    continue;
                }
                this.field3039.method3556(var11, (long) var8);
            }
            if (!var9.method3325(arg2, var7.field3145, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3314();
        }
        return var5;
    }

    @ObfuscatedName("gu.y(B)V")
    public synchronized void method3394() {
        for (class185 var1 = (class185) this.field3039.method3560(); var1 != null; var1 = (class185) this.field3039.method3565()) {
            var1.method3322();
        }
    }

    @ObfuscatedName("gu.p(I)V")
    public synchronized void method3459() {
        for (class185 var1 = (class185) this.field3039.method3560(); var1 != null; var1 = (class185) this.field3039.method3565()) {
            var1.method3699();
        }
    }

    @ObfuscatedName("gu.h(Lgr;ZB)V")
    public synchronized void method3396(class184 arg0, boolean arg1) {
        this.method3397();
        this.field3031.method3328(arg0.field2971);
        this.field3032 = arg1;
        this.field3035 = 0L;
        int var3 = this.field3031.method3355();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3031.method3339(var4);
            this.field3031.method3332(var4);
            this.field3031.method3345(var4);
        }
        this.field3034 = this.field3031.method3340();
        this.field3019 = this.field3031.field2989[this.field3034];
        this.field3011 = this.field3031.method3335(this.field3019);
    }

    @ObfuscatedName("gu.w(I)V")
    public synchronized void method3397() {
        this.field3031.method3329();
        this.method3410();
    }

    @ObfuscatedName("gu.u(I)Z")
    public synchronized boolean method3398() {
        return this.field3031.method3327();
    }

    @ObfuscatedName("gu.n(IIB)V")
    public synchronized void method3399(int arg0, int arg1) {
        this.method3400(arg0, arg1);
    }

    @ObfuscatedName("gu.d(IIB)V")
    public void method3400(int arg0, int arg1) {
        this.field3030[arg0] = arg1;
        this.field3038[arg0] = arg1 & 0xFFFFFF80;
        this.method3411(arg0, arg1);
    }

    @ObfuscatedName("gu.a(III)V")
    public void method3411(int arg0, int arg1) {
        if (this.field3018[arg0] != arg1) {
            this.field3018[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field3036[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("gu.b(IIII)V")
    public void method3402(int arg0, int arg1, int arg2) {
        this.method3404(arg0, arg1, 64);
        if ((this.field3023[arg0] & 0x2) != 0) {
            for (class191 var4 = (class191) this.field3037.field3054.method3603(); var4 != null; var4 = (class191) this.field3037.field3054.method3608()) {
                if (var4.field3068 == arg0 && var4.field3061 < 0) {
                    this.field3029[arg0][var4.field3073] = null;
                    this.field3029[arg0][arg1] = var4;
                    int var5 = (var4.field3066 * var4.field3056 >> 12) + var4.field3064;
                    var4.field3064 += arg1 - var4.field3073 << 8;
                    var4.field3056 = var5 - var4.field3064;
                    var4.field3066 = 4096;
                    var4.field3073 = arg1;
                    return;
                }
            }
        }
        class185 var6 = (class185) this.field3039.method3555((long) this.field3018[arg0]);
        if (var6 == null) {
            return;
        }
        class66 var7 = var6.field2981[arg1];
        if (var7 == null) {
            return;
        }
        class191 var8 = new class191();
        var8.field3068 = arg0;
        var8.field3070 = var6;
        var8.field3058 = var7;
        var8.field3057 = var6.field2977[arg1];
        var8.field3060 = var6.field2978[arg1];
        var8.field3073 = arg1;
        var8.field3062 = var6.field2974 * arg2 * arg2 * var6.field2975[arg1] + 1024 >> 11;
        var8.field3063 = var6.field2976[arg1] & 0xFF;
        var8.field3064 = (arg1 << 8) - (var6.field2973[arg1] & 0x7FFF);
        var8.field3067 = 0;
        var8.field3059 = 0;
        var8.field3071 = 0;
        var8.field3061 = -1;
        var8.field3065 = 0;
        if (this.field3026[arg0] == 0) {
            var8.field3074 = class68.method1294(var7, this.method3415(var8), this.method3406(var8), this.method3416(var8));
        } else {
            var8.field3074 = class68.method1294(var7, this.method3415(var8), 0, this.method3416(var8));
            this.method3403(var8, var6.field2973[arg1] < 0);
        }
        if (var6.field2973[arg1] < 0) {
            var8.field3074.method1296(-1);
        }
        if (var8.field3060 >= 0) {
            class191 var9 = this.field3036[arg0][var8.field3060];
            if (var9 != null && var9.field3061 < 0) {
                this.field3029[arg0][var9.field3073] = null;
                var9.field3061 = 0;
            }
            this.field3036[arg0][var8.field3060] = var8;
        }
        this.field3037.field3054.method3581(var8);
        this.field3029[arg0][arg1] = var8;
    }

    @ObfuscatedName("gu.q(Lgd;ZB)V")
    public void method3403(class191 arg0, boolean arg1) {
        int var3 = arg0.field3058.field1274.length;
        int var5;
        if (arg1 && arg0.field3058.field1273) {
            int var4 = var3 + var3 - arg0.field3058.field1275;
            var5 = (int) ((long) this.field3026[arg0.field3068] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field3074.method1359(true);
            }
        } else {
            var5 = (int) ((long) this.field3026[arg0.field3068] * (long) var3 >> 6);
        }
        arg0.field3074.method1301(var5);
    }

    @ObfuscatedName("gu.o(IIIB)V")
    public void method3404(int arg0, int arg1, int arg2) {
        class191 var4 = this.field3029[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field3029[arg0][arg1] = null;
        if ((this.field3023[arg0] & 0x2) == 0) {
            var4.field3061 = 0;
            return;
        }
        for (class191 var5 = (class191) this.field3037.field3054.method3588(); var5 != null; var5 = (class191) this.field3037.field3054.method3590()) {
            if (var4.field3068 == var5.field3068 && var5.field3061 < 0 && var4 != var5) {
                var4.field3061 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("gu.c(IIII)V")
    public void method3465(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("gu.i(IIB)V")
    public void method3451(int arg0, int arg1) {
    }

    @ObfuscatedName("gu.x(III)V")
    public void method3417(int arg0, int arg1) {
        this.field3020[arg0] = arg1;
    }

    @ObfuscatedName("gu.aa(IB)V")
    public void method3407(int arg0) {
        for (class191 var2 = (class191) this.field3037.field3054.method3588(); var2 != null; var2 = (class191) this.field3037.field3054.method3590()) {
            if (arg0 < 0 || var2.field3068 == arg0) {
                if (var2.field3074 != null) {
                    var2.field3074.method1307(Statics.field1220 / 100);
                    if (var2.field3074.method1311()) {
                        this.field3037.field3055.method1128(var2.field3074);
                    }
                    var2.method3511();
                }
                if (var2.field3061 < 0) {
                    this.field3029[var2.field3068][var2.field3073] = null;
                }
                var2.method3699();
            }
        }
    }

    @ObfuscatedName("gu.ag(II)V")
    public void method3390(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3390(var2);
            }
            return;
        }
        this.field3014[arg0] = 12800;
        this.field3015[arg0] = 8192;
        this.field3016[arg0] = 16383;
        this.field3020[arg0] = 8192;
        this.field3021[arg0] = 0;
        this.field3022[arg0] = 8192;
        this.method3456(arg0);
        this.method3412(arg0);
        this.field3023[arg0] = 0;
        this.field3033[arg0] = 32767;
        this.field3025[arg0] = 256;
        this.field3026[arg0] = 0;
        this.method3485(arg0, 8192);
    }

    @ObfuscatedName("gu.ab(II)V")
    public void method3408(int arg0) {
        for (class191 var2 = (class191) this.field3037.field3054.method3588(); var2 != null; var2 = (class191) this.field3037.field3054.method3590()) {
            if ((arg0 < 0 || var2.field3068 == arg0) && var2.field3061 < 0) {
                this.field3029[var2.field3068][var2.field3073] = null;
                var2.field3061 = 0;
            }
        }
    }

    @ObfuscatedName("gu.ao(I)V")
    public void method3410() {
        this.method3407(-1);
        this.method3390(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field3018[var1] = this.field3030[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field3038[var2] = this.field3030[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("gu.av(II)V")
    public void method3456(int arg0) {
        if ((this.field3023[arg0] & 0x2) == 0) {
            return;
        }
        for (class191 var2 = (class191) this.field3037.field3054.method3588(); var2 != null; var2 = (class191) this.field3037.field3054.method3590()) {
            if (var2.field3068 == arg0 && this.field3029[arg0][var2.field3073] == null && var2.field3061 < 0) {
                var2.field3061 = 0;
            }
        }
    }

    @ObfuscatedName("gu.ap(IB)V")
    public void method3412(int arg0) {
        if ((this.field3023[arg0] & 0x4) == 0) {
            return;
        }
        for (class191 var2 = (class191) this.field3037.field3054.method3588(); var2 != null; var2 = (class191) this.field3037.field3054.method3590()) {
            if (var2.field3068 == arg0) {
                var2.field3076 = 0;
            }
        }
    }

    @ObfuscatedName("gu.au(IB)V")
    public void method3413(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3404(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3402(var6, var7, var8);
            } else {
                this.method3404(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3465(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field3038[var12] = (var14 << 14) + (this.field3038[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field3038[var12] = (var14 << 7) + (this.field3038[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field3021[var12] = (var14 << 7) + (this.field3021[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field3021[var12] = (this.field3021[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field3022[var12] = (var14 << 7) + (this.field3022[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field3022[var12] = (this.field3022[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field3014[var12] = (var14 << 7) + (this.field3014[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field3014[var12] = (this.field3014[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field3015[var12] = (var14 << 7) + (this.field3015[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field3015[var12] = (this.field3015[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field3016[var12] = (var14 << 7) + (this.field3016[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field3016[var12] = (this.field3016[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field3023[var12] |= 0x1;
                } else {
                    this.field3023[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field3023[var12] |= 0x2;
                } else {
                    this.method3456(var12);
                    this.field3023[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field3033[var12] = (var14 << 7) + (this.field3033[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field3033[var12] = (this.field3033[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field3033[var12] = (var14 << 7) + (this.field3033[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field3033[var12] = (this.field3033[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3407(var12);
            }
            if (var13 == 121) {
                this.method3390(var12);
            }
            if (var13 == 123) {
                this.method3408(var12);
            }
            if (var13 == 6) {
                int var15 = this.field3033[var12];
                if (var15 == 16384) {
                    this.field3025[var12] = (var14 << 7) + (this.field3025[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field3033[var12];
                if (var16 == 16384) {
                    this.field3025[var12] = (this.field3025[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field3026[var12] = (var14 << 7) + (this.field3026[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field3026[var12] = (this.field3026[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field3023[var12] |= 0x4;
                } else {
                    this.method3412(var12);
                    this.field3023[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3485(var12, (var14 << 7) + (this.field3027[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3485(var12, (this.field3027[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3411(var17, this.field3038[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3451(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method3417(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3410();
            }
        }
    }

    @ObfuscatedName("gu.ad(III)V")
    public void method3485(int arg0, int arg1) {
        this.field3027[arg0] = arg1;
        this.field3028[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("gu.aj(Lgd;I)I")
    public int method3415(class191 arg0) {
        int var2 = (arg0.field3066 * arg0.field3056 >> 12) + arg0.field3064;
        int var3 = ((this.field3020[arg0.field3068] - 8192) * this.field3025[arg0.field3068] >> 12) + var2;
        class189 var4 = arg0.field3057;
        if (var4.field3049 > 0 && (var4.field3046 > 0 || this.field3021[arg0.field3068] > 0)) {
            int var5 = var4.field3046 << 2;
            int var6 = var4.field3040 << 1;
            if (arg0.field3072 < var6) {
                var5 = arg0.field3072 * var5 / var6;
            }
            int var7 = (this.field3021[arg0.field3068] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field3069 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field3058.field1277 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1220 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("gu.ai(Lgd;S)I")
    public int method3406(class191 arg0) {
        class189 var2 = arg0.field3057;
        int var3 = this.field3016[arg0.field3068] * this.field3014[arg0.field3068] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field3062 * var4 + 16384 >> 15;
        int var6 = this.field3012 * var5 + 128 >> 8;
        if (var2.field3042 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field3067 * 1.953125E-5D * (double) var2.field3042) + 0.5D);
        }
        if (var2.field3051 != null) {
            int var7 = arg0.field3059;
            int var8 = var2.field3051[arg0.field3071 + 1];
            if (arg0.field3071 < var2.field3051.length - 2) {
                int var9 = (var2.field3051[arg0.field3071] & 0xFF) << 8;
                int var10 = (var2.field3051[arg0.field3071 + 2] & 0xFF) << 8;
                var8 += (var2.field3051[arg0.field3071 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field3061 > 0 && var2.field3041 != null) {
            int var11 = arg0.field3061;
            int var12 = var2.field3041[arg0.field3065 + 1];
            if (arg0.field3065 < var2.field3041.length - 2) {
                int var13 = (var2.field3041[arg0.field3065] & 0xFF) << 8;
                int var14 = (var2.field3041[arg0.field3065 + 2] & 0xFF) << 8;
                var12 += (var2.field3041[arg0.field3065 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("gu.az(Lgd;S)I")
    public int method3416(class191 arg0) {
        int var2 = this.field3015[arg0.field3068];
        return var2 < 8192 ? arg0.field3063 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field3063) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("gu.g()Lbi;")
    public synchronized class70 method1133() {
        return this.field3037;
    }

    @ObfuscatedName("gu.m()Lbi;")
    public synchronized class70 method1134() {
        return null;
    }

    @ObfuscatedName("gu.f()I")
    public synchronized int method1151() {
        return 0;
    }

    @ObfuscatedName("gu.k([III)V")
    public synchronized void method1135(int[] arg0, int arg1, int arg2) {
        if (this.field3031.method3327()) {
            int var4 = this.field3017 * this.field3031.field2986 / Statics.field1220;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field3035;
                if (this.field3011 - var5 >= 0L) {
                    this.field3035 = var5;
                    break;
                }
                int var7 = (int) ((this.field3011 - this.field3035 + (long) var4 - 1L) / (long) var4);
                this.field3035 += (long) var4 * (long) var7;
                this.field3037.method1135(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3419();
            } while (this.field3031.method3327());
        }
        this.field3037.method1135(arg0, arg1, arg2);
    }

    @ObfuscatedName("gu.r(I)V")
    public synchronized void method1137(int arg0) {
        if (this.field3031.method3327()) {
            int var2 = this.field3017 * this.field3031.field2986 / Statics.field1220;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field3035;
                if (this.field3011 - var3 >= 0L) {
                    this.field3035 = var3;
                    break;
                }
                int var5 = (int) ((this.field3011 - this.field3035 + (long) var2 - 1L) / (long) var2);
                this.field3035 += (long) var2 * (long) var5;
                this.field3037.method1137(var5);
                arg0 -= var5;
                this.method3419();
            } while (this.field3031.method3327());
        }
        this.field3037.method1137(arg0);
    }

    @ObfuscatedName("gu.ay(B)V")
    public void method3419() {
        int var1 = this.field3034;
        int var2 = this.field3019;
        long var3 = this.field3011;
        while (this.field3019 == var2) {
            while (this.field3031.field2989[var1] == var2) {
                this.field3031.method3339(var1);
                int var5 = this.field3031.method3350(var1);
                if (var5 == 1) {
                    this.field3031.method3334();
                    this.field3031.method3345(var1);
                    if (this.field3031.method3346()) {
                        if (!this.field3032 || var2 == 0) {
                            this.method3410();
                            this.field3031.method3329();
                            return;
                        }
                        this.field3031.method3341(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3413(var5);
                }
                this.field3031.method3332(var1);
                this.field3031.method3345(var1);
            }
            var1 = this.field3031.method3340();
            var2 = this.field3031.field2989[var1];
            var3 = this.field3031.method3335(var2);
        }
        this.field3034 = var1;
        this.field3019 = var2;
        this.field3011 = var3;
    }

    @ObfuscatedName("gu.at(Lgd;S)Z")
    public boolean method3420(class191 arg0) {
        if (arg0.field3074 != null) {
            return false;
        }
        if (arg0.field3061 >= 0) {
            arg0.method3699();
            if (arg0.field3060 > 0 && this.field3036[arg0.field3068][arg0.field3060] == arg0) {
                this.field3036[arg0.field3068][arg0.field3060] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("gu.al(Lgd;[IIII)Z")
    public boolean method3462(class191 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field3075 = Statics.field1220 / 100;
        if (arg0.field3061 >= 0 && arg0.field3074 == null || arg0.field3074.method1404()) {
            arg0.method3511();
            arg0.method3699();
            if (arg0.field3060 > 0 && this.field3036[arg0.field3068][arg0.field3060] == arg0) {
                this.field3036[arg0.field3068][arg0.field3060] = null;
            }
            return true;
        }
        int var5 = arg0.field3066;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field3022[arg0.field3068] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field3066 = var6;
        }
        arg0.field3074.method1308(this.method3415(arg0));
        class189 var7 = arg0.field3057;
        boolean var8 = false;
        arg0.field3072++;
        arg0.field3069 += var7.field3049;
        double var9 = (double) ((arg0.field3073 - 60 << 8) + (arg0.field3066 * arg0.field3056 >> 12)) * 5.086263020833333E-6D;
        if (var7.field3042 > 0) {
            if (var7.field3045 > 0) {
                arg0.field3067 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3045 * var9) + 0.5D);
            } else {
                arg0.field3067 += 128;
            }
        }
        if (var7.field3051 != null) {
            if (var7.field3043 > 0) {
                arg0.field3059 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3043 * var9) + 0.5D);
            } else {
                arg0.field3059 += 128;
            }
            while (arg0.field3071 < var7.field3051.length - 2 && arg0.field3059 > (var7.field3051[arg0.field3071 + 2] & 0xFF) << 8) {
                arg0.field3071 += 2;
            }
            if (arg0.field3071 == var7.field3051.length - 2 && var7.field3051[arg0.field3071 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field3061 >= 0 && var7.field3041 != null && (this.field3023[arg0.field3068] & 0x1) == 0 && (arg0.field3060 < 0 || this.field3036[arg0.field3068][arg0.field3060] != arg0)) {
            if (var7.field3044 > 0) {
                arg0.field3061 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3044 * var9) + 0.5D);
            } else {
                arg0.field3061 += 128;
            }
            while (arg0.field3065 < var7.field3041.length - 2 && arg0.field3061 > (var7.field3041[arg0.field3065 + 2] & 0xFF) << 8) {
                arg0.field3065 += 2;
            }
            if (arg0.field3065 == var7.field3041.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field3074.method1306(arg0.field3075, this.method3406(arg0), this.method3416(arg0));
            return false;
        }
        arg0.field3074.method1307(arg0.field3075);
        if (arg1 == null) {
            arg0.field3074.method1137(arg3);
        } else {
            arg0.field3074.method1135(arg1, arg2, arg3);
        }
        if (arg0.field3074.method1311()) {
            this.field3037.field3055.method1128(arg0.field3074);
        }
        arg0.method3511();
        if (arg0.field3061 >= 0) {
            arg0.method3699();
            if (arg0.field3060 > 0 && this.field3036[arg0.field3068][arg0.field3060] == arg0) {
                this.field3036[arg0.field3068][arg0.field3060] = null;
            }
        }
        return true;
    }
}
