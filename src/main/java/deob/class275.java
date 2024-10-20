package deob;

@ObfuscatedName("ji")
public class class275 extends class44 {

    @ObfuscatedName("ji.v")
    public class419 field3205 = new class419(128);

    @ObfuscatedName("ji.c")
    public int field3180 = 256;

    @ObfuscatedName("ji.i")
    public int field3181 = 1000000;

    @ObfuscatedName("ji.f")
    public int[] field3182 = new int[16];

    @ObfuscatedName("ji.b")
    public int[] field3204 = new int[16];

    @ObfuscatedName("ji.n")
    public int[] field3184 = new int[16];

    @ObfuscatedName("ji.s")
    public int[] field3185 = new int[16];

    @ObfuscatedName("ji.l")
    public int[] field3186 = new int[16];

    @ObfuscatedName("ji.q")
    public int[] field3179 = new int[16];

    @ObfuscatedName("ji.o")
    public int[] field3188 = new int[16];

    @ObfuscatedName("ji.r")
    public int[] field3187 = new int[16];

    @ObfuscatedName("ji.p")
    public int[] field3183 = new int[16];

    @ObfuscatedName("ji.x")
    public int[] field3194 = new int[16];

    @ObfuscatedName("ji.a")
    public int[] field3203 = new int[16];

    @ObfuscatedName("ji.y")
    public int[] field3193 = new int[16];

    @ObfuscatedName("ji.j")
    public int[] field3190 = new int[16];

    @ObfuscatedName("ji.e")
    public int[] field3195 = new int[16];

    @ObfuscatedName("ji.z")
    public int[] field3196 = new int[16];

    @ObfuscatedName("ji.h")
    public class280[][] field3197 = new class280[16][128];

    @ObfuscatedName("ji.ae")
    public class280[][] field3198 = new class280[16][128];

    @ObfuscatedName("ji.aq")
    public class276 field3199 = new class276();

    @ObfuscatedName("ji.aw")
    public boolean field3200;

    @ObfuscatedName("ji.am")
    public int field3201;

    @ObfuscatedName("ji.ak")
    public int field3202;

    @ObfuscatedName("ji.ao")
    public long field3189;

    @ObfuscatedName("ji.aj")
    public long field3206;

    @ObfuscatedName("ji.al")
    public class278 field3192 = new class278(this);

    public class275() {
        this.method4747();
    }

    @ObfuscatedName("ji.v(IB)V")
    public synchronized void method4809(int arg0) {
        this.field3180 = arg0;
    }

    @ObfuscatedName("ji.c(I)I")
    public int method4752() {
        return this.field3180;
    }

