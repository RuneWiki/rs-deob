package deob;

@ObfuscatedName("jb")
public class class243 extends class256 {

    @ObfuscatedName("jb.az")
    public int field2562 = 0;

    @ObfuscatedName("jb.af")
    public int[] field2563;

    @ObfuscatedName("jb.aa")
    public int[] field2564;

    @ObfuscatedName("jb.at")
    public int[] field2572;

    @ObfuscatedName("jb.ab")
    public int field2566 = 0;

    @ObfuscatedName("jb.ac")
    public int[] field2582;

    @ObfuscatedName("jb.ao")
    public int[] field2568;

    @ObfuscatedName("jb.ah")
    public int[] field2569;

    @ObfuscatedName("jb.av")
    public byte[] field2570;

    @ObfuscatedName("jb.aq")
    public byte[] field2576;

    @ObfuscatedName("jb.ap")
    public byte[] field2588;

    @ObfuscatedName("jb.ae")
    public byte[] field2573;

    @ObfuscatedName("jb.ax")
    public short[] field2574;

    @ObfuscatedName("jb.ay")
    public short[] field2575;

    @ObfuscatedName("jb.au")
    public byte field2595 = 0;

    @ObfuscatedName("jb.as")
    public int field2567;

    @ObfuscatedName("jb.aw")
    public byte[] field2578;

    @ObfuscatedName("jb.ad")
    public short[] field2579;

    @ObfuscatedName("jb.ai")
    public short[] field2580;

    @ObfuscatedName("jb.an")
    public short[] field2589;

    @ObfuscatedName("jb.am")
    public int[] field2584;

    @ObfuscatedName("jb.ar")
    public int[] field2583;

    @ObfuscatedName("jb.ag")
    public int[][] field2591;

    @ObfuscatedName("jb.bs")
    public int[][] field2585;

    @ObfuscatedName("jb.bf")
    public int[][] field2586;

    @ObfuscatedName("jb.bo")
    public int[][] field2587;

    @ObfuscatedName("jb.bi")
    public class257[] field2577;

    @ObfuscatedName("jb.bt")
    public class266[] field2598;

    @ObfuscatedName("jb.bn")
    public class266[] field2590;

    @ObfuscatedName("jb.bw")
    public short field2596;

    @ObfuscatedName("jb.bl")
    public short field2592;

    @ObfuscatedName("jb.be")
    public boolean field2593 = false;

    @ObfuscatedName("jb.bg")
    public int field2594;

    @ObfuscatedName("jb.bu")
    public int field2559;

    @ObfuscatedName("jb.bh")
    public int field2600;

    @ObfuscatedName("jb.bk")
    public int field2597;

    @ObfuscatedName("jb.bp")
    public int field2581;

    @ObfuscatedName("jb.br")
    public static int[] field2599 = new int[10000];

    @ObfuscatedName("jb.bx")
    public static int[] field2565 = new int[10000];

    @ObfuscatedName("jb.bd")
    public static int field2601 = 0;

    @ObfuscatedName("jb.bv")
    public static int[] field2602 = class248.field2665;

    @ObfuscatedName("jb.bm")
    public static int[] field2603 = class248.field2669;

    public class243() {
    }

    @ObfuscatedName("jb.ak(Lor;II)Ljb;")
    public static class243 method4274(class387 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method6573(arg1, arg2);
        return var3 == null ? null : new class243(var3);
    }

