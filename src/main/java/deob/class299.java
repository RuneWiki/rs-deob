package deob;

@ObfuscatedName("ln")
public class class299 extends class49 {

    @ObfuscatedName("ln.af")
    public class465 field3415 = new class465(128);

    @ObfuscatedName("ln.an")
    public int field3417 = 256;

    @ObfuscatedName("ln.aw")
    public int field3395 = 1000000;

    @ObfuscatedName("ln.ac")
    public int[] field3404 = new int[16];

    @ObfuscatedName("ln.au")
    public int[] field3412 = new int[16];

    @ObfuscatedName("ln.ab")
    public int[] field3398 = new int[16];

    @ObfuscatedName("ln.aq")
    public int[] field3399 = new int[16];

    @ObfuscatedName("ln.al")
    public int[] field3405 = new int[16];

    @ObfuscatedName("ln.at")
    public int[] field3401 = new int[16];

    @ObfuscatedName("ln.aa")
    public int[] field3402 = new int[16];

    @ObfuscatedName("ln.ay")
    public int[] field3400 = new int[16];

    @ObfuscatedName("ln.ao")
    public int[] field3421 = new int[16];

    @ObfuscatedName("ln.as")
    public int[] field3406 = new int[16];

    @ObfuscatedName("ln.aj")
    public int[] field3407 = new int[16];

    @ObfuscatedName("ln.ak")
    public int[] field3396 = new int[16];

    @ObfuscatedName("ln.az")
    public int[] field3409 = new int[16];

    @ObfuscatedName("ln.ad")
    public int[] field3410 = new int[16];

    @ObfuscatedName("ln.ae")
    public int[] field3411 = new int[16];

    @ObfuscatedName("ln.ap")
    public class304[][] field3393 = new class304[16][128];

    @ObfuscatedName("ln.by")
    public class304[][] field3413 = new class304[16][128];

    @ObfuscatedName("ln.bb")
    public class300 field3414 = new class300();

    @ObfuscatedName("ln.bi")
    public boolean field3420;

    @ObfuscatedName("ln.be")
    public int field3416;

    @ObfuscatedName("ln.bk")
    public int field3408;

    @ObfuscatedName("ln.bx")
    public long field3418;

    @ObfuscatedName("ln.bo")
    public long field3397;

    @ObfuscatedName("ln.bz")
    public class302 field3403 = new class302(this);

    public class299() {
        this.method5231();
    }

    @ObfuscatedName("ln.af(IB)V")
    public synchronized void method5212(int arg0) {
        this.field3417 = arg0;
    }

    @ObfuscatedName("ln.an(B)I")
    public int method5299() {
        return this.field3417;
    }

