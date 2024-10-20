package deob;

@ObfuscatedName("fv")
public class class158 extends class57 {

    @ObfuscatedName("fv.z")
    public class169 field2687 = new class169(128);

    @ObfuscatedName("fv.n")
    public int field2692 = 256;

    @ObfuscatedName("fv.u")
    public int field2689 = 1000000;

    @ObfuscatedName("fv.t")
    public int[] field2688 = new int[16];

    @ObfuscatedName("fv.e")
    public int[] field2710 = new int[16];

    @ObfuscatedName("fv.a")
    public int[] field2685 = new int[16];

    @ObfuscatedName("fv.l")
    public int[] field2690 = new int[16];

    @ObfuscatedName("fv.v")
    public int[] field2703 = new int[16];

    @ObfuscatedName("fv.j")
    public int[] field2693 = new int[16];

    @ObfuscatedName("fv.k")
    public int[] field2694 = new int[16];

    @ObfuscatedName("fv.g")
    public int[] field2686 = new int[16];

    @ObfuscatedName("fv.d")
    public int[] field2696 = new int[16];

    @ObfuscatedName("fv.c")
    public int[] field2699 = new int[16];

    @ObfuscatedName("fv.h")
    public int[] field2700 = new int[16];

    @ObfuscatedName("fv.y")
    public int[] field2701 = new int[16];

    @ObfuscatedName("fv.r")
    public int[] field2691 = new int[16];

    @ObfuscatedName("fv.w")
    public int[] field2708 = new int[16];

    @ObfuscatedName("fv.p")
    public int[] field2704 = new int[16];

    @ObfuscatedName("fv.s")
    public class161[][] field2707 = new class161[16][128];

    @ObfuscatedName("fv.ag")
    public class161[][] field2706 = new class161[16][128];

    @ObfuscatedName("fv.ad")
    public class156 field2714 = new class156();

    @ObfuscatedName("fv.ak")
    public boolean field2702;

    @ObfuscatedName("fv.ai")
    public int field2709;

    @ObfuscatedName("fv.ac")
    public int field2705;

    @ObfuscatedName("fv.as")
    public long field2711;

    @ObfuscatedName("fv.ar")
    public long field2712;

    @ObfuscatedName("fv.an")
    public class160 field2713 = new class160(this);

    public class158() {
        this.method3079();
    }

    @ObfuscatedName("fv.z(II)V")
    public synchronized void method3062(int arg0) {
        this.field2692 = arg0;
    }

    @ObfuscatedName("fv.n(I)I")
    public int method3093() {
        return this.field2692;
    }

