package deob;

@ObfuscatedName("gk")
public class class184 extends class67 {

    @ObfuscatedName("gk.o")
    public class196 field2964 = new class196(128);

    @ObfuscatedName("gk.e")
    public int field2960 = 256;

    @ObfuscatedName("gk.u")
    public int field2961 = 1000000;

    @ObfuscatedName("gk.b")
    public int[] field2962 = new int[16];

    @ObfuscatedName("gk.p")
    public int[] field2959 = new int[16];

    @ObfuscatedName("gk.s")
    public int[] field2969 = new int[16];

    @ObfuscatedName("gk.y")
    public int[] field2982 = new int[16];

    @ObfuscatedName("gk.t")
    public int[] field2966 = new int[16];

    @ObfuscatedName("gk.h")
    public int[] field2967 = new int[16];

    @ObfuscatedName("gk.d")
    public int[] field2968 = new int[16];

    @ObfuscatedName("gk.l")
    public int[] field2976 = new int[16];

    @ObfuscatedName("gk.n")
    public int[] field2970 = new int[16];

    @ObfuscatedName("gk.i")
    public int[] field2978 = new int[16];

    @ObfuscatedName("gk.j")
    public int[] field2973 = new int[16];

    @ObfuscatedName("gk.z")
    public int[] field2974 = new int[16];

    @ObfuscatedName("gk.m")
    public int[] field2975 = new int[16];

    @ObfuscatedName("gk.g")
    public int[] field2963 = new int[16];

    @ObfuscatedName("gk.c")
    public int[] field2981 = new int[16];

    @ObfuscatedName("gk.x")
    public class187[][] field2971 = new class187[16][128];

    @ObfuscatedName("gk.ah")
    public class187[][] field2977 = new class187[16][128];

    @ObfuscatedName("gk.ap")
    public class182 field2980 = new class182();

    @ObfuscatedName("gk.aa")
    public boolean field2965;

    @ObfuscatedName("gk.ay")
    public int field2979;

    @ObfuscatedName("gk.ak")
    public int field2972;

    @ObfuscatedName("gk.an")
    public long field2984;

    @ObfuscatedName("gk.af")
    public long field2985;

    @ObfuscatedName("gk.ao")
    public class186 field2986 = new class186(this);

    public class184() {
        this.method3399();
    }

    @ObfuscatedName("gk.o(IB)V")
    public synchronized void method3392(int arg0) {
        this.field2960 = arg0;
    }

    @ObfuscatedName("gk.e(B)I")
    public int method3376() {
        return this.field2960;
    }

