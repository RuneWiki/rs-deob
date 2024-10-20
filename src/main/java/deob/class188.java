package deob;

@ObfuscatedName("gk")
public class class188 extends class70 {

    @ObfuscatedName("gk.e")
    public class200 field3028 = new class200(128);

    @ObfuscatedName("gk.l")
    public int field3005 = 256;

    @ObfuscatedName("gk.c")
    public int field3006 = 1000000;

    @ObfuscatedName("gk.h")
    public int[] field3007 = new int[16];

    @ObfuscatedName("gk.r")
    public int[] field3008 = new int[16];

    @ObfuscatedName("gk.a")
    public int[] field3009 = new int[16];

    @ObfuscatedName("gk.b")
    public int[] field3010 = new int[16];

    @ObfuscatedName("gk.u")
    public int[] field3023 = new int[16];

    @ObfuscatedName("gk.o")
    public int[] field3015 = new int[16];

    @ObfuscatedName("gk.p")
    public int[] field3013 = new int[16];

    @ObfuscatedName("gk.i")
    public int[] field3012 = new int[16];

    @ObfuscatedName("gk.q")
    public int[] field3004 = new int[16];

    @ObfuscatedName("gk.y")
    public int[] field3017 = new int[16];

    @ObfuscatedName("gk.m")
    public int[] field3018 = new int[16];

    @ObfuscatedName("gk.v")
    public int[] field3020 = new int[16];

    @ObfuscatedName("gk.k")
    public int[] field3019 = new int[16];

    @ObfuscatedName("gk.n")
    public int[] field3021 = new int[16];

    @ObfuscatedName("gk.d")
    public int[] field3022 = new int[16];

    @ObfuscatedName("gk.s")
    public class191[][] field3025 = new class191[16][128];

    @ObfuscatedName("gk.ah")
    public class191[][] field3014 = new class191[16][128];

    @ObfuscatedName("gk.ak")
    public class186 field3024 = new class186();

    @ObfuscatedName("gk.as")
    public boolean field3026;

    @ObfuscatedName("gk.ae")
    public int field3027;

    @ObfuscatedName("gk.ao")
    public int field3011;

    @ObfuscatedName("gk.av")
    public long field3029;

    @ObfuscatedName("gk.al")
    public long field3030;

    @ObfuscatedName("gk.ap")
    public class190 field3031 = new class190(this);

    public class188() {
        this.method3486();
    }

    @ObfuscatedName("gk.e(II)V")
    public synchronized void method3466(int arg0) {
        this.field3005 = arg0;
    }

    @ObfuscatedName("gk.l(B)I")
    public int method3488() {
        return this.field3005;
    }

