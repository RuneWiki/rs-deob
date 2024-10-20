package deob;

@ObfuscatedName("km")
public class class265 extends class276 {

    @ObfuscatedName("km.aj")
    public int field2725 = 0;

    @ObfuscatedName("km.aq")
    public int[] field2705;

    @ObfuscatedName("km.ar")
    public int[] field2706;

    @ObfuscatedName("km.ag")
    public int[] field2714;

    @ObfuscatedName("km.ao")
    public int field2708 = 0;

    @ObfuscatedName("km.ae")
    public int[] field2709;

    @ObfuscatedName("km.aa")
    public int[] field2710;

    @ObfuscatedName("km.au")
    public int[] field2711;

    @ObfuscatedName("km.an")
    public byte[] field2728;

    @ObfuscatedName("km.ad")
    public byte[] field2713;

    @ObfuscatedName("km.ax")
    public byte[] field2724;

    @ObfuscatedName("km.aw")
    public byte[] field2715;

    @ObfuscatedName("km.az")
    public short[] field2717;

    @ObfuscatedName("km.av")
    public short[] field2701;

    @ObfuscatedName("km.ak")
    public byte field2737 = 0;

    @ObfuscatedName("km.ay")
    public int field2719;

    @ObfuscatedName("km.as")
    public byte[] field2720;

    @ObfuscatedName("km.ab")
    public short[] field2741;

    @ObfuscatedName("km.ah")
    public short[] field2722;

    @ObfuscatedName("km.ai")
    public short[] field2735;

    @ObfuscatedName("km.ac")
    public int[] field2743;

    @ObfuscatedName("km.al")
    public int[] field2742;

    @ObfuscatedName("km.at")
    public int[][] field2726;

    @ObfuscatedName("km.bj")
    public int[][] field2727;

    @ObfuscatedName("km.bd")
    public int[][] field2704;

    @ObfuscatedName("km.bg")
    public int[][] field2729;

    @ObfuscatedName("km.bt")
    public class277[] field2730;

    @ObfuscatedName("km.br")
    public class285[] field2731;

    @ObfuscatedName("km.ba")
    public class285[] field2732;

    @ObfuscatedName("km.bk")
    public short field2707;

    @ObfuscatedName("km.bn")
    public short field2734;

    @ObfuscatedName("km.by")
    public boolean field2718 = false;

    @ObfuscatedName("km.bc")
    public int field2736;

    @ObfuscatedName("km.bx")
    public int field2716;

    @ObfuscatedName("km.bf")
    public int field2738;

    @ObfuscatedName("km.bp")
    public int field2739;

    @ObfuscatedName("km.bv")
    public int field2740;

    @ObfuscatedName("km.bm")
    public static int[] field2712 = new int[10000];

    @ObfuscatedName("km.bq")
    public static int[] field2721 = new int[10000];

    @ObfuscatedName("km.bb")
    public static int field2723 = 0;

    @ObfuscatedName("km.bh")
    public static int[] field2744 = class270.field2803;

    @ObfuscatedName("km.bw")
    public static int[] field2745 = class270.field2808;

    public class265() {
    }

    @ObfuscatedName("km.am(Low;II)Lkm;")
    public static class265 method4650(class375 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method6396(arg1, arg2);
        return var3 == null ? null : new class265(var3);
    }

