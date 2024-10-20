package deob;

@ObfuscatedName("hl")
public class class231 extends class118 {

    @ObfuscatedName("hl.d")
    public class215 field2708 = new class215(128);

    @ObfuscatedName("hl.z")
    public int field2713 = 256;

    @ObfuscatedName("hl.n")
    public int field2698 = 1000000;

    @ObfuscatedName("hl.r")
    public int[] field2699 = new int[16];

    @ObfuscatedName("hl.e")
    public int[] field2724 = new int[16];

    @ObfuscatedName("hl.y")
    public int[] field2701 = new int[16];

    @ObfuscatedName("hl.k")
    public int[] field2702 = new int[16];

    @ObfuscatedName("hl.s")
    public int[] field2697 = new int[16];

    @ObfuscatedName("hl.p")
    public int[] field2704 = new int[16];

    @ObfuscatedName("hl.x")
    public int[] field2700 = new int[16];

    @ObfuscatedName("hl.m")
    public int[] field2714 = new int[16];

    @ObfuscatedName("hl.h")
    public int[] field2707 = new int[16];

    @ObfuscatedName("hl.c")
    public int[] field2710 = new int[16];

    @ObfuscatedName("hl.j")
    public int[] field2711 = new int[16];

    @ObfuscatedName("hl.l")
    public int[] field2712 = new int[16];

    @ObfuscatedName("hl.g")
    public int[] field2705 = new int[16];

    @ObfuscatedName("hl.w")
    public int[] field2706 = new int[16];

    @ObfuscatedName("hl.o")
    public int[] field2715 = new int[16];

    @ObfuscatedName("hl.a")
    public class232[][] field2696 = new class232[16][128];

    @ObfuscatedName("hl.ak")
    public class232[][] field2717 = new class232[16][128];

    @ObfuscatedName("hl.ap")
    public class233 field2718 = new class233();

    @ObfuscatedName("hl.ac")
    public boolean field2719;

    @ObfuscatedName("hl.aw")
    public int field2720;

    @ObfuscatedName("hl.as")
    public int field2721;

    @ObfuscatedName("hl.au")
    public long field2722;

    @ObfuscatedName("hl.al")
    public long field2723;

    @ObfuscatedName("hl.af")
    public class235 field2703 = new class235(this);

    public class231() {
        this.method3984();
    }

    @ObfuscatedName("hl.d(IB)V")
    public synchronized void method3942(int arg0) {
        this.field2713 = arg0;
    }

    @ObfuscatedName("hl.z(I)I")
    public int method3935() {
        return this.field2713;
    }

