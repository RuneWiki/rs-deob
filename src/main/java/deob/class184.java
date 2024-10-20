package deob;

@ObfuscatedName("gh")
public class class184 extends class67 {

    @ObfuscatedName("gh.j")
    public class196 field2979 = new class196(128);

    @ObfuscatedName("gh.l")
    public int field2961 = 256;

    @ObfuscatedName("gh.a")
    public int field2983 = 1000000;

    @ObfuscatedName("gh.i")
    public int[] field2962 = new int[16];

    @ObfuscatedName("gh.f")
    public int[] field2964 = new int[16];

    @ObfuscatedName("gh.m")
    public int[] field2965 = new int[16];

    @ObfuscatedName("gh.o")
    public int[] field2966 = new int[16];

    @ObfuscatedName("gh.h")
    public int[] field2985 = new int[16];

    @ObfuscatedName("gh.n")
    public int[] field2970 = new int[16];

    @ObfuscatedName("gh.k")
    public int[] field2960 = new int[16];

    @ObfuscatedName("gh.r")
    public int[] field2971 = new int[16];

    @ObfuscatedName("gh.b")
    public int[] field2963 = new int[16];

    @ObfuscatedName("gh.p")
    public int[] field2972 = new int[16];

    @ObfuscatedName("gh.w")
    public int[] field2973 = new int[16];

    @ObfuscatedName("gh.t")
    public int[] field2974 = new int[16];

    @ObfuscatedName("gh.c")
    public int[] field2975 = new int[16];

    @ObfuscatedName("gh.x")
    public int[] field2976 = new int[16];

    @ObfuscatedName("gh.e")
    public int[] field2977 = new int[16];

    @ObfuscatedName("gh.v")
    public class187[][] field2978 = new class187[16][128];

    @ObfuscatedName("gh.ab")
    public class187[][] field2986 = new class187[16][128];

    @ObfuscatedName("gh.ak")
    public class182 field2980 = new class182();

    @ObfuscatedName("gh.am")
    public boolean field2981;

    @ObfuscatedName("gh.aw")
    public int field2982;

    @ObfuscatedName("gh.az")
    public int field2967;

    @ObfuscatedName("gh.ac")
    public long field2984;

    @ObfuscatedName("gh.ax")
    public long field2969;

    @ObfuscatedName("gh.ai")
    public class186 field2968 = new class186(this);

    public class184() {
        this.method3350();
    }

    @ObfuscatedName("gh.j(II)V")
    public synchronized void method3332(int arg0) {
        this.field2961 = arg0;
    }

    @ObfuscatedName("gh.l(I)I")
    public int method3333() {
        return this.field2961;
    }

