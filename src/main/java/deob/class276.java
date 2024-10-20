package deob;

@ObfuscatedName("jj")
public class class276 extends class46 {

    @ObfuscatedName("jj.c")
    public class422 field3244 = new class422(128);

    @ObfuscatedName("jj.p")
    public int field3235 = 256;

    @ObfuscatedName("jj.f")
    public int field3236 = 1000000;

    @ObfuscatedName("jj.n")
    public int[] field3237 = new int[16];

    @ObfuscatedName("jj.k")
    public int[] field3238 = new int[16];

    @ObfuscatedName("jj.s")
    public int[] field3260 = new int[16];

    @ObfuscatedName("jj.q")
    public int[] field3240 = new int[16];

    @ObfuscatedName("jj.m")
    public int[] field3253 = new int[16];

    @ObfuscatedName("jj.x")
    public int[] field3242 = new int[16];

    @ObfuscatedName("jj.j")
    public int[] field3241 = new int[16];

    @ObfuscatedName("jj.v")
    public int[] field3239 = new int[16];

    @ObfuscatedName("jj.h")
    public int[] field3251 = new int[16];

    @ObfuscatedName("jj.e")
    public int[] field3247 = new int[16];

    @ObfuscatedName("jj.g")
    public int[] field3248 = new int[16];

    @ObfuscatedName("jj.y")
    public int[] field3245 = new int[16];

    @ObfuscatedName("jj.i")
    public int[] field3250 = new int[16];

    @ObfuscatedName("jj.r")
    public int[] field3234 = new int[16];

    @ObfuscatedName("jj.z")
    public int[] field3256 = new int[16];

    @ObfuscatedName("jj.o")
    public class281[][] field3252 = new class281[16][128];

    @ObfuscatedName("jj.as")
    public class281[][] field3254 = new class281[16][128];

    @ObfuscatedName("jj.ac")
    public class277 field3255 = new class277();

    @ObfuscatedName("jj.ao")
    public boolean field3243;

    @ObfuscatedName("jj.ar")
    public int field3257;

    @ObfuscatedName("jj.aq")
    public int field3249;

    @ObfuscatedName("jj.ai")
    public long field3259;

    @ObfuscatedName("jj.an")
    public long field3258;

    @ObfuscatedName("jj.aa")
    public class279 field3261 = new class279(this);

    public class276() {
        this.method4919();
    }

    @ObfuscatedName("jj.c(IB)V")
    public synchronized void method4870(int arg0) {
        this.field3235 = arg0;
    }

    @ObfuscatedName("jj.p(B)I")
    public int method4915() {
        return this.field3235;
    }

