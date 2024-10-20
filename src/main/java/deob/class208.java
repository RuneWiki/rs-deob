package deob;

@ObfuscatedName("gg")
public class class208 extends class125 {

    @ObfuscatedName("gg.n")
    public class329 field2455 = new class329(128);

    @ObfuscatedName("gg.v")
    public int field2443 = 256;

    @ObfuscatedName("gg.d")
    public int field2444 = 1000000;

    @ObfuscatedName("gg.c")
    public int[] field2445 = new int[16];

    @ObfuscatedName("gg.y")
    public int[] field2448 = new int[16];

    @ObfuscatedName("gg.h")
    public int[] field2447 = new int[16];

    @ObfuscatedName("gg.z")
    public int[] field2446 = new int[16];

    @ObfuscatedName("gg.e")
    public int[] field2449 = new int[16];

    @ObfuscatedName("gg.q")
    public int[] field2464 = new int[16];

    @ObfuscatedName("gg.l")
    public int[] field2442 = new int[16];

    @ObfuscatedName("gg.s")
    public int[] field2452 = new int[16];

    @ObfuscatedName("gg.b")
    public int[] field2453 = new int[16];

    @ObfuscatedName("gg.u")
    public int[] field2459 = new int[16];

    @ObfuscatedName("gg.t")
    public int[] field2456 = new int[16];

    @ObfuscatedName("gg.p")
    public int[] field2457 = new int[16];

    @ObfuscatedName("gg.m")
    public int[] field2461 = new int[16];

    @ObfuscatedName("gg.r")
    public int[] field2458 = new int[16];

    @ObfuscatedName("gg.o")
    public int[] field2469 = new int[16];

    @ObfuscatedName("gg.j")
    public class209[][] field2451 = new class209[16][128];

    @ObfuscatedName("gg.ay")
    public class209[][] field2462 = new class209[16][128];

    @ObfuscatedName("gg.am")
    public class210 field2463 = new class210();

    @ObfuscatedName("gg.ag")
    public boolean field2460;

    @ObfuscatedName("gg.ae")
    public int field2465;

    @ObfuscatedName("gg.ac")
    public int field2466;

    @ObfuscatedName("gg.aq")
    public long field2467;

    @ObfuscatedName("gg.at")
    public long field2468;

    @ObfuscatedName("gg.ak")
    public class212 field2450 = new class212(this);

    public class208() {
        this.method3600();
    }

    @ObfuscatedName("gg.n(II)V")
    public synchronized void method3637(int arg0) {
        this.field2443 = arg0;
    }

    @ObfuscatedName("gg.v(I)I")
    public int method3581() {
        return this.field2443;
    }

