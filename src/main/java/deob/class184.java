package deob;

@ObfuscatedName("gl")
public class class184 extends class67 {

    @ObfuscatedName("gl.o")
    public class196 field2972 = new class196(128);

    @ObfuscatedName("gl.f")
    public int field2959 = 256;

    @ObfuscatedName("gl.i")
    public int field2952 = 1000000;

    @ObfuscatedName("gl.h")
    public int[] field2968 = new int[16];

    @ObfuscatedName("gl.q")
    public int[] field2954 = new int[16];

    @ObfuscatedName("gl.u")
    public int[] field2955 = new int[16];

    @ObfuscatedName("gl.m")
    public int[] field2956 = new int[16];

    @ObfuscatedName("gl.y")
    public int[] field2957 = new int[16];

    @ObfuscatedName("gl.p")
    public int[] field2958 = new int[16];

    @ObfuscatedName("gl.t")
    public int[] field2964 = new int[16];

    @ObfuscatedName("gl.g")
    public int[] field2960 = new int[16];

    @ObfuscatedName("gl.v")
    public int[] field2961 = new int[16];

    @ObfuscatedName("gl.j")
    public int[] field2963 = new int[16];

    @ObfuscatedName("gl.b")
    public int[] field2970 = new int[16];

    @ObfuscatedName("gl.r")
    public int[] field2951 = new int[16];

    @ObfuscatedName("gl.n")
    public int[] field2966 = new int[16];

    @ObfuscatedName("gl.c")
    public int[] field2953 = new int[16];

    @ObfuscatedName("gl.k")
    public int[] field2965 = new int[16];

    @ObfuscatedName("gl.x")
    public class187[][] field2969 = new class187[16][128];

    @ObfuscatedName("gl.ar")
    public class187[][] field2967 = new class187[16][128];

    @ObfuscatedName("gl.as")
    public class182 field2950 = new class182();

    @ObfuscatedName("gl.ac")
    public boolean field2971;

    @ObfuscatedName("gl.ah")
    public int field2973;

    @ObfuscatedName("gl.al")
    public int field2974;

    @ObfuscatedName("gl.am")
    public long field2975;

    @ObfuscatedName("gl.ae")
    public long field2976;

    @ObfuscatedName("gl.ai")
    public class186 field2977 = new class186(this);

    public class184() {
        this.method3334();
    }

    @ObfuscatedName("gl.o(II)V")
    public synchronized void method3314(int arg0) {
        this.field2959 = arg0;
    }

    @ObfuscatedName("gl.f(I)I")
    public int method3315() {
        return this.field2959;
    }

