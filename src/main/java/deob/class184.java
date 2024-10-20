package deob;

@ObfuscatedName("gw")
public class class184 extends class67 {

    @ObfuscatedName("gw.i")
    public class196 field2963 = new class196(128);

    @ObfuscatedName("gw.v")
    public int field2969 = 256;

    @ObfuscatedName("gw.f")
    public int field2955 = 1000000;

    @ObfuscatedName("gw.h")
    public int[] field2956 = new int[16];

    @ObfuscatedName("gw.a")
    public int[] field2957 = new int[16];

    @ObfuscatedName("gw.s")
    public int[] field2958 = new int[16];

    @ObfuscatedName("gw.p")
    public int[] field2959 = new int[16];

    @ObfuscatedName("gw.r")
    public int[] field2960 = new int[16];

    @ObfuscatedName("gw.k")
    public int[] field2961 = new int[16];

    @ObfuscatedName("gw.d")
    public int[] field2973 = new int[16];

    @ObfuscatedName("gw.n")
    public int[] field2970 = new int[16];

    @ObfuscatedName("gw.z")
    public int[] field2962 = new int[16];

    @ObfuscatedName("gw.j")
    public int[] field2965 = new int[16];

    @ObfuscatedName("gw.m")
    public int[] field2966 = new int[16];

    @ObfuscatedName("gw.e")
    public int[] field2967 = new int[16];

    @ObfuscatedName("gw.u")
    public int[] field2964 = new int[16];

    @ObfuscatedName("gw.y")
    public int[] field2953 = new int[16];

    @ObfuscatedName("gw.t")
    public int[] field2954 = new int[16];

    @ObfuscatedName("gw.q")
    public class187[][] field2971 = new class187[16][128];

    @ObfuscatedName("gw.ak")
    public class187[][] field2972 = new class187[16][128];

    @ObfuscatedName("gw.ap")
    public class182 field2968 = new class182();

    @ObfuscatedName("gw.al")
    public boolean field2974;

    @ObfuscatedName("gw.ab")
    public int field2975;

    @ObfuscatedName("gw.at")
    public int field2976;

    @ObfuscatedName("gw.au")
    public long field2977;

    @ObfuscatedName("gw.ae")
    public long field2978;

    @ObfuscatedName("gw.ax")
    public class186 field2979 = new class186(this);

    public class184() {
        this.method3444();
    }

    @ObfuscatedName("gw.i(IB)V")
    public synchronized void method3362(int arg0) {
        this.field2969 = arg0;
    }

    @ObfuscatedName("gw.v(I)I")
    public int method3367() {
        return this.field2969;
    }

