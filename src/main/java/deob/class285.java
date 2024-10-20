package deob;

@ObfuscatedName("jr")
public class class285 extends class50 {

    @ObfuscatedName("jr.a")
    public class441 field3301 = new class441(128);

    @ObfuscatedName("jr.f")
    public int field3300 = 256;

    @ObfuscatedName("jr.c")
    public int field3325 = 1000000;

    @ObfuscatedName("jr.x")
    public int[] field3302 = new int[16];

    @ObfuscatedName("jr.h")
    public int[] field3299 = new int[16];

    @ObfuscatedName("jr.j")
    public int[] field3320 = new int[16];

    @ObfuscatedName("jr.y")
    public int[] field3308 = new int[16];

    @ObfuscatedName("jr.d")
    public int[] field3306 = new int[16];

    @ObfuscatedName("jr.n")
    public int[] field3321 = new int[16];

    @ObfuscatedName("jr.r")
    public int[] field3313 = new int[16];

    @ObfuscatedName("jr.l")
    public int[] field3309 = new int[16];

    @ObfuscatedName("jr.s")
    public int[] field3310 = new int[16];

    @ObfuscatedName("jr.m")
    public int[] field3311 = new int[16];

    @ObfuscatedName("jr.q")
    public int[] field3312 = new int[16];

    @ObfuscatedName("jr.i")
    public int[] field3304 = new int[16];

    @ObfuscatedName("jr.e")
    public int[] field3326 = new int[16];

    @ObfuscatedName("jr.g")
    public int[] field3315 = new int[16];

    @ObfuscatedName("jr.k")
    public int[] field3316 = new int[16];

    @ObfuscatedName("jr.v")
    public class290[][] field3317 = new class290[16][128];

    @ObfuscatedName("jr.aj")
    public class290[][] field3318 = new class290[16][128];

    @ObfuscatedName("jr.an")
    public class286 field3319 = new class286();

    @ObfuscatedName("jr.ah")
    public boolean field3314;

    @ObfuscatedName("jr.ao")
    public int field3305;

    @ObfuscatedName("jr.ac")
    public int field3322;

    @ObfuscatedName("jr.af")
    public long field3323;

    @ObfuscatedName("jr.ad")
    public long field3324;

    @ObfuscatedName("jr.av")
    public class288 field3303 = new class288(this);

    public class285() {
        this.method4953();
    }

    @ObfuscatedName("jr.a(II)V")
    public synchronized void method4935(int arg0) {
        this.field3300 = arg0;
    }

    @ObfuscatedName("jr.f(B)I")
    public int method5046() {
        return this.field3300;
    }

