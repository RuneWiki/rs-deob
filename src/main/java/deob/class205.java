package deob;

@ObfuscatedName("gy")
public class class205 extends class120 {

    @ObfuscatedName("gy.i")
    public class191 field2522 = new class191(128);

    @ObfuscatedName("gy.h")
    public int field2508 = 256;

    @ObfuscatedName("gy.u")
    public int field2509 = 1000000;

    @ObfuscatedName("gy.q")
    public int[] field2510 = new int[16];

    @ObfuscatedName("gy.g")
    public int[] field2511 = new int[16];

    @ObfuscatedName("gy.v")
    public int[] field2512 = new int[16];

    @ObfuscatedName("gy.t")
    public int[] field2513 = new int[16];

    @ObfuscatedName("gy.p")
    public int[] field2514 = new int[16];

    @ObfuscatedName("gy.l")
    public int[] field2520 = new int[16];

    @ObfuscatedName("gy.a")
    public int[] field2532 = new int[16];

    @ObfuscatedName("gy.k")
    public int[] field2507 = new int[16];

    @ObfuscatedName("gy.r")
    public int[] field2518 = new int[16];

    @ObfuscatedName("gy.s")
    public int[] field2519 = new int[16];

    @ObfuscatedName("gy.n")
    public int[] field2527 = new int[16];

    @ObfuscatedName("gy.y")
    public int[] field2521 = new int[16];

    @ObfuscatedName("gy.w")
    public int[] field2515 = new int[16];

    @ObfuscatedName("gy.f")
    public int[] field2523 = new int[16];

    @ObfuscatedName("gy.c")
    public int[] field2528 = new int[16];

    @ObfuscatedName("gy.z")
    public class206[][] field2525 = new class206[16][128];

    @ObfuscatedName("gy.ay")
    public class206[][] field2526 = new class206[16][128];

    @ObfuscatedName("gy.ah")
    public class207 field2529 = new class207();

    @ObfuscatedName("gy.az")
    public boolean field2516;

    @ObfuscatedName("gy.ac")
    public int field2533;

    @ObfuscatedName("gy.aq")
    public int field2530;

    @ObfuscatedName("gy.af")
    public long field2531;

    @ObfuscatedName("gy.aj")
    public long field2517;

    @ObfuscatedName("gy.ax")
    public class209 field2524 = new class209(this);

    public class205() {
        this.method3482();
    }

    @ObfuscatedName("gy.i(II)V")
    public synchronized void method3470(int arg0) {
        this.field2508 = arg0;
    }

    @ObfuscatedName("gy.h(B)I")
    public int method3471() {
        return this.field2508;
    }

