package deob;

@ObfuscatedName("ft")
public class class167 extends class61 {

    @ObfuscatedName("ft.v")
    public class179 field2749 = new class179(128);

    @ObfuscatedName("ft.t")
    public int field2744 = 256;

    @ObfuscatedName("ft.f")
    public int field2771 = 1000000;

    @ObfuscatedName("ft.j")
    public int[] field2746 = new int[16];

    @ObfuscatedName("ft.l")
    public int[] field2770 = new int[16];

    @ObfuscatedName("ft.g")
    public int[] field2748 = new int[16];

    @ObfuscatedName("ft.k")
    public int[] field2758 = new int[16];

    @ObfuscatedName("ft.p")
    public int[] field2750 = new int[16];

    @ObfuscatedName("ft.y")
    public int[] field2769 = new int[16];

    @ObfuscatedName("ft.m")
    public int[] field2752 = new int[16];

    @ObfuscatedName("ft.o")
    public int[] field2753 = new int[16];

    @ObfuscatedName("ft.c")
    public int[] field2754 = new int[16];

    @ObfuscatedName("ft.a")
    public int[] field2756 = new int[16];

    @ObfuscatedName("ft.i")
    public int[] field2766 = new int[16];

    @ObfuscatedName("ft.w")
    public int[] field2751 = new int[16];

    @ObfuscatedName("ft.x")
    public int[] field2759 = new int[16];

    @ObfuscatedName("ft.h")
    public int[] field2767 = new int[16];

    @ObfuscatedName("ft.z")
    public int[] field2761 = new int[16];

    @ObfuscatedName("ft.u")
    public class170[][] field2762 = new class170[16][128];

    @ObfuscatedName("ft.ad")
    public class170[][] field2763 = new class170[16][128];

    @ObfuscatedName("ft.ah")
    public class165 field2764 = new class165();

    @ObfuscatedName("ft.ao")
    public boolean field2765;

    @ObfuscatedName("ft.as")
    public int field2772;

    @ObfuscatedName("ft.at")
    public int field2745;

    @ObfuscatedName("ft.ai")
    public long field2768;

    @ObfuscatedName("ft.aj")
    public long field2743;

    @ObfuscatedName("ft.aq")
    public class169 field2760 = new class169(this);

    public class167() {
        this.method3181();
    }

    @ObfuscatedName("ft.v(II)V")
    public synchronized void method3113(int arg0) {
        this.field2744 = arg0;
    }

    @ObfuscatedName("ft.t(B)I")
    public int method3206() {
        return this.field2744;
    }

