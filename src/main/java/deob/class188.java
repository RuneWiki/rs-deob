package deob;

@ObfuscatedName("gj")
public class class188 extends class70 {

    @ObfuscatedName("gj.m")
    public class200 field3017 = new class200(128);

    @ObfuscatedName("gj.e")
    public int field3015 = 256;

    @ObfuscatedName("gj.o")
    public int field3040 = 1000000;

    @ObfuscatedName("gj.g")
    public int[] field3022 = new int[16];

    @ObfuscatedName("gj.l")
    public int[] field3018 = new int[16];

    @ObfuscatedName("gj.j")
    public int[] field3014 = new int[16];

    @ObfuscatedName("gj.r")
    public int[] field3032 = new int[16];

    @ObfuscatedName("gj.x")
    public int[] field3021 = new int[16];

    @ObfuscatedName("gj.k")
    public int[] field3030 = new int[16];

    @ObfuscatedName("gj.v")
    public int[] field3023 = new int[16];

    @ObfuscatedName("gj.h")
    public int[] field3024 = new int[16];

    @ObfuscatedName("gj.u")
    public int[] field3025 = new int[16];

    @ObfuscatedName("gj.t")
    public int[] field3019 = new int[16];

    @ObfuscatedName("gj.c")
    public int[] field3027 = new int[16];

    @ObfuscatedName("gj.z")
    public int[] field3028 = new int[16];

    @ObfuscatedName("gj.n")
    public int[] field3029 = new int[16];

    @ObfuscatedName("gj.q")
    public int[] field3020 = new int[16];

    @ObfuscatedName("gj.a")
    public int[] field3035 = new int[16];

    @ObfuscatedName("gj.b")
    public class191[][] field3036 = new class191[16][128];

    @ObfuscatedName("gj.aj")
    public class191[][] field3033 = new class191[16][128];

    @ObfuscatedName("gj.an")
    public class186 field3034 = new class186();

    @ObfuscatedName("gj.ap")
    public boolean field3037;

    @ObfuscatedName("gj.ar")
    public int field3016;

    @ObfuscatedName("gj.ab")
    public int field3031;

    @ObfuscatedName("gj.ai")
    public long field3038;

    @ObfuscatedName("gj.aa")
    public long field3039;

    @ObfuscatedName("gj.ax")
    public class190 field3026 = new class190(this);

    public class188() {
        this.method3450();
    }

    @ObfuscatedName("gj.m(II)V")
    public synchronized void method3430(int arg0) {
        this.field3015 = arg0;
    }

    @ObfuscatedName("gj.w(I)I")
    public int method3431() {
        return this.field3015;
    }

