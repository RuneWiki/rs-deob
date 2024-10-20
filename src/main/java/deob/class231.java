package deob;

@ObfuscatedName("hk")
public class class231 extends class118 {

    @ObfuscatedName("hk.t")
    public class215 field2696 = new class215(128);

    @ObfuscatedName("hk.q")
    public int field2682 = 256;

    @ObfuscatedName("hk.i")
    public int field2691 = 1000000;

    @ObfuscatedName("hk.a")
    public int[] field2684 = new int[16];

    @ObfuscatedName("hk.l")
    public int[] field2685 = new int[16];

    @ObfuscatedName("hk.b")
    public int[] field2686 = new int[16];

    @ObfuscatedName("hk.e")
    public int[] field2707 = new int[16];

    @ObfuscatedName("hk.x")
    public int[] field2688 = new int[16];

    @ObfuscatedName("hk.p")
    public int[] field2689 = new int[16];

    @ObfuscatedName("hk.g")
    public int[] field2681 = new int[16];

    @ObfuscatedName("hk.n")
    public int[] field2706 = new int[16];

    @ObfuscatedName("hk.o")
    public int[] field2692 = new int[16];

    @ObfuscatedName("hk.s")
    public int[] field2694 = new int[16];

    @ObfuscatedName("hk.d")
    public int[] field2695 = new int[16];

    @ObfuscatedName("hk.f")
    public int[] field2710 = new int[16];

    @ObfuscatedName("hk.r")
    public int[] field2690 = new int[16];

    @ObfuscatedName("hk.y")
    public int[] field2698 = new int[16];

    @ObfuscatedName("hk.h")
    public int[] field2699 = new int[16];

    @ObfuscatedName("hk.m")
    public class232[][] field2700 = new class232[16][128];

    @ObfuscatedName("hk.ay")
    public class232[][] field2697 = new class232[16][128];

    @ObfuscatedName("hk.ao")
    public class233 field2702 = new class233();

    @ObfuscatedName("hk.av")
    public boolean field2703;

    @ObfuscatedName("hk.aj")
    public int field2704;

    @ObfuscatedName("hk.ae")
    public int field2705;

    @ObfuscatedName("hk.am")
    public long field2701;

    @ObfuscatedName("hk.az")
    public long field2687;

    @ObfuscatedName("hk.ap")
    public class235 field2708 = new class235(this);

    public class231() {
        this.method3860();
    }

    @ObfuscatedName("hk.t(II)V")
    public synchronized void method3882(int arg0) {
        this.field2682 = arg0;
    }

    @ObfuscatedName("hk.q(I)I")
    public int method3868() {
        return this.field2682;
    }

