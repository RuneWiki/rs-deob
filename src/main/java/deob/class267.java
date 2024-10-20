package deob;

@ObfuscatedName("kf")
public class class267 extends class278 {

    @ObfuscatedName("kf.ai")
    public int field2714 = 0;

    @ObfuscatedName("kf.ar")
    public int[] field2747;

    @ObfuscatedName("kf.as")
    public int[] field2751;

    @ObfuscatedName("kf.aa")
    public int[] field2720;

    @ObfuscatedName("kf.az")
    public int field2741 = 0;

    @ObfuscatedName("kf.ao")
    public int[] field2753;

    @ObfuscatedName("kf.au")
    public int[] field2723;

    @ObfuscatedName("kf.ak")
    public int[] field2724;

    @ObfuscatedName("kf.ah")
    public byte[] field2725;

    @ObfuscatedName("kf.aj")
    public byte[] field2726;

    @ObfuscatedName("kf.af")
    public byte[] field2727;

    @ObfuscatedName("kf.ax")
    public byte[] field2728;

    @ObfuscatedName("kf.an")
    public short[] field2716;

    @ObfuscatedName("kf.ag")
    public short[] field2730;

    @ObfuscatedName("kf.am")
    public byte field2742 = 0;

    @ObfuscatedName("kf.ad")
    public int field2718;

    @ObfuscatedName("kf.at")
    public byte[] field2733;

    @ObfuscatedName("kf.ay")
    public short[] field2731;

    @ObfuscatedName("kf.ae")
    public short[] field2735;

    @ObfuscatedName("kf.ac")
    public short[] field2719;

    @ObfuscatedName("kf.ab")
    public int[] field2737;

    @ObfuscatedName("kf.av")
    public int[] field2738;

    @ObfuscatedName("kf.ap")
    public int[][] field2739;

    @ObfuscatedName("kf.bu")
    public int[][] field2740;

    @ObfuscatedName("kf.bo")
    public int[][] field2722;

    @ObfuscatedName("kf.bd")
    public int[][] field2736;

    @ObfuscatedName("kf.bi")
    public class279[] field2743;

    @ObfuscatedName("kf.bq")
    public class287[] field2744;

    @ObfuscatedName("kf.ba")
    public class287[] field2745;

    @ObfuscatedName("kf.bt")
    public short field2746;

    @ObfuscatedName("kf.bk")
    public short field2721;

    @ObfuscatedName("kf.bm")
    public boolean field2729 = false;

    @ObfuscatedName("kf.bw")
    public int field2749;

    @ObfuscatedName("kf.bv")
    public int field2748;

    @ObfuscatedName("kf.by")
    public int field2717;

    @ObfuscatedName("kf.bb")
    public int field2752;

    @ObfuscatedName("kf.bn")
    public int field2732;

    @ObfuscatedName("kf.br")
    public static int[] field2754 = new int[10000];

    @ObfuscatedName("kf.bp")
    public static int[] field2755 = new int[10000];

    @ObfuscatedName("kf.bf")
    public static int field2756 = 0;

    @ObfuscatedName("kf.bg")
    public static int[] field2757 = class272.field2819;

    @ObfuscatedName("kf.be")
    public static int[] field2758 = class272.field2820;

    public class267() {
    }

    @ObfuscatedName("kf.aq(Lof;II)Lkf;")
    public static class267 method4644(class378 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method6489(arg1, arg2);
        return var3 == null ? null : new class267(var3);
    }

