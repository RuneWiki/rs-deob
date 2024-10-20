package deob;

@ObfuscatedName("fo")
public class class167 extends class61 {

    @ObfuscatedName("fo.p")
    public class179 field2749 = new class179(128);

    @ObfuscatedName("fo.y")
    public int field2764 = 256;

    @ObfuscatedName("fo.d")
    public int field2750 = 1000000;

    @ObfuscatedName("fo.c")
    public int[] field2751 = new int[16];

    @ObfuscatedName("fo.r")
    public int[] field2765 = new int[16];

    @ObfuscatedName("fo.f")
    public int[] field2773 = new int[16];

    @ObfuscatedName("fo.z")
    public int[] field2752 = new int[16];

    @ObfuscatedName("fo.o")
    public int[] field2755 = new int[16];

    @ObfuscatedName("fo.k")
    public int[] field2756 = new int[16];

    @ObfuscatedName("fo.s")
    public int[] field2770 = new int[16];

    @ObfuscatedName("fo.h")
    public int[] field2758 = new int[16];

    @ObfuscatedName("fo.m")
    public int[] field2757 = new int[16];

    @ObfuscatedName("fo.a")
    public int[] field2759 = new int[16];

    @ObfuscatedName("fo.x")
    public int[] field2761 = new int[16];

    @ObfuscatedName("fo.n")
    public int[] field2762 = new int[16];

    @ObfuscatedName("fo.v")
    public int[] field2763 = new int[16];

    @ObfuscatedName("fo.l")
    public int[] field2753 = new int[16];

    @ObfuscatedName("fo.t")
    public int[] field2748 = new int[16];

    @ObfuscatedName("fo.i")
    public class170[][] field2766 = new class170[16][128];

    @ObfuscatedName("fo.aw")
    public class170[][] field2767 = new class170[16][128];

    @ObfuscatedName("fo.ar")
    public class165 field2768 = new class165();

    @ObfuscatedName("fo.af")
    public boolean field2769;

    @ObfuscatedName("fo.am")
    public int field2760;

    @ObfuscatedName("fo.ax")
    public int field2771;

    @ObfuscatedName("fo.av")
    public long field2772;

    @ObfuscatedName("fo.al")
    public long field2754;

    @ObfuscatedName("fo.ab")
    public class169 field2774 = new class169(this);

    public class167() {
        this.method3084();
    }

    @ObfuscatedName("fo.p(II)V")
    public synchronized void method3067(int arg0) {
        this.field2764 = arg0;
    }

    @ObfuscatedName("fo.y(I)I")
    public int method3068() {
        return this.field2764;
    }

