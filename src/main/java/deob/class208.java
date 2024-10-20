package deob;

@ObfuscatedName("gw")
public class class208 extends class125 {

    @ObfuscatedName("gw.m")
    public class328 field2452 = new class328(128);

    @ObfuscatedName("gw.o")
    public int field2473 = 256;

    @ObfuscatedName("gw.q")
    public int field2463 = 1000000;

    @ObfuscatedName("gw.j")
    public int[] field2451 = new int[16];

    @ObfuscatedName("gw.p")
    public int[] field2459 = new int[16];

    @ObfuscatedName("gw.g")
    public int[] field2453 = new int[16];

    @ObfuscatedName("gw.n")
    public int[] field2454 = new int[16];

    @ObfuscatedName("gw.u")
    public int[] field2457 = new int[16];

    @ObfuscatedName("gw.a")
    public int[] field2456 = new int[16];

    @ObfuscatedName("gw.z")
    public int[] field2449 = new int[16];

    @ObfuscatedName("gw.y")
    public int[] field2458 = new int[16];

    @ObfuscatedName("gw.c")
    public int[] field2460 = new int[16];

    @ObfuscatedName("gw.e")
    public int[] field2461 = new int[16];

    @ObfuscatedName("gw.l")
    public int[] field2462 = new int[16];

    @ObfuscatedName("gw.t")
    public int[] field2448 = new int[16];

    @ObfuscatedName("gw.x")
    public int[] field2464 = new int[16];

    @ObfuscatedName("gw.b")
    public int[] field2465 = new int[16];

    @ObfuscatedName("gw.i")
    public int[] field2455 = new int[16];

    @ObfuscatedName("gw.f")
    public class209[][] field2467 = new class209[16][128];

    @ObfuscatedName("gw.ah")
    public class209[][] field2468 = new class209[16][128];

    @ObfuscatedName("gw.ai")
    public class210 field2469 = new class210();

    @ObfuscatedName("gw.ao")
    public boolean field2470;

    @ObfuscatedName("gw.ae")
    public int field2471;

    @ObfuscatedName("gw.ax")
    public int field2472;

    @ObfuscatedName("gw.ag")
    public long field2466;

    @ObfuscatedName("gw.ab")
    public long field2474;

    @ObfuscatedName("gw.am")
    public class212 field2475 = new class212(this);

    public class208() {
        this.method3491();
    }

    @ObfuscatedName("gw.m(II)V")
    public synchronized void method3473(int arg0) {
        this.field2473 = arg0;
    }

    @ObfuscatedName("gw.o(I)I")
    public int method3474() {
        return this.field2473;
    }

