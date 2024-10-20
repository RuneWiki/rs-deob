package deob;

@ObfuscatedName("gp")
public class class188 extends class70 {

    @ObfuscatedName("gp.f")
    public class200 field3035 = new class200(128);

    @ObfuscatedName("gp.e")
    public int field3008 = 256;

    @ObfuscatedName("gp.n")
    public int field3009 = 1000000;

    @ObfuscatedName("gp.t")
    public int[] field3010 = new int[16];

    @ObfuscatedName("gp.v")
    public int[] field3011 = new int[16];

    @ObfuscatedName("gp.b")
    public int[] field3012 = new int[16];

    @ObfuscatedName("gp.m")
    public int[] field3036 = new int[16];

    @ObfuscatedName("gp.k")
    public int[] field3016 = new int[16];

    @ObfuscatedName("gp.c")
    public int[] field3018 = new int[16];

    @ObfuscatedName("gp.l")
    public int[] field3026 = new int[16];

    @ObfuscatedName("gp.h")
    public int[] field3017 = new int[16];

    @ObfuscatedName("gp.i")
    public int[] field3028 = new int[16];

    @ObfuscatedName("gp.r")
    public int[] field3019 = new int[16];

    @ObfuscatedName("gp.a")
    public int[] field3032 = new int[16];

    @ObfuscatedName("gp.z")
    public int[] field3021 = new int[16];

    @ObfuscatedName("gp.p")
    public int[] field3022 = new int[16];

    @ObfuscatedName("gp.y")
    public int[] field3023 = new int[16];

    @ObfuscatedName("gp.s")
    public int[] field3024 = new int[16];

    @ObfuscatedName("gp.g")
    public class191[][] field3025 = new class191[16][128];

    @ObfuscatedName("gp.aj")
    public class191[][] field3033 = new class191[16][128];

    @ObfuscatedName("gp.ay")
    public class186 field3027 = new class186();

    @ObfuscatedName("gp.ah")
    public boolean field3034;

    @ObfuscatedName("gp.ax")
    public int field3029;

    @ObfuscatedName("gp.ar")
    public int field3030;

    @ObfuscatedName("gp.ae")
    public long field3031;

    @ObfuscatedName("gp.ac")
    public long field3013;

    @ObfuscatedName("gp.aw")
    public class190 field3014 = new class190(this);

    public class188() {
        this.method3470();
    }

    @ObfuscatedName("gp.f(II)V")
    public synchronized void method3481(int arg0) {
        this.field3008 = arg0;
    }

    @ObfuscatedName("gp.e(I)I")
    public int method3542() {
        return this.field3008;
    }

