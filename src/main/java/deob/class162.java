package deob;

@ObfuscatedName("fz")
public class class162 extends class60 {

    @ObfuscatedName("fz.i")
    public class174 field2723 = new class174(128);

    @ObfuscatedName("fz.c")
    public int field2729 = 256;

    @ObfuscatedName("fz.h")
    public int field2721 = 1000000;

    @ObfuscatedName("fz.v")
    public int[] field2722 = new int[16];

    @ObfuscatedName("fz.q")
    public int[] field2720 = new int[16];

    @ObfuscatedName("fz.s")
    public int[] field2719 = new int[16];

    @ObfuscatedName("fz.g")
    public int[] field2725 = new int[16];

    @ObfuscatedName("fz.u")
    public int[] field2726 = new int[16];

    @ObfuscatedName("fz.d")
    public int[] field2727 = new int[16];

    @ObfuscatedName("fz.y")
    public int[] field2724 = new int[16];

    @ObfuscatedName("fz.e")
    public int[] field2732 = new int[16];

    @ObfuscatedName("fz.l")
    public int[] field2730 = new int[16];

    @ObfuscatedName("fz.m")
    public int[] field2731 = new int[16];

    @ObfuscatedName("fz.f")
    public int[] field2744 = new int[16];

    @ObfuscatedName("fz.k")
    public int[] field2733 = new int[16];

    @ObfuscatedName("fz.p")
    public int[] field2734 = new int[16];

    @ObfuscatedName("fz.n")
    public int[] field2735 = new int[16];

    @ObfuscatedName("fz.j")
    public int[] field2736 = new int[16];

    @ObfuscatedName("fz.x")
    public class165[][] field2738 = new class165[16][128];

    @ObfuscatedName("fz.al")
    public class165[][] field2740 = new class165[16][128];

    @ObfuscatedName("fz.au")
    public class160 field2739 = new class160();

    @ObfuscatedName("fz.az")
    public boolean field2737;

    @ObfuscatedName("fz.ag")
    public int field2741;

    @ObfuscatedName("fz.aj")
    public int field2742;

    @ObfuscatedName("fz.af")
    public long field2743;

    @ObfuscatedName("fz.am")
    public long field2728;

    @ObfuscatedName("fz.aa")
    public class164 field2745 = new class164(this);

    public class162() {
        this.method3090();
    }

    @ObfuscatedName("fz.i(II)V")
    public synchronized void method3070(int arg0) {
        this.field2729 = arg0;
    }

    @ObfuscatedName("fz.c(I)I")
    public int method3071() {
        return this.field2729;
    }

