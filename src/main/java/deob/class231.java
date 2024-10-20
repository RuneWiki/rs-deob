package deob;

import java.util.HashMap;

@ObfuscatedName("ix")
public class class231 extends class225 {

    @ObfuscatedName("ix.aj")
    public static class231 field2701 = new class231();

    @ObfuscatedName("ix.al")
    public static byte[] field2653 = new byte[1];

    @ObfuscatedName("ix.ac")
    public static class231 field2654 = new class231();

    @ObfuscatedName("ix.ab")
    public static byte[] field2722 = new byte[1];

    @ObfuscatedName("ix.an")
    public static class422 field2657 = new class422();

    @ObfuscatedName("ix.ao")
    public static class422 field2661 = new class422();

    @ObfuscatedName("ix.av")
    public static class422 field2725 = new class422();

    @ObfuscatedName("ix.aq")
    public int field2659 = 0;

    @ObfuscatedName("ix.ap")
    public int[] field2660;

    @ObfuscatedName("ix.ar")
    public int[] field2711;

    @ObfuscatedName("ix.ak")
    public int[] field2662;

    @ObfuscatedName("ix.ax")
    public int field2691 = 0;

    @ObfuscatedName("ix.as")
    public int[] field2664;

    @ObfuscatedName("ix.ay")
    public int[] field2665;

    @ObfuscatedName("ix.am")
    public int[] field2655;

    @ObfuscatedName("ix.az")
    public int[] field2667;

    @ObfuscatedName("ix.ae")
    public int[] field2668;

    @ObfuscatedName("ix.au")
    public int[] field2707;

    @ObfuscatedName("ix.ag")
    public byte[] field2658;

    @ObfuscatedName("ix.at")
    public byte[] field2671;

    @ObfuscatedName("ix.af")
    public byte[] field2672;

    @ObfuscatedName("ix.ai")
    public short[] field2673;

    @ObfuscatedName("ix.aw")
    public byte field2674 = 0;

    @ObfuscatedName("ix.aa")
    public int field2675 = 0;

    @ObfuscatedName("ix.ah")
    public int[] field2676;

    @ObfuscatedName("ix.ad")
    public int[] field2677;

    @ObfuscatedName("ix.bm")
    public int[] field2678;

    @ObfuscatedName("ix.bv")
    public int[][] field2679;

    @ObfuscatedName("ix.bo")
    public int[][] field2680;

    @ObfuscatedName("ix.bs")
    public int[][] field2681;

    @ObfuscatedName("ix.bg")
    public int[][] field2682;

    @ObfuscatedName("ix.bh")
    public boolean field2683 = false;

    @ObfuscatedName("ix.bl")
    public int field2684;

    @ObfuscatedName("ix.bk")
    public int field2686;

    @ObfuscatedName("ix.br")
    public int field2710;

    @ObfuscatedName("ix.ba")
    public int field2695;

    @ObfuscatedName("ix.bz")
    public int field2698;

    @ObfuscatedName("ix.bq")
    public HashMap field2689 = new HashMap();

    @ObfuscatedName("ix.bt")
    public static boolean[] field2688 = new boolean[6500];

    @ObfuscatedName("ix.be")
    public static boolean[] field2692 = new boolean[6500];

    @ObfuscatedName("ix.bu")
    public static int[] field2716 = new int[6500];

    @ObfuscatedName("ix.bd")
    public static int[] field2694 = new int[6500];

    @ObfuscatedName("ix.by")
    public static int[] field2670 = new int[6500];

    @ObfuscatedName("ix.bp")
    public static int[] field2696 = new int[6500];

    @ObfuscatedName("ix.bb")
    public static int[] field2652 = new int[6500];

    @ObfuscatedName("ix.bx")
    public static int[] field2656 = new int[6500];

    @ObfuscatedName("ix.bj")
    public static char[] field2700 = new char[6000];

    @ObfuscatedName("ix.bf")
    public static char[][] field2669 = new char[6000][512];

    @ObfuscatedName("ix.bw")
    public static int[] field2697 = new int[12];

    @ObfuscatedName("ix.bi")
    public static int[][] field2703 = new int[12][2000];

    @ObfuscatedName("ix.ca")
    public static int[] field2704 = new int[2000];

    @ObfuscatedName("ix.cb")
    public static int[] field2685 = new int[2000];

    @ObfuscatedName("ix.co")
    public static int[] field2706 = new int[12];

    @ObfuscatedName("ix.cj")
    public static int[] field2724 = new int[10];

    @ObfuscatedName("ix.cn")
    public static int[] field2663 = new int[10];

    @ObfuscatedName("ix.ce")
    public static int[] field2705 = new int[10];

    @ObfuscatedName("ix.ct")
    public static boolean field2713 = true;

    @ObfuscatedName("ix.cz")
    public static int[] field2687 = class220.field2482;

    @ObfuscatedName("ix.cg")
    public static int[] field2717 = class220.field2470;

    @ObfuscatedName("ix.ch")
    public static int[] field2718 = class220.field2488;

    @ObfuscatedName("ix.cs")
    public static int[] field2719 = class220.field2474;

    @ObfuscatedName("ix.cu")
    public byte field2709;

    @ObfuscatedName("ix.cm")
    public byte field2723;

    @ObfuscatedName("ix.cw")
    public byte field2666;

    @ObfuscatedName("ix.cp")
    public byte field2708;

    @ObfuscatedName("ix.ci")
    public short field2726;

    public class231() {
    }

