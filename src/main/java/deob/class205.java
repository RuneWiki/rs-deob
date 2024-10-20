package deob;

@ObfuscatedName("gf")
public class class205 extends class120 {

    @ObfuscatedName("gf.p")
    public class191 field2545 = new class191(128);

    @ObfuscatedName("gf.m")
    public int field2525 = 256;

    @ObfuscatedName("gf.e")
    public int field2526 = 1000000;

    @ObfuscatedName("gf.t")
    public int[] field2530 = new int[16];

    @ObfuscatedName("gf.z")
    public int[] field2528 = new int[16];

    @ObfuscatedName("gf.j")
    public int[] field2529 = new int[16];

    @ObfuscatedName("gf.i")
    public int[] field2524 = new int[16];

    @ObfuscatedName("gf.f")
    public int[] field2547 = new int[16];

    @ObfuscatedName("gf.c")
    public int[] field2532 = new int[16];

    @ObfuscatedName("gf.o")
    public int[] field2533 = new int[16];

    @ObfuscatedName("gf.q")
    public int[] field2542 = new int[16];

    @ObfuscatedName("gf.n")
    public int[] field2546 = new int[16];

    @ObfuscatedName("gf.l")
    public int[] field2538 = new int[16];

    @ObfuscatedName("gf.h")
    public int[] field2539 = new int[16];

    @ObfuscatedName("gf.d")
    public int[] field2534 = new int[16];

    @ObfuscatedName("gf.x")
    public int[] field2553 = new int[16];

    @ObfuscatedName("gf.b")
    public int[] field2536 = new int[16];

    @ObfuscatedName("gf.y")
    public int[] field2543 = new int[16];

    @ObfuscatedName("gf.u")
    public class206[][] field2544 = new class206[16][128];

    @ObfuscatedName("gf.av")
    public class206[][] field2548 = new class206[16][128];

    @ObfuscatedName("gf.ax")
    public class207 field2527 = new class207();

    @ObfuscatedName("gf.af")
    public boolean field2540;

    @ObfuscatedName("gf.ae")
    public int field2531;

    @ObfuscatedName("gf.ap")
    public int field2549;

    @ObfuscatedName("gf.ak")
    public long field2550;

    @ObfuscatedName("gf.al")
    public long field2551;

    @ObfuscatedName("gf.ab")
    public class209 field2552 = new class209(this);

    public class205() {
        this.method3351();
    }

    @ObfuscatedName("gf.p(IB)V")
    public synchronized void method3357(int arg0) {
        this.field2525 = arg0;
    }

    @ObfuscatedName("gf.m(I)I")
    public int method3339() {
        return this.field2525;
    }

