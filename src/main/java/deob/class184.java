package deob;

@ObfuscatedName("gt")
public class class184 extends class67 {

    @ObfuscatedName("gt.l")
    public class196 field2957 = new class196(128);

    @ObfuscatedName("gt.e")
    public int field2949 = 256;

    @ObfuscatedName("gt.q")
    public int field2970 = 1000000;

    @ObfuscatedName("gt.o")
    public int[] field2969 = new int[16];

    @ObfuscatedName("gt.g")
    public int[] field2952 = new int[16];

    @ObfuscatedName("gt.m")
    public int[] field2961 = new int[16];

    @ObfuscatedName("gt.b")
    public int[] field2954 = new int[16];

    @ObfuscatedName("gt.p")
    public int[] field2948 = new int[16];

    @ObfuscatedName("gt.t")
    public int[] field2956 = new int[16];

    @ObfuscatedName("gt.x")
    public int[] field2953 = new int[16];

    @ObfuscatedName("gt.k")
    public int[] field2950 = new int[16];

    @ObfuscatedName("gt.z")
    public int[] field2959 = new int[16];

    @ObfuscatedName("gt.u")
    public int[] field2960 = new int[16];

    @ObfuscatedName("gt.a")
    public int[] field2951 = new int[16];

    @ObfuscatedName("gt.h")
    public int[] field2962 = new int[16];

    @ObfuscatedName("gt.y")
    public int[] field2963 = new int[16];

    @ObfuscatedName("gt.d")
    public int[] field2964 = new int[16];

    @ObfuscatedName("gt.n")
    public int[] field2965 = new int[16];

    @ObfuscatedName("gt.i")
    public class187[][] field2966 = new class187[16][128];

    @ObfuscatedName("gt.ad")
    public class187[][] field2967 = new class187[16][128];

    @ObfuscatedName("gt.aq")
    public class182 field2955 = new class182();

    @ObfuscatedName("gt.ak")
    public boolean field2975;

    @ObfuscatedName("gt.au")
    public int field2968;

    @ObfuscatedName("gt.ao")
    public int field2971;

    @ObfuscatedName("gt.am")
    public long field2972;

    @ObfuscatedName("gt.ah")
    public long field2973;

    @ObfuscatedName("gt.aj")
    public class186 field2974 = new class186(this);

    public class184() {
        this.method3378();
    }

    @ObfuscatedName("gt.l(II)V")
    public synchronized void method3360(int arg0) {
        this.field2949 = arg0;
    }

    @ObfuscatedName("gt.e(I)I")
    public int method3361() {
        return this.field2949;
    }

