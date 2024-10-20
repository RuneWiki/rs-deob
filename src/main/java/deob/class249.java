package deob;

@ObfuscatedName("ig")
public class class249 extends class44 {

    @ObfuscatedName("ig.l")
    public class380 field2942 = new class380(128);

    @ObfuscatedName("ig.q")
    public int field2923 = 256;

    @ObfuscatedName("ig.f")
    public int field2948 = 1000000;

    @ObfuscatedName("ig.j")
    public int[] field2935 = new int[16];

    @ObfuscatedName("ig.m")
    public int[] field2926 = new int[16];

    @ObfuscatedName("ig.k")
    public int[] field2931 = new int[16];

    @ObfuscatedName("ig.t")
    public int[] field2928 = new int[16];

    @ObfuscatedName("ig.a")
    public int[] field2939 = new int[16];

    @ObfuscatedName("ig.e")
    public int[] field2930 = new int[16];

    @ObfuscatedName("ig.i")
    public int[] field2946 = new int[16];

    @ObfuscatedName("ig.y")
    public int[] field2932 = new int[16];

    @ObfuscatedName("ig.g")
    public int[] field2933 = new int[16];

    @ObfuscatedName("ig.z")
    public int[] field2949 = new int[16];

    @ObfuscatedName("ig.h")
    public int[] field2936 = new int[16];

    @ObfuscatedName("ig.o")
    public int[] field2929 = new int[16];

    @ObfuscatedName("ig.r")
    public int[] field2938 = new int[16];

    @ObfuscatedName("ig.n")
    public int[] field2927 = new int[16];

    @ObfuscatedName("ig.u")
    public int[] field2940 = new int[16];

    @ObfuscatedName("ig.d")
    public class254[][] field2941 = new class254[16][128];

    @ObfuscatedName("ig.ab")
    public class254[][] field2925 = new class254[16][128];

    @ObfuscatedName("ig.ad")
    public class250 field2943 = new class250();

    @ObfuscatedName("ig.as")
    public boolean field2944;

    @ObfuscatedName("ig.ak")
    public int field2945;

    @ObfuscatedName("ig.ah")
    public int field2924;

    @ObfuscatedName("ig.ay")
    public long field2947;

    @ObfuscatedName("ig.al")
    public long field2937;

    @ObfuscatedName("ig.ao")
    public class252 field2922 = new class252(this);

    public class249() {
        this.method4314();
    }

    @ObfuscatedName("ig.l(II)V")
    public synchronized void method4334(int arg0) {
        this.field2923 = arg0;
    }

    @ObfuscatedName("ig.q(I)I")
    public int method4296() {
        return this.field2923;
    }

