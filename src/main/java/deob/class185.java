package deob;

@ObfuscatedName("gh")
public class class185 extends class67 {

    @ObfuscatedName("gh.j")
    public class197 field2971 = new class197(128);

    @ObfuscatedName("gh.h")
    public int field2968 = 256;

    @ObfuscatedName("gh.m")
    public int field2969 = 1000000;

    @ObfuscatedName("gh.z")
    public int[] field2977 = new int[16];

    @ObfuscatedName("gh.x")
    public int[] field2996 = new int[16];

    @ObfuscatedName("gh.e")
    public int[] field2972 = new int[16];

    @ObfuscatedName("gh.i")
    public int[] field2973 = new int[16];

    @ObfuscatedName("gh.c")
    public int[] field2975 = new int[16];

    @ObfuscatedName("gh.n")
    public int[] field2981 = new int[16];

    @ObfuscatedName("gh.l")
    public int[] field2976 = new int[16];

    @ObfuscatedName("gh.u")
    public int[] field2991 = new int[16];

    @ObfuscatedName("gh.r")
    public int[] field2993 = new int[16];

    @ObfuscatedName("gh.w")
    public int[] field2982 = new int[16];

    @ObfuscatedName("gh.g")
    public int[] field2983 = new int[16];

    @ObfuscatedName("gh.s")
    public int[] field2984 = new int[16];

    @ObfuscatedName("gh.k")
    public int[] field2985 = new int[16];

    @ObfuscatedName("gh.o")
    public int[] field2986 = new int[16];

    @ObfuscatedName("gh.v")
    public int[] field2987 = new int[16];

    @ObfuscatedName("gh.f")
    public class188[][] field2988 = new class188[16][128];

    @ObfuscatedName("gh.au")
    public class188[][] field2989 = new class188[16][128];

    @ObfuscatedName("gh.aq")
    public class183 field2990 = new class183();

    @ObfuscatedName("gh.ab")
    public boolean field2978;

    @ObfuscatedName("gh.am")
    public int field2992;

    @ObfuscatedName("gh.an")
    public int field2967;

    @ObfuscatedName("gh.aj")
    public long field2994;

    @ObfuscatedName("gh.ay")
    public long field2995;

    @ObfuscatedName("gh.ao")
    public class187 field2974 = new class187(this);

    public class185() {
        this.method3433();
    }

    @ObfuscatedName("gh.j(II)V")
    public synchronized void method3345(int arg0) {
        this.field2968 = arg0;
    }

    @ObfuscatedName("gh.h(I)I")
    public int method3346() {
        return this.field2968;
    }

    @ObfuscatedName("gh.m(Lfl;Lfy;Lbm;II)Z")
    public synchronized boolean method3405(class181 arg0, class168 arg1, class60 arg2, int arg3) {
        arg0.method3262();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class198 var7 = (class198) arg0.field2931.method3501(); var7 != null; var7 = (class198) arg0.field2931.method3502()) {
            int var8 = (int) var7.field3123;
            class182 var9 = (class182) this.field2971.method3498((long) var8);
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
                this.field2971.method3499(var11, (long) var8);
            }
            if (!var9.method3268(arg2, var7.field3103, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3261();
        }
        return var5;
    }

    @ObfuscatedName("gh.z(I)V")
    public synchronized void method3348() {
        for (class182 var1 = (class182) this.field2971.method3501(); var1 != null; var1 = (class182) this.field2971.method3502()) {
            var1.method3267();
        }
    }

    @ObfuscatedName("gh.x(I)V")
    public synchronized void method3349() {
        for (class182 var1 = (class182) this.field2971.method3501(); var1 != null; var1 = (class182) this.field2971.method3502()) {
            var1.method3639();
        }
    }

