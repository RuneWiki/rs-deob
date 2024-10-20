package deob;

@ObfuscatedName("lz")
public class class295 extends class49 {

    @ObfuscatedName("lz.aj")
    public class455 field3347 = new class455(128);

    @ObfuscatedName("lz.al")
    public int field3336 = 256;

    @ObfuscatedName("lz.ac")
    public int field3337 = 1000000;

    @ObfuscatedName("lz.ab")
    public int[] field3338 = new int[16];

    @ObfuscatedName("lz.an")
    public int[] field3353 = new int[16];

    @ObfuscatedName("lz.ao")
    public int[] field3340 = new int[16];

    @ObfuscatedName("lz.av")
    public int[] field3341 = new int[16];

    @ObfuscatedName("lz.aq")
    public int[] field3342 = new int[16];

    @ObfuscatedName("lz.ap")
    public int[] field3335 = new int[16];

    @ObfuscatedName("lz.ar")
    public int[] field3344 = new int[16];

    @ObfuscatedName("lz.ak")
    public int[] field3361 = new int[16];

    @ObfuscatedName("lz.ax")
    public int[] field3339 = new int[16];

    @ObfuscatedName("lz.at")
    public int[] field3351 = new int[16];

    @ObfuscatedName("lz.af")
    public int[] field3348 = new int[16];

    @ObfuscatedName("lz.ai")
    public int[] field3349 = new int[16];

    @ObfuscatedName("lz.aw")
    public int[] field3354 = new int[16];

    @ObfuscatedName("lz.aa")
    public int[] field3343 = new int[16];

    @ObfuscatedName("lz.ah")
    public int[] field3352 = new int[16];

    @ObfuscatedName("lz.ad")
    public class300[][] field3357 = new class300[16][128];

    @ObfuscatedName("lz.bm")
    public class300[][] field3350 = new class300[16][128];

    @ObfuscatedName("lz.bv")
    public class296 field3358 = new class296();

    @ObfuscatedName("lz.bo")
    public boolean field3356;

    @ObfuscatedName("lz.bs")
    public int field3345;

    @ObfuscatedName("lz.bg")
    public int field3346;

    @ObfuscatedName("lz.bh")
    public long field3359;

    @ObfuscatedName("lz.bl")
    public long field3360;

    @ObfuscatedName("lz.bk")
    public class298 field3355 = new class298(this);

    public class295() {
        this.method5027();
    }

    @ObfuscatedName("lz.aj(II)V")
    public synchronized void method5009(int arg0) {
        this.field3336 = arg0;
    }

    @ObfuscatedName("lz.al(I)I")
    public int method5012() {
        return this.field3336;
    }

