package deob;

@ObfuscatedName("jw")
public class class275 extends class46 {

    @ObfuscatedName("jw.o")
    public class421 field3257 = new class421(128);

    @ObfuscatedName("jw.q")
    public int field3244 = 256;

    @ObfuscatedName("jw.l")
    public int field3265 = 1000000;

    @ObfuscatedName("jw.k")
    public int[] field3246 = new int[16];

    @ObfuscatedName("jw.a")
    public int[] field3247 = new int[16];

    @ObfuscatedName("jw.m")
    public int[] field3270 = new int[16];

    @ObfuscatedName("jw.p")
    public int[] field3249 = new int[16];

    @ObfuscatedName("jw.s")
    public int[] field3250 = new int[16];

    @ObfuscatedName("jw.r")
    public int[] field3251 = new int[16];

    @ObfuscatedName("jw.v")
    public int[] field3252 = new int[16];

    @ObfuscatedName("jw.y")
    public int[] field3253 = new int[16];

    @ObfuscatedName("jw.c")
    public int[] field3254 = new int[16];

    @ObfuscatedName("jw.h")
    public int[] field3248 = new int[16];

    @ObfuscatedName("jw.f")
    public int[] field3243 = new int[16];

    @ObfuscatedName("jw.d")
    public int[] field3266 = new int[16];

    @ObfuscatedName("jw.j")
    public int[] field3258 = new int[16];

    @ObfuscatedName("jw.z")
    public int[] field3262 = new int[16];

    @ObfuscatedName("jw.i")
    public int[] field3260 = new int[16];

    @ObfuscatedName("jw.u")
    public class280[][] field3259 = new class280[16][128];

    @ObfuscatedName("jw.ag")
    public class280[][] field3256 = new class280[16][128];

    @ObfuscatedName("jw.ar")
    public class276 field3261 = new class276();

    @ObfuscatedName("jw.am")
    public boolean field3264;

    @ObfuscatedName("jw.ac")
    public int field3255;

    @ObfuscatedName("jw.ab")
    public int field3263;

    @ObfuscatedName("jw.aj")
    public long field3267;

    @ObfuscatedName("jw.ae")
    public long field3268;

    @ObfuscatedName("jw.az")
    public class278 field3269 = new class278(this);

    public class275() {
        this.method4676();
    }

    @ObfuscatedName("jw.o(IS)V")
    public synchronized void method4657(int arg0) {
        this.field3244 = arg0;
    }

    @ObfuscatedName("jw.q(I)I")
    public int method4658() {
        return this.field3244;
    }

