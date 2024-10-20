package deob;

@ObfuscatedName("fb")
public class class163 extends class60 {

    @ObfuscatedName("fb.g")
    public class175 field2738 = new class175(128);

    @ObfuscatedName("fb.s")
    public int field2725 = 256;

    @ObfuscatedName("fb.h")
    public int field2726 = 1000000;

    @ObfuscatedName("fb.m")
    public int[] field2727 = new int[16];

    @ObfuscatedName("fb.u")
    public int[] field2736 = new int[16];

    @ObfuscatedName("fb.j")
    public int[] field2747 = new int[16];

    @ObfuscatedName("fb.b")
    public int[] field2740 = new int[16];

    @ObfuscatedName("fb.v")
    public int[] field2731 = new int[16];

    @ObfuscatedName("fb.y")
    public int[] field2732 = new int[16];

    @ObfuscatedName("fb.x")
    public int[] field2724 = new int[16];

    @ObfuscatedName("fb.k")
    public int[] field2734 = new int[16];

    @ObfuscatedName("fb.o")
    public int[] field2735 = new int[16];

    @ObfuscatedName("fb.l")
    public int[] field2733 = new int[16];

    @ObfuscatedName("fb.n")
    public int[] field2737 = new int[16];

    @ObfuscatedName("fb.d")
    public int[] field2728 = new int[16];

    @ObfuscatedName("fb.p")
    public int[] field2739 = new int[16];

    @ObfuscatedName("fb.z")
    public int[] field2730 = new int[16];

    @ObfuscatedName("fb.q")
    public int[] field2741 = new int[16];

    @ObfuscatedName("fb.i")
    public class166[][] field2742 = new class166[16][128];

    @ObfuscatedName("fb.ah")
    public class166[][] field2743 = new class166[16][128];

    @ObfuscatedName("fb.aj")
    public class161 field2744 = new class161();

    @ObfuscatedName("fb.aq")
    public boolean field2745;

    @ObfuscatedName("fb.aa")
    public int field2729;

    @ObfuscatedName("fb.ar")
    public int field2746;

    @ObfuscatedName("fb.at")
    public long field2748;

    @ObfuscatedName("fb.av")
    public long field2749;

    @ObfuscatedName("fb.af")
    public class165 field2750 = new class165(this);

    public class163() {
        this.method3009();
    }

    @ObfuscatedName("fb.g(IB)V")
    public synchronized void method3004(int arg0) {
        this.field2725 = arg0;
    }

    @ObfuscatedName("fb.s(I)I")
    public int method3005() {
        return this.field2725;
    }

