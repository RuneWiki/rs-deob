package deob;

@ObfuscatedName("fd")
public class class162 extends class60 {

    @ObfuscatedName("fd.j")
    public class174 field2734 = new class174(128);

    @ObfuscatedName("fd.z")
    public int field2723 = 256;

    @ObfuscatedName("fd.y")
    public int field2724 = 1000000;

    @ObfuscatedName("fd.h")
    public int[] field2725 = new int[16];

    @ObfuscatedName("fd.r")
    public int[] field2750 = new int[16];

    @ObfuscatedName("fd.e")
    public int[] field2727 = new int[16];

    @ObfuscatedName("fd.k")
    public int[] field2746 = new int[16];

    @ObfuscatedName("fd.b")
    public int[] field2729 = new int[16];

    @ObfuscatedName("fd.n")
    public int[] field2728 = new int[16];

    @ObfuscatedName("fd.a")
    public int[] field2731 = new int[16];

    @ObfuscatedName("fd.q")
    public int[] field2732 = new int[16];

    @ObfuscatedName("fd.i")
    public int[] field2726 = new int[16];

    @ObfuscatedName("fd.m")
    public int[] field2733 = new int[16];

    @ObfuscatedName("fd.v")
    public int[] field2736 = new int[16];

    @ObfuscatedName("fd.u")
    public int[] field2743 = new int[16];

    @ObfuscatedName("fd.p")
    public int[] field2739 = new int[16];

    @ObfuscatedName("fd.l")
    public int[] field2722 = new int[16];

    @ObfuscatedName("fd.w")
    public int[] field2740 = new int[16];

    @ObfuscatedName("fd.x")
    public class165[][] field2741 = new class165[16][128];

    @ObfuscatedName("fd.aj")
    public class165[][] field2742 = new class165[16][128];

    @ObfuscatedName("fd.al")
    public class160 field2730 = new class160();

    @ObfuscatedName("fd.af")
    public boolean field2744;

    @ObfuscatedName("fd.ai")
    public int field2745;

    @ObfuscatedName("fd.ak")
    public int field2738;

    @ObfuscatedName("fd.ae")
    public long field2747;

    @ObfuscatedName("fd.ag")
    public long field2748;

    @ObfuscatedName("fd.ar")
    public class164 field2749 = new class164(this);

    public class162() {
        this.method3067();
    }

    @ObfuscatedName("fd.j(II)V")
    public synchronized void method3129(int arg0) {
        this.field2723 = arg0;
    }

    @ObfuscatedName("fd.z(I)I")
    public int method3115() {
        return this.field2723;
    }

