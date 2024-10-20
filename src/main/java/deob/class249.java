package deob;

@ObfuscatedName("iw")
public class class249 extends class44 {

    @ObfuscatedName("iw.n")
    public class379 field2916 = new class379(128);

    @ObfuscatedName("iw.c")
    public int field2923 = 256;

    @ObfuscatedName("iw.m")
    public int field2909 = 1000000;

    @ObfuscatedName("iw.k")
    public int[] field2910 = new int[16];

    @ObfuscatedName("iw.o")
    public int[] field2927 = new int[16];

    @ObfuscatedName("iw.g")
    public int[] field2912 = new int[16];

    @ObfuscatedName("iw.z")
    public int[] field2913 = new int[16];

    @ObfuscatedName("iw.a")
    public int[] field2914 = new int[16];

    @ObfuscatedName("iw.u")
    public int[] field2915 = new int[16];

    @ObfuscatedName("iw.e")
    public int[] field2907 = new int[16];

    @ObfuscatedName("iw.l")
    public int[] field2917 = new int[16];

    @ObfuscatedName("iw.y")
    public int[] field2918 = new int[16];

    @ObfuscatedName("iw.x")
    public int[] field2930 = new int[16];

    @ObfuscatedName("iw.b")
    public int[] field2931 = new int[16];

    @ObfuscatedName("iw.t")
    public int[] field2922 = new int[16];

    @ObfuscatedName("iw.r")
    public int[] field2926 = new int[16];

    @ObfuscatedName("iw.p")
    public int[] field2924 = new int[16];

    @ObfuscatedName("iw.w")
    public int[] field2925 = new int[16];

    @ObfuscatedName("iw.i")
    public class254[][] field2928 = new class254[16][128];

    @ObfuscatedName("iw.aq")
    public class254[][] field2921 = new class254[16][128];

    @ObfuscatedName("iw.ad")
    public class250 field2911 = new class250();

    @ObfuscatedName("iw.al")
    public boolean field2929;

    @ObfuscatedName("iw.aa")
    public int field2908;

    @ObfuscatedName("iw.aw")
    public int field2919;

    @ObfuscatedName("iw.at")
    public long field2932;

    @ObfuscatedName("iw.as")
    public long field2933;

    @ObfuscatedName("iw.ae")
    public class252 field2934 = new class252(this);

    public class249() {
        this.method4286();
    }

    @ObfuscatedName("iw.n(II)V")
    public synchronized void method4243(int arg0) {
        this.field2923 = arg0;
    }

    @ObfuscatedName("iw.c(I)I")
    public int method4244() {
        return this.field2923;
    }

