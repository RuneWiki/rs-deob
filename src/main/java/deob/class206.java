package deob;

@ObfuscatedName("gy")
public class class206 extends class119 {

    @ObfuscatedName("gy.i")
    public class192 field2528 = new class192(128);

    @ObfuscatedName("gy.j")
    public int field2529 = 256;

    @ObfuscatedName("gy.a")
    public int field2517 = 1000000;

    @ObfuscatedName("gy.r")
    public int[] field2539 = new int[16];

    @ObfuscatedName("gy.o")
    public int[] field2520 = new int[16];

    @ObfuscatedName("gy.n")
    public int[] field2516 = new int[16];

    @ObfuscatedName("gy.q")
    public int[] field2521 = new int[16];

    @ObfuscatedName("gy.b")
    public int[] field2524 = new int[16];

    @ObfuscatedName("gy.k")
    public int[] field2518 = new int[16];

    @ObfuscatedName("gy.s")
    public int[] field2519 = new int[16];

    @ObfuscatedName("gy.d")
    public int[] field2525 = new int[16];

    @ObfuscatedName("gy.l")
    public int[] field2526 = new int[16];

    @ObfuscatedName("gy.p")
    public int[] field2527 = new int[16];

    @ObfuscatedName("gy.m")
    public int[] field2532 = new int[16];

    @ObfuscatedName("gy.x")
    public int[] field2515 = new int[16];

    @ObfuscatedName("gy.h")
    public int[] field2530 = new int[16];

    @ObfuscatedName("gy.f")
    public int[] field2531 = new int[16];

    @ObfuscatedName("gy.g")
    public int[] field2540 = new int[16];

    @ObfuscatedName("gy.w")
    public class207[][] field2533 = new class207[16][128];

    @ObfuscatedName("gy.ar")
    public class207[][] field2534 = new class207[16][128];

    @ObfuscatedName("gy.ax")
    public class208 field2535 = new class208();

    @ObfuscatedName("gy.al")
    public boolean field2536;

    @ObfuscatedName("gy.ag")
    public int field2537;

    @ObfuscatedName("gy.ad")
    public int field2538;

    @ObfuscatedName("gy.ab")
    public long field2523;

    @ObfuscatedName("gy.am")
    public long field2522;

    @ObfuscatedName("gy.aq")
    public class210 field2541 = new class210(this);

    public class206() {
        this.method3522();
    }

    @ObfuscatedName("gy.i(II)V")
    public synchronized void method3529(int arg0) {
        this.field2529 = arg0;
    }

    @ObfuscatedName("gy.j(B)I")
    public int method3504() {
        return this.field2529;
    }