    @ObfuscatedName("gh.l(Lfl;ZB)V")
    public synchronized void method3350(class181 arg0, boolean arg1) {
        this.method3351();
        this.field2990.method3273(arg0.field2930);
        this.field2978 = arg1;
        this.field2994 = 0L;
        int var3 = this.field2990.method3276();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2990.method3275(var4);
            this.field2990.method3280(var4);
            this.field2990.method3278(var4);
        }
        this.field2992 = this.field2990.method3296();
        this.field2967 = this.field2990.field2946[this.field2992];
        this.field2995 = this.field2990.method3279(this.field2967);
    }

    @ObfuscatedName("gh.r(I)V")
    public synchronized void method3351() {
        this.field2990.method3313();
        this.method3433();
    }

    @ObfuscatedName("gh.a(I)Z")
    public synchronized boolean method3381() {
        return this.field2990.method3282();
    }

    @ObfuscatedName("gh.d(III)V")
    public synchronized void method3380(int arg0, int arg1) {
        this.method3424(arg0, arg1);
    }

    @ObfuscatedName("gh.p(III)V")
    public void method3424(int arg0, int arg1) {
        this.field2973[arg0] = arg1;
        this.field2981[arg0] = arg1 & 0xFFFFFF80;
        this.method3355(arg0, arg1);
    }

    @ObfuscatedName("gh.q(IIB)V")
    public void method3355(int arg0, int arg1) {
        if (this.field2975[arg0] != arg1) {
            this.field2975[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2989[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("gh.b(IIIS)V")
    public void method3412(int arg0, int arg1, int arg2) {
        this.method3358(arg0, arg1, 64);
        if ((this.field2982[arg0] & 0x2) != 0) {
            for (class188 var4 = (class188) this.field2974.field3007.method3541(); var4 != null; var4 = (class188) this.field2974.field3007.method3543()) {
                if (var4.field3031 == arg0 && var4.field3027 < 0) {
                    this.field2988[arg0][var4.field3018] = null;
                    this.field2988[arg0][arg1] = var4;
                    int var5 = (var4.field3023 * var4.field3022 >> 12) + var4.field3021;
                    var4.field3021 += arg1 - var4.field3018 << 8;
                    var4.field3022 = var5 - var4.field3021;
                    var4.field3023 = 4096;
                    var4.field3018 = arg1;
                    return;
                }
            }
        }
        class182 var6 = (class182) this.field2971.method3498((long) this.field2975[arg0]);
        if (var6 == null) {
            return;
        }
        class63 var7 = var6.field2934[arg1];
        if (var7 == null) {
            return;
        }
        class188 var8 = new class188();
        var8.field3031 = arg0;
        var8.field3037 = var6;
        var8.field3014 = var7;
        var8.field3016 = var6.field2941[arg1];
        var8.field3017 = var6.field2938[arg1];
        var8.field3018 = arg1;
        var8.field3019 = var6.field2933 * arg2 * arg2 * var6.field2935[arg1] + 1024 >> 11;
        var8.field3024 = var6.field2936[arg1] & 0xFF;
        var8.field3021 = (arg1 << 8) - (var6.field2932[arg1] & 0x7FFF);
        var8.field3030 = 0;
        var8.field3025 = 0;
        var8.field3026 = 0;
        var8.field3027 = -1;
        var8.field3028 = 0;
        if (this.field2985[arg0] == 0) {
            var8.field3036 = class65.method1396(var7, this.method3359(var8), this.method3371(var8), this.method3372(var8));
        } else {
            var8.field3036 = class65.method1396(var7, this.method3359(var8), 0, this.method3372(var8));
            this.method3383(var8, var6.field2932[arg1] < 0);
        }
        if (var6.field2932[arg1] < 0) {
            var8.field3036.method1267(-1);
        }
        if (var8.field3017 >= 0) {
            class188 var9 = this.field2989[arg0][var8.field3017];
            if (var9 != null && var9.field3027 < 0) {
                this.field2988[arg0][var9.field3018] = null;
                var9.field3027 = 0;
            }
            this.field2989[arg0][var8.field3017] = var8;
        }
        this.field2974.field3007.method3535(var8);
        this.field2988[arg0][arg1] = var8;
    }

    @ObfuscatedName("gh.t(Lgo;ZI)V")
    public void method3383(class188 arg0, boolean arg1) {
        int var3 = arg0.field3014.field1214.length;
        int var5;
        if (arg1 && arg0.field3014.field1218) {
            int var4 = var3 + var3 - arg0.field3014.field1216;
            var5 = (int) ((long) this.field2985[arg0.field3031] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field3036.method1274(true);
            }
        } else {
            var5 = (int) ((long) this.field2985[arg0.field3031] * (long) var3 >> 6);
        }
        arg0.field3036.method1273(var5);
    }

    @ObfuscatedName("gh.y(IIIB)V")
    public void method3358(int arg0, int arg1, int arg2) {
        class188 var4 = this.field2988[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2988[arg0][arg1] = null;
        if ((this.field2982[arg0] & 0x2) == 0) {
            var4.field3027 = 0;
            return;
        }
        for (class188 var5 = (class188) this.field2974.field3007.method3540(); var5 != null; var5 = (class188) this.field2974.field3007.method3533()) {
            if (var4.field3031 == var5.field3031 && var5.field3027 < 0 && var4 != var5) {
                var4.field3027 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("gh.w(IIII)V")
    public void method3357(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("gh.g(III)V")
    public void method3360(int arg0, int arg1) {
    }

    @ObfuscatedName("gh.s(III)V")
    public void method3399(int arg0, int arg1) {
        this.field2976[arg0] = arg1;
    }

    @ObfuscatedName("gh.k(IB)V")
    public void method3362(int arg0) {
        for (class188 var2 = (class188) this.field2974.field3007.method3540(); var2 != null; var2 = (class188) this.field2974.field3007.method3533()) {
            if (arg0 < 0 || var2.field3031 == arg0) {
                if (var2.field3036 != null) {
                    var2.field3036.method1293(Statics.field1182 / 100);
                    if (var2.field3036.method1282()) {
                        this.field2974.field3009.method1133(var2.field3036);
                    }
                    var2.method3452();
                }
                if (var2.field3027 < 0) {
                    this.field2988[var2.field3031][var2.field3018] = null;
                }
                var2.method3639();
            }
        }
    }

    @ObfuscatedName("gh.o(II)V")
    public void method3363(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3363(var2);
            }
            return;
        }
        this.field2977[arg0] = 12800;
        this.field2996[arg0] = 8192;
        this.field2972[arg0] = 16383;
        this.field2976[arg0] = 8192;
        this.field2991[arg0] = 0;
        this.field2993[arg0] = 8192;
        this.method3366(arg0);
        this.method3367(arg0);
        this.field2982[arg0] = 0;
        this.field2983[arg0] = 32767;
        this.field2984[arg0] = 256;
        this.field2985[arg0] = 0;
        this.method3369(arg0, 8192);
    }

    @ObfuscatedName("gh.an(II)V")
    public void method3364(int arg0) {
        for (class188 var2 = (class188) this.field2974.field3007.method3540(); var2 != null; var2 = (class188) this.field2974.field3007.method3533()) {
            if ((arg0 < 0 || var2.field3031 == arg0) && var2.field3027 < 0) {
                this.field2988[var2.field3031][var2.field3018] = null;
                var2.field3027 = 0;
            }
        }
    }

    @ObfuscatedName("gh.aj(I)V")
    public void method3433() {
        this.method3362(-1);
        this.method3363(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2975[var1] = this.field2973[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2981[var2] = this.field2973[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("gh.ay(II)V")
    public void method3366(int arg0) {
        if ((this.field2982[arg0] & 0x2) == 0) {
            return;
        }
        for (class188 var2 = (class188) this.field2974.field3007.method3540(); var2 != null; var2 = (class188) this.field2974.field3007.method3533()) {
            if (var2.field3031 == arg0 && this.field2988[arg0][var2.field3018] == null && var2.field3027 < 0) {
                var2.field3027 = 0;
            }
        }
    }

    @ObfuscatedName("gh.ao(II)V")
    public void method3367(int arg0) {
        if ((this.field2982[arg0] & 0x4) == 0) {
            return;
        }
        for (class188 var2 = (class188) this.field2974.field3007.method3540(); var2 != null; var2 = (class188) this.field2974.field3007.method3533()) {
            if (var2.field3031 == arg0) {
                var2.field3033 = 0;
            }
        }
    }

    @ObfuscatedName("gh.ag(II)V")
    public void method3368(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3358(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3412(var6, var7, var8);
            } else {
                this.method3358(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3357(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2981[var12] = (var14 << 14) + (this.field2981[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2981[var12] = (var14 << 7) + (this.field2981[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2991[var12] = (var14 << 7) + (this.field2991[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2991[var12] = (this.field2991[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2993[var12] = (var14 << 7) + (this.field2993[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2993[var12] = (this.field2993[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2977[var12] = (var14 << 7) + (this.field2977[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2977[var12] = (this.field2977[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2996[var12] = (var14 << 7) + (this.field2996[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2996[var12] = (this.field2996[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2972[var12] = (var14 << 7) + (this.field2972[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2972[var12] = (this.field2972[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2982[var12] |= 0x1;
                } else {
                    this.field2982[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2982[var12] |= 0x2;
                } else {
                    this.method3366(var12);
                    this.field2982[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2983[var12] = (var14 << 7) + (this.field2983[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2983[var12] = (this.field2983[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2983[var12] = (var14 << 7) + (this.field2983[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2983[var12] = (this.field2983[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3362(var12);
            }
            if (var13 == 121) {
                this.method3363(var12);
            }
            if (var13 == 123) {
                this.method3364(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2983[var12];
                if (var15 == 16384) {
                    this.field2984[var12] = (var14 << 7) + (this.field2984[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2983[var12];
                if (var16 == 16384) {
                    this.field2984[var12] = (this.field2984[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2985[var12] = (var14 << 7) + (this.field2985[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2985[var12] = (this.field2985[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2982[var12] |= 0x4;
                } else {
                    this.method3367(var12);
                    this.field2982[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3369(var12, (var14 << 7) + (this.field2986[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3369(var12, (this.field2986[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3355(var17, this.field2981[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3360(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method3399(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3433();
            }
        }
    }

    @ObfuscatedName("gh.as(III)V")
    public void method3369(int arg0, int arg1) {
        this.field2986[arg0] = arg1;
        this.field2987[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("gh.az(Lgo;B)I")
    public int method3359(class188 arg0) {
        int var2 = (arg0.field3023 * arg0.field3022 >> 12) + arg0.field3021;
        int var3 = ((this.field2976[arg0.field3031] - 8192) * this.field2984[arg0.field3031] >> 12) + var2;
        class186 var4 = arg0.field3016;
        if (var4.field2997 > 0 && (var4.field3004 > 0 || this.field2991[arg0.field3031] > 0)) {
            int var5 = var4.field3004 << 2;
            int var6 = var4.field3005 << 1;
            if (arg0.field3013 < var6) {
                var5 = arg0.field3013 * var5 / var6;
            }
            int var7 = (this.field2991[arg0.field3031] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field3032 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field3014.field1215 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1182 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("gh.av(Lgo;I)I")
    public int method3371(class188 arg0) {
        class186 var2 = arg0.field3016;
        int var3 = this.field2972[arg0.field3031] * this.field2977[arg0.field3031] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field3019 * var4 + 16384 >> 15;
        int var6 = this.field2968 * var5 + 128 >> 8;
        if (var2.field3003 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field3030 * 1.953125E-5D * (double) var2.field3003) + 0.5D);
        }
        if (var2.field2998 != null) {
            int var7 = arg0.field3025;
            int var8 = var2.field2998[arg0.field3026 + 1];
            if (arg0.field3026 < var2.field2998.length - 2) {
                int var9 = (var2.field2998[arg0.field3026] & 0xFF) << 8;
                int var10 = (var2.field2998[arg0.field3026 + 2] & 0xFF) << 8;
                var8 += (var2.field2998[arg0.field3026 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field3027 > 0 && var2.field2999 != null) {
            int var11 = arg0.field3027;
            int var12 = var2.field2999[arg0.field3028 + 1];
            if (arg0.field3028 < var2.field2999.length - 2) {
                int var13 = (var2.field2999[arg0.field3028] & 0xFF) << 8;
                int var14 = (var2.field2999[arg0.field3028 + 2] & 0xFF) << 8;
                var12 += (var2.field2999[arg0.field3028 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("gh.at(Lgo;I)I")
    public int method3372(class188 arg0) {
        int var2 = this.field2996[arg0.field3031];
        return var2 < 8192 ? arg0.field3024 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field3024) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("gh.e()Lbi;")
    public synchronized class67 method1124() {
        return this.field2974;
    }

    @ObfuscatedName("gh.i()Lbi;")
    public synchronized class67 method1125() {
        return null;
    }

    @ObfuscatedName("gh.c()I")
    public synchronized int method1122() {
        return 0;
    }

    @ObfuscatedName("gh.n([III)V")
    public synchronized void method1148(int[] arg0, int arg1, int arg2) {
        if (this.field2990.method3282()) {
            int var4 = this.field2969 * this.field2990.field2955 / Statics.field1182;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2994;
                if (this.field2995 - var5 >= 0L) {
                    this.field2994 = var5;
                    break;
                }
                int var7 = (int) ((this.field2995 - this.field2994 + (long) var4 - 1L) / (long) var4);
                this.field2994 += (long) var4 * (long) var7;
                this.field2974.method1148(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3377();
            } while (this.field2990.method3282());
        }
        this.field2974.method1148(arg0, arg1, arg2);
    }

    @ObfuscatedName("gh.u(I)V")
    public synchronized void method1145(int arg0) {
        if (this.field2990.method3282()) {
            int var2 = this.field2969 * this.field2990.field2955 / Statics.field1182;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2994;
                if (this.field2995 - var3 >= 0L) {
                    this.field2994 = var3;
                    break;
                }
                int var5 = (int) ((this.field2995 - this.field2994 + (long) var2 - 1L) / (long) var2);
                this.field2994 += (long) var2 * (long) var5;
                this.field2974.method1145(var5);
                arg0 -= var5;
                this.method3377();
            } while (this.field2990.method3282());
        }
        this.field2974.method1145(arg0);
    }

    @ObfuscatedName("gh.ar(I)V")
    public void method3377() {
        int var1 = this.field2992;
        int var2 = this.field2967;
        long var3 = this.field2995;
        while (this.field2967 == var2) {
            while (this.field2990.field2946[var1] == var2) {
                this.field2990.method3275(var1);
                int var5 = this.field2990.method3320(var1);
                if (var5 == 1) {
                    this.field2990.method3272();
                    this.field2990.method3278(var1);
                    if (this.field2990.method3285()) {
                        if (!this.field2978 || var2 == 0) {
                            this.method3433();
                            this.field2990.method3313();
                            return;
                        }
                        this.field2990.method3300(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3368(var5);
                }
                this.field2990.method3280(var1);
                this.field2990.method3278(var1);
            }
            var1 = this.field2990.method3296();
            var2 = this.field2990.field2946[var1];
            var3 = this.field2990.method3279(var2);
        }
        this.field2992 = var1;
        this.field2967 = var2;
        this.field2995 = var3;
    }

    @ObfuscatedName("gh.aw(Lgo;I)Z")
    public boolean method3375(class188 arg0) {
        if (arg0.field3036 != null) {
            return false;
        }
        if (arg0.field3027 >= 0) {
            arg0.method3639();
            if (arg0.field3017 > 0 && this.field2989[arg0.field3031][arg0.field3017] == arg0) {
                this.field2989[arg0.field3031][arg0.field3017] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("gh.ac(Lgo;[IIII)Z")
    public boolean method3379(class188 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field3035 = Statics.field1182 / 100;
        if (arg0.field3027 >= 0 && arg0.field3036 == null || arg0.field3036.method1358()) {
            arg0.method3452();
            arg0.method3639();
            if (arg0.field3017 > 0 && this.field2989[arg0.field3031][arg0.field3017] == arg0) {
                this.field2989[arg0.field3031][arg0.field3017] = null;
            }
            return true;
        }
        int var5 = arg0.field3023;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2993[arg0.field3031] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field3023 = var6;
        }
        arg0.field3036.method1279(this.method3359(arg0));
        class186 var7 = arg0.field3016;
        boolean var8 = false;
        arg0.field3013++;
        arg0.field3032 += var7.field2997;
        double var9 = (double) ((arg0.field3018 - 60 << 8) + (arg0.field3023 * arg0.field3022 >> 12)) * 5.086263020833333E-6D;
        if (var7.field3003 > 0) {
            if (var7.field3002 > 0) {
                arg0.field3030 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3002 * var9) + 0.5D);
            } else {
                arg0.field3030 += 128;
            }
        }
        if (var7.field2998 != null) {
            if (var7.field3000 > 0) {
                arg0.field3025 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3000 * var9) + 0.5D);
            } else {
                arg0.field3025 += 128;
            }
            while (arg0.field3026 < var7.field2998.length - 2 && arg0.field3025 > (var7.field2998[arg0.field3026 + 2] & 0xFF) << 8) {
                arg0.field3026 += 2;
            }
            if (arg0.field3026 == var7.field2998.length - 2 && var7.field2998[arg0.field3026 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field3027 >= 0 && var7.field2999 != null && (this.field2982[arg0.field3031] & 0x1) == 0 && (arg0.field3017 < 0 || this.field2989[arg0.field3031][arg0.field3017] != arg0)) {
            if (var7.field3001 > 0) {
                arg0.field3027 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3001 * var9) + 0.5D);
            } else {
                arg0.field3027 += 128;
            }
            while (arg0.field3028 < var7.field2999.length - 2 && arg0.field3027 > (var7.field2999[arg0.field3028 + 2] & 0xFF) << 8) {
                arg0.field3028 += 2;
            }
            if (arg0.field3028 == var7.field2999.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field3036.method1357(arg0.field3035, this.method3371(arg0), this.method3372(arg0));
            return false;
        }
        arg0.field3036.method1293(arg0.field3035);
        if (arg1 == null) {
            arg0.field3036.method1145(arg3);
        } else {
            arg0.field3036.method1148(arg1, arg2, arg3);
        }
        if (arg0.field3036.method1282()) {
            this.field2974.field3009.method1133(arg0.field3036);
        }
        arg0.method3452();
        if (arg0.field3027 >= 0) {
            arg0.method3639();
            if (arg0.field3017 > 0 && this.field2989[arg0.field3031][arg0.field3017] == arg0) {
                this.field2989[arg0.field3031][arg0.field3017] = null;
            }
        }
        return true;
    }
}