    @ObfuscatedName("jj.f(Ljd;Llv;Lax;IS)Z")
    public synchronized boolean method4872(class280 arg0, class317 arg1, class43 arg2, int arg3) {
        arg0.method5058();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class409 var7 = (class409) arg0.field3292.method6943(); var7 != null; var7 = (class409) arg0.field3292.method6944()) {
            int var8 = (int) var7.field4504;
            class278 var9 = (class278) this.field3244.method6941((long) var8);
            if (var9 == null) {
                var9 = class278.method2996(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field3244.method6948(var9, (long) var8);
            }
            if (!var9.method5039(arg2, var7.field4501, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method5060();
        }
        return var5;
    }

    @ObfuscatedName("jj.n(I)V")
    public synchronized void method4873() {
        for (class278 var1 = (class278) this.field3244.method6943(); var1 != null; var1 = (class278) this.field3244.method6944()) {
            var1.method5040();
        }
    }

    @ObfuscatedName("jj.k(I)V")
    public synchronized void method4874() {
        for (class278 var1 = (class278) this.field3244.method6943(); var1 != null; var1 = (class278) this.field3244.method6944()) {
            var1.method6657();
        }
    }

    @ObfuscatedName("jj.x(Ljd;ZI)V")
    public synchronized void method4955(class280 arg0, boolean arg1) {
        this.method4876();
        this.field3255.method4995(arg0.field3293);
        this.field3243 = arg1;
        this.field3259 = 0L;
        int var3 = this.field3255.method5003();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3255.method5027(var4);
            this.field3255.method5008(var4);
            this.field3255.method4983(var4);
        }
        this.field3257 = this.field3255.method4992();
        this.field3249 = this.field3255.field3268[this.field3257];
        this.field3258 = this.field3255.method4979(this.field3249);
    }

    @ObfuscatedName("jj.v(I)V")
    public synchronized void method4876() {
        this.field3255.method4981();
        this.method4919();
    }

    @ObfuscatedName("jj.h(I)Z")
    public synchronized boolean method4877() {
        return this.field3255.method4982();
    }

    @ObfuscatedName("jj.t(III)V")
    public synchronized void method4942(int arg0, int arg1) {
        this.method4879(arg0, arg1);
    }

    @ObfuscatedName("jj.u(III)V")
    public void method4879(int arg0, int arg1) {
        this.field3240[arg0] = arg1;
        this.field3242[arg0] = arg1 & 0xFFFFFF80;
        this.method4880(arg0, arg1);
    }

    @ObfuscatedName("jj.d(III)V")
    public void method4880(int arg0, int arg1) {
        if (this.field3253[arg0] != arg1) {
            this.field3253[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field3254[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("jj.b(IIIB)V")
    public void method4881(int arg0, int arg1, int arg2) {
        this.method4883(arg0, arg1, 64);
        if ((this.field3247[arg0] & 0x2) != 0) {
            for (class281 var4 = (class281) this.field3261.field3288.method5642(); var4 != null; var4 = (class281) this.field3261.field3288.method5650()) {
                if (var4.field3304 == arg0 && var4.field3301 < 0) {
                    this.field3252[arg0][var4.field3312] = null;
                    this.field3252[arg0][arg1] = var4;
                    int var5 = (var4.field3303 * var4.field3297 >> 12) + var4.field3294;
                    var4.field3294 += arg1 - var4.field3312 << 8;
                    var4.field3303 = var5 - var4.field3294;
                    var4.field3297 = 4096;
                    var4.field3312 = arg1;
                    return;
                }
            }
        }
        class278 var6 = (class278) this.field3244.method6941((long) this.field3253[arg0]);
        if (var6 == null) {
            return;
        }
        class38 var7 = var6.field3276[arg1];
        if (var7 == null) {
            return;
        }
        class281 var8 = new class281();
        var8.field3304 = arg0;
        var8.field3295 = var6;
        var8.field3311 = var7;
        var8.field3308 = var6.field3283[arg1];
        var8.field3315 = var6.field3282[arg1];
        var8.field3312 = arg1;
        var8.field3300 = var6.field3281 * arg2 * arg2 * var6.field3279[arg1] + 1024 >> 11;
        var8.field3298 = var6.field3280[arg1] & 0xFF;
        var8.field3294 = (arg1 << 8) - (var6.field3278[arg1] & 0x7FFF);
        var8.field3305 = 0;
        var8.field3306 = 0;
        var8.field3307 = 0;
        var8.field3301 = -1;
        var8.field3309 = 0;
        if (this.field3250[arg0] == 0) {
            var8.field3299 = class45.method824(var7, this.method4894(var8), this.method4933(var8), this.method4896(var8));
        } else {
            var8.field3299 = class45.method824(var7, this.method4894(var8), 0, this.method4896(var8));
            this.method4882(var8, var6.field3278[arg1] < 0);
        }
        if (var6.field3278[arg1] < 0) {
            var8.field3299.method826(-1);
        }
        if (var8.field3315 >= 0) {
            class281 var9 = this.field3254[arg0][var8.field3315];
            if (var9 != null && var9.field3301 < 0) {
                this.field3252[arg0][var9.field3312] = null;
                var9.field3301 = 0;
            }
            this.field3254[arg0][var8.field3315] = var8;
        }
        this.field3261.field3288.method5660(var8);
        this.field3252[arg0][arg1] = var8;
    }

    @ObfuscatedName("jj.a(Ljb;ZI)V")
    public void method4882(class281 arg0, boolean arg1) {
        int var3 = arg0.field3311.field273.length;
        int var5;
        if (arg1 && arg0.field3311.field274) {
            int var4 = var3 + var3 - arg0.field3311.field272;
            var5 = (int) ((long) this.field3250[arg0.field3304] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field3299.method830(true);
            }
        } else {
            var5 = (int) ((long) this.field3250[arg0.field3304] * (long) var3 >> 6);
        }
        arg0.field3299.method832(var5);
    }

    @ObfuscatedName("jj.l(IIII)V")
    public void method4883(int arg0, int arg1, int arg2) {
        class281 var4 = this.field3252[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field3252[arg0][arg1] = null;
        if ((this.field3247[arg0] & 0x2) == 0) {
            var4.field3301 = 0;
            return;
        }
        for (class281 var5 = (class281) this.field3261.field3288.method5647(); var5 != null; var5 = (class281) this.field3261.field3288.method5649()) {
            if (var4.field3304 == var5.field3304 && var5.field3301 < 0 && var4 != var5) {
                var4.field3301 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("jj.e(IIIB)V")
    public void method4878(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("jj.g(III)V")
    public void method4885(int arg0, int arg1) {
    }

    @ObfuscatedName("jj.y(IIS)V")
    public void method4886(int arg0, int arg1) {
        this.field3241[arg0] = arg1;
    }

    @ObfuscatedName("jj.i(IB)V")
    public void method4887(int arg0) {
        for (class281 var2 = (class281) this.field3261.field3288.method5647(); var2 != null; var2 = (class281) this.field3261.field3288.method5649()) {
            if (arg0 < 0 || var2.field3304 == arg0) {
                if (var2.field3299 != null) {
                    var2.field3299.method837(Statics.field308 / 100);
                    if (var2.field3299.method862()) {
                        this.field3261.field3286.method645(var2.field3299);
                    }
                    var2.method5070();
                }
                if (var2.field3301 < 0) {
                    this.field3252[var2.field3304][var2.field3312] = null;
                }
                var2.method6657();
            }
        }
    }

    @ObfuscatedName("jj.r(IB)V")
    public void method4897(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method4897(var2);
            }
            return;
        }
        this.field3237[arg0] = 12800;
        this.field3238[arg0] = 8192;
        this.field3260[arg0] = 16383;
        this.field3241[arg0] = 8192;
        this.field3239[arg0] = 0;
        this.field3251[arg0] = 8192;
        this.method4890(arg0);
        this.method4957(arg0);
        this.field3247[arg0] = 0;
        this.field3248[arg0] = 32767;
        this.field3245[arg0] = 256;
        this.field3250[arg0] = 0;
        this.method4893(arg0, 8192);
    }

    @ObfuscatedName("jj.aa(IB)V")
    public void method4903(int arg0) {
        for (class281 var2 = (class281) this.field3261.field3288.method5647(); var2 != null; var2 = (class281) this.field3261.field3288.method5649()) {
            if ((arg0 < 0 || var2.field3304 == arg0) && var2.field3301 < 0) {
                this.field3252[var2.field3304][var2.field3312] = null;
                var2.field3301 = 0;
            }
        }
    }

    @ObfuscatedName("jj.ak(I)V")
    public void method4919() {
        this.method4887(-1);
        this.method4897(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field3253[var1] = this.field3240[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field3242[var2] = this.field3240[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("jj.am(II)V")
    public void method4890(int arg0) {
        if ((this.field3247[arg0] & 0x2) == 0) {
            return;
        }
        for (class281 var2 = (class281) this.field3261.field3288.method5647(); var2 != null; var2 = (class281) this.field3261.field3288.method5649()) {
            if (var2.field3304 == arg0 && this.field3252[arg0][var2.field3312] == null && var2.field3301 < 0) {
                var2.field3301 = 0;
            }
        }
    }

    @ObfuscatedName("jj.ap(II)V")
    public void method4957(int arg0) {
        if ((this.field3247[arg0] & 0x4) == 0) {
            return;
        }
        for (class281 var2 = (class281) this.field3261.field3288.method5647(); var2 != null; var2 = (class281) this.field3261.field3288.method5649()) {
            if (var2.field3304 == arg0) {
                var2.field3314 = 0;
            }
        }
    }

    @ObfuscatedName("jj.az(IS)V")
    public void method4892(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method4883(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method4881(var6, var7, var8);
            } else {
                this.method4883(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method4878(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field3242[var12] = (var14 << 14) + (this.field3242[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field3242[var12] = (var14 << 7) + (this.field3242[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field3239[var12] = (var14 << 7) + (this.field3239[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field3239[var12] = (this.field3239[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field3251[var12] = (var14 << 7) + (this.field3251[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field3251[var12] = (this.field3251[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field3237[var12] = (var14 << 7) + (this.field3237[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field3237[var12] = (this.field3237[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field3238[var12] = (var14 << 7) + (this.field3238[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field3238[var12] = (this.field3238[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field3260[var12] = (var14 << 7) + (this.field3260[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field3260[var12] = (this.field3260[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field3247[var12] |= 0x1;
                } else {
                    this.field3247[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field3247[var12] |= 0x2;
                } else {
                    this.method4890(var12);
                    this.field3247[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field3248[var12] = (var14 << 7) + (this.field3248[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field3248[var12] = (this.field3248[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field3248[var12] = (var14 << 7) + (this.field3248[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field3248[var12] = (this.field3248[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method4887(var12);
            }
            if (var13 == 121) {
                this.method4897(var12);
            }
            if (var13 == 123) {
                this.method4903(var12);
            }
            if (var13 == 6) {
                int var15 = this.field3248[var12];
                if (var15 == 16384) {
                    this.field3245[var12] = (var14 << 7) + (this.field3245[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field3248[var12];
                if (var16 == 16384) {
                    this.field3245[var12] = (this.field3245[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field3250[var12] = (var14 << 7) + (this.field3250[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field3250[var12] = (this.field3250[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field3247[var12] |= 0x4;
                } else {
                    this.method4957(var12);
                    this.field3247[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method4893(var12, (var14 << 7) + (this.field3234[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method4893(var12, (this.field3234[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method4880(var17, this.field3242[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method4885(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method4886(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method4919();
            }
        }
    }

    @ObfuscatedName("jj.ad(IIB)V")
    public void method4893(int arg0, int arg1) {
        this.field3234[arg0] = arg1;
        this.field3256[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("jj.aj(Ljb;I)I")
    public int method4894(class281 arg0) {
        int var2 = (arg0.field3303 * arg0.field3297 >> 12) + arg0.field3294;
        int var3 = ((this.field3241[arg0.field3304] - 8192) * this.field3245[arg0.field3304] >> 12) + var2;
        class274 var4 = arg0.field3308;
        if (var4.field3219 > 0 && (var4.field3215 > 0 || this.field3239[arg0.field3304] > 0)) {
            int var5 = var4.field3215 << 2;
            int var6 = var4.field3223 << 1;
            if (arg0.field3310 < var6) {
                var5 = arg0.field3310 * var5 / var6;
            }
            int var7 = (this.field3239[arg0.field3304] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field3296 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field3311.field270 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field308 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("jj.ax(Ljb;B)I")
    public int method4933(class281 arg0) {
        class274 var2 = arg0.field3308;
        int var3 = this.field3260[arg0.field3304] * this.field3237[arg0.field3304] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field3300 * var4 + 16384 >> 15;
        int var6 = this.field3235 * var5 + 128 >> 8;
        if (var2.field3214 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field3305 * 1.953125E-5D * (double) var2.field3214) + 0.5D);
        }
        if (var2.field3220 != null) {
            int var7 = arg0.field3306;
            int var8 = var2.field3220[arg0.field3307 + 1];
            if (arg0.field3307 < var2.field3220.length - 2) {
                int var9 = (var2.field3220[arg0.field3307] & 0xFF) << 8;
                int var10 = (var2.field3220[arg0.field3307 + 2] & 0xFF) << 8;
                var8 += (var2.field3220[arg0.field3307 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field3301 > 0 && var2.field3213 != null) {
            int var11 = arg0.field3301;
            int var12 = var2.field3213[arg0.field3309 + 1];
            if (arg0.field3309 < var2.field3213.length - 2) {
                int var13 = (var2.field3213[arg0.field3309] & 0xFF) << 8;
                int var14 = (var2.field3213[arg0.field3309 + 2] & 0xFF) << 8;
                var12 += (var2.field3213[arg0.field3309 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("jj.av(Ljb;I)I")
    public int method4896(class281 arg0) {
        int var2 = this.field3238[arg0.field3304];
        return var2 < 8192 ? arg0.field3298 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field3298) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("jj.w()Lay;")
    public synchronized class46 method650() {
        return this.field3261;
    }

    @ObfuscatedName("jj.s()Lay;")
    public synchronized class46 method661() {
        return null;
    }

    @ObfuscatedName("jj.q()I")
    public synchronized int method652() {
        return 0;
    }

    @ObfuscatedName("jj.m([III)V")
    public synchronized void method665(int[] arg0, int arg1, int arg2) {
        if (this.field3255.method4982()) {
            int var4 = this.field3236 * this.field3255.field3263 / Statics.field308;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field3259;
                if (this.field3258 - var5 >= 0L) {
                    this.field3259 = var5;
                    break;
                }
                int var7 = (int) ((this.field3258 - this.field3259 + (long) var4 - 1L) / (long) var4);
                this.field3259 += (long) var4 * (long) var7;
                this.field3261.method665(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method4898();
            } while (this.field3255.method4982());
        }
        this.field3261.method665(arg0, arg1, arg2);
    }

    @ObfuscatedName("jj.j(I)V")
    public synchronized void method655(int arg0) {
        if (this.field3255.method4982()) {
            int var2 = this.field3236 * this.field3255.field3263 / Statics.field308;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field3259;
                if (this.field3258 - var3 >= 0L) {
                    this.field3259 = var3;
                    break;
                }
                int var5 = (int) ((this.field3258 - this.field3259 + (long) var2 - 1L) / (long) var2);
                this.field3259 += (long) var2 * (long) var5;
                this.field3261.method655(var5);
                arg0 -= var5;
                this.method4898();
            } while (this.field3255.method4982());
        }
        this.field3261.method655(arg0);
    }

    @ObfuscatedName("jj.ae(I)V")
    public void method4898() {
        int var1 = this.field3257;
        int var2 = this.field3249;
        long var3 = this.field3258;
        while (this.field3249 == var2) {
            while (this.field3255.field3268[var1] == var2) {
                this.field3255.method5027(var1);
                int var5 = this.field3255.method4988(var1);
                if (var5 == 1) {
                    this.field3255.method4986();
                    this.field3255.method4983(var1);
                    if (this.field3255.method4993()) {
                        if (!this.field3243 || var2 == 0) {
                            this.method4919();
                            this.field3255.method4981();
                            return;
                        }
                        this.field3255.method4990(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method4892(var5);
                }
                this.field3255.method5008(var1);
                this.field3255.method4983(var1);
            }
            var1 = this.field3255.method4992();
            var2 = this.field3255.field3268[var1];
            var3 = this.field3255.method4979(var2);
        }
        this.field3257 = var1;
        this.field3249 = var2;
        this.field3258 = var3;
    }

    @ObfuscatedName("jj.ay(Ljb;B)Z")
    public boolean method4901(class281 arg0) {
        if (arg0.field3299 != null) {
            return false;
        }
        if (arg0.field3301 >= 0) {
            arg0.method6657();
            if (arg0.field3315 > 0 && this.field3254[arg0.field3304][arg0.field3315] == arg0) {
                this.field3254[arg0.field3304][arg0.field3315] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("jj.ag(Ljb;[IIII)Z")
    public boolean method4900(class281 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field3313 = Statics.field308 / 100;
        if (arg0.field3301 >= 0 && arg0.field3299 == null || arg0.field3299.method840()) {
            arg0.method5070();
            arg0.method6657();
            if (arg0.field3315 > 0 && this.field3254[arg0.field3304][arg0.field3315] == arg0) {
                this.field3254[arg0.field3304][arg0.field3315] = null;
            }
            return true;
        }
        int var5 = arg0.field3297;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field3251[arg0.field3304] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field3297 = var6;
        }
        arg0.field3299.method866(this.method4894(arg0));
        class274 var7 = arg0.field3308;
        boolean var8 = false;
        arg0.field3310++;
        arg0.field3296 += var7.field3219;
        double var9 = (double) ((arg0.field3312 - 60 << 8) + (arg0.field3303 * arg0.field3297 >> 12)) * 5.086263020833333E-6D;
        if (var7.field3214 > 0) {
            if (var7.field3217 > 0) {
                arg0.field3305 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3217 * var9) + 0.5D);
            } else {
                arg0.field3305 += 128;
            }
        }
        if (var7.field3220 != null) {
            if (var7.field3218 > 0) {
                arg0.field3306 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3218 * var9) + 0.5D);
            } else {
                arg0.field3306 += 128;
            }
            while (arg0.field3307 < var7.field3220.length - 2 && arg0.field3306 > (var7.field3220[arg0.field3307 + 2] & 0xFF) << 8) {
                arg0.field3307 += 2;
            }
            if (arg0.field3307 == var7.field3220.length - 2 && var7.field3220[arg0.field3307 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field3301 >= 0 && var7.field3213 != null && (this.field3247[arg0.field3304] & 0x1) == 0 && (arg0.field3315 < 0 || this.field3254[arg0.field3304][arg0.field3315] != arg0)) {
            if (var7.field3212 > 0) {
                arg0.field3301 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3212 * var9) + 0.5D);
            } else {
                arg0.field3301 += 128;
            }
            while (arg0.field3309 < var7.field3213.length - 2 && arg0.field3301 > (var7.field3213[arg0.field3309 + 2] & 0xFF) << 8) {
                arg0.field3309 += 2;
            }
            if (arg0.field3309 == var7.field3213.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field3299.method836(arg0.field3313, this.method4933(arg0), this.method4896(arg0));
            return false;
        }
        arg0.field3299.method837(arg0.field3313);
        if (arg1 == null) {
            arg0.field3299.method655(arg3);
        } else {
            arg0.field3299.method665(arg1, arg2, arg3);
        }
        if (arg0.field3299.method862()) {
            this.field3261.field3286.method645(arg0.field3299);
        }
        arg0.method5070();
        if (arg0.field3301 >= 0) {
            arg0.method6657();
            if (arg0.field3315 > 0 && this.field3254[arg0.field3304][arg0.field3315] == arg0) {
                this.field3254[arg0.field3304][arg0.field3315] = null;
            }
        }
        return true;
    }
}
