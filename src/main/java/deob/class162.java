package deob;

@ObfuscatedName("fg")
public class class162 extends class60 {

    @ObfuscatedName("fg.g")
    public class174 field2743 = new class174(128);

    @ObfuscatedName("fg.v")
    public int field2719 = 256;

    @ObfuscatedName("fg.z")
    public int field2720 = 1000000;

    @ObfuscatedName("fg.h")
    public int[] field2718 = new int[16];

    @ObfuscatedName("fg.k")
    public int[] field2722 = new int[16];

    @ObfuscatedName("fg.l")
    public int[] field2723 = new int[16];

    @ObfuscatedName("fg.e")
    public int[] field2724 = new int[16];

    @ObfuscatedName("fg.j")
    public int[] field2727 = new int[16];

    @ObfuscatedName("fg.n")
    public int[] field2726 = new int[16];

    @ObfuscatedName("fg.f")
    public int[] field2734 = new int[16];

    @ObfuscatedName("fg.a")
    public int[] field2738 = new int[16];

    @ObfuscatedName("fg.i")
    public int[] field2729 = new int[16];

    @ObfuscatedName("fg.d")
    public int[] field2731 = new int[16];

    @ObfuscatedName("fg.m")
    public int[] field2721 = new int[16];

    @ObfuscatedName("fg.o")
    public int[] field2733 = new int[16];

    @ObfuscatedName("fg.b")
    public int[] field2725 = new int[16];

    @ObfuscatedName("fg.c")
    public int[] field2741 = new int[16];

    @ObfuscatedName("fg.w")
    public int[] field2736 = new int[16];

    @ObfuscatedName("fg.u")
    public class165[][] field2737 = new class165[16][128];

    @ObfuscatedName("fg.ac")
    public class165[][] field2728 = new class165[16][128];

    @ObfuscatedName("fg.ap")
    public class160 field2739 = new class160();

    @ObfuscatedName("fg.ai")
    public boolean field2740;

    @ObfuscatedName("fg.as")
    public int field2735;

    @ObfuscatedName("fg.aa")
    public int field2742;

    @ObfuscatedName("fg.aq")
    public long field2732;

    @ObfuscatedName("fg.aw")
    public long field2744;

    @ObfuscatedName("fg.am")
    public class164 field2745 = new class164(this);

    public class162() {
        this.method3104();
    }

    @ObfuscatedName("fg.g(II)V")
    public synchronized void method3068(int arg0) {
        this.field2719 = arg0;
    }

    @ObfuscatedName("fg.v(I)I")
    public int method3122() {
        return this.field2719;
    }