    public class267(byte[] arg0) {
        class534 var2 = new class534(10);
        var2.method8575(-2);
        if (arg0[arg0.length - 1] == -3 && arg0[arg0.length - 2] == -1) {
            this.method4645(arg0);
        } else if (arg0[arg0.length - 1] == -2 && arg0[arg0.length - 2] == -1) {
            this.method4702(arg0);
        } else if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method4647(arg0);
        } else {
            this.method4648(arg0);
        }
    }

    @ObfuscatedName("kf.al([B)V")
    public void method4645(byte[] arg0) {
        class534 var2 = new class534(arg0);
        class534 var3 = new class534(arg0);
        class534 var4 = new class534(arg0);
        class534 var5 = new class534(arg0);
        class534 var6 = new class534(arg0);
        class534 var7 = new class534(arg0);
        class534 var8 = new class534(arg0);
        var2.field5200 = arg0.length - 26;
        int var9 = var2.method8593();
        int var10 = var2.method8593();
        int var11 = var2.method8591();
        int var12 = var2.method8591();
        int var13 = var2.method8591();
        int var14 = var2.method8591();
        int var15 = var2.method8591();
        int var16 = var2.method8591();
        int var17 = var2.method8591();
        int var18 = var2.method8591();
        int var19 = var2.method8593();
        int var20 = var2.method8593();
        int var21 = var2.method8593();
        int var22 = var2.method8593();
        int var23 = var2.method8593();
        int var24 = var2.method8593();
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        if (var11 > 0) {
            this.field2733 = new byte[var11];
            var2.field5200 = 0;
            for (int var28 = 0; var28 < var11; var28++) {
                byte var29 = this.field2733[var28] = var2.method8592();
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
        this.field2714 = var9;
        this.field2741 = var10;
        this.field2718 = var11;
        this.field2747 = new int[var9];
        this.field2751 = new int[var9];
        this.field2720 = new int[var9];
        this.field2753 = new int[var10];
        this.field2723 = new int[var10];
        this.field2724 = new int[var10];
        if (var17 == 1) {
            this.field2737 = new int[var9];
        }
        if (var12 == 1) {
            this.field2725 = new byte[var10];
        }
        if (var13 == 255) {
            this.field2726 = new byte[var10];
        } else {
            this.field2742 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2727 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2738 = new int[var10];
        }
        if (var16 == 1) {
            this.field2730 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field2728 = new byte[var10];
        }
        if (var18 == 1) {
            this.field2722 = new int[var9][];
            this.field2736 = new int[var9][];
        }
        this.field2716 = new short[var10];
        if (var11 > 0) {
            this.field2731 = new short[var11];
            this.field2735 = new short[var11];
            this.field2719 = new short[var11];
        }
        var2.field5200 = var11;
        var3.field5200 = var47;
        var4.field5200 = var49;
        var5.field5200 = var51;
        var6.field5200 = var35;
        int var67 = 0;
        int var68 = 0;
        int var69 = 0;
        for (int var70 = 0; var70 < var9; var70++) {
            int var71 = var2.method8591();
            int var72 = 0;
            if ((var71 & 0x1) != 0) {
                var72 = var3.method8606();
            }
            int var73 = 0;
            if ((var71 & 0x2) != 0) {
                var73 = var4.method8606();
            }
            int var74 = 0;
            if ((var71 & 0x4) != 0) {
                var74 = var5.method8606();
            }
            this.field2747[var70] = var67 + var72;
            this.field2751[var70] = var68 + var73;
            this.field2720[var70] = var69 + var74;
            var67 = this.field2747[var70];
            var68 = this.field2751[var70];
            var69 = this.field2720[var70];
            if (var17 == 1) {
                this.field2737[var70] = var6.method8591();
            }
        }
        if (var18 == 1) {
            for (int var75 = 0; var75 < var9; var75++) {
                int var76 = var6.method8591();
                this.field2722[var75] = new int[var76];
                this.field2736[var75] = new int[var76];
                for (int var77 = 0; var77 < var76; var77++) {
                    this.field2722[var75][var77] = var6.method8591();
                    this.field2736[var75][var77] = var6.method8591();
                }
            }
        }
        var2.field5200 = var45;
        var3.field5200 = var33;
        var4.field5200 = var36;
        var5.field5200 = var40;
        var6.field5200 = var37;
        var7.field5200 = var43;
        var8.field5200 = var42;
        for (int var78 = 0; var78 < var10; var78++) {
            this.field2716[var78] = (short) var2.method8593();
            if (var12 == 1) {
                this.field2725[var78] = var3.method8592();
            }
            if (var13 == 255) {
                this.field2726[var78] = var4.method8592();
            }
            if (var14 == 1) {
                this.field2727[var78] = var5.method8592();
            }
            if (var15 == 1) {
                this.field2738[var78] = var6.method8591();
            }
            if (var16 == 1) {
                this.field2730[var78] = (short) (var7.method8593() - 1);
            }
            if (this.field2728 != null && this.field2730[var78] != -1) {
                this.field2728[var78] = (byte) (var8.method8591() - 1);
            }
        }
        var2.field5200 = var39;
        var3.field5200 = var32;
        int var79 = 0;
        int var80 = 0;
        int var81 = 0;
        int var82 = 0;
        for (int var83 = 0; var83 < var10; var83++) {
            int var84 = var3.method8591();
            if (var84 == 1) {
                var79 = var2.method8606() + var82;
                var80 = var2.method8606() + var79;
                var81 = var2.method8606() + var80;
                var82 = var81;
                this.field2753[var83] = var79;
                this.field2723[var83] = var80;
                this.field2724[var83] = var81;
            }
            if (var84 == 2) {
                var80 = var81;
                var81 = var2.method8606() + var82;
                var82 = var81;
                this.field2753[var83] = var79;
                this.field2723[var83] = var80;
                this.field2724[var83] = var81;
            }
            if (var84 == 3) {
                var79 = var81;
                var81 = var2.method8606() + var82;
                var82 = var81;
                this.field2753[var83] = var79;
                this.field2723[var83] = var80;
                this.field2724[var83] = var81;
            }
            if (var84 == 4) {
                int var87 = var79;
                var79 = var80;
                var80 = var87;
                var81 = var2.method8606() + var82;
                var82 = var81;
                this.field2753[var83] = var79;
                this.field2723[var83] = var87;
                this.field2724[var83] = var81;
            }
        }
        var2.field5200 = var53;
        var3.field5200 = var55;
        var4.field5200 = var57;
        var5.field5200 = var59;
        var6.field5200 = var61;
        var7.field5200 = var63;
        for (int var88 = 0; var88 < var11; var88++) {
            int var89 = this.field2733[var88] & 0xFF;
            if (var89 == 0) {
                this.field2731[var88] = (short) var2.method8593();
                this.field2735[var88] = (short) var2.method8593();
                this.field2719[var88] = (short) var2.method8593();
            }
        }
        var2.field5200 = var65;
        int var90 = var2.method8591();
        if (var90 == 0) {
            return;
        }
        new class292();
        var2.method8593();
        var2.method8593();
        var2.method8593();
        var2.method8597();
    }

    @ObfuscatedName("kf.ai([B)V")
    public void method4702(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class534 var4 = new class534(arg0);
        class534 var5 = new class534(arg0);
        class534 var6 = new class534(arg0);
        class534 var7 = new class534(arg0);
        class534 var8 = new class534(arg0);
        var4.field5200 = arg0.length - 23;
        int var9 = var4.method8593();
        int var10 = var4.method8593();
        int var11 = var4.method8591();
        int var12 = var4.method8591();
        int var13 = var4.method8591();
        int var14 = var4.method8591();
        int var15 = var4.method8591();
        int var16 = var4.method8591();
        int var17 = var4.method8591();
        int var18 = var4.method8593();
        int var19 = var4.method8593();
        int var20 = var4.method8593();
        int var21 = var4.method8593();
        int var22 = var4.method8593();
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
        this.field2714 = var9;
        this.field2741 = var10;
        this.field2718 = var11;
        this.field2747 = new int[var9];
        this.field2751 = new int[var9];
        this.field2720 = new int[var9];
        this.field2753 = new int[var10];
        this.field2723 = new int[var10];
        this.field2724 = new int[var10];
        if (var11 > 0) {
            this.field2733 = new byte[var11];
            this.field2731 = new short[var11];
            this.field2735 = new short[var11];
            this.field2719 = new short[var11];
        }
        if (var16 == 1) {
            this.field2737 = new int[var9];
        }
        if (var12 == 1) {
            this.field2725 = new byte[var10];
            this.field2728 = new byte[var10];
            this.field2730 = new short[var10];
        }
        if (var13 == 255) {
            this.field2726 = new byte[var10];
        } else {
            this.field2742 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2727 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2738 = new int[var10];
        }
        if (var17 == 1) {
            this.field2722 = new int[var9][];
            this.field2736 = new int[var9][];
        }
        this.field2716 = new short[var10];
        var4.field5200 = var23;
        var5.field5200 = var39;
        var6.field5200 = var41;
        var7.field5200 = var43;
        var8.field5200 = var27;
        int var46 = 0;
        int var47 = 0;
        int var48 = 0;
        for (int var49 = 0; var49 < var9; var49++) {
            int var50 = var4.method8591();
            int var51 = 0;
            if ((var50 & 0x1) != 0) {
                var51 = var5.method8606();
            }
            int var52 = 0;
            if ((var50 & 0x2) != 0) {
                var52 = var6.method8606();
            }
            int var53 = 0;
            if ((var50 & 0x4) != 0) {
                var53 = var7.method8606();
            }
            this.field2747[var49] = var46 + var51;
            this.field2751[var49] = var47 + var52;
            this.field2720[var49] = var48 + var53;
            var46 = this.field2747[var49];
            var47 = this.field2751[var49];
            var48 = this.field2720[var49];
            if (var16 == 1) {
                this.field2737[var49] = var8.method8591();
            }
        }
        if (var17 == 1) {
            for (int var54 = 0; var54 < var9; var54++) {
                int var55 = var8.method8591();
                this.field2722[var54] = new int[var55];
                this.field2736[var54] = new int[var55];
                for (int var56 = 0; var56 < var55; var56++) {
                    this.field2722[var54][var56] = var8.method8591();
                    this.field2736[var54][var56] = var8.method8591();
                }
            }
        }
        var4.field5200 = var35;
        var5.field5200 = var30;
        var6.field5200 = var28;
        var7.field5200 = var33;
        var8.field5200 = var29;
        for (int var57 = 0; var57 < var10; var57++) {
            this.field2716[var57] = (short) var4.method8593();
            if (var12 == 1) {
                int var58 = var5.method8591();
                if ((var58 & 0x1) == 1) {
                    this.field2725[var57] = 1;
                    var2 = true;
                } else {
                    this.field2725[var57] = 0;
                }
                if ((var58 & 0x2) == 2) {
                    this.field2728[var57] = (byte) (var58 >> 2);
                    this.field2730[var57] = this.field2716[var57];
                    this.field2716[var57] = 127;
                    if (this.field2730[var57] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field2728[var57] = -1;
                    this.field2730[var57] = -1;
                }
            }
            if (var13 == 255) {
                this.field2726[var57] = var6.method8592();
            }
            if (var14 == 1) {
                this.field2727[var57] = var7.method8592();
            }
            if (var15 == 1) {
                this.field2738[var57] = var8.method8591();
            }
        }
        var4.field5200 = var32;
        var5.field5200 = var25;
        int var59 = 0;
        int var60 = 0;
        int var61 = 0;
        int var62 = 0;
        for (int var63 = 0; var63 < var10; var63++) {
            int var64 = var5.method8591();
            if (var64 == 1) {
                var59 = var4.method8606() + var62;
                var60 = var4.method8606() + var59;
                var61 = var4.method8606() + var60;
                var62 = var61;
                this.field2753[var63] = var59;
                this.field2723[var63] = var60;
                this.field2724[var63] = var61;
            }
            if (var64 == 2) {
                var60 = var61;
                var61 = var4.method8606() + var62;
                var62 = var61;
                this.field2753[var63] = var59;
                this.field2723[var63] = var60;
                this.field2724[var63] = var61;
            }
            if (var64 == 3) {
                var59 = var61;
                var61 = var4.method8606() + var62;
                var62 = var61;
                this.field2753[var63] = var59;
                this.field2723[var63] = var60;
                this.field2724[var63] = var61;
            }
            if (var64 == 4) {
                int var67 = var59;
                var59 = var60;
                var60 = var67;
                var61 = var4.method8606() + var62;
                var62 = var61;
                this.field2753[var63] = var59;
                this.field2723[var63] = var67;
                this.field2724[var63] = var61;
            }
        }
        var4.field5200 = var37;
        for (int var68 = 0; var68 < var11; var68++) {
            this.field2733[var68] = 0;
            this.field2731[var68] = (short) var4.method8593();
            this.field2735[var68] = (short) var4.method8593();
            this.field2719[var68] = (short) var4.method8593();
        }
        if (this.field2728 != null) {
            boolean var69 = false;
            for (int var70 = 0; var70 < var10; var70++) {
                int var71 = this.field2728[var70] & 0xFF;
                if (var71 != 255) {
                    if ((this.field2731[var71] & 0xFFFF) == this.field2753[var70] && (this.field2735[var71] & 0xFFFF) == this.field2723[var70] && (this.field2719[var71] & 0xFFFF) == this.field2724[var70]) {
                        this.field2728[var70] = -1;
                    } else {
                        var69 = true;
                    }
                }
            }
            if (!var69) {
                this.field2728 = null;
            }
        }
        if (!var3) {
            this.field2730 = null;
        }
        if (!var2) {
            this.field2725 = null;
        }
    }

    @ObfuscatedName("kf.az([B)V")
    public void method4647(byte[] arg0) {
        class534 var2 = new class534(arg0);
        class534 var3 = new class534(arg0);
        class534 var4 = new class534(arg0);
        class534 var5 = new class534(arg0);
        class534 var6 = new class534(arg0);
        class534 var7 = new class534(arg0);
        class534 var8 = new class534(arg0);
        var2.field5200 = arg0.length - 23;
        int var9 = var2.method8593();
        int var10 = var2.method8593();
        int var11 = var2.method8591();
        int var12 = var2.method8591();
        int var13 = var2.method8591();
        int var14 = var2.method8591();
        int var15 = var2.method8591();
        int var16 = var2.method8591();
        int var17 = var2.method8591();
        int var18 = var2.method8593();
        int var19 = var2.method8593();
        int var20 = var2.method8593();
        int var21 = var2.method8593();
        int var22 = var2.method8593();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field2733 = new byte[var11];
            var2.field5200 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field2733[var26] = var2.method8592();
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
        this.field2714 = var9;
        this.field2741 = var10;
        this.field2718 = var11;
        this.field2747 = new int[var9];
        this.field2751 = new int[var9];
        this.field2720 = new int[var9];
        this.field2753 = new int[var10];
        this.field2723 = new int[var10];
        this.field2724 = new int[var10];
        if (var17 == 1) {
            this.field2737 = new int[var9];
        }
        if (var12 == 1) {
            this.field2725 = new byte[var10];
        }
        if (var13 == 255) {
            this.field2726 = new byte[var10];
        } else {
            this.field2742 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2727 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2738 = new int[var10];
        }
        if (var16 == 1) {
            this.field2730 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field2728 = new byte[var10];
        }
        this.field2716 = new short[var10];
        if (var11 > 0) {
            this.field2731 = new short[var11];
            this.field2735 = new short[var11];
            this.field2719 = new short[var11];
        }
        var2.field5200 = var11;
        var3.field5200 = var44;
        var4.field5200 = var46;
        var5.field5200 = var48;
        var6.field5200 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method8591();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method8606();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method8606();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method8606();
            }
            this.field2747[var67] = var64 + var69;
            this.field2751[var67] = var65 + var70;
            this.field2720[var67] = var66 + var71;
            var64 = this.field2747[var67];
            var65 = this.field2751[var67];
            var66 = this.field2720[var67];
            if (var17 == 1) {
                this.field2737[var67] = var6.method8591();
            }
        }
        var2.field5200 = var42;
        var3.field5200 = var31;
        var4.field5200 = var34;
        var5.field5200 = var37;
        var6.field5200 = var35;
        var7.field5200 = var40;
        var8.field5200 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field2716[var72] = (short) var2.method8593();
            if (var12 == 1) {
                this.field2725[var72] = var3.method8592();
            }
            if (var13 == 255) {
                this.field2726[var72] = var4.method8592();
            }
            if (var14 == 1) {
                this.field2727[var72] = var5.method8592();
            }
            if (var15 == 1) {
                this.field2738[var72] = var6.method8591();
            }
            if (var16 == 1) {
                this.field2730[var72] = (short) (var7.method8593() - 1);
            }
            if (this.field2728 != null && this.field2730[var72] != -1) {
                this.field2728[var72] = (byte) (var8.method8591() - 1);
            }
        }
        var2.field5200 = var33;
        var3.field5200 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method8591();
            if (var78 == 1) {
                var73 = var2.method8606() + var76;
                var74 = var2.method8606() + var73;
                var75 = var2.method8606() + var74;
                var76 = var75;
                this.field2753[var77] = var73;
                this.field2723[var77] = var74;
                this.field2724[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method8606() + var76;
                var76 = var75;
                this.field2753[var77] = var73;
                this.field2723[var77] = var74;
                this.field2724[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method8606() + var76;
                var76 = var75;
                this.field2753[var77] = var73;
                this.field2723[var77] = var74;
                this.field2724[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method8606() + var76;
                var76 = var75;
                this.field2753[var77] = var73;
                this.field2723[var77] = var81;
                this.field2724[var77] = var75;
            }
        }
        var2.field5200 = var50;
        var3.field5200 = var52;
        var4.field5200 = var54;
        var5.field5200 = var56;
        var6.field5200 = var58;
        var7.field5200 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field2733[var82] & 0xFF;
            if (var83 == 0) {
                this.field2731[var82] = (short) var2.method8593();
                this.field2735[var82] = (short) var2.method8593();
                this.field2719[var82] = (short) var2.method8593();
            }
        }
        var2.field5200 = var62;
        int var84 = var2.method8591();
        if (var84 == 0) {
            return;
        }
        new class292();
        var2.method8593();
        var2.method8593();
        var2.method8593();
        var2.method8597();
    }

    @ObfuscatedName("kf.ao([B)V")
    public void method4648(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class534 var4 = new class534(arg0);
        class534 var5 = new class534(arg0);
        class534 var6 = new class534(arg0);
        class534 var7 = new class534(arg0);
        class534 var8 = new class534(arg0);
        var4.field5200 = arg0.length - 18;
        int var9 = var4.method8593();
        int var10 = var4.method8593();
        int var11 = var4.method8591();
        int var12 = var4.method8591();
        int var13 = var4.method8591();
        int var14 = var4.method8591();
        int var15 = var4.method8591();
        int var16 = var4.method8591();
        int var17 = var4.method8593();
        int var18 = var4.method8593();
        int var19 = var4.method8593();
        int var20 = var4.method8593();
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
        this.field2714 = var9;
        this.field2741 = var10;
        this.field2718 = var11;
        this.field2747 = new int[var9];
        this.field2751 = new int[var9];
        this.field2720 = new int[var9];
        this.field2753 = new int[var10];
        this.field2723 = new int[var10];
        this.field2724 = new int[var10];
        if (var11 > 0) {
            this.field2733 = new byte[var11];
            this.field2731 = new short[var11];
            this.field2735 = new short[var11];
            this.field2719 = new short[var11];
        }
        if (var16 == 1) {
            this.field2737 = new int[var9];
        }
        if (var12 == 1) {
            this.field2725 = new byte[var10];
            this.field2728 = new byte[var10];
            this.field2730 = new short[var10];
        }
        if (var13 == 255) {
            this.field2726 = new byte[var10];
        } else {
            this.field2742 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2727 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2738 = new int[var10];
        }
        this.field2716 = new short[var10];
        var4.field5200 = var21;
        var5.field5200 = var36;
        var6.field5200 = var38;
        var7.field5200 = var40;
        var8.field5200 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method8591();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method8606();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method8606();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method8606();
            }
            this.field2747[var46] = var43 + var48;
            this.field2751[var46] = var44 + var49;
            this.field2720[var46] = var45 + var50;
            var43 = this.field2747[var46];
            var44 = this.field2751[var46];
            var45 = this.field2720[var46];
            if (var16 == 1) {
                this.field2737[var46] = var8.method8591();
            }
        }
        var4.field5200 = var32;
        var5.field5200 = var28;
        var6.field5200 = var26;
        var7.field5200 = var30;
        var8.field5200 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field2716[var51] = (short) var4.method8593();
            if (var12 == 1) {
                int var52 = var5.method8591();
                if ((var52 & 0x1) == 1) {
                    this.field2725[var51] = 1;
                    var2 = true;
                } else {
                    this.field2725[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field2728[var51] = (byte) (var52 >> 2);
                    this.field2730[var51] = this.field2716[var51];
                    this.field2716[var51] = 127;
                    if (this.field2730[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field2728[var51] = -1;
                    this.field2730[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field2726[var51] = var6.method8592();
            }
            if (var14 == 1) {
                this.field2727[var51] = var7.method8592();
            }
            if (var15 == 1) {
                this.field2738[var51] = var8.method8591();
            }
        }
        var4.field5200 = var25;
        var5.field5200 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method8591();
            if (var58 == 1) {
                var53 = var4.method8606() + var56;
                var54 = var4.method8606() + var53;
                var55 = var4.method8606() + var54;
                var56 = var55;
                this.field2753[var57] = var53;
                this.field2723[var57] = var54;
                this.field2724[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method8606() + var56;
                var56 = var55;
                this.field2753[var57] = var53;
                this.field2723[var57] = var54;
                this.field2724[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method8606() + var56;
                var56 = var55;
                this.field2753[var57] = var53;
                this.field2723[var57] = var54;
                this.field2724[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method8606() + var56;
                var56 = var55;
                this.field2753[var57] = var53;
                this.field2723[var57] = var61;
                this.field2724[var57] = var55;
            }
        }
        var4.field5200 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field2733[var62] = 0;
            this.field2731[var62] = (short) var4.method8593();
            this.field2735[var62] = (short) var4.method8593();
            this.field2719[var62] = (short) var4.method8593();
        }
        if (this.field2728 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field2728[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field2731[var65] & 0xFFFF) == this.field2753[var64] && (this.field2735[var65] & 0xFFFF) == this.field2723[var64] && (this.field2719[var65] & 0xFFFF) == this.field2724[var64]) {
                        this.field2728[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field2728 = null;
            }
        }
        if (!var3) {
            this.field2730 = null;
        }
        if (!var2) {
            this.field2725 = null;
        }
    }

    public class267(class267[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        this.field2714 = 0;
        this.field2741 = 0;
        this.field2718 = 0;
        this.field2742 = -1;
        for (int var10 = 0; var10 < arg1; var10++) {
            class267 var11 = arg0[var10];
            if (var11 != null) {
                this.field2714 += var11.field2714;
                this.field2741 += var11.field2741;
                this.field2718 += var11.field2718;
                if (var11.field2726 == null) {
                    if (this.field2742 == -1) {
                        this.field2742 = var11.field2742;
                    }
                    if (this.field2742 != var11.field2742) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var11.field2725 != null;
                var5 |= var11.field2727 != null;
                var6 |= var11.field2738 != null;
                var7 |= var11.field2730 != null;
                var8 |= var11.field2728 != null;
                var9 |= var11.field2722 != null;
            }
        }
        this.field2747 = new int[this.field2714];
        this.field2751 = new int[this.field2714];
        this.field2720 = new int[this.field2714];
        this.field2737 = new int[this.field2714];
        this.field2753 = new int[this.field2741];
        this.field2723 = new int[this.field2741];
        this.field2724 = new int[this.field2741];
        if (var3) {
            this.field2725 = new byte[this.field2741];
        }
        if (var4) {
            this.field2726 = new byte[this.field2741];
        }
        if (var5) {
            this.field2727 = new byte[this.field2741];
        }
        if (var6) {
            this.field2738 = new int[this.field2741];
        }
        if (var7) {
            this.field2730 = new short[this.field2741];
        }
        if (var8) {
            this.field2728 = new byte[this.field2741];
        }
        if (var9) {
            this.field2722 = new int[this.field2714][];
            this.field2736 = new int[this.field2714][];
        }
        this.field2716 = new short[this.field2741];
        if (this.field2718 > 0) {
            this.field2733 = new byte[this.field2718];
            this.field2731 = new short[this.field2718];
            this.field2735 = new short[this.field2718];
            this.field2719 = new short[this.field2718];
        }
        this.field2714 = 0;
        this.field2741 = 0;
        this.field2718 = 0;
        for (int var12 = 0; var12 < arg1; var12++) {
            class267 var13 = arg0[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < var13.field2741; var14++) {
                    if (var3 && var13.field2725 != null) {
                        this.field2725[this.field2741] = var13.field2725[var14];
                    }
                    if (var4) {
                        if (var13.field2726 == null) {
                            this.field2726[this.field2741] = var13.field2742;
                        } else {
                            this.field2726[this.field2741] = var13.field2726[var14];
                        }
                    }
                    if (var5 && var13.field2727 != null) {
                        this.field2727[this.field2741] = var13.field2727[var14];
                    }
                    if (var6 && var13.field2738 != null) {
                        this.field2738[this.field2741] = var13.field2738[var14];
                    }
                    if (var7) {
                        if (var13.field2730 == null) {
                            this.field2730[this.field2741] = -1;
                        } else {
                            this.field2730[this.field2741] = var13.field2730[var14];
                        }
                    }
                    if (var8) {
                        if (var13.field2728 == null || var13.field2728[var14] == -1) {
                            this.field2728[this.field2741] = -1;
                        } else {
                            this.field2728[this.field2741] = (byte) (var13.field2728[var14] + this.field2718);
                        }
                    }
                    this.field2716[this.field2741] = var13.field2716[var14];
                    this.field2753[this.field2741] = this.method4649(var13, var13.field2753[var14]);
                    this.field2723[this.field2741] = this.method4649(var13, var13.field2723[var14]);
                    this.field2724[this.field2741] = this.method4649(var13, var13.field2724[var14]);
                    this.field2741++;
                }
                for (int var15 = 0; var15 < var13.field2718; var15++) {
                    byte var16 = this.field2733[this.field2718] = var13.field2733[var15];
                    if (var16 == 0) {
                        this.field2731[this.field2718] = (short) this.method4649(var13, var13.field2731[var15]);
                        this.field2735[this.field2718] = (short) this.method4649(var13, var13.field2735[var15]);
                        this.field2719[this.field2718] = (short) this.method4649(var13, var13.field2719[var15]);
                    }
                    this.field2718++;
                }
            }
        }
    }

    @ObfuscatedName("kf.au(Lkf;I)I")
    public final int method4649(class267 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field2747[arg1];
        int var5 = arg0.field2751[arg1];
        int var6 = arg0.field2720[arg1];
        for (int var7 = 0; var7 < this.field2714; var7++) {
            if (this.field2747[var7] == var4 && this.field2751[var7] == var5 && this.field2720[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field2747[this.field2714] = var4;
            this.field2751[this.field2714] = var5;
            this.field2720[this.field2714] = var6;
            if (arg0.field2737 != null) {
                this.field2737[this.field2714] = arg0.field2737[arg1];
            }
            if (arg0.field2722 != null) {
                this.field2722[this.field2714] = arg0.field2722[arg1];
                this.field2736[this.field2714] = arg0.field2736[arg1];
            }
            var3 = this.field2714++;
        }
        return var3;
    }

    public class267(class267 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field2714 = arg0.field2714;
        this.field2741 = arg0.field2741;
        this.field2718 = arg0.field2718;
        if (arg1) {
            this.field2747 = arg0.field2747;
            this.field2751 = arg0.field2751;
            this.field2720 = arg0.field2720;
        } else {
            this.field2747 = new int[this.field2714];
            this.field2751 = new int[this.field2714];
            this.field2720 = new int[this.field2714];
            for (int var6 = 0; var6 < this.field2714; var6++) {
                this.field2747[var6] = arg0.field2747[var6];
                this.field2751[var6] = arg0.field2751[var6];
                this.field2720[var6] = arg0.field2720[var6];
            }
        }
        if (arg2) {
            this.field2716 = arg0.field2716;
        } else {
            this.field2716 = new short[this.field2741];
            for (int var7 = 0; var7 < this.field2741; var7++) {
                this.field2716[var7] = arg0.field2716[var7];
            }
        }
        if (arg3 || arg0.field2730 == null) {
            this.field2730 = arg0.field2730;
        } else {
            this.field2730 = new short[this.field2741];
            for (int var8 = 0; var8 < this.field2741; var8++) {
                this.field2730[var8] = arg0.field2730[var8];
            }
        }
        if (arg4) {
            this.field2727 = arg0.field2727;
        } else {
            this.field2727 = new byte[this.field2741];
            if (arg0.field2727 == null) {
                for (int var9 = 0; var9 < this.field2741; var9++) {
                    this.field2727[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field2741; var10++) {
                    this.field2727[var10] = arg0.field2727[var10];
                }
            }
        }
        this.field2753 = arg0.field2753;
        this.field2723 = arg0.field2723;
        this.field2724 = arg0.field2724;
        this.field2725 = arg0.field2725;
        this.field2726 = arg0.field2726;
        this.field2728 = arg0.field2728;
        this.field2742 = arg0.field2742;
        this.field2733 = arg0.field2733;
        this.field2731 = arg0.field2731;
        this.field2735 = arg0.field2735;
        this.field2719 = arg0.field2719;
        this.field2737 = arg0.field2737;
        this.field2738 = arg0.field2738;
        this.field2739 = arg0.field2739;
        this.field2740 = arg0.field2740;
        this.field2744 = arg0.field2744;
        this.field2743 = arg0.field2743;
        this.field2745 = arg0.field2745;
        this.field2722 = arg0.field2722;
        this.field2736 = arg0.field2736;
        this.field2746 = arg0.field2746;
        this.field2721 = arg0.field2721;
    }

    @ObfuscatedName("kf.ak()Lkf;")
    public class267 method4650() {
        class267 var1 = new class267();
        if (this.field2725 != null) {
            var1.field2725 = new byte[this.field2741];
            for (int var2 = 0; var2 < this.field2741; var2++) {
                var1.field2725[var2] = this.field2725[var2];
            }
        }
        var1.field2714 = this.field2714;
        var1.field2741 = this.field2741;
        var1.field2718 = this.field2718;
        var1.field2747 = this.field2747;
        var1.field2751 = this.field2751;
        var1.field2720 = this.field2720;
        var1.field2753 = this.field2753;
        var1.field2723 = this.field2723;
        var1.field2724 = this.field2724;
        var1.field2726 = this.field2726;
        var1.field2727 = this.field2727;
        var1.field2728 = this.field2728;
        var1.field2716 = this.field2716;
        var1.field2730 = this.field2730;
        var1.field2742 = this.field2742;
        var1.field2733 = this.field2733;
        var1.field2731 = this.field2731;
        var1.field2735 = this.field2735;
        var1.field2719 = this.field2719;
        var1.field2737 = this.field2737;
        var1.field2738 = this.field2738;
        var1.field2739 = this.field2739;
        var1.field2740 = this.field2740;
        var1.field2744 = this.field2744;
        var1.field2743 = this.field2743;
        var1.field2746 = this.field2746;
        var1.field2721 = this.field2721;
        return var1;
    }

    @ObfuscatedName("kf.ah([[IIIIZI)Lkf;")
    public class267 method4651(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method4712();
        int var7 = this.field2748 + arg1;
        int var8 = this.field2717 + arg1;
        int var9 = this.field2732 + arg3;
        int var10 = this.field2752 + arg3;
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
        class267 var15;
        if (arg4) {
            var15 = new class267();
            var15.field2714 = this.field2714;
            var15.field2741 = this.field2741;
            var15.field2718 = this.field2718;
            var15.field2747 = this.field2747;
            var15.field2720 = this.field2720;
            var15.field2753 = this.field2753;
            var15.field2723 = this.field2723;
            var15.field2724 = this.field2724;
            var15.field2725 = this.field2725;
            var15.field2726 = this.field2726;
            var15.field2727 = this.field2727;
            var15.field2728 = this.field2728;
            var15.field2716 = this.field2716;
            var15.field2730 = this.field2730;
            var15.field2742 = this.field2742;
            var15.field2733 = this.field2733;
            var15.field2731 = this.field2731;
            var15.field2735 = this.field2735;
            var15.field2719 = this.field2719;
            var15.field2737 = this.field2737;
            var15.field2738 = this.field2738;
            var15.field2739 = this.field2739;
            var15.field2740 = this.field2740;
            var15.field2746 = this.field2746;
            var15.field2721 = this.field2721;
            var15.field2751 = new int[var15.field2714];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field2714; var16++) {
                int var17 = this.field2747[var16] + arg1;
                int var18 = this.field2720[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field2751[var16] = this.field2751[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field2714; var26++) {
                int var27 = (-this.field2751[var26] << 16) / this.field2924;
                if (var27 < arg5) {
                    int var28 = this.field2747[var26] + arg1;
                    int var29 = this.field2720[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field2751[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field2751[var26];
                }
            }
        }
        var15.method4663();
        return var15;
    }

    @ObfuscatedName("kf.aj()V")
    public void method4719() {
        int var10002;
        if (this.field2737 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field2714; var3++) {
                int var4 = this.field2737[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field2739 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field2739[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field2714) {
                int var7 = this.field2737[var6];
                this.field2739[var7][var1[var7]++] = var6++;
            }
            this.field2737 = null;
        }
        if (this.field2738 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field2741; var10++) {
            int var11 = this.field2738[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field2740 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field2740[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field2741) {
            int var14 = this.field2738[var13];
            this.field2740[var14][var8[var14]++] = var13++;
        }
        this.field2738 = null;
    }

    @ObfuscatedName("kf.af()V")
    public void method4653() {
        for (int var1 = 0; var1 < this.field2714; var1++) {
            int var2 = this.field2747[var1];
            this.field2747[var1] = this.field2720[var1];
            this.field2720[var1] = -var2;
        }
        this.method4663();
    }

    @ObfuscatedName("kf.ax()V")
    public void method4646() {
        for (int var1 = 0; var1 < this.field2714; var1++) {
            this.field2747[var1] = -this.field2747[var1];
            this.field2720[var1] = -this.field2720[var1];
        }
        this.method4663();
    }

    @ObfuscatedName("kf.an()V")
    public void method4655() {
        for (int var1 = 0; var1 < this.field2714; var1++) {
            int var2 = this.field2720[var1];
            this.field2720[var1] = this.field2747[var1];
            this.field2747[var1] = -var2;
        }
        this.method4663();
    }

    @ObfuscatedName("kf.ag(I)V")
    public void method4656(int arg0) {
        int var2 = field2757[arg0];
        int var3 = field2758[arg0];
        for (int var4 = 0; var4 < this.field2714; var4++) {
            int var5 = this.field2747[var4] * var3 + this.field2720[var4] * var2 >> 16;
            this.field2720[var4] = this.field2720[var4] * var3 - this.field2747[var4] * var2 >> 16;
            this.field2747[var4] = var5;
        }
        this.method4663();
    }

    @ObfuscatedName("kf.am(III)V")
    public void method4667(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2714; var4++) {
            this.field2747[var4] += arg0;
            this.field2751[var4] += arg1;
            this.field2720[var4] += arg2;
        }
        this.method4663();
    }

    @ObfuscatedName("kf.ad(SS)V")
    public void method4664(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2741; var3++) {
            if (this.field2716[var3] == arg0) {
                this.field2716[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("kf.at(SS)V")
    public void method4666(short arg0, short arg1) {
        if (this.field2730 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field2741; var3++) {
            if (this.field2730[var3] == arg0) {
                this.field2730[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("kf.ay()V")
    public void method4725() {
        for (int var1 = 0; var1 < this.field2714; var1++) {
            this.field2720[var1] = -this.field2720[var1];
        }
        for (int var2 = 0; var2 < this.field2741; var2++) {
            int var3 = this.field2753[var2];
            this.field2753[var2] = this.field2724[var2];
            this.field2724[var2] = var3;
        }
        this.method4663();
    }

    @ObfuscatedName("kf.ae(III)V")
    public void method4661(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2714; var4++) {
            this.field2747[var4] = this.field2747[var4] * arg0 / 128;
            this.field2751[var4] = this.field2751[var4] * arg1 / 128;
            this.field2720[var4] = this.field2720[var4] * arg2 / 128;
        }
        this.method4663();
    }

    @ObfuscatedName("kf.ac()V")
    public void method4662() {
        if (this.field2744 != null) {
            return;
        }
        this.field2744 = new class287[this.field2714];
        for (int var1 = 0; var1 < this.field2714; var1++) {
            this.field2744[var1] = new class287();
        }
        for (int var2 = 0; var2 < this.field2741; var2++) {
            int var3 = this.field2753[var2];
            int var4 = this.field2723[var2];
            int var5 = this.field2724[var2];
            int var6 = this.field2747[var4] - this.field2747[var3];
            int var7 = this.field2751[var4] - this.field2751[var3];
            int var8 = this.field2720[var4] - this.field2720[var3];
            int var9 = this.field2747[var5] - this.field2747[var3];
            int var10 = this.field2751[var5] - this.field2751[var3];
            int var11 = this.field2720[var5] - this.field2720[var3];
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
            if (this.field2725 == null) {
                var19 = 0;
            } else {
                var19 = this.field2725[var2];
            }
            if (var19 == 0) {
                class287 var20 = this.field2744[var3];
                var20.field3071 += var16;
                var20.field3072 += var17;
                var20.field3073 += var18;
                var20.field3074++;
                class287 var21 = this.field2744[var4];
                var21.field3071 += var16;
                var21.field3072 += var17;
                var21.field3073 += var18;
                var21.field3074++;
                class287 var22 = this.field2744[var5];
                var22.field3071 += var16;
                var22.field3072 += var17;
                var22.field3073 += var18;
                var22.field3074++;
            } else if (var19 == 1) {
                if (this.field2743 == null) {
                    this.field2743 = new class279[this.field2741];
                }
                class279 var23 = this.field2743[var2] = new class279();
                var23.field2927 = var16;
                var23.field2926 = var17;
                var23.field2928 = var18;
            }
        }
    }

    @ObfuscatedName("kf.ab()V")
    public void method4663() {
        this.field2744 = null;
        this.field2745 = null;
        this.field2743 = null;
        this.field2729 = false;
    }

    @ObfuscatedName("kf.av()V")
    public void method4712() {
        if (this.field2729) {
            return;
        }
        this.field2924 = 0;
        this.field2749 = 0;
        this.field2748 = 999999;
        this.field2717 = -999999;
        this.field2752 = -99999;
        this.field2732 = 99999;
        for (int var1 = 0; var1 < this.field2714; var1++) {
            int var2 = this.field2747[var1];
            int var3 = this.field2751[var1];
            int var4 = this.field2720[var1];
            if (var2 < this.field2748) {
                this.field2748 = var2;
            }
            if (var2 > this.field2717) {
                this.field2717 = var2;
            }
            if (var4 < this.field2732) {
                this.field2732 = var4;
            }
            if (var4 > this.field2752) {
                this.field2752 = var4;
            }
            if (-var3 > this.field2924) {
                this.field2924 = -var3;
            }
            if (var3 > this.field2749) {
                this.field2749 = var3;
            }
        }
        this.field2729 = true;
    }

    @ObfuscatedName("kf.ap(Lkf;Lkf;IIIZ)V")
    public static void method4665(class267 arg0, class267 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method4712();
        arg0.method4662();
        arg1.method4712();
        arg1.method4662();
        field2756++;
        int var6 = 0;
        int[] var7 = arg1.field2747;
        int var8 = arg1.field2714;
        for (int var9 = 0; var9 < arg0.field2714; var9++) {
            class287 var10 = arg0.field2744[var9];
            if (var10.field3074 != 0) {
                int var11 = arg0.field2751[var9] - arg3;
                if (var11 <= arg1.field2749) {
                    int var12 = arg0.field2747[var9] - arg2;
                    if (var12 >= arg1.field2748 && var12 <= arg1.field2717) {
                        int var13 = arg0.field2720[var9] - arg4;
                        if (var13 >= arg1.field2732 && var13 <= arg1.field2752) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class287 var15 = arg1.field2744[var14];
                                if (var7[var14] == var12 && arg1.field2720[var14] == var13 && arg1.field2751[var14] == var11 && var15.field3074 != 0) {
                                    if (arg0.field2745 == null) {
                                        arg0.field2745 = new class287[arg0.field2714];
                                    }
                                    if (arg1.field2745 == null) {
                                        arg1.field2745 = new class287[var8];
                                    }
                                    class287 var16 = arg0.field2745[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field2745[var9] = new class287(var10);
                                    }
                                    class287 var17 = arg1.field2745[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field2745[var14] = new class287(var15);
                                    }
                                    var16.field3071 += var15.field3071;
                                    var16.field3072 += var15.field3072;
                                    var16.field3073 += var15.field3073;
                                    var16.field3074 += var15.field3074;
                                    var17.field3071 += var10.field3071;
                                    var17.field3072 += var10.field3072;
                                    var17.field3073 += var10.field3073;
                                    var17.field3074 += var10.field3074;
                                    var6++;
                                    field2754[var9] = field2756;
                                    field2755[var14] = field2756;
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
        for (int var18 = 0; var18 < arg0.field2741; var18++) {
            if (field2754[arg0.field2753[var18]] == field2756 && field2754[arg0.field2723[var18]] == field2756 && field2754[arg0.field2724[var18]] == field2756) {
                if (arg0.field2725 == null) {
                    arg0.field2725 = new byte[arg0.field2741];
                }
                arg0.field2725[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field2741; var19++) {
            if (field2755[arg1.field2753[var19]] == field2756 && field2755[arg1.field2723[var19]] == field2756 && field2755[arg1.field2724[var19]] == field2756) {
                if (arg1.field2725 == null) {
                    arg1.field2725 = new byte[arg1.field2741];
                }
                arg1.field2725[var19] = 2;
            }
        }
    }

    @ObfuscatedName("kf.bu(IIIII)Lkz;")
    public final class285 method4723(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method4662();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class285 var8 = new class285();
        var8.field2998 = new int[this.field2741];
        var8.field2999 = new int[this.field2741];
        var8.field3003 = new int[this.field2741];
        if (this.field2718 > 0 && this.field2728 != null) {
            int[] var9 = new int[this.field2718];
            for (int var10 = 0; var10 < this.field2741; var10++) {
                if (this.field2728[var10] != -1) {
                    var9[this.field2728[var10] & 0xFF]++;
                }
            }
            var8.field3029 = 0;
            for (int var11 = 0; var11 < this.field2718; var11++) {
                if (var9[var11] > 0 && this.field2733[var11] == 0) {
                    var8.field3029++;
                }
            }
            var8.field3007 = new int[var8.field3029];
            var8.field3008 = new int[var8.field3029];
            var8.field3000 = new int[var8.field3029];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field2718; var13++) {
                if (var9[var13] > 0 && this.field2733[var13] == 0) {
                    var8.field3007[var12] = this.field2731[var13] & 0xFFFF;
                    var8.field3008[var12] = this.field2735[var13] & 0xFFFF;
                    var8.field3000[var12] = this.field2719[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field2991 = new byte[this.field2741];
            for (int var14 = 0; var14 < this.field2741; var14++) {
                if (this.field2728[var14] == -1) {
                    var8.field2991[var14] = -1;
                } else {
                    var8.field2991[var14] = (byte) var9[this.field2728[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field2741; var15++) {
            byte var16;
            if (this.field2725 == null) {
                var16 = 0;
            } else {
                var16 = this.field2725[var15];
            }
            byte var17;
            if (this.field2727 == null) {
                var17 = 0;
            } else {
                var17 = this.field2727[var15];
            }
            short var18;
            if (this.field2730 == null) {
                var18 = -1;
            } else {
                var18 = this.field2730[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field2716[var15] & 0xFFFF;
                    class287 var20;
                    if (this.field2745 == null || this.field2745[this.field2753[var15]] == null) {
                        var20 = this.field2744[this.field2753[var15]];
                    } else {
                        var20 = this.field2745[this.field2753[var15]];
                    }
                    int var21 = (var20.field3073 * arg4 + var20.field3072 * arg3 + var20.field3071 * arg2) / (var20.field3074 * var7) + arg0;
                    var8.field2998[var15] = method4643(var19, var21);
                    class287 var22;
                    if (this.field2745 == null || this.field2745[this.field2723[var15]] == null) {
                        var22 = this.field2744[this.field2723[var15]];
                    } else {
                        var22 = this.field2745[this.field2723[var15]];
                    }
                    int var23 = (var22.field3073 * arg4 + var22.field3072 * arg3 + var22.field3071 * arg2) / (var22.field3074 * var7) + arg0;
                    var8.field2999[var15] = method4643(var19, var23);
                    class287 var24;
                    if (this.field2745 == null || this.field2745[this.field2724[var15]] == null) {
                        var24 = this.field2744[this.field2724[var15]];
                    } else {
                        var24 = this.field2745[this.field2724[var15]];
                    }
                    int var25 = (var24.field3073 * arg4 + var24.field3072 * arg3 + var24.field3071 * arg2) / (var24.field3074 * var7) + arg0;
                    var8.field3003[var15] = method4643(var19, var25);
                } else if (var16 == 1) {
                    class279 var26 = this.field2743[var15];
                    int var27 = (var26.field2928 * arg4 + var26.field2927 * arg2 + var26.field2926 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field2998[var15] = method4643(this.field2716[var15] & 0xFFFF, var27);
                    var8.field3003[var15] = -1;
                } else if (var16 == 3) {
                    var8.field2998[var15] = 128;
                    var8.field3003[var15] = -1;
                } else {
                    var8.field3003[var15] = -2;
                }
            } else if (var16 == 0) {
                class287 var28;
                if (this.field2745 == null || this.field2745[this.field2753[var15]] == null) {
                    var28 = this.field2744[this.field2753[var15]];
                } else {
                    var28 = this.field2745[this.field2753[var15]];
                }
                int var29 = (var28.field3073 * arg4 + var28.field3072 * arg3 + var28.field3071 * arg2) / (var28.field3074 * var7) + arg0;
                var8.field2998[var15] = method4668(var29);
                class287 var30;
                if (this.field2745 == null || this.field2745[this.field2723[var15]] == null) {
                    var30 = this.field2744[this.field2723[var15]];
                } else {
                    var30 = this.field2745[this.field2723[var15]];
                }
                int var31 = (var30.field3073 * arg4 + var30.field3072 * arg3 + var30.field3071 * arg2) / (var30.field3074 * var7) + arg0;
                var8.field2999[var15] = method4668(var31);
                class287 var32;
                if (this.field2745 == null || this.field2745[this.field2724[var15]] == null) {
                    var32 = this.field2744[this.field2724[var15]];
                } else {
                    var32 = this.field2745[this.field2724[var15]];
                }
                int var33 = (var32.field3073 * arg4 + var32.field3072 * arg3 + var32.field3071 * arg2) / (var32.field3074 * var7) + arg0;
                var8.field3003[var15] = method4668(var33);
            } else if (var16 == 1) {
                class279 var34 = this.field2743[var15];
                int var35 = (var34.field2928 * arg4 + var34.field2927 * arg2 + var34.field2926 * arg3) / (var7 / 2 + var7) + arg0;
                var8.field2998[var15] = method4668(var35);
                var8.field3003[var15] = -1;
            } else {
                var8.field3003[var15] = -2;
            }
        }
        this.method4719();
        var8.field2990 = this.field2714;
        var8.field3026 = this.field2747;
        var8.field2983 = this.field2751;
        var8.field2993 = this.field2720;
        var8.field2994 = this.field2741;
        var8.field2995 = this.field2753;
        var8.field2996 = this.field2723;
        var8.field2997 = this.field2724;
        var8.field3049 = this.field2726;
        var8.field3048 = this.field2727;
        var8.field2992 = this.field2742;
        var8.field3001 = this.field2739;
        var8.field3011 = this.field2740;
        var8.field3005 = this.field2730;
        var8.field3012 = this.field2722;
        var8.field3013 = this.field2736;
        return var8;
    }

    @ObfuscatedName("kf.bo(II)I")
    public static final int method4643(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("kf.bd(I)I")
    public static final int method4668(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
