package deob;

@ObfuscatedName("ky")
public class class292 extends class49 {

    @ObfuscatedName("ky.f")
    public class451 field3378 = new class451(128);

    @ObfuscatedName("ky.v")
    public int field3367 = 256;

    @ObfuscatedName("ky.s")
    public int field3368 = 1000000;

    @ObfuscatedName("ky.z")
    public int[] field3369 = new int[16];

    @ObfuscatedName("ky.j")
    public int[] field3393 = new int[16];

    @ObfuscatedName("ky.i")
    public int[] field3371 = new int[16];

    @ObfuscatedName("ky.n")
    public int[] field3389 = new int[16];

    @ObfuscatedName("ky.l")
    public int[] field3373 = new int[16];

    @ObfuscatedName("ky.k")
    public int[] field3370 = new int[16];

    @ObfuscatedName("ky.c")
    public int[] field3375 = new int[16];

    @ObfuscatedName("ky.r")
    public int[] field3381 = new int[16];

    @ObfuscatedName("ky.b")
    public int[] field3377 = new int[16];

    @ObfuscatedName("ky.x")
    public int[] field3376 = new int[16];

    @ObfuscatedName("ky.a")
    public int[] field3379 = new int[16];

    @ObfuscatedName("ky.q")
    public int[] field3380 = new int[16];

    @ObfuscatedName("ky.d")
    public int[] field3385 = new int[16];

    @ObfuscatedName("ky.e")
    public int[] field3366 = new int[16];

    @ObfuscatedName("ky.g")
    public int[] field3374 = new int[16];

    @ObfuscatedName("ky.y")
    public class297[][] field3384 = new class297[16][128];

    @ObfuscatedName("ky.af")
    public class297[][] field3392 = new class297[16][128];

    @ObfuscatedName("ky.aa")
    public class293 field3386 = new class293();

    @ObfuscatedName("ky.ai")
    public boolean field3372;

    @ObfuscatedName("ky.ag")
    public int field3388;

    @ObfuscatedName("ky.aw")
    public int field3387;

    @ObfuscatedName("ky.ar")
    public long field3390;

    @ObfuscatedName("ky.al")
    public long field3391;

    @ObfuscatedName("ky.at")
    public class295 field3383 = new class295(this);

    public class292() {
        this.method5139();
    }

    @ObfuscatedName("ky.f(II)V")
    public synchronized void method5197(int arg0) {
        this.field3367 = arg0;
    }

    @ObfuscatedName("ky.w(I)I")
    public int method5120() {
        return this.field3367;
    }

