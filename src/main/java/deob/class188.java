package deob;

@ObfuscatedName("gu")
public class class188 extends class70 {

    @ObfuscatedName("gu.l")
    public class200 field3019 = new class200(128);

    @ObfuscatedName("gu.g")
    public int field3016 = 256;

    @ObfuscatedName("gu.r")
    public int field3017 = 1000000;

    @ObfuscatedName("gu.e")
    public int[] field3037 = new int[16];

    @ObfuscatedName("gu.h")
    public int[] field3026 = new int[16];

    @ObfuscatedName("gu.s")
    public int[] field3020 = new int[16];

    @ObfuscatedName("gu.k")
    public int[] field3028 = new int[16];

    @ObfuscatedName("gu.u")
    public int[] field3022 = new int[16];

    @ObfuscatedName("gu.n")
    public int[] field3023 = new int[16];

    @ObfuscatedName("gu.b")
    public int[] field3024 = new int[16];

    @ObfuscatedName("gu.m")
    public int[] field3025 = new int[16];

    @ObfuscatedName("gu.q")
    public int[] field3021 = new int[16];

    @ObfuscatedName("gu.v")
    public int[] field3027 = new int[16];

    @ObfuscatedName("gu.j")
    public int[] field3032 = new int[16];

    @ObfuscatedName("gu.x")
    public int[] field3029 = new int[16];

    @ObfuscatedName("gu.t")
    public int[] field3030 = new int[16];

    @ObfuscatedName("gu.y")
    public int[] field3031 = new int[16];

    @ObfuscatedName("gu.a")
    public int[] field3015 = new int[16];

    @ObfuscatedName("gu.c")
    public class191[][] field3035 = new class191[16][128];

    @ObfuscatedName("gu.ad")
    public class191[][] field3034 = new class191[16][128];

    @ObfuscatedName("gu.as")
    public class186 field3042 = new class186();

    @ObfuscatedName("gu.ac")
    public boolean field3018;

    @ObfuscatedName("gu.ah")
    public int field3040;

    @ObfuscatedName("gu.am")
    public int field3038;

    @ObfuscatedName("gu.aq")
    public long field3039;

    @ObfuscatedName("gu.az")
    public long field3036;

    @ObfuscatedName("gu.ak")
    public class190 field3041 = new class190(this);

    public class188() {
        this.method3558();
    }

    @ObfuscatedName("gu.l(IB)V")
    public synchronized void method3541(int arg0) {
        this.field3016 = arg0;
    }

    @ObfuscatedName("gu.g(B)I")
    public int method3632() {
        return this.field3016;
    }

