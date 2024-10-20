package deob;

import java.util.Arrays;
import java.util.HashMap;

@ObfuscatedName("jo")
public class class241 extends class234 {

    @ObfuscatedName("jo.aw")
    public static class241 field2720 = new class241();

    @ObfuscatedName("jo.ay")
    public static byte[] field2674 = new byte[1];

    @ObfuscatedName("jo.ar")
    public static class241 field2739 = new class241();

    @ObfuscatedName("jo.am")
    public static byte[] field2676 = new byte[1];

    @ObfuscatedName("jo.as")
    public static class452 field2677 = new class452();

    @ObfuscatedName("jo.aj")
    public static class452 field2689 = new class452();

    @ObfuscatedName("jo.ag")
    public static class452 field2679 = new class452();

    @ObfuscatedName("jo.az")
    public int field2750 = 0;

    @ObfuscatedName("jo.av")
    public int[] field2688;

    @ObfuscatedName("jo.ap")
    public int[] field2682;

    @ObfuscatedName("jo.aq")
    public int[] field2678;

    @ObfuscatedName("jo.at")
    public int field2705 = 0;

    @ObfuscatedName("jo.ah")
    public int[] field2673;

    @ObfuscatedName("jo.ax")
    public int[] field2686;

    @ObfuscatedName("jo.aa")
    public int[] field2687;

    @ObfuscatedName("jo.au")
    public int[] field2698;

    @ObfuscatedName("jo.ae")
    public int[] field2715;

    @ObfuscatedName("jo.ab")
    public int[] field2690;

    @ObfuscatedName("jo.ad")
    public byte[] field2691;

    @ObfuscatedName("jo.ao")
    public byte[] field2692;

    @ObfuscatedName("jo.ac")
    public byte[] field2693;

    @ObfuscatedName("jo.ak")
    public short[] field2694;

    @ObfuscatedName("jo.an")
    public byte field2684 = 0;

    @ObfuscatedName("jo.af")
    public int field2696 = 0;

    @ObfuscatedName("jo.ai")
    public int[] field2697;

    @ObfuscatedName("jo.al")
    public int[] field2746;

    @ObfuscatedName("jo.bd")
    public int[] field2699;

    @ObfuscatedName("jo.bb")
    public int[][] field2700;

    @ObfuscatedName("jo.bn")
    public int[][] field2701;

    @ObfuscatedName("jo.ba")
    public int[][] field2749;

    @ObfuscatedName("jo.bf")
    public int[][] field2745;

    @ObfuscatedName("jo.bs")
    public boolean field2704 = false;

    @ObfuscatedName("jo.bp")
    public int field2714;

    @ObfuscatedName("jo.bv")
    public int field2706;

    @ObfuscatedName("jo.bq")
    public int field2707;

    @ObfuscatedName("jo.bo")
    public int field2708;

    @ObfuscatedName("jo.br")
    public int field2709;

    @ObfuscatedName("jo.bw")
    public HashMap field2710 = new HashMap();

    @ObfuscatedName("jo.bc")
    public static boolean[] field2735 = new boolean[6500];

    @ObfuscatedName("jo.bi")
    public static boolean[] field2713 = new boolean[6500];

    @ObfuscatedName("jo.bu")
    public static int[] field2730 = new int[6500];

    @ObfuscatedName("jo.bk")
    public static int[] field2702 = new int[6500];

    @ObfuscatedName("jo.bz")
    public static float[] field2712 = new float[6500];

    @ObfuscatedName("jo.bx")
    public static int[] field2717 = new int[6500];

    @ObfuscatedName("jo.bh")
    public static int[] field2681 = new int[6500];

    @ObfuscatedName("jo.bm")
    public static int[] field2719 = new int[6500];

    @ObfuscatedName("jo.bl")
    public static int[] field2731 = new int[6500];

    @ObfuscatedName("jo.by")
    public static char[] field2722 = new char[6000];

    @ObfuscatedName("jo.bg")
    public static char[][] field2703 = new char[6000][512];

    @ObfuscatedName("jo.bj")
    public static int[] field2724 = new int[12];

    @ObfuscatedName("jo.ct")
    public static int[][] field2725 = new int[12][2000];

    @ObfuscatedName("jo.cf")
    public static int[] field2726 = new int[2000];

    @ObfuscatedName("jo.cb")
    public static int[] field2727 = new int[2000];

    @ObfuscatedName("jo.cs")
    public static int[] field2728 = new int[12];

    @ObfuscatedName("jo.cj")
    public static int[] field2729 = new int[10];

    @ObfuscatedName("jo.cn")
    public static int[] field2723 = new int[10];

    @ObfuscatedName("jo.cw")
    public static int[] field2695 = new int[10];

    @ObfuscatedName("jo.ce")
    public static float[] field2732 = new float[10];

    @ObfuscatedName("jo.ca")
    public static boolean field2736 = true;

    @ObfuscatedName("jo.cu")
    public static int[] field2718 = class228.field2509;

    @ObfuscatedName("jo.cr")
    public static int[] field2740 = class228.field2510;

    @ObfuscatedName("jo.cd")
    public static int[] field2741 = class228.field2512;

    @ObfuscatedName("jo.cy")
    public static int[] field2742 = class228.field2507;

    @ObfuscatedName("jo.cp")
    public static final float field2680 = Statics.method6038(50);

    @ObfuscatedName("jo.ch")
    public byte field2716;

    @ObfuscatedName("jo.cg")
    public byte field2747;

    @ObfuscatedName("jo.ci")
    public byte field2748;

    @ObfuscatedName("jo.cv")
    public byte field2675;

    @ObfuscatedName("jo.cc")
    public short field2685;

    public class241() {
    }

    public class241(class241[] arg0, int arg1) {
        this.field2750 = 0;
        this.field2705 = 0;
        this.field2696 = 0;
        this.field2684 = -1;
        for (int var3 = 0; var3 < arg1; var3++) {
            class241 var4 = arg0[var3];
            if (var4 != null) {
                this.field2750 += var4.field2750;
                this.field2705 += var4.field2705;
                this.field2696 += var4.field2696;
                if (this.field2684 == -1) {
                    this.field2684 = var4.field2684;
                }
            }
        }
        this.method4500(this.field2750, this.field2705, this.field2696);
        this.field2750 = 0;
        this.field2705 = 0;
        this.field2696 = 0;
        for (int var5 = 0; var5 < arg1; var5++) {
            this.method4439(arg0[var5]);
        }
    }

    public class241(int arg0, int arg1, int arg2, byte arg3) {
        this.method4500(arg0, arg1, arg2);
        this.field2684 = arg3;
        this.field2750 = 0;
        this.field2705 = 0;
        this.field2696 = 0;
    }