    @ObfuscatedName("ln.aw(Lld;Lnm;Lba;II)Z")
    public synchronized boolean method5214(class303 arg0, class344 arg1, class46 arg2, int arg3) {
        arg0.method5381();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class446 var7 = (class446) arg0.field3449.method7972(); var7 != null; var7 = (class446) arg0.field3449.method7969()) {
            int var8 = (int) var7.field4745;
            class301 var9 = (class301) this.field3415.method7966((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method6117(var8);
                class301 var11;
                if (var10 == null) {
                    var11 = null;
                } else {
                    var11 = new class301(var10);
                }
                var9 = var11;
                if (var11 == null) {
                    var5 = false;
                    continue;
                }
                this.field3415.method7967(var11, (long) var8);
            }
            if (!var9.method5366(arg2, var7.field4742, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method5382();
        }
        return var5;
    }

    @ObfuscatedName("ln.ac(I)V")
    public synchronized void method5293() {
        for (class301 var1 = (class301) this.field3415.method7972(); var1 != null; var1 = (class301) this.field3415.method7969()) {
            var1.method5368();
        }
    }

    @ObfuscatedName("ln.au(I)V")
    public synchronized void method5216() {
        for (class301 var1 = (class301) this.field3415.method7972(); var1 != null; var1 = (class301) this.field3415.method7969()) {
            var1.method7651();
        }
    }

    @ObfuscatedName("ln.aa(Lld;ZI)V")
    public synchronized void method5217(class303 arg0, boolean arg1) {
        this.method5218();
        this.field3414.method5321(arg0.field3448);
        this.field3420 = arg1;
        this.field3418 = 0L;
        int var3 = this.field3414.method5324();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3414.method5325(var4);
            this.field3414.method5328(var4);
            this.field3414.method5326(var4);
        }
        this.field3416 = this.field3414.method5333();
        this.field3408 = this.field3414.field3422[this.field3416];
        this.field3397 = this.field3414.method5332(this.field3408);
    }

    @ObfuscatedName("ln.ao(B)V")
    public synchronized void method5218() {
        this.field3414.method5362();
        this.method5231();
    }

    @ObfuscatedName("ln.ax(I)Z")
    public synchronized boolean method5219() {
        return this.field3414.method5331();
    }

    @ObfuscatedName("ln.ai(IIB)V")
    public synchronized void method5220(int arg0, int arg1) {
        this.method5221(arg0, arg1);
    }

    @ObfuscatedName("ln.ag(IIB)V")
    public void method5221(int arg0, int arg1) {
        this.field3399[arg0] = arg1;
        this.field3401[arg0] = arg1 & 0xFFFFFF80;
        this.method5274(arg0, arg1);
    }

    @ObfuscatedName("ln.ah(III)V")
    public void method5274(int arg0, int arg1) {
        if (this.field3405[arg0] != arg1) {
            this.field3405[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field3413[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("ln.av(IIII)V")
    public void method5222(int arg0, int arg1, int arg2) {
        this.method5224(arg0, arg1, 64);
        if ((this.field3406[arg0] & 0x2) != 0) {
            for (class304 var4 = (class304) this.field3403.field3445.method6346(); var4 != null; var4 = (class304) this.field3403.field3445.method6340()) {
                if (var4.field3468 == arg0 && var4.field3465 < 0) {
                    this.field3393[arg0][var4.field3455] = null;
                    this.field3393[arg0][arg1] = var4;
                    int var5 = (var4.field3460 * var4.field3459 >> 12) + var4.field3471;
                    var4.field3471 += arg1 - var4.field3455 << 8;
                    var4.field3459 = var5 - var4.field3471;
                    var4.field3460 = 4096;
                    var4.field3455 = arg1;
                    return;
                }
            }
        }
        class301 var6 = (class301) this.field3415.method7966((long) this.field3405[arg0]);
        if (var6 == null) {
            return;
        }
        class41 var7 = var6.field3436[arg1];
        if (var7 == null) {
            return;
        }
        class304 var8 = new class304();
        var8.field3468 = arg0;
        var8.field3467 = var6;
        var8.field3452 = var7;
        var8.field3453 = var6.field3441[arg1];
        var8.field3451 = var6.field3442[arg1];
        var8.field3455 = arg1;
        var8.field3456 = var6.field3438 * arg2 * arg2 * var6.field3439[arg1] + 1024 >> 11;
        var8.field3457 = var6.field3440[arg1] & 0xFF;
        var8.field3471 = (arg1 << 8) - (var6.field3437[arg1] & 0x7FFF);
        var8.field3461 = 0;
        var8.field3462 = 0;
        var8.field3469 = 0;
        var8.field3465 = -1;
        var8.field3450 = 0;
        if (this.field3409[arg0] == 0) {
            var8.field3464 = class48.method937(var7, this.method5236(var8), this.method5237(var8), this.method5238(var8));
        } else {
            var8.field3464 = class48.method937(var7, this.method5236(var8), 0, this.method5238(var8));
            this.method5244(var8, var6.field3437[arg1] < 0);
        }
        if (var6.field3437[arg1] < 0) {
            var8.field3464.method879(-1);
        }
        if (var8.field3451 >= 0) {
            class304 var9 = this.field3413[arg0][var8.field3451];
            if (var9 != null && var9.field3465 < 0) {
                this.field3393[arg0][var9.field3455] = null;
                var9.field3465 = 0;
            }
            this.field3413[arg0][var8.field3451] = var8;
        }
        this.field3403.field3445.method6324(var8);
        this.field3393[arg0][arg1] = var8;
    }

    @ObfuscatedName("ln.ar(Llq;ZI)V")
    public void method5244(class304 arg0, boolean arg1) {
        int var3 = arg0.field3452.field280.length;
        int var5;
        if (arg1 && arg0.field3452.field281) {
            int var4 = var3 + var3 - arg0.field3452.field284;
            var5 = (int) ((long) this.field3409[arg0.field3468] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field3464.method885(true);
            }
        } else {
            var5 = (int) ((long) this.field3409[arg0.field3468] * (long) var3 >> 6);
        }
        arg0.field3464.method884(var5);
    }

    @ObfuscatedName("ln.am(IIIB)V")
    public void method5224(int arg0, int arg1, int arg2) {
        class304 var4 = this.field3393[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field3393[arg0][arg1] = null;
        if ((this.field3406[arg0] & 0x2) == 0) {
            var4.field3465 = 0;
            return;
        }
        for (class304 var5 = (class304) this.field3403.field3445.method6329(); var5 != null; var5 = (class304) this.field3403.field3445.method6338()) {
            if (var4.field3468 == var5.field3468 && var5.field3465 < 0 && var4 != var5) {
                var4.field3465 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("ln.as(IIII)V")
    public void method5225(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("ln.aj(III)V")
    public void method5280(int arg0, int arg1) {
    }

    @ObfuscatedName("ln.ak(III)V")
    public void method5227(int arg0, int arg1) {
        this.field3402[arg0] = arg1;
    }

    @ObfuscatedName("ln.az(II)V")
    public void method5228(int arg0) {
        for (class304 var2 = (class304) this.field3403.field3445.method6329(); var2 != null; var2 = (class304) this.field3403.field3445.method6338()) {
            if (arg0 < 0 || var2.field3468 == arg0) {
                if (var2.field3464 != null) {
                    var2.field3464.method889(Statics.field307 / 100);
                    if (var2.field3464.method977()) {
                        this.field3403.field3446.method739(var2.field3464);
                    }
                    var2.method5396();
                }
                if (var2.field3465 < 0) {
                    this.field3393[var2.field3468][var2.field3455] = null;
                }
                var2.method7651();
            }
        }
    }

    @ObfuscatedName("ln.ad(II)V")
    public void method5229(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method5229(var2);
            }
            return;
        }
        this.field3404[arg0] = 12800;
        this.field3412[arg0] = 8192;
        this.field3398[arg0] = 16383;
        this.field3402[arg0] = 8192;
        this.field3400[arg0] = 0;
        this.field3421[arg0] = 8192;
        this.method5256(arg0);
        this.method5233(arg0);
        this.field3406[arg0] = 0;
        this.field3407[arg0] = 32767;
        this.field3396[arg0] = 256;
        this.field3409[arg0] = 0;
        this.method5235(arg0, 8192);
    }

    @ObfuscatedName("ln.ae(II)V")
    public void method5213(int arg0) {
        for (class304 var2 = (class304) this.field3403.field3445.method6329(); var2 != null; var2 = (class304) this.field3403.field3445.method6338()) {
            if ((arg0 < 0 || var2.field3468 == arg0) && var2.field3465 < 0) {
                this.field3393[var2.field3468][var2.field3455] = null;
                var2.field3465 = 0;
            }
        }
    }

    @ObfuscatedName("ln.ap(I)V")
    public void method5231() {
        this.method5228(-1);
        this.method5229(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field3405[var1] = this.field3399[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field3401[var2] = this.field3399[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("ln.by(IB)V")
    public void method5256(int arg0) {
        if ((this.field3406[arg0] & 0x2) == 0) {
            return;
        }
        for (class304 var2 = (class304) this.field3403.field3445.method6329(); var2 != null; var2 = (class304) this.field3403.field3445.method6338()) {
            if (var2.field3468 == arg0 && this.field3393[arg0][var2.field3455] == null && var2.field3465 < 0) {
                var2.field3465 = 0;
            }
        }
    }

    @ObfuscatedName("ln.bn(II)V")
    public void method5233(int arg0) {
        if ((this.field3406[arg0] & 0x4) == 0) {
            return;
        }
        for (class304 var2 = (class304) this.field3403.field3445.method6329(); var2 != null; var2 = (class304) this.field3403.field3445.method6338()) {
            if (var2.field3468 == arg0) {
                var2.field3470 = 0;
            }
        }
    }

    @ObfuscatedName("ln.bs(II)V")
    public void method5234(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method5224(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method5222(var6, var7, var8);
            } else {
                this.method5224(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method5225(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field3401[var12] = (var14 << 14) + (this.field3401[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field3401[var12] = (var14 << 7) + (this.field3401[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field3400[var12] = (var14 << 7) + (this.field3400[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field3400[var12] = (this.field3400[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field3421[var12] = (var14 << 7) + (this.field3421[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field3421[var12] = (this.field3421[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field3404[var12] = (var14 << 7) + (this.field3404[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field3404[var12] = (this.field3404[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field3412[var12] = (var14 << 7) + (this.field3412[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field3412[var12] = (this.field3412[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field3398[var12] = (var14 << 7) + (this.field3398[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field3398[var12] = (this.field3398[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field3406[var12] |= 0x1;
                } else {
                    this.field3406[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field3406[var12] |= 0x2;
                } else {
                    this.method5256(var12);
                    this.field3406[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field3407[var12] = (var14 << 7) + (this.field3407[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field3407[var12] = (this.field3407[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field3407[var12] = (var14 << 7) + (this.field3407[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field3407[var12] = (this.field3407[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method5228(var12);
            }
            if (var13 == 121) {
                this.method5229(var12);
            }
            if (var13 == 123) {
                this.method5213(var12);
            }
            if (var13 == 6) {
                int var15 = this.field3407[var12];
                if (var15 == 16384) {
                    this.field3396[var12] = (var14 << 7) + (this.field3396[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field3407[var12];
                if (var16 == 16384) {
                    this.field3396[var12] = (this.field3396[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field3409[var12] = (var14 << 7) + (this.field3409[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field3409[var12] = (this.field3409[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field3406[var12] |= 0x4;
                } else {
                    this.method5233(var12);
                    this.field3406[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method5235(var12, (var14 << 7) + (this.field3410[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method5235(var12, (this.field3410[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method5274(var17, this.field3401[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method5280(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method5227(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method5231();
            }
        }
    }

    @ObfuscatedName("ln.br(III)V")
    public void method5235(int arg0, int arg1) {
        this.field3410[arg0] = arg1;
        this.field3411[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("ln.bq(Llq;I)I")
    public int method5236(class304 arg0) {
        int var2 = (arg0.field3460 * arg0.field3459 >> 12) + arg0.field3471;
        int var3 = ((this.field3402[arg0.field3468] - 8192) * this.field3396[arg0.field3468] >> 12) + var2;
        class297 var4 = arg0.field3453;
        if (var4.field3381 > 0 && (var4.field3380 > 0 || this.field3400[arg0.field3468] > 0)) {
            int var5 = var4.field3380 << 2;
            int var6 = var4.field3378 << 1;
            if (arg0.field3466 < var6) {
                var5 = arg0.field3466 * var5 / var6;
            }
            int var7 = (this.field3400[arg0.field3468] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field3458 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field3452.field282 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field307 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("ln.bv(Llq;I)I")
    public int method5237(class304 arg0) {
        class297 var2 = arg0.field3453;
        int var3 = this.field3404[arg0.field3468] * this.field3398[arg0.field3468] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field3456 * var4 + 16384 >> 15;
        int var6 = this.field3417 * var5 + 128 >> 8;
        if (var2.field3376 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field3461 * 1.953125E-5D * (double) var2.field3376) + 0.5D);
        }
        if (var2.field3375 != null) {
            int var7 = arg0.field3462;
            int var8 = var2.field3375[arg0.field3469 + 1];
            if (arg0.field3469 < var2.field3375.length - 2) {
                int var9 = (var2.field3375[arg0.field3469] & 0xFF) << 8;
                int var10 = (var2.field3375[arg0.field3469 + 2] & 0xFF) << 8;
                var8 += (var2.field3375[arg0.field3469 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field3465 > 0 && var2.field3374 != null) {
            int var11 = arg0.field3465;
            int var12 = var2.field3374[arg0.field3450 + 1];
            if (arg0.field3450 < var2.field3374.length - 2) {
                int var13 = (var2.field3374[arg0.field3450] & 0xFF) << 8;
                int var14 = (var2.field3374[arg0.field3450 + 2] & 0xFF) << 8;
                var12 += (var2.field3374[arg0.field3450 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("ln.bl(Llq;I)I")
    public int method5238(class304 arg0) {
        int var2 = this.field3412[arg0.field3468];
        return var2 < 8192 ? arg0.field3457 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field3457) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("ln.ab()Lbp;")
    public synchronized class49 method726() {
        return this.field3403;
    }

    @ObfuscatedName("ln.aq()Lbp;")
    public synchronized class49 method727() {
        return null;
    }

    @ObfuscatedName("ln.al()I")
    public synchronized int method728() {
        return 0;
    }

    @ObfuscatedName("ln.at([III)V")
    public synchronized void method729(int[] arg0, int arg1, int arg2) {
        if (this.field3414.method5331()) {
            int var4 = this.field3395 * this.field3414.field3424 / Statics.field307;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field3418;
                if (this.field3397 - var5 >= 0L) {
                    this.field3418 = var5;
                    break;
                }
                int var7 = (int) ((this.field3397 - this.field3418 + (long) var4 - 1L) / (long) var4);
                this.field3418 += (long) var4 * (long) var7;
                this.field3403.method729(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method5239();
            } while (this.field3414.method5331());
        }
        this.field3403.method729(arg0, arg1, arg2);
    }

    @ObfuscatedName("ln.ay(I)V")
    public synchronized void method755(int arg0) {
        if (this.field3414.method5331()) {
            int var2 = this.field3395 * this.field3414.field3424 / Statics.field307;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field3418;
                if (this.field3397 - var3 >= 0L) {
                    this.field3418 = var3;
                    break;
                }
                int var5 = (int) ((this.field3397 - this.field3418 + (long) var2 - 1L) / (long) var2);
                this.field3418 += (long) var2 * (long) var5;
                this.field3403.method755(var5);
                arg0 -= var5;
                this.method5239();
            } while (this.field3414.method5331());
        }
        this.field3403.method755(arg0);
    }

    @ObfuscatedName("ln.bp(I)V")
    public void method5239() {
        int var1 = this.field3416;
        int var2 = this.field3408;
        long var3 = this.field3397;
        while (this.field3408 == var2) {
            while (this.field3414.field3422[var1] == var2) {
                this.field3414.method5325(var1);
                int var5 = this.field3414.method5329(var1);
                if (var5 == 1) {
                    this.field3414.method5358();
                    this.field3414.method5326(var1);
                    if (this.field3414.method5334()) {
                        if (!this.field3420 || var2 == 0) {
                            this.method5231();
                            this.field3414.method5362();
                            return;
                        }
                        this.field3414.method5335(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method5234(var5);
                }
                this.field3414.method5328(var1);
                this.field3414.method5326(var1);
            }
            var1 = this.field3414.method5333();
            var2 = this.field3414.field3422[var1];
            var3 = this.field3414.method5332(var2);
        }
        this.field3416 = var1;
        this.field3408 = var2;
        this.field3397 = var3;
    }

    @ObfuscatedName("ln.bc(Llq;S)Z")
    public boolean method5309(class304 arg0) {
        if (arg0.field3464 != null) {
            return false;
        }
        if (arg0.field3465 >= 0) {
            arg0.method7651();
            if (arg0.field3451 > 0 && this.field3413[arg0.field3468][arg0.field3451] == arg0) {
                this.field3413[arg0.field3468][arg0.field3451] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("ln.bh(Llq;[IIII)Z")
    public boolean method5240(class304 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field3463 = Statics.field307 / 100;
        if (arg0.field3465 >= 0 && arg0.field3464 == null || arg0.field3464.method946()) {
            arg0.method5396();
            arg0.method7651();
            if (arg0.field3451 > 0 && this.field3413[arg0.field3468][arg0.field3451] == arg0) {
                this.field3413[arg0.field3468][arg0.field3451] = null;
            }
            return true;
        }
        int var5 = arg0.field3460;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field3421[arg0.field3468] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field3460 = var6;
        }
        arg0.field3464.method890(this.method5236(arg0));
        class297 var7 = arg0.field3453;
        boolean var8 = false;
        arg0.field3466++;
        arg0.field3458 += var7.field3381;
        double var9 = (double) ((arg0.field3455 - 60 << 8) + (arg0.field3460 * arg0.field3459 >> 12)) * 5.086263020833333E-6D;
        if (var7.field3376 > 0) {
            if (var7.field3379 > 0) {
                arg0.field3461 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3379 * var9) + 0.5D);
            } else {
                arg0.field3461 += 128;
            }
        }
        if (var7.field3375 != null) {
            if (var7.field3377 > 0) {
                arg0.field3462 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3377 * var9) + 0.5D);
            } else {
                arg0.field3462 += 128;
            }
            while (arg0.field3469 < var7.field3375.length - 2 && arg0.field3462 > (var7.field3375[arg0.field3469 + 2] & 0xFF) << 8) {
                arg0.field3469 += 2;
            }
            if (arg0.field3469 == var7.field3375.length - 2 && var7.field3375[arg0.field3469 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field3465 >= 0 && var7.field3374 != null && (this.field3406[arg0.field3468] & 0x1) == 0 && (arg0.field3451 < 0 || this.field3413[arg0.field3468][arg0.field3451] != arg0)) {
            if (var7.field3382 > 0) {
                arg0.field3465 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3382 * var9) + 0.5D);
            } else {
                arg0.field3465 += 128;
            }
            while (arg0.field3450 < var7.field3374.length - 2 && arg0.field3465 > (var7.field3374[arg0.field3450 + 2] & 0xFF) << 8) {
                arg0.field3450 += 2;
            }
            if (arg0.field3450 == var7.field3374.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field3464.method888(arg0.field3463, this.method5237(arg0), this.method5238(arg0));
            return false;
        }
        arg0.field3464.method889(arg0.field3463);
        if (arg1 == null) {
            arg0.field3464.method755(arg3);
        } else {
            arg0.field3464.method729(arg1, arg2, arg3);
        }
        if (arg0.field3464.method977()) {
            this.field3403.field3446.method739(arg0.field3464);
        }
        arg0.method5396();
        if (arg0.field3465 >= 0) {
            arg0.method7651();
            if (arg0.field3451 > 0 && this.field3413[arg0.field3468][arg0.field3451] == arg0) {
                this.field3413[arg0.field3468][arg0.field3451] = null;
            }
        }
        return true;
    }
}
