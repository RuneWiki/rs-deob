package deob;

@ObfuscatedName("kq")
public class class262 extends class273 {

    @ObfuscatedName("kq.ao")
    public int field2666 = 0;

    @ObfuscatedName("kq.ab")
    public int[] field2667;

    @ObfuscatedName("kq.au")
    public int[] field2668;

    @ObfuscatedName("kq.aa")
    public int[] field2669;

    @ObfuscatedName("kq.ac")
    public int field2670 = 0;

    @ObfuscatedName("kq.al")
    public int[] field2671;

    @ObfuscatedName("kq.az")
    public int[] field2681;

    @ObfuscatedName("kq.ap")
    public int[] field2673;

    @ObfuscatedName("kq.av")
    public byte[] field2699;

    @ObfuscatedName("kq.ax")
    public byte[] field2697;

    @ObfuscatedName("kq.as")
    public byte[] field2676;

    @ObfuscatedName("kq.ay")
    public byte[] field2680;

    @ObfuscatedName("kq.ak")
    public short[] field2678;

    @ObfuscatedName("kq.aj")
    public short[] field2663;

    @ObfuscatedName("kq.am")
    public byte field2683 = 0;

    @ObfuscatedName("kq.aq")
    public int field2694;

    @ObfuscatedName("kq.ai")
    public byte[] field2682;

    @ObfuscatedName("kq.aw")
    public short[] field2693;

    @ObfuscatedName("kq.ae")
    public short[] field2684;

    @ObfuscatedName("kq.an")
    public short[] field2677;

    @ObfuscatedName("kq.ag")
    public int[] field2686;

    @ObfuscatedName("kq.ad")
    public int[] field2687;

    @ObfuscatedName("kq.af")
    public int[][] field2688;

    @ObfuscatedName("kq.be")
    public int[][] field2689;

    @ObfuscatedName("kq.bd")
    public int[][] field2672;

    @ObfuscatedName("kq.bl")
    public int[][] field2691;

    @ObfuscatedName("kq.bi")
    public class274[] field2692;

    @ObfuscatedName("kq.bv")
    public class282[] field2700;

    @ObfuscatedName("kq.bf")
    public class282[] field2707;

    @ObfuscatedName("kq.bg")
    public short field2690;

    @ObfuscatedName("kq.ba")
    public short field2696;

    @ObfuscatedName("kq.bm")
    public boolean field2679 = false;

    @ObfuscatedName("kq.bp")
    public int field2698;

    @ObfuscatedName("kq.bw")
    public int field2701;

    @ObfuscatedName("kq.bj")
    public int field2674;

    @ObfuscatedName("kq.bn")
    public int field2685;

    @ObfuscatedName("kq.bo")
    public int field2702;

    @ObfuscatedName("kq.bt")
    public static int[] field2703 = new int[10000];

    @ObfuscatedName("kq.bu")
    public static int[] field2704 = new int[10000];

    @ObfuscatedName("kq.by")
    public static int field2705 = 0;

    @ObfuscatedName("kq.bh")
    public static int[] field2706 = class267.field2771;

    @ObfuscatedName("kq.bz")
    public static int[] field2675 = class267.field2769;

    public class262() {
    }

    @ObfuscatedName("kq.at(Lol;II)Lkq;")
    public static class262 method4571(class371 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method6284(arg1, arg2);
        return var3 == null ? null : new class262(var3);
    }