    @ObfuscatedName("gk.c(Lgv;Lfe;Lbc;II)Z")
    public synchronized boolean method3468(class184 arg0, class171 arg1, class63 arg2, int arg3) {
        arg0.method3386();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class201 var7 = (class201) arg0.field2967.method3622(); var7 != null; var7 = (class201) arg0.field2967.method3623()) {
            int var8 = (int) var7.field3162;
            class185 var9 = (class185) this.field3028.method3619((long) var8);
            if (var9 == null) {
                var9 = class185.method3978(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field3028.method3620(var9, (long) var8);
            }
            if (!var9.method3395(arg2, var7.field3141, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3393();
        }
        return var5;
    }

    @ObfuscatedName("gk.h(I)V")
    public synchronized void method3469() {
        for (class185 var1 = (class185) this.field3028.method3622(); var1 != null; var1 = (class185) this.field3028.method3623()) {
            var1.method3396();
        }
    }

    @ObfuscatedName("gk.r(I)V")
    public synchronized void method3567() {
        for (class185 var1 = (class185) this.field3028.method3622(); var1 != null; var1 = (class185) this.field3028.method3623()) {
            var1.method3755();
        }
    }

    @ObfuscatedName("gk.p(Lgv;ZB)V")
    public synchronized void method3471(class184 arg0, boolean arg1) {
        this.method3472();
        this.field3024.method3448(arg0.field2968);
        this.field3026 = arg1;
        this.field3029 = 0L;
        int var3 = this.field3024.method3422();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3024.method3409(var4);
            this.field3024.method3411(var4);
            this.field3024.method3410(var4);
        }
        this.field3027 = this.field3024.method3416();
        this.field3011 = this.field3024.field2984[this.field3027];
        this.field3030 = this.field3024.method3415(this.field3011);
    }

    @ObfuscatedName("gk.q(I)V")
    public synchronized void method3472() {
        this.field3024.method3406();
        this.method3486();
    }

    @ObfuscatedName("gk.g(I)Z")
    public synchronized boolean method3473() {
        return this.field3024.method3403();
    }

    @ObfuscatedName("gk.j(IIB)V")
    public synchronized void method3474(int arg0, int arg1) {
        this.method3527(arg0, arg1);
    }

    @ObfuscatedName("gk.w(III)V")
    public void method3527(int arg0, int arg1) {
        this.field3010[arg0] = arg1;
        this.field3015[arg0] = arg1 & 0xFFFFFF80;
        this.method3528(arg0, arg1);
    }

    @ObfuscatedName("gk.x(IIB)V")
    public void method3528(int arg0, int arg1) {
        if (this.field3023[arg0] != arg1) {
            this.field3023[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field3014[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("gk.f(IIII)V")
    public void method3477(int arg0, int arg1, int arg2) {
        this.method3479(arg0, arg1, 64);
        if ((this.field3017[arg0] & 0x2) != 0) {
            for (class191 var4 = (class191) this.field3031.field3044.method3655(); var4 != null; var4 = (class191) this.field3031.field3044.method3648()) {
                if (var4.field3068 == arg0 && var4.field3064 < 0) {
                    this.field3025[arg0][var4.field3055] = null;
                    this.field3025[arg0][arg1] = var4;
                    int var5 = (var4.field3060 * var4.field3059 >> 12) + var4.field3058;
                    var4.field3058 += arg1 - var4.field3055 << 8;
                    var4.field3059 = var5 - var4.field3058;
                    var4.field3060 = 4096;
                    var4.field3055 = arg1;
                    return;
                }
            }
        }
        class185 var6 = (class185) this.field3028.method3619((long) this.field3023[arg0]);
        if (var6 == null) {
            return;
        }
        class66 var7 = var6.field2979[arg1];
        if (var7 == null) {
            return;
        }
        class191 var8 = new class191();
        var8.field3068 = arg0;
        var8.field3063 = var6;
        var8.field3051 = var7;
        var8.field3053 = var6.field2974[arg1];
        var8.field3072 = var6.field2975[arg1];
        var8.field3055 = arg1;
        var8.field3056 = var6.field2973 * arg2 * arg2 * var6.field2970[arg1] + 1024 >> 11;
        var8.field3057 = var6.field2976[arg1] & 0xFF;
        var8.field3058 = (arg1 << 8) - (var6.field2971[arg1] & 0x7FFF);
        var8.field3061 = 0;
        var8.field3067 = 0;
        var8.field3052 = 0;
        var8.field3064 = -1;
        var8.field3065 = 0;
        if (this.field3019[arg0] == 0) {
            var8.field3062 = class68.method1376(var7, this.method3491(var8), this.method3492(var8), this.method3554(var8));
        } else {
            var8.field3062 = class68.method1376(var7, this.method3491(var8), 0, this.method3554(var8));
            this.method3478(var8, var6.field2971[arg1] < 0);
        }
        if (var6.field2971[arg1] < 0) {
            var8.field3062.method1377(-1);
        }
        if (var8.field3072 >= 0) {
            class191 var9 = this.field3014[arg0][var8.field3072];
            if (var9 != null && var9.field3064 < 0) {
                this.field3025[arg0][var9.field3055] = null;
                var9.field3064 = 0;
            }
            this.field3014[arg0][var8.field3072] = var8;
        }
        this.field3031.field3044.method3650(var8);
        this.field3025[arg0][arg1] = var8;
    }

    @ObfuscatedName("gk.t(Lgi;ZB)V")
    public void method3478(class191 arg0, boolean arg1) {
        int var3 = arg0.field3051.field1305.length;
        int var5;
        if (arg1 && arg0.field3051.field1301) {
            int var4 = var3 + var3 - arg0.field3051.field1303;
            var5 = (int) ((long) this.field3019[arg0.field3068] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field3062.method1382(true);
            }
        } else {
            var5 = (int) ((long) this.field3019[arg0.field3068] * (long) var3 >> 6);
        }
        arg0.field3062.method1381(var5);
    }

    @ObfuscatedName("gk.z(IIIB)V")
    public void method3479(int arg0, int arg1, int arg2) {
        class191 var4 = this.field3025[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field3025[arg0][arg1] = null;
        if ((this.field3017[arg0] & 0x2) == 0) {
            var4.field3064 = 0;
            return;
        }
        for (class191 var5 = (class191) this.field3031.field3044.method3654(); var5 != null; var5 = (class191) this.field3031.field3044.method3673()) {
            if (var4.field3068 == var5.field3068 && var5.field3064 < 0 && var4 != var5) {
                var4.field3064 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("gk.y(IIII)V")
    public void method3480(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("gk.m(IIB)V")
    public void method3481(int arg0, int arg1) {
    }

    @ObfuscatedName("gk.v(III)V")
    public void method3482(int arg0, int arg1) {
        this.field3013[arg0] = arg1;
    }

    @ObfuscatedName("gk.k(II)V")
    public void method3520(int arg0) {
        for (class191 var2 = (class191) this.field3031.field3044.method3654(); var2 != null; var2 = (class191) this.field3031.field3044.method3673()) {
            if (arg0 < 0 || var2.field3068 == arg0) {
                if (var2.field3062 != null) {
                    var2.field3062.method1392(Statics.field1261 / 100);
                    if (var2.field3062.method1390()) {
                        this.field3031.field3048.method1209(var2.field3062);
                    }
                    var2.method3578();
                }
                if (var2.field3064 < 0) {
                    this.field3025[var2.field3068][var2.field3055] = null;
                }
                var2.method3755();
            }
        }
    }

    @ObfuscatedName("gk.n(II)V")
    public void method3561(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3561(var2);
            }
            return;
        }
        this.field3007[arg0] = 12800;
        this.field3008[arg0] = 8192;
        this.field3009[arg0] = 16383;
        this.field3013[arg0] = 8192;
        this.field3012[arg0] = 0;
        this.field3004[arg0] = 8192;
        this.method3467(arg0);
        this.method3493(arg0);
        this.field3017[arg0] = 0;
        this.field3018[arg0] = 32767;
        this.field3020[arg0] = 256;
        this.field3019[arg0] = 0;
        this.method3490(arg0, 8192);
    }

    @ObfuscatedName("gk.d(IB)V")
    public void method3485(int arg0) {
        for (class191 var2 = (class191) this.field3031.field3044.method3654(); var2 != null; var2 = (class191) this.field3031.field3044.method3673()) {
            if ((arg0 < 0 || var2.field3068 == arg0) && var2.field3064 < 0) {
                this.field3025[var2.field3068][var2.field3055] = null;
                var2.field3064 = 0;
            }
        }
    }

    @ObfuscatedName("gk.s(I)V")
    public void method3486() {
        this.method3520(-1);
        this.method3561(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field3023[var1] = this.field3010[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field3015[var2] = this.field3010[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("gk.ap(IB)V")
    public void method3467(int arg0) {
        if ((this.field3017[arg0] & 0x2) == 0) {
            return;
        }
        for (class191 var2 = (class191) this.field3031.field3044.method3654(); var2 != null; var2 = (class191) this.field3031.field3044.method3673()) {
            if (var2.field3068 == arg0 && this.field3025[arg0][var2.field3055] == null && var2.field3064 < 0) {
                var2.field3064 = 0;
            }
        }
    }

    @ObfuscatedName("gk.an(II)V")
    public void method3493(int arg0) {
        if ((this.field3017[arg0] & 0x4) == 0) {
            return;
        }
        for (class191 var2 = (class191) this.field3031.field3044.method3654(); var2 != null; var2 = (class191) this.field3031.field3044.method3673()) {
            if (var2.field3068 == arg0) {
                var2.field3070 = 0;
            }
        }
    }

    @ObfuscatedName("gk.aa(II)V")
    public void method3470(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3479(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3477(var6, var7, var8);
            } else {
                this.method3479(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3480(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field3015[var12] = (var14 << 14) + (this.field3015[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field3015[var12] = (var14 << 7) + (this.field3015[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field3012[var12] = (var14 << 7) + (this.field3012[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field3012[var12] = (this.field3012[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field3004[var12] = (var14 << 7) + (this.field3004[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field3004[var12] = (this.field3004[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field3007[var12] = (var14 << 7) + (this.field3007[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field3007[var12] = (this.field3007[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field3008[var12] = (var14 << 7) + (this.field3008[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field3008[var12] = (this.field3008[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field3009[var12] = (var14 << 7) + (this.field3009[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field3009[var12] = (this.field3009[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field3017[var12] |= 0x1;
                } else {
                    this.field3017[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field3017[var12] |= 0x2;
                } else {
                    this.method3467(var12);
                    this.field3017[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field3018[var12] = (var14 << 7) + (this.field3018[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field3018[var12] = (this.field3018[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field3018[var12] = (var14 << 7) + (this.field3018[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field3018[var12] = (this.field3018[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3520(var12);
            }
            if (var13 == 121) {
                this.method3561(var12);
            }
            if (var13 == 123) {
                this.method3485(var12);
            }
            if (var13 == 6) {
                int var15 = this.field3018[var12];
                if (var15 == 16384) {
                    this.field3020[var12] = (var14 << 7) + (this.field3020[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field3018[var12];
                if (var16 == 16384) {
                    this.field3020[var12] = (this.field3020[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field3019[var12] = (var14 << 7) + (this.field3019[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field3019[var12] = (this.field3019[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field3017[var12] |= 0x4;
                } else {
                    this.method3493(var12);
                    this.field3017[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3490(var12, (var14 << 7) + (this.field3021[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3490(var12, (this.field3021[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3528(var17, this.field3015[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3481(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method3482(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3486();
            }
        }
    }

    @ObfuscatedName("gk.ag(III)V")
    public void method3490(int arg0, int arg1) {
        this.field3021[arg0] = arg1;
        this.field3022[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("gk.aq(Lgi;I)I")
    public int method3491(class191 arg0) {
        int var2 = (arg0.field3060 * arg0.field3059 >> 12) + arg0.field3058;
        int var3 = ((this.field3013[arg0.field3068] - 8192) * this.field3020[arg0.field3068] >> 12) + var2;
        class189 var4 = arg0.field3053;
        if (var4.field3039 > 0 && (var4.field3038 > 0 || this.field3012[arg0.field3068] > 0)) {
            int var5 = var4.field3038 << 2;
            int var6 = var4.field3033 << 1;
            if (arg0.field3066 < var6) {
                var5 = arg0.field3066 * var5 / var6;
            }
            int var7 = (this.field3012[arg0.field3068] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field3050 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field3051.field1302 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1261 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("gk.af(Lgi;B)I")
    public int method3492(class191 arg0) {
        class189 var2 = arg0.field3053;
        int var3 = this.field3009[arg0.field3068] * this.field3007[arg0.field3068] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field3056 * var4 + 16384 >> 15;
        int var6 = this.field3005 * var5 + 128 >> 8;
        if (var2.field3040 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field3061 * 1.953125E-5D * (double) var2.field3040) + 0.5D);
        }
        if (var2.field3032 != null) {
            int var7 = arg0.field3067;
            int var8 = var2.field3032[arg0.field3052 + 1];
            if (arg0.field3052 < var2.field3032.length - 2) {
                int var9 = (var2.field3032[arg0.field3052] & 0xFF) << 8;
                int var10 = (var2.field3032[arg0.field3052 + 2] & 0xFF) << 8;
                var8 += (var2.field3032[arg0.field3052 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field3064 > 0 && var2.field3034 != null) {
            int var11 = arg0.field3064;
            int var12 = var2.field3034[arg0.field3065 + 1];
            if (arg0.field3065 < var2.field3034.length - 2) {
                int var13 = (var2.field3034[arg0.field3065] & 0xFF) << 8;
                int var14 = (var2.field3034[arg0.field3065 + 2] & 0xFF) << 8;
                var12 += (var2.field3034[arg0.field3065 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("gk.ax(Lgi;I)I")
    public int method3554(class191 arg0) {
        int var2 = this.field3008[arg0.field3068];
        return var2 < 8192 ? arg0.field3057 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field3057) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("gk.a()Lbj;")
    public synchronized class70 method1211() {
        return this.field3031;
    }

    @ObfuscatedName("gk.b()Lbj;")
    public synchronized class70 method1225() {
        return null;
    }

    @ObfuscatedName("gk.u()I")
    public synchronized int method1213() {
        return 0;
    }

    @ObfuscatedName("gk.o([III)V")
    public synchronized void method1214(int[] arg0, int arg1, int arg2) {
        if (this.field3024.method3403()) {
            int var4 = this.field3006 * this.field3024.field2980 / Statics.field1261;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field3029;
                if (this.field3030 - var5 >= 0L) {
                    this.field3029 = var5;
                    break;
                }
                int var7 = (int) ((this.field3030 - this.field3029 + (long) var4 - 1L) / (long) var4);
                this.field3029 += (long) var4 * (long) var7;
                this.field3031.method1214(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3495();
            } while (this.field3024.method3403());
        }
        this.field3031.method1214(arg0, arg1, arg2);
    }

    @ObfuscatedName("gk.i(I)V")
    public synchronized void method1217(int arg0) {
        if (this.field3024.method3403()) {
            int var2 = this.field3006 * this.field3024.field2980 / Statics.field1261;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field3029;
                if (this.field3030 - var3 >= 0L) {
                    this.field3029 = var3;
                    break;
                }
                int var5 = (int) ((this.field3030 - this.field3029 + (long) var2 - 1L) / (long) var2);
                this.field3029 += (long) var2 * (long) var5;
                this.field3031.method1217(var5);
                arg0 -= var5;
                this.method3495();
            } while (this.field3024.method3403());
        }
        this.field3031.method1217(arg0);
    }

    @ObfuscatedName("gk.ai(I)V")
    public void method3495() {
        int var1 = this.field3027;
        int var2 = this.field3011;
        long var3 = this.field3030;
        while (this.field3011 == var2) {
            while (this.field3024.field2984[var1] == var2) {
                this.field3024.method3409(var1);
                int var5 = this.field3024.method3412(var1);
                if (var5 == 1) {
                    this.field3024.method3405();
                    this.field3024.method3410(var1);
                    if (this.field3024.method3417()) {
                        if (!this.field3026 || var2 == 0) {
                            this.method3486();
                            this.field3024.method3406();
                            return;
                        }
                        this.field3024.method3418(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3470(var5);
                }
                this.field3024.method3411(var1);
                this.field3024.method3410(var1);
            }
            var1 = this.field3024.method3416();
            var2 = this.field3024.field2984[var1];
            var3 = this.field3024.method3415(var2);
        }
        this.field3027 = var1;
        this.field3011 = var2;
        this.field3030 = var3;
    }

    @ObfuscatedName("gk.ar(Lgi;I)Z")
    public boolean method3499(class191 arg0) {
        if (arg0.field3062 != null) {
            return false;
        }
        if (arg0.field3064 >= 0) {
            arg0.method3755();
            if (arg0.field3072 > 0 && this.field3014[arg0.field3068][arg0.field3072] == arg0) {
                this.field3014[arg0.field3068][arg0.field3072] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("gk.ab(Lgi;[IIII)Z")
    public boolean method3551(class191 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field3069 = Statics.field1261 / 100;
        if (arg0.field3064 >= 0 && arg0.field3062 == null || arg0.field3062.method1415()) {
            arg0.method3578();
            arg0.method3755();
            if (arg0.field3072 > 0 && this.field3014[arg0.field3068][arg0.field3072] == arg0) {
                this.field3014[arg0.field3068][arg0.field3072] = null;
            }
            return true;
        }
        int var5 = arg0.field3060;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field3004[arg0.field3068] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field3060 = var6;
        }
        arg0.field3062.method1387(this.method3491(arg0));
        class189 var7 = arg0.field3053;
        boolean var8 = false;
        arg0.field3066++;
        arg0.field3050 += var7.field3039;
        double var9 = (double) ((arg0.field3055 - 60 << 8) + (arg0.field3060 * arg0.field3059 >> 12)) * 5.086263020833333E-6D;
        if (var7.field3040 > 0) {
            if (var7.field3037 > 0) {
                arg0.field3061 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3037 * var9) + 0.5D);
            } else {
                arg0.field3061 += 128;
            }
        }
        if (var7.field3032 != null) {
            if (var7.field3035 > 0) {
                arg0.field3067 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3035 * var9) + 0.5D);
            } else {
                arg0.field3067 += 128;
            }
            while (arg0.field3052 < var7.field3032.length - 2 && arg0.field3067 > (var7.field3032[arg0.field3052 + 2] & 0xFF) << 8) {
                arg0.field3052 += 2;
            }
            if (arg0.field3052 == var7.field3032.length - 2 && var7.field3032[arg0.field3052 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field3064 >= 0 && var7.field3034 != null && (this.field3017[arg0.field3068] & 0x1) == 0 && (arg0.field3072 < 0 || this.field3014[arg0.field3068][arg0.field3072] != arg0)) {
            if (var7.field3036 > 0) {
                arg0.field3064 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3036 * var9) + 0.5D);
            } else {
                arg0.field3064 += 128;
            }
            while (arg0.field3065 < var7.field3034.length - 2 && arg0.field3064 > (var7.field3034[arg0.field3065 + 2] & 0xFF) << 8) {
                arg0.field3065 += 2;
            }
            if (arg0.field3065 == var7.field3034.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field3062.method1445(arg0.field3069, this.method3492(arg0), this.method3554(arg0));
            return false;
        }
        arg0.field3062.method1392(arg0.field3069);
        if (arg1 == null) {
            arg0.field3062.method1217(arg3);
        } else {
            arg0.field3062.method1214(arg1, arg2, arg3);
        }
        if (arg0.field3062.method1390()) {
            this.field3031.field3048.method1209(arg0.field3062);
        }
        arg0.method3578();
        if (arg0.field3064 >= 0) {
            arg0.method3755();
            if (arg0.field3072 > 0 && this.field3014[arg0.field3068][arg0.field3072] == arg0) {
                this.field3014[arg0.field3068][arg0.field3072] = null;
            }
        }
        return true;
    }
}