    public class243(byte[] arg0) {
        class546 var2 = new class546(10);
        var2.method8780(-2);
        if (arg0[arg0.length - 1] == -3 && arg0[arg0.length - 2] == -1) {
            this.method4239(arg0);
        } else if (arg0[arg0.length - 1] == -2 && arg0[arg0.length - 2] == -1) {
            this.method4240(arg0);
        } else if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method4248(arg0);
        } else {
            this.method4242(arg0);
        }
    }

    @ObfuscatedName("jb.al([B)V")
    public void method4239(byte[] arg0) {
        class546 var2 = new class546(arg0);
        class546 var3 = new class546(arg0);
        class546 var4 = new class546(arg0);
        class546 var5 = new class546(arg0);
        class546 var6 = new class546(arg0);
        class546 var7 = new class546(arg0);
        class546 var8 = new class546(arg0);
        var2.field5344 = arg0.length - 26;
        int var9 = var2.method8798();
        int var10 = var2.method8798();
        int var11 = var2.method8796();
        int var12 = var2.method8796();
        int var13 = var2.method8796();
        int var14 = var2.method8796();
        int var15 = var2.method8796();
        int var16 = var2.method8796();
        int var17 = var2.method8796();
        int var18 = var2.method8796();
        int var19 = var2.method8798();
        int var20 = var2.method8798();
        int var21 = var2.method8798();
        int var22 = var2.method8798();
        int var23 = var2.method8798();
        int var24 = var2.method8798();
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        if (var11 > 0) {
            this.field2578 = new byte[var11];
            var2.field5344 = 0;
            for (int var28 = 0; var28 < var11; var28++) {
                byte var29 = this.field2578[var28] = var2.method8797();
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
        this.field2562 = var9;
        this.field2566 = var10;
        this.field2567 = var11;
        this.field2563 = new int[var9];
        this.field2564 = new int[var9];
        this.field2572 = new int[var9];
        this.field2582 = new int[var10];
        this.field2568 = new int[var10];
        this.field2569 = new int[var10];
        if (var17 == 1) {
            this.field2584 = new int[var9];
        }
        if (var12 == 1) {
            this.field2570 = new byte[var10];
        }
        if (var13 == 255) {
            this.field2576 = new byte[var10];
        } else {
            this.field2595 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2588 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2583 = new int[var10];
        }
        if (var16 == 1) {
            this.field2575 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field2573 = new byte[var10];
        }
        if (var18 == 1) {
            this.field2586 = new int[var9][];
            this.field2587 = new int[var9][];
        }
        this.field2574 = new short[var10];
        if (var11 > 0) {
            this.field2579 = new short[var11];
            this.field2580 = new short[var11];
            this.field2589 = new short[var11];
        }
        var2.field5344 = var11;
        var3.field5344 = var47;
        var4.field5344 = var49;
        var5.field5344 = var51;
        var6.field5344 = var35;
        int var67 = 0;
        int var68 = 0;
        int var69 = 0;
        for (int var70 = 0; var70 < var9; var70++) {
            int var71 = var2.method8796();
            int var72 = 0;
            if ((var71 & 0x1) != 0) {
                var72 = var3.method8848();
            }
            int var73 = 0;
            if ((var71 & 0x2) != 0) {
                var73 = var4.method8848();
            }
            int var74 = 0;
            if ((var71 & 0x4) != 0) {
                var74 = var5.method8848();
            }
            this.field2563[var70] = var67 + var72;
            this.field2564[var70] = var68 + var73;
            this.field2572[var70] = var69 + var74;
            var67 = this.field2563[var70];
            var68 = this.field2564[var70];
            var69 = this.field2572[var70];
            if (var17 == 1) {
                this.field2584[var70] = var6.method8796();
            }
        }
        if (var18 == 1) {
            for (int var75 = 0; var75 < var9; var75++) {
                int var76 = var6.method8796();
                this.field2586[var75] = new int[var76];
                this.field2587[var75] = new int[var76];
                for (int var77 = 0; var77 < var76; var77++) {
                    this.field2586[var75][var77] = var6.method8796();
                    this.field2587[var75][var77] = var6.method8796();
                }
            }
        }
        var2.field5344 = var45;
        var3.field5344 = var33;
        var4.field5344 = var36;
        var5.field5344 = var40;
        var6.field5344 = var37;
        var7.field5344 = var43;
        var8.field5344 = var42;
        for (int var78 = 0; var78 < var10; var78++) {
            this.field2574[var78] = (short) var2.method8798();
            if (var12 == 1) {
                this.field2570[var78] = var3.method8797();
            }
            if (var13 == 255) {
                this.field2576[var78] = var4.method8797();
            }
            if (var14 == 1) {
                this.field2588[var78] = var5.method8797();
            }
            if (var15 == 1) {
                this.field2583[var78] = var6.method8796();
            }
            if (var16 == 1) {
                this.field2575[var78] = (short) (var7.method8798() - 1);
            }
            if (this.field2573 != null && this.field2575[var78] != -1) {
                this.field2573[var78] = (byte) (var8.method8796() - 1);
            }
        }
        var2.field5344 = var39;
        var3.field5344 = var32;
        int var79 = 0;
        int var80 = 0;
        int var81 = 0;
        int var82 = 0;
        for (int var83 = 0; var83 < var10; var83++) {
            int var84 = var3.method8796();
            if (var84 == 1) {
                var79 = var2.method8848() + var82;
                var80 = var2.method8848() + var79;
                var81 = var2.method8848() + var80;
                var82 = var81;
                this.field2582[var83] = var79;
                this.field2568[var83] = var80;
                this.field2569[var83] = var81;
            }
            if (var84 == 2) {
                var80 = var81;
                var81 = var2.method8848() + var82;
                var82 = var81;
                this.field2582[var83] = var79;
                this.field2568[var83] = var80;
                this.field2569[var83] = var81;
            }
            if (var84 == 3) {
                var79 = var81;
                var81 = var2.method8848() + var82;
                var82 = var81;
                this.field2582[var83] = var79;
                this.field2568[var83] = var80;
                this.field2569[var83] = var81;
            }
            if (var84 == 4) {
                int var87 = var79;
                var79 = var80;
                var80 = var87;
                var81 = var2.method8848() + var82;
                var82 = var81;
                this.field2582[var83] = var79;
                this.field2568[var83] = var87;
                this.field2569[var83] = var81;
            }
        }
        var2.field5344 = var53;
        var3.field5344 = var55;
        var4.field5344 = var57;
        var5.field5344 = var59;
        var6.field5344 = var61;
        var7.field5344 = var63;
        for (int var88 = 0; var88 < var11; var88++) {
            int var89 = this.field2578[var88] & 0xFF;
            if (var89 == 0) {
                this.field2579[var88] = (short) var2.method8798();
                this.field2580[var88] = (short) var2.method8798();
                this.field2589[var88] = (short) var2.method8798();
            }
        }
        var2.field5344 = var65;
        int var90 = var2.method8796();
        if (var90 == 0) {
            return;
        }
        new class271();
        var2.method8798();
        var2.method8798();
        var2.method8798();
        var2.method8801();
    }

    @ObfuscatedName("jb.aj([B)V")
    public void method4240(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class546 var4 = new class546(arg0);
        class546 var5 = new class546(arg0);
        class546 var6 = new class546(arg0);
        class546 var7 = new class546(arg0);
        class546 var8 = new class546(arg0);
        var4.field5344 = arg0.length - 23;
        int var9 = var4.method8798();
        int var10 = var4.method8798();
        int var11 = var4.method8796();
        int var12 = var4.method8796();
        int var13 = var4.method8796();
        int var14 = var4.method8796();
        int var15 = var4.method8796();
        int var16 = var4.method8796();
        int var17 = var4.method8796();
        int var18 = var4.method8798();
        int var19 = var4.method8798();
        int var20 = var4.method8798();
        int var21 = var4.method8798();
        int var22 = var4.method8798();
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
        this.field2562 = var9;
        this.field2566 = var10;
        this.field2567 = var11;
        this.field2563 = new int[var9];
        this.field2564 = new int[var9];
        this.field2572 = new int[var9];
        this.field2582 = new int[var10];
        this.field2568 = new int[var10];
        this.field2569 = new int[var10];
        if (var11 > 0) {
            this.field2578 = new byte[var11];
            this.field2579 = new short[var11];
            this.field2580 = new short[var11];
            this.field2589 = new short[var11];
        }
        if (var16 == 1) {
            this.field2584 = new int[var9];
        }
        if (var12 == 1) {
            this.field2570 = new byte[var10];
            this.field2573 = new byte[var10];
            this.field2575 = new short[var10];
        }
        if (var13 == 255) {
            this.field2576 = new byte[var10];
        } else {
            this.field2595 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2588 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2583 = new int[var10];
        }
        if (var17 == 1) {
            this.field2586 = new int[var9][];
            this.field2587 = new int[var9][];
        }
        this.field2574 = new short[var10];
        var4.field5344 = var23;
        var5.field5344 = var39;
        var6.field5344 = var41;
        var7.field5344 = var43;
        var8.field5344 = var27;
        int var46 = 0;
        int var47 = 0;
        int var48 = 0;
        for (int var49 = 0; var49 < var9; var49++) {
            int var50 = var4.method8796();
            int var51 = 0;
            if ((var50 & 0x1) != 0) {
                var51 = var5.method8848();
            }
            int var52 = 0;
            if ((var50 & 0x2) != 0) {
                var52 = var6.method8848();
            }
            int var53 = 0;
            if ((var50 & 0x4) != 0) {
                var53 = var7.method8848();
            }
            this.field2563[var49] = var46 + var51;
            this.field2564[var49] = var47 + var52;
            this.field2572[var49] = var48 + var53;
            var46 = this.field2563[var49];
            var47 = this.field2564[var49];
            var48 = this.field2572[var49];
            if (var16 == 1) {
                this.field2584[var49] = var8.method8796();
            }
        }
        if (var17 == 1) {
            for (int var54 = 0; var54 < var9; var54++) {
                int var55 = var8.method8796();
                this.field2586[var54] = new int[var55];
                this.field2587[var54] = new int[var55];
                for (int var56 = 0; var56 < var55; var56++) {
                    this.field2586[var54][var56] = var8.method8796();
                    this.field2587[var54][var56] = var8.method8796();
                }
            }
        }
        var4.field5344 = var35;
        var5.field5344 = var30;
        var6.field5344 = var28;
        var7.field5344 = var33;
        var8.field5344 = var29;
        for (int var57 = 0; var57 < var10; var57++) {
            this.field2574[var57] = (short) var4.method8798();
            if (var12 == 1) {
                int var58 = var5.method8796();
                if ((var58 & 0x1) == 1) {
                    this.field2570[var57] = 1;
                    var2 = true;
                } else {
                    this.field2570[var57] = 0;
                }
                if ((var58 & 0x2) == 2) {
                    this.field2573[var57] = (byte) (var58 >> 2);
                    this.field2575[var57] = this.field2574[var57];
                    this.field2574[var57] = 127;
                    if (this.field2575[var57] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field2573[var57] = -1;
                    this.field2575[var57] = -1;
                }
            }
            if (var13 == 255) {
                this.field2576[var57] = var6.method8797();
            }
            if (var14 == 1) {
                this.field2588[var57] = var7.method8797();
            }
            if (var15 == 1) {
                this.field2583[var57] = var8.method8796();
            }
        }
        var4.field5344 = var32;
        var5.field5344 = var25;
        int var59 = 0;
        int var60 = 0;
        int var61 = 0;
        int var62 = 0;
        for (int var63 = 0; var63 < var10; var63++) {
            int var64 = var5.method8796();
            if (var64 == 1) {
                var59 = var4.method8848() + var62;
                var60 = var4.method8848() + var59;
                var61 = var4.method8848() + var60;
                var62 = var61;
                this.field2582[var63] = var59;
                this.field2568[var63] = var60;
                this.field2569[var63] = var61;
            }
            if (var64 == 2) {
                var60 = var61;
                var61 = var4.method8848() + var62;
                var62 = var61;
                this.field2582[var63] = var59;
                this.field2568[var63] = var60;
                this.field2569[var63] = var61;
            }
            if (var64 == 3) {
                var59 = var61;
                var61 = var4.method8848() + var62;
                var62 = var61;
                this.field2582[var63] = var59;
                this.field2568[var63] = var60;
                this.field2569[var63] = var61;
            }
            if (var64 == 4) {
                int var67 = var59;
                var59 = var60;
                var60 = var67;
                var61 = var4.method8848() + var62;
                var62 = var61;
                this.field2582[var63] = var59;
                this.field2568[var63] = var67;
                this.field2569[var63] = var61;
            }
        }
        var4.field5344 = var37;
        for (int var68 = 0; var68 < var11; var68++) {
            this.field2578[var68] = 0;
            this.field2579[var68] = (short) var4.method8798();
            this.field2580[var68] = (short) var4.method8798();
            this.field2589[var68] = (short) var4.method8798();
        }
        if (this.field2573 != null) {
            boolean var69 = false;
            for (int var70 = 0; var70 < var10; var70++) {
                int var71 = this.field2573[var70] & 0xFF;
                if (var71 != 255) {
                    if ((this.field2579[var71] & 0xFFFF) == this.field2582[var70] && (this.field2580[var71] & 0xFFFF) == this.field2568[var70] && (this.field2589[var71] & 0xFFFF) == this.field2569[var70]) {
                        this.field2573[var70] = -1;
                    } else {
                        var69 = true;
                    }
                }
            }
            if (!var69) {
                this.field2573 = null;
            }
        }
        if (!var3) {
            this.field2575 = null;
        }
        if (!var2) {
            this.field2570 = null;
        }
    }

    @ObfuscatedName("jb.az([B)V")
    public void method4248(byte[] arg0) {
        class546 var2 = new class546(arg0);
        class546 var3 = new class546(arg0);
        class546 var4 = new class546(arg0);
        class546 var5 = new class546(arg0);
        class546 var6 = new class546(arg0);
        class546 var7 = new class546(arg0);
        class546 var8 = new class546(arg0);
        var2.field5344 = arg0.length - 23;
        int var9 = var2.method8798();
        int var10 = var2.method8798();
        int var11 = var2.method8796();
        int var12 = var2.method8796();
        int var13 = var2.method8796();
        int var14 = var2.method8796();
        int var15 = var2.method8796();
        int var16 = var2.method8796();
        int var17 = var2.method8796();
        int var18 = var2.method8798();
        int var19 = var2.method8798();
        int var20 = var2.method8798();
        int var21 = var2.method8798();
        int var22 = var2.method8798();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field2578 = new byte[var11];
            var2.field5344 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field2578[var26] = var2.method8797();
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
        this.field2562 = var9;
        this.field2566 = var10;
        this.field2567 = var11;
        this.field2563 = new int[var9];
        this.field2564 = new int[var9];
        this.field2572 = new int[var9];
        this.field2582 = new int[var10];
        this.field2568 = new int[var10];
        this.field2569 = new int[var10];
        if (var17 == 1) {
            this.field2584 = new int[var9];
        }
        if (var12 == 1) {
            this.field2570 = new byte[var10];
        }
        if (var13 == 255) {
            this.field2576 = new byte[var10];
        } else {
            this.field2595 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2588 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2583 = new int[var10];
        }
        if (var16 == 1) {
            this.field2575 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field2573 = new byte[var10];
        }
        this.field2574 = new short[var10];
        if (var11 > 0) {
            this.field2579 = new short[var11];
            this.field2580 = new short[var11];
            this.field2589 = new short[var11];
        }
        var2.field5344 = var11;
        var3.field5344 = var44;
        var4.field5344 = var46;
        var5.field5344 = var48;
        var6.field5344 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method8796();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method8848();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method8848();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method8848();
            }
            this.field2563[var67] = var64 + var69;
            this.field2564[var67] = var65 + var70;
            this.field2572[var67] = var66 + var71;
            var64 = this.field2563[var67];
            var65 = this.field2564[var67];
            var66 = this.field2572[var67];
            if (var17 == 1) {
                this.field2584[var67] = var6.method8796();
            }
        }
        var2.field5344 = var42;
        var3.field5344 = var31;
        var4.field5344 = var34;
        var5.field5344 = var37;
        var6.field5344 = var35;
        var7.field5344 = var40;
        var8.field5344 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field2574[var72] = (short) var2.method8798();
            if (var12 == 1) {
                this.field2570[var72] = var3.method8797();
            }
            if (var13 == 255) {
                this.field2576[var72] = var4.method8797();
            }
            if (var14 == 1) {
                this.field2588[var72] = var5.method8797();
            }
            if (var15 == 1) {
                this.field2583[var72] = var6.method8796();
            }
            if (var16 == 1) {
                this.field2575[var72] = (short) (var7.method8798() - 1);
            }
            if (this.field2573 != null && this.field2575[var72] != -1) {
                this.field2573[var72] = (byte) (var8.method8796() - 1);
            }
        }
        var2.field5344 = var33;
        var3.field5344 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method8796();
            if (var78 == 1) {
                var73 = var2.method8848() + var76;
                var74 = var2.method8848() + var73;
                var75 = var2.method8848() + var74;
                var76 = var75;
                this.field2582[var77] = var73;
                this.field2568[var77] = var74;
                this.field2569[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method8848() + var76;
                var76 = var75;
                this.field2582[var77] = var73;
                this.field2568[var77] = var74;
                this.field2569[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method8848() + var76;
                var76 = var75;
                this.field2582[var77] = var73;
                this.field2568[var77] = var74;
                this.field2569[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method8848() + var76;
                var76 = var75;
                this.field2582[var77] = var73;
                this.field2568[var77] = var81;
                this.field2569[var77] = var75;
            }
        }
        var2.field5344 = var50;
        var3.field5344 = var52;
        var4.field5344 = var54;
        var5.field5344 = var56;
        var6.field5344 = var58;
        var7.field5344 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field2578[var82] & 0xFF;
            if (var83 == 0) {
                this.field2579[var82] = (short) var2.method8798();
                this.field2580[var82] = (short) var2.method8798();
                this.field2589[var82] = (short) var2.method8798();
            }
        }
        var2.field5344 = var62;
        int var84 = var2.method8796();
        if (var84 == 0) {
            return;
        }
        new class271();
        var2.method8798();
        var2.method8798();
        var2.method8798();
        var2.method8801();
    }

    @ObfuscatedName("jb.af([B)V")
    public void method4242(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class546 var4 = new class546(arg0);
        class546 var5 = new class546(arg0);
        class546 var6 = new class546(arg0);
        class546 var7 = new class546(arg0);
        class546 var8 = new class546(arg0);
        var4.field5344 = arg0.length - 18;
        int var9 = var4.method8798();
        int var10 = var4.method8798();
        int var11 = var4.method8796();
        int var12 = var4.method8796();
        int var13 = var4.method8796();
        int var14 = var4.method8796();
        int var15 = var4.method8796();
        int var16 = var4.method8796();
        int var17 = var4.method8798();
        int var18 = var4.method8798();
        int var19 = var4.method8798();
        int var20 = var4.method8798();
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
        this.field2562 = var9;
        this.field2566 = var10;
        this.field2567 = var11;
        this.field2563 = new int[var9];
        this.field2564 = new int[var9];
        this.field2572 = new int[var9];
        this.field2582 = new int[var10];
        this.field2568 = new int[var10];
        this.field2569 = new int[var10];
        if (var11 > 0) {
            this.field2578 = new byte[var11];
            this.field2579 = new short[var11];
            this.field2580 = new short[var11];
            this.field2589 = new short[var11];
        }
        if (var16 == 1) {
            this.field2584 = new int[var9];
        }
        if (var12 == 1) {
            this.field2570 = new byte[var10];
            this.field2573 = new byte[var10];
            this.field2575 = new short[var10];
        }
        if (var13 == 255) {
            this.field2576 = new byte[var10];
        } else {
            this.field2595 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2588 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2583 = new int[var10];
        }
        this.field2574 = new short[var10];
        var4.field5344 = var21;
        var5.field5344 = var36;
        var6.field5344 = var38;
        var7.field5344 = var40;
        var8.field5344 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method8796();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method8848();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method8848();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method8848();
            }
            this.field2563[var46] = var43 + var48;
            this.field2564[var46] = var44 + var49;
            this.field2572[var46] = var45 + var50;
            var43 = this.field2563[var46];
            var44 = this.field2564[var46];
            var45 = this.field2572[var46];
            if (var16 == 1) {
                this.field2584[var46] = var8.method8796();
            }
        }
        var4.field5344 = var32;
        var5.field5344 = var28;
        var6.field5344 = var26;
        var7.field5344 = var30;
        var8.field5344 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field2574[var51] = (short) var4.method8798();
            if (var12 == 1) {
                int var52 = var5.method8796();
                if ((var52 & 0x1) == 1) {
                    this.field2570[var51] = 1;
                    var2 = true;
                } else {
                    this.field2570[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field2573[var51] = (byte) (var52 >> 2);
                    this.field2575[var51] = this.field2574[var51];
                    this.field2574[var51] = 127;
                    if (this.field2575[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field2573[var51] = -1;
                    this.field2575[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field2576[var51] = var6.method8797();
            }
            if (var14 == 1) {
                this.field2588[var51] = var7.method8797();
            }
            if (var15 == 1) {
                this.field2583[var51] = var8.method8796();
            }
        }
        var4.field5344 = var25;
        var5.field5344 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method8796();
            if (var58 == 1) {
                var53 = var4.method8848() + var56;
                var54 = var4.method8848() + var53;
                var55 = var4.method8848() + var54;
                var56 = var55;
                this.field2582[var57] = var53;
                this.field2568[var57] = var54;
                this.field2569[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method8848() + var56;
                var56 = var55;
                this.field2582[var57] = var53;
                this.field2568[var57] = var54;
                this.field2569[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method8848() + var56;
                var56 = var55;
                this.field2582[var57] = var53;
                this.field2568[var57] = var54;
                this.field2569[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method8848() + var56;
                var56 = var55;
                this.field2582[var57] = var53;
                this.field2568[var57] = var61;
                this.field2569[var57] = var55;
            }
        }
        var4.field5344 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field2578[var62] = 0;
            this.field2579[var62] = (short) var4.method8798();
            this.field2580[var62] = (short) var4.method8798();
            this.field2589[var62] = (short) var4.method8798();
        }
        if (this.field2573 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field2573[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field2579[var65] & 0xFFFF) == this.field2582[var64] && (this.field2580[var65] & 0xFFFF) == this.field2568[var64] && (this.field2589[var65] & 0xFFFF) == this.field2569[var64]) {
                        this.field2573[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field2573 = null;
            }
        }
        if (!var3) {
            this.field2575 = null;
        }
        if (!var2) {
            this.field2570 = null;
        }
    }

    public class243(class243[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        this.field2562 = 0;
        this.field2566 = 0;
        this.field2567 = 0;
        this.field2595 = -1;
        for (int var10 = 0; var10 < arg1; var10++) {
            class243 var11 = arg0[var10];
            if (var11 != null) {
                this.field2562 += var11.field2562;
                this.field2566 += var11.field2566;
                this.field2567 += var11.field2567;
                if (var11.field2576 == null) {
                    if (this.field2595 == -1) {
                        this.field2595 = var11.field2595;
                    }
                    if (this.field2595 != var11.field2595) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var11.field2570 != null;
                var5 |= var11.field2588 != null;
                var6 |= var11.field2583 != null;
                var7 |= var11.field2575 != null;
                var8 |= var11.field2573 != null;
                var9 |= var11.field2586 != null;
            }
        }
        this.field2563 = new int[this.field2562];
        this.field2564 = new int[this.field2562];
        this.field2572 = new int[this.field2562];
        this.field2584 = new int[this.field2562];
        this.field2582 = new int[this.field2566];
        this.field2568 = new int[this.field2566];
        this.field2569 = new int[this.field2566];
        if (var3) {
            this.field2570 = new byte[this.field2566];
        }
        if (var4) {
            this.field2576 = new byte[this.field2566];
        }
        if (var5) {
            this.field2588 = new byte[this.field2566];
        }
        if (var6) {
            this.field2583 = new int[this.field2566];
        }
        if (var7) {
            this.field2575 = new short[this.field2566];
        }
        if (var8) {
            this.field2573 = new byte[this.field2566];
        }
        if (var9) {
            this.field2586 = new int[this.field2562][];
            this.field2587 = new int[this.field2562][];
        }
        this.field2574 = new short[this.field2566];
        if (this.field2567 > 0) {
            this.field2578 = new byte[this.field2567];
            this.field2579 = new short[this.field2567];
            this.field2580 = new short[this.field2567];
            this.field2589 = new short[this.field2567];
        }
        this.field2562 = 0;
        this.field2566 = 0;
        this.field2567 = 0;
        for (int var12 = 0; var12 < arg1; var12++) {
            class243 var13 = arg0[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < var13.field2566; var14++) {
                    if (var3 && var13.field2570 != null) {
                        this.field2570[this.field2566] = var13.field2570[var14];
                    }
                    if (var4) {
                        if (var13.field2576 == null) {
                            this.field2576[this.field2566] = var13.field2595;
                        } else {
                            this.field2576[this.field2566] = var13.field2576[var14];
                        }
                    }
                    if (var5 && var13.field2588 != null) {
                        this.field2588[this.field2566] = var13.field2588[var14];
                    }
                    if (var6 && var13.field2583 != null) {
                        this.field2583[this.field2566] = var13.field2583[var14];
                    }
                    if (var7) {
                        if (var13.field2575 == null) {
                            this.field2575[this.field2566] = -1;
                        } else {
                            this.field2575[this.field2566] = var13.field2575[var14];
                        }
                    }
                    if (var8) {
                        if (var13.field2573 == null || var13.field2573[var14] == -1) {
                            this.field2573[this.field2566] = -1;
                        } else {
                            this.field2573[this.field2566] = (byte) (var13.field2573[var14] + this.field2567);
                        }
                    }
                    this.field2574[this.field2566] = var13.field2574[var14];
                    this.field2582[this.field2566] = this.method4288(var13, var13.field2582[var14]);
                    this.field2568[this.field2566] = this.method4288(var13, var13.field2568[var14]);
                    this.field2569[this.field2566] = this.method4288(var13, var13.field2569[var14]);
                    this.field2566++;
                }
                for (int var15 = 0; var15 < var13.field2567; var15++) {
                    byte var16 = this.field2578[this.field2567] = var13.field2578[var15];
                    if (var16 == 0) {
                        this.field2579[this.field2567] = (short) this.method4288(var13, var13.field2579[var15]);
                        this.field2580[this.field2567] = (short) this.method4288(var13, var13.field2580[var15]);
                        this.field2589[this.field2567] = (short) this.method4288(var13, var13.field2589[var15]);
                    }
                    this.field2567++;
                }
            }
        }
    }

    @ObfuscatedName("jb.aa(Ljb;I)I")
    public final int method4288(class243 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field2563[arg1];
        int var5 = arg0.field2564[arg1];
        int var6 = arg0.field2572[arg1];
        for (int var7 = 0; var7 < this.field2562; var7++) {
            if (this.field2563[var7] == var4 && this.field2564[var7] == var5 && this.field2572[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field2563[this.field2562] = var4;
            this.field2564[this.field2562] = var5;
            this.field2572[this.field2562] = var6;
            if (arg0.field2584 != null) {
                this.field2584[this.field2562] = arg0.field2584[arg1];
            }
            if (arg0.field2586 != null) {
                this.field2586[this.field2562] = arg0.field2586[arg1];
                this.field2587[this.field2562] = arg0.field2587[arg1];
            }
            var3 = this.field2562++;
        }
        return var3;
    }

    public class243(class243 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field2562 = arg0.field2562;
        this.field2566 = arg0.field2566;
        this.field2567 = arg0.field2567;
        if (arg1) {
            this.field2563 = arg0.field2563;
            this.field2564 = arg0.field2564;
            this.field2572 = arg0.field2572;
        } else {
            this.field2563 = new int[this.field2562];
            this.field2564 = new int[this.field2562];
            this.field2572 = new int[this.field2562];
            for (int var6 = 0; var6 < this.field2562; var6++) {
                this.field2563[var6] = arg0.field2563[var6];
                this.field2564[var6] = arg0.field2564[var6];
                this.field2572[var6] = arg0.field2572[var6];
            }
        }
        if (arg2) {
            this.field2574 = arg0.field2574;
        } else {
            this.field2574 = new short[this.field2566];
            for (int var7 = 0; var7 < this.field2566; var7++) {
                this.field2574[var7] = arg0.field2574[var7];
            }
        }
        if (arg3 || arg0.field2575 == null) {
            this.field2575 = arg0.field2575;
        } else {
            this.field2575 = new short[this.field2566];
            for (int var8 = 0; var8 < this.field2566; var8++) {
                this.field2575[var8] = arg0.field2575[var8];
            }
        }
        if (arg4) {
            this.field2588 = arg0.field2588;
        } else {
            this.field2588 = new byte[this.field2566];
            if (arg0.field2588 == null) {
                for (int var9 = 0; var9 < this.field2566; var9++) {
                    this.field2588[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field2566; var10++) {
                    this.field2588[var10] = arg0.field2588[var10];
                }
            }
        }
        this.field2582 = arg0.field2582;
        this.field2568 = arg0.field2568;
        this.field2569 = arg0.field2569;
        this.field2570 = arg0.field2570;
        this.field2576 = arg0.field2576;
        this.field2573 = arg0.field2573;
        this.field2595 = arg0.field2595;
        this.field2578 = arg0.field2578;
        this.field2579 = arg0.field2579;
        this.field2580 = arg0.field2580;
        this.field2589 = arg0.field2589;
        this.field2584 = arg0.field2584;
        this.field2583 = arg0.field2583;
        this.field2591 = arg0.field2591;
        this.field2585 = arg0.field2585;
        this.field2598 = arg0.field2598;
        this.field2577 = arg0.field2577;
        this.field2590 = arg0.field2590;
        this.field2586 = arg0.field2586;
        this.field2587 = arg0.field2587;
        this.field2596 = arg0.field2596;
        this.field2592 = arg0.field2592;
    }

    @ObfuscatedName("jb.at()Ljb;")
    public class243 method4245() {
        class243 var1 = new class243();
        if (this.field2570 != null) {
            var1.field2570 = new byte[this.field2566];
            for (int var2 = 0; var2 < this.field2566; var2++) {
                var1.field2570[var2] = this.field2570[var2];
            }
        }
        var1.field2562 = this.field2562;
        var1.field2566 = this.field2566;
        var1.field2567 = this.field2567;
        var1.field2563 = this.field2563;
        var1.field2564 = this.field2564;
        var1.field2572 = this.field2572;
        var1.field2582 = this.field2582;
        var1.field2568 = this.field2568;
        var1.field2569 = this.field2569;
        var1.field2576 = this.field2576;
        var1.field2588 = this.field2588;
        var1.field2573 = this.field2573;
        var1.field2574 = this.field2574;
        var1.field2575 = this.field2575;
        var1.field2595 = this.field2595;
        var1.field2578 = this.field2578;
        var1.field2579 = this.field2579;
        var1.field2580 = this.field2580;
        var1.field2589 = this.field2589;
        var1.field2584 = this.field2584;
        var1.field2583 = this.field2583;
        var1.field2591 = this.field2591;
        var1.field2585 = this.field2585;
        var1.field2598 = this.field2598;
        var1.field2577 = this.field2577;
        var1.field2596 = this.field2596;
        var1.field2592 = this.field2592;
        return var1;
    }

    @ObfuscatedName("jb.ab([[IIIIZI)Ljb;")
    public class243 method4246(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method4259();
        int var7 = this.field2559 + arg1;
        int var8 = this.field2600 + arg1;
        int var9 = this.field2581 + arg3;
        int var10 = this.field2597 + arg3;
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
        class243 var15;
        if (arg4) {
            var15 = new class243();
            var15.field2562 = this.field2562;
            var15.field2566 = this.field2566;
            var15.field2567 = this.field2567;
            var15.field2563 = this.field2563;
            var15.field2572 = this.field2572;
            var15.field2582 = this.field2582;
            var15.field2568 = this.field2568;
            var15.field2569 = this.field2569;
            var15.field2570 = this.field2570;
            var15.field2576 = this.field2576;
            var15.field2588 = this.field2588;
            var15.field2573 = this.field2573;
            var15.field2574 = this.field2574;
            var15.field2575 = this.field2575;
            var15.field2595 = this.field2595;
            var15.field2578 = this.field2578;
            var15.field2579 = this.field2579;
            var15.field2580 = this.field2580;
            var15.field2589 = this.field2589;
            var15.field2584 = this.field2584;
            var15.field2583 = this.field2583;
            var15.field2591 = this.field2591;
            var15.field2585 = this.field2585;
            var15.field2596 = this.field2596;
            var15.field2592 = this.field2592;
            var15.field2564 = new int[var15.field2562];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field2562; var16++) {
                int var17 = this.field2563[var16] + arg1;
                int var18 = this.field2572[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field2564[var16] = this.field2564[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field2562; var26++) {
                int var27 = (-this.field2564[var26] << 16) / this.field2801;
                if (var27 < arg5) {
                    int var28 = this.field2563[var26] + arg1;
                    int var29 = this.field2572[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field2564[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field2564[var26];
                }
            }
        }
        var15.method4258();
        return var15;
    }

    @ObfuscatedName("jb.ac()V")
    public void method4254() {
        int var10002;
        if (this.field2584 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field2562; var3++) {
                int var4 = this.field2584[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field2591 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field2591[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field2562) {
                int var7 = this.field2584[var6];
                this.field2591[var7][var1[var7]++] = var6++;
            }
            this.field2584 = null;
        }
        if (this.field2583 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field2566; var10++) {
            int var11 = this.field2583[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field2585 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field2585[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field2566) {
            int var14 = this.field2583[var13];
            this.field2585[var14][var8[var14]++] = var13++;
        }
        this.field2583 = null;
    }

    @ObfuscatedName("jb.ao()V")
    public void method4262() {
        for (int var1 = 0; var1 < this.field2562; var1++) {
            int var2 = this.field2563[var1];
            this.field2563[var1] = this.field2572[var1];
            this.field2572[var1] = -var2;
        }
        this.method4258();
    }

    @ObfuscatedName("jb.aq()V")
    public void method4249() {
        for (int var1 = 0; var1 < this.field2562; var1++) {
            this.field2563[var1] = -this.field2563[var1];
            this.field2572[var1] = -this.field2572[var1];
        }
        this.method4258();
    }

    @ObfuscatedName("jb.ap()V")
    public void method4250() {
        for (int var1 = 0; var1 < this.field2562; var1++) {
            int var2 = this.field2572[var1];
            this.field2572[var1] = this.field2563[var1];
            this.field2563[var1] = -var2;
        }
        this.method4258();
    }

    @ObfuscatedName("jb.ae(I)V")
    public void method4277(int arg0) {
        int var2 = field2602[arg0];
        int var3 = field2603[arg0];
        for (int var4 = 0; var4 < this.field2562; var4++) {
            int var5 = this.field2572[var4] * var2 + this.field2563[var4] * var3 >> 16;
            this.field2572[var4] = this.field2572[var4] * var3 - this.field2563[var4] * var2 >> 16;
            this.field2563[var4] = var5;
        }
        this.method4258();
    }

    @ObfuscatedName("jb.ax(III)V")
    public void method4238(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2562; var4++) {
            this.field2563[var4] += arg0;
            this.field2564[var4] += arg1;
            this.field2572[var4] += arg2;
        }
        this.method4258();
    }

    @ObfuscatedName("jb.ay(SS)V")
    public void method4253(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2566; var3++) {
            if (this.field2574[var3] == arg0) {
                this.field2574[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("jb.au(SS)V")
    public void method4280(short arg0, short arg1) {
        if (this.field2575 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field2566; var3++) {
            if (this.field2575[var3] == arg0) {
                this.field2575[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("jb.as()V")
    public void method4255() {
        for (int var1 = 0; var1 < this.field2562; var1++) {
            this.field2572[var1] = -this.field2572[var1];
        }
        for (int var2 = 0; var2 < this.field2566; var2++) {
            int var3 = this.field2582[var2];
            this.field2582[var2] = this.field2569[var2];
            this.field2569[var2] = var3;
        }
        this.method4258();
    }

    @ObfuscatedName("jb.aw(III)V")
    public void method4256(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2562; var4++) {
            this.field2563[var4] = this.field2563[var4] * arg0 / 128;
            this.field2564[var4] = this.field2564[var4] * arg1 / 128;
            this.field2572[var4] = this.field2572[var4] * arg2 / 128;
        }
        this.method4258();
    }

    @ObfuscatedName("jb.ad()V")
    public void method4243() {
        if (this.field2598 != null) {
            return;
        }
        this.field2598 = new class266[this.field2562];
        for (int var1 = 0; var1 < this.field2562; var1++) {
            this.field2598[var1] = new class266();
        }
        for (int var2 = 0; var2 < this.field2566; var2++) {
            int var3 = this.field2582[var2];
            int var4 = this.field2568[var2];
            int var5 = this.field2569[var2];
            int var6 = this.field2563[var4] - this.field2563[var3];
            int var7 = this.field2564[var4] - this.field2564[var3];
            int var8 = this.field2572[var4] - this.field2572[var3];
            int var9 = this.field2563[var5] - this.field2563[var3];
            int var10 = this.field2564[var5] - this.field2564[var3];
            int var11 = this.field2572[var5] - this.field2572[var3];
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
            if (this.field2570 == null) {
                var19 = 0;
            } else {
                var19 = this.field2570[var2];
            }
            if (var19 == 0) {
                class266 var20 = this.field2598[var3];
                var20.field2961 += var16;
                var20.field2960 += var17;
                var20.field2962 += var18;
                var20.field2959++;
                class266 var21 = this.field2598[var4];
                var21.field2961 += var16;
                var21.field2960 += var17;
                var21.field2962 += var18;
                var21.field2959++;
                class266 var22 = this.field2598[var5];
                var22.field2961 += var16;
                var22.field2960 += var17;
                var22.field2962 += var18;
                var22.field2959++;
            } else if (var19 == 1) {
                if (this.field2577 == null) {
                    this.field2577 = new class257[this.field2566];
                }
                class257 var23 = this.field2577[var2] = new class257();
                var23.field2802 = var16;
                var23.field2803 = var17;
                var23.field2804 = var18;
            }
        }
    }

    @ObfuscatedName("jb.ai()V")
    public void method4258() {
        this.field2598 = null;
        this.field2590 = null;
        this.field2577 = null;
        this.field2593 = false;
    }

    @ObfuscatedName("jb.an()V")
    public void method4259() {
        if (this.field2593) {
            return;
        }
        this.field2801 = 0;
        this.field2594 = 0;
        this.field2559 = 999999;
        this.field2600 = -999999;
        this.field2597 = -99999;
        this.field2581 = 99999;
        for (int var1 = 0; var1 < this.field2562; var1++) {
            int var2 = this.field2563[var1];
            int var3 = this.field2564[var1];
            int var4 = this.field2572[var1];
            if (var2 < this.field2559) {
                this.field2559 = var2;
            }
            if (var2 > this.field2600) {
                this.field2600 = var2;
            }
            if (var4 < this.field2581) {
                this.field2581 = var4;
            }
            if (var4 > this.field2597) {
                this.field2597 = var4;
            }
            if (-var3 > this.field2801) {
                this.field2801 = -var3;
            }
            if (var3 > this.field2594) {
                this.field2594 = var3;
            }
        }
        this.field2593 = true;
    }

    @ObfuscatedName("jb.am(Ljb;Ljb;IIIZ)V")
    public static void method4260(class243 arg0, class243 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method4259();
        arg0.method4243();
        arg1.method4259();
        arg1.method4243();
        field2601++;
        int var6 = 0;
        int[] var7 = arg1.field2563;
        int var8 = arg1.field2562;
        for (int var9 = 0; var9 < arg0.field2562; var9++) {
            class266 var10 = arg0.field2598[var9];
            if (var10.field2959 != 0) {
                int var11 = arg0.field2564[var9] - arg3;
                if (var11 <= arg1.field2594) {
                    int var12 = arg0.field2563[var9] - arg2;
                    if (var12 >= arg1.field2559 && var12 <= arg1.field2600) {
                        int var13 = arg0.field2572[var9] - arg4;
                        if (var13 >= arg1.field2581 && var13 <= arg1.field2597) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class266 var15 = arg1.field2598[var14];
                                if (var7[var14] == var12 && arg1.field2572[var14] == var13 && arg1.field2564[var14] == var11 && var15.field2959 != 0) {
                                    if (arg0.field2590 == null) {
                                        arg0.field2590 = new class266[arg0.field2562];
                                    }
                                    if (arg1.field2590 == null) {
                                        arg1.field2590 = new class266[var8];
                                    }
                                    class266 var16 = arg0.field2590[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field2590[var9] = new class266(var10);
                                    }
                                    class266 var17 = arg1.field2590[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field2590[var14] = new class266(var15);
                                    }
                                    var16.field2961 += var15.field2961;
                                    var16.field2960 += var15.field2960;
                                    var16.field2962 += var15.field2962;
                                    var16.field2959 += var15.field2959;
                                    var17.field2961 += var10.field2961;
                                    var17.field2960 += var10.field2960;
                                    var17.field2962 += var10.field2962;
                                    var17.field2959 += var10.field2959;
                                    var6++;
                                    field2599[var9] = field2601;
                                    field2565[var14] = field2601;
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
        for (int var18 = 0; var18 < arg0.field2566; var18++) {
            if (field2599[arg0.field2582[var18]] == field2601 && field2599[arg0.field2568[var18]] == field2601 && field2599[arg0.field2569[var18]] == field2601) {
                if (arg0.field2570 == null) {
                    arg0.field2570 = new byte[arg0.field2566];
                }
                arg0.field2570[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field2566; var19++) {
            if (field2565[arg1.field2582[var19]] == field2601 && field2565[arg1.field2568[var19]] == field2601 && field2565[arg1.field2569[var19]] == field2601) {
                if (arg1.field2570 == null) {
                    arg1.field2570 = new byte[arg1.field2566];
                }
                arg1.field2570[var19] = 2;
            }
        }
    }

    @ObfuscatedName("jb.ar(IIIII)Lkb;")
    public final class264 method4252(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method4243();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class264 var8 = new class264();
        var8.field2882 = new int[this.field2566];
        var8.field2883 = new int[this.field2566];
        var8.field2884 = new int[this.field2566];
        if (this.field2567 > 0 && this.field2573 != null) {
            int[] var9 = new int[this.field2567];
            for (int var10 = 0; var10 < this.field2566; var10++) {
                if (this.field2573[var10] != -1) {
                    var9[this.field2573[var10] & 0xFF]++;
                }
            }
            var8.field2929 = 0;
            for (int var11 = 0; var11 < this.field2567; var11++) {
                if (var9[var11] > 0 && this.field2578[var11] == 0) {
                    var8.field2929++;
                }
            }
            var8.field2891 = new int[var8.field2929];
            var8.field2936 = new int[var8.field2929];
            var8.field2933 = new int[var8.field2929];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field2567; var13++) {
                if (var9[var13] > 0 && this.field2578[var13] == 0) {
                    var8.field2891[var12] = this.field2579[var13] & 0xFFFF;
                    var8.field2936[var12] = this.field2580[var13] & 0xFFFF;
                    var8.field2933[var12] = this.field2589[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field2887 = new byte[this.field2566];
            for (int var14 = 0; var14 < this.field2566; var14++) {
                if (this.field2573[var14] == -1) {
                    var8.field2887[var14] = -1;
                } else {
                    var8.field2887[var14] = (byte) var9[this.field2573[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field2566; var15++) {
            byte var16;
            if (this.field2570 == null) {
                var16 = 0;
            } else {
                var16 = this.field2570[var15];
            }
            byte var17;
            if (this.field2588 == null) {
                var17 = 0;
            } else {
                var17 = this.field2588[var15];
            }
            short var18;
            if (this.field2575 == null) {
                var18 = -1;
            } else {
                var18 = this.field2575[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field2574[var15] & 0xFFFF;
                    class266 var20;
                    if (this.field2590 == null || this.field2590[this.field2582[var15]] == null) {
                        var20 = this.field2598[this.field2582[var15]];
                    } else {
                        var20 = this.field2590[this.field2582[var15]];
                    }
                    int var21 = (var20.field2962 * arg4 + var20.field2961 * arg2 + var20.field2960 * arg3) / (var20.field2959 * var7) + arg0;
                    var8.field2882[var15] = method4273(var19, var21);
                    class266 var22;
                    if (this.field2590 == null || this.field2590[this.field2568[var15]] == null) {
                        var22 = this.field2598[this.field2568[var15]];
                    } else {
                        var22 = this.field2590[this.field2568[var15]];
                    }
                    int var23 = (var22.field2962 * arg4 + var22.field2961 * arg2 + var22.field2960 * arg3) / (var22.field2959 * var7) + arg0;
                    var8.field2883[var15] = method4273(var19, var23);
                    class266 var24;
                    if (this.field2590 == null || this.field2590[this.field2569[var15]] == null) {
                        var24 = this.field2598[this.field2569[var15]];
                    } else {
                        var24 = this.field2590[this.field2569[var15]];
                    }
                    int var25 = (var24.field2962 * arg4 + var24.field2961 * arg2 + var24.field2960 * arg3) / (var24.field2959 * var7) + arg0;
                    var8.field2884[var15] = method4273(var19, var25);
                } else if (var16 == 1) {
                    class257 var26 = this.field2577[var15];
                    int var27 = (var26.field2804 * arg4 + var26.field2803 * arg3 + var26.field2802 * arg2) / (var7 / 2 + var7) + arg0;
                    var8.field2882[var15] = method4273(this.field2574[var15] & 0xFFFF, var27);
                    var8.field2884[var15] = -1;
                } else if (var16 == 3) {
                    var8.field2882[var15] = 128;
                    var8.field2884[var15] = -1;
                } else {
                    var8.field2884[var15] = -2;
                }
            } else if (var16 == 0) {
                class266 var28;
                if (this.field2590 == null || this.field2590[this.field2582[var15]] == null) {
                    var28 = this.field2598[this.field2582[var15]];
                } else {
                    var28 = this.field2590[this.field2582[var15]];
                }
                int var29 = (var28.field2962 * arg4 + var28.field2961 * arg2 + var28.field2960 * arg3) / (var28.field2959 * var7) + arg0;
                var8.field2882[var15] = method4292(var29);
                class266 var30;
                if (this.field2590 == null || this.field2590[this.field2568[var15]] == null) {
                    var30 = this.field2598[this.field2568[var15]];
                } else {
                    var30 = this.field2590[this.field2568[var15]];
                }
                int var31 = (var30.field2962 * arg4 + var30.field2961 * arg2 + var30.field2960 * arg3) / (var30.field2959 * var7) + arg0;
                var8.field2883[var15] = method4292(var31);
                class266 var32;
                if (this.field2590 == null || this.field2590[this.field2569[var15]] == null) {
                    var32 = this.field2598[this.field2569[var15]];
                } else {
                    var32 = this.field2590[this.field2569[var15]];
                }
                int var33 = (var32.field2962 * arg4 + var32.field2961 * arg2 + var32.field2960 * arg3) / (var32.field2959 * var7) + arg0;
                var8.field2884[var15] = method4292(var33);
            } else if (var16 == 1) {
                class257 var34 = this.field2577[var15];
                int var35 = (var34.field2804 * arg4 + var34.field2803 * arg3 + var34.field2802 * arg2) / (var7 / 2 + var7) + arg0;
                var8.field2882[var15] = method4292(var35);
                var8.field2884[var15] = -1;
            } else {
                var8.field2884[var15] = -2;
            }
        }
        this.method4254();
        var8.field2874 = this.field2562;
        var8.field2875 = this.field2563;
        var8.field2932 = this.field2564;
        var8.field2877 = this.field2572;
        var8.field2878 = this.field2566;
        var8.field2879 = this.field2582;
        var8.field2880 = this.field2568;
        var8.field2881 = this.field2569;
        var8.field2889 = this.field2576;
        var8.field2886 = this.field2588;
        var8.field2915 = this.field2595;
        var8.field2894 = this.field2591;
        var8.field2923 = this.field2585;
        var8.field2888 = this.field2575;
        var8.field2896 = this.field2586;
        var8.field2897 = this.field2587;
        return var8;
    }

    @ObfuscatedName("jb.ag(II)I")
    public static final int method4273(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("jb.bs(I)I")
    public static final int method4292(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
