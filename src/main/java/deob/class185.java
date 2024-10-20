package deob;

@ObfuscatedName("gl")
public class class185 extends class67 {

    @ObfuscatedName("gl.e")
    public class197 field2965 = new class197(128);

    @ObfuscatedName("gl.f")
    public int field2977 = 256;

    @ObfuscatedName("gl.s")
    public int field2984 = 1000000;

    @ObfuscatedName("gl.p")
    public int[] field2967 = new int[16];

    @ObfuscatedName("gl.h")
    public int[] field2968 = new int[16];

    @ObfuscatedName("gl.g")
    public int[] field2978 = new int[16];

    @ObfuscatedName("gl.a")
    public int[] field2970 = new int[16];

    @ObfuscatedName("gl.r")
    public int[] field2971 = new int[16];

    @ObfuscatedName("gl.k")
    public int[] field2972 = new int[16];

    @ObfuscatedName("gl.m")
    public int[] field2973 = new int[16];

    @ObfuscatedName("gl.n")
    public int[] field2986 = new int[16];

    @ObfuscatedName("gl.y")
    public int[] field2975 = new int[16];

    @ObfuscatedName("gl.b")
    public int[] field2976 = new int[16];

    @ObfuscatedName("gl.q")
    public int[] field2974 = new int[16];

    @ObfuscatedName("gl.u")
    public int[] field2966 = new int[16];

    @ObfuscatedName("gl.t")
    public int[] field2979 = new int[16];

    @ObfuscatedName("gl.d")
    public int[] field2980 = new int[16];

    @ObfuscatedName("gl.z")
    public int[] field2981 = new int[16];

    @ObfuscatedName("gl.v")
    public class188[][] field2969 = new class188[16][128];

    @ObfuscatedName("gl.aq")
    public class188[][] field2983 = new class188[16][128];

    @ObfuscatedName("gl.ap")
    public class183 field2982 = new class183();

    @ObfuscatedName("gl.ai")
    public boolean field2985;

    @ObfuscatedName("gl.ae")
    public int field2964;

    @ObfuscatedName("gl.az")
    public int field2987;

    @ObfuscatedName("gl.ah")
    public long field2988;

    @ObfuscatedName("gl.ar")
    public long field2989;

    @ObfuscatedName("gl.ab")
    public class187 field2990 = new class187(this);

    public class185() {
        this.method3434();
    }

    @ObfuscatedName("gl.e(II)V")
    public synchronized void method3347(int arg0) {
        this.field2977 = arg0;
    }

    @ObfuscatedName("gl.w(B)I")
    public int method3348() {
        return this.field2977;
    }