    @ObfuscatedName("gh.a(Lfs;Lff;Lbk;II)Z")
    public synchronized boolean method3334(class180 arg0, class167 arg1, class60 arg2, int arg3) {
        arg0.method3244();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class197 var7 = (class197) arg0.field2924.method3503(); var7 != null; var7 = (class197) arg0.field2924.method3502()) {
            int var8 = (int) var7.field3113;
            class181 var9 = (class181) this.field2979.method3499((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method3010(var8);
                class181 var11;
                if (var10 == null) {
                    var11 = null;
                } else {
                    var11 = new class181(var10);
                }
                var9 = var11;
                if (var11 == null) {
                    var5 = false;
                    continue;
                }
                this.field2979.method3501(var11, (long) var8);
            }
            if (!var9.method3255(arg2, var7.field3091, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3245();
        }
        return var5;
    }

    @ObfuscatedName("gh.i(I)V")
    public synchronized void method3366() {
        for (class181 var1 = (class181) this.field2979.method3503(); var1 != null; var1 = (class181) this.field2979.method3502()) {
            var1.method3256();
        }
    }

    @ObfuscatedName("gh.f(B)V")
    public synchronized void method3335() {
        for (class181 var1 = (class181) this.field2979.method3503(); var1 != null; var1 = (class181) this.field2979.method3502()) {
            var1.method3608();
        }
    }

    @ObfuscatedName("gh.k(Lfs;ZI)V")
    public synchronized void method3336(class180 arg0, boolean arg1) {
        this.method3406();
        this.field2980.method3276(arg0.field2925);
        this.field2981 = arg1;
        this.field2984 = 0L;
        int var3 = this.field2980.method3265();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2980.method3266(var4);
            this.field2980.method3269(var4);
            this.field2980.method3267(var4);
        }
        this.field2982 = this.field2980.method3274();
        this.field2967 = this.field2980.field2942[this.field2982];
        this.field2969 = this.field2980.method3273(this.field2967);
    }

    @ObfuscatedName("gh.b(I)V")
    public synchronized void method3406() {
        this.field2980.method3263();
        this.method3350();
    }

    @ObfuscatedName("gh.q(I)Z")
    public synchronized boolean method3338() {
        return this.field2980.method3264();
    }

    @ObfuscatedName("gh.u(III)V")
    public synchronized void method3424(int arg0, int arg1) {
        this.method3340(arg0, arg1);
    }

    @ObfuscatedName("gh.g(III)V")
    public void method3340(int arg0, int arg1) {
        this.field2966[arg0] = arg1;
        this.field2970[arg0] = arg1 & 0xFFFFFF80;
        this.method3414(arg0, arg1);
    }

    @ObfuscatedName("gh.y(III)V")
    public void method3414(int arg0, int arg1) {
        if (this.field2985[arg0] != arg1) {
            this.field2985[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2986[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("gh.s(IIII)V")
    public void method3404(int arg0, int arg1, int arg2) {
        this.method3405(arg0, arg1, 64);
        if ((this.field2972[arg0] & 0x2) != 0) {
            for (class187 var4 = (class187) this.field2968.field3000.method3529(); var4 != null; var4 = (class187) this.field2968.field3000.method3531()) {
                if (var4.field3013 == arg0 && var4.field3018 < 0) {
                    this.field2978[arg0][var4.field3009] = null;
                    this.field2978[arg0][arg1] = var4;
                    int var5 = (var4.field3024 * var4.field3014 >> 12) + var4.field3012;
                    var4.field3012 += arg1 - var4.field3009 << 8;
                    var4.field3024 = var5 - var4.field3012;
                    var4.field3014 = 4096;
                    var4.field3009 = arg1;
                    return;
                }
            }
        }
        class181 var6 = (class181) this.field2979.method3499((long) this.field2985[arg0]);
        if (var6 == null) {
            return;
        }
        class63 var7 = var6.field2927[arg1];
        if (var7 == null) {
            return;
        }
        class187 var8 = new class187();
        var8.field3013 = arg0;
        var8.field3005 = var6;
        var8.field3016 = var7;
        var8.field3007 = var6.field2937[arg1];
        var8.field3008 = var6.field2932[arg1];
        var8.field3009 = arg1;
        var8.field3010 = var6.field2926 * arg2 * arg2 * var6.field2929[arg1] + 1024 >> 11;
        var8.field3004 = var6.field2930[arg1] & 0xFF;
        var8.field3012 = (arg1 << 8) - (var6.field2928[arg1] & 0x7FFF);
        var8.field3015 = 0;
        var8.field3017 = 0;
        var8.field3022 = 0;
        var8.field3018 = -1;
        var8.field3006 = 0;
        if (this.field2975[arg0] == 0) {
            var8.field3019 = class65.method1308(var7, this.method3355(var8), this.method3372(var8), this.method3357(var8));
        } else {
            var8.field3019 = class65.method1308(var7, this.method3355(var8), 0, this.method3357(var8));
            this.method3410(var8, var6.field2928[arg1] < 0);
        }
        if (var6.field2928[arg1] < 0) {
            var8.field3019.method1267(-1);
        }
        if (var8.field3008 >= 0) {
            class187 var9 = this.field2986[arg0][var8.field3008];
            if (var9 != null && var9.field3018 < 0) {
                this.field2978[arg0][var9.field3009] = null;
                var9.field3018 = 0;
            }
            this.field2986[arg0][var8.field3008] = var8;
        }
        this.field2968.field3000.method3523(var8);
        this.field2978[arg0][arg1] = var8;
    }

    @ObfuscatedName("gh.d(Lgf;ZI)V")
    public void method3410(class187 arg0, boolean arg1) {
        int var3 = arg0.field3016.field1240.length;
        int var5;
        if (arg1 && arg0.field3016.field1243) {
            int var4 = var3 + var3 - arg0.field3016.field1241;
            var5 = (int) ((long) this.field2975[arg0.field3013] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field3019.method1274(true);
            }
        } else {
            var5 = (int) ((long) this.field2975[arg0.field3013] * (long) var3 >> 6);
        }
        arg0.field3019.method1273(var5);
    }

    @ObfuscatedName("gh.z(IIII)V")
    public void method3405(int arg0, int arg1, int arg2) {
        class187 var4 = this.field2978[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2978[arg0][arg1] = null;
        if ((this.field2972[arg0] & 0x2) == 0) {
            var4.field3018 = 0;
            return;
        }
        for (class187 var5 = (class187) this.field2968.field3000.method3528(); var5 != null; var5 = (class187) this.field2968.field3000.method3527()) {
            if (var4.field3013 == var5.field3013 && var5.field3018 < 0 && var4 != var5) {
                var4.field3018 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("gh.p(IIII)V")
    public void method3344(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("gh.w(IIB)V")
    public void method3345(int arg0, int arg1) {
    }

    @ObfuscatedName("gh.t(III)V")
    public void method3346(int arg0, int arg1) {
        this.field2960[arg0] = arg1;
    }

    @ObfuscatedName("gh.c(II)V")
    public void method3347(int arg0) {
        for (class187 var2 = (class187) this.field2968.field3000.method3528(); var2 != null; var2 = (class187) this.field2968.field3000.method3527()) {
            if (arg0 < 0 || var2.field3013 == arg0) {
                if (var2.field3019 != null) {
                    var2.field3019.method1277(Statics.field1781 / 100);
                    if (var2.field3019.method1265()) {
                        this.field2968.field3002.method1137(var2.field3019);
                    }
                    var2.method3453();
                }
                if (var2.field3018 < 0) {
                    this.field2978[var2.field3013][var2.field3009] = null;
                }
                var2.method3608();
            }
        }
    }

    @ObfuscatedName("gh.x(II)V")
    public void method3348(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3348(var2);
            }
            return;
        }
        this.field2962[arg0] = 12800;
        this.field2964[arg0] = 8192;
        this.field2965[arg0] = 16383;
        this.field2960[arg0] = 8192;
        this.field2971[arg0] = 0;
        this.field2963[arg0] = 8192;
        this.method3427(arg0);
        this.method3429(arg0);
        this.field2972[arg0] = 0;
        this.field2973[arg0] = 32767;
        this.field2974[arg0] = 256;
        this.field2975[arg0] = 0;
        this.method3356(arg0, 8192);
    }

    @ObfuscatedName("gh.e(IB)V")
    public void method3349(int arg0) {
        for (class187 var2 = (class187) this.field2968.field3000.method3528(); var2 != null; var2 = (class187) this.field2968.field3000.method3527()) {
            if ((arg0 < 0 || var2.field3013 == arg0) && var2.field3018 < 0) {
                this.field2978[var2.field3013][var2.field3009] = null;
                var2.field3018 = 0;
            }
        }
    }

    @ObfuscatedName("gh.v(I)V")
    public void method3350() {
        this.method3347(-1);
        this.method3348(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2985[var1] = this.field2966[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2970[var2] = this.field2966[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("gh.ar(II)V")
    public void method3427(int arg0) {
        if ((this.field2972[arg0] & 0x2) == 0) {
            return;
        }
        for (class187 var2 = (class187) this.field2968.field3000.method3528(); var2 != null; var2 = (class187) this.field2968.field3000.method3527()) {
            if (var2.field3013 == arg0 && this.field2978[arg0][var2.field3009] == null && var2.field3018 < 0) {
                var2.field3018 = 0;
            }
        }
    }

    @ObfuscatedName("gh.aa(IB)V")
    public void method3429(int arg0) {
        if ((this.field2972[arg0] & 0x4) == 0) {
            return;
        }
        for (class187 var2 = (class187) this.field2968.field3000.method3528(); var2 != null; var2 = (class187) this.field2968.field3000.method3527()) {
            if (var2.field3013 == arg0) {
                var2.field3011 = 0;
            }
        }
    }

    @ObfuscatedName("gh.ag(IB)V")
    public void method3353(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3405(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3404(var6, var7, var8);
            } else {
                this.method3405(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3344(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2970[var12] = (var14 << 14) + (this.field2970[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2970[var12] = (var14 << 7) + (this.field2970[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2971[var12] = (var14 << 7) + (this.field2971[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2971[var12] = (this.field2971[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2963[var12] = (var14 << 7) + (this.field2963[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2963[var12] = (this.field2963[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2962[var12] = (var14 << 7) + (this.field2962[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2962[var12] = (this.field2962[var12] & 0xFFFFFF80) + var14;
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
                    this.field2972[var12] |= 0x1;
                } else {
                    this.field2972[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2972[var12] |= 0x2;
                } else {
                    this.method3427(var12);
                    this.field2972[var12] &= 0xFFFFFFFD;
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
                this.method3347(var12);
            }
            if (var13 == 121) {
                this.method3348(var12);
            }
            if (var13 == 123) {
                this.method3349(var12);
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
                this.field2975[var12] = (var14 << 7) + (this.field2975[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2975[var12] = (this.field2975[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2972[var12] |= 0x4;
                } else {
                    this.method3429(var12);
                    this.field2972[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3356(var12, (var14 << 7) + (this.field2976[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3356(var12, (this.field2976[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3414(var17, this.field2970[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3345(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method3346(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3350();
            }
        }
    }

    @ObfuscatedName("gh.ao(IIB)V")
    public void method3356(int arg0, int arg1) {
        this.field2976[arg0] = arg1;
        this.field2977[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("gh.an(Lgf;B)I")
    public int method3355(class187 arg0) {
        int var2 = (arg0.field3024 * arg0.field3014 >> 12) + arg0.field3012;
        int var3 = ((this.field2960[arg0.field3013] - 8192) * this.field2974[arg0.field3013] >> 12) + var2;
        class185 var4 = arg0.field3007;
        if (var4.field2995 > 0 && (var4.field2998 > 0 || this.field2971[arg0.field3013] > 0)) {
            int var5 = var4.field2998 << 2;
            int var6 = var4.field2996 << 1;
            if (arg0.field3020 < var6) {
                var5 = arg0.field3020 * var5 / var6;
            }
            int var7 = (this.field2971[arg0.field3013] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field3021 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field3016.field1242 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1781 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("gh.at(Lgf;B)I")
    public int method3372(class187 arg0) {
        class185 var2 = arg0.field3007;
        int var3 = this.field2962[arg0.field3013] * this.field2965[arg0.field3013] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field3010 * var4 + 16384 >> 15;
        int var6 = this.field2961 * var5 + 128 >> 8;
        if (var2.field2990 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field3015 * 1.953125E-5D * (double) var2.field2990) + 0.5D);
        }
        if (var2.field2992 != null) {
            int var7 = arg0.field3017;
            int var8 = var2.field2992[arg0.field3022 + 1];
            if (arg0.field3022 < var2.field2992.length - 2) {
                int var9 = (var2.field2992[arg0.field3022] & 0xFF) << 8;
                int var10 = (var2.field2992[arg0.field3022 + 2] & 0xFF) << 8;
                var8 += (var2.field2992[arg0.field3022 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field3018 > 0 && var2.field2989 != null) {
            int var11 = arg0.field3018;
            int var12 = var2.field2989[arg0.field3006 + 1];
            if (arg0.field3006 < var2.field2989.length - 2) {
                int var13 = (var2.field2989[arg0.field3006] & 0xFF) << 8;
                int var14 = (var2.field2989[arg0.field3006 + 2] & 0xFF) << 8;
                var12 += (var2.field2989[arg0.field3006 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("gh.al(Lgf;I)I")
    public int method3357(class187 arg0) {
        int var2 = this.field2964[arg0.field3013];
        return var2 < 8192 ? arg0.field3004 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field3004) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("gh.m()Lbf;")
    public synchronized class67 method1126() {
        return this.field2968;
    }

    @ObfuscatedName("gh.o()Lbf;")
    public synchronized class67 method1138() {
        return null;
    }

    @ObfuscatedName("gh.h()I")
    public synchronized int method1121() {
        return 0;
    }

    @ObfuscatedName("gh.n([III)V")
    public synchronized void method1129(int[] arg0, int arg1, int arg2) {
        if (this.field2980.method3264()) {
            int var4 = this.field2983 * this.field2980.field2939 / Statics.field1781;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2984;
                if (this.field2969 - var5 >= 0L) {
                    this.field2984 = var5;
                    break;
                }
                int var7 = (int) ((this.field2969 - this.field2984 + (long) var4 - 1L) / (long) var4);
                this.field2984 += (long) var4 * (long) var7;
                this.field2968.method1129(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3360();
            } while (this.field2980.method3264());
        }
        this.field2968.method1129(arg0, arg1, arg2);
    }

    @ObfuscatedName("gh.r(I)V")
    public synchronized void method1131(int arg0) {
        if (this.field2980.method3264()) {
            int var2 = this.field2983 * this.field2980.field2939 / Statics.field1781;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2984;
                if (this.field2969 - var3 >= 0L) {
                    this.field2984 = var3;
                    break;
                }
                int var5 = (int) ((this.field2969 - this.field2984 + (long) var2 - 1L) / (long) var2);
                this.field2984 += (long) var2 * (long) var5;
                this.field2968.method1131(var5);
                arg0 -= var5;
                this.method3360();
            } while (this.field2980.method3264());
        }
        this.field2968.method1131(arg0);
    }

    @ObfuscatedName("gh.aq(I)V")
    public void method3360() {
        int var1 = this.field2982;
        int var2 = this.field2967;
        long var3 = this.field2969;
        while (this.field2967 == var2) {
            while (this.field2980.field2942[var1] == var2) {
                this.field2980.method3266(var1);
                int var5 = this.field2980.method3309(var1);
                if (var5 == 1) {
                    this.field2980.method3268();
                    this.field2980.method3267(var1);
                    if (this.field2980.method3262()) {
                        if (!this.field2981 || var2 == 0) {
                            this.method3350();
                            this.field2980.method3263();
                            return;
                        }
                        this.field2980.method3275(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3353(var5);
                }
                this.field2980.method3269(var1);
                this.field2980.method3267(var1);
            }
            var1 = this.field2980.method3274();
            var2 = this.field2980.field2942[var1];
            var3 = this.field2980.method3273(var2);
        }
        this.field2982 = var1;
        this.field2967 = var2;
        this.field2969 = var3;
    }

    @ObfuscatedName("gh.ae(Lgf;I)Z")
    public boolean method3421(class187 arg0) {
        if (arg0.field3019 != null) {
            return false;
        }
        if (arg0.field3018 >= 0) {
            arg0.method3608();
            if (arg0.field3008 > 0 && this.field2986[arg0.field3013][arg0.field3008] == arg0) {
                this.field2986[arg0.field3013][arg0.field3008] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("gh.ap(Lgf;[IIII)Z")
    public boolean method3361(class187 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field3023 = Statics.field1781 / 100;
        if (arg0.field3018 >= 0 && arg0.field3019 == null || arg0.field3019.method1280()) {
            arg0.method3453();
            arg0.method3608();
            if (arg0.field3008 > 0 && this.field2986[arg0.field3013][arg0.field3008] == arg0) {
                this.field2986[arg0.field3013][arg0.field3008] = null;
            }
            return true;
        }
        int var5 = arg0.field3014;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2963[arg0.field3013] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field3014 = var6;
        }
        arg0.field3019.method1278(this.method3355(arg0));
        class185 var7 = arg0.field3007;
        boolean var8 = false;
        arg0.field3020++;
        arg0.field3021 += var7.field2995;
        double var9 = (double) ((arg0.field3009 - 60 << 8) + (arg0.field3024 * arg0.field3014 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2990 > 0) {
            if (var7.field2993 > 0) {
                arg0.field3015 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2993 * var9) + 0.5D);
            } else {
                arg0.field3015 += 128;
            }
        }
        if (var7.field2992 != null) {
            if (var7.field2988 > 0) {
                arg0.field3017 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2988 * var9) + 0.5D);
            } else {
                arg0.field3017 += 128;
            }
            while (arg0.field3022 < var7.field2992.length - 2 && arg0.field3017 > (var7.field2992[arg0.field3022 + 2] & 0xFF) << 8) {
                arg0.field3022 += 2;
            }
            if (arg0.field3022 == var7.field2992.length - 2 && var7.field2992[arg0.field3022 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field3018 >= 0 && var7.field2989 != null && (this.field2972[arg0.field3013] & 0x1) == 0 && (arg0.field3008 < 0 || this.field2986[arg0.field3013][arg0.field3008] != arg0)) {
            if (var7.field2991 > 0) {
                arg0.field3018 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2991 * var9) + 0.5D);
            } else {
                arg0.field3018 += 128;
            }
            while (arg0.field3006 < var7.field2989.length - 2 && arg0.field3018 > (var7.field2989[arg0.field3006 + 2] & 0xFF) << 8) {
                arg0.field3006 += 2;
            }
            if (arg0.field3006 == var7.field2989.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field3019.method1314(arg0.field3023, this.method3372(arg0), this.method3357(arg0));
            return false;
        }
        arg0.field3019.method1277(arg0.field3023);
        if (arg1 == null) {
            arg0.field3019.method1131(arg3);
        } else {
            arg0.field3019.method1129(arg1, arg2, arg3);
        }
        if (arg0.field3019.method1265()) {
            this.field2968.field3002.method1137(arg0.field3019);
        }
        arg0.method3453();
        if (arg0.field3018 >= 0) {
            arg0.method3608();
            if (arg0.field3008 > 0 && this.field2986[arg0.field3013][arg0.field3008] == arg0) {
                this.field2986[arg0.field3013][arg0.field3008] = null;
            }
        }
        return true;
    }
}
