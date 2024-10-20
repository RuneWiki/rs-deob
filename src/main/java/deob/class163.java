package deob;

@ObfuscatedName("fo")
public class class163 extends class60 {

    @ObfuscatedName("fo.g")
    public class175 field2740 = new class175(128);

    @ObfuscatedName("fo.s")
    public int field2757 = 256;

    @ObfuscatedName("fo.v")
    public int field2764 = 1000000;

    @ObfuscatedName("fo.o")
    public int[] field2742 = new int[16];

    @ObfuscatedName("fo.k")
    public int[] field2755 = new int[16];

    @ObfuscatedName("fo.m")
    public int[] field2744 = new int[16];

    @ObfuscatedName("fo.i")
    public int[] field2745 = new int[16];

    @ObfuscatedName("fo.t")
    public int[] field2746 = new int[16];

    @ObfuscatedName("fo.l")
    public int[] field2747 = new int[16];

    @ObfuscatedName("fo.p")
    public int[] field2748 = new int[16];

    @ObfuscatedName("fo.r")
    public int[] field2756 = new int[16];

    @ObfuscatedName("fo.j")
    public int[] field2739 = new int[16];

    @ObfuscatedName("fo.z")
    public int[] field2751 = new int[16];

    @ObfuscatedName("fo.x")
    public int[] field2752 = new int[16];

    @ObfuscatedName("fo.e")
    public int[] field2753 = new int[16];

    @ObfuscatedName("fo.a")
    public int[] field2754 = new int[16];

    @ObfuscatedName("fo.y")
    public int[] field2750 = new int[16];

    @ObfuscatedName("fo.f")
    public int[] field2741 = new int[16];

    @ObfuscatedName("fo.u")
    public class166[][] field2743 = new class166[16][128];

    @ObfuscatedName("fo.ab")
    public class166[][] field2758 = new class166[16][128];

    @ObfuscatedName("fo.ai")
    public class161 field2749 = new class161();

    @ObfuscatedName("fo.aj")
    public boolean field2760;

    @ObfuscatedName("fo.as")
    public int field2761;

    @ObfuscatedName("fo.ax")
    public int field2762;

    @ObfuscatedName("fo.ac")
    public long field2763;

    @ObfuscatedName("fo.az")
    public long field2759;

    @ObfuscatedName("fo.au")
    public class165 field2765 = new class165(this);

    public class163() {
        this.method3018();
    }

    @ObfuscatedName("fo.g(II)V")
    public synchronized void method3026(int arg0) {
        this.field2757 = arg0;
    }

    @ObfuscatedName("fo.s(B)I")
    public int method3031() {
        return this.field2757;
    }

