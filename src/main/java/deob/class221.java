package deob;

@ObfuscatedName("it")
public class class221 extends class232 {

    @ObfuscatedName("it.as")
    public int field2418 = 0;

    @ObfuscatedName("it.ax")
    public int[] field2435;

    @ObfuscatedName("it.ap")
    public int[] field2430;

    @ObfuscatedName("it.ab")
    public int[] field2421;

    @ObfuscatedName("it.ak")
    public int field2422 = 0;

    @ObfuscatedName("it.ae")
    public int[] field2423;

    @ObfuscatedName("it.af")
    public int[] field2424;

    @ObfuscatedName("it.ao")
    public int[] field2425;

    @ObfuscatedName("it.aa")
    public byte[] field2459;

    @ObfuscatedName("it.aj")
    public byte[] field2427;

    @ObfuscatedName("it.ad")
    public byte[] field2428;

    @ObfuscatedName("it.ac")
    public byte[] field2458;

    @ObfuscatedName("it.ag")
    public short[] field2417;

    @ObfuscatedName("it.ar")
    public short[] field2440;

    @ObfuscatedName("it.ah")
    public byte field2432 = 0;

    @ObfuscatedName("it.az")
    public int field2433;

    @ObfuscatedName("it.au")
    public byte[] field2434;

    @ObfuscatedName("it.ai")
    public short[] field2426;

    @ObfuscatedName("it.aq")
    public short[] field2450;

    @ObfuscatedName("it.aw")
    public short[] field2437;

    @ObfuscatedName("it.ay")
    public int[] field2438;

    @ObfuscatedName("it.al")
    public int[] field2420;

    @ObfuscatedName("it.am")
    public int[][] field2431;

    @ObfuscatedName("it.bs")
    public int[][] field2441;

    @ObfuscatedName("it.bc")
    public int[][] field2442;

    @ObfuscatedName("it.bj")
    public int[][] field2436;

    @ObfuscatedName("it.bo")
    public class233[] field2444;

    @ObfuscatedName("it.bq")
    public class241[] field2445;

    @ObfuscatedName("it.bg")
    public class241[] field2446;

    @ObfuscatedName("it.bf")
    public short field2447;

    @ObfuscatedName("it.bd")
    public short field2448;

    @ObfuscatedName("it.ba")
    public boolean field2449 = false;

    @ObfuscatedName("it.bn")
    public int field2443;

    @ObfuscatedName("it.bb")
    public int field2451;

    @ObfuscatedName("it.bx")
    public int field2452;

    @ObfuscatedName("it.be")
    public int field2453;

    @ObfuscatedName("it.bh")
    public int field2454;

    @ObfuscatedName("it.bp")
    public static int[] field2455 = new int[10000];

    @ObfuscatedName("it.bw")
    public static int[] field2456 = new int[10000];

    @ObfuscatedName("it.bi")
    public static int field2457 = 0;

    @ObfuscatedName("it.bk")
    public static int[] field2439 = class226.field2523;

    @ObfuscatedName("it.bv")
    public static int[] field2419 = class226.field2520;

    public class221() {
    }

    @ObfuscatedName("it.at(Lnq;II)Lit;")
    public static class221 method3913(class357 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method6080(arg1, arg2);
        return var3 == null ? null : new class221(var3);
    }

