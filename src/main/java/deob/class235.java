package deob;

@ObfuscatedName("jv")
public class class235 extends class248 {

    @ObfuscatedName("jv.am")
    public int field2486 = 0;

    @ObfuscatedName("jv.ax")
    public int[] field2487;

    @ObfuscatedName("jv.aq")
    public int[] field2488;

    @ObfuscatedName("jv.af")
    public int[] field2507;

    @ObfuscatedName("jv.at")
    public int field2490 = 0;

    @ObfuscatedName("jv.au")
    public int[] field2491;

    @ObfuscatedName("jv.ar")
    public int[] field2492;

    @ObfuscatedName("jv.al")
    public int[] field2493;

    @ObfuscatedName("jv.ad")
    public byte[] field2524;

    @ObfuscatedName("jv.ah")
    public byte[] field2495;

    @ObfuscatedName("jv.ap")
    public byte[] field2496;

    @ObfuscatedName("jv.ab")
    public byte[] field2497;

    @ObfuscatedName("jv.az")
    public short[] field2518;

    @ObfuscatedName("jv.aa")
    public short[] field2501;

    @ObfuscatedName("jv.ai")
    public byte field2499 = 0;

    @ObfuscatedName("jv.ao")
    public int field2494;

    @ObfuscatedName("jv.as")
    public byte[] field2502;

    @ObfuscatedName("jv.ay")
    public short[] field2503;

    @ObfuscatedName("jv.aj")
    public short[] field2504;

    @ObfuscatedName("jv.av")
    public short[] field2498;

    @ObfuscatedName("jv.aw")
    public int[] field2519;

    @ObfuscatedName("jv.an")
    public int[] field2489;

    @ObfuscatedName("jv.ak")
    public int[][] field2508;

    @ObfuscatedName("jv.bn")
    public int[][] field2509;

    @ObfuscatedName("jv.bh")
    public int[][] field2510;

    @ObfuscatedName("jv.bd")
    public int[][] field2511;

    @ObfuscatedName("jv.bx")
    public class249[] field2512;

    @ObfuscatedName("jv.bf")
    public class258[] field2513;

    @ObfuscatedName("jv.bm")
    public class258[] field2514;

    @ObfuscatedName("jv.bs")
    public short field2515;

    @ObfuscatedName("jv.bw")
    public short field2516;

    @ObfuscatedName("jv.ba")
    public boolean field2517 = false;

    @ObfuscatedName("jv.bj")
    public int field2520;

    @ObfuscatedName("jv.bp")
    public int field2483;

    @ObfuscatedName("jv.by")
    public int field2506;

    @ObfuscatedName("jv.bb")
    public int field2521;

    @ObfuscatedName("jv.bi")
    public int field2522;

    @ObfuscatedName("jv.bg")
    public static int[] field2523 = new int[10000];

    @ObfuscatedName("jv.bl")
    public static int[] field2505 = new int[10000];

    @ObfuscatedName("jv.bz")
    public static int field2525 = 0;

    @ObfuscatedName("jv.bu")
    public static int[] field2526 = class240.field2590;

    @ObfuscatedName("jv.br")
    public static int[] field2500 = class240.field2588;

    public class235() {
    }

    @ObfuscatedName("jv.ac(Lpo;II)Ljv;")
    public static class235 method4302(class391 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method6782(arg1, arg2);
        return var3 == null ? null : new class235(var3);
    }

