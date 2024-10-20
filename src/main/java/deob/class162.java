package deob;

@ObfuscatedName("fk")
public class class162 extends class60 {

    @ObfuscatedName("fk.b")
    public class174 field2728 = new class174(128);

    @ObfuscatedName("fk.u")
    public int field2713 = 256;

    @ObfuscatedName("fk.x")
    public int field2714 = 1000000;

    @ObfuscatedName("fk.j")
    public int[] field2735 = new int[16];

    @ObfuscatedName("fk.o")
    public int[] field2727 = new int[16];

    @ObfuscatedName("fk.n")
    public int[] field2717 = new int[16];

    @ObfuscatedName("fk.y")
    public int[] field2715 = new int[16];

    @ObfuscatedName("fk.f")
    public int[] field2712 = new int[16];

    @ObfuscatedName("fk.p")
    public int[] field2729 = new int[16];

    @ObfuscatedName("fk.l")
    public int[] field2721 = new int[16];

    @ObfuscatedName("fk.k")
    public int[] field2722 = new int[16];

    @ObfuscatedName("fk.q")
    public int[] field2723 = new int[16];

    @ObfuscatedName("fk.a")
    public int[] field2725 = new int[16];

    @ObfuscatedName("fk.w")
    public int[] field2726 = new int[16];

    @ObfuscatedName("fk.z")
    public int[] field2732 = new int[16];

    @ObfuscatedName("fk.v")
    public int[] field2719 = new int[16];

    @ObfuscatedName("fk.s")
    public int[] field2733 = new int[16];

    @ObfuscatedName("fk.r")
    public int[] field2730 = new int[16];

    @ObfuscatedName("fk.d")
    public class165[][] field2731 = new class165[16][128];

    @ObfuscatedName("fk.al")
    public class165[][] field2720 = new class165[16][128];

    @ObfuscatedName("fk.ab")
    public class160 field2716 = new class160();

    @ObfuscatedName("fk.au")
    public boolean field2741;

    @ObfuscatedName("fk.az")
    public int field2734;

    @ObfuscatedName("fk.ai")
    public int field2736;

    @ObfuscatedName("fk.ay")
    public long field2718;

    @ObfuscatedName("fk.ar")
    public long field2738;

    @ObfuscatedName("fk.af")
    public class164 field2739 = new class164(this);

    public class162() {
        this.method3063();
    }

    @ObfuscatedName("fk.b(II)V")
    public synchronized void method3020(int arg0) {
        this.field2713 = arg0;
    }

    @ObfuscatedName("fk.u(I)I")
    public int method2998() {
        return this.field2713;
    }

