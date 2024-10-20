package deob;

@ObfuscatedName("gv")
public class class184 extends class67 {

    @ObfuscatedName("gv.j")
    public class196 field2963 = new class196(128);

    @ObfuscatedName("gv.m")
    public int field2948 = 256;

    @ObfuscatedName("gv.f")
    public int field2949 = 1000000;

    @ObfuscatedName("gv.l")
    public int[] field2950 = new int[16];

    @ObfuscatedName("gv.u")
    public int[] field2951 = new int[16];

    @ObfuscatedName("gv.a")
    public int[] field2952 = new int[16];

    @ObfuscatedName("gv.h")
    public int[] field2953 = new int[16];

    @ObfuscatedName("gv.i")
    public int[] field2954 = new int[16];

    @ObfuscatedName("gv.t")
    public int[] field2955 = new int[16];

    @ObfuscatedName("gv.k")
    public int[] field2971 = new int[16];

    @ObfuscatedName("gv.s")
    public int[] field2956 = new int[16];

    @ObfuscatedName("gv.e")
    public int[] field2958 = new int[16];

    @ObfuscatedName("gv.v")
    public int[] field2960 = new int[16];

    @ObfuscatedName("gv.q")
    public int[] field2957 = new int[16];

    @ObfuscatedName("gv.x")
    public int[] field2973 = new int[16];

    @ObfuscatedName("gv.d")
    public int[] field2947 = new int[16];

    @ObfuscatedName("gv.o")
    public int[] field2961 = new int[16];

    @ObfuscatedName("gv.c")
    public int[] field2965 = new int[16];

    @ObfuscatedName("gv.b")
    public class187[][] field2966 = new class187[16][128];

    @ObfuscatedName("gv.aa")
    public class187[][] field2967 = new class187[16][128];

    @ObfuscatedName("gv.ao")
    public class182 field2964 = new class182();

    @ObfuscatedName("gv.as")
    public boolean field2969;

    @ObfuscatedName("gv.ae")
    public int field2970;

    @ObfuscatedName("gv.ai")
    public int field2968;

    @ObfuscatedName("gv.am")
    public long field2972;

    @ObfuscatedName("gv.ax")
    public long field2962;

    @ObfuscatedName("gv.ay")
    public class186 field2974 = new class186(this);

    public class184() {
        this.method3427();
    }

    @ObfuscatedName("gv.j(II)V")
    public synchronized void method3415(int arg0) {
        this.field2948 = arg0;
    }

    @ObfuscatedName("gv.m(I)I")
    public int method3416() {
        return this.field2948;
    }

