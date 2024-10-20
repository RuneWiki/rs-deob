package deob;

@ObfuscatedName("gl")
public class class206 extends class121 {

    @ObfuscatedName("gl.e")
    public class192 field2524 = new class192(128);

    @ObfuscatedName("gl.n")
    public int field2496 = 256;

    @ObfuscatedName("gl.g")
    public int field2514 = 1000000;

    @ObfuscatedName("gl.y")
    public int[] field2498 = new int[16];

    @ObfuscatedName("gl.k")
    public int[] field2499 = new int[16];

    @ObfuscatedName("gl.v")
    public int[] field2500 = new int[16];

    @ObfuscatedName("gl.z")
    public int[] field2505 = new int[16];

    @ObfuscatedName("gl.r")
    public int[] field2501 = new int[16];

    @ObfuscatedName("gl.u")
    public int[] field2503 = new int[16];

    @ObfuscatedName("gl.d")
    public int[] field2504 = new int[16];

    @ObfuscatedName("gl.o")
    public int[] field2515 = new int[16];

    @ObfuscatedName("gl.l")
    public int[] field2506 = new int[16];

    @ObfuscatedName("gl.p")
    public int[] field2526 = new int[16];

    @ObfuscatedName("gl.f")
    public int[] field2497 = new int[16];

    @ObfuscatedName("gl.b")
    public int[] field2510 = new int[16];

    @ObfuscatedName("gl.x")
    public int[] field2511 = new int[16];

    @ObfuscatedName("gl.i")
    public int[] field2512 = new int[16];

    @ObfuscatedName("gl.j")
    public int[] field2509 = new int[16];

    @ObfuscatedName("gl.q")
    public class207[][] field2495 = new class207[16][128];

    @ObfuscatedName("gl.ag")
    public class207[][] field2508 = new class207[16][128];

    @ObfuscatedName("gl.ay")
    public class208 field2516 = new class208();

    @ObfuscatedName("gl.au")
    public boolean field2513;

    @ObfuscatedName("gl.ah")
    public int field2518;

    @ObfuscatedName("gl.ao")
    public int field2519;

    @ObfuscatedName("gl.al")
    public long field2520;

    @ObfuscatedName("gl.ae")
    public long field2521;

    @ObfuscatedName("gl.ax")
    public class210 field2522 = new class210(this);

    public class206() {
        this.method3466();
    }

    @ObfuscatedName("gl.e(IS)V")
    public synchronized void method3474(int arg0) {
        this.field2496 = arg0;
    }

    @ObfuscatedName("gl.n(I)I")
    public int method3448() {
        return this.field2496;
    }

