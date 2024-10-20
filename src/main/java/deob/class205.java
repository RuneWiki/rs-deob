package deob;

@ObfuscatedName("gy")
public class class205 extends class120 {

    @ObfuscatedName("gy.e")
    public class191 field2519 = new class191(128);

    @ObfuscatedName("gy.o")
    public int field2495 = 256;

    @ObfuscatedName("gy.m")
    public int field2494 = 1000000;

    @ObfuscatedName("gy.g")
    public int[] field2497 = new int[16];

    @ObfuscatedName("gy.d")
    public int[] field2498 = new int[16];

    @ObfuscatedName("gy.b")
    public int[] field2520 = new int[16];

    @ObfuscatedName("gy.k")
    public int[] field2523 = new int[16];

    @ObfuscatedName("gy.f")
    public int[] field2501 = new int[16];

    @ObfuscatedName("gy.j")
    public int[] field2502 = new int[16];

    @ObfuscatedName("gy.q")
    public int[] field2503 = new int[16];

    @ObfuscatedName("gy.h")
    public int[] field2514 = new int[16];

    @ObfuscatedName("gy.i")
    public int[] field2505 = new int[16];

    @ObfuscatedName("gy.y")
    public int[] field2508 = new int[16];

    @ObfuscatedName("gy.p")
    public int[] field2504 = new int[16];

    @ObfuscatedName("gy.l")
    public int[] field2510 = new int[16];

    @ObfuscatedName("gy.x")
    public int[] field2511 = new int[16];

    @ObfuscatedName("gy.r")
    public int[] field2512 = new int[16];

    @ObfuscatedName("gy.t")
    public int[] field2513 = new int[16];

    @ObfuscatedName("gy.a")
    public class206[][] field2496 = new class206[16][128];

    @ObfuscatedName("gy.ad")
    public class206[][] field2515 = new class206[16][128];

    @ObfuscatedName("gy.ay")
    public class207 field2516 = new class207();

    @ObfuscatedName("gy.am")
    public boolean field2517;

    @ObfuscatedName("gy.ae")
    public int field2518;

    @ObfuscatedName("gy.az")
    public int field2499;

    @ObfuscatedName("gy.ar")
    public long field2500;

    @ObfuscatedName("gy.ai")
    public long field2521;

    @ObfuscatedName("gy.ap")
    public class209 field2522 = new class209(this);

    public class205() {
        this.method3426();
    }

    @ObfuscatedName("gy.e(II)V")
    public synchronized void method3409(int arg0) {
        this.field2495 = arg0;
    }

    @ObfuscatedName("gy.o(B)I")
    public int method3410() {
        return this.field2495;
    }

