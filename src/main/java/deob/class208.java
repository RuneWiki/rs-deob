package deob;

@ObfuscatedName("ge")
public class class208 extends class125 {

    @ObfuscatedName("ge.z")
    public class328 field2444 = new class328(128);

    @ObfuscatedName("ge.k")
    public int field2459 = 256;

    @ObfuscatedName("ge.s")
    public int field2457 = 1000000;

    @ObfuscatedName("ge.t")
    public int[] field2450 = new int[16];

    @ObfuscatedName("ge.i")
    public int[] field2446 = new int[16];

    @ObfuscatedName("ge.o")
    public int[] field2447 = new int[16];

    @ObfuscatedName("ge.x")
    public int[] field2448 = new int[16];

    @ObfuscatedName("ge.g")
    public int[] field2449 = new int[16];

    @ObfuscatedName("ge.m")
    public int[] field2466 = new int[16];

    @ObfuscatedName("ge.n")
    public int[] field2451 = new int[16];

    @ObfuscatedName("ge.d")
    public int[] field2452 = new int[16];

    @ObfuscatedName("ge.h")
    public int[] field2453 = new int[16];

    @ObfuscatedName("ge.j")
    public int[] field2454 = new int[16];

    @ObfuscatedName("ge.r")
    public int[] field2455 = new int[16];

    @ObfuscatedName("ge.u")
    public int[] field2456 = new int[16];

    @ObfuscatedName("ge.p")
    public int[] field2442 = new int[16];

    @ObfuscatedName("ge.b")
    public int[] field2458 = new int[16];

    @ObfuscatedName("ge.l")
    public int[] field2443 = new int[16];

    @ObfuscatedName("ge.e")
    public class209[][] field2460 = new class209[16][128];

    @ObfuscatedName("ge.ab")
    public class209[][] field2461 = new class209[16][128];

    @ObfuscatedName("ge.ag")
    public class210 field2462 = new class210();

    @ObfuscatedName("ge.ao")
    public boolean field2463;

    @ObfuscatedName("ge.ae")
    public int field2464;

    @ObfuscatedName("ge.an")
    public int field2465;

    @ObfuscatedName("ge.am")
    public long field2445;

    @ObfuscatedName("ge.ap")
    public long field2467;

    @ObfuscatedName("ge.au")
    public class212 field2468 = new class212(this);

    public class208() {
        this.method3511();
    }

    @ObfuscatedName("ge.z(II)V")
    public synchronized void method3493(int arg0) {
        this.field2459 = arg0;
    }

    @ObfuscatedName("ge.k(I)I")
    public int method3494() {
        return this.field2459;
    }

