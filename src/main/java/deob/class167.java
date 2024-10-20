package deob;

@ObfuscatedName("fm")
public class class167 extends class61 {

    @ObfuscatedName("fm.a")
    public class179 field2763 = new class179(128);

    @ObfuscatedName("fm.v")
    public int field2772 = 256;

    @ObfuscatedName("fm.i")
    public int field2762 = 1000000;

    @ObfuscatedName("fm.b")
    public int[] field2758 = new int[16];

    @ObfuscatedName("fm.l")
    public int[] field2759 = new int[16];

    @ObfuscatedName("fm.m")
    public int[] field2760 = new int[16];

    @ObfuscatedName("fm.e")
    public int[] field2761 = new int[16];

    @ObfuscatedName("fm.n")
    public int[] field2756 = new int[16];

    @ObfuscatedName("fm.s")
    public int[] field2773 = new int[16];

    @ObfuscatedName("fm.k")
    public int[] field2764 = new int[16];

    @ObfuscatedName("fm.f")
    public int[] field2765 = new int[16];

    @ObfuscatedName("fm.d")
    public int[] field2766 = new int[16];

    @ObfuscatedName("fm.j")
    public int[] field2767 = new int[16];

    @ObfuscatedName("fm.g")
    public int[] field2768 = new int[16];

    @ObfuscatedName("fm.y")
    public int[] field2778 = new int[16];

    @ObfuscatedName("fm.p")
    public int[] field2770 = new int[16];

    @ObfuscatedName("fm.r")
    public int[] field2771 = new int[16];

    @ObfuscatedName("fm.z")
    public int[] field2755 = new int[16];

    @ObfuscatedName("fm.c")
    public class170[][] field2779 = new class170[16][128];

    @ObfuscatedName("fm.an")
    public class170[][] field2774 = new class170[16][128];

    @ObfuscatedName("fm.as")
    public class165 field2775 = new class165();

    @ObfuscatedName("fm.ah")
    public boolean field2776;

    @ObfuscatedName("fm.ar")
    public int field2777;

    @ObfuscatedName("fm.ae")
    public int field2781;

    @ObfuscatedName("fm.av")
    public long field2769;

    @ObfuscatedName("fm.al")
    public long field2780;

    @ObfuscatedName("fm.aq")
    public class169 field2757 = new class169(this);

    public class167() {
        this.method3078();
    }

    @ObfuscatedName("fm.a(II)V")
    public synchronized void method3059(int arg0) {
        this.field2772 = arg0;
    }

    @ObfuscatedName("fm.v(I)I")
    public int method3060() {
        return this.field2772;
    }

