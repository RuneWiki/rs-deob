package deob;

@ObfuscatedName("hz")
public class class221 extends class108 {

    @ObfuscatedName("hz.y")
    public class205 field2518 = new class205(128);

    @ObfuscatedName("hz.c")
    public int field2516 = 256;

    @ObfuscatedName("hz.n")
    public int field2539 = 1000000;

    @ObfuscatedName("hz.u")
    public int[] field2524 = new int[16];

    @ObfuscatedName("hz.i")
    public int[] field2517 = new int[16];

    @ObfuscatedName("hz.r")
    public int[] field2520 = new int[16];

    @ObfuscatedName("hz.j")
    public int[] field2519 = new int[16];

    @ObfuscatedName("hz.p")
    public int[] field2537 = new int[16];

    @ObfuscatedName("hz.e")
    public int[] field2523 = new int[16];

    @ObfuscatedName("hz.s")
    public int[] field2531 = new int[16];

    @ObfuscatedName("hz.v")
    public int[] field2525 = new int[16];

    @ObfuscatedName("hz.k")
    public int[] field2526 = new int[16];

    @ObfuscatedName("hz.b")
    public int[] field2527 = new int[16];

    @ObfuscatedName("hz.w")
    public int[] field2522 = new int[16];

    @ObfuscatedName("hz.g")
    public int[] field2529 = new int[16];

    @ObfuscatedName("hz.d")
    public int[] field2530 = new int[16];

    @ObfuscatedName("hz.m")
    public int[] field2515 = new int[16];

    @ObfuscatedName("hz.t")
    public int[] field2532 = new int[16];

    @ObfuscatedName("hz.h")
    public class222[][] field2533 = new class222[16][128];

    @ObfuscatedName("hz.an")
    public class222[][] field2534 = new class222[16][128];

    @ObfuscatedName("hz.al")
    public class223 field2535 = new class223();

    @ObfuscatedName("hz.ah")
    public boolean field2536;

    @ObfuscatedName("hz.ad")
    public int field2528;

    @ObfuscatedName("hz.aa")
    public int field2538;

    @ObfuscatedName("hz.ag")
    public long field2540;

    @ObfuscatedName("hz.av")
    public long field2521;

    @ObfuscatedName("hz.am")
    public class225 field2541 = new class225(this);

    public class221() {
        this.method3902();
    }

    @ObfuscatedName("hz.y(IB)V")
    public synchronized void method3976(int arg0) {
        this.field2516 = arg0;
    }

    @ObfuscatedName("hz.c(I)I")
    public int method3930() {
        return this.field2516;
    }

