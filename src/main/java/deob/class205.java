package deob;

@ObfuscatedName("gy")
public class class205 extends class118 {

    @ObfuscatedName("gy.d")
    public class191 field2554 = new class191(128);

    @ObfuscatedName("gy.k")
    public int field2528 = 256;

    @ObfuscatedName("gy.e")
    public int field2538 = 1000000;

    @ObfuscatedName("gy.p")
    public int[] field2527 = new int[16];

    @ObfuscatedName("gy.q")
    public int[] field2531 = new int[16];

    @ObfuscatedName("gy.s")
    public int[] field2532 = new int[16];

    @ObfuscatedName("gy.r")
    public int[] field2543 = new int[16];

    @ObfuscatedName("gy.g")
    public int[] field2552 = new int[16];

    @ObfuscatedName("gy.v")
    public int[] field2535 = new int[16];

    @ObfuscatedName("gy.t")
    public int[] field2536 = new int[16];

    @ObfuscatedName("gy.y")
    public int[] field2537 = new int[16];

    @ObfuscatedName("gy.o")
    public int[] field2530 = new int[16];

    @ObfuscatedName("gy.h")
    public int[] field2540 = new int[16];

    @ObfuscatedName("gy.a")
    public int[] field2539 = new int[16];

    @ObfuscatedName("gy.z")
    public int[] field2542 = new int[16];

    @ObfuscatedName("gy.l")
    public int[] field2541 = new int[16];

    @ObfuscatedName("gy.w")
    public int[] field2544 = new int[16];

    @ObfuscatedName("gy.n")
    public int[] field2545 = new int[16];

    @ObfuscatedName("gy.m")
    public class206[][] field2546 = new class206[16][128];

    @ObfuscatedName("gy.ae")
    public class206[][] field2547 = new class206[16][128];

    @ObfuscatedName("gy.ai")
    public class207 field2548 = new class207();

    @ObfuscatedName("gy.ah")
    public boolean field2549;

    @ObfuscatedName("gy.ab")
    public int field2550;

    @ObfuscatedName("gy.ad")
    public int field2551;

    @ObfuscatedName("gy.ag")
    public long field2533;

    @ObfuscatedName("gy.as")
    public long field2555;

    @ObfuscatedName("gy.af")
    public class209 field2529 = new class209(this);

    public class205() {
        this.method3525();
    }

    @ObfuscatedName("gy.d(II)V")
    public synchronized void method3505(int arg0) {
        this.field2528 = arg0;
    }

    @ObfuscatedName("gy.k(I)I")
    public int method3557() {
        return this.field2528;
    }

