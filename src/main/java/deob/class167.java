package deob;

@ObfuscatedName("fq")
public class class167 extends class61 {

    @ObfuscatedName("fq.b")
    public class179 field2763 = new class179(128);

    @ObfuscatedName("fq.e")
    public int field2756 = 256;

    @ObfuscatedName("fq.i")
    public int field2776 = 1000000;

    @ObfuscatedName("fq.k")
    public int[] field2772 = new int[16];

    @ObfuscatedName("fq.h")
    public int[] field2759 = new int[16];

    @ObfuscatedName("fq.p")
    public int[] field2760 = new int[16];

    @ObfuscatedName("fq.n")
    public int[] field2764 = new int[16];

    @ObfuscatedName("fq.o")
    public int[] field2762 = new int[16];

    @ObfuscatedName("fq.g")
    public int[] field2761 = new int[16];

    @ObfuscatedName("fq.z")
    public int[] field2758 = new int[16];

    @ObfuscatedName("fq.t")
    public int[] field2765 = new int[16];

    @ObfuscatedName("fq.y")
    public int[] field2766 = new int[16];

    @ObfuscatedName("fq.m")
    public int[] field2767 = new int[16];

    @ObfuscatedName("fq.c")
    public int[] field2768 = new int[16];

    @ObfuscatedName("fq.j")
    public int[] field2769 = new int[16];

    @ObfuscatedName("fq.d")
    public int[] field2770 = new int[16];

    @ObfuscatedName("fq.l")
    public int[] field2771 = new int[16];

    @ObfuscatedName("fq.u")
    public int[] field2774 = new int[16];

    @ObfuscatedName("fq.r")
    public class170[][] field2755 = new class170[16][128];

    @ObfuscatedName("fq.an")
    public class170[][] field2757 = new class170[16][128];

    @ObfuscatedName("fq.ao")
    public class165 field2775 = new class165();

    @ObfuscatedName("fq.ah")
    public boolean field2783;

    @ObfuscatedName("fq.ai")
    public int field2777;

    @ObfuscatedName("fq.aa")
    public int field2779;

    @ObfuscatedName("fq.ag")
    public long field2778;

    @ObfuscatedName("fq.ar")
    public long field2780;

    @ObfuscatedName("fq.al")
    public class169 field2781 = new class169(this);

    public class167() {
        this.method3115();
    }

    @ObfuscatedName("fq.b(II)V")
    public synchronized void method3095(int arg0) {
        this.field2756 = arg0;
    }

    @ObfuscatedName("fq.e(I)I")
    public int method3191() {
        return this.field2756;
    }