    @ObfuscatedName("fm.i(Lfz;Lek;Lbo;II)Z")
    public synchronized boolean method3122(class163 arg0, class151 arg1, class54 arg2, int arg3) {
        arg0.method2969();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class180 var7 = (class180) arg0.field2719.method3210(); var7 != null; var7 = (class180) arg0.field2719.method3214()) {
            int var8 = (int) var7.field2908;
            class164 var9 = (class164) this.field2763.method3231((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method2736(var8);
                class164 var11;
                if (var10 == null) {
                    var11 = null;
                } else {
                    var11 = new class164(var10);
                }
                var9 = var11;
                if (var11 == null) {
                    var5 = false;
                    continue;
                }
                this.field2763.method3211(var11, (long) var8);
            }
            if (!var9.method2977(arg2, var7.field2887, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method2967();
        }
        return var5;
    }

    @ObfuscatedName("fm.b(I)V")
    public synchronized void method3077() {
        for (class164 var1 = (class164) this.field2763.method3210(); var1 != null; var1 = (class164) this.field2763.method3214()) {
            var1.method2985();
        }
    }

    @ObfuscatedName("fm.l(B)V")
    public synchronized void method3063() {
        for (class164 var1 = (class164) this.field2763.method3210(); var1 != null; var1 = (class164) this.field2763.method3214()) {
            var1.method3343();
        }
    }

    @ObfuscatedName("fm.s(Lfz;ZI)V")
    public synchronized void method3064(class163 arg0, boolean arg1) {
        this.method3065();
        this.field2775.method3006(arg0.field2720);
        this.field2776 = arg1;
        this.field2769 = 0L;
        int var3 = this.field2775.method3012();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2775.method3024(var4);
            this.field2775.method2995(var4);
            this.field2775.method2993(var4);
        }
        this.field2777 = this.field2775.method3000();
        this.field2781 = this.field2775.field2735[this.field2777];
        this.field2780 = this.field2775.method2999(this.field2781);
    }

    @ObfuscatedName("fm.f(I)V")
    public synchronized void method3065() {
        this.field2775.method3007();
        this.method3078();
    }

    @ObfuscatedName("fm.d(I)Z")
    public synchronized boolean method3120() {
        return this.field2775.method2990();
    }

    @ObfuscatedName("fm.x(III)V")
    public synchronized void method3116(int arg0, int arg1) {
        this.method3068(arg0, arg1);
    }

    @ObfuscatedName("fm.o(III)V")
    public void method3068(int arg0, int arg1) {
        this.field2761[arg0] = arg1;
        this.field2773[arg0] = arg1 & 0xFFFFFF80;
        this.method3069(arg0, arg1);
    }

    @ObfuscatedName("fm.q(III)V")
    public void method3069(int arg0, int arg1) {
        if (this.field2756[arg0] != arg1) {
            this.field2756[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2774[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("fm.t(IIIB)V")
    public void method3062(int arg0, int arg1, int arg2) {
        this.method3117(arg0, arg1, 64);
        if ((this.field2767[arg0] & 0x2) != 0) {
            for (class170 var4 = (class170) this.field2757.field2794.method3252(); var4 != null; var4 = (class170) this.field2757.field2794.method3253()) {
                if (var4.field2817 == arg0 && var4.field2816 < 0) {
                    this.field2779[arg0][var4.field2804] = null;
                    this.field2779[arg0][arg1] = var4;
                    int var5 = (var4.field2809 * var4.field2808 >> 12) + var4.field2807;
                    var4.field2807 += arg1 - var4.field2804 << 8;
                    var4.field2808 = var5 - var4.field2807;
                    var4.field2809 = 4096;
                    var4.field2804 = arg1;
                    return;
                }
            }
        }
        class164 var6 = (class164) this.field2763.method3231((long) this.field2756[arg0]);
        if (var6 == null) {
            return;
        }
        class57 var7 = var6.field2729[arg1];
        if (var7 == null) {
            return;
        }
        class170 var8 = new class170();
        var8.field2817 = arg0;
        var8.field2800 = var6;
        var8.field2799 = var7;
        var8.field2802 = var6.field2726[arg1];
        var8.field2803 = var6.field2722[arg1];
        var8.field2804 = arg1;
        var8.field2805 = var6.field2724 * arg2 * arg2 * var6.field2727[arg1] + 1024 >> 11;
        var8.field2806 = var6.field2725[arg1] & 0xFF;
        var8.field2807 = (arg1 << 8) - (var6.field2723[arg1] & 0x7FFF);
        var8.field2810 = 0;
        var8.field2811 = 0;
        var8.field2812 = 0;
        var8.field2816 = -1;
        var8.field2814 = 0;
        if (this.field2770[arg0] == 0) {
            var8.field2801 = class59.method1115(var7, this.method3084(var8), this.method3153(var8), this.method3086(var8));
        } else {
            var8.field2801 = class59.method1115(var7, this.method3084(var8), 0, this.method3086(var8));
            this.method3071(var8, var6.field2723[arg1] < 0);
        }
        if (var6.field2723[arg1] < 0) {
            var8.field2801.method1112(-1);
        }
        if (var8.field2803 >= 0) {
            class170 var9 = this.field2774[arg0][var8.field2803];
            if (var9 != null && var9.field2816 < 0) {
                this.field2779[arg0][var9.field2804] = null;
                var9.field2816 = 0;
            }
            this.field2774[arg0][var8.field2803] = var8;
        }
        this.field2757.field2794.method3274(var8);
        this.field2779[arg0][arg1] = var8;
    }

    @ObfuscatedName("fm.h(Lfy;ZI)V")
    public void method3071(class170 arg0, boolean arg1) {
        int var3 = arg0.field2799.field1141.length;
        int var5;
        if (arg1 && arg0.field2799.field1143) {
            int var4 = var3 + var3 - arg0.field2799.field1142;
            var5 = (int) ((long) this.field2770[arg0.field2817] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2801.method1119(true);
            }
        } else {
            var5 = (int) ((long) this.field2770[arg0.field2817] * (long) var3 >> 6);
        }
        arg0.field2801.method1176(var5);
    }

    @ObfuscatedName("fm.u(IIII)V")
    public void method3117(int arg0, int arg1, int arg2) {
        class170 var4 = this.field2779[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2779[arg0][arg1] = null;
        if ((this.field2767[arg0] & 0x2) == 0) {
            var4.field2816 = 0;
            return;
        }
        for (class170 var5 = (class170) this.field2757.field2794.method3251(); var5 != null; var5 = (class170) this.field2757.field2794.method3261()) {
            if (var4.field2817 == var5.field2817 && var5.field2816 < 0 && var4 != var5) {
                var4.field2816 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("fm.j(IIIB)V")
    public void method3073(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("fm.g(IIB)V")
    public void method3090(int arg0, int arg1) {
    }

    @ObfuscatedName("fm.y(III)V")
    public void method3093(int arg0, int arg1) {
        this.field2764[arg0] = arg1;
    }

    @ObfuscatedName("fm.ae(IB)V")
    public void method3076(int arg0) {
        for (class170 var2 = (class170) this.field2757.field2794.method3251(); var2 != null; var2 = (class170) this.field2757.field2794.method3261()) {
            if (arg0 < 0 || var2.field2817 == arg0) {
                if (var2.field2801 != null) {
                    var2.field2801.method1123(Statics.field1084 / 100);
                    if (var2.field2801.method1127()) {
                        this.field2757.field2796.method968(var2.field2801);
                    }
                    var2.method3174();
                }
                if (var2.field2816 < 0) {
                    this.field2779[var2.field2817][var2.field2804] = null;
                }
                var2.method3343();
            }
        }
    }

    @ObfuscatedName("fm.av(II)V")
    public void method3156(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3156(var2);
            }
            return;
        }
        this.field2758[arg0] = 12800;
        this.field2759[arg0] = 8192;
        this.field2760[arg0] = 16383;
        this.field2764[arg0] = 8192;
        this.field2765[arg0] = 0;
        this.field2766[arg0] = 8192;
        this.method3080(arg0);
        this.method3131(arg0);
        this.field2767[arg0] = 0;
        this.field2768[arg0] = 32767;
        this.field2778[arg0] = 256;
        this.field2770[arg0] = 0;
        this.method3083(arg0, 8192);
    }

    @ObfuscatedName("fm.al(II)V")
    public void method3141(int arg0) {
        for (class170 var2 = (class170) this.field2757.field2794.method3251(); var2 != null; var2 = (class170) this.field2757.field2794.method3261()) {
            if ((arg0 < 0 || var2.field2817 == arg0) && var2.field2816 < 0) {
                this.field2779[var2.field2817][var2.field2804] = null;
                var2.field2816 = 0;
            }
        }
    }

    @ObfuscatedName("fm.ax(I)V")
    public void method3078() {
        this.method3076(-1);
        this.method3156(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2756[var1] = this.field2761[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2773[var2] = this.field2761[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("fm.az(IS)V")
    public void method3080(int arg0) {
        if ((this.field2767[arg0] & 0x2) == 0) {
            return;
        }
        for (class170 var2 = (class170) this.field2757.field2794.method3251(); var2 != null; var2 = (class170) this.field2757.field2794.method3261()) {
            if (var2.field2817 == arg0 && this.field2779[arg0][var2.field2804] == null && var2.field2816 < 0) {
                var2.field2816 = 0;
            }
        }
    }

    @ObfuscatedName("fm.aa(IB)V")
    public void method3131(int arg0) {
        if ((this.field2767[arg0] & 0x4) == 0) {
            return;
        }
        for (class170 var2 = (class170) this.field2757.field2794.method3251(); var2 != null; var2 = (class170) this.field2757.field2794.method3261()) {
            if (var2.field2817 == arg0) {
                var2.field2819 = 0;
            }
        }
    }

    @ObfuscatedName("fm.at(II)V")
    public void method3082(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3117(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3062(var6, var7, var8);
            } else {
                this.method3117(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3073(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2773[var12] = (var14 << 14) + (this.field2773[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2773[var12] = (var14 << 7) + (this.field2773[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2765[var12] = (var14 << 7) + (this.field2765[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2765[var12] = (this.field2765[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2766[var12] = (var14 << 7) + (this.field2766[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2766[var12] = (this.field2766[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2758[var12] = (var14 << 7) + (this.field2758[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2758[var12] = (this.field2758[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2759[var12] = (var14 << 7) + (this.field2759[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2759[var12] = (this.field2759[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2760[var12] = (var14 << 7) + (this.field2760[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2760[var12] = (this.field2760[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2767[var12] |= 0x1;
                } else {
                    this.field2767[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2767[var12] |= 0x2;
                } else {
                    this.method3080(var12);
                    this.field2767[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2768[var12] = (var14 << 7) + (this.field2768[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2768[var12] = (this.field2768[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2768[var12] = (var14 << 7) + (this.field2768[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2768[var12] = (this.field2768[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3076(var12);
            }
            if (var13 == 121) {
                this.method3156(var12);
            }
            if (var13 == 123) {
                this.method3141(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2768[var12];
                if (var15 == 16384) {
                    this.field2778[var12] = (var14 << 7) + (this.field2778[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2768[var12];
                if (var16 == 16384) {
                    this.field2778[var12] = (this.field2778[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2770[var12] = (var14 << 7) + (this.field2770[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2770[var12] = (this.field2770[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2767[var12] |= 0x4;
                } else {
                    this.method3131(var12);
                    this.field2767[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3083(var12, (var14 << 7) + (this.field2771[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3083(var12, (this.field2771[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3069(var17, this.field2773[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3090(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method3093(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3078();
            }
        }
    }

    @ObfuscatedName("fm.aw(IIB)V")
    public void method3083(int arg0, int arg1) {
        this.field2771[arg0] = arg1;
        this.field2755[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("fm.ao(Lfy;B)I")
    public int method3084(class170 arg0) {
        int var2 = (arg0.field2809 * arg0.field2808 >> 12) + arg0.field2807;
        int var3 = ((this.field2764[arg0.field2817] - 8192) * this.field2778[arg0.field2817] >> 12) + var2;
        class168 var4 = arg0.field2802;
        if (var4.field2789 > 0 && (var4.field2791 > 0 || this.field2765[arg0.field2817] > 0)) {
            int var5 = var4.field2791 << 2;
            int var6 = var4.field2793 << 1;
            if (arg0.field2820 < var6) {
                var5 = arg0.field2820 * var5 / var6;
            }
            int var7 = (this.field2765[arg0.field2817] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2818 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2799.field1140 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1084 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("fm.ag(Lfy;I)I")
    public int method3153(class170 arg0) {
        class168 var2 = arg0.field2802;
        int var3 = this.field2760[arg0.field2817] * this.field2758[arg0.field2817] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2805 * var4 + 16384 >> 15;
        int var6 = this.field2772 * var5 + 128 >> 8;
        if (var2.field2787 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2810 * 1.953125E-5D * (double) var2.field2787) + 0.5D);
        }
        if (var2.field2792 != null) {
            int var7 = arg0.field2811;
            int var8 = var2.field2792[arg0.field2812 + 1];
            if (arg0.field2812 < var2.field2792.length - 2) {
                int var9 = (var2.field2792[arg0.field2812] & 0xFF) << 8;
                int var10 = (var2.field2792[arg0.field2812 + 2] & 0xFF) << 8;
                var8 += (var2.field2792[arg0.field2812 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2816 > 0 && var2.field2786 != null) {
            int var11 = arg0.field2816;
            int var12 = var2.field2786[arg0.field2814 + 1];
            if (arg0.field2814 < var2.field2786.length - 2) {
                int var13 = (var2.field2786[arg0.field2814] & 0xFF) << 8;
                int var14 = (var2.field2786[arg0.field2814 + 2] & 0xFF) << 8;
                var12 += (var2.field2786[arg0.field2814 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("fm.ad(Lfy;I)I")
    public int method3086(class170 arg0) {
        int var2 = this.field2759[arg0.field2817];
        return var2 < 8192 ? arg0.field2806 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2806) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("fm.m()Lbz;")
    public synchronized class61 method978() {
        return this.field2757;
    }

    @ObfuscatedName("fm.w()Lbz;")
    public synchronized class61 method974() {
        return null;
    }

    @ObfuscatedName("fm.e()I")
    public synchronized int method987() {
        return 0;
    }

    @ObfuscatedName("fm.n([III)V")
    public synchronized void method975(int[] arg0, int arg1, int arg2) {
        if (this.field2775.method2990()) {
            int var4 = this.field2762 * this.field2775.field2732 / Statics.field1084;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2769;
                if (this.field2780 - var5 >= 0L) {
                    this.field2769 = var5;
                    break;
                }
                int var7 = (int) ((this.field2780 - this.field2769 + (long) var4 - 1L) / (long) var4);
                this.field2769 += (long) var4 * (long) var7;
                this.field2757.method975(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3089();
            } while (this.field2775.method2990());
        }
        this.field2757.method975(arg0, arg1, arg2);
    }

    @ObfuscatedName("fm.k(I)V")
    public synchronized void method977(int arg0) {
        if (this.field2775.method2990()) {
            int var2 = this.field2762 * this.field2775.field2732 / Statics.field1084;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2769;
                if (this.field2780 - var3 >= 0L) {
                    this.field2769 = var3;
                    break;
                }
                int var5 = (int) ((this.field2780 - this.field2769 + (long) var2 - 1L) / (long) var2);
                this.field2769 += (long) var2 * (long) var5;
                this.field2757.method977(var5);
                arg0 -= var5;
                this.method3089();
            } while (this.field2775.method2990());
        }
        this.field2757.method977(arg0);
    }

    @ObfuscatedName("fm.au(B)V")
    public void method3089() {
        int var1 = this.field2777;
        int var2 = this.field2781;
        long var3 = this.field2780;
        while (this.field2781 == var2) {
            while (this.field2775.field2735[var1] == var2) {
                this.field2775.method3024(var1);
                int var5 = this.field2775.method3004(var1);
                if (var5 == 1) {
                    this.field2775.method2994();
                    this.field2775.method2993(var1);
                    if (this.field2775.method2992()) {
                        if (!this.field2776 || var2 == 0) {
                            this.method3078();
                            this.field2775.method3007();
                            return;
                        }
                        this.field2775.method3002(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3082(var5);
                }
                this.field2775.method2995(var1);
                this.field2775.method2993(var1);
            }
            var1 = this.field2775.method3000();
            var2 = this.field2775.field2735[var1];
            var3 = this.field2775.method2999(var2);
        }
        this.field2777 = var1;
        this.field2781 = var2;
        this.field2780 = var3;
    }

    @ObfuscatedName("fm.ak(Lfy;B)Z")
    public boolean method3072(class170 arg0) {
        if (arg0.field2801 != null) {
            return false;
        }
        if (arg0.field2816 >= 0) {
            arg0.method3343();
            if (arg0.field2803 > 0 && this.field2774[arg0.field2817][arg0.field2803] == arg0) {
                this.field2774[arg0.field2817][arg0.field2803] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("fm.aj(Lfy;[IIII)Z")
    public boolean method3085(class170 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2815 = Statics.field1084 / 100;
        if (arg0.field2816 >= 0 && arg0.field2801 == null || arg0.field2801.method1126()) {
            arg0.method3174();
            arg0.method3343();
            if (arg0.field2803 > 0 && this.field2774[arg0.field2817][arg0.field2803] == arg0) {
                this.field2774[arg0.field2817][arg0.field2803] = null;
            }
            return true;
        }
        int var5 = arg0.field2809;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2766[arg0.field2817] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2809 = var6;
        }
        arg0.field2801.method1124(this.method3084(arg0));
        class168 var7 = arg0.field2802;
        boolean var8 = false;
        arg0.field2820++;
        arg0.field2818 += var7.field2789;
        double var9 = (double) ((arg0.field2804 - 60 << 8) + (arg0.field2809 * arg0.field2808 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2787 > 0) {
            if (var7.field2790 > 0) {
                arg0.field2810 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2790 * var9) + 0.5D);
            } else {
                arg0.field2810 += 128;
            }
        }
        if (var7.field2792 != null) {
            if (var7.field2788 > 0) {
                arg0.field2811 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2788 * var9) + 0.5D);
            } else {
                arg0.field2811 += 128;
            }
            while (arg0.field2812 < var7.field2792.length - 2 && arg0.field2811 > (var7.field2792[arg0.field2812 + 2] & 0xFF) << 8) {
                arg0.field2812 += 2;
            }
            if (arg0.field2812 == var7.field2792.length - 2 && var7.field2792[arg0.field2812 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2816 >= 0 && var7.field2786 != null && (this.field2767[arg0.field2817] & 0x1) == 0 && (arg0.field2803 < 0 || this.field2774[arg0.field2817][arg0.field2803] != arg0)) {
            if (var7.field2785 > 0) {
                arg0.field2816 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2785 * var9) + 0.5D);
            } else {
                arg0.field2816 += 128;
            }
            while (arg0.field2814 < var7.field2786.length - 2 && arg0.field2816 > (var7.field2786[arg0.field2814 + 2] & 0xFF) << 8) {
                arg0.field2814 += 2;
            }
            if (arg0.field2814 == var7.field2786.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2801.method1122(arg0.field2815, this.method3153(arg0), this.method3086(arg0));
            return false;
        }
        arg0.field2801.method1123(arg0.field2815);
        if (arg1 == null) {
            arg0.field2801.method977(arg3);
        } else {
            arg0.field2801.method975(arg1, arg2, arg3);
        }
        if (arg0.field2801.method1127()) {
            this.field2757.field2796.method968(arg0.field2801);
        }
        arg0.method3174();
        if (arg0.field2816 >= 0) {
            arg0.method3343();
            if (arg0.field2803 > 0 && this.field2774[arg0.field2817][arg0.field2803] == arg0) {
                this.field2774[arg0.field2817][arg0.field2803] = null;
            }
        }
        return true;
    }
}
