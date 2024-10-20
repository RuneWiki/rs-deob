package deob;

@ObfuscatedName("kr")
public class class273 extends class286 {

    @ObfuscatedName("kr.ak")
    public int field2771 = 0;

    @ObfuscatedName("kr.ap")
    public int[] field2772;

    @ObfuscatedName("kr.an")
    public int[] field2773;

    @ObfuscatedName("kr.aj")
    public int[] field2768;

    @ObfuscatedName("kr.av")
    public int field2775 = 0;

    @ObfuscatedName("kr.ab")
    public int[] field2779;

    @ObfuscatedName("kr.ai")
    public int[] field2774;

    @ObfuscatedName("kr.ae")
    public int[] field2810;

    @ObfuscatedName("kr.au")
    public byte[] field2807;

    @ObfuscatedName("kr.ah")
    public byte[] field2780;

    @ObfuscatedName("kr.az")
    public byte[] field2804;

    @ObfuscatedName("kr.ax")
    public byte[] field2769;

    @ObfuscatedName("kr.ac")
    public short[] field2783;

    @ObfuscatedName("kr.al")
    public short[] field2784;

    @ObfuscatedName("kr.ay")
    public byte field2790 = 0;

    @ObfuscatedName("kr.ao")
    public int field2786;

    @ObfuscatedName("kr.aa")
    public byte[] field2787;

    @ObfuscatedName("kr.as")
    public short[] field2797;

    @ObfuscatedName("kr.aw")
    public short[] field2789;

    @ObfuscatedName("kr.at")
    public short[] field2781;

    @ObfuscatedName("kr.af")
    public int[] field2791;

    @ObfuscatedName("kr.am")
    public int[] field2792;

    @ObfuscatedName("kr.ar")
    public int[][] field2793;

    @ObfuscatedName("kr.bt")
    public int[][] field2803;

    @ObfuscatedName("kr.bj")
    public int[][] field2795;

    @ObfuscatedName("kr.be")
    public int[][] field2796;

    @ObfuscatedName("kr.bm")
    public class287[] field2776;

    @ObfuscatedName("kr.bo")
    public class296[] field2798;

    @ObfuscatedName("kr.bi")
    public class296[] field2799;

    @ObfuscatedName("kr.ba")
    public short field2800;

    @ObfuscatedName("kr.bg")
    public short field2801;

    @ObfuscatedName("kr.bs")
    public boolean field2802 = false;

    @ObfuscatedName("kr.bp")
    public int field2778;

    @ObfuscatedName("kr.bx")
    public int field2794;

    @ObfuscatedName("kr.bu")
    public int field2805;

    @ObfuscatedName("kr.by")
    public int field2806;

    @ObfuscatedName("kr.bw")
    public int field2777;

    @ObfuscatedName("kr.bl")
    public static int[] field2808 = new int[10000];

    @ObfuscatedName("kr.bc")
    public static int[] field2809 = new int[10000];

    @ObfuscatedName("kr.bv")
    public static int field2785 = 0;

    @ObfuscatedName("kr.bb")
    public static int[] field2811 = class278.field2878;

    @ObfuscatedName("kr.bn")
    public static int[] field2812 = class278.field2879;

    public class273() {
    }

    @ObfuscatedName("kr.aq(Lok;II)Lkr;")
    public static class273 method4687(class388 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method6539(arg1, arg2);
        return var3 == null ? null : new class273(var3);
    }