    @ObfuscatedName("hk.i(Lix;Ljc;Ldc;IB)Z")
    public synchronized boolean method3945(class236 arg0, class262 arg1, class111 arg2, int arg3) {
        arg0.method4020();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class226 var7 = (class226) arg0.field2764.method3667(); var7 != null; var7 = (class226) arg0.field2764.method3672()) {
            int var8 = (int) var7.field2636;
            class234 var9 = (class234) this.field2696.method3677((long) var8);
            if (var9 == null) {
                var9 = class234.method1893(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field2696.method3669(var9, (long) var8);
            }
            if (!var9.method4004(arg2, var7.field2655, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method4023();
        }
        return var5;
    }

    @ObfuscatedName("hk.a(I)V")
    public synchronized void method3844() {
        for (class234 var1 = (class234) this.field2696.method3667(); var1 != null; var1 = (class234) this.field2696.method3672()) {
            var1.method4005();
        }
    }

    @ObfuscatedName("hk.l(I)V")
    public synchronized void method3899() {
        for (class234 var1 = (class234) this.field2696.method3667(); var1 != null; var1 = (class234) this.field2696.method3672()) {
            var1.method3721();
        }
    }

    @ObfuscatedName("hk.o(Lix;ZI)V")
    public synchronized void method3846(class236 arg0, boolean arg1) {
        this.method3847();
        this.field2702.method3953(arg0.field2763);
        this.field2703 = arg1;
        this.field2701 = 0L;
        int var3 = this.field2702.method3983();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2702.method3957(var4);
            this.field2702.method3960(var4);
            this.field2702.method3956(var4);
        }
        this.field2704 = this.field2702.method3963();
        this.field2705 = this.field2702.field2737[this.field2704];
        this.field2687 = this.field2702.method3974(this.field2705);
    }

    @ObfuscatedName("hk.u(B)V")
    public synchronized void method3847() {
        this.field2702.method3965();
        this.method3860();
    }

    @ObfuscatedName("hk.k(I)Z")
    public synchronized boolean method3873() {
        return this.field2702.method3955();
    }

    @ObfuscatedName("hk.z(III)V")
    public synchronized void method3849(int arg0, int arg1) {
        this.method3850(arg0, arg1);
    }

    @ObfuscatedName("hk.w(IIB)V")
    public void method3850(int arg0, int arg1) {
        this.field2707[arg0] = arg1;
        this.field2689[arg0] = arg1 & 0xFFFFFF80;
        this.method3851(arg0, arg1);
    }

    @ObfuscatedName("hk.s(III)V")
    public void method3851(int arg0, int arg1) {
        if (this.field2688[arg0] != arg1) {
            this.field2688[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2697[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("hk.d(IIIB)V")
    public void method3928(int arg0, int arg1, int arg2) {
        this.method3848(arg0, arg1, 64);
        if ((this.field2694[arg0] & 0x2) != 0) {
            for (class232 var4 = (class232) this.field2708.field2758.method3734(); var4 != null; var4 = (class232) this.field2708.field2758.method3744()) {
                if (var4.field2727 == arg0 && var4.field2712 < 0) {
                    this.field2700[arg0][var4.field2717] = null;
                    this.field2700[arg0][arg1] = var4;
                    int var5 = (var4.field2722 * var4.field2721 >> 12) + var4.field2713;
                    var4.field2713 += arg1 - var4.field2717 << 8;
                    var4.field2721 = var5 - var4.field2713;
                    var4.field2722 = 4096;
                    var4.field2717 = arg1;
                    return;
                }
            }
        }
        class234 var6 = (class234) this.field2696.method3677((long) this.field2688[arg0]);
        if (var6 == null) {
            return;
        }
        class106 var7 = var6.field2748[arg1];
        if (var7 == null) {
            return;
        }
        class232 var8 = new class232();
        var8.field2727 = arg0;
        var8.field2728 = var6;
        var8.field2714 = var7;
        var8.field2715 = var6.field2752[arg1];
        var8.field2716 = var6.field2747[arg1];
        var8.field2717 = arg1;
        var8.field2718 = var6.field2754 * arg2 * arg2 * var6.field2750[arg1] + 1024 >> 11;
        var8.field2719 = var6.field2751[arg1] & 0xFF;
        var8.field2713 = (arg1 << 8) - (var6.field2749[arg1] & 0x7FFF);
        var8.field2723 = 0;
        var8.field2720 = 0;
        var8.field2731 = 0;
        var8.field2712 = -1;
        var8.field2730 = 0;
        if (this.field2690[arg0] == 0) {
            var8.field2724 = class116.method2133(var7, this.method3911(var8), this.method3842(var8), this.method3867(var8));
        } else {
            var8.field2724 = class116.method2133(var7, this.method3911(var8), 0, this.method3867(var8));
            this.method3918(var8, var6.field2749[arg1] < 0);
        }
        if (var6.field2749[arg1] < 0) {
            var8.field2724.method2186(-1);
        }
        if (var8.field2716 >= 0) {
            class232 var9 = this.field2697[arg0][var8.field2716];
            if (var9 != null && var9.field2712 < 0) {
                this.field2700[arg0][var9.field2717] = null;
                var9.field2712 = 0;
            }
            this.field2697[arg0][var8.field2716] = var8;
        }
        this.field2708.field2758.method3759(var8);
        this.field2700[arg0][arg1] = var8;
    }

    @ObfuscatedName("hk.f(Lhb;ZB)V")
    public void method3918(class232 arg0, boolean arg1) {
        int var3 = arg0.field2714.field1521.length;
        int var5;
        if (arg1 && arg0.field2714.field1523) {
            int var4 = var3 + var3 - arg0.field2714.field1519;
            var5 = (int) ((long) this.field2690[arg0.field2727] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2724.method2142(true);
            }
        } else {
            var5 = (int) ((long) this.field2690[arg0.field2727] * (long) var3 >> 6);
        }
        arg0.field2724.method2141(var5);
    }

    @ObfuscatedName("hk.r(IIII)V")
    public void method3848(int arg0, int arg1, int arg2) {
        class232 var4 = this.field2700[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2700[arg0][arg1] = null;
        if ((this.field2694[arg0] & 0x2) == 0) {
            var4.field2712 = 0;
            return;
        }
        for (class232 var5 = (class232) this.field2708.field2758.method3731(); var5 != null; var5 = (class232) this.field2708.field2758.method3733()) {
            if (var4.field2727 == var5.field2727 && var5.field2712 < 0 && var4 != var5) {
                var4.field2712 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("hk.y(IIII)V")
    public void method3854(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("hk.h(III)V")
    public void method3853(int arg0, int arg1) {
    }

    @ObfuscatedName("hk.av(III)V")
    public void method3856(int arg0, int arg1) {
        this.field2681[arg0] = arg1;
    }

    @ObfuscatedName("hk.an(IB)V")
    public void method3857(int arg0) {
        for (class232 var2 = (class232) this.field2708.field2758.method3731(); var2 != null; var2 = (class232) this.field2708.field2758.method3733()) {
            if (arg0 < 0 || var2.field2727 == arg0) {
                if (var2.field2724 != null) {
                    var2.field2724.method2146(Statics.field1558 / 100);
                    if (var2.field2724.method2150()) {
                        this.field2708.field2757.method1929(var2.field2724);
                    }
                    var2.method3951();
                }
                if (var2.field2712 < 0) {
                    this.field2700[var2.field2727][var2.field2717] = null;
                }
                var2.method3721();
            }
        }
    }

    @ObfuscatedName("hk.ai(II)V")
    public void method3858(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3858(var2);
            }
            return;
        }
        this.field2684[arg0] = 12800;
        this.field2685[arg0] = 8192;
        this.field2686[arg0] = 16383;
        this.field2681[arg0] = 8192;
        this.field2706[arg0] = 0;
        this.field2692[arg0] = 8192;
        this.method3861(arg0);
        this.method3862(arg0);
        this.field2694[arg0] = 0;
        this.field2695[arg0] = 32767;
        this.field2710[arg0] = 256;
        this.field2690[arg0] = 0;
        this.method3864(arg0, 8192);
    }

    @ObfuscatedName("hk.ag(II)V")
    public void method3937(int arg0) {
        for (class232 var2 = (class232) this.field2708.field2758.method3731(); var2 != null; var2 = (class232) this.field2708.field2758.method3733()) {
            if ((arg0 < 0 || var2.field2727 == arg0) && var2.field2712 < 0) {
                this.field2700[var2.field2727][var2.field2717] = null;
                var2.field2712 = 0;
            }
        }
    }

    @ObfuscatedName("hk.as(B)V")
    public void method3860() {
        this.method3857(-1);
        this.method3858(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2688[var1] = this.field2707[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2689[var2] = this.field2707[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("hk.aq(II)V")
    public void method3861(int arg0) {
        if ((this.field2694[arg0] & 0x2) == 0) {
            return;
        }
        for (class232 var2 = (class232) this.field2708.field2758.method3731(); var2 != null; var2 = (class232) this.field2708.field2758.method3733()) {
            if (var2.field2727 == arg0 && this.field2700[arg0][var2.field2717] == null && var2.field2712 < 0) {
                var2.field2712 = 0;
            }
        }
    }

    @ObfuscatedName("hk.aa(II)V")
    public void method3862(int arg0) {
        if ((this.field2694[arg0] & 0x4) == 0) {
            return;
        }
        for (class232 var2 = (class232) this.field2708.field2758.method3731(); var2 != null; var2 = (class232) this.field2708.field2758.method3733()) {
            if (var2.field2727 == arg0) {
                var2.field2732 = 0;
            }
        }
    }

    @ObfuscatedName("hk.af(II)V")
    public void method3863(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3848(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3928(var6, var7, var8);
            } else {
                this.method3848(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3854(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2689[var12] = (var14 << 14) + (this.field2689[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2689[var12] = (var14 << 7) + (this.field2689[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2706[var12] = (var14 << 7) + (this.field2706[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2706[var12] = (this.field2706[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2692[var12] = (var14 << 7) + (this.field2692[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2692[var12] = (this.field2692[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2684[var12] = (var14 << 7) + (this.field2684[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2684[var12] = (this.field2684[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2685[var12] = (var14 << 7) + (this.field2685[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2685[var12] = (this.field2685[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2686[var12] = (var14 << 7) + (this.field2686[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2686[var12] = (this.field2686[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2694[var12] |= 0x1;
                } else {
                    this.field2694[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2694[var12] |= 0x2;
                } else {
                    this.method3861(var12);
                    this.field2694[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2695[var12] = (var14 << 7) + (this.field2695[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2695[var12] = (this.field2695[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2695[var12] = (var14 << 7) + (this.field2695[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2695[var12] = (this.field2695[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3857(var12);
            }
            if (var13 == 121) {
                this.method3858(var12);
            }
            if (var13 == 123) {
                this.method3937(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2695[var12];
                if (var15 == 16384) {
                    this.field2710[var12] = (var14 << 7) + (this.field2710[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2695[var12];
                if (var16 == 16384) {
                    this.field2710[var12] = (this.field2710[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2690[var12] = (var14 << 7) + (this.field2690[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2690[var12] = (this.field2690[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2694[var12] |= 0x4;
                } else {
                    this.method3862(var12);
                    this.field2694[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3864(var12, (var14 << 7) + (this.field2698[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3864(var12, (this.field2698[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3851(var17, this.field2689[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3853(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method3856(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3860();
            }
        }
    }

    @ObfuscatedName("hk.ak(III)V")
    public void method3864(int arg0, int arg1) {
        this.field2698[arg0] = arg1;
        this.field2699[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("hk.ab(Lhb;B)I")
    public int method3911(class232 arg0) {
        int var2 = (arg0.field2722 * arg0.field2721 >> 12) + arg0.field2713;
        int var3 = ((this.field2681[arg0.field2727] - 8192) * this.field2710[arg0.field2727] >> 12) + var2;
        class229 var4 = arg0.field2715;
        if (var4.field2666 > 0 && (var4.field2661 > 0 || this.field2706[arg0.field2727] > 0)) {
            int var5 = var4.field2661 << 2;
            int var6 = var4.field2664 << 1;
            if (arg0.field2725 < var6) {
                var5 = arg0.field2725 * var5 / var6;
            }
            int var7 = (this.field2706[arg0.field2727] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2729 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2714.field1520 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1558 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("hk.ac(Lhb;B)I")
    public int method3842(class232 arg0) {
        class229 var2 = arg0.field2715;
        int var3 = this.field2686[arg0.field2727] * this.field2684[arg0.field2727] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2718 * var4 + 16384 >> 15;
        int var6 = this.field2682 * var5 + 128 >> 8;
        if (var2.field2663 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2723 * 1.953125E-5D * (double) var2.field2663) + 0.5D);
        }
        if (var2.field2672 != null) {
            int var7 = arg0.field2720;
            int var8 = var2.field2672[arg0.field2731 + 1];
            if (arg0.field2731 < var2.field2672.length - 2) {
                int var9 = (var2.field2672[arg0.field2731] & 0xFF) << 8;
                int var10 = (var2.field2672[arg0.field2731 + 2] & 0xFF) << 8;
                var8 += (var2.field2672[arg0.field2731 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2712 > 0 && var2.field2662 != null) {
            int var11 = arg0.field2712;
            int var12 = var2.field2662[arg0.field2730 + 1];
            if (arg0.field2730 < var2.field2662.length - 2) {
                int var13 = (var2.field2662[arg0.field2730] & 0xFF) << 8;
                int var14 = (var2.field2662[arg0.field2730 + 2] & 0xFF) << 8;
                var12 += (var2.field2662[arg0.field2730 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("hk.ad(Lhb;I)I")
    public int method3867(class232 arg0) {
        int var2 = this.field2685[arg0.field2727];
        return var2 < 8192 ? arg0.field2719 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2719) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("hk.b()Ldo;")
    public synchronized class118 method1934() {
        return this.field2708;
    }

    @ObfuscatedName("hk.e()Ldo;")
    public synchronized class118 method1935() {
        return null;
    }

    @ObfuscatedName("hk.x()I")
    public synchronized int method1961() {
        return 0;
    }

    @ObfuscatedName("hk.p([III)V")
    public synchronized void method1937(int[] arg0, int arg1, int arg2) {
        if (this.field2702.method3955()) {
            int var4 = this.field2691 * this.field2702.field2735 / Statics.field1558;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2701;
                if (this.field2687 - var5 >= 0L) {
                    this.field2701 = var5;
                    break;
                }
                int var7 = (int) ((this.field2687 - this.field2701 + (long) var4 - 1L) / (long) var4);
                this.field2701 += (long) var4 * (long) var7;
                this.field2708.method1937(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3869();
            } while (this.field2702.method3955());
        }
        this.field2708.method1937(arg0, arg1, arg2);
    }

    @ObfuscatedName("hk.c(I)V")
    public synchronized void method1928(int arg0) {
        if (this.field2702.method3955()) {
            int var2 = this.field2691 * this.field2702.field2735 / Statics.field1558;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2701;
                if (this.field2687 - var3 >= 0L) {
                    this.field2701 = var3;
                    break;
                }
                int var5 = (int) ((this.field2687 - this.field2701 + (long) var2 - 1L) / (long) var2);
                this.field2701 += (long) var2 * (long) var5;
                this.field2708.method1928(var5);
                arg0 -= var5;
                this.method3869();
            } while (this.field2702.method3955());
        }
        this.field2708.method1928(arg0);
    }

    @ObfuscatedName("hk.bg(I)V")
    public void method3869() {
        int var1 = this.field2704;
        int var2 = this.field2705;
        long var3 = this.field2687;
        while (this.field2705 == var2) {
            while (this.field2702.field2737[var1] == var2) {
                this.field2702.method3957(var1);
                int var5 = this.field2702.method4000(var1);
                if (var5 == 1) {
                    this.field2702.method3959();
                    this.field2702.method3956(var1);
                    if (this.field2702.method3966()) {
                        if (!this.field2703 || var2 == 0) {
                            this.method3860();
                            this.field2702.method3965();
                            return;
                        }
                        this.field2702.method3967(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3863(var5);
                }
                this.field2702.method3960(var1);
                this.field2702.method3956(var1);
            }
            var1 = this.field2702.method3963();
            var2 = this.field2702.field2737[var1];
            var3 = this.field2702.method3974(var2);
        }
        this.field2704 = var1;
        this.field2705 = var2;
        this.field2687 = var3;
    }

    @ObfuscatedName("hk.br(Lhb;B)Z")
    public boolean method3870(class232 arg0) {
        if (arg0.field2724 != null) {
            return false;
        }
        if (arg0.field2712 >= 0) {
            arg0.method3721();
            if (arg0.field2716 > 0 && this.field2697[arg0.field2727][arg0.field2716] == arg0) {
                this.field2697[arg0.field2727][arg0.field2716] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("hk.ba(Lhb;[IIII)Z")
    public boolean method3871(class232 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2726 = Statics.field1558 / 100;
        if (arg0.field2712 >= 0 && arg0.field2724 == null || arg0.field2724.method2194()) {
            arg0.method3951();
            arg0.method3721();
            if (arg0.field2716 > 0 && this.field2697[arg0.field2727][arg0.field2716] == arg0) {
                this.field2697[arg0.field2727][arg0.field2716] = null;
            }
            return true;
        }
        int var5 = arg0.field2722;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2692[arg0.field2727] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2722 = var6;
        }
        arg0.field2724.method2229(this.method3911(arg0));
        class229 var7 = arg0.field2715;
        boolean var8 = false;
        arg0.field2725++;
        arg0.field2729 += var7.field2666;
        double var9 = (double) ((arg0.field2717 - 60 << 8) + (arg0.field2722 * arg0.field2721 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2663 > 0) {
            if (var7.field2667 > 0) {
                arg0.field2723 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2667 * var9) + 0.5D);
            } else {
                arg0.field2723 += 128;
            }
        }
        if (var7.field2672 != null) {
            if (var7.field2668 > 0) {
                arg0.field2720 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2668 * var9) + 0.5D);
            } else {
                arg0.field2720 += 128;
            }
            while (arg0.field2731 < var7.field2672.length - 2 && arg0.field2720 > (var7.field2672[arg0.field2731 + 2] & 0xFF) << 8) {
                arg0.field2731 += 2;
            }
            if (arg0.field2731 == var7.field2672.length - 2 && var7.field2672[arg0.field2731 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2712 >= 0 && var7.field2662 != null && (this.field2694[arg0.field2727] & 0x1) == 0 && (arg0.field2716 < 0 || this.field2697[arg0.field2727][arg0.field2716] != arg0)) {
            if (var7.field2665 > 0) {
                arg0.field2712 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2665 * var9) + 0.5D);
            } else {
                arg0.field2712 += 128;
            }
            while (arg0.field2730 < var7.field2662.length - 2 && arg0.field2712 > (var7.field2662[arg0.field2730 + 2] & 0xFF) << 8) {
                arg0.field2730 += 2;
            }
            if (arg0.field2730 == var7.field2662.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2724.method2145(arg0.field2726, this.method3842(arg0), this.method3867(arg0));
            return false;
        }
        arg0.field2724.method2146(arg0.field2726);
        if (arg1 == null) {
            arg0.field2724.method1928(arg3);
        } else {
            arg0.field2724.method1937(arg1, arg2, arg3);
        }
        if (arg0.field2724.method2150()) {
            this.field2708.field2757.method1929(arg0.field2724);
        }
        arg0.method3951();
        if (arg0.field2712 >= 0) {
            arg0.method3721();
            if (arg0.field2716 > 0 && this.field2697[arg0.field2727][arg0.field2716] == arg0) {
                this.field2697[arg0.field2727][arg0.field2716] = null;
            }
        }
        return true;
    }
}
