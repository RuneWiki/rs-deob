package deob;

@ObfuscatedName("gi")
public class class188 extends class70 {

    @ObfuscatedName("gi.k")
    public class200 field3027 = new class200(128);

    @ObfuscatedName("gi.q")
    public int field3017 = 256;

    @ObfuscatedName("gi.f")
    public int field3018 = 1000000;

    @ObfuscatedName("gi.c")
    public int[] field3019 = new int[16];

    @ObfuscatedName("gi.v")
    public int[] field3020 = new int[16];

    @ObfuscatedName("gi.j")
    public int[] field3021 = new int[16];

    @ObfuscatedName("gi.m")
    public int[] field3039 = new int[16];

    @ObfuscatedName("gi.y")
    public int[] field3043 = new int[16];

    @ObfuscatedName("gi.u")
    public int[] field3024 = new int[16];

    @ObfuscatedName("gi.h")
    public int[] field3025 = new int[16];

    @ObfuscatedName("gi.l")
    public int[] field3034 = new int[16];

    @ObfuscatedName("gi.b")
    public int[] field3026 = new int[16];

    @ObfuscatedName("gi.a")
    public int[] field3036 = new int[16];

    @ObfuscatedName("gi.n")
    public int[] field3029 = new int[16];

    @ObfuscatedName("gi.z")
    public int[] field3030 = new int[16];

    @ObfuscatedName("gi.x")
    public int[] field3038 = new int[16];

    @ObfuscatedName("gi.d")
    public int[] field3032 = new int[16];

    @ObfuscatedName("gi.t")
    public int[] field3033 = new int[16];

    @ObfuscatedName("gi.o")
    public class191[][] field3023 = new class191[16][128];

    @ObfuscatedName("gi.aq")
    public class191[][] field3035 = new class191[16][128];

    @ObfuscatedName("gi.al")
    public class186 field3028 = new class186();

    @ObfuscatedName("gi.av")
    public boolean field3037;

    @ObfuscatedName("gi.ad")
    public int field3022;

    @ObfuscatedName("gi.at")
    public int field3031;

    @ObfuscatedName("gi.aj")
    public long field3040;

    @ObfuscatedName("gi.am")
    public long field3042;

    @ObfuscatedName("gi.ay")
    public class190 field3016 = new class190(this);

    public class188() {
        this.method3445();
    }

    @ObfuscatedName("gi.k(IS)V")
    public synchronized void method3425(int arg0) {
        this.field3017 = arg0;
    }

    @ObfuscatedName("gi.q(I)I")
    public int method3426() {
        return this.field3017;
    }

