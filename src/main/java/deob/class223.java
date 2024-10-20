package deob;

@ObfuscatedName("ie")
public class class223 extends class234 {

    @ObfuscatedName("ie.am")
    public int field2414 = 0;

    @ObfuscatedName("ie.as")
    public int[] field2406;

    @ObfuscatedName("ie.aj")
    public int[] field2435;

    @ObfuscatedName("ie.ag")
    public int[] field2405;

    @ObfuscatedName("ie.az")
    public int field2409 = 0;

    @ObfuscatedName("ie.av")
    public int[] field2410;

    @ObfuscatedName("ie.ap")
    public int[] field2411;

    @ObfuscatedName("ie.aq")
    public int[] field2420;

    @ObfuscatedName("ie.at")
    public byte[] field2440;

    @ObfuscatedName("ie.ah")
    public byte[] field2402;

    @ObfuscatedName("ie.ax")
    public byte[] field2415;

    @ObfuscatedName("ie.aa")
    public byte[] field2416;

    @ObfuscatedName("ie.au")
    public short[] field2417;

    @ObfuscatedName("ie.ae")
    public short[] field2404;

    @ObfuscatedName("ie.ab")
    public byte field2419 = 0;

    @ObfuscatedName("ie.ad")
    public int field2445;

    @ObfuscatedName("ie.ao")
    public byte[] field2421;

    @ObfuscatedName("ie.ac")
    public short[] field2422;

    @ObfuscatedName("ie.ak")
    public short[] field2423;

    @ObfuscatedName("ie.an")
    public short[] field2424;

    @ObfuscatedName("ie.af")
    public int[] field2425;

    @ObfuscatedName("ie.ai")
    public int[] field2426;

    @ObfuscatedName("ie.al")
    public int[][] field2427;

    @ObfuscatedName("ie.bd")
    public int[][] field2428;

    @ObfuscatedName("ie.bb")
    public int[][] field2429;

    @ObfuscatedName("ie.bn")
    public int[][] field2430;

    @ObfuscatedName("ie.ba")
    public class235[] field2431;

    @ObfuscatedName("ie.bf")
    public class243[] field2432;

    @ObfuscatedName("ie.bs")
    public class243[] field2413;

    @ObfuscatedName("ie.bp")
    public short field2434;

    @ObfuscatedName("ie.bv")
    public short field2446;

    @ObfuscatedName("ie.bq")
    public boolean field2433 = false;

    @ObfuscatedName("ie.bo")
    public int field2437;

    @ObfuscatedName("ie.br")
    public int field2438;

    @ObfuscatedName("ie.bw")
    public int field2439;

    @ObfuscatedName("ie.be")
    public int field2407;

    @ObfuscatedName("ie.bc")
    public int field2408;

    @ObfuscatedName("ie.bi")
    public static int[] field2412 = new int[10000];

    @ObfuscatedName("ie.bu")
    public static int[] field2443 = new int[10000];

    @ObfuscatedName("ie.bk")
    public static int field2444 = 0;

    @ObfuscatedName("ie.bz")
    public static int[] field2436 = class228.field2509;

    @ObfuscatedName("ie.bx")
    public static int[] field2403 = class228.field2510;

    public class223() {
    }

    @ObfuscatedName("ie.aw(Lnd;II)Lie;")
    public static class223 method3926(class360 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method6117(arg1, arg2);
        return var3 == null ? null : new class223(var3);
    }