    @ObfuscatedName("hz.n(Lha;Liu;Lck;II)Z")
    public synchronized boolean method3886(class226 arg0, class250 arg1, class101 arg2, int arg3) {
        arg0.method4052();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class216 var7 = (class216) arg0.field2592.method3720(); var7 != null; var7 = (class216) arg0.field2592.method3717()) {
            int var8 = (int) var7.field2470;
            class224 var9 = (class224) this.field2518.method3734((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method4326(var8);
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
                this.field2518.method3718(var11, (long) var8);
            }
            if (!var9.method4039(arg2, var7.field2489, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method4050();
        }
        return var5;
    }

    @ObfuscatedName("hz.u(I)V")
    public synchronized void method3885() {
        for (class224 var1 = (class224) this.field2518.method3720(); var1 != null; var1 = (class224) this.field2518.method3717()) {
            var1.method4038();
        }
    }

    @ObfuscatedName("hz.i(I)V")
    public synchronized void method3898() {
        for (class224 var1 = (class224) this.field2518.method3720(); var1 != null; var1 = (class224) this.field2518.method3717()) {
            var1.method3766();
        }
    }

    @ObfuscatedName("hz.k(Lha;ZB)V")
    public synchronized void method3920(class226 arg0, boolean arg1) {
        this.method3901();
        this.field2535.method3992(arg0.field2591);
        this.field2536 = arg1;
        this.field2540 = 0L;
        int var3 = this.field2535.method4027();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2535.method4013(var4);
            this.field2535.method3998(var4);
            this.field2535.method4033(var4);
        }
        this.field2528 = this.field2535.method4000();
        this.field2538 = this.field2535.field2568[this.field2528];
        this.field2521 = this.field2535.method4002(this.field2538);
    }

    @ObfuscatedName("hz.q(I)V")
    public synchronized void method3901() {
        this.field2535.method3993();
        this.method3902();
    }

    @ObfuscatedName("hz.l(I)Z")
    public synchronized boolean method3889() {
        return this.field2535.method4006();
    }

    @ObfuscatedName("hz.f(IIB)V")
    public synchronized void method3907(int arg0, int arg1) {
        this.method3891(arg0, arg1);
    }

    @ObfuscatedName("hz.z(III)V")
    public void method3891(int arg0, int arg1) {
        this.field2519[arg0] = arg1;
        this.field2523[arg0] = arg1 & 0xFFFFFF80;
        this.method3892(arg0, arg1);
    }

    @ObfuscatedName("hz.a(IIB)V")
    public void method3892(int arg0, int arg1) {
        if (this.field2537[arg0] != arg1) {
            this.field2537[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2534[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("hz.x(IIII)V")
    public void method3888(int arg0, int arg1, int arg2) {
        this.method3895(arg0, arg1, 64);
        if ((this.field2527[arg0] & 0x2) != 0) {
            for (class222 var4 = (class222) this.field2541.field2588.method3788(); var4 != null; var4 = (class222) this.field2541.field2588.method3781()) {
                if (var4.field2545 == arg0 && var4.field2549 < 0) {
                    this.field2533[arg0][var4.field2547] = null;
                    this.field2533[arg0][arg1] = var4;
                    int var5 = (var4.field2555 * var4.field2551 >> 12) + var4.field2542;
                    var4.field2542 += arg1 - var4.field2547 << 8;
                    var4.field2551 = var5 - var4.field2542;
                    var4.field2555 = 4096;
                    var4.field2547 = arg1;
                    return;
                }
            }
        }
        class224 var6 = (class224) this.field2518.method3734((long) this.field2537[arg0]);
        if (var6 == null) {
            return;
        }
        class96 var7 = var6.field2579[arg1];
        if (var7 == null) {
            return;
        }
        class222 var8 = new class222();
        var8.field2545 = arg0;
        var8.field2543 = var6;
        var8.field2544 = var7;
        var8.field2556 = var6.field2583[arg1];
        var8.field2546 = var6.field2584[arg1];
        var8.field2547 = arg1;
        var8.field2548 = var6.field2585 * arg2 * arg2 * var6.field2581[arg1] + 1024 >> 11;
        var8.field2562 = var6.field2578[arg1] & 0xFF;
        var8.field2542 = (arg1 << 8) - (var6.field2580[arg1] & 0x7FFF);
        var8.field2553 = 0;
        var8.field2554 = 0;
        var8.field2552 = 0;
        var8.field2549 = -1;
        var8.field2557 = 0;
        if (this.field2530[arg0] == 0) {
            var8.field2560 = class106.method2127(var7, this.method3953(var8), this.method3908(var8), this.method3882(var8));
        } else {
            var8.field2560 = class106.method2127(var7, this.method3953(var8), 0, this.method3882(var8));
            this.method3887(var8, var6.field2580[arg1] < 0);
        }
        if (var6.field2580[arg1] < 0) {
            var8.field2560.method2129(-1);
        }
        if (var8.field2546 >= 0) {
            class222 var9 = this.field2534[arg0][var8.field2546];
            if (var9 != null && var9.field2549 < 0) {
                this.field2533[arg0][var9.field2547] = null;
                var9.field2549 = 0;
            }
            this.field2534[arg0][var8.field2546] = var8;
        }
        this.field2541.field2588.method3773(var8);
        this.field2533[arg0][arg1] = var8;
    }

    @ObfuscatedName("hz.b(Lhu;ZB)V")
    public void method3887(class222 arg0, boolean arg1) {
        int var3 = arg0.field2544.field1334.length;
        int var5;
        if (arg1 && arg0.field2544.field1332) {
            int var4 = var3 + var3 - arg0.field2544.field1336;
            var5 = (int) ((long) this.field2530[arg0.field2545] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2560.method2136(true);
            }
        } else {
            var5 = (int) ((long) this.field2530[arg0.field2545] * (long) var3 >> 6);
        }
        arg0.field2560.method2135(var5);
    }

    @ObfuscatedName("hz.w(IIII)V")
    public void method3895(int arg0, int arg1, int arg2) {
        class222 var4 = this.field2533[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2533[arg0][arg1] = null;
        if ((this.field2527[arg0] & 0x2) == 0) {
            var4.field2549 = 0;
            return;
        }
        for (class222 var5 = (class222) this.field2541.field2588.method3799(); var5 != null; var5 = (class222) this.field2541.field2588.method3780()) {
            if (var4.field2545 == var5.field2545 && var5.field2549 < 0 && var4 != var5) {
                var4.field2549 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("hz.g(IIII)V")
    public void method3896(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("hz.d(III)V")
    public void method3897(int arg0, int arg1) {
    }

    @ObfuscatedName("hz.am(III)V")
    public void method3964(int arg0, int arg1) {
        this.field2531[arg0] = arg1;
    }

    @ObfuscatedName("hz.ap(IB)V")
    public void method3956(int arg0) {
        for (class222 var2 = (class222) this.field2541.field2588.method3799(); var2 != null; var2 = (class222) this.field2541.field2588.method3780()) {
            if (arg0 < 0 || var2.field2545 == arg0) {
                if (var2.field2560 != null) {
                    var2.field2560.method2140(Statics.field56 / 100);
                    if (var2.field2560.method2172()) {
                        this.field2541.field2590.method1923(var2.field2560);
                    }
                    var2.method3988();
                }
                if (var2.field2549 < 0) {
                    this.field2533[var2.field2545][var2.field2547] = null;
                }
                var2.method3766();
            }
        }
    }

    @ObfuscatedName("hz.ai(II)V")
    public void method3900(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3900(var2);
            }
            return;
        }
        this.field2524[arg0] = 12800;
        this.field2517[arg0] = 8192;
        this.field2520[arg0] = 16383;
        this.field2531[arg0] = 8192;
        this.field2525[arg0] = 0;
        this.field2526[arg0] = 8192;
        this.method3903(arg0);
        this.method3936(arg0);
        this.field2527[arg0] = 0;
        this.field2522[arg0] = 32767;
        this.field2529[arg0] = 256;
        this.field2530[arg0] = 0;
        this.method3954(arg0, 8192);
    }

    @ObfuscatedName("hz.ab(IB)V")
    public void method3910(int arg0) {
        for (class222 var2 = (class222) this.field2541.field2588.method3799(); var2 != null; var2 = (class222) this.field2541.field2588.method3780()) {
            if ((arg0 < 0 || var2.field2545 == arg0) && var2.field2549 < 0) {
                this.field2533[var2.field2545][var2.field2547] = null;
                var2.field2549 = 0;
            }
        }
    }

    @ObfuscatedName("hz.az(B)V")
    public void method3902() {
        this.method3956(-1);
        this.method3900(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2537[var1] = this.field2519[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2523[var2] = this.field2519[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("hz.ay(II)V")
    public void method3903(int arg0) {
        if ((this.field2527[arg0] & 0x2) == 0) {
            return;
        }
        for (class222 var2 = (class222) this.field2541.field2588.method3799(); var2 != null; var2 = (class222) this.field2541.field2588.method3780()) {
            if (var2.field2545 == arg0 && this.field2533[arg0][var2.field2547] == null && var2.field2549 < 0) {
                var2.field2549 = 0;
            }
        }
    }

    @ObfuscatedName("hz.ao(II)V")
    public void method3936(int arg0) {
        if ((this.field2527[arg0] & 0x4) == 0) {
            return;
        }
        for (class222 var2 = (class222) this.field2541.field2588.method3799(); var2 != null; var2 = (class222) this.field2541.field2588.method3780()) {
            if (var2.field2545 == arg0) {
                var2.field2550 = 0;
            }
        }
    }

    @ObfuscatedName("hz.ak(IB)V")
    public void method3905(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3895(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3888(var6, var7, var8);
            } else {
                this.method3895(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3896(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2523[var12] = (var14 << 14) + (this.field2523[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2523[var12] = (var14 << 7) + (this.field2523[var12] & 0xFFFFC07F);
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
                this.field2524[var12] = (var14 << 7) + (this.field2524[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2524[var12] = (this.field2524[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2517[var12] = (var14 << 7) + (this.field2517[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2517[var12] = (this.field2517[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2520[var12] = (var14 << 7) + (this.field2520[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2520[var12] = (this.field2520[var12] & 0xFFFFFF80) + var14;
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
                    this.method3903(var12);
                    this.field2527[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2522[var12] = (var14 << 7) + (this.field2522[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2522[var12] = (this.field2522[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2522[var12] = (var14 << 7) + (this.field2522[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2522[var12] = (this.field2522[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3956(var12);
            }
            if (var13 == 121) {
                this.method3900(var12);
            }
            if (var13 == 123) {
                this.method3910(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2522[var12];
                if (var15 == 16384) {
                    this.field2529[var12] = (var14 << 7) + (this.field2529[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2522[var12];
                if (var16 == 16384) {
                    this.field2529[var12] = (this.field2529[var12] & 0xFFFFFF80) + var14;
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
                    this.method3936(var12);
                    this.field2527[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3954(var12, (var14 << 7) + (this.field2515[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3954(var12, (this.field2515[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3892(var17, this.field2523[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3897(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method3964(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3902();
            }
        }
    }

    @ObfuscatedName("hz.af(IIB)V")
    public void method3954(int arg0, int arg1) {
        this.field2515[arg0] = arg1;
        this.field2532[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("hz.ax(Lhu;I)I")
    public int method3953(class222 arg0) {
        int var2 = (arg0.field2555 * arg0.field2551 >> 12) + arg0.field2542;
        int var3 = ((this.field2531[arg0.field2545] - 8192) * this.field2529[arg0.field2545] >> 12) + var2;
        class219 var4 = arg0.field2556;
        if (var4.field2502 > 0 && (var4.field2501 > 0 || this.field2525[arg0.field2545] > 0)) {
            int var5 = var4.field2501 << 2;
            int var6 = var4.field2503 << 1;
            if (arg0.field2558 < var6) {
                var5 = arg0.field2558 * var5 / var6;
            }
            int var7 = (this.field2525[arg0.field2545] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2559 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2544.field1333 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field56 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("hz.ar(Lhu;I)I")
    public int method3908(class222 arg0) {
        class219 var2 = arg0.field2556;
        int var3 = this.field2520[arg0.field2545] * this.field2524[arg0.field2545] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2548 * var4 + 16384 >> 15;
        int var6 = this.field2516 * var5 + 128 >> 8;
        if (var2.field2497 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2553 * 1.953125E-5D * (double) var2.field2497) + 0.5D);
        }
        if (var2.field2495 != null) {
            int var7 = arg0.field2554;
            int var8 = var2.field2495[arg0.field2552 + 1];
            if (arg0.field2552 < var2.field2495.length - 2) {
                int var9 = (var2.field2495[arg0.field2552] & 0xFF) << 8;
                int var10 = (var2.field2495[arg0.field2552 + 2] & 0xFF) << 8;
                var8 += (var2.field2495[arg0.field2552 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2549 > 0 && var2.field2504 != null) {
            int var11 = arg0.field2549;
            int var12 = var2.field2504[arg0.field2557 + 1];
            if (arg0.field2557 < var2.field2504.length - 2) {
                int var13 = (var2.field2504[arg0.field2557] & 0xFF) << 8;
                int var14 = (var2.field2504[arg0.field2557 + 2] & 0xFF) << 8;
                var12 += (var2.field2504[arg0.field2557 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("hz.at(Lhu;B)I")
    public int method3882(class222 arg0) {
        int var2 = this.field2517[arg0.field2545];
        return var2 < 8192 ? arg0.field2562 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2562) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("hz.p()Ldt;")
    public synchronized class108 method1928() {
        return this.field2541;
    }

    @ObfuscatedName("hz.e()Ldt;")
    public synchronized class108 method1929() {
        return null;
    }

    @ObfuscatedName("hz.s()I")
    public synchronized int method1936() {
        return 0;
    }

    @ObfuscatedName("hz.v([III)V")
    public synchronized void method1931(int[] arg0, int arg1, int arg2) {
        if (this.field2535.method4006()) {
            int var4 = this.field2539 * this.field2535.field2577 / Statics.field56;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2540;
                if (this.field2521 - var5 >= 0L) {
                    this.field2540 = var5;
                    break;
                }
                int var7 = (int) ((this.field2521 - this.field2540 + (long) var4 - 1L) / (long) var4);
                this.field2540 += (long) var4 * (long) var7;
                this.field2541.method1931(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3911();
            } while (this.field2535.method4006());
        }
        this.field2541.method1931(arg0, arg1, arg2);
    }

    @ObfuscatedName("hz.o(I)V")
    public synchronized void method1958(int arg0) {
        if (this.field2535.method4006()) {
            int var2 = this.field2539 * this.field2535.field2577 / Statics.field56;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2540;
                if (this.field2521 - var3 >= 0L) {
                    this.field2540 = var3;
                    break;
                }
                int var5 = (int) ((this.field2521 - this.field2540 + (long) var2 - 1L) / (long) var2);
                this.field2540 += (long) var2 * (long) var5;
                this.field2541.method1958(var5);
                arg0 -= var5;
                this.method3911();
            } while (this.field2535.method4006());
        }
        this.field2541.method1958(arg0);
    }

    @ObfuscatedName("hz.aj(I)V")
    public void method3911() {
        int var1 = this.field2528;
        int var2 = this.field2538;
        long var3 = this.field2521;
        while (this.field2538 == var2) {
            while (this.field2535.field2568[var1] == var2) {
                this.field2535.method4013(var1);
                int var5 = this.field2535.method3999(var1);
                if (var5 == 1) {
                    this.field2535.method3997();
                    this.field2535.method4033(var1);
                    if (this.field2535.method3996()) {
                        if (!this.field2536 || var2 == 0) {
                            this.method3902();
                            this.field2535.method3993();
                            return;
                        }
                        this.field2535.method4035(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3905(var5);
                }
                this.field2535.method3998(var1);
                this.field2535.method4033(var1);
            }
            var1 = this.field2535.method4000();
            var2 = this.field2535.field2568[var1];
            var3 = this.field2535.method4002(var2);
        }
        this.field2528 = var1;
        this.field2538 = var2;
        this.field2521 = var3;
    }

    @ObfuscatedName("hz.as(Lhu;I)Z")
    public boolean method3912(class222 arg0) {
        if (arg0.field2560 != null) {
            return false;
        }
        if (arg0.field2549 >= 0) {
            arg0.method3766();
            if (arg0.field2546 > 0 && this.field2534[arg0.field2545][arg0.field2546] == arg0) {
                this.field2534[arg0.field2545][arg0.field2546] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("hz.br(Lhu;[IIII)Z")
    public boolean method3913(class222 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2561 = Statics.field56 / 100;
        if (arg0.field2549 >= 0 && arg0.field2560 == null || arg0.field2560.method2143()) {
            arg0.method3988();
            arg0.method3766();
            if (arg0.field2546 > 0 && this.field2534[arg0.field2545][arg0.field2546] == arg0) {
                this.field2534[arg0.field2545][arg0.field2546] = null;
            }
            return true;
        }
        int var5 = arg0.field2555;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2526[arg0.field2545] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2555 = var6;
        }
        arg0.field2560.method2141(this.method3953(arg0));
        class219 var7 = arg0.field2556;
        boolean var8 = false;
        arg0.field2558++;
        arg0.field2559 += var7.field2502;
        double var9 = (double) ((arg0.field2547 - 60 << 8) + (arg0.field2555 * arg0.field2551 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2497 > 0) {
            if (var7.field2496 > 0) {
                arg0.field2553 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2496 * var9) + 0.5D);
            } else {
                arg0.field2553 += 128;
            }
        }
        if (var7.field2495 != null) {
            if (var7.field2498 > 0) {
                arg0.field2554 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2498 * var9) + 0.5D);
            } else {
                arg0.field2554 += 128;
            }
            while (arg0.field2552 < var7.field2495.length - 2 && arg0.field2554 > (var7.field2495[arg0.field2552 + 2] & 0xFF) << 8) {
                arg0.field2552 += 2;
            }
            if (arg0.field2552 == var7.field2495.length - 2 && var7.field2495[arg0.field2552 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2549 >= 0 && var7.field2504 != null && (this.field2527[arg0.field2545] & 0x1) == 0 && (arg0.field2546 < 0 || this.field2534[arg0.field2545][arg0.field2546] != arg0)) {
            if (var7.field2499 > 0) {
                arg0.field2549 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2499 * var9) + 0.5D);
            } else {
                arg0.field2549 += 128;
            }
            while (arg0.field2557 < var7.field2504.length - 2 && arg0.field2549 > (var7.field2504[arg0.field2557 + 2] & 0xFF) << 8) {
                arg0.field2557 += 2;
            }
            if (arg0.field2557 == var7.field2504.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2560.method2252(arg0.field2561, this.method3908(arg0), this.method3882(arg0));
            return false;
        }
        arg0.field2560.method2140(arg0.field2561);
        if (arg1 == null) {
            arg0.field2560.method1958(arg3);
        } else {
            arg0.field2560.method1931(arg1, arg2, arg3);
        }
        if (arg0.field2560.method2172()) {
            this.field2541.field2590.method1923(arg0.field2560);
        }
        arg0.method3988();
        if (arg0.field2549 >= 0) {
            arg0.method3766();
            if (arg0.field2546 > 0 && this.field2534[arg0.field2545][arg0.field2546] == arg0) {
                this.field2534[arg0.field2545][arg0.field2546] = null;
            }
        }
        return true;
    }
}