    public class231(class231[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field2659 = 0;
        this.field2691 = 0;
        this.field2675 = 0;
        this.field2674 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class231 var8 = arg0[var7];
            if (var8 != null) {
                this.field2659 += var8.field2659;
                this.field2691 += var8.field2691;
                this.field2675 += var8.field2675;
                if (var8.field2658 == null) {
                    if (this.field2674 == -1) {
                        this.field2674 = var8.field2674;
                    }
                    if (this.field2674 != var8.field2674) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field2671 != null;
                var5 |= var8.field2673 != null;
                var6 |= var8.field2672 != null;
            }
        }
        this.field2660 = new int[this.field2659];
        this.field2711 = new int[this.field2659];
        this.field2662 = new int[this.field2659];
        this.field2664 = new int[this.field2691];
        this.field2665 = new int[this.field2691];
        this.field2655 = new int[this.field2691];
        this.field2667 = new int[this.field2691];
        this.field2668 = new int[this.field2691];
        this.field2707 = new int[this.field2691];
        if (var3) {
            this.field2658 = new byte[this.field2691];
        }
        if (var4) {
            this.field2671 = new byte[this.field2691];
        }
        if (var5) {
            this.field2673 = new short[this.field2691];
        }
        if (var6) {
            this.field2672 = new byte[this.field2691];
        }
        if (this.field2675 > 0) {
            this.field2676 = new int[this.field2675];
            this.field2677 = new int[this.field2675];
            this.field2678 = new int[this.field2675];
        }
        this.field2659 = 0;
        this.field2691 = 0;
        this.field2675 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class231 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field2691; var11++) {
                    this.field2664[this.field2691] = var10.field2664[var11] + this.field2659;
                    this.field2665[this.field2691] = var10.field2665[var11] + this.field2659;
                    this.field2655[this.field2691] = var10.field2655[var11] + this.field2659;
                    this.field2667[this.field2691] = var10.field2667[var11];
                    this.field2668[this.field2691] = var10.field2668[var11];
                    this.field2707[this.field2691] = var10.field2707[var11];
                    if (var3) {
                        if (var10.field2658 == null) {
                            this.field2658[this.field2691] = var10.field2674;
                        } else {
                            this.field2658[this.field2691] = var10.field2658[var11];
                        }
                    }
                    if (var4 && var10.field2671 != null) {
                        this.field2671[this.field2691] = var10.field2671[var11];
                    }
                    if (var5) {
                        if (var10.field2673 == null) {
                            this.field2673[this.field2691] = -1;
                        } else {
                            this.field2673[this.field2691] = var10.field2673[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field2672 == null || var10.field2672[var11] == -1) {
                            this.field2672[this.field2691] = -1;
                        } else {
                            this.field2672[this.field2691] = (byte) (var10.field2672[var11] + this.field2675);
                        }
                    }
                    this.field2691++;
                }
                for (int var12 = 0; var12 < var10.field2675; var12++) {
                    this.field2676[this.field2675] = var10.field2676[var12] + this.field2659;
                    this.field2677[this.field2675] = var10.field2677[var12] + this.field2659;
                    this.field2678[this.field2675] = var10.field2678[var12] + this.field2659;
                    this.field2675++;
                }
                for (int var13 = 0; var13 < var10.field2659; var13++) {
                    this.field2660[this.field2659] = var10.field2660[var13];
                    this.field2711[this.field2659] = var10.field2711[var13];
                    this.field2662[this.field2659] = var10.field2662[var13];
                    this.field2659++;
                }
            }
        }
    }

    @ObfuscatedName("ix.aj([[IIIIZI)Lix;")
    public class231 method4334(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method4242();
        int var7 = arg1 - this.field2710;
        int var8 = this.field2710 + arg1;
        int var9 = arg3 - this.field2710;
        int var10 = this.field2710 + arg3;
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
        class231 var15;
        if (arg4) {
            var15 = new class231();
            var15.field2659 = this.field2659;
            var15.field2691 = this.field2691;
            var15.field2675 = this.field2675;
            var15.field2660 = this.field2660;
            var15.field2662 = this.field2662;
            var15.field2664 = this.field2664;
            var15.field2665 = this.field2665;
            var15.field2655 = this.field2655;
            var15.field2667 = this.field2667;
            var15.field2668 = this.field2668;
            var15.field2707 = this.field2707;
            var15.field2658 = this.field2658;
            var15.field2671 = this.field2671;
            var15.field2672 = this.field2672;
            var15.field2673 = this.field2673;
            var15.field2674 = this.field2674;
            var15.field2676 = this.field2676;
            var15.field2677 = this.field2677;
            var15.field2678 = this.field2678;
            var15.field2679 = this.field2679;
            var15.field2680 = this.field2680;
            var15.field2683 = this.field2683;
            var15.field2711 = new int[var15.field2659];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field2659; var16++) {
                int var17 = this.field2660[var16] + arg1;
                int var18 = this.field2662[var16] + arg3;
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
            for (int var26 = 0; var26 < var15.field2659; var26++) {
                int var27 = (-this.field2711[var26] << 16) / this.field2587;
                if (var27 < arg5) {
                    int var28 = this.field2660[var26] + arg1;
                    int var29 = this.field2662[var26] + arg3;
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
        var15.method4245();
        return var15;
    }

    @ObfuscatedName("ix.ac(Z)Lix;")
    public class231 method4239(boolean arg0) {
        if (!arg0 && field2653.length < this.field2691) {
            field2653 = new byte[this.field2691 + 100];
        }
        return this.method4238(arg0, field2701, field2653);
    }

    @ObfuscatedName("ix.ab(Z)Lix;")
    public class231 method4299(boolean arg0) {
        if (!arg0 && field2722.length < this.field2691) {
            field2722 = new byte[this.field2691 + 100];
        }
        return this.method4238(arg0, field2654, field2722);
    }

    @ObfuscatedName("ix.an(ZLix;[B)Lix;")
    public class231 method4238(boolean arg0, class231 arg1, byte[] arg2) {
        arg1.field2659 = this.field2659;
        arg1.field2691 = this.field2691;
        arg1.field2675 = this.field2675;
        if (arg1.field2660 == null || arg1.field2660.length < this.field2659) {
            arg1.field2660 = new int[this.field2659 + 100];
            arg1.field2711 = new int[this.field2659 + 100];
            arg1.field2662 = new int[this.field2659 + 100];
        }
        for (int var4 = 0; var4 < this.field2659; var4++) {
            arg1.field2660[var4] = this.field2660[var4];
            arg1.field2711[var4] = this.field2711[var4];
            arg1.field2662[var4] = this.field2662[var4];
        }
        if (arg0) {
            arg1.field2671 = this.field2671;
        } else {
            arg1.field2671 = arg2;
            if (this.field2671 == null) {
                for (int var5 = 0; var5 < this.field2691; var5++) {
                    arg1.field2671[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field2691; var6++) {
                    arg1.field2671[var6] = this.field2671[var6];
                }
            }
        }
        arg1.field2664 = this.field2664;
        arg1.field2665 = this.field2665;
        arg1.field2655 = this.field2655;
        arg1.field2667 = this.field2667;
        arg1.field2668 = this.field2668;
        arg1.field2707 = this.field2707;
        arg1.field2658 = this.field2658;
        arg1.field2672 = this.field2672;
        arg1.field2673 = this.field2673;
        arg1.field2674 = this.field2674;
        arg1.field2676 = this.field2676;
        arg1.field2677 = this.field2677;
        arg1.field2678 = this.field2678;
        arg1.field2679 = this.field2679;
        arg1.field2680 = this.field2680;
        arg1.field2681 = this.field2681;
        arg1.field2682 = this.field2682;
        arg1.field2683 = this.field2683;
        arg1.method4245();
        arg1.field2708 = 0;
        return arg1;
    }

    @ObfuscatedName("ix.ao(I)V")
    public void method4241(int arg0) {
        if (this.field2689.containsKey(arg0)) {
            return;
        }
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = field2717[arg0];
        int var9 = field2687[arg0];
        for (int var10 = 0; var10 < this.field2659; var10++) {
            int var11 = class220.method3929(this.field2660[var10], this.field2662[var10], var8, var9);
            int var12 = this.field2711[var10];
            int var13 = class220.method3930(this.field2660[var10], this.field2662[var10], var8, var9);
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
            if (var13 < var4) {
                var4 = var13;
            }
            if (var13 > var7) {
                var7 = var13;
            }
        }
        class224 var14 = new class224((var2 + var5) / 2, (var3 + var6) / 2, (var4 + var7) / 2, (var5 - var2 + 1) / 2, (var6 - var3 + 1) / 2, (var7 - var4 + 1) / 2);
        boolean var15 = true;
        if (var14.field2586 < 32) {
            var14.field2586 = 32;
        }
        if (var14.field2577 < 32) {
            var14.field2577 = 32;
        }
        if (this.field2683) {
            boolean var16 = true;
            var14.field2586 += 8;
            var14.field2577 += 8;
        }
        this.field2689.put(arg0, var14);
    }

    @ObfuscatedName("ix.ap()V")
    public void method4242() {
        if (this.field2684 == 1) {
            return;
        }
        this.field2684 = 1;
        this.field2587 = 0;
        this.field2686 = 0;
        this.field2710 = 0;
        for (int var1 = 0; var1 < this.field2659; var1++) {
            int var2 = this.field2660[var1];
            int var3 = this.field2711[var1];
            int var4 = this.field2662[var1];
            if (-var3 > this.field2587) {
                this.field2587 = -var3;
            }
            if (var3 > this.field2686) {
                this.field2686 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field2710) {
                this.field2710 = var5;
            }
        }
        this.field2710 = (int) (Math.sqrt((double) this.field2710) + 0.99D);
        this.field2698 = (int) (Math.sqrt((double) (this.field2587 * this.field2587 + this.field2710 * this.field2710)) + 0.99D);
        this.field2695 = this.field2698 + (int) (Math.sqrt((double) (this.field2710 * this.field2710 + this.field2686 * this.field2686)) + 0.99D);
    }

    @ObfuscatedName("ix.ar()V")
    public void method4269() {
        if (this.field2684 == 2) {
            return;
        }
        this.field2684 = 2;
        this.field2710 = 0;
        for (int var1 = 0; var1 < this.field2659; var1++) {
            int var2 = this.field2660[var1];
            int var3 = this.field2711[var1];
            int var4 = this.field2662[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field2710) {
                this.field2710 = var5;
            }
        }
        this.field2710 = (int) (Math.sqrt((double) this.field2710) + 0.99D);
        this.field2698 = this.field2710;
        this.field2695 = this.field2710 + this.field2710;
    }

    @ObfuscatedName("ix.ak()I")
    public int method4268() {
        this.method4242();
        return this.field2710;
    }

    @ObfuscatedName("ix.ax()V")
    public void method4245() {
        this.field2684 = 0;
        this.field2689.clear();
    }

    @ObfuscatedName("ix.as(Liw;I)V")
    public void method4246(class227 arg0, int arg1) {
        if (this.field2679 == null || arg1 == -1) {
            return;
        }
        class218 var3 = arg0.field2593[arg1];
        class222 var4 = var3.field2436;
        Statics.field2693 = 0;
        Statics.field2702 = 0;
        Statics.field2712 = 0;
        for (int var5 = 0; var5 < var3.field2441; var5++) {
            int var6 = var3.field2438[var5];
            this.method4341(var4.field2504[var6], var4.field2498[var6], var3.field2432[var5], var3.field2440[var5], var3.field2439[var5]);
        }
        this.method4245();
    }

    @ObfuscatedName("ix.ay(Lfl;I)V")
    public void method4247(class135 arg0, int arg1) {
        class222 var3 = arg0.field1571;
        class221 var4 = var3.method4024();
        if (var4 != null) {
            var3.method4024().method4009(arg0, arg1);
            this.method4249(var3.method4024(), arg0.method2915());
        }
        if (arg0.method2900()) {
            this.method4248(arg0, arg1);
        }
        this.method4245();
    }

    @ObfuscatedName("ix.am(Lfl;I)V")
    public void method4248(class135 arg0, int arg1) {
        class222 var3 = arg0.field1571;
        for (int var4 = 0; var4 < var3.field2503; var4++) {
            int var5 = var3.field2504[var4];
            if (var5 == 5 && arg0.field1569 != null && arg0.field1569[var4] != null && arg0.field1569[var4][0] != null && this.field2680 != null && this.field2671 != null) {
                class128 var6 = arg0.field1569[var4][0];
                int[] var7 = var3.field2498[var4];
                int var8 = var7.length;
                for (int var9 = 0; var9 < var8; var9++) {
                    int var10 = var7[var9];
                    if (var10 < this.field2680.length) {
                        int[] var11 = this.field2680[var10];
                        for (int var12 = 0; var12 < var11.length; var12++) {
                            int var13 = var11[var12];
                            int var14 = (int) ((float) (this.field2671[var13] & 0xFF) + var6.method2837(arg1) * 255.0F);
                            if (var14 < 0) {
                                var14 = 0;
                            } else if (var14 > 255) {
                                var14 = 255;
                            }
                            this.field2671[var13] = (byte) var14;
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ix.az(Lik;I)V")
    public void method4249(class221 arg0, int arg1) {
        this.method4304(arg0, arg1);
    }

    @ObfuscatedName("ix.ae(Liw;ILiw;I[I)V")
    public void method4250(class227 arg0, int arg1, class227 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method4246(arg0, arg1);
            return;
        }
        class218 var6 = arg0.field2593[arg1];
        class218 var7 = arg2.field2593[arg3];
        class222 var8 = var6.field2436;
        Statics.field2693 = 0;
        Statics.field2702 = 0;
        Statics.field2712 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field2441; var11++) {
            int var12 = var6.field2438[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field2504[var12] == 0) {
                this.method4341(var8.field2504[var12], var8.field2498[var12], var6.field2432[var11], var6.field2440[var11], var6.field2439[var11]);
            }
        }
        Statics.field2693 = 0;
        Statics.field2702 = 0;
        Statics.field2712 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field2441; var15++) {
            int var16 = var7.field2438[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field2504[var16] == 0) {
                this.method4341(var8.field2504[var16], var8.field2498[var16], var7.field2432[var15], var7.field2440[var15], var7.field2439[var15]);
            }
        }
        this.method4245();
    }

    @ObfuscatedName("ix.au(Lin;Lfl;I[ZZZ)V")
    public void method4281(class222 arg0, class135 arg1, int arg2, boolean[] arg3, boolean arg4, boolean arg5) {
        class221 var7 = arg0.method4024();
        if (var7 != null) {
            var7.method4018(arg1, arg2, arg3, arg4);
            if (arg5) {
                this.method4249(var7, arg1.method2915());
            }
        }
        if (!arg4 && arg1.method2900()) {
            this.method4248(arg1, arg2);
        }
    }

    @ObfuscatedName("ix.ag(Liw;I[IZ)V")
    public void method4261(class227 arg0, int arg1, int[] arg2, boolean arg3) {
        if (arg2 == null) {
            this.method4246(arg0, arg1);
            return;
        }
        class218 var5 = arg0.field2593[arg1];
        class222 var6 = var5.field2436;
        byte var7 = 0;
        int var11 = var7 + 1;
        int var8 = arg2[var7];
        Statics.field2693 = 0;
        Statics.field2702 = 0;
        Statics.field2712 = 0;
        for (int var9 = 0; var9 < var5.field2441; var9++) {
            int var10 = var5.field2438[var9];
            while (var10 > var8) {
                var8 = arg2[var11++];
            }
            if (arg3) {
                if (var8 == var10 || var6.field2504[var10] == 0) {
                    this.method4341(var6.field2504[var10], var6.field2498[var10], var5.field2432[var9], var5.field2440[var9], var5.field2439[var9]);
                }
            } else if (var8 != var10 || var6.field2504[var10] == 0) {
                this.method4341(var6.field2504[var10], var6.field2498[var10], var5.field2432[var9], var5.field2440[var9], var5.field2439[var9]);
            }
        }
    }

    @ObfuscatedName("ix.at(I[IIII)V")
    public void method4341(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field2693 = 0;
            Statics.field2702 = 0;
            Statics.field2712 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field2679.length) {
                    int[] var10 = this.field2679[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field2693 += this.field2660[var12];
                        Statics.field2702 += this.field2711[var12];
                        Statics.field2712 += this.field2662[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field2693 = Statics.field2693 / var7 + arg2;
                Statics.field2702 = Statics.field2702 / var7 + arg3;
                Statics.field2712 = Statics.field2712 / var7 + arg4;
            } else {
                Statics.field2693 = arg2;
                Statics.field2702 = arg3;
                Statics.field2712 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field2679.length) {
                    int[] var15 = this.field2679[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field2660[var17] += arg2;
                        this.field2711[var17] += arg3;
                        this.field2662[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field2679.length) {
                    int[] var20 = this.field2679[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field2660[var22] -= Statics.field2693;
                        this.field2711[var22] -= Statics.field2702;
                        this.field2662[var22] -= Statics.field2712;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field2687[var25];
                            int var27 = field2717[var25];
                            int var28 = this.field2711[var22] * var26 + this.field2660[var22] * var27 >> 16;
                            this.field2711[var22] = this.field2711[var22] * var27 - this.field2660[var22] * var26 >> 16;
                            this.field2660[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field2687[var23];
                            int var30 = field2717[var23];
                            int var31 = this.field2711[var22] * var30 - this.field2662[var22] * var29 >> 16;
                            this.field2662[var22] = this.field2711[var22] * var29 + this.field2662[var22] * var30 >> 16;
                            this.field2711[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field2687[var24];
                            int var33 = field2717[var24];
                            int var34 = this.field2662[var22] * var32 + this.field2660[var22] * var33 >> 16;
                            this.field2662[var22] = this.field2662[var22] * var33 - this.field2660[var22] * var32 >> 16;
                            this.field2660[var22] = var34;
                        }
                        this.field2660[var22] += Statics.field2693;
                        this.field2711[var22] += Statics.field2702;
                        this.field2662[var22] += Statics.field2712;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field2679.length) {
                    int[] var37 = this.field2679[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field2660[var39] -= Statics.field2693;
                        this.field2711[var39] -= Statics.field2702;
                        this.field2662[var39] -= Statics.field2712;
                        this.field2660[var39] = this.field2660[var39] * arg2 / 128;
                        this.field2711[var39] = this.field2711[var39] * arg3 / 128;
                        this.field2662[var39] = this.field2662[var39] * arg4 / 128;
                        this.field2660[var39] += Statics.field2693;
                        this.field2711[var39] += Statics.field2702;
                        this.field2662[var39] += Statics.field2712;
                    }
                }
            }
        } else if (arg0 == 5 && this.field2680 != null && this.field2671 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field2680.length) {
                    int[] var42 = this.field2680[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field2671[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field2671[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("ix.af()V")
    public void method4254() {
        for (int var1 = 0; var1 < this.field2659; var1++) {
            int var2 = this.field2660[var1];
            this.field2660[var1] = this.field2662[var1];
            this.field2662[var1] = -var2;
        }
        this.method4245();
    }

    @ObfuscatedName("ix.ai()V")
    public void method4349() {
        for (int var1 = 0; var1 < this.field2659; var1++) {
            this.field2660[var1] = -this.field2660[var1];
            this.field2662[var1] = -this.field2662[var1];
        }
        this.method4245();
    }

    @ObfuscatedName("ix.aw()V")
    public void method4256() {
        for (int var1 = 0; var1 < this.field2659; var1++) {
            int var2 = this.field2662[var1];
            this.field2662[var1] = this.field2660[var1];
            this.field2660[var1] = -var2;
        }
        this.method4245();
    }

    @ObfuscatedName("ix.aa(I)V")
    public void method4257(int arg0) {
        int var2 = field2687[arg0];
        int var3 = field2717[arg0];
        for (int var4 = 0; var4 < this.field2659; var4++) {
            int var5 = this.field2711[var4] * var3 - this.field2662[var4] * var2 >> 16;
            this.field2662[var4] = this.field2711[var4] * var2 + this.field2662[var4] * var3 >> 16;
            this.field2711[var4] = var5;
        }
        this.method4245();
    }

    @ObfuscatedName("ix.ah(III)V")
    public void method4258(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2659; var4++) {
            this.field2660[var4] += arg0;
            this.field2711[var4] += arg1;
            this.field2662[var4] += arg2;
        }
        this.method4245();
    }

    @ObfuscatedName("ix.ad(III)V")
    public void method4266(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2659; var4++) {
            this.field2660[var4] = this.field2660[var4] * arg0 / 128;
            this.field2711[var4] = this.field2711[var4] * arg1 / 128;
            this.field2662[var4] = this.field2662[var4] * arg2 / 128;
        }
        this.method4245();
    }

    @ObfuscatedName("ix.bm(IIIIIII)V")
    public final void method4293(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field2684 != 2 && this.field2684 != 1) {
            this.method4269();
        }
        int var8 = Statics.field2479;
        int var9 = Statics.field2480;
        int var10 = field2687[arg0];
        int var11 = field2717[arg0];
        int var12 = field2687[arg1];
        int var13 = field2717[arg1];
        int var14 = field2687[arg2];
        int var15 = field2717[arg2];
        int var16 = field2687[arg3];
        int var17 = field2717[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field2659; var19++) {
            int var20 = this.field2660[var19];
            int var21 = this.field2711[var19];
            int var22 = this.field2662[var19];
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
            field2670[var19] = var30 - var18;
            field2716[var19] = class220.field2478 * var26 / var30 + var8;
            field2694[var19] = class220.field2478 * var29 / var30 + var9;
            if (this.field2675 > 0) {
                field2696[var19] = var26;
                field2652[var19] = var29;
                field2656[var19] = var30;
            }
        }
        try {
            this.method4262(false, false, false, 0L);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("ix.bv(IIIIIIII)V")
    public final void method4271(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (this.field2684 != 2 && this.field2684 != 1) {
            this.method4269();
        }
        int var9 = Statics.field2479;
        int var10 = Statics.field2480;
        int var11 = field2687[arg0];
        int var12 = field2717[arg0];
        int var13 = field2687[arg1];
        int var14 = field2717[arg1];
        int var15 = field2687[arg2];
        int var16 = field2717[arg2];
        int var17 = field2687[arg3];
        int var18 = field2717[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field2659; var20++) {
            int var21 = this.field2660[var20];
            int var22 = this.field2711[var20];
            int var23 = this.field2662[var20];
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
            field2670[var20] = var31 - var19;
            field2716[var20] = class220.field2478 * var27 / arg7 + var9;
            field2694[var20] = class220.field2478 * var30 / arg7 + var10;
            if (this.field2675 > 0) {
                field2696[var20] = var27;
                field2652[var20] = var30;
                field2656[var20] = var31;
            }
        }
        try {
            this.method4262(false, false, false, 0L);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("ix.dh(IIIIIIIIJ)V")
    public void method4195(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        if (this.field2684 != 1) {
            this.method4242();
        }
        this.method4241(arg0);
        int var11 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var12 = arg1 * arg6 + arg2 * var11 >> 16;
        int var13 = this.field2710 * arg2 >> 16;
        int var14 = var12 + var13;
        if (var14 <= 50 || var12 >= 3500) {
            return;
        }
        int var15 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var16 = (var15 - this.field2710) * class220.field2478;
        if (var16 / var14 >= Statics.field2475) {
            return;
        }
        int var17 = (this.field2710 + var15) * class220.field2478;
        if (var17 / var14 <= Statics.field2483) {
            return;
        }
        int var18 = arg2 * arg6 - arg1 * var11 >> 16;
        int var19 = this.field2710 * arg1 >> 16;
        int var20 = (this.field2686 * arg2 >> 16) + var19;
        int var21 = (var18 + var20) * class220.field2478;
        if (var21 / var14 <= Statics.field2467) {
            return;
        }
        int var22 = (this.field2587 * arg2 >> 16) + var19;
        int var23 = (var18 - var22) * class220.field2478;
        if (var23 / var14 >= Statics.field2486) {
            return;
        }
        int var24 = (this.field2587 * arg1 >> 16) + var13;
        boolean var25 = false;
        boolean var26 = false;
        if (var12 - var24 <= 50) {
            var26 = true;
        }
        boolean var27 = var26 || this.field2675 > 0;
        int var28 = class232.method3534();
        int var29 = class232.field2729;
        boolean var31 = class232.field2739;
        boolean var33 = class232.method1054(arg8);
        boolean var34 = false;
        if (var33 && var31) {
            boolean var35 = false;
            if (field2713) {
                boolean var37 = class232.field2739;
                boolean var38;
                if (var37) {
                    if (!class232.field2740) {
                        int var39 = Statics.field2536;
                        int var40 = Statics.field2537;
                        int var41 = Statics.field2538;
                        int var42 = Statics.field2539;
                        byte var43 = 50;
                        short var44 = 3500;
                        int var45 = (class232.field2728 - Statics.field2479) * var43 / class220.field2478;
                        int var46 = (class232.field2729 - Statics.field2480) * var43 / class220.field2478;
                        int var47 = (class232.field2728 - Statics.field2479) * var44 / class220.field2478;
                        int var48 = (class232.field2729 - Statics.field2480) * var44 / class220.field2478;
                        int var49 = class220.method3933(var46, var43, var40, var39);
                        int var50 = class220.method3934(var46, var43, var40, var39);
                        int var52 = class220.method3933(var48, var44, var40, var39);
                        int var53 = class220.method3934(var48, var44, var40, var39);
                        int var55 = class220.method3931(var45, var50, var42, var41);
                        int var56 = class220.method3993(var45, var50, var42, var41);
                        int var58 = class220.method3931(var47, var53, var42, var41);
                        int var59 = class220.method3993(var47, var53, var42, var41);
                        Statics.field2731 = (var55 + var58) / 2;
                        Statics.field1012 = (var49 + var52) / 2;
                        Statics.field2732 = (var56 + var59) / 2;
                        Statics.field4474 = (var58 - var55) / 2;
                        Statics.field2733 = (var52 - var49) / 2;
                        Statics.field126 = (var59 - var56) / 2;
                        Statics.field2073 = Math.abs(Statics.field4474);
                        Statics.field2594 = Math.abs(Statics.field2733);
                        Statics.field2727 = Math.abs(Statics.field126);
                    }
                    class224 var61 = (class224) this.field2689.get(arg0);
                    int var62 = var61.field2580 + arg5;
                    int var63 = var61.field2578 + arg6;
                    int var64 = var61.field2579 + arg7;
                    int var65 = var61.field2586;
                    int var66 = var61.field2581;
                    int var67 = var61.field2577;
                    int var68 = Statics.field2731 - var62;
                    int var69 = Statics.field1012 - var63;
                    int var70 = Statics.field2732 - var64;
                    if (Math.abs(var68) > Statics.field2073 + var65) {
                        var38 = false;
                    } else if (Math.abs(var69) > Statics.field2594 + var66) {
                        var38 = false;
                    } else if (Math.abs(var70) > Statics.field2727 + var67) {
                        var38 = false;
                    } else if (Math.abs(Statics.field2733 * var70 - Statics.field126 * var69) > Statics.field2727 * var66 + Statics.field2594 * var67) {
                        var38 = false;
                    } else if (Math.abs(Statics.field126 * var68 - Statics.field4474 * var70) > Statics.field2727 * var65 + Statics.field2073 * var67) {
                        var38 = false;
                    } else if (Math.abs(Statics.field4474 * var69 - Statics.field2733 * var68) > Statics.field2594 * var65 + Statics.field2073 * var66) {
                        var38 = false;
                    } else {
                        var38 = true;
                    }
                } else {
                    var38 = false;
                }
                var35 = var38;
            } else {
                int var71 = var12 - var13;
                if (var71 <= 50) {
                    var71 = 50;
                }
                int var72;
                int var73;
                if (var15 > 0) {
                    var72 = var16 / var14;
                    var73 = var17 / var71;
                } else {
                    var73 = var17 / var14;
                    var72 = var16 / var71;
                }
                int var74;
                int var75;
                if (var18 > 0) {
                    var74 = var23 / var14;
                    var75 = var21 / var71;
                } else {
                    var75 = var21 / var14;
                    var74 = var23 / var71;
                }
                int var76 = var28 - Statics.field2479;
                int var77 = var29 - Statics.field2480;
                if (var76 > var72 && var76 < var73 && var77 > var74 && var77 < var75) {
                    var35 = true;
                }
            }
            if (var35) {
                if (this.field2683) {
                    class232.method3185(arg8);
                } else {
                    var34 = true;
                }
            }
        }
        int var78 = Statics.field2479;
        int var79 = Statics.field2480;
        int var80 = 0;
        int var81 = 0;
        if (arg0 != 0) {
            var80 = field2687[arg0];
            var81 = field2717[arg0];
        }
        for (int var82 = 0; var82 < this.field2659; var82++) {
            int var83 = this.field2660[var82];
            int var84 = this.field2711[var82];
            int var85 = this.field2662[var82];
            if (arg0 != 0) {
                int var86 = var80 * var85 + var81 * var83 >> 16;
                var85 = var81 * var85 - var80 * var83 >> 16;
                var83 = var86;
            }
            int var87 = arg5 + var83;
            int var88 = arg6 + var84;
            int var89 = arg7 + var85;
            int var90 = arg3 * var89 + arg4 * var87 >> 16;
            int var91 = arg4 * var89 - arg3 * var87 >> 16;
            int var93 = arg2 * var88 - arg1 * var91 >> 16;
            int var94 = arg1 * var88 + arg2 * var91 >> 16;
            field2670[var82] = var94 - var12;
            if (var94 >= 50) {
                field2716[var82] = class220.field2478 * var90 / var94 + var78;
                field2694[var82] = class220.field2478 * var93 / var94 + var79;
            } else {
                field2716[var82] = -5000;
                var25 = true;
            }
            if (var27) {
                field2696[var82] = var90;
                field2652[var82] = var93;
                field2656[var82] = var94;
            }
        }
        try {
            this.method4262(var25, var34, this.field2683, arg8);
        } catch (Exception var97) {
        }
    }

    @ObfuscatedName("ix.bo(ZZZJ)V")
    public final void method4262(boolean arg0, boolean arg1, boolean arg2, long arg3) {
        if (this.field2695 >= 6000) {
            return;
        }
        for (int var6 = 0; var6 < this.field2695; var6++) {
            field2700[var6] = 0;
        }
        int var7 = arg2 ? 20 : 5;
        for (char var8 = 0; var8 < this.field2691; var8++) {
            if (this.field2707[var8] != -2) {
                int var9 = this.field2664[var8];
                int var10 = this.field2665[var8];
                int var11 = this.field2655[var8];
                int var12 = field2716[var9];
                int var13 = field2716[var10];
                int var14 = field2716[var11];
                if (arg0 && (var12 == -5000 || var13 == -5000 || var14 == -5000)) {
                    int var15 = field2696[var9];
                    int var16 = field2696[var10];
                    int var17 = field2696[var11];
                    int var18 = field2652[var9];
                    int var19 = field2652[var10];
                    int var20 = field2652[var11];
                    int var21 = field2656[var9];
                    int var22 = field2656[var10];
                    int var23 = field2656[var11];
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
                        field2692[var8] = true;
                        int var33 = (field2670[var9] + field2670[var10] + field2670[var11]) / 3 + this.field2698;
                        field2669[var33][field2700[var33]++] = var8;
                    }
                } else {
                    if (arg1 && class232.method3053(field2694[var9], field2694[var10], field2694[var11], var12, var13, var14, var7)) {
                        class232.method3185(arg3);
                        arg1 = false;
                    }
                    if ((field2694[var11] - field2694[var10]) * (var12 - var13) - (field2694[var9] - field2694[var10]) * (var14 - var13) > 0) {
                        field2692[var8] = false;
                        if (var12 >= 0 && var13 >= 0 && var14 >= 0 && var12 <= Statics.field2481 && var13 <= Statics.field2481 && var14 <= Statics.field2481) {
                            field2688[var8] = false;
                        } else {
                            field2688[var8] = true;
                        }
                        int var34 = (field2670[var9] + field2670[var10] + field2670[var11]) / 3 + this.field2698;
                        field2669[var34][field2700[var34]++] = var8;
                    }
                }
            }
        }
        if (this.field2658 == null) {
            for (int var35 = this.field2695 - 1; var35 >= 0; var35--) {
                char var36 = field2700[var35];
                if (var36 > 0) {
                    char[] var37 = field2669[var35];
                    for (int var38 = 0; var38 < var36; var38++) {
                        this.method4263(var37[var38]);
                    }
                }
            }
            return;
        }
        for (int var39 = 0; var39 < 12; var39++) {
            field2697[var39] = 0;
            field2706[var39] = 0;
        }
        for (int var40 = this.field2695 - 1; var40 >= 0; var40--) {
            char var41 = field2700[var40];
            if (var41 > 0) {
                char[] var42 = field2669[var40];
                for (int var43 = 0; var43 < var41; var43++) {
                    char var44 = var42[var43];
                    byte var45 = this.field2658[var44];
                    int var46 = field2697[var45]++;
                    field2703[var45][var46] = var44;
                    if (var45 < 10) {
                        field2706[var45] += var40;
                    } else if (var45 == 10) {
                        field2704[var46] = var40;
                    } else {
                        field2685[var46] = var40;
                    }
                }
            }
        }
        int var47 = 0;
        if (field2697[1] > 0 || field2697[2] > 0) {
            var47 = (field2706[1] + field2706[2]) / (field2697[1] + field2697[2]);
        }
        int var48 = 0;
        if (field2697[3] > 0 || field2697[4] > 0) {
            var48 = (field2706[3] + field2706[4]) / (field2697[3] + field2697[4]);
        }
        int var49 = 0;
        if (field2697[6] > 0 || field2697[8] > 0) {
            var49 = (field2706[6] + field2706[8]) / (field2697[6] + field2697[8]);
        }
        int var50 = 0;
        int var51 = field2697[10];
        int[] var52 = field2703[10];
        int[] var53 = field2704;
        if (var50 == var51) {
            var50 = 0;
            var51 = field2697[11];
            var52 = field2703[11];
            var53 = field2685;
        }
        int var54;
        if (var50 < var51) {
            var54 = var53[var50];
        } else {
            var54 = -1000;
        }
        for (int var55 = 0; var55 < 10; var55++) {
            while (var55 == 0 && var54 > var47) {
                this.method4263(var52[var50++]);
                if (var50 == var51 && field2703[11] != var52) {
                    var50 = 0;
                    var51 = field2697[11];
                    var52 = field2703[11];
                    var53 = field2685;
                }
                if (var50 < var51) {
                    var54 = var53[var50];
                } else {
                    var54 = -1000;
                }
            }
            while (var55 == 3 && var54 > var48) {
                this.method4263(var52[var50++]);
                if (var50 == var51 && field2703[11] != var52) {
                    var50 = 0;
                    var51 = field2697[11];
                    var52 = field2703[11];
                    var53 = field2685;
                }
                if (var50 < var51) {
                    var54 = var53[var50];
                } else {
                    var54 = -1000;
                }
            }
            while (var55 == 5 && var54 > var49) {
                this.method4263(var52[var50++]);
                if (var50 == var51 && field2703[11] != var52) {
                    var50 = 0;
                    var51 = field2697[11];
                    var52 = field2703[11];
                    var53 = field2685;
                }
                if (var50 < var51) {
                    var54 = var53[var50];
                } else {
                    var54 = -1000;
                }
            }
            int var56 = field2697[var55];
            int[] var57 = field2703[var55];
            for (int var58 = 0; var58 < var56; var58++) {
                this.method4263(var57[var58]);
            }
        }
        while (var54 != -1000) {
            this.method4263(var52[var50++]);
            if (var50 == var51 && field2703[11] != var52) {
                var50 = 0;
                var52 = field2703[11];
                var51 = field2697[11];
                var53 = field2685;
            }
            if (var50 < var51) {
                var54 = var53[var50];
            } else {
                var54 = -1000;
            }
        }
    }

    @ObfuscatedName("ix.bs(I)V")
    public final void method4263(int arg0) {
        if (field2692[arg0]) {
            this.method4335(arg0);
            return;
        }
        int var2 = this.field2664[arg0];
        int var3 = this.field2665[arg0];
        int var4 = this.field2655[arg0];
        class220.field2472 = field2688[arg0];
        if (this.field2671 == null) {
            class220.field2471 = 0;
        } else {
            class220.field2471 = this.field2671[arg0] & 0xFF;
        }
        this.method4240(arg0, field2694[var2], field2694[var3], field2694[var4], field2716[var2], field2716[var3], field2716[var4], this.field2667[arg0], this.field2668[arg0], this.field2707[arg0]);
    }

    @ObfuscatedName("ix.bg(I)Z")
    public boolean method4243(int arg0) {
        return this.field2708 > 0 && arg0 < this.field2726;
    }

    @ObfuscatedName("ix.bh(IIIIIIIIII)V")
    public final void method4240(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (this.field2673 == null || this.field2673[arg0] == -1) {
            boolean var15 = this.method4243(arg0);
            if (this.field2707[arg0] == -1 && var15) {
                class220.method3947(arg1, arg2, arg3, arg4, arg5, arg6, field2718[this.field2667[arg0]], this.field2709, this.field2723, this.field2666, this.field2708);
            } else if (this.field2707[arg0] == -1) {
                class220.method3916(arg1, arg2, arg3, arg4, arg5, arg6, field2718[this.field2667[arg0]]);
            } else if (var15) {
                class220.method3932(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field2709, this.field2723, this.field2666, this.field2708);
            } else {
                class220.method3917(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
            }
            return;
        }
        int var12;
        int var13;
        int var14;
        if (this.field2672 == null || this.field2672[arg0] == -1) {
            var12 = this.field2664[arg0];
            var13 = this.field2665[arg0];
            var14 = this.field2655[arg0];
        } else {
            int var11 = this.field2672[arg0] & 0xFF;
            var12 = this.field2676[var11];
            var13 = this.field2677[var11];
            var14 = this.field2678[var11];
        }
        if (this.field2707[arg0] == -1) {
            class220.method3999(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg7, arg7, field2696[var12], field2696[var13], field2696[var14], field2652[var12], field2652[var13], field2652[var14], field2656[var12], field2656[var13], field2656[var14], this.field2673[arg0]);
        } else {
            class220.method3999(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, field2696[var12], field2696[var13], field2696[var14], field2652[var12], field2652[var13], field2652[var14], field2656[var12], field2656[var13], field2656[var14], this.field2673[arg0]);
        }
    }

    @ObfuscatedName("ix.bl(I)V")
    public final void method4335(int arg0) {
        int var2 = Statics.field2479;
        int var3 = Statics.field2480;
        int var4 = 0;
        int var5 = this.field2664[arg0];
        int var6 = this.field2665[arg0];
        int var7 = this.field2655[arg0];
        int var8 = field2656[var5];
        int var9 = field2656[var6];
        int var10 = field2656[var7];
        if (this.field2671 == null) {
            class220.field2471 = 0;
        } else {
            class220.field2471 = this.field2671[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field2724[var4] = field2716[var5];
            field2663[var4] = field2694[var5];
            field2705[var4++] = this.field2667[arg0];
        } else {
            int var11 = field2696[var5];
            int var12 = field2652[var5];
            int var13 = this.field2667[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field2719[var10 - var8];
                field2724[var4] = (((field2696[var7] - var11) * var14 >> 16) + var11) * class220.field2478 / 50 + var2;
                field2663[var4] = (((field2652[var7] - var12) * var14 >> 16) + var12) * class220.field2478 / 50 + var3;
                field2705[var4++] = ((this.field2707[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field2719[var9 - var8];
                field2724[var4] = (((field2696[var6] - var11) * var15 >> 16) + var11) * class220.field2478 / 50 + var2;
                field2663[var4] = (((field2652[var6] - var12) * var15 >> 16) + var12) * class220.field2478 / 50 + var3;
                field2705[var4++] = ((this.field2668[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field2724[var4] = field2716[var6];
            field2663[var4] = field2694[var6];
            field2705[var4++] = this.field2668[arg0];
        } else {
            int var16 = field2696[var6];
            int var17 = field2652[var6];
            int var18 = this.field2668[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field2719[var8 - var9];
                field2724[var4] = (((field2696[var5] - var16) * var19 >> 16) + var16) * class220.field2478 / 50 + var2;
                field2663[var4] = (((field2652[var5] - var17) * var19 >> 16) + var17) * class220.field2478 / 50 + var3;
                field2705[var4++] = ((this.field2667[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field2719[var10 - var9];
                field2724[var4] = (((field2696[var7] - var16) * var20 >> 16) + var16) * class220.field2478 / 50 + var2;
                field2663[var4] = (((field2652[var7] - var17) * var20 >> 16) + var17) * class220.field2478 / 50 + var3;
                field2705[var4++] = ((this.field2707[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field2724[var4] = field2716[var7];
            field2663[var4] = field2694[var7];
            field2705[var4++] = this.field2707[arg0];
        } else {
            int var21 = field2696[var7];
            int var22 = field2652[var7];
            int var23 = this.field2707[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field2719[var9 - var10];
                field2724[var4] = (((field2696[var6] - var21) * var24 >> 16) + var21) * class220.field2478 / 50 + var2;
                field2663[var4] = (((field2652[var6] - var22) * var24 >> 16) + var22) * class220.field2478 / 50 + var3;
                field2705[var4++] = ((this.field2668[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field2719[var8 - var10];
                field2724[var4] = (((field2696[var5] - var21) * var25 >> 16) + var21) * class220.field2478 / 50 + var2;
                field2663[var4] = (((field2652[var5] - var22) * var25 >> 16) + var22) * class220.field2478 / 50 + var3;
                field2705[var4++] = ((this.field2667[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field2724[0];
        int var27 = field2724[1];
        int var28 = field2724[2];
        int var29 = field2663[0];
        int var30 = field2663[1];
        int var31 = field2663[2];
        class220.field2472 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field2481 || var27 > Statics.field2481 || var28 > Statics.field2481) {
                class220.field2472 = true;
            }
            this.method4240(arg0, var29, var30, var31, var26, var27, var28, field2705[0], field2705[1], field2705[2]);
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field2481 || var27 > Statics.field2481 || var28 > Statics.field2481 || field2724[3] < 0 || field2724[3] > Statics.field2481) {
            class220.field2472 = true;
        }
        if (this.field2673 == null || this.field2673[arg0] == -1) {
            boolean var37 = this.method4243(arg0);
            if (this.field2707[arg0] == -1 && var37) {
                int var38 = field2718[this.field2667[arg0]];
                class220.method3947(var29, var30, var31, var26, var27, var28, var38, this.field2709, this.field2723, this.field2666, this.field2708);
                class220.method3947(var29, var31, field2663[3], var26, var28, field2724[3], var38, this.field2709, this.field2723, this.field2666, this.field2708);
            } else if (this.field2707[arg0] == -1) {
                int var39 = field2718[this.field2667[arg0]];
                class220.method3916(var29, var30, var31, var26, var27, var28, var39);
                class220.method3916(var29, var31, field2663[3], var26, var28, field2724[3], var39);
            } else if (var37) {
                class220.method3932(var29, var30, var31, var26, var27, var28, field2705[0], field2705[1], field2705[2], this.field2709, this.field2666, this.field2723, this.field2708);
                class220.method3932(var29, var31, field2663[3], var26, var28, field2724[3], field2705[0], field2705[2], field2705[3], this.field2709, this.field2666, this.field2723, this.field2708);
            } else {
                class220.method3917(var29, var30, var31, var26, var27, var28, field2705[0], field2705[1], field2705[2]);
                class220.method3917(var29, var31, field2663[3], var26, var28, field2724[3], field2705[0], field2705[2], field2705[3]);
            }
            return;
        }
        int var33;
        int var34;
        int var35;
        if (this.field2672 == null || this.field2672[arg0] == -1) {
            var33 = var5;
            var34 = var6;
            var35 = var7;
        } else {
            int var32 = this.field2672[arg0] & 0xFF;
            var33 = this.field2676[var32];
            var34 = this.field2677[var32];
            var35 = this.field2678[var32];
        }
        short var36 = this.field2673[arg0];
        if (this.field2707[arg0] == -1) {
            class220.method3999(var29, var30, var31, var26, var27, var28, this.field2667[arg0], this.field2667[arg0], this.field2667[arg0], field2696[var33], field2696[var34], field2696[var35], field2652[var33], field2652[var34], field2652[var35], field2656[var33], field2656[var34], field2656[var35], var36);
            class220.method3999(var29, var31, field2663[3], var26, var28, field2724[3], this.field2667[arg0], this.field2667[arg0], this.field2667[arg0], field2696[var33], field2696[var34], field2696[var35], field2652[var33], field2652[var34], field2652[var35], field2656[var33], field2656[var34], field2656[var35], var36);
        } else {
            class220.method3999(var29, var30, var31, var26, var27, var28, field2705[0], field2705[1], field2705[2], field2696[var33], field2696[var34], field2696[var35], field2652[var33], field2652[var34], field2652[var35], field2656[var33], field2656[var34], field2656[var35], var36);
            class220.method3999(var29, var31, field2663[3], var26, var28, field2724[3], field2705[0], field2705[2], field2705[3], field2696[var33], field2696[var34], field2696[var35], field2652[var33], field2652[var34], field2652[var35], field2656[var33], field2656[var34], field2656[var35], var36);
        }
    }

    @ObfuscatedName("ix.bk(ILqt;)V")
    public void method4267(int arg0, class422 arg1) {
        float var3 = (float) this.field2660[arg0];
        float var4 = (float) (-this.field2711[arg0]);
        float var5 = (float) (-this.field2662[arg0]);
        float var6 = 1.0F;
        this.field2660[arg0] = (int) (arg1.field4609[12] * var6 + arg1.field4609[8] * var5 + arg1.field4609[0] * var3 + arg1.field4609[4] * var4);
        this.field2711[arg0] = -((int) (arg1.field4609[13] * var6 + arg1.field4609[9] * var5 + arg1.field4609[1] * var3 + arg1.field4609[5] * var4));
        this.field2662[arg0] = -((int) (arg1.field4609[14] * var6 + arg1.field4609[10] * var5 + arg1.field4609[2] * var3 + arg1.field4609[6] * var4));
    }

    @ObfuscatedName("ix.br(Lik;I)V")
    public void method4304(class221 arg0, int arg1) {
        if (this.field2681 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field2659; var3++) {
            int[] var4 = this.field2681[var3];
            if (var4 != null && var4.length != 0) {
                int[] var5 = this.field2682[var3];
                field2657.method7216();
                for (int var6 = 0; var6 < var4.length; var6++) {
                    int var7 = var4[var6];
                    class125 var8 = arg0.method4007(var7);
                    if (var8 != null) {
                        field2661.method7188((float) var5[var6] / 255.0F);
                        field2725.method7189(var8.method2800(arg1));
                        field2725.method7190(field2661);
                        field2657.method7224(field2725);
                    }
                }
                this.method4267(var3, field2657);
            }
        }
    }
}