    @ObfuscatedName("iw.m(Lic;Lkk;Lao;II)Z")
    public synchronized boolean method4245(class253 arg0, class290 arg1, class41 arg2, int arg3) {
        arg0.method4423();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class366 var7 = (class366) arg0.field2966.method6017(); var7 != null; var7 = (class366) arg0.field2966.method6019()) {
            int var8 = (int) var7.field4056;
            class251 var9 = (class251) this.field2916.method6016((long) var8);
            if (var9 == null) {
                var9 = class251.method3157(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field2916.method6015(var9, (long) var8);
            }
            if (!var9.method4404(arg2, var7.field4052, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method4424();
        }
        return var5;
    }

    @ObfuscatedName("iw.k(I)V")
    public synchronized void method4265() {
        for (class251 var1 = (class251) this.field2916.method6017(); var1 != null; var1 = (class251) this.field2916.method6019()) {
            var1.method4405();
        }
    }

    @ObfuscatedName("iw.o(B)V")
    public synchronized void method4246() {
        for (class251 var1 = (class251) this.field2916.method6017(); var1 != null; var1 = (class251) this.field2916.method6019()) {
            var1.method5732();
        }
    }

    @ObfuscatedName("iw.e(Lic;ZB)V")
    public synchronized void method4247(class253 arg0, boolean arg1) {
        this.method4248();
        this.field2911.method4351(arg0.field2967);
        this.field2929 = arg1;
        this.field2932 = 0L;
        int var3 = this.field2911.method4354();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2911.method4355(var4);
            this.field2911.method4383(var4);
            this.field2911.method4363(var4);
        }
        this.field2908 = this.field2911.method4362();
        this.field2919 = this.field2911.field2948[this.field2908];
        this.field2933 = this.field2911.method4372(this.field2919);
    }

    @ObfuscatedName("iw.y(I)V")
    public synchronized void method4248() {
        this.field2911.method4352();
        this.method4286();
    }

    @ObfuscatedName("iw.v(I)Z")
    public synchronized boolean method4249() {
        return this.field2911.method4390();
    }

    @ObfuscatedName("iw.f(IIB)V")
    public synchronized void method4250(int arg0, int arg1) {
        this.method4251(arg0, arg1);
    }

    @ObfuscatedName("iw.s(IIB)V")
    public void method4251(int arg0, int arg1) {
        this.field2913[arg0] = arg1;
        this.field2915[arg0] = arg1 & 0xFFFFFF80;
        this.method4252(arg0, arg1);
    }

    @ObfuscatedName("iw.h(III)V")
    public void method4252(int arg0, int arg1) {
        if (this.field2914[arg0] != arg1) {
            this.field2914[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2921[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("iw.d(IIII)V")
    public void method4259(int arg0, int arg1, int arg2) {
        this.method4255(arg0, arg1, 64);
        if ((this.field2930[arg0] & 0x2) != 0) {
            for (class254 var4 = (class254) this.field2934.field2962.method4965(); var4 != null; var4 = (class254) this.field2934.field2962.method4959()) {
                if (var4.field2971 == arg0 && var4.field2986 < 0) {
                    this.field2928[arg0][var4.field2987] = null;
                    this.field2928[arg0][arg1] = var4;
                    int var5 = (var4.field2978 * var4.field2977 >> 12) + var4.field2976;
                    var4.field2976 += arg1 - var4.field2987 << 8;
                    var4.field2977 = var5 - var4.field2976;
                    var4.field2978 = 4096;
                    var4.field2987 = arg1;
                    return;
                }
            }
        }
        class251 var6 = (class251) this.field2916.method6016((long) this.field2914[arg0]);
        if (var6 == null) {
            return;
        }
        class36 var7 = var6.field2952[arg1];
        if (var7 == null) {
            return;
        }
        class254 var8 = new class254();
        var8.field2971 = arg0;
        var8.field2969 = var6;
        var8.field2970 = var7;
        var8.field2973 = var6.field2955[arg1];
        var8.field2972 = var6.field2956[arg1];
        var8.field2987 = arg1;
        var8.field2974 = var6.field2958 * arg2 * arg2 * var6.field2953[arg1] + 1024 >> 11;
        var8.field2980 = var6.field2954[arg1] & 0xFF;
        var8.field2976 = (arg1 << 8) - (var6.field2950[arg1] & 0x7FFF);
        var8.field2979 = 0;
        var8.field2988 = 0;
        var8.field2981 = 0;
        var8.field2986 = -1;
        var8.field2982 = 0;
        if (this.field2926[arg0] == 0) {
            var8.field2968 = class43.method773(var7, this.method4278(var8), this.method4296(var8), this.method4267(var8));
        } else {
            var8.field2968 = class43.method773(var7, this.method4278(var8), 0, this.method4267(var8));
            this.method4254(var8, var6.field2950[arg1] < 0);
        }
        if (var6.field2950[arg1] < 0) {
            var8.field2968.method775(-1);
        }
        if (var8.field2972 >= 0) {
            class254 var9 = this.field2921[arg0][var8.field2972];
            if (var9 != null && var9.field2986 < 0) {
                this.field2928[arg0][var9.field2987] = null;
                var9.field2986 = 0;
            }
            this.field2921[arg0][var8.field2972] = var8;
        }
        this.field2934.field2962.method4986(var8);
        this.field2928[arg0][arg1] = var8;
    }

    @ObfuscatedName("iw.q(Lid;ZI)V")
    public void method4254(class254 arg0, boolean arg1) {
        int var3 = arg0.field2970.field250.length;
        int var5;
        if (arg1 && arg0.field2970.field251) {
            int var4 = var3 + var3 - arg0.field2970.field254;
            var5 = (int) ((long) this.field2926[arg0.field2971] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2968.method885(true);
            }
        } else {
            var5 = (int) ((long) this.field2926[arg0.field2971] * (long) var3 >> 6);
        }
        arg0.field2968.method781(var5);
    }

    @ObfuscatedName("iw.j(IIII)V")
    public void method4255(int arg0, int arg1, int arg2) {
        class254 var4 = this.field2928[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2928[arg0][arg1] = null;
        if ((this.field2930[arg0] & 0x2) == 0) {
            var4.field2986 = 0;
            return;
        }
        for (class254 var5 = (class254) this.field2934.field2962.method4962(); var5 != null; var5 = (class254) this.field2934.field2962.method4985()) {
            if (var4.field2971 == var5.field2971 && var5.field2986 < 0 && var4 != var5) {
                var4.field2986 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("iw.x(IIII)V")
    public void method4256(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("iw.b(IIB)V")
    public void method4257(int arg0, int arg1) {
    }

    @ObfuscatedName("iw.t(III)V")
    public void method4321(int arg0, int arg1) {
        this.field2907[arg0] = arg1;
    }

    @ObfuscatedName("iw.r(IB)V")
    public void method4258(int arg0) {
        for (class254 var2 = (class254) this.field2934.field2962.method4962(); var2 != null; var2 = (class254) this.field2934.field2962.method4985()) {
            if (arg0 < 0 || var2.field2971 == arg0) {
                if (var2.field2968 != null) {
                    var2.field2968.method786(Statics.field3288 / 100);
                    if (var2.field2968.method789()) {
                        this.field2934.field2961.method607(var2.field2968);
                    }
                    var2.method4433();
                }
                if (var2.field2986 < 0) {
                    this.field2928[var2.field2971][var2.field2987] = null;
                }
                var2.method5732();
            }
        }
    }

    @ObfuscatedName("iw.p(II)V")
    public void method4337(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method4337(var2);
            }
            return;
        }
        this.field2910[arg0] = 12800;
        this.field2927[arg0] = 8192;
        this.field2912[arg0] = 16383;
        this.field2907[arg0] = 8192;
        this.field2917[arg0] = 0;
        this.field2918[arg0] = 8192;
        this.method4309(arg0);
        this.method4289(arg0);
        this.field2930[arg0] = 0;
        this.field2931[arg0] = 32767;
        this.field2922[arg0] = 256;
        this.field2926[arg0] = 0;
        this.method4307(arg0, 8192);
    }

    @ObfuscatedName("iw.w(IB)V")
    public void method4346(int arg0) {
        for (class254 var2 = (class254) this.field2934.field2962.method4962(); var2 != null; var2 = (class254) this.field2934.field2962.method4985()) {
            if ((arg0 < 0 || var2.field2971 == arg0) && var2.field2986 < 0) {
                this.field2928[var2.field2971][var2.field2987] = null;
                var2.field2986 = 0;
            }
        }
    }

    @ObfuscatedName("iw.av(I)V")
    public void method4286() {
        this.method4258(-1);
        this.method4337(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2914[var1] = this.field2913[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2915[var2] = this.field2913[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("iw.ak(IB)V")
    public void method4309(int arg0) {
        if ((this.field2930[arg0] & 0x2) == 0) {
            return;
        }
        for (class254 var2 = (class254) this.field2934.field2962.method4962(); var2 != null; var2 = (class254) this.field2934.field2962.method4985()) {
            if (var2.field2971 == arg0 && this.field2928[arg0][var2.field2987] == null && var2.field2986 < 0) {
                var2.field2986 = 0;
            }
        }
    }

    @ObfuscatedName("iw.an(IB)V")
    public void method4289(int arg0) {
        if ((this.field2930[arg0] & 0x4) == 0) {
            return;
        }
        for (class254 var2 = (class254) this.field2934.field2962.method4962(); var2 != null; var2 = (class254) this.field2934.field2962.method4985()) {
            if (var2.field2971 == arg0) {
                var2.field2989 = 0;
            }
        }
    }

    @ObfuscatedName("iw.ab(IB)V")
    public void method4270(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method4255(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method4259(var6, var7, var8);
            } else {
                this.method4255(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method4256(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2915[var12] = (var14 << 14) + (this.field2915[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2915[var12] = (var14 << 7) + (this.field2915[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2917[var12] = (var14 << 7) + (this.field2917[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2917[var12] = (this.field2917[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2918[var12] = (var14 << 7) + (this.field2918[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2918[var12] = (this.field2918[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2910[var12] = (var14 << 7) + (this.field2910[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2910[var12] = (this.field2910[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2927[var12] = (var14 << 7) + (this.field2927[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2927[var12] = (this.field2927[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2912[var12] = (var14 << 7) + (this.field2912[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2912[var12] = (this.field2912[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2930[var12] |= 0x1;
                } else {
                    this.field2930[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2930[var12] |= 0x2;
                } else {
                    this.method4309(var12);
                    this.field2930[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2931[var12] = (var14 << 7) + (this.field2931[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2931[var12] = (this.field2931[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2931[var12] = (var14 << 7) + (this.field2931[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2931[var12] = (this.field2931[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method4258(var12);
            }
            if (var13 == 121) {
                this.method4337(var12);
            }
            if (var13 == 123) {
                this.method4346(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2931[var12];
                if (var15 == 16384) {
                    this.field2922[var12] = (var14 << 7) + (this.field2922[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2931[var12];
                if (var16 == 16384) {
                    this.field2922[var12] = (this.field2922[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2926[var12] = (var14 << 7) + (this.field2926[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2926[var12] = (this.field2926[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2930[var12] |= 0x4;
                } else {
                    this.method4289(var12);
                    this.field2930[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method4307(var12, (var14 << 7) + (this.field2924[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method4307(var12, (this.field2924[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method4252(var17, this.field2915[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method4257(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method4321(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method4286();
            }
        }
    }

    @ObfuscatedName("iw.au(III)V")
    public void method4307(int arg0, int arg1) {
        this.field2924[arg0] = arg1;
        this.field2925[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("iw.am(Lid;I)I")
    public int method4278(class254 arg0) {
        int var2 = (arg0.field2978 * arg0.field2977 >> 12) + arg0.field2976;
        int var3 = ((this.field2907[arg0.field2971] - 8192) * this.field2922[arg0.field2971] >> 12) + var2;
        class247 var4 = arg0.field2973;
        if (var4.field2891 > 0 && (var4.field2894 > 0 || this.field2917[arg0.field2971] > 0)) {
            int var5 = var4.field2894 << 2;
            int var6 = var4.field2888 << 1;
            if (arg0.field2984 < var6) {
                var5 = arg0.field2984 * var5 / var6;
            }
            int var7 = (this.field2917[arg0.field2971] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2985 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2970.field252 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field3288 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("iw.ao(Lid;I)I")
    public int method4296(class254 arg0) {
        class247 var2 = arg0.field2973;
        int var3 = this.field2910[arg0.field2971] * this.field2912[arg0.field2971] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2974 * var4 + 16384 >> 15;
        int var6 = this.field2923 * var5 + 128 >> 8;
        if (var2.field2890 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2979 * 1.953125E-5D * (double) var2.field2890) + 0.5D);
        }
        if (var2.field2897 != null) {
            int var7 = arg0.field2988;
            int var8 = var2.field2897[arg0.field2981 + 1];
            if (arg0.field2981 < var2.field2897.length - 2) {
                int var9 = (var2.field2897[arg0.field2981] & 0xFF) << 8;
                int var10 = (var2.field2897[arg0.field2981 + 2] & 0xFF) << 8;
                var8 += (var2.field2897[arg0.field2981 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2986 > 0 && var2.field2889 != null) {
            int var11 = arg0.field2986;
            int var12 = var2.field2889[arg0.field2982 + 1];
            if (arg0.field2982 < var2.field2889.length - 2) {
                int var13 = (var2.field2889[arg0.field2982] & 0xFF) << 8;
                int var14 = (var2.field2889[arg0.field2982 + 2] & 0xFF) << 8;
                var12 += (var2.field2889[arg0.field2982 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("iw.az(Lid;B)I")
    public int method4267(class254 arg0) {
        int var2 = this.field2927[arg0.field2971];
        return var2 < 8192 ? arg0.field2980 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2980) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("iw.g()Lap;")
    public synchronized class44 method612() {
        return this.field2934;
    }

    @ObfuscatedName("iw.z()Lap;")
    public synchronized class44 method613() {
        return null;
    }

    @ObfuscatedName("iw.a()I")
    public synchronized int method614() {
        return 0;
    }

    @ObfuscatedName("iw.u([III)V")
    public synchronized void method615(int[] arg0, int arg1, int arg2) {
        if (this.field2911.method4390()) {
            int var4 = this.field2909 * this.field2911.field2937 / Statics.field3288;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2932;
                if (this.field2933 - var5 >= 0L) {
                    this.field2932 = var5;
                    break;
                }
                int var7 = (int) ((this.field2933 - this.field2932 + (long) var4 - 1L) / (long) var4);
                this.field2932 += (long) var4 * (long) var7;
                this.field2934.method615(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method4269();
            } while (this.field2911.method4390());
        }
        this.field2934.method615(arg0, arg1, arg2);
    }

    @ObfuscatedName("iw.l(I)V")
    public synchronized void method641(int arg0) {
        if (this.field2911.method4390()) {
            int var2 = this.field2909 * this.field2911.field2937 / Statics.field3288;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2932;
                if (this.field2933 - var3 >= 0L) {
                    this.field2932 = var3;
                    break;
                }
                int var5 = (int) ((this.field2933 - this.field2932 + (long) var2 - 1L) / (long) var2);
                this.field2932 += (long) var2 * (long) var5;
                this.field2934.method641(var5);
                arg0 -= var5;
                this.method4269();
            } while (this.field2911.method4390());
        }
        this.field2934.method641(arg0);
    }

    @ObfuscatedName("iw.bd(I)V")
    public void method4269() {
        int var1 = this.field2908;
        int var2 = this.field2919;
        long var3 = this.field2933;
        while (this.field2919 == var2) {
            while (this.field2911.field2948[var1] == var2) {
                this.field2911.method4355(var1);
                int var5 = this.field2911.method4359(var1);
                if (var5 == 1) {
                    this.field2911.method4357();
                    this.field2911.method4363(var1);
                    if (this.field2911.method4391()) {
                        if (!this.field2929 || var2 == 0) {
                            this.method4286();
                            this.field2911.method4352();
                            return;
                        }
                        this.field2911.method4364(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method4270(var5);
                }
                this.field2911.method4383(var1);
                this.field2911.method4363(var1);
            }
            var1 = this.field2911.method4362();
            var2 = this.field2911.field2948[var1];
            var3 = this.field2911.method4372(var2);
        }
        this.field2908 = var1;
        this.field2919 = var2;
        this.field2933 = var3;
    }

    @ObfuscatedName("iw.bt(Lid;I)Z")
    public boolean method4268(class254 arg0) {
        if (arg0.field2968 != null) {
            return false;
        }
        if (arg0.field2986 >= 0) {
            arg0.method5732();
            if (arg0.field2972 > 0 && this.field2921[arg0.field2971][arg0.field2972] == arg0) {
                this.field2921[arg0.field2971][arg0.field2972] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("iw.bf(Lid;[IIII)Z")
    public boolean method4276(class254 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2983 = Statics.field3288 / 100;
        if (arg0.field2986 >= 0 && arg0.field2968 == null || arg0.field2968.method823()) {
            arg0.method4433();
            arg0.method5732();
            if (arg0.field2972 > 0 && this.field2921[arg0.field2971][arg0.field2972] == arg0) {
                this.field2921[arg0.field2971][arg0.field2972] = null;
            }
            return true;
        }
        int var5 = arg0.field2978;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2918[arg0.field2971] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2978 = var6;
        }
        arg0.field2968.method803(this.method4278(arg0));
        class247 var7 = arg0.field2973;
        boolean var8 = false;
        arg0.field2984++;
        arg0.field2985 += var7.field2891;
        double var9 = (double) ((arg0.field2987 - 60 << 8) + (arg0.field2978 * arg0.field2977 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2890 > 0) {
            if (var7.field2893 > 0) {
                arg0.field2979 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2893 * var9) + 0.5D);
            } else {
                arg0.field2979 += 128;
            }
        }
        if (var7.field2897 != null) {
            if (var7.field2896 > 0) {
                arg0.field2988 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2896 * var9) + 0.5D);
            } else {
                arg0.field2988 += 128;
            }
            while (arg0.field2981 < var7.field2897.length - 2 && arg0.field2988 > (var7.field2897[arg0.field2981 + 2] & 0xFF) << 8) {
                arg0.field2981 += 2;
            }
            if (arg0.field2981 == var7.field2897.length - 2 && var7.field2897[arg0.field2981 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2986 >= 0 && var7.field2889 != null && (this.field2930[arg0.field2971] & 0x1) == 0 && (arg0.field2972 < 0 || this.field2921[arg0.field2971][arg0.field2972] != arg0)) {
            if (var7.field2892 > 0) {
                arg0.field2986 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2892 * var9) + 0.5D);
            } else {
                arg0.field2986 += 128;
            }
            while (arg0.field2982 < var7.field2889.length - 2 && arg0.field2986 > (var7.field2889[arg0.field2982 + 2] & 0xFF) << 8) {
                arg0.field2982 += 2;
            }
            if (arg0.field2982 == var7.field2889.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2968.method785(arg0.field2983, this.method4296(arg0), this.method4267(arg0));
            return false;
        }
        arg0.field2968.method786(arg0.field2983);
        if (arg1 == null) {
            arg0.field2968.method641(arg3);
        } else {
            arg0.field2968.method615(arg1, arg2, arg3);
        }
        if (arg0.field2968.method789()) {
            this.field2934.field2961.method607(arg0.field2968);
        }
        arg0.method4433();
        if (arg0.field2986 >= 0) {
            arg0.method5732();
            if (arg0.field2972 > 0 && this.field2921[arg0.field2971][arg0.field2972] == arg0) {
                this.field2921[arg0.field2971][arg0.field2972] = null;
            }
        }
        return true;
    }
}
