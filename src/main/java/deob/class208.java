package deob;

@ObfuscatedName("gv")
public class class208 extends class125 {

    @ObfuscatedName("gv.f")
    public class329 field2438 = new class329(128);

    @ObfuscatedName("gv.b")
    public int field2441 = 256;

    @ObfuscatedName("gv.l")
    public int field2447 = 1000000;

    @ObfuscatedName("gv.m")
    public int[] field2439 = new int[16];

    @ObfuscatedName("gv.z")
    public int[] field2449 = new int[16];

    @ObfuscatedName("gv.q")
    public int[] field2451 = new int[16];

    @ObfuscatedName("gv.k")
    public int[] field2463 = new int[16];

    @ObfuscatedName("gv.c")
    public int[] field2443 = new int[16];

    @ObfuscatedName("gv.u")
    public int[] field2460 = new int[16];

    @ObfuscatedName("gv.t")
    public int[] field2436 = new int[16];

    @ObfuscatedName("gv.e")
    public int[] field2437 = new int[16];

    @ObfuscatedName("gv.o")
    public int[] field2445 = new int[16];

    @ObfuscatedName("gv.w")
    public int[] field2450 = new int[16];

    @ObfuscatedName("gv.v")
    public int[] field2442 = new int[16];

    @ObfuscatedName("gv.d")
    public int[] field2452 = new int[16];

    @ObfuscatedName("gv.a")
    public int[] field2453 = new int[16];

    @ObfuscatedName("gv.g")
    public int[] field2454 = new int[16];

    @ObfuscatedName("gv.h")
    public int[] field2455 = new int[16];

    @ObfuscatedName("gv.i")
    public class209[][] field2456 = new class209[16][128];

    @ObfuscatedName("gv.ab")
    public class209[][] field2457 = new class209[16][128];

    @ObfuscatedName("gv.ac")
    public class210 field2458 = new class210();

    @ObfuscatedName("gv.ao")
    public boolean field2459;

    @ObfuscatedName("gv.af")
    public int field2440;

    @ObfuscatedName("gv.av")
    public int field2461;

    @ObfuscatedName("gv.ar")
    public long field2462;

    @ObfuscatedName("gv.ay")
    public long field2446;

    @ObfuscatedName("gv.ah")
    public class212 field2464 = new class212(this);

    public class208() {
        this.method3535();
    }

    @ObfuscatedName("gv.f(II)V")
    public synchronized void method3517(int arg0) {
        this.field2441 = arg0;
    }

    @ObfuscatedName("gv.b(I)I")
    public int method3518() {
        return this.field2441;
    }