    @ObfuscatedName("gj.e(Lgl;Lfa;Lby;II)Z")
    public synchronized boolean method3457(class184 arg0, class171 arg1, class63 arg2, int arg3) {
        arg0.method3352();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class201 var7 = (class201) arg0.field2978.method3586(); var7 != null; var7 = (class201) arg0.field2978.method3591()) {
            int var8 = (int) var7.field3168;
            class185 var9 = (class185) this.field3017.method3595((long) var8);
            if (var9 == null) {
                var9 = class185.method2715(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field3017.method3588(var9, (long) var8);
            }
            if (!var9.method3354(arg2, var7.field3146, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3346();
        }
        return var5;
    }

    @ObfuscatedName("gj.o(B)V")
    public synchronized void method3433() {
        for (class185 var1 = (class185) this.field3017.method3586(); var1 != null; var1 = (class185) this.field3017.method3591()) {
            var1.method3357();
        }
    }

    @ObfuscatedName("gj.g(I)V")
    public synchronized void method3527() {
        for (class185 var1 = (class185) this.field3017.method3586(); var1 != null; var1 = (class185) this.field3017.method3591()) {
            var1.method3729();
        }
    }

    @ObfuscatedName("gj.k(Lgl;ZI)V")
    public synchronized void method3481(class184 arg0, boolean arg1) {
        this.method3509();
        this.field3034.method3368(arg0.field2977);
        this.field3037 = arg1;
        this.field3038 = 0L;
        int var3 = this.field3034.method3366();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3034.method3367(var4);
            this.field3034.method3370(var4);
            this.field3034.method3404(var4);
        }
        this.field3016 = this.field3034.method3374();
        this.field3031 = this.field3034.field2995[this.field3016];
        this.field3039 = this.field3034.method3373(this.field3031);
    }

    @ObfuscatedName("gj.h(B)V")
    public synchronized void method3509() {
        this.field3034.method3385();
        this.method3450();
    }

    @ObfuscatedName("gj.u(I)Z")
    public synchronized boolean method3437() {
        return this.field3034.method3365();
    }

    @ObfuscatedName("gj.y(IIB)V")
    public synchronized void method3524(int arg0, int arg1) {
        this.method3439(arg0, arg1);
    }

    @ObfuscatedName("gj.p(III)V")
    public void method3439(int arg0, int arg1) {
        this.field3032[arg0] = arg1;
        this.field3030[arg0] = arg1 & 0xFFFFFF80;
        this.method3440(arg0, arg1);
    }

    @ObfuscatedName("gj.s(III)V")
    public void method3440(int arg0, int arg1) {
        if (this.field3021[arg0] != arg1) {
            this.field3021[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field3033[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("gj.f(IIIS)V")
    public void method3467(int arg0, int arg1, int arg2) {
        this.method3472(arg0, arg1, 64);
        if ((this.field3019[arg0] & 0x2) != 0) {
            for (class191 var4 = (class191) this.field3026.field3052.method3622(); var4 != null; var4 = (class191) this.field3026.field3052.method3637()) {
                if (var4.field3062 == arg0 && var4.field3071 < 0) {
                    this.field3036[arg0][var4.field3068] = null;
                    this.field3036[arg0][arg1] = var4;
                    int var5 = (var4.field3079 * var4.field3067 >> 12) + var4.field3065;
                    var4.field3065 += arg1 - var4.field3068 << 8;
                    var4.field3079 = var5 - var4.field3065;
                    var4.field3067 = 4096;
                    var4.field3068 = arg1;
                    return;
                }
            }
        }
        class185 var6 = (class185) this.field3017.method3595((long) this.field3021[arg0]);
        if (var6 == null) {
            return;
        }
        class66 var7 = var6.field2981[arg1];
        if (var7 == null) {
            return;
        }
        class191 var8 = new class191();
        var8.field3062 = arg0;
        var8.field3057 = var6;
        var8.field3060 = var7;
        var8.field3061 = var6.field2984[arg1];
        var8.field3066 = var6.field2985[arg1];
        var8.field3068 = arg1;
        var8.field3063 = var6.field2990 * arg2 * arg2 * var6.field2982[arg1] + 1024 >> 11;
        var8.field3059 = var6.field2983[arg1] & 0xFF;
        var8.field3065 = (arg1 << 8) - (var6.field2987[arg1] & 0x7FFF);
        var8.field3077 = 0;
        var8.field3069 = 0;
        var8.field3070 = 0;
        var8.field3071 = -1;
        var8.field3072 = 0;
        if (this.field3029[arg0] == 0) {
            var8.field3058 = class68.method1356(var7, this.method3434(var8), this.method3456(var8), this.method3528(var8));
        } else {
            var8.field3058 = class68.method1356(var7, this.method3434(var8), 0, this.method3528(var8));
            this.method3442(var8, var6.field2987[arg1] < 0);
        }
        if (var6.field2987[arg1] < 0) {
            var8.field3058.method1358(-1);
        }
        if (var8.field3066 >= 0) {
            class191 var9 = this.field3033[arg0][var8.field3066];
            if (var9 != null && var9.field3071 < 0) {
                this.field3036[arg0][var9.field3068] = null;
                var9.field3071 = 0;
            }
            this.field3033[arg0][var8.field3066] = var8;
        }
        this.field3026.field3052.method3616(var8);
        this.field3036[arg0][arg1] = var8;
    }

    @ObfuscatedName("gj.i(Lgo;ZI)V")
    public void method3442(class191 arg0, boolean arg1) {
        int var3 = arg0.field3060.field1306.length;
        int var5;
        if (arg1 && arg0.field3060.field1305) {
            int var4 = var3 + var3 - arg0.field3060.field1309;
            var5 = (int) ((long) this.field3029[arg0.field3062] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field3058.method1365(true);
            }
        } else {
            var5 = (int) ((long) this.field3029[arg0.field3062] * (long) var3 >> 6);
        }
        arg0.field3058.method1447(var5);
    }

    @ObfuscatedName("gj.d(IIII)V")
    public void method3472(int arg0, int arg1, int arg2) {
        class191 var4 = this.field3036[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field3036[arg0][arg1] = null;
        if ((this.field3019[arg0] & 0x2) == 0) {
            var4.field3071 = 0;
            return;
        }
        for (class191 var5 = (class191) this.field3026.field3052.method3621(); var5 != null; var5 = (class191) this.field3026.field3052.method3630()) {
            if (var4.field3062 == var5.field3062 && var5.field3071 < 0 && var4 != var5) {
                var4.field3071 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("gj.t(IIII)V")
    public void method3444(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("gj.c(IIB)V")
    public void method3474(int arg0, int arg1) {
    }

    @ObfuscatedName("gj.z(III)V")
    public void method3446(int arg0, int arg1) {
        this.field3023[arg0] = arg1;
    }

    @ObfuscatedName("gj.n(IB)V")
    public void method3447(int arg0) {
        for (class191 var2 = (class191) this.field3026.field3052.method3621(); var2 != null; var2 = (class191) this.field3026.field3052.method3630()) {
            if (arg0 < 0 || var2.field3062 == arg0) {
                if (var2.field3058 != null) {
                    var2.field3058.method1369(Statics.field1269 / 100);
                    if (var2.field3058.method1373()) {
                        this.field3026.field3053.method1170(var2.field3058);
                    }
                    var2.method3536();
                }
                if (var2.field3071 < 0) {
                    this.field3036[var2.field3062][var2.field3068] = null;
                }
                var2.method3729();
            }
        }
    }

    @ObfuscatedName("gj.q(IB)V")
    public void method3448(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3448(var2);
            }
            return;
        }
        this.field3022[arg0] = 12800;
        this.field3018[arg0] = 8192;
        this.field3014[arg0] = 16383;
        this.field3023[arg0] = 8192;
        this.field3024[arg0] = 0;
        this.field3025[arg0] = 8192;
        this.method3451(arg0);
        this.method3452(arg0);
        this.field3019[arg0] = 0;
        this.field3027[arg0] = 32767;
        this.field3028[arg0] = 256;
        this.field3029[arg0] = 0;
        this.method3454(arg0, 8192);
    }

    @ObfuscatedName("gj.a(II)V")
    public void method3429(int arg0) {
        for (class191 var2 = (class191) this.field3026.field3052.method3621(); var2 != null; var2 = (class191) this.field3026.field3052.method3630()) {
            if ((arg0 < 0 || var2.field3062 == arg0) && var2.field3071 < 0) {
                this.field3036[var2.field3062][var2.field3068] = null;
                var2.field3071 = 0;
            }
        }
    }

    @ObfuscatedName("gj.at(B)V")
    public void method3450() {
        this.method3447(-1);
        this.method3448(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field3021[var1] = this.field3032[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field3030[var2] = this.field3032[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("gj.aw(IB)V")
    public void method3451(int arg0) {
        if ((this.field3019[arg0] & 0x2) == 0) {
            return;
        }
        for (class191 var2 = (class191) this.field3026.field3052.method3621(); var2 != null; var2 = (class191) this.field3026.field3052.method3630()) {
            if (var2.field3062 == arg0 && this.field3036[arg0][var2.field3068] == null && var2.field3071 < 0) {
                var2.field3071 = 0;
            }
        }
    }

    @ObfuscatedName("gj.ay(II)V")
    public void method3452(int arg0) {
        if ((this.field3019[arg0] & 0x4) == 0) {
            return;
        }
        for (class191 var2 = (class191) this.field3026.field3052.method3621(); var2 != null; var2 = (class191) this.field3026.field3052.method3630()) {
            if (var2.field3062 == arg0) {
                var2.field3076 = 0;
            }
        }
    }

    @ObfuscatedName("gj.al(II)V")
    public void method3453(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3472(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3467(var6, var7, var8);
            } else {
                this.method3472(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3444(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field3030[var12] = (var14 << 14) + (this.field3030[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field3030[var12] = (var14 << 7) + (this.field3030[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field3024[var12] = (var14 << 7) + (this.field3024[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field3024[var12] = (this.field3024[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field3025[var12] = (var14 << 7) + (this.field3025[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field3025[var12] = (this.field3025[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field3022[var12] = (var14 << 7) + (this.field3022[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field3022[var12] = (this.field3022[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field3018[var12] = (var14 << 7) + (this.field3018[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field3018[var12] = (this.field3018[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field3014[var12] = (var14 << 7) + (this.field3014[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field3014[var12] = (this.field3014[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field3019[var12] |= 0x1;
                } else {
                    this.field3019[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field3019[var12] |= 0x2;
                } else {
                    this.method3451(var12);
                    this.field3019[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field3027[var12] = (var14 << 7) + (this.field3027[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field3027[var12] = (this.field3027[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field3027[var12] = (var14 << 7) + (this.field3027[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field3027[var12] = (this.field3027[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3447(var12);
            }
            if (var13 == 121) {
                this.method3448(var12);
            }
            if (var13 == 123) {
                this.method3429(var12);
            }
            if (var13 == 6) {
                int var15 = this.field3027[var12];
                if (var15 == 16384) {
                    this.field3028[var12] = (var14 << 7) + (this.field3028[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field3027[var12];
                if (var16 == 16384) {
                    this.field3028[var12] = (this.field3028[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field3029[var12] = (var14 << 7) + (this.field3029[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field3029[var12] = (this.field3029[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field3019[var12] |= 0x4;
                } else {
                    this.method3452(var12);
                    this.field3019[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3454(var12, (var14 << 7) + (this.field3020[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3454(var12, (this.field3020[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3440(var17, this.field3030[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3474(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method3446(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3450();
            }
        }
    }

    @ObfuscatedName("gj.as(III)V")
    public void method3454(int arg0, int arg1) {
        this.field3020[arg0] = arg1;
        this.field3035[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("gj.ac(Lgo;I)I")
    public int method3434(class191 arg0) {
        int var2 = (arg0.field3079 * arg0.field3067 >> 12) + arg0.field3065;
        int var3 = ((this.field3023[arg0.field3062] - 8192) * this.field3028[arg0.field3062] >> 12) + var2;
        class189 var4 = arg0.field3061;
        if (var4.field3042 > 0 && (var4.field3048 > 0 || this.field3024[arg0.field3062] > 0)) {
            int var5 = var4.field3048 << 2;
            int var6 = var4.field3047 << 1;
            if (arg0.field3075 < var6) {
                var5 = arg0.field3075 * var5 / var6;
            }
            int var7 = (this.field3024[arg0.field3062] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field3074 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field3060.field1307 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1269 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("gj.au(Lgo;I)I")
    public int method3456(class191 arg0) {
        class189 var2 = arg0.field3061;
        int var3 = this.field3022[arg0.field3062] * this.field3014[arg0.field3062] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field3063 * var4 + 16384 >> 15;
        int var6 = this.field3015 * var5 + 128 >> 8;
        if (var2.field3043 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field3077 * 1.953125E-5D * (double) var2.field3043) + 0.5D);
        }
        if (var2.field3045 != null) {
            int var7 = arg0.field3069;
            int var8 = var2.field3045[arg0.field3070 + 1];
            if (arg0.field3070 < var2.field3045.length - 2) {
                int var9 = (var2.field3045[arg0.field3070] & 0xFF) << 8;
                int var10 = (var2.field3045[arg0.field3070 + 2] & 0xFF) << 8;
                var8 += (var2.field3045[arg0.field3070 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field3071 > 0 && var2.field3049 != null) {
            int var11 = arg0.field3071;
            int var12 = var2.field3049[arg0.field3072 + 1];
            if (arg0.field3072 < var2.field3049.length - 2) {
                int var13 = (var2.field3049[arg0.field3072] & 0xFF) << 8;
                int var14 = (var2.field3049[arg0.field3072 + 2] & 0xFF) << 8;
                var12 += (var2.field3049[arg0.field3072 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("gj.am(Lgo;I)I")
    public int method3528(class191 arg0) {
        int var2 = this.field3018[arg0.field3062];
        return var2 < 8192 ? arg0.field3059 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field3059) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("gj.l()Lbp;")
    public synchronized class70 method1175() {
        return this.field3026;
    }

    @ObfuscatedName("gj.j()Lbp;")
    public synchronized class70 method1176() {
        return null;
    }

    @ObfuscatedName("gj.r()I")
    public synchronized int method1177() {
        return 0;
    }

    @ObfuscatedName("gj.x([III)V")
    public synchronized void method1169(int[] arg0, int arg1, int arg2) {
        if (this.field3034.method3365()) {
            int var4 = this.field3040 * this.field3034.field2991 / Statics.field1269;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field3038;
                if (this.field3039 - var5 >= 0L) {
                    this.field3038 = var5;
                    break;
                }
                int var7 = (int) ((this.field3039 - this.field3038 + (long) var4 - 1L) / (long) var4);
                this.field3038 += (long) var4 * (long) var7;
                this.field3026.method1169(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3490();
            } while (this.field3034.method3365());
        }
        this.field3026.method1169(arg0, arg1, arg2);
    }

    @ObfuscatedName("gj.v(I)V")
    public synchronized void method1180(int arg0) {
        if (this.field3034.method3365()) {
            int var2 = this.field3040 * this.field3034.field2991 / Statics.field1269;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field3038;
                if (this.field3039 - var3 >= 0L) {
                    this.field3038 = var3;
                    break;
                }
                int var5 = (int) ((this.field3039 - this.field3038 + (long) var2 - 1L) / (long) var2);
                this.field3038 += (long) var2 * (long) var5;
                this.field3026.method1180(var5);
                arg0 -= var5;
                this.method3490();
            } while (this.field3034.method3365());
        }
        this.field3026.method1180(arg0);
    }

    @ObfuscatedName("gj.ag(B)V")
    public void method3490() {
        int var1 = this.field3016;
        int var2 = this.field3031;
        long var3 = this.field3039;
        while (this.field3031 == var2) {
            while (this.field3034.field2995[var1] == var2) {
                this.field3034.method3367(var1);
                int var5 = this.field3034.method3389(var1);
                if (var5 == 1) {
                    this.field3034.method3369();
                    this.field3034.method3404(var1);
                    if (this.field3034.method3375()) {
                        if (!this.field3037 || var2 == 0) {
                            this.method3450();
                            this.field3034.method3385();
                            return;
                        }
                        this.field3034.method3376(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3453(var5);
                }
                this.field3034.method3370(var1);
                this.field3034.method3404(var1);
            }
            var1 = this.field3034.method3374();
            var2 = this.field3034.field2995[var1];
            var3 = this.field3034.method3373(var2);
        }
        this.field3016 = var1;
        this.field3031 = var2;
        this.field3039 = var3;
    }

    @ObfuscatedName("gj.az(Lgo;B)Z")
    public boolean method3460(class191 arg0) {
        if (arg0.field3058 != null) {
            return false;
        }
        if (arg0.field3071 >= 0) {
            arg0.method3729();
            if (arg0.field3066 > 0 && this.field3033[arg0.field3062][arg0.field3066] == arg0) {
                this.field3033[arg0.field3062][arg0.field3066] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("gj.ak(Lgo;[IIIB)Z")
    public boolean method3461(class191 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field3064 = Statics.field1269 / 100;
        if (arg0.field3071 >= 0 && arg0.field3058 == null || arg0.field3058.method1372()) {
            arg0.method3536();
            arg0.method3729();
            if (arg0.field3066 > 0 && this.field3033[arg0.field3062][arg0.field3066] == arg0) {
                this.field3033[arg0.field3062][arg0.field3066] = null;
            }
            return true;
        }
        int var5 = arg0.field3067;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field3025[arg0.field3062] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field3067 = var6;
        }
        arg0.field3058.method1370(this.method3434(arg0));
        class189 var7 = arg0.field3061;
        boolean var8 = false;
        arg0.field3075++;
        arg0.field3074 += var7.field3042;
        double var9 = (double) ((arg0.field3068 - 60 << 8) + (arg0.field3079 * arg0.field3067 >> 12)) * 5.086263020833333E-6D;
        if (var7.field3043 > 0) {
            if (var7.field3046 > 0) {
                arg0.field3077 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3046 * var9) + 0.5D);
            } else {
                arg0.field3077 += 128;
            }
        }
        if (var7.field3045 != null) {
            if (var7.field3044 > 0) {
                arg0.field3069 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3044 * var9) + 0.5D);
            } else {
                arg0.field3069 += 128;
            }
            while (arg0.field3070 < var7.field3045.length - 2 && arg0.field3069 > (var7.field3045[arg0.field3070 + 2] & 0xFF) << 8) {
                arg0.field3070 += 2;
            }
            if (arg0.field3070 == var7.field3045.length - 2 && var7.field3045[arg0.field3070 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field3071 >= 0 && var7.field3049 != null && (this.field3019[arg0.field3062] & 0x1) == 0 && (arg0.field3066 < 0 || this.field3033[arg0.field3062][arg0.field3066] != arg0)) {
            if (var7.field3041 > 0) {
                arg0.field3071 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3041 * var9) + 0.5D);
            } else {
                arg0.field3071 += 128;
            }
            while (arg0.field3072 < var7.field3049.length - 2 && arg0.field3071 > (var7.field3049[arg0.field3072 + 2] & 0xFF) << 8) {
                arg0.field3072 += 2;
            }
            if (arg0.field3072 == var7.field3049.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field3058.method1368(arg0.field3064, this.method3456(arg0), this.method3528(arg0));
            return false;
        }
        arg0.field3058.method1369(arg0.field3064);
        if (arg1 == null) {
            arg0.field3058.method1180(arg3);
        } else {
            arg0.field3058.method1169(arg1, arg2, arg3);
        }
        if (arg0.field3058.method1373()) {
            this.field3026.field3053.method1170(arg0.field3058);
        }
        arg0.method3536();
        if (arg0.field3071 >= 0) {
            arg0.method3729();
            if (arg0.field3066 > 0 && this.field3033[arg0.field3062][arg0.field3066] == arg0) {
                this.field3033[arg0.field3062][arg0.field3066] = null;
            }
        }
        return true;
    }
}
