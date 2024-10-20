package deob;

@ObfuscatedName("ec")
public class class35 extends class182 {

    @ObfuscatedName("ec.g")
    public int[] field339 = new int[16];

    @ObfuscatedName("ec.d")
    public int[] field338 = new int[16];

    @ObfuscatedName("ec.b")
    public int field333 = 1000000;

    @ObfuscatedName("ec.c")
    public int field350 = 256;

    @ObfuscatedName("ec.a")
    public int[] field342 = new int[16];

    @ObfuscatedName("ec.n")
    public int[] field347 = new int[16];

    @ObfuscatedName("ec.l")
    public int[] field349 = new int[16];

    @ObfuscatedName("ec.m")
    public int[] field335 = new int[16];

    @ObfuscatedName("ec.j")
    public int[] field332 = new int[16];

    @ObfuscatedName("ec.h")
    public int[] field345 = new int[16];

    @ObfuscatedName("ec.i")
    public int[] field334 = new int[16];

    @ObfuscatedName("ec.w")
    public int[] field337 = new int[16];

    @ObfuscatedName("ec.v")
    public class3 field351 = new class3(128);

    @ObfuscatedName("ec.t")
    public int[] field346 = new int[16];

    @ObfuscatedName("ec.r")
    public int[] field340 = new int[16];

    @ObfuscatedName("ec.q")
    public class55[][] field356 = new class55[16][128];

    @ObfuscatedName("ec.z")
    public int[] field336 = new int[16];

    @ObfuscatedName("ec.y")
    public int[] field341 = new int[16];

    @ObfuscatedName("ec.x")
    public int[] field344 = new int[16];

    @ObfuscatedName("ec.as")
    public class55[][] field352 = new class55[16][128];

    @ObfuscatedName("ec.ar")
    public class33 field359 = new class33(this);

    @ObfuscatedName("ec.ax")
    public boolean field354;

    @ObfuscatedName("ec.ao")
    public int field355;

    @ObfuscatedName("ec.an")
    public long field358;

    @ObfuscatedName("ec.ac")
    public class64 field353 = new class64();

    @ObfuscatedName("ec.aa")
    public long field357;

    @ObfuscatedName("ec.ah")
    public int field348;

    @ObfuscatedName("ec.v(II)V")
    public synchronized void method581(int arg0) {
        this.field350 = arg0;
    }

    @ObfuscatedName("ec.c(I)I")
    public int method582() {
        return this.field350;
    }

