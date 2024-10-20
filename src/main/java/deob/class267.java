package deob;

@ObfuscatedName("jb")
public class class267 extends class46 {

    @ObfuscatedName("jb.c")
    public class402 field3121 = new class402(128);

    @ObfuscatedName("jb.l")
    public int field3128 = 256;

    @ObfuscatedName("jb.s")
    public int field3114 = 1000000;

    @ObfuscatedName("jb.e")
    public int[] field3115 = new int[16];

    @ObfuscatedName("jb.r")
    public int[] field3116 = new int[16];

    @ObfuscatedName("jb.o")
    public int[] field3117 = new int[16];

    @ObfuscatedName("jb.i")
    public int[] field3118 = new int[16];

    @ObfuscatedName("jb.v")
    public int[] field3119 = new int[16];

    @ObfuscatedName("jb.a")
    public int[] field3120 = new int[16];

    @ObfuscatedName("jb.y")
    public int[] field3135 = new int[16];

    @ObfuscatedName("jb.u")
    public int[] field3122 = new int[16];

    @ObfuscatedName("jb.h")
    public int[] field3138 = new int[16];

    @ObfuscatedName("jb.j")
    public int[] field3125 = new int[16];

    @ObfuscatedName("jb.f")
    public int[] field3126 = new int[16];

    @ObfuscatedName("jb.g")
    public int[] field3123 = new int[16];

    @ObfuscatedName("jb.t")
    public int[] field3127 = new int[16];

    @ObfuscatedName("jb.k")
    public int[] field3133 = new int[16];

    @ObfuscatedName("jb.b")
    public int[] field3130 = new int[16];

    @ObfuscatedName("jb.z")
    public class272[][] field3131 = new class272[16][128];

    @ObfuscatedName("jb.ap")
    public class272[][] field3132 = new class272[16][128];

    @ObfuscatedName("jb.af")
    public class268 field3129 = new class268();

    @ObfuscatedName("jb.ak")
    public boolean field3137;

    @ObfuscatedName("jb.av")
    public int field3112;

    @ObfuscatedName("jb.ar")
    public int field3136;

    @ObfuscatedName("jb.al")
    public long field3113;

    @ObfuscatedName("jb.aa")
    public long field3134;

    @ObfuscatedName("jb.ao")
    public class270 field3139 = new class270(this);

    public class267() {
        this.method4578();
    }

    @ObfuscatedName("jb.c(II)V")
    public synchronized void method4546(int arg0) {
        this.field3128 = arg0;
    }

    @ObfuscatedName("jb.l(B)I")
    public int method4592() {
        return this.field3128;
    }

