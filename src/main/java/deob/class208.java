package deob;

@ObfuscatedName("gw")
public class class208 extends class120 {

    @ObfuscatedName("gw.s")
    public class194 field2545 = new class194(128);

    @ObfuscatedName("gw.c")
    public int field2560 = 256;

    @ObfuscatedName("gw.f")
    public int field2534 = 1000000;

    @ObfuscatedName("gw.m")
    public int[] field2535 = new int[16];

    @ObfuscatedName("gw.h")
    public int[] field2536 = new int[16];

    @ObfuscatedName("gw.t")
    public int[] field2548 = new int[16];

    @ObfuscatedName("gw.p")
    public int[] field2538 = new int[16];

    @ObfuscatedName("gw.d")
    public int[] field2539 = new int[16];

    @ObfuscatedName("gw.n")
    public int[] field2533 = new int[16];

    @ObfuscatedName("gw.z")
    public int[] field2541 = new int[16];

    @ObfuscatedName("gw.o")
    public int[] field2542 = new int[16];

    @ObfuscatedName("gw.q")
    public int[] field2543 = new int[16];

    @ObfuscatedName("gw.i")
    public int[] field2559 = new int[16];

    @ObfuscatedName("gw.g")
    public int[] field2532 = new int[16];

    @ObfuscatedName("gw.a")
    public int[] field2547 = new int[16];

    @ObfuscatedName("gw.x")
    public int[] field2546 = new int[16];

    @ObfuscatedName("gw.b")
    public int[] field2549 = new int[16];

    @ObfuscatedName("gw.j")
    public int[] field2550 = new int[16];

    @ObfuscatedName("gw.v")
    public class209[][] field2551 = new class209[16][128];

    @ObfuscatedName("gw.ap")
    public class209[][] field2556 = new class209[16][128];

    @ObfuscatedName("gw.ar")
    public class210 field2553 = new class210();

    @ObfuscatedName("gw.am")
    public boolean field2554;

    @ObfuscatedName("gw.ab")
    public int field2555;

    @ObfuscatedName("gw.af")
    public int field2544;

    @ObfuscatedName("gw.aa")
    public long field2557;

    @ObfuscatedName("gw.aq")
    public long field2558;

    @ObfuscatedName("gw.aj")
    public class212 field2537 = new class212(this);

    public class208() {
        this.method3528();
    }

    @ObfuscatedName("gw.s(II)V")
    public synchronized void method3515(int arg0) {
        this.field2560 = arg0;
    }

    @ObfuscatedName("gw.c(I)I")
    public int method3540() {
        return this.field2560;
    }