    @ObfuscatedName("gt.q(Lfh;Lfo;Lbk;IS)Z")
    public synchronized boolean method3362(class180 arg0, class167 arg1, class60 arg2, int arg3) {
        arg0.method3277();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class197 var7 = (class197) arg0.field2908.method3512(); var7 != null; var7 = (class197) arg0.field2908.method3513()) {
            int var8 = (int) var7.field3107;
            class181 var9 = (class181) this.field2957.method3509((long) var8);
            if (var9 == null) {
                var9 = class181.method116(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field2957.method3518(var9, (long) var8);
            }
            if (!var9.method3289(arg2, var7.field3085, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3284();
        }
        return var5;
    }

    @ObfuscatedName("gt.o(B)V")
    public synchronized void method3363() {
        for (class181 var1 = (class181) this.field2957.method3512(); var1 != null; var1 = (class181) this.field2957.method3513()) {
            var1.method3290();
        }
    }

    @ObfuscatedName("gt.g(I)V")
    public synchronized void method3408() {
        for (class181 var1 = (class181) this.field2957.method3512(); var1 != null; var1 = (class181) this.field2957.method3513()) {
            var1.method3620();
        }
    }

    @ObfuscatedName("gt.w(Lfh;ZI)V")
    public synchronized void method3365(class180 arg0, boolean arg1) {
        this.method3366();
        this.field2955.method3337(arg0.field2909);
        this.field2975 = arg1;
        this.field2972 = 0L;
        int var3 = this.field2955.method3302();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2955.method3312(var4);
            this.field2955.method3306(var4);
            this.field2955.method3304(var4);
        }
        this.field2968 = this.field2955.method3311();
        this.field2971 = this.field2955.field2935[this.field2968];
        this.field2973 = this.field2955.method3310(this.field2971);
    }

    @ObfuscatedName("gt.k(I)V")
    public synchronized void method3366() {
        this.field2955.method3300();
        this.method3378();
    }

    @ObfuscatedName("gt.z(I)Z")
    public synchronized boolean method3389() {
        return this.field2955.method3301();
    }

    @ObfuscatedName("gt.v(IIB)V")
    public synchronized void method3429(int arg0, int arg1) {
        this.method3383(arg0, arg1);
    }

    @ObfuscatedName("gt.j(III)V")
    public void method3383(int arg0, int arg1) {
        this.field2954[arg0] = arg1;
        this.field2956[arg0] = arg1 & 0xFFFFFF80;
        this.method3370(arg0, arg1);
    }

    @ObfuscatedName("gt.f(IIB)V")
    public void method3370(int arg0, int arg1) {
        if (this.field2948[arg0] != arg1) {
            this.field2948[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2967[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("gt.c(IIII)V")
    public void method3371(int arg0, int arg1, int arg2) {
        this.method3364(arg0, arg1, 64);
        if ((this.field2960[arg0] & 0x2) != 0) {
            for (class187 var4 = (class187) this.field2974.field2986.method3545(); var4 != null; var4 = (class187) this.field2974.field2986.method3547()) {
                if (var4.field2999 == arg0 && var4.field2992 < 0) {
                    this.field2966[arg0][var4.field3008] = null;
                    this.field2966[arg0][arg1] = var4;
                    int var5 = (var4.field3000 * var4.field2997 >> 12) + var4.field2998;
                    var4.field2998 += arg1 - var4.field3008 << 8;
                    var4.field2997 = var5 - var4.field2998;
                    var4.field3000 = 4096;
                    var4.field3008 = arg1;
                    return;
                }
            }
        }
        class181 var6 = (class181) this.field2957.method3509((long) this.field2948[arg0]);
        if (var6 == null) {
            return;
        }
        class63 var7 = var6.field2911[arg1];
        if (var7 == null) {
            return;
        }
        class187 var8 = new class187();
        var8.field2999 = arg0;
        var8.field3004 = var6;
        var8.field3009 = var7;
        var8.field2993 = var6.field2915[arg1];
        var8.field2994 = var6.field2916[arg1];
        var8.field3008 = arg1;
        var8.field2996 = var6.field2910 * arg2 * arg2 * var6.field2917[arg1] + 1024 >> 11;
        var8.field3005 = var6.field2914[arg1] & 0xFF;
        var8.field2998 = (arg1 << 8) - (var6.field2913[arg1] & 0x7FFF);
        var8.field3001 = 0;
        var8.field3002 = 0;
        var8.field3003 = 0;
        var8.field2992 = -1;
        var8.field2990 = 0;
        if (this.field2963[arg0] == 0) {
            var8.field2995 = class65.method1293(var7, this.method3401(var8), this.method3386(var8), this.method3384(var8));
        } else {
            var8.field2995 = class65.method1293(var7, this.method3401(var8), 0, this.method3384(var8));
            this.method3372(var8, var6.field2913[arg1] < 0);
        }
        if (var6.field2913[arg1] < 0) {
            var8.field2995.method1295(-1);
        }
        if (var8.field2994 >= 0) {
            class187 var9 = this.field2967[arg0][var8.field2994];
            if (var9 != null && var9.field2992 < 0) {
                this.field2966[arg0][var9.field3008] = null;
                var9.field2992 = 0;
            }
            this.field2967[arg0][var8.field2994] = var8;
        }
        this.field2974.field2986.method3567(var8);
        this.field2966[arg0][arg1] = var8;
    }

    @ObfuscatedName("gt.s(Lgm;ZS)V")
    public void method3372(class187 arg0, boolean arg1) {
        int var3 = arg0.field3009.field1217.length;
        int var5;
        if (arg1 && arg0.field3009.field1216) {
            int var4 = var3 + var3 - arg0.field3009.field1220;
            var5 = (int) ((long) this.field2963[arg0.field2999] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2995.method1302(true);
            }
        } else {
            var5 = (int) ((long) this.field2963[arg0.field2999] * (long) var3 >> 6);
        }
        arg0.field2995.method1411(var5);
    }

    @ObfuscatedName("gt.r(IIII)V")
    public void method3364(int arg0, int arg1, int arg2) {
        class187 var4 = this.field2966[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2966[arg0][arg1] = null;
        if ((this.field2960[arg0] & 0x2) == 0) {
            var4.field2992 = 0;
            return;
        }
        for (class187 var5 = (class187) this.field2974.field2986.method3544(); var5 != null; var5 = (class187) this.field2974.field2986.method3538()) {
            if (var4.field2999 == var5.field2999 && var5.field2992 < 0 && var4 != var5) {
                var4.field2992 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("gt.u(IIII)V")
    public void method3413(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("gt.a(III)V")
    public void method3399(int arg0, int arg1) {
    }

    @ObfuscatedName("gt.ay(IIB)V")
    public void method3391(int arg0, int arg1) {
        this.field2953[arg0] = arg1;
    }

    @ObfuscatedName("gt.ag(IS)V")
    public void method3375(int arg0) {
        for (class187 var2 = (class187) this.field2974.field2986.method3544(); var2 != null; var2 = (class187) this.field2974.field2986.method3538()) {
            if (arg0 < 0 || var2.field2999 == arg0) {
                if (var2.field2995 != null) {
                    var2.field2995.method1306(Statics.field1167 / 100);
                    if (var2.field2995.method1313()) {
                        this.field2974.field2985.method1137(var2.field2995);
                    }
                    var2.method3472();
                }
                if (var2.field2992 < 0) {
                    this.field2966[var2.field2999][var2.field3008] = null;
                }
                var2.method3620();
            }
        }
    }

    @ObfuscatedName("gt.ab(IS)V")
    public void method3376(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3376(var2);
            }
            return;
        }
        this.field2969[arg0] = 12800;
        this.field2952[arg0] = 8192;
        this.field2961[arg0] = 16383;
        this.field2953[arg0] = 8192;
        this.field2950[arg0] = 0;
        this.field2959[arg0] = 8192;
        this.method3379(arg0);
        this.method3380(arg0);
        this.field2960[arg0] = 0;
        this.field2951[arg0] = 32767;
        this.field2962[arg0] = 256;
        this.field2963[arg0] = 0;
        this.method3369(arg0, 8192);
    }

    @ObfuscatedName("gt.ac(IB)V")
    public void method3377(int arg0) {
        for (class187 var2 = (class187) this.field2974.field2986.method3544(); var2 != null; var2 = (class187) this.field2974.field2986.method3538()) {
            if ((arg0 < 0 || var2.field2999 == arg0) && var2.field2992 < 0) {
                this.field2966[var2.field2999][var2.field3008] = null;
                var2.field2992 = 0;
            }
        }
    }

    @ObfuscatedName("gt.as(B)V")
    public void method3378() {
        this.method3375(-1);
        this.method3376(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2948[var1] = this.field2954[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2956[var2] = this.field2954[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("gt.ai(II)V")
    public void method3379(int arg0) {
        if ((this.field2960[arg0] & 0x2) == 0) {
            return;
        }
        for (class187 var2 = (class187) this.field2974.field2986.method3544(); var2 != null; var2 = (class187) this.field2974.field2986.method3538()) {
            if (var2.field2999 == arg0 && this.field2966[arg0][var2.field3008] == null && var2.field2992 < 0) {
                var2.field2992 = 0;
            }
        }
    }

    @ObfuscatedName("gt.an(II)V")
    public void method3380(int arg0) {
        if ((this.field2960[arg0] & 0x4) == 0) {
            return;
        }
        for (class187 var2 = (class187) this.field2974.field2986.method3544(); var2 != null; var2 = (class187) this.field2974.field2986.method3538()) {
            if (var2.field2999 == arg0) {
                var2.field3010 = 0;
            }
        }
    }

    @ObfuscatedName("gt.ap(II)V")
    public void method3381(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3364(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3371(var6, var7, var8);
            } else {
                this.method3364(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3413(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2956[var12] = (var14 << 14) + (this.field2956[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2956[var12] = (var14 << 7) + (this.field2956[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2950[var12] = (var14 << 7) + (this.field2950[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2950[var12] = (this.field2950[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2959[var12] = (var14 << 7) + (this.field2959[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2959[var12] = (this.field2959[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2969[var12] = (var14 << 7) + (this.field2969[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2969[var12] = (this.field2969[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2952[var12] = (var14 << 7) + (this.field2952[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2952[var12] = (this.field2952[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2961[var12] = (var14 << 7) + (this.field2961[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2961[var12] = (this.field2961[var12] & 0xFFFFFF80) + var14;
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
                    this.method3379(var12);
                    this.field2960[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2951[var12] = (var14 << 7) + (this.field2951[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2951[var12] = (this.field2951[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2951[var12] = (var14 << 7) + (this.field2951[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2951[var12] = (this.field2951[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3375(var12);
            }
            if (var13 == 121) {
                this.method3376(var12);
            }
            if (var13 == 123) {
                this.method3377(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2951[var12];
                if (var15 == 16384) {
                    this.field2962[var12] = (var14 << 7) + (this.field2962[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2951[var12];
                if (var16 == 16384) {
                    this.field2962[var12] = (this.field2962[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2963[var12] = (var14 << 7) + (this.field2963[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2963[var12] = (this.field2963[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2960[var12] |= 0x4;
                } else {
                    this.method3380(var12);
                    this.field2960[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3369(var12, (var14 << 7) + (this.field2964[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3369(var12, (this.field2964[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3370(var17, this.field2956[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3399(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method3391(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3378();
            }
        }
    }

    @ObfuscatedName("gt.aa(III)V")
    public void method3369(int arg0, int arg1) {
        this.field2964[arg0] = arg1;
        this.field2965[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("gt.ax(Lgm;B)I")
    public int method3401(class187 arg0) {
        int var2 = (arg0.field3000 * arg0.field2997 >> 12) + arg0.field2998;
        int var3 = ((this.field2953[arg0.field2999] - 8192) * this.field2962[arg0.field2999] >> 12) + var2;
        class185 var4 = arg0.field2993;
        if (var4.field2980 > 0 && (var4.field2982 > 0 || this.field2950[arg0.field2999] > 0)) {
            int var5 = var4.field2982 << 2;
            int var6 = var4.field2976 << 1;
            if (arg0.field3006 < var6) {
                var5 = arg0.field3006 * var5 / var6;
            }
            int var7 = (this.field2950[arg0.field2999] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field3007 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field3009.field1219 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1167 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("gt.av(Lgm;I)I")
    public int method3386(class187 arg0) {
        class185 var2 = arg0.field2993;
        int var3 = this.field2969[arg0.field2999] * this.field2961[arg0.field2999] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2996 * var4 + 16384 >> 15;
        int var6 = this.field2949 * var5 + 128 >> 8;
        if (var2.field2978 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field3001 * 1.953125E-5D * (double) var2.field2978) + 0.5D);
        }
        if (var2.field2979 != null) {
            int var7 = arg0.field3002;
            int var8 = var2.field2979[arg0.field3003 + 1];
            if (arg0.field3003 < var2.field2979.length - 2) {
                int var9 = (var2.field2979[arg0.field3003] & 0xFF) << 8;
                int var10 = (var2.field2979[arg0.field3003 + 2] & 0xFF) << 8;
                var8 += (var2.field2979[arg0.field3003 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2992 > 0 && var2.field2977 != null) {
            int var11 = arg0.field2992;
            int var12 = var2.field2977[arg0.field2990 + 1];
            if (arg0.field2990 < var2.field2977.length - 2) {
                int var13 = (var2.field2977[arg0.field2990] & 0xFF) << 8;
                int var14 = (var2.field2977[arg0.field2990 + 2] & 0xFF) << 8;
                var12 += (var2.field2977[arg0.field2990 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("gt.at(Lgm;I)I")
    public int method3384(class187 arg0) {
        int var2 = this.field2952[arg0.field2999];
        return var2 < 8192 ? arg0.field3005 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field3005) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("gt.m()Lbt;")
    public synchronized class67 method1142() {
        return this.field2974;
    }

    @ObfuscatedName("gt.b()Lbt;")
    public synchronized class67 method1143() {
        return null;
    }

    @ObfuscatedName("gt.p()I")
    public synchronized int method1144() {
        return 0;
    }

    @ObfuscatedName("gt.t([III)V")
    public synchronized void method1165(int[] arg0, int arg1, int arg2) {
        if (this.field2955.method3301()) {
            int var4 = this.field2970 * this.field2955.field2928 / Statics.field1167;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2972;
                if (this.field2973 - var5 >= 0L) {
                    this.field2972 = var5;
                    break;
                }
                int var7 = (int) ((this.field2973 - this.field2972 + (long) var4 - 1L) / (long) var4);
                this.field2972 += (long) var4 * (long) var7;
                this.field2974.method1165(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3387();
            } while (this.field2955.method3301());
        }
        this.field2974.method1165(arg0, arg1, arg2);
    }

    @ObfuscatedName("gt.x(I)V")
    public synchronized void method1147(int arg0) {
        if (this.field2955.method3301()) {
            int var2 = this.field2970 * this.field2955.field2928 / Statics.field1167;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2972;
                if (this.field2973 - var3 >= 0L) {
                    this.field2972 = var3;
                    break;
                }
                int var5 = (int) ((this.field2973 - this.field2972 + (long) var2 - 1L) / (long) var2);
                this.field2972 += (long) var2 * (long) var5;
                this.field2974.method1147(var5);
                arg0 -= var5;
                this.method3387();
            } while (this.field2955.method3301());
        }
        this.field2974.method1147(arg0);
    }

    @ObfuscatedName("gt.aw(S)V")
    public void method3387() {
        int var1 = this.field2968;
        int var2 = this.field2971;
        long var3 = this.field2973;
        while (this.field2971 == var2) {
            while (this.field2955.field2935[var1] == var2) {
                this.field2955.method3312(var1);
                int var5 = this.field2955.method3307(var1);
                if (var5 == 1) {
                    this.field2955.method3305();
                    this.field2955.method3304(var1);
                    if (this.field2955.method3334()) {
                        if (!this.field2975 || var2 == 0) {
                            this.method3378();
                            this.field2955.method3300();
                            return;
                        }
                        this.field2955.method3338(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3381(var5);
                }
                this.field2955.method3306(var1);
                this.field2955.method3304(var1);
            }
            var1 = this.field2955.method3311();
            var2 = this.field2955.field2935[var1];
            var3 = this.field2955.method3310(var2);
        }
        this.field2968 = var1;
        this.field2971 = var2;
        this.field2973 = var3;
    }

    @ObfuscatedName("gt.af(Lgm;I)Z")
    public boolean method3388(class187 arg0) {
        if (arg0.field2995 != null) {
            return false;
        }
        if (arg0.field2992 >= 0) {
            arg0.method3620();
            if (arg0.field2994 > 0 && this.field2967[arg0.field2999][arg0.field2994] == arg0) {
                this.field2967[arg0.field2999][arg0.field2994] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("gt.bz(Lgm;[IIII)Z")
    public boolean method3431(class187 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2991 = Statics.field1167 / 100;
        if (arg0.field2992 >= 0 && arg0.field2995 == null || arg0.field2995.method1309()) {
            arg0.method3472();
            arg0.method3620();
            if (arg0.field2994 > 0 && this.field2967[arg0.field2999][arg0.field2994] == arg0) {
                this.field2967[arg0.field2999][arg0.field2994] = null;
            }
            return true;
        }
        int var5 = arg0.field3000;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2959[arg0.field2999] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field3000 = var6;
        }
        arg0.field2995.method1339(this.method3401(arg0));
        class185 var7 = arg0.field2993;
        boolean var8 = false;
        arg0.field3006++;
        arg0.field3007 += var7.field2980;
        double var9 = (double) ((arg0.field3008 - 60 << 8) + (arg0.field3000 * arg0.field2997 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2978 > 0) {
            if (var7.field2981 > 0) {
                arg0.field3001 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2981 * var9) + 0.5D);
            } else {
                arg0.field3001 += 128;
            }
        }
        if (var7.field2979 != null) {
            if (var7.field2983 > 0) {
                arg0.field3002 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2983 * var9) + 0.5D);
            } else {
                arg0.field3002 += 128;
            }
            while (arg0.field3003 < var7.field2979.length - 2 && arg0.field3002 > (var7.field2979[arg0.field3003 + 2] & 0xFF) << 8) {
                arg0.field3003 += 2;
            }
            if (arg0.field3003 == var7.field2979.length - 2 && var7.field2979[arg0.field3003 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2992 >= 0 && var7.field2977 != null && (this.field2960[arg0.field2999] & 0x1) == 0 && (arg0.field2994 < 0 || this.field2967[arg0.field2999][arg0.field2994] != arg0)) {
            if (var7.field2984 > 0) {
                arg0.field2992 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2984 * var9) + 0.5D);
            } else {
                arg0.field2992 += 128;
            }
            while (arg0.field2990 < var7.field2977.length - 2 && arg0.field2992 > (var7.field2977[arg0.field2990 + 2] & 0xFF) << 8) {
                arg0.field2990 += 2;
            }
            if (arg0.field2990 == var7.field2977.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2995.method1357(arg0.field2991, this.method3386(arg0), this.method3384(arg0));
            return false;
        }
        arg0.field2995.method1306(arg0.field2991);
        if (arg1 == null) {
            arg0.field2995.method1147(arg3);
        } else {
            arg0.field2995.method1165(arg1, arg2, arg3);
        }
        if (arg0.field2995.method1313()) {
            this.field2974.field2985.method1137(arg0.field2995);
        }
        arg0.method3472();
        if (arg0.field2992 >= 0) {
            arg0.method3620();
            if (arg0.field2994 > 0 && this.field2967[arg0.field2999][arg0.field2994] == arg0) {
                this.field2967[arg0.field2999][arg0.field2994] = null;
            }
        }
        return true;
    }
}
