package deob;

@ObfuscatedName("iv")
public class class236 extends class31 {

    @ObfuscatedName("iv.s")
    public class364 field2828 = new class364(128);

    @ObfuscatedName("iv.t")
    public int field2827 = 256;

    @ObfuscatedName("iv.v")
    public int field2825 = 1000000;

    @ObfuscatedName("iv.j")
    public int[] field2852 = new int[16];

    @ObfuscatedName("iv.l")
    public int[] field2826 = new int[16];

    @ObfuscatedName("iv.n")
    public int[] field2829 = new int[16];

    @ObfuscatedName("iv.f")
    public int[] field2824 = new int[16];

    @ObfuscatedName("iv.o")
    public int[] field2830 = new int[16];

    @ObfuscatedName("iv.x")
    public int[] field2832 = new int[16];

    @ObfuscatedName("iv.r")
    public int[] field2833 = new int[16];

    @ObfuscatedName("iv.p")
    public int[] field2834 = new int[16];

    @ObfuscatedName("iv.h")
    public int[] field2835 = new int[16];

    @ObfuscatedName("iv.i")
    public int[] field2831 = new int[16];

    @ObfuscatedName("iv.m")
    public int[] field2838 = new int[16];

    @ObfuscatedName("iv.b")
    public int[] field2839 = new int[16];

    @ObfuscatedName("iv.z")
    public int[] field2840 = new int[16];

    @ObfuscatedName("iv.d")
    public int[] field2841 = new int[16];

    @ObfuscatedName("iv.y")
    public int[] field2842 = new int[16];

    @ObfuscatedName("iv.g")
    public class241[][] field2843 = new class241[16][128];

    @ObfuscatedName("iv.ae")
    public class241[][] field2844 = new class241[16][128];

    @ObfuscatedName("iv.an")
    public class237 field2845 = new class237();

    @ObfuscatedName("iv.am")
    public boolean field2846;

    @ObfuscatedName("iv.al")
    public int field2837;

    @ObfuscatedName("iv.aq")
    public int field2848;

    @ObfuscatedName("iv.aa")
    public long field2849;

    @ObfuscatedName("iv.ab")
    public long field2851;

    @ObfuscatedName("iv.ax")
    public class239 field2850 = new class239(this);

    public class236() {
        this.method4022();
    }

    @ObfuscatedName("iv.s(II)V")
    public synchronized void method4005(int arg0) {
        this.field2827 = arg0;
    }

    @ObfuscatedName("iv.t(I)I")
    public int method4006() {
        return this.field2827;
    }

