package deob;

@ObfuscatedName("ff")
public class class162 extends class60 {

    @ObfuscatedName("ff.t")
    public class174 field2717 = new class174(128);

    @ObfuscatedName("ff.o")
    public int field2712 = 256;

    @ObfuscatedName("ff.i")
    public int field2731 = 1000000;

    @ObfuscatedName("ff.p")
    public int[] field2714 = new int[16];

    @ObfuscatedName("ff.c")
    public int[] field2723 = new int[16];

    @ObfuscatedName("ff.y")
    public int[] field2716 = new int[16];

    @ObfuscatedName("ff.g")
    public int[] field2718 = new int[16];

    @ObfuscatedName("ff.l")
    public int[] field2727 = new int[16];

    @ObfuscatedName("ff.h")
    public int[] field2733 = new int[16];

    @ObfuscatedName("ff.n")
    public int[] field2720 = new int[16];

    @ObfuscatedName("ff.m")
    public int[] field2721 = new int[16];

    @ObfuscatedName("ff.x")
    public int[] field2722 = new int[16];

    @ObfuscatedName("ff.a")
    public int[] field2715 = new int[16];

    @ObfuscatedName("ff.d")
    public int[] field2713 = new int[16];

    @ObfuscatedName("ff.j")
    public int[] field2726 = new int[16];

    @ObfuscatedName("ff.s")
    public int[] field2740 = new int[16];

    @ObfuscatedName("ff.f")
    public int[] field2728 = new int[16];

    @ObfuscatedName("ff.e")
    public int[] field2729 = new int[16];

    @ObfuscatedName("ff.q")
    public class165[][] field2730 = new class165[16][128];

    @ObfuscatedName("ff.al")
    public class165[][] field2735 = new class165[16][128];

    @ObfuscatedName("ff.ao")
    public class160 field2732 = new class160();

    @ObfuscatedName("ff.ap")
    public boolean field2738;

    @ObfuscatedName("ff.aa")
    public int field2734;

    @ObfuscatedName("ff.ak")
    public int field2725;

    @ObfuscatedName("ff.ah")
    public long field2736;

    @ObfuscatedName("ff.as")
    public long field2737;

    @ObfuscatedName("ff.aw")
    public class164 field2724 = new class164(this);

    public class162() {
        this.method3000();
    }

    @ObfuscatedName("ff.t(II)V")
    public synchronized void method3043(int arg0) {
        this.field2712 = arg0;
    }

    @ObfuscatedName("ff.o(B)I")
    public int method3062() {
        return this.field2712;
    }

