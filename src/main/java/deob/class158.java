package deob;

@ObfuscatedName("fd")
public class class158 extends class57 {

    @ObfuscatedName("fd.m")
    public class169 field2680 = new class169(128);

    @ObfuscatedName("fd.k")
    public int field2667 = 256;

    @ObfuscatedName("fd.y")
    public int field2693 = 1000000;

    @ObfuscatedName("fd.g")
    public int[] field2681 = new int[16];

    @ObfuscatedName("fd.r")
    public int[] field2670 = new int[16];

    @ObfuscatedName("fd.i")
    public int[] field2671 = new int[16];

    @ObfuscatedName("fd.f")
    public int[] field2672 = new int[16];

    @ObfuscatedName("fd.a")
    public int[] field2673 = new int[16];

    @ObfuscatedName("fd.u")
    public int[] field2682 = new int[16];

    @ObfuscatedName("fd.d")
    public int[] field2675 = new int[16];

    @ObfuscatedName("fd.t")
    public int[] field2690 = new int[16];

    @ObfuscatedName("fd.j")
    public int[] field2674 = new int[16];

    @ObfuscatedName("fd.b")
    public int[] field2679 = new int[16];

    @ObfuscatedName("fd.s")
    public int[] field2676 = new int[16];

    @ObfuscatedName("fd.o")
    public int[] field2668 = new int[16];

    @ObfuscatedName("fd.h")
    public int[] field2677 = new int[16];

    @ObfuscatedName("fd.x")
    public int[] field2683 = new int[16];

    @ObfuscatedName("fd.e")
    public int[] field2684 = new int[16];

    @ObfuscatedName("fd.z")
    public class161[][] field2685 = new class161[16][128];

    @ObfuscatedName("fd.az")
    public class161[][] field2686 = new class161[16][128];

    @ObfuscatedName("fd.av")
    public class156 field2687 = new class156();

    @ObfuscatedName("fd.ay")
    public boolean field2688;

    @ObfuscatedName("fd.ah")
    public int field2689;

    @ObfuscatedName("fd.ao")
    public int field2669;

    @ObfuscatedName("fd.aj")
    public long field2691;

    @ObfuscatedName("fd.ad")
    public long field2692;

    @ObfuscatedName("fd.ai")
    public class160 field2666 = new class160(this);

    public class158() {
        this.method3029();
    }

    @ObfuscatedName("fd.m(II)V")
    public synchronized void method3010(int arg0) {
        this.field2667 = arg0;
    }

    @ObfuscatedName("fd.k(B)I")
    public int method3081() {
        return this.field2667;
    }

