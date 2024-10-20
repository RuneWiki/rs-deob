package deob;

@ObfuscatedName("fz")
public class class162 extends class60 {

    @ObfuscatedName("fz.e")
    public class174 field2727 = new class174(128);

    @ObfuscatedName("fz.v")
    public int field2715 = 256;

    @ObfuscatedName("fz.i")
    public int field2720 = 1000000;

    @ObfuscatedName("fz.g")
    public int[] field2716 = new int[16];

    @ObfuscatedName("fz.x")
    public int[] field2717 = new int[16];

    @ObfuscatedName("fz.b")
    public int[] field2718 = new int[16];

    @ObfuscatedName("fz.q")
    public int[] field2722 = new int[16];

    @ObfuscatedName("fz.l")
    public int[] field2714 = new int[16];

    @ObfuscatedName("fz.m")
    public int[] field2721 = new int[16];

    @ObfuscatedName("fz.u")
    public int[] field2735 = new int[16];

    @ObfuscatedName("fz.s")
    public int[] field2731 = new int[16];

    @ObfuscatedName("fz.f")
    public int[] field2723 = new int[16];

    @ObfuscatedName("fz.a")
    public int[] field2725 = new int[16];

    @ObfuscatedName("fz.o")
    public int[] field2726 = new int[16];

    @ObfuscatedName("fz.r")
    public int[] field2724 = new int[16];

    @ObfuscatedName("fz.t")
    public int[] field2728 = new int[16];

    @ObfuscatedName("fz.k")
    public int[] field2729 = new int[16];

    @ObfuscatedName("fz.n")
    public int[] field2730 = new int[16];

    @ObfuscatedName("fz.z")
    public class165[][] field2719 = new class165[16][128];

    @ObfuscatedName("fz.av")
    public class165[][] field2732 = new class165[16][128];

    @ObfuscatedName("fz.ao")
    public class160 field2733 = new class160();

    @ObfuscatedName("fz.am")
    public boolean field2734;

    @ObfuscatedName("fz.ac")
    public int field2736;

    @ObfuscatedName("fz.ak")
    public int field2713;

    @ObfuscatedName("fz.ag")
    public long field2737;

    @ObfuscatedName("fz.ap")
    public long field2738;

    @ObfuscatedName("fz.ah")
    public class164 field2739 = new class164(this);

    public class162() {
        this.method3065();
    }

    @ObfuscatedName("fz.e(II)V")
    public synchronized void method3003(int arg0) {
        this.field2715 = arg0;
    }

    @ObfuscatedName("fz.v(B)I")
    public int method3047() {
        return this.field2715;
    }

