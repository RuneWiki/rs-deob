package deob;

@ObfuscatedName("ie")
public class class235 extends class59 {

    @ObfuscatedName("ie.f")
    public class363 field2861 = new class363(128);

    @ObfuscatedName("ie.e")
    public int field2841 = 256;

    @ObfuscatedName("ie.v")
    public int field2842 = 1000000;

    @ObfuscatedName("ie.y")
    public int[] field2843 = new int[16];

    @ObfuscatedName("ie.j")
    public int[] field2847 = new int[16];

    @ObfuscatedName("ie.o")
    public int[] field2862 = new int[16];

    @ObfuscatedName("ie.m")
    public int[] field2848 = new int[16];

    @ObfuscatedName("ie.r")
    public int[] field2846 = new int[16];

    @ObfuscatedName("ie.h")
    public int[] field2845 = new int[16];

    @ObfuscatedName("ie.d")
    public int[] field2849 = new int[16];

    @ObfuscatedName("ie.z")
    public int[] field2850 = new int[16];

    @ObfuscatedName("ie.b")
    public int[] field2854 = new int[16];

    @ObfuscatedName("ie.s")
    public int[] field2852 = new int[16];

    @ObfuscatedName("ie.p")
    public int[] field2853 = new int[16];

    @ObfuscatedName("ie.c")
    public int[] field2851 = new int[16];

    @ObfuscatedName("ie.n")
    public int[] field2855 = new int[16];

    @ObfuscatedName("ie.l")
    public int[] field2856 = new int[16];

    @ObfuscatedName("ie.w")
    public int[] field2857 = new int[16];

    @ObfuscatedName("ie.a")
    public class240[][] field2858 = new class240[16][128];

    @ObfuscatedName("ie.aw")
    public class240[][] field2859 = new class240[16][128];

    @ObfuscatedName("ie.ak")
    public class236 field2860 = new class236();

    @ObfuscatedName("ie.ad")
    public boolean field2840;

    @ObfuscatedName("ie.at")
    public int field2844;

    @ObfuscatedName("ie.ah")
    public int field2863;

    @ObfuscatedName("ie.az")
    public long field2864;

    @ObfuscatedName("ie.ap")
    public long field2865;

    @ObfuscatedName("ie.ag")
    public class238 field2866 = new class238(this);

    public class235() {
        this.method4084();
    }

    @ObfuscatedName("ie.f(IB)V")
    public synchronized void method4064(int arg0) {
        this.field2841 = arg0;
    }

    @ObfuscatedName("ie.e(B)I")
    public int method4150() {
        return this.field2841;
    }