    public class223(byte[] arg0) {
        class514 var2 = new class514(10);
        var2.method8228(-2);
        if (arg0[arg0.length - 1] == -3 && arg0[arg0.length - 2] == -1) {
            this.method3995(arg0);
        } else if (arg0[arg0.length - 1] == -2 && arg0[arg0.length - 2] == -1) {
            this.method3929(arg0);
        } else if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method3930(arg0);
        } else {
            this.method3931(arg0);
        }
    }

    @ObfuscatedName("ie.ar([B)V")
    public void method3995(byte[] arg0) {
        class514 var2 = new class514(arg0);
        class514 var3 = new class514(arg0);
        class514 var4 = new class514(arg0);
        class514 var5 = new class514(arg0);
        class514 var6 = new class514(arg0);
        class514 var7 = new class514(arg0);
        class514 var8 = new class514(arg0);
        var2.field5072 = arg0.length - 26;
        int var9 = var2.method8246();
        int var10 = var2.method8246();
        int var11 = var2.method8244();
        int var12 = var2.method8244();
        int var13 = var2.method8244();
        int var14 = var2.method8244();
        int var15 = var2.method8244();
        int var16 = var2.method8244();
        int var17 = var2.method8244();
        int var18 = var2.method8244();
        int var19 = var2.method8246();
        int var20 = var2.method8246();
        int var21 = var2.method8246();
        int var22 = var2.method8246();
        int var23 = var2.method8246();
        int var24 = var2.method8246();
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        if (var11 > 0) {
            this.field2421 = new byte[var11];
            var2.field5072 = 0;
            for (int var28 = 0; var28 < var11; var28++) {
                byte var29 = this.field2421[var28] = var2.method8264();
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
        this.field2414 = var9;
        this.field2409 = var10;
        this.field2445 = var11;
        this.field2406 = new int[var9];
        this.field2435 = new int[var9];
        this.field2405 = new int[var9];
        this.field2410 = new int[var10];
        this.field2411 = new int[var10];
        this.field2420 = new int[var10];
        if (var17 == 1) {
            this.field2425 = new int[var9];
        }
        if (var12 == 1) {
            this.field2440 = new byte[var10];
        }
        if (var13 == 255) {
            this.field2402 = new byte[var10];
        } else {
            this.field2419 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2415 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2426 = new int[var10];
        }
        if (var16 == 1) {
            this.field2404 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field2416 = new byte[var10];
        }
        if (var18 == 1) {
            this.field2429 = new int[var9][];
            this.field2430 = new int[var9][];
        }
        this.field2417 = new short[var10];
        if (var11 > 0) {
            this.field2422 = new short[var11];
            this.field2423 = new short[var11];
            this.field2424 = new short[var11];
        }
        var2.field5072 = var11;
        var3.field5072 = var47;
        var4.field5072 = var49;
        var5.field5072 = var51;
        var6.field5072 = var35;
        int var67 = 0;
        int var68 = 0;
        int var69 = 0;
        for (int var70 = 0; var70 < var9; var70++) {
            int var71 = var2.method8244();
            int var72 = 0;
            if ((var71 & 0x1) != 0) {
                var72 = var3.method8259();
            }
            int var73 = 0;
            if ((var71 & 0x2) != 0) {
                var73 = var4.method8259();
            }
            int var74 = 0;
            if ((var71 & 0x4) != 0) {
                var74 = var5.method8259();
            }
            this.field2406[var70] = var67 + var72;
            this.field2435[var70] = var68 + var73;
            this.field2405[var70] = var69 + var74;
            var67 = this.field2406[var70];
            var68 = this.field2435[var70];
            var69 = this.field2405[var70];
            if (var17 == 1) {
                this.field2425[var70] = var6.method8244();
            }
        }
        if (var18 == 1) {
            for (int var75 = 0; var75 < var9; var75++) {
                int var76 = var6.method8244();
                this.field2429[var75] = new int[var76];
                this.field2430[var75] = new int[var76];
                for (int var77 = 0; var77 < var76; var77++) {
                    this.field2429[var75][var77] = var6.method8244();
                    this.field2430[var75][var77] = var6.method8244();
                }
            }
        }
        var2.field5072 = var45;
        var3.field5072 = var33;
        var4.field5072 = var36;
        var5.field5072 = var40;
        var6.field5072 = var37;
        var7.field5072 = var43;
        var8.field5072 = var42;
        for (int var78 = 0; var78 < var10; var78++) {
            this.field2417[var78] = (short) var2.method8246();
            if (var12 == 1) {
                this.field2440[var78] = var3.method8264();
            }
            if (var13 == 255) {
                this.field2402[var78] = var4.method8264();
            }
            if (var14 == 1) {
                this.field2415[var78] = var5.method8264();
            }
            if (var15 == 1) {
                this.field2426[var78] = var6.method8244();
            }
            if (var16 == 1) {
                this.field2404[var78] = (short) (var7.method8246() - 1);
            }
            if (this.field2416 != null && this.field2404[var78] != -1) {
                this.field2416[var78] = (byte) (var8.method8244() - 1);
            }
        }
        var2.field5072 = var39;
        var3.field5072 = var32;
        int var79 = 0;
        int var80 = 0;
        int var81 = 0;
        int var82 = 0;
        for (int var83 = 0; var83 < var10; var83++) {
            int var84 = var3.method8244();
            if (var84 == 1) {
                var79 = var2.method8259() + var82;
                var80 = var2.method8259() + var79;
                var81 = var2.method8259() + var80;
                var82 = var81;
                this.field2410[var83] = var79;
                this.field2411[var83] = var80;
                this.field2420[var83] = var81;
            }
            if (var84 == 2) {
                var80 = var81;
                var81 = var2.method8259() + var82;
                var82 = var81;
                this.field2410[var83] = var79;
                this.field2411[var83] = var80;
                this.field2420[var83] = var81;
            }
            if (var84 == 3) {
                var79 = var81;
                var81 = var2.method8259() + var82;
                var82 = var81;
                this.field2410[var83] = var79;
                this.field2411[var83] = var80;
                this.field2420[var83] = var81;
            }
            if (var84 == 4) {
                int var87 = var79;
                var79 = var80;
                var80 = var87;
                var81 = var2.method8259() + var82;
                var82 = var81;
                this.field2410[var83] = var79;
                this.field2411[var83] = var87;
                this.field2420[var83] = var81;
            }
        }
        var2.field5072 = var53;
        var3.field5072 = var55;
        var4.field5072 = var57;
        var5.field5072 = var59;
        var6.field5072 = var61;
        var7.field5072 = var63;
        for (int var88 = 0; var88 < var11; var88++) {
            int var89 = this.field2421[var88] & 0xFF;
            if (var89 == 0) {
                this.field2422[var88] = (short) var2.method8246();
                this.field2423[var88] = (short) var2.method8246();
                this.field2424[var88] = (short) var2.method8246();
            }
        }
        var2.field5072 = var65;
        int var90 = var2.method8244();
        if (var90 == 0) {
            return;
        }
        new class248();
        var2.method8246();
        var2.method8246();
        var2.method8246();
        var2.method8496();
    }

    @ObfuscatedName("ie.am([B)V")
    public void method3929(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class514 var4 = new class514(arg0);
        class514 var5 = new class514(arg0);
        class514 var6 = new class514(arg0);
        class514 var7 = new class514(arg0);
        class514 var8 = new class514(arg0);
        var4.field5072 = arg0.length - 23;
        int var9 = var4.method8246();
        int var10 = var4.method8246();
        int var11 = var4.method8244();
        int var12 = var4.method8244();
        int var13 = var4.method8244();
        int var14 = var4.method8244();
        int var15 = var4.method8244();
        int var16 = var4.method8244();
        int var17 = var4.method8244();
        int var18 = var4.method8246();
        int var19 = var4.method8246();
        int var20 = var4.method8246();
        int var21 = var4.method8246();
        int var22 = var4.method8246();
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
        this.field2414 = var9;
        this.field2409 = var10;
        this.field2445 = var11;
        this.field2406 = new int[var9];
        this.field2435 = new int[var9];
        this.field2405 = new int[var9];
        this.field2410 = new int[var10];
        this.field2411 = new int[var10];
        this.field2420 = new int[var10];
        if (var11 > 0) {
            this.field2421 = new byte[var11];
            this.field2422 = new short[var11];
            this.field2423 = new short[var11];
            this.field2424 = new short[var11];
        }
        if (var16 == 1) {
            this.field2425 = new int[var9];
        }
        if (var12 == 1) {
            this.field2440 = new byte[var10];
            this.field2416 = new byte[var10];
            this.field2404 = new short[var10];
        }
        if (var13 == 255) {
            this.field2402 = new byte[var10];
        } else {
            this.field2419 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2415 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2426 = new int[var10];
        }
        if (var17 == 1) {
            this.field2429 = new int[var9][];
            this.field2430 = new int[var9][];
        }
        this.field2417 = new short[var10];
        var4.field5072 = var23;
        var5.field5072 = var39;
        var6.field5072 = var41;
        var7.field5072 = var43;
        var8.field5072 = var27;
        int var46 = 0;
        int var47 = 0;
        int var48 = 0;
        for (int var49 = 0; var49 < var9; var49++) {
            int var50 = var4.method8244();
            int var51 = 0;
            if ((var50 & 0x1) != 0) {
                var51 = var5.method8259();
            }
            int var52 = 0;
            if ((var50 & 0x2) != 0) {
                var52 = var6.method8259();
            }
            int var53 = 0;
            if ((var50 & 0x4) != 0) {
                var53 = var7.method8259();
            }
            this.field2406[var49] = var46 + var51;
            this.field2435[var49] = var47 + var52;
            this.field2405[var49] = var48 + var53;
            var46 = this.field2406[var49];
            var47 = this.field2435[var49];
            var48 = this.field2405[var49];
            if (var16 == 1) {
                this.field2425[var49] = var8.method8244();
            }
        }
        if (var17 == 1) {
            for (int var54 = 0; var54 < var9; var54++) {
                int var55 = var8.method8244();
                this.field2429[var54] = new int[var55];
                this.field2430[var54] = new int[var55];
                for (int var56 = 0; var56 < var55; var56++) {
                    this.field2429[var54][var56] = var8.method8244();
                    this.field2430[var54][var56] = var8.method8244();
                }
            }
        }
        var4.field5072 = var35;
        var5.field5072 = var30;
        var6.field5072 = var28;
        var7.field5072 = var33;
        var8.field5072 = var29;
        for (int var57 = 0; var57 < var10; var57++) {
            this.field2417[var57] = (short) var4.method8246();
            if (var12 == 1) {
                int var58 = var5.method8244();
                if ((var58 & 0x1) == 1) {
                    this.field2440[var57] = 1;
                    var2 = true;
                } else {
                    this.field2440[var57] = 0;
                }
                if ((var58 & 0x2) == 2) {
                    this.field2416[var57] = (byte) (var58 >> 2);
                    this.field2404[var57] = this.field2417[var57];
                    this.field2417[var57] = 127;
                    if (this.field2404[var57] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field2416[var57] = -1;
                    this.field2404[var57] = -1;
                }
            }
            if (var13 == 255) {
                this.field2402[var57] = var6.method8264();
            }
            if (var14 == 1) {
                this.field2415[var57] = var7.method8264();
            }
            if (var15 == 1) {
                this.field2426[var57] = var8.method8244();
            }
        }
        var4.field5072 = var32;
        var5.field5072 = var25;
        int var59 = 0;
        int var60 = 0;
        int var61 = 0;
        int var62 = 0;
        for (int var63 = 0; var63 < var10; var63++) {
            int var64 = var5.method8244();
            if (var64 == 1) {
                var59 = var4.method8259() + var62;
                var60 = var4.method8259() + var59;
                var61 = var4.method8259() + var60;
                var62 = var61;
                this.field2410[var63] = var59;
                this.field2411[var63] = var60;
                this.field2420[var63] = var61;
            }
            if (var64 == 2) {
                var60 = var61;
                var61 = var4.method8259() + var62;
                var62 = var61;
                this.field2410[var63] = var59;
                this.field2411[var63] = var60;
                this.field2420[var63] = var61;
            }
            if (var64 == 3) {
                var59 = var61;
                var61 = var4.method8259() + var62;
                var62 = var61;
                this.field2410[var63] = var59;
                this.field2411[var63] = var60;
                this.field2420[var63] = var61;
            }
            if (var64 == 4) {
                int var67 = var59;
                var59 = var60;
                var60 = var67;
                var61 = var4.method8259() + var62;
                var62 = var61;
                this.field2410[var63] = var59;
                this.field2411[var63] = var67;
                this.field2420[var63] = var61;
            }
        }
        var4.field5072 = var37;
        for (int var68 = 0; var68 < var11; var68++) {
            this.field2421[var68] = 0;
            this.field2422[var68] = (short) var4.method8246();
            this.field2423[var68] = (short) var4.method8246();
            this.field2424[var68] = (short) var4.method8246();
        }
        if (this.field2416 != null) {
            boolean var69 = false;
            for (int var70 = 0; var70 < var10; var70++) {
                int var71 = this.field2416[var70] & 0xFF;
                if (var71 != 255) {
                    if ((this.field2422[var71] & 0xFFFF) == this.field2410[var70] && (this.field2423[var71] & 0xFFFF) == this.field2411[var70] && (this.field2424[var71] & 0xFFFF) == this.field2420[var70]) {
                        this.field2416[var70] = -1;
                    } else {
                        var69 = true;
                    }
                }
            }
            if (!var69) {
                this.field2416 = null;
            }
        }
        if (!var3) {
            this.field2404 = null;
        }
        if (!var2) {
            this.field2440 = null;
        }
    }

    @ObfuscatedName("ie.as([B)V")
    public void method3930(byte[] arg0) {
        class514 var2 = new class514(arg0);
        class514 var3 = new class514(arg0);
        class514 var4 = new class514(arg0);
        class514 var5 = new class514(arg0);
        class514 var6 = new class514(arg0);
        class514 var7 = new class514(arg0);
        class514 var8 = new class514(arg0);
        var2.field5072 = arg0.length - 23;
        int var9 = var2.method8246();
        int var10 = var2.method8246();
        int var11 = var2.method8244();
        int var12 = var2.method8244();
        int var13 = var2.method8244();
        int var14 = var2.method8244();
        int var15 = var2.method8244();
        int var16 = var2.method8244();
        int var17 = var2.method8244();
        int var18 = var2.method8246();
        int var19 = var2.method8246();
        int var20 = var2.method8246();
        int var21 = var2.method8246();
        int var22 = var2.method8246();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field2421 = new byte[var11];
            var2.field5072 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field2421[var26] = var2.method8264();
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
        this.field2414 = var9;
        this.field2409 = var10;
        this.field2445 = var11;
        this.field2406 = new int[var9];
        this.field2435 = new int[var9];
        this.field2405 = new int[var9];
        this.field2410 = new int[var10];
        this.field2411 = new int[var10];
        this.field2420 = new int[var10];
        if (var17 == 1) {
            this.field2425 = new int[var9];
        }
        if (var12 == 1) {
            this.field2440 = new byte[var10];
        }
        if (var13 == 255) {
            this.field2402 = new byte[var10];
        } else {
            this.field2419 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2415 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2426 = new int[var10];
        }
        if (var16 == 1) {
            this.field2404 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field2416 = new byte[var10];
        }
        this.field2417 = new short[var10];
        if (var11 > 0) {
            this.field2422 = new short[var11];
            this.field2423 = new short[var11];
            this.field2424 = new short[var11];
        }
        var2.field5072 = var11;
        var3.field5072 = var44;
        var4.field5072 = var46;
        var5.field5072 = var48;
        var6.field5072 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method8244();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method8259();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method8259();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method8259();
            }
            this.field2406[var67] = var64 + var69;
            this.field2435[var67] = var65 + var70;
            this.field2405[var67] = var66 + var71;
            var64 = this.field2406[var67];
            var65 = this.field2435[var67];
            var66 = this.field2405[var67];
            if (var17 == 1) {
                this.field2425[var67] = var6.method8244();
            }
        }
        var2.field5072 = var42;
        var3.field5072 = var31;
        var4.field5072 = var34;
        var5.field5072 = var37;
        var6.field5072 = var35;
        var7.field5072 = var40;
        var8.field5072 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field2417[var72] = (short) var2.method8246();
            if (var12 == 1) {
                this.field2440[var72] = var3.method8264();
            }
            if (var13 == 255) {
                this.field2402[var72] = var4.method8264();
            }
            if (var14 == 1) {
                this.field2415[var72] = var5.method8264();
            }
            if (var15 == 1) {
                this.field2426[var72] = var6.method8244();
            }
            if (var16 == 1) {
                this.field2404[var72] = (short) (var7.method8246() - 1);
            }
            if (this.field2416 != null && this.field2404[var72] != -1) {
                this.field2416[var72] = (byte) (var8.method8244() - 1);
            }
        }
        var2.field5072 = var33;
        var3.field5072 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method8244();
            if (var78 == 1) {
                var73 = var2.method8259() + var76;
                var74 = var2.method8259() + var73;
                var75 = var2.method8259() + var74;
                var76 = var75;
                this.field2410[var77] = var73;
                this.field2411[var77] = var74;
                this.field2420[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method8259() + var76;
                var76 = var75;
                this.field2410[var77] = var73;
                this.field2411[var77] = var74;
                this.field2420[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method8259() + var76;
                var76 = var75;
                this.field2410[var77] = var73;
                this.field2411[var77] = var74;
                this.field2420[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method8259() + var76;
                var76 = var75;
                this.field2410[var77] = var73;
                this.field2411[var77] = var81;
                this.field2420[var77] = var75;
            }
        }
        var2.field5072 = var50;
        var3.field5072 = var52;
        var4.field5072 = var54;
        var5.field5072 = var56;
        var6.field5072 = var58;
        var7.field5072 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field2421[var82] & 0xFF;
            if (var83 == 0) {
                this.field2422[var82] = (short) var2.method8246();
                this.field2423[var82] = (short) var2.method8246();
                this.field2424[var82] = (short) var2.method8246();
            }
        }
        var2.field5072 = var62;
        int var84 = var2.method8244();
        if (var84 == 0) {
            return;
        }
        new class248();
        var2.method8246();
        var2.method8246();
        var2.method8246();
        var2.method8496();
    }

    @ObfuscatedName("ie.ag([B)V")
    public void method3931(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class514 var4 = new class514(arg0);
        class514 var5 = new class514(arg0);
        class514 var6 = new class514(arg0);
        class514 var7 = new class514(arg0);
        class514 var8 = new class514(arg0);
        var4.field5072 = arg0.length - 18;
        int var9 = var4.method8246();
        int var10 = var4.method8246();
        int var11 = var4.method8244();
        int var12 = var4.method8244();
        int var13 = var4.method8244();
        int var14 = var4.method8244();
        int var15 = var4.method8244();
        int var16 = var4.method8244();
        int var17 = var4.method8246();
        int var18 = var4.method8246();
        int var19 = var4.method8246();
        int var20 = var4.method8246();
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
        this.field2414 = var9;
        this.field2409 = var10;
        this.field2445 = var11;
        this.field2406 = new int[var9];
        this.field2435 = new int[var9];
        this.field2405 = new int[var9];
        this.field2410 = new int[var10];
        this.field2411 = new int[var10];
        this.field2420 = new int[var10];
        if (var11 > 0) {
            this.field2421 = new byte[var11];
            this.field2422 = new short[var11];
            this.field2423 = new short[var11];
            this.field2424 = new short[var11];
        }
        if (var16 == 1) {
            this.field2425 = new int[var9];
        }
        if (var12 == 1) {
            this.field2440 = new byte[var10];
            this.field2416 = new byte[var10];
            this.field2404 = new short[var10];
        }
        if (var13 == 255) {
            this.field2402 = new byte[var10];
        } else {
            this.field2419 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2415 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2426 = new int[var10];
        }
        this.field2417 = new short[var10];
        var4.field5072 = var21;
        var5.field5072 = var36;
        var6.field5072 = var38;
        var7.field5072 = var40;
        var8.field5072 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method8244();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method8259();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method8259();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method8259();
            }
            this.field2406[var46] = var43 + var48;
            this.field2435[var46] = var44 + var49;
            this.field2405[var46] = var45 + var50;
            var43 = this.field2406[var46];
            var44 = this.field2435[var46];
            var45 = this.field2405[var46];
            if (var16 == 1) {
                this.field2425[var46] = var8.method8244();
            }
        }
        var4.field5072 = var32;
        var5.field5072 = var28;
        var6.field5072 = var26;
        var7.field5072 = var30;
        var8.field5072 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field2417[var51] = (short) var4.method8246();
            if (var12 == 1) {
                int var52 = var5.method8244();
                if ((var52 & 0x1) == 1) {
                    this.field2440[var51] = 1;
                    var2 = true;
                } else {
                    this.field2440[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field2416[var51] = (byte) (var52 >> 2);
                    this.field2404[var51] = this.field2417[var51];
                    this.field2417[var51] = 127;
                    if (this.field2404[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field2416[var51] = -1;
                    this.field2404[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field2402[var51] = var6.method8264();
            }
            if (var14 == 1) {
                this.field2415[var51] = var7.method8264();
            }
            if (var15 == 1) {
                this.field2426[var51] = var8.method8244();
            }
        }
        var4.field5072 = var25;
        var5.field5072 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method8244();
            if (var58 == 1) {
                var53 = var4.method8259() + var56;
                var54 = var4.method8259() + var53;
                var55 = var4.method8259() + var54;
                var56 = var55;
                this.field2410[var57] = var53;
                this.field2411[var57] = var54;
                this.field2420[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method8259() + var56;
                var56 = var55;
                this.field2410[var57] = var53;
                this.field2411[var57] = var54;
                this.field2420[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method8259() + var56;
                var56 = var55;
                this.field2410[var57] = var53;
                this.field2411[var57] = var54;
                this.field2420[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method8259() + var56;
                var56 = var55;
                this.field2410[var57] = var53;
                this.field2411[var57] = var61;
                this.field2420[var57] = var55;
            }
        }
        var4.field5072 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field2421[var62] = 0;
            this.field2422[var62] = (short) var4.method8246();
            this.field2423[var62] = (short) var4.method8246();
            this.field2424[var62] = (short) var4.method8246();
        }
        if (this.field2416 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field2416[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field2422[var65] & 0xFFFF) == this.field2410[var64] && (this.field2423[var65] & 0xFFFF) == this.field2411[var64] && (this.field2424[var65] & 0xFFFF) == this.field2420[var64]) {
                        this.field2416[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field2416 = null;
            }
        }
        if (!var3) {
            this.field2404 = null;
        }
        if (!var2) {
            this.field2440 = null;
        }
    }

    public class223(class223[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        this.field2414 = 0;
        this.field2409 = 0;
        this.field2445 = 0;
        this.field2419 = -1;
        for (int var10 = 0; var10 < arg1; var10++) {
            class223 var11 = arg0[var10];
            if (var11 != null) {
                this.field2414 += var11.field2414;
                this.field2409 += var11.field2409;
                this.field2445 += var11.field2445;
                if (var11.field2402 == null) {
                    if (this.field2419 == -1) {
                        this.field2419 = var11.field2419;
                    }
                    if (this.field2419 != var11.field2419) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var11.field2440 != null;
                var5 |= var11.field2415 != null;
                var6 |= var11.field2426 != null;
                var7 |= var11.field2404 != null;
                var8 |= var11.field2416 != null;
                var9 |= var11.field2429 != null;
            }
        }
        this.field2406 = new int[this.field2414];
        this.field2435 = new int[this.field2414];
        this.field2405 = new int[this.field2414];
        this.field2425 = new int[this.field2414];
        this.field2410 = new int[this.field2409];
        this.field2411 = new int[this.field2409];
        this.field2420 = new int[this.field2409];
        if (var3) {
            this.field2440 = new byte[this.field2409];
        }
        if (var4) {
            this.field2402 = new byte[this.field2409];
        }
        if (var5) {
            this.field2415 = new byte[this.field2409];
        }
        if (var6) {
            this.field2426 = new int[this.field2409];
        }
        if (var7) {
            this.field2404 = new short[this.field2409];
        }
        if (var8) {
            this.field2416 = new byte[this.field2409];
        }
        if (var9) {
            this.field2429 = new int[this.field2414][];
            this.field2430 = new int[this.field2414][];
        }
        this.field2417 = new short[this.field2409];
        if (this.field2445 > 0) {
            this.field2421 = new byte[this.field2445];
            this.field2422 = new short[this.field2445];
            this.field2423 = new short[this.field2445];
            this.field2424 = new short[this.field2445];
        }
        this.field2414 = 0;
        this.field2409 = 0;
        this.field2445 = 0;
        for (int var12 = 0; var12 < arg1; var12++) {
            class223 var13 = arg0[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < var13.field2409; var14++) {
                    if (var3 && var13.field2440 != null) {
                        this.field2440[this.field2409] = var13.field2440[var14];
                    }
                    if (var4) {
                        if (var13.field2402 == null) {
                            this.field2402[this.field2409] = var13.field2419;
                        } else {
                            this.field2402[this.field2409] = var13.field2402[var14];
                        }
                    }
                    if (var5 && var13.field2415 != null) {
                        this.field2415[this.field2409] = var13.field2415[var14];
                    }
                    if (var6 && var13.field2426 != null) {
                        this.field2426[this.field2409] = var13.field2426[var14];
                    }
                    if (var7) {
                        if (var13.field2404 == null) {
                            this.field2404[this.field2409] = -1;
                        } else {
                            this.field2404[this.field2409] = var13.field2404[var14];
                        }
                    }
                    if (var8) {
                        if (var13.field2416 == null || var13.field2416[var14] == -1) {
                            this.field2416[this.field2409] = -1;
                        } else {
                            this.field2416[this.field2409] = (byte) (var13.field2416[var14] + this.field2445);
                        }
                    }
                    this.field2417[this.field2409] = var13.field2417[var14];
                    this.field2410[this.field2409] = this.method3973(var13, var13.field2410[var14]);
                    this.field2411[this.field2409] = this.method3973(var13, var13.field2411[var14]);
                    this.field2420[this.field2409] = this.method3973(var13, var13.field2420[var14]);
                    this.field2409++;
                }
                for (int var15 = 0; var15 < var13.field2445; var15++) {
                    byte var16 = this.field2421[this.field2445] = var13.field2421[var15];
                    if (var16 == 0) {
                        this.field2422[this.field2445] = (short) this.method3973(var13, var13.field2422[var15]);
                        this.field2423[this.field2445] = (short) this.method3973(var13, var13.field2423[var15]);
                        this.field2424[this.field2445] = (short) this.method3973(var13, var13.field2424[var15]);
                    }
                    this.field2445++;
                }
            }
        }
    }

    @ObfuscatedName("ie.az(Lie;I)I")
    public final int method3973(class223 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field2406[arg1];
        int var5 = arg0.field2435[arg1];
        int var6 = arg0.field2405[arg1];
        for (int var7 = 0; var7 < this.field2414; var7++) {
            if (this.field2406[var7] == var4 && this.field2435[var7] == var5 && this.field2405[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field2406[this.field2414] = var4;
            this.field2435[this.field2414] = var5;
            this.field2405[this.field2414] = var6;
            if (arg0.field2425 != null) {
                this.field2425[this.field2414] = arg0.field2425[arg1];
            }
            if (arg0.field2429 != null) {
                this.field2429[this.field2414] = arg0.field2429[arg1];
                this.field2430[this.field2414] = arg0.field2430[arg1];
            }
            var3 = this.field2414++;
        }
        return var3;
    }

    public class223(class223 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field2414 = arg0.field2414;
        this.field2409 = arg0.field2409;
        this.field2445 = arg0.field2445;
        if (arg1) {
            this.field2406 = arg0.field2406;
            this.field2435 = arg0.field2435;
            this.field2405 = arg0.field2405;
        } else {
            this.field2406 = new int[this.field2414];
            this.field2435 = new int[this.field2414];
            this.field2405 = new int[this.field2414];
            for (int var6 = 0; var6 < this.field2414; var6++) {
                this.field2406[var6] = arg0.field2406[var6];
                this.field2435[var6] = arg0.field2435[var6];
                this.field2405[var6] = arg0.field2405[var6];
            }
        }
        if (arg2) {
            this.field2417 = arg0.field2417;
        } else {
            this.field2417 = new short[this.field2409];
            for (int var7 = 0; var7 < this.field2409; var7++) {
                this.field2417[var7] = arg0.field2417[var7];
            }
        }
        if (arg3 || arg0.field2404 == null) {
            this.field2404 = arg0.field2404;
        } else {
            this.field2404 = new short[this.field2409];
            for (int var8 = 0; var8 < this.field2409; var8++) {
                this.field2404[var8] = arg0.field2404[var8];
            }
        }
        if (arg4) {
            this.field2415 = arg0.field2415;
        } else {
            this.field2415 = new byte[this.field2409];
            if (arg0.field2415 == null) {
                for (int var9 = 0; var9 < this.field2409; var9++) {
                    this.field2415[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field2409; var10++) {
                    this.field2415[var10] = arg0.field2415[var10];
                }
            }
        }
        this.field2410 = arg0.field2410;
        this.field2411 = arg0.field2411;
        this.field2420 = arg0.field2420;
        this.field2440 = arg0.field2440;
        this.field2402 = arg0.field2402;
        this.field2416 = arg0.field2416;
        this.field2419 = arg0.field2419;
        this.field2421 = arg0.field2421;
        this.field2422 = arg0.field2422;
        this.field2423 = arg0.field2423;
        this.field2424 = arg0.field2424;
        this.field2425 = arg0.field2425;
        this.field2426 = arg0.field2426;
        this.field2427 = arg0.field2427;
        this.field2428 = arg0.field2428;
        this.field2432 = arg0.field2432;
        this.field2431 = arg0.field2431;
        this.field2413 = arg0.field2413;
        this.field2429 = arg0.field2429;
        this.field2430 = arg0.field2430;
        this.field2434 = arg0.field2434;
        this.field2446 = arg0.field2446;
    }

    @ObfuscatedName("ie.av()Lie;")
    public class223 method3934() {
        class223 var1 = new class223();
        if (this.field2440 != null) {
            var1.field2440 = new byte[this.field2409];
            for (int var2 = 0; var2 < this.field2409; var2++) {
                var1.field2440[var2] = this.field2440[var2];
            }
        }
        var1.field2414 = this.field2414;
        var1.field2409 = this.field2409;
        var1.field2445 = this.field2445;
        var1.field2406 = this.field2406;
        var1.field2435 = this.field2435;
        var1.field2405 = this.field2405;
        var1.field2410 = this.field2410;
        var1.field2411 = this.field2411;
        var1.field2420 = this.field2420;
        var1.field2402 = this.field2402;
        var1.field2415 = this.field2415;
        var1.field2416 = this.field2416;
        var1.field2417 = this.field2417;
        var1.field2404 = this.field2404;
        var1.field2419 = this.field2419;
        var1.field2421 = this.field2421;
        var1.field2422 = this.field2422;
        var1.field2423 = this.field2423;
        var1.field2424 = this.field2424;
        var1.field2425 = this.field2425;
        var1.field2426 = this.field2426;
        var1.field2427 = this.field2427;
        var1.field2428 = this.field2428;
        var1.field2432 = this.field2432;
        var1.field2431 = this.field2431;
        var1.field2434 = this.field2434;
        var1.field2446 = this.field2446;
        return var1;
    }

    @ObfuscatedName("ie.ap([[IIIIZI)Lie;")
    public class223 method3997(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method3948();
        int var7 = this.field2438 + arg1;
        int var8 = this.field2439 + arg1;
        int var9 = this.field2408 + arg3;
        int var10 = this.field2407 + arg3;
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
        class223 var15;
        if (arg4) {
            var15 = new class223();
            var15.field2414 = this.field2414;
            var15.field2409 = this.field2409;
            var15.field2445 = this.field2445;
            var15.field2406 = this.field2406;
            var15.field2405 = this.field2405;
            var15.field2410 = this.field2410;
            var15.field2411 = this.field2411;
            var15.field2420 = this.field2420;
            var15.field2440 = this.field2440;
            var15.field2402 = this.field2402;
            var15.field2415 = this.field2415;
            var15.field2416 = this.field2416;
            var15.field2417 = this.field2417;
            var15.field2404 = this.field2404;
            var15.field2419 = this.field2419;
            var15.field2421 = this.field2421;
            var15.field2422 = this.field2422;
            var15.field2423 = this.field2423;
            var15.field2424 = this.field2424;
            var15.field2425 = this.field2425;
            var15.field2426 = this.field2426;
            var15.field2427 = this.field2427;
            var15.field2428 = this.field2428;
            var15.field2434 = this.field2434;
            var15.field2446 = this.field2446;
            var15.field2435 = new int[var15.field2414];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field2414; var16++) {
                int var17 = this.field2406[var16] + arg1;
                int var18 = this.field2405[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field2435[var16] = this.field2435[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field2414; var26++) {
                int var27 = (-this.field2435[var26] << 16) / this.field2613;
                if (var27 < arg5) {
                    int var28 = this.field2406[var26] + arg1;
                    int var29 = this.field2405[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field2435[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field2435[var26];
                }
            }
        }
        var15.method3947();
        return var15;
    }

    @ObfuscatedName("ie.aq()V")
    public void method3936() {
        int var10002;
        if (this.field2425 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field2414; var3++) {
                int var4 = this.field2425[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field2427 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field2427[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field2414) {
                int var7 = this.field2425[var6];
                this.field2427[var7][var1[var7]++] = var6++;
            }
            this.field2425 = null;
        }
        if (this.field2426 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field2409; var10++) {
            int var11 = this.field2426[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field2428 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field2428[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field2409) {
            int var14 = this.field2426[var13];
            this.field2428[var14][var8[var14]++] = var13++;
        }
        this.field2426 = null;
    }

    @ObfuscatedName("ie.at()V")
    public void method3937() {
        for (int var1 = 0; var1 < this.field2414; var1++) {
            int var2 = this.field2406[var1];
            this.field2406[var1] = this.field2405[var1];
            this.field2405[var1] = -var2;
        }
        this.method3947();
    }

    @ObfuscatedName("ie.ah()V")
    public void method3938() {
        for (int var1 = 0; var1 < this.field2414; var1++) {
            this.field2406[var1] = -this.field2406[var1];
            this.field2405[var1] = -this.field2405[var1];
        }
        this.method3947();
    }

    @ObfuscatedName("ie.ax()V")
    public void method3939() {
        for (int var1 = 0; var1 < this.field2414; var1++) {
            int var2 = this.field2405[var1];
            this.field2405[var1] = this.field2406[var1];
            this.field2406[var1] = -var2;
        }
        this.method3947();
    }

    @ObfuscatedName("ie.aa(I)V")
    public void method3940(int arg0) {
        int var2 = field2436[arg0];
        int var3 = field2403[arg0];
        for (int var4 = 0; var4 < this.field2414; var4++) {
            int var5 = this.field2406[var4] * var3 + this.field2405[var4] * var2 >> 16;
            this.field2405[var4] = this.field2405[var4] * var3 - this.field2406[var4] * var2 >> 16;
            this.field2406[var4] = var5;
        }
        this.method3947();
    }

    @ObfuscatedName("ie.au(III)V")
    public void method3978(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2414; var4++) {
            this.field2406[var4] += arg0;
            this.field2435[var4] += arg1;
            this.field2405[var4] += arg2;
        }
        this.method3947();
    }

    @ObfuscatedName("ie.ae(SS)V")
    public void method3942(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2409; var3++) {
            if (this.field2417[var3] == arg0) {
                this.field2417[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("ie.ab(SS)V")
    public void method3943(short arg0, short arg1) {
        if (this.field2404 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field2409; var3++) {
            if (this.field2404[var3] == arg0) {
                this.field2404[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("ie.ad()V")
    public void method3957() {
        for (int var1 = 0; var1 < this.field2414; var1++) {
            this.field2405[var1] = -this.field2405[var1];
        }
        for (int var2 = 0; var2 < this.field2409; var2++) {
            int var3 = this.field2410[var2];
            this.field2410[var2] = this.field2420[var2];
            this.field2420[var2] = var3;
        }
        this.method3947();
    }

    @ObfuscatedName("ie.ao(III)V")
    public void method3945(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2414; var4++) {
            this.field2406[var4] = this.field2406[var4] * arg0 / 128;
            this.field2435[var4] = this.field2435[var4] * arg1 / 128;
            this.field2405[var4] = this.field2405[var4] * arg2 / 128;
        }
        this.method3947();
    }

    @ObfuscatedName("ie.ac()V")
    public void method3955() {
        if (this.field2432 != null) {
            return;
        }
        this.field2432 = new class243[this.field2414];
        for (int var1 = 0; var1 < this.field2414; var1++) {
            this.field2432[var1] = new class243();
        }
        for (int var2 = 0; var2 < this.field2409; var2++) {
            int var3 = this.field2410[var2];
            int var4 = this.field2411[var2];
            int var5 = this.field2420[var2];
            int var6 = this.field2406[var4] - this.field2406[var3];
            int var7 = this.field2435[var4] - this.field2435[var3];
            int var8 = this.field2405[var4] - this.field2405[var3];
            int var9 = this.field2406[var5] - this.field2406[var3];
            int var10 = this.field2435[var5] - this.field2435[var3];
            int var11 = this.field2405[var5] - this.field2405[var3];
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
            if (this.field2440 == null) {
                var19 = 0;
            } else {
                var19 = this.field2440[var2];
            }
            if (var19 == 0) {
                class243 var20 = this.field2432[var3];
                var20.field2767 += var16;
                var20.field2765 += var17;
                var20.field2766 += var18;
                var20.field2764++;
                class243 var21 = this.field2432[var4];
                var21.field2767 += var16;
                var21.field2765 += var17;
                var21.field2766 += var18;
                var21.field2764++;
                class243 var22 = this.field2432[var5];
                var22.field2767 += var16;
                var22.field2765 += var17;
                var22.field2766 += var18;
                var22.field2764++;
            } else if (var19 == 1) {
                if (this.field2431 == null) {
                    this.field2431 = new class235[this.field2409];
                }
                class235 var23 = this.field2431[var2] = new class235();
                var23.field2615 = var16;
                var23.field2614 = var17;
                var23.field2617 = var18;
            }
        }
    }

    @ObfuscatedName("ie.ak()V")
    public void method3947() {
        this.field2432 = null;
        this.field2413 = null;
        this.field2431 = null;
        this.field2433 = false;
    }

    @ObfuscatedName("ie.an()V")
    public void method3948() {
        if (this.field2433) {
            return;
        }
        this.field2613 = 0;
        this.field2437 = 0;
        this.field2438 = 999999;
        this.field2439 = -999999;
        this.field2407 = -99999;
        this.field2408 = 99999;
        for (int var1 = 0; var1 < this.field2414; var1++) {
            int var2 = this.field2406[var1];
            int var3 = this.field2435[var1];
            int var4 = this.field2405[var1];
            if (var2 < this.field2438) {
                this.field2438 = var2;
            }
            if (var2 > this.field2439) {
                this.field2439 = var2;
            }
            if (var4 < this.field2408) {
                this.field2408 = var4;
            }
            if (var4 > this.field2407) {
                this.field2407 = var4;
            }
            if (-var3 > this.field2613) {
                this.field2613 = -var3;
            }
            if (var3 > this.field2437) {
                this.field2437 = var3;
            }
        }
        this.field2433 = true;
    }

    @ObfuscatedName("ie.af(Lie;Lie;IIIZ)V")
    public static void method3949(class223 arg0, class223 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method3948();
        arg0.method3955();
        arg1.method3948();
        arg1.method3955();
        field2444++;
        int var6 = 0;
        int[] var7 = arg1.field2406;
        int var8 = arg1.field2414;
        for (int var9 = 0; var9 < arg0.field2414; var9++) {
            class243 var10 = arg0.field2432[var9];
            if (var10.field2764 != 0) {
                int var11 = arg0.field2435[var9] - arg3;
                if (var11 <= arg1.field2437) {
                    int var12 = arg0.field2406[var9] - arg2;
                    if (var12 >= arg1.field2438 && var12 <= arg1.field2439) {
                        int var13 = arg0.field2405[var9] - arg4;
                        if (var13 >= arg1.field2408 && var13 <= arg1.field2407) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class243 var15 = arg1.field2432[var14];
                                if (var7[var14] == var12 && arg1.field2405[var14] == var13 && arg1.field2435[var14] == var11 && var15.field2764 != 0) {
                                    if (arg0.field2413 == null) {
                                        arg0.field2413 = new class243[arg0.field2414];
                                    }
                                    if (arg1.field2413 == null) {
                                        arg1.field2413 = new class243[var8];
                                    }
                                    class243 var16 = arg0.field2413[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field2413[var9] = new class243(var10);
                                    }
                                    class243 var17 = arg1.field2413[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field2413[var14] = new class243(var15);
                                    }
                                    var16.field2767 += var15.field2767;
                                    var16.field2765 += var15.field2765;
                                    var16.field2766 += var15.field2766;
                                    var16.field2764 += var15.field2764;
                                    var17.field2767 += var10.field2767;
                                    var17.field2765 += var10.field2765;
                                    var17.field2766 += var10.field2766;
                                    var17.field2764 += var10.field2764;
                                    var6++;
                                    field2412[var9] = field2444;
                                    field2443[var14] = field2444;
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
        for (int var18 = 0; var18 < arg0.field2409; var18++) {
            if (field2412[arg0.field2410[var18]] == field2444 && field2412[arg0.field2411[var18]] == field2444 && field2412[arg0.field2420[var18]] == field2444) {
                if (arg0.field2440 == null) {
                    arg0.field2440 = new byte[arg0.field2409];
                }
                arg0.field2440[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field2409; var19++) {
            if (field2443[arg1.field2410[var19]] == field2444 && field2443[arg1.field2411[var19]] == field2444 && field2443[arg1.field2420[var19]] == field2444) {
                if (arg1.field2440 == null) {
                    arg1.field2440 = new byte[arg1.field2409];
                }
                arg1.field2440[var19] = 2;
            }
        }
    }

    @ObfuscatedName("ie.ai(IIIII)Ljo;")
    public final class241 method3950(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method3955();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class241 var8 = new class241();
        var8.field2698 = new int[this.field2409];
        var8.field2715 = new int[this.field2409];
        var8.field2690 = new int[this.field2409];
        if (this.field2445 > 0 && this.field2416 != null) {
            int[] var9 = new int[this.field2445];
            for (int var10 = 0; var10 < this.field2409; var10++) {
                if (this.field2416[var10] != -1) {
                    var9[this.field2416[var10] & 0xFF]++;
                }
            }
            var8.field2696 = 0;
            for (int var11 = 0; var11 < this.field2445; var11++) {
                if (var9[var11] > 0 && this.field2421[var11] == 0) {
                    var8.field2696++;
                }
            }
            var8.field2697 = new int[var8.field2696];
            var8.field2746 = new int[var8.field2696];
            var8.field2699 = new int[var8.field2696];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field2445; var13++) {
                if (var9[var13] > 0 && this.field2421[var13] == 0) {
                    var8.field2697[var12] = this.field2422[var13] & 0xFFFF;
                    var8.field2746[var12] = this.field2423[var13] & 0xFFFF;
                    var8.field2699[var12] = this.field2424[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field2693 = new byte[this.field2409];
            for (int var14 = 0; var14 < this.field2409; var14++) {
                if (this.field2416[var14] == -1) {
                    var8.field2693[var14] = -1;
                } else {
                    var8.field2693[var14] = (byte) var9[this.field2416[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field2409; var15++) {
            byte var16;
            if (this.field2440 == null) {
                var16 = 0;
            } else {
                var16 = this.field2440[var15];
            }
            byte var17;
            if (this.field2415 == null) {
                var17 = 0;
            } else {
                var17 = this.field2415[var15];
            }
            short var18;
            if (this.field2404 == null) {
                var18 = -1;
            } else {
                var18 = this.field2404[var15];
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
                    class243 var20;
                    if (this.field2413 == null || this.field2413[this.field2410[var15]] == null) {
                        var20 = this.field2432[this.field2410[var15]];
                    } else {
                        var20 = this.field2413[this.field2410[var15]];
                    }
                    int var21 = (var20.field2766 * arg4 + var20.field2767 * arg2 + var20.field2765 * arg3) / (var20.field2764 * var7) + arg0;
                    var8.field2698[var15] = method3951(var19, var21);
                    class243 var22;
                    if (this.field2413 == null || this.field2413[this.field2411[var15]] == null) {
                        var22 = this.field2432[this.field2411[var15]];
                    } else {
                        var22 = this.field2413[this.field2411[var15]];
                    }
                    int var23 = (var22.field2766 * arg4 + var22.field2767 * arg2 + var22.field2765 * arg3) / (var22.field2764 * var7) + arg0;
                    var8.field2715[var15] = method3951(var19, var23);
                    class243 var24;
                    if (this.field2413 == null || this.field2413[this.field2420[var15]] == null) {
                        var24 = this.field2432[this.field2420[var15]];
                    } else {
                        var24 = this.field2413[this.field2420[var15]];
                    }
                    int var25 = (var24.field2766 * arg4 + var24.field2767 * arg2 + var24.field2765 * arg3) / (var24.field2764 * var7) + arg0;
                    var8.field2690[var15] = method3951(var19, var25);
                } else if (var16 == 1) {
                    class235 var26 = this.field2431[var15];
                    int var27 = (var26.field2617 * arg4 + var26.field2615 * arg2 + var26.field2614 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field2698[var15] = method3951(this.field2417[var15] & 0xFFFF, var27);
                    var8.field2690[var15] = -1;
                } else if (var16 == 3) {
                    var8.field2698[var15] = 128;
                    var8.field2690[var15] = -1;
                } else {
                    var8.field2690[var15] = -2;
                }
            } else if (var16 == 0) {
                class243 var28;
                if (this.field2413 == null || this.field2413[this.field2410[var15]] == null) {
                    var28 = this.field2432[this.field2410[var15]];
                } else {
                    var28 = this.field2413[this.field2410[var15]];
                }
                int var29 = (var28.field2766 * arg4 + var28.field2767 * arg2 + var28.field2765 * arg3) / (var28.field2764 * var7) + arg0;
                var8.field2698[var15] = method3952(var29);
                class243 var30;
                if (this.field2413 == null || this.field2413[this.field2411[var15]] == null) {
                    var30 = this.field2432[this.field2411[var15]];
                } else {
                    var30 = this.field2413[this.field2411[var15]];
                }
                int var31 = (var30.field2766 * arg4 + var30.field2767 * arg2 + var30.field2765 * arg3) / (var30.field2764 * var7) + arg0;
                var8.field2715[var15] = method3952(var31);
                class243 var32;
                if (this.field2413 == null || this.field2413[this.field2420[var15]] == null) {
                    var32 = this.field2432[this.field2420[var15]];
                } else {
                    var32 = this.field2413[this.field2420[var15]];
                }
                int var33 = (var32.field2766 * arg4 + var32.field2767 * arg2 + var32.field2765 * arg3) / (var32.field2764 * var7) + arg0;
                var8.field2690[var15] = method3952(var33);
            } else if (var16 == 1) {
                class235 var34 = this.field2431[var15];
                int var35 = (var34.field2617 * arg4 + var34.field2615 * arg2 + var34.field2614 * arg3) / (var7 / 2 + var7) + arg0;
                var8.field2698[var15] = method3952(var35);
                var8.field2690[var15] = -1;
            } else {
                var8.field2690[var15] = -2;
            }
        }
        this.method3936();
        var8.field2750 = this.field2414;
        var8.field2688 = this.field2406;
        var8.field2682 = this.field2435;
        var8.field2678 = this.field2405;
        var8.field2705 = this.field2409;
        var8.field2673 = this.field2410;
        var8.field2686 = this.field2411;
        var8.field2687 = this.field2420;
        var8.field2691 = this.field2402;
        var8.field2692 = this.field2415;
        var8.field2684 = this.field2419;
        var8.field2700 = this.field2427;
        var8.field2701 = this.field2428;
        var8.field2694 = this.field2404;
        var8.field2749 = this.field2429;
        var8.field2745 = this.field2430;
        return var8;
    }

    @ObfuscatedName("ie.al(II)I")
    public static final int method3951(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("ie.bd(I)I")
    public static final int method3952(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
