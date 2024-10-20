package deob;

@ObfuscatedName("je")
public class class275 extends class46 {

    @ObfuscatedName("je.s")
    public class421 field3226 = new class421(128);

    @ObfuscatedName("je.h")
    public int field3207 = 256;

    @ObfuscatedName("je.v")
    public int field3208 = 1000000;

    @ObfuscatedName("je.c")
    public int[] field3229 = new int[16];

    @ObfuscatedName("je.q")
    public int[] field3209 = new int[16];

    @ObfuscatedName("je.i")
    public int[] field3211 = new int[16];

    @ObfuscatedName("je.k")
    public int[] field3206 = new int[16];

    @ObfuscatedName("je.o")
    public int[] field3213 = new int[16];

    @ObfuscatedName("je.n")
    public int[] field3225 = new int[16];

    @ObfuscatedName("je.d")
    public int[] field3210 = new int[16];

    @ObfuscatedName("je.a")
    public int[] field3219 = new int[16];

    @ObfuscatedName("je.m")
    public int[] field3217 = new int[16];

    @ObfuscatedName("je.e")
    public int[] field3224 = new int[16];

    @ObfuscatedName("je.b")
    public int[] field3220 = new int[16];

    @ObfuscatedName("je.x")
    public int[] field3221 = new int[16];

    @ObfuscatedName("je.f")
    public int[] field3222 = new int[16];

    @ObfuscatedName("je.t")
    public int[] field3223 = new int[16];

    @ObfuscatedName("je.j")
    public int[] field3215 = new int[16];

    @ObfuscatedName("je.g")
    public class280[][] field3230 = new class280[16][128];

    @ObfuscatedName("je.ar")
    public class280[][] field3212 = new class280[16][128];

    @ObfuscatedName("je.aq")
    public class276 field3227 = new class276();

    @ObfuscatedName("je.av")
    public boolean field3214;

    @ObfuscatedName("je.aj")
    public int field3216;

    @ObfuscatedName("je.ax")
    public int field3228;

    @ObfuscatedName("je.ab")
    public long field3231;

    @ObfuscatedName("je.ak")
    public long field3232;

    @ObfuscatedName("je.au")
    public class278 field3233 = new class278(this);

    public class275() {
        this.method4714();
    }

    @ObfuscatedName("je.s(II)V")
    public synchronized void method4691(int arg0) {
        this.field3207 = arg0;
    }

    @ObfuscatedName("je.h(I)I")
    public int method4712() {
        return this.field3207;
    }

