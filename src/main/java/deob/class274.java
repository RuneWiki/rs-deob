package deob;

@ObfuscatedName("jp")
public class class274 extends class46 {

    @ObfuscatedName("jp.c")
    public class420 field3220 = new class420(128);

    @ObfuscatedName("jp.v")
    public int field3223 = 256;

    @ObfuscatedName("jp.q")
    public int field3206 = 1000000;

    @ObfuscatedName("jp.f")
    public int[] field3207 = new int[16];

    @ObfuscatedName("jp.j")
    public int[] field3226 = new int[16];

    @ObfuscatedName("jp.e")
    public int[] field3209 = new int[16];

    @ObfuscatedName("jp.g")
    public int[] field3210 = new int[16];

    @ObfuscatedName("jp.y")
    public int[] field3213 = new int[16];

    @ObfuscatedName("jp.i")
    public int[] field3212 = new int[16];

    @ObfuscatedName("jp.s")
    public int[] field3205 = new int[16];

    @ObfuscatedName("jp.t")
    public int[] field3204 = new int[16];

    @ObfuscatedName("jp.z")
    public int[] field3215 = new int[16];

    @ObfuscatedName("jp.a")
    public int[] field3211 = new int[16];

    @ObfuscatedName("jp.p")
    public int[] field3218 = new int[16];

    @ObfuscatedName("jp.b")
    public int[] field3219 = new int[16];

    @ObfuscatedName("jp.n")
    public int[] field3230 = new int[16];

    @ObfuscatedName("jp.o")
    public int[] field3221 = new int[16];

    @ObfuscatedName("jp.m")
    public int[] field3208 = new int[16];

    @ObfuscatedName("jp.d")
    public class279[][] field3216 = new class279[16][128];

    @ObfuscatedName("jp.ad")
    public class279[][] field3224 = new class279[16][128];

    @ObfuscatedName("jp.ak")
    public class275 field3225 = new class275();

    @ObfuscatedName("jp.al")
    public boolean field3214;

    @ObfuscatedName("jp.ao")
    public int field3227;

    @ObfuscatedName("jp.ab")
    public int field3228;

    @ObfuscatedName("jp.ap")
    public long field3229;

    @ObfuscatedName("jp.ac")
    public long field3222;

    @ObfuscatedName("jp.ae")
    public class277 field3231 = new class277(this);

    public class274() {
        this.method4788();
    }

    @ObfuscatedName("jp.c(II)V")
    public synchronized void method4768(int arg0) {
        this.field3223 = arg0;
    }

    @ObfuscatedName("jp.v(B)I")
    public int method4769() {
        return this.field3223;
    }

