package deob;

@ObfuscatedName("ht")
public class class221 extends class108 {

    @ObfuscatedName("ht.c")
    public class205 field2508 = new class205(128);

    @ObfuscatedName("ht.q")
    public int field2509 = 256;

    @ObfuscatedName("ht.m")
    public int field2521 = 1000000;

    @ObfuscatedName("ht.j")
    public int[] field2525 = new int[16];

    @ObfuscatedName("ht.g")
    public int[] field2512 = new int[16];

    @ObfuscatedName("ht.i")
    public int[] field2513 = new int[16];

    @ObfuscatedName("ht.h")
    public int[] field2514 = new int[16];

    @ObfuscatedName("ht.l")
    public int[] field2515 = new int[16];

    @ObfuscatedName("ht.d")
    public int[] field2529 = new int[16];

    @ObfuscatedName("ht.o")
    public int[] field2517 = new int[16];

    @ObfuscatedName("ht.s")
    public int[] field2527 = new int[16];

    @ObfuscatedName("ht.k")
    public int[] field2516 = new int[16];

    @ObfuscatedName("ht.w")
    public int[] field2520 = new int[16];

    @ObfuscatedName("ht.e")
    public int[] field2518 = new int[16];

    @ObfuscatedName("ht.a")
    public int[] field2522 = new int[16];

    @ObfuscatedName("ht.z")
    public int[] field2523 = new int[16];

    @ObfuscatedName("ht.y")
    public int[] field2524 = new int[16];

    @ObfuscatedName("ht.u")
    public int[] field2510 = new int[16];

    @ObfuscatedName("ht.f")
    public class222[][] field2526 = new class222[16][128];

    @ObfuscatedName("ht.at")
    public class222[][] field2532 = new class222[16][128];

    @ObfuscatedName("ht.ay")
    public class223 field2528 = new class223();

    @ObfuscatedName("ht.ak")
    public boolean field2511;

    @ObfuscatedName("ht.az")
    public int field2530;

    @ObfuscatedName("ht.aj")
    public int field2531;

    @ObfuscatedName("ht.af")
    public long field2519;

    @ObfuscatedName("ht.ah")
    public long field2533;

    @ObfuscatedName("ht.ab")
    public class225 field2534 = new class225(this);

    public class221() {
        this.method3865();
    }

    @ObfuscatedName("ht.c(IB)V")
    public synchronized void method3846(int arg0) {
        this.field2509 = arg0;
    }

    @ObfuscatedName("ht.q(I)I")
    public int method3847() {
        return this.field2509;
    }