    @ObfuscatedName("gv.f(Lfz;Lfa;Lbi;IB)Z")
    public synchronized boolean method3417(class180 arg0, class167 arg1, class60 arg2, int arg3) {
        arg0.method3331();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class197 var7 = (class197) arg0.field2910.method3570(); var7 != null; var7 = (class197) arg0.field2910.method3575()) {
            int var8 = (int) var7.field3105;
            class181 var9 = (class181) this.field2963.method3571((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method3110(var8);
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
                this.field2963.method3574(var11, (long) var8);
            }
            if (!var9.method3346(arg2, var7.field3083, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3332();
        }
        return var5;
    }

    @ObfuscatedName("gv.l(I)V")
    public synchronized void method3493() {
        for (class181 var1 = (class181) this.field2963.method3570(); var1 != null; var1 = (class181) this.field2963.method3575()) {
            var1.method3343();
        }
    }

    @ObfuscatedName("gv.u(I)V")
    public synchronized void method3419() {
        for (class181 var1 = (class181) this.field2963.method3570(); var1 != null; var1 = (class181) this.field2963.method3575()) {
            var1.method3700();
        }
    }

    @ObfuscatedName("gv.k(Lfz;ZI)V")
    public synchronized void method3420(class180 arg0, boolean arg1) {
        this.method3421();
        this.field2964.method3352(arg0.field2911);
        this.field2969 = arg1;
        this.field2972 = 0L;
        int var3 = this.field2964.method3383();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2964.method3356(var4);
            this.field2964.method3359(var4);
            this.field2964.method3357(var4);
        }
        this.field2970 = this.field2964.method3362();
        this.field2968 = this.field2964.field2929[this.field2970];
        this.field2962 = this.field2964.method3363(this.field2968);
    }

    @ObfuscatedName("gv.w(S)V")
    public synchronized void method3421() {
        this.field2964.method3353();
        this.method3427();
    }

    @ObfuscatedName("gv.e(I)Z")
    public synchronized boolean method3422() {
        return this.field2964.method3364();
    }

    @ObfuscatedName("gv.z(III)V")
    public synchronized void method3423(int arg0, int arg1) {
        this.method3424(arg0, arg1);
    }

    @ObfuscatedName("gv.p(IIB)V")
    public void method3424(int arg0, int arg1) {
        this.field2953[arg0] = arg1;
        this.field2955[arg0] = arg1 & 0xFFFFFF80;
        this.method3425(arg0, arg1);
    }

    @ObfuscatedName("gv.r(III)V")
    public void method3425(int arg0, int arg1) {
        if (this.field2954[arg0] != arg1) {
            this.field2954[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2967[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("gv.g(IIII)V")
    public void method3426(int arg0, int arg1, int arg2) {
        this.method3510(arg0, arg1, 64);
        if ((this.field2960[arg0] & 0x2) != 0) {
            for (class187 var4 = (class187) this.field2974.field2987.method3619(); var4 != null; var4 = (class187) this.field2974.field2987.method3609()) {
                if (var4.field3007 == arg0 && var4.field3006 < 0) {
                    this.field2966[arg0][var4.field2997] = null;
                    this.field2966[arg0][arg1] = var4;
                    int var5 = (var4.field3002 * var4.field3001 >> 12) + var4.field3015;
                    var4.field3015 += arg1 - var4.field2997 << 8;
                    var4.field3001 = var5 - var4.field3015;
                    var4.field3002 = 4096;
                    var4.field2997 = arg1;
                    return;
                }
            }
        }
        class181 var6 = (class181) this.field2963.method3571((long) this.field2954[arg0]);
        if (var6 == null) {
            return;
        }
        class63 var7 = var6.field2912[arg1];
        if (var7 == null) {
            return;
        }
        class187 var8 = new class187();
        var8.field3007 = arg0;
        var8.field2993 = var6;
        var8.field2999 = var7;
        var8.field2995 = var6.field2917[arg1];
        var8.field2996 = var6.field2913[arg1];
        var8.field2997 = arg1;
        var8.field2994 = var6.field2914 * arg2 * arg2 * var6.field2920[arg1] + 1024 >> 11;
        var8.field3013 = var6.field2916[arg1] & 0xFF;
        var8.field3015 = (arg1 << 8) - (var6.field2915[arg1] & 0x7FFF);
        var8.field2992 = 0;
        var8.field3004 = 0;
        var8.field3005 = 0;
        var8.field3006 = -1;
        var8.field3008 = 0;
        if (this.field2947[arg0] == 0) {
            var8.field3010 = class65.method1352(var7, this.method3440(var8), this.method3441(var8), this.method3442(var8));
        } else {
            var8.field3010 = class65.method1352(var7, this.method3440(var8), 0, this.method3442(var8));
            this.method3485(var8, var6.field2915[arg1] < 0);
        }
        if (var6.field2915[arg1] < 0) {
            var8.field3010.method1290(-1);
        }
        if (var8.field2996 >= 0) {
            class187 var9 = this.field2967[arg0][var8.field2996];
            if (var9 != null && var9.field3006 < 0) {
                this.field2966[arg0][var9.field2997] = null;
                var9.field3006 = 0;
            }
            this.field2967[arg0][var8.field2996] = var8;
        }
        this.field2974.field2987.method3603(var8);
        this.field2966[arg0][arg1] = var8;
    }

    @ObfuscatedName("gv.n(Lgb;ZI)V")
    public void method3485(class187 arg0, boolean arg1) {
        int var3 = arg0.field2999.field1220.length;
        int var5;
        if (arg1 && arg0.field2999.field1223) {
            int var4 = var3 + var3 - arg0.field2999.field1221;
            var5 = (int) ((long) this.field2947[arg0.field3007] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field3010.method1358(true);
            }
        } else {
            var5 = (int) ((long) this.field2947[arg0.field3007] * (long) var3 >> 6);
        }
        arg0.field3010.method1282(var5);
    }

    @ObfuscatedName("gv.y(IIII)V")
    public void method3510(int arg0, int arg1, int arg2) {
        class187 var4 = this.field2966[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2966[arg0][arg1] = null;
        if ((this.field2960[arg0] & 0x2) == 0) {
            var4.field3006 = 0;
            return;
        }
        for (class187 var5 = (class187) this.field2974.field2987.method3606(); var5 != null; var5 = (class187) this.field2974.field2987.method3608()) {
            if (var4.field3007 == var5.field3007 && var5.field3006 < 0 && var4 != var5) {
                var4.field3006 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("gv.v(IIII)V")
    public void method3429(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("gv.q(III)V")
    public void method3492(int arg0, int arg1) {
    }

    @ObfuscatedName("gv.x(III)V")
    public void method3449(int arg0, int arg1) {
        this.field2971[arg0] = arg1;
    }

    @ObfuscatedName("gv.d(II)V")
    public void method3452(int arg0) {
        for (class187 var2 = (class187) this.field2974.field2987.method3606(); var2 != null; var2 = (class187) this.field2974.field2987.method3608()) {
            if (arg0 < 0 || var2.field3007 == arg0) {
                if (var2.field3010 != null) {
                    var2.field3010.method1333(Statics.field1184 / 100);
                    if (var2.field3010.method1305()) {
                        this.field2974.field2988.method1166(var2.field3010);
                    }
                    var2.method3524();
                }
                if (var2.field3006 < 0) {
                    this.field2966[var2.field3007][var2.field2997] = null;
                }
                var2.method3700();
            }
        }
    }

    @ObfuscatedName("gv.o(II)V")
    public void method3433(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3433(var2);
            }
            return;
        }
        this.field2950[arg0] = 12800;
        this.field2951[arg0] = 8192;
        this.field2952[arg0] = 16383;
        this.field2971[arg0] = 8192;
        this.field2956[arg0] = 0;
        this.field2958[arg0] = 8192;
        this.method3436(arg0);
        this.method3437(arg0);
        this.field2960[arg0] = 0;
        this.field2957[arg0] = 32767;
        this.field2973[arg0] = 256;
        this.field2947[arg0] = 0;
        this.method3439(arg0, 8192);
    }

    @ObfuscatedName("gv.c(II)V")
    public void method3491(int arg0) {
        for (class187 var2 = (class187) this.field2974.field2987.method3606(); var2 != null; var2 = (class187) this.field2974.field2987.method3608()) {
            if ((arg0 < 0 || var2.field3007 == arg0) && var2.field3006 < 0) {
                this.field2966[var2.field3007][var2.field2997] = null;
                var2.field3006 = 0;
            }
        }
    }

    @ObfuscatedName("gv.ay(I)V")
    public void method3427() {
        this.method3452(-1);
        this.method3433(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2954[var1] = this.field2953[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2955[var2] = this.field2953[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("gv.az(II)V")
    public void method3436(int arg0) {
        if ((this.field2960[arg0] & 0x2) == 0) {
            return;
        }
        for (class187 var2 = (class187) this.field2974.field2987.method3606(); var2 != null; var2 = (class187) this.field2974.field2987.method3608()) {
            if (var2.field3007 == arg0 && this.field2966[arg0][var2.field2997] == null && var2.field3006 < 0) {
                var2.field3006 = 0;
            }
        }
    }

    @ObfuscatedName("gv.av(II)V")
    public void method3437(int arg0) {
        if ((this.field2960[arg0] & 0x4) == 0) {
            return;
        }
        for (class187 var2 = (class187) this.field2974.field2987.method3606(); var2 != null; var2 = (class187) this.field2974.field2987.method3608()) {
            if (var2.field3007 == arg0) {
                var2.field3012 = 0;
            }
        }
    }

    @ObfuscatedName("gv.at(II)V")
    public void method3428(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3510(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3426(var6, var7, var8);
            } else {
                this.method3510(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3429(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2955[var12] = (var14 << 14) + (this.field2955[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2955[var12] = (var14 << 7) + (this.field2955[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2956[var12] = (var14 << 7) + (this.field2956[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2956[var12] = (this.field2956[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2958[var12] = (var14 << 7) + (this.field2958[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2958[var12] = (this.field2958[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2950[var12] = (var14 << 7) + (this.field2950[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2950[var12] = (this.field2950[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2951[var12] = (var14 << 7) + (this.field2951[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2951[var12] = (this.field2951[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2952[var12] = (var14 << 7) + (this.field2952[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2952[var12] = (this.field2952[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2960[var12] |= 0x1;
                } else {
                    this.field2960[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2960[var12] |= 0x2;
                } else {
                    this.method3436(var12);
                    this.field2960[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2957[var12] = (var14 << 7) + (this.field2957[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2957[var12] = (this.field2957[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2957[var12] = (var14 << 7) + (this.field2957[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2957[var12] = (this.field2957[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3452(var12);
            }
            if (var13 == 121) {
                this.method3433(var12);
            }
            if (var13 == 123) {
                this.method3491(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2957[var12];
                if (var15 == 16384) {
                    this.field2973[var12] = (var14 << 7) + (this.field2973[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2957[var12];
                if (var16 == 16384) {
                    this.field2973[var12] = (this.field2973[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2947[var12] = (var14 << 7) + (this.field2947[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2947[var12] = (this.field2947[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2960[var12] |= 0x4;
                } else {
                    this.method3437(var12);
                    this.field2960[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3439(var12, (var14 << 7) + (this.field2961[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3439(var12, (this.field2961[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3425(var17, this.field2955[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3492(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method3449(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3427();
            }
        }
    }

    @ObfuscatedName("gv.al(IIB)V")
    public void method3439(int arg0, int arg1) {
        this.field2961[arg0] = arg1;
        this.field2965[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("gv.ac(Lgb;B)I")
    public int method3440(class187 arg0) {
        int var2 = (arg0.field3002 * arg0.field3001 >> 12) + arg0.field3015;
        int var3 = ((this.field2971[arg0.field3007] - 8192) * this.field2973[arg0.field3007] >> 12) + var2;
        class185 var4 = arg0.field2995;
        if (var4.field2975 > 0 && (var4.field2978 > 0 || this.field2956[arg0.field3007] > 0)) {
            int var5 = var4.field2978 << 2;
            int var6 = var4.field2983 << 1;
            if (arg0.field3003 < var6) {
                var5 = arg0.field3003 * var5 / var6;
            }
            int var7 = (this.field2956[arg0.field3007] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field3009 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2999.field1222 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1184 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("gv.ar(Lgb;S)I")
    public int method3441(class187 arg0) {
        class185 var2 = arg0.field2995;
        int var3 = this.field2952[arg0.field3007] * this.field2950[arg0.field3007] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2994 * var4 + 16384 >> 15;
        int var6 = this.field2948 * var5 + 128 >> 8;
        if (var2.field2977 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2992 * 1.953125E-5D * (double) var2.field2977) + 0.5D);
        }
        if (var2.field2982 != null) {
            int var7 = arg0.field3004;
            int var8 = var2.field2982[arg0.field3005 + 1];
            if (arg0.field3005 < var2.field2982.length - 2) {
                int var9 = (var2.field2982[arg0.field3005] & 0xFF) << 8;
                int var10 = (var2.field2982[arg0.field3005 + 2] & 0xFF) << 8;
                var8 += (var2.field2982[arg0.field3005 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field3006 > 0 && var2.field2976 != null) {
            int var11 = arg0.field3006;
            int var12 = var2.field2976[arg0.field3008 + 1];
            if (arg0.field3008 < var2.field2976.length - 2) {
                int var13 = (var2.field2976[arg0.field3008] & 0xFF) << 8;
                int var14 = (var2.field2976[arg0.field3008 + 2] & 0xFF) << 8;
                var12 += (var2.field2976[arg0.field3008 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("gv.ak(Lgb;I)I")
    public int method3442(class187 arg0) {
        int var2 = this.field2951[arg0.field3007];
        return var2 < 8192 ? arg0.field3013 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field3013) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("gv.a()Lbp;")
    public synchronized class67 method1147() {
        return this.field2974;
    }

    @ObfuscatedName("gv.h()Lbp;")
    public synchronized class67 method1148() {
        return null;
    }

    @ObfuscatedName("gv.i()I")
    public synchronized int method1149() {
        return 0;
    }

    @ObfuscatedName("gv.t([III)V")
    public synchronized void method1150(int[] arg0, int arg1, int arg2) {
        if (this.field2964.method3364()) {
            int var4 = this.field2949 * this.field2964.field2927 / Statics.field1184;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2972;
                if (this.field2962 - var5 >= 0L) {
                    this.field2972 = var5;
                    break;
                }
                int var7 = (int) ((this.field2962 - this.field2972 + (long) var4 - 1L) / (long) var4);
                this.field2972 += (long) var4 * (long) var7;
                this.field2974.method1150(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3444();
            } while (this.field2964.method3364());
        }
        this.field2974.method1150(arg0, arg1, arg2);
    }

    @ObfuscatedName("gv.s(I)V")
    public synchronized void method1142(int arg0) {
        if (this.field2964.method3364()) {
            int var2 = this.field2949 * this.field2964.field2927 / Statics.field1184;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2972;
                if (this.field2962 - var3 >= 0L) {
                    this.field2972 = var3;
                    break;
                }
                int var5 = (int) ((this.field2962 - this.field2972 + (long) var2 - 1L) / (long) var2);
                this.field2972 += (long) var2 * (long) var5;
                this.field2974.method1142(var5);
                arg0 -= var5;
                this.method3444();
            } while (this.field2964.method3364());
        }
        this.field2974.method1142(arg0);
    }

    @ObfuscatedName("gv.ag(B)V")
    public void method3444() {
        int var1 = this.field2970;
        int var2 = this.field2968;
        long var3 = this.field2962;
        while (this.field2968 == var2) {
            while (this.field2964.field2929[var1] == var2) {
                this.field2964.method3356(var1);
                int var5 = this.field2964.method3382(var1);
                if (var5 == 1) {
                    this.field2964.method3358();
                    this.field2964.method3357(var1);
                    if (this.field2964.method3396()) {
                        if (!this.field2969 || var2 == 0) {
                            this.method3427();
                            this.field2964.method3353();
                            return;
                        }
                        this.field2964.method3366(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3428(var5);
                }
                this.field2964.method3359(var1);
                this.field2964.method3357(var1);
            }
            var1 = this.field2964.method3362();
            var2 = this.field2964.field2929[var1];
            var3 = this.field2964.method3363(var2);
        }
        this.field2970 = var1;
        this.field2968 = var2;
        this.field2962 = var3;
    }

    @ObfuscatedName("gv.aq(Lgb;I)Z")
    public boolean method3445(class187 arg0) {
        if (arg0.field3010 != null) {
            return false;
        }
        if (arg0.field3006 >= 0) {
            arg0.method3700();
            if (arg0.field2996 > 0 && this.field2967[arg0.field3007][arg0.field2996] == arg0) {
                this.field2967[arg0.field3007][arg0.field2996] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("gv.au(Lgb;[IIII)Z")
    public boolean method3507(class187 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field3000 = Statics.field1184 / 100;
        if (arg0.field3006 >= 0 && arg0.field3010 == null || arg0.field3010.method1287()) {
            arg0.method3524();
            arg0.method3700();
            if (arg0.field2996 > 0 && this.field2967[arg0.field3007][arg0.field2996] == arg0) {
                this.field2967[arg0.field3007][arg0.field2996] = null;
            }
            return true;
        }
        int var5 = arg0.field3002;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2958[arg0.field3007] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field3002 = var6;
        }
        arg0.field3010.method1302(this.method3440(arg0));
        class185 var7 = arg0.field2995;
        boolean var8 = false;
        arg0.field3003++;
        arg0.field3009 += var7.field2975;
        double var9 = (double) ((arg0.field2997 - 60 << 8) + (arg0.field3002 * arg0.field3001 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2977 > 0) {
            if (var7.field2980 > 0) {
                arg0.field2992 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2980 * var9) + 0.5D);
            } else {
                arg0.field2992 += 128;
            }
        }
        if (var7.field2982 != null) {
            if (var7.field2985 > 0) {
                arg0.field3004 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2985 * var9) + 0.5D);
            } else {
                arg0.field3004 += 128;
            }
            while (arg0.field3005 < var7.field2982.length - 2 && arg0.field3004 > (var7.field2982[arg0.field3005 + 2] & 0xFF) << 8) {
                arg0.field3005 += 2;
            }
            if (arg0.field3005 == var7.field2982.length - 2 && var7.field2982[arg0.field3005 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field3006 >= 0 && var7.field2976 != null && (this.field2960[arg0.field3007] & 0x1) == 0 && (arg0.field2996 < 0 || this.field2967[arg0.field3007][arg0.field2996] != arg0)) {
            if (var7.field2979 > 0) {
                arg0.field3006 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2979 * var9) + 0.5D);
            } else {
                arg0.field3006 += 128;
            }
            while (arg0.field3008 < var7.field2976.length - 2 && arg0.field3006 > (var7.field2976[arg0.field3008 + 2] & 0xFF) << 8) {
                arg0.field3008 += 2;
            }
            if (arg0.field3008 == var7.field2976.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field3010.method1300(arg0.field3000, this.method3441(arg0), this.method3442(arg0));
            return false;
        }
        arg0.field3010.method1333(arg0.field3000);
        if (arg1 == null) {
            arg0.field3010.method1142(arg3);
        } else {
            arg0.field3010.method1150(arg1, arg2, arg3);
        }
        if (arg0.field3010.method1305()) {
            this.field2974.field2988.method1166(arg0.field3010);
        }
        arg0.method3524();
        if (arg0.field3006 >= 0) {
            arg0.method3700();
            if (arg0.field2996 > 0 && this.field2967[arg0.field3007][arg0.field2996] == arg0) {
                this.field2967[arg0.field3007][arg0.field2996] = null;
            }
        }
        return true;
    }
}