    public class273(byte[] arg0) {
        class547 var2 = new class547(10);
        var2.method8712(-2);
        if (arg0[arg0.length - 1] == -3 && arg0[arg0.length - 2] == -1) {
            this.method4668(arg0);
        } else if (arg0[arg0.length - 1] == -2 && arg0[arg0.length - 2] == -1) {
            this.method4669(arg0);
        } else if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method4670(arg0);
        } else {
            this.method4721(arg0);
        }
    }

    @ObfuscatedName("kr.ad([B)V")
    public void method4668(byte[] arg0) {
        class547 var2 = new class547(arg0);
        class547 var3 = new class547(arg0);
        class547 var4 = new class547(arg0);
        class547 var5 = new class547(arg0);
        class547 var6 = new class547(arg0);
        class547 var7 = new class547(arg0);
        class547 var8 = new class547(arg0);
        var2.field5363 = arg0.length - 26;
        int var9 = var2.method8899();
        int var10 = var2.method8899();
        int var11 = var2.method8804();
        int var12 = var2.method8804();
        int var13 = var2.method8804();
        int var14 = var2.method8804();
        int var15 = var2.method8804();
        int var16 = var2.method8804();
        int var17 = var2.method8804();
        int var18 = var2.method8804();
        int var19 = var2.method8899();
        int var20 = var2.method8899();
        int var21 = var2.method8899();
        int var22 = var2.method8899();
        int var23 = var2.method8899();
        int var24 = var2.method8899();
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        if (var11 > 0) {
            this.field2787 = new byte[var11];
            var2.field5363 = 0;
            for (int var28 = 0; var28 < var11; var28++) {
                byte var29 = this.field2787[var28] = var2.method8857();
                if (var29 == 0) {
                    var25++;
                }
                if (var29 >= 1 && var29 <= 3) {
                    var26++;
                }
                if (var29 == 2) {
                    var27++;
                }
            }
        }
        int var32 = var9 + var11;
        int var33 = var32;
        if (var12 == 1) {
            var32 += var10;
        }
        int var35 = var10 + var32;
        int var36 = var35;
        if (var13 == 255) {
            var35 += var10;
        }
        int var37 = var35;
        if (var15 == 1) {
            var35 += var10;
        }
        int var39 = var24 + var35;
        int var40 = var39;
        if (var14 == 1) {
            var39 += var10;
        }
        int var42 = var22 + var39;
        int var43 = var42;
        if (var16 == 1) {
            var42 += var10 * 2;
        }
        int var45 = var23 + var42;
        int var47 = var10 * 2 + var45;
        int var49 = var19 + var47;
        int var51 = var20 + var49;
        int var53 = var21 + var51;
        int var55 = var25 * 6 + var53;
        int var57 = var26 * 6 + var55;
        int var59 = var26 * 6 + var57;
        int var61 = var26 * 2 + var59;
        int var63 = var26 + var61;
        int var65 = var26 * 2 + var27 * 2 + var63;
        this.field2771 = var9;
        this.field2775 = var10;
        this.field2786 = var11;
        this.field2772 = new int[var9];
        this.field2773 = new int[var9];
        this.field2768 = new int[var9];
        this.field2779 = new int[var10];
        this.field2774 = new int[var10];
        this.field2810 = new int[var10];
        if (var17 == 1) {
            this.field2791 = new int[var9];
        }
        if (var12 == 1) {
            this.field2807 = new byte[var10];
        }
        if (var13 == 255) {
            this.field2780 = new byte[var10];
        } else {
            this.field2790 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2804 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2792 = new int[var10];
        }
        if (var16 == 1) {
            this.field2784 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field2769 = new byte[var10];
        }
        if (var18 == 1) {
            this.field2795 = new int[var9][];
            this.field2796 = new int[var9][];
        }
        this.field2783 = new short[var10];
        if (var11 > 0) {
            this.field2797 = new short[var11];
            this.field2789 = new short[var11];
            this.field2781 = new short[var11];
        }
        var2.field5363 = var11;
        var3.field5363 = var47;
        var4.field5363 = var49;
        var5.field5363 = var51;
        var6.field5363 = var35;
        int var67 = 0;
        int var68 = 0;
        int var69 = 0;
        for (int var70 = 0; var70 < var9; var70++) {
            int var71 = var2.method8804();
            int var72 = 0;
            if ((var71 & 0x1) != 0) {
                var72 = var3.method8743();
            }
            int var73 = 0;
            if ((var71 & 0x2) != 0) {
                var73 = var4.method8743();
            }
            int var74 = 0;
            if ((var71 & 0x4) != 0) {
                var74 = var5.method8743();
            }
            this.field2772[var70] = var67 + var72;
            this.field2773[var70] = var68 + var73;
            this.field2768[var70] = var69 + var74;
            var67 = this.field2772[var70];
            var68 = this.field2773[var70];
            var69 = this.field2768[var70];
            if (var17 == 1) {
                this.field2791[var70] = var6.method8804();
            }
        }
        if (var18 == 1) {
            for (int var75 = 0; var75 < var9; var75++) {
                int var76 = var6.method8804();
                this.field2795[var75] = new int[var76];
                this.field2796[var75] = new int[var76];
                for (int var77 = 0; var77 < var76; var77++) {
                    this.field2795[var75][var77] = var6.method8804();
                    this.field2796[var75][var77] = var6.method8804();
                }
            }
        }
        var2.field5363 = var45;
        var3.field5363 = var33;
        var4.field5363 = var36;
        var5.field5363 = var40;
        var6.field5363 = var37;
        var7.field5363 = var43;
        var8.field5363 = var42;
        for (int var78 = 0; var78 < var10; var78++) {
            this.field2783[var78] = (short) var2.method8899();
            if (var12 == 1) {
                this.field2807[var78] = var3.method8857();
            }
            if (var13 == 255) {
                this.field2780[var78] = var4.method8857();
            }
            if (var14 == 1) {
                this.field2804[var78] = var5.method8857();
            }
            if (var15 == 1) {
                this.field2792[var78] = var6.method8804();
            }
            if (var16 == 1) {
                this.field2784[var78] = (short) (var7.method8899() - 1);
            }
            if (this.field2769 != null && this.field2784[var78] != -1) {
                this.field2769[var78] = (byte) (var8.method8804() - 1);
            }
        }
        var2.field5363 = var39;
        var3.field5363 = var32;
        int var79 = 0;
        int var80 = 0;
        int var81 = 0;
        int var82 = 0;
        for (int var83 = 0; var83 < var10; var83++) {
            int var84 = var3.method8804();
            if (var84 == 1) {
                var79 = var2.method8743() + var82;
                var80 = var2.method8743() + var79;
                var81 = var2.method8743() + var80;
                var82 = var81;
                this.field2779[var83] = var79;
                this.field2774[var83] = var80;
                this.field2810[var83] = var81;
            }
            if (var84 == 2) {
                var80 = var81;
                var81 = var2.method8743() + var82;
                var82 = var81;
                this.field2779[var83] = var79;
                this.field2774[var83] = var80;
                this.field2810[var83] = var81;
            }
            if (var84 == 3) {
                var79 = var81;
                var81 = var2.method8743() + var82;
                var82 = var81;
                this.field2779[var83] = var79;
                this.field2774[var83] = var80;
                this.field2810[var83] = var81;
            }
            if (var84 == 4) {
                int var87 = var79;
                var79 = var80;
                var80 = var87;
                var81 = var2.method8743() + var82;
                var82 = var81;
                this.field2779[var83] = var79;
                this.field2774[var83] = var87;
                this.field2810[var83] = var81;
            }
        }
        var2.field5363 = var53;
        var3.field5363 = var55;
        var4.field5363 = var57;
        var5.field5363 = var59;
        var6.field5363 = var61;
        var7.field5363 = var63;
        for (int var88 = 0; var88 < var11; var88++) {
            int var89 = this.field2787[var88] & 0xFF;
            if (var89 == 0) {
                this.field2797[var88] = (short) var2.method8899();
                this.field2789[var88] = (short) var2.method8899();
                this.field2781[var88] = (short) var2.method8899();
            }
        }
        var2.field5363 = var65;
        int var90 = var2.method8804();
        if (var90 == 0) {
            return;
        }
        new class301();
        var2.method8899();
        var2.method8899();
        var2.method8899();
        var2.method8734();
    }

    @ObfuscatedName("kr.ag([B)V")
    public void method4669(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class547 var4 = new class547(arg0);
        class547 var5 = new class547(arg0);
        class547 var6 = new class547(arg0);
        class547 var7 = new class547(arg0);
        class547 var8 = new class547(arg0);
        var4.field5363 = arg0.length - 23;
        int var9 = var4.method8899();
        int var10 = var4.method8899();
        int var11 = var4.method8804();
        int var12 = var4.method8804();
        int var13 = var4.method8804();
        int var14 = var4.method8804();
        int var15 = var4.method8804();
        int var16 = var4.method8804();
        int var17 = var4.method8804();
        int var18 = var4.method8899();
        int var19 = var4.method8899();
        int var20 = var4.method8899();
        int var21 = var4.method8899();
        int var22 = var4.method8899();
        byte var23 = 0;
        int var25 = var9 + var23;
        int var27 = var10 + var25;
        int var28 = var27;
        if (var13 == 255) {
            var27 += var10;
        }
        int var29 = var27;
        if (var15 == 1) {
            var27 += var10;
        }
        int var30 = var27;
        if (var12 == 1) {
            var27 += var10;
        }
        int var32 = var22 + var27;
        int var33 = var32;
        if (var14 == 1) {
            var32 += var10;
        }
        int var35 = var21 + var32;
        int var37 = var10 * 2 + var35;
        int var39 = var11 * 6 + var37;
        int var41 = var18 + var39;
        int var43 = var19 + var41;
        int var10000 = var20 + var43;
        this.field2771 = var9;
        this.field2775 = var10;
        this.field2786 = var11;
        this.field2772 = new int[var9];
        this.field2773 = new int[var9];
        this.field2768 = new int[var9];
        this.field2779 = new int[var10];
        this.field2774 = new int[var10];
        this.field2810 = new int[var10];
        if (var11 > 0) {
            this.field2787 = new byte[var11];
            this.field2797 = new short[var11];
            this.field2789 = new short[var11];
            this.field2781 = new short[var11];
        }
        if (var16 == 1) {
            this.field2791 = new int[var9];
        }
        if (var12 == 1) {
            this.field2807 = new byte[var10];
            this.field2769 = new byte[var10];
            this.field2784 = new short[var10];
        }
        if (var13 == 255) {
            this.field2780 = new byte[var10];
        } else {
            this.field2790 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2804 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2792 = new int[var10];
        }
        if (var17 == 1) {
            this.field2795 = new int[var9][];
            this.field2796 = new int[var9][];
        }
        this.field2783 = new short[var10];
        var4.field5363 = var23;
        var5.field5363 = var39;
        var6.field5363 = var41;
        var7.field5363 = var43;
        var8.field5363 = var27;
        int var46 = 0;
        int var47 = 0;
        int var48 = 0;
        for (int var49 = 0; var49 < var9; var49++) {
            int var50 = var4.method8804();
            int var51 = 0;
            if ((var50 & 0x1) != 0) {
                var51 = var5.method8743();
            }
            int var52 = 0;
            if ((var50 & 0x2) != 0) {
                var52 = var6.method8743();
            }
            int var53 = 0;
            if ((var50 & 0x4) != 0) {
                var53 = var7.method8743();
            }
            this.field2772[var49] = var46 + var51;
            this.field2773[var49] = var47 + var52;
            this.field2768[var49] = var48 + var53;
            var46 = this.field2772[var49];
            var47 = this.field2773[var49];
            var48 = this.field2768[var49];
            if (var16 == 1) {
                this.field2791[var49] = var8.method8804();
            }
        }
        if (var17 == 1) {
            for (int var54 = 0; var54 < var9; var54++) {
                int var55 = var8.method8804();
                this.field2795[var54] = new int[var55];
                this.field2796[var54] = new int[var55];
                for (int var56 = 0; var56 < var55; var56++) {
                    this.field2795[var54][var56] = var8.method8804();
                    this.field2796[var54][var56] = var8.method8804();
                }
            }
        }
        var4.field5363 = var35;
        var5.field5363 = var30;
        var6.field5363 = var28;
        var7.field5363 = var33;
        var8.field5363 = var29;
        for (int var57 = 0; var57 < var10; var57++) {
            this.field2783[var57] = (short) var4.method8899();
            if (var12 == 1) {
                int var58 = var5.method8804();
                if ((var58 & 0x1) == 1) {
                    this.field2807[var57] = 1;
                    var2 = true;
                } else {
                    this.field2807[var57] = 0;
                }
                if ((var58 & 0x2) == 2) {
                    this.field2769[var57] = (byte) (var58 >> 2);
                    this.field2784[var57] = this.field2783[var57];
                    this.field2783[var57] = 127;
                    if (this.field2784[var57] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field2769[var57] = -1;
                    this.field2784[var57] = -1;
                }
            }
            if (var13 == 255) {
                this.field2780[var57] = var6.method8857();
            }
            if (var14 == 1) {
                this.field2804[var57] = var7.method8857();
            }
            if (var15 == 1) {
                this.field2792[var57] = var8.method8804();
            }
        }
        var4.field5363 = var32;
        var5.field5363 = var25;
        int var59 = 0;
        int var60 = 0;
        int var61 = 0;
        int var62 = 0;
        for (int var63 = 0; var63 < var10; var63++) {
            int var64 = var5.method8804();
            if (var64 == 1) {
                var59 = var4.method8743() + var62;
                var60 = var4.method8743() + var59;
                var61 = var4.method8743() + var60;
                var62 = var61;
                this.field2779[var63] = var59;
                this.field2774[var63] = var60;
                this.field2810[var63] = var61;
            }
            if (var64 == 2) {
                var60 = var61;
                var61 = var4.method8743() + var62;
                var62 = var61;
                this.field2779[var63] = var59;
                this.field2774[var63] = var60;
                this.field2810[var63] = var61;
            }
            if (var64 == 3) {
                var59 = var61;
                var61 = var4.method8743() + var62;
                var62 = var61;
                this.field2779[var63] = var59;
                this.field2774[var63] = var60;
                this.field2810[var63] = var61;
            }
            if (var64 == 4) {
                int var67 = var59;
                var59 = var60;
                var60 = var67;
                var61 = var4.method8743() + var62;
                var62 = var61;
                this.field2779[var63] = var59;
                this.field2774[var63] = var67;
                this.field2810[var63] = var61;
            }
        }
        var4.field5363 = var37;
        for (int var68 = 0; var68 < var11; var68++) {
            this.field2787[var68] = 0;
            this.field2797[var68] = (short) var4.method8899();
            this.field2789[var68] = (short) var4.method8899();
            this.field2781[var68] = (short) var4.method8899();
        }
        if (this.field2769 != null) {
            boolean var69 = false;
            for (int var70 = 0; var70 < var10; var70++) {
                int var71 = this.field2769[var70] & 0xFF;
                if (var71 != 255) {
                    if ((this.field2797[var71] & 0xFFFF) == this.field2779[var70] && (this.field2789[var71] & 0xFFFF) == this.field2774[var70] && (this.field2781[var71] & 0xFFFF) == this.field2810[var70]) {
                        this.field2769[var70] = -1;
                    } else {
                        var69 = true;
                    }
                }
            }
            if (!var69) {
                this.field2769 = null;
            }
        }
        if (!var3) {
            this.field2784 = null;
        }
        if (!var2) {
            this.field2807 = null;
        }
    }

    @ObfuscatedName("kr.ak([B)V")
    public void method4670(byte[] arg0) {
        class547 var2 = new class547(arg0);
        class547 var3 = new class547(arg0);
        class547 var4 = new class547(arg0);
        class547 var5 = new class547(arg0);
        class547 var6 = new class547(arg0);
        class547 var7 = new class547(arg0);
        class547 var8 = new class547(arg0);
        var2.field5363 = arg0.length - 23;
        int var9 = var2.method8899();
        int var10 = var2.method8899();
        int var11 = var2.method8804();
        int var12 = var2.method8804();
        int var13 = var2.method8804();
        int var14 = var2.method8804();
        int var15 = var2.method8804();
        int var16 = var2.method8804();
        int var17 = var2.method8804();
        int var18 = var2.method8899();
        int var19 = var2.method8899();
        int var20 = var2.method8899();
        int var21 = var2.method8899();
        int var22 = var2.method8899();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field2787 = new byte[var11];
            var2.field5363 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field2787[var26] = var2.method8857();
                if (var27 == 0) {
                    var23++;
                }
                if (var27 >= 1 && var27 <= 3) {
                    var24++;
                }
                if (var27 == 2) {
                    var25++;
                }
            }
        }
        int var30 = var9 + var11;
        int var31 = var30;
        if (var12 == 1) {
            var30 += var10;
        }
        int var33 = var10 + var30;
        int var34 = var33;
        if (var13 == 255) {
            var33 += var10;
        }
        int var35 = var33;
        if (var15 == 1) {
            var33 += var10;
        }
        int var36 = var33;
        if (var17 == 1) {
            var33 += var9;
        }
        int var37 = var33;
        if (var14 == 1) {
            var33 += var10;
        }
        int var39 = var21 + var33;
        int var40 = var39;
        if (var16 == 1) {
            var39 += var10 * 2;
        }
        int var42 = var22 + var39;
        int var44 = var10 * 2 + var42;
        int var46 = var18 + var44;
        int var48 = var19 + var46;
        int var50 = var20 + var48;
        int var52 = var23 * 6 + var50;
        int var54 = var24 * 6 + var52;
        int var56 = var24 * 6 + var54;
        int var58 = var24 * 2 + var56;
        int var60 = var24 + var58;
        int var62 = var24 * 2 + var25 * 2 + var60;
        this.field2771 = var9;
        this.field2775 = var10;
        this.field2786 = var11;
        this.field2772 = new int[var9];
        this.field2773 = new int[var9];
        this.field2768 = new int[var9];
        this.field2779 = new int[var10];
        this.field2774 = new int[var10];
        this.field2810 = new int[var10];
        if (var17 == 1) {
            this.field2791 = new int[var9];
        }
        if (var12 == 1) {
            this.field2807 = new byte[var10];
        }
        if (var13 == 255) {
            this.field2780 = new byte[var10];
        } else {
            this.field2790 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2804 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2792 = new int[var10];
        }
        if (var16 == 1) {
            this.field2784 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field2769 = new byte[var10];
        }
        this.field2783 = new short[var10];
        if (var11 > 0) {
            this.field2797 = new short[var11];
            this.field2789 = new short[var11];
            this.field2781 = new short[var11];
        }
        var2.field5363 = var11;
        var3.field5363 = var44;
        var4.field5363 = var46;
        var5.field5363 = var48;
        var6.field5363 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method8804();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method8743();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method8743();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method8743();
            }
            this.field2772[var67] = var64 + var69;
            this.field2773[var67] = var65 + var70;
            this.field2768[var67] = var66 + var71;
            var64 = this.field2772[var67];
            var65 = this.field2773[var67];
            var66 = this.field2768[var67];
            if (var17 == 1) {
                this.field2791[var67] = var6.method8804();
            }
        }
        var2.field5363 = var42;
        var3.field5363 = var31;
        var4.field5363 = var34;
        var5.field5363 = var37;
        var6.field5363 = var35;
        var7.field5363 = var40;
        var8.field5363 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field2783[var72] = (short) var2.method8899();
            if (var12 == 1) {
                this.field2807[var72] = var3.method8857();
            }
            if (var13 == 255) {
                this.field2780[var72] = var4.method8857();
            }
            if (var14 == 1) {
                this.field2804[var72] = var5.method8857();
            }
            if (var15 == 1) {
                this.field2792[var72] = var6.method8804();
            }
            if (var16 == 1) {
                this.field2784[var72] = (short) (var7.method8899() - 1);
            }
            if (this.field2769 != null && this.field2784[var72] != -1) {
                this.field2769[var72] = (byte) (var8.method8804() - 1);
            }
        }
        var2.field5363 = var33;
        var3.field5363 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method8804();
            if (var78 == 1) {
                var73 = var2.method8743() + var76;
                var74 = var2.method8743() + var73;
                var75 = var2.method8743() + var74;
                var76 = var75;
                this.field2779[var77] = var73;
                this.field2774[var77] = var74;
                this.field2810[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method8743() + var76;
                var76 = var75;
                this.field2779[var77] = var73;
                this.field2774[var77] = var74;
                this.field2810[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method8743() + var76;
                var76 = var75;
                this.field2779[var77] = var73;
                this.field2774[var77] = var74;
                this.field2810[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method8743() + var76;
                var76 = var75;
                this.field2779[var77] = var73;
                this.field2774[var77] = var81;
                this.field2810[var77] = var75;
            }
        }
        var2.field5363 = var50;
        var3.field5363 = var52;
        var4.field5363 = var54;
        var5.field5363 = var56;
        var6.field5363 = var58;
        var7.field5363 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field2787[var82] & 0xFF;
            if (var83 == 0) {
                this.field2797[var82] = (short) var2.method8899();
                this.field2789[var82] = (short) var2.method8899();
                this.field2781[var82] = (short) var2.method8899();
            }
        }
        var2.field5363 = var62;
        int var84 = var2.method8804();
        if (var84 == 0) {
            return;
        }
        new class301();
        var2.method8899();
        var2.method8899();
        var2.method8899();
        var2.method8734();
    }

    @ObfuscatedName("kr.ap([B)V")
    public void method4721(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class547 var4 = new class547(arg0);
        class547 var5 = new class547(arg0);
        class547 var6 = new class547(arg0);
        class547 var7 = new class547(arg0);
        class547 var8 = new class547(arg0);
        var4.field5363 = arg0.length - 18;
        int var9 = var4.method8899();
        int var10 = var4.method8899();
        int var11 = var4.method8804();
        int var12 = var4.method8804();
        int var13 = var4.method8804();
        int var14 = var4.method8804();
        int var15 = var4.method8804();
        int var16 = var4.method8804();
        int var17 = var4.method8899();
        int var18 = var4.method8899();
        int var19 = var4.method8899();
        int var20 = var4.method8899();
        byte var21 = 0;
        int var23 = var9 + var21;
        int var25 = var10 + var23;
        int var26 = var25;
        if (var13 == 255) {
            var25 += var10;
        }
        int var27 = var25;
        if (var15 == 1) {
            var25 += var10;
        }
        int var28 = var25;
        if (var12 == 1) {
            var25 += var10;
        }
        int var29 = var25;
        if (var16 == 1) {
            var25 += var9;
        }
        int var30 = var25;
        if (var14 == 1) {
            var25 += var10;
        }
        int var32 = var20 + var25;
        int var34 = var10 * 2 + var32;
        int var36 = var11 * 6 + var34;
        int var38 = var17 + var36;
        int var40 = var18 + var38;
        int var10000 = var19 + var40;
        this.field2771 = var9;
        this.field2775 = var10;
        this.field2786 = var11;
        this.field2772 = new int[var9];
        this.field2773 = new int[var9];
        this.field2768 = new int[var9];
        this.field2779 = new int[var10];
        this.field2774 = new int[var10];
        this.field2810 = new int[var10];
        if (var11 > 0) {
            this.field2787 = new byte[var11];
            this.field2797 = new short[var11];
            this.field2789 = new short[var11];
            this.field2781 = new short[var11];
        }
        if (var16 == 1) {
            this.field2791 = new int[var9];
        }
        if (var12 == 1) {
            this.field2807 = new byte[var10];
            this.field2769 = new byte[var10];
            this.field2784 = new short[var10];
        }
        if (var13 == 255) {
            this.field2780 = new byte[var10];
        } else {
            this.field2790 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2804 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2792 = new int[var10];
        }
        this.field2783 = new short[var10];
        var4.field5363 = var21;
        var5.field5363 = var36;
        var6.field5363 = var38;
        var7.field5363 = var40;
        var8.field5363 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method8804();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method8743();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method8743();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method8743();
            }
            this.field2772[var46] = var43 + var48;
            this.field2773[var46] = var44 + var49;
            this.field2768[var46] = var45 + var50;
            var43 = this.field2772[var46];
            var44 = this.field2773[var46];
            var45 = this.field2768[var46];
            if (var16 == 1) {
                this.field2791[var46] = var8.method8804();
            }
        }
        var4.field5363 = var32;
        var5.field5363 = var28;
        var6.field5363 = var26;
        var7.field5363 = var30;
        var8.field5363 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field2783[var51] = (short) var4.method8899();
            if (var12 == 1) {
                int var52 = var5.method8804();
                if ((var52 & 0x1) == 1) {
                    this.field2807[var51] = 1;
                    var2 = true;
                } else {
                    this.field2807[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field2769[var51] = (byte) (var52 >> 2);
                    this.field2784[var51] = this.field2783[var51];
                    this.field2783[var51] = 127;
                    if (this.field2784[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field2769[var51] = -1;
                    this.field2784[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field2780[var51] = var6.method8857();
            }
            if (var14 == 1) {
                this.field2804[var51] = var7.method8857();
            }
            if (var15 == 1) {
                this.field2792[var51] = var8.method8804();
            }
        }
        var4.field5363 = var25;
        var5.field5363 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method8804();
            if (var58 == 1) {
                var53 = var4.method8743() + var56;
                var54 = var4.method8743() + var53;
                var55 = var4.method8743() + var54;
                var56 = var55;
                this.field2779[var57] = var53;
                this.field2774[var57] = var54;
                this.field2810[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method8743() + var56;
                var56 = var55;
                this.field2779[var57] = var53;
                this.field2774[var57] = var54;
                this.field2810[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method8743() + var56;
                var56 = var55;
                this.field2779[var57] = var53;
                this.field2774[var57] = var54;
                this.field2810[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method8743() + var56;
                var56 = var55;
                this.field2779[var57] = var53;
                this.field2774[var57] = var61;
                this.field2810[var57] = var55;
            }
        }
        var4.field5363 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field2787[var62] = 0;
            this.field2797[var62] = (short) var4.method8899();
            this.field2789[var62] = (short) var4.method8899();
            this.field2781[var62] = (short) var4.method8899();
        }
        if (this.field2769 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field2769[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field2797[var65] & 0xFFFF) == this.field2779[var64] && (this.field2789[var65] & 0xFFFF) == this.field2774[var64] && (this.field2781[var65] & 0xFFFF) == this.field2810[var64]) {
                        this.field2769[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field2769 = null;
            }
        }
        if (!var3) {
            this.field2784 = null;
        }
        if (!var2) {
            this.field2807 = null;
        }
    }

    public class273(class273[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        this.field2771 = 0;
        this.field2775 = 0;
        this.field2786 = 0;
        this.field2790 = -1;
        for (int var10 = 0; var10 < arg1; var10++) {
            class273 var11 = arg0[var10];
            if (var11 != null) {
                this.field2771 += var11.field2771;
                this.field2775 += var11.field2775;
                this.field2786 += var11.field2786;
                if (var11.field2780 == null) {
                    if (this.field2790 == -1) {
                        this.field2790 = var11.field2790;
                    }
                    if (this.field2790 != var11.field2790) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var11.field2807 != null;
                var5 |= var11.field2804 != null;
                var6 |= var11.field2792 != null;
                var7 |= var11.field2784 != null;
                var8 |= var11.field2769 != null;
                var9 |= var11.field2795 != null;
            }
        }
        this.field2772 = new int[this.field2771];
        this.field2773 = new int[this.field2771];
        this.field2768 = new int[this.field2771];
        this.field2791 = new int[this.field2771];
        this.field2779 = new int[this.field2775];
        this.field2774 = new int[this.field2775];
        this.field2810 = new int[this.field2775];
        if (var3) {
            this.field2807 = new byte[this.field2775];
        }
        if (var4) {
            this.field2780 = new byte[this.field2775];
        }
        if (var5) {
            this.field2804 = new byte[this.field2775];
        }
        if (var6) {
            this.field2792 = new int[this.field2775];
        }
        if (var7) {
            this.field2784 = new short[this.field2775];
        }
        if (var8) {
            this.field2769 = new byte[this.field2775];
        }
        if (var9) {
            this.field2795 = new int[this.field2771][];
            this.field2796 = new int[this.field2771][];
        }
        this.field2783 = new short[this.field2775];
        if (this.field2786 > 0) {
            this.field2787 = new byte[this.field2786];
            this.field2797 = new short[this.field2786];
            this.field2789 = new short[this.field2786];
            this.field2781 = new short[this.field2786];
        }
        this.field2771 = 0;
        this.field2775 = 0;
        this.field2786 = 0;
        for (int var12 = 0; var12 < arg1; var12++) {
            class273 var13 = arg0[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < var13.field2775; var14++) {
                    if (var3 && var13.field2807 != null) {
                        this.field2807[this.field2775] = var13.field2807[var14];
                    }
                    if (var4) {
                        if (var13.field2780 == null) {
                            this.field2780[this.field2775] = var13.field2790;
                        } else {
                            this.field2780[this.field2775] = var13.field2780[var14];
                        }
                    }
                    if (var5 && var13.field2804 != null) {
                        this.field2804[this.field2775] = var13.field2804[var14];
                    }
                    if (var6 && var13.field2792 != null) {
                        this.field2792[this.field2775] = var13.field2792[var14];
                    }
                    if (var7) {
                        if (var13.field2784 == null) {
                            this.field2784[this.field2775] = -1;
                        } else {
                            this.field2784[this.field2775] = var13.field2784[var14];
                        }
                    }
                    if (var8) {
                        if (var13.field2769 == null || var13.field2769[var14] == -1) {
                            this.field2769[this.field2775] = -1;
                        } else {
                            this.field2769[this.field2775] = (byte) (var13.field2769[var14] + this.field2786);
                        }
                    }
                    this.field2783[this.field2775] = var13.field2783[var14];
                    this.field2779[this.field2775] = this.method4666(var13, var13.field2779[var14]);
                    this.field2774[this.field2775] = this.method4666(var13, var13.field2774[var14]);
                    this.field2810[this.field2775] = this.method4666(var13, var13.field2810[var14]);
                    this.field2775++;
                }
                for (int var15 = 0; var15 < var13.field2786; var15++) {
                    byte var16 = this.field2787[this.field2786] = var13.field2787[var15];
                    if (var16 == 0) {
                        this.field2797[this.field2786] = (short) this.method4666(var13, var13.field2797[var15]);
                        this.field2789[this.field2786] = (short) this.method4666(var13, var13.field2789[var15]);
                        this.field2781[this.field2786] = (short) this.method4666(var13, var13.field2781[var15]);
                    }
                    this.field2786++;
                }
            }
        }
    }

    @ObfuscatedName("kr.an(Lkr;I)I")
    public final int method4666(class273 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field2772[arg1];
        int var5 = arg0.field2773[arg1];
        int var6 = arg0.field2768[arg1];
        for (int var7 = 0; var7 < this.field2771; var7++) {
            if (this.field2772[var7] == var4 && this.field2773[var7] == var5 && this.field2768[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field2772[this.field2771] = var4;
            this.field2773[this.field2771] = var5;
            this.field2768[this.field2771] = var6;
            if (arg0.field2791 != null) {
                this.field2791[this.field2771] = arg0.field2791[arg1];
            }
            if (arg0.field2795 != null) {
                this.field2795[this.field2771] = arg0.field2795[arg1];
                this.field2796[this.field2771] = arg0.field2796[arg1];
            }
            var3 = this.field2771++;
        }
        return var3;
    }

    public class273(class273 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field2771 = arg0.field2771;
        this.field2775 = arg0.field2775;
        this.field2786 = arg0.field2786;
        if (arg1) {
            this.field2772 = arg0.field2772;
            this.field2773 = arg0.field2773;
            this.field2768 = arg0.field2768;
        } else {
            this.field2772 = new int[this.field2771];
            this.field2773 = new int[this.field2771];
            this.field2768 = new int[this.field2771];
            for (int var6 = 0; var6 < this.field2771; var6++) {
                this.field2772[var6] = arg0.field2772[var6];
                this.field2773[var6] = arg0.field2773[var6];
                this.field2768[var6] = arg0.field2768[var6];
            }
        }
        if (arg2) {
            this.field2783 = arg0.field2783;
        } else {
            this.field2783 = new short[this.field2775];
            for (int var7 = 0; var7 < this.field2775; var7++) {
                this.field2783[var7] = arg0.field2783[var7];
            }
        }
        if (arg3 || arg0.field2784 == null) {
            this.field2784 = arg0.field2784;
        } else {
            this.field2784 = new short[this.field2775];
            for (int var8 = 0; var8 < this.field2775; var8++) {
                this.field2784[var8] = arg0.field2784[var8];
            }
        }
        if (arg4) {
            this.field2804 = arg0.field2804;
        } else {
            this.field2804 = new byte[this.field2775];
            if (arg0.field2804 == null) {
                for (int var9 = 0; var9 < this.field2775; var9++) {
                    this.field2804[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field2775; var10++) {
                    this.field2804[var10] = arg0.field2804[var10];
                }
            }
        }
        this.field2779 = arg0.field2779;
        this.field2774 = arg0.field2774;
        this.field2810 = arg0.field2810;
        this.field2807 = arg0.field2807;
        this.field2780 = arg0.field2780;
        this.field2769 = arg0.field2769;
        this.field2790 = arg0.field2790;
        this.field2787 = arg0.field2787;
        this.field2797 = arg0.field2797;
        this.field2789 = arg0.field2789;
        this.field2781 = arg0.field2781;
        this.field2791 = arg0.field2791;
        this.field2792 = arg0.field2792;
        this.field2793 = arg0.field2793;
        this.field2803 = arg0.field2803;
        this.field2798 = arg0.field2798;
        this.field2776 = arg0.field2776;
        this.field2799 = arg0.field2799;
        this.field2795 = arg0.field2795;
        this.field2796 = arg0.field2796;
        this.field2800 = arg0.field2800;
        this.field2801 = arg0.field2801;
    }

    @ObfuscatedName("kr.aj()Lkr;")
    public class273 method4674() {
        class273 var1 = new class273();
        if (this.field2807 != null) {
            var1.field2807 = new byte[this.field2775];
            for (int var2 = 0; var2 < this.field2775; var2++) {
                var1.field2807[var2] = this.field2807[var2];
            }
        }
        var1.field2771 = this.field2771;
        var1.field2775 = this.field2775;
        var1.field2786 = this.field2786;
        var1.field2772 = this.field2772;
        var1.field2773 = this.field2773;
        var1.field2768 = this.field2768;
        var1.field2779 = this.field2779;
        var1.field2774 = this.field2774;
        var1.field2810 = this.field2810;
        var1.field2780 = this.field2780;
        var1.field2804 = this.field2804;
        var1.field2769 = this.field2769;
        var1.field2783 = this.field2783;
        var1.field2784 = this.field2784;
        var1.field2790 = this.field2790;
        var1.field2787 = this.field2787;
        var1.field2797 = this.field2797;
        var1.field2789 = this.field2789;
        var1.field2781 = this.field2781;
        var1.field2791 = this.field2791;
        var1.field2792 = this.field2792;
        var1.field2793 = this.field2793;
        var1.field2803 = this.field2803;
        var1.field2798 = this.field2798;
        var1.field2776 = this.field2776;
        var1.field2800 = this.field2800;
        var1.field2801 = this.field2801;
        return var1;
    }

    @ObfuscatedName("kr.av([[IIIIZI)Lkr;")
    public class273 method4675(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method4688();
        int var7 = this.field2794 + arg1;
        int var8 = this.field2805 + arg1;
        int var9 = this.field2777 + arg3;
        int var10 = this.field2806 + arg3;
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
        class273 var15;
        if (arg4) {
            var15 = new class273();
            var15.field2771 = this.field2771;
            var15.field2775 = this.field2775;
            var15.field2786 = this.field2786;
            var15.field2772 = this.field2772;
            var15.field2768 = this.field2768;
            var15.field2779 = this.field2779;
            var15.field2774 = this.field2774;
            var15.field2810 = this.field2810;
            var15.field2807 = this.field2807;
            var15.field2780 = this.field2780;
            var15.field2804 = this.field2804;
            var15.field2769 = this.field2769;
            var15.field2783 = this.field2783;
            var15.field2784 = this.field2784;
            var15.field2790 = this.field2790;
            var15.field2787 = this.field2787;
            var15.field2797 = this.field2797;
            var15.field2789 = this.field2789;
            var15.field2781 = this.field2781;
            var15.field2791 = this.field2791;
            var15.field2792 = this.field2792;
            var15.field2793 = this.field2793;
            var15.field2803 = this.field2803;
            var15.field2800 = this.field2800;
            var15.field2801 = this.field2801;
            var15.field2773 = new int[var15.field2771];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field2771; var16++) {
                int var17 = this.field2772[var16] + arg1;
                int var18 = this.field2768[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field2773[var16] = this.field2773[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field2771; var26++) {
                int var27 = (-this.field2773[var26] << 16) / this.field3016;
                if (var27 < arg5) {
                    int var28 = this.field2772[var26] + arg1;
                    int var29 = this.field2768[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field2773[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field2773[var26];
                }
            }
        }
        var15.method4689();
        return var15;
    }

    @ObfuscatedName("kr.ab()V")
    public void method4676() {
        int var10002;
        if (this.field2791 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field2771; var3++) {
                int var4 = this.field2791[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field2793 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field2793[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field2771) {
                int var7 = this.field2791[var6];
                this.field2793[var7][var1[var7]++] = var6++;
            }
            this.field2791 = null;
        }
        if (this.field2792 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field2775; var10++) {
            int var11 = this.field2792[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field2803 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field2803[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field2775) {
            int var14 = this.field2792[var13];
            this.field2803[var14][var8[var14]++] = var13++;
        }
        this.field2792 = null;
    }

    @ObfuscatedName("kr.ai()V")
    public void method4677() {
        for (int var1 = 0; var1 < this.field2771; var1++) {
            int var2 = this.field2772[var1];
            this.field2772[var1] = this.field2768[var1];
            this.field2768[var1] = -var2;
        }
        this.method4689();
    }

    @ObfuscatedName("kr.ae()V")
    public void method4672() {
        for (int var1 = 0; var1 < this.field2771; var1++) {
            this.field2772[var1] = -this.field2772[var1];
            this.field2768[var1] = -this.field2768[var1];
        }
        this.method4689();
    }

    @ObfuscatedName("kr.au()V")
    public void method4679() {
        for (int var1 = 0; var1 < this.field2771; var1++) {
            int var2 = this.field2768[var1];
            this.field2768[var1] = this.field2772[var1];
            this.field2772[var1] = -var2;
        }
        this.method4689();
    }

    @ObfuscatedName("kr.al(I)V")
    public void method4680(int arg0) {
        int var2 = field2811[arg0];
        int var3 = field2812[arg0];
        for (int var4 = 0; var4 < this.field2771; var4++) {
            int var5 = this.field2772[var4] * var3 + this.field2768[var4] * var2 >> 16;
            this.field2768[var4] = this.field2768[var4] * var3 - this.field2772[var4] * var2 >> 16;
            this.field2772[var4] = var5;
        }
        this.method4689();
    }

    @ObfuscatedName("kr.ay(III)V")
    public void method4709(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2771; var4++) {
            this.field2772[var4] += arg0;
            this.field2773[var4] += arg1;
            this.field2768[var4] += arg2;
        }
        this.method4689();
    }

    @ObfuscatedName("kr.ao(SS)V")
    public void method4732(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2775; var3++) {
            if (this.field2783[var3] == arg0) {
                this.field2783[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("kr.aa(SS)V")
    public void method4741(short arg0, short arg1) {
        if (this.field2784 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field2775; var3++) {
            if (this.field2784[var3] == arg0) {
                this.field2784[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("kr.as()V")
    public void method4684() {
        for (int var1 = 0; var1 < this.field2771; var1++) {
            this.field2768[var1] = -this.field2768[var1];
        }
        for (int var2 = 0; var2 < this.field2775; var2++) {
            int var3 = this.field2779[var2];
            this.field2779[var2] = this.field2810[var2];
            this.field2810[var2] = var3;
        }
        this.method4689();
    }

    @ObfuscatedName("kr.aw(III)V")
    public void method4678(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2771; var4++) {
            this.field2772[var4] = this.field2772[var4] * arg0 / 128;
            this.field2773[var4] = this.field2773[var4] * arg1 / 128;
            this.field2768[var4] = this.field2768[var4] * arg2 / 128;
        }
        this.method4689();
    }

    @ObfuscatedName("kr.at()V")
    public void method4686() {
        if (this.field2798 != null) {
            return;
        }
        this.field2798 = new class296[this.field2771];
        for (int var1 = 0; var1 < this.field2771; var1++) {
            this.field2798[var1] = new class296();
        }
        for (int var2 = 0; var2 < this.field2775; var2++) {
            int var3 = this.field2779[var2];
            int var4 = this.field2774[var2];
            int var5 = this.field2810[var2];
            int var6 = this.field2772[var4] - this.field2772[var3];
            int var7 = this.field2773[var4] - this.field2773[var3];
            int var8 = this.field2768[var4] - this.field2768[var3];
            int var9 = this.field2772[var5] - this.field2772[var3];
            int var10 = this.field2773[var5] - this.field2773[var3];
            int var11 = this.field2768[var5] - this.field2768[var3];
            int var12 = var7 * var11 - var8 * var10;
            int var13 = var8 * var9 - var6 * var11;
            int var14;
            for (var14 = var6 * var10 - var7 * var9; var12 > 8192 || var13 > 8192 || var14 > 8192 || var12 < -8192 || var13 < -8192 || var14 < -8192; var14 >>= 0x1) {
                var12 >>= 0x1;
                var13 >>= 0x1;
            }
            int var15 = (int) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
            if (var15 <= 0) {
                var15 = 1;
            }
            int var16 = var12 * 256 / var15;
            int var17 = var13 * 256 / var15;
            int var18 = var14 * 256 / var15;
            byte var19;
            if (this.field2807 == null) {
                var19 = 0;
            } else {
                var19 = this.field2807[var2];
            }
            if (var19 == 0) {
                class296 var20 = this.field2798[var3];
                var20.field3174 += var16;
                var20.field3170 += var17;
                var20.field3169 += var18;
                var20.field3172++;
                class296 var21 = this.field2798[var4];
                var21.field3174 += var16;
                var21.field3170 += var17;
                var21.field3169 += var18;
                var21.field3172++;
                class296 var22 = this.field2798[var5];
                var22.field3174 += var16;
                var22.field3170 += var17;
                var22.field3169 += var18;
                var22.field3172++;
            } else if (var19 == 1) {
                if (this.field2776 == null) {
                    this.field2776 = new class287[this.field2775];
                }
                class287 var23 = this.field2776[var2] = new class287();
                var23.field3023 = var16;
                var23.field3018 = var17;
                var23.field3017 = var18;
            }
        }
    }

    @ObfuscatedName("kr.af()V")
    public void method4689() {
        this.field2798 = null;
        this.field2799 = null;
        this.field2776 = null;
        this.field2802 = false;
    }

    @ObfuscatedName("kr.am()V")
    public void method4688() {
        if (this.field2802) {
            return;
        }
        this.field3016 = 0;
        this.field2778 = 0;
        this.field2794 = 999999;
        this.field2805 = -999999;
        this.field2806 = -99999;
        this.field2777 = 99999;
        for (int var1 = 0; var1 < this.field2771; var1++) {
            int var2 = this.field2772[var1];
            int var3 = this.field2773[var1];
            int var4 = this.field2768[var1];
            if (var2 < this.field2794) {
                this.field2794 = var2;
            }
            if (var2 > this.field2805) {
                this.field2805 = var2;
            }
            if (var4 < this.field2777) {
                this.field2777 = var4;
            }
            if (var4 > this.field2806) {
                this.field2806 = var4;
            }
            if (-var3 > this.field3016) {
                this.field3016 = -var3;
            }
            if (var3 > this.field2778) {
                this.field2778 = var3;
            }
        }
        this.field2802 = true;
    }

    @ObfuscatedName("kr.ar(Lkr;Lkr;IIIZ)V")
    public static void method4691(class273 arg0, class273 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method4688();
        arg0.method4686();
        arg1.method4688();
        arg1.method4686();
        field2785++;
        int var6 = 0;
        int[] var7 = arg1.field2772;
        int var8 = arg1.field2771;
        for (int var9 = 0; var9 < arg0.field2771; var9++) {
            class296 var10 = arg0.field2798[var9];
            if (var10.field3172 != 0) {
                int var11 = arg0.field2773[var9] - arg3;
                if (var11 <= arg1.field2778) {
                    int var12 = arg0.field2772[var9] - arg2;
                    if (var12 >= arg1.field2794 && var12 <= arg1.field2805) {
                        int var13 = arg0.field2768[var9] - arg4;
                        if (var13 >= arg1.field2777 && var13 <= arg1.field2806) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class296 var15 = arg1.field2798[var14];
                                if (var7[var14] == var12 && arg1.field2768[var14] == var13 && arg1.field2773[var14] == var11 && var15.field3172 != 0) {
                                    if (arg0.field2799 == null) {
                                        arg0.field2799 = new class296[arg0.field2771];
                                    }
                                    if (arg1.field2799 == null) {
                                        arg1.field2799 = new class296[var8];
                                    }
                                    class296 var16 = arg0.field2799[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field2799[var9] = new class296(var10);
                                    }
                                    class296 var17 = arg1.field2799[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field2799[var14] = new class296(var15);
                                    }
                                    var16.field3174 += var15.field3174;
                                    var16.field3170 += var15.field3170;
                                    var16.field3169 += var15.field3169;
                                    var16.field3172 += var15.field3172;
                                    var17.field3174 += var10.field3174;
                                    var17.field3170 += var10.field3170;
                                    var17.field3169 += var10.field3169;
                                    var17.field3172 += var10.field3172;
                                    var6++;
                                    field2808[var9] = field2785;
                                    field2809[var14] = field2785;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var6 < 3 || !arg5) {
            return;
        }
        for (int var18 = 0; var18 < arg0.field2775; var18++) {
            if (field2808[arg0.field2779[var18]] == field2785 && field2808[arg0.field2774[var18]] == field2785 && field2808[arg0.field2810[var18]] == field2785) {
                if (arg0.field2807 == null) {
                    arg0.field2807 = new byte[arg0.field2775];
                }
                arg0.field2807[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field2775; var19++) {
            if (field2809[arg1.field2779[var19]] == field2785 && field2809[arg1.field2774[var19]] == field2785 && field2809[arg1.field2810[var19]] == field2785) {
                if (arg1.field2807 == null) {
                    arg1.field2807 = new byte[arg1.field2775];
                }
                arg1.field2807[var19] = 2;
            }
        }
    }

    @ObfuscatedName("kr.bt(IIIII)Llv;")
    public final class294 method4682(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method4686();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class294 var8 = new class294();
        var8.field3096 = new int[this.field2775];
        var8.field3130 = new int[this.field2775];
        var8.field3098 = new int[this.field2775];
        if (this.field2786 > 0 && this.field2769 != null) {
            int[] var9 = new int[this.field2786];
            for (int var10 = 0; var10 < this.field2775; var10++) {
                if (this.field2769[var10] != -1) {
                    var9[this.field2769[var10] & 0xFF]++;
                }
            }
            var8.field3109 = 0;
            for (int var11 = 0; var11 < this.field2786; var11++) {
                if (var9[var11] > 0 && this.field2787[var11] == 0) {
                    var8.field3109++;
                }
            }
            var8.field3105 = new int[var8.field3109];
            var8.field3135 = new int[var8.field3109];
            var8.field3112 = new int[var8.field3109];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field2786; var13++) {
                if (var9[var13] > 0 && this.field2787[var13] == 0) {
                    var8.field3105[var12] = this.field2797[var13] & 0xFFFF;
                    var8.field3135[var12] = this.field2789[var13] & 0xFFFF;
                    var8.field3112[var12] = this.field2781[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field3101 = new byte[this.field2775];
            for (int var14 = 0; var14 < this.field2775; var14++) {
                if (this.field2769[var14] == -1) {
                    var8.field3101[var14] = -1;
                } else {
                    var8.field3101[var14] = (byte) var9[this.field2769[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field2775; var15++) {
            byte var16;
            if (this.field2807 == null) {
                var16 = 0;
            } else {
                var16 = this.field2807[var15];
            }
            byte var17;
            if (this.field2804 == null) {
                var17 = 0;
            } else {
                var17 = this.field2804[var15];
            }
            short var18;
            if (this.field2784 == null) {
                var18 = -1;
            } else {
                var18 = this.field2784[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field2783[var15] & 0xFFFF;
                    class296 var20;
                    if (this.field2799 == null || this.field2799[this.field2779[var15]] == null) {
                        var20 = this.field2798[this.field2779[var15]];
                    } else {
                        var20 = this.field2799[this.field2779[var15]];
                    }
                    int var21 = (var20.field3169 * arg4 + var20.field3174 * arg2 + var20.field3170 * arg3) / (var20.field3172 * var7) + arg0;
                    var8.field3096[var15] = method4726(var19, var21);
                    class296 var22;
                    if (this.field2799 == null || this.field2799[this.field2774[var15]] == null) {
                        var22 = this.field2798[this.field2774[var15]];
                    } else {
                        var22 = this.field2799[this.field2774[var15]];
                    }
                    int var23 = (var22.field3169 * arg4 + var22.field3174 * arg2 + var22.field3170 * arg3) / (var22.field3172 * var7) + arg0;
                    var8.field3130[var15] = method4726(var19, var23);
                    class296 var24;
                    if (this.field2799 == null || this.field2799[this.field2810[var15]] == null) {
                        var24 = this.field2798[this.field2810[var15]];
                    } else {
                        var24 = this.field2799[this.field2810[var15]];
                    }
                    int var25 = (var24.field3169 * arg4 + var24.field3174 * arg2 + var24.field3170 * arg3) / (var24.field3172 * var7) + arg0;
                    var8.field3098[var15] = method4726(var19, var25);
                } else if (var16 == 1) {
                    class287 var26 = this.field2776[var15];
                    int var27 = (var26.field3017 * arg4 + var26.field3023 * arg2 + var26.field3018 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field3096[var15] = method4726(this.field2783[var15] & 0xFFFF, var27);
                    var8.field3098[var15] = -1;
                } else if (var16 == 3) {
                    var8.field3096[var15] = 128;
                    var8.field3098[var15] = -1;
                } else {
                    var8.field3098[var15] = -2;
                }
            } else if (var16 == 0) {
                class296 var28;
                if (this.field2799 == null || this.field2799[this.field2779[var15]] == null) {
                    var28 = this.field2798[this.field2779[var15]];
                } else {
                    var28 = this.field2799[this.field2779[var15]];
                }
                int var29 = (var28.field3169 * arg4 + var28.field3174 * arg2 + var28.field3170 * arg3) / (var28.field3172 * var7) + arg0;
                var8.field3096[var15] = method4681(var29);
                class296 var30;
                if (this.field2799 == null || this.field2799[this.field2774[var15]] == null) {
                    var30 = this.field2798[this.field2774[var15]];
                } else {
                    var30 = this.field2799[this.field2774[var15]];
                }
                int var31 = (var30.field3169 * arg4 + var30.field3174 * arg2 + var30.field3170 * arg3) / (var30.field3172 * var7) + arg0;
                var8.field3130[var15] = method4681(var31);
                class296 var32;
                if (this.field2799 == null || this.field2799[this.field2810[var15]] == null) {
                    var32 = this.field2798[this.field2810[var15]];
                } else {
                    var32 = this.field2799[this.field2810[var15]];
                }
                int var33 = (var32.field3169 * arg4 + var32.field3174 * arg2 + var32.field3170 * arg3) / (var32.field3172 * var7) + arg0;
                var8.field3098[var15] = method4681(var33);
            } else if (var16 == 1) {
                class287 var34 = this.field2776[var15];
                int var35 = (var34.field3017 * arg4 + var34.field3023 * arg2 + var34.field3018 * arg3) / (var7 / 2 + var7) + arg0;
                var8.field3096[var15] = method4681(var35);
                var8.field3098[var15] = -1;
            } else {
                var8.field3098[var15] = -2;
            }
        }
        this.method4676();
        var8.field3088 = this.field2771;
        var8.field3089 = this.field2772;
        var8.field3103 = this.field2773;
        var8.field3141 = this.field2768;
        var8.field3092 = this.field2775;
        var8.field3093 = this.field2779;
        var8.field3094 = this.field2774;
        var8.field3085 = this.field2810;
        var8.field3099 = this.field2780;
        var8.field3100 = this.field2804;
        var8.field3156 = this.field2790;
        var8.field3108 = this.field2793;
        var8.field3138 = this.field2803;
        var8.field3102 = this.field2784;
        var8.field3110 = this.field2795;
        var8.field3111 = this.field2796;
        return var8;
    }

    @ObfuscatedName("kr.bj(II)I")
    public static final int method4726(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("kr.be(I)I")
    public static final int method4681(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