    @ObfuscatedName("lz.ac(Llh;Lne;Lbb;II)Z")
    public synchronized boolean method5010(class299 arg0, class340 arg1, class46 arg2, int arg3) {
        arg0.method5175();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class441 var7 = (class441) arg0.field3395.method7614(); var7 != null; var7 = (class441) arg0.field3395.method7617()) {
            int var8 = (int) var7.field4673;
            class297 var9 = (class297) this.field3347.method7619((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method5865(var8);
                class297 var11;
                if (var10 == null) {
                    var11 = null;
                } else {
                    var11 = new class297(var10);
                }
                var9 = var11;
                if (var11 == null) {
                    var5 = false;
                    continue;
                }
                this.field3347.method7616(var11, (long) var8);
            }
            if (!var9.method5162(arg2, var7.field4669, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method5176();
        }
        return var5;
    }

    @ObfuscatedName("lz.ab(I)V")
    public synchronized void method5011() {
        for (class297 var1 = (class297) this.field3347.method7614(); var1 != null; var1 = (class297) this.field3347.method7617()) {
            var1.method5163();
        }
    }

    @ObfuscatedName("lz.an(I)V")
    public synchronized void method5072() {
        for (class297 var1 = (class297) this.field3347.method7614(); var1 != null; var1 = (class297) this.field3347.method7617()) {
            var1.method7335();
        }
    }

    @ObfuscatedName("lz.ar(Llh;ZB)V")
    public synchronized void method5099(class299 arg0, boolean arg1) {
        this.method5014();
        this.field3358.method5121(arg0.field3396);
        this.field3356 = arg1;
        this.field3359 = 0L;
        int var3 = this.field3358.method5123();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3358.method5125(var4);
            this.field3358.method5128(var4);
            this.field3358.method5155(var4);
        }
        this.field3345 = this.field3358.method5133();
        this.field3346 = this.field3358.field3373[this.field3345];
        this.field3360 = this.field3358.method5124(this.field3346);
    }

    @ObfuscatedName("lz.ax(I)V")
    public synchronized void method5014() {
        this.field3358.method5122();
        this.method5027();
    }

    @ObfuscatedName("lz.as(B)Z")
    public synchronized boolean method5036() {
        return this.field3358.method5143();
    }

    @ObfuscatedName("lz.ay(III)V")
    public synchronized void method5015(int arg0, int arg1) {
        this.method5016(arg0, arg1);
    }

    @ObfuscatedName("lz.am(IIB)V")
    public void method5016(int arg0, int arg1) {
        this.field3341[arg0] = arg1;
        this.field3335[arg0] = arg1 & 0xFFFFFF80;
        this.method5081(arg0, arg1);
    }

    @ObfuscatedName("lz.az(IIB)V")
    public void method5081(int arg0, int arg1) {
        if (this.field3342[arg0] != arg1) {
            this.field3342[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field3350[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("lz.ae(IIII)V")
    public void method5106(int arg0, int arg1, int arg2) {
        this.method5018(arg0, arg1, 64);
        if ((this.field3351[arg0] & 0x2) != 0) {
            for (class300 var4 = (class300) this.field3355.field3388.method6097(); var4 != null; var4 = (class300) this.field3355.field3388.method6099()) {
                if (var4.field3418 == arg0 && var4.field3414 < 0) {
                    this.field3357[arg0][var4.field3402] = null;
                    this.field3357[arg0][arg1] = var4;
                    int var5 = (var4.field3407 * var4.field3406 >> 12) + var4.field3405;
                    var4.field3405 += arg1 - var4.field3402 << 8;
                    var4.field3406 = var5 - var4.field3405;
                    var4.field3407 = 4096;
                    var4.field3402 = arg1;
                    return;
                }
            }
        }
        class297 var6 = (class297) this.field3347.method7619((long) this.field3342[arg0]);
        if (var6 == null) {
            return;
        }
        class41 var7 = var6.field3378[arg1];
        if (var7 == null) {
            return;
        }
        class300 var8 = new class300();
        var8.field3418 = arg0;
        var8.field3398 = var6;
        var8.field3399 = var7;
        var8.field3400 = var6.field3379[arg1];
        var8.field3397 = var6.field3383[arg1];
        var8.field3402 = arg1;
        var8.field3417 = var6.field3382 * arg2 * arg2 * var6.field3384[arg1] + 1024 >> 11;
        var8.field3404 = var6.field3381[arg1] & 0xFF;
        var8.field3405 = (arg1 << 8) - (var6.field3380[arg1] & 0x7FFF);
        var8.field3403 = 0;
        var8.field3409 = 0;
        var8.field3410 = 0;
        var8.field3414 = -1;
        var8.field3412 = 0;
        if (this.field3354[arg0] == 0) {
            var8.field3415 = class48.method834(var7, this.method5032(var8), this.method5033(var8), this.method5034(var8));
        } else {
            var8.field3415 = class48.method834(var7, this.method5032(var8), 0, this.method5034(var8));
            this.method5064(var8, var6.field3380[arg1] < 0);
        }
        if (var6.field3380[arg1] < 0) {
            var8.field3415.method949(-1);
        }
        if (var8.field3397 >= 0) {
            class300 var9 = this.field3350[arg0][var8.field3397];
            if (var9 != null && var9.field3414 < 0) {
                this.field3357[arg0][var9.field3402] = null;
                var9.field3414 = 0;
            }
            this.field3350[arg0][var8.field3397] = var8;
        }
        this.field3355.field3388.method6111(var8);
        this.field3357[arg0][arg1] = var8;
    }

    @ObfuscatedName("lz.au(Llp;ZB)V")
    public void method5064(class300 arg0, boolean arg1) {
        int var3 = arg0.field3399.field268.length;
        int var5;
        if (arg1 && arg0.field3399.field270) {
            int var4 = var3 + var3 - arg0.field3399.field269;
            var5 = (int) ((long) this.field3354[arg0.field3418] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field3415.method843(true);
            }
        } else {
            var5 = (int) ((long) this.field3354[arg0.field3418] * (long) var3 >> 6);
        }
        arg0.field3415.method915(var5);
    }

    @ObfuscatedName("lz.ag(IIII)V")
    public void method5018(int arg0, int arg1, int arg2) {
        class300 var4 = this.field3357[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field3357[arg0][arg1] = null;
        if ((this.field3351[arg0] & 0x2) == 0) {
            var4.field3414 = 0;
            return;
        }
        for (class300 var5 = (class300) this.field3355.field3388.method6089(); var5 != null; var5 = (class300) this.field3355.field3388.method6098()) {
            if (var4.field3418 == var5.field3418 && var5.field3414 < 0 && var4 != var5) {
                var4.field3414 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("lz.at(IIII)V")
    public void method5021(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("lz.af(IIS)V")
    public void method5022(int arg0, int arg1) {
    }

    @ObfuscatedName("lz.ai(III)V")
    public void method5023(int arg0, int arg1) {
        this.field3344[arg0] = arg1;
    }

    @ObfuscatedName("lz.aw(IS)V")
    public void method5020(int arg0) {
        for (class300 var2 = (class300) this.field3355.field3388.method6089(); var2 != null; var2 = (class300) this.field3355.field3388.method6098()) {
            if (arg0 < 0 || var2.field3418 == arg0) {
                if (var2.field3415 != null) {
                    var2.field3415.method847(Statics.field293 / 100);
                    if (var2.field3415.method969()) {
                        this.field3355.field3389.method676(var2.field3415);
                    }
                    var2.method5187();
                }
                if (var2.field3414 < 0) {
                    this.field3357[var2.field3418][var2.field3402] = null;
                }
                var2.method7335();
            }
        }
    }

    @ObfuscatedName("lz.aa(II)V")
    public void method5059(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method5059(var2);
            }
            return;
        }
        this.field3338[arg0] = 12800;
        this.field3353[arg0] = 8192;
        this.field3340[arg0] = 16383;
        this.field3344[arg0] = 8192;
        this.field3361[arg0] = 0;
        this.field3339[arg0] = 8192;
        this.method5042(arg0);
        this.method5029(arg0);
        this.field3351[arg0] = 0;
        this.field3348[arg0] = 32767;
        this.field3349[arg0] = 256;
        this.field3354[arg0] = 0;
        this.method5031(arg0, 8192);
    }

    @ObfuscatedName("lz.ah(II)V")
    public void method5019(int arg0) {
        for (class300 var2 = (class300) this.field3355.field3388.method6089(); var2 != null; var2 = (class300) this.field3355.field3388.method6098()) {
            if ((arg0 < 0 || var2.field3418 == arg0) && var2.field3414 < 0) {
                this.field3357[var2.field3418][var2.field3402] = null;
                var2.field3414 = 0;
            }
        }
    }

    @ObfuscatedName("lz.bz(I)V")
    public void method5027() {
        this.method5020(-1);
        this.method5059(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field3342[var1] = this.field3341[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field3335[var2] = this.field3341[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("lz.bq(IB)V")
    public void method5042(int arg0) {
        if ((this.field3351[arg0] & 0x2) == 0) {
            return;
        }
        for (class300 var2 = (class300) this.field3355.field3388.method6089(); var2 != null; var2 = (class300) this.field3355.field3388.method6098()) {
            if (var2.field3418 == arg0 && this.field3357[arg0][var2.field3402] == null && var2.field3414 < 0) {
                var2.field3414 = 0;
            }
        }
    }

    @ObfuscatedName("lz.bc(II)V")
    public void method5029(int arg0) {
        if ((this.field3351[arg0] & 0x4) == 0) {
            return;
        }
        for (class300 var2 = (class300) this.field3355.field3388.method6089(); var2 != null; var2 = (class300) this.field3355.field3388.method6098()) {
            if (var2.field3418 == arg0) {
                var2.field3411 = 0;
            }
        }
    }

    @ObfuscatedName("lz.bu(II)V")
    public void method5030(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method5018(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method5106(var6, var7, var8);
            } else {
                this.method5018(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method5021(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field3335[var12] = (var14 << 14) + (this.field3335[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field3335[var12] = (var14 << 7) + (this.field3335[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field3361[var12] = (var14 << 7) + (this.field3361[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field3361[var12] = (this.field3361[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field3339[var12] = (var14 << 7) + (this.field3339[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field3339[var12] = (this.field3339[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field3338[var12] = (var14 << 7) + (this.field3338[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field3338[var12] = (this.field3338[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field3353[var12] = (var14 << 7) + (this.field3353[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field3353[var12] = (this.field3353[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field3340[var12] = (var14 << 7) + (this.field3340[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field3340[var12] = (this.field3340[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field3351[var12] |= 0x1;
                } else {
                    this.field3351[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field3351[var12] |= 0x2;
                } else {
                    this.method5042(var12);
                    this.field3351[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field3348[var12] = (var14 << 7) + (this.field3348[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field3348[var12] = (this.field3348[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field3348[var12] = (var14 << 7) + (this.field3348[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field3348[var12] = (this.field3348[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method5020(var12);
            }
            if (var13 == 121) {
                this.method5059(var12);
            }
            if (var13 == 123) {
                this.method5019(var12);
            }
            if (var13 == 6) {
                int var15 = this.field3348[var12];
                if (var15 == 16384) {
                    this.field3349[var12] = (var14 << 7) + (this.field3349[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field3348[var12];
                if (var16 == 16384) {
                    this.field3349[var12] = (this.field3349[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field3354[var12] = (var14 << 7) + (this.field3354[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field3354[var12] = (this.field3354[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field3351[var12] |= 0x4;
                } else {
                    this.method5029(var12);
                    this.field3351[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method5031(var12, (var14 << 7) + (this.field3343[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method5031(var12, (this.field3343[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method5081(var17, this.field3335[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method5022(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method5023(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method5027();
            }
        }
    }

    @ObfuscatedName("lz.bd(IIB)V")
    public void method5031(int arg0, int arg1) {
        this.field3343[arg0] = arg1;
        this.field3352[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("lz.bp(Llp;B)I")
    public int method5032(class300 arg0) {
        int var2 = (arg0.field3407 * arg0.field3406 >> 12) + arg0.field3405;
        int var3 = ((this.field3344[arg0.field3418] - 8192) * this.field3349[arg0.field3418] >> 12) + var2;
        class293 var4 = arg0.field3400;
        if (var4.field3314 > 0 && (var4.field3321 > 0 || this.field3361[arg0.field3418] > 0)) {
            int var5 = var4.field3321 << 2;
            int var6 = var4.field3318 << 1;
            if (arg0.field3413 < var6) {
                var5 = arg0.field3413 * var5 / var6;
            }
            int var7 = (this.field3361[arg0.field3418] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field3401 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field3399.field271 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field293 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("lz.bb(Llp;B)I")
    public int method5033(class300 arg0) {
        class293 var2 = arg0.field3400;
        int var3 = this.field3340[arg0.field3418] * this.field3338[arg0.field3418] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field3417 * var4 + 16384 >> 15;
        int var6 = this.field3336 * var5 + 128 >> 8;
        if (var2.field3316 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field3403 * 1.953125E-5D * (double) var2.field3316) + 0.5D);
        }
        if (var2.field3320 != null) {
            int var7 = arg0.field3409;
            int var8 = var2.field3320[arg0.field3410 + 1];
            if (arg0.field3410 < var2.field3320.length - 2) {
                int var9 = (var2.field3320[arg0.field3410] & 0xFF) << 8;
                int var10 = (var2.field3320[arg0.field3410 + 2] & 0xFF) << 8;
                var8 += (var2.field3320[arg0.field3410 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field3414 > 0 && var2.field3315 != null) {
            int var11 = arg0.field3414;
            int var12 = var2.field3315[arg0.field3412 + 1];
            if (arg0.field3412 < var2.field3315.length - 2) {
                int var13 = (var2.field3315[arg0.field3412] & 0xFF) << 8;
                int var14 = (var2.field3315[arg0.field3412 + 2] & 0xFF) << 8;
                var12 += (var2.field3315[arg0.field3412 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("lz.bx(Llp;I)I")
    public int method5034(class300 arg0) {
        int var2 = this.field3353[arg0.field3418];
        return var2 < 8192 ? arg0.field3404 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field3404) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("lz.ao()Lbj;")
    public synchronized class49 method681() {
        return this.field3355;
    }

    @ObfuscatedName("lz.av()Lbj;")
    public synchronized class49 method688() {
        return null;
    }

    @ObfuscatedName("lz.aq()I")
    public synchronized int method683() {
        return 0;
    }

    @ObfuscatedName("lz.ap([III)V")
    public synchronized void method705(int[] arg0, int arg1, int arg2) {
        if (this.field3358.method5143()) {
            int var4 = this.field3337 * this.field3358.field3364 / Statics.field293;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field3359;
                if (this.field3360 - var5 >= 0L) {
                    this.field3359 = var5;
                    break;
                }
                int var7 = (int) ((this.field3360 - this.field3359 + (long) var4 - 1L) / (long) var4);
                this.field3359 += (long) var4 * (long) var7;
                this.field3355.method705(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method5037();
            } while (this.field3358.method5143());
        }
        this.field3355.method705(arg0, arg1, arg2);
    }

    @ObfuscatedName("lz.ak(I)V")
    public synchronized void method686(int arg0) {
        if (this.field3358.method5143()) {
            int var2 = this.field3337 * this.field3358.field3364 / Statics.field293;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field3359;
                if (this.field3360 - var3 >= 0L) {
                    this.field3359 = var3;
                    break;
                }
                int var5 = (int) ((this.field3360 - this.field3359 + (long) var2 - 1L) / (long) var2);
                this.field3359 += (long) var2 * (long) var5;
                this.field3355.method686(var5);
                arg0 -= var5;
                this.method5037();
            } while (this.field3358.method5143());
        }
        this.field3355.method686(arg0);
    }

    @ObfuscatedName("lz.bn(S)V")
    public void method5037() {
        int var1 = this.field3345;
        int var2 = this.field3346;
        long var3 = this.field3360;
        while (this.field3346 == var2) {
            while (this.field3358.field3373[var1] == var2) {
                this.field3358.method5125(var1);
                int var5 = this.field3358.method5129(var1);
                if (var5 == 1) {
                    this.field3358.method5127();
                    this.field3358.method5155(var1);
                    if (this.field3358.method5151()) {
                        if (!this.field3356 || var2 == 0) {
                            this.method5027();
                            this.field3358.method5122();
                            return;
                        }
                        this.field3358.method5132(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method5030(var5);
                }
                this.field3358.method5128(var1);
                this.field3358.method5155(var1);
            }
            var1 = this.field3358.method5133();
            var2 = this.field3358.field3373[var1];
            var3 = this.field3358.method5124(var2);
        }
        this.field3345 = var1;
        this.field3346 = var2;
        this.field3360 = var3;
    }

    @ObfuscatedName("lz.bj(Llp;I)Z")
    public boolean method5038(class300 arg0) {
        if (arg0.field3415 != null) {
            return false;
        }
        if (arg0.field3414 >= 0) {
            arg0.method7335();
            if (arg0.field3397 > 0 && this.field3350[arg0.field3418][arg0.field3397] == arg0) {
                this.field3350[arg0.field3418][arg0.field3397] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("lz.bf(Llp;[IIII)Z")
    public boolean method5039(class300 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field3416 = Statics.field293 / 100;
        if (arg0.field3414 >= 0 && arg0.field3415 == null || arg0.field3415.method878()) {
            arg0.method5187();
            arg0.method7335();
            if (arg0.field3397 > 0 && this.field3350[arg0.field3418][arg0.field3397] == arg0) {
                this.field3350[arg0.field3418][arg0.field3397] = null;
            }
            return true;
        }
        int var5 = arg0.field3407;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field3339[arg0.field3418] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field3407 = var6;
        }
        arg0.field3415.method848(this.method5032(arg0));
        class293 var7 = arg0.field3400;
        boolean var8 = false;
        arg0.field3413++;
        arg0.field3401 += var7.field3314;
        double var9 = (double) ((arg0.field3402 - 60 << 8) + (arg0.field3407 * arg0.field3406 >> 12)) * 5.086263020833333E-6D;
        if (var7.field3316 > 0) {
            if (var7.field3319 > 0) {
                arg0.field3403 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3319 * var9) + 0.5D);
            } else {
                arg0.field3403 += 128;
            }
        }
        if (var7.field3320 != null) {
            if (var7.field3317 > 0) {
                arg0.field3409 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3317 * var9) + 0.5D);
            } else {
                arg0.field3409 += 128;
            }
            while (arg0.field3410 < var7.field3320.length - 2 && arg0.field3409 > (var7.field3320[arg0.field3410 + 2] & 0xFF) << 8) {
                arg0.field3410 += 2;
            }
            if (arg0.field3410 == var7.field3320.length - 2 && var7.field3320[arg0.field3410 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field3414 >= 0 && var7.field3315 != null && (this.field3351[arg0.field3418] & 0x1) == 0 && (arg0.field3397 < 0 || this.field3350[arg0.field3418][arg0.field3397] != arg0)) {
            if (var7.field3322 > 0) {
                arg0.field3414 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3322 * var9) + 0.5D);
            } else {
                arg0.field3414 += 128;
            }
            while (arg0.field3412 < var7.field3315.length - 2 && arg0.field3414 > (var7.field3315[arg0.field3412 + 2] & 0xFF) << 8) {
                arg0.field3412 += 2;
            }
            if (arg0.field3412 == var7.field3315.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field3415.method846(arg0.field3416, this.method5033(arg0), this.method5034(arg0));
            return false;
        }
        arg0.field3415.method847(arg0.field3416);
        if (arg1 == null) {
            arg0.field3415.method686(arg3);
        } else {
            arg0.field3415.method705(arg1, arg2, arg3);
        }
        if (arg0.field3415.method969()) {
            this.field3355.field3389.method676(arg0.field3415);
        }
        arg0.method5187();
        if (arg0.field3414 >= 0) {
            arg0.method7335();
            if (arg0.field3397 > 0 && this.field3350[arg0.field3418][arg0.field3397] == arg0) {
                this.field3350[arg0.field3418][arg0.field3397] = null;
            }
        }
        return true;
    }
}