    @ObfuscatedName("fz.h(Lfr;Ler;Lba;II)Z")
    public synchronized boolean method3072(class158 arg0, class146 arg1, class53 arg2, int arg3) {
        arg0.method2975();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class175 var7 = (class175) arg0.field2681.method3220(); var7 != null; var7 = (class175) arg0.field2681.method3221()) {
            int var8 = (int) var7.field2871;
            class159 var9 = (class159) this.field2723.method3218((long) var8);
            if (var9 == null) {
                var9 = class159.method2843(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field2723.method3229(var9, (long) var8);
            }
            if (!var9.method2995(arg2, var7.field2849, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method2976();
        }
        return var5;
    }

    @ObfuscatedName("fz.v(B)V")
    public synchronized void method3073() {
        for (class159 var1 = (class159) this.field2723.method3220(); var1 != null; var1 = (class159) this.field2723.method3221()) {
            var1.method2989();
        }
    }

    @ObfuscatedName("fz.q(B)V")
    public synchronized void method3159() {
        for (class159 var1 = (class159) this.field2723.method3220(); var1 != null; var1 = (class159) this.field2723.method3221()) {
            var1.method3334();
        }
    }

    @ObfuscatedName("fz.y(Lfr;ZI)V")
    public synchronized void method3075(class158 arg0, boolean arg1) {
        this.method3116();
        this.field2739.method3000(arg0.field2680);
        this.field2737 = arg1;
        this.field2743 = 0L;
        int var3 = this.field2739.method3020();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2739.method3004(var4);
            this.field2739.method3022(var4);
            this.field2739.method3005(var4);
        }
        this.field2741 = this.field2739.method3011();
        this.field2742 = this.field2739.field2706[this.field2741];
        this.field2728 = this.field2739.method3043(this.field2742);
    }

    @ObfuscatedName("fz.l(B)V")
    public synchronized void method3116() {
        this.field2739.method3001();
        this.method3090();
    }

    @ObfuscatedName("fz.o(I)Z")
    public synchronized boolean method3077() {
        return this.field2739.method3018();
    }

    @ObfuscatedName("fz.w(IIB)V")
    public synchronized void method3083(int arg0, int arg1) {
        this.method3079(arg0, arg1);
    }

    @ObfuscatedName("fz.t(III)V")
    public void method3079(int arg0, int arg1) {
        this.field2725[arg0] = arg1;
        this.field2727[arg0] = arg1 & 0xFFFFFF80;
        this.method3080(arg0, arg1);
    }

    @ObfuscatedName("fz.z(IIB)V")
    public void method3080(int arg0, int arg1) {
        if (this.field2726[arg0] != arg1) {
            this.field2726[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2740[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("fz.b(IIII)V")
    public void method3081(int arg0, int arg1, int arg2) {
        this.method3105(arg0, arg1, 64);
        if ((this.field2731[arg0] & 0x2) != 0) {
            for (class165 var4 = (class165) this.field2745.field2757.method3258(); var4 != null; var4 = (class165) this.field2745.field2757.method3259()) {
                if (var4.field2770 == arg0 && var4.field2781 < 0) {
                    this.field2738[arg0][var4.field2762] = null;
                    this.field2738[arg0][arg1] = var4;
                    int var5 = (var4.field2773 * var4.field2772 >> 12) + var4.field2776;
                    var4.field2776 += arg1 - var4.field2762 << 8;
                    var4.field2773 = var5 - var4.field2776;
                    var4.field2772 = 4096;
                    var4.field2762 = arg1;
                    return;
                }
            }
        }
        class159 var6 = (class159) this.field2723.method3218((long) this.field2726[arg0]);
        if (var6 == null) {
            return;
        }
        class56 var7 = var6.field2683[arg1];
        if (var7 == null) {
            return;
        }
        class165 var8 = new class165();
        var8.field2770 = arg0;
        var8.field2763 = var6;
        var8.field2764 = var7;
        var8.field2765 = var6.field2687[arg1];
        var8.field2766 = var6.field2688[arg1];
        var8.field2762 = arg1;
        var8.field2768 = var6.field2682 * arg2 * arg2 * var6.field2686[arg1] + 1024 >> 11;
        var8.field2767 = var6.field2691[arg1] & 0xFF;
        var8.field2776 = (arg1 << 8) - (var6.field2684[arg1] & 0x7FFF);
        var8.field2780 = 0;
        var8.field2774 = 0;
        var8.field2775 = 0;
        var8.field2781 = -1;
        var8.field2777 = 0;
        if (this.field2734[arg0] == 0) {
            var8.field2769 = class58.method1113(var7, this.method3069(var8), this.method3095(var8), this.method3118(var8));
        } else {
            var8.field2769 = class58.method1113(var7, this.method3069(var8), 0, this.method3118(var8));
            this.method3122(var8, var6.field2684[arg1] < 0);
        }
        if (var6.field2684[arg1] < 0) {
            var8.field2769.method1115(-1);
        }
        if (var8.field2766 >= 0) {
            class165 var9 = this.field2740[arg0][var8.field2766];
            if (var9 != null && var9.field2781 < 0) {
                this.field2738[arg0][var9.field2762] = null;
                var9.field2781 = 0;
            }
            this.field2740[arg0][var8.field2766] = var8;
        }
        this.field2745.field2757.method3251(var8);
        this.field2738[arg0][arg1] = var8;
    }

    @ObfuscatedName("fz.a(Lfm;ZI)V")
    public void method3122(class165 arg0, boolean arg1) {
        int var3 = arg0.field2764.field1140.length;
        int var5;
        if (arg1 && arg0.field2764.field1143) {
            int var4 = var3 + var3 - arg0.field2764.field1141;
            var5 = (int) ((long) this.field2734[arg0.field2770] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2769.method1122(true);
            }
        } else {
            var5 = (int) ((long) this.field2734[arg0.field2770] * (long) var3 >> 6);
        }
        arg0.field2769.method1121(var5);
    }

    @ObfuscatedName("fz.r(IIIB)V")
    public void method3105(int arg0, int arg1, int arg2) {
        class165 var4 = this.field2738[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2738[arg0][arg1] = null;
        if ((this.field2731[arg0] & 0x2) == 0) {
            var4.field2781 = 0;
            return;
        }
        for (class165 var5 = (class165) this.field2745.field2757.method3257(); var5 != null; var5 = (class165) this.field2745.field2757.method3249()) {
            if (var4.field2770 == var5.field2770 && var5.field2781 < 0 && var4 != var5) {
                var4.field2781 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("fz.m(IIII)V")
    public void method3109(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("fz.f(III)V")
    public void method3085(int arg0, int arg1) {
    }

    @ObfuscatedName("fz.k(IIB)V")
    public void method3086(int arg0, int arg1) {
        this.field2724[arg0] = arg1;
    }

    @ObfuscatedName("fz.p(II)V")
    public void method3087(int arg0) {
        for (class165 var2 = (class165) this.field2745.field2757.method3257(); var2 != null; var2 = (class165) this.field2745.field2757.method3249()) {
            if (arg0 < 0 || var2.field2770 == arg0) {
                if (var2.field2769 != null) {
                    var2.field2769.method1158(Statics.field1095 / 100);
                    if (var2.field2769.method1129()) {
                        this.field2745.field2758.method953(var2.field2769);
                    }
                    var2.method3173();
                }
                if (var2.field2781 < 0) {
                    this.field2738[var2.field2770][var2.field2762] = null;
                }
                var2.method3334();
            }
        }
    }

    @ObfuscatedName("fz.n(IB)V")
    public void method3088(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3088(var2);
            }
            return;
        }
        this.field2722[arg0] = 12800;
        this.field2720[arg0] = 8192;
        this.field2719[arg0] = 16383;
        this.field2724[arg0] = 8192;
        this.field2732[arg0] = 0;
        this.field2730[arg0] = 8192;
        this.method3099(arg0);
        this.method3092(arg0);
        this.field2731[arg0] = 0;
        this.field2744[arg0] = 32767;
        this.field2733[arg0] = 256;
        this.field2734[arg0] = 0;
        this.method3094(arg0, 8192);
    }

    @ObfuscatedName("fz.j(II)V")
    public void method3089(int arg0) {
        for (class165 var2 = (class165) this.field2745.field2757.method3257(); var2 != null; var2 = (class165) this.field2745.field2757.method3249()) {
            if ((arg0 < 0 || var2.field2770 == arg0) && var2.field2781 < 0) {
                this.field2738[var2.field2770][var2.field2762] = null;
                var2.field2781 = 0;
            }
        }
    }

    @ObfuscatedName("fz.x(I)V")
    public void method3090() {
        this.method3087(-1);
        this.method3088(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2726[var1] = this.field2725[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2727[var2] = this.field2725[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("fz.am(II)V")
    public void method3099(int arg0) {
        if ((this.field2731[arg0] & 0x2) == 0) {
            return;
        }
        for (class165 var2 = (class165) this.field2745.field2757.method3257(); var2 != null; var2 = (class165) this.field2745.field2757.method3249()) {
            if (var2.field2770 == arg0 && this.field2738[arg0][var2.field2762] == null && var2.field2781 < 0) {
                var2.field2781 = 0;
            }
        }
    }

    @ObfuscatedName("fz.aa(II)V")
    public void method3092(int arg0) {
        if ((this.field2731[arg0] & 0x4) == 0) {
            return;
        }
        for (class165 var2 = (class165) this.field2745.field2757.method3257(); var2 != null; var2 = (class165) this.field2745.field2757.method3249()) {
            if (var2.field2770 == arg0) {
                var2.field2782 = 0;
            }
        }
    }

    @ObfuscatedName("fz.ab(II)V")
    public void method3093(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3105(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3081(var6, var7, var8);
            } else {
                this.method3105(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3109(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2727[var12] = (var14 << 14) + (this.field2727[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2727[var12] = (var14 << 7) + (this.field2727[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2732[var12] = (var14 << 7) + (this.field2732[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2732[var12] = (this.field2732[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2730[var12] = (var14 << 7) + (this.field2730[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2730[var12] = (this.field2730[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2722[var12] = (var14 << 7) + (this.field2722[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2722[var12] = (this.field2722[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2720[var12] = (var14 << 7) + (this.field2720[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2720[var12] = (this.field2720[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2719[var12] = (var14 << 7) + (this.field2719[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2719[var12] = (this.field2719[var12] & 0xFFFFFF80) + var14;
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
                    this.method3099(var12);
                    this.field2731[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2744[var12] = (var14 << 7) + (this.field2744[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2744[var12] = (this.field2744[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2744[var12] = (var14 << 7) + (this.field2744[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2744[var12] = (this.field2744[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3087(var12);
            }
            if (var13 == 121) {
                this.method3088(var12);
            }
            if (var13 == 123) {
                this.method3089(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2744[var12];
                if (var15 == 16384) {
                    this.field2733[var12] = (var14 << 7) + (this.field2733[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2744[var12];
                if (var16 == 16384) {
                    this.field2733[var12] = (this.field2733[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2734[var12] = (var14 << 7) + (this.field2734[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2734[var12] = (this.field2734[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2731[var12] |= 0x4;
                } else {
                    this.method3092(var12);
                    this.field2731[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3094(var12, (var14 << 7) + (this.field2735[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3094(var12, (this.field2735[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3080(var17, this.field2727[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3085(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method3086(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3090();
            }
        }
    }

    @ObfuscatedName("fz.ar(III)V")
    public void method3094(int arg0, int arg1) {
        this.field2735[arg0] = arg1;
        this.field2736[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("fz.aq(Lfm;I)I")
    public int method3069(class165 arg0) {
        int var2 = (arg0.field2773 * arg0.field2772 >> 12) + arg0.field2776;
        int var3 = ((this.field2724[arg0.field2770] - 8192) * this.field2733[arg0.field2770] >> 12) + var2;
        class163 var4 = arg0.field2765;
        if (var4.field2753 > 0 && (var4.field2755 > 0 || this.field2732[arg0.field2770] > 0)) {
            int var5 = var4.field2755 << 2;
            int var6 = var4.field2747 << 1;
            if (arg0.field2778 < var6) {
                var5 = arg0.field2778 * var5 / var6;
            }
            int var7 = (this.field2732[arg0.field2770] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2779 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2764.field1142 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1095 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("fz.an(Lfm;I)I")
    public int method3095(class165 arg0) {
        class163 var2 = arg0.field2765;
        int var3 = this.field2722[arg0.field2770] * this.field2719[arg0.field2770] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2768 * var4 + 16384 >> 15;
        int var6 = this.field2729 * var5 + 128 >> 8;
        if (var2.field2749 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2780 * 1.953125E-5D * (double) var2.field2749) + 0.5D);
        }
        if (var2.field2748 != null) {
            int var7 = arg0.field2774;
            int var8 = var2.field2748[arg0.field2775 + 1];
            if (arg0.field2775 < var2.field2748.length - 2) {
                int var9 = (var2.field2748[arg0.field2775] & 0xFF) << 8;
                int var10 = (var2.field2748[arg0.field2775 + 2] & 0xFF) << 8;
                var8 += (var2.field2748[arg0.field2775 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2781 > 0 && var2.field2750 != null) {
            int var11 = arg0.field2781;
            int var12 = var2.field2750[arg0.field2777 + 1];
            if (arg0.field2777 < var2.field2750.length - 2) {
                int var13 = (var2.field2750[arg0.field2777] & 0xFF) << 8;
                int var14 = (var2.field2750[arg0.field2777 + 2] & 0xFF) << 8;
                var12 += (var2.field2750[arg0.field2777 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("fz.ac(Lfm;B)I")
    public int method3118(class165 arg0) {
        int var2 = this.field2720[arg0.field2770];
        return var2 < 8192 ? arg0.field2767 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2767) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("fz.s()Lbk;")
    public synchronized class60 method958() {
        return this.field2745;
    }

    @ObfuscatedName("fz.g()Lbk;")
    public synchronized class60 method959() {
        return null;
    }

    @ObfuscatedName("fz.u()I")
    public synchronized int method990() {
        return 0;
    }

    @ObfuscatedName("fz.d([III)V")
    public synchronized void method961(int[] arg0, int arg1, int arg2) {
        if (this.field2739.method3018()) {
            int var4 = this.field2721 * this.field2739.field2697 / Statics.field1095;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2743;
                if (this.field2728 - var5 >= 0L) {
                    this.field2743 = var5;
                    break;
                }
                int var7 = (int) ((this.field2728 - this.field2743 + (long) var4 - 1L) / (long) var4);
                this.field2743 += (long) var4 * (long) var7;
                this.field2745.method961(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3117();
            } while (this.field2739.method3018());
        }
        this.field2745.method961(arg0, arg1, arg2);
    }

    @ObfuscatedName("fz.e(I)V")
    public synchronized void method972(int arg0) {
        if (this.field2739.method3018()) {
            int var2 = this.field2721 * this.field2739.field2697 / Statics.field1095;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2743;
                if (this.field2728 - var3 >= 0L) {
                    this.field2743 = var3;
                    break;
                }
                int var5 = (int) ((this.field2728 - this.field2743 + (long) var2 - 1L) / (long) var2);
                this.field2743 += (long) var2 * (long) var5;
                this.field2745.method972(var5);
                arg0 -= var5;
                this.method3117();
            } while (this.field2739.method3018());
        }
        this.field2745.method972(arg0);
    }

    @ObfuscatedName("fz.ay(B)V")
    public void method3117() {
        int var1 = this.field2741;
        int var2 = this.field2742;
        long var3 = this.field2728;
        while (this.field2742 == var2) {
            while (this.field2739.field2706[var1] == var2) {
                this.field2739.method3004(var1);
                int var5 = this.field2739.method3008(var1);
                if (var5 == 1) {
                    this.field2739.method3006();
                    this.field2739.method3005(var1);
                    if (this.field2739.method3041()) {
                        if (!this.field2737 || var2 == 0) {
                            this.method3090();
                            this.field2739.method3001();
                            return;
                        }
                        this.field2739.method3013(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3093(var5);
                }
                this.field2739.method3022(var1);
                this.field2739.method3005(var1);
            }
            var1 = this.field2739.method3011();
            var2 = this.field2739.field2706[var1];
            var3 = this.field2739.method3043(var2);
        }
        this.field2741 = var1;
        this.field2742 = var2;
        this.field2728 = var3;
    }

    @ObfuscatedName("fz.ae(Lfm;I)Z")
    public boolean method3101(class165 arg0) {
        if (arg0.field2769 != null) {
            return false;
        }
        if (arg0.field2781 >= 0) {
            arg0.method3334();
            if (arg0.field2766 > 0 && this.field2740[arg0.field2770][arg0.field2766] == arg0) {
                this.field2740[arg0.field2770][arg0.field2766] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("fz.ah(Lfm;[IIIB)Z")
    public boolean method3084(class165 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2771 = Statics.field1095 / 100;
        if (arg0.field2781 >= 0 && arg0.field2769 == null || arg0.field2769.method1128()) {
            arg0.method3173();
            arg0.method3334();
            if (arg0.field2766 > 0 && this.field2740[arg0.field2770][arg0.field2766] == arg0) {
                this.field2740[arg0.field2770][arg0.field2766] = null;
            }
            return true;
        }
        int var5 = arg0.field2772;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2730[arg0.field2770] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2772 = var6;
        }
        arg0.field2769.method1126(this.method3069(arg0));
        class163 var7 = arg0.field2765;
        boolean var8 = false;
        arg0.field2778++;
        arg0.field2779 += var7.field2753;
        double var9 = (double) ((arg0.field2762 - 60 << 8) + (arg0.field2773 * arg0.field2772 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2749 > 0) {
            if (var7.field2752 > 0) {
                arg0.field2780 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2752 * var9) + 0.5D);
            } else {
                arg0.field2780 += 128;
            }
        }
        if (var7.field2748 != null) {
            if (var7.field2754 > 0) {
                arg0.field2774 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2754 * var9) + 0.5D);
            } else {
                arg0.field2774 += 128;
            }
            while (arg0.field2775 < var7.field2748.length - 2 && arg0.field2774 > (var7.field2748[arg0.field2775 + 2] & 0xFF) << 8) {
                arg0.field2775 += 2;
            }
            if (arg0.field2775 == var7.field2748.length - 2 && var7.field2748[arg0.field2775 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2781 >= 0 && var7.field2750 != null && (this.field2731[arg0.field2770] & 0x1) == 0 && (arg0.field2766 < 0 || this.field2740[arg0.field2770][arg0.field2766] != arg0)) {
            if (var7.field2751 > 0) {
                arg0.field2781 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2751 * var9) + 0.5D);
            } else {
                arg0.field2781 += 128;
            }
            while (arg0.field2777 < var7.field2750.length - 2 && arg0.field2781 > (var7.field2750[arg0.field2777 + 2] & 0xFF) << 8) {
                arg0.field2777 += 2;
            }
            if (arg0.field2777 == var7.field2750.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2769.method1237(arg0.field2771, this.method3095(arg0), this.method3118(arg0));
            return false;
        }
        arg0.field2769.method1158(arg0.field2771);
        if (arg1 == null) {
            arg0.field2769.method972(arg3);
        } else {
            arg0.field2769.method961(arg1, arg2, arg3);
        }
        if (arg0.field2769.method1129()) {
            this.field2745.field2758.method953(arg0.field2769);
        }
        arg0.method3173();
        if (arg0.field2781 >= 0) {
            arg0.method3334();
            if (arg0.field2766 > 0 && this.field2740[arg0.field2770][arg0.field2766] == arg0) {
                this.field2740[arg0.field2770][arg0.field2766] = null;
            }
        }
        return true;
    }
}