    public class221(byte[] arg0) {
        class501 var2 = new class501(10);
        var2.method8114(-2);
        if (arg0[arg0.length - 1] == -3 && arg0[arg0.length - 2] == -1) {
            this.method3914(arg0);
        } else if (arg0[arg0.length - 1] == -2 && arg0[arg0.length - 2] == -1) {
            this.method3972(arg0);
        } else if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method3915(arg0);
        } else {
            this.method3916(arg0);
        }
    }

    @ObfuscatedName("it.av([B)V")
    public void method3914(byte[] arg0) {
        class501 var2 = new class501(arg0);
        class501 var3 = new class501(arg0);
        class501 var4 = new class501(arg0);
        class501 var5 = new class501(arg0);
        class501 var6 = new class501(arg0);
        class501 var7 = new class501(arg0);
        class501 var8 = new class501(arg0);
        var2.field5017 = arg0.length - 26;
        int var9 = var2.method8195();
        int var10 = var2.method8195();
        int var11 = var2.method8129();
        int var12 = var2.method8129();
        int var13 = var2.method8129();
        int var14 = var2.method8129();
        int var15 = var2.method8129();
        int var16 = var2.method8129();
        int var17 = var2.method8129();
        int var18 = var2.method8129();
        int var19 = var2.method8195();
        int var20 = var2.method8195();
        int var21 = var2.method8195();
        int var22 = var2.method8195();
        int var23 = var2.method8195();
        int var24 = var2.method8195();
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        if (var11 > 0) {
            this.field2434 = new byte[var11];
            var2.field5017 = 0;
            for (int var28 = 0; var28 < var11; var28++) {
                byte var29 = this.field2434[var28] = var2.method8130();
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
        this.field2418 = var9;
        this.field2422 = var10;
        this.field2433 = var11;
        this.field2435 = new int[var9];
        this.field2430 = new int[var9];
        this.field2421 = new int[var9];
        this.field2423 = new int[var10];
        this.field2424 = new int[var10];
        this.field2425 = new int[var10];
        if (var17 == 1) {
            this.field2438 = new int[var9];
        }
        if (var12 == 1) {
            this.field2459 = new byte[var10];
        }
        if (var13 == 255) {
            this.field2427 = new byte[var10];
        } else {
            this.field2432 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2428 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2420 = new int[var10];
        }
        if (var16 == 1) {
            this.field2440 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field2458 = new byte[var10];
        }
        if (var18 == 1) {
            this.field2442 = new int[var9][];
            this.field2436 = new int[var9][];
        }
        this.field2417 = new short[var10];
        if (var11 > 0) {
            this.field2426 = new short[var11];
            this.field2450 = new short[var11];
            this.field2437 = new short[var11];
        }
        var2.field5017 = var11;
        var3.field5017 = var47;
        var4.field5017 = var49;
        var5.field5017 = var51;
        var6.field5017 = var35;
        int var67 = 0;
        int var68 = 0;
        int var69 = 0;
        for (int var70 = 0; var70 < var9; var70++) {
            int var71 = var2.method8129();
            int var72 = 0;
            if ((var71 & 0x1) != 0) {
                var72 = var3.method8143();
            }
            int var73 = 0;
            if ((var71 & 0x2) != 0) {
                var73 = var4.method8143();
            }
            int var74 = 0;
            if ((var71 & 0x4) != 0) {
                var74 = var5.method8143();
            }
            this.field2435[var70] = var67 + var72;
            this.field2430[var70] = var68 + var73;
            this.field2421[var70] = var69 + var74;
            var67 = this.field2435[var70];
            var68 = this.field2430[var70];
            var69 = this.field2421[var70];
            if (var17 == 1) {
                this.field2438[var70] = var6.method8129();
            }
        }
        if (var18 == 1) {
            for (int var75 = 0; var75 < var9; var75++) {
                int var76 = var6.method8129();
                this.field2442[var75] = new int[var76];
                this.field2436[var75] = new int[var76];
                for (int var77 = 0; var77 < var76; var77++) {
                    this.field2442[var75][var77] = var6.method8129();
                    this.field2436[var75][var77] = var6.method8129();
                }
            }
        }
        var2.field5017 = var45;
        var3.field5017 = var33;
        var4.field5017 = var36;
        var5.field5017 = var40;
        var6.field5017 = var37;
        var7.field5017 = var43;
        var8.field5017 = var42;
        for (int var78 = 0; var78 < var10; var78++) {
            this.field2417[var78] = (short) var2.method8195();
            if (var12 == 1) {
                this.field2459[var78] = var3.method8130();
            }
            if (var13 == 255) {
                this.field2427[var78] = var4.method8130();
            }
            if (var14 == 1) {
                this.field2428[var78] = var5.method8130();
            }
            if (var15 == 1) {
                this.field2420[var78] = var6.method8129();
            }
            if (var16 == 1) {
                this.field2440[var78] = (short) (var7.method8195() - 1);
            }
            if (this.field2458 != null && this.field2440[var78] != -1) {
                this.field2458[var78] = (byte) (var8.method8129() - 1);
            }
        }
        var2.field5017 = var39;
        var3.field5017 = var32;
        int var79 = 0;
        int var80 = 0;
        int var81 = 0;
        int var82 = 0;
        for (int var83 = 0; var83 < var10; var83++) {
            int var84 = var3.method8129();
            if (var84 == 1) {
                var79 = var2.method8143() + var82;
                var80 = var2.method8143() + var79;
                var81 = var2.method8143() + var80;
                var82 = var81;
                this.field2423[var83] = var79;
                this.field2424[var83] = var80;
                this.field2425[var83] = var81;
            }
            if (var84 == 2) {
                var80 = var81;
                var81 = var2.method8143() + var82;
                var82 = var81;
                this.field2423[var83] = var79;
                this.field2424[var83] = var80;
                this.field2425[var83] = var81;
            }
            if (var84 == 3) {
                var79 = var81;
                var81 = var2.method8143() + var82;
                var82 = var81;
                this.field2423[var83] = var79;
                this.field2424[var83] = var80;
                this.field2425[var83] = var81;
            }
            if (var84 == 4) {
                int var87 = var79;
                var79 = var80;
                var80 = var87;
                var81 = var2.method8143() + var82;
                var82 = var81;
                this.field2423[var83] = var79;
                this.field2424[var83] = var87;
                this.field2425[var83] = var81;
            }
        }
        var2.field5017 = var53;
        var3.field5017 = var55;
        var4.field5017 = var57;
        var5.field5017 = var59;
        var6.field5017 = var61;
        var7.field5017 = var63;
        for (int var88 = 0; var88 < var11; var88++) {
            int var89 = this.field2434[var88] & 0xFF;
            if (var89 == 0) {
                this.field2426[var88] = (short) var2.method8195();
                this.field2450[var88] = (short) var2.method8195();
                this.field2437[var88] = (short) var2.method8195();
            }
        }
        var2.field5017 = var65;
        int var90 = var2.method8129();
        if (var90 == 0) {
            return;
        }
        new class246();
        var2.method8195();
        var2.method8195();
        var2.method8195();
        var2.method8134();
    }

    @ObfuscatedName("it.as([B)V")
    public void method3972(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class501 var4 = new class501(arg0);
        class501 var5 = new class501(arg0);
        class501 var6 = new class501(arg0);
        class501 var7 = new class501(arg0);
        class501 var8 = new class501(arg0);
        var4.field5017 = arg0.length - 23;
        int var9 = var4.method8195();
        int var10 = var4.method8195();
        int var11 = var4.method8129();
        int var12 = var4.method8129();
        int var13 = var4.method8129();
        int var14 = var4.method8129();
        int var15 = var4.method8129();
        int var16 = var4.method8129();
        int var17 = var4.method8129();
        int var18 = var4.method8195();
        int var19 = var4.method8195();
        int var20 = var4.method8195();
        int var21 = var4.method8195();
        int var22 = var4.method8195();
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
        this.field2418 = var9;
        this.field2422 = var10;
        this.field2433 = var11;
        this.field2435 = new int[var9];
        this.field2430 = new int[var9];
        this.field2421 = new int[var9];
        this.field2423 = new int[var10];
        this.field2424 = new int[var10];
        this.field2425 = new int[var10];
        if (var11 > 0) {
            this.field2434 = new byte[var11];
            this.field2426 = new short[var11];
            this.field2450 = new short[var11];
            this.field2437 = new short[var11];
        }
        if (var16 == 1) {
            this.field2438 = new int[var9];
        }
        if (var12 == 1) {
            this.field2459 = new byte[var10];
            this.field2458 = new byte[var10];
            this.field2440 = new short[var10];
        }
        if (var13 == 255) {
            this.field2427 = new byte[var10];
        } else {
            this.field2432 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2428 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2420 = new int[var10];
        }
        if (var17 == 1) {
            this.field2442 = new int[var9][];
            this.field2436 = new int[var9][];
        }
        this.field2417 = new short[var10];
        var4.field5017 = var23;
        var5.field5017 = var39;
        var6.field5017 = var41;
        var7.field5017 = var43;
        var8.field5017 = var27;
        int var46 = 0;
        int var47 = 0;
        int var48 = 0;
        for (int var49 = 0; var49 < var9; var49++) {
            int var50 = var4.method8129();
            int var51 = 0;
            if ((var50 & 0x1) != 0) {
                var51 = var5.method8143();
            }
            int var52 = 0;
            if ((var50 & 0x2) != 0) {
                var52 = var6.method8143();
            }
            int var53 = 0;
            if ((var50 & 0x4) != 0) {
                var53 = var7.method8143();
            }
            this.field2435[var49] = var46 + var51;
            this.field2430[var49] = var47 + var52;
            this.field2421[var49] = var48 + var53;
            var46 = this.field2435[var49];
            var47 = this.field2430[var49];
            var48 = this.field2421[var49];
            if (var16 == 1) {
                this.field2438[var49] = var8.method8129();
            }
        }
        if (var17 == 1) {
            for (int var54 = 0; var54 < var9; var54++) {
                int var55 = var8.method8129();
                this.field2442[var54] = new int[var55];
                this.field2436[var54] = new int[var55];
                for (int var56 = 0; var56 < var55; var56++) {
                    this.field2442[var54][var56] = var8.method8129();
                    this.field2436[var54][var56] = var8.method8129();
                }
            }
        }
        var4.field5017 = var35;
        var5.field5017 = var30;
        var6.field5017 = var28;
        var7.field5017 = var33;
        var8.field5017 = var29;
        for (int var57 = 0; var57 < var10; var57++) {
            this.field2417[var57] = (short) var4.method8195();
            if (var12 == 1) {
                int var58 = var5.method8129();
                if ((var58 & 0x1) == 1) {
                    this.field2459[var57] = 1;
                    var2 = true;
                } else {
                    this.field2459[var57] = 0;
                }
                if ((var58 & 0x2) == 2) {
                    this.field2458[var57] = (byte) (var58 >> 2);
                    this.field2440[var57] = this.field2417[var57];
                    this.field2417[var57] = 127;
                    if (this.field2440[var57] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field2458[var57] = -1;
                    this.field2440[var57] = -1;
                }
            }
            if (var13 == 255) {
                this.field2427[var57] = var6.method8130();
            }
            if (var14 == 1) {
                this.field2428[var57] = var7.method8130();
            }
            if (var15 == 1) {
                this.field2420[var57] = var8.method8129();
            }
        }
        var4.field5017 = var32;
        var5.field5017 = var25;
        int var59 = 0;
        int var60 = 0;
        int var61 = 0;
        int var62 = 0;
        for (int var63 = 0; var63 < var10; var63++) {
            int var64 = var5.method8129();
            if (var64 == 1) {
                var59 = var4.method8143() + var62;
                var60 = var4.method8143() + var59;
                var61 = var4.method8143() + var60;
                var62 = var61;
                this.field2423[var63] = var59;
                this.field2424[var63] = var60;
                this.field2425[var63] = var61;
            }
            if (var64 == 2) {
                var60 = var61;
                var61 = var4.method8143() + var62;
                var62 = var61;
                this.field2423[var63] = var59;
                this.field2424[var63] = var60;
                this.field2425[var63] = var61;
            }
            if (var64 == 3) {
                var59 = var61;
                var61 = var4.method8143() + var62;
                var62 = var61;
                this.field2423[var63] = var59;
                this.field2424[var63] = var60;
                this.field2425[var63] = var61;
            }
            if (var64 == 4) {
                int var67 = var59;
                var59 = var60;
                var60 = var67;
                var61 = var4.method8143() + var62;
                var62 = var61;
                this.field2423[var63] = var59;
                this.field2424[var63] = var67;
                this.field2425[var63] = var61;
            }
        }
        var4.field5017 = var37;
        for (int var68 = 0; var68 < var11; var68++) {
            this.field2434[var68] = 0;
            this.field2426[var68] = (short) var4.method8195();
            this.field2450[var68] = (short) var4.method8195();
            this.field2437[var68] = (short) var4.method8195();
        }
        if (this.field2458 != null) {
            boolean var69 = false;
            for (int var70 = 0; var70 < var10; var70++) {
                int var71 = this.field2458[var70] & 0xFF;
                if (var71 != 255) {
                    if ((this.field2426[var71] & 0xFFFF) == this.field2423[var70] && (this.field2450[var71] & 0xFFFF) == this.field2424[var70] && (this.field2437[var71] & 0xFFFF) == this.field2425[var70]) {
                        this.field2458[var70] = -1;
                    } else {
                        var69 = true;
                    }
                }
            }
            if (!var69) {
                this.field2458 = null;
            }
        }
        if (!var3) {
            this.field2440 = null;
        }
        if (!var2) {
            this.field2459 = null;
        }
    }

    @ObfuscatedName("it.ax([B)V")
    public void method3915(byte[] arg0) {
        class501 var2 = new class501(arg0);
        class501 var3 = new class501(arg0);
        class501 var4 = new class501(arg0);
        class501 var5 = new class501(arg0);
        class501 var6 = new class501(arg0);
        class501 var7 = new class501(arg0);
        class501 var8 = new class501(arg0);
        var2.field5017 = arg0.length - 23;
        int var9 = var2.method8195();
        int var10 = var2.method8195();
        int var11 = var2.method8129();
        int var12 = var2.method8129();
        int var13 = var2.method8129();
        int var14 = var2.method8129();
        int var15 = var2.method8129();
        int var16 = var2.method8129();
        int var17 = var2.method8129();
        int var18 = var2.method8195();
        int var19 = var2.method8195();
        int var20 = var2.method8195();
        int var21 = var2.method8195();
        int var22 = var2.method8195();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field2434 = new byte[var11];
            var2.field5017 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field2434[var26] = var2.method8130();
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
        this.field2418 = var9;
        this.field2422 = var10;
        this.field2433 = var11;
        this.field2435 = new int[var9];
        this.field2430 = new int[var9];
        this.field2421 = new int[var9];
        this.field2423 = new int[var10];
        this.field2424 = new int[var10];
        this.field2425 = new int[var10];
        if (var17 == 1) {
            this.field2438 = new int[var9];
        }
        if (var12 == 1) {
            this.field2459 = new byte[var10];
        }
        if (var13 == 255) {
            this.field2427 = new byte[var10];
        } else {
            this.field2432 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2428 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2420 = new int[var10];
        }
        if (var16 == 1) {
            this.field2440 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field2458 = new byte[var10];
        }
        this.field2417 = new short[var10];
        if (var11 > 0) {
            this.field2426 = new short[var11];
            this.field2450 = new short[var11];
            this.field2437 = new short[var11];
        }
        var2.field5017 = var11;
        var3.field5017 = var44;
        var4.field5017 = var46;
        var5.field5017 = var48;
        var6.field5017 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method8129();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method8143();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method8143();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method8143();
            }
            this.field2435[var67] = var64 + var69;
            this.field2430[var67] = var65 + var70;
            this.field2421[var67] = var66 + var71;
            var64 = this.field2435[var67];
            var65 = this.field2430[var67];
            var66 = this.field2421[var67];
            if (var17 == 1) {
                this.field2438[var67] = var6.method8129();
            }
        }
        var2.field5017 = var42;
        var3.field5017 = var31;
        var4.field5017 = var34;
        var5.field5017 = var37;
        var6.field5017 = var35;
        var7.field5017 = var40;
        var8.field5017 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field2417[var72] = (short) var2.method8195();
            if (var12 == 1) {
                this.field2459[var72] = var3.method8130();
            }
            if (var13 == 255) {
                this.field2427[var72] = var4.method8130();
            }
            if (var14 == 1) {
                this.field2428[var72] = var5.method8130();
            }
            if (var15 == 1) {
                this.field2420[var72] = var6.method8129();
            }
            if (var16 == 1) {
                this.field2440[var72] = (short) (var7.method8195() - 1);
            }
            if (this.field2458 != null && this.field2440[var72] != -1) {
                this.field2458[var72] = (byte) (var8.method8129() - 1);
            }
        }
        var2.field5017 = var33;
        var3.field5017 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method8129();
            if (var78 == 1) {
                var73 = var2.method8143() + var76;
                var74 = var2.method8143() + var73;
                var75 = var2.method8143() + var74;
                var76 = var75;
                this.field2423[var77] = var73;
                this.field2424[var77] = var74;
                this.field2425[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method8143() + var76;
                var76 = var75;
                this.field2423[var77] = var73;
                this.field2424[var77] = var74;
                this.field2425[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method8143() + var76;
                var76 = var75;
                this.field2423[var77] = var73;
                this.field2424[var77] = var74;
                this.field2425[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method8143() + var76;
                var76 = var75;
                this.field2423[var77] = var73;
                this.field2424[var77] = var81;
                this.field2425[var77] = var75;
            }
        }
        var2.field5017 = var50;
        var3.field5017 = var52;
        var4.field5017 = var54;
        var5.field5017 = var56;
        var6.field5017 = var58;
        var7.field5017 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field2434[var82] & 0xFF;
            if (var83 == 0) {
                this.field2426[var82] = (short) var2.method8195();
                this.field2450[var82] = (short) var2.method8195();
                this.field2437[var82] = (short) var2.method8195();
            }
        }
        var2.field5017 = var62;
        int var84 = var2.method8129();
        if (var84 == 0) {
            return;
        }
        new class246();
        var2.method8195();
        var2.method8195();
        var2.method8195();
        var2.method8134();
    }

    @ObfuscatedName("it.ae([B)V")
    public void method3916(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class501 var4 = new class501(arg0);
        class501 var5 = new class501(arg0);
        class501 var6 = new class501(arg0);
        class501 var7 = new class501(arg0);
        class501 var8 = new class501(arg0);
        var4.field5017 = arg0.length - 18;
        int var9 = var4.method8195();
        int var10 = var4.method8195();
        int var11 = var4.method8129();
        int var12 = var4.method8129();
        int var13 = var4.method8129();
        int var14 = var4.method8129();
        int var15 = var4.method8129();
        int var16 = var4.method8129();
        int var17 = var4.method8195();
        int var18 = var4.method8195();
        int var19 = var4.method8195();
        int var20 = var4.method8195();
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
        this.field2418 = var9;
        this.field2422 = var10;
        this.field2433 = var11;
        this.field2435 = new int[var9];
        this.field2430 = new int[var9];
        this.field2421 = new int[var9];
        this.field2423 = new int[var10];
        this.field2424 = new int[var10];
        this.field2425 = new int[var10];
        if (var11 > 0) {
            this.field2434 = new byte[var11];
            this.field2426 = new short[var11];
            this.field2450 = new short[var11];
            this.field2437 = new short[var11];
        }
        if (var16 == 1) {
            this.field2438 = new int[var9];
        }
        if (var12 == 1) {
            this.field2459 = new byte[var10];
            this.field2458 = new byte[var10];
            this.field2440 = new short[var10];
        }
        if (var13 == 255) {
            this.field2427 = new byte[var10];
        } else {
            this.field2432 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2428 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2420 = new int[var10];
        }
        this.field2417 = new short[var10];
        var4.field5017 = var21;
        var5.field5017 = var36;
        var6.field5017 = var38;
        var7.field5017 = var40;
        var8.field5017 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method8129();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method8143();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method8143();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method8143();
            }
            this.field2435[var46] = var43 + var48;
            this.field2430[var46] = var44 + var49;
            this.field2421[var46] = var45 + var50;
            var43 = this.field2435[var46];
            var44 = this.field2430[var46];
            var45 = this.field2421[var46];
            if (var16 == 1) {
                this.field2438[var46] = var8.method8129();
            }
        }
        var4.field5017 = var32;
        var5.field5017 = var28;
        var6.field5017 = var26;
        var7.field5017 = var30;
        var8.field5017 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field2417[var51] = (short) var4.method8195();
            if (var12 == 1) {
                int var52 = var5.method8129();
                if ((var52 & 0x1) == 1) {
                    this.field2459[var51] = 1;
                    var2 = true;
                } else {
                    this.field2459[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field2458[var51] = (byte) (var52 >> 2);
                    this.field2440[var51] = this.field2417[var51];
                    this.field2417[var51] = 127;
                    if (this.field2440[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field2458[var51] = -1;
                    this.field2440[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field2427[var51] = var6.method8130();
            }
            if (var14 == 1) {
                this.field2428[var51] = var7.method8130();
            }
            if (var15 == 1) {
                this.field2420[var51] = var8.method8129();
            }
        }
        var4.field5017 = var25;
        var5.field5017 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method8129();
            if (var58 == 1) {
                var53 = var4.method8143() + var56;
                var54 = var4.method8143() + var53;
                var55 = var4.method8143() + var54;
                var56 = var55;
                this.field2423[var57] = var53;
                this.field2424[var57] = var54;
                this.field2425[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method8143() + var56;
                var56 = var55;
                this.field2423[var57] = var53;
                this.field2424[var57] = var54;
                this.field2425[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method8143() + var56;
                var56 = var55;
                this.field2423[var57] = var53;
                this.field2424[var57] = var54;
                this.field2425[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method8143() + var56;
                var56 = var55;
                this.field2423[var57] = var53;
                this.field2424[var57] = var61;
                this.field2425[var57] = var55;
            }
        }
        var4.field5017 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field2434[var62] = 0;
            this.field2426[var62] = (short) var4.method8195();
            this.field2450[var62] = (short) var4.method8195();
            this.field2437[var62] = (short) var4.method8195();
        }
        if (this.field2458 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field2458[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field2426[var65] & 0xFFFF) == this.field2423[var64] && (this.field2450[var65] & 0xFFFF) == this.field2424[var64] && (this.field2437[var65] & 0xFFFF) == this.field2425[var64]) {
                        this.field2458[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field2458 = null;
            }
        }
        if (!var3) {
            this.field2440 = null;
        }
        if (!var2) {
            this.field2459 = null;
        }
    }

    public class221(class221[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        this.field2418 = 0;
        this.field2422 = 0;
        this.field2433 = 0;
        this.field2432 = -1;
        for (int var10 = 0; var10 < arg1; var10++) {
            class221 var11 = arg0[var10];
            if (var11 != null) {
                this.field2418 += var11.field2418;
                this.field2422 += var11.field2422;
                this.field2433 += var11.field2433;
                if (var11.field2427 == null) {
                    if (this.field2432 == -1) {
                        this.field2432 = var11.field2432;
                    }
                    if (this.field2432 != var11.field2432) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var11.field2459 != null;
                var5 |= var11.field2428 != null;
                var6 |= var11.field2420 != null;
                var7 |= var11.field2440 != null;
                var8 |= var11.field2458 != null;
                var9 |= var11.field2442 != null;
            }
        }
        this.field2435 = new int[this.field2418];
        this.field2430 = new int[this.field2418];
        this.field2421 = new int[this.field2418];
        this.field2438 = new int[this.field2418];
        this.field2423 = new int[this.field2422];
        this.field2424 = new int[this.field2422];
        this.field2425 = new int[this.field2422];
        if (var3) {
            this.field2459 = new byte[this.field2422];
        }
        if (var4) {
            this.field2427 = new byte[this.field2422];
        }
        if (var5) {
            this.field2428 = new byte[this.field2422];
        }
        if (var6) {
            this.field2420 = new int[this.field2422];
        }
        if (var7) {
            this.field2440 = new short[this.field2422];
        }
        if (var8) {
            this.field2458 = new byte[this.field2422];
        }
        if (var9) {
            this.field2442 = new int[this.field2418][];
            this.field2436 = new int[this.field2418][];
        }
        this.field2417 = new short[this.field2422];
        if (this.field2433 > 0) {
            this.field2434 = new byte[this.field2433];
            this.field2426 = new short[this.field2433];
            this.field2450 = new short[this.field2433];
            this.field2437 = new short[this.field2433];
        }
        this.field2418 = 0;
        this.field2422 = 0;
        this.field2433 = 0;
        for (int var12 = 0; var12 < arg1; var12++) {
            class221 var13 = arg0[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < var13.field2422; var14++) {
                    if (var3 && var13.field2459 != null) {
                        this.field2459[this.field2422] = var13.field2459[var14];
                    }
                    if (var4) {
                        if (var13.field2427 == null) {
                            this.field2427[this.field2422] = var13.field2432;
                        } else {
                            this.field2427[this.field2422] = var13.field2427[var14];
                        }
                    }
                    if (var5 && var13.field2428 != null) {
                        this.field2428[this.field2422] = var13.field2428[var14];
                    }
                    if (var6 && var13.field2420 != null) {
                        this.field2420[this.field2422] = var13.field2420[var14];
                    }
                    if (var7) {
                        if (var13.field2440 == null) {
                            this.field2440[this.field2422] = -1;
                        } else {
                            this.field2440[this.field2422] = var13.field2440[var14];
                        }
                    }
                    if (var8) {
                        if (var13.field2458 == null || var13.field2458[var14] == -1) {
                            this.field2458[this.field2422] = -1;
                        } else {
                            this.field2458[this.field2422] = (byte) (var13.field2458[var14] + this.field2433);
                        }
                    }
                    this.field2417[this.field2422] = var13.field2417[var14];
                    this.field2423[this.field2422] = this.method3917(var13, var13.field2423[var14]);
                    this.field2424[this.field2422] = this.method3917(var13, var13.field2424[var14]);
                    this.field2425[this.field2422] = this.method3917(var13, var13.field2425[var14]);
                    this.field2422++;
                }
                for (int var15 = 0; var15 < var13.field2433; var15++) {
                    byte var16 = this.field2434[this.field2433] = var13.field2434[var15];
                    if (var16 == 0) {
                        this.field2426[this.field2433] = (short) this.method3917(var13, var13.field2426[var15]);
                        this.field2450[this.field2433] = (short) this.method3917(var13, var13.field2450[var15]);
                        this.field2437[this.field2433] = (short) this.method3917(var13, var13.field2437[var15]);
                    }
                    this.field2433++;
                }
            }
        }
    }

    @ObfuscatedName("it.af(Lit;I)I")
    public final int method3917(class221 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field2435[arg1];
        int var5 = arg0.field2430[arg1];
        int var6 = arg0.field2421[arg1];
        for (int var7 = 0; var7 < this.field2418; var7++) {
            if (this.field2435[var7] == var4 && this.field2430[var7] == var5 && this.field2421[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field2435[this.field2418] = var4;
            this.field2430[this.field2418] = var5;
            this.field2421[this.field2418] = var6;
            if (arg0.field2438 != null) {
                this.field2438[this.field2418] = arg0.field2438[arg1];
            }
            if (arg0.field2442 != null) {
                this.field2442[this.field2418] = arg0.field2442[arg1];
                this.field2436[this.field2418] = arg0.field2436[arg1];
            }
            var3 = this.field2418++;
        }
        return var3;
    }

    public class221(class221 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field2418 = arg0.field2418;
        this.field2422 = arg0.field2422;
        this.field2433 = arg0.field2433;
        if (arg1) {
            this.field2435 = arg0.field2435;
            this.field2430 = arg0.field2430;
            this.field2421 = arg0.field2421;
        } else {
            this.field2435 = new int[this.field2418];
            this.field2430 = new int[this.field2418];
            this.field2421 = new int[this.field2418];
            for (int var6 = 0; var6 < this.field2418; var6++) {
                this.field2435[var6] = arg0.field2435[var6];
                this.field2430[var6] = arg0.field2430[var6];
                this.field2421[var6] = arg0.field2421[var6];
            }
        }
        if (arg2) {
            this.field2417 = arg0.field2417;
        } else {
            this.field2417 = new short[this.field2422];
            for (int var7 = 0; var7 < this.field2422; var7++) {
                this.field2417[var7] = arg0.field2417[var7];
            }
        }
        if (arg3 || arg0.field2440 == null) {
            this.field2440 = arg0.field2440;
        } else {
            this.field2440 = new short[this.field2422];
            for (int var8 = 0; var8 < this.field2422; var8++) {
                this.field2440[var8] = arg0.field2440[var8];
            }
        }
        if (arg4) {
            this.field2428 = arg0.field2428;
        } else {
            this.field2428 = new byte[this.field2422];
            if (arg0.field2428 == null) {
                for (int var9 = 0; var9 < this.field2422; var9++) {
                    this.field2428[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field2422; var10++) {
                    this.field2428[var10] = arg0.field2428[var10];
                }
            }
        }
        this.field2423 = arg0.field2423;
        this.field2424 = arg0.field2424;
        this.field2425 = arg0.field2425;
        this.field2459 = arg0.field2459;
        this.field2427 = arg0.field2427;
        this.field2458 = arg0.field2458;
        this.field2432 = arg0.field2432;
        this.field2434 = arg0.field2434;
        this.field2426 = arg0.field2426;
        this.field2450 = arg0.field2450;
        this.field2437 = arg0.field2437;
        this.field2438 = arg0.field2438;
        this.field2420 = arg0.field2420;
        this.field2431 = arg0.field2431;
        this.field2441 = arg0.field2441;
        this.field2445 = arg0.field2445;
        this.field2444 = arg0.field2444;
        this.field2446 = arg0.field2446;
        this.field2442 = arg0.field2442;
        this.field2436 = arg0.field2436;
        this.field2447 = arg0.field2447;
        this.field2448 = arg0.field2448;
    }

    @ObfuscatedName("it.ao()Lit;")
    public class221 method3919() {
        class221 var1 = new class221();
        if (this.field2459 != null) {
            var1.field2459 = new byte[this.field2422];
            for (int var2 = 0; var2 < this.field2422; var2++) {
                var1.field2459[var2] = this.field2459[var2];
            }
        }
        var1.field2418 = this.field2418;
        var1.field2422 = this.field2422;
        var1.field2433 = this.field2433;
        var1.field2435 = this.field2435;
        var1.field2430 = this.field2430;
        var1.field2421 = this.field2421;
        var1.field2423 = this.field2423;
        var1.field2424 = this.field2424;
        var1.field2425 = this.field2425;
        var1.field2427 = this.field2427;
        var1.field2428 = this.field2428;
        var1.field2458 = this.field2458;
        var1.field2417 = this.field2417;
        var1.field2440 = this.field2440;
        var1.field2432 = this.field2432;
        var1.field2434 = this.field2434;
        var1.field2426 = this.field2426;
        var1.field2450 = this.field2450;
        var1.field2437 = this.field2437;
        var1.field2438 = this.field2438;
        var1.field2420 = this.field2420;
        var1.field2431 = this.field2431;
        var1.field2441 = this.field2441;
        var1.field2445 = this.field2445;
        var1.field2444 = this.field2444;
        var1.field2447 = this.field2447;
        var1.field2448 = this.field2448;
        return var1;
    }

    @ObfuscatedName("it.aa([[IIIIZI)Lit;")
    public class221 method3920(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method3961();
        int var7 = this.field2451 + arg1;
        int var8 = this.field2452 + arg1;
        int var9 = this.field2454 + arg3;
        int var10 = this.field2453 + arg3;
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
        class221 var15;
        if (arg4) {
            var15 = new class221();
            var15.field2418 = this.field2418;
            var15.field2422 = this.field2422;
            var15.field2433 = this.field2433;
            var15.field2435 = this.field2435;
            var15.field2421 = this.field2421;
            var15.field2423 = this.field2423;
            var15.field2424 = this.field2424;
            var15.field2425 = this.field2425;
            var15.field2459 = this.field2459;
            var15.field2427 = this.field2427;
            var15.field2428 = this.field2428;
            var15.field2458 = this.field2458;
            var15.field2417 = this.field2417;
            var15.field2440 = this.field2440;
            var15.field2432 = this.field2432;
            var15.field2434 = this.field2434;
            var15.field2426 = this.field2426;
            var15.field2450 = this.field2450;
            var15.field2437 = this.field2437;
            var15.field2438 = this.field2438;
            var15.field2420 = this.field2420;
            var15.field2431 = this.field2431;
            var15.field2441 = this.field2441;
            var15.field2447 = this.field2447;
            var15.field2448 = this.field2448;
            var15.field2430 = new int[var15.field2418];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field2418; var16++) {
                int var17 = this.field2435[var16] + arg1;
                int var18 = this.field2421[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field2430[var16] = this.field2430[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field2418; var26++) {
                int var27 = (-this.field2430[var26] << 16) / this.field2621;
                if (var27 < arg5) {
                    int var28 = this.field2435[var26] + arg1;
                    int var29 = this.field2421[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field2430[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field2430[var26];
                }
            }
        }
        var15.method3931();
        return var15;
    }

    @ObfuscatedName("it.aj()V")
    public void method3921() {
        int var10002;
        if (this.field2438 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field2418; var3++) {
                int var4 = this.field2438[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field2431 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field2431[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field2418) {
                int var7 = this.field2438[var6];
                this.field2431[var7][var1[var7]++] = var6++;
            }
            this.field2438 = null;
        }
        if (this.field2420 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field2422; var10++) {
            int var11 = this.field2420[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field2441 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field2441[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field2422) {
            int var14 = this.field2420[var13];
            this.field2441[var14][var8[var14]++] = var13++;
        }
        this.field2420 = null;
    }

    @ObfuscatedName("it.ad()V")
    public void method3922() {
        for (int var1 = 0; var1 < this.field2418; var1++) {
            int var2 = this.field2435[var1];
            this.field2435[var1] = this.field2421[var1];
            this.field2421[var1] = -var2;
        }
        this.method3931();
    }

    @ObfuscatedName("it.ac()V")
    public void method3923() {
        for (int var1 = 0; var1 < this.field2418; var1++) {
            this.field2435[var1] = -this.field2435[var1];
            this.field2421[var1] = -this.field2421[var1];
        }
        this.method3931();
    }

    @ObfuscatedName("it.ag()V")
    public void method3924() {
        for (int var1 = 0; var1 < this.field2418; var1++) {
            int var2 = this.field2421[var1];
            this.field2421[var1] = this.field2435[var1];
            this.field2435[var1] = -var2;
        }
        this.method3931();
    }

    @ObfuscatedName("it.ar(I)V")
    public void method3948(int arg0) {
        int var2 = field2439[arg0];
        int var3 = field2419[arg0];
        for (int var4 = 0; var4 < this.field2418; var4++) {
            int var5 = this.field2435[var4] * var3 + this.field2421[var4] * var2 >> 16;
            this.field2421[var4] = this.field2421[var4] * var3 - this.field2435[var4] * var2 >> 16;
            this.field2435[var4] = var5;
        }
        this.method3931();
    }

    @ObfuscatedName("it.ah(III)V")
    public void method3925(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2418; var4++) {
            this.field2435[var4] += arg0;
            this.field2430[var4] += arg1;
            this.field2421[var4] += arg2;
        }
        this.method3931();
    }

    @ObfuscatedName("it.az(SS)V")
    public void method3995(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2422; var3++) {
            if (this.field2417[var3] == arg0) {
                this.field2417[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("it.au(SS)V")
    public void method3965(short arg0, short arg1) {
        if (this.field2440 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field2422; var3++) {
            if (this.field2440[var3] == arg0) {
                this.field2440[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("it.ai()V")
    public void method3928() {
        for (int var1 = 0; var1 < this.field2418; var1++) {
            this.field2421[var1] = -this.field2421[var1];
        }
        for (int var2 = 0; var2 < this.field2422; var2++) {
            int var3 = this.field2423[var2];
            this.field2423[var2] = this.field2425[var2];
            this.field2425[var2] = var3;
        }
        this.method3931();
    }

    @ObfuscatedName("it.aq(III)V")
    public void method3929(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2418; var4++) {
            this.field2435[var4] = this.field2435[var4] * arg0 / 128;
            this.field2430[var4] = this.field2430[var4] * arg1 / 128;
            this.field2421[var4] = this.field2421[var4] * arg2 / 128;
        }
        this.method3931();
    }

    @ObfuscatedName("it.aw()V")
    public void method3977() {
        if (this.field2445 != null) {
            return;
        }
        this.field2445 = new class241[this.field2418];
        for (int var1 = 0; var1 < this.field2418; var1++) {
            this.field2445[var1] = new class241();
        }
        for (int var2 = 0; var2 < this.field2422; var2++) {
            int var3 = this.field2423[var2];
            int var4 = this.field2424[var2];
            int var5 = this.field2425[var2];
            int var6 = this.field2435[var4] - this.field2435[var3];
            int var7 = this.field2430[var4] - this.field2430[var3];
            int var8 = this.field2421[var4] - this.field2421[var3];
            int var9 = this.field2435[var5] - this.field2435[var3];
            int var10 = this.field2430[var5] - this.field2430[var3];
            int var11 = this.field2421[var5] - this.field2421[var3];
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
            if (this.field2459 == null) {
                var19 = 0;
            } else {
                var19 = this.field2459[var2];
            }
            if (var19 == 0) {
                class241 var20 = this.field2445[var3];
                var20.field2780 += var16;
                var20.field2777 += var17;
                var20.field2778 += var18;
                var20.field2779++;
                class241 var21 = this.field2445[var4];
                var21.field2780 += var16;
                var21.field2777 += var17;
                var21.field2778 += var18;
                var21.field2779++;
                class241 var22 = this.field2445[var5];
                var22.field2780 += var16;
                var22.field2777 += var17;
                var22.field2778 += var18;
                var22.field2779++;
            } else if (var19 == 1) {
                if (this.field2444 == null) {
                    this.field2444 = new class233[this.field2422];
                }
                class233 var23 = this.field2444[var2] = new class233();
                var23.field2623 = var16;
                var23.field2624 = var17;
                var23.field2625 = var18;
            }
        }
    }

    @ObfuscatedName("it.ay()V")
    public void method3931() {
        this.field2445 = null;
        this.field2446 = null;
        this.field2444 = null;
        this.field2449 = false;
    }

    @ObfuscatedName("it.al()V")
    public void method3961() {
        if (this.field2449) {
            return;
        }
        this.field2621 = 0;
        this.field2443 = 0;
        this.field2451 = 999999;
        this.field2452 = -999999;
        this.field2453 = -99999;
        this.field2454 = 99999;
        for (int var1 = 0; var1 < this.field2418; var1++) {
            int var2 = this.field2435[var1];
            int var3 = this.field2430[var1];
            int var4 = this.field2421[var1];
            if (var2 < this.field2451) {
                this.field2451 = var2;
            }
            if (var2 > this.field2452) {
                this.field2452 = var2;
            }
            if (var4 < this.field2454) {
                this.field2454 = var4;
            }
            if (var4 > this.field2453) {
                this.field2453 = var4;
            }
            if (-var3 > this.field2621) {
                this.field2621 = -var3;
            }
            if (var3 > this.field2443) {
                this.field2443 = var3;
            }
        }
        this.field2449 = true;
    }

    @ObfuscatedName("it.am(Lit;Lit;IIIZ)V")
    public static void method3955(class221 arg0, class221 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method3961();
        arg0.method3977();
        arg1.method3961();
        arg1.method3977();
        field2457++;
        int var6 = 0;
        int[] var7 = arg1.field2435;
        int var8 = arg1.field2418;
        for (int var9 = 0; var9 < arg0.field2418; var9++) {
            class241 var10 = arg0.field2445[var9];
            if (var10.field2779 != 0) {
                int var11 = arg0.field2430[var9] - arg3;
                if (var11 <= arg1.field2443) {
                    int var12 = arg0.field2435[var9] - arg2;
                    if (var12 >= arg1.field2451 && var12 <= arg1.field2452) {
                        int var13 = arg0.field2421[var9] - arg4;
                        if (var13 >= arg1.field2454 && var13 <= arg1.field2453) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class241 var15 = arg1.field2445[var14];
                                if (var7[var14] == var12 && arg1.field2421[var14] == var13 && arg1.field2430[var14] == var11 && var15.field2779 != 0) {
                                    if (arg0.field2446 == null) {
                                        arg0.field2446 = new class241[arg0.field2418];
                                    }
                                    if (arg1.field2446 == null) {
                                        arg1.field2446 = new class241[var8];
                                    }
                                    class241 var16 = arg0.field2446[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field2446[var9] = new class241(var10);
                                    }
                                    class241 var17 = arg1.field2446[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field2446[var14] = new class241(var15);
                                    }
                                    var16.field2780 += var15.field2780;
                                    var16.field2777 += var15.field2777;
                                    var16.field2778 += var15.field2778;
                                    var16.field2779 += var15.field2779;
                                    var17.field2780 += var10.field2780;
                                    var17.field2777 += var10.field2777;
                                    var17.field2778 += var10.field2778;
                                    var17.field2779 += var10.field2779;
                                    var6++;
                                    field2455[var9] = field2457;
                                    field2456[var14] = field2457;
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
        for (int var18 = 0; var18 < arg0.field2422; var18++) {
            if (field2455[arg0.field2423[var18]] == field2457 && field2455[arg0.field2424[var18]] == field2457 && field2455[arg0.field2425[var18]] == field2457) {
                if (arg0.field2459 == null) {
                    arg0.field2459 = new byte[arg0.field2422];
                }
                arg0.field2459[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field2422; var19++) {
            if (field2456[arg1.field2423[var19]] == field2457 && field2456[arg1.field2424[var19]] == field2457 && field2456[arg1.field2425[var19]] == field2457) {
                if (arg1.field2459 == null) {
                    arg1.field2459 = new byte[arg1.field2422];
                }
                arg1.field2459[var19] = 2;
            }
        }
    }

    @ObfuscatedName("it.bs(IIIII)Ljd;")
    public final class239 method3934(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method3977();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class239 var8 = new class239();
        var8.field2700 = new int[this.field2422];
        var8.field2723 = new int[this.field2422];
        var8.field2702 = new int[this.field2422];
        if (this.field2433 > 0 && this.field2458 != null) {
            int[] var9 = new int[this.field2433];
            for (int var10 = 0; var10 < this.field2422; var10++) {
                if (this.field2458[var10] != -1) {
                    var9[this.field2458[var10] & 0xFF]++;
                }
            }
            var8.field2708 = 0;
            for (int var11 = 0; var11 < this.field2433; var11++) {
                if (var9[var11] > 0 && this.field2434[var11] == 0) {
                    var8.field2708++;
                }
            }
            var8.field2709 = new int[var8.field2708];
            var8.field2710 = new int[var8.field2708];
            var8.field2711 = new int[var8.field2708];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field2433; var13++) {
                if (var9[var13] > 0 && this.field2434[var13] == 0) {
                    var8.field2709[var12] = this.field2426[var13] & 0xFFFF;
                    var8.field2710[var12] = this.field2450[var13] & 0xFFFF;
                    var8.field2711[var12] = this.field2437[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field2705 = new byte[this.field2422];
            for (int var14 = 0; var14 < this.field2422; var14++) {
                if (this.field2458[var14] == -1) {
                    var8.field2705[var14] = -1;
                } else {
                    var8.field2705[var14] = (byte) var9[this.field2458[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field2422; var15++) {
            byte var16;
            if (this.field2459 == null) {
                var16 = 0;
            } else {
                var16 = this.field2459[var15];
            }
            byte var17;
            if (this.field2428 == null) {
                var17 = 0;
            } else {
                var17 = this.field2428[var15];
            }
            short var18;
            if (this.field2440 == null) {
                var18 = -1;
            } else {
                var18 = this.field2440[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field2417[var15] & 0xFFFF;
                    class241 var20;
                    if (this.field2446 == null || this.field2446[this.field2423[var15]] == null) {
                        var20 = this.field2445[this.field2423[var15]];
                    } else {
                        var20 = this.field2446[this.field2423[var15]];
                    }
                    int var21 = (var20.field2778 * arg4 + var20.field2780 * arg2 + var20.field2777 * arg3) / (var20.field2779 * var7) + arg0;
                    var8.field2700[var15] = method3981(var19, var21);
                    class241 var22;
                    if (this.field2446 == null || this.field2446[this.field2424[var15]] == null) {
                        var22 = this.field2445[this.field2424[var15]];
                    } else {
                        var22 = this.field2446[this.field2424[var15]];
                    }
                    int var23 = (var22.field2778 * arg4 + var22.field2780 * arg2 + var22.field2777 * arg3) / (var22.field2779 * var7) + arg0;
                    var8.field2723[var15] = method3981(var19, var23);
                    class241 var24;
                    if (this.field2446 == null || this.field2446[this.field2425[var15]] == null) {
                        var24 = this.field2445[this.field2425[var15]];
                    } else {
                        var24 = this.field2446[this.field2425[var15]];
                    }
                    int var25 = (var24.field2778 * arg4 + var24.field2780 * arg2 + var24.field2777 * arg3) / (var24.field2779 * var7) + arg0;
                    var8.field2702[var15] = method3981(var19, var25);
                } else if (var16 == 1) {
                    class233 var26 = this.field2444[var15];
                    int var27 = (var26.field2625 * arg4 + var26.field2624 * arg3 + var26.field2623 * arg2) / (var7 / 2 + var7) + arg0;
                    var8.field2700[var15] = method3981(this.field2417[var15] & 0xFFFF, var27);
                    var8.field2702[var15] = -1;
                } else if (var16 == 3) {
                    var8.field2700[var15] = 128;
                    var8.field2702[var15] = -1;
                } else {
                    var8.field2702[var15] = -2;
                }
            } else if (var16 == 0) {
                class241 var28;
                if (this.field2446 == null || this.field2446[this.field2423[var15]] == null) {
                    var28 = this.field2445[this.field2423[var15]];
                } else {
                    var28 = this.field2446[this.field2423[var15]];
                }
                int var29 = (var28.field2778 * arg4 + var28.field2780 * arg2 + var28.field2777 * arg3) / (var28.field2779 * var7) + arg0;
                var8.field2700[var15] = method3927(var29);
                class241 var30;
                if (this.field2446 == null || this.field2446[this.field2424[var15]] == null) {
                    var30 = this.field2445[this.field2424[var15]];
                } else {
                    var30 = this.field2446[this.field2424[var15]];
                }
                int var31 = (var30.field2778 * arg4 + var30.field2780 * arg2 + var30.field2777 * arg3) / (var30.field2779 * var7) + arg0;
                var8.field2723[var15] = method3927(var31);
                class241 var32;
                if (this.field2446 == null || this.field2446[this.field2425[var15]] == null) {
                    var32 = this.field2445[this.field2425[var15]];
                } else {
                    var32 = this.field2446[this.field2425[var15]];
                }
                int var33 = (var32.field2778 * arg4 + var32.field2780 * arg2 + var32.field2777 * arg3) / (var32.field2779 * var7) + arg0;
                var8.field2702[var15] = method3927(var33);
            } else if (var16 == 1) {
                class233 var34 = this.field2444[var15];
                int var35 = (var34.field2625 * arg4 + var34.field2624 * arg3 + var34.field2623 * arg2) / (var7 / 2 + var7) + arg0;
                var8.field2700[var15] = method3927(var35);
                var8.field2702[var15] = -1;
            } else {
                var8.field2702[var15] = -2;
            }
        }
        this.method3921();
        var8.field2692 = this.field2418;
        var8.field2706 = this.field2435;
        var8.field2694 = this.field2430;
        var8.field2695 = this.field2421;
        var8.field2696 = this.field2422;
        var8.field2697 = this.field2423;
        var8.field2698 = this.field2424;
        var8.field2699 = this.field2425;
        var8.field2703 = this.field2427;
        var8.field2722 = this.field2428;
        var8.field2707 = this.field2432;
        var8.field2687 = this.field2431;
        var8.field2713 = this.field2441;
        var8.field2712 = this.field2440;
        var8.field2714 = this.field2442;
        var8.field2685 = this.field2436;
        return var8;
    }

    @ObfuscatedName("it.bc(II)I")
    public static final int method3981(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("it.bj(I)I")
    public static final int method3927(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
