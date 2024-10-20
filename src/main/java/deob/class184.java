package deob;

@ObfuscatedName("gf")
public class class184 extends class67 {

    @ObfuscatedName("gf.k")
    public class196 field2954 = new class196(128);

    @ObfuscatedName("gf.h")
    public int field2951 = 256;

    @ObfuscatedName("gf.o")
    public int field2964 = 1000000;

    @ObfuscatedName("gf.z")
    public int[] field2953 = new int[16];

    @ObfuscatedName("gf.c")
    public int[] field2958 = new int[16];

    @ObfuscatedName("gf.d")
    public int[] field2977 = new int[16];

    @ObfuscatedName("gf.l")
    public int[] field2956 = new int[16];

    @ObfuscatedName("gf.b")
    public int[] field2950 = new int[16];

    @ObfuscatedName("gf.j")
    public int[] field2963 = new int[16];

    @ObfuscatedName("gf.f")
    public int[] field2959 = new int[16];

    @ObfuscatedName("gf.i")
    public int[] field2960 = new int[16];

    @ObfuscatedName("gf.g")
    public int[] field2961 = new int[16];

    @ObfuscatedName("gf.y")
    public int[] field2957 = new int[16];

    @ObfuscatedName("gf.x")
    public int[] field2967 = new int[16];

    @ObfuscatedName("gf.n")
    public int[] field2972 = new int[16];

    @ObfuscatedName("gf.v")
    public int[] field2966 = new int[16];

    @ObfuscatedName("gf.s")
    public int[] field2968 = new int[16];

    @ObfuscatedName("gf.w")
    public int[] field2952 = new int[16];

    @ObfuscatedName("gf.p")
    public class187[][] field2969 = new class187[16][128];

    @ObfuscatedName("gf.ao")
    public class187[][] field2970 = new class187[16][128];

    @ObfuscatedName("gf.ae")
    public class182 field2971 = new class182();

    @ObfuscatedName("gf.ay")
    public boolean field2955;

    @ObfuscatedName("gf.ad")
    public int field2973;

    @ObfuscatedName("gf.as")
    public int field2974;

    @ObfuscatedName("gf.ag")
    public long field2975;

    @ObfuscatedName("gf.au")
    public long field2965;

    @ObfuscatedName("gf.ar")
    public class186 field2976 = new class186(this);

    public class184() {
        this.method3403();
    }

    @ObfuscatedName("gf.k(II)V")
    public synchronized void method3416(int arg0) {
        this.field2951 = arg0;
    }

    @ObfuscatedName("gf.h(S)I")
    public int method3386() {
        return this.field2951;
    }