    @ObfuscatedName("ge.s(Lhj;Lic;Lds;IB)Z")
    public synchronized boolean method3582(class213 arg0, class244 arg1, class118 arg2, int arg3) {
        arg0.method3668();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class187 var7 = (class187) arg0.field2521.method5605(); var7 != null; var7 = (class187) arg0.field2521.method5608()) {
            int var8 = (int) var7.field2157;
            class211 var9 = (class211) this.field2444.method5611((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method3879(var8);
                class211 var11;
                if (var10 == null) {
                    var11 = null;
                } else {
                    var11 = new class211(var10);
                }
                var9 = var11;
                if (var11 == null) {
                    var5 = false;
                    continue;
                }
                this.field2444.method5606(var11, (long) var8);
            }
            if (!var9.method3653(arg2, var7.field2151, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3675();
        }
        return var5;
    }

    @ObfuscatedName("ge.t(I)V")
    public synchronized void method3538() {
        for (class211 var1 = (class211) this.field2444.method5605(); var1 != null; var1 = (class211) this.field2444.method5608()) {
            var1.method3654();
        }
    }

    @ObfuscatedName("ge.i(I)V")
    public synchronized void method3497() {
        for (class211 var1 = (class211) this.field2444.method5605(); var1 != null; var1 = (class211) this.field2444.method5608()) {
            var1.method3401();
        }
    }

    @ObfuscatedName("ge.m(Lhj;ZI)V")
    public synchronized void method3498(class213 arg0, boolean arg1) {
        this.method3499();
        this.field2462.method3628(arg0.field2522);
        this.field2463 = arg1;
        this.field2445 = 0L;
        int var3 = this.field2462.method3608();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2462.method3609(var4);
            this.field2462.method3632(var4);
            this.field2462.method3610(var4);
        }
        this.field2464 = this.field2462.method3617();
        this.field2465 = this.field2462.field2495[this.field2464];
        this.field2467 = this.field2462.method3616(this.field2465);
    }

    @ObfuscatedName("ge.d(I)V")
    public synchronized void method3499() {
        this.field2462.method3606();
        this.method3511();
    }

    @ObfuscatedName("ge.h(I)Z")
    public synchronized boolean method3500() {
        return this.field2462.method3615();
    }

    @ObfuscatedName("ge.a(III)V")
    public synchronized void method3501(int arg0, int arg1) {
        this.method3502(arg0, arg1);
    }

    @ObfuscatedName("ge.q(III)V")
    public void method3502(int arg0, int arg1) {
        this.field2448[arg0] = arg1;
        this.field2466[arg0] = arg1 & 0xFFFFFF80;
        this.method3573(arg0, arg1);
    }

    @ObfuscatedName("ge.c(III)V")
    public void method3573(int arg0, int arg1) {
        if (this.field2449[arg0] != arg1) {
            this.field2449[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2461[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("ge.j(IIII)V")
    public void method3503(int arg0, int arg1, int arg2) {
        this.method3525(arg0, arg1, 64);
        if ((this.field2454[arg0] & 0x2) != 0) {
            for (class209 var4 = (class209) this.field2468.field2517.method4622(); var4 != null; var4 = (class209) this.field2468.field2517.method4615()) {
                if (var4.field2485 == arg0 && var4.field2484 < 0) {
                    this.field2460[arg0][var4.field2475] = null;
                    this.field2460[arg0][arg1] = var4;
                    int var5 = (var4.field2488 * var4.field2480 >> 12) + var4.field2478;
                    var4.field2478 += arg1 - var4.field2475 << 8;
                    var4.field2488 = var5 - var4.field2478;
                    var4.field2480 = 4096;
                    var4.field2475 = arg1;
                    return;
                }
            }
        }
        class211 var6 = (class211) this.field2444.method5611((long) this.field2449[arg0]);
        if (var6 == null) {
            return;
        }
        class113 var7 = var6.field2509[arg1];
        if (var7 == null) {
            return;
        }
        class209 var8 = new class209();
        var8.field2485 = arg0;
        var8.field2471 = var6;
        var8.field2472 = var7;
        var8.field2473 = var6.field2507[arg1];
        var8.field2474 = var6.field2512[arg1];
        var8.field2475 = arg1;
        var8.field2476 = var6.field2514 * arg2 * arg2 * var6.field2508[arg1] + 1024 >> 11;
        var8.field2482 = var6.field2510[arg1] & 0xFF;
        var8.field2478 = (arg1 << 8) - (var6.field2511[arg1] & 0x7FFF);
        var8.field2481 = 0;
        var8.field2479 = 0;
        var8.field2483 = 0;
        var8.field2484 = -1;
        var8.field2490 = 0;
        if (this.field2442[arg0] == 0) {
            var8.field2477 = class123.method2425(var7, this.method3516(var8), this.method3517(var8), this.method3518(var8));
        } else {
            var8.field2477 = class123.method2425(var7, this.method3516(var8), 0, this.method3518(var8));
            this.method3504(var8, var6.field2511[arg1] < 0);
        }
        if (var6.field2511[arg1] < 0) {
            var8.field2477.method2443(-1);
        }
        if (var8.field2474 >= 0) {
            class209 var9 = this.field2461[arg0][var8.field2474];
            if (var9 != null && var9.field2484 < 0) {
                this.field2460[arg0][var9.field2475] = null;
                var9.field2484 = 0;
            }
            this.field2461[arg0][var8.field2474] = var8;
        }
        this.field2468.field2517.method4616(var8);
        this.field2460[arg0][arg1] = var8;
    }

    @ObfuscatedName("ge.r(Lhe;ZI)V")
    public void method3504(class209 arg0, boolean arg1) {
        int var3 = arg0.field2472.field1417.length;
        int var5;
        if (arg1 && arg0.field2472.field1418) {
            int var4 = var3 + var3 - arg0.field2472.field1416;
            var5 = (int) ((long) this.field2442[arg0.field2485] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2477.method2551(true);
            }
        } else {
            var5 = (int) ((long) this.field2442[arg0.field2485] * (long) var3 >> 6);
        }
        arg0.field2477.method2432(var5);
    }

    @ObfuscatedName("ge.u(IIIS)V")
    public void method3525(int arg0, int arg1, int arg2) {
        class209 var4 = this.field2460[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2460[arg0][arg1] = null;
        if ((this.field2454[arg0] & 0x2) == 0) {
            var4.field2484 = 0;
            return;
        }
        for (class209 var5 = (class209) this.field2468.field2517.method4621(); var5 != null; var5 = (class209) this.field2468.field2517.method4641()) {
            if (var4.field2485 == var5.field2485 && var5.field2484 < 0 && var4 != var5) {
                var4.field2484 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("ge.p(IIII)V")
    public void method3505(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("ge.b(III)V")
    public void method3533(int arg0, int arg1) {
    }

    @ObfuscatedName("ge.l(IIB)V")
    public void method3507(int arg0, int arg1) {
        this.field2451[arg0] = arg1;
    }

    @ObfuscatedName("ge.e(II)V")
    public void method3508(int arg0) {
        for (class209 var2 = (class209) this.field2468.field2517.method4621(); var2 != null; var2 = (class209) this.field2468.field2517.method4641()) {
            if (arg0 < 0 || var2.field2485 == arg0) {
                if (var2.field2477 != null) {
                    var2.field2477.method2463(Statics.field1448 / 100);
                    if (var2.field2477.method2441()) {
                        this.field2468.field2518.method2195(var2.field2477);
                    }
                    var2.method3600();
                }
                if (var2.field2484 < 0) {
                    this.field2460[var2.field2485][var2.field2475] = null;
                }
                var2.method3401();
            }
        }
    }

    @ObfuscatedName("ge.ab(II)V")
    public void method3496(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3496(var2);
            }
            return;
        }
        this.field2450[arg0] = 12800;
        this.field2446[arg0] = 8192;
        this.field2447[arg0] = 16383;
        this.field2451[arg0] = 8192;
        this.field2452[arg0] = 0;
        this.field2453[arg0] = 8192;
        this.method3519(arg0);
        this.method3564(arg0);
        this.field2454[arg0] = 0;
        this.field2455[arg0] = 32767;
        this.field2456[arg0] = 256;
        this.field2442[arg0] = 0;
        this.method3515(arg0, 8192);
    }

    @ObfuscatedName("ge.ag(II)V")
    public void method3513(int arg0) {
        for (class209 var2 = (class209) this.field2468.field2517.method4621(); var2 != null; var2 = (class209) this.field2468.field2517.method4641()) {
            if ((arg0 < 0 || var2.field2485 == arg0) && var2.field2484 < 0) {
                this.field2460[var2.field2485][var2.field2475] = null;
                var2.field2484 = 0;
            }
        }
    }

    @ObfuscatedName("ge.ao(B)V")
    public void method3511() {
        this.method3508(-1);
        this.method3496(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2449[var1] = this.field2448[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2466[var2] = this.field2448[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("ge.ae(II)V")
    public void method3519(int arg0) {
        if ((this.field2454[arg0] & 0x2) == 0) {
            return;
        }
        for (class209 var2 = (class209) this.field2468.field2517.method4621(); var2 != null; var2 = (class209) this.field2468.field2517.method4641()) {
            if (var2.field2485 == arg0 && this.field2460[arg0][var2.field2475] == null && var2.field2484 < 0) {
                var2.field2484 = 0;
            }
        }
    }

    @ObfuscatedName("ge.ap(IB)V")
    public void method3564(int arg0) {
        if ((this.field2454[arg0] & 0x4) == 0) {
            return;
        }
        for (class209 var2 = (class209) this.field2468.field2517.method4621(); var2 != null; var2 = (class209) this.field2468.field2517.method4641()) {
            if (var2.field2485 == arg0) {
                var2.field2487 = 0;
            }
        }
    }

    @ObfuscatedName("ge.au(II)V")
    public void method3514(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3525(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3503(var6, var7, var8);
            } else {
                this.method3525(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3505(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2466[var12] = (var14 << 14) + (this.field2466[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2466[var12] = (var14 << 7) + (this.field2466[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2452[var12] = (var14 << 7) + (this.field2452[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2452[var12] = (this.field2452[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2453[var12] = (var14 << 7) + (this.field2453[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2453[var12] = (this.field2453[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2450[var12] = (var14 << 7) + (this.field2450[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2450[var12] = (this.field2450[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2446[var12] = (var14 << 7) + (this.field2446[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2446[var12] = (this.field2446[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2447[var12] = (var14 << 7) + (this.field2447[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2447[var12] = (this.field2447[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2454[var12] |= 0x1;
                } else {
                    this.field2454[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2454[var12] |= 0x2;
                } else {
                    this.method3519(var12);
                    this.field2454[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2455[var12] = (var14 << 7) + (this.field2455[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2455[var12] = (this.field2455[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2455[var12] = (var14 << 7) + (this.field2455[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2455[var12] = (this.field2455[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3508(var12);
            }
            if (var13 == 121) {
                this.method3496(var12);
            }
            if (var13 == 123) {
                this.method3513(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2455[var12];
                if (var15 == 16384) {
                    this.field2456[var12] = (var14 << 7) + (this.field2456[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2455[var12];
                if (var16 == 16384) {
                    this.field2456[var12] = (this.field2456[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2442[var12] = (var14 << 7) + (this.field2442[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2442[var12] = (this.field2442[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2454[var12] |= 0x4;
                } else {
                    this.method3564(var12);
                    this.field2454[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3515(var12, (var14 << 7) + (this.field2458[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3515(var12, (this.field2458[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3573(var17, this.field2466[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3533(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method3507(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3511();
            }
        }
    }

    @ObfuscatedName("ge.ax(III)V")
    public void method3515(int arg0, int arg1) {
        this.field2458[arg0] = arg1;
        this.field2443[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("ge.ad(Lhe;I)I")
    public int method3516(class209 arg0) {
        int var2 = (arg0.field2488 * arg0.field2480 >> 12) + arg0.field2478;
        int var3 = ((this.field2451[arg0.field2485] - 8192) * this.field2456[arg0.field2485] >> 12) + var2;
        class206 var4 = arg0.field2473;
        if (var4.field2432 > 0 && (var4.field2431 > 0 || this.field2452[arg0.field2485] > 0)) {
            int var5 = var4.field2431 << 2;
            int var6 = var4.field2433 << 1;
            if (arg0.field2486 < var6) {
                var5 = arg0.field2486 * var5 / var6;
            }
            int var7 = (this.field2452[arg0.field2485] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2470 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2472.field1414 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1448 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("ge.ai(Lhe;I)I")
    public int method3517(class209 arg0) {
        class206 var2 = arg0.field2473;
        int var3 = this.field2450[arg0.field2485] * this.field2447[arg0.field2485] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2476 * var4 + 16384 >> 15;
        int var6 = this.field2459 * var5 + 128 >> 8;
        if (var2.field2426 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2481 * 1.953125E-5D * (double) var2.field2426) + 0.5D);
        }
        if (var2.field2427 != null) {
            int var7 = arg0.field2479;
            int var8 = var2.field2427[arg0.field2483 + 1];
            if (arg0.field2483 < var2.field2427.length - 2) {
                int var9 = (var2.field2427[arg0.field2483] & 0xFF) << 8;
                int var10 = (var2.field2427[arg0.field2483 + 2] & 0xFF) << 8;
                var8 += (var2.field2427[arg0.field2483 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2484 > 0 && var2.field2434 != null) {
            int var11 = arg0.field2484;
            int var12 = var2.field2434[arg0.field2490 + 1];
            if (arg0.field2490 < var2.field2434.length - 2) {
                int var13 = (var2.field2434[arg0.field2490] & 0xFF) << 8;
                int var14 = (var2.field2434[arg0.field2490 + 2] & 0xFF) << 8;
                var12 += (var2.field2434[arg0.field2490 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("ge.ay(Lhe;I)I")
    public int method3518(class209 arg0) {
        int var2 = this.field2446[arg0.field2485];
        return var2 < 8192 ? arg0.field2482 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2482) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("ge.o()Ldc;")
    public synchronized class125 method2199() {
        return this.field2468;
    }

    @ObfuscatedName("ge.x()Ldc;")
    public synchronized class125 method2201() {
        return null;
    }

    @ObfuscatedName("ge.w()I")
    public synchronized int method2202() {
        return 0;
    }

    @ObfuscatedName("ge.g([III)V")
    public synchronized void method2203(int[] arg0, int arg1, int arg2) {
        if (this.field2462.method3615()) {
            int var4 = this.field2457 * this.field2462.field2493 / Statics.field1448;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2445;
                if (this.field2467 - var5 >= 0L) {
                    this.field2445 = var5;
                    break;
                }
                int var7 = (int) ((this.field2467 - this.field2445 + (long) var4 - 1L) / (long) var4);
                this.field2445 += (long) var4 * (long) var7;
                this.field2468.method2203(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3570();
            } while (this.field2462.method3615());
        }
        this.field2468.method2203(arg0, arg1, arg2);
    }

    @ObfuscatedName("ge.n(I)V")
    public synchronized void method2214(int arg0) {
        if (this.field2462.method3615()) {
            int var2 = this.field2457 * this.field2462.field2493 / Statics.field1448;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2445;
                if (this.field2467 - var3 >= 0L) {
                    this.field2445 = var3;
                    break;
                }
                int var5 = (int) ((this.field2467 - this.field2445 + (long) var2 - 1L) / (long) var2);
                this.field2445 += (long) var2 * (long) var5;
                this.field2468.method2214(var5);
                arg0 -= var5;
                this.method3570();
            } while (this.field2462.method3615());
        }
        this.field2468.method2214(arg0);
    }

    @ObfuscatedName("ge.aj(I)V")
    public void method3570() {
        int var1 = this.field2464;
        int var2 = this.field2465;
        long var3 = this.field2467;
        while (this.field2465 == var2) {
            while (this.field2462.field2495[var1] == var2) {
                this.field2462.method3609(var1);
                int var5 = this.field2462.method3642(var1);
                if (var5 == 1) {
                    this.field2462.method3611();
                    this.field2462.method3610(var1);
                    if (this.field2462.method3618()) {
                        if (!this.field2463 || var2 == 0) {
                            this.method3511();
                            this.field2462.method3606();
                            return;
                        }
                        this.field2462.method3604(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3514(var5);
                }
                this.field2462.method3632(var1);
                this.field2462.method3610(var1);
            }
            var1 = this.field2462.method3617();
            var2 = this.field2462.field2495[var1];
            var3 = this.field2462.method3616(var2);
        }
        this.field2464 = var1;
        this.field2465 = var2;
        this.field2467 = var3;
    }

    @ObfuscatedName("ge.af(Lhe;I)Z")
    public boolean method3522(class209 arg0) {
        if (arg0.field2477 != null) {
            return false;
        }
        if (arg0.field2484 >= 0) {
            arg0.method3401();
            if (arg0.field2474 > 0 && this.field2461[arg0.field2485][arg0.field2474] == arg0) {
                this.field2461[arg0.field2485][arg0.field2474] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("ge.ak(Lhe;[IIII)Z")
    public boolean method3523(class209 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2489 = Statics.field1448 / 100;
        if (arg0.field2484 >= 0 && arg0.field2477 == null || arg0.field2477.method2440()) {
            arg0.method3600();
            arg0.method3401();
            if (arg0.field2474 > 0 && this.field2461[arg0.field2485][arg0.field2474] == arg0) {
                this.field2461[arg0.field2485][arg0.field2474] = null;
            }
            return true;
        }
        int var5 = arg0.field2480;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2453[arg0.field2485] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2480 = var6;
        }
        arg0.field2477.method2438(this.method3516(arg0));
        class206 var7 = arg0.field2473;
        boolean var8 = false;
        arg0.field2486++;
        arg0.field2470 += var7.field2432;
        double var9 = (double) ((arg0.field2475 - 60 << 8) + (arg0.field2488 * arg0.field2480 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2426 > 0) {
            if (var7.field2430 > 0) {
                arg0.field2481 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2430 * var9) + 0.5D);
            } else {
                arg0.field2481 += 128;
            }
        }
        if (var7.field2427 != null) {
            if (var7.field2428 > 0) {
                arg0.field2479 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2428 * var9) + 0.5D);
            } else {
                arg0.field2479 += 128;
            }
            while (arg0.field2483 < var7.field2427.length - 2 && arg0.field2479 > (var7.field2427[arg0.field2483 + 2] & 0xFF) << 8) {
                arg0.field2483 += 2;
            }
            if (arg0.field2483 == var7.field2427.length - 2 && var7.field2427[arg0.field2483 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2484 >= 0 && var7.field2434 != null && (this.field2454[arg0.field2485] & 0x1) == 0 && (arg0.field2474 < 0 || this.field2461[arg0.field2485][arg0.field2474] != arg0)) {
            if (var7.field2429 > 0) {
                arg0.field2484 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2429 * var9) + 0.5D);
            } else {
                arg0.field2484 += 128;
            }
            while (arg0.field2490 < var7.field2434.length - 2 && arg0.field2484 > (var7.field2434[arg0.field2490 + 2] & 0xFF) << 8) {
                arg0.field2490 += 2;
            }
            if (arg0.field2490 == var7.field2434.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2477.method2436(arg0.field2489, this.method3517(arg0), this.method3518(arg0));
            return false;
        }
        arg0.field2477.method2463(arg0.field2489);
        if (arg1 == null) {
            arg0.field2477.method2214(arg3);
        } else {
            arg0.field2477.method2203(arg1, arg2, arg3);
        }
        if (arg0.field2477.method2441()) {
            this.field2468.field2518.method2195(arg0.field2477);
        }
        arg0.method3600();
        if (arg0.field2484 >= 0) {
            arg0.method3401();
            if (arg0.field2474 > 0 && this.field2461[arg0.field2485][arg0.field2474] == arg0) {
                this.field2461[arg0.field2485][arg0.field2474] = null;
            }
        }
        return true;
    }
}
