package deob;

@ObfuscatedName("fv")
public class class162 extends class60 {

    @ObfuscatedName("fv.k")
    public class174 field2737 = new class174(128);

    @ObfuscatedName("fv.r")
    public int field2723 = 256;

    @ObfuscatedName("fv.y")
    public int field2725 = 1000000;

    @ObfuscatedName("fv.m")
    public int[] field2726 = new int[16];

    @ObfuscatedName("fv.j")
    public int[] field2736 = new int[16];

    @ObfuscatedName("fv.g")
    public int[] field2728 = new int[16];

    @ObfuscatedName("fv.p")
    public int[] field2730 = new int[16];

    @ObfuscatedName("fv.o")
    public int[] field2746 = new int[16];

    @ObfuscatedName("fv.b")
    public int[] field2731 = new int[16];

    @ObfuscatedName("fv.x")
    public int[] field2732 = new int[16];

    @ObfuscatedName("fv.n")
    public int[] field2742 = new int[16];

    @ObfuscatedName("fv.d")
    public int[] field2734 = new int[16];

    @ObfuscatedName("fv.h")
    public int[] field2735 = new int[16];

    @ObfuscatedName("fv.e")
    public int[] field2729 = new int[16];

    @ObfuscatedName("fv.a")
    public int[] field2738 = new int[16];

    @ObfuscatedName("fv.c")
    public int[] field2739 = new int[16];

    @ObfuscatedName("fv.f")
    public int[] field2740 = new int[16];

    @ObfuscatedName("fv.q")
    public int[] field2741 = new int[16];

    @ObfuscatedName("fv.z")
    public class165[][] field2727 = new class165[16][128];

    @ObfuscatedName("fv.aa")
    public class165[][] field2743 = new class165[16][128];

    @ObfuscatedName("fv.ak")
    public class160 field2751 = new class160();

    @ObfuscatedName("fv.al")
    public boolean field2745;

    @ObfuscatedName("fv.aw")
    public int field2744;

    @ObfuscatedName("fv.ai")
    public int field2747;

    @ObfuscatedName("fv.av")
    public long field2748;

    @ObfuscatedName("fv.an")
    public long field2749;

    @ObfuscatedName("fv.aq")
    public class164 field2750 = new class164(this);

    public class162() {
        this.method3023();
    }

    @ObfuscatedName("fv.k(II)V")
    public synchronized void method3038(int arg0) {
        this.field2723 = arg0;
    }

    @ObfuscatedName("fv.r(S)I")
    public int method3004() {
        return this.field2723;
    }