    @ObfuscatedName("gy.u(Lhb;Liy;Ldu;II)Z")
    public synchronized boolean method3553(class210 arg0, class236 arg1, class113 arg2, int arg3) {
        arg0.method3653();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class200 var7 = (class200) arg0.field2587.method3322(); var7 != null; var7 = (class200) arg0.field2587.method3323()) {
            int var8 = (int) var7.field2467;
            class208 var9 = (class208) this.field2522.method3331((long) var8);
            if (var9 == null) {
                var9 = class208.method3779(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field2522.method3333(var9, (long) var8);
            }
            if (!var9.method3635(arg2, var7.field2482, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3654();
        }
        return var5;
    }

    @ObfuscatedName("gy.q(I)V")
    public synchronized void method3525() {
        for (class208 var1 = (class208) this.field2522.method3322(); var1 != null; var1 = (class208) this.field2522.method3323()) {
            var1.method3636();
        }
    }

    @ObfuscatedName("gy.g(I)V")
    public synchronized void method3474() {
        for (class208 var1 = (class208) this.field2522.method3322(); var1 != null; var1 = (class208) this.field2522.method3323()) {
            var1.method3364();
        }
    }

    @ObfuscatedName("gy.a(Lhb;ZS)V")
    public synchronized void method3475(class210 arg0, boolean arg1) {
        this.method3508();
        this.field2529.method3595(arg0.field2586);
        this.field2516 = arg1;
        this.field2531 = 0L;
        int var3 = this.field2529.method3593();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2529.method3605(var4);
            this.field2529.method3597(var4);
            this.field2529.method3590(var4);
        }
        this.field2533 = this.field2529.method3610();
        this.field2530 = this.field2529.field2560[this.field2533];
        this.field2517 = this.field2529.method3601(this.field2530);
    }

    @ObfuscatedName("gy.b(B)V")
    public synchronized void method3508() {
        this.field2529.method3629();
        this.method3482();
    }

    @ObfuscatedName("gy.x(I)Z")
    public synchronized boolean method3530() {
        return this.field2529.method3589();
    }

    @ObfuscatedName("gy.o(III)V")
    public synchronized void method3478(int arg0, int arg1) {
        this.method3559(arg0, arg1);
    }

    @ObfuscatedName("gy.j(IIB)V")
    public void method3559(int arg0, int arg1) {
        this.field2513[arg0] = arg1;
        this.field2520[arg0] = arg1 & 0xFFFFFF80;
        this.method3480(arg0, arg1);
    }

    @ObfuscatedName("gy.m(IIB)V")
    public void method3480(int arg0, int arg1) {
        if (this.field2514[arg0] != arg1) {
            this.field2514[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2526[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("gy.s(IIIB)V")
    public void method3481(int arg0, int arg1, int arg2) {
        this.method3472(arg0, arg1, 64);
        if ((this.field2519[arg0] & 0x2) != 0) {
            for (class206 var4 = (class206) this.field2524.field2583.method3382(); var4 != null; var4 = (class206) this.field2524.field2583.method3378()) {
                if (var4.field2545 == arg0 && var4.field2542 < 0) {
                    this.field2525[arg0][var4.field2535] = null;
                    this.field2525[arg0][arg1] = var4;
                    int var5 = (var4.field2544 * var4.field2539 >> 12) + var4.field2540;
                    var4.field2540 += arg1 - var4.field2535 << 8;
                    var4.field2544 = var5 - var4.field2540;
                    var4.field2539 = 4096;
                    var4.field2535 = arg1;
                    return;
                }
            }
        }
        class208 var6 = (class208) this.field2522.method3331((long) this.field2514[arg0]);
        if (var6 == null) {
            return;
        }
        class108 var7 = var6.field2571[arg1];
        if (var7 == null) {
            return;
        }
        class206 var8 = new class206();
        var8.field2545 = arg0;
        var8.field2536 = var6;
        var8.field2538 = var7;
        var8.field2541 = var6.field2575[arg1];
        var8.field2552 = var6.field2576[arg1];
        var8.field2535 = arg1;
        var8.field2537 = var6.field2574 * arg2 * arg2 * var6.field2573[arg1] + 1024 >> 11;
        var8.field2543 = var6.field2578[arg1] & 0xFF;
        var8.field2540 = (arg1 << 8) - (var6.field2572[arg1] & 0x7FFF);
        var8.field2546 = 0;
        var8.field2547 = 0;
        var8.field2548 = 0;
        var8.field2542 = -1;
        var8.field2550 = 0;
        if (this.field2515[arg0] == 0) {
            var8.field2553 = class118.method2075(var7, this.method3495(var8), this.method3496(var8), this.method3497(var8));
        } else {
            var8.field2553 = class118.method2075(var7, this.method3495(var8), 0, this.method3497(var8));
            this.method3561(var8, var6.field2572[arg1] < 0);
        }
        if (var6.field2572[arg1] < 0) {
            var8.field2553.method1980(-1);
        }
        if (var8.field2552 >= 0) {
            class206 var9 = this.field2526[arg0][var8.field2552];
            if (var9 != null && var9.field2542 < 0) {
                this.field2525[arg0][var9.field2535] = null;
                var9.field2542 = 0;
            }
            this.field2526[arg0][var8.field2552] = var8;
        }
        this.field2524.field2583.method3371(var8);
        this.field2525[arg0][arg1] = var8;
    }

    @ObfuscatedName("gy.n(Lgp;ZI)V")
    public void method3561(class206 arg0, boolean arg1) {
        int var3 = arg0.field2538.field1603.length;
        int var5;
        if (arg1 && arg0.field2538.field1602) {
            int var4 = var3 + var3 - arg0.field2538.field1604;
            var5 = (int) ((long) this.field2515[arg0.field2545] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2553.method1985(true);
            }
        } else {
            var5 = (int) ((long) this.field2515[arg0.field2545] * (long) var3 >> 6);
        }
        arg0.field2553.method2031(var5);
    }

    @ObfuscatedName("gy.y(IIII)V")
    public void method3472(int arg0, int arg1, int arg2) {
        class206 var4 = this.field2525[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2525[arg0][arg1] = null;
        if ((this.field2519[arg0] & 0x2) == 0) {
            var4.field2542 = 0;
            return;
        }
        for (class206 var5 = (class206) this.field2524.field2583.method3376(); var5 != null; var5 = (class206) this.field2524.field2583.method3377()) {
            if (var4.field2545 == var5.field2545 && var5.field2542 < 0 && var4 != var5) {
                var4.field2542 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("gy.w(IIII)V")
    public void method3484(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("gy.f(IIB)V")
    public void method3485(int arg0, int arg1) {
    }

    @ObfuscatedName("gy.c(IIB)V")
    public void method3486(int arg0, int arg1) {
        this.field2532[arg0] = arg1;
    }

    @ObfuscatedName("gy.z(II)V")
    public void method3487(int arg0) {
        for (class206 var2 = (class206) this.field2524.field2583.method3376(); var2 != null; var2 = (class206) this.field2524.field2583.method3377()) {
            if (arg0 < 0 || var2.field2545 == arg0) {
                if (var2.field2553 != null) {
                    var2.field2553.method1989(Statics.field1629 / 100);
                    if (var2.field2553.method1993()) {
                        this.field2524.field2584.method1781(var2.field2553);
                    }
                    var2.method3585();
                }
                if (var2.field2542 < 0) {
                    this.field2525[var2.field2545][var2.field2535] = null;
                }
                var2.method3364();
            }
        }
    }

    @ObfuscatedName("gy.ay(IB)V")
    public void method3488(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3488(var2);
            }
            return;
        }
        this.field2510[arg0] = 12800;
        this.field2511[arg0] = 8192;
        this.field2512[arg0] = 16383;
        this.field2532[arg0] = 8192;
        this.field2507[arg0] = 0;
        this.field2518[arg0] = 8192;
        this.method3491(arg0);
        this.method3492(arg0);
        this.field2519[arg0] = 0;
        this.field2527[arg0] = 32767;
        this.field2521[arg0] = 256;
        this.field2515[arg0] = 0;
        this.method3538(arg0, 8192);
    }

    @ObfuscatedName("gy.av(II)V")
    public void method3489(int arg0) {
        for (class206 var2 = (class206) this.field2524.field2583.method3376(); var2 != null; var2 = (class206) this.field2524.field2583.method3377()) {
            if ((arg0 < 0 || var2.field2545 == arg0) && var2.field2542 < 0) {
                this.field2525[var2.field2545][var2.field2535] = null;
                var2.field2542 = 0;
            }
        }
    }

    @ObfuscatedName("gy.ai(I)V")
    public void method3482() {
        this.method3487(-1);
        this.method3488(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2514[var1] = this.field2513[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2520[var2] = this.field2513[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("gy.am(II)V")
    public void method3491(int arg0) {
        if ((this.field2519[arg0] & 0x2) == 0) {
            return;
        }
        for (class206 var2 = (class206) this.field2524.field2583.method3376(); var2 != null; var2 = (class206) this.field2524.field2583.method3377()) {
            if (var2.field2545 == arg0 && this.field2525[arg0][var2.field2535] == null && var2.field2542 < 0) {
                var2.field2542 = 0;
            }
        }
    }

    @ObfuscatedName("gy.ap(II)V")
    public void method3492(int arg0) {
        if ((this.field2519[arg0] & 0x4) == 0) {
            return;
        }
        for (class206 var2 = (class206) this.field2524.field2583.method3376(); var2 != null; var2 = (class206) this.field2524.field2583.method3377()) {
            if (var2.field2545 == arg0) {
                var2.field2555 = 0;
            }
        }
    }

    @ObfuscatedName("gy.as(IS)V")
    public void method3493(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3472(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3481(var6, var7, var8);
            } else {
                this.method3472(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3484(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2520[var12] = (var14 << 14) + (this.field2520[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2520[var12] = (var14 << 7) + (this.field2520[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2507[var12] = (var14 << 7) + (this.field2507[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2507[var12] = (this.field2507[var12] & 0xFFFFFF80) + var14;
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
                    this.method3491(var12);
                    this.field2519[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2527[var12] = (var14 << 7) + (this.field2527[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2527[var12] = (this.field2527[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2527[var12] = (var14 << 7) + (this.field2527[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2527[var12] = (this.field2527[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3487(var12);
            }
            if (var13 == 121) {
                this.method3488(var12);
            }
            if (var13 == 123) {
                this.method3489(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2527[var12];
                if (var15 == 16384) {
                    this.field2521[var12] = (var14 << 7) + (this.field2521[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2527[var12];
                if (var16 == 16384) {
                    this.field2521[var12] = (this.field2521[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2515[var12] = (var14 << 7) + (this.field2515[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2515[var12] = (this.field2515[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2519[var12] |= 0x4;
                } else {
                    this.method3492(var12);
                    this.field2519[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3538(var12, (var14 << 7) + (this.field2523[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3538(var12, (this.field2523[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3480(var17, this.field2520[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3485(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method3486(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3482();
            }
        }
    }

    @ObfuscatedName("gy.aw(III)V")
    public void method3538(int arg0, int arg1) {
        this.field2523[arg0] = arg1;
        this.field2528[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("gy.al(Lgp;I)I")
    public int method3495(class206 arg0) {
        int var2 = (arg0.field2544 * arg0.field2539 >> 12) + arg0.field2540;
        int var3 = ((this.field2532[arg0.field2545] - 8192) * this.field2521[arg0.field2545] >> 12) + var2;
        class203 var4 = arg0.field2541;
        if (var4.field2494 > 0 && (var4.field2492 > 0 || this.field2507[arg0.field2545] > 0)) {
            int var5 = var4.field2492 << 2;
            int var6 = var4.field2495 << 1;
            if (arg0.field2551 < var6) {
                var5 = arg0.field2551 * var5 / var6;
            }
            int var7 = (this.field2507[arg0.field2545] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2549 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2538.field1606 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1629 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("gy.ak(Lgp;I)I")
    public int method3496(class206 arg0) {
        class203 var2 = arg0.field2541;
        int var3 = this.field2512[arg0.field2545] * this.field2510[arg0.field2545] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2537 * var4 + 16384 >> 15;
        int var6 = this.field2508 * var5 + 128 >> 8;
        if (var2.field2489 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2546 * 1.953125E-5D * (double) var2.field2489) + 0.5D);
        }
        if (var2.field2493 != null) {
            int var7 = arg0.field2547;
            int var8 = var2.field2493[arg0.field2548 + 1];
            if (arg0.field2548 < var2.field2493.length - 2) {
                int var9 = (var2.field2493[arg0.field2548] & 0xFF) << 8;
                int var10 = (var2.field2493[arg0.field2548 + 2] & 0xFF) << 8;
                var8 += (var2.field2493[arg0.field2548 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2542 > 0 && var2.field2488 != null) {
            int var11 = arg0.field2542;
            int var12 = var2.field2488[arg0.field2550 + 1];
            if (arg0.field2550 < var2.field2488.length - 2) {
                int var13 = (var2.field2488[arg0.field2550] & 0xFF) << 8;
                int var14 = (var2.field2488[arg0.field2550 + 2] & 0xFF) << 8;
                var12 += (var2.field2488[arg0.field2550 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("gy.aa(Lgp;I)I")
    public int method3497(class206 arg0) {
        int var2 = this.field2511[arg0.field2545];
        return var2 < 8192 ? arg0.field2543 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2543) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("gy.v()Ldw;")
    public synchronized class120 method1784() {
        return this.field2524;
    }

    @ObfuscatedName("gy.t()Ldw;")
    public synchronized class120 method1760() {
        return null;
    }

    @ObfuscatedName("gy.p()I")
    public synchronized int method1761() {
        return 0;
    }

    @ObfuscatedName("gy.l([III)V")
    public synchronized void method1762(int[] arg0, int arg1, int arg2) {
        if (this.field2529.method3589()) {
            int var4 = this.field2509 * this.field2529.field2557 / Statics.field1629;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2531;
                if (this.field2517 - var5 >= 0L) {
                    this.field2531 = var5;
                    break;
                }
                int var7 = (int) ((this.field2517 - this.field2531 + (long) var4 - 1L) / (long) var4);
                this.field2531 += (long) var4 * (long) var7;
                this.field2524.method1762(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3577();
            } while (this.field2529.method3589());
        }
        this.field2524.method1762(arg0, arg1, arg2);
    }

    @ObfuscatedName("gy.k(I)V")
    public synchronized void method1757(int arg0) {
        if (this.field2529.method3589()) {
            int var2 = this.field2509 * this.field2529.field2557 / Statics.field1629;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2531;
                if (this.field2517 - var3 >= 0L) {
                    this.field2531 = var3;
                    break;
                }
                int var5 = (int) ((this.field2517 - this.field2531 + (long) var2 - 1L) / (long) var2);
                this.field2531 += (long) var2 * (long) var5;
                this.field2524.method1757(var5);
                arg0 -= var5;
                this.method3577();
            } while (this.field2529.method3589());
        }
        this.field2524.method1757(arg0);
    }

    @ObfuscatedName("gy.an(I)V")
    public void method3577() {
        int var1 = this.field2533;
        int var2 = this.field2530;
        long var3 = this.field2517;
        while (this.field2530 == var2) {
            while (this.field2529.field2560[var1] == var2) {
                this.field2529.method3605(var1);
                int var5 = this.field2529.method3598(var1);
                if (var5 == 1) {
                    this.field2529.method3596();
                    this.field2529.method3590(var1);
                    if (this.field2529.method3603()) {
                        if (!this.field2516 || var2 == 0) {
                            this.method3482();
                            this.field2529.method3629();
                            return;
                        }
                        this.field2529.method3604(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3493(var5);
                }
                this.field2529.method3597(var1);
                this.field2529.method3590(var1);
            }
            var1 = this.field2529.method3610();
            var2 = this.field2529.field2560[var1];
            var3 = this.field2529.method3601(var2);
        }
        this.field2533 = var1;
        this.field2530 = var2;
        this.field2517 = var3;
    }

    @ObfuscatedName("gy.au(Lgp;S)Z")
    public boolean method3501(class206 arg0) {
        if (arg0.field2553 != null) {
            return false;
        }
        if (arg0.field2542 >= 0) {
            arg0.method3364();
            if (arg0.field2552 > 0 && this.field2526[arg0.field2545][arg0.field2552] == arg0) {
                this.field2526[arg0.field2545][arg0.field2552] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("gy.ab(Lgp;[IIII)Z")
    public boolean method3502(class206 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2554 = Statics.field1629 / 100;
        if (arg0.field2542 >= 0 && arg0.field2553 == null || arg0.field2553.method1992()) {
            arg0.method3585();
            arg0.method3364();
            if (arg0.field2552 > 0 && this.field2526[arg0.field2545][arg0.field2552] == arg0) {
                this.field2526[arg0.field2545][arg0.field2552] = null;
            }
            return true;
        }
        int var5 = arg0.field2539;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2518[arg0.field2545] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2539 = var6;
        }
        arg0.field2553.method1990(this.method3495(arg0));
        class203 var7 = arg0.field2541;
        boolean var8 = false;
        arg0.field2551++;
        arg0.field2549 += var7.field2494;
        double var9 = (double) ((arg0.field2535 - 60 << 8) + (arg0.field2544 * arg0.field2539 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2489 > 0) {
            if (var7.field2491 > 0) {
                arg0.field2546 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2491 * var9) + 0.5D);
            } else {
                arg0.field2546 += 128;
            }
        }
        if (var7.field2493 != null) {
            if (var7.field2490 > 0) {
                arg0.field2547 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2490 * var9) + 0.5D);
            } else {
                arg0.field2547 += 128;
            }
            while (arg0.field2548 < var7.field2493.length - 2 && arg0.field2547 > (var7.field2493[arg0.field2548 + 2] & 0xFF) << 8) {
                arg0.field2548 += 2;
            }
            if (arg0.field2548 == var7.field2493.length - 2 && var7.field2493[arg0.field2548 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2542 >= 0 && var7.field2488 != null && (this.field2519[arg0.field2545] & 0x1) == 0 && (arg0.field2552 < 0 || this.field2526[arg0.field2545][arg0.field2552] != arg0)) {
            if (var7.field2487 > 0) {
                arg0.field2542 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2487 * var9) + 0.5D);
            } else {
                arg0.field2542 += 128;
            }
            while (arg0.field2550 < var7.field2488.length - 2 && arg0.field2542 > (var7.field2488[arg0.field2550 + 2] & 0xFF) << 8) {
                arg0.field2550 += 2;
            }
            if (arg0.field2550 == var7.field2488.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2553.method2015(arg0.field2554, this.method3496(arg0), this.method3497(arg0));
            return false;
        }
        arg0.field2553.method1989(arg0.field2554);
        if (arg1 == null) {
            arg0.field2553.method1757(arg3);
        } else {
            arg0.field2553.method1762(arg1, arg2, arg3);
        }
        if (arg0.field2553.method1993()) {
            this.field2524.field2584.method1781(arg0.field2553);
        }
        arg0.method3585();
        if (arg0.field2542 >= 0) {
            arg0.method3364();
            if (arg0.field2552 > 0 && this.field2526[arg0.field2545][arg0.field2552] == arg0) {
                this.field2526[arg0.field2545][arg0.field2552] = null;
            }
        }
        return true;
    }
}