    public class262(byte[] arg0) {
        class527 var2 = new class527(10);
        var2.method8394(-2);
        if (arg0[arg0.length - 1] == -3 && arg0[arg0.length - 2] == -1) {
            this.method4606(arg0);
        } else if (arg0[arg0.length - 1] == -2 && arg0[arg0.length - 2] == -1) {
            this.method4574(arg0);
        } else if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method4587(arg0);
        } else {
            this.method4576(arg0);
        }
    }

    @ObfuscatedName("kq.ar([B)V")
    public void method4606(byte[] arg0) {
        class527 var2 = new class527(arg0);
        class527 var3 = new class527(arg0);
        class527 var4 = new class527(arg0);
        class527 var5 = new class527(arg0);
        class527 var6 = new class527(arg0);
        class527 var7 = new class527(arg0);
        class527 var8 = new class527(arg0);
        var2.field5137 = arg0.length - 26;
        int var9 = var2.method8412();
        int var10 = var2.method8412();
        int var11 = var2.method8410();
        int var12 = var2.method8410();
        int var13 = var2.method8410();
        int var14 = var2.method8410();
        int var15 = var2.method8410();
        int var16 = var2.method8410();
        int var17 = var2.method8410();
        int var18 = var2.method8410();
        int var19 = var2.method8412();
        int var20 = var2.method8412();
        int var21 = var2.method8412();
        int var22 = var2.method8412();
        int var23 = var2.method8412();
        int var24 = var2.method8412();
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        if (var11 > 0) {
            this.field2682 = new byte[var11];
            var2.field5137 = 0;
            for (int var28 = 0; var28 < var11; var28++) {
                byte var29 = this.field2682[var28] = var2.method8616();
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
        this.field2666 = var9;
        this.field2670 = var10;
        this.field2694 = var11;
        this.field2667 = new int[var9];
        this.field2668 = new int[var9];
        this.field2669 = new int[var9];
        this.field2671 = new int[var10];
        this.field2681 = new int[var10];
        this.field2673 = new int[var10];
        if (var17 == 1) {
            this.field2686 = new int[var9];
        }
        if (var12 == 1) {
            this.field2699 = new byte[var10];
        }
        if (var13 == 255) {
            this.field2697 = new byte[var10];
        } else {
            this.field2683 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2676 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2687 = new int[var10];
        }
        if (var16 == 1) {
            this.field2663 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field2680 = new byte[var10];
        }
        if (var18 == 1) {
            this.field2672 = new int[var9][];
            this.field2691 = new int[var9][];
        }
        this.field2678 = new short[var10];
        if (var11 > 0) {
            this.field2693 = new short[var11];
            this.field2684 = new short[var11];
            this.field2677 = new short[var11];
        }
        var2.field5137 = var11;
        var3.field5137 = var47;
        var4.field5137 = var49;
        var5.field5137 = var51;
        var6.field5137 = var35;
        int var67 = 0;
        int var68 = 0;
        int var69 = 0;
        for (int var70 = 0; var70 < var9; var70++) {
            int var71 = var2.method8410();
            int var72 = 0;
            if ((var71 & 0x1) != 0) {
                var72 = var3.method8675();
            }
            int var73 = 0;
            if ((var71 & 0x2) != 0) {
                var73 = var4.method8675();
            }
            int var74 = 0;
            if ((var71 & 0x4) != 0) {
                var74 = var5.method8675();
            }
            this.field2667[var70] = var67 + var72;
            this.field2668[var70] = var68 + var73;
            this.field2669[var70] = var69 + var74;
            var67 = this.field2667[var70];
            var68 = this.field2668[var70];
            var69 = this.field2669[var70];
            if (var17 == 1) {
                this.field2686[var70] = var6.method8410();
            }
        }
        if (var18 == 1) {
            for (int var75 = 0; var75 < var9; var75++) {
                int var76 = var6.method8410();
                this.field2672[var75] = new int[var76];
                this.field2691[var75] = new int[var76];
                for (int var77 = 0; var77 < var76; var77++) {
                    this.field2672[var75][var77] = var6.method8410();
                    this.field2691[var75][var77] = var6.method8410();
                }
            }
        }
        var2.field5137 = var45;
        var3.field5137 = var33;
        var4.field5137 = var36;
        var5.field5137 = var40;
        var6.field5137 = var37;
        var7.field5137 = var43;
        var8.field5137 = var42;
        for (int var78 = 0; var78 < var10; var78++) {
            this.field2678[var78] = (short) var2.method8412();
            if (var12 == 1) {
                this.field2699[var78] = var3.method8616();
            }
            if (var13 == 255) {
                this.field2697[var78] = var4.method8616();
            }
            if (var14 == 1) {
                this.field2676[var78] = var5.method8616();
            }
            if (var15 == 1) {
                this.field2687[var78] = var6.method8410();
            }
            if (var16 == 1) {
                this.field2663[var78] = (short) (var7.method8412() - 1);
            }
            if (this.field2680 != null && this.field2663[var78] != -1) {
                this.field2680[var78] = (byte) (var8.method8410() - 1);
            }
        }
        var2.field5137 = var39;
        var3.field5137 = var32;
        int var79 = 0;
        int var80 = 0;
        int var81 = 0;
        int var82 = 0;
        for (int var83 = 0; var83 < var10; var83++) {
            int var84 = var3.method8410();
            if (var84 == 1) {
                var79 = var2.method8675() + var82;
                var80 = var2.method8675() + var79;
                var81 = var2.method8675() + var80;
                var82 = var81;
                this.field2671[var83] = var79;
                this.field2681[var83] = var80;
                this.field2673[var83] = var81;
            }
            if (var84 == 2) {
                var80 = var81;
                var81 = var2.method8675() + var82;
                var82 = var81;
                this.field2671[var83] = var79;
                this.field2681[var83] = var80;
                this.field2673[var83] = var81;
            }
            if (var84 == 3) {
                var79 = var81;
                var81 = var2.method8675() + var82;
                var82 = var81;
                this.field2671[var83] = var79;
                this.field2681[var83] = var80;
                this.field2673[var83] = var81;
            }
            if (var84 == 4) {
                int var87 = var79;
                var79 = var80;
                var80 = var87;
                var81 = var2.method8675() + var82;
                var82 = var81;
                this.field2671[var83] = var79;
                this.field2681[var83] = var87;
                this.field2673[var83] = var81;
            }
        }
        var2.field5137 = var53;
        var3.field5137 = var55;
        var4.field5137 = var57;
        var5.field5137 = var59;
        var6.field5137 = var61;
        var7.field5137 = var63;
        for (int var88 = 0; var88 < var11; var88++) {
            int var89 = this.field2682[var88] & 0xFF;
            if (var89 == 0) {
                this.field2693[var88] = (short) var2.method8412();
                this.field2684[var88] = (short) var2.method8412();
                this.field2677[var88] = (short) var2.method8412();
            }
        }
        var2.field5137 = var65;
        int var90 = var2.method8410();
        if (var90 == 0) {
            return;
        }
        new class287();
        var2.method8412();
        var2.method8412();
        var2.method8412();
        var2.method8416();
    }

    @ObfuscatedName("kq.ao([B)V")
    public void method4574(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class527 var4 = new class527(arg0);
        class527 var5 = new class527(arg0);
        class527 var6 = new class527(arg0);
        class527 var7 = new class527(arg0);
        class527 var8 = new class527(arg0);
        var4.field5137 = arg0.length - 23;
        int var9 = var4.method8412();
        int var10 = var4.method8412();
        int var11 = var4.method8410();
        int var12 = var4.method8410();
        int var13 = var4.method8410();
        int var14 = var4.method8410();
        int var15 = var4.method8410();
        int var16 = var4.method8410();
        int var17 = var4.method8410();
        int var18 = var4.method8412();
        int var19 = var4.method8412();
        int var20 = var4.method8412();
        int var21 = var4.method8412();
        int var22 = var4.method8412();
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
        this.field2666 = var9;
        this.field2670 = var10;
        this.field2694 = var11;
        this.field2667 = new int[var9];
        this.field2668 = new int[var9];
        this.field2669 = new int[var9];
        this.field2671 = new int[var10];
        this.field2681 = new int[var10];
        this.field2673 = new int[var10];
        if (var11 > 0) {
            this.field2682 = new byte[var11];
            this.field2693 = new short[var11];
            this.field2684 = new short[var11];
            this.field2677 = new short[var11];
        }
        if (var16 == 1) {
            this.field2686 = new int[var9];
        }
        if (var12 == 1) {
            this.field2699 = new byte[var10];
            this.field2680 = new byte[var10];
            this.field2663 = new short[var10];
        }
        if (var13 == 255) {
            this.field2697 = new byte[var10];
        } else {
            this.field2683 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2676 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2687 = new int[var10];
        }
        if (var17 == 1) {
            this.field2672 = new int[var9][];
            this.field2691 = new int[var9][];
        }
        this.field2678 = new short[var10];
        var4.field5137 = var23;
        var5.field5137 = var39;
        var6.field5137 = var41;
        var7.field5137 = var43;
        var8.field5137 = var27;
        int var46 = 0;
        int var47 = 0;
        int var48 = 0;
        for (int var49 = 0; var49 < var9; var49++) {
            int var50 = var4.method8410();
            int var51 = 0;
            if ((var50 & 0x1) != 0) {
                var51 = var5.method8675();
            }
            int var52 = 0;
            if ((var50 & 0x2) != 0) {
                var52 = var6.method8675();
            }
            int var53 = 0;
            if ((var50 & 0x4) != 0) {
                var53 = var7.method8675();
            }
            this.field2667[var49] = var46 + var51;
            this.field2668[var49] = var47 + var52;
            this.field2669[var49] = var48 + var53;
            var46 = this.field2667[var49];
            var47 = this.field2668[var49];
            var48 = this.field2669[var49];
            if (var16 == 1) {
                this.field2686[var49] = var8.method8410();
            }
        }
        if (var17 == 1) {
            for (int var54 = 0; var54 < var9; var54++) {
                int var55 = var8.method8410();
                this.field2672[var54] = new int[var55];
                this.field2691[var54] = new int[var55];
                for (int var56 = 0; var56 < var55; var56++) {
                    this.field2672[var54][var56] = var8.method8410();
                    this.field2691[var54][var56] = var8.method8410();
                }
            }
        }
        var4.field5137 = var35;
        var5.field5137 = var30;
        var6.field5137 = var28;
        var7.field5137 = var33;
        var8.field5137 = var29;
        for (int var57 = 0; var57 < var10; var57++) {
            this.field2678[var57] = (short) var4.method8412();
            if (var12 == 1) {
                int var58 = var5.method8410();
                if ((var58 & 0x1) == 1) {
                    this.field2699[var57] = 1;
                    var2 = true;
                } else {
                    this.field2699[var57] = 0;
                }
                if ((var58 & 0x2) == 2) {
                    this.field2680[var57] = (byte) (var58 >> 2);
                    this.field2663[var57] = this.field2678[var57];
                    this.field2678[var57] = 127;
                    if (this.field2663[var57] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field2680[var57] = -1;
                    this.field2663[var57] = -1;
                }
            }
            if (var13 == 255) {
                this.field2697[var57] = var6.method8616();
            }
            if (var14 == 1) {
                this.field2676[var57] = var7.method8616();
            }
            if (var15 == 1) {
                this.field2687[var57] = var8.method8410();
            }
        }
        var4.field5137 = var32;
        var5.field5137 = var25;
        int var59 = 0;
        int var60 = 0;
        int var61 = 0;
        int var62 = 0;
        for (int var63 = 0; var63 < var10; var63++) {
            int var64 = var5.method8410();
            if (var64 == 1) {
                var59 = var4.method8675() + var62;
                var60 = var4.method8675() + var59;
                var61 = var4.method8675() + var60;
                var62 = var61;
                this.field2671[var63] = var59;
                this.field2681[var63] = var60;
                this.field2673[var63] = var61;
            }
            if (var64 == 2) {
                var60 = var61;
                var61 = var4.method8675() + var62;
                var62 = var61;
                this.field2671[var63] = var59;
                this.field2681[var63] = var60;
                this.field2673[var63] = var61;
            }
            if (var64 == 3) {
                var59 = var61;
                var61 = var4.method8675() + var62;
                var62 = var61;
                this.field2671[var63] = var59;
                this.field2681[var63] = var60;
                this.field2673[var63] = var61;
            }
            if (var64 == 4) {
                int var67 = var59;
                var59 = var60;
                var60 = var67;
                var61 = var4.method8675() + var62;
                var62 = var61;
                this.field2671[var63] = var59;
                this.field2681[var63] = var67;
                this.field2673[var63] = var61;
            }
        }
        var4.field5137 = var37;
        for (int var68 = 0; var68 < var11; var68++) {
            this.field2682[var68] = 0;
            this.field2693[var68] = (short) var4.method8412();
            this.field2684[var68] = (short) var4.method8412();
            this.field2677[var68] = (short) var4.method8412();
        }
        if (this.field2680 != null) {
            boolean var69 = false;
            for (int var70 = 0; var70 < var10; var70++) {
                int var71 = this.field2680[var70] & 0xFF;
                if (var71 != 255) {
                    if ((this.field2693[var71] & 0xFFFF) == this.field2671[var70] && (this.field2684[var71] & 0xFFFF) == this.field2681[var70] && (this.field2677[var71] & 0xFFFF) == this.field2673[var70]) {
                        this.field2680[var70] = -1;
                    } else {
                        var69 = true;
                    }
                }
            }
            if (!var69) {
                this.field2680 = null;
            }
        }
        if (!var3) {
            this.field2663 = null;
        }
        if (!var2) {
            this.field2699 = null;
        }
    }

    @ObfuscatedName("kq.ab([B)V")
    public void method4587(byte[] arg0) {
        class527 var2 = new class527(arg0);
        class527 var3 = new class527(arg0);
        class527 var4 = new class527(arg0);
        class527 var5 = new class527(arg0);
        class527 var6 = new class527(arg0);
        class527 var7 = new class527(arg0);
        class527 var8 = new class527(arg0);
        var2.field5137 = arg0.length - 23;
        int var9 = var2.method8412();
        int var10 = var2.method8412();
        int var11 = var2.method8410();
        int var12 = var2.method8410();
        int var13 = var2.method8410();
        int var14 = var2.method8410();
        int var15 = var2.method8410();
        int var16 = var2.method8410();
        int var17 = var2.method8410();
        int var18 = var2.method8412();
        int var19 = var2.method8412();
        int var20 = var2.method8412();
        int var21 = var2.method8412();
        int var22 = var2.method8412();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field2682 = new byte[var11];
            var2.field5137 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field2682[var26] = var2.method8616();
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
        this.field2666 = var9;
        this.field2670 = var10;
        this.field2694 = var11;
        this.field2667 = new int[var9];
        this.field2668 = new int[var9];
        this.field2669 = new int[var9];
        this.field2671 = new int[var10];
        this.field2681 = new int[var10];
        this.field2673 = new int[var10];
        if (var17 == 1) {
            this.field2686 = new int[var9];
        }
        if (var12 == 1) {
            this.field2699 = new byte[var10];
        }
        if (var13 == 255) {
            this.field2697 = new byte[var10];
        } else {
            this.field2683 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2676 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2687 = new int[var10];
        }
        if (var16 == 1) {
            this.field2663 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field2680 = new byte[var10];
        }
        this.field2678 = new short[var10];
        if (var11 > 0) {
            this.field2693 = new short[var11];
            this.field2684 = new short[var11];
            this.field2677 = new short[var11];
        }
        var2.field5137 = var11;
        var3.field5137 = var44;
        var4.field5137 = var46;
        var5.field5137 = var48;
        var6.field5137 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method8410();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method8675();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method8675();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method8675();
            }
            this.field2667[var67] = var64 + var69;
            this.field2668[var67] = var65 + var70;
            this.field2669[var67] = var66 + var71;
            var64 = this.field2667[var67];
            var65 = this.field2668[var67];
            var66 = this.field2669[var67];
            if (var17 == 1) {
                this.field2686[var67] = var6.method8410();
            }
        }
        var2.field5137 = var42;
        var3.field5137 = var31;
        var4.field5137 = var34;
        var5.field5137 = var37;
        var6.field5137 = var35;
        var7.field5137 = var40;
        var8.field5137 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field2678[var72] = (short) var2.method8412();
            if (var12 == 1) {
                this.field2699[var72] = var3.method8616();
            }
            if (var13 == 255) {
                this.field2697[var72] = var4.method8616();
            }
            if (var14 == 1) {
                this.field2676[var72] = var5.method8616();
            }
            if (var15 == 1) {
                this.field2687[var72] = var6.method8410();
            }
            if (var16 == 1) {
                this.field2663[var72] = (short) (var7.method8412() - 1);
            }
            if (this.field2680 != null && this.field2663[var72] != -1) {
                this.field2680[var72] = (byte) (var8.method8410() - 1);
            }
        }
        var2.field5137 = var33;
        var3.field5137 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method8410();
            if (var78 == 1) {
                var73 = var2.method8675() + var76;
                var74 = var2.method8675() + var73;
                var75 = var2.method8675() + var74;
                var76 = var75;
                this.field2671[var77] = var73;
                this.field2681[var77] = var74;
                this.field2673[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method8675() + var76;
                var76 = var75;
                this.field2671[var77] = var73;
                this.field2681[var77] = var74;
                this.field2673[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method8675() + var76;
                var76 = var75;
                this.field2671[var77] = var73;
                this.field2681[var77] = var74;
                this.field2673[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method8675() + var76;
                var76 = var75;
                this.field2671[var77] = var73;
                this.field2681[var77] = var81;
                this.field2673[var77] = var75;
            }
        }
        var2.field5137 = var50;
        var3.field5137 = var52;
        var4.field5137 = var54;
        var5.field5137 = var56;
        var6.field5137 = var58;
        var7.field5137 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field2682[var82] & 0xFF;
            if (var83 == 0) {
                this.field2693[var82] = (short) var2.method8412();
                this.field2684[var82] = (short) var2.method8412();
                this.field2677[var82] = (short) var2.method8412();
            }
        }
        var2.field5137 = var62;
        int var84 = var2.method8410();
        if (var84 == 0) {
            return;
        }
        new class287();
        var2.method8412();
        var2.method8412();
        var2.method8412();
        var2.method8416();
    }

    @ObfuscatedName("kq.az([B)V")
    public void method4576(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class527 var4 = new class527(arg0);
        class527 var5 = new class527(arg0);
        class527 var6 = new class527(arg0);
        class527 var7 = new class527(arg0);
        class527 var8 = new class527(arg0);
        var4.field5137 = arg0.length - 18;
        int var9 = var4.method8412();
        int var10 = var4.method8412();
        int var11 = var4.method8410();
        int var12 = var4.method8410();
        int var13 = var4.method8410();
        int var14 = var4.method8410();
        int var15 = var4.method8410();
        int var16 = var4.method8410();
        int var17 = var4.method8412();
        int var18 = var4.method8412();
        int var19 = var4.method8412();
        int var20 = var4.method8412();
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
        this.field2666 = var9;
        this.field2670 = var10;
        this.field2694 = var11;
        this.field2667 = new int[var9];
        this.field2668 = new int[var9];
        this.field2669 = new int[var9];
        this.field2671 = new int[var10];
        this.field2681 = new int[var10];
        this.field2673 = new int[var10];
        if (var11 > 0) {
            this.field2682 = new byte[var11];
            this.field2693 = new short[var11];
            this.field2684 = new short[var11];
            this.field2677 = new short[var11];
        }
        if (var16 == 1) {
            this.field2686 = new int[var9];
        }
        if (var12 == 1) {
            this.field2699 = new byte[var10];
            this.field2680 = new byte[var10];
            this.field2663 = new short[var10];
        }
        if (var13 == 255) {
            this.field2697 = new byte[var10];
        } else {
            this.field2683 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2676 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2687 = new int[var10];
        }
        this.field2678 = new short[var10];
        var4.field5137 = var21;
        var5.field5137 = var36;
        var6.field5137 = var38;
        var7.field5137 = var40;
        var8.field5137 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method8410();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method8675();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method8675();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method8675();
            }
            this.field2667[var46] = var43 + var48;
            this.field2668[var46] = var44 + var49;
            this.field2669[var46] = var45 + var50;
            var43 = this.field2667[var46];
            var44 = this.field2668[var46];
            var45 = this.field2669[var46];
            if (var16 == 1) {
                this.field2686[var46] = var8.method8410();
            }
        }
        var4.field5137 = var32;
        var5.field5137 = var28;
        var6.field5137 = var26;
        var7.field5137 = var30;
        var8.field5137 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field2678[var51] = (short) var4.method8412();
            if (var12 == 1) {
                int var52 = var5.method8410();
                if ((var52 & 0x1) == 1) {
                    this.field2699[var51] = 1;
                    var2 = true;
                } else {
                    this.field2699[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field2680[var51] = (byte) (var52 >> 2);
                    this.field2663[var51] = this.field2678[var51];
                    this.field2678[var51] = 127;
                    if (this.field2663[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field2680[var51] = -1;
                    this.field2663[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field2697[var51] = var6.method8616();
            }
            if (var14 == 1) {
                this.field2676[var51] = var7.method8616();
            }
            if (var15 == 1) {
                this.field2687[var51] = var8.method8410();
            }
        }
        var4.field5137 = var25;
        var5.field5137 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method8410();
            if (var58 == 1) {
                var53 = var4.method8675() + var56;
                var54 = var4.method8675() + var53;
                var55 = var4.method8675() + var54;
                var56 = var55;
                this.field2671[var57] = var53;
                this.field2681[var57] = var54;
                this.field2673[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method8675() + var56;
                var56 = var55;
                this.field2671[var57] = var53;
                this.field2681[var57] = var54;
                this.field2673[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method8675() + var56;
                var56 = var55;
                this.field2671[var57] = var53;
                this.field2681[var57] = var54;
                this.field2673[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method8675() + var56;
                var56 = var55;
                this.field2671[var57] = var53;
                this.field2681[var57] = var61;
                this.field2673[var57] = var55;
            }
        }
        var4.field5137 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field2682[var62] = 0;
            this.field2693[var62] = (short) var4.method8412();
            this.field2684[var62] = (short) var4.method8412();
            this.field2677[var62] = (short) var4.method8412();
        }
        if (this.field2680 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field2680[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field2693[var65] & 0xFFFF) == this.field2671[var64] && (this.field2684[var65] & 0xFFFF) == this.field2681[var64] && (this.field2677[var65] & 0xFFFF) == this.field2673[var64]) {
                        this.field2680[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field2680 = null;
            }
        }
        if (!var3) {
            this.field2663 = null;
        }
        if (!var2) {
            this.field2699 = null;
        }
    }

    public class262(class262[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        this.field2666 = 0;
        this.field2670 = 0;
        this.field2694 = 0;
        this.field2683 = -1;
        for (int var10 = 0; var10 < arg1; var10++) {
            class262 var11 = arg0[var10];
            if (var11 != null) {
                this.field2666 += var11.field2666;
                this.field2670 += var11.field2670;
                this.field2694 += var11.field2694;
                if (var11.field2697 == null) {
                    if (this.field2683 == -1) {
                        this.field2683 = var11.field2683;
                    }
                    if (this.field2683 != var11.field2683) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var11.field2699 != null;
                var5 |= var11.field2676 != null;
                var6 |= var11.field2687 != null;
                var7 |= var11.field2663 != null;
                var8 |= var11.field2680 != null;
                var9 |= var11.field2672 != null;
            }
        }
        this.field2667 = new int[this.field2666];
        this.field2668 = new int[this.field2666];
        this.field2669 = new int[this.field2666];
        this.field2686 = new int[this.field2666];
        this.field2671 = new int[this.field2670];
        this.field2681 = new int[this.field2670];
        this.field2673 = new int[this.field2670];
        if (var3) {
            this.field2699 = new byte[this.field2670];
        }
        if (var4) {
            this.field2697 = new byte[this.field2670];
        }
        if (var5) {
            this.field2676 = new byte[this.field2670];
        }
        if (var6) {
            this.field2687 = new int[this.field2670];
        }
        if (var7) {
            this.field2663 = new short[this.field2670];
        }
        if (var8) {
            this.field2680 = new byte[this.field2670];
        }
        if (var9) {
            this.field2672 = new int[this.field2666][];
            this.field2691 = new int[this.field2666][];
        }
        this.field2678 = new short[this.field2670];
        if (this.field2694 > 0) {
            this.field2682 = new byte[this.field2694];
            this.field2693 = new short[this.field2694];
            this.field2684 = new short[this.field2694];
            this.field2677 = new short[this.field2694];
        }
        this.field2666 = 0;
        this.field2670 = 0;
        this.field2694 = 0;
        for (int var12 = 0; var12 < arg1; var12++) {
            class262 var13 = arg0[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < var13.field2670; var14++) {
                    if (var3 && var13.field2699 != null) {
                        this.field2699[this.field2670] = var13.field2699[var14];
                    }
                    if (var4) {
                        if (var13.field2697 == null) {
                            this.field2697[this.field2670] = var13.field2683;
                        } else {
                            this.field2697[this.field2670] = var13.field2697[var14];
                        }
                    }
                    if (var5 && var13.field2676 != null) {
                        this.field2676[this.field2670] = var13.field2676[var14];
                    }
                    if (var6 && var13.field2687 != null) {
                        this.field2687[this.field2670] = var13.field2687[var14];
                    }
                    if (var7) {
                        if (var13.field2663 == null) {
                            this.field2663[this.field2670] = -1;
                        } else {
                            this.field2663[this.field2670] = var13.field2663[var14];
                        }
                    }
                    if (var8) {
                        if (var13.field2680 == null || var13.field2680[var14] == -1) {
                            this.field2680[this.field2670] = -1;
                        } else {
                            this.field2680[this.field2670] = (byte) (var13.field2680[var14] + this.field2694);
                        }
                    }
                    this.field2678[this.field2670] = var13.field2678[var14];
                    this.field2671[this.field2670] = this.method4577(var13, var13.field2671[var14]);
                    this.field2681[this.field2670] = this.method4577(var13, var13.field2681[var14]);
                    this.field2673[this.field2670] = this.method4577(var13, var13.field2673[var14]);
                    this.field2670++;
                }
                for (int var15 = 0; var15 < var13.field2694; var15++) {
                    byte var16 = this.field2682[this.field2694] = var13.field2682[var15];
                    if (var16 == 0) {
                        this.field2693[this.field2694] = (short) this.method4577(var13, var13.field2693[var15]);
                        this.field2684[this.field2694] = (short) this.method4577(var13, var13.field2684[var15]);
                        this.field2677[this.field2694] = (short) this.method4577(var13, var13.field2677[var15]);
                    }
                    this.field2694++;
                }
            }
        }
    }

    @ObfuscatedName("kq.ap(Lkq;I)I")
    public final int method4577(class262 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field2667[arg1];
        int var5 = arg0.field2668[arg1];
        int var6 = arg0.field2669[arg1];
        for (int var7 = 0; var7 < this.field2666; var7++) {
            if (this.field2667[var7] == var4 && this.field2668[var7] == var5 && this.field2669[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field2667[this.field2666] = var4;
            this.field2668[this.field2666] = var5;
            this.field2669[this.field2666] = var6;
            if (arg0.field2686 != null) {
                this.field2686[this.field2666] = arg0.field2686[arg1];
            }
            if (arg0.field2672 != null) {
                this.field2672[this.field2666] = arg0.field2672[arg1];
                this.field2691[this.field2666] = arg0.field2691[arg1];
            }
            var3 = this.field2666++;
        }
        return var3;
    }

    public class262(class262 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field2666 = arg0.field2666;
        this.field2670 = arg0.field2670;
        this.field2694 = arg0.field2694;
        if (arg1) {
            this.field2667 = arg0.field2667;
            this.field2668 = arg0.field2668;
            this.field2669 = arg0.field2669;
        } else {
            this.field2667 = new int[this.field2666];
            this.field2668 = new int[this.field2666];
            this.field2669 = new int[this.field2666];
            for (int var6 = 0; var6 < this.field2666; var6++) {
                this.field2667[var6] = arg0.field2667[var6];
                this.field2668[var6] = arg0.field2668[var6];
                this.field2669[var6] = arg0.field2669[var6];
            }
        }
        if (arg2) {
            this.field2678 = arg0.field2678;
        } else {
            this.field2678 = new short[this.field2670];
            for (int var7 = 0; var7 < this.field2670; var7++) {
                this.field2678[var7] = arg0.field2678[var7];
            }
        }
        if (arg3 || arg0.field2663 == null) {
            this.field2663 = arg0.field2663;
        } else {
            this.field2663 = new short[this.field2670];
            for (int var8 = 0; var8 < this.field2670; var8++) {
                this.field2663[var8] = arg0.field2663[var8];
            }
        }
        if (arg4) {
            this.field2676 = arg0.field2676;
        } else {
            this.field2676 = new byte[this.field2670];
            if (arg0.field2676 == null) {
                for (int var9 = 0; var9 < this.field2670; var9++) {
                    this.field2676[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field2670; var10++) {
                    this.field2676[var10] = arg0.field2676[var10];
                }
            }
        }
        this.field2671 = arg0.field2671;
        this.field2681 = arg0.field2681;
        this.field2673 = arg0.field2673;
        this.field2699 = arg0.field2699;
        this.field2697 = arg0.field2697;
        this.field2680 = arg0.field2680;
        this.field2683 = arg0.field2683;
        this.field2682 = arg0.field2682;
        this.field2693 = arg0.field2693;
        this.field2684 = arg0.field2684;
        this.field2677 = arg0.field2677;
        this.field2686 = arg0.field2686;
        this.field2687 = arg0.field2687;
        this.field2688 = arg0.field2688;
        this.field2689 = arg0.field2689;
        this.field2700 = arg0.field2700;
        this.field2692 = arg0.field2692;
        this.field2707 = arg0.field2707;
        this.field2672 = arg0.field2672;
        this.field2691 = arg0.field2691;
        this.field2690 = arg0.field2690;
        this.field2696 = arg0.field2696;
    }

    @ObfuscatedName("kq.av()Lkq;")
    public class262 method4633() {
        class262 var1 = new class262();
        if (this.field2699 != null) {
            var1.field2699 = new byte[this.field2670];
            for (int var2 = 0; var2 < this.field2670; var2++) {
                var1.field2699[var2] = this.field2699[var2];
            }
        }
        var1.field2666 = this.field2666;
        var1.field2670 = this.field2670;
        var1.field2694 = this.field2694;
        var1.field2667 = this.field2667;
        var1.field2668 = this.field2668;
        var1.field2669 = this.field2669;
        var1.field2671 = this.field2671;
        var1.field2681 = this.field2681;
        var1.field2673 = this.field2673;
        var1.field2697 = this.field2697;
        var1.field2676 = this.field2676;
        var1.field2680 = this.field2680;
        var1.field2678 = this.field2678;
        var1.field2663 = this.field2663;
        var1.field2683 = this.field2683;
        var1.field2682 = this.field2682;
        var1.field2693 = this.field2693;
        var1.field2684 = this.field2684;
        var1.field2677 = this.field2677;
        var1.field2686 = this.field2686;
        var1.field2687 = this.field2687;
        var1.field2688 = this.field2688;
        var1.field2689 = this.field2689;
        var1.field2700 = this.field2700;
        var1.field2692 = this.field2692;
        var1.field2690 = this.field2690;
        var1.field2696 = this.field2696;
        return var1;
    }

    @ObfuscatedName("kq.ax([[IIIIZI)Lkq;")
    public class262 method4578(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method4586();
        int var7 = this.field2701 + arg1;
        int var8 = this.field2674 + arg1;
        int var9 = this.field2702 + arg3;
        int var10 = this.field2685 + arg3;
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
        class262 var15;
        if (arg4) {
            var15 = new class262();
            var15.field2666 = this.field2666;
            var15.field2670 = this.field2670;
            var15.field2694 = this.field2694;
            var15.field2667 = this.field2667;
            var15.field2669 = this.field2669;
            var15.field2671 = this.field2671;
            var15.field2681 = this.field2681;
            var15.field2673 = this.field2673;
            var15.field2699 = this.field2699;
            var15.field2697 = this.field2697;
            var15.field2676 = this.field2676;
            var15.field2680 = this.field2680;
            var15.field2678 = this.field2678;
            var15.field2663 = this.field2663;
            var15.field2683 = this.field2683;
            var15.field2682 = this.field2682;
            var15.field2693 = this.field2693;
            var15.field2684 = this.field2684;
            var15.field2677 = this.field2677;
            var15.field2686 = this.field2686;
            var15.field2687 = this.field2687;
            var15.field2688 = this.field2688;
            var15.field2689 = this.field2689;
            var15.field2690 = this.field2690;
            var15.field2696 = this.field2696;
            var15.field2668 = new int[var15.field2666];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field2666; var16++) {
                int var17 = this.field2667[var16] + arg1;
                int var18 = this.field2669[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field2668[var16] = this.field2668[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field2666; var26++) {
                int var27 = (-this.field2668[var26] << 16) / this.field2874;
                if (var27 < arg5) {
                    int var28 = this.field2667[var26] + arg1;
                    int var29 = this.field2669[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field2668[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field2668[var26];
                }
            }
        }
        var15.method4590();
        return var15;
    }

    @ObfuscatedName("kq.as()V")
    public void method4579() {
        int var10002;
        if (this.field2686 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field2666; var3++) {
                int var4 = this.field2686[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field2688 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field2688[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field2666) {
                int var7 = this.field2686[var6];
                this.field2688[var7][var1[var7]++] = var6++;
            }
            this.field2686 = null;
        }
        if (this.field2687 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field2670; var10++) {
            int var11 = this.field2687[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field2689 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field2689[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field2670) {
            int var14 = this.field2687[var13];
            this.field2689[var14][var8[var14]++] = var13++;
        }
        this.field2687 = null;
    }

    @ObfuscatedName("kq.ay()V")
    public void method4580() {
        for (int var1 = 0; var1 < this.field2666; var1++) {
            int var2 = this.field2667[var1];
            this.field2667[var1] = this.field2669[var1];
            this.field2669[var1] = -var2;
        }
        this.method4590();
    }

    @ObfuscatedName("kq.ak()V")
    public void method4591() {
        for (int var1 = 0; var1 < this.field2666; var1++) {
            this.field2667[var1] = -this.field2667[var1];
            this.field2669[var1] = -this.field2669[var1];
        }
        this.method4590();
    }

    @ObfuscatedName("kq.aj()V")
    public void method4582() {
        for (int var1 = 0; var1 < this.field2666; var1++) {
            int var2 = this.field2669[var1];
            this.field2669[var1] = this.field2667[var1];
            this.field2667[var1] = -var2;
        }
        this.method4590();
    }

    @ObfuscatedName("kq.am(I)V")
    public void method4646(int arg0) {
        int var2 = field2706[arg0];
        int var3 = field2675[arg0];
        for (int var4 = 0; var4 < this.field2666; var4++) {
            int var5 = this.field2669[var4] * var2 + this.field2667[var4] * var3 >> 16;
            this.field2669[var4] = this.field2669[var4] * var3 - this.field2667[var4] * var2 >> 16;
            this.field2667[var4] = var5;
        }
        this.method4590();
    }

    @ObfuscatedName("kq.aq(III)V")
    public void method4584(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2666; var4++) {
            this.field2667[var4] += arg0;
            this.field2668[var4] += arg1;
            this.field2669[var4] += arg2;
        }
        this.method4590();
    }

    @ObfuscatedName("kq.ai(SS)V")
    public void method4585(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2670; var3++) {
            if (this.field2678[var3] == arg0) {
                this.field2678[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("kq.aw(SS)V")
    public void method4641(short arg0, short arg1) {
        if (this.field2663 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field2670; var3++) {
            if (this.field2663[var3] == arg0) {
                this.field2663[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("kq.ae()V")
    public void method4638() {
        for (int var1 = 0; var1 < this.field2666; var1++) {
            this.field2669[var1] = -this.field2669[var1];
        }
        for (int var2 = 0; var2 < this.field2670; var2++) {
            int var3 = this.field2671[var2];
            this.field2671[var2] = this.field2673[var2];
            this.field2673[var2] = var3;
        }
        this.method4590();
    }

    @ObfuscatedName("kq.an(III)V")
    public void method4588(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2666; var4++) {
            this.field2667[var4] = this.field2667[var4] * arg0 / 128;
            this.field2668[var4] = this.field2668[var4] * arg1 / 128;
            this.field2669[var4] = this.field2669[var4] * arg2 / 128;
        }
        this.method4590();
    }

    @ObfuscatedName("kq.ag()V")
    public void method4597() {
        if (this.field2700 != null) {
            return;
        }
        this.field2700 = new class282[this.field2666];
        for (int var1 = 0; var1 < this.field2666; var1++) {
            this.field2700[var1] = new class282();
        }
        for (int var2 = 0; var2 < this.field2670; var2++) {
            int var3 = this.field2671[var2];
            int var4 = this.field2681[var2];
            int var5 = this.field2673[var2];
            int var6 = this.field2667[var4] - this.field2667[var3];
            int var7 = this.field2668[var4] - this.field2668[var3];
            int var8 = this.field2669[var4] - this.field2669[var3];
            int var9 = this.field2667[var5] - this.field2667[var3];
            int var10 = this.field2668[var5] - this.field2668[var3];
            int var11 = this.field2669[var5] - this.field2669[var3];
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
            if (this.field2699 == null) {
                var19 = 0;
            } else {
                var19 = this.field2699[var2];
            }
            if (var19 == 0) {
                class282 var20 = this.field2700[var3];
                var20.field3022 += var16;
                var20.field3026 += var17;
                var20.field3023 += var18;
                var20.field3021++;
                class282 var21 = this.field2700[var4];
                var21.field3022 += var16;
                var21.field3026 += var17;
                var21.field3023 += var18;
                var21.field3021++;
                class282 var22 = this.field2700[var5];
                var22.field3022 += var16;
                var22.field3026 += var17;
                var22.field3023 += var18;
                var22.field3021++;
            } else if (var19 == 1) {
                if (this.field2692 == null) {
                    this.field2692 = new class274[this.field2670];
                }
                class274 var23 = this.field2692[var2] = new class274();
                var23.field2875 = var16;
                var23.field2876 = var17;
                var23.field2877 = var18;
            }
        }
    }

    @ObfuscatedName("kq.ad()V")
    public void method4590() {
        this.field2700 = null;
        this.field2707 = null;
        this.field2692 = null;
        this.field2679 = false;
    }

    @ObfuscatedName("kq.af()V")
    public void method4586() {
        if (this.field2679) {
            return;
        }
        this.field2874 = 0;
        this.field2698 = 0;
        this.field2701 = 999999;
        this.field2674 = -999999;
        this.field2685 = -99999;
        this.field2702 = 99999;
        for (int var1 = 0; var1 < this.field2666; var1++) {
            int var2 = this.field2667[var1];
            int var3 = this.field2668[var1];
            int var4 = this.field2669[var1];
            if (var2 < this.field2701) {
                this.field2701 = var2;
            }
            if (var2 > this.field2674) {
                this.field2674 = var2;
            }
            if (var4 < this.field2702) {
                this.field2702 = var4;
            }
            if (var4 > this.field2685) {
                this.field2685 = var4;
            }
            if (-var3 > this.field2874) {
                this.field2874 = -var3;
            }
            if (var3 > this.field2698) {
                this.field2698 = var3;
            }
        }
        this.field2679 = true;
    }

    @ObfuscatedName("kq.be(Lkq;Lkq;IIIZ)V")
    public static void method4592(class262 arg0, class262 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method4586();
        arg0.method4597();
        arg1.method4586();
        arg1.method4597();
        field2705++;
        int var6 = 0;
        int[] var7 = arg1.field2667;
        int var8 = arg1.field2666;
        for (int var9 = 0; var9 < arg0.field2666; var9++) {
            class282 var10 = arg0.field2700[var9];
            if (var10.field3021 != 0) {
                int var11 = arg0.field2668[var9] - arg3;
                if (var11 <= arg1.field2698) {
                    int var12 = arg0.field2667[var9] - arg2;
                    if (var12 >= arg1.field2701 && var12 <= arg1.field2674) {
                        int var13 = arg0.field2669[var9] - arg4;
                        if (var13 >= arg1.field2702 && var13 <= arg1.field2685) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class282 var15 = arg1.field2700[var14];
                                if (var7[var14] == var12 && arg1.field2669[var14] == var13 && arg1.field2668[var14] == var11 && var15.field3021 != 0) {
                                    if (arg0.field2707 == null) {
                                        arg0.field2707 = new class282[arg0.field2666];
                                    }
                                    if (arg1.field2707 == null) {
                                        arg1.field2707 = new class282[var8];
                                    }
                                    class282 var16 = arg0.field2707[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field2707[var9] = new class282(var10);
                                    }
                                    class282 var17 = arg1.field2707[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field2707[var14] = new class282(var15);
                                    }
                                    var16.field3022 += var15.field3022;
                                    var16.field3026 += var15.field3026;
                                    var16.field3023 += var15.field3023;
                                    var16.field3021 += var15.field3021;
                                    var17.field3022 += var10.field3022;
                                    var17.field3026 += var10.field3026;
                                    var17.field3023 += var10.field3023;
                                    var17.field3021 += var10.field3021;
                                    var6++;
                                    field2703[var9] = field2705;
                                    field2704[var14] = field2705;
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
        for (int var18 = 0; var18 < arg0.field2670; var18++) {
            if (field2703[arg0.field2671[var18]] == field2705 && field2703[arg0.field2681[var18]] == field2705 && field2703[arg0.field2673[var18]] == field2705) {
                if (arg0.field2699 == null) {
                    arg0.field2699 = new byte[arg0.field2670];
                }
                arg0.field2699[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field2670; var19++) {
            if (field2704[arg1.field2671[var19]] == field2705 && field2704[arg1.field2681[var19]] == field2705 && field2704[arg1.field2673[var19]] == field2705) {
                if (arg1.field2699 == null) {
                    arg1.field2699 = new byte[arg1.field2670];
                }
                arg1.field2699[var19] = 2;
            }
        }
    }

    @ObfuscatedName("kq.bd(IIIII)Lka;")
    public final class280 method4593(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method4597();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class280 var8 = new class280();
        var8.field2945 = new int[this.field2670];
        var8.field3006 = new int[this.field2670];
        var8.field2947 = new int[this.field2670];
        if (this.field2694 > 0 && this.field2680 != null) {
            int[] var9 = new int[this.field2694];
            for (int var10 = 0; var10 < this.field2670; var10++) {
                if (this.field2680[var10] != -1) {
                    var9[this.field2680[var10] & 0xFF]++;
                }
            }
            var8.field2953 = 0;
            for (int var11 = 0; var11 < this.field2694; var11++) {
                if (var9[var11] > 0 && this.field2682[var11] == 0) {
                    var8.field2953++;
                }
            }
            var8.field2954 = new int[var8.field2953];
            var8.field2986 = new int[var8.field2953];
            var8.field2956 = new int[var8.field2953];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field2694; var13++) {
                if (var9[var13] > 0 && this.field2682[var13] == 0) {
                    var8.field2954[var12] = this.field2693[var13] & 0xFFFF;
                    var8.field2986[var12] = this.field2684[var13] & 0xFFFF;
                    var8.field2956[var12] = this.field2677[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field2950 = new byte[this.field2670];
            for (int var14 = 0; var14 < this.field2670; var14++) {
                if (this.field2680[var14] == -1) {
                    var8.field2950[var14] = -1;
                } else {
                    var8.field2950[var14] = (byte) var9[this.field2680[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field2670; var15++) {
            byte var16;
            if (this.field2699 == null) {
                var16 = 0;
            } else {
                var16 = this.field2699[var15];
            }
            byte var17;
            if (this.field2676 == null) {
                var17 = 0;
            } else {
                var17 = this.field2676[var15];
            }
            short var18;
            if (this.field2663 == null) {
                var18 = -1;
            } else {
                var18 = this.field2663[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field2678[var15] & 0xFFFF;
                    class282 var20;
                    if (this.field2707 == null || this.field2707[this.field2671[var15]] == null) {
                        var20 = this.field2700[this.field2671[var15]];
                    } else {
                        var20 = this.field2707[this.field2671[var15]];
                    }
                    int var21 = (var20.field3023 * arg4 + var20.field3026 * arg3 + var20.field3022 * arg2) / (var20.field3021 * var7) + arg0;
                    var8.field2945[var15] = method4594(var19, var21);
                    class282 var22;
                    if (this.field2707 == null || this.field2707[this.field2681[var15]] == null) {
                        var22 = this.field2700[this.field2681[var15]];
                    } else {
                        var22 = this.field2707[this.field2681[var15]];
                    }
                    int var23 = (var22.field3023 * arg4 + var22.field3026 * arg3 + var22.field3022 * arg2) / (var22.field3021 * var7) + arg0;
                    var8.field3006[var15] = method4594(var19, var23);
                    class282 var24;
                    if (this.field2707 == null || this.field2707[this.field2673[var15]] == null) {
                        var24 = this.field2700[this.field2673[var15]];
                    } else {
                        var24 = this.field2707[this.field2673[var15]];
                    }
                    int var25 = (var24.field3023 * arg4 + var24.field3026 * arg3 + var24.field3022 * arg2) / (var24.field3021 * var7) + arg0;
                    var8.field2947[var15] = method4594(var19, var25);
                } else if (var16 == 1) {
                    class274 var26 = this.field2692[var15];
                    int var27 = (var26.field2877 * arg4 + var26.field2876 * arg3 + var26.field2875 * arg2) / (var7 / 2 + var7) + arg0;
                    var8.field2945[var15] = method4594(this.field2678[var15] & 0xFFFF, var27);
                    var8.field2947[var15] = -1;
                } else if (var16 == 3) {
                    var8.field2945[var15] = 128;
                    var8.field2947[var15] = -1;
                } else {
                    var8.field2947[var15] = -2;
                }
            } else if (var16 == 0) {
                class282 var28;
                if (this.field2707 == null || this.field2707[this.field2671[var15]] == null) {
                    var28 = this.field2700[this.field2671[var15]];
                } else {
                    var28 = this.field2707[this.field2671[var15]];
                }
                int var29 = (var28.field3023 * arg4 + var28.field3026 * arg3 + var28.field3022 * arg2) / (var28.field3021 * var7) + arg0;
                var8.field2945[var15] = method4583(var29);
                class282 var30;
                if (this.field2707 == null || this.field2707[this.field2681[var15]] == null) {
                    var30 = this.field2700[this.field2681[var15]];
                } else {
                    var30 = this.field2707[this.field2681[var15]];
                }
                int var31 = (var30.field3023 * arg4 + var30.field3026 * arg3 + var30.field3022 * arg2) / (var30.field3021 * var7) + arg0;
                var8.field3006[var15] = method4583(var31);
                class282 var32;
                if (this.field2707 == null || this.field2707[this.field2673[var15]] == null) {
                    var32 = this.field2700[this.field2673[var15]];
                } else {
                    var32 = this.field2707[this.field2673[var15]];
                }
                int var33 = (var32.field3023 * arg4 + var32.field3026 * arg3 + var32.field3022 * arg2) / (var32.field3021 * var7) + arg0;
                var8.field2947[var15] = method4583(var33);
            } else if (var16 == 1) {
                class274 var34 = this.field2692[var15];
                int var35 = (var34.field2877 * arg4 + var34.field2876 * arg3 + var34.field2875 * arg2) / (var7 / 2 + var7) + arg0;
                var8.field2945[var15] = method4583(var35);
                var8.field2947[var15] = -1;
            } else {
                var8.field2947[var15] = -2;
            }
        }
        this.method4579();
        var8.field2937 = this.field2666;
        var8.field2989 = this.field2667;
        var8.field2939 = this.field2668;
        var8.field2940 = this.field2669;
        var8.field2941 = this.field2670;
        var8.field2930 = this.field2671;
        var8.field2943 = this.field2681;
        var8.field2965 = this.field2673;
        var8.field2948 = this.field2697;
        var8.field2949 = this.field2676;
        var8.field2952 = this.field2683;
        var8.field2957 = this.field2688;
        var8.field2964 = this.field2689;
        var8.field2951 = this.field2663;
        var8.field2959 = this.field2672;
        var8.field2936 = this.field2691;
        return var8;
    }

    @ObfuscatedName("kq.bl(II)I")
    public static final int method4594(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("kq.bi(I)I")
    public static final int method4583(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
