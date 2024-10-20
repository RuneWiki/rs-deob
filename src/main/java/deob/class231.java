package deob;

@ObfuscatedName("he")
public class class231 extends class118 {

    @ObfuscatedName("he.g")
    public class215 field2724 = new class215(128);

    @ObfuscatedName("he.e")
    public int field2703 = 256;

    @ObfuscatedName("he.b")
    public int field2728 = 1000000;

    @ObfuscatedName("he.z")
    public int[] field2705 = new int[16];

    @ObfuscatedName("he.n")
    public int[] field2725 = new int[16];

    @ObfuscatedName("he.l")
    public int[] field2707 = new int[16];

    @ObfuscatedName("he.s")
    public int[] field2714 = new int[16];

    @ObfuscatedName("he.y")
    public int[] field2706 = new int[16];

    @ObfuscatedName("he.c")
    public int[] field2710 = new int[16];

    @ObfuscatedName("he.h")
    public int[] field2711 = new int[16];

    @ObfuscatedName("he.i")
    public int[] field2718 = new int[16];

    @ObfuscatedName("he.o")
    public int[] field2713 = new int[16];

    @ObfuscatedName("he.u")
    public int[] field2712 = new int[16];

    @ObfuscatedName("he.k")
    public int[] field2715 = new int[16];

    @ObfuscatedName("he.w")
    public int[] field2716 = new int[16];

    @ObfuscatedName("he.m")
    public int[] field2717 = new int[16];

    @ObfuscatedName("he.a")
    public int[] field2708 = new int[16];

    @ObfuscatedName("he.x")
    public int[] field2709 = new int[16];

    @ObfuscatedName("he.t")
    public class232[][] field2720 = new class232[16][128];

    @ObfuscatedName("he.ax")
    public class232[][] field2721 = new class232[16][128];

    @ObfuscatedName("he.ai")
    public class233 field2722 = new class233();

    @ObfuscatedName("he.aj")
    public boolean field2702;

    @ObfuscatedName("he.ac")
    public int field2719;

    @ObfuscatedName("he.ag")
    public int field2723;

    @ObfuscatedName("he.ay")
    public long field2726;

    @ObfuscatedName("he.as")
    public long field2727;

    @ObfuscatedName("he.av")
    public class235 field2704 = new class235(this);

    public class231() {
        this.method3942();
    }

    @ObfuscatedName("he.g(IB)V")
    public synchronized void method3992(int arg0) {
        this.field2703 = arg0;
    }

    @ObfuscatedName("he.e(I)I")
    public int method3924() {
        return this.field2703;
    }

