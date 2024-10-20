package deob;

@ObfuscatedName("hj")
public class class226 extends class113 {

    @ObfuscatedName("hj.n")
    public class210 field2556 = new class210(128);

    @ObfuscatedName("hj.h")
    public int field2543 = 256;

    @ObfuscatedName("hj.l")
    public int field2544 = 1000000;

    @ObfuscatedName("hj.g")
    public int[] field2545 = new int[16];

    @ObfuscatedName("hj.b")
    public int[] field2542 = new int[16];

    @ObfuscatedName("hj.a")
    public int[] field2547 = new int[16];

    @ObfuscatedName("hj.c")
    public int[] field2566 = new int[16];

    @ObfuscatedName("hj.z")
    public int[] field2549 = new int[16];

    @ObfuscatedName("hj.j")
    public int[] field2550 = new int[16];

    @ObfuscatedName("hj.d")
    public int[] field2551 = new int[16];

    @ObfuscatedName("hj.t")
    public int[] field2559 = new int[16];

    @ObfuscatedName("hj.f")
    public int[] field2553 = new int[16];

    @ObfuscatedName("hj.k")
    public int[] field2554 = new int[16];

    @ObfuscatedName("hj.o")
    public int[] field2565 = new int[16];

    @ObfuscatedName("hj.s")
    public int[] field2567 = new int[16];

    @ObfuscatedName("hj.u")
    public int[] field2563 = new int[16];

    @ObfuscatedName("hj.e")
    public int[] field2552 = new int[16];

    @ObfuscatedName("hj.w")
    public int[] field2546 = new int[16];

    @ObfuscatedName("hj.q")
    public class227[][] field2560 = new class227[16][128];

    @ObfuscatedName("hj.aa")
    public class227[][] field2561 = new class227[16][128];

    @ObfuscatedName("hj.ai")
    public class228 field2562 = new class228();

    @ObfuscatedName("hj.ag")
    public boolean field2548;

    @ObfuscatedName("hj.at")
    public int field2564;

    @ObfuscatedName("hj.ad")
    public int field2558;

    @ObfuscatedName("hj.as")
    public long field2557;

    @ObfuscatedName("hj.ac")
    public long field2555;

    @ObfuscatedName("hj.an")
    public class230 field2568 = new class230(this);

    public class226() {
        this.method4161();
    }

    @ObfuscatedName("hj.n(II)V")
    public synchronized void method4109(int arg0) {
        this.field2543 = arg0;
    }

    @ObfuscatedName("hj.h(I)I")
    public int method4110() {
        return this.field2543;
    }

