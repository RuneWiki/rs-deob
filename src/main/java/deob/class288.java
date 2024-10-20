package deob;

@ObfuscatedName("ka")
public class class288 extends class50 {

    @ObfuscatedName("ka.h")
    public class444 field3361 = new class444(128);

    @ObfuscatedName("ka.e")
    public int field3363 = 256;

    @ObfuscatedName("ka.v")
    public int field3371 = 1000000;

    @ObfuscatedName("ka.x")
    public int[] field3360 = new int[16];

    @ObfuscatedName("ka.m")
    public int[] field3364 = new int[16];

    @ObfuscatedName("ka.q")
    public int[] field3368 = new int[16];

    @ObfuscatedName("ka.f")
    public int[] field3362 = new int[16];

    @ObfuscatedName("ka.r")
    public int[] field3382 = new int[16];

    @ObfuscatedName("ka.u")
    public int[] field3374 = new int[16];

    @ObfuscatedName("ka.b")
    public int[] field3365 = new int[16];

    @ObfuscatedName("ka.j")
    public int[] field3366 = new int[16];

    @ObfuscatedName("ka.g")
    public int[] field3367 = new int[16];

    @ObfuscatedName("ka.t")
    public int[] field3357 = new int[16];

    @ObfuscatedName("ka.c")
    public int[] field3369 = new int[16];

    @ObfuscatedName("ka.p")
    public int[] field3370 = new int[16];

    @ObfuscatedName("ka.d")
    public int[] field3359 = new int[16];

    @ObfuscatedName("ka.y")
    public int[] field3372 = new int[16];

    @ObfuscatedName("ka.z")
    public int[] field3373 = new int[16];

    @ObfuscatedName("ka.w")
    public class293[][] field3358 = new class293[16][128];

    @ObfuscatedName("ka.as")
    public class293[][] field3375 = new class293[16][128];

    @ObfuscatedName("ka.ad")
    public class289 field3376 = new class289();

    @ObfuscatedName("ka.ao")
    public boolean field3356;

    @ObfuscatedName("ka.am")
    public int field3378;

    @ObfuscatedName("ka.av")
    public int field3379;

    @ObfuscatedName("ka.au")
    public long field3380;

    @ObfuscatedName("ka.ar")
    public long field3381;

    @ObfuscatedName("ka.at")
    public class291 field3377 = new class291(this);

    public class288() {
        this.method5111();
    }

    @ObfuscatedName("ka.h(IB)V")
    public synchronized void method5081(int arg0) {
        this.field3363 = arg0;
    }

    @ObfuscatedName("ka.e(I)I")
    public int method5086() {
        return this.field3363;
    }

