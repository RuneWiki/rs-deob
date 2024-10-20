package deob;

@ObfuscatedName("ht")
public class class216 extends class119 {

    @ObfuscatedName("ht.a")
    public class202 field2642 = new class202(128);

    @ObfuscatedName("ht.e")
    public int field2631 = 256;

    @ObfuscatedName("ht.k")
    public int field2656 = 1000000;

    @ObfuscatedName("ht.u")
    public int[] field2633 = new int[16];

    @ObfuscatedName("ht.z")
    public int[] field2634 = new int[16];

    @ObfuscatedName("ht.t")
    public int[] field2630 = new int[16];

    @ObfuscatedName("ht.f")
    public int[] field2651 = new int[16];

    @ObfuscatedName("ht.g")
    public int[] field2637 = new int[16];

    @ObfuscatedName("ht.j")
    public int[] field2638 = new int[16];

    @ObfuscatedName("ht.x")
    public int[] field2636 = new int[16];

    @ObfuscatedName("ht.c")
    public int[] field2640 = new int[16];

    @ObfuscatedName("ht.s")
    public int[] field2641 = new int[16];

    @ObfuscatedName("ht.m")
    public int[] field2643 = new int[16];

    @ObfuscatedName("ht.q")
    public int[] field2644 = new int[16];

    @ObfuscatedName("ht.b")
    public int[] field2645 = new int[16];

    @ObfuscatedName("ht.h")
    public int[] field2632 = new int[16];

    @ObfuscatedName("ht.d")
    public int[] field2647 = new int[16];

    @ObfuscatedName("ht.v")
    public int[] field2635 = new int[16];

    @ObfuscatedName("ht.p")
    public class217[][] field2649 = new class217[16][128];

    @ObfuscatedName("ht.ab")
    public class217[][] field2657 = new class217[16][128];

    @ObfuscatedName("ht.ad")
    public class218 field2650 = new class218();

    @ObfuscatedName("ht.ag")
    public boolean field2652;

    @ObfuscatedName("ht.ak")
    public int field2653;

    @ObfuscatedName("ht.as")
    public int field2654;

    @ObfuscatedName("ht.aq")
    public long field2655;

    @ObfuscatedName("ht.ax")
    public long field2639;

    @ObfuscatedName("ht.at")
    public class220 field2648 = new class220(this);

    public class216() {
        this.method3553();
    }

    @ObfuscatedName("ht.a(II)V")
    public synchronized void method3534(int arg0) {
        this.field2631 = arg0;
    }

    @ObfuscatedName("ht.w(I)I")
    public int method3535() {
        return this.field2631;
    }

