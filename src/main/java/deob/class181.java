package deob;

@ObfuscatedName("fb")
public class class181 extends class166 {

    @ObfuscatedName("fb.r")
    public static class181 field2740 = new class181();

    @ObfuscatedName("fb.d")
    public static byte[] field2720 = new byte[1];

    @ObfuscatedName("fb.k")
    public static class181 field2721 = new class181();

    @ObfuscatedName("fb.u")
    public static byte[] field2722 = new byte[1];

    @ObfuscatedName("fb.v")
    public int field2723 = 0;

    @ObfuscatedName("fb.f")
    public int[] field2757;

    @ObfuscatedName("fb.s")
    public int[] field2725;

    @ObfuscatedName("fb.j")
    public int[] field2726;

    @ObfuscatedName("fb.e")
    public int field2727 = 0;

    @ObfuscatedName("fb.t")
    public int[] field2728;

    @ObfuscatedName("fb.y")
    public int[] field2778;

    @ObfuscatedName("fb.b")
    public int[] field2730;

    @ObfuscatedName("fb.w")
    public int[] field2738;

    @ObfuscatedName("fb.g")
    public int[] field2751;

    @ObfuscatedName("fb.p")
    public int[] field2741;

    @ObfuscatedName("fb.z")
    public byte[] field2734;

    @ObfuscatedName("fb.n")
    public byte[] field2735;

    @ObfuscatedName("fb.x")
    public byte[] field2736;

    @ObfuscatedName("fb.i")
    public short[] field2737;

    @ObfuscatedName("fb.m")
    public byte field2724 = 0;

    @ObfuscatedName("fb.ai")
    public int field2739 = 0;

    @ObfuscatedName("fb.aa")
    public int[] field2764;

    @ObfuscatedName("fb.af")
    public int[] field2731;

    @ObfuscatedName("fb.ae")
    public int[] field2742;

    @ObfuscatedName("fb.at")
    public int[][] field2719;

    @ObfuscatedName("fb.aj")
    public int[][] field2785;

    @ObfuscatedName("fb.ar")
    public boolean field2777 = false;

    @ObfuscatedName("fb.au")
    public int field2746;

    @ObfuscatedName("fb.an")
    public int field2747;

    @ObfuscatedName("fb.az")
    public int field2779;

    @ObfuscatedName("fb.ac")
    public int field2749;

    @ObfuscatedName("fb.ap")
    public int field2750;

    @ObfuscatedName("fb.ax")
    public static boolean[] field2752 = new boolean[4096];

    @ObfuscatedName("fb.as")
    public static boolean[] field2753 = new boolean[4096];

    @ObfuscatedName("fb.ak")
    public static int[] field2754 = new int[4096];

    @ObfuscatedName("fb.av")
    public static int[] field2755 = new int[4096];

    @ObfuscatedName("fb.ay")
    public static int[] field2756 = new int[4096];

    @ObfuscatedName("fb.ab")
    public static int[] field2774 = new int[4096];

    @ObfuscatedName("fb.am")
    public static int[] field2758 = new int[4096];

    @ObfuscatedName("fb.aw")
    public static int[] field2759 = new int[4096];

    @ObfuscatedName("fb.al")
    public static int[] field2761 = new int[1600];

    @ObfuscatedName("fb.aq")
    public static int[][] field2745 = new int[1600][512];

    @ObfuscatedName("fb.ah")
    public static int[] field2763 = new int[12];

    @ObfuscatedName("fb.ao")
    public static int[][] field2762 = new int[12][2000];

    @ObfuscatedName("fb.bg")
    public static int[] field2765 = new int[2000];

    @ObfuscatedName("fb.be")
    public static int[] field2766 = new int[2000];

    @ObfuscatedName("fb.bi")
    public static int[] field2767 = new int[12];

    @ObfuscatedName("fb.bp")
    public static int[] field2768 = new int[10];

    @ObfuscatedName("fb.bw")
    public static int[] field2769 = new int[10];

    @ObfuscatedName("fb.bu")
    public static int[] field2770 = new int[10];

    @ObfuscatedName("fb.bk")
    public static boolean field2773 = false;

    @ObfuscatedName("fb.bz")
    public static int field2748 = 0;

    @ObfuscatedName("fb.bj")
    public static int field2776 = 0;

    @ObfuscatedName("fb.bt")
    public static int field2732 = 0;

    @ObfuscatedName("fb.by")
    public static int[] field2744 = new int[1000];

    @ObfuscatedName("fb.bs")
    public static int[] field2733 = class173.field2544;

    @ObfuscatedName("fb.bq")
    public static int[] field2780 = class173.field2545;

    @ObfuscatedName("fb.bd")
    public static int[] field2781 = class173.field2521;

    @ObfuscatedName("fb.bx")
    public static int[] field2782 = class173.field2543;

    public class181() {
    }

