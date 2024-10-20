package deob;

@ObfuscatedName("gy")
public class class205 extends class118 {

    @ObfuscatedName("gy.s")
    public class191 field2509 = new class191(128);

    @ObfuscatedName("gy.q")
    public int field2508 = 256;

    @ObfuscatedName("gy.o")
    public int field2520 = 1000000;

    @ObfuscatedName("gy.g")
    public int[] field2510 = new int[16];

    @ObfuscatedName("gy.v")
    public int[] field2511 = new int[16];

    @ObfuscatedName("gy.p")
    public int[] field2512 = new int[16];

    @ObfuscatedName("gy.e")
    public int[] field2513 = new int[16];

    @ObfuscatedName("gy.d")
    public int[] field2514 = new int[16];

    @ObfuscatedName("gy.x")
    public int[] field2533 = new int[16];

    @ObfuscatedName("gy.z")
    public int[] field2516 = new int[16];

    @ObfuscatedName("gy.n")
    public int[] field2517 = new int[16];

    @ObfuscatedName("gy.u")
    public int[] field2518 = new int[16];

    @ObfuscatedName("gy.y")
    public int[] field2519 = new int[16];

    @ObfuscatedName("gy.k")
    public int[] field2524 = new int[16];

    @ObfuscatedName("gy.c")
    public int[] field2521 = new int[16];

    @ObfuscatedName("gy.r")
    public int[] field2522 = new int[16];

    @ObfuscatedName("gy.m")
    public int[] field2523 = new int[16];

    @ObfuscatedName("gy.l")
    public int[] field2515 = new int[16];

    @ObfuscatedName("gy.f")
    public class206[][] field2534 = new class206[16][128];

    @ObfuscatedName("gy.ap")
    public class206[][] field2525 = new class206[16][128];

    @ObfuscatedName("gy.af")
    public class207 field2527 = new class207();

    @ObfuscatedName("gy.aa")
    public boolean field2507;

    @ObfuscatedName("gy.ay")
    public int field2528;

    @ObfuscatedName("gy.aw")
    public int field2530;

    @ObfuscatedName("gy.az")
    public long field2531;

    @ObfuscatedName("gy.at")
    public long field2532;

    @ObfuscatedName("gy.ao")
    public class209 field2529 = new class209(this);

    public class205() {
        this.method3541();
    }

    @ObfuscatedName("gy.w(IB)V")
    public synchronized void method3560(int arg0) {
        this.field2508 = arg0;
    }

    @ObfuscatedName("gy.s(I)I")
    public int method3584() {
        return this.field2508;
    }