    @ObfuscatedName("gl.g(Lhu;Lit;Ldp;IB)Z")
    public synchronized boolean method3449(class211 arg0, class237 arg1, class114 arg2, int arg3) {
        arg0.method3628();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class201 var7 = (class201) arg0.field2576.method3295(); var7 != null; var7 = (class201) arg0.field2576.method3302()) {
            int var8 = (int) var7.field2451;
            class209 var9 = (class209) this.field2524.method3294((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method3823(var8);
                class209 var11;
                if (var10 == null) {
                    var11 = null;
                } else {
                    var11 = new class209(var10);
                }
                var9 = var11;
                if (var11 == null) {
                    var5 = false;
                    continue;
                }
                this.field2524.method3293(var11, (long) var8);
            }
            if (!var9.method3611(arg2, var7.field2467, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3630();
        }
        return var5;
    }

    @ObfuscatedName("gl.y(I)V")
    public synchronized void method3450() {
        for (class209 var1 = (class209) this.field2524.method3295(); var1 != null; var1 = (class209) this.field2524.method3302()) {
            var1.method3612();
        }
    }

    @ObfuscatedName("gl.w(B)V")
    public synchronized void method3451() {
        for (class209 var1 = (class209) this.field2524.method3295(); var1 != null; var1 = (class209) this.field2524.method3302()) {
            var1.method3333();
        }
    }

    @ObfuscatedName("gl.u(Lhu;ZI)V")
    public synchronized void method3452(class211 arg0, boolean arg1) {
        this.method3479();
        this.field2516.method3552(arg0.field2577);
        this.field2513 = arg1;
        this.field2520 = 0L;
        int var3 = this.field2516.method3555();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2516.method3556(var4);
            this.field2516.method3562(var4);
            this.field2516.method3571(var4);
        }
        this.field2518 = this.field2516.method3564();
        this.field2519 = this.field2516.field2553[this.field2518];
        this.field2521 = this.field2516.method3563(this.field2519);
    }

    @ObfuscatedName("gl.o(I)V")
    public synchronized void method3479() {
        this.field2516.method3561();
        this.method3466();
    }

    @ObfuscatedName("gl.s(B)Z")
    public synchronized boolean method3454() {
        return this.field2516.method3554();
    }

    @ObfuscatedName("gl.c(IIB)V")
    public synchronized void method3455(int arg0, int arg1) {
        this.method3456(arg0, arg1);
    }

    @ObfuscatedName("gl.m(IIB)V")
    public void method3456(int arg0, int arg1) {
        this.field2505[arg0] = arg1;
        this.field2503[arg0] = arg1 & 0xFFFFFF80;
        this.method3457(arg0, arg1);
    }

    @ObfuscatedName("gl.a(IIB)V")
    public void method3457(int arg0, int arg1) {
        if (this.field2501[arg0] != arg1) {
            this.field2501[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2508[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("gl.t(IIII)V")
    public void method3458(int arg0, int arg1, int arg2) {
        this.method3460(arg0, arg1, 64);
        if ((this.field2526[arg0] & 0x2) != 0) {
            for (class207 var4 = (class207) this.field2522.field2573.method3349(); var4 != null; var4 = (class207) this.field2522.field2573.method3351()) {
                if (var4.field2529 == arg0 && var4.field2533 < 0) {
                    this.field2495[arg0][var4.field2531] = null;
                    this.field2495[arg0][arg1] = var4;
                    int var5 = (var4.field2537 * var4.field2532 >> 12) + var4.field2535;
                    var4.field2535 += arg1 - var4.field2531 << 8;
                    var4.field2532 = var5 - var4.field2535;
                    var4.field2537 = 4096;
                    var4.field2531 = arg1;
                    return;
                }
            }
        }
        class209 var6 = (class209) this.field2524.method3294((long) this.field2501[arg0]);
        if (var6 == null) {
            return;
        }
        class109 var7 = var6.field2563[arg1];
        if (var7 == null) {
            return;
        }
        class207 var8 = new class207();
        var8.field2529 = arg0;
        var8.field2528 = var6;
        var8.field2536 = var7;
        var8.field2530 = var6.field2571[arg1];
        var8.field2541 = var6.field2568[arg1];
        var8.field2531 = arg1;
        var8.field2527 = var6.field2567 * arg2 * arg2 * var6.field2565[arg1] + 1024 >> 11;
        var8.field2534 = var6.field2566[arg1] & 0xFF;
        var8.field2535 = (arg1 << 8) - (var6.field2564[arg1] & 0x7FFF);
        var8.field2538 = 0;
        var8.field2539 = 0;
        var8.field2540 = 0;
        var8.field2533 = -1;
        var8.field2542 = 0;
        if (this.field2511[arg0] == 0) {
            var8.field2545 = class119.method2046(var7, this.method3471(var8), this.method3519(var8), this.method3473(var8));
        } else {
            var8.field2545 = class119.method2046(var7, this.method3471(var8), 0, this.method3473(var8));
            this.method3459(var8, var6.field2564[arg1] < 0);
        }
        if (var6.field2564[arg1] < 0) {
            var8.field2545.method2105(-1);
        }
        if (var8.field2541 >= 0) {
            class207 var9 = this.field2508[arg0][var8.field2541];
            if (var9 != null && var9.field2533 < 0) {
                this.field2495[arg0][var9.field2531] = null;
                var9.field2533 = 0;
            }
            this.field2508[arg0][var8.field2541] = var8;
        }
        this.field2522.field2573.method3379(var8);
        this.field2495[arg0][arg1] = var8;
    }

    @ObfuscatedName("gl.p(Lgn;ZI)V")
    public void method3459(class207 arg0, boolean arg1) {
        int var3 = arg0.field2536.field1601.length;
        int var5;
        if (arg1 && arg0.field2536.field1604) {
            int var4 = var3 + var3 - arg0.field2536.field1603;
            var5 = (int) ((long) this.field2511[arg0.field2529] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2545.method2051(true);
            }
        } else {
            var5 = (int) ((long) this.field2511[arg0.field2529] * (long) var3 >> 6);
        }
        arg0.field2545.method1987(var5);
    }

    @ObfuscatedName("gl.f(IIII)V")
    public void method3460(int arg0, int arg1, int arg2) {
        class207 var4 = this.field2495[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2495[arg0][arg1] = null;
        if ((this.field2526[arg0] & 0x2) == 0) {
            var4.field2533 = 0;
            return;
        }
        for (class207 var5 = (class207) this.field2522.field2573.method3348(); var5 != null; var5 = (class207) this.field2522.field2573.method3350()) {
            if (var4.field2529 == var5.field2529 && var5.field2533 < 0 && var4 != var5) {
                var4.field2533 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("gl.x(IIII)V")
    public void method3486(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("gl.q(III)V")
    public void method3533(int arg0, int arg1) {
    }

    @ObfuscatedName("gl.az(IIB)V")
    public void method3498(int arg0, int arg1) {
        this.field2504[arg0] = arg1;
    }

    @ObfuscatedName("gl.aw(II)V")
    public void method3463(int arg0) {
        for (class207 var2 = (class207) this.field2522.field2573.method3348(); var2 != null; var2 = (class207) this.field2522.field2573.method3350()) {
            if (arg0 < 0 || var2.field2529 == arg0) {
                if (var2.field2545 != null) {
                    var2.field2545.method1992(Statics.field1618 / 100);
                    if (var2.field2545.method1996()) {
                        this.field2522.field2574.method1769(var2.field2545);
                    }
                    var2.method3546();
                }
                if (var2.field2533 < 0) {
                    this.field2495[var2.field2529][var2.field2531] = null;
                }
                var2.method3333();
            }
        }
    }

    @ObfuscatedName("gl.ac(II)V")
    public void method3506(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3506(var2);
            }
            return;
        }
        this.field2498[arg0] = 12800;
        this.field2499[arg0] = 8192;
        this.field2500[arg0] = 16383;
        this.field2504[arg0] = 8192;
        this.field2515[arg0] = 0;
        this.field2506[arg0] = 8192;
        this.method3467(arg0);
        this.method3530(arg0);
        this.field2526[arg0] = 0;
        this.field2497[arg0] = 32767;
        this.field2510[arg0] = 256;
        this.field2511[arg0] = 0;
        this.method3470(arg0, 8192);
    }

    @ObfuscatedName("gl.ak(IB)V")
    public void method3465(int arg0) {
        for (class207 var2 = (class207) this.field2522.field2573.method3348(); var2 != null; var2 = (class207) this.field2522.field2573.method3350()) {
            if ((arg0 < 0 || var2.field2529 == arg0) && var2.field2533 < 0) {
                this.field2495[var2.field2529][var2.field2531] = null;
                var2.field2533 = 0;
            }
        }
    }

    @ObfuscatedName("gl.ad(B)V")
    public void method3466() {
        this.method3463(-1);
        this.method3506(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2501[var1] = this.field2505[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2503[var2] = this.field2505[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("gl.at(IB)V")
    public void method3467(int arg0) {
        if ((this.field2526[arg0] & 0x2) == 0) {
            return;
        }
        for (class207 var2 = (class207) this.field2522.field2573.method3348(); var2 != null; var2 = (class207) this.field2522.field2573.method3350()) {
            if (var2.field2529 == arg0 && this.field2495[arg0][var2.field2531] == null && var2.field2533 < 0) {
                var2.field2533 = 0;
            }
        }
    }

    @ObfuscatedName("gl.am(II)V")
    public void method3530(int arg0) {
        if ((this.field2526[arg0] & 0x4) == 0) {
            return;
        }
        for (class207 var2 = (class207) this.field2522.field2573.method3348(); var2 != null; var2 = (class207) this.field2522.field2573.method3350()) {
            if (var2.field2529 == arg0) {
                var2.field2547 = 0;
            }
        }
    }

    @ObfuscatedName("gl.aq(II)V")
    public void method3536(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3460(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3458(var6, var7, var8);
            } else {
                this.method3460(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3486(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2503[var12] = (var14 << 14) + (this.field2503[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2503[var12] = (var14 << 7) + (this.field2503[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2515[var12] = (var14 << 7) + (this.field2515[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2515[var12] = (this.field2515[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2506[var12] = (var14 << 7) + (this.field2506[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2506[var12] = (this.field2506[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2498[var12] = (var14 << 7) + (this.field2498[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2498[var12] = (this.field2498[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2499[var12] = (var14 << 7) + (this.field2499[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2499[var12] = (this.field2499[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2500[var12] = (var14 << 7) + (this.field2500[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2500[var12] = (this.field2500[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2526[var12] |= 0x1;
                } else {
                    this.field2526[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2526[var12] |= 0x2;
                } else {
                    this.method3467(var12);
                    this.field2526[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2497[var12] = (var14 << 7) + (this.field2497[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2497[var12] = (this.field2497[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2497[var12] = (var14 << 7) + (this.field2497[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2497[var12] = (this.field2497[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3463(var12);
            }
            if (var13 == 121) {
                this.method3506(var12);
            }
            if (var13 == 123) {
                this.method3465(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2497[var12];
                if (var15 == 16384) {
                    this.field2510[var12] = (var14 << 7) + (this.field2510[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2497[var12];
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
                    this.field2526[var12] |= 0x4;
                } else {
                    this.method3530(var12);
                    this.field2526[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3470(var12, (var14 << 7) + (this.field2512[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3470(var12, (this.field2512[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3457(var17, this.field2503[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3533(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method3498(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3466();
            }
        }
    }

    @ObfuscatedName("gl.as(III)V")
    public void method3470(int arg0, int arg1) {
        this.field2512[arg0] = arg1;
        this.field2509[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("gl.ab(Lgn;B)I")
    public int method3471(class207 arg0) {
        int var2 = (arg0.field2537 * arg0.field2532 >> 12) + arg0.field2535;
        int var3 = ((this.field2504[arg0.field2529] - 8192) * this.field2510[arg0.field2529] >> 12) + var2;
        class204 var4 = arg0.field2530;
        if (var4.field2479 > 0 && (var4.field2478 > 0 || this.field2515[arg0.field2529] > 0)) {
            int var5 = var4.field2478 << 2;
            int var6 = var4.field2476 << 1;
            if (arg0.field2543 < var6) {
                var5 = arg0.field2543 * var5 / var6;
            }
            int var7 = (this.field2515[arg0.field2529] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2544 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2536.field1602 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1618 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("gl.ap(Lgn;I)I")
    public int method3519(class207 arg0) {
        class204 var2 = arg0.field2530;
        int var3 = this.field2500[arg0.field2529] * this.field2498[arg0.field2529] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2527 * var4 + 16384 >> 15;
        int var6 = this.field2496 * var5 + 128 >> 8;
        if (var2.field2474 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2538 * 1.953125E-5D * (double) var2.field2474) + 0.5D);
        }
        if (var2.field2472 != null) {
            int var7 = arg0.field2539;
            int var8 = var2.field2472[arg0.field2540 + 1];
            if (arg0.field2540 < var2.field2472.length - 2) {
                int var9 = (var2.field2472[arg0.field2540] & 0xFF) << 8;
                int var10 = (var2.field2472[arg0.field2540 + 2] & 0xFF) << 8;
                var8 += (var2.field2472[arg0.field2540 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2533 > 0 && var2.field2473 != null) {
            int var11 = arg0.field2533;
            int var12 = var2.field2473[arg0.field2542 + 1];
            if (arg0.field2542 < var2.field2473.length - 2) {
                int var13 = (var2.field2473[arg0.field2542] & 0xFF) << 8;
                int var14 = (var2.field2473[arg0.field2542 + 2] & 0xFF) << 8;
                var12 += (var2.field2473[arg0.field2542 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("gl.ai(Lgn;B)I")
    public int method3473(class207 arg0) {
        int var2 = this.field2499[arg0.field2529];
        return var2 < 8192 ? arg0.field2534 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2534) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("gl.k()Ldl;")
    public synchronized class121 method1774() {
        return this.field2522;
    }

    @ObfuscatedName("gl.v()Ldl;")
    public synchronized class121 method1775() {
        return null;
    }

    @ObfuscatedName("gl.z()I")
    public synchronized int method1776() {
        return 0;
    }

    @ObfuscatedName("gl.r([III)V")
    public synchronized void method1777(int[] arg0, int arg1, int arg2) {
        if (this.field2516.method3554()) {
            int var4 = this.field2514 * this.field2516.field2549 / Statics.field1618;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2520;
                if (this.field2521 - var5 >= 0L) {
                    this.field2520 = var5;
                    break;
                }
                int var7 = (int) ((this.field2521 - this.field2520 + (long) var4 - 1L) / (long) var4);
                this.field2520 += (long) var4 * (long) var7;
                this.field2522.method1777(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3476();
            } while (this.field2516.method3554());
        }
        this.field2522.method1777(arg0, arg1, arg2);
    }

    @ObfuscatedName("gl.d(I)V")
    public synchronized void method1791(int arg0) {
        if (this.field2516.method3554()) {
            int var2 = this.field2514 * this.field2516.field2549 / Statics.field1618;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2520;
                if (this.field2521 - var3 >= 0L) {
                    this.field2520 = var3;
                    break;
                }
                int var5 = (int) ((this.field2521 - this.field2520 + (long) var2 - 1L) / (long) var2);
                this.field2520 += (long) var2 * (long) var5;
                this.field2522.method1791(var5);
                arg0 -= var5;
                this.method3476();
            } while (this.field2516.method3554());
        }
        this.field2522.method1791(arg0);
    }

    @ObfuscatedName("gl.an(I)V")
    public void method3476() {
        int var1 = this.field2518;
        int var2 = this.field2519;
        long var3 = this.field2521;
        while (this.field2519 == var2) {
            while (this.field2516.field2553[var1] == var2) {
                this.field2516.method3556(var1);
                int var5 = this.field2516.method3560(var1);
                if (var5 == 1) {
                    this.field2516.method3558();
                    this.field2516.method3571(var1);
                    if (this.field2516.method3565()) {
                        if (!this.field2513 || var2 == 0) {
                            this.method3466();
                            this.field2516.method3561();
                            return;
                        }
                        this.field2516.method3566(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3536(var5);
                }
                this.field2516.method3562(var1);
                this.field2516.method3571(var1);
            }
            var1 = this.field2516.method3564();
            var2 = this.field2516.field2553[var1];
            var3 = this.field2516.method3563(var2);
        }
        this.field2518 = var1;
        this.field2519 = var2;
        this.field2521 = var3;
    }

    @ObfuscatedName("gl.ar(Lgn;I)Z")
    public boolean method3487(class207 arg0) {
        if (arg0.field2545 != null) {
            return false;
        }
        if (arg0.field2533 >= 0) {
            arg0.method3333();
            if (arg0.field2541 > 0 && this.field2508[arg0.field2529][arg0.field2541] == arg0) {
                this.field2508[arg0.field2529][arg0.field2541] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("gl.aj(Lgn;[IIII)Z")
    public boolean method3478(class207 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2546 = Statics.field1618 / 100;
        if (arg0.field2533 >= 0 && arg0.field2545 == null || arg0.field2545.method1995()) {
            arg0.method3546();
            arg0.method3333();
            if (arg0.field2541 > 0 && this.field2508[arg0.field2529][arg0.field2541] == arg0) {
                this.field2508[arg0.field2529][arg0.field2541] = null;
            }
            return true;
        }
        int var5 = arg0.field2537;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2506[arg0.field2529] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2537 = var6;
        }
        arg0.field2545.method1993(this.method3471(arg0));
        class204 var7 = arg0.field2530;
        boolean var8 = false;
        arg0.field2543++;
        arg0.field2544 += var7.field2479;
        double var9 = (double) ((arg0.field2531 - 60 << 8) + (arg0.field2537 * arg0.field2532 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2474 > 0) {
            if (var7.field2480 > 0) {
                arg0.field2538 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2480 * var9) + 0.5D);
            } else {
                arg0.field2538 += 128;
            }
        }
        if (var7.field2472 != null) {
            if (var7.field2475 > 0) {
                arg0.field2539 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2475 * var9) + 0.5D);
            } else {
                arg0.field2539 += 128;
            }
            while (arg0.field2540 < var7.field2472.length - 2 && arg0.field2539 > (var7.field2472[arg0.field2540 + 2] & 0xFF) << 8) {
                arg0.field2540 += 2;
            }
            if (arg0.field2540 == var7.field2472.length - 2 && var7.field2472[arg0.field2540 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2533 >= 0 && var7.field2473 != null && (this.field2526[arg0.field2529] & 0x1) == 0 && (arg0.field2541 < 0 || this.field2508[arg0.field2529][arg0.field2541] != arg0)) {
            if (var7.field2481 > 0) {
                arg0.field2533 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2481 * var9) + 0.5D);
            } else {
                arg0.field2533 += 128;
            }
            while (arg0.field2542 < var7.field2473.length - 2 && arg0.field2533 > (var7.field2473[arg0.field2542 + 2] & 0xFF) << 8) {
                arg0.field2542 += 2;
            }
            if (arg0.field2542 == var7.field2473.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2545.method1991(arg0.field2546, this.method3519(arg0), this.method3473(arg0));
            return false;
        }
        arg0.field2545.method1992(arg0.field2546);
        if (arg1 == null) {
            arg0.field2545.method1791(arg3);
        } else {
            arg0.field2545.method1777(arg1, arg2, arg3);
        }
        if (arg0.field2545.method1996()) {
            this.field2522.field2574.method1769(arg0.field2545);
        }
        arg0.method3546();
        if (arg0.field2533 >= 0) {
            arg0.method3333();
            if (arg0.field2541 > 0 && this.field2508[arg0.field2529][arg0.field2541] == arg0) {
                this.field2508[arg0.field2529][arg0.field2541] = null;
            }
        }
        return true;
    }
}
