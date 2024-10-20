package deob;

@ObfuscatedName("hn")
public class class212 extends class59 {

    @ObfuscatedName("hn.f")
    public class361 field2505 = new class361(128);

    @ObfuscatedName("hn.o")
    public int field2513 = 256;

    @ObfuscatedName("hn.u")
    public int field2495 = 1000000;

    @ObfuscatedName("hn.p")
    public int[] field2501 = new int[16];

    @ObfuscatedName("hn.b")
    public int[] field2493 = new int[16];

    @ObfuscatedName("hn.e")
    public int[] field2494 = new int[16];

    @ObfuscatedName("hn.k")
    public int[] field2492 = new int[16];

    @ObfuscatedName("hn.g")
    public int[] field2496 = new int[16];

    @ObfuscatedName("hn.h")
    public int[] field2506 = new int[16];

    @ObfuscatedName("hn.n")
    public int[] field2498 = new int[16];

    @ObfuscatedName("hn.l")
    public int[] field2499 = new int[16];

    @ObfuscatedName("hn.m")
    public int[] field2500 = new int[16];

    @ObfuscatedName("hn.x")
    public int[] field2517 = new int[16];

    @ObfuscatedName("hn.z")
    public int[] field2502 = new int[16];

    @ObfuscatedName("hn.i")
    public int[] field2503 = new int[16];

    @ObfuscatedName("hn.a")
    public int[] field2504 = new int[16];

    @ObfuscatedName("hn.w")
    public int[] field2489 = new int[16];

    @ObfuscatedName("hn.s")
    public int[] field2491 = new int[16];

    @ObfuscatedName("hn.y")
    public class217[][] field2507 = new class217[16][128];

    @ObfuscatedName("hn.ac")
    public class217[][] field2508 = new class217[16][128];

    @ObfuscatedName("hn.ay")
    public class213 field2509 = new class213();

    @ObfuscatedName("hn.am")
    public boolean field2510;

    @ObfuscatedName("hn.ag")
    public int field2511;

    @ObfuscatedName("hn.aq")
    public int field2512;

    @ObfuscatedName("hn.at")
    public long field2497;

    @ObfuscatedName("hn.aj")
    public long field2514;

    @ObfuscatedName("hn.aw")
    public class215 field2515 = new class215(this);

    public class212() {
        this.method3466();
    }

    @ObfuscatedName("hn.f(II)V")
    public synchronized void method3449(int arg0) {
        this.field2513 = arg0;
    }

    @ObfuscatedName("hn.o(I)I")
    public int method3522() {
        return this.field2513;
    }

