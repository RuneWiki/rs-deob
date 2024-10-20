package deob;

@ObfuscatedName("ht")
public class class231 extends class118 {

    @ObfuscatedName("ht.c")
    public class215 field2687 = new class215(128);

    @ObfuscatedName("ht.i")
    public int field2693 = 256;

    @ObfuscatedName("ht.o")
    public int field2689 = 1000000;

    @ObfuscatedName("ht.j")
    public int[] field2690 = new int[16];

    @ObfuscatedName("ht.k")
    public int[] field2691 = new int[16];

    @ObfuscatedName("ht.x")
    public int[] field2692 = new int[16];

    @ObfuscatedName("ht.z")
    public int[] field2694 = new int[16];

    @ObfuscatedName("ht.p")
    public int[] field2713 = new int[16];

    @ObfuscatedName("ht.r")
    public int[] field2703 = new int[16];

    @ObfuscatedName("ht.d")
    public int[] field2696 = new int[16];

    @ObfuscatedName("ht.a")
    public int[] field2697 = new int[16];

    @ObfuscatedName("ht.e")
    public int[] field2688 = new int[16];

    @ObfuscatedName("ht.v")
    public int[] field2699 = new int[16];

    @ObfuscatedName("ht.n")
    public int[] field2705 = new int[16];

    @ObfuscatedName("ht.u")
    public int[] field2701 = new int[16];

    @ObfuscatedName("ht.q")
    public int[] field2702 = new int[16];

    @ObfuscatedName("ht.g")
    public int[] field2700 = new int[16];

    @ObfuscatedName("ht.y")
    public int[] field2704 = new int[16];

    @ObfuscatedName("ht.s")
    public class232[][] field2695 = new class232[16][128];

    @ObfuscatedName("ht.ac")
    public class232[][] field2706 = new class232[16][128];

    @ObfuscatedName("ht.ap")
    public class233 field2707 = new class233();

    @ObfuscatedName("ht.al")
    public boolean field2708;

    @ObfuscatedName("ht.ai")
    public int field2709;

    @ObfuscatedName("ht.ab")
    public int field2710;

    @ObfuscatedName("ht.ak")
    public long field2711;

    @ObfuscatedName("ht.as")
    public long field2712;

    @ObfuscatedName("ht.aa")
    public class235 field2698 = new class235(this);

    public class231() {
        this.method3863();
    }

    @ObfuscatedName("ht.c(II)V")
    public synchronized void method3830(int arg0) {
        this.field2693 = arg0;
    }

    @ObfuscatedName("ht.i(S)I")
    public int method3831() {
        return this.field2693;
    }

