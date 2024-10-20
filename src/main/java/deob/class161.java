package deob;

@ObfuscatedName("fg")
public class class161 extends class60 {

    @ObfuscatedName("fg.e")
    public class173 field2712 = new class173(128);

    @ObfuscatedName("fg.p")
    public int field2699 = 256;

    @ObfuscatedName("fg.a")
    public int field2705 = 1000000;

    @ObfuscatedName("fg.g")
    public int[] field2701 = new int[16];

    @ObfuscatedName("fg.u")
    public int[] field2702 = new int[16];

    @ObfuscatedName("fg.k")
    public int[] field2727 = new int[16];

    @ObfuscatedName("fg.m")
    public int[] field2704 = new int[16];

    @ObfuscatedName("fg.t")
    public int[] field2724 = new int[16];

    @ObfuscatedName("fg.l")
    public int[] field2698 = new int[16];

    @ObfuscatedName("fg.f")
    public int[] field2707 = new int[16];

    @ObfuscatedName("fg.c")
    public int[] field2722 = new int[16];

    @ObfuscatedName("fg.i")
    public int[] field2709 = new int[16];

    @ObfuscatedName("fg.x")
    public int[] field2725 = new int[16];

    @ObfuscatedName("fg.q")
    public int[] field2713 = new int[16];

    @ObfuscatedName("fg.s")
    public int[] field2714 = new int[16];

    @ObfuscatedName("fg.j")
    public int[] field2715 = new int[16];

    @ObfuscatedName("fg.y")
    public int[] field2716 = new int[16];

    @ObfuscatedName("fg.r")
    public int[] field2717 = new int[16];

    @ObfuscatedName("fg.h")
    public class164[][] field2718 = new class164[16][128];

    @ObfuscatedName("fg.ak")
    public class164[][] field2719 = new class164[16][128];

    @ObfuscatedName("fg.ab")
    public class159 field2720 = new class159();

    @ObfuscatedName("fg.as")
    public boolean field2721;

    @ObfuscatedName("fg.aq")
    public int field2703;

    @ObfuscatedName("fg.ai")
    public int field2723;

    @ObfuscatedName("fg.aw")
    public long field2706;

    @ObfuscatedName("fg.aj")
    public long field2708;

    @ObfuscatedName("fg.ax")
    public class163 field2726 = new class163(this);

    public class161() {
        this.method3041();
    }

    @ObfuscatedName("fg.e(II)V")
    public synchronized void method3022(int arg0) {
        this.field2699 = arg0;
    }

    @ObfuscatedName("fg.p(I)I")
    public int method3023() {
        return this.field2699;
    }