    @ObfuscatedName("je.w(Lja;Lls;Lap;II)Z")
    public synchronized boolean method4678(class279 arg0, class316 arg1, class43 arg2, int arg3) {
        arg0.method4854();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class408 var7 = (class408) arg0.field3262.method6694(); var7 != null; var7 = (class408) arg0.field3262.method6681()) {
            int var8 = (int) var7.field4468;
            class277 var9 = (class277) this.field3226.method6695((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method5186(var8);
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
                this.field3226.method6683(var11, (long) var8);
            }
            if (!var9.method4835(arg2, var7.field4465, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method4855();
        }
        return var5;
    }

    @ObfuscatedName("je.v(I)V")
    public synchronized void method4781() {
        for (class277 var1 = (class277) this.field3226.method6694(); var1 != null; var1 = (class277) this.field3226.method6681()) {
            var1.method4834();
        }
    }

    @ObfuscatedName("je.c(I)V")
    public synchronized void method4680() {
        for (class277 var1 = (class277) this.field3226.method6694(); var1 != null; var1 = (class277) this.field3226.method6681()) {
            var1.method6409();
        }
    }

    @ObfuscatedName("je.n(Lja;ZI)V")
    public synchronized void method4681(class279 arg0, boolean arg1) {
        this.method4761();
        this.field3227.method4785(arg0.field3263);
        this.field3214 = arg1;
        this.field3231 = 0L;
        int var3 = this.field3227.method4826();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3227.method4792(var4);
            this.field3227.method4825(var4);
            this.field3227.method4790(var4);
        }
        this.field3216 = this.field3227.method4797();
        this.field3228 = this.field3227.field3247[this.field3216];
        this.field3232 = this.field3227.method4796(this.field3228);
    }

    @ObfuscatedName("je.a(B)V")
    public synchronized void method4761() {
        this.field3227.method4786();
        this.method4714();
    }

    @ObfuscatedName("je.m(B)Z")
    public synchronized boolean method4752() {
        return this.field3227.method4787();
    }

    @ObfuscatedName("je.u(IIB)V")
    public synchronized void method4684(int arg0, int arg1) {
        this.method4685(arg0, arg1);
    }

    @ObfuscatedName("je.l(IIB)V")
    public void method4685(int arg0, int arg1) {
        this.field3206[arg0] = arg1;
        this.field3225[arg0] = arg1 & 0xFFFFFF80;
        this.method4686(arg0, arg1);
    }

    @ObfuscatedName("je.z(III)V")
    public void method4686(int arg0, int arg1) {
        if (this.field3213[arg0] != arg1) {
            this.field3213[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field3212[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("je.r(IIII)V")
    public void method4687(int arg0, int arg1, int arg2) {
        this.method4689(arg0, arg1, 64);
        if ((this.field3224[arg0] & 0x2) != 0) {
            for (class280 var4 = (class280) this.field3233.field3260.method5424(); var4 != null; var4 = (class280) this.field3233.field3260.method5434()) {
                if (var4.field3281 == arg0 && var4.field3267 < 0) {
                    this.field3230[arg0][var4.field3287] = null;
                    this.field3230[arg0][arg1] = var4;
                    int var5 = (var4.field3274 * var4.field3273 >> 12) + var4.field3272;
                    var4.field3272 += arg1 - var4.field3287 << 8;
                    var4.field3273 = var5 - var4.field3272;
                    var4.field3274 = 4096;
                    var4.field3287 = arg1;
                    return;
                }
            }
        }
        class277 var6 = (class277) this.field3226.method6695((long) this.field3213[arg0]);
        if (var6 == null) {
            return;
        }
        class38 var7 = var6.field3251[arg1];
        if (var7 == null) {
            return;
        }
        class280 var8 = new class280();
        var8.field3281 = arg0;
        var8.field3265 = var6;
        var8.field3266 = var7;
        var8.field3285 = var6.field3256[arg1];
        var8.field3268 = var6.field3254[arg1];
        var8.field3287 = arg1;
        var8.field3270 = var6.field3249 * arg2 * arg2 * var6.field3253[arg1] + 1024 >> 11;
        var8.field3271 = var6.field3252[arg1] & 0xFF;
        var8.field3272 = (arg1 << 8) - (var6.field3250[arg1] & 0x7FFF);
        var8.field3264 = 0;
        var8.field3276 = 0;
        var8.field3277 = 0;
        var8.field3267 = -1;
        var8.field3282 = 0;
        if (this.field3222[arg0] == 0) {
            var8.field3275 = class45.method742(var7, this.method4701(var8), this.method4702(var8), this.method4770(var8));
        } else {
            var8.field3275 = class45.method742(var7, this.method4701(var8), 0, this.method4770(var8));
            this.method4688(var8, var6.field3250[arg1] < 0);
        }
        if (var6.field3250[arg1] < 0) {
            var8.field3275.method758(-1);
        }
        if (var8.field3268 >= 0) {
            class280 var9 = this.field3212[arg0][var8.field3268];
            if (var9 != null && var9.field3267 < 0) {
                this.field3230[arg0][var9.field3287] = null;
                var9.field3267 = 0;
            }
            this.field3212[arg0][var8.field3268] = var8;
        }
        this.field3233.field3260.method5425(var8);
        this.field3230[arg0][arg1] = var8;
    }

    @ObfuscatedName("je.y(Ljl;ZI)V")
    public void method4688(class280 arg0, boolean arg1) {
        int var3 = arg0.field3266.field264.length;
        int var5;
        if (arg1 && arg0.field3266.field265) {
            int var4 = var3 + var3 - arg0.field3266.field263;
            var5 = (int) ((long) this.field3222[arg0.field3281] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field3275.method751(true);
            }
        } else {
            var5 = (int) ((long) this.field3222[arg0.field3281] * (long) var3 >> 6);
        }
        arg0.field3275.method762(var5);
    }

    @ObfuscatedName("je.p(IIIB)V")
    public void method4689(int arg0, int arg1, int arg2) {
        class280 var4 = this.field3230[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field3230[arg0][arg1] = null;
        if ((this.field3224[arg0] & 0x2) == 0) {
            var4.field3267 = 0;
            return;
        }
        for (class280 var5 = (class280) this.field3233.field3260.method5442(); var5 != null; var5 = (class280) this.field3233.field3260.method5426()) {
            if (var4.field3281 == var5.field3281 && var5.field3267 < 0 && var4 != var5) {
                var4.field3267 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("je.e(IIII)V")
    public void method4690(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("je.b(IIS)V")
    public void method4764(int arg0, int arg1) {
    }

    @ObfuscatedName("je.x(III)V")
    public void method4692(int arg0, int arg1) {
        this.field3210[arg0] = arg1;
    }

    @ObfuscatedName("je.f(II)V")
    public void method4693(int arg0) {
        for (class280 var2 = (class280) this.field3233.field3260.method5442(); var2 != null; var2 = (class280) this.field3233.field3260.method5426()) {
            if (arg0 < 0 || var2.field3281 == arg0) {
                if (var2.field3275 != null) {
                    var2.field3275.method754(Statics.field4153 / 100);
                    if (var2.field3275.method779()) {
                        this.field3233.field3259.method590(var2.field3275);
                    }
                    var2.method4861();
                }
                if (var2.field3267 < 0) {
                    this.field3230[var2.field3281][var2.field3287] = null;
                }
                var2.method6409();
            }
        }
    }

    @ObfuscatedName("je.t(II)V")
    public void method4694(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method4694(var2);
            }
            return;
        }
        this.field3229[arg0] = 12800;
        this.field3209[arg0] = 8192;
        this.field3211[arg0] = 16383;
        this.field3210[arg0] = 8192;
        this.field3219[arg0] = 0;
        this.field3217[arg0] = 8192;
        this.method4697(arg0);
        this.method4698(arg0);
        this.field3224[arg0] = 0;
        this.field3220[arg0] = 32767;
        this.field3221[arg0] = 256;
        this.field3222[arg0] = 0;
        this.method4700(arg0, 8192);
    }

    @ObfuscatedName("je.j(II)V")
    public void method4736(int arg0) {
        for (class280 var2 = (class280) this.field3233.field3260.method5442(); var2 != null; var2 = (class280) this.field3233.field3260.method5426()) {
            if ((arg0 < 0 || var2.field3281 == arg0) && var2.field3267 < 0) {
                this.field3230[var2.field3281][var2.field3287] = null;
                var2.field3267 = 0;
            }
        }
    }

    @ObfuscatedName("je.as(I)V")
    public void method4714() {
        this.method4693(-1);
        this.method4694(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field3213[var1] = this.field3206[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field3225[var2] = this.field3206[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("je.ay(IB)V")
    public void method4697(int arg0) {
        if ((this.field3224[arg0] & 0x2) == 0) {
            return;
        }
        for (class280 var2 = (class280) this.field3233.field3260.method5442(); var2 != null; var2 = (class280) this.field3233.field3260.method5426()) {
            if (var2.field3281 == arg0 && this.field3230[arg0][var2.field3287] == null && var2.field3267 < 0) {
                var2.field3267 = 0;
            }
        }
    }

    @ObfuscatedName("je.ag(II)V")
    public void method4698(int arg0) {
        if ((this.field3224[arg0] & 0x4) == 0) {
            return;
        }
        for (class280 var2 = (class280) this.field3233.field3260.method5442(); var2 != null; var2 = (class280) this.field3233.field3260.method5426()) {
            if (var2.field3281 == arg0) {
                var2.field3284 = 0;
            }
        }
    }

    @ObfuscatedName("je.an(IB)V")
    public void method4699(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method4689(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method4687(var6, var7, var8);
            } else {
                this.method4689(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method4690(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field3225[var12] = (var14 << 14) + (this.field3225[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field3225[var12] = (var14 << 7) + (this.field3225[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field3219[var12] = (var14 << 7) + (this.field3219[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field3219[var12] = (this.field3219[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field3217[var12] = (var14 << 7) + (this.field3217[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field3217[var12] = (this.field3217[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field3229[var12] = (var14 << 7) + (this.field3229[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field3229[var12] = (this.field3229[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field3209[var12] = (var14 << 7) + (this.field3209[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field3209[var12] = (this.field3209[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field3211[var12] = (var14 << 7) + (this.field3211[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field3211[var12] = (this.field3211[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field3224[var12] |= 0x1;
                } else {
                    this.field3224[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field3224[var12] |= 0x2;
                } else {
                    this.method4697(var12);
                    this.field3224[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field3220[var12] = (var14 << 7) + (this.field3220[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field3220[var12] = (this.field3220[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field3220[var12] = (var14 << 7) + (this.field3220[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field3220[var12] = (this.field3220[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method4693(var12);
            }
            if (var13 == 121) {
                this.method4694(var12);
            }
            if (var13 == 123) {
                this.method4736(var12);
            }
            if (var13 == 6) {
                int var15 = this.field3220[var12];
                if (var15 == 16384) {
                    this.field3221[var12] = (var14 << 7) + (this.field3221[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field3220[var12];
                if (var16 == 16384) {
                    this.field3221[var12] = (this.field3221[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field3222[var12] = (var14 << 7) + (this.field3222[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field3222[var12] = (this.field3222[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field3224[var12] |= 0x4;
                } else {
                    this.method4698(var12);
                    this.field3224[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method4700(var12, (var14 << 7) + (this.field3223[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method4700(var12, (this.field3223[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method4686(var17, this.field3225[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method4764(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method4692(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method4714();
            }
        }
    }

    @ObfuscatedName("je.ah(IIS)V")
    public void method4700(int arg0, int arg1) {
        this.field3223[arg0] = arg1;
        this.field3215[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("je.aa(Ljl;B)I")
    public int method4701(class280 arg0) {
        int var2 = (arg0.field3274 * arg0.field3273 >> 12) + arg0.field3272;
        int var3 = ((this.field3210[arg0.field3281] - 8192) * this.field3221[arg0.field3281] >> 12) + var2;
        class273 var4 = arg0.field3285;
        if (var4.field3194 > 0 && (var4.field3195 > 0 || this.field3219[arg0.field3281] > 0)) {
            int var5 = var4.field3195 << 2;
            int var6 = var4.field3197 << 1;
            if (arg0.field3269 < var6) {
                var5 = arg0.field3269 * var5 / var6;
            }
            int var7 = (this.field3219[arg0.field3281] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field3280 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field3266.field261 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field4153 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("je.at(Ljl;S)I")
    public int method4702(class280 arg0) {
        class273 var2 = arg0.field3285;
        int var3 = this.field3211[arg0.field3281] * this.field3229[arg0.field3281] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field3270 * var4 + 16384 >> 15;
        int var6 = this.field3207 * var5 + 128 >> 8;
        if (var2.field3191 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field3264 * 1.953125E-5D * (double) var2.field3191) + 0.5D);
        }
        if (var2.field3190 != null) {
            int var7 = arg0.field3276;
            int var8 = var2.field3190[arg0.field3277 + 1];
            if (arg0.field3277 < var2.field3190.length - 2) {
                int var9 = (var2.field3190[arg0.field3277] & 0xFF) << 8;
                int var10 = (var2.field3190[arg0.field3277 + 2] & 0xFF) << 8;
                var8 += (var2.field3190[arg0.field3277 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field3267 > 0 && var2.field3196 != null) {
            int var11 = arg0.field3267;
            int var12 = var2.field3196[arg0.field3282 + 1];
            if (arg0.field3282 < var2.field3196.length - 2) {
                int var13 = (var2.field3196[arg0.field3282] & 0xFF) << 8;
                int var14 = (var2.field3196[arg0.field3282 + 2] & 0xFF) << 8;
                var12 += (var2.field3196[arg0.field3282 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("je.bq(Ljl;S)I")
    public int method4770(class280 arg0) {
        int var2 = this.field3209[arg0.field3281];
        return var2 < 8192 ? arg0.field3271 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field3271) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("je.q()Lah;")
    public synchronized class46 method582() {
        return this.field3233;
    }

    @ObfuscatedName("je.i()Lah;")
    public synchronized class46 method595() {
        return null;
    }

    @ObfuscatedName("je.k()I")
    public synchronized int method584() {
        return 0;
    }

    @ObfuscatedName("je.o([III)V")
    public synchronized void method577(int[] arg0, int arg1, int arg2) {
        if (this.field3227.method4787()) {
            int var4 = this.field3208 * this.field3227.field3235 / Statics.field4153;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field3231;
                if (this.field3232 - var5 >= 0L) {
                    this.field3231 = var5;
                    break;
                }
                int var7 = (int) ((this.field3232 - this.field3231 + (long) var4 - 1L) / (long) var4);
                this.field3231 += (long) var4 * (long) var7;
                this.field3233.method577(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method4704();
            } while (this.field3227.method4787());
        }
        this.field3233.method577(arg0, arg1, arg2);
    }

    @ObfuscatedName("je.d(I)V")
    public synchronized void method587(int arg0) {
        if (this.field3227.method4787()) {
            int var2 = this.field3208 * this.field3227.field3235 / Statics.field4153;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field3231;
                if (this.field3232 - var3 >= 0L) {
                    this.field3231 = var3;
                    break;
                }
                int var5 = (int) ((this.field3232 - this.field3231 + (long) var2 - 1L) / (long) var2);
                this.field3231 += (long) var2 * (long) var5;
                this.field3233.method587(var5);
                arg0 -= var5;
                this.method4704();
            } while (this.field3227.method4787());
        }
        this.field3233.method587(arg0);
    }

    @ObfuscatedName("je.bn(I)V")
    public void method4704() {
        int var1 = this.field3216;
        int var2 = this.field3228;
        long var3 = this.field3232;
        while (this.field3228 == var2) {
            while (this.field3227.field3247[var1] == var2) {
                this.field3227.method4792(var1);
                int var5 = this.field3227.method4793(var1);
                if (var5 == 1) {
                    this.field3227.method4791();
                    this.field3227.method4790(var1);
                    if (this.field3227.method4804()) {
                        if (!this.field3214 || var2 == 0) {
                            this.method4714();
                            this.field3227.method4786();
                            return;
                        }
                        this.field3227.method4799(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method4699(var5);
                }
                this.field3227.method4825(var1);
                this.field3227.method4790(var1);
            }
            var1 = this.field3227.method4797();
            var2 = this.field3227.field3247[var1];
            var3 = this.field3227.method4796(var2);
        }
        this.field3216 = var1;
        this.field3228 = var2;
        this.field3232 = var3;
    }

    @ObfuscatedName("je.bl(Ljl;I)Z")
    public boolean method4705(class280 arg0) {
        if (arg0.field3275 != null) {
            return false;
        }
        if (arg0.field3267 >= 0) {
            arg0.method6409();
            if (arg0.field3268 > 0 && this.field3212[arg0.field3281][arg0.field3268] == arg0) {
                this.field3212[arg0.field3281][arg0.field3268] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("je.bv(Ljl;[IIII)Z")
    public boolean method4706(class280 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field3283 = Statics.field4153 / 100;
        if (arg0.field3267 >= 0 && arg0.field3275 == null || arg0.field3275.method757()) {
            arg0.method4861();
            arg0.method6409();
            if (arg0.field3268 > 0 && this.field3212[arg0.field3281][arg0.field3268] == arg0) {
                this.field3212[arg0.field3281][arg0.field3268] = null;
            }
            return true;
        }
        int var5 = arg0.field3274;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field3217[arg0.field3281] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field3274 = var6;
        }
        arg0.field3275.method775(this.method4701(arg0));
        class273 var7 = arg0.field3285;
        boolean var8 = false;
        arg0.field3269++;
        arg0.field3280 += var7.field3194;
        double var9 = (double) ((arg0.field3287 - 60 << 8) + (arg0.field3274 * arg0.field3273 >> 12)) * 5.086263020833333E-6D;
        if (var7.field3191 > 0) {
            if (var7.field3189 > 0) {
                arg0.field3264 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3189 * var9) + 0.5D);
            } else {
                arg0.field3264 += 128;
            }
        }
        if (var7.field3190 != null) {
            if (var7.field3192 > 0) {
                arg0.field3276 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3192 * var9) + 0.5D);
            } else {
                arg0.field3276 += 128;
            }
            while (arg0.field3277 < var7.field3190.length - 2 && arg0.field3276 > (var7.field3190[arg0.field3277 + 2] & 0xFF) << 8) {
                arg0.field3277 += 2;
            }
            if (arg0.field3277 == var7.field3190.length - 2 && var7.field3190[arg0.field3277 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field3267 >= 0 && var7.field3196 != null && (this.field3224[arg0.field3281] & 0x1) == 0 && (arg0.field3268 < 0 || this.field3212[arg0.field3281][arg0.field3268] != arg0)) {
            if (var7.field3193 > 0) {
                arg0.field3267 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3193 * var9) + 0.5D);
            } else {
                arg0.field3267 += 128;
            }
            while (arg0.field3282 < var7.field3196.length - 2 && arg0.field3267 > (var7.field3196[arg0.field3282 + 2] & 0xFF) << 8) {
                arg0.field3282 += 2;
            }
            if (arg0.field3282 == var7.field3196.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field3275.method753(arg0.field3283, this.method4702(arg0), this.method4770(arg0));
            return false;
        }
        arg0.field3275.method754(arg0.field3283);
        if (arg1 == null) {
            arg0.field3275.method587(arg3);
        } else {
            arg0.field3275.method577(arg1, arg2, arg3);
        }
        if (arg0.field3275.method779()) {
            this.field3233.field3259.method590(arg0.field3275);
        }
        arg0.method4861();
        if (arg0.field3267 >= 0) {
            arg0.method6409();
            if (arg0.field3268 > 0 && this.field3212[arg0.field3281][arg0.field3268] == arg0) {
                this.field3212[arg0.field3281][arg0.field3268] = null;
            }
        }
        return true;
    }
}