    @ObfuscatedName("gk.u(Lfg;Lfq;Lbc;II)Z")
    public synchronized boolean method3436(class180 arg0, class167 arg1, class60 arg2, int arg3) {
        arg0.method3293();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class197 var7 = (class197) arg0.field2923.method3548(); var7 != null; var7 = (class197) arg0.field2923.method3546()) {
            int var8 = (int) var7.field3113;
            class181 var9 = (class181) this.field2964.method3545((long) var8);
            if (var9 == null) {
                var9 = Statics.method52(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field2964.method3544(var9, (long) var8);
            }
            if (!var9.method3299(arg2, var7.field3091, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3294();
        }
        return var5;
    }

    @ObfuscatedName("gk.b(I)V")
    public synchronized void method3378() {
        for (class181 var1 = (class181) this.field2964.method3548(); var1 != null; var1 = (class181) this.field2964.method3546()) {
            var1.method3301();
        }
    }

    @ObfuscatedName("gk.p(B)V")
    public synchronized void method3379() {
        for (class181 var1 = (class181) this.field2964.method3548(); var1 != null; var1 = (class181) this.field2964.method3546()) {
            var1.method3670();
        }
    }

    @ObfuscatedName("gk.h(Lfg;ZI)V")
    public synchronized void method3380(class180 arg0, boolean arg1) {
        this.method3427();
        this.field2980.method3308(arg0.field2924);
        this.field2965 = arg1;
        this.field2984 = 0L;
        int var3 = this.field2980.method3316();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2980.method3356(var4);
            this.field2980.method3314(var4);
            this.field2980.method3312(var4);
        }
        this.field2979 = this.field2980.method3319();
        this.field2972 = this.field2980.field2938[this.field2979];
        this.field2985 = this.field2980.method3318(this.field2972);
    }

    @ObfuscatedName("gk.l(I)V")
    public synchronized void method3427() {
        this.field2980.method3329();
        this.method3399();
    }

    @ObfuscatedName("gk.n(I)Z")
    public synchronized boolean method3377() {
        return this.field2980.method3349();
    }

    @ObfuscatedName("gk.q(III)V")
    public synchronized void method3420(int arg0, int arg1) {
        this.method3383(arg0, arg1);
    }

    @ObfuscatedName("gk.f(III)V")
    public void method3383(int arg0, int arg1) {
        this.field2982[arg0] = arg1;
        this.field2967[arg0] = arg1 & 0xFFFFFF80;
        this.method3382(arg0, arg1);
    }

    @ObfuscatedName("gk.v(IIB)V")
    public void method3382(int arg0, int arg1) {
        if (this.field2966[arg0] != arg1) {
            this.field2966[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2977[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("gk.a(IIIB)V")
    public void method3385(int arg0, int arg1, int arg2) {
        this.method3463(arg0, arg1, 64);
        if ((this.field2978[arg0] & 0x2) != 0) {
            for (class187 var4 = (class187) this.field2986.field3000.method3584(); var4 != null; var4 = (class187) this.field2986.field3000.method3586()) {
                if (var4.field3023 == arg0 && var4.field3021 < 0) {
                    this.field2971[arg0][var4.field3018] = null;
                    this.field2971[arg0][arg1] = var4;
                    int var5 = (var4.field3017 * var4.field3016 >> 12) + var4.field3015;
                    var4.field3015 += arg1 - var4.field3018 << 8;
                    var4.field3016 = var5 - var4.field3015;
                    var4.field3017 = 4096;
                    var4.field3018 = arg1;
                    return;
                }
            }
        }
        class181 var6 = (class181) this.field2964.method3545((long) this.field2966[arg0]);
        if (var6 == null) {
            return;
        }
        class63 var7 = var6.field2926[arg1];
        if (var7 == null) {
            return;
        }
        class187 var8 = new class187();
        var8.field3023 = arg0;
        var8.field3008 = var6;
        var8.field3009 = var7;
        var8.field3010 = var6.field2930[arg1];
        var8.field3011 = var6.field2925[arg1];
        var8.field3018 = arg1;
        var8.field3027 = var6.field2931 * arg2 * arg2 * var6.field2928[arg1] + 1024 >> 11;
        var8.field3014 = var6.field2932[arg1] & 0xFF;
        var8.field3015 = (arg1 << 8) - (var6.field2927[arg1] & 0x7FFF);
        var8.field3019 = 0;
        var8.field3025 = 0;
        var8.field3020 = 0;
        var8.field3021 = -1;
        var8.field3012 = 0;
        if (this.field2975[arg0] == 0) {
            var8.field3013 = class65.method1258(var7, this.method3384(var8), this.method3400(var8), this.method3418(var8));
        } else {
            var8.field3013 = class65.method1258(var7, this.method3384(var8), 0, this.method3418(var8));
            this.method3386(var8, var6.field2927[arg1] < 0);
        }
        if (var6.field2927[arg1] < 0) {
            var8.field3013.method1242(-1);
        }
        if (var8.field3011 >= 0) {
            class187 var9 = this.field2977[arg0][var8.field3011];
            if (var9 != null && var9.field3021 < 0) {
                this.field2971[arg0][var9.field3018] = null;
                var9.field3021 = 0;
            }
            this.field2977[arg0][var8.field3011] = var8;
        }
        this.field2986.field3000.method3589(var8);
        this.field2971[arg0][arg1] = var8;
    }

    @ObfuscatedName("gk.k(Lgw;ZI)V")
    public void method3386(class187 arg0, boolean arg1) {
        int var3 = arg0.field3009.field1227.length;
        int var5;
        if (arg1 && arg0.field3009.field1229) {
            int var4 = var3 + var3 - arg0.field3009.field1226;
            var5 = (int) ((long) this.field2975[arg0.field3023] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field3013.method1249(true);
            }
        } else {
            var5 = (int) ((long) this.field2975[arg0.field3023] * (long) var3 >> 6);
        }
        arg0.field3013.method1248(var5);
    }

    @ObfuscatedName("gk.r(IIII)V")
    public void method3463(int arg0, int arg1, int arg2) {
        class187 var4 = this.field2971[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2971[arg0][arg1] = null;
        if ((this.field2978[arg0] & 0x2) == 0) {
            var4.field3021 = 0;
            return;
        }
        for (class187 var5 = (class187) this.field2986.field3000.method3581(); var5 != null; var5 = (class187) this.field2986.field3000.method3583()) {
            if (var4.field3023 == var5.field3023 && var5.field3021 < 0 && var4 != var5) {
                var4.field3021 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("gk.i(IIII)V")
    public void method3388(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("gk.j(III)V")
    public void method3389(int arg0, int arg1) {
    }

    @ObfuscatedName("gk.z(IIB)V")
    public void method3390(int arg0, int arg1) {
        this.field2968[arg0] = arg1;
    }

    @ObfuscatedName("gk.m(II)V")
    public void method3391(int arg0) {
        for (class187 var2 = (class187) this.field2986.field3000.method3581(); var2 != null; var2 = (class187) this.field2986.field3000.method3583()) {
            if (arg0 < 0 || var2.field3023 == arg0) {
                if (var2.field3013 != null) {
                    var2.field3013.method1253(Statics.field2641 / 100);
                    if (var2.field3013.method1257()) {
                        this.field2986.field3001.method1090(var2.field3013);
                    }
                    var2.method3495();
                }
                if (var2.field3021 < 0) {
                    this.field2971[var2.field3023][var2.field3018] = null;
                }
                var2.method3670();
            }
        }
    }

    @ObfuscatedName("gk.g(IS)V")
    public void method3456(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3456(var2);
            }
            return;
        }
        this.field2962[arg0] = 12800;
        this.field2959[arg0] = 8192;
        this.field2969[arg0] = 16383;
        this.field2968[arg0] = 8192;
        this.field2976[arg0] = 0;
        this.field2970[arg0] = 8192;
        this.method3395(arg0);
        this.method3396(arg0);
        this.field2978[arg0] = 0;
        this.field2973[arg0] = 32767;
        this.field2974[arg0] = 256;
        this.field2975[arg0] = 0;
        this.method3401(arg0, 8192);
    }

    @ObfuscatedName("gk.c(II)V")
    public void method3393(int arg0) {
        for (class187 var2 = (class187) this.field2986.field3000.method3581(); var2 != null; var2 = (class187) this.field2986.field3000.method3583()) {
            if ((arg0 < 0 || var2.field3023 == arg0) && var2.field3021 < 0) {
                this.field2971[var2.field3023][var2.field3018] = null;
                var2.field3021 = 0;
            }
        }
    }

    @ObfuscatedName("gk.as(I)V")
    public void method3399() {
        this.method3391(-1);
        this.method3456(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2966[var1] = this.field2982[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2967[var2] = this.field2982[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("gk.am(II)V")
    public void method3395(int arg0) {
        if ((this.field2978[arg0] & 0x2) == 0) {
            return;
        }
        for (class187 var2 = (class187) this.field2986.field3000.method3581(); var2 != null; var2 = (class187) this.field2986.field3000.method3583()) {
            if (var2.field3023 == arg0 && this.field2971[arg0][var2.field3018] == null && var2.field3021 < 0) {
                var2.field3021 = 0;
            }
        }
    }

    @ObfuscatedName("gk.ae(II)V")
    public void method3396(int arg0) {
        if ((this.field2978[arg0] & 0x4) == 0) {
            return;
        }
        for (class187 var2 = (class187) this.field2986.field3000.method3581(); var2 != null; var2 = (class187) this.field2986.field3000.method3583()) {
            if (var2.field3023 == arg0) {
                var2.field3022 = 0;
            }
        }
    }

    @ObfuscatedName("gk.av(IS)V")
    public void method3397(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3463(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3385(var6, var7, var8);
            } else {
                this.method3463(var6, var7, 64);
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
                this.field2967[var12] = (var14 << 14) + (this.field2967[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2967[var12] = (var14 << 7) + (this.field2967[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2976[var12] = (var14 << 7) + (this.field2976[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2976[var12] = (this.field2976[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2970[var12] = (var14 << 7) + (this.field2970[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2970[var12] = (this.field2970[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2962[var12] = (var14 << 7) + (this.field2962[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2962[var12] = (this.field2962[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2959[var12] = (var14 << 7) + (this.field2959[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2959[var12] = (this.field2959[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2969[var12] = (var14 << 7) + (this.field2969[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2969[var12] = (this.field2969[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2978[var12] |= 0x1;
                } else {
                    this.field2978[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2978[var12] |= 0x2;
                } else {
                    this.method3395(var12);
                    this.field2978[var12] &= 0xFFFFFFFD;
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
                this.method3391(var12);
            }
            if (var13 == 121) {
                this.method3456(var12);
            }
            if (var13 == 123) {
                this.method3393(var12);
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
                    this.field2978[var12] |= 0x4;
                } else {
                    this.method3396(var12);
                    this.field2978[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3401(var12, (var14 << 7) + (this.field2963[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3401(var12, (this.field2963[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3382(var17, this.field2967[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3389(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method3390(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3399();
            }
        }
    }

    @ObfuscatedName("gk.ac(IIB)V")
    public void method3401(int arg0, int arg1) {
        this.field2963[arg0] = arg1;
        this.field2981[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("gk.ar(Lgw;I)I")
    public int method3384(class187 arg0) {
        int var2 = (arg0.field3017 * arg0.field3016 >> 12) + arg0.field3015;
        int var3 = ((this.field2968[arg0.field3023] - 8192) * this.field2974[arg0.field3023] >> 12) + var2;
        class185 var4 = arg0.field3010;
        if (var4.field2995 > 0 && (var4.field2988 > 0 || this.field2976[arg0.field3023] > 0)) {
            int var5 = var4.field2988 << 2;
            int var6 = var4.field2996 << 1;
            if (arg0.field3028 < var6) {
                var5 = arg0.field3028 * var5 / var6;
            }
            int var7 = (this.field2976[arg0.field3023] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field3024 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field3009.field1225 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field2641 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("gk.az(Lgw;I)I")
    public int method3400(class187 arg0) {
        class185 var2 = arg0.field3010;
        int var3 = this.field2969[arg0.field3023] * this.field2962[arg0.field3023] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field3027 * var4 + 16384 >> 15;
        int var6 = this.field2960 * var5 + 128 >> 8;
        if (var2.field2999 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field3019 * 1.953125E-5D * (double) var2.field2999) + 0.5D);
        }
        if (var2.field2990 != null) {
            int var7 = arg0.field3025;
            int var8 = var2.field2990[arg0.field3020 + 1];
            if (arg0.field3020 < var2.field2990.length - 2) {
                int var9 = (var2.field2990[arg0.field3020] & 0xFF) << 8;
                int var10 = (var2.field2990[arg0.field3020 + 2] & 0xFF) << 8;
                var8 += (var2.field2990[arg0.field3020 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field3021 > 0 && var2.field2997 != null) {
            int var11 = arg0.field3021;
            int var12 = var2.field2997[arg0.field3012 + 1];
            if (arg0.field3012 < var2.field2997.length - 2) {
                int var13 = (var2.field2997[arg0.field3012] & 0xFF) << 8;
                int var14 = (var2.field2997[arg0.field3012 + 2] & 0xFF) << 8;
                var12 += (var2.field2997[arg0.field3012 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("gk.ad(Lgw;I)I")
    public int method3418(class187 arg0) {
        int var2 = this.field2959[arg0.field3023];
        return var2 < 8192 ? arg0.field3014 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field3014) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("gk.s()Lby;")
    public synchronized class67 method1126() {
        return this.field2986;
    }

    @ObfuscatedName("gk.y()Lby;")
    public synchronized class67 method1096() {
        return null;
    }

    @ObfuscatedName("gk.t()I")
    public synchronized int method1091() {
        return 0;
    }

    @ObfuscatedName("gk.w([III)V")
    public synchronized void method1105(int[] arg0, int arg1, int arg2) {
        if (this.field2980.method3349()) {
            int var4 = this.field2961 * this.field2980.field2935 / Statics.field2641;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2984;
                if (this.field2985 - var5 >= 0L) {
                    this.field2984 = var5;
                    break;
                }
                int var7 = (int) ((this.field2985 - this.field2984 + (long) var4 - 1L) / (long) var4);
                this.field2984 += (long) var4 * (long) var7;
                this.field2986.method1105(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3403();
            } while (this.field2980.method3349());
        }
        this.field2986.method1105(arg0, arg1, arg2);
    }

    @ObfuscatedName("gk.d(I)V")
    public synchronized void method1098(int arg0) {
        if (this.field2980.method3349()) {
            int var2 = this.field2961 * this.field2980.field2935 / Statics.field2641;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2984;
                if (this.field2985 - var3 >= 0L) {
                    this.field2984 = var3;
                    break;
                }
                int var5 = (int) ((this.field2985 - this.field2984 + (long) var2 - 1L) / (long) var2);
                this.field2984 += (long) var2 * (long) var5;
                this.field2986.method1098(var5);
                arg0 -= var5;
                this.method3403();
            } while (this.field2980.method3349());
        }
        this.field2986.method1098(arg0);
    }

    @ObfuscatedName("gk.au(I)V")
    public void method3403() {
        int var1 = this.field2979;
        int var2 = this.field2972;
        long var3 = this.field2985;
        while (this.field2972 == var2) {
            while (this.field2980.field2938[var1] == var2) {
                this.field2980.method3356(var1);
                int var5 = this.field2980.method3342(var1);
                if (var5 == 1) {
                    this.field2980.method3313();
                    this.field2980.method3312(var1);
                    if (this.field2980.method3320()) {
                        if (!this.field2965 || var2 == 0) {
                            this.method3399();
                            this.field2980.method3329();
                            return;
                        }
                        this.field2980.method3321(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3397(var5);
                }
                this.field2980.method3314(var1);
                this.field2980.method3312(var1);
            }
            var1 = this.field2980.method3319();
            var2 = this.field2980.field2938[var1];
            var3 = this.field2980.method3318(var2);
        }
        this.field2979 = var1;
        this.field2972 = var2;
        this.field2985 = var3;
    }

    @ObfuscatedName("gk.aw(Lgw;S)Z")
    public boolean method3404(class187 arg0) {
        if (arg0.field3013 != null) {
            return false;
        }
        if (arg0.field3021 >= 0) {
            arg0.method3670();
            if (arg0.field3011 > 0 && this.field2977[arg0.field3023][arg0.field3011] == arg0) {
                this.field2977[arg0.field3023][arg0.field3011] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("gk.ag(Lgw;[IIIS)Z")
    public boolean method3423(class187 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field3026 = Statics.field2641 / 100;
        if (arg0.field3021 >= 0 && arg0.field3013 == null || arg0.field3013.method1303()) {
            arg0.method3495();
            arg0.method3670();
            if (arg0.field3011 > 0 && this.field2977[arg0.field3023][arg0.field3011] == arg0) {
                this.field2977[arg0.field3023][arg0.field3011] = null;
            }
            return true;
        }
        int var5 = arg0.field3017;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2970[arg0.field3023] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field3017 = var6;
        }
        arg0.field3013.method1245(this.method3384(arg0));
        class185 var7 = arg0.field3010;
        boolean var8 = false;
        arg0.field3028++;
        arg0.field3024 += var7.field2995;
        double var9 = (double) ((arg0.field3018 - 60 << 8) + (arg0.field3017 * arg0.field3016 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2999 > 0) {
            if (var7.field2993 > 0) {
                arg0.field3019 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2993 * var9) + 0.5D);
            } else {
                arg0.field3019 += 128;
            }
        }
        if (var7.field2990 != null) {
            if (var7.field2991 > 0) {
                arg0.field3025 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2991 * var9) + 0.5D);
            } else {
                arg0.field3025 += 128;
            }
            while (arg0.field3020 < var7.field2990.length - 2 && arg0.field3025 > (var7.field2990[arg0.field3020 + 2] & 0xFF) << 8) {
                arg0.field3020 += 2;
            }
            if (arg0.field3020 == var7.field2990.length - 2 && var7.field2990[arg0.field3020 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field3021 >= 0 && var7.field2997 != null && (this.field2978[arg0.field3023] & 0x1) == 0 && (arg0.field3011 < 0 || this.field2977[arg0.field3023][arg0.field3011] != arg0)) {
            if (var7.field2992 > 0) {
                arg0.field3021 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2992 * var9) + 0.5D);
            } else {
                arg0.field3021 += 128;
            }
            while (arg0.field3012 < var7.field2997.length - 2 && arg0.field3021 > (var7.field2997[arg0.field3012 + 2] & 0xFF) << 8) {
                arg0.field3012 += 2;
            }
            if (arg0.field3012 == var7.field2997.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field3013.method1369(arg0.field3026, this.method3400(arg0), this.method3418(arg0));
            return false;
        }
        arg0.field3013.method1253(arg0.field3026);
        if (arg1 == null) {
            arg0.field3013.method1098(arg3);
        } else {
            arg0.field3013.method1105(arg1, arg2, arg3);
        }
        if (arg0.field3013.method1257()) {
            this.field2986.field3001.method1090(arg0.field3013);
        }
        arg0.method3495();
        if (arg0.field3021 >= 0) {
            arg0.method3670();
            if (arg0.field3011 > 0 && this.field2977[arg0.field3023][arg0.field3011] == arg0) {
                this.field2977[arg0.field3023][arg0.field3011] = null;
            }
        }
        return true;
    }
}
