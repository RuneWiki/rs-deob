package deob;

@ObfuscatedName("hj")
public class class212 extends class119 {

    @ObfuscatedName("hj.b")
    public class198 field2596 = new class198(128);

    @ObfuscatedName("hj.s")
    public int field2614 = 256;

    @ObfuscatedName("hj.r")
    public int field2606 = 1000000;

    @ObfuscatedName("hj.g")
    public int[] field2599 = new int[16];

    @ObfuscatedName("hj.x")
    public int[] field2600 = new int[16];

    @ObfuscatedName("hj.f")
    public int[] field2602 = new int[16];

    @ObfuscatedName("hj.u")
    public int[] field2601 = new int[16];

    @ObfuscatedName("hj.t")
    public int[] field2603 = new int[16];

    @ObfuscatedName("hj.k")
    public int[] field2604 = new int[16];

    @ObfuscatedName("hj.n")
    public int[] field2605 = new int[16];

    @ObfuscatedName("hj.d")
    public int[] field2608 = new int[16];

    @ObfuscatedName("hj.o")
    public int[] field2607 = new int[16];

    @ObfuscatedName("hj.p")
    public int[] field2610 = new int[16];

    @ObfuscatedName("hj.i")
    public int[] field2611 = new int[16];

    @ObfuscatedName("hj.l")
    public int[] field2612 = new int[16];

    @ObfuscatedName("hj.z")
    public int[] field2613 = new int[16];

    @ObfuscatedName("hj.e")
    public int[] field2598 = new int[16];

    @ObfuscatedName("hj.v")
    public int[] field2615 = new int[16];

    @ObfuscatedName("hj.w")
    public class213[][] field2597 = new class213[16][128];

    @ObfuscatedName("hj.av")
    public class213[][] field2617 = new class213[16][128];

    @ObfuscatedName("hj.au")
    public class214 field2618 = new class214();

    @ObfuscatedName("hj.ae")
    public boolean field2619;

    @ObfuscatedName("hj.ak")
    public int field2620;

    @ObfuscatedName("hj.aq")
    public int field2616;

    @ObfuscatedName("hj.an")
    public long field2622;

    @ObfuscatedName("hj.am")
    public long field2623;

    @ObfuscatedName("hj.ar")
    public class216 field2624 = new class216(this);

    public class212() {
        this.method3506();
    }

    @ObfuscatedName("hj.b(IB)V")
    public synchronized void method3582(int arg0) {
        this.field2614 = arg0;
    }

    @ObfuscatedName("hj.s(I)I")
    public int method3490() {
        return this.field2614;
    }