    @ObfuscatedName("gl.f(Lfw;Lft;Lbw;IB)Z")
    public synchronized boolean method3349(class181 arg0, class168 arg1, class60 arg2, int arg3) {
        arg0.method3259();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class198 var7 = (class198) arg0.field2931.method3513(); var7 != null; var7 = (class198) arg0.field2931.method3510()) {
            int var8 = (int) var7.field3116;
            class182 var9 = (class182) this.field2965.method3507((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method3028(var8);
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
                this.field2965.method3508(var11, (long) var8);
            }
            if (!var9.method3269(arg2, var7.field3095, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3257();
        }
        return var5;
    }

    @ObfuscatedName("gl.s(I)V")
    public synchronized void method3392() {
        for (class182 var1 = (class182) this.field2965.method3513(); var1 != null; var1 = (class182) this.field2965.method3510()) {
            var1.method3270();
        }
    }

    @ObfuscatedName("gl.p(I)V")
    public synchronized void method3351() {
        for (class182 var1 = (class182) this.field2965.method3513(); var1 != null; var1 = (class182) this.field2965.method3510()) {
            var1.method3632();
        }
    }

    @ObfuscatedName("gl.k(Lfw;ZI)V")
    public synchronized void method3352(class181 arg0, boolean arg1) {
        this.method3421();
        this.field2982.method3310(arg0.field2932);
        this.field2985 = arg1;
        this.field2988 = 0L;
        int var3 = this.field2982.method3280();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2982.method3281(var4);
            this.field2982.method3324(var4);
            this.field2982.method3284(var4);
        }
        this.field2964 = this.field2982.method3289();
        this.field2987 = this.field2982.field2945[this.field2964];
        this.field2989 = this.field2982.method3288(this.field2987);
    }

    @ObfuscatedName("gl.n(I)V")
    public synchronized void method3421() {
        this.field2982.method3278();
        this.method3434();
    }

    @ObfuscatedName("gl.y(I)Z")
    public synchronized boolean method3353() {
        return this.field2982.method3279();
    }

    @ObfuscatedName("gl.i(IIB)V")
    public synchronized void method3354(int arg0, int arg1) {
        this.method3355(arg0, arg1);
    }

    @ObfuscatedName("gl.j(III)V")
    public void method3355(int arg0, int arg1) {
        this.field2970[arg0] = arg1;
        this.field2972[arg0] = arg1 & 0xFFFFFF80;
        this.method3401(arg0, arg1);
    }

    @ObfuscatedName("gl.l(III)V")
    public void method3401(int arg0, int arg1) {
        if (this.field2971[arg0] != arg1) {
            this.field2971[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2983[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("gl.o(IIII)V")
    public void method3357(int arg0, int arg1, int arg2) {
        this.method3359(arg0, arg1, 64);
        if ((this.field2976[arg0] & 0x2) != 0) {
            for (class188 var4 = (class188) this.field2990.field3004.method3537(); var4 != null; var4 = (class188) this.field2990.field3004.method3563()) {
                if (var4.field3017 == arg0 && var4.field3010 < 0) {
                    this.field2969[arg0][var4.field3011] = null;
                    this.field2969[arg0][arg1] = var4;
                    int var5 = (var4.field3020 * var4.field3016 >> 12) + var4.field3014;
                    var4.field3014 += arg1 - var4.field3011 << 8;
                    var4.field3020 = var5 - var4.field3014;
                    var4.field3016 = 4096;
                    var4.field3011 = arg1;
                    return;
                }
            }
        }
        class182 var6 = (class182) this.field2965.method3507((long) this.field2971[arg0]);
        if (var6 == null) {
            return;
        }
        class63 var7 = var6.field2939[arg1];
        if (var7 == null) {
            return;
        }
        class188 var8 = new class188();
        var8.field3017 = arg0;
        var8.field3012 = var6;
        var8.field3008 = var7;
        var8.field3009 = var6.field2938[arg1];
        var8.field3024 = var6.field2935[arg1];
        var8.field3011 = arg1;
        var8.field3015 = var6.field2933 * arg2 * arg2 * var6.field2936[arg1] + 1024 >> 11;
        var8.field3013 = var6.field2937[arg1] & 0xFF;
        var8.field3014 = (arg1 << 8) - (var6.field2934[arg1] & 0x7FFF);
        var8.field3007 = 0;
        var8.field3018 = 0;
        var8.field3019 = 0;
        var8.field3010 = -1;
        var8.field3026 = 0;
        if (this.field2979[arg0] == 0) {
            var8.field3021 = class65.method1252(var7, this.method3370(var8), this.method3372(var8), this.method3417(var8));
        } else {
            var8.field3021 = class65.method1252(var7, this.method3370(var8), 0, this.method3417(var8));
            this.method3358(var8, var6.field2934[arg1] < 0);
        }
        if (var6.field2934[arg1] < 0) {
            var8.field3021.method1374(-1);
        }
        if (var8.field3024 >= 0) {
            class188 var9 = this.field2983[arg0][var8.field3024];
            if (var9 != null && var9.field3010 < 0) {
                this.field2969[arg0][var9.field3011] = null;
                var9.field3010 = 0;
            }
            this.field2983[arg0][var8.field3024] = var8;
        }
        this.field2990.field3004.method3553(var8);
        this.field2969[arg0][arg1] = var8;
    }

    @ObfuscatedName("gl.c(Lgs;ZB)V")
    public void method3358(class188 arg0, boolean arg1) {
        int var3 = arg0.field3008.field1204.length;
        int var5;
        if (arg1 && arg0.field3008.field1207) {
            int var4 = var3 + var3 - arg0.field3008.field1206;
            var5 = (int) ((long) this.field2979[arg0.field3017] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field3021.method1261(true);
            }
        } else {
            var5 = (int) ((long) this.field2979[arg0.field3017] * (long) var3 >> 6);
        }
        arg0.field3021.method1289(var5);
    }

    @ObfuscatedName("gl.x(IIII)V")
    public void method3359(int arg0, int arg1, int arg2) {
        class188 var4 = this.field2969[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2969[arg0][arg1] = null;
        if ((this.field2976[arg0] & 0x2) == 0) {
            var4.field3010 = 0;
            return;
        }
        for (class188 var5 = (class188) this.field2990.field3004.method3544(); var5 != null; var5 = (class188) this.field2990.field3004.method3546()) {
            if (var4.field3017 == var5.field3017 && var5.field3010 < 0 && var4 != var5) {
                var4.field3010 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("gl.b(IIII)V")
    public void method3360(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("gl.q(III)V")
    public void method3361(int arg0, int arg1) {
    }

    @ObfuscatedName("gl.u(IIB)V")
    public void method3362(int arg0, int arg1) {
        this.field2973[arg0] = arg1;
    }

    @ObfuscatedName("gl.t(II)V")
    public void method3363(int arg0) {
        for (class188 var2 = (class188) this.field2990.field3004.method3544(); var2 != null; var2 = (class188) this.field2990.field3004.method3546()) {
            if (arg0 < 0 || var2.field3017 == arg0) {
                if (var2.field3021 != null) {
                    var2.field3021.method1377(Statics.field1154 / 100);
                    if (var2.field3021.method1269()) {
                        this.field2990.field3003.method1103(var2.field3021);
                    }
                    var2.method3459();
                }
                if (var2.field3010 < 0) {
                    this.field2969[var2.field3017][var2.field3011] = null;
                }
                var2.method3632();
            }
        }
    }

    @ObfuscatedName("gl.d(II)V")
    public void method3364(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3364(var2);
            }
            return;
        }
        this.field2967[arg0] = 12800;
        this.field2968[arg0] = 8192;
        this.field2978[arg0] = 16383;
        this.field2973[arg0] = 8192;
        this.field2986[arg0] = 0;
        this.field2975[arg0] = 8192;
        this.method3367(arg0);
        this.method3368(arg0);
        this.field2976[arg0] = 0;
        this.field2974[arg0] = 32767;
        this.field2966[arg0] = 256;
        this.field2979[arg0] = 0;
        this.method3381(arg0, 8192);
    }

    @ObfuscatedName("gl.z(II)V")
    public void method3365(int arg0) {
        for (class188 var2 = (class188) this.field2990.field3004.method3544(); var2 != null; var2 = (class188) this.field2990.field3004.method3546()) {
            if ((arg0 < 0 || var2.field3017 == arg0) && var2.field3010 < 0) {
                this.field2969[var2.field3017][var2.field3011] = null;
                var2.field3010 = 0;
            }
        }
    }

    @ObfuscatedName("gl.v(I)V")
    public void method3434() {
        this.method3363(-1);
        this.method3364(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2971[var1] = this.field2970[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2972[var2] = this.field2970[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("gl.ag(II)V")
    public void method3367(int arg0) {
        if ((this.field2976[arg0] & 0x2) == 0) {
            return;
        }
        for (class188 var2 = (class188) this.field2990.field3004.method3544(); var2 != null; var2 = (class188) this.field2990.field3004.method3546()) {
            if (var2.field3017 == arg0 && this.field2969[arg0][var2.field3011] == null && var2.field3010 < 0) {
                var2.field3010 = 0;
            }
        }
    }

    @ObfuscatedName("gl.av(II)V")
    public void method3368(int arg0) {
        if ((this.field2976[arg0] & 0x4) == 0) {
            return;
        }
        for (class188 var2 = (class188) this.field2990.field3004.method3544(); var2 != null; var2 = (class188) this.field2990.field3004.method3546()) {
            if (var2.field3017 == arg0) {
                var2.field3006 = 0;
            }
        }
    }

    @ObfuscatedName("gl.ac(IS)V")
    public void method3383(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3359(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3357(var6, var7, var8);
            } else {
                this.method3359(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3360(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2972[var12] = (var14 << 14) + (this.field2972[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2972[var12] = (var14 << 7) + (this.field2972[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2986[var12] = (var14 << 7) + (this.field2986[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2986[var12] = (this.field2986[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2975[var12] = (var14 << 7) + (this.field2975[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2975[var12] = (this.field2975[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2967[var12] = (var14 << 7) + (this.field2967[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2967[var12] = (this.field2967[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2968[var12] = (var14 << 7) + (this.field2968[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2968[var12] = (this.field2968[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2978[var12] = (var14 << 7) + (this.field2978[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2978[var12] = (this.field2978[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2976[var12] |= 0x1;
                } else {
                    this.field2976[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2976[var12] |= 0x2;
                } else {
                    this.method3367(var12);
                    this.field2976[var12] &= 0xFFFFFFFD;
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
                this.method3363(var12);
            }
            if (var13 == 121) {
                this.method3364(var12);
            }
            if (var13 == 123) {
                this.method3365(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2974[var12];
                if (var15 == 16384) {
                    this.field2966[var12] = (var14 << 7) + (this.field2966[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2974[var12];
                if (var16 == 16384) {
                    this.field2966[var12] = (this.field2966[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2979[var12] = (var14 << 7) + (this.field2979[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2979[var12] = (this.field2979[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2976[var12] |= 0x4;
                } else {
                    this.method3368(var12);
                    this.field2976[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3381(var12, (var14 << 7) + (this.field2980[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3381(var12, (this.field2980[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3401(var17, this.field2972[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3361(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method3362(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3434();
            }
        }
    }

    @ObfuscatedName("gl.an(III)V")
    public void method3381(int arg0, int arg1) {
        this.field2980[arg0] = arg1;
        this.field2981[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("gl.ax(Lgs;I)I")
    public int method3370(class188 arg0) {
        int var2 = (arg0.field3020 * arg0.field3016 >> 12) + arg0.field3014;
        int var3 = ((this.field2973[arg0.field3017] - 8192) * this.field2966[arg0.field3017] >> 12) + var2;
        class186 var4 = arg0.field3009;
        if (var4.field2991 > 0 && (var4.field2997 > 0 || this.field2986[arg0.field3017] > 0)) {
            int var5 = var4.field2997 << 2;
            int var6 = var4.field2999 << 1;
            if (arg0.field3022 < var6) {
                var5 = arg0.field3022 * var5 / var6;
            }
            int var7 = (this.field2986[arg0.field3017] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field3023 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field3008.field1205 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1154 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("gl.at(Lgs;I)I")
    public int method3372(class188 arg0) {
        class186 var2 = arg0.field3009;
        int var3 = this.field2978[arg0.field3017] * this.field2967[arg0.field3017] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field3015 * var4 + 16384 >> 15;
        int var6 = this.field2977 * var5 + 128 >> 8;
        if (var2.field2998 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field3007 * 1.953125E-5D * (double) var2.field2998) + 0.5D);
        }
        if (var2.field2993 != null) {
            int var7 = arg0.field3018;
            int var8 = var2.field2993[arg0.field3019 + 1];
            if (arg0.field3019 < var2.field2993.length - 2) {
                int var9 = (var2.field2993[arg0.field3019] & 0xFF) << 8;
                int var10 = (var2.field2993[arg0.field3019 + 2] & 0xFF) << 8;
                var8 += (var2.field2993[arg0.field3019 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field3010 > 0 && var2.field2992 != null) {
            int var11 = arg0.field3010;
            int var12 = var2.field2992[arg0.field3026 + 1];
            if (arg0.field3026 < var2.field2992.length - 2) {
                int var13 = (var2.field2992[arg0.field3026] & 0xFF) << 8;
                int var14 = (var2.field2992[arg0.field3026 + 2] & 0xFF) << 8;
                var12 += (var2.field2992[arg0.field3026 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("gl.ao(Lgs;B)I")
    public int method3417(class188 arg0) {
        int var2 = this.field2968[arg0.field3017];
        return var2 < 8192 ? arg0.field3013 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field3013) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("gl.h()Lbf;")
    public synchronized class67 method1104() {
        return this.field2990;
    }

    @ObfuscatedName("gl.g()Lbf;")
    public synchronized class67 method1109() {
        return null;
    }

    @ObfuscatedName("gl.a()I")
    public synchronized int method1110() {
        return 0;
    }

    @ObfuscatedName("gl.r([III)V")
    public synchronized void method1135(int[] arg0, int arg1, int arg2) {
        if (this.field2982.method3279()) {
            int var4 = this.field2984 * this.field2982.field2948 / Statics.field1154;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2988;
                if (this.field2989 - var5 >= 0L) {
                    this.field2988 = var5;
                    break;
                }
                int var7 = (int) ((this.field2989 - this.field2988 + (long) var4 - 1L) / (long) var4);
                this.field2988 += (long) var4 * (long) var7;
                this.field2990.method1135(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3376();
            } while (this.field2982.method3279());
        }
        this.field2990.method1135(arg0, arg1, arg2);
    }

    @ObfuscatedName("gl.m(I)V")
    public synchronized void method1113(int arg0) {
        if (this.field2982.method3279()) {
            int var2 = this.field2984 * this.field2982.field2948 / Statics.field1154;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2988;
                if (this.field2989 - var3 >= 0L) {
                    this.field2988 = var3;
                    break;
                }
                int var5 = (int) ((this.field2989 - this.field2988 + (long) var2 - 1L) / (long) var2);
                this.field2988 += (long) var2 * (long) var5;
                this.field2990.method1113(var5);
                arg0 -= var5;
                this.method3376();
            } while (this.field2982.method3279());
        }
        this.field2990.method1113(arg0);
    }

    @ObfuscatedName("gl.al(B)V")
    public void method3376() {
        int var1 = this.field2964;
        int var2 = this.field2987;
        long var3 = this.field2989;
        while (this.field2987 == var2) {
            while (this.field2982.field2945[var1] == var2) {
                this.field2982.method3281(var1);
                int var5 = this.field2982.method3285(var1);
                if (var5 == 1) {
                    this.field2982.method3322();
                    this.field2982.method3284(var1);
                    if (this.field2982.method3292()) {
                        if (!this.field2985 || var2 == 0) {
                            this.method3434();
                            this.field2982.method3278();
                            return;
                        }
                        this.field2982.method3296(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3383(var5);
                }
                this.field2982.method3324(var1);
                this.field2982.method3284(var1);
            }
            var1 = this.field2982.method3289();
            var2 = this.field2982.field2945[var1];
            var3 = this.field2982.method3288(var2);
        }
        this.field2964 = var1;
        this.field2987 = var2;
        this.field2989 = var3;
    }

    @ObfuscatedName("gl.ak(Lgs;I)Z")
    public boolean method3377(class188 arg0) {
        if (arg0.field3021 != null) {
            return false;
        }
        if (arg0.field3010 >= 0) {
            arg0.method3632();
            if (arg0.field3024 > 0 && this.field2983[arg0.field3017][arg0.field3024] == arg0) {
                this.field2983[arg0.field3017][arg0.field3024] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("gl.as(Lgs;[IIIB)Z")
    public boolean method3378(class188 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field3025 = Statics.field1154 / 100;
        if (arg0.field3010 >= 0 && arg0.field3021 == null || arg0.field3021.method1268()) {
            arg0.method3459();
            arg0.method3632();
            if (arg0.field3024 > 0 && this.field2983[arg0.field3017][arg0.field3024] == arg0) {
                this.field2983[arg0.field3017][arg0.field3024] = null;
            }
            return true;
        }
        int var5 = arg0.field3016;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2975[arg0.field3017] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field3016 = var6;
        }
        arg0.field3021.method1266(this.method3370(arg0));
        class186 var7 = arg0.field3009;
        boolean var8 = false;
        arg0.field3022++;
        arg0.field3023 += var7.field2991;
        double var9 = (double) ((arg0.field3011 - 60 << 8) + (arg0.field3020 * arg0.field3016 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2998 > 0) {
            if (var7.field2996 > 0) {
                arg0.field3007 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2996 * var9) + 0.5D);
            } else {
                arg0.field3007 += 128;
            }
        }
        if (var7.field2993 != null) {
            if (var7.field2994 > 0) {
                arg0.field3018 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2994 * var9) + 0.5D);
            } else {
                arg0.field3018 += 128;
            }
            while (arg0.field3019 < var7.field2993.length - 2 && arg0.field3018 > (var7.field2993[arg0.field3019 + 2] & 0xFF) << 8) {
                arg0.field3019 += 2;
            }
            if (arg0.field3019 == var7.field2993.length - 2 && var7.field2993[arg0.field3019 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field3010 >= 0 && var7.field2992 != null && (this.field2976[arg0.field3017] & 0x1) == 0 && (arg0.field3024 < 0 || this.field2983[arg0.field3017][arg0.field3024] != arg0)) {
            if (var7.field2995 > 0) {
                arg0.field3010 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2995 * var9) + 0.5D);
            } else {
                arg0.field3010 += 128;
            }
            while (arg0.field3026 < var7.field2992.length - 2 && arg0.field3010 > (var7.field2992[arg0.field3026 + 2] & 0xFF) << 8) {
                arg0.field3026 += 2;
            }
            if (arg0.field3026 == var7.field2992.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field3021.method1294(arg0.field3025, this.method3372(arg0), this.method3417(arg0));
            return false;
        }
        arg0.field3021.method1377(arg0.field3025);
        if (arg1 == null) {
            arg0.field3021.method1113(arg3);
        } else {
            arg0.field3021.method1135(arg1, arg2, arg3);
        }
        if (arg0.field3021.method1269()) {
            this.field2990.field3003.method1103(arg0.field3021);
        }
        arg0.method3459();
        if (arg0.field3010 >= 0) {
            arg0.method3632();
            if (arg0.field3024 > 0 && this.field2983[arg0.field3017][arg0.field3024] == arg0) {
                this.field2983[arg0.field3017][arg0.field3024] = null;
            }
        }
        return true;
    }
}