    @ObfuscatedName("jr.c(Lkf;Llg;Law;IB)Z")
    public synchronized boolean method4937(class289 arg0, class330 arg1, class47 arg2, int arg3) {
        arg0.method5118();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class427 var7 = (class427) arg0.field3359.method7478(); var7 != null; var7 = (class427) arg0.field3359.method7469()) {
            int var8 = (int) var7.field4635;
            class287 var9 = (class287) this.field3301.method7466((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method5797(var8);
                class287 var11;
                if (var10 == null) {
                    var11 = null;
                } else {
                    var11 = new class287(var10);
                }
                var9 = var11;
                if (var11 == null) {
                    var5 = false;
                    continue;
                }
                this.field3301.method7468(var11, (long) var8);
            }
            if (!var9.method5100(arg2, var7.field4632, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method5116();
        }
        return var5;
    }

    @ObfuscatedName("jr.x(B)V")
    public synchronized void method4941() {
        for (class287 var1 = (class287) this.field3301.method7478(); var1 != null; var1 = (class287) this.field3301.method7469()) {
            var1.method5099();
        }
    }

    @ObfuscatedName("jr.h(I)V")
    public synchronized void method4939() {
        for (class287 var1 = (class287) this.field3301.method7478(); var1 != null; var1 = (class287) this.field3301.method7469()) {
            var1.method7170();
        }
    }

    @ObfuscatedName("jr.r(Lkf;ZB)V")
    public synchronized void method4940(class289 arg0, boolean arg1) {
        this.method5029();
        this.field3319.method5054(arg0.field3358);
        this.field3314 = arg1;
        this.field3323 = 0L;
        int var3 = this.field3319.method5055();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3319.method5058(var4);
            this.field3319.method5061(var4);
            this.field3319.method5059(var4);
        }
        this.field3305 = this.field3319.method5066();
        this.field3322 = this.field3319.field3334[this.field3305];
        this.field3324 = this.field3319.method5065(this.field3322);
    }

    @ObfuscatedName("jr.s(I)V")
    public synchronized void method5029() {
        this.field3319.method5084();
        this.method4953();
    }

    @ObfuscatedName("jr.p(B)Z")
    public synchronized boolean method4942() {
        return this.field3319.method5056();
    }

    @ObfuscatedName("jr.b(III)V")
    public synchronized void method4960(int arg0, int arg1) {
        this.method5042(arg0, arg1);
    }

    @ObfuscatedName("jr.o(III)V")
    public void method5042(int arg0, int arg1) {
        this.field3308[arg0] = arg1;
        this.field3321[arg0] = arg1 & 0xFFFFFF80;
        this.method4944(arg0, arg1);
    }

    @ObfuscatedName("jr.u(IIS)V")
    public void method4944(int arg0, int arg1) {
        if (this.field3306[arg0] != arg1) {
            this.field3306[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field3318[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("jr.z(IIII)V")
    public void method4945(int arg0, int arg1, int arg2) {
        this.method4946(arg0, arg1, 64);
        if ((this.field3311[arg0] & 0x2) != 0) {
            for (class290 var4 = (class290) this.field3303.field3353.method6039(); var4 != null; var4 = (class290) this.field3303.field3353.method6054()) {
                if (var4.field3362 == arg0 && var4.field3374 < 0) {
                    this.field3317[arg0][var4.field3365] = null;
                    this.field3317[arg0][arg1] = var4;
                    int var5 = (var4.field3370 * var4.field3369 >> 12) + var4.field3377;
                    var4.field3377 += arg1 - var4.field3365 << 8;
                    var4.field3369 = var5 - var4.field3377;
                    var4.field3370 = 4096;
                    var4.field3365 = arg1;
                    return;
                }
            }
        }
        class287 var6 = (class287) this.field3301.method7466((long) this.field3306[arg0]);
        if (var6 == null) {
            return;
        }
        class42 var7 = var6.field3343[arg1];
        if (var7 == null) {
            return;
        }
        class290 var8 = new class290();
        var8.field3362 = arg0;
        var8.field3361 = var6;
        var8.field3368 = var7;
        var8.field3375 = var6.field3347[arg1];
        var8.field3360 = var6.field3348[arg1];
        var8.field3365 = arg1;
        var8.field3366 = var6.field3351 * arg2 * arg2 * var6.field3345[arg1] + 1024 >> 11;
        var8.field3367 = var6.field3346[arg1] & 0xFF;
        var8.field3377 = (arg1 << 8) - (var6.field3344[arg1] & 0x7FFF);
        var8.field3371 = 0;
        var8.field3380 = 0;
        var8.field3373 = 0;
        var8.field3374 = -1;
        var8.field3372 = 0;
        if (this.field3326[arg0] == 0) {
            var8.field3378 = class49.method863(var7, this.method4957(var8), this.method4958(var8), this.method4959(var8));
        } else {
            var8.field3378 = class49.method863(var7, this.method4957(var8), 0, this.method4959(var8));
            this.method5049(var8, var6.field3344[arg1] < 0);
        }
        if (var6.field3344[arg1] < 0) {
            var8.field3378.method865(-1);
        }
        if (var8.field3360 >= 0) {
            class290 var9 = this.field3318[arg0][var8.field3360];
            if (var9 != null && var9.field3374 < 0) {
                this.field3317[arg0][var9.field3365] = null;
                var9.field3374 = 0;
            }
            this.field3318[arg0][var8.field3360] = var8;
        }
        this.field3303.field3353.method6031(var8);
        this.field3317[arg0][arg1] = var8;
    }

    @ObfuscatedName("jr.t(Lkj;ZI)V")
    public void method5049(class290 arg0, boolean arg1) {
        int var3 = arg0.field3368.field282.length;
        int var5;
        if (arg1 && arg0.field3368.field285) {
            int var4 = var3 + var3 - arg0.field3368.field283;
            var5 = (int) ((long) this.field3326[arg0.field3362] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field3378.method872(true);
            }
        } else {
            var5 = (int) ((long) this.field3326[arg0.field3362] * (long) var3 >> 6);
        }
        arg0.field3378.method969(var5);
    }

    @ObfuscatedName("jr.w(IIII)V")
    public void method4946(int arg0, int arg1, int arg2) {
        class290 var4 = this.field3317[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field3317[arg0][arg1] = null;
        if ((this.field3311[arg0] & 0x2) == 0) {
            var4.field3374 = 0;
            return;
        }
        for (class290 var5 = (class290) this.field3303.field3353.method6040(); var5 != null; var5 = (class290) this.field3303.field3353.method6034()) {
            if (var4.field3362 == var5.field3362 && var5.field3374 < 0 && var4 != var5) {
                var4.field3374 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("jr.m(IIII)V")
    public void method5007(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("jr.q(IIB)V")
    public void method4948(int arg0, int arg1) {
    }

    @ObfuscatedName("jr.i(IIS)V")
    public void method4949(int arg0, int arg1) {
        this.field3313[arg0] = arg1;
    }

    @ObfuscatedName("jr.e(II)V")
    public void method4966(int arg0) {
        for (class290 var2 = (class290) this.field3303.field3353.method6040(); var2 != null; var2 = (class290) this.field3303.field3353.method6034()) {
            if (arg0 < 0 || var2.field3362 == arg0) {
                if (var2.field3378 != null) {
                    var2.field3378.method867(Statics.field338 / 100);
                    if (var2.field3378.method869()) {
                        this.field3303.field3354.method713(var2.field3378);
                    }
                    var2.method5127();
                }
                if (var2.field3374 < 0) {
                    this.field3317[var2.field3362][var2.field3365] = null;
                }
                var2.method7170();
            }
        }
    }

    @ObfuscatedName("jr.ao(II)V")
    public void method4951(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method4951(var2);
            }
            return;
        }
        this.field3302[arg0] = 12800;
        this.field3299[arg0] = 8192;
        this.field3320[arg0] = 16383;
        this.field3313[arg0] = 8192;
        this.field3309[arg0] = 0;
        this.field3310[arg0] = 8192;
        this.method4954(arg0);
        this.method4936(arg0);
        this.field3311[arg0] = 0;
        this.field3312[arg0] = 32767;
        this.field3304[arg0] = 256;
        this.field3326[arg0] = 0;
        this.method4956(arg0, 8192);
    }

    @ObfuscatedName("jr.ac(IS)V")
    public void method4955(int arg0) {
        for (class290 var2 = (class290) this.field3303.field3353.method6040(); var2 != null; var2 = (class290) this.field3303.field3353.method6034()) {
            if ((arg0 < 0 || var2.field3362 == arg0) && var2.field3374 < 0) {
                this.field3317[var2.field3362][var2.field3365] = null;
                var2.field3374 = 0;
            }
        }
    }

    @ObfuscatedName("jr.af(I)V")
    public void method4953() {
        this.method4966(-1);
        this.method4951(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field3306[var1] = this.field3308[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field3321[var2] = this.field3308[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("jr.av(IB)V")
    public void method4954(int arg0) {
        if ((this.field3311[arg0] & 0x2) == 0) {
            return;
        }
        for (class290 var2 = (class290) this.field3303.field3353.method6040(); var2 != null; var2 = (class290) this.field3303.field3353.method6034()) {
            if (var2.field3362 == arg0 && this.field3317[arg0][var2.field3365] == null && var2.field3374 < 0) {
                var2.field3374 = 0;
            }
        }
    }

    @ObfuscatedName("jr.ap(II)V")
    public void method4936(int arg0) {
        if ((this.field3311[arg0] & 0x4) == 0) {
            return;
        }
        for (class290 var2 = (class290) this.field3303.field3353.method6040(); var2 != null; var2 = (class290) this.field3303.field3353.method6034()) {
            if (var2.field3362 == arg0) {
                var2.field3363 = 0;
            }
        }
    }

    @ObfuscatedName("jr.as(IB)V")
    public void method5003(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method4946(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method4945(var6, var7, var8);
            } else {
                this.method4946(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method5007(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field3321[var12] = (var14 << 14) + (this.field3321[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field3321[var12] = (var14 << 7) + (this.field3321[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field3309[var12] = (var14 << 7) + (this.field3309[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field3309[var12] = (this.field3309[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field3310[var12] = (var14 << 7) + (this.field3310[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field3310[var12] = (this.field3310[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field3302[var12] = (var14 << 7) + (this.field3302[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field3302[var12] = (this.field3302[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field3299[var12] = (var14 << 7) + (this.field3299[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field3299[var12] = (this.field3299[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field3320[var12] = (var14 << 7) + (this.field3320[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field3320[var12] = (this.field3320[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field3311[var12] |= 0x1;
                } else {
                    this.field3311[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field3311[var12] |= 0x2;
                } else {
                    this.method4954(var12);
                    this.field3311[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field3312[var12] = (var14 << 7) + (this.field3312[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field3312[var12] = (this.field3312[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field3312[var12] = (var14 << 7) + (this.field3312[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field3312[var12] = (this.field3312[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method4966(var12);
            }
            if (var13 == 121) {
                this.method4951(var12);
            }
            if (var13 == 123) {
                this.method4955(var12);
            }
            if (var13 == 6) {
                int var15 = this.field3312[var12];
                if (var15 == 16384) {
                    this.field3304[var12] = (var14 << 7) + (this.field3304[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field3312[var12];
                if (var16 == 16384) {
                    this.field3304[var12] = (this.field3304[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field3326[var12] = (var14 << 7) + (this.field3326[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field3326[var12] = (this.field3326[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field3311[var12] |= 0x4;
                } else {
                    this.method4936(var12);
                    this.field3311[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method4956(var12, (var14 << 7) + (this.field3315[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method4956(var12, (this.field3315[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method4944(var17, this.field3321[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method4948(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method4949(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method4953();
            }
        }
    }

    @ObfuscatedName("jr.aq(III)V")
    public void method4956(int arg0, int arg1) {
        this.field3315[arg0] = arg1;
        this.field3316[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("jr.al(Lkj;B)I")
    public int method4957(class290 arg0) {
        int var2 = (arg0.field3370 * arg0.field3369 >> 12) + arg0.field3377;
        int var3 = ((this.field3313[arg0.field3362] - 8192) * this.field3304[arg0.field3362] >> 12) + var2;
        class283 var4 = arg0.field3375;
        if (var4.field3288 > 0 && (var4.field3281 > 0 || this.field3309[arg0.field3362] > 0)) {
            int var5 = var4.field3281 << 2;
            int var6 = var4.field3282 << 1;
            if (arg0.field3376 < var6) {
                var5 = arg0.field3376 * var5 / var6;
            }
            int var7 = (this.field3309[arg0.field3362] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field3364 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field3368.field281 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field338 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("jr.ag(Lkj;I)I")
    public int method4958(class290 arg0) {
        class283 var2 = arg0.field3375;
        int var3 = this.field3302[arg0.field3362] * this.field3320[arg0.field3362] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field3366 * var4 + 16384 >> 15;
        int var6 = this.field3300 * var5 + 128 >> 8;
        if (var2.field3283 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field3371 * 1.953125E-5D * (double) var2.field3283) + 0.5D);
        }
        if (var2.field3289 != null) {
            int var7 = arg0.field3380;
            int var8 = var2.field3289[arg0.field3373 + 1];
            if (arg0.field3373 < var2.field3289.length - 2) {
                int var9 = (var2.field3289[arg0.field3373] & 0xFF) << 8;
                int var10 = (var2.field3289[arg0.field3373 + 2] & 0xFF) << 8;
                var8 += (var2.field3289[arg0.field3373 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field3374 > 0 && var2.field3287 != null) {
            int var11 = arg0.field3374;
            int var12 = var2.field3287[arg0.field3372 + 1];
            if (arg0.field3372 < var2.field3287.length - 2) {
                int var13 = (var2.field3287[arg0.field3372] & 0xFF) << 8;
                int var14 = (var2.field3287[arg0.field3372 + 2] & 0xFF) << 8;
                var12 += (var2.field3287[arg0.field3372 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("jr.am(Lkj;B)I")
    public int method4959(class290 arg0) {
        int var2 = this.field3299[arg0.field3362];
        return var2 < 8192 ? arg0.field3367 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field3367) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("jr.j()Lay;")
    public synchronized class50 method718() {
        return this.field3303;
    }

    @ObfuscatedName("jr.y()Lay;")
    public synchronized class50 method719() {
        return null;
    }

    @ObfuscatedName("jr.d()I")
    public synchronized int method720() {
        return 0;
    }

    @ObfuscatedName("jr.n([III)V")
    public synchronized void method721(int[] arg0, int arg1, int arg2) {
        if (this.field3319.method5056()) {
            int var4 = this.field3325 * this.field3319.field3341 / Statics.field338;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field3323;
                if (this.field3324 - var5 >= 0L) {
                    this.field3323 = var5;
                    break;
                }
                int var7 = (int) ((this.field3324 - this.field3323 + (long) var4 - 1L) / (long) var4);
                this.field3323 += (long) var4 * (long) var7;
                this.field3303.method721(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method4963();
            } while (this.field3319.method5056());
        }
        this.field3303.method721(arg0, arg1, arg2);
    }

    @ObfuscatedName("jr.l(I)V")
    public synchronized void method725(int arg0) {
        if (this.field3319.method5056()) {
            int var2 = this.field3325 * this.field3319.field3341 / Statics.field338;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field3323;
                if (this.field3324 - var3 >= 0L) {
                    this.field3323 = var3;
                    break;
                }
                int var5 = (int) ((this.field3324 - this.field3323 + (long) var2 - 1L) / (long) var2);
                this.field3323 += (long) var2 * (long) var5;
                this.field3303.method725(var5);
                arg0 -= var5;
                this.method4963();
            } while (this.field3319.method5056());
        }
        this.field3303.method725(arg0);
    }

    @ObfuscatedName("jr.az(I)V")
    public void method4963() {
        int var1 = this.field3305;
        int var2 = this.field3322;
        long var3 = this.field3324;
        while (this.field3322 == var2) {
            while (this.field3319.field3334[var1] == var2) {
                this.field3319.method5058(var1);
                int var5 = this.field3319.method5062(var1);
                if (var5 == 1) {
                    this.field3319.method5082();
                    this.field3319.method5059(var1);
                    if (this.field3319.method5067()) {
                        if (!this.field3314 || var2 == 0) {
                            this.method4953();
                            this.field3319.method5084();
                            return;
                        }
                        this.field3319.method5098(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method5003(var5);
                }
                this.field3319.method5061(var1);
                this.field3319.method5059(var1);
            }
            var1 = this.field3319.method5066();
            var2 = this.field3319.field3334[var1];
            var3 = this.field3319.method5065(var2);
        }
        this.field3305 = var1;
        this.field3322 = var2;
        this.field3324 = var3;
    }

    @ObfuscatedName("jr.ab(Lkj;B)Z")
    public boolean method4964(class290 arg0) {
        if (arg0.field3378 != null) {
            return false;
        }
        if (arg0.field3374 >= 0) {
            arg0.method7170();
            if (arg0.field3360 > 0 && this.field3318[arg0.field3362][arg0.field3360] == arg0) {
                this.field3318[arg0.field3362][arg0.field3360] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("jr.ai(Lkj;[IIIB)Z")
    public boolean method4965(class290 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field3379 = Statics.field338 / 100;
        if (arg0.field3374 >= 0 && arg0.field3378 == null || arg0.field3378.method879()) {
            arg0.method5127();
            arg0.method7170();
            if (arg0.field3360 > 0 && this.field3318[arg0.field3362][arg0.field3360] == arg0) {
                this.field3318[arg0.field3362][arg0.field3360] = null;
            }
            return true;
        }
        int var5 = arg0.field3370;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field3310[arg0.field3362] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field3370 = var6;
        }
        arg0.field3378.method909(this.method4957(arg0));
        class283 var7 = arg0.field3375;
        boolean var8 = false;
        arg0.field3376++;
        arg0.field3364 += var7.field3288;
        double var9 = (double) ((arg0.field3365 - 60 << 8) + (arg0.field3370 * arg0.field3369 >> 12)) * 5.086263020833333E-6D;
        if (var7.field3283 > 0) {
            if (var7.field3286 > 0) {
                arg0.field3371 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3286 * var9) + 0.5D);
            } else {
                arg0.field3371 += 128;
            }
        }
        if (var7.field3289 != null) {
            if (var7.field3284 > 0) {
                arg0.field3380 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3284 * var9) + 0.5D);
            } else {
                arg0.field3380 += 128;
            }
            while (arg0.field3373 < var7.field3289.length - 2 && arg0.field3380 > (var7.field3289[arg0.field3373 + 2] & 0xFF) << 8) {
                arg0.field3373 += 2;
            }
            if (arg0.field3373 == var7.field3289.length - 2 && var7.field3289[arg0.field3373 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field3374 >= 0 && var7.field3287 != null && (this.field3311[arg0.field3362] & 0x1) == 0 && (arg0.field3360 < 0 || this.field3318[arg0.field3362][arg0.field3360] != arg0)) {
            if (var7.field3285 > 0) {
                arg0.field3374 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3285 * var9) + 0.5D);
            } else {
                arg0.field3374 += 128;
            }
            while (arg0.field3372 < var7.field3287.length - 2 && arg0.field3374 > (var7.field3287[arg0.field3372 + 2] & 0xFF) << 8) {
                arg0.field3372 += 2;
            }
            if (arg0.field3372 == var7.field3287.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field3378.method858(arg0.field3379, this.method4958(arg0), this.method4959(arg0));
            return false;
        }
        arg0.field3378.method867(arg0.field3379);
        if (arg1 == null) {
            arg0.field3378.method725(arg3);
        } else {
            arg0.field3378.method721(arg1, arg2, arg3);
        }
        if (arg0.field3378.method869()) {
            this.field3303.field3354.method713(arg0.field3378);
        }
        arg0.method5127();
        if (arg0.field3374 >= 0) {
            arg0.method7170();
            if (arg0.field3360 > 0 && this.field3318[arg0.field3362][arg0.field3360] == arg0) {
                this.field3318[arg0.field3362][arg0.field3360] = null;
            }
        }
        return true;
    }
}