    @ObfuscatedName("gu.r(Lgk;Lfp;Lbw;II)Z")
    public synchronized boolean method3542(class184 arg0, class171 arg1, class63 arg2, int arg3) {
        arg0.method3466();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class201 var7 = (class201) arg0.field2983.method3687(); var7 != null; var7 = (class201) arg0.field2983.method3683()) {
            int var8 = (int) var7.field3176;
            class185 var9 = (class185) this.field3019.method3684((long) var8);
            if (var9 == null) {
                var9 = class185.method3423(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field3019.method3688(var9, (long) var8);
            }
            if (!var9.method3475(arg2, var7.field3153, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3462();
        }
        return var5;
    }

    @ObfuscatedName("gu.e(S)V")
    public synchronized void method3611() {
        for (class185 var1 = (class185) this.field3019.method3687(); var1 != null; var1 = (class185) this.field3019.method3683()) {
            var1.method3471();
        }
    }

    @ObfuscatedName("gu.h(I)V")
    public synchronized void method3566() {
        for (class185 var1 = (class185) this.field3019.method3687(); var1 != null; var1 = (class185) this.field3019.method3683()) {
            var1.method3815();
        }
    }

    @ObfuscatedName("gu.b(Lgk;ZI)V")
    public synchronized void method3545(class184 arg0, boolean arg1) {
        this.method3544();
        this.field3042.method3483(arg0.field2984);
        this.field3018 = arg1;
        this.field3039 = 0L;
        int var3 = this.field3042.method3486();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3042.method3524(var4);
            this.field3042.method3497(var4);
            this.field3042.method3487(var4);
        }
        this.field3040 = this.field3042.method3494();
        this.field3038 = this.field3042.field3000[this.field3040];
        this.field3036 = this.field3042.method3502(this.field3038);
    }

    @ObfuscatedName("gu.q(I)V")
    public synchronized void method3544() {
        this.field3042.method3484();
        this.method3558();
    }

    @ObfuscatedName("gu.p(I)Z")
    public synchronized boolean method3546() {
        return this.field3042.method3485();
    }

    @ObfuscatedName("gu.w(III)V")
    public synchronized void method3547(int arg0, int arg1) {
        this.method3548(arg0, arg1);
    }

    @ObfuscatedName("gu.o(IIS)V")
    public void method3548(int arg0, int arg1) {
        this.field3028[arg0] = arg1;
        this.field3023[arg0] = arg1 & 0xFFFFFF80;
        this.method3570(arg0, arg1);
    }

    @ObfuscatedName("gu.d(IIB)V")
    public void method3570(int arg0, int arg1) {
        if (this.field3022[arg0] != arg1) {
            this.field3022[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field3034[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("gu.f(IIII)V")
    public void method3550(int arg0, int arg1, int arg2) {
        this.method3552(arg0, arg1, 64);
        if ((this.field3027[arg0] & 0x2) != 0) {
            for (class191 var4 = (class191) this.field3041.field3058.method3717(); var4 != null; var4 = (class191) this.field3041.field3058.method3719()) {
                if (var4.field3079 == arg0 && var4.field3084 < 0) {
                    this.field3035[arg0][var4.field3082] = null;
                    this.field3035[arg0][arg1] = var4;
                    int var5 = (var4.field3073 * var4.field3072 >> 12) + var4.field3071;
                    var4.field3071 += arg1 - var4.field3082 << 8;
                    var4.field3072 = var5 - var4.field3071;
                    var4.field3073 = 4096;
                    var4.field3082 = arg1;
                    return;
                }
            }
        }
        class185 var6 = (class185) this.field3019.method3684((long) this.field3022[arg0]);
        if (var6 == null) {
            return;
        }
        class66 var7 = var6.field2986[arg1];
        if (var7 == null) {
            return;
        }
        class191 var8 = new class191();
        var8.field3079 = arg0;
        var8.field3064 = var6;
        var8.field3068 = var7;
        var8.field3066 = var6.field2990[arg1];
        var8.field3067 = var6.field2985[arg1];
        var8.field3082 = arg1;
        var8.field3069 = var6.field2987 * arg2 * arg2 * var6.field2992[arg1] + 1024 >> 11;
        var8.field3070 = var6.field2989[arg1] & 0xFF;
        var8.field3071 = (arg1 << 8) - (var6.field2988[arg1] & 0x7FFF);
        var8.field3065 = 0;
        var8.field3081 = 0;
        var8.field3076 = 0;
        var8.field3084 = -1;
        var8.field3078 = 0;
        if (this.field3030[arg0] == 0) {
            var8.field3075 = class68.method1402(var7, this.method3563(var8), this.method3564(var8), this.method3601(var8));
        } else {
            var8.field3075 = class68.method1402(var7, this.method3563(var8), 0, this.method3601(var8));
            this.method3551(var8, var6.field2988[arg1] < 0);
        }
        if (var6.field2988[arg1] < 0) {
            var8.field3075.method1404(-1);
        }
        if (var8.field3067 >= 0) {
            class191 var9 = this.field3034[arg0][var8.field3067];
            if (var9 != null && var9.field3084 < 0) {
                this.field3035[arg0][var9.field3082] = null;
                var9.field3084 = 0;
            }
            this.field3034[arg0][var8.field3067] = var8;
        }
        this.field3041.field3058.method3711(var8);
        this.field3035[arg0][arg1] = var8;
    }

    @ObfuscatedName("gu.z(Lgr;ZB)V")
    public void method3551(class191 arg0, boolean arg1) {
        int var3 = arg0.field3068.field1305.length;
        int var5;
        if (arg1 && arg0.field3068.field1306) {
            int var4 = var3 + var3 - arg0.field3068.field1302;
            var5 = (int) ((long) this.field3030[arg0.field3079] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field3075.method1451(true);
            }
        } else {
            var5 = (int) ((long) this.field3030[arg0.field3079] * (long) var3 >> 6);
        }
        arg0.field3075.method1410(var5);
    }

    @ObfuscatedName("gu.i(IIII)V")
    public void method3552(int arg0, int arg1, int arg2) {
        class191 var4 = this.field3035[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field3035[arg0][arg1] = null;
        if ((this.field3027[arg0] & 0x2) == 0) {
            var4.field3084 = 0;
            return;
        }
        for (class191 var5 = (class191) this.field3041.field3058.method3728(); var5 != null; var5 = (class191) this.field3041.field3058.method3718()) {
            if (var4.field3079 == var5.field3079 && var5.field3084 < 0 && var4 != var5) {
                var4.field3084 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("gu.v(IIII)V")
    public void method3553(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("gu.j(III)V")
    public void method3581(int arg0, int arg1) {
    }

    @ObfuscatedName("gu.x(III)V")
    public void method3543(int arg0, int arg1) {
        this.field3024[arg0] = arg1;
    }

    @ObfuscatedName("gu.af(II)V")
    public void method3555(int arg0) {
        for (class191 var2 = (class191) this.field3041.field3058.method3728(); var2 != null; var2 = (class191) this.field3041.field3058.method3718()) {
            if (arg0 < 0 || var2.field3079 == arg0) {
                if (var2.field3075 != null) {
                    var2.field3075.method1405(Statics.field1255 / 100);
                    if (var2.field3075.method1418()) {
                        this.field3041.field3062.method1226(var2.field3075);
                    }
                    var2.method3643();
                }
                if (var2.field3084 < 0) {
                    this.field3035[var2.field3079][var2.field3082] = null;
                }
                var2.method3815();
            }
        }
    }

    @ObfuscatedName("gu.ai(IB)V")
    public void method3556(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3556(var2);
            }
            return;
        }
        this.field3037[arg0] = 12800;
        this.field3026[arg0] = 8192;
        this.field3020[arg0] = 16383;
        this.field3024[arg0] = 8192;
        this.field3025[arg0] = 0;
        this.field3021[arg0] = 8192;
        this.method3559(arg0);
        this.method3560(arg0);
        this.field3027[arg0] = 0;
        this.field3032[arg0] = 32767;
        this.field3029[arg0] = 256;
        this.field3030[arg0] = 0;
        this.method3549(arg0, 8192);
    }

    @ObfuscatedName("gu.aj(II)V")
    public void method3557(int arg0) {
        for (class191 var2 = (class191) this.field3041.field3058.method3728(); var2 != null; var2 = (class191) this.field3041.field3058.method3718()) {
            if ((arg0 < 0 || var2.field3079 == arg0) && var2.field3084 < 0) {
                this.field3035[var2.field3079][var2.field3082] = null;
                var2.field3084 = 0;
            }
        }
    }

    @ObfuscatedName("gu.ar(I)V")
    public void method3558() {
        this.method3555(-1);
        this.method3556(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field3022[var1] = this.field3028[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field3023[var2] = this.field3028[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("gu.at(II)V")
    public void method3559(int arg0) {
        if ((this.field3027[arg0] & 0x2) == 0) {
            return;
        }
        for (class191 var2 = (class191) this.field3041.field3058.method3728(); var2 != null; var2 = (class191) this.field3041.field3058.method3718()) {
            if (var2.field3079 == arg0 && this.field3035[arg0][var2.field3082] == null && var2.field3084 < 0) {
                var2.field3084 = 0;
            }
        }
    }

    @ObfuscatedName("gu.av(II)V")
    public void method3560(int arg0) {
        if ((this.field3027[arg0] & 0x4) == 0) {
            return;
        }
        for (class191 var2 = (class191) this.field3041.field3058.method3728(); var2 != null; var2 = (class191) this.field3041.field3058.method3718()) {
            if (var2.field3079 == arg0) {
                var2.field3083 = 0;
            }
        }
    }

    @ObfuscatedName("gu.aw(II)V")
    public void method3554(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3552(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3550(var6, var7, var8);
            } else {
                this.method3552(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3553(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field3023[var12] = (var14 << 14) + (this.field3023[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field3023[var12] = (var14 << 7) + (this.field3023[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field3025[var12] = (var14 << 7) + (this.field3025[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field3025[var12] = (this.field3025[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field3021[var12] = (var14 << 7) + (this.field3021[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field3021[var12] = (this.field3021[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field3037[var12] = (var14 << 7) + (this.field3037[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field3037[var12] = (this.field3037[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field3026[var12] = (var14 << 7) + (this.field3026[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field3026[var12] = (this.field3026[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field3020[var12] = (var14 << 7) + (this.field3020[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field3020[var12] = (this.field3020[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field3027[var12] |= 0x1;
                } else {
                    this.field3027[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field3027[var12] |= 0x2;
                } else {
                    this.method3559(var12);
                    this.field3027[var12] &= 0xFFFFFFFD;
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
                this.method3555(var12);
            }
            if (var13 == 121) {
                this.method3556(var12);
            }
            if (var13 == 123) {
                this.method3557(var12);
            }
            if (var13 == 6) {
                int var15 = this.field3032[var12];
                if (var15 == 16384) {
                    this.field3029[var12] = (var14 << 7) + (this.field3029[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field3032[var12];
                if (var16 == 16384) {
                    this.field3029[var12] = (this.field3029[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field3030[var12] = (var14 << 7) + (this.field3030[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field3030[var12] = (this.field3030[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field3027[var12] |= 0x4;
                } else {
                    this.method3560(var12);
                    this.field3027[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3549(var12, (var14 << 7) + (this.field3031[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3549(var12, (this.field3031[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3570(var17, this.field3023[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3581(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method3543(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3558();
            }
        }
    }

    @ObfuscatedName("gu.au(III)V")
    public void method3549(int arg0, int arg1) {
        this.field3031[arg0] = arg1;
        this.field3015[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("gu.ax(Lgr;B)I")
    public int method3563(class191 arg0) {
        int var2 = (arg0.field3073 * arg0.field3072 >> 12) + arg0.field3071;
        int var3 = ((this.field3024[arg0.field3079] - 8192) * this.field3029[arg0.field3079] >> 12) + var2;
        class189 var4 = arg0.field3066;
        if (var4.field3050 > 0 && (var4.field3049 > 0 || this.field3025[arg0.field3079] > 0)) {
            int var5 = var4.field3049 << 2;
            int var6 = var4.field3055 << 1;
            if (arg0.field3063 < var6) {
                var5 = arg0.field3063 * var5 / var6;
            }
            int var7 = (this.field3025[arg0.field3079] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field3080 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field3068.field1303 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1255 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("gu.al(Lgr;I)I")
    public int method3564(class191 arg0) {
        class189 var2 = arg0.field3066;
        int var3 = this.field3037[arg0.field3079] * this.field3020[arg0.field3079] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field3069 * var4 + 16384 >> 15;
        int var6 = this.field3016 * var5 + 128 >> 8;
        if (var2.field3045 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field3065 * 1.953125E-5D * (double) var2.field3045) + 0.5D);
        }
        if (var2.field3051 != null) {
            int var7 = arg0.field3081;
            int var8 = var2.field3051[arg0.field3076 + 1];
            if (arg0.field3076 < var2.field3051.length - 2) {
                int var9 = (var2.field3051[arg0.field3076] & 0xFF) << 8;
                int var10 = (var2.field3051[arg0.field3076 + 2] & 0xFF) << 8;
                var8 += (var2.field3051[arg0.field3076 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field3084 > 0 && var2.field3044 != null) {
            int var11 = arg0.field3084;
            int var12 = var2.field3044[arg0.field3078 + 1];
            if (arg0.field3078 < var2.field3044.length - 2) {
                int var13 = (var2.field3044[arg0.field3078] & 0xFF) << 8;
                int var14 = (var2.field3044[arg0.field3078 + 2] & 0xFF) << 8;
                var12 += (var2.field3044[arg0.field3078 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("gu.an(Lgr;I)I")
    public int method3601(class191 arg0) {
        int var2 = this.field3026[arg0.field3079];
        return var2 < 8192 ? arg0.field3070 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field3070) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("gu.s()Lbh;")
    public synchronized class70 method1231() {
        return this.field3041;
    }

    @ObfuscatedName("gu.k()Lbh;")
    public synchronized class70 method1232() {
        return null;
    }

    @ObfuscatedName("gu.u()I")
    public synchronized int method1255() {
        return 0;
    }

    @ObfuscatedName("gu.n([III)V")
    public synchronized void method1234(int[] arg0, int arg1, int arg2) {
        if (this.field3042.method3485()) {
            int var4 = this.field3017 * this.field3042.field3006 / Statics.field1255;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field3039;
                if (this.field3036 - var5 >= 0L) {
                    this.field3039 = var5;
                    break;
                }
                int var7 = (int) ((this.field3036 - this.field3039 + (long) var4 - 1L) / (long) var4);
                this.field3039 += (long) var4 * (long) var7;
                this.field3041.method1234(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3573();
            } while (this.field3042.method3485());
        }
        this.field3041.method1234(arg0, arg1, arg2);
    }

    @ObfuscatedName("gu.m(I)V")
    public synchronized void method1236(int arg0) {
        if (this.field3042.method3485()) {
            int var2 = this.field3017 * this.field3042.field3006 / Statics.field1255;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field3039;
                if (this.field3036 - var3 >= 0L) {
                    this.field3039 = var3;
                    break;
                }
                int var5 = (int) ((this.field3036 - this.field3039 + (long) var2 - 1L) / (long) var2);
                this.field3039 += (long) var2 * (long) var5;
                this.field3041.method1236(var5);
                arg0 -= var5;
                this.method3573();
            } while (this.field3042.method3485());
        }
        this.field3041.method1236(arg0);
    }

    @ObfuscatedName("gu.aa(I)V")
    public void method3573() {
        int var1 = this.field3040;
        int var2 = this.field3038;
        long var3 = this.field3036;
        while (this.field3038 == var2) {
            while (this.field3042.field3000[var1] == var2) {
                this.field3042.method3524(var1);
                int var5 = this.field3042.method3490(var1);
                if (var5 == 1) {
                    this.field3042.method3489();
                    this.field3042.method3487(var1);
                    if (this.field3042.method3517()) {
                        if (!this.field3018 || var2 == 0) {
                            this.method3558();
                            this.field3042.method3484();
                            return;
                        }
                        this.field3042.method3496(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3554(var5);
                }
                this.field3042.method3497(var1);
                this.field3042.method3487(var1);
            }
            var1 = this.field3042.method3494();
            var2 = this.field3042.field3000[var1];
            var3 = this.field3042.method3502(var2);
        }
        this.field3040 = var1;
        this.field3038 = var2;
        this.field3036 = var3;
    }

    @ObfuscatedName("gu.bc(Lgr;I)Z")
    public boolean method3567(class191 arg0) {
        if (arg0.field3075 != null) {
            return false;
        }
        if (arg0.field3084 >= 0) {
            arg0.method3815();
            if (arg0.field3067 > 0 && this.field3034[arg0.field3079][arg0.field3067] == arg0) {
                this.field3034[arg0.field3079][arg0.field3067] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("gu.bq(Lgr;[IIII)Z")
    public boolean method3568(class191 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field3074 = Statics.field1255 / 100;
        if (arg0.field3084 >= 0 && arg0.field3075 == null || arg0.field3075.method1483()) {
            arg0.method3643();
            arg0.method3815();
            if (arg0.field3067 > 0 && this.field3034[arg0.field3079][arg0.field3067] == arg0) {
                this.field3034[arg0.field3079][arg0.field3067] = null;
            }
            return true;
        }
        int var5 = arg0.field3073;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field3021[arg0.field3079] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field3073 = var6;
        }
        arg0.field3075.method1415(this.method3563(arg0));
        class189 var7 = arg0.field3066;
        boolean var8 = false;
        arg0.field3063++;
        arg0.field3080 += var7.field3050;
        double var9 = (double) ((arg0.field3082 - 60 << 8) + (arg0.field3073 * arg0.field3072 >> 12)) * 5.086263020833333E-6D;
        if (var7.field3045 > 0) {
            if (var7.field3048 > 0) {
                arg0.field3065 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3048 * var9) + 0.5D);
            } else {
                arg0.field3065 += 128;
            }
        }
        if (var7.field3051 != null) {
            if (var7.field3046 > 0) {
                arg0.field3081 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3046 * var9) + 0.5D);
            } else {
                arg0.field3081 += 128;
            }
            while (arg0.field3076 < var7.field3051.length - 2 && arg0.field3081 > (var7.field3051[arg0.field3076 + 2] & 0xFF) << 8) {
                arg0.field3076 += 2;
            }
            if (arg0.field3076 == var7.field3051.length - 2 && var7.field3051[arg0.field3076 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field3084 >= 0 && var7.field3044 != null && (this.field3027[arg0.field3079] & 0x1) == 0 && (arg0.field3067 < 0 || this.field3034[arg0.field3079][arg0.field3067] != arg0)) {
            if (var7.field3043 > 0) {
                arg0.field3084 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3043 * var9) + 0.5D);
            } else {
                arg0.field3084 += 128;
            }
            while (arg0.field3078 < var7.field3044.length - 2 && arg0.field3084 > (var7.field3044[arg0.field3078 + 2] & 0xFF) << 8) {
                arg0.field3078 += 2;
            }
            if (arg0.field3078 == var7.field3044.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field3075.method1413(arg0.field3074, this.method3564(arg0), this.method3601(arg0));
            return false;
        }
        arg0.field3075.method1405(arg0.field3074);
        if (arg1 == null) {
            arg0.field3075.method1236(arg3);
        } else {
            arg0.field3075.method1234(arg1, arg2, arg3);
        }
        if (arg0.field3075.method1418()) {
            this.field3041.field3062.method1226(arg0.field3075);
        }
        arg0.method3643();
        if (arg0.field3084 >= 0) {
            arg0.method3815();
            if (arg0.field3067 > 0 && this.field3034[arg0.field3079][arg0.field3067] == arg0) {
                this.field3034[arg0.field3079][arg0.field3067] = null;
            }
        }
        return true;
    }
}
