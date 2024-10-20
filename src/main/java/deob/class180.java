package deob;

@ObfuscatedName("fy")
public class class180 extends class166 {

    @ObfuscatedName("fy.r")
    public int field2687 = 0;

    @ObfuscatedName("fy.d")
    public int[] field2673;

    @ObfuscatedName("fy.k")
    public int[] field2674;

    @ObfuscatedName("fy.u")
    public int[] field2677;

    @ObfuscatedName("fy.v")
    public int field2711 = 0;

    @ObfuscatedName("fy.f")
    public int[] field2699;

    @ObfuscatedName("fy.s")
    public int[] field2678;

    @ObfuscatedName("fy.j")
    public int[] field2718;

    @ObfuscatedName("fy.e")
    public byte[] field2680;

    @ObfuscatedName("fy.t")
    public byte[] field2681;

    @ObfuscatedName("fy.y")
    public byte[] field2682;

    @ObfuscatedName("fy.b")
    public byte[] field2683;

    @ObfuscatedName("fy.w")
    public short[] field2684;

    @ObfuscatedName("fy.g")
    public short[] field2676;

    @ObfuscatedName("fy.p")
    public byte field2686 = 0;

    @ObfuscatedName("fy.z")
    public int field2695;

    @ObfuscatedName("fy.n")
    public byte[] field2688;

    @ObfuscatedName("fy.x")
    public short[] field2690;

    @ObfuscatedName("fy.i")
    public short[] field2691;

    @ObfuscatedName("fy.m")
    public short[] field2672;

    @ObfuscatedName("fy.ai")
    public short[] field2675;

    @ObfuscatedName("fy.aa")
    public short[] field2693;

    @ObfuscatedName("fy.af")
    public short[] field2694;

    @ObfuscatedName("fy.ae")
    public short[] field2679;

    @ObfuscatedName("fy.at")
    public short[] field2696;

    @ObfuscatedName("fy.aj")
    public short[] field2689;

    @ObfuscatedName("fy.ar")
    public byte[] field2698;

    @ObfuscatedName("fy.au")
    public int[] field2685;

    @ObfuscatedName("fy.an")
    public int[] field2700;

    @ObfuscatedName("fy.az")
    public int[][] field2701;

    @ObfuscatedName("fy.ac")
    public int[][] field2702;

    @ObfuscatedName("fy.ap")
    public class43[] field2703;

    @ObfuscatedName("fy.ad")
    public class42[] field2704;

    @ObfuscatedName("fy.ax")
    public class42[] field2705;

    @ObfuscatedName("fy.as")
    public short field2706;

    @ObfuscatedName("fy.ak")
    public short field2707;

    @ObfuscatedName("fy.av")
    public boolean field2697 = false;

    @ObfuscatedName("fy.ay")
    public int field2709;

    @ObfuscatedName("fy.ab")
    public int field2710;

    @ObfuscatedName("fy.am")
    public int field2692;

    @ObfuscatedName("fy.aw")
    public int field2712;

    @ObfuscatedName("fy.ag")
    public int field2713;

    @ObfuscatedName("fy.al")
    public static int[] field2714 = new int[10000];

    @ObfuscatedName("fy.aq")
    public static int[] field2715 = new int[10000];

    @ObfuscatedName("fy.ah")
    public static int field2716 = 0;

    @ObfuscatedName("fy.ao")
    public static int[] field2717 = class173.field2544;

    @ObfuscatedName("fy.bg")
    public static int[] field2708 = class173.field2545;

    public class180() {
    }

    @ObfuscatedName("fy.w(Lcv;II)Lfy;")
    public static class180 method2918(class87 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1024(arg1, arg2);
        return var3 == null ? null : new class180(var3);
    }

