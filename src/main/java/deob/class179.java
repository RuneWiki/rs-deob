package deob;

@ObfuscatedName("fv")
public class class179 extends class165 {

    @ObfuscatedName("fv.l")
    public int field2671 = 0;

    @ObfuscatedName("fv.i")
    public int[] field2672;

    @ObfuscatedName("fv.e")
    public int[] field2673;

    @ObfuscatedName("fv.a")
    public int[] field2674;

    @ObfuscatedName("fv.g")
    public int field2675 = 0;

    @ObfuscatedName("fv.w")
    public int[] field2676;

    @ObfuscatedName("fv.v")
    public int[] field2691;

    @ObfuscatedName("fv.u")
    public int[] field2678;

    @ObfuscatedName("fv.m")
    public byte[] field2679;

    @ObfuscatedName("fv.b")
    public byte[] field2680;

    @ObfuscatedName("fv.f")
    public byte[] field2681;

    @ObfuscatedName("fv.d")
    public byte[] field2682;

    @ObfuscatedName("fv.x")
    public short[] field2689;

    @ObfuscatedName("fv.z")
    public short[] field2684;

    @ObfuscatedName("fv.o")
    public byte field2685 = 0;

    @ObfuscatedName("fv.c")
    public int field2686;

    @ObfuscatedName("fv.y")
    public byte[] field2690;

    @ObfuscatedName("fv.j")
    public short[] field2688;

    @ObfuscatedName("fv.s")
    public short[] field2703;

    @ObfuscatedName("fv.p")
    public short[] field2705;

    @ObfuscatedName("fv.ak")
    public short[] field2701;

    @ObfuscatedName("fv.ap")
    public short[] field2702;

    @ObfuscatedName("fv.ai")
    public short[] field2693;

    @ObfuscatedName("fv.ae")
    public short[] field2694;

    @ObfuscatedName("fv.ad")
    public short[] field2695;

    @ObfuscatedName("fv.am")
    public short[] field2696;

    @ObfuscatedName("fv.ah")
    public byte[] field2697;

    @ObfuscatedName("fv.au")
    public int[] field2698;

    @ObfuscatedName("fv.ac")
    public int[] field2716;

    @ObfuscatedName("fv.at")
    public int[][] field2699;

    @ObfuscatedName("fv.aq")
    public int[][] field2713;

    @ObfuscatedName("fv.ar")
    public class42[] field2707;

    @ObfuscatedName("fv.aa")
    public class41[] field2700;

    @ObfuscatedName("fv.ay")
    public class41[] field2704;

    @ObfuscatedName("fv.ax")
    public short field2677;

    @ObfuscatedName("fv.av")
    public short field2683;

    @ObfuscatedName("fv.az")
    public boolean field2706 = false;

    @ObfuscatedName("fv.al")
    public int field2708;

    @ObfuscatedName("fv.ag")
    public int field2709;

    @ObfuscatedName("fv.as")
    public int field2687;

    @ObfuscatedName("fv.ab")
    public int field2711;

    @ObfuscatedName("fv.af")
    public int field2712;

    @ObfuscatedName("fv.an")
    public static int[] field2692 = new int[10000];

    @ObfuscatedName("fv.aj")
    public static int[] field2714 = new int[10000];

    @ObfuscatedName("fv.ao")
    public static int field2715 = 0;

    @ObfuscatedName("fv.aw")
    public static int[] field2710 = class172.field2543;

    @ObfuscatedName("fv.bk")
    public static int[] field2717 = class172.field2544;

    public class179() {
    }

    @ObfuscatedName("fv.w(Lcy;II)Lfv;")
    public static class179 method2908(class86 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1015(arg1, arg2);
        return var3 == null ? null : new class179(var3);
    }