    @ObfuscatedName("jp.q(Ljj;Llh;Laq;II)Z")
    public synchronized boolean method4770(class278 arg0, class315 arg1, class43 arg2, int arg3) {
        arg0.method4945();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class407 var7 = (class407) arg0.field3264.method6766(); var7 != null; var7 = (class407) arg0.field3264.method6767()) {
            int var8 = (int) var7.field4462;
            class276 var9 = (class276) this.field3220.method6765((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method5306(var8);
                class276 var11;
                if (var10 == null) {
                    var11 = null;
                } else {
                    var11 = new class276(var10);
                }
                var9 = var11;
                if (var11 == null) {
                    var5 = false;
                    continue;
                }
                this.field3220.method6774(var11, (long) var8);
            }
            if (!var9.method4921(arg2, var7.field4459, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method4942();
        }
        return var5;
    }

    @ObfuscatedName("jp.f(I)V")
    public synchronized void method4771() {
        for (class276 var1 = (class276) this.field3220.method6766(); var1 != null; var1 = (class276) this.field3220.method6767()) {
            var1.method4927();
        }
    }

    @ObfuscatedName("jp.j(I)V")
    public synchronized void method4772() {
        for (class276 var1 = (class276) this.field3220.method6766(); var1 != null; var1 = (class276) this.field3220.method6767()) {
            var1.method6497();
        }
    }

    @ObfuscatedName("jp.i(Ljj;ZI)V")
    public synchronized void method4773(class278 arg0, boolean arg1) {
        this.method4774();
        this.field3225.method4918(arg0.field3263);
        this.field3214 = arg1;
        this.field3229 = 0L;
        int var3 = this.field3225.method4877();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3225.method4892(var4);
            this.field3225.method4880(var4);
            this.field3225.method4900(var4);
        }
        this.field3227 = this.field3225.method4885();
        this.field3228 = this.field3225.field3238[this.field3227];
        this.field3222 = this.field3225.method4896(this.field3228);
    }

    @ObfuscatedName("jp.t(I)V")
    public synchronized void method4774() {
        this.field3225.method4884();
        this.method4788();
    }

    @ObfuscatedName("jp.z(I)Z")
    public synchronized boolean method4818() {
        return this.field3225.method4876();
    }

    @ObfuscatedName("jp.r(III)V")
    public synchronized void method4805(int arg0, int arg1) {
        this.method4777(arg0, arg1);
    }

    @ObfuscatedName("jp.u(III)V")
    public void method4777(int arg0, int arg1) {
        this.field3210[arg0] = arg1;
        this.field3212[arg0] = arg1 & 0xFFFFFF80;
        this.method4778(arg0, arg1);
    }

    @ObfuscatedName("jp.k(III)V")
    public void method4778(int arg0, int arg1) {
        if (this.field3213[arg0] != arg1) {
            this.field3213[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field3224[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("jp.h(IIII)V")
    public void method4828(int arg0, int arg1, int arg2) {
        this.method4781(arg0, arg1, 64);
        if ((this.field3211[arg0] & 0x2) != 0) {
            for (class279 var4 = (class279) this.field3231.field3262.method5536(); var4 != null; var4 = (class279) this.field3231.field3262.method5547()) {
                if (var4.field3285 == arg0 && var4.field3279 < 0) {
                    this.field3216[arg0][var4.field3270] = null;
                    this.field3216[arg0][arg1] = var4;
                    int var5 = (var4.field3278 * var4.field3274 >> 12) + var4.field3273;
                    var4.field3273 += arg1 - var4.field3270 << 8;
                    var4.field3274 = var5 - var4.field3273;
                    var4.field3278 = 4096;
                    var4.field3270 = arg1;
                    return;
                }
            }
        }
        class276 var6 = (class276) this.field3220.method6765((long) this.field3213[arg0]);
        if (var6 == null) {
            return;
        }
        class38 var7 = var6.field3249[arg1];
        if (var7 == null) {
            return;
        }
        class279 var8 = new class279();
        var8.field3285 = arg0;
        var8.field3266 = var6;
        var8.field3267 = var7;
        var8.field3265 = var6.field3253[arg1];
        var8.field3268 = var6.field3250[arg1];
        var8.field3270 = arg1;
        var8.field3283 = var6.field3248 * arg2 * arg2 * var6.field3254[arg1] + 1024 >> 11;
        var8.field3272 = var6.field3252[arg1] & 0xFF;
        var8.field3273 = (arg1 << 8) - (var6.field3251[arg1] & 0x7FFF);
        var8.field3276 = 0;
        var8.field3277 = 0;
        var8.field3275 = 0;
        var8.field3279 = -1;
        var8.field3280 = 0;
        if (this.field3230[arg0] == 0) {
            var8.field3269 = class45.method748(var7, this.method4793(var8), this.method4794(var8), this.method4811(var8));
        } else {
            var8.field3269 = class45.method748(var7, this.method4793(var8), 0, this.method4811(var8));
            this.method4779(var8, var6.field3251[arg1] < 0);
        }
        if (var6.field3251[arg1] < 0) {
            var8.field3269.method785(-1);
        }
        if (var8.field3268 >= 0) {
            class279 var9 = this.field3224[arg0][var8.field3268];
            if (var9 != null && var9.field3279 < 0) {
                this.field3216[arg0][var9.field3270] = null;
                var9.field3279 = 0;
            }
            this.field3224[arg0][var8.field3268] = var8;
        }
        this.field3231.field3262.method5530(var8);
        this.field3216[arg0][arg1] = var8;
    }

    @ObfuscatedName("jp.x(Ljm;ZI)V")
    public void method4779(class279 arg0, boolean arg1) {
        int var3 = arg0.field3267.field259.length;
        int var5;
        if (arg1 && arg0.field3267.field262) {
            int var4 = var3 + var3 - arg0.field3267.field260;
            var5 = (int) ((long) this.field3230[arg0.field3285] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field3269.method757(true);
            }
        } else {
            var5 = (int) ((long) this.field3230[arg0.field3285] * (long) var3 >> 6);
        }
        arg0.field3269.method759(var5);
    }

    @ObfuscatedName("jp.l(IIIB)V")
    public void method4781(int arg0, int arg1, int arg2) {
        class279 var4 = this.field3216[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field3216[arg0][arg1] = null;
        if ((this.field3211[arg0] & 0x2) == 0) {
            var4.field3279 = 0;
            return;
        }
        for (class279 var5 = (class279) this.field3231.field3262.method5535(); var5 != null; var5 = (class279) this.field3231.field3262.method5537()) {
            if (var4.field3285 == var5.field3285 && var5.field3279 < 0 && var4 != var5) {
                var4.field3279 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("jp.a(IIII)V")
    public void method4782(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("jp.p(III)V")
    public void method4860(int arg0, int arg1) {
    }

    @ObfuscatedName("jp.b(IIB)V")
    public void method4787(int arg0, int arg1) {
        this.field3205[arg0] = arg1;
    }

    @ObfuscatedName("jp.n(II)V")
    public void method4857(int arg0) {
        for (class279 var2 = (class279) this.field3231.field3262.method5535(); var2 != null; var2 = (class279) this.field3231.field3262.method5537()) {
            if (arg0 < 0 || var2.field3285 == arg0) {
                if (var2.field3269 != null) {
                    var2.field3269.method770(Statics.field288 / 100);
                    if (var2.field3269.method765()) {
                        this.field3231.field3257.method592(var2.field3269);
                    }
                    var2.method4950();
                }
                if (var2.field3279 < 0) {
                    this.field3216[var2.field3285][var2.field3270] = null;
                }
                var2.method6497();
            }
        }
    }

    @ObfuscatedName("jp.ae(IB)V")
    public void method4767(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method4767(var2);
            }
            return;
        }
        this.field3207[arg0] = 12800;
        this.field3226[arg0] = 8192;
        this.field3209[arg0] = 16383;
        this.field3205[arg0] = 8192;
        this.field3204[arg0] = 0;
        this.field3215[arg0] = 8192;
        this.method4789(arg0);
        this.method4790(arg0);
        this.field3211[arg0] = 0;
        this.field3218[arg0] = 32767;
        this.field3219[arg0] = 256;
        this.field3230[arg0] = 0;
        this.method4792(arg0, 8192);
    }

    @ObfuscatedName("jp.aj(II)V")
    public void method4825(int arg0) {
        for (class279 var2 = (class279) this.field3231.field3262.method5535(); var2 != null; var2 = (class279) this.field3231.field3262.method5537()) {
            if ((arg0 < 0 || var2.field3285 == arg0) && var2.field3279 < 0) {
                this.field3216[var2.field3285][var2.field3270] = null;
                var2.field3279 = 0;
            }
        }
    }

    @ObfuscatedName("jp.ax(I)V")
    public void method4788() {
        this.method4857(-1);
        this.method4767(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field3213[var1] = this.field3210[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field3212[var2] = this.field3210[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("jp.ar(II)V")
    public void method4789(int arg0) {
        if ((this.field3211[arg0] & 0x2) == 0) {
            return;
        }
        for (class279 var2 = (class279) this.field3231.field3262.method5535(); var2 != null; var2 = (class279) this.field3231.field3262.method5537()) {
            if (var2.field3285 == arg0 && this.field3216[arg0][var2.field3270] == null && var2.field3279 < 0) {
                var2.field3279 = 0;
            }
        }
    }

    @ObfuscatedName("jp.ag(IB)V")
    public void method4790(int arg0) {
        if ((this.field3211[arg0] & 0x4) == 0) {
            return;
        }
        for (class279 var2 = (class279) this.field3231.field3262.method5535(); var2 != null; var2 = (class279) this.field3231.field3262.method5537()) {
            if (var2.field3285 == arg0) {
                var2.field3271 = 0;
            }
        }
    }

    @ObfuscatedName("jp.aq(II)V")
    public void method4791(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method4781(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method4828(var6, var7, var8);
            } else {
                this.method4781(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method4782(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field3212[var12] = (var14 << 14) + (this.field3212[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field3212[var12] = (var14 << 7) + (this.field3212[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field3204[var12] = (var14 << 7) + (this.field3204[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field3204[var12] = (this.field3204[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field3215[var12] = (var14 << 7) + (this.field3215[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field3215[var12] = (this.field3215[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field3207[var12] = (var14 << 7) + (this.field3207[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field3207[var12] = (this.field3207[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field3226[var12] = (var14 << 7) + (this.field3226[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field3226[var12] = (this.field3226[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field3209[var12] = (var14 << 7) + (this.field3209[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field3209[var12] = (this.field3209[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field3211[var12] |= 0x1;
                } else {
                    this.field3211[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field3211[var12] |= 0x2;
                } else {
                    this.method4789(var12);
                    this.field3211[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field3218[var12] = (var14 << 7) + (this.field3218[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field3218[var12] = (this.field3218[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field3218[var12] = (var14 << 7) + (this.field3218[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field3218[var12] = (this.field3218[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method4857(var12);
            }
            if (var13 == 121) {
                this.method4767(var12);
            }
            if (var13 == 123) {
                this.method4825(var12);
            }
            if (var13 == 6) {
                int var15 = this.field3218[var12];
                if (var15 == 16384) {
                    this.field3219[var12] = (var14 << 7) + (this.field3219[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field3218[var12];
                if (var16 == 16384) {
                    this.field3219[var12] = (this.field3219[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field3230[var12] = (var14 << 7) + (this.field3230[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field3230[var12] = (this.field3230[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field3211[var12] |= 0x4;
                } else {
                    this.method4790(var12);
                    this.field3211[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method4792(var12, (var14 << 7) + (this.field3221[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method4792(var12, (this.field3221[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method4778(var17, this.field3212[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method4860(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method4787(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method4788();
            }
        }
    }

    @ObfuscatedName("jp.ah(III)V")
    public void method4792(int arg0, int arg1) {
        this.field3221[arg0] = arg1;
        this.field3208[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("jp.ai(Ljm;B)I")
    public int method4793(class279 arg0) {
        int var2 = (arg0.field3278 * arg0.field3274 >> 12) + arg0.field3273;
        int var3 = ((this.field3205[arg0.field3285] - 8192) * this.field3219[arg0.field3285] >> 12) + var2;
        class272 var4 = arg0.field3265;
        if (var4.field3188 > 0 && (var4.field3187 > 0 || this.field3204[arg0.field3285] > 0)) {
            int var5 = var4.field3187 << 2;
            int var6 = var4.field3189 << 1;
            if (arg0.field3281 < var6) {
                var5 = arg0.field3281 * var5 / var6;
            }
            int var7 = (this.field3204[arg0.field3285] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field3282 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field3267.field258 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field288 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("jp.az(Ljm;I)I")
    public int method4794(class279 arg0) {
        class272 var2 = arg0.field3265;
        int var3 = this.field3209[arg0.field3285] * this.field3207[arg0.field3285] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field3283 * var4 + 16384 >> 15;
        int var6 = this.field3223 * var5 + 128 >> 8;
        if (var2.field3183 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field3276 * 1.953125E-5D * (double) var2.field3183) + 0.5D);
        }
        if (var2.field3185 != null) {
            int var7 = arg0.field3277;
            int var8 = var2.field3185[arg0.field3275 + 1];
            if (arg0.field3275 < var2.field3185.length - 2) {
                int var9 = (var2.field3185[arg0.field3275] & 0xFF) << 8;
                int var10 = (var2.field3185[arg0.field3275 + 2] & 0xFF) << 8;
                var8 += (var2.field3185[arg0.field3275 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field3279 > 0 && var2.field3182 != null) {
            int var11 = arg0.field3279;
            int var12 = var2.field3182[arg0.field3280 + 1];
            if (arg0.field3280 < var2.field3182.length - 2) {
                int var13 = (var2.field3182[arg0.field3280] & 0xFF) << 8;
                int var14 = (var2.field3182[arg0.field3280 + 2] & 0xFF) << 8;
                var12 += (var2.field3182[arg0.field3280 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("jp.av(Ljm;I)I")
    public int method4811(class279 arg0) {
        int var2 = this.field3226[arg0.field3285];
        return var2 < 8192 ? arg0.field3272 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field3272) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("jp.e()Laz;")
    public synchronized class46 method581() {
        return this.field3231;
    }

    @ObfuscatedName("jp.g()Laz;")
    public synchronized class46 method606() {
        return null;
    }

    @ObfuscatedName("jp.w()I")
    public synchronized int method583() {
        return 0;
    }

    @ObfuscatedName("jp.y([III)V")
    public synchronized void method584(int[] arg0, int arg1, int arg2) {
        if (this.field3225.method4876()) {
            int var4 = this.field3206 * this.field3225.field3247 / Statics.field288;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field3229;
                if (this.field3222 - var5 >= 0L) {
                    this.field3229 = var5;
                    break;
                }
                int var7 = (int) ((this.field3222 - this.field3229 + (long) var4 - 1L) / (long) var4);
                this.field3229 += (long) var4 * (long) var7;
                this.field3231.method584(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method4796();
            } while (this.field3225.method4876());
        }
        this.field3231.method584(arg0, arg1, arg2);
    }

    @ObfuscatedName("jp.s(I)V")
    public synchronized void method586(int arg0) {
        if (this.field3225.method4876()) {
            int var2 = this.field3206 * this.field3225.field3247 / Statics.field288;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field3229;
                if (this.field3222 - var3 >= 0L) {
                    this.field3229 = var3;
                    break;
                }
                int var5 = (int) ((this.field3222 - this.field3229 + (long) var2 - 1L) / (long) var2);
                this.field3229 += (long) var2 * (long) var5;
                this.field3231.method586(var5);
                arg0 -= var5;
                this.method4796();
            } while (this.field3225.method4876());
        }
        this.field3231.method586(arg0);
    }

    @ObfuscatedName("jp.aw(I)V")
    public void method4796() {
        int var1 = this.field3227;
        int var2 = this.field3228;
        long var3 = this.field3222;
        while (this.field3228 == var2) {
            while (this.field3225.field3238[var1] == var2) {
                this.field3225.method4892(var1);
                int var5 = this.field3225.method4879(var1);
                if (var5 == 1) {
                    this.field3225.method4888();
                    this.field3225.method4900(var1);
                    if (this.field3225.method4886()) {
                        if (!this.field3214 || var2 == 0) {
                            this.method4788();
                            this.field3225.method4884();
                            return;
                        }
                        this.field3225.method4887(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method4791(var5);
                }
                this.field3225.method4880(var1);
                this.field3225.method4900(var1);
            }
            var1 = this.field3225.method4885();
            var2 = this.field3225.field3238[var1];
            var3 = this.field3225.method4896(var2);
        }
        this.field3227 = var1;
        this.field3228 = var2;
        this.field3222 = var3;
    }

    @ObfuscatedName("jp.au(Ljm;I)Z")
    public boolean method4797(class279 arg0) {
        if (arg0.field3269 != null) {
            return false;
        }
        if (arg0.field3279 >= 0) {
            arg0.method6497();
            if (arg0.field3268 > 0 && this.field3224[arg0.field3285][arg0.field3268] == arg0) {
                this.field3224[arg0.field3285][arg0.field3268] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("jp.ay(Ljm;[IIII)Z")
    public boolean method4816(class279 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field3284 = Statics.field288 / 100;
        if (arg0.field3279 >= 0 && arg0.field3269 == null || arg0.field3269.method821()) {
            arg0.method4950();
            arg0.method6497();
            if (arg0.field3268 > 0 && this.field3224[arg0.field3285][arg0.field3268] == arg0) {
                this.field3224[arg0.field3285][arg0.field3268] = null;
            }
            return true;
        }
        int var5 = arg0.field3278;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field3215[arg0.field3285] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field3278 = var6;
        }
        arg0.field3269.method762(this.method4793(arg0));
        class272 var7 = arg0.field3265;
        boolean var8 = false;
        arg0.field3281++;
        arg0.field3282 += var7.field3188;
        double var9 = (double) ((arg0.field3270 - 60 << 8) + (arg0.field3278 * arg0.field3274 >> 12)) * 5.086263020833333E-6D;
        if (var7.field3183 > 0) {
            if (var7.field3184 > 0) {
                arg0.field3276 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3184 * var9) + 0.5D);
            } else {
                arg0.field3276 += 128;
            }
        }
        if (var7.field3185 != null) {
            if (var7.field3191 > 0) {
                arg0.field3277 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3191 * var9) + 0.5D);
            } else {
                arg0.field3277 += 128;
            }
            while (arg0.field3275 < var7.field3185.length - 2 && arg0.field3277 > (var7.field3185[arg0.field3275 + 2] & 0xFF) << 8) {
                arg0.field3275 += 2;
            }
            if (arg0.field3275 == var7.field3185.length - 2 && var7.field3185[arg0.field3275 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field3279 >= 0 && var7.field3182 != null && (this.field3211[arg0.field3285] & 0x1) == 0 && (arg0.field3268 < 0 || this.field3224[arg0.field3285][arg0.field3268] != arg0)) {
            if (var7.field3186 > 0) {
                arg0.field3279 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3186 * var9) + 0.5D);
            } else {
                arg0.field3279 += 128;
            }
            while (arg0.field3280 < var7.field3182.length - 2 && arg0.field3279 > (var7.field3182[arg0.field3280 + 2] & 0xFF) << 8) {
                arg0.field3280 += 2;
            }
            if (arg0.field3280 == var7.field3182.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field3269.method760(arg0.field3284, this.method4794(arg0), this.method4811(arg0));
            return false;
        }
        arg0.field3269.method770(arg0.field3284);
        if (arg1 == null) {
            arg0.field3269.method586(arg3);
        } else {
            arg0.field3269.method584(arg1, arg2, arg3);
        }
        if (arg0.field3269.method765()) {
            this.field3231.field3257.method592(arg0.field3269);
        }
        arg0.method4950();
        if (arg0.field3279 >= 0) {
            arg0.method6497();
            if (arg0.field3268 > 0 && this.field3224[arg0.field3285][arg0.field3268] == arg0) {
                this.field3224[arg0.field3285][arg0.field3268] = null;
            }
        }
        return true;
    }
}
