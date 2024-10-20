package deob;

@ObfuscatedName("hn")
public class class226 extends class113 {

    @ObfuscatedName("hn.a")
    public class210 field2569 = new class210(128);

    @ObfuscatedName("hn.s")
    public int field2561 = 256;

    @ObfuscatedName("hn.g")
    public int field2562 = 1000000;

    @ObfuscatedName("hn.x")
    public int[] field2563 = new int[16];

    @ObfuscatedName("hn.h")
    public int[] field2564 = new int[16];

    @ObfuscatedName("hn.f")
    public int[] field2565 = new int[16];

    @ObfuscatedName("hn.p")
    public int[] field2566 = new int[16];

    @ObfuscatedName("hn.m")
    public int[] field2567 = new int[16];

    @ObfuscatedName("hn.q")
    public int[] field2568 = new int[16];

    @ObfuscatedName("hn.b")
    public int[] field2583 = new int[16];

    @ObfuscatedName("hn.n")
    public int[] field2570 = new int[16];

    @ObfuscatedName("hn.e")
    public int[] field2571 = new int[16];

    @ObfuscatedName("hn.v")
    public int[] field2574 = new int[16];

    @ObfuscatedName("hn.d")
    public int[] field2576 = new int[16];

    @ObfuscatedName("hn.w")
    public int[] field2580 = new int[16];

    @ObfuscatedName("hn.i")
    public int[] field2560 = new int[16];

    @ObfuscatedName("hn.c")
    public int[] field2577 = new int[16];

    @ObfuscatedName("hn.j")
    public int[] field2578 = new int[16];

    @ObfuscatedName("hn.z")
    public class227[][] field2579 = new class227[16][128];

    @ObfuscatedName("hn.ag")
    public class227[][] field2585 = new class227[16][128];

    @ObfuscatedName("hn.af")
    public class228 field2581 = new class228();

    @ObfuscatedName("hn.ay")
    public boolean field2582;

    @ObfuscatedName("hn.aa")
    public int field2575;

    @ObfuscatedName("hn.ab")
    public int field2584;

    @ObfuscatedName("hn.ah")
    public long field2572;

    @ObfuscatedName("hn.aw")
    public long field2586;

    @ObfuscatedName("hn.an")
    public class230 field2573 = new class230(this);

    public class226() {
        this.method4103();
    }

    @ObfuscatedName("hn.a(IB)V")
    public synchronized void method4072(int arg0) {
        this.field2561 = arg0;
    }

    @ObfuscatedName("hn.s(I)I")
    public int method4170() {
        return this.field2561;
    }

