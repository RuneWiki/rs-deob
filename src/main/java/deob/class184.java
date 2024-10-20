package deob;

@ObfuscatedName("gn")
public class class184 extends class67 {

    @ObfuscatedName("gn.g")
    public class196 field2959 = new class196(128);

    @ObfuscatedName("gn.b")
    public int field2971 = 256;

    @ObfuscatedName("gn.d")
    public int field2963 = 1000000;

    @ObfuscatedName("gn.z")
    public int[] field2950 = new int[16];

    @ObfuscatedName("gn.l")
    public int[] field2951 = new int[16];

    @ObfuscatedName("gn.m")
    public int[] field2952 = new int[16];

    @ObfuscatedName("gn.p")
    public int[] field2958 = new int[16];

    @ObfuscatedName("gn.u")
    public int[] field2949 = new int[16];

    @ObfuscatedName("gn.c")
    public int[] field2955 = new int[16];

    @ObfuscatedName("gn.v")
    public int[] field2956 = new int[16];

    @ObfuscatedName("gn.o")
    public int[] field2957 = new int[16];

    @ObfuscatedName("gn.n")
    public int[] field2962 = new int[16];

    @ObfuscatedName("gn.t")
    public int[] field2964 = new int[16];

    @ObfuscatedName("gn.a")
    public int[] field2965 = new int[16];

    @ObfuscatedName("gn.s")
    public int[] field2961 = new int[16];

    @ObfuscatedName("gn.e")
    public int[] field2960 = new int[16];

    @ObfuscatedName("gn.q")
    public int[] field2969 = new int[16];

    @ObfuscatedName("gn.i")
    public int[] field2948 = new int[16];

    @ObfuscatedName("gn.h")
    public class187[][] field2947 = new class187[16][128];

    @ObfuscatedName("gn.ay")
    public class187[][] field2966 = new class187[16][128];

    @ObfuscatedName("gn.ak")
    public class182 field2967 = new class182();

    @ObfuscatedName("gn.ai")
    public boolean field2968;

    @ObfuscatedName("gn.ag")
    public int field2953;

    @ObfuscatedName("gn.ab")
    public int field2970;

    @ObfuscatedName("gn.aa")
    public long field2954;

    @ObfuscatedName("gn.af")
    public long field2972;

    @ObfuscatedName("gn.al")
    public class186 field2973 = new class186(this);

    public class184() {
        this.method3425();
    }

    @ObfuscatedName("gn.g(IB)V")
    public synchronized void method3407(int arg0) {
        this.field2971 = arg0;
    }

    @ObfuscatedName("gn.b(I)I")
    public int method3408() {
        return this.field2971;
    }

