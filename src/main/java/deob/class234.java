package deob;

@ObfuscatedName("hp")
public class class234 extends class59 {

    @ObfuscatedName("hp.v")
    public class362 field2834 = new class362(128);

    @ObfuscatedName("hp.n")
    public int field2835 = 256;

    @ObfuscatedName("hp.f")
    public int field2854 = 1000000;

    @ObfuscatedName("hp.y")
    public int[] field2855 = new int[16];

    @ObfuscatedName("hp.p")
    public int[] field2838 = new int[16];

    @ObfuscatedName("hp.j")
    public int[] field2836 = new int[16];

    @ObfuscatedName("hp.r")
    public int[] field2840 = new int[16];

    @ObfuscatedName("hp.b")
    public int[] field2862 = new int[16];

    @ObfuscatedName("hp.d")
    public int[] field2842 = new int[16];

    @ObfuscatedName("hp.s")
    public int[] field2843 = new int[16];

    @ObfuscatedName("hp.u")
    public int[] field2844 = new int[16];

    @ObfuscatedName("hp.l")
    public int[] field2853 = new int[16];

    @ObfuscatedName("hp.x")
    public int[] field2847 = new int[16];

    @ObfuscatedName("hp.z")
    public int[] field2845 = new int[16];

    @ObfuscatedName("hp.w")
    public int[] field2849 = new int[16];

    @ObfuscatedName("hp.t")
    public int[] field2837 = new int[16];

    @ObfuscatedName("hp.h")
    public int[] field2851 = new int[16];

    @ObfuscatedName("hp.q")
    public int[] field2852 = new int[16];

    @ObfuscatedName("hp.i")
    public class239[][] field2848 = new class239[16][128];

    @ObfuscatedName("hp.ae")
    public class239[][] field2850 = new class239[16][128];

    @ObfuscatedName("hp.ap")
    public class235 field2841 = new class235();

    @ObfuscatedName("hp.ab")
    public boolean field2856;

    @ObfuscatedName("hp.al")
    public int field2857;

    @ObfuscatedName("hp.ad")
    public int field2858;

    @ObfuscatedName("hp.ai")
    public long field2859;

    @ObfuscatedName("hp.ar")
    public long field2860;

    @ObfuscatedName("hp.ag")
    public class237 field2861 = new class237(this);

    public class234() {
        this.method4037();
    }

    @ObfuscatedName("hp.v(II)V")
    public synchronized void method4040(int arg0) {
        this.field2835 = arg0;
    }

    @ObfuscatedName("hp.n(I)I")
    public int method4018() {
        return this.field2835;
    }