    @ObfuscatedName("ji.i(Lju;Lln;Lac;IB)Z")
    public synchronized boolean method4730(class279 arg0, class316 arg1, class41 arg2, int arg3) {
        arg0.method4921();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class406 var7 = (class406) arg0.field3234.method6774(); var7 != null; var7 = (class406) arg0.field3234.method6775()) {
            int var8 = (int) var7.field4410;
            class277 var9 = (class277) this.field3205.method6772((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method5301(var8);
                class277 var11;
                if (var10 == null) {
                    var11 = null;
                } else {
                    var11 = new class277(var10);
                }
                var9 = var11;
                if (var11 == null) {
                    var5 = false;
                    continue;
                }
                this.field3205.method6773(var11, (long) var8);
            }
            if (!var9.method4900(arg2, var7.field4407, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method4920();
        }
        return var5;
    }

    @ObfuscatedName("ji.f(I)V")
    public synchronized void method4731() {
        for (class277 var1 = (class277) this.field3205.method6774(); var1 != null; var1 = (class277) this.field3205.method6775()) {
            var1.method4910();
        }
    }

    @ObfuscatedName("ji.b(I)V")
    public synchronized void method4754() {
        for (class277 var1 = (class277) this.field3205.method6774(); var1 != null; var1 = (class277) this.field3205.method6775()) {
            var1.method6503();
        }
    }

    @ObfuscatedName("ji.o(Lju;ZB)V")
    public synchronized void method4733(class279 arg0, boolean arg1) {
        this.method4817();
        this.field3199.method4843(arg0.field3235);
        this.field3200 = arg1;
        this.field3189 = 0L;
        int var3 = this.field3199.method4844();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3199.method4847(var4);
            this.field3199.method4883(var4);
            this.field3199.method4842(var4);
        }
        this.field3201 = this.field3199.method4854();
        this.field3202 = this.field3199.field3207[this.field3201];
        this.field3206 = this.field3199.method4866(this.field3202);
    }

    @ObfuscatedName("ji.p(I)V")
    public synchronized void method4817() {
        this.field3199.method4896();
        this.method4747();
    }

    @ObfuscatedName("ji.w(B)Z")
    public synchronized boolean method4735() {
        return this.field3199.method4845();
    }

    @ObfuscatedName("ji.k(IIS)V")
    public synchronized void method4736(int arg0, int arg1) {
        this.method4737(arg0, arg1);
    }

    @ObfuscatedName("ji.d(III)V")
    public void method4737(int arg0, int arg1) {
        this.field3185[arg0] = arg1;
        this.field3179[arg0] = arg1 & 0xFFFFFF80;
        this.method4738(arg0, arg1);
    }

    @ObfuscatedName("ji.m(III)V")
    public void method4738(int arg0, int arg1) {
        if (this.field3186[arg0] != arg1) {
            this.field3186[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field3198[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("ji.u(IIII)V")
    public void method4739(int arg0, int arg1, int arg2) {
        this.method4740(arg0, arg1, 64);
        if ((this.field3194[arg0] & 0x2) != 0) {
            for (class280 var4 = (class280) this.field3192.field3232.method5548(); var4 != null; var4 = (class280) this.field3192.field3232.method5536()) {
                if (var4.field3249 == arg0 && var4.field3250 < 0) {
                    this.field3197[arg0][var4.field3252] = null;
                    this.field3197[arg0][arg1] = var4;
                    int var5 = (var4.field3246 * var4.field3245 >> 12) + var4.field3244;
                    var4.field3244 += arg1 - var4.field3252 << 8;
                    var4.field3245 = var5 - var4.field3244;
                    var4.field3246 = 4096;
                    var4.field3252 = arg1;
                    return;
                }
            }
        }
        class277 var6 = (class277) this.field3205.method6772((long) this.field3186[arg0]);
        if (var6 == null) {
            return;
        }
        class36 var7 = var6.field3222[arg1];
        if (var7 == null) {
            return;
        }
        class280 var8 = new class280();
        var8.field3249 = arg0;
        var8.field3237 = var6;
        var8.field3255 = var7;
        var8.field3248 = var6.field3225[arg1];
        var8.field3240 = var6.field3221[arg1];
        var8.field3252 = arg1;
        var8.field3242 = var6.field3229 * arg2 * arg2 * var6.field3224[arg1] + 1024 >> 11;
        var8.field3243 = var6.field3223[arg1] & 0xFF;
        var8.field3244 = (arg1 << 8) - (var6.field3228[arg1] & 0x7FFF);
        var8.field3247 = 0;
        var8.field3236 = 0;
        var8.field3253 = 0;
        var8.field3250 = -1;
        var8.field3251 = 0;
        if (this.field3190[arg0] == 0) {
            var8.field3241 = class43.method765(var7, this.method4734(var8), this.method4732(var8), this.method4781(var8));
        } else {
            var8.field3241 = class43.method765(var7, this.method4734(var8), 0, this.method4781(var8));
            this.method4818(var8, var6.field3228[arg1] < 0);
        }
        if (var6.field3228[arg1] < 0) {
            var8.field3241.method848(-1);
        }
        if (var8.field3240 >= 0) {
            class280 var9 = this.field3198[arg0][var8.field3240];
            if (var9 != null && var9.field3250 < 0) {
                this.field3197[arg0][var9.field3252] = null;
                var9.field3250 = 0;
            }
            this.field3198[arg0][var8.field3240] = var8;
        }
        this.field3192.field3232.method5530(var8);
        this.field3197[arg0][arg1] = var8;
    }

    @ObfuscatedName("ji.t(Ljn;ZI)V")
    public void method4818(class280 arg0, boolean arg1) {
        int var3 = arg0.field3255.field256.length;
        int var5;
        if (arg1 && arg0.field3255.field255) {
            int var4 = var3 + var3 - arg0.field3255.field254;
            var5 = (int) ((long) this.field3190[arg0.field3249] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field3241.method773(true);
            }
        } else {
            var5 = (int) ((long) this.field3190[arg0.field3249] * (long) var3 >> 6);
        }
        arg0.field3241.method772(var5);
    }

    @ObfuscatedName("ji.g(IIIS)V")
    public void method4740(int arg0, int arg1, int arg2) {
        class280 var4 = this.field3197[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field3197[arg0][arg1] = null;
        if ((this.field3194[arg0] & 0x2) == 0) {
            var4.field3250 = 0;
            return;
        }
        for (class280 var5 = (class280) this.field3192.field3232.method5540(); var5 != null; var5 = (class280) this.field3192.field3232.method5534()) {
            if (var4.field3249 == var5.field3249 && var5.field3250 < 0 && var4 != var5) {
                var4.field3250 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("ji.x(IIIB)V")
    public void method4741(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("ji.a(III)V")
    public void method4742(int arg0, int arg1) {
    }

    @ObfuscatedName("ji.y(IIS)V")
    public void method4743(int arg0, int arg1) {
        this.field3188[arg0] = arg1;
    }

    @ObfuscatedName("ji.j(IB)V")
    public void method4744(int arg0) {
        for (class280 var2 = (class280) this.field3192.field3232.method5540(); var2 != null; var2 = (class280) this.field3192.field3232.method5534()) {
            if (arg0 < 0 || var2.field3249 == arg0) {
                if (var2.field3241 != null) {
                    var2.field3241.method842(Statics.field269 / 100);
                    if (var2.field3241.method780()) {
                        this.field3192.field3233.method623(var2.field3241);
                    }
                    var2.method4931();
                }
                if (var2.field3250 < 0) {
                    this.field3197[var2.field3249][var2.field3252] = null;
                }
                var2.method6503();
            }
        }
    }

    @ObfuscatedName("ji.aj(II)V")
    public void method4745(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method4745(var2);
            }
            return;
        }
        this.field3182[arg0] = 12800;
        this.field3204[arg0] = 8192;
        this.field3184[arg0] = 16383;
        this.field3188[arg0] = 8192;
        this.field3187[arg0] = 0;
        this.field3183[arg0] = 8192;
        this.method4748(arg0);
        this.method4749(arg0);
        this.field3194[arg0] = 0;
        this.field3203[arg0] = 32767;
        this.field3193[arg0] = 256;
        this.field3190[arg0] = 0;
        this.method4782(arg0, 8192);
    }

    @ObfuscatedName("ji.al(II)V")
    public void method4746(int arg0) {
        for (class280 var2 = (class280) this.field3192.field3232.method5540(); var2 != null; var2 = (class280) this.field3192.field3232.method5534()) {
            if ((arg0 < 0 || var2.field3249 == arg0) && var2.field3250 < 0) {
                this.field3197[var2.field3249][var2.field3252] = null;
                var2.field3250 = 0;
            }
        }
    }

    @ObfuscatedName("ji.at(I)V")
    public void method4747() {
        this.method4744(-1);
        this.method4745(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field3186[var1] = this.field3185[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field3179[var2] = this.field3185[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("ji.an(IB)V")
    public void method4748(int arg0) {
        if ((this.field3194[arg0] & 0x2) == 0) {
            return;
        }
        for (class280 var2 = (class280) this.field3192.field3232.method5540(); var2 != null; var2 = (class280) this.field3192.field3232.method5534()) {
            if (var2.field3249 == arg0 && this.field3197[arg0][var2.field3252] == null && var2.field3250 < 0) {
                var2.field3250 = 0;
            }
        }
    }

    @ObfuscatedName("ji.ay(II)V")
    public void method4749(int arg0) {
        if ((this.field3194[arg0] & 0x4) == 0) {
            return;
        }
        for (class280 var2 = (class280) this.field3192.field3232.method5540(); var2 != null; var2 = (class280) this.field3192.field3232.method5534()) {
            if (var2.field3249 == arg0) {
                var2.field3239 = 0;
            }
        }
    }

    @ObfuscatedName("ji.ah(II)V")
    public void method4750(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method4740(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method4739(var6, var7, var8);
            } else {
                this.method4740(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method4741(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field3179[var12] = (var14 << 14) + (this.field3179[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field3179[var12] = (var14 << 7) + (this.field3179[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field3187[var12] = (var14 << 7) + (this.field3187[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field3187[var12] = (this.field3187[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field3183[var12] = (var14 << 7) + (this.field3183[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field3183[var12] = (this.field3183[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field3182[var12] = (var14 << 7) + (this.field3182[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field3182[var12] = (this.field3182[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field3204[var12] = (var14 << 7) + (this.field3204[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field3204[var12] = (this.field3204[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field3184[var12] = (var14 << 7) + (this.field3184[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field3184[var12] = (this.field3184[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field3194[var12] |= 0x1;
                } else {
                    this.field3194[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field3194[var12] |= 0x2;
                } else {
                    this.method4748(var12);
                    this.field3194[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field3203[var12] = (var14 << 7) + (this.field3203[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field3203[var12] = (this.field3203[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field3203[var12] = (var14 << 7) + (this.field3203[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field3203[var12] = (this.field3203[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method4744(var12);
            }
            if (var13 == 121) {
                this.method4745(var12);
            }
            if (var13 == 123) {
                this.method4746(var12);
            }
            if (var13 == 6) {
                int var15 = this.field3203[var12];
                if (var15 == 16384) {
                    this.field3193[var12] = (var14 << 7) + (this.field3193[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field3203[var12];
                if (var16 == 16384) {
                    this.field3193[var12] = (this.field3193[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field3190[var12] = (var14 << 7) + (this.field3190[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field3190[var12] = (this.field3190[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field3194[var12] |= 0x4;
                } else {
                    this.method4749(var12);
                    this.field3194[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method4782(var12, (var14 << 7) + (this.field3195[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method4782(var12, (this.field3195[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method4738(var17, this.field3179[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method4742(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method4743(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method4747();
            }
        }
    }

    @ObfuscatedName("ji.ac(III)V")
    public void method4782(int arg0, int arg1) {
        this.field3195[arg0] = arg1;
        this.field3196[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("ji.ab(Ljn;I)I")
    public int method4734(class280 arg0) {
        int var2 = (arg0.field3246 * arg0.field3245 >> 12) + arg0.field3244;
        int var3 = ((this.field3188[arg0.field3249] - 8192) * this.field3193[arg0.field3249] >> 12) + var2;
        class273 var4 = arg0.field3248;
        if (var4.field3167 > 0 && (var4.field3162 > 0 || this.field3187[arg0.field3249] > 0)) {
            int var5 = var4.field3162 << 2;
            int var6 = var4.field3168 << 1;
            if (arg0.field3254 < var6) {
                var5 = arg0.field3254 * var5 / var6;
            }
            int var7 = (this.field3187[arg0.field3249] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field3238 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field3255.field253 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field269 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("ji.au(Ljn;B)I")
    public int method4732(class280 arg0) {
        class273 var2 = arg0.field3248;
        int var3 = this.field3182[arg0.field3249] * this.field3184[arg0.field3249] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field3242 * var4 + 16384 >> 15;
        int var6 = this.field3180 * var5 + 128 >> 8;
        if (var2.field3163 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field3247 * 1.953125E-5D * (double) var2.field3163) + 0.5D);
        }
        if (var2.field3161 != null) {
            int var7 = arg0.field3236;
            int var8 = var2.field3161[arg0.field3253 + 1];
            if (arg0.field3253 < var2.field3161.length - 2) {
                int var9 = (var2.field3161[arg0.field3253] & 0xFF) << 8;
                int var10 = (var2.field3161[arg0.field3253 + 2] & 0xFF) << 8;
                var8 += (var2.field3161[arg0.field3253 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field3250 > 0 && var2.field3166 != null) {
            int var11 = arg0.field3250;
            int var12 = var2.field3166[arg0.field3251 + 1];
            if (arg0.field3251 < var2.field3166.length - 2) {
                int var13 = (var2.field3166[arg0.field3251] & 0xFF) << 8;
                int var14 = (var2.field3166[arg0.field3251 + 2] & 0xFF) << 8;
                var12 += (var2.field3166[arg0.field3251 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("ji.af(Ljn;I)I")
    public int method4781(class280 arg0) {
        int var2 = this.field3204[arg0.field3249];
        return var2 < 8192 ? arg0.field3243 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field3243) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("ji.n()Laf;")
    public synchronized class44 method615() {
        return this.field3192;
    }

    @ObfuscatedName("ji.s()Laf;")
    public synchronized class44 method616() {
        return null;
    }

    @ObfuscatedName("ji.l()I")
    public synchronized int method617() {
        return 0;
    }

    @ObfuscatedName("ji.q([III)V")
    public synchronized void method618(int[] arg0, int arg1, int arg2) {
        if (this.field3199.method4845()) {
            int var4 = this.field3181 * this.field3199.field3208 / Statics.field269;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field3189;
                if (this.field3206 - var5 >= 0L) {
                    this.field3189 = var5;
                    break;
                }
                int var7 = (int) ((this.field3206 - this.field3189 + (long) var4 - 1L) / (long) var4);
                this.field3189 += (long) var4 * (long) var7;
                this.field3192.method618(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method4758();
            } while (this.field3199.method4845());
        }
        this.field3192.method618(arg0, arg1, arg2);
    }

    @ObfuscatedName("ji.r(I)V")
    public synchronized void method620(int arg0) {
        if (this.field3199.method4845()) {
            int var2 = this.field3181 * this.field3199.field3208 / Statics.field269;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field3189;
                if (this.field3206 - var3 >= 0L) {
                    this.field3189 = var3;
                    break;
                }
                int var5 = (int) ((this.field3206 - this.field3189 + (long) var2 - 1L) / (long) var2);
                this.field3189 += (long) var2 * (long) var5;
                this.field3192.method620(var5);
                arg0 -= var5;
                this.method4758();
            } while (this.field3199.method4845());
        }
        this.field3192.method620(arg0);
    }

    @ObfuscatedName("ji.ad(I)V")
    public void method4758() {
        int var1 = this.field3201;
        int var2 = this.field3202;
        long var3 = this.field3206;
        while (this.field3202 == var2) {
            while (this.field3199.field3207[var1] == var2) {
                this.field3199.method4847(var1);
                int var5 = this.field3199.method4846(var1);
                if (var5 == 1) {
                    this.field3199.method4848();
                    this.field3199.method4842(var1);
                    if (this.field3199.method4855()) {
                        if (!this.field3200 || var2 == 0) {
                            this.method4747();
                            this.field3199.method4896();
                            return;
                        }
                        this.field3199.method4856(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method4750(var5);
                }
                this.field3199.method4883(var1);
                this.field3199.method4842(var1);
            }
            var1 = this.field3199.method4854();
            var2 = this.field3199.field3207[var1];
            var3 = this.field3199.method4866(var2);
        }
        this.field3201 = var1;
        this.field3202 = var2;
        this.field3206 = var3;
    }

    @ObfuscatedName("ji.ai(Ljn;I)Z")
    public boolean method4759(class280 arg0) {
        if (arg0.field3241 != null) {
            return false;
        }
        if (arg0.field3250 >= 0) {
            arg0.method6503();
            if (arg0.field3240 > 0 && this.field3198[arg0.field3249][arg0.field3240] == arg0) {
                this.field3198[arg0.field3249][arg0.field3240] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("ji.ax(Ljn;[IIII)Z")
    public boolean method4789(class280 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field3256 = Statics.field269 / 100;
        if (arg0.field3250 >= 0 && arg0.field3241 == null || arg0.field3241.method799()) {
            arg0.method4931();
            arg0.method6503();
            if (arg0.field3240 > 0 && this.field3198[arg0.field3249][arg0.field3240] == arg0) {
                this.field3198[arg0.field3249][arg0.field3240] = null;
            }
            return true;
        }
        int var5 = arg0.field3246;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field3183[arg0.field3249] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field3246 = var6;
        }
        arg0.field3241.method856(this.method4734(arg0));
        class273 var7 = arg0.field3248;
        boolean var8 = false;
        arg0.field3254++;
        arg0.field3238 += var7.field3167;
        double var9 = (double) ((arg0.field3252 - 60 << 8) + (arg0.field3246 * arg0.field3245 >> 12)) * 5.086263020833333E-6D;
        if (var7.field3163 > 0) {
            if (var7.field3165 > 0) {
                arg0.field3247 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3165 * var9) + 0.5D);
            } else {
                arg0.field3247 += 128;
            }
        }
        if (var7.field3161 != null) {
            if (var7.field3160 > 0) {
                arg0.field3236 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3160 * var9) + 0.5D);
            } else {
                arg0.field3236 += 128;
            }
            while (arg0.field3253 < var7.field3161.length - 2 && arg0.field3236 > (var7.field3161[arg0.field3253 + 2] & 0xFF) << 8) {
                arg0.field3253 += 2;
            }
            if (arg0.field3253 == var7.field3161.length - 2 && var7.field3161[arg0.field3253 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field3250 >= 0 && var7.field3166 != null && (this.field3194[arg0.field3249] & 0x1) == 0 && (arg0.field3240 < 0 || this.field3198[arg0.field3249][arg0.field3240] != arg0)) {
            if (var7.field3164 > 0) {
                arg0.field3250 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3164 * var9) + 0.5D);
            } else {
                arg0.field3250 += 128;
            }
            while (arg0.field3251 < var7.field3166.length - 2 && arg0.field3250 > (var7.field3166[arg0.field3251 + 2] & 0xFF) << 8) {
                arg0.field3251 += 2;
            }
            if (arg0.field3251 == var7.field3166.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field3241.method840(arg0.field3256, this.method4732(arg0), this.method4781(arg0));
            return false;
        }
        arg0.field3241.method842(arg0.field3256);
        if (arg1 == null) {
            arg0.field3241.method620(arg3);
        } else {
            arg0.field3241.method618(arg1, arg2, arg3);
        }
        if (arg0.field3241.method780()) {
            this.field3192.field3233.method623(arg0.field3241);
        }
        arg0.method4931();
        if (arg0.field3250 >= 0) {
            arg0.method6503();
            if (arg0.field3240 > 0 && this.field3198[arg0.field3249][arg0.field3240] == arg0) {
                this.field3198[arg0.field3249][arg0.field3240] = null;
            }
        }
        return true;
    }
}
