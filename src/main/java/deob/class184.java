package deob;

@ObfuscatedName("ge")
public class class184 extends class67 {

    @ObfuscatedName("ge.a")
    public class196 field2961 = new class196(128);

    @ObfuscatedName("ge.r")
    public int field2954 = 256;

    @ObfuscatedName("ge.f")
    public int field2960 = 1000000;

    @ObfuscatedName("ge.s")
    public int[] field2956 = new int[16];

    @ObfuscatedName("ge.y")
    public int[] field2977 = new int[16];

    @ObfuscatedName("ge.e")
    public int[] field2965 = new int[16];

    @ObfuscatedName("ge.g")
    public int[] field2959 = new int[16];

    @ObfuscatedName("ge.m")
    public int[] field2957 = new int[16];

    @ObfuscatedName("ge.j")
    public int[] field2971 = new int[16];

    @ObfuscatedName("ge.n")
    public int[] field2962 = new int[16];

    @ObfuscatedName("ge.l")
    public int[] field2963 = new int[16];

    @ObfuscatedName("ge.h")
    public int[] field2964 = new int[16];

    @ObfuscatedName("ge.x")
    public int[] field2958 = new int[16];

    @ObfuscatedName("ge.d")
    public int[] field2966 = new int[16];

    @ObfuscatedName("ge.p")
    public int[] field2967 = new int[16];

    @ObfuscatedName("ge.q")
    public int[] field2968 = new int[16];

    @ObfuscatedName("ge.w")
    public int[] field2969 = new int[16];

    @ObfuscatedName("ge.k")
    public int[] field2970 = new int[16];

    @ObfuscatedName("ge.o")
    public class187[][] field2955 = new class187[16][128];

    @ObfuscatedName("ge.ad")
    public class187[][] field2972 = new class187[16][128];

    @ObfuscatedName("ge.at")
    public class182 field2973 = new class182();

    @ObfuscatedName("ge.aw")
    public boolean field2974;

    @ObfuscatedName("ge.ax")
    public int field2953;

    @ObfuscatedName("ge.ak")
    public int field2976;

    @ObfuscatedName("ge.ah")
    public long field2975;

    @ObfuscatedName("ge.ac")
    public long field2980;

    @ObfuscatedName("ge.as")
    public class186 field2979 = new class186(this);

    public class184() {
        this.method3479();
    }

    @ObfuscatedName("ge.a(IB)V")
    public synchronized void method3377(int arg0) {
        this.field2954 = arg0;
    }

    @ObfuscatedName("ge.r(B)I")
    public int method3378() {
        return this.field2954;
    }