    public class265(byte[] arg0) {
        class531 var2 = new class531(10);
        var2.method8737(-2);
        if (arg0[arg0.length - 1] == -3 && arg0[arg0.length - 2] == -1) {
            this.method4651(arg0);
        } else if (arg0[arg0.length - 1] == -2 && arg0[arg0.length - 2] == -1) {
            this.method4714(arg0);
        } else if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method4696(arg0);
        } else {
            this.method4654(arg0);
        }
    }

    @ObfuscatedName("km.af([B)V")
    public void method4651(byte[] arg0) {
        class531 var2 = new class531(arg0);
        class531 var3 = new class531(arg0);
        class531 var4 = new class531(arg0);
        class531 var5 = new class531(arg0);
        class531 var6 = new class531(arg0);
        class531 var7 = new class531(arg0);
        class531 var8 = new class531(arg0);
        var2.field5181 = arg0.length - 26;
        int var9 = var2.method8775();
        int var10 = var2.method8775();
        int var11 = var2.method8561();
        int var12 = var2.method8561();
        int var13 = var2.method8561();
        int var14 = var2.method8561();
        int var15 = var2.method8561();
        int var16 = var2.method8561();
        int var17 = var2.method8561();
        int var18 = var2.method8561();
        int var19 = var2.method8775();
        int var20 = var2.method8775();
        int var21 = var2.method8775();
        int var22 = var2.method8775();
        int var23 = var2.method8775();
        int var24 = var2.method8775();
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        if (var11 > 0) {
            this.field2720 = new byte[var11];
            var2.field5181 = 0;
            for (int var28 = 0; var28 < var11; var28++) {
                byte var29 = this.field2720[var28] = var2.method8562();
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
        this.field2725 = var9;
        this.field2708 = var10;
        this.field2719 = var11;
        this.field2705 = new int[var9];
        this.field2706 = new int[var9];
        this.field2714 = new int[var9];
        this.field2709 = new int[var10];
        this.field2710 = new int[var10];
        this.field2711 = new int[var10];
        if (var17 == 1) {
            this.field2743 = new int[var9];
        }
        if (var12 == 1) {
            this.field2728 = new byte[var10];
        }
        if (var13 == 255) {
            this.field2713 = new byte[var10];
        } else {
            this.field2737 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2724 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2742 = new int[var10];
        }
        if (var16 == 1) {
            this.field2701 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field2715 = new byte[var10];
        }
        if (var18 == 1) {
            this.field2704 = new int[var9][];
            this.field2729 = new int[var9][];
        }
        this.field2717 = new short[var10];
        if (var11 > 0) {
            this.field2741 = new short[var11];
            this.field2722 = new short[var11];
            this.field2735 = new short[var11];
        }
        var2.field5181 = var11;
        var3.field5181 = var47;
        var4.field5181 = var49;
        var5.field5181 = var51;
        var6.field5181 = var35;
        int var67 = 0;
        int var68 = 0;
        int var69 = 0;
        for (int var70 = 0; var70 < var9; var70++) {
            int var71 = var2.method8561();
            int var72 = 0;
            if ((var71 & 0x1) != 0) {
                var72 = var3.method8631();
            }
            int var73 = 0;
            if ((var71 & 0x2) != 0) {
                var73 = var4.method8631();
            }
            int var74 = 0;
            if ((var71 & 0x4) != 0) {
                var74 = var5.method8631();
            }
            this.field2705[var70] = var67 + var72;
            this.field2706[var70] = var68 + var73;
            this.field2714[var70] = var69 + var74;
            var67 = this.field2705[var70];
            var68 = this.field2706[var70];
            var69 = this.field2714[var70];
            if (var17 == 1) {
                this.field2743[var70] = var6.method8561();
            }
        }
        if (var18 == 1) {
            for (int var75 = 0; var75 < var9; var75++) {
                int var76 = var6.method8561();
                this.field2704[var75] = new int[var76];
                this.field2729[var75] = new int[var76];
                for (int var77 = 0; var77 < var76; var77++) {
                    this.field2704[var75][var77] = var6.method8561();
                    this.field2729[var75][var77] = var6.method8561();
                }
            }
        }
        var2.field5181 = var45;
        var3.field5181 = var33;
        var4.field5181 = var36;
        var5.field5181 = var40;
        var6.field5181 = var37;
        var7.field5181 = var43;
        var8.field5181 = var42;
        for (int var78 = 0; var78 < var10; var78++) {
            this.field2717[var78] = (short) var2.method8775();
            if (var12 == 1) {
                this.field2728[var78] = var3.method8562();
            }
            if (var13 == 255) {
                this.field2713[var78] = var4.method8562();
            }
            if (var14 == 1) {
                this.field2724[var78] = var5.method8562();
            }
            if (var15 == 1) {
                this.field2742[var78] = var6.method8561();
            }
            if (var16 == 1) {
                this.field2701[var78] = (short) (var7.method8775() - 1);
            }
            if (this.field2715 != null && this.field2701[var78] != -1) {
                this.field2715[var78] = (byte) (var8.method8561() - 1);
            }
        }
        var2.field5181 = var39;
        var3.field5181 = var32;
        int var79 = 0;
        int var80 = 0;
        int var81 = 0;
        int var82 = 0;
        for (int var83 = 0; var83 < var10; var83++) {
            int var84 = var3.method8561();
            if (var84 == 1) {
                var79 = var2.method8631() + var82;
                var80 = var2.method8631() + var79;
                var81 = var2.method8631() + var80;
                var82 = var81;
                this.field2709[var83] = var79;
                this.field2710[var83] = var80;
                this.field2711[var83] = var81;
            }
            if (var84 == 2) {
                var80 = var81;
                var81 = var2.method8631() + var82;
                var82 = var81;
                this.field2709[var83] = var79;
                this.field2710[var83] = var80;
                this.field2711[var83] = var81;
            }
            if (var84 == 3) {
                var79 = var81;
                var81 = var2.method8631() + var82;
                var82 = var81;
                this.field2709[var83] = var79;
                this.field2710[var83] = var80;
                this.field2711[var83] = var81;
            }
            if (var84 == 4) {
                int var87 = var79;
                var79 = var80;
                var80 = var87;
                var81 = var2.method8631() + var82;
                var82 = var81;
                this.field2709[var83] = var79;
                this.field2710[var83] = var87;
                this.field2711[var83] = var81;
            }
        }
        var2.field5181 = var53;
        var3.field5181 = var55;
        var4.field5181 = var57;
        var5.field5181 = var59;
        var6.field5181 = var61;
        var7.field5181 = var63;
        for (int var88 = 0; var88 < var11; var88++) {
            int var89 = this.field2720[var88] & 0xFF;
            if (var89 == 0) {
                this.field2741[var88] = (short) var2.method8775();
                this.field2722[var88] = (short) var2.method8775();
                this.field2735[var88] = (short) var2.method8775();
            }
        }
        var2.field5181 = var65;
        int var90 = var2.method8561();
        if (var90 == 0) {
            return;
        }
        new class290();
        var2.method8775();
        var2.method8775();
        var2.method8775();
        var2.method8566();
    }

    @ObfuscatedName("km.aj([B)V")
    public void method4714(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class531 var4 = new class531(arg0);
        class531 var5 = new class531(arg0);
        class531 var6 = new class531(arg0);
        class531 var7 = new class531(arg0);
        class531 var8 = new class531(arg0);
        var4.field5181 = arg0.length - 23;
        int var9 = var4.method8775();
        int var10 = var4.method8775();
        int var11 = var4.method8561();
        int var12 = var4.method8561();
        int var13 = var4.method8561();
        int var14 = var4.method8561();
        int var15 = var4.method8561();
        int var16 = var4.method8561();
        int var17 = var4.method8561();
        int var18 = var4.method8775();
        int var19 = var4.method8775();
        int var20 = var4.method8775();
        int var21 = var4.method8775();
        int var22 = var4.method8775();
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
        this.field2725 = var9;
        this.field2708 = var10;
        this.field2719 = var11;
        this.field2705 = new int[var9];
        this.field2706 = new int[var9];
        this.field2714 = new int[var9];
        this.field2709 = new int[var10];
        this.field2710 = new int[var10];
        this.field2711 = new int[var10];
        if (var11 > 0) {
            this.field2720 = new byte[var11];
            this.field2741 = new short[var11];
            this.field2722 = new short[var11];
            this.field2735 = new short[var11];
        }
        if (var16 == 1) {
            this.field2743 = new int[var9];
        }
        if (var12 == 1) {
            this.field2728 = new byte[var10];
            this.field2715 = new byte[var10];
            this.field2701 = new short[var10];
        }
        if (var13 == 255) {
            this.field2713 = new byte[var10];
        } else {
            this.field2737 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2724 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2742 = new int[var10];
        }
        if (var17 == 1) {
            this.field2704 = new int[var9][];
            this.field2729 = new int[var9][];
        }
        this.field2717 = new short[var10];
        var4.field5181 = var23;
        var5.field5181 = var39;
        var6.field5181 = var41;
        var7.field5181 = var43;
        var8.field5181 = var27;
        int var46 = 0;
        int var47 = 0;
        int var48 = 0;
        for (int var49 = 0; var49 < var9; var49++) {
            int var50 = var4.method8561();
            int var51 = 0;
            if ((var50 & 0x1) != 0) {
                var51 = var5.method8631();
            }
            int var52 = 0;
            if ((var50 & 0x2) != 0) {
                var52 = var6.method8631();
            }
            int var53 = 0;
            if ((var50 & 0x4) != 0) {
                var53 = var7.method8631();
            }
            this.field2705[var49] = var46 + var51;
            this.field2706[var49] = var47 + var52;
            this.field2714[var49] = var48 + var53;
            var46 = this.field2705[var49];
            var47 = this.field2706[var49];
            var48 = this.field2714[var49];
            if (var16 == 1) {
                this.field2743[var49] = var8.method8561();
            }
        }
        if (var17 == 1) {
            for (int var54 = 0; var54 < var9; var54++) {
                int var55 = var8.method8561();
                this.field2704[var54] = new int[var55];
                this.field2729[var54] = new int[var55];
                for (int var56 = 0; var56 < var55; var56++) {
                    this.field2704[var54][var56] = var8.method8561();
                    this.field2729[var54][var56] = var8.method8561();
                }
            }
        }
        var4.field5181 = var35;
        var5.field5181 = var30;
        var6.field5181 = var28;
        var7.field5181 = var33;
        var8.field5181 = var29;
        for (int var57 = 0; var57 < var10; var57++) {
            this.field2717[var57] = (short) var4.method8775();
            if (var12 == 1) {
                int var58 = var5.method8561();
                if ((var58 & 0x1) == 1) {
                    this.field2728[var57] = 1;
                    var2 = true;
                } else {
                    this.field2728[var57] = 0;
                }
                if ((var58 & 0x2) == 2) {
                    this.field2715[var57] = (byte) (var58 >> 2);
                    this.field2701[var57] = this.field2717[var57];
                    this.field2717[var57] = 127;
                    if (this.field2701[var57] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field2715[var57] = -1;
                    this.field2701[var57] = -1;
                }
            }
            if (var13 == 255) {
                this.field2713[var57] = var6.method8562();
            }
            if (var14 == 1) {
                this.field2724[var57] = var7.method8562();
            }
            if (var15 == 1) {
                this.field2742[var57] = var8.method8561();
            }
        }
        var4.field5181 = var32;
        var5.field5181 = var25;
        int var59 = 0;
        int var60 = 0;
        int var61 = 0;
        int var62 = 0;
        for (int var63 = 0; var63 < var10; var63++) {
            int var64 = var5.method8561();
            if (var64 == 1) {
                var59 = var4.method8631() + var62;
                var60 = var4.method8631() + var59;
                var61 = var4.method8631() + var60;
                var62 = var61;
                this.field2709[var63] = var59;
                this.field2710[var63] = var60;
                this.field2711[var63] = var61;
            }
            if (var64 == 2) {
                var60 = var61;
                var61 = var4.method8631() + var62;
                var62 = var61;
                this.field2709[var63] = var59;
                this.field2710[var63] = var60;
                this.field2711[var63] = var61;
            }
            if (var64 == 3) {
                var59 = var61;
                var61 = var4.method8631() + var62;
                var62 = var61;
                this.field2709[var63] = var59;
                this.field2710[var63] = var60;
                this.field2711[var63] = var61;
            }
            if (var64 == 4) {
                int var67 = var59;
                var59 = var60;
                var60 = var67;
                var61 = var4.method8631() + var62;
                var62 = var61;
                this.field2709[var63] = var59;
                this.field2710[var63] = var67;
                this.field2711[var63] = var61;
            }
        }
        var4.field5181 = var37;
        for (int var68 = 0; var68 < var11; var68++) {
            this.field2720[var68] = 0;
            this.field2741[var68] = (short) var4.method8775();
            this.field2722[var68] = (short) var4.method8775();
            this.field2735[var68] = (short) var4.method8775();
        }
        if (this.field2715 != null) {
            boolean var69 = false;
            for (int var70 = 0; var70 < var10; var70++) {
                int var71 = this.field2715[var70] & 0xFF;
                if (var71 != 255) {
                    if ((this.field2741[var71] & 0xFFFF) == this.field2709[var70] && (this.field2722[var71] & 0xFFFF) == this.field2710[var70] && (this.field2735[var71] & 0xFFFF) == this.field2711[var70]) {
                        this.field2715[var70] = -1;
                    } else {
                        var69 = true;
                    }
                }
            }
            if (!var69) {
                this.field2715 = null;
            }
        }
        if (!var3) {
            this.field2701 = null;
        }
        if (!var2) {
            this.field2728 = null;
        }
    }

    @ObfuscatedName("km.aq([B)V")
    public void method4696(byte[] arg0) {
        class531 var2 = new class531(arg0);
        class531 var3 = new class531(arg0);
        class531 var4 = new class531(arg0);
        class531 var5 = new class531(arg0);
        class531 var6 = new class531(arg0);
        class531 var7 = new class531(arg0);
        class531 var8 = new class531(arg0);
        var2.field5181 = arg0.length - 23;
        int var9 = var2.method8775();
        int var10 = var2.method8775();
        int var11 = var2.method8561();
        int var12 = var2.method8561();
        int var13 = var2.method8561();
        int var14 = var2.method8561();
        int var15 = var2.method8561();
        int var16 = var2.method8561();
        int var17 = var2.method8561();
        int var18 = var2.method8775();
        int var19 = var2.method8775();
        int var20 = var2.method8775();
        int var21 = var2.method8775();
        int var22 = var2.method8775();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field2720 = new byte[var11];
            var2.field5181 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field2720[var26] = var2.method8562();
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
        this.field2725 = var9;
        this.field2708 = var10;
        this.field2719 = var11;
        this.field2705 = new int[var9];
        this.field2706 = new int[var9];
        this.field2714 = new int[var9];
        this.field2709 = new int[var10];
        this.field2710 = new int[var10];
        this.field2711 = new int[var10];
        if (var17 == 1) {
            this.field2743 = new int[var9];
        }
        if (var12 == 1) {
            this.field2728 = new byte[var10];
        }
        if (var13 == 255) {
            this.field2713 = new byte[var10];
        } else {
            this.field2737 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2724 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2742 = new int[var10];
        }
        if (var16 == 1) {
            this.field2701 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field2715 = new byte[var10];
        }
        this.field2717 = new short[var10];
        if (var11 > 0) {
            this.field2741 = new short[var11];
            this.field2722 = new short[var11];
            this.field2735 = new short[var11];
        }
        var2.field5181 = var11;
        var3.field5181 = var44;
        var4.field5181 = var46;
        var5.field5181 = var48;
        var6.field5181 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method8561();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method8631();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method8631();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method8631();
            }
            this.field2705[var67] = var64 + var69;
            this.field2706[var67] = var65 + var70;
            this.field2714[var67] = var66 + var71;
            var64 = this.field2705[var67];
            var65 = this.field2706[var67];
            var66 = this.field2714[var67];
            if (var17 == 1) {
                this.field2743[var67] = var6.method8561();
            }
        }
        var2.field5181 = var42;
        var3.field5181 = var31;
        var4.field5181 = var34;
        var5.field5181 = var37;
        var6.field5181 = var35;
        var7.field5181 = var40;
        var8.field5181 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field2717[var72] = (short) var2.method8775();
            if (var12 == 1) {
                this.field2728[var72] = var3.method8562();
            }
            if (var13 == 255) {
                this.field2713[var72] = var4.method8562();
            }
            if (var14 == 1) {
                this.field2724[var72] = var5.method8562();
            }
            if (var15 == 1) {
                this.field2742[var72] = var6.method8561();
            }
            if (var16 == 1) {
                this.field2701[var72] = (short) (var7.method8775() - 1);
            }
            if (this.field2715 != null && this.field2701[var72] != -1) {
                this.field2715[var72] = (byte) (var8.method8561() - 1);
            }
        }
        var2.field5181 = var33;
        var3.field5181 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method8561();
            if (var78 == 1) {
                var73 = var2.method8631() + var76;
                var74 = var2.method8631() + var73;
                var75 = var2.method8631() + var74;
                var76 = var75;
                this.field2709[var77] = var73;
                this.field2710[var77] = var74;
                this.field2711[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method8631() + var76;
                var76 = var75;
                this.field2709[var77] = var73;
                this.field2710[var77] = var74;
                this.field2711[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method8631() + var76;
                var76 = var75;
                this.field2709[var77] = var73;
                this.field2710[var77] = var74;
                this.field2711[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method8631() + var76;
                var76 = var75;
                this.field2709[var77] = var73;
                this.field2710[var77] = var81;
                this.field2711[var77] = var75;
            }
        }
        var2.field5181 = var50;
        var3.field5181 = var52;
        var4.field5181 = var54;
        var5.field5181 = var56;
        var6.field5181 = var58;
        var7.field5181 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field2720[var82] & 0xFF;
            if (var83 == 0) {
                this.field2741[var82] = (short) var2.method8775();
                this.field2722[var82] = (short) var2.method8775();
                this.field2735[var82] = (short) var2.method8775();
            }
        }
        var2.field5181 = var62;
        int var84 = var2.method8561();
        if (var84 == 0) {
            return;
        }
        new class290();
        var2.method8775();
        var2.method8775();
        var2.method8775();
        var2.method8566();
    }

    @ObfuscatedName("km.ae([B)V")
    public void method4654(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class531 var4 = new class531(arg0);
        class531 var5 = new class531(arg0);
        class531 var6 = new class531(arg0);
        class531 var7 = new class531(arg0);
        class531 var8 = new class531(arg0);
        var4.field5181 = arg0.length - 18;
        int var9 = var4.method8775();
        int var10 = var4.method8775();
        int var11 = var4.method8561();
        int var12 = var4.method8561();
        int var13 = var4.method8561();
        int var14 = var4.method8561();
        int var15 = var4.method8561();
        int var16 = var4.method8561();
        int var17 = var4.method8775();
        int var18 = var4.method8775();
        int var19 = var4.method8775();
        int var20 = var4.method8775();
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
        this.field2725 = var9;
        this.field2708 = var10;
        this.field2719 = var11;
        this.field2705 = new int[var9];
        this.field2706 = new int[var9];
        this.field2714 = new int[var9];
        this.field2709 = new int[var10];
        this.field2710 = new int[var10];
        this.field2711 = new int[var10];
        if (var11 > 0) {
            this.field2720 = new byte[var11];
            this.field2741 = new short[var11];
            this.field2722 = new short[var11];
            this.field2735 = new short[var11];
        }
        if (var16 == 1) {
            this.field2743 = new int[var9];
        }
        if (var12 == 1) {
            this.field2728 = new byte[var10];
            this.field2715 = new byte[var10];
            this.field2701 = new short[var10];
        }
        if (var13 == 255) {
            this.field2713 = new byte[var10];
        } else {
            this.field2737 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2724 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2742 = new int[var10];
        }
        this.field2717 = new short[var10];
        var4.field5181 = var21;
        var5.field5181 = var36;
        var6.field5181 = var38;
        var7.field5181 = var40;
        var8.field5181 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method8561();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method8631();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method8631();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method8631();
            }
            this.field2705[var46] = var43 + var48;
            this.field2706[var46] = var44 + var49;
            this.field2714[var46] = var45 + var50;
            var43 = this.field2705[var46];
            var44 = this.field2706[var46];
            var45 = this.field2714[var46];
            if (var16 == 1) {
                this.field2743[var46] = var8.method8561();
            }
        }
        var4.field5181 = var32;
        var5.field5181 = var28;
        var6.field5181 = var26;
        var7.field5181 = var30;
        var8.field5181 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field2717[var51] = (short) var4.method8775();
            if (var12 == 1) {
                int var52 = var5.method8561();
                if ((var52 & 0x1) == 1) {
                    this.field2728[var51] = 1;
                    var2 = true;
                } else {
                    this.field2728[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field2715[var51] = (byte) (var52 >> 2);
                    this.field2701[var51] = this.field2717[var51];
                    this.field2717[var51] = 127;
                    if (this.field2701[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field2715[var51] = -1;
                    this.field2701[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field2713[var51] = var6.method8562();
            }
            if (var14 == 1) {
                this.field2724[var51] = var7.method8562();
            }
            if (var15 == 1) {
                this.field2742[var51] = var8.method8561();
            }
        }
        var4.field5181 = var25;
        var5.field5181 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method8561();
            if (var58 == 1) {
                var53 = var4.method8631() + var56;
                var54 = var4.method8631() + var53;
                var55 = var4.method8631() + var54;
                var56 = var55;
                this.field2709[var57] = var53;
                this.field2710[var57] = var54;
                this.field2711[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method8631() + var56;
                var56 = var55;
                this.field2709[var57] = var53;
                this.field2710[var57] = var54;
                this.field2711[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method8631() + var56;
                var56 = var55;
                this.field2709[var57] = var53;
                this.field2710[var57] = var54;
                this.field2711[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method8631() + var56;
                var56 = var55;
                this.field2709[var57] = var53;
                this.field2710[var57] = var61;
                this.field2711[var57] = var55;
            }
        }
        var4.field5181 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field2720[var62] = 0;
            this.field2741[var62] = (short) var4.method8775();
            this.field2722[var62] = (short) var4.method8775();
            this.field2735[var62] = (short) var4.method8775();
        }
        if (this.field2715 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field2715[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field2741[var65] & 0xFFFF) == this.field2709[var64] && (this.field2722[var65] & 0xFFFF) == this.field2710[var64] && (this.field2735[var65] & 0xFFFF) == this.field2711[var64]) {
                        this.field2715[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field2715 = null;
            }
        }
        if (!var3) {
            this.field2701 = null;
        }
        if (!var2) {
            this.field2728 = null;
        }
    }

    public class265(class265[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        this.field2725 = 0;
        this.field2708 = 0;
        this.field2719 = 0;
        this.field2737 = -1;
        for (int var10 = 0; var10 < arg1; var10++) {
            class265 var11 = arg0[var10];
            if (var11 != null) {
                this.field2725 += var11.field2725;
                this.field2708 += var11.field2708;
                this.field2719 += var11.field2719;
                if (var11.field2713 == null) {
                    if (this.field2737 == -1) {
                        this.field2737 = var11.field2737;
                    }
                    if (this.field2737 != var11.field2737) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var11.field2728 != null;
                var5 |= var11.field2724 != null;
                var6 |= var11.field2742 != null;
                var7 |= var11.field2701 != null;
                var8 |= var11.field2715 != null;
                var9 |= var11.field2704 != null;
            }
        }
        this.field2705 = new int[this.field2725];
        this.field2706 = new int[this.field2725];
        this.field2714 = new int[this.field2725];
        this.field2743 = new int[this.field2725];
        this.field2709 = new int[this.field2708];
        this.field2710 = new int[this.field2708];
        this.field2711 = new int[this.field2708];
        if (var3) {
            this.field2728 = new byte[this.field2708];
        }
        if (var4) {
            this.field2713 = new byte[this.field2708];
        }
        if (var5) {
            this.field2724 = new byte[this.field2708];
        }
        if (var6) {
            this.field2742 = new int[this.field2708];
        }
        if (var7) {
            this.field2701 = new short[this.field2708];
        }
        if (var8) {
            this.field2715 = new byte[this.field2708];
        }
        if (var9) {
            this.field2704 = new int[this.field2725][];
            this.field2729 = new int[this.field2725][];
        }
        this.field2717 = new short[this.field2708];
        if (this.field2719 > 0) {
            this.field2720 = new byte[this.field2719];
            this.field2741 = new short[this.field2719];
            this.field2722 = new short[this.field2719];
            this.field2735 = new short[this.field2719];
        }
        this.field2725 = 0;
        this.field2708 = 0;
        this.field2719 = 0;
        for (int var12 = 0; var12 < arg1; var12++) {
            class265 var13 = arg0[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < var13.field2708; var14++) {
                    if (var3 && var13.field2728 != null) {
                        this.field2728[this.field2708] = var13.field2728[var14];
                    }
                    if (var4) {
                        if (var13.field2713 == null) {
                            this.field2713[this.field2708] = var13.field2737;
                        } else {
                            this.field2713[this.field2708] = var13.field2713[var14];
                        }
                    }
                    if (var5 && var13.field2724 != null) {
                        this.field2724[this.field2708] = var13.field2724[var14];
                    }
                    if (var6 && var13.field2742 != null) {
                        this.field2742[this.field2708] = var13.field2742[var14];
                    }
                    if (var7) {
                        if (var13.field2701 == null) {
                            this.field2701[this.field2708] = -1;
                        } else {
                            this.field2701[this.field2708] = var13.field2701[var14];
                        }
                    }
                    if (var8) {
                        if (var13.field2715 == null || var13.field2715[var14] == -1) {
                            this.field2715[this.field2708] = -1;
                        } else {
                            this.field2715[this.field2708] = (byte) (var13.field2715[var14] + this.field2719);
                        }
                    }
                    this.field2717[this.field2708] = var13.field2717[var14];
                    this.field2709[this.field2708] = this.method4655(var13, var13.field2709[var14]);
                    this.field2710[this.field2708] = this.method4655(var13, var13.field2710[var14]);
                    this.field2711[this.field2708] = this.method4655(var13, var13.field2711[var14]);
                    this.field2708++;
                }
                for (int var15 = 0; var15 < var13.field2719; var15++) {
                    byte var16 = this.field2720[this.field2719] = var13.field2720[var15];
                    if (var16 == 0) {
                        this.field2741[this.field2719] = (short) this.method4655(var13, var13.field2741[var15]);
                        this.field2722[this.field2719] = (short) this.method4655(var13, var13.field2722[var15]);
                        this.field2735[this.field2719] = (short) this.method4655(var13, var13.field2735[var15]);
                    }
                    this.field2719++;
                }
            }
        }
    }

    @ObfuscatedName("km.aa(Lkm;I)I")
    public final int method4655(class265 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field2705[arg1];
        int var5 = arg0.field2706[arg1];
        int var6 = arg0.field2714[arg1];
        for (int var7 = 0; var7 < this.field2725; var7++) {
            if (this.field2705[var7] == var4 && this.field2706[var7] == var5 && this.field2714[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field2705[this.field2725] = var4;
            this.field2706[this.field2725] = var5;
            this.field2714[this.field2725] = var6;
            if (arg0.field2743 != null) {
                this.field2743[this.field2725] = arg0.field2743[arg1];
            }
            if (arg0.field2704 != null) {
                this.field2704[this.field2725] = arg0.field2704[arg1];
                this.field2729[this.field2725] = arg0.field2729[arg1];
            }
            var3 = this.field2725++;
        }
        return var3;
    }

    public class265(class265 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field2725 = arg0.field2725;
        this.field2708 = arg0.field2708;
        this.field2719 = arg0.field2719;
        if (arg1) {
            this.field2705 = arg0.field2705;
            this.field2706 = arg0.field2706;
            this.field2714 = arg0.field2714;
        } else {
            this.field2705 = new int[this.field2725];
            this.field2706 = new int[this.field2725];
            this.field2714 = new int[this.field2725];
            for (int var6 = 0; var6 < this.field2725; var6++) {
                this.field2705[var6] = arg0.field2705[var6];
                this.field2706[var6] = arg0.field2706[var6];
                this.field2714[var6] = arg0.field2714[var6];
            }
        }
        if (arg2) {
            this.field2717 = arg0.field2717;
        } else {
            this.field2717 = new short[this.field2708];
            for (int var7 = 0; var7 < this.field2708; var7++) {
                this.field2717[var7] = arg0.field2717[var7];
            }
        }
        if (arg3 || arg0.field2701 == null) {
            this.field2701 = arg0.field2701;
        } else {
            this.field2701 = new short[this.field2708];
            for (int var8 = 0; var8 < this.field2708; var8++) {
                this.field2701[var8] = arg0.field2701[var8];
            }
        }
        if (arg4) {
            this.field2724 = arg0.field2724;
        } else {
            this.field2724 = new byte[this.field2708];
            if (arg0.field2724 == null) {
                for (int var9 = 0; var9 < this.field2708; var9++) {
                    this.field2724[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field2708; var10++) {
                    this.field2724[var10] = arg0.field2724[var10];
                }
            }
        }
        this.field2709 = arg0.field2709;
        this.field2710 = arg0.field2710;
        this.field2711 = arg0.field2711;
        this.field2728 = arg0.field2728;
        this.field2713 = arg0.field2713;
        this.field2715 = arg0.field2715;
        this.field2737 = arg0.field2737;
        this.field2720 = arg0.field2720;
        this.field2741 = arg0.field2741;
        this.field2722 = arg0.field2722;
        this.field2735 = arg0.field2735;
        this.field2743 = arg0.field2743;
        this.field2742 = arg0.field2742;
        this.field2726 = arg0.field2726;
        this.field2727 = arg0.field2727;
        this.field2731 = arg0.field2731;
        this.field2730 = arg0.field2730;
        this.field2732 = arg0.field2732;
        this.field2704 = arg0.field2704;
        this.field2729 = arg0.field2729;
        this.field2707 = arg0.field2707;
        this.field2734 = arg0.field2734;
    }

    @ObfuscatedName("km.au()Lkm;")
    public class265 method4700() {
        class265 var1 = new class265();
        if (this.field2728 != null) {
            var1.field2728 = new byte[this.field2708];
            for (int var2 = 0; var2 < this.field2708; var2++) {
                var1.field2728[var2] = this.field2728[var2];
            }
        }
        var1.field2725 = this.field2725;
        var1.field2708 = this.field2708;
        var1.field2719 = this.field2719;
        var1.field2705 = this.field2705;
        var1.field2706 = this.field2706;
        var1.field2714 = this.field2714;
        var1.field2709 = this.field2709;
        var1.field2710 = this.field2710;
        var1.field2711 = this.field2711;
        var1.field2713 = this.field2713;
        var1.field2724 = this.field2724;
        var1.field2715 = this.field2715;
        var1.field2717 = this.field2717;
        var1.field2701 = this.field2701;
        var1.field2737 = this.field2737;
        var1.field2720 = this.field2720;
        var1.field2741 = this.field2741;
        var1.field2722 = this.field2722;
        var1.field2735 = this.field2735;
        var1.field2743 = this.field2743;
        var1.field2742 = this.field2742;
        var1.field2726 = this.field2726;
        var1.field2727 = this.field2727;
        var1.field2731 = this.field2731;
        var1.field2730 = this.field2730;
        var1.field2707 = this.field2707;
        var1.field2734 = this.field2734;
        return var1;
    }

    @ObfuscatedName("km.an([[IIIIZI)Lkm;")
    public class265 method4656(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method4711();
        int var7 = this.field2716 + arg1;
        int var8 = this.field2738 + arg1;
        int var9 = this.field2740 + arg3;
        int var10 = this.field2739 + arg3;
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
        class265 var15;
        if (arg4) {
            var15 = new class265();
            var15.field2725 = this.field2725;
            var15.field2708 = this.field2708;
            var15.field2719 = this.field2719;
            var15.field2705 = this.field2705;
            var15.field2714 = this.field2714;
            var15.field2709 = this.field2709;
            var15.field2710 = this.field2710;
            var15.field2711 = this.field2711;
            var15.field2728 = this.field2728;
            var15.field2713 = this.field2713;
            var15.field2724 = this.field2724;
            var15.field2715 = this.field2715;
            var15.field2717 = this.field2717;
            var15.field2701 = this.field2701;
            var15.field2737 = this.field2737;
            var15.field2720 = this.field2720;
            var15.field2741 = this.field2741;
            var15.field2722 = this.field2722;
            var15.field2735 = this.field2735;
            var15.field2743 = this.field2743;
            var15.field2742 = this.field2742;
            var15.field2726 = this.field2726;
            var15.field2727 = this.field2727;
            var15.field2707 = this.field2707;
            var15.field2734 = this.field2734;
            var15.field2706 = new int[var15.field2725];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field2725; var16++) {
                int var17 = this.field2705[var16] + arg1;
                int var18 = this.field2714[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field2706[var16] = this.field2706[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field2725; var26++) {
                int var27 = (-this.field2706[var26] << 16) / this.field2910;
                if (var27 < arg5) {
                    int var28 = this.field2705[var26] + arg1;
                    int var29 = this.field2714[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field2706[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field2706[var26];
                }
            }
        }
        var15.method4717();
        return var15;
    }

    @ObfuscatedName("km.ad()V")
    public void method4658() {
        int var10002;
        if (this.field2743 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field2725; var3++) {
                int var4 = this.field2743[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field2726 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field2726[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field2725) {
                int var7 = this.field2743[var6];
                this.field2726[var7][var1[var7]++] = var6++;
            }
            this.field2743 = null;
        }
        if (this.field2742 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field2708; var10++) {
            int var11 = this.field2742[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field2727 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field2727[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field2708) {
            int var14 = this.field2742[var13];
            this.field2727[var14][var8[var14]++] = var13++;
        }
        this.field2742 = null;
    }

    @ObfuscatedName("km.ax()V")
    public void method4659() {
        for (int var1 = 0; var1 < this.field2725; var1++) {
            int var2 = this.field2705[var1];
            this.field2705[var1] = this.field2714[var1];
            this.field2714[var1] = -var2;
        }
        this.method4717();
    }

    @ObfuscatedName("km.aw()V")
    public void method4660() {
        for (int var1 = 0; var1 < this.field2725; var1++) {
            this.field2705[var1] = -this.field2705[var1];
            this.field2714[var1] = -this.field2714[var1];
        }
        this.method4717();
    }

    @ObfuscatedName("km.az()V")
    public void method4661() {
        for (int var1 = 0; var1 < this.field2725; var1++) {
            int var2 = this.field2714[var1];
            this.field2714[var1] = this.field2705[var1];
            this.field2705[var1] = -var2;
        }
        this.method4717();
    }

    @ObfuscatedName("km.av(I)V")
    public void method4662(int arg0) {
        int var2 = field2744[arg0];
        int var3 = field2745[arg0];
        for (int var4 = 0; var4 < this.field2725; var4++) {
            int var5 = this.field2714[var4] * var2 + this.field2705[var4] * var3 >> 16;
            this.field2714[var4] = this.field2714[var4] * var3 - this.field2705[var4] * var2 >> 16;
            this.field2705[var4] = var5;
        }
        this.method4717();
    }

    @ObfuscatedName("km.ak(III)V")
    public void method4730(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2725; var4++) {
            this.field2705[var4] += arg0;
            this.field2706[var4] += arg1;
            this.field2714[var4] += arg2;
        }
        this.method4717();
    }

    @ObfuscatedName("km.ay(SS)V")
    public void method4664(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2708; var3++) {
            if (this.field2717[var3] == arg0) {
                this.field2717[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("km.as(SS)V")
    public void method4665(short arg0, short arg1) {
        if (this.field2701 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field2708; var3++) {
            if (this.field2701[var3] == arg0) {
                this.field2701[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("km.ab()V")
    public void method4704() {
        for (int var1 = 0; var1 < this.field2725; var1++) {
            this.field2714[var1] = -this.field2714[var1];
        }
        for (int var2 = 0; var2 < this.field2708; var2++) {
            int var3 = this.field2709[var2];
            this.field2709[var2] = this.field2711[var2];
            this.field2711[var2] = var3;
        }
        this.method4717();
    }

    @ObfuscatedName("km.ah(III)V")
    public void method4667(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2725; var4++) {
            this.field2705[var4] = this.field2705[var4] * arg0 / 128;
            this.field2706[var4] = this.field2706[var4] * arg1 / 128;
            this.field2714[var4] = this.field2714[var4] * arg2 / 128;
        }
        this.method4717();
    }

    @ObfuscatedName("km.ai()V")
    public void method4668() {
        if (this.field2731 != null) {
            return;
        }
        this.field2731 = new class285[this.field2725];
        for (int var1 = 0; var1 < this.field2725; var1++) {
            this.field2731[var1] = new class285();
        }
        for (int var2 = 0; var2 < this.field2708; var2++) {
            int var3 = this.field2709[var2];
            int var4 = this.field2710[var2];
            int var5 = this.field2711[var2];
            int var6 = this.field2705[var4] - this.field2705[var3];
            int var7 = this.field2706[var4] - this.field2706[var3];
            int var8 = this.field2714[var4] - this.field2714[var3];
            int var9 = this.field2705[var5] - this.field2705[var3];
            int var10 = this.field2706[var5] - this.field2706[var3];
            int var11 = this.field2714[var5] - this.field2714[var3];
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
            if (this.field2728 == null) {
                var19 = 0;
            } else {
                var19 = this.field2728[var2];
            }
            if (var19 == 0) {
                class285 var20 = this.field2731[var3];
                var20.field3069 += var16;
                var20.field3066 += var17;
                var20.field3065 += var18;
                var20.field3068++;
                class285 var21 = this.field2731[var4];
                var21.field3069 += var16;
                var21.field3066 += var17;
                var21.field3065 += var18;
                var21.field3068++;
                class285 var22 = this.field2731[var5];
                var22.field3069 += var16;
                var22.field3066 += var17;
                var22.field3065 += var18;
                var22.field3068++;
            } else if (var19 == 1) {
                if (this.field2730 == null) {
                    this.field2730 = new class277[this.field2708];
                }
                class277 var23 = this.field2730[var2] = new class277();
                var23.field2913 = var16;
                var23.field2912 = var17;
                var23.field2914 = var18;
            }
        }
    }

    @ObfuscatedName("km.ac()V")
    public void method4717() {
        this.field2731 = null;
        this.field2732 = null;
        this.field2730 = null;
        this.field2718 = false;
    }

    @ObfuscatedName("km.al()V")
    public void method4711() {
        if (this.field2718) {
            return;
        }
        this.field2910 = 0;
        this.field2736 = 0;
        this.field2716 = 999999;
        this.field2738 = -999999;
        this.field2739 = -99999;
        this.field2740 = 99999;
        for (int var1 = 0; var1 < this.field2725; var1++) {
            int var2 = this.field2705[var1];
            int var3 = this.field2706[var1];
            int var4 = this.field2714[var1];
            if (var2 < this.field2716) {
                this.field2716 = var2;
            }
            if (var2 > this.field2738) {
                this.field2738 = var2;
            }
            if (var4 < this.field2740) {
                this.field2740 = var4;
            }
            if (var4 > this.field2739) {
                this.field2739 = var4;
            }
            if (-var3 > this.field2910) {
                this.field2910 = -var3;
            }
            if (var3 > this.field2736) {
                this.field2736 = var3;
            }
        }
        this.field2718 = true;
    }

    @ObfuscatedName("km.at(Lkm;Lkm;IIIZ)V")
    public static void method4671(class265 arg0, class265 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method4711();
        arg0.method4668();
        arg1.method4711();
        arg1.method4668();
        field2723++;
        int var6 = 0;
        int[] var7 = arg1.field2705;
        int var8 = arg1.field2725;
        for (int var9 = 0; var9 < arg0.field2725; var9++) {
            class285 var10 = arg0.field2731[var9];
            if (var10.field3068 != 0) {
                int var11 = arg0.field2706[var9] - arg3;
                if (var11 <= arg1.field2736) {
                    int var12 = arg0.field2705[var9] - arg2;
                    if (var12 >= arg1.field2716 && var12 <= arg1.field2738) {
                        int var13 = arg0.field2714[var9] - arg4;
                        if (var13 >= arg1.field2740 && var13 <= arg1.field2739) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class285 var15 = arg1.field2731[var14];
                                if (var7[var14] == var12 && arg1.field2714[var14] == var13 && arg1.field2706[var14] == var11 && var15.field3068 != 0) {
                                    if (arg0.field2732 == null) {
                                        arg0.field2732 = new class285[arg0.field2725];
                                    }
                                    if (arg1.field2732 == null) {
                                        arg1.field2732 = new class285[var8];
                                    }
                                    class285 var16 = arg0.field2732[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field2732[var9] = new class285(var10);
                                    }
                                    class285 var17 = arg1.field2732[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field2732[var14] = new class285(var15);
                                    }
                                    var16.field3069 += var15.field3069;
                                    var16.field3066 += var15.field3066;
                                    var16.field3065 += var15.field3065;
                                    var16.field3068 += var15.field3068;
                                    var17.field3069 += var10.field3069;
                                    var17.field3066 += var10.field3066;
                                    var17.field3065 += var10.field3065;
                                    var17.field3068 += var10.field3068;
                                    var6++;
                                    field2712[var9] = field2723;
                                    field2721[var14] = field2723;
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
        for (int var18 = 0; var18 < arg0.field2708; var18++) {
            if (field2712[arg0.field2709[var18]] == field2723 && field2712[arg0.field2710[var18]] == field2723 && field2712[arg0.field2711[var18]] == field2723) {
                if (arg0.field2728 == null) {
                    arg0.field2728 = new byte[arg0.field2708];
                }
                arg0.field2728[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field2708; var19++) {
            if (field2721[arg1.field2709[var19]] == field2723 && field2721[arg1.field2710[var19]] == field2723 && field2721[arg1.field2711[var19]] == field2723) {
                if (arg1.field2728 == null) {
                    arg1.field2728 = new byte[arg1.field2708];
                }
                arg1.field2728[var19] = 2;
            }
        }
    }

    @ObfuscatedName("km.bj(IIIII)Lko;")
    public final class283 method4672(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method4668();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class283 var8 = new class283();
        var8.field2987 = new int[this.field2708];
        var8.field2991 = new int[this.field2708];
        var8.field2989 = new int[this.field2708];
        if (this.field2719 > 0 && this.field2715 != null) {
            int[] var9 = new int[this.field2719];
            for (int var10 = 0; var10 < this.field2708; var10++) {
                if (this.field2715[var10] != -1) {
                    var9[this.field2715[var10] & 0xFF]++;
                }
            }
            var8.field3044 = 0;
            for (int var11 = 0; var11 < this.field2719; var11++) {
                if (var9[var11] > 0 && this.field2720[var11] == 0) {
                    var8.field3044++;
                }
            }
            var8.field3040 = new int[var8.field3044];
            var8.field2997 = new int[var8.field3044];
            var8.field2998 = new int[var8.field3044];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field2719; var13++) {
                if (var9[var13] > 0 && this.field2720[var13] == 0) {
                    var8.field3040[var12] = this.field2741[var13] & 0xFFFF;
                    var8.field2997[var12] = this.field2722[var13] & 0xFFFF;
                    var8.field2998[var12] = this.field2735[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field2992 = new byte[this.field2708];
            for (int var14 = 0; var14 < this.field2708; var14++) {
                if (this.field2715[var14] == -1) {
                    var8.field2992[var14] = -1;
                } else {
                    var8.field2992[var14] = (byte) var9[this.field2715[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field2708; var15++) {
            byte var16;
            if (this.field2728 == null) {
                var16 = 0;
            } else {
                var16 = this.field2728[var15];
            }
            byte var17;
            if (this.field2724 == null) {
                var17 = 0;
            } else {
                var17 = this.field2724[var15];
            }
            short var18;
            if (this.field2701 == null) {
                var18 = -1;
            } else {
                var18 = this.field2701[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field2717[var15] & 0xFFFF;
                    class285 var20;
                    if (this.field2732 == null || this.field2732[this.field2709[var15]] == null) {
                        var20 = this.field2731[this.field2709[var15]];
                    } else {
                        var20 = this.field2732[this.field2709[var15]];
                    }
                    int var21 = (var20.field3065 * arg4 + var20.field3069 * arg2 + var20.field3066 * arg3) / (var20.field3068 * var7) + arg0;
                    var8.field2987[var15] = method4673(var19, var21);
                    class285 var22;
                    if (this.field2732 == null || this.field2732[this.field2710[var15]] == null) {
                        var22 = this.field2731[this.field2710[var15]];
                    } else {
                        var22 = this.field2732[this.field2710[var15]];
                    }
                    int var23 = (var22.field3065 * arg4 + var22.field3069 * arg2 + var22.field3066 * arg3) / (var22.field3068 * var7) + arg0;
                    var8.field2991[var15] = method4673(var19, var23);
                    class285 var24;
                    if (this.field2732 == null || this.field2732[this.field2711[var15]] == null) {
                        var24 = this.field2731[this.field2711[var15]];
                    } else {
                        var24 = this.field2732[this.field2711[var15]];
                    }
                    int var25 = (var24.field3065 * arg4 + var24.field3069 * arg2 + var24.field3066 * arg3) / (var24.field3068 * var7) + arg0;
                    var8.field2989[var15] = method4673(var19, var25);
                } else if (var16 == 1) {
                    class277 var26 = this.field2730[var15];
                    int var27 = (var26.field2914 * arg4 + var26.field2913 * arg2 + var26.field2912 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field2987[var15] = method4673(this.field2717[var15] & 0xFFFF, var27);
                    var8.field2989[var15] = -1;
                } else if (var16 == 3) {
                    var8.field2987[var15] = 128;
                    var8.field2989[var15] = -1;
                } else {
                    var8.field2989[var15] = -2;
                }
            } else if (var16 == 0) {
                class285 var28;
                if (this.field2732 == null || this.field2732[this.field2709[var15]] == null) {
                    var28 = this.field2731[this.field2709[var15]];
                } else {
                    var28 = this.field2732[this.field2709[var15]];
                }
                int var29 = (var28.field3065 * arg4 + var28.field3069 * arg2 + var28.field3066 * arg3) / (var28.field3068 * var7) + arg0;
                var8.field2987[var15] = method4674(var29);
                class285 var30;
                if (this.field2732 == null || this.field2732[this.field2710[var15]] == null) {
                    var30 = this.field2731[this.field2710[var15]];
                } else {
                    var30 = this.field2732[this.field2710[var15]];
                }
                int var31 = (var30.field3065 * arg4 + var30.field3069 * arg2 + var30.field3066 * arg3) / (var30.field3068 * var7) + arg0;
                var8.field2991[var15] = method4674(var31);
                class285 var32;
                if (this.field2732 == null || this.field2732[this.field2711[var15]] == null) {
                    var32 = this.field2731[this.field2711[var15]];
                } else {
                    var32 = this.field2732[this.field2711[var15]];
                }
                int var33 = (var32.field3065 * arg4 + var32.field3069 * arg2 + var32.field3066 * arg3) / (var32.field3068 * var7) + arg0;
                var8.field2989[var15] = method4674(var33);
            } else if (var16 == 1) {
                class277 var34 = this.field2730[var15];
                int var35 = (var34.field2914 * arg4 + var34.field2913 * arg2 + var34.field2912 * arg3) / (var7 / 2 + var7) + arg0;
                var8.field2987[var15] = method4674(var35);
                var8.field2989[var15] = -1;
            } else {
                var8.field2989[var15] = -2;
            }
        }
        this.method4658();
        var8.field2979 = this.field2725;
        var8.field2984 = this.field2705;
        var8.field2981 = this.field2706;
        var8.field2982 = this.field2714;
        var8.field2983 = this.field2708;
        var8.field3022 = this.field2709;
        var8.field2985 = this.field2710;
        var8.field2986 = this.field2711;
        var8.field3024 = this.field2713;
        var8.field2975 = this.field2724;
        var8.field2994 = this.field2737;
        var8.field2999 = this.field2726;
        var8.field3000 = this.field2727;
        var8.field3018 = this.field2701;
        var8.field3001 = this.field2704;
        var8.field3002 = this.field2729;
        return var8;
    }

    @ObfuscatedName("km.bd(II)I")
    public static final int method4673(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("km.bg(I)I")
    public static final int method4674(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
