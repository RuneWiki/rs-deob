package deob;

@ObfuscatedName("fl")
public class class165 extends class61 {

    @ObfuscatedName("fl.f")
    public class177 field2754 = new class177(128);

    @ObfuscatedName("fl.k")
    public int field2741 = 256;

    @ObfuscatedName("fl.y")
    public int field2742 = 1000000;

    @ObfuscatedName("fl.e")
    public int[] field2749 = new int[16];

    @ObfuscatedName("fl.r")
    public int[] field2744 = new int[16];

    @ObfuscatedName("fl.a")
    public int[] field2745 = new int[16];

    @ObfuscatedName("fl.n")
    public int[] field2764 = new int[16];

    @ObfuscatedName("fl.x")
    public int[] field2743 = new int[16];

    @ObfuscatedName("fl.g")
    public int[] field2746 = new int[16];

    @ObfuscatedName("fl.o")
    public int[] field2756 = new int[16];

    @ObfuscatedName("fl.p")
    public int[] field2750 = new int[16];

    @ObfuscatedName("fl.v")
    public int[] field2751 = new int[16];

    @ObfuscatedName("fl.l")
    public int[] field2752 = new int[16];

    @ObfuscatedName("fl.m")
    public int[] field2748 = new int[16];

    @ObfuscatedName("fl.q")
    public int[] field2765 = new int[16];

    @ObfuscatedName("fl.h")
    public int[] field2753 = new int[16];

    @ObfuscatedName("fl.c")
    public int[] field2755 = new int[16];

    @ObfuscatedName("fl.z")
    public int[] field2757 = new int[16];

    @ObfuscatedName("fl.i")
    public class168[][] field2758 = new class168[16][128];

    @ObfuscatedName("fl.ah")
    public class168[][] field2759 = new class168[16][128];

    @ObfuscatedName("fl.aj")
    public class163 field2747 = new class163();

    @ObfuscatedName("fl.ar")
    public boolean field2761;

    @ObfuscatedName("fl.al")
    public int field2762;

    @ObfuscatedName("fl.aw")
    public int field2763;

    @ObfuscatedName("fl.ao")
    public long field2740;

    @ObfuscatedName("fl.ax")
    public long field2760;

    @ObfuscatedName("fl.au")
    public class167 field2766 = new class167(this);

    public class165() {
        this.method3103();
    }

    @ObfuscatedName("fl.f(II)V")
    public synchronized void method3084(int arg0) {
        this.field2741 = arg0;
    }

    @ObfuscatedName("fl.k(B)I")
    public int method3143() {
        return this.field2741;
    }