    @ObfuscatedName("gp.n(Lgx;Lfj;Lbi;IB)Z")
    public synchronized boolean method3525(class184 arg0, class171 arg1, class63 arg2, int arg3) {
        arg0.method3367();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class201 var7 = (class201) arg0.field2969.method3608(); var7 != null; var7 = (class201) arg0.field2969.method3613()) {
            int var8 = (int) var7.field3167;
            class185 var9 = (class185) this.field3035.method3605((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method3092(var8);
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
                this.field3035.method3606(var11, (long) var8);
            }
            if (!var9.method3376(arg2, var7.field3145, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3366();
        }
        return var5;
    }

    @ObfuscatedName("gp.t(B)V")
    public synchronized void method3454() {
        for (class185 var1 = (class185) this.field3035.method3608(); var1 != null; var1 = (class185) this.field3035.method3613()) {
            var1.method3377();
        }
    }

    @ObfuscatedName("gp.v(B)V")
    public synchronized void method3498() {
        for (class185 var1 = (class185) this.field3035.method3608(); var1 != null; var1 = (class185) this.field3035.method3613()) {
            var1.method3744();
        }
    }

    @ObfuscatedName("gp.w(Lgx;ZI)V")
    public synchronized void method3456(class184 arg0, boolean arg1) {
        this.method3457();
        this.field3027.method3384(arg0.field2968);
        this.field3034 = arg1;
        this.field3031 = 0L;
        int var3 = this.field3027.method3391();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3027.method3387(var4);
            this.field3027.method3390(var4);
            this.field3027.method3388(var4);
        }
        this.field3029 = this.field3027.method3421();
        this.field3030 = this.field3027.field2983[this.field3029];
        this.field3013 = this.field3027.method3394(this.field3030);
    }

    @ObfuscatedName("gp.h(I)V")
    public synchronized void method3457() {
        this.field3027.method3385();
        this.method3470();
    }

    @ObfuscatedName("gp.i(I)Z")
    public synchronized boolean method3458() {
        return this.field3027.method3386();
    }

    @ObfuscatedName("gp.u(IIB)V")
    public synchronized void method3459(int arg0, int arg1) {
        this.method3538(arg0, arg1);
    }

    @ObfuscatedName("gp.x(III)V")
    public void method3538(int arg0, int arg1) {
        this.field3036[arg0] = arg1;
        this.field3018[arg0] = arg1 & 0xFFFFFF80;
        this.method3461(arg0, arg1);
    }

    @ObfuscatedName("gp.d(III)V")
    public void method3461(int arg0, int arg1) {
        if (this.field3016[arg0] != arg1) {
            this.field3016[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field3033[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("gp.o(IIIB)V")
    public void method3462(int arg0, int arg1, int arg2) {
        this.method3464(arg0, arg1, 64);
        if ((this.field3019[arg0] & 0x2) != 0) {
            for (class191 var4 = (class191) this.field3014.field3049.method3647(); var4 != null; var4 = (class191) this.field3014.field3049.method3649()) {
                if (var4.field3074 == arg0 && var4.field3076 < 0) {
                    this.field3025[arg0][var4.field3060] = null;
                    this.field3025[arg0][arg1] = var4;
                    int var5 = (var4.field3065 * var4.field3064 >> 12) + var4.field3063;
                    var4.field3063 += arg1 - var4.field3060 << 8;
                    var4.field3064 = var5 - var4.field3063;
                    var4.field3065 = 4096;
                    var4.field3060 = arg1;
                    return;
                }
            }
        }
        class185 var6 = (class185) this.field3035.method3605((long) this.field3016[arg0]);
        if (var6 == null) {
            return;
        }
        class66 var7 = var6.field2971[arg1];
        if (var7 == null) {
            return;
        }
        class191 var8 = new class191();
        var8.field3074 = arg0;
        var8.field3070 = var6;
        var8.field3057 = var7;
        var8.field3069 = var6.field2970[arg1];
        var8.field3059 = var6.field2974[arg1];
        var8.field3060 = arg1;
        var8.field3061 = var6.field2975 * arg2 * arg2 * var6.field2973[arg1] + 1024 >> 11;
        var8.field3062 = var6.field2976[arg1] & 0xFF;
        var8.field3063 = (arg1 << 8) - (var6.field2972[arg1] & 0x7FFF);
        var8.field3066 = 0;
        var8.field3067 = 0;
        var8.field3056 = 0;
        var8.field3076 = -1;
        var8.field3058 = 0;
        if (this.field3022[arg0] == 0) {
            var8.field3068 = class68.method1336(var7, this.method3514(var8), this.method3475(var8), this.method3477(var8));
        } else {
            var8.field3068 = class68.method1336(var7, this.method3514(var8), 0, this.method3477(var8));
            this.method3522(var8, var6.field2972[arg1] < 0);
        }
        if (var6.field2972[arg1] < 0) {
            var8.field3068.method1361(-1);
        }
        if (var8.field3059 >= 0) {
            class191 var9 = this.field3033[arg0][var8.field3059];
            if (var9 != null && var9.field3076 < 0) {
                this.field3025[arg0][var9.field3060] = null;
                var9.field3076 = 0;
            }
            this.field3033[arg0][var8.field3059] = var8;
        }
        this.field3014.field3049.method3642(var8);
        this.field3025[arg0][arg1] = var8;
    }

    @ObfuscatedName("gp.j(Lgs;ZB)V")
    public void method3522(class191 arg0, boolean arg1) {
        int var3 = arg0.field3057.field1279.length;
        int var5;
        if (arg1 && arg0.field3057.field1282) {
            int var4 = var3 + var3 - arg0.field3057.field1278;
            var5 = (int) ((long) this.field3022[arg0.field3074] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field3068.method1338(true);
            }
        } else {
            var5 = (int) ((long) this.field3022[arg0.field3074] * (long) var3 >> 6);
        }
        arg0.field3068.method1344(var5);
    }

    @ObfuscatedName("gp.q(IIII)V")
    public void method3464(int arg0, int arg1, int arg2) {
        class191 var4 = this.field3025[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field3025[arg0][arg1] = null;
        if ((this.field3019[arg0] & 0x2) == 0) {
            var4.field3076 = 0;
            return;
        }
        for (class191 var5 = (class191) this.field3014.field3049.method3646(); var5 != null; var5 = (class191) this.field3014.field3049.method3648()) {
            if (var4.field3074 == var5.field3074 && var5.field3076 < 0 && var4 != var5) {
                var4.field3076 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("gp.r(IIII)V")
    public void method3465(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("gp.a(III)V")
    public void method3504(int arg0, int arg1) {
    }

    @ObfuscatedName("gp.z(IIB)V")
    public void method3526(int arg0, int arg1) {
        this.field3026[arg0] = arg1;
    }

    @ObfuscatedName("gp.p(IB)V")
    public void method3537(int arg0) {
        for (class191 var2 = (class191) this.field3014.field3049.method3646(); var2 != null; var2 = (class191) this.field3014.field3049.method3648()) {
            if (arg0 < 0 || var2.field3074 == arg0) {
                if (var2.field3068 != null) {
                    var2.field3068.method1397(Statics.field1236 / 100);
                    if (var2.field3068.method1353()) {
                        this.field3014.field3052.method1164(var2.field3068);
                    }
                    var2.method3560();
                }
                if (var2.field3076 < 0) {
                    this.field3025[var2.field3074][var2.field3060] = null;
                }
                var2.method3744();
            }
        }
    }

    @ObfuscatedName("gp.y(II)V")
    public void method3469(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3469(var2);
            }
            return;
        }
        this.field3010[arg0] = 12800;
        this.field3011[arg0] = 8192;
        this.field3012[arg0] = 16383;
        this.field3026[arg0] = 8192;
        this.field3017[arg0] = 0;
        this.field3028[arg0] = 8192;
        this.method3471(arg0);
        this.method3472(arg0);
        this.field3019[arg0] = 0;
        this.field3032[arg0] = 32767;
        this.field3021[arg0] = 256;
        this.field3022[arg0] = 0;
        this.method3474(arg0, 8192);
    }

    @ObfuscatedName("gp.s(IB)V")
    public void method3468(int arg0) {
        for (class191 var2 = (class191) this.field3014.field3049.method3646(); var2 != null; var2 = (class191) this.field3014.field3049.method3648()) {
            if ((arg0 < 0 || var2.field3074 == arg0) && var2.field3076 < 0) {
                this.field3025[var2.field3074][var2.field3060] = null;
                var2.field3076 = 0;
            }
        }
    }

    @ObfuscatedName("gp.g(I)V")
    public void method3470() {
        this.method3537(-1);
        this.method3469(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field3016[var1] = this.field3036[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field3018[var2] = this.field3036[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("gp.aj(II)V")
    public void method3471(int arg0) {
        if ((this.field3019[arg0] & 0x2) == 0) {
            return;
        }
        for (class191 var2 = (class191) this.field3014.field3049.method3646(); var2 != null; var2 = (class191) this.field3014.field3049.method3648()) {
            if (var2.field3074 == arg0 && this.field3025[arg0][var2.field3060] == null && var2.field3076 < 0) {
                var2.field3076 = 0;
            }
        }
    }

    @ObfuscatedName("gp.ay(II)V")
    public void method3472(int arg0) {
        if ((this.field3019[arg0] & 0x4) == 0) {
            return;
        }
        for (class191 var2 = (class191) this.field3014.field3049.method3646(); var2 != null; var2 = (class191) this.field3014.field3049.method3648()) {
            if (var2.field3074 == arg0) {
                var2.field3075 = 0;
            }
        }
    }

    @ObfuscatedName("gp.ah(II)V")
    public void method3473(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3464(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3462(var6, var7, var8);
            } else {
                this.method3464(var6, var7, 64);
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
                this.field3018[var12] = (var14 << 14) + (this.field3018[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field3018[var12] = (var14 << 7) + (this.field3018[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field3017[var12] = (var14 << 7) + (this.field3017[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field3017[var12] = (this.field3017[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field3028[var12] = (var14 << 7) + (this.field3028[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field3028[var12] = (this.field3028[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field3010[var12] = (var14 << 7) + (this.field3010[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field3010[var12] = (this.field3010[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field3011[var12] = (var14 << 7) + (this.field3011[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field3011[var12] = (this.field3011[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field3012[var12] = (var14 << 7) + (this.field3012[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field3012[var12] = (this.field3012[var12] & 0xFFFFFF80) + var14;
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
                    this.method3471(var12);
                    this.field3019[var12] &= 0xFFFFFFFD;
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
                this.method3537(var12);
            }
            if (var13 == 121) {
                this.method3469(var12);
            }
            if (var13 == 123) {
                this.method3468(var12);
            }
            if (var13 == 6) {
                int var15 = this.field3032[var12];
                if (var15 == 16384) {
                    this.field3021[var12] = (var14 << 7) + (this.field3021[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field3032[var12];
                if (var16 == 16384) {
                    this.field3021[var12] = (this.field3021[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field3022[var12] = (var14 << 7) + (this.field3022[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field3022[var12] = (this.field3022[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field3019[var12] |= 0x4;
                } else {
                    this.method3472(var12);
                    this.field3019[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3474(var12, (var14 << 7) + (this.field3023[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3474(var12, (this.field3023[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3461(var17, this.field3018[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3504(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method3526(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3470();
            }
        }
    }

    @ObfuscatedName("gp.ax(III)V")
    public void method3474(int arg0, int arg1) {
        this.field3023[arg0] = arg1;
        this.field3024[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("gp.ak(Lgs;I)I")
    public int method3514(class191 arg0) {
        int var2 = (arg0.field3065 * arg0.field3064 >> 12) + arg0.field3063;
        int var3 = ((this.field3026[arg0.field3074] - 8192) * this.field3021[arg0.field3074] >> 12) + var2;
        class189 var4 = arg0.field3069;
        if (var4.field3044 > 0 && (var4.field3038 > 0 || this.field3017[arg0.field3074] > 0)) {
            int var5 = var4.field3038 << 2;
            int var6 = var4.field3043 << 1;
            if (arg0.field3071 < var6) {
                var5 = arg0.field3071 * var5 / var6;
            }
            int var7 = (this.field3017[arg0.field3074] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field3072 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field3057.field1280 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1236 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("gp.ag(Lgs;I)I")
    public int method3475(class191 arg0) {
        class189 var2 = arg0.field3069;
        int var3 = this.field3012[arg0.field3074] * this.field3010[arg0.field3074] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field3061 * var4 + 16384 >> 15;
        int var6 = this.field3008 * var5 + 128 >> 8;
        if (var2.field3039 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field3066 * 1.953125E-5D * (double) var2.field3039) + 0.5D);
        }
        if (var2.field3045 != null) {
            int var7 = arg0.field3067;
            int var8 = var2.field3045[arg0.field3056 + 1];
            if (arg0.field3056 < var2.field3045.length - 2) {
                int var9 = (var2.field3045[arg0.field3056] & 0xFF) << 8;
                int var10 = (var2.field3045[arg0.field3056 + 2] & 0xFF) << 8;
                var8 += (var2.field3045[arg0.field3056 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field3076 > 0 && var2.field3048 != null) {
            int var11 = arg0.field3076;
            int var12 = var2.field3048[arg0.field3058 + 1];
            if (arg0.field3058 < var2.field3048.length - 2) {
                int var13 = (var2.field3048[arg0.field3058] & 0xFF) << 8;
                int var14 = (var2.field3048[arg0.field3058 + 2] & 0xFF) << 8;
                var12 += (var2.field3048[arg0.field3058 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("gp.af(Lgs;S)I")
    public int method3477(class191 arg0) {
        int var2 = this.field3011[arg0.field3074];
        return var2 < 8192 ? arg0.field3062 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field3062) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("gp.b()Lbx;")
    public synchronized class70 method1156() {
        return this.field3014;
    }

    @ObfuscatedName("gp.m()Lbx;")
    public synchronized class70 method1157() {
        return null;
    }

    @ObfuscatedName("gp.k()I")
    public synchronized int method1158() {
        return 0;
    }

    @ObfuscatedName("gp.c([III)V")
    public synchronized void method1159(int[] arg0, int arg1, int arg2) {
        if (this.field3027.method3386()) {
            int var4 = this.field3009 * this.field3027.field2985 / Statics.field1236;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field3031;
                if (this.field3013 - var5 >= 0L) {
                    this.field3031 = var5;
                    break;
                }
                int var7 = (int) ((this.field3013 - this.field3031 + (long) var4 - 1L) / (long) var4);
                this.field3031 += (long) var4 * (long) var7;
                this.field3014.method1159(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3478();
            } while (this.field3027.method3386());
        }
        this.field3014.method1159(arg0, arg1, arg2);
    }

    @ObfuscatedName("gp.l(I)V")
    public synchronized void method1161(int arg0) {
        if (this.field3027.method3386()) {
            int var2 = this.field3009 * this.field3027.field2985 / Statics.field1236;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field3031;
                if (this.field3013 - var3 >= 0L) {
                    this.field3031 = var3;
                    break;
                }
                int var5 = (int) ((this.field3013 - this.field3031 + (long) var2 - 1L) / (long) var2);
                this.field3031 += (long) var2 * (long) var5;
                this.field3014.method1161(var5);
                arg0 -= var5;
                this.method3478();
            } while (this.field3027.method3386());
        }
        this.field3014.method1161(arg0);
    }

    @ObfuscatedName("gp.al(B)V")
    public void method3478() {
        int var1 = this.field3029;
        int var2 = this.field3030;
        long var3 = this.field3013;
        while (this.field3030 == var2) {
            while (this.field3027.field2983[var1] == var2) {
                this.field3027.method3387(var1);
                int var5 = this.field3027.method3406(var1);
                if (var5 == 1) {
                    this.field3027.method3395();
                    this.field3027.method3388(var1);
                    if (this.field3027.method3399()) {
                        if (!this.field3034 || var2 == 0) {
                            this.method3470();
                            this.field3027.method3385();
                            return;
                        }
                        this.field3027.method3397(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3473(var5);
                }
                this.field3027.method3390(var1);
                this.field3027.method3388(var1);
            }
            var1 = this.field3027.method3421();
            var2 = this.field3027.field2983[var1];
            var3 = this.field3027.method3394(var2);
        }
        this.field3029 = var1;
        this.field3030 = var2;
        this.field3013 = var3;
    }

    @ObfuscatedName("gp.av(Lgs;I)Z")
    public boolean method3479(class191 arg0) {
        if (arg0.field3068 != null) {
            return false;
        }
        if (arg0.field3076 >= 0) {
            arg0.method3744();
            if (arg0.field3059 > 0 && this.field3033[arg0.field3074][arg0.field3059] == arg0) {
                this.field3033[arg0.field3074][arg0.field3059] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("gp.an(Lgs;[IIII)Z")
    public boolean method3480(class191 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field3055 = Statics.field1236 / 100;
        if (arg0.field3076 >= 0 && arg0.field3068 == null || arg0.field3068.method1352()) {
            arg0.method3560();
            arg0.method3744();
            if (arg0.field3059 > 0 && this.field3033[arg0.field3074][arg0.field3059] == arg0) {
                this.field3033[arg0.field3074][arg0.field3059] = null;
            }
            return true;
        }
        int var5 = arg0.field3065;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field3028[arg0.field3074] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field3065 = var6;
        }
        arg0.field3068.method1350(this.method3514(arg0));
        class189 var7 = arg0.field3069;
        boolean var8 = false;
        arg0.field3071++;
        arg0.field3072 += var7.field3044;
        double var9 = (double) ((arg0.field3060 - 60 << 8) + (arg0.field3065 * arg0.field3064 >> 12)) * 5.086263020833333E-6D;
        if (var7.field3039 > 0) {
            if (var7.field3042 > 0) {
                arg0.field3066 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3042 * var9) + 0.5D);
            } else {
                arg0.field3066 += 128;
            }
        }
        if (var7.field3045 != null) {
            if (var7.field3041 > 0) {
                arg0.field3067 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3041 * var9) + 0.5D);
            } else {
                arg0.field3067 += 128;
            }
            while (arg0.field3056 < var7.field3045.length - 2 && arg0.field3067 > (var7.field3045[arg0.field3056 + 2] & 0xFF) << 8) {
                arg0.field3056 += 2;
            }
            if (arg0.field3056 == var7.field3045.length - 2 && var7.field3045[arg0.field3056 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field3076 >= 0 && var7.field3048 != null && (this.field3019[arg0.field3074] & 0x1) == 0 && (arg0.field3059 < 0 || this.field3033[arg0.field3074][arg0.field3059] != arg0)) {
            if (var7.field3040 > 0) {
                arg0.field3076 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3040 * var9) + 0.5D);
            } else {
                arg0.field3076 += 128;
            }
            while (arg0.field3058 < var7.field3048.length - 2 && arg0.field3076 > (var7.field3048[arg0.field3058 + 2] & 0xFF) << 8) {
                arg0.field3058 += 2;
            }
            if (arg0.field3058 == var7.field3048.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field3068.method1333(arg0.field3055, this.method3475(arg0), this.method3477(arg0));
            return false;
        }
        arg0.field3068.method1397(arg0.field3055);
        if (arg1 == null) {
            arg0.field3068.method1161(arg3);
        } else {
            arg0.field3068.method1159(arg1, arg2, arg3);
        }
        if (arg0.field3068.method1353()) {
            this.field3014.field3052.method1164(arg0.field3068);
        }
        arg0.method3560();
        if (arg0.field3076 >= 0) {
            arg0.method3744();
            if (arg0.field3059 > 0 && this.field3033[arg0.field3074][arg0.field3059] == arg0) {
                this.field3033[arg0.field3074][arg0.field3059] = null;
            }
        }
        return true;
    }
}