    @ObfuscatedName("iv.v(Lil;Ljy;Lan;II)Z")
    public synchronized boolean method4007(class240 arg0, class277 arg1, class28 arg2, int arg3) {
        arg0.method4170();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class351 var7 = (class351) arg0.field2882.method5746(); var7 != null; var7 = (class351) arg0.field2882.method5749()) {
            int var8 = (int) var7.field3966;
            class238 var9 = (class238) this.field2828.method5756((long) var8);
            if (var9 == null) {
                var9 = class238.method1950(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field2828.method5747(var9, (long) var8);
            }
            if (!var9.method4150(arg2, var7.field3962, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method4167();
        }
        return var5;
    }

    @ObfuscatedName("iv.j(I)V")
    public synchronized void method4049() {
        for (class238 var1 = (class238) this.field2828.method5746(); var1 != null; var1 = (class238) this.field2828.method5749()) {
            var1.method4149();
        }
    }

    @ObfuscatedName("iv.l(B)V")
    public synchronized void method4009() {
        for (class238 var1 = (class238) this.field2828.method5746(); var1 != null; var1 = (class238) this.field2828.method5749()) {
            var1.method5447();
        }
    }

    @ObfuscatedName("iv.x(Lil;ZI)V")
    public synchronized void method4010(class240 arg0, boolean arg1) {
        this.method4011();
        this.field2845.method4096(arg0.field2881);
        this.field2846 = arg1;
        this.field2849 = 0L;
        int var3 = this.field2845.method4099();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2845.method4108(var4);
            this.field2845.method4103(var4);
            this.field2845.method4101(var4);
        }
        this.field2837 = this.field2845.method4118();
        this.field2848 = this.field2845.field2857[this.field2837];
        this.field2851 = this.field2845.method4105(this.field2848);
    }

    @ObfuscatedName("iv.p(I)V")
    public synchronized void method4011() {
        this.field2845.method4097();
        this.method4022();
    }

    @ObfuscatedName("iv.h(B)Z")
    public synchronized boolean method4014() {
        return this.field2845.method4146();
    }

    @ObfuscatedName("iv.k(IIS)V")
    public synchronized void method4012(int arg0, int arg1) {
        this.method4013(arg0, arg1);
    }

    @ObfuscatedName("iv.a(III)V")
    public void method4013(int arg0, int arg1) {
        this.field2824[arg0] = arg1;
        this.field2832[arg0] = arg1 & 0xFFFFFF80;
        this.method4036(arg0, arg1);
    }

    @ObfuscatedName("iv.q(IIB)V")
    public void method4036(int arg0, int arg1) {
        if (this.field2830[arg0] != arg1) {
            this.field2830[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2844[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("iv.u(IIII)V")
    public void method4054(int arg0, int arg1, int arg2) {
        this.method4016(arg0, arg1, 64);
        if ((this.field2831[arg0] & 0x2) != 0) {
            for (class241 var4 = (class241) this.field2850.field2877.method4728(); var4 != null; var4 = (class241) this.field2850.field2877.method4713()) {
                if (var4.field2903 == arg0 && var4.field2897 < 0) {
                    this.field2843[arg0][var4.field2894] = null;
                    this.field2843[arg0][arg1] = var4;
                    int var5 = (var4.field2893 * var4.field2892 >> 12) + var4.field2883;
                    var4.field2883 += arg1 - var4.field2894 << 8;
                    var4.field2892 = var5 - var4.field2883;
                    var4.field2893 = 4096;
                    var4.field2894 = arg1;
                    return;
                }
            }
        }
        class238 var6 = (class238) this.field2828.method5756((long) this.field2830[arg0]);
        if (var6 == null) {
            return;
        }
        class23 var7 = var6.field2870[arg1];
        if (var7 == null) {
            return;
        }
        class241 var8 = new class241();
        var8.field2903 = arg0;
        var8.field2891 = var6;
        var8.field2885 = var7;
        var8.field2886 = var6.field2872[arg1];
        var8.field2888 = var6.field2873[arg1];
        var8.field2894 = arg1;
        var8.field2889 = var6.field2871 * arg2 * arg2 * var6.field2874[arg1] + 1024 >> 11;
        var8.field2890 = var6.field2868[arg1] & 0xFF;
        var8.field2883 = (arg1 << 8) - (var6.field2869[arg1] & 0x7FFF);
        var8.field2884 = 0;
        var8.field2900 = 0;
        var8.field2896 = 0;
        var8.field2897 = -1;
        var8.field2898 = 0;
        if (this.field2840[arg0] == 0) {
            var8.field2901 = class30.method529(var7, this.method4090(var8), this.method4028(var8), this.method4029(var8));
        } else {
            var8.field2901 = class30.method529(var7, this.method4090(var8), 0, this.method4029(var8));
            this.method4004(var8, var6.field2869[arg1] < 0);
        }
        if (var6.field2869[arg1] < 0) {
            var8.field2901.method603(-1);
        }
        if (var8.field2888 >= 0) {
            class241 var9 = this.field2844[arg0][var8.field2888];
            if (var9 != null && var9.field2897 < 0) {
                this.field2843[arg0][var9.field2894] = null;
                var9.field2897 = 0;
            }
            this.field2844[arg0][var8.field2888] = var8;
        }
        this.field2850.field2877.method4706(var8);
        this.field2843[arg0][arg1] = var8;
    }

    @ObfuscatedName("iv.e(Liu;ZI)V")
    public void method4004(class241 arg0, boolean arg1) {
        int var3 = arg0.field2885.field165.length;
        int var5;
        if (arg1 && arg0.field2885.field168) {
            int var4 = var3 + var3 - arg0.field2885.field166;
            var5 = (int) ((long) this.field2840[arg0.field2903] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2901.method538(true);
            }
        } else {
            var5 = (int) ((long) this.field2840[arg0.field2903] * (long) var3 >> 6);
        }
        arg0.field2901.method537(var5);
    }

    @ObfuscatedName("iv.c(IIIB)V")
    public void method4016(int arg0, int arg1, int arg2) {
        class241 var4 = this.field2843[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2843[arg0][arg1] = null;
        if ((this.field2831[arg0] & 0x2) == 0) {
            var4.field2897 = 0;
            return;
        }
        for (class241 var5 = (class241) this.field2850.field2877.method4721(); var5 != null; var5 = (class241) this.field2850.field2877.method4712()) {
            if (var4.field2903 == var5.field2903 && var5.field2897 < 0 && var4 != var5) {
                var4.field2897 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("iv.i(IIIB)V")
    public void method4017(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("iv.m(III)V")
    public void method4018(int arg0, int arg1) {
    }

    @ObfuscatedName("iv.b(III)V")
    public void method4019(int arg0, int arg1) {
        this.field2833[arg0] = arg1;
    }

    @ObfuscatedName("iv.z(II)V")
    public void method4020(int arg0) {
        for (class241 var2 = (class241) this.field2850.field2877.method4721(); var2 != null; var2 = (class241) this.field2850.field2877.method4712()) {
            if (arg0 < 0 || var2.field2903 == arg0) {
                if (var2.field2901 != null) {
                    var2.field2901.method542(Statics.field3634 / 100);
                    if (var2.field2901.method546()) {
                        this.field2850.field2878.method368(var2.field2901);
                    }
                    var2.method4184();
                }
                if (var2.field2897 < 0) {
                    this.field2843[var2.field2903][var2.field2894] = null;
                }
                var2.method5447();
            }
        }
    }

    @ObfuscatedName("iv.d(II)V")
    public void method4021(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method4021(var2);
            }
            return;
        }
        this.field2852[arg0] = 12800;
        this.field2826[arg0] = 8192;
        this.field2829[arg0] = 16383;
        this.field2833[arg0] = 8192;
        this.field2834[arg0] = 0;
        this.field2835[arg0] = 8192;
        this.method4023(arg0);
        this.method4081(arg0);
        this.field2831[arg0] = 0;
        this.field2838[arg0] = 32767;
        this.field2839[arg0] = 256;
        this.field2840[arg0] = 0;
        this.method4026(arg0, 8192);
    }

    @ObfuscatedName("iv.y(II)V")
    public void method4030(int arg0) {
        for (class241 var2 = (class241) this.field2850.field2877.method4721(); var2 != null; var2 = (class241) this.field2850.field2877.method4712()) {
            if ((arg0 < 0 || var2.field2903 == arg0) && var2.field2897 < 0) {
                this.field2843[var2.field2903][var2.field2894] = null;
                var2.field2897 = 0;
            }
        }
    }

    @ObfuscatedName("iv.av(I)V")
    public void method4022() {
        this.method4020(-1);
        this.method4021(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2830[var1] = this.field2824[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2832[var2] = this.field2824[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("iv.az(II)V")
    public void method4023(int arg0) {
        if ((this.field2831[arg0] & 0x2) == 0) {
            return;
        }
        for (class241 var2 = (class241) this.field2850.field2877.method4721(); var2 != null; var2 = (class241) this.field2850.field2877.method4712()) {
            if (var2.field2903 == arg0 && this.field2843[arg0][var2.field2894] == null && var2.field2897 < 0) {
                var2.field2897 = 0;
            }
        }
    }

    @ObfuscatedName("iv.aj(II)V")
    public void method4081(int arg0) {
        if ((this.field2831[arg0] & 0x4) == 0) {
            return;
        }
        for (class241 var2 = (class241) this.field2850.field2877.method4721(); var2 != null; var2 = (class241) this.field2850.field2877.method4712()) {
            if (var2.field2903 == arg0) {
                var2.field2899 = 0;
            }
        }
    }

    @ObfuscatedName("iv.at(IB)V")
    public void method4025(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method4016(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method4054(var6, var7, var8);
            } else {
                this.method4016(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method4017(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2832[var12] = (var14 << 14) + (this.field2832[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2832[var12] = (var14 << 7) + (this.field2832[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2834[var12] = (var14 << 7) + (this.field2834[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2834[var12] = (this.field2834[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2835[var12] = (var14 << 7) + (this.field2835[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2835[var12] = (this.field2835[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2852[var12] = (var14 << 7) + (this.field2852[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2852[var12] = (this.field2852[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2826[var12] = (var14 << 7) + (this.field2826[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2826[var12] = (this.field2826[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2829[var12] = (var14 << 7) + (this.field2829[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2829[var12] = (this.field2829[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2831[var12] |= 0x1;
                } else {
                    this.field2831[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2831[var12] |= 0x2;
                } else {
                    this.method4023(var12);
                    this.field2831[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2838[var12] = (var14 << 7) + (this.field2838[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2838[var12] = (this.field2838[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2838[var12] = (var14 << 7) + (this.field2838[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2838[var12] = (this.field2838[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method4020(var12);
            }
            if (var13 == 121) {
                this.method4021(var12);
            }
            if (var13 == 123) {
                this.method4030(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2838[var12];
                if (var15 == 16384) {
                    this.field2839[var12] = (var14 << 7) + (this.field2839[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2838[var12];
                if (var16 == 16384) {
                    this.field2839[var12] = (this.field2839[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2840[var12] = (var14 << 7) + (this.field2840[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2840[var12] = (this.field2840[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2831[var12] |= 0x4;
                } else {
                    this.method4081(var12);
                    this.field2831[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method4026(var12, (var14 << 7) + (this.field2841[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method4026(var12, (this.field2841[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method4036(var17, this.field2832[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method4018(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method4019(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method4022();
            }
        }
    }

    @ObfuscatedName("iv.af(III)V")
    public void method4026(int arg0, int arg1) {
        this.field2841[arg0] = arg1;
        this.field2842[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("iv.ar(Liu;I)I")
    public int method4090(class241 arg0) {
        int var2 = (arg0.field2893 * arg0.field2892 >> 12) + arg0.field2883;
        int var3 = ((this.field2833[arg0.field2903] - 8192) * this.field2839[arg0.field2903] >> 12) + var2;
        class234 var4 = arg0.field2886;
        if (var4.field2811 > 0 && (var4.field2805 > 0 || this.field2834[arg0.field2903] > 0)) {
            int var5 = var4.field2805 << 2;
            int var6 = var4.field2813 << 1;
            if (arg0.field2887 < var6) {
                var5 = arg0.field2887 * var5 / var6;
            }
            int var7 = (this.field2834[arg0.field2903] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2895 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2885.field164 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field3634 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("iv.ay(Liu;I)I")
    public int method4028(class241 arg0) {
        class234 var2 = arg0.field2886;
        int var3 = this.field2852[arg0.field2903] * this.field2829[arg0.field2903] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2889 * var4 + 16384 >> 15;
        int var6 = this.field2827 * var5 + 128 >> 8;
        if (var2.field2807 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2884 * 1.953125E-5D * (double) var2.field2807) + 0.5D);
        }
        if (var2.field2809 != null) {
            int var7 = arg0.field2900;
            int var8 = var2.field2809[arg0.field2896 + 1];
            if (arg0.field2896 < var2.field2809.length - 2) {
                int var9 = (var2.field2809[arg0.field2896] & 0xFF) << 8;
                int var10 = (var2.field2809[arg0.field2896 + 2] & 0xFF) << 8;
                var8 += (var2.field2809[arg0.field2896 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2897 > 0 && var2.field2812 != null) {
            int var11 = arg0.field2897;
            int var12 = var2.field2812[arg0.field2898 + 1];
            if (arg0.field2898 < var2.field2812.length - 2) {
                int var13 = (var2.field2812[arg0.field2898] & 0xFF) << 8;
                int var14 = (var2.field2812[arg0.field2898 + 2] & 0xFF) << 8;
                var12 += (var2.field2812[arg0.field2898 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("iv.ap(Liu;I)I")
    public int method4029(class241 arg0) {
        int var2 = this.field2826[arg0.field2903];
        return var2 < 8192 ? arg0.field2890 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2890) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("iv.n()Laq;")
    public synchronized class31 method373() {
        return this.field2850;
    }

    @ObfuscatedName("iv.w()Laq;")
    public synchronized class31 method396() {
        return null;
    }

    @ObfuscatedName("iv.f()I")
    public synchronized int method375() {
        return 0;
    }

    @ObfuscatedName("iv.o([III)V")
    public synchronized void method376(int[] arg0, int arg1, int arg2) {
        if (this.field2845.method4146()) {
            int var4 = this.field2825 * this.field2845.field2854 / Statics.field3634;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2849;
                if (this.field2851 - var5 >= 0L) {
                    this.field2849 = var5;
                    break;
                }
                int var7 = (int) ((this.field2851 - this.field2849 + (long) var4 - 1L) / (long) var4);
                this.field2849 += (long) var4 * (long) var7;
                this.field2850.method376(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method4031();
            } while (this.field2845.method4146());
        }
        this.field2850.method376(arg0, arg1, arg2);
    }

    @ObfuscatedName("iv.r(I)V")
    public synchronized void method378(int arg0) {
        if (this.field2845.method4146()) {
            int var2 = this.field2825 * this.field2845.field2854 / Statics.field3634;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2849;
                if (this.field2851 - var3 >= 0L) {
                    this.field2849 = var3;
                    break;
                }
                int var5 = (int) ((this.field2851 - this.field2849 + (long) var2 - 1L) / (long) var2);
                this.field2849 += (long) var2 * (long) var5;
                this.field2850.method378(var5);
                arg0 -= var5;
                this.method4031();
            } while (this.field2845.method4146());
        }
        this.field2850.method378(arg0);
    }

    @ObfuscatedName("iv.ah(B)V")
    public void method4031() {
        int var1 = this.field2837;
        int var2 = this.field2848;
        long var3 = this.field2851;
        while (this.field2848 == var2) {
            while (this.field2845.field2857[var1] == var2) {
                this.field2845.method4108(var1);
                int var5 = this.field2845.method4104(var1);
                if (var5 == 1) {
                    this.field2845.method4121();
                    this.field2845.method4101(var1);
                    if (this.field2845.method4145()) {
                        if (!this.field2846 || var2 == 0) {
                            this.method4022();
                            this.field2845.method4097();
                            return;
                        }
                        this.field2845.method4110(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method4025(var5);
                }
                this.field2845.method4103(var1);
                this.field2845.method4101(var1);
            }
            var1 = this.field2845.method4118();
            var2 = this.field2845.field2857[var1];
            var3 = this.field2845.method4105(var2);
        }
        this.field2837 = var1;
        this.field2848 = var2;
        this.field2851 = var3;
    }

    @ObfuscatedName("iv.ag(Liu;S)Z")
    public boolean method4032(class241 arg0) {
        if (arg0.field2901 != null) {
            return false;
        }
        if (arg0.field2897 >= 0) {
            arg0.method5447();
            if (arg0.field2888 > 0 && this.field2844[arg0.field2903][arg0.field2888] == arg0) {
                this.field2844[arg0.field2903][arg0.field2888] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("iv.ai(Liu;[IIII)Z")
    public boolean method4033(class241 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2902 = Statics.field3634 / 100;
        if (arg0.field2897 >= 0 && arg0.field2901 == null || arg0.field2901.method586()) {
            arg0.method4184();
            arg0.method5447();
            if (arg0.field2888 > 0 && this.field2844[arg0.field2903][arg0.field2888] == arg0) {
                this.field2844[arg0.field2903][arg0.field2888] = null;
            }
            return true;
        }
        int var5 = arg0.field2893;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2835[arg0.field2903] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2893 = var6;
        }
        arg0.field2901.method543(this.method4090(arg0));
        class234 var7 = arg0.field2886;
        boolean var8 = false;
        arg0.field2887++;
        arg0.field2895 += var7.field2811;
        double var9 = (double) ((arg0.field2894 - 60 << 8) + (arg0.field2893 * arg0.field2892 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2807 > 0) {
            if (var7.field2810 > 0) {
                arg0.field2884 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2810 * var9) + 0.5D);
            } else {
                arg0.field2884 += 128;
            }
        }
        if (var7.field2809 != null) {
            if (var7.field2808 > 0) {
                arg0.field2900 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2808 * var9) + 0.5D);
            } else {
                arg0.field2900 += 128;
            }
            while (arg0.field2896 < var7.field2809.length - 2 && arg0.field2900 > (var7.field2809[arg0.field2896 + 2] & 0xFF) << 8) {
                arg0.field2896 += 2;
            }
            if (arg0.field2896 == var7.field2809.length - 2 && var7.field2809[arg0.field2896 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2897 >= 0 && var7.field2812 != null && (this.field2831[arg0.field2903] & 0x1) == 0 && (arg0.field2888 < 0 || this.field2844[arg0.field2903][arg0.field2888] != arg0)) {
            if (var7.field2806 > 0) {
                arg0.field2897 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2806 * var9) + 0.5D);
            } else {
                arg0.field2897 += 128;
            }
            while (arg0.field2898 < var7.field2812.length - 2 && arg0.field2897 > (var7.field2812[arg0.field2898 + 2] & 0xFF) << 8) {
                arg0.field2898 += 2;
            }
            if (arg0.field2898 == var7.field2812.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2901.method541(arg0.field2902, this.method4028(arg0), this.method4029(arg0));
            return false;
        }
        arg0.field2901.method542(arg0.field2902);
        if (arg1 == null) {
            arg0.field2901.method378(arg3);
        } else {
            arg0.field2901.method376(arg1, arg2, arg3);
        }
        if (arg0.field2901.method546()) {
            this.field2850.field2878.method368(arg0.field2901);
        }
        arg0.method4184();
        if (arg0.field2897 >= 0) {
            arg0.method5447();
            if (arg0.field2888 > 0 && this.field2844[arg0.field2903][arg0.field2888] == arg0) {
                this.field2844[arg0.field2903][arg0.field2888] = null;
            }
        }
        return true;
    }
}
