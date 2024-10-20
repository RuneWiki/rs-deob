package deob;

@ObfuscatedName("gv")
public class class188 extends class70 {

    @ObfuscatedName("gv.a")
    public class200 field3050 = new class200(128);

    @ObfuscatedName("gv.d")
    public int field3027 = 256;

    @ObfuscatedName("gv.v")
    public int field3040 = 1000000;

    @ObfuscatedName("gv.r")
    public int[] field3029 = new int[16];

    @ObfuscatedName("gv.z")
    public int[] field3030 = new int[16];

    @ObfuscatedName("gv.t")
    public int[] field3046 = new int[16];

    @ObfuscatedName("gv.n")
    public int[] field3049 = new int[16];

    @ObfuscatedName("gv.i")
    public int[] field3033 = new int[16];

    @ObfuscatedName("gv.g")
    public int[] field3034 = new int[16];

    @ObfuscatedName("gv.m")
    public int[] field3031 = new int[16];

    @ObfuscatedName("gv.k")
    public int[] field3036 = new int[16];

    @ObfuscatedName("gv.x")
    public int[] field3032 = new int[16];

    @ObfuscatedName("gv.y")
    public int[] field3038 = new int[16];

    @ObfuscatedName("gv.s")
    public int[] field3039 = new int[16];

    @ObfuscatedName("gv.e")
    public int[] field3044 = new int[16];

    @ObfuscatedName("gv.h")
    public int[] field3041 = new int[16];

    @ObfuscatedName("gv.l")
    public int[] field3042 = new int[16];

    @ObfuscatedName("gv.c")
    public int[] field3043 = new int[16];

    @ObfuscatedName("gv.f")
    public class191[][] field3026 = new class191[16][128];

    @ObfuscatedName("gv.ac")
    public class191[][] field3045 = new class191[16][128];

    @ObfuscatedName("gv.as")
    public class186 field3037 = new class186();

    @ObfuscatedName("gv.af")
    public boolean field3047;

    @ObfuscatedName("gv.am")
    public int field3048;

    @ObfuscatedName("gv.ap")
    public int field3028;

    @ObfuscatedName("gv.aa")
    public long field3035;

    @ObfuscatedName("gv.ar")
    public long field3051;

    @ObfuscatedName("gv.av")
    public class190 field3052 = new class190(this);

    public class188() {
        this.method3512();
    }

    @ObfuscatedName("gv.a(II)V")
    public synchronized void method3444(int arg0) {
        this.field3027 = arg0;
    }

    @ObfuscatedName("gv.d(B)I")
    public int method3434() {
        return this.field3027;
    }

