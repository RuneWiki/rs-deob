package deob;

@ObfuscatedName("fb")
public class class174 extends class62 {

    @ObfuscatedName("fb.q")
    public class186 field2813 = new class186(128);

    @ObfuscatedName("fb.s")
    public int field2819 = 256;

    @ObfuscatedName("fb.h")
    public int field2808 = 1000000;

    @ObfuscatedName("fb.e")
    public int[] field2802 = new int[16];

    @ObfuscatedName("fb.n")
    public int[] field2803 = new int[16];

    @ObfuscatedName("fb.t")
    public int[] field2817 = new int[16];

    @ObfuscatedName("fb.l")
    public int[] field2805 = new int[16];

    @ObfuscatedName("fb.m")
    public int[] field2827 = new int[16];

    @ObfuscatedName("fb.o")
    public int[] field2807 = new int[16];

    @ObfuscatedName("fb.k")
    public int[] field2816 = new int[16];

    @ObfuscatedName("fb.p")
    public int[] field2799 = new int[16];

    @ObfuscatedName("fb.u")
    public int[] field2810 = new int[16];

    @ObfuscatedName("fb.w")
    public int[] field2811 = new int[16];

    @ObfuscatedName("fb.z")
    public int[] field2814 = new int[16];

    @ObfuscatedName("fb.x")
    public int[] field2815 = new int[16];

    @ObfuscatedName("fb.v")
    public int[] field2800 = new int[16];

    @ObfuscatedName("fb.i")
    public int[] field2809 = new int[16];

    @ObfuscatedName("fb.c")
    public int[] field2818 = new int[16];

    @ObfuscatedName("fb.r")
    public class177[][] field2806 = new class177[16][128];

    @ObfuscatedName("fb.an")
    public class177[][] field2820 = new class177[16][128];

    @ObfuscatedName("fb.ad")
    public class172 field2825 = new class172();

    @ObfuscatedName("fb.ai")
    public boolean field2822;

    @ObfuscatedName("fb.ae")
    public int field2821;

    @ObfuscatedName("fb.aq")
    public int field2824;

    @ObfuscatedName("fb.av")
    public long field2801;

    @ObfuscatedName("fb.am")
    public long field2826;

    @ObfuscatedName("fb.ac")
    public class176 field2823 = new class176(this);

    public class174() {
        this.method3143();
    }

    @ObfuscatedName("fb.q(IB)V")
    public synchronized void method3126(int arg0) {
        this.field2819 = arg0;
    }

    @ObfuscatedName("fb.s(I)I")
    public int method3127() {
        return this.field2819;
    }