    @ObfuscatedName("he.b(Lif;Ljr;Ldc;IB)Z")
    public synchronized boolean method3925(class236 arg0, class262 arg1, class111 arg2, int arg3) {
        arg0.method4097();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class226 var7 = (class226) arg0.field2778.method3749(); var7 != null; var7 = (class226) arg0.field2778.method3744()) {
            int var8 = (int) var7.field2660;
            class234 var9 = (class234) this.field2724.method3740((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method4274(var8);
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
                this.field2724.method3741(var11, (long) var8);
            }
            if (!var9.method4085(arg2, var7.field2677, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method4098();
        }
        return var5;
    }

    @ObfuscatedName("he.z(I)V")
    public synchronized void method4015() {
        for (class234 var1 = (class234) this.field2724.method3749(); var1 != null; var1 = (class234) this.field2724.method3744()) {
            var1.method4080();
        }
    }

    @ObfuscatedName("he.n(I)V")
    public synchronized void method3926() {
        for (class234 var1 = (class234) this.field2724.method3749(); var1 != null; var1 = (class234) this.field2724.method3744()) {
            var1.method3796();
        }
    }

    @ObfuscatedName("he.o(Lif;ZI)V")
    public synchronized void method3927(class236 arg0, boolean arg1) {
        this.method3928();
        this.field2722.method4026(arg0.field2779);
        this.field2702 = arg1;
        this.field2726 = 0L;
        int var3 = this.field2722.method4040();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2722.method4030(var4);
            this.field2722.method4032(var4);
            this.field2722.method4031(var4);
        }
        this.field2719 = this.field2722.method4038();
        this.field2723 = this.field2722.field2756[this.field2719];
        this.field2727 = this.field2722.method4036(this.field2723);
    }

    @ObfuscatedName("he.r(I)V")
    public synchronized void method3928() {
        this.field2722.method4027();
        this.method3942();
    }

    @ObfuscatedName("he.p(I)Z")
    public synchronized boolean method3929() {
        return this.field2722.method4028();
    }

    @ObfuscatedName("he.q(IIB)V")
    public synchronized void method3930(int arg0, int arg1) {
        this.method3931(arg0, arg1);
    }

    @ObfuscatedName("he.f(III)V")
    public void method3931(int arg0, int arg1) {
        this.field2714[arg0] = arg1;
        this.field2710[arg0] = arg1 & 0xFFFFFF80;
        this.method3923(arg0, arg1);
    }

    @ObfuscatedName("he.j(III)V")
    public void method3923(int arg0, int arg1) {
        if (this.field2706[arg0] != arg1) {
            this.field2706[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2721[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("he.v(IIIB)V")
    public void method3933(int arg0, int arg1, int arg2) {
        this.method3932(arg0, arg1, 64);
        if ((this.field2712[arg0] & 0x2) != 0) {
            for (class232 var4 = (class232) this.field2704.field2775.method3835(); var4 != null; var4 = (class232) this.field2704.field2775.method3812()) {
                if (var4.field2736 == arg0 && var4.field2742 < 0) {
                    this.field2720[arg0][var4.field2735] = null;
                    this.field2720[arg0][arg1] = var4;
                    int var5 = (var4.field2740 * var4.field2739 >> 12) + var4.field2738;
                    var4.field2738 += arg1 - var4.field2735 << 8;
                    var4.field2739 = var5 - var4.field2738;
                    var4.field2740 = 4096;
                    var4.field2735 = arg1;
                    return;
                }
            }
        }
        class234 var6 = (class234) this.field2724.method3740((long) this.field2706[arg0]);
        if (var6 == null) {
            return;
        }
        class106 var7 = var6.field2767[arg1];
        if (var7 == null) {
            return;
        }
        class232 var8 = new class232();
        var8.field2736 = arg0;
        var8.field2731 = var6;
        var8.field2732 = var7;
        var8.field2733 = var6.field2771[arg1];
        var8.field2734 = var6.field2768[arg1];
        var8.field2735 = arg1;
        var8.field2750 = var6.field2774 * arg2 * arg2 * var6.field2769[arg1] + 1024 >> 11;
        var8.field2737 = var6.field2766[arg1] & 0xFF;
        var8.field2738 = (arg1 << 8) - (var6.field2772[arg1] & 0x7FFF);
        var8.field2741 = 0;
        var8.field2743 = 0;
        var8.field2746 = 0;
        var8.field2742 = -1;
        var8.field2745 = 0;
        if (this.field2717[arg0] == 0) {
            var8.field2748 = class116.method2300(var7, this.method3954(var8), this.method3946(var8), this.method3947(var8));
        } else {
            var8.field2748 = class116.method2300(var7, this.method3954(var8), 0, this.method3947(var8));
            this.method3959(var8, var6.field2772[arg1] < 0);
        }
        if (var6.field2772[arg1] < 0) {
            var8.field2748.method2241(-1);
        }
        if (var8.field2734 >= 0) {
            class232 var9 = this.field2721[arg0][var8.field2734];
            if (var9 != null && var9.field2742 < 0) {
                this.field2720[arg0][var9.field2735] = null;
                var9.field2742 = 0;
            }
            this.field2721[arg0][var8.field2734] = var8;
        }
        this.field2704.field2775.method3829(var8);
        this.field2720[arg0][arg1] = var8;
    }

    @ObfuscatedName("he.u(Lha;ZI)V")
    public void method3959(class232 arg0, boolean arg1) {
        int var3 = arg0.field2732.field1520.length;
        int var5;
        if (arg1 && arg0.field2732.field1523) {
            int var4 = var3 + var3 - arg0.field2732.field1521;
            var5 = (int) ((long) this.field2717[arg0.field2736] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2748.method2326(true);
            }
        } else {
            var5 = (int) ((long) this.field2717[arg0.field2736] * (long) var3 >> 6);
        }
        arg0.field2748.method2247(var5);
    }

    @ObfuscatedName("he.k(IIII)V")
    public void method3932(int arg0, int arg1, int arg2) {
        class232 var4 = this.field2720[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2720[arg0][arg1] = null;
        if ((this.field2712[arg0] & 0x2) == 0) {
            var4.field2742 = 0;
            return;
        }
        for (class232 var5 = (class232) this.field2704.field2775.method3809(); var5 != null; var5 = (class232) this.field2704.field2775.method3832()) {
            if (var4.field2736 == var5.field2736 && var5.field2742 < 0 && var4 != var5) {
                var4.field2742 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("he.w(IIII)V")
    public void method3936(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("he.x(III)V")
    public void method3937(int arg0, int arg1) {
    }

    @ObfuscatedName("he.t(III)V")
    public void method3938(int arg0, int arg1) {
        this.field2711[arg0] = arg1;
    }

    @ObfuscatedName("he.ax(II)V")
    public void method3999(int arg0) {
        for (class232 var2 = (class232) this.field2704.field2775.method3809(); var2 != null; var2 = (class232) this.field2704.field2775.method3832()) {
            if (arg0 < 0 || var2.field2736 == arg0) {
                if (var2.field2748 != null) {
                    var2.field2748.method2252(Statics.field1550 / 100);
                    if (var2.field2748.method2261()) {
                        this.field2704.field2777.method2030(var2.field2748);
                    }
                    var2.method4022();
                }
                if (var2.field2742 < 0) {
                    this.field2720[var2.field2736][var2.field2735] = null;
                }
                var2.method3796();
            }
        }
    }

    @ObfuscatedName("he.ai(II)V")
    public void method3940(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3940(var2);
            }
            return;
        }
        this.field2705[arg0] = 12800;
        this.field2725[arg0] = 8192;
        this.field2707[arg0] = 16383;
        this.field2711[arg0] = 8192;
        this.field2718[arg0] = 0;
        this.field2713[arg0] = 8192;
        this.method3983(arg0);
        this.method3922(arg0);
        this.field2712[arg0] = 0;
        this.field2715[arg0] = 32767;
        this.field2716[arg0] = 256;
        this.field2717[arg0] = 0;
        this.method3944(arg0, 8192);
    }

    @ObfuscatedName("he.ah(II)V")
    public void method3941(int arg0) {
        for (class232 var2 = (class232) this.field2704.field2775.method3809(); var2 != null; var2 = (class232) this.field2704.field2775.method3832()) {
            if ((arg0 < 0 || var2.field2736 == arg0) && var2.field2742 < 0) {
                this.field2720[var2.field2736][var2.field2735] = null;
                var2.field2742 = 0;
            }
        }
    }

    @ObfuscatedName("he.au(I)V")
    public void method3942() {
        this.method3999(-1);
        this.method3940(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2706[var1] = this.field2714[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2710[var2] = this.field2714[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("he.ap(IB)V")
    public void method3983(int arg0) {
        if ((this.field2712[arg0] & 0x2) == 0) {
            return;
        }
        for (class232 var2 = (class232) this.field2704.field2775.method3809(); var2 != null; var2 = (class232) this.field2704.field2775.method3832()) {
            if (var2.field2736 == arg0 && this.field2720[arg0][var2.field2735] == null && var2.field2742 < 0) {
                var2.field2742 = 0;
            }
        }
    }

    @ObfuscatedName("he.at(II)V")
    public void method3922(int arg0) {
        if ((this.field2712[arg0] & 0x4) == 0) {
            return;
        }
        for (class232 var2 = (class232) this.field2704.field2775.method3809(); var2 != null; var2 = (class232) this.field2704.field2775.method3832()) {
            if (var2.field2736 == arg0) {
                var2.field2744 = 0;
            }
        }
    }

    @ObfuscatedName("he.am(IB)V")
    public void method3943(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3932(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3933(var6, var7, var8);
            } else {
                this.method3932(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3936(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2710[var12] = (var14 << 14) + (this.field2710[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2710[var12] = (var14 << 7) + (this.field2710[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2718[var12] = (var14 << 7) + (this.field2718[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2718[var12] = (this.field2718[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2713[var12] = (var14 << 7) + (this.field2713[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2713[var12] = (this.field2713[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2705[var12] = (var14 << 7) + (this.field2705[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2705[var12] = (this.field2705[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2725[var12] = (var14 << 7) + (this.field2725[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2725[var12] = (this.field2725[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2707[var12] = (var14 << 7) + (this.field2707[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2707[var12] = (this.field2707[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2712[var12] |= 0x1;
                } else {
                    this.field2712[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2712[var12] |= 0x2;
                } else {
                    this.method3983(var12);
                    this.field2712[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2715[var12] = (var14 << 7) + (this.field2715[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2715[var12] = (this.field2715[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2715[var12] = (var14 << 7) + (this.field2715[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2715[var12] = (this.field2715[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3999(var12);
            }
            if (var13 == 121) {
                this.method3940(var12);
            }
            if (var13 == 123) {
                this.method3941(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2715[var12];
                if (var15 == 16384) {
                    this.field2716[var12] = (var14 << 7) + (this.field2716[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2715[var12];
                if (var16 == 16384) {
                    this.field2716[var12] = (this.field2716[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2717[var12] = (var14 << 7) + (this.field2717[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2717[var12] = (this.field2717[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2712[var12] |= 0x4;
                } else {
                    this.method3922(var12);
                    this.field2712[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3944(var12, (var14 << 7) + (this.field2708[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3944(var12, (this.field2708[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3923(var17, this.field2710[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3937(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method3938(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3942();
            }
        }
    }

    @ObfuscatedName("he.aq(III)V")
    public void method3944(int arg0, int arg1) {
        this.field2708[arg0] = arg1;
        this.field2709[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("he.bq(Lha;B)I")
    public int method3954(class232 arg0) {
        int var2 = (arg0.field2740 * arg0.field2739 >> 12) + arg0.field2738;
        int var3 = ((this.field2711[arg0.field2736] - 8192) * this.field2716[arg0.field2736] >> 12) + var2;
        class229 var4 = arg0.field2733;
        if (var4.field2690 > 0 && (var4.field2689 > 0 || this.field2718[arg0.field2736] > 0)) {
            int var5 = var4.field2689 << 2;
            int var6 = var4.field2687 << 1;
            if (arg0.field2730 < var6) {
                var5 = arg0.field2730 * var5 / var6;
            }
            int var7 = (this.field2718[arg0.field2736] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2747 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2732.field1519 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1550 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("he.bi(Lha;I)I")
    public int method3946(class232 arg0) {
        class229 var2 = arg0.field2733;
        int var3 = this.field2707[arg0.field2736] * this.field2705[arg0.field2736] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2750 * var4 + 16384 >> 15;
        int var6 = this.field2703 * var5 + 128 >> 8;
        if (var2.field2688 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2741 * 1.953125E-5D * (double) var2.field2688) + 0.5D);
        }
        if (var2.field2691 != null) {
            int var7 = arg0.field2743;
            int var8 = var2.field2691[arg0.field2746 + 1];
            if (arg0.field2746 < var2.field2691.length - 2) {
                int var9 = (var2.field2691[arg0.field2746] & 0xFF) << 8;
                int var10 = (var2.field2691[arg0.field2746 + 2] & 0xFF) << 8;
                var8 += (var2.field2691[arg0.field2746 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2742 > 0 && var2.field2684 != null) {
            int var11 = arg0.field2742;
            int var12 = var2.field2684[arg0.field2745 + 1];
            if (arg0.field2745 < var2.field2684.length - 2) {
                int var13 = (var2.field2684[arg0.field2745] & 0xFF) << 8;
                int var14 = (var2.field2684[arg0.field2745 + 2] & 0xFF) << 8;
                var12 += (var2.field2684[arg0.field2745 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("he.bj(Lha;I)I")
    public int method3947(class232 arg0) {
        int var2 = this.field2725[arg0.field2736];
        return var2 < 8192 ? arg0.field2737 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2737) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("he.l()Ldh;")
    public synchronized class118 method2035() {
        return this.field2704;
    }

    @ObfuscatedName("he.s()Ldh;")
    public synchronized class118 method2032() {
        return null;
    }

    @ObfuscatedName("he.y()I")
    public synchronized int method2061() {
        return 0;
    }

    @ObfuscatedName("he.c([III)V")
    public synchronized void method2038(int[] arg0, int arg1, int arg2) {
        if (this.field2722.method4028()) {
            int var4 = this.field2728 * this.field2722.field2752 / Statics.field1550;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2726;
                if (this.field2727 - var5 >= 0L) {
                    this.field2726 = var5;
                    break;
                }
                int var7 = (int) ((this.field2727 - this.field2726 + (long) var4 - 1L) / (long) var4);
                this.field2726 += (long) var4 * (long) var7;
                this.field2704.method2038(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3935();
            } while (this.field2722.method4028());
        }
        this.field2704.method2038(arg0, arg1, arg2);
    }

    @ObfuscatedName("he.d(I)V")
    public synchronized void method2040(int arg0) {
        if (this.field2722.method4028()) {
            int var2 = this.field2728 * this.field2722.field2752 / Statics.field1550;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2726;
                if (this.field2727 - var3 >= 0L) {
                    this.field2726 = var3;
                    break;
                }
                int var5 = (int) ((this.field2727 - this.field2726 + (long) var2 - 1L) / (long) var2);
                this.field2726 += (long) var2 * (long) var5;
                this.field2704.method2040(var5);
                arg0 -= var5;
                this.method3935();
            } while (this.field2722.method4028());
        }
        this.field2704.method2040(arg0);
    }

    @ObfuscatedName("he.bw(I)V")
    public void method3935() {
        int var1 = this.field2719;
        int var2 = this.field2723;
        long var3 = this.field2727;
        while (this.field2723 == var2) {
            while (this.field2722.field2756[var1] == var2) {
                this.field2722.method4030(var1);
                int var5 = this.field2722.method4033(var1);
                if (var5 == 1) {
                    this.field2722.method4051();
                    this.field2722.method4031(var1);
                    if (this.field2722.method4076()) {
                        if (!this.field2702 || var2 == 0) {
                            this.method3942();
                            this.field2722.method4027();
                            return;
                        }
                        this.field2722.method4039(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3943(var5);
                }
                this.field2722.method4032(var1);
                this.field2722.method4031(var1);
            }
            var1 = this.field2722.method4038();
            var2 = this.field2722.field2756[var1];
            var3 = this.field2722.method4036(var2);
        }
        this.field2719 = var1;
        this.field2723 = var2;
        this.field2727 = var3;
    }

    @ObfuscatedName("he.bp(Lha;B)Z")
    public boolean method3948(class232 arg0) {
        if (arg0.field2748 != null) {
            return false;
        }
        if (arg0.field2742 >= 0) {
            arg0.method3796();
            if (arg0.field2734 > 0 && this.field2721[arg0.field2736][arg0.field2734] == arg0) {
                this.field2721[arg0.field2736][arg0.field2734] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("he.bh(Lha;[IIIS)Z")
    public boolean method3997(class232 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2749 = Statics.field1550 / 100;
        if (arg0.field2742 >= 0 && arg0.field2748 == null || arg0.field2748.method2255()) {
            arg0.method4022();
            arg0.method3796();
            if (arg0.field2734 > 0 && this.field2721[arg0.field2736][arg0.field2734] == arg0) {
                this.field2721[arg0.field2736][arg0.field2734] = null;
            }
            return true;
        }
        int var5 = arg0.field2740;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2713[arg0.field2736] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2740 = var6;
        }
        arg0.field2748.method2253(this.method3954(arg0));
        class229 var7 = arg0.field2733;
        boolean var8 = false;
        arg0.field2730++;
        arg0.field2747 += var7.field2690;
        double var9 = (double) ((arg0.field2735 - 60 << 8) + (arg0.field2740 * arg0.field2739 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2688 > 0) {
            if (var7.field2683 > 0) {
                arg0.field2741 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2683 * var9) + 0.5D);
            } else {
                arg0.field2741 += 128;
            }
        }
        if (var7.field2691 != null) {
            if (var7.field2686 > 0) {
                arg0.field2743 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2686 * var9) + 0.5D);
            } else {
                arg0.field2743 += 128;
            }
            while (arg0.field2746 < var7.field2691.length - 2 && arg0.field2743 > (var7.field2691[arg0.field2746 + 2] & 0xFF) << 8) {
                arg0.field2746 += 2;
            }
            if (arg0.field2746 == var7.field2691.length - 2 && var7.field2691[arg0.field2746 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2742 >= 0 && var7.field2684 != null && (this.field2712[arg0.field2736] & 0x1) == 0 && (arg0.field2734 < 0 || this.field2721[arg0.field2736][arg0.field2734] != arg0)) {
            if (var7.field2693 > 0) {
                arg0.field2742 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2693 * var9) + 0.5D);
            } else {
                arg0.field2742 += 128;
            }
            while (arg0.field2745 < var7.field2684.length - 2 && arg0.field2742 > (var7.field2684[arg0.field2745 + 2] & 0xFF) << 8) {
                arg0.field2745 += 2;
            }
            if (arg0.field2745 == var7.field2684.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2748.method2354(arg0.field2749, this.method3946(arg0), this.method3947(arg0));
            return false;
        }
        arg0.field2748.method2252(arg0.field2749);
        if (arg1 == null) {
            arg0.field2748.method2040(arg3);
        } else {
            arg0.field2748.method2038(arg1, arg2, arg3);
        }
        if (arg0.field2748.method2261()) {
            this.field2704.field2777.method2030(arg0.field2748);
        }
        arg0.method4022();
        if (arg0.field2742 >= 0) {
            arg0.method3796();
            if (arg0.field2734 > 0 && this.field2721[arg0.field2736][arg0.field2734] == arg0) {
                this.field2721[arg0.field2736][arg0.field2734] = null;
            }
        }
        return true;
    }
}