    @ObfuscatedName("gw.f(Lft;Lfn;Lbw;II)Z")
    public synchronized boolean method3405(class180 arg0, class167 arg1, class60 arg2, int arg3) {
        arg0.method3257();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class197 var7 = (class197) arg0.field2916.method3496(); var7 != null; var7 = (class197) arg0.field2916.method3500()) {
            int var8 = (int) var7.field3099;
            class181 var9 = (class181) this.field2963.method3509((long) var8);
            if (var9 == null) {
                var9 = class181.method1912(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field2963.method3495(var9, (long) var8);
            }
            if (!var9.method3261(arg2, var7.field3078, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3259();
        }
        return var5;
    }

    @ObfuscatedName("gw.h(I)V")
    public synchronized void method3338() {
        for (class181 var1 = (class181) this.field2963.method3496(); var1 != null; var1 = (class181) this.field2963.method3500()) {
            var1.method3263();
        }
    }

    @ObfuscatedName("gw.a(B)V")
    public synchronized void method3339() {
        for (class181 var1 = (class181) this.field2963.method3496(); var1 != null; var1 = (class181) this.field2963.method3500()) {
            var1.method3624();
        }
    }

    @ObfuscatedName("gw.d(Lft;ZB)V")
    public synchronized void method3340(class180 arg0, boolean arg1) {
        this.method3369();
        this.field2968.method3270(arg0.field2915);
        this.field2974 = arg1;
        this.field2977 = 0L;
        int var3 = this.field2968.method3280();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2968.method3274(var4);
            this.field2968.method3276(var4);
            this.field2968.method3283(var4);
        }
        this.field2975 = this.field2968.method3281();
        this.field2976 = this.field2968.field2940[this.field2975];
        this.field2978 = this.field2968.method3318(this.field2976);
    }

    @ObfuscatedName("gw.z(I)V")
    public synchronized void method3369() {
        this.field2968.method3271();
        this.method3444();
    }

    @ObfuscatedName("gw.c(I)Z")
    public synchronized boolean method3370() {
        return this.field2968.method3272();
    }

    @ObfuscatedName("gw.b(III)V")
    public synchronized void method3343(int arg0, int arg1) {
        this.method3417(arg0, arg1);
    }

    @ObfuscatedName("gw.w(IIB)V")
    public void method3417(int arg0, int arg1) {
        this.field2959[arg0] = arg1;
        this.field2961[arg0] = arg1 & 0xFFFFFF80;
        this.method3345(arg0, arg1);
    }

    @ObfuscatedName("gw.g(III)V")
    public void method3345(int arg0, int arg1) {
        if (this.field2960[arg0] != arg1) {
            this.field2960[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2972[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("gw.x(IIIB)V")
    public void method3346(int arg0, int arg1, int arg2) {
        this.method3356(arg0, arg1, 64);
        if ((this.field2965[arg0] & 0x2) != 0) {
            for (class187 var4 = (class187) this.field2979.field2993.method3528(); var4 != null; var4 = (class187) this.field2979.field2993.method3538()) {
                if (var4.field3009 == arg0 && var4.field3012 < 0) {
                    this.field2971[arg0][var4.field2998] = null;
                    this.field2971[arg0][arg1] = var4;
                    int var5 = (var4.field3008 * var4.field3007 >> 12) + var4.field3005;
                    var4.field3005 += arg1 - var4.field2998 << 8;
                    var4.field3007 = var5 - var4.field3005;
                    var4.field3008 = 4096;
                    var4.field2998 = arg1;
                    return;
                }
            }
        }
        class181 var6 = (class181) this.field2963.method3509((long) this.field2960[arg0]);
        if (var6 == null) {
            return;
        }
        class63 var7 = var6.field2918[arg1];
        if (var7 == null) {
            return;
        }
        class187 var8 = new class187();
        var8.field3009 = arg0;
        var8.field2999 = var6;
        var8.field3000 = var7;
        var8.field3001 = var6.field2922[arg1];
        var8.field3018 = var6.field2923[arg1];
        var8.field2998 = arg1;
        var8.field3004 = var6.field2927 * arg2 * arg2 * var6.field2926[arg1] + 1024 >> 11;
        var8.field3003 = var6.field2921[arg1] & 0xFF;
        var8.field3005 = (arg1 << 8) - (var6.field2920[arg1] & 0x7FFF);
        var8.field3002 = 0;
        var8.field3010 = 0;
        var8.field3011 = 0;
        var8.field3012 = -1;
        var8.field3013 = 0;
        if (this.field2964[arg0] == 0) {
            var8.field3016 = class65.method1229(var7, this.method3442(var8), this.method3419(var8), this.method3372(var8));
        } else {
            var8.field3016 = class65.method1229(var7, this.method3442(var8), 0, this.method3372(var8));
            this.method3347(var8, var6.field2920[arg1] < 0);
        }
        if (var6.field2920[arg1] < 0) {
            var8.field3016.method1236(-1);
        }
        if (var8.field3018 >= 0) {
            class187 var9 = this.field2972[arg0][var8.field3018];
            if (var9 != null && var9.field3012 < 0) {
                this.field2971[arg0][var9.field2998] = null;
                var9.field3012 = 0;
            }
            this.field2972[arg0][var8.field3018] = var8;
        }
        this.field2979.field2993.method3545(var8);
        this.field2971[arg0][arg1] = var8;
    }

    @ObfuscatedName("gw.o(Lgx;ZI)V")
    public void method3347(class187 arg0, boolean arg1) {
        int var3 = arg0.field3000.field1229.length;
        int var5;
        if (arg1 && arg0.field3000.field1228) {
            int var4 = var3 + var3 - arg0.field3000.field1227;
            var5 = (int) ((long) this.field2964[arg0.field3009] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field3016.method1299(true);
            }
        } else {
            var5 = (int) ((long) this.field2964[arg0.field3009] * (long) var3 >> 6);
        }
        arg0.field3016.method1237(var5);
    }

    @ObfuscatedName("gw.l(IIII)V")
    public void method3356(int arg0, int arg1, int arg2) {
        class187 var4 = this.field2971[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2971[arg0][arg1] = null;
        if ((this.field2965[arg0] & 0x2) == 0) {
            var4.field3012 = 0;
            return;
        }
        for (class187 var5 = (class187) this.field2979.field2993.method3535(); var5 != null; var5 = (class187) this.field2979.field2993.method3537()) {
            if (var4.field3009 == var5.field3009 && var5.field3012 < 0 && var4 != var5) {
                var4.field3012 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("gw.j(IIII)V")
    public void method3349(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("gw.m(III)V")
    public void method3375(int arg0, int arg1) {
    }

    @ObfuscatedName("gw.e(III)V")
    public void method3351(int arg0, int arg1) {
        this.field2973[arg0] = arg1;
    }

    @ObfuscatedName("gw.u(II)V")
    public void method3352(int arg0) {
        for (class187 var2 = (class187) this.field2979.field2993.method3535(); var2 != null; var2 = (class187) this.field2979.field2993.method3537()) {
            if (arg0 < 0 || var2.field3009 == arg0) {
                if (var2.field3016 != null) {
                    var2.field3016.method1242(Statics.field1192 / 100);
                    if (var2.field3016.method1280()) {
                        this.field2979.field2992.method1075(var2.field3016);
                    }
                    var2.method3453();
                }
                if (var2.field3012 < 0) {
                    this.field2971[var2.field3009][var2.field2998] = null;
                }
                var2.method3624();
            }
        }
    }

    @ObfuscatedName("gw.y(II)V")
    public void method3353(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3353(var2);
            }
            return;
        }
        this.field2956[arg0] = 12800;
        this.field2957[arg0] = 8192;
        this.field2958[arg0] = 16383;
        this.field2973[arg0] = 8192;
        this.field2970[arg0] = 0;
        this.field2962[arg0] = 8192;
        this.method3355(arg0);
        this.method3437(arg0);
        this.field2965[arg0] = 0;
        this.field2966[arg0] = 32767;
        this.field2967[arg0] = 256;
        this.field2964[arg0] = 0;
        this.method3436(arg0, 8192);
    }

    @ObfuscatedName("gw.t(II)V")
    public void method3354(int arg0) {
        for (class187 var2 = (class187) this.field2979.field2993.method3535(); var2 != null; var2 = (class187) this.field2979.field2993.method3537()) {
            if ((arg0 < 0 || var2.field3009 == arg0) && var2.field3012 < 0) {
                this.field2971[var2.field3009][var2.field2998] = null;
                var2.field3012 = 0;
            }
        }
    }

    @ObfuscatedName("gw.q(I)V")
    public void method3444() {
        this.method3352(-1);
        this.method3353(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2960[var1] = this.field2959[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2961[var2] = this.field2959[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("gw.ak(IB)V")
    public void method3355(int arg0) {
        if ((this.field2965[arg0] & 0x2) == 0) {
            return;
        }
        for (class187 var2 = (class187) this.field2979.field2993.method3535(); var2 != null; var2 = (class187) this.field2979.field2993.method3537()) {
            if (var2.field3009 == arg0 && this.field2971[arg0][var2.field2998] == null && var2.field3012 < 0) {
                var2.field3012 = 0;
            }
        }
    }

    @ObfuscatedName("gw.af(II)V")
    public void method3437(int arg0) {
        if ((this.field2965[arg0] & 0x4) == 0) {
            return;
        }
        for (class187 var2 = (class187) this.field2979.field2993.method3535(); var2 != null; var2 = (class187) this.field2979.field2993.method3537()) {
            if (var2.field3009 == arg0) {
                var2.field3006 = 0;
            }
        }
    }

    @ObfuscatedName("gw.ah(II)V")
    public void method3357(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3356(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3346(var6, var7, var8);
            } else {
                this.method3356(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3349(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2961[var12] = (var14 << 14) + (this.field2961[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2961[var12] = (var14 << 7) + (this.field2961[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2970[var12] = (var14 << 7) + (this.field2970[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2970[var12] = (this.field2970[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2962[var12] = (var14 << 7) + (this.field2962[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2962[var12] = (this.field2962[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2956[var12] = (var14 << 7) + (this.field2956[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2956[var12] = (this.field2956[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2957[var12] = (var14 << 7) + (this.field2957[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2957[var12] = (this.field2957[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2958[var12] = (var14 << 7) + (this.field2958[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2958[var12] = (this.field2958[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2965[var12] |= 0x1;
                } else {
                    this.field2965[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2965[var12] |= 0x2;
                } else {
                    this.method3355(var12);
                    this.field2965[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2966[var12] = (var14 << 7) + (this.field2966[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2966[var12] = (this.field2966[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2966[var12] = (var14 << 7) + (this.field2966[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2966[var12] = (this.field2966[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3352(var12);
            }
            if (var13 == 121) {
                this.method3353(var12);
            }
            if (var13 == 123) {
                this.method3354(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2966[var12];
                if (var15 == 16384) {
                    this.field2967[var12] = (var14 << 7) + (this.field2967[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2966[var12];
                if (var16 == 16384) {
                    this.field2967[var12] = (this.field2967[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2964[var12] = (var14 << 7) + (this.field2964[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2964[var12] = (this.field2964[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2965[var12] |= 0x4;
                } else {
                    this.method3437(var12);
                    this.field2965[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3436(var12, (var14 << 7) + (this.field2953[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3436(var12, (this.field2953[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3345(var17, this.field2961[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3375(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method3351(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3444();
            }
        }
    }

    @ObfuscatedName("gw.am(III)V")
    public void method3436(int arg0, int arg1) {
        this.field2953[arg0] = arg1;
        this.field2954[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("gw.aw(Lgx;I)I")
    public int method3442(class187 arg0) {
        int var2 = (arg0.field3008 * arg0.field3007 >> 12) + arg0.field3005;
        int var3 = ((this.field2973[arg0.field3009] - 8192) * this.field2967[arg0.field3009] >> 12) + var2;
        class185 var4 = arg0.field3001;
        if (var4.field2988 > 0 && (var4.field2987 > 0 || this.field2970[arg0.field3009] > 0)) {
            int var5 = var4.field2987 << 2;
            int var6 = var4.field2989 << 1;
            if (arg0.field3014 < var6) {
                var5 = arg0.field3014 * var5 / var6;
            }
            int var7 = (this.field2970[arg0.field3009] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field3015 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field3000.field1226 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1192 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("gw.an(Lgx;B)I")
    public int method3419(class187 arg0) {
        class185 var2 = arg0.field3001;
        int var3 = this.field2958[arg0.field3009] * this.field2956[arg0.field3009] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field3004 * var4 + 16384 >> 15;
        int var6 = this.field2969 * var5 + 128 >> 8;
        if (var2.field2990 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field3002 * 1.953125E-5D * (double) var2.field2990) + 0.5D);
        }
        if (var2.field2985 != null) {
            int var7 = arg0.field3010;
            int var8 = var2.field2985[arg0.field3011 + 1];
            if (arg0.field3011 < var2.field2985.length - 2) {
                int var9 = (var2.field2985[arg0.field3011] & 0xFF) << 8;
                int var10 = (var2.field2985[arg0.field3011 + 2] & 0xFF) << 8;
                var8 += (var2.field2985[arg0.field3011 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field3012 > 0 && var2.field2982 != null) {
            int var11 = arg0.field3012;
            int var12 = var2.field2982[arg0.field3013 + 1];
            if (arg0.field3013 < var2.field2982.length - 2) {
                int var13 = (var2.field2982[arg0.field3013] & 0xFF) << 8;
                int var14 = (var2.field2982[arg0.field3013 + 2] & 0xFF) << 8;
                var12 += (var2.field2982[arg0.field3013 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("gw.as(Lgx;B)I")
    public int method3372(class187 arg0) {
        int var2 = this.field2957[arg0.field3009];
        return var2 < 8192 ? arg0.field3003 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field3003) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("gw.s()Lbe;")
    public synchronized class67 method1080() {
        return this.field2979;
    }

    @ObfuscatedName("gw.p()Lbe;")
    public synchronized class67 method1081() {
        return null;
    }

    @ObfuscatedName("gw.r()I")
    public synchronized int method1082() {
        return 0;
    }

    @ObfuscatedName("gw.k([III)V")
    public synchronized void method1079(int[] arg0, int arg1, int arg2) {
        if (this.field2968.method3272()) {
            int var4 = this.field2955 * this.field2968.field2931 / Statics.field1192;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2977;
                if (this.field2978 - var5 >= 0L) {
                    this.field2977 = var5;
                    break;
                }
                int var7 = (int) ((this.field2978 - this.field2977 + (long) var4 - 1L) / (long) var4);
                this.field2977 += (long) var4 * (long) var7;
                this.field2979.method1079(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3348();
            } while (this.field2968.method3272());
        }
        this.field2979.method1079(arg0, arg1, arg2);
    }

    @ObfuscatedName("gw.n(I)V")
    public synchronized void method1074(int arg0) {
        if (this.field2968.method3272()) {
            int var2 = this.field2955 * this.field2968.field2931 / Statics.field1192;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2977;
                if (this.field2978 - var3 >= 0L) {
                    this.field2977 = var3;
                    break;
                }
                int var5 = (int) ((this.field2978 - this.field2977 + (long) var2 - 1L) / (long) var2);
                this.field2977 += (long) var2 * (long) var5;
                this.field2979.method1074(var5);
                arg0 -= var5;
                this.method3348();
            } while (this.field2968.method3272());
        }
        this.field2979.method1074(arg0);
    }

    @ObfuscatedName("gw.av(I)V")
    public void method3348() {
        int var1 = this.field2975;
        int var2 = this.field2976;
        long var3 = this.field2978;
        while (this.field2976 == var2) {
            while (this.field2968.field2940[var1] == var2) {
                this.field2968.method3274(var1);
                int var5 = this.field2968.method3277(var1);
                if (var5 == 1) {
                    this.field2968.method3275();
                    this.field2968.method3283(var1);
                    if (this.field2968.method3319()) {
                        if (!this.field2974 || var2 == 0) {
                            this.method3444();
                            this.field2968.method3271();
                            return;
                        }
                        this.field2968.method3287(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3357(var5);
                }
                this.field2968.method3276(var1);
                this.field2968.method3283(var1);
            }
            var1 = this.field2968.method3281();
            var2 = this.field2968.field2940[var1];
            var3 = this.field2968.method3318(var2);
        }
        this.field2975 = var1;
        this.field2976 = var2;
        this.field2978 = var3;
    }

    @ObfuscatedName("gw.ao(Lgx;I)Z")
    public boolean method3361(class187 arg0) {
        if (arg0.field3016 != null) {
            return false;
        }
        if (arg0.field3012 >= 0) {
            arg0.method3624();
            if (arg0.field3018 > 0 && this.field2972[arg0.field3009][arg0.field3018] == arg0) {
                this.field2972[arg0.field3009][arg0.field3018] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("gw.ad(Lgx;[IIII)Z")
    public boolean method3366(class187 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field3017 = Statics.field1192 / 100;
        if (arg0.field3012 >= 0 && arg0.field3016 == null || arg0.field3016.method1289()) {
            arg0.method3453();
            arg0.method3624();
            if (arg0.field3018 > 0 && this.field2972[arg0.field3009][arg0.field3018] == arg0) {
                this.field2972[arg0.field3009][arg0.field3018] = null;
            }
            return true;
        }
        int var5 = arg0.field3008;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2962[arg0.field3009] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field3008 = var6;
        }
        arg0.field3016.method1243(this.method3442(arg0));
        class185 var7 = arg0.field3001;
        boolean var8 = false;
        arg0.field3014++;
        arg0.field3015 += var7.field2988;
        double var9 = (double) ((arg0.field2998 - 60 << 8) + (arg0.field3008 * arg0.field3007 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2990 > 0) {
            if (var7.field2986 > 0) {
                arg0.field3002 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2986 * var9) + 0.5D);
            } else {
                arg0.field3002 += 128;
            }
        }
        if (var7.field2985 != null) {
            if (var7.field2984 > 0) {
                arg0.field3010 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2984 * var9) + 0.5D);
            } else {
                arg0.field3010 += 128;
            }
            while (arg0.field3011 < var7.field2985.length - 2 && arg0.field3010 > (var7.field2985[arg0.field3011 + 2] & 0xFF) << 8) {
                arg0.field3011 += 2;
            }
            if (arg0.field3011 == var7.field2985.length - 2 && var7.field2985[arg0.field3011 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field3012 >= 0 && var7.field2982 != null && (this.field2965[arg0.field3009] & 0x1) == 0 && (arg0.field3018 < 0 || this.field2972[arg0.field3009][arg0.field3018] != arg0)) {
            if (var7.field2981 > 0) {
                arg0.field3012 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2981 * var9) + 0.5D);
            } else {
                arg0.field3012 += 128;
            }
            while (arg0.field3013 < var7.field2982.length - 2 && arg0.field3012 > (var7.field2982[arg0.field3013 + 2] & 0xFF) << 8) {
                arg0.field3013 += 2;
            }
            if (arg0.field3013 == var7.field2982.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field3016.method1241(arg0.field3017, this.method3419(arg0), this.method3372(arg0));
            return false;
        }
        arg0.field3016.method1242(arg0.field3017);
        if (arg1 == null) {
            arg0.field3016.method1074(arg3);
        } else {
            arg0.field3016.method1079(arg1, arg2, arg3);
        }
        if (arg0.field3016.method1280()) {
            this.field2979.field2992.method1075(arg0.field3016);
        }
        arg0.method3453();
        if (arg0.field3012 >= 0) {
            arg0.method3624();
            if (arg0.field3018 > 0 && this.field2972[arg0.field3009][arg0.field3018] == arg0) {
                this.field2972[arg0.field3009][arg0.field3018] = null;
            }
        }
        return true;
    }
}
