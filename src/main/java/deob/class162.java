package deob;

@ObfuscatedName("fa")
public class class162 extends class60 {

    @ObfuscatedName("fa.z")
    public class174 field2707 = new class174(128);

    @ObfuscatedName("fa.j")
    public int field2708 = 256;

    @ObfuscatedName("fa.a")
    public int field2724 = 1000000;

    @ObfuscatedName("fa.y")
    public int[] field2712 = new int[16];

    @ObfuscatedName("fa.i")
    public int[] field2711 = new int[16];

    @ObfuscatedName("fa.b")
    public int[] field2717 = new int[16];

    @ObfuscatedName("fa.s")
    public int[] field2713 = new int[16];

    @ObfuscatedName("fa.q")
    public int[] field2714 = new int[16];

    @ObfuscatedName("fa.p")
    public int[] field2715 = new int[16];

    @ObfuscatedName("fa.h")
    public int[] field2723 = new int[16];

    @ObfuscatedName("fa.r")
    public int[] field2710 = new int[16];

    @ObfuscatedName("fa.o")
    public int[] field2718 = new int[16];

    @ObfuscatedName("fa.k")
    public int[] field2720 = new int[16];

    @ObfuscatedName("fa.e")
    public int[] field2721 = new int[16];

    @ObfuscatedName("fa.v")
    public int[] field2722 = new int[16];

    @ObfuscatedName("fa.n")
    public int[] field2709 = new int[16];

    @ObfuscatedName("fa.d")
    public int[] field2716 = new int[16];

    @ObfuscatedName("fa.m")
    public int[] field2725 = new int[16];

    @ObfuscatedName("fa.g")
    public class165[][] field2726 = new class165[16][128];

    @ObfuscatedName("fa.aq")
    public class165[][] field2727 = new class165[16][128];

    @ObfuscatedName("fa.ao")
    public class160 field2728 = new class160();

    @ObfuscatedName("fa.af")
    public boolean field2729;

    @ObfuscatedName("fa.ag")
    public int field2730;

    @ObfuscatedName("fa.ad")
    public int field2731;

    @ObfuscatedName("fa.ak")
    public long field2732;

    @ObfuscatedName("fa.aj")
    public long field2733;

    @ObfuscatedName("fa.as")
    public class164 field2734 = new class164(this);

    public class162() {
        this.method3125();
    }

    @ObfuscatedName("fa.z(II)V")
    public synchronized void method3036(int arg0) {
        this.field2708 = arg0;
    }

    @ObfuscatedName("fa.j(B)I")
    public int method3140() {
        return this.field2708;
    }