    @ObfuscatedName("fd.y(Lfs;Leg;Lbg;II)Z")
    public synchronized boolean method3050(class158 arg0, class146 arg1, class53 arg2, int arg3) {
        arg0.method2979();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class175 var7 = (class175) arg0.field2684.method3210(); var7 != null; var7 = (class175) arg0.field2684.method3207()) {
            int var8 = (int) var7.field2861;
            class159 var9 = (class159) this.field2734.method3214((long) var8);
            if (var9 == null) {
                var9 = Statics.method2707(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field2734.method3208(var9, (long) var8);
            }
            if (!var9.method2987(arg2, var7.field2844, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method2981();
        }
        return var5;
    }

    @ObfuscatedName("fd.h(I)V")
    public synchronized void method3102() {
        for (class159 var1 = (class159) this.field2734.method3210(); var1 != null; var1 = (class159) this.field2734.method3207()) {
            var1.method2986();
        }
    }

    @ObfuscatedName("fd.r(I)V")
    public synchronized void method3052() {
        for (class159 var1 = (class159) this.field2734.method3210(); var1 != null; var1 = (class159) this.field2734.method3207()) {
            var1.method3309();
        }
    }

    @ObfuscatedName("fd.a(Lfs;ZI)V")
    public synchronized void method3083(class158 arg0, boolean arg1) {
        this.method3075();
        this.field2730.method2993(arg0.field2685);
        this.field2744 = arg1;
        this.field2747 = 0L;
        int var3 = this.field2730.method3020();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2730.method2996(var4);
            this.field2730.method2999(var4);
            this.field2730.method2997(var4);
        }
        this.field2745 = this.field2730.method3004();
        this.field2738 = this.field2730.field2702[this.field2745];
        this.field2748 = this.field2730.method2998(this.field2738);
    }

    @ObfuscatedName("fd.i(I)V")
    public synchronized void method3075() {
        this.field2730.method2994();
        this.method3067();
    }

    @ObfuscatedName("fd.f(I)Z")
    public synchronized boolean method3130() {
        return this.field2730.method3010();
    }

    @ObfuscatedName("fd.o(IIS)V")
    public synchronized void method3056(int arg0, int arg1) {
        this.method3057(arg0, arg1);
    }

    @ObfuscatedName("fd.t(III)V")
    public void method3057(int arg0, int arg1) {
        this.field2746[arg0] = arg1;
        this.field2728[arg0] = arg1 & 0xFFFFFF80;
        this.method3058(arg0, arg1);
    }

    @ObfuscatedName("fd.c(III)V")
    public void method3058(int arg0, int arg1) {
        if (this.field2729[arg0] != arg1) {
            this.field2729[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2742[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("fd.d(IIII)V")
    public void method3059(int arg0, int arg1, int arg2) {
        this.method3061(arg0, arg1, 64);
        if ((this.field2733[arg0] & 0x2) != 0) {
            for (class165 var4 = (class165) this.field2749.field2763.method3256(); var4 != null; var4 = (class165) this.field2749.field2763.method3244()) {
                if (var4.field2785 == arg0 && var4.field2782 < 0) {
                    this.field2741[arg0][var4.field2773] = null;
                    this.field2741[arg0][arg1] = var4;
                    int var5 = (var4.field2778 * var4.field2777 >> 12) + var4.field2776;
                    var4.field2776 += arg1 - var4.field2773 << 8;
                    var4.field2777 = var5 - var4.field2776;
                    var4.field2778 = 4096;
                    var4.field2773 = arg1;
                    return;
                }
            }
        }
        class159 var6 = (class159) this.field2734.method3214((long) this.field2729[arg0]);
        if (var6 == null) {
            return;
        }
        class56 var7 = var6.field2687[arg1];
        if (var7 == null) {
            return;
        }
        class165 var8 = new class165();
        var8.field2785 = arg0;
        var8.field2779 = var6;
        var8.field2769 = var7;
        var8.field2780 = var6.field2691[arg1];
        var8.field2772 = var6.field2686[arg1];
        var8.field2773 = arg1;
        var8.field2771 = var6.field2693 * arg2 * arg2 * var6.field2689[arg1] + 1024 >> 11;
        var8.field2775 = var6.field2694[arg1] & 0xFF;
        var8.field2776 = (arg1 << 8) - (var6.field2688[arg1] & 0x7FFF);
        var8.field2774 = 0;
        var8.field2768 = 0;
        var8.field2781 = 0;
        var8.field2782 = -1;
        var8.field2783 = 0;
        if (this.field2739[arg0] == 0) {
            var8.field2786 = class58.method1089(var7, this.method3072(var8), this.method3073(var8), this.method3074(var8));
        } else {
            var8.field2786 = class58.method1089(var7, this.method3072(var8), 0, this.method3074(var8));
            this.method3082(var8, var6.field2688[arg1] < 0);
        }
        if (var6.field2688[arg1] < 0) {
            var8.field2786.method1091(-1);
        }
        if (var8.field2772 >= 0) {
            class165 var9 = this.field2742[arg0][var8.field2772];
            if (var9 != null && var9.field2782 < 0) {
                this.field2741[arg0][var9.field2773] = null;
                var9.field2782 = 0;
            }
            this.field2742[arg0][var8.field2772] = var8;
        }
        this.field2749.field2763.method3253(var8);
        this.field2741[arg0][arg1] = var8;
    }

    @ObfuscatedName("fd.g(Lfb;ZI)V")
    public void method3082(class165 arg0, boolean arg1) {
        int var3 = arg0.field2769.field1136.length;
        int var5;
        if (arg1 && arg0.field2769.field1140) {
            int var4 = var3 + var3 - arg0.field2769.field1138;
            var5 = (int) ((long) this.field2739[arg0.field2785] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2786.method1098(true);
            }
        } else {
            var5 = (int) ((long) this.field2739[arg0.field2785] * (long) var3 >> 6);
        }
        arg0.field2786.method1097(var5);
    }

    @ObfuscatedName("fd.s(IIII)V")
    public void method3061(int arg0, int arg1, int arg2) {
        class165 var4 = this.field2741[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2741[arg0][arg1] = null;
        if ((this.field2733[arg0] & 0x2) == 0) {
            var4.field2782 = 0;
            return;
        }
        for (class165 var5 = (class165) this.field2749.field2763.method3236(); var5 != null; var5 = (class165) this.field2749.field2763.method3243()) {
            if (var4.field2785 == var5.field2785 && var5.field2782 < 0 && var4 != var5) {
                var4.field2782 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("fd.m(IIII)V")
    public void method3062(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("fd.v(IIB)V")
    public void method3063(int arg0, int arg1) {
    }

    @ObfuscatedName("fd.u(IIB)V")
    public void method3113(int arg0, int arg1) {
        this.field2731[arg0] = arg1;
    }

    @ObfuscatedName("fd.p(II)V")
    public void method3065(int arg0) {
        for (class165 var2 = (class165) this.field2749.field2763.method3236(); var2 != null; var2 = (class165) this.field2749.field2763.method3243()) {
            if (arg0 < 0 || var2.field2785 == arg0) {
                if (var2.field2786 != null) {
                    var2.field2786.method1140(Statics.field1090 / 100);
                    if (var2.field2786.method1127()) {
                        this.field2749.field2762.method957(var2.field2786);
                    }
                    var2.method3156();
                }
                if (var2.field2782 < 0) {
                    this.field2741[var2.field2785][var2.field2773] = null;
                }
                var2.method3309();
            }
        }
    }

    @ObfuscatedName("fd.l(II)V")
    public void method3066(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3066(var2);
            }
            return;
        }
        this.field2725[arg0] = 12800;
        this.field2750[arg0] = 8192;
        this.field2727[arg0] = 16383;
        this.field2731[arg0] = 8192;
        this.field2732[arg0] = 0;
        this.field2726[arg0] = 8192;
        this.method3109(arg0);
        this.method3051(arg0);
        this.field2733[arg0] = 0;
        this.field2736[arg0] = 32767;
        this.field2743[arg0] = 256;
        this.field2739[arg0] = 0;
        this.method3116(arg0, 8192);
    }

    @ObfuscatedName("fd.w(II)V")
    public void method3121(int arg0) {
        for (class165 var2 = (class165) this.field2749.field2763.method3236(); var2 != null; var2 = (class165) this.field2749.field2763.method3243()) {
            if ((arg0 < 0 || var2.field2785 == arg0) && var2.field2782 < 0) {
                this.field2741[var2.field2785][var2.field2773] = null;
                var2.field2782 = 0;
            }
        }
    }

    @ObfuscatedName("fd.x(I)V")
    public void method3067() {
        this.method3065(-1);
        this.method3066(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2729[var1] = this.field2746[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2728[var2] = this.field2746[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("fd.aw(II)V")
    public void method3109(int arg0) {
        if ((this.field2733[arg0] & 0x2) == 0) {
            return;
        }
        for (class165 var2 = (class165) this.field2749.field2763.method3236(); var2 != null; var2 = (class165) this.field2749.field2763.method3243()) {
            if (var2.field2785 == arg0 && this.field2741[arg0][var2.field2773] == null && var2.field2782 < 0) {
                var2.field2782 = 0;
            }
        }
    }

    @ObfuscatedName("fd.aq(IB)V")
    public void method3051(int arg0) {
        if ((this.field2733[arg0] & 0x4) == 0) {
            return;
        }
        for (class165 var2 = (class165) this.field2749.field2763.method3236(); var2 != null; var2 = (class165) this.field2749.field2763.method3243()) {
            if (var2.field2785 == arg0) {
                var2.field2788 = 0;
            }
        }
    }

    @ObfuscatedName("fd.ad(IB)V")
    public void method3097(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3061(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3059(var6, var7, var8);
            } else {
                this.method3061(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3062(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2728[var12] = (var14 << 14) + (this.field2728[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2728[var12] = (var14 << 7) + (this.field2728[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2732[var12] = (var14 << 7) + (this.field2732[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2732[var12] = (this.field2732[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2726[var12] = (var14 << 7) + (this.field2726[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2726[var12] = (this.field2726[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2725[var12] = (var14 << 7) + (this.field2725[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2725[var12] = (this.field2725[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2750[var12] = (var14 << 7) + (this.field2750[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2750[var12] = (this.field2750[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2727[var12] = (var14 << 7) + (this.field2727[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2727[var12] = (this.field2727[var12] & 0xFFFFFF80) + var14;
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
                    this.method3109(var12);
                    this.field2733[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2736[var12] = (var14 << 7) + (this.field2736[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2736[var12] = (this.field2736[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2736[var12] = (var14 << 7) + (this.field2736[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2736[var12] = (this.field2736[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3065(var12);
            }
            if (var13 == 121) {
                this.method3066(var12);
            }
            if (var13 == 123) {
                this.method3121(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2736[var12];
                if (var15 == 16384) {
                    this.field2743[var12] = (var14 << 7) + (this.field2743[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2736[var12];
                if (var16 == 16384) {
                    this.field2743[var12] = (this.field2743[var12] & 0xFFFFFF80) + var14;
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
                    this.method3051(var12);
                    this.field2733[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3116(var12, (var14 << 7) + (this.field2722[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3116(var12, (this.field2722[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3058(var17, this.field2728[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3063(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method3113(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3067();
            }
        }
    }

    @ObfuscatedName("fd.at(IIB)V")
    public void method3116(int arg0, int arg1) {
        this.field2722[arg0] = arg1;
        this.field2740[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("fd.ay(Lfb;B)I")
    public int method3072(class165 arg0) {
        int var2 = (arg0.field2778 * arg0.field2777 >> 12) + arg0.field2776;
        int var3 = ((this.field2731[arg0.field2785] - 8192) * this.field2743[arg0.field2785] >> 12) + var2;
        class163 var4 = arg0.field2780;
        if (var4.field2758 > 0 && (var4.field2757 > 0 || this.field2732[arg0.field2785] > 0)) {
            int var5 = var4.field2757 << 2;
            int var6 = var4.field2759 << 1;
            if (arg0.field2784 < var6) {
                var5 = arg0.field2784 * var5 / var6;
            }
            int var7 = (this.field2732[arg0.field2785] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2770 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2769.field1137 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1090 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("fd.am(Lfb;B)I")
    public int method3073(class165 arg0) {
        class163 var2 = arg0.field2780;
        int var3 = this.field2727[arg0.field2785] * this.field2725[arg0.field2785] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2771 * var4 + 16384 >> 15;
        int var6 = this.field2723 * var5 + 128 >> 8;
        if (var2.field2753 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2774 * 1.953125E-5D * (double) var2.field2753) + 0.5D);
        }
        if (var2.field2751 != null) {
            int var7 = arg0.field2768;
            int var8 = var2.field2751[arg0.field2781 + 1];
            if (arg0.field2781 < var2.field2751.length - 2) {
                int var9 = (var2.field2751[arg0.field2781] & 0xFF) << 8;
                int var10 = (var2.field2751[arg0.field2781 + 2] & 0xFF) << 8;
                var8 += (var2.field2751[arg0.field2781 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2782 > 0 && var2.field2752 != null) {
            int var11 = arg0.field2782;
            int var12 = var2.field2752[arg0.field2783 + 1];
            if (arg0.field2783 < var2.field2752.length - 2) {
                int var13 = (var2.field2752[arg0.field2783] & 0xFF) << 8;
                int var14 = (var2.field2752[arg0.field2783 + 2] & 0xFF) << 8;
                var12 += (var2.field2752[arg0.field2783 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("fd.az(Lfb;B)I")
    public int method3074(class165 arg0) {
        int var2 = this.field2750[arg0.field2785];
        return var2 < 8192 ? arg0.field2775 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2775) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("fd.e()Lbf;")
    public synchronized class60 method935() {
        return this.field2749;
    }

    @ObfuscatedName("fd.k()Lbf;")
    public synchronized class60 method954() {
        return null;
    }

    @ObfuscatedName("fd.b()I")
    public synchronized int method937() {
        return 0;
    }

    @ObfuscatedName("fd.n([III)V")
    public synchronized void method938(int[] arg0, int arg1, int arg2) {
        if (this.field2730.method3010()) {
            int var4 = this.field2724 * this.field2730.field2708 / Statics.field1090;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2747;
                if (this.field2748 - var5 >= 0L) {
                    this.field2747 = var5;
                    break;
                }
                int var7 = (int) ((this.field2748 - this.field2747 + (long) var4 - 1L) / (long) var4);
                this.field2747 += (long) var4 * (long) var7;
                this.field2749.method938(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3076();
            } while (this.field2730.method3010());
        }
        this.field2749.method938(arg0, arg1, arg2);
    }

    @ObfuscatedName("fd.q(I)V")
    public synchronized void method940(int arg0) {
        if (this.field2730.method3010()) {
            int var2 = this.field2724 * this.field2730.field2708 / Statics.field1090;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2747;
                if (this.field2748 - var3 >= 0L) {
                    this.field2747 = var3;
                    break;
                }
                int var5 = (int) ((this.field2748 - this.field2747 + (long) var2 - 1L) / (long) var2);
                this.field2747 += (long) var2 * (long) var5;
                this.field2749.method940(var5);
                arg0 -= var5;
                this.method3076();
            } while (this.field2730.method3010());
        }
        this.field2749.method940(arg0);
    }

    @ObfuscatedName("fd.au(B)V")
    public void method3076() {
        int var1 = this.field2745;
        int var2 = this.field2738;
        long var3 = this.field2748;
        while (this.field2738 == var2) {
            while (this.field2730.field2702[var1] == var2) {
                this.field2730.method2996(var1);
                int var5 = this.field2730.method3000(var1);
                if (var5 == 1) {
                    this.field2730.method3011();
                    this.field2730.method2997(var1);
                    if (this.field2730.method3015()) {
                        if (!this.field2744 || var2 == 0) {
                            this.method3067();
                            this.field2730.method2994();
                            return;
                        }
                        this.field2730.method3006(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3097(var5);
                }
                this.field2730.method2999(var1);
                this.field2730.method2997(var1);
            }
            var1 = this.field2730.method3004();
            var2 = this.field2730.field2702[var1];
            var3 = this.field2730.method2998(var2);
        }
        this.field2745 = var1;
        this.field2738 = var2;
        this.field2748 = var3;
    }

    @ObfuscatedName("fd.ab(Lfb;I)Z")
    public boolean method3077(class165 arg0) {
        if (arg0.field2786 != null) {
            return false;
        }
        if (arg0.field2782 >= 0) {
            arg0.method3309();
            if (arg0.field2772 > 0 && this.field2742[arg0.field2785][arg0.field2772] == arg0) {
                this.field2742[arg0.field2785][arg0.field2772] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("fd.ao(Lfb;[IIIB)Z")
    public boolean method3078(class165 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2787 = Statics.field1090 / 100;
        if (arg0.field2782 >= 0 && arg0.field2786 == null || arg0.field2786.method1105()) {
            arg0.method3156();
            arg0.method3309();
            if (arg0.field2772 > 0 && this.field2742[arg0.field2785][arg0.field2772] == arg0) {
                this.field2742[arg0.field2785][arg0.field2772] = null;
            }
            return true;
        }
        int var5 = arg0.field2778;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2726[arg0.field2785] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2778 = var6;
        }
        arg0.field2786.method1103(this.method3072(arg0));
        class163 var7 = arg0.field2780;
        boolean var8 = false;
        arg0.field2784++;
        arg0.field2770 += var7.field2758;
        double var9 = (double) ((arg0.field2773 - 60 << 8) + (arg0.field2778 * arg0.field2777 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2753 > 0) {
            if (var7.field2756 > 0) {
                arg0.field2774 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2756 * var9) + 0.5D);
            } else {
                arg0.field2774 += 128;
            }
        }
        if (var7.field2751 != null) {
            if (var7.field2754 > 0) {
                arg0.field2768 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2754 * var9) + 0.5D);
            } else {
                arg0.field2768 += 128;
            }
            while (arg0.field2781 < var7.field2751.length - 2 && arg0.field2768 > (var7.field2751[arg0.field2781 + 2] & 0xFF) << 8) {
                arg0.field2781 += 2;
            }
            if (arg0.field2781 == var7.field2751.length - 2 && var7.field2751[arg0.field2781 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2782 >= 0 && var7.field2752 != null && (this.field2733[arg0.field2785] & 0x1) == 0 && (arg0.field2772 < 0 || this.field2742[arg0.field2785][arg0.field2772] != arg0)) {
            if (var7.field2755 > 0) {
                arg0.field2782 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2755 * var9) + 0.5D);
            } else {
                arg0.field2782 += 128;
            }
            while (arg0.field2783 < var7.field2752.length - 2 && arg0.field2782 > (var7.field2752[arg0.field2783 + 2] & 0xFF) << 8) {
                arg0.field2783 += 2;
            }
            if (arg0.field2783 == var7.field2752.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2786.method1101(arg0.field2787, this.method3073(arg0), this.method3074(arg0));
            return false;
        }
        arg0.field2786.method1140(arg0.field2787);
        if (arg1 == null) {
            arg0.field2786.method940(arg3);
        } else {
            arg0.field2786.method938(arg1, arg2, arg3);
        }
        if (arg0.field2786.method1127()) {
            this.field2749.field2762.method957(arg0.field2786);
        }
        arg0.method3156();
        if (arg0.field2782 >= 0) {
            arg0.method3309();
            if (arg0.field2772 > 0 && this.field2742[arg0.field2785][arg0.field2772] == arg0) {
                this.field2742[arg0.field2785][arg0.field2772] = null;
            }
        }
        return true;
    }
}