    @ObfuscatedName("hn.u(Lho;Lir;Lbi;IB)Z")
    public synchronized boolean method3450(class216 arg0, class253 arg1, class56 arg2, int arg3) {
        arg0.method3639();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class348 var7 = (class348) arg0.field2547.method5641(); var7 != null; var7 = (class348) arg0.field2547.method5643()) {
            int var8 = (int) var7.field3941;
            class214 var9 = (class214) this.field2505.method5638((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method3939(var8);
                class214 var11;
                if (var10 == null) {
                    var11 = null;
                } else {
                    var11 = new class214(var10);
                }
                var9 = var11;
                if (var11 == null) {
                    var5 = false;
                    continue;
                }
                this.field2505.method5640(var11, (long) var8);
            }
            if (!var9.method3613(arg2, var7.field3938, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3640();
        }
        return var5;
    }

    @ObfuscatedName("hn.p(I)V")
    public synchronized void method3473() {
        for (class214 var1 = (class214) this.field2505.method5641(); var1 != null; var1 = (class214) this.field2505.method5643()) {
            var1.method3614();
        }
    }

    @ObfuscatedName("hn.b(I)V")
    public synchronized void method3533() {
        for (class214 var1 = (class214) this.field2505.method5641(); var1 != null; var1 = (class214) this.field2505.method5643()) {
            var1.method5354();
        }
    }

    @ObfuscatedName("hn.n(Lho;ZI)V")
    public synchronized void method3478(class216 arg0, boolean arg1) {
        this.method3453();
        this.field2509.method3586(arg0.field2546);
        this.field2510 = arg1;
        this.field2497 = 0L;
        int var3 = this.field2509.method3564();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2509.method3565(var4);
            this.field2509.method3568(var4);
            this.field2509.method3566(var4);
        }
        this.field2511 = this.field2509.method3573();
        this.field2512 = this.field2509.field2522[this.field2511];
        this.field2514 = this.field2509.method3572(this.field2512);
    }

    @ObfuscatedName("hn.m(I)V")
    public synchronized void method3453() {
        this.field2509.method3610();
        this.method3466();
    }

    @ObfuscatedName("hn.d(I)Z")
    public synchronized boolean method3448() {
        return this.field2509.method3607();
    }

    @ObfuscatedName("hn.c(III)V")
    public synchronized void method3455(int arg0, int arg1) {
        this.method3456(arg0, arg1);
    }

    @ObfuscatedName("hn.j(III)V")
    public void method3456(int arg0, int arg1) {
        this.field2492[arg0] = arg1;
        this.field2506[arg0] = arg1 & 0xFFFFFF80;
        this.method3475(arg0, arg1);
    }

    @ObfuscatedName("hn.r(III)V")
    public void method3475(int arg0, int arg1) {
        if (this.field2496[arg0] != arg1) {
            this.field2496[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2508[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("hn.q(IIII)V")
    public void method3458(int arg0, int arg1, int arg2) {
        this.method3521(arg0, arg1, 64);
        if ((this.field2517[arg0] & 0x2) != 0) {
            for (class217 var4 = (class217) this.field2515.field2543.method4188(); var4 != null; var4 = (class217) this.field2515.field2543.method4162()) {
                if (var4.field2555 == arg0 && var4.field2562 < 0) {
                    this.field2507[arg0][var4.field2548] = null;
                    this.field2507[arg0][arg1] = var4;
                    int var5 = (var4.field2557 * var4.field2553 >> 12) + var4.field2556;
                    var4.field2556 += arg1 - var4.field2548 << 8;
                    var4.field2557 = var5 - var4.field2556;
                    var4.field2553 = 4096;
                    var4.field2548 = arg1;
                    return;
                }
            }
        }
        class214 var6 = (class214) this.field2505.method5638((long) this.field2496[arg0]);
        if (var6 == null) {
            return;
        }
        class51 var7 = var6.field2532[arg1];
        if (var7 == null) {
            return;
        }
        class217 var8 = new class217();
        var8.field2555 = arg0;
        var8.field2549 = var6;
        var8.field2550 = var7;
        var8.field2551 = var6.field2537[arg1];
        var8.field2552 = var6.field2538[arg1];
        var8.field2548 = arg1;
        var8.field2554 = var6.field2533 * arg2 * arg2 * var6.field2535[arg1] + 1024 >> 11;
        var8.field2558 = var6.field2540[arg1] & 0xFF;
        var8.field2556 = (arg1 << 8) - (var6.field2534[arg1] & 0x7FFF);
        var8.field2569 = 0;
        var8.field2560 = 0;
        var8.field2561 = 0;
        var8.field2562 = -1;
        var8.field2563 = 0;
        if (this.field2504[arg0] == 0) {
            var8.field2566 = class58.method701(var7, this.method3471(var8), this.method3472(var8), this.method3535(var8));
        } else {
            var8.field2566 = class58.method701(var7, this.method3471(var8), 0, this.method3535(var8));
            this.method3451(var8, var6.field2534[arg1] < 0);
        }
        if (var6.field2534[arg1] < 0) {
            var8.field2566.method703(-1);
        }
        if (var8.field2552 >= 0) {
            class217 var9 = this.field2508[arg0][var8.field2552];
            if (var9 != null && var9.field2562 < 0) {
                this.field2507[arg0][var9.field2548] = null;
                var9.field2562 = 0;
            }
            this.field2508[arg0][var8.field2552] = var8;
        }
        this.field2515.field2543.method4155(var8);
        this.field2507[arg0][arg1] = var8;
    }

    @ObfuscatedName("hn.t(Lhj;ZI)V")
    public void method3451(class217 arg0, boolean arg1) {
        int var3 = arg0.field2550.field370.length;
        int var5;
        if (arg1 && arg0.field2550.field371) {
            int var4 = var3 + var3 - arg0.field2550.field372;
            var5 = (int) ((long) this.field2504[arg0.field2555] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2566.method710(true);
            }
        } else {
            var5 = (int) ((long) this.field2504[arg0.field2555] * (long) var3 >> 6);
        }
        arg0.field2566.method709(var5);
    }

    @ObfuscatedName("hn.v(IIIB)V")
    public void method3521(int arg0, int arg1, int arg2) {
        class217 var4 = this.field2507[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2507[arg0][arg1] = null;
        if ((this.field2517[arg0] & 0x2) == 0) {
            var4.field2562 = 0;
            return;
        }
        for (class217 var5 = (class217) this.field2515.field2543.method4160(); var5 != null; var5 = (class217) this.field2515.field2543.method4182()) {
            if (var4.field2555 == var5.field2555 && var5.field2562 < 0 && var4 != var5) {
                var4.field2562 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("hn.x(IIIB)V")
    public void method3461(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("hn.z(III)V")
    public void method3462(int arg0, int arg1) {
    }

    @ObfuscatedName("hn.at(III)V")
    public void method3537(int arg0, int arg1) {
        this.field2498[arg0] = arg1;
    }

    @ObfuscatedName("hn.aj(II)V")
    public void method3463(int arg0) {
        for (class217 var2 = (class217) this.field2515.field2543.method4160(); var2 != null; var2 = (class217) this.field2515.field2543.method4182()) {
            if (arg0 < 0 || var2.field2555 == arg0) {
                if (var2.field2566 != null) {
                    var2.field2566.method720(Statics.field395 / 100);
                    if (var2.field2566.method741()) {
                        this.field2515.field2542.method583(var2.field2566);
                    }
                    var2.method3648();
                }
                if (var2.field2562 < 0) {
                    this.field2507[var2.field2555][var2.field2548] = null;
                }
                var2.method5354();
            }
        }
    }

    @ObfuscatedName("hn.ax(IB)V")
    public void method3464(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3464(var2);
            }
            return;
        }
        this.field2501[arg0] = 12800;
        this.field2493[arg0] = 8192;
        this.field2494[arg0] = 16383;
        this.field2498[arg0] = 8192;
        this.field2499[arg0] = 0;
        this.field2500[arg0] = 8192;
        this.method3480(arg0);
        this.method3503(arg0);
        this.field2517[arg0] = 0;
        this.field2502[arg0] = 32767;
        this.field2503[arg0] = 256;
        this.field2504[arg0] = 0;
        this.method3479(arg0, 8192);
    }

    @ObfuscatedName("hn.as(II)V")
    public void method3465(int arg0) {
        for (class217 var2 = (class217) this.field2515.field2543.method4160(); var2 != null; var2 = (class217) this.field2515.field2543.method4182()) {
            if ((arg0 < 0 || var2.field2555 == arg0) && var2.field2562 < 0) {
                this.field2507[var2.field2555][var2.field2548] = null;
                var2.field2562 = 0;
            }
        }
    }

    @ObfuscatedName("hn.ad(I)V")
    public void method3466() {
        this.method3463(-1);
        this.method3464(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2496[var1] = this.field2492[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2506[var2] = this.field2492[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("hn.ao(II)V")
    public void method3480(int arg0) {
        if ((this.field2517[arg0] & 0x2) == 0) {
            return;
        }
        for (class217 var2 = (class217) this.field2515.field2543.method4160(); var2 != null; var2 = (class217) this.field2515.field2543.method4182()) {
            if (var2.field2555 == arg0 && this.field2507[arg0][var2.field2548] == null && var2.field2562 < 0) {
                var2.field2562 = 0;
            }
        }
    }

    @ObfuscatedName("hn.ai(IB)V")
    public void method3503(int arg0) {
        if ((this.field2517[arg0] & 0x4) == 0) {
            return;
        }
        for (class217 var2 = (class217) this.field2515.field2543.method4160(); var2 != null; var2 = (class217) this.field2515.field2543.method4182()) {
            if (var2.field2555 == arg0) {
                var2.field2568 = 0;
            }
        }
    }

    @ObfuscatedName("hn.av(IB)V")
    public void method3552(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3521(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3458(var6, var7, var8);
            } else {
                this.method3521(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3461(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2506[var12] = (var14 << 14) + (this.field2506[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2506[var12] = (var14 << 7) + (this.field2506[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2499[var12] = (var14 << 7) + (this.field2499[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2499[var12] = (this.field2499[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2500[var12] = (var14 << 7) + (this.field2500[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2500[var12] = (this.field2500[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2501[var12] = (var14 << 7) + (this.field2501[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2501[var12] = (this.field2501[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2493[var12] = (var14 << 7) + (this.field2493[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2493[var12] = (this.field2493[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2494[var12] = (var14 << 7) + (this.field2494[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2494[var12] = (this.field2494[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2517[var12] |= 0x1;
                } else {
                    this.field2517[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2517[var12] |= 0x2;
                } else {
                    this.method3480(var12);
                    this.field2517[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2502[var12] = (var14 << 7) + (this.field2502[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2502[var12] = (this.field2502[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2502[var12] = (var14 << 7) + (this.field2502[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2502[var12] = (this.field2502[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3463(var12);
            }
            if (var13 == 121) {
                this.method3464(var12);
            }
            if (var13 == 123) {
                this.method3465(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2502[var12];
                if (var15 == 16384) {
                    this.field2503[var12] = (var14 << 7) + (this.field2503[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2502[var12];
                if (var16 == 16384) {
                    this.field2503[var12] = (this.field2503[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2504[var12] = (var14 << 7) + (this.field2504[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2504[var12] = (this.field2504[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2517[var12] |= 0x4;
                } else {
                    this.method3503(var12);
                    this.field2517[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3479(var12, (var14 << 7) + (this.field2489[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3479(var12, (this.field2489[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3475(var17, this.field2506[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3462(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method3537(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3466();
            }
        }
    }

    @ObfuscatedName("hn.az(IIB)V")
    public void method3479(int arg0, int arg1) {
        this.field2489[arg0] = arg1;
        this.field2491[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("hn.au(Lhj;I)I")
    public int method3471(class217 arg0) {
        int var2 = (arg0.field2557 * arg0.field2553 >> 12) + arg0.field2556;
        int var3 = ((this.field2498[arg0.field2555] - 8192) * this.field2503[arg0.field2555] >> 12) + var2;
        class210 var4 = arg0.field2551;
        if (var4.field2475 > 0 && (var4.field2474 > 0 || this.field2499[arg0.field2555] > 0)) {
            int var5 = var4.field2474 << 2;
            int var6 = var4.field2469 << 1;
            if (arg0.field2564 < var6) {
                var5 = arg0.field2564 * var5 / var6;
            }
            int var7 = (this.field2499[arg0.field2555] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2565 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2550.field374 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field395 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("hn.ab(Lhj;I)I")
    public int method3472(class217 arg0) {
        class210 var2 = arg0.field2551;
        int var3 = this.field2501[arg0.field2555] * this.field2494[arg0.field2555] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2554 * var4 + 16384 >> 15;
        int var6 = this.field2513 * var5 + 128 >> 8;
        if (var2.field2470 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2569 * 1.953125E-5D * (double) var2.field2470) + 0.5D);
        }
        if (var2.field2471 != null) {
            int var7 = arg0.field2560;
            int var8 = var2.field2471[arg0.field2561 + 1];
            if (arg0.field2561 < var2.field2471.length - 2) {
                int var9 = (var2.field2471[arg0.field2561] & 0xFF) << 8;
                int var10 = (var2.field2471[arg0.field2561 + 2] & 0xFF) << 8;
                var8 += (var2.field2471[arg0.field2561 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2562 > 0 && var2.field2468 != null) {
            int var11 = arg0.field2562;
            int var12 = var2.field2468[arg0.field2563 + 1];
            if (arg0.field2563 < var2.field2468.length - 2) {
                int var13 = (var2.field2468[arg0.field2563] & 0xFF) << 8;
                int var14 = (var2.field2468[arg0.field2563 + 2] & 0xFF) << 8;
                var12 += (var2.field2468[arg0.field2563 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("hn.aa(Lhj;I)I")
    public int method3535(class217 arg0) {
        int var2 = this.field2493[arg0.field2555];
        return var2 < 8192 ? arg0.field2558 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2558) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("hn.e()Lbt;")
    public synchronized class59 method557() {
        return this.field2515;
    }

    @ObfuscatedName("hn.k()Lbt;")
    public synchronized class59 method558() {
        return null;
    }

    @ObfuscatedName("hn.g()I")
    public synchronized int method575() {
        return 0;
    }

    @ObfuscatedName("hn.h([III)V")
    public synchronized void method585(int[] arg0, int arg1, int arg2) {
        if (this.field2509.method3607()) {
            int var4 = this.field2495 * this.field2509.field2527 / Statics.field395;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2497;
                if (this.field2514 - var5 >= 0L) {
                    this.field2497 = var5;
                    break;
                }
                int var7 = (int) ((this.field2514 - this.field2497 + (long) var4 - 1L) / (long) var4);
                this.field2497 += (long) var4 * (long) var7;
                this.field2515.method585(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3452();
            } while (this.field2509.method3607());
        }
        this.field2515.method585(arg0, arg1, arg2);
    }

    @ObfuscatedName("hn.l(I)V")
    public synchronized void method560(int arg0) {
        if (this.field2509.method3607()) {
            int var2 = this.field2495 * this.field2509.field2527 / Statics.field395;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2497;
                if (this.field2514 - var3 >= 0L) {
                    this.field2497 = var3;
                    break;
                }
                int var5 = (int) ((this.field2514 - this.field2497 + (long) var2 - 1L) / (long) var2);
                this.field2497 += (long) var2 * (long) var5;
                this.field2515.method560(var5);
                arg0 -= var5;
                this.method3452();
            } while (this.field2509.method3607());
        }
        this.field2515.method560(arg0);
    }

    @ObfuscatedName("hn.al(I)V")
    public void method3452() {
        int var1 = this.field2511;
        int var2 = this.field2512;
        long var3 = this.field2514;
        while (this.field2512 == var2) {
            while (this.field2509.field2522[var1] == var2) {
                this.field2509.method3565(var1);
                int var5 = this.field2509.method3569(var1);
                if (var5 == 1) {
                    this.field2509.method3567();
                    this.field2509.method3566(var1);
                    if (this.field2509.method3574()) {
                        if (!this.field2510 || var2 == 0) {
                            this.method3466();
                            this.field2509.method3610();
                            return;
                        }
                        this.field2509.method3595(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3552(var5);
                }
                this.field2509.method3568(var1);
                this.field2509.method3566(var1);
            }
            var1 = this.field2509.method3573();
            var2 = this.field2509.field2522[var1];
            var3 = this.field2509.method3572(var2);
        }
        this.field2511 = var1;
        this.field2512 = var2;
        this.field2514 = var3;
    }

    @ObfuscatedName("hn.ar(Lhj;I)Z")
    public boolean method3476(class217 arg0) {
        if (arg0.field2566 != null) {
            return false;
        }
        if (arg0.field2562 >= 0) {
            arg0.method5354();
            if (arg0.field2552 > 0 && this.field2508[arg0.field2555][arg0.field2552] == arg0) {
                this.field2508[arg0.field2555][arg0.field2552] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("hn.ak(Lhj;[IIIB)Z")
    public boolean method3477(class217 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2567 = Statics.field395 / 100;
        if (arg0.field2562 >= 0 && arg0.field2566 == null || arg0.field2566.method765()) {
            arg0.method3648();
            arg0.method5354();
            if (arg0.field2552 > 0 && this.field2508[arg0.field2555][arg0.field2552] == arg0) {
                this.field2508[arg0.field2555][arg0.field2552] = null;
            }
            return true;
        }
        int var5 = arg0.field2553;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2500[arg0.field2555] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2553 = var6;
        }
        arg0.field2566.method715(this.method3471(arg0));
        class210 var7 = arg0.field2551;
        boolean var8 = false;
        arg0.field2564++;
        arg0.field2565 += var7.field2475;
        double var9 = (double) ((arg0.field2548 - 60 << 8) + (arg0.field2557 * arg0.field2553 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2470 > 0) {
            if (var7.field2473 > 0) {
                arg0.field2569 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2473 * var9) + 0.5D);
            } else {
                arg0.field2569 += 128;
            }
        }
        if (var7.field2471 != null) {
            if (var7.field2476 > 0) {
                arg0.field2560 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2476 * var9) + 0.5D);
            } else {
                arg0.field2560 += 128;
            }
            while (arg0.field2561 < var7.field2471.length - 2 && arg0.field2560 > (var7.field2471[arg0.field2561 + 2] & 0xFF) << 8) {
                arg0.field2561 += 2;
            }
            if (arg0.field2561 == var7.field2471.length - 2 && var7.field2471[arg0.field2561 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2562 >= 0 && var7.field2468 != null && (this.field2517[arg0.field2555] & 0x1) == 0 && (arg0.field2552 < 0 || this.field2508[arg0.field2555][arg0.field2552] != arg0)) {
            if (var7.field2477 > 0) {
                arg0.field2562 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2477 * var9) + 0.5D);
            } else {
                arg0.field2562 += 128;
            }
            while (arg0.field2563 < var7.field2468.length - 2 && arg0.field2562 > (var7.field2468[arg0.field2563 + 2] & 0xFF) << 8) {
                arg0.field2563 += 2;
            }
            if (arg0.field2563 == var7.field2468.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2566.method713(arg0.field2567, this.method3472(arg0), this.method3535(arg0));
            return false;
        }
        arg0.field2566.method720(arg0.field2567);
        if (arg1 == null) {
            arg0.field2566.method560(arg3);
        } else {
            arg0.field2566.method585(arg1, arg2, arg3);
        }
        if (arg0.field2566.method741()) {
            this.field2515.field2542.method583(arg0.field2566);
        }
        arg0.method3648();
        if (arg0.field2562 >= 0) {
            arg0.method5354();
            if (arg0.field2552 > 0 && this.field2508[arg0.field2555][arg0.field2552] == arg0) {
                this.field2508[arg0.field2555][arg0.field2552] = null;
            }
        }
        return true;
    }
}