    public class235(byte[] arg0) {
        class551 var2 = new class551(10);
        var2.method8958(-2);
        if (arg0[arg0.length - 1] == -3 && arg0[arg0.length - 2] == -1) {
            this.method4241(arg0);
        } else if (arg0[arg0.length - 1] == -2 && arg0[arg0.length - 2] == -1) {
            this.method4242(arg0);
        } else if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method4243(arg0);
        } else {
            this.method4244(arg0);
        }
    }

    @ObfuscatedName("jv.ae([B)V")
    public void method4241(byte[] arg0) {
        class551 var2 = new class551(arg0);
        class551 var3 = new class551(arg0);
        class551 var4 = new class551(arg0);
        class551 var5 = new class551(arg0);
        class551 var6 = new class551(arg0);
        class551 var7 = new class551(arg0);
        class551 var8 = new class551(arg0);
        var2.field5415 = arg0.length - 26;
        int var9 = var2.method9119();
        int var10 = var2.method9119();
        int var11 = var2.method8955();
        int var12 = var2.method8955();
        int var13 = var2.method8955();
        int var14 = var2.method8955();
        int var15 = var2.method8955();
        int var16 = var2.method8955();
        int var17 = var2.method8955();
        int var18 = var2.method8955();
        int var19 = var2.method9119();
        int var20 = var2.method9119();
        int var21 = var2.method9119();
        int var22 = var2.method9119();
        int var23 = var2.method9119();
        int var24 = var2.method9119();
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        if (var11 > 0) {
            this.field2502 = new byte[var11];
            var2.field5415 = 0;
            for (int var28 = 0; var28 < var11; var28++) {
                byte var29 = this.field2502[var28] = var2.method8975();
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
        this.field2486 = var9;
        this.field2490 = var10;
        this.field2494 = var11;
        this.field2487 = new int[var9];
        this.field2488 = new int[var9];
        this.field2507 = new int[var9];
        this.field2491 = new int[var10];
        this.field2492 = new int[var10];
        this.field2493 = new int[var10];
        if (var17 == 1) {
            this.field2519 = new int[var9];
        }
        if (var12 == 1) {
            this.field2524 = new byte[var10];
        }
        if (var13 == 255) {
            this.field2495 = new byte[var10];
        } else {
            this.field2499 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2496 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2489 = new int[var10];
        }
        if (var16 == 1) {
            this.field2501 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field2497 = new byte[var10];
        }
        if (var18 == 1) {
            this.field2510 = new int[var9][];
            this.field2511 = new int[var9][];
        }
        this.field2518 = new short[var10];
        if (var11 > 0) {
            this.field2503 = new short[var11];
            this.field2504 = new short[var11];
            this.field2498 = new short[var11];
        }
        var2.field5415 = var11;
        var3.field5415 = var47;
        var4.field5415 = var49;
        var5.field5415 = var51;
        var6.field5415 = var35;
        int var67 = 0;
        int var68 = 0;
        int var69 = 0;
        for (int var70 = 0; var70 < var9; var70++) {
            int var71 = var2.method8955();
            int var72 = 0;
            if ((var71 & 0x1) != 0) {
                var72 = var3.method8957();
            }
            int var73 = 0;
            if ((var71 & 0x2) != 0) {
                var73 = var4.method8957();
            }
            int var74 = 0;
            if ((var71 & 0x4) != 0) {
                var74 = var5.method8957();
            }
            this.field2487[var70] = var67 + var72;
            this.field2488[var70] = var68 + var73;
            this.field2507[var70] = var69 + var74;
            var67 = this.field2487[var70];
            var68 = this.field2488[var70];
            var69 = this.field2507[var70];
            if (var17 == 1) {
                this.field2519[var70] = var6.method8955();
            }
        }
        if (var18 == 1) {
            for (int var75 = 0; var75 < var9; var75++) {
                int var76 = var6.method8955();
                this.field2510[var75] = new int[var76];
                this.field2511[var75] = new int[var76];
                for (int var77 = 0; var77 < var76; var77++) {
                    this.field2510[var75][var77] = var6.method8955();
                    this.field2511[var75][var77] = var6.method8955();
                }
            }
        }
        var2.field5415 = var45;
        var3.field5415 = var33;
        var4.field5415 = var36;
        var5.field5415 = var40;
        var6.field5415 = var37;
        var7.field5415 = var43;
        var8.field5415 = var42;
        for (int var78 = 0; var78 < var10; var78++) {
            this.field2518[var78] = (short) var2.method9119();
            if (var12 == 1) {
                this.field2524[var78] = var3.method8975();
            }
            if (var13 == 255) {
                this.field2495[var78] = var4.method8975();
            }
            if (var14 == 1) {
                this.field2496[var78] = var5.method8975();
            }
            if (var15 == 1) {
                this.field2489[var78] = var6.method8955();
            }
            if (var16 == 1) {
                this.field2501[var78] = (short) (var7.method9119() - 1);
            }
            if (this.field2497 != null && this.field2501[var78] != -1) {
                this.field2497[var78] = (byte) (var8.method8955() - 1);
            }
        }
        var2.field5415 = var39;
        var3.field5415 = var32;
        int var79 = 0;
        int var80 = 0;
        int var81 = 0;
        int var82 = 0;
        for (int var83 = 0; var83 < var10; var83++) {
            int var84 = var3.method8955();
            if (var84 == 1) {
                var79 = var2.method8957() + var82;
                var80 = var2.method8957() + var79;
                var81 = var2.method8957() + var80;
                var82 = var81;
                this.field2491[var83] = var79;
                this.field2492[var83] = var80;
                this.field2493[var83] = var81;
            }
            if (var84 == 2) {
                var80 = var81;
                var81 = var2.method8957() + var82;
                var82 = var81;
                this.field2491[var83] = var79;
                this.field2492[var83] = var80;
                this.field2493[var83] = var81;
            }
            if (var84 == 3) {
                var79 = var81;
                var81 = var2.method8957() + var82;
                var82 = var81;
                this.field2491[var83] = var79;
                this.field2492[var83] = var80;
                this.field2493[var83] = var81;
            }
            if (var84 == 4) {
                int var87 = var79;
                var79 = var80;
                var80 = var87;
                var81 = var2.method8957() + var82;
                var82 = var81;
                this.field2491[var83] = var79;
                this.field2492[var83] = var87;
                this.field2493[var83] = var81;
            }
        }
        var2.field5415 = var53;
        var3.field5415 = var55;
        var4.field5415 = var57;
        var5.field5415 = var59;
        var6.field5415 = var61;
        var7.field5415 = var63;
        for (int var88 = 0; var88 < var11; var88++) {
            int var89 = this.field2502[var88] & 0xFF;
            if (var89 == 0) {
                this.field2503[var88] = (short) var2.method9119();
                this.field2504[var88] = (short) var2.method9119();
                this.field2498[var88] = (short) var2.method9119();
            }
        }
        var2.field5415 = var65;
        int var90 = var2.method8955();
        if (var90 == 0) {
            return;
        }
        new class263();
        var2.method9119();
        var2.method9119();
        var2.method9119();
        var2.method9110();
    }

    @ObfuscatedName("jv.ag([B)V")
    public void method4242(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class551 var4 = new class551(arg0);
        class551 var5 = new class551(arg0);
        class551 var6 = new class551(arg0);
        class551 var7 = new class551(arg0);
        class551 var8 = new class551(arg0);
        var4.field5415 = arg0.length - 23;
        int var9 = var4.method9119();
        int var10 = var4.method9119();
        int var11 = var4.method8955();
        int var12 = var4.method8955();
        int var13 = var4.method8955();
        int var14 = var4.method8955();
        int var15 = var4.method8955();
        int var16 = var4.method8955();
        int var17 = var4.method8955();
        int var18 = var4.method9119();
        int var19 = var4.method9119();
        int var20 = var4.method9119();
        int var21 = var4.method9119();
        int var22 = var4.method9119();
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
        this.field2486 = var9;
        this.field2490 = var10;
        this.field2494 = var11;
        this.field2487 = new int[var9];
        this.field2488 = new int[var9];
        this.field2507 = new int[var9];
        this.field2491 = new int[var10];
        this.field2492 = new int[var10];
        this.field2493 = new int[var10];
        if (var11 > 0) {
            this.field2502 = new byte[var11];
            this.field2503 = new short[var11];
            this.field2504 = new short[var11];
            this.field2498 = new short[var11];
        }
        if (var16 == 1) {
            this.field2519 = new int[var9];
        }
        if (var12 == 1) {
            this.field2524 = new byte[var10];
            this.field2497 = new byte[var10];
            this.field2501 = new short[var10];
        }
        if (var13 == 255) {
            this.field2495 = new byte[var10];
        } else {
            this.field2499 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2496 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2489 = new int[var10];
        }
        if (var17 == 1) {
            this.field2510 = new int[var9][];
            this.field2511 = new int[var9][];
        }
        this.field2518 = new short[var10];
        var4.field5415 = var23;
        var5.field5415 = var39;
        var6.field5415 = var41;
        var7.field5415 = var43;
        var8.field5415 = var27;
        int var46 = 0;
        int var47 = 0;
        int var48 = 0;
        for (int var49 = 0; var49 < var9; var49++) {
            int var50 = var4.method8955();
            int var51 = 0;
            if ((var50 & 0x1) != 0) {
                var51 = var5.method8957();
            }
            int var52 = 0;
            if ((var50 & 0x2) != 0) {
                var52 = var6.method8957();
            }
            int var53 = 0;
            if ((var50 & 0x4) != 0) {
                var53 = var7.method8957();
            }
            this.field2487[var49] = var46 + var51;
            this.field2488[var49] = var47 + var52;
            this.field2507[var49] = var48 + var53;
            var46 = this.field2487[var49];
            var47 = this.field2488[var49];
            var48 = this.field2507[var49];
            if (var16 == 1) {
                this.field2519[var49] = var8.method8955();
            }
        }
        if (var17 == 1) {
            for (int var54 = 0; var54 < var9; var54++) {
                int var55 = var8.method8955();
                this.field2510[var54] = new int[var55];
                this.field2511[var54] = new int[var55];
                for (int var56 = 0; var56 < var55; var56++) {
                    this.field2510[var54][var56] = var8.method8955();
                    this.field2511[var54][var56] = var8.method8955();
                }
            }
        }
        var4.field5415 = var35;
        var5.field5415 = var30;
        var6.field5415 = var28;
        var7.field5415 = var33;
        var8.field5415 = var29;
        for (int var57 = 0; var57 < var10; var57++) {
            this.field2518[var57] = (short) var4.method9119();
            if (var12 == 1) {
                int var58 = var5.method8955();
                if ((var58 & 0x1) == 1) {
                    this.field2524[var57] = 1;
                    var2 = true;
                } else {
                    this.field2524[var57] = 0;
                }
                if ((var58 & 0x2) == 2) {
                    this.field2497[var57] = (byte) (var58 >> 2);
                    this.field2501[var57] = this.field2518[var57];
                    this.field2518[var57] = 127;
                    if (this.field2501[var57] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field2497[var57] = -1;
                    this.field2501[var57] = -1;
                }
            }
            if (var13 == 255) {
                this.field2495[var57] = var6.method8975();
            }
            if (var14 == 1) {
                this.field2496[var57] = var7.method8975();
            }
            if (var15 == 1) {
                this.field2489[var57] = var8.method8955();
            }
        }
        var4.field5415 = var32;
        var5.field5415 = var25;
        int var59 = 0;
        int var60 = 0;
        int var61 = 0;
        int var62 = 0;
        for (int var63 = 0; var63 < var10; var63++) {
            int var64 = var5.method8955();
            if (var64 == 1) {
                var59 = var4.method8957() + var62;
                var60 = var4.method8957() + var59;
                var61 = var4.method8957() + var60;
                var62 = var61;
                this.field2491[var63] = var59;
                this.field2492[var63] = var60;
                this.field2493[var63] = var61;
            }
            if (var64 == 2) {
                var60 = var61;
                var61 = var4.method8957() + var62;
                var62 = var61;
                this.field2491[var63] = var59;
                this.field2492[var63] = var60;
                this.field2493[var63] = var61;
            }
            if (var64 == 3) {
                var59 = var61;
                var61 = var4.method8957() + var62;
                var62 = var61;
                this.field2491[var63] = var59;
                this.field2492[var63] = var60;
                this.field2493[var63] = var61;
            }
            if (var64 == 4) {
                int var67 = var59;
                var59 = var60;
                var60 = var67;
                var61 = var4.method8957() + var62;
                var62 = var61;
                this.field2491[var63] = var59;
                this.field2492[var63] = var67;
                this.field2493[var63] = var61;
            }
        }
        var4.field5415 = var37;
        for (int var68 = 0; var68 < var11; var68++) {
            this.field2502[var68] = 0;
            this.field2503[var68] = (short) var4.method9119();
            this.field2504[var68] = (short) var4.method9119();
            this.field2498[var68] = (short) var4.method9119();
        }
        if (this.field2497 != null) {
            boolean var69 = false;
            for (int var70 = 0; var70 < var10; var70++) {
                int var71 = this.field2497[var70] & 0xFF;
                if (var71 != 255) {
                    if ((this.field2503[var71] & 0xFFFF) == this.field2491[var70] && (this.field2504[var71] & 0xFFFF) == this.field2492[var70] && (this.field2498[var71] & 0xFFFF) == this.field2493[var70]) {
                        this.field2497[var70] = -1;
                    } else {
                        var69 = true;
                    }
                }
            }
            if (!var69) {
                this.field2497 = null;
            }
        }
        if (!var3) {
            this.field2501 = null;
        }
        if (!var2) {
            this.field2524 = null;
        }
    }

    @ObfuscatedName("jv.am([B)V")
    public void method4243(byte[] arg0) {
        class551 var2 = new class551(arg0);
        class551 var3 = new class551(arg0);
        class551 var4 = new class551(arg0);
        class551 var5 = new class551(arg0);
        class551 var6 = new class551(arg0);
        class551 var7 = new class551(arg0);
        class551 var8 = new class551(arg0);
        var2.field5415 = arg0.length - 23;
        int var9 = var2.method9119();
        int var10 = var2.method9119();
        int var11 = var2.method8955();
        int var12 = var2.method8955();
        int var13 = var2.method8955();
        int var14 = var2.method8955();
        int var15 = var2.method8955();
        int var16 = var2.method8955();
        int var17 = var2.method8955();
        int var18 = var2.method9119();
        int var19 = var2.method9119();
        int var20 = var2.method9119();
        int var21 = var2.method9119();
        int var22 = var2.method9119();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field2502 = new byte[var11];
            var2.field5415 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field2502[var26] = var2.method8975();
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
        this.field2486 = var9;
        this.field2490 = var10;
        this.field2494 = var11;
        this.field2487 = new int[var9];
        this.field2488 = new int[var9];
        this.field2507 = new int[var9];
        this.field2491 = new int[var10];
        this.field2492 = new int[var10];
        this.field2493 = new int[var10];
        if (var17 == 1) {
            this.field2519 = new int[var9];
        }
        if (var12 == 1) {
            this.field2524 = new byte[var10];
        }
        if (var13 == 255) {
            this.field2495 = new byte[var10];
        } else {
            this.field2499 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2496 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2489 = new int[var10];
        }
        if (var16 == 1) {
            this.field2501 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field2497 = new byte[var10];
        }
        this.field2518 = new short[var10];
        if (var11 > 0) {
            this.field2503 = new short[var11];
            this.field2504 = new short[var11];
            this.field2498 = new short[var11];
        }
        var2.field5415 = var11;
        var3.field5415 = var44;
        var4.field5415 = var46;
        var5.field5415 = var48;
        var6.field5415 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method8955();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method8957();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method8957();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method8957();
            }
            this.field2487[var67] = var64 + var69;
            this.field2488[var67] = var65 + var70;
            this.field2507[var67] = var66 + var71;
            var64 = this.field2487[var67];
            var65 = this.field2488[var67];
            var66 = this.field2507[var67];
            if (var17 == 1) {
                this.field2519[var67] = var6.method8955();
            }
        }
        var2.field5415 = var42;
        var3.field5415 = var31;
        var4.field5415 = var34;
        var5.field5415 = var37;
        var6.field5415 = var35;
        var7.field5415 = var40;
        var8.field5415 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field2518[var72] = (short) var2.method9119();
            if (var12 == 1) {
                this.field2524[var72] = var3.method8975();
            }
            if (var13 == 255) {
                this.field2495[var72] = var4.method8975();
            }
            if (var14 == 1) {
                this.field2496[var72] = var5.method8975();
            }
            if (var15 == 1) {
                this.field2489[var72] = var6.method8955();
            }
            if (var16 == 1) {
                this.field2501[var72] = (short) (var7.method9119() - 1);
            }
            if (this.field2497 != null && this.field2501[var72] != -1) {
                this.field2497[var72] = (byte) (var8.method8955() - 1);
            }
        }
        var2.field5415 = var33;
        var3.field5415 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method8955();
            if (var78 == 1) {
                var73 = var2.method8957() + var76;
                var74 = var2.method8957() + var73;
                var75 = var2.method8957() + var74;
                var76 = var75;
                this.field2491[var77] = var73;
                this.field2492[var77] = var74;
                this.field2493[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method8957() + var76;
                var76 = var75;
                this.field2491[var77] = var73;
                this.field2492[var77] = var74;
                this.field2493[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method8957() + var76;
                var76 = var75;
                this.field2491[var77] = var73;
                this.field2492[var77] = var74;
                this.field2493[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method8957() + var76;
                var76 = var75;
                this.field2491[var77] = var73;
                this.field2492[var77] = var81;
                this.field2493[var77] = var75;
            }
        }
        var2.field5415 = var50;
        var3.field5415 = var52;
        var4.field5415 = var54;
        var5.field5415 = var56;
        var6.field5415 = var58;
        var7.field5415 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field2502[var82] & 0xFF;
            if (var83 == 0) {
                this.field2503[var82] = (short) var2.method9119();
                this.field2504[var82] = (short) var2.method9119();
                this.field2498[var82] = (short) var2.method9119();
            }
        }
        var2.field5415 = var62;
        int var84 = var2.method8955();
        if (var84 == 0) {
            return;
        }
        new class263();
        var2.method9119();
        var2.method9119();
        var2.method9119();
        var2.method9110();
    }

    @ObfuscatedName("jv.ax([B)V")
    public void method4244(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class551 var4 = new class551(arg0);
        class551 var5 = new class551(arg0);
        class551 var6 = new class551(arg0);
        class551 var7 = new class551(arg0);
        class551 var8 = new class551(arg0);
        var4.field5415 = arg0.length - 18;
        int var9 = var4.method9119();
        int var10 = var4.method9119();
        int var11 = var4.method8955();
        int var12 = var4.method8955();
        int var13 = var4.method8955();
        int var14 = var4.method8955();
        int var15 = var4.method8955();
        int var16 = var4.method8955();
        int var17 = var4.method9119();
        int var18 = var4.method9119();
        int var19 = var4.method9119();
        int var20 = var4.method9119();
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
        this.field2486 = var9;
        this.field2490 = var10;
        this.field2494 = var11;
        this.field2487 = new int[var9];
        this.field2488 = new int[var9];
        this.field2507 = new int[var9];
        this.field2491 = new int[var10];
        this.field2492 = new int[var10];
        this.field2493 = new int[var10];
        if (var11 > 0) {
            this.field2502 = new byte[var11];
            this.field2503 = new short[var11];
            this.field2504 = new short[var11];
            this.field2498 = new short[var11];
        }
        if (var16 == 1) {
            this.field2519 = new int[var9];
        }
        if (var12 == 1) {
            this.field2524 = new byte[var10];
            this.field2497 = new byte[var10];
            this.field2501 = new short[var10];
        }
        if (var13 == 255) {
            this.field2495 = new byte[var10];
        } else {
            this.field2499 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2496 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2489 = new int[var10];
        }
        this.field2518 = new short[var10];
        var4.field5415 = var21;
        var5.field5415 = var36;
        var6.field5415 = var38;
        var7.field5415 = var40;
        var8.field5415 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method8955();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method8957();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method8957();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method8957();
            }
            this.field2487[var46] = var43 + var48;
            this.field2488[var46] = var44 + var49;
            this.field2507[var46] = var45 + var50;
            var43 = this.field2487[var46];
            var44 = this.field2488[var46];
            var45 = this.field2507[var46];
            if (var16 == 1) {
                this.field2519[var46] = var8.method8955();
            }
        }
        var4.field5415 = var32;
        var5.field5415 = var28;
        var6.field5415 = var26;
        var7.field5415 = var30;
        var8.field5415 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field2518[var51] = (short) var4.method9119();
            if (var12 == 1) {
                int var52 = var5.method8955();
                if ((var52 & 0x1) == 1) {
                    this.field2524[var51] = 1;
                    var2 = true;
                } else {
                    this.field2524[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field2497[var51] = (byte) (var52 >> 2);
                    this.field2501[var51] = this.field2518[var51];
                    this.field2518[var51] = 127;
                    if (this.field2501[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field2497[var51] = -1;
                    this.field2501[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field2495[var51] = var6.method8975();
            }
            if (var14 == 1) {
                this.field2496[var51] = var7.method8975();
            }
            if (var15 == 1) {
                this.field2489[var51] = var8.method8955();
            }
        }
        var4.field5415 = var25;
        var5.field5415 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method8955();
            if (var58 == 1) {
                var53 = var4.method8957() + var56;
                var54 = var4.method8957() + var53;
                var55 = var4.method8957() + var54;
                var56 = var55;
                this.field2491[var57] = var53;
                this.field2492[var57] = var54;
                this.field2493[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method8957() + var56;
                var56 = var55;
                this.field2491[var57] = var53;
                this.field2492[var57] = var54;
                this.field2493[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method8957() + var56;
                var56 = var55;
                this.field2491[var57] = var53;
                this.field2492[var57] = var54;
                this.field2493[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method8957() + var56;
                var56 = var55;
                this.field2491[var57] = var53;
                this.field2492[var57] = var61;
                this.field2493[var57] = var55;
            }
        }
        var4.field5415 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field2502[var62] = 0;
            this.field2503[var62] = (short) var4.method9119();
            this.field2504[var62] = (short) var4.method9119();
            this.field2498[var62] = (short) var4.method9119();
        }
        if (this.field2497 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field2497[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field2503[var65] & 0xFFFF) == this.field2491[var64] && (this.field2504[var65] & 0xFFFF) == this.field2492[var64] && (this.field2498[var65] & 0xFFFF) == this.field2493[var64]) {
                        this.field2497[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field2497 = null;
            }
        }
        if (!var3) {
            this.field2501 = null;
        }
        if (!var2) {
            this.field2524 = null;
        }
    }

    public class235(class235[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        this.field2486 = 0;
        this.field2490 = 0;
        this.field2494 = 0;
        this.field2499 = -1;
        for (int var10 = 0; var10 < arg1; var10++) {
            class235 var11 = arg0[var10];
            if (var11 != null) {
                this.field2486 += var11.field2486;
                this.field2490 += var11.field2490;
                this.field2494 += var11.field2494;
                if (var11.field2495 == null) {
                    if (this.field2499 == -1) {
                        this.field2499 = var11.field2499;
                    }
                    if (this.field2499 != var11.field2499) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var11.field2524 != null;
                var5 |= var11.field2496 != null;
                var6 |= var11.field2489 != null;
                var7 |= var11.field2501 != null;
                var8 |= var11.field2497 != null;
                var9 |= var11.field2510 != null;
            }
        }
        this.field2487 = new int[this.field2486];
        this.field2488 = new int[this.field2486];
        this.field2507 = new int[this.field2486];
        this.field2519 = new int[this.field2486];
        this.field2491 = new int[this.field2490];
        this.field2492 = new int[this.field2490];
        this.field2493 = new int[this.field2490];
        if (var3) {
            this.field2524 = new byte[this.field2490];
        }
        if (var4) {
            this.field2495 = new byte[this.field2490];
        }
        if (var5) {
            this.field2496 = new byte[this.field2490];
        }
        if (var6) {
            this.field2489 = new int[this.field2490];
        }
        if (var7) {
            this.field2501 = new short[this.field2490];
        }
        if (var8) {
            this.field2497 = new byte[this.field2490];
        }
        if (var9) {
            this.field2510 = new int[this.field2486][];
            this.field2511 = new int[this.field2486][];
        }
        this.field2518 = new short[this.field2490];
        if (this.field2494 > 0) {
            this.field2502 = new byte[this.field2494];
            this.field2503 = new short[this.field2494];
            this.field2504 = new short[this.field2494];
            this.field2498 = new short[this.field2494];
        }
        this.field2486 = 0;
        this.field2490 = 0;
        this.field2494 = 0;
        for (int var12 = 0; var12 < arg1; var12++) {
            class235 var13 = arg0[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < var13.field2490; var14++) {
                    if (var3 && var13.field2524 != null) {
                        this.field2524[this.field2490] = var13.field2524[var14];
                    }
                    if (var4) {
                        if (var13.field2495 == null) {
                            this.field2495[this.field2490] = var13.field2499;
                        } else {
                            this.field2495[this.field2490] = var13.field2495[var14];
                        }
                    }
                    if (var5 && var13.field2496 != null) {
                        this.field2496[this.field2490] = var13.field2496[var14];
                    }
                    if (var6 && var13.field2489 != null) {
                        this.field2489[this.field2490] = var13.field2489[var14];
                    }
                    if (var7) {
                        if (var13.field2501 == null) {
                            this.field2501[this.field2490] = -1;
                        } else {
                            this.field2501[this.field2490] = var13.field2501[var14];
                        }
                    }
                    if (var8) {
                        if (var13.field2497 == null || var13.field2497[var14] == -1) {
                            this.field2497[this.field2490] = -1;
                        } else {
                            this.field2497[this.field2490] = (byte) (var13.field2497[var14] + this.field2494);
                        }
                    }
                    this.field2518[this.field2490] = var13.field2518[var14];
                    this.field2491[this.field2490] = this.method4287(var13, var13.field2491[var14]);
                    this.field2492[this.field2490] = this.method4287(var13, var13.field2492[var14]);
                    this.field2493[this.field2490] = this.method4287(var13, var13.field2493[var14]);
                    this.field2490++;
                }
                for (int var15 = 0; var15 < var13.field2494; var15++) {
                    byte var16 = this.field2502[this.field2494] = var13.field2502[var15];
                    if (var16 == 0) {
                        this.field2503[this.field2494] = (short) this.method4287(var13, var13.field2503[var15]);
                        this.field2504[this.field2494] = (short) this.method4287(var13, var13.field2504[var15]);
                        this.field2498[this.field2494] = (short) this.method4287(var13, var13.field2498[var15]);
                    }
                    this.field2494++;
                }
            }
        }
    }

    @ObfuscatedName("jv.aq(Ljv;I)I")
    public final int method4287(class235 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field2487[arg1];
        int var5 = arg0.field2488[arg1];
        int var6 = arg0.field2507[arg1];
        for (int var7 = 0; var7 < this.field2486; var7++) {
            if (this.field2487[var7] == var4 && this.field2488[var7] == var5 && this.field2507[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field2487[this.field2486] = var4;
            this.field2488[this.field2486] = var5;
            this.field2507[this.field2486] = var6;
            if (arg0.field2519 != null) {
                this.field2519[this.field2486] = arg0.field2519[arg1];
            }
            if (arg0.field2510 != null) {
                this.field2510[this.field2486] = arg0.field2510[arg1];
                this.field2511[this.field2486] = arg0.field2511[arg1];
            }
            var3 = this.field2486++;
        }
        return var3;
    }

    public class235(class235 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field2486 = arg0.field2486;
        this.field2490 = arg0.field2490;
        this.field2494 = arg0.field2494;
        if (arg1) {
            this.field2487 = arg0.field2487;
            this.field2488 = arg0.field2488;
            this.field2507 = arg0.field2507;
        } else {
            this.field2487 = new int[this.field2486];
            this.field2488 = new int[this.field2486];
            this.field2507 = new int[this.field2486];
            for (int var6 = 0; var6 < this.field2486; var6++) {
                this.field2487[var6] = arg0.field2487[var6];
                this.field2488[var6] = arg0.field2488[var6];
                this.field2507[var6] = arg0.field2507[var6];
            }
        }
        if (arg2) {
            this.field2518 = arg0.field2518;
        } else {
            this.field2518 = new short[this.field2490];
            for (int var7 = 0; var7 < this.field2490; var7++) {
                this.field2518[var7] = arg0.field2518[var7];
            }
        }
        if (arg3 || arg0.field2501 == null) {
            this.field2501 = arg0.field2501;
        } else {
            this.field2501 = new short[this.field2490];
            for (int var8 = 0; var8 < this.field2490; var8++) {
                this.field2501[var8] = arg0.field2501[var8];
            }
        }
        if (arg4) {
            this.field2496 = arg0.field2496;
        } else {
            this.field2496 = new byte[this.field2490];
            if (arg0.field2496 == null) {
                for (int var9 = 0; var9 < this.field2490; var9++) {
                    this.field2496[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field2490; var10++) {
                    this.field2496[var10] = arg0.field2496[var10];
                }
            }
        }
        this.field2491 = arg0.field2491;
        this.field2492 = arg0.field2492;
        this.field2493 = arg0.field2493;
        this.field2524 = arg0.field2524;
        this.field2495 = arg0.field2495;
        this.field2497 = arg0.field2497;
        this.field2499 = arg0.field2499;
        this.field2502 = arg0.field2502;
        this.field2503 = arg0.field2503;
        this.field2504 = arg0.field2504;
        this.field2498 = arg0.field2498;
        this.field2519 = arg0.field2519;
        this.field2489 = arg0.field2489;
        this.field2508 = arg0.field2508;
        this.field2509 = arg0.field2509;
        this.field2513 = arg0.field2513;
        this.field2512 = arg0.field2512;
        this.field2514 = arg0.field2514;
        this.field2510 = arg0.field2510;
        this.field2511 = arg0.field2511;
        this.field2515 = arg0.field2515;
        this.field2516 = arg0.field2516;
    }

    @ObfuscatedName("jv.af()Ljv;")
    public class235 method4313() {
        class235 var1 = new class235();
        if (this.field2524 != null) {
            var1.field2524 = new byte[this.field2490];
            for (int var2 = 0; var2 < this.field2490; var2++) {
                var1.field2524[var2] = this.field2524[var2];
            }
        }
        var1.field2486 = this.field2486;
        var1.field2490 = this.field2490;
        var1.field2494 = this.field2494;
        var1.field2487 = this.field2487;
        var1.field2488 = this.field2488;
        var1.field2507 = this.field2507;
        var1.field2491 = this.field2491;
        var1.field2492 = this.field2492;
        var1.field2493 = this.field2493;
        var1.field2495 = this.field2495;
        var1.field2496 = this.field2496;
        var1.field2497 = this.field2497;
        var1.field2518 = this.field2518;
        var1.field2501 = this.field2501;
        var1.field2499 = this.field2499;
        var1.field2502 = this.field2502;
        var1.field2503 = this.field2503;
        var1.field2504 = this.field2504;
        var1.field2498 = this.field2498;
        var1.field2519 = this.field2519;
        var1.field2489 = this.field2489;
        var1.field2508 = this.field2508;
        var1.field2509 = this.field2509;
        var1.field2513 = this.field2513;
        var1.field2512 = this.field2512;
        var1.field2515 = this.field2515;
        var1.field2516 = this.field2516;
        return var1;
    }

    @ObfuscatedName("jv.at([[IIIIZI)Ljv;")
    public class235 method4252(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method4260();
        int var7 = this.field2483 + arg1;
        int var8 = this.field2506 + arg1;
        int var9 = this.field2522 + arg3;
        int var10 = this.field2521 + arg3;
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
        class235 var15;
        if (arg4) {
            var15 = new class235();
            var15.field2486 = this.field2486;
            var15.field2490 = this.field2490;
            var15.field2494 = this.field2494;
            var15.field2487 = this.field2487;
            var15.field2507 = this.field2507;
            var15.field2491 = this.field2491;
            var15.field2492 = this.field2492;
            var15.field2493 = this.field2493;
            var15.field2524 = this.field2524;
            var15.field2495 = this.field2495;
            var15.field2496 = this.field2496;
            var15.field2497 = this.field2497;
            var15.field2518 = this.field2518;
            var15.field2501 = this.field2501;
            var15.field2499 = this.field2499;
            var15.field2502 = this.field2502;
            var15.field2503 = this.field2503;
            var15.field2504 = this.field2504;
            var15.field2498 = this.field2498;
            var15.field2519 = this.field2519;
            var15.field2489 = this.field2489;
            var15.field2508 = this.field2508;
            var15.field2509 = this.field2509;
            var15.field2515 = this.field2515;
            var15.field2516 = this.field2516;
            var15.field2488 = new int[var15.field2486];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field2486; var16++) {
                int var17 = this.field2487[var16] + arg1;
                int var18 = this.field2507[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field2488[var16] = this.field2488[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field2486; var26++) {
                int var27 = (-this.field2488[var26] << 16) / this.field2736;
                if (var27 < arg5) {
                    int var28 = this.field2487[var26] + arg1;
                    int var29 = this.field2507[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field2488[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field2488[var26];
                }
            }
        }
        var15.method4239();
        return var15;
    }

    @ObfuscatedName("jv.au()V")
    public void method4249() {
        int var10002;
        if (this.field2519 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field2486; var3++) {
                int var4 = this.field2519[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field2508 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field2508[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field2486) {
                int var7 = this.field2519[var6];
                this.field2508[var7][var1[var7]++] = var6++;
            }
            this.field2519 = null;
        }
        if (this.field2489 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field2490; var10++) {
            int var11 = this.field2489[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field2509 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field2509[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field2490) {
            int var14 = this.field2489[var13];
            this.field2509[var14][var8[var14]++] = var13++;
        }
        this.field2489 = null;
    }

    @ObfuscatedName("jv.ar()V")
    public void method4250() {
        for (int var1 = 0; var1 < this.field2486; var1++) {
            int var2 = this.field2487[var1];
            this.field2487[var1] = this.field2507[var1];
            this.field2507[var1] = -var2;
        }
        this.method4239();
    }

    @ObfuscatedName("jv.al()V")
    public void method4299() {
        for (int var1 = 0; var1 < this.field2486; var1++) {
            this.field2487[var1] = -this.field2487[var1];
            this.field2507[var1] = -this.field2507[var1];
        }
        this.method4239();
    }

    @ObfuscatedName("jv.az()V")
    public void method4251() {
        for (int var1 = 0; var1 < this.field2486; var1++) {
            int var2 = this.field2507[var1];
            this.field2507[var1] = this.field2487[var1];
            this.field2487[var1] = -var2;
        }
        this.method4239();
    }

    @ObfuscatedName("jv.aa(I)V")
    public void method4289(int arg0) {
        int var2 = field2526[arg0];
        int var3 = field2500[arg0];
        for (int var4 = 0; var4 < this.field2486; var4++) {
            int var5 = this.field2507[var4] * var2 + this.field2487[var4] * var3 >> 16;
            this.field2507[var4] = this.field2507[var4] * var3 - this.field2487[var4] * var2 >> 16;
            this.field2487[var4] = var5;
        }
        this.method4239();
    }

    @ObfuscatedName("jv.ai(III)V")
    public void method4246(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2486; var4++) {
            this.field2487[var4] += arg0;
            this.field2488[var4] += arg1;
            this.field2507[var4] += arg2;
        }
        this.method4239();
    }

    @ObfuscatedName("jv.ao(SS)V")
    public void method4254(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2490; var3++) {
            if (this.field2518[var3] == arg0) {
                this.field2518[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("jv.as(SS)V")
    public void method4259(short arg0, short arg1) {
        if (this.field2501 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field2490; var3++) {
            if (this.field2501[var3] == arg0) {
                this.field2501[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("jv.ay()V")
    public void method4256() {
        for (int var1 = 0; var1 < this.field2486; var1++) {
            this.field2507[var1] = -this.field2507[var1];
        }
        for (int var2 = 0; var2 < this.field2490; var2++) {
            int var3 = this.field2491[var2];
            this.field2491[var2] = this.field2493[var2];
            this.field2493[var2] = var3;
        }
        this.method4239();
    }

    @ObfuscatedName("jv.aj(III)V")
    public void method4257(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2486; var4++) {
            this.field2487[var4] = this.field2487[var4] * arg0 / 128;
            this.field2488[var4] = this.field2488[var4] * arg1 / 128;
            this.field2507[var4] = this.field2507[var4] * arg2 / 128;
        }
        this.method4239();
    }

    @ObfuscatedName("jv.av()V")
    public void method4258() {
        if (this.field2513 != null) {
            return;
        }
        this.field2513 = new class258[this.field2486];
        for (int var1 = 0; var1 < this.field2486; var1++) {
            this.field2513[var1] = new class258();
        }
        for (int var2 = 0; var2 < this.field2490; var2++) {
            int var3 = this.field2491[var2];
            int var4 = this.field2492[var2];
            int var5 = this.field2493[var2];
            int var6 = this.field2487[var4] - this.field2487[var3];
            int var7 = this.field2488[var4] - this.field2488[var3];
            int var8 = this.field2507[var4] - this.field2507[var3];
            int var9 = this.field2487[var5] - this.field2487[var3];
            int var10 = this.field2488[var5] - this.field2488[var3];
            int var11 = this.field2507[var5] - this.field2507[var3];
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
            if (this.field2524 == null) {
                var19 = 0;
            } else {
                var19 = this.field2524[var2];
            }
            if (var19 == 0) {
                class258 var20 = this.field2513[var3];
                var20.field2887 += var16;
                var20.field2885 += var17;
                var20.field2886 += var18;
                var20.field2888++;
                class258 var21 = this.field2513[var4];
                var21.field2887 += var16;
                var21.field2885 += var17;
                var21.field2886 += var18;
                var21.field2888++;
                class258 var22 = this.field2513[var5];
                var22.field2887 += var16;
                var22.field2885 += var17;
                var22.field2886 += var18;
                var22.field2888++;
            } else if (var19 == 1) {
                if (this.field2512 == null) {
                    this.field2512 = new class249[this.field2490];
                }
                class249 var23 = this.field2512[var2] = new class249();
                var23.field2737 = var16;
                var23.field2738 = var17;
                var23.field2739 = var18;
            }
        }
    }

    @ObfuscatedName("jv.aw()V")
    public void method4239() {
        this.field2513 = null;
        this.field2514 = null;
        this.field2512 = null;
        this.field2517 = false;
    }

    @ObfuscatedName("jv.an()V")
    public void method4260() {
        if (this.field2517) {
            return;
        }
        this.field2736 = 0;
        this.field2520 = 0;
        this.field2483 = 999999;
        this.field2506 = -999999;
        this.field2521 = -99999;
        this.field2522 = 99999;
        for (int var1 = 0; var1 < this.field2486; var1++) {
            int var2 = this.field2487[var1];
            int var3 = this.field2488[var1];
            int var4 = this.field2507[var1];
            if (var2 < this.field2483) {
                this.field2483 = var2;
            }
            if (var2 > this.field2506) {
                this.field2506 = var2;
            }
            if (var4 < this.field2522) {
                this.field2522 = var4;
            }
            if (var4 > this.field2521) {
                this.field2521 = var4;
            }
            if (-var3 > this.field2736) {
                this.field2736 = -var3;
            }
            if (var3 > this.field2520) {
                this.field2520 = var3;
            }
        }
        this.field2517 = true;
    }

    @ObfuscatedName("jv.ak(Ljv;Ljv;IIIZ)V")
    public static void method4261(class235 arg0, class235 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method4260();
        arg0.method4258();
        arg1.method4260();
        arg1.method4258();
        field2525++;
        int var6 = 0;
        int[] var7 = arg1.field2487;
        int var8 = arg1.field2486;
        for (int var9 = 0; var9 < arg0.field2486; var9++) {
            class258 var10 = arg0.field2513[var9];
            if (var10.field2888 != 0) {
                int var11 = arg0.field2488[var9] - arg3;
                if (var11 <= arg1.field2520) {
                    int var12 = arg0.field2487[var9] - arg2;
                    if (var12 >= arg1.field2483 && var12 <= arg1.field2506) {
                        int var13 = arg0.field2507[var9] - arg4;
                        if (var13 >= arg1.field2522 && var13 <= arg1.field2521) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class258 var15 = arg1.field2513[var14];
                                if (var7[var14] == var12 && arg1.field2507[var14] == var13 && arg1.field2488[var14] == var11 && var15.field2888 != 0) {
                                    if (arg0.field2514 == null) {
                                        arg0.field2514 = new class258[arg0.field2486];
                                    }
                                    if (arg1.field2514 == null) {
                                        arg1.field2514 = new class258[var8];
                                    }
                                    class258 var16 = arg0.field2514[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field2514[var9] = new class258(var10);
                                    }
                                    class258 var17 = arg1.field2514[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field2514[var14] = new class258(var15);
                                    }
                                    var16.field2887 += var15.field2887;
                                    var16.field2885 += var15.field2885;
                                    var16.field2886 += var15.field2886;
                                    var16.field2888 += var15.field2888;
                                    var17.field2887 += var10.field2887;
                                    var17.field2885 += var10.field2885;
                                    var17.field2886 += var10.field2886;
                                    var17.field2888 += var10.field2888;
                                    var6++;
                                    field2523[var9] = field2525;
                                    field2505[var14] = field2525;
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
        for (int var18 = 0; var18 < arg0.field2490; var18++) {
            if (field2523[arg0.field2491[var18]] == field2525 && field2523[arg0.field2492[var18]] == field2525 && field2523[arg0.field2493[var18]] == field2525) {
                if (arg0.field2524 == null) {
                    arg0.field2524 = new byte[arg0.field2490];
                }
                arg0.field2524[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field2490; var19++) {
            if (field2505[arg1.field2491[var19]] == field2525 && field2505[arg1.field2492[var19]] == field2525 && field2505[arg1.field2493[var19]] == field2525) {
                if (arg1.field2524 == null) {
                    arg1.field2524 = new byte[arg1.field2490];
                }
                arg1.field2524[var19] = 2;
            }
        }
    }

    @ObfuscatedName("jv.bn(IIIII)Ljm;")
    public final class256 method4266(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method4258();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class256 var8 = new class256();
        var8.field2811 = new int[this.field2490];
        var8.field2812 = new int[this.field2490];
        var8.field2853 = new int[this.field2490];
        if (this.field2494 > 0 && this.field2497 != null) {
            int[] var9 = new int[this.field2494];
            for (int var10 = 0; var10 < this.field2490; var10++) {
                if (this.field2497[var10] != -1) {
                    var9[this.field2497[var10] & 0xFF]++;
                }
            }
            var8.field2819 = 0;
            for (int var11 = 0; var11 < this.field2494; var11++) {
                if (var9[var11] > 0 && this.field2502[var11] == 0) {
                    var8.field2819++;
                }
            }
            var8.field2838 = new int[var8.field2819];
            var8.field2821 = new int[var8.field2819];
            var8.field2822 = new int[var8.field2819];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field2494; var13++) {
                if (var9[var13] > 0 && this.field2502[var13] == 0) {
                    var8.field2838[var12] = this.field2503[var13] & 0xFFFF;
                    var8.field2821[var12] = this.field2504[var13] & 0xFFFF;
                    var8.field2822[var12] = this.field2498[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field2816 = new byte[this.field2490];
            for (int var14 = 0; var14 < this.field2490; var14++) {
                if (this.field2497[var14] == -1) {
                    var8.field2816[var14] = -1;
                } else {
                    var8.field2816[var14] = (byte) var9[this.field2497[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field2490; var15++) {
            byte var16;
            if (this.field2524 == null) {
                var16 = 0;
            } else {
                var16 = this.field2524[var15];
            }
            byte var17;
            if (this.field2496 == null) {
                var17 = 0;
            } else {
                var17 = this.field2496[var15];
            }
            short var18;
            if (this.field2501 == null) {
                var18 = -1;
            } else {
                var18 = this.field2501[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field2518[var15] & 0xFFFF;
                    class258 var20;
                    if (this.field2514 == null || this.field2514[this.field2491[var15]] == null) {
                        var20 = this.field2513[this.field2491[var15]];
                    } else {
                        var20 = this.field2514[this.field2491[var15]];
                    }
                    int var21 = (var20.field2886 * arg4 + var20.field2887 * arg2 + var20.field2885 * arg3) / (var20.field2888 * var7) + arg0;
                    var8.field2811[var15] = method4263(var19, var21);
                    class258 var22;
                    if (this.field2514 == null || this.field2514[this.field2492[var15]] == null) {
                        var22 = this.field2513[this.field2492[var15]];
                    } else {
                        var22 = this.field2514[this.field2492[var15]];
                    }
                    int var23 = (var22.field2886 * arg4 + var22.field2887 * arg2 + var22.field2885 * arg3) / (var22.field2888 * var7) + arg0;
                    var8.field2812[var15] = method4263(var19, var23);
                    class258 var24;
                    if (this.field2514 == null || this.field2514[this.field2493[var15]] == null) {
                        var24 = this.field2513[this.field2493[var15]];
                    } else {
                        var24 = this.field2514[this.field2493[var15]];
                    }
                    int var25 = (var24.field2886 * arg4 + var24.field2887 * arg2 + var24.field2885 * arg3) / (var24.field2888 * var7) + arg0;
                    var8.field2853[var15] = method4263(var19, var25);
                } else if (var16 == 1) {
                    class249 var26 = this.field2512[var15];
                    int var27 = (var26.field2739 * arg4 + var26.field2738 * arg3 + var26.field2737 * arg2) / (var7 / 2 + var7) + arg0;
                    var8.field2811[var15] = method4263(this.field2518[var15] & 0xFFFF, var27);
                    var8.field2853[var15] = -1;
                } else if (var16 == 3) {
                    var8.field2811[var15] = 128;
                    var8.field2853[var15] = -1;
                } else {
                    var8.field2853[var15] = -2;
                }
            } else if (var16 == 0) {
                class258 var28;
                if (this.field2514 == null || this.field2514[this.field2491[var15]] == null) {
                    var28 = this.field2513[this.field2491[var15]];
                } else {
                    var28 = this.field2514[this.field2491[var15]];
                }
                int var29 = (var28.field2886 * arg4 + var28.field2887 * arg2 + var28.field2885 * arg3) / (var28.field2888 * var7) + arg0;
                var8.field2811[var15] = method4274(var29);
                class258 var30;
                if (this.field2514 == null || this.field2514[this.field2492[var15]] == null) {
                    var30 = this.field2513[this.field2492[var15]];
                } else {
                    var30 = this.field2514[this.field2492[var15]];
                }
                int var31 = (var30.field2886 * arg4 + var30.field2887 * arg2 + var30.field2885 * arg3) / (var30.field2888 * var7) + arg0;
                var8.field2812[var15] = method4274(var31);
                class258 var32;
                if (this.field2514 == null || this.field2514[this.field2493[var15]] == null) {
                    var32 = this.field2513[this.field2493[var15]];
                } else {
                    var32 = this.field2514[this.field2493[var15]];
                }
                int var33 = (var32.field2886 * arg4 + var32.field2887 * arg2 + var32.field2885 * arg3) / (var32.field2888 * var7) + arg0;
                var8.field2853[var15] = method4274(var33);
            } else if (var16 == 1) {
                class249 var34 = this.field2512[var15];
                int var35 = (var34.field2739 * arg4 + var34.field2738 * arg3 + var34.field2737 * arg2) / (var7 / 2 + var7) + arg0;
                var8.field2811[var15] = method4274(var35);
                var8.field2853[var15] = -1;
            } else {
                var8.field2853[var15] = -2;
            }
        }
        this.method4249();
        var8.field2803 = this.field2486;
        var8.field2804 = this.field2487;
        var8.field2805 = this.field2488;
        var8.field2815 = this.field2507;
        var8.field2807 = this.field2490;
        var8.field2808 = this.field2491;
        var8.field2866 = this.field2492;
        var8.field2810 = this.field2493;
        var8.field2814 = this.field2495;
        var8.field2809 = this.field2496;
        var8.field2818 = this.field2499;
        var8.field2802 = this.field2508;
        var8.field2824 = this.field2509;
        var8.field2817 = this.field2501;
        var8.field2825 = this.field2510;
        var8.field2826 = this.field2511;
        return var8;
    }

    @ObfuscatedName("jv.bh(II)I")
    public static final int method4263(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("jv.bd(I)I")
    public static final int method4274(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
