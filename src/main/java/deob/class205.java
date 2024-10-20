package deob;

@ObfuscatedName("gl")
public class class205 extends class120 {

    @ObfuscatedName("gl.c")
    public class191 field2478 = new class191(128);

    @ObfuscatedName("gl.o")
    public int field2490 = 256;

    @ObfuscatedName("gl.i")
    public int field2503 = 1000000;

    @ObfuscatedName("gl.u")
    public int[] field2481 = new int[16];

    @ObfuscatedName("gl.g")
    public int[] field2480 = new int[16];

    @ObfuscatedName("gl.m")
    public int[] field2494 = new int[16];

    @ObfuscatedName("gl.s")
    public int[] field2484 = new int[16];

    @ObfuscatedName("gl.x")
    public int[] field2479 = new int[16];

    @ObfuscatedName("gl.p")
    public int[] field2486 = new int[16];

    @ObfuscatedName("gl.k")
    public int[] field2487 = new int[16];

    @ObfuscatedName("gl.r")
    public int[] field2488 = new int[16];

    @ObfuscatedName("gl.v")
    public int[] field2489 = new int[16];

    @ObfuscatedName("gl.q")
    public int[] field2491 = new int[16];

    @ObfuscatedName("gl.f")
    public int[] field2492 = new int[16];

    @ObfuscatedName("gl.j")
    public int[] field2493 = new int[16];

    @ObfuscatedName("gl.n")
    public int[] field2485 = new int[16];

    @ObfuscatedName("gl.z")
    public int[] field2483 = new int[16];

    @ObfuscatedName("gl.b")
    public int[] field2496 = new int[16];

    @ObfuscatedName("gl.d")
    public class206[][] field2497 = new class206[16][128];

    @ObfuscatedName("gl.ap")
    public class206[][] field2498 = new class206[16][128];

    @ObfuscatedName("gl.aj")
    public class207 field2482 = new class207();

    @ObfuscatedName("gl.am")
    public boolean field2500;

    @ObfuscatedName("gl.ag")
    public int field2495;

    @ObfuscatedName("gl.av")
    public int field2502;

    @ObfuscatedName("gl.al")
    public long field2499;

    @ObfuscatedName("gl.ab")
    public long field2501;

    @ObfuscatedName("gl.af")
    public class209 field2505 = new class209(this);

    public class205() {
        this.method3408();
    }

    @ObfuscatedName("gl.c(II)V")
    public synchronized void method3391(int arg0) {
        this.field2490 = arg0;
    }

    @ObfuscatedName("gl.o(I)I")
    public int method3392() {
        return this.field2490;
    }