    @ObfuscatedName("ft.f(Lfc;Lem;Lbj;II)Z")
    public synchronized boolean method3115(class163 arg0, class151 arg1, class54 arg2, int arg3) {
        arg0.method3022();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class180 var7 = (class180) arg0.field2706.method3269(); var7 != null; var7 = (class180) arg0.field2706.method3270()) {
            int var8 = (int) var7.field2911;
            class164 var9 = (class164) this.field2749.method3274((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method2797(var8);
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
                this.field2749.method3282(var11, (long) var8);
            }
            if (!var9.method3033(arg2, var7.field2891, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3029();
        }
        return var5;
    }

    @ObfuscatedName("ft.j(B)V")
    public synchronized void method3116() {
        for (class164 var1 = (class164) this.field2749.method3269(); var1 != null; var1 = (class164) this.field2749.method3270()) {
            var1.method3032();
        }
    }

    @ObfuscatedName("ft.l(I)V")
    public synchronized void method3169() {
        for (class164 var1 = (class164) this.field2749.method3269(); var1 != null; var1 = (class164) this.field2749.method3270()) {
            var1.method3392();
        }
    }

    @ObfuscatedName("ft.m(Lfc;ZI)V")
    public synchronized void method3118(class163 arg0, boolean arg1) {
        this.method3157();
        this.field2764.method3038(arg0.field2705);
        this.field2765 = arg1;
        this.field2768 = 0L;
        int var3 = this.field2764.method3041();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2764.method3042(var4);
            this.field2764.method3045(var4);
            this.field2764.method3043(var4);
        }
        this.field2772 = this.field2764.method3050();
        this.field2745 = this.field2764.field2723[this.field2772];
        this.field2743 = this.field2764.method3049(this.field2745);
    }

    @ObfuscatedName("ft.c(I)V")
    public synchronized void method3157() {
        this.field2764.method3039();
        this.method3181();
    }

    @ObfuscatedName("ft.r(I)Z")
    public synchronized boolean method3119() {
        return this.field2764.method3046();
    }

    @ObfuscatedName("ft.s(III)V")
    public synchronized void method3117(int arg0, int arg1) {
        this.method3121(arg0, arg1);
    }

    @ObfuscatedName("ft.n(III)V")
    public void method3121(int arg0, int arg1) {
        this.field2758[arg0] = arg1;
        this.field2769[arg0] = arg1 & 0xFFFFFF80;
        this.method3133(arg0, arg1);
    }

    @ObfuscatedName("ft.q(III)V")
    public void method3133(int arg0, int arg1) {
        if (this.field2750[arg0] != arg1) {
            this.field2750[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2763[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("ft.e(IIII)V")
    public void method3120(int arg0, int arg1, int arg2) {
        this.method3124(arg0, arg1, 64);
        if ((this.field2756[arg0] & 0x2) != 0) {
            for (class170 var4 = (class170) this.field2760.field2787.method3304(); var4 != null; var4 = (class170) this.field2760.field2787.method3325()) {
                if (var4.field2809 == arg0 && var4.field2808 < 0) {
                    this.field2762[arg0][var4.field2799] = null;
                    this.field2762[arg0][arg1] = var4;
                    int var5 = (var4.field2812 * var4.field2803 >> 12) + var4.field2802;
                    var4.field2802 += arg1 - var4.field2799 << 8;
                    var4.field2803 = var5 - var4.field2802;
                    var4.field2812 = 4096;
                    var4.field2799 = arg1;
                    return;
                }
            }
        }
        class164 var6 = (class164) this.field2749.method3274((long) this.field2750[arg0]);
        if (var6 == null) {
            return;
        }
        class57 var7 = var6.field2715[arg1];
        if (var7 == null) {
            return;
        }
        class170 var8 = new class170();
        var8.field2809 = arg0;
        var8.field2795 = var6;
        var8.field2796 = var7;
        var8.field2797 = var6.field2712[arg1];
        var8.field2798 = var6.field2718[arg1];
        var8.field2799 = arg1;
        var8.field2800 = var6.field2708 * arg2 * arg2 * var6.field2710[arg1] + 1024 >> 11;
        var8.field2801 = var6.field2711[arg1] & 0xFF;
        var8.field2802 = (arg1 << 8) - (var6.field2709[arg1] & 0x7FFF);
        var8.field2805 = 0;
        var8.field2806 = 0;
        var8.field2816 = 0;
        var8.field2808 = -1;
        var8.field2804 = 0;
        if (this.field2759[arg0] == 0) {
            var8.field2810 = class59.method1115(var7, this.method3135(var8), this.method3136(var8), this.method3199(var8));
        } else {
            var8.field2810 = class59.method1115(var7, this.method3135(var8), 0, this.method3199(var8));
            this.method3123(var8, var6.field2709[arg1] < 0);
        }
        if (var6.field2709[arg1] < 0) {
            var8.field2810.method1117(-1);
        }
        if (var8.field2798 >= 0) {
            class170 var9 = this.field2763[arg0][var8.field2798];
            if (var9 != null && var9.field2808 < 0) {
                this.field2762[arg0][var9.field2799] = null;
                var9.field2808 = 0;
            }
            this.field2763[arg0][var8.field2798] = var8;
        }
        this.field2760.field2787.method3323(var8);
        this.field2762[arg0][arg1] = var8;
    }

    @ObfuscatedName("ft.d(Lfn;ZS)V")
    public void method3123(class170 arg0, boolean arg1) {
        int var3 = arg0.field2796.field1130.length;
        int var5;
        if (arg1 && arg0.field2796.field1129) {
            int var4 = var3 + var3 - arg0.field2796.field1131;
            var5 = (int) ((long) this.field2759[arg0.field2809] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2810.method1124(true);
            }
        } else {
            var5 = (int) ((long) this.field2759[arg0.field2809] * (long) var3 >> 6);
        }
        arg0.field2810.method1226(var5);
    }

    @ObfuscatedName("ft.b(IIIB)V")
    public void method3124(int arg0, int arg1, int arg2) {
        class170 var4 = this.field2762[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2762[arg0][arg1] = null;
        if ((this.field2756[arg0] & 0x2) == 0) {
            var4.field2808 = 0;
            return;
        }
        for (class170 var5 = (class170) this.field2760.field2787.method3303(); var5 != null; var5 = (class170) this.field2760.field2787.method3305()) {
            if (var4.field2809 == var5.field2809 && var5.field2808 < 0 && var4 != var5) {
                var4.field2808 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("ft.a(IIIB)V")
    public void method3125(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("ft.i(III)V")
    public void method3126(int arg0, int arg1) {
    }

    @ObfuscatedName("ft.w(IIB)V")
    public void method3127(int arg0, int arg1) {
        this.field2752[arg0] = arg1;
    }

    @ObfuscatedName("ft.x(IB)V")
    public void method3128(int arg0) {
        for (class170 var2 = (class170) this.field2760.field2787.method3303(); var2 != null; var2 = (class170) this.field2760.field2787.method3305()) {
            if (arg0 < 0 || var2.field2809 == arg0) {
                if (var2.field2810 != null) {
                    var2.field2810.method1201(Statics.field1819 / 100);
                    if (var2.field2810.method1132()) {
                        this.field2760.field2788.method950(var2.field2810);
                    }
                    var2.method3217();
                }
                if (var2.field2808 < 0) {
                    this.field2762[var2.field2809][var2.field2799] = null;
                }
                var2.method3392();
            }
        }
    }

    @ObfuscatedName("ft.h(IS)V")
    public void method3129(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3129(var2);
            }
            return;
        }
        this.field2746[arg0] = 12800;
        this.field2770[arg0] = 8192;
        this.field2748[arg0] = 16383;
        this.field2752[arg0] = 8192;
        this.field2753[arg0] = 0;
        this.field2754[arg0] = 8192;
        this.method3131(arg0);
        this.method3132(arg0);
        this.field2756[arg0] = 0;
        this.field2766[arg0] = 32767;
        this.field2751[arg0] = 256;
        this.field2759[arg0] = 0;
        this.method3134(arg0, 8192);
    }

    @ObfuscatedName("ft.z(IB)V")
    public void method3130(int arg0) {
        for (class170 var2 = (class170) this.field2760.field2787.method3303(); var2 != null; var2 = (class170) this.field2760.field2787.method3305()) {
            if ((arg0 < 0 || var2.field2809 == arg0) && var2.field2808 < 0) {
                this.field2762[var2.field2809][var2.field2799] = null;
                var2.field2808 = 0;
            }
        }
    }

    @ObfuscatedName("ft.u(I)V")
    public void method3181() {
        this.method3128(-1);
        this.method3129(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2750[var1] = this.field2758[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2769[var2] = this.field2758[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("ft.ad(II)V")
    public void method3131(int arg0) {
        if ((this.field2756[arg0] & 0x2) == 0) {
            return;
        }
        for (class170 var2 = (class170) this.field2760.field2787.method3303(); var2 != null; var2 = (class170) this.field2760.field2787.method3305()) {
            if (var2.field2809 == arg0 && this.field2762[arg0][var2.field2799] == null && var2.field2808 < 0) {
                var2.field2808 = 0;
            }
        }
    }

    @ObfuscatedName("ft.ah(II)V")
    public void method3132(int arg0) {
        if ((this.field2756[arg0] & 0x4) == 0) {
            return;
        }
        for (class170 var2 = (class170) this.field2760.field2787.method3303(); var2 != null; var2 = (class170) this.field2760.field2787.method3305()) {
            if (var2.field2809 == arg0) {
                var2.field2814 = 0;
            }
        }
    }

    @ObfuscatedName("ft.am(II)V")
    public void method3163(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3124(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3120(var6, var7, var8);
            } else {
                this.method3124(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3125(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2769[var12] = (var14 << 14) + (this.field2769[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2769[var12] = (var14 << 7) + (this.field2769[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2753[var12] = (var14 << 7) + (this.field2753[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2753[var12] = (this.field2753[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2754[var12] = (var14 << 7) + (this.field2754[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2754[var12] = (this.field2754[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2746[var12] = (var14 << 7) + (this.field2746[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2746[var12] = (this.field2746[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2770[var12] = (var14 << 7) + (this.field2770[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2770[var12] = (this.field2770[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2748[var12] = (var14 << 7) + (this.field2748[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2748[var12] = (this.field2748[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2756[var12] |= 0x1;
                } else {
                    this.field2756[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2756[var12] |= 0x2;
                } else {
                    this.method3131(var12);
                    this.field2756[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2766[var12] = (var14 << 7) + (this.field2766[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2766[var12] = (this.field2766[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2766[var12] = (var14 << 7) + (this.field2766[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2766[var12] = (this.field2766[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3128(var12);
            }
            if (var13 == 121) {
                this.method3129(var12);
            }
            if (var13 == 123) {
                this.method3130(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2766[var12];
                if (var15 == 16384) {
                    this.field2751[var12] = (var14 << 7) + (this.field2751[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2766[var12];
                if (var16 == 16384) {
                    this.field2751[var12] = (this.field2751[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2759[var12] = (var14 << 7) + (this.field2759[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2759[var12] = (this.field2759[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2756[var12] |= 0x4;
                } else {
                    this.method3132(var12);
                    this.field2756[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3134(var12, (var14 << 7) + (this.field2767[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3134(var12, (this.field2767[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3133(var17, this.field2769[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3126(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method3127(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3181();
            }
        }
    }

    @ObfuscatedName("ft.av(IIB)V")
    public void method3134(int arg0, int arg1) {
        this.field2767[arg0] = arg1;
        this.field2761[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("ft.ar(Lfn;I)I")
    public int method3135(class170 arg0) {
        int var2 = (arg0.field2812 * arg0.field2803 >> 12) + arg0.field2802;
        int var3 = ((this.field2752[arg0.field2809] - 8192) * this.field2751[arg0.field2809] >> 12) + var2;
        class168 var4 = arg0.field2797;
        if (var4.field2780 > 0 && (var4.field2779 > 0 || this.field2753[arg0.field2809] > 0)) {
            int var5 = var4.field2779 << 2;
            int var6 = var4.field2785 << 1;
            if (arg0.field2794 < var6) {
                var5 = arg0.field2794 * var5 / var6;
            }
            int var7 = (this.field2753[arg0.field2809] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2811 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2796.field1133 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1819 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("ft.af(Lfn;I)I")
    public int method3136(class170 arg0) {
        class168 var2 = arg0.field2797;
        int var3 = this.field2748[arg0.field2809] * this.field2746[arg0.field2809] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2800 * var4 + 16384 >> 15;
        int var6 = this.field2744 * var5 + 128 >> 8;
        if (var2.field2775 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2805 * 1.953125E-5D * (double) var2.field2775) + 0.5D);
        }
        if (var2.field2782 != null) {
            int var7 = arg0.field2806;
            int var8 = var2.field2782[arg0.field2816 + 1];
            if (arg0.field2816 < var2.field2782.length - 2) {
                int var9 = (var2.field2782[arg0.field2816] & 0xFF) << 8;
                int var10 = (var2.field2782[arg0.field2816 + 2] & 0xFF) << 8;
                var8 += (var2.field2782[arg0.field2816 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2808 > 0 && var2.field2774 != null) {
            int var11 = arg0.field2808;
            int var12 = var2.field2774[arg0.field2804 + 1];
            if (arg0.field2804 < var2.field2774.length - 2) {
                int var13 = (var2.field2774[arg0.field2804] & 0xFF) << 8;
                int var14 = (var2.field2774[arg0.field2804 + 2] & 0xFF) << 8;
                var12 += (var2.field2774[arg0.field2804 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("ft.au(Lfn;I)I")
    public int method3199(class170 arg0) {
        int var2 = this.field2770[arg0.field2809];
        return var2 < 8192 ? arg0.field2801 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2801) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("ft.g()Lbc;")
    public synchronized class61 method958() {
        return this.field2760;
    }

    @ObfuscatedName("ft.k()Lbc;")
    public synchronized class61 method956() {
        return null;
    }

    @ObfuscatedName("ft.p()I")
    public synchronized int method957() {
        return 0;
    }

    @ObfuscatedName("ft.y([III)V")
    public synchronized void method949(int[] arg0, int arg1, int arg2) {
        if (this.field2764.method3046()) {
            int var4 = this.field2771 * this.field2764.field2720 / Statics.field1819;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2768;
                if (this.field2743 - var5 >= 0L) {
                    this.field2768 = var5;
                    break;
                }
                int var7 = (int) ((this.field2743 - this.field2768 + (long) var4 - 1L) / (long) var4);
                this.field2768 += (long) var4 * (long) var7;
                this.field2760.method949(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3166();
            } while (this.field2764.method3046());
        }
        this.field2760.method949(arg0, arg1, arg2);
    }

    @ObfuscatedName("ft.o(I)V")
    public synchronized void method960(int arg0) {
        if (this.field2764.method3046()) {
            int var2 = this.field2771 * this.field2764.field2720 / Statics.field1819;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2768;
                if (this.field2743 - var3 >= 0L) {
                    this.field2768 = var3;
                    break;
                }
                int var5 = (int) ((this.field2743 - this.field2768 + (long) var2 - 1L) / (long) var2);
                this.field2768 += (long) var2 * (long) var5;
                this.field2760.method960(var5);
                arg0 -= var5;
                this.method3166();
            } while (this.field2764.method3046());
        }
        this.field2760.method960(arg0);
    }

    @ObfuscatedName("ft.aa(B)V")
    public void method3166() {
        int var1 = this.field2772;
        int var2 = this.field2745;
        long var3 = this.field2743;
        while (this.field2745 == var2) {
            while (this.field2764.field2723[var1] == var2) {
                this.field2764.method3042(var1);
                int var5 = this.field2764.method3067(var1);
                if (var5 == 1) {
                    this.field2764.method3044();
                    this.field2764.method3043(var1);
                    if (this.field2764.method3051()) {
                        if (!this.field2765 || var2 == 0) {
                            this.method3181();
                            this.field2764.method3039();
                            return;
                        }
                        this.field2764.method3056(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3163(var5);
                }
                this.field2764.method3045(var1);
                this.field2764.method3043(var1);
            }
            var1 = this.field2764.method3050();
            var2 = this.field2764.field2723[var1];
            var3 = this.field2764.method3049(var2);
        }
        this.field2772 = var1;
        this.field2745 = var2;
        this.field2743 = var3;
    }

    @ObfuscatedName("ft.ab(Lfn;B)Z")
    public boolean method3186(class170 arg0) {
        if (arg0.field2810 != null) {
            return false;
        }
        if (arg0.field2808 >= 0) {
            arg0.method3392();
            if (arg0.field2798 > 0 && this.field2763[arg0.field2809][arg0.field2798] == arg0) {
                this.field2763[arg0.field2809][arg0.field2798] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("ft.ae(Lfn;[IIIB)Z")
    public boolean method3142(class170 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2813 = Statics.field1819 / 100;
        if (arg0.field2808 >= 0 && arg0.field2810 == null || arg0.field2810.method1131()) {
            arg0.method3217();
            arg0.method3392();
            if (arg0.field2798 > 0 && this.field2763[arg0.field2809][arg0.field2798] == arg0) {
                this.field2763[arg0.field2809][arg0.field2798] = null;
            }
            return true;
        }
        int var5 = arg0.field2812;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2754[arg0.field2809] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2812 = var6;
        }
        arg0.field2810.method1129(this.method3135(arg0));
        class168 var7 = arg0.field2797;
        boolean var8 = false;
        arg0.field2794++;
        arg0.field2811 += var7.field2780;
        double var9 = (double) ((arg0.field2799 - 60 << 8) + (arg0.field2812 * arg0.field2803 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2775 > 0) {
            if (var7.field2781 > 0) {
                arg0.field2805 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2781 * var9) + 0.5D);
            } else {
                arg0.field2805 += 128;
            }
        }
        if (var7.field2782 != null) {
            if (var7.field2776 > 0) {
                arg0.field2806 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2776 * var9) + 0.5D);
            } else {
                arg0.field2806 += 128;
            }
            while (arg0.field2816 < var7.field2782.length - 2 && arg0.field2806 > (var7.field2782[arg0.field2816 + 2] & 0xFF) << 8) {
                arg0.field2816 += 2;
            }
            if (arg0.field2816 == var7.field2782.length - 2 && var7.field2782[arg0.field2816 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2808 >= 0 && var7.field2774 != null && (this.field2756[arg0.field2809] & 0x1) == 0 && (arg0.field2798 < 0 || this.field2763[arg0.field2809][arg0.field2798] != arg0)) {
            if (var7.field2777 > 0) {
                arg0.field2808 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2777 * var9) + 0.5D);
            } else {
                arg0.field2808 += 128;
            }
            while (arg0.field2804 < var7.field2774.length - 2 && arg0.field2808 > (var7.field2774[arg0.field2804 + 2] & 0xFF) << 8) {
                arg0.field2804 += 2;
            }
            if (arg0.field2804 == var7.field2774.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2810.method1127(arg0.field2813, this.method3136(arg0), this.method3199(arg0));
            return false;
        }
        arg0.field2810.method1201(arg0.field2813);
        if (arg1 == null) {
            arg0.field2810.method960(arg3);
        } else {
            arg0.field2810.method949(arg1, arg2, arg3);
        }
        if (arg0.field2810.method1132()) {
            this.field2760.field2788.method950(arg0.field2810);
        }
        arg0.method3217();
        if (arg0.field2808 >= 0) {
            arg0.method3392();
            if (arg0.field2798 > 0 && this.field2763[arg0.field2809][arg0.field2798] == arg0) {
                this.field2763[arg0.field2809][arg0.field2798] = null;
            }
        }
        return true;
    }
}
