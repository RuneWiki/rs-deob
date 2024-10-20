package deob;

@ObfuscatedName("fp")
public class class165 extends class61 {

    @ObfuscatedName("fp.l")
    public class177 field2723 = new class177(128);

    @ObfuscatedName("fp.y")
    public int field2732 = 256;

    @ObfuscatedName("fp.g")
    public int field2717 = 1000000;

    @ObfuscatedName("fp.j")
    public int[] field2718 = new int[16];

    @ObfuscatedName("fp.c")
    public int[] field2719 = new int[16];

    @ObfuscatedName("fp.x")
    public int[] field2720 = new int[16];

    @ObfuscatedName("fp.f")
    public int[] field2721 = new int[16];

    @ObfuscatedName("fp.t")
    public int[] field2737 = new int[16];

    @ObfuscatedName("fp.n")
    public int[] field2743 = new int[16];

    @ObfuscatedName("fp.p")
    public int[] field2747 = new int[16];

    @ObfuscatedName("fp.a")
    public int[] field2730 = new int[16];

    @ObfuscatedName("fp.o")
    public int[] field2726 = new int[16];

    @ObfuscatedName("fp.e")
    public int[] field2728 = new int[16];

    @ObfuscatedName("fp.h")
    public int[] field2722 = new int[16];

    @ObfuscatedName("fp.k")
    public int[] field2740 = new int[16];

    @ObfuscatedName("fp.v")
    public int[] field2731 = new int[16];

    @ObfuscatedName("fp.m")
    public int[] field2735 = new int[16];

    @ObfuscatedName("fp.d")
    public int[] field2733 = new int[16];

    @ObfuscatedName("fp.q")
    public class168[][] field2734 = new class168[16][128];

    @ObfuscatedName("fp.ak")
    public class168[][] field2715 = new class168[16][128];

    @ObfuscatedName("fp.ah")
    public class163 field2736 = new class163();

    @ObfuscatedName("fp.an")
    public boolean field2724;

    @ObfuscatedName("fp.aw")
    public int field2738;

    @ObfuscatedName("fp.az")
    public int field2739;

    @ObfuscatedName("fp.ad")
    public long field2729;

    @ObfuscatedName("fp.ag")
    public long field2741;

    @ObfuscatedName("fp.aa")
    public class167 field2742 = new class167(this);

    public class165() {
        this.method3106();
    }

    @ObfuscatedName("fp.l(IB)V")
    public synchronized void method3087(int arg0) {
        this.field2732 = arg0;
    }

    @ObfuscatedName("fp.y(I)I")
    public int method3114() {
        return this.field2732;
    }