    @ObfuscatedName("gw.f(Lha;Liw;Ldz;II)Z")
    public synchronized boolean method3553(class213 arg0, class239 arg1, class113 arg2, int arg3) {
        arg0.method3667();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class203 var7 = (class203) arg0.field2616.method3332(); var7 != null; var7 = (class203) arg0.field2616.method3333()) {
            int var8 = (int) var7.field2487;
            class211 var9 = (class211) this.field2545.method3339((long) var8);
            if (var9 == null) {
                var9 = Statics.method1044(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field2545.method3330(var9, (long) var8);
            }
            if (!var9.method3646(arg2, var7.field2502, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3668();
        }
        return var5;
    }

    @ObfuscatedName("gw.m(I)V")
    public synchronized void method3488() {
        for (class211 var1 = (class211) this.field2545.method3332(); var1 != null; var1 = (class211) this.field2545.method3333()) {
            var1.method3651();
        }
    }

    @ObfuscatedName("gw.h(I)V")
    public synchronized void method3566() {
        for (class211 var1 = (class211) this.field2545.method3332(); var1 != null; var1 = (class211) this.field2545.method3333()) {
            var1.method3372();
        }
    }

    @ObfuscatedName("gw.z(Lha;ZI)V")
    public synchronized void method3490(class213 arg0, boolean arg1) {
        this.method3493();
        this.field2553.method3589(arg0.field2615);
        this.field2554 = arg1;
        this.field2557 = 0L;
        int var3 = this.field2553.method3592();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2553.method3593(var4);
            this.field2553.method3611(var4);
            this.field2553.method3594(var4);
        }
        this.field2555 = this.field2553.method3625();
        this.field2544 = this.field2553.field2583[this.field2555];
        this.field2558 = this.field2553.method3588(this.field2544);
    }

    @ObfuscatedName("gw.u(I)V")
    public synchronized void method3493() {
        this.field2553.method3590();
        this.method3528();
    }

    @ObfuscatedName("gw.r(B)Z")
    public synchronized boolean method3492() {
        return this.field2553.method3627();
    }

    @ObfuscatedName("gw.l(IIB)V")
    public synchronized void method3582(int arg0, int arg1) {
        this.method3494(arg0, arg1);
    }

    @ObfuscatedName("gw.y(IIS)V")
    public void method3494(int arg0, int arg1) {
        this.field2538[arg0] = arg1;
        this.field2533[arg0] = arg1 & 0xFFFFFF80;
        this.method3495(arg0, arg1);
    }

    @ObfuscatedName("gw.w(III)V")
    public void method3495(int arg0, int arg1) {
        if (this.field2539[arg0] != arg1) {
            this.field2539[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2556[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("gw.i(IIII)V")
    public void method3496(int arg0, int arg1, int arg2) {
        this.method3498(arg0, arg1, 64);
        if ((this.field2559[arg0] & 0x2) != 0) {
            for (class209 var4 = (class209) this.field2537.field2610.method3410(); var4 != null; var4 = (class209) this.field2537.field2610.method3386()) {
                if (var4.field2574 == arg0 && var4.field2580 < 0) {
                    this.field2551[arg0][var4.field2575] = null;
                    this.field2551[arg0][arg1] = var4;
                    int var5 = (var4.field2571 * var4.field2570 >> 12) + var4.field2564;
                    var4.field2564 += arg1 - var4.field2575 << 8;
                    var4.field2570 = var5 - var4.field2564;
                    var4.field2571 = 4096;
                    var4.field2575 = arg1;
                    return;
                }
            }
        }
        class211 var6 = (class211) this.field2545.method3339((long) this.field2539[arg0]);
        if (var6 == null) {
            return;
        }
        class108 var7 = var6.field2600[arg1];
        if (var7 == null) {
            return;
        }
        class209 var8 = new class209();
        var8.field2574 = arg0;
        var8.field2562 = var6;
        var8.field2563 = var7;
        var8.field2572 = var6.field2597[arg1];
        var8.field2565 = var6.field2603[arg1];
        var8.field2575 = arg1;
        var8.field2567 = var6.field2598 * arg2 * arg2 * var6.field2608[arg1] + 1024 >> 11;
        var8.field2568 = var6.field2601[arg1] & 0xFF;
        var8.field2564 = (arg1 << 8) - (var6.field2599[arg1] & 0x7FFF);
        var8.field2566 = 0;
        var8.field2573 = 0;
        var8.field2561 = 0;
        var8.field2580 = -1;
        var8.field2576 = 0;
        if (this.field2546[arg0] == 0) {
            var8.field2579 = class118.method1992(var7, this.method3507(var8), this.method3501(var8), this.method3509(var8));
        } else {
            var8.field2579 = class118.method1992(var7, this.method3507(var8), 0, this.method3509(var8));
            this.method3497(var8, var6.field2599[arg1] < 0);
        }
        if (var6.field2599[arg1] < 0) {
            var8.field2579.method2072(-1);
        }
        if (var8.field2565 >= 0) {
            class209 var9 = this.field2556[arg0][var8.field2565];
            if (var9 != null && var9.field2580 < 0) {
                this.field2551[arg0][var9.field2575] = null;
                var9.field2580 = 0;
            }
            this.field2556[arg0][var8.field2565] = var8;
        }
        this.field2537.field2610.method3394(var8);
        this.field2551[arg0][arg1] = var8;
    }

    @ObfuscatedName("gw.g(Lhy;ZI)V")
    public void method3497(class209 arg0, boolean arg1) {
        int var3 = arg0.field2563.field1603.length;
        int var5;
        if (arg1 && arg0.field2563.field1607) {
            int var4 = var3 + var3 - arg0.field2563.field1604;
            var5 = (int) ((long) this.field2546[arg0.field2574] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2579.method2116(true);
            }
        } else {
            var5 = (int) ((long) this.field2546[arg0.field2574] * (long) var3 >> 6);
        }
        arg0.field2579.method2100(var5);
    }

    @ObfuscatedName("gw.a(IIII)V")
    public void method3498(int arg0, int arg1, int arg2) {
        class209 var4 = this.field2551[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2551[arg0][arg1] = null;
        if ((this.field2559[arg0] & 0x2) == 0) {
            var4.field2580 = 0;
            return;
        }
        for (class209 var5 = (class209) this.field2537.field2610.method3389(); var5 != null; var5 = (class209) this.field2537.field2610.method3385()) {
            if (var4.field2574 == var5.field2574 && var5.field2580 < 0 && var4 != var5) {
                var4.field2580 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("gw.x(IIIB)V")
    public void method3499(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("gw.j(III)V")
    public void method3503(int arg0, int arg1) {
    }

    @ObfuscatedName("gw.v(IIB)V")
    public void method3580(int arg0, int arg1) {
        this.field2541[arg0] = arg1;
    }

    @ObfuscatedName("gw.ap(IB)V")
    public void method3486(int arg0) {
        for (class209 var2 = (class209) this.field2537.field2610.method3389(); var2 != null; var2 = (class209) this.field2537.field2610.method3385()) {
            if (arg0 < 0 || var2.field2574 == arg0) {
                if (var2.field2579 != null) {
                    var2.field2579.method1997(Statics.field1634 / 100);
                    if (var2.field2579.method2006()) {
                        this.field2537.field2611.method1800(var2.field2579);
                    }
                    var2.method3586();
                }
                if (var2.field2580 < 0) {
                    this.field2551[var2.field2574][var2.field2575] = null;
                }
                var2.method3372();
            }
        }
    }

    @ObfuscatedName("gw.ar(IB)V")
    public void method3563(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3563(var2);
            }
            return;
        }
        this.field2535[arg0] = 12800;
        this.field2536[arg0] = 8192;
        this.field2548[arg0] = 16383;
        this.field2541[arg0] = 8192;
        this.field2542[arg0] = 0;
        this.field2543[arg0] = 8192;
        this.method3547(arg0);
        this.method3504(arg0);
        this.field2559[arg0] = 0;
        this.field2532[arg0] = 32767;
        this.field2547[arg0] = 256;
        this.field2546[arg0] = 0;
        this.method3516(arg0, 8192);
    }

    @ObfuscatedName("gw.ax(II)V")
    public void method3584(int arg0) {
        for (class209 var2 = (class209) this.field2537.field2610.method3389(); var2 != null; var2 = (class209) this.field2537.field2610.method3385()) {
            if ((arg0 < 0 || var2.field2574 == arg0) && var2.field2580 < 0) {
                this.field2551[var2.field2574][var2.field2575] = null;
                var2.field2580 = 0;
            }
        }
    }

    @ObfuscatedName("gw.ad(B)V")
    public void method3528() {
        this.method3486(-1);
        this.method3563(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2539[var1] = this.field2538[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2533[var2] = this.field2538[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("gw.ac(II)V")
    public void method3547(int arg0) {
        if ((this.field2559[arg0] & 0x2) == 0) {
            return;
        }
        for (class209 var2 = (class209) this.field2537.field2610.method3389(); var2 != null; var2 = (class209) this.field2537.field2610.method3385()) {
            if (var2.field2574 == arg0 && this.field2551[arg0][var2.field2575] == null && var2.field2580 < 0) {
                var2.field2580 = 0;
            }
        }
    }

    @ObfuscatedName("gw.az(II)V")
    public void method3504(int arg0) {
        if ((this.field2559[arg0] & 0x4) == 0) {
            return;
        }
        for (class209 var2 = (class209) this.field2537.field2610.method3389(); var2 != null; var2 = (class209) this.field2537.field2610.method3385()) {
            if (var2.field2574 == arg0) {
                var2.field2581 = 0;
            }
        }
    }

    @ObfuscatedName("gw.ah(IS)V")
    public void method3505(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3498(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3496(var6, var7, var8);
            } else {
                this.method3498(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3499(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2533[var12] = (var14 << 14) + (this.field2533[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2533[var12] = (var14 << 7) + (this.field2533[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2542[var12] = (var14 << 7) + (this.field2542[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2542[var12] = (this.field2542[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2543[var12] = (var14 << 7) + (this.field2543[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2543[var12] = (this.field2543[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2535[var12] = (var14 << 7) + (this.field2535[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2535[var12] = (this.field2535[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2536[var12] = (var14 << 7) + (this.field2536[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2536[var12] = (this.field2536[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2548[var12] = (var14 << 7) + (this.field2548[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2548[var12] = (this.field2548[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2559[var12] |= 0x1;
                } else {
                    this.field2559[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2559[var12] |= 0x2;
                } else {
                    this.method3547(var12);
                    this.field2559[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2532[var12] = (var14 << 7) + (this.field2532[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2532[var12] = (this.field2532[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2532[var12] = (var14 << 7) + (this.field2532[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2532[var12] = (this.field2532[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3486(var12);
            }
            if (var13 == 121) {
                this.method3563(var12);
            }
            if (var13 == 123) {
                this.method3584(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2532[var12];
                if (var15 == 16384) {
                    this.field2547[var12] = (var14 << 7) + (this.field2547[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2532[var12];
                if (var16 == 16384) {
                    this.field2547[var12] = (this.field2547[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2546[var12] = (var14 << 7) + (this.field2546[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2546[var12] = (this.field2546[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2559[var12] |= 0x4;
                } else {
                    this.method3504(var12);
                    this.field2559[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3516(var12, (var14 << 7) + (this.field2549[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3516(var12, (this.field2549[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3495(var17, this.field2533[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3503(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method3580(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3528();
            }
        }
    }

    @ObfuscatedName("gw.at(III)V")
    public void method3516(int arg0, int arg1) {
        this.field2549[arg0] = arg1;
        this.field2550[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("gw.au(Lhy;I)I")
    public int method3507(class209 arg0) {
        int var2 = (arg0.field2571 * arg0.field2570 >> 12) + arg0.field2564;
        int var3 = ((this.field2541[arg0.field2574] - 8192) * this.field2547[arg0.field2574] >> 12) + var2;
        class206 var4 = arg0.field2572;
        if (var4.field2518 > 0 && (var4.field2519 > 0 || this.field2542[arg0.field2574] > 0)) {
            int var5 = var4.field2519 << 2;
            int var6 = var4.field2514 << 1;
            if (arg0.field2577 < var6) {
                var5 = arg0.field2577 * var5 / var6;
            }
            int var7 = (this.field2542[arg0.field2574] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2578 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2563.field1605 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1634 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("gw.ak(Lhy;I)I")
    public int method3501(class209 arg0) {
        class206 var2 = arg0.field2572;
        int var3 = this.field2548[arg0.field2574] * this.field2535[arg0.field2574] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2567 * var4 + 16384 >> 15;
        int var6 = this.field2560 * var5 + 128 >> 8;
        if (var2.field2509 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2566 * 1.953125E-5D * (double) var2.field2509) + 0.5D);
        }
        if (var2.field2513 != null) {
            int var7 = arg0.field2573;
            int var8 = var2.field2513[arg0.field2561 + 1];
            if (arg0.field2561 < var2.field2513.length - 2) {
                int var9 = (var2.field2513[arg0.field2561] & 0xFF) << 8;
                int var10 = (var2.field2513[arg0.field2561 + 2] & 0xFF) << 8;
                var8 += (var2.field2513[arg0.field2561 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2580 > 0 && var2.field2508 != null) {
            int var11 = arg0.field2580;
            int var12 = var2.field2508[arg0.field2576 + 1];
            if (arg0.field2576 < var2.field2508.length - 2) {
                int var13 = (var2.field2508[arg0.field2576] & 0xFF) << 8;
                int var14 = (var2.field2508[arg0.field2576 + 2] & 0xFF) << 8;
                var12 += (var2.field2508[arg0.field2576 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("gw.aw(Lhy;B)I")
    public int method3509(class209 arg0) {
        int var2 = this.field2536[arg0.field2574];
        return var2 < 8192 ? arg0.field2568 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2568) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("gw.t()Lds;")
    public synchronized class120 method1797() {
        return this.field2537;
    }

    @ObfuscatedName("gw.p()Lds;")
    public synchronized class120 method1778() {
        return null;
    }

    @ObfuscatedName("gw.d()I")
    public synchronized int method1770() {
        return 0;
    }

    @ObfuscatedName("gw.n([III)V")
    public synchronized void method1773(int[] arg0, int arg1, int arg2) {
        if (this.field2553.method3627()) {
            int var4 = this.field2534 * this.field2553.field2584 / Statics.field1634;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2557;
                if (this.field2558 - var5 >= 0L) {
                    this.field2557 = var5;
                    break;
                }
                int var7 = (int) ((this.field2558 - this.field2557 + (long) var4 - 1L) / (long) var4);
                this.field2557 += (long) var4 * (long) var7;
                this.field2537.method1773(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3525();
            } while (this.field2553.method3627());
        }
        this.field2537.method1773(arg0, arg1, arg2);
    }

    @ObfuscatedName("gw.o(I)V")
    public synchronized void method1775(int arg0) {
        if (this.field2553.method3627()) {
            int var2 = this.field2534 * this.field2553.field2584 / Statics.field1634;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2557;
                if (this.field2558 - var3 >= 0L) {
                    this.field2557 = var3;
                    break;
                }
                int var5 = (int) ((this.field2558 - this.field2557 + (long) var2 - 1L) / (long) var2);
                this.field2557 += (long) var2 * (long) var5;
                this.field2537.method1775(var5);
                arg0 -= var5;
                this.method3525();
            } while (this.field2553.method3627());
        }
        this.field2537.method1775(arg0);
    }

    @ObfuscatedName("gw.an(B)V")
    public void method3525() {
        int var1 = this.field2555;
        int var2 = this.field2544;
        long var3 = this.field2558;
        while (this.field2544 == var2) {
            while (this.field2553.field2583[var1] == var2) {
                this.field2553.method3593(var1);
                int var5 = this.field2553.method3597(var1);
                if (var5 == 1) {
                    this.field2553.method3615();
                    this.field2553.method3594(var1);
                    if (this.field2553.method3602()) {
                        if (!this.field2554 || var2 == 0) {
                            this.method3528();
                            this.field2553.method3590();
                            return;
                        }
                        this.field2553.method3603(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3505(var5);
                }
                this.field2553.method3611(var1);
                this.field2553.method3594(var1);
            }
            var1 = this.field2553.method3625();
            var2 = this.field2553.field2583[var1];
            var3 = this.field2553.method3588(var2);
        }
        this.field2555 = var1;
        this.field2544 = var2;
        this.field2558 = var3;
    }

    @ObfuscatedName("gw.ai(Lhy;I)Z")
    public boolean method3513(class209 arg0) {
        if (arg0.field2579 != null) {
            return false;
        }
        if (arg0.field2580 >= 0) {
            arg0.method3372();
            if (arg0.field2565 > 0 && this.field2556[arg0.field2574][arg0.field2565] == arg0) {
                this.field2556[arg0.field2574][arg0.field2565] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("gw.bk(Lhy;[IIIB)Z")
    public boolean method3514(class209 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2569 = Statics.field1634 / 100;
        if (arg0.field2580 >= 0 && arg0.field2579 == null || arg0.field2579.method2030()) {
            arg0.method3586();
            arg0.method3372();
            if (arg0.field2565 > 0 && this.field2556[arg0.field2574][arg0.field2565] == arg0) {
                this.field2556[arg0.field2574][arg0.field2565] = null;
            }
            return true;
        }
        int var5 = arg0.field2571;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2543[arg0.field2574] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2571 = var6;
        }
        arg0.field2579.method2104(this.method3507(arg0));
        class206 var7 = arg0.field2572;
        boolean var8 = false;
        arg0.field2577++;
        arg0.field2578 += var7.field2518;
        double var9 = (double) ((arg0.field2575 - 60 << 8) + (arg0.field2571 * arg0.field2570 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2509 > 0) {
            if (var7.field2512 > 0) {
                arg0.field2566 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2512 * var9) + 0.5D);
            } else {
                arg0.field2566 += 128;
            }
        }
        if (var7.field2513 != null) {
            if (var7.field2507 > 0) {
                arg0.field2573 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2507 * var9) + 0.5D);
            } else {
                arg0.field2573 += 128;
            }
            while (arg0.field2561 < var7.field2513.length - 2 && arg0.field2573 > (var7.field2513[arg0.field2561 + 2] & 0xFF) << 8) {
                arg0.field2561 += 2;
            }
            if (arg0.field2561 == var7.field2513.length - 2 && var7.field2513[arg0.field2561 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2580 >= 0 && var7.field2508 != null && (this.field2559[arg0.field2574] & 0x1) == 0 && (arg0.field2565 < 0 || this.field2556[arg0.field2574][arg0.field2565] != arg0)) {
            if (var7.field2511 > 0) {
                arg0.field2580 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2511 * var9) + 0.5D);
            } else {
                arg0.field2580 += 128;
            }
            while (arg0.field2576 < var7.field2508.length - 2 && arg0.field2580 > (var7.field2508[arg0.field2576 + 2] & 0xFF) << 8) {
                arg0.field2576 += 2;
            }
            if (arg0.field2576 == var7.field2508.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2579.method2002(arg0.field2569, this.method3501(arg0), this.method3509(arg0));
            return false;
        }
        arg0.field2579.method1997(arg0.field2569);
        if (arg1 == null) {
            arg0.field2579.method1775(arg3);
        } else {
            arg0.field2579.method1773(arg1, arg2, arg3);
        }
        if (arg0.field2579.method2006()) {
            this.field2537.field2611.method1800(arg0.field2579);
        }
        arg0.method3586();
        if (arg0.field2580 >= 0) {
            arg0.method3372();
            if (arg0.field2565 > 0 && this.field2556[arg0.field2574][arg0.field2565] == arg0) {
                this.field2556[arg0.field2574][arg0.field2565] = null;
            }
        }
        return true;
    }
}