    public class180(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method2919(arg0);
        } else {
            this.method2920(arg0);
        }
    }

    @ObfuscatedName("fy.g([B)V")
    public void method2919(byte[] arg0) {
        class136 var2 = new class136(arg0);
        class136 var3 = new class136(arg0);
        class136 var4 = new class136(arg0);
        class136 var5 = new class136(arg0);
        class136 var6 = new class136(arg0);
        class136 var7 = new class136(arg0);
        class136 var8 = new class136(arg0);
        var2.field1722 = arg0.length - 23;
        int var9 = var2.method1712();
        int var10 = var2.method1712();
        int var11 = var2.method1602();
        int var12 = var2.method1602();
        int var13 = var2.method1602();
        int var14 = var2.method1602();
        int var15 = var2.method1602();
        int var16 = var2.method1602();
        int var17 = var2.method1602();
        int var18 = var2.method1712();
        int var19 = var2.method1712();
        int var20 = var2.method1712();
        int var21 = var2.method1712();
        int var22 = var2.method1712();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field2688 = new byte[var11];
            var2.field1722 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field2688[var26] = var2.method1603();
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
        this.field2687 = var9;
        this.field2711 = var10;
        this.field2695 = var11;
        this.field2673 = new int[var9];
        this.field2674 = new int[var9];
        this.field2677 = new int[var9];
        this.field2699 = new int[var10];
        this.field2678 = new int[var10];
        this.field2718 = new int[var10];
        if (var17 == 1) {
            this.field2685 = new int[var9];
        }
        if (var12 == 1) {
            this.field2680 = new byte[var10];
        }
        if (var13 == 255) {
            this.field2681 = new byte[var10];
        } else {
            this.field2686 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2682 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2700 = new int[var10];
        }
        if (var16 == 1) {
            this.field2676 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field2683 = new byte[var10];
        }
        this.field2684 = new short[var10];
        if (var11 > 0) {
            this.field2690 = new short[var11];
            this.field2691 = new short[var11];
            this.field2672 = new short[var11];
            if (var24 > 0) {
                this.field2675 = new short[var24];
                this.field2693 = new short[var24];
                this.field2694 = new short[var24];
                this.field2679 = new short[var24];
                this.field2698 = new byte[var24];
                this.field2696 = new short[var24];
            }
            if (var25 > 0) {
                this.field2689 = new short[var25];
            }
        }
        var2.field1722 = var11;
        var3.field1722 = var44;
        var4.field1722 = var46;
        var5.field1722 = var48;
        var6.field1722 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method1602();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method1614();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method1614();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method1614();
            }
            this.field2673[var67] = var64 + var69;
            this.field2674[var67] = var65 + var70;
            this.field2677[var67] = var66 + var71;
            var64 = this.field2673[var67];
            var65 = this.field2674[var67];
            var66 = this.field2677[var67];
            if (var17 == 1) {
                this.field2685[var67] = var6.method1602();
            }
        }
        var2.field1722 = var42;
        var3.field1722 = var31;
        var4.field1722 = var34;
        var5.field1722 = var37;
        var6.field1722 = var35;
        var7.field1722 = var40;
        var8.field1722 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field2684[var72] = (short) var2.method1712();
            if (var12 == 1) {
                this.field2680[var72] = var3.method1603();
            }
            if (var13 == 255) {
                this.field2681[var72] = var4.method1603();
            }
            if (var14 == 1) {
                this.field2682[var72] = var5.method1603();
            }
            if (var15 == 1) {
                this.field2700[var72] = var6.method1602();
            }
            if (var16 == 1) {
                this.field2676[var72] = (short) (var7.method1712() - 1);
            }
            if (this.field2683 != null && this.field2676[var72] != -1) {
                this.field2683[var72] = (byte) (var8.method1602() - 1);
            }
        }
        var2.field1722 = var33;
        var3.field1722 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method1602();
            if (var78 == 1) {
                var73 = var2.method1614() + var76;
                var74 = var2.method1614() + var73;
                var75 = var2.method1614() + var74;
                var76 = var75;
                this.field2699[var77] = var73;
                this.field2678[var77] = var74;
                this.field2718[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method1614() + var76;
                var76 = var75;
                this.field2699[var77] = var73;
                this.field2678[var77] = var74;
                this.field2718[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method1614() + var76;
                var76 = var75;
                this.field2699[var77] = var73;
                this.field2678[var77] = var74;
                this.field2718[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method1614() + var76;
                var76 = var75;
                this.field2699[var77] = var73;
                this.field2678[var77] = var81;
                this.field2718[var77] = var75;
            }
        }
        var2.field1722 = var50;
        var3.field1722 = var52;
        var4.field1722 = var54;
        var5.field1722 = var56;
        var6.field1722 = var58;
        var7.field1722 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field2688[var82] & 0xFF;
            if (var83 == 0) {
                this.field2690[var82] = (short) var2.method1712();
                this.field2691[var82] = (short) var2.method1712();
                this.field2672[var82] = (short) var2.method1712();
            }
            if (var83 == 1) {
                this.field2690[var82] = (short) var3.method1712();
                this.field2691[var82] = (short) var3.method1712();
                this.field2672[var82] = (short) var3.method1712();
                this.field2675[var82] = (short) var4.method1712();
                this.field2693[var82] = (short) var4.method1712();
                this.field2694[var82] = (short) var4.method1712();
                this.field2679[var82] = (short) var5.method1712();
                this.field2698[var82] = var6.method1603();
                this.field2696[var82] = (short) var7.method1712();
            }
            if (var83 == 2) {
                this.field2690[var82] = (short) var3.method1712();
                this.field2691[var82] = (short) var3.method1712();
                this.field2672[var82] = (short) var3.method1712();
                this.field2675[var82] = (short) var4.method1712();
                this.field2693[var82] = (short) var4.method1712();
                this.field2694[var82] = (short) var4.method1712();
                this.field2679[var82] = (short) var5.method1712();
                this.field2698[var82] = var6.method1603();
                this.field2696[var82] = (short) var7.method1712();
                this.field2689[var82] = (short) var7.method1712();
            }
            if (var83 == 3) {
                this.field2690[var82] = (short) var3.method1712();
                this.field2691[var82] = (short) var3.method1712();
                this.field2672[var82] = (short) var3.method1712();
                this.field2675[var82] = (short) var4.method1712();
                this.field2693[var82] = (short) var4.method1712();
                this.field2694[var82] = (short) var4.method1712();
                this.field2679[var82] = (short) var5.method1712();
                this.field2698[var82] = var6.method1603();
                this.field2696[var82] = (short) var7.method1712();
            }
        }
        var2.field1722 = var62;
        int var84 = var2.method1602();
        if (var84 == 0) {
            return;
        }
        new class51();
        var2.method1712();
        var2.method1712();
        var2.method1712();
        var2.method1607();
    }

    @ObfuscatedName("fy.p([B)V")
    public void method2920(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class136 var4 = new class136(arg0);
        class136 var5 = new class136(arg0);
        class136 var6 = new class136(arg0);
        class136 var7 = new class136(arg0);
        class136 var8 = new class136(arg0);
        var4.field1722 = arg0.length - 18;
        int var9 = var4.method1712();
        int var10 = var4.method1712();
        int var11 = var4.method1602();
        int var12 = var4.method1602();
        int var13 = var4.method1602();
        int var14 = var4.method1602();
        int var15 = var4.method1602();
        int var16 = var4.method1602();
        int var17 = var4.method1712();
        int var18 = var4.method1712();
        int var19 = var4.method1712();
        int var20 = var4.method1712();
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
        this.field2687 = var9;
        this.field2711 = var10;
        this.field2695 = var11;
        this.field2673 = new int[var9];
        this.field2674 = new int[var9];
        this.field2677 = new int[var9];
        this.field2699 = new int[var10];
        this.field2678 = new int[var10];
        this.field2718 = new int[var10];
        if (var11 > 0) {
            this.field2688 = new byte[var11];
            this.field2690 = new short[var11];
            this.field2691 = new short[var11];
            this.field2672 = new short[var11];
        }
        if (var16 == 1) {
            this.field2685 = new int[var9];
        }
        if (var12 == 1) {
            this.field2680 = new byte[var10];
            this.field2683 = new byte[var10];
            this.field2676 = new short[var10];
        }
        if (var13 == 255) {
            this.field2681 = new byte[var10];
        } else {
            this.field2686 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2682 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2700 = new int[var10];
        }
        this.field2684 = new short[var10];
        var4.field1722 = var21;
        var5.field1722 = var36;
        var6.field1722 = var38;
        var7.field1722 = var40;
        var8.field1722 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method1602();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method1614();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method1614();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method1614();
            }
            this.field2673[var46] = var43 + var48;
            this.field2674[var46] = var44 + var49;
            this.field2677[var46] = var45 + var50;
            var43 = this.field2673[var46];
            var44 = this.field2674[var46];
            var45 = this.field2677[var46];
            if (var16 == 1) {
                this.field2685[var46] = var8.method1602();
            }
        }
        var4.field1722 = var32;
        var5.field1722 = var28;
        var6.field1722 = var26;
        var7.field1722 = var30;
        var8.field1722 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field2684[var51] = (short) var4.method1712();
            if (var12 == 1) {
                int var52 = var5.method1602();
                if ((var52 & 0x1) == 1) {
                    this.field2680[var51] = 1;
                    var2 = true;
                } else {
                    this.field2680[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field2683[var51] = (byte) (var52 >> 2);
                    this.field2676[var51] = this.field2684[var51];
                    this.field2684[var51] = 127;
                    if (this.field2676[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field2683[var51] = -1;
                    this.field2676[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field2681[var51] = var6.method1603();
            }
            if (var14 == 1) {
                this.field2682[var51] = var7.method1603();
            }
            if (var15 == 1) {
                this.field2700[var51] = var8.method1602();
            }
        }
        var4.field1722 = var25;
        var5.field1722 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method1602();
            if (var58 == 1) {
                var53 = var4.method1614() + var56;
                var54 = var4.method1614() + var53;
                var55 = var4.method1614() + var54;
                var56 = var55;
                this.field2699[var57] = var53;
                this.field2678[var57] = var54;
                this.field2718[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method1614() + var56;
                var56 = var55;
                this.field2699[var57] = var53;
                this.field2678[var57] = var54;
                this.field2718[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method1614() + var56;
                var56 = var55;
                this.field2699[var57] = var53;
                this.field2678[var57] = var54;
                this.field2718[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method1614() + var56;
                var56 = var55;
                this.field2699[var57] = var53;
                this.field2678[var57] = var61;
                this.field2718[var57] = var55;
            }
        }
        var4.field1722 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field2688[var62] = 0;
            this.field2690[var62] = (short) var4.method1712();
            this.field2691[var62] = (short) var4.method1712();
            this.field2672[var62] = (short) var4.method1712();
        }
        if (this.field2683 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field2683[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field2690[var65] & 0xFFFF) == this.field2699[var64] && (this.field2691[var65] & 0xFFFF) == this.field2678[var64] && (this.field2672[var65] & 0xFFFF) == this.field2718[var64]) {
                        this.field2683[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field2683 = null;
            }
        }
        if (!var3) {
            this.field2676 = null;
        }
        if (!var2) {
            this.field2680 = null;
        }
    }

    public class180(class180[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field2687 = 0;
        this.field2711 = 0;
        this.field2695 = 0;
        this.field2686 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class180 var10 = arg0[var9];
            if (var10 != null) {
                this.field2687 += var10.field2687;
                this.field2711 += var10.field2711;
                this.field2695 += var10.field2695;
                if (var10.field2681 == null) {
                    if (this.field2686 == -1) {
                        this.field2686 = var10.field2686;
                    }
                    if (this.field2686 != var10.field2686) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field2680 != null;
                var5 |= var10.field2682 != null;
                var6 |= var10.field2700 != null;
                var7 |= var10.field2676 != null;
                var8 |= var10.field2683 != null;
            }
        }
        this.field2673 = new int[this.field2687];
        this.field2674 = new int[this.field2687];
        this.field2677 = new int[this.field2687];
        this.field2685 = new int[this.field2687];
        this.field2699 = new int[this.field2711];
        this.field2678 = new int[this.field2711];
        this.field2718 = new int[this.field2711];
        if (var3) {
            this.field2680 = new byte[this.field2711];
        }
        if (var4) {
            this.field2681 = new byte[this.field2711];
        }
        if (var5) {
            this.field2682 = new byte[this.field2711];
        }
        if (var6) {
            this.field2700 = new int[this.field2711];
        }
        if (var7) {
            this.field2676 = new short[this.field2711];
        }
        if (var8) {
            this.field2683 = new byte[this.field2711];
        }
        this.field2684 = new short[this.field2711];
        if (this.field2695 > 0) {
            this.field2688 = new byte[this.field2695];
            this.field2690 = new short[this.field2695];
            this.field2691 = new short[this.field2695];
            this.field2672 = new short[this.field2695];
            this.field2675 = new short[this.field2695];
            this.field2693 = new short[this.field2695];
            this.field2694 = new short[this.field2695];
            this.field2679 = new short[this.field2695];
            this.field2698 = new byte[this.field2695];
            this.field2696 = new short[this.field2695];
            this.field2689 = new short[this.field2695];
        }
        this.field2687 = 0;
        this.field2711 = 0;
        this.field2695 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class180 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field2711; var13++) {
                    if (var3 && var12.field2680 != null) {
                        this.field2680[this.field2711] = var12.field2680[var13];
                    }
                    if (var4) {
                        if (var12.field2681 == null) {
                            this.field2681[this.field2711] = var12.field2686;
                        } else {
                            this.field2681[this.field2711] = var12.field2681[var13];
                        }
                    }
                    if (var5 && var12.field2682 != null) {
                        this.field2682[this.field2711] = var12.field2682[var13];
                    }
                    if (var6 && var12.field2700 != null) {
                        this.field2700[this.field2711] = var12.field2700[var13];
                    }
                    if (var7) {
                        if (var12.field2676 == null) {
                            this.field2676[this.field2711] = -1;
                        } else {
                            this.field2676[this.field2711] = var12.field2676[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field2683 == null || var12.field2683[var13] == -1) {
                            this.field2683[this.field2711] = -1;
                        } else {
                            this.field2683[this.field2711] = (byte) (var12.field2683[var13] + this.field2695);
                        }
                    }
                    this.field2684[this.field2711] = var12.field2684[var13];
                    this.field2699[this.field2711] = this.method2921(var12, var12.field2699[var13]);
                    this.field2678[this.field2711] = this.method2921(var12, var12.field2678[var13]);
                    this.field2718[this.field2711] = this.method2921(var12, var12.field2718[var13]);
                    this.field2711++;
                }
                for (int var14 = 0; var14 < var12.field2695; var14++) {
                    byte var15 = this.field2688[this.field2695] = var12.field2688[var14];
                    if (var15 == 0) {
                        this.field2690[this.field2695] = (short) this.method2921(var12, var12.field2690[var14]);
                        this.field2691[this.field2695] = (short) this.method2921(var12, var12.field2691[var14]);
                        this.field2672[this.field2695] = (short) this.method2921(var12, var12.field2672[var14]);
                    }
                    if (var15 >= 1 && var15 <= 3) {
                        this.field2690[this.field2695] = var12.field2690[var14];
                        this.field2691[this.field2695] = var12.field2691[var14];
                        this.field2672[this.field2695] = var12.field2672[var14];
                        this.field2675[this.field2695] = var12.field2675[var14];
                        this.field2693[this.field2695] = var12.field2693[var14];
                        this.field2694[this.field2695] = var12.field2694[var14];
                        this.field2679[this.field2695] = var12.field2679[var14];
                        this.field2698[this.field2695] = var12.field2698[var14];
                        this.field2696[this.field2695] = var12.field2696[var14];
                    }
                    if (var15 == 2) {
                        this.field2689[this.field2695] = var12.field2689[var14];
                    }
                    this.field2695++;
                }
            }
        }
    }

    @ObfuscatedName("fy.z(Lfy;I)I")
    public final int method2921(class180 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field2673[arg1];
        int var5 = arg0.field2674[arg1];
        int var6 = arg0.field2677[arg1];
        for (int var7 = 0; var7 < this.field2687; var7++) {
            if (this.field2673[var7] == var4 && this.field2674[var7] == var5 && this.field2677[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field2673[this.field2687] = var4;
            this.field2674[this.field2687] = var5;
            this.field2677[this.field2687] = var6;
            if (arg0.field2685 != null) {
                this.field2685[this.field2687] = arg0.field2685[arg1];
            }
            var3 = this.field2687++;
        }
        return var3;
    }

    public class180(class180 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field2687 = arg0.field2687;
        this.field2711 = arg0.field2711;
        this.field2695 = arg0.field2695;
        if (arg1) {
            this.field2673 = arg0.field2673;
            this.field2674 = arg0.field2674;
            this.field2677 = arg0.field2677;
        } else {
            this.field2673 = new int[this.field2687];
            this.field2674 = new int[this.field2687];
            this.field2677 = new int[this.field2687];
            for (int var6 = 0; var6 < this.field2687; var6++) {
                this.field2673[var6] = arg0.field2673[var6];
                this.field2674[var6] = arg0.field2674[var6];
                this.field2677[var6] = arg0.field2677[var6];
            }
        }
        if (arg2) {
            this.field2684 = arg0.field2684;
        } else {
            this.field2684 = new short[this.field2711];
            for (int var7 = 0; var7 < this.field2711; var7++) {
                this.field2684[var7] = arg0.field2684[var7];
            }
        }
        if (arg3 || arg0.field2676 == null) {
            this.field2676 = arg0.field2676;
        } else {
            this.field2676 = new short[this.field2711];
            for (int var8 = 0; var8 < this.field2711; var8++) {
                this.field2676[var8] = arg0.field2676[var8];
            }
        }
        if (arg4) {
            this.field2682 = arg0.field2682;
        } else {
            this.field2682 = new byte[this.field2711];
            if (arg0.field2682 == null) {
                for (int var9 = 0; var9 < this.field2711; var9++) {
                    this.field2682[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field2711; var10++) {
                    this.field2682[var10] = arg0.field2682[var10];
                }
            }
        }
        this.field2699 = arg0.field2699;
        this.field2678 = arg0.field2678;
        this.field2718 = arg0.field2718;
        this.field2680 = arg0.field2680;
        this.field2681 = arg0.field2681;
        this.field2683 = arg0.field2683;
        this.field2686 = arg0.field2686;
        this.field2688 = arg0.field2688;
        this.field2690 = arg0.field2690;
        this.field2691 = arg0.field2691;
        this.field2672 = arg0.field2672;
        this.field2675 = arg0.field2675;
        this.field2693 = arg0.field2693;
        this.field2694 = arg0.field2694;
        this.field2679 = arg0.field2679;
        this.field2698 = arg0.field2698;
        this.field2696 = arg0.field2696;
        this.field2689 = arg0.field2689;
        this.field2685 = arg0.field2685;
        this.field2700 = arg0.field2700;
        this.field2701 = arg0.field2701;
        this.field2702 = arg0.field2702;
        this.field2704 = arg0.field2704;
        this.field2703 = arg0.field2703;
        this.field2705 = arg0.field2705;
        this.field2706 = arg0.field2706;
        this.field2707 = arg0.field2707;
    }

    @ObfuscatedName("fy.n()Lfy;")
    public class180 method2922() {
        class180 var1 = new class180();
        if (this.field2680 != null) {
            var1.field2680 = new byte[this.field2711];
            for (int var2 = 0; var2 < this.field2711; var2++) {
                var1.field2680[var2] = this.field2680[var2];
            }
        }
        var1.field2687 = this.field2687;
        var1.field2711 = this.field2711;
        var1.field2695 = this.field2695;
        var1.field2673 = this.field2673;
        var1.field2674 = this.field2674;
        var1.field2677 = this.field2677;
        var1.field2699 = this.field2699;
        var1.field2678 = this.field2678;
        var1.field2718 = this.field2718;
        var1.field2681 = this.field2681;
        var1.field2682 = this.field2682;
        var1.field2683 = this.field2683;
        var1.field2684 = this.field2684;
        var1.field2676 = this.field2676;
        var1.field2686 = this.field2686;
        var1.field2688 = this.field2688;
        var1.field2690 = this.field2690;
        var1.field2691 = this.field2691;
        var1.field2672 = this.field2672;
        var1.field2675 = this.field2675;
        var1.field2693 = this.field2693;
        var1.field2694 = this.field2694;
        var1.field2679 = this.field2679;
        var1.field2698 = this.field2698;
        var1.field2696 = this.field2696;
        var1.field2689 = this.field2689;
        var1.field2685 = this.field2685;
        var1.field2700 = this.field2700;
        var1.field2701 = this.field2701;
        var1.field2702 = this.field2702;
        var1.field2704 = this.field2704;
        var1.field2703 = this.field2703;
        var1.field2706 = this.field2706;
        var1.field2707 = this.field2707;
        return var1;
    }

    @ObfuscatedName("fy.x([[IIIIZI)Lfy;")
    public class180 method2997(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2963();
        int var7 = this.field2710 + arg1;
        int var8 = this.field2692 + arg1;
        int var9 = this.field2713 + arg3;
        int var10 = this.field2712 + arg3;
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
            var15.field2687 = this.field2687;
            var15.field2711 = this.field2711;
            var15.field2695 = this.field2695;
            var15.field2673 = this.field2673;
            var15.field2677 = this.field2677;
            var15.field2699 = this.field2699;
            var15.field2678 = this.field2678;
            var15.field2718 = this.field2718;
            var15.field2680 = this.field2680;
            var15.field2681 = this.field2681;
            var15.field2682 = this.field2682;
            var15.field2683 = this.field2683;
            var15.field2684 = this.field2684;
            var15.field2676 = this.field2676;
            var15.field2686 = this.field2686;
            var15.field2688 = this.field2688;
            var15.field2690 = this.field2690;
            var15.field2691 = this.field2691;
            var15.field2672 = this.field2672;
            var15.field2675 = this.field2675;
            var15.field2693 = this.field2693;
            var15.field2694 = this.field2694;
            var15.field2679 = this.field2679;
            var15.field2698 = this.field2698;
            var15.field2696 = this.field2696;
            var15.field2689 = this.field2689;
            var15.field2685 = this.field2685;
            var15.field2700 = this.field2700;
            var15.field2701 = this.field2701;
            var15.field2702 = this.field2702;
            var15.field2706 = this.field2706;
            var15.field2707 = this.field2707;
            var15.field2674 = new int[var15.field2687];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field2687; var16++) {
                int var17 = this.field2673[var16] + arg1;
                int var18 = this.field2677[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field2674[var16] = this.field2674[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field2687; var26++) {
                int var27 = (-this.field2674[var26] << 16) / this.field2489;
                if (var27 < arg5) {
                    int var28 = this.field2673[var26] + arg1;
                    int var29 = this.field2677[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field2674[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field2674[var26];
                }
            }
        }
        var15.method2935();
        return var15;
    }

    @ObfuscatedName("fy.i()V")
    public void method2945() {
        int var10002;
        if (this.field2685 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field2687; var3++) {
                int var4 = this.field2685[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field2701 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field2701[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field2687) {
                int var7 = this.field2685[var6];
                this.field2701[var7][var1[var7]++] = var6++;
            }
            this.field2685 = null;
        }
        if (this.field2700 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field2711; var10++) {
            int var11 = this.field2700[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field2702 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field2702[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field2711) {
            int var14 = this.field2700[var13];
            this.field2702[var14][var8[var14]++] = var13++;
        }
        this.field2700 = null;
    }

    @ObfuscatedName("fy.m()V")
    public void method2925() {
        for (int var1 = 0; var1 < this.field2687; var1++) {
            int var2 = this.field2673[var1];
            this.field2673[var1] = this.field2677[var1];
            this.field2677[var1] = -var2;
        }
        this.method2935();
    }

    @ObfuscatedName("fy.ai()V")
    public void method2984() {
        for (int var1 = 0; var1 < this.field2687; var1++) {
            this.field2673[var1] = -this.field2673[var1];
            this.field2677[var1] = -this.field2677[var1];
        }
        this.method2935();
    }

    @ObfuscatedName("fy.aa()V")
    public void method2955() {
        for (int var1 = 0; var1 < this.field2687; var1++) {
            int var2 = this.field2677[var1];
            this.field2677[var1] = this.field2673[var1];
            this.field2673[var1] = -var2;
        }
        this.method2935();
    }

    @ObfuscatedName("fy.af(I)V")
    public void method2928(int arg0) {
        int var2 = field2717[arg0];
        int var3 = field2708[arg0];
        for (int var4 = 0; var4 < this.field2687; var4++) {
            int var5 = this.field2677[var4] * var2 + this.field2673[var4] * var3 >> 16;
            this.field2677[var4] = this.field2677[var4] * var3 - this.field2673[var4] * var2 >> 16;
            this.field2673[var4] = var5;
        }
        this.method2935();
    }

    @ObfuscatedName("fy.ae(III)V")
    public void method2957(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2687; var4++) {
            this.field2673[var4] += arg0;
            this.field2674[var4] += arg1;
            this.field2677[var4] += arg2;
        }
        this.method2935();
    }

    @ObfuscatedName("fy.at(SS)V")
    public void method2930(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2711; var3++) {
            if (this.field2684[var3] == arg0) {
                this.field2684[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("fy.aj(SS)V")
    public void method2991(short arg0, short arg1) {
        if (this.field2676 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field2711; var3++) {
            if (this.field2676[var3] == arg0) {
                this.field2676[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("fy.ar()V")
    public void method2932() {
        for (int var1 = 0; var1 < this.field2687; var1++) {
            this.field2677[var1] = -this.field2677[var1];
        }
        for (int var2 = 0; var2 < this.field2711; var2++) {
            int var3 = this.field2699[var2];
            this.field2699[var2] = this.field2718[var2];
            this.field2718[var2] = var3;
        }
        this.method2935();
    }

    @ObfuscatedName("fy.au(III)V")
    public void method2933(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2687; var4++) {
            this.field2673[var4] = this.field2673[var4] * arg0 / 128;
            this.field2674[var4] = this.field2674[var4] * arg1 / 128;
            this.field2677[var4] = this.field2677[var4] * arg2 / 128;
        }
        this.method2935();
    }

    @ObfuscatedName("fy.an()V")
    public void method2934() {
        if (this.field2704 != null) {
            return;
        }
        this.field2704 = new class42[this.field2687];
        for (int var1 = 0; var1 < this.field2687; var1++) {
            this.field2704[var1] = new class42();
        }
        for (int var2 = 0; var2 < this.field2711; var2++) {
            int var3 = this.field2699[var2];
            int var4 = this.field2678[var2];
            int var5 = this.field2718[var2];
            int var6 = this.field2673[var4] - this.field2673[var3];
            int var7 = this.field2674[var4] - this.field2674[var3];
            int var8 = this.field2677[var4] - this.field2677[var3];
            int var9 = this.field2673[var5] - this.field2673[var3];
            int var10 = this.field2674[var5] - this.field2674[var3];
            int var11 = this.field2677[var5] - this.field2677[var3];
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
            if (this.field2680 == null) {
                var19 = 0;
            } else {
                var19 = this.field2680[var2];
            }
            if (var19 == 0) {
                class42 var20 = this.field2704[var3];
                var20.field554 += var16;
                var20.field553 += var17;
                var20.field552 += var18;
                var20.field555++;
                class42 var21 = this.field2704[var4];
                var21.field554 += var16;
                var21.field553 += var17;
                var21.field552 += var18;
                var21.field555++;
                class42 var22 = this.field2704[var5];
                var22.field554 += var16;
                var22.field553 += var17;
                var22.field552 += var18;
                var22.field555++;
            } else if (var19 == 1) {
                if (this.field2703 == null) {
                    this.field2703 = new class43[this.field2711];
                }
                class43 var23 = this.field2703[var2] = new class43();
                var23.field561 = var16;
                var23.field560 = var17;
                var23.field559 = var18;
            }
        }
    }

    @ObfuscatedName("fy.az()V")
    public void method2935() {
        this.field2704 = null;
        this.field2705 = null;
        this.field2703 = null;
        this.field2697 = false;
    }

    @ObfuscatedName("fy.ac()V")
    public void method2963() {
        if (this.field2697) {
            return;
        }
        this.field2489 = 0;
        this.field2709 = 0;
        this.field2710 = 999999;
        this.field2692 = -999999;
        this.field2712 = -99999;
        this.field2713 = 99999;
        for (int var1 = 0; var1 < this.field2687; var1++) {
            int var2 = this.field2673[var1];
            int var3 = this.field2674[var1];
            int var4 = this.field2677[var1];
            if (var2 < this.field2710) {
                this.field2710 = var2;
            }
            if (var2 > this.field2692) {
                this.field2692 = var2;
            }
            if (var4 < this.field2713) {
                this.field2713 = var4;
            }
            if (var4 > this.field2712) {
                this.field2712 = var4;
            }
            if (-var3 > this.field2489) {
                this.field2489 = -var3;
            }
            if (var3 > this.field2709) {
                this.field2709 = var3;
            }
        }
        this.field2697 = true;
    }

    @ObfuscatedName("fy.ap(Lfy;Lfy;IIIZ)V")
    public static void method2961(class180 arg0, class180 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method2963();
        arg0.method2934();
        arg1.method2963();
        arg1.method2934();
        field2716++;
        int var6 = 0;
        int[] var7 = arg1.field2673;
        int var8 = arg1.field2687;
        for (int var9 = 0; var9 < arg0.field2687; var9++) {
            class42 var10 = arg0.field2704[var9];
            if (var10.field555 != 0) {
                int var11 = arg0.field2674[var9] - arg3;
                if (var11 <= arg1.field2709) {
                    int var12 = arg0.field2673[var9] - arg2;
                    if (var12 >= arg1.field2710 && var12 <= arg1.field2692) {
                        int var13 = arg0.field2677[var9] - arg4;
                        if (var13 >= arg1.field2713 && var13 <= arg1.field2712) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class42 var15 = arg1.field2704[var14];
                                if (var7[var14] == var12 && arg1.field2677[var14] == var13 && arg1.field2674[var14] == var11 && var15.field555 != 0) {
                                    if (arg0.field2705 == null) {
                                        arg0.field2705 = new class42[arg0.field2687];
                                    }
                                    if (arg1.field2705 == null) {
                                        arg1.field2705 = new class42[var8];
                                    }
                                    class42 var16 = arg0.field2705[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field2705[var9] = new class42(var10);
                                    }
                                    class42 var17 = arg1.field2705[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field2705[var14] = new class42(var15);
                                    }
                                    var16.field554 += var15.field554;
                                    var16.field553 += var15.field553;
                                    var16.field552 += var15.field552;
                                    var16.field555 += var15.field555;
                                    var17.field554 += var10.field554;
                                    var17.field553 += var10.field553;
                                    var17.field552 += var10.field552;
                                    var17.field555 += var10.field555;
                                    var6++;
                                    field2714[var9] = field2716;
                                    field2715[var14] = field2716;
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
        for (int var18 = 0; var18 < arg0.field2711; var18++) {
            if (field2714[arg0.field2699[var18]] == field2716 && field2714[arg0.field2678[var18]] == field2716 && field2714[arg0.field2718[var18]] == field2716) {
                if (arg0.field2680 == null) {
                    arg0.field2680 = new byte[arg0.field2711];
                }
                arg0.field2680[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field2711; var19++) {
            if (field2715[arg1.field2699[var19]] == field2716 && field2715[arg1.field2678[var19]] == field2716 && field2715[arg1.field2718[var19]] == field2716) {
                if (arg1.field2680 == null) {
                    arg1.field2680 = new byte[arg1.field2711];
                }
                arg1.field2680[var19] = 2;
            }
        }
    }

    @ObfuscatedName("fy.ad(IIIII)Lfb;")
    public final class181 method2938(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2934();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class181 var8 = new class181();
        var8.field2738 = new int[this.field2711];
        var8.field2751 = new int[this.field2711];
        var8.field2741 = new int[this.field2711];
        if (this.field2695 > 0 && this.field2683 != null) {
            int[] var9 = new int[this.field2695];
            for (int var10 = 0; var10 < this.field2711; var10++) {
                if (this.field2683[var10] != -1) {
                    var9[this.field2683[var10] & 0xFF]++;
                }
            }
            var8.field2739 = 0;
            for (int var11 = 0; var11 < this.field2695; var11++) {
                if (var9[var11] > 0 && this.field2688[var11] == 0) {
                    var8.field2739++;
                }
            }
            var8.field2764 = new int[var8.field2739];
            var8.field2731 = new int[var8.field2739];
            var8.field2742 = new int[var8.field2739];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field2695; var13++) {
                if (var9[var13] > 0 && this.field2688[var13] == 0) {
                    var8.field2764[var12] = this.field2690[var13] & 0xFFFF;
                    var8.field2731[var12] = this.field2691[var13] & 0xFFFF;
                    var8.field2742[var12] = this.field2672[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field2736 = new byte[this.field2711];
            for (int var14 = 0; var14 < this.field2711; var14++) {
                if (this.field2683[var14] == -1) {
                    var8.field2736[var14] = -1;
                } else {
                    var8.field2736[var14] = (byte) var9[this.field2683[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field2711; var15++) {
            byte var16;
            if (this.field2680 == null) {
                var16 = 0;
            } else {
                var16 = this.field2680[var15];
            }
            byte var17;
            if (this.field2682 == null) {
                var17 = 0;
            } else {
                var17 = this.field2682[var15];
            }
            short var18;
            if (this.field2676 == null) {
                var18 = -1;
            } else {
                var18 = this.field2676[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field2684[var15] & 0xFFFF;
                    class42 var20;
                    if (this.field2705 == null || this.field2705[this.field2699[var15]] == null) {
                        var20 = this.field2704[this.field2699[var15]];
                    } else {
                        var20 = this.field2705[this.field2699[var15]];
                    }
                    int var21 = (var20.field552 * arg4 + var20.field554 * arg2 + var20.field553 * arg3) / (var20.field555 * var7) + arg0;
                    var8.field2738[var15] = method2939(var19, var21);
                    class42 var22;
                    if (this.field2705 == null || this.field2705[this.field2678[var15]] == null) {
                        var22 = this.field2704[this.field2678[var15]];
                    } else {
                        var22 = this.field2705[this.field2678[var15]];
                    }
                    int var23 = (var22.field552 * arg4 + var22.field554 * arg2 + var22.field553 * arg3) / (var22.field555 * var7) + arg0;
                    var8.field2751[var15] = method2939(var19, var23);
                    class42 var24;
                    if (this.field2705 == null || this.field2705[this.field2718[var15]] == null) {
                        var24 = this.field2704[this.field2718[var15]];
                    } else {
                        var24 = this.field2705[this.field2718[var15]];
                    }
                    int var25 = (var24.field552 * arg4 + var24.field554 * arg2 + var24.field553 * arg3) / (var24.field555 * var7) + arg0;
                    var8.field2741[var15] = method2939(var19, var25);
                } else if (var16 == 1) {
                    class43 var26 = this.field2703[var15];
                    int var27 = (var26.field559 * arg4 + var26.field561 * arg2 + var26.field560 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field2738[var15] = method2939(this.field2684[var15] & 0xFFFF, var27);
                    var8.field2741[var15] = -1;
                } else if (var16 == 3) {
                    var8.field2738[var15] = 128;
                    var8.field2741[var15] = -1;
                } else {
                    var8.field2741[var15] = -2;
                }
            } else if (var16 == 0) {
                class42 var28;
                if (this.field2705 == null || this.field2705[this.field2699[var15]] == null) {
                    var28 = this.field2704[this.field2699[var15]];
                } else {
                    var28 = this.field2705[this.field2699[var15]];
                }
                int var29 = (var28.field552 * arg4 + var28.field554 * arg2 + var28.field553 * arg3) / (var28.field555 * var7) + arg0;
                var8.field2738[var15] = method2940(var29);
                class42 var30;
                if (this.field2705 == null || this.field2705[this.field2678[var15]] == null) {
                    var30 = this.field2704[this.field2678[var15]];
                } else {
                    var30 = this.field2705[this.field2678[var15]];
                }
                int var31 = (var30.field552 * arg4 + var30.field554 * arg2 + var30.field553 * arg3) / (var30.field555 * var7) + arg0;
                var8.field2751[var15] = method2940(var31);
                class42 var32;
                if (this.field2705 == null || this.field2705[this.field2718[var15]] == null) {
                    var32 = this.field2704[this.field2718[var15]];
                } else {
                    var32 = this.field2705[this.field2718[var15]];
                }
                int var33 = (var32.field552 * arg4 + var32.field554 * arg2 + var32.field553 * arg3) / (var32.field555 * var7) + arg0;
                var8.field2741[var15] = method2940(var33);
            } else if (var16 == 1) {
                class43 var34 = this.field2703[var15];
                int var35 = (var34.field559 * arg4 + var34.field561 * arg2 + var34.field560 * arg3) / (var7 / 2 + var7) + arg0;
                var8.field2738[var15] = method2940(var35);
                var8.field2741[var15] = -1;
            } else {
                var8.field2741[var15] = -2;
            }
        }
        this.method2945();
        var8.field2723 = this.field2687;
        var8.field2757 = this.field2673;
        var8.field2725 = this.field2674;
        var8.field2726 = this.field2677;
        var8.field2727 = this.field2711;
        var8.field2728 = this.field2699;
        var8.field2778 = this.field2678;
        var8.field2730 = this.field2718;
        var8.field2734 = this.field2681;
        var8.field2735 = this.field2682;
        var8.field2724 = this.field2686;
        var8.field2719 = this.field2701;
        var8.field2785 = this.field2702;
        var8.field2737 = this.field2676;
        return var8;
    }

    @ObfuscatedName("fy.ax(II)I")
    public static final int method2939(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("fy.as(I)I")
    public static final int method2940(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