    @ObfuscatedName("gy.m(Lhm;Lin;Ldy;II)Z")
    public synchronized boolean method3448(class210 arg0, class236 arg1, class113 arg2, int arg3) {
        arg0.method3574();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class200 var7 = (class200) arg0.field2581.method3262(); var7 != null; var7 = (class200) arg0.field2581.method3263()) {
            int var8 = (int) var7.field2454;
            class208 var9 = (class208) this.field2519.method3268((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method3797(var8);
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
                this.field2519.method3259(var11, (long) var8);
            }
            if (!var9.method3556(arg2, var7.field2468, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3578();
        }
        return var5;
    }

    @ObfuscatedName("gy.g(I)V")
    public synchronized void method3414() {
        for (class208 var1 = (class208) this.field2519.method3262(); var1 != null; var1 = (class208) this.field2519.method3263()) {
            var1.method3558();
        }
    }

    @ObfuscatedName("gy.d(I)V")
    public synchronized void method3413() {
        for (class208 var1 = (class208) this.field2519.method3262(); var1 != null; var1 = (class208) this.field2519.method3263()) {
            var1.method3304();
        }
    }

    @ObfuscatedName("gy.i(Lhm;ZB)V")
    public synchronized void method3466(class210 arg0, boolean arg1) {
        this.method3457();
        this.field2516.method3512(arg0.field2580);
        this.field2517 = arg1;
        this.field2500 = 0L;
        int var3 = this.field2516.method3515();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2516.method3519(var4);
            this.field2516.method3517(var4);
            this.field2516.method3553(var4);
        }
        this.field2518 = this.field2516.method3522();
        this.field2499 = this.field2516.field2556[this.field2518];
        this.field2521 = this.field2516.method3521(this.field2499);
    }

    @ObfuscatedName("gy.n(B)V")
    public synchronized void method3457() {
        this.field2516.method3513();
        this.method3426();
    }

    @ObfuscatedName("gy.c(I)Z")
    public synchronized boolean method3415() {
        return this.field2516.method3514();
    }

    @ObfuscatedName("gy.v(III)V")
    public synchronized void method3416(int arg0, int arg1) {
        this.method3452(arg0, arg1);
    }

    @ObfuscatedName("gy.u(III)V")
    public void method3452(int arg0, int arg1) {
        this.field2523[arg0] = arg1;
        this.field2502[arg0] = arg1 & 0xFFFFFF80;
        this.method3417(arg0, arg1);
    }

    @ObfuscatedName("gy.w(III)V")
    public void method3417(int arg0, int arg1) {
        if (this.field2501[arg0] != arg1) {
            this.field2501[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2515[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("gy.p(IIII)V")
    public void method3418(int arg0, int arg1, int arg2) {
        this.method3419(arg0, arg1, 64);
        if ((this.field2508[arg0] & 0x2) != 0) {
            for (class206 var4 = (class206) this.field2522.field2575.method3321(); var4 != null; var4 = (class206) this.field2522.field2575.method3317()) {
                if (var4.field2527 == arg0 && var4.field2539 < 0) {
                    this.field2496[arg0][var4.field2531] = null;
                    this.field2496[arg0][arg1] = var4;
                    int var5 = (var4.field2535 * var4.field2530 >> 12) + var4.field2533;
                    var4.field2533 += arg1 - var4.field2531 << 8;
                    var4.field2530 = var5 - var4.field2533;
                    var4.field2535 = 4096;
                    var4.field2531 = arg1;
                    return;
                }
            }
        }
        class208 var6 = (class208) this.field2519.method3268((long) this.field2501[arg0]);
        if (var6 == null) {
            return;
        }
        class108 var7 = var6.field2565[arg1];
        if (var7 == null) {
            return;
        }
        class206 var8 = new class206();
        var8.field2527 = arg0;
        var8.field2526 = var6;
        var8.field2534 = var7;
        var8.field2550 = var6.field2571[arg1];
        var8.field2525 = var6.field2566[arg1];
        var8.field2531 = arg1;
        var8.field2542 = var6.field2569 * arg2 * arg2 * var6.field2570[arg1] + 1024 >> 11;
        var8.field2538 = var6.field2568[arg1] & 0xFF;
        var8.field2533 = (arg1 << 8) - (var6.field2567[arg1] & 0x7FFF);
        var8.field2536 = 0;
        var8.field2537 = 0;
        var8.field2546 = 0;
        var8.field2539 = -1;
        var8.field2532 = 0;
        if (this.field2511[arg0] == 0) {
            var8.field2543 = class118.method1981(var7, this.method3431(var8), this.method3432(var8), this.method3433(var8));
        } else {
            var8.field2543 = class118.method1981(var7, this.method3431(var8), 0, this.method3433(var8));
            this.method3492(var8, var6.field2567[arg1] < 0);
        }
        if (var6.field2567[arg1] < 0) {
            var8.field2543.method1938(-1);
        }
        if (var8.field2525 >= 0) {
            class206 var9 = this.field2515[arg0][var8.field2525];
            if (var9 != null && var9.field2539 < 0) {
                this.field2496[arg0][var9.field2531] = null;
                var9.field2539 = 0;
            }
            this.field2515[arg0][var8.field2525] = var8;
        }
        this.field2522.field2575.method3318(var8);
        this.field2496[arg0][arg1] = var8;
    }

    @ObfuscatedName("gy.l(Lgl;ZI)V")
    public void method3492(class206 arg0, boolean arg1) {
        int var3 = arg0.field2534.field1609.length;
        int var5;
        if (arg1 && arg0.field2534.field1612) {
            int var4 = var3 + var3 - arg0.field2534.field1610;
            var5 = (int) ((long) this.field2511[arg0.field2527] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2543.method1945(true);
            }
        } else {
            var5 = (int) ((long) this.field2511[arg0.field2527] * (long) var3 >> 6);
        }
        arg0.field2543.method1944(var5);
    }

    @ObfuscatedName("gy.x(IIII)V")
    public void method3419(int arg0, int arg1, int arg2) {
        class206 var4 = this.field2496[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2496[arg0][arg1] = null;
        if ((this.field2508[arg0] & 0x2) == 0) {
            var4.field2539 = 0;
            return;
        }
        for (class206 var5 = (class206) this.field2522.field2575.method3336(); var5 != null; var5 = (class206) this.field2522.field2575.method3324()) {
            if (var4.field2527 == var5.field2527 && var5.field2539 < 0 && var4 != var5) {
                var4.field2539 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("gy.r(IIIB)V")
    public void method3497(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("gy.t(III)V")
    public void method3453(int arg0, int arg1) {
    }

    @ObfuscatedName("gy.a(IIB)V")
    public void method3422(int arg0, int arg1) {
        this.field2503[arg0] = arg1;
    }

    @ObfuscatedName("gy.ad(II)V")
    public void method3423(int arg0) {
        for (class206 var2 = (class206) this.field2522.field2575.method3336(); var2 != null; var2 = (class206) this.field2522.field2575.method3324()) {
            if (arg0 < 0 || var2.field2527 == arg0) {
                if (var2.field2543 != null) {
                    var2.field2543.method1949(Statics.field1644 / 100);
                    if (var2.field2543.method1952()) {
                        this.field2522.field2574.method1728(var2.field2543);
                    }
                    var2.method3509();
                }
                if (var2.field2539 < 0) {
                    this.field2496[var2.field2527][var2.field2531] = null;
                }
                var2.method3304();
            }
        }
    }

    @ObfuscatedName("gy.ay(II)V")
    public void method3411(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3411(var2);
            }
            return;
        }
        this.field2497[arg0] = 12800;
        this.field2498[arg0] = 8192;
        this.field2520[arg0] = 16383;
        this.field2503[arg0] = 8192;
        this.field2514[arg0] = 0;
        this.field2505[arg0] = 8192;
        this.method3427(arg0);
        this.method3428(arg0);
        this.field2508[arg0] = 0;
        this.field2504[arg0] = 32767;
        this.field2510[arg0] = 256;
        this.field2511[arg0] = 0;
        this.method3430(arg0, 8192);
    }

    @ObfuscatedName("gy.am(II)V")
    public void method3425(int arg0) {
        for (class206 var2 = (class206) this.field2522.field2575.method3336(); var2 != null; var2 = (class206) this.field2522.field2575.method3324()) {
            if ((arg0 < 0 || var2.field2527 == arg0) && var2.field2539 < 0) {
                this.field2496[var2.field2527][var2.field2531] = null;
                var2.field2539 = 0;
            }
        }
    }

    @ObfuscatedName("gy.ae(I)V")
    public void method3426() {
        this.method3423(-1);
        this.method3411(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2501[var1] = this.field2523[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2502[var2] = this.field2523[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("gy.ax(IB)V")
    public void method3427(int arg0) {
        if ((this.field2508[arg0] & 0x2) == 0) {
            return;
        }
        for (class206 var2 = (class206) this.field2522.field2575.method3336(); var2 != null; var2 = (class206) this.field2522.field2575.method3324()) {
            if (var2.field2527 == arg0 && this.field2496[arg0][var2.field2531] == null && var2.field2539 < 0) {
                var2.field2539 = 0;
            }
        }
    }

    @ObfuscatedName("gy.at(II)V")
    public void method3428(int arg0) {
        if ((this.field2508[arg0] & 0x4) == 0) {
            return;
        }
        for (class206 var2 = (class206) this.field2522.field2575.method3336(); var2 != null; var2 = (class206) this.field2522.field2575.method3324()) {
            if (var2.field2527 == arg0) {
                var2.field2545 = 0;
            }
        }
    }

    @ObfuscatedName("gy.ao(II)V")
    public void method3429(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3419(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3418(var6, var7, var8);
            } else {
                this.method3419(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3497(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2502[var12] = (var14 << 14) + (this.field2502[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2502[var12] = (var14 << 7) + (this.field2502[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2514[var12] = (var14 << 7) + (this.field2514[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2514[var12] = (this.field2514[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2505[var12] = (var14 << 7) + (this.field2505[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2505[var12] = (this.field2505[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2497[var12] = (var14 << 7) + (this.field2497[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2497[var12] = (this.field2497[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2498[var12] = (var14 << 7) + (this.field2498[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2498[var12] = (this.field2498[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2520[var12] = (var14 << 7) + (this.field2520[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2520[var12] = (this.field2520[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2508[var12] |= 0x1;
                } else {
                    this.field2508[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2508[var12] |= 0x2;
                } else {
                    this.method3427(var12);
                    this.field2508[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2504[var12] = (var14 << 7) + (this.field2504[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2504[var12] = (this.field2504[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2504[var12] = (var14 << 7) + (this.field2504[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2504[var12] = (this.field2504[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3423(var12);
            }
            if (var13 == 121) {
                this.method3411(var12);
            }
            if (var13 == 123) {
                this.method3425(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2504[var12];
                if (var15 == 16384) {
                    this.field2510[var12] = (var14 << 7) + (this.field2510[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2504[var12];
                if (var16 == 16384) {
                    this.field2510[var12] = (this.field2510[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2511[var12] = (var14 << 7) + (this.field2511[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2511[var12] = (this.field2511[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2508[var12] |= 0x4;
                } else {
                    this.method3428(var12);
                    this.field2508[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3430(var12, (var14 << 7) + (this.field2512[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3430(var12, (this.field2512[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3417(var17, this.field2502[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3453(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method3422(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3426();
            }
        }
    }

    @ObfuscatedName("gy.aq(III)V")
    public void method3430(int arg0, int arg1) {
        this.field2512[arg0] = arg1;
        this.field2513[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("gy.ac(Lgl;B)I")
    public int method3431(class206 arg0) {
        int var2 = (arg0.field2535 * arg0.field2530 >> 12) + arg0.field2533;
        int var3 = ((this.field2503[arg0.field2527] - 8192) * this.field2510[arg0.field2527] >> 12) + var2;
        class203 var4 = arg0.field2550;
        if (var4.field2473 > 0 && (var4.field2480 > 0 || this.field2514[arg0.field2527] > 0)) {
            int var5 = var4.field2480 << 2;
            int var6 = var4.field2477 << 1;
            if (arg0.field2541 < var6) {
                var5 = arg0.field2541 * var5 / var6;
            }
            int var7 = (this.field2514[arg0.field2527] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2529 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2534.field1608 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1644 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("gy.ag(Lgl;I)I")
    public int method3432(class206 arg0) {
        class203 var2 = arg0.field2550;
        int var3 = this.field2520[arg0.field2527] * this.field2497[arg0.field2527] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2542 * var4 + 16384 >> 15;
        int var6 = this.field2495 * var5 + 128 >> 8;
        if (var2.field2475 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2536 * 1.953125E-5D * (double) var2.field2475) + 0.5D);
        }
        if (var2.field2479 != null) {
            int var7 = arg0.field2537;
            int var8 = var2.field2479[arg0.field2546 + 1];
            if (arg0.field2546 < var2.field2479.length - 2) {
                int var9 = (var2.field2479[arg0.field2546] & 0xFF) << 8;
                int var10 = (var2.field2479[arg0.field2546 + 2] & 0xFF) << 8;
                var8 += (var2.field2479[arg0.field2546 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2539 > 0 && var2.field2474 != null) {
            int var11 = arg0.field2539;
            int var12 = var2.field2474[arg0.field2532 + 1];
            if (arg0.field2532 < var2.field2474.length - 2) {
                int var13 = (var2.field2474[arg0.field2532] & 0xFF) << 8;
                int var14 = (var2.field2474[arg0.field2532 + 2] & 0xFF) << 8;
                var12 += (var2.field2474[arg0.field2532 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("gy.au(Lgl;I)I")
    public int method3433(class206 arg0) {
        int var2 = this.field2498[arg0.field2527];
        return var2 < 8192 ? arg0.field2538 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2538) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("gy.b()Ldx;")
    public synchronized class120 method1708() {
        return this.field2522;
    }

    @ObfuscatedName("gy.k()Ldx;")
    public synchronized class120 method1707() {
        return null;
    }

    @ObfuscatedName("gy.q()I")
    public synchronized int method1710() {
        return 0;
    }

    @ObfuscatedName("gy.h([III)V")
    public synchronized void method1711(int[] arg0, int arg1, int arg2) {
        if (this.field2516.method3514()) {
            int var4 = this.field2494 * this.field2516.field2551 / Statics.field1644;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2500;
                if (this.field2521 - var5 >= 0L) {
                    this.field2500 = var5;
                    break;
                }
                int var7 = (int) ((this.field2521 - this.field2500 + (long) var4 - 1L) / (long) var4);
                this.field2500 += (long) var4 * (long) var7;
                this.field2522.method1711(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3436();
            } while (this.field2516.method3514());
        }
        this.field2522.method1711(arg0, arg1, arg2);
    }

    @ObfuscatedName("gy.s(I)V")
    public synchronized void method1713(int arg0) {
        if (this.field2516.method3514()) {
            int var2 = this.field2494 * this.field2516.field2551 / Statics.field1644;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2500;
                if (this.field2521 - var3 >= 0L) {
                    this.field2500 = var3;
                    break;
                }
                int var5 = (int) ((this.field2521 - this.field2500 + (long) var2 - 1L) / (long) var2);
                this.field2500 += (long) var2 * (long) var5;
                this.field2522.method1713(var5);
                arg0 -= var5;
                this.method3436();
            } while (this.field2516.method3514());
        }
        this.field2522.method1713(arg0);
    }

    @ObfuscatedName("gy.bz(B)V")
    public void method3436() {
        int var1 = this.field2518;
        int var2 = this.field2499;
        long var3 = this.field2521;
        while (this.field2499 == var2) {
            while (this.field2516.field2556[var1] == var2) {
                this.field2516.method3519(var1);
                int var5 = this.field2516.method3525(var1);
                if (var5 == 1) {
                    this.field2516.method3516();
                    this.field2516.method3553(var1);
                    if (this.field2516.method3531()) {
                        if (!this.field2517 || var2 == 0) {
                            this.method3426();
                            this.field2516.method3513();
                            return;
                        }
                        this.field2516.method3524(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3429(var5);
                }
                this.field2516.method3517(var1);
                this.field2516.method3553(var1);
            }
            var1 = this.field2516.method3522();
            var2 = this.field2516.field2556[var1];
            var3 = this.field2516.method3521(var2);
        }
        this.field2518 = var1;
        this.field2499 = var2;
        this.field2521 = var3;
    }

    @ObfuscatedName("gy.bo(Lgl;B)Z")
    public boolean method3442(class206 arg0) {
        if (arg0.field2543 != null) {
            return false;
        }
        if (arg0.field2539 >= 0) {
            arg0.method3304();
            if (arg0.field2525 > 0 && this.field2515[arg0.field2527][arg0.field2525] == arg0) {
                this.field2515[arg0.field2527][arg0.field2525] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("gy.bp(Lgl;[IIII)Z")
    public boolean method3438(class206 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2544 = Statics.field1644 / 100;
        if (arg0.field2539 >= 0 && arg0.field2543 == null || arg0.field2543.method1951()) {
            arg0.method3509();
            arg0.method3304();
            if (arg0.field2525 > 0 && this.field2515[arg0.field2527][arg0.field2525] == arg0) {
                this.field2515[arg0.field2527][arg0.field2525] = null;
            }
            return true;
        }
        int var5 = arg0.field2535;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2505[arg0.field2527] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2535 = var6;
        }
        arg0.field2543.method1936(this.method3431(arg0));
        class203 var7 = arg0.field2550;
        boolean var8 = false;
        arg0.field2541++;
        arg0.field2529 += var7.field2473;
        double var9 = (double) ((arg0.field2531 - 60 << 8) + (arg0.field2535 * arg0.field2530 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2475 > 0) {
            if (var7.field2478 > 0) {
                arg0.field2536 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2478 * var9) + 0.5D);
            } else {
                arg0.field2536 += 128;
            }
        }
        if (var7.field2479 != null) {
            if (var7.field2476 > 0) {
                arg0.field2537 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2476 * var9) + 0.5D);
            } else {
                arg0.field2537 += 128;
            }
            while (arg0.field2546 < var7.field2479.length - 2 && arg0.field2537 > (var7.field2479[arg0.field2546 + 2] & 0xFF) << 8) {
                arg0.field2546 += 2;
            }
            if (arg0.field2546 == var7.field2479.length - 2 && var7.field2479[arg0.field2546 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2539 >= 0 && var7.field2474 != null && (this.field2508[arg0.field2527] & 0x1) == 0 && (arg0.field2525 < 0 || this.field2515[arg0.field2527][arg0.field2525] != arg0)) {
            if (var7.field2482 > 0) {
                arg0.field2539 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2482 * var9) + 0.5D);
            } else {
                arg0.field2539 += 128;
            }
            while (arg0.field2532 < var7.field2474.length - 2 && arg0.field2539 > (var7.field2474[arg0.field2532 + 2] & 0xFF) << 8) {
                arg0.field2532 += 2;
            }
            if (arg0.field2532 == var7.field2474.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2543.method1987(arg0.field2544, this.method3432(arg0), this.method3433(arg0));
            return false;
        }
        arg0.field2543.method1949(arg0.field2544);
        if (arg1 == null) {
            arg0.field2543.method1713(arg3);
        } else {
            arg0.field2543.method1711(arg1, arg2, arg3);
        }
        if (arg0.field2543.method1952()) {
            this.field2522.field2574.method1728(arg0.field2543);
        }
        arg0.method3509();
        if (arg0.field2539 >= 0) {
            arg0.method3304();
            if (arg0.field2525 > 0 && this.field2515[arg0.field2527][arg0.field2525] == arg0) {
                this.field2515[arg0.field2527][arg0.field2525] = null;
            }
        }
        return true;
    }
}
