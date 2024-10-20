package deob;

@ObfuscatedName("ft")
public class class162 extends class60 {

    @ObfuscatedName("ft.e")
    public class174 field2737 = new class174(128);

    @ObfuscatedName("ft.o")
    public int field2712 = 256;

    @ObfuscatedName("ft.y")
    public int field2729 = 1000000;

    @ObfuscatedName("ft.b")
    public int[] field2714 = new int[16];

    @ObfuscatedName("ft.r")
    public int[] field2715 = new int[16];

    @ObfuscatedName("ft.l")
    public int[] field2728 = new int[16];

    @ObfuscatedName("ft.s")
    public int[] field2719 = new int[16];

    @ObfuscatedName("ft.f")
    public int[] field2718 = new int[16];

    @ObfuscatedName("ft.x")
    public int[] field2723 = new int[16];

    @ObfuscatedName("ft.h")
    public int[] field2713 = new int[16];

    @ObfuscatedName("ft.a")
    public int[] field2721 = new int[16];

    @ObfuscatedName("ft.u")
    public int[] field2722 = new int[16];

    @ObfuscatedName("ft.j")
    public int[] field2724 = new int[16];

    @ObfuscatedName("ft.z")
    public int[] field2725 = new int[16];

    @ObfuscatedName("ft.t")
    public int[] field2711 = new int[16];

    @ObfuscatedName("ft.c")
    public int[] field2727 = new int[16];

    @ObfuscatedName("ft.q")
    public int[] field2740 = new int[16];

    @ObfuscatedName("ft.g")
    public int[] field2720 = new int[16];

    @ObfuscatedName("ft.m")
    public class165[][] field2730 = new class165[16][128];

    @ObfuscatedName("ft.ay")
    public class165[][] field2731 = new class165[16][128];

    @ObfuscatedName("ft.ae")
    public class160 field2732 = new class160();

    @ObfuscatedName("ft.af")
    public boolean field2733;

    @ObfuscatedName("ft.ab")
    public int field2734;

    @ObfuscatedName("ft.ao")
    public int field2735;

    @ObfuscatedName("ft.ak")
    public long field2726;

    @ObfuscatedName("ft.ah")
    public long field2736;

    @ObfuscatedName("ft.ai")
    public class164 field2738 = new class164(this);

    public class162() {
        this.method2955();
    }

    @ObfuscatedName("ft.e(IB)V")
    public synchronized void method2960(int arg0) {
        this.field2712 = arg0;
    }

    @ObfuscatedName("ft.o(I)I")
    public int method2938() {
        return this.field2712;
    }

