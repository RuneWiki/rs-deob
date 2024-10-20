package deob;

@ObfuscatedName("jp")
public class class262 extends class46 {

    @ObfuscatedName("jp.c")
    public class397 field3075 = new class397(128);

    @ObfuscatedName("jp.b")
    public int field3070 = 256;

    @ObfuscatedName("jp.p")
    public int field3076 = 1000000;

    @ObfuscatedName("jp.m")
    public int[] field3072 = new int[16];

    @ObfuscatedName("jp.t")
    public int[] field3090 = new int[16];

    @ObfuscatedName("jp.s")
    public int[] field3077 = new int[16];

    @ObfuscatedName("jp.j")
    public int[] field3093 = new int[16];

    @ObfuscatedName("jp.n")
    public int[] field3096 = new int[16];

    @ObfuscatedName("jp.r")
    public int[] field3097 = new int[16];

    @ObfuscatedName("jp.o")
    public int[] field3078 = new int[16];

    @ObfuscatedName("jp.v")
    public int[] field3079 = new int[16];

    @ObfuscatedName("jp.d")
    public int[] field3080 = new int[16];

    @ObfuscatedName("jp.f")
    public int[] field3082 = new int[16];

    @ObfuscatedName("jp.l")
    public int[] field3083 = new int[16];

    @ObfuscatedName("jp.q")
    public int[] field3092 = new int[16];

    @ObfuscatedName("jp.x")
    public int[] field3085 = new int[16];

    @ObfuscatedName("jp.z")
    public int[] field3086 = new int[16];

    @ObfuscatedName("jp.i")
    public int[] field3087 = new int[16];

    @ObfuscatedName("jp.y")
    public class267[][] field3088 = new class267[16][128];

    @ObfuscatedName("jp.ah")
    public class267[][] field3089 = new class267[16][128];

    @ObfuscatedName("jp.ao")
    public class263 field3069 = new class263();

    @ObfuscatedName("jp.ab")
    public boolean field3073;

    @ObfuscatedName("jp.an")
    public int field3091;

    @ObfuscatedName("jp.ax")
    public int field3071;

    @ObfuscatedName("jp.am")
    public long field3094;

    @ObfuscatedName("jp.az")
    public long field3095;

    @ObfuscatedName("jp.au")
    public class265 field3084 = new class265(this);

    public class262() {
        this.method4613();
    }

    @ObfuscatedName("jp.c(II)V")
    public synchronized void method4628(int arg0) {
        this.field3070 = arg0;
    }

    @ObfuscatedName("jp.b(I)I")
    public int method4596() {
        return this.field3070;
    }