    @ObfuscatedName("gy.a(Lhl;Lii;Ldr;IB)Z")
    public synchronized boolean method3514(class211 arg0, class237 arg1, class112 arg2, int arg3) {
        arg0.method3663();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class201 var7 = (class201) arg0.field2598.method3365(); var7 != null; var7 = (class201) arg0.field2598.method3362()) {
            int var8 = (int) var7.field2475;
            class209 var9 = (class209) this.field2528.method3358((long) var8);
            if (var9 == null) {
                var9 = class209.method914(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field2528.method3359(var9, (long) var8);
            }
            if (!var9.method3646(arg2, var7.field2489, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3665();
        }
        return var5;
    }

    @ObfuscatedName("gy.r(I)V")
    public synchronized void method3506() {
        for (class209 var1 = (class209) this.field2528.method3365(); var1 != null; var1 = (class209) this.field2528.method3362()) {
            var1.method3647();
        }
    }

    @ObfuscatedName("gy.o(I)V")
    public synchronized void method3507() {
        for (class209 var1 = (class209) this.field2528.method3365(); var1 != null; var1 = (class209) this.field2528.method3362()) {
            var1.method3397();
        }
    }

    @ObfuscatedName("gy.s(Lhl;ZI)V")
    public synchronized void method3530(class211 arg0, boolean arg1) {
        this.method3508();
        this.field2535.method3618(arg0.field2599);
        this.field2536 = arg1;
        this.field2523 = 0L;
        int var3 = this.field2535.method3607();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2535.method3608(var4);
            this.field2535.method3611(var4);
            this.field2535.method3609(var4);
        }
        this.field2537 = this.field2535.method3615();
        this.field2538 = this.field2535.field2571[this.field2537];
        this.field2522 = this.field2535.method3614(this.field2538);
    }

    @ObfuscatedName("gy.l(B)V")
    public synchronized void method3508() {
        this.field2535.method3603();
        this.method3522();
    }

    @ObfuscatedName("gy.c(I)Z")
    public synchronized boolean method3552() {
        return this.field2535.method3639();
    }

    @ObfuscatedName("gy.u(III)V")
    public synchronized void method3513(int arg0, int arg1) {
        this.method3527(arg0, arg1);
    }

    @ObfuscatedName("gy.e(III)V")
    public void method3527(int arg0, int arg1) {
        this.field2521[arg0] = arg1;
        this.field2518[arg0] = arg1 & 0xFFFFFF80;
        this.method3512(arg0, arg1);
    }

    @ObfuscatedName("gy.p(IIB)V")
    public void method3512(int arg0, int arg1) {
        if (this.field2524[arg0] != arg1) {
            this.field2524[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2534[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("gy.m(IIII)V")
    public void method3509(int arg0, int arg1, int arg2) {
        this.method3515(arg0, arg1, 64);
        if ((this.field2527[arg0] & 0x2) != 0) {
            for (class207 var4 = (class207) this.field2541.field2594.method3430(); var4 != null; var4 = (class207) this.field2541.field2594.method3433()) {
                if (var4.field2564 == arg0 && var4.field2561 < 0) {
                    this.field2533[arg0][var4.field2548] = null;
                    this.field2533[arg0][arg1] = var4;
                    int var5 = (var4.field2553 * var4.field2547 >> 12) + var4.field2560;
                    var4.field2560 += arg1 - var4.field2548 << 8;
                    var4.field2547 = var5 - var4.field2560;
                    var4.field2553 = 4096;
                    var4.field2548 = arg1;
                    return;
                }
            }
        }
        class209 var6 = (class209) this.field2528.method3358((long) this.field2524[arg0]);
        if (var6 == null) {
            return;
        }
        class107 var7 = var6.field2582[arg1];
        if (var7 == null) {
            return;
        }
        class207 var8 = new class207();
        var8.field2564 = arg0;
        var8.field2544 = var6;
        var8.field2551 = var7;
        var8.field2546 = var6.field2592[arg1];
        var8.field2557 = var6.field2587[arg1];
        var8.field2548 = arg1;
        var8.field2549 = var6.field2584 * arg2 * arg2 * var6.field2589[arg1] + 1024 >> 11;
        var8.field2550 = var6.field2585[arg1] & 0xFF;
        var8.field2560 = (arg1 << 8) - (var6.field2591[arg1] & 0x7FFF);
        var8.field2554 = 0;
        var8.field2555 = 0;
        var8.field2556 = 0;
        var8.field2561 = -1;
        var8.field2558 = 0;
        if (this.field2530[arg0] == 0) {
            var8.field2562 = class117.method1977(var7, this.method3573(var8), this.method3528(var8), this.method3531(var8));
        } else {
            var8.field2562 = class117.method1977(var7, this.method3573(var8), 0, this.method3531(var8));
            this.method3540(var8, var6.field2591[arg1] < 0);
        }
        if (var6.field2591[arg1] < 0) {
            var8.field2562.method1958(-1);
        }
        if (var8.field2557 >= 0) {
            class207 var9 = this.field2534[arg0][var8.field2557];
            if (var9 != null && var9.field2561 < 0) {
                this.field2533[arg0][var9.field2548] = null;
                var9.field2561 = 0;
            }
            this.field2534[arg0][var8.field2557] = var8;
        }
        this.field2541.field2594.method3405(var8);
        this.field2533[arg0][arg1] = var8;
    }

    @ObfuscatedName("gy.x(Lgr;ZI)V")
    public void method3540(class207 arg0, boolean arg1) {
        int var3 = arg0.field2551.field1617.length;
        int var5;
        if (arg1 && arg0.field2551.field1620) {
            int var4 = var3 + var3 - arg0.field2551.field1618;
            var5 = (int) ((long) this.field2530[arg0.field2564] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2562.method1965(true);
            }
        } else {
            var5 = (int) ((long) this.field2530[arg0.field2564] * (long) var3 >> 6);
        }
        arg0.field2562.method1964(var5);
    }

    @ObfuscatedName("gy.g(IIIB)V")
    public void method3515(int arg0, int arg1, int arg2) {
        class207 var4 = this.field2533[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2533[arg0][arg1] = null;
        if ((this.field2527[arg0] & 0x2) == 0) {
            var4.field2561 = 0;
            return;
        }
        for (class207 var5 = (class207) this.field2541.field2594.method3410(); var5 != null; var5 = (class207) this.field2541.field2594.method3412()) {
            if (var4.field2564 == var5.field2564 && var5.field2561 < 0 && var4 != var5) {
                var4.field2561 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("gy.w(IIII)V")
    public void method3516(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("gy.ar(IIB)V")
    public void method3517(int arg0, int arg1) {
    }

    @ObfuscatedName("gy.ax(III)V")
    public void method3580(int arg0, int arg1) {
        this.field2519[arg0] = arg1;
    }

    @ObfuscatedName("gy.al(II)V")
    public void method3594(int arg0) {
        for (class207 var2 = (class207) this.field2541.field2594.method3410(); var2 != null; var2 = (class207) this.field2541.field2594.method3412()) {
            if (arg0 < 0 || var2.field2564 == arg0) {
                if (var2.field2562 != null) {
                    var2.field2562.method1978(Statics.field899 / 100);
                    if (var2.field2562.method1973()) {
                        this.field2541.field2595.method1761(var2.field2562);
                    }
                    var2.method3600();
                }
                if (var2.field2561 < 0) {
                    this.field2533[var2.field2564][var2.field2548] = null;
                }
                var2.method3397();
            }
        }
    }

    @ObfuscatedName("gy.ag(II)V")
    public void method3555(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3555(var2);
            }
            return;
        }
        this.field2539[arg0] = 12800;
        this.field2520[arg0] = 8192;
        this.field2516[arg0] = 16383;
        this.field2519[arg0] = 8192;
        this.field2525[arg0] = 0;
        this.field2526[arg0] = 8192;
        this.method3503(arg0);
        this.method3537(arg0);
        this.field2527[arg0] = 0;
        this.field2532[arg0] = 32767;
        this.field2515[arg0] = 256;
        this.field2530[arg0] = 0;
        this.method3526(arg0, 8192);
    }

    @ObfuscatedName("gy.ad(II)V")
    public void method3521(int arg0) {
        for (class207 var2 = (class207) this.field2541.field2594.method3410(); var2 != null; var2 = (class207) this.field2541.field2594.method3412()) {
            if ((arg0 < 0 || var2.field2564 == arg0) && var2.field2561 < 0) {
                this.field2533[var2.field2564][var2.field2548] = null;
                var2.field2561 = 0;
            }
        }
    }

    @ObfuscatedName("gy.ab(I)V")
    public void method3522() {
        this.method3594(-1);
        this.method3555(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2524[var1] = this.field2521[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2518[var2] = this.field2521[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("gy.am(II)V")
    public void method3503(int arg0) {
        if ((this.field2527[arg0] & 0x2) == 0) {
            return;
        }
        for (class207 var2 = (class207) this.field2541.field2594.method3410(); var2 != null; var2 = (class207) this.field2541.field2594.method3412()) {
            if (var2.field2564 == arg0 && this.field2533[arg0][var2.field2548] == null && var2.field2561 < 0) {
                var2.field2561 = 0;
            }
        }
    }

    @ObfuscatedName("gy.aq(II)V")
    public void method3537(int arg0) {
        if ((this.field2527[arg0] & 0x4) == 0) {
            return;
        }
        for (class207 var2 = (class207) this.field2541.field2594.method3410(); var2 != null; var2 = (class207) this.field2541.field2594.method3412()) {
            if (var2.field2564 == arg0) {
                var2.field2545 = 0;
            }
        }
    }

    @ObfuscatedName("gy.at(II)V")
    public void method3525(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3515(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3509(var6, var7, var8);
            } else {
                this.method3515(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3516(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2518[var12] = (var14 << 14) + (this.field2518[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2518[var12] = (var14 << 7) + (this.field2518[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2525[var12] = (var14 << 7) + (this.field2525[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2525[var12] = (this.field2525[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2526[var12] = (var14 << 7) + (this.field2526[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2526[var12] = (this.field2526[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2539[var12] = (var14 << 7) + (this.field2539[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2539[var12] = (this.field2539[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2520[var12] = (var14 << 7) + (this.field2520[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2520[var12] = (this.field2520[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2516[var12] = (var14 << 7) + (this.field2516[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2516[var12] = (this.field2516[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2527[var12] |= 0x1;
                } else {
                    this.field2527[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2527[var12] |= 0x2;
                } else {
                    this.method3503(var12);
                    this.field2527[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2532[var12] = (var14 << 7) + (this.field2532[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2532[var12] = (this.field2532[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2532[var12] = (var14 << 7) + (this.field2532[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2532[var12] = (this.field2532[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3594(var12);
            }
            if (var13 == 121) {
                this.method3555(var12);
            }
            if (var13 == 123) {
                this.method3521(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2532[var12];
                if (var15 == 16384) {
                    this.field2515[var12] = (var14 << 7) + (this.field2515[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2532[var12];
                if (var16 == 16384) {
                    this.field2515[var12] = (this.field2515[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2530[var12] = (var14 << 7) + (this.field2530[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2530[var12] = (this.field2530[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2527[var12] |= 0x4;
                } else {
                    this.method3537(var12);
                    this.field2527[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3526(var12, (var14 << 7) + (this.field2531[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3526(var12, (this.field2531[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3512(var17, this.field2518[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3517(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method3580(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3522();
            }
        }
    }

    @ObfuscatedName("gy.az(III)V")
    public void method3526(int arg0, int arg1) {
        this.field2531[arg0] = arg1;
        this.field2540[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("gy.ah(Lgr;I)I")
    public int method3573(class207 arg0) {
        int var2 = (arg0.field2553 * arg0.field2547 >> 12) + arg0.field2560;
        int var3 = ((this.field2519[arg0.field2564] - 8192) * this.field2515[arg0.field2564] >> 12) + var2;
        class204 var4 = arg0.field2546;
        if (var4.field2501 > 0 && (var4.field2500 > 0 || this.field2525[arg0.field2564] > 0)) {
            int var5 = var4.field2500 << 2;
            int var6 = var4.field2502 << 1;
            if (arg0.field2559 < var6) {
                var5 = arg0.field2559 * var5 / var6;
            }
            int var7 = (this.field2525[arg0.field2564] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2552 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2551.field1619 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field899 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("gy.an(Lgr;I)I")
    public int method3528(class207 arg0) {
        class204 var2 = arg0.field2546;
        int var3 = this.field2516[arg0.field2564] * this.field2539[arg0.field2564] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2549 * var4 + 16384 >> 15;
        int var6 = this.field2529 * var5 + 128 >> 8;
        if (var2.field2503 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2554 * 1.953125E-5D * (double) var2.field2503) + 0.5D);
        }
        if (var2.field2496 != null) {
            int var7 = arg0.field2555;
            int var8 = var2.field2496[arg0.field2556 + 1];
            if (arg0.field2556 < var2.field2496.length - 2) {
                int var9 = (var2.field2496[arg0.field2556] & 0xFF) << 8;
                int var10 = (var2.field2496[arg0.field2556 + 2] & 0xFF) << 8;
                var8 += (var2.field2496[arg0.field2556 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2561 > 0 && var2.field2495 != null) {
            int var11 = arg0.field2561;
            int var12 = var2.field2495[arg0.field2558 + 1];
            if (arg0.field2558 < var2.field2495.length - 2) {
                int var13 = (var2.field2495[arg0.field2558] & 0xFF) << 8;
                int var14 = (var2.field2495[arg0.field2558 + 2] & 0xFF) << 8;
                var12 += (var2.field2495[arg0.field2558 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("gy.af(Lgr;I)I")
    public int method3531(class207 arg0) {
        int var2 = this.field2520[arg0.field2564];
        return var2 < 8192 ? arg0.field2550 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2550) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("gy.n()Lds;")
    public synchronized class119 method1753() {
        return this.field2541;
    }

    @ObfuscatedName("gy.q()Lds;")
    public synchronized class119 method1731() {
        return null;
    }

    @ObfuscatedName("gy.b()I")
    public synchronized int method1732() {
        return 0;
    }

    @ObfuscatedName("gy.k([III)V")
    public synchronized void method1733(int[] arg0, int arg1, int arg2) {
        if (this.field2535.method3639()) {
            int var4 = this.field2517 * this.field2535.field2574 / Statics.field899;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2523;
                if (this.field2522 - var5 >= 0L) {
                    this.field2523 = var5;
                    break;
                }
                int var7 = (int) ((this.field2522 - this.field2523 + (long) var4 - 1L) / (long) var4);
                this.field2523 += (long) var4 * (long) var7;
                this.field2541.method1733(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3532();
            } while (this.field2535.method3639());
        }
        this.field2541.method1733(arg0, arg1, arg2);
    }

    @ObfuscatedName("gy.d(I)V")
    public synchronized void method1742(int arg0) {
        if (this.field2535.method3639()) {
            int var2 = this.field2517 * this.field2535.field2574 / Statics.field899;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2523;
                if (this.field2522 - var3 >= 0L) {
                    this.field2523 = var3;
                    break;
                }
                int var5 = (int) ((this.field2522 - this.field2523 + (long) var2 - 1L) / (long) var2);
                this.field2523 += (long) var2 * (long) var5;
                this.field2541.method1742(var5);
                arg0 -= var5;
                this.method3532();
            } while (this.field2535.method3639());
        }
        this.field2541.method1742(arg0);
    }

    @ObfuscatedName("gy.ak(B)V")
    public void method3532() {
        int var1 = this.field2537;
        int var2 = this.field2538;
        long var3 = this.field2522;
        while (this.field2538 == var2) {
            while (this.field2535.field2571[var1] == var2) {
                this.field2535.method3608(var1);
                int var5 = this.field2535.method3633(var1);
                if (var5 == 1) {
                    this.field2535.method3610();
                    this.field2535.method3609(var1);
                    if (this.field2535.method3605()) {
                        if (!this.field2536 || var2 == 0) {
                            this.method3522();
                            this.field2535.method3603();
                            return;
                        }
                        this.field2535.method3617(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3525(var5);
                }
                this.field2535.method3611(var1);
                this.field2535.method3609(var1);
            }
            var1 = this.field2535.method3615();
            var2 = this.field2535.field2571[var1];
            var3 = this.field2535.method3614(var2);
        }
        this.field2537 = var1;
        this.field2538 = var2;
        this.field2522 = var3;
    }

    @ObfuscatedName("gy.as(Lgr;B)Z")
    public boolean method3533(class207 arg0) {
        if (arg0.field2562 != null) {
            return false;
        }
        if (arg0.field2561 >= 0) {
            arg0.method3397();
            if (arg0.field2557 > 0 && this.field2534[arg0.field2564][arg0.field2557] == arg0) {
                this.field2534[arg0.field2564][arg0.field2557] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("gy.ai(Lgr;[IIII)Z")
    public boolean method3534(class207 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2543 = Statics.field899 / 100;
        if (arg0.field2561 >= 0 && arg0.field2562 == null || arg0.field2562.method1972()) {
            arg0.method3600();
            arg0.method3397();
            if (arg0.field2557 > 0 && this.field2534[arg0.field2564][arg0.field2557] == arg0) {
                this.field2534[arg0.field2564][arg0.field2557] = null;
            }
            return true;
        }
        int var5 = arg0.field2553;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2526[arg0.field2564] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2553 = var6;
        }
        arg0.field2562.method1983(this.method3573(arg0));
        class204 var7 = arg0.field2546;
        boolean var8 = false;
        arg0.field2559++;
        arg0.field2552 += var7.field2501;
        double var9 = (double) ((arg0.field2548 - 60 << 8) + (arg0.field2553 * arg0.field2547 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2503 > 0) {
            if (var7.field2499 > 0) {
                arg0.field2554 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2499 * var9) + 0.5D);
            } else {
                arg0.field2554 += 128;
            }
        }
        if (var7.field2496 != null) {
            if (var7.field2497 > 0) {
                arg0.field2555 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2497 * var9) + 0.5D);
            } else {
                arg0.field2555 += 128;
            }
            while (arg0.field2556 < var7.field2496.length - 2 && arg0.field2555 > (var7.field2496[arg0.field2556 + 2] & 0xFF) << 8) {
                arg0.field2556 += 2;
            }
            if (arg0.field2556 == var7.field2496.length - 2 && var7.field2496[arg0.field2556 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2561 >= 0 && var7.field2495 != null && (this.field2527[arg0.field2564] & 0x1) == 0 && (arg0.field2557 < 0 || this.field2534[arg0.field2564][arg0.field2557] != arg0)) {
            if (var7.field2498 > 0) {
                arg0.field2561 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2498 * var9) + 0.5D);
            } else {
                arg0.field2561 += 128;
            }
            while (arg0.field2558 < var7.field2495.length - 2 && arg0.field2561 > (var7.field2495[arg0.field2558 + 2] & 0xFF) << 8) {
                arg0.field2558 += 2;
            }
            if (arg0.field2558 == var7.field2495.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2562.method1968(arg0.field2543, this.method3528(arg0), this.method3531(arg0));
            return false;
        }
        arg0.field2562.method1978(arg0.field2543);
        if (arg1 == null) {
            arg0.field2562.method1742(arg3);
        } else {
            arg0.field2562.method1733(arg1, arg2, arg3);
        }
        if (arg0.field2562.method1973()) {
            this.field2541.field2595.method1761(arg0.field2562);
        }
        arg0.method3600();
        if (arg0.field2561 >= 0) {
            arg0.method3397();
            if (arg0.field2557 > 0 && this.field2534[arg0.field2564][arg0.field2557] == arg0) {
                this.field2534[arg0.field2564][arg0.field2557] = null;
            }
        }
        return true;
    }
}