    @ObfuscatedName("fo.v(Lfb;Let;Lbq;II)Z")
    public synchronized boolean method2989(class159 arg0, class147 arg1, class53 arg2, int arg3) {
        arg0.method2901();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class176 var7 = (class176) arg0.field2700.method3154(); var7 != null; var7 = (class176) arg0.field2700.method3163()) {
            int var8 = (int) var7.field2884;
            class160 var9 = (class160) this.field2740.method3155((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method2691(var8);
                class160 var11;
                if (var10 == null) {
                    var11 = null;
                } else {
                    var11 = new class160(var10);
                }
                var9 = var11;
                if (var11 == null) {
                    var5 = false;
                    continue;
                }
                this.field2740.method3152(var11, (long) var8);
            }
            if (!var9.method2905(arg2, var7.field2862, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method2896();
        }
        return var5;
    }

    @ObfuscatedName("fo.o(B)V")
    public synchronized void method2990() {
        for (class160 var1 = (class160) this.field2740.method3154(); var1 != null; var1 = (class160) this.field2740.method3163()) {
            var1.method2906();
        }
    }

    @ObfuscatedName("fo.k(I)V")
    public synchronized void method2991() {
        for (class160 var1 = (class160) this.field2740.method3154(); var1 != null; var1 = (class160) this.field2740.method3163()) {
            var1.method3285();
        }
    }

    @ObfuscatedName("fo.p(Lfb;ZI)V")
    public synchronized void method2992(class159 arg0, boolean arg1) {
        this.method2993();
        this.field2749.method2954(arg0.field2699);
        this.field2760 = arg1;
        this.field2763 = 0L;
        int var3 = this.field2749.method2913();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2749.method2914(var4);
            this.field2749.method2917(var4);
            this.field2749.method2915(var4);
        }
        this.field2761 = this.field2749.method2922();
        this.field2762 = this.field2749.field2719[this.field2761];
        this.field2759 = this.field2749.method2921(this.field2762);
    }

    @ObfuscatedName("fo.j(I)V")
    public synchronized void method2993() {
        this.field2749.method2911();
        this.method3018();
    }

    @ObfuscatedName("fo.c(S)Z")
    public synchronized boolean method3065() {
        return this.field2749.method2912();
    }

    @ObfuscatedName("fo.q(IIB)V")
    public synchronized void method2995(int arg0, int arg1) {
        this.method3071(arg0, arg1);
    }

    @ObfuscatedName("fo.n(IIB)V")
    public void method3071(int arg0, int arg1) {
        this.field2745[arg0] = arg1;
        this.field2747[arg0] = arg1 & 0xFFFFFF80;
        this.method2996(arg0, arg1);
    }

    @ObfuscatedName("fo.h(III)V")
    public void method2996(int arg0, int arg1) {
        if (this.field2746[arg0] != arg1) {
            this.field2746[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2758[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("fo.d(IIII)V")
    public void method2997(int arg0, int arg1, int arg2) {
        this.method3076(arg0, arg1, 64);
        if ((this.field2751[arg0] & 0x2) != 0) {
            for (class166 var4 = (class166) this.field2765.field2780.method3210(); var4 != null; var4 = (class166) this.field2765.field2780.method3200()) {
                if (var4.field2795 == arg0 && var4.field2799 < 0) {
                    this.field2743[arg0][var4.field2790] = null;
                    this.field2743[arg0][arg1] = var4;
                    int var5 = (var4.field2794 * var4.field2791 >> 12) + var4.field2793;
                    var4.field2793 += arg1 - var4.field2790 << 8;
                    var4.field2791 = var5 - var4.field2793;
                    var4.field2794 = 4096;
                    var4.field2790 = arg1;
                    return;
                }
            }
        }
        class160 var6 = (class160) this.field2740.method3155((long) this.field2746[arg0]);
        if (var6 == null) {
            return;
        }
        class56 var7 = var6.field2702[arg1];
        if (var7 == null) {
            return;
        }
        class166 var8 = new class166();
        var8.field2795 = arg0;
        var8.field2786 = var6;
        var8.field2798 = var7;
        var8.field2801 = var6.field2714[arg1];
        var8.field2789 = var6.field2709[arg1];
        var8.field2790 = arg1;
        var8.field2788 = var6.field2708 * arg2 * arg2 * var6.field2704[arg1] + 1024 >> 11;
        var8.field2792 = var6.field2705[arg1] & 0xFF;
        var8.field2793 = (arg1 << 8) - (var6.field2701[arg1] & 0x7FFF);
        var8.field2787 = 0;
        var8.field2797 = 0;
        var8.field2796 = 0;
        var8.field2799 = -1;
        var8.field2803 = 0;
        if (this.field2754[arg0] == 0) {
            var8.field2785 = class58.method1182(var7, this.method3009(var8), this.method3010(var8), this.method3011(var8));
        } else {
            var8.field2785 = class58.method1182(var7, this.method3009(var8), 0, this.method3011(var8));
            this.method2998(var8, var6.field2701[arg1] < 0);
        }
        if (var6.field2701[arg1] < 0) {
            var8.field2785.method1089(-1);
        }
        if (var8.field2789 >= 0) {
            class166 var9 = this.field2758[arg0][var8.field2789];
            if (var9 != null && var9.field2799 < 0) {
                this.field2743[arg0][var9.field2790] = null;
                var9.field2799 = 0;
            }
            this.field2758[arg0][var8.field2789] = var8;
        }
        this.field2765.field2780.method3184(var8);
        this.field2743[arg0][arg1] = var8;
    }

    @ObfuscatedName("fo.b(Lfv;ZI)V")
    public void method2998(class166 arg0, boolean arg1) {
        int var3 = arg0.field2798.field1128.length;
        int var5;
        if (arg1 && arg0.field2798.field1131) {
            int var4 = var3 + var3 - arg0.field2798.field1127;
            var5 = (int) ((long) this.field2754[arg0.field2795] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2785.method1096(true);
            }
        } else {
            var5 = (int) ((long) this.field2754[arg0.field2795] * (long) var3 >> 6);
        }
        arg0.field2785.method1095(var5);
    }

    @ObfuscatedName("fo.w(IIII)V")
    public void method3076(int arg0, int arg1, int arg2) {
        class166 var4 = this.field2743[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2743[arg0][arg1] = null;
        if ((this.field2751[arg0] & 0x2) == 0) {
            var4.field2799 = 0;
            return;
        }
        for (class166 var5 = (class166) this.field2765.field2780.method3189(); var5 != null; var5 = (class166) this.field2765.field2780.method3182()) {
            if (var4.field2795 == var5.field2795 && var5.field2799 < 0 && var4 != var5) {
                var4.field2799 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("fo.z(IIII)V")
    public void method3053(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("fo.x(III)V")
    public void method3001(int arg0, int arg1) {
    }

    @ObfuscatedName("fo.e(III)V")
    public void method3002(int arg0, int arg1) {
        this.field2748[arg0] = arg1;
    }

    @ObfuscatedName("fo.am(IB)V")
    public void method3017(int arg0) {
        for (class166 var2 = (class166) this.field2765.field2780.method3189(); var2 != null; var2 = (class166) this.field2765.field2780.method3182()) {
            if (arg0 < 0 || var2.field2795 == arg0) {
                if (var2.field2785 != null) {
                    var2.field2785.method1139(Statics.field1078 / 100);
                    if (var2.field2785.method1103()) {
                        this.field2765.field2781.method960(var2.field2785);
                    }
                    var2.method3100();
                }
                if (var2.field2799 < 0) {
                    this.field2743[var2.field2795][var2.field2790] = null;
                }
                var2.method3285();
            }
        }
    }

    @ObfuscatedName("fo.aq(II)V")
    public void method3003(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3003(var2);
            }
            return;
        }
        this.field2742[arg0] = 12800;
        this.field2755[arg0] = 8192;
        this.field2744[arg0] = 16383;
        this.field2748[arg0] = 8192;
        this.field2756[arg0] = 0;
        this.field2739[arg0] = 8192;
        this.method3005(arg0);
        this.method3059(arg0);
        this.field2751[arg0] = 0;
        this.field2752[arg0] = 32767;
        this.field2753[arg0] = 256;
        this.field2754[arg0] = 0;
        this.method3020(arg0, 8192);
    }

    @ObfuscatedName("fo.ay(II)V")
    public void method3015(int arg0) {
        for (class166 var2 = (class166) this.field2765.field2780.method3189(); var2 != null; var2 = (class166) this.field2765.field2780.method3182()) {
            if ((arg0 < 0 || var2.field2795 == arg0) && var2.field2799 < 0) {
                this.field2743[var2.field2795][var2.field2790] = null;
                var2.field2799 = 0;
            }
        }
    }

    @ObfuscatedName("fo.an(I)V")
    public void method3018() {
        this.method3017(-1);
        this.method3003(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2746[var1] = this.field2745[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2747[var2] = this.field2745[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("fo.ak(II)V")
    public void method3005(int arg0) {
        if ((this.field2751[arg0] & 0x2) == 0) {
            return;
        }
        for (class166 var2 = (class166) this.field2765.field2780.method3189(); var2 != null; var2 = (class166) this.field2765.field2780.method3182()) {
            if (var2.field2795 == arg0 && this.field2743[arg0][var2.field2790] == null && var2.field2799 < 0) {
                var2.field2799 = 0;
            }
        }
    }

    @ObfuscatedName("fo.ad(II)V")
    public void method3059(int arg0) {
        if ((this.field2751[arg0] & 0x4) == 0) {
            return;
        }
        for (class166 var2 = (class166) this.field2765.field2780.method3189(); var2 != null; var2 = (class166) this.field2765.field2780.method3182()) {
            if (var2.field2795 == arg0) {
                var2.field2805 = 0;
            }
        }
    }

    @ObfuscatedName("fo.aw(IB)V")
    public void method3007(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3076(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method2997(var6, var7, var8);
            } else {
                this.method3076(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3053(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2747[var12] = (var14 << 14) + (this.field2747[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2747[var12] = (var14 << 7) + (this.field2747[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2756[var12] = (var14 << 7) + (this.field2756[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2756[var12] = (this.field2756[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2739[var12] = (var14 << 7) + (this.field2739[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2739[var12] = (this.field2739[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2742[var12] = (var14 << 7) + (this.field2742[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2742[var12] = (this.field2742[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2755[var12] = (var14 << 7) + (this.field2755[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2755[var12] = (this.field2755[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2744[var12] = (var14 << 7) + (this.field2744[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2744[var12] = (this.field2744[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2751[var12] |= 0x1;
                } else {
                    this.field2751[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2751[var12] |= 0x2;
                } else {
                    this.method3005(var12);
                    this.field2751[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2752[var12] = (var14 << 7) + (this.field2752[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2752[var12] = (this.field2752[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2752[var12] = (var14 << 7) + (this.field2752[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2752[var12] = (this.field2752[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3017(var12);
            }
            if (var13 == 121) {
                this.method3003(var12);
            }
            if (var13 == 123) {
                this.method3015(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2752[var12];
                if (var15 == 16384) {
                    this.field2753[var12] = (var14 << 7) + (this.field2753[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2752[var12];
                if (var16 == 16384) {
                    this.field2753[var12] = (this.field2753[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2754[var12] = (var14 << 7) + (this.field2754[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2754[var12] = (this.field2754[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2751[var12] |= 0x4;
                } else {
                    this.method3059(var12);
                    this.field2751[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3020(var12, (var14 << 7) + (this.field2750[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3020(var12, (this.field2750[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method2996(var17, this.field2747[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3001(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method3002(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3018();
            }
        }
    }

    @ObfuscatedName("fo.ah(III)V")
    public void method3020(int arg0, int arg1) {
        this.field2750[arg0] = arg1;
        this.field2741[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("fo.at(Lfv;I)I")
    public int method3009(class166 arg0) {
        int var2 = (arg0.field2794 * arg0.field2791 >> 12) + arg0.field2793;
        int var3 = ((this.field2748[arg0.field2795] - 8192) * this.field2753[arg0.field2795] >> 12) + var2;
        class164 var4 = arg0.field2801;
        if (var4.field2777 > 0 && (var4.field2774 > 0 || this.field2756[arg0.field2795] > 0)) {
            int var5 = var4.field2774 << 2;
            int var6 = var4.field2776 << 1;
            if (arg0.field2800 < var6) {
                var5 = arg0.field2800 * var5 / var6;
            }
            int var7 = (this.field2756[arg0.field2795] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2802 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2798.field1130 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1078 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("fo.aa(Lfv;I)I")
    public int method3010(class166 arg0) {
        class164 var2 = arg0.field2801;
        int var3 = this.field2744[arg0.field2795] * this.field2742[arg0.field2795] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2788 * var4 + 16384 >> 15;
        int var6 = this.field2757 * var5 + 128 >> 8;
        if (var2.field2770 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2787 * 1.953125E-5D * (double) var2.field2770) + 0.5D);
        }
        if (var2.field2778 != null) {
            int var7 = arg0.field2797;
            int var8 = var2.field2778[arg0.field2796 + 1];
            if (arg0.field2796 < var2.field2778.length - 2) {
                int var9 = (var2.field2778[arg0.field2796] & 0xFF) << 8;
                int var10 = (var2.field2778[arg0.field2796 + 2] & 0xFF) << 8;
                var8 += (var2.field2778[arg0.field2796 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2799 > 0 && var2.field2768 != null) {
            int var11 = arg0.field2799;
            int var12 = var2.field2768[arg0.field2803 + 1];
            if (arg0.field2803 < var2.field2768.length - 2) {
                int var13 = (var2.field2768[arg0.field2803] & 0xFF) << 8;
                int var14 = (var2.field2768[arg0.field2803 + 2] & 0xFF) << 8;
                var12 += (var2.field2768[arg0.field2803 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("fo.ar(Lfv;I)I")
    public int method3011(class166 arg0) {
        int var2 = this.field2755[arg0.field2795];
        return var2 < 8192 ? arg0.field2792 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2792) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("fo.m()Lbm;")
    public synchronized class60 method932() {
        return this.field2765;
    }

    @ObfuscatedName("fo.i()Lbm;")
    public synchronized class60 method937() {
        return null;
    }

    @ObfuscatedName("fo.t()I")
    public synchronized int method938() {
        return 0;
    }

    @ObfuscatedName("fo.l([III)V")
    public synchronized void method939(int[] arg0, int arg1, int arg2) {
        if (this.field2749.method2912()) {
            int var4 = this.field2764 * this.field2749.field2717 / Statics.field1078;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2763;
                if (this.field2759 - var5 >= 0L) {
                    this.field2763 = var5;
                    break;
                }
                int var7 = (int) ((this.field2759 - this.field2763 + (long) var4 - 1L) / (long) var4);
                this.field2763 += (long) var4 * (long) var7;
                this.field2765.method939(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3019();
            } while (this.field2749.method2912());
        }
        this.field2765.method939(arg0, arg1, arg2);
    }

    @ObfuscatedName("fo.r(I)V")
    public synchronized void method941(int arg0) {
        if (this.field2749.method2912()) {
            int var2 = this.field2764 * this.field2749.field2717 / Statics.field1078;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2763;
                if (this.field2759 - var3 >= 0L) {
                    this.field2763 = var3;
                    break;
                }
                int var5 = (int) ((this.field2759 - this.field2763 + (long) var2 - 1L) / (long) var2);
                this.field2763 += (long) var2 * (long) var5;
                this.field2765.method941(var5);
                arg0 -= var5;
                this.method3019();
            } while (this.field2749.method2912());
        }
        this.field2765.method941(arg0);
    }

    @ObfuscatedName("fo.ap(I)V")
    public void method3019() {
        int var1 = this.field2761;
        int var2 = this.field2762;
        long var3 = this.field2759;
        while (this.field2762 == var2) {
            while (this.field2749.field2719[var1] == var2) {
                this.field2749.method2914(var1);
                int var5 = this.field2749.method2918(var1);
                if (var5 == 1) {
                    this.field2749.method2939();
                    this.field2749.method2915(var1);
                    if (this.field2749.method2923()) {
                        if (!this.field2760 || var2 == 0) {
                            this.method3018();
                            this.field2749.method2911();
                            return;
                        }
                        this.field2749.method2924(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3007(var5);
                }
                this.field2749.method2917(var1);
                this.field2749.method2915(var1);
            }
            var1 = this.field2749.method2922();
            var2 = this.field2749.field2719[var1];
            var3 = this.field2749.method2921(var2);
        }
        this.field2761 = var1;
        this.field2762 = var2;
        this.field2759 = var3;
    }

    @ObfuscatedName("fo.ag(Lfv;I)Z")
    public boolean method2999(class166 arg0) {
        if (arg0.field2785 != null) {
            return false;
        }
        if (arg0.field2799 >= 0) {
            arg0.method3285();
            if (arg0.field2789 > 0 && this.field2758[arg0.field2795][arg0.field2789] == arg0) {
                this.field2758[arg0.field2795][arg0.field2789] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("fo.af(Lfv;[IIII)Z")
    public boolean method3004(class166 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2804 = Statics.field1078 / 100;
        if (arg0.field2799 >= 0 && arg0.field2785 == null || arg0.field2785.method1112()) {
            arg0.method3100();
            arg0.method3285();
            if (arg0.field2789 > 0 && this.field2758[arg0.field2795][arg0.field2789] == arg0) {
                this.field2758[arg0.field2795][arg0.field2789] = null;
            }
            return true;
        }
        int var5 = arg0.field2794;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2739[arg0.field2795] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2794 = var6;
        }
        arg0.field2785.method1083(this.method3009(arg0));
        class164 var7 = arg0.field2801;
        boolean var8 = false;
        arg0.field2800++;
        arg0.field2802 += var7.field2777;
        double var9 = (double) ((arg0.field2790 - 60 << 8) + (arg0.field2794 * arg0.field2791 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2770 > 0) {
            if (var7.field2773 > 0) {
                arg0.field2787 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2773 * var9) + 0.5D);
            } else {
                arg0.field2787 += 128;
            }
        }
        if (var7.field2778 != null) {
            if (var7.field2771 > 0) {
                arg0.field2797 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2771 * var9) + 0.5D);
            } else {
                arg0.field2797 += 128;
            }
            while (arg0.field2796 < var7.field2778.length - 2 && arg0.field2797 > (var7.field2778[arg0.field2796 + 2] & 0xFF) << 8) {
                arg0.field2796 += 2;
            }
            if (arg0.field2796 == var7.field2778.length - 2 && var7.field2778[arg0.field2796 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2799 >= 0 && var7.field2768 != null && (this.field2751[arg0.field2795] & 0x1) == 0 && (arg0.field2789 < 0 || this.field2758[arg0.field2795][arg0.field2789] != arg0)) {
            if (var7.field2772 > 0) {
                arg0.field2799 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2772 * var9) + 0.5D);
            } else {
                arg0.field2799 += 128;
            }
            while (arg0.field2803 < var7.field2768.length - 2 && arg0.field2799 > (var7.field2768[arg0.field2803 + 2] & 0xFF) << 8) {
                arg0.field2803 += 2;
            }
            if (arg0.field2803 == var7.field2768.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2785.method1202(arg0.field2804, this.method3010(arg0), this.method3011(arg0));
            return false;
        }
        arg0.field2785.method1139(arg0.field2804);
        if (arg1 == null) {
            arg0.field2785.method941(arg3);
        } else {
            arg0.field2785.method939(arg1, arg2, arg3);
        }
        if (arg0.field2785.method1103()) {
            this.field2765.field2781.method960(arg0.field2785);
        }
        arg0.method3100();
        if (arg0.field2799 >= 0) {
            arg0.method3285();
            if (arg0.field2789 > 0 && this.field2758[arg0.field2795][arg0.field2789] == arg0) {
                this.field2758[arg0.field2795][arg0.field2789] = null;
            }
        }
        return true;
    }
}