    @ObfuscatedName("gi.f(Lgx;Lfo;Lbc;II)Z")
    public synchronized boolean method3427(class184 arg0, class171 arg1, class63 arg2, int arg3) {
        arg0.method3330();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class201 var7 = (class201) arg0.field2979.method3577(); var7 != null; var7 = (class201) arg0.field2979.method3578()) {
            int var8 = (int) var7.field3166;
            class185 var9 = (class185) this.field3027.method3580((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method3102(var8);
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
                this.field3027.method3574(var11, (long) var8);
            }
            if (!var9.method3342(arg2, var7.field3145, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3331();
        }
        return var5;
    }

    @ObfuscatedName("gi.c(I)V")
    public synchronized void method3428() {
        for (class185 var1 = (class185) this.field3027.method3577(); var1 != null; var1 = (class185) this.field3027.method3578()) {
            var1.method3343();
        }
    }

    @ObfuscatedName("gi.v(I)V")
    public synchronized void method3491() {
        for (class185 var1 = (class185) this.field3027.method3577(); var1 != null; var1 = (class185) this.field3027.method3578()) {
            var1.method3703();
        }
    }

    @ObfuscatedName("gi.h(Lgx;ZB)V")
    public synchronized void method3474(class184 arg0, boolean arg1) {
        this.method3504();
        this.field3028.method3350(arg0.field2980);
        this.field3037 = arg1;
        this.field3040 = 0L;
        int var3 = this.field3028.method3353();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3028.method3377(var4);
            this.field3028.method3357(var4);
            this.field3028.method3355(var4);
        }
        this.field3022 = this.field3028.method3378();
        this.field3031 = this.field3028.field2999[this.field3022];
        this.field3042 = this.field3028.method3361(this.field3031);
    }

    @ObfuscatedName("gi.b(I)V")
    public synchronized void method3504() {
        this.field3028.method3351();
        this.method3445();
    }

    @ObfuscatedName("gi.g(I)Z")
    public synchronized boolean method3432() {
        return this.field3028.method3352();
    }

    @ObfuscatedName("gi.e(IIB)V")
    public synchronized void method3433(int arg0, int arg1) {
        this.method3434(arg0, arg1);
    }

    @ObfuscatedName("gi.p(III)V")
    public void method3434(int arg0, int arg1) {
        this.field3039[arg0] = arg1;
        this.field3024[arg0] = arg1 & 0xFFFFFF80;
        this.method3435(arg0, arg1);
    }

    @ObfuscatedName("gi.s(III)V")
    public void method3435(int arg0, int arg1) {
        if (this.field3043[arg0] != arg1) {
            this.field3043[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field3035[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("gi.w(IIII)V")
    public void method3436(int arg0, int arg1, int arg2) {
        this.method3438(arg0, arg1, 64);
        if ((this.field3036[arg0] & 0x2) != 0) {
            for (class191 var4 = (class191) this.field3016.field3056.method3604(); var4 != null; var4 = (class191) this.field3016.field3056.method3608()) {
                if (var4.field3072 == arg0 && var4.field3062 < 0) {
                    this.field3023[arg0][var4.field3064] = null;
                    this.field3023[arg0][arg1] = var4;
                    int var5 = (var4.field3081 * var4.field3069 >> 12) + var4.field3067;
                    var4.field3067 += arg1 - var4.field3064 << 8;
                    var4.field3081 = var5 - var4.field3067;
                    var4.field3069 = 4096;
                    var4.field3064 = arg1;
                    return;
                }
            }
        }
        class185 var6 = (class185) this.field3027.method3580((long) this.field3043[arg0]);
        if (var6 == null) {
            return;
        }
        class66 var7 = var6.field2982[arg1];
        if (var7 == null) {
            return;
        }
        class191 var8 = new class191();
        var8.field3072 = arg0;
        var8.field3060 = var6;
        var8.field3061 = var7;
        var8.field3059 = var6.field2986[arg1];
        var8.field3063 = var6.field2985[arg1];
        var8.field3064 = arg1;
        var8.field3073 = var6.field2987 * arg2 * arg2 * var6.field2984[arg1] + 1024 >> 11;
        var8.field3065 = var6.field2981[arg1] & 0xFF;
        var8.field3067 = (arg1 << 8) - (var6.field2983[arg1] & 0x7FFF);
        var8.field3070 = 0;
        var8.field3071 = 0;
        var8.field3066 = 0;
        var8.field3062 = -1;
        var8.field3068 = 0;
        if (this.field3038[arg0] == 0) {
            var8.field3077 = class68.method1412(var7, this.method3512(var8), this.method3495(var8), this.method3452(var8));
        } else {
            var8.field3077 = class68.method1412(var7, this.method3512(var8), 0, this.method3452(var8));
            this.method3494(var8, var6.field2983[arg1] < 0);
        }
        if (var6.field2983[arg1] < 0) {
            var8.field3077.method1312(-1);
        }
        if (var8.field3063 >= 0) {
            class191 var9 = this.field3035[arg0][var8.field3063];
            if (var9 != null && var9.field3062 < 0) {
                this.field3023[arg0][var9.field3064] = null;
                var9.field3062 = 0;
            }
            this.field3035[arg0][var8.field3063] = var8;
        }
        this.field3016.field3056.method3596(var8);
        this.field3023[arg0][arg1] = var8;
    }

    @ObfuscatedName("gi.i(Lgr;ZB)V")
    public void method3494(class191 arg0, boolean arg1) {
        int var3 = arg0.field3061.field1293.length;
        int var5;
        if (arg1 && arg0.field3061.field1294) {
            int var4 = var3 + var3 - arg0.field3061.field1292;
            var5 = (int) ((long) this.field3038[arg0.field3072] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field3077.method1319(true);
            }
        } else {
            var5 = (int) ((long) this.field3038[arg0.field3072] * (long) var3 >> 6);
        }
        arg0.field3077.method1318(var5);
    }

    @ObfuscatedName("gi.r(IIII)V")
    public void method3438(int arg0, int arg1, int arg2) {
        class191 var4 = this.field3023[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field3023[arg0][arg1] = null;
        if ((this.field3036[arg0] & 0x2) == 0) {
            var4.field3062 = 0;
            return;
        }
        for (class191 var5 = (class191) this.field3016.field3056.method3616(); var5 != null; var5 = (class191) this.field3016.field3056.method3603()) {
            if (var4.field3072 == var5.field3072 && var5.field3062 < 0 && var4 != var5) {
                var4.field3062 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("gi.a(IIII)V")
    public void method3439(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("gi.n(III)V")
    public void method3424(int arg0, int arg1) {
    }

    @ObfuscatedName("gi.z(III)V")
    public void method3441(int arg0, int arg1) {
        this.field3025[arg0] = arg1;
    }

    @ObfuscatedName("gi.x(II)V")
    public void method3507(int arg0) {
        for (class191 var2 = (class191) this.field3016.field3056.method3616(); var2 != null; var2 = (class191) this.field3016.field3056.method3603()) {
            if (arg0 < 0 || var2.field3072 == arg0) {
                if (var2.field3077 != null) {
                    var2.field3077.method1323(Statics.field1250 / 100);
                    if (var2.field3077.method1347()) {
                        this.field3016.field3058.method1142(var2.field3077);
                    }
                    var2.method3526();
                }
                if (var2.field3062 < 0) {
                    this.field3023[var2.field3072][var2.field3064] = null;
                }
                var2.method3703();
            }
        }
    }

    @ObfuscatedName("gi.d(IB)V")
    public void method3475(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3475(var2);
            }
            return;
        }
        this.field3019[arg0] = 12800;
        this.field3020[arg0] = 8192;
        this.field3021[arg0] = 16383;
        this.field3025[arg0] = 8192;
        this.field3034[arg0] = 0;
        this.field3026[arg0] = 8192;
        this.method3509(arg0);
        this.method3456(arg0);
        this.field3036[arg0] = 0;
        this.field3029[arg0] = 32767;
        this.field3030[arg0] = 256;
        this.field3038[arg0] = 0;
        this.method3449(arg0, 8192);
    }

    @ObfuscatedName("gi.t(II)V")
    public void method3444(int arg0) {
        for (class191 var2 = (class191) this.field3016.field3056.method3616(); var2 != null; var2 = (class191) this.field3016.field3056.method3603()) {
            if ((arg0 < 0 || var2.field3072 == arg0) && var2.field3062 < 0) {
                this.field3023[var2.field3072][var2.field3064] = null;
                var2.field3062 = 0;
            }
        }
    }

    @ObfuscatedName("gi.aa(B)V")
    public void method3445() {
        this.method3507(-1);
        this.method3475(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field3043[var1] = this.field3039[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field3024[var2] = this.field3039[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("gi.ak(IB)V")
    public void method3509(int arg0) {
        if ((this.field3036[arg0] & 0x2) == 0) {
            return;
        }
        for (class191 var2 = (class191) this.field3016.field3056.method3616(); var2 != null; var2 = (class191) this.field3016.field3056.method3603()) {
            if (var2.field3072 == arg0 && this.field3023[arg0][var2.field3064] == null && var2.field3062 < 0) {
                var2.field3062 = 0;
            }
        }
    }

    @ObfuscatedName("gi.ar(II)V")
    public void method3456(int arg0) {
        if ((this.field3036[arg0] & 0x4) == 0) {
            return;
        }
        for (class191 var2 = (class191) this.field3016.field3056.method3616(); var2 != null; var2 = (class191) this.field3016.field3056.method3603()) {
            if (var2.field3072 == arg0) {
                var2.field3079 = 0;
            }
        }
    }

    @ObfuscatedName("gi.aw(II)V")
    public void method3448(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3438(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3436(var6, var7, var8);
            } else {
                this.method3438(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3439(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field3024[var12] = (var14 << 14) + (this.field3024[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field3024[var12] = (var14 << 7) + (this.field3024[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field3034[var12] = (var14 << 7) + (this.field3034[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field3034[var12] = (this.field3034[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field3026[var12] = (var14 << 7) + (this.field3026[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field3026[var12] = (this.field3026[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field3019[var12] = (var14 << 7) + (this.field3019[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field3019[var12] = (this.field3019[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field3020[var12] = (var14 << 7) + (this.field3020[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field3020[var12] = (this.field3020[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field3021[var12] = (var14 << 7) + (this.field3021[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field3021[var12] = (this.field3021[var12] & 0xFFFFFF80) + var14;
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
                    this.method3509(var12);
                    this.field3036[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field3029[var12] = (var14 << 7) + (this.field3029[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field3029[var12] = (this.field3029[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field3029[var12] = (var14 << 7) + (this.field3029[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field3029[var12] = (this.field3029[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3507(var12);
            }
            if (var13 == 121) {
                this.method3475(var12);
            }
            if (var13 == 123) {
                this.method3444(var12);
            }
            if (var13 == 6) {
                int var15 = this.field3029[var12];
                if (var15 == 16384) {
                    this.field3030[var12] = (var14 << 7) + (this.field3030[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field3029[var12];
                if (var16 == 16384) {
                    this.field3030[var12] = (this.field3030[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field3038[var12] = (var14 << 7) + (this.field3038[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field3038[var12] = (this.field3038[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field3036[var12] |= 0x4;
                } else {
                    this.method3456(var12);
                    this.field3036[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3449(var12, (var14 << 7) + (this.field3032[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3449(var12, (this.field3032[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3435(var17, this.field3024[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3424(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method3441(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3445();
            }
        }
    }

    @ObfuscatedName("gi.ai(IIB)V")
    public void method3449(int arg0, int arg1) {
        this.field3032[arg0] = arg1;
        this.field3033[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("gi.af(Lgr;B)I")
    public int method3512(class191 arg0) {
        int var2 = (arg0.field3081 * arg0.field3069 >> 12) + arg0.field3067;
        int var3 = ((this.field3025[arg0.field3072] - 8192) * this.field3030[arg0.field3072] >> 12) + var2;
        class189 var4 = arg0.field3059;
        if (var4.field3047 > 0 && (var4.field3052 > 0 || this.field3034[arg0.field3072] > 0)) {
            int var5 = var4.field3052 << 2;
            int var6 = var4.field3054 << 1;
            if (arg0.field3075 < var6) {
                var5 = arg0.field3075 * var5 / var6;
            }
            int var7 = (this.field3034[arg0.field3072] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field3076 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field3061.field1291 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1250 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("gi.an(Lgr;I)I")
    public int method3495(class191 arg0) {
        class189 var2 = arg0.field3059;
        int var3 = this.field3021[arg0.field3072] * this.field3019[arg0.field3072] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field3073 * var4 + 16384 >> 15;
        int var6 = this.field3017 * var5 + 128 >> 8;
        if (var2.field3048 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field3070 * 1.953125E-5D * (double) var2.field3048) + 0.5D);
        }
        if (var2.field3055 != null) {
            int var7 = arg0.field3071;
            int var8 = var2.field3055[arg0.field3066 + 1];
            if (arg0.field3066 < var2.field3055.length - 2) {
                int var9 = (var2.field3055[arg0.field3066] & 0xFF) << 8;
                int var10 = (var2.field3055[arg0.field3066 + 2] & 0xFF) << 8;
                var8 += (var2.field3055[arg0.field3066 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field3062 > 0 && var2.field3046 != null) {
            int var11 = arg0.field3062;
            int var12 = var2.field3046[arg0.field3068 + 1];
            if (arg0.field3068 < var2.field3046.length - 2) {
                int var13 = (var2.field3046[arg0.field3068] & 0xFF) << 8;
                int var14 = (var2.field3046[arg0.field3068 + 2] & 0xFF) << 8;
                var12 += (var2.field3046[arg0.field3068 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("gi.au(Lgr;I)I")
    public int method3452(class191 arg0) {
        int var2 = this.field3020[arg0.field3072];
        return var2 < 8192 ? arg0.field3065 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field3065) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("gi.j()Lbf;")
    public synchronized class70 method1151() {
        return this.field3016;
    }

    @ObfuscatedName("gi.m()Lbf;")
    public synchronized class70 method1148() {
        return null;
    }

    @ObfuscatedName("gi.y()I")
    public synchronized int method1149() {
        return 0;
    }

    @ObfuscatedName("gi.u([III)V")
    public synchronized void method1150(int[] arg0, int arg1, int arg2) {
        if (this.field3028.method3352()) {
            int var4 = this.field3018 * this.field3028.field2993 / Statics.field1250;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field3040;
                if (this.field3042 - var5 >= 0L) {
                    this.field3040 = var5;
                    break;
                }
                int var7 = (int) ((this.field3042 - this.field3040 + (long) var4 - 1L) / (long) var4);
                this.field3040 += (long) var4 * (long) var7;
                this.field3016.method1150(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3453();
            } while (this.field3028.method3352());
        }
        this.field3016.method1150(arg0, arg1, arg2);
    }

    @ObfuscatedName("gi.l(I)V")
    public synchronized void method1152(int arg0) {
        if (this.field3028.method3352()) {
            int var2 = this.field3018 * this.field3028.field2993 / Statics.field1250;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field3040;
                if (this.field3042 - var3 >= 0L) {
                    this.field3040 = var3;
                    break;
                }
                int var5 = (int) ((this.field3042 - this.field3040 + (long) var2 - 1L) / (long) var2);
                this.field3040 += (long) var2 * (long) var5;
                this.field3016.method1152(var5);
                arg0 -= var5;
                this.method3453();
            } while (this.field3028.method3352());
        }
        this.field3016.method1152(arg0);
    }

    @ObfuscatedName("gi.ac(I)V")
    public void method3453() {
        int var1 = this.field3022;
        int var2 = this.field3031;
        long var3 = this.field3042;
        while (this.field3031 == var2) {
            while (this.field3028.field2999[var1] == var2) {
                this.field3028.method3377(var1);
                int var5 = this.field3028.method3358(var1);
                if (var5 == 1) {
                    this.field3028.method3356();
                    this.field3028.method3355(var1);
                    if (this.field3028.method3370()) {
                        if (!this.field3037 || var2 == 0) {
                            this.method3445();
                            this.field3028.method3351();
                            return;
                        }
                        this.field3028.method3364(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3448(var5);
                }
                this.field3028.method3357(var1);
                this.field3028.method3355(var1);
            }
            var1 = this.field3028.method3378();
            var2 = this.field3028.field2999[var1];
            var3 = this.field3028.method3361(var2);
        }
        this.field3022 = var1;
        this.field3031 = var2;
        this.field3042 = var3;
    }

    @ObfuscatedName("gi.ae(Lgr;B)Z")
    public boolean method3454(class191 arg0) {
        if (arg0.field3077 != null) {
            return false;
        }
        if (arg0.field3062 >= 0) {
            arg0.method3703();
            if (arg0.field3063 > 0 && this.field3035[arg0.field3072][arg0.field3063] == arg0) {
                this.field3035[arg0.field3072][arg0.field3063] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("gi.az(Lgr;[IIIB)Z")
    public boolean method3455(class191 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field3078 = Statics.field1250 / 100;
        if (arg0.field3062 >= 0 && arg0.field3077 == null || arg0.field3077.method1326()) {
            arg0.method3526();
            arg0.method3703();
            if (arg0.field3063 > 0 && this.field3035[arg0.field3072][arg0.field3063] == arg0) {
                this.field3035[arg0.field3072][arg0.field3063] = null;
            }
            return true;
        }
        int var5 = arg0.field3069;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field3026[arg0.field3072] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field3069 = var6;
        }
        arg0.field3077.method1324(this.method3512(arg0));
        class189 var7 = arg0.field3059;
        boolean var8 = false;
        arg0.field3075++;
        arg0.field3076 += var7.field3047;
        double var9 = (double) ((arg0.field3064 - 60 << 8) + (arg0.field3081 * arg0.field3069 >> 12)) * 5.086263020833333E-6D;
        if (var7.field3048 > 0) {
            if (var7.field3051 > 0) {
                arg0.field3070 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3051 * var9) + 0.5D);
            } else {
                arg0.field3070 += 128;
            }
        }
        if (var7.field3055 != null) {
            if (var7.field3049 > 0) {
                arg0.field3071 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3049 * var9) + 0.5D);
            } else {
                arg0.field3071 += 128;
            }
            while (arg0.field3066 < var7.field3055.length - 2 && arg0.field3071 > (var7.field3055[arg0.field3066 + 2] & 0xFF) << 8) {
                arg0.field3066 += 2;
            }
            if (arg0.field3066 == var7.field3055.length - 2 && var7.field3055[arg0.field3066 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field3062 >= 0 && var7.field3046 != null && (this.field3036[arg0.field3072] & 0x1) == 0 && (arg0.field3063 < 0 || this.field3035[arg0.field3072][arg0.field3063] != arg0)) {
            if (var7.field3050 > 0) {
                arg0.field3062 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3050 * var9) + 0.5D);
            } else {
                arg0.field3062 += 128;
            }
            while (arg0.field3068 < var7.field3046.length - 2 && arg0.field3062 > (var7.field3046[arg0.field3068 + 2] & 0xFF) << 8) {
                arg0.field3068 += 2;
            }
            if (arg0.field3068 == var7.field3046.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field3077.method1322(arg0.field3078, this.method3495(arg0), this.method3452(arg0));
            return false;
        }
        arg0.field3077.method1323(arg0.field3078);
        if (arg1 == null) {
            arg0.field3077.method1152(arg3);
        } else {
            arg0.field3077.method1150(arg1, arg2, arg3);
        }
        if (arg0.field3077.method1347()) {
            this.field3016.field3058.method1142(arg0.field3077);
        }
        arg0.method3526();
        if (arg0.field3062 >= 0) {
            arg0.method3703();
            if (arg0.field3063 > 0 && this.field3035[arg0.field3072][arg0.field3063] == arg0) {
                this.field3035[arg0.field3072][arg0.field3063] = null;
            }
        }
        return true;
    }
}
