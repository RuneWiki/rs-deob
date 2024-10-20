package deob;

@ObfuscatedName("hw")
public class class231 extends class118 {

    @ObfuscatedName("hw.o")
    public class215 field2721 = new class215(128);

    @ObfuscatedName("hw.k")
    public int field2696 = 256;

    @ObfuscatedName("hw.t")
    public int field2697 = 1000000;

    @ObfuscatedName("hw.d")
    public int[] field2698 = new int[16];

    @ObfuscatedName("hw.h")
    public int[] field2699 = new int[16];

    @ObfuscatedName("hw.m")
    public int[] field2700 = new int[16];

    @ObfuscatedName("hw.z")
    public int[] field2701 = new int[16];

    @ObfuscatedName("hw.i")
    public int[] field2702 = new int[16];

    @ObfuscatedName("hw.u")
    public int[] field2695 = new int[16];

    @ObfuscatedName("hw.x")
    public int[] field2704 = new int[16];

    @ObfuscatedName("hw.y")
    public int[] field2705 = new int[16];

    @ObfuscatedName("hw.a")
    public int[] field2703 = new int[16];

    @ObfuscatedName("hw.j")
    public int[] field2717 = new int[16];

    @ObfuscatedName("hw.b")
    public int[] field2709 = new int[16];

    @ObfuscatedName("hw.g")
    public int[] field2718 = new int[16];

    @ObfuscatedName("hw.f")
    public int[] field2710 = new int[16];

    @ObfuscatedName("hw.p")
    public int[] field2719 = new int[16];

    @ObfuscatedName("hw.e")
    public int[] field2712 = new int[16];

    @ObfuscatedName("hw.c")
    public class232[][] field2713 = new class232[16][128];

    @ObfuscatedName("hw.ab")
    public class232[][] field2714 = new class232[16][128];

    @ObfuscatedName("hw.ap")
    public class233 field2707 = new class233();

    @ObfuscatedName("hw.ag")
    public boolean field2716;

    @ObfuscatedName("hw.at")
    public int field2706;

    @ObfuscatedName("hw.ac")
    public int field2708;

    @ObfuscatedName("hw.al")
    public long field2711;

    @ObfuscatedName("hw.ah")
    public long field2720;

    @ObfuscatedName("hw.af")
    public class235 field2715 = new class235(this);

    public class231() {
        this.method3804();
    }

    @ObfuscatedName("hw.o(IB)V")
    public synchronized void method3800(int arg0) {
        this.field2696 = arg0;
    }

    @ObfuscatedName("hw.k(B)I")
    public int method3904() {
        return this.field2696;
    }