    @ObfuscatedName("ie.v(Lio;Ljp;Lbz;II)Z")
    public synchronized boolean method4066(class239 arg0, class276 arg1, class56 arg2, int arg3) {
        arg0.method4240();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class350 var7 = (class350) arg0.field2894.method5693(); var7 != null; var7 = (class350) arg0.field2894.method5694()) {
            int var8 = (int) var7.field3937;
            class237 var9 = (class237) this.field2861.method5691((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method4511(var8);
                class237 var11;
                if (var10 == null) {
                    var11 = null;
                } else {
                    var11 = new class237(var10);
                }
                var9 = var11;
                if (var11 == null) {
                    var5 = false;
                    continue;
                }
                this.field2861.method5692(var11, (long) var8);
            }
            if (!var9.method4220(arg2, var7.field3932, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method4234();
        }
        return var5;
    }

    @ObfuscatedName("ie.y(I)V")
    public synchronized void method4097() {
        for (class237 var1 = (class237) this.field2861.method5693(); var1 != null; var1 = (class237) this.field2861.method5694()) {
            var1.method4221();
        }
    }

    @ObfuscatedName("ie.j(I)V")
    public synchronized void method4068() {
        for (class237 var1 = (class237) this.field2861.method5693(); var1 != null; var1 = (class237) this.field2861.method5694()) {
            var1.method5407();
        }
    }

    @ObfuscatedName("ie.d(Lio;ZI)V")
    public synchronized void method4165(class239 arg0, boolean arg1) {
        this.method4070();
        this.field2860.method4216(arg0.field2893);
        this.field2840 = arg1;
        this.field2864 = 0L;
        int var3 = this.field2860.method4170();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2860.method4171(var4);
            this.field2860.method4174(var4);
            this.field2860.method4218(var4);
        }
        this.field2844 = this.field2860.method4179();
        this.field2863 = this.field2860.field2874[this.field2844];
        this.field2865 = this.field2860.method4199(this.field2863);
    }

    @ObfuscatedName("ie.b(B)V")
    public synchronized void method4070() {
        this.field2860.method4168();
        this.method4084();
    }

    @ObfuscatedName("ie.i(I)Z")
    public synchronized boolean method4100() {
        return this.field2860.method4169();
    }

    @ObfuscatedName("ie.k(IIB)V")
    public synchronized void method4072(int arg0, int arg1) {
        this.method4073(arg0, arg1);
    }

    @ObfuscatedName("ie.g(IIB)V")
    public void method4073(int arg0, int arg1) {
        this.field2848[arg0] = arg1;
        this.field2845[arg0] = arg1 & 0xFFFFFF80;
        this.method4083(arg0, arg1);
    }

    @ObfuscatedName("ie.t(III)V")
    public void method4083(int arg0, int arg1) {
        if (this.field2846[arg0] != arg1) {
            this.field2846[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2859[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("ie.x(IIII)V")
    public void method4075(int arg0, int arg1, int arg2) {
        this.method4156(arg0, arg1, 64);
        if ((this.field2852[arg0] & 0x2) != 0) {
            for (class240 var4 = (class240) this.field2866.field2890.method4725(); var4 != null; var4 = (class240) this.field2866.field2890.method4717()) {
                if (var4.field2899 == arg0 && var4.field2904 < 0) {
                    this.field2858[arg0][var4.field2911] = null;
                    this.field2858[arg0][arg1] = var4;
                    int var5 = (var4.field2915 * var4.field2902 >> 12) + var4.field2908;
                    var4.field2908 += arg1 - var4.field2911 << 8;
                    var4.field2902 = var5 - var4.field2908;
                    var4.field2915 = 4096;
                    var4.field2911 = arg1;
                    return;
                }
            }
        }
        class237 var6 = (class237) this.field2861.method5691((long) this.field2846[arg0]);
        if (var6 == null) {
            return;
        }
        class51 var7 = var6.field2882[arg1];
        if (var7 == null) {
            return;
        }
        class240 var8 = new class240();
        var8.field2899 = arg0;
        var8.field2896 = var6;
        var8.field2897 = var7;
        var8.field2905 = var6.field2885[arg1];
        var8.field2898 = var6.field2887[arg1];
        var8.field2911 = arg1;
        var8.field2901 = var6.field2886 * arg2 * arg2 * var6.field2884[arg1] + 1024 >> 11;
        var8.field2903 = var6.field2881[arg1] & 0xFF;
        var8.field2908 = (arg1 << 8) - (var6.field2883[arg1] & 0x7FFF);
        var8.field2895 = 0;
        var8.field2907 = 0;
        var8.field2906 = 0;
        var8.field2904 = -1;
        var8.field2910 = 0;
        if (this.field2855[arg0] == 0) {
            var8.field2913 = class58.method753(var7, this.method4122(var8), this.method4088(var8), this.method4140(var8));
        } else {
            var8.field2913 = class58.method753(var7, this.method4122(var8), 0, this.method4140(var8));
            this.method4076(var8, var6.field2883[arg1] < 0);
        }
        if (var6.field2883[arg1] < 0) {
            var8.field2913.method875(-1);
        }
        if (var8.field2898 >= 0) {
            class240 var9 = this.field2859[arg0][var8.field2898];
            if (var9 != null && var9.field2904 < 0) {
                this.field2858[arg0][var9.field2911] = null;
                var9.field2904 = 0;
            }
            this.field2859[arg0][var8.field2898] = var8;
        }
        this.field2866.field2890.method4716(var8);
        this.field2858[arg0][arg1] = var8;
    }

    @ObfuscatedName("ie.u(Lib;ZI)V")
    public void method4076(class240 arg0, boolean arg1) {
        int var3 = arg0.field2897.field380.length;
        int var5;
        if (arg1 && arg0.field2897.field381) {
            int var4 = var3 + var3 - arg0.field2897.field382;
            var5 = (int) ((long) this.field2855[arg0.field2899] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2913.method756(true);
            }
        } else {
            var5 = (int) ((long) this.field2855[arg0.field2899] * (long) var3 >> 6);
        }
        arg0.field2913.method765(var5);
    }

    @ObfuscatedName("ie.q(IIII)V")
    public void method4156(int arg0, int arg1, int arg2) {
        class240 var4 = this.field2858[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2858[arg0][arg1] = null;
        if ((this.field2852[arg0] & 0x2) == 0) {
            var4.field2904 = 0;
            return;
        }
        for (class240 var5 = (class240) this.field2866.field2890.method4721(); var5 != null; var5 = (class240) this.field2866.field2890.method4723()) {
            if (var4.field2899 == var5.field2899 && var5.field2904 < 0 && var4 != var5) {
                var4.field2904 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("ie.s(IIII)V")
    public void method4078(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("ie.p(III)V")
    public void method4077(int arg0, int arg1) {
    }

    @ObfuscatedName("ie.c(III)V")
    public void method4080(int arg0, int arg1) {
        this.field2849[arg0] = arg1;
    }

    @ObfuscatedName("ie.n(II)V")
    public void method4081(int arg0) {
        for (class240 var2 = (class240) this.field2866.field2890.method4721(); var2 != null; var2 = (class240) this.field2866.field2890.method4723()) {
            if (arg0 < 0 || var2.field2899 == arg0) {
                if (var2.field2913 != null) {
                    var2.field2913.method770(Statics.field3922 / 100);
                    if (var2.field2913.method774()) {
                        this.field2866.field2889.method619(var2.field2913);
                    }
                    var2.method4241();
                }
                if (var2.field2904 < 0) {
                    this.field2858[var2.field2899][var2.field2911] = null;
                }
                var2.method5407();
            }
        }
    }

    @ObfuscatedName("ie.l(II)V")
    public void method4082(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method4082(var2);
            }
            return;
        }
        this.field2843[arg0] = 12800;
        this.field2847[arg0] = 8192;
        this.field2862[arg0] = 16383;
        this.field2849[arg0] = 8192;
        this.field2850[arg0] = 0;
        this.field2854[arg0] = 8192;
        this.method4139(arg0);
        this.method4109(arg0);
        this.field2852[arg0] = 0;
        this.field2853[arg0] = 32767;
        this.field2851[arg0] = 256;
        this.field2855[arg0] = 0;
        this.method4087(arg0, 8192);
    }

    @ObfuscatedName("ie.w(II)V")
    public void method4134(int arg0) {
        for (class240 var2 = (class240) this.field2866.field2890.method4721(); var2 != null; var2 = (class240) this.field2866.field2890.method4723()) {
            if ((arg0 < 0 || var2.field2899 == arg0) && var2.field2904 < 0) {
                this.field2858[var2.field2899][var2.field2911] = null;
                var2.field2904 = 0;
            }
        }
    }

    @ObfuscatedName("ie.ae(I)V")
    public void method4084() {
        this.method4081(-1);
        this.method4082(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2846[var1] = this.field2848[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2845[var2] = this.field2848[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("ie.ac(II)V")
    public void method4139(int arg0) {
        if ((this.field2852[arg0] & 0x2) == 0) {
            return;
        }
        for (class240 var2 = (class240) this.field2866.field2890.method4721(); var2 != null; var2 = (class240) this.field2866.field2890.method4723()) {
            if (var2.field2899 == arg0 && this.field2858[arg0][var2.field2911] == null && var2.field2904 < 0) {
                var2.field2904 = 0;
            }
        }
    }

    @ObfuscatedName("ie.as(II)V")
    public void method4109(int arg0) {
        if ((this.field2852[arg0] & 0x4) == 0) {
            return;
        }
        for (class240 var2 = (class240) this.field2866.field2890.method4721(); var2 != null; var2 = (class240) this.field2866.field2890.method4723()) {
            if (var2.field2899 == arg0) {
                var2.field2900 = 0;
            }
        }
    }

    @ObfuscatedName("ie.au(II)V")
    public void method4086(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method4156(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method4075(var6, var7, var8);
            } else {
                this.method4156(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method4078(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2845[var12] = (var14 << 14) + (this.field2845[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2845[var12] = (var14 << 7) + (this.field2845[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2850[var12] = (var14 << 7) + (this.field2850[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2850[var12] = (this.field2850[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2854[var12] = (var14 << 7) + (this.field2854[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2854[var12] = (this.field2854[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2843[var12] = (var14 << 7) + (this.field2843[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2843[var12] = (this.field2843[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2847[var12] = (var14 << 7) + (this.field2847[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2847[var12] = (this.field2847[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2862[var12] = (var14 << 7) + (this.field2862[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2862[var12] = (this.field2862[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2852[var12] |= 0x1;
                } else {
                    this.field2852[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2852[var12] |= 0x2;
                } else {
                    this.method4139(var12);
                    this.field2852[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2853[var12] = (var14 << 7) + (this.field2853[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2853[var12] = (this.field2853[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2853[var12] = (var14 << 7) + (this.field2853[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2853[var12] = (this.field2853[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method4081(var12);
            }
            if (var13 == 121) {
                this.method4082(var12);
            }
            if (var13 == 123) {
                this.method4134(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2853[var12];
                if (var15 == 16384) {
                    this.field2851[var12] = (var14 << 7) + (this.field2851[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2853[var12];
                if (var16 == 16384) {
                    this.field2851[var12] = (this.field2851[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2855[var12] = (var14 << 7) + (this.field2855[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2855[var12] = (this.field2855[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2852[var12] |= 0x4;
                } else {
                    this.method4109(var12);
                    this.field2852[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method4087(var12, (var14 << 7) + (this.field2856[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method4087(var12, (this.field2856[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method4083(var17, this.field2845[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method4077(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method4080(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method4084();
            }
        }
    }

    @ObfuscatedName("ie.am(III)V")
    public void method4087(int arg0, int arg1) {
        this.field2856[arg0] = arg1;
        this.field2857[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("ie.aa(Lib;I)I")
    public int method4122(class240 arg0) {
        int var2 = (arg0.field2915 * arg0.field2902 >> 12) + arg0.field2908;
        int var3 = ((this.field2849[arg0.field2899] - 8192) * this.field2851[arg0.field2899] >> 12) + var2;
        class233 var4 = arg0.field2905;
        if (var4.field2828 > 0 && (var4.field2827 > 0 || this.field2850[arg0.field2899] > 0)) {
            int var5 = var4.field2827 << 2;
            int var6 = var4.field2830 << 1;
            if (arg0.field2909 < var6) {
                var5 = arg0.field2909 * var5 / var6;
            }
            int var7 = (this.field2850[arg0.field2899] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2912 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2897.field383 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field3922 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("ie.ai(Lib;I)I")
    public int method4088(class240 arg0) {
        class233 var2 = arg0.field2905;
        int var3 = this.field2843[arg0.field2899] * this.field2862[arg0.field2899] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2901 * var4 + 16384 >> 15;
        int var6 = this.field2841 * var5 + 128 >> 8;
        if (var2.field2824 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2895 * 1.953125E-5D * (double) var2.field2824) + 0.5D);
        }
        if (var2.field2822 != null) {
            int var7 = arg0.field2907;
            int var8 = var2.field2822[arg0.field2906 + 1];
            if (arg0.field2906 < var2.field2822.length - 2) {
                int var9 = (var2.field2822[arg0.field2906] & 0xFF) << 8;
                int var10 = (var2.field2822[arg0.field2906 + 2] & 0xFF) << 8;
                var8 += (var2.field2822[arg0.field2906 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2904 > 0 && var2.field2829 != null) {
            int var11 = arg0.field2904;
            int var12 = var2.field2829[arg0.field2910 + 1];
            if (arg0.field2910 < var2.field2829.length - 2) {
                int var13 = (var2.field2829[arg0.field2910] & 0xFF) << 8;
                int var14 = (var2.field2829[arg0.field2910 + 2] & 0xFF) << 8;
                var12 += (var2.field2829[arg0.field2910 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("ie.av(Lib;I)I")
    public int method4140(class240 arg0) {
        int var2 = this.field2847[arg0.field2899];
        return var2 < 8192 ? arg0.field2903 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2903) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("ie.o()Lbc;")
    public synchronized class59 method594() {
        return this.field2866;
    }

    @ObfuscatedName("ie.m()Lbc;")
    public synchronized class59 method595() {
        return null;
    }

    @ObfuscatedName("ie.r()I")
    public synchronized int method596() {
        return 0;
    }

    @ObfuscatedName("ie.h([III)V")
    public synchronized void method616(int[] arg0, int arg1, int arg2) {
        if (this.field2860.method4169()) {
            int var4 = this.field2842 * this.field2860.field2868 / Statics.field3922;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2864;
                if (this.field2865 - var5 >= 0L) {
                    this.field2864 = var5;
                    break;
                }
                int var7 = (int) ((this.field2865 - this.field2864 + (long) var4 - 1L) / (long) var4);
                this.field2864 += (long) var4 * (long) var7;
                this.field2866.method616(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method4092();
            } while (this.field2860.method4169());
        }
        this.field2866.method616(arg0, arg1, arg2);
    }

    @ObfuscatedName("ie.z(I)V")
    public synchronized void method599(int arg0) {
        if (this.field2860.method4169()) {
            int var2 = this.field2842 * this.field2860.field2868 / Statics.field3922;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2864;
                if (this.field2865 - var3 >= 0L) {
                    this.field2864 = var3;
                    break;
                }
                int var5 = (int) ((this.field2865 - this.field2864 + (long) var2 - 1L) / (long) var2);
                this.field2864 += (long) var2 * (long) var5;
                this.field2866.method599(var5);
                arg0 -= var5;
                this.method4092();
            } while (this.field2860.method4169());
        }
        this.field2866.method599(arg0);
    }

    @ObfuscatedName("ie.ax(B)V")
    public void method4092() {
        int var1 = this.field2844;
        int var2 = this.field2863;
        long var3 = this.field2865;
        while (this.field2863 == var2) {
            while (this.field2860.field2874[var1] == var2) {
                this.field2860.method4171(var1);
                int var5 = this.field2860.method4175(var1);
                if (var5 == 1) {
                    this.field2860.method4201();
                    this.field2860.method4218(var1);
                    if (this.field2860.method4180()) {
                        if (!this.field2840 || var2 == 0) {
                            this.method4084();
                            this.field2860.method4168();
                            return;
                        }
                        this.field2860.method4181(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method4086(var5);
                }
                this.field2860.method4174(var1);
                this.field2860.method4218(var1);
            }
            var1 = this.field2860.method4179();
            var2 = this.field2860.field2874[var1];
            var3 = this.field2860.method4199(var2);
        }
        this.field2844 = var1;
        this.field2863 = var2;
        this.field2865 = var3;
    }

    @ObfuscatedName("ie.ar(Lib;I)Z")
    public boolean method4093(class240 arg0) {
        if (arg0.field2913 != null) {
            return false;
        }
        if (arg0.field2904 >= 0) {
            arg0.method5407();
            if (arg0.field2898 > 0 && this.field2859[arg0.field2899][arg0.field2898] == arg0) {
                this.field2859[arg0.field2899][arg0.field2898] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("ie.af(Lib;[IIII)Z")
    public boolean method4094(class240 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2914 = Statics.field3922 / 100;
        if (arg0.field2904 >= 0 && arg0.field2913 == null || arg0.field2913.method861()) {
            arg0.method4241();
            arg0.method5407();
            if (arg0.field2898 > 0 && this.field2859[arg0.field2899][arg0.field2898] == arg0) {
                this.field2859[arg0.field2899][arg0.field2898] = null;
            }
            return true;
        }
        int var5 = arg0.field2915;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2854[arg0.field2899] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2915 = var6;
        }
        arg0.field2913.method848(this.method4122(arg0));
        class233 var7 = arg0.field2905;
        boolean var8 = false;
        arg0.field2909++;
        arg0.field2912 += var7.field2828;
        double var9 = (double) ((arg0.field2911 - 60 << 8) + (arg0.field2915 * arg0.field2902 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2824 > 0) {
            if (var7.field2823 > 0) {
                arg0.field2895 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2823 * var9) + 0.5D);
            } else {
                arg0.field2895 += 128;
            }
        }
        if (var7.field2822 != null) {
            if (var7.field2825 > 0) {
                arg0.field2907 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2825 * var9) + 0.5D);
            } else {
                arg0.field2907 += 128;
            }
            while (arg0.field2906 < var7.field2822.length - 2 && arg0.field2907 > (var7.field2822[arg0.field2906 + 2] & 0xFF) << 8) {
                arg0.field2906 += 2;
            }
            if (arg0.field2906 == var7.field2822.length - 2 && var7.field2822[arg0.field2906 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2904 >= 0 && var7.field2829 != null && (this.field2852[arg0.field2899] & 0x1) == 0 && (arg0.field2898 < 0 || this.field2859[arg0.field2899][arg0.field2898] != arg0)) {
            if (var7.field2826 > 0) {
                arg0.field2904 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2826 * var9) + 0.5D);
            } else {
                arg0.field2904 += 128;
            }
            while (arg0.field2910 < var7.field2829.length - 2 && arg0.field2904 > (var7.field2829[arg0.field2910 + 2] & 0xFF) << 8) {
                arg0.field2910 += 2;
            }
            if (arg0.field2910 == var7.field2829.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2913.method769(arg0.field2914, this.method4088(arg0), this.method4140(arg0));
            return false;
        }
        arg0.field2913.method770(arg0.field2914);
        if (arg1 == null) {
            arg0.field2913.method599(arg3);
        } else {
            arg0.field2913.method616(arg1, arg2, arg3);
        }
        if (arg0.field2913.method774()) {
            this.field2866.field2889.method619(arg0.field2913);
        }
        arg0.method4241();
        if (arg0.field2904 >= 0) {
            arg0.method5407();
            if (arg0.field2898 > 0 && this.field2859[arg0.field2899][arg0.field2898] == arg0) {
                this.field2859[arg0.field2899][arg0.field2898] = null;
            }
        }
        return true;
    }
}
