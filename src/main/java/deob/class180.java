package deob;

@ObfuscatedName("fr")
public class class180 extends class165 {

    @ObfuscatedName("fr.l")
    public static class180 field2777 = new class180();

    @ObfuscatedName("fr.i")
    public static byte[] field2719 = new byte[1];

    @ObfuscatedName("fr.e")
    public static class180 field2720 = new class180();

    @ObfuscatedName("fr.a")
    public static byte[] field2721 = new byte[1];

    @ObfuscatedName("fr.g")
    public int field2762 = 0;

    @ObfuscatedName("fr.w")
    public int[] field2723;

    @ObfuscatedName("fr.v")
    public int[] field2724;

    @ObfuscatedName("fr.u")
    public int[] field2763;

    @ObfuscatedName("fr.m")
    public int field2726 = 0;

    @ObfuscatedName("fr.b")
    public int[] field2727;

    @ObfuscatedName("fr.f")
    public int[] field2728;

    @ObfuscatedName("fr.d")
    public int[] field2733;

    @ObfuscatedName("fr.x")
    public int[] field2755;

    @ObfuscatedName("fr.z")
    public int[] field2759;

    @ObfuscatedName("fr.o")
    public int[] field2732;

    @ObfuscatedName("fr.c")
    public byte[] field2751;

    @ObfuscatedName("fr.y")
    public byte[] field2734;

    @ObfuscatedName("fr.j")
    public byte[] field2735;

    @ObfuscatedName("fr.s")
    public short[] field2736;

    @ObfuscatedName("fr.p")
    public byte field2774 = 0;

    @ObfuscatedName("fr.ak")
    public int field2772 = 0;

    @ObfuscatedName("fr.ap")
    public int[] field2739;

    @ObfuscatedName("fr.ai")
    public int[] field2783;

    @ObfuscatedName("fr.ae")
    public int[] field2741;

    @ObfuscatedName("fr.ad")
    public int[][] field2742;

    @ObfuscatedName("fr.am")
    public int[][] field2718;

    @ObfuscatedName("fr.ah")
    public boolean field2744 = false;

    @ObfuscatedName("fr.au")
    public int field2745;

    @ObfuscatedName("fr.ac")
    public int field2779;

    @ObfuscatedName("fr.at")
    public int field2737;

    @ObfuscatedName("fr.aq")
    public int field2748;

    @ObfuscatedName("fr.ar")
    public int field2749;

    @ObfuscatedName("fr.ay")
    public static boolean[] field2731 = new boolean[4096];

    @ObfuscatedName("fr.ax")
    public static boolean[] field2752 = new boolean[4096];

    @ObfuscatedName("fr.av")
    public static int[] field2746 = new int[4096];

    @ObfuscatedName("fr.az")
    public static int[] field2754 = new int[4096];

    @ObfuscatedName("fr.al")
    public static int[] field2729 = new int[4096];

    @ObfuscatedName("fr.ag")
    public static int[] field2756 = new int[4096];

    @ObfuscatedName("fr.as")
    public static int[] field2757 = new int[4096];

    @ObfuscatedName("fr.ab")
    public static int[] field2758 = new int[4096];

    @ObfuscatedName("fr.an")
    public static int[] field2760 = new int[1600];

    @ObfuscatedName("fr.aj")
    public static int[][] field2764 = new int[1600][512];

    @ObfuscatedName("fr.ao")
    public static int[] field2730 = new int[12];

    @ObfuscatedName("fr.aw")
    public static int[][] field2722 = new int[12][2000];

    @ObfuscatedName("fr.bk")
    public static int[] field2725 = new int[2000];

    @ObfuscatedName("fr.ba")
    public static int[] field2765 = new int[2000];

    @ObfuscatedName("fr.bj")
    public static int[] field2761 = new int[12];

    @ObfuscatedName("fr.bs")
    public static int[] field2738 = new int[10];

    @ObfuscatedName("fr.bz")
    public static int[] field2768 = new int[10];

    @ObfuscatedName("fr.bl")
    public static int[] field2769 = new int[10];

    @ObfuscatedName("fr.bh")
    public static boolean field2773 = false;

    @ObfuscatedName("fr.be")
    public static int field2753 = 0;

    @ObfuscatedName("fr.bx")
    public static int field2775 = 0;

    @ObfuscatedName("fr.bd")
    public static int field2776 = 0;

    @ObfuscatedName("fr.bo")
    public static int[] field2747 = new int[1000];

    @ObfuscatedName("fr.bi")
    public static int[] field2778 = class172.field2543;

    @ObfuscatedName("fr.bu")
    public static int[] field2743 = class172.field2544;

    @ObfuscatedName("fr.bt")
    public static int[] field2780 = class172.field2539;

    @ObfuscatedName("fr.br")
    public static int[] field2781 = class172.field2542;

    public class180() {
    }