    @ObfuscatedName("gg.d(Lhr;Lig;Ldy;IB)Z")
    public synchronized boolean method3582(class213 arg0, class245 arg1, class118 arg2, int arg3) {
        arg0.method3765();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class187 var7 = (class187) arg0.field2521.method5684(); var7 != null; var7 = (class187) arg0.field2521.method5685()) {
            int var8 = (int) var7.field2141;
            class211 var9 = (class211) this.field2455.method5682((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method3990(var8);
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
                this.field2455.method5683(var11, (long) var8);
            }
            if (!var9.method3741(arg2, var7.field2135, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3762();
        }
        return var5;
    }

    @ObfuscatedName("gg.c(I)V")
    public synchronized void method3583() {
        for (class211 var1 = (class211) this.field2455.method5684(); var1 != null; var1 = (class211) this.field2455.method5685()) {
            var1.method3743();
        }
    }

    @ObfuscatedName("gg.y(S)V")
    public synchronized void method3584() {
        for (class211 var1 = (class211) this.field2455.method5684(); var1 != null; var1 = (class211) this.field2455.method5685()) {
            var1.method3486();
        }
    }

    @ObfuscatedName("gg.l(Lhr;ZI)V")
    public synchronized void method3684(class213 arg0, boolean arg1) {
        this.method3586();
        this.field2463.method3730(arg0.field2520);
        this.field2460 = arg1;
        this.field2467 = 0L;
        int var3 = this.field2463.method3695();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2463.method3696(var4);
            this.field2463.method3722(var4);
            this.field2463.method3697(var4);
        }
        this.field2465 = this.field2463.method3704();
        this.field2466 = this.field2463.field2497[this.field2465];
        this.field2468 = this.field2463.method3703(this.field2466);
    }

    @ObfuscatedName("gg.b(B)V")
    public synchronized void method3586() {
        this.field2463.method3717();
        this.method3600();
    }

    @ObfuscatedName("gg.a(I)Z")
    public synchronized boolean method3587() {
        return this.field2463.method3694();
    }

    @ObfuscatedName("gg.w(III)V")
    public synchronized void method3588(int arg0, int arg1) {
        this.method3589(arg0, arg1);
    }

    @ObfuscatedName("gg.k(III)V")
    public void method3589(int arg0, int arg1) {
        this.field2446[arg0] = arg1;
        this.field2464[arg0] = arg1 & 0xFFFFFF80;
        this.method3590(arg0, arg1);
    }

    @ObfuscatedName("gg.i(III)V")
    public void method3590(int arg0, int arg1) {
        if (this.field2449[arg0] != arg1) {
            this.field2449[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2462[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("gg.x(IIII)V")
    public void method3591(int arg0, int arg1, int arg2) {
        this.method3593(arg0, arg1, 64);
        if ((this.field2459[arg0] & 0x2) != 0) {
            for (class209 var4 = (class209) this.field2450.field2519.method4705(); var4 != null; var4 = (class209) this.field2450.field2519.method4698()) {
                if (var4.field2472 == arg0 && var4.field2487 < 0) {
                    this.field2451[arg0][var4.field2476] = null;
                    this.field2451[arg0][arg1] = var4;
                    int var5 = (var4.field2481 * var4.field2473 >> 12) + var4.field2479;
                    var4.field2479 += arg1 - var4.field2476 << 8;
                    var4.field2473 = var5 - var4.field2479;
                    var4.field2481 = 4096;
                    var4.field2476 = arg1;
                    return;
                }
            }
        }
        class211 var6 = (class211) this.field2455.method5682((long) this.field2449[arg0]);
        if (var6 == null) {
            return;
        }
        class113 var7 = var6.field2509[arg1];
        if (var7 == null) {
            return;
        }
        class209 var8 = new class209();
        var8.field2472 = arg0;
        var8.field2490 = var6;
        var8.field2491 = var7;
        var8.field2474 = var6.field2512[arg1];
        var8.field2475 = var6.field2513[arg1];
        var8.field2476 = arg1;
        var8.field2477 = var6.field2510 * arg2 * arg2 * var6.field2508[arg1] + 1024 >> 11;
        var8.field2478 = var6.field2511[arg1] & 0xFF;
        var8.field2479 = (arg1 << 8) - (var6.field2514[arg1] & 0x7FFF);
        var8.field2482 = 0;
        var8.field2492 = 0;
        var8.field2484 = 0;
        var8.field2487 = -1;
        var8.field2483 = 0;
        if (this.field2461[arg0] == 0) {
            var8.field2486 = class123.method2624(var7, this.method3664(var8), this.method3652(var8), this.method3606(var8));
        } else {
            var8.field2486 = class123.method2624(var7, this.method3664(var8), 0, this.method3606(var8));
            this.method3592(var8, var6.field2514[arg1] < 0);
        }
        if (var6.field2514[arg1] < 0) {
            var8.field2486.method2572(-1);
        }
        if (var8.field2475 >= 0) {
            class209 var9 = this.field2462[arg0][var8.field2475];
            if (var9 != null && var9.field2487 < 0) {
                this.field2451[arg0][var9.field2476] = null;
                var9.field2487 = 0;
            }
            this.field2462[arg0][var8.field2475] = var8;
        }
        this.field2450.field2519.method4699(var8);
        this.field2451[arg0][arg1] = var8;
    }

    @ObfuscatedName("gg.g(Lhq;ZI)V")
    public void method3592(class209 arg0, boolean arg1) {
        int var3 = arg0.field2491.field1401.length;
        int var5;
        if (arg1 && arg0.field2491.field1405) {
            int var4 = var3 + var3 - arg0.field2491.field1403;
            var5 = (int) ((long) this.field2461[arg0.field2472] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2486.method2514(true);
            }
        } else {
            var5 = (int) ((long) this.field2461[arg0.field2472] * (long) var3 >> 6);
        }
        arg0.field2486.method2561(var5);
    }

    @ObfuscatedName("gg.u(IIII)V")
    public void method3593(int arg0, int arg1, int arg2) {
        class209 var4 = this.field2451[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2451[arg0][arg1] = null;
        if ((this.field2459[arg0] & 0x2) == 0) {
            var4.field2487 = 0;
            return;
        }
        for (class209 var5 = (class209) this.field2450.field2519.method4721(); var5 != null; var5 = (class209) this.field2450.field2519.method4706()) {
            if (var4.field2472 == var5.field2472 && var5.field2487 < 0 && var4 != var5) {
                var4.field2487 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("gg.t(IIIB)V")
    public void method3594(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("gg.p(III)V")
    public void method3595(int arg0, int arg1) {
    }

    @ObfuscatedName("gg.o(IIB)V")
    public void method3650(int arg0, int arg1) {
        this.field2442[arg0] = arg1;
    }

    @ObfuscatedName("gg.ay(IB)V")
    public void method3597(int arg0) {
        for (class209 var2 = (class209) this.field2450.field2519.method4721(); var2 != null; var2 = (class209) this.field2450.field2519.method4706()) {
            if (arg0 < 0 || var2.field2472 == arg0) {
                if (var2.field2486 != null) {
                    var2.field2486.method2583(Statics.field3339 / 100);
                    if (var2.field2486.method2522()) {
                        this.field2450.field2518.method2304(var2.field2486);
                    }
                    var2.method3687();
                }
                if (var2.field2487 < 0) {
                    this.field2451[var2.field2472][var2.field2476] = null;
                }
                var2.method3486();
            }
        }
    }

    @ObfuscatedName("gg.am(IS)V")
    public void method3598(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3598(var2);
            }
            return;
        }
        this.field2445[arg0] = 12800;
        this.field2448[arg0] = 8192;
        this.field2447[arg0] = 16383;
        this.field2442[arg0] = 8192;
        this.field2452[arg0] = 0;
        this.field2453[arg0] = 8192;
        this.method3601(arg0);
        this.method3628(arg0);
        this.field2459[arg0] = 0;
        this.field2456[arg0] = 32767;
        this.field2457[arg0] = 256;
        this.field2461[arg0] = 0;
        this.method3603(arg0, 8192);
    }

    @ObfuscatedName("gg.ag(IB)V")
    public void method3672(int arg0) {
        for (class209 var2 = (class209) this.field2450.field2519.method4721(); var2 != null; var2 = (class209) this.field2450.field2519.method4706()) {
            if ((arg0 < 0 || var2.field2472 == arg0) && var2.field2487 < 0) {
                this.field2451[var2.field2472][var2.field2476] = null;
                var2.field2487 = 0;
            }
        }
    }

    @ObfuscatedName("gg.ae(I)V")
    public void method3600() {
        this.method3597(-1);
        this.method3598(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2449[var1] = this.field2446[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2464[var2] = this.field2446[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("gg.ac(II)V")
    public void method3601(int arg0) {
        if ((this.field2459[arg0] & 0x2) == 0) {
            return;
        }
        for (class209 var2 = (class209) this.field2450.field2519.method4721(); var2 != null; var2 = (class209) this.field2450.field2519.method4706()) {
            if (var2.field2472 == arg0 && this.field2451[arg0][var2.field2476] == null && var2.field2487 < 0) {
                var2.field2487 = 0;
            }
        }
    }

    @ObfuscatedName("gg.aq(II)V")
    public void method3628(int arg0) {
        if ((this.field2459[arg0] & 0x4) == 0) {
            return;
        }
        for (class209 var2 = (class209) this.field2450.field2519.method4721(); var2 != null; var2 = (class209) this.field2450.field2519.method4706()) {
            if (var2.field2472 == arg0) {
                var2.field2480 = 0;
            }
        }
    }

    @ObfuscatedName("gg.at(IB)V")
    public void method3602(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3593(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3591(var6, var7, var8);
            } else {
                this.method3593(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3594(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2464[var12] = (var14 << 14) + (this.field2464[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2464[var12] = (var14 << 7) + (this.field2464[var12] & 0xFFFFC07F);
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
                this.field2445[var12] = (var14 << 7) + (this.field2445[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2445[var12] = (this.field2445[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2448[var12] = (var14 << 7) + (this.field2448[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2448[var12] = (this.field2448[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2447[var12] = (var14 << 7) + (this.field2447[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2447[var12] = (this.field2447[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2459[var12] |= 0x1;
                } else {
                    this.field2459[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2459[var12] |= 0x2;
                } else {
                    this.method3601(var12);
                    this.field2459[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2456[var12] = (var14 << 7) + (this.field2456[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2456[var12] = (this.field2456[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2456[var12] = (var14 << 7) + (this.field2456[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2456[var12] = (this.field2456[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3597(var12);
            }
            if (var13 == 121) {
                this.method3598(var12);
            }
            if (var13 == 123) {
                this.method3672(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2456[var12];
                if (var15 == 16384) {
                    this.field2457[var12] = (var14 << 7) + (this.field2457[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2456[var12];
                if (var16 == 16384) {
                    this.field2457[var12] = (this.field2457[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2461[var12] = (var14 << 7) + (this.field2461[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2461[var12] = (this.field2461[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2459[var12] |= 0x4;
                } else {
                    this.method3628(var12);
                    this.field2459[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3603(var12, (var14 << 7) + (this.field2458[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3603(var12, (this.field2458[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3590(var17, this.field2464[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3595(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method3650(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3600();
            }
        }
    }

    @ObfuscatedName("gg.ak(III)V")
    public void method3603(int arg0, int arg1) {
        this.field2458[arg0] = arg1;
        this.field2469[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("gg.ax(Lhq;B)I")
    public int method3664(class209 arg0) {
        int var2 = (arg0.field2481 * arg0.field2473 >> 12) + arg0.field2479;
        int var3 = ((this.field2442[arg0.field2472] - 8192) * this.field2457[arg0.field2472] >> 12) + var2;
        class206 var4 = arg0.field2474;
        if (var4.field2430 > 0 && (var4.field2429 > 0 || this.field2452[arg0.field2472] > 0)) {
            int var5 = var4.field2429 << 2;
            int var6 = var4.field2423 << 1;
            if (arg0.field2489 < var6) {
                var5 = arg0.field2489 * var5 / var6;
            }
            int var7 = (this.field2452[arg0.field2472] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2488 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2491.field1402 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field3339 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("gg.an(Lhq;B)I")
    public int method3652(class209 arg0) {
        class206 var2 = arg0.field2474;
        int var3 = this.field2447[arg0.field2472] * this.field2445[arg0.field2472] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2477 * var4 + 16384 >> 15;
        int var6 = this.field2443 * var5 + 128 >> 8;
        if (var2.field2425 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2482 * 1.953125E-5D * (double) var2.field2425) + 0.5D);
        }
        if (var2.field2428 != null) {
            int var7 = arg0.field2492;
            int var8 = var2.field2428[arg0.field2484 + 1];
            if (arg0.field2484 < var2.field2428.length - 2) {
                int var9 = (var2.field2428[arg0.field2484] & 0xFF) << 8;
                int var10 = (var2.field2428[arg0.field2484 + 2] & 0xFF) << 8;
                var8 += (var2.field2428[arg0.field2484 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2487 > 0 && var2.field2424 != null) {
            int var11 = arg0.field2487;
            int var12 = var2.field2424[arg0.field2483 + 1];
            if (arg0.field2483 < var2.field2424.length - 2) {
                int var13 = (var2.field2424[arg0.field2483] & 0xFF) << 8;
                int var14 = (var2.field2424[arg0.field2483 + 2] & 0xFF) << 8;
                var12 += (var2.field2424[arg0.field2483 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("gg.ai(Lhq;I)I")
    public int method3606(class209 arg0) {
        int var2 = this.field2448[arg0.field2472];
        return var2 < 8192 ? arg0.field2478 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2478) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("gg.h()Ldw;")
    public synchronized class125 method2280() {
        return this.field2450;
    }

    @ObfuscatedName("gg.z()Ldw;")
    public synchronized class125 method2281() {
        return null;
    }

    @ObfuscatedName("gg.e()I")
    public synchronized int method2282() {
        return 0;
    }

    @ObfuscatedName("gg.q([III)V")
    public synchronized void method2283(int[] arg0, int arg1, int arg2) {
        if (this.field2463.method3694()) {
            int var4 = this.field2444 * this.field2463.field2493 / Statics.field3339;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2467;
                if (this.field2468 - var5 >= 0L) {
                    this.field2467 = var5;
                    break;
                }
                int var7 = (int) ((this.field2468 - this.field2467 + (long) var4 - 1L) / (long) var4);
                this.field2467 += (long) var4 * (long) var7;
                this.field2450.method2283(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3608();
            } while (this.field2463.method3694());
        }
        this.field2450.method2283(arg0, arg1, arg2);
    }

    @ObfuscatedName("gg.s(I)V")
    public synchronized void method2305(int arg0) {
        if (this.field2463.method3694()) {
            int var2 = this.field2444 * this.field2463.field2493 / Statics.field3339;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2467;
                if (this.field2468 - var3 >= 0L) {
                    this.field2467 = var3;
                    break;
                }
                int var5 = (int) ((this.field2468 - this.field2467 + (long) var2 - 1L) / (long) var2);
                this.field2467 += (long) var2 * (long) var5;
                this.field2450.method2305(var5);
                arg0 -= var5;
                this.method3608();
            } while (this.field2463.method3694());
        }
        this.field2450.method2305(arg0);
    }

    @ObfuscatedName("gg.ab(B)V")
    public void method3608() {
        int var1 = this.field2465;
        int var2 = this.field2466;
        long var3 = this.field2468;
        while (this.field2466 == var2) {
            while (this.field2463.field2497[var1] == var2) {
                this.field2463.method3696(var1);
                int var5 = this.field2463.method3734(var1);
                if (var5 == 1) {
                    this.field2463.method3698();
                    this.field2463.method3697(var1);
                    if (this.field2463.method3705()) {
                        if (!this.field2460 || var2 == 0) {
                            this.method3600();
                            this.field2463.method3717();
                            return;
                        }
                        this.field2463.method3706(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3602(var5);
                }
                this.field2463.method3722(var1);
                this.field2463.method3697(var1);
            }
            var1 = this.field2463.method3704();
            var2 = this.field2463.field2497[var1];
            var3 = this.field2463.method3703(var2);
        }
        this.field2465 = var1;
        this.field2466 = var2;
        this.field2468 = var3;
    }

    @ObfuscatedName("gg.au(Lhq;I)Z")
    public boolean method3596(class209 arg0) {
        if (arg0.field2486 != null) {
            return false;
        }
        if (arg0.field2487 >= 0) {
            arg0.method3486();
            if (arg0.field2475 > 0 && this.field2462[arg0.field2472][arg0.field2475] == arg0) {
                this.field2462[arg0.field2472][arg0.field2475] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("gg.af(Lhq;[IIIB)Z")
    public boolean method3612(class209 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2485 = Statics.field3339 / 100;
        if (arg0.field2487 >= 0 && arg0.field2486 == null || arg0.field2486.method2566()) {
            arg0.method3687();
            arg0.method3486();
            if (arg0.field2475 > 0 && this.field2462[arg0.field2472][arg0.field2475] == arg0) {
                this.field2462[arg0.field2472][arg0.field2475] = null;
            }
            return true;
        }
        int var5 = arg0.field2481;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2453[arg0.field2472] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2481 = var6;
        }
        arg0.field2486.method2582(this.method3664(arg0));
        class206 var7 = arg0.field2474;
        boolean var8 = false;
        arg0.field2489++;
        arg0.field2488 += var7.field2430;
        double var9 = (double) ((arg0.field2476 - 60 << 8) + (arg0.field2481 * arg0.field2473 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2425 > 0) {
            if (var7.field2432 > 0) {
                arg0.field2482 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2432 * var9) + 0.5D);
            } else {
                arg0.field2482 += 128;
            }
        }
        if (var7.field2428 != null) {
            if (var7.field2426 > 0) {
                arg0.field2492 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2426 * var9) + 0.5D);
            } else {
                arg0.field2492 += 128;
            }
            while (arg0.field2484 < var7.field2428.length - 2 && arg0.field2492 > (var7.field2428[arg0.field2484 + 2] & 0xFF) << 8) {
                arg0.field2484 += 2;
            }
            if (arg0.field2484 == var7.field2428.length - 2 && var7.field2428[arg0.field2484 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2487 >= 0 && var7.field2424 != null && (this.field2459[arg0.field2472] & 0x1) == 0 && (arg0.field2475 < 0 || this.field2462[arg0.field2472][arg0.field2475] != arg0)) {
            if (var7.field2427 > 0) {
                arg0.field2487 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2427 * var9) + 0.5D);
            } else {
                arg0.field2487 += 128;
            }
            while (arg0.field2483 < var7.field2424.length - 2 && arg0.field2487 > (var7.field2424[arg0.field2483 + 2] & 0xFF) << 8) {
                arg0.field2483 += 2;
            }
            if (arg0.field2483 == var7.field2424.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2486.method2622(arg0.field2485, this.method3652(arg0), this.method3606(arg0));
            return false;
        }
        arg0.field2486.method2583(arg0.field2485);
        if (arg1 == null) {
            arg0.field2486.method2305(arg3);
        } else {
            arg0.field2486.method2283(arg1, arg2, arg3);
        }
        if (arg0.field2486.method2522()) {
            this.field2450.field2518.method2304(arg0.field2486);
        }
        arg0.method3687();
        if (arg0.field2487 >= 0) {
            arg0.method3486();
            if (arg0.field2475 > 0 && this.field2462[arg0.field2472][arg0.field2475] == arg0) {
                this.field2462[arg0.field2472][arg0.field2475] = null;
            }
        }
        return true;
    }
}