    @ObfuscatedName("fp.g(Lfq;Leo;Lbl;II)Z")
    public synchronized boolean method3093(class161 arg0, class149 arg1, class54 arg2, int arg3) {
        arg0.method3000();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class178 var7 = (class178) arg0.field2676.method3257(); var7 != null; var7 = (class178) arg0.field2676.method3258()) {
            int var8 = (int) var7.field2886;
            class162 var9 = (class162) this.field2723.method3254((long) var8);
            if (var9 == null) {
                var9 = Statics.method2524(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field2723.method3260(var9, (long) var8);
            }
            if (!var9.method3010(arg2, var7.field2865, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3006();
        }
        return var5;
    }

    @ObfuscatedName("fp.j(B)V")
    public synchronized void method3090() {
        for (class162 var1 = (class162) this.field2723.method3257(); var1 != null; var1 = (class162) this.field2723.method3258()) {
            var1.method3011();
        }
    }

    @ObfuscatedName("fp.w(I)V")
    public synchronized void method3091() {
        for (class162 var1 = (class162) this.field2723.method3257(); var1 != null; var1 = (class162) this.field2723.method3258()) {
            var1.method3375();
        }
    }

    @ObfuscatedName("fp.n(Lfq;ZI)V")
    public synchronized void method3086(class161 arg0, boolean arg1) {
        this.method3136();
        this.field2736.method3047(arg0.field2675);
        this.field2724 = arg1;
        this.field2729 = 0L;
        int var3 = this.field2736.method3021();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2736.method3023(var4);
            this.field2736.method3026(var4);
            this.field2736.method3054(var4);
        }
        this.field2738 = this.field2736.method3048();
        this.field2739 = this.field2736.field2691[this.field2738];
        this.field2741 = this.field2736.method3030(this.field2739);
    }

    @ObfuscatedName("fp.a(I)V")
    public synchronized void method3136() {
        this.field2736.method3050();
        this.method3106();
    }

    @ObfuscatedName("fp.o(I)Z")
    public synchronized boolean method3188() {
        return this.field2736.method3024();
    }

    @ObfuscatedName("fp.b(III)V")
    public synchronized void method3110(int arg0, int arg1) {
        this.method3147(arg0, arg1);
    }

    @ObfuscatedName("fp.r(III)V")
    public void method3147(int arg0, int arg1) {
        this.field2721[arg0] = arg1;
        this.field2743[arg0] = arg1 & 0xFFFFFF80;
        this.method3096(arg0, arg1);
    }

    @ObfuscatedName("fp.z(IIB)V")
    public void method3096(int arg0, int arg1) {
        if (this.field2737[arg0] != arg1) {
            this.field2737[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2715[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("fp.u(IIII)V")
    public void method3097(int arg0, int arg1, int arg2) {
        this.method3099(arg0, arg1, 64);
        if ((this.field2728[arg0] & 0x2) != 0) {
            for (class168 var4 = (class168) this.field2742.field2759.method3292(); var4 != null; var4 = (class168) this.field2742.field2759.method3314()) {
                if (var4.field2785 == arg0 && var4.field2779 < 0) {
                    this.field2734[arg0][var4.field2765] = null;
                    this.field2734[arg0][arg1] = var4;
                    int var5 = (var4.field2774 * var4.field2770 >> 12) + var4.field2773;
                    var4.field2773 += arg1 - var4.field2765 << 8;
                    var4.field2774 = var5 - var4.field2773;
                    var4.field2770 = 4096;
                    var4.field2765 = arg1;
                    return;
                }
            }
        }
        class162 var6 = (class162) this.field2723.method3254((long) this.field2737[arg0]);
        if (var6 == null) {
            return;
        }
        class57 var7 = var6.field2677[arg1];
        if (var7 == null) {
            return;
        }
        class168 var8 = new class168();
        var8.field2785 = arg0;
        var8.field2766 = var6;
        var8.field2767 = var7;
        var8.field2769 = var6.field2682[arg1];
        var8.field2786 = var6.field2683[arg1];
        var8.field2765 = arg1;
        var8.field2771 = var6.field2685 * arg2 * arg2 * var6.field2680[arg1] + 1024 >> 11;
        var8.field2790 = var6.field2686[arg1] & 0xFF;
        var8.field2773 = (arg1 << 8) - (var6.field2679[arg1] & 0x7FFF);
        var8.field2768 = 0;
        var8.field2777 = 0;
        var8.field2778 = 0;
        var8.field2779 = -1;
        var8.field2780 = 0;
        if (this.field2731[arg0] == 0) {
            var8.field2776 = class59.method1101(var7, this.method3144(var8), this.method3190(var8), this.method3113(var8));
        } else {
            var8.field2776 = class59.method1101(var7, this.method3144(var8), 0, this.method3113(var8));
            this.method3098(var8, var6.field2679[arg1] < 0);
        }
        if (var6.field2679[arg1] < 0) {
            var8.field2776.method1094(-1);
        }
        if (var8.field2786 >= 0) {
            class168 var9 = this.field2715[arg0][var8.field2786];
            if (var9 != null && var9.field2779 < 0) {
                this.field2734[arg0][var9.field2765] = null;
                var9.field2779 = 0;
            }
            this.field2715[arg0][var8.field2786] = var8;
        }
        this.field2742.field2759.method3278(var8);
        this.field2734[arg0][arg1] = var8;
    }

    @ObfuscatedName("fp.s(Lfz;ZB)V")
    public void method3098(class168 arg0, boolean arg1) {
        int var3 = arg0.field2767.field1129.length;
        int var5;
        if (arg1 && arg0.field2767.field1130) {
            int var4 = var3 + var3 - arg0.field2767.field1128;
            var5 = (int) ((long) this.field2731[arg0.field2785] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2776.method1100(true);
            }
        } else {
            var5 = (int) ((long) this.field2731[arg0.field2785] * (long) var3 >> 6);
        }
        arg0.field2776.method1099(var5);
    }

    @ObfuscatedName("fp.i(IIII)V")
    public void method3099(int arg0, int arg1, int arg2) {
        class168 var4 = this.field2734[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2734[arg0][arg1] = null;
        if ((this.field2728[arg0] & 0x2) == 0) {
            var4.field2779 = 0;
            return;
        }
        for (class168 var5 = (class168) this.field2742.field2759.method3304(); var5 != null; var5 = (class168) this.field2742.field2759.method3297()) {
            if (var4.field2785 == var5.field2785 && var5.field2779 < 0 && var4 != var5) {
                var4.field2779 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("fp.e(IIIB)V")
    public void method3100(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("fp.q(IIB)V")
    public void method3101(int arg0, int arg1) {
    }

    @ObfuscatedName("fp.ak(IIB)V")
    public void method3102(int arg0, int arg1) {
        this.field2747[arg0] = arg1;
    }

    @ObfuscatedName("fp.ah(II)V")
    public void method3103(int arg0) {
        for (class168 var2 = (class168) this.field2742.field2759.method3304(); var2 != null; var2 = (class168) this.field2742.field2759.method3297()) {
            if (arg0 < 0 || var2.field2785 == arg0) {
                if (var2.field2776 != null) {
                    var2.field2776.method1104(Statics.field1086 / 100);
                    if (var2.field2776.method1168()) {
                        this.field2742.field2758.method957(var2.field2776);
                    }
                    var2.method3206();
                }
                if (var2.field2779 < 0) {
                    this.field2734[var2.field2785][var2.field2765] = null;
                }
                var2.method3375();
            }
        }
    }

    @ObfuscatedName("fp.aw(II)V")
    public void method3104(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3104(var2);
            }
            return;
        }
        this.field2718[arg0] = 12800;
        this.field2719[arg0] = 8192;
        this.field2720[arg0] = 16383;
        this.field2747[arg0] = 8192;
        this.field2730[arg0] = 0;
        this.field2726[arg0] = 8192;
        this.method3107(arg0);
        this.method3108(arg0);
        this.field2728[arg0] = 0;
        this.field2722[arg0] = 32767;
        this.field2740[arg0] = 256;
        this.field2731[arg0] = 0;
        this.method3145(arg0, 8192);
    }

    @ObfuscatedName("fp.aa(II)V")
    public void method3142(int arg0) {
        for (class168 var2 = (class168) this.field2742.field2759.method3304(); var2 != null; var2 = (class168) this.field2742.field2759.method3297()) {
            if ((arg0 < 0 || var2.field2785 == arg0) && var2.field2779 < 0) {
                this.field2734[var2.field2785][var2.field2765] = null;
                var2.field2779 = 0;
            }
        }
    }

    @ObfuscatedName("fp.au(I)V")
    public void method3106() {
        this.method3103(-1);
        this.method3104(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2737[var1] = this.field2721[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2743[var2] = this.field2721[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("fp.aq(II)V")
    public void method3107(int arg0) {
        if ((this.field2728[arg0] & 0x2) == 0) {
            return;
        }
        for (class168 var2 = (class168) this.field2742.field2759.method3304(); var2 != null; var2 = (class168) this.field2742.field2759.method3297()) {
            if (var2.field2785 == arg0 && this.field2734[arg0][var2.field2765] == null && var2.field2779 < 0) {
                var2.field2779 = 0;
            }
        }
    }

    @ObfuscatedName("fp.am(IB)V")
    public void method3108(int arg0) {
        if ((this.field2728[arg0] & 0x4) == 0) {
            return;
        }
        for (class168 var2 = (class168) this.field2742.field2759.method3304(); var2 != null; var2 = (class168) this.field2742.field2759.method3297()) {
            if (var2.field2785 == arg0) {
                var2.field2772 = 0;
            }
        }
    }

    @ObfuscatedName("fp.ax(II)V")
    public void method3092(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3099(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3097(var6, var7, var8);
            } else {
                this.method3099(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3100(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2743[var12] = (var14 << 14) + (this.field2743[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2743[var12] = (var14 << 7) + (this.field2743[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2730[var12] = (var14 << 7) + (this.field2730[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2730[var12] = (this.field2730[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2726[var12] = (var14 << 7) + (this.field2726[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2726[var12] = (this.field2726[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2718[var12] = (var14 << 7) + (this.field2718[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2718[var12] = (this.field2718[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2719[var12] = (var14 << 7) + (this.field2719[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2719[var12] = (this.field2719[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2720[var12] = (var14 << 7) + (this.field2720[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2720[var12] = (this.field2720[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2728[var12] |= 0x1;
                } else {
                    this.field2728[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2728[var12] |= 0x2;
                } else {
                    this.method3107(var12);
                    this.field2728[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2722[var12] = (var14 << 7) + (this.field2722[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2722[var12] = (this.field2722[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2722[var12] = (var14 << 7) + (this.field2722[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2722[var12] = (this.field2722[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3103(var12);
            }
            if (var13 == 121) {
                this.method3104(var12);
            }
            if (var13 == 123) {
                this.method3142(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2722[var12];
                if (var15 == 16384) {
                    this.field2740[var12] = (var14 << 7) + (this.field2740[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2722[var12];
                if (var16 == 16384) {
                    this.field2740[var12] = (this.field2740[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2731[var12] = (var14 << 7) + (this.field2731[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2731[var12] = (this.field2731[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2728[var12] |= 0x4;
                } else {
                    this.method3108(var12);
                    this.field2728[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3145(var12, (var14 << 7) + (this.field2735[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3145(var12, (this.field2735[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3096(var17, this.field2743[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3101(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method3102(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3106();
            }
        }
    }

    @ObfuscatedName("fp.af(IIB)V")
    public void method3145(int arg0, int arg1) {
        this.field2735[arg0] = arg1;
        this.field2733[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("fp.av(Lfz;I)I")
    public int method3144(class168 arg0) {
        int var2 = (arg0.field2774 * arg0.field2770 >> 12) + arg0.field2773;
        int var3 = ((this.field2747[arg0.field2785] - 8192) * this.field2740[arg0.field2785] >> 12) + var2;
        class166 var4 = arg0.field2769;
        if (var4.field2751 > 0 && (var4.field2757 > 0 || this.field2730[arg0.field2785] > 0)) {
            int var5 = var4.field2757 << 2;
            int var6 = var4.field2756 << 1;
            if (arg0.field2781 < var6) {
                var5 = arg0.field2781 * var5 / var6;
            }
            int var7 = (this.field2730[arg0.field2785] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2782 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2767.field1127 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1086 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("fp.ao(Lfz;I)I")
    public int method3190(class168 arg0) {
        class166 var2 = arg0.field2769;
        int var3 = this.field2720[arg0.field2785] * this.field2718[arg0.field2785] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2771 * var4 + 16384 >> 15;
        int var6 = this.field2732 * var5 + 128 >> 8;
        if (var2.field2750 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2768 * 1.953125E-5D * (double) var2.field2750) + 0.5D);
        }
        if (var2.field2754 != null) {
            int var7 = arg0.field2777;
            int var8 = var2.field2754[arg0.field2778 + 1];
            if (arg0.field2778 < var2.field2754.length - 2) {
                int var9 = (var2.field2754[arg0.field2778] & 0xFF) << 8;
                int var10 = (var2.field2754[arg0.field2778 + 2] & 0xFF) << 8;
                var8 += (var2.field2754[arg0.field2778 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2779 > 0 && var2.field2749 != null) {
            int var11 = arg0.field2779;
            int var12 = var2.field2749[arg0.field2780 + 1];
            if (arg0.field2780 < var2.field2749.length - 2) {
                int var13 = (var2.field2749[arg0.field2780] & 0xFF) << 8;
                int var14 = (var2.field2749[arg0.field2780 + 2] & 0xFF) << 8;
                var12 += (var2.field2749[arg0.field2780 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("fp.al(Lfz;I)I")
    public int method3113(class168 arg0) {
        int var2 = this.field2719[arg0.field2785];
        return var2 < 8192 ? arg0.field2790 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2790) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("fp.c()Lbc;")
    public synchronized class61 method953() {
        return this.field2742;
    }

    @ObfuscatedName("fp.x()Lbc;")
    public synchronized class61 method954() {
        return null;
    }

    @ObfuscatedName("fp.f()I")
    public synchronized int method955() {
        return 0;
    }

    @ObfuscatedName("fp.t([III)V")
    public synchronized void method978(int[] arg0, int arg1, int arg2) {
        if (this.field2736.method3024()) {
            int var4 = this.field2717 * this.field2736.field2688 / Statics.field1086;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2729;
                if (this.field2741 - var5 >= 0L) {
                    this.field2729 = var5;
                    break;
                }
                int var7 = (int) ((this.field2741 - this.field2729 + (long) var4 - 1L) / (long) var4);
                this.field2729 += (long) var4 * (long) var7;
                this.field2742.method978(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3115();
            } while (this.field2736.method3024());
        }
        this.field2742.method978(arg0, arg1, arg2);
    }

    @ObfuscatedName("fp.p(I)V")
    public synchronized void method958(int arg0) {
        if (this.field2736.method3024()) {
            int var2 = this.field2717 * this.field2736.field2688 / Statics.field1086;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2729;
                if (this.field2741 - var3 >= 0L) {
                    this.field2729 = var3;
                    break;
                }
                int var5 = (int) ((this.field2741 - this.field2729 + (long) var2 - 1L) / (long) var2);
                this.field2729 += (long) var2 * (long) var5;
                this.field2742.method958(var5);
                arg0 -= var5;
                this.method3115();
            } while (this.field2736.method3024());
        }
        this.field2742.method958(arg0);
    }

    @ObfuscatedName("fp.aj(S)V")
    public void method3115() {
        int var1 = this.field2738;
        int var2 = this.field2739;
        long var3 = this.field2741;
        while (this.field2739 == var2) {
            while (this.field2736.field2691[var1] == var2) {
                this.field2736.method3023(var1);
                int var5 = this.field2736.method3027(var1);
                if (var5 == 1) {
                    this.field2736.method3025();
                    this.field2736.method3054(var1);
                    if (this.field2736.method3043()) {
                        if (!this.field2724 || var2 == 0) {
                            this.method3106();
                            this.field2736.method3050();
                            return;
                        }
                        this.field2736.method3033(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3092(var5);
                }
                this.field2736.method3026(var1);
                this.field2736.method3054(var1);
            }
            var1 = this.field2736.method3048();
            var2 = this.field2736.field2691[var1];
            var3 = this.field2736.method3030(var2);
        }
        this.field2738 = var1;
        this.field2739 = var2;
        this.field2741 = var3;
    }

    @ObfuscatedName("fp.ae(Lfz;I)Z")
    public boolean method3118(class168 arg0) {
        if (arg0.field2776 != null) {
            return false;
        }
        if (arg0.field2779 >= 0) {
            arg0.method3375();
            if (arg0.field2786 > 0 && this.field2715[arg0.field2785][arg0.field2786] == arg0) {
                this.field2715[arg0.field2785][arg0.field2786] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("fp.ai(Lfz;[IIII)Z")
    public boolean method3117(class168 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2784 = Statics.field1086 / 100;
        if (arg0.field2779 >= 0 && arg0.field2776 == null || arg0.field2776.method1215()) {
            arg0.method3206();
            arg0.method3375();
            if (arg0.field2786 > 0 && this.field2715[arg0.field2785][arg0.field2786] == arg0) {
                this.field2715[arg0.field2785][arg0.field2786] = null;
            }
            return true;
        }
        int var5 = arg0.field2770;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2726[arg0.field2785] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2770 = var6;
        }
        arg0.field2776.method1105(this.method3144(arg0));
        class166 var7 = arg0.field2769;
        boolean var8 = false;
        arg0.field2781++;
        arg0.field2782 += var7.field2751;
        double var9 = (double) ((arg0.field2765 - 60 << 8) + (arg0.field2774 * arg0.field2770 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2750 > 0) {
            if (var7.field2753 > 0) {
                arg0.field2768 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2753 * var9) + 0.5D);
            } else {
                arg0.field2768 += 128;
            }
        }
        if (var7.field2754 != null) {
            if (var7.field2748 > 0) {
                arg0.field2777 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2748 * var9) + 0.5D);
            } else {
                arg0.field2777 += 128;
            }
            while (arg0.field2778 < var7.field2754.length - 2 && arg0.field2777 > (var7.field2754[arg0.field2778 + 2] & 0xFF) << 8) {
                arg0.field2778 += 2;
            }
            if (arg0.field2778 == var7.field2754.length - 2 && var7.field2754[arg0.field2778 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2779 >= 0 && var7.field2749 != null && (this.field2728[arg0.field2785] & 0x1) == 0 && (arg0.field2786 < 0 || this.field2715[arg0.field2785][arg0.field2786] != arg0)) {
            if (var7.field2752 > 0) {
                arg0.field2779 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2752 * var9) + 0.5D);
            } else {
                arg0.field2779 += 128;
            }
            while (arg0.field2780 < var7.field2749.length - 2 && arg0.field2779 > (var7.field2749[arg0.field2780 + 2] & 0xFF) << 8) {
                arg0.field2780 += 2;
            }
            if (arg0.field2780 == var7.field2749.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2776.method1103(arg0.field2784, this.method3190(arg0), this.method3113(arg0));
            return false;
        }
        arg0.field2776.method1104(arg0.field2784);
        if (arg1 == null) {
            arg0.field2776.method958(arg3);
        } else {
            arg0.field2776.method978(arg1, arg2, arg3);
        }
        if (arg0.field2776.method1168()) {
            this.field2742.field2758.method957(arg0.field2776);
        }
        arg0.method3206();
        if (arg0.field2779 >= 0) {
            arg0.method3375();
            if (arg0.field2786 > 0 && this.field2715[arg0.field2785][arg0.field2786] == arg0) {
                this.field2715[arg0.field2785][arg0.field2786] = null;
            }
        }
        return true;
    }
}