    @ObfuscatedName("fg.a(Lft;Lec;Lbv;II)Z")
    public synchronized boolean method3024(class157 arg0, class145 arg1, class53 arg2, int arg3) {
        arg0.method2949();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class174 var7 = (class174) arg0.field2662.method3196(); var7 != null; var7 = (class174) arg0.field2662.method3201()) {
            int var8 = (int) var7.field2843;
            class158 var9 = (class158) this.field2712.method3192((long) var8);
            if (var9 == null) {
                var9 = class158.method123(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field2712.method3191(var9, (long) var8);
            }
            if (!var9.method2960(arg2, var7.field2827, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method2951();
        }
        return var5;
    }

    @ObfuscatedName("fg.g(I)V")
    public synchronized void method3025() {
        for (class158 var1 = (class158) this.field2712.method3196(); var1 != null; var1 = (class158) this.field2712.method3201()) {
            var1.method2962();
        }
    }

    @ObfuscatedName("fg.u(I)V")
    public synchronized void method3058() {
        for (class158 var1 = (class158) this.field2712.method3196(); var1 != null; var1 = (class158) this.field2712.method3201()) {
            var1.method3307();
        }
    }

    @ObfuscatedName("fg.f(Lft;ZI)V")
    public synchronized void method3027(class157 arg0, boolean arg1) {
        this.method3103();
        this.field2720.method2970(arg0.field2663);
        this.field2721 = arg1;
        this.field2706 = 0L;
        int var3 = this.field2720.method2973();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2720.method2974(var4);
            this.field2720.method2986(var4);
            this.field2720.method2975(var4);
        }
        this.field2703 = this.field2720.method2982();
        this.field2723 = this.field2720.field2687[this.field2703];
        this.field2708 = this.field2720.method2998(this.field2723);
    }

    @ObfuscatedName("fg.i(I)V")
    public synchronized void method3103() {
        this.field2720.method2971();
        this.method3041();
    }

    @ObfuscatedName("fg.o(I)Z")
    public synchronized boolean method3029() {
        return this.field2720.method2972();
    }

    @ObfuscatedName("fg.d(III)V")
    public synchronized void method3021(int arg0, int arg1) {
        this.method3030(arg0, arg1);
    }

    @ObfuscatedName("fg.b(IIB)V")
    public void method3030(int arg0, int arg1) {
        this.field2704[arg0] = arg1;
        this.field2698[arg0] = arg1 & 0xFFFFFF80;
        this.method3031(arg0, arg1);
    }

    @ObfuscatedName("fg.v(III)V")
    public void method3031(int arg0, int arg1) {
        if (this.field2724[arg0] != arg1) {
            this.field2724[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2719[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("fg.n(IIII)V")
    public void method3032(int arg0, int arg1, int arg2) {
        this.method3052(arg0, arg1, 64);
        if ((this.field2725[arg0] & 0x2) != 0) {
            for (class164 var4 = (class164) this.field2726.field2738.method3226(); var4 != null; var4 = (class164) this.field2726.field2738.method3228()) {
                if (var4.field2764 == arg0 && var4.field2756 < 0) {
                    this.field2718[arg0][var4.field2747] = null;
                    this.field2718[arg0][arg1] = var4;
                    int var5 = (var4.field2752 * var4.field2750 >> 12) + var4.field2755;
                    var4.field2755 += arg1 - var4.field2747 << 8;
                    var4.field2750 = var5 - var4.field2755;
                    var4.field2752 = 4096;
                    var4.field2747 = arg1;
                    return;
                }
            }
        }
        class158 var6 = (class158) this.field2712.method3192((long) this.field2724[arg0]);
        if (var6 == null) {
            return;
        }
        class56 var7 = var6.field2668[arg1];
        if (var7 == null) {
            return;
        }
        class164 var8 = new class164();
        var8.field2764 = arg0;
        var8.field2743 = var6;
        var8.field2744 = var7;
        var8.field2766 = var6.field2670[arg1];
        var8.field2746 = var6.field2664[arg1];
        var8.field2747 = arg1;
        var8.field2763 = var6.field2665 * arg2 * arg2 * var6.field2667[arg1] + 1024 >> 11;
        var8.field2749 = var6.field2669[arg1] & 0xFF;
        var8.field2755 = (arg1 << 8) - (var6.field2666[arg1] & 0x7FFF);
        var8.field2753 = 0;
        var8.field2754 = 0;
        var8.field2751 = 0;
        var8.field2756 = -1;
        var8.field2757 = 0;
        if (this.field2715[arg0] == 0) {
            var8.field2748 = class58.method1144(var7, this.method3045(var8), this.method3046(var8), this.method3047(var8));
        } else {
            var8.field2748 = class58.method1144(var7, this.method3045(var8), 0, this.method3047(var8));
            this.method3077(var8, var6.field2666[arg1] < 0);
        }
        if (var6.field2666[arg1] < 0) {
            var8.field2748.method1126(-1);
        }
        if (var8.field2746 >= 0) {
            class164 var9 = this.field2719[arg0][var8.field2746];
            if (var9 != null && var9.field2756 < 0) {
                this.field2718[arg0][var9.field2747] = null;
                var9.field2756 = 0;
            }
            this.field2719[arg0][var8.field2746] = var8;
        }
        this.field2726.field2738.method3222(var8);
        this.field2718[arg0][arg1] = var8;
    }

    @ObfuscatedName("fg.w(Lfl;ZI)V")
    public void method3077(class164 arg0, boolean arg1) {
        int var3 = arg0.field2744.field1123.length;
        int var5;
        if (arg1 && arg0.field2744.field1127) {
            int var4 = var3 + var3 - arg0.field2744.field1125;
            var5 = (int) ((long) this.field2715[arg0.field2764] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2748.method1133(true);
            }
        } else {
            var5 = (int) ((long) this.field2715[arg0.field2764] * (long) var3 >> 6);
        }
        arg0.field2748.method1132(var5);
    }

    @ObfuscatedName("fg.z(IIII)V")
    public void method3052(int arg0, int arg1, int arg2) {
        class164 var4 = this.field2718[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2718[arg0][arg1] = null;
        if ((this.field2725[arg0] & 0x2) == 0) {
            var4.field2756 = 0;
            return;
        }
        for (class164 var5 = (class164) this.field2726.field2738.method3225(); var5 != null; var5 = (class164) this.field2726.field2738.method3227()) {
            if (var4.field2764 == var5.field2764 && var5.field2756 < 0 && var4 != var5) {
                var4.field2756 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("fg.x(IIIB)V")
    public void method3035(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("fg.q(IIB)V")
    public void method3036(int arg0, int arg1) {
    }

    @ObfuscatedName("fg.s(IIB)V")
    public void method3037(int arg0, int arg1) {
        this.field2707[arg0] = arg1;
    }

    @ObfuscatedName("fg.j(IB)V")
    public void method3038(int arg0) {
        for (class164 var2 = (class164) this.field2726.field2738.method3225(); var2 != null; var2 = (class164) this.field2726.field2738.method3227()) {
            if (arg0 < 0 || var2.field2764 == arg0) {
                if (var2.field2748 != null) {
                    var2.field2748.method1137(Statics.field1076 / 100);
                    if (var2.field2748.method1141()) {
                        this.field2726.field2737.method974(var2.field2748);
                    }
                    var2.method3145();
                }
                if (var2.field2756 < 0) {
                    this.field2718[var2.field2764][var2.field2747] = null;
                }
                var2.method3307();
            }
        }
    }

    @ObfuscatedName("fg.y(II)V")
    public void method3039(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3039(var2);
            }
            return;
        }
        this.field2701[arg0] = 12800;
        this.field2702[arg0] = 8192;
        this.field2727[arg0] = 16383;
        this.field2707[arg0] = 8192;
        this.field2722[arg0] = 0;
        this.field2709[arg0] = 8192;
        this.method3042(arg0);
        this.method3043(arg0);
        this.field2725[arg0] = 0;
        this.field2713[arg0] = 32767;
        this.field2714[arg0] = 256;
        this.field2715[arg0] = 0;
        this.method3059(arg0, 8192);
    }

    @ObfuscatedName("fg.r(II)V")
    public void method3040(int arg0) {
        for (class164 var2 = (class164) this.field2726.field2738.method3225(); var2 != null; var2 = (class164) this.field2726.field2738.method3227()) {
            if ((arg0 < 0 || var2.field2764 == arg0) && var2.field2756 < 0) {
                this.field2718[var2.field2764][var2.field2747] = null;
                var2.field2756 = 0;
            }
        }
    }

    @ObfuscatedName("fg.h(I)V")
    public void method3041() {
        this.method3038(-1);
        this.method3039(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2724[var1] = this.field2704[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2698[var2] = this.field2704[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("fg.ai(II)V")
    public void method3042(int arg0) {
        if ((this.field2725[arg0] & 0x2) == 0) {
            return;
        }
        for (class164 var2 = (class164) this.field2726.field2738.method3225(); var2 != null; var2 = (class164) this.field2726.field2738.method3227()) {
            if (var2.field2764 == arg0 && this.field2718[arg0][var2.field2747] == null && var2.field2756 < 0) {
                var2.field2756 = 0;
            }
        }
    }

    @ObfuscatedName("fg.aw(II)V")
    public void method3043(int arg0) {
        if ((this.field2725[arg0] & 0x4) == 0) {
            return;
        }
        for (class164 var2 = (class164) this.field2726.field2738.method3225(); var2 != null; var2 = (class164) this.field2726.field2738.method3227()) {
            if (var2.field2764 == arg0) {
                var2.field2762 = 0;
            }
        }
    }

    @ObfuscatedName("fg.aj(IB)V")
    public void method3044(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3052(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3032(var6, var7, var8);
            } else {
                this.method3052(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3035(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2698[var12] = (var14 << 14) + (this.field2698[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2698[var12] = (var14 << 7) + (this.field2698[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2722[var12] = (var14 << 7) + (this.field2722[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2722[var12] = (this.field2722[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2709[var12] = (var14 << 7) + (this.field2709[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2709[var12] = (this.field2709[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2701[var12] = (var14 << 7) + (this.field2701[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2701[var12] = (this.field2701[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2702[var12] = (var14 << 7) + (this.field2702[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2702[var12] = (this.field2702[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2727[var12] = (var14 << 7) + (this.field2727[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2727[var12] = (this.field2727[var12] & 0xFFFFFF80) + var14;
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
                    this.method3042(var12);
                    this.field2725[var12] &= 0xFFFFFFFD;
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
                this.method3038(var12);
            }
            if (var13 == 121) {
                this.method3039(var12);
            }
            if (var13 == 123) {
                this.method3040(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2713[var12];
                if (var15 == 16384) {
                    this.field2714[var12] = (var14 << 7) + (this.field2714[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2713[var12];
                if (var16 == 16384) {
                    this.field2714[var12] = (this.field2714[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2715[var12] = (var14 << 7) + (this.field2715[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2715[var12] = (this.field2715[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2725[var12] |= 0x4;
                } else {
                    this.method3043(var12);
                    this.field2725[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3059(var12, (var14 << 7) + (this.field2716[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3059(var12, (this.field2716[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3031(var17, this.field2698[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3036(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method3037(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3041();
            }
        }
    }

    @ObfuscatedName("fg.ap(III)V")
    public void method3059(int arg0, int arg1) {
        this.field2716[arg0] = arg1;
        this.field2717[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("fg.az(Lfl;I)I")
    public int method3045(class164 arg0) {
        int var2 = (arg0.field2752 * arg0.field2750 >> 12) + arg0.field2755;
        int var3 = ((this.field2707[arg0.field2764] - 8192) * this.field2714[arg0.field2764] >> 12) + var2;
        class162 var4 = arg0.field2766;
        if (var4.field2735 > 0 && (var4.field2729 > 0 || this.field2722[arg0.field2764] > 0)) {
            int var5 = var4.field2729 << 2;
            int var6 = var4.field2736 << 1;
            if (arg0.field2758 < var6) {
                var5 = arg0.field2758 * var5 / var6;
            }
            int var7 = (this.field2722[arg0.field2764] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2759 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2744.field1126 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1076 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("fg.ae(Lfl;I)I")
    public int method3046(class164 arg0) {
        class162 var2 = arg0.field2766;
        int var3 = this.field2727[arg0.field2764] * this.field2701[arg0.field2764] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2763 * var4 + 16384 >> 15;
        int var6 = this.field2699 * var5 + 128 >> 8;
        if (var2.field2730 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2753 * 1.953125E-5D * (double) var2.field2730) + 0.5D);
        }
        if (var2.field2734 != null) {
            int var7 = arg0.field2754;
            int var8 = var2.field2734[arg0.field2751 + 1];
            if (arg0.field2751 < var2.field2734.length - 2) {
                int var9 = (var2.field2734[arg0.field2751] & 0xFF) << 8;
                int var10 = (var2.field2734[arg0.field2751 + 2] & 0xFF) << 8;
                var8 += (var2.field2734[arg0.field2751 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2756 > 0 && var2.field2732 != null) {
            int var11 = arg0.field2756;
            int var12 = var2.field2732[arg0.field2757 + 1];
            if (arg0.field2757 < var2.field2732.length - 2) {
                int var13 = (var2.field2732[arg0.field2757] & 0xFF) << 8;
                int var14 = (var2.field2732[arg0.field2757 + 2] & 0xFF) << 8;
                var12 += (var2.field2732[arg0.field2757 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("fg.ah(Lfl;I)I")
    public int method3047(class164 arg0) {
        int var2 = this.field2702[arg0.field2764];
        return var2 < 8192 ? arg0.field2749 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2749) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("fg.k()Lbc;")
    public synchronized class60 method1002() {
        return this.field2726;
    }

    @ObfuscatedName("fg.m()Lbc;")
    public synchronized class60 method980() {
        return null;
    }

    @ObfuscatedName("fg.t()I")
    public synchronized int method1017() {
        return 0;
    }

    @ObfuscatedName("fg.l([III)V")
    public synchronized void method982(int[] arg0, int arg1, int arg2) {
        if (this.field2720.method2972()) {
            int var4 = this.field2705 * this.field2720.field2675 / Statics.field1076;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2706;
                if (this.field2708 - var5 >= 0L) {
                    this.field2706 = var5;
                    break;
                }
                int var7 = (int) ((this.field2708 - this.field2706 + (long) var4 - 1L) / (long) var4);
                this.field2706 += (long) var4 * (long) var7;
                this.field2726.method982(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3049();
            } while (this.field2720.method2972());
        }
        this.field2726.method982(arg0, arg1, arg2);
    }

    @ObfuscatedName("fg.c(I)V")
    public synchronized void method984(int arg0) {
        if (this.field2720.method2972()) {
            int var2 = this.field2705 * this.field2720.field2675 / Statics.field1076;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2706;
                if (this.field2708 - var3 >= 0L) {
                    this.field2706 = var3;
                    break;
                }
                int var5 = (int) ((this.field2708 - this.field2706 + (long) var2 - 1L) / (long) var2);
                this.field2706 += (long) var2 * (long) var5;
                this.field2726.method984(var5);
                arg0 -= var5;
                this.method3049();
            } while (this.field2720.method2972());
        }
        this.field2726.method984(arg0);
    }

    @ObfuscatedName("fg.ad(B)V")
    public void method3049() {
        int var1 = this.field2703;
        int var2 = this.field2723;
        long var3 = this.field2708;
        while (this.field2723 == var2) {
            while (this.field2720.field2687[var1] == var2) {
                this.field2720.method2974(var1);
                int var5 = this.field2720.method2978(var1);
                if (var5 == 1) {
                    this.field2720.method2976();
                    this.field2720.method2975(var1);
                    if (this.field2720.method2983()) {
                        if (!this.field2721 || var2 == 0) {
                            this.method3041();
                            this.field2720.method2971();
                            return;
                        }
                        this.field2720.method2997(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3044(var5);
                }
                this.field2720.method2986(var1);
                this.field2720.method2975(var1);
            }
            var1 = this.field2720.method2982();
            var2 = this.field2720.field2687[var1];
            var3 = this.field2720.method2998(var2);
        }
        this.field2703 = var1;
        this.field2723 = var2;
        this.field2708 = var3;
    }

    @ObfuscatedName("fg.av(Lfl;B)Z")
    public boolean method3135(class164 arg0) {
        if (arg0.field2748 != null) {
            return false;
        }
        if (arg0.field2756 >= 0) {
            arg0.method3307();
            if (arg0.field2746 > 0 && this.field2719[arg0.field2764][arg0.field2746] == arg0) {
                this.field2719[arg0.field2764][arg0.field2746] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("fg.ag(Lfl;[IIII)Z")
    public boolean method3082(class164 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2761 = Statics.field1076 / 100;
        if (arg0.field2756 >= 0 && arg0.field2748 == null || arg0.field2748.method1246()) {
            arg0.method3145();
            arg0.method3307();
            if (arg0.field2746 > 0 && this.field2719[arg0.field2764][arg0.field2746] == arg0) {
                this.field2719[arg0.field2764][arg0.field2746] = null;
            }
            return true;
        }
        int var5 = arg0.field2752;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2709[arg0.field2764] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2752 = var6;
        }
        arg0.field2748.method1209(this.method3045(arg0));
        class162 var7 = arg0.field2766;
        boolean var8 = false;
        arg0.field2758++;
        arg0.field2759 += var7.field2735;
        double var9 = (double) ((arg0.field2747 - 60 << 8) + (arg0.field2752 * arg0.field2750 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2730 > 0) {
            if (var7.field2733 > 0) {
                arg0.field2753 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2733 * var9) + 0.5D);
            } else {
                arg0.field2753 += 128;
            }
        }
        if (var7.field2734 != null) {
            if (var7.field2731 > 0) {
                arg0.field2754 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2731 * var9) + 0.5D);
            } else {
                arg0.field2754 += 128;
            }
            while (arg0.field2751 < var7.field2734.length - 2 && arg0.field2754 > (var7.field2734[arg0.field2751 + 2] & 0xFF) << 8) {
                arg0.field2751 += 2;
            }
            if (arg0.field2751 == var7.field2734.length - 2 && var7.field2734[arg0.field2751 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2756 >= 0 && var7.field2732 != null && (this.field2725[arg0.field2764] & 0x1) == 0 && (arg0.field2746 < 0 || this.field2719[arg0.field2764][arg0.field2746] != arg0)) {
            if (var7.field2728 > 0) {
                arg0.field2756 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2728 * var9) + 0.5D);
            } else {
                arg0.field2756 += 128;
            }
            while (arg0.field2757 < var7.field2732.length - 2 && arg0.field2756 > (var7.field2732[arg0.field2757 + 2] & 0xFF) << 8) {
                arg0.field2757 += 2;
            }
            if (arg0.field2757 == var7.field2732.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2748.method1238(arg0.field2761, this.method3046(arg0), this.method3047(arg0));
            return false;
        }
        arg0.field2748.method1137(arg0.field2761);
        if (arg1 == null) {
            arg0.field2748.method984(arg3);
        } else {
            arg0.field2748.method982(arg1, arg2, arg3);
        }
        if (arg0.field2748.method1141()) {
            this.field2726.field2737.method974(arg0.field2748);
        }
        arg0.method3145();
        if (arg0.field2756 >= 0) {
            arg0.method3307();
            if (arg0.field2746 > 0 && this.field2719[arg0.field2764][arg0.field2746] == arg0) {
                this.field2719[arg0.field2764][arg0.field2746] = null;
            }
        }
        return true;
    }
}
