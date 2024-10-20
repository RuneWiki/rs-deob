package deob;

@ObfuscatedName("gn")
public class class188 extends class70 {

    @ObfuscatedName("gn.i")
    public class200 field3039 = new class200(128);

    @ObfuscatedName("gn.h")
    public int field3020 = 256;

    @ObfuscatedName("gn.e")
    public int field3021 = 1000000;

    @ObfuscatedName("gn.g")
    public int[] field3022 = new int[16];

    @ObfuscatedName("gn.n")
    public int[] field3023 = new int[16];

    @ObfuscatedName("gn.u")
    public int[] field3024 = new int[16];

    @ObfuscatedName("gn.d")
    public int[] field3025 = new int[16];

    @ObfuscatedName("gn.l")
    public int[] field3019 = new int[16];

    @ObfuscatedName("gn.m")
    public int[] field3027 = new int[16];

    @ObfuscatedName("gn.j")
    public int[] field3028 = new int[16];

    @ObfuscatedName("gn.y")
    public int[] field3037 = new int[16];

    @ObfuscatedName("gn.s")
    public int[] field3046 = new int[16];

    @ObfuscatedName("gn.z")
    public int[] field3036 = new int[16];

    @ObfuscatedName("gn.q")
    public int[] field3032 = new int[16];

    @ObfuscatedName("gn.o")
    public int[] field3033 = new int[16];

    @ObfuscatedName("gn.f")
    public int[] field3034 = new int[16];

    @ObfuscatedName("gn.b")
    public int[] field3035 = new int[16];

    @ObfuscatedName("gn.t")
    public int[] field3029 = new int[16];

    @ObfuscatedName("gn.a")
    public class191[][] field3040 = new class191[16][128];

    @ObfuscatedName("gn.am")
    public class191[][] field3038 = new class191[16][128];

    @ObfuscatedName("gn.as")
    public class186 field3031 = new class186();

    @ObfuscatedName("gn.ad")
    public boolean field3030;

    @ObfuscatedName("gn.af")
    public int field3041;

    @ObfuscatedName("gn.ak")
    public int field3042;

    @ObfuscatedName("gn.aq")
    public long field3045;

    @ObfuscatedName("gn.an")
    public long field3044;

    @ObfuscatedName("gn.ag")
    public class190 field3026 = new class190(this);

    public class188() {
        this.method3428();
    }

    @ObfuscatedName("gn.i(IB)V")
    public synchronized void method3411(int arg0) {
        this.field3020 = arg0;
    }

    @ObfuscatedName("gn.h(I)I")
    public int method3412() {
        return this.field3020;
    }