    @ObfuscatedName("ig.f(Lim;Lkl;Lat;IB)Z")
    public synchronized boolean method4297(class253 arg0, class290 arg1, class41 arg2, int arg3) {
        arg0.method4469();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class367 var7 = (class367) arg0.field2977.method6062(); var7 != null; var7 = (class367) arg0.field2977.method6060()) {
            int var8 = (int) var7.field4075;
            class251 var9 = (class251) this.field2942.method6061((long) var8);
            if (var9 == null) {
                var9 = class251.method2848(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field2942.method6065(var9, (long) var8);
            }
            if (!var9.method4453(arg2, var7.field4072, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method4475();
        }
        return var5;
    }

    @ObfuscatedName("ig.j(B)V")
    public synchronized void method4298() {
        for (class251 var1 = (class251) this.field2942.method6062(); var1 != null; var1 = (class251) this.field2942.method6060()) {
            var1.method4451();
        }
    }

    @ObfuscatedName("ig.m(B)V")
    public synchronized void method4299() {
        for (class251 var1 = (class251) this.field2942.method6062(); var1 != null; var1 = (class251) this.field2942.method6060()) {
            var1.method5775();
        }
    }

    @ObfuscatedName("ig.i(Lim;ZI)V")
    public synchronized void method4359(class253 arg0, boolean arg1) {
        this.method4301();
        this.field2943.method4408(arg0.field2978);
        this.field2944 = arg1;
        this.field2947 = 0L;
        int var3 = this.field2943.method4406();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2943.method4400(var4);
            this.field2943.method4413(var4);
            this.field2943.method4401(var4);
        }
        this.field2945 = this.field2943.method4405();
        this.field2924 = this.field2943.field2954[this.field2945];
        this.field2937 = this.field2943.method4416(this.field2924);
    }

    @ObfuscatedName("ig.w(B)V")
    public synchronized void method4301() {
        this.field2943.method4397();
        this.method4314();
    }

    @ObfuscatedName("ig.g(B)Z")
    public synchronized boolean method4302() {
        return this.field2943.method4412();
    }

    @ObfuscatedName("ig.v(III)V")
    public synchronized void method4321(int arg0, int arg1) {
        this.method4369(arg0, arg1);
    }

    @ObfuscatedName("ig.s(III)V")
    public void method4369(int arg0, int arg1) {
        this.field2928[arg0] = arg1;
        this.field2930[arg0] = arg1 & 0xFFFFFF80;
        this.method4311(arg0, arg1);
    }

    @ObfuscatedName("ig.c(IIB)V")
    public void method4311(int arg0, int arg1) {
        if (this.field2939[arg0] != arg1) {
            this.field2939[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2925[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("ig.b(IIIB)V")
    public void method4330(int arg0, int arg1, int arg2) {
        this.method4308(arg0, arg1, 64);
        if ((this.field2949[arg0] & 0x2) != 0) {
            for (class254 var4 = (class254) this.field2922.field2976.method5021(); var4 != null; var4 = (class254) this.field2922.field2976.method5023()) {
                if (var4.field2981 == arg0 && var4.field2979 < 0) {
                    this.field2941[arg0][var4.field2989] = null;
                    this.field2941[arg0][arg1] = var4;
                    int var5 = (var4.field2988 * var4.field2984 >> 12) + var4.field2987;
                    var4.field2987 += arg1 - var4.field2989 << 8;
                    var4.field2988 = var5 - var4.field2987;
                    var4.field2984 = 4096;
                    var4.field2989 = arg1;
                    return;
                }
            }
        }
        class251 var6 = (class251) this.field2942.method6061((long) this.field2939[arg0]);
        if (var6 == null) {
            return;
        }
        class36 var7 = var6.field2964[arg1];
        if (var7 == null) {
            return;
        }
        class254 var8 = new class254();
        var8.field2981 = arg0;
        var8.field2980 = var6;
        var8.field2993 = var7;
        var8.field2982 = var6.field2969[arg1];
        var8.field2986 = var6.field2965[arg1];
        var8.field2989 = arg1;
        var8.field2985 = var6.field2970 * arg2 * arg2 * var6.field2967[arg1] + 1024 >> 11;
        var8.field2983 = var6.field2971[arg1] & 0xFF;
        var8.field2987 = (arg1 << 8) - (var6.field2966[arg1] & 0x7FFF);
        var8.field2990 = 0;
        var8.field2991 = 0;
        var8.field2992 = 0;
        var8.field2979 = -1;
        var8.field2994 = 0;
        if (this.field2938[arg0] == 0) {
            var8.field2997 = class43.method767(var7, this.method4318(var8), this.method4360(var8), this.method4319(var8));
        } else {
            var8.field2997 = class43.method767(var7, this.method4318(var8), 0, this.method4319(var8));
            this.method4380(var8, var6.field2966[arg1] < 0);
        }
        if (var6.field2966[arg1] < 0) {
            var8.field2997.method769(-1);
        }
        if (var8.field2986 >= 0) {
            class254 var9 = this.field2925[arg0][var8.field2986];
            if (var9 != null && var9.field2979 < 0) {
                this.field2941[arg0][var9.field2989] = null;
                var9.field2979 = 0;
            }
            this.field2925[arg0][var8.field2986] = var8;
        }
        this.field2922.field2976.method5015(var8);
        this.field2941[arg0][arg1] = var8;
    }

    @ObfuscatedName("ig.x(Lib;ZI)V")
    public void method4380(class254 arg0, boolean arg1) {
        int var3 = arg0.field2993.field246.length;
        int var5;
        if (arg1 && arg0.field2993.field250) {
            int var4 = var3 + var3 - arg0.field2993.field247;
            var5 = (int) ((long) this.field2938[arg0.field2981] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2997.method776(true);
            }
        } else {
            var5 = (int) ((long) this.field2938[arg0.field2981] * (long) var3 >> 6);
        }
        arg0.field2997.method809(var5);
    }

    @ObfuscatedName("ig.p(IIII)V")
    public void method4308(int arg0, int arg1, int arg2) {
        class254 var4 = this.field2941[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2941[arg0][arg1] = null;
        if ((this.field2949[arg0] & 0x2) == 0) {
            var4.field2979 = 0;
            return;
        }
        for (class254 var5 = (class254) this.field2922.field2976.method5035(); var5 != null; var5 = (class254) this.field2922.field2976.method5022()) {
            if (var4.field2981 == var5.field2981 && var5.field2979 < 0 && var4 != var5) {
                var4.field2979 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("ig.z(IIIS)V")
    public void method4328(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("ig.h(IIB)V")
    public void method4309(int arg0, int arg1) {
    }

    @ObfuscatedName("ig.o(IIS)V")
    public void method4310(int arg0, int arg1) {
        this.field2946[arg0] = arg1;
    }

    @ObfuscatedName("ig.r(II)V")
    public void method4313(int arg0) {
        for (class254 var2 = (class254) this.field2922.field2976.method5035(); var2 != null; var2 = (class254) this.field2922.field2976.method5022()) {
            if (arg0 < 0 || var2.field2981 == arg0) {
                if (var2.field2997 != null) {
                    var2.field2997.method780(Statics.field280 / 100);
                    if (var2.field2997.method881()) {
                        this.field2922.field2974.method636(var2.field2997);
                    }
                    var2.method4478();
                }
                if (var2.field2979 < 0) {
                    this.field2941[var2.field2981][var2.field2989] = null;
                }
                var2.method5775();
            }
        }
    }

    @ObfuscatedName("ig.n(IB)V")
    public void method4312(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method4312(var2);
            }
            return;
        }
        this.field2935[arg0] = 12800;
        this.field2926[arg0] = 8192;
        this.field2931[arg0] = 16383;
        this.field2946[arg0] = 8192;
        this.field2932[arg0] = 0;
        this.field2933[arg0] = 8192;
        this.method4315(arg0);
        this.method4316(arg0);
        this.field2949[arg0] = 0;
        this.field2936[arg0] = 32767;
        this.field2929[arg0] = 256;
        this.field2938[arg0] = 0;
        this.method4300(arg0, 8192);
    }

    @ObfuscatedName("ig.u(II)V")
    public void method4365(int arg0) {
        for (class254 var2 = (class254) this.field2922.field2976.method5035(); var2 != null; var2 = (class254) this.field2922.field2976.method5022()) {
            if ((arg0 < 0 || var2.field2981 == arg0) && var2.field2979 < 0) {
                this.field2941[var2.field2981][var2.field2989] = null;
                var2.field2979 = 0;
            }
        }
    }

    @ObfuscatedName("ig.ah(B)V")
    public void method4314() {
        this.method4313(-1);
        this.method4312(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2939[var1] = this.field2928[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2930[var2] = this.field2928[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("ig.ay(IB)V")
    public void method4315(int arg0) {
        if ((this.field2949[arg0] & 0x2) == 0) {
            return;
        }
        for (class254 var2 = (class254) this.field2922.field2976.method5035(); var2 != null; var2 = (class254) this.field2922.field2976.method5022()) {
            if (var2.field2981 == arg0 && this.field2941[arg0][var2.field2989] == null && var2.field2979 < 0) {
                var2.field2979 = 0;
            }
        }
    }

    @ObfuscatedName("ig.al(II)V")
    public void method4316(int arg0) {
        if ((this.field2949[arg0] & 0x4) == 0) {
            return;
        }
        for (class254 var2 = (class254) this.field2922.field2976.method5035(); var2 != null; var2 = (class254) this.field2922.field2976.method5022()) {
            if (var2.field2981 == arg0) {
                var2.field2999 = 0;
            }
        }
    }

    @ObfuscatedName("ig.au(II)V")
    public void method4317(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method4308(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method4330(var6, var7, var8);
            } else {
                this.method4308(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method4328(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2930[var12] = (var14 << 14) + (this.field2930[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2930[var12] = (var14 << 7) + (this.field2930[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2932[var12] = (var14 << 7) + (this.field2932[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2932[var12] = (this.field2932[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2933[var12] = (var14 << 7) + (this.field2933[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2933[var12] = (this.field2933[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2935[var12] = (var14 << 7) + (this.field2935[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2935[var12] = (this.field2935[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2926[var12] = (var14 << 7) + (this.field2926[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2926[var12] = (this.field2926[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2931[var12] = (var14 << 7) + (this.field2931[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2931[var12] = (this.field2931[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2949[var12] |= 0x1;
                } else {
                    this.field2949[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2949[var12] |= 0x2;
                } else {
                    this.method4315(var12);
                    this.field2949[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2936[var12] = (var14 << 7) + (this.field2936[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2936[var12] = (this.field2936[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2936[var12] = (var14 << 7) + (this.field2936[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2936[var12] = (this.field2936[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method4313(var12);
            }
            if (var13 == 121) {
                this.method4312(var12);
            }
            if (var13 == 123) {
                this.method4365(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2936[var12];
                if (var15 == 16384) {
                    this.field2929[var12] = (var14 << 7) + (this.field2929[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2936[var12];
                if (var16 == 16384) {
                    this.field2929[var12] = (this.field2929[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2938[var12] = (var14 << 7) + (this.field2938[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2938[var12] = (this.field2938[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2949[var12] |= 0x4;
                } else {
                    this.method4316(var12);
                    this.field2949[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method4300(var12, (var14 << 7) + (this.field2927[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method4300(var12, (this.field2927[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method4311(var17, this.field2930[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method4309(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method4310(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method4314();
            }
        }
    }

    @ObfuscatedName("ig.ar(III)V")
    public void method4300(int arg0, int arg1) {
        this.field2927[arg0] = arg1;
        this.field2940[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("ig.ac(Lib;I)I")
    public int method4318(class254 arg0) {
        int var2 = (arg0.field2988 * arg0.field2984 >> 12) + arg0.field2987;
        int var3 = ((this.field2946[arg0.field2981] - 8192) * this.field2929[arg0.field2981] >> 12) + var2;
        class247 var4 = arg0.field2982;
        if (var4.field2908 > 0 && (var4.field2907 > 0 || this.field2932[arg0.field2981] > 0)) {
            int var5 = var4.field2907 << 2;
            int var6 = var4.field2909 << 1;
            if (arg0.field2995 < var6) {
                var5 = arg0.field2995 * var5 / var6;
            }
            int var7 = (this.field2932[arg0.field2981] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2996 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2993.field248 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field280 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("ig.at(Lib;B)I")
    public int method4360(class254 arg0) {
        class247 var2 = arg0.field2982;
        int var3 = this.field2935[arg0.field2981] * this.field2931[arg0.field2981] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2985 * var4 + 16384 >> 15;
        int var6 = this.field2923 * var5 + 128 >> 8;
        if (var2.field2903 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2990 * 1.953125E-5D * (double) var2.field2903) + 0.5D);
        }
        if (var2.field2904 != null) {
            int var7 = arg0.field2991;
            int var8 = var2.field2904[arg0.field2992 + 1];
            if (arg0.field2992 < var2.field2904.length - 2) {
                int var9 = (var2.field2904[arg0.field2992] & 0xFF) << 8;
                int var10 = (var2.field2904[arg0.field2992 + 2] & 0xFF) << 8;
                var8 += (var2.field2904[arg0.field2992 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2979 > 0 && var2.field2902 != null) {
            int var11 = arg0.field2979;
            int var12 = var2.field2902[arg0.field2994 + 1];
            if (arg0.field2994 < var2.field2902.length - 2) {
                int var13 = (var2.field2902[arg0.field2994] & 0xFF) << 8;
                int var14 = (var2.field2902[arg0.field2994 + 2] & 0xFF) << 8;
                var12 += (var2.field2902[arg0.field2994 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("ig.ax(Lib;I)I")
    public int method4319(class254 arg0) {
        int var2 = this.field2926[arg0.field2981];
        return var2 < 8192 ? arg0.field2983 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2983) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("ig.k()Lav;")
    public synchronized class44 method615() {
        return this.field2922;
    }

    @ObfuscatedName("ig.t()Lav;")
    public synchronized class44 method616() {
        return null;
    }

    @ObfuscatedName("ig.a()I")
    public synchronized int method624() {
        return 0;
    }

    @ObfuscatedName("ig.e([III)V")
    public synchronized void method618(int[] arg0, int arg1, int arg2) {
        if (this.field2943.method4412()) {
            int var4 = this.field2948 * this.field2943.field2951 / Statics.field280;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2947;
                if (this.field2937 - var5 >= 0L) {
                    this.field2947 = var5;
                    break;
                }
                int var7 = (int) ((this.field2937 - this.field2947 + (long) var4 - 1L) / (long) var4);
                this.field2947 += (long) var4 * (long) var7;
                this.field2922.method618(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method4322();
            } while (this.field2943.method4412());
        }
        this.field2922.method618(arg0, arg1, arg2);
    }

    @ObfuscatedName("ig.y(I)V")
    public synchronized void method613(int arg0) {
        if (this.field2943.method4412()) {
            int var2 = this.field2948 * this.field2943.field2951 / Statics.field280;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2947;
                if (this.field2937 - var3 >= 0L) {
                    this.field2947 = var3;
                    break;
                }
                int var5 = (int) ((this.field2937 - this.field2947 + (long) var2 - 1L) / (long) var2);
                this.field2947 += (long) var2 * (long) var5;
                this.field2922.method613(var5);
                arg0 -= var5;
                this.method4322();
            } while (this.field2943.method4412());
        }
        this.field2922.method613(arg0);
    }

    @ObfuscatedName("ig.an(I)V")
    public void method4322() {
        int var1 = this.field2945;
        int var2 = this.field2924;
        long var3 = this.field2937;
        while (this.field2924 == var2) {
            while (this.field2943.field2954[var1] == var2) {
                this.field2943.method4400(var1);
                int var5 = this.field2943.method4404(var1);
                if (var5 == 1) {
                    this.field2943.method4402();
                    this.field2943.method4401(var1);
                    if (this.field2943.method4409()) {
                        if (!this.field2944 || var2 == 0) {
                            this.method4314();
                            this.field2943.method4397();
                            return;
                        }
                        this.field2943.method4410(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method4317(var5);
                }
                this.field2943.method4413(var1);
                this.field2943.method4401(var1);
            }
            var1 = this.field2943.method4405();
            var2 = this.field2943.field2954[var1];
            var3 = this.field2943.method4416(var2);
        }
        this.field2945 = var1;
        this.field2924 = var2;
        this.field2937 = var3;
    }

    @ObfuscatedName("ig.av(Lib;B)Z")
    public boolean method4375(class254 arg0) {
        if (arg0.field2997 != null) {
            return false;
        }
        if (arg0.field2979 >= 0) {
            arg0.method5775();
            if (arg0.field2986 > 0 && this.field2925[arg0.field2981][arg0.field2986] == arg0) {
                this.field2925[arg0.field2981][arg0.field2986] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("ig.ap(Lib;[IIII)Z")
    public boolean method4324(class254 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2998 = Statics.field280 / 100;
        if (arg0.field2979 >= 0 && arg0.field2997 == null || arg0.field2997.method783()) {
            arg0.method4478();
            arg0.method5775();
            if (arg0.field2986 > 0 && this.field2925[arg0.field2981][arg0.field2986] == arg0) {
                this.field2925[arg0.field2981][arg0.field2986] = null;
            }
            return true;
        }
        int var5 = arg0.field2984;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2933[arg0.field2981] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2984 = var6;
        }
        arg0.field2997.method781(this.method4318(arg0));
        class247 var7 = arg0.field2982;
        boolean var8 = false;
        arg0.field2995++;
        arg0.field2996 += var7.field2908;
        double var9 = (double) ((arg0.field2989 - 60 << 8) + (arg0.field2988 * arg0.field2984 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2903 > 0) {
            if (var7.field2906 > 0) {
                arg0.field2990 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2906 * var9) + 0.5D);
            } else {
                arg0.field2990 += 128;
            }
        }
        if (var7.field2904 != null) {
            if (var7.field2901 > 0) {
                arg0.field2991 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2901 * var9) + 0.5D);
            } else {
                arg0.field2991 += 128;
            }
            while (arg0.field2992 < var7.field2904.length - 2 && arg0.field2991 > (var7.field2904[arg0.field2992 + 2] & 0xFF) << 8) {
                arg0.field2992 += 2;
            }
            if (arg0.field2992 == var7.field2904.length - 2 && var7.field2904[arg0.field2992 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2979 >= 0 && var7.field2902 != null && (this.field2949[arg0.field2981] & 0x1) == 0 && (arg0.field2986 < 0 || this.field2925[arg0.field2981][arg0.field2986] != arg0)) {
            if (var7.field2905 > 0) {
                arg0.field2979 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2905 * var9) + 0.5D);
            } else {
                arg0.field2979 += 128;
            }
            while (arg0.field2994 < var7.field2902.length - 2 && arg0.field2979 > (var7.field2902[arg0.field2994 + 2] & 0xFF) << 8) {
                arg0.field2994 += 2;
            }
            if (arg0.field2994 == var7.field2902.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2997.method779(arg0.field2998, this.method4360(arg0), this.method4319(arg0));
            return false;
        }
        arg0.field2997.method780(arg0.field2998);
        if (arg1 == null) {
            arg0.field2997.method613(arg3);
        } else {
            arg0.field2997.method618(arg1, arg2, arg3);
        }
        if (arg0.field2997.method881()) {
            this.field2922.field2974.method636(arg0.field2997);
        }
        arg0.method4478();
        if (arg0.field2979 >= 0) {
            arg0.method5775();
            if (arg0.field2986 > 0 && this.field2925[arg0.field2981][arg0.field2986] == arg0) {
                this.field2925[arg0.field2981][arg0.field2986] = null;
            }
        }
        return true;
    }
}