    @ObfuscatedName("gf.e(Lhy;Lil;Ldg;II)Z")
    public synchronized boolean method3340(class210 arg0, class236 arg1, class113 arg2, int arg3) {
        arg0.method3526();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class200 var7 = (class200) arg0.field2606.method3200(); var7 != null; var7 = (class200) arg0.field2606.method3194()) {
            int var8 = (int) var7.field2483;
            class208 var9 = (class208) this.field2545.method3190((long) var8);
            if (var9 == null) {
                var9 = class208.method1405(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field2545.method3191(var9, (long) var8);
            }
            if (!var9.method3510(arg2, var7.field2498, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3528();
        }
        return var5;
    }

    @ObfuscatedName("gf.t(I)V")
    public synchronized void method3341() {
        for (class208 var1 = (class208) this.field2545.method3200(); var1 != null; var1 = (class208) this.field2545.method3194()) {
            var1.method3508();
        }
    }

    @ObfuscatedName("gf.w(I)V")
    public synchronized void method3346() {
        for (class208 var1 = (class208) this.field2545.method3200(); var1 != null; var1 = (class208) this.field2545.method3194()) {
            var1.method3234();
        }
    }

    @ObfuscatedName("gf.q(Lhy;ZI)V")
    public synchronized void method3343(class210 arg0, boolean arg1) {
        this.method3344();
        this.field2527.method3457(arg0.field2605);
        this.field2540 = arg1;
        this.field2550 = 0L;
        int var3 = this.field2527.method3460();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2527.method3461(var4);
            this.field2527.method3464(var4);
            this.field2527.method3465(var4);
        }
        this.field2531 = this.field2527.method3468();
        this.field2549 = this.field2527.field2581[this.field2531];
        this.field2551 = this.field2527.method3463(this.field2549);
    }

    @ObfuscatedName("gf.a(I)V")
    public synchronized void method3344() {
        this.field2527.method3458();
        this.method3351();
    }

    @ObfuscatedName("gf.g(I)Z")
    public synchronized boolean method3422() {
        return this.field2527.method3459();
    }

    @ObfuscatedName("gf.v(III)V")
    public synchronized void method3436(int arg0, int arg1) {
        this.method3347(arg0, arg1);
    }

    @ObfuscatedName("gf.s(III)V")
    public void method3347(int arg0, int arg1) {
        this.field2524[arg0] = arg1;
        this.field2532[arg0] = arg1 & 0xFFFFFF80;
        this.method3348(arg0, arg1);
    }

    @ObfuscatedName("gf.k(III)V")
    public void method3348(int arg0, int arg1) {
        if (this.field2547[arg0] != arg1) {
            this.field2547[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2548[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("gf.r(IIII)V")
    public void method3349(int arg0, int arg1, int arg2) {
        this.method3387(arg0, arg1, 64);
        if ((this.field2538[arg0] & 0x2) != 0) {
            for (class206 var4 = (class206) this.field2552.field2600.method3253(); var4 != null; var4 = (class206) this.field2552.field2600.method3255()) {
                if (var4.field2576 == arg0 && var4.field2573 < 0) {
                    this.field2544[arg0][var4.field2575] = null;
                    this.field2544[arg0][arg1] = var4;
                    int var5 = (var4.field2565 * var4.field2564 >> 12) + var4.field2563;
                    var4.field2563 += arg1 - var4.field2575 << 8;
                    var4.field2564 = var5 - var4.field2563;
                    var4.field2565 = 4096;
                    var4.field2575 = arg1;
                    return;
                }
            }
        }
        class208 var6 = (class208) this.field2545.method3190((long) this.field2547[arg0]);
        if (var6 == null) {
            return;
        }
        class108 var7 = var6.field2592[arg1];
        if (var7 == null) {
            return;
        }
        class206 var8 = new class206();
        var8.field2576 = arg0;
        var8.field2556 = var6;
        var8.field2560 = var7;
        var8.field2558 = var6.field2596[arg1];
        var8.field2559 = var6.field2597[arg1];
        var8.field2575 = arg1;
        var8.field2561 = var6.field2598 * arg2 * arg2 * var6.field2594[arg1] + 1024 >> 11;
        var8.field2562 = var6.field2593[arg1] & 0xFF;
        var8.field2563 = (arg1 << 8) - (var6.field2591[arg1] & 0x7FFF);
        var8.field2570 = 0;
        var8.field2567 = 0;
        var8.field2568 = 0;
        var8.field2573 = -1;
        var8.field2555 = 0;
        if (this.field2553[arg0] == 0) {
            var8.field2566 = class118.method1904(var7, this.method3410(var8), this.method3363(var8), this.method3386(var8));
        } else {
            var8.field2566 = class118.method1904(var7, this.method3410(var8), 0, this.method3386(var8));
            this.method3368(var8, var6.field2591[arg1] < 0);
        }
        if (var6.field2591[arg1] < 0) {
            var8.field2566.method1996(-1);
        }
        if (var8.field2559 >= 0) {
            class206 var9 = this.field2548[arg0][var8.field2559];
            if (var9 != null && var9.field2573 < 0) {
                this.field2544[arg0][var9.field2575] = null;
                var9.field2573 = 0;
            }
            this.field2548[arg0][var8.field2559] = var8;
        }
        this.field2552.field2600.method3270(var8);
        this.field2544[arg0][arg1] = var8;
    }

    @ObfuscatedName("gf.l(Lgn;ZI)V")
    public void method3368(class206 arg0, boolean arg1) {
        int var3 = arg0.field2560.field1606.length;
        int var5;
        if (arg1 && arg0.field2560.field1609) {
            int var4 = var3 + var3 - arg0.field2560.field1607;
            var5 = (int) ((long) this.field2553[arg0.field2576] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2566.method1912(true);
            }
        } else {
            var5 = (int) ((long) this.field2553[arg0.field2576] * (long) var3 >> 6);
        }
        arg0.field2566.method1911(var5);
    }

    @ObfuscatedName("gf.d(IIIB)V")
    public void method3387(int arg0, int arg1, int arg2) {
        class206 var4 = this.field2544[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2544[arg0][arg1] = null;
        if ((this.field2538[arg0] & 0x2) == 0) {
            var4.field2573 = 0;
            return;
        }
        for (class206 var5 = (class206) this.field2552.field2600.method3252(); var5 != null; var5 = (class206) this.field2552.field2600.method3277()) {
            if (var4.field2576 == var5.field2576 && var5.field2573 < 0 && var4 != var5) {
                var4.field2573 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("gf.x(IIII)V")
    public void method3377(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("gf.b(III)V")
    public void method3352(int arg0, int arg1) {
    }

    @ObfuscatedName("gf.y(IIB)V")
    public void method3337(int arg0, int arg1) {
        this.field2533[arg0] = arg1;
    }

    @ObfuscatedName("gf.u(II)V")
    public void method3354(int arg0) {
        for (class206 var2 = (class206) this.field2552.field2600.method3252(); var2 != null; var2 = (class206) this.field2552.field2600.method3277()) {
            if (arg0 < 0 || var2.field2576 == arg0) {
                if (var2.field2566 != null) {
                    var2.field2566.method1916(Statics.field1636 / 100);
                    if (var2.field2566.method1998()) {
                        this.field2552.field2604.method1690(var2.field2566);
                    }
                    var2.method3454();
                }
                if (var2.field2573 < 0) {
                    this.field2544[var2.field2576][var2.field2575] = null;
                }
                var2.method3234();
            }
        }
    }

    @ObfuscatedName("gf.am(II)V")
    public void method3355(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3355(var2);
            }
            return;
        }
        this.field2530[arg0] = 12800;
        this.field2528[arg0] = 8192;
        this.field2529[arg0] = 16383;
        this.field2533[arg0] = 8192;
        this.field2542[arg0] = 0;
        this.field2546[arg0] = 8192;
        this.method3358(arg0);
        this.method3359(arg0);
        this.field2538[arg0] = 0;
        this.field2539[arg0] = 32767;
        this.field2534[arg0] = 256;
        this.field2553[arg0] = 0;
        this.method3361(arg0, 8192);
    }

    @ObfuscatedName("gf.ar(II)V")
    public void method3356(int arg0) {
        for (class206 var2 = (class206) this.field2552.field2600.method3252(); var2 != null; var2 = (class206) this.field2552.field2600.method3277()) {
            if ((arg0 < 0 || var2.field2576 == arg0) && var2.field2573 < 0) {
                this.field2544[var2.field2576][var2.field2575] = null;
                var2.field2573 = 0;
            }
        }
    }

    @ObfuscatedName("gf.ao(I)V")
    public void method3351() {
        this.method3354(-1);
        this.method3355(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2547[var1] = this.field2524[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2532[var2] = this.field2524[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("gf.ac(II)V")
    public void method3358(int arg0) {
        if ((this.field2538[arg0] & 0x2) == 0) {
            return;
        }
        for (class206 var2 = (class206) this.field2552.field2600.method3252(); var2 != null; var2 = (class206) this.field2552.field2600.method3277()) {
            if (var2.field2576 == arg0 && this.field2544[arg0][var2.field2575] == null && var2.field2573 < 0) {
                var2.field2573 = 0;
            }
        }
    }

    @ObfuscatedName("gf.as(IB)V")
    public void method3359(int arg0) {
        if ((this.field2538[arg0] & 0x4) == 0) {
            return;
        }
        for (class206 var2 = (class206) this.field2552.field2600.method3252(); var2 != null; var2 = (class206) this.field2552.field2600.method3277()) {
            if (var2.field2576 == arg0) {
                var2.field2569 = 0;
            }
        }
    }

    @ObfuscatedName("gf.az(II)V")
    public void method3421(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3387(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3349(var6, var7, var8);
            } else {
                this.method3387(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3377(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2532[var12] = (var14 << 14) + (this.field2532[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2532[var12] = (var14 << 7) + (this.field2532[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2542[var12] = (var14 << 7) + (this.field2542[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2542[var12] = (this.field2542[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2546[var12] = (var14 << 7) + (this.field2546[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2546[var12] = (this.field2546[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2530[var12] = (var14 << 7) + (this.field2530[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2530[var12] = (this.field2530[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2528[var12] = (var14 << 7) + (this.field2528[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2528[var12] = (this.field2528[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2529[var12] = (var14 << 7) + (this.field2529[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2529[var12] = (this.field2529[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2538[var12] |= 0x1;
                } else {
                    this.field2538[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2538[var12] |= 0x2;
                } else {
                    this.method3358(var12);
                    this.field2538[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2539[var12] = (var14 << 7) + (this.field2539[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2539[var12] = (this.field2539[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2539[var12] = (var14 << 7) + (this.field2539[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2539[var12] = (this.field2539[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3354(var12);
            }
            if (var13 == 121) {
                this.method3355(var12);
            }
            if (var13 == 123) {
                this.method3356(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2539[var12];
                if (var15 == 16384) {
                    this.field2534[var12] = (var14 << 7) + (this.field2534[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2539[var12];
                if (var16 == 16384) {
                    this.field2534[var12] = (this.field2534[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2553[var12] = (var14 << 7) + (this.field2553[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2553[var12] = (this.field2553[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2538[var12] |= 0x4;
                } else {
                    this.method3359(var12);
                    this.field2538[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3361(var12, (var14 << 7) + (this.field2536[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3361(var12, (this.field2536[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3348(var17, this.field2532[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3352(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method3337(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3351();
            }
        }
    }

    @ObfuscatedName("gf.ai(IIB)V")
    public void method3361(int arg0, int arg1) {
        this.field2536[arg0] = arg1;
        this.field2543[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("gf.aw(Lgn;I)I")
    public int method3410(class206 arg0) {
        int var2 = (arg0.field2565 * arg0.field2564 >> 12) + arg0.field2563;
        int var3 = ((this.field2533[arg0.field2576] - 8192) * this.field2534[arg0.field2576] >> 12) + var2;
        class203 var4 = arg0.field2558;
        if (var4.field2510 > 0 && (var4.field2509 > 0 || this.field2542[arg0.field2576] > 0)) {
            int var5 = var4.field2509 << 2;
            int var6 = var4.field2505 << 1;
            if (arg0.field2571 < var6) {
                var5 = arg0.field2571 * var5 / var6;
            }
            int var7 = (this.field2542[arg0.field2576] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2572 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2560.field1605 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1636 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("gf.au(Lgn;B)I")
    public int method3363(class206 arg0) {
        class203 var2 = arg0.field2558;
        int var3 = this.field2530[arg0.field2576] * this.field2529[arg0.field2576] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2561 * var4 + 16384 >> 15;
        int var6 = this.field2525 * var5 + 128 >> 8;
        if (var2.field2504 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2570 * 1.953125E-5D * (double) var2.field2504) + 0.5D);
        }
        if (var2.field2511 != null) {
            int var7 = arg0.field2567;
            int var8 = var2.field2511[arg0.field2568 + 1];
            if (arg0.field2568 < var2.field2511.length - 2) {
                int var9 = (var2.field2511[arg0.field2568] & 0xFF) << 8;
                int var10 = (var2.field2511[arg0.field2568 + 2] & 0xFF) << 8;
                var8 += (var2.field2511[arg0.field2568 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2573 > 0 && var2.field2507 != null) {
            int var11 = arg0.field2573;
            int var12 = var2.field2507[arg0.field2555 + 1];
            if (arg0.field2555 < var2.field2507.length - 2) {
                int var13 = (var2.field2507[arg0.field2555] & 0xFF) << 8;
                int var14 = (var2.field2507[arg0.field2555 + 2] & 0xFF) << 8;
                var12 += (var2.field2507[arg0.field2555 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("gf.ah(Lgn;I)I")
    public int method3386(class206 arg0) {
        int var2 = this.field2528[arg0.field2576];
        return var2 < 8192 ? arg0.field2562 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2562) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("gf.z()Ldb;")
    public synchronized class120 method1668() {
        return this.field2552;
    }

    @ObfuscatedName("gf.j()Ldb;")
    public synchronized class120 method1669() {
        return null;
    }

    @ObfuscatedName("gf.c()I")
    public synchronized int method1670() {
        return 0;
    }

    @ObfuscatedName("gf.o([III)V")
    public synchronized void method1671(int[] arg0, int arg1, int arg2) {
        if (this.field2527.method3459()) {
            int var4 = this.field2526 * this.field2527.field2577 / Statics.field1636;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2550;
                if (this.field2551 - var5 >= 0L) {
                    this.field2550 = var5;
                    break;
                }
                int var7 = (int) ((this.field2551 - this.field2550 + (long) var4 - 1L) / (long) var4);
                this.field2550 += (long) var4 * (long) var7;
                this.field2552.method1671(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3365();
            } while (this.field2527.method3459());
        }
        this.field2552.method1671(arg0, arg1, arg2);
    }

    @ObfuscatedName("gf.n(I)V")
    public synchronized void method1673(int arg0) {
        if (this.field2527.method3459()) {
            int var2 = this.field2526 * this.field2527.field2577 / Statics.field1636;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2550;
                if (this.field2551 - var3 >= 0L) {
                    this.field2550 = var3;
                    break;
                }
                int var5 = (int) ((this.field2551 - this.field2550 + (long) var2 - 1L) / (long) var2);
                this.field2550 += (long) var2 * (long) var5;
                this.field2552.method1673(var5);
                arg0 -= var5;
                this.method3365();
            } while (this.field2527.method3459());
        }
        this.field2552.method1673(arg0);
    }

    @ObfuscatedName("gf.ad(S)V")
    public void method3365() {
        int var1 = this.field2531;
        int var2 = this.field2549;
        long var3 = this.field2551;
        while (this.field2549 == var2) {
            while (this.field2527.field2581[var1] == var2) {
                this.field2527.method3461(var1);
                int var5 = this.field2527.method3504(var1);
                if (var5 == 1) {
                    this.field2527.method3462();
                    this.field2527.method3465(var1);
                    if (this.field2527.method3501()) {
                        if (!this.field2540 || var2 == 0) {
                            this.method3351();
                            this.field2527.method3458();
                            return;
                        }
                        this.field2527.method3470(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3421(var5);
                }
                this.field2527.method3464(var1);
                this.field2527.method3465(var1);
            }
            var1 = this.field2527.method3468();
            var2 = this.field2527.field2581[var1];
            var3 = this.field2527.method3463(var2);
        }
        this.field2531 = var1;
        this.field2549 = var2;
        this.field2551 = var3;
    }

    @ObfuscatedName("gf.at(Lgn;I)Z")
    public boolean method3338(class206 arg0) {
        if (arg0.field2566 != null) {
            return false;
        }
        if (arg0.field2573 >= 0) {
            arg0.method3234();
            if (arg0.field2559 > 0 && this.field2548[arg0.field2576][arg0.field2559] == arg0) {
                this.field2548[arg0.field2576][arg0.field2559] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("gf.bg(Lgn;[IIII)Z")
    public boolean method3367(class206 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2574 = Statics.field1636 / 100;
        if (arg0.field2573 >= 0 && arg0.field2566 == null || arg0.field2566.method1918()) {
            arg0.method3454();
            arg0.method3234();
            if (arg0.field2559 > 0 && this.field2548[arg0.field2576][arg0.field2559] == arg0) {
                this.field2548[arg0.field2576][arg0.field2559] = null;
            }
            return true;
        }
        int var5 = arg0.field2565;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2546[arg0.field2576] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2565 = var6;
        }
        arg0.field2566.method1993(this.method3410(arg0));
        class203 var7 = arg0.field2558;
        boolean var8 = false;
        arg0.field2571++;
        arg0.field2572 += var7.field2510;
        double var9 = (double) ((arg0.field2575 - 60 << 8) + (arg0.field2565 * arg0.field2564 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2504 > 0) {
            if (var7.field2508 > 0) {
                arg0.field2570 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2508 * var9) + 0.5D);
            } else {
                arg0.field2570 += 128;
            }
        }
        if (var7.field2511 != null) {
            if (var7.field2512 > 0) {
                arg0.field2567 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2512 * var9) + 0.5D);
            } else {
                arg0.field2567 += 128;
            }
            while (arg0.field2568 < var7.field2511.length - 2 && arg0.field2567 > (var7.field2511[arg0.field2568 + 2] & 0xFF) << 8) {
                arg0.field2568 += 2;
            }
            if (arg0.field2568 == var7.field2511.length - 2 && var7.field2511[arg0.field2568 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2573 >= 0 && var7.field2507 != null && (this.field2538[arg0.field2576] & 0x1) == 0 && (arg0.field2559 < 0 || this.field2548[arg0.field2576][arg0.field2559] != arg0)) {
            if (var7.field2506 > 0) {
                arg0.field2573 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2506 * var9) + 0.5D);
            } else {
                arg0.field2573 += 128;
            }
            while (arg0.field2555 < var7.field2507.length - 2 && arg0.field2573 > (var7.field2507[arg0.field2555 + 2] & 0xFF) << 8) {
                arg0.field2555 += 2;
            }
            if (arg0.field2555 == var7.field2507.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2566.method1915(arg0.field2574, this.method3363(arg0), this.method3386(arg0));
            return false;
        }
        arg0.field2566.method1916(arg0.field2574);
        if (arg1 == null) {
            arg0.field2566.method1673(arg3);
        } else {
            arg0.field2566.method1671(arg1, arg2, arg3);
        }
        if (arg0.field2566.method1998()) {
            this.field2552.field2604.method1690(arg0.field2566);
        }
        arg0.method3454();
        if (arg0.field2573 >= 0) {
            arg0.method3234();
            if (arg0.field2559 > 0 && this.field2548[arg0.field2576][arg0.field2559] == arg0) {
                this.field2548[arg0.field2576][arg0.field2559] = null;
            }
        }
        return true;
    }
}