    @ObfuscatedName("ec.i(Leb;Lel;Lbx;II)Z")
    public synchronized boolean method583(class34 arg0, class87 arg1, class112 arg2, int arg3) {
        arg0.method571();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class11 var7 = (class11) arg0.field330.method14(); var7 != null; var7 = (class11) arg0.field330.method12()) {
            int var8 = (int) var7.field76;
            class63 var9 = (class63) this.field351.method8((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method1313(var8);
                class63 var11;
                if (var10 == null) {
                    var11 = null;
                } else {
                    var11 = new class63(var10);
                }
                var9 = var11;
                if (var11 == null) {
                    var5 = false;
                    continue;
                }
                this.field351.method9(var11, (long) var8);
            }
            if (!var9.method961(arg2, var7.field71, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method572();
        }
        return var5;
    }

    @ObfuscatedName("ec.m(B)V")
    public synchronized void method584() {
        for (class63 var1 = (class63) this.field351.method14(); var1 != null; var1 = (class63) this.field351.method12()) {
            var1.method962();
        }
    }

    @ObfuscatedName("ec.z(I)V")
    public synchronized void method585() {
        for (class63 var1 = (class63) this.field351.method14(); var1 != null; var1 = (class63) this.field351.method12()) {
            var1.method76();
        }
    }

    @ObfuscatedName("ec.x(Leb;ZI)V")
    public synchronized void method586(class34 arg0, boolean arg1) {
        this.method587();
        this.field353.method970(arg0.field329);
        this.field354 = arg1;
        this.field357 = 0L;
        int var3 = this.field353.method971();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field353.method974(var4);
            this.field353.method976(var4);
            this.field353.method1004(var4);
        }
        this.field355 = this.field353.method1002();
        this.field348 = this.field353.field948[this.field355];
        this.field358 = this.field353.method980(this.field348);
    }

    @ObfuscatedName("ec.d(I)V")
    public synchronized void method587() {
        this.field353.method992();
        this.method600();
    }

    @ObfuscatedName("ec.g(IIB)V")
    public synchronized void method589(int arg0, int arg1) {
        this.method590(arg0, arg1);
    }

    @ObfuscatedName("ec.y(III)V")
    public void method590(int arg0, int arg1) {
        this.field344[arg0] = arg1;
        this.field332[arg0] = arg1 & 0xFFFFFF80;
        this.method591(arg0, arg1);
    }

    @ObfuscatedName("ec.a(III)V")
    public void method591(int arg0, int arg1) {
        if (this.field338[arg0] != arg1) {
            this.field338[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field352[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("ec.k(Lex;ZI)V")
    public void method592(class55 arg0, boolean arg1) {
        int var3 = arg0.field588.field1828.length;
        int var5;
        if (arg1 && arg0.field588.field1826) {
            int var4 = var3 + var3 - arg0.field588.field1827;
            var5 = (int) ((long) this.field340[arg0.field602] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field604.method3278(true);
            }
        } else {
            var5 = (int) ((long) this.field340[arg0.field602] * (long) var3 >> 6);
        }
        arg0.field604.method3277(var5);
    }

    @ObfuscatedName("ec.e(IIII)V")
    public void method594(int arg0, int arg1, int arg2) {
        class55 var4 = this.field356[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field356[arg0][arg1] = null;
        if ((this.field345[arg0] & 0x2) == 0) {
            var4.field600 = 0;
            return;
        }
        for (class55 var5 = (class55) this.field359.field325.method1104(); var5 != null; var5 = (class55) this.field359.field325.method1106()) {
            if (var4.field602 == var5.field602 && var5.field600 < 0 && var4 != var5) {
                var4.field600 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("ec.p(IIII)V")
    public void method595(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("ec.o(III)V")
    public void method596(int arg0, int arg1) {
    }

    @ObfuscatedName("ec.t(IB)V")
    public void method599(int arg0) {
        for (class55 var2 = (class55) this.field359.field325.method1104(); var2 != null; var2 = (class55) this.field359.field325.method1106()) {
            if ((arg0 < 0 || var2.field602 == arg0) && var2.field600 < 0) {
                this.field356[var2.field602][var2.field591] = null;
                var2.field600 = 0;
            }
        }
    }

    @ObfuscatedName("ec.w(S)V")
    public void method600() {
        this.method689(-1);
        this.method642(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field338[var1] = this.field344[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field332[var2] = this.field344[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("ec.ax(II)V")
    public void method602(int arg0) {
        if ((this.field345[arg0] & 0x4) == 0) {
            return;
        }
        for (class55 var2 = (class55) this.field359.field325.method1104(); var2 != null; var2 = (class55) this.field359.field325.method1106()) {
            if (var2.field602 == arg0) {
                var2.field607 = 0;
            }
        }
    }

    @ObfuscatedName("ec.ao(IB)V")
    public void method603(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method594(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method652(var6, var7, var8);
            } else {
                this.method594(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method595(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field332[var12] = (var14 << 14) + (this.field332[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field332[var12] = (var14 << 7) + (this.field332[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field341[var12] = (var14 << 7) + (this.field341[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field341[var12] = (this.field341[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field342[var12] = (var14 << 7) + (this.field342[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field342[var12] = (this.field342[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field334[var12] = (var14 << 7) + (this.field334[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field334[var12] = (this.field334[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field335[var12] = (var14 << 7) + (this.field335[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field335[var12] = (this.field335[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field336[var12] = (var14 << 7) + (this.field336[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field336[var12] = (this.field336[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field345[var12] |= 0x1;
                } else {
                    this.field345[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field345[var12] |= 0x2;
                } else {
                    this.method620(var12);
                    this.field345[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field346[var12] = (var14 << 7) + (this.field346[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field346[var12] = (this.field346[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field346[var12] = (var14 << 7) + (this.field346[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field346[var12] = (this.field346[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method689(var12);
            }
            if (var13 == 121) {
                this.method642(var12);
            }
            if (var13 == 123) {
                this.method599(var12);
            }
            if (var13 == 6) {
                int var15 = this.field346[var12];
                if (var15 == 16384) {
                    this.field337[var12] = (var14 << 7) + (this.field337[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field346[var12];
                if (var16 == 16384) {
                    this.field337[var12] = (this.field337[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field340[var12] = (var14 << 7) + (this.field340[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field340[var12] = (this.field340[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field345[var12] |= 0x4;
                } else {
                    this.method602(var12);
                    this.field345[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method604(var12, (var14 << 7) + (this.field349[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method604(var12, (this.field349[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method591(var17, this.field332[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method596(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method611(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method600();
            }
        }
    }

    @ObfuscatedName("ec.l()Lab;")
    public synchronized class182 method555() {
        return null;
    }

    @ObfuscatedName("ec.ah(IIB)V")
    public void method604(int arg0, int arg1) {
        this.field349[arg0] = arg1;
        this.field347[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("ec.an(Lex;I)I")
    public int method605(class55 arg0) {
        class81 var2 = arg0.field589;
        int var3 = this.field334[arg0.field602] * this.field336[arg0.field602] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field599 * var4 + 16384 >> 15;
        int var6 = this.field350 * var5 + 128 >> 8;
        if (var2.field1134 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field597 * 1.953125E-5D * (double) var2.field1134) + 0.5D);
        }
        if (var2.field1133 != null) {
            int var7 = arg0.field603;
            int var8 = var2.field1133[arg0.field590 + 1];
            if (arg0.field590 < var2.field1133.length - 2) {
                int var9 = (var2.field1133[arg0.field590] & 0xFF) << 8;
                int var10 = (var2.field1133[arg0.field590 + 2] & 0xFF) << 8;
                var8 += (var2.field1133[arg0.field590 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field600 > 0 && var2.field1142 != null) {
            int var11 = arg0.field600;
            int var12 = var2.field1142[arg0.field601 + 1];
            if (arg0.field601 < var2.field1142.length - 2) {
                int var13 = (var2.field1142[arg0.field601] & 0xFF) << 8;
                int var14 = (var2.field1142[arg0.field601 + 2] & 0xFF) << 8;
                var12 += (var2.field1142[arg0.field601 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("ec.ar(Lex;I)I")
    public int method606(class55 arg0) {
        int var2 = this.field335[arg0.field602];
        return var2 < 8192 ? arg0.field593 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field593) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("ec.r()Lab;")
    public synchronized class182 method545() {
        return this.field359;
    }

    @ObfuscatedName("ec.n()I")
    public synchronized int method560() {
        return 0;
    }

    @ObfuscatedName("ec.as(I)V")
    public synchronized void method549(int arg0) {
        if (this.field353.method988()) {
            int var2 = this.field333 * this.field353.field945 / Statics.field1914;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field357;
                if (this.field358 - var3 >= 0L) {
                    this.field357 = var3;
                    break;
                }
                int var5 = (int) ((this.field358 - this.field357 + (long) var2 - 1L) / (long) var2);
                this.field357 += (long) var2 * (long) var5;
                this.field359.method549(var5);
                arg0 -= var5;
                this.method609();
            } while (this.field353.method988());
        }
        this.field359.method549(arg0);
    }

    @ObfuscatedName("ec.ai(I)V")
    public void method609() {
        int var1 = this.field355;
        int var2 = this.field348;
        long var3 = this.field358;
        while (this.field348 == var2) {
            while (this.field353.field948[var1] == var2) {
                this.field353.method974(var1);
                int var5 = this.field353.method977(var1);
                if (var5 == 1) {
                    this.field353.method996();
                    this.field353.method1004(var1);
                    if (this.field353.method982()) {
                        if (!this.field354 || var2 == 0) {
                            this.method600();
                            this.field353.method992();
                            return;
                        }
                        this.field353.method983(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method603(var5);
                }
                this.field353.method976(var1);
                this.field353.method1004(var1);
            }
            var1 = this.field353.method1002();
            var2 = this.field353.field948[var1];
            var3 = this.field353.method980(var2);
        }
        this.field355 = var1;
        this.field348 = var2;
        this.field358 = var3;
    }

    @ObfuscatedName("ec.q([III)V")
    public synchronized void method548(int[] arg0, int arg1, int arg2) {
        if (this.field353.method988()) {
            int var4 = this.field333 * this.field353.field945 / Statics.field1914;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field357;
                if (this.field358 - var5 >= 0L) {
                    this.field357 = var5;
                    break;
                }
                int var7 = (int) ((this.field358 - this.field357 + (long) var4 - 1L) / (long) var4);
                this.field357 += (long) var4 * (long) var7;
                this.field359.method548(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method609();
            } while (this.field353.method988());
        }
        this.field359.method548(arg0, arg1, arg2);
    }

    @ObfuscatedName("ec.s(III)V")
    public void method611(int arg0, int arg1) {
        this.field339[arg0] = arg1;
    }

    @ObfuscatedName("ec.ac(II)V")
    public void method620(int arg0) {
        if ((this.field345[arg0] & 0x2) == 0) {
            return;
        }
        for (class55 var2 = (class55) this.field359.field325.method1104(); var2 != null; var2 = (class55) this.field359.field325.method1106()) {
            if (var2.field602 == arg0 && this.field356[arg0][var2.field591] == null && var2.field600 < 0) {
                var2.field600 = 0;
            }
        }
    }

    @ObfuscatedName("ec.aa(Lex;B)I")
    public int method622(class55 arg0) {
        int var2 = (arg0.field598 * arg0.field592 >> 12) + arg0.field586;
        int var3 = ((this.field339[arg0.field602] - 8192) * this.field337[arg0.field602] >> 12) + var2;
        class81 var4 = arg0.field589;
        if (var4.field1139 > 0 && (var4.field1138 > 0 || this.field341[arg0.field602] > 0)) {
            int var5 = var4.field1138 << 2;
            int var6 = var4.field1140 << 1;
            if (arg0.field596 < var6) {
                var5 = arg0.field596 * var5 / var6;
            }
            int var7 = (this.field341[arg0.field602] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field594 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field588.field1829 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1914 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("ec.j(I)Z")
    public synchronized boolean method641() {
        return this.field353.method988();
    }

    @ObfuscatedName("ec.h(II)V")
    public void method642(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method642(var2);
            }
            return;
        }
        this.field334[arg0] = 12800;
        this.field335[arg0] = 8192;
        this.field336[arg0] = 16383;
        this.field339[arg0] = 8192;
        this.field341[arg0] = 0;
        this.field342[arg0] = 8192;
        this.method620(arg0);
        this.method602(arg0);
        this.field345[arg0] = 0;
        this.field346[arg0] = 32767;
        this.field337[arg0] = 256;
        this.field340[arg0] = 0;
        this.method604(arg0, 8192);
    }

    @ObfuscatedName("ec.u(IIIB)V")
    public void method652(int arg0, int arg1, int arg2) {
        this.method594(arg0, arg1, 64);
        if ((this.field345[arg0] & 0x2) != 0) {
            for (class55 var4 = (class55) this.field359.field325.method1105(); var4 != null; var4 = (class55) this.field359.field325.method1113()) {
                if (var4.field602 == arg0 && var4.field600 < 0) {
                    this.field356[arg0][var4.field591] = null;
                    this.field356[arg0][arg1] = var4;
                    int var5 = (var4.field598 * var4.field592 >> 12) + var4.field586;
                    var4.field586 += arg1 - var4.field591 << 8;
                    var4.field598 = var5 - var4.field586;
                    var4.field592 = 4096;
                    var4.field591 = arg1;
                    return;
                }
            }
        }
        class63 var6 = (class63) this.field351.method8((long) this.field338[arg0]);
        if (var6 == null) {
            return;
        }
        class117 var7 = var6.field937[arg1];
        if (var7 == null) {
            return;
        }
        class55 var8 = new class55();
        var8.field602 = arg0;
        var8.field587 = var6;
        var8.field588 = var7;
        var8.field589 = var6.field941[arg1];
        var8.field595 = var6.field940[arg1];
        var8.field591 = arg1;
        var8.field599 = var6.field942 * arg2 * arg2 * var6.field936[arg1] + 1024 >> 11;
        var8.field593 = var6.field943[arg1] & 0xFF;
        var8.field586 = (arg1 << 8) - (var6.field938[arg1] & 0x7FFF);
        var8.field597 = 0;
        var8.field603 = 0;
        var8.field590 = 0;
        var8.field600 = -1;
        var8.field601 = 0;
        if (this.field340[arg0] == 0) {
            var8.field604 = class180.method3269(var7, this.method622(var8), this.method605(var8), this.method606(var8));
        } else {
            var8.field604 = class180.method3269(var7, this.method622(var8), 0, this.method606(var8));
            this.method592(var8, var6.field938[arg1] < 0);
        }
        if (var6.field938[arg1] < 0) {
            var8.field604.method3271(-1);
        }
        if (var8.field595 >= 0) {
            class55 var9 = this.field352[arg0][var8.field595];
            if (var9 != null && var9.field600 < 0) {
                this.field356[arg0][var9.field591] = null;
                var9.field600 = 0;
            }
            this.field352[arg0][var8.field595] = var8;
        }
        this.field359.field325.method1099(var8);
        this.field356[arg0][arg1] = var8;
    }

    public class35() {
        this.method600();
    }

    @ObfuscatedName("ec.ae(Lex;I)Z")
    public boolean method684(class55 arg0) {
        if (arg0.field604 != null) {
            return false;
        }
        if (arg0.field600 >= 0) {
            arg0.method76();
            if (arg0.field595 > 0 && this.field352[arg0.field602][arg0.field595] == arg0) {
                this.field352[arg0.field602][arg0.field595] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("ec.am(Lex;[IIII)Z")
    public boolean method685(class55 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field605 = Statics.field1914 / 100;
        if (arg0.field600 >= 0 && arg0.field604 == null || arg0.field604.method3285()) {
            arg0.method900();
            arg0.method76();
            if (arg0.field595 > 0 && this.field352[arg0.field602][arg0.field595] == arg0) {
                this.field352[arg0.field602][arg0.field595] = null;
            }
            return true;
        }
        int var5 = arg0.field592;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field342[arg0.field602] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field592 = var6;
        }
        arg0.field604.method3283(this.method622(arg0));
        class81 var7 = arg0.field589;
        boolean var8 = false;
        arg0.field596++;
        arg0.field594 += var7.field1139;
        double var9 = (double) ((arg0.field591 - 60 << 8) + (arg0.field598 * arg0.field592 >> 12)) * 5.086263020833333E-6D;
        if (var7.field1134 > 0) {
            if (var7.field1136 > 0) {
                arg0.field597 += (int) (128.0D * Math.pow(2.0D, (double) var7.field1136 * var9) + 0.5D);
            } else {
                arg0.field597 += 128;
            }
        }
        if (var7.field1133 != null) {
            if (var7.field1135 > 0) {
                arg0.field603 += (int) (128.0D * Math.pow(2.0D, (double) var7.field1135 * var9) + 0.5D);
            } else {
                arg0.field603 += 128;
            }
            while (arg0.field590 < var7.field1133.length - 2 && arg0.field603 > (var7.field1133[arg0.field590 + 2] & 0xFF) << 8) {
                arg0.field590 += 2;
            }
            if (arg0.field590 == var7.field1133.length - 2 && var7.field1133[arg0.field590 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field600 >= 0 && var7.field1142 != null && (this.field345[arg0.field602] & 0x1) == 0 && (arg0.field595 < 0 || this.field352[arg0.field602][arg0.field595] != arg0)) {
            if (var7.field1132 > 0) {
                arg0.field600 += (int) (128.0D * Math.pow(2.0D, (double) var7.field1132 * var9) + 0.5D);
            } else {
                arg0.field600 += 128;
            }
            while (arg0.field601 < var7.field1142.length - 2 && arg0.field600 > (var7.field1142[arg0.field601 + 2] & 0xFF) << 8) {
                arg0.field601 += 2;
            }
            if (arg0.field601 == var7.field1142.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field604.method3281(arg0.field605, this.method605(arg0), this.method606(arg0));
            return false;
        }
        arg0.field604.method3282(arg0.field605);
        if (arg1 == null) {
            arg0.field604.method549(arg3);
        } else {
            arg0.field604.method548(arg1, arg2, arg3);
        }
        if (arg0.field604.method3286()) {
            this.field359.field326.method2842(arg0.field604);
        }
        arg0.method900();
        if (arg0.field600 >= 0) {
            arg0.method76();
            if (arg0.field595 > 0 && this.field352[arg0.field602][arg0.field595] == arg0) {
                this.field352[arg0.field602][arg0.field595] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("ec.f(IB)V")
    public void method689(int arg0) {
        for (class55 var2 = (class55) this.field359.field325.method1104(); var2 != null; var2 = (class55) this.field359.field325.method1106()) {
            if (arg0 < 0 || var2.field602 == arg0) {
                if (var2.field604 != null) {
                    var2.field604.method3282(Statics.field1914 / 100);
                    if (var2.field604.method3286()) {
                        this.field359.field326.method2842(var2.field604);
                    }
                    var2.method900();
                }
                if (var2.field600 < 0) {
                    this.field356[var2.field602][var2.field591] = null;
                }
                var2.method76();
            }
        }
    }
}