    @ObfuscatedName("gn.e(Lgk;Lfu;Lbn;IS)Z")
    public synchronized boolean method3441(class184 arg0, class171 arg1, class63 arg2, int arg3) {
        arg0.method3329();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class201 var7 = (class201) arg0.field2984.method3567(); var7 != null; var7 = (class201) arg0.field2984.method3568()) {
            int var8 = (int) var7.field3176;
            class185 var9 = (class185) this.field3039.method3564((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method3105(var8);
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
                this.field3039.method3565(var11, (long) var8);
            }
            if (!var9.method3341(arg2, var7.field3153, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3331();
        }
        return var5;
    }

    @ObfuscatedName("gn.g(I)V")
    public synchronized void method3414() {
        for (class185 var1 = (class185) this.field3039.method3567(); var1 != null; var1 = (class185) this.field3039.method3568()) {
            var1.method3344();
        }
    }

    @ObfuscatedName("gn.n(I)V")
    public synchronized void method3438() {
        for (class185 var1 = (class185) this.field3039.method3567(); var1 != null; var1 = (class185) this.field3039.method3568()) {
            var1.method3706();
        }
    }

    @ObfuscatedName("gn.j(Lgk;ZI)V")
    public synchronized void method3415(class184 arg0, boolean arg1) {
        this.method3494();
        this.field3031.method3351(arg0.field2985);
        this.field3030 = arg1;
        this.field3045 = 0L;
        int var3 = this.field3031.method3353();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3031.method3400(var4);
            this.field3031.method3357(var4);
            this.field3031.method3355(var4);
        }
        this.field3041 = this.field3031.method3362();
        this.field3042 = this.field3031.field3010[this.field3041];
        this.field3044 = this.field3031.method3383(this.field3042);
    }

    @ObfuscatedName("gn.s(B)V")
    public synchronized void method3494() {
        this.field3031.method3349();
        this.method3428();
    }

    @ObfuscatedName("gn.p(I)Z")
    public synchronized boolean method3416() {
        return this.field3031.method3384();
    }

    @ObfuscatedName("gn.v(IIB)V")
    public synchronized void method3417(int arg0, int arg1) {
        this.method3418(arg0, arg1);
    }

    @ObfuscatedName("gn.r(IIS)V")
    public void method3418(int arg0, int arg1) {
        this.field3025[arg0] = arg1;
        this.field3027[arg0] = arg1 & 0xFFFFFF80;
        this.method3419(arg0, arg1);
    }

    @ObfuscatedName("gn.c(IIB)V")
    public void method3419(int arg0, int arg1) {
        if (this.field3019[arg0] != arg1) {
            this.field3019[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field3038[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("gn.w(IIIB)V")
    public void method3420(int arg0, int arg1, int arg2) {
        this.method3422(arg0, arg1, 64);
        if ((this.field3036[arg0] & 0x2) != 0) {
            for (class191 var4 = (class191) this.field3026.field3060.method3598(); var4 != null; var4 = (class191) this.field3026.field3060.method3600()) {
                if (var4.field3078 == arg0 && var4.field3081 < 0) {
                    this.field3040[arg0][var4.field3076] = null;
                    this.field3040[arg0][arg1] = var4;
                    int var5 = (var4.field3083 * var4.field3077 >> 12) + var4.field3075;
                    var4.field3075 += arg1 - var4.field3076 << 8;
                    var4.field3083 = var5 - var4.field3075;
                    var4.field3077 = 4096;
                    var4.field3076 = arg1;
                    return;
                }
            }
        }
        class185 var6 = (class185) this.field3039.method3564((long) this.field3019[arg0]);
        if (var6 == null) {
            return;
        }
        class66 var7 = var6.field2987[arg1];
        if (var7 == null) {
            return;
        }
        class191 var8 = new class191();
        var8.field3078 = arg0;
        var8.field3067 = var6;
        var8.field3086 = var7;
        var8.field3070 = var6.field2994[arg1];
        var8.field3071 = var6.field2991[arg1];
        var8.field3076 = arg1;
        var8.field3073 = var6.field2992 * arg2 * arg2 * var6.field2989[arg1] + 1024 >> 11;
        var8.field3074 = var6.field2990[arg1] & 0xFF;
        var8.field3075 = (arg1 << 8) - (var6.field2988[arg1] & 0x7FFF);
        var8.field3072 = 0;
        var8.field3080 = 0;
        var8.field3079 = 0;
        var8.field3081 = -1;
        var8.field3082 = 0;
        if (this.field3034[arg0] == 0) {
            var8.field3085 = class68.method1313(var7, this.method3433(var8), this.method3421(var8), this.method3429(var8));
        } else {
            var8.field3085 = class68.method1313(var7, this.method3433(var8), 0, this.method3429(var8));
            this.method3482(var8, var6.field2988[arg1] < 0);
        }
        if (var6.field2988[arg1] < 0) {
            var8.field3085.method1339(-1);
        }
        if (var8.field3071 >= 0) {
            class191 var9 = this.field3038[arg0][var8.field3071];
            if (var9 != null && var9.field3081 < 0) {
                this.field3040[arg0][var9.field3076] = null;
                var9.field3081 = 0;
            }
            this.field3038[arg0][var8.field3071] = var8;
        }
        this.field3026.field3060.method3617(var8);
        this.field3040[arg0][arg1] = var8;
    }

    @ObfuscatedName("gn.x(Lgx;ZI)V")
    public void method3482(class191 arg0, boolean arg1) {
        int var3 = arg0.field3086.field1289.length;
        int var5;
        if (arg1 && arg0.field3086.field1285) {
            int var4 = var3 + var3 - arg0.field3086.field1287;
            var5 = (int) ((long) this.field3034[arg0.field3078] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field3085.method1322(true);
            }
        } else {
            var5 = (int) ((long) this.field3034[arg0.field3078] * (long) var3 >> 6);
        }
        arg0.field3085.method1321(var5);
    }

    @ObfuscatedName("gn.k(IIIB)V")
    public void method3422(int arg0, int arg1, int arg2) {
        class191 var4 = this.field3040[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field3040[arg0][arg1] = null;
        if ((this.field3036[arg0] & 0x2) == 0) {
            var4.field3081 = 0;
            return;
        }
        for (class191 var5 = (class191) this.field3026.field3060.method3597(); var5 != null; var5 = (class191) this.field3026.field3060.method3599()) {
            if (var4.field3078 == var5.field3078 && var5.field3081 < 0 && var4 != var5) {
                var4.field3081 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("gn.z(IIIB)V")
    public void method3483(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("gn.q(III)V")
    public void method3461(int arg0, int arg1) {
    }

    @ObfuscatedName("gn.o(III)V")
    public void method3481(int arg0, int arg1) {
        this.field3028[arg0] = arg1;
    }

    @ObfuscatedName("gn.f(II)V")
    public void method3425(int arg0) {
        for (class191 var2 = (class191) this.field3026.field3060.method3597(); var2 != null; var2 = (class191) this.field3026.field3060.method3599()) {
            if (arg0 < 0 || var2.field3078 == arg0) {
                if (var2.field3085 != null) {
                    var2.field3085.method1326(Statics.field1240 / 100);
                    if (var2.field3085.method1330()) {
                        this.field3026.field3065.method1143(var2.field3085);
                    }
                    var2.method3519();
                }
                if (var2.field3081 < 0) {
                    this.field3040[var2.field3078][var2.field3076] = null;
                }
                var2.method3706();
            }
        }
    }

    @ObfuscatedName("gn.b(IB)V")
    public void method3426(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3426(var2);
            }
            return;
        }
        this.field3022[arg0] = 12800;
        this.field3023[arg0] = 8192;
        this.field3024[arg0] = 16383;
        this.field3028[arg0] = 8192;
        this.field3037[arg0] = 0;
        this.field3046[arg0] = 8192;
        this.method3440(arg0);
        this.method3439(arg0);
        this.field3036[arg0] = 0;
        this.field3032[arg0] = 32767;
        this.field3033[arg0] = 256;
        this.field3034[arg0] = 0;
        this.method3432(arg0, 8192);
    }

    @ObfuscatedName("gn.ag(IB)V")
    public void method3427(int arg0) {
        for (class191 var2 = (class191) this.field3026.field3060.method3597(); var2 != null; var2 = (class191) this.field3026.field3060.method3599()) {
            if ((arg0 < 0 || var2.field3078 == arg0) && var2.field3081 < 0) {
                this.field3040[var2.field3078][var2.field3076] = null;
                var2.field3081 = 0;
            }
        }
    }

    @ObfuscatedName("gn.aw(B)V")
    public void method3428() {
        this.method3425(-1);
        this.method3426(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field3019[var1] = this.field3025[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field3027[var2] = this.field3025[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("gn.ao(II)V")
    public void method3440(int arg0) {
        if ((this.field3036[arg0] & 0x2) == 0) {
            return;
        }
        for (class191 var2 = (class191) this.field3026.field3060.method3597(); var2 != null; var2 = (class191) this.field3026.field3060.method3599()) {
            if (var2.field3078 == arg0 && this.field3040[arg0][var2.field3076] == null && var2.field3081 < 0) {
                var2.field3081 = 0;
            }
        }
    }

    @ObfuscatedName("gn.ax(II)V")
    public void method3439(int arg0) {
        if ((this.field3036[arg0] & 0x4) == 0) {
            return;
        }
        for (class191 var2 = (class191) this.field3026.field3060.method3597(); var2 != null; var2 = (class191) this.field3026.field3060.method3599()) {
            if (var2.field3078 == arg0) {
                var2.field3087 = 0;
            }
        }
    }

    @ObfuscatedName("gn.ac(II)V")
    public void method3430(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3422(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3420(var6, var7, var8);
            } else {
                this.method3422(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3483(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field3027[var12] = (var14 << 14) + (this.field3027[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field3027[var12] = (var14 << 7) + (this.field3027[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field3037[var12] = (var14 << 7) + (this.field3037[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field3037[var12] = (this.field3037[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field3046[var12] = (var14 << 7) + (this.field3046[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field3046[var12] = (this.field3046[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field3022[var12] = (var14 << 7) + (this.field3022[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field3022[var12] = (this.field3022[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field3023[var12] = (var14 << 7) + (this.field3023[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field3023[var12] = (this.field3023[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field3024[var12] = (var14 << 7) + (this.field3024[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field3024[var12] = (this.field3024[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field3036[var12] |= 0x1;
                } else {
                    this.field3036[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field3036[var12] |= 0x2;
                } else {
                    this.method3440(var12);
                    this.field3036[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field3032[var12] = (var14 << 7) + (this.field3032[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field3032[var12] = (this.field3032[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field3032[var12] = (var14 << 7) + (this.field3032[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field3032[var12] = (this.field3032[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3425(var12);
            }
            if (var13 == 121) {
                this.method3426(var12);
            }
            if (var13 == 123) {
                this.method3427(var12);
            }
            if (var13 == 6) {
                int var15 = this.field3032[var12];
                if (var15 == 16384) {
                    this.field3033[var12] = (var14 << 7) + (this.field3033[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field3032[var12];
                if (var16 == 16384) {
                    this.field3033[var12] = (this.field3033[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field3034[var12] = (var14 << 7) + (this.field3034[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field3034[var12] = (this.field3034[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field3036[var12] |= 0x4;
                } else {
                    this.method3439(var12);
                    this.field3036[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3432(var12, (var14 << 7) + (this.field3035[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3432(var12, (this.field3035[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3419(var17, this.field3027[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3461(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method3481(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3428();
            }
        }
    }

    @ObfuscatedName("gn.ai(III)V")
    public void method3432(int arg0, int arg1) {
        this.field3035[arg0] = arg1;
        this.field3029[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("gn.ap(Lgx;I)I")
    public int method3433(class191 arg0) {
        int var2 = (arg0.field3083 * arg0.field3077 >> 12) + arg0.field3075;
        int var3 = ((this.field3028[arg0.field3078] - 8192) * this.field3033[arg0.field3078] >> 12) + var2;
        class189 var4 = arg0.field3070;
        if (var4.field3054 > 0 && (var4.field3056 > 0 || this.field3037[arg0.field3078] > 0)) {
            int var5 = var4.field3056 << 2;
            int var6 = var4.field3055 << 1;
            if (arg0.field3069 < var6) {
                var5 = arg0.field3069 * var5 / var6;
            }
            int var7 = (this.field3037[arg0.field3078] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field3084 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field3086.field1286 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1240 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("gn.aa(Lgx;I)I")
    public int method3421(class191 arg0) {
        class189 var2 = arg0.field3070;
        int var3 = this.field3024[arg0.field3078] * this.field3022[arg0.field3078] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field3073 * var4 + 16384 >> 15;
        int var6 = this.field3020 * var5 + 128 >> 8;
        if (var2.field3049 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field3072 * 1.953125E-5D * (double) var2.field3049) + 0.5D);
        }
        if (var2.field3048 != null) {
            int var7 = arg0.field3080;
            int var8 = var2.field3048[arg0.field3079 + 1];
            if (arg0.field3079 < var2.field3048.length - 2) {
                int var9 = (var2.field3048[arg0.field3079] & 0xFF) << 8;
                int var10 = (var2.field3048[arg0.field3079 + 2] & 0xFF) << 8;
                var8 += (var2.field3048[arg0.field3079 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field3081 > 0 && var2.field3058 != null) {
            int var11 = arg0.field3081;
            int var12 = var2.field3058[arg0.field3082 + 1];
            if (arg0.field3082 < var2.field3058.length - 2) {
                int var13 = (var2.field3058[arg0.field3082] & 0xFF) << 8;
                int var14 = (var2.field3058[arg0.field3082 + 2] & 0xFF) << 8;
                var12 += (var2.field3058[arg0.field3082 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("gn.ay(Lgx;B)I")
    public int method3429(class191 arg0) {
        int var2 = this.field3023[arg0.field3078];
        return var2 < 8192 ? arg0.field3074 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field3074) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("gn.u()Lbf;")
    public synchronized class70 method1148() {
        return this.field3026;
    }

    @ObfuscatedName("gn.d()Lbf;")
    public synchronized class70 method1149() {
        return null;
    }

    @ObfuscatedName("gn.l()I")
    public synchronized int method1150() {
        return 0;
    }

    @ObfuscatedName("gn.m([III)V")
    public synchronized void method1151(int[] arg0, int arg1, int arg2) {
        if (this.field3031.method3384()) {
            int var4 = this.field3021 * this.field3031.field2998 / Statics.field1240;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field3045;
                if (this.field3044 - var5 >= 0L) {
                    this.field3045 = var5;
                    break;
                }
                int var7 = (int) ((this.field3044 - this.field3045 + (long) var4 - 1L) / (long) var4);
                this.field3045 += (long) var4 * (long) var7;
                this.field3026.method1151(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3435();
            } while (this.field3031.method3384());
        }
        this.field3026.method1151(arg0, arg1, arg2);
    }

    @ObfuscatedName("gn.y(I)V")
    public synchronized void method1169(int arg0) {
        if (this.field3031.method3384()) {
            int var2 = this.field3021 * this.field3031.field2998 / Statics.field1240;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field3045;
                if (this.field3044 - var3 >= 0L) {
                    this.field3045 = var3;
                    break;
                }
                int var5 = (int) ((this.field3044 - this.field3045 + (long) var2 - 1L) / (long) var2);
                this.field3045 += (long) var2 * (long) var5;
                this.field3026.method1169(var5);
                arg0 -= var5;
                this.method3435();
            } while (this.field3031.method3384());
        }
        this.field3026.method1169(arg0);
    }

    @ObfuscatedName("gn.ab(I)V")
    public void method3435() {
        int var1 = this.field3041;
        int var2 = this.field3042;
        long var3 = this.field3044;
        while (this.field3042 == var2) {
            while (this.field3031.field3010[var1] == var2) {
                this.field3031.method3400(var1);
                int var5 = this.field3031.method3358(var1);
                if (var5 == 1) {
                    this.field3031.method3356();
                    this.field3031.method3355(var1);
                    if (this.field3031.method3354()) {
                        if (!this.field3030 || var2 == 0) {
                            this.method3428();
                            this.field3031.method3349();
                            return;
                        }
                        this.field3031.method3363(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3430(var5);
                }
                this.field3031.method3357(var1);
                this.field3031.method3355(var1);
            }
            var1 = this.field3031.method3362();
            var2 = this.field3031.field3010[var1];
            var3 = this.field3031.method3383(var2);
        }
        this.field3041 = var1;
        this.field3042 = var2;
        this.field3044 = var3;
    }

    @ObfuscatedName("gn.aj(Lgx;I)Z")
    public boolean method3436(class191 arg0) {
        if (arg0.field3085 != null) {
            return false;
        }
        if (arg0.field3081 >= 0) {
            arg0.method3706();
            if (arg0.field3071 > 0 && this.field3038[arg0.field3078][arg0.field3071] == arg0) {
                this.field3038[arg0.field3078][arg0.field3071] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("gn.az(Lgx;[IIII)Z")
    public boolean method3501(class191 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field3068 = Statics.field1240 / 100;
        if (arg0.field3081 >= 0 && arg0.field3085 == null || arg0.field3085.method1315()) {
            arg0.method3519();
            arg0.method3706();
            if (arg0.field3071 > 0 && this.field3038[arg0.field3078][arg0.field3071] == arg0) {
                this.field3038[arg0.field3078][arg0.field3071] = null;
            }
            return true;
        }
        int var5 = arg0.field3077;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field3046[arg0.field3078] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field3077 = var6;
        }
        arg0.field3085.method1363(this.method3433(arg0));
        class189 var7 = arg0.field3070;
        boolean var8 = false;
        arg0.field3069++;
        arg0.field3084 += var7.field3054;
        double var9 = (double) ((arg0.field3076 - 60 << 8) + (arg0.field3083 * arg0.field3077 >> 12)) * 5.086263020833333E-6D;
        if (var7.field3049 > 0) {
            if (var7.field3052 > 0) {
                arg0.field3072 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3052 * var9) + 0.5D);
            } else {
                arg0.field3072 += 128;
            }
        }
        if (var7.field3048 != null) {
            if (var7.field3050 > 0) {
                arg0.field3080 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3050 * var9) + 0.5D);
            } else {
                arg0.field3080 += 128;
            }
            while (arg0.field3079 < var7.field3048.length - 2 && arg0.field3080 > (var7.field3048[arg0.field3079 + 2] & 0xFF) << 8) {
                arg0.field3079 += 2;
            }
            if (arg0.field3079 == var7.field3048.length - 2 && var7.field3048[arg0.field3079 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field3081 >= 0 && var7.field3058 != null && (this.field3036[arg0.field3078] & 0x1) == 0 && (arg0.field3071 < 0 || this.field3038[arg0.field3078][arg0.field3071] != arg0)) {
            if (var7.field3051 > 0) {
                arg0.field3081 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3051 * var9) + 0.5D);
            } else {
                arg0.field3081 += 128;
            }
            while (arg0.field3082 < var7.field3058.length - 2 && arg0.field3081 > (var7.field3058[arg0.field3082 + 2] & 0xFF) << 8) {
                arg0.field3082 += 2;
            }
            if (arg0.field3082 == var7.field3058.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field3085.method1325(arg0.field3068, this.method3421(arg0), this.method3429(arg0));
            return false;
        }
        arg0.field3085.method1326(arg0.field3068);
        if (arg1 == null) {
            arg0.field3085.method1169(arg3);
        } else {
            arg0.field3085.method1151(arg1, arg2, arg3);
        }
        if (arg0.field3085.method1330()) {
            this.field3026.field3065.method1143(arg0.field3085);
        }
        arg0.method3519();
        if (arg0.field3081 >= 0) {
            arg0.method3706();
            if (arg0.field3071 > 0 && this.field3038[arg0.field3078][arg0.field3071] == arg0) {
                this.field3038[arg0.field3078][arg0.field3071] = null;
            }
        }
        return true;
    }
}