    @ObfuscatedName("ft.y(Lfo;Lez;Lbw;II)Z")
    public synchronized boolean method2958(class158 arg0, class146 arg1, class53 arg2, int arg3) {
        arg0.method2857();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class175 var7 = (class175) arg0.field2672.method3096(); var7 != null; var7 = (class175) arg0.field2672.method3093()) {
            int var8 = (int) var7.field2874;
            class159 var9 = (class159) this.field2737.method3092((long) var8);
            if (var9 == null) {
                var9 = class159.method698(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field2737.method3091(var9, (long) var8);
            }
            if (!var9.method2872(arg2, var7.field2852, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method2864();
        }
        return var5;
    }

    @ObfuscatedName("ft.b(I)V")
    public synchronized void method2940() {
        for (class159 var1 = (class159) this.field2737.method3096(); var1 != null; var1 = (class159) this.field2737.method3093()) {
            var1.method2867();
        }
    }

    @ObfuscatedName("ft.w(I)V")
    public synchronized void method2941() {
        for (class159 var1 = (class159) this.field2737.method3096(); var1 != null; var1 = (class159) this.field2737.method3093()) {
            var1.method3204();
        }
    }

    @ObfuscatedName("ft.x(Lfo;ZI)V")
    public synchronized void method2942(class158 arg0, boolean arg1) {
        this.method3012();
        this.field2732.method2876(arg0.field2671);
        this.field2733 = arg1;
        this.field2726 = 0L;
        int var3 = this.field2732.method2922();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2732.method2896(var4);
            this.field2732.method2882(var4);
            this.field2732.method2880(var4);
        }
        this.field2734 = this.field2732.method2887();
        this.field2735 = this.field2732.field2691[this.field2734];
        this.field2736 = this.field2732.method2886(this.field2735);
    }

    @ObfuscatedName("ft.a(B)V")
    public synchronized void method3012() {
        this.field2732.method2926();
        this.method2955();
    }

    @ObfuscatedName("ft.u(S)Z")
    public synchronized boolean method3001() {
        return this.field2732.method2903();
    }

    @ObfuscatedName("ft.v(IIB)V")
    public synchronized void method2944(int arg0, int arg1) {
        this.method2945(arg0, arg1);
    }

    @ObfuscatedName("ft.i(IIB)V")
    public void method2945(int arg0, int arg1) {
        this.field2719[arg0] = arg1;
        this.field2723[arg0] = arg1 & 0xFFFFFF80;
        this.method2936(arg0, arg1);
    }

    @ObfuscatedName("ft.n(III)V")
    public void method2936(int arg0, int arg1) {
        if (this.field2718[arg0] != arg1) {
            this.field2718[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2731[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("ft.d(IIIB)V")
    public void method2952(int arg0, int arg1, int arg2) {
        this.method2949(arg0, arg1, 64);
        if ((this.field2724[arg0] & 0x2) != 0) {
            for (class165 var4 = (class165) this.field2738.field2758.method3128(); var4 != null; var4 = (class165) this.field2738.field2758.method3125()) {
                if (var4.field2778 == arg0 && var4.field2780 < 0) {
                    this.field2730[arg0][var4.field2766] = null;
                    this.field2730[arg0][arg1] = var4;
                    int var5 = (var4.field2771 * var4.field2770 >> 12) + var4.field2769;
                    var4.field2769 += arg1 - var4.field2766 << 8;
                    var4.field2770 = var5 - var4.field2769;
                    var4.field2771 = 4096;
                    var4.field2766 = arg1;
                    return;
                }
            }
        }
        class159 var6 = (class159) this.field2737.method3092((long) this.field2718[arg0]);
        if (var6 == null) {
            return;
        }
        class56 var7 = var6.field2680[arg1];
        if (var7 == null) {
            return;
        }
        class165 var8 = new class165();
        var8.field2778 = arg0;
        var8.field2762 = var6;
        var8.field2779 = var7;
        var8.field2764 = var6.field2678[arg1];
        var8.field2776 = var6.field2682[arg1];
        var8.field2766 = arg1;
        var8.field2767 = var6.field2679 * arg2 * arg2 * var6.field2673[arg1] + 1024 >> 11;
        var8.field2768 = var6.field2677[arg1] & 0xFF;
        var8.field2769 = (arg1 << 8) - (var6.field2675[arg1] & 0x7FFF);
        var8.field2772 = 0;
        var8.field2773 = 0;
        var8.field2774 = 0;
        var8.field2780 = -1;
        var8.field2761 = 0;
        if (this.field2727[arg0] == 0) {
            var8.field2784 = class58.method1083(var7, this.method3002(var8), this.method2961(var8), this.method2962(var8));
        } else {
            var8.field2784 = class58.method1083(var7, this.method3002(var8), 0, this.method2962(var8));
            this.method2948(var8, var6.field2675[arg1] < 0);
        }
        if (var6.field2675[arg1] < 0) {
            var8.field2784.method1085(-1);
        }
        if (var8.field2776 >= 0) {
            class165 var9 = this.field2731[arg0][var8.field2776];
            if (var9 != null && var9.field2780 < 0) {
                this.field2730[arg0][var9.field2766] = null;
                var9.field2780 = 0;
            }
            this.field2731[arg0][var8.field2776] = var8;
        }
        this.field2738.field2758.method3117(var8);
        this.field2730[arg0][arg1] = var8;
    }

    @ObfuscatedName("ft.k(Lfb;ZI)V")
    public void method2948(class165 arg0, boolean arg1) {
        int var3 = arg0.field2779.field1136.length;
        int var5;
        if (arg1 && arg0.field2779.field1139) {
            int var4 = var3 + var3 - arg0.field2779.field1137;
            var5 = (int) ((long) this.field2727[arg0.field2778] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2784.method1091(true);
            }
        } else {
            var5 = (int) ((long) this.field2727[arg0.field2778] * (long) var3 >> 6);
        }
        arg0.field2784.method1215(var5);
    }

    @ObfuscatedName("ft.p(IIIB)V")
    public void method2949(int arg0, int arg1, int arg2) {
        class165 var4 = this.field2730[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2730[arg0][arg1] = null;
        if ((this.field2724[arg0] & 0x2) == 0) {
            var4.field2780 = 0;
            return;
        }
        for (class165 var5 = (class165) this.field2738.field2758.method3122(); var5 != null; var5 = (class165) this.field2738.field2758.method3124()) {
            if (var4.field2778 == var5.field2778 && var5.field2780 < 0 && var4 != var5) {
                var4.field2780 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("ft.j(IIII)V")
    public void method2950(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("ft.z(III)V")
    public void method2970(int arg0, int arg1) {
    }

    @ObfuscatedName("ft.t(III)V")
    public void method2946(int arg0, int arg1) {
        this.field2713[arg0] = arg1;
    }

    @ObfuscatedName("ft.c(II)V")
    public void method3025(int arg0) {
        for (class165 var2 = (class165) this.field2738.field2758.method3122(); var2 != null; var2 = (class165) this.field2738.field2758.method3124()) {
            if (arg0 < 0 || var2.field2778 == arg0) {
                if (var2.field2784 != null) {
                    var2.field2784.method1095(Statics.field1095 / 100);
                    if (var2.field2784.method1135()) {
                        this.field2738.field2757.method923(var2.field2784);
                    }
                    var2.method3051();
                }
                if (var2.field2780 < 0) {
                    this.field2730[var2.field2778][var2.field2766] = null;
                }
                var2.method3204();
            }
        }
    }

    @ObfuscatedName("ft.q(II)V")
    public void method3030(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3030(var2);
            }
            return;
        }
        this.field2714[arg0] = 12800;
        this.field2715[arg0] = 8192;
        this.field2728[arg0] = 16383;
        this.field2713[arg0] = 8192;
        this.field2721[arg0] = 0;
        this.field2722[arg0] = 8192;
        this.method2956(arg0);
        this.method2957(arg0);
        this.field2724[arg0] = 0;
        this.field2725[arg0] = 32767;
        this.field2711[arg0] = 256;
        this.field2727[arg0] = 0;
        this.method3015(arg0, 8192);
    }

    @ObfuscatedName("ft.g(IB)V")
    public void method2989(int arg0) {
        for (class165 var2 = (class165) this.field2738.field2758.method3122(); var2 != null; var2 = (class165) this.field2738.field2758.method3124()) {
            if ((arg0 < 0 || var2.field2778 == arg0) && var2.field2780 < 0) {
                this.field2730[var2.field2778][var2.field2766] = null;
                var2.field2780 = 0;
            }
        }
    }

    @ObfuscatedName("ft.m(I)V")
    public void method2955() {
        this.method3025(-1);
        this.method3030(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2718[var1] = this.field2719[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2723[var2] = this.field2719[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("ft.av(II)V")
    public void method2956(int arg0) {
        if ((this.field2724[arg0] & 0x2) == 0) {
            return;
        }
        for (class165 var2 = (class165) this.field2738.field2758.method3122(); var2 != null; var2 = (class165) this.field2738.field2758.method3124()) {
            if (var2.field2778 == arg0 && this.field2730[arg0][var2.field2766] == null && var2.field2780 < 0) {
                var2.field2780 = 0;
            }
        }
    }

    @ObfuscatedName("ft.ap(II)V")
    public void method2957(int arg0) {
        if ((this.field2724[arg0] & 0x4) == 0) {
            return;
        }
        for (class165 var2 = (class165) this.field2738.field2758.method3122(); var2 != null; var2 = (class165) this.field2738.field2758.method3124()) {
            if (var2.field2778 == arg0) {
                var2.field2781 = 0;
            }
        }
    }

    @ObfuscatedName("ft.au(II)V")
    public void method2982(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method2949(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method2952(var6, var7, var8);
            } else {
                this.method2949(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method2950(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2723[var12] = (var14 << 14) + (this.field2723[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2723[var12] = (var14 << 7) + (this.field2723[var12] & 0xFFFFC07F);
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
                this.field2715[var12] = (var14 << 7) + (this.field2715[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2715[var12] = (this.field2715[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2728[var12] = (var14 << 7) + (this.field2728[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2728[var12] = (this.field2728[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2724[var12] |= 0x1;
                } else {
                    this.field2724[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2724[var12] |= 0x2;
                } else {
                    this.method2956(var12);
                    this.field2724[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2725[var12] = (var14 << 7) + (this.field2725[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2725[var12] = (this.field2725[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2725[var12] = (var14 << 7) + (this.field2725[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2725[var12] = (this.field2725[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3025(var12);
            }
            if (var13 == 121) {
                this.method3030(var12);
            }
            if (var13 == 123) {
                this.method2989(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2725[var12];
                if (var15 == 16384) {
                    this.field2711[var12] = (var14 << 7) + (this.field2711[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2725[var12];
                if (var16 == 16384) {
                    this.field2711[var12] = (this.field2711[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2727[var12] = (var14 << 7) + (this.field2727[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2727[var12] = (this.field2727[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2724[var12] |= 0x4;
                } else {
                    this.method2957(var12);
                    this.field2724[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3015(var12, (var14 << 7) + (this.field2740[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3015(var12, (this.field2740[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method2936(var17, this.field2723[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method2970(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method2946(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method2955();
            }
        }
    }

    @ObfuscatedName("ft.aq(IIB)V")
    public void method3015(int arg0, int arg1) {
        this.field2740[arg0] = arg1;
        this.field2720[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("ft.at(Lfb;I)I")
    public int method3002(class165 arg0) {
        int var2 = (arg0.field2771 * arg0.field2770 >> 12) + arg0.field2769;
        int var3 = ((this.field2713[arg0.field2778] - 8192) * this.field2711[arg0.field2778] >> 12) + var2;
        class163 var4 = arg0.field2764;
        if (var4.field2750 > 0 && (var4.field2749 > 0 || this.field2721[arg0.field2778] > 0)) {
            int var5 = var4.field2749 << 2;
            int var6 = var4.field2751 << 1;
            if (arg0.field2777 < var6) {
                var5 = arg0.field2777 * var5 / var6;
            }
            int var7 = (this.field2721[arg0.field2778] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2763 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2779.field1138 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1095 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("ft.ag(Lfb;S)I")
    public int method2961(class165 arg0) {
        class163 var2 = arg0.field2764;
        int var3 = this.field2728[arg0.field2778] * this.field2714[arg0.field2778] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2767 * var4 + 16384 >> 15;
        int var6 = this.field2712 * var5 + 128 >> 8;
        if (var2.field2752 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2772 * 1.953125E-5D * (double) var2.field2752) + 0.5D);
        }
        if (var2.field2754 != null) {
            int var7 = arg0.field2773;
            int var8 = var2.field2754[arg0.field2774 + 1];
            if (arg0.field2774 < var2.field2754.length - 2) {
                int var9 = (var2.field2754[arg0.field2774] & 0xFF) << 8;
                int var10 = (var2.field2754[arg0.field2774 + 2] & 0xFF) << 8;
                var8 += (var2.field2754[arg0.field2774 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2780 > 0 && var2.field2748 != null) {
            int var11 = arg0.field2780;
            int var12 = var2.field2748[arg0.field2761 + 1];
            if (arg0.field2761 < var2.field2748.length - 2) {
                int var13 = (var2.field2748[arg0.field2761] & 0xFF) << 8;
                int var14 = (var2.field2748[arg0.field2761 + 2] & 0xFF) << 8;
                var12 += (var2.field2748[arg0.field2761 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("ft.aw(Lfb;I)I")
    public int method2962(class165 arg0) {
        int var2 = this.field2715[arg0.field2778];
        return var2 < 8192 ? arg0.field2768 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2768) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("ft.r()Lbc;")
    public synchronized class60 method942() {
        return this.field2738;
    }

    @ObfuscatedName("ft.l()Lbc;")
    public synchronized class60 method933() {
        return null;
    }

    @ObfuscatedName("ft.s()I")
    public synchronized int method930() {
        return 0;
    }

    @ObfuscatedName("ft.f([III)V")
    public synchronized void method931(int[] arg0, int arg1, int arg2) {
        if (this.field2732.method2903()) {
            int var4 = this.field2729 * this.field2732.field2690 / Statics.field1095;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2726;
                if (this.field2736 - var5 >= 0L) {
                    this.field2726 = var5;
                    break;
                }
                int var7 = (int) ((this.field2736 - this.field2726 + (long) var4 - 1L) / (long) var4);
                this.field2726 += (long) var4 * (long) var7;
                this.field2738.method931(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method2964();
            } while (this.field2732.method2903());
        }
        this.field2738.method931(arg0, arg1, arg2);
    }

    @ObfuscatedName("ft.h(I)V")
    public synchronized void method959(int arg0) {
        if (this.field2732.method2903()) {
            int var2 = this.field2729 * this.field2732.field2690 / Statics.field1095;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2726;
                if (this.field2736 - var3 >= 0L) {
                    this.field2726 = var3;
                    break;
                }
                int var5 = (int) ((this.field2736 - this.field2726 + (long) var2 - 1L) / (long) var2);
                this.field2726 += (long) var2 * (long) var5;
                this.field2738.method959(var5);
                arg0 -= var5;
                this.method2964();
            } while (this.field2732.method2903());
        }
        this.field2738.method959(arg0);
    }

    @ObfuscatedName("ft.ac(B)V")
    public void method2964() {
        int var1 = this.field2734;
        int var2 = this.field2735;
        long var3 = this.field2736;
        while (this.field2735 == var2) {
            while (this.field2732.field2691[var1] == var2) {
                this.field2732.method2896(var1);
                int var5 = this.field2732.method2883(var1);
                if (var5 == 1) {
                    this.field2732.method2881();
                    this.field2732.method2880(var1);
                    if (this.field2732.method2888()) {
                        if (!this.field2733 || var2 == 0) {
                            this.method2955();
                            this.field2732.method2926();
                            return;
                        }
                        this.field2732.method2889(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method2982(var5);
                }
                this.field2732.method2882(var1);
                this.field2732.method2880(var1);
            }
            var1 = this.field2732.method2887();
            var2 = this.field2732.field2691[var1];
            var3 = this.field2732.method2886(var2);
        }
        this.field2734 = var1;
        this.field2735 = var2;
        this.field2736 = var3;
    }

    @ObfuscatedName("ft.as(Lfb;I)Z")
    public boolean method3004(class165 arg0) {
        if (arg0.field2784 != null) {
            return false;
        }
        if (arg0.field2780 >= 0) {
            arg0.method3204();
            if (arg0.field2776 > 0 && this.field2731[arg0.field2778][arg0.field2776] == arg0) {
                this.field2731[arg0.field2778][arg0.field2776] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("ft.az(Lfb;[IIII)Z")
    public boolean method2966(class165 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2765 = Statics.field1095 / 100;
        if (arg0.field2780 >= 0 && arg0.field2784 == null || arg0.field2784.method1098()) {
            arg0.method3051();
            arg0.method3204();
            if (arg0.field2776 > 0 && this.field2731[arg0.field2778][arg0.field2776] == arg0) {
                this.field2731[arg0.field2778][arg0.field2776] = null;
            }
            return true;
        }
        int var5 = arg0.field2771;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2722[arg0.field2778] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2771 = var6;
        }
        arg0.field2784.method1142(this.method3002(arg0));
        class163 var7 = arg0.field2764;
        boolean var8 = false;
        arg0.field2777++;
        arg0.field2763 += var7.field2750;
        double var9 = (double) ((arg0.field2766 - 60 << 8) + (arg0.field2771 * arg0.field2770 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2752 > 0) {
            if (var7.field2746 > 0) {
                arg0.field2772 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2746 * var9) + 0.5D);
            } else {
                arg0.field2772 += 128;
            }
        }
        if (var7.field2754 != null) {
            if (var7.field2743 > 0) {
                arg0.field2773 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2743 * var9) + 0.5D);
            } else {
                arg0.field2773 += 128;
            }
            while (arg0.field2774 < var7.field2754.length - 2 && arg0.field2773 > (var7.field2754[arg0.field2774 + 2] & 0xFF) << 8) {
                arg0.field2774 += 2;
            }
            if (arg0.field2774 == var7.field2754.length - 2 && var7.field2754[arg0.field2774 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2780 >= 0 && var7.field2748 != null && (this.field2724[arg0.field2778] & 0x1) == 0 && (arg0.field2776 < 0 || this.field2731[arg0.field2778][arg0.field2776] != arg0)) {
            if (var7.field2747 > 0) {
                arg0.field2780 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2747 * var9) + 0.5D);
            } else {
                arg0.field2780 += 128;
            }
            while (arg0.field2761 < var7.field2748.length - 2 && arg0.field2780 > (var7.field2748[arg0.field2761 + 2] & 0xFF) << 8) {
                arg0.field2761 += 2;
            }
            if (arg0.field2761 == var7.field2748.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2784.method1094(arg0.field2765, this.method2961(arg0), this.method2962(arg0));
            return false;
        }
        arg0.field2784.method1095(arg0.field2765);
        if (arg1 == null) {
            arg0.field2784.method959(arg3);
        } else {
            arg0.field2784.method931(arg1, arg2, arg3);
        }
        if (arg0.field2784.method1135()) {
            this.field2738.field2757.method923(arg0.field2784);
        }
        arg0.method3051();
        if (arg0.field2780 >= 0) {
            arg0.method3204();
            if (arg0.field2776 > 0 && this.field2731[arg0.field2778][arg0.field2776] == arg0) {
                this.field2731[arg0.field2778][arg0.field2776] = null;
            }
        }
        return true;
    }
}