    public class181(class181[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field2723 = 0;
        this.field2727 = 0;
        this.field2739 = 0;
        this.field2724 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class181 var8 = arg0[var7];
            if (var8 != null) {
                this.field2723 += var8.field2723;
                this.field2727 += var8.field2727;
                this.field2739 += var8.field2739;
                if (var8.field2734 == null) {
                    if (this.field2724 == -1) {
                        this.field2724 = var8.field2724;
                    }
                    if (this.field2724 != var8.field2724) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field2735 != null;
                var5 |= var8.field2737 != null;
                var6 |= var8.field2736 != null;
            }
        }
        this.field2757 = new int[this.field2723];
        this.field2725 = new int[this.field2723];
        this.field2726 = new int[this.field2723];
        this.field2728 = new int[this.field2727];
        this.field2778 = new int[this.field2727];
        this.field2730 = new int[this.field2727];
        this.field2738 = new int[this.field2727];
        this.field2751 = new int[this.field2727];
        this.field2741 = new int[this.field2727];
        if (var3) {
            this.field2734 = new byte[this.field2727];
        }
        if (var4) {
            this.field2735 = new byte[this.field2727];
        }
        if (var5) {
            this.field2737 = new short[this.field2727];
        }
        if (var6) {
            this.field2736 = new byte[this.field2727];
        }
        if (this.field2739 > 0) {
            this.field2764 = new int[this.field2739];
            this.field2731 = new int[this.field2739];
            this.field2742 = new int[this.field2739];
        }
        this.field2723 = 0;
        this.field2727 = 0;
        this.field2739 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class181 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field2727; var11++) {
                    this.field2728[this.field2727] = var10.field2728[var11] + this.field2723;
                    this.field2778[this.field2727] = var10.field2778[var11] + this.field2723;
                    this.field2730[this.field2727] = var10.field2730[var11] + this.field2723;
                    this.field2738[this.field2727] = var10.field2738[var11];
                    this.field2751[this.field2727] = var10.field2751[var11];
                    this.field2741[this.field2727] = var10.field2741[var11];
                    if (var3) {
                        if (var10.field2734 == null) {
                            this.field2734[this.field2727] = var10.field2724;
                        } else {
                            this.field2734[this.field2727] = var10.field2734[var11];
                        }
                    }
                    if (var4 && var10.field2735 != null) {
                        this.field2735[this.field2727] = var10.field2735[var11];
                    }
                    if (var5) {
                        if (var10.field2737 == null) {
                            this.field2737[this.field2727] = -1;
                        } else {
                            this.field2737[this.field2727] = var10.field2737[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field2736 == null || var10.field2736[var11] == -1) {
                            this.field2736[this.field2727] = -1;
                        } else {
                            this.field2736[this.field2727] = (byte) (var10.field2736[var11] + this.field2739);
                        }
                    }
                    this.field2727++;
                }
                for (int var12 = 0; var12 < var10.field2739; var12++) {
                    this.field2764[this.field2739] = var10.field2764[var12] + this.field2723;
                    this.field2731[this.field2739] = var10.field2731[var12] + this.field2723;
                    this.field2742[this.field2739] = var10.field2742[var12] + this.field2723;
                    this.field2739++;
                }
                for (int var13 = 0; var13 < var10.field2723; var13++) {
                    this.field2757[this.field2723] = var10.field2757[var13];
                    this.field2725[this.field2723] = var10.field2725[var13];
                    this.field2726[this.field2723] = var10.field2726[var13];
                    this.field2723++;
                }
            }
        }
    }

    @ObfuscatedName("fb.w([[IIIIZI)Lfb;")
    public class181 method3002(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method3001();
        int var7 = arg1 - this.field2779;
        int var8 = this.field2779 + arg1;
        int var9 = arg3 - this.field2779;
        int var10 = this.field2779 + arg3;
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
        class181 var15;
        if (arg4) {
            var15 = new class181();
            var15.field2723 = this.field2723;
            var15.field2727 = this.field2727;
            var15.field2739 = this.field2739;
            var15.field2757 = this.field2757;
            var15.field2726 = this.field2726;
            var15.field2728 = this.field2728;
            var15.field2778 = this.field2778;
            var15.field2730 = this.field2730;
            var15.field2738 = this.field2738;
            var15.field2751 = this.field2751;
            var15.field2741 = this.field2741;
            var15.field2734 = this.field2734;
            var15.field2735 = this.field2735;
            var15.field2736 = this.field2736;
            var15.field2737 = this.field2737;
            var15.field2724 = this.field2724;
            var15.field2764 = this.field2764;
            var15.field2731 = this.field2731;
            var15.field2742 = this.field2742;
            var15.field2719 = this.field2719;
            var15.field2785 = this.field2785;
            var15.field2777 = this.field2777;
            var15.field2725 = new int[var15.field2723];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field2723; var16++) {
                int var17 = this.field2757[var16] + arg1;
                int var18 = this.field2726[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field2725[var16] = this.field2725[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field2723; var26++) {
                int var27 = (-this.field2725[var26] << 16) / this.field2489;
                if (var27 < arg5) {
                    int var28 = this.field2757[var26] + arg1;
                    int var29 = this.field2726[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field2725[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field2725[var26];
                }
            }
        }
        var15.field2746 = 0;
        return var15;
    }

    @ObfuscatedName("fb.g(Z)Lfb;")
    public class181 method3003(boolean arg0) {
        if (!arg0 && field2720.length < this.field2727) {
            field2720 = new byte[this.field2727 + 100];
        }
        return this.method3005(arg0, field2740, field2720);
    }

    @ObfuscatedName("fb.p(Z)Lfb;")
    public class181 method3004(boolean arg0) {
        if (!arg0 && field2722.length < this.field2727) {
            field2722 = new byte[this.field2727 + 100];
        }
        return this.method3005(arg0, field2721, field2722);
    }

    @ObfuscatedName("fb.z(ZLfb;[B)Lfb;")
    public class181 method3005(boolean arg0, class181 arg1, byte[] arg2) {
        arg1.field2723 = this.field2723;
        arg1.field2727 = this.field2727;
        arg1.field2739 = this.field2739;
        if (arg1.field2757 == null || arg1.field2757.length < this.field2723) {
            arg1.field2757 = new int[this.field2723 + 100];
            arg1.field2725 = new int[this.field2723 + 100];
            arg1.field2726 = new int[this.field2723 + 100];
        }
        for (int var4 = 0; var4 < this.field2723; var4++) {
            arg1.field2757[var4] = this.field2757[var4];
            arg1.field2725[var4] = this.field2725[var4];
            arg1.field2726[var4] = this.field2726[var4];
        }
        if (arg0) {
            arg1.field2735 = this.field2735;
        } else {
            arg1.field2735 = arg2;
            if (this.field2735 == null) {
                for (int var5 = 0; var5 < this.field2727; var5++) {
                    arg1.field2735[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field2727; var6++) {
                    arg1.field2735[var6] = this.field2735[var6];
                }
            }
        }
        arg1.field2728 = this.field2728;
        arg1.field2778 = this.field2778;
        arg1.field2730 = this.field2730;
        arg1.field2738 = this.field2738;
        arg1.field2751 = this.field2751;
        arg1.field2741 = this.field2741;
        arg1.field2734 = this.field2734;
        arg1.field2736 = this.field2736;
        arg1.field2737 = this.field2737;
        arg1.field2724 = this.field2724;
        arg1.field2764 = this.field2764;
        arg1.field2731 = this.field2731;
        arg1.field2742 = this.field2742;
        arg1.field2719 = this.field2719;
        arg1.field2785 = this.field2785;
        arg1.field2777 = this.field2777;
        arg1.field2746 = 0;
        return arg1;
    }

    @ObfuscatedName("fb.n()V")
    public void method3001() {
        if (this.field2746 == 1) {
            return;
        }
        this.field2746 = 1;
        this.field2489 = 0;
        this.field2747 = 0;
        this.field2779 = 0;
        for (int var1 = 0; var1 < this.field2723; var1++) {
            int var2 = this.field2757[var1];
            int var3 = this.field2725[var1];
            int var4 = this.field2726[var1];
            if (-var3 > this.field2489) {
                this.field2489 = -var3;
            }
            if (var3 > this.field2747) {
                this.field2747 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field2779) {
                this.field2779 = var5;
            }
        }
        this.field2779 = (int) (Math.sqrt((double) this.field2779) + 0.99D);
        this.field2750 = (int) (Math.sqrt((double) (this.field2489 * this.field2489 + this.field2779 * this.field2779)) + 0.99D);
        this.field2749 = this.field2750 + (int) (Math.sqrt((double) (this.field2779 * this.field2779 + this.field2747 * this.field2747)) + 0.99D);
    }

    @ObfuscatedName("fb.x()V")
    public void method3007() {
        if (this.field2746 == 2) {
            return;
        }
        this.field2746 = 2;
        this.field2779 = 0;
        for (int var1 = 0; var1 < this.field2723; var1++) {
            int var2 = this.field2757[var1];
            int var3 = this.field2725[var1];
            int var4 = this.field2726[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field2779) {
                this.field2779 = var5;
            }
        }
        this.field2779 = (int) (Math.sqrt((double) this.field2779) + 0.99D);
        this.field2750 = this.field2779;
        this.field2749 = this.field2779 + this.field2779;
    }

    @ObfuscatedName("fb.i()I")
    public int method3008() {
        this.method3001();
        return this.field2779;
    }

    @ObfuscatedName("fb.m(Lfl;I)V")
    public void method3019(class167 arg0, int arg1) {
        if (this.field2719 == null || arg1 == -1) {
            return;
        }
        class47 var3 = arg0.field2490[arg1];
        class135 var4 = var3.field659;
        Statics.field2771 = 0;
        Statics.field2772 = 0;
        Statics.field2743 = 0;
        for (int var5 = 0; var5 < var3.field663; var5++) {
            int var6 = var3.field665[var5];
            this.method3011(var4.field1718[var6], var4.field1716[var6], var3.field666[var5], var3.field664[var5], var3.field668[var5]);
        }
        this.field2746 = 0;
    }

    @ObfuscatedName("fb.ai(Lfl;ILfl;I[I)V")
    public void method3025(class167 arg0, int arg1, class167 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method3019(arg0, arg1);
            return;
        }
        class47 var6 = arg0.field2490[arg1];
        class47 var7 = arg2.field2490[arg3];
        class135 var8 = var6.field659;
        Statics.field2771 = 0;
        Statics.field2772 = 0;
        Statics.field2743 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field663; var11++) {
            int var12 = var6.field665[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1718[var12] == 0) {
                this.method3011(var8.field1718[var12], var8.field1716[var12], var6.field666[var11], var6.field664[var11], var6.field668[var11]);
            }
        }
        Statics.field2771 = 0;
        Statics.field2772 = 0;
        Statics.field2743 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field663; var15++) {
            int var16 = var7.field665[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1718[var16] == 0) {
                this.method3011(var8.field1718[var16], var8.field1716[var16], var7.field666[var15], var7.field664[var15], var7.field668[var15]);
            }
        }
        this.field2746 = 0;
    }

    @ObfuscatedName("fb.aa(I[IIII)V")
    public void method3011(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field2771 = 0;
            Statics.field2772 = 0;
            Statics.field2743 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field2719.length) {
                    int[] var10 = this.field2719[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field2771 += this.field2757[var12];
                        Statics.field2772 += this.field2725[var12];
                        Statics.field2743 += this.field2726[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field2771 = Statics.field2771 / var7 + arg2;
                Statics.field2772 = Statics.field2772 / var7 + arg3;
                Statics.field2743 = Statics.field2743 / var7 + arg4;
            } else {
                Statics.field2771 = arg2;
                Statics.field2772 = arg3;
                Statics.field2743 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field2719.length) {
                    int[] var15 = this.field2719[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field2757[var17] += arg2;
                        this.field2725[var17] += arg3;
                        this.field2726[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field2719.length) {
                    int[] var20 = this.field2719[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field2757[var22] -= Statics.field2771;
                        this.field2725[var22] -= Statics.field2772;
                        this.field2726[var22] -= Statics.field2743;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field2733[var25];
                            int var27 = field2780[var25];
                            int var28 = this.field2757[var22] * var27 + this.field2725[var22] * var26 >> 16;
                            this.field2725[var22] = this.field2725[var22] * var27 - this.field2757[var22] * var26 >> 16;
                            this.field2757[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field2733[var23];
                            int var30 = field2780[var23];
                            int var31 = this.field2725[var22] * var30 - this.field2726[var22] * var29 >> 16;
                            this.field2726[var22] = this.field2726[var22] * var30 + this.field2725[var22] * var29 >> 16;
                            this.field2725[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field2733[var24];
                            int var33 = field2780[var24];
                            int var34 = this.field2757[var22] * var33 + this.field2726[var22] * var32 >> 16;
                            this.field2726[var22] = this.field2726[var22] * var33 - this.field2757[var22] * var32 >> 16;
                            this.field2757[var22] = var34;
                        }
                        this.field2757[var22] += Statics.field2771;
                        this.field2725[var22] += Statics.field2772;
                        this.field2726[var22] += Statics.field2743;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field2719.length) {
                    int[] var37 = this.field2719[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field2757[var39] -= Statics.field2771;
                        this.field2725[var39] -= Statics.field2772;
                        this.field2726[var39] -= Statics.field2743;
                        this.field2757[var39] = this.field2757[var39] * arg2 / 128;
                        this.field2725[var39] = this.field2725[var39] * arg3 / 128;
                        this.field2726[var39] = this.field2726[var39] * arg4 / 128;
                        this.field2757[var39] += Statics.field2771;
                        this.field2725[var39] += Statics.field2772;
                        this.field2726[var39] += Statics.field2743;
                    }
                }
            }
        } else if (arg0 == 5 && this.field2785 != null && this.field2735 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field2785.length) {
                    int[] var42 = this.field2785[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field2735[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field2735[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("fb.af()V")
    public void method3009() {
        for (int var1 = 0; var1 < this.field2723; var1++) {
            int var2 = this.field2757[var1];
            this.field2757[var1] = this.field2726[var1];
            this.field2726[var1] = -var2;
        }
        this.field2746 = 0;
    }

    @ObfuscatedName("fb.ae()V")
    public void method3013() {
        for (int var1 = 0; var1 < this.field2723; var1++) {
            this.field2757[var1] = -this.field2757[var1];
            this.field2726[var1] = -this.field2726[var1];
        }
        this.field2746 = 0;
    }

    @ObfuscatedName("fb.at()V")
    public void method3047() {
        for (int var1 = 0; var1 < this.field2723; var1++) {
            int var2 = this.field2726[var1];
            this.field2726[var1] = this.field2757[var1];
            this.field2757[var1] = -var2;
        }
        this.field2746 = 0;
    }

    @ObfuscatedName("fb.aj(I)V")
    public void method3012(int arg0) {
        int var2 = field2733[arg0];
        int var3 = field2780[arg0];
        for (int var4 = 0; var4 < this.field2723; var4++) {
            int var5 = this.field2725[var4] * var3 - this.field2726[var4] * var2 >> 16;
            this.field2726[var4] = this.field2726[var4] * var3 + this.field2725[var4] * var2 >> 16;
            this.field2725[var4] = var5;
        }
        this.field2746 = 0;
    }

    @ObfuscatedName("fb.ar(III)V")
    public void method3014(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2723; var4++) {
            this.field2757[var4] += arg0;
            this.field2725[var4] += arg1;
            this.field2726[var4] += arg2;
        }
        this.field2746 = 0;
    }

    @ObfuscatedName("fb.au(III)V")
    public void method3064(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2723; var4++) {
            this.field2757[var4] = this.field2757[var4] * arg0 / 128;
            this.field2725[var4] = this.field2725[var4] * arg1 / 128;
            this.field2726[var4] = this.field2726[var4] * arg2 / 128;
        }
        this.field2746 = 0;
    }

    @ObfuscatedName("fb.an(IIIIIII)V")
    public final void method3023(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2761[0] = -1;
        if (this.field2746 != 2 && this.field2746 != 1) {
            this.method3007();
        }
        int var8 = Statics.field2531;
        int var9 = Statics.field2532;
        int var10 = field2733[arg0];
        int var11 = field2780[arg0];
        int var12 = field2733[arg1];
        int var13 = field2780[arg1];
        int var14 = field2733[arg2];
        int var15 = field2780[arg2];
        int var16 = field2733[arg3];
        int var17 = field2780[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field2723; var19++) {
            int var20 = this.field2757[var19];
            int var21 = this.field2725[var19];
            int var22 = this.field2726[var19];
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
            field2756[var19] = var30 - var18;
            field2754[var19] = (var26 << 9) / var30 + var8;
            field2755[var19] = (var29 << 9) / var30 + var9;
            if (this.field2739 > 0) {
                field2774[var19] = var26;
                field2758[var19] = var29;
                field2759[var19] = var30;
            }
        }
        try {
            this.method3020(false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("fb.az(IIIIIIII)V")
    public final void method3018(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2761[0] = -1;
        if (this.field2746 != 2 && this.field2746 != 1) {
            this.method3007();
        }
        int var9 = Statics.field2531;
        int var10 = Statics.field2532;
        int var11 = field2733[arg0];
        int var12 = field2780[arg0];
        int var13 = field2733[arg1];
        int var14 = field2780[arg1];
        int var15 = field2733[arg2];
        int var16 = field2780[arg2];
        int var17 = field2733[arg3];
        int var18 = field2780[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field2723; var20++) {
            int var21 = this.field2757[var20];
            int var22 = this.field2725[var20];
            int var23 = this.field2726[var20];
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
            field2756[var20] = var31 - var19;
            field2754[var20] = (var27 << 9) / arg7 + var9;
            field2755[var20] = (var30 << 9) / arg7 + var10;
            if (this.field2739 > 0) {
                field2774[var20] = var27;
                field2758[var20] = var30;
                field2759[var20] = var31;
            }
        }
        try {
            this.method3020(false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("fb.k(IIIIIIIII)V")
    public void method2643(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2761[0] = -1;
        if (this.field2746 != 1) {
            this.method3001();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field2779 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = var14 - this.field2779 << 9;
        if (var15 / var13 >= Statics.field2536) {
            return;
        }
        int var16 = this.field2779 + var14 << 9;
        if (var16 / var13 <= Statics.field2523) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field2779 * arg1 >> 16;
        int var19 = var17 + var18 << 9;
        if (var19 / var13 <= Statics.field2540) {
            return;
        }
        int var20 = (this.field2489 * arg2 >> 16) + var18;
        int var21 = var17 - var20 << 9;
        if (var21 / var13 >= Statics.field2538) {
            return;
        }
        int var22 = (this.field2489 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field2739 > 0;
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
            int var32 = field2748 - Statics.field2531;
            int var33 = field2776 - Statics.field2532;
            if (var32 > var28 && var32 < var29 && var33 > var30 && var33 < var31) {
                if (this.field2777) {
                    field2744[field2732++] = arg8;
                } else {
                    var26 = true;
                }
            }
        }
        int var34 = Statics.field2531;
        int var35 = Statics.field2532;
        int var36 = 0;
        int var37 = 0;
        if (arg0 != 0) {
            var36 = field2733[arg0];
            var37 = field2780[arg0];
        }
        for (int var38 = 0; var38 < this.field2723; var38++) {
            int var39 = this.field2757[var38];
            int var40 = this.field2725[var38];
            int var41 = this.field2726[var38];
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
            field2756[var38] = var50 - var11;
            if (var50 >= 50) {
                field2754[var38] = (var46 << 9) / var50 + var34;
                field2755[var38] = (var49 << 9) / var50 + var35;
            } else {
                field2754[var38] = -5000;
                var23 = true;
            }
            if (var25) {
                field2774[var38] = var46;
                field2758[var38] = var49;
                field2759[var38] = var50;
            }
        }
        try {
            this.method3020(var23, var26, arg8);
        } catch (Exception var53) {
        }
    }

    @ObfuscatedName("fb.ac(ZZI)V")
    public final void method3020(boolean arg0, boolean arg1, int arg2) {
        if (this.field2749 >= 1600) {
            return;
        }
        for (int var4 = 0; var4 < this.field2749; var4++) {
            field2761[var4] = 0;
        }
        for (int var5 = 0; var5 < this.field2727; var5++) {
            if (this.field2741[var5] != -2) {
                int var6 = this.field2728[var5];
                int var7 = this.field2778[var5];
                int var8 = this.field2730[var5];
                int var9 = field2754[var6];
                int var10 = field2754[var7];
                int var11 = field2754[var8];
                if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
                    int var12 = field2774[var6];
                    int var13 = field2774[var7];
                    int var14 = field2774[var8];
                    int var15 = field2758[var6];
                    int var16 = field2758[var7];
                    int var17 = field2758[var8];
                    int var18 = field2759[var6];
                    int var19 = field2759[var7];
                    int var20 = field2759[var8];
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
                        field2753[var5] = true;
                        int var30 = (field2756[var6] + field2756[var7] + field2756[var8]) / 3 + this.field2750;
                        field2745[var30][field2761[var30]++] = var5;
                    }
                } else {
                    if (arg1 && this.method3022(field2748, field2776, field2755[var6], field2755[var7], field2755[var8], var9, var10, var11)) {
                        field2744[field2732++] = arg2;
                        arg1 = false;
                    }
                    if ((field2755[var8] - field2755[var7]) * (var9 - var10) - (field2755[var6] - field2755[var7]) * (var11 - var10) > 0) {
                        field2753[var5] = false;
                        if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Statics.field2533 && var10 <= Statics.field2533 && var11 <= Statics.field2533) {
                            field2752[var5] = false;
                        } else {
                            field2752[var5] = true;
                        }
                        int var31 = (field2756[var6] + field2756[var7] + field2756[var8]) / 3 + this.field2750;
                        field2745[var31][field2761[var31]++] = var5;
                    }
                }
            }
        }
        if (this.field2734 == null) {
            for (int var32 = this.field2749 - 1; var32 >= 0; var32--) {
                int var33 = field2761[var32];
                if (var33 > 0) {
                    int[] var34 = field2745[var32];
                    for (int var35 = 0; var35 < var33; var35++) {
                        this.method3069(var34[var35]);
                    }
                }
            }
            return;
        }
        for (int var36 = 0; var36 < 12; var36++) {
            field2763[var36] = 0;
            field2767[var36] = 0;
        }
        for (int var37 = this.field2749 - 1; var37 >= 0; var37--) {
            int var38 = field2761[var37];
            if (var38 > 0) {
                int[] var39 = field2745[var37];
                for (int var40 = 0; var40 < var38; var40++) {
                    int var41 = var39[var40];
                    byte var42 = this.field2734[var41];
                    int var43 = field2763[var42]++;
                    field2762[var42][var43] = var41;
                    if (var42 < 10) {
                        field2767[var42] += var37;
                    } else if (var42 == 10) {
                        field2765[var43] = var37;
                    } else {
                        field2766[var43] = var37;
                    }
                }
            }
        }
        int var44 = 0;
        if (field2763[1] > 0 || field2763[2] > 0) {
            var44 = (field2767[1] + field2767[2]) / (field2763[1] + field2763[2]);
        }
        int var45 = 0;
        if (field2763[3] > 0 || field2763[4] > 0) {
            var45 = (field2767[3] + field2767[4]) / (field2763[3] + field2763[4]);
        }
        int var46 = 0;
        if (field2763[6] > 0 || field2763[8] > 0) {
            var46 = (field2767[6] + field2767[8]) / (field2763[6] + field2763[8]);
        }
        int var47 = 0;
        int var48 = field2763[10];
        int[] var49 = field2762[10];
        int[] var50 = field2765;
        if (var47 == var48) {
            var47 = 0;
            var48 = field2763[11];
            var49 = field2762[11];
            var50 = field2766;
        }
        int var51;
        if (var47 < var48) {
            var51 = var50[var47];
        } else {
            var51 = -1000;
        }
        for (int var52 = 0; var52 < 10; var52++) {
            while (var52 == 0 && var51 > var44) {
                this.method3069(var49[var47++]);
                if (var47 == var48 && field2762[11] != var49) {
                    var47 = 0;
                    var48 = field2763[11];
                    var49 = field2762[11];
                    var50 = field2766;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 3 && var51 > var45) {
                this.method3069(var49[var47++]);
                if (var47 == var48 && field2762[11] != var49) {
                    var47 = 0;
                    var48 = field2763[11];
                    var49 = field2762[11];
                    var50 = field2766;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            while (var52 == 5 && var51 > var46) {
                this.method3069(var49[var47++]);
                if (var47 == var48 && field2762[11] != var49) {
                    var47 = 0;
                    var48 = field2763[11];
                    var49 = field2762[11];
                    var50 = field2766;
                }
                if (var47 < var48) {
                    var51 = var50[var47];
                } else {
                    var51 = -1000;
                }
            }
            int var53 = field2763[var52];
            int[] var54 = field2762[var52];
            for (int var55 = 0; var55 < var53; var55++) {
                this.method3069(var54[var55]);
            }
        }
        while (var51 != -1000) {
            this.method3069(var49[var47++]);
            if (var47 == var48 && field2762[11] != var49) {
                var47 = 0;
                var49 = field2762[11];
                var48 = field2763[11];
                var50 = field2766;
            }
            if (var47 < var48) {
                var51 = var50[var47];
            } else {
                var51 = -1000;
            }
        }
    }

    @ObfuscatedName("fb.ap(I)V")
    public final void method3069(int arg0) {
        if (field2753[arg0]) {
            this.method3021(arg0);
            return;
        }
        int var2 = this.field2728[arg0];
        int var3 = this.field2778[arg0];
        int var4 = this.field2730[arg0];
        class173.field2537 = field2752[arg0];
        if (this.field2735 == null) {
            class173.field2524 = 0;
        } else {
            class173.field2524 = this.field2735[arg0] & 0xFF;
        }
        if (this.field2737 != null && this.field2737[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field2736 == null || this.field2736[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field2736[arg0] & 0xFF;
                var6 = this.field2764[var5];
                var7 = this.field2731[var5];
                var8 = this.field2742[var5];
            }
            if (this.field2741[arg0] == -1) {
                class173.method2772(field2755[var2], field2755[var3], field2755[var4], field2754[var2], field2754[var3], field2754[var4], this.field2738[arg0], this.field2738[arg0], this.field2738[arg0], field2774[var6], field2774[var7], field2774[var8], field2758[var6], field2758[var7], field2758[var8], field2759[var6], field2759[var7], field2759[var8], this.field2737[arg0]);
            } else {
                class173.method2772(field2755[var2], field2755[var3], field2755[var4], field2754[var2], field2754[var3], field2754[var4], this.field2738[arg0], this.field2751[arg0], this.field2741[arg0], field2774[var6], field2774[var7], field2774[var8], field2758[var6], field2758[var7], field2758[var8], field2759[var6], field2759[var7], field2759[var8], this.field2737[arg0]);
            }
        } else if (this.field2741[arg0] == -1) {
            class173.method2770(field2755[var2], field2755[var3], field2755[var4], field2754[var2], field2754[var3], field2754[var4], field2781[this.field2738[arg0]]);
        } else {
            class173.method2768(field2755[var2], field2755[var3], field2755[var4], field2754[var2], field2754[var3], field2754[var4], this.field2738[arg0], this.field2751[arg0], this.field2741[arg0]);
        }
    }

    @ObfuscatedName("fb.ad(I)V")
    public final void method3021(int arg0) {
        int var2 = Statics.field2531;
        int var3 = Statics.field2532;
        int var4 = 0;
        int var5 = this.field2728[arg0];
        int var6 = this.field2778[arg0];
        int var7 = this.field2730[arg0];
        int var8 = field2759[var5];
        int var9 = field2759[var6];
        int var10 = field2759[var7];
        if (this.field2735 == null) {
            class173.field2524 = 0;
        } else {
            class173.field2524 = this.field2735[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field2768[var4] = field2754[var5];
            field2769[var4] = field2755[var5];
            field2770[var4++] = this.field2738[arg0];
        } else {
            int var11 = field2774[var5];
            int var12 = field2758[var5];
            int var13 = this.field2738[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field2782[var10 - var8];
                field2768[var4] = (((field2774[var7] - var11) * var14 >> 16) + var11 << 9) / 50 + var2;
                field2769[var4] = (((field2758[var7] - var12) * var14 >> 16) + var12 << 9) / 50 + var3;
                field2770[var4++] = ((this.field2741[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field2782[var9 - var8];
                field2768[var4] = (((field2774[var6] - var11) * var15 >> 16) + var11 << 9) / 50 + var2;
                field2769[var4] = (((field2758[var6] - var12) * var15 >> 16) + var12 << 9) / 50 + var3;
                field2770[var4++] = ((this.field2751[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field2768[var4] = field2754[var6];
            field2769[var4] = field2755[var6];
            field2770[var4++] = this.field2751[arg0];
        } else {
            int var16 = field2774[var6];
            int var17 = field2758[var6];
            int var18 = this.field2751[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field2782[var8 - var9];
                field2768[var4] = (((field2774[var5] - var16) * var19 >> 16) + var16 << 9) / 50 + var2;
                field2769[var4] = (((field2758[var5] - var17) * var19 >> 16) + var17 << 9) / 50 + var3;
                field2770[var4++] = ((this.field2738[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field2782[var10 - var9];
                field2768[var4] = (((field2774[var7] - var16) * var20 >> 16) + var16 << 9) / 50 + var2;
                field2769[var4] = (((field2758[var7] - var17) * var20 >> 16) + var17 << 9) / 50 + var3;
                field2770[var4++] = ((this.field2741[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field2768[var4] = field2754[var7];
            field2769[var4] = field2755[var7];
            field2770[var4++] = this.field2741[arg0];
        } else {
            int var21 = field2774[var7];
            int var22 = field2758[var7];
            int var23 = this.field2741[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field2782[var9 - var10];
                field2768[var4] = (((field2774[var6] - var21) * var24 >> 16) + var21 << 9) / 50 + var2;
                field2769[var4] = (((field2758[var6] - var22) * var24 >> 16) + var22 << 9) / 50 + var3;
                field2770[var4++] = ((this.field2751[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field2782[var8 - var10];
                field2768[var4] = (((field2774[var5] - var21) * var25 >> 16) + var21 << 9) / 50 + var2;
                field2769[var4] = (((field2758[var5] - var22) * var25 >> 16) + var22 << 9) / 50 + var3;
                field2770[var4++] = ((this.field2738[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field2768[0];
        int var27 = field2768[1];
        int var28 = field2768[2];
        int var29 = field2769[0];
        int var30 = field2769[1];
        int var31 = field2769[2];
        class173.field2537 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field2533 || var27 > Statics.field2533 || var28 > Statics.field2533) {
                class173.field2537 = true;
            }
            if (this.field2737 != null && this.field2737[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field2736 == null || this.field2736[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field2736[arg0] & 0xFF;
                    var33 = this.field2764[var32];
                    var34 = this.field2731[var32];
                    var35 = this.field2742[var32];
                }
                if (this.field2741[arg0] == -1) {
                    class173.method2772(var29, var30, var31, var26, var27, var28, this.field2738[arg0], this.field2738[arg0], this.field2738[arg0], field2774[var33], field2774[var34], field2774[var35], field2758[var33], field2758[var34], field2758[var35], field2759[var33], field2759[var34], field2759[var35], this.field2737[arg0]);
                } else {
                    class173.method2772(var29, var30, var31, var26, var27, var28, field2770[0], field2770[1], field2770[2], field2774[var33], field2774[var34], field2774[var35], field2758[var33], field2758[var34], field2758[var35], field2759[var33], field2759[var34], field2759[var35], this.field2737[arg0]);
                }
            } else if (this.field2741[arg0] == -1) {
                class173.method2770(var29, var30, var31, var26, var27, var28, field2781[this.field2738[arg0]]);
            } else {
                class173.method2768(var29, var30, var31, var26, var27, var28, field2770[0], field2770[1], field2770[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field2533 || var27 > Statics.field2533 || var28 > Statics.field2533 || field2768[3] < 0 || field2768[3] > Statics.field2533) {
            class173.field2537 = true;
        }
        if (this.field2737 != null && this.field2737[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field2736 == null || this.field2736[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field2736[arg0] & 0xFF;
                var37 = this.field2764[var36];
                var38 = this.field2731[var36];
                var39 = this.field2742[var36];
            }
            short var40 = this.field2737[arg0];
            if (this.field2741[arg0] == -1) {
                class173.method2772(var29, var30, var31, var26, var27, var28, this.field2738[arg0], this.field2738[arg0], this.field2738[arg0], field2774[var37], field2774[var38], field2774[var39], field2758[var37], field2758[var38], field2758[var39], field2759[var37], field2759[var38], field2759[var39], var40);
                class173.method2772(var29, var31, field2769[3], var26, var28, field2768[3], this.field2738[arg0], this.field2738[arg0], this.field2738[arg0], field2774[var37], field2774[var38], field2774[var39], field2758[var37], field2758[var38], field2758[var39], field2759[var37], field2759[var38], field2759[var39], var40);
            } else {
                class173.method2772(var29, var30, var31, var26, var27, var28, field2770[0], field2770[1], field2770[2], field2774[var37], field2774[var38], field2774[var39], field2758[var37], field2758[var38], field2758[var39], field2759[var37], field2759[var38], field2759[var39], var40);
                class173.method2772(var29, var31, field2769[3], var26, var28, field2768[3], field2770[0], field2770[2], field2770[3], field2774[var37], field2774[var38], field2774[var39], field2758[var37], field2758[var38], field2758[var39], field2759[var37], field2759[var38], field2759[var39], var40);
            }
        } else if (this.field2741[arg0] == -1) {
            int var41 = field2781[this.field2738[arg0]];
            class173.method2770(var29, var30, var31, var26, var27, var28, var41);
            class173.method2770(var29, var31, field2769[3], var26, var28, field2768[3], var41);
        } else {
            class173.method2768(var29, var30, var31, var26, var27, var28, field2770[0], field2770[1], field2770[2]);
            class173.method2768(var29, var31, field2769[3], var26, var28, field2768[3], field2770[0], field2770[2], field2770[3]);
        }
    }

    @ObfuscatedName("fb.ax(IIIIIIII)Z")
    public final boolean method3022(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