    @ObfuscatedName("hj.r(Lhg;Lij;Ldg;II)Z")
    public synchronized boolean method3491(class217 arg0, class243 arg1, class112 arg2, int arg3) {
        arg0.method3667();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class207 var7 = (class207) arg0.field2672.method3343(); var7 != null; var7 = (class207) arg0.field2672.method3344()) {
            int var8 = (int) var7.field2557;
            class215 var9 = (class215) this.field2596.method3340((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method3823(var8);
                class215 var11;
                if (var10 == null) {
                    var11 = null;
                } else {
                    var11 = new class215(var10);
                }
                var9 = var11;
                if (var11 == null) {
                    var5 = false;
                    continue;
                }
                this.field2596.method3352(var11, (long) var8);
            }
            if (!var9.method3648(arg2, var7.field2571, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3668();
        }
        return var5;
    }

    @ObfuscatedName("hj.g(I)V")
    public synchronized void method3492() {
        for (class215 var1 = (class215) this.field2596.method3343(); var1 != null; var1 = (class215) this.field2596.method3344()) {
            var1.method3647();
        }
    }

    @ObfuscatedName("hj.x(I)V")
    public synchronized void method3540() {
        for (class215 var1 = (class215) this.field2596.method3343(); var1 != null; var1 = (class215) this.field2596.method3344()) {
            var1.method3392();
        }
    }

    @ObfuscatedName("hj.n(Lhg;ZI)V")
    public synchronized void method3510(class217 arg0, boolean arg1) {
        this.method3514();
        this.field2618.method3597(arg0.field2671);
        this.field2619 = arg1;
        this.field2622 = 0L;
        int var3 = this.field2618.method3600();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2618.method3601(var4);
            this.field2618.method3618(var4);
            this.field2618.method3602(var4);
        }
        this.field2620 = this.field2618.method3609();
        this.field2616 = this.field2618.field2655[this.field2620];
        this.field2623 = this.field2618.method3612(this.field2616);
    }

    @ObfuscatedName("hj.o(I)V")
    public synchronized void method3514() {
        this.field2618.method3608();
        this.method3506();
    }

    @ObfuscatedName("hj.a(B)Z")
    public synchronized boolean method3556() {
        return this.field2618.method3599();
    }

    @ObfuscatedName("hj.q(IIB)V")
    public synchronized void method3496(int arg0, int arg1) {
        this.method3539(arg0, arg1);
    }

    @ObfuscatedName("hj.j(III)V")
    public void method3539(int arg0, int arg1) {
        this.field2601[arg0] = arg1;
        this.field2604[arg0] = arg1 & 0xFFFFFF80;
        this.method3497(arg0, arg1);
    }

    @ObfuscatedName("hj.c(IIB)V")
    public void method3497(int arg0, int arg1) {
        if (this.field2603[arg0] != arg1) {
            this.field2603[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2617[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("hj.i(IIII)V")
    public void method3498(int arg0, int arg1, int arg2) {
        this.method3500(arg0, arg1, 64);
        if ((this.field2610[arg0] & 0x2) != 0) {
            for (class213 var4 = (class213) this.field2624.field2669.method3406(); var4 != null; var4 = (class213) this.field2624.field2669.method3408()) {
                if (var4.field2625 == arg0 && var4.field2641 < 0) {
                    this.field2597[arg0][var4.field2630] = null;
                    this.field2597[arg0][arg1] = var4;
                    int var5 = (var4.field2636 * var4.field2635 >> 12) + var4.field2640;
                    var4.field2640 += arg1 - var4.field2630 << 8;
                    var4.field2636 = var5 - var4.field2640;
                    var4.field2635 = 4096;
                    var4.field2630 = arg1;
                    return;
                }
            }
        }
        class215 var6 = (class215) this.field2596.method3340((long) this.field2603[arg0]);
        if (var6 == null) {
            return;
        }
        class107 var7 = var6.field2661[arg1];
        if (var7 == null) {
            return;
        }
        class213 var8 = new class213();
        var8.field2625 = arg0;
        var8.field2626 = var6;
        var8.field2627 = var7;
        var8.field2628 = var6.field2665[arg1];
        var8.field2629 = var6.field2666[arg1];
        var8.field2630 = arg1;
        var8.field2644 = var6.field2660 * arg2 * arg2 * var6.field2663[arg1] + 1024 >> 11;
        var8.field2632 = var6.field2664[arg1] & 0xFF;
        var8.field2640 = (arg1 << 8) - (var6.field2662[arg1] & 0x7FFF);
        var8.field2631 = 0;
        var8.field2637 = 0;
        var8.field2638 = 0;
        var8.field2641 = -1;
        var8.field2634 = 0;
        if (this.field2613[arg0] == 0) {
            var8.field2643 = class117.method1967(var7, this.method3542(var8), this.method3495(var8), this.method3512(var8));
        } else {
            var8.field2643 = class117.method1967(var7, this.method3542(var8), 0, this.method3512(var8));
            this.method3499(var8, var6.field2662[arg1] < 0);
        }
        if (var6.field2662[arg1] < 0) {
            var8.field2643.method2012(-1);
        }
        if (var8.field2629 >= 0) {
            class213 var9 = this.field2617[arg0][var8.field2629];
            if (var9 != null && var9.field2641 < 0) {
                this.field2597[arg0][var9.field2630] = null;
                var9.field2641 = 0;
            }
            this.field2617[arg0][var8.field2629] = var8;
        }
        this.field2624.field2669.method3400(var8);
        this.field2597[arg0][arg1] = var8;
    }

    @ObfuscatedName("hj.l(Lhp;ZB)V")
    public void method3499(class213 arg0, boolean arg1) {
        int var3 = arg0.field2627.field1520.length;
        int var5;
        if (arg1 && arg0.field2627.field1519) {
            int var4 = var3 + var3 - arg0.field2627.field1521;
            var5 = (int) ((long) this.field2613[arg0.field2625] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2643.method2002(true);
            }
        } else {
            var5 = (int) ((long) this.field2613[arg0.field2625] * (long) var3 >> 6);
        }
        arg0.field2643.method1974(var5);
    }

    @ObfuscatedName("hj.z(IIII)V")
    public void method3500(int arg0, int arg1, int arg2) {
        class213 var4 = this.field2597[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2597[arg0][arg1] = null;
        if ((this.field2610[arg0] & 0x2) == 0) {
            var4.field2641 = 0;
            return;
        }
        for (class213 var5 = (class213) this.field2624.field2669.method3405(); var5 != null; var5 = (class213) this.field2624.field2669.method3414()) {
            if (var4.field2625 == var5.field2625 && var5.field2641 < 0 && var4 != var5) {
                var4.field2641 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("hj.e(IIII)V")
    public void method3568(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("hj.v(III)V")
    public void method3502(int arg0, int arg1) {
    }

    @ObfuscatedName("hj.w(IIS)V")
    public void method3503(int arg0, int arg1) {
        this.field2605[arg0] = arg1;
    }

    @ObfuscatedName("hj.ac(II)V")
    public void method3504(int arg0) {
        for (class213 var2 = (class213) this.field2624.field2669.method3405(); var2 != null; var2 = (class213) this.field2624.field2669.method3414()) {
            if (arg0 < 0 || var2.field2625 == arg0) {
                if (var2.field2643 != null) {
                    var2.field2643.method1998(Statics.field1556 / 100);
                    if (var2.field2643.method2003()) {
                        this.field2624.field2668.method1774(var2.field2643);
                    }
                    var2.method3593();
                }
                if (var2.field2641 < 0) {
                    this.field2597[var2.field2625][var2.field2630] = null;
                }
                var2.method3392();
            }
        }
    }

    @ObfuscatedName("hj.as(IB)V")
    public void method3505(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3505(var2);
            }
            return;
        }
        this.field2599[arg0] = 12800;
        this.field2600[arg0] = 8192;
        this.field2602[arg0] = 16383;
        this.field2605[arg0] = 8192;
        this.field2608[arg0] = 0;
        this.field2607[arg0] = 8192;
        this.method3507(arg0);
        this.method3508(arg0);
        this.field2610[arg0] = 0;
        this.field2611[arg0] = 32767;
        this.field2612[arg0] = 256;
        this.field2613[arg0] = 0;
        this.method3567(arg0, 8192);
    }

    @ObfuscatedName("hj.aw(II)V")
    public void method3494(int arg0) {
        for (class213 var2 = (class213) this.field2624.field2669.method3405(); var2 != null; var2 = (class213) this.field2624.field2669.method3414()) {
            if ((arg0 < 0 || var2.field2625 == arg0) && var2.field2641 < 0) {
                this.field2597[var2.field2625][var2.field2630] = null;
                var2.field2641 = 0;
            }
        }
    }

    @ObfuscatedName("hj.al(I)V")
    public void method3506() {
        this.method3504(-1);
        this.method3505(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2603[var1] = this.field2601[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2604[var2] = this.field2601[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("hj.aj(II)V")
    public void method3507(int arg0) {
        if ((this.field2610[arg0] & 0x2) == 0) {
            return;
        }
        for (class213 var2 = (class213) this.field2624.field2669.method3405(); var2 != null; var2 = (class213) this.field2624.field2669.method3414()) {
            if (var2.field2625 == arg0 && this.field2597[arg0][var2.field2630] == null && var2.field2641 < 0) {
                var2.field2641 = 0;
            }
        }
    }

    @ObfuscatedName("hj.ag(II)V")
    public void method3508(int arg0) {
        if ((this.field2610[arg0] & 0x4) == 0) {
            return;
        }
        for (class213 var2 = (class213) this.field2624.field2669.method3405(); var2 != null; var2 = (class213) this.field2624.field2669.method3414()) {
            if (var2.field2625 == arg0) {
                var2.field2645 = 0;
            }
        }
    }

    @ObfuscatedName("hj.af(IS)V")
    public void method3509(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3500(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3498(var6, var7, var8);
            } else {
                this.method3500(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3568(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2604[var12] = (var14 << 14) + (this.field2604[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2604[var12] = (var14 << 7) + (this.field2604[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2608[var12] = (var14 << 7) + (this.field2608[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2608[var12] = (this.field2608[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2607[var12] = (var14 << 7) + (this.field2607[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2607[var12] = (this.field2607[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2599[var12] = (var14 << 7) + (this.field2599[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2599[var12] = (this.field2599[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2600[var12] = (var14 << 7) + (this.field2600[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2600[var12] = (this.field2600[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2602[var12] = (var14 << 7) + (this.field2602[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2602[var12] = (this.field2602[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2610[var12] |= 0x1;
                } else {
                    this.field2610[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2610[var12] |= 0x2;
                } else {
                    this.method3507(var12);
                    this.field2610[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2611[var12] = (var14 << 7) + (this.field2611[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2611[var12] = (this.field2611[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2611[var12] = (var14 << 7) + (this.field2611[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2611[var12] = (this.field2611[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3504(var12);
            }
            if (var13 == 121) {
                this.method3505(var12);
            }
            if (var13 == 123) {
                this.method3494(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2611[var12];
                if (var15 == 16384) {
                    this.field2612[var12] = (var14 << 7) + (this.field2612[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2611[var12];
                if (var16 == 16384) {
                    this.field2612[var12] = (this.field2612[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2613[var12] = (var14 << 7) + (this.field2613[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2613[var12] = (this.field2613[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2610[var12] |= 0x4;
                } else {
                    this.method3508(var12);
                    this.field2610[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3567(var12, (var14 << 7) + (this.field2598[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3567(var12, (this.field2598[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3497(var17, this.field2604[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3502(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method3503(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3506();
            }
        }
    }

    @ObfuscatedName("hj.ay(III)V")
    public void method3567(int arg0, int arg1) {
        this.field2598[arg0] = arg1;
        this.field2615[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("hj.ab(Lhp;B)I")
    public int method3542(class213 arg0) {
        int var2 = (arg0.field2636 * arg0.field2635 >> 12) + arg0.field2640;
        int var3 = ((this.field2605[arg0.field2625] - 8192) * this.field2612[arg0.field2625] >> 12) + var2;
        class210 var4 = arg0.field2628;
        if (var4.field2583 > 0 && (var4.field2582 > 0 || this.field2608[arg0.field2625] > 0)) {
            int var5 = var4.field2582 << 2;
            int var6 = var4.field2585 << 1;
            if (arg0.field2633 < var6) {
                var5 = arg0.field2633 * var5 / var6;
            }
            int var7 = (this.field2608[arg0.field2625] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2642 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2627.field1523 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1556 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("hj.ax(Lhp;I)I")
    public int method3495(class213 arg0) {
        class210 var2 = arg0.field2628;
        int var3 = this.field2602[arg0.field2625] * this.field2599[arg0.field2625] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2644 * var4 + 16384 >> 15;
        int var6 = this.field2614 * var5 + 128 >> 8;
        if (var2.field2578 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2631 * 1.953125E-5D * (double) var2.field2578) + 0.5D);
        }
        if (var2.field2577 != null) {
            int var7 = arg0.field2637;
            int var8 = var2.field2577[arg0.field2638 + 1];
            if (arg0.field2638 < var2.field2577.length - 2) {
                int var9 = (var2.field2577[arg0.field2638] & 0xFF) << 8;
                int var10 = (var2.field2577[arg0.field2638 + 2] & 0xFF) << 8;
                var8 += (var2.field2577[arg0.field2638 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2641 > 0 && var2.field2580 != null) {
            int var11 = arg0.field2641;
            int var12 = var2.field2580[arg0.field2634 + 1];
            if (arg0.field2634 < var2.field2580.length - 2) {
                int var13 = (var2.field2580[arg0.field2634] & 0xFF) << 8;
                int var14 = (var2.field2580[arg0.field2634 + 2] & 0xFF) << 8;
                var12 += (var2.field2580[arg0.field2634 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("hj.ai(Lhp;I)I")
    public int method3512(class213 arg0) {
        int var2 = this.field2600[arg0.field2625];
        return var2 < 8192 ? arg0.field2632 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2632) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("hj.f()Ldk;")
    public synchronized class119 method1761() {
        return this.field2624;
    }

    @ObfuscatedName("hj.u()Ldk;")
    public synchronized class119 method1745() {
        return null;
    }

    @ObfuscatedName("hj.t()I")
    public synchronized int method1739() {
        return 0;
    }

    @ObfuscatedName("hj.k([III)V")
    public synchronized void method1744(int[] arg0, int arg1, int arg2) {
        if (this.field2618.method3599()) {
            int var4 = this.field2606 * this.field2618.field2647 / Statics.field1556;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2622;
                if (this.field2623 - var5 >= 0L) {
                    this.field2622 = var5;
                    break;
                }
                int var7 = (int) ((this.field2623 - this.field2622 + (long) var4 - 1L) / (long) var4);
                this.field2622 += (long) var4 * (long) var7;
                this.field2624.method1744(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3515();
            } while (this.field2618.method3599());
        }
        this.field2624.method1744(arg0, arg1, arg2);
    }

    @ObfuscatedName("hj.d(I)V")
    public synchronized void method1748(int arg0) {
        if (this.field2618.method3599()) {
            int var2 = this.field2606 * this.field2618.field2647 / Statics.field1556;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2622;
                if (this.field2623 - var3 >= 0L) {
                    this.field2622 = var3;
                    break;
                }
                int var5 = (int) ((this.field2623 - this.field2622 + (long) var2 - 1L) / (long) var2);
                this.field2622 += (long) var2 * (long) var5;
                this.field2624.method1748(var5);
                arg0 -= var5;
                this.method3515();
            } while (this.field2618.method3599());
        }
        this.field2624.method1748(arg0);
    }

    @ObfuscatedName("hj.az(I)V")
    public void method3515() {
        int var1 = this.field2620;
        int var2 = this.field2616;
        long var3 = this.field2623;
        while (this.field2616 == var2) {
            while (this.field2618.field2655[var1] == var2) {
                this.field2618.method3601(var1);
                int var5 = this.field2618.method3596(var1);
                if (var5 == 1) {
                    this.field2618.method3627();
                    this.field2618.method3602(var1);
                    if (this.field2618.method3610()) {
                        if (!this.field2619 || var2 == 0) {
                            this.method3506();
                            this.field2618.method3608();
                            return;
                        }
                        this.field2618.method3611(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3509(var5);
                }
                this.field2618.method3618(var1);
                this.field2618.method3602(var1);
            }
            var1 = this.field2618.method3609();
            var2 = this.field2618.field2655[var1];
            var3 = this.field2618.method3612(var2);
        }
        this.field2620 = var1;
        this.field2616 = var2;
        this.field2623 = var3;
    }

    @ObfuscatedName("hj.aa(Lhp;B)Z")
    public boolean method3516(class213 arg0) {
        if (arg0.field2643 != null) {
            return false;
        }
        if (arg0.field2641 >= 0) {
            arg0.method3392();
            if (arg0.field2629 > 0 && this.field2617[arg0.field2625][arg0.field2629] == arg0) {
                this.field2617[arg0.field2625][arg0.field2629] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("hj.ad(Lhp;[IIIB)Z")
    public boolean method3517(class213 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2639 = Statics.field1556 / 100;
        if (arg0.field2641 >= 0 && arg0.field2643 == null || arg0.field2643.method1982()) {
            arg0.method3593();
            arg0.method3392();
            if (arg0.field2629 > 0 && this.field2617[arg0.field2625][arg0.field2629] == arg0) {
                this.field2617[arg0.field2625][arg0.field2629] = null;
            }
            return true;
        }
        int var5 = arg0.field2635;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2607[arg0.field2625] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2635 = var6;
        }
        arg0.field2643.method1962(this.method3542(arg0));
        class210 var7 = arg0.field2628;
        boolean var8 = false;
        arg0.field2633++;
        arg0.field2642 += var7.field2583;
        double var9 = (double) ((arg0.field2630 - 60 << 8) + (arg0.field2636 * arg0.field2635 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2578 > 0) {
            if (var7.field2579 > 0) {
                arg0.field2631 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2579 * var9) + 0.5D);
            } else {
                arg0.field2631 += 128;
            }
        }
        if (var7.field2577 != null) {
            if (var7.field2576 > 0) {
                arg0.field2637 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2576 * var9) + 0.5D);
            } else {
                arg0.field2637 += 128;
            }
            while (arg0.field2638 < var7.field2577.length - 2 && arg0.field2637 > (var7.field2577[arg0.field2638 + 2] & 0xFF) << 8) {
                arg0.field2638 += 2;
            }
            if (arg0.field2638 == var7.field2577.length - 2 && var7.field2577[arg0.field2638 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2641 >= 0 && var7.field2580 != null && (this.field2610[arg0.field2625] & 0x1) == 0 && (arg0.field2629 < 0 || this.field2617[arg0.field2625][arg0.field2629] != arg0)) {
            if (var7.field2584 > 0) {
                arg0.field2641 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2584 * var9) + 0.5D);
            } else {
                arg0.field2641 += 128;
            }
            while (arg0.field2634 < var7.field2580.length - 2 && arg0.field2641 > (var7.field2580[arg0.field2634 + 2] & 0xFF) << 8) {
                arg0.field2634 += 2;
            }
            if (arg0.field2634 == var7.field2580.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2643.method1977(arg0.field2639, this.method3495(arg0), this.method3512(arg0));
            return false;
        }
        arg0.field2643.method1998(arg0.field2639);
        if (arg1 == null) {
            arg0.field2643.method1748(arg3);
        } else {
            arg0.field2643.method1744(arg1, arg2, arg3);
        }
        if (arg0.field2643.method2003()) {
            this.field2624.field2668.method1774(arg0.field2643);
        }
        arg0.method3593();
        if (arg0.field2641 >= 0) {
            arg0.method3392();
            if (arg0.field2629 > 0 && this.field2617[arg0.field2625][arg0.field2629] == arg0) {
                this.field2617[arg0.field2625][arg0.field2629] = null;
            }
        }
        return true;
    }
}