    @ObfuscatedName("gf.o(Lfc;Lfo;Lbw;II)Z")
    public synchronized boolean method3387(class180 arg0, class167 arg1, class60 arg2, int arg3) {
        arg0.method3309();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class197 var7 = (class197) arg0.field2914.method3550(); var7 != null; var7 = (class197) arg0.field2914.method3551()) {
            int var8 = (int) var7.field3111;
            class181 var9 = (class181) this.field2954.method3559((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method3049(var8);
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
                this.field2954.method3560(var11, (long) var8);
            }
            if (!var9.method3317(arg2, var7.field3089, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3310();
        }
        return var5;
    }

    @ObfuscatedName("gf.z(B)V")
    public synchronized void method3432() {
        for (class181 var1 = (class181) this.field2954.method3550(); var1 != null; var1 = (class181) this.field2954.method3551()) {
            var1.method3319();
        }
    }

    @ObfuscatedName("gf.c(B)V")
    public synchronized void method3389() {
        for (class181 var1 = (class181) this.field2954.method3550(); var1 != null; var1 = (class181) this.field2954.method3551()) {
            var1.method3679();
        }
    }

    @ObfuscatedName("gf.f(Lfc;ZI)V")
    public synchronized void method3410(class180 arg0, boolean arg1) {
        this.method3465();
        this.field2971.method3346(arg0.field2913);
        this.field2955 = arg1;
        this.field2975 = 0L;
        int var3 = this.field2971.method3325();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2971.method3333(var4);
            this.field2971.method3329(var4);
            this.field2971.method3327(var4);
        }
        this.field2973 = this.field2971.method3334();
        this.field2974 = this.field2971.field2936[this.field2973];
        this.field2965 = this.field2971.method3363(this.field2974);
    }

    @ObfuscatedName("gf.g(I)V")
    public synchronized void method3465() {
        this.field2971.method3323();
        this.method3403();
    }

    @ObfuscatedName("gf.t(S)Z")
    public synchronized boolean method3391() {
        return this.field2971.method3321();
    }

    @ObfuscatedName("gf.e(III)V")
    public synchronized void method3445(int arg0, int arg1) {
        this.method3452(arg0, arg1);
    }

    @ObfuscatedName("gf.q(III)V")
    public void method3452(int arg0, int arg1) {
        this.field2956[arg0] = arg1;
        this.field2963[arg0] = arg1 & 0xFFFFFF80;
        this.method3394(arg0, arg1);
    }

    @ObfuscatedName("gf.u(III)V")
    public void method3394(int arg0, int arg1) {
        if (this.field2950[arg0] != arg1) {
            this.field2950[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2970[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("gf.r(IIIB)V")
    public void method3390(int arg0, int arg1, int arg2) {
        this.method3396(arg0, arg1, 64);
        if ((this.field2957[arg0] & 0x2) != 0) {
            for (class187 var4 = (class187) this.field2976.field2990.method3578(); var4 != null; var4 = (class187) this.field2976.field2990.method3584()) {
                if (var4.field3002 == arg0 && var4.field3013 < 0) {
                    this.field2969[arg0][var4.field3001] = null;
                    this.field2969[arg0][arg1] = var4;
                    int var5 = (var4.field3006 * var4.field3005 >> 12) + var4.field3008;
                    var4.field3008 += arg1 - var4.field3001 << 8;
                    var4.field3005 = var5 - var4.field3008;
                    var4.field3006 = 4096;
                    var4.field3001 = arg1;
                    return;
                }
            }
        }
        class181 var6 = (class181) this.field2954.method3559((long) this.field2950[arg0]);
        if (var6 == null) {
            return;
        }
        class63 var7 = var6.field2918[arg1];
        if (var7 == null) {
            return;
        }
        class187 var8 = new class187();
        var8.field3002 = arg0;
        var8.field2997 = var6;
        var8.field2998 = var7;
        var8.field3016 = var6.field2920[arg1];
        var8.field3000 = var6.field2921[arg1];
        var8.field3001 = arg1;
        var8.field3004 = var6.field2923 * arg2 * arg2 * var6.field2916[arg1] + 1024 >> 11;
        var8.field3003 = var6.field2919[arg1] & 0xFF;
        var8.field3008 = (arg1 << 8) - (var6.field2917[arg1] & 0x7FFF);
        var8.field3007 = 0;
        var8.field3011 = 0;
        var8.field3009 = 0;
        var8.field3013 = -1;
        var8.field3010 = 0;
        if (this.field2966[arg0] == 0) {
            var8.field3014 = class65.method1353(var7, this.method3407(var8), this.method3489(var8), this.method3409(var8));
        } else {
            var8.field3014 = class65.method1353(var7, this.method3407(var8), 0, this.method3409(var8));
            this.method3395(var8, var6.field2917[arg1] < 0);
        }
        if (var6.field2917[arg1] < 0) {
            var8.field3014.method1249(-1);
        }
        if (var8.field3000 >= 0) {
            class187 var9 = this.field2970[arg0][var8.field3000];
            if (var9 != null && var9.field3013 < 0) {
                this.field2969[arg0][var9.field3001] = null;
                var9.field3013 = 0;
            }
            this.field2970[arg0][var8.field3000] = var8;
        }
        this.field2976.field2990.method3588(var8);
        this.field2969[arg0][arg1] = var8;
    }

    @ObfuscatedName("gf.a(Lgk;ZI)V")
    public void method3395(class187 arg0, boolean arg1) {
        int var3 = arg0.field2998.field1210.length;
        int var5;
        if (arg1 && arg0.field2998.field1212) {
            int var4 = var3 + var3 - arg0.field2998.field1211;
            var5 = (int) ((long) this.field2966[arg0.field3002] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field3014.method1331(true);
            }
        } else {
            var5 = (int) ((long) this.field2966[arg0.field3002] * (long) var3 >> 6);
        }
        arg0.field3014.method1254(var5);
    }

    @ObfuscatedName("gf.m(IIII)V")
    public void method3396(int arg0, int arg1, int arg2) {
        class187 var4 = this.field2969[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2969[arg0][arg1] = null;
        if ((this.field2957[arg0] & 0x2) == 0) {
            var4.field3013 = 0;
            return;
        }
        for (class187 var5 = (class187) this.field2976.field2990.method3581(); var5 != null; var5 = (class187) this.field2976.field2990.method3583()) {
            if (var4.field3002 == var5.field3002 && var5.field3013 < 0 && var4 != var5) {
                var4.field3013 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("gf.y(IIII)V")
    public void method3397(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("gf.x(III)V")
    public void method3398(int arg0, int arg1) {
    }

    @ObfuscatedName("gf.n(IIB)V")
    public void method3393(int arg0, int arg1) {
        this.field2959[arg0] = arg1;
    }

    @ObfuscatedName("gf.v(II)V")
    public void method3400(int arg0) {
        for (class187 var2 = (class187) this.field2976.field2990.method3581(); var2 != null; var2 = (class187) this.field2976.field2990.method3583()) {
            if (arg0 < 0 || var2.field3002 == arg0) {
                if (var2.field3014 != null) {
                    var2.field3014.method1259(Statics.field2148 / 100);
                    if (var2.field3014.method1263()) {
                        this.field2976.field2995.method1084(var2.field3014);
                    }
                    var2.method3500();
                }
                if (var2.field3013 < 0) {
                    this.field2969[var2.field3002][var2.field3001] = null;
                }
                var2.method3679();
            }
        }
    }

    @ObfuscatedName("gf.s(II)V")
    public void method3401(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3401(var2);
            }
            return;
        }
        this.field2953[arg0] = 12800;
        this.field2958[arg0] = 8192;
        this.field2977[arg0] = 16383;
        this.field2959[arg0] = 8192;
        this.field2960[arg0] = 0;
        this.field2961[arg0] = 8192;
        this.method3404(arg0);
        this.method3455(arg0);
        this.field2957[arg0] = 0;
        this.field2967[arg0] = 32767;
        this.field2972[arg0] = 256;
        this.field2966[arg0] = 0;
        this.method3426(arg0, 8192);
    }

    @ObfuscatedName("gf.w(II)V")
    public void method3431(int arg0) {
        for (class187 var2 = (class187) this.field2976.field2990.method3581(); var2 != null; var2 = (class187) this.field2976.field2990.method3583()) {
            if ((arg0 < 0 || var2.field3002 == arg0) && var2.field3013 < 0) {
                this.field2969[var2.field3002][var2.field3001] = null;
                var2.field3013 = 0;
            }
        }
    }

    @ObfuscatedName("gf.al(I)V")
    public void method3403() {
        this.method3400(-1);
        this.method3401(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2950[var1] = this.field2956[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2963[var2] = this.field2956[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("gf.aq(IB)V")
    public void method3404(int arg0) {
        if ((this.field2957[arg0] & 0x2) == 0) {
            return;
        }
        for (class187 var2 = (class187) this.field2976.field2990.method3581(); var2 != null; var2 = (class187) this.field2976.field2990.method3583()) {
            if (var2.field3002 == arg0 && this.field2969[arg0][var2.field3001] == null && var2.field3013 < 0) {
                var2.field3013 = 0;
            }
        }
    }

    @ObfuscatedName("gf.aa(IS)V")
    public void method3455(int arg0) {
        if ((this.field2957[arg0] & 0x4) == 0) {
            return;
        }
        for (class187 var2 = (class187) this.field2976.field2990.method3581(); var2 != null; var2 = (class187) this.field2976.field2990.method3583()) {
            if (var2.field3002 == arg0) {
                var2.field2996 = 0;
            }
        }
    }

    @ObfuscatedName("gf.af(IB)V")
    public void method3405(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3396(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3390(var6, var7, var8);
            } else {
                this.method3396(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3397(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2963[var12] = (var14 << 14) + (this.field2963[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2963[var12] = (var14 << 7) + (this.field2963[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2960[var12] = (var14 << 7) + (this.field2960[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2960[var12] = (this.field2960[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2961[var12] = (var14 << 7) + (this.field2961[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2961[var12] = (this.field2961[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2953[var12] = (var14 << 7) + (this.field2953[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2953[var12] = (this.field2953[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2958[var12] = (var14 << 7) + (this.field2958[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2958[var12] = (this.field2958[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2977[var12] = (var14 << 7) + (this.field2977[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2977[var12] = (this.field2977[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2957[var12] |= 0x1;
                } else {
                    this.field2957[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2957[var12] |= 0x2;
                } else {
                    this.method3404(var12);
                    this.field2957[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2967[var12] = (var14 << 7) + (this.field2967[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2967[var12] = (this.field2967[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2967[var12] = (var14 << 7) + (this.field2967[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2967[var12] = (this.field2967[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3400(var12);
            }
            if (var13 == 121) {
                this.method3401(var12);
            }
            if (var13 == 123) {
                this.method3431(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2967[var12];
                if (var15 == 16384) {
                    this.field2972[var12] = (var14 << 7) + (this.field2972[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2967[var12];
                if (var16 == 16384) {
                    this.field2972[var12] = (this.field2972[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2966[var12] = (var14 << 7) + (this.field2966[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2966[var12] = (this.field2966[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2957[var12] |= 0x4;
                } else {
                    this.method3455(var12);
                    this.field2957[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3426(var12, (var14 << 7) + (this.field2968[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3426(var12, (this.field2968[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3394(var17, this.field2963[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3398(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method3393(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3403();
            }
        }
    }

    @ObfuscatedName("gf.ai(IIB)V")
    public void method3426(int arg0, int arg1) {
        this.field2968[arg0] = arg1;
        this.field2952[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("gf.ak(Lgk;I)I")
    public int method3407(class187 arg0) {
        int var2 = (arg0.field3006 * arg0.field3005 >> 12) + arg0.field3008;
        int var3 = ((this.field2959[arg0.field3002] - 8192) * this.field2972[arg0.field3002] >> 12) + var2;
        class185 var4 = arg0.field3016;
        if (var4.field2987 > 0 && (var4.field2985 > 0 || this.field2960[arg0.field3002] > 0)) {
            int var5 = var4.field2985 << 2;
            int var6 = var4.field2981 << 1;
            if (arg0.field3012 < var6) {
                var5 = arg0.field3012 * var5 / var6;
            }
            int var7 = (this.field2960[arg0.field3002] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field3018 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2998.field1209 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field2148 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("gf.aj(Lgk;I)I")
    public int method3489(class187 arg0) {
        class185 var2 = arg0.field3016;
        int var3 = this.field2977[arg0.field3002] * this.field2953[arg0.field3002] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field3004 * var4 + 16384 >> 15;
        int var6 = this.field2951 * var5 + 128 >> 8;
        if (var2.field2980 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field3007 * 1.953125E-5D * (double) var2.field2980) + 0.5D);
        }
        if (var2.field2982 != null) {
            int var7 = arg0.field3011;
            int var8 = var2.field2982[arg0.field3009 + 1];
            if (arg0.field3009 < var2.field2982.length - 2) {
                int var9 = (var2.field2982[arg0.field3009] & 0xFF) << 8;
                int var10 = (var2.field2982[arg0.field3009 + 2] & 0xFF) << 8;
                var8 += (var2.field2982[arg0.field3009 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field3013 > 0 && var2.field2979 != null) {
            int var11 = arg0.field3013;
            int var12 = var2.field2979[arg0.field3010 + 1];
            if (arg0.field3010 < var2.field2979.length - 2) {
                int var13 = (var2.field2979[arg0.field3010] & 0xFF) << 8;
                int var14 = (var2.field2979[arg0.field3010 + 2] & 0xFF) << 8;
                var12 += (var2.field2979[arg0.field3010 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("gf.ac(Lgk;I)I")
    public int method3409(class187 arg0) {
        int var2 = this.field2958[arg0.field3002];
        return var2 < 8192 ? arg0.field3003 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field3003) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("gf.d()Lbk;")
    public synchronized class67 method1089() {
        return this.field2976;
    }

    @ObfuscatedName("gf.l()Lbk;")
    public synchronized class67 method1090() {
        return null;
    }

    @ObfuscatedName("gf.b()I")
    public synchronized int method1108() {
        return 0;
    }

    @ObfuscatedName("gf.j([III)V")
    public synchronized void method1086(int[] arg0, int arg1, int arg2) {
        if (this.field2971.method3321()) {
            int var4 = this.field2964 * this.field2971.field2928 / Statics.field2148;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2975;
                if (this.field2965 - var5 >= 0L) {
                    this.field2975 = var5;
                    break;
                }
                int var7 = (int) ((this.field2965 - this.field2975 + (long) var4 - 1L) / (long) var4);
                this.field2975 += (long) var4 * (long) var7;
                this.field2976.method1086(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3412();
            } while (this.field2971.method3321());
        }
        this.field2976.method1086(arg0, arg1, arg2);
    }

    @ObfuscatedName("gf.i(I)V")
    public synchronized void method1094(int arg0) {
        if (this.field2971.method3321()) {
            int var2 = this.field2964 * this.field2971.field2928 / Statics.field2148;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2975;
                if (this.field2965 - var3 >= 0L) {
                    this.field2975 = var3;
                    break;
                }
                int var5 = (int) ((this.field2965 - this.field2975 + (long) var2 - 1L) / (long) var2);
                this.field2975 += (long) var2 * (long) var5;
                this.field2976.method1094(var5);
                arg0 -= var5;
                this.method3412();
            } while (this.field2971.method3321());
        }
        this.field2976.method1094(arg0);
    }

    @ObfuscatedName("gf.am(I)V")
    public void method3412() {
        int var1 = this.field2973;
        int var2 = this.field2974;
        long var3 = this.field2965;
        while (this.field2974 == var2) {
            while (this.field2971.field2936[var1] == var2) {
                this.field2971.method3333(var1);
                int var5 = this.field2971.method3360(var1);
                if (var5 == 1) {
                    this.field2971.method3328();
                    this.field2971.method3327(var1);
                    if (this.field2971.method3335()) {
                        if (!this.field2955 || var2 == 0) {
                            this.method3403();
                            this.field2971.method3323();
                            return;
                        }
                        this.field2971.method3336(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3405(var5);
                }
                this.field2971.method3329(var1);
                this.field2971.method3327(var1);
            }
            var1 = this.field2971.method3334();
            var2 = this.field2971.field2936[var1];
            var3 = this.field2971.method3363(var2);
        }
        this.field2973 = var1;
        this.field2974 = var2;
        this.field2965 = var3;
    }

    @ObfuscatedName("gf.an(Lgk;I)Z")
    public boolean method3473(class187 arg0) {
        if (arg0.field3014 != null) {
            return false;
        }
        if (arg0.field3013 >= 0) {
            arg0.method3679();
            if (arg0.field3000 > 0 && this.field2970[arg0.field3002][arg0.field3000] == arg0) {
                this.field2970[arg0.field3002][arg0.field3000] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("gf.ba(Lgk;[IIII)Z")
    public boolean method3414(class187 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field3015 = Statics.field2148 / 100;
        if (arg0.field3013 >= 0 && arg0.field3014 == null || arg0.field3014.method1262()) {
            arg0.method3500();
            arg0.method3679();
            if (arg0.field3000 > 0 && this.field2970[arg0.field3002][arg0.field3000] == arg0) {
                this.field2970[arg0.field3002][arg0.field3000] = null;
            }
            return true;
        }
        int var5 = arg0.field3006;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2961[arg0.field3002] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field3006 = var6;
        }
        arg0.field3014.method1260(this.method3407(arg0));
        class185 var7 = arg0.field3016;
        boolean var8 = false;
        arg0.field3012++;
        arg0.field3018 += var7.field2987;
        double var9 = (double) ((arg0.field3001 - 60 << 8) + (arg0.field3006 * arg0.field3005 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2980 > 0) {
            if (var7.field2984 > 0) {
                arg0.field3007 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2984 * var9) + 0.5D);
            } else {
                arg0.field3007 += 128;
            }
        }
        if (var7.field2982 != null) {
            if (var7.field2988 > 0) {
                arg0.field3011 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2988 * var9) + 0.5D);
            } else {
                arg0.field3011 += 128;
            }
            while (arg0.field3009 < var7.field2982.length - 2 && arg0.field3011 > (var7.field2982[arg0.field3009 + 2] & 0xFF) << 8) {
                arg0.field3009 += 2;
            }
            if (arg0.field3009 == var7.field2982.length - 2 && var7.field2982[arg0.field3009 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field3013 >= 0 && var7.field2979 != null && (this.field2957[arg0.field3002] & 0x1) == 0 && (arg0.field3000 < 0 || this.field2970[arg0.field3002][arg0.field3000] != arg0)) {
            if (var7.field2983 > 0) {
                arg0.field3013 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2983 * var9) + 0.5D);
            } else {
                arg0.field3013 += 128;
            }
            while (arg0.field3010 < var7.field2979.length - 2 && arg0.field3013 > (var7.field2979[arg0.field3010 + 2] & 0xFF) << 8) {
                arg0.field3010 += 2;
            }
            if (arg0.field3010 == var7.field2979.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field3014.method1286(arg0.field3015, this.method3489(arg0), this.method3409(arg0));
            return false;
        }
        arg0.field3014.method1259(arg0.field3015);
        if (arg1 == null) {
            arg0.field3014.method1094(arg3);
        } else {
            arg0.field3014.method1086(arg1, arg2, arg3);
        }
        if (arg0.field3014.method1263()) {
            this.field2976.field2995.method1084(arg0.field3014);
        }
        arg0.method3500();
        if (arg0.field3013 >= 0) {
            arg0.method3679();
            if (arg0.field3000 > 0 && this.field2970[arg0.field3002][arg0.field3000] == arg0) {
                this.field2970[arg0.field3002][arg0.field3000] = null;
            }
        }
        return true;
    }
}
