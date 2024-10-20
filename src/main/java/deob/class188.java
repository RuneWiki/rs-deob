package deob;

@ObfuscatedName("gb")
public class class188 extends class70 {

    @ObfuscatedName("gb.x")
    public class200 field3028 = new class200(128);

    @ObfuscatedName("gb.r")
    public int field3020 = 256;

    @ObfuscatedName("gb.j")
    public int field3021 = 1000000;

    @ObfuscatedName("gb.z")
    public int[] field3031 = new int[16];

    @ObfuscatedName("gb.i")
    public int[] field3037 = new int[16];

    @ObfuscatedName("gb.b")
    public int[] field3023 = new int[16];

    @ObfuscatedName("gb.l")
    public int[] field3025 = new int[16];

    @ObfuscatedName("gb.m")
    public int[] field3026 = new int[16];

    @ObfuscatedName("gb.p")
    public int[] field3043 = new int[16];

    @ObfuscatedName("gb.f")
    public int[] field3030 = new int[16];

    @ObfuscatedName("gb.d")
    public int[] field3029 = new int[16];

    @ObfuscatedName("gb.v")
    public int[] field3034 = new int[16];

    @ObfuscatedName("gb.e")
    public int[] field3022 = new int[16];

    @ObfuscatedName("gb.c")
    public int[] field3032 = new int[16];

    @ObfuscatedName("gb.n")
    public int[] field3033 = new int[16];

    @ObfuscatedName("gb.y")
    public int[] field3024 = new int[16];

    @ObfuscatedName("gb.k")
    public int[] field3035 = new int[16];

    @ObfuscatedName("gb.w")
    public int[] field3036 = new int[16];

    @ObfuscatedName("gb.o")
    public class191[][] field3027 = new class191[16][128];

    @ObfuscatedName("gb.ah")
    public class191[][] field3038 = new class191[16][128];

    @ObfuscatedName("gb.an")
    public class186 field3039 = new class186();

    @ObfuscatedName("gb.ag")
    public boolean field3040;

    @ObfuscatedName("gb.as")
    public int field3041;

    @ObfuscatedName("gb.aq")
    public int field3042;

    @ObfuscatedName("gb.ax")
    public long field3019;

    @ObfuscatedName("gb.az")
    public long field3044;

    @ObfuscatedName("gb.ap")
    public class190 field3045 = new class190(this);

    public class188() {
        this.method3418();
    }

    @ObfuscatedName("gb.x(IS)V")
    public synchronized void method3399(int arg0) {
        this.field3020 = arg0;
    }

    @ObfuscatedName("gb.r(B)I")
    public int method3400() {
        return this.field3020;
    }