    @ObfuscatedName("fb.h(Lfm;Lff;Lbb;IB)Z")
    public synchronized boolean method3156(class170 arg0, class158 arg1, class55 arg2, int arg3) {
        arg0.method3041();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class187 var7 = (class187) arg0.field2765.method3276(); var7 != null; var7 = (class187) arg0.field2765.method3277()) {
            int var8 = (int) var7.field2958;
            class171 var9 = (class171) this.field2813.method3273((long) var8);
            if (var9 == null) {
                var9 = class171.method2477(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field2813.method3274(var9, (long) var8);
            }
            if (!var9.method3055(arg2, var7.field2937, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3042();
        }
        return var5;
    }

    @ObfuscatedName("fb.e(I)V")
    public synchronized void method3128() {
        for (class171 var1 = (class171) this.field2813.method3276(); var1 != null; var1 = (class171) this.field2813.method3277()) {
            var1.method3056();
        }
    }

    @ObfuscatedName("fb.n(I)V")
    public synchronized void method3157() {
        for (class171 var1 = (class171) this.field2813.method3276(); var1 != null; var1 = (class171) this.field2813.method3277()) {
            var1.method3404();
        }
    }

    @ObfuscatedName("fb.k(Lfm;ZI)V")
    public synchronized void method3130(class170 arg0, boolean arg1) {
        this.method3131();
        this.field2825.method3064(arg0.field2766);
        this.field2822 = arg1;
        this.field2801 = 0L;
        int var3 = this.field2825.method3067();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2825.method3068(var4);
            this.field2825.method3070(var4);
            this.field2825.method3069(var4);
        }
        this.field2821 = this.field2825.method3075();
        this.field2824 = this.field2825.field2782[this.field2821];
        this.field2826 = this.field2825.method3074(this.field2824);
    }

    @ObfuscatedName("fb.u(I)V")
    public synchronized void method3131() {
        this.field2825.method3095();
        this.method3143();
    }

    @ObfuscatedName("fb.g(I)Z")
    public synchronized boolean method3132() {
        return this.field2825.method3101();
    }

    @ObfuscatedName("fb.a(IIB)V")
    public synchronized void method3133(int arg0, int arg1) {
        this.method3134(arg0, arg1);
    }

    @ObfuscatedName("fb.y(III)V")
    public void method3134(int arg0, int arg1) {
        this.field2805[arg0] = arg1;
        this.field2807[arg0] = arg1 & 0xFFFFFF80;
        this.method3207(arg0, arg1);
    }

    @ObfuscatedName("fb.d(III)V")
    public void method3207(int arg0, int arg1) {
        if (this.field2827[arg0] != arg1) {
            this.field2827[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2820[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("fb.b(IIII)V")
    public void method3135(int arg0, int arg1, int arg2) {
        this.method3137(arg0, arg1, 64);
        if ((this.field2811[arg0] & 0x2) != 0) {
            for (class177 var4 = (class177) this.field2823.field2845.method3314(); var4 != null; var4 = (class177) this.field2823.field2845.method3318()) {
                if (var4.field2864 == arg0 && var4.field2863 < 0) {
                    this.field2806[arg0][var4.field2861] = null;
                    this.field2806[arg0][arg1] = var4;
                    int var5 = (var4.field2857 * var4.field2850 >> 12) + var4.field2858;
                    var4.field2858 += arg1 - var4.field2861 << 8;
                    var4.field2850 = var5 - var4.field2858;
                    var4.field2857 = 4096;
                    var4.field2861 = arg1;
                    return;
                }
            }
        }
        class171 var6 = (class171) this.field2813.method3273((long) this.field2827[arg0]);
        if (var6 == null) {
            return;
        }
        class58 var7 = var6.field2768[arg1];
        if (var7 == null) {
            return;
        }
        class177 var8 = new class177();
        var8.field2864 = arg0;
        var8.field2851 = var6;
        var8.field2856 = var7;
        var8.field2853 = var6.field2773[arg1];
        var8.field2854 = var6.field2771[arg1];
        var8.field2861 = arg1;
        var8.field2860 = var6.field2770 * arg2 * arg2 * var6.field2775[arg1] + 1024 >> 11;
        var8.field2872 = var6.field2772[arg1] & 0xFF;
        var8.field2858 = (arg1 << 8) - (var6.field2769[arg1] & 0x7FFF);
        var8.field2852 = 0;
        var8.field2862 = 0;
        var8.field2855 = 0;
        var8.field2863 = -1;
        var8.field2865 = 0;
        if (this.field2800[arg0] == 0) {
            var8.field2868 = class60.method1238(var7, this.method3148(var8), this.method3149(var8), this.method3198(var8));
        } else {
            var8.field2868 = class60.method1238(var7, this.method3148(var8), 0, this.method3198(var8));
            this.method3136(var8, var6.field2769[arg1] < 0);
        }
        if (var6.field2769[arg1] < 0) {
            var8.field2868.method1192(-1);
        }
        if (var8.field2854 >= 0) {
            class177 var9 = this.field2820[arg0][var8.field2854];
            if (var9 != null && var9.field2863 < 0) {
                this.field2806[arg0][var9.field2861] = null;
                var9.field2863 = 0;
            }
            this.field2820[arg0][var8.field2854] = var8;
        }
        this.field2823.field2845.method3327(var8);
        this.field2806[arg0][arg1] = var8;
    }

    @ObfuscatedName("fb.j(Lfr;ZI)V")
    public void method3136(class177 arg0, boolean arg1) {
        int var3 = arg0.field2856.field1131.length;
        int var5;
        if (arg1 && arg0.field2856.field1132) {
            int var4 = var3 + var3 - arg0.field2856.field1133;
            var5 = (int) ((long) this.field2800[arg0.field2864] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2868.method1115(true);
            }
        } else {
            var5 = (int) ((long) this.field2800[arg0.field2864] * (long) var3 >> 6);
        }
        arg0.field2868.method1114(var5);
    }

    @ObfuscatedName("fb.f(IIII)V")
    public void method3137(int arg0, int arg1, int arg2) {
        class177 var4 = this.field2806[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2806[arg0][arg1] = null;
        if ((this.field2811[arg0] & 0x2) == 0) {
            var4.field2863 = 0;
            return;
        }
        for (class177 var5 = (class177) this.field2823.field2845.method3309(); var5 != null; var5 = (class177) this.field2823.field2845.method3311()) {
            if (var4.field2864 == var5.field2864 && var5.field2863 < 0 && var4 != var5) {
                var4.field2863 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("fb.w(IIII)V")
    public void method3203(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("fb.z(III)V")
    public void method3139(int arg0, int arg1) {
    }

    @ObfuscatedName("fb.x(III)V")
    public void method3140(int arg0, int arg1) {
        this.field2816[arg0] = arg1;
    }

    @ObfuscatedName("fb.v(II)V")
    public void method3141(int arg0) {
        for (class177 var2 = (class177) this.field2823.field2845.method3309(); var2 != null; var2 = (class177) this.field2823.field2845.method3311()) {
            if (arg0 < 0 || var2.field2864 == arg0) {
                if (var2.field2868 != null) {
                    var2.field2868.method1222(Statics.field3011 / 100);
                    if (var2.field2868.method1122()) {
                        this.field2823.field2846.method990(var2.field2868);
                    }
                    var2.method3232();
                }
                if (var2.field2863 < 0) {
                    this.field2806[var2.field2864][var2.field2861] = null;
                }
                var2.method3404();
            }
        }
    }

    @ObfuscatedName("fb.i(II)V")
    public void method3176(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3176(var2);
            }
            return;
        }
        this.field2802[arg0] = 12800;
        this.field2803[arg0] = 8192;
        this.field2817[arg0] = 16383;
        this.field2816[arg0] = 8192;
        this.field2799[arg0] = 0;
        this.field2810[arg0] = 8192;
        this.method3144(arg0);
        this.method3145(arg0);
        this.field2811[arg0] = 0;
        this.field2814[arg0] = 32767;
        this.field2815[arg0] = 256;
        this.field2800[arg0] = 0;
        this.method3152(arg0, 8192);
    }

    @ObfuscatedName("fb.av(II)V")
    public void method3142(int arg0) {
        for (class177 var2 = (class177) this.field2823.field2845.method3309(); var2 != null; var2 = (class177) this.field2823.field2845.method3311()) {
            if ((arg0 < 0 || var2.field2864 == arg0) && var2.field2863 < 0) {
                this.field2806[var2.field2864][var2.field2861] = null;
                var2.field2863 = 0;
            }
        }
    }

    @ObfuscatedName("fb.am(I)V")
    public void method3143() {
        this.method3141(-1);
        this.method3176(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2827[var1] = this.field2805[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2807[var2] = this.field2805[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("fb.ac(IB)V")
    public void method3144(int arg0) {
        if ((this.field2811[arg0] & 0x2) == 0) {
            return;
        }
        for (class177 var2 = (class177) this.field2823.field2845.method3309(); var2 != null; var2 = (class177) this.field2823.field2845.method3311()) {
            if (var2.field2864 == arg0 && this.field2806[arg0][var2.field2861] == null && var2.field2863 < 0) {
                var2.field2863 = 0;
            }
        }
    }

    @ObfuscatedName("fb.ak(II)V")
    public void method3145(int arg0) {
        if ((this.field2811[arg0] & 0x4) == 0) {
            return;
        }
        for (class177 var2 = (class177) this.field2823.field2845.method3309(); var2 != null; var2 = (class177) this.field2823.field2845.method3311()) {
            if (var2.field2864 == arg0) {
                var2.field2870 = 0;
            }
        }
    }

    @ObfuscatedName("fb.aa(II)V")
    public void method3146(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3137(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3135(var6, var7, var8);
            } else {
                this.method3137(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3203(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2807[var12] = (var14 << 14) + (this.field2807[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2807[var12] = (var14 << 7) + (this.field2807[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2799[var12] = (var14 << 7) + (this.field2799[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2799[var12] = (this.field2799[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2810[var12] = (var14 << 7) + (this.field2810[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2810[var12] = (this.field2810[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2802[var12] = (var14 << 7) + (this.field2802[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2802[var12] = (this.field2802[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2803[var12] = (var14 << 7) + (this.field2803[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2803[var12] = (this.field2803[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2817[var12] = (var14 << 7) + (this.field2817[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2817[var12] = (this.field2817[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2811[var12] |= 0x1;
                } else {
                    this.field2811[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2811[var12] |= 0x2;
                } else {
                    this.method3144(var12);
                    this.field2811[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2814[var12] = (var14 << 7) + (this.field2814[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2814[var12] = (this.field2814[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2814[var12] = (var14 << 7) + (this.field2814[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2814[var12] = (this.field2814[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3141(var12);
            }
            if (var13 == 121) {
                this.method3176(var12);
            }
            if (var13 == 123) {
                this.method3142(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2814[var12];
                if (var15 == 16384) {
                    this.field2815[var12] = (var14 << 7) + (this.field2815[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2814[var12];
                if (var16 == 16384) {
                    this.field2815[var12] = (this.field2815[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2800[var12] = (var14 << 7) + (this.field2800[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2800[var12] = (this.field2800[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2811[var12] |= 0x4;
                } else {
                    this.method3145(var12);
                    this.field2811[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3152(var12, (var14 << 7) + (this.field2809[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3152(var12, (this.field2809[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3207(var17, this.field2807[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3139(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method3140(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3143();
            }
        }
    }

    @ObfuscatedName("fb.af(III)V")
    public void method3152(int arg0, int arg1) {
        this.field2809[arg0] = arg1;
        this.field2818[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("fb.as(Lfr;I)I")
    public int method3148(class177 arg0) {
        int var2 = (arg0.field2857 * arg0.field2850 >> 12) + arg0.field2858;
        int var3 = ((this.field2816[arg0.field2864] - 8192) * this.field2815[arg0.field2864] >> 12) + var2;
        class175 var4 = arg0.field2853;
        if (var4.field2843 > 0 && (var4.field2835 > 0 || this.field2799[arg0.field2864] > 0)) {
            int var5 = var4.field2835 << 2;
            int var6 = var4.field2837 << 1;
            if (arg0.field2866 < var6) {
                var5 = arg0.field2866 * var5 / var6;
            }
            int var7 = (this.field2799[arg0.field2864] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2867 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2856.field1135 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field3011 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("fb.ab(Lfr;B)I")
    public int method3149(class177 arg0) {
        class175 var2 = arg0.field2853;
        int var3 = this.field2802[arg0.field2864] * this.field2817[arg0.field2864] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2860 * var4 + 16384 >> 15;
        int var6 = this.field2819 * var5 + 128 >> 8;
        if (var2.field2831 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2852 * 1.953125E-5D * (double) var2.field2831) + 0.5D);
        }
        if (var2.field2829 != null) {
            int var7 = arg0.field2862;
            int var8 = var2.field2829[arg0.field2855 + 1];
            if (arg0.field2855 < var2.field2829.length - 2) {
                int var9 = (var2.field2829[arg0.field2855] & 0xFF) << 8;
                int var10 = (var2.field2829[arg0.field2855 + 2] & 0xFF) << 8;
                var8 += (var2.field2829[arg0.field2855 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2863 > 0 && var2.field2836 != null) {
            int var11 = arg0.field2863;
            int var12 = var2.field2836[arg0.field2865 + 1];
            if (arg0.field2865 < var2.field2836.length - 2) {
                int var13 = (var2.field2836[arg0.field2865] & 0xFF) << 8;
                int var14 = (var2.field2836[arg0.field2865 + 2] & 0xFF) << 8;
                var12 += (var2.field2836[arg0.field2865 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("fb.ay(Lfr;I)I")
    public int method3198(class177 arg0) {
        int var2 = this.field2803[arg0.field2864];
        return var2 < 8192 ? arg0.field2872 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2872) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("fb.t()Lba;")
    public synchronized class62 method984() {
        return this.field2823;
    }

    @ObfuscatedName("fb.l()Lba;")
    public synchronized class62 method971() {
        return null;
    }

    @ObfuscatedName("fb.m()I")
    public synchronized int method997() {
        return 0;
    }

    @ObfuscatedName("fb.o([III)V")
    public synchronized void method973(int[] arg0, int arg1, int arg2) {
        if (this.field2825.method3101()) {
            int var4 = this.field2808 * this.field2825.field2785 / Statics.field3011;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2801;
                if (this.field2826 - var5 >= 0L) {
                    this.field2801 = var5;
                    break;
                }
                int var7 = (int) ((this.field2826 - this.field2801 + (long) var4 - 1L) / (long) var4);
                this.field2801 += (long) var4 * (long) var7;
                this.field2823.method973(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3174();
            } while (this.field2825.method3101());
        }
        this.field2823.method973(arg0, arg1, arg2);
    }

    @ObfuscatedName("fb.p(I)V")
    public synchronized void method975(int arg0) {
        if (this.field2825.method3101()) {
            int var2 = this.field2808 * this.field2825.field2785 / Statics.field3011;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2801;
                if (this.field2826 - var3 >= 0L) {
                    this.field2801 = var3;
                    break;
                }
                int var5 = (int) ((this.field2826 - this.field2801 + (long) var2 - 1L) / (long) var2);
                this.field2801 += (long) var2 * (long) var5;
                this.field2823.method975(var5);
                arg0 -= var5;
                this.method3174();
            } while (this.field2825.method3101());
        }
        this.field2823.method975(arg0);
    }

    @ObfuscatedName("fb.ax(I)V")
    public void method3174() {
        int var1 = this.field2821;
        int var2 = this.field2824;
        long var3 = this.field2826;
        while (this.field2824 == var2) {
            while (this.field2825.field2782[var1] == var2) {
                this.field2825.method3068(var1);
                int var5 = this.field2825.method3065(var1);
                if (var5 == 1) {
                    this.field2825.method3073();
                    this.field2825.method3069(var1);
                    if (this.field2825.method3076()) {
                        if (!this.field2822 || var2 == 0) {
                            this.method3143();
                            this.field2825.method3095();
                            return;
                        }
                        this.field2825.method3077(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3146(var5);
                }
                this.field2825.method3070(var1);
                this.field2825.method3069(var1);
            }
            var1 = this.field2825.method3075();
            var2 = this.field2825.field2782[var1];
            var3 = this.field2825.method3074(var2);
        }
        this.field2821 = var1;
        this.field2824 = var2;
        this.field2826 = var3;
    }

    @ObfuscatedName("fb.au(Lfr;I)Z")
    public boolean method3215(class177 arg0) {
        if (arg0.field2868 != null) {
            return false;
        }
        if (arg0.field2863 >= 0) {
            arg0.method3404();
            if (arg0.field2854 > 0 && this.field2820[arg0.field2864][arg0.field2854] == arg0) {
                this.field2820[arg0.field2864][arg0.field2854] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("fb.ap(Lfr;[IIII)Z")
    public boolean method3154(class177 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2869 = Statics.field3011 / 100;
        if (arg0.field2863 >= 0 && arg0.field2868 == null || arg0.field2868.method1121()) {
            arg0.method3232();
            arg0.method3404();
            if (arg0.field2854 > 0 && this.field2820[arg0.field2864][arg0.field2854] == arg0) {
                this.field2820[arg0.field2864][arg0.field2854] = null;
            }
            return true;
        }
        int var5 = arg0.field2857;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2810[arg0.field2864] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2857 = var6;
        }
        arg0.field2868.method1119(this.method3148(arg0));
        class175 var7 = arg0.field2853;
        boolean var8 = false;
        arg0.field2866++;
        arg0.field2867 += var7.field2843;
        double var9 = (double) ((arg0.field2861 - 60 << 8) + (arg0.field2857 * arg0.field2850 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2831 > 0) {
            if (var7.field2834 > 0) {
                arg0.field2852 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2834 * var9) + 0.5D);
            } else {
                arg0.field2852 += 128;
            }
        }
        if (var7.field2829 != null) {
            if (var7.field2832 > 0) {
                arg0.field2862 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2832 * var9) + 0.5D);
            } else {
                arg0.field2862 += 128;
            }
            while (arg0.field2855 < var7.field2829.length - 2 && arg0.field2862 > (var7.field2829[arg0.field2855 + 2] & 0xFF) << 8) {
                arg0.field2855 += 2;
            }
            if (arg0.field2855 == var7.field2829.length - 2 && var7.field2829[arg0.field2855 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2863 >= 0 && var7.field2836 != null && (this.field2811[arg0.field2864] & 0x1) == 0 && (arg0.field2854 < 0 || this.field2820[arg0.field2864][arg0.field2854] != arg0)) {
            if (var7.field2833 > 0) {
                arg0.field2863 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2833 * var9) + 0.5D);
            } else {
                arg0.field2863 += 128;
            }
            while (arg0.field2865 < var7.field2836.length - 2 && arg0.field2863 > (var7.field2836[arg0.field2865 + 2] & 0xFF) << 8) {
                arg0.field2865 += 2;
            }
            if (arg0.field2865 == var7.field2836.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2868.method1118(arg0.field2869, this.method3149(arg0), this.method3198(arg0));
            return false;
        }
        arg0.field2868.method1222(arg0.field2869);
        if (arg1 == null) {
            arg0.field2868.method975(arg3);
        } else {
            arg0.field2868.method973(arg1, arg2, arg3);
        }
        if (arg0.field2868.method1122()) {
            this.field2823.field2846.method990(arg0.field2868);
        }
        arg0.method3232();
        if (arg0.field2863 >= 0) {
            arg0.method3404();
            if (arg0.field2854 > 0 && this.field2820[arg0.field2864][arg0.field2854] == arg0) {
                this.field2820[arg0.field2864][arg0.field2854] = null;
            }
        }
        return true;
    }
}