    @ObfuscatedName("jp.p(Ljk;Lku;Laa;II)Z")
    public synchronized boolean method4597(class266 arg0, class302 arg1, class43 arg2, int arg3) {
        arg0.method4773();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class384 var7 = (class384) arg0.field3128.method6448(); var7 != null; var7 = (class384) arg0.field3128.method6445()) {
            int var8 = (int) var7.field4257;
            class264 var9 = (class264) this.field3075.method6446((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method5059(var8);
                class264 var11;
                if (var10 == null) {
                    var11 = null;
                } else {
                    var11 = new class264(var10);
                }
                var9 = var11;
                if (var11 == null) {
                    var5 = false;
                    continue;
                }
                this.field3075.method6447(var11, (long) var8);
            }
            if (!var9.method4761(arg2, var7.field4254, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method4774();
        }
        return var5;
    }

    @ObfuscatedName("jp.m(I)V")
    public synchronized void method4627() {
        for (class264 var1 = (class264) this.field3075.method6448(); var1 != null; var1 = (class264) this.field3075.method6445()) {
            var1.method4760();
        }
    }

    @ObfuscatedName("jp.t(I)V")
    public synchronized void method4618() {
        for (class264 var1 = (class264) this.field3075.method6448(); var1 != null; var1 = (class264) this.field3075.method6445()) {
            var1.method6163();
        }
    }

    @ObfuscatedName("jp.r(Ljk;ZI)V")
    public synchronized void method4600(class266 arg0, boolean arg1) {
        this.method4693();
        this.field3069.method4735(arg0.field3127);
        this.field3073 = arg1;
        this.field3094 = 0L;
        int var3 = this.field3069.method4738();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3069.method4722(var4);
            this.field3069.method4713(var4);
            this.field3069.method4756(var4);
        }
        this.field3091 = this.field3069.method4717();
        this.field3071 = this.field3069.field3102[this.field3091];
        this.field3095 = this.field3069.method4710(this.field3071);
    }

    @ObfuscatedName("jp.v(B)V")
    public synchronized void method4693() {
        this.field3069.method4708();
        this.method4613();
    }

    @ObfuscatedName("jp.d(I)Z")
    public synchronized boolean method4601() {
        return this.field3069.method4709();
    }

    @ObfuscatedName("jp.h(III)V")
    public synchronized void method4602(int arg0, int arg1) {
        this.method4603(arg0, arg1);
    }

    @ObfuscatedName("jp.g(IIB)V")
    public void method4603(int arg0, int arg1) {
        this.field3093[arg0] = arg1;
        this.field3097[arg0] = arg1 & 0xFFFFFF80;
        this.method4604(arg0, arg1);
    }

    @ObfuscatedName("jp.e(III)V")
    public void method4604(int arg0, int arg1) {
        if (this.field3096[arg0] != arg1) {
            this.field3096[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field3089[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("jp.a(IIII)V")
    public void method4674(int arg0, int arg1, int arg2) {
        this.method4606(arg0, arg1, 64);
        if ((this.field3082[arg0] & 0x2) != 0) {
            for (class267 var4 = (class267) this.field3084.field3124.method5302(); var4 != null; var4 = (class267) this.field3084.field3124.method5315()) {
                if (var4.field3150 == arg0 && var4.field3143 < 0) {
                    this.field3088[arg0][var4.field3134] = null;
                    this.field3088[arg0][arg1] = var4;
                    int var5 = (var4.field3139 * var4.field3138 >> 12) + var4.field3137;
                    var4.field3137 += arg1 - var4.field3134 << 8;
                    var4.field3138 = var5 - var4.field3137;
                    var4.field3139 = 4096;
                    var4.field3134 = arg1;
                    return;
                }
            }
        }
        class264 var6 = (class264) this.field3075.method6446((long) this.field3096[arg0]);
        if (var6 == null) {
            return;
        }
        class38 var7 = var6.field3113[arg1];
        if (var7 == null) {
            return;
        }
        class267 var8 = new class267();
        var8.field3150 = arg0;
        var8.field3130 = var6;
        var8.field3131 = var7;
        var8.field3132 = var6.field3118[arg1];
        var8.field3129 = var6.field3120[arg1];
        var8.field3134 = arg1;
        var8.field3133 = var6.field3115 * arg2 * arg2 * var6.field3112[arg1] + 1024 >> 11;
        var8.field3148 = var6.field3116[arg1] & 0xFF;
        var8.field3137 = (arg1 << 8) - (var6.field3114[arg1] & 0x7FFF);
        var8.field3140 = 0;
        var8.field3141 = 0;
        var8.field3142 = 0;
        var8.field3143 = -1;
        var8.field3144 = 0;
        if (this.field3085[arg0] == 0) {
            var8.field3147 = class45.method901(var7, this.method4680(var8), this.method4619(var8), this.method4620(var8));
        } else {
            var8.field3147 = class45.method901(var7, this.method4680(var8), 0, this.method4620(var8));
            this.method4605(var8, var6.field3114[arg1] < 0);
        }
        if (var6.field3114[arg1] < 0) {
            var8.field3147.method812(-1);
        }
        if (var8.field3129 >= 0) {
            class267 var9 = this.field3089[arg0][var8.field3129];
            if (var9 != null && var9.field3143 < 0) {
                this.field3088[arg0][var9.field3134] = null;
                var9.field3143 = 0;
            }
            this.field3089[arg0][var8.field3129] = var8;
        }
        this.field3084.field3124.method5296(var8);
        this.field3088[arg0][arg1] = var8;
    }

    @ObfuscatedName("jp.u(Ljq;ZI)V")
    public void method4605(class267 arg0, boolean arg1) {
        int var3 = arg0.field3131.field265.length;
        int var5;
        if (arg1 && arg0.field3131.field266) {
            int var4 = var3 + var3 - arg0.field3131.field264;
            var5 = (int) ((long) this.field3085[arg0.field3150] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field3147.method884(true);
            }
        } else {
            var5 = (int) ((long) this.field3085[arg0.field3150] * (long) var3 >> 6);
        }
        arg0.field3147.method818(var5);
    }

    @ObfuscatedName("jp.k(IIIB)V")
    public void method4606(int arg0, int arg1, int arg2) {
        class267 var4 = this.field3088[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field3088[arg0][arg1] = null;
        if ((this.field3082[arg0] & 0x2) == 0) {
            var4.field3143 = 0;
            return;
        }
        for (class267 var5 = (class267) this.field3084.field3124.method5301(); var5 != null; var5 = (class267) this.field3084.field3124.method5303()) {
            if (var4.field3150 == var5.field3150 && var5.field3143 < 0 && var4 != var5) {
                var4.field3143 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("jp.f(IIII)V")
    public void method4607(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("jp.l(III)V")
    public void method4608(int arg0, int arg1) {
    }

    @ObfuscatedName("jp.q(IIB)V")
    public void method4609(int arg0, int arg1) {
        this.field3078[arg0] = arg1;
    }

    @ObfuscatedName("jp.x(II)V")
    public void method4610(int arg0) {
        for (class267 var2 = (class267) this.field3084.field3124.method5301(); var2 != null; var2 = (class267) this.field3084.field3124.method5303()) {
            if (arg0 < 0 || var2.field3150 == arg0) {
                if (var2.field3147 != null) {
                    var2.field3147.method910(Statics.field4059 / 100);
                    if (var2.field3147.method827()) {
                        this.field3084.field3125.method658(var2.field3147);
                    }
                    var2.method4785();
                }
                if (var2.field3143 < 0) {
                    this.field3088[var2.field3150][var2.field3134] = null;
                }
                var2.method6163();
            }
        }
    }

    @ObfuscatedName("jp.ax(II)V")
    public void method4611(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method4611(var2);
            }
            return;
        }
        this.field3072[arg0] = 12800;
        this.field3090[arg0] = 8192;
        this.field3077[arg0] = 16383;
        this.field3078[arg0] = 8192;
        this.field3079[arg0] = 0;
        this.field3080[arg0] = 8192;
        this.method4614(arg0);
        this.method4615(arg0);
        this.field3082[arg0] = 0;
        this.field3083[arg0] = 32767;
        this.field3092[arg0] = 256;
        this.field3085[arg0] = 0;
        this.method4617(arg0, 8192);
    }

    @ObfuscatedName("jp.am(IB)V")
    public void method4642(int arg0) {
        for (class267 var2 = (class267) this.field3084.field3124.method5301(); var2 != null; var2 = (class267) this.field3084.field3124.method5303()) {
            if ((arg0 < 0 || var2.field3150 == arg0) && var2.field3143 < 0) {
                this.field3088[var2.field3150][var2.field3134] = null;
                var2.field3143 = 0;
            }
        }
    }

    @ObfuscatedName("jp.au(B)V")
    public void method4613() {
        this.method4610(-1);
        this.method4611(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field3096[var1] = this.field3093[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field3097[var2] = this.field3093[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("jp.aj(IB)V")
    public void method4614(int arg0) {
        if ((this.field3082[arg0] & 0x2) == 0) {
            return;
        }
        for (class267 var2 = (class267) this.field3084.field3124.method5301(); var2 != null; var2 = (class267) this.field3084.field3124.method5303()) {
            if (var2.field3150 == arg0 && this.field3088[arg0][var2.field3134] == null && var2.field3143 < 0) {
                var2.field3143 = 0;
            }
        }
    }

    @ObfuscatedName("jp.af(IS)V")
    public void method4615(int arg0) {
        if ((this.field3082[arg0] & 0x4) == 0) {
            return;
        }
        for (class267 var2 = (class267) this.field3084.field3124.method5301(); var2 != null; var2 = (class267) this.field3084.field3124.method5303()) {
            if (var2.field3150 == arg0) {
                var2.field3136 = 0;
            }
        }
    }

    @ObfuscatedName("jp.ar(II)V")
    public void method4616(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method4606(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method4674(var6, var7, var8);
            } else {
                this.method4606(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method4607(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field3097[var12] = (var14 << 14) + (this.field3097[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field3097[var12] = (var14 << 7) + (this.field3097[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field3079[var12] = (var14 << 7) + (this.field3079[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field3079[var12] = (this.field3079[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field3080[var12] = (var14 << 7) + (this.field3080[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field3080[var12] = (this.field3080[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field3072[var12] = (var14 << 7) + (this.field3072[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field3072[var12] = (this.field3072[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field3090[var12] = (var14 << 7) + (this.field3090[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field3090[var12] = (this.field3090[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field3077[var12] = (var14 << 7) + (this.field3077[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field3077[var12] = (this.field3077[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field3082[var12] |= 0x1;
                } else {
                    this.field3082[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field3082[var12] |= 0x2;
                } else {
                    this.method4614(var12);
                    this.field3082[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field3083[var12] = (var14 << 7) + (this.field3083[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field3083[var12] = (this.field3083[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field3083[var12] = (var14 << 7) + (this.field3083[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field3083[var12] = (this.field3083[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method4610(var12);
            }
            if (var13 == 121) {
                this.method4611(var12);
            }
            if (var13 == 123) {
                this.method4642(var12);
            }
            if (var13 == 6) {
                int var15 = this.field3083[var12];
                if (var15 == 16384) {
                    this.field3092[var12] = (var14 << 7) + (this.field3092[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field3083[var12];
                if (var16 == 16384) {
                    this.field3092[var12] = (this.field3092[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field3085[var12] = (var14 << 7) + (this.field3085[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field3085[var12] = (this.field3085[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field3082[var12] |= 0x4;
                } else {
                    this.method4615(var12);
                    this.field3082[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method4617(var12, (var14 << 7) + (this.field3086[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method4617(var12, (this.field3086[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method4604(var17, this.field3097[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method4608(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method4609(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method4613();
            }
        }
    }

    @ObfuscatedName("jp.ag(IIB)V")
    public void method4617(int arg0, int arg1) {
        this.field3086[arg0] = arg1;
        this.field3087[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("jp.al(Ljq;B)I")
    public int method4680(class267 arg0) {
        int var2 = (arg0.field3139 * arg0.field3138 >> 12) + arg0.field3137;
        int var3 = ((this.field3078[arg0.field3150] - 8192) * this.field3092[arg0.field3150] >> 12) + var2;
        class260 var4 = arg0.field3132;
        if (var4.field3060 > 0 && (var4.field3059 > 0 || this.field3079[arg0.field3150] > 0)) {
            int var5 = var4.field3059 << 2;
            int var6 = var4.field3061 << 1;
            if (arg0.field3145 < var6) {
                var5 = arg0.field3145 * var5 / var6;
            }
            int var7 = (this.field3079[arg0.field3150] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field3146 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field3131.field267 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field4059 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("jp.aa(Ljq;I)I")
    public int method4619(class267 arg0) {
        class260 var2 = arg0.field3132;
        int var3 = this.field3072[arg0.field3150] * this.field3077[arg0.field3150] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field3133 * var4 + 16384 >> 15;
        int var6 = this.field3070 * var5 + 128 >> 8;
        if (var2.field3053 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field3140 * 1.953125E-5D * (double) var2.field3053) + 0.5D);
        }
        if (var2.field3057 != null) {
            int var7 = arg0.field3141;
            int var8 = var2.field3057[arg0.field3142 + 1];
            if (arg0.field3142 < var2.field3057.length - 2) {
                int var9 = (var2.field3057[arg0.field3142] & 0xFF) << 8;
                int var10 = (var2.field3057[arg0.field3142 + 2] & 0xFF) << 8;
                var8 += (var2.field3057[arg0.field3142 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field3143 > 0 && var2.field3055 != null) {
            int var11 = arg0.field3143;
            int var12 = var2.field3055[arg0.field3144 + 1];
            if (arg0.field3144 < var2.field3055.length - 2) {
                int var13 = (var2.field3055[arg0.field3144] & 0xFF) << 8;
                int var14 = (var2.field3055[arg0.field3144 + 2] & 0xFF) << 8;
                var12 += (var2.field3055[arg0.field3144 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("jp.as(Ljq;I)I")
    public int method4620(class267 arg0) {
        int var2 = this.field3090[arg0.field3150];
        return var2 < 8192 ? arg0.field3148 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field3148) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("jp.s()Lai;")
    public synchronized class46 method664() {
        return this.field3084;
    }

    @ObfuscatedName("jp.j()Lai;")
    public synchronized class46 method678() {
        return null;
    }

    @ObfuscatedName("jp.w()I")
    public synchronized int method666() {
        return 0;
    }

    @ObfuscatedName("jp.n([III)V")
    public synchronized void method667(int[] arg0, int arg1, int arg2) {
        if (this.field3069.method4709()) {
            int var4 = this.field3076 * this.field3069.field3100 / Statics.field4059;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field3094;
                if (this.field3095 - var5 >= 0L) {
                    this.field3094 = var5;
                    break;
                }
                int var7 = (int) ((this.field3095 - this.field3094 + (long) var4 - 1L) / (long) var4);
                this.field3094 += (long) var4 * (long) var7;
                this.field3084.method667(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method4624();
            } while (this.field3069.method4709());
        }
        this.field3084.method667(arg0, arg1, arg2);
    }

    @ObfuscatedName("jp.o(I)V")
    public synchronized void method669(int arg0) {
        if (this.field3069.method4709()) {
            int var2 = this.field3076 * this.field3069.field3100 / Statics.field4059;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field3094;
                if (this.field3095 - var3 >= 0L) {
                    this.field3094 = var3;
                    break;
                }
                int var5 = (int) ((this.field3095 - this.field3094 + (long) var2 - 1L) / (long) var2);
                this.field3094 += (long) var2 * (long) var5;
                this.field3084.method669(var5);
                arg0 -= var5;
                this.method4624();
            } while (this.field3069.method4709());
        }
        this.field3084.method669(arg0);
    }

    @ObfuscatedName("jp.at(B)V")
    public void method4624() {
        int var1 = this.field3091;
        int var2 = this.field3071;
        long var3 = this.field3095;
        while (this.field3071 == var2) {
            while (this.field3069.field3102[var1] == var2) {
                this.field3069.method4722(var1);
                int var5 = this.field3069.method4714(var1);
                if (var5 == 1) {
                    this.field3069.method4731();
                    this.field3069.method4756(var1);
                    if (this.field3069.method4718()) {
                        if (!this.field3073 || var2 == 0) {
                            this.method4613();
                            this.field3069.method4708();
                            return;
                        }
                        this.field3069.method4720(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method4616(var5);
                }
                this.field3069.method4713(var1);
                this.field3069.method4756(var1);
            }
            var1 = this.field3069.method4717();
            var2 = this.field3069.field3102[var1];
            var3 = this.field3069.method4710(var2);
        }
        this.field3091 = var1;
        this.field3071 = var2;
        this.field3095 = var3;
    }

    @ObfuscatedName("jp.ai(Ljq;I)Z")
    public boolean method4625(class267 arg0) {
        if (arg0.field3147 != null) {
            return false;
        }
        if (arg0.field3143 >= 0) {
            arg0.method6163();
            if (arg0.field3129 > 0 && this.field3089[arg0.field3150][arg0.field3129] == arg0) {
                this.field3089[arg0.field3150][arg0.field3129] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("jp.aq(Ljq;[IIIB)Z")
    public boolean method4626(class267 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field3135 = Statics.field4059 / 100;
        if (arg0.field3143 >= 0 && arg0.field3147 == null || arg0.field3147.method824()) {
            arg0.method4785();
            arg0.method6163();
            if (arg0.field3129 > 0 && this.field3089[arg0.field3150][arg0.field3129] == arg0) {
                this.field3089[arg0.field3150][arg0.field3129] = null;
            }
            return true;
        }
        int var5 = arg0.field3139;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field3080[arg0.field3150] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field3139 = var6;
        }
        arg0.field3147.method919(this.method4680(arg0));
        class260 var7 = arg0.field3132;
        boolean var8 = false;
        arg0.field3145++;
        arg0.field3146 += var7.field3060;
        double var9 = (double) ((arg0.field3134 - 60 << 8) + (arg0.field3139 * arg0.field3138 >> 12)) * 5.086263020833333E-6D;
        if (var7.field3053 > 0) {
            if (var7.field3058 > 0) {
                arg0.field3140 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3058 * var9) + 0.5D);
            } else {
                arg0.field3140 += 128;
            }
        }
        if (var7.field3057 != null) {
            if (var7.field3056 > 0) {
                arg0.field3141 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3056 * var9) + 0.5D);
            } else {
                arg0.field3141 += 128;
            }
            while (arg0.field3142 < var7.field3057.length - 2 && arg0.field3141 > (var7.field3057[arg0.field3142 + 2] & 0xFF) << 8) {
                arg0.field3142 += 2;
            }
            if (arg0.field3142 == var7.field3057.length - 2 && var7.field3057[arg0.field3142 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field3143 >= 0 && var7.field3055 != null && (this.field3082[arg0.field3150] & 0x1) == 0 && (arg0.field3129 < 0 || this.field3089[arg0.field3150][arg0.field3129] != arg0)) {
            if (var7.field3054 > 0) {
                arg0.field3143 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3054 * var9) + 0.5D);
            } else {
                arg0.field3143 += 128;
            }
            while (arg0.field3144 < var7.field3055.length - 2 && arg0.field3143 > (var7.field3055[arg0.field3144 + 2] & 0xFF) << 8) {
                arg0.field3144 += 2;
            }
            if (arg0.field3144 == var7.field3055.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field3147.method891(arg0.field3135, this.method4619(arg0), this.method4620(arg0));
            return false;
        }
        arg0.field3147.method910(arg0.field3135);
        if (arg1 == null) {
            arg0.field3147.method669(arg3);
        } else {
            arg0.field3147.method667(arg1, arg2, arg3);
        }
        if (arg0.field3147.method827()) {
            this.field3084.field3125.method658(arg0.field3147);
        }
        arg0.method4785();
        if (arg0.field3143 >= 0) {
            arg0.method6163();
            if (arg0.field3129 > 0 && this.field3089[arg0.field3150][arg0.field3129] == arg0) {
                this.field3089[arg0.field3150][arg0.field3129] = null;
            }
        }
        return true;
    }
}