    @ObfuscatedName("fz.i(Lfs;Les;Lbc;IB)Z")
    public synchronized boolean method3005(class158 arg0, class146 arg1, class53 arg2, int arg3) {
        arg0.method2933();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class175 var7 = (class175) arg0.field2678.method3162(); var7 != null; var7 = (class175) arg0.field2678.method3163()) {
            int var8 = (int) var7.field2867;
            class159 var9 = (class159) this.field2727.method3171((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method2745(var8);
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
                this.field2727.method3168(var11, (long) var8);
            }
            if (!var9.method2939(arg2, var7.field2845, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method2929();
        }
        return var5;
    }

    @ObfuscatedName("fz.g(I)V")
    public synchronized void method3101() {
        for (class159 var1 = (class159) this.field2727.method3162(); var1 != null; var1 = (class159) this.field2727.method3163()) {
            var1.method2941();
        }
    }

    @ObfuscatedName("fz.x(I)V")
    public synchronized void method3006() {
        for (class159 var1 = (class159) this.field2727.method3162(); var1 != null; var1 = (class159) this.field2727.method3163()) {
            var1.method3273();
        }
    }

    @ObfuscatedName("fz.u(Lfs;ZB)V")
    public synchronized void method3007(class158 arg0, boolean arg1) {
        this.method3008();
        this.field2733.method2948(arg0.field2679);
        this.field2734 = arg1;
        this.field2737 = 0L;
        int var3 = this.field2733.method2955();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2733.method2952(var4);
            this.field2733.method2947(var4);
            this.field2733.method2990(var4);
        }
        this.field2736 = this.field2733.method2959();
        this.field2713 = this.field2733.field2693[this.field2736];
        this.field2738 = this.field2733.method2975(this.field2713);
    }

    @ObfuscatedName("fz.f(B)V")
    public synchronized void method3008() {
        this.field2733.method2949();
        this.method3065();
    }

    @ObfuscatedName("fz.p(I)Z")
    public synchronized boolean method3057() {
        return this.field2733.method2950();
    }

    @ObfuscatedName("fz.w(III)V")
    public synchronized void method3054(int arg0, int arg1) {
        this.method3095(arg0, arg1);
    }

    @ObfuscatedName("fz.y(IIS)V")
    public void method3095(int arg0, int arg1) {
        this.field2722[arg0] = arg1;
        this.field2721[arg0] = arg1 & 0xFFFFFF80;
        this.method3096(arg0, arg1);
    }

    @ObfuscatedName("fz.h(III)V")
    public void method3096(int arg0, int arg1) {
        if (this.field2714[arg0] != arg1) {
            this.field2714[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2732[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("fz.j(IIIB)V")
    public void method3012(int arg0, int arg1, int arg2) {
        this.method3033(arg0, arg1, 64);
        if ((this.field2725[arg0] & 0x2) != 0) {
            for (class165 var4 = (class165) this.field2739.field2753.method3190(); var4 != null; var4 = (class165) this.field2739.field2753.method3193()) {
                if (var4.field2760 == arg0 && var4.field2780 < 0) {
                    this.field2719[arg0][var4.field2765] = null;
                    this.field2719[arg0][arg1] = var4;
                    int var5 = (var4.field2770 * var4.field2769 >> 12) + var4.field2768;
                    var4.field2768 += arg1 - var4.field2765 << 8;
                    var4.field2769 = var5 - var4.field2768;
                    var4.field2770 = 4096;
                    var4.field2765 = arg1;
                    return;
                }
            }
        }
        class159 var6 = (class159) this.field2727.method3171((long) this.field2714[arg0]);
        if (var6 == null) {
            return;
        }
        class56 var7 = var6.field2690[arg1];
        if (var7 == null) {
            return;
        }
        class165 var8 = new class165();
        var8.field2760 = arg0;
        var8.field2778 = var6;
        var8.field2777 = var7;
        var8.field2763 = var6.field2685[arg1];
        var8.field2764 = var6.field2686[arg1];
        var8.field2765 = arg1;
        var8.field2766 = var6.field2688 * arg2 * arg2 * var6.field2684[arg1] + 1024 >> 11;
        var8.field2767 = var6.field2680[arg1] & 0xFF;
        var8.field2768 = (arg1 << 8) - (var6.field2682[arg1] & 0x7FFF);
        var8.field2761 = 0;
        var8.field2772 = 0;
        var8.field2773 = 0;
        var8.field2780 = -1;
        var8.field2775 = 0;
        if (this.field2728[arg0] == 0) {
            var8.field2762 = class58.method1091(var7, this.method3025(var8), this.method3026(var8), this.method3027(var8));
        } else {
            var8.field2762 = class58.method1091(var7, this.method3025(var8), 0, this.method3027(var8));
            this.method3050(var8, var6.field2682[arg1] < 0);
        }
        if (var6.field2682[arg1] < 0) {
            var8.field2762.method1093(-1);
        }
        if (var8.field2764 >= 0) {
            class165 var9 = this.field2732[arg0][var8.field2764];
            if (var9 != null && var9.field2780 < 0) {
                this.field2719[arg0][var9.field2765] = null;
                var9.field2780 = 0;
            }
            this.field2732[arg0][var8.field2764] = var8;
        }
        this.field2739.field2753.method3183(var8);
        this.field2719[arg0][arg1] = var8;
    }

    @ObfuscatedName("fz.c(Lfu;ZI)V")
    public void method3050(class165 arg0, boolean arg1) {
        int var3 = arg0.field2777.field1125.length;
        int var5;
        if (arg1 && arg0.field2777.field1126) {
            int var4 = var3 + var3 - arg0.field2777.field1127;
            var5 = (int) ((long) this.field2728[arg0.field2760] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2762.method1099(true);
            }
        } else {
            var5 = (int) ((long) this.field2728[arg0.field2760] * (long) var3 >> 6);
        }
        arg0.field2762.method1098(var5);
    }

    @ObfuscatedName("fz.d(IIII)V")
    public void method3033(int arg0, int arg1, int arg2) {
        class165 var4 = this.field2719[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2719[arg0][arg1] = null;
        if ((this.field2725[arg0] & 0x2) == 0) {
            var4.field2780 = 0;
            return;
        }
        for (class165 var5 = (class165) this.field2739.field2753.method3210(); var5 != null; var5 = (class165) this.field2739.field2753.method3182()) {
            if (var4.field2760 == var5.field2760 && var5.field2780 < 0 && var4 != var5) {
                var4.field2780 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("fz.a(IIIB)V")
    public void method3022(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("fz.o(III)V")
    public void method3016(int arg0, int arg1) {
    }

    @ObfuscatedName("fz.ah(III)V")
    public void method3017(int arg0, int arg1) {
        this.field2735[arg0] = arg1;
    }

    @ObfuscatedName("fz.an(II)V")
    public void method3018(int arg0) {
        for (class165 var2 = (class165) this.field2739.field2753.method3210(); var2 != null; var2 = (class165) this.field2739.field2753.method3182()) {
            if (arg0 < 0 || var2.field2760 == arg0) {
                if (var2.field2762 != null) {
                    var2.field2762.method1219(Statics.field1077 / 100);
                    if (var2.field2762.method1106()) {
                        this.field2739.field2755.method947(var2.field2762);
                    }
                    var2.method3118();
                }
                if (var2.field2780 < 0) {
                    this.field2719[var2.field2760][var2.field2765] = null;
                }
                var2.method3273();
            }
        }
    }

    @ObfuscatedName("fz.ay(II)V")
    public void method3014(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3014(var2);
            }
            return;
        }
        this.field2716[arg0] = 12800;
        this.field2717[arg0] = 8192;
        this.field2718[arg0] = 16383;
        this.field2735[arg0] = 8192;
        this.field2731[arg0] = 0;
        this.field2723[arg0] = 8192;
        this.method3021(arg0);
        this.method3036(arg0);
        this.field2725[arg0] = 0;
        this.field2726[arg0] = 32767;
        this.field2724[arg0] = 256;
        this.field2728[arg0] = 0;
        this.method3024(arg0, 8192);
    }

    @ObfuscatedName("fz.af(II)V")
    public void method3020(int arg0) {
        for (class165 var2 = (class165) this.field2739.field2753.method3210(); var2 != null; var2 = (class165) this.field2739.field2753.method3182()) {
            if ((arg0 < 0 || var2.field2760 == arg0) && var2.field2780 < 0) {
                this.field2719[var2.field2760][var2.field2765] = null;
                var2.field2780 = 0;
            }
        }
    }

    @ObfuscatedName("fz.at(B)V")
    public void method3065() {
        this.method3018(-1);
        this.method3014(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2714[var1] = this.field2722[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2721[var2] = this.field2722[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("fz.aw(II)V")
    public void method3021(int arg0) {
        if ((this.field2725[arg0] & 0x2) == 0) {
            return;
        }
        for (class165 var2 = (class165) this.field2739.field2753.method3210(); var2 != null; var2 = (class165) this.field2739.field2753.method3182()) {
            if (var2.field2760 == arg0 && this.field2719[arg0][var2.field2765] == null && var2.field2780 < 0) {
                var2.field2780 = 0;
            }
        }
    }

    @ObfuscatedName("fz.ar(II)V")
    public void method3036(int arg0) {
        if ((this.field2725[arg0] & 0x4) == 0) {
            return;
        }
        for (class165 var2 = (class165) this.field2739.field2753.method3210(); var2 != null; var2 = (class165) this.field2739.field2753.method3182()) {
            if (var2.field2760 == arg0) {
                var2.field2779 = 0;
            }
        }
    }

    @ObfuscatedName("fz.az(II)V")
    public void method3023(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3033(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3012(var6, var7, var8);
            } else {
                this.method3033(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3022(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2721[var12] = (var14 << 14) + (this.field2721[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2721[var12] = (var14 << 7) + (this.field2721[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2731[var12] = (var14 << 7) + (this.field2731[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2731[var12] = (this.field2731[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2723[var12] = (var14 << 7) + (this.field2723[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2723[var12] = (this.field2723[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2716[var12] = (var14 << 7) + (this.field2716[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2716[var12] = (this.field2716[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2717[var12] = (var14 << 7) + (this.field2717[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2717[var12] = (this.field2717[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2718[var12] = (var14 << 7) + (this.field2718[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2718[var12] = (this.field2718[var12] & 0xFFFFFF80) + var14;
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
                    this.method3021(var12);
                    this.field2725[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2726[var12] = (var14 << 7) + (this.field2726[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2726[var12] = (this.field2726[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2726[var12] = (var14 << 7) + (this.field2726[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2726[var12] = (this.field2726[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3018(var12);
            }
            if (var13 == 121) {
                this.method3014(var12);
            }
            if (var13 == 123) {
                this.method3020(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2726[var12];
                if (var15 == 16384) {
                    this.field2724[var12] = (var14 << 7) + (this.field2724[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2726[var12];
                if (var16 == 16384) {
                    this.field2724[var12] = (this.field2724[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2728[var12] = (var14 << 7) + (this.field2728[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2728[var12] = (this.field2728[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2725[var12] |= 0x4;
                } else {
                    this.method3036(var12);
                    this.field2725[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3024(var12, (var14 << 7) + (this.field2729[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3024(var12, (this.field2729[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3096(var17, this.field2721[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3016(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method3017(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3065();
            }
        }
    }

    @ObfuscatedName("fz.ai(IIB)V")
    public void method3024(int arg0, int arg1) {
        this.field2729[arg0] = arg1;
        this.field2730[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("fz.ad(Lfu;B)I")
    public int method3025(class165 arg0) {
        int var2 = (arg0.field2770 * arg0.field2769 >> 12) + arg0.field2768;
        int var3 = ((this.field2735[arg0.field2760] - 8192) * this.field2724[arg0.field2760] >> 12) + var2;
        class163 var4 = arg0.field2763;
        if (var4.field2748 > 0 && (var4.field2747 > 0 || this.field2731[arg0.field2760] > 0)) {
            int var5 = var4.field2747 << 2;
            int var6 = var4.field2749 << 1;
            if (arg0.field2776 < var6) {
                var5 = arg0.field2776 * var5 / var6;
            }
            int var7 = (this.field2731[arg0.field2760] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2774 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2777.field1128 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1077 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("fz.al(Lfu;B)I")
    public int method3026(class165 arg0) {
        class163 var2 = arg0.field2763;
        int var3 = this.field2718[arg0.field2760] * this.field2716[arg0.field2760] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2766 * var4 + 16384 >> 15;
        int var6 = this.field2715 * var5 + 128 >> 8;
        if (var2.field2745 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2761 * 1.953125E-5D * (double) var2.field2745) + 0.5D);
        }
        if (var2.field2751 != null) {
            int var7 = arg0.field2772;
            int var8 = var2.field2751[arg0.field2773 + 1];
            if (arg0.field2773 < var2.field2751.length - 2) {
                int var9 = (var2.field2751[arg0.field2773] & 0xFF) << 8;
                int var10 = (var2.field2751[arg0.field2773 + 2] & 0xFF) << 8;
                var8 += (var2.field2751[arg0.field2773 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2780 > 0 && var2.field2742 != null) {
            int var11 = arg0.field2780;
            int var12 = var2.field2742[arg0.field2775 + 1];
            if (arg0.field2775 < var2.field2742.length - 2) {
                int var13 = (var2.field2742[arg0.field2775] & 0xFF) << 8;
                int var14 = (var2.field2742[arg0.field2775 + 2] & 0xFF) << 8;
                var12 += (var2.field2742[arg0.field2775 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("fz.ae(Lfu;B)I")
    public int method3027(class165 arg0) {
        int var2 = this.field2717[arg0.field2760];
        return var2 < 8192 ? arg0.field2767 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2767) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("fz.b()Lbl;")
    public synchronized class60 method962() {
        return this.field2739;
    }

    @ObfuscatedName("fz.q()Lbl;")
    public synchronized class60 method932() {
        return null;
    }

    @ObfuscatedName("fz.l()I")
    public synchronized int method933() {
        return 0;
    }

    @ObfuscatedName("fz.m([III)V")
    public synchronized void method934(int[] arg0, int arg1, int arg2) {
        if (this.field2733.method2950()) {
            int var4 = this.field2720 * this.field2733.field2695 / Statics.field1077;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2737;
                if (this.field2738 - var5 >= 0L) {
                    this.field2737 = var5;
                    break;
                }
                int var7 = (int) ((this.field2738 - this.field2737 + (long) var4 - 1L) / (long) var4);
                this.field2737 += (long) var4 * (long) var7;
                this.field2739.method934(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3029();
            } while (this.field2733.method2950());
        }
        this.field2739.method934(arg0, arg1, arg2);
    }

    @ObfuscatedName("fz.s(I)V")
    public synchronized void method936(int arg0) {
        if (this.field2733.method2950()) {
            int var2 = this.field2720 * this.field2733.field2695 / Statics.field1077;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2737;
                if (this.field2738 - var3 >= 0L) {
                    this.field2737 = var3;
                    break;
                }
                int var5 = (int) ((this.field2738 - this.field2737 + (long) var2 - 1L) / (long) var2);
                this.field2737 += (long) var2 * (long) var5;
                this.field2739.method936(var5);
                arg0 -= var5;
                this.method3029();
            } while (this.field2733.method2950());
        }
        this.field2739.method936(arg0);
    }

    @ObfuscatedName("fz.as(B)V")
    public void method3029() {
        int var1 = this.field2736;
        int var2 = this.field2713;
        long var3 = this.field2738;
        while (this.field2713 == var2) {
            while (this.field2733.field2693[var1] == var2) {
                this.field2733.method2952(var1);
                int var5 = this.field2733.method2968(var1);
                if (var5 == 1) {
                    this.field2733.method2980();
                    this.field2733.method2990(var1);
                    if (this.field2733.method2960()) {
                        if (!this.field2734 || var2 == 0) {
                            this.method3065();
                            this.field2733.method2949();
                            return;
                        }
                        this.field2733.method2961(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3023(var5);
                }
                this.field2733.method2947(var1);
                this.field2733.method2990(var1);
            }
            var1 = this.field2733.method2959();
            var2 = this.field2733.field2693[var1];
            var3 = this.field2733.method2975(var2);
        }
        this.field2736 = var1;
        this.field2713 = var2;
        this.field2738 = var3;
    }

    @ObfuscatedName("fz.ax(Lfu;B)Z")
    public boolean method3030(class165 arg0) {
        if (arg0.field2762 != null) {
            return false;
        }
        if (arg0.field2780 >= 0) {
            arg0.method3273();
            if (arg0.field2764 > 0 && this.field2732[arg0.field2760][arg0.field2764] == arg0) {
                this.field2732[arg0.field2760][arg0.field2764] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("fz.aa(Lfu;[IIII)Z")
    public boolean method3031(class165 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2771 = Statics.field1077 / 100;
        if (arg0.field2780 >= 0 && arg0.field2762 == null || arg0.field2762.method1177()) {
            arg0.method3118();
            arg0.method3273();
            if (arg0.field2764 > 0 && this.field2732[arg0.field2760][arg0.field2764] == arg0) {
                this.field2732[arg0.field2760][arg0.field2764] = null;
            }
            return true;
        }
        int var5 = arg0.field2770;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2723[arg0.field2760] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2770 = var6;
        }
        arg0.field2762.method1103(this.method3025(arg0));
        class163 var7 = arg0.field2763;
        boolean var8 = false;
        arg0.field2776++;
        arg0.field2774 += var7.field2748;
        double var9 = (double) ((arg0.field2765 - 60 << 8) + (arg0.field2770 * arg0.field2769 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2745 > 0) {
            if (var7.field2744 > 0) {
                arg0.field2761 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2744 * var9) + 0.5D);
            } else {
                arg0.field2761 += 128;
            }
        }
        if (var7.field2751 != null) {
            if (var7.field2746 > 0) {
                arg0.field2772 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2746 * var9) + 0.5D);
            } else {
                arg0.field2772 += 128;
            }
            while (arg0.field2773 < var7.field2751.length - 2 && arg0.field2772 > (var7.field2751[arg0.field2773 + 2] & 0xFF) << 8) {
                arg0.field2773 += 2;
            }
            if (arg0.field2773 == var7.field2751.length - 2 && var7.field2751[arg0.field2773 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2780 >= 0 && var7.field2742 != null && (this.field2725[arg0.field2760] & 0x1) == 0 && (arg0.field2764 < 0 || this.field2732[arg0.field2760][arg0.field2764] != arg0)) {
            if (var7.field2741 > 0) {
                arg0.field2780 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2741 * var9) + 0.5D);
            } else {
                arg0.field2780 += 128;
            }
            while (arg0.field2775 < var7.field2742.length - 2 && arg0.field2780 > (var7.field2742[arg0.field2775 + 2] & 0xFF) << 8) {
                arg0.field2775 += 2;
            }
            if (arg0.field2775 == var7.field2742.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2762.method1140(arg0.field2771, this.method3026(arg0), this.method3027(arg0));
            return false;
        }
        arg0.field2762.method1219(arg0.field2771);
        if (arg1 == null) {
            arg0.field2762.method936(arg3);
        } else {
            arg0.field2762.method934(arg1, arg2, arg3);
        }
        if (arg0.field2762.method1106()) {
            this.field2739.field2755.method947(arg0.field2762);
        }
        arg0.method3118();
        if (arg0.field2780 >= 0) {
            arg0.method3273();
            if (arg0.field2764 > 0 && this.field2732[arg0.field2760][arg0.field2764] == arg0) {
                this.field2732[arg0.field2760][arg0.field2764] = null;
            }
        }
        return true;
    }
}