    @ObfuscatedName("gw.q(Lhz;Lic;Ldo;II)Z")
    public synchronized boolean method3564(class213 arg0, class244 arg1, class118 arg2, int arg3) {
        arg0.method3664();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class187 var7 = (class187) arg0.field2529.method5644(); var7 != null; var7 = (class187) arg0.field2529.method5642()) {
            int var8 = (int) var7.field2152;
            class211 var9 = (class211) this.field2452.method5641((long) var8);
            if (var9 == null) {
                var9 = class211.method2035(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field2452.method5643(var9, (long) var8);
            }
            if (!var9.method3649(arg2, var7.field2147, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3665();
        }
        return var5;
    }

    @ObfuscatedName("gw.j(B)V")
    public synchronized void method3476() {
        for (class211 var1 = (class211) this.field2452.method5644(); var1 != null; var1 = (class211) this.field2452.method5642()) {
            var1.method3650();
        }
    }

    @ObfuscatedName("gw.p(I)V")
    public synchronized void method3477() {
        for (class211 var1 = (class211) this.field2452.method5644(); var1 != null; var1 = (class211) this.field2452.method5642()) {
            var1.method3388();
        }
    }

    @ObfuscatedName("gw.z(Lhz;ZI)V")
    public synchronized void method3478(class213 arg0, boolean arg1) {
        this.method3504();
        this.field2469.method3595(arg0.field2530);
        this.field2470 = arg1;
        this.field2466 = 0L;
        int var3 = this.field2469.method3598();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2469.method3594(var4);
            this.field2469.method3601(var4);
            this.field2469.method3643(var4);
        }
        this.field2471 = this.field2469.method3613();
        this.field2472 = this.field2469.field2502[this.field2471];
        this.field2474 = this.field2469.method3607(this.field2472);
    }

    @ObfuscatedName("gw.y(B)V")
    public synchronized void method3504() {
        this.field2469.method3596();
        this.method3491();
    }

    @ObfuscatedName("gw.c(I)Z")
    public synchronized boolean method3480() {
        return this.field2469.method3597();
    }

    @ObfuscatedName("gw.h(IIB)V")
    public synchronized void method3557(int arg0, int arg1) {
        this.method3538(arg0, arg1);
    }

    @ObfuscatedName("gw.k(III)V")
    public void method3538(int arg0, int arg1) {
        this.field2454[arg0] = arg1;
        this.field2456[arg0] = arg1 & 0xFFFFFF80;
        this.method3482(arg0, arg1);
    }

    @ObfuscatedName("gw.r(IIB)V")
    public void method3482(int arg0, int arg1) {
        if (this.field2457[arg0] != arg1) {
            this.field2457[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2468[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("gw.d(IIIS)V")
    public void method3483(int arg0, int arg1, int arg2) {
        this.method3485(arg0, arg1, 64);
        if ((this.field2461[arg0] & 0x2) != 0) {
            for (class209 var4 = (class209) this.field2475.field2525.method4652(); var4 != null; var4 = (class209) this.field2475.field2525.method4654()) {
                if (var4.field2480 == arg0 && var4.field2491 < 0) {
                    this.field2467[arg0][var4.field2482] = null;
                    this.field2467[arg0][arg1] = var4;
                    int var5 = (var4.field2492 * var4.field2486 >> 12) + var4.field2485;
                    var4.field2485 += arg1 - var4.field2482 << 8;
                    var4.field2486 = var5 - var4.field2485;
                    var4.field2492 = 4096;
                    var4.field2482 = arg1;
                    return;
                }
            }
        }
        class211 var6 = (class211) this.field2452.method5641((long) this.field2457[arg0]);
        if (var6 == null) {
            return;
        }
        class113 var7 = var6.field2516[arg1];
        if (var7 == null) {
            return;
        }
        class209 var8 = new class209();
        var8.field2480 = arg0;
        var8.field2483 = var6;
        var8.field2488 = var7;
        var8.field2478 = var6.field2520[arg1];
        var8.field2481 = var6.field2523[arg1];
        var8.field2482 = arg1;
        var8.field2500 = var6.field2521 * arg2 * arg2 * var6.field2518[arg1] + 1024 >> 11;
        var8.field2484 = var6.field2519[arg1] & 0xFF;
        var8.field2485 = (arg1 << 8) - (var6.field2522[arg1] & 0x7FFF);
        var8.field2497 = 0;
        var8.field2489 = 0;
        var8.field2490 = 0;
        var8.field2491 = -1;
        var8.field2494 = 0;
        if (this.field2464[arg0] == 0) {
            var8.field2495 = class123.method2420(var7, this.method3496(var8), this.method3580(var8), this.method3535(var8));
        } else {
            var8.field2495 = class123.method2420(var7, this.method3496(var8), 0, this.method3535(var8));
            this.method3488(var8, var6.field2522[arg1] < 0);
        }
        if (var6.field2522[arg1] < 0) {
            var8.field2495.method2422(-1);
        }
        if (var8.field2481 >= 0) {
            class209 var9 = this.field2468[arg0][var8.field2481];
            if (var9 != null && var9.field2491 < 0) {
                this.field2467[arg0][var9.field2482] = null;
                var9.field2491 = 0;
            }
            this.field2468[arg0][var8.field2481] = var8;
        }
        this.field2475.field2525.method4644(var8);
        this.field2467[arg0][arg1] = var8;
    }

    @ObfuscatedName("gw.e(Lhm;ZI)V")
    public void method3488(class209 arg0, boolean arg1) {
        int var3 = arg0.field2488.field1423.length;
        int var5;
        if (arg1 && arg0.field2488.field1424) {
            int var4 = var3 + var3 - arg0.field2488.field1422;
            var5 = (int) ((long) this.field2464[arg0.field2480] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2495.method2429(true);
            }
        } else {
            var5 = (int) ((long) this.field2464[arg0.field2480] * (long) var3 >> 6);
        }
        arg0.field2495.method2428(var5);
    }

    @ObfuscatedName("gw.l(IIIB)V")
    public void method3485(int arg0, int arg1, int arg2) {
        class209 var4 = this.field2467[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2467[arg0][arg1] = null;
        if ((this.field2461[arg0] & 0x2) == 0) {
            var4.field2491 = 0;
            return;
        }
        for (class209 var5 = (class209) this.field2475.field2525.method4651(); var5 != null; var5 = (class209) this.field2475.field2525.method4656()) {
            if (var4.field2480 == var5.field2480 && var5.field2491 < 0 && var4 != var5) {
                var4.field2491 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("gw.t(IIIB)V")
    public void method3486(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("gw.x(IIB)V")
    public void method3487(int arg0, int arg1) {
    }

    @ObfuscatedName("gw.ah(IIB)V")
    public void method3583(int arg0, int arg1) {
        this.field2449[arg0] = arg1;
    }

    @ObfuscatedName("gw.ai(II)V")
    public void method3493(int arg0) {
        for (class209 var2 = (class209) this.field2475.field2525.method4651(); var2 != null; var2 = (class209) this.field2475.field2525.method4656()) {
            if (arg0 < 0 || var2.field2480 == arg0) {
                if (var2.field2495 != null) {
                    var2.field2495.method2470(Statics.field3114 / 100);
                    if (var2.field2495.method2437()) {
                        this.field2475.field2528.method2193(var2.field2495);
                    }
                    var2.method3585();
                }
                if (var2.field2491 < 0) {
                    this.field2467[var2.field2480][var2.field2482] = null;
                }
                var2.method3388();
            }
        }
    }

    @ObfuscatedName("gw.ao(II)V")
    public void method3574(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3574(var2);
            }
            return;
        }
        this.field2451[arg0] = 12800;
        this.field2459[arg0] = 8192;
        this.field2453[arg0] = 16383;
        this.field2449[arg0] = 8192;
        this.field2458[arg0] = 0;
        this.field2460[arg0] = 8192;
        this.method3492(arg0);
        this.method3551(arg0);
        this.field2461[arg0] = 0;
        this.field2462[arg0] = 32767;
        this.field2448[arg0] = 256;
        this.field2464[arg0] = 0;
        this.method3495(arg0, 8192);
    }

    @ObfuscatedName("gw.ae(II)V")
    public void method3490(int arg0) {
        for (class209 var2 = (class209) this.field2475.field2525.method4651(); var2 != null; var2 = (class209) this.field2475.field2525.method4656()) {
            if ((arg0 < 0 || var2.field2480 == arg0) && var2.field2491 < 0) {
                this.field2467[var2.field2480][var2.field2482] = null;
                var2.field2491 = 0;
            }
        }
    }

    @ObfuscatedName("gw.ax(B)V")
    public void method3491() {
        this.method3493(-1);
        this.method3574(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2457[var1] = this.field2454[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2456[var2] = this.field2454[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("gw.an(IB)V")
    public void method3492(int arg0) {
        if ((this.field2461[arg0] & 0x2) == 0) {
            return;
        }
        for (class209 var2 = (class209) this.field2475.field2525.method4651(); var2 != null; var2 = (class209) this.field2475.field2525.method4656()) {
            if (var2.field2480 == arg0 && this.field2467[arg0][var2.field2482] == null && var2.field2491 < 0) {
                var2.field2491 = 0;
            }
        }
    }

    @ObfuscatedName("gw.av(II)V")
    public void method3551(int arg0) {
        if ((this.field2461[arg0] & 0x4) == 0) {
            return;
        }
        for (class209 var2 = (class209) this.field2475.field2525.method4651(); var2 != null; var2 = (class209) this.field2475.field2525.method4656()) {
            if (var2.field2480 == arg0) {
                var2.field2479 = 0;
            }
        }
    }

    @ObfuscatedName("gw.at(II)V")
    public void method3481(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3485(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3483(var6, var7, var8);
            } else {
                this.method3485(var6, var7, 64);
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
                this.field2456[var12] = (var14 << 14) + (this.field2456[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2456[var12] = (var14 << 7) + (this.field2456[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2458[var12] = (var14 << 7) + (this.field2458[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2458[var12] = (this.field2458[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2460[var12] = (var14 << 7) + (this.field2460[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2460[var12] = (this.field2460[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2451[var12] = (var14 << 7) + (this.field2451[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2451[var12] = (this.field2451[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2459[var12] = (var14 << 7) + (this.field2459[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2459[var12] = (this.field2459[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2453[var12] = (var14 << 7) + (this.field2453[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2453[var12] = (this.field2453[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2461[var12] |= 0x1;
                } else {
                    this.field2461[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2461[var12] |= 0x2;
                } else {
                    this.method3492(var12);
                    this.field2461[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2462[var12] = (var14 << 7) + (this.field2462[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2462[var12] = (this.field2462[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2462[var12] = (var14 << 7) + (this.field2462[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2462[var12] = (this.field2462[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3493(var12);
            }
            if (var13 == 121) {
                this.method3574(var12);
            }
            if (var13 == 123) {
                this.method3490(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2462[var12];
                if (var15 == 16384) {
                    this.field2448[var12] = (var14 << 7) + (this.field2448[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2462[var12];
                if (var16 == 16384) {
                    this.field2448[var12] = (this.field2448[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2464[var12] = (var14 << 7) + (this.field2464[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2464[var12] = (this.field2464[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2461[var12] |= 0x4;
                } else {
                    this.method3551(var12);
                    this.field2461[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3495(var12, (var14 << 7) + (this.field2465[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3495(var12, (this.field2465[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3482(var17, this.field2456[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3487(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method3583(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3491();
            }
        }
    }

    @ObfuscatedName("gw.aa(III)V")
    public void method3495(int arg0, int arg1) {
        this.field2465[arg0] = arg1;
        this.field2455[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("gw.aw(Lhm;I)I")
    public int method3496(class209 arg0) {
        int var2 = (arg0.field2492 * arg0.field2486 >> 12) + arg0.field2485;
        int var3 = ((this.field2449[arg0.field2480] - 8192) * this.field2448[arg0.field2480] >> 12) + var2;
        class206 var4 = arg0.field2478;
        if (var4.field2432 > 0 && (var4.field2431 > 0 || this.field2458[arg0.field2480] > 0)) {
            int var5 = var4.field2431 << 2;
            int var6 = var4.field2426 << 1;
            if (arg0.field2493 < var6) {
                var5 = arg0.field2493 * var5 / var6;
            }
            int var7 = (this.field2458[arg0.field2480] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2477 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2488.field1420 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field3114 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("gw.az(Lhm;I)I")
    public int method3580(class209 arg0) {
        class206 var2 = arg0.field2478;
        int var3 = this.field2451[arg0.field2480] * this.field2453[arg0.field2480] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2500 * var4 + 16384 >> 15;
        int var6 = this.field2473 * var5 + 128 >> 8;
        if (var2.field2427 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2497 * 1.953125E-5D * (double) var2.field2427) + 0.5D);
        }
        if (var2.field2425 != null) {
            int var7 = arg0.field2489;
            int var8 = var2.field2425[arg0.field2490 + 1];
            if (arg0.field2490 < var2.field2425.length - 2) {
                int var9 = (var2.field2425[arg0.field2490] & 0xFF) << 8;
                int var10 = (var2.field2425[arg0.field2490 + 2] & 0xFF) << 8;
                var8 += (var2.field2425[arg0.field2490 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2491 > 0 && var2.field2430 != null) {
            int var11 = arg0.field2491;
            int var12 = var2.field2430[arg0.field2494 + 1];
            if (arg0.field2494 < var2.field2430.length - 2) {
                int var13 = (var2.field2430[arg0.field2494] & 0xFF) << 8;
                int var14 = (var2.field2430[arg0.field2494 + 2] & 0xFF) << 8;
                var12 += (var2.field2430[arg0.field2494 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("gw.aq(Lhm;B)I")
    public int method3535(class209 arg0) {
        int var2 = this.field2459[arg0.field2480];
        return var2 < 8192 ? arg0.field2484 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2484) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("gw.g()Ldf;")
    public synchronized class125 method2198() {
        return this.field2475;
    }

    @ObfuscatedName("gw.n()Ldf;")
    public synchronized class125 method2199() {
        return null;
    }

    @ObfuscatedName("gw.u()I")
    public synchronized int method2200() {
        return 0;
    }

    @ObfuscatedName("gw.a([III)V")
    public synchronized void method2206(int[] arg0, int arg1, int arg2) {
        if (this.field2469.method3597()) {
            int var4 = this.field2463 * this.field2469.field2505 / Statics.field3114;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2466;
                if (this.field2474 - var5 >= 0L) {
                    this.field2466 = var5;
                    break;
                }
                int var7 = (int) ((this.field2474 - this.field2466 + (long) var4 - 1L) / (long) var4);
                this.field2466 += (long) var4 * (long) var7;
                this.field2475.method2206(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3502();
            } while (this.field2469.method3597());
        }
        this.field2475.method2206(arg0, arg1, arg2);
    }

    @ObfuscatedName("gw.w(I)V")
    public synchronized void method2203(int arg0) {
        if (this.field2469.method3597()) {
            int var2 = this.field2463 * this.field2469.field2505 / Statics.field3114;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2466;
                if (this.field2474 - var3 >= 0L) {
                    this.field2466 = var3;
                    break;
                }
                int var5 = (int) ((this.field2474 - this.field2466 + (long) var2 - 1L) / (long) var2);
                this.field2466 += (long) var2 * (long) var5;
                this.field2475.method2203(var5);
                arg0 -= var5;
                this.method3502();
            } while (this.field2469.method3597());
        }
        this.field2475.method2203(arg0);
    }

    @ObfuscatedName("gw.ay(I)V")
    public void method3502() {
        int var1 = this.field2471;
        int var2 = this.field2472;
        long var3 = this.field2474;
        while (this.field2472 == var2) {
            while (this.field2469.field2502[var1] == var2) {
                this.field2469.method3594(var1);
                int var5 = this.field2469.method3593(var1);
                if (var5 == 1) {
                    this.field2469.method3600();
                    this.field2469.method3643(var1);
                    if (this.field2469.method3629()) {
                        if (!this.field2470 || var2 == 0) {
                            this.method3491();
                            this.field2469.method3596();
                            return;
                        }
                        this.field2469.method3641(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3481(var5);
                }
                this.field2469.method3601(var1);
                this.field2469.method3643(var1);
            }
            var1 = this.field2469.method3613();
            var2 = this.field2469.field2502[var1];
            var3 = this.field2469.method3607(var2);
        }
        this.field2471 = var1;
        this.field2472 = var2;
        this.field2474 = var3;
    }

    @ObfuscatedName("gw.au(Lhm;I)Z")
    public boolean method3500(class209 arg0) {
        if (arg0.field2495 != null) {
            return false;
        }
        if (arg0.field2491 >= 0) {
            arg0.method3388();
            if (arg0.field2481 > 0 && this.field2468[arg0.field2480][arg0.field2481] == arg0) {
                this.field2468[arg0.field2480][arg0.field2481] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("gw.aj(Lhm;[IIII)Z")
    public boolean method3520(class209 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2496 = Statics.field3114 / 100;
        if (arg0.field2491 >= 0 && arg0.field2495 == null || arg0.field2495.method2436()) {
            arg0.method3585();
            arg0.method3388();
            if (arg0.field2481 > 0 && this.field2468[arg0.field2480][arg0.field2481] == arg0) {
                this.field2468[arg0.field2480][arg0.field2481] = null;
            }
            return true;
        }
        int var5 = arg0.field2492;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2460[arg0.field2480] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2492 = var6;
        }
        arg0.field2495.method2434(this.method3496(arg0));
        class206 var7 = arg0.field2478;
        boolean var8 = false;
        arg0.field2493++;
        arg0.field2477 += var7.field2432;
        double var9 = (double) ((arg0.field2482 - 60 << 8) + (arg0.field2492 * arg0.field2486 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2427 > 0) {
            if (var7.field2436 > 0) {
                arg0.field2497 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2436 * var9) + 0.5D);
            } else {
                arg0.field2497 += 128;
            }
        }
        if (var7.field2425 != null) {
            if (var7.field2428 > 0) {
                arg0.field2489 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2428 * var9) + 0.5D);
            } else {
                arg0.field2489 += 128;
            }
            while (arg0.field2490 < var7.field2425.length - 2 && arg0.field2489 > (var7.field2425[arg0.field2490 + 2] & 0xFF) << 8) {
                arg0.field2490 += 2;
            }
            if (arg0.field2490 == var7.field2425.length - 2 && var7.field2425[arg0.field2490 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2491 >= 0 && var7.field2430 != null && (this.field2461[arg0.field2480] & 0x1) == 0 && (arg0.field2481 < 0 || this.field2468[arg0.field2480][arg0.field2481] != arg0)) {
            if (var7.field2429 > 0) {
                arg0.field2491 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2429 * var9) + 0.5D);
            } else {
                arg0.field2491 += 128;
            }
            while (arg0.field2494 < var7.field2430.length - 2 && arg0.field2491 > (var7.field2430[arg0.field2494 + 2] & 0xFF) << 8) {
                arg0.field2494 += 2;
            }
            if (arg0.field2494 == var7.field2430.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2495.method2511(arg0.field2496, this.method3580(arg0), this.method3535(arg0));
            return false;
        }
        arg0.field2495.method2470(arg0.field2496);
        if (arg1 == null) {
            arg0.field2495.method2203(arg3);
        } else {
            arg0.field2495.method2206(arg1, arg2, arg3);
        }
        if (arg0.field2495.method2437()) {
            this.field2475.field2528.method2193(arg0.field2495);
        }
        arg0.method3585();
        if (arg0.field2491 >= 0) {
            arg0.method3388();
            if (arg0.field2481 > 0 && this.field2468[arg0.field2480][arg0.field2481] == arg0) {
                this.field2468[arg0.field2480][arg0.field2481] = null;
            }
        }
        return true;
    }
}
