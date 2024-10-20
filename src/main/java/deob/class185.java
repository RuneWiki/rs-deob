package deob;

@ObfuscatedName("gb")
public class class185 extends class67 {

    @ObfuscatedName("gb.f")
    public class197 field2965 = new class197(128);

    @ObfuscatedName("gb.u")
    public int field2962 = 256;

    @ObfuscatedName("gb.x")
    public int field2963 = 1000000;

    @ObfuscatedName("gb.b")
    public int[] field2970 = new int[16];

    @ObfuscatedName("gb.l")
    public int[] field2982 = new int[16];

    @ObfuscatedName("gb.d")
    public int[] field2966 = new int[16];

    @ObfuscatedName("gb.n")
    public int[] field2977 = new int[16];

    @ObfuscatedName("gb.m")
    public int[] field2968 = new int[16];

    @ObfuscatedName("gb.g")
    public int[] field2969 = new int[16];

    @ObfuscatedName("gb.s")
    public int[] field2964 = new int[16];

    @ObfuscatedName("gb.r")
    public int[] field2971 = new int[16];

    @ObfuscatedName("gb.k")
    public int[] field2987 = new int[16];

    @ObfuscatedName("gb.v")
    public int[] field2975 = new int[16];

    @ObfuscatedName("gb.y")
    public int[] field2974 = new int[16];

    @ObfuscatedName("gb.c")
    public int[] field2976 = new int[16];

    @ObfuscatedName("gb.i")
    public int[] field2961 = new int[16];

    @ObfuscatedName("gb.a")
    public int[] field2978 = new int[16];

    @ObfuscatedName("gb.z")
    public int[] field2979 = new int[16];

    @ObfuscatedName("gb.j")
    public class188[][] field2980 = new class188[16][128];

    @ObfuscatedName("gb.ag")
    public class188[][] field2981 = new class188[16][128];

    @ObfuscatedName("gb.ax")
    public class183 field2972 = new class183();

    @ObfuscatedName("gb.ao")
    public boolean field2983;

    @ObfuscatedName("gb.ac")
    public int field2984;

    @ObfuscatedName("gb.aj")
    public int field2985;

    @ObfuscatedName("gb.an")
    public long field2986;

    @ObfuscatedName("gb.al")
    public long field2967;

    @ObfuscatedName("gb.as")
    public class187 field2988 = new class187(this);

    public class185() {
        this.method3431();
    }

    @ObfuscatedName("gb.f(II)V")
    public synchronized void method3405(int arg0) {
        this.field2962 = arg0;
    }

    @ObfuscatedName("gb.u(B)I")
    public int method3420() {
        return this.field2962;
    }