    @ObfuscatedName("fg.z(Lfz;Lec;Lbu;II)Z")
    public synchronized boolean method3099(class158 arg0, class146 arg1, class53 arg2, int arg3) {
        arg0.method2946();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class175 var7 = (class175) arg0.field2686.method3204(); var7 != null; var7 = (class175) arg0.field2686.method3203()) {
            int var8 = (int) var7.field2875;
            class159 var9 = (class159) this.field2743.method3201((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method2713(var8);
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
                this.field2743.method3202(var11, (long) var8);
            }
            if (!var9.method2955(arg2, var7.field2855, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method2948();
        }
        return var5;
    }

    @ObfuscatedName("fg.h(B)V")
    public synchronized void method3038() {
        for (class159 var1 = (class159) this.field2743.method3204(); var1 != null; var1 = (class159) this.field2743.method3203()) {
            var1.method2963();
        }
    }

    @ObfuscatedName("fg.k(I)V")
    public synchronized void method3039() {
        for (class159 var1 = (class159) this.field2743.method3204(); var1 != null; var1 = (class159) this.field2743.method3203()) {
            var1.method3322();
        }
    }

    @ObfuscatedName("fg.f(Lfz;ZI)V")
    public synchronized void method3040(class158 arg0, boolean arg1) {
        this.method3041();
        this.field2739.method3008(arg0.field2687);
        this.field2740 = arg1;
        this.field2732 = 0L;
        int var3 = this.field2739.method2988();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2739.method3004(var4);
            this.field2739.method2969(var4);
            this.field2739.method2996(var4);
        }
        this.field2735 = this.field2739.method2977();
        this.field2742 = this.field2739.field2708[this.field2735];
        this.field2744 = this.field2739.method3001(this.field2742);
    }

    @ObfuscatedName("fg.i(I)V")
    public synchronized void method3041() {
        this.field2739.method2966();
        this.method3104();
    }

    @ObfuscatedName("fg.y(I)Z")
    public synchronized boolean method3042() {
        return this.field2739.method3011();
    }

    @ObfuscatedName("fg.p(IIS)V")
    public synchronized void method3034(int arg0, int arg1) {
        this.method3044(arg0, arg1);
    }

    @ObfuscatedName("fg.q(IIS)V")
    public void method3044(int arg0, int arg1) {
        this.field2724[arg0] = arg1;
        this.field2726[arg0] = arg1 & 0xFFFFFF80;
        this.method3097(arg0, arg1);
    }

    @ObfuscatedName("fg.t(IIB)V")
    public void method3097(int arg0, int arg1) {
        if (this.field2727[arg0] != arg1) {
            this.field2727[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2728[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("fg.r(IIII)V")
    public void method3046(int arg0, int arg1, int arg2) {
        this.method3048(arg0, arg1, 64);
        if ((this.field2731[arg0] & 0x2) != 0) {
            for (class165 var4 = (class165) this.field2745.field2763.method3230(); var4 != null; var4 = (class165) this.field2745.field2763.method3240()) {
                if (var4.field2778 == arg0 && var4.field2782 < 0) {
                    this.field2737[arg0][var4.field2773] = null;
                    this.field2737[arg0][arg1] = var4;
                    int var5 = (var4.field2770 * var4.field2769 >> 12) + var4.field2787;
                    var4.field2787 += arg1 - var4.field2773 << 8;
                    var4.field2770 = var5 - var4.field2787;
                    var4.field2769 = 4096;
                    var4.field2773 = arg1;
                    return;
                }
            }
        }
        class159 var6 = (class159) this.field2743.method3201((long) this.field2727[arg0]);
        if (var6 == null) {
            return;
        }
        class56 var7 = var6.field2689[arg1];
        if (var7 == null) {
            return;
        }
        class165 var8 = new class165();
        var8.field2778 = arg0;
        var8.field2776 = var6;
        var8.field2780 = var7;
        var8.field2771 = var6.field2697[arg1];
        var8.field2772 = var6.field2694[arg1];
        var8.field2773 = arg1;
        var8.field2774 = var6.field2693 * arg2 * arg2 * var6.field2691[arg1] + 1024 >> 11;
        var8.field2775 = var6.field2692[arg1] & 0xFF;
        var8.field2787 = (arg1 << 8) - (var6.field2690[arg1] & 0x7FFF);
        var8.field2790 = 0;
        var8.field2781 = 0;
        var8.field2779 = 0;
        var8.field2782 = -1;
        var8.field2783 = 0;
        if (this.field2725[arg0] == 0) {
            var8.field2786 = class58.method1123(var7, this.method3059(var8), this.method3119(var8), this.method3061(var8));
        } else {
            var8.field2786 = class58.method1123(var7, this.method3059(var8), 0, this.method3061(var8));
            this.method3047(var8, var6.field2690[arg1] < 0);
        }
        if (var6.field2690[arg1] < 0) {
            var8.field2786.method1154(-1);
        }
        if (var8.field2772 >= 0) {
            class165 var9 = this.field2728[arg0][var8.field2772];
            if (var9 != null && var9.field2782 < 0) {
                this.field2737[arg0][var9.field2773] = null;
                var9.field2782 = 0;
            }
            this.field2728[arg0][var8.field2772] = var8;
        }
        this.field2745.field2763.method3232(var8);
        this.field2737[arg0][arg1] = var8;
    }

    @ObfuscatedName("fg.x(Lfo;ZI)V")
    public void method3047(class165 arg0, boolean arg1) {
        int var3 = arg0.field2780.field1124.length;
        int var5;
        if (arg1 && arg0.field2780.field1125) {
            int var4 = var3 + var3 - arg0.field2780.field1128;
            var5 = (int) ((long) this.field2725[arg0.field2778] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2786.method1131(true);
            }
        } else {
            var5 = (int) ((long) this.field2725[arg0.field2778] * (long) var3 >> 6);
        }
        arg0.field2786.method1153(var5);
    }

    @ObfuscatedName("fg.s(IIIB)V")
    public void method3048(int arg0, int arg1, int arg2) {
        class165 var4 = this.field2737[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2737[arg0][arg1] = null;
        if ((this.field2731[arg0] & 0x2) == 0) {
            var4.field2782 = 0;
            return;
        }
        for (class165 var5 = (class165) this.field2745.field2763.method3237(); var5 != null; var5 = (class165) this.field2745.field2763.method3239()) {
            if (var4.field2778 == var5.field2778 && var5.field2782 < 0 && var4 != var5) {
                var4.field2782 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("fg.d(IIII)V")
    public void method3049(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("fg.m(III)V")
    public void method3050(int arg0, int arg1) {
    }

    @ObfuscatedName("fg.o(III)V")
    public void method3062(int arg0, int arg1) {
        this.field2734[arg0] = arg1;
    }

    @ObfuscatedName("fg.b(IB)V")
    public void method3052(int arg0) {
        for (class165 var2 = (class165) this.field2745.field2763.method3237(); var2 != null; var2 = (class165) this.field2745.field2763.method3239()) {
            if (arg0 < 0 || var2.field2778 == arg0) {
                if (var2.field2786 != null) {
                    var2.field2786.method1191(Statics.field1074 / 100);
                    if (var2.field2786.method1138()) {
                        this.field2745.field2764.method993(var2.field2786);
                    }
                    var2.method3153();
                }
                if (var2.field2782 < 0) {
                    this.field2737[var2.field2778][var2.field2773] = null;
                }
                var2.method3322();
            }
        }
    }

    @ObfuscatedName("fg.aw(II)V")
    public void method3091(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3091(var2);
            }
            return;
        }
        this.field2718[arg0] = 12800;
        this.field2722[arg0] = 8192;
        this.field2723[arg0] = 16383;
        this.field2734[arg0] = 8192;
        this.field2738[arg0] = 0;
        this.field2729[arg0] = 8192;
        this.method3056(arg0);
        this.method3067(arg0);
        this.field2731[arg0] = 0;
        this.field2721[arg0] = 32767;
        this.field2733[arg0] = 256;
        this.field2725[arg0] = 0;
        this.method3058(arg0, 8192);
    }

    @ObfuscatedName("fg.am(II)V")
    public void method3069(int arg0) {
        for (class165 var2 = (class165) this.field2745.field2763.method3237(); var2 != null; var2 = (class165) this.field2745.field2763.method3239()) {
            if ((arg0 < 0 || var2.field2778 == arg0) && var2.field2782 < 0) {
                this.field2737[var2.field2778][var2.field2773] = null;
                var2.field2782 = 0;
            }
        }
    }

    @ObfuscatedName("fg.av(B)V")
    public void method3104() {
        this.method3052(-1);
        this.method3091(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2727[var1] = this.field2724[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2726[var2] = this.field2724[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("fg.ao(II)V")
    public void method3056(int arg0) {
        if ((this.field2731[arg0] & 0x2) == 0) {
            return;
        }
        for (class165 var2 = (class165) this.field2745.field2763.method3237(); var2 != null; var2 = (class165) this.field2745.field2763.method3239()) {
            if (var2.field2778 == arg0 && this.field2737[arg0][var2.field2773] == null && var2.field2782 < 0) {
                var2.field2782 = 0;
            }
        }
    }

    @ObfuscatedName("fg.ag(IB)V")
    public void method3067(int arg0) {
        if ((this.field2731[arg0] & 0x4) == 0) {
            return;
        }
        for (class165 var2 = (class165) this.field2745.field2763.method3237(); var2 != null; var2 = (class165) this.field2745.field2763.method3239()) {
            if (var2.field2778 == arg0) {
                var2.field2788 = 0;
            }
        }
    }

    @ObfuscatedName("fg.ay(IB)V")
    public void method3057(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3048(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3046(var6, var7, var8);
            } else {
                this.method3048(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3049(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2726[var12] = (var14 << 14) + (this.field2726[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2726[var12] = (var14 << 7) + (this.field2726[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2738[var12] = (var14 << 7) + (this.field2738[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2738[var12] = (this.field2738[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2729[var12] = (var14 << 7) + (this.field2729[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2729[var12] = (this.field2729[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2718[var12] = (var14 << 7) + (this.field2718[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2718[var12] = (this.field2718[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2722[var12] = (var14 << 7) + (this.field2722[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2722[var12] = (this.field2722[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2723[var12] = (var14 << 7) + (this.field2723[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2723[var12] = (this.field2723[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2731[var12] |= 0x1;
                } else {
                    this.field2731[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2731[var12] |= 0x2;
                } else {
                    this.method3056(var12);
                    this.field2731[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2721[var12] = (var14 << 7) + (this.field2721[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2721[var12] = (this.field2721[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2721[var12] = (var14 << 7) + (this.field2721[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2721[var12] = (this.field2721[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3052(var12);
            }
            if (var13 == 121) {
                this.method3091(var12);
            }
            if (var13 == 123) {
                this.method3069(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2721[var12];
                if (var15 == 16384) {
                    this.field2733[var12] = (var14 << 7) + (this.field2733[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2721[var12];
                if (var16 == 16384) {
                    this.field2733[var12] = (this.field2733[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2725[var12] = (var14 << 7) + (this.field2725[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2725[var12] = (this.field2725[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2731[var12] |= 0x4;
                } else {
                    this.method3067(var12);
                    this.field2731[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3058(var12, (var14 << 7) + (this.field2741[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3058(var12, (this.field2741[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3097(var17, this.field2726[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3050(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method3062(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3104();
            }
        }
    }

    @ObfuscatedName("fg.ab(IIB)V")
    public void method3058(int arg0, int arg1) {
        this.field2741[arg0] = arg1;
        this.field2736[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("fg.al(Lfo;B)I")
    public int method3059(class165 arg0) {
        int var2 = (arg0.field2770 * arg0.field2769 >> 12) + arg0.field2787;
        int var3 = ((this.field2734[arg0.field2778] - 8192) * this.field2733[arg0.field2778] >> 12) + var2;
        class163 var4 = arg0.field2771;
        if (var4.field2750 > 0 && (var4.field2753 > 0 || this.field2738[arg0.field2778] > 0)) {
            int var5 = var4.field2753 << 2;
            int var6 = var4.field2755 << 1;
            if (arg0.field2784 < var6) {
                var5 = arg0.field2784 * var5 / var6;
            }
            int var7 = (this.field2738[arg0.field2778] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2785 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2780.field1126 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1074 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("fg.ae(Lfo;I)I")
    public int method3119(class165 arg0) {
        class163 var2 = arg0.field2771;
        int var3 = this.field2718[arg0.field2778] * this.field2723[arg0.field2778] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2774 * var4 + 16384 >> 15;
        int var6 = this.field2719 * var5 + 128 >> 8;
        if (var2.field2749 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2790 * 1.953125E-5D * (double) var2.field2749) + 0.5D);
        }
        if (var2.field2752 != null) {
            int var7 = arg0.field2781;
            int var8 = var2.field2752[arg0.field2779 + 1];
            if (arg0.field2779 < var2.field2752.length - 2) {
                int var9 = (var2.field2752[arg0.field2779] & 0xFF) << 8;
                int var10 = (var2.field2752[arg0.field2779 + 2] & 0xFF) << 8;
                var8 += (var2.field2752[arg0.field2779 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2782 > 0 && var2.field2757 != null) {
            int var11 = arg0.field2782;
            int var12 = var2.field2757[arg0.field2783 + 1];
            if (arg0.field2783 < var2.field2757.length - 2) {
                int var13 = (var2.field2757[arg0.field2783] & 0xFF) << 8;
                int var14 = (var2.field2757[arg0.field2783 + 2] & 0xFF) << 8;
                var12 += (var2.field2757[arg0.field2783 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("fg.af(Lfo;I)I")
    public int method3061(class165 arg0) {
        int var2 = this.field2722[arg0.field2778];
        return var2 < 8192 ? arg0.field2775 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2775) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("fg.l()Lbn;")
    public synchronized class60 method1004() {
        return this.field2745;
    }

    @ObfuscatedName("fg.e()Lbn;")
    public synchronized class60 method998() {
        return null;
    }

    @ObfuscatedName("fg.j()I")
    public synchronized int method983() {
        return 0;
    }

    @ObfuscatedName("fg.n([III)V")
    public synchronized void method984(int[] arg0, int arg1, int arg2) {
        if (this.field2739.method3011()) {
            int var4 = this.field2720 * this.field2739.field2698 / Statics.field1074;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2732;
                if (this.field2744 - var5 >= 0L) {
                    this.field2732 = var5;
                    break;
                }
                int var7 = (int) ((this.field2744 - this.field2732 + (long) var4 - 1L) / (long) var4);
                this.field2732 += (long) var4 * (long) var7;
                this.field2745.method984(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3063();
            } while (this.field2739.method3011());
        }
        this.field2745.method984(arg0, arg1, arg2);
    }

    @ObfuscatedName("fg.a(I)V")
    public synchronized void method994(int arg0) {
        if (this.field2739.method3011()) {
            int var2 = this.field2720 * this.field2739.field2698 / Statics.field1074;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2732;
                if (this.field2744 - var3 >= 0L) {
                    this.field2732 = var3;
                    break;
                }
                int var5 = (int) ((this.field2744 - this.field2732 + (long) var2 - 1L) / (long) var2);
                this.field2732 += (long) var2 * (long) var5;
                this.field2745.method994(var5);
                arg0 -= var5;
                this.method3063();
            } while (this.field2739.method3011());
        }
        this.field2745.method994(arg0);
    }

    @ObfuscatedName("fg.aj(B)V")
    public void method3063() {
        int var1 = this.field2735;
        int var2 = this.field2742;
        long var3 = this.field2744;
        while (this.field2742 == var2) {
            while (this.field2739.field2708[var1] == var2) {
                this.field2739.method3004(var1);
                int var5 = this.field2739.method2972(var1);
                if (var5 == 1) {
                    this.field2739.method2971();
                    this.field2739.method2996(var1);
                    if (this.field2739.method2978()) {
                        if (!this.field2740 || var2 == 0) {
                            this.method3104();
                            this.field2739.method2966();
                            return;
                        }
                        this.field2739.method2979(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3057(var5);
                }
                this.field2739.method2969(var1);
                this.field2739.method2996(var1);
            }
            var1 = this.field2739.method2977();
            var2 = this.field2739.field2708[var1];
            var3 = this.field2739.method3001(var2);
        }
        this.field2735 = var1;
        this.field2742 = var2;
        this.field2744 = var3;
    }

    @ObfuscatedName("fg.ah(Lfo;I)Z")
    public boolean method3064(class165 arg0) {
        if (arg0.field2786 != null) {
            return false;
        }
        if (arg0.field2782 >= 0) {
            arg0.method3322();
            if (arg0.field2772 > 0 && this.field2728[arg0.field2778][arg0.field2772] == arg0) {
                this.field2728[arg0.field2778][arg0.field2772] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("fg.au(Lfo;[IIIB)Z")
    public boolean method3065(class165 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2777 = Statics.field1074 / 100;
        if (arg0.field2782 >= 0 && arg0.field2786 == null || arg0.field2786.method1128()) {
            arg0.method3153();
            arg0.method3322();
            if (arg0.field2772 > 0 && this.field2728[arg0.field2778][arg0.field2772] == arg0) {
                this.field2728[arg0.field2778][arg0.field2772] = null;
            }
            return true;
        }
        int var5 = arg0.field2769;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2729[arg0.field2778] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2769 = var6;
        }
        arg0.field2786.method1238(this.method3059(arg0));
        class163 var7 = arg0.field2771;
        boolean var8 = false;
        arg0.field2784++;
        arg0.field2785 += var7.field2750;
        double var9 = (double) ((arg0.field2773 - 60 << 8) + (arg0.field2770 * arg0.field2769 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2749 > 0) {
            if (var7.field2748 > 0) {
                arg0.field2790 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2748 * var9) + 0.5D);
            } else {
                arg0.field2790 += 128;
            }
        }
        if (var7.field2752 != null) {
            if (var7.field2747 > 0) {
                arg0.field2781 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2747 * var9) + 0.5D);
            } else {
                arg0.field2781 += 128;
            }
            while (arg0.field2779 < var7.field2752.length - 2 && arg0.field2781 > (var7.field2752[arg0.field2779 + 2] & 0xFF) << 8) {
                arg0.field2779 += 2;
            }
            if (arg0.field2779 == var7.field2752.length - 2 && var7.field2752[arg0.field2779 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2782 >= 0 && var7.field2757 != null && (this.field2731[arg0.field2778] & 0x1) == 0 && (arg0.field2772 < 0 || this.field2728[arg0.field2778][arg0.field2772] != arg0)) {
            if (var7.field2751 > 0) {
                arg0.field2782 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2751 * var9) + 0.5D);
            } else {
                arg0.field2782 += 128;
            }
            while (arg0.field2783 < var7.field2757.length - 2 && arg0.field2782 > (var7.field2757[arg0.field2783 + 2] & 0xFF) << 8) {
                arg0.field2783 += 2;
            }
            if (arg0.field2783 == var7.field2757.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2786.method1134(arg0.field2777, this.method3119(arg0), this.method3061(arg0));
            return false;
        }
        arg0.field2786.method1191(arg0.field2777);
        if (arg1 == null) {
            arg0.field2786.method994(arg3);
        } else {
            arg0.field2786.method984(arg1, arg2, arg3);
        }
        if (arg0.field2786.method1138()) {
            this.field2745.field2764.method993(arg0.field2786);
        }
        arg0.method3153();
        if (arg0.field2782 >= 0) {
            arg0.method3322();
            if (arg0.field2772 > 0 && this.field2728[arg0.field2778][arg0.field2772] == arg0) {
                this.field2728[arg0.field2778][arg0.field2772] = null;
            }
        }
        return true;
    }
}
