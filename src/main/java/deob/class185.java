package deob;

@ObfuscatedName("gr")
public class class185 extends class67 {

    @ObfuscatedName("gr.a")
    public class197 field2993 = new class197(128);

    @ObfuscatedName("gr.d")
    public int field2978 = 256;

    @ObfuscatedName("gr.c")
    public int field2979 = 1000000;

    @ObfuscatedName("gr.y")
    public int[] field2985 = new int[16];

    @ObfuscatedName("gr.k")
    public int[] field2981 = new int[16];

    @ObfuscatedName("gr.r")
    public int[] field2982 = new int[16];

    @ObfuscatedName("gr.p")
    public int[] field2983 = new int[16];

    @ObfuscatedName("gr.q")
    public int[] field2991 = new int[16];

    @ObfuscatedName("gr.m")
    public int[] field2987 = new int[16];

    @ObfuscatedName("gr.e")
    public int[] field2992 = new int[16];

    @ObfuscatedName("gr.x")
    public int[] field2998 = new int[16];

    @ObfuscatedName("gr.z")
    public int[] field2989 = new int[16];

    @ObfuscatedName("gr.h")
    public int[] field2986 = new int[16];

    @ObfuscatedName("gr.s")
    public int[] field2990 = new int[16];

    @ObfuscatedName("gr.f")
    public int[] field2999 = new int[16];

    @ObfuscatedName("gr.b")
    public int[] field2977 = new int[16];

    @ObfuscatedName("gr.l")
    public int[] field2984 = new int[16];

    @ObfuscatedName("gr.o")
    public int[] field2994 = new int[16];

    @ObfuscatedName("gr.v")
    public class188[][] field2995 = new class188[16][128];

    @ObfuscatedName("gr.ad")
    public class188[][] field2980 = new class188[16][128];

    @ObfuscatedName("gr.ar")
    public class183 field2997 = new class183();

    @ObfuscatedName("gr.ah")
    public boolean field2988;

    @ObfuscatedName("gr.ay")
    public int field2996;

    @ObfuscatedName("gr.af")
    public int field3000;

    @ObfuscatedName("gr.al")
    public long field3001;

    @ObfuscatedName("gr.ai")
    public long field3002;

    @ObfuscatedName("gr.an")
    public class187 field3003 = new class187(this);

    public class185() {
        this.method3475();
    }

    @ObfuscatedName("gr.a(II)V")
    public synchronized void method3456(int arg0) {
        this.field2978 = arg0;
    }

    @ObfuscatedName("gr.w(B)I")
    public int method3507() {
        return this.field2978;
    }