    @ObfuscatedName("gb.x(Lfn;Lfl;Lby;II)Z")
    public synchronized boolean method3407(class181 arg0, class168 arg1, class60 arg2, int arg3) {
        arg0.method3318();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class198 var7 = (class198) arg0.field2925.method3558(); var7 != null; var7 = (class198) arg0.field2925.method3556()) {
            int var8 = (int) var7.field3116;
            class182 var9 = (class182) this.field2965.method3555((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method3066(var8);
                class182 var11;
                if (var10 == null) {
                    var11 = null;
                } else {
                    var11 = new class182(var10);
                }
                var9 = var11;
                if (var11 == null) {
                    var5 = false;
                    continue;
                }
                this.field2965.method3559(var11, (long) var8);
            }
            if (!var9.method3329(arg2, var7.field3096, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3319();
        }
        return var5;
    }

    @ObfuscatedName("gb.b(B)V")
    public synchronized void method3408() {
        for (class182 var1 = (class182) this.field2965.method3558(); var1 != null; var1 = (class182) this.field2965.method3556()) {
            var1.method3327();
        }
    }

    @ObfuscatedName("gb.l(B)V")
    public synchronized void method3409() {
        for (class182 var1 = (class182) this.field2965.method3558(); var1 != null; var1 = (class182) this.field2965.method3556()) {
            var1.method3679();
        }
    }

    @ObfuscatedName("gb.s(Lfn;ZI)V")
    public synchronized void method3410(class181 arg0, boolean arg1) {
        this.method3411();
        this.field2972.method3337(arg0.field2926);
        this.field2983 = arg1;
        this.field2986 = 0L;
        int var3 = this.field2972.method3345();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2972.method3351(var4);
            this.field2972.method3343(var4);
            this.field2972.method3341(var4);
        }
        this.field2984 = this.field2972.method3375();
        this.field2985 = this.field2972.field2950[this.field2984];
        this.field2967 = this.field2972.method3373(this.field2985);
    }

    @ObfuscatedName("gb.k(B)V")
    public synchronized void method3411() {
        this.field2972.method3363();
        this.method3431();
    }

    @ObfuscatedName("gb.o(I)Z")
    public synchronized boolean method3413() {
        return this.field2972.method3377();
    }

    @ObfuscatedName("gb.q(III)V")
    public synchronized void method3498(int arg0, int arg1) {
        this.method3414(arg0, arg1);
    }

    @ObfuscatedName("gb.p(IIB)V")
    public void method3414(int arg0, int arg1) {
        this.field2977[arg0] = arg1;
        this.field2969[arg0] = arg1 & 0xFFFFFF80;
        this.method3415(arg0, arg1);
    }

    @ObfuscatedName("gb.h(III)V")
    public void method3415(int arg0, int arg1) {
        if (this.field2968[arg0] != arg1) {
            this.field2968[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2981[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("gb.e(IIII)V")
    public void method3416(int arg0, int arg1, int arg2) {
        this.method3451(arg0, arg1, 64);
        if ((this.field2975[arg0] & 0x2) != 0) {
            for (class188 var4 = (class188) this.field2988.field3006.method3589(); var4 != null; var4 = (class188) this.field2988.field3006.method3591()) {
                if (var4.field3019 == arg0 && var4.field3022 < 0) {
                    this.field2980[arg0][var4.field3013] = null;
                    this.field2980[arg0][arg1] = var4;
                    int var5 = (var4.field3024 * var4.field3008 >> 12) + var4.field3016;
                    var4.field3016 += arg1 - var4.field3013 << 8;
                    var4.field3008 = var5 - var4.field3016;
                    var4.field3024 = 4096;
                    var4.field3013 = arg1;
                    return;
                }
            }
        }
        class182 var6 = (class182) this.field2965.method3555((long) this.field2968[arg0]);
        if (var6 == null) {
            return;
        }
        class63 var7 = var6.field2928[arg1];
        if (var7 == null) {
            return;
        }
        class188 var8 = new class188();
        var8.field3019 = arg0;
        var8.field3009 = var6;
        var8.field3010 = var7;
        var8.field3028 = var6.field2927[arg1];
        var8.field3017 = var6.field2937[arg1];
        var8.field3013 = arg1;
        var8.field3014 = var6.field2933 * arg2 * arg2 * var6.field2930[arg1] + 1024 >> 11;
        var8.field3023 = var6.field2931[arg1] & 0xFF;
        var8.field3016 = (arg1 << 8) - (var6.field2932[arg1] & 0x7FFF);
        var8.field3015 = 0;
        var8.field3018 = 0;
        var8.field3021 = 0;
        var8.field3022 = -1;
        var8.field3011 = 0;
        if (this.field2961[arg0] == 0) {
            var8.field3026 = class65.method1311(var7, this.method3430(var8), this.method3435(var8), this.method3446(var8));
        } else {
            var8.field3026 = class65.method1311(var7, this.method3430(var8), 0, this.method3446(var8));
            this.method3423(var8, var6.field2932[arg1] < 0);
        }
        if (var6.field2932[arg1] < 0) {
            var8.field3026.method1328(-1);
        }
        if (var8.field3017 >= 0) {
            class188 var9 = this.field2981[arg0][var8.field3017];
            if (var9 != null && var9.field3022 < 0) {
                this.field2980[arg0][var9.field3013] = null;
                var9.field3022 = 0;
            }
            this.field2981[arg0][var8.field3017] = var8;
        }
        this.field2988.field3006.method3610(var8);
        this.field2980[arg0][arg1] = var8;
    }

    @ObfuscatedName("gb.t(Lgw;ZI)V")
    public void method3423(class188 arg0, boolean arg1) {
        int var3 = arg0.field3010.field1248.length;
        int var5;
        if (arg1 && arg0.field3010.field1251) {
            int var4 = var3 + var3 - arg0.field3010.field1247;
            var5 = (int) ((long) this.field2961[arg0.field3019] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field3026.method1319(true);
            }
        } else {
            var5 = (int) ((long) this.field2961[arg0.field3019] * (long) var3 >> 6);
        }
        arg0.field3026.method1318(var5);
    }

    @ObfuscatedName("gb.w(IIII)V")
    public void method3451(int arg0, int arg1, int arg2) {
        class188 var4 = this.field2980[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2980[arg0][arg1] = null;
        if ((this.field2975[arg0] & 0x2) == 0) {
            var4.field3022 = 0;
            return;
        }
        for (class188 var5 = (class188) this.field2988.field3006.method3585(); var5 != null; var5 = (class188) this.field2988.field3006.method3590()) {
            if (var4.field3019 == var5.field3019 && var5.field3022 < 0 && var4 != var5) {
                var4.field3022 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("gb.v(IIIB)V")
    public void method3419(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("gb.y(III)V")
    public void method3442(int arg0, int arg1) {
    }

    @ObfuscatedName("gb.ac(IIB)V")
    public void method3496(int arg0, int arg1) {
        this.field2964[arg0] = arg1;
    }

    @ObfuscatedName("gb.aj(IB)V")
    public void method3422(int arg0) {
        for (class188 var2 = (class188) this.field2988.field3006.method3585(); var2 != null; var2 = (class188) this.field2988.field3006.method3590()) {
            if (arg0 < 0 || var2.field3019 == arg0) {
                if (var2.field3026 != null) {
                    var2.field3026.method1323(Statics.field1197 / 100);
                    if (var2.field3026.method1437()) {
                        this.field2988.field3002.method1202(var2.field3026);
                    }
                    var2.method3510();
                }
                if (var2.field3022 < 0) {
                    this.field2980[var2.field3019][var2.field3013] = null;
                }
                var2.method3679();
            }
        }
    }

    @ObfuscatedName("gb.an(IB)V")
    public void method3421(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3421(var2);
            }
            return;
        }
        this.field2970[arg0] = 12800;
        this.field2982[arg0] = 8192;
        this.field2966[arg0] = 16383;
        this.field2964[arg0] = 8192;
        this.field2971[arg0] = 0;
        this.field2987[arg0] = 8192;
        this.method3426(arg0);
        this.method3424(arg0);
        this.field2975[arg0] = 0;
        this.field2974[arg0] = 32767;
        this.field2976[arg0] = 256;
        this.field2961[arg0] = 0;
        this.method3429(arg0, 8192);
    }

    @ObfuscatedName("gb.am(IB)V")
    public void method3404(int arg0) {
        for (class188 var2 = (class188) this.field2988.field3006.method3585(); var2 != null; var2 = (class188) this.field2988.field3006.method3590()) {
            if ((arg0 < 0 || var2.field3019 == arg0) && var2.field3022 < 0) {
                this.field2980[var2.field3019][var2.field3013] = null;
                var2.field3022 = 0;
            }
        }
    }

    @ObfuscatedName("gb.az(B)V")
    public void method3431() {
        this.method3422(-1);
        this.method3421(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2968[var1] = this.field2977[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2969[var2] = this.field2977[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("gb.ap(II)V")
    public void method3426(int arg0) {
        if ((this.field2975[arg0] & 0x2) == 0) {
            return;
        }
        for (class188 var2 = (class188) this.field2988.field3006.method3585(); var2 != null; var2 = (class188) this.field2988.field3006.method3590()) {
            if (var2.field3019 == arg0 && this.field2980[arg0][var2.field3013] == null && var2.field3022 < 0) {
                var2.field3022 = 0;
            }
        }
    }

    @ObfuscatedName("gb.af(II)V")
    public void method3424(int arg0) {
        if ((this.field2975[arg0] & 0x4) == 0) {
            return;
        }
        for (class188 var2 = (class188) this.field2988.field3006.method3585(); var2 != null; var2 = (class188) this.field2988.field3006.method3590()) {
            if (var2.field3019 == arg0) {
                var2.field3025 = 0;
            }
        }
    }

    @ObfuscatedName("gb.aa(IS)V")
    public void method3464(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3451(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3416(var6, var7, var8);
            } else {
                this.method3451(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3419(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2969[var12] = (var14 << 14) + (this.field2969[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2969[var12] = (var14 << 7) + (this.field2969[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2971[var12] = (var14 << 7) + (this.field2971[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2971[var12] = (this.field2971[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2987[var12] = (var14 << 7) + (this.field2987[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2987[var12] = (this.field2987[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2970[var12] = (var14 << 7) + (this.field2970[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2970[var12] = (this.field2970[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2982[var12] = (var14 << 7) + (this.field2982[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2982[var12] = (this.field2982[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2966[var12] = (var14 << 7) + (this.field2966[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2966[var12] = (this.field2966[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2975[var12] |= 0x1;
                } else {
                    this.field2975[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2975[var12] |= 0x2;
                } else {
                    this.method3426(var12);
                    this.field2975[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2974[var12] = (var14 << 7) + (this.field2974[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2974[var12] = (this.field2974[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2974[var12] = (var14 << 7) + (this.field2974[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2974[var12] = (this.field2974[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3422(var12);
            }
            if (var13 == 121) {
                this.method3421(var12);
            }
            if (var13 == 123) {
                this.method3404(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2974[var12];
                if (var15 == 16384) {
                    this.field2976[var12] = (var14 << 7) + (this.field2976[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2974[var12];
                if (var16 == 16384) {
                    this.field2976[var12] = (this.field2976[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2961[var12] = (var14 << 7) + (this.field2961[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2961[var12] = (this.field2961[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2975[var12] |= 0x4;
                } else {
                    this.method3424(var12);
                    this.field2975[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3429(var12, (var14 << 7) + (this.field2978[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3429(var12, (this.field2978[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3415(var17, this.field2969[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3442(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method3496(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3431();
            }
        }
    }

    @ObfuscatedName("gb.ay(IIB)V")
    public void method3429(int arg0, int arg1) {
        this.field2978[arg0] = arg1;
        this.field2979[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("gb.aw(Lgw;B)I")
    public int method3430(class188 arg0) {
        int var2 = (arg0.field3024 * arg0.field3008 >> 12) + arg0.field3016;
        int var3 = ((this.field2964[arg0.field3019] - 8192) * this.field2976[arg0.field3019] >> 12) + var2;
        class186 var4 = arg0.field3028;
        if (var4.field2996 > 0 && (var4.field2995 > 0 || this.field2971[arg0.field3019] > 0)) {
            int var5 = var4.field2995 << 2;
            int var6 = var4.field2997 << 1;
            if (arg0.field3012 < var6) {
                var5 = arg0.field3012 * var5 / var6;
            }
            int var7 = (this.field2971[arg0.field3019] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field3020 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field3010.field1249 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1197 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("gb.ak(Lgw;B)I")
    public int method3435(class188 arg0) {
        class186 var2 = arg0.field3028;
        int var3 = this.field2970[arg0.field3019] * this.field2966[arg0.field3019] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field3014 * var4 + 16384 >> 15;
        int var6 = this.field2962 * var5 + 128 >> 8;
        if (var2.field2991 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field3015 * 1.953125E-5D * (double) var2.field2991) + 0.5D);
        }
        if (var2.field2999 != null) {
            int var7 = arg0.field3018;
            int var8 = var2.field2999[arg0.field3021 + 1];
            if (arg0.field3021 < var2.field2999.length - 2) {
                int var9 = (var2.field2999[arg0.field3021] & 0xFF) << 8;
                int var10 = (var2.field2999[arg0.field3021 + 2] & 0xFF) << 8;
                var8 += (var2.field2999[arg0.field3021 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field3022 > 0 && var2.field2990 != null) {
            int var11 = arg0.field3022;
            int var12 = var2.field2990[arg0.field3011 + 1];
            if (arg0.field3011 < var2.field2990.length - 2) {
                int var13 = (var2.field2990[arg0.field3011] & 0xFF) << 8;
                int var14 = (var2.field2990[arg0.field3011 + 2] & 0xFF) << 8;
                var12 += (var2.field2990[arg0.field3011 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("gb.ae(Lgw;I)I")
    public int method3446(class188 arg0) {
        int var2 = this.field2982[arg0.field3019];
        return var2 < 8192 ? arg0.field3023 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field3023) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("gb.d()Lbt;")
    public synchronized class67 method1177() {
        return this.field2988;
    }

    @ObfuscatedName("gb.n()Lbt;")
    public synchronized class67 method1178() {
        return null;
    }

    @ObfuscatedName("gb.m()I")
    public synchronized int method1189() {
        return 0;
    }

    @ObfuscatedName("gb.g([III)V")
    public synchronized void method1185(int[] arg0, int arg1, int arg2) {
        if (this.field2972.method3377()) {
            int var4 = this.field2963 * this.field2972.field2951 / Statics.field1197;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2986;
                if (this.field2967 - var5 >= 0L) {
                    this.field2986 = var5;
                    break;
                }
                int var7 = (int) ((this.field2967 - this.field2986 + (long) var4 - 1L) / (long) var4);
                this.field2986 += (long) var4 * (long) var7;
                this.field2988.method1185(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3433();
            } while (this.field2972.method3377());
        }
        this.field2988.method1185(arg0, arg1, arg2);
    }

    @ObfuscatedName("gb.r(I)V")
    public synchronized void method1181(int arg0) {
        if (this.field2972.method3377()) {
            int var2 = this.field2963 * this.field2972.field2951 / Statics.field1197;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2986;
                if (this.field2967 - var3 >= 0L) {
                    this.field2986 = var3;
                    break;
                }
                int var5 = (int) ((this.field2967 - this.field2986 + (long) var2 - 1L) / (long) var2);
                this.field2986 += (long) var2 * (long) var5;
                this.field2988.method1181(var5);
                arg0 -= var5;
                this.method3433();
            } while (this.field2972.method3377());
        }
        this.field2988.method1181(arg0);
    }

    @ObfuscatedName("gb.ad(I)V")
    public void method3433() {
        int var1 = this.field2984;
        int var2 = this.field2985;
        long var3 = this.field2967;
        while (this.field2985 == var2) {
            while (this.field2972.field2950[var1] == var2) {
                this.field2972.method3351(var1);
                int var5 = this.field2972.method3344(var1);
                if (var5 == 1) {
                    this.field2972.method3342();
                    this.field2972.method3341(var1);
                    if (this.field2972.method3349()) {
                        if (!this.field2983 || var2 == 0) {
                            this.method3431();
                            this.field2972.method3363();
                            return;
                        }
                        this.field2972.method3350(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3464(var5);
                }
                this.field2972.method3343(var1);
                this.field2972.method3341(var1);
            }
            var1 = this.field2972.method3375();
            var2 = this.field2972.field2950[var1];
            var3 = this.field2972.method3373(var2);
        }
        this.field2984 = var1;
        this.field2985 = var2;
        this.field2967 = var3;
    }

    @ObfuscatedName("gb.au(Lgw;I)Z")
    public boolean method3457(class188 arg0) {
        if (arg0.field3026 != null) {
            return false;
        }
        if (arg0.field3022 >= 0) {
            arg0.method3679();
            if (arg0.field3017 > 0 && this.field2981[arg0.field3019][arg0.field3017] == arg0) {
                this.field2981[arg0.field3019][arg0.field3017] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("gb.ar(Lgw;[IIIB)Z")
    public boolean method3434(class188 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field3027 = Statics.field1197 / 100;
        if (arg0.field3022 >= 0 && arg0.field3026 == null || arg0.field3026.method1347()) {
            arg0.method3510();
            arg0.method3679();
            if (arg0.field3017 > 0 && this.field2981[arg0.field3019][arg0.field3017] == arg0) {
                this.field2981[arg0.field3019][arg0.field3017] = null;
            }
            return true;
        }
        int var5 = arg0.field3024;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2987[arg0.field3019] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field3024 = var6;
        }
        arg0.field3026.method1432(this.method3430(arg0));
        class186 var7 = arg0.field3028;
        boolean var8 = false;
        arg0.field3012++;
        arg0.field3020 += var7.field2996;
        double var9 = (double) ((arg0.field3013 - 60 << 8) + (arg0.field3024 * arg0.field3008 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2991 > 0) {
            if (var7.field2994 > 0) {
                arg0.field3015 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2994 * var9) + 0.5D);
            } else {
                arg0.field3015 += 128;
            }
        }
        if (var7.field2999 != null) {
            if (var7.field2992 > 0) {
                arg0.field3018 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2992 * var9) + 0.5D);
            } else {
                arg0.field3018 += 128;
            }
            while (arg0.field3021 < var7.field2999.length - 2 && arg0.field3018 > (var7.field2999[arg0.field3021 + 2] & 0xFF) << 8) {
                arg0.field3021 += 2;
            }
            if (arg0.field3021 == var7.field2999.length - 2 && var7.field2999[arg0.field3021 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field3022 >= 0 && var7.field2990 != null && (this.field2975[arg0.field3019] & 0x1) == 0 && (arg0.field3017 < 0 || this.field2981[arg0.field3019][arg0.field3017] != arg0)) {
            if (var7.field2993 > 0) {
                arg0.field3022 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2993 * var9) + 0.5D);
            } else {
                arg0.field3022 += 128;
            }
            while (arg0.field3011 < var7.field2990.length - 2 && arg0.field3022 > (var7.field2990[arg0.field3011 + 2] & 0xFF) << 8) {
                arg0.field3011 += 2;
            }
            if (arg0.field3011 == var7.field2990.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field3026.method1348(arg0.field3027, this.method3435(arg0), this.method3446(arg0));
            return false;
        }
        arg0.field3026.method1323(arg0.field3027);
        if (arg1 == null) {
            arg0.field3026.method1181(arg3);
        } else {
            arg0.field3026.method1185(arg1, arg2, arg3);
        }
        if (arg0.field3026.method1437()) {
            this.field2988.field3002.method1202(arg0.field3026);
        }
        arg0.method3510();
        if (arg0.field3022 >= 0) {
            arg0.method3679();
            if (arg0.field3017 > 0 && this.field2981[arg0.field3019][arg0.field3017] == arg0) {
                this.field2981[arg0.field3019][arg0.field3017] = null;
            }
        }
        return true;
    }
}
