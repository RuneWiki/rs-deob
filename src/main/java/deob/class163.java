package deob;

@ObfuscatedName("fd")
public class class163 extends class60 {

    @ObfuscatedName("fd.g")
    public class175 field2742 = new class175(128);

    @ObfuscatedName("fd.i")
    public int field2738 = 256;

    @ObfuscatedName("fd.k")
    public int field2739 = 1000000;

    @ObfuscatedName("fd.e")
    public int[] field2740 = new int[16];

    @ObfuscatedName("fd.m")
    public int[] field2762 = new int[16];

    @ObfuscatedName("fd.u")
    public int[] field2753 = new int[16];

    @ObfuscatedName("fd.j")
    public int[] field2763 = new int[16];

    @ObfuscatedName("fd.o")
    public int[] field2744 = new int[16];

    @ObfuscatedName("fd.h")
    public int[] field2748 = new int[16];

    @ObfuscatedName("fd.b")
    public int[] field2765 = new int[16];

    @ObfuscatedName("fd.r")
    public int[] field2741 = new int[16];

    @ObfuscatedName("fd.l")
    public int[] field2747 = new int[16];

    @ObfuscatedName("fd.n")
    public int[] field2750 = new int[16];

    @ObfuscatedName("fd.v")
    public int[] field2751 = new int[16];

    @ObfuscatedName("fd.f")
    public int[] field2752 = new int[16];

    @ObfuscatedName("fd.a")
    public int[] field2745 = new int[16];

    @ObfuscatedName("fd.p")
    public int[] field2754 = new int[16];

    @ObfuscatedName("fd.s")
    public int[] field2755 = new int[16];

    @ObfuscatedName("fd.c")
    public class166[][] field2746 = new class166[16][128];

    @ObfuscatedName("fd.ar")
    public class166[][] field2737 = new class166[16][128];

    @ObfuscatedName("fd.ac")
    public class161 field2758 = new class161();

    @ObfuscatedName("fd.ah")
    public boolean field2759;

    @ObfuscatedName("fd.ap")
    public int field2760;

    @ObfuscatedName("fd.aj")
    public int field2761;

    @ObfuscatedName("fd.as")
    public long field2757;

    @ObfuscatedName("fd.aa")
    public long field2756;

    @ObfuscatedName("fd.am")
    public class165 field2764 = new class165(this);

    public class163() {
        this.method3038();
    }

    @ObfuscatedName("fd.g(II)V")
    public synchronized void method3066(int arg0) {
        this.field2738 = arg0;
    }

    @ObfuscatedName("fd.i(I)I")
    public int method3071() {
        return this.field2738;
    }