    @ObfuscatedName("ge.f(Lfo;Lfz;Lbu;II)Z")
    public synchronized boolean method3379(class180 arg0, class167 arg1, class60 arg2, int arg3) {
        arg0.method3285();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class197 var7 = (class197) arg0.field2918.method3551(); var7 != null; var7 = (class197) arg0.field2918.method3542()) {
            int var8 = (int) var7.field3112;
            class181 var9 = (class181) this.field2961.method3539((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method3030(var8);
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
                this.field2961.method3546(var11, (long) var8);
            }
            if (!var9.method3295(arg2, var7.field3090, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3286();
        }
        return var5;
    }

    @ObfuscatedName("ge.s(I)V")
    public synchronized void method3380() {
        for (class181 var1 = (class181) this.field2961.method3551(); var1 != null; var1 = (class181) this.field2961.method3542()) {
            var1.method3294();
        }
    }

    @ObfuscatedName("ge.y(I)V")
    public synchronized void method3418() {
        for (class181 var1 = (class181) this.field2961.method3551(); var1 != null; var1 = (class181) this.field2961.method3542()) {
            var1.method3661();
        }
    }

    @ObfuscatedName("ge.n(Lfo;ZI)V")
    public synchronized void method3463(class180 arg0, boolean arg1) {
        this.method3382();
        this.field2973.method3304(arg0.field2919);
        this.field2974 = arg1;
        this.field2975 = 0L;
        int var3 = this.field2973.method3307();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2973.method3308(var4);
            this.field2973.method3340(var4);
            this.field2973.method3319(var4);
        }
        this.field2953 = this.field2973.method3316();
        this.field2976 = this.field2973.field2933[this.field2953];
        this.field2980 = this.field2973.method3314(this.field2976);
    }

    @ObfuscatedName("ge.h(I)V")
    public synchronized void method3382() {
        this.field2973.method3305();
        this.method3479();
    }

    @ObfuscatedName("ge.i(B)Z")
    public synchronized boolean method3408() {
        return this.field2973.method3306();
    }

    @ObfuscatedName("ge.v(III)V")
    public synchronized void method3411(int arg0, int arg1) {
        this.method3406(arg0, arg1);
    }

    @ObfuscatedName("ge.z(IIB)V")
    public void method3406(int arg0, int arg1) {
        this.field2959[arg0] = arg1;
        this.field2971[arg0] = arg1 & 0xFFFFFF80;
        this.method3424(arg0, arg1);
    }

    @ObfuscatedName("ge.u(IIB)V")
    public void method3424(int arg0, int arg1) {
        if (this.field2957[arg0] != arg1) {
            this.field2957[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2972[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("ge.t(IIII)V")
    public void method3385(int arg0, int arg1, int arg2) {
        this.method3384(arg0, arg1, 64);
        if ((this.field2958[arg0] & 0x2) != 0) {
            for (class187 var4 = (class187) this.field2979.field2996.method3587(); var4 != null; var4 = (class187) this.field2979.field2996.method3578()) {
                if (var4.field3012 == arg0 && var4.field3014 < 0) {
                    this.field2955[arg0][var4.field3005] = null;
                    this.field2955[arg0][arg1] = var4;
                    int var5 = (var4.field3009 * var4.field3004 >> 12) + var4.field3008;
                    var4.field3008 += arg1 - var4.field3005 << 8;
                    var4.field3009 = var5 - var4.field3008;
                    var4.field3004 = 4096;
                    var4.field3005 = arg1;
                    return;
                }
            }
        }
        class181 var6 = (class181) this.field2961.method3539((long) this.field2957[arg0]);
        if (var6 == null) {
            return;
        }
        class63 var7 = var6.field2921[arg1];
        if (var7 == null) {
            return;
        }
        class187 var8 = new class187();
        var8.field3012 = arg0;
        var8.field3006 = var6;
        var8.field3002 = var7;
        var8.field3017 = var6.field2928[arg1];
        var8.field3020 = var6.field2920[arg1];
        var8.field3005 = arg1;
        var8.field3010 = var6.field2925 * arg2 * arg2 * var6.field2923[arg1] + 1024 >> 11;
        var8.field3007 = var6.field2924[arg1] & 0xFF;
        var8.field3008 = (arg1 << 8) - (var6.field2922[arg1] & 0x7FFF);
        var8.field3011 = 0;
        var8.field3001 = 0;
        var8.field3013 = 0;
        var8.field3014 = -1;
        var8.field3015 = 0;
        if (this.field2968[arg0] == 0) {
            var8.field3018 = class65.method1278(var7, this.method3398(var8), this.method3393(var8), this.method3400(var8));
        } else {
            var8.field3018 = class65.method1278(var7, this.method3398(var8), 0, this.method3400(var8));
            this.method3386(var8, var6.field2922[arg1] < 0);
        }
        if (var6.field2922[arg1] < 0) {
            var8.field3018.method1280(-1);
        }
        if (var8.field3020 >= 0) {
            class187 var9 = this.field2972[arg0][var8.field3020];
            if (var9 != null && var9.field3014 < 0) {
                this.field2955[arg0][var9.field3005] = null;
                var9.field3014 = 0;
            }
            this.field2972[arg0][var8.field3020] = var8;
        }
        this.field2979.field2996.method3570(var8);
        this.field2955[arg0][arg1] = var8;
    }

    @ObfuscatedName("ge.b(Lgh;ZI)V")
    public void method3386(class187 arg0, boolean arg1) {
        int var3 = arg0.field3002.field1232.length;
        int var5;
        if (arg1 && arg0.field3002.field1235) {
            int var4 = var3 + var3 - arg0.field3002.field1231;
            var5 = (int) ((long) this.field2968[arg0.field3012] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field3018.method1287(true);
            }
        } else {
            var5 = (int) ((long) this.field2968[arg0.field3012] * (long) var3 >> 6);
        }
        arg0.field3018.method1307(var5);
    }

    @ObfuscatedName("ge.c(IIIB)V")
    public void method3384(int arg0, int arg1, int arg2) {
        class187 var4 = this.field2955[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2955[arg0][arg1] = null;
        if ((this.field2958[arg0] & 0x2) == 0) {
            var4.field3014 = 0;
            return;
        }
        for (class187 var5 = (class187) this.field2979.field2996.method3575(); var5 != null; var5 = (class187) this.field2979.field2996.method3576()) {
            if (var4.field3012 == var5.field3012 && var5.field3014 < 0 && var4 != var5) {
                var4.field3014 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("ge.x(IIII)V")
    public void method3426(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("ge.d(III)V")
    public void method3388(int arg0, int arg1) {
    }

    @ObfuscatedName("ge.p(IIS)V")
    public void method3389(int arg0, int arg1) {
        this.field2962[arg0] = arg1;
    }

    @ObfuscatedName("ge.q(II)V")
    public void method3448(int arg0) {
        for (class187 var2 = (class187) this.field2979.field2996.method3575(); var2 != null; var2 = (class187) this.field2979.field2996.method3576()) {
            if (arg0 < 0 || var2.field3012 == arg0) {
                if (var2.field3018 != null) {
                    var2.field3018.method1321(Statics.field1186 / 100);
                    if (var2.field3018.method1376()) {
                        this.field2979.field2997.method1127(var2.field3018);
                    }
                    var2.method3497();
                }
                if (var2.field3014 < 0) {
                    this.field2955[var2.field3012][var2.field3005] = null;
                }
                var2.method3661();
            }
        }
    }

    @ObfuscatedName("ge.ai(II)V")
    public void method3391(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3391(var2);
            }
            return;
        }
        this.field2956[arg0] = 12800;
        this.field2977[arg0] = 8192;
        this.field2965[arg0] = 16383;
        this.field2962[arg0] = 8192;
        this.field2963[arg0] = 0;
        this.field2964[arg0] = 8192;
        this.method3394(arg0);
        this.method3477(arg0);
        this.field2958[arg0] = 0;
        this.field2966[arg0] = 32767;
        this.field2967[arg0] = 256;
        this.field2968[arg0] = 0;
        this.method3397(arg0, 8192);
    }

    @ObfuscatedName("ge.ab(IB)V")
    public void method3402(int arg0) {
        for (class187 var2 = (class187) this.field2979.field2996.method3575(); var2 != null; var2 = (class187) this.field2979.field2996.method3576()) {
            if ((arg0 < 0 || var2.field3012 == arg0) && var2.field3014 < 0) {
                this.field2955[var2.field3012][var2.field3005] = null;
                var2.field3014 = 0;
            }
        }
    }

    @ObfuscatedName("ge.aa(I)V")
    public void method3479() {
        this.method3448(-1);
        this.method3391(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2957[var1] = this.field2959[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2971[var2] = this.field2959[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("ge.an(II)V")
    public void method3394(int arg0) {
        if ((this.field2958[arg0] & 0x2) == 0) {
            return;
        }
        for (class187 var2 = (class187) this.field2979.field2996.method3575(); var2 != null; var2 = (class187) this.field2979.field2996.method3576()) {
            if (var2.field3012 == arg0 && this.field2955[arg0][var2.field3005] == null && var2.field3014 < 0) {
                var2.field3014 = 0;
            }
        }
    }

    @ObfuscatedName("ge.av(II)V")
    public void method3477(int arg0) {
        if ((this.field2958[arg0] & 0x4) == 0) {
            return;
        }
        for (class187 var2 = (class187) this.field2979.field2996.method3575(); var2 != null; var2 = (class187) this.field2979.field2996.method3576()) {
            if (var2.field3012 == arg0) {
                var2.field3003 = 0;
            }
        }
    }

    @ObfuscatedName("ge.aj(II)V")
    public void method3401(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3384(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3385(var6, var7, var8);
            } else {
                this.method3384(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3426(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2971[var12] = (var14 << 14) + (this.field2971[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2971[var12] = (var14 << 7) + (this.field2971[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2963[var12] = (var14 << 7) + (this.field2963[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2963[var12] = (this.field2963[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2964[var12] = (var14 << 7) + (this.field2964[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2964[var12] = (this.field2964[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2956[var12] = (var14 << 7) + (this.field2956[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2956[var12] = (this.field2956[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2977[var12] = (var14 << 7) + (this.field2977[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2977[var12] = (this.field2977[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2965[var12] = (var14 << 7) + (this.field2965[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2965[var12] = (this.field2965[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2958[var12] |= 0x1;
                } else {
                    this.field2958[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2958[var12] |= 0x2;
                } else {
                    this.method3394(var12);
                    this.field2958[var12] &= 0xFFFFFFFD;
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
                this.method3448(var12);
            }
            if (var13 == 121) {
                this.method3391(var12);
            }
            if (var13 == 123) {
                this.method3402(var12);
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
                this.field2968[var12] = (var14 << 7) + (this.field2968[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2968[var12] = (this.field2968[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2958[var12] |= 0x4;
                } else {
                    this.method3477(var12);
                    this.field2958[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3397(var12, (var14 << 7) + (this.field2969[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3397(var12, (this.field2969[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3424(var17, this.field2971[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3388(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method3389(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3479();
            }
        }
    }

    @ObfuscatedName("ge.ap(III)V")
    public void method3397(int arg0, int arg1) {
        this.field2969[arg0] = arg1;
        this.field2970[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("ge.aq(Lgh;I)I")
    public int method3398(class187 arg0) {
        int var2 = (arg0.field3009 * arg0.field3004 >> 12) + arg0.field3008;
        int var3 = ((this.field2962[arg0.field3012] - 8192) * this.field2967[arg0.field3012] >> 12) + var2;
        class185 var4 = arg0.field3017;
        if (var4.field2990 > 0 && (var4.field2994 > 0 || this.field2963[arg0.field3012] > 0)) {
            int var5 = var4.field2994 << 2;
            int var6 = var4.field2991 << 1;
            if (arg0.field3016 < var6) {
                var5 = arg0.field3016 * var5 / var6;
            }
            int var7 = (this.field2963[arg0.field3012] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field3000 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field3002.field1233 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1186 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("ge.af(Lgh;S)I")
    public int method3393(class187 arg0) {
        class185 var2 = arg0.field3017;
        int var3 = this.field2965[arg0.field3012] * this.field2956[arg0.field3012] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field3010 * var4 + 16384 >> 15;
        int var6 = this.field2954 * var5 + 128 >> 8;
        if (var2.field2985 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field3011 * 1.953125E-5D * (double) var2.field2985) + 0.5D);
        }
        if (var2.field2983 != null) {
            int var7 = arg0.field3001;
            int var8 = var2.field2983[arg0.field3013 + 1];
            if (arg0.field3013 < var2.field2983.length - 2) {
                int var9 = (var2.field2983[arg0.field3013] & 0xFF) << 8;
                int var10 = (var2.field2983[arg0.field3013 + 2] & 0xFF) << 8;
                var8 += (var2.field2983[arg0.field3013 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field3014 > 0 && var2.field2984 != null) {
            int var11 = arg0.field3014;
            int var12 = var2.field2984[arg0.field3015 + 1];
            if (arg0.field3015 < var2.field2984.length - 2) {
                int var13 = (var2.field2984[arg0.field3015] & 0xFF) << 8;
                int var14 = (var2.field2984[arg0.field3015 + 2] & 0xFF) << 8;
                var12 += (var2.field2984[arg0.field3015 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("ge.ay(Lgh;I)I")
    public int method3400(class187 arg0) {
        int var2 = this.field2977[arg0.field3012];
        return var2 < 8192 ? arg0.field3007 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field3007) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("ge.e()Lbe;")
    public synchronized class67 method1131() {
        return this.field2979;
    }

    @ObfuscatedName("ge.g()Lbe;")
    public synchronized class67 method1165() {
        return null;
    }

    @ObfuscatedName("ge.m()I")
    public synchronized int method1132() {
        return 0;
    }

    @ObfuscatedName("ge.j([III)V")
    public synchronized void method1134(int[] arg0, int arg1, int arg2) {
        if (this.field2973.method3306()) {
            int var4 = this.field2960 * this.field2973.field2929 / Statics.field1186;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2975;
                if (this.field2980 - var5 >= 0L) {
                    this.field2975 = var5;
                    break;
                }
                int var7 = (int) ((this.field2980 - this.field2975 + (long) var4 - 1L) / (long) var4);
                this.field2975 += (long) var4 * (long) var7;
                this.field2979.method1134(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3403();
            } while (this.field2973.method3306());
        }
        this.field2979.method1134(arg0, arg1, arg2);
    }

    @ObfuscatedName("ge.l(I)V")
    public synchronized void method1136(int arg0) {
        if (this.field2973.method3306()) {
            int var2 = this.field2960 * this.field2973.field2929 / Statics.field1186;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2975;
                if (this.field2980 - var3 >= 0L) {
                    this.field2975 = var3;
                    break;
                }
                int var5 = (int) ((this.field2980 - this.field2975 + (long) var2 - 1L) / (long) var2);
                this.field2975 += (long) var2 * (long) var5;
                this.field2979.method1136(var5);
                arg0 -= var5;
                this.method3403();
            } while (this.field2973.method3306());
        }
        this.field2979.method1136(arg0);
    }

    @ObfuscatedName("ge.au(B)V")
    public void method3403() {
        int var1 = this.field2953;
        int var2 = this.field2976;
        long var3 = this.field2980;
        while (this.field2976 == var2) {
            while (this.field2973.field2933[var1] == var2) {
                this.field2973.method3308(var1);
                int var5 = this.field2973.method3312(var1);
                if (var5 == 1) {
                    this.field2973.method3349();
                    this.field2973.method3319(var1);
                    if (this.field2973.method3337()) {
                        if (!this.field2974 || var2 == 0) {
                            this.method3479();
                            this.field2973.method3305();
                            return;
                        }
                        this.field2973.method3318(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3401(var5);
                }
                this.field2973.method3340(var1);
                this.field2973.method3319(var1);
            }
            var1 = this.field2973.method3316();
            var2 = this.field2973.field2933[var1];
            var3 = this.field2973.method3314(var2);
        }
        this.field2953 = var1;
        this.field2976 = var2;
        this.field2980 = var3;
    }

    @ObfuscatedName("ge.az(Lgh;I)Z")
    public boolean method3404(class187 arg0) {
        if (arg0.field3018 != null) {
            return false;
        }
        if (arg0.field3014 >= 0) {
            arg0.method3661();
            if (arg0.field3020 > 0 && this.field2972[arg0.field3012][arg0.field3020] == arg0) {
                this.field2972[arg0.field3012][arg0.field3020] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("ge.ae(Lgh;[IIIB)Z")
    public boolean method3459(class187 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field3019 = Statics.field1186 / 100;
        if (arg0.field3014 >= 0 && arg0.field3018 == null || arg0.field3018.method1294()) {
            arg0.method3497();
            arg0.method3661();
            if (arg0.field3020 > 0 && this.field2972[arg0.field3012][arg0.field3020] == arg0) {
                this.field2972[arg0.field3012][arg0.field3020] = null;
            }
            return true;
        }
        int var5 = arg0.field3004;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2964[arg0.field3012] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field3004 = var6;
        }
        arg0.field3018.method1394(this.method3398(arg0));
        class185 var7 = arg0.field3017;
        boolean var8 = false;
        arg0.field3016++;
        arg0.field3000 += var7.field2990;
        double var9 = (double) ((arg0.field3005 - 60 << 8) + (arg0.field3009 * arg0.field3004 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2985 > 0) {
            if (var7.field2988 > 0) {
                arg0.field3011 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2988 * var9) + 0.5D);
            } else {
                arg0.field3011 += 128;
            }
        }
        if (var7.field2983 != null) {
            if (var7.field2989 > 0) {
                arg0.field3001 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2989 * var9) + 0.5D);
            } else {
                arg0.field3001 += 128;
            }
            while (arg0.field3013 < var7.field2983.length - 2 && arg0.field3001 > (var7.field2983[arg0.field3013 + 2] & 0xFF) << 8) {
                arg0.field3013 += 2;
            }
            if (arg0.field3013 == var7.field2983.length - 2 && var7.field2983[arg0.field3013 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field3014 >= 0 && var7.field2984 != null && (this.field2958[arg0.field3012] & 0x1) == 0 && (arg0.field3020 < 0 || this.field2972[arg0.field3012][arg0.field3020] != arg0)) {
            if (var7.field2987 > 0) {
                arg0.field3014 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2987 * var9) + 0.5D);
            } else {
                arg0.field3014 += 128;
            }
            while (arg0.field3015 < var7.field2984.length - 2 && arg0.field3014 > (var7.field2984[arg0.field3015 + 2] & 0xFF) << 8) {
                arg0.field3015 += 2;
            }
            if (arg0.field3015 == var7.field2984.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field3018.method1302(arg0.field3019, this.method3393(arg0), this.method3400(arg0));
            return false;
        }
        arg0.field3018.method1321(arg0.field3019);
        if (arg1 == null) {
            arg0.field3018.method1136(arg3);
        } else {
            arg0.field3018.method1134(arg1, arg2, arg3);
        }
        if (arg0.field3018.method1376()) {
            this.field2979.field2997.method1127(arg0.field3018);
        }
        arg0.method3497();
        if (arg0.field3014 >= 0) {
            arg0.method3661();
            if (arg0.field3020 > 0 && this.field2972[arg0.field3012][arg0.field3020] == arg0) {
                this.field2972[arg0.field3012][arg0.field3020] = null;
            }
        }
        return true;
    }
}