    @ObfuscatedName("jo.aw(III)V")
    public void method4500(int arg0, int arg1, int arg2) {
        this.field2688 = new int[arg0];
        this.field2682 = new int[arg0];
        this.field2678 = new int[arg0];
        this.field2673 = new int[arg1];
        this.field2686 = new int[arg1];
        this.field2687 = new int[arg1];
        this.field2698 = new int[arg1];
        this.field2715 = new int[arg1];
        this.field2690 = new int[arg1];
        if (arg2 > 0) {
            this.field2697 = new int[arg2];
            this.field2746 = new int[arg2];
            this.field2699 = new int[arg2];
        }
    }

    @ObfuscatedName("jo.ar(Ljo;)V")
    public void method4420(class241 arg0) {
        int var2 = this.field2673.length;
        if (this.field2691 == null && (arg0.field2691 != null || this.field2684 != arg0.field2684)) {
            this.field2691 = new byte[var2];
            Arrays.fill(this.field2691, this.field2684);
        }
        if (this.field2692 == null && arg0.field2692 != null) {
            this.field2692 = new byte[var2];
            Arrays.fill(this.field2692, (byte) 0);
        }
        if (this.field2694 == null && arg0.field2694 != null) {
            this.field2694 = new short[var2];
            Arrays.fill(this.field2694, (short) -1);
        }
        if (this.field2693 == null && arg0.field2693 != null) {
            this.field2693 = new byte[var2];
            Arrays.fill(this.field2693, (byte) -1);
        }
    }

    @ObfuscatedName("jo.am(Ljo;)V")
    public void method4439(class241 arg0) {
        if (arg0 == null) {
            return;
        }
        this.method4420(arg0);
        for (int var2 = 0; var2 < arg0.field2705; var2++) {
            this.field2673[this.field2705] = arg0.field2673[var2] + this.field2750;
            this.field2686[this.field2705] = arg0.field2686[var2] + this.field2750;
            this.field2687[this.field2705] = arg0.field2687[var2] + this.field2750;
            this.field2698[this.field2705] = arg0.field2698[var2];
            this.field2715[this.field2705] = arg0.field2715[var2];
            this.field2690[this.field2705] = arg0.field2690[var2];
            if (this.field2691 != null) {
                this.field2691[this.field2705] = arg0.field2691 == null ? arg0.field2684 : arg0.field2691[var2];
            }
            if (this.field2692 != null && arg0.field2692 != null) {
                this.field2692[this.field2705] = arg0.field2692[var2];
            }
            if (this.field2694 != null) {
                this.field2694[this.field2705] = arg0.field2694 == null ? -1 : arg0.field2694[var2];
            }
            if (this.field2693 != null) {
                if (arg0.field2693 == null || arg0.field2693[var2] == -1) {
                    this.field2693[this.field2705] = -1;
                } else {
                    this.field2693[this.field2705] = (byte) (arg0.field2693[var2] + this.field2696);
                }
            }
            this.field2705++;
        }
        for (int var3 = 0; var3 < arg0.field2696; var3++) {
            this.field2697[this.field2696] = arg0.field2697[var3] + this.field2750;
            this.field2746[this.field2696] = arg0.field2746[var3] + this.field2750;
            this.field2699[this.field2696] = arg0.field2699[var3] + this.field2750;
            this.field2696++;
        }
        for (int var4 = 0; var4 < arg0.field2750; var4++) {
            this.field2688[this.field2750] = arg0.field2688[var4];
            this.field2682[this.field2750] = arg0.field2682[var4];
            this.field2678[this.field2750] = arg0.field2678[var4];
            this.field2750++;
        }
    }

