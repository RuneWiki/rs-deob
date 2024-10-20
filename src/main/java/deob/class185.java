package deob;

@ObfuscatedName("gq")
public class class185 extends class67 {

    @ObfuscatedName("gq.x")
    public class197 field2981 = new class197(128);

    @ObfuscatedName("gq.t")
    public int field2976 = 256;

    @ObfuscatedName("gq.p")
    public int field2977 = 1000000;

    @ObfuscatedName("gq.e")
    public int[] field2978 = new int[16];

    @ObfuscatedName("gq.y")
    public int[] field2979 = new int[16];

    @ObfuscatedName("gq.m")
    public int[] field2980 = new int[16];

    @ObfuscatedName("gq.c")
    public int[] field2991 = new int[16];

    @ObfuscatedName("gq.v")
    public int[] field2982 = new int[16];

    @ObfuscatedName("gq.l")
    public int[] field2983 = new int[16];

    @ObfuscatedName("gq.z")
    public int[] field2996 = new int[16];

    @ObfuscatedName("gq.s")
    public int[] field2985 = new int[16];

    @ObfuscatedName("gq.j")
    public int[] field2986 = new int[16];

    @ObfuscatedName("gq.h")
    public int[] field3001 = new int[16];

    @ObfuscatedName("gq.k")
    public int[] field2988 = new int[16];

    @ObfuscatedName("gq.f")
    public int[] field2989 = new int[16];

    @ObfuscatedName("gq.r")
    public int[] field2987 = new int[16];

    @ObfuscatedName("gq.n")
    public int[] field3000 = new int[16];

    @ObfuscatedName("gq.g")
    public int[] field2995 = new int[16];

    @ObfuscatedName("gq.b")
    public class188[][] field2993 = new class188[16][128];

    @ObfuscatedName("gq.af")
    public class188[][] field2984 = new class188[16][128];

    @ObfuscatedName("gq.am")
    public class183 field2975 = new class183();

    @ObfuscatedName("gq.ar")
    public boolean field2994;

    @ObfuscatedName("gq.ay")
    public int field2997;

    @ObfuscatedName("gq.ai")
    public int field2998;

    @ObfuscatedName("gq.ab")
    public long field2999;

    @ObfuscatedName("gq.av")
    public long field2992;

    @ObfuscatedName("gq.ac")
    public class187 field2990 = new class187(this);

    public class185() {
        this.method3443();
    }

    @ObfuscatedName("gq.w(II)V")
    public synchronized void method3400(int arg0) {
        this.field2976 = arg0;
    }

    @ObfuscatedName("gq.x(I)I")
    public int method3446() {
        return this.field2976;
    }

