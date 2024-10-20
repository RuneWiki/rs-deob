package deob;

@ObfuscatedName("hu")
public class class216 extends class119 {

    @ObfuscatedName("hu.n")
    public class202 field2650 = new class202(128);

    @ObfuscatedName("hu.v")
    public int field2638 = 256;

    @ObfuscatedName("hu.y")
    public int field2655 = 1000000;

    @ObfuscatedName("hu.r")
    public int[] field2649 = new int[16];

    @ObfuscatedName("hu.h")
    public int[] field2641 = new int[16];

    @ObfuscatedName("hu.d")
    public int[] field2642 = new int[16];

    @ObfuscatedName("hu.s")
    public int[] field2643 = new int[16];

    @ObfuscatedName("hu.b")
    public int[] field2644 = new int[16];

    @ObfuscatedName("hu.e")
    public int[] field2645 = new int[16];

    @ObfuscatedName("hu.f")
    public int[] field2646 = new int[16];

    @ObfuscatedName("hu.z")
    public int[] field2647 = new int[16];

    @ObfuscatedName("hu.u")
    public int[] field2663 = new int[16];

    @ObfuscatedName("hu.x")
    public int[] field2651 = new int[16];

    @ObfuscatedName("hu.l")
    public int[] field2648 = new int[16];

    @ObfuscatedName("hu.j")
    public int[] field2637 = new int[16];

    @ObfuscatedName("hu.g")
    public int[] field2652 = new int[16];

    @ObfuscatedName("hu.c")
    public int[] field2653 = new int[16];

    @ObfuscatedName("hu.k")
    public int[] field2654 = new int[16];

    @ObfuscatedName("hu.q")
    public class217[][] field2657 = new class217[16][128];

    @ObfuscatedName("hu.ac")
    public class217[][] field2656 = new class217[16][128];

    @ObfuscatedName("hu.aw")
    public class218 field2661 = new class218();

    @ObfuscatedName("hu.at")
    public boolean field2640;

    @ObfuscatedName("hu.ag")
    public int field2659;

    @ObfuscatedName("hu.ad")
    public int field2660;

    @ObfuscatedName("hu.af")
    public long field2665;

    @ObfuscatedName("hu.az")
    public long field2662;

    @ObfuscatedName("hu.ae")
    public class220 field2658 = new class220(this);

    public class216() {
        this.method3589();
    }

    @ObfuscatedName("hu.n(IB)V")
    public synchronized void method3571(int arg0) {
        this.field2638 = arg0;
    }

    @ObfuscatedName("hu.v(I)I")
    public int method3655() {
        return this.field2638;
    }

