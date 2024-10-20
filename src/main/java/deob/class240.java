package deob;

import java.util.Arrays;
import java.util.HashMap;

@ObfuscatedName("jr")
public class class240 extends class233 {

    @ObfuscatedName("jr.au")
    public static class240 field2745 = new class240();

    @ObfuscatedName("jr.ae")
    public static byte[] field2773 = new byte[1];

    @ObfuscatedName("jr.ao")
    public static class240 field2704 = new class240();

    @ObfuscatedName("jr.at")
    public static byte[] field2705 = new byte[1];

    @ObfuscatedName("jr.ac")
    public static class451 field2706 = new class451();

    @ObfuscatedName("jr.ai")
    public static class451 field2707 = new class451();

    @ObfuscatedName("jr.az")
    public static class451 field2708 = new class451();

    @ObfuscatedName("jr.ap")
    public int field2766 = 0;

    @ObfuscatedName("jr.aa")
    public int[] field2710;

    @ObfuscatedName("jr.af")
    public int[] field2711;

    @ObfuscatedName("jr.ad")
    public int[] field2716;

    @ObfuscatedName("jr.aq")
    public int field2712 = 0;

    @ObfuscatedName("jr.al")
    public int[] field2728;

    @ObfuscatedName("jr.an")
    public int[] field2715;

    @ObfuscatedName("jr.ar")
    public int[] field2776;

    @ObfuscatedName("jr.ab")
    public int[] field2717;

    @ObfuscatedName("jr.ag")
    public int[] field2718;

    @ObfuscatedName("jr.am")
    public int[] field2719;

    @ObfuscatedName("jr.ax")
    public byte[] field2775;

    @ObfuscatedName("jr.ah")
    public byte[] field2721;

    @ObfuscatedName("jr.as")
    public byte[] field2722;

    @ObfuscatedName("jr.ay")
    public short[] field2723;

    @ObfuscatedName("jr.aj")
    public byte field2724 = 0;

    @ObfuscatedName("jr.av")
    public int field2725 = 0;

    @ObfuscatedName("jr.aw")
    public int[] field2726;

    @ObfuscatedName("jr.ak")
    public int[] field2727;

    @ObfuscatedName("jr.bh")
    public int[] field2720;

    @ObfuscatedName("jr.bj")
    public int[][] field2729;

    @ObfuscatedName("jr.bk")
    public int[][] field2730;

    @ObfuscatedName("jr.bv")
    public int[][] field2731;

    @ObfuscatedName("jr.bt")
    public int[][] field2756;

    @ObfuscatedName("jr.bd")
    public boolean field2713 = false;

    @ObfuscatedName("jr.by")
    public int field2734;

    @ObfuscatedName("jr.bs")
    public int field2735;

    @ObfuscatedName("jr.bm")
    public int field2736;

    @ObfuscatedName("jr.bf")
    public int field2737;

    @ObfuscatedName("jr.bq")
    public int field2761;

    @ObfuscatedName("jr.ba")
    public HashMap field2739 = new HashMap();

    @ObfuscatedName("jr.bp")
    public static boolean[] field2741 = new boolean[6500];

    @ObfuscatedName("jr.bu")
    public static boolean[] field2742 = new boolean[6500];

    @ObfuscatedName("jr.bo")
    public static int[] field2743 = new int[6500];

    @ObfuscatedName("jr.bb")
    public static int[] field2744 = new int[6500];

    @ObfuscatedName("jr.br")
    public static float[] field2749 = new float[6500];

    @ObfuscatedName("jr.be")
    public static int[] field2746 = new int[6500];

    @ObfuscatedName("jr.bi")
    public static int[] field2747 = new int[6500];

    @ObfuscatedName("jr.bz")
    public static int[] field2748 = new int[6500];

    @ObfuscatedName("jr.bx")
    public static int[] field2754 = new int[6500];

    @ObfuscatedName("jr.bw")
    public static char[] field2751 = new char[6000];

    @ObfuscatedName("jr.bc")
    public static char[][] field2752 = new char[6000][512];

    @ObfuscatedName("jr.bg")
    public static int[] field2753 = new int[12];

    @ObfuscatedName("jr.cw")
    public static int[][] field2750 = new int[12][2000];

    @ObfuscatedName("jr.cf")
    public static int[] field2755 = new int[2000];

    @ObfuscatedName("jr.cm")
    public static int[] field2709 = new int[2000];

    @ObfuscatedName("jr.cn")
    public static int[] field2757 = new int[12];

    @ObfuscatedName("jr.cs")
    public static int[] field2758 = new int[10];

    @ObfuscatedName("jr.cx")
    public static int[] field2759 = new int[10];

    @ObfuscatedName("jr.cr")
    public static int[] field2760 = new int[10];

    @ObfuscatedName("jr.cd")
    public static float[] field2763 = new float[10];

    @ObfuscatedName("jr.cv")
    public static boolean field2765 = true;

    @ObfuscatedName("jr.cu")
    public static int[] field2768 = class227.field2535;

    @ObfuscatedName("jr.ch")
    public static int[] field2769 = class227.field2533;

    @ObfuscatedName("jr.ci")
    public static int[] field2770 = class227.field2532;

    @ObfuscatedName("jr.ca")
    public static int[] field2733 = class227.field2534;

    @ObfuscatedName("jr.cj")
    public static final float field2774 = class239.method5079(50);

    @ObfuscatedName("jr.cz")
    public byte field2772;

    @ObfuscatedName("jr.ct")
    public byte field2740;

    @ObfuscatedName("jr.cy")
    public byte field2738;

    @ObfuscatedName("jr.ck")
    public byte field2778;

    @ObfuscatedName("jr.cc")
    public short field2779;

    public class240() {
    }

    public class240(class240[] arg0, int arg1) {
        this.field2766 = 0;
        this.field2712 = 0;
        this.field2725 = 0;
        this.field2724 = -1;
        for (int var3 = 0; var3 < arg1; var3++) {
            class240 var4 = arg0[var3];
            if (var4 != null) {
                this.field2766 += var4.field2766;
                this.field2712 += var4.field2712;
                this.field2725 += var4.field2725;
                if (this.field2724 == -1) {
                    this.field2724 = var4.field2724;
                }
            }
        }
        this.method4442(this.field2766, this.field2712, this.field2725);
        this.field2766 = 0;
        this.field2712 = 0;
        this.field2725 = 0;
        for (int var5 = 0; var5 < arg1; var5++) {
            this.method4512(arg0[var5]);
        }
    }

    public class240(int arg0, int arg1, int arg2, byte arg3) {
        this.method4442(arg0, arg1, arg2);
        this.field2724 = arg3;
        this.field2766 = 0;
        this.field2712 = 0;
        this.field2725 = 0;
    }

