package deob;

@ObfuscatedName("gd")
public class class184 extends class67 {

    @ObfuscatedName("gd.f")
    public class196 field2966 = new class196(128);

    @ObfuscatedName("gd.s")
    public int field2953 = 256;

    @ObfuscatedName("gd.q")
    public int field2954 = 1000000;

    @ObfuscatedName("gd.g")
    public int[] field2955 = new int[16];

    @ObfuscatedName("gd.m")
    public int[] field2956 = new int[16];

    @ObfuscatedName("gd.t")
    public int[] field2957 = new int[16];

    @ObfuscatedName("gd.j")
    public int[] field2952 = new int[16];

    @ObfuscatedName("gd.n")
    public int[] field2959 = new int[16];

    @ObfuscatedName("gd.l")
    public int[] field2978 = new int[16];

    @ObfuscatedName("gd.i")
    public int[] field2961 = new int[16];

    @ObfuscatedName("gd.v")
    public int[] field2962 = new int[16];

    @ObfuscatedName("gd.o")
    public int[] field2963 = new int[16];

    @ObfuscatedName("gd.u")
    public int[] field2965 = new int[16];

    @ObfuscatedName("gd.a")
    public int[] field2977 = new int[16];

    @ObfuscatedName("gd.x")
    public int[] field2960 = new int[16];

    @ObfuscatedName("gd.y")
    public int[] field2967 = new int[16];

    @ObfuscatedName("gd.c")
    public int[] field2968 = new int[16];

    @ObfuscatedName("gd.h")
    public int[] field2969 = new int[16];

    @ObfuscatedName("gd.e")
    public class187[][] field2958 = new class187[16][128];

    @ObfuscatedName("gd.ab")
    public class187[][] field2971 = new class187[16][128];

    @ObfuscatedName("gd.af")
    public class182 field2972 = new class182();

    @ObfuscatedName("gd.au")
    public boolean field2973;

    @ObfuscatedName("gd.ae")
    public int field2974;

    @ObfuscatedName("gd.ax")
    public int field2975;

    @ObfuscatedName("gd.az")
    public long field2976;

    @ObfuscatedName("gd.aa")
    public long field2964;

    @ObfuscatedName("gd.ak")
    public class186 field2970 = new class186(this);

    public class184() {
        this.method3394();
    }

    @ObfuscatedName("gd.f(II)V")
    public synchronized void method3375(int arg0) {
        this.field2953 = arg0;
    }

    @ObfuscatedName("gd.s(I)I")
    public int method3376() {
        return this.field2953;
    }