    @ObfuscatedName("fd.y(Leq;Lek;Lat;II)Z")
    public synchronized boolean method3012(class154 arg0, class142 arg1, class50 arg2, int arg3) {
        arg0.method2933();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class170 var7 = (class170) arg0.field2630.method3156(); var7 != null; var7 = (class170) arg0.field2630.method3157()) {
            int var8 = (int) var7.field2812;
            class155 var9 = (class155) this.field2680.method3159((long) var8);
            if (var9 == null) {
                var9 = class155.method2439(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field2680.method3165(var9, (long) var8);
            }
            if (!var9.method2935(arg2, var7.field2802, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method2927();
        }
        return var5;
    }

    @ObfuscatedName("fd.g(I)V")
    public synchronized void method3032() {
        for (class155 var1 = (class155) this.field2680.method3156(); var1 != null; var1 = (class155) this.field2680.method3157()) {
            var1.method2936();
        }
    }

    @ObfuscatedName("fd.r(I)V")
    public synchronized void method3109() {
        for (class155 var1 = (class155) this.field2680.method3156(); var1 != null; var1 = (class155) this.field2680.method3157()) {
            var1.method3223();
        }
    }

    @ObfuscatedName("fd.u(Leq;ZI)V")
    public synchronized void method3015(class154 arg0, boolean arg1) {
        this.method3016();
        this.field2687.method2951(arg0.field2631);
        this.field2688 = arg1;
        this.field2691 = 0L;
        int var3 = this.field2687.method2954();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2687.method2955(var4);
            this.field2687.method2958(var4);
            this.field2687.method2956(var4);
        }
        this.field2689 = this.field2687.method2963();
        this.field2669 = this.field2687.field2647[this.field2689];
        this.field2692 = this.field2687.method2962(this.field2669);
    }

    @ObfuscatedName("fd.t(I)V")
    public synchronized void method3016() {
        this.field2687.method2996();
        this.method3029();
    }

    @ObfuscatedName("fd.j(I)Z")
    public synchronized boolean method3049() {
        return this.field2687.method2953();
    }

    @ObfuscatedName("fd.q(IIB)V")
    public synchronized void method3018(int arg0, int arg1) {
        this.method3014(arg0, arg1);
    }

    @ObfuscatedName("fd.p(III)V")
    public void method3014(int arg0, int arg1) {
        this.field2672[arg0] = arg1;
        this.field2682[arg0] = arg1 & 0xFFFFFF80;
        this.method3020(arg0, arg1);
    }

    @ObfuscatedName("fd.v(III)V")
    public void method3020(int arg0, int arg1) {
        if (this.field2673[arg0] != arg1) {
            this.field2673[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2686[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("fd.n(IIII)V")
    public void method3021(int arg0, int arg1, int arg2) {
        this.method3023(arg0, arg1, 64);
        if ((this.field2679[arg0] & 0x2) != 0) {
            for (class161 var4 = (class161) this.field2666.field2710.method3186(); var4 != null; var4 = (class161) this.field2666.field2710.method3173()) {
                if (var4.field2715 == arg0 && var4.field2719 < 0) {
                    this.field2685[arg0][var4.field2720] = null;
                    this.field2685[arg0][arg1] = var4;
                    int var5 = (var4.field2731 * var4.field2724 >> 12) + var4.field2723;
                    var4.field2723 += arg1 - var4.field2720 << 8;
                    var4.field2724 = var5 - var4.field2723;
                    var4.field2731 = 4096;
                    var4.field2720 = arg1;
                    return;
                }
            }
        }
        class155 var6 = (class155) this.field2680.method3159((long) this.field2673[arg0]);
        if (var6 == null) {
            return;
        }
        class53 var7 = var6.field2632[arg1];
        if (var7 == null) {
            return;
        }
        class161 var8 = new class161();
        var8.field2715 = arg0;
        var8.field2716 = var6;
        var8.field2717 = var7;
        var8.field2718 = var6.field2633[arg1];
        var8.field2727 = var6.field2640[arg1];
        var8.field2720 = arg1;
        var8.field2726 = var6.field2637 * arg2 * arg2 * var6.field2635[arg1] + 1024 >> 11;
        var8.field2722 = var6.field2638[arg1] & 0xFF;
        var8.field2723 = (arg1 << 8) - (var6.field2634[arg1] & 0x7FFF);
        var8.field2725 = 0;
        var8.field2736 = 0;
        var8.field2728 = 0;
        var8.field2719 = -1;
        var8.field2730 = 0;
        if (this.field2677[arg0] == 0) {
            var8.field2733 = class55.method1086(var7, this.method3034(var8), this.method3035(var8), this.method3036(var8));
        } else {
            var8.field2733 = class55.method1086(var7, this.method3034(var8), 0, this.method3036(var8));
            this.method3093(var8, var6.field2634[arg1] < 0);
        }
        if (var6.field2634[arg1] < 0) {
            var8.field2733.method1179(-1);
        }
        if (var8.field2727 >= 0) {
            class161 var9 = this.field2686[arg0][var8.field2727];
            if (var9 != null && var9.field2719 < 0) {
                this.field2685[arg0][var9.field2720] = null;
                var9.field2719 = 0;
            }
            this.field2686[arg0][var8.field2727] = var8;
        }
        this.field2666.field2710.method3180(var8);
        this.field2685[arg0][arg1] = var8;
    }

    @ObfuscatedName("fd.l(Lfq;ZI)V")
    public void method3093(class161 arg0, boolean arg1) {
        int var3 = arg0.field2717.field1102.length;
        int var5;
        if (arg1 && arg0.field2717.field1101) {
            int var4 = var3 + var3 - arg0.field2717.field1105;
            var5 = (int) ((long) this.field2677[arg0.field2715] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2733.method1094(true);
            }
        } else {
            var5 = (int) ((long) this.field2677[arg0.field2715] * (long) var3 >> 6);
        }
        arg0.field2733.method1093(var5);
    }

    @ObfuscatedName("fd.c(IIII)V")
    public void method3023(int arg0, int arg1, int arg2) {
        class161 var4 = this.field2685[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2685[arg0][arg1] = null;
        if ((this.field2679[arg0] & 0x2) == 0) {
            var4.field2719 = 0;
            return;
        }
        for (class161 var5 = (class161) this.field2666.field2710.method3178(); var5 != null; var5 = (class161) this.field2666.field2710.method3179()) {
            if (var4.field2715 == var5.field2715 && var5.field2719 < 0 && var4 != var5) {
                var4.field2719 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("fd.b(IIIB)V")
    public void method3037(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("fd.s(IIB)V")
    public void method3079(int arg0, int arg1) {
    }

    @ObfuscatedName("fd.o(III)V")
    public void method3025(int arg0, int arg1) {
        this.field2675[arg0] = arg1;
    }

    @ObfuscatedName("fd.h(II)V")
    public void method3042(int arg0) {
        for (class161 var2 = (class161) this.field2666.field2710.method3178(); var2 != null; var2 = (class161) this.field2666.field2710.method3179()) {
            if (arg0 < 0 || var2.field2715 == arg0) {
                if (var2.field2733 != null) {
                    var2.field2733.method1146(Statics.field1056 / 100);
                    if (var2.field2733.method1098()) {
                        this.field2666.field2711.method914(var2.field2733);
                    }
                    var2.method3120();
                }
                if (var2.field2719 < 0) {
                    this.field2685[var2.field2715][var2.field2720] = null;
                }
                var2.method3223();
            }
        }
    }

    @ObfuscatedName("fd.x(II)V")
    public void method3022(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3022(var2);
            }
            return;
        }
        this.field2681[arg0] = 12800;
        this.field2670[arg0] = 8192;
        this.field2671[arg0] = 16383;
        this.field2675[arg0] = 8192;
        this.field2690[arg0] = 0;
        this.field2674[arg0] = 8192;
        this.method3030(arg0);
        this.method3031(arg0);
        this.field2679[arg0] = 0;
        this.field2676[arg0] = 32767;
        this.field2668[arg0] = 256;
        this.field2677[arg0] = 0;
        this.method3033(arg0, 8192);
    }

    @ObfuscatedName("fd.e(IB)V")
    public void method3044(int arg0) {
        for (class161 var2 = (class161) this.field2666.field2710.method3178(); var2 != null; var2 = (class161) this.field2666.field2710.method3179()) {
            if ((arg0 < 0 || var2.field2715 == arg0) && var2.field2719 < 0) {
                this.field2685[var2.field2715][var2.field2720] = null;
                var2.field2719 = 0;
            }
        }
    }

    @ObfuscatedName("fd.an(I)V")
    public void method3029() {
        this.method3042(-1);
        this.method3022(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2673[var1] = this.field2672[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2682[var2] = this.field2672[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("fd.au(IB)V")
    public void method3030(int arg0) {
        if ((this.field2679[arg0] & 0x2) == 0) {
            return;
        }
        for (class161 var2 = (class161) this.field2666.field2710.method3178(); var2 != null; var2 = (class161) this.field2666.field2710.method3179()) {
            if (var2.field2715 == arg0 && this.field2685[arg0][var2.field2720] == null && var2.field2719 < 0) {
                var2.field2719 = 0;
            }
        }
    }

    @ObfuscatedName("fd.ap(II)V")
    public void method3031(int arg0) {
        if ((this.field2679[arg0] & 0x4) == 0) {
            return;
        }
        for (class161 var2 = (class161) this.field2666.field2710.method3178(); var2 != null; var2 = (class161) this.field2666.field2710.method3179()) {
            if (var2.field2715 == arg0) {
                var2.field2735 = 0;
            }
        }
    }

    @ObfuscatedName("fd.ac(II)V")
    public void method3050(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3023(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3021(var6, var7, var8);
            } else {
                this.method3023(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3037(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2682[var12] = (var14 << 14) + (this.field2682[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2682[var12] = (var14 << 7) + (this.field2682[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2690[var12] = (var14 << 7) + (this.field2690[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2690[var12] = (this.field2690[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2674[var12] = (var14 << 7) + (this.field2674[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2674[var12] = (this.field2674[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2681[var12] = (var14 << 7) + (this.field2681[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2681[var12] = (this.field2681[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2670[var12] = (var14 << 7) + (this.field2670[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2670[var12] = (this.field2670[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2671[var12] = (var14 << 7) + (this.field2671[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2671[var12] = (this.field2671[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2679[var12] |= 0x1;
                } else {
                    this.field2679[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2679[var12] |= 0x2;
                } else {
                    this.method3030(var12);
                    this.field2679[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2676[var12] = (var14 << 7) + (this.field2676[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2676[var12] = (this.field2676[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2676[var12] = (var14 << 7) + (this.field2676[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2676[var12] = (this.field2676[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3042(var12);
            }
            if (var13 == 121) {
                this.method3022(var12);
            }
            if (var13 == 123) {
                this.method3044(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2676[var12];
                if (var15 == 16384) {
                    this.field2668[var12] = (var14 << 7) + (this.field2668[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2676[var12];
                if (var16 == 16384) {
                    this.field2668[var12] = (this.field2668[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2677[var12] = (var14 << 7) + (this.field2677[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2677[var12] = (this.field2677[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2679[var12] |= 0x4;
                } else {
                    this.method3031(var12);
                    this.field2679[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3033(var12, (var14 << 7) + (this.field2683[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3033(var12, (this.field2683[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3020(var17, this.field2682[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3079(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method3025(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3029();
            }
        }
    }

    @ObfuscatedName("fd.ak(III)V")
    public void method3033(int arg0, int arg1) {
        this.field2683[arg0] = arg1;
        this.field2684[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("fd.ax(Lfq;I)I")
    public int method3034(class161 arg0) {
        int var2 = (arg0.field2731 * arg0.field2724 >> 12) + arg0.field2723;
        int var3 = ((this.field2675[arg0.field2715] - 8192) * this.field2668[arg0.field2715] >> 12) + var2;
        class159 var4 = arg0.field2718;
        if (var4.field2703 > 0 && (var4.field2702 > 0 || this.field2690[arg0.field2715] > 0)) {
            int var5 = var4.field2702 << 2;
            int var6 = var4.field2704 << 1;
            if (arg0.field2729 < var6) {
                var5 = arg0.field2729 * var5 / var6;
            }
            int var7 = (this.field2690[arg0.field2715] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2732 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2717.field1103 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1056 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("fd.ab(Lfq;B)I")
    public int method3035(class161 arg0) {
        class159 var2 = arg0.field2718;
        int var3 = this.field2681[arg0.field2715] * this.field2671[arg0.field2715] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2726 * var4 + 16384 >> 15;
        int var6 = this.field2667 * var5 + 128 >> 8;
        if (var2.field2698 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2725 * 1.953125E-5D * (double) var2.field2698) + 0.5D);
        }
        if (var2.field2696 != null) {
            int var7 = arg0.field2736;
            int var8 = var2.field2696[arg0.field2728 + 1];
            if (arg0.field2728 < var2.field2696.length - 2) {
                int var9 = (var2.field2696[arg0.field2728] & 0xFF) << 8;
                int var10 = (var2.field2696[arg0.field2728 + 2] & 0xFF) << 8;
                var8 += (var2.field2696[arg0.field2728 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2719 > 0 && var2.field2699 != null) {
            int var11 = arg0.field2719;
            int var12 = var2.field2699[arg0.field2730 + 1];
            if (arg0.field2730 < var2.field2699.length - 2) {
                int var13 = (var2.field2699[arg0.field2730] & 0xFF) << 8;
                int var14 = (var2.field2699[arg0.field2730 + 2] & 0xFF) << 8;
                var12 += (var2.field2699[arg0.field2730 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("fd.aw(Lfq;I)I")
    public int method3036(class161 arg0) {
        int var2 = this.field2670[arg0.field2715];
        return var2 < 8192 ? arg0.field2722 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2722) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("fd.i()Lbm;")
    public synchronized class57 method919() {
        return this.field2666;
    }

    @ObfuscatedName("fd.f()Lbm;")
    public synchronized class57 method920() {
        return null;
    }

    @ObfuscatedName("fd.a()I")
    public synchronized int method921() {
        return 0;
    }

    @ObfuscatedName("fd.w([III)V")
    public synchronized void method922(int[] arg0, int arg1, int arg2) {
        if (this.field2687.method2953()) {
            int var4 = this.field2693 * this.field2687.field2646 / Statics.field1056;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2691;
                if (this.field2692 - var5 >= 0L) {
                    this.field2691 = var5;
                    break;
                }
                int var7 = (int) ((this.field2692 - this.field2691 + (long) var4 - 1L) / (long) var4);
                this.field2691 += (long) var4 * (long) var7;
                this.field2666.method922(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3038();
            } while (this.field2687.method2953());
        }
        this.field2666.method922(arg0, arg1, arg2);
    }

    @ObfuscatedName("fd.d(I)V")
    public synchronized void method924(int arg0) {
        if (this.field2687.method2953()) {
            int var2 = this.field2693 * this.field2687.field2646 / Statics.field1056;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2691;
                if (this.field2692 - var3 >= 0L) {
                    this.field2691 = var3;
                    break;
                }
                int var5 = (int) ((this.field2692 - this.field2691 + (long) var2 - 1L) / (long) var2);
                this.field2691 += (long) var2 * (long) var5;
                this.field2666.method924(var5);
                arg0 -= var5;
                this.method3038();
            } while (this.field2687.method2953());
        }
        this.field2666.method924(arg0);
    }

    @ObfuscatedName("fd.at(I)V")
    public void method3038() {
        int var1 = this.field2689;
        int var2 = this.field2669;
        long var3 = this.field2692;
        while (this.field2669 == var2) {
            while (this.field2687.field2647[var1] == var2) {
                this.field2687.method2955(var1);
                int var5 = this.field2687.method2959(var1);
                if (var5 == 1) {
                    this.field2687.method2957();
                    this.field2687.method2956(var1);
                    if (this.field2687.method2964()) {
                        if (!this.field2688 || var2 == 0) {
                            this.method3029();
                            this.field2687.method2996();
                            return;
                        }
                        this.field2687.method3001(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3050(var5);
                }
                this.field2687.method2958(var1);
                this.field2687.method2956(var1);
            }
            var1 = this.field2687.method2963();
            var2 = this.field2687.field2647[var1];
            var3 = this.field2687.method2962(var2);
        }
        this.field2689 = var1;
        this.field2669 = var2;
        this.field2692 = var3;
    }

    @ObfuscatedName("fd.as(Lfq;B)Z")
    public boolean method3039(class161 arg0) {
        if (arg0.field2733 != null) {
            return false;
        }
        if (arg0.field2719 >= 0) {
            arg0.method3223();
            if (arg0.field2727 > 0 && this.field2686[arg0.field2715][arg0.field2727] == arg0) {
                this.field2686[arg0.field2715][arg0.field2727] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("fd.ae(Lfq;[IIII)Z")
    public boolean method3040(class161 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2734 = Statics.field1056 / 100;
        if (arg0.field2719 >= 0 && arg0.field2733 == null || arg0.field2733.method1101()) {
            arg0.method3120();
            arg0.method3223();
            if (arg0.field2727 > 0 && this.field2686[arg0.field2715][arg0.field2727] == arg0) {
                this.field2686[arg0.field2715][arg0.field2727] = null;
            }
            return true;
        }
        int var5 = arg0.field2731;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2674[arg0.field2715] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2731 = var6;
        }
        arg0.field2733.method1099(this.method3034(arg0));
        class159 var7 = arg0.field2718;
        boolean var8 = false;
        arg0.field2729++;
        arg0.field2732 += var7.field2703;
        double var9 = (double) ((arg0.field2720 - 60 << 8) + (arg0.field2731 * arg0.field2724 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2698 > 0) {
            if (var7.field2701 > 0) {
                arg0.field2725 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2701 * var9) + 0.5D);
            } else {
                arg0.field2725 += 128;
            }
        }
        if (var7.field2696 != null) {
            if (var7.field2697 > 0) {
                arg0.field2736 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2697 * var9) + 0.5D);
            } else {
                arg0.field2736 += 128;
            }
            while (arg0.field2728 < var7.field2696.length - 2 && arg0.field2736 > (var7.field2696[arg0.field2728 + 2] & 0xFF) << 8) {
                arg0.field2728 += 2;
            }
            if (arg0.field2728 == var7.field2696.length - 2 && var7.field2696[arg0.field2728 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2719 >= 0 && var7.field2699 != null && (this.field2679[arg0.field2715] & 0x1) == 0 && (arg0.field2727 < 0 || this.field2686[arg0.field2715][arg0.field2727] != arg0)) {
            if (var7.field2700 > 0) {
                arg0.field2719 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2700 * var9) + 0.5D);
            } else {
                arg0.field2719 += 128;
            }
            while (arg0.field2730 < var7.field2699.length - 2 && arg0.field2719 > (var7.field2699[arg0.field2730 + 2] & 0xFF) << 8) {
                arg0.field2730 += 2;
            }
            if (arg0.field2730 == var7.field2699.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2733.method1128(arg0.field2734, this.method3035(arg0), this.method3036(arg0));
            return false;
        }
        arg0.field2733.method1146(arg0.field2734);
        if (arg1 == null) {
            arg0.field2733.method924(arg3);
        } else {
            arg0.field2733.method922(arg1, arg2, arg3);
        }
        if (arg0.field2733.method1098()) {
            this.field2666.field2711.method914(arg0.field2733);
        }
        arg0.method3120();
        if (arg0.field2719 >= 0) {
            arg0.method3223();
            if (arg0.field2727 > 0 && this.field2686[arg0.field2715][arg0.field2727] == arg0) {
                this.field2686[arg0.field2715][arg0.field2727] = null;
            }
        }
        return true;
    }
}