    @ObfuscatedName("gr.d(Lfu;Lft;Lby;II)Z")
    public synchronized boolean method3486(class181 arg0, class168 arg1, class60 arg2, int arg3) {
        arg0.method3371();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class198 var7 = (class198) arg0.field2934.method3610(); var7 != null; var7 = (class198) arg0.field2934.method3606()) {
            int var8 = (int) var7.field3126;
            class182 var9 = (class182) this.field2993.method3607((long) var8);
            if (var9 == null) {
                var9 = class182.method2854(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field2993.method3614(var9, (long) var8);
            }
            if (!var9.method3377(arg2, var7.field3104, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3367();
        }
        return var5;
    }

    @ObfuscatedName("gr.c(B)V")
    public synchronized void method3487() {
        for (class182 var1 = (class182) this.field2993.method3610(); var1 != null; var1 = (class182) this.field2993.method3606()) {
            var1.method3379();
        }
    }

    @ObfuscatedName("gr.y(I)V")
    public synchronized void method3510() {
        for (class182 var1 = (class182) this.field2993.method3610(); var1 != null; var1 = (class182) this.field2993.method3606()) {
            var1.method3737();
        }
    }

    @ObfuscatedName("gr.m(Lfu;ZS)V")
    public synchronized void method3460(class181 arg0, boolean arg1) {
        this.method3461();
        this.field2997.method3386(arg0.field2935);
        this.field2988 = arg1;
        this.field3001 = 0L;
        int var3 = this.field2997.method3389();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2997.method3426(var4);
            this.field2997.method3393(var4);
            this.field2997.method3391(var4);
        }
        this.field2996 = this.field2997.method3398();
        this.field3000 = this.field2997.field2956[this.field2996];
        this.field3002 = this.field2997.method3390(this.field3000);
    }

    @ObfuscatedName("gr.x(I)V")
    public synchronized void method3461() {
        this.field2997.method3392();
        this.method3475();
    }

    @ObfuscatedName("gr.z(B)Z")
    public synchronized boolean method3499() {
        return this.field2997.method3388();
    }

    @ObfuscatedName("gr.i(III)V")
    public synchronized void method3463(int arg0, int arg1) {
        this.method3464(arg0, arg1);
    }

    @ObfuscatedName("gr.t(III)V")
    public void method3464(int arg0, int arg1) {
        this.field2983[arg0] = arg1;
        this.field2987[arg0] = arg1 & 0xFFFFFF80;
        this.method3465(arg0, arg1);
    }

    @ObfuscatedName("gr.n(III)V")
    public void method3465(int arg0, int arg1) {
        if (this.field2991[arg0] != arg1) {
            this.field2991[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2980[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("gr.u(IIII)V")
    public void method3466(int arg0, int arg1, int arg2) {
        this.method3548(arg0, arg1, 64);
        if ((this.field2986[arg0] & 0x2) != 0) {
            for (class188 var4 = (class188) this.field3003.field3020.method3645(); var4 != null; var4 = (class188) this.field3003.field3020.method3658()) {
                if (var4.field3032 == arg0 && var4.field3037 < 0) {
                    this.field2995[arg0][var4.field3040] = null;
                    this.field2995[arg0][arg1] = var4;
                    int var5 = (var4.field3029 * var4.field3023 >> 12) + var4.field3031;
                    var4.field3031 += arg1 - var4.field3040 << 8;
                    var4.field3029 = var5 - var4.field3031;
                    var4.field3023 = 4096;
                    var4.field3040 = arg1;
                    return;
                }
            }
        }
        class182 var6 = (class182) this.field2993.method3607((long) this.field2991[arg0]);
        if (var6 == null) {
            return;
        }
        class63 var7 = var6.field2937[arg1];
        if (var7 == null) {
            return;
        }
        class188 var8 = new class188();
        var8.field3032 = arg0;
        var8.field3024 = var6;
        var8.field3033 = var7;
        var8.field3035 = var6.field2938[arg1];
        var8.field3027 = var6.field2942[arg1];
        var8.field3040 = arg1;
        var8.field3025 = var6.field2941 * arg2 * arg2 * var6.field2939[arg1] + 1024 >> 11;
        var8.field3028 = var6.field2940[arg1] & 0xFF;
        var8.field3031 = (arg1 << 8) - (var6.field2945[arg1] & 0x7FFF);
        var8.field3034 = 0;
        var8.field3030 = 0;
        var8.field3036 = 0;
        var8.field3037 = -1;
        var8.field3038 = 0;
        if (this.field2977[arg0] == 0) {
            var8.field3041 = class65.method1357(var7, this.method3476(var8), this.method3538(var8), this.method3480(var8));
        } else {
            var8.field3041 = class65.method1357(var7, this.method3476(var8), 0, this.method3480(var8));
            this.method3467(var8, var6.field2945[arg1] < 0);
        }
        if (var6.field2945[arg1] < 0) {
            var8.field3041.method1359(-1);
        }
        if (var8.field3027 >= 0) {
            class188 var9 = this.field2980[arg0][var8.field3027];
            if (var9 != null && var9.field3037 < 0) {
                this.field2995[arg0][var9.field3040] = null;
                var9.field3037 = 0;
            }
            this.field2980[arg0][var8.field3027] = var8;
        }
        this.field3003.field3020.method3639(var8);
        this.field2995[arg0][arg1] = var8;
    }

    @ObfuscatedName("gr.g(Lgc;ZI)V")
    public void method3467(class188 arg0, boolean arg1) {
        int var3 = arg0.field3033.field1240.length;
        int var5;
        if (arg1 && arg0.field3033.field1239) {
            int var4 = var3 + var3 - arg0.field3033.field1241;
            var5 = (int) ((long) this.field2977[arg0.field3032] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field3041.method1422(true);
            }
        } else {
            var5 = (int) ((long) this.field2977[arg0.field3032] * (long) var3 >> 6);
        }
        arg0.field3041.method1365(var5);
    }

    @ObfuscatedName("gr.j(IIIB)V")
    public void method3548(int arg0, int arg1, int arg2) {
        class188 var4 = this.field2995[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2995[arg0][arg1] = null;
        if ((this.field2986[arg0] & 0x2) == 0) {
            var4.field3037 = 0;
            return;
        }
        for (class188 var5 = (class188) this.field3003.field3020.method3665(); var5 != null; var5 = (class188) this.field3003.field3020.method3641()) {
            if (var4.field3032 == var5.field3032 && var5.field3037 < 0 && var4 != var5) {
                var4.field3037 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("gr.h(IIII)V")
    public void method3455(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("gr.s(IIB)V")
    public void method3459(int arg0, int arg1) {
    }

    @ObfuscatedName("gr.az(III)V")
    public void method3471(int arg0, int arg1) {
        this.field2992[arg0] = arg1;
    }

    @ObfuscatedName("gr.ac(II)V")
    public void method3472(int arg0) {
        for (class188 var2 = (class188) this.field3003.field3020.method3665(); var2 != null; var2 = (class188) this.field3003.field3020.method3641()) {
            if (arg0 < 0 || var2.field3032 == arg0) {
                if (var2.field3041 != null) {
                    var2.field3041.method1369(Statics.field974 / 100);
                    if (var2.field3041.method1397()) {
                        this.field3003.field3022.method1231(var2.field3041);
                    }
                    var2.method3565();
                }
                if (var2.field3037 < 0) {
                    this.field2995[var2.field3032][var2.field3040] = null;
                }
                var2.method3737();
            }
        }
    }

    @ObfuscatedName("gr.at(IB)V")
    public void method3504(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3504(var2);
            }
            return;
        }
        this.field2985[arg0] = 12800;
        this.field2981[arg0] = 8192;
        this.field2982[arg0] = 16383;
        this.field2992[arg0] = 8192;
        this.field2998[arg0] = 0;
        this.field2989[arg0] = 8192;
        this.method3528(arg0);
        this.method3477(arg0);
        this.field2986[arg0] = 0;
        this.field2990[arg0] = 32767;
        this.field2999[arg0] = 256;
        this.field2977[arg0] = 0;
        this.method3479(arg0, 8192);
    }

    @ObfuscatedName("gr.ab(II)V")
    public void method3474(int arg0) {
        for (class188 var2 = (class188) this.field3003.field3020.method3665(); var2 != null; var2 = (class188) this.field3003.field3020.method3641()) {
            if ((arg0 < 0 || var2.field3032 == arg0) && var2.field3037 < 0) {
                this.field2995[var2.field3032][var2.field3040] = null;
                var2.field3037 = 0;
            }
        }
    }

    @ObfuscatedName("gr.ae(I)V")
    public void method3475() {
        this.method3472(-1);
        this.method3504(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2991[var1] = this.field2983[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2987[var2] = this.field2983[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("gr.au(II)V")
    public void method3528(int arg0) {
        if ((this.field2986[arg0] & 0x2) == 0) {
            return;
        }
        for (class188 var2 = (class188) this.field3003.field3020.method3665(); var2 != null; var2 = (class188) this.field3003.field3020.method3641()) {
            if (var2.field3032 == arg0 && this.field2995[arg0][var2.field3040] == null && var2.field3037 < 0) {
                var2.field3037 = 0;
            }
        }
    }

    @ObfuscatedName("gr.aj(IB)V")
    public void method3477(int arg0) {
        if ((this.field2986[arg0] & 0x4) == 0) {
            return;
        }
        for (class188 var2 = (class188) this.field3003.field3020.method3665(); var2 != null; var2 = (class188) this.field3003.field3020.method3641()) {
            if (var2.field3032 == arg0) {
                var2.field3043 = 0;
            }
        }
    }

    @ObfuscatedName("gr.aq(II)V")
    public void method3478(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3548(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3466(var6, var7, var8);
            } else {
                this.method3548(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3455(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2987[var12] = (var14 << 14) + (this.field2987[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2987[var12] = (var14 << 7) + (this.field2987[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2998[var12] = (var14 << 7) + (this.field2998[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2998[var12] = (this.field2998[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2989[var12] = (var14 << 7) + (this.field2989[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2989[var12] = (this.field2989[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2985[var12] = (var14 << 7) + (this.field2985[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2985[var12] = (this.field2985[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2981[var12] = (var14 << 7) + (this.field2981[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2981[var12] = (this.field2981[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2982[var12] = (var14 << 7) + (this.field2982[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2982[var12] = (this.field2982[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2986[var12] |= 0x1;
                } else {
                    this.field2986[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2986[var12] |= 0x2;
                } else {
                    this.method3528(var12);
                    this.field2986[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2990[var12] = (var14 << 7) + (this.field2990[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2990[var12] = (this.field2990[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2990[var12] = (var14 << 7) + (this.field2990[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2990[var12] = (this.field2990[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3472(var12);
            }
            if (var13 == 121) {
                this.method3504(var12);
            }
            if (var13 == 123) {
                this.method3474(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2990[var12];
                if (var15 == 16384) {
                    this.field2999[var12] = (var14 << 7) + (this.field2999[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2990[var12];
                if (var16 == 16384) {
                    this.field2999[var12] = (this.field2999[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2977[var12] = (var14 << 7) + (this.field2977[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2977[var12] = (this.field2977[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2986[var12] |= 0x4;
                } else {
                    this.method3477(var12);
                    this.field2986[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3479(var12, (var14 << 7) + (this.field2984[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3479(var12, (this.field2984[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3465(var17, this.field2987[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3459(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method3471(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3475();
            }
        }
    }

    @ObfuscatedName("gr.ag(III)V")
    public void method3479(int arg0, int arg1) {
        this.field2984[arg0] = arg1;
        this.field2994[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("gr.ap(Lgc;I)I")
    public int method3476(class188 arg0) {
        int var2 = (arg0.field3029 * arg0.field3023 >> 12) + arg0.field3031;
        int var3 = ((this.field2992[arg0.field3032] - 8192) * this.field2999[arg0.field3032] >> 12) + var2;
        class186 var4 = arg0.field3035;
        if (var4.field3015 > 0 && (var4.field3012 > 0 || this.field2998[arg0.field3032] > 0)) {
            int var5 = var4.field3012 << 2;
            int var6 = var4.field3016 << 1;
            if (arg0.field3039 < var6) {
                var5 = arg0.field3039 * var5 / var6;
            }
            int var7 = (this.field2998[arg0.field3032] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field3026 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field3033.field1242 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field974 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("gr.ak(Lgc;B)I")
    public int method3538(class188 arg0) {
        class186 var2 = arg0.field3035;
        int var3 = this.field2985[arg0.field3032] * this.field2982[arg0.field3032] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field3025 * var4 + 16384 >> 15;
        int var6 = this.field2978 * var5 + 128 >> 8;
        if (var2.field3010 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field3034 * 1.953125E-5D * (double) var2.field3010) + 0.5D);
        }
        if (var2.field3008 != null) {
            int var7 = arg0.field3030;
            int var8 = var2.field3008[arg0.field3036 + 1];
            if (arg0.field3036 < var2.field3008.length - 2) {
                int var9 = (var2.field3008[arg0.field3036] & 0xFF) << 8;
                int var10 = (var2.field3008[arg0.field3036 + 2] & 0xFF) << 8;
                var8 += (var2.field3008[arg0.field3036 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field3037 > 0 && var2.field3017 != null) {
            int var11 = arg0.field3037;
            int var12 = var2.field3017[arg0.field3038 + 1];
            if (arg0.field3038 < var2.field3017.length - 2) {
                int var13 = (var2.field3017[arg0.field3038] & 0xFF) << 8;
                int var14 = (var2.field3017[arg0.field3038 + 2] & 0xFF) << 8;
                var12 += (var2.field3017[arg0.field3038 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("gr.as(Lgc;B)I")
    public int method3480(class188 arg0) {
        int var2 = this.field2981[arg0.field3032];
        return var2 < 8192 ? arg0.field3028 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field3028) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("gr.k()Lbn;")
    public synchronized class67 method1216() {
        return this.field3003;
    }

    @ObfuscatedName("gr.r()Lbn;")
    public synchronized class67 method1243() {
        return null;
    }

    @ObfuscatedName("gr.p()I")
    public synchronized int method1211() {
        return 0;
    }

    @ObfuscatedName("gr.q([III)V")
    public synchronized void method1219(int[] arg0, int arg1, int arg2) {
        if (this.field2997.method3388()) {
            int var4 = this.field2979 * this.field2997.field2951 / Statics.field974;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field3001;
                if (this.field3002 - var5 >= 0L) {
                    this.field3001 = var5;
                    break;
                }
                int var7 = (int) ((this.field3002 - this.field3001 + (long) var4 - 1L) / (long) var4);
                this.field3001 += (long) var4 * (long) var7;
                this.field3003.method1219(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3485();
            } while (this.field2997.method3388());
        }
        this.field3003.method1219(arg0, arg1, arg2);
    }

    @ObfuscatedName("gr.e(I)V")
    public synchronized void method1221(int arg0) {
        if (this.field2997.method3388()) {
            int var2 = this.field2979 * this.field2997.field2951 / Statics.field974;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field3001;
                if (this.field3002 - var3 >= 0L) {
                    this.field3001 = var3;
                    break;
                }
                int var5 = (int) ((this.field3002 - this.field3001 + (long) var2 - 1L) / (long) var2);
                this.field3001 += (long) var2 * (long) var5;
                this.field3003.method1221(var5);
                arg0 -= var5;
                this.method3485();
            } while (this.field2997.method3388());
        }
        this.field3003.method1221(arg0);
    }

    @ObfuscatedName("gr.aa(I)V")
    public void method3485() {
        int var1 = this.field2996;
        int var2 = this.field3000;
        long var3 = this.field3002;
        while (this.field3000 == var2) {
            while (this.field2997.field2956[var1] == var2) {
                this.field2997.method3426(var1);
                int var5 = this.field2997.method3422(var1);
                if (var5 == 1) {
                    this.field2997.method3396();
                    this.field2997.method3391(var1);
                    if (this.field2997.method3399()) {
                        if (!this.field2988 || var2 == 0) {
                            this.method3475();
                            this.field2997.method3392();
                            return;
                        }
                        this.field2997.method3428(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3478(var5);
                }
                this.field2997.method3393(var1);
                this.field2997.method3391(var1);
            }
            var1 = this.field2997.method3398();
            var2 = this.field2997.field2956[var1];
            var3 = this.field2997.method3390(var2);
        }
        this.field2996 = var1;
        this.field3000 = var2;
        this.field3002 = var3;
    }

    @ObfuscatedName("gr.av(Lgc;I)Z")
    public boolean method3484(class188 arg0) {
        if (arg0.field3041 != null) {
            return false;
        }
        if (arg0.field3037 >= 0) {
            arg0.method3737();
            if (arg0.field3027 > 0 && this.field2980[arg0.field3032][arg0.field3027] == arg0) {
                this.field2980[arg0.field3032][arg0.field3027] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("gr.aw(Lgc;[IIIS)Z")
    public boolean method3520(class188 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field3042 = Statics.field974 / 100;
        if (arg0.field3037 >= 0 && arg0.field3041 == null || arg0.field3041.method1392()) {
            arg0.method3565();
            arg0.method3737();
            if (arg0.field3027 > 0 && this.field2980[arg0.field3032][arg0.field3027] == arg0) {
                this.field2980[arg0.field3032][arg0.field3027] = null;
            }
            return true;
        }
        int var5 = arg0.field3023;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2989[arg0.field3032] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field3023 = var6;
        }
        arg0.field3041.method1409(this.method3476(arg0));
        class186 var7 = arg0.field3035;
        boolean var8 = false;
        arg0.field3039++;
        arg0.field3026 += var7.field3015;
        double var9 = (double) ((arg0.field3040 - 60 << 8) + (arg0.field3029 * arg0.field3023 >> 12)) * 5.086263020833333E-6D;
        if (var7.field3010 > 0) {
            if (var7.field3013 > 0) {
                arg0.field3034 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3013 * var9) + 0.5D);
            } else {
                arg0.field3034 += 128;
            }
        }
        if (var7.field3008 != null) {
            if (var7.field3009 > 0) {
                arg0.field3030 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3009 * var9) + 0.5D);
            } else {
                arg0.field3030 += 128;
            }
            while (arg0.field3036 < var7.field3008.length - 2 && arg0.field3030 > (var7.field3008[arg0.field3036 + 2] & 0xFF) << 8) {
                arg0.field3036 += 2;
            }
            if (arg0.field3036 == var7.field3008.length - 2 && var7.field3008[arg0.field3036 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field3037 >= 0 && var7.field3017 != null && (this.field2986[arg0.field3032] & 0x1) == 0 && (arg0.field3027 < 0 || this.field2980[arg0.field3032][arg0.field3027] != arg0)) {
            if (var7.field3011 > 0) {
                arg0.field3037 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3011 * var9) + 0.5D);
            } else {
                arg0.field3037 += 128;
            }
            while (arg0.field3038 < var7.field3017.length - 2 && arg0.field3037 > (var7.field3017[arg0.field3038 + 2] & 0xFF) << 8) {
                arg0.field3038 += 2;
            }
            if (arg0.field3038 == var7.field3017.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field3041.method1368(arg0.field3042, this.method3538(arg0), this.method3480(arg0));
            return false;
        }
        arg0.field3041.method1369(arg0.field3042);
        if (arg1 == null) {
            arg0.field3041.method1221(arg3);
        } else {
            arg0.field3041.method1219(arg1, arg2, arg3);
        }
        if (arg0.field3041.method1397()) {
            this.field3003.field3022.method1231(arg0.field3041);
        }
        arg0.method3565();
        if (arg0.field3037 >= 0) {
            arg0.method3737();
            if (arg0.field3027 > 0 && this.field2980[arg0.field3032][arg0.field3027] == arg0) {
                this.field2980[arg0.field3032][arg0.field3027] = null;
            }
        }
        return true;
    }
}