    @ObfuscatedName("ff.i(Lfq;Ley;Lbd;IB)Z")
    public synchronized boolean method2983(class158 arg0, class146 arg1, class53 arg2, int arg3) {
        arg0.method2901();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class175 var7 = (class175) arg0.field2672.method3134(); var7 != null; var7 = (class175) arg0.field2672.method3135()) {
            int var8 = (int) var7.field2866;
            class159 var9 = (class159) this.field2717.method3138((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method2673(var8);
                class159 var11;
                if (var10 == null) {
                    var11 = null;
                } else {
                    var11 = new class159(var10);
                }
                var9 = var11;
                if (var11 == null) {
                    var5 = false;
                    continue;
                }
                this.field2717.method3132(var11, (long) var8);
            }
            if (!var9.method2912(arg2, var7.field2844, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method2902();
        }
        return var5;
    }

    @ObfuscatedName("ff.p(B)V")
    public synchronized void method3011() {
        for (class159 var1 = (class159) this.field2717.method3134(); var1 != null; var1 = (class159) this.field2717.method3135()) {
            var1.method2913();
        }
    }

    @ObfuscatedName("ff.c(I)V")
    public synchronized void method3055() {
        for (class159 var1 = (class159) this.field2717.method3134(); var1 != null; var1 = (class159) this.field2717.method3135()) {
            var1.method3261();
        }
    }

    @ObfuscatedName("ff.n(Lfq;ZI)V")
    public synchronized void method2985(class158 arg0, boolean arg1) {
        this.method3035();
        this.field2732.method2942(arg0.field2673);
        this.field2738 = arg1;
        this.field2736 = 0L;
        int var3 = this.field2732.method2925();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2732.method2926(var4);
            this.field2732.method2929(var4);
            this.field2732.method2927(var4);
        }
        this.field2734 = this.field2732.method2934();
        this.field2725 = this.field2732.field2690[this.field2734];
        this.field2737 = this.field2732.method2933(this.field2725);
    }

    @ObfuscatedName("ff.m(I)V")
    public synchronized void method3035() {
        this.field2732.method2923();
        this.method3000();
    }

    @ObfuscatedName("ff.x(I)Z")
    public synchronized boolean method2987() {
        return this.field2732.method2962();
    }

    @ObfuscatedName("ff.b(IIS)V")
    public synchronized void method2988(int arg0, int arg1) {
        this.method2989(arg0, arg1);
    }

    @ObfuscatedName("ff.u(III)V")
    public void method2989(int arg0, int arg1) {
        this.field2718[arg0] = arg1;
        this.field2733[arg0] = arg1 & 0xFFFFFF80;
        this.method2994(arg0, arg1);
    }

    @ObfuscatedName("ff.r(III)V")
    public void method2994(int arg0, int arg1) {
        if (this.field2727[arg0] != arg1) {
            this.field2727[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2735[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("ff.z(IIII)V")
    public void method2991(int arg0, int arg1, int arg2) {
        this.method2993(arg0, arg1, 64);
        if ((this.field2715[arg0] & 0x2) != 0) {
            for (class165 var4 = (class165) this.field2724.field2753.method3171(); var4 != null; var4 = (class165) this.field2724.field2753.method3177()) {
                if (var4.field2764 == arg0 && var4.field2780 < 0) {
                    this.field2730[arg0][var4.field2763] = null;
                    this.field2730[arg0][arg1] = var4;
                    int var5 = (var4.field2768 * var4.field2767 >> 12) + var4.field2766;
                    var4.field2766 += arg1 - var4.field2763 << 8;
                    var4.field2767 = var5 - var4.field2766;
                    var4.field2768 = 4096;
                    var4.field2763 = arg1;
                    return;
                }
            }
        }
        class159 var6 = (class159) this.field2717.method3138((long) this.field2727[arg0]);
        if (var6 == null) {
            return;
        }
        class56 var7 = var6.field2675[arg1];
        if (var7 == null) {
            return;
        }
        class165 var8 = new class165();
        var8.field2764 = arg0;
        var8.field2759 = var6;
        var8.field2760 = var7;
        var8.field2761 = var6.field2679[arg1];
        var8.field2762 = var6.field2683[arg1];
        var8.field2763 = arg1;
        var8.field2773 = var6.field2680 * arg2 * arg2 * var6.field2676[arg1] + 1024 >> 11;
        var8.field2776 = var6.field2678[arg1] & 0xFF;
        var8.field2766 = (arg1 << 8) - (var6.field2677[arg1] & 0x7FFF);
        var8.field2769 = 0;
        var8.field2770 = 0;
        var8.field2771 = 0;
        var8.field2780 = -1;
        var8.field2772 = 0;
        if (this.field2740[arg0] == 0) {
            var8.field2781 = class58.method1079(var7, this.method3005(var8), this.method3006(var8), this.method3007(var8));
        } else {
            var8.field2781 = class58.method1079(var7, this.method3005(var8), 0, this.method3007(var8));
            this.method2992(var8, var6.field2677[arg1] < 0);
        }
        if (var6.field2677[arg1] < 0) {
            var8.field2781.method1206(-1);
        }
        if (var8.field2762 >= 0) {
            class165 var9 = this.field2735[arg0][var8.field2762];
            if (var9 != null && var9.field2780 < 0) {
                this.field2730[arg0][var9.field2763] = null;
                var9.field2780 = 0;
            }
            this.field2735[arg0][var8.field2762] = var8;
        }
        this.field2724.field2753.method3166(var8);
        this.field2730[arg0][arg1] = var8;
    }

    @ObfuscatedName("ff.v(Lfh;ZI)V")
    public void method2992(class165 arg0, boolean arg1) {
        int var3 = arg0.field2760.field1137.length;
        int var5;
        if (arg1 && arg0.field2760.field1133) {
            int var4 = var3 + var3 - arg0.field2760.field1135;
            var5 = (int) ((long) this.field2740[arg0.field2764] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2781.method1165(true);
            }
        } else {
            var5 = (int) ((long) this.field2740[arg0.field2764] * (long) var3 >> 6);
        }
        arg0.field2781.method1086(var5);
    }

    @ObfuscatedName("ff.k(IIIB)V")
    public void method2993(int arg0, int arg1, int arg2) {
        class165 var4 = this.field2730[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2730[arg0][arg1] = null;
        if ((this.field2715[arg0] & 0x2) == 0) {
            var4.field2780 = 0;
            return;
        }
        for (class165 var5 = (class165) this.field2724.field2753.method3170(); var5 != null; var5 = (class165) this.field2724.field2753.method3172()) {
            if (var4.field2764 == var5.field2764 && var5.field2780 < 0 && var4 != var5) {
                var4.field2780 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("ff.a(IIIB)V")
    public void method3046(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("ff.d(III)V")
    public void method2995(int arg0, int arg1) {
    }

    @ObfuscatedName("ff.j(III)V")
    public void method2996(int arg0, int arg1) {
        this.field2720[arg0] = arg1;
    }

    @ObfuscatedName("ff.ap(II)V")
    public void method3025(int arg0) {
        for (class165 var2 = (class165) this.field2724.field2753.method3170(); var2 != null; var2 = (class165) this.field2724.field2753.method3172()) {
            if (arg0 < 0 || var2.field2764 == arg0) {
                if (var2.field2781 != null) {
                    var2.field2781.method1091(Statics.field1088 / 100);
                    if (var2.field2781.method1095()) {
                        this.field2724.field2752.method935(var2.field2781);
                    }
                    var2.method3090();
                }
                if (var2.field2780 < 0) {
                    this.field2730[var2.field2764][var2.field2763] = null;
                }
                var2.method3261();
            }
        }
    }

    @ObfuscatedName("ff.aa(II)V")
    public void method2998(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method2998(var2);
            }
            return;
        }
        this.field2714[arg0] = 12800;
        this.field2723[arg0] = 8192;
        this.field2716[arg0] = 16383;
        this.field2720[arg0] = 8192;
        this.field2721[arg0] = 0;
        this.field2722[arg0] = 8192;
        this.method3001(arg0);
        this.method3009(arg0);
        this.field2715[arg0] = 0;
        this.field2713[arg0] = 32767;
        this.field2726[arg0] = 256;
        this.field2740[arg0] = 0;
        this.method3004(arg0, 8192);
    }

    @ObfuscatedName("ff.ak(IS)V")
    public void method3067(int arg0) {
        for (class165 var2 = (class165) this.field2724.field2753.method3170(); var2 != null; var2 = (class165) this.field2724.field2753.method3172()) {
            if ((arg0 < 0 || var2.field2764 == arg0) && var2.field2780 < 0) {
                this.field2730[var2.field2764][var2.field2763] = null;
                var2.field2780 = 0;
            }
        }
    }

    @ObfuscatedName("ff.aw(B)V")
    public void method3000() {
        this.method3025(-1);
        this.method2998(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2727[var1] = this.field2718[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2733[var2] = this.field2718[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("ff.aj(II)V")
    public void method3001(int arg0) {
        if ((this.field2715[arg0] & 0x2) == 0) {
            return;
        }
        for (class165 var2 = (class165) this.field2724.field2753.method3170(); var2 != null; var2 = (class165) this.field2724.field2753.method3172()) {
            if (var2.field2764 == arg0 && this.field2730[arg0][var2.field2763] == null && var2.field2780 < 0) {
                var2.field2780 = 0;
            }
        }
    }

    @ObfuscatedName("ff.af(II)V")
    public void method3009(int arg0) {
        if ((this.field2715[arg0] & 0x4) == 0) {
            return;
        }
        for (class165 var2 = (class165) this.field2724.field2753.method3170(); var2 != null; var2 = (class165) this.field2724.field2753.method3172()) {
            if (var2.field2764 == arg0) {
                var2.field2778 = 0;
            }
        }
    }

    @ObfuscatedName("ff.ab(II)V")
    public void method3003(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method2993(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method2991(var6, var7, var8);
            } else {
                this.method2993(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3046(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2733[var12] = (var14 << 14) + (this.field2733[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2733[var12] = (var14 << 7) + (this.field2733[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2721[var12] = (var14 << 7) + (this.field2721[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2721[var12] = (this.field2721[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2722[var12] = (var14 << 7) + (this.field2722[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2722[var12] = (this.field2722[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2714[var12] = (var14 << 7) + (this.field2714[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2714[var12] = (this.field2714[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2723[var12] = (var14 << 7) + (this.field2723[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2723[var12] = (this.field2723[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2716[var12] = (var14 << 7) + (this.field2716[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2716[var12] = (this.field2716[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2715[var12] |= 0x1;
                } else {
                    this.field2715[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2715[var12] |= 0x2;
                } else {
                    this.method3001(var12);
                    this.field2715[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2713[var12] = (var14 << 7) + (this.field2713[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2713[var12] = (this.field2713[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2713[var12] = (var14 << 7) + (this.field2713[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2713[var12] = (this.field2713[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3025(var12);
            }
            if (var13 == 121) {
                this.method2998(var12);
            }
            if (var13 == 123) {
                this.method3067(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2713[var12];
                if (var15 == 16384) {
                    this.field2726[var12] = (var14 << 7) + (this.field2726[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2713[var12];
                if (var16 == 16384) {
                    this.field2726[var12] = (this.field2726[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2740[var12] = (var14 << 7) + (this.field2740[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2740[var12] = (this.field2740[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2715[var12] |= 0x4;
                } else {
                    this.method3009(var12);
                    this.field2715[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3004(var12, (var14 << 7) + (this.field2728[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3004(var12, (this.field2728[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method2994(var17, this.field2733[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method2995(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method2996(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3000();
            }
        }
    }

    @ObfuscatedName("ff.ai(IIB)V")
    public void method3004(int arg0, int arg1) {
        this.field2728[arg0] = arg1;
        this.field2729[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("ff.an(Lfh;B)I")
    public int method3005(class165 arg0) {
        int var2 = (arg0.field2768 * arg0.field2767 >> 12) + arg0.field2766;
        int var3 = ((this.field2720[arg0.field2764] - 8192) * this.field2726[arg0.field2764] >> 12) + var2;
        class163 var4 = arg0.field2761;
        if (var4.field2745 > 0 && (var4.field2747 > 0 || this.field2721[arg0.field2764] > 0)) {
            int var5 = var4.field2747 << 2;
            int var6 = var4.field2749 << 1;
            if (arg0.field2774 < var6) {
                var5 = arg0.field2774 * var5 / var6;
            }
            int var7 = (this.field2721[arg0.field2764] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2775 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2760.field1134 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1088 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("ff.ac(Lfh;I)I")
    public int method3006(class165 arg0) {
        class163 var2 = arg0.field2761;
        int var3 = this.field2714[arg0.field2764] * this.field2716[arg0.field2764] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2773 * var4 + 16384 >> 15;
        int var6 = this.field2712 * var5 + 128 >> 8;
        if (var2.field2743 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2769 * 1.953125E-5D * (double) var2.field2743) + 0.5D);
        }
        if (var2.field2741 != null) {
            int var7 = arg0.field2770;
            int var8 = var2.field2741[arg0.field2771 + 1];
            if (arg0.field2771 < var2.field2741.length - 2) {
                int var9 = (var2.field2741[arg0.field2771] & 0xFF) << 8;
                int var10 = (var2.field2741[arg0.field2771 + 2] & 0xFF) << 8;
                var8 += (var2.field2741[arg0.field2771 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2780 > 0 && var2.field2742 != null) {
            int var11 = arg0.field2780;
            int var12 = var2.field2742[arg0.field2772 + 1];
            if (arg0.field2772 < var2.field2742.length - 2) {
                int var13 = (var2.field2742[arg0.field2772] & 0xFF) << 8;
                int var14 = (var2.field2742[arg0.field2772 + 2] & 0xFF) << 8;
                var12 += (var2.field2742[arg0.field2772 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("ff.au(Lfh;I)I")
    public int method3007(class165 arg0) {
        int var2 = this.field2723[arg0.field2764];
        return var2 < 8192 ? arg0.field2776 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2776) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("ff.y()Lbq;")
    public synchronized class60 method940() {
        return this.field2724;
    }

    @ObfuscatedName("ff.g()Lbq;")
    public synchronized class60 method944() {
        return null;
    }

    @ObfuscatedName("ff.l()I")
    public synchronized int method942() {
        return 0;
    }

    @ObfuscatedName("ff.h([III)V")
    public synchronized void method943(int[] arg0, int arg1, int arg2) {
        if (this.field2732.method2962()) {
            int var4 = this.field2731 * this.field2732.field2687 / Statics.field1088;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2736;
                if (this.field2737 - var5 >= 0L) {
                    this.field2736 = var5;
                    break;
                }
                int var7 = (int) ((this.field2737 - this.field2736 + (long) var4 - 1L) / (long) var4);
                this.field2736 += (long) var4 * (long) var7;
                this.field2724.method943(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3012();
            } while (this.field2732.method2962());
        }
        this.field2724.method943(arg0, arg1, arg2);
    }

    @ObfuscatedName("ff.w(I)V")
    public synchronized void method945(int arg0) {
        if (this.field2732.method2962()) {
            int var2 = this.field2731 * this.field2732.field2687 / Statics.field1088;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2736;
                if (this.field2737 - var3 >= 0L) {
                    this.field2736 = var3;
                    break;
                }
                int var5 = (int) ((this.field2737 - this.field2736 + (long) var2 - 1L) / (long) var2);
                this.field2736 += (long) var2 * (long) var5;
                this.field2724.method945(var5);
                arg0 -= var5;
                this.method3012();
            } while (this.field2732.method2962());
        }
        this.field2724.method945(arg0);
    }

    @ObfuscatedName("ff.av(I)V")
    public void method3012() {
        int var1 = this.field2734;
        int var2 = this.field2725;
        long var3 = this.field2737;
        while (this.field2725 == var2) {
            while (this.field2732.field2690[var1] == var2) {
                this.field2732.method2926(var1);
                int var5 = this.field2732.method2930(var1);
                if (var5 == 1) {
                    this.field2732.method2928();
                    this.field2732.method2927(var1);
                    if (this.field2732.method2935()) {
                        if (!this.field2738 || var2 == 0) {
                            this.method3000();
                            this.field2732.method2923();
                            return;
                        }
                        this.field2732.method2937(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3003(var5);
                }
                this.field2732.method2929(var1);
                this.field2732.method2927(var1);
            }
            var1 = this.field2732.method2934();
            var2 = this.field2732.field2690[var1];
            var3 = this.field2732.method2933(var2);
        }
        this.field2734 = var1;
        this.field2725 = var2;
        this.field2737 = var3;
    }

    @ObfuscatedName("ff.at(Lfh;I)Z")
    public boolean method3044(class165 arg0) {
        if (arg0.field2781 != null) {
            return false;
        }
        if (arg0.field2780 >= 0) {
            arg0.method3261();
            if (arg0.field2762 > 0 && this.field2735[arg0.field2764][arg0.field2762] == arg0) {
                this.field2735[arg0.field2764][arg0.field2762] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("ff.ax(Lfh;[IIII)Z")
    public boolean method3014(class165 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2777 = Statics.field1088 / 100;
        if (arg0.field2780 >= 0 && arg0.field2781 == null || arg0.field2781.method1094()) {
            arg0.method3090();
            arg0.method3261();
            if (arg0.field2762 > 0 && this.field2735[arg0.field2764][arg0.field2762] == arg0) {
                this.field2735[arg0.field2764][arg0.field2762] = null;
            }
            return true;
        }
        int var5 = arg0.field2768;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2722[arg0.field2764] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2768 = var6;
        }
        arg0.field2781.method1149(this.method3005(arg0));
        class163 var7 = arg0.field2761;
        boolean var8 = false;
        arg0.field2774++;
        arg0.field2775 += var7.field2745;
        double var9 = (double) ((arg0.field2763 - 60 << 8) + (arg0.field2768 * arg0.field2767 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2743 > 0) {
            if (var7.field2746 > 0) {
                arg0.field2769 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2746 * var9) + 0.5D);
            } else {
                arg0.field2769 += 128;
            }
        }
        if (var7.field2741 != null) {
            if (var7.field2744 > 0) {
                arg0.field2770 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2744 * var9) + 0.5D);
            } else {
                arg0.field2770 += 128;
            }
            while (arg0.field2771 < var7.field2741.length - 2 && arg0.field2770 > (var7.field2741[arg0.field2771 + 2] & 0xFF) << 8) {
                arg0.field2771 += 2;
            }
            if (arg0.field2771 == var7.field2741.length - 2 && var7.field2741[arg0.field2771 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2780 >= 0 && var7.field2742 != null && (this.field2715[arg0.field2764] & 0x1) == 0 && (arg0.field2762 < 0 || this.field2735[arg0.field2764][arg0.field2762] != arg0)) {
            if (var7.field2750 > 0) {
                arg0.field2780 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2750 * var9) + 0.5D);
            } else {
                arg0.field2780 += 128;
            }
            while (arg0.field2772 < var7.field2742.length - 2 && arg0.field2780 > (var7.field2742[arg0.field2772 + 2] & 0xFF) << 8) {
                arg0.field2772 += 2;
            }
            if (arg0.field2772 == var7.field2742.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2781.method1090(arg0.field2777, this.method3006(arg0), this.method3007(arg0));
            return false;
        }
        arg0.field2781.method1091(arg0.field2777);
        if (arg1 == null) {
            arg0.field2781.method945(arg3);
        } else {
            arg0.field2781.method943(arg1, arg2, arg3);
        }
        if (arg0.field2781.method1095()) {
            this.field2724.field2752.method935(arg0.field2781);
        }
        arg0.method3090();
        if (arg0.field2780 >= 0) {
            arg0.method3261();
            if (arg0.field2762 > 0 && this.field2735[arg0.field2764][arg0.field2762] == arg0) {
                this.field2735[arg0.field2764][arg0.field2762] = null;
            }
        }
        return true;
    }
}