    @ObfuscatedName("hj.l(Lhz;Lij;Ldi;II)Z")
    public synchronized boolean method4143(class231 arg0, class254 arg1, class106 arg2, int arg3) {
        arg0.method4296();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class221 var7 = (class221) arg0.field2623.method3937(); var7 != null; var7 = (class221) arg0.field2623.method3941()) {
            int var8 = (int) var7.field2502;
            class229 var9 = (class229) this.field2556.method3934((long) var8);
            if (var9 == null) {
                var9 = class229.method1069(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field2556.method3935(var9, (long) var8);
            }
            if (!var9.method4281(arg2, var7.field2519, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method4294();
        }
        return var5;
    }

    @ObfuscatedName("hj.g(I)V")
    public synchronized void method4112() {
        for (class229 var1 = (class229) this.field2556.method3937(); var1 != null; var1 = (class229) this.field2556.method3941()) {
            var1.method4272();
        }
    }

    @ObfuscatedName("hj.b(I)V")
    public synchronized void method4113() {
        for (class229 var1 = (class229) this.field2556.method3937(); var1 != null; var1 = (class229) this.field2556.method3941()) {
            var1.method3973();
        }
    }

    @ObfuscatedName("hj.d(Lhz;ZI)V")
    public synchronized void method4114(class231 arg0, boolean arg1) {
        this.method4115();
        this.field2562.method4219(arg0.field2622);
        this.field2548 = arg1;
        this.field2557 = 0L;
        int var3 = this.field2562.method4248();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2562.method4223(var4);
            this.field2562.method4226(var4);
            this.field2562.method4224(var4);
        }
        this.field2564 = this.field2562.method4221();
        this.field2558 = this.field2562.field2599[this.field2564];
        this.field2555 = this.field2562.method4266(this.field2558);
    }

    @ObfuscatedName("hj.m(S)V")
    public synchronized void method4115() {
        this.field2562.method4220();
        this.method4161();
    }

    @ObfuscatedName("hj.v(B)Z")
    public synchronized boolean method4116() {
        return this.field2562.method4225();
    }

    @ObfuscatedName("hj.r(III)V")
    public synchronized void method4117(int arg0, int arg1) {
        this.method4182(arg0, arg1);
    }

    @ObfuscatedName("hj.x(III)V")
    public void method4182(int arg0, int arg1) {
        this.field2566[arg0] = arg1;
        this.field2550[arg0] = arg1 & 0xFFFFFF80;
        this.method4194(arg0, arg1);
    }

    @ObfuscatedName("hj.y(IIB)V")
    public void method4194(int arg0, int arg1) {
        if (this.field2549[arg0] != arg1) {
            this.field2549[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2561[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("hj.p(IIIB)V")
    public void method4119(int arg0, int arg1, int arg2) {
        this.method4192(arg0, arg1, 64);
        if ((this.field2554[arg0] & 0x2) != 0) {
            for (class227 var4 = (class227) this.field2568.field2616.method4003(); var4 != null; var4 = (class227) this.field2568.field2616.method3989()) {
                if (var4.field2587 == arg0 && var4.field2584 < 0) {
                    this.field2560[arg0][var4.field2575] = null;
                    this.field2560[arg0][arg1] = var4;
                    int var5 = (var4.field2588 * var4.field2580 >> 12) + var4.field2578;
                    var4.field2578 += arg1 - var4.field2575 << 8;
                    var4.field2588 = var5 - var4.field2578;
                    var4.field2580 = 4096;
                    var4.field2575 = arg1;
                    return;
                }
            }
        }
        class229 var6 = (class229) this.field2556.method3934((long) this.field2549[arg0]);
        if (var6 == null) {
            return;
        }
        class101 var7 = var6.field2607[arg1];
        if (var7 == null) {
            return;
        }
        class227 var8 = new class227();
        var8.field2587 = arg0;
        var8.field2586 = var6;
        var8.field2572 = var7;
        var8.field2573 = var6.field2611[arg1];
        var8.field2570 = var6.field2612[arg1];
        var8.field2575 = arg1;
        var8.field2589 = var6.field2615 * arg2 * arg2 * var6.field2609[arg1] + 1024 >> 11;
        var8.field2577 = var6.field2610[arg1] & 0xFF;
        var8.field2578 = (arg1 << 8) - (var6.field2608[arg1] & 0x7FFF);
        var8.field2581 = 0;
        var8.field2582 = 0;
        var8.field2583 = 0;
        var8.field2584 = -1;
        var8.field2585 = 0;
        if (this.field2563[arg0] == 0) {
            var8.field2576 = class111.method2327(var7, this.method4131(var8), this.method4132(var8), this.method4197(var8));
        } else {
            var8.field2576 = class111.method2327(var7, this.method4131(var8), 0, this.method4197(var8));
            this.method4111(var8, var6.field2608[arg1] < 0);
        }
        if (var6.field2608[arg1] < 0) {
            var8.field2576.method2378(-1);
        }
        if (var8.field2570 >= 0) {
            class227 var9 = this.field2561[arg0][var8.field2570];
            if (var9 != null && var9.field2584 < 0) {
                this.field2560[arg0][var9.field2575] = null;
                var9.field2584 = 0;
            }
            this.field2561[arg0][var8.field2570] = var8;
        }
        this.field2568.field2616.method3981(var8);
        this.field2560[arg0][arg1] = var8;
    }

    @ObfuscatedName("hj.k(Lhq;ZI)V")
    public void method4111(class227 arg0, boolean arg1) {
        int var3 = arg0.field2572.field1337.length;
        int var5;
        if (arg1 && arg0.field2572.field1341) {
            int var4 = var3 + var3 - arg0.field2572.field1339;
            var5 = (int) ((long) this.field2563[arg0.field2587] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2576.method2336(true);
            }
        } else {
            var5 = (int) ((long) this.field2563[arg0.field2587] * (long) var3 >> 6);
        }
        arg0.field2576.method2335(var5);
    }

    @ObfuscatedName("hj.o(IIII)V")
    public void method4192(int arg0, int arg1, int arg2) {
        class227 var4 = this.field2560[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2560[arg0][arg1] = null;
        if ((this.field2554[arg0] & 0x2) == 0) {
            var4.field2584 = 0;
            return;
        }
        for (class227 var5 = (class227) this.field2568.field2616.method3986(); var5 != null; var5 = (class227) this.field2568.field2616.method3988()) {
            if (var4.field2587 == var5.field2587 && var5.field2584 < 0 && var4 != var5) {
                var4.field2584 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("hj.s(IIIB)V")
    public void method4199(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("hj.u(III)V")
    public void method4122(int arg0, int arg1) {
    }

    @ObfuscatedName("hj.aa(III)V")
    public void method4118(int arg0, int arg1) {
        this.field2551[arg0] = arg1;
    }

    @ObfuscatedName("hj.ai(IB)V")
    public void method4123(int arg0) {
        for (class227 var2 = (class227) this.field2568.field2616.method3986(); var2 != null; var2 = (class227) this.field2568.field2616.method3988()) {
            if (arg0 < 0 || var2.field2587 == arg0) {
                if (var2.field2576 != null) {
                    var2.field2576.method2339(Statics.field1374 / 100);
                    if (var2.field2576.method2337()) {
                        this.field2568.field2617.method2090(var2.field2576);
                    }
                    var2.method4212();
                }
                if (var2.field2584 < 0) {
                    this.field2560[var2.field2587][var2.field2575] = null;
                }
                var2.method3973();
            }
        }
    }

    @ObfuscatedName("hj.ag(II)V")
    public void method4124(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method4124(var2);
            }
            return;
        }
        this.field2545[arg0] = 12800;
        this.field2542[arg0] = 8192;
        this.field2547[arg0] = 16383;
        this.field2551[arg0] = 8192;
        this.field2559[arg0] = 0;
        this.field2553[arg0] = 8192;
        this.method4108(arg0);
        this.method4128(arg0);
        this.field2554[arg0] = 0;
        this.field2565[arg0] = 32767;
        this.field2567[arg0] = 256;
        this.field2563[arg0] = 0;
        this.method4134(arg0, 8192);
    }

    @ObfuscatedName("hj.at(II)V")
    public void method4125(int arg0) {
        for (class227 var2 = (class227) this.field2568.field2616.method3986(); var2 != null; var2 = (class227) this.field2568.field2616.method3988()) {
            if ((arg0 < 0 || var2.field2587 == arg0) && var2.field2584 < 0) {
                this.field2560[var2.field2587][var2.field2575] = null;
                var2.field2584 = 0;
            }
        }
    }

    @ObfuscatedName("hj.ae(B)V")
    public void method4161() {
        this.method4123(-1);
        this.method4124(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2549[var1] = this.field2566[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2550[var2] = this.field2566[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("hj.au(II)V")
    public void method4108(int arg0) {
        if ((this.field2554[arg0] & 0x2) == 0) {
            return;
        }
        for (class227 var2 = (class227) this.field2568.field2616.method3986(); var2 != null; var2 = (class227) this.field2568.field2616.method3988()) {
            if (var2.field2587 == arg0 && this.field2560[arg0][var2.field2575] == null && var2.field2584 < 0) {
                var2.field2584 = 0;
            }
        }
    }

    @ObfuscatedName("hj.az(II)V")
    public void method4128(int arg0) {
        if ((this.field2554[arg0] & 0x4) == 0) {
            return;
        }
        for (class227 var2 = (class227) this.field2568.field2616.method3986(); var2 != null; var2 = (class227) this.field2568.field2616.method3988()) {
            if (var2.field2587 == arg0) {
                var2.field2590 = 0;
            }
        }
    }

    @ObfuscatedName("hj.aj(II)V")
    public void method4129(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method4192(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method4119(var6, var7, var8);
            } else {
                this.method4192(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method4199(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2550[var12] = (var14 << 14) + (this.field2550[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2550[var12] = (var14 << 7) + (this.field2550[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2559[var12] = (var14 << 7) + (this.field2559[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2559[var12] = (this.field2559[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2553[var12] = (var14 << 7) + (this.field2553[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2553[var12] = (this.field2553[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2545[var12] = (var14 << 7) + (this.field2545[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2545[var12] = (this.field2545[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2542[var12] = (var14 << 7) + (this.field2542[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2542[var12] = (this.field2542[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2547[var12] = (var14 << 7) + (this.field2547[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2547[var12] = (this.field2547[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2554[var12] |= 0x1;
                } else {
                    this.field2554[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2554[var12] |= 0x2;
                } else {
                    this.method4108(var12);
                    this.field2554[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2565[var12] = (var14 << 7) + (this.field2565[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2565[var12] = (this.field2565[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2565[var12] = (var14 << 7) + (this.field2565[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2565[var12] = (this.field2565[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method4123(var12);
            }
            if (var13 == 121) {
                this.method4124(var12);
            }
            if (var13 == 123) {
                this.method4125(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2565[var12];
                if (var15 == 16384) {
                    this.field2567[var12] = (var14 << 7) + (this.field2567[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2565[var12];
                if (var16 == 16384) {
                    this.field2567[var12] = (this.field2567[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2563[var12] = (var14 << 7) + (this.field2563[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2563[var12] = (this.field2563[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2554[var12] |= 0x4;
                } else {
                    this.method4128(var12);
                    this.field2554[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method4134(var12, (var14 << 7) + (this.field2552[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method4134(var12, (this.field2552[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method4194(var17, this.field2550[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method4122(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method4118(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method4161();
            }
        }
    }

    @ObfuscatedName("hj.ar(IIB)V")
    public void method4134(int arg0, int arg1) {
        this.field2552[arg0] = arg1;
        this.field2546[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("hj.ap(Lhq;B)I")
    public int method4131(class227 arg0) {
        int var2 = (arg0.field2588 * arg0.field2580 >> 12) + arg0.field2578;
        int var3 = ((this.field2551[arg0.field2587] - 8192) * this.field2567[arg0.field2587] >> 12) + var2;
        class224 var4 = arg0.field2573;
        if (var4.field2530 > 0 && (var4.field2534 > 0 || this.field2559[arg0.field2587] > 0)) {
            int var5 = var4.field2534 << 2;
            int var6 = var4.field2533 << 1;
            if (arg0.field2579 < var6) {
                var5 = arg0.field2579 * var5 / var6;
            }
            int var7 = (this.field2559[arg0.field2587] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2571 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2572.field1340 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1374 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("hj.av(Lhq;B)I")
    public int method4132(class227 arg0) {
        class224 var2 = arg0.field2573;
        int var3 = this.field2547[arg0.field2587] * this.field2545[arg0.field2587] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2589 * var4 + 16384 >> 15;
        int var6 = this.field2543 * var5 + 128 >> 8;
        if (var2.field2527 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2581 * 1.953125E-5D * (double) var2.field2527) + 0.5D);
        }
        if (var2.field2525 != null) {
            int var7 = arg0.field2582;
            int var8 = var2.field2525[arg0.field2583 + 1];
            if (arg0.field2583 < var2.field2525.length - 2) {
                int var9 = (var2.field2525[arg0.field2583] & 0xFF) << 8;
                int var10 = (var2.field2525[arg0.field2583 + 2] & 0xFF) << 8;
                var8 += (var2.field2525[arg0.field2583 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2584 > 0 && var2.field2526 != null) {
            int var11 = arg0.field2584;
            int var12 = var2.field2526[arg0.field2585 + 1];
            if (arg0.field2585 < var2.field2526.length - 2) {
                int var13 = (var2.field2526[arg0.field2585] & 0xFF) << 8;
                int var14 = (var2.field2526[arg0.field2585 + 2] & 0xFF) << 8;
                var12 += (var2.field2526[arg0.field2585 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("hj.af(Lhq;I)I")
    public int method4197(class227 arg0) {
        int var2 = this.field2542[arg0.field2587];
        return var2 < 8192 ? arg0.field2577 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2577) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("hj.a()Ldv;")
    public synchronized class113 method2128() {
        return this.field2568;
    }

    @ObfuscatedName("hj.c()Ldv;")
    public synchronized class113 method2093() {
        return null;
    }

    @ObfuscatedName("hj.z()I")
    public synchronized int method2122() {
        return 0;
    }

    @ObfuscatedName("hj.j([III)V")
    public synchronized void method2098(int[] arg0, int arg1, int arg2) {
        if (this.field2562.method4225()) {
            int var4 = this.field2544 * this.field2562.field2593 / Statics.field1374;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2557;
                if (this.field2555 - var5 >= 0L) {
                    this.field2557 = var5;
                    break;
                }
                int var7 = (int) ((this.field2555 - this.field2557 + (long) var4 - 1L) / (long) var4);
                this.field2557 += (long) var4 * (long) var7;
                this.field2568.method2098(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method4135();
            } while (this.field2562.method4225());
        }
        this.field2568.method2098(arg0, arg1, arg2);
    }

    @ObfuscatedName("hj.i(I)V")
    public synchronized void method2100(int arg0) {
        if (this.field2562.method4225()) {
            int var2 = this.field2544 * this.field2562.field2593 / Statics.field1374;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2557;
                if (this.field2555 - var3 >= 0L) {
                    this.field2557 = var3;
                    break;
                }
                int var5 = (int) ((this.field2555 - this.field2557 + (long) var2 - 1L) / (long) var2);
                this.field2557 += (long) var2 * (long) var5;
                this.field2568.method2100(var5);
                arg0 -= var5;
                this.method4135();
            } while (this.field2562.method4225());
        }
        this.field2568.method2100(arg0);
    }

    @ObfuscatedName("hj.bf(B)V")
    public void method4135() {
        int var1 = this.field2564;
        int var2 = this.field2558;
        long var3 = this.field2555;
        while (this.field2558 == var2) {
            while (this.field2562.field2599[var1] == var2) {
                this.field2562.method4223(var1);
                int var5 = this.field2562.method4227(var1);
                if (var5 == 1) {
                    this.field2562.method4237();
                    this.field2562.method4224(var1);
                    if (this.field2562.method4231()) {
                        if (!this.field2548 || var2 == 0) {
                            this.method4161();
                            this.field2562.method4220();
                            return;
                        }
                        this.field2562.method4232(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method4129(var5);
                }
                this.field2562.method4226(var1);
                this.field2562.method4224(var1);
            }
            var1 = this.field2562.method4221();
            var2 = this.field2562.field2599[var1];
            var3 = this.field2562.method4266(var2);
        }
        this.field2564 = var1;
        this.field2558 = var2;
        this.field2555 = var3;
    }

    @ObfuscatedName("hj.bi(Lhq;I)Z")
    public boolean method4127(class227 arg0) {
        if (arg0.field2576 != null) {
            return false;
        }
        if (arg0.field2584 >= 0) {
            arg0.method3973();
            if (arg0.field2570 > 0 && this.field2561[arg0.field2587][arg0.field2570] == arg0) {
                this.field2561[arg0.field2587][arg0.field2570] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("hj.bx(Lhq;[IIII)Z")
    public boolean method4138(class227 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2574 = Statics.field1374 / 100;
        if (arg0.field2584 >= 0 && arg0.field2576 == null || arg0.field2576.method2342()) {
            arg0.method4212();
            arg0.method3973();
            if (arg0.field2570 > 0 && this.field2561[arg0.field2587][arg0.field2570] == arg0) {
                this.field2561[arg0.field2587][arg0.field2570] = null;
            }
            return true;
        }
        int var5 = arg0.field2580;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2553[arg0.field2587] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2580 = var6;
        }
        arg0.field2576.method2340(this.method4131(arg0));
        class224 var7 = arg0.field2573;
        boolean var8 = false;
        arg0.field2579++;
        arg0.field2571 += var7.field2530;
        double var9 = (double) ((arg0.field2575 - 60 << 8) + (arg0.field2588 * arg0.field2580 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2527 > 0) {
            if (var7.field2532 > 0) {
                arg0.field2581 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2532 * var9) + 0.5D);
            } else {
                arg0.field2581 += 128;
            }
        }
        if (var7.field2525 != null) {
            if (var7.field2528 > 0) {
                arg0.field2582 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2528 * var9) + 0.5D);
            } else {
                arg0.field2582 += 128;
            }
            while (arg0.field2583 < var7.field2525.length - 2 && arg0.field2582 > (var7.field2525[arg0.field2583 + 2] & 0xFF) << 8) {
                arg0.field2583 += 2;
            }
            if (arg0.field2583 == var7.field2525.length - 2 && var7.field2525[arg0.field2583 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2584 >= 0 && var7.field2526 != null && (this.field2554[arg0.field2587] & 0x1) == 0 && (arg0.field2570 < 0 || this.field2561[arg0.field2587][arg0.field2570] != arg0)) {
            if (var7.field2529 > 0) {
                arg0.field2584 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2529 * var9) + 0.5D);
            } else {
                arg0.field2584 += 128;
            }
            while (arg0.field2585 < var7.field2526.length - 2 && arg0.field2584 > (var7.field2526[arg0.field2585 + 2] & 0xFF) << 8) {
                arg0.field2585 += 2;
            }
            if (arg0.field2585 == var7.field2526.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2576.method2410(arg0.field2574, this.method4132(arg0), this.method4197(arg0));
            return false;
        }
        arg0.field2576.method2339(arg0.field2574);
        if (arg1 == null) {
            arg0.field2576.method2100(arg3);
        } else {
            arg0.field2576.method2098(arg1, arg2, arg3);
        }
        if (arg0.field2576.method2337()) {
            this.field2568.field2617.method2090(arg0.field2576);
        }
        arg0.method4212();
        if (arg0.field2584 >= 0) {
            arg0.method3973();
            if (arg0.field2570 > 0 && this.field2561[arg0.field2587][arg0.field2570] == arg0) {
                this.field2561[arg0.field2587][arg0.field2570] = null;
            }
        }
        return true;
    }
}