    @ObfuscatedName("ht.m(Lha;Lih;Lcs;II)Z")
    public synchronized boolean method3848(class226 arg0, class250 arg1, class101 arg2, int arg3) {
        arg0.method4022();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class216 var7 = (class216) arg0.field2588.method3690(); var7 != null; var7 = (class216) arg0.field2588.method3692()) {
            int var8 = (int) var7.field2466;
            class224 var9 = (class224) this.field2508.method3687((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method4217(var8);
                class224 var11;
                if (var10 == null) {
                    var11 = null;
                } else {
                    var11 = new class224(var10);
                }
                var9 = var11;
                if (var11 == null) {
                    var5 = false;
                    continue;
                }
                this.field2508.method3691(var11, (long) var8);
            }
            if (!var9.method4008(arg2, var7.field2484, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method4025();
        }
        return var5;
    }

    @ObfuscatedName("ht.j(B)V")
    public synchronized void method3849() {
        for (class224 var1 = (class224) this.field2508.method3690(); var1 != null; var1 = (class224) this.field2508.method3692()) {
            var1.method4009();
        }
    }

    @ObfuscatedName("ht.g(I)V")
    public synchronized void method3850() {
        for (class224 var1 = (class224) this.field2508.method3690(); var1 != null; var1 = (class224) this.field2508.method3692()) {
            var1.method3733();
        }
    }

    @ObfuscatedName("ht.k(Lha;ZI)V")
    public synchronized void method3851(class226 arg0, boolean arg1) {
        this.method3852();
        this.field2528.method3961(arg0.field2587);
        this.field2511 = arg1;
        this.field2519 = 0L;
        int var3 = this.field2528.method3964();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2528.method3965(var4);
            this.field2528.method3968(var4);
            this.field2528.method3966(var4);
        }
        this.field2530 = this.field2528.method3990();
        this.field2531 = this.field2528.field2562[this.field2530];
        this.field2533 = this.field2528.method3972(this.field2531);
    }

    @ObfuscatedName("ht.p(I)V")
    public synchronized void method3852() {
        this.field2528.method3985();
        this.method3865();
    }

    @ObfuscatedName("ht.n(B)Z")
    public synchronized boolean method3853() {
        return this.field2528.method3986();
    }

    @ObfuscatedName("ht.t(III)V")
    public synchronized void method3872(int arg0, int arg1) {
        this.method3888(arg0, arg1);
    }

    @ObfuscatedName("ht.r(III)V")
    public void method3888(int arg0, int arg1) {
        this.field2514[arg0] = arg1;
        this.field2529[arg0] = arg1 & 0xFFFFFF80;
        this.method3856(arg0, arg1);
    }

    @ObfuscatedName("ht.x(III)V")
    public void method3856(int arg0, int arg1) {
        if (this.field2515[arg0] != arg1) {
            this.field2515[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2532[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("ht.b(IIII)V")
    public void method3855(int arg0, int arg1, int arg2) {
        this.method3858(arg0, arg1, 64);
        if ((this.field2520[arg0] & 0x2) != 0) {
            for (class222 var4 = (class222) this.field2534.field2582.method3738(); var4 != null; var4 = (class222) this.field2534.field2582.method3745()) {
                if (var4.field2546 == arg0 && var4.field2550 < 0) {
                    this.field2526[arg0][var4.field2540] = null;
                    this.field2526[arg0][arg1] = var4;
                    int var5 = (var4.field2544 * var4.field2535 >> 12) + var4.field2543;
                    var4.field2543 += arg1 - var4.field2540 << 8;
                    var4.field2535 = var5 - var4.field2543;
                    var4.field2544 = 4096;
                    var4.field2540 = arg1;
                    return;
                }
            }
        }
        class224 var6 = (class224) this.field2508.method3687((long) this.field2515[arg0]);
        if (var6 == null) {
            return;
        }
        class96 var7 = var6.field2573[arg1];
        if (var7 == null) {
            return;
        }
        class222 var8 = new class222();
        var8.field2546 = arg0;
        var8.field2551 = var6;
        var8.field2545 = var7;
        var8.field2538 = var6.field2580[arg1];
        var8.field2539 = var6.field2578[arg1];
        var8.field2540 = arg1;
        var8.field2541 = var6.field2577 * arg2 * arg2 * var6.field2575[arg1] + 1024 >> 11;
        var8.field2542 = var6.field2576[arg1] & 0xFF;
        var8.field2543 = (arg1 << 8) - (var6.field2574[arg1] & 0x7FFF);
        var8.field2537 = 0;
        var8.field2547 = 0;
        var8.field2548 = 0;
        var8.field2550 = -1;
        var8.field2549 = 0;
        if (this.field2523[arg0] == 0) {
            var8.field2553 = class106.method2111(var7, this.method3870(var8), this.method3871(var8), this.method3932(var8));
        } else {
            var8.field2553 = class106.method2111(var7, this.method3870(var8), 0, this.method3932(var8));
            this.method3857(var8, var6.field2574[arg1] < 0);
        }
        if (var6.field2574[arg1] < 0) {
            var8.field2553.method2091(-1);
        }
        if (var8.field2539 >= 0) {
            class222 var9 = this.field2532[arg0][var8.field2539];
            if (var9 != null && var9.field2550 < 0) {
                this.field2526[arg0][var9.field2540] = null;
                var9.field2550 = 0;
            }
            this.field2532[arg0][var8.field2539] = var8;
        }
        this.field2534.field2582.method3740(var8);
        this.field2526[arg0][arg1] = var8;
    }

    @ObfuscatedName("ht.w(Lhb;ZI)V")
    public void method3857(class222 arg0, boolean arg1) {
        int var3 = arg0.field2545.field1338.length;
        int var5;
        if (arg1 && arg0.field2545.field1341) {
            int var4 = var3 + var3 - arg0.field2545.field1340;
            var5 = (int) ((long) this.field2523[arg0.field2546] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2553.method2098(true);
            }
        } else {
            var5 = (int) ((long) this.field2523[arg0.field2546] * (long) var3 >> 6);
        }
        arg0.field2553.method2208(var5);
    }

    @ObfuscatedName("ht.a(IIII)V")
    public void method3858(int arg0, int arg1, int arg2) {
        class222 var4 = this.field2526[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2526[arg0][arg1] = null;
        if ((this.field2520[arg0] & 0x2) == 0) {
            var4.field2550 = 0;
            return;
        }
        for (class222 var5 = (class222) this.field2534.field2582.method3746(); var5 != null; var5 = (class222) this.field2534.field2582.method3747()) {
            if (var4.field2546 == var5.field2546 && var5.field2550 < 0 && var4 != var5) {
                var4.field2550 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("ht.z(IIIS)V")
    public void method3859(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("ht.aa(IIS)V")
    public void method3875(int arg0, int arg1) {
    }

    @ObfuscatedName("ht.ac(III)V")
    public void method3937(int arg0, int arg1) {
        this.field2517[arg0] = arg1;
    }

    @ObfuscatedName("ht.ad(IS)V")
    public void method3862(int arg0) {
        for (class222 var2 = (class222) this.field2534.field2582.method3746(); var2 != null; var2 = (class222) this.field2534.field2582.method3747()) {
            if (arg0 < 0 || var2.field2546 == arg0) {
                if (var2.field2553 != null) {
                    var2.field2553.method2148(Statics.field2434 / 100);
                    if (var2.field2553.method2106()) {
                        this.field2534.field2583.method1891(var2.field2553);
                    }
                    var2.method3952();
                }
                if (var2.field2550 < 0) {
                    this.field2526[var2.field2546][var2.field2540] = null;
                }
                var2.method3733();
            }
        }
    }

    @ObfuscatedName("ht.aq(II)V")
    public void method3863(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3863(var2);
            }
            return;
        }
        this.field2525[arg0] = 12800;
        this.field2512[arg0] = 8192;
        this.field2513[arg0] = 16383;
        this.field2517[arg0] = 8192;
        this.field2527[arg0] = 0;
        this.field2516[arg0] = 8192;
        this.method3854(arg0);
        this.method3867(arg0);
        this.field2520[arg0] = 0;
        this.field2518[arg0] = 32767;
        this.field2522[arg0] = 256;
        this.field2523[arg0] = 0;
        this.method3869(arg0, 8192);
    }

    @ObfuscatedName("ht.ax(II)V")
    public void method3860(int arg0) {
        for (class222 var2 = (class222) this.field2534.field2582.method3746(); var2 != null; var2 = (class222) this.field2534.field2582.method3747()) {
            if ((arg0 < 0 || var2.field2546 == arg0) && var2.field2550 < 0) {
                this.field2526[var2.field2546][var2.field2540] = null;
                var2.field2550 = 0;
            }
        }
    }

    @ObfuscatedName("ht.ap(I)V")
    public void method3865() {
        this.method3862(-1);
        this.method3863(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2515[var1] = this.field2514[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2529[var2] = this.field2514[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("ht.aw(II)V")
    public void method3854(int arg0) {
        if ((this.field2520[arg0] & 0x2) == 0) {
            return;
        }
        for (class222 var2 = (class222) this.field2534.field2582.method3746(); var2 != null; var2 = (class222) this.field2534.field2582.method3747()) {
            if (var2.field2546 == arg0 && this.field2526[arg0][var2.field2540] == null && var2.field2550 < 0) {
                var2.field2550 = 0;
            }
        }
    }

    @ObfuscatedName("ht.al(IB)V")
    public void method3867(int arg0) {
        if ((this.field2520[arg0] & 0x4) == 0) {
            return;
        }
        for (class222 var2 = (class222) this.field2534.field2582.method3746(); var2 != null; var2 = (class222) this.field2534.field2582.method3747()) {
            if (var2.field2546 == arg0) {
                var2.field2555 = 0;
            }
        }
    }

    @ObfuscatedName("ht.ar(II)V")
    public void method3894(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3858(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3855(var6, var7, var8);
            } else {
                this.method3858(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3859(var9, var10, var11);
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
                this.field2527[var12] = (var14 << 7) + (this.field2527[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2527[var12] = (this.field2527[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2516[var12] = (var14 << 7) + (this.field2516[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2516[var12] = (this.field2516[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2525[var12] = (var14 << 7) + (this.field2525[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2525[var12] = (this.field2525[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2512[var12] = (var14 << 7) + (this.field2512[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2512[var12] = (this.field2512[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2513[var12] = (var14 << 7) + (this.field2513[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2513[var12] = (this.field2513[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2520[var12] |= 0x1;
                } else {
                    this.field2520[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2520[var12] |= 0x2;
                } else {
                    this.method3854(var12);
                    this.field2520[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2518[var12] = (var14 << 7) + (this.field2518[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2518[var12] = (this.field2518[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2518[var12] = (var14 << 7) + (this.field2518[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2518[var12] = (this.field2518[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3862(var12);
            }
            if (var13 == 121) {
                this.method3863(var12);
            }
            if (var13 == 123) {
                this.method3860(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2518[var12];
                if (var15 == 16384) {
                    this.field2522[var12] = (var14 << 7) + (this.field2522[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2518[var12];
                if (var16 == 16384) {
                    this.field2522[var12] = (this.field2522[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2523[var12] = (var14 << 7) + (this.field2523[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2523[var12] = (this.field2523[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2520[var12] |= 0x4;
                } else {
                    this.method3867(var12);
                    this.field2520[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3869(var12, (var14 << 7) + (this.field2524[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3869(var12, (this.field2524[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3856(var17, this.field2529[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3875(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method3937(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3865();
            }
        }
    }

    @ObfuscatedName("ht.au(III)V")
    public void method3869(int arg0, int arg1) {
        this.field2524[arg0] = arg1;
        this.field2510[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("ht.av(Lhb;S)I")
    public int method3870(class222 arg0) {
        int var2 = (arg0.field2544 * arg0.field2535 >> 12) + arg0.field2543;
        int var3 = ((this.field2517[arg0.field2546] - 8192) * this.field2522[arg0.field2546] >> 12) + var2;
        class219 var4 = arg0.field2538;
        if (var4.field2497 > 0 && (var4.field2496 > 0 || this.field2527[arg0.field2546] > 0)) {
            int var5 = var4.field2496 << 2;
            int var6 = var4.field2493 << 1;
            if (arg0.field2536 < var6) {
                var5 = arg0.field2536 * var5 / var6;
            }
            int var7 = (this.field2527[arg0.field2546] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2552 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2545.field1339 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field2434 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("ht.am(Lhb;I)I")
    public int method3871(class222 arg0) {
        class219 var2 = arg0.field2538;
        int var3 = this.field2513[arg0.field2546] * this.field2525[arg0.field2546] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2541 * var4 + 16384 >> 15;
        int var6 = this.field2509 * var5 + 128 >> 8;
        if (var2.field2499 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2537 * 1.953125E-5D * (double) var2.field2499) + 0.5D);
        }
        if (var2.field2490 != null) {
            int var7 = arg0.field2547;
            int var8 = var2.field2490[arg0.field2548 + 1];
            if (arg0.field2548 < var2.field2490.length - 2) {
                int var9 = (var2.field2490[arg0.field2548] & 0xFF) << 8;
                int var10 = (var2.field2490[arg0.field2548 + 2] & 0xFF) << 8;
                var8 += (var2.field2490[arg0.field2548 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2550 > 0 && var2.field2491 != null) {
            int var11 = arg0.field2550;
            int var12 = var2.field2491[arg0.field2549 + 1];
            if (arg0.field2549 < var2.field2491.length - 2) {
                int var13 = (var2.field2491[arg0.field2549] & 0xFF) << 8;
                int var14 = (var2.field2491[arg0.field2549 + 2] & 0xFF) << 8;
                var12 += (var2.field2491[arg0.field2549 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("ht.ao(Lhb;I)I")
    public int method3932(class222 arg0) {
        int var2 = this.field2512[arg0.field2546];
        return var2 < 8192 ? arg0.field2542 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2542) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("ht.i()Ldd;")
    public synchronized class108 method1879() {
        return this.field2534;
    }

    @ObfuscatedName("ht.h()Ldd;")
    public synchronized class108 method1874() {
        return null;
    }

    @ObfuscatedName("ht.l()I")
    public synchronized int method1875() {
        return 0;
    }

    @ObfuscatedName("ht.o([III)V")
    public synchronized void method1893(int[] arg0, int arg1, int arg2) {
        if (this.field2528.method3986()) {
            int var4 = this.field2521 * this.field2528.field2559 / Statics.field2434;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2519;
                if (this.field2533 - var5 >= 0L) {
                    this.field2519 = var5;
                    break;
                }
                int var7 = (int) ((this.field2533 - this.field2519 + (long) var4 - 1L) / (long) var4);
                this.field2519 += (long) var4 * (long) var7;
                this.field2534.method1893(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3874();
            } while (this.field2528.method3986());
        }
        this.field2534.method1893(arg0, arg1, arg2);
    }

    @ObfuscatedName("ht.v(I)V")
    public synchronized void method1872(int arg0) {
        if (this.field2528.method3986()) {
            int var2 = this.field2521 * this.field2528.field2559 / Statics.field2434;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2519;
                if (this.field2533 - var3 >= 0L) {
                    this.field2519 = var3;
                    break;
                }
                int var5 = (int) ((this.field2533 - this.field2519 + (long) var2 - 1L) / (long) var2);
                this.field2519 += (long) var2 * (long) var5;
                this.field2534.method1872(var5);
                arg0 -= var5;
                this.method3874();
            } while (this.field2528.method3986());
        }
        this.field2534.method1872(arg0);
    }

    @ObfuscatedName("ht.ai(I)V")
    public void method3874() {
        int var1 = this.field2530;
        int var2 = this.field2531;
        long var3 = this.field2533;
        while (this.field2531 == var2) {
            while (this.field2528.field2562[var1] == var2) {
                this.field2528.method3965(var1);
                int var5 = this.field2528.method4002(var1);
                if (var5 == 1) {
                    this.field2528.method3967();
                    this.field2528.method3966(var1);
                    if (this.field2528.method3973()) {
                        if (!this.field2511 || var2 == 0) {
                            this.method3865();
                            this.field2528.method3985();
                            return;
                        }
                        this.field2528.method3974(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3894(var5);
                }
                this.field2528.method3968(var1);
                this.field2528.method3966(var1);
            }
            var1 = this.field2528.method3990();
            var2 = this.field2528.field2562[var1];
            var3 = this.field2528.method3972(var2);
        }
        this.field2530 = var1;
        this.field2531 = var2;
        this.field2533 = var3;
    }

    @ObfuscatedName("ht.ae(Lhb;I)Z")
    public boolean method3879(class222 arg0) {
        if (arg0.field2553 != null) {
            return false;
        }
        if (arg0.field2550 >= 0) {
            arg0.method3733();
            if (arg0.field2539 > 0 && this.field2532[arg0.field2546][arg0.field2539] == arg0) {
                this.field2532[arg0.field2546][arg0.field2539] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("ht.as(Lhb;[IIII)Z")
    public boolean method3868(class222 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2554 = Statics.field2434 / 100;
        if (arg0.field2550 >= 0 && arg0.field2553 == null || arg0.field2553.method2105()) {
            arg0.method3952();
            arg0.method3733();
            if (arg0.field2539 > 0 && this.field2532[arg0.field2546][arg0.field2539] == arg0) {
                this.field2532[arg0.field2546][arg0.field2539] = null;
            }
            return true;
        }
        int var5 = arg0.field2544;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2516[arg0.field2546] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2544 = var6;
        }
        arg0.field2553.method2103(this.method3870(arg0));
        class219 var7 = arg0.field2538;
        boolean var8 = false;
        arg0.field2536++;
        arg0.field2552 += var7.field2497;
        double var9 = (double) ((arg0.field2540 - 60 << 8) + (arg0.field2544 * arg0.field2535 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2499 > 0) {
            if (var7.field2495 > 0) {
                arg0.field2537 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2495 * var9) + 0.5D);
            } else {
                arg0.field2537 += 128;
            }
        }
        if (var7.field2490 != null) {
            if (var7.field2492 > 0) {
                arg0.field2547 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2492 * var9) + 0.5D);
            } else {
                arg0.field2547 += 128;
            }
            while (arg0.field2548 < var7.field2490.length - 2 && arg0.field2547 > (var7.field2490[arg0.field2548 + 2] & 0xFF) << 8) {
                arg0.field2548 += 2;
            }
            if (arg0.field2548 == var7.field2490.length - 2 && var7.field2490[arg0.field2548 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2550 >= 0 && var7.field2491 != null && (this.field2520[arg0.field2546] & 0x1) == 0 && (arg0.field2539 < 0 || this.field2532[arg0.field2546][arg0.field2539] != arg0)) {
            if (var7.field2494 > 0) {
                arg0.field2550 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2494 * var9) + 0.5D);
            } else {
                arg0.field2550 += 128;
            }
            while (arg0.field2549 < var7.field2491.length - 2 && arg0.field2550 > (var7.field2491[arg0.field2549 + 2] & 0xFF) << 8) {
                arg0.field2549 += 2;
            }
            if (arg0.field2549 == var7.field2491.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2553.method2101(arg0.field2554, this.method3871(arg0), this.method3932(arg0));
            return false;
        }
        arg0.field2553.method2148(arg0.field2554);
        if (arg1 == null) {
            arg0.field2553.method1872(arg3);
        } else {
            arg0.field2553.method1893(arg1, arg2, arg3);
        }
        if (arg0.field2553.method2106()) {
            this.field2534.field2583.method1891(arg0.field2553);
        }
        arg0.method3952();
        if (arg0.field2550 >= 0) {
            arg0.method3733();
            if (arg0.field2539 > 0 && this.field2532[arg0.field2546][arg0.field2539] == arg0) {
                this.field2532[arg0.field2546][arg0.field2539] = null;
            }
        }
        return true;
    }
}
