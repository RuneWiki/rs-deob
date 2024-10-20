package deob;

@ObfuscatedName("ic")
public class class222 extends class233 {

    @ObfuscatedName("ic.at")
    public int field2432 = 0;

    @ObfuscatedName("ic.ac")
    public int[] field2433;

    @ObfuscatedName("ic.ai")
    public int[] field2434;

    @ObfuscatedName("ic.az")
    public int[] field2435;

    @ObfuscatedName("ic.ap")
    public int field2466 = 0;

    @ObfuscatedName("ic.aa")
    public int[] field2437;

    @ObfuscatedName("ic.af")
    public int[] field2438;

    @ObfuscatedName("ic.ad")
    public int[] field2439;

    @ObfuscatedName("ic.aq")
    public byte[] field2464;

    @ObfuscatedName("ic.al")
    public byte[] field2441;

    @ObfuscatedName("ic.an")
    public byte[] field2442;

    @ObfuscatedName("ic.ar")
    public byte[] field2429;

    @ObfuscatedName("ic.ab")
    public short[] field2444;

    @ObfuscatedName("ic.ag")
    public short[] field2445;

    @ObfuscatedName("ic.am")
    public byte field2446 = 0;

    @ObfuscatedName("ic.ax")
    public int field2447;

    @ObfuscatedName("ic.ah")
    public byte[] field2461;

    @ObfuscatedName("ic.as")
    public short[] field2448;

    @ObfuscatedName("ic.ay")
    public short[] field2450;

    @ObfuscatedName("ic.aj")
    public short[] field2469;

    @ObfuscatedName("ic.av")
    public int[] field2459;

    @ObfuscatedName("ic.aw")
    public int[] field2472;

    @ObfuscatedName("ic.ak")
    public int[][] field2454;

    @ObfuscatedName("ic.bh")
    public int[][] field2455;

    @ObfuscatedName("ic.bj")
    public int[][] field2453;

    @ObfuscatedName("ic.bk")
    public int[][] field2457;

    @ObfuscatedName("ic.bv")
    public class234[] field2458;

    @ObfuscatedName("ic.bt")
    public class242[] field2443;

    @ObfuscatedName("ic.bd")
    public class242[] field2460;

    @ObfuscatedName("ic.by")
    public short field2473;

    @ObfuscatedName("ic.bs")
    public short field2462;

    @ObfuscatedName("ic.bm")
    public boolean field2463 = false;

    @ObfuscatedName("ic.bf")
    public int field2471;

    @ObfuscatedName("ic.bq")
    public int field2465;

    @ObfuscatedName("ic.ba")
    public int field2440;

    @ObfuscatedName("ic.bl")
    public int field2467;

    @ObfuscatedName("ic.bp")
    public int field2468;

    @ObfuscatedName("ic.bu")
    public static int[] field2452 = new int[10000];

    @ObfuscatedName("ic.bo")
    public static int[] field2470 = new int[10000];

    @ObfuscatedName("ic.bb")
    public static int field2449 = 0;

    @ObfuscatedName("ic.br")
    public static int[] field2431 = class227.field2535;

    @ObfuscatedName("ic.be")
    public static int[] field2456 = class227.field2533;

    public class222() {
    }

    @ObfuscatedName("ic.au(Lnu;II)Lic;")
    public static class222 method4002(class359 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method6128(arg1, arg2);
        return var3 == null ? null : new class222(var3);
    }

