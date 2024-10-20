package deob;

@ObfuscatedName("ge")
public class class205 extends class120 {

    @ObfuscatedName("ge.i")
    public class191 field2532 = new class191(128);

    @ObfuscatedName("ge.c")
    public int field2536 = 256;

    @ObfuscatedName("ge.e")
    public int field2519 = 1000000;

    @ObfuscatedName("ge.v")
    public int[] field2520 = new int[16];

    @ObfuscatedName("ge.b")
    public int[] field2535 = new int[16];

    @ObfuscatedName("ge.y")
    public int[] field2522 = new int[16];

    @ObfuscatedName("ge.h")
    public int[] field2523 = new int[16];

    @ObfuscatedName("ge.x")
    public int[] field2524 = new int[16];

    @ObfuscatedName("ge.f")
    public int[] field2525 = new int[16];

    @ObfuscatedName("ge.n")
    public int[] field2526 = new int[16];

    @ObfuscatedName("ge.a")
    public int[] field2518 = new int[16];

    @ObfuscatedName("ge.o")
    public int[] field2528 = new int[16];

    @ObfuscatedName("ge.s")
    public int[] field2530 = new int[16];

    @ObfuscatedName("ge.g")
    public int[] field2527 = new int[16];

    @ObfuscatedName("ge.w")
    public int[] field2531 = new int[16];

    @ObfuscatedName("ge.p")
    public int[] field2533 = new int[16];

    @ObfuscatedName("ge.l")
    public int[] field2534 = new int[16];

    @ObfuscatedName("ge.u")
    public int[] field2543 = new int[16];

    @ObfuscatedName("ge.t")
    public class206[][] field2540 = new class206[16][128];

    @ObfuscatedName("ge.ad")
    public class206[][] field2537 = new class206[16][128];

    @ObfuscatedName("ge.ar")
    public class207 field2538 = new class207();

    @ObfuscatedName("ge.an")
    public boolean field2539;

    @ObfuscatedName("ge.af")
    public int field2542;

    @ObfuscatedName("ge.at")
    public int field2541;

    @ObfuscatedName("ge.ah")
    public long field2521;

    @ObfuscatedName("ge.ai")
    public long field2545;

    @ObfuscatedName("ge.aw")
    public class209 field2544 = new class209(this);

    public class205() {
        this.method3474();
    }

    @ObfuscatedName("ge.i(IB)V")
    public synchronized void method3386(int arg0) {
        this.field2536 = arg0;
    }

    @ObfuscatedName("ge.c(I)I")
    public int method3387() {
        return this.field2536;
    }