    @ObfuscatedName("hl.n(Lip;Ljk;Ldc;II)Z")
    public synchronized boolean method3953(class236 arg0, class262 arg1, class111 arg2, int arg3) {
        arg0.method4081();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class226 var7 = (class226) arg0.field2774.method3739(); var7 != null; var7 = (class226) arg0.field2774.method3740()) {
            int var8 = (int) var7.field2655;
            class234 var9 = (class234) this.field2708.method3736((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method4280(var8);
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
                this.field2708.method3745(var11, (long) var8);
            }
            if (!var9.method4060(arg2, var7.field2672, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method4078();
        }
        return var5;
    }

    @ObfuscatedName("hl.r(I)V")
    public synchronized void method3909() {
        for (class234 var1 = (class234) this.field2708.method3739(); var1 != null; var1 = (class234) this.field2708.method3740()) {
            var1.method4061();
        }
    }

    @ObfuscatedName("hl.e(S)V")
    public synchronized void method3911() {
        for (class234 var1 = (class234) this.field2708.method3739(); var1 != null; var1 = (class234) this.field2708.method3740()) {
            var1.method3785();
        }
    }

    @ObfuscatedName("hl.h(Lip;ZB)V")
    public synchronized void method3912(class236 arg0, boolean arg1) {
        this.method3913();
        this.field2718.method4008(arg0.field2775);
        this.field2719 = arg1;
        this.field2722 = 0L;
        int var3 = this.field2718.method4011();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2718.method4012(var4);
            this.field2718.method4033(var4);
            this.field2718.method4013(var4);
        }
        this.field2720 = this.field2718.method4020();
        this.field2721 = this.field2718.field2750[this.field2720];
        this.field2723 = this.field2718.method4019(this.field2721);
    }

    @ObfuscatedName("hl.i(I)V")
    public synchronized void method3913() {
        this.field2718.method4009();
        this.method3984();
    }

    @ObfuscatedName("hl.u(B)Z")
    public synchronized boolean method3920() {
        return this.field2718.method4010();
    }

    @ObfuscatedName("hl.q(IIB)V")
    public synchronized void method3915(int arg0, int arg1) {
        this.method3916(arg0, arg1);
    }

    @ObfuscatedName("hl.v(III)V")
    public void method3916(int arg0, int arg1) {
        this.field2702[arg0] = arg1;
        this.field2704[arg0] = arg1 & 0xFFFFFF80;
        this.method3917(arg0, arg1);
    }

    @ObfuscatedName("hl.f(III)V")
    public void method3917(int arg0, int arg1) {
        if (this.field2697[arg0] != arg1) {
            this.field2697[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2717[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("hl.b(IIII)V")
    public void method3993(int arg0, int arg1, int arg2) {
        this.method3972(arg0, arg1, 64);
        if ((this.field2710[arg0] & 0x2) != 0) {
            for (class232 var4 = (class232) this.field2703.field2772.method3799(); var4 != null; var4 = (class232) this.field2703.field2772.method3801()) {
                if (var4.field2735 == arg0 && var4.field2739 < 0) {
                    this.field2696[arg0][var4.field2730] = null;
                    this.field2696[arg0][arg1] = var4;
                    int var5 = (var4.field2728 * var4.field2727 >> 12) + var4.field2733;
                    var4.field2733 += arg1 - var4.field2730 << 8;
                    var4.field2728 = var5 - var4.field2733;
                    var4.field2727 = 4096;
                    var4.field2730 = arg1;
                    return;
                }
            }
        }
        class234 var6 = (class234) this.field2708.method3736((long) this.field2697[arg0]);
        if (var6 == null) {
            return;
        }
        class106 var7 = var6.field2761[arg1];
        if (var7 == null) {
            return;
        }
        class232 var8 = new class232();
        var8.field2735 = arg0;
        var8.field2734 = var6;
        var8.field2726 = var7;
        var8.field2725 = var6.field2765[arg1];
        var8.field2729 = var6.field2768[arg1];
        var8.field2730 = arg1;
        var8.field2736 = var6.field2766 * arg2 * arg2 * var6.field2763[arg1] + 1024 >> 11;
        var8.field2732 = var6.field2764[arg1] & 0xFF;
        var8.field2733 = (arg1 << 8) - (var6.field2762[arg1] & 0x7FFF);
        var8.field2731 = 0;
        var8.field2737 = 0;
        var8.field2738 = 0;
        var8.field2739 = -1;
        var8.field2740 = 0;
        if (this.field2705[arg0] == 0) {
            var8.field2743 = class116.method2256(var7, this.method3930(var8), this.method3931(var8), this.method3995(var8));
        } else {
            var8.field2743 = class116.method2256(var7, this.method3930(var8), 0, this.method3995(var8));
            this.method3933(var8, var6.field2762[arg1] < 0);
        }
        if (var6.field2762[arg1] < 0) {
            var8.field2743.method2176(-1);
        }
        if (var8.field2729 >= 0) {
            class232 var9 = this.field2717[arg0][var8.field2729];
            if (var9 != null && var9.field2739 < 0) {
                this.field2696[arg0][var9.field2730] = null;
                var9.field2739 = 0;
            }
            this.field2717[arg0][var8.field2729] = var8;
        }
        this.field2703.field2772.method3793(var8);
        this.field2696[arg0][arg1] = var8;
    }

    @ObfuscatedName("hl.c(Lhk;ZI)V")
    public void method3933(class232 arg0, boolean arg1) {
        int var3 = arg0.field2726.field1533.length;
        int var5;
        if (arg1 && arg0.field2726.field1536) {
            int var4 = var3 + var3 - arg0.field2726.field1534;
            var5 = (int) ((long) this.field2705[arg0.field2735] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2743.method2210(true);
            }
        } else {
            var5 = (int) ((long) this.field2705[arg0.field2735] * (long) var3 >> 6);
        }
        arg0.field2743.method2273(var5);
    }

    @ObfuscatedName("hl.w(IIII)V")
    public void method3972(int arg0, int arg1, int arg2) {
        class232 var4 = this.field2696[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2696[arg0][arg1] = null;
        if ((this.field2710[arg0] & 0x2) == 0) {
            var4.field2739 = 0;
            return;
        }
        for (class232 var5 = (class232) this.field2703.field2772.method3798(); var5 != null; var5 = (class232) this.field2703.field2772.method3800()) {
            if (var4.field2735 == var5.field2735 && var5.field2739 < 0 && var4 != var5) {
                var4.field2739 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("hl.o(IIII)V")
    public void method3985(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("hl.a(III)V")
    public void method3922(int arg0, int arg1) {
    }

    @ObfuscatedName("hl.ak(III)V")
    public void method3923(int arg0, int arg1) {
        this.field2700[arg0] = arg1;
    }

    @ObfuscatedName("hl.ap(II)V")
    public void method3924(int arg0) {
        for (class232 var2 = (class232) this.field2703.field2772.method3798(); var2 != null; var2 = (class232) this.field2703.field2772.method3800()) {
            if (arg0 < 0 || var2.field2735 == arg0) {
                if (var2.field2743 != null) {
                    var2.field2743.method2214(Statics.field646 / 100);
                    if (var2.field2743.method2190()) {
                        this.field2703.field2773.method1942(var2.field2743);
                    }
                    var2.method4005();
                }
                if (var2.field2739 < 0) {
                    this.field2696[var2.field2735][var2.field2730] = null;
                }
                var2.method3785();
            }
        }
    }

    @ObfuscatedName("hl.ac(IB)V")
    public void method3925(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3925(var2);
            }
            return;
        }
        this.field2699[arg0] = 12800;
        this.field2724[arg0] = 8192;
        this.field2701[arg0] = 16383;
        this.field2700[arg0] = 8192;
        this.field2714[arg0] = 0;
        this.field2707[arg0] = 8192;
        this.method3928(arg0);
        this.method3929(arg0);
        this.field2710[arg0] = 0;
        this.field2711[arg0] = 32767;
        this.field2712[arg0] = 256;
        this.field2705[arg0] = 0;
        this.method3963(arg0, 8192);
    }

    @ObfuscatedName("hl.ao(IB)V")
    public void method3926(int arg0) {
        for (class232 var2 = (class232) this.field2703.field2772.method3798(); var2 != null; var2 = (class232) this.field2703.field2772.method3800()) {
            if ((arg0 < 0 || var2.field2735 == arg0) && var2.field2739 < 0) {
                this.field2696[var2.field2735][var2.field2730] = null;
                var2.field2739 = 0;
            }
        }
    }

    @ObfuscatedName("hl.at(I)V")
    public void method3984() {
        this.method3924(-1);
        this.method3925(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2697[var1] = this.field2702[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2704[var2] = this.field2702[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("hl.ag(II)V")
    public void method3928(int arg0) {
        if ((this.field2710[arg0] & 0x2) == 0) {
            return;
        }
        for (class232 var2 = (class232) this.field2703.field2772.method3798(); var2 != null; var2 = (class232) this.field2703.field2772.method3800()) {
            if (var2.field2735 == arg0 && this.field2696[arg0][var2.field2730] == null && var2.field2739 < 0) {
                var2.field2739 = 0;
            }
        }
    }

    @ObfuscatedName("hl.am(II)V")
    public void method3929(int arg0) {
        if ((this.field2710[arg0] & 0x4) == 0) {
            return;
        }
        for (class232 var2 = (class232) this.field2703.field2772.method3798(); var2 != null; var2 = (class232) this.field2703.field2772.method3800()) {
            if (var2.field2735 == arg0) {
                var2.field2745 = 0;
            }
        }
    }

    @ObfuscatedName("hl.ay(IB)V")
    public void method3921(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3972(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3993(var6, var7, var8);
            } else {
                this.method3972(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3985(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2704[var12] = (var14 << 14) + (this.field2704[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2704[var12] = (var14 << 7) + (this.field2704[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2714[var12] = (var14 << 7) + (this.field2714[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2714[var12] = (this.field2714[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2707[var12] = (var14 << 7) + (this.field2707[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2707[var12] = (this.field2707[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2699[var12] = (var14 << 7) + (this.field2699[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2699[var12] = (this.field2699[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2724[var12] = (var14 << 7) + (this.field2724[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2724[var12] = (this.field2724[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2701[var12] = (var14 << 7) + (this.field2701[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2701[var12] = (this.field2701[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2710[var12] |= 0x1;
                } else {
                    this.field2710[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2710[var12] |= 0x2;
                } else {
                    this.method3928(var12);
                    this.field2710[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2711[var12] = (var14 << 7) + (this.field2711[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2711[var12] = (this.field2711[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2711[var12] = (var14 << 7) + (this.field2711[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2711[var12] = (this.field2711[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3924(var12);
            }
            if (var13 == 121) {
                this.method3925(var12);
            }
            if (var13 == 123) {
                this.method3926(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2711[var12];
                if (var15 == 16384) {
                    this.field2712[var12] = (var14 << 7) + (this.field2712[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2711[var12];
                if (var16 == 16384) {
                    this.field2712[var12] = (this.field2712[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2705[var12] = (var14 << 7) + (this.field2705[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2705[var12] = (this.field2705[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2710[var12] |= 0x4;
                } else {
                    this.method3929(var12);
                    this.field2710[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3963(var12, (var14 << 7) + (this.field2706[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3963(var12, (this.field2706[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3917(var17, this.field2704[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3922(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method3923(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3984();
            }
        }
    }

    @ObfuscatedName("hl.aa(III)V")
    public void method3963(int arg0, int arg1) {
        this.field2706[arg0] = arg1;
        this.field2715[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("hl.av(Lhk;I)I")
    public int method3930(class232 arg0) {
        int var2 = (arg0.field2728 * arg0.field2727 >> 12) + arg0.field2733;
        int var3 = ((this.field2700[arg0.field2735] - 8192) * this.field2712[arg0.field2735] >> 12) + var2;
        class229 var4 = arg0.field2725;
        if (var4.field2685 > 0 && (var4.field2681 > 0 || this.field2714[arg0.field2735] > 0)) {
            int var5 = var4.field2681 << 2;
            int var6 = var4.field2684 << 1;
            if (arg0.field2741 < var6) {
                var5 = arg0.field2741 * var5 / var6;
            }
            int var7 = (this.field2714[arg0.field2735] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2742 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2726.field1535 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field646 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("hl.bc(Lhk;I)I")
    public int method3931(class232 arg0) {
        class229 var2 = arg0.field2725;
        int var3 = this.field2701[arg0.field2735] * this.field2699[arg0.field2735] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2736 * var4 + 16384 >> 15;
        int var6 = this.field2713 * var5 + 128 >> 8;
        if (var2.field2687 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2731 * 1.953125E-5D * (double) var2.field2687) + 0.5D);
        }
        if (var2.field2680 != null) {
            int var7 = arg0.field2737;
            int var8 = var2.field2680[arg0.field2738 + 1];
            if (arg0.field2738 < var2.field2680.length - 2) {
                int var9 = (var2.field2680[arg0.field2738] & 0xFF) << 8;
                int var10 = (var2.field2680[arg0.field2738 + 2] & 0xFF) << 8;
                var8 += (var2.field2680[arg0.field2738 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2739 > 0 && var2.field2679 != null) {
            int var11 = arg0.field2739;
            int var12 = var2.field2679[arg0.field2740 + 1];
            if (arg0.field2740 < var2.field2679.length - 2) {
                int var13 = (var2.field2679[arg0.field2740] & 0xFF) << 8;
                int var14 = (var2.field2679[arg0.field2740 + 2] & 0xFF) << 8;
                var12 += (var2.field2679[arg0.field2740 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("hl.br(Lhk;I)I")
    public int method3995(class232 arg0) {
        int var2 = this.field2724[arg0.field2735];
        return var2 < 8192 ? arg0.field2732 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2732) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("hl.y()Ldt;")
    public synchronized class118 method1947() {
        return this.field2703;
    }

    @ObfuscatedName("hl.k()Ldt;")
    public synchronized class118 method1960() {
        return null;
    }

    @ObfuscatedName("hl.s()I")
    public synchronized int method1973() {
        return 0;
    }

    @ObfuscatedName("hl.x([III)V")
    public synchronized void method1949(int[] arg0, int arg1, int arg2) {
        if (this.field2718.method4010()) {
            int var4 = this.field2698 * this.field2718.field2746 / Statics.field646;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2722;
                if (this.field2723 - var5 >= 0L) {
                    this.field2722 = var5;
                    break;
                }
                int var7 = (int) ((this.field2723 - this.field2722 + (long) var4 - 1L) / (long) var4);
                this.field2722 += (long) var4 * (long) var7;
                this.field2703.method1949(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3934();
            } while (this.field2718.method4010());
        }
        this.field2703.method1949(arg0, arg1, arg2);
    }

    @ObfuscatedName("hl.t(I)V")
    public synchronized void method1952(int arg0) {
        if (this.field2718.method4010()) {
            int var2 = this.field2698 * this.field2718.field2746 / Statics.field646;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2722;
                if (this.field2723 - var3 >= 0L) {
                    this.field2722 = var3;
                    break;
                }
                int var5 = (int) ((this.field2723 - this.field2722 + (long) var2 - 1L) / (long) var2);
                this.field2722 += (long) var2 * (long) var5;
                this.field2703.method1952(var5);
                arg0 -= var5;
                this.method3934();
            } while (this.field2718.method4010());
        }
        this.field2703.method1952(arg0);
    }

    @ObfuscatedName("hl.by(B)V")
    public void method3934() {
        int var1 = this.field2720;
        int var2 = this.field2721;
        long var3 = this.field2723;
        while (this.field2721 == var2) {
            while (this.field2718.field2750[var1] == var2) {
                this.field2718.method4012(var1);
                int var5 = this.field2718.method4016(var1);
                if (var5 == 1) {
                    this.field2718.method4014();
                    this.field2718.method4013(var1);
                    if (this.field2718.method4021()) {
                        if (!this.field2719 || var2 == 0) {
                            this.method3984();
                            this.field2718.method4009();
                            return;
                        }
                        this.field2718.method4037(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3921(var5);
                }
                this.field2718.method4033(var1);
                this.field2718.method4013(var1);
            }
            var1 = this.field2718.method4020();
            var2 = this.field2718.field2750[var1];
            var3 = this.field2718.method4019(var2);
        }
        this.field2720 = var1;
        this.field2721 = var2;
        this.field2723 = var3;
    }

    @ObfuscatedName("hl.bl(Lhk;I)Z")
    public boolean method3975(class232 arg0) {
        if (arg0.field2743 != null) {
            return false;
        }
        if (arg0.field2739 >= 0) {
            arg0.method3785();
            if (arg0.field2729 > 0 && this.field2717[arg0.field2735][arg0.field2729] == arg0) {
                this.field2717[arg0.field2735][arg0.field2729] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("hl.bs(Lhk;[IIII)Z")
    public boolean method3967(class232 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2744 = Statics.field646 / 100;
        if (arg0.field2739 >= 0 && arg0.field2743 == null || arg0.field2743.method2250()) {
            arg0.method4005();
            arg0.method3785();
            if (arg0.field2729 > 0 && this.field2717[arg0.field2735][arg0.field2729] == arg0) {
                this.field2717[arg0.field2735][arg0.field2729] = null;
            }
            return true;
        }
        int var5 = arg0.field2727;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2707[arg0.field2735] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2727 = var6;
        }
        arg0.field2743.method2187(this.method3930(arg0));
        class229 var7 = arg0.field2725;
        boolean var8 = false;
        arg0.field2741++;
        arg0.field2742 += var7.field2685;
        double var9 = (double) ((arg0.field2730 - 60 << 8) + (arg0.field2728 * arg0.field2727 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2687 > 0) {
            if (var7.field2683 > 0) {
                arg0.field2731 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2683 * var9) + 0.5D);
            } else {
                arg0.field2731 += 128;
            }
        }
        if (var7.field2680 != null) {
            if (var7.field2678 > 0) {
                arg0.field2737 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2678 * var9) + 0.5D);
            } else {
                arg0.field2737 += 128;
            }
            while (arg0.field2738 < var7.field2680.length - 2 && arg0.field2737 > (var7.field2680[arg0.field2738 + 2] & 0xFF) << 8) {
                arg0.field2738 += 2;
            }
            if (arg0.field2738 == var7.field2680.length - 2 && var7.field2680[arg0.field2738 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2739 >= 0 && var7.field2679 != null && (this.field2710[arg0.field2735] & 0x1) == 0 && (arg0.field2729 < 0 || this.field2717[arg0.field2735][arg0.field2729] != arg0)) {
            if (var7.field2682 > 0) {
                arg0.field2739 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2682 * var9) + 0.5D);
            } else {
                arg0.field2739 += 128;
            }
            while (arg0.field2740 < var7.field2679.length - 2 && arg0.field2739 > (var7.field2679[arg0.field2740 + 2] & 0xFF) << 8) {
                arg0.field2740 += 2;
            }
            if (arg0.field2740 == var7.field2679.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2743.method2185(arg0.field2744, this.method3931(arg0), this.method3995(arg0));
            return false;
        }
        arg0.field2743.method2214(arg0.field2744);
        if (arg1 == null) {
            arg0.field2743.method1952(arg3);
        } else {
            arg0.field2743.method1949(arg1, arg2, arg3);
        }
        if (arg0.field2743.method2190()) {
            this.field2703.field2773.method1942(arg0.field2743);
        }
        arg0.method4005();
        if (arg0.field2739 >= 0) {
            arg0.method3785();
            if (arg0.field2729 > 0 && this.field2717[arg0.field2735][arg0.field2729] == arg0) {
                this.field2717[arg0.field2735][arg0.field2729] = null;
            }
        }
        return true;
    }
}
