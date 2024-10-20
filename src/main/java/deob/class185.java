package deob;

@ObfuscatedName("gg")
public class class185 extends class67 {

    @ObfuscatedName("gg.b")
    public class197 field2972 = new class197(128);

    @ObfuscatedName("gg.g")
    public int field2961 = 256;

    @ObfuscatedName("gg.j")
    public int field2962 = 1000000;

    @ObfuscatedName("gg.d")
    public int[] field2977 = new int[16];

    @ObfuscatedName("gg.x")
    public int[] field2964 = new int[16];

    @ObfuscatedName("gg.y")
    public int[] field2965 = new int[16];

    @ObfuscatedName("gg.r")
    public int[] field2967 = new int[16];

    @ObfuscatedName("gg.c")
    public int[] field2966 = new int[16];

    @ObfuscatedName("gg.l")
    public int[] field2968 = new int[16];

    @ObfuscatedName("gg.u")
    public int[] field2971 = new int[16];

    @ObfuscatedName("gg.p")
    public int[] field2970 = new int[16];

    @ObfuscatedName("gg.n")
    public int[] field2963 = new int[16];

    @ObfuscatedName("gg.a")
    public int[] field2976 = new int[16];

    @ObfuscatedName("gg.f")
    public int[] field2973 = new int[16];

    @ObfuscatedName("gg.q")
    public int[] field2974 = new int[16];

    @ObfuscatedName("gg.m")
    public int[] field2983 = new int[16];

    @ObfuscatedName("gg.s")
    public int[] field2986 = new int[16];

    @ObfuscatedName("gg.i")
    public int[] field2969 = new int[16];

    @ObfuscatedName("gg.e")
    public class188[][] field2978 = new class188[16][128];

    @ObfuscatedName("gg.aw")
    public class188[][] field2979 = new class188[16][128];

    @ObfuscatedName("gg.an")
    public class183 field2980 = new class183();

    @ObfuscatedName("gg.ag")
    public boolean field2981;

    @ObfuscatedName("gg.ae")
    public int field2982;

    @ObfuscatedName("gg.aj")
    public int field2988;

    @ObfuscatedName("gg.ah")
    public long field2984;

    @ObfuscatedName("gg.af")
    public long field2985;

    @ObfuscatedName("gg.az")
    public class187 field2960 = new class187(this);

    public class185() {
        this.method3404();
    }

    @ObfuscatedName("gg.b(II)V")
    public synchronized void method3372(int arg0) {
        this.field2961 = arg0;
    }

    @ObfuscatedName("gg.g(I)I")
    public int method3373() {
        return this.field2961;
    }