    @ObfuscatedName("hw.t(Lie;Ljf;Lde;II)Z")
    public synchronized boolean method3802(class236 arg0, class262 arg1, class111 arg2, int arg3) {
        arg0.method3976();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class226 var7 = (class226) arg0.field2771.method3641(); var7 != null; var7 = (class226) arg0.field2771.method3640()) {
            int var8 = (int) var7.field2652;
            class234 var9 = (class234) this.field2721.method3637((long) var8);
            if (var9 == null) {
                var9 = class234.method498(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field2721.method3638(var9, (long) var8);
            }
            if (!var9.method3960(arg2, var7.field2671, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method3977();
        }
        return var5;
    }

    @ObfuscatedName("hw.d(I)V")
    public synchronized void method3803() {
        for (class234 var1 = (class234) this.field2721.method3641(); var1 != null; var1 = (class234) this.field2721.method3640()) {
            var1.method3961();
        }
    }

    @ObfuscatedName("hw.h(I)V")
    public synchronized void method3807() {
        for (class234 var1 = (class234) this.field2721.method3641(); var1 != null; var1 = (class234) this.field2721.method3640()) {
            var1.method3681();
        }
    }

    @ObfuscatedName("hw.x(Lie;ZB)V")
    public synchronized void method3805(class236 arg0, boolean arg1) {
        this.method3806();
        this.field2707.method3951(arg0.field2770);
        this.field2716 = arg1;
        this.field2711 = 0L;
        int var3 = this.field2707.method3923();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2707.method3924(var4);
            this.field2707.method3927(var4);
            this.field2707.method3925(var4);
        }
        this.field2706 = this.field2707.method3932();
        this.field2708 = this.field2707.field2754[this.field2706];
        this.field2720 = this.field2707.method3949(this.field2708);
    }

    @ObfuscatedName("hw.a(B)V")
    public synchronized void method3806() {
        this.field2707.method3921();
        this.method3804();
    }

    @ObfuscatedName("hw.v(I)Z")
    public synchronized boolean method3816() {
        return this.field2707.method3922();
    }

    @ObfuscatedName("hw.q(III)V")
    public synchronized void method3846(int arg0, int arg1) {
        this.method3895(arg0, arg1);
    }

    @ObfuscatedName("hw.r(III)V")
    public void method3895(int arg0, int arg1) {
        this.field2701[arg0] = arg1;
        this.field2695[arg0] = arg1 & 0xFFFFFF80;
        this.method3809(arg0, arg1);
    }

    @ObfuscatedName("hw.j(III)V")
    public void method3809(int arg0, int arg1) {
        if (this.field2702[arg0] != arg1) {
            this.field2702[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2714[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("hw.b(IIIB)V")
    public void method3810(int arg0, int arg1, int arg2) {
        this.method3818(arg0, arg1, 64);
        if ((this.field2717[arg0] & 0x2) != 0) {
            for (class232 var4 = (class232) this.field2715.field2766.method3708(); var4 != null; var4 = (class232) this.field2715.field2766.method3698()) {
                if (var4.field2735 == arg0 && var4.field2741 < 0) {
                    this.field2713[arg0][var4.field2727] = null;
                    this.field2713[arg0][arg1] = var4;
                    int var5 = (var4.field2731 * var4.field2722 >> 12) + var4.field2734;
                    var4.field2734 += arg1 - var4.field2727 << 8;
                    var4.field2731 = var5 - var4.field2734;
                    var4.field2722 = 4096;
                    var4.field2727 = arg1;
                    return;
                }
            }
        }
        class234 var6 = (class234) this.field2721.method3637((long) this.field2702[arg0]);
        if (var6 == null) {
            return;
        }
        class106 var7 = var6.field2758[arg1];
        if (var7 == null) {
            return;
        }
        class232 var8 = new class232();
        var8.field2735 = arg0;
        var8.field2723 = var6;
        var8.field2730 = var7;
        var8.field2725 = var6.field2764[arg1];
        var8.field2726 = var6.field2762[arg1];
        var8.field2727 = arg1;
        var8.field2728 = var6.field2763 * arg2 * arg2 * var6.field2757[arg1] + 1024 >> 11;
        var8.field2729 = var6.field2761[arg1] & 0xFF;
        var8.field2734 = (arg1 << 8) - (var6.field2760[arg1] & 0x7FFF);
        var8.field2733 = 0;
        var8.field2732 = 0;
        var8.field2736 = 0;
        var8.field2741 = -1;
        var8.field2737 = 0;
        if (this.field2710[arg0] == 0) {
            var8.field2740 = class116.method2123(var7, this.method3823(var8), this.method3824(var8), this.method3880(var8));
        } else {
            var8.field2740 = class116.method2123(var7, this.method3823(var8), 0, this.method3880(var8));
            this.method3811(var8, var6.field2760[arg1] < 0);
        }
        if (var6.field2760[arg1] < 0) {
            var8.field2740.method2125(-1);
        }
        if (var8.field2726 >= 0) {
            class232 var9 = this.field2714[arg0][var8.field2726];
            if (var9 != null && var9.field2741 < 0) {
                this.field2713[arg0][var9.field2727] = null;
                var9.field2741 = 0;
            }
            this.field2714[arg0][var8.field2726] = var8;
        }
        this.field2715.field2766.method3690(var8);
        this.field2713[arg0][arg1] = var8;
    }

    @ObfuscatedName("hw.g(Lhn;ZI)V")
    public void method3811(class232 arg0, boolean arg1) {
        int var3 = arg0.field2730.field1546.length;
        int var5;
        if (arg1 && arg0.field2730.field1549) {
            int var4 = var3 + var3 - arg0.field2730.field1548;
            var5 = (int) ((long) this.field2710[arg0.field2735] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2740.method2132(true);
            }
        } else {
            var5 = (int) ((long) this.field2710[arg0.field2735] * (long) var3 >> 6);
        }
        arg0.field2740.method2120(var5);
    }

    @ObfuscatedName("hw.f(IIIB)V")
    public void method3818(int arg0, int arg1, int arg2) {
        class232 var4 = this.field2713[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2713[arg0][arg1] = null;
        if ((this.field2717[arg0] & 0x2) == 0) {
            var4.field2741 = 0;
            return;
        }
        for (class232 var5 = (class232) this.field2715.field2766.method3707(); var5 != null; var5 = (class232) this.field2715.field2766.method3697()) {
            if (var4.field2735 == var5.field2735 && var5.field2741 < 0 && var4 != var5) {
                var4.field2741 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("hw.p(IIIB)V")
    public void method3813(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("hw.e(III)V")
    public void method3892(int arg0, int arg1) {
    }

    @ObfuscatedName("hw.c(III)V")
    public void method3815(int arg0, int arg1) {
        this.field2704[arg0] = arg1;
    }

    @ObfuscatedName("hw.ag(IB)V")
    public void method3842(int arg0) {
        for (class232 var2 = (class232) this.field2715.field2766.method3707(); var2 != null; var2 = (class232) this.field2715.field2766.method3697()) {
            if (arg0 < 0 || var2.field2735 == arg0) {
                if (var2.field2740 != null) {
                    var2.field2740.method2165(Statics.field1582 / 100);
                    if (var2.field2740.method2140()) {
                        this.field2715.field2767.method1889(var2.field2740);
                    }
                    var2.method3915();
                }
                if (var2.field2741 < 0) {
                    this.field2713[var2.field2735][var2.field2727] = null;
                }
                var2.method3681();
            }
        }
    }

    @ObfuscatedName("hw.at(II)V")
    public void method3889(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3889(var2);
            }
            return;
        }
        this.field2698[arg0] = 12800;
        this.field2699[arg0] = 8192;
        this.field2700[arg0] = 16383;
        this.field2704[arg0] = 8192;
        this.field2705[arg0] = 0;
        this.field2703[arg0] = 8192;
        this.method3819(arg0);
        this.method3820(arg0);
        this.field2717[arg0] = 0;
        this.field2709[arg0] = 32767;
        this.field2718[arg0] = 256;
        this.field2710[arg0] = 0;
        this.method3827(arg0, 8192);
    }

    @ObfuscatedName("hw.av(IB)V")
    public void method3817(int arg0) {
        for (class232 var2 = (class232) this.field2715.field2766.method3707(); var2 != null; var2 = (class232) this.field2715.field2766.method3697()) {
            if ((arg0 < 0 || var2.field2735 == arg0) && var2.field2741 < 0) {
                this.field2713[var2.field2735][var2.field2727] = null;
                var2.field2741 = 0;
            }
        }
    }

    @ObfuscatedName("hw.am(I)V")
    public void method3804() {
        this.method3842(-1);
        this.method3889(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2702[var1] = this.field2701[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2695[var2] = this.field2701[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("hw.ao(IS)V")
    public void method3819(int arg0) {
        if ((this.field2717[arg0] & 0x2) == 0) {
            return;
        }
        for (class232 var2 = (class232) this.field2715.field2766.method3707(); var2 != null; var2 = (class232) this.field2715.field2766.method3697()) {
            if (var2.field2735 == arg0 && this.field2713[arg0][var2.field2727] == null && var2.field2741 < 0) {
                var2.field2741 = 0;
            }
        }
    }

    @ObfuscatedName("hw.ax(II)V")
    public void method3820(int arg0) {
        if ((this.field2717[arg0] & 0x4) == 0) {
            return;
        }
        for (class232 var2 = (class232) this.field2715.field2766.method3707(); var2 != null; var2 = (class232) this.field2715.field2766.method3697()) {
            if (var2.field2735 == arg0) {
                var2.field2742 = 0;
            }
        }
    }

    @ObfuscatedName("hw.au(II)V")
    public void method3836(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3818(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3810(var6, var7, var8);
            } else {
                this.method3818(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3813(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2695[var12] = (var14 << 14) + (this.field2695[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2695[var12] = (var14 << 7) + (this.field2695[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2705[var12] = (var14 << 7) + (this.field2705[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2705[var12] = (this.field2705[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2703[var12] = (var14 << 7) + (this.field2703[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2703[var12] = (this.field2703[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2698[var12] = (var14 << 7) + (this.field2698[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2698[var12] = (this.field2698[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2699[var12] = (var14 << 7) + (this.field2699[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2699[var12] = (this.field2699[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2700[var12] = (var14 << 7) + (this.field2700[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2700[var12] = (this.field2700[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2717[var12] |= 0x1;
                } else {
                    this.field2717[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2717[var12] |= 0x2;
                } else {
                    this.method3819(var12);
                    this.field2717[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2709[var12] = (var14 << 7) + (this.field2709[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2709[var12] = (this.field2709[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2709[var12] = (var14 << 7) + (this.field2709[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2709[var12] = (this.field2709[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3842(var12);
            }
            if (var13 == 121) {
                this.method3889(var12);
            }
            if (var13 == 123) {
                this.method3817(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2709[var12];
                if (var15 == 16384) {
                    this.field2718[var12] = (var14 << 7) + (this.field2718[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2709[var12];
                if (var16 == 16384) {
                    this.field2718[var12] = (this.field2718[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2710[var12] = (var14 << 7) + (this.field2710[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2710[var12] = (this.field2710[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2717[var12] |= 0x4;
                } else {
                    this.method3820(var12);
                    this.field2717[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3827(var12, (var14 << 7) + (this.field2719[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3827(var12, (this.field2719[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3809(var17, this.field2695[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3892(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method3815(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3804();
            }
        }
    }

    @ObfuscatedName("hw.ar(III)V")
    public void method3827(int arg0, int arg1) {
        this.field2719[arg0] = arg1;
        this.field2712[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("hw.an(Lhn;B)I")
    public int method3823(class232 arg0) {
        int var2 = (arg0.field2731 * arg0.field2722 >> 12) + arg0.field2734;
        int var3 = ((this.field2704[arg0.field2735] - 8192) * this.field2718[arg0.field2735] >> 12) + var2;
        class229 var4 = arg0.field2725;
        if (var4.field2684 > 0 && (var4.field2683 > 0 || this.field2705[arg0.field2735] > 0)) {
            int var5 = var4.field2683 << 2;
            int var6 = var4.field2679 << 1;
            if (arg0.field2738 < var6) {
                var5 = arg0.field2738 * var5 / var6;
            }
            int var7 = (this.field2705[arg0.field2735] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2739 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2730.field1547 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1582 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("hw.aw(Lhn;I)I")
    public int method3824(class232 arg0) {
        class229 var2 = arg0.field2725;
        int var3 = this.field2700[arg0.field2735] * this.field2698[arg0.field2735] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2728 * var4 + 16384 >> 15;
        int var6 = this.field2696 * var5 + 128 >> 8;
        if (var2.field2677 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2733 * 1.953125E-5D * (double) var2.field2677) + 0.5D);
        }
        if (var2.field2681 != null) {
            int var7 = arg0.field2732;
            int var8 = var2.field2681[arg0.field2736 + 1];
            if (arg0.field2736 < var2.field2681.length - 2) {
                int var9 = (var2.field2681[arg0.field2736] & 0xFF) << 8;
                int var10 = (var2.field2681[arg0.field2736 + 2] & 0xFF) << 8;
                var8 += (var2.field2681[arg0.field2736 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2741 > 0 && var2.field2685 != null) {
            int var11 = arg0.field2741;
            int var12 = var2.field2685[arg0.field2737 + 1];
            if (arg0.field2737 < var2.field2685.length - 2) {
                int var13 = (var2.field2685[arg0.field2737] & 0xFF) << 8;
                int var14 = (var2.field2685[arg0.field2737 + 2] & 0xFF) << 8;
                var12 += (var2.field2685[arg0.field2737 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("hw.ak(Lhn;B)I")
    public int method3880(class232 arg0) {
        int var2 = this.field2699[arg0.field2735];
        return var2 < 8192 ? arg0.field2729 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2729) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("hw.m()Ldd;")
    public synchronized class118 method1894() {
        return this.field2715;
    }

    @ObfuscatedName("hw.z()Ldd;")
    public synchronized class118 method1913() {
        return null;
    }

    @ObfuscatedName("hw.i()I")
    public synchronized int method1927() {
        return 0;
    }

    @ObfuscatedName("hw.u([III)V")
    public synchronized void method1897(int[] arg0, int arg1, int arg2) {
        if (this.field2707.method3922()) {
            int var4 = this.field2697 * this.field2707.field2744 / Statics.field1582;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2711;
                if (this.field2720 - var5 >= 0L) {
                    this.field2711 = var5;
                    break;
                }
                int var7 = (int) ((this.field2720 - this.field2711 + (long) var4 - 1L) / (long) var4);
                this.field2711 += (long) var4 * (long) var7;
                this.field2715.method1897(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3884();
            } while (this.field2707.method3922());
        }
        this.field2715.method1897(arg0, arg1, arg2);
    }

    @ObfuscatedName("hw.y(I)V")
    public synchronized void method1899(int arg0) {
        if (this.field2707.method3922()) {
            int var2 = this.field2697 * this.field2707.field2744 / Statics.field1582;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2711;
                if (this.field2720 - var3 >= 0L) {
                    this.field2711 = var3;
                    break;
                }
                int var5 = (int) ((this.field2720 - this.field2711 + (long) var2 - 1L) / (long) var2);
                this.field2711 += (long) var2 * (long) var5;
                this.field2715.method1899(var5);
                arg0 -= var5;
                this.method3884();
            } while (this.field2707.method3922());
        }
        this.field2715.method1899(arg0);
    }

    @ObfuscatedName("hw.as(I)V")
    public void method3884() {
        int var1 = this.field2706;
        int var2 = this.field2708;
        long var3 = this.field2720;
        while (this.field2708 == var2) {
            while (this.field2707.field2754[var1] == var2) {
                this.field2707.method3924(var1);
                int var5 = this.field2707.method3928(var1);
                if (var5 == 1) {
                    this.field2707.method3926();
                    this.field2707.method3925(var1);
                    if (this.field2707.method3933()) {
                        if (!this.field2716 || var2 == 0) {
                            this.method3804();
                            this.field2707.method3921();
                            return;
                        }
                        this.field2707.method3938(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3836(var5);
                }
                this.field2707.method3927(var1);
                this.field2707.method3925(var1);
            }
            var1 = this.field2707.method3932();
            var2 = this.field2707.field2754[var1];
            var3 = this.field2707.method3949(var2);
        }
        this.field2706 = var1;
        this.field2708 = var2;
        this.field2720 = var3;
    }

    @ObfuscatedName("hw.aj(Lhn;I)Z")
    public boolean method3829(class232 arg0) {
        if (arg0.field2740 != null) {
            return false;
        }
        if (arg0.field2741 >= 0) {
            arg0.method3681();
            if (arg0.field2726 > 0 && this.field2714[arg0.field2735][arg0.field2726] == arg0) {
                this.field2714[arg0.field2735][arg0.field2726] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("hw.ay(Lhn;[IIIB)Z")
    public boolean method3812(class232 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2724 = Statics.field1582 / 100;
        if (arg0.field2741 >= 0 && arg0.field2740 == null || arg0.field2740.method2194()) {
            arg0.method3915();
            arg0.method3681();
            if (arg0.field2726 > 0 && this.field2714[arg0.field2735][arg0.field2726] == arg0) {
                this.field2714[arg0.field2735][arg0.field2726] = null;
            }
            return true;
        }
        int var5 = arg0.field2722;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2703[arg0.field2735] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2722 = var6;
        }
        arg0.field2740.method2137(this.method3823(arg0));
        class229 var7 = arg0.field2725;
        boolean var8 = false;
        arg0.field2738++;
        arg0.field2739 += var7.field2684;
        double var9 = (double) ((arg0.field2727 - 60 << 8) + (arg0.field2731 * arg0.field2722 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2677 > 0) {
            if (var7.field2682 > 0) {
                arg0.field2733 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2682 * var9) + 0.5D);
            } else {
                arg0.field2733 += 128;
            }
        }
        if (var7.field2681 != null) {
            if (var7.field2680 > 0) {
                arg0.field2732 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2680 * var9) + 0.5D);
            } else {
                arg0.field2732 += 128;
            }
            while (arg0.field2736 < var7.field2681.length - 2 && arg0.field2732 > (var7.field2681[arg0.field2736 + 2] & 0xFF) << 8) {
                arg0.field2736 += 2;
            }
            if (arg0.field2736 == var7.field2681.length - 2 && var7.field2681[arg0.field2736 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2741 >= 0 && var7.field2685 != null && (this.field2717[arg0.field2735] & 0x1) == 0 && (arg0.field2726 < 0 || this.field2714[arg0.field2735][arg0.field2726] != arg0)) {
            if (var7.field2678 > 0) {
                arg0.field2741 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2678 * var9) + 0.5D);
            } else {
                arg0.field2741 += 128;
            }
            while (arg0.field2737 < var7.field2685.length - 2 && arg0.field2741 > (var7.field2685[arg0.field2737 + 2] & 0xFF) << 8) {
                arg0.field2737 += 2;
            }
            if (arg0.field2737 == var7.field2685.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2740.method2135(arg0.field2724, this.method3824(arg0), this.method3880(arg0));
            return false;
        }
        arg0.field2740.method2165(arg0.field2724);
        if (arg1 == null) {
            arg0.field2740.method1899(arg3);
        } else {
            arg0.field2740.method1897(arg1, arg2, arg3);
        }
        if (arg0.field2740.method2140()) {
            this.field2715.field2767.method1889(arg0.field2740);
        }
        arg0.method3915();
        if (arg0.field2741 >= 0) {
            arg0.method3681();
            if (arg0.field2726 > 0 && this.field2714[arg0.field2735][arg0.field2726] == arg0) {
                this.field2714[arg0.field2735][arg0.field2726] = null;
            }
        }
        return true;
    }
}