    @ObfuscatedName("gq.t(Lfl;Lfx;Lbi;II)Z")
    public synchronized boolean method3489(class181 arg0, class168 arg1, class60 arg2, int arg3) {
        arg0.method3317();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class198 var7 = (class198) arg0.field2938.method3554(); var7 != null; var7 = (class198) arg0.field2938.method3558()) {
            int var8 = (int) var7.field3124;
            class182 var9 = (class182) this.field2981.method3555((long) var8);
            if (var9 == null) {
                var9 = class182.method756(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field2981.method3556(var9, (long) var8);
            }
            if (!var9.method3323(arg2, var7.field3104, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3318();
        }
        return var5;
    }

    @ObfuscatedName("gq.p(B)V")
    public synchronized void method3403() {
        for (class182 var1 = (class182) this.field2981.method3554(); var1 != null; var1 = (class182) this.field2981.method3558()) {
            var1.method3324();
        }
    }

    @ObfuscatedName("gq.e(I)V")
    public synchronized void method3404() {
        for (class182 var1 = (class182) this.field2981.method3554(); var1 != null; var1 = (class182) this.field2981.method3558()) {
            var1.method3684();
        }
    }

    @ObfuscatedName("gq.l(Lfl;ZI)V")
    public synchronized void method3462(class181 arg0, boolean arg1) {
        this.method3431();
        this.field2975.method3340(arg0.field2937);
        this.field2994 = arg1;
        this.field2999 = 0L;
        int var3 = this.field2975.method3343();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2975.method3344(var4);
            this.field2975.method3347(var4);
            this.field2975.method3341(var4);
        }
        this.field2997 = this.field2975.method3339();
        this.field2998 = this.field2975.field2963[this.field2997];
        this.field2992 = this.field2975.method3371(this.field2998);
    }

    @ObfuscatedName("gq.s(I)V")
    public synchronized void method3431() {
        this.field2975.method3365();
        this.method3443();
    }

    @ObfuscatedName("gq.j(I)Z")
    public synchronized boolean method3407() {
        return this.field2975.method3342();
    }

    @ObfuscatedName("gq.q(III)V")
    public synchronized void method3433(int arg0, int arg1) {
        this.method3488(arg0, arg1);
    }

    @ObfuscatedName("gq.a(IIB)V")
    public void method3488(int arg0, int arg1) {
        this.field2991[arg0] = arg1;
        this.field2983[arg0] = arg1 & 0xFFFFFF80;
        this.method3449(arg0, arg1);
    }

    @ObfuscatedName("gq.d(III)V")
    public void method3449(int arg0, int arg1) {
        if (this.field2982[arg0] != arg1) {
            this.field2982[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2984[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("gq.u(IIIB)V")
    public void method3401(int arg0, int arg1, int arg2) {
        this.method3413(arg0, arg1, 64);
        if ((this.field3001[arg0] & 0x2) != 0) {
            for (class188 var4 = (class188) this.field2990.field3013.method3589(); var4 != null; var4 = (class188) this.field2990.field3013.method3591()) {
                if (var4.field3027 == arg0 && var4.field3021 < 0) {
                    this.field2993[arg0][var4.field3038] = null;
                    this.field2993[arg0][arg1] = var4;
                    int var5 = (var4.field3026 * var4.field3025 >> 12) + var4.field3020;
                    var4.field3020 += arg1 - var4.field3038 << 8;
                    var4.field3025 = var5 - var4.field3020;
                    var4.field3026 = 4096;
                    var4.field3038 = arg1;
                    return;
                }
            }
        }
        class182 var6 = (class182) this.field2981.method3555((long) this.field2982[arg0]);
        if (var6 == null) {
            return;
        }
        class63 var7 = var6.field2940[arg1];
        if (var7 == null) {
            return;
        }
        class188 var8 = new class188();
        var8.field3027 = arg0;
        var8.field3017 = var6;
        var8.field3018 = var7;
        var8.field3039 = var6.field2944[arg1];
        var8.field3037 = var6.field2945[arg1];
        var8.field3038 = arg1;
        var8.field3022 = var6.field2939 * arg2 * arg2 * var6.field2943[arg1] + 1024 >> 11;
        var8.field3023 = var6.field2950[arg1] & 0xFF;
        var8.field3020 = (arg1 << 8) - (var6.field2941[arg1] & 0x7FFF);
        var8.field3029 = 0;
        var8.field3028 = 0;
        var8.field3019 = 0;
        var8.field3021 = -1;
        var8.field3031 = 0;
        if (this.field2987[arg0] == 0) {
            var8.field3034 = class65.method1281(var7, this.method3405(var8), this.method3426(var8), this.method3427(var8));
        } else {
            var8.field3034 = class65.method1281(var7, this.method3405(var8), 0, this.method3427(var8));
            this.method3412(var8, var6.field2941[arg1] < 0);
        }
        if (var6.field2941[arg1] < 0) {
            var8.field3034.method1284(-1);
        }
        if (var8.field3037 >= 0) {
            class188 var9 = this.field2984[arg0][var8.field3037];
            if (var9 != null && var9.field3021 < 0) {
                this.field2993[arg0][var9.field3038] = null;
                var9.field3021 = 0;
            }
            this.field2984[arg0][var8.field3037] = var8;
        }
        this.field2990.field3013.method3583(var8);
        this.field2993[arg0][arg1] = var8;
    }

    @ObfuscatedName("gq.i(Lgm;ZB)V")
    public void method3412(class188 arg0, boolean arg1) {
        int var3 = arg0.field3018.field1239.length;
        int var5;
        if (arg1 && arg0.field3018.field1241) {
            int var4 = var3 + var3 - arg0.field3018.field1237;
            var5 = (int) ((long) this.field2987[arg0.field3027] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field3034.method1289(true);
            }
        } else {
            var5 = (int) ((long) this.field2987[arg0.field3027] * (long) var3 >> 6);
        }
        arg0.field3034.method1320(var5);
    }

    @ObfuscatedName("gq.o(IIII)V")
    public void method3413(int arg0, int arg1, int arg2) {
        class188 var4 = this.field2993[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2993[arg0][arg1] = null;
        if ((this.field3001[arg0] & 0x2) == 0) {
            var4.field3021 = 0;
            return;
        }
        for (class188 var5 = (class188) this.field2990.field3013.method3585(); var5 != null; var5 = (class188) this.field2990.field3013.method3590()) {
            if (var4.field3027 == var5.field3027 && var5.field3021 < 0 && var4 != var5) {
                var4.field3021 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("gq.h(IIII)V")
    public void method3414(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("gq.k(IIB)V")
    public void method3440(int arg0, int arg1) {
    }

    @ObfuscatedName("gq.f(IIB)V")
    public void method3416(int arg0, int arg1) {
        this.field2996[arg0] = arg1;
    }

    @ObfuscatedName("gq.ah(II)V")
    public void method3417(int arg0) {
        for (class188 var2 = (class188) this.field2990.field3013.method3585(); var2 != null; var2 = (class188) this.field2990.field3013.method3590()) {
            if (arg0 < 0 || var2.field3027 == arg0) {
                if (var2.field3034 != null) {
                    var2.field3034.method1293(Statics.field2059 / 100);
                    if (var2.field3034.method1296()) {
                        this.field2990.field3015.method1169(var2.field3034);
                    }
                    var2.method3505();
                }
                if (var2.field3021 < 0) {
                    this.field2993[var2.field3027][var2.field3038] = null;
                }
                var2.method3684();
            }
        }
    }

    @ObfuscatedName("gq.ae(IB)V")
    public void method3418(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3418(var2);
            }
            return;
        }
        this.field2978[arg0] = 12800;
        this.field2979[arg0] = 8192;
        this.field2980[arg0] = 16383;
        this.field2996[arg0] = 8192;
        this.field2985[arg0] = 0;
        this.field2986[arg0] = 8192;
        this.method3421(arg0);
        this.method3441(arg0);
        this.field3001[arg0] = 0;
        this.field2988[arg0] = 32767;
        this.field2989[arg0] = 256;
        this.field2987[arg0] = 0;
        this.method3424(arg0, 8192);
    }

    @ObfuscatedName("gq.az(II)V")
    public void method3471(int arg0) {
        for (class188 var2 = (class188) this.field2990.field3013.method3585(); var2 != null; var2 = (class188) this.field2990.field3013.method3590()) {
            if ((arg0 < 0 || var2.field3027 == arg0) && var2.field3021 < 0) {
                this.field2993[var2.field3027][var2.field3038] = null;
                var2.field3021 = 0;
            }
        }
    }

    @ObfuscatedName("gq.al(I)V")
    public void method3443() {
        this.method3417(-1);
        this.method3418(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2982[var1] = this.field2991[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2983[var2] = this.field2991[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("gq.ag(II)V")
    public void method3421(int arg0) {
        if ((this.field3001[arg0] & 0x2) == 0) {
            return;
        }
        for (class188 var2 = (class188) this.field2990.field3013.method3585(); var2 != null; var2 = (class188) this.field2990.field3013.method3590()) {
            if (var2.field3027 == arg0 && this.field2993[arg0][var2.field3038] == null && var2.field3021 < 0) {
                var2.field3021 = 0;
            }
        }
    }

    @ObfuscatedName("gq.ad(II)V")
    public void method3441(int arg0) {
        if ((this.field3001[arg0] & 0x4) == 0) {
            return;
        }
        for (class188 var2 = (class188) this.field2990.field3013.method3585(); var2 != null; var2 = (class188) this.field2990.field3013.method3590()) {
            if (var2.field3027 == arg0) {
                var2.field3032 = 0;
            }
        }
    }

    @ObfuscatedName("gq.ao(II)V")
    public void method3423(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3413(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3401(var6, var7, var8);
            } else {
                this.method3413(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3414(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2983[var12] = (var14 << 14) + (this.field2983[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2983[var12] = (var14 << 7) + (this.field2983[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2985[var12] = (var14 << 7) + (this.field2985[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2985[var12] = (this.field2985[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2986[var12] = (var14 << 7) + (this.field2986[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2986[var12] = (this.field2986[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2978[var12] = (var14 << 7) + (this.field2978[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2978[var12] = (this.field2978[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2979[var12] = (var14 << 7) + (this.field2979[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2979[var12] = (this.field2979[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2980[var12] = (var14 << 7) + (this.field2980[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2980[var12] = (this.field2980[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field3001[var12] |= 0x1;
                } else {
                    this.field3001[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field3001[var12] |= 0x2;
                } else {
                    this.method3421(var12);
                    this.field3001[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2988[var12] = (var14 << 7) + (this.field2988[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2988[var12] = (this.field2988[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2988[var12] = (var14 << 7) + (this.field2988[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2988[var12] = (this.field2988[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3417(var12);
            }
            if (var13 == 121) {
                this.method3418(var12);
            }
            if (var13 == 123) {
                this.method3471(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2988[var12];
                if (var15 == 16384) {
                    this.field2989[var12] = (var14 << 7) + (this.field2989[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2988[var12];
                if (var16 == 16384) {
                    this.field2989[var12] = (this.field2989[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2987[var12] = (var14 << 7) + (this.field2987[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2987[var12] = (this.field2987[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field3001[var12] |= 0x4;
                } else {
                    this.method3441(var12);
                    this.field3001[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3424(var12, (var14 << 7) + (this.field3000[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3424(var12, (this.field3000[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3449(var17, this.field2983[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3440(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method3416(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3443();
            }
        }
    }

    @ObfuscatedName("gq.ak(III)V")
    public void method3424(int arg0, int arg1) {
        this.field3000[arg0] = arg1;
        this.field2995[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("gq.at(Lgm;I)I")
    public int method3405(class188 arg0) {
        int var2 = (arg0.field3026 * arg0.field3025 >> 12) + arg0.field3020;
        int var3 = ((this.field2996[arg0.field3027] - 8192) * this.field2989[arg0.field3027] >> 12) + var2;
        class186 var4 = arg0.field3039;
        if (var4.field3011 > 0 && (var4.field3010 > 0 || this.field2985[arg0.field3027] > 0)) {
            int var5 = var4.field3010 << 2;
            int var6 = var4.field3003 << 1;
            if (arg0.field3016 < var6) {
                var5 = arg0.field3016 * var5 / var6;
            }
            int var7 = (this.field2985[arg0.field3027] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field3033 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field3018.field1238 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field2059 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("gq.aw(Lgm;I)I")
    public int method3426(class188 arg0) {
        class186 var2 = arg0.field3039;
        int var3 = this.field2980[arg0.field3027] * this.field2978[arg0.field3027] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field3022 * var4 + 16384 >> 15;
        int var6 = this.field2976 * var5 + 128 >> 8;
        if (var2.field3005 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field3029 * 1.953125E-5D * (double) var2.field3005) + 0.5D);
        }
        if (var2.field3004 != null) {
            int var7 = arg0.field3028;
            int var8 = var2.field3004[arg0.field3019 + 1];
            if (arg0.field3019 < var2.field3004.length - 2) {
                int var9 = (var2.field3004[arg0.field3019] & 0xFF) << 8;
                int var10 = (var2.field3004[arg0.field3019 + 2] & 0xFF) << 8;
                var8 += (var2.field3004[arg0.field3019 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field3021 > 0 && var2.field3009 != null) {
            int var11 = arg0.field3021;
            int var12 = var2.field3009[arg0.field3031 + 1];
            if (arg0.field3031 < var2.field3009.length - 2) {
                int var13 = (var2.field3009[arg0.field3031] & 0xFF) << 8;
                int var14 = (var2.field3009[arg0.field3031 + 2] & 0xFF) << 8;
                var12 += (var2.field3009[arg0.field3031 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("gq.as(Lgm;I)I")
    public int method3427(class188 arg0) {
        int var2 = this.field2979[arg0.field3027];
        return var2 < 8192 ? arg0.field3023 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field3023) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("gq.y()Lbj;")
    public synchronized class67 method1147() {
        return this.field2990;
    }

    @ObfuscatedName("gq.m()Lbj;")
    public synchronized class67 method1138() {
        return null;
    }

    @ObfuscatedName("gq.c()I")
    public synchronized int method1148() {
        return 0;
    }

    @ObfuscatedName("gq.v([III)V")
    public synchronized void method1140(int[] arg0, int arg1, int arg2) {
        if (this.field2975.method3342()) {
            int var4 = this.field2977 * this.field2975.field2952 / Statics.field2059;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2999;
                if (this.field2992 - var5 >= 0L) {
                    this.field2999 = var5;
                    break;
                }
                int var7 = (int) ((this.field2992 - this.field2999 + (long) var4 - 1L) / (long) var4);
                this.field2999 += (long) var4 * (long) var7;
                this.field2990.method1140(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3410();
            } while (this.field2975.method3342());
        }
        this.field2990.method1140(arg0, arg1, arg2);
    }

    @ObfuscatedName("gq.z(I)V")
    public synchronized void method1139(int arg0) {
        if (this.field2975.method3342()) {
            int var2 = this.field2977 * this.field2975.field2952 / Statics.field2059;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2999;
                if (this.field2992 - var3 >= 0L) {
                    this.field2999 = var3;
                    break;
                }
                int var5 = (int) ((this.field2992 - this.field2999 + (long) var2 - 1L) / (long) var2);
                this.field2999 += (long) var2 * (long) var5;
                this.field2990.method1139(var5);
                arg0 -= var5;
                this.method3410();
            } while (this.field2975.method3342());
        }
        this.field2990.method1139(arg0);
    }

    @ObfuscatedName("gq.aq(I)V")
    public void method3410() {
        int var1 = this.field2997;
        int var2 = this.field2998;
        long var3 = this.field2992;
        while (this.field2998 == var2) {
            while (this.field2975.field2963[var1] == var2) {
                this.field2975.method3344(var1);
                int var5 = this.field2975.method3348(var1);
                if (var5 == 1) {
                    this.field2975.method3346();
                    this.field2975.method3341(var1);
                    if (this.field2975.method3355()) {
                        if (!this.field2994 || var2 == 0) {
                            this.method3443();
                            this.field2975.method3365();
                            return;
                        }
                        this.field2975.method3354(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3423(var5);
                }
                this.field2975.method3347(var1);
                this.field2975.method3341(var1);
            }
            var1 = this.field2975.method3339();
            var2 = this.field2975.field2963[var1];
            var3 = this.field2975.method3371(var2);
        }
        this.field2997 = var1;
        this.field2998 = var2;
        this.field2992 = var3;
    }

    @ObfuscatedName("gq.ax(Lgm;B)Z")
    public boolean method3428(class188 arg0) {
        if (arg0.field3034 != null) {
            return false;
        }
        if (arg0.field3021 >= 0) {
            arg0.method3684();
            if (arg0.field3037 > 0 && this.field2984[arg0.field3027][arg0.field3037] == arg0) {
                this.field2984[arg0.field3027][arg0.field3037] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("gq.an(Lgm;[IIII)Z")
    public boolean method3481(class188 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field3035 = Statics.field2059 / 100;
        if (arg0.field3021 >= 0 && arg0.field3034 == null || arg0.field3034.method1295()) {
            arg0.method3505();
            arg0.method3684();
            if (arg0.field3037 > 0 && this.field2984[arg0.field3027][arg0.field3037] == arg0) {
                this.field2984[arg0.field3027][arg0.field3037] = null;
            }
            return true;
        }
        int var5 = arg0.field3026;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2986[arg0.field3027] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field3026 = var6;
        }
        arg0.field3034.method1373(this.method3405(arg0));
        class186 var7 = arg0.field3039;
        boolean var8 = false;
        arg0.field3016++;
        arg0.field3033 += var7.field3011;
        double var9 = (double) ((arg0.field3038 - 60 << 8) + (arg0.field3026 * arg0.field3025 >> 12)) * 5.086263020833333E-6D;
        if (var7.field3005 > 0) {
            if (var7.field3008 > 0) {
                arg0.field3029 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3008 * var9) + 0.5D);
            } else {
                arg0.field3029 += 128;
            }
        }
        if (var7.field3004 != null) {
            if (var7.field3006 > 0) {
                arg0.field3028 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3006 * var9) + 0.5D);
            } else {
                arg0.field3028 += 128;
            }
            while (arg0.field3019 < var7.field3004.length - 2 && arg0.field3028 > (var7.field3004[arg0.field3019 + 2] & 0xFF) << 8) {
                arg0.field3019 += 2;
            }
            if (arg0.field3019 == var7.field3004.length - 2 && var7.field3004[arg0.field3019 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field3021 >= 0 && var7.field3009 != null && (this.field3001[arg0.field3027] & 0x1) == 0 && (arg0.field3037 < 0 || this.field2984[arg0.field3027][arg0.field3037] != arg0)) {
            if (var7.field3007 > 0) {
                arg0.field3021 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3007 * var9) + 0.5D);
            } else {
                arg0.field3021 += 128;
            }
            while (arg0.field3031 < var7.field3009.length - 2 && arg0.field3021 > (var7.field3009[arg0.field3031 + 2] & 0xFF) << 8) {
                arg0.field3031 += 2;
            }
            if (arg0.field3031 == var7.field3009.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field3034.method1292(arg0.field3035, this.method3426(arg0), this.method3427(arg0));
            return false;
        }
        arg0.field3034.method1293(arg0.field3035);
        if (arg1 == null) {
            arg0.field3034.method1139(arg3);
        } else {
            arg0.field3034.method1140(arg1, arg2, arg3);
        }
        if (arg0.field3034.method1296()) {
            this.field2990.field3015.method1169(arg0.field3034);
        }
        arg0.method3505();
        if (arg0.field3021 >= 0) {
            arg0.method3684();
            if (arg0.field3037 > 0 && this.field2984[arg0.field3027][arg0.field3037] == arg0) {
                this.field2984[arg0.field3027][arg0.field3037] = null;
            }
        }
        return true;
    }
}
