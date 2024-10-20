package deob;

@ObfuscatedName("gq")
public class class205 extends class120 {

    @ObfuscatedName("gq.n")
    public class191 field2527 = new class191(128);

    @ObfuscatedName("gq.p")
    public int field2523 = 256;

    @ObfuscatedName("gq.i")
    public int field2526 = 1000000;

    @ObfuscatedName("gq.j")
    public int[] field2524 = new int[16];

    @ObfuscatedName("gq.f")
    public int[] field2525 = new int[16];

    @ObfuscatedName("gq.m")
    public int[] field2536 = new int[16];

    @ObfuscatedName("gq.c")
    public int[] field2528 = new int[16];

    @ObfuscatedName("gq.z")
    public int[] field2539 = new int[16];

    @ObfuscatedName("gq.h")
    public int[] field2529 = new int[16];

    @ObfuscatedName("gq.g")
    public int[] field2530 = new int[16];

    @ObfuscatedName("gq.e")
    public int[] field2531 = new int[16];

    @ObfuscatedName("gq.o")
    public int[] field2532 = new int[16];

    @ObfuscatedName("gq.t")
    public int[] field2533 = new int[16];

    @ObfuscatedName("gq.w")
    public int[] field2534 = new int[16];

    @ObfuscatedName("gq.l")
    public int[] field2535 = new int[16];

    @ObfuscatedName("gq.q")
    public int[] field2521 = new int[16];

    @ObfuscatedName("gq.k")
    public int[] field2541 = new int[16];

    @ObfuscatedName("gq.d")
    public int[] field2538 = new int[16];

    @ObfuscatedName("gq.u")
    public class206[][] field2537 = new class206[16][128];

    @ObfuscatedName("gq.ae")
    public class206[][] field2540 = new class206[16][128];

    @ObfuscatedName("gq.ao")
    public class207 field2522 = new class207();

    @ObfuscatedName("gq.ad")
    public boolean field2542;

    @ObfuscatedName("gq.aa")
    public int field2543;

    @ObfuscatedName("gq.aw")
    public int field2544;

    @ObfuscatedName("gq.an")
    public long field2545;

    @ObfuscatedName("gq.al")
    public long field2546;

    @ObfuscatedName("gq.at")
    public class209 field2547 = new class209(this);

    public class205() {
        this.method3469();
    }

    @ObfuscatedName("gq.n(II)V")
    public synchronized void method3510(int arg0) {
        this.field2523 = arg0;
    }

    @ObfuscatedName("gq.p(I)I")
    public int method3460() {
        return this.field2523;
    }