    public class222(byte[] arg0) {
        class515 var2 = new class515(10);
        var2.method8345(-2);
        if (arg0[arg0.length - 1] == -3 && arg0[arg0.length - 2] == -1) {
            this.method4015(arg0);
        } else if (arg0[arg0.length - 1] == -2 && arg0[arg0.length - 2] == -1) {
            this.method3980(arg0);
        } else if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method4031(arg0);
        } else {
            this.method4016(arg0);
        }
    }

    @ObfuscatedName("ic.ao([B)V")
    public void method4015(byte[] arg0) {
        class515 var2 = new class515(arg0);
        class515 var3 = new class515(arg0);
        class515 var4 = new class515(arg0);
        class515 var5 = new class515(arg0);
        class515 var6 = new class515(arg0);
        class515 var7 = new class515(arg0);
        class515 var8 = new class515(arg0);
        var2.field5111 = arg0.length - 26;
        int var9 = var2.method8448();
        int var10 = var2.method8448();
        int var11 = var2.method8300();
        int var12 = var2.method8300();
        int var13 = var2.method8300();
        int var14 = var2.method8300();
        int var15 = var2.method8300();
        int var16 = var2.method8300();
        int var17 = var2.method8300();
        int var18 = var2.method8300();
        int var19 = var2.method8448();
        int var20 = var2.method8448();
        int var21 = var2.method8448();
        int var22 = var2.method8448();
        int var23 = var2.method8448();
        int var24 = var2.method8448();
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        if (var11 > 0) {
            this.field2461 = new byte[var11];
            var2.field5111 = 0;
            for (int var28 = 0; var28 < var11; var28++) {
                byte var29 = this.field2461[var28] = var2.method8301();
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
        this.field2432 = var9;
        this.field2466 = var10;
        this.field2447 = var11;
        this.field2433 = new int[var9];
        this.field2434 = new int[var9];
        this.field2435 = new int[var9];
        this.field2437 = new int[var10];
        this.field2438 = new int[var10];
        this.field2439 = new int[var10];
        if (var17 == 1) {
            this.field2459 = new int[var9];
        }
        if (var12 == 1) {
            this.field2464 = new byte[var10];
        }
        if (var13 == 255) {
            this.field2441 = new byte[var10];
        } else {
            this.field2446 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2442 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2472 = new int[var10];
        }
        if (var16 == 1) {
            this.field2445 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field2429 = new byte[var10];
        }
        if (var18 == 1) {
            this.field2453 = new int[var9][];
            this.field2457 = new int[var9][];
        }
        this.field2444 = new short[var10];
        if (var11 > 0) {
            this.field2448 = new short[var11];
            this.field2450 = new short[var11];
            this.field2469 = new short[var11];
        }
        var2.field5111 = var11;
        var3.field5111 = var47;
        var4.field5111 = var49;
        var5.field5111 = var51;
        var6.field5111 = var35;
        int var67 = 0;
        int var68 = 0;
        int var69 = 0;
        for (int var70 = 0; var70 < var9; var70++) {
            int var71 = var2.method8300();
            int var72 = 0;
            if ((var71 & 0x1) != 0) {
                var72 = var3.method8315();
            }
            int var73 = 0;
            if ((var71 & 0x2) != 0) {
                var73 = var4.method8315();
            }
            int var74 = 0;
            if ((var71 & 0x4) != 0) {
                var74 = var5.method8315();
            }
            this.field2433[var70] = var67 + var72;
            this.field2434[var70] = var68 + var73;
            this.field2435[var70] = var69 + var74;
            var67 = this.field2433[var70];
            var68 = this.field2434[var70];
            var69 = this.field2435[var70];
            if (var17 == 1) {
                this.field2459[var70] = var6.method8300();
            }
        }
        if (var18 == 1) {
            for (int var75 = 0; var75 < var9; var75++) {
                int var76 = var6.method8300();
                this.field2453[var75] = new int[var76];
                this.field2457[var75] = new int[var76];
                for (int var77 = 0; var77 < var76; var77++) {
                    this.field2453[var75][var77] = var6.method8300();
                    this.field2457[var75][var77] = var6.method8300();
                }
            }
        }
        var2.field5111 = var45;
        var3.field5111 = var33;
        var4.field5111 = var36;
        var5.field5111 = var40;
        var6.field5111 = var37;
        var7.field5111 = var43;
        var8.field5111 = var42;
        for (int var78 = 0; var78 < var10; var78++) {
            this.field2444[var78] = (short) var2.method8448();
            if (var12 == 1) {
                this.field2464[var78] = var3.method8301();
            }
            if (var13 == 255) {
                this.field2441[var78] = var4.method8301();
            }
            if (var14 == 1) {
                this.field2442[var78] = var5.method8301();
            }
            if (var15 == 1) {
                this.field2472[var78] = var6.method8300();
            }
            if (var16 == 1) {
                this.field2445[var78] = (short) (var7.method8448() - 1);
            }
            if (this.field2429 != null && this.field2445[var78] != -1) {
                this.field2429[var78] = (byte) (var8.method8300() - 1);
            }
        }
        var2.field5111 = var39;
        var3.field5111 = var32;
        int var79 = 0;
        int var80 = 0;
        int var81 = 0;
        int var82 = 0;
        for (int var83 = 0; var83 < var10; var83++) {
            int var84 = var3.method8300();
            if (var84 == 1) {
                var79 = var2.method8315() + var82;
                var80 = var2.method8315() + var79;
                var81 = var2.method8315() + var80;
                var82 = var81;
                this.field2437[var83] = var79;
                this.field2438[var83] = var80;
                this.field2439[var83] = var81;
            }
            if (var84 == 2) {
                var80 = var81;
                var81 = var2.method8315() + var82;
                var82 = var81;
                this.field2437[var83] = var79;
                this.field2438[var83] = var80;
                this.field2439[var83] = var81;
            }
            if (var84 == 3) {
                var79 = var81;
                var81 = var2.method8315() + var82;
                var82 = var81;
                this.field2437[var83] = var79;
                this.field2438[var83] = var80;
                this.field2439[var83] = var81;
            }
            if (var84 == 4) {
                int var87 = var79;
                var79 = var80;
                var80 = var87;
                var81 = var2.method8315() + var82;
                var82 = var81;
                this.field2437[var83] = var79;
                this.field2438[var83] = var87;
                this.field2439[var83] = var81;
            }
        }
        var2.field5111 = var53;
        var3.field5111 = var55;
        var4.field5111 = var57;
        var5.field5111 = var59;
        var6.field5111 = var61;
        var7.field5111 = var63;
        for (int var88 = 0; var88 < var11; var88++) {
            int var89 = this.field2461[var88] & 0xFF;
            if (var89 == 0) {
                this.field2448[var88] = (short) var2.method8448();
                this.field2450[var88] = (short) var2.method8448();
                this.field2469[var88] = (short) var2.method8448();
            }
        }
        var2.field5111 = var65;
        int var90 = var2.method8300();
        if (var90 == 0) {
            return;
        }
        new class247();
        var2.method8448();
        var2.method8448();
        var2.method8448();
        var2.method8306();
    }

    @ObfuscatedName("ic.at([B)V")
    public void method3980(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class515 var4 = new class515(arg0);
        class515 var5 = new class515(arg0);
        class515 var6 = new class515(arg0);
        class515 var7 = new class515(arg0);
        class515 var8 = new class515(arg0);
        var4.field5111 = arg0.length - 23;
        int var9 = var4.method8448();
        int var10 = var4.method8448();
        int var11 = var4.method8300();
        int var12 = var4.method8300();
        int var13 = var4.method8300();
        int var14 = var4.method8300();
        int var15 = var4.method8300();
        int var16 = var4.method8300();
        int var17 = var4.method8300();
        int var18 = var4.method8448();
        int var19 = var4.method8448();
        int var20 = var4.method8448();
        int var21 = var4.method8448();
        int var22 = var4.method8448();
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
        this.field2432 = var9;
        this.field2466 = var10;
        this.field2447 = var11;
        this.field2433 = new int[var9];
        this.field2434 = new int[var9];
        this.field2435 = new int[var9];
        this.field2437 = new int[var10];
        this.field2438 = new int[var10];
        this.field2439 = new int[var10];
        if (var11 > 0) {
            this.field2461 = new byte[var11];
            this.field2448 = new short[var11];
            this.field2450 = new short[var11];
            this.field2469 = new short[var11];
        }
        if (var16 == 1) {
            this.field2459 = new int[var9];
        }
        if (var12 == 1) {
            this.field2464 = new byte[var10];
            this.field2429 = new byte[var10];
            this.field2445 = new short[var10];
        }
        if (var13 == 255) {
            this.field2441 = new byte[var10];
        } else {
            this.field2446 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2442 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2472 = new int[var10];
        }
        if (var17 == 1) {
            this.field2453 = new int[var9][];
            this.field2457 = new int[var9][];
        }
        this.field2444 = new short[var10];
        var4.field5111 = var23;
        var5.field5111 = var39;
        var6.field5111 = var41;
        var7.field5111 = var43;
        var8.field5111 = var27;
        int var46 = 0;
        int var47 = 0;
        int var48 = 0;
        for (int var49 = 0; var49 < var9; var49++) {
            int var50 = var4.method8300();
            int var51 = 0;
            if ((var50 & 0x1) != 0) {
                var51 = var5.method8315();
            }
            int var52 = 0;
            if ((var50 & 0x2) != 0) {
                var52 = var6.method8315();
            }
            int var53 = 0;
            if ((var50 & 0x4) != 0) {
                var53 = var7.method8315();
            }
            this.field2433[var49] = var46 + var51;
            this.field2434[var49] = var47 + var52;
            this.field2435[var49] = var48 + var53;
            var46 = this.field2433[var49];
            var47 = this.field2434[var49];
            var48 = this.field2435[var49];
            if (var16 == 1) {
                this.field2459[var49] = var8.method8300();
            }
        }
        if (var17 == 1) {
            for (int var54 = 0; var54 < var9; var54++) {
                int var55 = var8.method8300();
                this.field2453[var54] = new int[var55];
                this.field2457[var54] = new int[var55];
                for (int var56 = 0; var56 < var55; var56++) {
                    this.field2453[var54][var56] = var8.method8300();
                    this.field2457[var54][var56] = var8.method8300();
                }
            }
        }
        var4.field5111 = var35;
        var5.field5111 = var30;
        var6.field5111 = var28;
        var7.field5111 = var33;
        var8.field5111 = var29;
        for (int var57 = 0; var57 < var10; var57++) {
            this.field2444[var57] = (short) var4.method8448();
            if (var12 == 1) {
                int var58 = var5.method8300();
                if ((var58 & 0x1) == 1) {
                    this.field2464[var57] = 1;
                    var2 = true;
                } else {
                    this.field2464[var57] = 0;
                }
                if ((var58 & 0x2) == 2) {
                    this.field2429[var57] = (byte) (var58 >> 2);
                    this.field2445[var57] = this.field2444[var57];
                    this.field2444[var57] = 127;
                    if (this.field2445[var57] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field2429[var57] = -1;
                    this.field2445[var57] = -1;
                }
            }
            if (var13 == 255) {
                this.field2441[var57] = var6.method8301();
            }
            if (var14 == 1) {
                this.field2442[var57] = var7.method8301();
            }
            if (var15 == 1) {
                this.field2472[var57] = var8.method8300();
            }
        }
        var4.field5111 = var32;
        var5.field5111 = var25;
        int var59 = 0;
        int var60 = 0;
        int var61 = 0;
        int var62 = 0;
        for (int var63 = 0; var63 < var10; var63++) {
            int var64 = var5.method8300();
            if (var64 == 1) {
                var59 = var4.method8315() + var62;
                var60 = var4.method8315() + var59;
                var61 = var4.method8315() + var60;
                var62 = var61;
                this.field2437[var63] = var59;
                this.field2438[var63] = var60;
                this.field2439[var63] = var61;
            }
            if (var64 == 2) {
                var60 = var61;
                var61 = var4.method8315() + var62;
                var62 = var61;
                this.field2437[var63] = var59;
                this.field2438[var63] = var60;
                this.field2439[var63] = var61;
            }
            if (var64 == 3) {
                var59 = var61;
                var61 = var4.method8315() + var62;
                var62 = var61;
                this.field2437[var63] = var59;
                this.field2438[var63] = var60;
                this.field2439[var63] = var61;
            }
            if (var64 == 4) {
                int var67 = var59;
                var59 = var60;
                var60 = var67;
                var61 = var4.method8315() + var62;
                var62 = var61;
                this.field2437[var63] = var59;
                this.field2438[var63] = var67;
                this.field2439[var63] = var61;
            }
        }
        var4.field5111 = var37;
        for (int var68 = 0; var68 < var11; var68++) {
            this.field2461[var68] = 0;
            this.field2448[var68] = (short) var4.method8448();
            this.field2450[var68] = (short) var4.method8448();
            this.field2469[var68] = (short) var4.method8448();
        }
        if (this.field2429 != null) {
            boolean var69 = false;
            for (int var70 = 0; var70 < var10; var70++) {
                int var71 = this.field2429[var70] & 0xFF;
                if (var71 != 255) {
                    if ((this.field2448[var71] & 0xFFFF) == this.field2437[var70] && (this.field2450[var71] & 0xFFFF) == this.field2438[var70] && (this.field2469[var71] & 0xFFFF) == this.field2439[var70]) {
                        this.field2429[var70] = -1;
                    } else {
                        var69 = true;
                    }
                }
            }
            if (!var69) {
                this.field2429 = null;
            }
        }
        if (!var3) {
            this.field2445 = null;
        }
        if (!var2) {
            this.field2464 = null;
        }
    }

    @ObfuscatedName("ic.az([B)V")
    public void method4031(byte[] arg0) {
        class515 var2 = new class515(arg0);
        class515 var3 = new class515(arg0);
        class515 var4 = new class515(arg0);
        class515 var5 = new class515(arg0);
        class515 var6 = new class515(arg0);
        class515 var7 = new class515(arg0);
        class515 var8 = new class515(arg0);
        var2.field5111 = arg0.length - 23;
        int var9 = var2.method8448();
        int var10 = var2.method8448();
        int var11 = var2.method8300();
        int var12 = var2.method8300();
        int var13 = var2.method8300();
        int var14 = var2.method8300();
        int var15 = var2.method8300();
        int var16 = var2.method8300();
        int var17 = var2.method8300();
        int var18 = var2.method8448();
        int var19 = var2.method8448();
        int var20 = var2.method8448();
        int var21 = var2.method8448();
        int var22 = var2.method8448();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field2461 = new byte[var11];
            var2.field5111 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field2461[var26] = var2.method8301();
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
        this.field2432 = var9;
        this.field2466 = var10;
        this.field2447 = var11;
        this.field2433 = new int[var9];
        this.field2434 = new int[var9];
        this.field2435 = new int[var9];
        this.field2437 = new int[var10];
        this.field2438 = new int[var10];
        this.field2439 = new int[var10];
        if (var17 == 1) {
            this.field2459 = new int[var9];
        }
        if (var12 == 1) {
            this.field2464 = new byte[var10];
        }
        if (var13 == 255) {
            this.field2441 = new byte[var10];
        } else {
            this.field2446 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2442 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2472 = new int[var10];
        }
        if (var16 == 1) {
            this.field2445 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field2429 = new byte[var10];
        }
        this.field2444 = new short[var10];
        if (var11 > 0) {
            this.field2448 = new short[var11];
            this.field2450 = new short[var11];
            this.field2469 = new short[var11];
        }
        var2.field5111 = var11;
        var3.field5111 = var44;
        var4.field5111 = var46;
        var5.field5111 = var48;
        var6.field5111 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method8300();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method8315();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method8315();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method8315();
            }
            this.field2433[var67] = var64 + var69;
            this.field2434[var67] = var65 + var70;
            this.field2435[var67] = var66 + var71;
            var64 = this.field2433[var67];
            var65 = this.field2434[var67];
            var66 = this.field2435[var67];
            if (var17 == 1) {
                this.field2459[var67] = var6.method8300();
            }
        }
        var2.field5111 = var42;
        var3.field5111 = var31;
        var4.field5111 = var34;
        var5.field5111 = var37;
        var6.field5111 = var35;
        var7.field5111 = var40;
        var8.field5111 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field2444[var72] = (short) var2.method8448();
            if (var12 == 1) {
                this.field2464[var72] = var3.method8301();
            }
            if (var13 == 255) {
                this.field2441[var72] = var4.method8301();
            }
            if (var14 == 1) {
                this.field2442[var72] = var5.method8301();
            }
            if (var15 == 1) {
                this.field2472[var72] = var6.method8300();
            }
            if (var16 == 1) {
                this.field2445[var72] = (short) (var7.method8448() - 1);
            }
            if (this.field2429 != null && this.field2445[var72] != -1) {
                this.field2429[var72] = (byte) (var8.method8300() - 1);
            }
        }
        var2.field5111 = var33;
        var3.field5111 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method8300();
            if (var78 == 1) {
                var73 = var2.method8315() + var76;
                var74 = var2.method8315() + var73;
                var75 = var2.method8315() + var74;
                var76 = var75;
                this.field2437[var77] = var73;
                this.field2438[var77] = var74;
                this.field2439[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method8315() + var76;
                var76 = var75;
                this.field2437[var77] = var73;
                this.field2438[var77] = var74;
                this.field2439[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method8315() + var76;
                var76 = var75;
                this.field2437[var77] = var73;
                this.field2438[var77] = var74;
                this.field2439[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method8315() + var76;
                var76 = var75;
                this.field2437[var77] = var73;
                this.field2438[var77] = var81;
                this.field2439[var77] = var75;
            }
        }
        var2.field5111 = var50;
        var3.field5111 = var52;
        var4.field5111 = var54;
        var5.field5111 = var56;
        var6.field5111 = var58;
        var7.field5111 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field2461[var82] & 0xFF;
            if (var83 == 0) {
                this.field2448[var82] = (short) var2.method8448();
                this.field2450[var82] = (short) var2.method8448();
                this.field2469[var82] = (short) var2.method8448();
            }
        }
        var2.field5111 = var62;
        int var84 = var2.method8300();
        if (var84 == 0) {
            return;
        }
        new class247();
        var2.method8448();
        var2.method8448();
        var2.method8448();
        var2.method8306();
    }

    @ObfuscatedName("ic.ap([B)V")
    public void method4016(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class515 var4 = new class515(arg0);
        class515 var5 = new class515(arg0);
        class515 var6 = new class515(arg0);
        class515 var7 = new class515(arg0);
        class515 var8 = new class515(arg0);
        var4.field5111 = arg0.length - 18;
        int var9 = var4.method8448();
        int var10 = var4.method8448();
        int var11 = var4.method8300();
        int var12 = var4.method8300();
        int var13 = var4.method8300();
        int var14 = var4.method8300();
        int var15 = var4.method8300();
        int var16 = var4.method8300();
        int var17 = var4.method8448();
        int var18 = var4.method8448();
        int var19 = var4.method8448();
        int var20 = var4.method8448();
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
        this.field2432 = var9;
        this.field2466 = var10;
        this.field2447 = var11;
        this.field2433 = new int[var9];
        this.field2434 = new int[var9];
        this.field2435 = new int[var9];
        this.field2437 = new int[var10];
        this.field2438 = new int[var10];
        this.field2439 = new int[var10];
        if (var11 > 0) {
            this.field2461 = new byte[var11];
            this.field2448 = new short[var11];
            this.field2450 = new short[var11];
            this.field2469 = new short[var11];
        }
        if (var16 == 1) {
            this.field2459 = new int[var9];
        }
        if (var12 == 1) {
            this.field2464 = new byte[var10];
            this.field2429 = new byte[var10];
            this.field2445 = new short[var10];
        }
        if (var13 == 255) {
            this.field2441 = new byte[var10];
        } else {
            this.field2446 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2442 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2472 = new int[var10];
        }
        this.field2444 = new short[var10];
        var4.field5111 = var21;
        var5.field5111 = var36;
        var6.field5111 = var38;
        var7.field5111 = var40;
        var8.field5111 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method8300();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method8315();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method8315();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method8315();
            }
            this.field2433[var46] = var43 + var48;
            this.field2434[var46] = var44 + var49;
            this.field2435[var46] = var45 + var50;
            var43 = this.field2433[var46];
            var44 = this.field2434[var46];
            var45 = this.field2435[var46];
            if (var16 == 1) {
                this.field2459[var46] = var8.method8300();
            }
        }
        var4.field5111 = var32;
        var5.field5111 = var28;
        var6.field5111 = var26;
        var7.field5111 = var30;
        var8.field5111 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field2444[var51] = (short) var4.method8448();
            if (var12 == 1) {
                int var52 = var5.method8300();
                if ((var52 & 0x1) == 1) {
                    this.field2464[var51] = 1;
                    var2 = true;
                } else {
                    this.field2464[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field2429[var51] = (byte) (var52 >> 2);
                    this.field2445[var51] = this.field2444[var51];
                    this.field2444[var51] = 127;
                    if (this.field2445[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field2429[var51] = -1;
                    this.field2445[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field2441[var51] = var6.method8301();
            }
            if (var14 == 1) {
                this.field2442[var51] = var7.method8301();
            }
            if (var15 == 1) {
                this.field2472[var51] = var8.method8300();
            }
        }
        var4.field5111 = var25;
        var5.field5111 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method8300();
            if (var58 == 1) {
                var53 = var4.method8315() + var56;
                var54 = var4.method8315() + var53;
                var55 = var4.method8315() + var54;
                var56 = var55;
                this.field2437[var57] = var53;
                this.field2438[var57] = var54;
                this.field2439[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method8315() + var56;
                var56 = var55;
                this.field2437[var57] = var53;
                this.field2438[var57] = var54;
                this.field2439[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method8315() + var56;
                var56 = var55;
                this.field2437[var57] = var53;
                this.field2438[var57] = var54;
                this.field2439[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method8315() + var56;
                var56 = var55;
                this.field2437[var57] = var53;
                this.field2438[var57] = var61;
                this.field2439[var57] = var55;
            }
        }
        var4.field5111 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field2461[var62] = 0;
            this.field2448[var62] = (short) var4.method8448();
            this.field2450[var62] = (short) var4.method8448();
            this.field2469[var62] = (short) var4.method8448();
        }
        if (this.field2429 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field2429[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field2448[var65] & 0xFFFF) == this.field2437[var64] && (this.field2450[var65] & 0xFFFF) == this.field2438[var64] && (this.field2469[var65] & 0xFFFF) == this.field2439[var64]) {
                        this.field2429[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field2429 = null;
            }
        }
        if (!var3) {
            this.field2445 = null;
        }
        if (!var2) {
            this.field2464 = null;
        }
    }

    public class222(class222[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        this.field2432 = 0;
        this.field2466 = 0;
        this.field2447 = 0;
        this.field2446 = -1;
        for (int var10 = 0; var10 < arg1; var10++) {
            class222 var11 = arg0[var10];
            if (var11 != null) {
                this.field2432 += var11.field2432;
                this.field2466 += var11.field2466;
                this.field2447 += var11.field2447;
                if (var11.field2441 == null) {
                    if (this.field2446 == -1) {
                        this.field2446 = var11.field2446;
                    }
                    if (this.field2446 != var11.field2446) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var11.field2464 != null;
                var5 |= var11.field2442 != null;
                var6 |= var11.field2472 != null;
                var7 |= var11.field2445 != null;
                var8 |= var11.field2429 != null;
                var9 |= var11.field2453 != null;
            }
        }
        this.field2433 = new int[this.field2432];
        this.field2434 = new int[this.field2432];
        this.field2435 = new int[this.field2432];
        this.field2459 = new int[this.field2432];
        this.field2437 = new int[this.field2466];
        this.field2438 = new int[this.field2466];
        this.field2439 = new int[this.field2466];
        if (var3) {
            this.field2464 = new byte[this.field2466];
        }
        if (var4) {
            this.field2441 = new byte[this.field2466];
        }
        if (var5) {
            this.field2442 = new byte[this.field2466];
        }
        if (var6) {
            this.field2472 = new int[this.field2466];
        }
        if (var7) {
            this.field2445 = new short[this.field2466];
        }
        if (var8) {
            this.field2429 = new byte[this.field2466];
        }
        if (var9) {
            this.field2453 = new int[this.field2432][];
            this.field2457 = new int[this.field2432][];
        }
        this.field2444 = new short[this.field2466];
        if (this.field2447 > 0) {
            this.field2461 = new byte[this.field2447];
            this.field2448 = new short[this.field2447];
            this.field2450 = new short[this.field2447];
            this.field2469 = new short[this.field2447];
        }
        this.field2432 = 0;
        this.field2466 = 0;
        this.field2447 = 0;
        for (int var12 = 0; var12 < arg1; var12++) {
            class222 var13 = arg0[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < var13.field2466; var14++) {
                    if (var3 && var13.field2464 != null) {
                        this.field2464[this.field2466] = var13.field2464[var14];
                    }
                    if (var4) {
                        if (var13.field2441 == null) {
                            this.field2441[this.field2466] = var13.field2446;
                        } else {
                            this.field2441[this.field2466] = var13.field2441[var14];
                        }
                    }
                    if (var5 && var13.field2442 != null) {
                        this.field2442[this.field2466] = var13.field2442[var14];
                    }
                    if (var6 && var13.field2472 != null) {
                        this.field2472[this.field2466] = var13.field2472[var14];
                    }
                    if (var7) {
                        if (var13.field2445 == null) {
                            this.field2445[this.field2466] = -1;
                        } else {
                            this.field2445[this.field2466] = var13.field2445[var14];
                        }
                    }
                    if (var8) {
                        if (var13.field2429 == null || var13.field2429[var14] == -1) {
                            this.field2429[this.field2466] = -1;
                        } else {
                            this.field2429[this.field2466] = (byte) (var13.field2429[var14] + this.field2447);
                        }
                    }
                    this.field2444[this.field2466] = var13.field2444[var14];
                    this.field2437[this.field2466] = this.method3947(var13, var13.field2437[var14]);
                    this.field2438[this.field2466] = this.method3947(var13, var13.field2438[var14]);
                    this.field2439[this.field2466] = this.method3947(var13, var13.field2439[var14]);
                    this.field2466++;
                }
                for (int var15 = 0; var15 < var13.field2447; var15++) {
                    byte var16 = this.field2461[this.field2447] = var13.field2461[var15];
                    if (var16 == 0) {
                        this.field2448[this.field2447] = (short) this.method3947(var13, var13.field2448[var15]);
                        this.field2450[this.field2447] = (short) this.method3947(var13, var13.field2450[var15]);
                        this.field2469[this.field2447] = (short) this.method3947(var13, var13.field2469[var15]);
                    }
                    this.field2447++;
                }
            }
        }
    }

    @ObfuscatedName("ic.aa(Lic;I)I")
    public final int method3947(class222 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field2433[arg1];
        int var5 = arg0.field2434[arg1];
        int var6 = arg0.field2435[arg1];
        for (int var7 = 0; var7 < this.field2432; var7++) {
            if (this.field2433[var7] == var4 && this.field2434[var7] == var5 && this.field2435[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field2433[this.field2432] = var4;
            this.field2434[this.field2432] = var5;
            this.field2435[this.field2432] = var6;
            if (arg0.field2459 != null) {
                this.field2459[this.field2432] = arg0.field2459[arg1];
            }
            if (arg0.field2453 != null) {
                this.field2453[this.field2432] = arg0.field2453[arg1];
                this.field2457[this.field2432] = arg0.field2457[arg1];
            }
            var3 = this.field2432++;
        }
        return var3;
    }

    public class222(class222 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field2432 = arg0.field2432;
        this.field2466 = arg0.field2466;
        this.field2447 = arg0.field2447;
        if (arg1) {
            this.field2433 = arg0.field2433;
            this.field2434 = arg0.field2434;
            this.field2435 = arg0.field2435;
        } else {
            this.field2433 = new int[this.field2432];
            this.field2434 = new int[this.field2432];
            this.field2435 = new int[this.field2432];
            for (int var6 = 0; var6 < this.field2432; var6++) {
                this.field2433[var6] = arg0.field2433[var6];
                this.field2434[var6] = arg0.field2434[var6];
                this.field2435[var6] = arg0.field2435[var6];
            }
        }
        if (arg2) {
            this.field2444 = arg0.field2444;
        } else {
            this.field2444 = new short[this.field2466];
            for (int var7 = 0; var7 < this.field2466; var7++) {
                this.field2444[var7] = arg0.field2444[var7];
            }
        }
        if (arg3 || arg0.field2445 == null) {
            this.field2445 = arg0.field2445;
        } else {
            this.field2445 = new short[this.field2466];
            for (int var8 = 0; var8 < this.field2466; var8++) {
                this.field2445[var8] = arg0.field2445[var8];
            }
        }
        if (arg4) {
            this.field2442 = arg0.field2442;
        } else {
            this.field2442 = new byte[this.field2466];
            if (arg0.field2442 == null) {
                for (int var9 = 0; var9 < this.field2466; var9++) {
                    this.field2442[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field2466; var10++) {
                    this.field2442[var10] = arg0.field2442[var10];
                }
            }
        }
        this.field2437 = arg0.field2437;
        this.field2438 = arg0.field2438;
        this.field2439 = arg0.field2439;
        this.field2464 = arg0.field2464;
        this.field2441 = arg0.field2441;
        this.field2429 = arg0.field2429;
        this.field2446 = arg0.field2446;
        this.field2461 = arg0.field2461;
        this.field2448 = arg0.field2448;
        this.field2450 = arg0.field2450;
        this.field2469 = arg0.field2469;
        this.field2459 = arg0.field2459;
        this.field2472 = arg0.field2472;
        this.field2454 = arg0.field2454;
        this.field2455 = arg0.field2455;
        this.field2443 = arg0.field2443;
        this.field2458 = arg0.field2458;
        this.field2460 = arg0.field2460;
        this.field2453 = arg0.field2453;
        this.field2457 = arg0.field2457;
        this.field2473 = arg0.field2473;
        this.field2462 = arg0.field2462;
    }

    @ObfuscatedName("ic.af()Lic;")
    public class222 method3949() {
        class222 var1 = new class222();
        if (this.field2464 != null) {
            var1.field2464 = new byte[this.field2466];
            for (int var2 = 0; var2 < this.field2466; var2++) {
                var1.field2464[var2] = this.field2464[var2];
            }
        }
        var1.field2432 = this.field2432;
        var1.field2466 = this.field2466;
        var1.field2447 = this.field2447;
        var1.field2433 = this.field2433;
        var1.field2434 = this.field2434;
        var1.field2435 = this.field2435;
        var1.field2437 = this.field2437;
        var1.field2438 = this.field2438;
        var1.field2439 = this.field2439;
        var1.field2441 = this.field2441;
        var1.field2442 = this.field2442;
        var1.field2429 = this.field2429;
        var1.field2444 = this.field2444;
        var1.field2445 = this.field2445;
        var1.field2446 = this.field2446;
        var1.field2461 = this.field2461;
        var1.field2448 = this.field2448;
        var1.field2450 = this.field2450;
        var1.field2469 = this.field2469;
        var1.field2459 = this.field2459;
        var1.field2472 = this.field2472;
        var1.field2454 = this.field2454;
        var1.field2455 = this.field2455;
        var1.field2443 = this.field2443;
        var1.field2458 = this.field2458;
        var1.field2473 = this.field2473;
        var1.field2462 = this.field2462;
        return var1;
    }

    @ObfuscatedName("ic.ad([[IIIIZI)Lic;")
    public class222 method3950(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method3963();
        int var7 = this.field2465 + arg1;
        int var8 = this.field2440 + arg1;
        int var9 = this.field2468 + arg3;
        int var10 = this.field2467 + arg3;
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
        class222 var15;
        if (arg4) {
            var15 = new class222();
            var15.field2432 = this.field2432;
            var15.field2466 = this.field2466;
            var15.field2447 = this.field2447;
            var15.field2433 = this.field2433;
            var15.field2435 = this.field2435;
            var15.field2437 = this.field2437;
            var15.field2438 = this.field2438;
            var15.field2439 = this.field2439;
            var15.field2464 = this.field2464;
            var15.field2441 = this.field2441;
            var15.field2442 = this.field2442;
            var15.field2429 = this.field2429;
            var15.field2444 = this.field2444;
            var15.field2445 = this.field2445;
            var15.field2446 = this.field2446;
            var15.field2461 = this.field2461;
            var15.field2448 = this.field2448;
            var15.field2450 = this.field2450;
            var15.field2469 = this.field2469;
            var15.field2459 = this.field2459;
            var15.field2472 = this.field2472;
            var15.field2454 = this.field2454;
            var15.field2455 = this.field2455;
            var15.field2473 = this.field2473;
            var15.field2462 = this.field2462;
            var15.field2434 = new int[var15.field2432];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field2432; var16++) {
                int var17 = this.field2433[var16] + arg1;
                int var18 = this.field2435[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field2434[var16] = this.field2434[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field2432; var26++) {
                int var27 = (-this.field2434[var26] << 16) / this.field2638;
                if (var27 < arg5) {
                    int var28 = this.field2433[var26] + arg1;
                    int var29 = this.field2435[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field2434[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field2434[var26];
                }
            }
        }
        var15.method3962();
        return var15;
    }

    @ObfuscatedName("ic.aq()V")
    public void method3951() {
        int var10002;
        if (this.field2459 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field2432; var3++) {
                int var4 = this.field2459[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field2454 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field2454[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field2432) {
                int var7 = this.field2459[var6];
                this.field2454[var7][var1[var7]++] = var6++;
            }
            this.field2459 = null;
        }
        if (this.field2472 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field2466; var10++) {
            int var11 = this.field2472[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field2455 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field2455[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field2466) {
            int var14 = this.field2472[var13];
            this.field2455[var14][var8[var14]++] = var13++;
        }
        this.field2472 = null;
    }

    @ObfuscatedName("ic.al()V")
    public void method3952() {
        for (int var1 = 0; var1 < this.field2432; var1++) {
            int var2 = this.field2433[var1];
            this.field2433[var1] = this.field2435[var1];
            this.field2435[var1] = -var2;
        }
        this.method3962();
    }

    @ObfuscatedName("ic.an()V")
    public void method3953() {
        for (int var1 = 0; var1 < this.field2432; var1++) {
            this.field2433[var1] = -this.field2433[var1];
            this.field2435[var1] = -this.field2435[var1];
        }
        this.method3962();
    }

    @ObfuscatedName("ic.ar()V")
    public void method3954() {
        for (int var1 = 0; var1 < this.field2432; var1++) {
            int var2 = this.field2435[var1];
            this.field2435[var1] = this.field2433[var1];
            this.field2433[var1] = -var2;
        }
        this.method3962();
    }

    @ObfuscatedName("ic.ab(I)V")
    public void method3955(int arg0) {
        int var2 = field2431[arg0];
        int var3 = field2456[arg0];
        for (int var4 = 0; var4 < this.field2432; var4++) {
            int var5 = this.field2435[var4] * var2 + this.field2433[var4] * var3 >> 16;
            this.field2435[var4] = this.field2435[var4] * var3 - this.field2433[var4] * var2 >> 16;
            this.field2433[var4] = var5;
        }
        this.method3962();
    }

    @ObfuscatedName("ic.ag(III)V")
    public void method3956(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2432; var4++) {
            this.field2433[var4] += arg0;
            this.field2434[var4] += arg1;
            this.field2435[var4] += arg2;
        }
        this.method3962();
    }

    @ObfuscatedName("ic.am(SS)V")
    public void method3996(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2466; var3++) {
            if (this.field2444[var3] == arg0) {
                this.field2444[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("ic.ax(SS)V")
    public void method3958(short arg0, short arg1) {
        if (this.field2445 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field2466; var3++) {
            if (this.field2445[var3] == arg0) {
                this.field2445[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("ic.ah()V")
    public void method3957() {
        for (int var1 = 0; var1 < this.field2432; var1++) {
            this.field2435[var1] = -this.field2435[var1];
        }
        for (int var2 = 0; var2 < this.field2466; var2++) {
            int var3 = this.field2437[var2];
            this.field2437[var2] = this.field2439[var2];
            this.field2439[var2] = var3;
        }
        this.method3962();
    }

    @ObfuscatedName("ic.as(III)V")
    public void method3960(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2432; var4++) {
            this.field2433[var4] = this.field2433[var4] * arg0 / 128;
            this.field2434[var4] = this.field2434[var4] * arg1 / 128;
            this.field2435[var4] = this.field2435[var4] * arg2 / 128;
        }
        this.method3962();
    }

    @ObfuscatedName("ic.ay()V")
    public void method3961() {
        if (this.field2443 != null) {
            return;
        }
        this.field2443 = new class242[this.field2432];
        for (int var1 = 0; var1 < this.field2432; var1++) {
            this.field2443[var1] = new class242();
        }
        for (int var2 = 0; var2 < this.field2466; var2++) {
            int var3 = this.field2437[var2];
            int var4 = this.field2438[var2];
            int var5 = this.field2439[var2];
            int var6 = this.field2433[var4] - this.field2433[var3];
            int var7 = this.field2434[var4] - this.field2434[var3];
            int var8 = this.field2435[var4] - this.field2435[var3];
            int var9 = this.field2433[var5] - this.field2433[var3];
            int var10 = this.field2434[var5] - this.field2434[var3];
            int var11 = this.field2435[var5] - this.field2435[var3];
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
            if (this.field2464 == null) {
                var19 = 0;
            } else {
                var19 = this.field2464[var2];
            }
            if (var19 == 0) {
                class242 var20 = this.field2443[var3];
                var20.field2798 += var16;
                var20.field2797 += var17;
                var20.field2799 += var18;
                var20.field2800++;
                class242 var21 = this.field2443[var4];
                var21.field2798 += var16;
                var21.field2797 += var17;
                var21.field2799 += var18;
                var21.field2800++;
                class242 var22 = this.field2443[var5];
                var22.field2798 += var16;
                var22.field2797 += var17;
                var22.field2799 += var18;
                var22.field2800++;
            } else if (var19 == 1) {
                if (this.field2458 == null) {
                    this.field2458 = new class234[this.field2466];
                }
                class234 var23 = this.field2458[var2] = new class234();
                var23.field2641 = var16;
                var23.field2640 = var17;
                var23.field2642 = var18;
            }
        }
    }

    @ObfuscatedName("ic.aj()V")
    public void method3962() {
        this.field2443 = null;
        this.field2460 = null;
        this.field2458 = null;
        this.field2463 = false;
    }

    @ObfuscatedName("ic.av()V")
    public void method3963() {
        if (this.field2463) {
            return;
        }
        this.field2638 = 0;
        this.field2471 = 0;
        this.field2465 = 999999;
        this.field2440 = -999999;
        this.field2467 = -99999;
        this.field2468 = 99999;
        for (int var1 = 0; var1 < this.field2432; var1++) {
            int var2 = this.field2433[var1];
            int var3 = this.field2434[var1];
            int var4 = this.field2435[var1];
            if (var2 < this.field2465) {
                this.field2465 = var2;
            }
            if (var2 > this.field2440) {
                this.field2440 = var2;
            }
            if (var4 < this.field2468) {
                this.field2468 = var4;
            }
            if (var4 > this.field2467) {
                this.field2467 = var4;
            }
            if (-var3 > this.field2638) {
                this.field2638 = -var3;
            }
            if (var3 > this.field2471) {
                this.field2471 = var3;
            }
        }
        this.field2463 = true;
    }

    @ObfuscatedName("ic.aw(Lic;Lic;IIIZ)V")
    public static void method3964(class222 arg0, class222 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method3963();
        arg0.method3961();
        arg1.method3963();
        arg1.method3961();
        field2449++;
        int var6 = 0;
        int[] var7 = arg1.field2433;
        int var8 = arg1.field2432;
        for (int var9 = 0; var9 < arg0.field2432; var9++) {
            class242 var10 = arg0.field2443[var9];
            if (var10.field2800 != 0) {
                int var11 = arg0.field2434[var9] - arg3;
                if (var11 <= arg1.field2471) {
                    int var12 = arg0.field2433[var9] - arg2;
                    if (var12 >= arg1.field2465 && var12 <= arg1.field2440) {
                        int var13 = arg0.field2435[var9] - arg4;
                        if (var13 >= arg1.field2468 && var13 <= arg1.field2467) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class242 var15 = arg1.field2443[var14];
                                if (var7[var14] == var12 && arg1.field2435[var14] == var13 && arg1.field2434[var14] == var11 && var15.field2800 != 0) {
                                    if (arg0.field2460 == null) {
                                        arg0.field2460 = new class242[arg0.field2432];
                                    }
                                    if (arg1.field2460 == null) {
                                        arg1.field2460 = new class242[var8];
                                    }
                                    class242 var16 = arg0.field2460[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field2460[var9] = new class242(var10);
                                    }
                                    class242 var17 = arg1.field2460[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field2460[var14] = new class242(var15);
                                    }
                                    var16.field2798 += var15.field2798;
                                    var16.field2797 += var15.field2797;
                                    var16.field2799 += var15.field2799;
                                    var16.field2800 += var15.field2800;
                                    var17.field2798 += var10.field2798;
                                    var17.field2797 += var10.field2797;
                                    var17.field2799 += var10.field2799;
                                    var17.field2800 += var10.field2800;
                                    var6++;
                                    field2452[var9] = field2449;
                                    field2470[var14] = field2449;
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
        for (int var18 = 0; var18 < arg0.field2466; var18++) {
            if (field2452[arg0.field2437[var18]] == field2449 && field2452[arg0.field2438[var18]] == field2449 && field2452[arg0.field2439[var18]] == field2449) {
                if (arg0.field2464 == null) {
                    arg0.field2464 = new byte[arg0.field2466];
                }
                arg0.field2464[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field2466; var19++) {
            if (field2470[arg1.field2437[var19]] == field2449 && field2470[arg1.field2438[var19]] == field2449 && field2470[arg1.field2439[var19]] == field2449) {
                if (arg1.field2464 == null) {
                    arg1.field2464 = new byte[arg1.field2466];
                }
                arg1.field2464[var19] = 2;
            }
        }
    }

    @ObfuscatedName("ic.ak(IIIII)Ljr;")
    public final class240 method3965(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method3961();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class240 var8 = new class240();
        var8.field2717 = new int[this.field2466];
        var8.field2718 = new int[this.field2466];
        var8.field2719 = new int[this.field2466];
        if (this.field2447 > 0 && this.field2429 != null) {
            int[] var9 = new int[this.field2447];
            for (int var10 = 0; var10 < this.field2466; var10++) {
                if (this.field2429[var10] != -1) {
                    var9[this.field2429[var10] & 0xFF]++;
                }
            }
            var8.field2725 = 0;
            for (int var11 = 0; var11 < this.field2447; var11++) {
                if (var9[var11] > 0 && this.field2461[var11] == 0) {
                    var8.field2725++;
                }
            }
            var8.field2726 = new int[var8.field2725];
            var8.field2727 = new int[var8.field2725];
            var8.field2720 = new int[var8.field2725];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field2447; var13++) {
                if (var9[var13] > 0 && this.field2461[var13] == 0) {
                    var8.field2726[var12] = this.field2448[var13] & 0xFFFF;
                    var8.field2727[var12] = this.field2450[var13] & 0xFFFF;
                    var8.field2720[var12] = this.field2469[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field2722 = new byte[this.field2466];
            for (int var14 = 0; var14 < this.field2466; var14++) {
                if (this.field2429[var14] == -1) {
                    var8.field2722[var14] = -1;
                } else {
                    var8.field2722[var14] = (byte) var9[this.field2429[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field2466; var15++) {
            byte var16;
            if (this.field2464 == null) {
                var16 = 0;
            } else {
                var16 = this.field2464[var15];
            }
            byte var17;
            if (this.field2442 == null) {
                var17 = 0;
            } else {
                var17 = this.field2442[var15];
            }
            short var18;
            if (this.field2445 == null) {
                var18 = -1;
            } else {
                var18 = this.field2445[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field2444[var15] & 0xFFFF;
                    class242 var20;
                    if (this.field2460 == null || this.field2460[this.field2437[var15]] == null) {
                        var20 = this.field2443[this.field2437[var15]];
                    } else {
                        var20 = this.field2460[this.field2437[var15]];
                    }
                    int var21 = (var20.field2799 * arg4 + var20.field2798 * arg2 + var20.field2797 * arg3) / (var20.field2800 * var7) + arg0;
                    var8.field2717[var15] = method4007(var19, var21);
                    class242 var22;
                    if (this.field2460 == null || this.field2460[this.field2438[var15]] == null) {
                        var22 = this.field2443[this.field2438[var15]];
                    } else {
                        var22 = this.field2460[this.field2438[var15]];
                    }
                    int var23 = (var22.field2799 * arg4 + var22.field2798 * arg2 + var22.field2797 * arg3) / (var22.field2800 * var7) + arg0;
                    var8.field2718[var15] = method4007(var19, var23);
                    class242 var24;
                    if (this.field2460 == null || this.field2460[this.field2439[var15]] == null) {
                        var24 = this.field2443[this.field2439[var15]];
                    } else {
                        var24 = this.field2460[this.field2439[var15]];
                    }
                    int var25 = (var24.field2799 * arg4 + var24.field2798 * arg2 + var24.field2797 * arg3) / (var24.field2800 * var7) + arg0;
                    var8.field2719[var15] = method4007(var19, var25);
                } else if (var16 == 1) {
                    class234 var26 = this.field2458[var15];
                    int var27 = (var26.field2642 * arg4 + var26.field2641 * arg2 + var26.field2640 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field2717[var15] = method4007(this.field2444[var15] & 0xFFFF, var27);
                    var8.field2719[var15] = -1;
                } else if (var16 == 3) {
                    var8.field2717[var15] = 128;
                    var8.field2719[var15] = -1;
                } else {
                    var8.field2719[var15] = -2;
                }
            } else if (var16 == 0) {
                class242 var28;
                if (this.field2460 == null || this.field2460[this.field2437[var15]] == null) {
                    var28 = this.field2443[this.field2437[var15]];
                } else {
                    var28 = this.field2460[this.field2437[var15]];
                }
                int var29 = (var28.field2799 * arg4 + var28.field2798 * arg2 + var28.field2797 * arg3) / (var28.field2800 * var7) + arg0;
                var8.field2717[var15] = method3967(var29);
                class242 var30;
                if (this.field2460 == null || this.field2460[this.field2438[var15]] == null) {
                    var30 = this.field2443[this.field2438[var15]];
                } else {
                    var30 = this.field2460[this.field2438[var15]];
                }
                int var31 = (var30.field2799 * arg4 + var30.field2798 * arg2 + var30.field2797 * arg3) / (var30.field2800 * var7) + arg0;
                var8.field2718[var15] = method3967(var31);
                class242 var32;
                if (this.field2460 == null || this.field2460[this.field2439[var15]] == null) {
                    var32 = this.field2443[this.field2439[var15]];
                } else {
                    var32 = this.field2460[this.field2439[var15]];
                }
                int var33 = (var32.field2799 * arg4 + var32.field2798 * arg2 + var32.field2797 * arg3) / (var32.field2800 * var7) + arg0;
                var8.field2719[var15] = method3967(var33);
            } else if (var16 == 1) {
                class234 var34 = this.field2458[var15];
                int var35 = (var34.field2642 * arg4 + var34.field2641 * arg2 + var34.field2640 * arg3) / (var7 / 2 + var7) + arg0;
                var8.field2717[var15] = method3967(var35);
                var8.field2719[var15] = -1;
            } else {
                var8.field2719[var15] = -2;
            }
        }
        this.method3951();
        var8.field2766 = this.field2432;
        var8.field2710 = this.field2433;
        var8.field2711 = this.field2434;
        var8.field2716 = this.field2435;
        var8.field2712 = this.field2466;
        var8.field2728 = this.field2437;
        var8.field2715 = this.field2438;
        var8.field2776 = this.field2439;
        var8.field2775 = this.field2441;
        var8.field2721 = this.field2442;
        var8.field2724 = this.field2446;
        var8.field2729 = this.field2454;
        var8.field2730 = this.field2455;
        var8.field2723 = this.field2445;
        var8.field2731 = this.field2453;
        var8.field2756 = this.field2457;
        return var8;
    }

    @ObfuscatedName("ic.bh(II)I")
    public static final int method4007(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("ic.bj(I)I")
    public static final int method3967(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
