package deob;

@ObfuscatedName("hp")
public class class212 extends class119 {

    @ObfuscatedName("hp.m")
    public class198 field2610 = new class198(128);

    @ObfuscatedName("hp.p")
    public int field2605 = 256;

    @ObfuscatedName("hp.i")
    public int field2606 = 1000000;

    @ObfuscatedName("hp.j")
    public int[] field2607 = new int[16];

    @ObfuscatedName("hp.v")
    public int[] field2611 = new int[16];

    @ObfuscatedName("hp.x")
    public int[] field2631 = new int[16];

    @ObfuscatedName("hp.e")
    public int[] field2622 = new int[16];

    @ObfuscatedName("hp.l")
    public int[] field2604 = new int[16];

    @ObfuscatedName("hp.b")
    public int[] field2612 = new int[16];

    @ObfuscatedName("hp.n")
    public int[] field2613 = new int[16];

    @ObfuscatedName("hp.c")
    public int[] field2627 = new int[16];

    @ObfuscatedName("hp.a")
    public int[] field2615 = new int[16];

    @ObfuscatedName("hp.g")
    public int[] field2617 = new int[16];

    @ObfuscatedName("hp.z")
    public int[] field2618 = new int[16];

    @ObfuscatedName("hp.o")
    public int[] field2619 = new int[16];

    @ObfuscatedName("hp.d")
    public int[] field2620 = new int[16];

    @ObfuscatedName("hp.s")
    public int[] field2621 = new int[16];

    @ObfuscatedName("hp.f")
    public int[] field2614 = new int[16];

    @ObfuscatedName("hp.q")
    public class213[][] field2623 = new class213[16][128];

    @ObfuscatedName("hp.al")
    public class213[][] field2632 = new class213[16][128];

    @ObfuscatedName("hp.ao")
    public class214 field2625 = new class214();

    @ObfuscatedName("hp.aq")
    public boolean field2626;

    @ObfuscatedName("hp.ab")
    public int field2624;

    @ObfuscatedName("hp.as")
    public int field2628;

    @ObfuscatedName("hp.ag")
    public long field2629;

    @ObfuscatedName("hp.ap")
    public long field2630;

    @ObfuscatedName("hp.av")
    public class216 field2609 = new class216(this);

    public class212() {
        this.method3584();
    }

    @ObfuscatedName("hp.m(II)V")
    public synchronized void method3566(int arg0) {
        this.field2605 = arg0;
    }

    @ObfuscatedName("hp.p(B)I")
    public int method3567() {
        return this.field2605;
    }