    public class179(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method2909(arg0);
        } else {
            this.method2941(arg0);
        }
    }

    @ObfuscatedName("fv.v([B)V")
    public void method2909(byte[] arg0) {
        class135 var2 = new class135(arg0);
        class135 var3 = new class135(arg0);
        class135 var4 = new class135(arg0);
        class135 var5 = new class135(arg0);
        class135 var6 = new class135(arg0);
        class135 var7 = new class135(arg0);
        class135 var8 = new class135(arg0);
        var2.field1722 = arg0.length - 23;
        int var9 = var2.method1725();
        int var10 = var2.method1725();
        int var11 = var2.method1571();
        int var12 = var2.method1571();
        int var13 = var2.method1571();
        int var14 = var2.method1571();
        int var15 = var2.method1571();
        int var16 = var2.method1571();
        int var17 = var2.method1571();
        int var18 = var2.method1725();
        int var19 = var2.method1725();
        int var20 = var2.method1725();
        int var21 = var2.method1725();
        int var22 = var2.method1725();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field2690 = new byte[var11];
            var2.field1722 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field2690[var26] = var2.method1572();
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
        this.field2671 = var9;
        this.field2675 = var10;
        this.field2686 = var11;
        this.field2672 = new int[var9];
        this.field2673 = new int[var9];
        this.field2674 = new int[var9];
        this.field2676 = new int[var10];
        this.field2691 = new int[var10];
        this.field2678 = new int[var10];
        if (var17 == 1) {
            this.field2698 = new int[var9];
        }
        if (var12 == 1) {
            this.field2679 = new byte[var10];
        }
        if (var13 == 255) {
            this.field2680 = new byte[var10];
        } else {
            this.field2685 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2681 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2716 = new int[var10];
        }
        if (var16 == 1) {
            this.field2684 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field2682 = new byte[var10];
        }
        this.field2689 = new short[var10];
        if (var11 > 0) {
            this.field2688 = new short[var11];
            this.field2703 = new short[var11];
            this.field2705 = new short[var11];
            if (var24 > 0) {
                this.field2701 = new short[var24];
                this.field2702 = new short[var24];
                this.field2693 = new short[var24];
                this.field2694 = new short[var24];
                this.field2697 = new byte[var24];
                this.field2695 = new short[var24];
            }
            if (var25 > 0) {
                this.field2696 = new short[var25];
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
            int var68 = var2.method1571();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method1583();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method1583();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method1583();
            }
            this.field2672[var67] = var64 + var69;
            this.field2673[var67] = var65 + var70;
            this.field2674[var67] = var66 + var71;
            var64 = this.field2672[var67];
            var65 = this.field2673[var67];
            var66 = this.field2674[var67];
            if (var17 == 1) {
                this.field2698[var67] = var6.method1571();
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
            this.field2689[var72] = (short) var2.method1725();
            if (var12 == 1) {
                this.field2679[var72] = var3.method1572();
            }
            if (var13 == 255) {
                this.field2680[var72] = var4.method1572();
            }
            if (var14 == 1) {
                this.field2681[var72] = var5.method1572();
            }
            if (var15 == 1) {
                this.field2716[var72] = var6.method1571();
            }
            if (var16 == 1) {
                this.field2684[var72] = (short) (var7.method1725() - 1);
            }
            if (this.field2682 != null && this.field2684[var72] != -1) {
                this.field2682[var72] = (byte) (var8.method1571() - 1);
            }
        }
        var2.field1722 = var33;
        var3.field1722 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method1571();
            if (var78 == 1) {
                var73 = var2.method1583() + var76;
                var74 = var2.method1583() + var73;
                var75 = var2.method1583() + var74;
                var76 = var75;
                this.field2676[var77] = var73;
                this.field2691[var77] = var74;
                this.field2678[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method1583() + var76;
                var76 = var75;
                this.field2676[var77] = var73;
                this.field2691[var77] = var74;
                this.field2678[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method1583() + var76;
                var76 = var75;
                this.field2676[var77] = var73;
                this.field2691[var77] = var74;
                this.field2678[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method1583() + var76;
                var76 = var75;
                this.field2676[var77] = var73;
                this.field2691[var77] = var81;
                this.field2678[var77] = var75;
            }
        }
        var2.field1722 = var50;
        var3.field1722 = var52;
        var4.field1722 = var54;
        var5.field1722 = var56;
        var6.field1722 = var58;
        var7.field1722 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field2690[var82] & 0xFF;
            if (var83 == 0) {
                this.field2688[var82] = (short) var2.method1725();
                this.field2703[var82] = (short) var2.method1725();
                this.field2705[var82] = (short) var2.method1725();
            }
            if (var83 == 1) {
                this.field2688[var82] = (short) var3.method1725();
                this.field2703[var82] = (short) var3.method1725();
                this.field2705[var82] = (short) var3.method1725();
                this.field2701[var82] = (short) var4.method1725();
                this.field2702[var82] = (short) var4.method1725();
                this.field2693[var82] = (short) var4.method1725();
                this.field2694[var82] = (short) var5.method1725();
                this.field2697[var82] = var6.method1572();
                this.field2695[var82] = (short) var7.method1725();
            }
            if (var83 == 2) {
                this.field2688[var82] = (short) var3.method1725();
                this.field2703[var82] = (short) var3.method1725();
                this.field2705[var82] = (short) var3.method1725();
                this.field2701[var82] = (short) var4.method1725();
                this.field2702[var82] = (short) var4.method1725();
                this.field2693[var82] = (short) var4.method1725();
                this.field2694[var82] = (short) var5.method1725();
                this.field2697[var82] = var6.method1572();
                this.field2695[var82] = (short) var7.method1725();
                this.field2696[var82] = (short) var7.method1725();
            }
            if (var83 == 3) {
                this.field2688[var82] = (short) var3.method1725();
                this.field2703[var82] = (short) var3.method1725();
                this.field2705[var82] = (short) var3.method1725();
                this.field2701[var82] = (short) var4.method1725();
                this.field2702[var82] = (short) var4.method1725();
                this.field2693[var82] = (short) var4.method1725();
                this.field2694[var82] = (short) var5.method1725();
                this.field2697[var82] = var6.method1572();
                this.field2695[var82] = (short) var7.method1725();
            }
        }
        var2.field1722 = var62;
        int var84 = var2.method1571();
        if (var84 == 0) {
            return;
        }
        new class50();
        var2.method1725();
        var2.method1725();
        var2.method1725();
        var2.method1616();
    }

    @ObfuscatedName("fv.u([B)V")
    public void method2941(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class135 var4 = new class135(arg0);
        class135 var5 = new class135(arg0);
        class135 var6 = new class135(arg0);
        class135 var7 = new class135(arg0);
        class135 var8 = new class135(arg0);
        var4.field1722 = arg0.length - 18;
        int var9 = var4.method1725();
        int var10 = var4.method1725();
        int var11 = var4.method1571();
        int var12 = var4.method1571();
        int var13 = var4.method1571();
        int var14 = var4.method1571();
        int var15 = var4.method1571();
        int var16 = var4.method1571();
        int var17 = var4.method1725();
        int var18 = var4.method1725();
        int var19 = var4.method1725();
        int var20 = var4.method1725();
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
        this.field2671 = var9;
        this.field2675 = var10;
        this.field2686 = var11;
        this.field2672 = new int[var9];
        this.field2673 = new int[var9];
        this.field2674 = new int[var9];
        this.field2676 = new int[var10];
        this.field2691 = new int[var10];
        this.field2678 = new int[var10];
        if (var11 > 0) {
            this.field2690 = new byte[var11];
            this.field2688 = new short[var11];
            this.field2703 = new short[var11];
            this.field2705 = new short[var11];
        }
        if (var16 == 1) {
            this.field2698 = new int[var9];
        }
        if (var12 == 1) {
            this.field2679 = new byte[var10];
            this.field2682 = new byte[var10];
            this.field2684 = new short[var10];
        }
        if (var13 == 255) {
            this.field2680 = new byte[var10];
        } else {
            this.field2685 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2681 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2716 = new int[var10];
        }
        this.field2689 = new short[var10];
        var4.field1722 = var21;
        var5.field1722 = var36;
        var6.field1722 = var38;
        var7.field1722 = var40;
        var8.field1722 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method1571();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method1583();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method1583();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method1583();
            }
            this.field2672[var46] = var43 + var48;
            this.field2673[var46] = var44 + var49;
            this.field2674[var46] = var45 + var50;
            var43 = this.field2672[var46];
            var44 = this.field2673[var46];
            var45 = this.field2674[var46];
            if (var16 == 1) {
                this.field2698[var46] = var8.method1571();
            }
        }
        var4.field1722 = var32;
        var5.field1722 = var28;
        var6.field1722 = var26;
        var7.field1722 = var30;
        var8.field1722 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field2689[var51] = (short) var4.method1725();
            if (var12 == 1) {
                int var52 = var5.method1571();
                if ((var52 & 0x1) == 1) {
                    this.field2679[var51] = 1;
                    var2 = true;
                } else {
                    this.field2679[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field2682[var51] = (byte) (var52 >> 2);
                    this.field2684[var51] = this.field2689[var51];
                    this.field2689[var51] = 127;
                    if (this.field2684[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field2682[var51] = -1;
                    this.field2684[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field2680[var51] = var6.method1572();
            }
            if (var14 == 1) {
                this.field2681[var51] = var7.method1572();
            }
            if (var15 == 1) {
                this.field2716[var51] = var8.method1571();
            }
        }
        var4.field1722 = var25;
        var5.field1722 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method1571();
            if (var58 == 1) {
                var53 = var4.method1583() + var56;
                var54 = var4.method1583() + var53;
                var55 = var4.method1583() + var54;
                var56 = var55;
                this.field2676[var57] = var53;
                this.field2691[var57] = var54;
                this.field2678[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method1583() + var56;
                var56 = var55;
                this.field2676[var57] = var53;
                this.field2691[var57] = var54;
                this.field2678[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method1583() + var56;
                var56 = var55;
                this.field2676[var57] = var53;
                this.field2691[var57] = var54;
                this.field2678[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method1583() + var56;
                var56 = var55;
                this.field2676[var57] = var53;
                this.field2691[var57] = var61;
                this.field2678[var57] = var55;
            }
        }
        var4.field1722 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field2690[var62] = 0;
            this.field2688[var62] = (short) var4.method1725();
            this.field2703[var62] = (short) var4.method1725();
            this.field2705[var62] = (short) var4.method1725();
        }
        if (this.field2682 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field2682[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field2688[var65] & 0xFFFF) == this.field2676[var64] && (this.field2703[var65] & 0xFFFF) == this.field2691[var64] && (this.field2705[var65] & 0xFFFF) == this.field2678[var64]) {
                        this.field2682[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field2682 = null;
            }
        }
        if (!var3) {
            this.field2684 = null;
        }
        if (!var2) {
            this.field2679 = null;
        }
    }

    public class179(class179[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field2671 = 0;
        this.field2675 = 0;
        this.field2686 = 0;
        this.field2685 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class179 var10 = arg0[var9];
            if (var10 != null) {
                this.field2671 += var10.field2671;
                this.field2675 += var10.field2675;
                this.field2686 += var10.field2686;
                if (var10.field2680 == null) {
                    if (this.field2685 == -1) {
                        this.field2685 = var10.field2685;
                    }
                    if (this.field2685 != var10.field2685) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field2679 != null;
                var5 |= var10.field2681 != null;
                var6 |= var10.field2716 != null;
                var7 |= var10.field2684 != null;
                var8 |= var10.field2682 != null;
            }
        }
        this.field2672 = new int[this.field2671];
        this.field2673 = new int[this.field2671];
        this.field2674 = new int[this.field2671];
        this.field2698 = new int[this.field2671];
        this.field2676 = new int[this.field2675];
        this.field2691 = new int[this.field2675];
        this.field2678 = new int[this.field2675];
        if (var3) {
            this.field2679 = new byte[this.field2675];
        }
        if (var4) {
            this.field2680 = new byte[this.field2675];
        }
        if (var5) {
            this.field2681 = new byte[this.field2675];
        }
        if (var6) {
            this.field2716 = new int[this.field2675];
        }
        if (var7) {
            this.field2684 = new short[this.field2675];
        }
        if (var8) {
            this.field2682 = new byte[this.field2675];
        }
        this.field2689 = new short[this.field2675];
        if (this.field2686 > 0) {
            this.field2690 = new byte[this.field2686];
            this.field2688 = new short[this.field2686];
            this.field2703 = new short[this.field2686];
            this.field2705 = new short[this.field2686];
            this.field2701 = new short[this.field2686];
            this.field2702 = new short[this.field2686];
            this.field2693 = new short[this.field2686];
            this.field2694 = new short[this.field2686];
            this.field2697 = new byte[this.field2686];
            this.field2695 = new short[this.field2686];
            this.field2696 = new short[this.field2686];
        }
        this.field2671 = 0;
        this.field2675 = 0;
        this.field2686 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class179 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field2675; var13++) {
                    if (var3 && var12.field2679 != null) {
                        this.field2679[this.field2675] = var12.field2679[var13];
                    }
                    if (var4) {
                        if (var12.field2680 == null) {
                            this.field2680[this.field2675] = var12.field2685;
                        } else {
                            this.field2680[this.field2675] = var12.field2680[var13];
                        }
                    }
                    if (var5 && var12.field2681 != null) {
                        this.field2681[this.field2675] = var12.field2681[var13];
                    }
                    if (var6 && var12.field2716 != null) {
                        this.field2716[this.field2675] = var12.field2716[var13];
                    }
                    if (var7) {
                        if (var12.field2684 == null) {
                            this.field2684[this.field2675] = -1;
                        } else {
                            this.field2684[this.field2675] = var12.field2684[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field2682 == null || var12.field2682[var13] == -1) {
                            this.field2682[this.field2675] = -1;
                        } else {
                            this.field2682[this.field2675] = (byte) (var12.field2682[var13] + this.field2686);
                        }
                    }
                    this.field2689[this.field2675] = var12.field2689[var13];
                    this.field2676[this.field2675] = this.method2911(var12, var12.field2676[var13]);
                    this.field2691[this.field2675] = this.method2911(var12, var12.field2691[var13]);
                    this.field2678[this.field2675] = this.method2911(var12, var12.field2678[var13]);
                    this.field2675++;
                }
                for (int var14 = 0; var14 < var12.field2686; var14++) {
                    byte var15 = this.field2690[this.field2686] = var12.field2690[var14];
                    if (var15 == 0) {
                        this.field2688[this.field2686] = (short) this.method2911(var12, var12.field2688[var14]);
                        this.field2703[this.field2686] = (short) this.method2911(var12, var12.field2703[var14]);
                        this.field2705[this.field2686] = (short) this.method2911(var12, var12.field2705[var14]);
                    }
                    if (var15 >= 1 && var15 <= 3) {
                        this.field2688[this.field2686] = var12.field2688[var14];
                        this.field2703[this.field2686] = var12.field2703[var14];
                        this.field2705[this.field2686] = var12.field2705[var14];
                        this.field2701[this.field2686] = var12.field2701[var14];
                        this.field2702[this.field2686] = var12.field2702[var14];
                        this.field2693[this.field2686] = var12.field2693[var14];
                        this.field2694[this.field2686] = var12.field2694[var14];
                        this.field2697[this.field2686] = var12.field2697[var14];
                        this.field2695[this.field2686] = var12.field2695[var14];
                    }
                    if (var15 == 2) {
                        this.field2696[this.field2686] = var12.field2696[var14];
                    }
                    this.field2686++;
                }
            }
        }
    }

    @ObfuscatedName("fv.m(Lfv;I)I")
    public final int method2911(class179 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field2672[arg1];
        int var5 = arg0.field2673[arg1];
        int var6 = arg0.field2674[arg1];
        for (int var7 = 0; var7 < this.field2671; var7++) {
            if (this.field2672[var7] == var4 && this.field2673[var7] == var5 && this.field2674[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field2672[this.field2671] = var4;
            this.field2673[this.field2671] = var5;
            this.field2674[this.field2671] = var6;
            if (arg0.field2698 != null) {
                this.field2698[this.field2671] = arg0.field2698[arg1];
            }
            var3 = this.field2671++;
        }
        return var3;
    }

    public class179(class179 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field2671 = arg0.field2671;
        this.field2675 = arg0.field2675;
        this.field2686 = arg0.field2686;
        if (arg1) {
            this.field2672 = arg0.field2672;
            this.field2673 = arg0.field2673;
            this.field2674 = arg0.field2674;
        } else {
            this.field2672 = new int[this.field2671];
            this.field2673 = new int[this.field2671];
            this.field2674 = new int[this.field2671];
            for (int var6 = 0; var6 < this.field2671; var6++) {
                this.field2672[var6] = arg0.field2672[var6];
                this.field2673[var6] = arg0.field2673[var6];
                this.field2674[var6] = arg0.field2674[var6];
            }
        }
        if (arg2) {
            this.field2689 = arg0.field2689;
        } else {
            this.field2689 = new short[this.field2675];
            for (int var7 = 0; var7 < this.field2675; var7++) {
                this.field2689[var7] = arg0.field2689[var7];
            }
        }
        if (arg3 || arg0.field2684 == null) {
            this.field2684 = arg0.field2684;
        } else {
            this.field2684 = new short[this.field2675];
            for (int var8 = 0; var8 < this.field2675; var8++) {
                this.field2684[var8] = arg0.field2684[var8];
            }
        }
        if (arg4) {
            this.field2681 = arg0.field2681;
        } else {
            this.field2681 = new byte[this.field2675];
            if (arg0.field2681 == null) {
                for (int var9 = 0; var9 < this.field2675; var9++) {
                    this.field2681[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field2675; var10++) {
                    this.field2681[var10] = arg0.field2681[var10];
                }
            }
        }
        this.field2676 = arg0.field2676;
        this.field2691 = arg0.field2691;
        this.field2678 = arg0.field2678;
        this.field2679 = arg0.field2679;
        this.field2680 = arg0.field2680;
        this.field2682 = arg0.field2682;
        this.field2685 = arg0.field2685;
        this.field2690 = arg0.field2690;
        this.field2688 = arg0.field2688;
        this.field2703 = arg0.field2703;
        this.field2705 = arg0.field2705;
        this.field2701 = arg0.field2701;
        this.field2702 = arg0.field2702;
        this.field2693 = arg0.field2693;
        this.field2694 = arg0.field2694;
        this.field2697 = arg0.field2697;
        this.field2695 = arg0.field2695;
        this.field2696 = arg0.field2696;
        this.field2698 = arg0.field2698;
        this.field2716 = arg0.field2716;
        this.field2699 = arg0.field2699;
        this.field2713 = arg0.field2713;
        this.field2700 = arg0.field2700;
        this.field2707 = arg0.field2707;
        this.field2704 = arg0.field2704;
        this.field2677 = arg0.field2677;
        this.field2683 = arg0.field2683;
    }

    @ObfuscatedName("fv.b()Lfv;")
    public class179 method2912() {
        class179 var1 = new class179();
        if (this.field2679 != null) {
            var1.field2679 = new byte[this.field2675];
            for (int var2 = 0; var2 < this.field2675; var2++) {
                var1.field2679[var2] = this.field2679[var2];
            }
        }
        var1.field2671 = this.field2671;
        var1.field2675 = this.field2675;
        var1.field2686 = this.field2686;
        var1.field2672 = this.field2672;
        var1.field2673 = this.field2673;
        var1.field2674 = this.field2674;
        var1.field2676 = this.field2676;
        var1.field2691 = this.field2691;
        var1.field2678 = this.field2678;
        var1.field2680 = this.field2680;
        var1.field2681 = this.field2681;
        var1.field2682 = this.field2682;
        var1.field2689 = this.field2689;
        var1.field2684 = this.field2684;
        var1.field2685 = this.field2685;
        var1.field2690 = this.field2690;
        var1.field2688 = this.field2688;
        var1.field2703 = this.field2703;
        var1.field2705 = this.field2705;
        var1.field2701 = this.field2701;
        var1.field2702 = this.field2702;
        var1.field2693 = this.field2693;
        var1.field2694 = this.field2694;
        var1.field2697 = this.field2697;
        var1.field2695 = this.field2695;
        var1.field2696 = this.field2696;
        var1.field2698 = this.field2698;
        var1.field2716 = this.field2716;
        var1.field2699 = this.field2699;
        var1.field2713 = this.field2713;
        var1.field2700 = this.field2700;
        var1.field2707 = this.field2707;
        var1.field2677 = this.field2677;
        var1.field2683 = this.field2683;
        return var1;
    }

    @ObfuscatedName("fv.f([[IIIIZI)Lfv;")
    public class179 method2913(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2926();
        int var7 = this.field2709 + arg1;
        int var8 = this.field2687 + arg1;
        int var9 = this.field2712 + arg3;
        int var10 = this.field2711 + arg3;
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
        class179 var15;
        if (arg4) {
            var15 = new class179();
            var15.field2671 = this.field2671;
            var15.field2675 = this.field2675;
            var15.field2686 = this.field2686;
            var15.field2672 = this.field2672;
            var15.field2674 = this.field2674;
            var15.field2676 = this.field2676;
            var15.field2691 = this.field2691;
            var15.field2678 = this.field2678;
            var15.field2679 = this.field2679;
            var15.field2680 = this.field2680;
            var15.field2681 = this.field2681;
            var15.field2682 = this.field2682;
            var15.field2689 = this.field2689;
            var15.field2684 = this.field2684;
            var15.field2685 = this.field2685;
            var15.field2690 = this.field2690;
            var15.field2688 = this.field2688;
            var15.field2703 = this.field2703;
            var15.field2705 = this.field2705;
            var15.field2701 = this.field2701;
            var15.field2702 = this.field2702;
            var15.field2693 = this.field2693;
            var15.field2694 = this.field2694;
            var15.field2697 = this.field2697;
            var15.field2695 = this.field2695;
            var15.field2696 = this.field2696;
            var15.field2698 = this.field2698;
            var15.field2716 = this.field2716;
            var15.field2699 = this.field2699;
            var15.field2713 = this.field2713;
            var15.field2677 = this.field2677;
            var15.field2683 = this.field2683;
            var15.field2673 = new int[var15.field2671];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field2671; var16++) {
                int var17 = this.field2672[var16] + arg1;
                int var18 = this.field2674[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field2673[var16] = this.field2673[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field2671; var26++) {
                int var27 = (-this.field2673[var26] << 16) / this.field2484;
                if (var27 < arg5) {
                    int var28 = this.field2672[var26] + arg1;
                    int var29 = this.field2674[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field2673[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field2673[var26];
                }
            }
        }
        var15.method2925();
        return var15;
    }

    @ObfuscatedName("fv.d()V")
    public void method2914() {
        int var10002;
        if (this.field2698 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field2671; var3++) {
                int var4 = this.field2698[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field2699 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field2699[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field2671) {
                int var7 = this.field2698[var6];
                this.field2699[var7][var1[var7]++] = var6++;
            }
            this.field2698 = null;
        }
        if (this.field2716 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field2675; var10++) {
            int var11 = this.field2716[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field2713 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field2713[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field2675) {
            int var14 = this.field2716[var13];
            this.field2713[var14][var8[var14]++] = var13++;
        }
        this.field2716 = null;
    }

    @ObfuscatedName("fv.x()V")
    public void method2915() {
        for (int var1 = 0; var1 < this.field2671; var1++) {
            int var2 = this.field2672[var1];
            this.field2672[var1] = this.field2674[var1];
            this.field2674[var1] = -var2;
        }
        this.method2925();
    }

    @ObfuscatedName("fv.z()V")
    public void method2916() {
        for (int var1 = 0; var1 < this.field2671; var1++) {
            this.field2672[var1] = -this.field2672[var1];
            this.field2674[var1] = -this.field2674[var1];
        }
        this.method2925();
    }

    @ObfuscatedName("fv.o()V")
    public void method2917() {
        for (int var1 = 0; var1 < this.field2671; var1++) {
            int var2 = this.field2674[var1];
            this.field2674[var1] = this.field2672[var1];
            this.field2672[var1] = -var2;
        }
        this.method2925();
    }

    @ObfuscatedName("fv.c(I)V")
    public void method2918(int arg0) {
        int var2 = field2710[arg0];
        int var3 = field2717[arg0];
        for (int var4 = 0; var4 < this.field2671; var4++) {
            int var5 = this.field2674[var4] * var2 + this.field2672[var4] * var3 >> 16;
            this.field2674[var4] = this.field2674[var4] * var3 - this.field2672[var4] * var2 >> 16;
            this.field2672[var4] = var5;
        }
        this.method2925();
    }

    @ObfuscatedName("fv.y(III)V")
    public void method2919(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2671; var4++) {
            this.field2672[var4] += arg0;
            this.field2673[var4] += arg1;
            this.field2674[var4] += arg2;
        }
        this.method2925();
    }

    @ObfuscatedName("fv.j(SS)V")
    public void method2920(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2675; var3++) {
            if (this.field2689[var3] == arg0) {
                this.field2689[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("fv.s(SS)V")
    public void method2921(short arg0, short arg1) {
        if (this.field2684 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field2675; var3++) {
            if (this.field2684[var3] == arg0) {
                this.field2684[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("fv.p()V")
    public void method2970() {
        for (int var1 = 0; var1 < this.field2671; var1++) {
            this.field2674[var1] = -this.field2674[var1];
        }
        for (int var2 = 0; var2 < this.field2675; var2++) {
            int var3 = this.field2676[var2];
            this.field2676[var2] = this.field2678[var2];
            this.field2678[var2] = var3;
        }
        this.method2925();
    }

    @ObfuscatedName("fv.ak(III)V")
    public void method2932(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2671; var4++) {
            this.field2672[var4] = this.field2672[var4] * arg0 / 128;
            this.field2673[var4] = this.field2673[var4] * arg1 / 128;
            this.field2674[var4] = this.field2674[var4] * arg2 / 128;
        }
        this.method2925();
    }

    @ObfuscatedName("fv.ap()V")
    public void method2924() {
        if (this.field2700 != null) {
            return;
        }
        this.field2700 = new class41[this.field2671];
        for (int var1 = 0; var1 < this.field2671; var1++) {
            this.field2700[var1] = new class41();
        }
        for (int var2 = 0; var2 < this.field2675; var2++) {
            int var3 = this.field2676[var2];
            int var4 = this.field2691[var2];
            int var5 = this.field2678[var2];
            int var6 = this.field2672[var4] - this.field2672[var3];
            int var7 = this.field2673[var4] - this.field2673[var3];
            int var8 = this.field2674[var4] - this.field2674[var3];
            int var9 = this.field2672[var5] - this.field2672[var3];
            int var10 = this.field2673[var5] - this.field2673[var3];
            int var11 = this.field2674[var5] - this.field2674[var3];
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
            if (this.field2679 == null) {
                var19 = 0;
            } else {
                var19 = this.field2679[var2];
            }
            if (var19 == 0) {
                class41 var20 = this.field2700[var3];
                var20.field542 += var16;
                var20.field539 += var17;
                var20.field541 += var18;
                var20.field540++;
                class41 var21 = this.field2700[var4];
                var21.field542 += var16;
                var21.field539 += var17;
                var21.field541 += var18;
                var21.field540++;
                class41 var22 = this.field2700[var5];
                var22.field542 += var16;
                var22.field539 += var17;
                var22.field541 += var18;
                var22.field540++;
            } else if (var19 == 1) {
                if (this.field2707 == null) {
                    this.field2707 = new class42[this.field2675];
                }
                class42 var23 = this.field2707[var2] = new class42();
                var23.field545 = var16;
                var23.field544 = var17;
                var23.field546 = var18;
            }
        }
    }

    @ObfuscatedName("fv.ai()V")
    public void method2925() {
        this.field2700 = null;
        this.field2704 = null;
        this.field2707 = null;
        this.field2706 = false;
    }

    @ObfuscatedName("fv.ae()V")
    public void method2926() {
        if (this.field2706) {
            return;
        }
        this.field2484 = 0;
        this.field2708 = 0;
        this.field2709 = 999999;
        this.field2687 = -999999;
        this.field2711 = -99999;
        this.field2712 = 99999;
        for (int var1 = 0; var1 < this.field2671; var1++) {
            int var2 = this.field2672[var1];
            int var3 = this.field2673[var1];
            int var4 = this.field2674[var1];
            if (var2 < this.field2709) {
                this.field2709 = var2;
            }
            if (var2 > this.field2687) {
                this.field2687 = var2;
            }
            if (var4 < this.field2712) {
                this.field2712 = var4;
            }
            if (var4 > this.field2711) {
                this.field2711 = var4;
            }
            if (-var3 > this.field2484) {
                this.field2484 = -var3;
            }
            if (var3 > this.field2708) {
                this.field2708 = var3;
            }
        }
        this.field2706 = true;
    }

    @ObfuscatedName("fv.ad(Lfv;Lfv;IIIZ)V")
    public static void method2949(class179 arg0, class179 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method2926();
        arg0.method2924();
        arg1.method2926();
        arg1.method2924();
        field2715++;
        int var6 = 0;
        int[] var7 = arg1.field2672;
        int var8 = arg1.field2671;
        for (int var9 = 0; var9 < arg0.field2671; var9++) {
            class41 var10 = arg0.field2700[var9];
            if (var10.field540 != 0) {
                int var11 = arg0.field2673[var9] - arg3;
                if (var11 <= arg1.field2708) {
                    int var12 = arg0.field2672[var9] - arg2;
                    if (var12 >= arg1.field2709 && var12 <= arg1.field2687) {
                        int var13 = arg0.field2674[var9] - arg4;
                        if (var13 >= arg1.field2712 && var13 <= arg1.field2711) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class41 var15 = arg1.field2700[var14];
                                if (var7[var14] == var12 && arg1.field2674[var14] == var13 && arg1.field2673[var14] == var11 && var15.field540 != 0) {
                                    if (arg0.field2704 == null) {
                                        arg0.field2704 = new class41[arg0.field2671];
                                    }
                                    if (arg1.field2704 == null) {
                                        arg1.field2704 = new class41[var8];
                                    }
                                    class41 var16 = arg0.field2704[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field2704[var9] = new class41(var10);
                                    }
                                    class41 var17 = arg1.field2704[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field2704[var14] = new class41(var15);
                                    }
                                    var16.field542 += var15.field542;
                                    var16.field539 += var15.field539;
                                    var16.field541 += var15.field541;
                                    var16.field540 += var15.field540;
                                    var17.field542 += var10.field542;
                                    var17.field539 += var10.field539;
                                    var17.field541 += var10.field541;
                                    var17.field540 += var10.field540;
                                    var6++;
                                    field2692[var9] = field2715;
                                    field2714[var14] = field2715;
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
        for (int var18 = 0; var18 < arg0.field2675; var18++) {
            if (field2692[arg0.field2676[var18]] == field2715 && field2692[arg0.field2691[var18]] == field2715 && field2692[arg0.field2678[var18]] == field2715) {
                if (arg0.field2679 == null) {
                    arg0.field2679 = new byte[arg0.field2675];
                }
                arg0.field2679[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field2675; var19++) {
            if (field2714[arg1.field2676[var19]] == field2715 && field2714[arg1.field2691[var19]] == field2715 && field2714[arg1.field2678[var19]] == field2715) {
                if (arg1.field2679 == null) {
                    arg1.field2679 = new byte[arg1.field2675];
                }
                arg1.field2679[var19] = 2;
            }
        }
    }

    @ObfuscatedName("fv.am(IIIII)Lfr;")
    public final class180 method2928(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2924();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class180 var8 = new class180();
        var8.field2755 = new int[this.field2675];
        var8.field2759 = new int[this.field2675];
        var8.field2732 = new int[this.field2675];
        if (this.field2686 > 0 && this.field2682 != null) {
            int[] var9 = new int[this.field2686];
            for (int var10 = 0; var10 < this.field2675; var10++) {
                if (this.field2682[var10] != -1) {
                    var9[this.field2682[var10] & 0xFF]++;
                }
            }
            var8.field2772 = 0;
            for (int var11 = 0; var11 < this.field2686; var11++) {
                if (var9[var11] > 0 && this.field2690[var11] == 0) {
                    var8.field2772++;
                }
            }
            var8.field2739 = new int[var8.field2772];
            var8.field2783 = new int[var8.field2772];
            var8.field2741 = new int[var8.field2772];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field2686; var13++) {
                if (var9[var13] > 0 && this.field2690[var13] == 0) {
                    var8.field2739[var12] = this.field2688[var13] & 0xFFFF;
                    var8.field2783[var12] = this.field2703[var13] & 0xFFFF;
                    var8.field2741[var12] = this.field2705[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field2735 = new byte[this.field2675];
            for (int var14 = 0; var14 < this.field2675; var14++) {
                if (this.field2682[var14] == -1) {
                    var8.field2735[var14] = -1;
                } else {
                    var8.field2735[var14] = (byte) var9[this.field2682[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field2675; var15++) {
            byte var16;
            if (this.field2679 == null) {
                var16 = 0;
            } else {
                var16 = this.field2679[var15];
            }
            byte var17;
            if (this.field2681 == null) {
                var17 = 0;
            } else {
                var17 = this.field2681[var15];
            }
            short var18;
            if (this.field2684 == null) {
                var18 = -1;
            } else {
                var18 = this.field2684[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field2689[var15] & 0xFFFF;
                    class41 var20;
                    if (this.field2704 == null || this.field2704[this.field2676[var15]] == null) {
                        var20 = this.field2700[this.field2676[var15]];
                    } else {
                        var20 = this.field2704[this.field2676[var15]];
                    }
                    int var21 = (var20.field541 * arg4 + var20.field542 * arg2 + var20.field539 * arg3) / (var20.field540 * var7) + arg0;
                    var8.field2755[var15] = method2923(var19, var21);
                    class41 var22;
                    if (this.field2704 == null || this.field2704[this.field2691[var15]] == null) {
                        var22 = this.field2700[this.field2691[var15]];
                    } else {
                        var22 = this.field2704[this.field2691[var15]];
                    }
                    int var23 = (var22.field541 * arg4 + var22.field542 * arg2 + var22.field539 * arg3) / (var22.field540 * var7) + arg0;
                    var8.field2759[var15] = method2923(var19, var23);
                    class41 var24;
                    if (this.field2704 == null || this.field2704[this.field2678[var15]] == null) {
                        var24 = this.field2700[this.field2678[var15]];
                    } else {
                        var24 = this.field2704[this.field2678[var15]];
                    }
                    int var25 = (var24.field541 * arg4 + var24.field542 * arg2 + var24.field539 * arg3) / (var24.field540 * var7) + arg0;
                    var8.field2732[var15] = method2923(var19, var25);
                } else if (var16 == 1) {
                    class42 var26 = this.field2707[var15];
                    int var27 = (var26.field546 * arg4 + var26.field545 * arg2 + var26.field544 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field2755[var15] = method2923(this.field2689[var15] & 0xFFFF, var27);
                    var8.field2732[var15] = -1;
                } else if (var16 == 3) {
                    var8.field2755[var15] = 128;
                    var8.field2732[var15] = -1;
                } else {
                    var8.field2732[var15] = -2;
                }
            } else if (var16 == 0) {
                class41 var28;
                if (this.field2704 == null || this.field2704[this.field2676[var15]] == null) {
                    var28 = this.field2700[this.field2676[var15]];
                } else {
                    var28 = this.field2704[this.field2676[var15]];
                }
                int var29 = (var28.field541 * arg4 + var28.field542 * arg2 + var28.field539 * arg3) / (var28.field540 * var7) + arg0;
                var8.field2755[var15] = method2967(var29);
                class41 var30;
                if (this.field2704 == null || this.field2704[this.field2691[var15]] == null) {
                    var30 = this.field2700[this.field2691[var15]];
                } else {
                    var30 = this.field2704[this.field2691[var15]];
                }
                int var31 = (var30.field541 * arg4 + var30.field542 * arg2 + var30.field539 * arg3) / (var30.field540 * var7) + arg0;
                var8.field2759[var15] = method2967(var31);
                class41 var32;
                if (this.field2704 == null || this.field2704[this.field2678[var15]] == null) {
                    var32 = this.field2700[this.field2678[var15]];
                } else {
                    var32 = this.field2704[this.field2678[var15]];
                }
                int var33 = (var32.field541 * arg4 + var32.field542 * arg2 + var32.field539 * arg3) / (var32.field540 * var7) + arg0;
                var8.field2732[var15] = method2967(var33);
            } else if (var16 == 1) {
                class42 var34 = this.field2707[var15];
                int var35 = (var34.field546 * arg4 + var34.field545 * arg2 + var34.field544 * arg3) / (var7 / 2 + var7) + arg0;
                var8.field2755[var15] = method2967(var35);
                var8.field2732[var15] = -1;
            } else {
                var8.field2732[var15] = -2;
            }
        }
        this.method2914();
        var8.field2762 = this.field2671;
        var8.field2723 = this.field2672;
        var8.field2724 = this.field2673;
        var8.field2763 = this.field2674;
        var8.field2726 = this.field2675;
        var8.field2727 = this.field2676;
        var8.field2728 = this.field2691;
        var8.field2733 = this.field2678;
        var8.field2751 = this.field2680;
        var8.field2734 = this.field2681;
        var8.field2774 = this.field2685;
        var8.field2742 = this.field2699;
        var8.field2718 = this.field2713;
        var8.field2736 = this.field2684;
        return var8;
    }

    @ObfuscatedName("fv.ah(II)I")
    public static final int method2923(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("fv.au(I)I")
    public static final int method2967(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