    @ObfuscatedName("gg.j(Lfy;Lfl;Lbz;IB)Z")
    public synchronized boolean method3460(class181 arg0, class168 arg1, class60 arg2, int arg3) {
        arg0.method3289();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class198 var7 = (class198) arg0.field2924.method3530(); var7 != null; var7 = (class198) arg0.field2924.method3531()) {
            int var8 = (int) var7.field3114;
            class182 var9 = (class182) this.field2972.method3538((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method3042(var8);
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
                this.field2972.method3528(var11, (long) var8);
            }
            if (!var9.method3300(arg2, var7.field3094, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3290();
        }
        return var5;
    }

    @ObfuscatedName("gg.d(I)V")
    public synchronized void method3390() {
        for (class182 var1 = (class182) this.field2972.method3530(); var1 != null; var1 = (class182) this.field2972.method3531()) {
            var1.method3299();
        }
    }

    @ObfuscatedName("gg.x(I)V")
    public synchronized void method3376() {
        for (class182 var1 = (class182) this.field2972.method3530(); var1 != null; var1 = (class182) this.field2972.method3531()) {
            var1.method3647();
        }
    }

    @ObfuscatedName("gg.u(Lfy;ZB)V")
    public synchronized void method3377(class181 arg0, boolean arg1) {
        this.method3378();
        this.field2980.method3304(arg0.field2925);
        this.field2981 = arg1;
        this.field2984 = 0L;
        int var3 = this.field2980.method3307();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2980.method3308(var4);
            this.field2980.method3310(var4);
            this.field2980.method3309(var4);
        }
        this.field2982 = this.field2980.method3315();
        this.field2988 = this.field2980.field2940[this.field2982];
        this.field2985 = this.field2980.method3314(this.field2988);
    }

    @ObfuscatedName("gg.n(I)V")
    public synchronized void method3378() {
        this.field2980.method3305();
        this.method3404();
    }

    @ObfuscatedName("gg.w(B)Z")
    public synchronized boolean method3456() {
        return this.field2980.method3306();
    }

    @ObfuscatedName("gg.z(IIB)V")
    public synchronized void method3444(int arg0, int arg1) {
        this.method3453(arg0, arg1);
    }

    @ObfuscatedName("gg.k(III)V")
    public void method3453(int arg0, int arg1) {
        this.field2967[arg0] = arg1;
        this.field2968[arg0] = arg1 & 0xFFFFFF80;
        this.method3382(arg0, arg1);
    }

    @ObfuscatedName("gg.o(IIB)V")
    public void method3382(int arg0, int arg1) {
        if (this.field2966[arg0] != arg1) {
            this.field2966[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2979[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("gg.t(IIIS)V")
    public void method3383(int arg0, int arg1, int arg2) {
        this.method3385(arg0, arg1, 64);
        if ((this.field2976[arg0] & 0x2) != 0) {
            for (class188 var4 = (class188) this.field2960.field3003.method3555(); var4 != null; var4 = (class188) this.field2960.field3003.method3557()) {
                if (var4.field3015 == arg0 && var4.field3022 < 0) {
                    this.field2978[arg0][var4.field3013] = null;
                    this.field2978[arg0][arg1] = var4;
                    int var5 = (var4.field3020 * var4.field3014 >> 12) + var4.field3016;
                    var4.field3016 += arg1 - var4.field3013 << 8;
                    var4.field3014 = var5 - var4.field3016;
                    var4.field3020 = 4096;
                    var4.field3013 = arg1;
                    return;
                }
            }
        }
        class182 var6 = (class182) this.field2972.method3538((long) this.field2966[arg0]);
        if (var6 == null) {
            return;
        }
        class63 var7 = var6.field2927[arg1];
        if (var7 == null) {
            return;
        }
        class188 var8 = new class188();
        var8.field3015 = arg0;
        var8.field3009 = var6;
        var8.field3018 = var7;
        var8.field3011 = var6.field2934[arg1];
        var8.field3012 = var6.field2932[arg1];
        var8.field3013 = arg1;
        var8.field3026 = var6.field2926 * arg2 * arg2 * var6.field2929[arg1] + 1024 >> 11;
        var8.field3010 = var6.field2931[arg1] & 0xFF;
        var8.field3016 = (arg1 << 8) - (var6.field2928[arg1] & 0x7FFF);
        var8.field3019 = 0;
        var8.field3017 = 0;
        var8.field3021 = 0;
        var8.field3022 = -1;
        var8.field3023 = 0;
        if (this.field2983[arg0] == 0) {
            var8.field3008 = class65.method1263(var7, this.method3414(var8), this.method3396(var8), this.method3397(var8));
        } else {
            var8.field3008 = class65.method1263(var7, this.method3414(var8), 0, this.method3397(var8));
            this.method3465(var8, var6.field2928[arg1] < 0);
        }
        if (var6.field2928[arg1] < 0) {
            var8.field3008.method1265(-1);
        }
        if (var8.field3012 >= 0) {
            class188 var9 = this.field2979[arg0][var8.field3012];
            if (var9 != null && var9.field3022 < 0) {
                this.field2978[arg0][var9.field3013] = null;
                var9.field3022 = 0;
            }
            this.field2979[arg0][var8.field3012] = var8;
        }
        this.field2960.field3003.method3550(var8);
        this.field2978[arg0][arg1] = var8;
    }

    @ObfuscatedName("gg.h(Lge;ZB)V")
    public void method3465(class188 arg0, boolean arg1) {
        int var3 = arg0.field3018.field1199.length;
        int var5;
        if (arg1 && arg0.field3018.field1203) {
            int var4 = var3 + var3 - arg0.field3018.field1201;
            var5 = (int) ((long) this.field2983[arg0.field3015] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field3008.method1272(true);
            }
        } else {
            var5 = (int) ((long) this.field2983[arg0.field3015] * (long) var3 >> 6);
        }
        arg0.field3008.method1350(var5);
    }

    @ObfuscatedName("gg.v(IIII)V")
    public void method3385(int arg0, int arg1, int arg2) {
        class188 var4 = this.field2978[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2978[arg0][arg1] = null;
        if ((this.field2976[arg0] & 0x2) == 0) {
            var4.field3022 = 0;
            return;
        }
        for (class188 var5 = (class188) this.field2960.field3003.method3575(); var5 != null; var5 = (class188) this.field2960.field3003.method3565()) {
            if (var4.field3015 == var5.field3015 && var5.field3022 < 0 && var4 != var5) {
                var4.field3022 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("gg.a(IIIB)V")
    public void method3386(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("gg.f(III)V")
    public void method3387(int arg0, int arg1) {
    }

    @ObfuscatedName("gg.q(III)V")
    public void method3392(int arg0, int arg1) {
        this.field2971[arg0] = arg1;
    }

    @ObfuscatedName("gg.m(II)V")
    public void method3389(int arg0) {
        for (class188 var2 = (class188) this.field2960.field3003.method3575(); var2 != null; var2 = (class188) this.field2960.field3003.method3565()) {
            if (arg0 < 0 || var2.field3015 == arg0) {
                if (var2.field3008 != null) {
                    var2.field3008.method1303(Statics.field1154 / 100);
                    if (var2.field3008.method1277()) {
                        this.field2960.field3004.method1148(var2.field3008);
                    }
                    var2.method3482();
                }
                if (var2.field3022 < 0) {
                    this.field2978[var2.field3015][var2.field3013] = null;
                }
                var2.method3647();
            }
        }
    }

    @ObfuscatedName("gg.az(II)V")
    public void method3459(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3459(var2);
            }
            return;
        }
        this.field2977[arg0] = 12800;
        this.field2964[arg0] = 8192;
        this.field2965[arg0] = 16383;
        this.field2971[arg0] = 8192;
        this.field2970[arg0] = 0;
        this.field2963[arg0] = 8192;
        this.method3398(arg0);
        this.method3447(arg0);
        this.field2976[arg0] = 0;
        this.field2973[arg0] = 32767;
        this.field2974[arg0] = 256;
        this.field2983[arg0] = 0;
        this.method3394(arg0, 8192);
    }

    @ObfuscatedName("gg.ax(II)V")
    public void method3391(int arg0) {
        for (class188 var2 = (class188) this.field2960.field3003.method3575(); var2 != null; var2 = (class188) this.field2960.field3003.method3565()) {
            if ((arg0 < 0 || var2.field3015 == arg0) && var2.field3022 < 0) {
                this.field2978[var2.field3015][var2.field3013] = null;
                var2.field3022 = 0;
            }
        }
    }

    @ObfuscatedName("gg.ac(I)V")
    public void method3404() {
        this.method3389(-1);
        this.method3459(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2966[var1] = this.field2967[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2968[var2] = this.field2967[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("gg.aa(IB)V")
    public void method3398(int arg0) {
        if ((this.field2976[arg0] & 0x2) == 0) {
            return;
        }
        for (class188 var2 = (class188) this.field2960.field3003.method3575(); var2 != null; var2 = (class188) this.field2960.field3003.method3565()) {
            if (var2.field3015 == arg0 && this.field2978[arg0][var2.field3013] == null && var2.field3022 < 0) {
                var2.field3022 = 0;
            }
        }
    }

    @ObfuscatedName("gg.ay(IB)V")
    public void method3447(int arg0) {
        if ((this.field2976[arg0] & 0x4) == 0) {
            return;
        }
        for (class188 var2 = (class188) this.field2960.field3003.method3575(); var2 != null; var2 = (class188) this.field2960.field3003.method3565()) {
            if (var2.field3015 == arg0) {
                var2.field3028 = 0;
            }
        }
    }

    @ObfuscatedName("gg.ak(II)V")
    public void method3393(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3385(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3383(var6, var7, var8);
            } else {
                this.method3385(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3386(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2968[var12] = (var14 << 14) + (this.field2968[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2968[var12] = (var14 << 7) + (this.field2968[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2970[var12] = (var14 << 7) + (this.field2970[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2970[var12] = (this.field2970[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2963[var12] = (var14 << 7) + (this.field2963[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2963[var12] = (this.field2963[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2977[var12] = (var14 << 7) + (this.field2977[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2977[var12] = (this.field2977[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2964[var12] = (var14 << 7) + (this.field2964[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2964[var12] = (this.field2964[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2965[var12] = (var14 << 7) + (this.field2965[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2965[var12] = (this.field2965[var12] & 0xFFFFFF80) + var14;
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
                    this.method3398(var12);
                    this.field2976[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2973[var12] = (var14 << 7) + (this.field2973[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2973[var12] = (this.field2973[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2973[var12] = (var14 << 7) + (this.field2973[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2973[var12] = (this.field2973[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3389(var12);
            }
            if (var13 == 121) {
                this.method3459(var12);
            }
            if (var13 == 123) {
                this.method3391(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2973[var12];
                if (var15 == 16384) {
                    this.field2974[var12] = (var14 << 7) + (this.field2974[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2973[var12];
                if (var16 == 16384) {
                    this.field2974[var12] = (this.field2974[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2983[var12] = (var14 << 7) + (this.field2983[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2983[var12] = (this.field2983[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2976[var12] |= 0x4;
                } else {
                    this.method3447(var12);
                    this.field2976[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3394(var12, (var14 << 7) + (this.field2986[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3394(var12, (this.field2986[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3382(var17, this.field2968[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3387(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method3392(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3404();
            }
        }
    }

    @ObfuscatedName("gg.au(III)V")
    public void method3394(int arg0, int arg1) {
        this.field2986[arg0] = arg1;
        this.field2969[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("gg.av(Lge;I)I")
    public int method3414(class188 arg0) {
        int var2 = (arg0.field3020 * arg0.field3014 >> 12) + arg0.field3016;
        int var3 = ((this.field2971[arg0.field3015] - 8192) * this.field2974[arg0.field3015] >> 12) + var2;
        class186 var4 = arg0.field3011;
        if (var4.field2990 > 0 && (var4.field2996 > 0 || this.field2970[arg0.field3015] > 0)) {
            int var5 = var4.field2996 << 2;
            int var6 = var4.field2991 << 1;
            if (arg0.field3024 < var6) {
                var5 = arg0.field3024 * var5 / var6;
            }
            int var7 = (this.field2970[arg0.field3015] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field3025 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field3018.field1200 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1154 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("gg.at(Lge;I)I")
    public int method3396(class188 arg0) {
        class186 var2 = arg0.field3011;
        int var3 = this.field2977[arg0.field3015] * this.field2965[arg0.field3015] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field3026 * var4 + 16384 >> 15;
        int var6 = this.field2961 * var5 + 128 >> 8;
        if (var2.field2998 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field3019 * 1.953125E-5D * (double) var2.field2998) + 0.5D);
        }
        if (var2.field2997 != null) {
            int var7 = arg0.field3017;
            int var8 = var2.field2997[arg0.field3021 + 1];
            if (arg0.field3021 < var2.field2997.length - 2) {
                int var9 = (var2.field2997[arg0.field3021] & 0xFF) << 8;
                int var10 = (var2.field2997[arg0.field3021 + 2] & 0xFF) << 8;
                var8 += (var2.field2997[arg0.field3021 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field3022 > 0 && var2.field3000 != null) {
            int var11 = arg0.field3022;
            int var12 = var2.field3000[arg0.field3023 + 1];
            if (arg0.field3023 < var2.field3000.length - 2) {
                int var13 = (var2.field3000[arg0.field3023] & 0xFF) << 8;
                int var14 = (var2.field3000[arg0.field3023 + 2] & 0xFF) << 8;
                var12 += (var2.field3000[arg0.field3023 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("gg.am(Lge;B)I")
    public int method3397(class188 arg0) {
        int var2 = this.field2964[arg0.field3015];
        return var2 < 8192 ? arg0.field3010 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field3010) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("gg.y()Lbn;")
    public synchronized class67 method1117() {
        return this.field2960;
    }

    @ObfuscatedName("gg.r()Lbn;")
    public synchronized class67 method1118() {
        return null;
    }

    @ObfuscatedName("gg.c()I")
    public synchronized int method1115() {
        return 0;
    }

    @ObfuscatedName("gg.l([III)V")
    public synchronized void method1120(int[] arg0, int arg1, int arg2) {
        if (this.field2980.method3306()) {
            int var4 = this.field2962 * this.field2980.field2937 / Statics.field1154;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2984;
                if (this.field2985 - var5 >= 0L) {
                    this.field2984 = var5;
                    break;
                }
                int var7 = (int) ((this.field2985 - this.field2984 + (long) var4 - 1L) / (long) var4);
                this.field2984 += (long) var4 * (long) var7;
                this.field2960.method1120(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3381();
            } while (this.field2980.method3306());
        }
        this.field2960.method1120(arg0, arg1, arg2);
    }

    @ObfuscatedName("gg.p(I)V")
    public synchronized void method1122(int arg0) {
        if (this.field2980.method3306()) {
            int var2 = this.field2962 * this.field2980.field2937 / Statics.field1154;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2984;
                if (this.field2985 - var3 >= 0L) {
                    this.field2984 = var3;
                    break;
                }
                int var5 = (int) ((this.field2985 - this.field2984 + (long) var2 - 1L) / (long) var2);
                this.field2984 += (long) var2 * (long) var5;
                this.field2960.method1122(var5);
                arg0 -= var5;
                this.method3381();
            } while (this.field2980.method3306());
        }
        this.field2960.method1122(arg0);
    }

    @ObfuscatedName("gg.ab(I)V")
    public void method3381() {
        int var1 = this.field2982;
        int var2 = this.field2988;
        long var3 = this.field2985;
        while (this.field2988 == var2) {
            while (this.field2980.field2940[var1] == var2) {
                this.field2980.method3308(var1);
                int var5 = this.field2980.method3311(var1);
                if (var5 == 1) {
                    this.field2980.method3317();
                    this.field2980.method3309(var1);
                    if (this.field2980.method3316()) {
                        if (!this.field2981 || var2 == 0) {
                            this.method3404();
                            this.field2980.method3305();
                            return;
                        }
                        this.field2980.method3358(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3393(var5);
                }
                this.field2980.method3310(var1);
                this.field2980.method3309(var1);
            }
            var1 = this.field2980.method3315();
            var2 = this.field2980.field2940[var1];
            var3 = this.field2980.method3314(var2);
        }
        this.field2982 = var1;
        this.field2988 = var2;
        this.field2985 = var3;
    }

    @ObfuscatedName("gg.ai(Lge;I)Z")
    public boolean method3403(class188 arg0) {
        if (arg0.field3008 != null) {
            return false;
        }
        if (arg0.field3022 >= 0) {
            arg0.method3647();
            if (arg0.field3012 > 0 && this.field2979[arg0.field3015][arg0.field3012] == arg0) {
                this.field2979[arg0.field3015][arg0.field3012] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("gg.ad(Lge;[IIII)Z")
    public boolean method3400(class188 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field3027 = Statics.field1154 / 100;
        if (arg0.field3022 >= 0 && arg0.field3008 == null || arg0.field3008.method1331()) {
            arg0.method3482();
            arg0.method3647();
            if (arg0.field3012 > 0 && this.field2979[arg0.field3015][arg0.field3012] == arg0) {
                this.field2979[arg0.field3015][arg0.field3012] = null;
            }
            return true;
        }
        int var5 = arg0.field3020;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2963[arg0.field3015] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field3020 = var6;
        }
        arg0.field3008.method1276(this.method3414(arg0));
        class186 var7 = arg0.field3011;
        boolean var8 = false;
        arg0.field3024++;
        arg0.field3025 += var7.field2990;
        double var9 = (double) ((arg0.field3013 - 60 << 8) + (arg0.field3020 * arg0.field3014 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2998 > 0) {
            if (var7.field2995 > 0) {
                arg0.field3019 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2995 * var9) + 0.5D);
            } else {
                arg0.field3019 += 128;
            }
        }
        if (var7.field2997 != null) {
            if (var7.field2993 > 0) {
                arg0.field3017 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2993 * var9) + 0.5D);
            } else {
                arg0.field3017 += 128;
            }
            while (arg0.field3021 < var7.field2997.length - 2 && arg0.field3017 > (var7.field2997[arg0.field3021 + 2] & 0xFF) << 8) {
                arg0.field3021 += 2;
            }
            if (arg0.field3021 == var7.field2997.length - 2 && var7.field2997[arg0.field3021 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field3022 >= 0 && var7.field3000 != null && (this.field2976[arg0.field3015] & 0x1) == 0 && (arg0.field3012 < 0 || this.field2979[arg0.field3015][arg0.field3012] != arg0)) {
            if (var7.field2994 > 0) {
                arg0.field3022 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2994 * var9) + 0.5D);
            } else {
                arg0.field3022 += 128;
            }
            while (arg0.field3023 < var7.field3000.length - 2 && arg0.field3022 > (var7.field3000[arg0.field3023 + 2] & 0xFF) << 8) {
                arg0.field3023 += 2;
            }
            if (arg0.field3023 == var7.field3000.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field3008.method1275(arg0.field3027, this.method3396(arg0), this.method3397(arg0));
            return false;
        }
        arg0.field3008.method1303(arg0.field3027);
        if (arg1 == null) {
            arg0.field3008.method1122(arg3);
        } else {
            arg0.field3008.method1120(arg1, arg2, arg3);
        }
        if (arg0.field3008.method1277()) {
            this.field2960.field3004.method1148(arg0.field3008);
        }
        arg0.method3482();
        if (arg0.field3022 >= 0) {
            arg0.method3647();
            if (arg0.field3012 > 0 && this.field2979[arg0.field3015][arg0.field3012] == arg0) {
                this.field2979[arg0.field3015][arg0.field3012] = null;
            }
        }
        return true;
    }
}