    @ObfuscatedName("fv.y(Lfs;Lee;Lbh;IB)Z")
    public synchronized boolean method3052(class158 arg0, class146 arg1, class53 arg2, int arg3) {
        arg0.method2921();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class175 var7 = (class175) arg0.field2687.method3166(); var7 != null; var7 = (class175) arg0.field2687.method3168()) {
            int var8 = (int) var7.field2877;
            class159 var9 = (class159) this.field2737.method3163((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method2683(var8);
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
                this.field2737.method3164(var11, (long) var8);
            }
            if (!var9.method2930(arg2, var7.field2855, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method2925();
        }
        return var5;
    }

    @ObfuscatedName("fv.w(I)V")
    public synchronized void method3006() {
        for (class159 var1 = (class159) this.field2737.method3166(); var1 != null; var1 = (class159) this.field2737.method3168()) {
            var1.method2931();
        }
    }

    @ObfuscatedName("fv.m(I)V")
    public synchronized void method3007() {
        for (class159 var1 = (class159) this.field2737.method3166(); var1 != null; var1 = (class159) this.field2737.method3168()) {
            var1.method3275();
        }
    }

    @ObfuscatedName("fv.b(Lfs;ZI)V")
    public synchronized void method3008(class158 arg0, boolean arg1) {
        this.method3009();
        this.field2751.method2936(arg0.field2686);
        this.field2745 = arg1;
        this.field2748 = 0L;
        int var3 = this.field2751.method2939();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2751.method2967(var4);
            this.field2751.method2943(var4);
            this.field2751.method2941(var4);
        }
        this.field2744 = this.field2751.method2947();
        this.field2747 = this.field2751.field2702[this.field2744];
        this.field2749 = this.field2751.method2952(this.field2747);
    }

    @ObfuscatedName("fv.n(B)V")
    public synchronized void method3009() {
        this.field2751.method2937();
        this.method3023();
    }

    @ObfuscatedName("fv.d(I)Z")
    public synchronized boolean method3010() {
        return this.field2751.method2951();
    }

    @ObfuscatedName("fv.s(IIS)V")
    public synchronized void method3011(int arg0, int arg1) {
        this.method3012(arg0, arg1);
    }

    @ObfuscatedName("fv.v(IIB)V")
    public void method3012(int arg0, int arg1) {
        this.field2730[arg0] = arg1;
        this.field2731[arg0] = arg1 & 0xFFFFFF80;
        this.method3078(arg0, arg1);
    }

    @ObfuscatedName("fv.t(III)V")
    public void method3078(int arg0, int arg1) {
        if (this.field2746[arg0] != arg1) {
            this.field2746[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2743[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("fv.u(IIIB)V")
    public void method3088(int arg0, int arg1, int arg2) {
        this.method3030(arg0, arg1, 64);
        if ((this.field2735[arg0] & 0x2) != 0) {
            for (class165 var4 = (class165) this.field2750.field2765.method3196(); var4 != null; var4 = (class165) this.field2750.field2765.method3198()) {
                if (var4.field2781 == arg0 && var4.field2782 < 0) {
                    this.field2727[arg0][var4.field2773] = null;
                    this.field2727[arg0][arg1] = var4;
                    int var5 = (var4.field2778 * var4.field2777 >> 12) + var4.field2776;
                    var4.field2776 += arg1 - var4.field2773 << 8;
                    var4.field2777 = var5 - var4.field2776;
                    var4.field2778 = 4096;
                    var4.field2773 = arg1;
                    return;
                }
            }
        }
        class159 var6 = (class159) this.field2737.method3163((long) this.field2746[arg0]);
        if (var6 == null) {
            return;
        }
        class56 var7 = var6.field2689[arg1];
        if (var7 == null) {
            return;
        }
        class165 var8 = new class165();
        var8.field2781 = arg0;
        var8.field2775 = var6;
        var8.field2770 = var7;
        var8.field2771 = var6.field2693[arg1];
        var8.field2772 = var6.field2695[arg1];
        var8.field2773 = arg1;
        var8.field2774 = var6.field2694 * arg2 * arg2 * var6.field2691[arg1] + 1024 >> 11;
        var8.field2787 = var6.field2692[arg1] & 0xFF;
        var8.field2776 = (arg1 << 8) - (var6.field2696[arg1] & 0x7FFF);
        var8.field2779 = 0;
        var8.field2780 = 0;
        var8.field2769 = 0;
        var8.field2782 = -1;
        var8.field2783 = 0;
        if (this.field2739[arg0] == 0) {
            var8.field2786 = class58.method1111(var7, this.method3044(var8), this.method3067(var8), this.method3091(var8));
        } else {
            var8.field2786 = class58.method1111(var7, this.method3044(var8), 0, this.method3091(var8));
            this.method3015(var8, var6.field2696[arg1] < 0);
        }
        if (var6.field2696[arg1] < 0) {
            var8.field2786.method1113(-1);
        }
        if (var8.field2772 >= 0) {
            class165 var9 = this.field2743[arg0][var8.field2772];
            if (var9 != null && var9.field2782 < 0) {
                this.field2727[arg0][var9.field2773] = null;
                var9.field2782 = 0;
            }
            this.field2743[arg0][var8.field2772] = var8;
        }
        this.field2750.field2765.method3190(var8);
        this.field2727[arg0][arg1] = var8;
    }

    @ObfuscatedName("fv.l(Lfn;ZI)V")
    public void method3015(class165 arg0, boolean arg1) {
        int var3 = arg0.field2770.field1131.length;
        int var5;
        if (arg1 && arg0.field2770.field1133) {
            int var4 = var3 + var3 - arg0.field2770.field1132;
            var5 = (int) ((long) this.field2739[arg0.field2781] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2786.method1255(true);
            }
        } else {
            var5 = (int) ((long) this.field2739[arg0.field2781] * (long) var3 >> 6);
        }
        arg0.field2786.method1129(var5);
    }

    @ObfuscatedName("fv.i(IIII)V")
    public void method3030(int arg0, int arg1, int arg2) {
        class165 var4 = this.field2727[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2727[arg0][arg1] = null;
        if ((this.field2735[arg0] & 0x2) == 0) {
            var4.field2782 = 0;
            return;
        }
        for (class165 var5 = (class165) this.field2750.field2765.method3195(); var5 != null; var5 = (class165) this.field2750.field2765.method3212()) {
            if (var4.field2781 == var5.field2781 && var5.field2782 < 0 && var4 != var5) {
                var4.field2782 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("fv.h(IIIB)V")
    public void method3017(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("fv.e(III)V")
    public void method3018(int arg0, int arg1) {
    }

    @ObfuscatedName("fv.a(IIB)V")
    public void method3019(int arg0, int arg1) {
        this.field2732[arg0] = arg1;
    }

    @ObfuscatedName("fv.c(II)V")
    public void method3020(int arg0) {
        for (class165 var2 = (class165) this.field2750.field2765.method3195(); var2 != null; var2 = (class165) this.field2750.field2765.method3212()) {
            if (arg0 < 0 || var2.field2781 == arg0) {
                if (var2.field2786 != null) {
                    var2.field2786.method1124(Statics.field1096 / 100);
                    if (var2.field2786.method1253()) {
                        this.field2750.field2766.method967(var2.field2786);
                    }
                    var2.method3122();
                }
                if (var2.field2782 < 0) {
                    this.field2727[var2.field2781][var2.field2773] = null;
                }
                var2.method3275();
            }
        }
    }

    @ObfuscatedName("fv.f(II)V")
    public void method3021(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3021(var2);
            }
            return;
        }
        this.field2726[arg0] = 12800;
        this.field2736[arg0] = 8192;
        this.field2728[arg0] = 16383;
        this.field2732[arg0] = 8192;
        this.field2742[arg0] = 0;
        this.field2734[arg0] = 8192;
        this.method3024(arg0);
        this.method3013(arg0);
        this.field2735[arg0] = 0;
        this.field2729[arg0] = 32767;
        this.field2738[arg0] = 256;
        this.field2739[arg0] = 0;
        this.method3027(arg0, 8192);
    }

    @ObfuscatedName("fv.q(II)V")
    public void method3022(int arg0) {
        for (class165 var2 = (class165) this.field2750.field2765.method3195(); var2 != null; var2 = (class165) this.field2750.field2765.method3212()) {
            if ((arg0 < 0 || var2.field2781 == arg0) && var2.field2782 < 0) {
                this.field2727[var2.field2781][var2.field2773] = null;
                var2.field2782 = 0;
            }
        }
    }

    @ObfuscatedName("fv.az(B)V")
    public void method3023() {
        this.method3020(-1);
        this.method3021(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2746[var1] = this.field2730[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2731[var2] = this.field2730[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("fv.ar(II)V")
    public void method3024(int arg0) {
        if ((this.field2735[arg0] & 0x2) == 0) {
            return;
        }
        for (class165 var2 = (class165) this.field2750.field2765.method3195(); var2 != null; var2 = (class165) this.field2750.field2765.method3212()) {
            if (var2.field2781 == arg0 && this.field2727[arg0][var2.field2773] == null && var2.field2782 < 0) {
                var2.field2782 = 0;
            }
        }
    }

    @ObfuscatedName("fv.ae(IB)V")
    public void method3013(int arg0) {
        if ((this.field2735[arg0] & 0x4) == 0) {
            return;
        }
        for (class165 var2 = (class165) this.field2750.field2765.method3195(); var2 != null; var2 = (class165) this.field2750.field2765.method3212()) {
            if (var2.field2781 == arg0) {
                var2.field2768 = 0;
            }
        }
    }

    @ObfuscatedName("fv.as(II)V")
    public void method3058(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3030(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3088(var6, var7, var8);
            } else {
                this.method3030(var6, var7, 64);
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
                this.field2731[var12] = (var14 << 14) + (this.field2731[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2731[var12] = (var14 << 7) + (this.field2731[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2742[var12] = (var14 << 7) + (this.field2742[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2742[var12] = (this.field2742[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2734[var12] = (var14 << 7) + (this.field2734[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2734[var12] = (this.field2734[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2726[var12] = (var14 << 7) + (this.field2726[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2726[var12] = (this.field2726[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2736[var12] = (var14 << 7) + (this.field2736[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2736[var12] = (this.field2736[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2728[var12] = (var14 << 7) + (this.field2728[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2728[var12] = (this.field2728[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2735[var12] |= 0x1;
                } else {
                    this.field2735[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2735[var12] |= 0x2;
                } else {
                    this.method3024(var12);
                    this.field2735[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2729[var12] = (var14 << 7) + (this.field2729[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2729[var12] = (this.field2729[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2729[var12] = (var14 << 7) + (this.field2729[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2729[var12] = (this.field2729[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3020(var12);
            }
            if (var13 == 121) {
                this.method3021(var12);
            }
            if (var13 == 123) {
                this.method3022(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2729[var12];
                if (var15 == 16384) {
                    this.field2738[var12] = (var14 << 7) + (this.field2738[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2729[var12];
                if (var16 == 16384) {
                    this.field2738[var12] = (this.field2738[var12] & 0xFFFFFF80) + var14;
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
                    this.field2735[var12] |= 0x4;
                } else {
                    this.method3013(var12);
                    this.field2735[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3027(var12, (var14 << 7) + (this.field2740[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3027(var12, (this.field2740[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3078(var17, this.field2731[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3018(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method3019(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3023();
            }
        }
    }

    @ObfuscatedName("fv.ad(III)V")
    public void method3027(int arg0, int arg1) {
        this.field2740[arg0] = arg1;
        this.field2741[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("fv.af(Lfn;B)I")
    public int method3044(class165 arg0) {
        int var2 = (arg0.field2778 * arg0.field2777 >> 12) + arg0.field2776;
        int var3 = ((this.field2732[arg0.field2781] - 8192) * this.field2738[arg0.field2781] >> 12) + var2;
        class163 var4 = arg0.field2771;
        if (var4.field2760 > 0 && (var4.field2753 > 0 || this.field2742[arg0.field2781] > 0)) {
            int var5 = var4.field2753 << 2;
            int var6 = var4.field2762 << 1;
            if (arg0.field2788 < var6) {
                var5 = arg0.field2788 * var5 / var6;
            }
            int var7 = (this.field2742[arg0.field2781] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2785 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2770.field1130 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1096 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("fv.ab(Lfn;B)I")
    public int method3067(class165 arg0) {
        class163 var2 = arg0.field2771;
        int var3 = this.field2726[arg0.field2781] * this.field2728[arg0.field2781] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2774 * var4 + 16384 >> 15;
        int var6 = this.field2723 * var5 + 128 >> 8;
        if (var2.field2761 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2779 * 1.953125E-5D * (double) var2.field2761) + 0.5D);
        }
        if (var2.field2754 != null) {
            int var7 = arg0.field2780;
            int var8 = var2.field2754[arg0.field2769 + 1];
            if (arg0.field2769 < var2.field2754.length - 2) {
                int var9 = (var2.field2754[arg0.field2769] & 0xFF) << 8;
                int var10 = (var2.field2754[arg0.field2769 + 2] & 0xFF) << 8;
                var8 += (var2.field2754[arg0.field2769 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2782 > 0 && var2.field2755 != null) {
            int var11 = arg0.field2782;
            int var12 = var2.field2755[arg0.field2783 + 1];
            if (arg0.field2783 < var2.field2755.length - 2) {
                int var13 = (var2.field2755[arg0.field2783] & 0xFF) << 8;
                int var14 = (var2.field2755[arg0.field2783 + 2] & 0xFF) << 8;
                var12 += (var2.field2755[arg0.field2783 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("fv.at(Lfn;I)I")
    public int method3091(class165 arg0) {
        int var2 = this.field2736[arg0.field2781];
        return var2 < 8192 ? arg0.field2787 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2787) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("fv.j()Lbz;")
    public synchronized class60 method991() {
        return this.field2750;
    }

    @ObfuscatedName("fv.g()Lbz;")
    public synchronized class60 method969() {
        return null;
    }

    @ObfuscatedName("fv.p()I")
    public synchronized int method974() {
        return 0;
    }

    @ObfuscatedName("fv.o([III)V")
    public synchronized void method1004(int[] arg0, int arg1, int arg2) {
        if (this.field2751.method2951()) {
            int var4 = this.field2725 * this.field2751.field2699 / Statics.field1096;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2748;
                if (this.field2749 - var5 >= 0L) {
                    this.field2748 = var5;
                    break;
                }
                int var7 = (int) ((this.field2749 - this.field2748 + (long) var4 - 1L) / (long) var4);
                this.field2748 += (long) var4 * (long) var7;
                this.field2750.method1004(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3003();
            } while (this.field2751.method2951());
        }
        this.field2750.method1004(arg0, arg1, arg2);
    }

    @ObfuscatedName("fv.x(I)V")
    public synchronized void method976(int arg0) {
        if (this.field2751.method2951()) {
            int var2 = this.field2725 * this.field2751.field2699 / Statics.field1096;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2748;
                if (this.field2749 - var3 >= 0L) {
                    this.field2748 = var3;
                    break;
                }
                int var5 = (int) ((this.field2749 - this.field2748 + (long) var2 - 1L) / (long) var2);
                this.field2748 += (long) var2 * (long) var5;
                this.field2750.method976(var5);
                arg0 -= var5;
                this.method3003();
            } while (this.field2751.method2951());
        }
        this.field2750.method976(arg0);
    }

    @ObfuscatedName("fv.ag(I)V")
    public void method3003() {
        int var1 = this.field2744;
        int var2 = this.field2747;
        long var3 = this.field2749;
        while (this.field2747 == var2) {
            while (this.field2751.field2702[var1] == var2) {
                this.field2751.method2967(var1);
                int var5 = this.field2751.method2984(var1);
                if (var5 == 1) {
                    this.field2751.method2942();
                    this.field2751.method2941(var1);
                    if (this.field2751.method2958()) {
                        if (!this.field2745 || var2 == 0) {
                            this.method3023();
                            this.field2751.method2937();
                            return;
                        }
                        this.field2751.method2946(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3058(var5);
                }
                this.field2751.method2943(var1);
                this.field2751.method2941(var1);
            }
            var1 = this.field2751.method2947();
            var2 = this.field2751.field2702[var1];
            var3 = this.field2751.method2952(var2);
        }
        this.field2744 = var1;
        this.field2747 = var2;
        this.field2749 = var3;
    }

    @ObfuscatedName("fv.ah(Lfn;B)Z")
    public boolean method3033(class165 arg0) {
        if (arg0.field2786 != null) {
            return false;
        }
        if (arg0.field2782 >= 0) {
            arg0.method3275();
            if (arg0.field2772 > 0 && this.field2743[arg0.field2781][arg0.field2772] == arg0) {
                this.field2743[arg0.field2781][arg0.field2772] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("fv.ac(Lfn;[IIII)Z")
    public boolean method3034(class165 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2784 = Statics.field1096 / 100;
        if (arg0.field2782 >= 0 && arg0.field2786 == null || arg0.field2786.method1127()) {
            arg0.method3122();
            arg0.method3275();
            if (arg0.field2772 > 0 && this.field2743[arg0.field2781][arg0.field2772] == arg0) {
                this.field2743[arg0.field2781][arg0.field2772] = null;
            }
            return true;
        }
        int var5 = arg0.field2778;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2734[arg0.field2781] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2778 = var6;
        }
        arg0.field2786.method1119(this.method3044(arg0));
        class163 var7 = arg0.field2771;
        boolean var8 = false;
        arg0.field2788++;
        arg0.field2785 += var7.field2760;
        double var9 = (double) ((arg0.field2773 - 60 << 8) + (arg0.field2778 * arg0.field2777 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2761 > 0) {
            if (var7.field2758 > 0) {
                arg0.field2779 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2758 * var9) + 0.5D);
            } else {
                arg0.field2779 += 128;
            }
        }
        if (var7.field2754 != null) {
            if (var7.field2756 > 0) {
                arg0.field2780 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2756 * var9) + 0.5D);
            } else {
                arg0.field2780 += 128;
            }
            while (arg0.field2769 < var7.field2754.length - 2 && arg0.field2780 > (var7.field2754[arg0.field2769 + 2] & 0xFF) << 8) {
                arg0.field2769 += 2;
            }
            if (arg0.field2769 == var7.field2754.length - 2 && var7.field2754[arg0.field2769 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2782 >= 0 && var7.field2755 != null && (this.field2735[arg0.field2781] & 0x1) == 0 && (arg0.field2772 < 0 || this.field2743[arg0.field2781][arg0.field2772] != arg0)) {
            if (var7.field2757 > 0) {
                arg0.field2782 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2757 * var9) + 0.5D);
            } else {
                arg0.field2782 += 128;
            }
            while (arg0.field2783 < var7.field2755.length - 2 && arg0.field2782 > (var7.field2755[arg0.field2783 + 2] & 0xFF) << 8) {
                arg0.field2783 += 2;
            }
            if (arg0.field2783 == var7.field2755.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2786.method1123(arg0.field2784, this.method3067(arg0), this.method3091(arg0));
            return false;
        }
        arg0.field2786.method1124(arg0.field2784);
        if (arg1 == null) {
            arg0.field2786.method976(arg3);
        } else {
            arg0.field2786.method1004(arg1, arg2, arg3);
        }
        if (arg0.field2786.method1253()) {
            this.field2750.field2766.method967(arg0.field2786);
        }
        arg0.method3122();
        if (arg0.field2782 >= 0) {
            arg0.method3275();
            if (arg0.field2772 > 0 && this.field2743[arg0.field2781][arg0.field2772] == arg0) {
                this.field2743[arg0.field2781][arg0.field2772] = null;
            }
        }
        return true;
    }
}