    @ObfuscatedName("ht.o(Liu;Ljm;Ldl;II)Z")
    public synchronized boolean method3832(class236 arg0, class262 arg1, class111 arg2, int arg3) {
        arg0.method4024();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class226 var7 = (class226) arg0.field2763.method3658(); var7 != null; var7 = (class226) arg0.field2763.method3661()) {
            int var8 = (int) var7.field2645;
            class234 var9 = (class234) this.field2687.method3677((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method4251(var8);
                class234 var11;
                if (var10 == null) {
                    var11 = null;
                } else {
                    var11 = new class234(var10);
                }
                var9 = var11;
                if (var11 == null) {
                    var5 = false;
                    continue;
                }
                this.field2687.method3668(var11, (long) var8);
            }
            if (!var9.method3997(arg2, var7.field2662, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method4015();
        }
        return var5;
    }

    @ObfuscatedName("ht.j(B)V")
    public synchronized void method3855() {
        for (class234 var1 = (class234) this.field2687.method3658(); var1 != null; var1 = (class234) this.field2687.method3661()) {
            var1.method3998();
        }
    }

    @ObfuscatedName("ht.k(I)V")
    public synchronized void method3834() {
        for (class234 var1 = (class234) this.field2687.method3658(); var1 != null; var1 = (class234) this.field2687.method3661()) {
            var1.method3710();
        }
    }

    @ObfuscatedName("ht.r(Liu;ZI)V")
    public synchronized void method3856(class236 arg0, boolean arg1) {
        this.method3836();
        this.field2707.method3934(arg0.field2762);
        this.field2708 = arg1;
        this.field2711 = 0L;
        int var3 = this.field2707.method3948();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2707.method3938(var4);
            this.field2707.method3941(var4);
            this.field2707.method3939(var4);
        }
        this.field2709 = this.field2707.method3937();
        this.field2710 = this.field2707.field2740[this.field2709];
        this.field2712 = this.field2707.method3945(this.field2710);
    }

    @ObfuscatedName("ht.a(I)V")
    public synchronized void method3836() {
        this.field2707.method3935();
        this.method3863();
    }

    @ObfuscatedName("ht.b(I)Z")
    public synchronized boolean method3852() {
        return this.field2707.method3936();
    }

    @ObfuscatedName("ht.h(III)V")
    public synchronized void method3837(int arg0, int arg1) {
        this.method3907(arg0, arg1);
    }

    @ObfuscatedName("ht.n(III)V")
    public void method3907(int arg0, int arg1) {
        this.field2694[arg0] = arg1;
        this.field2703[arg0] = arg1 & 0xFFFFFF80;
        this.method3899(arg0, arg1);
    }

    @ObfuscatedName("ht.u(IIB)V")
    public void method3899(int arg0, int arg1) {
        if (this.field2713[arg0] != arg1) {
            this.field2713[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2706[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("ht.q(IIIB)V")
    public void method3869(int arg0, int arg1, int arg2) {
        this.method3841(arg0, arg1, 64);
        if ((this.field2699[arg0] & 0x2) != 0) {
            for (class232 var4 = (class232) this.field2698.field2758.method3728(); var4 != null; var4 = (class232) this.field2698.field2758.method3742()) {
                if (var4.field2726 == arg0 && var4.field2729 < 0) {
                    this.field2695[arg0][var4.field2720] = null;
                    this.field2695[arg0][arg1] = var4;
                    int var5 = (var4.field2725 * var4.field2724 >> 12) + var4.field2723;
                    var4.field2723 += arg1 - var4.field2720 << 8;
                    var4.field2724 = var5 - var4.field2723;
                    var4.field2725 = 4096;
                    var4.field2720 = arg1;
                    return;
                }
            }
        }
        class234 var6 = (class234) this.field2687.method3677((long) this.field2713[arg0]);
        if (var6 == null) {
            return;
        }
        class106 var7 = var6.field2752[arg1];
        if (var7 == null) {
            return;
        }
        class232 var8 = new class232();
        var8.field2726 = arg0;
        var8.field2716 = var6;
        var8.field2717 = var7;
        var8.field2718 = var6.field2755[arg1];
        var8.field2719 = var6.field2756[arg1];
        var8.field2720 = arg1;
        var8.field2721 = var6.field2757 * arg2 * arg2 * var6.field2751[arg1] + 1024 >> 11;
        var8.field2722 = var6.field2754[arg1] & 0xFF;
        var8.field2723 = (arg1 << 8) - (var6.field2753[arg1] & 0x7FFF);
        var8.field2732 = 0;
        var8.field2727 = 0;
        var8.field2728 = 0;
        var8.field2729 = -1;
        var8.field2730 = 0;
        if (this.field2702[arg0] == 0) {
            var8.field2733 = class116.method2254(var7, this.method3851(var8), this.method3866(var8), this.method3853(var8));
        } else {
            var8.field2733 = class116.method2254(var7, this.method3851(var8), 0, this.method3853(var8));
            this.method3890(var8, var6.field2753[arg1] < 0);
        }
        if (var6.field2753[arg1] < 0) {
            var8.field2733.method2127(-1);
        }
        if (var8.field2719 >= 0) {
            class232 var9 = this.field2706[arg0][var8.field2719];
            if (var9 != null && var9.field2729 < 0) {
                this.field2695[arg0][var9.field2720] = null;
                var9.field2729 = 0;
            }
            this.field2706[arg0][var8.field2719] = var8;
        }
        this.field2698.field2758.method3716(var8);
        this.field2695[arg0][arg1] = var8;
    }

    @ObfuscatedName("ht.g(Lhu;ZI)V")
    public void method3890(class232 arg0, boolean arg1) {
        int var3 = arg0.field2717.field1536.length;
        int var5;
        if (arg1 && arg0.field2717.field1540) {
            int var4 = var3 + var3 - arg0.field2717.field1538;
            var5 = (int) ((long) this.field2702[arg0.field2726] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2733.method2134(true);
            }
        } else {
            var5 = (int) ((long) this.field2702[arg0.field2726] * (long) var3 >> 6);
        }
        arg0.field2733.method2145(var5);
    }

    @ObfuscatedName("ht.y(IIIB)V")
    public void method3841(int arg0, int arg1, int arg2) {
        class232 var4 = this.field2695[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2695[arg0][arg1] = null;
        if ((this.field2699[arg0] & 0x2) == 0) {
            var4.field2729 = 0;
            return;
        }
        for (class232 var5 = (class232) this.field2698.field2758.method3723(); var5 != null; var5 = (class232) this.field2698.field2758.method3722()) {
            if (var4.field2726 == var5.field2726 && var5.field2729 < 0 && var4 != var5) {
                var4.field2729 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("ht.s(IIII)V")
    public void method3839(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("ht.ac(III)V")
    public void method3842(int arg0, int arg1) {
    }

    @ObfuscatedName("ht.ah(III)V")
    public void method3843(int arg0, int arg1) {
        this.field2696[arg0] = arg1;
    }

    @ObfuscatedName("ht.af(IB)V")
    public void method3844(int arg0) {
        for (class232 var2 = (class232) this.field2698.field2758.method3723(); var2 != null; var2 = (class232) this.field2698.field2758.method3722()) {
            if (arg0 < 0 || var2.field2726 == arg0) {
                if (var2.field2733 != null) {
                    var2.field2733.method2138(Statics.field3928 / 100);
                    if (var2.field2733.method2142()) {
                        this.field2698.field2761.method1933(var2.field2733);
                    }
                    var2.method3929();
                }
                if (var2.field2729 < 0) {
                    this.field2695[var2.field2726][var2.field2720] = null;
                }
                var2.method3710();
            }
        }
    }

    @ObfuscatedName("ht.aw(IB)V")
    public void method3915(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3915(var2);
            }
            return;
        }
        this.field2690[arg0] = 12800;
        this.field2691[arg0] = 8192;
        this.field2692[arg0] = 16383;
        this.field2696[arg0] = 8192;
        this.field2697[arg0] = 0;
        this.field2688[arg0] = 8192;
        this.method3847(arg0);
        this.method3848(arg0);
        this.field2699[arg0] = 0;
        this.field2705[arg0] = 32767;
        this.field2701[arg0] = 256;
        this.field2702[arg0] = 0;
        this.method3850(arg0, 8192);
    }

    @ObfuscatedName("ht.ax(II)V")
    public void method3846(int arg0) {
        for (class232 var2 = (class232) this.field2698.field2758.method3723(); var2 != null; var2 = (class232) this.field2698.field2758.method3722()) {
            if ((arg0 < 0 || var2.field2726 == arg0) && var2.field2729 < 0) {
                this.field2695[var2.field2726][var2.field2720] = null;
                var2.field2729 = 0;
            }
        }
    }

    @ObfuscatedName("ht.ag(I)V")
    public void method3863() {
        this.method3844(-1);
        this.method3915(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2713[var1] = this.field2694[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2703[var2] = this.field2694[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("ht.ad(IB)V")
    public void method3847(int arg0) {
        if ((this.field2699[arg0] & 0x2) == 0) {
            return;
        }
        for (class232 var2 = (class232) this.field2698.field2758.method3723(); var2 != null; var2 = (class232) this.field2698.field2758.method3722()) {
            if (var2.field2726 == arg0 && this.field2695[arg0][var2.field2720] == null && var2.field2729 < 0) {
                var2.field2729 = 0;
            }
        }
    }

    @ObfuscatedName("ht.at(II)V")
    public void method3848(int arg0) {
        if ((this.field2699[arg0] & 0x4) == 0) {
            return;
        }
        for (class232 var2 = (class232) this.field2698.field2758.method3723(); var2 != null; var2 = (class232) this.field2698.field2758.method3722()) {
            if (var2.field2726 == arg0) {
                var2.field2735 = 0;
            }
        }
    }

    @ObfuscatedName("ht.av(II)V")
    public void method3900(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3841(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3869(var6, var7, var8);
            } else {
                this.method3841(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3839(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2703[var12] = (var14 << 14) + (this.field2703[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2703[var12] = (var14 << 7) + (this.field2703[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2697[var12] = (var14 << 7) + (this.field2697[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2697[var12] = (this.field2697[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2688[var12] = (var14 << 7) + (this.field2688[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2688[var12] = (this.field2688[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2690[var12] = (var14 << 7) + (this.field2690[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2690[var12] = (this.field2690[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2691[var12] = (var14 << 7) + (this.field2691[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2691[var12] = (this.field2691[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2692[var12] = (var14 << 7) + (this.field2692[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2692[var12] = (this.field2692[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2699[var12] |= 0x1;
                } else {
                    this.field2699[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2699[var12] |= 0x2;
                } else {
                    this.method3847(var12);
                    this.field2699[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2705[var12] = (var14 << 7) + (this.field2705[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2705[var12] = (this.field2705[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2705[var12] = (var14 << 7) + (this.field2705[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2705[var12] = (this.field2705[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3844(var12);
            }
            if (var13 == 121) {
                this.method3915(var12);
            }
            if (var13 == 123) {
                this.method3846(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2705[var12];
                if (var15 == 16384) {
                    this.field2701[var12] = (var14 << 7) + (this.field2701[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2705[var12];
                if (var16 == 16384) {
                    this.field2701[var12] = (this.field2701[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2702[var12] = (var14 << 7) + (this.field2702[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2702[var12] = (this.field2702[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2699[var12] |= 0x4;
                } else {
                    this.method3848(var12);
                    this.field2699[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3850(var12, (var14 << 7) + (this.field2700[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3850(var12, (this.field2700[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3899(var17, this.field2703[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3842(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method3843(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3863();
            }
        }
    }

    @ObfuscatedName("ht.az(III)V")
    public void method3850(int arg0, int arg1) {
        this.field2700[arg0] = arg1;
        this.field2704[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("ht.aj(Lhu;S)I")
    public int method3851(class232 arg0) {
        int var2 = (arg0.field2725 * arg0.field2724 >> 12) + arg0.field2723;
        int var3 = ((this.field2696[arg0.field2726] - 8192) * this.field2701[arg0.field2726] >> 12) + var2;
        class229 var4 = arg0.field2718;
        if (var4.field2668 > 0 && (var4.field2674 > 0 || this.field2697[arg0.field2726] > 0)) {
            int var5 = var4.field2674 << 2;
            int var6 = var4.field2672 << 1;
            if (arg0.field2734 < var6) {
                var5 = arg0.field2734 * var5 / var6;
            }
            int var7 = (this.field2697[arg0.field2726] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2731 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2717.field1537 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field3928 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("ht.ar(Lhu;I)I")
    public int method3866(class232 arg0) {
        class229 var2 = arg0.field2718;
        int var3 = this.field2692[arg0.field2726] * this.field2690[arg0.field2726] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2721 * var4 + 16384 >> 15;
        int var6 = this.field2693 * var5 + 128 >> 8;
        if (var2.field2670 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2732 * 1.953125E-5D * (double) var2.field2670) + 0.5D);
        }
        if (var2.field2675 != null) {
            int var7 = arg0.field2727;
            int var8 = var2.field2675[arg0.field2728 + 1];
            if (arg0.field2728 < var2.field2675.length - 2) {
                int var9 = (var2.field2675[arg0.field2728] & 0xFF) << 8;
                int var10 = (var2.field2675[arg0.field2728 + 2] & 0xFF) << 8;
                var8 += (var2.field2675[arg0.field2728 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2729 > 0 && var2.field2669 != null) {
            int var11 = arg0.field2729;
            int var12 = var2.field2669[arg0.field2730 + 1];
            if (arg0.field2730 < var2.field2669.length - 2) {
                int var13 = (var2.field2669[arg0.field2730] & 0xFF) << 8;
                int var14 = (var2.field2669[arg0.field2730 + 2] & 0xFF) << 8;
                var12 += (var2.field2669[arg0.field2730 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("ht.au(Lhu;I)I")
    public int method3853(class232 arg0) {
        int var2 = this.field2691[arg0.field2726];
        return var2 < 8192 ? arg0.field2722 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2722) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("ht.x()Ldd;")
    public synchronized class118 method1915() {
        return this.field2698;
    }

    @ObfuscatedName("ht.z()Ldd;")
    public synchronized class118 method1913() {
        return null;
    }

    @ObfuscatedName("ht.p()I")
    public synchronized int method1914() {
        return 0;
    }

    @ObfuscatedName("ht.w([III)V")
    public synchronized void method1920(int[] arg0, int arg1, int arg2) {
        if (this.field2707.method3936()) {
            int var4 = this.field2689 * this.field2707.field2737 / Statics.field3928;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2711;
                if (this.field2712 - var5 >= 0L) {
                    this.field2711 = var5;
                    break;
                }
                int var7 = (int) ((this.field2712 - this.field2711 + (long) var4 - 1L) / (long) var4);
                this.field2711 += (long) var4 * (long) var7;
                this.field2698.method1920(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3857();
            } while (this.field2707.method3936());
        }
        this.field2698.method1920(arg0, arg1, arg2);
    }

    @ObfuscatedName("ht.d(I)V")
    public synchronized void method1940(int arg0) {
        if (this.field2707.method3936()) {
            int var2 = this.field2689 * this.field2707.field2737 / Statics.field3928;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2711;
                if (this.field2712 - var3 >= 0L) {
                    this.field2711 = var3;
                    break;
                }
                int var5 = (int) ((this.field2712 - this.field2711 + (long) var2 - 1L) / (long) var2);
                this.field2711 += (long) var2 * (long) var5;
                this.field2698.method1940(var5);
                arg0 -= var5;
                this.method3857();
            } while (this.field2707.method3936());
        }
        this.field2698.method1940(arg0);
    }

    @ObfuscatedName("ht.an(I)V")
    public void method3857() {
        int var1 = this.field2709;
        int var2 = this.field2710;
        long var3 = this.field2712;
        while (this.field2710 == var2) {
            while (this.field2707.field2740[var1] == var2) {
                this.field2707.method3938(var1);
                int var5 = this.field2707.method3963(var1);
                if (var5 == 1) {
                    this.field2707.method3940();
                    this.field2707.method3939(var1);
                    if (this.field2707.method3947()) {
                        if (!this.field2708 || var2 == 0) {
                            this.method3863();
                            this.field2707.method3935();
                            return;
                        }
                        this.field2707.method3950(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3900(var5);
                }
                this.field2707.method3941(var1);
                this.field2707.method3939(var1);
            }
            var1 = this.field2707.method3937();
            var2 = this.field2707.field2740[var1];
            var3 = this.field2707.method3945(var2);
        }
        this.field2709 = var1;
        this.field2710 = var2;
        this.field2712 = var3;
    }

    @ObfuscatedName("ht.bv(Lhu;I)Z")
    public boolean method3858(class232 arg0) {
        if (arg0.field2733 != null) {
            return false;
        }
        if (arg0.field2729 >= 0) {
            arg0.method3710();
            if (arg0.field2719 > 0 && this.field2706[arg0.field2726][arg0.field2719] == arg0) {
                this.field2706[arg0.field2726][arg0.field2719] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("ht.bw(Lhu;[IIII)Z")
    public boolean method3871(class232 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2715 = Statics.field3928 / 100;
        if (arg0.field2729 >= 0 && arg0.field2733 == null || arg0.field2733.method2141()) {
            arg0.method3929();
            arg0.method3710();
            if (arg0.field2719 > 0 && this.field2706[arg0.field2726][arg0.field2719] == arg0) {
                this.field2706[arg0.field2726][arg0.field2719] = null;
            }
            return true;
        }
        int var5 = arg0.field2725;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2688[arg0.field2726] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2725 = var6;
        }
        arg0.field2733.method2139(this.method3851(arg0));
        class229 var7 = arg0.field2718;
        boolean var8 = false;
        arg0.field2734++;
        arg0.field2731 += var7.field2668;
        double var9 = (double) ((arg0.field2720 - 60 << 8) + (arg0.field2725 * arg0.field2724 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2670 > 0) {
            if (var7.field2673 > 0) {
                arg0.field2732 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2673 * var9) + 0.5D);
            } else {
                arg0.field2732 += 128;
            }
        }
        if (var7.field2675 != null) {
            if (var7.field2671 > 0) {
                arg0.field2727 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2671 * var9) + 0.5D);
            } else {
                arg0.field2727 += 128;
            }
            while (arg0.field2728 < var7.field2675.length - 2 && arg0.field2727 > (var7.field2675[arg0.field2728 + 2] & 0xFF) << 8) {
                arg0.field2728 += 2;
            }
            if (arg0.field2728 == var7.field2675.length - 2 && var7.field2675[arg0.field2728 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2729 >= 0 && var7.field2669 != null && (this.field2699[arg0.field2726] & 0x1) == 0 && (arg0.field2719 < 0 || this.field2706[arg0.field2726][arg0.field2719] != arg0)) {
            if (var7.field2676 > 0) {
                arg0.field2729 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2676 * var9) + 0.5D);
            } else {
                arg0.field2729 += 128;
            }
            while (arg0.field2730 < var7.field2669.length - 2 && arg0.field2729 > (var7.field2669[arg0.field2730 + 2] & 0xFF) << 8) {
                arg0.field2730 += 2;
            }
            if (arg0.field2730 == var7.field2669.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2733.method2137(arg0.field2715, this.method3866(arg0), this.method3853(arg0));
            return false;
        }
        arg0.field2733.method2138(arg0.field2715);
        if (arg1 == null) {
            arg0.field2733.method1940(arg3);
        } else {
            arg0.field2733.method1920(arg1, arg2, arg3);
        }
        if (arg0.field2733.method2142()) {
            this.field2698.field2761.method1933(arg0.field2733);
        }
        arg0.method3929();
        if (arg0.field2729 >= 0) {
            arg0.method3710();
            if (arg0.field2719 > 0 && this.field2706[arg0.field2726][arg0.field2719] == arg0) {
                this.field2706[arg0.field2726][arg0.field2719] = null;
            }
        }
        return true;
    }
}