    @ObfuscatedName("fb.h(Lfi;Leh;Lbc;II)Z")
    public synchronized boolean method3099(class159 arg0, class147 arg1, class53 arg2, int arg3) {
        arg0.method2917();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class176 var7 = (class176) arg0.field2687.method3163(); var7 != null; var7 = (class176) arg0.field2687.method3172()) {
            int var8 = (int) var7.field2873;
            class160 var9 = (class160) this.field2738.method3171((long) var8);
            if (var9 == null) {
                var9 = class160.method2434(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field2738.method3161(var9, (long) var8);
            }
            if (!var9.method2923(arg2, var7.field2852, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method2919();
        }
        return var5;
    }

    @ObfuscatedName("fb.m(B)V")
    public synchronized void method3040() {
        for (class160 var1 = (class160) this.field2738.method3163(); var1 != null; var1 = (class160) this.field2738.method3172()) {
            var1.method2927();
        }
    }

    @ObfuscatedName("fb.u(I)V")
    public synchronized void method3008() {
        for (class160 var1 = (class160) this.field2738.method3163(); var1 != null; var1 = (class160) this.field2738.method3172()) {
            var1.method3280();
        }
    }

    @ObfuscatedName("fb.w(Lfi;ZI)V")
    public synchronized void method3063(class159 arg0, boolean arg1) {
        this.method3010();
        this.field2744.method2934(arg0.field2688);
        this.field2745 = arg1;
        this.field2748 = 0L;
        int var3 = this.field2744.method2937();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2744.method2938(var4);
            this.field2744.method2952(var4);
            this.field2744.method2939(var4);
        }
        this.field2729 = this.field2744.method2945();
        this.field2746 = this.field2744.field2700[this.field2729];
        this.field2749 = this.field2744.method2944(this.field2746);
    }

    @ObfuscatedName("fb.k(I)V")
    public synchronized void method3010() {
        this.field2744.method2935();
        this.method3009();
    }

    @ObfuscatedName("fb.o(I)Z")
    public synchronized boolean method3011() {
        return this.field2744.method2936();
    }

    @ObfuscatedName("fb.a(III)V")
    public synchronized void method3012(int arg0, int arg1) {
        this.method3013(arg0, arg1);
    }

    @ObfuscatedName("fb.f(III)V")
    public void method3013(int arg0, int arg1) {
        this.field2740[arg0] = arg1;
        this.field2732[arg0] = arg1 & 0xFFFFFF80;
        this.method3090(arg0, arg1);
    }

    @ObfuscatedName("fb.r(IIB)V")
    public void method3090(int arg0, int arg1) {
        if (this.field2731[arg0] != arg1) {
            this.field2731[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2743[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("fb.e(IIII)V")
    public void method3015(int arg0, int arg1, int arg2) {
        this.method3035(arg0, arg1, 64);
        if ((this.field2733[arg0] & 0x2) != 0) {
            for (class166 var4 = (class166) this.field2750.field2762.method3193(); var4 != null; var4 = (class166) this.field2750.field2762.method3199()) {
                if (var4.field2782 == arg0 && var4.field2781 < 0) {
                    this.field2742[arg0][var4.field2772] = null;
                    this.field2742[arg0][arg1] = var4;
                    int var5 = (var4.field2777 * var4.field2768 >> 12) + var4.field2775;
                    var4.field2775 += arg1 - var4.field2772 << 8;
                    var4.field2768 = var5 - var4.field2775;
                    var4.field2777 = 4096;
                    var4.field2772 = arg1;
                    return;
                }
            }
        }
        class160 var6 = (class160) this.field2738.method3171((long) this.field2731[arg0]);
        if (var6 == null) {
            return;
        }
        class56 var7 = var6.field2690[arg1];
        if (var7 == null) {
            return;
        }
        class166 var8 = new class166();
        var8.field2782 = arg0;
        var8.field2785 = var6;
        var8.field2791 = var7;
        var8.field2776 = var6.field2694[arg1];
        var8.field2771 = var6.field2696[arg1];
        var8.field2772 = arg1;
        var8.field2773 = var6.field2695 * arg2 * arg2 * var6.field2692[arg1] + 1024 >> 11;
        var8.field2774 = var6.field2689[arg1] & 0xFF;
        var8.field2775 = (arg1 << 8) - (var6.field2691[arg1] & 0x7FFF);
        var8.field2780 = 0;
        var8.field2779 = 0;
        var8.field2767 = 0;
        var8.field2781 = -1;
        var8.field2788 = 0;
        if (this.field2739[arg0] == 0) {
            var8.field2769 = class58.method1101(var7, this.method3027(var8), this.method3028(var8), this.method3029(var8));
        } else {
            var8.field2769 = class58.method1101(var7, this.method3027(var8), 0, this.method3029(var8));
            this.method3021(var8, var6.field2691[arg1] < 0);
        }
        if (var6.field2691[arg1] < 0) {
            var8.field2769.method1103(-1);
        }
        if (var8.field2771 >= 0) {
            class166 var9 = this.field2743[arg0][var8.field2771];
            if (var9 != null && var9.field2781 < 0) {
                this.field2742[arg0][var9.field2772] = null;
                var9.field2781 = 0;
            }
            this.field2743[arg0][var8.field2771] = var8;
        }
        this.field2750.field2762.method3200(var8);
        this.field2742[arg0][arg1] = var8;
    }

    @ObfuscatedName("fb.t(Lfx;ZI)V")
    public void method3021(class166 arg0, boolean arg1) {
        int var3 = arg0.field2791.field1128.length;
        int var5;
        if (arg1 && arg0.field2791.field1131) {
            int var4 = var3 + var3 - arg0.field2791.field1127;
            var5 = (int) ((long) this.field2739[arg0.field2782] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2769.method1110(true);
            }
        } else {
            var5 = (int) ((long) this.field2739[arg0.field2782] * (long) var3 >> 6);
        }
        arg0.field2769.method1109(var5);
    }

    @ObfuscatedName("fb.c(IIII)V")
    public void method3035(int arg0, int arg1, int arg2) {
        class166 var4 = this.field2742[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2742[arg0][arg1] = null;
        if ((this.field2733[arg0] & 0x2) == 0) {
            var4.field2781 = 0;
            return;
        }
        for (class166 var5 = (class166) this.field2750.field2762.method3196(); var5 != null; var5 = (class166) this.field2750.field2762.method3206()) {
            if (var4.field2782 == var5.field2782 && var5.field2781 < 0 && var4 != var5) {
                var4.field2781 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("fb.l(IIII)V")
    public void method3017(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("fb.n(III)V")
    public void method3034(int arg0, int arg1) {
    }

    @ObfuscatedName("fb.d(III)V")
    public void method3096(int arg0, int arg1) {
        this.field2724[arg0] = arg1;
    }

    @ObfuscatedName("fb.p(II)V")
    public void method3033(int arg0) {
        for (class166 var2 = (class166) this.field2750.field2762.method3196(); var2 != null; var2 = (class166) this.field2750.field2762.method3206()) {
            if (arg0 < 0 || var2.field2782 == arg0) {
                if (var2.field2769 != null) {
                    var2.field2769.method1096(Statics.field1071 / 100);
                    if (var2.field2769.method1143()) {
                        this.field2750.field2764.method933(var2.field2769);
                    }
                    var2.method3113();
                }
                if (var2.field2781 < 0) {
                    this.field2742[var2.field2782][var2.field2772] = null;
                }
                var2.method3280();
            }
        }
    }

    @ObfuscatedName("fb.z(II)V")
    public void method3020(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3020(var2);
            }
            return;
        }
        this.field2727[arg0] = 12800;
        this.field2736[arg0] = 8192;
        this.field2747[arg0] = 16383;
        this.field2724[arg0] = 8192;
        this.field2734[arg0] = 0;
        this.field2735[arg0] = 8192;
        this.method3023(arg0);
        this.method3024(arg0);
        this.field2733[arg0] = 0;
        this.field2737[arg0] = 32767;
        this.field2728[arg0] = 256;
        this.field2739[arg0] = 0;
        this.method3026(arg0, 8192);
    }

    @ObfuscatedName("fb.q(II)V")
    public void method3071(int arg0) {
        for (class166 var2 = (class166) this.field2750.field2762.method3196(); var2 != null; var2 = (class166) this.field2750.field2762.method3206()) {
            if ((arg0 < 0 || var2.field2782 == arg0) && var2.field2781 < 0) {
                this.field2742[var2.field2782][var2.field2772] = null;
                var2.field2781 = 0;
            }
        }
    }

    @ObfuscatedName("fb.ao(I)V")
    public void method3009() {
        this.method3033(-1);
        this.method3020(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2731[var1] = this.field2740[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2732[var2] = this.field2740[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("fb.az(IB)V")
    public void method3023(int arg0) {
        if ((this.field2733[arg0] & 0x2) == 0) {
            return;
        }
        for (class166 var2 = (class166) this.field2750.field2762.method3196(); var2 != null; var2 = (class166) this.field2750.field2762.method3206()) {
            if (var2.field2782 == arg0 && this.field2742[arg0][var2.field2772] == null && var2.field2781 < 0) {
                var2.field2781 = 0;
            }
        }
    }

    @ObfuscatedName("fb.ac(IB)V")
    public void method3024(int arg0) {
        if ((this.field2733[arg0] & 0x4) == 0) {
            return;
        }
        for (class166 var2 = (class166) this.field2750.field2762.method3196(); var2 != null; var2 = (class166) this.field2750.field2762.method3206()) {
            if (var2.field2782 == arg0) {
                var2.field2787 = 0;
            }
        }
    }

    @ObfuscatedName("fb.ad(IB)V")
    public void method3025(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3035(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3015(var6, var7, var8);
            } else {
                this.method3035(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3017(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2732[var12] = (var14 << 14) + (this.field2732[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2732[var12] = (var14 << 7) + (this.field2732[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2734[var12] = (var14 << 7) + (this.field2734[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2734[var12] = (this.field2734[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2735[var12] = (var14 << 7) + (this.field2735[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2735[var12] = (this.field2735[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2727[var12] = (var14 << 7) + (this.field2727[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2727[var12] = (this.field2727[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2736[var12] = (var14 << 7) + (this.field2736[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2736[var12] = (this.field2736[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2747[var12] = (var14 << 7) + (this.field2747[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2747[var12] = (this.field2747[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2733[var12] |= 0x1;
                } else {
                    this.field2733[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2733[var12] |= 0x2;
                } else {
                    this.method3023(var12);
                    this.field2733[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2737[var12] = (var14 << 7) + (this.field2737[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2737[var12] = (this.field2737[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2737[var12] = (var14 << 7) + (this.field2737[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2737[var12] = (this.field2737[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3033(var12);
            }
            if (var13 == 121) {
                this.method3020(var12);
            }
            if (var13 == 123) {
                this.method3071(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2737[var12];
                if (var15 == 16384) {
                    this.field2728[var12] = (var14 << 7) + (this.field2728[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2737[var12];
                if (var16 == 16384) {
                    this.field2728[var12] = (this.field2728[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2739[var12] = (var14 << 7) + (this.field2739[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2739[var12] = (this.field2739[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2733[var12] |= 0x4;
                } else {
                    this.method3024(var12);
                    this.field2733[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3026(var12, (var14 << 7) + (this.field2730[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3026(var12, (this.field2730[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3090(var17, this.field2732[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3034(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method3096(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3009();
            }
        }
    }

    @ObfuscatedName("fb.ak(IIS)V")
    public void method3026(int arg0, int arg1) {
        this.field2730[arg0] = arg1;
        this.field2741[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("fb.an(Lfx;I)I")
    public int method3027(class166 arg0) {
        int var2 = (arg0.field2777 * arg0.field2768 >> 12) + arg0.field2775;
        int var3 = ((this.field2724[arg0.field2782] - 8192) * this.field2728[arg0.field2782] >> 12) + var2;
        class164 var4 = arg0.field2776;
        if (var4.field2758 > 0 && (var4.field2757 > 0 || this.field2734[arg0.field2782] > 0)) {
            int var5 = var4.field2757 << 2;
            int var6 = var4.field2759 << 1;
            if (arg0.field2783 < var6) {
                var5 = arg0.field2783 * var5 / var6;
            }
            int var7 = (this.field2734[arg0.field2782] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2784 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2791.field1129 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1071 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("fb.am(Lfx;I)I")
    public int method3028(class166 arg0) {
        class164 var2 = arg0.field2776;
        int var3 = this.field2727[arg0.field2782] * this.field2747[arg0.field2782] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2773 * var4 + 16384 >> 15;
        int var6 = this.field2725 * var5 + 128 >> 8;
        if (var2.field2753 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2780 * 1.953125E-5D * (double) var2.field2753) + 0.5D);
        }
        if (var2.field2752 != null) {
            int var7 = arg0.field2779;
            int var8 = var2.field2752[arg0.field2767 + 1];
            if (arg0.field2767 < var2.field2752.length - 2) {
                int var9 = (var2.field2752[arg0.field2767] & 0xFF) << 8;
                int var10 = (var2.field2752[arg0.field2767 + 2] & 0xFF) << 8;
                var8 += (var2.field2752[arg0.field2767 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2781 > 0 && var2.field2751 != null) {
            int var11 = arg0.field2781;
            int var12 = var2.field2751[arg0.field2788 + 1];
            if (arg0.field2788 < var2.field2751.length - 2) {
                int var13 = (var2.field2751[arg0.field2788] & 0xFF) << 8;
                int var14 = (var2.field2751[arg0.field2788 + 2] & 0xFF) << 8;
                var12 += (var2.field2751[arg0.field2788 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("fb.aw(Lfx;I)I")
    public int method3029(class166 arg0) {
        int var2 = this.field2736[arg0.field2782];
        return var2 < 8192 ? arg0.field2774 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2774) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("fb.j()Lbw;")
    public synchronized class60 method938() {
        return this.field2750;
    }

    @ObfuscatedName("fb.b()Lbw;")
    public synchronized class60 method939() {
        return null;
    }

    @ObfuscatedName("fb.v()I")
    public synchronized int method940() {
        return 0;
    }

    @ObfuscatedName("fb.y([III)V")
    public synchronized void method936(int[] arg0, int arg1, int arg2) {
        if (this.field2744.method2936()) {
            int var4 = this.field2726 * this.field2744.field2701 / Statics.field1071;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2748;
                if (this.field2749 - var5 >= 0L) {
                    this.field2748 = var5;
                    break;
                }
                int var7 = (int) ((this.field2749 - this.field2748 + (long) var4 - 1L) / (long) var4);
                this.field2748 += (long) var4 * (long) var7;
                this.field2750.method936(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3030();
            } while (this.field2744.method2936());
        }
        this.field2750.method936(arg0, arg1, arg2);
    }

    @ObfuscatedName("fb.x(I)V")
    public synchronized void method950(int arg0) {
        if (this.field2744.method2936()) {
            int var2 = this.field2726 * this.field2744.field2701 / Statics.field1071;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2748;
                if (this.field2749 - var3 >= 0L) {
                    this.field2748 = var3;
                    break;
                }
                int var5 = (int) ((this.field2749 - this.field2748 + (long) var2 - 1L) / (long) var2);
                this.field2748 += (long) var2 * (long) var5;
                this.field2750.method950(var5);
                arg0 -= var5;
                this.method3030();
            } while (this.field2744.method2936());
        }
        this.field2750.method950(arg0);
    }

    @ObfuscatedName("fb.as(I)V")
    public void method3030() {
        int var1 = this.field2729;
        int var2 = this.field2746;
        long var3 = this.field2749;
        while (this.field2746 == var2) {
            while (this.field2744.field2700[var1] == var2) {
                this.field2744.method2938(var1);
                int var5 = this.field2744.method2946(var1);
                if (var5 == 1) {
                    this.field2744.method2940();
                    this.field2744.method2939(var1);
                    if (this.field2744.method2961()) {
                        if (!this.field2745 || var2 == 0) {
                            this.method3009();
                            this.field2744.method2935();
                            return;
                        }
                        this.field2744.method2947(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3025(var5);
                }
                this.field2744.method2952(var1);
                this.field2744.method2939(var1);
            }
            var1 = this.field2744.method2945();
            var2 = this.field2744.field2700[var1];
            var3 = this.field2744.method2944(var2);
        }
        this.field2729 = var1;
        this.field2746 = var2;
        this.field2749 = var3;
    }

    @ObfuscatedName("fb.au(Lfx;I)Z")
    public boolean method3031(class166 arg0) {
        if (arg0.field2769 != null) {
            return false;
        }
        if (arg0.field2781 >= 0) {
            arg0.method3280();
            if (arg0.field2771 > 0 && this.field2743[arg0.field2782][arg0.field2771] == arg0) {
                this.field2743[arg0.field2782][arg0.field2771] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("fb.ax(Lfx;[IIII)Z")
    public boolean method3019(class166 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2778 = Statics.field1071 / 100;
        if (arg0.field2781 >= 0 && arg0.field2769 == null || arg0.field2769.method1117()) {
            arg0.method3113();
            arg0.method3280();
            if (arg0.field2771 > 0 && this.field2743[arg0.field2782][arg0.field2771] == arg0) {
                this.field2743[arg0.field2782][arg0.field2771] = null;
            }
            return true;
        }
        int var5 = arg0.field2777;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2735[arg0.field2782] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2777 = var6;
        }
        arg0.field2769.method1115(this.method3027(arg0));
        class164 var7 = arg0.field2776;
        boolean var8 = false;
        arg0.field2783++;
        arg0.field2784 += var7.field2758;
        double var9 = (double) ((arg0.field2772 - 60 << 8) + (arg0.field2777 * arg0.field2768 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2753 > 0) {
            if (var7.field2754 > 0) {
                arg0.field2780 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2754 * var9) + 0.5D);
            } else {
                arg0.field2780 += 128;
            }
        }
        if (var7.field2752 != null) {
            if (var7.field2756 > 0) {
                arg0.field2779 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2756 * var9) + 0.5D);
            } else {
                arg0.field2779 += 128;
            }
            while (arg0.field2767 < var7.field2752.length - 2 && arg0.field2779 > (var7.field2752[arg0.field2767 + 2] & 0xFF) << 8) {
                arg0.field2767 += 2;
            }
            if (arg0.field2767 == var7.field2752.length - 2 && var7.field2752[arg0.field2767 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2781 >= 0 && var7.field2751 != null && (this.field2733[arg0.field2782] & 0x1) == 0 && (arg0.field2771 < 0 || this.field2743[arg0.field2782][arg0.field2771] != arg0)) {
            if (var7.field2755 > 0) {
                arg0.field2781 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2755 * var9) + 0.5D);
            } else {
                arg0.field2781 += 128;
            }
            while (arg0.field2788 < var7.field2751.length - 2 && arg0.field2781 > (var7.field2751[arg0.field2788 + 2] & 0xFF) << 8) {
                arg0.field2788 += 2;
            }
            if (arg0.field2788 == var7.field2751.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2769.method1113(arg0.field2778, this.method3028(arg0), this.method3029(arg0));
            return false;
        }
        arg0.field2769.method1096(arg0.field2778);
        if (arg1 == null) {
            arg0.field2769.method950(arg3);
        } else {
            arg0.field2769.method936(arg1, arg2, arg3);
        }
        if (arg0.field2769.method1143()) {
            this.field2750.field2764.method933(arg0.field2769);
        }
        arg0.method3113();
        if (arg0.field2781 >= 0) {
            arg0.method3280();
            if (arg0.field2771 > 0 && this.field2743[arg0.field2782][arg0.field2771] == arg0) {
                this.field2743[arg0.field2782][arg0.field2771] = null;
            }
        }
        return true;
    }
}