    public class180(class180[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field2762 = 0;
        this.field2726 = 0;
        this.field2772 = 0;
        this.field2774 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class180 var8 = arg0[var7];
            if (var8 != null) {
                this.field2762 += var8.field2762;
                this.field2726 += var8.field2726;
                this.field2772 += var8.field2772;
                if (var8.field2751 == null) {
                    if (this.field2774 == -1) {
                        this.field2774 = var8.field2774;
                    }
                    if (this.field2774 != var8.field2774) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field2734 != null;
                var5 |= var8.field2736 != null;
                var6 |= var8.field2735 != null;
            }
        }
        this.field2723 = new int[this.field2762];
        this.field2724 = new int[this.field2762];
        this.field2763 = new int[this.field2762];
        this.field2727 = new int[this.field2726];
        this.field2728 = new int[this.field2726];
        this.field2733 = new int[this.field2726];
        this.field2755 = new int[this.field2726];
        this.field2759 = new int[this.field2726];
        this.field2732 = new int[this.field2726];
        if (var3) {
            this.field2751 = new byte[this.field2726];
        }
        if (var4) {
            this.field2734 = new byte[this.field2726];
        }
        if (var5) {
            this.field2736 = new short[this.field2726];
        }
        if (var6) {
            this.field2735 = new byte[this.field2726];
        }
        if (this.field2772 > 0) {
            this.field2739 = new int[this.field2772];
            this.field2783 = new int[this.field2772];
            this.field2741 = new int[this.field2772];
        }
        this.field2762 = 0;
        this.field2726 = 0;
        this.field2772 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class180 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field2726; var11++) {
                    this.field2727[this.field2726] = var10.field2727[var11] + this.field2762;
                    this.field2728[this.field2726] = var10.field2728[var11] + this.field2762;
                    this.field2733[this.field2726] = var10.field2733[var11] + this.field2762;
                    this.field2755[this.field2726] = var10.field2755[var11];
                    this.field2759[this.field2726] = var10.field2759[var11];
                    this.field2732[this.field2726] = var10.field2732[var11];
                    if (var3) {
                        if (var10.field2751 == null) {
                            this.field2751[this.field2726] = var10.field2774;
                        } else {
                            this.field2751[this.field2726] = var10.field2751[var11];
                        }
                    }
                    if (var4 && var10.field2734 != null) {
                        this.field2734[this.field2726] = var10.field2734[var11];
                    }
                    if (var5) {
                        if (var10.field2736 == null) {
                            this.field2736[this.field2726] = -1;
                        } else {
                            this.field2736[this.field2726] = var10.field2736[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field2735 == null || var10.field2735[var11] == -1) {
                            this.field2735[this.field2726] = -1;
                        } else {
                            this.field2735[this.field2726] = (byte) (var10.field2735[var11] + this.field2772);
                        }
                    }
                    this.field2726++;
                }
                for (int var12 = 0; var12 < var10.field2772; var12++) {
                    this.field2739[this.field2772] = var10.field2739[var12] + this.field2762;
                    this.field2783[this.field2772] = var10.field2783[var12] + this.field2762;
                    this.field2741[this.field2772] = var10.field2741[var12] + this.field2762;
                    this.field2772++;
                }
                for (int var13 = 0; var13 < var10.field2762; var13++) {
                    this.field2723[this.field2762] = var10.field2723[var13];
                    this.field2724[this.field2762] = var10.field2724[var13];
                    this.field2763[this.field2762] = var10.field2763[var13];
                    this.field2762++;
                }
            }
        }
    }

    @ObfuscatedName("fr.w([[IIIIZI)Lfr;")
    public class180 method3027(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2977();
        int var7 = arg1 - this.field2737;
        int var8 = this.field2737 + arg1;
        int var9 = arg3 - this.field2737;
        int var10 = this.field2737 + arg3;
        if (var7 < 0 || var8 + 128 >> 7 >= arg0.length || var9 < 0 || var10 + 128 >> 7 >= arg0[0].length) {
            return this;
        }
        int var11 = var7 >> 7;
        int var12 = var8 + 127 >> 7;
        int var13 = var9 >> 7;
        int var14 = var10 + 127 >> 7;
        if (arg0[var11][var13] == arg2 && arg0[var12][var13] == arg2 && arg0[var11][var14] == arg2 && arg0[var12][var14] == arg2) {
            return this;
        }
        class180 var15;
        if (arg4) {
            var15 = new class180();
            var15.field2762 = this.field2762;
            var15.field2726 = this.field2726;
            var15.field2772 = this.field2772;
            var15.field2723 = this.field2723;
            var15.field2763 = this.field2763;
            var15.field2727 = this.field2727;
            var15.field2728 = this.field2728;
            var15.field2733 = this.field2733;
            var15.field2755 = this.field2755;
            var15.field2759 = this.field2759;
            var15.field2732 = this.field2732;
            var15.field2751 = this.field2751;
            var15.field2734 = this.field2734;
            var15.field2735 = this.field2735;
            var15.field2736 = this.field2736;
            var15.field2774 = this.field2774;
            var15.field2739 = this.field2739;
            var15.field2783 = this.field2783;
            var15.field2741 = this.field2741;
            var15.field2742 = this.field2742;
            var15.field2718 = this.field2718;
            var15.field2744 = this.field2744;
            var15.field2724 = new int[var15.field2762];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field2762; var16++) {
                int var17 = this.field2723[var16] + arg1;
                int var18 = this.field2763[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field2724[var16] = this.field2724[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field2762; var26++) {
                int var27 = (-this.field2724[var26] << 16) / this.field2484;
                if (var27 < arg5) {
                    int var28 = this.field2723[var26] + arg1;
                    int var29 = this.field2763[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field2724[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field2724[var26];
                }
            }
        }
        var15.field2745 = 0;
        return var15;
    }

    @ObfuscatedName("fr.v(Z)Lfr;")
    public class180 method3010(boolean arg0) {
        if (!arg0 && field2719.length < this.field2726) {
            field2719 = new byte[this.field2726 + 100];
        }
        return this.method3022(arg0, field2777, field2719);
    }

    @ObfuscatedName("fr.u(Z)Lfr;")
    public class180 method2975(boolean arg0) {
        if (!arg0 && field2721.length < this.field2726) {
            field2721 = new byte[this.field2726 + 100];
        }
        return this.method3022(arg0, field2720, field2721);
    }

    @ObfuscatedName("fr.m(ZLfr;[B)Lfr;")
    public class180 method3022(boolean arg0, class180 arg1, byte[] arg2) {
        arg1.field2762 = this.field2762;
        arg1.field2726 = this.field2726;
        arg1.field2772 = this.field2772;
        if (arg1.field2723 == null || arg1.field2723.length < this.field2762) {
            arg1.field2723 = new int[this.field2762 + 100];
            arg1.field2724 = new int[this.field2762 + 100];
            arg1.field2763 = new int[this.field2762 + 100];
        }
        for (int var4 = 0; var4 < this.field2762; var4++) {
            arg1.field2723[var4] = this.field2723[var4];
            arg1.field2724[var4] = this.field2724[var4];
            arg1.field2763[var4] = this.field2763[var4];
        }
        if (arg0) {
            arg1.field2734 = this.field2734;
        } else {
            arg1.field2734 = arg2;
            if (this.field2734 == null) {
                for (int var5 = 0; var5 < this.field2726; var5++) {
                    arg1.field2734[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field2726; var6++) {
                    arg1.field2734[var6] = this.field2734[var6];
                }
            }
        }
        arg1.field2727 = this.field2727;
        arg1.field2728 = this.field2728;
        arg1.field2733 = this.field2733;
        arg1.field2755 = this.field2755;
        arg1.field2759 = this.field2759;
        arg1.field2732 = this.field2732;
        arg1.field2751 = this.field2751;
        arg1.field2735 = this.field2735;
        arg1.field2736 = this.field2736;
        arg1.field2774 = this.field2774;
        arg1.field2739 = this.field2739;
        arg1.field2783 = this.field2783;
        arg1.field2741 = this.field2741;
        arg1.field2742 = this.field2742;
        arg1.field2718 = this.field2718;
        arg1.field2744 = this.field2744;
        arg1.field2745 = 0;
        return arg1;
    }

    @ObfuscatedName("fr.b()V")
    public void method2977() {
        if (this.field2745 == 1) {
            return;
        }
        this.field2745 = 1;
        this.field2484 = 0;
        this.field2779 = 0;
        this.field2737 = 0;
        for (int var1 = 0; var1 < this.field2762; var1++) {
            int var2 = this.field2723[var1];
            int var3 = this.field2724[var1];
            int var4 = this.field2763[var1];
            if (-var3 > this.field2484) {
                this.field2484 = -var3;
            }
            if (var3 > this.field2779) {
                this.field2779 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field2737) {
                this.field2737 = var5;
            }
        }
        this.field2737 = (int) (Math.sqrt((double) this.field2737) + 0.99D);
        this.field2749 = (int) (Math.sqrt((double) (this.field2484 * this.field2484 + this.field2737 * this.field2737)) + 0.99D);
        this.field2748 = this.field2749 + (int) (Math.sqrt((double) (this.field2779 * this.field2779 + this.field2737 * this.field2737)) + 0.99D);
    }

    @ObfuscatedName("fr.f()V")
    public void method2978() {
        if (this.field2745 == 2) {
            return;
        }
        this.field2745 = 2;
        this.field2737 = 0;
        for (int var1 = 0; var1 < this.field2762; var1++) {
            int var2 = this.field2723[var1];
            int var3 = this.field2724[var1];
            int var4 = this.field2763[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field2737) {
                this.field2737 = var5;
            }
        }
        this.field2737 = (int) (Math.sqrt((double) this.field2737) + 0.99D);
        this.field2749 = this.field2737;
        this.field2748 = this.field2737 + this.field2737;
    }

    @ObfuscatedName("fr.d()I")
    public int method2973() {
        this.method2977();
        return this.field2737;
    }

    @ObfuscatedName("fr.x(Lfb;I)V")
    public void method2976(class166 arg0, int arg1) {
        if (this.field2742 == null || arg1 == -1) {
            return;
        }
        class46 var3 = arg0.field2488[arg1];
        class134 var4 = var3.field646;
        Statics.field2770 = 0;
        Statics.field2771 = 0;
        Statics.field2740 = 0;
        for (int var5 = 0; var5 < var3.field643; var5++) {
            int var6 = var3.field647[var5];
            this.method2982(var4.field1719[var6], var4.field1720[var6], var3.field649[var5], var3.field650[var5], var3.field651[var5]);
        }
        this.field2745 = 0;
    }

    @ObfuscatedName("fr.z(Lfb;ILfb;I[I)V")
    public void method2981(class166 arg0, int arg1, class166 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2976(arg0, arg1);
            return;
        }
        class46 var6 = arg0.field2488[arg1];
        class46 var7 = arg2.field2488[arg3];
        class134 var8 = var6.field646;
        Statics.field2770 = 0;
        Statics.field2771 = 0;
        Statics.field2740 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field643; var11++) {
            int var12 = var6.field647[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1719[var12] == 0) {
                this.method2982(var8.field1719[var12], var8.field1720[var12], var6.field649[var11], var6.field650[var11], var6.field651[var11]);
            }
        }
        Statics.field2770 = 0;
        Statics.field2771 = 0;
        Statics.field2740 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field643; var15++) {
            int var16 = var7.field647[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1719[var16] == 0) {
                this.method2982(var8.field1719[var16], var8.field1720[var16], var7.field649[var15], var7.field650[var15], var7.field651[var15]);
            }
        }
        this.field2745 = 0;
    }

    @ObfuscatedName("fr.o(I[IIII)V")
    public void method2982(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field2770 = 0;
            Statics.field2771 = 0;
            Statics.field2740 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field2742.length) {
                    int[] var10 = this.field2742[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field2770 += this.field2723[var12];
                        Statics.field2771 += this.field2724[var12];
                        Statics.field2740 += this.field2763[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field2770 = Statics.field2770 / var7 + arg2;
                Statics.field2771 = Statics.field2771 / var7 + arg3;
                Statics.field2740 = Statics.field2740 / var7 + arg4;
            } else {
                Statics.field2770 = arg2;
                Statics.field2771 = arg3;
                Statics.field2740 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field2742.length) {
                    int[] var15 = this.field2742[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field2723[var17] += arg2;
                        this.field2724[var17] += arg3;
                        this.field2763[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field2742.length) {
                    int[] var20 = this.field2742[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field2723[var22] -= Statics.field2770;
                        this.field2724[var22] -= Statics.field2771;
                        this.field2763[var22] -= Statics.field2740;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field2778[var25];
                            int var27 = field2743[var25];
                            int var28 = this.field2724[var22] * var26 + this.field2723[var22] * var27 >> 16;
                            this.field2724[var22] = this.field2724[var22] * var27 - this.field2723[var22] * var26 >> 16;
                            this.field2723[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field2778[var23];
                            int var30 = field2743[var23];
                            int var31 = this.field2724[var22] * var30 - this.field2763[var22] * var29 >> 16;
                            this.field2763[var22] = this.field2763[var22] * var30 + this.field2724[var22] * var29 >> 16;
                            this.field2724[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field2778[var24];
                            int var33 = field2743[var24];
                            int var34 = this.field2763[var22] * var32 + this.field2723[var22] * var33 >> 16;
                            this.field2763[var22] = this.field2763[var22] * var33 - this.field2723[var22] * var32 >> 16;
                            this.field2723[var22] = var34;
                        }
                        this.field2723[var22] += Statics.field2770;
                        this.field2724[var22] += Statics.field2771;
                        this.field2763[var22] += Statics.field2740;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field2742.length) {
                    int[] var37 = this.field2742[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field2723[var39] -= Statics.field2770;
                        this.field2724[var39] -= Statics.field2771;
                        this.field2763[var39] -= Statics.field2740;
                        this.field2723[var39] = this.field2723[var39] * arg2 / 128;
                        this.field2724[var39] = this.field2724[var39] * arg3 / 128;
                        this.field2763[var39] = this.field2763[var39] * arg4 / 128;
                        this.field2723[var39] += Statics.field2770;
                        this.field2724[var39] += Statics.field2771;
                        this.field2763[var39] += Statics.field2740;
                    }
                }
            }
        } else if (arg0 == 5 && this.field2718 != null && this.field2734 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field2718.length) {
                    int[] var42 = this.field2718[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field2734[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field2734[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("fr.c()V")
    public void method2992() {
        for (int var1 = 0; var1 < this.field2762; var1++) {
            int var2 = this.field2723[var1];
            this.field2723[var1] = this.field2763[var1];
            this.field2763[var1] = -var2;
        }
        this.field2745 = 0;
    }

    @ObfuscatedName("fr.y()V")
    public void method2984() {
        for (int var1 = 0; var1 < this.field2762; var1++) {
            this.field2723[var1] = -this.field2723[var1];
            this.field2763[var1] = -this.field2763[var1];
        }
        this.field2745 = 0;
    }

    @ObfuscatedName("fr.j()V")
    public void method2985() {
        for (int var1 = 0; var1 < this.field2762; var1++) {
            int var2 = this.field2763[var1];
            this.field2763[var1] = this.field2723[var1];
            this.field2723[var1] = -var2;
        }
        this.field2745 = 0;
    }

    @ObfuscatedName("fr.s(I)V")
    public void method3004(int arg0) {
        int var2 = field2778[arg0];
        int var3 = field2743[arg0];
        for (int var4 = 0; var4 < this.field2762; var4++) {
            int var5 = this.field2724[var4] * var3 - this.field2763[var4] * var2 >> 16;
            this.field2763[var4] = this.field2763[var4] * var3 + this.field2724[var4] * var2 >> 16;
            this.field2724[var4] = var5;
        }
        this.field2745 = 0;
    }

    @ObfuscatedName("fr.p(III)V")
    public void method2987(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2762; var4++) {
            this.field2723[var4] += arg0;
            this.field2724[var4] += arg1;
            this.field2763[var4] += arg2;
        }
        this.field2745 = 0;
    }

    @ObfuscatedName("fr.ak(III)V")
    public void method2974(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2762; var4++) {
            this.field2723[var4] = this.field2723[var4] * arg0 / 128;
            this.field2724[var4] = this.field2724[var4] * arg1 / 128;
            this.field2763[var4] = this.field2763[var4] * arg2 / 128;
        }
        this.field2745 = 0;
    }

    @ObfuscatedName("fr.ap(IIIIIII)V")
    public final void method2986(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2760[0] = -1;
        if (this.field2745 != 2 && this.field2745 != 1) {
            this.method2978();
        }
        int var8 = Statics.field2537;
        int var9 = Statics.field2531;
        int var10 = field2778[arg0];
        int var11 = field2743[arg0];
        int var12 = field2778[arg1];
        int var13 = field2743[arg1];
        int var14 = field2778[arg2];
        int var15 = field2743[arg2];
        int var16 = field2778[arg3];
        int var17 = field2743[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field2762; var19++) {
            int var20 = this.field2723[var19];
            int var21 = this.field2724[var19];
            int var22 = this.field2763[var19];
            if (arg2 != 0) {
                int var23 = var14 * var21 + var15 * var20 >> 16;
                var21 = var15 * var21 - var14 * var20 >> 16;
                var20 = var23;
            }
            if (arg0 != 0) {
                int var24 = var11 * var21 - var10 * var22 >> 16;
                var22 = var10 * var21 + var11 * var22 >> 16;
                var21 = var24;
            }
            if (arg1 != 0) {
                int var25 = var12 * var22 + var13 * var20 >> 16;
                var22 = var13 * var22 - var12 * var20 >> 16;
                var20 = var25;
            }
            int var26 = arg4 + var20;
            int var27 = arg5 + var21;
            int var28 = arg6 + var22;
            int var29 = var17 * var27 - var16 * var28 >> 16;
            int var30 = var16 * var27 + var17 * var28 >> 16;
            field2729[var19] = var30 - var18;
            field2746[var19] = (var26 << 9) / var30 + var8;
            field2754[var19] = (var29 << 9) / var30 + var9;
            if (this.field2772 > 0) {
                field2756[var19] = var26;
                field2757[var19] = var29;
                field2758[var19] = var30;
            }
        }
        try {
            this.method2991(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("fr.ai(IIIIIIII)V")
    public final void method2990(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2760[0] = -1;
        if (this.field2745 != 2 && this.field2745 != 1) {
            this.method2978();
        }
        int var9 = Statics.field2537;
        int var10 = Statics.field2531;
        int var11 = field2778[arg0];
        int var12 = field2743[arg0];
        int var13 = field2778[arg1];
        int var14 = field2743[arg1];
        int var15 = field2778[arg2];
        int var16 = field2743[arg2];
        int var17 = field2778[arg3];
        int var18 = field2743[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field2762; var20++) {
            int var21 = this.field2723[var20];
            int var22 = this.field2724[var20];
            int var23 = this.field2763[var20];
            if (arg2 != 0) {
                int var24 = var15 * var22 + var16 * var21 >> 16;
                var22 = var16 * var22 - var15 * var21 >> 16;
                var21 = var24;
            }
            if (arg0 != 0) {
                int var25 = var12 * var22 - var11 * var23 >> 16;
                var23 = var11 * var22 + var12 * var23 >> 16;
                var22 = var25;
            }
            if (arg1 != 0) {
                int var26 = var13 * var23 + var14 * var21 >> 16;
                var23 = var14 * var23 - var13 * var21 >> 16;
                var21 = var26;
            }
            int var27 = arg4 + var21;
            int var28 = arg5 + var22;
            int var29 = arg6 + var23;
            int var30 = var18 * var28 - var17 * var29 >> 16;
            int var31 = var17 * var28 + var18 * var29 >> 16;
            field2729[var20] = var31 - var19;
            field2746[var20] = (var27 << 9) / arg7 + var9;
            field2754[var20] = (var30 << 9) / arg7 + var10;
            if (this.field2772 > 0) {
                field2756[var20] = var27;
                field2757[var20] = var30;
                field2758[var20] = var31;
            }
        }
        try {
            this.method2991(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("fr.i(IIIIIIIII)V")
    public void method2627(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2760[0] = -1;
        if (this.field2745 != 1) {
            this.method2977();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field2737 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = var14 - this.field2737 << 9;
        if (var15 / var13 >= Statics.field2535) {
            return;
        }
        int var16 = this.field2737 + var14 << 9;
        if (var16 / var13 <= Statics.field2534) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field2737 * arg1 >> 16;
        int var19 = var17 + var18 << 9;
        if (var19 / var13 <= Statics.field2536) {
            return;
        }
        int var20 = (this.field2484 * arg2 >> 16) + var18;
        int var21 = var17 - var20 << 9;
        if (var21 / var13 >= Statics.field2520) {
            return;
        }
        int var22 = (this.field2484 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field2772 > 0;
        boolean var26 = false;
        if (arg8 > 0 && field2773) {
            int var27 = var11 - var12;
            if (var27 <= 50) {
                var27 = 50;
            }
            int var28;
            int var29;
            if (var14 > 0) {
                var28 = var15 / var13;
                var29 = var16 / var27;
            } else {
                var29 = var16 / var13;
                var28 = var15 / var27;
            }
            int var30;
            int var31;
            if (var17 > 0) {
                var30 = var21 / var13;
                var31 = var19 / var27;
            } else {
                var31 = var19 / var13;
                var30 = var21 / var27;
            }
            int var32 = field2753 - Statics.field2537;
            int var33 = field2775 - Statics.field2531;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field2744) {
                    field2747[field2776++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field2537;
        int var35 = Statics.field2531;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field2778[arg0];
            var37 = field2743[arg0];
        }
        for (int var38 = 0; var38 < this.field2762; var38++) {
            int var39 = this.field2723[var38];
            int var40 = this.field2724[var38];
            int var41 = this.field2763[var38];
            if (arg0 != 0) {
                int var42 = var36 * var41 + var37 * var39 >> 16;
                var41 = var37 * var41 - var36 * var39 >> 16;
                var39 = var42;
            }
            int var43 = arg5 + var39;
            int var44 = arg6 + var40;
            int var45 = arg7 + var41;
            int var46 = arg3 * var45 + arg4 * var43 >> 16;
            int var47 = arg4 * var45 - arg3 * var43 >> 16;
            int var49 = arg2 * var44 - arg1 * var47 >> 16;
            int var50 = arg1 * var44 + arg2 * var47 >> 16;
            field2729[var38] = var50 - var11;
            if (var50 >= 50) {
                field2746[var38] = (var46 << 9) / var50 + var34;
                field2754[var38] = (var49 << 9) / var50 + var35;
            } else {
                field2746[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field2756[var38] = var46;
                field2757[var38] = var49;
                field2758[var38] = var50;
            }
        }
        try {
            this.method2991(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("fr.ae(ZZI)V")
    public final void method2991(boolean arg0, boolean arg1, int arg2) {
        if (this.field2748 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field2748; var4++) {
            field2760[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field2726; var5++) {
            if (this.field2732[var5] != -2) {
                int var6 = this.field2727[var5];
                int var7 = this.field2728[var5];
                int var8 = this.field2733[var5];
                int var9 = field2746[var6];
                int var10 = field2746[var7];
                int var11 = field2746[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field2756[var6];
                    int var13 = field2756[var7];
                    int var14 = field2756[var8];
                    int var15 = field2757[var6];
                    int var16 = field2757[var7];
                    int var17 = field2757[var8];
                    int var18 = field2758[var6];
                    int var19 = field2758[var7];
                    int var20 = field2758[var8];
                    int var21 = var12 - var13;
                    int var22 = var14 - var13;
                    int var23 = var15 - var16;
                    int var24 = var17 - var16;
                    int var25 = var18 - var19;
                    int var26 = var20 - var19;
                    int var27 = var23 * var26 - var24 * var25;
                    int var28 = var22 * var25 - var21 * var26;
                    int var29 = var21 * var24 - var22 * var23;
                    if (var19 * var29 + var13 * var27 + var16 * var28 > 0) {
                        field2752[var5] = true;
                        int var30 = (field2729[var6] + field2729[var7] + field2729[var8]) / 3 + this.field2749;
                        field2764[var30][field2760[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method2994(field2753, field2775, field2754[var6], field2754[var7], field2754[var8], var9, var10, var11)) {
                        field2747[field2776++] = arg2;
                        arg1 = false;
                    }
                    if ((field2754[var8] - field2754[var7]) * (var9 - var10) - (field2754[var6] - field2754[var7]) * (var11 - var10) > 0) {
                        field2752[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field2532 && var10 <= Statics.field2532 && var11 <= Statics.field2532) {
                            field2731[var5] = false;
                        } else {
                            field2731[var5] = true;
                        }
                        int var31 = (field2729[var6] + field2729[var7] + field2729[var8]) / 3 + this.field2749;
                        field2764[var31][field2760[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field2751 == null) {
            for (int var32 = this.field2748 - 1; var32 >= 0; var32--) {
                int var33 = field2760[var32];
                if (var33 > 0) {
                    int[] var34 = field2764[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method2979(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field2730[var36] = 0;
            field2761[var36] = 0;
        }
        for (int var37 = this.field2748 - 1; var37 >= 0; var37--) {
            int var38 = field2760[var37];
            if (var38 > 0) {
                int[] var39 = field2764[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field2751[var41];
                    int var43 = field2730[var42]++;
                    field2722[var42][var43] = var41;
                    if (var42 < 10) {
                        field2761[var42] += var37;
                    } else if (var42 == 10) {
                        field2725[var43] = var37;
                    } else {
                        field2765[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field2730[1] > 0 || field2730[2] > 0) {
            var44 = (field2761[1] + field2761[2]) / (field2730[1] + field2730[2]);
        }
        int var45 = 0;
        if (field2730[3] > 0 || field2730[4] > 0) {
            var45 = (field2761[3] + field2761[4]) / (field2730[3] + field2730[4]);
        }
        int var46 = 0;
        if (field2730[6] > 0 || field2730[8] > 0) {
            var46 = (field2761[6] + field2761[8]) / (field2730[6] + field2730[8]);
        }
        int var47 = 0;
        int var48 = field2730[10];
        int[] var49 = field2722[10];
        int[] var50 = field2725;
        if (var47 == var48) {
            var47 = 0;
            var48 = field2730[11];
            var49 = field2722[11];
            var50 = field2765;
        }
        int var51;
        if (var47 < var48) {
            var51 = var50[var47];
        } else {
            var51 = -1000;
        }
        for (int var52 = 0; var52 < 10; var52++) {
            while (var52 == 0 && var51 > var44) {
                this.method2979(var49[var47++]);
                if (var47 == var48 && field2722[11] != var49) {
                    var47 = 0;
                    var48 = field2730[11];
                    var49 = field2722[11];
                    var50 = field2765;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method2979(var49[var47++]);
                if (var47 == var48 && field2722[11] != var49) {
                    var47 = 0;
                    var48 = field2730[11];
                    var49 = field2722[11];
                    var50 = field2765;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method2979(var49[var47++]);
                if (var47 == var48 && field2722[11] != var49) {
                    var47 = 0;
                    var48 = field2730[11];
                    var49 = field2722[11];
                    var50 = field2765;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field2730[var52];
            int[] var54 = field2722[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method2979(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method2979(var49[var47++]);
            if (var47 == var48 && field2722[11] != var49) {
                var47 = 0;
                var49 = field2722[11];
                var48 = field2730[11];
                var50 = field2765;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("fr.ad(I)V")
    public final void method2979(int arg0) {
        if (field2752[arg0]) {
            this.method2993(arg0);
            return;
        }
        int var2 = this.field2727[arg0];
        int var3 = this.field2728[arg0];
        int var4 = this.field2733[arg0];
        class172.field2526 = field2731[arg0];
        if (this.field2734 == null) {
            class172.field2524 = 0;
        } else {
            class172.field2524 = this.field2734[arg0] & 0xFF;
        }
        if (this.field2736 != null && this.field2736[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field2735 == null || this.field2735[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field2735[arg0] & 0xFF;
                var6 = this.field2739[var5];
                var7 = this.field2783[var5];
                var8 = this.field2741[var5];
            }
            if (this.field2732[arg0] == -1) {
                class172.method2793(field2754[var2], field2754[var3], field2754[var4], field2746[var2], field2746[var3], field2746[var4], this.field2755[arg0], this.field2755[arg0], this.field2755[arg0], field2756[var6], field2756[var7], field2756[var8], field2757[var6], field2757[var7], field2757[var8], field2758[var6], field2758[var7], field2758[var8], this.field2736[arg0]);
            } else {
                class172.method2793(field2754[var2], field2754[var3], field2754[var4], field2746[var2], field2746[var3], field2746[var4], this.field2755[arg0], this.field2759[arg0], this.field2732[arg0], field2756[var6], field2756[var7], field2756[var8], field2757[var6], field2757[var7], field2757[var8], field2758[var6], field2758[var7], field2758[var8], this.field2736[arg0]);
            }
        } else if (this.field2732[arg0] == -1) {
            class172.method2759(field2754[var2], field2754[var3], field2754[var4], field2746[var2], field2746[var3], field2746[var4], field2780[this.field2755[arg0]]);
        } else {
            class172.method2761(field2754[var2], field2754[var3], field2754[var4], field2746[var2], field2746[var3], field2746[var4], this.field2755[arg0], this.field2759[arg0], this.field2732[arg0]);
        }
    }

    @ObfuscatedName("fr.am(I)V")
    public final void method2993(int arg0) {
        int var2 = Statics.field2537;
        int var3 = Statics.field2531;
        int var4 = 0;
        int var5 = this.field2727[arg0];
        int var6 = this.field2728[arg0];
        int var7 = this.field2733[arg0];
        int var8 = field2758[var5];
        int var9 = field2758[var6];
        int var10 = field2758[var7];
        if (this.field2734 == null) {
            class172.field2524 = 0;
        } else {
            class172.field2524 = this.field2734[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field2738[var4] = field2746[var5];
            field2768[var4] = field2754[var5];
            field2769[var4++] = this.field2755[arg0];
        } else {
            int var11 = field2756[var5];
            int var12 = field2757[var5];
            int var13 = this.field2755[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field2781[var10 - var8];
                field2738[var4] = (((field2756[var7] - var11) * var14 >> 16) + var11 << 9) / 50 + var2;
                field2768[var4] = (((field2757[var7] - var12) * var14 >> 16) + var12 << 9) / 50 + var3;
                field2769[var4++] = ((this.field2732[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field2781[var9 - var8];
                field2738[var4] = (((field2756[var6] - var11) * var15 >> 16) + var11 << 9) / 50 + var2;
                field2768[var4] = (((field2757[var6] - var12) * var15 >> 16) + var12 << 9) / 50 + var3;
                field2769[var4++] = ((this.field2759[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field2738[var4] = field2746[var6];
            field2768[var4] = field2754[var6];
            field2769[var4++] = this.field2759[arg0];
        } else {
            int var16 = field2756[var6];
            int var17 = field2757[var6];
            int var18 = this.field2759[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field2781[var8 - var9];
                field2738[var4] = (((field2756[var5] - var16) * var19 >> 16) + var16 << 9) / 50 + var2;
                field2768[var4] = (((field2757[var5] - var17) * var19 >> 16) + var17 << 9) / 50 + var3;
                field2769[var4++] = ((this.field2755[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field2781[var10 - var9];
                field2738[var4] = (((field2756[var7] - var16) * var20 >> 16) + var16 << 9) / 50 + var2;
                field2768[var4] = (((field2757[var7] - var17) * var20 >> 16) + var17 << 9) / 50 + var3;
                field2769[var4++] = ((this.field2732[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field2738[var4] = field2746[var7];
            field2768[var4] = field2754[var7];
            field2769[var4++] = this.field2732[arg0];
        } else {
            int var21 = field2756[var7];
            int var22 = field2757[var7];
            int var23 = this.field2732[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field2781[var9 - var10];
                field2738[var4] = (((field2756[var6] - var21) * var24 >> 16) + var21 << 9) / 50 + var2;
                field2768[var4] = (((field2757[var6] - var22) * var24 >> 16) + var22 << 9) / 50 + var3;
                field2769[var4++] = ((this.field2759[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field2781[var8 - var10];
                field2738[var4] = (((field2756[var5] - var21) * var25 >> 16) + var21 << 9) / 50 + var2;
                field2768[var4] = (((field2757[var5] - var22) * var25 >> 16) + var22 << 9) / 50 + var3;
                field2769[var4++] = ((this.field2755[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field2738[0];
        int var27 = field2738[1];
        int var28 = field2738[2];
        int var29 = field2768[0];
        int var30 = field2768[1];
        int var31 = field2768[2];
        class172.field2526 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field2532 || var27 > Statics.field2532 || var28 > Statics.field2532) {
                class172.field2526 = true;
            }
            if (this.field2736 != null && this.field2736[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field2735 == null || this.field2735[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field2735[arg0] & 0xFF;
                    var33 = this.field2739[var32];
                    var34 = this.field2783[var32];
                    var35 = this.field2741[var32];
                }
                if (this.field2732[arg0] == -1) {
                    class172.method2793(var29, var30, var31, var26, var27, var28, this.field2755[arg0], this.field2755[arg0], this.field2755[arg0], field2756[var33], field2756[var34], field2756[var35], field2757[var33], field2757[var34], field2757[var35], field2758[var33], field2758[var34], field2758[var35], this.field2736[arg0]);
                } else {
                    class172.method2793(var29, var30, var31, var26, var27, var28, field2769[0], field2769[1], field2769[2], field2756[var33], field2756[var34], field2756[var35], field2757[var33], field2757[var34], field2757[var35], field2758[var33], field2758[var34], field2758[var35], this.field2736[arg0]);
                }
            } else if (this.field2732[arg0] == -1) {
                class172.method2759(var29, var30, var31, var26, var27, var28, field2780[this.field2755[arg0]]);
            } else {
                class172.method2761(var29, var30, var31, var26, var27, var28, field2769[0], field2769[1], field2769[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field2532 || var27 > Statics.field2532 || var28 > Statics.field2532 || field2738[3] < 0 || field2738[3] > Statics.field2532) {
            class172.field2526 = true;
        }
        if (this.field2736 != null && this.field2736[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field2735 == null || this.field2735[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field2735[arg0] & 0xFF;
                var37 = this.field2739[var36];
                var38 = this.field2783[var36];
                var39 = this.field2741[var36];
            }
            short var40 = this.field2736[arg0];
            if (this.field2732[arg0] == -1) {
                class172.method2793(var29, var30, var31, var26, var27, var28, this.field2755[arg0], this.field2755[arg0], this.field2755[arg0], field2756[var37], field2756[var38], field2756[var39], field2757[var37], field2757[var38], field2757[var39], field2758[var37], field2758[var38], field2758[var39], var40);
                class172.method2793(var29, var31, field2768[3], var26, var28, field2738[3], this.field2755[arg0], this.field2755[arg0], this.field2755[arg0], field2756[var37], field2756[var38], field2756[var39], field2757[var37], field2757[var38], field2757[var39], field2758[var37], field2758[var38], field2758[var39], var40);
            } else {
                class172.method2793(var29, var30, var31, var26, var27, var28, field2769[0], field2769[1], field2769[2], field2756[var37], field2756[var38], field2756[var39], field2757[var37], field2757[var38], field2757[var39], field2758[var37], field2758[var38], field2758[var39], var40);
                class172.method2793(var29, var31, field2768[3], var26, var28, field2738[3], field2769[0], field2769[2], field2769[3], field2756[var37], field2756[var38], field2756[var39], field2757[var37], field2757[var38], field2757[var39], field2758[var37], field2758[var38], field2758[var39], var40);
            }
        } else if (this.field2732[arg0] == -1) {
            int var41 = field2780[this.field2755[arg0]];
            class172.method2759(var29, var30, var31, var26, var27, var28, var41);
            class172.method2759(var29, var31, field2768[3], var26, var28, field2738[3], var41);
        } else {
            class172.method2761(var29, var30, var31, var26, var27, var28, field2769[0], field2769[1], field2769[2]);
            class172.method2761(var29, var31, field2768[3], var26, var28, field2738[3], field2769[0], field2769[2], field2769[3]);
        }
    }

    @ObfuscatedName("fr.ah(IIIIIIII)Z")
    public final boolean method2994(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else {
            return arg0 <= arg5 || arg0 <= arg6 || arg0 <= arg7;
        }
    }
}