    @ObfuscatedName("hu.y(Lhf;Lil;Lde;II)Z")
    public synchronized boolean method3654(class221 arg0, class247 arg1, class112 arg2, int arg3) {
        arg0.method3757();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class211 var7 = (class211) arg0.field2716.method3419(); var7 != null; var7 = (class211) arg0.field2716.method3415()) {
            int var8 = (int) var7.field2597;
            class219 var9 = (class219) this.field2650.method3416((long) var8);
            if (var9 == null) {
                var9 = class219.method615(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field2650.method3417(var9, (long) var8);
            }
            if (!var9.method3744(arg2, var7.field2612, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3756();
        }
        return var5;
    }

    @ObfuscatedName("hu.r(B)V")
    public synchronized void method3573() {
        for (class219 var1 = (class219) this.field2650.method3419(); var1 != null; var1 = (class219) this.field2650.method3415()) {
            var1.method3734();
        }
    }

    @ObfuscatedName("hu.h(I)V")
    public synchronized void method3574() {
        for (class219 var1 = (class219) this.field2650.method3419(); var1 != null; var1 = (class219) this.field2650.method3415()) {
            var1.method3474();
        }
    }

    @ObfuscatedName("hu.f(Lhf;ZI)V")
    public synchronized void method3575(class221 arg0, boolean arg1) {
        this.method3576();
        this.field2661.method3681(arg0.field2717);
        this.field2640 = arg1;
        this.field2665 = 0L;
        int var3 = this.field2661.method3684();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2661.method3704(var4);
            this.field2661.method3688(var4);
            this.field2661.method3686(var4);
        }
        this.field2659 = this.field2661.method3711();
        this.field2660 = this.field2661.field2692[this.field2659];
        this.field2662 = this.field2661.method3692(this.field2660);
    }

    @ObfuscatedName("hu.t(S)V")
    public synchronized void method3576() {
        this.field2661.method3682();
        this.method3589();
    }

    @ObfuscatedName("hu.o(I)Z")
    public synchronized boolean method3577() {
        return this.field2661.method3683();
    }

    @ObfuscatedName("hu.a(III)V")
    public synchronized void method3578(int arg0, int arg1) {
        this.method3579(arg0, arg1);
    }

    @ObfuscatedName("hu.i(III)V")
    public void method3579(int arg0, int arg1) {
        this.field2643[arg0] = arg1;
        this.field2645[arg0] = arg1 & 0xFFFFFF80;
        this.method3580(arg0, arg1);
    }

    @ObfuscatedName("hu.m(IIS)V")
    public void method3580(int arg0, int arg1) {
        if (this.field2644[arg0] != arg1) {
            this.field2644[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2656[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("hu.x(IIII)V")
    public void method3581(int arg0, int arg1, int arg2) {
        this.method3583(arg0, arg1, 64);
        if ((this.field2651[arg0] & 0x2) != 0) {
            for (class217 var4 = (class217) this.field2658.field2713.method3490(); var4 != null; var4 = (class217) this.field2658.field2713.method3506()) {
                if (var4.field2667 == arg0 && var4.field2668 < 0) {
                    this.field2657[arg0][var4.field2671] = null;
                    this.field2657[arg0][arg1] = var4;
                    int var5 = (var4.field2684 * var4.field2675 >> 12) + var4.field2672;
                    var4.field2672 += arg1 - var4.field2671 << 8;
                    var4.field2675 = var5 - var4.field2672;
                    var4.field2684 = 4096;
                    var4.field2671 = arg1;
                    return;
                }
            }
        }
        class219 var6 = (class219) this.field2650.method3416((long) this.field2644[arg0]);
        if (var6 == null) {
            return;
        }
        class107 var7 = var6.field2708[arg1];
        if (var7 == null) {
            return;
        }
        class217 var8 = new class217();
        var8.field2667 = arg0;
        var8.field2680 = var6;
        var8.field2670 = var7;
        var8.field2669 = var6.field2709[arg1];
        var8.field2666 = var6.field2707[arg1];
        var8.field2671 = arg1;
        var8.field2685 = var6.field2703 * arg2 * arg2 * var6.field2705[arg1] + 1024 >> 11;
        var8.field2673 = var6.field2706[arg1] & 0xFF;
        var8.field2672 = (arg1 << 8) - (var6.field2704[arg1] & 0x7FFF);
        var8.field2677 = 0;
        var8.field2678 = 0;
        var8.field2681 = 0;
        var8.field2668 = -1;
        var8.field2676 = 0;
        if (this.field2652[arg0] == 0) {
            var8.field2674 = class117.method2101(var7, this.method3594(var8), this.method3652(var8), this.method3596(var8));
        } else {
            var8.field2674 = class117.method2101(var7, this.method3594(var8), 0, this.method3596(var8));
            this.method3664(var8, var6.field2704[arg1] < 0);
        }
        if (var6.field2704[arg1] < 0) {
            var8.field2674.method2001(-1);
        }
        if (var8.field2666 >= 0) {
            class217 var9 = this.field2656[arg0][var8.field2666];
            if (var9 != null && var9.field2668 < 0) {
                this.field2657[arg0][var9.field2671] = null;
                var9.field2668 = 0;
            }
            this.field2656[arg0][var8.field2666] = var8;
        }
        this.field2658.field2713.method3482(var8);
        this.field2657[arg0][arg1] = var8;
    }

    @ObfuscatedName("hu.j(Lhb;ZI)V")
    public void method3664(class217 arg0, boolean arg1) {
        int var3 = arg0.field2670.field1523.length;
        int var5;
        if (arg1 && arg0.field2670.field1526) {
            int var4 = var3 + var3 - arg0.field2670.field1522;
            var5 = (int) ((long) this.field2652[arg0.field2667] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2674.method2008(true);
            }
        } else {
            var5 = (int) ((long) this.field2652[arg0.field2667] * (long) var3 >> 6);
        }
        arg0.field2674.method2051(var5);
    }

    @ObfuscatedName("hu.g(IIIB)V")
    public void method3583(int arg0, int arg1, int arg2) {
        class217 var4 = this.field2657[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2657[arg0][arg1] = null;
        if ((this.field2651[arg0] & 0x2) == 0) {
            var4.field2668 = 0;
            return;
        }
        for (class217 var5 = (class217) this.field2658.field2713.method3492(); var5 != null; var5 = (class217) this.field2658.field2713.method3481()) {
            if (var4.field2667 == var5.field2667 && var5.field2668 < 0 && var4 != var5) {
                var4.field2668 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("hu.c(IIII)V")
    public void method3584(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("hu.k(IIB)V")
    public void method3599(int arg0, int arg1) {
    }

    @ObfuscatedName("hu.q(III)V")
    public void method3650(int arg0, int arg1) {
        this.field2646[arg0] = arg1;
    }

    @ObfuscatedName("hu.ac(II)V")
    public void method3586(int arg0) {
        for (class217 var2 = (class217) this.field2658.field2713.method3492(); var2 != null; var2 = (class217) this.field2658.field2713.method3481()) {
            if (arg0 < 0 || var2.field2667 == arg0) {
                if (var2.field2674 != null) {
                    var2.field2674.method2011(Statics.field1542 / 100);
                    if (var2.field2674.method2012()) {
                        this.field2658.field2712.method1787(var2.field2674);
                    }
                    var2.method3677();
                }
                if (var2.field2668 < 0) {
                    this.field2657[var2.field2667][var2.field2671] = null;
                }
                var2.method3474();
            }
        }
    }

    @ObfuscatedName("hu.aw(IB)V")
    public void method3607(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3607(var2);
            }
            return;
        }
        this.field2649[arg0] = 12800;
        this.field2641[arg0] = 8192;
        this.field2642[arg0] = 16383;
        this.field2646[arg0] = 8192;
        this.field2647[arg0] = 0;
        this.field2663[arg0] = 8192;
        this.method3590(arg0);
        this.method3591(arg0);
        this.field2651[arg0] = 0;
        this.field2648[arg0] = 32767;
        this.field2637[arg0] = 256;
        this.field2652[arg0] = 0;
        this.method3593(arg0, 8192);
    }

    @ObfuscatedName("hu.at(II)V")
    public void method3588(int arg0) {
        for (class217 var2 = (class217) this.field2658.field2713.method3492(); var2 != null; var2 = (class217) this.field2658.field2713.method3481()) {
            if ((arg0 < 0 || var2.field2667 == arg0) && var2.field2668 < 0) {
                this.field2657[var2.field2667][var2.field2671] = null;
                var2.field2668 = 0;
            }
        }
    }

    @ObfuscatedName("hu.ag(B)V")
    public void method3589() {
        this.method3586(-1);
        this.method3607(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2644[var1] = this.field2643[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2645[var2] = this.field2643[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("hu.ad(IB)V")
    public void method3590(int arg0) {
        if ((this.field2651[arg0] & 0x2) == 0) {
            return;
        }
        for (class217 var2 = (class217) this.field2658.field2713.method3492(); var2 != null; var2 = (class217) this.field2658.field2713.method3481()) {
            if (var2.field2667 == arg0 && this.field2657[arg0][var2.field2671] == null && var2.field2668 < 0) {
                var2.field2668 = 0;
            }
        }
    }

    @ObfuscatedName("hu.ak(IB)V")
    public void method3591(int arg0) {
        if ((this.field2651[arg0] & 0x4) == 0) {
            return;
        }
        for (class217 var2 = (class217) this.field2658.field2713.method3492(); var2 != null; var2 = (class217) this.field2658.field2713.method3481()) {
            if (var2.field2667 == arg0) {
                var2.field2686 = 0;
            }
        }
    }

    @ObfuscatedName("hu.as(IB)V")
    public void method3592(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3583(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3581(var6, var7, var8);
            } else {
                this.method3583(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3584(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2645[var12] = (var14 << 14) + (this.field2645[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2645[var12] = (var14 << 7) + (this.field2645[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2647[var12] = (var14 << 7) + (this.field2647[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2647[var12] = (this.field2647[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2663[var12] = (var14 << 7) + (this.field2663[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2663[var12] = (this.field2663[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2649[var12] = (var14 << 7) + (this.field2649[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2649[var12] = (this.field2649[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2641[var12] = (var14 << 7) + (this.field2641[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2641[var12] = (this.field2641[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2642[var12] = (var14 << 7) + (this.field2642[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2642[var12] = (this.field2642[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2651[var12] |= 0x1;
                } else {
                    this.field2651[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2651[var12] |= 0x2;
                } else {
                    this.method3590(var12);
                    this.field2651[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2648[var12] = (var14 << 7) + (this.field2648[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2648[var12] = (this.field2648[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2648[var12] = (var14 << 7) + (this.field2648[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2648[var12] = (this.field2648[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3586(var12);
            }
            if (var13 == 121) {
                this.method3607(var12);
            }
            if (var13 == 123) {
                this.method3588(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2648[var12];
                if (var15 == 16384) {
                    this.field2637[var12] = (var14 << 7) + (this.field2637[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2648[var12];
                if (var16 == 16384) {
                    this.field2637[var12] = (this.field2637[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2652[var12] = (var14 << 7) + (this.field2652[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2652[var12] = (this.field2652[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2651[var12] |= 0x4;
                } else {
                    this.method3591(var12);
                    this.field2651[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3593(var12, (var14 << 7) + (this.field2653[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3593(var12, (this.field2653[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3580(var17, this.field2645[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3599(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method3650(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3589();
            }
        }
    }

    @ObfuscatedName("hu.bg(III)V")
    public void method3593(int arg0, int arg1) {
        this.field2653[arg0] = arg1;
        this.field2654[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("hu.bk(Lhb;B)I")
    public int method3594(class217 arg0) {
        int var2 = (arg0.field2684 * arg0.field2675 >> 12) + arg0.field2672;
        int var3 = ((this.field2646[arg0.field2667] - 8192) * this.field2637[arg0.field2667] >> 12) + var2;
        class214 var4 = arg0.field2669;
        if (var4.field2619 > 0 && (var4.field2623 > 0 || this.field2647[arg0.field2667] > 0)) {
            int var5 = var4.field2623 << 2;
            int var6 = var4.field2620 << 1;
            if (arg0.field2682 < var6) {
                var5 = arg0.field2682 * var5 / var6;
            }
            int var7 = (this.field2647[arg0.field2667] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2683 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2670.field1524 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1542 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("hu.by(Lhb;B)I")
    public int method3652(class217 arg0) {
        class214 var2 = arg0.field2669;
        int var3 = this.field2649[arg0.field2667] * this.field2642[arg0.field2667] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2685 * var4 + 16384 >> 15;
        int var6 = this.field2638 * var5 + 128 >> 8;
        if (var2.field2621 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2677 * 1.953125E-5D * (double) var2.field2621) + 0.5D);
        }
        if (var2.field2622 != null) {
            int var7 = arg0.field2678;
            int var8 = var2.field2622[arg0.field2681 + 1];
            if (arg0.field2681 < var2.field2622.length - 2) {
                int var9 = (var2.field2622[arg0.field2681] & 0xFF) << 8;
                int var10 = (var2.field2622[arg0.field2681 + 2] & 0xFF) << 8;
                var8 += (var2.field2622[arg0.field2681 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2668 > 0 && var2.field2618 != null) {
            int var11 = arg0.field2668;
            int var12 = var2.field2618[arg0.field2676 + 1];
            if (arg0.field2676 < var2.field2618.length - 2) {
                int var13 = (var2.field2618[arg0.field2676] & 0xFF) << 8;
                int var14 = (var2.field2618[arg0.field2676 + 2] & 0xFF) << 8;
                var12 += (var2.field2618[arg0.field2676 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("hu.bz(Lhb;I)I")
    public int method3596(class217 arg0) {
        int var2 = this.field2641[arg0.field2667];
        return var2 < 8192 ? arg0.field2673 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2673) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("hu.d()Ldk;")
    public synchronized class119 method1779() {
        return this.field2658;
    }

    @ObfuscatedName("hu.s()Ldk;")
    public synchronized class119 method1778() {
        return null;
    }

    @ObfuscatedName("hu.b()I")
    public synchronized int method1815() {
        return 0;
    }

    @ObfuscatedName("hu.e([III)V")
    public synchronized void method1780(int[] arg0, int arg1, int arg2) {
        if (this.field2661.method3683()) {
            int var4 = this.field2655 * this.field2661.field2689 / Statics.field1542;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2665;
                if (this.field2662 - var5 >= 0L) {
                    this.field2665 = var5;
                    break;
                }
                int var7 = (int) ((this.field2662 - this.field2665 + (long) var4 - 1L) / (long) var4);
                this.field2665 += (long) var4 * (long) var7;
                this.field2658.method1780(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3601();
            } while (this.field2661.method3683());
        }
        this.field2658.method1780(arg0, arg1, arg2);
    }

    @ObfuscatedName("hu.u(I)V")
    public synchronized void method1799(int arg0) {
        if (this.field2661.method3683()) {
            int var2 = this.field2655 * this.field2661.field2689 / Statics.field1542;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2665;
                if (this.field2662 - var3 >= 0L) {
                    this.field2665 = var3;
                    break;
                }
                int var5 = (int) ((this.field2662 - this.field2665 + (long) var2 - 1L) / (long) var2);
                this.field2665 += (long) var2 * (long) var5;
                this.field2658.method1799(var5);
                arg0 -= var5;
                this.method3601();
            } while (this.field2661.method3683());
        }
        this.field2658.method1799(arg0);
    }

    @ObfuscatedName("hu.bj(I)V")
    public void method3601() {
        int var1 = this.field2659;
        int var2 = this.field2660;
        long var3 = this.field2662;
        while (this.field2660 == var2) {
            while (this.field2661.field2692[var1] == var2) {
                this.field2661.method3704(var1);
                int var5 = this.field2661.method3689(var1);
                if (var5 == 1) {
                    this.field2661.method3690();
                    this.field2661.method3686(var1);
                    if (this.field2661.method3694()) {
                        if (!this.field2640 || var2 == 0) {
                            this.method3589();
                            this.field2661.method3682();
                            return;
                        }
                        this.field2661.method3695(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3592(var5);
                }
                this.field2661.method3688(var1);
                this.field2661.method3686(var1);
            }
            var1 = this.field2661.method3711();
            var2 = this.field2661.field2692[var1];
            var3 = this.field2661.method3692(var2);
        }
        this.field2659 = var1;
        this.field2660 = var2;
        this.field2662 = var3;
    }

    @ObfuscatedName("hu.bd(Lhb;I)Z")
    public boolean method3602(class217 arg0) {
        if (arg0.field2674 != null) {
            return false;
        }
        if (arg0.field2668 >= 0) {
            arg0.method3474();
            if (arg0.field2666 > 0 && this.field2656[arg0.field2667][arg0.field2666] == arg0) {
                this.field2656[arg0.field2667][arg0.field2666] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("hu.bi(Lhb;[IIII)Z")
    public boolean method3603(class217 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2679 = Statics.field1542 / 100;
        if (arg0.field2668 >= 0 && arg0.field2674 == null || arg0.field2674.method1996()) {
            arg0.method3677();
            arg0.method3474();
            if (arg0.field2666 > 0 && this.field2656[arg0.field2667][arg0.field2666] == arg0) {
                this.field2656[arg0.field2667][arg0.field2666] = null;
            }
            return true;
        }
        int var5 = arg0.field2684;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2663[arg0.field2667] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2684 = var6;
        }
        arg0.field2674.method2022(this.method3594(arg0));
        class214 var7 = arg0.field2669;
        boolean var8 = false;
        arg0.field2682++;
        arg0.field2683 += var7.field2619;
        double var9 = (double) ((arg0.field2671 - 60 << 8) + (arg0.field2684 * arg0.field2675 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2621 > 0) {
            if (var7.field2624 > 0) {
                arg0.field2677 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2624 * var9) + 0.5D);
            } else {
                arg0.field2677 += 128;
            }
        }
        if (var7.field2622 != null) {
            if (var7.field2617 > 0) {
                arg0.field2678 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2617 * var9) + 0.5D);
            } else {
                arg0.field2678 += 128;
            }
            while (arg0.field2681 < var7.field2622.length - 2 && arg0.field2678 > (var7.field2622[arg0.field2681 + 2] & 0xFF) << 8) {
                arg0.field2681 += 2;
            }
            if (arg0.field2681 == var7.field2622.length - 2 && var7.field2622[arg0.field2681 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2668 >= 0 && var7.field2618 != null && (this.field2651[arg0.field2667] & 0x1) == 0 && (arg0.field2666 < 0 || this.field2656[arg0.field2667][arg0.field2666] != arg0)) {
            if (var7.field2625 > 0) {
                arg0.field2668 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2625 * var9) + 0.5D);
            } else {
                arg0.field2668 += 128;
            }
            while (arg0.field2676 < var7.field2618.length - 2 && arg0.field2668 > (var7.field2618[arg0.field2676 + 2] & 0xFF) << 8) {
                arg0.field2676 += 2;
            }
            if (arg0.field2676 == var7.field2618.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2674.method2075(arg0.field2679, this.method3652(arg0), this.method3596(arg0));
            return false;
        }
        arg0.field2674.method2011(arg0.field2679);
        if (arg1 == null) {
            arg0.field2674.method1799(arg3);
        } else {
            arg0.field2674.method1780(arg1, arg2, arg3);
        }
        if (arg0.field2674.method2012()) {
            this.field2658.field2712.method1787(arg0.field2674);
        }
        arg0.method3677();
        if (arg0.field2668 >= 0) {
            arg0.method3474();
            if (arg0.field2666 > 0 && this.field2656[arg0.field2667][arg0.field2666] == arg0) {
                this.field2656[arg0.field2667][arg0.field2666] = null;
            }
        }
        return true;
    }
}