    @ObfuscatedName("ka.v(Lkc;Lly;Laj;II)Z")
    public synchronized boolean method5020(class292 arg0, class333 arg1, class47 arg2, int arg3) {
        arg0.method5193();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class430 var7 = (class430) arg0.field3413.method7530(); var7 != null; var7 = (class430) arg0.field3413.method7531()) {
            int var8 = (int) var7.field4686;
            class290 var9 = (class290) this.field3361.method7535((long) var8);
            if (var9 == null) {
                var9 = class290.method5980(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field3361.method7528(var9, (long) var8);
            }
            if (!var9.method5174(arg2, var7.field4681, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method5200();
        }
        return var5;
    }

    @ObfuscatedName("ka.x(B)V")
    public synchronized void method5021() {
        for (class290 var1 = (class290) this.field3361.method7530(); var1 != null; var1 = (class290) this.field3361.method7531()) {
            var1.method5175();
        }
    }

    @ObfuscatedName("ka.m(S)V")
    public synchronized void method5022() {
        for (class290 var1 = (class290) this.field3361.method7530(); var1 != null; var1 = (class290) this.field3361.method7531()) {
            var1.method7230();
        }
    }

    @ObfuscatedName("ka.b(Lkc;ZI)V")
    public synchronized void method5101(class292 arg0, boolean arg1) {
        this.method5024();
        this.field3376.method5123(arg0.field3414);
        this.field3356 = arg1;
        this.field3380 = 0L;
        int var3 = this.field3376.method5126();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3376.method5127(var4);
            this.field3376.method5148(var4);
            this.field3376.method5128(var4);
        }
        this.field3378 = this.field3376.method5135();
        this.field3379 = this.field3376.field3392[this.field3378];
        this.field3381 = this.field3376.method5151(this.field3379);
    }

    @ObfuscatedName("ka.g(B)V")
    public synchronized void method5024() {
        this.field3376.method5124();
        this.method5111();
    }

    @ObfuscatedName("ka.i(B)Z")
    public synchronized boolean method5025() {
        return this.field3376.method5125();
    }

    @ObfuscatedName("ka.o(IIB)V")
    public synchronized void method5026(int arg0, int arg1) {
        this.method5027(arg0, arg1);
    }

    @ObfuscatedName("ka.n(IIB)V")
    public void method5027(int arg0, int arg1) {
        this.field3362[arg0] = arg1;
        this.field3374[arg0] = arg1 & 0xFFFFFF80;
        this.method5028(arg0, arg1);
    }

    @ObfuscatedName("ka.k(III)V")
    public void method5028(int arg0, int arg1) {
        if (this.field3382[arg0] != arg1) {
            this.field3382[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field3375[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("ka.a(IIII)V")
    public void method5029(int arg0, int arg1, int arg2) {
        this.method5061(arg0, arg1, 64);
        if ((this.field3357[arg0] & 0x2) != 0) {
            for (class293 var4 = (class293) this.field3377.field3408.method6087(); var4 != null; var4 = (class293) this.field3377.field3408.method6099()) {
                if (var4.field3428 == arg0 && var4.field3416 < 0) {
                    this.field3358[arg0][var4.field3420] = null;
                    this.field3358[arg0][arg1] = var4;
                    int var5 = (var4.field3425 * var4.field3415 >> 12) + var4.field3423;
                    var4.field3423 += arg1 - var4.field3420 << 8;
                    var4.field3415 = var5 - var4.field3423;
                    var4.field3425 = 4096;
                    var4.field3420 = arg1;
                    return;
                }
            }
        }
        class290 var6 = (class290) this.field3361.method7535((long) this.field3382[arg0]);
        if (var6 == null) {
            return;
        }
        class42 var7 = var6.field3399[arg1];
        if (var7 == null) {
            return;
        }
        class293 var8 = new class293();
        var8.field3428 = arg0;
        var8.field3418 = var6;
        var8.field3427 = var7;
        var8.field3429 = var6.field3401[arg1];
        var8.field3419 = var6.field3404[arg1];
        var8.field3420 = arg1;
        var8.field3424 = var6.field3402 * arg2 * arg2 * var6.field3403[arg1] + 1024 >> 11;
        var8.field3422 = var6.field3406[arg1] & 0xFF;
        var8.field3423 = (arg1 << 8) - (var6.field3400[arg1] & 0x7FFF);
        var8.field3426 = 0;
        var8.field3421 = 0;
        var8.field3417 = 0;
        var8.field3416 = -1;
        var8.field3430 = 0;
        if (this.field3359[arg0] == 0) {
            var8.field3433 = class49.method973(var7, this.method5043(var8), this.method5044(var8), this.method5045(var8));
        } else {
            var8.field3433 = class49.method973(var7, this.method5043(var8), 0, this.method5045(var8));
            this.method5073(var8, var6.field3400[arg1] < 0);
        }
        if (var6.field3400[arg1] < 0) {
            var8.field3433.method866(-1);
        }
        if (var8.field3419 >= 0) {
            class293 var9 = this.field3375[arg0][var8.field3419];
            if (var9 != null && var9.field3416 < 0) {
                this.field3358[arg0][var9.field3420] = null;
                var9.field3416 = 0;
            }
            this.field3375[arg0][var8.field3419] = var8;
        }
        this.field3377.field3408.method6081(var8);
        this.field3358[arg0][arg1] = var8;
    }

    @ObfuscatedName("ka.s(Lkx;ZI)V")
    public void method5073(class293 arg0, boolean arg1) {
        int var3 = arg0.field3427.field297.length;
        int var5;
        if (arg1 && arg0.field3427.field300) {
            int var4 = var3 + var3 - arg0.field3427.field298;
            var5 = (int) ((long) this.field3359[arg0.field3428] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field3433.method872(true);
            }
        } else {
            var5 = (int) ((long) this.field3359[arg0.field3428] * (long) var3 >> 6);
        }
        arg0.field3433.method871(var5);
    }

    @ObfuscatedName("ka.l(IIII)V")
    public void method5061(int arg0, int arg1, int arg2) {
        class293 var4 = this.field3358[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field3358[arg0][arg1] = null;
        if ((this.field3357[arg0] & 0x2) == 0) {
            var4.field3416 = 0;
            return;
        }
        for (class293 var5 = (class293) this.field3377.field3408.method6086(); var5 != null; var5 = (class293) this.field3377.field3408.method6088()) {
            if (var4.field3428 == var5.field3428 && var5.field3416 < 0 && var4 != var5) {
                var4.field3416 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("ka.t(IIII)V")
    public void method5071(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("ka.c(III)V")
    public void method5103(int arg0, int arg1) {
    }

    @ObfuscatedName("ka.ay(III)V")
    public void method5034(int arg0, int arg1) {
        this.field3365[arg0] = arg1;
    }

    @ObfuscatedName("ka.an(II)V")
    public void method5042(int arg0) {
        for (class293 var2 = (class293) this.field3377.field3408.method6086(); var2 != null; var2 = (class293) this.field3377.field3408.method6088()) {
            if (arg0 < 0 || var2.field3428 == arg0) {
                if (var2.field3433 != null) {
                    var2.field3433.method876(Statics.field326 / 100);
                    if (var2.field3433.method924()) {
                        this.field3377.field3410.method707(var2.field3433);
                    }
                    var2.method5203();
                }
                if (var2.field3416 < 0) {
                    this.field3358[var2.field3428][var2.field3420] = null;
                }
                var2.method7230();
            }
        }
    }

    @ObfuscatedName("ka.ab(II)V")
    public void method5036(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method5036(var2);
            }
            return;
        }
        this.field3360[arg0] = 12800;
        this.field3364[arg0] = 8192;
        this.field3368[arg0] = 16383;
        this.field3365[arg0] = 8192;
        this.field3366[arg0] = 0;
        this.field3367[arg0] = 8192;
        this.method5120(arg0);
        this.method5040(arg0);
        this.field3357[arg0] = 0;
        this.field3369[arg0] = 32767;
        this.field3370[arg0] = 256;
        this.field3359[arg0] = 0;
        this.method5114(arg0, 8192);
    }

    @ObfuscatedName("ka.al(II)V")
    public void method5037(int arg0) {
        for (class293 var2 = (class293) this.field3377.field3408.method6086(); var2 != null; var2 = (class293) this.field3377.field3408.method6088()) {
            if ((arg0 < 0 || var2.field3428 == arg0) && var2.field3416 < 0) {
                this.field3358[var2.field3428][var2.field3420] = null;
                var2.field3416 = 0;
            }
        }
    }

    @ObfuscatedName("ka.az(B)V")
    public void method5111() {
        this.method5042(-1);
        this.method5036(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field3382[var1] = this.field3362[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field3374[var2] = this.field3362[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("ka.ak(II)V")
    public void method5120(int arg0) {
        if ((this.field3357[arg0] & 0x2) == 0) {
            return;
        }
        for (class293 var2 = (class293) this.field3377.field3408.method6086(); var2 != null; var2 = (class293) this.field3377.field3408.method6088()) {
            if (var2.field3428 == arg0 && this.field3358[arg0][var2.field3420] == null && var2.field3416 < 0) {
                var2.field3416 = 0;
            }
        }
    }

    @ObfuscatedName("ka.ai(II)V")
    public void method5040(int arg0) {
        if ((this.field3357[arg0] & 0x4) == 0) {
            return;
        }
        for (class293 var2 = (class293) this.field3377.field3408.method6086(); var2 != null; var2 = (class293) this.field3377.field3408.method6088()) {
            if (var2.field3428 == arg0) {
                var2.field3435 = 0;
            }
        }
    }

    @ObfuscatedName("ka.ax(IB)V")
    public void method5046(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method5061(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method5029(var6, var7, var8);
            } else {
                this.method5061(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method5071(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field3374[var12] = (var14 << 14) + (this.field3374[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field3374[var12] = (var14 << 7) + (this.field3374[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field3366[var12] = (var14 << 7) + (this.field3366[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field3366[var12] = (this.field3366[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field3367[var12] = (var14 << 7) + (this.field3367[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field3367[var12] = (this.field3367[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field3360[var12] = (var14 << 7) + (this.field3360[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field3360[var12] = (this.field3360[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field3364[var12] = (var14 << 7) + (this.field3364[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field3364[var12] = (this.field3364[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field3368[var12] = (var14 << 7) + (this.field3368[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field3368[var12] = (this.field3368[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field3357[var12] |= 0x1;
                } else {
                    this.field3357[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field3357[var12] |= 0x2;
                } else {
                    this.method5120(var12);
                    this.field3357[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field3369[var12] = (var14 << 7) + (this.field3369[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field3369[var12] = (this.field3369[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field3369[var12] = (var14 << 7) + (this.field3369[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field3369[var12] = (this.field3369[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method5042(var12);
            }
            if (var13 == 121) {
                this.method5036(var12);
            }
            if (var13 == 123) {
                this.method5037(var12);
            }
            if (var13 == 6) {
                int var15 = this.field3369[var12];
                if (var15 == 16384) {
                    this.field3370[var12] = (var14 << 7) + (this.field3370[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field3369[var12];
                if (var16 == 16384) {
                    this.field3370[var12] = (this.field3370[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field3359[var12] = (var14 << 7) + (this.field3359[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field3359[var12] = (this.field3359[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field3357[var12] |= 0x4;
                } else {
                    this.method5040(var12);
                    this.field3357[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method5114(var12, (var14 << 7) + (this.field3372[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method5114(var12, (this.field3372[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method5028(var17, this.field3374[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method5103(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method5034(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method5111();
            }
        }
    }

    @ObfuscatedName("ka.ah(III)V")
    public void method5114(int arg0, int arg1) {
        this.field3372[arg0] = arg1;
        this.field3373[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("ka.aw(Lkx;I)I")
    public int method5043(class293 arg0) {
        int var2 = (arg0.field3425 * arg0.field3415 >> 12) + arg0.field3423;
        int var3 = ((this.field3365[arg0.field3428] - 8192) * this.field3370[arg0.field3428] >> 12) + var2;
        class286 var4 = arg0.field3429;
        if (var4.field3340 > 0 && (var4.field3339 > 0 || this.field3366[arg0.field3428] > 0)) {
            int var5 = var4.field3339 << 2;
            int var6 = var4.field3335 << 1;
            if (arg0.field3431 < var6) {
                var5 = arg0.field3431 * var5 / var6;
            }
            int var7 = (this.field3366[arg0.field3428] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field3432 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field3427.field299 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field326 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("ka.aj(Lkx;I)I")
    public int method5044(class293 arg0) {
        class286 var2 = arg0.field3429;
        int var3 = this.field3368[arg0.field3428] * this.field3360[arg0.field3428] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field3424 * var4 + 16384 >> 15;
        int var6 = this.field3363 * var5 + 128 >> 8;
        if (var2.field3336 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field3426 * 1.953125E-5D * (double) var2.field3336) + 0.5D);
        }
        if (var2.field3338 != null) {
            int var7 = arg0.field3421;
            int var8 = var2.field3338[arg0.field3417 + 1];
            if (arg0.field3417 < var2.field3338.length - 2) {
                int var9 = (var2.field3338[arg0.field3417] & 0xFF) << 8;
                int var10 = (var2.field3338[arg0.field3417 + 2] & 0xFF) << 8;
                var8 += (var2.field3338[arg0.field3417 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field3416 > 0 && var2.field3334 != null) {
            int var11 = arg0.field3416;
            int var12 = var2.field3334[arg0.field3430 + 1];
            if (arg0.field3430 < var2.field3334.length - 2) {
                int var13 = (var2.field3334[arg0.field3430] & 0xFF) << 8;
                int var14 = (var2.field3334[arg0.field3430 + 2] & 0xFF) << 8;
                var12 += (var2.field3334[arg0.field3430 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("ka.aq(Lkx;I)I")
    public int method5045(class293 arg0) {
        int var2 = this.field3364[arg0.field3428];
        return var2 < 8192 ? arg0.field3422 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field3422) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("ka.q()Laa;")
    public synchronized class50 method737() {
        return this.field3377;
    }

    @ObfuscatedName("ka.f()Laa;")
    public synchronized class50 method713() {
        return null;
    }

    @ObfuscatedName("ka.r()I")
    public synchronized int method709() {
        return 0;
    }

    @ObfuscatedName("ka.u([III)V")
    public synchronized void method715(int[] arg0, int arg1, int arg2) {
        if (this.field3376.method5125()) {
            int var4 = this.field3371 * this.field3376.field3385 / Statics.field326;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field3380;
                if (this.field3381 - var5 >= 0L) {
                    this.field3380 = var5;
                    break;
                }
                int var7 = (int) ((this.field3381 - this.field3380 + (long) var4 - 1L) / (long) var4);
                this.field3380 += (long) var4 * (long) var7;
                this.field3377.method715(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method5047();
            } while (this.field3376.method5125());
        }
        this.field3377.method715(arg0, arg1, arg2);
    }

    @ObfuscatedName("ka.j(I)V")
    public synchronized void method717(int arg0) {
        if (this.field3376.method5125()) {
            int var2 = this.field3371 * this.field3376.field3385 / Statics.field326;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field3380;
                if (this.field3381 - var3 >= 0L) {
                    this.field3380 = var3;
                    break;
                }
                int var5 = (int) ((this.field3381 - this.field3380 + (long) var2 - 1L) / (long) var2);
                this.field3380 += (long) var2 * (long) var5;
                this.field3377.method717(var5);
                arg0 -= var5;
                this.method5047();
            } while (this.field3376.method5125());
        }
        this.field3377.method717(arg0);
    }

    @ObfuscatedName("ka.ap(I)V")
    public void method5047() {
        int var1 = this.field3378;
        int var2 = this.field3379;
        long var3 = this.field3381;
        while (this.field3379 == var2) {
            while (this.field3376.field3392[var1] == var2) {
                this.field3376.method5127(var1);
                int var5 = this.field3376.method5131(var1);
                if (var5 == 1) {
                    this.field3376.method5129();
                    this.field3376.method5128(var1);
                    if (this.field3376.method5161()) {
                        if (!this.field3356 || var2 == 0) {
                            this.method5111();
                            this.field3376.method5124();
                            return;
                        }
                        this.field3376.method5137(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method5046(var5);
                }
                this.field3376.method5148(var1);
                this.field3376.method5128(var1);
            }
            var1 = this.field3376.method5135();
            var2 = this.field3376.field3392[var1];
            var3 = this.field3376.method5151(var2);
        }
        this.field3378 = var1;
        this.field3379 = var2;
        this.field3381 = var3;
    }

    @ObfuscatedName("ka.aa(Lkx;B)Z")
    public boolean method5048(class293 arg0) {
        if (arg0.field3433 != null) {
            return false;
        }
        if (arg0.field3416 >= 0) {
            arg0.method7230();
            if (arg0.field3419 > 0 && this.field3375[arg0.field3428][arg0.field3419] == arg0) {
                this.field3375[arg0.field3428][arg0.field3419] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("ka.ae(Lkx;[IIIB)Z")
    public boolean method5049(class293 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field3434 = Statics.field326 / 100;
        if (arg0.field3416 >= 0 && arg0.field3433 == null || arg0.field3433.method879()) {
            arg0.method5203();
            arg0.method7230();
            if (arg0.field3419 > 0 && this.field3375[arg0.field3428][arg0.field3419] == arg0) {
                this.field3375[arg0.field3428][arg0.field3419] = null;
            }
            return true;
        }
        int var5 = arg0.field3425;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field3367[arg0.field3428] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field3425 = var6;
        }
        arg0.field3433.method877(this.method5043(arg0));
        class286 var7 = arg0.field3429;
        boolean var8 = false;
        arg0.field3431++;
        arg0.field3432 += var7.field3340;
        double var9 = (double) ((arg0.field3420 - 60 << 8) + (arg0.field3425 * arg0.field3415 >> 12)) * 5.086263020833333E-6D;
        if (var7.field3336 > 0) {
            if (var7.field3333 > 0) {
                arg0.field3426 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3333 * var9) + 0.5D);
            } else {
                arg0.field3426 += 128;
            }
        }
        if (var7.field3338 != null) {
            if (var7.field3341 > 0) {
                arg0.field3421 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3341 * var9) + 0.5D);
            } else {
                arg0.field3421 += 128;
            }
            while (arg0.field3417 < var7.field3338.length - 2 && arg0.field3421 > (var7.field3338[arg0.field3417 + 2] & 0xFF) << 8) {
                arg0.field3417 += 2;
            }
            if (arg0.field3417 == var7.field3338.length - 2 && var7.field3338[arg0.field3417 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field3416 >= 0 && var7.field3334 != null && (this.field3357[arg0.field3428] & 0x1) == 0 && (arg0.field3419 < 0 || this.field3375[arg0.field3428][arg0.field3419] != arg0)) {
            if (var7.field3337 > 0) {
                arg0.field3416 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3337 * var9) + 0.5D);
            } else {
                arg0.field3416 += 128;
            }
            while (arg0.field3430 < var7.field3334.length - 2 && arg0.field3416 > (var7.field3334[arg0.field3430 + 2] & 0xFF) << 8) {
                arg0.field3430 += 2;
            }
            if (arg0.field3430 == var7.field3334.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field3433.method875(arg0.field3434, this.method5044(arg0), this.method5045(arg0));
            return false;
        }
        arg0.field3433.method876(arg0.field3434);
        if (arg1 == null) {
            arg0.field3433.method717(arg3);
        } else {
            arg0.field3433.method715(arg1, arg2, arg3);
        }
        if (arg0.field3433.method924()) {
            this.field3377.field3410.method707(arg0.field3433);
        }
        arg0.method5203();
        if (arg0.field3416 >= 0) {
            arg0.method7230();
            if (arg0.field3419 > 0 && this.field3375[arg0.field3428][arg0.field3419] == arg0) {
                this.field3375[arg0.field3428][arg0.field3419] = null;
            }
        }
        return true;
    }
}