    @ObfuscatedName("fl.y(Lfp;Lev;Lbr;IB)Z")
    public synchronized boolean method3086(class161 arg0, class149 arg1, class54 arg2, int arg3) {
        arg0.method3002();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class178 var7 = (class178) arg0.field2700.method3254(); var7 != null; var7 = (class178) arg0.field2700.method3257()) {
            int var8 = (int) var7.field2882;
            class162 var9 = (class162) this.field2754.method3244((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method2768(var8);
                class162 var11;
                if (var10 == null) {
                    var11 = null;
                } else {
                    var11 = new class162(var10);
                }
                var9 = var11;
                if (var11 == null) {
                    var5 = false;
                    continue;
                }
                this.field2754.method3245(var11, (long) var8);
            }
            if (!var9.method3011(arg2, var7.field2862, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3005();
        }
        return var5;
    }

    @ObfuscatedName("fl.e(I)V")
    public synchronized void method3111() {
        for (class162 var1 = (class162) this.field2754.method3254(); var1 != null; var1 = (class162) this.field2754.method3257()) {
            var1.method3010();
        }
    }

    @ObfuscatedName("fl.r(I)V")
    public synchronized void method3088() {
        for (class162 var1 = (class162) this.field2754.method3254(); var1 != null; var1 = (class162) this.field2754.method3257()) {
            var1.method3367();
        }
    }

    @ObfuscatedName("fl.o(Lfp;ZI)V")
    public synchronized void method3149(class161 arg0, boolean arg1) {
        this.method3090();
        this.field2747.method3061(arg0.field2701);
        this.field2761 = arg1;
        this.field2740 = 0L;
        int var3 = this.field2747.method3019();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2747.method3024(var4);
            this.field2747.method3027(var4);
            this.field2747.method3025(var4);
        }
        this.field2762 = this.field2747.method3032();
        this.field2763 = this.field2747.field2719[this.field2762];
        this.field2760 = this.field2747.method3020(this.field2763);
    }

    @ObfuscatedName("fl.v(I)V")
    public synchronized void method3090() {
        this.field2747.method3021();
        this.method3103();
    }

    @ObfuscatedName("fl.w(I)Z")
    public synchronized boolean method3121() {
        return this.field2747.method3022();
    }

    @ObfuscatedName("fl.t(IIB)V")
    public synchronized void method3092(int arg0, int arg1) {
        this.method3148(arg0, arg1);
    }

    @ObfuscatedName("fl.s(IIB)V")
    public void method3148(int arg0, int arg1) {
        this.field2764[arg0] = arg1;
        this.field2746[arg0] = arg1 & 0xFFFFFF80;
        this.method3094(arg0, arg1);
    }

    @ObfuscatedName("fl.b(III)V")
    public void method3094(int arg0, int arg1) {
        if (this.field2743[arg0] != arg1) {
            this.field2743[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2759[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("fl.u(IIII)V")
    public void method3095(int arg0, int arg1, int arg2) {
        this.method3097(arg0, arg1, 64);
        if ((this.field2752[arg0] & 0x2) != 0) {
            for (class168 var4 = (class168) this.field2766.field2781.method3282(); var4 != null; var4 = (class168) this.field2766.field2781.method3279()) {
                if (var4.field2804 == arg0 && var4.field2803 < 0) {
                    this.field2758[arg0][var4.field2789] = null;
                    this.field2758[arg0][arg1] = var4;
                    int var5 = (var4.field2798 * var4.field2793 >> 12) + var4.field2792;
                    var4.field2792 += arg1 - var4.field2789 << 8;
                    var4.field2793 = var5 - var4.field2792;
                    var4.field2798 = 4096;
                    var4.field2789 = arg1;
                    return;
                }
            }
        }
        class162 var6 = (class162) this.field2754.method3244((long) this.field2743[arg0]);
        if (var6 == null) {
            return;
        }
        class57 var7 = var6.field2703[arg1];
        if (var7 == null) {
            return;
        }
        class168 var8 = new class168();
        var8.field2804 = arg0;
        var8.field2785 = var6;
        var8.field2786 = var7;
        var8.field2801 = var6.field2707[arg1];
        var8.field2788 = var6.field2709[arg1];
        var8.field2789 = arg1;
        var8.field2790 = var6.field2705 * arg2 * arg2 * var6.field2710[arg1] + 1024 >> 11;
        var8.field2791 = var6.field2706[arg1] & 0xFF;
        var8.field2792 = (arg1 << 8) - (var6.field2708[arg1] & 0x7FFF);
        var8.field2795 = 0;
        var8.field2796 = 0;
        var8.field2797 = 0;
        var8.field2803 = -1;
        var8.field2799 = 0;
        if (this.field2753[arg0] == 0) {
            var8.field2787 = class59.method1180(var7, this.method3108(var8), this.method3109(var8), this.method3110(var8));
        } else {
            var8.field2787 = class59.method1180(var7, this.method3108(var8), 0, this.method3110(var8));
            this.method3096(var8, var6.field2708[arg1] < 0);
        }
        if (var6.field2708[arg1] < 0) {
            var8.field2787.method1174(-1);
        }
        if (var8.field2788 >= 0) {
            class168 var9 = this.field2759[arg0][var8.field2788];
            if (var9 != null && var9.field2803 < 0) {
                this.field2758[arg0][var9.field2789] = null;
                var9.field2803 = 0;
            }
            this.field2759[arg0][var8.field2788] = var8;
        }
        this.field2766.field2781.method3276(var8);
        this.field2758[arg0][arg1] = var8;
    }

    @ObfuscatedName("fl.j(Lfs;ZI)V")
    public void method3096(class168 arg0, boolean arg1) {
        int var3 = arg0.field2786.field1147.length;
        int var5;
        if (arg1 && arg0.field2786.field1150) {
            int var4 = var3 + var3 - arg0.field2786.field1148;
            var5 = (int) ((long) this.field2753[arg0.field2804] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2787.method1139(true);
            }
        } else {
            var5 = (int) ((long) this.field2753[arg0.field2804] * (long) var3 >> 6);
        }
        arg0.field2787.method1150(var5);
    }

    @ObfuscatedName("fl.d(IIIB)V")
    public void method3097(int arg0, int arg1, int arg2) {
        class168 var4 = this.field2758[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2758[arg0][arg1] = null;
        if ((this.field2752[arg0] & 0x2) == 0) {
            var4.field2803 = 0;
            return;
        }
        for (class168 var5 = (class168) this.field2766.field2781.method3285(); var5 != null; var5 = (class168) this.field2766.field2781.method3286()) {
            if (var4.field2804 == var5.field2804 && var5.field2803 < 0 && var4 != var5) {
                var4.field2803 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("fl.l(IIII)V")
    public void method3104(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("fl.al(III)V")
    public void method3099(int arg0, int arg1) {
    }

    @ObfuscatedName("fl.aw(III)V")
    public void method3091(int arg0, int arg1) {
        this.field2756[arg0] = arg1;
    }

    @ObfuscatedName("fl.ao(IB)V")
    public void method3153(int arg0) {
        for (class168 var2 = (class168) this.field2766.field2781.method3285(); var2 != null; var2 = (class168) this.field2766.field2781.method3286()) {
            if (arg0 < 0 || var2.field2804 == arg0) {
                if (var2.field2787 != null) {
                    var2.field2787.method1224(Statics.field1105 / 100);
                    if (var2.field2787.method1147()) {
                        this.field2766.field2780.method995(var2.field2787);
                    }
                    var2.method3199();
                }
                if (var2.field2803 < 0) {
                    this.field2758[var2.field2804][var2.field2789] = null;
                }
                var2.method3367();
            }
        }
    }

    @ObfuscatedName("fl.ax(IS)V")
    public void method3101(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3101(var2);
            }
            return;
        }
        this.field2749[arg0] = 12800;
        this.field2744[arg0] = 8192;
        this.field2745[arg0] = 16383;
        this.field2756[arg0] = 8192;
        this.field2750[arg0] = 0;
        this.field2751[arg0] = 8192;
        this.method3118(arg0);
        this.method3105(arg0);
        this.field2752[arg0] = 0;
        this.field2748[arg0] = 32767;
        this.field2765[arg0] = 256;
        this.field2753[arg0] = 0;
        this.method3147(arg0, 8192);
    }

    @ObfuscatedName("fl.ak(II)V")
    public void method3102(int arg0) {
        for (class168 var2 = (class168) this.field2766.field2781.method3285(); var2 != null; var2 = (class168) this.field2766.field2781.method3286()) {
            if ((arg0 < 0 || var2.field2804 == arg0) && var2.field2803 < 0) {
                this.field2758[var2.field2804][var2.field2789] = null;
                var2.field2803 = 0;
            }
        }
    }

    @ObfuscatedName("fl.ay(I)V")
    public void method3103() {
        this.method3153(-1);
        this.method3101(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2743[var1] = this.field2764[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2746[var2] = this.field2764[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("fl.ap(IB)V")
    public void method3118(int arg0) {
        if ((this.field2752[arg0] & 0x2) == 0) {
            return;
        }
        for (class168 var2 = (class168) this.field2766.field2781.method3285(); var2 != null; var2 = (class168) this.field2766.field2781.method3286()) {
            if (var2.field2804 == arg0 && this.field2758[arg0][var2.field2789] == null && var2.field2803 < 0) {
                var2.field2803 = 0;
            }
        }
    }

    @ObfuscatedName("fl.an(II)V")
    public void method3105(int arg0) {
        if ((this.field2752[arg0] & 0x4) == 0) {
            return;
        }
        for (class168 var2 = (class168) this.field2766.field2781.method3285(); var2 != null; var2 = (class168) this.field2766.field2781.method3286()) {
            if (var2.field2804 == arg0) {
                var2.field2784 = 0;
            }
        }
    }

    @ObfuscatedName("fl.ad(IB)V")
    public void method3117(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3097(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3095(var6, var7, var8);
            } else {
                this.method3097(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3104(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2746[var12] = (var14 << 14) + (this.field2746[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2746[var12] = (var14 << 7) + (this.field2746[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2750[var12] = (var14 << 7) + (this.field2750[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2750[var12] = (this.field2750[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2751[var12] = (var14 << 7) + (this.field2751[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2751[var12] = (this.field2751[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2749[var12] = (var14 << 7) + (this.field2749[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2749[var12] = (this.field2749[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2744[var12] = (var14 << 7) + (this.field2744[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2744[var12] = (this.field2744[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2745[var12] = (var14 << 7) + (this.field2745[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2745[var12] = (this.field2745[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2752[var12] |= 0x1;
                } else {
                    this.field2752[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2752[var12] |= 0x2;
                } else {
                    this.method3118(var12);
                    this.field2752[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2748[var12] = (var14 << 7) + (this.field2748[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2748[var12] = (this.field2748[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2748[var12] = (var14 << 7) + (this.field2748[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2748[var12] = (this.field2748[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3153(var12);
            }
            if (var13 == 121) {
                this.method3101(var12);
            }
            if (var13 == 123) {
                this.method3102(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2748[var12];
                if (var15 == 16384) {
                    this.field2765[var12] = (var14 << 7) + (this.field2765[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2748[var12];
                if (var16 == 16384) {
                    this.field2765[var12] = (this.field2765[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2753[var12] = (var14 << 7) + (this.field2753[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2753[var12] = (this.field2753[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2752[var12] |= 0x4;
                } else {
                    this.method3105(var12);
                    this.field2752[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3147(var12, (var14 << 7) + (this.field2755[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3147(var12, (this.field2755[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3094(var17, this.field2746[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3099(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method3091(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3103();
            }
        }
    }

    @ObfuscatedName("fl.ag(IIB)V")
    public void method3147(int arg0, int arg1) {
        this.field2755[arg0] = arg1;
        this.field2757[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("fl.am(Lfs;I)I")
    public int method3108(class168 arg0) {
        int var2 = (arg0.field2798 * arg0.field2793 >> 12) + arg0.field2792;
        int var3 = ((this.field2756[arg0.field2804] - 8192) * this.field2765[arg0.field2804] >> 12) + var2;
        class166 var4 = arg0.field2801;
        if (var4.field2779 > 0 && (var4.field2775 > 0 || this.field2750[arg0.field2804] > 0)) {
            int var5 = var4.field2775 << 2;
            int var6 = var4.field2777 << 1;
            if (arg0.field2800 < var6) {
                var5 = arg0.field2800 * var5 / var6;
            }
            int var7 = (this.field2750[arg0.field2804] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2806 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2786.field1146 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1105 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("fl.ai(Lfs;I)I")
    public int method3109(class168 arg0) {
        class166 var2 = arg0.field2801;
        int var3 = this.field2745[arg0.field2804] * this.field2749[arg0.field2804] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2790 * var4 + 16384 >> 15;
        int var6 = this.field2741 * var5 + 128 >> 8;
        if (var2.field2772 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2795 * 1.953125E-5D * (double) var2.field2772) + 0.5D);
        }
        if (var2.field2771 != null) {
            int var7 = arg0.field2796;
            int var8 = var2.field2771[arg0.field2797 + 1];
            if (arg0.field2797 < var2.field2771.length - 2) {
                int var9 = (var2.field2771[arg0.field2797] & 0xFF) << 8;
                int var10 = (var2.field2771[arg0.field2797 + 2] & 0xFF) << 8;
                var8 += (var2.field2771[arg0.field2797 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2803 > 0 && var2.field2770 != null) {
            int var11 = arg0.field2803;
            int var12 = var2.field2770[arg0.field2799 + 1];
            if (arg0.field2799 < var2.field2770.length - 2) {
                int var13 = (var2.field2770[arg0.field2799] & 0xFF) << 8;
                int var14 = (var2.field2770[arg0.field2799 + 2] & 0xFF) << 8;
                var12 += (var2.field2770[arg0.field2799 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("fl.ab(Lfs;B)I")
    public int method3110(class168 arg0) {
        int var2 = this.field2744[arg0.field2804];
        return var2 < 8192 ? arg0.field2791 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2791) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("fl.a()Lbh;")
    public synchronized class61 method1000() {
        return this.field2766;
    }

    @ObfuscatedName("fl.n()Lbh;")
    public synchronized class61 method1001() {
        return null;
    }

    @ObfuscatedName("fl.x()I")
    public synchronized int method1009() {
        return 0;
    }

    @ObfuscatedName("fl.g([III)V")
    public synchronized void method994(int[] arg0, int arg1, int arg2) {
        if (this.field2747.method3022()) {
            int var4 = this.field2742 * this.field2747.field2718 / Statics.field1105;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2740;
                if (this.field2760 - var5 >= 0L) {
                    this.field2740 = var5;
                    break;
                }
                int var7 = (int) ((this.field2760 - this.field2740 + (long) var4 - 1L) / (long) var4);
                this.field2740 += (long) var4 * (long) var7;
                this.field2766.method994(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3112();
            } while (this.field2747.method3022());
        }
        this.field2766.method994(arg0, arg1, arg2);
    }

    @ObfuscatedName("fl.p(I)V")
    public synchronized void method1004(int arg0) {
        if (this.field2747.method3022()) {
            int var2 = this.field2742 * this.field2747.field2718 / Statics.field1105;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2740;
                if (this.field2760 - var3 >= 0L) {
                    this.field2740 = var3;
                    break;
                }
                int var5 = (int) ((this.field2760 - this.field2740 + (long) var2 - 1L) / (long) var2);
                this.field2740 += (long) var2 * (long) var5;
                this.field2766.method1004(var5);
                arg0 -= var5;
                this.method3112();
            } while (this.field2747.method3022());
        }
        this.field2766.method1004(arg0);
    }

    @ObfuscatedName("fl.af(B)V")
    public void method3112() {
        int var1 = this.field2762;
        int var2 = this.field2763;
        long var3 = this.field2760;
        while (this.field2763 == var2) {
            while (this.field2747.field2719[var1] == var2) {
                this.field2747.method3024(var1);
                int var5 = this.field2747.method3037(var1);
                if (var5 == 1) {
                    this.field2747.method3026();
                    this.field2747.method3025(var1);
                    if (this.field2747.method3035()) {
                        if (!this.field2761 || var2 == 0) {
                            this.method3103();
                            this.field2747.method3021();
                            return;
                        }
                        this.field2747.method3034(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3117(var5);
                }
                this.field2747.method3027(var1);
                this.field2747.method3025(var1);
            }
            var1 = this.field2747.method3032();
            var2 = this.field2747.field2719[var1];
            var3 = this.field2747.method3020(var2);
        }
        this.field2762 = var1;
        this.field2763 = var2;
        this.field2760 = var3;
    }

    @ObfuscatedName("fl.ac(Lfs;I)Z")
    public boolean method3113(class168 arg0) {
        if (arg0.field2787 != null) {
            return false;
        }
        if (arg0.field2803 >= 0) {
            arg0.method3367();
            if (arg0.field2788 > 0 && this.field2759[arg0.field2804][arg0.field2788] == arg0) {
                this.field2759[arg0.field2804][arg0.field2788] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("fl.aq(Lfs;[IIII)Z")
    public boolean method3114(class168 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2794 = Statics.field1105 / 100;
        if (arg0.field2803 >= 0 && arg0.field2787 == null || arg0.field2787.method1270()) {
            arg0.method3199();
            arg0.method3367();
            if (arg0.field2788 > 0 && this.field2759[arg0.field2804][arg0.field2788] == arg0) {
                this.field2759[arg0.field2804][arg0.field2788] = null;
            }
            return true;
        }
        int var5 = arg0.field2798;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2751[arg0.field2804] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2798 = var6;
        }
        arg0.field2787.method1213(this.method3108(arg0));
        class166 var7 = arg0.field2801;
        boolean var8 = false;
        arg0.field2800++;
        arg0.field2806 += var7.field2779;
        double var9 = (double) ((arg0.field2789 - 60 << 8) + (arg0.field2798 * arg0.field2793 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2772 > 0) {
            if (var7.field2774 > 0) {
                arg0.field2795 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2774 * var9) + 0.5D);
            } else {
                arg0.field2795 += 128;
            }
        }
        if (var7.field2771 != null) {
            if (var7.field2776 > 0) {
                arg0.field2796 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2776 * var9) + 0.5D);
            } else {
                arg0.field2796 += 128;
            }
            while (arg0.field2797 < var7.field2771.length - 2 && arg0.field2796 > (var7.field2771[arg0.field2797 + 2] & 0xFF) << 8) {
                arg0.field2797 += 2;
            }
            if (arg0.field2797 == var7.field2771.length - 2 && var7.field2771[arg0.field2797 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2803 >= 0 && var7.field2770 != null && (this.field2752[arg0.field2804] & 0x1) == 0 && (arg0.field2788 < 0 || this.field2759[arg0.field2804][arg0.field2788] != arg0)) {
            if (var7.field2773 > 0) {
                arg0.field2803 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2773 * var9) + 0.5D);
            } else {
                arg0.field2803 += 128;
            }
            while (arg0.field2799 < var7.field2770.length - 2 && arg0.field2803 > (var7.field2770[arg0.field2799 + 2] & 0xFF) << 8) {
                arg0.field2799 += 2;
            }
            if (arg0.field2799 == var7.field2770.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2787.method1227(arg0.field2794, this.method3109(arg0), this.method3110(arg0));
            return false;
        }
        arg0.field2787.method1224(arg0.field2794);
        if (arg1 == null) {
            arg0.field2787.method1004(arg3);
        } else {
            arg0.field2787.method994(arg1, arg2, arg3);
        }
        if (arg0.field2787.method1147()) {
            this.field2766.field2780.method995(arg0.field2787);
        }
        arg0.method3199();
        if (arg0.field2803 >= 0) {
            arg0.method3367();
            if (arg0.field2788 > 0 && this.field2759[arg0.field2804][arg0.field2788] == arg0) {
                this.field2759[arg0.field2804][arg0.field2788] = null;
            }
        }
        return true;
    }
}