    @ObfuscatedName("gv.l(Lhj;Liw;Lds;II)Z")
    public synchronized boolean method3531(class213 arg0, class245 arg1, class118 arg2, int arg3) {
        arg0.method3691();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class187 var7 = (class187) arg0.field2519.method5601(); var7 != null; var7 = (class187) arg0.field2519.method5598()) {
            int var8 = (int) var7.field2140;
            class211 var9 = (class211) this.field2438.method5597((long) var8);
            if (var9 == null) {
                var9 = class211.method3201(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field2438.method5596(var9, (long) var8);
            }
            if (!var9.method3672(arg2, var7.field2136, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3693();
        }
        return var5;
    }

    @ObfuscatedName("gv.m(I)V")
    public synchronized void method3520() {
        for (class211 var1 = (class211) this.field2438.method5601(); var1 != null; var1 = (class211) this.field2438.method5598()) {
            var1.method3680();
        }
    }

    @ObfuscatedName("gv.z(I)V")
    public synchronized void method3521() {
        for (class211 var1 = (class211) this.field2438.method5601(); var1 != null; var1 = (class211) this.field2438.method5598()) {
            var1.method3407();
        }
    }

    @ObfuscatedName("gv.t(Lhj;ZI)V")
    public synchronized void method3550(class213 arg0, boolean arg1) {
        this.method3523();
        this.field2458.method3623(arg0.field2520);
        this.field2459 = arg1;
        this.field2462 = 0L;
        int var3 = this.field2458.method3626();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2458.method3627(var4);
            this.field2458.method3630(var4);
            this.field2458.method3628(var4);
        }
        this.field2440 = this.field2458.method3633();
        this.field2461 = this.field2458.field2492[this.field2440];
        this.field2446 = this.field2458.method3671(this.field2461);
    }

    @ObfuscatedName("gv.o(B)V")
    public synchronized void method3523() {
        this.field2458.method3624();
        this.method3535();
    }

    @ObfuscatedName("gv.n(I)Z")
    public synchronized boolean method3524() {
        return this.field2458.method3625();
    }

    @ObfuscatedName("gv.x(IIB)V")
    public synchronized void method3525(int arg0, int arg1) {
        this.method3563(arg0, arg1);
    }

    @ObfuscatedName("gv.p(IIS)V")
    public void method3563(int arg0, int arg1) {
        this.field2463[arg0] = arg1;
        this.field2460[arg0] = arg1 & 0xFFFFFF80;
        this.method3577(arg0, arg1);
    }

    @ObfuscatedName("gv.r(III)V")
    public void method3577(int arg0, int arg1) {
        if (this.field2443[arg0] != arg1) {
            this.field2443[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2457[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("gv.y(IIII)V")
    public void method3527(int arg0, int arg1, int arg2) {
        this.method3562(arg0, arg1, 64);
        if ((this.field2450[arg0] & 0x2) != 0) {
            for (class209 var4 = (class209) this.field2464.field2515.method4653(); var4 != null; var4 = (class209) this.field2464.field2515.method4641()) {
                if (var4.field2480 == arg0 && var4.field2474 < 0) {
                    this.field2456[arg0][var4.field2467] = null;
                    this.field2456[arg0][arg1] = var4;
                    int var5 = (var4.field2475 * var4.field2471 >> 12) + var4.field2473;
                    var4.field2473 += arg1 - var4.field2467 << 8;
                    var4.field2471 = var5 - var4.field2473;
                    var4.field2475 = 4096;
                    var4.field2467 = arg1;
                    return;
                }
            }
        }
        class211 var6 = (class211) this.field2438.method5597((long) this.field2443[arg0]);
        if (var6 == null) {
            return;
        }
        class113 var7 = var6.field2502[arg1];
        if (var7 == null) {
            return;
        }
        class209 var8 = new class209();
        var8.field2480 = arg0;
        var8.field2479 = var6;
        var8.field2472 = var7;
        var8.field2465 = var6.field2507[arg1];
        var8.field2469 = var6.field2510[arg1];
        var8.field2467 = arg1;
        var8.field2470 = var6.field2508 * arg2 * arg2 * var6.field2503[arg1] + 1024 >> 11;
        var8.field2466 = var6.field2506[arg1] & 0xFF;
        var8.field2473 = (arg1 << 8) - (var6.field2505[arg1] & 0x7FFF);
        var8.field2476 = 0;
        var8.field2477 = 0;
        var8.field2478 = 0;
        var8.field2474 = -1;
        var8.field2486 = 0;
        if (this.field2453[arg0] == 0) {
            var8.field2483 = class123.method2455(var7, this.method3540(var8), this.method3541(var8), this.method3542(var8));
        } else {
            var8.field2483 = class123.method2455(var7, this.method3540(var8), 0, this.method3542(var8));
            this.method3528(var8, var6.field2505[arg1] < 0);
        }
        if (var6.field2505[arg1] < 0) {
            var8.field2483.method2553(-1);
        }
        if (var8.field2469 >= 0) {
            class209 var9 = this.field2457[arg0][var8.field2469];
            if (var9 != null && var9.field2474 < 0) {
                this.field2456[arg0][var9.field2467] = null;
                var9.field2474 = 0;
            }
            this.field2457[arg0][var8.field2469] = var8;
        }
        this.field2464.field2515.method4639(var8);
        this.field2456[arg0][arg1] = var8;
    }

    @ObfuscatedName("gv.s(Lhl;ZI)V")
    public void method3528(class209 arg0, boolean arg1) {
        int var3 = arg0.field2472.field1416.length;
        int var5;
        if (arg1 && arg0.field2472.field1417) {
            int var4 = var3 + var3 - arg0.field2472.field1418;
            var5 = (int) ((long) this.field2453[arg0.field2480] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2483.method2544(true);
            }
        } else {
            var5 = (int) ((long) this.field2453[arg0.field2480] * (long) var3 >> 6);
        }
        arg0.field2483.method2454(var5);
    }

    @ObfuscatedName("gv.j(IIII)V")
    public void method3562(int arg0, int arg1, int arg2) {
        class209 var4 = this.field2456[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2456[arg0][arg1] = null;
        if ((this.field2450[arg0] & 0x2) == 0) {
            var4.field2474 = 0;
            return;
        }
        for (class209 var5 = (class209) this.field2464.field2515.method4638(); var5 != null; var5 = (class209) this.field2464.field2515.method4640()) {
            if (var4.field2480 == var5.field2480 && var5.field2474 < 0 && var4 != var5) {
                var4.field2474 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("gv.d(IIIB)V")
    public void method3549(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("gv.ao(III)V")
    public void method3530(int arg0, int arg1) {
    }

    @ObfuscatedName("gv.af(III)V")
    public void method3516(int arg0, int arg1) {
        this.field2436[arg0] = arg1;
    }

    @ObfuscatedName("gv.av(II)V")
    public void method3558(int arg0) {
        for (class209 var2 = (class209) this.field2464.field2515.method4638(); var2 != null; var2 = (class209) this.field2464.field2515.method4640()) {
            if (arg0 < 0 || var2.field2480 == arg0) {
                if (var2.field2483 != null) {
                    var2.field2483.method2459(Statics.field1443 / 100);
                    if (var2.field2483.method2542()) {
                        this.field2464.field2518.method2222(var2.field2483);
                    }
                    var2.method3617();
                }
                if (var2.field2474 < 0) {
                    this.field2456[var2.field2480][var2.field2467] = null;
                }
                var2.method3407();
            }
        }
    }

    @ObfuscatedName("gv.ak(II)V")
    public void method3533(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3533(var2);
            }
            return;
        }
        this.field2439[arg0] = 12800;
        this.field2449[arg0] = 8192;
        this.field2451[arg0] = 16383;
        this.field2436[arg0] = 8192;
        this.field2437[arg0] = 0;
        this.field2445[arg0] = 8192;
        this.method3536(arg0);
        this.method3548(arg0);
        this.field2450[arg0] = 0;
        this.field2442[arg0] = 32767;
        this.field2452[arg0] = 256;
        this.field2453[arg0] = 0;
        this.method3539(arg0, 8192);
    }

    @ObfuscatedName("gv.au(II)V")
    public void method3534(int arg0) {
        for (class209 var2 = (class209) this.field2464.field2515.method4638(); var2 != null; var2 = (class209) this.field2464.field2515.method4640()) {
            if ((arg0 < 0 || var2.field2480 == arg0) && var2.field2474 < 0) {
                this.field2456[var2.field2480][var2.field2467] = null;
                var2.field2474 = 0;
            }
        }
    }

    @ObfuscatedName("gv.ai(I)V")
    public void method3535() {
        this.method3558(-1);
        this.method3533(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2443[var1] = this.field2463[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2460[var2] = this.field2463[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("gv.aw(II)V")
    public void method3536(int arg0) {
        if ((this.field2450[arg0] & 0x2) == 0) {
            return;
        }
        for (class209 var2 = (class209) this.field2464.field2515.method4638(); var2 != null; var2 = (class209) this.field2464.field2515.method4640()) {
            if (var2.field2480 == arg0 && this.field2456[arg0][var2.field2467] == null && var2.field2474 < 0) {
                var2.field2474 = 0;
            }
        }
    }

    @ObfuscatedName("gv.an(IB)V")
    public void method3548(int arg0) {
        if ((this.field2450[arg0] & 0x4) == 0) {
            return;
        }
        for (class209 var2 = (class209) this.field2464.field2515.method4638(); var2 != null; var2 = (class209) this.field2464.field2515.method4640()) {
            if (var2.field2480 == arg0) {
                var2.field2485 = 0;
            }
        }
    }

    @ObfuscatedName("gv.am(IB)V")
    public void method3557(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3562(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3527(var6, var7, var8);
            } else {
                this.method3562(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3549(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2460[var12] = (var14 << 14) + (this.field2460[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2460[var12] = (var14 << 7) + (this.field2460[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2437[var12] = (var14 << 7) + (this.field2437[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2437[var12] = (this.field2437[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2445[var12] = (var14 << 7) + (this.field2445[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2445[var12] = (this.field2445[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2439[var12] = (var14 << 7) + (this.field2439[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2439[var12] = (this.field2439[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2449[var12] = (var14 << 7) + (this.field2449[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2449[var12] = (this.field2449[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2451[var12] = (var14 << 7) + (this.field2451[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2451[var12] = (this.field2451[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2450[var12] |= 0x1;
                } else {
                    this.field2450[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2450[var12] |= 0x2;
                } else {
                    this.method3536(var12);
                    this.field2450[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2442[var12] = (var14 << 7) + (this.field2442[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2442[var12] = (this.field2442[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2442[var12] = (var14 << 7) + (this.field2442[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2442[var12] = (this.field2442[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3558(var12);
            }
            if (var13 == 121) {
                this.method3533(var12);
            }
            if (var13 == 123) {
                this.method3534(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2442[var12];
                if (var15 == 16384) {
                    this.field2452[var12] = (var14 << 7) + (this.field2452[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2442[var12];
                if (var16 == 16384) {
                    this.field2452[var12] = (this.field2452[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2453[var12] = (var14 << 7) + (this.field2453[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2453[var12] = (this.field2453[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2450[var12] |= 0x4;
                } else {
                    this.method3548(var12);
                    this.field2450[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3539(var12, (var14 << 7) + (this.field2454[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3539(var12, (this.field2454[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3577(var17, this.field2460[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3530(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method3516(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3535();
            }
        }
    }

    @ObfuscatedName("gv.aa(III)V")
    public void method3539(int arg0, int arg1) {
        this.field2454[arg0] = arg1;
        this.field2455[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("gv.at(Lhl;B)I")
    public int method3540(class209 arg0) {
        int var2 = (arg0.field2475 * arg0.field2471 >> 12) + arg0.field2473;
        int var3 = ((this.field2436[arg0.field2480] - 8192) * this.field2452[arg0.field2480] >> 12) + var2;
        class206 var4 = arg0.field2465;
        if (var4.field2425 > 0 && (var4.field2419 > 0 || this.field2437[arg0.field2480] > 0)) {
            int var5 = var4.field2419 << 2;
            int var6 = var4.field2426 << 1;
            if (arg0.field2481 < var6) {
                var5 = arg0.field2481 * var5 / var6;
            }
            int var7 = (this.field2437[arg0.field2480] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2468 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2472.field1420 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1443 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("gv.as(Lhl;I)I")
    public int method3541(class209 arg0) {
        class206 var2 = arg0.field2465;
        int var3 = this.field2439[arg0.field2480] * this.field2451[arg0.field2480] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2470 * var4 + 16384 >> 15;
        int var6 = this.field2441 * var5 + 128 >> 8;
        if (var2.field2420 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2476 * 1.953125E-5D * (double) var2.field2420) + 0.5D);
        }
        if (var2.field2424 != null) {
            int var7 = arg0.field2477;
            int var8 = var2.field2424[arg0.field2478 + 1];
            if (arg0.field2478 < var2.field2424.length - 2) {
                int var9 = (var2.field2424[arg0.field2478] & 0xFF) << 8;
                int var10 = (var2.field2424[arg0.field2478 + 2] & 0xFF) << 8;
                var8 += (var2.field2424[arg0.field2478 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2474 > 0 && var2.field2427 != null) {
            int var11 = arg0.field2474;
            int var12 = var2.field2427[arg0.field2486 + 1];
            if (arg0.field2486 < var2.field2427.length - 2) {
                int var13 = (var2.field2427[arg0.field2486] & 0xFF) << 8;
                int var14 = (var2.field2427[arg0.field2486 + 2] & 0xFF) << 8;
                var12 += (var2.field2427[arg0.field2486 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("gv.aj(Lhl;B)I")
    public int method3542(class209 arg0) {
        int var2 = this.field2449[arg0.field2480];
        return var2 < 8192 ? arg0.field2466 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2466) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("gv.q()Lde;")
    public synchronized class125 method2226() {
        return this.field2464;
    }

    @ObfuscatedName("gv.k()Lde;")
    public synchronized class125 method2227() {
        return null;
    }

    @ObfuscatedName("gv.c()I")
    public synchronized int method2237() {
        return 0;
    }

    @ObfuscatedName("gv.u([III)V")
    public synchronized void method2229(int[] arg0, int arg1, int arg2) {
        if (this.field2458.method3625()) {
            int var4 = this.field2447 * this.field2458.field2489 / Statics.field1443;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2462;
                if (this.field2446 - var5 >= 0L) {
                    this.field2462 = var5;
                    break;
                }
                int var7 = (int) ((this.field2446 - this.field2462 + (long) var4 - 1L) / (long) var4);
                this.field2462 += (long) var4 * (long) var7;
                this.field2464.method2229(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3543();
            } while (this.field2458.method3625());
        }
        this.field2464.method2229(arg0, arg1, arg2);
    }

    @ObfuscatedName("gv.e(I)V")
    public synchronized void method2231(int arg0) {
        if (this.field2458.method3625()) {
            int var2 = this.field2447 * this.field2458.field2489 / Statics.field1443;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2462;
                if (this.field2446 - var3 >= 0L) {
                    this.field2462 = var3;
                    break;
                }
                int var5 = (int) ((this.field2446 - this.field2462 + (long) var2 - 1L) / (long) var2);
                this.field2462 += (long) var2 * (long) var5;
                this.field2464.method2231(var5);
                arg0 -= var5;
                this.method3543();
            } while (this.field2458.method3625());
        }
        this.field2464.method2231(arg0);
    }

    @ObfuscatedName("gv.ae(B)V")
    public void method3543() {
        int var1 = this.field2440;
        int var2 = this.field2461;
        long var3 = this.field2446;
        while (this.field2461 == var2) {
            while (this.field2458.field2492[var1] == var2) {
                this.field2458.method3627(var1);
                int var5 = this.field2458.method3631(var1);
                if (var5 == 1) {
                    this.field2458.method3638();
                    this.field2458.method3628(var1);
                    if (this.field2458.method3636()) {
                        if (!this.field2459 || var2 == 0) {
                            this.method3535();
                            this.field2458.method3624();
                            return;
                        }
                        this.field2458.method3637(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3557(var5);
                }
                this.field2458.method3630(var1);
                this.field2458.method3628(var1);
            }
            var1 = this.field2458.method3633();
            var2 = this.field2458.field2492[var1];
            var3 = this.field2458.method3671(var2);
        }
        this.field2440 = var1;
        this.field2461 = var2;
        this.field2446 = var3;
    }

    @ObfuscatedName("gv.al(Lhl;I)Z")
    public boolean method3544(class209 arg0) {
        if (arg0.field2483 != null) {
            return false;
        }
        if (arg0.field2474 >= 0) {
            arg0.method3407();
            if (arg0.field2469 > 0 && this.field2457[arg0.field2480][arg0.field2469] == arg0) {
                this.field2457[arg0.field2480][arg0.field2469] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("gv.ap(Lhl;[IIIB)Z")
    public boolean method3537(class209 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2484 = Statics.field1443 / 100;
        if (arg0.field2474 >= 0 && arg0.field2483 == null || arg0.field2483.method2462()) {
            arg0.method3617();
            arg0.method3407();
            if (arg0.field2469 > 0 && this.field2457[arg0.field2480][arg0.field2469] == arg0) {
                this.field2457[arg0.field2480][arg0.field2469] = null;
            }
            return true;
        }
        int var5 = arg0.field2475;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2445[arg0.field2480] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2475 = var6;
        }
        arg0.field2483.method2493(this.method3540(arg0));
        class206 var7 = arg0.field2465;
        boolean var8 = false;
        arg0.field2481++;
        arg0.field2468 += var7.field2425;
        double var9 = (double) ((arg0.field2467 - 60 << 8) + (arg0.field2475 * arg0.field2471 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2420 > 0) {
            if (var7.field2423 > 0) {
                arg0.field2476 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2423 * var9) + 0.5D);
            } else {
                arg0.field2476 += 128;
            }
        }
        if (var7.field2424 != null) {
            if (var7.field2421 > 0) {
                arg0.field2477 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2421 * var9) + 0.5D);
            } else {
                arg0.field2477 += 128;
            }
            while (arg0.field2478 < var7.field2424.length - 2 && arg0.field2477 > (var7.field2424[arg0.field2478 + 2] & 0xFF) << 8) {
                arg0.field2478 += 2;
            }
            if (arg0.field2478 == var7.field2424.length - 2 && var7.field2424[arg0.field2478 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2474 >= 0 && var7.field2427 != null && (this.field2450[arg0.field2480] & 0x1) == 0 && (arg0.field2469 < 0 || this.field2457[arg0.field2480][arg0.field2469] != arg0)) {
            if (var7.field2422 > 0) {
                arg0.field2474 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2422 * var9) + 0.5D);
            } else {
                arg0.field2474 += 128;
            }
            while (arg0.field2486 < var7.field2427.length - 2 && arg0.field2474 > (var7.field2427[arg0.field2486 + 2] & 0xFF) << 8) {
                arg0.field2486 += 2;
            }
            if (arg0.field2486 == var7.field2427.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2483.method2458(arg0.field2484, this.method3541(arg0), this.method3542(arg0));
            return false;
        }
        arg0.field2483.method2459(arg0.field2484);
        if (arg1 == null) {
            arg0.field2483.method2231(arg3);
        } else {
            arg0.field2483.method2229(arg1, arg2, arg3);
        }
        if (arg0.field2483.method2542()) {
            this.field2464.field2518.method2222(arg0.field2483);
        }
        arg0.method3617();
        if (arg0.field2474 >= 0) {
            arg0.method3407();
            if (arg0.field2469 > 0 && this.field2457[arg0.field2480][arg0.field2469] == arg0) {
                this.field2457[arg0.field2480][arg0.field2469] = null;
            }
        }
        return true;
    }
}