    @ObfuscatedName("gl.i(Lfu;Lfd;Lbw;II)Z")
    public synchronized boolean method3373(class180 arg0, class167 arg1, class60 arg2, int arg3) {
        arg0.method3228();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class197 var7 = (class197) arg0.field2919.method3486(); var7 != null; var7 = (class197) arg0.field2919.method3484()) {
            int var8 = (int) var7.field3097;
            class181 var9 = (class181) this.field2972.method3482((long) var8);
            if (var9 == null) {
                var9 = class181.method2848(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field2972.method3495(var9, (long) var8);
            }
            if (!var9.method3241(arg2, var7.field3077, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3229();
        }
        return var5;
    }

    @ObfuscatedName("gl.h(S)V")
    public synchronized void method3411() {
        for (class181 var1 = (class181) this.field2972.method3486(); var1 != null; var1 = (class181) this.field2972.method3484()) {
            var1.method3242();
        }
    }

    @ObfuscatedName("gl.q(B)V")
    public synchronized void method3318() {
        for (class181 var1 = (class181) this.field2972.method3486(); var1 != null; var1 = (class181) this.field2972.method3484()) {
            var1.method3605();
        }
    }

    @ObfuscatedName("gl.t(Lfu;ZI)V")
    public synchronized void method3319(class180 arg0, boolean arg1) {
        this.method3320();
        this.field2950.method3252(arg0.field2920);
        this.field2971 = arg1;
        this.field2975 = 0L;
        int var3 = this.field2950.method3296();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2950.method3271(var4);
            this.field2950.method3262(var4);
            this.field2950.method3257(var4);
        }
        this.field2973 = this.field2950.method3261();
        this.field2974 = this.field2950.field2934[this.field2973];
        this.field2976 = this.field2950.method3263(this.field2974);
    }

    @ObfuscatedName("gl.v(B)V")
    public synchronized void method3320() {
        this.field2950.method3253();
        this.method3334();
    }

    @ObfuscatedName("gl.l(B)Z")
    public synchronized boolean method3321() {
        return this.field2950.method3254();
    }

    @ObfuscatedName("gl.e(IIB)V")
    public synchronized void method3322(int arg0, int arg1) {
        this.method3323(arg0, arg1);
    }

    @ObfuscatedName("gl.a(III)V")
    public void method3323(int arg0, int arg1) {
        this.field2956[arg0] = arg1;
        this.field2958[arg0] = arg1 & 0xFFFFFF80;
        this.method3400(arg0, arg1);
    }

    @ObfuscatedName("gl.w(III)V")
    public void method3400(int arg0, int arg1) {
        if (this.field2957[arg0] != arg1) {
            this.field2957[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2967[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("gl.d(IIIB)V")
    public void method3399(int arg0, int arg1, int arg2) {
        this.method3327(arg0, arg1, 64);
        if ((this.field2963[arg0] & 0x2) != 0) {
            for (class187 var4 = (class187) this.field2977.field2991.method3533(); var4 != null; var4 = (class187) this.field2977.field2991.method3523()) {
                if (var4.field2999 == arg0 && var4.field3009 < 0) {
                    this.field2969[arg0][var4.field3000] = null;
                    this.field2969[arg0][arg1] = var4;
                    int var5 = (var4.field3005 * var4.field3004 >> 12) + var4.field3006;
                    var4.field3006 += arg1 - var4.field3000 << 8;
                    var4.field3004 = var5 - var4.field3006;
                    var4.field3005 = 4096;
                    var4.field3000 = arg1;
                    return;
                }
            }
        }
        class181 var6 = (class181) this.field2972.method3482((long) this.field2957[arg0]);
        if (var6 == null) {
            return;
        }
        class63 var7 = var6.field2922[arg1];
        if (var7 == null) {
            return;
        }
        class187 var8 = new class187();
        var8.field2999 = arg0;
        var8.field2996 = var6;
        var8.field3001 = var7;
        var8.field2998 = var6.field2926[arg1];
        var8.field3018 = var6.field2925[arg1];
        var8.field3000 = arg1;
        var8.field3016 = var6.field2924 * arg2 * arg2 * var6.field2927[arg1] + 1024 >> 11;
        var8.field3002 = var6.field2921[arg1] & 0xFF;
        var8.field3006 = (arg1 << 8) - (var6.field2923[arg1] & 0x7FFF);
        var8.field3007 = 0;
        var8.field2995 = 0;
        var8.field3015 = 0;
        var8.field3009 = -1;
        var8.field3010 = 0;
        if (this.field2966[arg0] == 0) {
            var8.field3013 = class65.method1336(var7, this.method3372(var8), this.method3340(var8), this.method3404(var8));
        } else {
            var8.field3013 = class65.method1336(var7, this.method3372(var8), 0, this.method3404(var8));
            this.method3374(var8, var6.field2923[arg1] < 0);
        }
        if (var6.field2923[arg1] < 0) {
            var8.field3013.method1228(-1);
        }
        if (var8.field3018 >= 0) {
            class187 var9 = this.field2967[arg0][var8.field3018];
            if (var9 != null && var9.field3009 < 0) {
                this.field2969[arg0][var9.field3000] = null;
                var9.field3009 = 0;
            }
            this.field2967[arg0][var8.field3018] = var8;
        }
        this.field2977.field2991.method3515(var8);
        this.field2969[arg0][arg1] = var8;
    }

    @ObfuscatedName("gl.z(Lgo;ZI)V")
    public void method3374(class187 arg0, boolean arg1) {
        int var3 = arg0.field3001.field1225.length;
        int var5;
        if (arg1 && arg0.field3001.field1224) {
            int var4 = var3 + var3 - arg0.field3001.field1228;
            var5 = (int) ((long) this.field2966[arg0.field2999] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field3013.method1235(true);
            }
        } else {
            var5 = (int) ((long) this.field2966[arg0.field2999] * (long) var3 >> 6);
        }
        arg0.field3013.method1254(var5);
    }

    @ObfuscatedName("gl.s(IIII)V")
    public void method3327(int arg0, int arg1, int arg2) {
        class187 var4 = this.field2969[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2969[arg0][arg1] = null;
        if ((this.field2963[arg0] & 0x2) == 0) {
            var4.field3009 = 0;
            return;
        }
        for (class187 var5 = (class187) this.field2977.field2991.method3520(); var5 != null; var5 = (class187) this.field2977.field2991.method3522()) {
            if (var4.field2999 == var5.field2999 && var5.field3009 < 0 && var4 != var5) {
                var4.field3009 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("gl.j(IIII)V")
    public void method3371(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("gl.b(III)V")
    public void method3316(int arg0, int arg1) {
    }

    @ObfuscatedName("gl.r(III)V")
    public void method3330(int arg0, int arg1) {
        this.field2964[arg0] = arg1;
    }

    @ObfuscatedName("gl.n(IB)V")
    public void method3331(int arg0) {
        for (class187 var2 = (class187) this.field2977.field2991.method3520(); var2 != null; var2 = (class187) this.field2977.field2991.method3522()) {
            if (arg0 < 0 || var2.field2999 == arg0) {
                if (var2.field3013 != null) {
                    var2.field3013.method1239(Statics.field1172 / 100);
                    if (var2.field3013.method1241()) {
                        this.field2977.field2992.method1068(var2.field3013);
                    }
                    var2.method3434();
                }
                if (var2.field3009 < 0) {
                    this.field2969[var2.field2999][var2.field3000] = null;
                }
                var2.method3605();
            }
        }
    }

    @ObfuscatedName("gl.ap(II)V")
    public void method3332(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3332(var2);
            }
            return;
        }
        this.field2968[arg0] = 12800;
        this.field2954[arg0] = 8192;
        this.field2955[arg0] = 16383;
        this.field2964[arg0] = 8192;
        this.field2960[arg0] = 0;
        this.field2961[arg0] = 8192;
        this.method3335(arg0);
        this.method3336(arg0);
        this.field2963[arg0] = 0;
        this.field2970[arg0] = 32767;
        this.field2951[arg0] = 256;
        this.field2966[arg0] = 0;
        this.method3338(arg0, 8192);
    }

    @ObfuscatedName("gl.ay(IB)V")
    public void method3394(int arg0) {
        for (class187 var2 = (class187) this.field2977.field2991.method3520(); var2 != null; var2 = (class187) this.field2977.field2991.method3522()) {
            if ((arg0 < 0 || var2.field2999 == arg0) && var2.field3009 < 0) {
                this.field2969[var2.field2999][var2.field3000] = null;
                var2.field3009 = 0;
            }
        }
    }

    @ObfuscatedName("gl.ax(S)V")
    public void method3334() {
        this.method3331(-1);
        this.method3332(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2957[var1] = this.field2956[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2958[var2] = this.field2956[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("gl.av(II)V")
    public void method3335(int arg0) {
        if ((this.field2963[arg0] & 0x2) == 0) {
            return;
        }
        for (class187 var2 = (class187) this.field2977.field2991.method3520(); var2 != null; var2 = (class187) this.field2977.field2991.method3522()) {
            if (var2.field2999 == arg0 && this.field2969[arg0][var2.field3000] == null && var2.field3009 < 0) {
                var2.field3009 = 0;
            }
        }
    }

    @ObfuscatedName("gl.au(IB)V")
    public void method3336(int arg0) {
        if ((this.field2963[arg0] & 0x4) == 0) {
            return;
        }
        for (class187 var2 = (class187) this.field2977.field2991.method3520(); var2 != null; var2 = (class187) this.field2977.field2991.method3522()) {
            if (var2.field2999 == arg0) {
                var2.field3008 = 0;
            }
        }
    }

    @ObfuscatedName("gl.ad(II)V")
    public void method3337(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3327(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3399(var6, var7, var8);
            } else {
                this.method3327(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3371(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2958[var12] = (var14 << 14) + (this.field2958[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2958[var12] = (var14 << 7) + (this.field2958[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2960[var12] = (var14 << 7) + (this.field2960[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2960[var12] = (this.field2960[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2961[var12] = (var14 << 7) + (this.field2961[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2961[var12] = (this.field2961[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2968[var12] = (var14 << 7) + (this.field2968[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2968[var12] = (this.field2968[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2954[var12] = (var14 << 7) + (this.field2954[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2954[var12] = (this.field2954[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2955[var12] = (var14 << 7) + (this.field2955[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2955[var12] = (this.field2955[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2963[var12] |= 0x1;
                } else {
                    this.field2963[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2963[var12] |= 0x2;
                } else {
                    this.method3335(var12);
                    this.field2963[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2970[var12] = (var14 << 7) + (this.field2970[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2970[var12] = (this.field2970[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2970[var12] = (var14 << 7) + (this.field2970[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2970[var12] = (this.field2970[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3331(var12);
            }
            if (var13 == 121) {
                this.method3332(var12);
            }
            if (var13 == 123) {
                this.method3394(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2970[var12];
                if (var15 == 16384) {
                    this.field2951[var12] = (var14 << 7) + (this.field2951[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2970[var12];
                if (var16 == 16384) {
                    this.field2951[var12] = (this.field2951[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2966[var12] = (var14 << 7) + (this.field2966[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2966[var12] = (this.field2966[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2963[var12] |= 0x4;
                } else {
                    this.method3336(var12);
                    this.field2963[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3338(var12, (var14 << 7) + (this.field2953[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3338(var12, (this.field2953[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3400(var17, this.field2958[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3316(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method3330(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3334();
            }
        }
    }

    @ObfuscatedName("gl.ab(IIB)V")
    public void method3338(int arg0, int arg1) {
        this.field2953[arg0] = arg1;
        this.field2965[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("gl.ao(Lgo;I)I")
    public int method3372(class187 arg0) {
        int var2 = (arg0.field3005 * arg0.field3004 >> 12) + arg0.field3006;
        int var3 = ((this.field2964[arg0.field2999] - 8192) * this.field2951[arg0.field2999] >> 12) + var2;
        class185 var4 = arg0.field2998;
        if (var4.field2983 > 0 && (var4.field2984 > 0 || this.field2960[arg0.field2999] > 0)) {
            int var5 = var4.field2984 << 2;
            int var6 = var4.field2986 << 1;
            if (arg0.field3011 < var6) {
                var5 = arg0.field3011 * var5 / var6;
            }
            int var7 = (this.field2960[arg0.field2999] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field3012 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field3001.field1226 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1172 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("gl.az(Lgo;I)I")
    public int method3340(class187 arg0) {
        class185 var2 = arg0.field2998;
        int var3 = this.field2968[arg0.field2999] * this.field2955[arg0.field2999] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field3016 * var4 + 16384 >> 15;
        int var6 = this.field2959 * var5 + 128 >> 8;
        if (var2.field2982 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field3007 * 1.953125E-5D * (double) var2.field2982) + 0.5D);
        }
        if (var2.field2989 != null) {
            int var7 = arg0.field2995;
            int var8 = var2.field2989[arg0.field3015 + 1];
            if (arg0.field3015 < var2.field2989.length - 2) {
                int var9 = (var2.field2989[arg0.field3015] & 0xFF) << 8;
                int var10 = (var2.field2989[arg0.field3015 + 2] & 0xFF) << 8;
                var8 += (var2.field2989[arg0.field3015 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field3009 > 0 && var2.field2979 != null) {
            int var11 = arg0.field3009;
            int var12 = var2.field2979[arg0.field3010 + 1];
            if (arg0.field3010 < var2.field2979.length - 2) {
                int var13 = (var2.field2979[arg0.field3010] & 0xFF) << 8;
                int var14 = (var2.field2979[arg0.field3010 + 2] & 0xFF) << 8;
                var12 += (var2.field2979[arg0.field3010 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("gl.aj(Lgo;I)I")
    public int method3404(class187 arg0) {
        int var2 = this.field2954[arg0.field2999];
        return var2 < 8192 ? arg0.field3002 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field3002) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("gl.u()Lby;")
    public synchronized class67 method1073() {
        return this.field2977;
    }

    @ObfuscatedName("gl.m()Lby;")
    public synchronized class67 method1098() {
        return null;
    }

    @ObfuscatedName("gl.y()I")
    public synchronized int method1075() {
        return 0;
    }

    @ObfuscatedName("gl.p([III)V")
    public synchronized void method1095(int[] arg0, int arg1, int arg2) {
        if (this.field2950.method3254()) {
            int var4 = this.field2952 * this.field2950.field2930 / Statics.field1172;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2975;
                if (this.field2976 - var5 >= 0L) {
                    this.field2975 = var5;
                    break;
                }
                int var7 = (int) ((this.field2976 - this.field2975 + (long) var4 - 1L) / (long) var4);
                this.field2975 += (long) var4 * (long) var7;
                this.field2977.method1095(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3413();
            } while (this.field2950.method3254());
        }
        this.field2977.method1095(arg0, arg1, arg2);
    }

    @ObfuscatedName("gl.g(I)V")
    public synchronized void method1089(int arg0) {
        if (this.field2950.method3254()) {
            int var2 = this.field2952 * this.field2950.field2930 / Statics.field1172;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2975;
                if (this.field2976 - var3 >= 0L) {
                    this.field2975 = var3;
                    break;
                }
                int var5 = (int) ((this.field2976 - this.field2975 + (long) var2 - 1L) / (long) var2);
                this.field2975 += (long) var2 * (long) var5;
                this.field2977.method1089(var5);
                arg0 -= var5;
                this.method3413();
            } while (this.field2950.method3254());
        }
        this.field2977.method1089(arg0);
    }

    @ObfuscatedName("gl.ak(I)V")
    public void method3413() {
        int var1 = this.field2973;
        int var2 = this.field2974;
        long var3 = this.field2976;
        while (this.field2974 == var2) {
            while (this.field2950.field2934[var1] == var2) {
                this.field2950.method3271(var1);
                int var5 = this.field2950.method3277(var1);
                if (var5 == 1) {
                    this.field2950.method3255();
                    this.field2950.method3257(var1);
                    if (this.field2950.method3285()) {
                        if (!this.field2971 || var2 == 0) {
                            this.method3334();
                            this.field2950.method3253();
                            return;
                        }
                        this.field2950.method3264(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3337(var5);
                }
                this.field2950.method3262(var1);
                this.field2950.method3257(var1);
            }
            var1 = this.field2950.method3261();
            var2 = this.field2950.field2934[var1];
            var3 = this.field2950.method3263(var2);
        }
        this.field2973 = var1;
        this.field2974 = var2;
        this.field2976 = var3;
    }

    @ObfuscatedName("gl.aw(Lgo;B)Z")
    public boolean method3352(class187 arg0) {
        if (arg0.field3013 != null) {
            return false;
        }
        if (arg0.field3009 >= 0) {
            arg0.method3605();
            if (arg0.field3018 > 0 && this.field2967[arg0.field2999][arg0.field3018] == arg0) {
                this.field2967[arg0.field2999][arg0.field3018] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("gl.at(Lgo;[IIII)Z")
    public boolean method3347(class187 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field3014 = Statics.field1172 / 100;
        if (arg0.field3009 >= 0 && arg0.field3013 == null || arg0.field3013.method1240()) {
            arg0.method3434();
            arg0.method3605();
            if (arg0.field3018 > 0 && this.field2967[arg0.field2999][arg0.field3018] == arg0) {
                this.field2967[arg0.field2999][arg0.field3018] = null;
            }
            return true;
        }
        int var5 = arg0.field3005;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2961[arg0.field2999] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field3005 = var6;
        }
        arg0.field3013.method1238(this.method3372(arg0));
        class185 var7 = arg0.field2998;
        boolean var8 = false;
        arg0.field3011++;
        arg0.field3012 += var7.field2983;
        double var9 = (double) ((arg0.field3000 - 60 << 8) + (arg0.field3005 * arg0.field3004 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2982 > 0) {
            if (var7.field2987 > 0) {
                arg0.field3007 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2987 * var9) + 0.5D);
            } else {
                arg0.field3007 += 128;
            }
        }
        if (var7.field2989 != null) {
            if (var7.field2981 > 0) {
                arg0.field2995 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2981 * var9) + 0.5D);
            } else {
                arg0.field2995 += 128;
            }
            while (arg0.field3015 < var7.field2989.length - 2 && arg0.field2995 > (var7.field2989[arg0.field3015 + 2] & 0xFF) << 8) {
                arg0.field3015 += 2;
            }
            if (arg0.field3015 == var7.field2989.length - 2 && var7.field2989[arg0.field3015 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field3009 >= 0 && var7.field2979 != null && (this.field2963[arg0.field2999] & 0x1) == 0 && (arg0.field3018 < 0 || this.field2967[arg0.field2999][arg0.field3018] != arg0)) {
            if (var7.field2978 > 0) {
                arg0.field3009 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2978 * var9) + 0.5D);
            } else {
                arg0.field3009 += 128;
            }
            while (arg0.field3010 < var7.field2979.length - 2 && arg0.field3009 > (var7.field2979[arg0.field3010 + 2] & 0xFF) << 8) {
                arg0.field3010 += 2;
            }
            if (arg0.field3010 == var7.field2979.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field3013.method1309(arg0.field3014, this.method3340(arg0), this.method3404(arg0));
            return false;
        }
        arg0.field3013.method1239(arg0.field3014);
        if (arg1 == null) {
            arg0.field3013.method1089(arg3);
        } else {
            arg0.field3013.method1095(arg1, arg2, arg3);
        }
        if (arg0.field3013.method1241()) {
            this.field2977.field2992.method1068(arg0.field3013);
        }
        arg0.method3434();
        if (arg0.field3009 >= 0) {
            arg0.method3605();
            if (arg0.field3018 > 0 && this.field2967[arg0.field2999][arg0.field3018] == arg0) {
                this.field2967[arg0.field2999][arg0.field3018] = null;
            }
        }
        return true;
    }
}