    @ObfuscatedName("ky.v(Lkd;Lln;Lah;IB)Z")
    public synchronized boolean method5121(class296 arg0, class337 arg1, class46 arg2, int arg3) {
        arg0.method5290();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class437 var7 = (class437) arg0.field3426.method7708(); var7 != null; var7 = (class437) arg0.field3426.method7709()) {
            int var8 = (int) var7.field4711;
            class294 var9 = (class294) this.field3378.method7706((long) var8);
            if (var9 == null) {
                var9 = class294.method3105(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field3378.method7716(var9, (long) var8);
            }
            if (!var9.method5268(arg2, var7.field4706, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method5289();
        }
        return var5;
    }

    @ObfuscatedName("ky.s(I)V")
    public synchronized void method5122() {
        for (class294 var1 = (class294) this.field3378.method7708(); var1 != null; var1 = (class294) this.field3378.method7709()) {
            var1.method5273();
        }
    }

    @ObfuscatedName("ky.z(I)V")
    public synchronized void method5194() {
        for (class294 var1 = (class294) this.field3378.method7708(); var1 != null; var1 = (class294) this.field3378.method7709()) {
            var1.method7431();
        }
    }

    @ObfuscatedName("ky.k(Lkd;ZI)V")
    public synchronized void method5124(class296 arg0, boolean arg1) {
        this.method5125();
        this.field3386.method5219(arg0.field3425);
        this.field3372 = arg1;
        this.field3390 = 0L;
        int var3 = this.field3386.method5222();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3386.method5247(var4);
            this.field3386.method5226(var4);
            this.field3386.method5250(var4);
        }
        this.field3388 = this.field3386.method5231();
        this.field3387 = this.field3386.field3398[this.field3388];
        this.field3391 = this.field3386.method5230(this.field3387);
    }

    @ObfuscatedName("ky.r(I)V")
    public synchronized void method5125() {
        this.field3386.method5224();
        this.method5139();
    }

    @ObfuscatedName("ky.b(I)Z")
    public synchronized boolean method5126() {
        return this.field3386.method5221();
    }

    @ObfuscatedName("ky.m(IIB)V")
    public synchronized void method5127(int arg0, int arg1) {
        this.method5128(arg0, arg1);
    }

    @ObfuscatedName("ky.t(III)V")
    public void method5128(int arg0, int arg1) {
        this.field3389[arg0] = arg1;
        this.field3370[arg0] = arg1 & 0xFFFFFF80;
        this.method5129(arg0, arg1);
    }

    @ObfuscatedName("ky.h(III)V")
    public void method5129(int arg0, int arg1) {
        if (this.field3373[arg0] != arg1) {
            this.field3373[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field3392[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("ky.p(IIII)V")
    public void method5130(int arg0, int arg1, int arg2) {
        this.method5132(arg0, arg1, 64);
        if ((this.field3376[arg0] & 0x2) != 0) {
            for (class297 var4 = (class297) this.field3383.field3421.method6238(); var4 != null; var4 = (class297) this.field3383.field3421.method6243()) {
                if (var4.field3437 == arg0 && var4.field3441 < 0) {
                    this.field3384[arg0][var4.field3432] = null;
                    this.field3384[arg0][arg1] = var4;
                    int var5 = (var4.field3440 * var4.field3429 >> 12) + var4.field3435;
                    var4.field3435 += arg1 - var4.field3432 << 8;
                    var4.field3429 = var5 - var4.field3435;
                    var4.field3440 = 4096;
                    var4.field3432 = arg1;
                    return;
                }
            }
        }
        class294 var6 = (class294) this.field3378.method7706((long) this.field3373[arg0]);
        if (var6 == null) {
            return;
        }
        class41 var7 = var6.field3418[arg1];
        if (var7 == null) {
            return;
        }
        class297 var8 = new class297();
        var8.field3437 = arg0;
        var8.field3428 = var6;
        var8.field3445 = var7;
        var8.field3430 = var6.field3409[arg1];
        var8.field3431 = var6.field3414[arg1];
        var8.field3432 = arg1;
        var8.field3433 = var6.field3413 * arg2 * arg2 * var6.field3411[arg1] + 1024 >> 11;
        var8.field3434 = var6.field3412[arg1] & 0xFF;
        var8.field3435 = (arg1 << 8) - (var6.field3419[arg1] & 0x7FFF);
        var8.field3438 = 0;
        var8.field3439 = 0;
        var8.field3443 = 0;
        var8.field3441 = -1;
        var8.field3427 = 0;
        if (this.field3385[arg0] == 0) {
            var8.field3436 = class48.method880(var7, this.method5144(var8), this.method5145(var8), this.method5118(var8));
        } else {
            var8.field3436 = class48.method880(var7, this.method5144(var8), 0, this.method5118(var8));
            this.method5152(var8, var6.field3419[arg1] < 0);
        }
        if (var6.field3419[arg1] < 0) {
            var8.field3436.method856(-1);
        }
        if (var8.field3431 >= 0) {
            class297 var9 = this.field3392[arg0][var8.field3431];
            if (var9 != null && var9.field3441 < 0) {
                this.field3384[arg0][var9.field3432] = null;
                var9.field3441 = 0;
            }
            this.field3392[arg0][var8.field3431] = var8;
        }
        this.field3383.field3421.method6236(var8);
        this.field3384[arg0][arg1] = var8;
    }

    @ObfuscatedName("ky.o(Lkv;ZI)V")
    public void method5152(class297 arg0, boolean arg1) {
        int var3 = arg0.field3445.field290.length;
        int var5;
        if (arg1 && arg0.field3445.field293) {
            int var4 = var3 + var3 - arg0.field3445.field289;
            var5 = (int) ((long) this.field3385[arg0.field3437] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field3436.method878(true);
            }
        } else {
            var5 = (int) ((long) this.field3385[arg0.field3437] * (long) var3 >> 6);
        }
        arg0.field3436.method861(var5);
    }

    @ObfuscatedName("ky.u(IIIB)V")
    public void method5132(int arg0, int arg1, int arg2) {
        class297 var4 = this.field3384[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field3384[arg0][arg1] = null;
        if ((this.field3376[arg0] & 0x2) == 0) {
            var4.field3441 = 0;
            return;
        }
        for (class297 var5 = (class297) this.field3383.field3421.method6241(); var5 != null; var5 = (class297) this.field3383.field3421.method6248()) {
            if (var4.field3437 == var5.field3437 && var5.field3441 < 0 && var4 != var5) {
                var4.field3441 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("ky.x(IIII)V")
    public void method5133(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("ky.a(III)V")
    public void method5134(int arg0, int arg1) {
    }

    @ObfuscatedName("ky.q(III)V")
    public void method5135(int arg0, int arg1) {
        this.field3375[arg0] = arg1;
    }

    @ObfuscatedName("ky.d(IB)V")
    public void method5136(int arg0) {
        for (class297 var2 = (class297) this.field3383.field3421.method6241(); var2 != null; var2 = (class297) this.field3383.field3421.method6248()) {
            if (arg0 < 0 || var2.field3437 == arg0) {
                if (var2.field3436 != null) {
                    var2.field3436.method865(Statics.field3322 / 100);
                    if (var2.field3436.method868()) {
                        this.field3383.field3423.method693(var2.field3436);
                    }
                    var2.method5301();
                }
                if (var2.field3441 < 0) {
                    this.field3384[var2.field3437][var2.field3432] = null;
                }
                var2.method7431();
            }
        }
    }

    @ObfuscatedName("ky.e(II)V")
    public void method5137(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method5137(var2);
            }
            return;
        }
        this.field3369[arg0] = 12800;
        this.field3393[arg0] = 8192;
        this.field3371[arg0] = 16383;
        this.field3375[arg0] = 8192;
        this.field3381[arg0] = 0;
        this.field3377[arg0] = 8192;
        this.method5140(arg0);
        this.method5141(arg0);
        this.field3376[arg0] = 0;
        this.field3379[arg0] = 32767;
        this.field3380[arg0] = 256;
        this.field3385[arg0] = 0;
        this.method5119(arg0, 8192);
    }

    @ObfuscatedName("ky.g(II)V")
    public void method5160(int arg0) {
        for (class297 var2 = (class297) this.field3383.field3421.method6241(); var2 != null; var2 = (class297) this.field3383.field3421.method6248()) {
            if ((arg0 < 0 || var2.field3437 == arg0) && var2.field3441 < 0) {
                this.field3384[var2.field3437][var2.field3432] = null;
                var2.field3441 = 0;
            }
        }
    }

    @ObfuscatedName("ky.y(I)V")
    public void method5139() {
        this.method5136(-1);
        this.method5137(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field3373[var1] = this.field3389[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field3370[var2] = this.field3389[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("ky.ax(II)V")
    public void method5140(int arg0) {
        if ((this.field3376[arg0] & 0x2) == 0) {
            return;
        }
        for (class297 var2 = (class297) this.field3383.field3421.method6241(); var2 != null; var2 = (class297) this.field3383.field3421.method6248()) {
            if (var2.field3437 == arg0 && this.field3384[arg0][var2.field3432] == null && var2.field3441 < 0) {
                var2.field3441 = 0;
            }
        }
    }

    @ObfuscatedName("ky.az(II)V")
    public void method5141(int arg0) {
        if ((this.field3376[arg0] & 0x4) == 0) {
            return;
        }
        for (class297 var2 = (class297) this.field3383.field3421.method6241(); var2 != null; var2 = (class297) this.field3383.field3421.method6248()) {
            if (var2.field3437 == arg0) {
                var2.field3447 = 0;
            }
        }
    }

    @ObfuscatedName("ky.ap(II)V")
    public void method5142(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method5132(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method5130(var6, var7, var8);
            } else {
                this.method5132(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method5133(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field3370[var12] = (var14 << 14) + (this.field3370[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field3370[var12] = (var14 << 7) + (this.field3370[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field3381[var12] = (var14 << 7) + (this.field3381[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field3381[var12] = (this.field3381[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field3377[var12] = (var14 << 7) + (this.field3377[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field3377[var12] = (this.field3377[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field3369[var12] = (var14 << 7) + (this.field3369[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field3369[var12] = (this.field3369[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field3393[var12] = (var14 << 7) + (this.field3393[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field3393[var12] = (this.field3393[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field3371[var12] = (var14 << 7) + (this.field3371[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field3371[var12] = (this.field3371[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field3376[var12] |= 0x1;
                } else {
                    this.field3376[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field3376[var12] |= 0x2;
                } else {
                    this.method5140(var12);
                    this.field3376[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field3379[var12] = (var14 << 7) + (this.field3379[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field3379[var12] = (this.field3379[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field3379[var12] = (var14 << 7) + (this.field3379[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field3379[var12] = (this.field3379[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method5136(var12);
            }
            if (var13 == 121) {
                this.method5137(var12);
            }
            if (var13 == 123) {
                this.method5160(var12);
            }
            if (var13 == 6) {
                int var15 = this.field3379[var12];
                if (var15 == 16384) {
                    this.field3380[var12] = (var14 << 7) + (this.field3380[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field3379[var12];
                if (var16 == 16384) {
                    this.field3380[var12] = (this.field3380[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field3385[var12] = (var14 << 7) + (this.field3385[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field3385[var12] = (this.field3385[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field3376[var12] |= 0x4;
                } else {
                    this.method5141(var12);
                    this.field3376[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method5119(var12, (var14 << 7) + (this.field3366[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method5119(var12, (this.field3366[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method5129(var17, this.field3370[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method5134(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method5135(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method5139();
            }
        }
    }

    @ObfuscatedName("ky.aq(III)V")
    public void method5119(int arg0, int arg1) {
        this.field3366[arg0] = arg1;
        this.field3374[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("ky.ak(Lkv;I)I")
    public int method5144(class297 arg0) {
        int var2 = (arg0.field3440 * arg0.field3429 >> 12) + arg0.field3435;
        int var3 = ((this.field3375[arg0.field3437] - 8192) * this.field3380[arg0.field3437] >> 12) + var2;
        class290 var4 = arg0.field3430;
        if (var4.field3355 > 0 && (var4.field3350 > 0 || this.field3381[arg0.field3437] > 0)) {
            int var5 = var4.field3350 << 2;
            int var6 = var4.field3351 << 1;
            if (arg0.field3442 < var6) {
                var5 = arg0.field3442 * var5 / var6;
            }
            int var7 = (this.field3381[arg0.field3437] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field3444 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field3445.field292 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field3322 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("ky.au(Lkv;B)I")
    public int method5145(class297 arg0) {
        class290 var2 = arg0.field3430;
        int var3 = this.field3371[arg0.field3437] * this.field3369[arg0.field3437] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field3433 * var4 + 16384 >> 15;
        int var6 = this.field3367 * var5 + 128 >> 8;
        if (var2.field3346 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field3438 * 1.953125E-5D * (double) var2.field3346) + 0.5D);
        }
        if (var2.field3354 != null) {
            int var7 = arg0.field3439;
            int var8 = var2.field3354[arg0.field3443 + 1];
            if (arg0.field3443 < var2.field3354.length - 2) {
                int var9 = (var2.field3354[arg0.field3443] & 0xFF) << 8;
                int var10 = (var2.field3354[arg0.field3443 + 2] & 0xFF) << 8;
                var8 += (var2.field3354[arg0.field3443 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field3441 > 0 && var2.field3352 != null) {
            int var11 = arg0.field3441;
            int var12 = var2.field3352[arg0.field3427 + 1];
            if (arg0.field3427 < var2.field3352.length - 2) {
                int var13 = (var2.field3352[arg0.field3427] & 0xFF) << 8;
                int var14 = (var2.field3352[arg0.field3427 + 2] & 0xFF) << 8;
                var12 += (var2.field3352[arg0.field3427 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("ky.ae(Lkv;S)I")
    public int method5118(class297 arg0) {
        int var2 = this.field3393[arg0.field3437];
        return var2 < 8192 ? arg0.field3434 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field3434) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("ky.j()Lan;")
    public synchronized class49 method714() {
        return this.field3383;
    }

    @ObfuscatedName("ky.i()Lan;")
    public synchronized class49 method699() {
        return null;
    }

    @ObfuscatedName("ky.n()I")
    public synchronized int method702() {
        return 0;
    }

    @ObfuscatedName("ky.l([III)V")
    public synchronized void method710(int[] arg0, int arg1, int arg2) {
        if (this.field3386.method5221()) {
            int var4 = this.field3368 * this.field3386.field3395 / Statics.field3322;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field3390;
                if (this.field3391 - var5 >= 0L) {
                    this.field3390 = var5;
                    break;
                }
                int var7 = (int) ((this.field3391 - this.field3390 + (long) var4 - 1L) / (long) var4);
                this.field3390 += (long) var4 * (long) var7;
                this.field3383.method710(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method5171();
            } while (this.field3386.method5221());
        }
        this.field3383.method710(arg0, arg1, arg2);
    }

    @ObfuscatedName("ky.c(I)V")
    public synchronized void method703(int arg0) {
        if (this.field3386.method5221()) {
            int var2 = this.field3368 * this.field3386.field3395 / Statics.field3322;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field3390;
                if (this.field3391 - var3 >= 0L) {
                    this.field3390 = var3;
                    break;
                }
                int var5 = (int) ((this.field3391 - this.field3390 + (long) var2 - 1L) / (long) var2);
                this.field3390 += (long) var2 * (long) var5;
                this.field3383.method703(var5);
                arg0 -= var5;
                this.method5171();
            } while (this.field3386.method5221());
        }
        this.field3383.method703(arg0);
    }

    @ObfuscatedName("ky.ah(S)V")
    public void method5171() {
        int var1 = this.field3388;
        int var2 = this.field3387;
        long var3 = this.field3391;
        while (this.field3387 == var2) {
            while (this.field3386.field3398[var1] == var2) {
                this.field3386.method5247(var1);
                int var5 = this.field3386.method5227(var1);
                if (var5 == 1) {
                    this.field3386.method5225();
                    this.field3386.method5250(var1);
                    if (this.field3386.method5232()) {
                        if (!this.field3372 || var2 == 0) {
                            this.method5139();
                            this.field3386.method5224();
                            return;
                        }
                        this.field3386.method5233(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method5142(var5);
                }
                this.field3386.method5226(var1);
                this.field3386.method5250(var1);
            }
            var1 = this.field3386.method5231();
            var2 = this.field3386.field3398[var1];
            var3 = this.field3386.method5230(var2);
        }
        this.field3388 = var1;
        this.field3387 = var2;
        this.field3391 = var3;
    }

    @ObfuscatedName("ky.ad(Lkv;I)Z")
    public boolean method5150(class297 arg0) {
        if (arg0.field3436 != null) {
            return false;
        }
        if (arg0.field3441 >= 0) {
            arg0.method7431();
            if (arg0.field3431 > 0 && this.field3392[arg0.field3437][arg0.field3431] == arg0) {
                this.field3392[arg0.field3437][arg0.field3431] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("ky.ab(Lkv;[IIII)Z")
    public boolean method5131(class297 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field3446 = Statics.field3322 / 100;
        if (arg0.field3441 >= 0 && arg0.field3436 == null || arg0.field3436.method867()) {
            arg0.method5301();
            arg0.method7431();
            if (arg0.field3431 > 0 && this.field3392[arg0.field3437][arg0.field3431] == arg0) {
                this.field3392[arg0.field3437][arg0.field3431] = null;
            }
            return true;
        }
        int var5 = arg0.field3440;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field3377[arg0.field3437] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field3440 = var6;
        }
        arg0.field3436.method971(this.method5144(arg0));
        class290 var7 = arg0.field3430;
        boolean var8 = false;
        arg0.field3442++;
        arg0.field3444 += var7.field3355;
        double var9 = (double) ((arg0.field3432 - 60 << 8) + (arg0.field3440 * arg0.field3429 >> 12)) * 5.086263020833333E-6D;
        if (var7.field3346 > 0) {
            if (var7.field3353 > 0) {
                arg0.field3438 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3353 * var9) + 0.5D);
            } else {
                arg0.field3438 += 128;
            }
        }
        if (var7.field3354 != null) {
            if (var7.field3347 > 0) {
                arg0.field3439 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3347 * var9) + 0.5D);
            } else {
                arg0.field3439 += 128;
            }
            while (arg0.field3443 < var7.field3354.length - 2 && arg0.field3439 > (var7.field3354[arg0.field3443 + 2] & 0xFF) << 8) {
                arg0.field3443 += 2;
            }
            if (arg0.field3443 == var7.field3354.length - 2 && var7.field3354[arg0.field3443 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field3441 >= 0 && var7.field3352 != null && (this.field3376[arg0.field3437] & 0x1) == 0 && (arg0.field3431 < 0 || this.field3392[arg0.field3437][arg0.field3431] != arg0)) {
            if (var7.field3348 > 0) {
                arg0.field3441 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3348 * var9) + 0.5D);
            } else {
                arg0.field3441 += 128;
            }
            while (arg0.field3427 < var7.field3352.length - 2 && arg0.field3441 > (var7.field3352[arg0.field3427 + 2] & 0xFF) << 8) {
                arg0.field3427 += 2;
            }
            if (arg0.field3427 == var7.field3352.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field3436.method864(arg0.field3446, this.method5145(arg0), this.method5118(arg0));
            return false;
        }
        arg0.field3436.method865(arg0.field3446);
        if (arg1 == null) {
            arg0.field3436.method703(arg3);
        } else {
            arg0.field3436.method710(arg1, arg2, arg3);
        }
        if (arg0.field3436.method868()) {
            this.field3383.field3423.method693(arg0.field3436);
        }
        arg0.method5301();
        if (arg0.field3441 >= 0) {
            arg0.method7431();
            if (arg0.field3431 > 0 && this.field3392[arg0.field3437][arg0.field3431] == arg0) {
                this.field3392[arg0.field3437][arg0.field3431] = null;
            }
        }
        return true;
    }
}