    @ObfuscatedName("fo.d(Lfa;Len;Lbi;II)Z")
    public synchronized boolean method3100(class163 arg0, class151 arg1, class54 arg2, int arg3) {
        arg0.method2979();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class180 var7 = (class180) arg0.field2709.method3227(); var7 != null; var7 = (class180) arg0.field2709.method3228()) {
            int var8 = (int) var7.field2903;
            class164 var9 = (class164) this.field2749.method3224((long) var8);
            if (var9 == null) {
                var9 = class164.method2412(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field2749.method3225(var9, (long) var8);
            }
            if (!var9.method2989(arg2, var7.field2881, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method2980();
        }
        return var5;
    }

    @ObfuscatedName("fo.c(B)V")
    public synchronized void method3070() {
        for (class164 var1 = (class164) this.field2749.method3227(); var1 != null; var1 = (class164) this.field2749.method3228()) {
            var1.method2991();
        }
    }

    @ObfuscatedName("fo.r(I)V")
    public synchronized void method3071() {
        for (class164 var1 = (class164) this.field2749.method3227(); var1 != null; var1 = (class164) this.field2749.method3228()) {
            var1.method3358();
        }
    }

    @ObfuscatedName("fo.s(Lfa;ZB)V")
    public synchronized void method3072(class163 arg0, boolean arg1) {
        this.method3085();
        this.field2768.method3006(arg0.field2710);
        this.field2769 = arg1;
        this.field2772 = 0L;
        int var3 = this.field2768.method3021();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2768.method3023(var4);
            this.field2768.method3002(var4);
            this.field2768.method2999(var4);
        }
        this.field2760 = this.field2768.method2997();
        this.field2771 = this.field2768.field2725[this.field2760];
        this.field2754 = this.field2768.method3041(this.field2771);
    }

    @ObfuscatedName("fo.m(I)V")
    public synchronized void method3085() {
        this.field2768.method3007();
        this.method3084();
    }

    @ObfuscatedName("fo.w(B)Z")
    public synchronized boolean method3120() {
        return this.field2768.method2998();
    }

    @ObfuscatedName("fo.q(III)V")
    public synchronized void method3075(int arg0, int arg1) {
        this.method3076(arg0, arg1);
    }

    @ObfuscatedName("fo.u(III)V")
    public void method3076(int arg0, int arg1) {
        this.field2752[arg0] = arg1;
        this.field2756[arg0] = arg1 & 0xFFFFFF80;
        this.method3097(arg0, arg1);
    }

    @ObfuscatedName("fo.e(III)V")
    public void method3097(int arg0, int arg1) {
        if (this.field2755[arg0] != arg1) {
            this.field2755[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2767[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("fo.b(IIII)V")
    public void method3077(int arg0, int arg1, int arg2) {
        this.method3078(arg0, arg1, 64);
        if ((this.field2759[arg0] & 0x2) != 0) {
            for (class170 var4 = (class170) this.field2774.field2785.method3261(); var4 != null; var4 = (class170) this.field2774.field2785.method3276()) {
                if (var4.field2795 == arg0 && var4.field2804 < 0) {
                    this.field2766[arg0][var4.field2801] = null;
                    this.field2766[arg0][arg1] = var4;
                    int var5 = (var4.field2800 * var4.field2799 >> 12) + var4.field2814;
                    var4.field2814 += arg1 - var4.field2801 << 8;
                    var4.field2799 = var5 - var4.field2814;
                    var4.field2800 = 4096;
                    var4.field2801 = arg1;
                    return;
                }
            }
        }
        class164 var6 = (class164) this.field2749.method3224((long) this.field2755[arg0]);
        if (var6 == null) {
            return;
        }
        class57 var7 = var6.field2720[arg1];
        if (var7 == null) {
            return;
        }
        class170 var8 = new class170();
        var8.field2795 = arg0;
        var8.field2791 = var6;
        var8.field2792 = var7;
        var8.field2806 = var6.field2713[arg1];
        var8.field2794 = var6.field2717[arg1];
        var8.field2801 = arg1;
        var8.field2796 = var6.field2716 * arg2 * arg2 * var6.field2712[arg1] + 1024 >> 11;
        var8.field2797 = var6.field2715[arg1] & 0xFF;
        var8.field2814 = (arg1 << 8) - (var6.field2711[arg1] & 0x7FFF);
        var8.field2793 = 0;
        var8.field2802 = 0;
        var8.field2803 = 0;
        var8.field2804 = -1;
        var8.field2790 = 0;
        if (this.field2763[arg0] == 0) {
            var8.field2808 = class59.method1261(var7, this.method3088(var8), this.method3089(var8), this.method3153(var8));
        } else {
            var8.field2808 = class59.method1261(var7, this.method3088(var8), 0, this.method3153(var8));
            this.method3092(var8, var6.field2711[arg1] < 0);
        }
        if (var6.field2711[arg1] < 0) {
            var8.field2808.method1248(-1);
        }
        if (var8.field2794 >= 0) {
            class170 var9 = this.field2767[arg0][var8.field2794];
            if (var9 != null && var9.field2804 < 0) {
                this.field2766[arg0][var9.field2801] = null;
                var9.field2804 = 0;
            }
            this.field2767[arg0][var8.field2794] = var8;
        }
        this.field2774.field2785.method3256(var8);
        this.field2766[arg0][arg1] = var8;
    }

    @ObfuscatedName("fo.g(Lfc;ZI)V")
    public void method3092(class170 arg0, boolean arg1) {
        int var3 = arg0.field2792.field1126.length;
        int var5;
        if (arg1 && arg0.field2792.field1129) {
            int var4 = var3 + var3 - arg0.field2792.field1125;
            var5 = (int) ((long) this.field2763[arg0.field2795] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2808.method1137(true);
            }
        } else {
            var5 = (int) ((long) this.field2763[arg0.field2795] * (long) var3 >> 6);
        }
        arg0.field2808.method1136(var5);
    }

    @ObfuscatedName("fo.j(IIIB)V")
    public void method3078(int arg0, int arg1, int arg2) {
        class170 var4 = this.field2766[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2766[arg0][arg1] = null;
        if ((this.field2759[arg0] & 0x2) == 0) {
            var4.field2804 = 0;
            return;
        }
        for (class170 var5 = (class170) this.field2774.field2785.method3270(); var5 != null; var5 = (class170) this.field2774.field2785.method3262()) {
            if (var4.field2795 == var5.field2795 && var5.field2804 < 0 && var4 != var5) {
                var4.field2804 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("fo.a(IIII)V")
    public void method3079(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("fo.x(IIB)V")
    public void method3080(int arg0, int arg1) {
    }

    @ObfuscatedName("fo.n(III)V")
    public void method3129(int arg0, int arg1) {
        this.field2770[arg0] = arg1;
    }

    @ObfuscatedName("fo.v(II)V")
    public void method3081(int arg0) {
        for (class170 var2 = (class170) this.field2774.field2785.method3270(); var2 != null; var2 = (class170) this.field2774.field2785.method3262()) {
            if (arg0 < 0 || var2.field2795 == arg0) {
                if (var2.field2808 != null) {
                    var2.field2808.method1141(Statics.field1071 / 100);
                    if (var2.field2808.method1208()) {
                        this.field2774.field2786.method978(var2.field2808);
                    }
                    var2.method3180();
                }
                if (var2.field2804 < 0) {
                    this.field2766[var2.field2795][var2.field2801] = null;
                }
                var2.method3358();
            }
        }
    }

    @ObfuscatedName("fo.l(IS)V")
    public void method3082(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3082(var2);
            }
            return;
        }
        this.field2751[arg0] = 12800;
        this.field2765[arg0] = 8192;
        this.field2773[arg0] = 16383;
        this.field2770[arg0] = 8192;
        this.field2758[arg0] = 0;
        this.field2757[arg0] = 8192;
        this.method3114(arg0);
        this.method3103(arg0);
        this.field2759[arg0] = 0;
        this.field2761[arg0] = 32767;
        this.field2762[arg0] = 256;
        this.field2763[arg0] = 0;
        this.method3087(arg0, 8192);
    }

    @ObfuscatedName("fo.am(IB)V")
    public void method3083(int arg0) {
        for (class170 var2 = (class170) this.field2774.field2785.method3270(); var2 != null; var2 = (class170) this.field2774.field2785.method3262()) {
            if ((arg0 < 0 || var2.field2795 == arg0) && var2.field2804 < 0) {
                this.field2766[var2.field2795][var2.field2801] = null;
                var2.field2804 = 0;
            }
        }
    }

    @ObfuscatedName("fo.ax(S)V")
    public void method3084() {
        this.method3081(-1);
        this.method3082(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2755[var1] = this.field2752[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2756[var2] = this.field2752[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("fo.ac(II)V")
    public void method3114(int arg0) {
        if ((this.field2759[arg0] & 0x2) == 0) {
            return;
        }
        for (class170 var2 = (class170) this.field2774.field2785.method3270(); var2 != null; var2 = (class170) this.field2774.field2785.method3262()) {
            if (var2.field2795 == arg0 && this.field2766[arg0][var2.field2801] == null && var2.field2804 < 0) {
                var2.field2804 = 0;
            }
        }
    }

    @ObfuscatedName("fo.ah(II)V")
    public void method3103(int arg0) {
        if ((this.field2759[arg0] & 0x4) == 0) {
            return;
        }
        for (class170 var2 = (class170) this.field2774.field2785.method3270(); var2 != null; var2 = (class170) this.field2774.field2785.method3262()) {
            if (var2.field2795 == arg0) {
                var2.field2811 = 0;
            }
        }
    }

    @ObfuscatedName("fo.at(II)V")
    public void method3132(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3078(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3077(var6, var7, var8);
            } else {
                this.method3078(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3079(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2756[var12] = (var14 << 14) + (this.field2756[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2756[var12] = (var14 << 7) + (this.field2756[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2758[var12] = (var14 << 7) + (this.field2758[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2758[var12] = (this.field2758[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2757[var12] = (var14 << 7) + (this.field2757[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2757[var12] = (this.field2757[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2751[var12] = (var14 << 7) + (this.field2751[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2751[var12] = (this.field2751[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2765[var12] = (var14 << 7) + (this.field2765[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2765[var12] = (this.field2765[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2773[var12] = (var14 << 7) + (this.field2773[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2773[var12] = (this.field2773[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2759[var12] |= 0x1;
                } else {
                    this.field2759[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2759[var12] |= 0x2;
                } else {
                    this.method3114(var12);
                    this.field2759[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2761[var12] = (var14 << 7) + (this.field2761[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2761[var12] = (this.field2761[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2761[var12] = (var14 << 7) + (this.field2761[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2761[var12] = (this.field2761[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3081(var12);
            }
            if (var13 == 121) {
                this.method3082(var12);
            }
            if (var13 == 123) {
                this.method3083(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2761[var12];
                if (var15 == 16384) {
                    this.field2762[var12] = (var14 << 7) + (this.field2762[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2761[var12];
                if (var16 == 16384) {
                    this.field2762[var12] = (this.field2762[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2763[var12] = (var14 << 7) + (this.field2763[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2763[var12] = (this.field2763[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2759[var12] |= 0x4;
                } else {
                    this.method3103(var12);
                    this.field2759[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3087(var12, (var14 << 7) + (this.field2753[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3087(var12, (this.field2753[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3097(var17, this.field2756[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3080(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method3129(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3084();
            }
        }
    }

    @ObfuscatedName("fo.ap(IIB)V")
    public void method3087(int arg0, int arg1) {
        this.field2753[arg0] = arg1;
        this.field2748[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("fo.as(Lfc;I)I")
    public int method3088(class170 arg0) {
        int var2 = (arg0.field2800 * arg0.field2799 >> 12) + arg0.field2814;
        int var3 = ((this.field2770[arg0.field2795] - 8192) * this.field2762[arg0.field2795] >> 12) + var2;
        class168 var4 = arg0.field2806;
        if (var4.field2782 > 0 && (var4.field2781 > 0 || this.field2758[arg0.field2795] > 0)) {
            int var5 = var4.field2781 << 2;
            int var6 = var4.field2783 << 1;
            if (arg0.field2798 < var6) {
                var5 = arg0.field2798 * var5 / var6;
            }
            int var7 = (this.field2758[arg0.field2795] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2807 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2792.field1127 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1071 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("fo.au(Lfc;I)I")
    public int method3089(class170 arg0) {
        class168 var2 = arg0.field2806;
        int var3 = this.field2773[arg0.field2795] * this.field2751[arg0.field2795] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2796 * var4 + 16384 >> 15;
        int var6 = this.field2764 * var5 + 128 >> 8;
        if (var2.field2775 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2793 * 1.953125E-5D * (double) var2.field2775) + 0.5D);
        }
        if (var2.field2779 != null) {
            int var7 = arg0.field2802;
            int var8 = var2.field2779[arg0.field2803 + 1];
            if (arg0.field2803 < var2.field2779.length - 2) {
                int var9 = (var2.field2779[arg0.field2803] & 0xFF) << 8;
                int var10 = (var2.field2779[arg0.field2803 + 2] & 0xFF) << 8;
                var8 += (var2.field2779[arg0.field2803 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2804 > 0 && var2.field2777 != null) {
            int var11 = arg0.field2804;
            int var12 = var2.field2777[arg0.field2790 + 1];
            if (arg0.field2790 < var2.field2777.length - 2) {
                int var13 = (var2.field2777[arg0.field2790] & 0xFF) << 8;
                int var14 = (var2.field2777[arg0.field2790 + 2] & 0xFF) << 8;
                var12 += (var2.field2777[arg0.field2790 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("fo.ag(Lfc;I)I")
    public int method3153(class170 arg0) {
        int var2 = this.field2765[arg0.field2795];
        return var2 < 8192 ? arg0.field2797 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2797) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("fo.f()Lbw;")
    public synchronized class61 method983() {
        return this.field2774;
    }

    @ObfuscatedName("fo.z()Lbw;")
    public synchronized class61 method984() {
        return null;
    }

    @ObfuscatedName("fo.o()I")
    public synchronized int method985() {
        return 0;
    }

    @ObfuscatedName("fo.k([III)V")
    public synchronized void method986(int[] arg0, int arg1, int arg2) {
        if (this.field2768.method2998()) {
            int var4 = this.field2750 * this.field2768.field2722 / Statics.field1071;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2772;
                if (this.field2754 - var5 >= 0L) {
                    this.field2772 = var5;
                    break;
                }
                int var7 = (int) ((this.field2754 - this.field2772 + (long) var4 - 1L) / (long) var4);
                this.field2772 += (long) var4 * (long) var7;
                this.field2774.method986(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3131();
            } while (this.field2768.method2998());
        }
        this.field2774.method986(arg0, arg1, arg2);
    }

    @ObfuscatedName("fo.h(I)V")
    public synchronized void method977(int arg0) {
        if (this.field2768.method2998()) {
            int var2 = this.field2750 * this.field2768.field2722 / Statics.field1071;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2772;
                if (this.field2754 - var3 >= 0L) {
                    this.field2772 = var3;
                    break;
                }
                int var5 = (int) ((this.field2754 - this.field2772 + (long) var2 - 1L) / (long) var2);
                this.field2772 += (long) var2 * (long) var5;
                this.field2774.method977(var5);
                arg0 -= var5;
                this.method3131();
            } while (this.field2768.method2998());
        }
        this.field2774.method977(arg0);
    }

    @ObfuscatedName("fo.an(I)V")
    public void method3131() {
        int var1 = this.field2760;
        int var2 = this.field2771;
        long var3 = this.field2754;
        while (this.field2771 == var2) {
            while (this.field2768.field2725[var1] == var2) {
                this.field2768.method3023(var1);
                int var5 = this.field2768.method3003(var1);
                if (var5 == 1) {
                    this.field2768.method3001();
                    this.field2768.method2999(var1);
                    if (this.field2768.method3008()) {
                        if (!this.field2769 || var2 == 0) {
                            this.method3084();
                            this.field2768.method3007();
                            return;
                        }
                        this.field2768.method3009(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3132(var5);
                }
                this.field2768.method3002(var1);
                this.field2768.method2999(var1);
            }
            var1 = this.field2768.method2997();
            var2 = this.field2768.field2725[var1];
            var3 = this.field2768.method3041(var2);
        }
        this.field2760 = var1;
        this.field2771 = var2;
        this.field2754 = var3;
    }

    @ObfuscatedName("fo.ad(Lfc;B)Z")
    public boolean method3069(class170 arg0) {
        if (arg0.field2808 != null) {
            return false;
        }
        if (arg0.field2804 >= 0) {
            arg0.method3358();
            if (arg0.field2794 > 0 && this.field2767[arg0.field2795][arg0.field2794] == arg0) {
                this.field2767[arg0.field2795][arg0.field2794] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("fo.ae(Lfc;[IIIB)Z")
    public boolean method3118(class170 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2809 = Statics.field1071 / 100;
        if (arg0.field2804 >= 0 && arg0.field2808 == null || arg0.field2808.method1144()) {
            arg0.method3180();
            arg0.method3358();
            if (arg0.field2794 > 0 && this.field2767[arg0.field2795][arg0.field2794] == arg0) {
                this.field2767[arg0.field2795][arg0.field2794] = null;
            }
            return true;
        }
        int var5 = arg0.field2800;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2757[arg0.field2795] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2800 = var6;
        }
        arg0.field2808.method1142(this.method3088(arg0));
        class168 var7 = arg0.field2806;
        boolean var8 = false;
        arg0.field2798++;
        arg0.field2807 += var7.field2782;
        double var9 = (double) ((arg0.field2801 - 60 << 8) + (arg0.field2800 * arg0.field2799 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2775 > 0) {
            if (var7.field2780 > 0) {
                arg0.field2793 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2780 * var9) + 0.5D);
            } else {
                arg0.field2793 += 128;
            }
        }
        if (var7.field2779 != null) {
            if (var7.field2778 > 0) {
                arg0.field2802 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2778 * var9) + 0.5D);
            } else {
                arg0.field2802 += 128;
            }
            while (arg0.field2803 < var7.field2779.length - 2 && arg0.field2802 > (var7.field2779[arg0.field2803 + 2] & 0xFF) << 8) {
                arg0.field2803 += 2;
            }
            if (arg0.field2803 == var7.field2779.length - 2 && var7.field2779[arg0.field2803 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2804 >= 0 && var7.field2777 != null && (this.field2759[arg0.field2795] & 0x1) == 0 && (arg0.field2794 < 0 || this.field2767[arg0.field2795][arg0.field2794] != arg0)) {
            if (var7.field2776 > 0) {
                arg0.field2804 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2776 * var9) + 0.5D);
            } else {
                arg0.field2804 += 128;
            }
            while (arg0.field2790 < var7.field2777.length - 2 && arg0.field2804 > (var7.field2777[arg0.field2790 + 2] & 0xFF) << 8) {
                arg0.field2790 += 2;
            }
            if (arg0.field2790 == var7.field2777.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2808.method1153(arg0.field2809, this.method3089(arg0), this.method3153(arg0));
            return false;
        }
        arg0.field2808.method1141(arg0.field2809);
        if (arg1 == null) {
            arg0.field2808.method977(arg3);
        } else {
            arg0.field2808.method986(arg1, arg2, arg3);
        }
        if (arg0.field2808.method1208()) {
            this.field2774.field2786.method978(arg0.field2808);
        }
        arg0.method3180();
        if (arg0.field2804 >= 0) {
            arg0.method3358();
            if (arg0.field2794 > 0 && this.field2767[arg0.field2795][arg0.field2794] == arg0) {
                this.field2767[arg0.field2795][arg0.field2794] = null;
            }
        }
        return true;
    }
}