    @ObfuscatedName("gd.q(Lfu;Lfx;Lbl;II)Z")
    public synchronized boolean method3377(class180 arg0, class167 arg1, class60 arg2, int arg3) {
        arg0.method3290();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class197 var7 = (class197) arg0.field2919.method3543(); var7 != null; var7 = (class197) arg0.field2919.method3537()) {
            int var8 = (int) var7.field3105;
            class181 var9 = (class181) this.field2966.method3532((long) var8);
            if (var9 == null) {
                var9 = class181.method736(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field2966.method3534(var9, (long) var8);
            }
            if (!var9.method3298(arg2, var7.field3085, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3291();
        }
        return var5;
    }

    @ObfuscatedName("gd.g(I)V")
    public synchronized void method3451() {
        for (class181 var1 = (class181) this.field2966.method3543(); var1 != null; var1 = (class181) this.field2966.method3537()) {
            var1.method3299();
        }
    }

    @ObfuscatedName("gd.m(B)V")
    public synchronized void method3378() {
        for (class181 var1 = (class181) this.field2966.method3543(); var1 != null; var1 = (class181) this.field2966.method3537()) {
            var1.method3665();
        }
    }

    @ObfuscatedName("gd.i(Lfu;ZB)V")
    public synchronized void method3379(class180 arg0, boolean arg1) {
        this.method3380();
        this.field2972.method3344(arg0.field2920);
        this.field2973 = arg1;
        this.field2976 = 0L;
        int var3 = this.field2972.method3348();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2972.method3346(var4);
            this.field2972.method3317(var4);
            this.field2972.method3326(var4);
        }
        this.field2974 = this.field2972.method3322();
        this.field2975 = this.field2972.field2934[this.field2974];
        this.field2964 = this.field2972.method3321(this.field2975);
    }

    @ObfuscatedName("gd.v(B)V")
    public synchronized void method3380() {
        this.field2972.method3311();
        this.method3394();
    }

    @ObfuscatedName("gd.o(I)Z")
    public synchronized boolean method3471() {
        return this.field2972.method3312();
    }

    @ObfuscatedName("gd.p(IIB)V")
    public synchronized void method3456(int arg0, int arg1) {
        this.method3457(arg0, arg1);
    }

    @ObfuscatedName("gd.b(IIB)V")
    public void method3457(int arg0, int arg1) {
        this.field2952[arg0] = arg1;
        this.field2978[arg0] = arg1 & 0xFFFFFF80;
        this.method3384(arg0, arg1);
    }

    @ObfuscatedName("gd.z(IIB)V")
    public void method3384(int arg0, int arg1) {
        if (this.field2959[arg0] != arg1) {
            this.field2959[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2971[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("gd.k(IIII)V")
    public void method3383(int arg0, int arg1, int arg2) {
        this.method3387(arg0, arg1, 64);
        if ((this.field2965[arg0] & 0x2) != 0) {
            for (class187 var4 = (class187) this.field2970.field2991.method3569(); var4 != null; var4 = (class187) this.field2970.field2991.method3585()) {
                if (var4.field3007 == arg0 && var4.field3009 < 0) {
                    this.field2958[arg0][var4.field2999] = null;
                    this.field2958[arg0][arg1] = var4;
                    int var5 = (var4.field3005 * var4.field3004 >> 12) + var4.field2995;
                    var4.field2995 += arg1 - var4.field2999 << 8;
                    var4.field3004 = var5 - var4.field2995;
                    var4.field3005 = 4096;
                    var4.field2999 = arg1;
                    return;
                }
            }
        }
        class181 var6 = (class181) this.field2966.method3532((long) this.field2959[arg0]);
        if (var6 == null) {
            return;
        }
        class63 var7 = var6.field2925[arg1];
        if (var7 == null) {
            return;
        }
        class187 var8 = new class187();
        var8.field3007 = arg0;
        var8.field3013 = var6;
        var8.field2997 = var7;
        var8.field2998 = var6.field2927[arg1];
        var8.field3006 = var6.field2928[arg1];
        var8.field2999 = arg1;
        var8.field3001 = var6.field2926 * arg2 * arg2 * var6.field2924[arg1] + 1024 >> 11;
        var8.field3002 = var6.field2921[arg1] & 0xFF;
        var8.field2995 = (arg1 << 8) - (var6.field2923[arg1] & 0x7FFF);
        var8.field2996 = 0;
        var8.field3011 = 0;
        var8.field3008 = 0;
        var8.field3009 = -1;
        var8.field3010 = 0;
        if (this.field2967[arg0] == 0) {
            var8.field3003 = class65.method1283(var7, this.method3399(var8), this.method3400(var8), this.method3401(var8));
        } else {
            var8.field3003 = class65.method1283(var7, this.method3399(var8), 0, this.method3401(var8));
            this.method3386(var8, var6.field2923[arg1] < 0);
        }
        if (var6.field2923[arg1] < 0) {
            var8.field3003.method1285(-1);
        }
        if (var8.field3006 >= 0) {
            class187 var9 = this.field2971[arg0][var8.field3006];
            if (var9 != null && var9.field3009 < 0) {
                this.field2958[arg0][var9.field2999] = null;
                var9.field3009 = 0;
            }
            this.field2971[arg0][var8.field3006] = var8;
        }
        this.field2970.field2991.method3559(var8);
        this.field2958[arg0][arg1] = var8;
    }

    @ObfuscatedName("gd.r(Lgn;ZB)V")
    public void method3386(class187 arg0, boolean arg1) {
        int var3 = arg0.field2997.field1236.length;
        int var5;
        if (arg1 && arg0.field2997.field1240) {
            int var4 = var3 + var3 - arg0.field2997.field1238;
            var5 = (int) ((long) this.field2967[arg0.field3007] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field3003.method1292(true);
            }
        } else {
            var5 = (int) ((long) this.field2967[arg0.field3007] * (long) var3 >> 6);
        }
        arg0.field3003.method1344(var5);
    }

    @ObfuscatedName("gd.d(IIII)V")
    public void method3387(int arg0, int arg1, int arg2) {
        class187 var4 = this.field2958[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2958[arg0][arg1] = null;
        if ((this.field2965[arg0] & 0x2) == 0) {
            var4.field3009 = 0;
            return;
        }
        for (class187 var5 = (class187) this.field2970.field2991.method3566(); var5 != null; var5 = (class187) this.field2970.field2991.method3567()) {
            if (var4.field3007 == var5.field3007 && var5.field3009 < 0 && var4 != var5) {
                var4.field3009 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("gd.u(IIIB)V")
    public void method3388(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("gd.a(IIB)V")
    public void method3389(int arg0, int arg1) {
    }

    @ObfuscatedName("gd.x(III)V")
    public void method3390(int arg0, int arg1) {
        this.field2961[arg0] = arg1;
    }

    @ObfuscatedName("gd.y(II)V")
    public void method3391(int arg0) {
        for (class187 var2 = (class187) this.field2970.field2991.method3566(); var2 != null; var2 = (class187) this.field2970.field2991.method3567()) {
            if (arg0 < 0 || var2.field3007 == arg0) {
                if (var2.field3003 != null) {
                    var2.field3003.method1391(Statics.field3153 / 100);
                    if (var2.field3003.method1300()) {
                        this.field2970.field2990.method1119(var2.field3003);
                    }
                    var2.method3491();
                }
                if (var2.field3009 < 0) {
                    this.field2958[var2.field3007][var2.field2999] = null;
                }
                var2.method3665();
            }
        }
    }

    @ObfuscatedName("gd.c(IS)V")
    public void method3392(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3392(var2);
            }
            return;
        }
        this.field2955[arg0] = 12800;
        this.field2956[arg0] = 8192;
        this.field2957[arg0] = 16383;
        this.field2961[arg0] = 8192;
        this.field2962[arg0] = 0;
        this.field2963[arg0] = 8192;
        this.method3474(arg0);
        this.method3437(arg0);
        this.field2965[arg0] = 0;
        this.field2977[arg0] = 32767;
        this.field2960[arg0] = 256;
        this.field2967[arg0] = 0;
        this.method3398(arg0, 8192);
    }

    @ObfuscatedName("gd.h(IB)V")
    public void method3393(int arg0) {
        for (class187 var2 = (class187) this.field2970.field2991.method3566(); var2 != null; var2 = (class187) this.field2970.field2991.method3567()) {
            if ((arg0 < 0 || var2.field3007 == arg0) && var2.field3009 < 0) {
                this.field2958[var2.field3007][var2.field2999] = null;
                var2.field3009 = 0;
            }
        }
    }

    @ObfuscatedName("gd.e(I)V")
    public void method3394() {
        this.method3391(-1);
        this.method3392(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2959[var1] = this.field2952[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2978[var2] = this.field2952[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("gd.ab(IB)V")
    public void method3474(int arg0) {
        if ((this.field2965[arg0] & 0x2) == 0) {
            return;
        }
        for (class187 var2 = (class187) this.field2970.field2991.method3566(); var2 != null; var2 = (class187) this.field2970.field2991.method3567()) {
            if (var2.field3007 == arg0 && this.field2958[arg0][var2.field2999] == null && var2.field3009 < 0) {
                var2.field3009 = 0;
            }
        }
    }

    @ObfuscatedName("gd.aq(IB)V")
    public void method3437(int arg0) {
        if ((this.field2965[arg0] & 0x4) == 0) {
            return;
        }
        for (class187 var2 = (class187) this.field2970.field2991.method3566(); var2 != null; var2 = (class187) this.field2970.field2991.method3567()) {
            if (var2.field3007 == arg0) {
                var2.field3015 = 0;
            }
        }
    }

    @ObfuscatedName("gd.at(II)V")
    public void method3397(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3387(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3383(var6, var7, var8);
            } else {
                this.method3387(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3388(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2978[var12] = (var14 << 14) + (this.field2978[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2978[var12] = (var14 << 7) + (this.field2978[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2962[var12] = (var14 << 7) + (this.field2962[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2962[var12] = (this.field2962[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2963[var12] = (var14 << 7) + (this.field2963[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2963[var12] = (this.field2963[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2955[var12] = (var14 << 7) + (this.field2955[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2955[var12] = (this.field2955[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2956[var12] = (var14 << 7) + (this.field2956[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2956[var12] = (this.field2956[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2957[var12] = (var14 << 7) + (this.field2957[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2957[var12] = (this.field2957[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2965[var12] |= 0x1;
                } else {
                    this.field2965[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2965[var12] |= 0x2;
                } else {
                    this.method3474(var12);
                    this.field2965[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2977[var12] = (var14 << 7) + (this.field2977[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2977[var12] = (this.field2977[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2977[var12] = (var14 << 7) + (this.field2977[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2977[var12] = (this.field2977[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3391(var12);
            }
            if (var13 == 121) {
                this.method3392(var12);
            }
            if (var13 == 123) {
                this.method3393(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2977[var12];
                if (var15 == 16384) {
                    this.field2960[var12] = (var14 << 7) + (this.field2960[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2977[var12];
                if (var16 == 16384) {
                    this.field2960[var12] = (this.field2960[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2967[var12] = (var14 << 7) + (this.field2967[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2967[var12] = (this.field2967[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2965[var12] |= 0x4;
                } else {
                    this.method3437(var12);
                    this.field2965[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3398(var12, (var14 << 7) + (this.field2968[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3398(var12, (this.field2968[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3384(var17, this.field2978[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3389(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method3390(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3394();
            }
        }
    }

    @ObfuscatedName("gd.aw(III)V")
    public void method3398(int arg0, int arg1) {
        this.field2968[arg0] = arg1;
        this.field2969[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("gd.aj(Lgn;B)I")
    public int method3399(class187 arg0) {
        int var2 = (arg0.field3005 * arg0.field3004 >> 12) + arg0.field2995;
        int var3 = ((this.field2961[arg0.field3007] - 8192) * this.field2960[arg0.field3007] >> 12) + var2;
        class185 var4 = arg0.field2998;
        if (var4.field2988 > 0 && (var4.field2987 > 0 || this.field2962[arg0.field3007] > 0)) {
            int var5 = var4.field2987 << 2;
            int var6 = var4.field2989 << 1;
            if (arg0.field3012 < var6) {
                var5 = arg0.field3012 * var5 / var6;
            }
            int var7 = (this.field2962[arg0.field3007] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field3000 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2997.field1239 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field3153 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("gd.ao(Lgn;I)I")
    public int method3400(class187 arg0) {
        class185 var2 = arg0.field2998;
        int var3 = this.field2957[arg0.field3007] * this.field2955[arg0.field3007] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field3001 * var4 + 16384 >> 15;
        int var6 = this.field2953 * var5 + 128 >> 8;
        if (var2.field2986 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2996 * 1.953125E-5D * (double) var2.field2986) + 0.5D);
        }
        if (var2.field2983 != null) {
            int var7 = arg0.field3011;
            int var8 = var2.field2983[arg0.field3008 + 1];
            if (arg0.field3008 < var2.field2983.length - 2) {
                int var9 = (var2.field2983[arg0.field3008] & 0xFF) << 8;
                int var10 = (var2.field2983[arg0.field3008 + 2] & 0xFF) << 8;
                var8 += (var2.field2983[arg0.field3008 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field3009 > 0 && var2.field2985 != null) {
            int var11 = arg0.field3009;
            int var12 = var2.field2985[arg0.field3010 + 1];
            if (arg0.field3010 < var2.field2985.length - 2) {
                int var13 = (var2.field2985[arg0.field3010] & 0xFF) << 8;
                int var14 = (var2.field2985[arg0.field3010 + 2] & 0xFF) << 8;
                var12 += (var2.field2985[arg0.field3010 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("gd.ad(Lgn;I)I")
    public int method3401(class187 arg0) {
        int var2 = this.field2956[arg0.field3007];
        return var2 < 8192 ? arg0.field3002 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field3002) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("gd.t()Lbm;")
    public synchronized class67 method1155() {
        return this.field2970;
    }

    @ObfuscatedName("gd.j()Lbm;")
    public synchronized class67 method1125() {
        return null;
    }

    @ObfuscatedName("gd.n()I")
    public synchronized int method1132() {
        return 0;
    }

    @ObfuscatedName("gd.l([III)V")
    public synchronized void method1124(int[] arg0, int arg1, int arg2) {
        if (this.field2972.method3312()) {
            int var4 = this.field2954 * this.field2972.field2939 / Statics.field3153;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2976;
                if (this.field2964 - var5 >= 0L) {
                    this.field2976 = var5;
                    break;
                }
                int var7 = (int) ((this.field2964 - this.field2976 + (long) var4 - 1L) / (long) var4);
                this.field2976 += (long) var4 * (long) var7;
                this.field2970.method1124(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3402();
            } while (this.field2972.method3312());
        }
        this.field2970.method1124(arg0, arg1, arg2);
    }

    @ObfuscatedName("gd.w(I)V")
    public synchronized void method1118(int arg0) {
        if (this.field2972.method3312()) {
            int var2 = this.field2954 * this.field2972.field2939 / Statics.field3153;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2976;
                if (this.field2964 - var3 >= 0L) {
                    this.field2976 = var3;
                    break;
                }
                int var5 = (int) ((this.field2964 - this.field2976 + (long) var2 - 1L) / (long) var2);
                this.field2976 += (long) var2 * (long) var5;
                this.field2970.method1118(var5);
                arg0 -= var5;
                this.method3402();
            } while (this.field2972.method3312());
        }
        this.field2970.method1118(arg0);
    }

    @ObfuscatedName("gd.ag(B)V")
    public void method3402() {
        int var1 = this.field2974;
        int var2 = this.field2975;
        long var3 = this.field2964;
        while (this.field2975 == var2) {
            while (this.field2972.field2934[var1] == var2) {
                this.field2972.method3346(var1);
                int var5 = this.field2972.method3318(var1);
                if (var5 == 1) {
                    this.field2972.method3316();
                    this.field2972.method3326(var1);
                    if (this.field2972.method3323()) {
                        if (!this.field2973 || var2 == 0) {
                            this.method3394();
                            this.field2972.method3311();
                            return;
                        }
                        this.field2972.method3324(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3397(var5);
                }
                this.field2972.method3317(var1);
                this.field2972.method3326(var1);
            }
            var1 = this.field2972.method3322();
            var2 = this.field2972.field2934[var1];
            var3 = this.field2972.method3321(var2);
        }
        this.field2974 = var1;
        this.field2975 = var2;
        this.field2964 = var3;
    }

    @ObfuscatedName("gd.al(Lgn;I)Z")
    public boolean method3403(class187 arg0) {
        if (arg0.field3003 != null) {
            return false;
        }
        if (arg0.field3009 >= 0) {
            arg0.method3665();
            if (arg0.field3006 > 0 && this.field2971[arg0.field3007][arg0.field3006] == arg0) {
                this.field2971[arg0.field3007][arg0.field3006] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("gd.as(Lgn;[IIIS)Z")
    public boolean method3404(class187 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field3014 = Statics.field3153 / 100;
        if (arg0.field3009 >= 0 && arg0.field3003 == null || arg0.field3003.method1299()) {
            arg0.method3491();
            arg0.method3665();
            if (arg0.field3006 > 0 && this.field2971[arg0.field3007][arg0.field3006] == arg0) {
                this.field2971[arg0.field3007][arg0.field3006] = null;
            }
            return true;
        }
        int var5 = arg0.field3005;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2963[arg0.field3007] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field3005 = var6;
        }
        arg0.field3003.method1310(this.method3399(arg0));
        class185 var7 = arg0.field2998;
        boolean var8 = false;
        arg0.field3012++;
        arg0.field3000 += var7.field2988;
        double var9 = (double) ((arg0.field2999 - 60 << 8) + (arg0.field3005 * arg0.field3004 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2986 > 0) {
            if (var7.field2981 > 0) {
                arg0.field2996 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2981 * var9) + 0.5D);
            } else {
                arg0.field2996 += 128;
            }
        }
        if (var7.field2983 != null) {
            if (var7.field2984 > 0) {
                arg0.field3011 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2984 * var9) + 0.5D);
            } else {
                arg0.field3011 += 128;
            }
            while (arg0.field3008 < var7.field2983.length - 2 && arg0.field3011 > (var7.field2983[arg0.field3008 + 2] & 0xFF) << 8) {
                arg0.field3008 += 2;
            }
            if (arg0.field3008 == var7.field2983.length - 2 && var7.field2983[arg0.field3008 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field3009 >= 0 && var7.field2985 != null && (this.field2965[arg0.field3007] & 0x1) == 0 && (arg0.field3006 < 0 || this.field2971[arg0.field3007][arg0.field3006] != arg0)) {
            if (var7.field2982 > 0) {
                arg0.field3009 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2982 * var9) + 0.5D);
            } else {
                arg0.field3009 += 128;
            }
            while (arg0.field3010 < var7.field2985.length - 2 && arg0.field3009 > (var7.field2985[arg0.field3010 + 2] & 0xFF) << 8) {
                arg0.field3010 += 2;
            }
            if (arg0.field3010 == var7.field2985.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field3003.method1295(arg0.field3014, this.method3400(arg0), this.method3401(arg0));
            return false;
        }
        arg0.field3003.method1391(arg0.field3014);
        if (arg1 == null) {
            arg0.field3003.method1118(arg3);
        } else {
            arg0.field3003.method1124(arg1, arg2, arg3);
        }
        if (arg0.field3003.method1300()) {
            this.field2970.field2990.method1119(arg0.field3003);
        }
        arg0.method3491();
        if (arg0.field3009 >= 0) {
            arg0.method3665();
            if (arg0.field3006 > 0 && this.field2971[arg0.field3007][arg0.field3006] == arg0) {
                this.field2971[arg0.field3007][arg0.field3006] = null;
            }
        }
        return true;
    }
}