    @ObfuscatedName("gy.e(Lhd;Lit;Ldi;II)Z")
    public synchronized boolean method3539(class210 arg0, class236 arg1, class111 arg2, int arg3) {
        arg0.method3697();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class200 var7 = (class200) arg0.field2609.method3355(); var7 != null; var7 = (class200) arg0.field2609.method3356()) {
            int var8 = (int) var7.field2486;
            class208 var9 = (class208) this.field2554.method3352((long) var8);
            if (var9 == null) {
                var9 = class208.method967(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field2554.method3358(var9, (long) var8);
            }
            if (!var9.method3676(arg2, var7.field2501, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3698();
        }
        return var5;
    }

    @ObfuscatedName("gy.p(B)V")
    public synchronized void method3508() {
        for (class208 var1 = (class208) this.field2554.method3355(); var1 != null; var1 = (class208) this.field2554.method3356()) {
            var1.method3685();
        }
    }

    @ObfuscatedName("gy.q(I)V")
    public synchronized void method3531() {
        for (class208 var1 = (class208) this.field2554.method3355(); var1 != null; var1 = (class208) this.field2554.method3356()) {
            var1.method3407();
        }
    }

    @ObfuscatedName("gy.t(Lhd;ZI)V")
    public synchronized void method3576(class210 arg0, boolean arg1) {
        this.method3511();
        this.field2548.method3656(arg0.field2610);
        this.field2549 = arg1;
        this.field2533 = 0L;
        int var3 = this.field2548.method3636();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2548.method3659(var4);
            this.field2548.method3649(var4);
            this.field2548.method3626(var4);
        }
        this.field2550 = this.field2548.method3633();
        this.field2551 = this.field2548.field2587[this.field2550];
        this.field2555 = this.field2548.method3632(this.field2551);
    }

    @ObfuscatedName("gy.o(B)V")
    public synchronized void method3511() {
        this.field2548.method3622();
        this.method3525();
    }

    @ObfuscatedName("gy.i(I)Z")
    public synchronized boolean method3561() {
        return this.field2548.method3637();
    }

    @ObfuscatedName("gy.u(IIB)V")
    public synchronized void method3513(int arg0, int arg1) {
        this.method3514(arg0, arg1);
    }

    @ObfuscatedName("gy.x(III)V")
    public void method3514(int arg0, int arg1) {
        this.field2543[arg0] = arg1;
        this.field2535[arg0] = arg1 & 0xFFFFFF80;
        this.method3506(arg0, arg1);
    }

    @ObfuscatedName("gy.c(III)V")
    public void method3506(int arg0, int arg1) {
        if (this.field2552[arg0] != arg1) {
            this.field2552[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2547[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("gy.h(IIIB)V")
    public void method3516(int arg0, int arg1, int arg2) {
        this.method3518(arg0, arg1, 64);
        if ((this.field2540[arg0] & 0x2) != 0) {
            for (class206 var4 = (class206) this.field2529.field2602.method3417(); var4 != null; var4 = (class206) this.field2529.field2602.method3419()) {
                if (var4.field2564 == arg0 && var4.field2572 < 0) {
                    this.field2546[arg0][var4.field2575] = null;
                    this.field2546[arg0][arg1] = var4;
                    int var5 = (var4.field2568 * var4.field2567 >> 12) + var4.field2566;
                    var4.field2566 += arg1 - var4.field2575 << 8;
                    var4.field2567 = var5 - var4.field2566;
                    var4.field2568 = 4096;
                    var4.field2575 = arg1;
                    return;
                }
            }
        }
        class208 var6 = (class208) this.field2554.method3352((long) this.field2552[arg0]);
        if (var6 == null) {
            return;
        }
        class106 var7 = var6.field2594[arg1];
        if (var7 == null) {
            return;
        }
        class206 var8 = new class206();
        var8.field2564 = arg0;
        var8.field2559 = var6;
        var8.field2560 = var7;
        var8.field2561 = var6.field2598[arg1];
        var8.field2562 = var6.field2593[arg1];
        var8.field2575 = arg1;
        var8.field2577 = var6.field2599 * arg2 * arg2 * var6.field2596[arg1] + 1024 >> 11;
        var8.field2558 = var6.field2597[arg1] & 0xFF;
        var8.field2566 = (arg1 << 8) - (var6.field2595[arg1] & 0x7FFF);
        var8.field2569 = 0;
        var8.field2570 = 0;
        var8.field2563 = 0;
        var8.field2572 = -1;
        var8.field2573 = 0;
        if (this.field2541[arg0] == 0) {
            var8.field2571 = class116.method2148(var7, this.method3547(var8), this.method3530(var8), this.method3533(var8));
        } else {
            var8.field2571 = class116.method2148(var7, this.method3547(var8), 0, this.method3533(var8));
            this.method3517(var8, var6.field2595[arg1] < 0);
        }
        if (var6.field2595[arg1] < 0) {
            var8.field2571.method2142(-1);
        }
        if (var8.field2562 >= 0) {
            class206 var9 = this.field2547[arg0][var8.field2562];
            if (var9 != null && var9.field2572 < 0) {
                this.field2546[arg0][var9.field2575] = null;
                var9.field2572 = 0;
            }
            this.field2547[arg0][var8.field2562] = var8;
        }
        this.field2529.field2602.method3411(var8);
        this.field2546[arg0][arg1] = var8;
    }

    @ObfuscatedName("gy.a(Lgi;ZB)V")
    public void method3517(class206 arg0, boolean arg1) {
        int var3 = arg0.field2560.field1597.length;
        int var5;
        if (arg1 && arg0.field2560.field1600) {
            int var4 = var3 + var3 - arg0.field2560.field1599;
            var5 = (int) ((long) this.field2541[arg0.field2564] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2571.method2098(true);
            }
        } else {
            var5 = (int) ((long) this.field2541[arg0.field2564] * (long) var3 >> 6);
        }
        arg0.field2571.method2027(var5);
    }

    @ObfuscatedName("gy.w(IIII)V")
    public void method3518(int arg0, int arg1, int arg2) {
        class206 var4 = this.field2546[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2546[arg0][arg1] = null;
        if ((this.field2540[arg0] & 0x2) == 0) {
            var4.field2572 = 0;
            return;
        }
        for (class206 var5 = (class206) this.field2529.field2602.method3409(); var5 != null; var5 = (class206) this.field2529.field2602.method3429()) {
            if (var4.field2564 == var5.field2564 && var5.field2572 < 0 && var4 != var5) {
                var4.field2572 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("gy.n(IIII)V")
    public void method3519(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("gy.m(III)V")
    public void method3520(int arg0, int arg1) {
    }

    @ObfuscatedName("gy.ae(III)V")
    public void method3521(int arg0, int arg1) {
        this.field2536[arg0] = arg1;
    }

    @ObfuscatedName("gy.ai(II)V")
    public void method3522(int arg0) {
        for (class206 var2 = (class206) this.field2529.field2602.method3409(); var2 != null; var2 = (class206) this.field2529.field2602.method3429()) {
            if (arg0 < 0 || var2.field2564 == arg0) {
                if (var2.field2571 != null) {
                    var2.field2571.method2015(Statics.field463 / 100);
                    if (var2.field2571.method2137()) {
                        this.field2529.field2607.method1821(var2.field2571);
                    }
                    var2.method3615();
                }
                if (var2.field2572 < 0) {
                    this.field2546[var2.field2564][var2.field2575] = null;
                }
                var2.method3407();
            }
        }
    }

    @ObfuscatedName("gy.ah(II)V")
    public void method3574(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3574(var2);
            }
            return;
        }
        this.field2527[arg0] = 12800;
        this.field2531[arg0] = 8192;
        this.field2532[arg0] = 16383;
        this.field2536[arg0] = 8192;
        this.field2537[arg0] = 0;
        this.field2530[arg0] = 8192;
        this.method3526(arg0);
        this.method3595(arg0);
        this.field2540[arg0] = 0;
        this.field2539[arg0] = 32767;
        this.field2542[arg0] = 256;
        this.field2541[arg0] = 0;
        this.method3560(arg0, 8192);
    }

    @ObfuscatedName("gy.ab(IB)V")
    public void method3538(int arg0) {
        for (class206 var2 = (class206) this.field2529.field2602.method3409(); var2 != null; var2 = (class206) this.field2529.field2602.method3429()) {
            if ((arg0 < 0 || var2.field2564 == arg0) && var2.field2572 < 0) {
                this.field2546[var2.field2564][var2.field2575] = null;
                var2.field2572 = 0;
            }
        }
    }

    @ObfuscatedName("gy.aa(B)V")
    public void method3525() {
        this.method3522(-1);
        this.method3574(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2552[var1] = this.field2543[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2535[var2] = this.field2543[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("gy.at(IB)V")
    public void method3526(int arg0) {
        if ((this.field2540[arg0] & 0x2) == 0) {
            return;
        }
        for (class206 var2 = (class206) this.field2529.field2602.method3409(); var2 != null; var2 = (class206) this.field2529.field2602.method3429()) {
            if (var2.field2564 == arg0 && this.field2546[arg0][var2.field2575] == null && var2.field2572 < 0) {
                var2.field2572 = 0;
            }
        }
    }

    @ObfuscatedName("gy.aw(IB)V")
    public void method3595(int arg0) {
        if ((this.field2540[arg0] & 0x4) == 0) {
            return;
        }
        for (class206 var2 = (class206) this.field2529.field2602.method3409(); var2 != null; var2 = (class206) this.field2529.field2602.method3429()) {
            if (var2.field2564 == arg0) {
                var2.field2578 = 0;
            }
        }
    }

    @ObfuscatedName("gy.ax(II)V")
    public void method3528(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3518(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3516(var6, var7, var8);
            } else {
                this.method3518(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3519(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2535[var12] = (var14 << 14) + (this.field2535[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2535[var12] = (var14 << 7) + (this.field2535[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2537[var12] = (var14 << 7) + (this.field2537[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2537[var12] = (this.field2537[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2530[var12] = (var14 << 7) + (this.field2530[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2530[var12] = (this.field2530[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2527[var12] = (var14 << 7) + (this.field2527[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2527[var12] = (this.field2527[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2531[var12] = (var14 << 7) + (this.field2531[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2531[var12] = (this.field2531[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2532[var12] = (var14 << 7) + (this.field2532[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2532[var12] = (this.field2532[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2540[var12] |= 0x1;
                } else {
                    this.field2540[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2540[var12] |= 0x2;
                } else {
                    this.method3526(var12);
                    this.field2540[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2539[var12] = (var14 << 7) + (this.field2539[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2539[var12] = (this.field2539[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2539[var12] = (var14 << 7) + (this.field2539[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2539[var12] = (this.field2539[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3522(var12);
            }
            if (var13 == 121) {
                this.method3574(var12);
            }
            if (var13 == 123) {
                this.method3538(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2539[var12];
                if (var15 == 16384) {
                    this.field2542[var12] = (var14 << 7) + (this.field2542[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2539[var12];
                if (var16 == 16384) {
                    this.field2542[var12] = (this.field2542[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2541[var12] = (var14 << 7) + (this.field2541[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2541[var12] = (this.field2541[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2540[var12] |= 0x4;
                } else {
                    this.method3595(var12);
                    this.field2540[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3560(var12, (var14 << 7) + (this.field2544[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3560(var12, (this.field2544[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3506(var17, this.field2535[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3520(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method3521(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3525();
            }
        }
    }

    @ObfuscatedName("gy.ak(III)V")
    public void method3560(int arg0, int arg1) {
        this.field2544[arg0] = arg1;
        this.field2545[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("gy.bj(Lgi;I)I")
    public int method3547(class206 arg0) {
        int var2 = (arg0.field2568 * arg0.field2567 >> 12) + arg0.field2566;
        int var3 = ((this.field2536[arg0.field2564] - 8192) * this.field2542[arg0.field2564] >> 12) + var2;
        class203 var4 = arg0.field2561;
        if (var4.field2513 > 0 && (var4.field2512 > 0 || this.field2537[arg0.field2564] > 0)) {
            int var5 = var4.field2512 << 2;
            int var6 = var4.field2514 << 1;
            if (arg0.field2574 < var6) {
                var5 = arg0.field2574 * var5 / var6;
            }
            int var7 = (this.field2537[arg0.field2564] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2565 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2560.field1598 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field463 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("gy.bf(Lgi;I)I")
    public int method3530(class206 arg0) {
        class203 var2 = arg0.field2561;
        int var3 = this.field2532[arg0.field2564] * this.field2527[arg0.field2564] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2577 * var4 + 16384 >> 15;
        int var6 = this.field2528 * var5 + 128 >> 8;
        if (var2.field2510 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2569 * 1.953125E-5D * (double) var2.field2510) + 0.5D);
        }
        if (var2.field2517 != null) {
            int var7 = arg0.field2570;
            int var8 = var2.field2517[arg0.field2563 + 1];
            if (arg0.field2563 < var2.field2517.length - 2) {
                int var9 = (var2.field2517[arg0.field2563] & 0xFF) << 8;
                int var10 = (var2.field2517[arg0.field2563 + 2] & 0xFF) << 8;
                var8 += (var2.field2517[arg0.field2563 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2572 > 0 && var2.field2516 != null) {
            int var11 = arg0.field2572;
            int var12 = var2.field2516[arg0.field2573 + 1];
            if (arg0.field2573 < var2.field2516.length - 2) {
                int var13 = (var2.field2516[arg0.field2573] & 0xFF) << 8;
                int var14 = (var2.field2516[arg0.field2573 + 2] & 0xFF) << 8;
                var12 += (var2.field2516[arg0.field2573 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("gy.bq(Lgi;I)I")
    public int method3533(class206 arg0) {
        int var2 = this.field2531[arg0.field2564];
        return var2 < 8192 ? arg0.field2558 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2558) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("gy.s()Ldd;")
    public synchronized class118 method1795() {
        return this.field2529;
    }

    @ObfuscatedName("gy.r()Ldd;")
    public synchronized class118 method1796() {
        return null;
    }

    @ObfuscatedName("gy.g()I")
    public synchronized int method1815() {
        return 0;
    }

    @ObfuscatedName("gy.v([III)V")
    public synchronized void method1810(int[] arg0, int arg1, int arg2) {
        if (this.field2548.method3637()) {
            int var4 = this.field2538 * this.field2548.field2580 / Statics.field463;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2533;
                if (this.field2555 - var5 >= 0L) {
                    this.field2533 = var5;
                    break;
                }
                int var7 = (int) ((this.field2555 - this.field2533 + (long) var4 - 1L) / (long) var4);
                this.field2533 += (long) var4 * (long) var7;
                this.field2529.method1810(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3534();
            } while (this.field2548.method3637());
        }
        this.field2529.method1810(arg0, arg1, arg2);
    }

    @ObfuscatedName("gy.y(I)V")
    public synchronized void method1790(int arg0) {
        if (this.field2548.method3637()) {
            int var2 = this.field2538 * this.field2548.field2580 / Statics.field463;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2533;
                if (this.field2555 - var3 >= 0L) {
                    this.field2533 = var3;
                    break;
                }
                int var5 = (int) ((this.field2555 - this.field2533 + (long) var2 - 1L) / (long) var2);
                this.field2533 += (long) var2 * (long) var5;
                this.field2529.method1790(var5);
                arg0 -= var5;
                this.method3534();
            } while (this.field2548.method3637());
        }
        this.field2529.method1790(arg0);
    }

    @ObfuscatedName("gy.bc(I)V")
    public void method3534() {
        int var1 = this.field2550;
        int var2 = this.field2551;
        long var3 = this.field2555;
        while (this.field2551 == var2) {
            while (this.field2548.field2587[var1] == var2) {
                this.field2548.method3659(var1);
                int var5 = this.field2548.method3629(var1);
                if (var5 == 1) {
                    this.field2548.method3627();
                    this.field2548.method3626(var1);
                    if (this.field2548.method3634()) {
                        if (!this.field2549 || var2 == 0) {
                            this.method3525();
                            this.field2548.method3622();
                            return;
                        }
                        this.field2548.method3635(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3528(var5);
                }
                this.field2548.method3649(var1);
                this.field2548.method3626(var1);
            }
            var1 = this.field2548.method3633();
            var2 = this.field2548.field2587[var1];
            var3 = this.field2548.method3632(var2);
        }
        this.field2550 = var1;
        this.field2551 = var2;
        this.field2555 = var3;
    }

    @ObfuscatedName("gy.by(Lgi;I)Z")
    public boolean method3535(class206 arg0) {
        if (arg0.field2571 != null) {
            return false;
        }
        if (arg0.field2572 >= 0) {
            arg0.method3407();
            if (arg0.field2562 > 0 && this.field2547[arg0.field2564][arg0.field2562] == arg0) {
                this.field2547[arg0.field2564][arg0.field2562] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("gy.bb(Lgi;[IIIB)Z")
    public boolean method3536(class206 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2576 = Statics.field463 / 100;
        if (arg0.field2572 >= 0 && arg0.field2571 == null || arg0.field2571.method2035()) {
            arg0.method3615();
            arg0.method3407();
            if (arg0.field2562 > 0 && this.field2547[arg0.field2564][arg0.field2562] == arg0) {
                this.field2547[arg0.field2564][arg0.field2562] = null;
            }
            return true;
        }
        int var5 = arg0.field2568;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2530[arg0.field2564] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2568 = var6;
        }
        arg0.field2571.method2033(this.method3547(arg0));
        class203 var7 = arg0.field2561;
        boolean var8 = false;
        arg0.field2574++;
        arg0.field2565 += var7.field2513;
        double var9 = (double) ((arg0.field2575 - 60 << 8) + (arg0.field2568 * arg0.field2567 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2510 > 0) {
            if (var7.field2511 > 0) {
                arg0.field2569 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2511 * var9) + 0.5D);
            } else {
                arg0.field2569 += 128;
            }
        }
        if (var7.field2517 != null) {
            if (var7.field2515 > 0) {
                arg0.field2570 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2515 * var9) + 0.5D);
            } else {
                arg0.field2570 += 128;
            }
            while (arg0.field2563 < var7.field2517.length - 2 && arg0.field2570 > (var7.field2517[arg0.field2563 + 2] & 0xFF) << 8) {
                arg0.field2563 += 2;
            }
            if (arg0.field2563 == var7.field2517.length - 2 && var7.field2517[arg0.field2563 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2572 >= 0 && var7.field2516 != null && (this.field2540[arg0.field2564] & 0x1) == 0 && (arg0.field2562 < 0 || this.field2547[arg0.field2564][arg0.field2562] != arg0)) {
            if (var7.field2506 > 0) {
                arg0.field2572 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2506 * var9) + 0.5D);
            } else {
                arg0.field2572 += 128;
            }
            while (arg0.field2573 < var7.field2516.length - 2 && arg0.field2572 > (var7.field2516[arg0.field2573 + 2] & 0xFF) << 8) {
                arg0.field2573 += 2;
            }
            if (arg0.field2573 == var7.field2516.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2571.method2031(arg0.field2576, this.method3530(arg0), this.method3533(arg0));
            return false;
        }
        arg0.field2571.method2015(arg0.field2576);
        if (arg1 == null) {
            arg0.field2571.method1790(arg3);
        } else {
            arg0.field2571.method1810(arg1, arg2, arg3);
        }
        if (arg0.field2571.method2137()) {
            this.field2529.field2607.method1821(arg0.field2571);
        }
        arg0.method3615();
        if (arg0.field2572 >= 0) {
            arg0.method3407();
            if (arg0.field2562 > 0 && this.field2547[arg0.field2564][arg0.field2562] == arg0) {
                this.field2547[arg0.field2564][arg0.field2562] = null;
            }
        }
        return true;
    }
}