    @ObfuscatedName("jb.s(Ljp;Lkq;Lau;II)Z")
    public synchronized boolean method4548(class271 arg0, class307 arg1, class43 arg2, int arg3) {
        arg0.method4742();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class389 var7 = (class389) arg0.field3171.method6463(); var7 != null; var7 = (class389) arg0.field3171.method6457()) {
            int var8 = (int) var7.field4301;
            class269 var9 = (class269) this.field3121.method6456((long) var8);
            if (var9 == null) {
                var9 = class269.method298(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field3121.method6455(var9, (long) var8);
            }
            if (!var9.method4717(arg2, var7.field4297, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method4741();
        }
        return var5;
    }

    @ObfuscatedName("jb.e(I)V")
    public synchronized void method4549() {
        for (class269 var1 = (class269) this.field3121.method6463(); var1 != null; var1 = (class269) this.field3121.method6457()) {
            var1.method4718();
        }
    }

    @ObfuscatedName("jb.r(I)V")
    public synchronized void method4550() {
        for (class269 var1 = (class269) this.field3121.method6463(); var1 != null; var1 = (class269) this.field3121.method6457()) {
            var1.method6167();
        }
    }

    @ObfuscatedName("jb.a(Ljp;ZB)V")
    public synchronized void method4551(class271 arg0, boolean arg1) {
        this.method4552();
        this.field3129.method4679(arg0.field3170);
        this.field3137 = arg1;
        this.field3113 = 0L;
        int var3 = this.field3129.method4662();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3129.method4697(var4);
            this.field3129.method4673(var4);
            this.field3129.method4661(var4);
        }
        this.field3112 = this.field3129.method4670();
        this.field3136 = this.field3129.field3144[this.field3112];
        this.field3134 = this.field3129.method4682(this.field3136);
    }

    @ObfuscatedName("jb.u(I)V")
    public synchronized void method4552() {
        this.field3129.method4660();
        this.method4578();
    }

    @ObfuscatedName("jb.h(B)Z")
    public synchronized boolean method4553() {
        return this.field3129.method4689();
    }

    @ObfuscatedName("jb.q(III)V")
    public synchronized void method4556(int arg0, int arg1) {
        this.method4555(arg0, arg1);
    }

    @ObfuscatedName("jb.x(IIB)V")
    public void method4555(int arg0, int arg1) {
        this.field3118[arg0] = arg1;
        this.field3120[arg0] = arg1 & 0xFFFFFF80;
        this.method4607(arg0, arg1);
    }

    @ObfuscatedName("jb.p(III)V")
    public void method4607(int arg0, int arg1) {
        if (this.field3119[arg0] != arg1) {
            this.field3119[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field3132[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("jb.n(IIII)V")
    public void method4591(int arg0, int arg1, int arg2) {
        this.method4558(arg0, arg1, 64);
        if ((this.field3125[arg0] & 0x2) != 0) {
            for (class272 var4 = (class272) this.field3139.field3164.method5284(); var4 != null; var4 = (class272) this.field3139.field3164.method5272()) {
                if (var4.field3182 == arg0 && var4.field3187 < 0) {
                    this.field3131[arg0][var4.field3190] = null;
                    this.field3131[arg0][arg1] = var4;
                    int var5 = (var4.field3188 * var4.field3178 >> 12) + var4.field3180;
                    var4.field3180 += arg1 - var4.field3190 << 8;
                    var4.field3178 = var5 - var4.field3180;
                    var4.field3188 = 4096;
                    var4.field3190 = arg1;
                    return;
                }
            }
        }
        class269 var6 = (class269) this.field3121.method6456((long) this.field3119[arg0]);
        if (var6 == null) {
            return;
        }
        class38 var7 = var6.field3155[arg1];
        if (var7 == null) {
            return;
        }
        class272 var8 = new class272();
        var8.field3182 = arg0;
        var8.field3173 = var6;
        var8.field3174 = var7;
        var8.field3175 = var6.field3156[arg1];
        var8.field3172 = var6.field3160[arg1];
        var8.field3190 = arg1;
        var8.field3181 = var6.field3161 * arg2 * arg2 * var6.field3157[arg1] + 1024 >> 11;
        var8.field3179 = var6.field3162[arg1] & 0xFF;
        var8.field3180 = (arg1 << 8) - (var6.field3158[arg1] & 0x7FFF);
        var8.field3183 = 0;
        var8.field3184 = 0;
        var8.field3177 = 0;
        var8.field3187 = -1;
        var8.field3176 = 0;
        if (this.field3127[arg0] == 0) {
            var8.field3186 = class45.method833(var7, this.method4568(var8), this.method4646(var8), this.method4570(var8));
        } else {
            var8.field3186 = class45.method833(var7, this.method4568(var8), 0, this.method4570(var8));
            this.method4658(var8, var6.field3158[arg1] < 0);
        }
        if (var6.field3158[arg1] < 0) {
            var8.field3186.method847(-1);
        }
        if (var8.field3172 >= 0) {
            class272 var9 = this.field3132[arg0][var8.field3172];
            if (var9 != null && var9.field3187 < 0) {
                this.field3131[arg0][var9.field3190] = null;
                var9.field3187 = 0;
            }
            this.field3132[arg0][var8.field3172] = var8;
        }
        this.field3139.field3164.method5264(var8);
        this.field3131[arg0][arg1] = var8;
    }

    @ObfuscatedName("jb.m(Ljm;ZB)V")
    public void method4658(class272 arg0, boolean arg1) {
        int var3 = arg0.field3174.field275.length;
        int var5;
        if (arg1 && arg0.field3174.field271) {
            int var4 = var3 + var3 - arg0.field3174.field273;
            var5 = (int) ((long) this.field3127[arg0.field3182] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field3186.method893(true);
            }
        } else {
            var5 = (int) ((long) this.field3127[arg0.field3182] * (long) var3 >> 6);
        }
        arg0.field3186.method791(var5);
    }

    @ObfuscatedName("jb.d(IIIB)V")
    public void method4558(int arg0, int arg1, int arg2) {
        class272 var4 = this.field3131[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field3131[arg0][arg1] = null;
        if ((this.field3125[arg0] & 0x2) == 0) {
            var4.field3187 = 0;
            return;
        }
        for (class272 var5 = (class272) this.field3139.field3164.method5269(); var5 != null; var5 = (class272) this.field3139.field3164.method5270()) {
            if (var4.field3182 == var5.field3182 && var5.field3187 < 0 && var4 != var5) {
                var4.field3187 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("jb.j(IIIB)V")
    public void method4559(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("jb.f(III)V")
    public void method4560(int arg0, int arg1) {
    }

    @ObfuscatedName("jb.g(IIB)V")
    public void method4561(int arg0, int arg1) {
        this.field3135[arg0] = arg1;
    }

    @ObfuscatedName("jb.ao(II)V")
    public void method4562(int arg0) {
        for (class272 var2 = (class272) this.field3139.field3164.method5269(); var2 != null; var2 = (class272) this.field3139.field3164.method5270()) {
            if (arg0 < 0 || var2.field3182 == arg0) {
                if (var2.field3186 != null) {
                    var2.field3186.method795(Statics.field306 / 100);
                    if (var2.field3186.method799()) {
                        this.field3139.field3163.method629(var2.field3186);
                    }
                    var2.method4750();
                }
                if (var2.field3187 < 0) {
                    this.field3131[var2.field3182][var2.field3190] = null;
                }
                var2.method6167();
            }
        }
    }

    @ObfuscatedName("jb.aq(II)V")
    public void method4563(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method4563(var2);
            }
            return;
        }
        this.field3115[arg0] = 12800;
        this.field3116[arg0] = 8192;
        this.field3117[arg0] = 16383;
        this.field3135[arg0] = 8192;
        this.field3122[arg0] = 0;
        this.field3138[arg0] = 8192;
        this.method4571(arg0);
        this.method4565(arg0);
        this.field3125[arg0] = 0;
        this.field3126[arg0] = 32767;
        this.field3123[arg0] = 256;
        this.field3127[arg0] = 0;
        this.method4557(arg0, 8192);
    }

    @ObfuscatedName("jb.ay(II)V")
    public void method4572(int arg0) {
        for (class272 var2 = (class272) this.field3139.field3164.method5269(); var2 != null; var2 = (class272) this.field3139.field3164.method5270()) {
            if ((arg0 < 0 || var2.field3182 == arg0) && var2.field3187 < 0) {
                this.field3131[var2.field3182][var2.field3190] = null;
                var2.field3187 = 0;
            }
        }
    }

    @ObfuscatedName("jb.ag(B)V")
    public void method4578() {
        this.method4562(-1);
        this.method4563(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field3119[var1] = this.field3118[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field3120[var2] = this.field3118[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("jb.ad(II)V")
    public void method4571(int arg0) {
        if ((this.field3125[arg0] & 0x2) == 0) {
            return;
        }
        for (class272 var2 = (class272) this.field3139.field3164.method5269(); var2 != null; var2 = (class272) this.field3139.field3164.method5270()) {
            if (var2.field3182 == arg0 && this.field3131[arg0][var2.field3190] == null && var2.field3187 < 0) {
                var2.field3187 = 0;
            }
        }
    }

    @ObfuscatedName("jb.au(II)V")
    public void method4565(int arg0) {
        if ((this.field3125[arg0] & 0x4) == 0) {
            return;
        }
        for (class272 var2 = (class272) this.field3139.field3164.method5269(); var2 != null; var2 = (class272) this.field3139.field3164.method5270()) {
            if (var2.field3182 == arg0) {
                var2.field3192 = 0;
            }
        }
    }

    @ObfuscatedName("jb.at(II)V")
    public void method4566(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method4558(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method4591(var6, var7, var8);
            } else {
                this.method4558(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method4559(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field3120[var12] = (var14 << 14) + (this.field3120[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field3120[var12] = (var14 << 7) + (this.field3120[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field3122[var12] = (var14 << 7) + (this.field3122[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field3122[var12] = (this.field3122[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field3138[var12] = (var14 << 7) + (this.field3138[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field3138[var12] = (this.field3138[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field3115[var12] = (var14 << 7) + (this.field3115[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field3115[var12] = (this.field3115[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field3116[var12] = (var14 << 7) + (this.field3116[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field3116[var12] = (this.field3116[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field3117[var12] = (var14 << 7) + (this.field3117[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field3117[var12] = (this.field3117[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field3125[var12] |= 0x1;
                } else {
                    this.field3125[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field3125[var12] |= 0x2;
                } else {
                    this.method4571(var12);
                    this.field3125[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field3126[var12] = (var14 << 7) + (this.field3126[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field3126[var12] = (this.field3126[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field3126[var12] = (var14 << 7) + (this.field3126[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field3126[var12] = (this.field3126[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method4562(var12);
            }
            if (var13 == 121) {
                this.method4563(var12);
            }
            if (var13 == 123) {
                this.method4572(var12);
            }
            if (var13 == 6) {
                int var15 = this.field3126[var12];
                if (var15 == 16384) {
                    this.field3123[var12] = (var14 << 7) + (this.field3123[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field3126[var12];
                if (var16 == 16384) {
                    this.field3123[var12] = (this.field3123[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field3127[var12] = (var14 << 7) + (this.field3127[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field3127[var12] = (this.field3127[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field3125[var12] |= 0x4;
                } else {
                    this.method4565(var12);
                    this.field3125[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method4557(var12, (var14 << 7) + (this.field3133[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method4557(var12, (this.field3133[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method4607(var17, this.field3120[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method4560(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method4561(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method4578();
            }
        }
    }

    @ObfuscatedName("jb.ae(III)V")
    public void method4557(int arg0, int arg1) {
        this.field3133[arg0] = arg1;
        this.field3130[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("jb.an(Ljm;B)I")
    public int method4568(class272 arg0) {
        int var2 = (arg0.field3188 * arg0.field3178 >> 12) + arg0.field3180;
        int var3 = ((this.field3135[arg0.field3182] - 8192) * this.field3123[arg0.field3182] >> 12) + var2;
        class265 var4 = arg0.field3175;
        if (var4.field3101 > 0 && (var4.field3103 > 0 || this.field3122[arg0.field3182] > 0)) {
            int var5 = var4.field3103 << 2;
            int var6 = var4.field3102 << 1;
            if (arg0.field3185 < var6) {
                var5 = arg0.field3185 * var5 / var6;
            }
            int var7 = (this.field3122[arg0.field3182] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field3189 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field3174.field272 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field306 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("jb.aw(Ljm;I)I")
    public int method4646(class272 arg0) {
        class265 var2 = arg0.field3175;
        int var3 = this.field3117[arg0.field3182] * this.field3115[arg0.field3182] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field3181 * var4 + 16384 >> 15;
        int var6 = this.field3128 * var5 + 128 >> 8;
        if (var2.field3096 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field3183 * 1.953125E-5D * (double) var2.field3096) + 0.5D);
        }
        if (var2.field3095 != null) {
            int var7 = arg0.field3184;
            int var8 = var2.field3095[arg0.field3177 + 1];
            if (arg0.field3177 < var2.field3095.length - 2) {
                int var9 = (var2.field3095[arg0.field3177] & 0xFF) << 8;
                int var10 = (var2.field3095[arg0.field3177 + 2] & 0xFF) << 8;
                var8 += (var2.field3095[arg0.field3177 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field3187 > 0 && var2.field3100 != null) {
            int var11 = arg0.field3187;
            int var12 = var2.field3100[arg0.field3176 + 1];
            if (arg0.field3176 < var2.field3100.length - 2) {
                int var13 = (var2.field3100[arg0.field3176] & 0xFF) << 8;
                int var14 = (var2.field3100[arg0.field3176 + 2] & 0xFF) << 8;
                var12 += (var2.field3100[arg0.field3176 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("jb.aj(Ljm;I)I")
    public int method4570(class272 arg0) {
        int var2 = this.field3116[arg0.field3182];
        return var2 < 8192 ? arg0.field3179 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field3179) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("jb.o()Lan;")
    public synchronized class46 method634() {
        return this.field3139;
    }

    @ObfuscatedName("jb.i()Lan;")
    public synchronized class46 method647() {
        return null;
    }

    @ObfuscatedName("jb.w()I")
    public synchronized int method636() {
        return 0;
    }

    @ObfuscatedName("jb.v([III)V")
    public synchronized void method637(int[] arg0, int arg1, int arg2) {
        if (this.field3129.method4689()) {
            int var4 = this.field3114 * this.field3129.field3141 / Statics.field306;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field3113;
                if (this.field3134 - var5 >= 0L) {
                    this.field3113 = var5;
                    break;
                }
                int var7 = (int) ((this.field3134 - this.field3113 + (long) var4 - 1L) / (long) var4);
                this.field3113 += (long) var4 * (long) var7;
                this.field3139.method637(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method4574();
            } while (this.field3129.method4689());
        }
        this.field3139.method637(arg0, arg1, arg2);
    }

    @ObfuscatedName("jb.y(I)V")
    public synchronized void method639(int arg0) {
        if (this.field3129.method4689()) {
            int var2 = this.field3114 * this.field3129.field3141 / Statics.field306;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field3113;
                if (this.field3134 - var3 >= 0L) {
                    this.field3113 = var3;
                    break;
                }
                int var5 = (int) ((this.field3134 - this.field3113 + (long) var2 - 1L) / (long) var2);
                this.field3113 += (long) var2 * (long) var5;
                this.field3139.method639(var5);
                arg0 -= var5;
                this.method4574();
            } while (this.field3129.method4689());
        }
        this.field3139.method639(arg0);
    }

    @ObfuscatedName("jb.ax(I)V")
    public void method4574() {
        int var1 = this.field3112;
        int var2 = this.field3136;
        long var3 = this.field3134;
        while (this.field3136 == var2) {
            while (this.field3129.field3144[var1] == var2) {
                this.field3129.method4697(var1);
                int var5 = this.field3129.method4666(var1);
                if (var5 == 1) {
                    this.field3129.method4665();
                    this.field3129.method4661(var1);
                    if (this.field3129.method4671()) {
                        if (!this.field3137 || var2 == 0) {
                            this.method4578();
                            this.field3129.method4660();
                            return;
                        }
                        this.field3129.method4672(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method4566(var5);
                }
                this.field3129.method4673(var1);
                this.field3129.method4661(var1);
            }
            var1 = this.field3129.method4670();
            var2 = this.field3129.field3144[var1];
            var3 = this.field3129.method4682(var2);
        }
        this.field3112 = var1;
        this.field3136 = var2;
        this.field3134 = var3;
    }

    @ObfuscatedName("jb.ah(Ljm;B)Z")
    public boolean method4575(class272 arg0) {
        if (arg0.field3186 != null) {
            return false;
        }
        if (arg0.field3187 >= 0) {
            arg0.method6167();
            if (arg0.field3172 > 0 && this.field3132[arg0.field3182][arg0.field3172] == arg0) {
                this.field3132[arg0.field3182][arg0.field3172] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("jb.ai(Ljm;[IIII)Z")
    public boolean method4576(class272 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field3191 = Statics.field306 / 100;
        if (arg0.field3187 >= 0 && arg0.field3186 == null || arg0.field3186.method798()) {
            arg0.method4750();
            arg0.method6167();
            if (arg0.field3172 > 0 && this.field3132[arg0.field3182][arg0.field3172] == arg0) {
                this.field3132[arg0.field3182][arg0.field3172] = null;
            }
            return true;
        }
        int var5 = arg0.field3188;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field3138[arg0.field3182] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field3188 = var6;
        }
        arg0.field3186.method796(this.method4568(arg0));
        class265 var7 = arg0.field3175;
        boolean var8 = false;
        arg0.field3185++;
        arg0.field3189 += var7.field3101;
        double var9 = (double) ((arg0.field3190 - 60 << 8) + (arg0.field3188 * arg0.field3178 >> 12)) * 5.086263020833333E-6D;
        if (var7.field3096 > 0) {
            if (var7.field3099 > 0) {
                arg0.field3183 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3099 * var9) + 0.5D);
            } else {
                arg0.field3183 += 128;
            }
        }
        if (var7.field3095 != null) {
            if (var7.field3097 > 0) {
                arg0.field3184 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3097 * var9) + 0.5D);
            } else {
                arg0.field3184 += 128;
            }
            while (arg0.field3177 < var7.field3095.length - 2 && arg0.field3184 > (var7.field3095[arg0.field3177 + 2] & 0xFF) << 8) {
                arg0.field3177 += 2;
            }
            if (arg0.field3177 == var7.field3095.length - 2 && var7.field3095[arg0.field3177 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field3187 >= 0 && var7.field3100 != null && (this.field3125[arg0.field3182] & 0x1) == 0 && (arg0.field3172 < 0 || this.field3132[arg0.field3182][arg0.field3172] != arg0)) {
            if (var7.field3098 > 0) {
                arg0.field3187 += (int) (128.0D * Math.pow(2.0D, (double) var7.field3098 * var9) + 0.5D);
            } else {
                arg0.field3187 += 128;
            }
            while (arg0.field3176 < var7.field3100.length - 2 && arg0.field3187 > (var7.field3100[arg0.field3176 + 2] & 0xFF) << 8) {
                arg0.field3176 += 2;
            }
            if (arg0.field3176 == var7.field3100.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field3186.method869(arg0.field3191, this.method4646(arg0), this.method4570(arg0));
            return false;
        }
        arg0.field3186.method795(arg0.field3191);
        if (arg1 == null) {
            arg0.field3186.method639(arg3);
        } else {
            arg0.field3186.method637(arg1, arg2, arg3);
        }
        if (arg0.field3186.method799()) {
            this.field3139.field3163.method629(arg0.field3186);
        }
        arg0.method4750();
        if (arg0.field3187 >= 0) {
            arg0.method6167();
            if (arg0.field3172 > 0 && this.field3132[arg0.field3182][arg0.field3172] == arg0) {
                this.field3132[arg0.field3182][arg0.field3172] = null;
            }
        }
        return true;
    }
}