    @ObfuscatedName("gv.v(Lge;Lfu;Lbj;II)Z")
    public synchronized boolean method3466(class184 arg0, class171 arg1, class63 arg2, int arg3) {
        arg0.method3352();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class201 var7 = (class201) arg0.field2989.method3583(); var7 != null; var7 = (class201) arg0.field2989.method3590()) {
            int var8 = (int) var7.field3171;
            class185 var9 = (class185) this.field3050.method3580((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method3131(var8);
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
                this.field3050.method3586(var11, (long) var8);
            }
            if (!var9.method3357(arg2, var7.field3149, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3347();
        }
        return var5;
    }

    @ObfuscatedName("gv.r(I)V")
    public synchronized void method3465() {
        for (class185 var1 = (class185) this.field3050.method3583(); var1 != null; var1 = (class185) this.field3050.method3590()) {
            var1.method3358();
        }
    }

    @ObfuscatedName("gv.z(I)V")
    public synchronized void method3435() {
        for (class185 var1 = (class185) this.field3050.method3583(); var1 != null; var1 = (class185) this.field3050.method3590()) {
            var1.method3729();
        }
    }

    @ObfuscatedName("gv.m(Lge;ZB)V")
    public synchronized void method3438(class184 arg0, boolean arg1) {
        this.method3462();
        this.field3037.method3366(arg0.field2988);
        this.field3047 = arg1;
        this.field3035 = 0L;
        int var3 = this.field3037.method3389();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3037.method3370(var4);
            this.field3037.method3373(var4);
            this.field3037.method3371(var4);
        }
        this.field3048 = this.field3037.method3378();
        this.field3028 = this.field3037.field3003[this.field3048];
        this.field3051 = this.field3037.method3377(this.field3028);
    }

    @ObfuscatedName("gv.x(B)V")
    public synchronized void method3462() {
        this.field3037.method3399();
        this.method3512();
    }

    @ObfuscatedName("gv.u(I)Z")
    public synchronized boolean method3463() {
        return this.field3037.method3368();
    }

    @ObfuscatedName("gv.j(IIB)V")
    public synchronized void method3441(int arg0, int arg1) {
        this.method3442(arg0, arg1);
    }

    @ObfuscatedName("gv.q(IIB)V")
    public void method3442(int arg0, int arg1) {
        this.field3049[arg0] = arg1;
        this.field3034[arg0] = arg1 & 0xFFFFFF80;
        this.method3474(arg0, arg1);
    }

    @ObfuscatedName("gv.w(III)V")
    public void method3474(int arg0, int arg1) {
        if (this.field3033[arg0] != arg1) {
            this.field3033[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field3045[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("gv.b(IIII)V")
    public void method3443(int arg0, int arg1, int arg2) {
        this.method3445(arg0, arg1, 64);
        if ((this.field3038[arg0] & 0x2) != 0) {
            for (class191 var4 = (class191) this.field3052.field3065.method3618(); var4 != null; var4 = (class191) this.field3052.field3065.method3642()) {
                if (var4.field3072 == arg0 && var4.field3089 < 0) {
                    this.field3026[arg0][var4.field3074] = null;
                    this.field3026[arg0][arg1] = var4;
                    int var5 = (var4.field3079 * var4.field3078 >> 12) + var4.field3077;
                    var4.field3077 += arg1 - var4.field3074 << 8;
                    var4.field3078 = var5 - var4.field3077;
                    var4.field3079 = 4096;
                    var4.field3074 = arg1;
                    return;
                }
            }
        }
        class185 var6 = (class185) this.field3050.method3580((long) this.field3033[arg0]);
        if (var6 == null) {
            return;
        }
        class66 var7 = var6.field2993[arg1];
        if (var7 == null) {
            return;
        }
        class191 var8 = new class191();
        var8.field3072 = arg0;
        var8.field3070 = var6;
        var8.field3071 = var7;
        var8.field3083 = var6.field2995[arg1];
        var8.field3073 = var6.field2990[arg1];
        var8.field3074 = arg1;
        var8.field3075 = var6.field2992 * arg2 * arg2 * var6.field2996[arg1] + 1024 >> 11;
        var8.field3082 = var6.field2994[arg1] & 0xFF;
        var8.field3077 = (arg1 << 8) - (var6.field2998[arg1] & 0x7FFF);
        var8.field3080 = 0;
        var8.field3081 = 0;
        var8.field3087 = 0;
        var8.field3089 = -1;
        var8.field3069 = 0;
        if (this.field3041[arg0] == 0) {
            var8.field3076 = class68.method1328(var7, this.method3456(var8), this.method3490(var8), this.method3457(var8));
        } else {
            var8.field3076 = class68.method1328(var7, this.method3456(var8), 0, this.method3457(var8));
            this.method3471(var8, var6.field2998[arg1] < 0);
        }
        if (var6.field2998[arg1] < 0) {
            var8.field3076.method1391(-1);
        }
        if (var8.field3073 >= 0) {
            class191 var9 = this.field3045[arg0][var8.field3073];
            if (var9 != null && var9.field3089 < 0) {
                this.field3026[arg0][var9.field3074] = null;
                var9.field3089 = 0;
            }
            this.field3045[arg0][var8.field3073] = var8;
        }
        this.field3052.field3065.method3612(var8);
        this.field3026[arg0][arg1] = var8;
    }

    @ObfuscatedName("gv.p(Lgc;ZI)V")
    public void method3471(class191 arg0, boolean arg1) {
        int var3 = arg0.field3071.field1306.length;
        int var5;
        if (arg1 && arg0.field3071.field1303) {
            int var4 = var3 + var3 - arg0.field3071.field1305;
            var5 = (int) ((long) this.field3041[arg0.field3072] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field3076.method1337(true);
            }
        } else {
            var5 = (int) ((long) this.field3041[arg0.field3072] * (long) var3 >> 6);
        }
        arg0.field3076.method1387(var5);
    }

    @ObfuscatedName("gv.o(IIII)V")
    public void method3445(int arg0, int arg1, int arg2) {
        class191 var4 = this.field3026[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field3026[arg0][arg1] = null;
        if ((this.field3038[arg0] & 0x2) == 0) {
            var4.field3089 = 0;
            return;
        }
        for (class191 var5 = (class191) this.field3052.field3065.method3617(); var5 != null; var5 = (class191) this.field3052.field3065.method3632()) {
            if (var4.field3072 == var5.field3072 && var5.field3089 < 0 && var4 != var5) {
                var4.field3089 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("gv.y(IIII)V")
    public void method3446(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("gv.s(III)V")
    public void method3447(int arg0, int arg1) {
    }

    @ObfuscatedName("gv.e(III)V")
    public void method3507(int arg0, int arg1) {
        this.field3031[arg0] = arg1;
    }

    @ObfuscatedName("gv.h(IB)V")
    public void method3449(int arg0) {
        for (class191 var2 = (class191) this.field3052.field3065.method3617(); var2 != null; var2 = (class191) this.field3052.field3065.method3632()) {
            if (arg0 < 0 || var2.field3072 == arg0) {
                if (var2.field3076 != null) {
                    var2.field3076.method1414(Statics.field1266 / 100);
                    if (var2.field3076.method1345()) {
                        this.field3052.field3068.method1165(var2.field3076);
                    }
                    var2.method3534();
                }
                if (var2.field3089 < 0) {
                    this.field3026[var2.field3072][var2.field3074] = null;
                }
                var2.method3729();
            }
        }
    }

    @ObfuscatedName("gv.l(II)V")
    public void method3501(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3501(var2);
            }
            return;
        }
        this.field3029[arg0] = 12800;
        this.field3030[arg0] = 8192;
        this.field3046[arg0] = 16383;
        this.field3031[arg0] = 8192;
        this.field3036[arg0] = 0;
        this.field3032[arg0] = 8192;
        this.method3453(arg0);
        this.method3454(arg0);
        this.field3038[arg0] = 0;
        this.field3039[arg0] = 32767;
        this.field3044[arg0] = 256;
        this.field3041[arg0] = 0;
        this.method3491(arg0, 8192);
    }

    @ObfuscatedName("gv.c(II)V")
    public void method3451(int arg0) {
        for (class191 var2 = (class191) this.field3052.field3065.method3617(); var2 != null; var2 = (class191) this.field3052.field3065.method3632()) {
            if ((arg0 < 0 || var2.field3072 == arg0) && var2.field3089 < 0) {
                this.field3026[var2.field3072][var2.field3074] = null;
                var2.field3089 = 0;
            }
        }
    }

    @ObfuscatedName("gv.f(B)V")
    public void method3512() {
        this.method3449(-1);
        this.method3501(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field3033[var1] = this.field3049[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field3034[var2] = this.field3049[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("gv.at(II)V")
    public void method3453(int arg0) {
        if ((this.field3038[arg0] & 0x2) == 0) {
            return;
        }
        for (class191 var2 = (class191) this.field3052.field3065.method3617(); var2 != null; var2 = (class191) this.field3052.field3065.method3632()) {
            if (var2.field3072 == arg0 && this.field3026[arg0][var2.field3074] == null && var2.field3089 < 0) {
                var2.field3089 = 0;
            }
        }
    }

    @ObfuscatedName("gv.aw(IB)V")
    public void method3454(int arg0) {
        if ((this.field3038[arg0] & 0x4) == 0) {
            return;
        }
        for (class191 var2 = (class191) this.field3052.field3065.method3617(); var2 != null; var2 = (class191) this.field3052.field3065.method3632()) {
            if (var2.field3072 == arg0) {
                var2.field3091 = 0;
            }
        }
    }

    @ObfuscatedName("gv.ab(II)V")
    public void method3455(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3445(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3443(var6, var7, var8);
            } else {
                this.method3445(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3446(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field3034[var12] = (var14 << 14) + (this.field3034[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field3034[var12] = (var14 << 7) + (this.field3034[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field3036[var12] = (var14 << 7) + (this.field3036[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field3036[var12] = (this.field3036[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field3032[var12] = (var14 << 7) + (this.field3032[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field3032[var12] = (this.field3032[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field3029[var12] = (var14 << 7) + (this.field3029[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field3029[var12] = (this.field3029[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field3030[var12] = (var14 << 7) + (this.field3030[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field3030[var12] = (this.field3030[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field3046[var12] = (var14 << 7) + (this.field3046[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field3046[var12] = (this.field3046[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field3038[var12] |= 0x1;
                } else {
                    this.field3038[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field3038[var12] |= 0x2;
                } else {
                    this.method3453(var12);
                    this.field3038[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field3039[var12] = (var14 << 7) + (this.field3039[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field3039[var12] = (this.field3039[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field3039[var12] = (var14 << 7) + (this.field3039[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field3039[var12] = (this.field3039[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3449(var12);
            }
            if (var13 == 121) {
                this.method3501(var12);
            }
            if (var13 == 123) {
                this.method3451(var12);
            }
            if (var13 == 6) {
                int var15 = this.field3039[var12];
                if (var15 == 16384) {
                    this.field3044[var12] = (var14 << 7) + (this.field3044[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field3039[var12];
                if (var16 == 16384) {
                    this.field3044[var12] = (this.field3044[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field3041[var12] = (var14 << 7) + (this.field3041[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field3041[var12] = (this.field3041[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field3038[var12] |= 0x4;
                } else {
                    this.method3454(var12);
                    this.field3038[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3491(var12, (var14 << 7) + (this.field3042[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3491(var12, (this.field3042[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3474(var17, this.field3034[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3447(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method3507(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3512();
            }
        }
    }

    @ObfuscatedName("gv.ai(IIB)V")
    public void method3491(int arg0, int arg1) {
        this.field3042[arg0] = arg1;
        this.field3043[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("gv.az(Lgc;I)I")
    public int method3456(class191 arg0) {
        int var2 = (arg0.field3079 * arg0.field3078 >> 12) + arg0.field3077;
        int var3 = ((this.field3031[arg0.field3072] - 8192) * this.field3044[arg0.field3072] >> 12) + var2;
        class189 var4 = arg0.field3083;
        if (var4.field3057 > 0 && (var4.field3059 > 0 || this.field3036[arg0.field3072] > 0)) {
            int var5 = var4.field3059 << 2;
            int var6 = var4.field3061 << 1;
            if (arg0.field3085 < var6) {
                var5 = arg0.field3085 * var5 / var6;
            }
            int var7 = (this.field3036[arg0.field3072] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field3086 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field3071.field1304 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1266 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("gv.au(Lgc;I)I")
    public int method3490(class191 arg0) {
        class189 var2 = arg0.field3083;
        int var3 = this.field3046[arg0.field3072] * this.field3029[arg0.field3072] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field3075 * var4 + 16384 >> 15;
        int var6 = this.field3027 * var5 + 128 >> 8;
        if (var2.field3056 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field3080 * 1.953125E-5D * (double) var2.field3056) + 0.5D);
        }
        if (var2.field3062 != null) {
            int var7 = arg0.field3081;
            int var8 = var2.field3062[arg0.field3087 + 1];
            if (arg0.field3087 < var2.field3062.length - 2) {
                int var9 = (var2.field3062[arg0.field3087] & 0xFF) << 8;
                int var10 = (var2.field3062[arg0.field3087 + 2] & 0xFF) << 8;
                var8 += (var2.field3062[arg0.field3087 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field3089 > 0 && var2.field3054 != null) {
            int var11 = arg0.field3089;
            int var12 = var2.field3054[arg0.field3069 + 1];
            if (arg0.field3069 < var2.field3054.length - 2) {
                int var13 = (var2.field3054[arg0.field3069] & 0xFF) << 8;
                int var14 = (var2.field3054[arg0.field3069 + 2] & 0xFF) << 8;
                var12 += (var2.field3054[arg0.field3069 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("gv.ag(Lgc;B)I")
    public int method3457(class191 arg0) {
        int var2 = this.field3030[arg0.field3072];
        return var2 < 8192 ? arg0.field3082 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field3082) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("gv.t()Lbu;")
    public synchronized class70 method1208() {
        return this.field3052;
    }

    @ObfuscatedName("gv.n()Lbu;")
    public synchronized class70 method1171() {
        return null;
    }

    @ObfuscatedName("gv.i()I")
    public synchronized int method1172() {
        return 0;
    }

    @ObfuscatedName("gv.g([III)V")
    public synchronized void method1173(int[] arg0, int arg1, int arg2) {
        if (this.field3037.method3368()) {
            int var4 = this.field3040 * this.field3037.field3007 / Statics.field1266;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field3035;
                if (this.field3051 - var5 >= 0L) {
                    this.field3035 = var5;
                    break;
                }
                int var7 = (int) ((this.field3051 - this.field3035 + (long) var4 - 1L) / (long) var4);
                this.field3035 += (long) var4 * (long) var7;
                this.field3052.method1173(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3458();
            } while (this.field3037.method3368());
        }
        this.field3052.method1173(arg0, arg1, arg2);
    }

    @ObfuscatedName("gv.k(I)V")
    public synchronized void method1175(int arg0) {
        if (this.field3037.method3368()) {
            int var2 = this.field3040 * this.field3037.field3007 / Statics.field1266;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field3035;
                if (this.field3051 - var3 >= 0L) {
                    this.field3035 = var3;
                    break;
                }
                int var5 = (int) ((this.field3051 - this.field3035 + (long) var2 - 1L) / (long) var2);
                this.field3035 += (long) var2 * (long) var5;
                this.field3052.method1175(var5);
                arg0 -= var5;
                this.method3458();
            } while (this.field3037.method3368());
        }
        this.field3052.method1175(arg0);
    }

    @ObfuscatedName("gv.ae(I)V")
    public void method3458() {
        int var1 = this.field3048;
        int var2 = this.field3028;
        long var3 = this.field3051;
        while (this.field3028 == var2) {
            while (this.field3037.field3003[var1] == var2) {
                this.field3037.method3370(var1);
                int var5 = this.field3037.method3374(var1);
                if (var5 == 1) {
                    this.field3037.method3372();
                    this.field3037.method3371(var1);
                    if (this.field3037.method3379()) {
                        if (!this.field3047 || var2 == 0) {
                            this.method3512();
                            this.field3037.method3399();
                            return;
                        }
                        this.field3037.method3390(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3455(var5);
                }
                this.field3037.method3373(var1);
                this.field3037.method3371(var1);
            }
            var1 = this.field3037.method3378();
            var2 = this.field3037.field3003[var1];
            var3 = this.field3037.method3377(var2);
        }
        this.field3048 = var1;
        this.field3028 = var2;
        this.field3051 = var3;
    }

    @ObfuscatedName("gv.an(Lgc;I)Z")
    public boolean method3459(class191 arg0) {
        if (arg0.field3076 != null) {
            return false;
        }
        if (arg0.field3089 >= 0) {
            arg0.method3729();
            if (arg0.field3073 > 0 && this.field3045[arg0.field3072][arg0.field3073] == arg0) {
                this.field3045[arg0.field3072][arg0.field3073] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("gv.aj(Lgc;[IIII)Z")
    public boolean method3460(class191 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field3088 = Statics.field1266 / 100;
        if (arg0.field3089 >= 0 && arg0.field3076 == null || arg0.field3076.method1344()) {
            arg0.method3534();
            arg0.method3729();
            if (arg0.field3073 > 0 && this.field3045[arg0.field3072][arg0.field3073] == arg0) {
                this.field3045[arg0.field3072][arg0.field3073] = null;
            }
            return true;
        }
        int var5 = arg0.field3079;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field3032[arg0.field3072] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field3079 = var6;
        }
        arg0.field3076.method1330(this.method3456(arg0));
        class189 var7 = arg0.field3083;
        boolean var8 = false;
        arg0.field3085++;
        arg0.field3086 += var7.field3057;
        double var9 = (double) ((arg0.field3074 - 60 << 8) + (arg0.field3079 * arg0.field3078 >> 12)) * 5.086263020833333E-6D;
        if (var7.field3056 > 0) {
            if (var7.field3055 > 0) {
                arg0.field3080 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3055 * var9) + 0.5D);
            } else {
                arg0.field3080 += 128;
            }
        }
        if (var7.field3062 != null) {
            if (var7.field3060 > 0) {
                arg0.field3081 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3060 * var9) + 0.5D);
            } else {
                arg0.field3081 += 128;
            }
            while (arg0.field3087 < var7.field3062.length - 2 && arg0.field3081 > (var7.field3062[arg0.field3087 + 2] & 0xFF) << 8) {
                arg0.field3087 += 2;
            }
            if (arg0.field3087 == var7.field3062.length - 2 && var7.field3062[arg0.field3087 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field3089 >= 0 && var7.field3054 != null && (this.field3038[arg0.field3072] & 0x1) == 0 && (arg0.field3073 < 0 || this.field3045[arg0.field3072][arg0.field3073] != arg0)) {
            if (var7.field3053 > 0) {
                arg0.field3089 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3053 * var9) + 0.5D);
            } else {
                arg0.field3089 += 128;
            }
            while (arg0.field3069 < var7.field3054.length - 2 && arg0.field3089 > (var7.field3054[arg0.field3069 + 2] & 0xFF) << 8) {
                arg0.field3069 += 2;
            }
            if (arg0.field3069 == var7.field3054.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field3076.method1368(arg0.field3088, this.method3490(arg0), this.method3457(arg0));
            return false;
        }
        arg0.field3076.method1414(arg0.field3088);
        if (arg1 == null) {
            arg0.field3076.method1175(arg3);
        } else {
            arg0.field3076.method1173(arg1, arg2, arg3);
        }
        if (arg0.field3076.method1345()) {
            this.field3052.field3068.method1165(arg0.field3076);
        }
        arg0.method3534();
        if (arg0.field3089 >= 0) {
            arg0.method3729();
            if (arg0.field3073 > 0 && this.field3045[arg0.field3072][arg0.field3073] == arg0) {
                this.field3045[arg0.field3072][arg0.field3073] = null;
            }
        }
        return true;
    }
}