    @ObfuscatedName("gl.i(Lht;Lip;Ldt;IB)Z")
    public synchronized boolean method3393(class210 arg0, class236 arg1, class113 arg2, int arg3) {
        arg0.method3566();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class200 var7 = (class200) arg0.field2564.method3241(); var7 != null; var7 = (class200) arg0.field2564.method3242()) {
            int var8 = (int) var7.field2437;
            class208 var9 = (class208) this.field2478.method3251((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method3720(var8);
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
                this.field2478.method3239(var11, (long) var8);
            }
            if (!var9.method3550(arg2, var7.field2453, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3567();
        }
        return var5;
    }

    @ObfuscatedName("gl.u(I)V")
    public synchronized void method3427() {
        for (class208 var1 = (class208) this.field2478.method3241(); var1 != null; var1 = (class208) this.field2478.method3242()) {
            var1.method3551();
        }
    }

    @ObfuscatedName("gl.g(I)V")
    public synchronized void method3395() {
        for (class208 var1 = (class208) this.field2478.method3241(); var1 != null; var1 = (class208) this.field2478.method3242()) {
            var1.method3287();
        }
    }

    @ObfuscatedName("gl.k(Lht;ZI)V")
    public synchronized void method3396(class210 arg0, boolean arg1) {
        this.method3397();
        this.field2482.method3499(arg0.field2565);
        this.field2500 = arg1;
        this.field2499 = 0L;
        int var3 = this.field2482.method3502();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2482.method3533(var4);
            this.field2482.method3506(var4);
            this.field2482.method3498(var4);
        }
        this.field2495 = this.field2482.method3511();
        this.field2502 = this.field2482.field2539[this.field2495];
        this.field2501 = this.field2482.method3510(this.field2502);
    }

    @ObfuscatedName("gl.w(I)V")
    public synchronized void method3397() {
        this.field2482.method3501();
        this.method3408();
    }

    @ObfuscatedName("gl.v(I)Z")
    public synchronized boolean method3398() {
        return this.field2482.method3523();
    }

    @ObfuscatedName("gl.h(IIB)V")
    public synchronized void method3399(int arg0, int arg1) {
        this.method3400(arg0, arg1);
    }

    @ObfuscatedName("gl.t(III)V")
    public void method3400(int arg0, int arg1) {
        this.field2484[arg0] = arg1;
        this.field2486[arg0] = arg1 & 0xFFFFFF80;
        this.method3401(arg0, arg1);
    }

    @ObfuscatedName("gl.l(III)V")
    public void method3401(int arg0, int arg1) {
        if (this.field2479[arg0] != arg1) {
            this.field2479[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2498[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("gl.q(IIIS)V")
    public void method3480(int arg0, int arg1, int arg2) {
        this.method3403(arg0, arg1, 64);
        if ((this.field2491[arg0] & 0x2) != 0) {
            for (class206 var4 = (class206) this.field2505.field2556.method3297(); var4 != null; var4 = (class206) this.field2505.field2556.method3304()) {
                if (var4.field2527 == arg0 && var4.field2523 < 0) {
                    this.field2497[arg0][var4.field2514] = null;
                    this.field2497[arg0][arg1] = var4;
                    int var5 = (var4.field2519 * var4.field2509 >> 12) + var4.field2517;
                    var4.field2517 += arg1 - var4.field2514 << 8;
                    var4.field2509 = var5 - var4.field2517;
                    var4.field2519 = 4096;
                    var4.field2514 = arg1;
                    return;
                }
            }
        }
        class208 var6 = (class208) this.field2478.method3251((long) this.field2479[arg0]);
        if (var6 == null) {
            return;
        }
        class108 var7 = var6.field2548[arg1];
        if (var7 == null) {
            return;
        }
        class206 var8 = new class206();
        var8.field2527 = arg0;
        var8.field2510 = var6;
        var8.field2518 = var7;
        var8.field2512 = var6.field2550[arg1];
        var8.field2528 = var6.field2551[arg1];
        var8.field2514 = arg1;
        var8.field2515 = var6.field2547 * arg2 * arg2 * var6.field2545[arg1] + 1024 >> 11;
        var8.field2516 = var6.field2546[arg1] & 0xFF;
        var8.field2517 = (arg1 << 8) - (var6.field2549[arg1] & 0x7FFF);
        var8.field2520 = 0;
        var8.field2521 = 0;
        var8.field2522 = 0;
        var8.field2523 = -1;
        var8.field2526 = 0;
        if (this.field2485[arg0] == 0) {
            var8.field2511 = class118.method1893(var7, this.method3441(var8), this.method3414(var8), this.method3415(var8));
        } else {
            var8.field2511 = class118.method1893(var7, this.method3441(var8), 0, this.method3415(var8));
            this.method3402(var8, var6.field2549[arg1] < 0);
        }
        if (var6.field2549[arg1] < 0) {
            var8.field2511.method1895(-1);
        }
        if (var8.field2528 >= 0) {
            class206 var9 = this.field2498[arg0][var8.field2528];
            if (var9 != null && var9.field2523 < 0) {
                this.field2497[arg0][var9.field2514] = null;
                var9.field2523 = 0;
            }
            this.field2498[arg0][var8.field2528] = var8;
        }
        this.field2505.field2556.method3290(var8);
        this.field2497[arg0][arg1] = var8;
    }

    @ObfuscatedName("gl.f(Lgz;ZI)V")
    public void method3402(class206 arg0, boolean arg1) {
        int var3 = arg0.field2518.field1577.length;
        int var5;
        if (arg1 && arg0.field2518.field1576) {
            int var4 = var3 + var3 - arg0.field2518.field1578;
            var5 = (int) ((long) this.field2485[arg0.field2527] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2511.method1902(true);
            }
        } else {
            var5 = (int) ((long) this.field2485[arg0.field2527] * (long) var3 >> 6);
        }
        arg0.field2511.method1901(var5);
    }

    @ObfuscatedName("gl.j(IIIB)V")
    public void method3403(int arg0, int arg1, int arg2) {
        class206 var4 = this.field2497[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2497[arg0][arg1] = null;
        if ((this.field2491[arg0] & 0x2) == 0) {
            var4.field2523 = 0;
            return;
        }
        for (class206 var5 = (class206) this.field2505.field2556.method3296(); var5 != null; var5 = (class206) this.field2505.field2556.method3298()) {
            if (var4.field2527 == var5.field2527 && var5.field2523 < 0 && var4 != var5) {
                var4.field2523 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("gl.n(IIII)V")
    public void method3463(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("gl.z(III)V")
    public void method3488(int arg0, int arg1) {
    }

    @ObfuscatedName("gl.ap(III)V")
    public void method3436(int arg0, int arg1) {
        this.field2487[arg0] = arg1;
    }

    @ObfuscatedName("gl.aj(II)V")
    public void method3405(int arg0) {
        for (class206 var2 = (class206) this.field2505.field2556.method3296(); var2 != null; var2 = (class206) this.field2505.field2556.method3298()) {
            if (arg0 < 0 || var2.field2527 == arg0) {
                if (var2.field2511 != null) {
                    var2.field2511.method1905(Statics.field1276 / 100);
                    if (var2.field2511.method1909()) {
                        this.field2505.field2557.method1673(var2.field2511);
                    }
                    var2.method3490();
                }
                if (var2.field2523 < 0) {
                    this.field2497[var2.field2527][var2.field2514] = null;
                }
                var2.method3287();
            }
        }
    }

    @ObfuscatedName("gl.af(II)V")
    public void method3406(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3406(var2);
            }
            return;
        }
        this.field2481[arg0] = 12800;
        this.field2480[arg0] = 8192;
        this.field2494[arg0] = 16383;
        this.field2487[arg0] = 8192;
        this.field2488[arg0] = 0;
        this.field2489[arg0] = 8192;
        this.method3409(arg0);
        this.method3410(arg0);
        this.field2491[arg0] = 0;
        this.field2492[arg0] = 32767;
        this.field2493[arg0] = 256;
        this.field2485[arg0] = 0;
        this.method3412(arg0, 8192);
    }

    @ObfuscatedName("gl.ak(IB)V")
    public void method3413(int arg0) {
        for (class206 var2 = (class206) this.field2505.field2556.method3296(); var2 != null; var2 = (class206) this.field2505.field2556.method3298()) {
            if ((arg0 < 0 || var2.field2527 == arg0) && var2.field2523 < 0) {
                this.field2497[var2.field2527][var2.field2514] = null;
                var2.field2523 = 0;
            }
        }
    }

    @ObfuscatedName("gl.ar(I)V")
    public void method3408() {
        this.method3405(-1);
        this.method3406(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2479[var1] = this.field2484[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2486[var2] = this.field2484[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("gl.an(II)V")
    public void method3409(int arg0) {
        if ((this.field2491[arg0] & 0x2) == 0) {
            return;
        }
        for (class206 var2 = (class206) this.field2505.field2556.method3296(); var2 != null; var2 = (class206) this.field2505.field2556.method3298()) {
            if (var2.field2527 == arg0 && this.field2497[arg0][var2.field2514] == null && var2.field2523 < 0) {
                var2.field2523 = 0;
            }
        }
    }

    @ObfuscatedName("gl.ae(II)V")
    public void method3410(int arg0) {
        if ((this.field2491[arg0] & 0x4) == 0) {
            return;
        }
        for (class206 var2 = (class206) this.field2505.field2556.method3296(); var2 != null; var2 = (class206) this.field2505.field2556.method3298()) {
            if (var2.field2527 == arg0) {
                var2.field2529 = 0;
            }
        }
    }

    @ObfuscatedName("gl.ah(II)V")
    public void method3407(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3403(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3480(var6, var7, var8);
            } else {
                this.method3403(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3463(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2486[var12] = (var14 << 14) + (this.field2486[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2486[var12] = (var14 << 7) + (this.field2486[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2488[var12] = (var14 << 7) + (this.field2488[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2488[var12] = (this.field2488[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2489[var12] = (var14 << 7) + (this.field2489[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2489[var12] = (this.field2489[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2481[var12] = (var14 << 7) + (this.field2481[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2481[var12] = (this.field2481[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2480[var12] = (var14 << 7) + (this.field2480[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2480[var12] = (this.field2480[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2494[var12] = (var14 << 7) + (this.field2494[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2494[var12] = (this.field2494[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2491[var12] |= 0x1;
                } else {
                    this.field2491[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2491[var12] |= 0x2;
                } else {
                    this.method3409(var12);
                    this.field2491[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2492[var12] = (var14 << 7) + (this.field2492[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2492[var12] = (this.field2492[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2492[var12] = (var14 << 7) + (this.field2492[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2492[var12] = (this.field2492[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3405(var12);
            }
            if (var13 == 121) {
                this.method3406(var12);
            }
            if (var13 == 123) {
                this.method3413(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2492[var12];
                if (var15 == 16384) {
                    this.field2493[var12] = (var14 << 7) + (this.field2493[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2492[var12];
                if (var16 == 16384) {
                    this.field2493[var12] = (this.field2493[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2485[var12] = (var14 << 7) + (this.field2485[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2485[var12] = (this.field2485[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2491[var12] |= 0x4;
                } else {
                    this.method3410(var12);
                    this.field2491[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3412(var12, (var14 << 7) + (this.field2483[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3412(var12, (this.field2483[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3401(var17, this.field2486[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3488(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method3436(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3408();
            }
        }
    }

    @ObfuscatedName("gl.ax(IIB)V")
    public void method3412(int arg0, int arg1) {
        this.field2483[arg0] = arg1;
        this.field2496[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("gl.ai(Lgz;I)I")
    public int method3441(class206 arg0) {
        int var2 = (arg0.field2519 * arg0.field2509 >> 12) + arg0.field2517;
        int var3 = ((this.field2487[arg0.field2527] - 8192) * this.field2493[arg0.field2527] >> 12) + var2;
        class203 var4 = arg0.field2512;
        if (var4.field2467 > 0 && (var4.field2465 > 0 || this.field2488[arg0.field2527] > 0)) {
            int var5 = var4.field2465 << 2;
            int var6 = var4.field2466 << 1;
            if (arg0.field2525 < var6) {
                var5 = arg0.field2525 * var5 / var6;
            }
            int var7 = (this.field2488[arg0.field2527] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2513 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2518.field1580 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1276 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("gl.aq(Lgz;I)I")
    public int method3414(class206 arg0) {
        class203 var2 = arg0.field2512;
        int var3 = this.field2494[arg0.field2527] * this.field2481[arg0.field2527] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2515 * var4 + 16384 >> 15;
        int var6 = this.field2490 * var5 + 128 >> 8;
        if (var2.field2460 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2520 * 1.953125E-5D * (double) var2.field2460) + 0.5D);
        }
        if (var2.field2468 != null) {
            int var7 = arg0.field2521;
            int var8 = var2.field2468[arg0.field2522 + 1];
            if (arg0.field2522 < var2.field2468.length - 2) {
                int var9 = (var2.field2468[arg0.field2522] & 0xFF) << 8;
                int var10 = (var2.field2468[arg0.field2522 + 2] & 0xFF) << 8;
                var8 += (var2.field2468[arg0.field2522 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2523 > 0 && var2.field2459 != null) {
            int var11 = arg0.field2523;
            int var12 = var2.field2459[arg0.field2526 + 1];
            if (arg0.field2526 < var2.field2459.length - 2) {
                int var13 = (var2.field2459[arg0.field2526] & 0xFF) << 8;
                int var14 = (var2.field2459[arg0.field2526 + 2] & 0xFF) << 8;
                var12 += (var2.field2459[arg0.field2526 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("gl.as(Lgz;B)I")
    public int method3415(class206 arg0) {
        int var2 = this.field2480[arg0.field2527];
        return var2 < 8192 ? arg0.field2516 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2516) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("gl.m()Ldk;")
    public synchronized class120 method1678() {
        return this.field2505;
    }

    @ObfuscatedName("gl.s()Ldk;")
    public synchronized class120 method1679() {
        return null;
    }

    @ObfuscatedName("gl.x()I")
    public synchronized int method1694() {
        return 0;
    }

    @ObfuscatedName("gl.p([III)V")
    public synchronized void method1681(int[] arg0, int arg1, int arg2) {
        if (this.field2482.method3523()) {
            int var4 = this.field2503 * this.field2482.field2534 / Statics.field1276;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2499;
                if (this.field2501 - var5 >= 0L) {
                    this.field2499 = var5;
                    break;
                }
                int var7 = (int) ((this.field2501 - this.field2499 + (long) var4 - 1L) / (long) var4);
                this.field2499 += (long) var4 * (long) var7;
                this.field2505.method1681(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3417();
            } while (this.field2482.method3523());
        }
        this.field2505.method1681(arg0, arg1, arg2);
    }

    @ObfuscatedName("gl.r(I)V")
    public synchronized void method1683(int arg0) {
        if (this.field2482.method3523()) {
            int var2 = this.field2503 * this.field2482.field2534 / Statics.field1276;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2499;
                if (this.field2501 - var3 >= 0L) {
                    this.field2499 = var3;
                    break;
                }
                int var5 = (int) ((this.field2501 - this.field2499 + (long) var2 - 1L) / (long) var2);
                this.field2499 += (long) var2 * (long) var5;
                this.field2505.method1683(var5);
                arg0 -= var5;
                this.method3417();
            } while (this.field2482.method3523());
        }
        this.field2505.method1683(arg0);
    }

    @ObfuscatedName("gl.au(I)V")
    public void method3417() {
        int var1 = this.field2495;
        int var2 = this.field2502;
        long var3 = this.field2501;
        while (this.field2502 == var2) {
            while (this.field2482.field2539[var1] == var2) {
                this.field2482.method3533(var1);
                int var5 = this.field2482.method3507(var1);
                if (var5 == 1) {
                    this.field2482.method3505();
                    this.field2482.method3498(var1);
                    if (this.field2482.method3512()) {
                        if (!this.field2500 || var2 == 0) {
                            this.method3408();
                            this.field2482.method3501();
                            return;
                        }
                        this.field2482.method3513(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3407(var5);
                }
                this.field2482.method3506(var1);
                this.field2482.method3498(var1);
            }
            var1 = this.field2482.method3511();
            var2 = this.field2482.field2539[var1];
            var3 = this.field2482.method3510(var2);
        }
        this.field2495 = var1;
        this.field2502 = var2;
        this.field2501 = var3;
    }

    @ObfuscatedName("gl.az(Lgz;I)Z")
    public boolean method3418(class206 arg0) {
        if (arg0.field2511 != null) {
            return false;
        }
        if (arg0.field2523 >= 0) {
            arg0.method3287();
            if (arg0.field2528 > 0 && this.field2498[arg0.field2527][arg0.field2528] == arg0) {
                this.field2498[arg0.field2527][arg0.field2528] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("gl.ay(Lgz;[IIIB)Z")
    public boolean method3419(class206 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2524 = Statics.field1276 / 100;
        if (arg0.field2523 >= 0 && arg0.field2511 == null || arg0.field2511.method1908()) {
            arg0.method3490();
            arg0.method3287();
            if (arg0.field2528 > 0 && this.field2498[arg0.field2527][arg0.field2528] == arg0) {
                this.field2498[arg0.field2527][arg0.field2528] = null;
            }
            return true;
        }
        int var5 = arg0.field2519;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2489[arg0.field2527] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2519 = var6;
        }
        arg0.field2511.method2008(this.method3441(arg0));
        class203 var7 = arg0.field2512;
        boolean var8 = false;
        arg0.field2525++;
        arg0.field2513 += var7.field2467;
        double var9 = (double) ((arg0.field2514 - 60 << 8) + (arg0.field2519 * arg0.field2509 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2460 > 0) {
            if (var7.field2463 > 0) {
                arg0.field2520 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2463 * var9) + 0.5D);
            } else {
                arg0.field2520 += 128;
            }
        }
        if (var7.field2468 != null) {
            if (var7.field2461 > 0) {
                arg0.field2521 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2461 * var9) + 0.5D);
            } else {
                arg0.field2521 += 128;
            }
            while (arg0.field2522 < var7.field2468.length - 2 && arg0.field2521 > (var7.field2468[arg0.field2522 + 2] & 0xFF) << 8) {
                arg0.field2522 += 2;
            }
            if (arg0.field2522 == var7.field2468.length - 2 && var7.field2468[arg0.field2522 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2523 >= 0 && var7.field2459 != null && (this.field2491[arg0.field2527] & 0x1) == 0 && (arg0.field2528 < 0 || this.field2498[arg0.field2527][arg0.field2528] != arg0)) {
            if (var7.field2462 > 0) {
                arg0.field2523 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2462 * var9) + 0.5D);
            } else {
                arg0.field2523 += 128;
            }
            while (arg0.field2526 < var7.field2459.length - 2 && arg0.field2523 > (var7.field2459[arg0.field2526 + 2] & 0xFF) << 8) {
                arg0.field2526 += 2;
            }
            if (arg0.field2526 == var7.field2459.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2511.method1996(arg0.field2524, this.method3414(arg0), this.method3415(arg0));
            return false;
        }
        arg0.field2511.method1905(arg0.field2524);
        if (arg1 == null) {
            arg0.field2511.method1683(arg3);
        } else {
            arg0.field2511.method1681(arg1, arg2, arg3);
        }
        if (arg0.field2511.method1909()) {
            this.field2505.field2557.method1673(arg0.field2511);
        }
        arg0.method3490();
        if (arg0.field2523 >= 0) {
            arg0.method3287();
            if (arg0.field2528 > 0 && this.field2498[arg0.field2527][arg0.field2528] == arg0) {
                this.field2498[arg0.field2527][arg0.field2528] = null;
            }
        }
        return true;
    }
}