    @ObfuscatedName("fq.i(Lfh;Lex;Lbc;II)Z")
    public synchronized boolean method3097(class163 arg0, class151 arg1, class54 arg2, int arg3) {
        arg0.method2999();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class180 var7 = (class180) arg0.field2718.method3260(); var7 != null; var7 = (class180) arg0.field2718.method3261()) {
            int var8 = (int) var7.field2905;
            class164 var9 = (class164) this.field2763.method3257((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method2764(var8);
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
                this.field2763.method3258(var11, (long) var8);
            }
            if (!var9.method3009(arg2, var7.field2884, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3000();
        }
        return var5;
    }

    @ObfuscatedName("fq.k(I)V")
    public synchronized void method3098() {
        for (class164 var1 = (class164) this.field2763.method3260(); var1 != null; var1 = (class164) this.field2763.method3261()) {
            var1.method3010();
        }
    }

    @ObfuscatedName("fq.h(I)V")
    public synchronized void method3099() {
        for (class164 var1 = (class164) this.field2763.method3260(); var1 != null; var1 = (class164) this.field2763.method3261()) {
            var1.method3392();
        }
    }

    @ObfuscatedName("fq.z(Lfh;ZI)V")
    public synchronized void method3100(class163 arg0, boolean arg1) {
        this.method3101();
        this.field2775.method3019(arg0.field2719);
        this.field2783 = arg1;
        this.field2778 = 0L;
        int var3 = this.field2775.method3042();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2775.method3023(var4);
            this.field2775.method3031(var4);
            this.field2775.method3059(var4);
        }
        this.field2777 = this.field2775.method3055();
        this.field2779 = this.field2775.field2736[this.field2777];
        this.field2780 = this.field2775.method3030(this.field2779);
    }

    @ObfuscatedName("fq.y(B)V")
    public synchronized void method3101() {
        this.field2775.method3020();
        this.method3115();
    }

    @ObfuscatedName("fq.w(I)Z")
    public synchronized boolean method3104() {
        return this.field2775.method3021();
    }

    @ObfuscatedName("fq.x(III)V")
    public synchronized void method3123(int arg0, int arg1) {
        this.method3169(arg0, arg1);
    }

    @ObfuscatedName("fq.v(III)V")
    public void method3169(int arg0, int arg1) {
        this.field2764[arg0] = arg1;
        this.field2761[arg0] = arg1 & 0xFFFFFF80;
        this.method3105(arg0, arg1);
    }

    @ObfuscatedName("fq.q(IIB)V")
    public void method3105(int arg0, int arg1) {
        if (this.field2762[arg0] != arg1) {
            this.field2762[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2757[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("fq.f(IIIB)V")
    public void method3106(int arg0, int arg1, int arg2) {
        this.method3151(arg0, arg1, 64);
        if ((this.field2767[arg0] & 0x2) != 0) {
            for (class170 var4 = (class170) this.field2781.field2797.method3294(); var4 != null; var4 = (class170) this.field2781.field2797.method3296()) {
                if (var4.field2815 == arg0 && var4.field2814 < 0) {
                    this.field2755[arg0][var4.field2800] = null;
                    this.field2755[arg0][arg1] = var4;
                    int var5 = (var4.field2810 * var4.field2803 >> 12) + var4.field2811;
                    var4.field2811 += arg1 - var4.field2800 << 8;
                    var4.field2803 = var5 - var4.field2811;
                    var4.field2810 = 4096;
                    var4.field2800 = arg1;
                    return;
                }
            }
        }
        class164 var6 = (class164) this.field2763.method3257((long) this.field2762[arg0]);
        if (var6 == null) {
            return;
        }
        class57 var7 = var6.field2721[arg1];
        if (var7 == null) {
            return;
        }
        class170 var8 = new class170();
        var8.field2815 = arg0;
        var8.field2801 = var6;
        var8.field2805 = var7;
        var8.field2816 = var6.field2720[arg1];
        var8.field2804 = var6.field2726[arg1];
        var8.field2800 = arg1;
        var8.field2806 = var6.field2729 * arg2 * arg2 * var6.field2723[arg1] + 1024 >> 11;
        var8.field2809 = var6.field2727[arg1] & 0xFF;
        var8.field2811 = (arg1 << 8) - (var6.field2722[arg1] & 0x7FFF);
        var8.field2807 = 0;
        var8.field2812 = 0;
        var8.field2813 = 0;
        var8.field2814 = -1;
        var8.field2818 = 0;
        if (this.field2770[arg0] == 0) {
            var8.field2808 = class59.method1224(var7, this.method3119(var8), this.method3167(var8), this.method3121(var8));
        } else {
            var8.field2808 = class59.method1224(var7, this.method3119(var8), 0, this.method3121(var8));
            this.method3145(var8, var6.field2722[arg1] < 0);
        }
        if (var6.field2722[arg1] < 0) {
            var8.field2808.method1108(-1);
        }
        if (var8.field2804 >= 0) {
            class170 var9 = this.field2757[arg0][var8.field2804];
            if (var9 != null && var9.field2814 < 0) {
                this.field2755[arg0][var9.field2800] = null;
                var9.field2814 = 0;
            }
            this.field2757[arg0][var8.field2804] = var8;
        }
        this.field2781.field2797.method3302(var8);
        this.field2755[arg0][arg1] = var8;
    }

    @ObfuscatedName("fq.s(Lfe;ZB)V")
    public void method3145(class170 arg0, boolean arg1) {
        int var3 = arg0.field2805.field1137.length;
        int var5;
        if (arg1 && arg0.field2805.field1134) {
            int var4 = var3 + var3 - arg0.field2805.field1135;
            var5 = (int) ((long) this.field2770[arg0.field2815] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2808.method1091(true);
            }
        } else {
            var5 = (int) ((long) this.field2770[arg0.field2815] * (long) var3 >> 6);
        }
        arg0.field2808.method1090(var5);
    }

    @ObfuscatedName("fq.a(IIII)V")
    public void method3151(int arg0, int arg1, int arg2) {
        class170 var4 = this.field2755[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2755[arg0][arg1] = null;
        if ((this.field2767[arg0] & 0x2) == 0) {
            var4.field2814 = 0;
            return;
        }
        for (class170 var5 = (class170) this.field2781.field2797.method3293(); var5 != null; var5 = (class170) this.field2781.field2797.method3288()) {
            if (var4.field2815 == var5.field2815 && var5.field2814 < 0 && var4 != var5) {
                var4.field2814 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("fq.m(IIII)V")
    public void method3109(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("fq.c(IIB)V")
    public void method3110(int arg0, int arg1) {
    }

    @ObfuscatedName("fq.j(III)V")
    public void method3193(int arg0, int arg1) {
        this.field2758[arg0] = arg1;
    }

    @ObfuscatedName("fq.d(II)V")
    public void method3120(int arg0) {
        for (class170 var2 = (class170) this.field2781.field2797.method3293(); var2 != null; var2 = (class170) this.field2781.field2797.method3288()) {
            if (arg0 < 0 || var2.field2815 == arg0) {
                if (var2.field2808 != null) {
                    var2.field2808.method1125(Statics.field1092 / 100);
                    if (var2.field2808.method1220()) {
                        this.field2781.field2798.method955(var2.field2808);
                    }
                    var2.method3202();
                }
                if (var2.field2814 < 0) {
                    this.field2755[var2.field2815][var2.field2800] = null;
                }
                var2.method3392();
            }
        }
    }

    @ObfuscatedName("fq.l(IS)V")
    public void method3113(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3113(var2);
            }
            return;
        }
        this.field2772[arg0] = 12800;
        this.field2759[arg0] = 8192;
        this.field2760[arg0] = 16383;
        this.field2758[arg0] = 8192;
        this.field2765[arg0] = 0;
        this.field2766[arg0] = 8192;
        this.method3116(arg0);
        this.method3133(arg0);
        this.field2767[arg0] = 0;
        this.field2768[arg0] = 32767;
        this.field2769[arg0] = 256;
        this.field2770[arg0] = 0;
        this.method3118(arg0, 8192);
    }

    @ObfuscatedName("fq.ar(II)V")
    public void method3180(int arg0) {
        for (class170 var2 = (class170) this.field2781.field2797.method3293(); var2 != null; var2 = (class170) this.field2781.field2797.method3288()) {
            if ((arg0 < 0 || var2.field2815 == arg0) && var2.field2814 < 0) {
                this.field2755[var2.field2815][var2.field2800] = null;
                var2.field2814 = 0;
            }
        }
    }

    @ObfuscatedName("fq.al(I)V")
    public void method3115() {
        this.method3120(-1);
        this.method3113(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2762[var1] = this.field2764[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2761[var2] = this.field2764[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("fq.am(II)V")
    public void method3116(int arg0) {
        if ((this.field2767[arg0] & 0x2) == 0) {
            return;
        }
        for (class170 var2 = (class170) this.field2781.field2797.method3293(); var2 != null; var2 = (class170) this.field2781.field2797.method3288()) {
            if (var2.field2815 == arg0 && this.field2755[arg0][var2.field2800] == null && var2.field2814 < 0) {
                var2.field2814 = 0;
            }
        }
    }

    @ObfuscatedName("fq.as(II)V")
    public void method3133(int arg0) {
        if ((this.field2767[arg0] & 0x4) == 0) {
            return;
        }
        for (class170 var2 = (class170) this.field2781.field2797.method3293(); var2 != null; var2 = (class170) this.field2781.field2797.method3288()) {
            if (var2.field2815 == arg0) {
                var2.field2820 = 0;
            }
        }
    }

    @ObfuscatedName("fq.aq(IB)V")
    public void method3117(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3151(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3106(var6, var7, var8);
            } else {
                this.method3151(var6, var7, 64);
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
                this.field2761[var12] = (var14 << 14) + (this.field2761[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2761[var12] = (var14 << 7) + (this.field2761[var12] & 0xFFFFC07F);
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
                this.field2772[var12] = (var14 << 7) + (this.field2772[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2772[var12] = (this.field2772[var12] & 0xFFFFFF80) + var14;
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
                    this.method3116(var12);
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
                this.method3120(var12);
            }
            if (var13 == 121) {
                this.method3113(var12);
            }
            if (var13 == 123) {
                this.method3180(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2768[var12];
                if (var15 == 16384) {
                    this.field2769[var12] = (var14 << 7) + (this.field2769[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2768[var12];
                if (var16 == 16384) {
                    this.field2769[var12] = (this.field2769[var12] & 0xFFFFFF80) + var14;
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
                    this.method3133(var12);
                    this.field2767[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3118(var12, (var14 << 7) + (this.field2771[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3118(var12, (this.field2771[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3105(var17, this.field2761[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3110(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method3193(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3115();
            }
        }
    }

    @ObfuscatedName("fq.ac(III)V")
    public void method3118(int arg0, int arg1) {
        this.field2771[arg0] = arg1;
        this.field2774[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("fq.aj(Lfe;B)I")
    public int method3119(class170 arg0) {
        int var2 = (arg0.field2810 * arg0.field2803 >> 12) + arg0.field2811;
        int var3 = ((this.field2758[arg0.field2815] - 8192) * this.field2769[arg0.field2815] >> 12) + var2;
        class168 var4 = arg0.field2816;
        if (var4.field2790 > 0 && (var4.field2792 > 0 || this.field2765[arg0.field2815] > 0)) {
            int var5 = var4.field2792 << 2;
            int var6 = var4.field2791 << 1;
            if (arg0.field2802 < var6) {
                var5 = arg0.field2802 * var5 / var6;
            }
            int var7 = (this.field2765[arg0.field2815] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2817 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2805.field1133 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1092 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("fq.av(Lfe;B)I")
    public int method3167(class170 arg0) {
        class168 var2 = arg0.field2816;
        int var3 = this.field2772[arg0.field2815] * this.field2760[arg0.field2815] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2806 * var4 + 16384 >> 15;
        int var6 = this.field2756 * var5 + 128 >> 8;
        if (var2.field2786 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2807 * 1.953125E-5D * (double) var2.field2786) + 0.5D);
        }
        if (var2.field2793 != null) {
            int var7 = arg0.field2812;
            int var8 = var2.field2793[arg0.field2813 + 1];
            if (arg0.field2813 < var2.field2793.length - 2) {
                int var9 = (var2.field2793[arg0.field2813] & 0xFF) << 8;
                int var10 = (var2.field2793[arg0.field2813 + 2] & 0xFF) << 8;
                var8 += (var2.field2793[arg0.field2813 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2814 > 0 && var2.field2785 != null) {
            int var11 = arg0.field2814;
            int var12 = var2.field2785[arg0.field2818 + 1];
            if (arg0.field2818 < var2.field2785.length - 2) {
                int var13 = (var2.field2785[arg0.field2818] & 0xFF) << 8;
                int var14 = (var2.field2785[arg0.field2818 + 2] & 0xFF) << 8;
                var12 += (var2.field2785[arg0.field2818 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("fq.ax(Lfe;B)I")
    public int method3121(class170 arg0) {
        int var2 = this.field2759[arg0.field2815];
        return var2 < 8192 ? arg0.field2809 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2809) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("fq.p()Lbe;")
    public synchronized class61 method943() {
        return this.field2781;
    }

    @ObfuscatedName("fq.n()Lbe;")
    public synchronized class61 method944() {
        return null;
    }

    @ObfuscatedName("fq.o()I")
    public synchronized int method959() {
        return 0;
    }

    @ObfuscatedName("fq.g([III)V")
    public synchronized void method946(int[] arg0, int arg1, int arg2) {
        if (this.field2775.method3021()) {
            int var4 = this.field2776 * this.field2775.field2745 / Statics.field1092;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2778;
                if (this.field2780 - var5 >= 0L) {
                    this.field2778 = var5;
                    break;
                }
                int var7 = (int) ((this.field2780 - this.field2778 + (long) var4 - 1L) / (long) var4);
                this.field2778 += (long) var4 * (long) var7;
                this.field2781.method946(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3124();
            } while (this.field2775.method3021());
        }
        this.field2781.method946(arg0, arg1, arg2);
    }

    @ObfuscatedName("fq.t(I)V")
    public synchronized void method948(int arg0) {
        if (this.field2775.method3021()) {
            int var2 = this.field2776 * this.field2775.field2745 / Statics.field1092;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2778;
                if (this.field2780 - var3 >= 0L) {
                    this.field2778 = var3;
                    break;
                }
                int var5 = (int) ((this.field2780 - this.field2778 + (long) var2 - 1L) / (long) var2);
                this.field2778 += (long) var2 * (long) var5;
                this.field2781.method948(var5);
                arg0 -= var5;
                this.method3124();
            } while (this.field2775.method3021());
        }
        this.field2781.method948(arg0);
    }

    @ObfuscatedName("fq.ap(B)V")
    public void method3124() {
        int var1 = this.field2777;
        int var2 = this.field2779;
        long var3 = this.field2780;
        while (this.field2779 == var2) {
            while (this.field2775.field2736[var1] == var2) {
                this.field2775.method3023(var1);
                int var5 = this.field2775.method3027(var1);
                if (var5 == 1) {
                    this.field2775.method3025();
                    this.field2775.method3059(var1);
                    if (this.field2775.method3032()) {
                        if (!this.field2783 || var2 == 0) {
                            this.method3115();
                            this.field2775.method3020();
                            return;
                        }
                        this.field2775.method3033(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3117(var5);
                }
                this.field2775.method3031(var1);
                this.field2775.method3059(var1);
            }
            var1 = this.field2775.method3055();
            var2 = this.field2775.field2736[var1];
            var3 = this.field2775.method3030(var2);
        }
        this.field2777 = var1;
        this.field2779 = var2;
        this.field2780 = var3;
    }

    @ObfuscatedName("fq.af(Lfe;B)Z")
    public boolean method3108(class170 arg0) {
        if (arg0.field2808 != null) {
            return false;
        }
        if (arg0.field2814 >= 0) {
            arg0.method3392();
            if (arg0.field2804 > 0 && this.field2757[arg0.field2815][arg0.field2804] == arg0) {
                this.field2757[arg0.field2815][arg0.field2804] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("fq.az(Lfe;[IIII)Z")
    public boolean method3126(class170 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2819 = Statics.field1092 / 100;
        if (arg0.field2814 >= 0 && arg0.field2808 == null || arg0.field2808.method1096()) {
            arg0.method3202();
            arg0.method3392();
            if (arg0.field2804 > 0 && this.field2757[arg0.field2815][arg0.field2804] == arg0) {
                this.field2757[arg0.field2815][arg0.field2804] = null;
            }
            return true;
        }
        int var5 = arg0.field2810;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2766[arg0.field2815] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2810 = var6;
        }
        arg0.field2808.method1097(this.method3119(arg0));
        class168 var7 = arg0.field2816;
        boolean var8 = false;
        arg0.field2802++;
        arg0.field2817 += var7.field2790;
        double var9 = (double) ((arg0.field2800 - 60 << 8) + (arg0.field2810 * arg0.field2803 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2786 > 0) {
            if (var7.field2789 > 0) {
                arg0.field2807 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2789 * var9) + 0.5D);
            } else {
                arg0.field2807 += 128;
            }
        }
        if (var7.field2793 != null) {
            if (var7.field2787 > 0) {
                arg0.field2812 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2787 * var9) + 0.5D);
            } else {
                arg0.field2812 += 128;
            }
            while (arg0.field2813 < var7.field2793.length - 2 && arg0.field2812 > (var7.field2793[arg0.field2813 + 2] & 0xFF) << 8) {
                arg0.field2813 += 2;
            }
            if (arg0.field2813 == var7.field2793.length - 2 && var7.field2793[arg0.field2813 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2814 >= 0 && var7.field2785 != null && (this.field2767[arg0.field2815] & 0x1) == 0 && (arg0.field2804 < 0 || this.field2757[arg0.field2815][arg0.field2804] != arg0)) {
            if (var7.field2788 > 0) {
                arg0.field2814 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2788 * var9) + 0.5D);
            } else {
                arg0.field2814 += 128;
            }
            while (arg0.field2818 < var7.field2785.length - 2 && arg0.field2814 > (var7.field2785[arg0.field2818 + 2] & 0xFF) << 8) {
                arg0.field2818 += 2;
            }
            if (arg0.field2818 == var7.field2785.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2808.method1094(arg0.field2819, this.method3167(arg0), this.method3121(arg0));
            return false;
        }
        arg0.field2808.method1125(arg0.field2819);
        if (arg1 == null) {
            arg0.field2808.method948(arg3);
        } else {
            arg0.field2808.method946(arg1, arg2, arg3);
        }
        if (arg0.field2808.method1220()) {
            this.field2781.field2798.method955(arg0.field2808);
        }
        arg0.method3202();
        if (arg0.field2814 >= 0) {
            arg0.method3392();
            if (arg0.field2804 > 0 && this.field2757[arg0.field2815][arg0.field2804] == arg0) {
                this.field2757[arg0.field2815][arg0.field2804] = null;
            }
        }
        return true;
    }
}