    @ObfuscatedName("fd.k(Lfw;Leo;Lby;II)Z")
    public synchronized boolean method3020(class159 arg0, class147 arg1, class53 arg2, int arg3) {
        arg0.method2929();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class176 var7 = (class176) arg0.field2700.method3182(); var7 != null; var7 = (class176) arg0.field2700.method3178()) {
            int var8 = (int) var7.field2885;
            class160 var9 = (class160) this.field2742.method3174((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method2713(var8);
                class160 var11;
                if (var10 == null) {
                    var11 = null;
                } else {
                    var11 = new class160(var10);
                }
                var9 = var11;
                if (var11 == null) {
                    var5 = false;
                    continue;
                }
                this.field2742.method3177(var11, (long) var8);
            }
            if (!var9.method2938(arg2, var7.field2865, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method2930();
        }
        return var5;
    }

    @ObfuscatedName("fd.e(I)V")
    public synchronized void method3021() {
        for (class160 var1 = (class160) this.field2742.method3182(); var1 != null; var1 = (class160) this.field2742.method3178()) {
            var1.method2940();
        }
    }

    @ObfuscatedName("fd.w(I)V")
    public synchronized void method3040() {
        for (class160 var1 = (class160) this.field2742.method3182(); var1 != null; var1 = (class160) this.field2742.method3178()) {
            var1.method3304();
        }
    }

    @ObfuscatedName("fd.h(Lfw;ZI)V")
    public synchronized void method3023(class159 arg0, boolean arg1) {
        this.method3024();
        this.field2758.method2949(arg0.field2701);
        this.field2759 = arg1;
        this.field2757 = 0L;
        int var3 = this.field2758.method2997();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2758.method2973(var4);
            this.field2758.method2956(var4);
            this.field2758.method2991(var4);
        }
        this.field2760 = this.field2758.method2961();
        this.field2761 = this.field2758.field2716[this.field2760];
        this.field2756 = this.field2758.method2960(this.field2761);
    }

    @ObfuscatedName("fd.r(I)V")
    public synchronized void method3024() {
        this.field2758.method2954();
        this.method3038();
    }

    @ObfuscatedName("fd.l(I)Z")
    public synchronized boolean method3025() {
        return this.field2758.method2951();
    }

    @ObfuscatedName("fd.x(IIS)V")
    public synchronized void method3026(int arg0, int arg1) {
        this.method3027(arg0, arg1);
    }

    @ObfuscatedName("fd.q(IIB)V")
    public void method3027(int arg0, int arg1) {
        this.field2763[arg0] = arg1;
        this.field2748[arg0] = arg1 & 0xFFFFFF80;
        this.method3028(arg0, arg1);
    }

    @ObfuscatedName("fd.t(III)V")
    public void method3028(int arg0, int arg1) {
        if (this.field2744[arg0] != arg1) {
            this.field2744[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2737[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("fd.y(IIII)V")
    public void method3029(int arg0, int arg1, int arg2) {
        this.method3031(arg0, arg1, 64);
        if ((this.field2750[arg0] & 0x2) != 0) {
            for (class166 var4 = (class166) this.field2764.field2782.method3205(); var4 != null; var4 = (class166) this.field2764.field2782.method3210()) {
                if (var4.field2799 == arg0 && var4.field2807 < 0) {
                    this.field2746[arg0][var4.field2792] = null;
                    this.field2746[arg0][arg1] = var4;
                    int var5 = (var4.field2806 * var4.field2796 >> 12) + var4.field2797;
                    var4.field2797 += arg1 - var4.field2792 << 8;
                    var4.field2796 = var5 - var4.field2797;
                    var4.field2806 = 4096;
                    var4.field2792 = arg1;
                    return;
                }
            }
        }
        class160 var6 = (class160) this.field2742.method3174((long) this.field2744[arg0]);
        if (var6 == null) {
            return;
        }
        class56 var7 = var6.field2706[arg1];
        if (var7 == null) {
            return;
        }
        class166 var8 = new class166();
        var8.field2799 = arg0;
        var8.field2788 = var6;
        var8.field2789 = var7;
        var8.field2790 = var6.field2705[arg1];
        var8.field2804 = var6.field2708[arg1];
        var8.field2792 = arg1;
        var8.field2793 = var6.field2711 * arg2 * arg2 * var6.field2702[arg1] + 1024 >> 11;
        var8.field2787 = var6.field2707[arg1] & 0xFF;
        var8.field2797 = (arg1 << 8) - (var6.field2704[arg1] & 0x7FFF);
        var8.field2798 = 0;
        var8.field2791 = 0;
        var8.field2800 = 0;
        var8.field2807 = -1;
        var8.field2795 = 0;
        if (this.field2745[arg0] == 0) {
            var8.field2805 = class58.method1079(var7, this.method3043(var8), this.method3121(var8), this.method3045(var8));
        } else {
            var8.field2805 = class58.method1079(var7, this.method3043(var8), 0, this.method3045(var8));
            this.method3030(var8, var6.field2704[arg1] < 0);
        }
        if (var6.field2704[arg1] < 0) {
            var8.field2805.method1153(-1);
        }
        if (var8.field2804 >= 0) {
            class166 var9 = this.field2737[arg0][var8.field2804];
            if (var9 != null && var9.field2807 < 0) {
                this.field2746[arg0][var9.field2792] = null;
                var9.field2807 = 0;
            }
            this.field2737[arg0][var8.field2804] = var8;
        }
        this.field2764.field2782.method3202(var8);
        this.field2746[arg0][arg1] = var8;
    }

    @ObfuscatedName("fd.d(Lfm;ZB)V")
    public void method3030(class166 arg0, boolean arg1) {
        int var3 = arg0.field2789.field1131.length;
        int var5;
        if (arg1 && arg0.field2789.field1134) {
            int var4 = var3 + var3 - arg0.field2789.field1130;
            var5 = (int) ((long) this.field2745[arg0.field2799] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2805.method1171(true);
            }
        } else {
            var5 = (int) ((long) this.field2745[arg0.field2799] * (long) var3 >> 6);
        }
        arg0.field2805.method1087(var5);
    }

    @ObfuscatedName("fd.z(IIII)V")
    public void method3031(int arg0, int arg1, int arg2) {
        class166 var4 = this.field2746[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2746[arg0][arg1] = null;
        if ((this.field2750[arg0] & 0x2) == 0) {
            var4.field2807 = 0;
            return;
        }
        for (class166 var5 = (class166) this.field2764.field2782.method3200(); var5 != null; var5 = (class166) this.field2764.field2782.method3209()) {
            if (var4.field2799 == var5.field2799 && var5.field2807 < 0 && var4 != var5) {
                var4.field2807 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("fd.n(IIIS)V")
    public void method3032(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("fd.v(III)V")
    public void method3033(int arg0, int arg1) {
    }

    @ObfuscatedName("fd.f(III)V")
    public void method3034(int arg0, int arg1) {
        this.field2765[arg0] = arg1;
    }

    @ObfuscatedName("fd.a(IS)V")
    public void method3035(int arg0) {
        for (class166 var2 = (class166) this.field2764.field2782.method3200(); var2 != null; var2 = (class166) this.field2764.field2782.method3209()) {
            if (arg0 < 0 || var2.field2799 == arg0) {
                if (var2.field2805 != null) {
                    var2.field2805.method1157(Statics.field72 / 100);
                    if (var2.field2805.method1095()) {
                        this.field2764.field2783.method940(var2.field2805);
                    }
                    var2.method3130();
                }
                if (var2.field2807 < 0) {
                    this.field2746[var2.field2799][var2.field2792] = null;
                }
                var2.method3304();
            }
        }
    }

    @ObfuscatedName("fd.p(II)V")
    public void method3036(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method3036(var2);
            }
            return;
        }
        this.field2740[arg0] = 12800;
        this.field2762[arg0] = 8192;
        this.field2753[arg0] = 16383;
        this.field2765[arg0] = 8192;
        this.field2741[arg0] = 0;
        this.field2747[arg0] = 8192;
        this.method3096(arg0);
        this.method3109(arg0);
        this.field2750[arg0] = 0;
        this.field2751[arg0] = 32767;
        this.field2752[arg0] = 256;
        this.field2745[arg0] = 0;
        this.method3123(arg0, 8192);
    }

    @ObfuscatedName("fd.ae(II)V")
    public void method3079(int arg0) {
        for (class166 var2 = (class166) this.field2764.field2782.method3200(); var2 != null; var2 = (class166) this.field2764.field2782.method3209()) {
            if ((arg0 < 0 || var2.field2799 == arg0) && var2.field2807 < 0) {
                this.field2746[var2.field2799][var2.field2792] = null;
                var2.field2807 = 0;
            }
        }
    }

    @ObfuscatedName("fd.ai(B)V")
    public void method3038() {
        this.method3035(-1);
        this.method3036(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2744[var1] = this.field2763[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2748[var2] = this.field2763[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("fd.ay(II)V")
    public void method3096(int arg0) {
        if ((this.field2750[arg0] & 0x2) == 0) {
            return;
        }
        for (class166 var2 = (class166) this.field2764.field2782.method3200(); var2 != null; var2 = (class166) this.field2764.field2782.method3209()) {
            if (var2.field2799 == arg0 && this.field2746[arg0][var2.field2792] == null && var2.field2807 < 0) {
                var2.field2807 = 0;
            }
        }
    }

    @ObfuscatedName("fd.az(II)V")
    public void method3109(int arg0) {
        if ((this.field2750[arg0] & 0x4) == 0) {
            return;
        }
        for (class166 var2 = (class166) this.field2764.field2782.method3200(); var2 != null; var2 = (class166) this.field2764.field2782.method3209()) {
            if (var2.field2799 == arg0) {
                var2.field2802 = 0;
            }
        }
    }

    @ObfuscatedName("fd.ag(IB)V")
    public void method3085(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method3031(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method3029(var6, var7, var8);
            } else {
                this.method3031(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method3032(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2748[var12] = (var14 << 14) + (this.field2748[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2748[var12] = (var14 << 7) + (this.field2748[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2741[var12] = (var14 << 7) + (this.field2741[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2741[var12] = (this.field2741[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2747[var12] = (var14 << 7) + (this.field2747[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2747[var12] = (this.field2747[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2740[var12] = (var14 << 7) + (this.field2740[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2740[var12] = (this.field2740[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2762[var12] = (var14 << 7) + (this.field2762[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2762[var12] = (this.field2762[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2753[var12] = (var14 << 7) + (this.field2753[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2753[var12] = (this.field2753[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2750[var12] |= 0x1;
                } else {
                    this.field2750[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2750[var12] |= 0x2;
                } else {
                    this.method3096(var12);
                    this.field2750[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2751[var12] = (var14 << 7) + (this.field2751[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2751[var12] = (this.field2751[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2751[var12] = (var14 << 7) + (this.field2751[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2751[var12] = (this.field2751[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method3035(var12);
            }
            if (var13 == 121) {
                this.method3036(var12);
            }
            if (var13 == 123) {
                this.method3079(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2751[var12];
                if (var15 == 16384) {
                    this.field2752[var12] = (var14 << 7) + (this.field2752[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2751[var12];
                if (var16 == 16384) {
                    this.field2752[var12] = (this.field2752[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2745[var12] = (var14 << 7) + (this.field2745[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2745[var12] = (this.field2745[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2750[var12] |= 0x4;
                } else {
                    this.method3109(var12);
                    this.field2750[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method3123(var12, (var14 << 7) + (this.field2754[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method3123(var12, (this.field2754[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method3028(var17, this.field2748[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method3033(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method3034(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method3038();
            }
        }
    }

    @ObfuscatedName("fd.ao(IIB)V")
    public void method3123(int arg0, int arg1) {
        this.field2754[arg0] = arg1;
        this.field2755[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("fd.aq(Lfm;I)I")
    public int method3043(class166 arg0) {
        int var2 = (arg0.field2806 * arg0.field2796 >> 12) + arg0.field2797;
        int var3 = ((this.field2765[arg0.field2799] - 8192) * this.field2752[arg0.field2799] >> 12) + var2;
        class164 var4 = arg0.field2790;
        if (var4.field2775 > 0 && (var4.field2774 > 0 || this.field2741[arg0.field2799] > 0)) {
            int var5 = var4.field2774 << 2;
            int var6 = var4.field2777 << 1;
            if (arg0.field2803 < var6) {
                var5 = arg0.field2803 * var5 / var6;
            }
            int var7 = (this.field2741[arg0.field2799] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2801 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2789.field1132 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field72 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("fd.ak(Lfm;B)I")
    public int method3121(class166 arg0) {
        class164 var2 = arg0.field2790;
        int var3 = this.field2740[arg0.field2799] * this.field2753[arg0.field2799] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2793 * var4 + 16384 >> 15;
        int var6 = this.field2738 * var5 + 128 >> 8;
        if (var2.field2771 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2798 * 1.953125E-5D * (double) var2.field2771) + 0.5D);
        }
        if (var2.field2776 != null) {
            int var7 = arg0.field2791;
            int var8 = var2.field2776[arg0.field2800 + 1];
            if (arg0.field2800 < var2.field2776.length - 2) {
                int var9 = (var2.field2776[arg0.field2800] & 0xFF) << 8;
                int var10 = (var2.field2776[arg0.field2800 + 2] & 0xFF) << 8;
                var8 += (var2.field2776[arg0.field2800 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2807 > 0 && var2.field2769 != null) {
            int var11 = arg0.field2807;
            int var12 = var2.field2769[arg0.field2795 + 1];
            if (arg0.field2795 < var2.field2769.length - 2) {
                int var13 = (var2.field2769[arg0.field2795] & 0xFF) << 8;
                int var14 = (var2.field2769[arg0.field2795 + 2] & 0xFF) << 8;
                var12 += (var2.field2769[arg0.field2795 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("fd.al(Lfm;I)I")
    public int method3045(class166 arg0) {
        int var2 = this.field2762[arg0.field2799];
        return var2 < 8192 ? arg0.field2787 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2787) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("fd.m()Lbz;")
    public synchronized class60 method945() {
        return this.field2764;
    }

    @ObfuscatedName("fd.u()Lbz;")
    public synchronized class60 method946() {
        return null;
    }

    @ObfuscatedName("fd.j()I")
    public synchronized int method947() {
        return 0;
    }

    @ObfuscatedName("fd.o([III)V")
    public synchronized void method954(int[] arg0, int arg1, int arg2) {
        if (this.field2758.method2951()) {
            int var4 = this.field2739 * this.field2758.field2713 / Statics.field72;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2757;
                if (this.field2756 - var5 >= 0L) {
                    this.field2757 = var5;
                    break;
                }
                int var7 = (int) ((this.field2756 - this.field2757 + (long) var4 - 1L) / (long) var4);
                this.field2757 += (long) var4 * (long) var7;
                this.field2764.method954(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method3053();
            } while (this.field2758.method2951());
        }
        this.field2764.method954(arg0, arg1, arg2);
    }

    @ObfuscatedName("fd.b(I)V")
    public synchronized void method949(int arg0) {
        if (this.field2758.method2951()) {
            int var2 = this.field2739 * this.field2758.field2713 / Statics.field72;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2757;
                if (this.field2756 - var3 >= 0L) {
                    this.field2757 = var3;
                    break;
                }
                int var5 = (int) ((this.field2756 - this.field2757 + (long) var2 - 1L) / (long) var2);
                this.field2757 += (long) var2 * (long) var5;
                this.field2764.method949(var5);
                arg0 -= var5;
                this.method3053();
            } while (this.field2758.method2951());
        }
        this.field2764.method949(arg0);
    }

    @ObfuscatedName("fd.at(I)V")
    public void method3053() {
        int var1 = this.field2760;
        int var2 = this.field2761;
        long var3 = this.field2756;
        while (this.field2761 == var2) {
            while (this.field2758.field2716[var1] == var2) {
                this.field2758.method2973(var1);
                int var5 = this.field2758.method3000(var1);
                if (var5 == 1) {
                    this.field2758.method2955();
                    this.field2758.method2991(var1);
                    if (this.field2758.method2962()) {
                        if (!this.field2759 || var2 == 0) {
                            this.method3038();
                            this.field2758.method2954();
                            return;
                        }
                        this.field2758.method2963(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method3085(var5);
                }
                this.field2758.method2956(var1);
                this.field2758.method2991(var1);
            }
            var1 = this.field2758.method2961();
            var2 = this.field2758.field2716[var1];
            var3 = this.field2758.method2960(var2);
        }
        this.field2760 = var1;
        this.field2761 = var2;
        this.field2756 = var3;
    }

    @ObfuscatedName("fd.an(Lfm;I)Z")
    public boolean method3048(class166 arg0) {
        if (arg0.field2805 != null) {
            return false;
        }
        if (arg0.field2807 >= 0) {
            arg0.method3304();
            if (arg0.field2804 > 0 && this.field2737[arg0.field2799][arg0.field2804] == arg0) {
                this.field2737[arg0.field2799][arg0.field2804] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("fd.av(Lfm;[IIIB)Z")
    public boolean method3049(class166 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2794 = Statics.field72 / 100;
        if (arg0.field2807 >= 0 && arg0.field2805 == null || arg0.field2805.method1094()) {
            arg0.method3130();
            arg0.method3304();
            if (arg0.field2804 > 0 && this.field2737[arg0.field2799][arg0.field2804] == arg0) {
                this.field2737[arg0.field2799][arg0.field2804] = null;
            }
            return true;
        }
        int var5 = arg0.field2806;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2747[arg0.field2799] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2806 = var6;
        }
        arg0.field2805.method1092(this.method3043(arg0));
        class164 var7 = arg0.field2790;
        boolean var8 = false;
        arg0.field2803++;
        arg0.field2801 += var7.field2775;
        double var9 = (double) ((arg0.field2792 - 60 << 8) + (arg0.field2806 * arg0.field2796 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2771 > 0) {
            if (var7.field2773 > 0) {
                arg0.field2798 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2773 * var9) + 0.5D);
            } else {
                arg0.field2798 += 128;
            }
        }
        if (var7.field2776 != null) {
            if (var7.field2768 > 0) {
                arg0.field2791 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2768 * var9) + 0.5D);
            } else {
                arg0.field2791 += 128;
            }
            while (arg0.field2800 < var7.field2776.length - 2 && arg0.field2791 > (var7.field2776[arg0.field2800 + 2] & 0xFF) << 8) {
                arg0.field2800 += 2;
            }
            if (arg0.field2800 == var7.field2776.length - 2 && var7.field2776[arg0.field2800 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2807 >= 0 && var7.field2769 != null && (this.field2750[arg0.field2799] & 0x1) == 0 && (arg0.field2804 < 0 || this.field2737[arg0.field2799][arg0.field2804] != arg0)) {
            if (var7.field2772 > 0) {
                arg0.field2807 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2772 * var9) + 0.5D);
            } else {
                arg0.field2807 += 128;
            }
            while (arg0.field2795 < var7.field2769.length - 2 && arg0.field2807 > (var7.field2769[arg0.field2795 + 2] & 0xFF) << 8) {
                arg0.field2795 += 2;
            }
            if (arg0.field2795 == var7.field2769.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2805.method1145(arg0.field2794, this.method3121(arg0), this.method3045(arg0));
            return false;
        }
        arg0.field2805.method1157(arg0.field2794);
        if (arg1 == null) {
            arg0.field2805.method949(arg3);
        } else {
            arg0.field2805.method954(arg1, arg2, arg3);
        }
        if (arg0.field2805.method1095()) {
            this.field2764.field2783.method940(arg0.field2805);
        }
        arg0.method3130();
        if (arg0.field2807 >= 0) {
            arg0.method3304();
            if (arg0.field2804 > 0 && this.field2737[arg0.field2799][arg0.field2804] == arg0) {
                this.field2737[arg0.field2799][arg0.field2804] = null;
            }
        }
        return true;
    }
}