    @ObfuscatedName("hp.i(Lhv;Lik;Ldn;IB)Z")
    public synchronized boolean method3568(class217 arg0, class243 arg1, class112 arg2, int arg3) {
        arg0.method3750();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class207 var7 = (class207) arg0.field2679.method3433(); var7 != null; var7 = (class207) arg0.field2679.method3440()) {
            int var8 = (int) var7.field2563;
            class215 var9 = (class215) this.field2610.method3444((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method4026(var8);
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
                this.field2610.method3431(var11, (long) var8);
            }
            if (!var9.method3734(arg2, var7.field2578, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3749();
        }
        return var5;
    }

    @ObfuscatedName("hp.j(I)V")
    public synchronized void method3569() {
        for (class215 var1 = (class215) this.field2610.method3433(); var1 != null; var1 = (class215) this.field2610.method3440()) {
            var1.method3736();
        }
    }

    @ObfuscatedName("hp.v(I)V")
    public synchronized void method3570() {
        for (class215 var1 = (class215) this.field2610.method3433(); var1 != null; var1 = (class215) this.field2610.method3440()) {
            var1.method3476();
        }
    }

    @ObfuscatedName("hp.n(Lhv;ZI)V")
    public synchronized void method3572(class217 arg0, boolean arg1) {
        this.method3664();
        this.field2625.method3725(arg0.field2680);
        this.field2626 = arg1;
        this.field2629 = 0L;
        int var3 = this.field2625.method3680();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2625.method3681(var4);
            this.field2625.method3684(var4);
            this.field2625.method3682(var4);
        }
        this.field2624 = this.field2625.method3689();
        this.field2628 = this.field2625.field2658[this.field2624];
        this.field2630 = this.field2625.method3688(this.field2628);
    }

    @ObfuscatedName("hp.a(I)V")
    public synchronized void method3664() {
        this.field2625.method3678();
        this.method3584();
    }

    @ObfuscatedName("hp.y(B)Z")
    public synchronized boolean method3573() {
        return this.field2625.method3679();
    }

    @ObfuscatedName("hp.w(III)V")
    public synchronized void method3574(int arg0, int arg1) {
        this.method3575(arg0, arg1);
    }

    @ObfuscatedName("hp.k(III)V")
    public void method3575(int arg0, int arg1) {
        this.field2622[arg0] = arg1;
        this.field2612[arg0] = arg1 & 0xFFFFFF80;
        this.method3576(arg0, arg1);
    }

    @ObfuscatedName("hp.t(IIB)V")
    public void method3576(int arg0, int arg1) {
        if (this.field2604[arg0] != arg1) {
            this.field2604[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2632[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("hp.h(IIII)V")
    public void method3577(int arg0, int arg1, int arg2) {
        this.method3588(arg0, arg1, 64);
        if ((this.field2617[arg0] & 0x2) != 0) {
            for (class213 var4 = (class213) this.field2609.field2678.method3487(); var4 != null; var4 = (class213) this.field2609.field2678.method3489()) {
                if (var4.field2638 == arg0 && var4.field2647 < 0) {
                    this.field2623[arg0][var4.field2651] = null;
                    this.field2623[arg0][arg1] = var4;
                    int var5 = (var4.field2642 * var4.field2637 >> 12) + var4.field2645;
                    var4.field2645 += arg1 - var4.field2651 << 8;
                    var4.field2642 = var5 - var4.field2645;
                    var4.field2637 = 4096;
                    var4.field2651 = arg1;
                    return;
                }
            }
        }
        class215 var6 = (class215) this.field2610.method3444((long) this.field2604[arg0]);
        if (var6 == null) {
            return;
        }
        class107 var7 = var6.field2673[arg1];
        if (var7 == null) {
            return;
        }
        class213 var8 = new class213();
        var8.field2638 = arg0;
        var8.field2634 = var6;
        var8.field2643 = var7;
        var8.field2636 = var6.field2669[arg1];
        var8.field2641 = var6.field2674[arg1];
        var8.field2651 = arg1;
        var8.field2639 = var6.field2675 * arg2 * arg2 * var6.field2671[arg1] + 1024 >> 11;
        var8.field2640 = var6.field2672[arg1] & 0xFF;
        var8.field2645 = (arg1 << 8) - (var6.field2670[arg1] & 0x7FFF);
        var8.field2644 = 0;
        var8.field2650 = 0;
        var8.field2635 = 0;
        var8.field2647 = -1;
        var8.field2648 = 0;
        if (this.field2620[arg0] == 0) {
            var8.field2646 = class117.method2121(var7, this.method3607(var8), this.method3625(var8), this.method3591(var8));
        } else {
            var8.field2646 = class117.method2121(var7, this.method3607(var8), 0, this.method3591(var8));
            this.method3578(var8, var6.field2670[arg1] < 0);
        }
        if (var6.field2670[arg1] < 0) {
            var8.field2646.method2027(-1);
        }
        if (var8.field2641 >= 0) {
            class213 var9 = this.field2632[arg0][var8.field2641];
            if (var9 != null && var9.field2647 < 0) {
                this.field2623[arg0][var9.field2651] = null;
                var9.field2647 = 0;
            }
            this.field2632[arg0][var8.field2641] = var8;
        }
        this.field2609.field2678.method3480(var8);
        this.field2623[arg0][arg1] = var8;
    }

    @ObfuscatedName("hp.u(Lhg;ZI)V")
    public void method3578(class213 arg0, boolean arg1) {
        int var3 = arg0.field2643.field1528.length;
        int var5;
        if (arg1 && arg0.field2643.field1532) {
            int var4 = var3 + var3 - arg0.field2643.field1530;
            var5 = (int) ((long) this.field2620[arg0.field2638] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2646.method2034(true);
            }
        } else {
            var5 = (int) ((long) this.field2620[arg0.field2638] * (long) var3 >> 6);
        }
        arg0.field2646.method2033(var5);
    }

    @ObfuscatedName("hp.r(IIII)V")
    public void method3588(int arg0, int arg1, int arg2) {
        class213 var4 = this.field2623[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2623[arg0][arg1] = null;
        if ((this.field2617[arg0] & 0x2) == 0) {
            var4.field2647 = 0;
            return;
        }
        for (class213 var5 = (class213) this.field2609.field2678.method3486(); var5 != null; var5 = (class213) this.field2609.field2678.method3507()) {
            if (var4.field2638 == var5.field2638 && var5.field2647 < 0 && var4 != var5) {
                var4.field2647 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("hp.o(IIII)V")
    public void method3580(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("hp.q(III)V")
    public void method3589(int arg0, int arg1) {
    }

    @ObfuscatedName("hp.al(III)V")
    public void method3601(int arg0, int arg1) {
        this.field2613[arg0] = arg1;
    }

    @ObfuscatedName("hp.ay(II)V")
    public void method3582(int arg0) {
        for (class213 var2 = (class213) this.field2609.field2678.method3486(); var2 != null; var2 = (class213) this.field2609.field2678.method3507()) {
            if (arg0 < 0 || var2.field2638 == arg0) {
                if (var2.field2646 != null) {
                    var2.field2646.method2038(Statics.field1554 / 100);
                    if (var2.field2646.method2073()) {
                        this.field2609.field2676.method1804(var2.field2646);
                    }
                    var2.method3674();
                }
                if (var2.field2647 < 0) {
                    this.field2623[var2.field2638][var2.field2651] = null;
                }
                var2.method3476();
            }
        }
    }

    @ObfuscatedName("hp.az(II)V")
    public void method3606(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3606(var2);
            }
            return;
        }
        this.field2607[arg0] = 12800;
        this.field2611[arg0] = 8192;
        this.field2631[arg0] = 16383;
        this.field2613[arg0] = 8192;
        this.field2627[arg0] = 0;
        this.field2615[arg0] = 8192;
        this.method3585(arg0);
        this.method3586(arg0);
        this.field2617[arg0] = 0;
        this.field2618[arg0] = 32767;
        this.field2619[arg0] = 256;
        this.field2620[arg0] = 0;
        this.method3594(arg0, 8192);
    }

    @ObfuscatedName("hp.aw(II)V")
    public void method3622(int arg0) {
        for (class213 var2 = (class213) this.field2609.field2678.method3486(); var2 != null; var2 = (class213) this.field2609.field2678.method3507()) {
            if ((arg0 < 0 || var2.field2638 == arg0) && var2.field2647 < 0) {
                this.field2623[var2.field2638][var2.field2651] = null;
                var2.field2647 = 0;
            }
        }
    }

    @ObfuscatedName("hp.au(I)V")
    public void method3584() {
        this.method3582(-1);
        this.method3606(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2604[var1] = this.field2622[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2612[var2] = this.field2622[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("hp.ai(II)V")
    public void method3585(int arg0) {
        if ((this.field2617[arg0] & 0x2) == 0) {
            return;
        }
        for (class213 var2 = (class213) this.field2609.field2678.method3486(); var2 != null; var2 = (class213) this.field2609.field2678.method3507()) {
            if (var2.field2638 == arg0 && this.field2623[arg0][var2.field2651] == null && var2.field2647 < 0) {
                var2.field2647 = 0;
            }
        }
    }

    @ObfuscatedName("hp.ax(IS)V")
    public void method3586(int arg0) {
        if ((this.field2617[arg0] & 0x4) == 0) {
            return;
        }
        for (class213 var2 = (class213) this.field2609.field2678.method3486(); var2 != null; var2 = (class213) this.field2609.field2678.method3507()) {
            if (var2.field2638 == arg0) {
                var2.field2653 = 0;
            }
        }
    }

    @ObfuscatedName("hp.af(II)V")
    public void method3587(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3588(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3577(var6, var7, var8);
            } else {
                this.method3588(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3580(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2612[var12] = (var14 << 14) + (this.field2612[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2612[var12] = (var14 << 7) + (this.field2612[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2627[var12] = (var14 << 7) + (this.field2627[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2627[var12] = (this.field2627[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2615[var12] = (var14 << 7) + (this.field2615[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2615[var12] = (this.field2615[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2607[var12] = (var14 << 7) + (this.field2607[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2607[var12] = (this.field2607[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2611[var12] = (var14 << 7) + (this.field2611[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2611[var12] = (this.field2611[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2631[var12] = (var14 << 7) + (this.field2631[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2631[var12] = (this.field2631[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2617[var12] |= 0x1;
                } else {
                    this.field2617[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2617[var12] |= 0x2;
                } else {
                    this.method3585(var12);
                    this.field2617[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2618[var12] = (var14 << 7) + (this.field2618[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2618[var12] = (this.field2618[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2618[var12] = (var14 << 7) + (this.field2618[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2618[var12] = (this.field2618[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3582(var12);
            }
            if (var13 == 121) {
                this.method3606(var12);
            }
            if (var13 == 123) {
                this.method3622(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2618[var12];
                if (var15 == 16384) {
                    this.field2619[var12] = (var14 << 7) + (this.field2619[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2618[var12];
                if (var16 == 16384) {
                    this.field2619[var12] = (this.field2619[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2620[var12] = (var14 << 7) + (this.field2620[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2620[var12] = (this.field2620[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2617[var12] |= 0x4;
                } else {
                    this.method3586(var12);
                    this.field2617[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3594(var12, (var14 << 7) + (this.field2621[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3594(var12, (this.field2621[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3576(var17, this.field2612[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3589(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method3601(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3584();
            }
        }
    }

    @ObfuscatedName("hp.ad(III)V")
    public void method3594(int arg0, int arg1) {
        this.field2621[arg0] = arg1;
        this.field2614[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("hp.aj(Lhg;I)I")
    public int method3607(class213 arg0) {
        int var2 = (arg0.field2642 * arg0.field2637 >> 12) + arg0.field2645;
        int var3 = ((this.field2613[arg0.field2638] - 8192) * this.field2619[arg0.field2638] >> 12) + var2;
        class210 var4 = arg0.field2636;
        if (var4.field2587 > 0 && (var4.field2589 > 0 || this.field2627[arg0.field2638] > 0)) {
            int var5 = var4.field2589 << 2;
            int var6 = var4.field2588 << 1;
            if (arg0.field2649 < var6) {
                var5 = arg0.field2649 * var5 / var6;
            }
            int var7 = (this.field2627[arg0.field2638] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2633 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2643.field1529 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1554 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("hp.ae(Lhg;B)I")
    public int method3625(class213 arg0) {
        class210 var2 = arg0.field2636;
        int var3 = this.field2631[arg0.field2638] * this.field2607[arg0.field2638] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2639 * var4 + 16384 >> 15;
        int var6 = this.field2605 * var5 + 128 >> 8;
        if (var2.field2585 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2644 * 1.953125E-5D * (double) var2.field2585) + 0.5D);
        }
        if (var2.field2591 != null) {
            int var7 = arg0.field2650;
            int var8 = var2.field2591[arg0.field2635 + 1];
            if (arg0.field2635 < var2.field2591.length - 2) {
                int var9 = (var2.field2591[arg0.field2635] & 0xFF) << 8;
                int var10 = (var2.field2591[arg0.field2635 + 2] & 0xFF) << 8;
                var8 += (var2.field2591[arg0.field2635 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2647 > 0 && var2.field2584 != null) {
            int var11 = arg0.field2647;
            int var12 = var2.field2584[arg0.field2648 + 1];
            if (arg0.field2648 < var2.field2584.length - 2) {
                int var13 = (var2.field2584[arg0.field2648] & 0xFF) << 8;
                int var14 = (var2.field2584[arg0.field2648 + 2] & 0xFF) << 8;
                var12 += (var2.field2584[arg0.field2648 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("hp.ar(Lhg;I)I")
    public int method3591(class213 arg0) {
        int var2 = this.field2611[arg0.field2638];
        return var2 < 8192 ? arg0.field2640 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2640) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("hp.x()Ldq;")
    public synchronized class119 method1809() {
        return this.field2609;
    }

    @ObfuscatedName("hp.e()Ldq;")
    public synchronized class119 method1810() {
        return null;
    }

    @ObfuscatedName("hp.l()I")
    public synchronized int method1811() {
        return 0;
    }

    @ObfuscatedName("hp.b([III)V")
    public synchronized void method1812(int[] arg0, int arg1, int arg2) {
        if (this.field2625.method3679()) {
            int var4 = this.field2606 * this.field2625.field2655 / Statics.field1554;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2629;
                if (this.field2630 - var5 >= 0L) {
                    this.field2629 = var5;
                    break;
                }
                int var7 = (int) ((this.field2630 - this.field2629 + (long) var4 - 1L) / (long) var4);
                this.field2629 += (long) var4 * (long) var7;
                this.field2609.method1812(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3595();
            } while (this.field2625.method3679());
        }
        this.field2609.method1812(arg0, arg1, arg2);
    }

    @ObfuscatedName("hp.c(I)V")
    public synchronized void method1814(int arg0) {
        if (this.field2625.method3679()) {
            int var2 = this.field2606 * this.field2625.field2655 / Statics.field1554;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2629;
                if (this.field2630 - var3 >= 0L) {
                    this.field2629 = var3;
                    break;
                }
                int var5 = (int) ((this.field2630 - this.field2629 + (long) var2 - 1L) / (long) var2);
                this.field2629 += (long) var2 * (long) var5;
                this.field2609.method1814(var5);
                arg0 -= var5;
                this.method3595();
            } while (this.field2625.method3679());
        }
        this.field2609.method1814(arg0);
    }

    @ObfuscatedName("hp.bu(B)V")
    public void method3595() {
        int var1 = this.field2624;
        int var2 = this.field2628;
        long var3 = this.field2630;
        while (this.field2628 == var2) {
            while (this.field2625.field2658[var1] == var2) {
                this.field2625.method3681(var1);
                int var5 = this.field2625.method3706(var1);
                if (var5 == 1) {
                    this.field2625.method3683();
                    this.field2625.method3682(var1);
                    if (this.field2625.method3690()) {
                        if (!this.field2626 || var2 == 0) {
                            this.method3584();
                            this.field2625.method3678();
                            return;
                        }
                        this.field2625.method3691(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3587(var5);
                }
                this.field2625.method3684(var1);
                this.field2625.method3682(var1);
            }
            var1 = this.field2625.method3689();
            var2 = this.field2625.field2658[var1];
            var3 = this.field2625.method3688(var2);
        }
        this.field2624 = var1;
        this.field2628 = var2;
        this.field2630 = var3;
    }

    @ObfuscatedName("hp.bk(Lhg;I)Z")
    public boolean method3657(class213 arg0) {
        if (arg0.field2646 != null) {
            return false;
        }
        if (arg0.field2647 >= 0) {
            arg0.method3476();
            if (arg0.field2641 > 0 && this.field2632[arg0.field2638][arg0.field2641] == arg0) {
                this.field2632[arg0.field2638][arg0.field2641] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("hp.bo(Lhg;[IIIS)Z")
    public boolean method3597(class213 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2652 = Statics.field1554 / 100;
        if (arg0.field2647 >= 0 && arg0.field2646 == null || arg0.field2646.method2021()) {
            arg0.method3674();
            arg0.method3476();
            if (arg0.field2641 > 0 && this.field2632[arg0.field2638][arg0.field2641] == arg0) {
                this.field2632[arg0.field2638][arg0.field2641] = null;
            }
            return true;
        }
        int var5 = arg0.field2637;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2615[arg0.field2638] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2637 = var6;
        }
        arg0.field2646.method2046(this.method3607(arg0));
        class210 var7 = arg0.field2636;
        boolean var8 = false;
        arg0.field2649++;
        arg0.field2633 += var7.field2587;
        double var9 = (double) ((arg0.field2651 - 60 << 8) + (arg0.field2642 * arg0.field2637 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2585 > 0) {
            if (var7.field2590 > 0) {
                arg0.field2644 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2590 * var9) + 0.5D);
            } else {
                arg0.field2644 += 128;
            }
        }
        if (var7.field2591 != null) {
            if (var7.field2586 > 0) {
                arg0.field2650 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2586 * var9) + 0.5D);
            } else {
                arg0.field2650 += 128;
            }
            while (arg0.field2635 < var7.field2591.length - 2 && arg0.field2650 > (var7.field2591[arg0.field2635 + 2] & 0xFF) << 8) {
                arg0.field2635 += 2;
            }
            if (arg0.field2635 == var7.field2591.length - 2 && var7.field2591[arg0.field2635 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2647 >= 0 && var7.field2584 != null && (this.field2617[arg0.field2638] & 0x1) == 0 && (arg0.field2641 < 0 || this.field2632[arg0.field2638][arg0.field2641] != arg0)) {
            if (var7.field2583 > 0) {
                arg0.field2647 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2583 * var9) + 0.5D);
            } else {
                arg0.field2647 += 128;
            }
            while (arg0.field2648 < var7.field2584.length - 2 && arg0.field2647 > (var7.field2584[arg0.field2648 + 2] & 0xFF) << 8) {
                arg0.field2648 += 2;
            }
            if (arg0.field2648 == var7.field2584.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2646.method2118(arg0.field2652, this.method3625(arg0), this.method3591(arg0));
            return false;
        }
        arg0.field2646.method2038(arg0.field2652);
        if (arg1 == null) {
            arg0.field2646.method1814(arg3);
        } else {
            arg0.field2646.method1812(arg1, arg2, arg3);
        }
        if (arg0.field2646.method2073()) {
            this.field2609.field2676.method1804(arg0.field2646);
        }
        arg0.method3674();
        if (arg0.field2647 >= 0) {
            arg0.method3476();
            if (arg0.field2641 > 0 && this.field2632[arg0.field2638][arg0.field2641] == arg0) {
                this.field2632[arg0.field2638][arg0.field2641] = null;
            }
        }
        return true;
    }
}