    @ObfuscatedName("ht.e(Lhl;Lib;Lde;II)Z")
    public synchronized boolean method3536(class221 arg0, class247 arg1, class112 arg2, int arg3) {
        arg0.method3724();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class211 var7 = (class211) arg0.field2714.method3379(); var7 != null; var7 = (class211) arg0.field2714.method3384()) {
            int var8 = (int) var7.field2589;
            class219 var9 = (class219) this.field2642.method3387((long) var8);
            if (var9 == null) {
                var9 = class219.method4393(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field2642.method3381(var9, (long) var8);
            }
            if (!var9.method3706(arg2, var7.field2605, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3725();
        }
        return var5;
    }

    @ObfuscatedName("ht.k(I)V")
    public synchronized void method3537() {
        for (class219 var1 = (class219) this.field2642.method3379(); var1 != null; var1 = (class219) this.field2642.method3384()) {
            var1.method3709();
        }
    }

    @ObfuscatedName("ht.u(I)V")
    public synchronized void method3538() {
        for (class219 var1 = (class219) this.field2642.method3379(); var1 != null; var1 = (class219) this.field2642.method3384()) {
            var1.method3427();
        }
    }

    @ObfuscatedName("ht.x(Lhl;ZB)V")
    public synchronized void method3539(class221 arg0, boolean arg1) {
        this.method3540();
        this.field2650.method3653(arg0.field2713);
        this.field2652 = arg1;
        this.field2655 = 0L;
        int var3 = this.field2650.method3686();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2650.method3689(var4);
            this.field2650.method3695(var4);
            this.field2650.method3698(var4);
        }
        this.field2653 = this.field2650.method3669();
        this.field2654 = this.field2650.field2686[this.field2653];
        this.field2639 = this.field2650.method3664(this.field2654);
    }

    @ObfuscatedName("ht.n(B)V")
    public synchronized void method3540() {
        this.field2650.method3654();
        this.method3553();
    }

    @ObfuscatedName("ht.y(I)Z")
    public synchronized boolean method3582() {
        return this.field2650.method3655();
    }

    @ObfuscatedName("ht.o(III)V")
    public synchronized void method3542(int arg0, int arg1) {
        this.method3592(arg0, arg1);
    }

    @ObfuscatedName("ht.r(III)V")
    public void method3592(int arg0, int arg1) {
        this.field2651[arg0] = arg1;
        this.field2638[arg0] = arg1 & 0xFFFFFF80;
        this.method3633(arg0, arg1);
    }

    @ObfuscatedName("ht.i(III)V")
    public void method3633(int arg0, int arg1) {
        if (this.field2637[arg0] != arg1) {
            this.field2637[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2657[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("ht.q(IIIB)V")
    public void method3545(int arg0, int arg1, int arg2) {
        this.method3617(arg0, arg1, 64);
        if ((this.field2643[arg0] & 0x2) != 0) {
            for (class217 var4 = (class217) this.field2648.field2709.method3443(); var4 != null; var4 = (class217) this.field2648.field2709.method3445()) {
                if (var4.field2662 == arg0 && var4.field2673 < 0) {
                    this.field2649[arg0][var4.field2664] = null;
                    this.field2649[arg0][arg1] = var4;
                    int var5 = (var4.field2669 * var4.field2665 >> 12) + var4.field2661;
                    var4.field2661 += arg1 - var4.field2664 << 8;
                    var4.field2665 = var5 - var4.field2661;
                    var4.field2669 = 4096;
                    var4.field2664 = arg1;
                    return;
                }
            }
        }
        class219 var6 = (class219) this.field2642.method3387((long) this.field2637[arg0]);
        if (var6 == null) {
            return;
        }
        class107 var7 = var6.field2701[arg1];
        if (var7 == null) {
            return;
        }
        class217 var8 = new class217();
        var8.field2662 = arg0;
        var8.field2660 = var6;
        var8.field2677 = var7;
        var8.field2676 = var6.field2703[arg1];
        var8.field2663 = var6.field2696[arg1];
        var8.field2664 = arg1;
        var8.field2668 = var6.field2702 * arg2 * arg2 * var6.field2699[arg1] + 1024 >> 11;
        var8.field2666 = var6.field2700[arg1] & 0xFF;
        var8.field2661 = (arg1 << 8) - (var6.field2698[arg1] & 0x7FFF);
        var8.field2670 = 0;
        var8.field2674 = 0;
        var8.field2672 = 0;
        var8.field2673 = -1;
        var8.field2667 = 0;
        if (this.field2632[arg0] == 0) {
            var8.field2671 = class117.method1934(var7, this.method3558(var8), this.method3559(var8), this.method3573(var8));
        } else {
            var8.field2671 = class117.method1934(var7, this.method3558(var8), 0, this.method3573(var8));
            this.method3546(var8, var6.field2698[arg1] < 0);
        }
        if (var6.field2698[arg1] < 0) {
            var8.field2671.method1936(-1);
        }
        if (var8.field2663 >= 0) {
            class217 var9 = this.field2657[arg0][var8.field2663];
            if (var9 != null && var9.field2673 < 0) {
                this.field2649[arg0][var9.field2664] = null;
                var9.field2673 = 0;
            }
            this.field2657[arg0][var8.field2663] = var8;
        }
        this.field2648.field2709.method3446(var8);
        this.field2649[arg0][arg1] = var8;
    }

    @ObfuscatedName("ht.b(Lhq;ZI)V")
    public void method3546(class217 arg0, boolean arg1) {
        int var3 = arg0.field2677.field1510.length;
        int var5;
        if (arg1 && arg0.field2677.field1513) {
            int var4 = var3 + var3 - arg0.field2677.field1511;
            var5 = (int) ((long) this.field2632[arg0.field2662] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2671.method2044(true);
            }
        } else {
            var5 = (int) ((long) this.field2632[arg0.field2662] * (long) var3 >> 6);
        }
        arg0.field2671.method2029(var5);
    }

    @ObfuscatedName("ht.h(IIII)V")
    public void method3617(int arg0, int arg1, int arg2) {
        class217 var4 = this.field2649[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2649[arg0][arg1] = null;
        if ((this.field2643[arg0] & 0x2) == 0) {
            var4.field2673 = 0;
            return;
        }
        for (class217 var5 = (class217) this.field2648.field2709.method3442(); var5 != null; var5 = (class217) this.field2648.field2709.method3444()) {
            if (var4.field2662 == var5.field2662 && var5.field2673 < 0 && var4 != var5) {
                var4.field2673 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("ht.d(IIII)V")
    public void method3548(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("ht.v(IIB)V")
    public void method3549(int arg0, int arg1) {
    }

    @ObfuscatedName("ht.p(IIS)V")
    public void method3550(int arg0, int arg1) {
        this.field2636[arg0] = arg1;
    }

    @ObfuscatedName("ht.ab(II)V")
    public void method3551(int arg0) {
        for (class217 var2 = (class217) this.field2648.field2709.method3442(); var2 != null; var2 = (class217) this.field2648.field2709.method3444()) {
            if (arg0 < 0 || var2.field2662 == arg0) {
                if (var2.field2671 != null) {
                    var2.field2671.method1981(Statics.field715 / 100);
                    if (var2.field2671.method1950()) {
                        this.field2648.field2711.method1729(var2.field2671);
                    }
                    var2.method3649();
                }
                if (var2.field2673 < 0) {
                    this.field2649[var2.field2662][var2.field2664] = null;
                }
                var2.method3427();
            }
        }
    }

    @ObfuscatedName("ht.ad(IB)V")
    public void method3565(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3565(var2);
            }
            return;
        }
        this.field2633[arg0] = 12800;
        this.field2634[arg0] = 8192;
        this.field2630[arg0] = 16383;
        this.field2636[arg0] = 8192;
        this.field2640[arg0] = 0;
        this.field2641[arg0] = 8192;
        this.method3637(arg0);
        this.method3555(arg0);
        this.field2643[arg0] = 0;
        this.field2644[arg0] = 32767;
        this.field2645[arg0] = 256;
        this.field2632[arg0] = 0;
        this.method3557(arg0, 8192);
    }

    @ObfuscatedName("ht.ag(II)V")
    public void method3641(int arg0) {
        for (class217 var2 = (class217) this.field2648.field2709.method3442(); var2 != null; var2 = (class217) this.field2648.field2709.method3444()) {
            if ((arg0 < 0 || var2.field2662 == arg0) && var2.field2673 < 0) {
                this.field2649[var2.field2662][var2.field2664] = null;
                var2.field2673 = 0;
            }
        }
    }

    @ObfuscatedName("ht.ak(I)V")
    public void method3553() {
        this.method3551(-1);
        this.method3565(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2637[var1] = this.field2651[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2638[var2] = this.field2651[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("ht.as(IB)V")
    public void method3637(int arg0) {
        if ((this.field2643[arg0] & 0x2) == 0) {
            return;
        }
        for (class217 var2 = (class217) this.field2648.field2709.method3442(); var2 != null; var2 = (class217) this.field2648.field2709.method3444()) {
            if (var2.field2662 == arg0 && this.field2649[arg0][var2.field2664] == null && var2.field2673 < 0) {
                var2.field2673 = 0;
            }
        }
    }

    @ObfuscatedName("ht.ai(II)V")
    public void method3555(int arg0) {
        if ((this.field2643[arg0] & 0x4) == 0) {
            return;
        }
        for (class217 var2 = (class217) this.field2648.field2709.method3442(); var2 != null; var2 = (class217) this.field2648.field2709.method3444()) {
            if (var2.field2662 == arg0) {
                var2.field2679 = 0;
            }
        }
    }

    @ObfuscatedName("ht.af(II)V")
    public void method3556(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3617(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3545(var6, var7, var8);
            } else {
                this.method3617(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3548(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2638[var12] = (var14 << 14) + (this.field2638[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2638[var12] = (var14 << 7) + (this.field2638[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2640[var12] = (var14 << 7) + (this.field2640[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2640[var12] = (this.field2640[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2641[var12] = (var14 << 7) + (this.field2641[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2641[var12] = (this.field2641[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2633[var12] = (var14 << 7) + (this.field2633[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2633[var12] = (this.field2633[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2634[var12] = (var14 << 7) + (this.field2634[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2634[var12] = (this.field2634[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2630[var12] = (var14 << 7) + (this.field2630[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2630[var12] = (this.field2630[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2643[var12] |= 0x1;
                } else {
                    this.field2643[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2643[var12] |= 0x2;
                } else {
                    this.method3637(var12);
                    this.field2643[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2644[var12] = (var14 << 7) + (this.field2644[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2644[var12] = (this.field2644[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2644[var12] = (var14 << 7) + (this.field2644[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2644[var12] = (this.field2644[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3551(var12);
            }
            if (var13 == 121) {
                this.method3565(var12);
            }
            if (var13 == 123) {
                this.method3641(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2644[var12];
                if (var15 == 16384) {
                    this.field2645[var12] = (var14 << 7) + (this.field2645[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2644[var12];
                if (var16 == 16384) {
                    this.field2645[var12] = (this.field2645[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2632[var12] = (var14 << 7) + (this.field2632[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2632[var12] = (this.field2632[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2643[var12] |= 0x4;
                } else {
                    this.method3555(var12);
                    this.field2643[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3557(var12, (var14 << 7) + (this.field2647[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3557(var12, (this.field2647[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3633(var17, this.field2638[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3549(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method3550(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3553();
            }
        }
    }

    @ObfuscatedName("ht.ah(III)V")
    public void method3557(int arg0, int arg1) {
        this.field2647[arg0] = arg1;
        this.field2635[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("ht.av(Lhq;I)I")
    public int method3558(class217 arg0) {
        int var2 = (arg0.field2669 * arg0.field2665 >> 12) + arg0.field2661;
        int var3 = ((this.field2636[arg0.field2662] - 8192) * this.field2645[arg0.field2662] >> 12) + var2;
        class214 var4 = arg0.field2676;
        if (var4.field2617 > 0 && (var4.field2620 > 0 || this.field2640[arg0.field2662] > 0)) {
            int var5 = var4.field2620 << 2;
            int var6 = var4.field2618 << 1;
            if (arg0.field2675 < var6) {
                var5 = arg0.field2675 * var5 / var6;
            }
            int var7 = (this.field2640[arg0.field2662] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2659 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2677.field1512 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field715 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("ht.ae(Lhq;S)I")
    public int method3559(class217 arg0) {
        class214 var2 = arg0.field2676;
        int var3 = this.field2633[arg0.field2662] * this.field2630[arg0.field2662] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2668 * var4 + 16384 >> 15;
        int var6 = this.field2631 * var5 + 128 >> 8;
        if (var2.field2610 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2670 * 1.953125E-5D * (double) var2.field2610) + 0.5D);
        }
        if (var2.field2615 != null) {
            int var7 = arg0.field2674;
            int var8 = var2.field2615[arg0.field2672 + 1];
            if (arg0.field2672 < var2.field2615.length - 2) {
                int var9 = (var2.field2615[arg0.field2672] & 0xFF) << 8;
                int var10 = (var2.field2615[arg0.field2672 + 2] & 0xFF) << 8;
                var8 += (var2.field2615[arg0.field2672 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2673 > 0 && var2.field2611 != null) {
            int var11 = arg0.field2673;
            int var12 = var2.field2611[arg0.field2667 + 1];
            if (arg0.field2667 < var2.field2611.length - 2) {
                int var13 = (var2.field2611[arg0.field2667] & 0xFF) << 8;
                int var14 = (var2.field2611[arg0.field2667 + 2] & 0xFF) << 8;
                var12 += (var2.field2611[arg0.field2667 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("ht.am(Lhq;I)I")
    public int method3573(class217 arg0) {
        int var2 = this.field2634[arg0.field2662];
        return var2 < 8192 ? arg0.field2666 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2666) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("ht.z()Ldy;")
    public synchronized class119 method1730() {
        return this.field2648;
    }

    @ObfuscatedName("ht.t()Ldy;")
    public synchronized class119 method1758() {
        return null;
    }

    @ObfuscatedName("ht.f()I")
    public synchronized int method1732() {
        return 0;
    }

    @ObfuscatedName("ht.g([III)V")
    public synchronized void method1733(int[] arg0, int arg1, int arg2) {
        if (this.field2650.method3655()) {
            int var4 = this.field2656 * this.field2650.field2683 / Statics.field715;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2655;
                if (this.field2639 - var5 >= 0L) {
                    this.field2655 = var5;
                    break;
                }
                int var7 = (int) ((this.field2639 - this.field2655 + (long) var4 - 1L) / (long) var4);
                this.field2655 += (long) var4 * (long) var7;
                this.field2648.method1733(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3562();
            } while (this.field2650.method3655());
        }
        this.field2648.method1733(arg0, arg1, arg2);
    }

    @ObfuscatedName("ht.c(I)V")
    public synchronized void method1735(int arg0) {
        if (this.field2650.method3655()) {
            int var2 = this.field2656 * this.field2650.field2683 / Statics.field715;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2655;
                if (this.field2639 - var3 >= 0L) {
                    this.field2655 = var3;
                    break;
                }
                int var5 = (int) ((this.field2639 - this.field2655 + (long) var2 - 1L) / (long) var2);
                this.field2655 += (long) var2 * (long) var5;
                this.field2648.method1735(var5);
                arg0 -= var5;
                this.method3562();
            } while (this.field2650.method3655());
        }
        this.field2648.method1735(arg0);
    }

    @ObfuscatedName("ht.aj(I)V")
    public void method3562() {
        int var1 = this.field2653;
        int var2 = this.field2654;
        long var3 = this.field2639;
        while (this.field2654 == var2) {
            while (this.field2650.field2686[var1] == var2) {
                this.field2650.method3689(var1);
                int var5 = this.field2650.method3692(var1);
                if (var5 == 1) {
                    this.field2650.method3659();
                    this.field2650.method3698(var1);
                    if (this.field2650.method3663()) {
                        if (!this.field2652 || var2 == 0) {
                            this.method3553();
                            this.field2650.method3654();
                            return;
                        }
                        this.field2650.method3667(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3556(var5);
                }
                this.field2650.method3695(var1);
                this.field2650.method3698(var1);
            }
            var1 = this.field2650.method3669();
            var2 = this.field2650.field2686[var1];
            var3 = this.field2650.method3664(var2);
        }
        this.field2653 = var1;
        this.field2654 = var2;
        this.field2639 = var3;
    }

    @ObfuscatedName("ht.ao(Lhq;I)Z")
    public boolean method3630(class217 arg0) {
        if (arg0.field2671 != null) {
            return false;
        }
        if (arg0.field2673 >= 0) {
            arg0.method3427();
            if (arg0.field2663 > 0 && this.field2657[arg0.field2662][arg0.field2663] == arg0) {
                this.field2657[arg0.field2662][arg0.field2663] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("ht.ar(Lhq;[IIII)Z")
    public boolean method3564(class217 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2678 = Statics.field715 / 100;
        if (arg0.field2673 >= 0 && arg0.field2671 == null || arg0.field2671.method2006()) {
            arg0.method3649();
            arg0.method3427();
            if (arg0.field2663 > 0 && this.field2657[arg0.field2662][arg0.field2663] == arg0) {
                this.field2657[arg0.field2662][arg0.field2663] = null;
            }
            return true;
        }
        int var5 = arg0.field2669;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2641[arg0.field2662] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2669 = var6;
        }
        arg0.field2671.method2018(this.method3558(arg0));
        class214 var7 = arg0.field2676;
        boolean var8 = false;
        arg0.field2675++;
        arg0.field2659 += var7.field2617;
        double var9 = (double) ((arg0.field2664 - 60 << 8) + (arg0.field2669 * arg0.field2665 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2610 > 0) {
            if (var7.field2616 > 0) {
                arg0.field2670 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2616 * var9) + 0.5D);
            } else {
                arg0.field2670 += 128;
            }
        }
        if (var7.field2615 != null) {
            if (var7.field2613 > 0) {
                arg0.field2674 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2613 * var9) + 0.5D);
            } else {
                arg0.field2674 += 128;
            }
            while (arg0.field2672 < var7.field2615.length - 2 && arg0.field2674 > (var7.field2615[arg0.field2672 + 2] & 0xFF) << 8) {
                arg0.field2672 += 2;
            }
            if (arg0.field2672 == var7.field2615.length - 2 && var7.field2615[arg0.field2672 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2673 >= 0 && var7.field2611 != null && (this.field2643[arg0.field2662] & 0x1) == 0 && (arg0.field2663 < 0 || this.field2657[arg0.field2662][arg0.field2663] != arg0)) {
            if (var7.field2614 > 0) {
                arg0.field2673 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2614 * var9) + 0.5D);
            } else {
                arg0.field2673 += 128;
            }
            while (arg0.field2667 < var7.field2611.length - 2 && arg0.field2673 > (var7.field2611[arg0.field2667 + 2] & 0xFF) << 8) {
                arg0.field2667 += 2;
            }
            if (arg0.field2667 == var7.field2611.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2671.method1946(arg0.field2678, this.method3559(arg0), this.method3573(arg0));
            return false;
        }
        arg0.field2671.method1981(arg0.field2678);
        if (arg1 == null) {
            arg0.field2671.method1735(arg3);
        } else {
            arg0.field2671.method1733(arg1, arg2, arg3);
        }
        if (arg0.field2671.method1950()) {
            this.field2648.field2711.method1729(arg0.field2671);
        }
        arg0.method3649();
        if (arg0.field2673 >= 0) {
            arg0.method3427();
            if (arg0.field2663 > 0 && this.field2657[arg0.field2662][arg0.field2663] == arg0) {
                this.field2657[arg0.field2662][arg0.field2663] = null;
            }
        }
        return true;
    }
}