    @ObfuscatedName("jr.au(III)V")
    public void method4442(int arg0, int arg1, int arg2) {
        this.field2710 = new int[arg0];
        this.field2711 = new int[arg0];
        this.field2716 = new int[arg0];
        this.field2728 = new int[arg1];
        this.field2715 = new int[arg1];
        this.field2776 = new int[arg1];
        this.field2717 = new int[arg1];
        this.field2718 = new int[arg1];
        this.field2719 = new int[arg1];
        if (arg2 > 0) {
            this.field2726 = new int[arg2];
            this.field2727 = new int[arg2];
            this.field2720 = new int[arg2];
        }
    }

    @ObfuscatedName("jr.ao(Ljr;)V")
    public void method4541(class240 arg0) {
        int var2 = this.field2728.length;
        if (this.field2775 == null && (arg0.field2775 != null || this.field2724 != arg0.field2724)) {
            this.field2775 = new byte[var2];
            Arrays.fill(this.field2775, this.field2724);
        }
        if (this.field2721 == null && arg0.field2721 != null) {
            this.field2721 = new byte[var2];
            Arrays.fill(this.field2721, (byte) 0);
        }
        if (this.field2723 == null && arg0.field2723 != null) {
            this.field2723 = new short[var2];
            Arrays.fill(this.field2723, (short) -1);
        }
        if (this.field2722 == null && arg0.field2722 != null) {
            this.field2722 = new byte[var2];
            Arrays.fill(this.field2722, (byte) -1);
        }
    }

    @ObfuscatedName("jr.at(Ljr;)V")
    public void method4512(class240 arg0) {
        if (arg0 == null) {
            return;
        }
        this.method4541(arg0);
        for (int var2 = 0; var2 < arg0.field2712; var2++) {
            this.field2728[this.field2712] = arg0.field2728[var2] + this.field2766;
            this.field2715[this.field2712] = arg0.field2715[var2] + this.field2766;
            this.field2776[this.field2712] = arg0.field2776[var2] + this.field2766;
            this.field2717[this.field2712] = arg0.field2717[var2];
            this.field2718[this.field2712] = arg0.field2718[var2];
            this.field2719[this.field2712] = arg0.field2719[var2];
            if (this.field2775 != null) {
                this.field2775[this.field2712] = arg0.field2775 == null ? arg0.field2724 : arg0.field2775[var2];
            }
            if (this.field2721 != null && arg0.field2721 != null) {
                this.field2721[this.field2712] = arg0.field2721[var2];
            }
            if (this.field2723 != null) {
                this.field2723[this.field2712] = arg0.field2723 == null ? -1 : arg0.field2723[var2];
            }
            if (this.field2722 != null) {
                if (arg0.field2722 == null || arg0.field2722[var2] == -1) {
                    this.field2722[this.field2712] = -1;
                } else {
                    this.field2722[this.field2712] = (byte) (arg0.field2722[var2] + this.field2725);
                }
            }
            this.field2712++;
        }
        for (int var3 = 0; var3 < arg0.field2725; var3++) {
            this.field2726[this.field2725] = arg0.field2726[var3] + this.field2766;
            this.field2727[this.field2725] = arg0.field2727[var3] + this.field2766;
            this.field2720[this.field2725] = arg0.field2720[var3] + this.field2766;
            this.field2725++;
        }
        for (int var4 = 0; var4 < arg0.field2766; var4++) {
            this.field2710[this.field2766] = arg0.field2710[var4];
            this.field2711[this.field2766] = arg0.field2711[var4];
            this.field2716[this.field2766] = arg0.field2716[var4];
            this.field2766++;
        }
    }