    @ObfuscatedName("jo.as([[IIIIZI)Ljo;")
    public class241 method4422(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method4427();
        int var7 = arg1 - this.field2707;
        int var8 = this.field2707 + arg1;
        int var9 = arg3 - this.field2707;
        int var10 = this.field2707 + arg3;
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
        class241 var15;
        if (arg4) {
            var15 = new class241();
            var15.field2750 = this.field2750;
            var15.field2705 = this.field2705;
            var15.field2696 = this.field2696;
            var15.field2688 = this.field2688;
            var15.field2678 = this.field2678;
            var15.field2673 = this.field2673;
            var15.field2686 = this.field2686;
            var15.field2687 = this.field2687;
            var15.field2698 = this.field2698;
            var15.field2715 = this.field2715;
            var15.field2690 = this.field2690;
            var15.field2691 = this.field2691;
            var15.field2692 = this.field2692;
            var15.field2693 = this.field2693;
            var15.field2694 = this.field2694;
            var15.field2684 = this.field2684;
            var15.field2697 = this.field2697;
            var15.field2746 = this.field2746;
            var15.field2699 = this.field2699;
            var15.field2700 = this.field2700;
            var15.field2701 = this.field2701;
            var15.field2704 = this.field2704;
            var15.field2682 = new int[var15.field2750];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field2750; var16++) {
                int var17 = this.field2688[var16] + arg1;
                int var18 = this.field2678[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field2682[var16] = this.field2682[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field2750; var26++) {
                int var27 = (-this.field2682[var26] << 16) / this.field2613;
                if (var27 < arg5) {
                    int var28 = this.field2688[var26] + arg1;
                    int var29 = this.field2678[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field2682[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field2682[var26];
                }
            }
        }
        var15.method4454();
        return var15;
    }

    @ObfuscatedName("jo.ag(Z)Ljo;")
    public class241 method4423(boolean arg0) {
        if (!arg0 && field2674.length < this.field2705) {
            field2674 = new byte[this.field2705 + 100];
        }
        return this.method4425(arg0, field2720, field2674);
    }

    @ObfuscatedName("jo.az(Z)Ljo;")
    public class241 method4424(boolean arg0) {
        if (!arg0 && field2676.length < this.field2705) {
            field2676 = new byte[this.field2705 + 100];
        }
        return this.method4425(arg0, field2739, field2676);
    }

    @ObfuscatedName("jo.av(ZLjo;[B)Ljo;")
    public class241 method4425(boolean arg0, class241 arg1, byte[] arg2) {
        arg1.field2750 = this.field2750;
        arg1.field2705 = this.field2705;
        arg1.field2696 = this.field2696;
        if (arg1.field2688 == null || arg1.field2688.length < this.field2750) {
            arg1.field2688 = new int[this.field2750 + 100];
            arg1.field2682 = new int[this.field2750 + 100];
            arg1.field2678 = new int[this.field2750 + 100];
        }
        for (int var4 = 0; var4 < this.field2750; var4++) {
            arg1.field2688[var4] = this.field2688[var4];
            arg1.field2682[var4] = this.field2682[var4];
            arg1.field2678[var4] = this.field2678[var4];
        }
        if (arg0) {
            arg1.field2692 = this.field2692;
        } else {
            arg1.field2692 = arg2;
            if (this.field2692 == null) {
                for (int var5 = 0; var5 < this.field2705; var5++) {
                    arg1.field2692[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field2705; var6++) {
                    arg1.field2692[var6] = this.field2692[var6];
                }
            }
        }
        arg1.field2673 = this.field2673;
        arg1.field2686 = this.field2686;
        arg1.field2687 = this.field2687;
        arg1.field2698 = this.field2698;
        arg1.field2715 = this.field2715;
        arg1.field2690 = this.field2690;
        arg1.field2691 = this.field2691;
        arg1.field2693 = this.field2693;
        arg1.field2694 = this.field2694;
        arg1.field2684 = this.field2684;
        arg1.field2697 = this.field2697;
        arg1.field2746 = this.field2746;
        arg1.field2699 = this.field2699;
        arg1.field2700 = this.field2700;
        arg1.field2701 = this.field2701;
        arg1.field2749 = this.field2749;
        arg1.field2745 = this.field2745;
        arg1.field2704 = this.field2704;
        arg1.method4454();
        arg1.field2675 = 0;
        return arg1;
    }

    @ObfuscatedName("jo.ap(I)V")
    public void method4426(int arg0) {
        if (this.field2710.containsKey(arg0)) {
            return;
        }
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = field2740[arg0];
        int var9 = field2718[arg0];
        for (int var10 = 0; var10 < this.field2750; var10++) {
            int var11 = class240.method2349(this.field2688[var10], this.field2678[var10], var8, var9);
            int var12 = this.field2682[var10];
            int var13 = this.field2688[var10];
            int var14 = this.field2678[var10];
            int var15 = var8 * var14 - var9 * var13 >> 16;
            if (var11 < var2) {
                var2 = var11;
            }
            if (var11 > var5) {
                var5 = var11;
            }
            if (var12 < var3) {
                var3 = var12;
            }
            if (var12 > var6) {
                var6 = var12;
            }
            if (var15 < var4) {
                var4 = var15;
            }
            if (var15 > var7) {
                var7 = var15;
            }
        }
        class233 var17 = new class233((var2 + var5) / 2, (var3 + var6) / 2, (var4 + var7) / 2, (var5 - var2 + 1) / 2, (var6 - var3 + 1) / 2, (var7 - var4 + 1) / 2);
        boolean var18 = true;
        if (var17.field2608 < 32) {
            var17.field2608 = 32;
        }
        if (var17.field2611 < 32) {
            var17.field2611 = 32;
        }
        if (this.field2704) {
            boolean var19 = true;
            var17.field2608 += 8;
            var17.field2611 += 8;
        }
        this.field2710.put(arg0, var17);
    }

    @ObfuscatedName("jo.aq()V")
    public void method4427() {
        if (this.field2714 == 1) {
            return;
        }
        this.field2714 = 1;
        this.field2613 = 0;
        this.field2706 = 0;
        this.field2707 = 0;
        for (int var1 = 0; var1 < this.field2750; var1++) {
            int var2 = this.field2688[var1];
            int var3 = this.field2682[var1];
            int var4 = this.field2678[var1];
            if (-var3 > this.field2613) {
                this.field2613 = -var3;
            }
            if (var3 > this.field2706) {
                this.field2706 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field2707) {
                this.field2707 = var5;
            }
        }
        this.field2707 = (int) (Math.sqrt((double) this.field2707) + 0.99D);
        this.field2709 = (int) (Math.sqrt((double) (this.field2613 * this.field2613 + this.field2707 * this.field2707)) + 0.99D);
        this.field2708 = this.field2709 + (int) (Math.sqrt((double) (this.field2707 * this.field2707 + this.field2706 * this.field2706)) + 0.99D);
    }

    @ObfuscatedName("jo.at()V")
    public void method4501() {
        if (this.field2714 == 2) {
            return;
        }
        this.field2714 = 2;
        this.field2707 = 0;
        for (int var1 = 0; var1 < this.field2750; var1++) {
            int var2 = this.field2688[var1];
            int var3 = this.field2682[var1];
            int var4 = this.field2678[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field2707) {
                this.field2707 = var5;
            }
        }
        this.field2707 = (int) (Math.sqrt((double) this.field2707) + 0.99D);
        this.field2709 = this.field2707;
        this.field2708 = this.field2707 + this.field2707;
    }

    @ObfuscatedName("jo.ah()I")
    public int method4429() {
        this.method4427();
        return this.field2707;
    }

    @ObfuscatedName("jo.ax()V")
    public void method4454() {
        this.field2714 = 0;
        this.field2710.clear();
    }

    @ObfuscatedName("jo.aa(Ljm;I)V")
    public void method4485(class236 arg0, int arg1) {
        if (this.field2700 == null || arg1 == -1) {
            return;
        }
        class226 var3 = arg0.field2623[arg1];
        class231 var4 = var3.field2474;
        Statics.field2733 = 0;
        Statics.field2734 = 0;
        Statics.field2683 = 0;
        for (int var5 = 0; var5 < var3.field2475; var5++) {
            int var6 = var3.field2470[var5];
            this.method4467(var4.field2535[var6], var4.field2536[var6], var3.field2477[var5], var3.field2476[var5], var3.field2479[var5]);
        }
        this.method4454();
    }

    @ObfuscatedName("jo.au(Lfz;I)V")
    public void method4431(class138 arg0, int arg1) {
        class231 var3 = arg0.field1610;
        class229 var4 = var3.method4181();
        if (var4 != null) {
            var3.method4181().method4130(arg0, arg1);
            this.method4433(var3.method4181(), arg0.method2937());
        }
        if (arg0.method2928()) {
            this.method4432(arg0, arg1);
        }
        this.method4454();
    }

    @ObfuscatedName("jo.ae(Lfz;I)V")
    public void method4432(class138 arg0, int arg1) {
        class231 var3 = arg0.field1610;
        for (int var4 = 0; var4 < var3.field2531; var4++) {
            int var5 = var3.field2535[var4];
            if (var5 == 5 && arg0.field1609 != null && arg0.field1609[var4] != null && arg0.field1609[var4][0] != null && this.field2701 != null && this.field2692 != null) {
                class131 var6 = arg0.field1609[var4][0];
                int[] var7 = var3.field2536[var4];
                int var8 = var7.length;
                for (int var9 = 0; var9 < var8; var9++) {
                    int var10 = var7[var9];
                    if (var10 < this.field2701.length) {
                        int[] var11 = this.field2701[var10];
                        for (int var12 = 0; var12 < var11.length; var12++) {
                            int var13 = var11[var12];
                            int var14 = (int) ((float) (this.field2692[var13] & 0xFF) + var6.method2858(arg1) * 255.0F);
                            if (var14 < 0) {
                                var14 = 0;
                            } else if (var14 > 255) {
                                var14 = 255;
                            }
                            this.field2692[var13] = (byte) var14;
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("jo.ab(Liv;I)V")
    public void method4433(class229 arg0, int arg1) {
        this.method4453(arg0, arg1);
    }

    @ObfuscatedName("jo.ad(Ljm;ILjm;I[I)V")
    public void method4529(class236 arg0, int arg1, class236 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method4485(arg0, arg1);
            return;
        }
        class226 var6 = arg0.field2623[arg1];
        class226 var7 = arg2.field2623[arg3];
        class231 var8 = var6.field2474;
        Statics.field2733 = 0;
        Statics.field2734 = 0;
        Statics.field2683 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field2475; var11++) {
            int var12 = var6.field2470[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field2535[var12] == 0) {
                this.method4467(var8.field2535[var12], var8.field2536[var12], var6.field2477[var11], var6.field2476[var11], var6.field2479[var11]);
            }
        }
        Statics.field2733 = 0;
        Statics.field2734 = 0;
        Statics.field2683 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field2475; var15++) {
            int var16 = var7.field2470[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field2535[var16] == 0) {
                this.method4467(var8.field2535[var16], var8.field2536[var16], var7.field2477[var15], var7.field2476[var15], var7.field2479[var15]);
            }
        }
        this.method4454();
    }

    @ObfuscatedName("jo.ao(Lik;Lfz;I[ZZZ)V")
    public void method4435(class231 arg0, class138 arg1, int arg2, boolean[] arg3, boolean arg4, boolean arg5) {
        class229 var7 = arg0.method4181();
        if (var7 != null) {
            var7.method4129(arg1, arg2, arg3, arg4);
            if (arg5) {
                this.method4433(var7, arg1.method2937());
            }
        }
        if (!arg4 && arg1.method2928()) {
            this.method4432(arg1, arg2);
        }
    }

    @ObfuscatedName("jo.ac(Ljm;I[IZ)V")
    public void method4436(class236 arg0, int arg1, int[] arg2, boolean arg3) {
        if (arg2 == null) {
            this.method4485(arg0, arg1);
            return;
        }
        class226 var5 = arg0.field2623[arg1];
        class231 var6 = var5.field2474;
        byte var7 = 0;
        int var11 = var7 + 1;
        int var8 = arg2[var7];
        Statics.field2733 = 0;
        Statics.field2734 = 0;
        Statics.field2683 = 0;
        for (int var9 = 0; var9 < var5.field2475; var9++) {
            int var10 = var5.field2470[var9];
            while (var10 > var8) {
                var8 = arg2[var11++];
            }
            if (arg3) {
                if (var8 == var10 || var6.field2535[var10] == 0) {
                    this.method4467(var6.field2535[var10], var6.field2536[var10], var5.field2477[var9], var5.field2476[var9], var5.field2479[var9]);
                }
            } else if (var8 != var10 || var6.field2535[var10] == 0) {
                this.method4467(var6.field2535[var10], var6.field2536[var10], var5.field2477[var9], var5.field2476[var9], var5.field2479[var9]);
            }
        }
    }

    @ObfuscatedName("jo.ak(I[IIII)V")
    public void method4467(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field2733 = 0;
            Statics.field2734 = 0;
            Statics.field2683 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field2700.length) {
                    int[] var10 = this.field2700[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field2733 += this.field2688[var12];
                        Statics.field2734 += this.field2682[var12];
                        Statics.field2683 += this.field2678[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field2733 = Statics.field2733 / var7 + arg2;
                Statics.field2734 = Statics.field2734 / var7 + arg3;
                Statics.field2683 = Statics.field2683 / var7 + arg4;
            } else {
                Statics.field2733 = arg2;
                Statics.field2734 = arg3;
                Statics.field2683 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field2700.length) {
                    int[] var15 = this.field2700[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field2688[var17] += arg2;
                        this.field2682[var17] += arg3;
                        this.field2678[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field2700.length) {
                    int[] var20 = this.field2700[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field2688[var22] -= Statics.field2733;
                        this.field2682[var22] -= Statics.field2734;
                        this.field2678[var22] -= Statics.field2683;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field2718[var25];
                            int var27 = field2740[var25];
                            int var28 = this.field2688[var22] * var27 + this.field2682[var22] * var26 >> 16;
                            this.field2682[var22] = this.field2682[var22] * var27 - this.field2688[var22] * var26 >> 16;
                            this.field2688[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field2718[var23];
                            int var30 = field2740[var23];
                            int var31 = this.field2682[var22] * var30 - this.field2678[var22] * var29 >> 16;
                            this.field2678[var22] = this.field2682[var22] * var29 + this.field2678[var22] * var30 >> 16;
                            this.field2682[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field2718[var24];
                            int var33 = field2740[var24];
                            int var34 = this.field2688[var22] * var33 + this.field2678[var22] * var32 >> 16;
                            this.field2678[var22] = this.field2678[var22] * var33 - this.field2688[var22] * var32 >> 16;
                            this.field2688[var22] = var34;
                        }
                        this.field2688[var22] += Statics.field2733;
                        this.field2682[var22] += Statics.field2734;
                        this.field2678[var22] += Statics.field2683;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field2700.length) {
                    int[] var37 = this.field2700[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field2688[var39] -= Statics.field2733;
                        this.field2682[var39] -= Statics.field2734;
                        this.field2678[var39] -= Statics.field2683;
                        this.field2688[var39] = this.field2688[var39] * arg2 / 128;
                        this.field2682[var39] = this.field2682[var39] * arg3 / 128;
                        this.field2678[var39] = this.field2678[var39] * arg4 / 128;
                        this.field2688[var39] += Statics.field2733;
                        this.field2682[var39] += Statics.field2734;
                        this.field2678[var39] += Statics.field2683;
                    }
                }
            }
        } else if (arg0 == 5 && this.field2701 != null && this.field2692 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field2701.length) {
                    int[] var42 = this.field2701[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field2692[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field2692[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("jo.an()V")
    public void method4438() {
        for (int var1 = 0; var1 < this.field2750; var1++) {
            int var2 = this.field2688[var1];
            this.field2688[var1] = this.field2678[var1];
            this.field2678[var1] = -var2;
        }
        this.method4454();
    }

    @ObfuscatedName("jo.af()V")
    public void method4441() {
        for (int var1 = 0; var1 < this.field2750; var1++) {
            this.field2688[var1] = -this.field2688[var1];
            this.field2678[var1] = -this.field2678[var1];
        }
        this.method4454();
    }

    @ObfuscatedName("jo.ai()V")
    public void method4521() {
        for (int var1 = 0; var1 < this.field2750; var1++) {
            int var2 = this.field2678[var1];
            this.field2678[var1] = this.field2688[var1];
            this.field2688[var1] = -var2;
        }
        this.method4454();
    }

    @ObfuscatedName("jo.al(I)V")
    public void method4442(int arg0) {
        int var2 = field2718[arg0];
        int var3 = field2740[arg0];
        for (int var4 = 0; var4 < this.field2750; var4++) {
            int var5 = this.field2682[var4] * var3 - this.field2678[var4] * var2 >> 16;
            this.field2678[var4] = this.field2682[var4] * var2 + this.field2678[var4] * var3 >> 16;
            this.field2682[var4] = var5;
        }
        this.method4454();
    }

    @ObfuscatedName("jo.bd(III)V")
    public void method4494(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2750; var4++) {
            this.field2688[var4] += arg0;
            this.field2682[var4] += arg1;
            this.field2678[var4] += arg2;
        }
        this.method4454();
    }

    @ObfuscatedName("jo.bb(III)V")
    public void method4443(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2750; var4++) {
            this.field2688[var4] = this.field2688[var4] * arg0 / 128;
            this.field2682[var4] = this.field2682[var4] * arg1 / 128;
            this.field2678[var4] = this.field2678[var4] * arg2 / 128;
        }
        this.method4454();
    }

    @ObfuscatedName("jo.bn(IIIIIII)V")
    public final void method4444(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field2714 != 2 && this.field2714 != 1) {
            this.method4501();
        }
        int var8 = class228.method4040();
        int var9 = class228.method4041();
        int var10 = field2718[arg0];
        int var11 = field2740[arg0];
        int var12 = field2718[arg1];
        int var13 = field2740[arg1];
        int var14 = field2718[arg2];
        int var15 = field2740[arg2];
        int var16 = field2718[arg3];
        int var17 = field2740[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field2750; var19++) {
            int var20 = this.field2688[var19];
            int var21 = this.field2682[var19];
            int var22 = this.field2678[var19];
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
            field2717[var19] = var30 - var18;
            field2730[var19] = var8 + var26 * class228.method4046() / var30;
            field2702[var19] = var9 + var29 * class228.method4046() / var30;
            field2712[var19] = Statics.method6038(var30);
            if (this.field2696 > 0) {
                field2681[var19] = var26;
                field2719[var19] = var29;
                field2731[var19] = var30;
            }
        }
        try {
            this.method4447(false, false, false, 0L);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("jo.ba(IIIIIIII)V")
    public final void method4445(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (this.field2714 != 2 && this.field2714 != 1) {
            this.method4501();
        }
        int var9 = class228.method4040();
        int var10 = class228.method4041();
        int var11 = field2718[arg0];
        int var12 = field2740[arg0];
        int var13 = field2718[arg1];
        int var14 = field2740[arg1];
        int var15 = field2718[arg2];
        int var16 = field2740[arg2];
        int var17 = field2718[arg3];
        int var18 = field2740[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field2750; var20++) {
            int var21 = this.field2688[var20];
            int var22 = this.field2682[var20];
            int var23 = this.field2678[var20];
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
            field2717[var20] = var31 - var19;
            field2730[var20] = var9 + var27 * class228.method4046() / arg7;
            field2702[var20] = var10 + var30 * class228.method4046() / arg7;
            field2712[var20] = Statics.method6038(arg7);
            if (this.field2696 > 0) {
                field2681[var20] = var27;
                field2719[var20] = var30;
                field2731[var20] = var31;
            }
        }
        try {
            this.method4447(false, false, false, 0L);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("jo.dx(IIIIIIIIJ)V")
    public void method4375(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        if (this.field2714 != 1) {
            this.method4427();
        }
        this.method4426(arg0);
        int var11 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var12 = arg1 * arg6 + arg2 * var11 >> 16;
        int var13 = this.field2707 * arg2 >> 16;
        int var14 = var12 + var13;
        if (var14 <= 50 || var12 >= 3500) {
            return;
        }
        int var15 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var16 = (var15 - this.field2707) * class228.method4046();
        if (var16 / var14 >= class228.method4043()) {
            return;
        }
        int var17 = (this.field2707 + var15) * class228.method4046();
        if (var17 / var14 <= class228.method4122()) {
            return;
        }
        int var18 = arg2 * arg6 - arg1 * var11 >> 16;
        int var19 = this.field2707 * arg1 >> 16;
        int var20 = (this.field2706 * arg2 >> 16) + var19;
        int var21 = (var18 + var20) * class228.method4046();
        if (var21 / var14 <= class228.method4045()) {
            return;
        }
        int var22 = (this.field2613 * arg2 >> 16) + var19;
        int var23 = (var18 - var22) * class228.method4046();
        if (var23 / var14 >= class228.method4038()) {
            return;
        }
        int var24 = (this.field2613 * arg1 >> 16) + var13;
        boolean var25 = false;
        boolean var26 = false;
        if (var12 - var24 <= 50) {
            var26 = true;
        }
        boolean var27 = var26 || this.field2696 > 0;
        int var28 = class242.field2752;
        int var30 = class242.field2753;
        boolean var32 = class242.method2547();
        boolean var33 = arg8 != 0L;
        if (var33) {
            boolean var34 = (int) (arg8 >>> 16 & 0x1L) == 1;
            var33 = !var34;
        }
        boolean var37 = false;
        if (var33 && var32) {
            boolean var38 = false;
            if (field2736) {
                var38 = class242.method6017(this, arg0, arg5, arg6, arg7);
            } else {
                int var39 = var12 - var13;
                if (var39 <= 50) {
                    var39 = 50;
                }
                int var40;
                int var41;
                if (var15 > 0) {
                    var40 = var16 / var14;
                    var41 = var17 / var39;
                } else {
                    var41 = var17 / var14;
                    var40 = var16 / var39;
                }
                int var42;
                int var43;
                if (var18 > 0) {
                    var42 = var23 / var14;
                    var43 = var21 / var39;
                } else {
                    var43 = var21 / var14;
                    var42 = var23 / var39;
                }
                int var44 = var28 - class228.method4040();
                int var45 = var30 - class228.method4041();
                if (var44 > var40 && var44 < var41 && var45 > var42 && var45 < var43) {
                    var38 = true;
                }
            }
            if (var38) {
                if (this.field2704) {
                    class242.field2759[++class242.field2754 - 1] = arg8;
                } else {
                    var37 = true;
                }
            }
        }
        int var48 = class228.method4040();
        int var49 = class228.method4041();
        int var50 = 0;
        int var51 = 0;
        if (arg0 != 0) {
            var50 = field2718[arg0];
            var51 = field2740[arg0];
        }
        for (int var52 = 0; var52 < this.field2750; var52++) {
            int var53 = this.field2688[var52];
            int var54 = this.field2682[var52];
            int var55 = this.field2678[var52];
            if (arg0 != 0) {
                int var56 = var50 * var55 + var51 * var53 >> 16;
                var55 = var51 * var55 - var50 * var53 >> 16;
                var53 = var56;
            }
            int var57 = arg5 + var53;
            int var58 = arg6 + var54;
            int var59 = arg7 + var55;
            int var60 = arg3 * var59 + arg4 * var57 >> 16;
            int var61 = arg4 * var59 - arg3 * var57 >> 16;
            int var63 = arg2 * var58 - arg1 * var61 >> 16;
            int var64 = arg1 * var58 + arg2 * var61 >> 16;
            field2717[var52] = var64 - var12;
            if (var64 >= 50) {
                field2730[var52] = var48 + var60 * class228.method4046() / var64;
                field2702[var52] = var49 + var63 * class228.method4046() / var64;
                field2712[var52] = Statics.method6038(var64);
            } else {
                field2730[var52] = -5000;
                var25 = true;
            }
            if (var27) {
                field2681[var52] = var60;
                field2719[var52] = var63;
                field2731[var52] = var64;
            }
        }
        try {
            this.method4447(var25, var37, this.field2704, arg8);
        } catch (Exception var67) {
        }
    }

    @ObfuscatedName("jo.bf(ZZZJ)V")
    public final void method4447(boolean arg0, boolean arg1, boolean arg2, long arg3) {
        if (this.field2708 >= 6000) {
            return;
        }
        for (int var6 = 0; var6 < this.field2708; var6++) {
            field2722[var6] = 0;
        }
        int var7 = arg2 ? 20 : 5;
        for (char var8 = 0; var8 < this.field2705; var8++) {
            if (this.field2690[var8] != -2) {
                int var9 = this.field2673[var8];
                int var10 = this.field2686[var8];
                int var11 = this.field2687[var8];
                int var12 = field2730[var9];
                int var13 = field2730[var10];
                int var14 = field2730[var11];
                if (arg0 && var12 == -5000 || var13 == -5000 || var14 == -5000) {
                    int var15 = field2681[var9];
                    int var16 = field2681[var10];
                    int var17 = field2681[var11];
                    int var18 = field2719[var9];
                    int var19 = field2719[var10];
                    int var20 = field2719[var11];
                    int var21 = field2731[var9];
                    int var22 = field2731[var10];
                    int var23 = field2731[var11];
                    int var24 = var15 - var16;
                    int var25 = var17 - var16;
                    int var26 = var18 - var19;
                    int var27 = var20 - var19;
                    int var28 = var21 - var22;
                    int var29 = var23 - var22;
                    int var30 = var26 * var29 - var27 * var28;
                    int var31 = var25 * var28 - var24 * var29;
                    int var32 = var24 * var27 - var25 * var26;
                    if (var22 * var32 + var16 * var30 + var19 * var31 > 0) {
                        field2713[var8] = true;
                        int var33 = (field2717[var9] + field2717[var10] + field2717[var11]) / 3 + this.field2709;
                        field2703[var33][field2722[var33]++] = var8;
                    }
                } else {
                    if (arg1) {
                        int var34 = field2702[var9];
                        int var35 = field2702[var10];
                        int var36 = field2702[var11];
                        int var37 = class242.field2753 + var7;
                        boolean var38;
                        if (var37 < var34 && var37 < var35 && var37 < var36) {
                            var38 = false;
                        } else {
                            int var39 = class242.field2753 - var7;
                            if (var39 > var34 && var39 > var35 && var39 > var36) {
                                var38 = false;
                            } else {
                                int var40 = class242.field2752 + var7;
                                if (var40 < var12 && var40 < var13 && var40 < var14) {
                                    var38 = false;
                                } else {
                                    int var41 = class242.field2752 - var7;
                                    if (var41 > var12 && var41 > var13 && var41 > var14) {
                                        var38 = false;
                                    } else {
                                        var38 = true;
                                    }
                                }
                            }
                        }
                        if (var38) {
                            class242.field2759[++class242.field2754 - 1] = arg3;
                            arg1 = false;
                        }
                    }
                    if ((field2702[var11] - field2702[var10]) * (var12 - var13) - (field2702[var9] - field2702[var10]) * (var14 - var13) > 0) {
                        field2713[var8] = false;
                        int var44 = class228.method4042();
                        if (var12 >= 0 && var13 >= 0 && var14 >= 0 && var12 <= var44 && var13 <= var44 && var14 <= var44) {
                            field2735[var8] = false;
                        } else {
                            field2735[var8] = true;
                        }
                        int var45 = (field2717[var9] + field2717[var10] + field2717[var11]) / 3 + this.field2709;
                        field2703[var45][field2722[var45]++] = var8;
                    }
                }
            }
        }
        if (this.field2691 == null) {
            for (int var46 = this.field2708 - 1; var46 >= 0; var46--) {
                char var47 = field2722[var46];
                if (var47 > 0) {
                    char[] var48 = field2703[var46];
                    for (int var49 = 0; var49 < var47; var49++) {
                        this.method4448(var48[var49]);
                    }
                }
            }
            return;
        }
        for (int var50 = 0; var50 < 12; var50++) {
            field2724[var50] = 0;
            field2728[var50] = 0;
        }
        for (int var51 = this.field2708 - 1; var51 >= 0; var51--) {
            char var52 = field2722[var51];
            if (var52 > 0) {
                char[] var53 = field2703[var51];
                for (int var54 = 0; var54 < var52; var54++) {
                    char var55 = var53[var54];
                    byte var56 = this.field2691[var55];
                    int var57 = field2724[var56]++;
                    field2725[var56][var57] = var55;
                    if (var56 < 10) {
                        field2728[var56] += var51;
                    } else if (var56 == 10) {
                        field2726[var57] = var51;
                    } else {
                        field2727[var57] = var51;
                    }
                }
            }
        }
        int var58 = 0;
        if (field2724[1] > 0 || field2724[2] > 0) {
            var58 = (field2728[1] + field2728[2]) / (field2724[1] + field2724[2]);
        }
        int var59 = 0;
        if (field2724[3] > 0 || field2724[4] > 0) {
            var59 = (field2728[3] + field2728[4]) / (field2724[3] + field2724[4]);
        }
        int var60 = 0;
        if (field2724[6] > 0 || field2724[8] > 0) {
            var60 = (field2728[6] + field2728[8]) / (field2724[6] + field2724[8]);
        }
        int var61 = 0;
        int var62 = field2724[10];
        int[] var63 = field2725[10];
        int[] var64 = field2726;
        if (var61 == var62) {
            var61 = 0;
            var62 = field2724[11];
            var63 = field2725[11];
            var64 = field2727;
        }
        int var65;
        if (var61 < var62) {
            var65 = var64[var61];
        } else {
            var65 = -1000;
        }
        for (int var66 = 0; var66 < 10; var66++) {
            while (var66 == 0 && var65 > var58) {
                this.method4448(var63[var61++]);
                if (var61 == var62 && field2725[11] != var63) {
                    var61 = 0;
                    var62 = field2724[11];
                    var63 = field2725[11];
                    var64 = field2727;
                }
                if (var61 < var62) {
                    var65 = var64[var61];
                } else {
                    var65 = -1000;
                }
            }
            while (var66 == 3 && var65 > var59) {
                this.method4448(var63[var61++]);
                if (var61 == var62 && field2725[11] != var63) {
                    var61 = 0;
                    var62 = field2724[11];
                    var63 = field2725[11];
                    var64 = field2727;
                }
                if (var61 < var62) {
                    var65 = var64[var61];
                } else {
                    var65 = -1000;
                }
            }
            while (var66 == 5 && var65 > var60) {
                this.method4448(var63[var61++]);
                if (var61 == var62 && field2725[11] != var63) {
                    var61 = 0;
                    var62 = field2724[11];
                    var63 = field2725[11];
                    var64 = field2727;
                }
                if (var61 < var62) {
                    var65 = var64[var61];
                } else {
                    var65 = -1000;
                }
            }
            int var67 = field2724[var66];
            int[] var68 = field2725[var66];
            for (int var69 = 0; var69 < var67; var69++) {
                this.method4448(var68[var69]);
            }
        }
        while (var65 != -1000) {
            this.method4448(var63[var61++]);
            if (var61 == var62 && field2725[11] != var63) {
                var61 = 0;
                var63 = field2725[11];
                var62 = field2724[11];
                var64 = field2727;
            }
            if (var61 < var62) {
                var65 = var64[var61];
            } else {
                var65 = -1000;
            }
        }
    }

    @ObfuscatedName("jo.bs(I)V")
    public final void method4448(int arg0) {
        if (field2713[arg0]) {
            this.method4451(arg0);
            return;
        }
        int var2 = this.field2673[arg0];
        int var3 = this.field2686[arg0];
        int var4 = this.field2687[arg0];
        class228.field2511.field2794 = field2735[arg0];
        if (this.field2692 == null) {
            class228.field2511.field2784 = 0;
        } else {
            class228.field2511.field2784 = (this.field2692[arg0] == -1 ? 253 : this.field2692[arg0]) & 0xFF;
        }
        this.method4450(arg0, field2702[var2], field2702[var3], field2702[var4], field2730[var2], field2730[var3], field2730[var4], field2712[var2], field2712[var3], field2712[var4], this.field2698[arg0], this.field2715[arg0], this.field2690[arg0]);
    }

    @ObfuscatedName("jo.bp(I)Z")
    public boolean method4449(int arg0) {
        return this.field2675 > 0 && arg0 < this.field2685;
    }

    @ObfuscatedName("jo.bv(IIIIIIIFFFIII)V")
    public final void method4450(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float arg7, float arg8, float arg9, int arg10, int arg11, int arg12) {
        if (this.field2694 == null || this.field2694[arg0] == -1) {
            boolean var18 = this.method4449(arg0);
            if (this.field2690[arg0] == -1 && var18) {
                class228.method4059(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, field2741[this.field2698[arg0]], this.field2716, this.field2747, this.field2748, this.field2675);
            } else if (this.field2690[arg0] == -1) {
                class228.method4089(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, field2741[this.field2698[arg0]]);
            } else if (var18) {
                class228.method4058(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, this.field2716, this.field2747, this.field2748, this.field2675);
            } else {
                class228.method4054(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12);
            }
            return;
        }
        int var15;
        int var16;
        int var17;
        if (this.field2693 == null || this.field2693[arg0] == -1) {
            var15 = this.field2673[arg0];
            var16 = this.field2686[arg0];
            var17 = this.field2687[arg0];
        } else {
            int var14 = this.field2693[arg0] & 0xFF;
            var15 = this.field2697[var14];
            var16 = this.field2746[var14];
            var17 = this.field2699[var14];
        }
        if (this.field2690[arg0] == -1) {
            class228.method4056(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg10, arg10, field2681[var15], field2681[var16], field2681[var17], field2719[var15], field2719[var16], field2719[var17], field2731[var15], field2731[var16], field2731[var17], this.field2694[arg0]);
        } else {
            class228.method4056(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, field2681[var15], field2681[var16], field2681[var17], field2719[var15], field2719[var16], field2719[var17], field2731[var15], field2731[var16], field2731[var17], this.field2694[arg0]);
        }
    }

    @ObfuscatedName("jo.bq(I)V")
    public final void method4451(int arg0) {
        int var2 = class228.method4040();
        int var3 = class228.method4041();
        int var4 = 0;
        int var5 = this.field2673[arg0];
        int var6 = this.field2686[arg0];
        int var7 = this.field2687[arg0];
        int var8 = field2731[var5];
        int var9 = field2731[var6];
        int var10 = field2731[var7];
        if (this.field2692 == null) {
            class228.field2511.field2784 = 0;
        } else {
            class228.field2511.field2784 = this.field2692[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field2729[var4] = field2730[var5];
            field2723[var4] = field2702[var5];
            field2732[var4] = field2712[var7];
            field2695[var4++] = this.field2698[arg0];
        } else {
            int var11 = field2681[var5];
            int var12 = field2719[var5];
            int var13 = this.field2698[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field2742[var10 - var8];
                field2729[var4] = var2 + (((field2681[var7] - var11) * var14 >> 16) + var11) * class228.method4046() / 50;
                field2723[var4] = var3 + (((field2719[var7] - var12) * var14 >> 16) + var12) * class228.method4046() / 50;
                field2732[var4] = field2680;
                field2695[var4++] = ((this.field2690[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field2742[var9 - var8];
                field2729[var4] = var2 + (((field2681[var6] - var11) * var15 >> 16) + var11) * class228.method4046() / 50;
                field2723[var4] = var3 + (((field2719[var6] - var12) * var15 >> 16) + var12) * class228.method4046() / 50;
                field2732[var4] = field2680;
                field2695[var4++] = ((this.field2715[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field2729[var4] = field2730[var6];
            field2723[var4] = field2702[var6];
            field2732[var4] = field2712[var7];
            field2695[var4++] = this.field2715[arg0];
        } else {
            int var16 = field2681[var6];
            int var17 = field2719[var6];
            int var18 = this.field2715[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field2742[var8 - var9];
                field2729[var4] = var2 + (((field2681[var5] - var16) * var19 >> 16) + var16) * class228.method4046() / 50;
                field2723[var4] = var3 + (((field2719[var5] - var17) * var19 >> 16) + var17) * class228.method4046() / 50;
                field2732[var4] = field2680;
                field2695[var4++] = ((this.field2698[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field2742[var10 - var9];
                field2729[var4] = var2 + (((field2681[var7] - var16) * var20 >> 16) + var16) * class228.method4046() / 50;
                field2723[var4] = var3 + (((field2719[var7] - var17) * var20 >> 16) + var17) * class228.method4046() / 50;
                field2695[var4++] = ((this.field2690[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field2729[var4] = field2730[var7];
            field2723[var4] = field2702[var7];
            field2732[var4] = field2712[var7];
            field2695[var4++] = this.field2690[arg0];
        } else {
            int var21 = field2681[var7];
            int var22 = field2719[var7];
            int var23 = this.field2690[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field2742[var9 - var10];
                field2729[var4] = var2 + (((field2681[var6] - var21) * var24 >> 16) + var21) * class228.method4046() / 50;
                field2723[var4] = var3 + (((field2719[var6] - var22) * var24 >> 16) + var22) * class228.method4046() / 50;
                field2732[var4] = field2680;
                field2695[var4++] = ((this.field2715[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field2742[var8 - var10];
                field2729[var4] = var2 + (((field2681[var5] - var21) * var25 >> 16) + var21) * class228.method4046() / 50;
                field2723[var4] = var3 + (((field2719[var5] - var22) * var25 >> 16) + var22) * class228.method4046() / 50;
                field2732[var4] = field2680;
                field2695[var4++] = ((this.field2698[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field2729[0];
        int var27 = field2729[1];
        int var28 = field2729[2];
        int var29 = field2723[0];
        int var30 = field2723[1];
        int var31 = field2723[2];
        float var32 = field2732[0];
        float var33 = field2732[1];
        float var34 = field2732[2];
        class228.field2511.field2794 = false;
        int var35 = class228.method4042();
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > var35 || var27 > var35 || var28 > var35) {
                class228.field2511.field2794 = true;
            }
            this.method4450(arg0, var29, var30, var31, var26, var27, var28, var32, var33, var34, field2695[0], field2695[1], field2695[2]);
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > var35 || var27 > var35 || var28 > var35 || field2729[3] < 0 || field2729[3] > var35) {
            class228.field2511.field2794 = true;
        }
        if (this.field2694 == null || this.field2694[arg0] == -1) {
            boolean var41 = this.method4449(arg0);
            if (this.field2690[arg0] == -1 && var41) {
                int var42 = field2741[this.field2698[arg0]];
                class228.method4059(var29, var30, var31, var26, var27, var28, var32, var33, var34, var42, this.field2716, this.field2747, this.field2748, this.field2675);
                class228.method4059(var29, var31, field2723[3], var26, var28, field2729[3], var32, var34, field2732[3], var42, this.field2716, this.field2747, this.field2748, this.field2675);
            } else if (this.field2690[arg0] == -1) {
                int var43 = field2741[this.field2698[arg0]];
                class228.method4089(var29, var30, var31, var26, var27, var28, var32, var33, var34, var43);
                class228.method4089(var29, var31, field2723[3], var26, var28, field2729[3], var32, var34, field2732[3], var43);
            } else if (var41) {
                class228.method4058(var29, var30, var31, var26, var27, var28, var32, var33, var34, field2695[0], field2695[1], field2695[2], this.field2716, this.field2748, this.field2747, this.field2675);
                class228.method4058(var29, var31, field2723[3], var26, var28, field2729[3], 0.0F, 0.0F, 0.0F, field2695[0], field2695[2], field2695[3], this.field2716, this.field2748, this.field2747, this.field2675);
            } else {
                class228.method4054(var29, var30, var31, var26, var27, var28, var32, var33, var34, field2695[0], field2695[1], field2695[2]);
                class228.method4054(var29, var31, field2723[3], var26, var28, field2729[3], var32, var34, field2732[3], field2695[0], field2695[2], field2695[3]);
            }
            return;
        }
        int var37;
        int var38;
        int var39;
        if (this.field2693 == null || this.field2693[arg0] == -1) {
            var37 = var5;
            var38 = var6;
            var39 = var7;
        } else {
            int var36 = this.field2693[arg0] & 0xFF;
            var37 = this.field2697[var36];
            var38 = this.field2746[var36];
            var39 = this.field2699[var36];
        }
        short var40 = this.field2694[arg0];
        if (this.field2690[arg0] == -1) {
            class228.method4056(var29, var30, var31, var26, var27, var28, var32, var33, var34, this.field2698[arg0], this.field2698[arg0], this.field2698[arg0], field2681[var37], field2681[var38], field2681[var39], field2719[var37], field2719[var38], field2719[var39], field2731[var37], field2731[var38], field2731[var39], var40);
            class228.method4056(var29, var31, field2723[3], var26, var28, field2729[3], var32, var34, field2732[3], this.field2698[arg0], this.field2698[arg0], this.field2698[arg0], field2681[var37], field2681[var38], field2681[var39], field2719[var37], field2719[var38], field2719[var39], field2731[var37], field2731[var38], field2731[var39], var40);
        } else {
            class228.method4056(var29, var30, var31, var26, var27, var28, var32, var33, var34, field2695[0], field2695[1], field2695[2], field2681[var37], field2681[var38], field2681[var39], field2719[var37], field2719[var38], field2719[var39], field2731[var37], field2731[var38], field2731[var39], var40);
            class228.method4056(var29, var31, field2723[3], var26, var28, field2729[3], var32, var34, field2732[3], field2695[0], field2695[2], field2695[3], field2681[var37], field2681[var38], field2681[var39], field2719[var37], field2719[var38], field2719[var39], field2731[var37], field2731[var38], field2731[var39], var40);
        }
    }

    @ObfuscatedName("jo.bo(ILrm;)V")
    public void method4490(int arg0, class452 arg1) {
        float var3 = (float) this.field2688[arg0];
        float var4 = (float) (-this.field2682[arg0]);
        float var5 = (float) (-this.field2678[arg0]);
        float var6 = 1.0F;
        this.field2688[arg0] = (int) (arg1.field4744[12] * var6 + arg1.field4744[8] * var5 + arg1.field4744[0] * var3 + arg1.field4744[4] * var4);
        this.field2682[arg0] = -((int) (arg1.field4744[13] * var6 + arg1.field4744[9] * var5 + arg1.field4744[1] * var3 + arg1.field4744[5] * var4));
        this.field2678[arg0] = -((int) (arg1.field4744[14] * var6 + arg1.field4744[10] * var5 + arg1.field4744[2] * var3 + arg1.field4744[6] * var4));
    }

    @ObfuscatedName("jo.br(Liv;I)V")
    public void method4453(class229 arg0, int arg1) {
        if (this.field2749 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field2750; var3++) {
            int[] var4 = this.field2749[var3];
            if (var4 != null && var4.length != 0) {
                int[] var5 = this.field2745[var3];
                field2677.method7490();
                for (int var6 = 0; var6 < var4.length; var6++) {
                    int var7 = var4[var6];
                    class128 var8 = arg0.method4128(var7);
                    if (var8 != null) {
                        field2689.method7492((float) var5[var6] / 255.0F);
                        field2679.method7529(var8.method2833(arg1));
                        field2679.method7525(field2689);
                        field2677.method7494(field2679);
                    }
                }
                this.method4490(var3, field2677);
            }
        }
    }
}