    @ObfuscatedName("jw.l(Ljy;Llp;Lan;IB)Z")
    public synchronized boolean method4659(class279 arg0, class316 arg1, class43 arg2, int arg3) {
        arg0.method4856();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class408 var7 = (class408) arg0.field3301.method6698(); var7 != null; var7 = (class408) arg0.field3301.method6690()) {
            int var8 = (int) var7.field4468;
            class277 var9 = (class277) this.field3257.method6687((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method5195(var8);
                class277 var11;
                if (var10 == null) {
                    var11 = null;
                } else {
                    var11 = new class277(var10);
                }
                var9 = var11;
                if (var11 == null) {
                    var5 = false;
                    continue;
                }
                this.field3257.method6688(var11, (long) var8);
            }
            if (!var9.method4834(arg2, var7.field4463, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method4852();
        }
        return var5;
    }

    @ObfuscatedName("jw.k(I)V")
    public synchronized void method4660() {
        for (class277 var1 = (class277) this.field3257.method6698(); var1 != null; var1 = (class277) this.field3257.method6690()) {
            var1.method4836();
        }
    }

    @ObfuscatedName("jw.a(I)V")
    public synchronized void method4732() {
        for (class277 var1 = (class277) this.field3257.method6698(); var1 != null; var1 = (class277) this.field3257.method6690()) {
            var1.method6399();
        }
    }

    @ObfuscatedName("jw.v(Ljy;ZI)V")
    public synchronized void method4769(class279 arg0, boolean arg1) {
        this.method4663();
        this.field3261.method4779(arg0.field3302);
        this.field3264 = arg1;
        this.field3267 = 0L;
        int var3 = this.field3261.method4782();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3261.method4777(var4);
            this.field3261.method4805(var4);
            this.field3261.method4784(var4);
        }
        this.field3255 = this.field3261.method4817();
        this.field3263 = this.field3261.field3276[this.field3255];
        this.field3268 = this.field3261.method4789(this.field3263);
    }

    @ObfuscatedName("jw.c(S)V")
    public synchronized void method4663() {
        this.field3261.method4793();
        this.method4676();
    }

    @ObfuscatedName("jw.w(I)Z")
    public synchronized boolean method4664() {
        return this.field3261.method4781();
    }

    @ObfuscatedName("jw.b(III)V")
    public synchronized void method4716(int arg0, int arg1) {
        this.method4746(arg0, arg1);
    }

    @ObfuscatedName("jw.t(III)V")
    public void method4746(int arg0, int arg1) {
        this.field3249[arg0] = arg1;
        this.field3251[arg0] = arg1 & 0xFFFFFF80;
        this.method4666(arg0, arg1);
    }

    @ObfuscatedName("jw.g(III)V")
    public void method4666(int arg0, int arg1) {
        if (this.field3250[arg0] != arg1) {
            this.field3250[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field3256[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("jw.x(IIII)V")
    public void method4774(int arg0, int arg1, int arg2) {
        this.method4725(arg0, arg1, 64);
        if ((this.field3248[arg0] & 0x2) != 0) {
            for (class280 var4 = (class280) this.field3269.field3297.method5418(); var4 != null; var4 = (class280) this.field3269.field3297.method5420()) {
                if (var4.field3309 == arg0 && var4.field3317 < 0) {
                    this.field3259[arg0][var4.field3308] = null;
                    this.field3259[arg0][arg1] = var4;
                    int var5 = (var4.field3310 * var4.field3303 >> 12) + var4.field3311;
                    var4.field3311 += arg1 - var4.field3308 << 8;
                    var4.field3310 = var5 - var4.field3311;
                    var4.field3303 = 4096;
                    var4.field3308 = arg1;
                    return;
                }
            }
        }
        class277 var6 = (class277) this.field3257.method6687((long) this.field3250[arg0]);
        if (var6 == null) {
            return;
        }
        class38 var7 = var6.field3287[arg1];
        if (var7 == null) {
            return;
        }
        class280 var8 = new class280();
        var8.field3309 = arg0;
        var8.field3304 = var6;
        var8.field3306 = var7;
        var8.field3307 = var6.field3292[arg1];
        var8.field3320 = var6.field3286[arg1];
        var8.field3308 = arg1;
        var8.field3312 = var6.field3289 * arg2 * arg2 * var6.field3291[arg1] + 1024 >> 11;
        var8.field3313 = var6.field3290[arg1] & 0xFF;
        var8.field3311 = (arg1 << 8) - (var6.field3288[arg1] & 0x7FFF);
        var8.field3314 = 0;
        var8.field3315 = 0;
        var8.field3316 = 0;
        var8.field3317 = -1;
        var8.field3318 = 0;
        if (this.field3258[arg0] == 0) {
            var8.field3321 = class45.method798(var7, this.method4706(var8), this.method4682(var8), this.method4683(var8));
        } else {
            var8.field3321 = class45.method798(var7, this.method4706(var8), 0, this.method4683(var8));
            this.method4668(var8, var6.field3288[arg1] < 0);
        }
        if (var6.field3288[arg1] < 0) {
            var8.field3321.method773(-1);
        }
        if (var8.field3320 >= 0) {
            class280 var9 = this.field3256[arg0][var8.field3320];
            if (var9 != null && var9.field3317 < 0) {
                this.field3259[arg0][var9.field3308] = null;
                var9.field3317 = 0;
            }
            this.field3256[arg0][var8.field3320] = var8;
        }
        this.field3269.field3297.method5413(var8);
        this.field3259[arg0][arg1] = var8;
    }

    @ObfuscatedName("jw.n(Lji;ZI)V")
    public void method4668(class280 arg0, boolean arg1) {
        int var3 = arg0.field3306.field264.length;
        int var5;
        if (arg1 && arg0.field3306.field267) {
            int var4 = var3 + var3 - arg0.field3306.field265;
            var5 = (int) ((long) this.field3258[arg0.field3309] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field3321.method783(true);
            }
        } else {
            var5 = (int) ((long) this.field3258[arg0.field3309] * (long) var3 >> 6);
        }
        arg0.field3321.method779(var5);
    }

    @ObfuscatedName("jw.e(IIIB)V")
    public void method4725(int arg0, int arg1, int arg2) {
        class280 var4 = this.field3259[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field3259[arg0][arg1] = null;
        if ((this.field3248[arg0] & 0x2) == 0) {
            var4.field3317 = 0;
            return;
        }
        for (class280 var5 = (class280) this.field3269.field3297.method5431(); var5 != null; var5 = (class280) this.field3269.field3297.method5419()) {
            if (var4.field3309 == var5.field3309 && var5.field3317 < 0 && var4 != var5) {
                var4.field3317 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("jw.h(IIII)V")
    public void method4670(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("jw.f(III)V")
    public void method4665(int arg0, int arg1) {
    }

    @ObfuscatedName("jw.d(III)V")
    public void method4672(int arg0, int arg1) {
        this.field3252[arg0] = arg1;
    }

    @ObfuscatedName("jw.j(IB)V")
    public void method4673(int arg0) {
        for (class280 var2 = (class280) this.field3269.field3297.method5431(); var2 != null; var2 = (class280) this.field3269.field3297.method5419()) {
            if (arg0 < 0 || var2.field3309 == arg0) {
                if (var2.field3321 != null) {
                    var2.field3321.method784(Statics.field301 / 100);
                    if (var2.field3321.method891()) {
                        this.field3269.field3298.method628(var2.field3321);
                    }
                    var2.method4862();
                }
                if (var2.field3317 < 0) {
                    this.field3259[var2.field3309][var2.field3308] = null;
                }
                var2.method6399();
            }
        }
    }

    @ObfuscatedName("jw.z(II)V")
    public void method4687(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method4687(var2);
            }
            return;
        }
        this.field3246[arg0] = 12800;
        this.field3247[arg0] = 8192;
        this.field3270[arg0] = 16383;
        this.field3252[arg0] = 8192;
        this.field3253[arg0] = 0;
        this.field3254[arg0] = 8192;
        this.method4677(arg0);
        this.method4678(arg0);
        this.field3248[arg0] = 0;
        this.field3243[arg0] = 32767;
        this.field3266[arg0] = 256;
        this.field3258[arg0] = 0;
        this.method4703(arg0, 8192);
    }

    @ObfuscatedName("jw.ab(IB)V")
    public void method4675(int arg0) {
        for (class280 var2 = (class280) this.field3269.field3297.method5431(); var2 != null; var2 = (class280) this.field3269.field3297.method5419()) {
            if ((arg0 < 0 || var2.field3309 == arg0) && var2.field3317 < 0) {
                this.field3259[var2.field3309][var2.field3308] = null;
                var2.field3317 = 0;
            }
        }
    }

    @ObfuscatedName("jw.aj(I)V")
    public void method4676() {
        this.method4673(-1);
        this.method4687(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field3250[var1] = this.field3249[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field3251[var2] = this.field3249[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("jw.as(II)V")
    public void method4677(int arg0) {
        if ((this.field3248[arg0] & 0x2) == 0) {
            return;
        }
        for (class280 var2 = (class280) this.field3269.field3297.method5431(); var2 != null; var2 = (class280) this.field3269.field3297.method5419()) {
            if (var2.field3309 == arg0 && this.field3259[arg0][var2.field3308] == null && var2.field3317 < 0) {
                var2.field3317 = 0;
            }
        }
    }

    @ObfuscatedName("jw.au(II)V")
    public void method4678(int arg0) {
        if ((this.field3248[arg0] & 0x4) == 0) {
            return;
        }
        for (class280 var2 = (class280) this.field3269.field3297.method5431(); var2 != null; var2 = (class280) this.field3269.field3297.method5419()) {
            if (var2.field3309 == arg0) {
                var2.field3323 = 0;
            }
        }
    }

    @ObfuscatedName("jw.aq(II)V")
    public void method4679(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method4725(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method4774(var6, var7, var8);
            } else {
                this.method4725(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method4670(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field3251[var12] = (var14 << 14) + (this.field3251[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field3251[var12] = (var14 << 7) + (this.field3251[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field3253[var12] = (var14 << 7) + (this.field3253[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field3253[var12] = (this.field3253[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field3254[var12] = (var14 << 7) + (this.field3254[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field3254[var12] = (this.field3254[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field3246[var12] = (var14 << 7) + (this.field3246[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field3246[var12] = (this.field3246[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field3247[var12] = (var14 << 7) + (this.field3247[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field3247[var12] = (this.field3247[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field3270[var12] = (var14 << 7) + (this.field3270[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field3270[var12] = (this.field3270[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field3248[var12] |= 0x1;
                } else {
                    this.field3248[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field3248[var12] |= 0x2;
                } else {
                    this.method4677(var12);
                    this.field3248[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field3243[var12] = (var14 << 7) + (this.field3243[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field3243[var12] = (this.field3243[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field3243[var12] = (var14 << 7) + (this.field3243[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field3243[var12] = (this.field3243[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method4673(var12);
            }
            if (var13 == 121) {
                this.method4687(var12);
            }
            if (var13 == 123) {
                this.method4675(var12);
            }
            if (var13 == 6) {
                int var15 = this.field3243[var12];
                if (var15 == 16384) {
                    this.field3266[var12] = (var14 << 7) + (this.field3266[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field3243[var12];
                if (var16 == 16384) {
                    this.field3266[var12] = (this.field3266[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field3258[var12] = (var14 << 7) + (this.field3258[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field3258[var12] = (this.field3258[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field3248[var12] |= 0x4;
                } else {
                    this.method4678(var12);
                    this.field3248[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method4703(var12, (var14 << 7) + (this.field3262[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method4703(var12, (this.field3262[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method4666(var17, this.field3251[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method4665(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method4672(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method4676();
            }
        }
    }

    @ObfuscatedName("jw.ad(III)V")
    public void method4703(int arg0, int arg1) {
        this.field3262[arg0] = arg1;
        this.field3260[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("jw.an(Lji;I)I")
    public int method4706(class280 arg0) {
        int var2 = (arg0.field3310 * arg0.field3303 >> 12) + arg0.field3311;
        int var3 = ((this.field3252[arg0.field3309] - 8192) * this.field3266[arg0.field3309] >> 12) + var2;
        class273 var4 = arg0.field3307;
        if (var4.field3230 > 0 && (var4.field3229 > 0 || this.field3253[arg0.field3309] > 0)) {
            int var5 = var4.field3229 << 2;
            int var6 = var4.field3223 << 1;
            if (arg0.field3319 < var6) {
                var5 = arg0.field3319 * var5 / var6;
            }
            int var7 = (this.field3253[arg0.field3309] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field3305 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field3306.field266 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field301 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("jw.aw(Lji;I)I")
    public int method4682(class280 arg0) {
        class273 var2 = arg0.field3307;
        int var3 = this.field3270[arg0.field3309] * this.field3246[arg0.field3309] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field3312 * var4 + 16384 >> 15;
        int var6 = this.field3244 * var5 + 128 >> 8;
        if (var2.field3227 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field3314 * 1.953125E-5D * (double) var2.field3227) + 0.5D);
        }
        if (var2.field3233 != null) {
            int var7 = arg0.field3315;
            int var8 = var2.field3233[arg0.field3316 + 1];
            if (arg0.field3316 < var2.field3233.length - 2) {
                int var9 = (var2.field3233[arg0.field3316] & 0xFF) << 8;
                int var10 = (var2.field3233[arg0.field3316 + 2] & 0xFF) << 8;
                var8 += (var2.field3233[arg0.field3316 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field3317 > 0 && var2.field3224 != null) {
            int var11 = arg0.field3317;
            int var12 = var2.field3224[arg0.field3318 + 1];
            if (arg0.field3318 < var2.field3224.length - 2) {
                int var13 = (var2.field3224[arg0.field3318] & 0xFF) << 8;
                int var14 = (var2.field3224[arg0.field3318 + 2] & 0xFF) << 8;
                var12 += (var2.field3224[arg0.field3318 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("jw.ah(Lji;I)I")
    public int method4683(class280 arg0) {
        int var2 = this.field3247[arg0.field3309];
        return var2 < 8192 ? arg0.field3313 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field3313) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("jw.m()Lao;")
    public synchronized class46 method601() {
        return this.field3269;
    }

    @ObfuscatedName("jw.p()Lao;")
    public synchronized class46 method602() {
        return null;
    }

    @ObfuscatedName("jw.s()I")
    public synchronized int method599() {
        return 0;
    }

    @ObfuscatedName("jw.r([III)V")
    public synchronized void method604(int[] arg0, int arg1, int arg2) {
        if (this.field3261.method4781()) {
            int var4 = this.field3265 * this.field3261.field3273 / Statics.field301;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field3267;
                if (this.field3268 - var5 >= 0L) {
                    this.field3267 = var5;
                    break;
                }
                int var7 = (int) ((this.field3268 - this.field3267 + (long) var4 - 1L) / (long) var4);
                this.field3267 += (long) var4 * (long) var7;
                this.field3269.method604(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method4684();
            } while (this.field3261.method4781());
        }
        this.field3269.method604(arg0, arg1, arg2);
    }

    @ObfuscatedName("jw.y(I)V")
    public synchronized void method614(int arg0) {
        if (this.field3261.method4781()) {
            int var2 = this.field3265 * this.field3261.field3273 / Statics.field301;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field3267;
                if (this.field3268 - var3 >= 0L) {
                    this.field3267 = var3;
                    break;
                }
                int var5 = (int) ((this.field3268 - this.field3267 + (long) var2 - 1L) / (long) var2);
                this.field3267 += (long) var2 * (long) var5;
                this.field3269.method614(var5);
                arg0 -= var5;
                this.method4684();
            } while (this.field3261.method4781());
        }
        this.field3269.method614(arg0);
    }

    @ObfuscatedName("jw.ao(B)V")
    public void method4684() {
        int var1 = this.field3255;
        int var2 = this.field3263;
        long var3 = this.field3268;
        while (this.field3263 == var2) {
            while (this.field3261.field3276[var1] == var2) {
                this.field3261.method4777(var1);
                int var5 = this.field3261.method4810(var1);
                if (var5 == 1) {
                    this.field3261.method4785();
                    this.field3261.method4784(var1);
                    if (this.field3261.method4791()) {
                        if (!this.field3264 || var2 == 0) {
                            this.method4676();
                            this.field3261.method4793();
                            return;
                        }
                        this.field3261.method4792(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method4679(var5);
                }
                this.field3261.method4805(var1);
                this.field3261.method4784(var1);
            }
            var1 = this.field3261.method4817();
            var2 = this.field3261.field3276[var1];
            var3 = this.field3261.method4789(var2);
        }
        this.field3255 = var1;
        this.field3263 = var2;
        this.field3268 = var3;
    }

    @ObfuscatedName("jw.av(Lji;I)Z")
    public boolean method4685(class280 arg0) {
        if (arg0.field3321 != null) {
            return false;
        }
        if (arg0.field3317 >= 0) {
            arg0.method6399();
            if (arg0.field3320 > 0 && this.field3256[arg0.field3309][arg0.field3320] == arg0) {
                this.field3256[arg0.field3309][arg0.field3320] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("jw.ai(Lji;[IIII)Z")
    public boolean method4686(class280 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field3322 = Statics.field301 / 100;
        if (arg0.field3317 >= 0 && arg0.field3321 == null || arg0.field3321.method787()) {
            arg0.method4862();
            arg0.method6399();
            if (arg0.field3320 > 0 && this.field3256[arg0.field3309][arg0.field3320] == arg0) {
                this.field3256[arg0.field3309][arg0.field3320] = null;
            }
            return true;
        }
        int var5 = arg0.field3303;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field3254[arg0.field3309] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field3303 = var6;
        }
        arg0.field3321.method785(this.method4706(arg0));
        class273 var7 = arg0.field3307;
        boolean var8 = false;
        arg0.field3319++;
        arg0.field3305 += var7.field3230;
        double var9 = (double) ((arg0.field3308 - 60 << 8) + (arg0.field3310 * arg0.field3303 >> 12)) * 5.086263020833333E-6D;
        if (var7.field3227 > 0) {
            if (var7.field3228 > 0) {
                arg0.field3314 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3228 * var9) + 0.5D);
            } else {
                arg0.field3314 += 128;
            }
        }
        if (var7.field3233 != null) {
            if (var7.field3226 > 0) {
                arg0.field3315 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3226 * var9) + 0.5D);
            } else {
                arg0.field3315 += 128;
            }
            while (arg0.field3316 < var7.field3233.length - 2 && arg0.field3315 > (var7.field3233[arg0.field3316 + 2] & 0xFF) << 8) {
                arg0.field3316 += 2;
            }
            if (arg0.field3316 == var7.field3233.length - 2 && var7.field3233[arg0.field3316 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field3317 >= 0 && var7.field3224 != null && (this.field3248[arg0.field3309] & 0x1) == 0 && (arg0.field3320 < 0 || this.field3256[arg0.field3309][arg0.field3320] != arg0)) {
            if (var7.field3225 > 0) {
                arg0.field3317 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3225 * var9) + 0.5D);
            } else {
                arg0.field3317 += 128;
            }
            while (arg0.field3318 < var7.field3224.length - 2 && arg0.field3317 > (var7.field3224[arg0.field3318 + 2] & 0xFF) << 8) {
                arg0.field3318 += 2;
            }
            if (arg0.field3318 == var7.field3224.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field3321.method771(arg0.field3322, this.method4682(arg0), this.method4683(arg0));
            return false;
        }
        arg0.field3321.method784(arg0.field3322);
        if (arg1 == null) {
            arg0.field3321.method614(arg3);
        } else {
            arg0.field3321.method604(arg1, arg2, arg3);
        }
        if (arg0.field3321.method891()) {
            this.field3269.field3298.method628(arg0.field3321);
        }
        arg0.method4862();
        if (arg0.field3317 >= 0) {
            arg0.method6399();
            if (arg0.field3320 > 0 && this.field3256[arg0.field3309][arg0.field3320] == arg0) {
                this.field3256[arg0.field3309][arg0.field3320] = null;
            }
        }
        return true;
    }
}