    @ObfuscatedName("fk.x(Lfn;Leg;Lbm;II)Z")
    public synchronized boolean method2999(class158 arg0, class146 arg1, class53 arg2, int arg3) {
        arg0.method2917();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class175 var7 = (class175) arg0.field2680.method3150(); var7 != null; var7 = (class175) arg0.field2680.method3151()) {
            int var8 = (int) var7.field2861;
            class159 var9 = (class159) this.field2728.method3157((long) var8);
            if (var9 == null) {
                var9 = class159.method2537(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field2728.method3147(var9, (long) var8);
            }
            if (!var9.method2925(arg2, var7.field2844, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method2918();
        }
        return var5;
    }

    @ObfuscatedName("fk.j(B)V")
    public synchronized void method3087() {
        for (class159 var1 = (class159) this.field2728.method3150(); var1 != null; var1 = (class159) this.field2728.method3151()) {
            var1.method2927();
        }
    }

    @ObfuscatedName("fk.o(I)V")
    public synchronized void method3030() {
        for (class159 var1 = (class159) this.field2728.method3150(); var1 != null; var1 = (class159) this.field2728.method3151()) {
            var1.method3260();
        }
    }

    @ObfuscatedName("fk.l(Lfn;ZI)V")
    public synchronized void method3002(class158 arg0, boolean arg1) {
        this.method3003();
        this.field2716.method2970(arg0.field2681);
        this.field2741 = arg1;
        this.field2718 = 0L;
        int var3 = this.field2716.method2935();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2716.method2936(var4);
            this.field2716.method2939(var4);
            this.field2716.method2937(var4);
        }
        this.field2734 = this.field2716.method2944();
        this.field2736 = this.field2716.field2703[this.field2734];
        this.field2738 = this.field2716.method2945(this.field2736);
    }

    @ObfuscatedName("fk.q(I)V")
    public synchronized void method3003() {
        this.field2716.method2933();
        this.method3063();
    }

    @ObfuscatedName("fk.e(B)Z")
    public synchronized boolean method3004() {
        return this.field2716.method2934();
    }

    @ObfuscatedName("fk.t(III)V")
    public synchronized void method3028(int arg0, int arg1) {
        this.method3073(arg0, arg1);
    }

    @ObfuscatedName("fk.g(III)V")
    public void method3073(int arg0, int arg1) {
        this.field2715[arg0] = arg1;
        this.field2729[arg0] = arg1 & 0xFFFFFF80;
        this.method3045(arg0, arg1);
    }

    @ObfuscatedName("fk.c(III)V")
    public void method3045(int arg0, int arg1) {
        if (this.field2712[arg0] != arg1) {
            this.field2712[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2720[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("fk.m(IIIB)V")
    public void method3069(int arg0, int arg1, int arg2) {
        this.method3088(arg0, arg1, 64);
        if ((this.field2725[arg0] & 0x2) != 0) {
            for (class165 var4 = (class165) this.field2739.field2758.method3186(); var4 != null; var4 = (class165) this.field2739.field2758.method3188()) {
                if (var4.field2780 == arg0 && var4.field2776 < 0) {
                    this.field2731[arg0][var4.field2770] = null;
                    this.field2731[arg0][arg1] = var4;
                    int var5 = (var4.field2772 * var4.field2771 >> 12) + var4.field2762;
                    var4.field2762 += arg1 - var4.field2770 << 8;
                    var4.field2771 = var5 - var4.field2762;
                    var4.field2772 = 4096;
                    var4.field2770 = arg1;
                    return;
                }
            }
        }
        class159 var6 = (class159) this.field2728.method3157((long) this.field2712[arg0]);
        if (var6 == null) {
            return;
        }
        class56 var7 = var6.field2687[arg1];
        if (var7 == null) {
            return;
        }
        class165 var8 = new class165();
        var8.field2780 = arg0;
        var8.field2763 = var6;
        var8.field2765 = var7;
        var8.field2782 = var6.field2682[arg1];
        var8.field2766 = var6.field2683[arg1];
        var8.field2770 = arg1;
        var8.field2768 = var6.field2685 * arg2 * arg2 * var6.field2688[arg1] + 1024 >> 11;
        var8.field2769 = var6.field2686[arg1] & 0xFF;
        var8.field2762 = (arg1 << 8) - (var6.field2684[arg1] & 0x7FFF);
        var8.field2773 = 0;
        var8.field2767 = 0;
        var8.field2774 = 0;
        var8.field2776 = -1;
        var8.field2764 = 0;
        if (this.field2719[arg0] == 0) {
            var8.field2775 = class58.method1091(var7, this.method3037(var8), this.method3021(var8), this.method3024(var8));
        } else {
            var8.field2775 = class58.method1091(var7, this.method3037(var8), 0, this.method3024(var8));
            this.method3009(var8, var6.field2684[arg1] < 0);
        }
        if (var6.field2684[arg1] < 0) {
            var8.field2775.method1197(-1);
        }
        if (var8.field2766 >= 0) {
            class165 var9 = this.field2720[arg0][var8.field2766];
            if (var9 != null && var9.field2776 < 0) {
                this.field2731[arg0][var9.field2770] = null;
                var9.field2776 = 0;
            }
            this.field2720[arg0][var8.field2766] = var8;
        }
        this.field2739.field2758.method3180(var8);
        this.field2731[arg0][arg1] = var8;
    }

    @ObfuscatedName("fk.i(Lfu;ZI)V")
    public void method3009(class165 arg0, boolean arg1) {
        int var3 = arg0.field2765.field1126.length;
        int var5;
        if (arg1 && arg0.field2765.field1129) {
            int var4 = var3 + var3 - arg0.field2765.field1125;
            var5 = (int) ((long) this.field2719[arg0.field2780] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2775.method1127(true);
            }
        } else {
            var5 = (int) ((long) this.field2719[arg0.field2780] * (long) var3 >> 6);
        }
        arg0.field2775.method1175(var5);
    }

    @ObfuscatedName("fk.h(IIII)V")
    public void method3088(int arg0, int arg1, int arg2) {
        class165 var4 = this.field2731[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2731[arg0][arg1] = null;
        if ((this.field2725[arg0] & 0x2) == 0) {
            var4.field2776 = 0;
            return;
        }
        for (class165 var5 = (class165) this.field2739.field2758.method3185(); var5 != null; var5 = (class165) this.field2739.field2758.method3187()) {
            if (var4.field2780 == var5.field2780 && var5.field2776 < 0 && var4 != var5) {
                var4.field2776 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("fk.a(IIII)V")
    public void method3010(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("fk.w(III)V")
    public void method3011(int arg0, int arg1) {
    }

    @ObfuscatedName("fk.z(III)V")
    public void method3012(int arg0, int arg1) {
        this.field2721[arg0] = arg1;
    }

    @ObfuscatedName("fk.v(II)V")
    public void method3013(int arg0) {
        for (class165 var2 = (class165) this.field2739.field2758.method3185(); var2 != null; var2 = (class165) this.field2739.field2758.method3187()) {
            if (arg0 < 0 || var2.field2780 == arg0) {
                if (var2.field2775 != null) {
                    var2.field2775.method1111(Statics.field1087 / 100);
                    if (var2.field2775.method1106()) {
                        this.field2739.field2756.method978(var2.field2775);
                    }
                    var2.method3102();
                }
                if (var2.field2776 < 0) {
                    this.field2731[var2.field2780][var2.field2770] = null;
                }
                var2.method3260();
            }
        }
    }

    @ObfuscatedName("fk.ac(II)V")
    public void method3014(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3014(var2);
            }
            return;
        }
        this.field2735[arg0] = 12800;
        this.field2727[arg0] = 8192;
        this.field2717[arg0] = 16383;
        this.field2721[arg0] = 8192;
        this.field2722[arg0] = 0;
        this.field2723[arg0] = 8192;
        this.method3017(arg0);
        this.method3079(arg0);
        this.field2725[arg0] = 0;
        this.field2726[arg0] = 32767;
        this.field2732[arg0] = 256;
        this.field2719[arg0] = 0;
        this.method3075(arg0, 8192);
    }

    @ObfuscatedName("fk.aa(II)V")
    public void method3015(int arg0) {
        for (class165 var2 = (class165) this.field2739.field2758.method3185(); var2 != null; var2 = (class165) this.field2739.field2758.method3187()) {
            if ((arg0 < 0 || var2.field2780 == arg0) && var2.field2776 < 0) {
                this.field2731[var2.field2780][var2.field2770] = null;
                var2.field2776 = 0;
            }
        }
    }

    @ObfuscatedName("fk.aw(I)V")
    public void method3063() {
        this.method3013(-1);
        this.method3014(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2712[var1] = this.field2715[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2729[var2] = this.field2715[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("fk.ao(IB)V")
    public void method3017(int arg0) {
        if ((this.field2725[arg0] & 0x2) == 0) {
            return;
        }
        for (class165 var2 = (class165) this.field2739.field2758.method3185(); var2 != null; var2 = (class165) this.field2739.field2758.method3187()) {
            if (var2.field2780 == arg0 && this.field2731[arg0][var2.field2770] == null && var2.field2776 < 0) {
                var2.field2776 = 0;
            }
        }
    }

    @ObfuscatedName("fk.aq(IB)V")
    public void method3079(int arg0) {
        if ((this.field2725[arg0] & 0x4) == 0) {
            return;
        }
        for (class165 var2 = (class165) this.field2739.field2758.method3185(); var2 != null; var2 = (class165) this.field2739.field2758.method3187()) {
            if (var2.field2780 == arg0) {
                var2.field2779 = 0;
            }
        }
    }

    @ObfuscatedName("fk.am(II)V")
    public void method3064(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3088(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3069(var6, var7, var8);
            } else {
                this.method3088(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3010(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2729[var12] = (var14 << 14) + (this.field2729[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2729[var12] = (var14 << 7) + (this.field2729[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2722[var12] = (var14 << 7) + (this.field2722[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2722[var12] = (this.field2722[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2723[var12] = (var14 << 7) + (this.field2723[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2723[var12] = (this.field2723[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2735[var12] = (var14 << 7) + (this.field2735[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2735[var12] = (this.field2735[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2727[var12] = (var14 << 7) + (this.field2727[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2727[var12] = (this.field2727[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2717[var12] = (var14 << 7) + (this.field2717[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2717[var12] = (this.field2717[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2725[var12] |= 0x1;
                } else {
                    this.field2725[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2725[var12] |= 0x2;
                } else {
                    this.method3017(var12);
                    this.field2725[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2726[var12] = (var14 << 7) + (this.field2726[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2726[var12] = (this.field2726[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2726[var12] = (var14 << 7) + (this.field2726[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2726[var12] = (this.field2726[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3013(var12);
            }
            if (var13 == 121) {
                this.method3014(var12);
            }
            if (var13 == 123) {
                this.method3015(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2726[var12];
                if (var15 == 16384) {
                    this.field2732[var12] = (var14 << 7) + (this.field2732[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2726[var12];
                if (var16 == 16384) {
                    this.field2732[var12] = (this.field2732[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2719[var12] = (var14 << 7) + (this.field2719[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2719[var12] = (this.field2719[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2725[var12] |= 0x4;
                } else {
                    this.method3079(var12);
                    this.field2725[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3075(var12, (var14 << 7) + (this.field2733[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3075(var12, (this.field2733[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3045(var17, this.field2729[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3011(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method3012(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3063();
            }
        }
    }

    @ObfuscatedName("fk.at(III)V")
    public void method3075(int arg0, int arg1) {
        this.field2733[arg0] = arg1;
        this.field2730[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("fk.an(Lfu;I)I")
    public int method3037(class165 arg0) {
        int var2 = (arg0.field2772 * arg0.field2771 >> 12) + arg0.field2762;
        int var3 = ((this.field2721[arg0.field2780] - 8192) * this.field2732[arg0.field2780] >> 12) + var2;
        class163 var4 = arg0.field2782;
        if (var4.field2749 > 0 && (var4.field2748 > 0 || this.field2722[arg0.field2780] > 0)) {
            int var5 = var4.field2748 << 2;
            int var6 = var4.field2750 << 1;
            if (arg0.field2778 < var6) {
                var5 = arg0.field2778 * var5 / var6;
            }
            int var7 = (this.field2722[arg0.field2780] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2783 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2765.field1127 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1087 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("fk.ax(Lfu;B)I")
    public int method3021(class165 arg0) {
        class163 var2 = arg0.field2782;
        int var3 = this.field2735[arg0.field2780] * this.field2717[arg0.field2780] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2768 * var4 + 16384 >> 15;
        int var6 = this.field2713 * var5 + 128 >> 8;
        if (var2.field2753 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2773 * 1.953125E-5D * (double) var2.field2753) + 0.5D);
        }
        if (var2.field2744 != null) {
            int var7 = arg0.field2767;
            int var8 = var2.field2744[arg0.field2774 + 1];
            if (arg0.field2774 < var2.field2744.length - 2) {
                int var9 = (var2.field2744[arg0.field2774] & 0xFF) << 8;
                int var10 = (var2.field2744[arg0.field2774 + 2] & 0xFF) << 8;
                var8 += (var2.field2744[arg0.field2774 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2776 > 0 && var2.field2743 != null) {
            int var11 = arg0.field2776;
            int var12 = var2.field2743[arg0.field2764 + 1];
            if (arg0.field2764 < var2.field2743.length - 2) {
                int var13 = (var2.field2743[arg0.field2764] & 0xFF) << 8;
                int var14 = (var2.field2743[arg0.field2764 + 2] & 0xFF) << 8;
                var12 += (var2.field2743[arg0.field2764 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("fk.ah(Lfu;B)I")
    public int method3024(class165 arg0) {
        int var2 = this.field2727[arg0.field2780];
        return var2 < 8192 ? arg0.field2769 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2769) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("fk.n()Lbl;")
    public synchronized class60 method952() {
        return this.field2739;
    }

    @ObfuscatedName("fk.y()Lbl;")
    public synchronized class60 method942() {
        return null;
    }

    @ObfuscatedName("fk.f()I")
    public synchronized int method943() {
        return 0;
    }

    @ObfuscatedName("fk.p([III)V")
    public synchronized void method944(int[] arg0, int arg1, int arg2) {
        if (this.field2716.method2934()) {
            int var4 = this.field2714 * this.field2716.field2693 / Statics.field1087;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2718;
                if (this.field2738 - var5 >= 0L) {
                    this.field2718 = var5;
                    break;
                }
                int var7 = (int) ((this.field2738 - this.field2718 + (long) var4 - 1L) / (long) var4);
                this.field2718 += (long) var4 * (long) var7;
                this.field2739.method944(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3058();
            } while (this.field2716.method2934());
        }
        this.field2739.method944(arg0, arg1, arg2);
    }

    @ObfuscatedName("fk.k(I)V")
    public synchronized void method969(int arg0) {
        if (this.field2716.method2934()) {
            int var2 = this.field2714 * this.field2716.field2693 / Statics.field1087;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2718;
                if (this.field2738 - var3 >= 0L) {
                    this.field2718 = var3;
                    break;
                }
                int var5 = (int) ((this.field2738 - this.field2718 + (long) var2 - 1L) / (long) var2);
                this.field2718 += (long) var2 * (long) var5;
                this.field2739.method969(var5);
                arg0 -= var5;
                this.method3058();
            } while (this.field2716.method2934());
        }
        this.field2739.method969(arg0);
    }

    @ObfuscatedName("fk.ad(I)V")
    public void method3058() {
        int var1 = this.field2734;
        int var2 = this.field2736;
        long var3 = this.field2738;
        while (this.field2736 == var2) {
            while (this.field2716.field2703[var1] == var2) {
                this.field2716.method2936(var1);
                int var5 = this.field2716.method2932(var1);
                if (var5 == 1) {
                    this.field2716.method2958();
                    this.field2716.method2937(var1);
                    if (this.field2716.method2955()) {
                        if (!this.field2741 || var2 == 0) {
                            this.method3063();
                            this.field2716.method2933();
                            return;
                        }
                        this.field2716.method2946(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3064(var5);
                }
                this.field2716.method2939(var1);
                this.field2716.method2937(var1);
            }
            var1 = this.field2716.method2944();
            var2 = this.field2716.field2703[var1];
            var3 = this.field2716.method2945(var2);
        }
        this.field2734 = var1;
        this.field2736 = var2;
        this.field2738 = var3;
    }

    @ObfuscatedName("fk.bm(Lfu;I)Z")
    public boolean method3026(class165 arg0) {
        if (arg0.field2775 != null) {
            return false;
        }
        if (arg0.field2776 >= 0) {
            arg0.method3260();
            if (arg0.field2766 > 0 && this.field2720[arg0.field2780][arg0.field2766] == arg0) {
                this.field2720[arg0.field2780][arg0.field2766] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("fk.bs(Lfu;[IIII)Z")
    public boolean method3027(class165 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2781 = Statics.field1087 / 100;
        if (arg0.field2776 >= 0 && arg0.field2775 == null || arg0.field2775.method1105()) {
            arg0.method3102();
            arg0.method3260();
            if (arg0.field2766 > 0 && this.field2720[arg0.field2780][arg0.field2766] == arg0) {
                this.field2720[arg0.field2780][arg0.field2766] = null;
            }
            return true;
        }
        int var5 = arg0.field2772;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2723[arg0.field2780] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2772 = var6;
        }
        arg0.field2775.method1103(this.method3037(arg0));
        class163 var7 = arg0.field2782;
        boolean var8 = false;
        arg0.field2778++;
        arg0.field2783 += var7.field2749;
        double var9 = (double) ((arg0.field2770 - 60 << 8) + (arg0.field2772 * arg0.field2771 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2753 > 0) {
            if (var7.field2747 > 0) {
                arg0.field2773 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2747 * var9) + 0.5D);
            } else {
                arg0.field2773 += 128;
            }
        }
        if (var7.field2744 != null) {
            if (var7.field2755 > 0) {
                arg0.field2767 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2755 * var9) + 0.5D);
            } else {
                arg0.field2767 += 128;
            }
            while (arg0.field2774 < var7.field2744.length - 2 && arg0.field2767 > (var7.field2744[arg0.field2774 + 2] & 0xFF) << 8) {
                arg0.field2774 += 2;
            }
            if (arg0.field2774 == var7.field2744.length - 2 && var7.field2744[arg0.field2774 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2776 >= 0 && var7.field2743 != null && (this.field2725[arg0.field2780] & 0x1) == 0 && (arg0.field2766 < 0 || this.field2720[arg0.field2780][arg0.field2766] != arg0)) {
            if (var7.field2746 > 0) {
                arg0.field2776 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2746 * var9) + 0.5D);
            } else {
                arg0.field2776 += 128;
            }
            while (arg0.field2764 < var7.field2743.length - 2 && arg0.field2776 > (var7.field2743[arg0.field2764 + 2] & 0xFF) << 8) {
                arg0.field2764 += 2;
            }
            if (arg0.field2764 == var7.field2743.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2775.method1102(arg0.field2781, this.method3021(arg0), this.method3024(arg0));
            return false;
        }
        arg0.field2775.method1111(arg0.field2781);
        if (arg1 == null) {
            arg0.field2775.method969(arg3);
        } else {
            arg0.field2775.method944(arg1, arg2, arg3);
        }
        if (arg0.field2775.method1106()) {
            this.field2739.field2756.method978(arg0.field2775);
        }
        arg0.method3102();
        if (arg0.field2776 >= 0) {
            arg0.method3260();
            if (arg0.field2766 > 0 && this.field2720[arg0.field2780][arg0.field2766] == arg0) {
                this.field2720[arg0.field2780][arg0.field2766] = null;
            }
        }
        return true;
    }
}