    @ObfuscatedName("gb.j(Lgq;Lfp;Lbl;IB)Z")
    public synchronized boolean method3401(class184 arg0, class171 arg1, class63 arg2, int arg3) {
        arg0.method3313();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class201 var7 = (class201) arg0.field2980.method3571(); var7 != null; var7 = (class201) arg0.field2980.method3572()) {
            int var8 = (int) var7.field3174;
            class185 var9 = (class185) this.field3028.method3580((long) var8);
            if (var9 == null) {
                var9 = class185.method2097(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field3028.method3569(var9, (long) var8);
            }
            if (!var9.method3331(arg2, var7.field3152, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3315();
        }
        return var5;
    }

    @ObfuscatedName("gb.z(I)V")
    public synchronized void method3429() {
        for (class185 var1 = (class185) this.field3028.method3571(); var1 != null; var1 = (class185) this.field3028.method3572()) {
            var1.method3323();
        }
    }

    @ObfuscatedName("gb.i(B)V")
    public synchronized void method3403() {
        for (class185 var1 = (class185) this.field3028.method3571(); var1 != null; var1 = (class185) this.field3028.method3572()) {
            var1.method3695();
        }
    }

    @ObfuscatedName("gb.f(Lgq;ZI)V")
    public synchronized void method3404(class184 arg0, boolean arg1) {
        this.method3444();
        this.field3039.method3336(arg0.field2981);
        this.field3040 = arg1;
        this.field3019 = 0L;
        int var3 = this.field3039.method3339();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3039.method3340(var4);
            this.field3039.method3341(var4);
            this.field3039.method3346(var4);
        }
        this.field3041 = this.field3039.method3348();
        this.field3042 = this.field3039.field2995[this.field3041];
        this.field3044 = this.field3039.method3347(this.field3042);
    }

    @ObfuscatedName("gb.v(I)V")
    public synchronized void method3444() {
        this.field3039.method3349();
        this.method3418();
    }

    @ObfuscatedName("gb.q(I)Z")
    public synchronized boolean method3406() {
        return this.field3039.method3338();
    }

    @ObfuscatedName("gb.t(IIB)V")
    public synchronized void method3407(int arg0, int arg1) {
        this.method3408(arg0, arg1);
    }

    @ObfuscatedName("gb.g(III)V")
    public void method3408(int arg0, int arg1) {
        this.field3025[arg0] = arg1;
        this.field3043[arg0] = arg1 & 0xFFFFFF80;
        this.method3432(arg0, arg1);
    }

    @ObfuscatedName("gb.s(III)V")
    public void method3432(int arg0, int arg1) {
        if (this.field3026[arg0] != arg1) {
            this.field3026[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field3038[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("gb.h(IIII)V")
    public void method3447(int arg0, int arg1, int arg2) {
        this.method3478(arg0, arg1, 64);
        if ((this.field3022[arg0] & 0x2) != 0) {
            for (class191 var4 = (class191) this.field3045.field3061.method3617(); var4 != null; var4 = (class191) this.field3045.field3061.method3603()) {
                if (var4.field3071 == arg0 && var4.field3077 < 0) {
                    this.field3027[arg0][var4.field3081] = null;
                    this.field3027[arg0][arg1] = var4;
                    int var5 = (var4.field3072 * var4.field3065 >> 12) + var4.field3063;
                    var4.field3063 += arg1 - var4.field3081 << 8;
                    var4.field3072 = var5 - var4.field3063;
                    var4.field3065 = 4096;
                    var4.field3081 = arg1;
                    return;
                }
            }
        }
        class185 var6 = (class185) this.field3028.method3580((long) this.field3026[arg0]);
        if (var6 == null) {
            return;
        }
        class66 var7 = var6.field2983[arg1];
        if (var7 == null) {
            return;
        }
        class191 var8 = new class191();
        var8.field3071 = arg0;
        var8.field3064 = var6;
        var8.field3070 = var7;
        var8.field3066 = var6.field2987[arg1];
        var8.field3067 = var6.field2984[arg1];
        var8.field3081 = arg1;
        var8.field3069 = var6.field2985 * arg2 * arg2 * var6.field2986[arg1] + 1024 >> 11;
        var8.field3073 = var6.field2982[arg1] & 0xFF;
        var8.field3063 = (arg1 << 8) - (var6.field2990[arg1] & 0x7FFF);
        var8.field3074 = 0;
        var8.field3075 = 0;
        var8.field3076 = 0;
        var8.field3077 = -1;
        var8.field3078 = 0;
        if (this.field3024[arg0] == 0) {
            var8.field3068 = class68.method1312(var7, this.method3423(var8), this.method3424(var8), this.method3425(var8));
        } else {
            var8.field3068 = class68.method1312(var7, this.method3423(var8), 0, this.method3425(var8));
            this.method3410(var8, var6.field2990[arg1] < 0);
        }
        if (var6.field2990[arg1] < 0) {
            var8.field3068.method1314(-1);
        }
        if (var8.field3067 >= 0) {
            class191 var9 = this.field3038[arg0][var8.field3067];
            if (var9 != null && var9.field3077 < 0) {
                this.field3027[arg0][var9.field3081] = null;
                var9.field3077 = 0;
            }
            this.field3038[arg0][var8.field3067] = var8;
        }
        this.field3045.field3061.method3594(var8);
        this.field3027[arg0][arg1] = var8;
    }

    @ObfuscatedName("gb.u(Lgd;ZI)V")
    public void method3410(class191 arg0, boolean arg1) {
        int var3 = arg0.field3070.field1276.length;
        int var5;
        if (arg1 && arg0.field3070.field1275) {
            int var4 = var3 + var3 - arg0.field3070.field1277;
            var5 = (int) ((long) this.field3024[arg0.field3071] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field3068.method1320(true);
            }
        } else {
            var5 = (int) ((long) this.field3024[arg0.field3071] * (long) var3 >> 6);
        }
        arg0.field3068.method1349(var5);
    }

    @ObfuscatedName("gb.a(IIIB)V")
    public void method3478(int arg0, int arg1, int arg2) {
        class191 var4 = this.field3027[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field3027[arg0][arg1] = null;
        if ((this.field3022[arg0] & 0x2) == 0) {
            var4.field3077 = 0;
            return;
        }
        for (class191 var5 = (class191) this.field3045.field3061.method3600(); var5 != null; var5 = (class191) this.field3045.field3061.method3602()) {
            if (var4.field3071 == var5.field3071 && var5.field3077 < 0 && var4 != var5) {
                var4.field3077 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("gb.e(IIIB)V")
    public void method3412(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("gb.c(IIB)V")
    public void method3413(int arg0, int arg1) {
    }

    @ObfuscatedName("gb.aq(IIB)V")
    public void method3414(int arg0, int arg1) {
        this.field3030[arg0] = arg1;
    }

    @ObfuscatedName("gb.ax(II)V")
    public void method3415(int arg0) {
        for (class191 var2 = (class191) this.field3045.field3061.method3600(); var2 != null; var2 = (class191) this.field3045.field3061.method3602()) {
            if (arg0 < 0 || var2.field3071 == arg0) {
                if (var2.field3068 != null) {
                    var2.field3068.method1324(Statics.field1229 / 100);
                    if (var2.field3068.method1328()) {
                        this.field3045.field3060.method1148(var2.field3068);
                    }
                    var2.method3518();
                }
                if (var2.field3077 < 0) {
                    this.field3027[var2.field3071][var2.field3081] = null;
                }
                var2.method3695();
            }
        }
    }

    @ObfuscatedName("gb.az(IS)V")
    public void method3416(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3416(var2);
            }
            return;
        }
        this.field3031[arg0] = 12800;
        this.field3037[arg0] = 8192;
        this.field3023[arg0] = 16383;
        this.field3030[arg0] = 8192;
        this.field3029[arg0] = 0;
        this.field3034[arg0] = 8192;
        this.method3419(arg0);
        this.method3420(arg0);
        this.field3022[arg0] = 0;
        this.field3032[arg0] = 32767;
        this.field3033[arg0] = 256;
        this.field3024[arg0] = 0;
        this.method3495(arg0, 8192);
    }

    @ObfuscatedName("gb.au(II)V")
    public void method3493(int arg0) {
        for (class191 var2 = (class191) this.field3045.field3061.method3600(); var2 != null; var2 = (class191) this.field3045.field3061.method3602()) {
            if ((arg0 < 0 || var2.field3071 == arg0) && var2.field3077 < 0) {
                this.field3027[var2.field3071][var2.field3081] = null;
                var2.field3077 = 0;
            }
        }
    }

    @ObfuscatedName("gb.ab(I)V")
    public void method3418() {
        this.method3415(-1);
        this.method3416(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field3026[var1] = this.field3025[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field3043[var2] = this.field3025[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("gb.at(IB)V")
    public void method3419(int arg0) {
        if ((this.field3022[arg0] & 0x2) == 0) {
            return;
        }
        for (class191 var2 = (class191) this.field3045.field3061.method3600(); var2 != null; var2 = (class191) this.field3045.field3061.method3602()) {
            if (var2.field3071 == arg0 && this.field3027[arg0][var2.field3081] == null && var2.field3077 < 0) {
                var2.field3077 = 0;
            }
        }
    }

    @ObfuscatedName("gb.ay(II)V")
    public void method3420(int arg0) {
        if ((this.field3022[arg0] & 0x4) == 0) {
            return;
        }
        for (class191 var2 = (class191) this.field3045.field3061.method3600(); var2 != null; var2 = (class191) this.field3045.field3061.method3602()) {
            if (var2.field3071 == arg0) {
                var2.field3083 = 0;
            }
        }
    }

    @ObfuscatedName("gb.ad(II)V")
    public void method3421(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3478(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3447(var6, var7, var8);
            } else {
                this.method3478(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3412(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field3043[var12] = (var14 << 14) + (this.field3043[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field3043[var12] = (var14 << 7) + (this.field3043[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field3029[var12] = (var14 << 7) + (this.field3029[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field3029[var12] = (this.field3029[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field3034[var12] = (var14 << 7) + (this.field3034[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field3034[var12] = (this.field3034[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field3031[var12] = (var14 << 7) + (this.field3031[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field3031[var12] = (this.field3031[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field3037[var12] = (var14 << 7) + (this.field3037[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field3037[var12] = (this.field3037[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field3023[var12] = (var14 << 7) + (this.field3023[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field3023[var12] = (this.field3023[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field3022[var12] |= 0x1;
                } else {
                    this.field3022[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field3022[var12] |= 0x2;
                } else {
                    this.method3419(var12);
                    this.field3022[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field3032[var12] = (var14 << 7) + (this.field3032[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field3032[var12] = (this.field3032[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field3032[var12] = (var14 << 7) + (this.field3032[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field3032[var12] = (this.field3032[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3415(var12);
            }
            if (var13 == 121) {
                this.method3416(var12);
            }
            if (var13 == 123) {
                this.method3493(var12);
            }
            if (var13 == 6) {
                int var15 = this.field3032[var12];
                if (var15 == 16384) {
                    this.field3033[var12] = (var14 << 7) + (this.field3033[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field3032[var12];
                if (var16 == 16384) {
                    this.field3033[var12] = (this.field3033[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field3024[var12] = (var14 << 7) + (this.field3024[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field3024[var12] = (this.field3024[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field3022[var12] |= 0x4;
                } else {
                    this.method3420(var12);
                    this.field3022[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3495(var12, (var14 << 7) + (this.field3035[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3495(var12, (this.field3035[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3432(var17, this.field3043[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3413(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method3414(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3418();
            }
        }
    }

    @ObfuscatedName("gb.am(III)V")
    public void method3495(int arg0, int arg1) {
        this.field3035[arg0] = arg1;
        this.field3036[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("gb.ac(Lgd;I)I")
    public int method3423(class191 arg0) {
        int var2 = (arg0.field3072 * arg0.field3065 >> 12) + arg0.field3063;
        int var3 = ((this.field3030[arg0.field3071] - 8192) * this.field3033[arg0.field3071] >> 12) + var2;
        class189 var4 = arg0.field3066;
        if (var4.field3054 > 0 && (var4.field3053 > 0 || this.field3029[arg0.field3071] > 0)) {
            int var5 = var4.field3053 << 2;
            int var6 = var4.field3055 << 1;
            if (arg0.field3079 < var6) {
                var5 = arg0.field3079 * var5 / var6;
            }
            int var7 = (this.field3029[arg0.field3071] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field3080 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field3070.field1278 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1229 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("gb.aw(Lgd;B)I")
    public int method3424(class191 arg0) {
        class189 var2 = arg0.field3066;
        int var3 = this.field3031[arg0.field3071] * this.field3023[arg0.field3071] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field3069 * var4 + 16384 >> 15;
        int var6 = this.field3020 * var5 + 128 >> 8;
        if (var2.field3049 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field3074 * 1.953125E-5D * (double) var2.field3049) + 0.5D);
        }
        if (var2.field3048 != null) {
            int var7 = arg0.field3075;
            int var8 = var2.field3048[arg0.field3076 + 1];
            if (arg0.field3076 < var2.field3048.length - 2) {
                int var9 = (var2.field3048[arg0.field3076] & 0xFF) << 8;
                int var10 = (var2.field3048[arg0.field3076 + 2] & 0xFF) << 8;
                var8 += (var2.field3048[arg0.field3076 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field3077 > 0 && var2.field3047 != null) {
            int var11 = arg0.field3077;
            int var12 = var2.field3047[arg0.field3078 + 1];
            if (arg0.field3078 < var2.field3047.length - 2) {
                int var13 = (var2.field3047[arg0.field3078] & 0xFF) << 8;
                int var14 = (var2.field3047[arg0.field3078 + 2] & 0xFF) << 8;
                var12 += (var2.field3047[arg0.field3078 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("gb.ak(Lgd;I)I")
    public int method3425(class191 arg0) {
        int var2 = this.field3037[arg0.field3071];
        return var2 < 8192 ? arg0.field3073 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field3073) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("gb.b()Lbd;")
    public synchronized class70 method1153() {
        return this.field3045;
    }

    @ObfuscatedName("gb.l()Lbd;")
    public synchronized class70 method1155() {
        return null;
    }

    @ObfuscatedName("gb.m()I")
    public synchronized int method1147() {
        return 0;
    }

    @ObfuscatedName("gb.p([III)V")
    public synchronized void method1179(int[] arg0, int arg1, int arg2) {
        if (this.field3039.method3338()) {
            int var4 = this.field3021 * this.field3039.field2994 / Statics.field1229;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field3019;
                if (this.field3044 - var5 >= 0L) {
                    this.field3019 = var5;
                    break;
                }
                int var7 = (int) ((this.field3044 - this.field3019 + (long) var4 - 1L) / (long) var4);
                this.field3019 += (long) var4 * (long) var7;
                this.field3045.method1179(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3506();
            } while (this.field3039.method3338());
        }
        this.field3045.method1179(arg0, arg1, arg2);
    }

    @ObfuscatedName("gb.d(I)V")
    public synchronized void method1158(int arg0) {
        if (this.field3039.method3338()) {
            int var2 = this.field3021 * this.field3039.field2994 / Statics.field1229;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field3019;
                if (this.field3044 - var3 >= 0L) {
                    this.field3019 = var3;
                    break;
                }
                int var5 = (int) ((this.field3044 - this.field3019 + (long) var2 - 1L) / (long) var2);
                this.field3019 += (long) var2 * (long) var5;
                this.field3045.method1158(var5);
                arg0 -= var5;
                this.method3506();
            } while (this.field3039.method3338());
        }
        this.field3045.method1158(arg0);
    }

    @ObfuscatedName("gb.ar(I)V")
    public void method3506() {
        int var1 = this.field3041;
        int var2 = this.field3042;
        long var3 = this.field3044;
        while (this.field3042 == var2) {
            while (this.field3039.field2995[var1] == var2) {
                this.field3039.method3340(var1);
                int var5 = this.field3039.method3344(var1);
                if (var5 == 1) {
                    this.field3039.method3358();
                    this.field3039.method3346(var1);
                    if (this.field3039.method3369()) {
                        if (!this.field3040 || var2 == 0) {
                            this.method3418();
                            this.field3039.method3349();
                            return;
                        }
                        this.field3039.method3350(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3421(var5);
                }
                this.field3039.method3341(var1);
                this.field3039.method3346(var1);
            }
            var1 = this.field3039.method3348();
            var2 = this.field3039.field2995[var1];
            var3 = this.field3039.method3347(var2);
        }
        this.field3041 = var1;
        this.field3042 = var2;
        this.field3044 = var3;
    }

    @ObfuscatedName("gb.aa(Lgd;I)Z")
    public boolean method3433(class191 arg0) {
        if (arg0.field3068 != null) {
            return false;
        }
        if (arg0.field3077 >= 0) {
            arg0.method3695();
            if (arg0.field3067 > 0 && this.field3038[arg0.field3071][arg0.field3067] == arg0) {
                this.field3038[arg0.field3071][arg0.field3067] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("gb.av(Lgd;[IIII)Z")
    public boolean method3430(class191 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field3082 = Statics.field1229 / 100;
        if (arg0.field3077 >= 0 && arg0.field3068 == null || arg0.field3068.method1327()) {
            arg0.method3518();
            arg0.method3695();
            if (arg0.field3067 > 0 && this.field3038[arg0.field3071][arg0.field3067] == arg0) {
                this.field3038[arg0.field3071][arg0.field3067] = null;
            }
            return true;
        }
        int var5 = arg0.field3065;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field3034[arg0.field3071] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field3065 = var6;
        }
        arg0.field3068.method1325(this.method3423(arg0));
        class189 var7 = arg0.field3066;
        boolean var8 = false;
        arg0.field3079++;
        arg0.field3080 += var7.field3054;
        double var9 = (double) ((arg0.field3081 - 60 << 8) + (arg0.field3072 * arg0.field3065 >> 12)) * 5.086263020833333E-6D;
        if (var7.field3049 > 0) {
            if (var7.field3052 > 0) {
                arg0.field3074 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3052 * var9) + 0.5D);
            } else {
                arg0.field3074 += 128;
            }
        }
        if (var7.field3048 != null) {
            if (var7.field3056 > 0) {
                arg0.field3075 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3056 * var9) + 0.5D);
            } else {
                arg0.field3075 += 128;
            }
            while (arg0.field3076 < var7.field3048.length - 2 && arg0.field3075 > (var7.field3048[arg0.field3076 + 2] & 0xFF) << 8) {
                arg0.field3076 += 2;
            }
            if (arg0.field3076 == var7.field3048.length - 2 && var7.field3048[arg0.field3076 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field3077 >= 0 && var7.field3047 != null && (this.field3022[arg0.field3071] & 0x1) == 0 && (arg0.field3067 < 0 || this.field3038[arg0.field3071][arg0.field3067] != arg0)) {
            if (var7.field3051 > 0) {
                arg0.field3077 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3051 * var9) + 0.5D);
            } else {
                arg0.field3077 += 128;
            }
            while (arg0.field3078 < var7.field3047.length - 2 && arg0.field3077 > (var7.field3047[arg0.field3078 + 2] & 0xFF) << 8) {
                arg0.field3078 += 2;
            }
            if (arg0.field3078 == var7.field3047.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field3068.method1323(arg0.field3082, this.method3424(arg0), this.method3425(arg0));
            return false;
        }
        arg0.field3068.method1324(arg0.field3082);
        if (arg1 == null) {
            arg0.field3068.method1158(arg3);
        } else {
            arg0.field3068.method1179(arg1, arg2, arg3);
        }
        if (arg0.field3068.method1328()) {
            this.field3045.field3060.method1148(arg0.field3068);
        }
        arg0.method3518();
        if (arg0.field3077 >= 0) {
            arg0.method3695();
            if (arg0.field3067 > 0 && this.field3038[arg0.field3071][arg0.field3067] == arg0) {
                this.field3038[arg0.field3071][arg0.field3067] = null;
            }
        }
        return true;
    }
}