    @ObfuscatedName("gq.i(Lhb;Lis;Ldk;IS)Z")
    public synchronized boolean method3513(class210 arg0, class236 arg1, class113 arg2, int arg3) {
        arg0.method3651();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class200 var7 = (class200) arg0.field2604.method3298(); var7 != null; var7 = (class200) arg0.field2604.method3306()) {
            int var8 = (int) var7.field2483;
            class208 var9 = (class208) this.field2527.method3295((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method3836(var8);
                class208 var11;
                if (var10 == null) {
                    var11 = null;
                } else {
                    var11 = new class208(var10);
                }
                var9 = var11;
                if (var11 == null) {
                    var5 = false;
                    continue;
                }
                this.field2527.method3296(var11, (long) var8);
            }
            if (!var9.method3635(arg2, var7.field2498, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3650();
        }
        return var5;
    }

    @ObfuscatedName("gq.j(I)V")
    public synchronized void method3488() {
        for (class208 var1 = (class208) this.field2527.method3298(); var1 != null; var1 = (class208) this.field2527.method3306()) {
            var1.method3636();
        }
    }

    @ObfuscatedName("gq.f(I)V")
    public synchronized void method3462() {
        for (class208 var1 = (class208) this.field2527.method3298(); var1 != null; var1 = (class208) this.field2527.method3306()) {
            var1.method3347();
        }
    }

    @ObfuscatedName("gq.g(Lhb;ZB)V")
    public synchronized void method3463(class210 arg0, boolean arg1) {
        this.method3477();
        this.field2522.method3580(arg0.field2603);
        this.field2542 = arg1;
        this.field2545 = 0L;
        int var3 = this.field2522.method3583();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2522.method3607(var4);
            this.field2522.method3585(var4);
            this.field2522.method3621(var4);
        }
        this.field2543 = this.field2522.method3591();
        this.field2544 = this.field2522.field2577[this.field2543];
        this.field2546 = this.field2522.method3590(this.field2544);
    }

    @ObfuscatedName("gq.o(I)V")
    public synchronized void method3477() {
        this.field2522.method3581();
        this.method3469();
    }

    @ObfuscatedName("gq.x(I)Z")
    public synchronized boolean method3494() {
        return this.field2522.method3582();
    }

    @ObfuscatedName("gq.a(III)V")
    public synchronized void method3466(int arg0, int arg1) {
        this.method3467(arg0, arg1);
    }

    @ObfuscatedName("gq.y(III)V")
    public void method3467(int arg0, int arg1) {
        this.field2528[arg0] = arg1;
        this.field2529[arg0] = arg1 & 0xFFFFFF80;
        this.method3515(arg0, arg1);
    }

    @ObfuscatedName("gq.r(III)V")
    public void method3515(int arg0, int arg1) {
        if (this.field2539[arg0] != arg1) {
            this.field2539[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2540[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("gq.b(IIIB)V")
    public void method3465(int arg0, int arg1, int arg2) {
        this.method3471(arg0, arg1, 64);
        if ((this.field2533[arg0] & 0x2) != 0) {
            for (class206 var4 = (class206) this.field2547.field2595.method3379(); var4 != null; var4 = (class206) this.field2547.field2595.method3359()) {
                if (var4.field2552 == arg0 && var4.field2564 < 0) {
                    this.field2537[arg0][var4.field2559] = null;
                    this.field2537[arg0][arg1] = var4;
                    int var5 = (var4.field2560 * var4.field2556 >> 12) + var4.field2558;
                    var4.field2558 += arg1 - var4.field2559 << 8;
                    var4.field2556 = var5 - var4.field2558;
                    var4.field2560 = 4096;
                    var4.field2559 = arg1;
                    return;
                }
            }
        }
        class208 var6 = (class208) this.field2527.method3295((long) this.field2539[arg0]);
        if (var6 == null) {
            return;
        }
        class108 var7 = var6.field2586[arg1];
        if (var7 == null) {
            return;
        }
        class206 var8 = new class206();
        var8.field2552 = arg0;
        var8.field2551 = var6;
        var8.field2557 = var7;
        var8.field2553 = var6.field2590[arg1];
        var8.field2554 = var6.field2592[arg1];
        var8.field2559 = arg1;
        var8.field2565 = var6.field2589 * arg2 * arg2 * var6.field2591[arg1] + 1024 >> 11;
        var8.field2555 = var6.field2588[arg1] & 0xFF;
        var8.field2558 = (arg1 << 8) - (var6.field2587[arg1] & 0x7FFF);
        var8.field2570 = 0;
        var8.field2562 = 0;
        var8.field2563 = 0;
        var8.field2564 = -1;
        var8.field2568 = 0;
        if (this.field2521[arg0] == 0) {
            var8.field2561 = class118.method1964(var7, this.method3482(var8), this.method3483(var8), this.method3484(var8));
        } else {
            var8.field2561 = class118.method1964(var7, this.method3482(var8), 0, this.method3484(var8));
            this.method3470(var8, var6.field2587[arg1] < 0);
        }
        if (var6.field2587[arg1] < 0) {
            var8.field2561.method1966(-1);
        }
        if (var8.field2554 >= 0) {
            class206 var9 = this.field2540[arg0][var8.field2554];
            if (var9 != null && var9.field2564 < 0) {
                this.field2537[arg0][var9.field2559] = null;
                var9.field2564 = 0;
            }
            this.field2540[arg0][var8.field2554] = var8;
        }
        this.field2547.field2595.method3384(var8);
        this.field2537[arg0][arg1] = var8;
    }

    @ObfuscatedName("gq.s(Lga;ZI)V")
    public void method3470(class206 arg0, boolean arg1) {
        int var3 = arg0.field2557.field1614.length;
        int var5;
        if (arg1 && arg0.field2557.field1617) {
            int var4 = var3 + var3 - arg0.field2557.field1615;
            var5 = (int) ((long) this.field2521[arg0.field2552] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2561.method2092(true);
            }
        } else {
            var5 = (int) ((long) this.field2521[arg0.field2552] * (long) var3 >> 6);
        }
        arg0.field2561.method1972(var5);
    }

    @ObfuscatedName("gq.v(IIII)V")
    public void method3471(int arg0, int arg1, int arg2) {
        class206 var4 = this.field2537[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2537[arg0][arg1] = null;
        if ((this.field2533[arg0] & 0x2) == 0) {
            var4.field2564 = 0;
            return;
        }
        for (class206 var5 = (class206) this.field2547.field2595.method3372(); var5 != null; var5 = (class206) this.field2547.field2595.method3358()) {
            if (var4.field2552 == var5.field2552 && var5.field2564 < 0 && var4 != var5) {
                var4.field2564 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("gq.t(IIIB)V")
    public void method3472(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("gq.w(III)V")
    public void method3546(int arg0, int arg1) {
    }

    @ObfuscatedName("gq.u(IIB)V")
    public void method3474(int arg0, int arg1) {
        this.field2530[arg0] = arg1;
    }

    @ObfuscatedName("gq.aa(IB)V")
    public void method3475(int arg0) {
        for (class206 var2 = (class206) this.field2547.field2595.method3372(); var2 != null; var2 = (class206) this.field2547.field2595.method3358()) {
            if (arg0 < 0 || var2.field2552 == arg0) {
                if (var2.field2561 != null) {
                    var2.field2561.method1977(Statics.field1634 / 100);
                    if (var2.field2561.method1974()) {
                        this.field2547.field2597.method1731(var2.field2561);
                    }
                    var2.method3576();
                }
                if (var2.field2564 < 0) {
                    this.field2537[var2.field2552][var2.field2559] = null;
                }
                var2.method3347();
            }
        }
    }

    @ObfuscatedName("gq.aw(II)V")
    public void method3476(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3476(var2);
            }
            return;
        }
        this.field2524[arg0] = 12800;
        this.field2525[arg0] = 8192;
        this.field2536[arg0] = 16383;
        this.field2530[arg0] = 8192;
        this.field2531[arg0] = 0;
        this.field2532[arg0] = 8192;
        this.method3496(arg0);
        this.method3479(arg0);
        this.field2533[arg0] = 0;
        this.field2534[arg0] = 32767;
        this.field2535[arg0] = 256;
        this.field2521[arg0] = 0;
        this.method3569(arg0, 8192);
    }

    @ObfuscatedName("gq.am(II)V")
    public void method3572(int arg0) {
        for (class206 var2 = (class206) this.field2547.field2595.method3372(); var2 != null; var2 = (class206) this.field2547.field2595.method3358()) {
            if ((arg0 < 0 || var2.field2552 == arg0) && var2.field2564 < 0) {
                this.field2537[var2.field2552][var2.field2559] = null;
                var2.field2564 = 0;
            }
        }
    }

    @ObfuscatedName("gq.ac(I)V")
    public void method3469() {
        this.method3475(-1);
        this.method3476(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2539[var1] = this.field2528[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2529[var2] = this.field2528[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("gq.aq(II)V")
    public void method3496(int arg0) {
        if ((this.field2533[arg0] & 0x2) == 0) {
            return;
        }
        for (class206 var2 = (class206) this.field2547.field2595.method3372(); var2 != null; var2 = (class206) this.field2547.field2595.method3358()) {
            if (var2.field2552 == arg0 && this.field2537[arg0][var2.field2559] == null && var2.field2564 < 0) {
                var2.field2564 = 0;
            }
        }
    }

    @ObfuscatedName("gq.af(IB)V")
    public void method3479(int arg0) {
        if ((this.field2533[arg0] & 0x4) == 0) {
            return;
        }
        for (class206 var2 = (class206) this.field2547.field2595.method3372(); var2 != null; var2 = (class206) this.field2547.field2595.method3358()) {
            if (var2.field2552 == arg0) {
                var2.field2550 = 0;
            }
        }
    }

    @ObfuscatedName("gq.ar(IS)V")
    public void method3480(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3471(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3465(var6, var7, var8);
            } else {
                this.method3471(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3472(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2529[var12] = (var14 << 14) + (this.field2529[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2529[var12] = (var14 << 7) + (this.field2529[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2531[var12] = (var14 << 7) + (this.field2531[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2531[var12] = (this.field2531[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2532[var12] = (var14 << 7) + (this.field2532[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2532[var12] = (this.field2532[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2524[var12] = (var14 << 7) + (this.field2524[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2524[var12] = (this.field2524[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2525[var12] = (var14 << 7) + (this.field2525[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2525[var12] = (this.field2525[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2536[var12] = (var14 << 7) + (this.field2536[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2536[var12] = (this.field2536[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2533[var12] |= 0x1;
                } else {
                    this.field2533[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2533[var12] |= 0x2;
                } else {
                    this.method3496(var12);
                    this.field2533[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2534[var12] = (var14 << 7) + (this.field2534[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2534[var12] = (this.field2534[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2534[var12] = (var14 << 7) + (this.field2534[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2534[var12] = (this.field2534[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3475(var12);
            }
            if (var13 == 121) {
                this.method3476(var12);
            }
            if (var13 == 123) {
                this.method3572(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2534[var12];
                if (var15 == 16384) {
                    this.field2535[var12] = (var14 << 7) + (this.field2535[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2534[var12];
                if (var16 == 16384) {
                    this.field2535[var12] = (this.field2535[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2521[var12] = (var14 << 7) + (this.field2521[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2521[var12] = (this.field2521[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2533[var12] |= 0x4;
                } else {
                    this.method3479(var12);
                    this.field2533[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3569(var12, (var14 << 7) + (this.field2541[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3569(var12, (this.field2541[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3515(var17, this.field2529[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3546(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method3474(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3469();
            }
        }
    }

    @ObfuscatedName("gq.aj(IIB)V")
    public void method3569(int arg0, int arg1) {
        this.field2541[arg0] = arg1;
        this.field2538[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("gq.ay(Lga;I)I")
    public int method3482(class206 arg0) {
        int var2 = (arg0.field2560 * arg0.field2556 >> 12) + arg0.field2558;
        int var3 = ((this.field2530[arg0.field2552] - 8192) * this.field2535[arg0.field2552] >> 12) + var2;
        class203 var4 = arg0.field2553;
        if (var4.field2510 > 0 && (var4.field2511 > 0 || this.field2531[arg0.field2552] > 0)) {
            int var5 = var4.field2511 << 2;
            int var6 = var4.field2503 << 1;
            if (arg0.field2566 < var6) {
                var5 = arg0.field2566 * var5 / var6;
            }
            int var7 = (this.field2531[arg0.field2552] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2567 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2557.field1616 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1634 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("gq.ap(Lga;I)I")
    public int method3483(class206 arg0) {
        class203 var2 = arg0.field2553;
        int var3 = this.field2536[arg0.field2552] * this.field2524[arg0.field2552] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2565 * var4 + 16384 >> 15;
        int var6 = this.field2523 * var5 + 128 >> 8;
        if (var2.field2509 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2570 * 1.953125E-5D * (double) var2.field2509) + 0.5D);
        }
        if (var2.field2508 != null) {
            int var7 = arg0.field2562;
            int var8 = var2.field2508[arg0.field2563 + 1];
            if (arg0.field2563 < var2.field2508.length - 2) {
                int var9 = (var2.field2508[arg0.field2563] & 0xFF) << 8;
                int var10 = (var2.field2508[arg0.field2563 + 2] & 0xFF) << 8;
                var8 += (var2.field2508[arg0.field2563 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2564 > 0 && var2.field2504 != null) {
            int var11 = arg0.field2564;
            int var12 = var2.field2504[arg0.field2568 + 1];
            if (arg0.field2568 < var2.field2504.length - 2) {
                int var13 = (var2.field2504[arg0.field2568] & 0xFF) << 8;
                int var14 = (var2.field2504[arg0.field2568 + 2] & 0xFF) << 8;
                var12 += (var2.field2504[arg0.field2568 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("gq.ai(Lga;B)I")
    public int method3484(class206 arg0) {
        int var2 = this.field2525[arg0.field2552];
        return var2 < 8192 ? arg0.field2555 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2555) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("gq.m()Ldp;")
    public synchronized class120 method1757() {
        return this.field2547;
    }

    @ObfuscatedName("gq.c()Ldp;")
    public synchronized class120 method1737() {
        return null;
    }

    @ObfuscatedName("gq.z()I")
    public synchronized int method1736() {
        return 0;
    }

    @ObfuscatedName("gq.h([III)V")
    public synchronized void method1752(int[] arg0, int arg1, int arg2) {
        if (this.field2522.method3582()) {
            int var4 = this.field2526 * this.field2522.field2572 / Statics.field1634;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2545;
                if (this.field2546 - var5 >= 0L) {
                    this.field2545 = var5;
                    break;
                }
                int var7 = (int) ((this.field2546 - this.field2545 + (long) var4 - 1L) / (long) var4);
                this.field2545 += (long) var4 * (long) var7;
                this.field2547.method1752(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3485();
            } while (this.field2522.method3582());
        }
        this.field2547.method1752(arg0, arg1, arg2);
    }

    @ObfuscatedName("gq.e(I)V")
    public synchronized void method1741(int arg0) {
        if (this.field2522.method3582()) {
            int var2 = this.field2526 * this.field2522.field2572 / Statics.field1634;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2545;
                if (this.field2546 - var3 >= 0L) {
                    this.field2545 = var3;
                    break;
                }
                int var5 = (int) ((this.field2546 - this.field2545 + (long) var2 - 1L) / (long) var2);
                this.field2545 += (long) var2 * (long) var5;
                this.field2547.method1741(var5);
                arg0 -= var5;
                this.method3485();
            } while (this.field2522.method3582());
        }
        this.field2547.method1741(arg0);
    }

    @ObfuscatedName("gq.az(I)V")
    public void method3485() {
        int var1 = this.field2543;
        int var2 = this.field2544;
        long var3 = this.field2546;
        while (this.field2544 == var2) {
            while (this.field2522.field2577[var1] == var2) {
                this.field2522.method3607(var1);
                int var5 = this.field2522.method3589(var1);
                if (var5 == 1) {
                    this.field2522.method3630();
                    this.field2522.method3621(var1);
                    if (this.field2522.method3592()) {
                        if (!this.field2542 || var2 == 0) {
                            this.method3469();
                            this.field2522.method3581();
                            return;
                        }
                        this.field2522.method3598(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3480(var5);
                }
                this.field2522.method3585(var1);
                this.field2522.method3621(var1);
            }
            var1 = this.field2522.method3591();
            var2 = this.field2522.field2577[var1];
            var3 = this.field2522.method3590(var2);
        }
        this.field2543 = var1;
        this.field2544 = var2;
        this.field2546 = var3;
    }

    @ObfuscatedName("gq.bv(Lga;I)Z")
    public boolean method3486(class206 arg0) {
        if (arg0.field2561 != null) {
            return false;
        }
        if (arg0.field2564 >= 0) {
            arg0.method3347();
            if (arg0.field2554 > 0 && this.field2540[arg0.field2552][arg0.field2554] == arg0) {
                this.field2540[arg0.field2552][arg0.field2554] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("gq.bd(Lga;[IIII)Z")
    public boolean method3487(class206 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2569 = Statics.field1634 / 100;
        if (arg0.field2564 >= 0 && arg0.field2561 == null || arg0.field2561.method2067()) {
            arg0.method3576();
            arg0.method3347();
            if (arg0.field2554 > 0 && this.field2540[arg0.field2552][arg0.field2554] == arg0) {
                this.field2540[arg0.field2552][arg0.field2554] = null;
            }
            return true;
        }
        int var5 = arg0.field2560;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2532[arg0.field2552] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2560 = var6;
        }
        arg0.field2561.method2094(this.method3482(arg0));
        class203 var7 = arg0.field2553;
        boolean var8 = false;
        arg0.field2566++;
        arg0.field2567 += var7.field2510;
        double var9 = (double) ((arg0.field2559 - 60 << 8) + (arg0.field2560 * arg0.field2556 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2509 > 0) {
            if (var7.field2506 > 0) {
                arg0.field2570 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2506 * var9) + 0.5D);
            } else {
                arg0.field2570 += 128;
            }
        }
        if (var7.field2508 != null) {
            if (var7.field2505 > 0) {
                arg0.field2562 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2505 * var9) + 0.5D);
            } else {
                arg0.field2562 += 128;
            }
            while (arg0.field2563 < var7.field2508.length - 2 && arg0.field2562 > (var7.field2508[arg0.field2563 + 2] & 0xFF) << 8) {
                arg0.field2563 += 2;
            }
            if (arg0.field2563 == var7.field2508.length - 2 && var7.field2508[arg0.field2563 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2564 >= 0 && var7.field2504 != null && (this.field2533[arg0.field2552] & 0x1) == 0 && (arg0.field2554 < 0 || this.field2540[arg0.field2552][arg0.field2554] != arg0)) {
            if (var7.field2507 > 0) {
                arg0.field2564 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2507 * var9) + 0.5D);
            } else {
                arg0.field2564 += 128;
            }
            while (arg0.field2568 < var7.field2504.length - 2 && arg0.field2564 > (var7.field2504[arg0.field2568 + 2] & 0xFF) << 8) {
                arg0.field2568 += 2;
            }
            if (arg0.field2568 == var7.field2504.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2561.method1976(arg0.field2569, this.method3483(arg0), this.method3484(arg0));
            return false;
        }
        arg0.field2561.method1977(arg0.field2569);
        if (arg1 == null) {
            arg0.field2561.method1741(arg3);
        } else {
            arg0.field2561.method1752(arg1, arg2, arg3);
        }
        if (arg0.field2561.method1974()) {
            this.field2547.field2597.method1731(arg0.field2561);
        }
        arg0.method3576();
        if (arg0.field2564 >= 0) {
            arg0.method3347();
            if (arg0.field2554 > 0 && this.field2540[arg0.field2552][arg0.field2554] == arg0) {
                this.field2540[arg0.field2552][arg0.field2554] = null;
            }
        }
        return true;
    }
}