    @ObfuscatedName("fv.u(Leu;Lel;Lay;II)Z")
    public synchronized boolean method3130(class154 arg0, class142 arg1, class50 arg2, int arg3) {
        arg0.method2977();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class170 var7 = (class170) arg0.field2650.method3211(); var7 != null; var7 = (class170) arg0.field2650.method3212()) {
            int var8 = (int) var7.field2817;
            class155 var9 = (class155) this.field2687.method3208((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method2815(var8);
                class155 var11;
                if (var10 == null) {
                    var11 = null;
                } else {
                    var11 = new class155(var10);
                }
                var9 = var11;
                if (var11 == null) {
                    var5 = false;
                    continue;
                }
                this.field2687.method3210(var11, (long) var8);
            }
            if (!var9.method2986(arg2, var7.field2808, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method2978();
        }
        return var5;
    }

    @ObfuscatedName("fv.t(B)V")
    public synchronized void method3064() {
        for (class155 var1 = (class155) this.field2687.method3211(); var1 != null; var1 = (class155) this.field2687.method3212()) {
            var1.method2988();
        }
    }

    @ObfuscatedName("fv.e(B)V")
    public synchronized void method3095() {
        for (class155 var1 = (class155) this.field2687.method3211(); var1 != null; var1 = (class155) this.field2687.method3212()) {
            var1.method3288();
        }
    }

    @ObfuscatedName("fv.k(Leu;ZB)V")
    public synchronized void method3066(class154 arg0, boolean arg1) {
        this.method3067();
        this.field2714.method3035(arg0.field2651);
        this.field2702 = arg1;
        this.field2711 = 0L;
        int var3 = this.field2714.method3027();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2714.method2996(var4);
            this.field2714.method3001(var4);
            this.field2714.method2999(var4);
        }
        this.field2709 = this.field2714.method3019();
        this.field2705 = this.field2714.field2670[this.field2709];
        this.field2712 = this.field2714.method3005(this.field2705);
    }

    @ObfuscatedName("fv.d(B)V")
    public synchronized void method3067() {
        this.field2714.method3004();
        this.method3079();
    }

    @ObfuscatedName("fv.b(I)Z")
    public synchronized boolean method3125() {
        return this.field2714.method2997();
    }

    @ObfuscatedName("fv.i(IIB)V")
    public synchronized void method3132(int arg0, int arg1) {
        this.method3070(arg0, arg1);
    }

    @ObfuscatedName("fv.o(III)V")
    public void method3070(int arg0, int arg1) {
        this.field2690[arg0] = arg1;
        this.field2693[arg0] = arg1 & 0xFFFFFF80;
        this.method3117(arg0, arg1);
    }

    @ObfuscatedName("fv.x(III)V")
    public void method3117(int arg0, int arg1) {
        if (this.field2703[arg0] != arg1) {
            this.field2703[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2706[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("fv.m(IIIB)V")
    public void method3071(int arg0, int arg1, int arg2) {
        this.method3094(arg0, arg1, 64);
        if ((this.field2699[arg0] & 0x2) != 0) {
            for (class161 var4 = (class161) this.field2713.field2731.method3227(); var4 != null; var4 = (class161) this.field2713.field2731.method3229()) {
                if (var4.field2754 == arg0 && var4.field2747 < 0) {
                    this.field2707[arg0][var4.field2738] = null;
                    this.field2707[arg0][arg1] = var4;
                    int var5 = (var4.field2746 * var4.field2742 >> 12) + var4.field2741;
                    var4.field2741 += arg1 - var4.field2738 << 8;
                    var4.field2742 = var5 - var4.field2741;
                    var4.field2746 = 4096;
                    var4.field2738 = arg1;
                    return;
                }
            }
        }
        class155 var6 = (class155) this.field2687.method3208((long) this.field2703[arg0]);
        if (var6 == null) {
            return;
        }
        class53 var7 = var6.field2657[arg1];
        if (var7 == null) {
            return;
        }
        class161 var8 = new class161();
        var8.field2754 = arg0;
        var8.field2748 = var6;
        var8.field2735 = var7;
        var8.field2744 = var6.field2660[arg1];
        var8.field2737 = var6.field2654[arg1];
        var8.field2738 = arg1;
        var8.field2739 = var6.field2661 * arg2 * arg2 * var6.field2655[arg1] + 1024 >> 11;
        var8.field2740 = var6.field2656[arg1] & 0xFF;
        var8.field2741 = (arg1 << 8) - (var6.field2653[arg1] & 0x7FFF);
        var8.field2734 = 0;
        var8.field2736 = 0;
        var8.field2750 = 0;
        var8.field2747 = -1;
        var8.field2745 = 0;
        if (this.field2691[arg0] == 0) {
            var8.field2751 = class55.method1100(var7, this.method3083(var8), this.method3084(var8), this.method3085(var8));
        } else {
            var8.field2751 = class55.method1100(var7, this.method3083(var8), 0, this.method3085(var8));
            this.method3072(var8, var6.field2653[arg1] < 0);
        }
        if (var6.field2653[arg1] < 0) {
            var8.field2751.method1135(-1);
        }
        if (var8.field2737 >= 0) {
            class161 var9 = this.field2706[arg0][var8.field2737];
            if (var9 != null && var9.field2747 < 0) {
                this.field2707[arg0][var9.field2738] = null;
                var9.field2747 = 0;
            }
            this.field2706[arg0][var8.field2737] = var8;
        }
        this.field2713.field2731.method3221(var8);
        this.field2707[arg0][arg1] = var8;
    }

    @ObfuscatedName("fv.f(Lfg;ZI)V")
    public void method3072(class161 arg0, boolean arg1) {
        int var3 = arg0.field2735.field1101.length;
        int var5;
        if (arg1 && arg0.field2735.field1102) {
            int var4 = var3 + var3 - arg0.field2735.field1105;
            var5 = (int) ((long) this.field2691[arg0.field2754] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2751.method1226(true);
            }
        } else {
            var5 = (int) ((long) this.field2691[arg0.field2754] * (long) var3 >> 6);
        }
        arg0.field2751.method1108(var5);
    }

    @ObfuscatedName("fv.q(IIII)V")
    public void method3094(int arg0, int arg1, int arg2) {
        class161 var4 = this.field2707[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2707[arg0][arg1] = null;
        if ((this.field2699[arg0] & 0x2) == 0) {
            var4.field2747 = 0;
            return;
        }
        for (class161 var5 = (class161) this.field2713.field2731.method3236(); var5 != null; var5 = (class161) this.field2713.field2731.method3228()) {
            if (var4.field2754 == var5.field2754 && var5.field2747 < 0 && var4 != var5) {
                var4.field2747 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("fv.c(IIII)V")
    public void method3073(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("fv.h(III)V")
    public void method3112(int arg0, int arg1) {
    }

    @ObfuscatedName("fv.y(III)V")
    public void method3075(int arg0, int arg1) {
        this.field2694[arg0] = arg1;
    }

    @ObfuscatedName("fv.r(II)V")
    public void method3061(int arg0) {
        for (class161 var2 = (class161) this.field2713.field2731.method3236(); var2 != null; var2 = (class161) this.field2713.field2731.method3228()) {
            if (arg0 < 0 || var2.field2754 == arg0) {
                if (var2.field2751 != null) {
                    var2.field2751.method1112(Statics.field2844 / 100);
                    if (var2.field2751.method1178()) {
                        this.field2713.field2730.method967(var2.field2751);
                    }
                    var2.method3171();
                }
                if (var2.field2747 < 0) {
                    this.field2707[var2.field2754][var2.field2738] = null;
                }
                var2.method3288();
            }
        }
    }

    @ObfuscatedName("fv.ar(II)V")
    public void method3077(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3077(var2);
            }
            return;
        }
        this.field2688[arg0] = 12800;
        this.field2710[arg0] = 8192;
        this.field2685[arg0] = 16383;
        this.field2694[arg0] = 8192;
        this.field2686[arg0] = 0;
        this.field2696[arg0] = 8192;
        this.method3144(arg0);
        this.method3091(arg0);
        this.field2699[arg0] = 0;
        this.field2700[arg0] = 32767;
        this.field2701[arg0] = 256;
        this.field2691[arg0] = 0;
        this.method3082(arg0, 8192);
    }

    @ObfuscatedName("fv.an(IB)V")
    public void method3141(int arg0) {
        for (class161 var2 = (class161) this.field2713.field2731.method3236(); var2 != null; var2 = (class161) this.field2713.field2731.method3228()) {
            if ((arg0 < 0 || var2.field2754 == arg0) && var2.field2747 < 0) {
                this.field2707[var2.field2754][var2.field2738] = null;
                var2.field2747 = 0;
            }
        }
    }

    @ObfuscatedName("fv.ax(I)V")
    public void method3079() {
        this.method3061(-1);
        this.method3077(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2703[var1] = this.field2690[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2693[var2] = this.field2690[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("fv.ao(II)V")
    public void method3144(int arg0) {
        if ((this.field2699[arg0] & 0x2) == 0) {
            return;
        }
        for (class161 var2 = (class161) this.field2713.field2731.method3236(); var2 != null; var2 = (class161) this.field2713.field2731.method3228()) {
            if (var2.field2754 == arg0 && this.field2707[arg0][var2.field2738] == null && var2.field2747 < 0) {
                var2.field2747 = 0;
            }
        }
    }

    @ObfuscatedName("fv.aj(II)V")
    public void method3091(int arg0) {
        if ((this.field2699[arg0] & 0x4) == 0) {
            return;
        }
        for (class161 var2 = (class161) this.field2713.field2731.method3236(); var2 != null; var2 = (class161) this.field2713.field2731.method3228()) {
            if (var2.field2754 == arg0) {
                var2.field2753 = 0;
            }
        }
    }

    @ObfuscatedName("fv.ap(II)V")
    public void method3081(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3094(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3071(var6, var7, var8);
            } else {
                this.method3094(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3073(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2693[var12] = (var14 << 14) + (this.field2693[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2693[var12] = (var14 << 7) + (this.field2693[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2686[var12] = (var14 << 7) + (this.field2686[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2686[var12] = (this.field2686[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2696[var12] = (var14 << 7) + (this.field2696[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2696[var12] = (this.field2696[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2688[var12] = (var14 << 7) + (this.field2688[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2688[var12] = (this.field2688[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2710[var12] = (var14 << 7) + (this.field2710[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2710[var12] = (this.field2710[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2685[var12] = (var14 << 7) + (this.field2685[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2685[var12] = (this.field2685[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2699[var12] |= 0x1;
                } else {
                    this.field2699[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2699[var12] |= 0x2;
                } else {
                    this.method3144(var12);
                    this.field2699[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2700[var12] = (var14 << 7) + (this.field2700[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2700[var12] = (this.field2700[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2700[var12] = (var14 << 7) + (this.field2700[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2700[var12] = (this.field2700[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3061(var12);
            }
            if (var13 == 121) {
                this.method3077(var12);
            }
            if (var13 == 123) {
                this.method3141(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2700[var12];
                if (var15 == 16384) {
                    this.field2701[var12] = (var14 << 7) + (this.field2701[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2700[var12];
                if (var16 == 16384) {
                    this.field2701[var12] = (this.field2701[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2691[var12] = (var14 << 7) + (this.field2691[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2691[var12] = (this.field2691[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2699[var12] |= 0x4;
                } else {
                    this.method3091(var12);
                    this.field2699[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3082(var12, (var14 << 7) + (this.field2708[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3082(var12, (this.field2708[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3117(var17, this.field2693[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3112(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method3075(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3079();
            }
        }
    }

    @ObfuscatedName("fv.am(III)V")
    public void method3082(int arg0, int arg1) {
        this.field2708[arg0] = arg1;
        this.field2704[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("fv.az(Lfg;I)I")
    public int method3083(class161 arg0) {
        int var2 = (arg0.field2746 * arg0.field2742 >> 12) + arg0.field2741;
        int var3 = ((this.field2694[arg0.field2754] - 8192) * this.field2701[arg0.field2754] >> 12) + var2;
        class159 var4 = arg0.field2744;
        if (var4.field2728 > 0 && (var4.field2718 > 0 || this.field2686[arg0.field2754] > 0)) {
            int var5 = var4.field2718 << 2;
            int var6 = var4.field2723 << 1;
            if (arg0.field2749 < var6) {
                var5 = arg0.field2749 * var5 / var6;
            }
            int var7 = (this.field2686[arg0.field2754] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2756 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2735.field1103 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field2844 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("fv.aa(Lfg;B)I")
    public int method3084(class161 arg0) {
        class159 var2 = arg0.field2744;
        int var3 = this.field2688[arg0.field2754] * this.field2685[arg0.field2754] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2739 * var4 + 16384 >> 15;
        int var6 = this.field2692 * var5 + 128 >> 8;
        if (var2.field2722 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2734 * 1.953125E-5D * (double) var2.field2722) + 0.5D);
        }
        if (var2.field2720 != null) {
            int var7 = arg0.field2736;
            int var8 = var2.field2720[arg0.field2750 + 1];
            if (arg0.field2750 < var2.field2720.length - 2) {
                int var9 = (var2.field2720[arg0.field2750] & 0xFF) << 8;
                int var10 = (var2.field2720[arg0.field2750 + 2] & 0xFF) << 8;
                var8 += (var2.field2720[arg0.field2750 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2747 > 0 && var2.field2717 != null) {
            int var11 = arg0.field2747;
            int var12 = var2.field2717[arg0.field2745 + 1];
            if (arg0.field2745 < var2.field2717.length - 2) {
                int var13 = (var2.field2717[arg0.field2745] & 0xFF) << 8;
                int var14 = (var2.field2717[arg0.field2745 + 2] & 0xFF) << 8;
                var12 += (var2.field2717[arg0.field2745 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("fv.ab(Lfg;I)I")
    public int method3085(class161 arg0) {
        int var2 = this.field2710[arg0.field2754];
        return var2 < 8192 ? arg0.field2740 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2740) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("fv.a()Lbt;")
    public synchronized class57 method956() {
        return this.field2713;
    }

    @ObfuscatedName("fv.l()Lbt;")
    public synchronized class57 method957() {
        return null;
    }

    @ObfuscatedName("fv.v()I")
    public synchronized int method958() {
        return 0;
    }

    @ObfuscatedName("fv.j([III)V")
    public synchronized void method973(int[] arg0, int arg1, int arg2) {
        if (this.field2714.method2997()) {
            int var4 = this.field2689 * this.field2714.field2663 / Statics.field2844;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2711;
                if (this.field2712 - var5 >= 0L) {
                    this.field2711 = var5;
                    break;
                }
                int var7 = (int) ((this.field2712 - this.field2711 + (long) var4 - 1L) / (long) var4);
                this.field2711 += (long) var4 * (long) var7;
                this.field2713.method973(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3088();
            } while (this.field2714.method2997());
        }
        this.field2713.method973(arg0, arg1, arg2);
    }

    @ObfuscatedName("fv.g(I)V")
    public synchronized void method961(int arg0) {
        if (this.field2714.method2997()) {
            int var2 = this.field2689 * this.field2714.field2663 / Statics.field2844;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2711;
                if (this.field2712 - var3 >= 0L) {
                    this.field2711 = var3;
                    break;
                }
                int var5 = (int) ((this.field2712 - this.field2711 + (long) var2 - 1L) / (long) var2);
                this.field2711 += (long) var2 * (long) var5;
                this.field2713.method961(var5);
                arg0 -= var5;
                this.method3088();
            } while (this.field2714.method2997());
        }
        this.field2713.method961(arg0);
    }

    @ObfuscatedName("fv.aw(I)V")
    public void method3088() {
        int var1 = this.field2709;
        int var2 = this.field2705;
        long var3 = this.field2712;
        while (this.field2705 == var2) {
            while (this.field2714.field2670[var1] == var2) {
                this.field2714.method2996(var1);
                int var5 = this.field2714.method3006(var1);
                if (var5 == 1) {
                    this.field2714.method3000();
                    this.field2714.method2999(var1);
                    if (this.field2714.method3013()) {
                        if (!this.field2702 || var2 == 0) {
                            this.method3079();
                            this.field2714.method3004();
                            return;
                        }
                        this.field2714.method3008(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3081(var5);
                }
                this.field2714.method3001(var1);
                this.field2714.method2999(var1);
            }
            var1 = this.field2714.method3019();
            var2 = this.field2714.field2670[var1];
            var3 = this.field2714.method3005(var2);
        }
        this.field2709 = var1;
        this.field2705 = var2;
        this.field2712 = var3;
    }

    @ObfuscatedName("fv.av(Lfg;I)Z")
    public boolean method3089(class161 arg0) {
        if (arg0.field2751 != null) {
            return false;
        }
        if (arg0.field2747 >= 0) {
            arg0.method3288();
            if (arg0.field2737 > 0 && this.field2706[arg0.field2754][arg0.field2737] == arg0) {
                this.field2706[arg0.field2754][arg0.field2737] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("fv.al(Lfg;[IIIB)Z")
    public boolean method3090(class161 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2752 = Statics.field2844 / 100;
        if (arg0.field2747 >= 0 && arg0.field2751 == null || arg0.field2751.method1115()) {
            arg0.method3171();
            arg0.method3288();
            if (arg0.field2737 > 0 && this.field2706[arg0.field2754][arg0.field2737] == arg0) {
                this.field2706[arg0.field2754][arg0.field2737] = null;
            }
            return true;
        }
        int var5 = arg0.field2746;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2696[arg0.field2754] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2746 = var6;
        }
        arg0.field2751.method1113(this.method3083(arg0));
        class159 var7 = arg0.field2744;
        boolean var8 = false;
        arg0.field2749++;
        arg0.field2756 += var7.field2728;
        double var9 = (double) ((arg0.field2738 - 60 << 8) + (arg0.field2746 * arg0.field2742 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2722 > 0) {
            if (var7.field2721 > 0) {
                arg0.field2734 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2721 * var9) + 0.5D);
            } else {
                arg0.field2734 += 128;
            }
        }
        if (var7.field2720 != null) {
            if (var7.field2719 > 0) {
                arg0.field2736 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2719 * var9) + 0.5D);
            } else {
                arg0.field2736 += 128;
            }
            while (arg0.field2750 < var7.field2720.length - 2 && arg0.field2736 > (var7.field2720[arg0.field2750 + 2] & 0xFF) << 8) {
                arg0.field2750 += 2;
            }
            if (arg0.field2750 == var7.field2720.length - 2 && var7.field2720[arg0.field2750 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2747 >= 0 && var7.field2717 != null && (this.field2699[arg0.field2754] & 0x1) == 0 && (arg0.field2737 < 0 || this.field2706[arg0.field2754][arg0.field2737] != arg0)) {
            if (var7.field2724 > 0) {
                arg0.field2747 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2724 * var9) + 0.5D);
            } else {
                arg0.field2747 += 128;
            }
            while (arg0.field2745 < var7.field2717.length - 2 && arg0.field2747 > (var7.field2717[arg0.field2745 + 2] & 0xFF) << 8) {
                arg0.field2745 += 2;
            }
            if (arg0.field2745 == var7.field2717.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2751.method1111(arg0.field2752, this.method3084(arg0), this.method3085(arg0));
            return false;
        }
        arg0.field2751.method1112(arg0.field2752);
        if (arg1 == null) {
            arg0.field2751.method961(arg3);
        } else {
            arg0.field2751.method973(arg1, arg2, arg3);
        }
        if (arg0.field2751.method1178()) {
            this.field2713.field2730.method967(arg0.field2751);
        }
        arg0.method3171();
        if (arg0.field2747 >= 0) {
            arg0.method3288();
            if (arg0.field2737 > 0 && this.field2706[arg0.field2754][arg0.field2737] == arg0) {
                this.field2706[arg0.field2754][arg0.field2737] = null;
            }
        }
        return true;
    }
}