    @ObfuscatedName("hp.f(Lie;Ljv;Lbu;II)Z")
    public synchronized boolean method4019(class238 arg0, class275 arg1, class56 arg2, int arg3) {
        arg0.method4196();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class349 var7 = (class349) arg0.field2891.method5774(); var7 != null; var7 = (class349) arg0.field2891.method5770()) {
            int var8 = (int) var7.field3938;
            class236 var9 = (class236) this.field2834.method5766((long) var8);
            if (var9 == null) {
                var9 = class236.method2374(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field2834.method5768(var9, (long) var8);
            }
            if (!var9.method4179(arg2, var7.field3935, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method4197();
        }
        return var5;
    }

    @ObfuscatedName("hp.y(B)V")
    public synchronized void method4120() {
        for (class236 var1 = (class236) this.field2834.method5774(); var1 != null; var1 = (class236) this.field2834.method5770()) {
            var1.method4180();
        }
    }

    @ObfuscatedName("hp.p(I)V")
    public synchronized void method4021() {
        for (class236 var1 = (class236) this.field2834.method5774(); var1 != null; var1 = (class236) this.field2834.method5770()) {
            var1.method5496();
        }
    }

    @ObfuscatedName("hp.s(Lie;ZI)V")
    public synchronized void method4022(class238 arg0, boolean arg1) {
        this.method4017();
        this.field2841.method4160(arg0.field2890);
        this.field2856 = arg1;
        this.field2859 = 0L;
        int var3 = this.field2841.method4125();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2841.method4126(var4);
            this.field2841.method4139(var4);
            this.field2841.method4151(var4);
        }
        this.field2857 = this.field2841.method4134();
        this.field2858 = this.field2841.field2865[this.field2857];
        this.field2860 = this.field2841.method4143(this.field2858);
    }

    @ObfuscatedName("hp.l(I)V")
    public synchronized void method4017() {
        this.field2841.method4153();
        this.method4037();
    }

    @ObfuscatedName("hp.o(I)Z")
    public synchronized boolean method4024() {
        return this.field2841.method4124();
    }

    @ObfuscatedName("hp.c(III)V")
    public synchronized void method4093(int arg0, int arg1) {
        this.method4103(arg0, arg1);
    }

    @ObfuscatedName("hp.e(IIB)V")
    public void method4103(int arg0, int arg1) {
        this.field2840[arg0] = arg1;
        this.field2842[arg0] = arg1 & 0xFFFFFF80;
        this.method4027(arg0, arg1);
    }

    @ObfuscatedName("hp.g(III)V")
    public void method4027(int arg0, int arg1) {
        if (this.field2862[arg0] != arg1) {
            this.field2862[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2850[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("hp.a(IIII)V")
    public void method4028(int arg0, int arg1, int arg2) {
        this.method4026(arg0, arg1, 64);
        if ((this.field2847[arg0] & 0x2) != 0) {
            for (class239 var4 = (class239) this.field2861.field2887.method4715(); var4 != null; var4 = (class239) this.field2861.field2887.method4717()) {
                if (var4.field2906 == arg0 && var4.field2896 < 0) {
                    this.field2848[arg0][var4.field2897] = null;
                    this.field2848[arg0][arg1] = var4;
                    int var5 = (var4.field2902 * var4.field2900 >> 12) + var4.field2901;
                    var4.field2901 += arg1 - var4.field2897 << 8;
                    var4.field2900 = var5 - var4.field2901;
                    var4.field2902 = 4096;
                    var4.field2897 = arg1;
                    return;
                }
            }
        }
        class236 var6 = (class236) this.field2834.method5766((long) this.field2862[arg0]);
        if (var6 == null) {
            return;
        }
        class51 var7 = var6.field2878[arg1];
        if (var7 == null) {
            return;
        }
        class239 var8 = new class239();
        var8.field2906 = arg0;
        var8.field2893 = var6;
        var8.field2911 = var7;
        var8.field2895 = var6.field2877[arg1];
        var8.field2894 = var6.field2883[arg1];
        var8.field2897 = arg1;
        var8.field2898 = var6.field2882 * arg2 * arg2 * var6.field2880[arg1] + 1024 >> 11;
        var8.field2899 = var6.field2881[arg1] & 0xFF;
        var8.field2901 = (arg1 << 8) - (var6.field2879[arg1] & 0x7FFF);
        var8.field2903 = 0;
        var8.field2904 = 0;
        var8.field2912 = 0;
        var8.field2896 = -1;
        var8.field2907 = 0;
        if (this.field2837[arg0] == 0) {
            var8.field2910 = class58.method720(var7, this.method4023(var8), this.method4042(var8), this.method4043(var8));
        } else {
            var8.field2910 = class58.method720(var7, this.method4023(var8), 0, this.method4043(var8));
            this.method4029(var8, var6.field2879[arg1] < 0);
        }
        if (var6.field2879[arg1] < 0) {
            var8.field2910.method722(-1);
        }
        if (var8.field2894 >= 0) {
            class239 var9 = this.field2850[arg0][var8.field2894];
            if (var9 != null && var9.field2896 < 0) {
                this.field2848[arg0][var9.field2897] = null;
                var9.field2896 = 0;
            }
            this.field2850[arg0][var8.field2894] = var8;
        }
        this.field2861.field2887.method4709(var8);
        this.field2848[arg0][arg1] = var8;
    }

    @ObfuscatedName("hp.k(Liq;ZB)V")
    public void method4029(class239 arg0, boolean arg1) {
        int var3 = arg0.field2911.field403.length;
        int var5;
        if (arg1 && arg0.field2911.field400) {
            int var4 = var3 + var3 - arg0.field2911.field401;
            var5 = (int) ((long) this.field2837[arg0.field2906] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2910.method756(true);
            }
        } else {
            var5 = (int) ((long) this.field2837[arg0.field2906] * (long) var3 >> 6);
        }
        arg0.field2910.method762(var5);
    }

    @ObfuscatedName("hp.m(IIIB)V")
    public void method4026(int arg0, int arg1, int arg2) {
        class239 var4 = this.field2848[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2848[arg0][arg1] = null;
        if ((this.field2847[arg0] & 0x2) == 0) {
            var4.field2896 = 0;
            return;
        }
        for (class239 var5 = (class239) this.field2861.field2887.method4714(); var5 != null; var5 = (class239) this.field2861.field2887.method4741()) {
            if (var4.field2906 == var5.field2906 && var5.field2896 < 0 && var4 != var5) {
                var4.field2896 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("hp.x(IIII)V")
    public void method4031(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("hp.z(III)V")
    public void method4092(int arg0, int arg1) {
    }

    @ObfuscatedName("hp.w(IIB)V")
    public void method4033(int arg0, int arg1) {
        this.field2843[arg0] = arg1;
    }

    @ObfuscatedName("hp.t(II)V")
    public void method4034(int arg0) {
        for (class239 var2 = (class239) this.field2861.field2887.method4714(); var2 != null; var2 = (class239) this.field2861.field2887.method4741()) {
            if (arg0 < 0 || var2.field2906 == arg0) {
                if (var2.field2910 != null) {
                    var2.field2910.method731(Statics.field429 / 100);
                    if (var2.field2910.method735()) {
                        this.field2861.field2888.method550(var2.field2910);
                    }
                    var2.method4208();
                }
                if (var2.field2896 < 0) {
                    this.field2848[var2.field2906][var2.field2897] = null;
                }
                var2.method5496();
            }
        }
    }

    @ObfuscatedName("hp.h(II)V")
    public void method4041(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method4041(var2);
            }
            return;
        }
        this.field2855[arg0] = 12800;
        this.field2838[arg0] = 8192;
        this.field2836[arg0] = 16383;
        this.field2843[arg0] = 8192;
        this.field2844[arg0] = 0;
        this.field2853[arg0] = 8192;
        this.method4045(arg0);
        this.method4039(arg0);
        this.field2847[arg0] = 0;
        this.field2845[arg0] = 32767;
        this.field2849[arg0] = 256;
        this.field2837[arg0] = 0;
        this.method4068(arg0, 8192);
    }

    @ObfuscatedName("hp.ag(II)V")
    public void method4044(int arg0) {
        for (class239 var2 = (class239) this.field2861.field2887.method4714(); var2 != null; var2 = (class239) this.field2861.field2887.method4741()) {
            if ((arg0 < 0 || var2.field2906 == arg0) && var2.field2896 < 0) {
                this.field2848[var2.field2906][var2.field2897] = null;
                var2.field2896 = 0;
            }
        }
    }

    @ObfuscatedName("hp.ax(I)V")
    public void method4037() {
        this.method4034(-1);
        this.method4041(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2862[var1] = this.field2840[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2842[var2] = this.field2840[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("hp.as(II)V")
    public void method4045(int arg0) {
        if ((this.field2847[arg0] & 0x2) == 0) {
            return;
        }
        for (class239 var2 = (class239) this.field2861.field2887.method4714(); var2 != null; var2 = (class239) this.field2861.field2887.method4741()) {
            if (var2.field2906 == arg0 && this.field2848[arg0][var2.field2897] == null && var2.field2896 < 0) {
                var2.field2896 = 0;
            }
        }
    }

    @ObfuscatedName("hp.av(IB)V")
    public void method4039(int arg0) {
        if ((this.field2847[arg0] & 0x4) == 0) {
            return;
        }
        for (class239 var2 = (class239) this.field2861.field2887.method4714(); var2 != null; var2 = (class239) this.field2861.field2887.method4741()) {
            if (var2.field2906 == arg0) {
                var2.field2905 = 0;
            }
        }
    }

    @ObfuscatedName("hp.ac(IB)V")
    public void method4050(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method4026(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method4028(var6, var7, var8);
            } else {
                this.method4026(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method4031(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2842[var12] = (var14 << 14) + (this.field2842[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2842[var12] = (var14 << 7) + (this.field2842[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2844[var12] = (var14 << 7) + (this.field2844[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2844[var12] = (this.field2844[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2853[var12] = (var14 << 7) + (this.field2853[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2853[var12] = (this.field2853[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2855[var12] = (var14 << 7) + (this.field2855[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2855[var12] = (this.field2855[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2838[var12] = (var14 << 7) + (this.field2838[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2838[var12] = (this.field2838[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2836[var12] = (var14 << 7) + (this.field2836[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2836[var12] = (this.field2836[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2847[var12] |= 0x1;
                } else {
                    this.field2847[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2847[var12] |= 0x2;
                } else {
                    this.method4045(var12);
                    this.field2847[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2845[var12] = (var14 << 7) + (this.field2845[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2845[var12] = (this.field2845[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2845[var12] = (var14 << 7) + (this.field2845[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2845[var12] = (this.field2845[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method4034(var12);
            }
            if (var13 == 121) {
                this.method4041(var12);
            }
            if (var13 == 123) {
                this.method4044(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2845[var12];
                if (var15 == 16384) {
                    this.field2849[var12] = (var14 << 7) + (this.field2849[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2845[var12];
                if (var16 == 16384) {
                    this.field2849[var12] = (this.field2849[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2837[var12] = (var14 << 7) + (this.field2837[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2837[var12] = (this.field2837[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2847[var12] |= 0x4;
                } else {
                    this.method4039(var12);
                    this.field2847[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method4068(var12, (var14 << 7) + (this.field2851[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method4068(var12, (this.field2851[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method4027(var17, this.field2842[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method4092(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method4033(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method4037();
            }
        }
    }

    @ObfuscatedName("hp.at(III)V")
    public void method4068(int arg0, int arg1) {
        this.field2851[arg0] = arg1;
        this.field2852[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("hp.ao(Liq;B)I")
    public int method4023(class239 arg0) {
        int var2 = (arg0.field2902 * arg0.field2900 >> 12) + arg0.field2901;
        int var3 = ((this.field2843[arg0.field2906] - 8192) * this.field2849[arg0.field2906] >> 12) + var2;
        class232 var4 = arg0.field2895;
        if (var4.field2818 > 0 && (var4.field2823 > 0 || this.field2844[arg0.field2906] > 0)) {
            int var5 = var4.field2823 << 2;
            int var6 = var4.field2824 << 1;
            if (arg0.field2908 < var6) {
                var5 = arg0.field2908 * var5 / var6;
            }
            int var7 = (this.field2844[arg0.field2906] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2909 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2911.field399 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field429 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("hp.aq(Liq;I)I")
    public int method4042(class239 arg0) {
        class232 var2 = arg0.field2895;
        int var3 = this.field2855[arg0.field2906] * this.field2836[arg0.field2906] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2898 * var4 + 16384 >> 15;
        int var6 = this.field2835 * var5 + 128 >> 8;
        if (var2.field2816 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2903 * 1.953125E-5D * (double) var2.field2816) + 0.5D);
        }
        if (var2.field2826 != null) {
            int var7 = arg0.field2904;
            int var8 = var2.field2826[arg0.field2912 + 1];
            if (arg0.field2912 < var2.field2826.length - 2) {
                int var9 = (var2.field2826[arg0.field2912] & 0xFF) << 8;
                int var10 = (var2.field2826[arg0.field2912 + 2] & 0xFF) << 8;
                var8 += (var2.field2826[arg0.field2912 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2896 > 0 && var2.field2817 != null) {
            int var11 = arg0.field2896;
            int var12 = var2.field2817[arg0.field2907 + 1];
            if (arg0.field2907 < var2.field2817.length - 2) {
                int var13 = (var2.field2817[arg0.field2907] & 0xFF) << 8;
                int var14 = (var2.field2817[arg0.field2907 + 2] & 0xFF) << 8;
                var12 += (var2.field2817[arg0.field2907 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("hp.aw(Liq;I)I")
    public int method4043(class239 arg0) {
        int var2 = this.field2838[arg0.field2906];
        return var2 < 8192 ? arg0.field2899 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2899) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("hp.j()Lbm;")
    public synchronized class59 method553() {
        return this.field2861;
    }

    @ObfuscatedName("hp.r()Lbm;")
    public synchronized class59 method556() {
        return null;
    }

    @ObfuscatedName("hp.b()I")
    public synchronized int method557() {
        return 0;
    }

    @ObfuscatedName("hp.d([III)V")
    public synchronized void method586(int[] arg0, int arg1, int arg2) {
        if (this.field2841.method4124()) {
            int var4 = this.field2854 * this.field2841.field2864 / Statics.field429;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2859;
                if (this.field2860 - var5 >= 0L) {
                    this.field2859 = var5;
                    break;
                }
                int var7 = (int) ((this.field2860 - this.field2859 + (long) var4 - 1L) / (long) var4);
                this.field2859 += (long) var4 * (long) var7;
                this.field2861.method586(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method4046();
            } while (this.field2841.method4124());
        }
        this.field2861.method586(arg0, arg1, arg2);
    }

    @ObfuscatedName("hp.u(I)V")
    public synchronized void method558(int arg0) {
        if (this.field2841.method4124()) {
            int var2 = this.field2854 * this.field2841.field2864 / Statics.field429;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2859;
                if (this.field2860 - var3 >= 0L) {
                    this.field2859 = var3;
                    break;
                }
                int var5 = (int) ((this.field2860 - this.field2859 + (long) var2 - 1L) / (long) var2);
                this.field2859 += (long) var2 * (long) var5;
                this.field2861.method558(var5);
                arg0 -= var5;
                this.method4046();
            } while (this.field2841.method4124());
        }
        this.field2861.method558(arg0);
    }

    @ObfuscatedName("hp.af(I)V")
    public void method4046() {
        int var1 = this.field2857;
        int var2 = this.field2858;
        long var3 = this.field2860;
        while (this.field2858 == var2) {
            while (this.field2841.field2865[var1] == var2) {
                this.field2841.method4126(var1);
                int var5 = this.field2841.method4130(var1);
                if (var5 == 1) {
                    this.field2841.method4156();
                    this.field2841.method4151(var1);
                    if (this.field2841.method4147()) {
                        if (!this.field2856 || var2 == 0) {
                            this.method4037();
                            this.field2841.method4153();
                            return;
                        }
                        this.field2841.method4136(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method4050(var5);
                }
                this.field2841.method4139(var1);
                this.field2841.method4151(var1);
            }
            var1 = this.field2841.method4134();
            var2 = this.field2841.field2865[var1];
            var3 = this.field2841.method4143(var2);
        }
        this.field2857 = var1;
        this.field2858 = var2;
        this.field2860 = var3;
    }

    @ObfuscatedName("hp.ak(Liq;B)Z")
    public boolean method4047(class239 arg0) {
        if (arg0.field2910 != null) {
            return false;
        }
        if (arg0.field2896 >= 0) {
            arg0.method5496();
            if (arg0.field2894 > 0 && this.field2850[arg0.field2906][arg0.field2894] == arg0) {
                this.field2850[arg0.field2906][arg0.field2894] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("hp.ay(Liq;[IIII)Z")
    public boolean method4048(class239 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2892 = Statics.field429 / 100;
        if (arg0.field2896 >= 0 && arg0.field2910 == null || arg0.field2910.method726()) {
            arg0.method4208();
            arg0.method5496();
            if (arg0.field2894 > 0 && this.field2850[arg0.field2906][arg0.field2894] == arg0) {
                this.field2850[arg0.field2906][arg0.field2894] = null;
            }
            return true;
        }
        int var5 = arg0.field2902;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2853[arg0.field2906] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2902 = var6;
        }
        arg0.field2910.method821(this.method4023(arg0));
        class232 var7 = arg0.field2895;
        boolean var8 = false;
        arg0.field2908++;
        arg0.field2909 += var7.field2818;
        double var9 = (double) ((arg0.field2897 - 60 << 8) + (arg0.field2902 * arg0.field2900 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2816 > 0) {
            if (var7.field2821 > 0) {
                arg0.field2903 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2821 * var9) + 0.5D);
            } else {
                arg0.field2903 += 128;
            }
        }
        if (var7.field2826 != null) {
            if (var7.field2822 > 0) {
                arg0.field2904 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2822 * var9) + 0.5D);
            } else {
                arg0.field2904 += 128;
            }
            while (arg0.field2912 < var7.field2826.length - 2 && arg0.field2904 > (var7.field2826[arg0.field2912 + 2] & 0xFF) << 8) {
                arg0.field2912 += 2;
            }
            if (arg0.field2912 == var7.field2826.length - 2 && var7.field2826[arg0.field2912 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2896 >= 0 && var7.field2817 != null && (this.field2847[arg0.field2906] & 0x1) == 0 && (arg0.field2894 < 0 || this.field2850[arg0.field2906][arg0.field2894] != arg0)) {
            if (var7.field2820 > 0) {
                arg0.field2896 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2820 * var9) + 0.5D);
            } else {
                arg0.field2896 += 128;
            }
            while (arg0.field2907 < var7.field2817.length - 2 && arg0.field2896 > (var7.field2817[arg0.field2907 + 2] & 0xFF) << 8) {
                arg0.field2907 += 2;
            }
            if (arg0.field2907 == var7.field2817.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2910.method844(arg0.field2892, this.method4042(arg0), this.method4043(arg0));
            return false;
        }
        arg0.field2910.method731(arg0.field2892);
        if (arg1 == null) {
            arg0.field2910.method558(arg3);
        } else {
            arg0.field2910.method586(arg1, arg2, arg3);
        }
        if (arg0.field2910.method735()) {
            this.field2861.field2888.method550(arg0.field2910);
        }
        arg0.method4208();
        if (arg0.field2896 >= 0) {
            arg0.method5496();
            if (arg0.field2894 > 0 && this.field2850[arg0.field2906][arg0.field2894] == arg0) {
                this.field2850[arg0.field2906][arg0.field2894] = null;
            }
        }
        return true;
    }
}