    @ObfuscatedName("gn.w(Lft;Lfc;Lbm;II)Z")
    public synchronized boolean method3409(class180 arg0, class167 arg1, class60 arg2, int arg3) {
        arg0.method3326();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class197 var7 = (class197) arg0.field2912.method3571(); var7 != null; var7 = (class197) arg0.field2912.method3572()) {
            int var8 = (int) var7.field3099;
            class181 var9 = (class181) this.field2959.method3573((long) var8);
            if (var9 == null) {
                var9 = class181.method111(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field2959.method3569(var9, (long) var8);
            }
            if (!var9.method3329(arg2, var7.field3078, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3321();
        }
        return var5;
    }

    @ObfuscatedName("gn.d(B)V")
    public synchronized void method3467() {
        for (class181 var1 = (class181) this.field2959.method3571(); var1 != null; var1 = (class181) this.field2959.method3572()) {
            var1.method3331();
        }
    }

    @ObfuscatedName("gn.z(I)V")
    public synchronized void method3490() {
        for (class181 var1 = (class181) this.field2959.method3571(); var1 != null; var1 = (class181) this.field2959.method3572()) {
            var1.method3693();
        }
    }

    @ObfuscatedName("gn.c(Lft;ZB)V")
    public synchronized void method3411(class180 arg0, boolean arg1) {
        this.method3459();
        this.field2967.method3378(arg0.field2913);
        this.field2968 = arg1;
        this.field2954 = 0L;
        int var3 = this.field2967.method3364();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2967.method3372(var4);
            this.field2967.method3346(var4);
            this.field2967.method3344(var4);
        }
        this.field2953 = this.field2967.method3350();
        this.field2970 = this.field2967.field2935[this.field2953];
        this.field2972 = this.field2967.method3349(this.field2970);
    }

    @ObfuscatedName("gn.o(B)V")
    public synchronized void method3459() {
        this.field2967.method3376();
        this.method3425();
    }

    @ObfuscatedName("gn.n(B)Z")
    public synchronized boolean method3412() {
        return this.field2967.method3356();
    }

    @ObfuscatedName("gn.k(III)V")
    public synchronized void method3413(int arg0, int arg1) {
        this.method3414(arg0, arg1);
    }

    @ObfuscatedName("gn.f(IIB)V")
    public void method3414(int arg0, int arg1) {
        this.field2958[arg0] = arg1;
        this.field2955[arg0] = arg1 & 0xFFFFFF80;
        this.method3415(arg0, arg1);
    }

    @ObfuscatedName("gn.x(IIB)V")
    public void method3415(int arg0, int arg1) {
        if (this.field2949[arg0] != arg1) {
            this.field2949[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2966[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("gn.j(IIII)V")
    public void method3416(int arg0, int arg1, int arg2) {
        this.method3423(arg0, arg1, 64);
        if ((this.field2964[arg0] & 0x2) != 0) {
            for (class187 var4 = (class187) this.field2973.field2986.method3604(); var4 != null; var4 = (class187) this.field2973.field2986.method3606()) {
                if (var4.field3005 == arg0 && var4.field3003 < 0) {
                    this.field2947[arg0][var4.field2994] = null;
                    this.field2947[arg0][arg1] = var4;
                    int var5 = (var4.field2998 * var4.field2993 >> 12) + var4.field2997;
                    var4.field2997 += arg1 - var4.field2994 << 8;
                    var4.field2998 = var5 - var4.field2997;
                    var4.field2993 = 4096;
                    var4.field2994 = arg1;
                    return;
                }
            }
        }
        class181 var6 = (class181) this.field2959.method3573((long) this.field2949[arg0]);
        if (var6 == null) {
            return;
        }
        class63 var7 = var6.field2916[arg1];
        if (var7 == null) {
            return;
        }
        class187 var8 = new class187();
        var8.field3005 = arg0;
        var8.field2990 = var6;
        var8.field2991 = var7;
        var8.field2992 = var6.field2923[arg1];
        var8.field3002 = var6.field2920[arg1];
        var8.field2994 = arg1;
        var8.field3008 = var6.field2919 * arg2 * arg2 * var6.field2917[arg1] + 1024 >> 11;
        var8.field3001 = var6.field2918[arg1] & 0xFF;
        var8.field2997 = (arg1 << 8) - (var6.field2914[arg1] & 0x7FFF);
        var8.field3000 = 0;
        var8.field3011 = 0;
        var8.field2996 = 0;
        var8.field3003 = -1;
        var8.field3004 = 0;
        if (this.field2960[arg0] == 0) {
            var8.field3007 = class65.method1308(var7, this.method3430(var8), this.method3431(var8), this.method3432(var8));
        } else {
            var8.field3007 = class65.method1308(var7, this.method3430(var8), 0, this.method3432(var8));
            this.method3417(var8, var6.field2914[arg1] < 0);
        }
        if (var6.field2914[arg1] < 0) {
            var8.field3007.method1310(-1);
        }
        if (var8.field3002 >= 0) {
            class187 var9 = this.field2966[arg0][var8.field3002];
            if (var9 != null && var9.field3003 < 0) {
                this.field2947[arg0][var9.field2994] = null;
                var9.field3003 = 0;
            }
            this.field2966[arg0][var8.field3002] = var8;
        }
        this.field2973.field2986.method3598(var8);
        this.field2947[arg0][arg1] = var8;
    }

    @ObfuscatedName("gn.r(Lgk;ZI)V")
    public void method3417(class187 arg0, boolean arg1) {
        int var3 = arg0.field2991.field1224.length;
        int var5;
        if (arg1 && arg0.field2991.field1228) {
            int var4 = var3 + var3 - arg0.field2991.field1226;
            var5 = (int) ((long) this.field2960[arg0.field3005] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field3007.method1317(true);
            }
        } else {
            var5 = (int) ((long) this.field2960[arg0.field3005] * (long) var3 >> 6);
        }
        arg0.field3007.method1316(var5);
    }

    @ObfuscatedName("gn.y(IIII)V")
    public void method3423(int arg0, int arg1, int arg2) {
        class187 var4 = this.field2947[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2947[arg0][arg1] = null;
        if ((this.field2964[arg0] & 0x2) == 0) {
            var4.field3003 = 0;
            return;
        }
        for (class187 var5 = (class187) this.field2973.field2986.method3603(); var5 != null; var5 = (class187) this.field2973.field2986.method3596()) {
            if (var4.field3005 == var5.field3005 && var5.field3003 < 0 && var4 != var5) {
                var4.field3003 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("gn.t(IIII)V")
    public void method3429(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("gn.a(IIB)V")
    public void method3420(int arg0, int arg1) {
    }

    @ObfuscatedName("gn.s(III)V")
    public void method3421(int arg0, int arg1) {
        this.field2956[arg0] = arg1;
    }

    @ObfuscatedName("gn.e(II)V")
    public void method3422(int arg0) {
        for (class187 var2 = (class187) this.field2973.field2986.method3603(); var2 != null; var2 = (class187) this.field2973.field2986.method3596()) {
            if (arg0 < 0 || var2.field3005 == arg0) {
                if (var2.field3007 != null) {
                    var2.field3007.method1320(Statics.field1189 / 100);
                    if (var2.field3007.method1324()) {
                        this.field2973.field2987.method1143(var2.field3007);
                    }
                    var2.method3520();
                }
                if (var2.field3003 < 0) {
                    this.field2947[var2.field3005][var2.field2994] = null;
                }
                var2.method3693();
            }
        }
    }

    @ObfuscatedName("gn.q(II)V")
    public void method3448(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3448(var2);
            }
            return;
        }
        this.field2950[arg0] = 12800;
        this.field2951[arg0] = 8192;
        this.field2952[arg0] = 16383;
        this.field2956[arg0] = 8192;
        this.field2957[arg0] = 0;
        this.field2962[arg0] = 8192;
        this.method3426(arg0);
        this.method3427(arg0);
        this.field2964[arg0] = 0;
        this.field2965[arg0] = 32767;
        this.field2961[arg0] = 256;
        this.field2960[arg0] = 0;
        this.method3444(arg0, 8192);
    }

    @ObfuscatedName("gn.i(II)V")
    public void method3424(int arg0) {
        for (class187 var2 = (class187) this.field2973.field2986.method3603(); var2 != null; var2 = (class187) this.field2973.field2986.method3596()) {
            if ((arg0 < 0 || var2.field3005 == arg0) && var2.field3003 < 0) {
                this.field2947[var2.field3005][var2.field2994] = null;
                var2.field3003 = 0;
            }
        }
    }

    @ObfuscatedName("gn.h(B)V")
    public void method3425() {
        this.method3422(-1);
        this.method3448(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2949[var1] = this.field2958[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2955[var2] = this.field2958[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("gn.ay(II)V")
    public void method3426(int arg0) {
        if ((this.field2964[arg0] & 0x2) == 0) {
            return;
        }
        for (class187 var2 = (class187) this.field2973.field2986.method3603(); var2 != null; var2 = (class187) this.field2973.field2986.method3596()) {
            if (var2.field3005 == arg0 && this.field2947[arg0][var2.field2994] == null && var2.field3003 < 0) {
                var2.field3003 = 0;
            }
        }
    }

    @ObfuscatedName("gn.aq(II)V")
    public void method3427(int arg0) {
        if ((this.field2964[arg0] & 0x4) == 0) {
            return;
        }
        for (class187 var2 = (class187) this.field2973.field2986.method3603(); var2 != null; var2 = (class187) this.field2973.field2986.method3596()) {
            if (var2.field3005 == arg0) {
                var2.field3009 = 0;
            }
        }
    }

    @ObfuscatedName("gn.aj(II)V")
    public void method3493(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3423(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3416(var6, var7, var8);
            } else {
                this.method3423(var6, var7, 64);
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
                this.field2957[var12] = (var14 << 7) + (this.field2957[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2957[var12] = (this.field2957[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2962[var12] = (var14 << 7) + (this.field2962[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2962[var12] = (this.field2962[var12] & 0xFFFFFF80) + var14;
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
                    this.field2964[var12] |= 0x1;
                } else {
                    this.field2964[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2964[var12] |= 0x2;
                } else {
                    this.method3426(var12);
                    this.field2964[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2965[var12] = (var14 << 7) + (this.field2965[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2965[var12] = (this.field2965[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2965[var12] = (var14 << 7) + (this.field2965[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2965[var12] = (this.field2965[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3422(var12);
            }
            if (var13 == 121) {
                this.method3448(var12);
            }
            if (var13 == 123) {
                this.method3424(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2965[var12];
                if (var15 == 16384) {
                    this.field2961[var12] = (var14 << 7) + (this.field2961[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2965[var12];
                if (var16 == 16384) {
                    this.field2961[var12] = (this.field2961[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2960[var12] = (var14 << 7) + (this.field2960[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2960[var12] = (this.field2960[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2964[var12] |= 0x4;
                } else {
                    this.method3427(var12);
                    this.field2964[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3444(var12, (var14 << 7) + (this.field2969[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3444(var12, (this.field2969[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3415(var17, this.field2955[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3420(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method3421(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3425();
            }
        }
    }

    @ObfuscatedName("gn.am(III)V")
    public void method3444(int arg0, int arg1) {
        this.field2969[arg0] = arg1;
        this.field2948[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("gn.av(Lgk;I)I")
    public int method3430(class187 arg0) {
        int var2 = (arg0.field2998 * arg0.field2993 >> 12) + arg0.field2997;
        int var3 = ((this.field2956[arg0.field3005] - 8192) * this.field2961[arg0.field3005] >> 12) + var2;
        class185 var4 = arg0.field2992;
        if (var4.field2982 > 0 && (var4.field2981 > 0 || this.field2957[arg0.field3005] > 0)) {
            int var5 = var4.field2981 << 2;
            int var6 = var4.field2984 << 1;
            if (arg0.field2999 < var6) {
                var5 = arg0.field2999 * var5 / var6;
            }
            int var7 = (this.field2957[arg0.field3005] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2995 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2991.field1225 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1189 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("gn.ap(Lgk;I)I")
    public int method3431(class187 arg0) {
        class185 var2 = arg0.field2992;
        int var3 = this.field2952[arg0.field3005] * this.field2950[arg0.field3005] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field3008 * var4 + 16384 >> 15;
        int var6 = this.field2971 * var5 + 128 >> 8;
        if (var2.field2975 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field3000 * 1.953125E-5D * (double) var2.field2975) + 0.5D);
        }
        if (var2.field2983 != null) {
            int var7 = arg0.field3011;
            int var8 = var2.field2983[arg0.field2996 + 1];
            if (arg0.field2996 < var2.field2983.length - 2) {
                int var9 = (var2.field2983[arg0.field2996] & 0xFF) << 8;
                int var10 = (var2.field2983[arg0.field2996 + 2] & 0xFF) << 8;
                var8 += (var2.field2983[arg0.field2996 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field3003 > 0 && var2.field2976 != null) {
            int var11 = arg0.field3003;
            int var12 = var2.field2976[arg0.field3004 + 1];
            if (arg0.field3004 < var2.field2976.length - 2) {
                int var13 = (var2.field2976[arg0.field3004] & 0xFF) << 8;
                int var14 = (var2.field2976[arg0.field3004 + 2] & 0xFF) << 8;
                var12 += (var2.field2976[arg0.field3004 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("gn.ac(Lgk;I)I")
    public int method3432(class187 arg0) {
        int var2 = this.field2951[arg0.field3005];
        return var2 < 8192 ? arg0.field3001 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field3001) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("gn.l()Lby;")
    public synchronized class67 method1174() {
        return this.field2973;
    }

    @ObfuscatedName("gn.m()Lby;")
    public synchronized class67 method1149() {
        return null;
    }

    @ObfuscatedName("gn.p()I")
    public synchronized int method1177() {
        return 0;
    }

    @ObfuscatedName("gn.u([III)V")
    public synchronized void method1151(int[] arg0, int arg1, int arg2) {
        if (this.field2967.method3356()) {
            int var4 = this.field2963 * this.field2967.field2926 / Statics.field1189;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2954;
                if (this.field2972 - var5 >= 0L) {
                    this.field2954 = var5;
                    break;
                }
                int var7 = (int) ((this.field2972 - this.field2954 + (long) var4 - 1L) / (long) var4);
                this.field2954 += (long) var4 * (long) var7;
                this.field2973.method1151(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3434();
            } while (this.field2967.method3356());
        }
        this.field2973.method1151(arg0, arg1, arg2);
    }

    @ObfuscatedName("gn.v(I)V")
    public synchronized void method1173(int arg0) {
        if (this.field2967.method3356()) {
            int var2 = this.field2963 * this.field2967.field2926 / Statics.field1189;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2954;
                if (this.field2972 - var3 >= 0L) {
                    this.field2954 = var3;
                    break;
                }
                int var5 = (int) ((this.field2972 - this.field2954 + (long) var2 - 1L) / (long) var2);
                this.field2954 += (long) var2 * (long) var5;
                this.field2973.method1173(var5);
                arg0 -= var5;
                this.method3434();
            } while (this.field2967.method3356());
        }
        this.field2973.method1173(arg0);
    }

    @ObfuscatedName("gn.as(I)V")
    public void method3434() {
        int var1 = this.field2953;
        int var2 = this.field2970;
        long var3 = this.field2972;
        while (this.field2970 == var2) {
            while (this.field2967.field2935[var1] == var2) {
                this.field2967.method3372(var1);
                int var5 = this.field2967.method3368(var1);
                if (var5 == 1) {
                    this.field2967.method3345();
                    this.field2967.method3344(var1);
                    if (this.field2967.method3351()) {
                        if (!this.field2968 || var2 == 0) {
                            this.method3425();
                            this.field2967.method3376();
                            return;
                        }
                        this.field2967.method3352(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3493(var5);
                }
                this.field2967.method3346(var1);
                this.field2967.method3344(var1);
            }
            var1 = this.field2967.method3350();
            var2 = this.field2967.field2935[var1];
            var3 = this.field2967.method3349(var2);
        }
        this.field2953 = var1;
        this.field2970 = var2;
        this.field2972 = var3;
    }

    @ObfuscatedName("gn.at(Lgk;I)Z")
    public boolean method3470(class187 arg0) {
        if (arg0.field3007 != null) {
            return false;
        }
        if (arg0.field3003 >= 0) {
            arg0.method3693();
            if (arg0.field3002 > 0 && this.field2966[arg0.field3005][arg0.field3002] == arg0) {
                this.field2966[arg0.field3005][arg0.field3002] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("gn.bt(Lgk;[IIIS)Z")
    public boolean method3438(class187 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field3006 = Statics.field1189 / 100;
        if (arg0.field3003 >= 0 && arg0.field3007 == null || arg0.field3007.method1369()) {
            arg0.method3520();
            arg0.method3693();
            if (arg0.field3002 > 0 && this.field2966[arg0.field3005][arg0.field3002] == arg0) {
                this.field2966[arg0.field3005][arg0.field3002] = null;
            }
            return true;
        }
        int var5 = arg0.field2993;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2962[arg0.field3005] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2993 = var6;
        }
        arg0.field3007.method1403(this.method3430(arg0));
        class185 var7 = arg0.field2992;
        boolean var8 = false;
        arg0.field2999++;
        arg0.field2995 += var7.field2982;
        double var9 = (double) ((arg0.field2994 - 60 << 8) + (arg0.field2998 * arg0.field2993 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2975 > 0) {
            if (var7.field2980 > 0) {
                arg0.field3000 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2980 * var9) + 0.5D);
            } else {
                arg0.field3000 += 128;
            }
        }
        if (var7.field2983 != null) {
            if (var7.field2978 > 0) {
                arg0.field3011 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2978 * var9) + 0.5D);
            } else {
                arg0.field3011 += 128;
            }
            while (arg0.field2996 < var7.field2983.length - 2 && arg0.field3011 > (var7.field2983[arg0.field2996 + 2] & 0xFF) << 8) {
                arg0.field2996 += 2;
            }
            if (arg0.field2996 == var7.field2983.length - 2 && var7.field2983[arg0.field2996 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field3003 >= 0 && var7.field2976 != null && (this.field2964[arg0.field3005] & 0x1) == 0 && (arg0.field3002 < 0 || this.field2966[arg0.field3005][arg0.field3002] != arg0)) {
            if (var7.field2977 > 0) {
                arg0.field3003 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2977 * var9) + 0.5D);
            } else {
                arg0.field3003 += 128;
            }
            while (arg0.field3004 < var7.field2976.length - 2 && arg0.field3003 > (var7.field2976[arg0.field3004 + 2] & 0xFF) << 8) {
                arg0.field3004 += 2;
            }
            if (arg0.field3004 == var7.field2976.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field3007.method1377(arg0.field3006, this.method3431(arg0), this.method3432(arg0));
            return false;
        }
        arg0.field3007.method1320(arg0.field3006);
        if (arg1 == null) {
            arg0.field3007.method1173(arg3);
        } else {
            arg0.field3007.method1151(arg1, arg2, arg3);
        }
        if (arg0.field3007.method1324()) {
            this.field2973.field2987.method1143(arg0.field3007);
        }
        arg0.method3520();
        if (arg0.field3003 >= 0) {
            arg0.method3693();
            if (arg0.field3002 > 0 && this.field2966[arg0.field3005][arg0.field3002] == arg0) {
                this.field2966[arg0.field3005][arg0.field3002] = null;
            }
        }
        return true;
    }
}