    @ObfuscatedName("jr.az([[IIIIZI)Ljr;")
    public class240 method4445(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method4450();
        int var7 = arg1 - this.field2736;
        int var8 = this.field2736 + arg1;
        int var9 = arg3 - this.field2736;
        int var10 = this.field2736 + arg3;
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
        class240 var15;
        if (arg4) {
            var15 = new class240();
            var15.field2766 = this.field2766;
            var15.field2712 = this.field2712;
            var15.field2725 = this.field2725;
            var15.field2710 = this.field2710;
            var15.field2716 = this.field2716;
            var15.field2728 = this.field2728;
            var15.field2715 = this.field2715;
            var15.field2776 = this.field2776;
            var15.field2717 = this.field2717;
            var15.field2718 = this.field2718;
            var15.field2719 = this.field2719;
            var15.field2775 = this.field2775;
            var15.field2721 = this.field2721;
            var15.field2722 = this.field2722;
            var15.field2723 = this.field2723;
            var15.field2724 = this.field2724;
            var15.field2726 = this.field2726;
            var15.field2727 = this.field2727;
            var15.field2720 = this.field2720;
            var15.field2729 = this.field2729;
            var15.field2730 = this.field2730;
            var15.field2713 = this.field2713;
            var15.field2711 = new int[var15.field2766];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field2766; var16++) {
                int var17 = this.field2710[var16] + arg1;
                int var18 = this.field2716[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field2711[var16] = this.field2711[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field2766; var26++) {
                int var27 = (-this.field2711[var26] << 16) / this.field2638;
                if (var27 < arg5) {
                    int var28 = this.field2710[var26] + arg1;
                    int var29 = this.field2716[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field2711[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field2711[var26];
                }
            }
        }
        var15.method4453();
        return var15;
    }

    @ObfuscatedName("jr.ap(Z)Ljr;")
    public class240 method4446(boolean arg0) {
        if (!arg0 && field2773.length < this.field2712) {
            field2773 = new byte[this.field2712 + 100];
        }
        return this.method4510(arg0, field2745, field2773);
    }

    @ObfuscatedName("jr.aa(Z)Ljr;")
    public class240 method4538(boolean arg0) {
        if (!arg0 && field2705.length < this.field2712) {
            field2705 = new byte[this.field2712 + 100];
        }
        return this.method4510(arg0, field2704, field2705);
    }

    @ObfuscatedName("jr.af(ZLjr;[B)Ljr;")
    public class240 method4510(boolean arg0, class240 arg1, byte[] arg2) {
        arg1.field2766 = this.field2766;
        arg1.field2712 = this.field2712;
        arg1.field2725 = this.field2725;
        if (arg1.field2710 == null || arg1.field2710.length < this.field2766) {
            arg1.field2710 = new int[this.field2766 + 100];
            arg1.field2711 = new int[this.field2766 + 100];
            arg1.field2716 = new int[this.field2766 + 100];
        }
        for (int var4 = 0; var4 < this.field2766; var4++) {
            arg1.field2710[var4] = this.field2710[var4];
            arg1.field2711[var4] = this.field2711[var4];
            arg1.field2716[var4] = this.field2716[var4];
        }
        if (arg0) {
            arg1.field2721 = this.field2721;
        } else {
            arg1.field2721 = arg2;
            if (this.field2721 == null) {
                for (int var5 = 0; var5 < this.field2712; var5++) {
                    arg1.field2721[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field2712; var6++) {
                    arg1.field2721[var6] = this.field2721[var6];
                }
            }
        }
        arg1.field2728 = this.field2728;
        arg1.field2715 = this.field2715;
        arg1.field2776 = this.field2776;
        arg1.field2717 = this.field2717;
        arg1.field2718 = this.field2718;
        arg1.field2719 = this.field2719;
        arg1.field2775 = this.field2775;
        arg1.field2722 = this.field2722;
        arg1.field2723 = this.field2723;
        arg1.field2724 = this.field2724;
        arg1.field2726 = this.field2726;
        arg1.field2727 = this.field2727;
        arg1.field2720 = this.field2720;
        arg1.field2729 = this.field2729;
        arg1.field2730 = this.field2730;
        arg1.field2731 = this.field2731;
        arg1.field2756 = this.field2756;
        arg1.field2713 = this.field2713;
        arg1.method4453();
        arg1.field2778 = 0;
        return arg1;
    }

    @ObfuscatedName("jr.ad(I)V")
    public void method4550(int arg0) {
        if (this.field2739.containsKey(arg0)) {
            return;
        }
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = field2769[arg0];
        int var9 = field2768[arg0];
        for (int var10 = 0; var10 < this.field2766; var10++) {
            int var11 = this.field2710[var10];
            int var12 = this.field2716[var10];
            int var13 = var8 * var11 + var9 * var12 >> 16;
            int var15 = this.field2711[var10];
            int var16 = this.field2710[var10];
            int var17 = this.field2716[var10];
            int var18 = var8 * var17 - var9 * var16 >> 16;
            if (var13 < var2) {
                var2 = var13;
            }
            if (var13 > var5) {
                var5 = var13;
            }
            if (var15 < var3) {
                var3 = var15;
            }
            if (var15 > var6) {
                var6 = var15;
            }
            if (var18 < var4) {
                var4 = var18;
            }
            if (var18 > var7) {
                var7 = var18;
            }
        }
        class232 var20 = new class232((var2 + var5) / 2, (var3 + var6) / 2, (var4 + var7) / 2, (var5 - var2 + 1) / 2, (var6 - var3 + 1) / 2, (var7 - var4 + 1) / 2);
        boolean var21 = true;
        if (var20.field2633 < 32) {
            var20.field2633 = 32;
        }
        if (var20.field2635 < 32) {
            var20.field2635 = 32;
        }
        if (this.field2713) {
            boolean var22 = true;
            var20.field2633 += 8;
            var20.field2635 += 8;
        }
        this.field2739.put(arg0, var20);
    }

    @ObfuscatedName("jr.aq()V")
    public void method4450() {
        if (this.field2734 == 1) {
            return;
        }
        this.field2734 = 1;
        this.field2638 = 0;
        this.field2735 = 0;
        this.field2736 = 0;
        for (int var1 = 0; var1 < this.field2766; var1++) {
            int var2 = this.field2710[var1];
            int var3 = this.field2711[var1];
            int var4 = this.field2716[var1];
            if (-var3 > this.field2638) {
                this.field2638 = -var3;
            }
            if (var3 > this.field2735) {
                this.field2735 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field2736) {
                this.field2736 = var5;
            }
        }
        this.field2736 = (int) (Math.sqrt((double) this.field2736) + 0.99D);
        this.field2761 = (int) (Math.sqrt((double) (this.field2638 * this.field2638 + this.field2736 * this.field2736)) + 0.99D);
        this.field2737 = this.field2761 + (int) (Math.sqrt((double) (this.field2736 * this.field2736 + this.field2735 * this.field2735)) + 0.99D);
    }

    @ObfuscatedName("jr.al()V")
    public void method4542() {
        if (this.field2734 == 2) {
            return;
        }
        this.field2734 = 2;
        this.field2736 = 0;
        for (int var1 = 0; var1 < this.field2766; var1++) {
            int var2 = this.field2710[var1];
            int var3 = this.field2711[var1];
            int var4 = this.field2716[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field2736) {
                this.field2736 = var5;
            }
        }
        this.field2736 = (int) (Math.sqrt((double) this.field2736) + 0.99D);
        this.field2761 = this.field2736;
        this.field2737 = this.field2736 + this.field2736;
    }

    @ObfuscatedName("jr.an()I")
    public int method4452() {
        this.method4450();
        return this.field2736;
    }

    @ObfuscatedName("jr.ar()V")
    public void method4453() {
        this.field2734 = 0;
        this.field2739.clear();
    }

    @ObfuscatedName("jr.ab(Ljt;I)V")
    public void method4522(class235 arg0, int arg1) {
        if (this.field2729 == null || arg1 == -1) {
            return;
        }
        class225 var3 = arg0.field2644[arg1];
        class230 var4 = var3.field2498;
        Statics.field2762 = 0;
        Statics.field2777 = 0;
        Statics.field2764 = 0;
        for (int var5 = 0; var5 < var3.field2501; var5++) {
            int var6 = var3.field2500[var5];
            this.method4461(var4.field2559[var6], var4.field2560[var6], var3.field2504[var5], var3.field2505[var5], var3.field2506[var5]);
        }
        this.method4453();
    }

    @ObfuscatedName("jr.ag(Lfv;I)V")
    public void method4455(class138 arg0, int arg1) {
        class230 var3 = arg0.field1623;
        class228 var4 = var3.method4193();
        if (var4 != null) {
            var3.method4193().method4140(arg0, arg1);
            this.method4553(var3.method4193(), arg0.method2925());
        }
        if (arg0.method2926()) {
            this.method4456(arg0, arg1);
        }
        this.method4453();
    }

    @ObfuscatedName("jr.am(Lfv;I)V")
    public void method4456(class138 arg0, int arg1) {
        class230 var3 = arg0.field1623;
        for (int var4 = 0; var4 < var3.field2558; var4++) {
            int var5 = var3.field2559[var4];
            if (var5 == 5 && arg0.field1628 != null && arg0.field1628[var4] != null && arg0.field1628[var4][0] != null && this.field2730 != null && this.field2721 != null) {
                class131 var6 = arg0.field1628[var4][0];
                int[] var7 = var3.field2560[var4];
                int var8 = var7.length;
                for (int var9 = 0; var9 < var8; var9++) {
                    int var10 = var7[var9];
                    if (var10 < this.field2730.length) {
                        int[] var11 = this.field2730[var10];
                        for (int var12 = 0; var12 < var11.length; var12++) {
                            int var13 = var11[var12];
                            int var14 = (int) ((float) (this.field2721[var13] & 0xFF) + var6.method2866(arg1) * 255.0F);
                            if (var14 < 0) {
                                var14 = 0;
                            } else if (var14 > 255) {
                                var14 = 255;
                            }
                            this.field2721[var13] = (byte) var14;
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("jr.ax(Lim;I)V")
    public void method4553(class228 arg0, int arg1) {
        this.method4518(arg0, arg1);
    }

    @ObfuscatedName("jr.ah(Ljt;ILjt;I[I)V")
    public void method4471(class235 arg0, int arg1, class235 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method4522(arg0, arg1);
            return;
        }
        class225 var6 = arg0.field2644[arg1];
        class225 var7 = arg2.field2644[arg3];
        class230 var8 = var6.field2498;
        Statics.field2762 = 0;
        Statics.field2777 = 0;
        Statics.field2764 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field2501; var11++) {
            int var12 = var6.field2500[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field2559[var12] == 0) {
                this.method4461(var8.field2559[var12], var8.field2560[var12], var6.field2504[var11], var6.field2505[var11], var6.field2506[var11]);
            }
        }
        Statics.field2762 = 0;
        Statics.field2777 = 0;
        Statics.field2764 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field2501; var15++) {
            int var16 = var7.field2500[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field2559[var16] == 0) {
                this.method4461(var8.field2559[var16], var8.field2560[var16], var7.field2504[var15], var7.field2505[var15], var7.field2506[var15]);
            }
        }
        this.method4453();
    }

    @ObfuscatedName("jr.as(Liu;Lfv;I[ZZZ)V")
    public void method4459(class230 arg0, class138 arg1, int arg2, boolean[] arg3, boolean arg4, boolean arg5) {
        class228 var7 = arg0.method4193();
        if (var7 != null) {
            var7.method4141(arg1, arg2, arg3, arg4);
            if (arg5) {
                this.method4553(var7, arg1.method2925());
            }
        }
        if (!arg4 && arg1.method2926()) {
            this.method4456(arg1, arg2);
        }
    }

    @ObfuscatedName("jr.ay(Ljt;I[IZ)V")
    public void method4460(class235 arg0, int arg1, int[] arg2, boolean arg3) {
        if (arg2 == null) {
            this.method4522(arg0, arg1);
            return;
        }
        class225 var5 = arg0.field2644[arg1];
        class230 var6 = var5.field2498;
        byte var7 = 0;
        int var11 = var7 + 1;
        int var8 = arg2[var7];
        Statics.field2762 = 0;
        Statics.field2777 = 0;
        Statics.field2764 = 0;
        for (int var9 = 0; var9 < var5.field2501; var9++) {
            int var10 = var5.field2500[var9];
            while (var10 > var8) {
                var8 = arg2[var11++];
            }
            if (arg3) {
                if (var8 == var10 || var6.field2559[var10] == 0) {
                    this.method4461(var6.field2559[var10], var6.field2560[var10], var5.field2504[var9], var5.field2505[var9], var5.field2506[var9]);
                }
            } else if (var8 != var10 || var6.field2559[var10] == 0) {
                this.method4461(var6.field2559[var10], var6.field2560[var10], var5.field2504[var9], var5.field2505[var9], var5.field2506[var9]);
            }
        }
    }

    @ObfuscatedName("jr.aj(I[IIII)V")
    public void method4461(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field2762 = 0;
            Statics.field2777 = 0;
            Statics.field2764 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field2729.length) {
                    int[] var10 = this.field2729[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field2762 += this.field2710[var12];
                        Statics.field2777 += this.field2711[var12];
                        Statics.field2764 += this.field2716[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field2762 = Statics.field2762 / var7 + arg2;
                Statics.field2777 = Statics.field2777 / var7 + arg3;
                Statics.field2764 = Statics.field2764 / var7 + arg4;
            } else {
                Statics.field2762 = arg2;
                Statics.field2777 = arg3;
                Statics.field2764 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field2729.length) {
                    int[] var15 = this.field2729[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field2710[var17] += arg2;
                        this.field2711[var17] += arg3;
                        this.field2716[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field2729.length) {
                    int[] var20 = this.field2729[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field2710[var22] -= Statics.field2762;
                        this.field2711[var22] -= Statics.field2777;
                        this.field2716[var22] -= Statics.field2764;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field2768[var25];
                            int var27 = field2769[var25];
                            int var28 = this.field2711[var22] * var26 + this.field2710[var22] * var27 >> 16;
                            this.field2711[var22] = this.field2711[var22] * var27 - this.field2710[var22] * var26 >> 16;
                            this.field2710[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field2768[var23];
                            int var30 = field2769[var23];
                            int var31 = this.field2711[var22] * var30 - this.field2716[var22] * var29 >> 16;
                            this.field2716[var22] = this.field2716[var22] * var30 + this.field2711[var22] * var29 >> 16;
                            this.field2711[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field2768[var24];
                            int var33 = field2769[var24];
                            int var34 = this.field2716[var22] * var32 + this.field2710[var22] * var33 >> 16;
                            this.field2716[var22] = this.field2716[var22] * var33 - this.field2710[var22] * var32 >> 16;
                            this.field2710[var22] = var34;
                        }
                        this.field2710[var22] += Statics.field2762;
                        this.field2711[var22] += Statics.field2777;
                        this.field2716[var22] += Statics.field2764;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field2729.length) {
                    int[] var37 = this.field2729[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field2710[var39] -= Statics.field2762;
                        this.field2711[var39] -= Statics.field2777;
                        this.field2716[var39] -= Statics.field2764;
                        this.field2710[var39] = this.field2710[var39] * arg2 / 128;
                        this.field2711[var39] = this.field2711[var39] * arg3 / 128;
                        this.field2716[var39] = this.field2716[var39] * arg4 / 128;
                        this.field2710[var39] += Statics.field2762;
                        this.field2711[var39] += Statics.field2777;
                        this.field2716[var39] += Statics.field2764;
                    }
                }
            }
        } else if (arg0 == 5 && this.field2730 != null && this.field2721 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field2730.length) {
                    int[] var42 = this.field2730[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field2721[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field2721[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("jr.av()V")
    public void method4462() {
        for (int var1 = 0; var1 < this.field2766; var1++) {
            int var2 = this.field2710[var1];
            this.field2710[var1] = this.field2716[var1];
            this.field2716[var1] = -var2;
        }
        this.method4453();
    }

    @ObfuscatedName("jr.aw()V")
    public void method4463() {
        for (int var1 = 0; var1 < this.field2766; var1++) {
            this.field2710[var1] = -this.field2710[var1];
            this.field2716[var1] = -this.field2716[var1];
        }
        this.method4453();
    }

    @ObfuscatedName("jr.ak()V")
    public void method4464() {
        for (int var1 = 0; var1 < this.field2766; var1++) {
            int var2 = this.field2716[var1];
            this.field2716[var1] = this.field2710[var1];
            this.field2710[var1] = -var2;
        }
        this.method4453();
    }

    @ObfuscatedName("jr.bh(I)V")
    public void method4505(int arg0) {
        int var2 = field2768[arg0];
        int var3 = field2769[arg0];
        for (int var4 = 0; var4 < this.field2766; var4++) {
            int var5 = this.field2711[var4] * var3 - this.field2716[var4] * var2 >> 16;
            this.field2716[var4] = this.field2716[var4] * var3 + this.field2711[var4] * var2 >> 16;
            this.field2711[var4] = var5;
        }
        this.method4453();
    }

    @ObfuscatedName("jr.bj(III)V")
    public void method4451(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2766; var4++) {
            this.field2710[var4] += arg0;
            this.field2711[var4] += arg1;
            this.field2716[var4] += arg2;
        }
        this.method4453();
    }

    @ObfuscatedName("jr.bk(III)V")
    public void method4467(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2766; var4++) {
            this.field2710[var4] = this.field2710[var4] * arg0 / 128;
            this.field2711[var4] = this.field2711[var4] * arg1 / 128;
            this.field2716[var4] = this.field2716[var4] * arg2 / 128;
        }
        this.method4453();
    }

    @ObfuscatedName("jr.bv(IIIIIII)V")
    public final void method4458(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field2734 != 2 && this.field2734 != 1) {
            this.method4542();
        }
        int var8 = class227.method4056();
        int var9 = class227.method4057();
        int var10 = field2768[arg0];
        int var11 = field2769[arg0];
        int var12 = field2768[arg1];
        int var13 = field2769[arg1];
        int var14 = field2768[arg2];
        int var15 = field2769[arg2];
        int var16 = field2768[arg3];
        int var17 = field2769[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field2766; var19++) {
            int var20 = this.field2710[var19];
            int var21 = this.field2711[var19];
            int var22 = this.field2716[var19];
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
            field2746[var19] = var30 - var18;
            field2743[var19] = var8 + var26 * class227.method4062() / var30;
            field2744[var19] = var9 + var29 * class227.method4062() / var30;
            field2749[var19] = class239.method5079(var30);
            if (this.field2725 > 0) {
                field2747[var19] = var26;
                field2748[var19] = var29;
                field2754[var19] = var30;
            }
        }
        try {
            this.method4470(false, false, false, 0L);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("jr.bt(IIIIIIII)V")
    public final void method4469(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (this.field2734 != 2 && this.field2734 != 1) {
            this.method4542();
        }
        int var9 = class227.method4056();
        int var10 = class227.method4057();
        int var11 = field2768[arg0];
        int var12 = field2769[arg0];
        int var13 = field2768[arg1];
        int var14 = field2769[arg1];
        int var15 = field2768[arg2];
        int var16 = field2769[arg2];
        int var17 = field2768[arg3];
        int var18 = field2769[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field2766; var20++) {
            int var21 = this.field2710[var20];
            int var22 = this.field2711[var20];
            int var23 = this.field2716[var20];
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
            field2746[var20] = var31 - var19;
            field2743[var20] = var9 + var27 * class227.method4062() / arg7;
            field2744[var20] = var10 + var30 * class227.method4062() / arg7;
            field2749[var20] = class239.method5079(arg7);
            if (this.field2725 > 0) {
                field2747[var20] = var27;
                field2748[var20] = var30;
                field2754[var20] = var31;
            }
        }
        try {
            this.method4470(false, false, false, 0L);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("jr.db(IIIIIIIIJ)V")
    public void method4382(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        if (this.field2734 != 1) {
            this.method4450();
        }
        this.method4550(arg0);
        int var11 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var12 = arg1 * arg6 + arg2 * var11 >> 16;
        int var13 = this.field2736 * arg2 >> 16;
        int var14 = var12 + var13;
        if (var14 <= 50 || var12 >= 3500) {
            return;
        }
        int var15 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var16 = (var15 - this.field2736) * class227.method4062();
        if (var16 / var14 >= class227.method4055()) {
            return;
        }
        int var17 = (this.field2736 + var15) * class227.method4062();
        if (var17 / var14 <= class227.method4058()) {
            return;
        }
        int var18 = arg2 * arg6 - arg1 * var11 >> 16;
        int var19 = this.field2736 * arg1 >> 16;
        int var20 = (this.field2735 * arg2 >> 16) + var19;
        int var21 = (var18 + var20) * class227.method4062();
        if (var21 / var14 <= class227.method4061()) {
            return;
        }
        int var22 = (this.field2638 * arg2 >> 16) + var19;
        int var23 = (var18 - var22) * class227.method4062();
        if (var23 / var14 >= class227.method4060()) {
            return;
        }
        int var24 = (this.field2638 * arg1 >> 16) + var13;
        boolean var25 = false;
        boolean var26 = false;
        if (var12 - var24 <= 50) {
            var26 = true;
        }
        boolean var27 = var26 || this.field2725 > 0;
        int var28 = class241.field2781;
        int var30 = class241.field2784;
        boolean var32 = class241.method1075();
        boolean var33 = arg8 != 0L;
        if (var33) {
            boolean var34 = (int) (arg8 >>> 16 & 0x1L) == 1;
            var33 = !var34;
        }
        boolean var37 = false;
        if (var33 && var32) {
            boolean var38 = false;
            if (field2765) {
                boolean var40;
                if (class241.method1075()) {
                    class241.method90();
                    class232 var41 = (class232) this.field2739.get(arg0);
                    int var42 = var41.field2636 + arg5;
                    int var43 = var41.field2630 + arg6;
                    int var44 = var41.field2632 + arg7;
                    int var45 = var41.field2633;
                    int var46 = var41.field2634;
                    int var47 = var41.field2635;
                    int var48 = Statics.field2780 - var42;
                    int var49 = Statics.field2794 - var43;
                    int var50 = Statics.field2786 - var44;
                    if (Math.abs(var48) > Statics.field2788 + var45) {
                        var40 = false;
                    } else if (Math.abs(var49) > Statics.field26 + var46) {
                        var40 = false;
                    } else if (Math.abs(var50) > Statics.field168 + var47) {
                        var40 = false;
                    } else if (Math.abs(Statics.field2782 * var50 - Statics.field2643 * var49) > Statics.field26 * var47 + Statics.field168 * var46) {
                        var40 = false;
                    } else if (Math.abs(Statics.field2643 * var48 - Statics.field2968 * var50) > Statics.field2788 * var47 + Statics.field168 * var45) {
                        var40 = false;
                    } else if (Math.abs(Statics.field2968 * var49 - Statics.field2782 * var48) > Statics.field2788 * var46 + Statics.field26 * var45) {
                        var40 = false;
                    } else {
                        var40 = true;
                    }
                } else {
                    var40 = false;
                }
                var38 = var40;
            } else {
                int var51 = var12 - var13;
                if (var51 <= 50) {
                    var51 = 50;
                }
                int var52;
                int var53;
                if (var15 > 0) {
                    var52 = var16 / var14;
                    var53 = var17 / var51;
                } else {
                    var53 = var17 / var14;
                    var52 = var16 / var51;
                }
                int var54;
                int var55;
                if (var18 > 0) {
                    var54 = var23 / var14;
                    var55 = var21 / var51;
                } else {
                    var55 = var21 / var14;
                    var54 = var23 / var51;
                }
                int var56 = var28 - class227.method4056();
                int var57 = var30 - class227.method4057();
                if (var56 > var52 && var56 < var53 && var57 > var54 && var57 < var55) {
                    var38 = true;
                }
            }
            if (var38) {
                if (this.field2713) {
                    class241.field2796[++class241.field2789 - 1] = arg8;
                } else {
                    var37 = true;
                }
            }
        }
        int var60 = class227.method4056();
        int var61 = class227.method4057();
        int var62 = 0;
        int var63 = 0;
        if (arg0 != 0) {
            var62 = field2768[arg0];
            var63 = field2769[arg0];
        }
        for (int var64 = 0; var64 < this.field2766; var64++) {
            int var65 = this.field2710[var64];
            int var66 = this.field2711[var64];
            int var67 = this.field2716[var64];
            if (arg0 != 0) {
                int var68 = var62 * var67 + var63 * var65 >> 16;
                var67 = var63 * var67 - var62 * var65 >> 16;
                var65 = var68;
            }
            int var69 = arg5 + var65;
            int var70 = arg6 + var66;
            int var71 = arg7 + var67;
            int var72 = arg3 * var71 + arg4 * var69 >> 16;
            int var73 = arg4 * var71 - arg3 * var69 >> 16;
            int var75 = arg2 * var70 - arg1 * var73 >> 16;
            int var76 = arg1 * var70 + arg2 * var73 >> 16;
            field2746[var64] = var76 - var12;
            if (var76 >= 50) {
                field2743[var64] = var60 + var72 * class227.method4062() / var76;
                field2744[var64] = var61 + var75 * class227.method4062() / var76;
                field2749[var64] = class239.method5079(var76);
            } else {
                field2743[var64] = -5000;
                var25 = true;
            }
            if (var27) {
                field2747[var64] = var72;
                field2748[var64] = var75;
                field2754[var64] = var76;
            }
        }
        try {
            this.method4470(var25, var37, this.field2713, arg8);
        } catch (Exception var79) {
        }
    }

    @ObfuscatedName("jr.bd(ZZZJ)V")
    public final void method4470(boolean arg0, boolean arg1, boolean arg2, long arg3) {
        if (this.field2737 >= 6000) {
            return;
        }
        for (int var6 = 0; var6 < this.field2737; var6++) {
            field2751[var6] = 0;
        }
        int var7 = arg2 ? 20 : 5;
        for (char var8 = 0; var8 < this.field2712; var8++) {
            if (this.field2719[var8] != -2) {
                int var9 = this.field2728[var8];
                int var10 = this.field2715[var8];
                int var11 = this.field2776[var8];
                int var12 = field2743[var9];
                int var13 = field2743[var10];
                int var14 = field2743[var11];
                if (arg0 && var12 == -5000 || var13 == -5000 || var14 == -5000) {
                    int var15 = field2747[var9];
                    int var16 = field2747[var10];
                    int var17 = field2747[var11];
                    int var18 = field2748[var9];
                    int var19 = field2748[var10];
                    int var20 = field2748[var11];
                    int var21 = field2754[var9];
                    int var22 = field2754[var10];
                    int var23 = field2754[var11];
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
                        field2742[var8] = true;
                        int var33 = (field2746[var9] + field2746[var10] + field2746[var11]) / 3 + this.field2761;
                        field2752[var33][field2751[var33]++] = var8;
                    }
                } else {
                    if (arg1) {
                        int var34 = field2744[var9];
                        int var35 = field2744[var10];
                        int var36 = field2744[var11];
                        int var37 = class241.field2784 + var7;
                        boolean var38;
                        if (var37 < var34 && var37 < var35 && var37 < var36) {
                            var38 = false;
                        } else {
                            int var39 = class241.field2784 - var7;
                            if (var39 > var34 && var39 > var35 && var39 > var36) {
                                var38 = false;
                            } else {
                                int var40 = class241.field2781 + var7;
                                if (var40 < var12 && var40 < var13 && var40 < var14) {
                                    var38 = false;
                                } else {
                                    int var41 = class241.field2781 - var7;
                                    if (var41 > var12 && var41 > var13 && var41 > var14) {
                                        var38 = false;
                                    } else {
                                        var38 = true;
                                    }
                                }
                            }
                        }
                        if (var38) {
                            class241.field2796[++class241.field2789 - 1] = arg3;
                            arg1 = false;
                        }
                    }
                    if ((field2744[var11] - field2744[var10]) * (var12 - var13) - (field2744[var9] - field2744[var10]) * (var14 - var13) > 0) {
                        field2742[var8] = false;
                        int var44 = class227.method4063();
                        if (var12 >= 0 && var13 >= 0 && var14 >= 0 && var12 <= var44 && var13 <= var44 && var14 <= var44) {
                            field2741[var8] = false;
                        } else {
                            field2741[var8] = true;
                        }
                        int var45 = (field2746[var9] + field2746[var10] + field2746[var11]) / 3 + this.field2761;
                        field2752[var45][field2751[var45]++] = var8;
                    }
                }
            }
        }
        if (this.field2775 == null) {
            for (int var46 = this.field2737 - 1; var46 >= 0; var46--) {
                char var47 = field2751[var46];
                if (var47 > 0) {
                    char[] var48 = field2752[var46];
                    for (int var49 = 0; var49 < var47; var49++) {
                        this.method4443(var48[var49]);
                    }
                }
            }
            return;
        }
        for (int var50 = 0; var50 < 12; var50++) {
            field2753[var50] = 0;
            field2757[var50] = 0;
        }
        for (int var51 = this.field2737 - 1; var51 >= 0; var51--) {
            char var52 = field2751[var51];
            if (var52 > 0) {
                char[] var53 = field2752[var51];
                for (int var54 = 0; var54 < var52; var54++) {
                    char var55 = var53[var54];
                    byte var56 = this.field2775[var55];
                    int var57 = field2753[var56]++;
                    field2750[var56][var57] = var55;
                    if (var56 < 10) {
                        field2757[var56] += var51;
                    } else if (var56 == 10) {
                        field2755[var57] = var51;
                    } else {
                        field2709[var57] = var51;
                    }
                }
            }
        }
        int var58 = 0;
        if (field2753[1] > 0 || field2753[2] > 0) {
            var58 = (field2757[1] + field2757[2]) / (field2753[1] + field2753[2]);
        }
        int var59 = 0;
        if (field2753[3] > 0 || field2753[4] > 0) {
            var59 = (field2757[3] + field2757[4]) / (field2753[3] + field2753[4]);
        }
        int var60 = 0;
        if (field2753[6] > 0 || field2753[8] > 0) {
            var60 = (field2757[6] + field2757[8]) / (field2753[6] + field2753[8]);
        }
        int var61 = 0;
        int var62 = field2753[10];
        int[] var63 = field2750[10];
        int[] var64 = field2755;
        if (var61 == var62) {
            var61 = 0;
            var62 = field2753[11];
            var63 = field2750[11];
            var64 = field2709;
        }
        int var65;
        if (var61 < var62) {
            var65 = var64[var61];
        } else {
            var65 = -1000;
        }
        for (int var66 = 0; var66 < 10; var66++) {
            while (var66 == 0 && var65 > var58) {
                this.method4443(var63[var61++]);
                if (var61 == var62 && field2750[11] != var63) {
                    var61 = 0;
                    var62 = field2753[11];
                    var63 = field2750[11];
                    var64 = field2709;
                }
                if (var61 < var62) {
                    var65 = var64[var61];
                } else {
                    var65 = -1000;
                }
            }
            while (var66 == 3 && var65 > var59) {
                this.method4443(var63[var61++]);
                if (var61 == var62 && field2750[11] != var63) {
                    var61 = 0;
                    var62 = field2753[11];
                    var63 = field2750[11];
                    var64 = field2709;
                }
                if (var61 < var62) {
                    var65 = var64[var61];
                } else {
                    var65 = -1000;
                }
            }
            while (var66 == 5 && var65 > var60) {
                this.method4443(var63[var61++]);
                if (var61 == var62 && field2750[11] != var63) {
                    var61 = 0;
                    var62 = field2753[11];
                    var63 = field2750[11];
                    var64 = field2709;
                }
                if (var61 < var62) {
                    var65 = var64[var61];
                } else {
                    var65 = -1000;
                }
            }
            int var67 = field2753[var66];
            int[] var68 = field2750[var66];
            for (int var69 = 0; var69 < var67; var69++) {
                this.method4443(var68[var69]);
            }
        }
        while (var65 != -1000) {
            this.method4443(var63[var61++]);
            if (var61 == var62 && field2750[11] != var63) {
                var61 = 0;
                var63 = field2750[11];
                var62 = field2753[11];
                var64 = field2709;
            }
            if (var61 < var62) {
                var65 = var64[var61];
            } else {
                var65 = -1000;
            }
        }
    }

    @ObfuscatedName("jr.by(I)V")
    public final void method4443(int arg0) {
        if (field2742[arg0]) {
            this.method4474(arg0);
            return;
        }
        int var2 = this.field2728[arg0];
        int var3 = this.field2715[arg0];
        int var4 = this.field2776[arg0];
        class227.field2537.field2817 = field2741[arg0];
        if (this.field2721 == null) {
            class227.field2537.field2824 = 0;
        } else {
            class227.field2537.field2824 = (this.field2721[arg0] == -1 ? 253 : this.field2721[arg0]) & 0xFF;
        }
        this.method4539(arg0, field2744[var2], field2744[var3], field2744[var4], field2743[var2], field2743[var3], field2743[var4], field2749[var2], field2749[var3], field2749[var4], this.field2717[arg0], this.field2718[arg0], this.field2719[arg0]);
    }

    @ObfuscatedName("jr.bs(I)Z")
    public boolean method4472(int arg0) {
        return this.field2778 > 0 && arg0 < this.field2779;
    }

    @ObfuscatedName("jr.bm(IIIIIIIFFFIII)V")
    public final void method4539(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float arg7, float arg8, float arg9, int arg10, int arg11, int arg12) {
        if (this.field2723 == null || this.field2723[arg0] == -1) {
            boolean var18 = this.method4472(arg0);
            if (this.field2719[arg0] == -1 && var18) {
                class227.method4129(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, field2770[this.field2717[arg0]], this.field2772, this.field2740, this.field2738, this.field2778);
            } else if (this.field2719[arg0] == -1) {
                class227.method4131(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, field2770[this.field2717[arg0]]);
            } else if (var18) {
                class227.method4123(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, this.field2772, this.field2740, this.field2738, this.field2778);
            } else {
                class227.method4074(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12);
            }
            return;
        }
        int var15;
        int var16;
        int var17;
        if (this.field2722 == null || this.field2722[arg0] == -1) {
            var15 = this.field2728[arg0];
            var16 = this.field2715[arg0];
            var17 = this.field2776[arg0];
        } else {
            int var14 = this.field2722[arg0] & 0xFF;
            var15 = this.field2726[var14];
            var16 = this.field2727[var14];
            var17 = this.field2720[var14];
        }
        if (this.field2719[arg0] == -1) {
            class227.method4072(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg10, arg10, field2747[var15], field2747[var16], field2747[var17], field2748[var15], field2748[var16], field2748[var17], field2754[var15], field2754[var16], field2754[var17], this.field2723[arg0]);
        } else {
            class227.method4072(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, field2747[var15], field2747[var16], field2747[var17], field2748[var15], field2748[var16], field2748[var17], field2754[var15], field2754[var16], field2754[var17], this.field2723[arg0]);
        }
    }

    @ObfuscatedName("jr.bf(I)V")
    public final void method4474(int arg0) {
        int var2 = class227.method4056();
        int var3 = class227.method4057();
        int var4 = 0;
        int var5 = this.field2728[arg0];
        int var6 = this.field2715[arg0];
        int var7 = this.field2776[arg0];
        int var8 = field2754[var5];
        int var9 = field2754[var6];
        int var10 = field2754[var7];
        if (this.field2721 == null) {
            class227.field2537.field2824 = 0;
        } else {
            class227.field2537.field2824 = this.field2721[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field2758[var4] = field2743[var5];
            field2759[var4] = field2744[var5];
            field2763[var4] = field2749[var7];
            field2760[var4++] = this.field2717[arg0];
        } else {
            int var11 = field2747[var5];
            int var12 = field2748[var5];
            int var13 = this.field2717[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field2733[var10 - var8];
                field2758[var4] = var2 + (((field2747[var7] - var11) * var14 >> 16) + var11) * class227.method4062() / 50;
                field2759[var4] = var3 + (((field2748[var7] - var12) * var14 >> 16) + var12) * class227.method4062() / 50;
                field2763[var4] = field2774;
                field2760[var4++] = ((this.field2719[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field2733[var9 - var8];
                field2758[var4] = var2 + (((field2747[var6] - var11) * var15 >> 16) + var11) * class227.method4062() / 50;
                field2759[var4] = var3 + (((field2748[var6] - var12) * var15 >> 16) + var12) * class227.method4062() / 50;
                field2763[var4] = field2774;
                field2760[var4++] = ((this.field2718[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field2758[var4] = field2743[var6];
            field2759[var4] = field2744[var6];
            field2763[var4] = field2749[var7];
            field2760[var4++] = this.field2718[arg0];
        } else {
            int var16 = field2747[var6];
            int var17 = field2748[var6];
            int var18 = this.field2718[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field2733[var8 - var9];
                field2758[var4] = var2 + (((field2747[var5] - var16) * var19 >> 16) + var16) * class227.method4062() / 50;
                field2759[var4] = var3 + (((field2748[var5] - var17) * var19 >> 16) + var17) * class227.method4062() / 50;
                field2763[var4] = field2774;
                field2760[var4++] = ((this.field2717[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field2733[var10 - var9];
                field2758[var4] = var2 + (((field2747[var7] - var16) * var20 >> 16) + var16) * class227.method4062() / 50;
                field2759[var4] = var3 + (((field2748[var7] - var17) * var20 >> 16) + var17) * class227.method4062() / 50;
                field2760[var4++] = ((this.field2719[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field2758[var4] = field2743[var7];
            field2759[var4] = field2744[var7];
            field2763[var4] = field2749[var7];
            field2760[var4++] = this.field2719[arg0];
        } else {
            int var21 = field2747[var7];
            int var22 = field2748[var7];
            int var23 = this.field2719[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field2733[var9 - var10];
                field2758[var4] = var2 + (((field2747[var6] - var21) * var24 >> 16) + var21) * class227.method4062() / 50;
                field2759[var4] = var3 + (((field2748[var6] - var22) * var24 >> 16) + var22) * class227.method4062() / 50;
                field2763[var4] = field2774;
                field2760[var4++] = ((this.field2718[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field2733[var8 - var10];
                field2758[var4] = var2 + (((field2747[var5] - var21) * var25 >> 16) + var21) * class227.method4062() / 50;
                field2759[var4] = var3 + (((field2748[var5] - var22) * var25 >> 16) + var22) * class227.method4062() / 50;
                field2763[var4] = field2774;
                field2760[var4++] = ((this.field2717[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field2758[0];
        int var27 = field2758[1];
        int var28 = field2758[2];
        int var29 = field2759[0];
        int var30 = field2759[1];
        int var31 = field2759[2];
        float var32 = field2763[0];
        float var33 = field2763[1];
        float var34 = field2763[2];
        class227.field2537.field2817 = false;
        int var35 = class227.method4063();
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > var35 || var27 > var35 || var28 > var35) {
                class227.field2537.field2817 = true;
            }
            this.method4539(arg0, var29, var30, var31, var26, var27, var28, var32, var33, var34, field2760[0], field2760[1], field2760[2]);
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > var35 || var27 > var35 || var28 > var35 || field2758[3] < 0 || field2758[3] > var35) {
            class227.field2537.field2817 = true;
        }
        if (this.field2723 == null || this.field2723[arg0] == -1) {
            boolean var41 = this.method4472(arg0);
            if (this.field2719[arg0] == -1 && var41) {
                int var42 = field2770[this.field2717[arg0]];
                class227.method4129(var29, var30, var31, var26, var27, var28, var32, var33, var34, var42, this.field2772, this.field2740, this.field2738, this.field2778);
                class227.method4129(var29, var31, field2759[3], var26, var28, field2758[3], var32, var34, field2763[3], var42, this.field2772, this.field2740, this.field2738, this.field2778);
            } else if (this.field2719[arg0] == -1) {
                int var43 = field2770[this.field2717[arg0]];
                class227.method4131(var29, var30, var31, var26, var27, var28, var32, var33, var34, var43);
                class227.method4131(var29, var31, field2759[3], var26, var28, field2758[3], var32, var34, field2763[3], var43);
            } else if (var41) {
                class227.method4123(var29, var30, var31, var26, var27, var28, var32, var33, var34, field2760[0], field2760[1], field2760[2], this.field2772, this.field2738, this.field2740, this.field2778);
                class227.method4123(var29, var31, field2759[3], var26, var28, field2758[3], 0.0F, 0.0F, 0.0F, field2760[0], field2760[2], field2760[3], this.field2772, this.field2738, this.field2740, this.field2778);
            } else {
                class227.method4074(var29, var30, var31, var26, var27, var28, var32, var33, var34, field2760[0], field2760[1], field2760[2]);
                class227.method4074(var29, var31, field2759[3], var26, var28, field2758[3], var32, var34, field2763[3], field2760[0], field2760[2], field2760[3]);
            }
            return;
        }
        int var37;
        int var38;
        int var39;
        if (this.field2722 == null || this.field2722[arg0] == -1) {
            var37 = var5;
            var38 = var6;
            var39 = var7;
        } else {
            int var36 = this.field2722[arg0] & 0xFF;
            var37 = this.field2726[var36];
            var38 = this.field2727[var36];
            var39 = this.field2720[var36];
        }
        short var40 = this.field2723[arg0];
        if (this.field2719[arg0] == -1) {
            class227.method4072(var29, var30, var31, var26, var27, var28, var32, var33, var34, this.field2717[arg0], this.field2717[arg0], this.field2717[arg0], field2747[var37], field2747[var38], field2747[var39], field2748[var37], field2748[var38], field2748[var39], field2754[var37], field2754[var38], field2754[var39], var40);
            class227.method4072(var29, var31, field2759[3], var26, var28, field2758[3], var32, var34, field2763[3], this.field2717[arg0], this.field2717[arg0], this.field2717[arg0], field2747[var37], field2747[var38], field2747[var39], field2748[var37], field2748[var38], field2748[var39], field2754[var37], field2754[var38], field2754[var39], var40);
        } else {
            class227.method4072(var29, var30, var31, var26, var27, var28, var32, var33, var34, field2760[0], field2760[1], field2760[2], field2747[var37], field2747[var38], field2747[var39], field2748[var37], field2748[var38], field2748[var39], field2754[var37], field2754[var38], field2754[var39], var40);
            class227.method4072(var29, var31, field2759[3], var26, var28, field2758[3], var32, var34, field2763[3], field2760[0], field2760[2], field2760[3], field2747[var37], field2747[var38], field2747[var39], field2748[var37], field2748[var38], field2748[var39], field2754[var37], field2754[var38], field2754[var39], var40);
        }
    }

    @ObfuscatedName("jr.bq(ILrz;)V")
    public void method4488(int arg0, class451 arg1) {
        float var3 = (float) this.field2710[arg0];
        float var4 = (float) (-this.field2711[arg0]);
        float var5 = (float) (-this.field2716[arg0]);
        float var6 = 1.0F;
        this.field2710[arg0] = (int) (arg1.field4740[12] * var6 + arg1.field4740[8] * var5 + arg1.field4740[0] * var3 + arg1.field4740[4] * var4);
        this.field2711[arg0] = -((int) (arg1.field4740[13] * var6 + arg1.field4740[9] * var5 + arg1.field4740[1] * var3 + arg1.field4740[5] * var4));
        this.field2716[arg0] = -((int) (arg1.field4740[14] * var6 + arg1.field4740[10] * var5 + arg1.field4740[2] * var3 + arg1.field4740[6] * var4));
    }

    @ObfuscatedName("jr.ba(Lim;I)V")
    public void method4518(class228 arg0, int arg1) {
        if (this.field2731 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field2766; var3++) {
            int[] var4 = this.field2731[var3];
            if (var4 != null && var4.length != 0) {
                int[] var5 = this.field2756[var3];
                field2706.method7523();
                for (int var6 = 0; var6 < var4.length; var6++) {
                    int var7 = var4[var6];
                    class128 var8 = arg0.method4138(var7);
                    if (var8 != null) {
                        field2707.method7525((float) var5[var6] / 255.0F);
                        field2708.method7549(var8.method2820(arg1));
                        field2708.method7565(field2707);
                        field2706.method7527(field2708);
                    }
                }
                this.method4488(var3, field2706);
            }
        }
    }
}