    @ObfuscatedName("fa.a(Lfu;Ler;Lbp;II)Z")
    public synchronized boolean method3038(class158 arg0, class146 arg1, class53 arg2, int arg3) {
        arg0.method2949();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class175 var7 = (class175) arg0.field2670.method3197(); var7 != null; var7 = (class175) arg0.field2670.method3200()) {
            int var8 = (int) var7.field2857;
            class159 var9 = (class159) this.field2707.method3204((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method2710(var8);
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
                this.field2707.method3205(var11, (long) var8);
            }
            if (!var9.method2956(arg2, var7.field2839, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method2950();
        }
        return var5;
    }

    @ObfuscatedName("fa.y(I)V")
    public synchronized void method3096() {
        for (class159 var1 = (class159) this.field2707.method3197(); var1 != null; var1 = (class159) this.field2707.method3200()) {
            var1.method2957();
        }
    }

    @ObfuscatedName("fa.i(I)V")
    public synchronized void method3051() {
        for (class159 var1 = (class159) this.field2707.method3197(); var1 != null; var1 = (class159) this.field2707.method3200()) {
            var1.method3311();
        }
    }

    @ObfuscatedName("fa.h(Lfu;ZB)V")
    public synchronized void method3040(class158 arg0, boolean arg1) {
        this.method3041();
        this.field2728.method2970(arg0.field2671);
        this.field2729 = arg1;
        this.field2732 = 0L;
        int var3 = this.field2728.method2967();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2728.method2968(var4);
            this.field2728.method3003(var4);
            this.field2728.method2980(var4);
        }
        this.field2730 = this.field2728.method2976();
        this.field2731 = this.field2728.field2687[this.field2730];
        this.field2733 = this.field2728.method2975(this.field2731);
    }

    @ObfuscatedName("fa.o(I)V")
    public synchronized void method3041() {
        this.field2728.method2965();
        this.method3125();
    }

    @ObfuscatedName("fa.f(B)Z")
    public synchronized boolean method3042() {
        return this.field2728.method2966();
    }

    @ObfuscatedName("fa.u(III)V")
    public synchronized void method3043(int arg0, int arg1) {
        this.method3044(arg0, arg1);
    }

    @ObfuscatedName("fa.c(IIB)V")
    public void method3044(int arg0, int arg1) {
        this.field2713[arg0] = arg1;
        this.field2715[arg0] = arg1 & 0xFFFFFF80;
        this.method3045(arg0, arg1);
    }

    @ObfuscatedName("fa.l(IIB)V")
    public void method3045(int arg0, int arg1) {
        if (this.field2714[arg0] != arg1) {
            this.field2714[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2727[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("fa.w(IIII)V")
    public void method3046(int arg0, int arg1, int arg2) {
        this.method3054(arg0, arg1, 64);
        if ((this.field2720[arg0] & 0x2) != 0) {
            for (class165 var4 = (class165) this.field2734.field2749.method3233(); var4 != null; var4 = (class165) this.field2734.field2749.method3254()) {
                if (var4.field2762 == arg0 && var4.field2768 < 0) {
                    this.field2726[arg0][var4.field2758] = null;
                    this.field2726[arg0][arg1] = var4;
                    int var5 = (var4.field2772 * var4.field2763 >> 12) + var4.field2761;
                    var4.field2761 += arg1 - var4.field2758 << 8;
                    var4.field2772 = var5 - var4.field2761;
                    var4.field2763 = 4096;
                    var4.field2758 = arg1;
                    return;
                }
            }
        }
        class159 var6 = (class159) this.field2707.method3204((long) this.field2714[arg0]);
        if (var6 == null) {
            return;
        }
        class56 var7 = var6.field2673[arg1];
        if (var7 == null) {
            return;
        }
        class165 var8 = new class165();
        var8.field2762 = arg0;
        var8.field2764 = var6;
        var8.field2755 = var7;
        var8.field2771 = var6.field2677[arg1];
        var8.field2757 = var6.field2672[arg1];
        var8.field2758 = arg1;
        var8.field2774 = var6.field2674 * arg2 * arg2 * var6.field2675[arg1] + 1024 >> 11;
        var8.field2760 = var6.field2678[arg1] & 0xFF;
        var8.field2761 = (arg1 << 8) - (var6.field2681[arg1] & 0x7FFF);
        var8.field2756 = 0;
        var8.field2765 = 0;
        var8.field2766 = 0;
        var8.field2768 = -1;
        var8.field2759 = 0;
        if (this.field2709[arg0] == 0) {
            var8.field2754 = class58.method1071(var7, this.method3059(var8), this.method3070(var8), this.method3060(var8));
        } else {
            var8.field2754 = class58.method1071(var7, this.method3059(var8), 0, this.method3060(var8));
            this.method3047(var8, var6.field2681[arg1] < 0);
        }
        if (var6.field2681[arg1] < 0) {
            var8.field2754.method1073(-1);
        }
        if (var8.field2757 >= 0) {
            class165 var9 = this.field2727[arg0][var8.field2757];
            if (var9 != null && var9.field2768 < 0) {
                this.field2726[arg0][var9.field2758] = null;
                var9.field2768 = 0;
            }
            this.field2727[arg0][var8.field2757] = var8;
        }
        this.field2734.field2749.method3227(var8);
        this.field2726[arg0][arg1] = var8;
    }

    @ObfuscatedName("fa.x(Lfo;ZB)V")
    public void method3047(class165 arg0, boolean arg1) {
        int var3 = arg0.field2755.field1100.length;
        int var5;
        if (arg1 && arg0.field2755.field1099) {
            int var4 = var3 + var3 - arg0.field2755.field1101;
            var5 = (int) ((long) this.field2709[arg0.field2762] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2754.method1080(true);
            }
        } else {
            var5 = (int) ((long) this.field2709[arg0.field2762] * (long) var3 >> 6);
        }
        arg0.field2754.method1070(var5);
    }

    @ObfuscatedName("fa.t(IIII)V")
    public void method3054(int arg0, int arg1, int arg2) {
        class165 var4 = this.field2726[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2726[arg0][arg1] = null;
        if ((this.field2720[arg0] & 0x2) == 0) {
            var4.field2768 = 0;
            return;
        }
        for (class165 var5 = (class165) this.field2734.field2749.method3232(); var5 != null; var5 = (class165) this.field2734.field2749.method3251()) {
            if (var4.field2762 == var5.field2762 && var5.field2768 < 0 && var4 != var5) {
                var4.field2768 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("fa.k(IIII)V")
    public void method3053(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("fa.ao(III)V")
    public void method3049(int arg0, int arg1) {
    }

    @ObfuscatedName("fa.af(III)V")
    public void method3050(int arg0, int arg1) {
        this.field2723[arg0] = arg1;
    }

    @ObfuscatedName("fa.ag(II)V")
    public void method3100(int arg0) {
        for (class165 var2 = (class165) this.field2734.field2749.method3232(); var2 != null; var2 = (class165) this.field2734.field2749.method3251()) {
            if (arg0 < 0 || var2.field2762 == arg0) {
                if (var2.field2754 != null) {
                    var2.field2754.method1084(Statics.field1044 / 100);
                    if (var2.field2754.method1088()) {
                        this.field2734.field2750.method936(var2.field2754);
                    }
                    var2.method3152();
                }
                if (var2.field2768 < 0) {
                    this.field2726[var2.field2762][var2.field2758] = null;
                }
                var2.method3311();
            }
        }
    }

    @ObfuscatedName("fa.aj(II)V")
    public void method3104(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3104(var2);
            }
            return;
        }
        this.field2712[arg0] = 12800;
        this.field2711[arg0] = 8192;
        this.field2717[arg0] = 16383;
        this.field2723[arg0] = 8192;
        this.field2710[arg0] = 0;
        this.field2718[arg0] = 8192;
        this.method3048(arg0);
        this.method3056(arg0);
        this.field2720[arg0] = 0;
        this.field2721[arg0] = 32767;
        this.field2722[arg0] = 256;
        this.field2709[arg0] = 0;
        this.method3058(arg0, 8192);
    }

    @ObfuscatedName("fa.al(II)V")
    public void method3095(int arg0) {
        for (class165 var2 = (class165) this.field2734.field2749.method3232(); var2 != null; var2 = (class165) this.field2734.field2749.method3251()) {
            if ((arg0 < 0 || var2.field2762 == arg0) && var2.field2768 < 0) {
                this.field2726[var2.field2762][var2.field2758] = null;
                var2.field2768 = 0;
            }
        }
    }

    @ObfuscatedName("fa.ai(I)V")
    public void method3125() {
        this.method3100(-1);
        this.method3104(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2714[var1] = this.field2713[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2715[var2] = this.field2713[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("fa.az(IB)V")
    public void method3048(int arg0) {
        if ((this.field2720[arg0] & 0x2) == 0) {
            return;
        }
        for (class165 var2 = (class165) this.field2734.field2749.method3232(); var2 != null; var2 = (class165) this.field2734.field2749.method3251()) {
            if (var2.field2762 == arg0 && this.field2726[arg0][var2.field2758] == null && var2.field2768 < 0) {
                var2.field2768 = 0;
            }
        }
    }

    @ObfuscatedName("fa.aw(II)V")
    public void method3056(int arg0) {
        if ((this.field2720[arg0] & 0x4) == 0) {
            return;
        }
        for (class165 var2 = (class165) this.field2734.field2749.method3232(); var2 != null; var2 = (class165) this.field2734.field2749.method3251()) {
            if (var2.field2762 == arg0) {
                var2.field2767 = 0;
            }
        }
    }

    @ObfuscatedName("fa.ay(IB)V")
    public void method3141(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3054(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3046(var6, var7, var8);
            } else {
                this.method3054(var6, var7, 64);
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
                this.field2715[var12] = (var14 << 14) + (this.field2715[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2715[var12] = (var14 << 7) + (this.field2715[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2710[var12] = (var14 << 7) + (this.field2710[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2710[var12] = (this.field2710[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2718[var12] = (var14 << 7) + (this.field2718[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2718[var12] = (this.field2718[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2712[var12] = (var14 << 7) + (this.field2712[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2712[var12] = (this.field2712[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2711[var12] = (var14 << 7) + (this.field2711[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2711[var12] = (this.field2711[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2717[var12] = (var14 << 7) + (this.field2717[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2717[var12] = (this.field2717[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2720[var12] |= 0x1;
                } else {
                    this.field2720[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2720[var12] |= 0x2;
                } else {
                    this.method3048(var12);
                    this.field2720[var12] &= 0xFFFFFFFD;
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
                this.method3100(var12);
            }
            if (var13 == 121) {
                this.method3104(var12);
            }
            if (var13 == 123) {
                this.method3095(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2721[var12];
                if (var15 == 16384) {
                    this.field2722[var12] = (var14 << 7) + (this.field2722[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2721[var12];
                if (var16 == 16384) {
                    this.field2722[var12] = (this.field2722[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2709[var12] = (var14 << 7) + (this.field2709[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2709[var12] = (this.field2709[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2720[var12] |= 0x4;
                } else {
                    this.method3056(var12);
                    this.field2720[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3058(var12, (var14 << 7) + (this.field2716[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3058(var12, (this.field2716[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3045(var17, this.field2715[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3049(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method3050(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3125();
            }
        }
    }

    @ObfuscatedName("fa.au(III)V")
    public void method3058(int arg0, int arg1) {
        this.field2716[arg0] = arg1;
        this.field2725[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("fa.ar(Lfo;I)I")
    public int method3059(class165 arg0) {
        int var2 = (arg0.field2772 * arg0.field2763 >> 12) + arg0.field2761;
        int var3 = ((this.field2723[arg0.field2762] - 8192) * this.field2722[arg0.field2762] >> 12) + var2;
        class163 var4 = arg0.field2771;
        if (var4.field2746 > 0 && (var4.field2743 > 0 || this.field2710[arg0.field2762] > 0)) {
            int var5 = var4.field2743 << 2;
            int var6 = var4.field2745 << 1;
            if (arg0.field2769 < var6) {
                var5 = arg0.field2769 * var5 / var6;
            }
            int var7 = (this.field2710[arg0.field2762] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2770 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2755.field1103 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1044 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("fa.ap(Lfo;I)I")
    public int method3070(class165 arg0) {
        class163 var2 = arg0.field2771;
        int var3 = this.field2712[arg0.field2762] * this.field2717[arg0.field2762] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2774 * var4 + 16384 >> 15;
        int var6 = this.field2708 * var5 + 128 >> 8;
        if (var2.field2739 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2756 * 1.953125E-5D * (double) var2.field2739) + 0.5D);
        }
        if (var2.field2744 != null) {
            int var7 = arg0.field2765;
            int var8 = var2.field2744[arg0.field2766 + 1];
            if (arg0.field2766 < var2.field2744.length - 2) {
                int var9 = (var2.field2744[arg0.field2766] & 0xFF) << 8;
                int var10 = (var2.field2744[arg0.field2766 + 2] & 0xFF) << 8;
                var8 += (var2.field2744[arg0.field2766 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2768 > 0 && var2.field2738 != null) {
            int var11 = arg0.field2768;
            int var12 = var2.field2738[arg0.field2759 + 1];
            if (arg0.field2759 < var2.field2738.length - 2) {
                int var13 = (var2.field2738[arg0.field2759] & 0xFF) << 8;
                int var14 = (var2.field2738[arg0.field2759 + 2] & 0xFF) << 8;
                var12 += (var2.field2738[arg0.field2759 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("fa.an(Lfo;B)I")
    public int method3060(class165 arg0) {
        int var2 = this.field2711[arg0.field2762];
        return var2 < 8192 ? arg0.field2760 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2760) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("fa.b()Lbq;")
    public synchronized class60 method943() {
        return this.field2734;
    }

    @ObfuscatedName("fa.s()Lbq;")
    public synchronized class60 method941() {
        return null;
    }

    @ObfuscatedName("fa.q()I")
    public synchronized int method942() {
        return 0;
    }

    @ObfuscatedName("fa.p([III)V")
    public synchronized void method946(int[] arg0, int arg1, int arg2) {
        if (this.field2728.method2966()) {
            int var4 = this.field2724 * this.field2728.field2689 / Statics.field1044;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2732;
                if (this.field2733 - var5 >= 0L) {
                    this.field2732 = var5;
                    break;
                }
                int var7 = (int) ((this.field2733 - this.field2732 + (long) var4 - 1L) / (long) var4);
                this.field2732 += (long) var4 * (long) var7;
                this.field2734.method946(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3061();
            } while (this.field2728.method2966());
        }
        this.field2734.method946(arg0, arg1, arg2);
    }

    @ObfuscatedName("fa.r(I)V")
    public synchronized void method945(int arg0) {
        if (this.field2728.method2966()) {
            int var2 = this.field2724 * this.field2728.field2689 / Statics.field1044;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2732;
                if (this.field2733 - var3 >= 0L) {
                    this.field2732 = var3;
                    break;
                }
                int var5 = (int) ((this.field2733 - this.field2732 + (long) var2 - 1L) / (long) var2);
                this.field2732 += (long) var2 * (long) var5;
                this.field2734.method945(var5);
                arg0 -= var5;
                this.method3061();
            } while (this.field2728.method2966());
        }
        this.field2734.method945(arg0);
    }

    @ObfuscatedName("fa.ae(I)V")
    public void method3061() {
        int var1 = this.field2730;
        int var2 = this.field2731;
        long var3 = this.field2733;
        while (this.field2731 == var2) {
            while (this.field2728.field2687[var1] == var2) {
                this.field2728.method2968(var1);
                int var5 = this.field2728.method2972(var1);
                if (var5 == 1) {
                    this.field2728.method2993();
                    this.field2728.method2980(var1);
                    if (this.field2728.method2977()) {
                        if (!this.field2729 || var2 == 0) {
                            this.method3125();
                            this.field2728.method2965();
                            return;
                        }
                        this.field2728.method2978(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3141(var5);
                }
                this.field2728.method3003(var1);
                this.field2728.method2980(var1);
            }
            var1 = this.field2728.method2976();
            var2 = this.field2728.field2687[var1];
            var3 = this.field2728.method2975(var2);
        }
        this.field2730 = var1;
        this.field2731 = var2;
        this.field2733 = var3;
    }

    @ObfuscatedName("fa.aa(Lfo;I)Z")
    public boolean method3062(class165 arg0) {
        if (arg0.field2754 != null) {
            return false;
        }
        if (arg0.field2768 >= 0) {
            arg0.method3311();
            if (arg0.field2757 > 0 && this.field2727[arg0.field2762][arg0.field2757] == arg0) {
                this.field2727[arg0.field2762][arg0.field2757] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("fa.ax(Lfo;[IIII)Z")
    public boolean method3063(class165 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2753 = Statics.field1044 / 100;
        if (arg0.field2768 >= 0 && arg0.field2754 == null || arg0.field2754.method1087()) {
            arg0.method3152();
            arg0.method3311();
            if (arg0.field2757 > 0 && this.field2727[arg0.field2762][arg0.field2757] == arg0) {
                this.field2727[arg0.field2762][arg0.field2757] = null;
            }
            return true;
        }
        int var5 = arg0.field2763;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2718[arg0.field2762] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2763 = var6;
        }
        arg0.field2754.method1085(this.method3059(arg0));
        class163 var7 = arg0.field2771;
        boolean var8 = false;
        arg0.field2769++;
        arg0.field2770 += var7.field2746;
        double var9 = (double) ((arg0.field2758 - 60 << 8) + (arg0.field2772 * arg0.field2763 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2739 > 0) {
            if (var7.field2742 > 0) {
                arg0.field2756 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2742 * var9) + 0.5D);
            } else {
                arg0.field2756 += 128;
            }
        }
        if (var7.field2744 != null) {
            if (var7.field2740 > 0) {
                arg0.field2765 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2740 * var9) + 0.5D);
            } else {
                arg0.field2765 += 128;
            }
            while (arg0.field2766 < var7.field2744.length - 2 && arg0.field2765 > (var7.field2744[arg0.field2766 + 2] & 0xFF) << 8) {
                arg0.field2766 += 2;
            }
            if (arg0.field2766 == var7.field2744.length - 2 && var7.field2744[arg0.field2766 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2768 >= 0 && var7.field2738 != null && (this.field2720[arg0.field2762] & 0x1) == 0 && (arg0.field2757 < 0 || this.field2727[arg0.field2762][arg0.field2757] != arg0)) {
            if (var7.field2741 > 0) {
                arg0.field2768 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2741 * var9) + 0.5D);
            } else {
                arg0.field2768 += 128;
            }
            while (arg0.field2759 < var7.field2738.length - 2 && arg0.field2768 > (var7.field2738[arg0.field2759 + 2] & 0xFF) << 8) {
                arg0.field2759 += 2;
            }
            if (arg0.field2759 == var7.field2738.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2754.method1083(arg0.field2753, this.method3070(arg0), this.method3060(arg0));
            return false;
        }
        arg0.field2754.method1084(arg0.field2753);
        if (arg1 == null) {
            arg0.field2754.method945(arg3);
        } else {
            arg0.field2754.method946(arg1, arg2, arg3);
        }
        if (arg0.field2754.method1088()) {
            this.field2734.field2750.method936(arg0.field2754);
        }
        arg0.method3152();
        if (arg0.field2768 >= 0) {
            arg0.method3311();
            if (arg0.field2757 > 0 && this.field2727[arg0.field2762][arg0.field2757] == arg0) {
                this.field2727[arg0.field2762][arg0.field2757] = null;
            }
        }
        return true;
    }
}