    @ObfuscatedName("ge.e(Lhj;Liw;Ldl;II)Z")
    public synchronized boolean method3388(class210 arg0, class236 arg1, class113 arg2, int arg3) {
        arg0.method3571();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class200 var7 = (class200) arg0.field2599.method3236(); var7 != null; var7 = (class200) arg0.field2599.method3242()) {
            int var8 = (int) var7.field2480;
            class208 var9 = (class208) this.field2532.method3238((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method3775(var8);
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
                this.field2532.method3234(var11, (long) var8);
            }
            if (!var9.method3546(arg2, var7.field2496, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3563();
        }
        return var5;
    }

    @ObfuscatedName("ge.v(I)V")
    public synchronized void method3417() {
        for (class208 var1 = (class208) this.field2532.method3236(); var1 != null; var1 = (class208) this.field2532.method3242()) {
            var1.method3547();
        }
    }

    @ObfuscatedName("ge.b(I)V")
    public synchronized void method3390() {
        for (class208 var1 = (class208) this.field2532.method3236(); var1 != null; var1 = (class208) this.field2532.method3242()) {
            var1.method3278();
        }
    }

    @ObfuscatedName("ge.n(Lhj;ZI)V")
    public synchronized void method3391(class210 arg0, boolean arg1) {
        this.method3392();
        this.field2538.method3489(arg0.field2600);
        this.field2539 = arg1;
        this.field2521 = 0L;
        int var3 = this.field2538.method3490();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2538.method3528(var4);
            this.field2538.method3494(var4);
            this.field2538.method3511(var4);
        }
        this.field2542 = this.field2538.method3499();
        this.field2541 = this.field2538.field2570[this.field2542];
        this.field2545 = this.field2538.method3498(this.field2541);
    }

    @ObfuscatedName("ge.o(B)V")
    public synchronized void method3392() {
        this.field2538.method3529();
        this.method3474();
    }

    @ObfuscatedName("ge.z(I)Z")
    public synchronized boolean method3405() {
        return this.field2538.method3532();
    }

    @ObfuscatedName("ge.q(IIB)V")
    public synchronized void method3393(int arg0, int arg1) {
        this.method3394(arg0, arg1);
    }

    @ObfuscatedName("ge.j(III)V")
    public void method3394(int arg0, int arg1) {
        this.field2523[arg0] = arg1;
        this.field2525[arg0] = arg1 & 0xFFFFFF80;
        this.method3395(arg0, arg1);
    }

    @ObfuscatedName("ge.l(III)V")
    public void method3395(int arg0, int arg1) {
        if (this.field2524[arg0] != arg1) {
            this.field2524[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2537[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("ge.u(IIII)V")
    public void method3396(int arg0, int arg1, int arg2) {
        this.method3398(arg0, arg1, 64);
        if ((this.field2530[arg0] & 0x2) != 0) {
            for (class206 var4 = (class206) this.field2544.field2595.method3292(); var4 != null; var4 = (class206) this.field2544.field2595.method3300()) {
                if (var4.field2561 == arg0 && var4.field2560 < 0) {
                    this.field2540[arg0][var4.field2562] = null;
                    this.field2540[arg0][arg1] = var4;
                    int var5 = (var4.field2556 * var4.field2549 >> 12) + var4.field2555;
                    var4.field2555 += arg1 - var4.field2562 << 8;
                    var4.field2549 = var5 - var4.field2555;
                    var4.field2556 = 4096;
                    var4.field2562 = arg1;
                    return;
                }
            }
        }
        class208 var6 = (class208) this.field2532.method3238((long) this.field2524[arg0]);
        if (var6 == null) {
            return;
        }
        class108 var7 = var6.field2583[arg1];
        if (var7 == null) {
            return;
        }
        class206 var8 = new class206();
        var8.field2561 = arg0;
        var8.field2563 = var6;
        var8.field2548 = var7;
        var8.field2547 = var6.field2586[arg1];
        var8.field2550 = var6.field2592[arg1];
        var8.field2562 = arg1;
        var8.field2552 = var6.field2591 * arg2 * arg2 * var6.field2585[arg1] + 1024 >> 11;
        var8.field2553 = var6.field2587[arg1] & 0xFF;
        var8.field2555 = (arg1 << 8) - (var6.field2584[arg1] & 0x7FFF);
        var8.field2546 = 0;
        var8.field2558 = 0;
        var8.field2559 = 0;
        var8.field2560 = -1;
        var8.field2557 = 0;
        if (this.field2533[arg0] == 0) {
            var8.field2564 = class118.method1939(var7, this.method3408(var8), this.method3409(var8), this.method3410(var8));
        } else {
            var8.field2564 = class118.method1939(var7, this.method3408(var8), 0, this.method3410(var8));
            this.method3397(var8, var6.field2584[arg1] < 0);
        }
        if (var6.field2584[arg1] < 0) {
            var8.field2564.method2034(-1);
        }
        if (var8.field2550 >= 0) {
            class206 var9 = this.field2537[arg0][var8.field2550];
            if (var9 != null && var9.field2560 < 0) {
                this.field2540[arg0][var9.field2562] = null;
                var9.field2560 = 0;
            }
            this.field2537[arg0][var8.field2550] = var8;
        }
        this.field2544.field2595.method3289(var8);
        this.field2540[arg0][arg1] = var8;
    }

    @ObfuscatedName("ge.t(Lgp;ZI)V")
    public void method3397(class206 arg0, boolean arg1) {
        int var3 = arg0.field2548.field1621.length;
        int var5;
        if (arg1 && arg0.field2548.field1625) {
            int var4 = var3 + var3 - arg0.field2548.field1622;
            var5 = (int) ((long) this.field2533[arg0.field2561] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2564.method2008(true);
            }
        } else {
            var5 = (int) ((long) this.field2533[arg0.field2561] * (long) var3 >> 6);
        }
        arg0.field2564.method1947(var5);
    }

    @ObfuscatedName("ge.ad(IIII)V")
    public void method3398(int arg0, int arg1, int arg2) {
        class206 var4 = this.field2540[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2540[arg0][arg1] = null;
        if ((this.field2530[arg0] & 0x2) == 0) {
            var4.field2560 = 0;
            return;
        }
        for (class206 var5 = (class206) this.field2544.field2595.method3294(); var5 != null; var5 = (class206) this.field2544.field2595.method3296()) {
            if (var4.field2561 == var5.field2561 && var5.field2560 < 0 && var4 != var5) {
                var4.field2560 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("ge.ar(IIIB)V")
    public void method3422(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("ge.an(III)V")
    public void method3473(int arg0, int arg1) {
    }

    @ObfuscatedName("ge.ac(IIB)V")
    public void method3400(int arg0, int arg1) {
        this.field2526[arg0] = arg1;
    }

    @ObfuscatedName("ge.ak(II)V")
    public void method3412(int arg0) {
        for (class206 var2 = (class206) this.field2544.field2595.method3294(); var2 != null; var2 = (class206) this.field2544.field2595.method3296()) {
            if (arg0 < 0 || var2.field2561 == arg0) {
                if (var2.field2564 != null) {
                    var2.field2564.method2046(Statics.field1641 / 100);
                    if (var2.field2564.method1990()) {
                        this.field2544.field2597.method1740(var2.field2564);
                    }
                    var2.method3478();
                }
                if (var2.field2560 < 0) {
                    this.field2540[var2.field2561][var2.field2562] = null;
                }
                var2.method3278();
            }
        }
    }

    @ObfuscatedName("ge.ao(IB)V")
    public void method3402(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3402(var2);
            }
            return;
        }
        this.field2520[arg0] = 12800;
        this.field2535[arg0] = 8192;
        this.field2522[arg0] = 16383;
        this.field2526[arg0] = 8192;
        this.field2518[arg0] = 0;
        this.field2528[arg0] = 8192;
        this.method3389(arg0);
        this.method3406(arg0);
        this.field2530[arg0] = 0;
        this.field2527[arg0] = 32767;
        this.field2531[arg0] = 256;
        this.field2533[arg0] = 0;
        this.method3407(arg0, 8192);
    }

    @ObfuscatedName("ge.am(II)V")
    public void method3403(int arg0) {
        for (class206 var2 = (class206) this.field2544.field2595.method3294(); var2 != null; var2 = (class206) this.field2544.field2595.method3296()) {
            if ((arg0 < 0 || var2.field2561 == arg0) && var2.field2560 < 0) {
                this.field2540[var2.field2561][var2.field2562] = null;
                var2.field2560 = 0;
            }
        }
    }

    @ObfuscatedName("ge.bs(I)V")
    public void method3474() {
        this.method3412(-1);
        this.method3402(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2524[var1] = this.field2523[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2525[var2] = this.field2523[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("ge.bu(IB)V")
    public void method3389(int arg0) {
        if ((this.field2530[arg0] & 0x2) == 0) {
            return;
        }
        for (class206 var2 = (class206) this.field2544.field2595.method3294(); var2 != null; var2 = (class206) this.field2544.field2595.method3296()) {
            if (var2.field2561 == arg0 && this.field2540[arg0][var2.field2562] == null && var2.field2560 < 0) {
                var2.field2560 = 0;
            }
        }
    }

    @ObfuscatedName("ge.bo(IB)V")
    public void method3406(int arg0) {
        if ((this.field2530[arg0] & 0x4) == 0) {
            return;
        }
        for (class206 var2 = (class206) this.field2544.field2595.method3294(); var2 != null; var2 = (class206) this.field2544.field2595.method3296()) {
            if (var2.field2561 == arg0) {
                var2.field2566 = 0;
            }
        }
    }

    @ObfuscatedName("ge.bj(IB)V")
    public void method3416(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3398(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3396(var6, var7, var8);
            } else {
                this.method3398(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3422(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2525[var12] = (var14 << 14) + (this.field2525[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2525[var12] = (var14 << 7) + (this.field2525[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2518[var12] = (var14 << 7) + (this.field2518[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2518[var12] = (this.field2518[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2528[var12] = (var14 << 7) + (this.field2528[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2528[var12] = (this.field2528[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2520[var12] = (var14 << 7) + (this.field2520[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2520[var12] = (this.field2520[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2535[var12] = (var14 << 7) + (this.field2535[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2535[var12] = (this.field2535[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2522[var12] = (var14 << 7) + (this.field2522[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2522[var12] = (this.field2522[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2530[var12] |= 0x1;
                } else {
                    this.field2530[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2530[var12] |= 0x2;
                } else {
                    this.method3389(var12);
                    this.field2530[var12] &= 0xFFFFFFFD;
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
                this.method3412(var12);
            }
            if (var13 == 121) {
                this.method3402(var12);
            }
            if (var13 == 123) {
                this.method3403(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2527[var12];
                if (var15 == 16384) {
                    this.field2531[var12] = (var14 << 7) + (this.field2531[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2527[var12];
                if (var16 == 16384) {
                    this.field2531[var12] = (this.field2531[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2533[var12] = (var14 << 7) + (this.field2533[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2533[var12] = (this.field2533[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2530[var12] |= 0x4;
                } else {
                    this.method3406(var12);
                    this.field2530[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3407(var12, (var14 << 7) + (this.field2534[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3407(var12, (this.field2534[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3395(var17, this.field2525[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3473(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method3400(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3474();
            }
        }
    }

    @ObfuscatedName("ge.bh(III)V")
    public void method3407(int arg0, int arg1) {
        this.field2534[arg0] = arg1;
        this.field2543[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("ge.bf(Lgp;I)I")
    public int method3408(class206 arg0) {
        int var2 = (arg0.field2556 * arg0.field2549 >> 12) + arg0.field2555;
        int var3 = ((this.field2526[arg0.field2561] - 8192) * this.field2531[arg0.field2561] >> 12) + var2;
        class203 var4 = arg0.field2547;
        if (var4.field2508 > 0 && (var4.field2504 > 0 || this.field2518[arg0.field2561] > 0)) {
            int var5 = var4.field2504 << 2;
            int var6 = var4.field2509 << 1;
            if (arg0.field2551 < var6) {
                var5 = arg0.field2551 * var5 / var6;
            }
            int var7 = (this.field2518[arg0.field2561] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2554 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2548.field1623 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1641 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("ge.bg(Lgp;I)I")
    public int method3409(class206 arg0) {
        class203 var2 = arg0.field2547;
        int var3 = this.field2522[arg0.field2561] * this.field2520[arg0.field2561] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2552 * var4 + 16384 >> 15;
        int var6 = this.field2536 * var5 + 128 >> 8;
        if (var2.field2503 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2546 * 1.953125E-5D * (double) var2.field2503) + 0.5D);
        }
        if (var2.field2501 != null) {
            int var7 = arg0.field2558;
            int var8 = var2.field2501[arg0.field2559 + 1];
            if (arg0.field2559 < var2.field2501.length - 2) {
                int var9 = (var2.field2501[arg0.field2559] & 0xFF) << 8;
                int var10 = (var2.field2501[arg0.field2559 + 2] & 0xFF) << 8;
                var8 += (var2.field2501[arg0.field2559 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2560 > 0 && var2.field2506 != null) {
            int var11 = arg0.field2560;
            int var12 = var2.field2506[arg0.field2557 + 1];
            if (arg0.field2557 < var2.field2506.length - 2) {
                int var13 = (var2.field2506[arg0.field2557] & 0xFF) << 8;
                int var14 = (var2.field2506[arg0.field2557 + 2] & 0xFF) << 8;
                var12 += (var2.field2506[arg0.field2557 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("ge.bl(Lgp;I)I")
    public int method3410(class206 arg0) {
        int var2 = this.field2535[arg0.field2561];
        return var2 < 8192 ? arg0.field2553 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2553) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("ge.y()Ldy;")
    public synchronized class120 method1731() {
        return this.field2544;
    }

    @ObfuscatedName("ge.h()Ldy;")
    public synchronized class120 method1733() {
        return null;
    }

    @ObfuscatedName("ge.x()I")
    public synchronized int method1730() {
        return 0;
    }

    @ObfuscatedName("ge.f([III)V")
    public synchronized void method1734(int[] arg0, int arg1, int arg2) {
        if (this.field2538.method3532()) {
            int var4 = this.field2519 * this.field2538.field2579 / Statics.field1641;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2521;
                if (this.field2545 - var5 >= 0L) {
                    this.field2521 = var5;
                    break;
                }
                int var7 = (int) ((this.field2545 - this.field2521 + (long) var4 - 1L) / (long) var4);
                this.field2521 += (long) var4 * (long) var7;
                this.field2544.method1734(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3465();
            } while (this.field2538.method3532());
        }
        this.field2544.method1734(arg0, arg1, arg2);
    }

    @ObfuscatedName("ge.a(I)V")
    public synchronized void method1725(int arg0) {
        if (this.field2538.method3532()) {
            int var2 = this.field2519 * this.field2538.field2579 / Statics.field1641;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2521;
                if (this.field2545 - var3 >= 0L) {
                    this.field2521 = var3;
                    break;
                }
                int var5 = (int) ((this.field2545 - this.field2521 + (long) var2 - 1L) / (long) var2);
                this.field2521 += (long) var2 * (long) var5;
                this.field2544.method1725(var5);
                arg0 -= var5;
                this.method3465();
            } while (this.field2538.method3532());
        }
        this.field2544.method1725(arg0);
    }

    @ObfuscatedName("ge.bz(B)V")
    public void method3465() {
        int var1 = this.field2542;
        int var2 = this.field2541;
        long var3 = this.field2545;
        while (this.field2541 == var2) {
            while (this.field2538.field2570[var1] == var2) {
                this.field2538.method3528(var1);
                int var5 = this.field2538.method3495(var1);
                if (var5 == 1) {
                    this.field2538.method3493();
                    this.field2538.method3511(var1);
                    if (this.field2538.method3500()) {
                        if (!this.field2539 || var2 == 0) {
                            this.method3474();
                            this.field2538.method3529();
                            return;
                        }
                        this.field2538.method3518(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3416(var5);
                }
                this.field2538.method3494(var1);
                this.field2538.method3511(var1);
            }
            var1 = this.field2538.method3499();
            var2 = this.field2538.field2570[var1];
            var3 = this.field2538.method3498(var2);
        }
        this.field2542 = var1;
        this.field2541 = var2;
        this.field2545 = var3;
    }

    @ObfuscatedName("ge.bq(Lgp;I)Z")
    public boolean method3414(class206 arg0) {
        if (arg0.field2564 != null) {
            return false;
        }
        if (arg0.field2560 >= 0) {
            arg0.method3278();
            if (arg0.field2550 > 0 && this.field2537[arg0.field2561][arg0.field2550] == arg0) {
                this.field2537[arg0.field2561][arg0.field2550] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("ge.bt(Lgp;[IIII)Z")
    public boolean method3415(class206 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2565 = Statics.field1641 / 100;
        if (arg0.field2560 >= 0 && arg0.field2564 == null || arg0.field2564.method2049()) {
            arg0.method3478();
            arg0.method3278();
            if (arg0.field2550 > 0 && this.field2537[arg0.field2561][arg0.field2550] == arg0) {
                this.field2537[arg0.field2561][arg0.field2550] = null;
            }
            return true;
        }
        int var5 = arg0.field2556;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2528[arg0.field2561] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2556 = var6;
        }
        arg0.field2564.method1952(this.method3408(arg0));
        class203 var7 = arg0.field2547;
        boolean var8 = false;
        arg0.field2551++;
        arg0.field2554 += var7.field2508;
        double var9 = (double) ((arg0.field2562 - 60 << 8) + (arg0.field2556 * arg0.field2549 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2503 > 0) {
            if (var7.field2507 > 0) {
                arg0.field2546 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2507 * var9) + 0.5D);
            } else {
                arg0.field2546 += 128;
            }
        }
        if (var7.field2501 != null) {
            if (var7.field2502 > 0) {
                arg0.field2558 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2502 * var9) + 0.5D);
            } else {
                arg0.field2558 += 128;
            }
            while (arg0.field2559 < var7.field2501.length - 2 && arg0.field2558 > (var7.field2501[arg0.field2559 + 2] & 0xFF) << 8) {
                arg0.field2559 += 2;
            }
            if (arg0.field2559 == var7.field2501.length - 2 && var7.field2501[arg0.field2559 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2560 >= 0 && var7.field2506 != null && (this.field2530[arg0.field2561] & 0x1) == 0 && (arg0.field2550 < 0 || this.field2537[arg0.field2561][arg0.field2550] != arg0)) {
            if (var7.field2505 > 0) {
                arg0.field2560 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2505 * var9) + 0.5D);
            } else {
                arg0.field2560 += 128;
            }
            while (arg0.field2557 < var7.field2506.length - 2 && arg0.field2560 > (var7.field2506[arg0.field2557 + 2] & 0xFF) << 8) {
                arg0.field2557 += 2;
            }
            if (arg0.field2557 == var7.field2506.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2564.method1950(arg0.field2565, this.method3409(arg0), this.method3410(arg0));
            return false;
        }
        arg0.field2564.method2046(arg0.field2565);
        if (arg1 == null) {
            arg0.field2564.method1725(arg3);
        } else {
            arg0.field2564.method1734(arg1, arg2, arg3);
        }
        if (arg0.field2564.method1990()) {
            this.field2544.field2597.method1740(arg0.field2564);
        }
        arg0.method3478();
        if (arg0.field2560 >= 0) {
            arg0.method3278();
            if (arg0.field2550 > 0 && this.field2537[arg0.field2561][arg0.field2550] == arg0) {
                this.field2537[arg0.field2561][arg0.field2550] = null;
            }
        }
        return true;
    }
}