    @ObfuscatedName("hn.g(Lhx;Liz;Lds;II)Z")
    public synchronized boolean method4074(class231 arg0, class255 arg1, class106 arg2, int arg3) {
        arg0.method4251();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class221 var7 = (class221) arg0.field2639.method3914(); var7 != null; var7 = (class221) arg0.field2639.method3915()) {
            int var8 = (int) var7.field2512;
            class229 var9 = (class229) this.field2569.method3911((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method4429(var8);
                class229 var11;
                if (var10 == null) {
                    var11 = null;
                } else {
                    var11 = new class229(var10);
                }
                var9 = var11;
                if (var11 == null) {
                    var5 = false;
                    continue;
                }
                this.field2569.method3920(var11, (long) var8);
            }
            if (!var9.method4237(arg2, var7.field2529, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method4249();
        }
        return var5;
    }

    @ObfuscatedName("hn.x(B)V")
    public synchronized void method4129() {
        for (class229 var1 = (class229) this.field2569.method3914(); var1 != null; var1 = (class229) this.field2569.method3915()) {
            var1.method4232();
        }
    }

    @ObfuscatedName("hn.h(I)V")
    public synchronized void method4075() {
        for (class229 var1 = (class229) this.field2569.method3914(); var1 != null; var1 = (class229) this.field2569.method3915()) {
            var1.method3960();
        }
    }

    @ObfuscatedName("hn.b(Lhx;ZI)V")
    public synchronized void method4076(class231 arg0, boolean arg1) {
        this.method4077();
        this.field2581.method4209(arg0.field2640);
        this.field2582 = arg1;
        this.field2572 = 0L;
        int var3 = this.field2581.method4185();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2581.method4186(var4);
            this.field2581.method4188(var4);
            this.field2581.method4216(var4);
        }
        this.field2575 = this.field2581.method4194();
        this.field2584 = this.field2581.field2613[this.field2575];
        this.field2586 = this.field2581.method4193(this.field2584);
    }

    @ObfuscatedName("hn.e(I)V")
    public synchronized void method4077() {
        this.field2581.method4189();
        this.method4103();
    }

    @ObfuscatedName("hn.r(I)Z")
    public synchronized boolean method4173() {
        return this.field2581.method4184();
    }

    @ObfuscatedName("hn.t(III)V")
    public synchronized void method4079(int arg0, int arg1) {
        this.method4172(arg0, arg1);
    }

    @ObfuscatedName("hn.l(III)V")
    public void method4172(int arg0, int arg1) {
        this.field2566[arg0] = arg1;
        this.field2568[arg0] = arg1 & 0xFFFFFF80;
        this.method4158(arg0, arg1);
    }

    @ObfuscatedName("hn.o(III)V")
    public void method4158(int arg0, int arg1) {
        if (this.field2567[arg0] != arg1) {
            this.field2567[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2585[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("hn.u(IIII)V")
    public void method4082(int arg0, int arg1, int arg2) {
        this.method4102(arg0, arg1, 64);
        if ((this.field2574[arg0] & 0x2) != 0) {
            for (class227 var4 = (class227) this.field2573.field2634.method3972(); var4 != null; var4 = (class227) this.field2573.field2634.method3989()) {
                if (var4.field2602 == arg0 && var4.field2589 < 0) {
                    this.field2579[arg0][var4.field2604] = null;
                    this.field2579[arg0][arg1] = var4;
                    int var5 = (var4.field2597 * var4.field2595 >> 12) + var4.field2596;
                    var4.field2596 += arg1 - var4.field2604 << 8;
                    var4.field2597 = var5 - var4.field2596;
                    var4.field2595 = 4096;
                    var4.field2604 = arg1;
                    return;
                }
            }
        }
        class229 var6 = (class229) this.field2569.method3911((long) this.field2567[arg0]);
        if (var6 == null) {
            return;
        }
        class101 var7 = var6.field2623[arg1];
        if (var7 == null) {
            return;
        }
        class227 var8 = new class227();
        var8.field2602 = arg0;
        var8.field2588 = var6;
        var8.field2599 = var7;
        var8.field2591 = var6.field2628[arg1];
        var8.field2592 = var6.field2625[arg1];
        var8.field2604 = arg1;
        var8.field2594 = var6.field2629 * arg2 * arg2 * var6.field2624[arg1] + 1024 >> 11;
        var8.field2590 = var6.field2627[arg1] & 0xFF;
        var8.field2596 = (arg1 << 8) - (var6.field2626[arg1] & 0x7FFF);
        var8.field2607 = 0;
        var8.field2600 = 0;
        var8.field2601 = 0;
        var8.field2589 = -1;
        var8.field2603 = 0;
        if (this.field2560[arg0] == 0) {
            var8.field2606 = class111.method2365(var7, this.method4094(var8), this.method4162(var8), this.method4096(var8));
        } else {
            var8.field2606 = class111.method2365(var7, this.method4094(var8), 0, this.method4096(var8));
            this.method4083(var8, var6.field2626[arg1] < 0);
        }
        if (var6.field2626[arg1] < 0) {
            var8.field2606.method2344(-1);
        }
        if (var8.field2592 >= 0) {
            class227 var9 = this.field2585[arg0][var8.field2592];
            if (var9 != null && var9.field2589 < 0) {
                this.field2579[arg0][var9.field2604] = null;
                var9.field2589 = 0;
            }
            this.field2585[arg0][var8.field2592] = var8;
        }
        this.field2573.field2634.method3966(var8);
        this.field2579[arg0][arg1] = var8;
    }

    @ObfuscatedName("hn.y(Lhl;ZB)V")
    public void method4083(class227 arg0, boolean arg1) {
        int var3 = arg0.field2599.field1371.length;
        int var5;
        if (arg1 && arg0.field2599.field1374) {
            int var4 = var3 + var3 - arg0.field2599.field1370;
            var5 = (int) ((long) this.field2560[arg0.field2602] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2606.method2351(true);
            }
        } else {
            var5 = (int) ((long) this.field2560[arg0.field2602] * (long) var3 >> 6);
        }
        arg0.field2606.method2446(var5);
    }

    @ObfuscatedName("hn.k(IIIB)V")
    public void method4102(int arg0, int arg1, int arg2) {
        class227 var4 = this.field2579[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2579[arg0][arg1] = null;
        if ((this.field2574[arg0] & 0x2) == 0) {
            var4.field2589 = 0;
            return;
        }
        for (class227 var5 = (class227) this.field2573.field2634.method3990(); var5 != null; var5 = (class227) this.field2573.field2634.method3984()) {
            if (var4.field2602 == var5.field2602 && var5.field2589 < 0 && var4 != var5) {
                var4.field2589 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("hn.v(IIII)V")
    public void method4073(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("hn.c(IIB)V")
    public void method4086(int arg0, int arg1) {
    }

    @ObfuscatedName("hn.aa(III)V")
    public void method4153(int arg0, int arg1) {
        this.field2583[arg0] = arg1;
    }

    @ObfuscatedName("hn.ab(II)V")
    public void method4087(int arg0) {
        for (class227 var2 = (class227) this.field2573.field2634.method3990(); var2 != null; var2 = (class227) this.field2573.field2634.method3984()) {
            if (arg0 < 0 || var2.field2602 == arg0) {
                if (var2.field2606 != null) {
                    var2.field2606.method2355(Statics.field367 / 100);
                    if (var2.field2606.method2359()) {
                        this.field2573.field2636.method2124(var2.field2606);
                    }
                    var2.method4177();
                }
                if (var2.field2589 < 0) {
                    this.field2579[var2.field2602][var2.field2604] = null;
                }
                var2.method3960();
            }
        }
    }

    @ObfuscatedName("hn.ah(II)V")
    public void method4088(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method4088(var2);
            }
            return;
        }
        this.field2563[arg0] = 12800;
        this.field2564[arg0] = 8192;
        this.field2565[arg0] = 16383;
        this.field2583[arg0] = 8192;
        this.field2570[arg0] = 0;
        this.field2571[arg0] = 8192;
        this.method4120(arg0);
        this.method4091(arg0);
        this.field2574[arg0] = 0;
        this.field2576[arg0] = 32767;
        this.field2580[arg0] = 256;
        this.field2560[arg0] = 0;
        this.method4093(arg0, 8192);
    }

    @ObfuscatedName("hn.aw(II)V")
    public void method4092(int arg0) {
        for (class227 var2 = (class227) this.field2573.field2634.method3990(); var2 != null; var2 = (class227) this.field2573.field2634.method3984()) {
            if ((arg0 < 0 || var2.field2602 == arg0) && var2.field2589 < 0) {
                this.field2579[var2.field2602][var2.field2604] = null;
                var2.field2589 = 0;
            }
        }
    }

    @ObfuscatedName("hn.an(I)V")
    public void method4103() {
        this.method4087(-1);
        this.method4088(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2567[var1] = this.field2566[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2568[var2] = this.field2566[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("hn.at(IB)V")
    public void method4120(int arg0) {
        if ((this.field2574[arg0] & 0x2) == 0) {
            return;
        }
        for (class227 var2 = (class227) this.field2573.field2634.method3990(); var2 != null; var2 = (class227) this.field2573.field2634.method3984()) {
            if (var2.field2602 == arg0 && this.field2579[arg0][var2.field2604] == null && var2.field2589 < 0) {
                var2.field2589 = 0;
            }
        }
    }

    @ObfuscatedName("hn.al(II)V")
    public void method4091(int arg0) {
        if ((this.field2574[arg0] & 0x4) == 0) {
            return;
        }
        for (class227 var2 = (class227) this.field2573.field2634.method3990(); var2 != null; var2 = (class227) this.field2573.field2634.method3984()) {
            if (var2.field2602 == arg0) {
                var2.field2608 = 0;
            }
        }
    }

    @ObfuscatedName("hn.ao(IS)V")
    public void method4089(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method4102(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method4082(var6, var7, var8);
            } else {
                this.method4102(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method4073(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2568[var12] = (var14 << 14) + (this.field2568[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2568[var12] = (var14 << 7) + (this.field2568[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2570[var12] = (var14 << 7) + (this.field2570[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2570[var12] = (this.field2570[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2571[var12] = (var14 << 7) + (this.field2571[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2571[var12] = (this.field2571[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2563[var12] = (var14 << 7) + (this.field2563[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2563[var12] = (this.field2563[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2564[var12] = (var14 << 7) + (this.field2564[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2564[var12] = (this.field2564[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2565[var12] = (var14 << 7) + (this.field2565[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2565[var12] = (this.field2565[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2574[var12] |= 0x1;
                } else {
                    this.field2574[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2574[var12] |= 0x2;
                } else {
                    this.method4120(var12);
                    this.field2574[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2576[var12] = (var14 << 7) + (this.field2576[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2576[var12] = (this.field2576[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2576[var12] = (var14 << 7) + (this.field2576[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2576[var12] = (this.field2576[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method4087(var12);
            }
            if (var13 == 121) {
                this.method4088(var12);
            }
            if (var13 == 123) {
                this.method4092(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2576[var12];
                if (var15 == 16384) {
                    this.field2580[var12] = (var14 << 7) + (this.field2580[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2576[var12];
                if (var16 == 16384) {
                    this.field2580[var12] = (this.field2580[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2560[var12] = (var14 << 7) + (this.field2560[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2560[var12] = (this.field2560[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2574[var12] |= 0x4;
                } else {
                    this.method4091(var12);
                    this.field2574[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method4093(var12, (var14 << 7) + (this.field2577[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method4093(var12, (this.field2577[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method4158(var17, this.field2568[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method4086(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method4153(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method4103();
            }
        }
    }

    @ObfuscatedName("hn.ad(III)V")
    public void method4093(int arg0, int arg1) {
        this.field2577[arg0] = arg1;
        this.field2578[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("hn.ax(Lhl;I)I")
    public int method4094(class227 arg0) {
        int var2 = (arg0.field2597 * arg0.field2595 >> 12) + arg0.field2596;
        int var3 = ((this.field2583[arg0.field2602] - 8192) * this.field2580[arg0.field2602] >> 12) + var2;
        class224 var4 = arg0.field2591;
        if (var4.field2542 > 0 && (var4.field2541 > 0 || this.field2570[arg0.field2602] > 0)) {
            int var5 = var4.field2541 << 2;
            int var6 = var4.field2543 << 1;
            if (arg0.field2593 < var6) {
                var5 = arg0.field2593 * var5 / var6;
            }
            int var7 = (this.field2570[arg0.field2602] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2605 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2599.field1373 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field367 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("hn.ak(Lhl;I)I")
    public int method4162(class227 arg0) {
        class224 var2 = arg0.field2591;
        int var3 = this.field2565[arg0.field2602] * this.field2563[arg0.field2602] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2594 * var4 + 16384 >> 15;
        int var6 = this.field2561 * var5 + 128 >> 8;
        if (var2.field2547 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2607 * 1.953125E-5D * (double) var2.field2547) + 0.5D);
        }
        if (var2.field2540 != null) {
            int var7 = arg0.field2600;
            int var8 = var2.field2540[arg0.field2601 + 1];
            if (arg0.field2601 < var2.field2540.length - 2) {
                int var9 = (var2.field2540[arg0.field2601] & 0xFF) << 8;
                int var10 = (var2.field2540[arg0.field2601 + 2] & 0xFF) << 8;
                var8 += (var2.field2540[arg0.field2601 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2589 > 0 && var2.field2536 != null) {
            int var11 = arg0.field2589;
            int var12 = var2.field2536[arg0.field2603 + 1];
            if (arg0.field2603 < var2.field2536.length - 2) {
                int var13 = (var2.field2536[arg0.field2603] & 0xFF) << 8;
                int var14 = (var2.field2536[arg0.field2603 + 2] & 0xFF) << 8;
                var12 += (var2.field2536[arg0.field2603 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("hn.am(Lhl;I)I")
    public int method4096(class227 arg0) {
        int var2 = this.field2564[arg0.field2602];
        return var2 < 8192 ? arg0.field2590 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2590) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("hn.f()Ldo;")
    public synchronized class113 method2139() {
        return this.field2573;
    }

    @ObfuscatedName("hn.p()Ldo;")
    public synchronized class113 method2125() {
        return null;
    }

    @ObfuscatedName("hn.m()I")
    public synchronized int method2156() {
        return 0;
    }

    @ObfuscatedName("hn.q([III)V")
    public synchronized void method2127(int[] arg0, int arg1, int arg2) {
        if (this.field2581.method4184()) {
            int var4 = this.field2562 * this.field2581.field2615 / Statics.field367;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2572;
                if (this.field2586 - var5 >= 0L) {
                    this.field2572 = var5;
                    break;
                }
                int var7 = (int) ((this.field2586 - this.field2572 + (long) var4 - 1L) / (long) var4);
                this.field2572 += (long) var4 * (long) var7;
                this.field2573.method2127(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method4099();
            } while (this.field2581.method4184());
        }
        this.field2573.method2127(arg0, arg1, arg2);
    }

    @ObfuscatedName("hn.n(I)V")
    public synchronized void method2129(int arg0) {
        if (this.field2581.method4184()) {
            int var2 = this.field2562 * this.field2581.field2615 / Statics.field367;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2572;
                if (this.field2586 - var3 >= 0L) {
                    this.field2572 = var3;
                    break;
                }
                int var5 = (int) ((this.field2586 - this.field2572 + (long) var2 - 1L) / (long) var2);
                this.field2572 += (long) var2 * (long) var5;
                this.field2573.method2129(var5);
                arg0 -= var5;
                this.method4099();
            } while (this.field2581.method4184());
        }
        this.field2573.method2129(arg0);
    }

    @ObfuscatedName("hn.bf(B)V")
    public void method4099() {
        int var1 = this.field2575;
        int var2 = this.field2584;
        long var3 = this.field2586;
        while (this.field2584 == var2) {
            while (this.field2581.field2613[var1] == var2) {
                this.field2581.method4186(var1);
                int var5 = this.field2581.method4190(var1);
                if (var5 == 1) {
                    this.field2581.method4212();
                    this.field2581.method4216(var1);
                    if (this.field2581.method4195()) {
                        if (!this.field2582 || var2 == 0) {
                            this.method4103();
                            this.field2581.method4189();
                            return;
                        }
                        this.field2581.method4196(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method4089(var5);
                }
                this.field2581.method4188(var1);
                this.field2581.method4216(var1);
            }
            var1 = this.field2581.method4194();
            var2 = this.field2581.field2613[var1];
            var3 = this.field2581.method4193(var2);
        }
        this.field2575 = var1;
        this.field2584 = var2;
        this.field2586 = var3;
    }

    @ObfuscatedName("hn.bo(Lhl;I)Z")
    public boolean method4095(class227 arg0) {
        if (arg0.field2606 != null) {
            return false;
        }
        if (arg0.field2589 >= 0) {
            arg0.method3960();
            if (arg0.field2592 > 0 && this.field2585[arg0.field2602][arg0.field2592] == arg0) {
                this.field2585[arg0.field2602][arg0.field2592] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("hn.be(Lhl;[IIII)Z")
    public boolean method4101(class227 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2598 = Statics.field367 / 100;
        if (arg0.field2589 >= 0 && arg0.field2606 == null || arg0.field2606.method2358()) {
            arg0.method4177();
            arg0.method3960();
            if (arg0.field2592 > 0 && this.field2585[arg0.field2602][arg0.field2592] == arg0) {
                this.field2585[arg0.field2602][arg0.field2592] = null;
            }
            return true;
        }
        int var5 = arg0.field2595;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2571[arg0.field2602] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2595 = var6;
        }
        arg0.field2606.method2356(this.method4094(arg0));
        class224 var7 = arg0.field2591;
        boolean var8 = false;
        arg0.field2593++;
        arg0.field2605 += var7.field2542;
        double var9 = (double) ((arg0.field2604 - 60 << 8) + (arg0.field2597 * arg0.field2595 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2547 > 0) {
            if (var7.field2544 > 0) {
                arg0.field2607 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2544 * var9) + 0.5D);
            } else {
                arg0.field2607 += 128;
            }
        }
        if (var7.field2540 != null) {
            if (var7.field2538 > 0) {
                arg0.field2600 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2538 * var9) + 0.5D);
            } else {
                arg0.field2600 += 128;
            }
            while (arg0.field2601 < var7.field2540.length - 2 && arg0.field2600 > (var7.field2540[arg0.field2601 + 2] & 0xFF) << 8) {
                arg0.field2601 += 2;
            }
            if (arg0.field2601 == var7.field2540.length - 2 && var7.field2540[arg0.field2601 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2589 >= 0 && var7.field2536 != null && (this.field2574[arg0.field2602] & 0x1) == 0 && (arg0.field2592 < 0 || this.field2585[arg0.field2602][arg0.field2592] != arg0)) {
            if (var7.field2537 > 0) {
                arg0.field2589 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2537 * var9) + 0.5D);
            } else {
                arg0.field2589 += 128;
            }
            while (arg0.field2603 < var7.field2536.length - 2 && arg0.field2589 > (var7.field2536[arg0.field2603 + 2] & 0xFF) << 8) {
                arg0.field2603 += 2;
            }
            if (arg0.field2603 == var7.field2536.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2606.method2354(arg0.field2598, this.method4162(arg0), this.method4096(arg0));
            return false;
        }
        arg0.field2606.method2355(arg0.field2598);
        if (arg1 == null) {
            arg0.field2606.method2129(arg3);
        } else {
            arg0.field2606.method2127(arg1, arg2, arg3);
        }
        if (arg0.field2606.method2359()) {
            this.field2573.field2636.method2124(arg0.field2606);
        }
        arg0.method4177();
        if (arg0.field2589 >= 0) {
            arg0.method3960();
            if (arg0.field2592 > 0 && this.field2585[arg0.field2602][arg0.field2592] == arg0) {
                this.field2585[arg0.field2602][arg0.field2592] = null;
            }
        }
        return true;
    }
}