    @ObfuscatedName("gy.q(Lhm;Lip;Ldt;II)Z")
    public synchronized boolean method3523(class210 arg0, class236 arg1, class111 arg2, int arg3) {
        arg0.method3699();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class200 var7 = (class200) arg0.field2588.method3377(); var7 != null; var7 = (class200) arg0.field2588.method3378()) {
            int var8 = (int) var7.field2464;
            class208 var9 = (class208) this.field2509.method3387((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method3916(var8);
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
                this.field2509.method3374(var11, (long) var8);
            }
            if (!var9.method3678(arg2, var7.field2480, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3700();
        }
        return var5;
    }

    @ObfuscatedName("gy.o(B)V")
    public synchronized void method3524() {
        for (class208 var1 = (class208) this.field2509.method3377(); var1 != null; var1 = (class208) this.field2509.method3378()) {
            var1.method3679();
        }
    }

    @ObfuscatedName("gy.g(I)V")
    public synchronized void method3525() {
        for (class208 var1 = (class208) this.field2509.method3377(); var1 != null; var1 = (class208) this.field2509.method3378()) {
            var1.method3425();
        }
    }

    @ObfuscatedName("gy.x(Lhm;ZI)V")
    public synchronized void method3522(class210 arg0, boolean arg1) {
        this.method3527();
        this.field2527.method3632(arg0.field2589);
        this.field2507 = arg1;
        this.field2531 = 0L;
        int var3 = this.field2527.method3635();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2527.method3636(var4);
            this.field2527.method3639(var4);
            this.field2527.method3630(var4);
        }
        this.field2528 = this.field2527.method3643();
        this.field2530 = this.field2527.field2561[this.field2528];
        this.field2532 = this.field2527.method3642(this.field2530);
    }

    @ObfuscatedName("gy.i(B)V")
    public synchronized void method3527() {
        this.field2527.method3633();
        this.method3541();
    }

    @ObfuscatedName("gy.h(I)Z")
    public synchronized boolean method3600() {
        return this.field2527.method3634();
    }

    @ObfuscatedName("gy.b(III)V")
    public synchronized void method3585(int arg0, int arg1) {
        this.method3569(arg0, arg1);
    }

    @ObfuscatedName("gy.j(III)V")
    public void method3569(int arg0, int arg1) {
        this.field2513[arg0] = arg1;
        this.field2533[arg0] = arg1 & 0xFFFFFF80;
        this.method3531(arg0, arg1);
    }

    @ObfuscatedName("gy.y(IIB)V")
    public void method3531(int arg0, int arg1) {
        if (this.field2514[arg0] != arg1) {
            this.field2514[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2525[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("gy.c(IIIB)V")
    public void method3532(int arg0, int arg1, int arg2) {
        this.method3612(arg0, arg1, 64);
        if ((this.field2519[arg0] & 0x2) != 0) {
            for (class206 var4 = (class206) this.field2529.field2583.method3439(); var4 != null; var4 = (class206) this.field2529.field2583.method3437()) {
                if (var4.field2550 == arg0 && var4.field2545 < 0) {
                    this.field2534[arg0][var4.field2540] = null;
                    this.field2534[arg0][arg1] = var4;
                    int var5 = (var4.field2543 * var4.field2535 >> 12) + var4.field2542;
                    var4.field2542 += arg1 - var4.field2540 << 8;
                    var4.field2543 = var5 - var4.field2542;
                    var4.field2535 = 4096;
                    var4.field2540 = arg1;
                    return;
                }
            }
        }
        class208 var6 = (class208) this.field2509.method3387((long) this.field2514[arg0]);
        if (var6 == null) {
            return;
        }
        class106 var7 = var6.field2572[arg1];
        if (var7 == null) {
            return;
        }
        class206 var8 = new class206();
        var8.field2550 = arg0;
        var8.field2552 = var6;
        var8.field2537 = var7;
        var8.field2538 = var6.field2575[arg1];
        var8.field2539 = var6.field2573[arg1];
        var8.field2540 = arg1;
        var8.field2541 = var6.field2577 * arg2 * arg2 * var6.field2574[arg1] + 1024 >> 11;
        var8.field2544 = var6.field2571[arg1] & 0xFF;
        var8.field2542 = (arg1 << 8) - (var6.field2576[arg1] & 0x7FFF);
        var8.field2546 = 0;
        var8.field2547 = 0;
        var8.field2548 = 0;
        var8.field2545 = -1;
        var8.field2549 = 0;
        if (this.field2522[arg0] == 0) {
            var8.field2553 = class116.method2010(var7, this.method3545(var8), this.method3608(var8), this.method3547(var8));
        } else {
            var8.field2553 = class116.method2010(var7, this.method3545(var8), 0, this.method3547(var8));
            this.method3533(var8, var6.field2576[arg1] < 0);
        }
        if (var6.field2576[arg1] < 0) {
            var8.field2553.method2012(-1);
        }
        if (var8.field2539 >= 0) {
            class206 var9 = this.field2525[arg0][var8.field2539];
            if (var9 != null && var9.field2545 < 0) {
                this.field2534[arg0][var9.field2540] = null;
                var9.field2545 = 0;
            }
            this.field2525[arg0][var8.field2539] = var8;
        }
        this.field2529.field2583.method3429(var8);
        this.field2534[arg0][arg1] = var8;
    }

    @ObfuscatedName("gy.r(Lgu;ZI)V")
    public void method3533(class206 arg0, boolean arg1) {
        int var3 = arg0.field2537.field1601.length;
        int var5;
        if (arg1 && arg0.field2537.field1604) {
            int var4 = var3 + var3 - arg0.field2537.field1600;
            var5 = (int) ((long) this.field2522[arg0.field2550] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2553.method2076(true);
            }
        } else {
            var5 = (int) ((long) this.field2522[arg0.field2550] * (long) var3 >> 6);
        }
        arg0.field2553.method2018(var5);
    }

    @ObfuscatedName("gy.m(IIIB)V")
    public void method3612(int arg0, int arg1, int arg2) {
        class206 var4 = this.field2534[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2534[arg0][arg1] = null;
        if ((this.field2519[arg0] & 0x2) == 0) {
            var4.field2545 = 0;
            return;
        }
        for (class206 var5 = (class206) this.field2529.field2583.method3427(); var5 != null; var5 = (class206) this.field2529.field2583.method3435()) {
            if (var4.field2550 == var5.field2550 && var5.field2545 < 0 && var4 != var5) {
                var4.field2545 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("gy.l(IIIB)V")
    public void method3535(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("gy.f(III)V")
    public void method3548(int arg0, int arg1) {
    }

    @ObfuscatedName("gy.ap(III)V")
    public void method3534(int arg0, int arg1) {
        this.field2516[arg0] = arg1;
    }

    @ObfuscatedName("gy.af(II)V")
    public void method3538(int arg0) {
        for (class206 var2 = (class206) this.field2529.field2583.method3427(); var2 != null; var2 = (class206) this.field2529.field2583.method3435()) {
            if (arg0 < 0 || var2.field2550 == arg0) {
                if (var2.field2553 != null) {
                    var2.field2553.method2023(Statics.field1621 / 100);
                    if (var2.field2553.method2083()) {
                        this.field2529.field2584.method1779(var2.field2553);
                    }
                    var2.method3626();
                }
                if (var2.field2545 < 0) {
                    this.field2534[var2.field2550][var2.field2540] = null;
                }
                var2.method3425();
            }
        }
    }

    @ObfuscatedName("gy.aa(II)V")
    public void method3539(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3539(var2);
            }
            return;
        }
        this.field2510[arg0] = 12800;
        this.field2511[arg0] = 8192;
        this.field2512[arg0] = 16383;
        this.field2516[arg0] = 8192;
        this.field2517[arg0] = 0;
        this.field2518[arg0] = 8192;
        this.method3542(arg0);
        this.method3543(arg0);
        this.field2519[arg0] = 0;
        this.field2524[arg0] = 32767;
        this.field2521[arg0] = 256;
        this.field2522[arg0] = 0;
        this.method3520(arg0, 8192);
    }

    @ObfuscatedName("gy.ay(IS)V")
    public void method3540(int arg0) {
        for (class206 var2 = (class206) this.field2529.field2583.method3427(); var2 != null; var2 = (class206) this.field2529.field2583.method3435()) {
            if ((arg0 < 0 || var2.field2550 == arg0) && var2.field2545 < 0) {
                this.field2534[var2.field2550][var2.field2540] = null;
                var2.field2545 = 0;
            }
        }
    }

    @ObfuscatedName("gy.aw(B)V")
    public void method3541() {
        this.method3538(-1);
        this.method3539(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2514[var1] = this.field2513[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2533[var2] = this.field2513[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("gy.az(II)V")
    public void method3542(int arg0) {
        if ((this.field2519[arg0] & 0x2) == 0) {
            return;
        }
        for (class206 var2 = (class206) this.field2529.field2583.method3427(); var2 != null; var2 = (class206) this.field2529.field2583.method3435()) {
            if (var2.field2550 == arg0 && this.field2534[arg0][var2.field2540] == null && var2.field2545 < 0) {
                var2.field2545 = 0;
            }
        }
    }

    @ObfuscatedName("gy.ac(II)V")
    public void method3543(int arg0) {
        if ((this.field2519[arg0] & 0x4) == 0) {
            return;
        }
        for (class206 var2 = (class206) this.field2529.field2583.method3427(); var2 != null; var2 = (class206) this.field2529.field2583.method3435()) {
            if (var2.field2550 == arg0) {
                var2.field2555 = 0;
            }
        }
    }

    @ObfuscatedName("gy.ad(IB)V")
    public void method3544(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3612(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3532(var6, var7, var8);
            } else {
                this.method3612(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3535(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2533[var12] = (var14 << 14) + (this.field2533[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2533[var12] = (var14 << 7) + (this.field2533[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2517[var12] = (var14 << 7) + (this.field2517[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2517[var12] = (this.field2517[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2518[var12] = (var14 << 7) + (this.field2518[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2518[var12] = (this.field2518[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2510[var12] = (var14 << 7) + (this.field2510[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2510[var12] = (this.field2510[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2511[var12] = (var14 << 7) + (this.field2511[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2511[var12] = (this.field2511[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2512[var12] = (var14 << 7) + (this.field2512[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2512[var12] = (this.field2512[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2519[var12] |= 0x1;
                } else {
                    this.field2519[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2519[var12] |= 0x2;
                } else {
                    this.method3542(var12);
                    this.field2519[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2524[var12] = (var14 << 7) + (this.field2524[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2524[var12] = (this.field2524[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2524[var12] = (var14 << 7) + (this.field2524[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2524[var12] = (this.field2524[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3538(var12);
            }
            if (var13 == 121) {
                this.method3539(var12);
            }
            if (var13 == 123) {
                this.method3540(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2524[var12];
                if (var15 == 16384) {
                    this.field2521[var12] = (var14 << 7) + (this.field2521[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2524[var12];
                if (var16 == 16384) {
                    this.field2521[var12] = (this.field2521[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2522[var12] = (var14 << 7) + (this.field2522[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2522[var12] = (this.field2522[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2519[var12] |= 0x4;
                } else {
                    this.method3543(var12);
                    this.field2519[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3520(var12, (var14 << 7) + (this.field2523[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3520(var12, (this.field2523[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3531(var17, this.field2533[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3548(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method3534(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3541();
            }
        }
    }

    @ObfuscatedName("gy.ak(III)V")
    public void method3520(int arg0, int arg1) {
        this.field2523[arg0] = arg1;
        this.field2515[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("gy.ai(Lgu;I)I")
    public int method3545(class206 arg0) {
        int var2 = (arg0.field2543 * arg0.field2535 >> 12) + arg0.field2542;
        int var3 = ((this.field2516[arg0.field2550] - 8192) * this.field2521[arg0.field2550] >> 12) + var2;
        class203 var4 = arg0.field2538;
        if (var4.field2493 > 0 && (var4.field2491 > 0 || this.field2517[arg0.field2550] > 0)) {
            int var5 = var4.field2491 << 2;
            int var6 = var4.field2494 << 1;
            if (arg0.field2551 < var6) {
                var5 = arg0.field2551 * var5 / var6;
            }
            int var7 = (this.field2517[arg0.field2550] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2554 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2537.field1603 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1621 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("gy.au(Lgu;I)I")
    public int method3608(class206 arg0) {
        class203 var2 = arg0.field2538;
        int var3 = this.field2512[arg0.field2550] * this.field2510[arg0.field2550] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2541 * var4 + 16384 >> 15;
        int var6 = this.field2508 * var5 + 128 >> 8;
        if (var2.field2487 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2546 * 1.953125E-5D * (double) var2.field2487) + 0.5D);
        }
        if (var2.field2489 != null) {
            int var7 = arg0.field2547;
            int var8 = var2.field2489[arg0.field2548 + 1];
            if (arg0.field2548 < var2.field2489.length - 2) {
                int var9 = (var2.field2489[arg0.field2548] & 0xFF) << 8;
                int var10 = (var2.field2489[arg0.field2548 + 2] & 0xFF) << 8;
                var8 += (var2.field2489[arg0.field2548 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2545 > 0 && var2.field2486 != null) {
            int var11 = arg0.field2545;
            int var12 = var2.field2486[arg0.field2549 + 1];
            if (arg0.field2549 < var2.field2486.length - 2) {
                int var13 = (var2.field2486[arg0.field2549] & 0xFF) << 8;
                int var14 = (var2.field2486[arg0.field2549 + 2] & 0xFF) << 8;
                var12 += (var2.field2486[arg0.field2549 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("gy.an(Lgu;I)I")
    public int method3547(class206 arg0) {
        int var2 = this.field2511[arg0.field2550];
        return var2 < 8192 ? arg0.field2544 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2544) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("gy.v()Ldm;")
    public synchronized class118 method1817() {
        return this.field2529;
    }

    @ObfuscatedName("gy.p()Ldm;")
    public synchronized class118 method1784() {
        return null;
    }

    @ObfuscatedName("gy.e()I")
    public synchronized int method1785() {
        return 0;
    }

    @ObfuscatedName("gy.d([III)V")
    public synchronized void method1786(int[] arg0, int arg1, int arg2) {
        if (this.field2527.method3634()) {
            int var4 = this.field2520 * this.field2527.field2558 / Statics.field1621;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2531;
                if (this.field2532 - var5 >= 0L) {
                    this.field2531 = var5;
                    break;
                }
                int var7 = (int) ((this.field2532 - this.field2531 + (long) var4 - 1L) / (long) var4);
                this.field2531 += (long) var4 * (long) var7;
                this.field2529.method1786(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3549();
            } while (this.field2527.method3634());
        }
        this.field2529.method1786(arg0, arg1, arg2);
    }

    @ObfuscatedName("gy.u(I)V")
    public synchronized void method1815(int arg0) {
        if (this.field2527.method3634()) {
            int var2 = this.field2520 * this.field2527.field2558 / Statics.field1621;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2531;
                if (this.field2532 - var3 >= 0L) {
                    this.field2531 = var3;
                    break;
                }
                int var5 = (int) ((this.field2532 - this.field2531 + (long) var2 - 1L) / (long) var2);
                this.field2531 += (long) var2 * (long) var5;
                this.field2529.method1815(var5);
                arg0 -= var5;
                this.method3549();
            } while (this.field2527.method3634());
        }
        this.field2529.method1815(arg0);
    }

    @ObfuscatedName("gy.as(I)V")
    public void method3549() {
        int var1 = this.field2528;
        int var2 = this.field2530;
        long var3 = this.field2532;
        while (this.field2530 == var2) {
            while (this.field2527.field2561[var1] == var2) {
                this.field2527.method3636(var1);
                int var5 = this.field2527.method3666(var1);
                if (var5 == 1) {
                    this.field2527.method3638();
                    this.field2527.method3630(var1);
                    if (this.field2527.method3644()) {
                        if (!this.field2507 || var2 == 0) {
                            this.method3541();
                            this.field2527.method3633();
                            return;
                        }
                        this.field2527.method3645(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3544(var5);
                }
                this.field2527.method3639(var1);
                this.field2527.method3630(var1);
            }
            var1 = this.field2527.method3643();
            var2 = this.field2527.field2561[var1];
            var3 = this.field2527.method3642(var2);
        }
        this.field2528 = var1;
        this.field2530 = var2;
        this.field2532 = var3;
    }

    @ObfuscatedName("gy.br(Lgu;I)Z")
    public boolean method3528(class206 arg0) {
        if (arg0.field2553 != null) {
            return false;
        }
        if (arg0.field2545 >= 0) {
            arg0.method3425();
            if (arg0.field2539 > 0 && this.field2525[arg0.field2550][arg0.field2539] == arg0) {
                this.field2525[arg0.field2550][arg0.field2539] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("gy.bj(Lgu;[IIII)Z")
    public boolean method3546(class206 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2536 = Statics.field1621 / 100;
        if (arg0.field2545 >= 0 && arg0.field2553 == null || arg0.field2553.method2026()) {
            arg0.method3626();
            arg0.method3425();
            if (arg0.field2539 > 0 && this.field2525[arg0.field2550][arg0.field2539] == arg0) {
                this.field2525[arg0.field2550][arg0.field2539] = null;
            }
            return true;
        }
        int var5 = arg0.field2535;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2518[arg0.field2550] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2535 = var6;
        }
        arg0.field2553.method2024(this.method3545(arg0));
        class203 var7 = arg0.field2538;
        boolean var8 = false;
        arg0.field2551++;
        arg0.field2554 += var7.field2493;
        double var9 = (double) ((arg0.field2540 - 60 << 8) + (arg0.field2543 * arg0.field2535 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2487 > 0) {
            if (var7.field2490 > 0) {
                arg0.field2546 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2490 * var9) + 0.5D);
            } else {
                arg0.field2546 += 128;
            }
        }
        if (var7.field2489 != null) {
            if (var7.field2488 > 0) {
                arg0.field2547 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2488 * var9) + 0.5D);
            } else {
                arg0.field2547 += 128;
            }
            while (arg0.field2548 < var7.field2489.length - 2 && arg0.field2547 > (var7.field2489[arg0.field2548 + 2] & 0xFF) << 8) {
                arg0.field2548 += 2;
            }
            if (arg0.field2548 == var7.field2489.length - 2 && var7.field2489[arg0.field2548 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2545 >= 0 && var7.field2486 != null && (this.field2519[arg0.field2550] & 0x1) == 0 && (arg0.field2539 < 0 || this.field2525[arg0.field2550][arg0.field2539] != arg0)) {
            if (var7.field2492 > 0) {
                arg0.field2545 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2492 * var9) + 0.5D);
            } else {
                arg0.field2545 += 128;
            }
            while (arg0.field2549 < var7.field2486.length - 2 && arg0.field2545 > (var7.field2486[arg0.field2549 + 2] & 0xFF) << 8) {
                arg0.field2549 += 2;
            }
            if (arg0.field2549 == var7.field2486.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2553.method2022(arg0.field2536, this.method3608(arg0), this.method3547(arg0));
            return false;
        }
        arg0.field2553.method2023(arg0.field2536);
        if (arg1 == null) {
            arg0.field2553.method1815(arg3);
        } else {
            arg0.field2553.method1786(arg1, arg2, arg3);
        }
        if (arg0.field2553.method2083()) {
            this.field2529.field2584.method1779(arg0.field2553);
        }
        arg0.method3626();
        if (arg0.field2545 >= 0) {
            arg0.method3425();
            if (arg0.field2539 > 0 && this.field2525[arg0.field2550][arg0.field2539] == arg0) {
                this.field2525[arg0.field2550][arg0.field2539] = null;
            }
        }
        return true;
    }
}
