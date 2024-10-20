package deob;

@ObfuscatedName("jj")
public class class238 extends class249 {

    @ObfuscatedName("jj.at")
    public int field2509 = 0;

    @ObfuscatedName("jj.an")
    public int[] field2540;

    @ObfuscatedName("jj.ao")
    public int[] field2511;

    @ObfuscatedName("jj.ab")
    public int[] field2512;

    @ObfuscatedName("jj.aw")
    public int field2513 = 0;

    @ObfuscatedName("jj.ad")
    public int[] field2514;

    @ObfuscatedName("jj.al")
    public int[] field2515;

    @ObfuscatedName("jj.as")
    public int[] field2516;

    @ObfuscatedName("jj.ag")
    public byte[] field2548;

    @ObfuscatedName("jj.ai")
    public byte[] field2518;

    @ObfuscatedName("jj.ax")
    public byte[] field2519;

    @ObfuscatedName("jj.ar")
    public byte[] field2506;

    @ObfuscatedName("jj.aj")
    public short[] field2521;

    @ObfuscatedName("jj.au")
    public short[] field2545;

    @ObfuscatedName("jj.ay")
    public byte field2523 = 0;

    @ObfuscatedName("jj.ap")
    public int field2535;

    @ObfuscatedName("jj.av")
    public byte[] field2525;

    @ObfuscatedName("jj.aa")
    public short[] field2526;

    @ObfuscatedName("jj.aq")
    public short[] field2527;

    @ObfuscatedName("jj.am")
    public short[] field2528;

    @ObfuscatedName("jj.ac")
    public int[] field2510;

    @ObfuscatedName("jj.ae")
    public int[] field2530;

    @ObfuscatedName("jj.ak")
    public int[][] field2529;

    @ObfuscatedName("jj.bp")
    public int[][] field2520;

    @ObfuscatedName("jj.bz")
    public int[][] field2533;

    @ObfuscatedName("jj.bc")
    public int[][] field2534;

    @ObfuscatedName("jj.bf")
    public class250[] field2524;

    @ObfuscatedName("jj.be")
    public class258[] field2536;

    @ObfuscatedName("jj.bn")
    public class258[] field2546;

    @ObfuscatedName("jj.bd")
    public short field2538;

    @ObfuscatedName("jj.bo")
    public short field2539;

    @ObfuscatedName("jj.bx")
    public boolean field2508 = false;

    @ObfuscatedName("jj.bl")
    public int field2541;

    @ObfuscatedName("jj.bh")
    public int field2542;

    @ObfuscatedName("jj.bs")
    public int field2531;

    @ObfuscatedName("jj.bj")
    public int field2544;

    @ObfuscatedName("jj.bu")
    public int field2517;

    @ObfuscatedName("jj.br")
    public static int[] field2550 = new int[10000];

    @ObfuscatedName("jj.bb")
    public static int[] field2522 = new int[10000];

    @ObfuscatedName("jj.by")
    public static int field2543 = 0;

    @ObfuscatedName("jj.bk")
    public static int[] field2549 = class243.field2616;

    @ObfuscatedName("jj.bt")
    public static int[] field2507 = class243.field2613;

    public class238() {
    }

    @ObfuscatedName("jj.az(Loc;II)Ljj;")
    public static class238 method4116(class379 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method6328(arg1, arg2);
        return var3 == null ? null : new class238(var3);
    }

    public class238(byte[] arg0) {
        class535 var2 = new class535(10);
        var2.method8446(-2);
        if (arg0[arg0.length - 1] == -3 && arg0[arg0.length - 2] == -1) {
            this.method4147(arg0);
        } else if (arg0[arg0.length - 1] == -2 && arg0[arg0.length - 2] == -1) {
            this.method4118(arg0);
        } else if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method4119(arg0);
        } else {
            this.method4120(arg0);
        }
    }

    @ObfuscatedName("jj.af([B)V")
    public void method4147(byte[] arg0) {
        class535 var2 = new class535(arg0);
        class535 var3 = new class535(arg0);
        class535 var4 = new class535(arg0);
        class535 var5 = new class535(arg0);
        class535 var6 = new class535(arg0);
        class535 var7 = new class535(arg0);
        class535 var8 = new class535(arg0);
        var2.field5233 = arg0.length - 26;
        int var9 = var2.method8670();
        int var10 = var2.method8670();
        int var11 = var2.method8462();
        int var12 = var2.method8462();
        int var13 = var2.method8462();
        int var14 = var2.method8462();
        int var15 = var2.method8462();
        int var16 = var2.method8462();
        int var17 = var2.method8462();
        int var18 = var2.method8462();
        int var19 = var2.method8670();
        int var20 = var2.method8670();
        int var21 = var2.method8670();
        int var22 = var2.method8670();
        int var23 = var2.method8670();
        int var24 = var2.method8670();
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        if (var11 > 0) {
            this.field2525 = new byte[var11];
            var2.field5233 = 0;
            for (int var28 = 0; var28 < var11; var28++) {
                byte var29 = this.field2525[var28] = var2.method8463();
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
        this.field2509 = var9;
        this.field2513 = var10;
        this.field2535 = var11;
        this.field2540 = new int[var9];
        this.field2511 = new int[var9];
        this.field2512 = new int[var9];
        this.field2514 = new int[var10];
        this.field2515 = new int[var10];
        this.field2516 = new int[var10];
        if (var17 == 1) {
            this.field2510 = new int[var9];
        }
        if (var12 == 1) {
            this.field2548 = new byte[var10];
        }
        if (var13 == 255) {
            this.field2518 = new byte[var10];
        } else {
            this.field2523 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2519 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2530 = new int[var10];
        }
        if (var16 == 1) {
            this.field2545 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field2506 = new byte[var10];
        }
        if (var18 == 1) {
            this.field2533 = new int[var9][];
            this.field2534 = new int[var9][];
        }
        this.field2521 = new short[var10];
        if (var11 > 0) {
            this.field2526 = new short[var11];
            this.field2527 = new short[var11];
            this.field2528 = new short[var11];
        }
        var2.field5233 = var11;
        var3.field5233 = var47;
        var4.field5233 = var49;
        var5.field5233 = var51;
        var6.field5233 = var35;
        int var67 = 0;
        int var68 = 0;
        int var69 = 0;
        for (int var70 = 0; var70 < var9; var70++) {
            int var71 = var2.method8462();
            int var72 = 0;
            if ((var71 & 0x1) != 0) {
                var72 = var3.method8477();
            }
            int var73 = 0;
            if ((var71 & 0x2) != 0) {
                var73 = var4.method8477();
            }
            int var74 = 0;
            if ((var71 & 0x4) != 0) {
                var74 = var5.method8477();
            }
            this.field2540[var70] = var67 + var72;
            this.field2511[var70] = var68 + var73;
            this.field2512[var70] = var69 + var74;
            var67 = this.field2540[var70];
            var68 = this.field2511[var70];
            var69 = this.field2512[var70];
            if (var17 == 1) {
                this.field2510[var70] = var6.method8462();
            }
        }
        if (var18 == 1) {
            for (int var75 = 0; var75 < var9; var75++) {
                int var76 = var6.method8462();
                this.field2533[var75] = new int[var76];
                this.field2534[var75] = new int[var76];
                for (int var77 = 0; var77 < var76; var77++) {
                    this.field2533[var75][var77] = var6.method8462();
                    this.field2534[var75][var77] = var6.method8462();
                }
            }
        }
        var2.field5233 = var45;
        var3.field5233 = var33;
        var4.field5233 = var36;
        var5.field5233 = var40;
        var6.field5233 = var37;
        var7.field5233 = var43;
        var8.field5233 = var42;
        for (int var78 = 0; var78 < var10; var78++) {
            this.field2521[var78] = (short) var2.method8670();
            if (var12 == 1) {
                this.field2548[var78] = var3.method8463();
            }
            if (var13 == 255) {
                this.field2518[var78] = var4.method8463();
            }
            if (var14 == 1) {
                this.field2519[var78] = var5.method8463();
            }
            if (var15 == 1) {
                this.field2530[var78] = var6.method8462();
            }
            if (var16 == 1) {
                this.field2545[var78] = (short) (var7.method8670() - 1);
            }
            if (this.field2506 != null && this.field2545[var78] != -1) {
                this.field2506[var78] = (byte) (var8.method8462() - 1);
            }
        }
        var2.field5233 = var39;
        var3.field5233 = var32;
        int var79 = 0;
        int var80 = 0;
        int var81 = 0;
        int var82 = 0;
        for (int var83 = 0; var83 < var10; var83++) {
            int var84 = var3.method8462();
            if (var84 == 1) {
                var79 = var2.method8477() + var82;
                var80 = var2.method8477() + var79;
                var81 = var2.method8477() + var80;
                var82 = var81;
                this.field2514[var83] = var79;
                this.field2515[var83] = var80;
                this.field2516[var83] = var81;
            }
            if (var84 == 2) {
                var80 = var81;
                var81 = var2.method8477() + var82;
                var82 = var81;
                this.field2514[var83] = var79;
                this.field2515[var83] = var80;
                this.field2516[var83] = var81;
            }
            if (var84 == 3) {
                var79 = var81;
                var81 = var2.method8477() + var82;
                var82 = var81;
                this.field2514[var83] = var79;
                this.field2515[var83] = var80;
                this.field2516[var83] = var81;
            }
            if (var84 == 4) {
                int var87 = var79;
                var79 = var80;
                var80 = var87;
                var81 = var2.method8477() + var82;
                var82 = var81;
                this.field2514[var83] = var79;
                this.field2515[var83] = var87;
                this.field2516[var83] = var81;
            }
        }
        var2.field5233 = var53;
        var3.field5233 = var55;
        var4.field5233 = var57;
        var5.field5233 = var59;
        var6.field5233 = var61;
        var7.field5233 = var63;
        for (int var88 = 0; var88 < var11; var88++) {
            int var89 = this.field2525[var88] & 0xFF;
            if (var89 == 0) {
                this.field2526[var88] = (short) var2.method8670();
                this.field2527[var88] = (short) var2.method8670();
                this.field2528[var88] = (short) var2.method8670();
            }
        }
        var2.field5233 = var65;
        int var90 = var2.method8462();
        if (var90 == 0) {
            return;
        }
        new class263();
        var2.method8670();
        var2.method8670();
        var2.method8670();
        var2.method8682();
    }

    @ObfuscatedName("jj.at([B)V")
    public void method4118(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class535 var4 = new class535(arg0);
        class535 var5 = new class535(arg0);
        class535 var6 = new class535(arg0);
        class535 var7 = new class535(arg0);
        class535 var8 = new class535(arg0);
        var4.field5233 = arg0.length - 23;
        int var9 = var4.method8670();
        int var10 = var4.method8670();
        int var11 = var4.method8462();
        int var12 = var4.method8462();
        int var13 = var4.method8462();
        int var14 = var4.method8462();
        int var15 = var4.method8462();
        int var16 = var4.method8462();
        int var17 = var4.method8462();
        int var18 = var4.method8670();
        int var19 = var4.method8670();
        int var20 = var4.method8670();
        int var21 = var4.method8670();
        int var22 = var4.method8670();
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
        this.field2509 = var9;
        this.field2513 = var10;
        this.field2535 = var11;
        this.field2540 = new int[var9];
        this.field2511 = new int[var9];
        this.field2512 = new int[var9];
        this.field2514 = new int[var10];
        this.field2515 = new int[var10];
        this.field2516 = new int[var10];
        if (var11 > 0) {
            this.field2525 = new byte[var11];
            this.field2526 = new short[var11];
            this.field2527 = new short[var11];
            this.field2528 = new short[var11];
        }
        if (var16 == 1) {
            this.field2510 = new int[var9];
        }
        if (var12 == 1) {
            this.field2548 = new byte[var10];
            this.field2506 = new byte[var10];
            this.field2545 = new short[var10];
        }
        if (var13 == 255) {
            this.field2518 = new byte[var10];
        } else {
            this.field2523 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2519 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2530 = new int[var10];
        }
        if (var17 == 1) {
            this.field2533 = new int[var9][];
            this.field2534 = new int[var9][];
        }
        this.field2521 = new short[var10];
        var4.field5233 = var23;
        var5.field5233 = var39;
        var6.field5233 = var41;
        var7.field5233 = var43;
        var8.field5233 = var27;
        int var46 = 0;
        int var47 = 0;
        int var48 = 0;
        for (int var49 = 0; var49 < var9; var49++) {
            int var50 = var4.method8462();
            int var51 = 0;
            if ((var50 & 0x1) != 0) {
                var51 = var5.method8477();
            }
            int var52 = 0;
            if ((var50 & 0x2) != 0) {
                var52 = var6.method8477();
            }
            int var53 = 0;
            if ((var50 & 0x4) != 0) {
                var53 = var7.method8477();
            }
            this.field2540[var49] = var46 + var51;
            this.field2511[var49] = var47 + var52;
            this.field2512[var49] = var48 + var53;
            var46 = this.field2540[var49];
            var47 = this.field2511[var49];
            var48 = this.field2512[var49];
            if (var16 == 1) {
                this.field2510[var49] = var8.method8462();
            }
        }
        if (var17 == 1) {
            for (int var54 = 0; var54 < var9; var54++) {
                int var55 = var8.method8462();
                this.field2533[var54] = new int[var55];
                this.field2534[var54] = new int[var55];
                for (int var56 = 0; var56 < var55; var56++) {
                    this.field2533[var54][var56] = var8.method8462();
                    this.field2534[var54][var56] = var8.method8462();
                }
            }
        }
        var4.field5233 = var35;
        var5.field5233 = var30;
        var6.field5233 = var28;
        var7.field5233 = var33;
        var8.field5233 = var29;
        for (int var57 = 0; var57 < var10; var57++) {
            this.field2521[var57] = (short) var4.method8670();
            if (var12 == 1) {
                int var58 = var5.method8462();
                if ((var58 & 0x1) == 1) {
                    this.field2548[var57] = 1;
                    var2 = true;
                } else {
                    this.field2548[var57] = 0;
                }
                if ((var58 & 0x2) == 2) {
                    this.field2506[var57] = (byte) (var58 >> 2);
                    this.field2545[var57] = this.field2521[var57];
                    this.field2521[var57] = 127;
                    if (this.field2545[var57] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field2506[var57] = -1;
                    this.field2545[var57] = -1;
                }
            }
            if (var13 == 255) {
                this.field2518[var57] = var6.method8463();
            }
            if (var14 == 1) {
                this.field2519[var57] = var7.method8463();
            }
            if (var15 == 1) {
                this.field2530[var57] = var8.method8462();
            }
        }
        var4.field5233 = var32;
        var5.field5233 = var25;
        int var59 = 0;
        int var60 = 0;
        int var61 = 0;
        int var62 = 0;
        for (int var63 = 0; var63 < var10; var63++) {
            int var64 = var5.method8462();
            if (var64 == 1) {
                var59 = var4.method8477() + var62;
                var60 = var4.method8477() + var59;
                var61 = var4.method8477() + var60;
                var62 = var61;
                this.field2514[var63] = var59;
                this.field2515[var63] = var60;
                this.field2516[var63] = var61;
            }
            if (var64 == 2) {
                var60 = var61;
                var61 = var4.method8477() + var62;
                var62 = var61;
                this.field2514[var63] = var59;
                this.field2515[var63] = var60;
                this.field2516[var63] = var61;
            }
            if (var64 == 3) {
                var59 = var61;
                var61 = var4.method8477() + var62;
                var62 = var61;
                this.field2514[var63] = var59;
                this.field2515[var63] = var60;
                this.field2516[var63] = var61;
            }
            if (var64 == 4) {
                int var67 = var59;
                var59 = var60;
                var60 = var67;
                var61 = var4.method8477() + var62;
                var62 = var61;
                this.field2514[var63] = var59;
                this.field2515[var63] = var67;
                this.field2516[var63] = var61;
            }
        }
        var4.field5233 = var37;
        for (int var68 = 0; var68 < var11; var68++) {
            this.field2525[var68] = 0;
            this.field2526[var68] = (short) var4.method8670();
            this.field2527[var68] = (short) var4.method8670();
            this.field2528[var68] = (short) var4.method8670();
        }
        if (this.field2506 != null) {
            boolean var69 = false;
            for (int var70 = 0; var70 < var10; var70++) {
                int var71 = this.field2506[var70] & 0xFF;
                if (var71 != 255) {
                    if ((this.field2526[var71] & 0xFFFF) == this.field2514[var70] && (this.field2527[var71] & 0xFFFF) == this.field2515[var70] && (this.field2528[var71] & 0xFFFF) == this.field2516[var70]) {
                        this.field2506[var70] = -1;
                    } else {
                        var69 = true;
                    }
                }
            }
            if (!var69) {
                this.field2506 = null;
            }
        }
        if (!var3) {
            this.field2545 = null;
        }
        if (!var2) {
            this.field2548 = null;
        }
    }

    @ObfuscatedName("jj.an([B)V")
    public void method4119(byte[] arg0) {
        class535 var2 = new class535(arg0);
        class535 var3 = new class535(arg0);
        class535 var4 = new class535(arg0);
        class535 var5 = new class535(arg0);
        class535 var6 = new class535(arg0);
        class535 var7 = new class535(arg0);
        class535 var8 = new class535(arg0);
        var2.field5233 = arg0.length - 23;
        int var9 = var2.method8670();
        int var10 = var2.method8670();
        int var11 = var2.method8462();
        int var12 = var2.method8462();
        int var13 = var2.method8462();
        int var14 = var2.method8462();
        int var15 = var2.method8462();
        int var16 = var2.method8462();
        int var17 = var2.method8462();
        int var18 = var2.method8670();
        int var19 = var2.method8670();
        int var20 = var2.method8670();
        int var21 = var2.method8670();
        int var22 = var2.method8670();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field2525 = new byte[var11];
            var2.field5233 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field2525[var26] = var2.method8463();
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
        this.field2509 = var9;
        this.field2513 = var10;
        this.field2535 = var11;
        this.field2540 = new int[var9];
        this.field2511 = new int[var9];
        this.field2512 = new int[var9];
        this.field2514 = new int[var10];
        this.field2515 = new int[var10];
        this.field2516 = new int[var10];
        if (var17 == 1) {
            this.field2510 = new int[var9];
        }
        if (var12 == 1) {
            this.field2548 = new byte[var10];
        }
        if (var13 == 255) {
            this.field2518 = new byte[var10];
        } else {
            this.field2523 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2519 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2530 = new int[var10];
        }
        if (var16 == 1) {
            this.field2545 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field2506 = new byte[var10];
        }
        this.field2521 = new short[var10];
        if (var11 > 0) {
            this.field2526 = new short[var11];
            this.field2527 = new short[var11];
            this.field2528 = new short[var11];
        }
        var2.field5233 = var11;
        var3.field5233 = var44;
        var4.field5233 = var46;
        var5.field5233 = var48;
        var6.field5233 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method8462();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method8477();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method8477();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method8477();
            }
            this.field2540[var67] = var64 + var69;
            this.field2511[var67] = var65 + var70;
            this.field2512[var67] = var66 + var71;
            var64 = this.field2540[var67];
            var65 = this.field2511[var67];
            var66 = this.field2512[var67];
            if (var17 == 1) {
                this.field2510[var67] = var6.method8462();
            }
        }
        var2.field5233 = var42;
        var3.field5233 = var31;
        var4.field5233 = var34;
        var5.field5233 = var37;
        var6.field5233 = var35;
        var7.field5233 = var40;
        var8.field5233 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field2521[var72] = (short) var2.method8670();
            if (var12 == 1) {
                this.field2548[var72] = var3.method8463();
            }
            if (var13 == 255) {
                this.field2518[var72] = var4.method8463();
            }
            if (var14 == 1) {
                this.field2519[var72] = var5.method8463();
            }
            if (var15 == 1) {
                this.field2530[var72] = var6.method8462();
            }
            if (var16 == 1) {
                this.field2545[var72] = (short) (var7.method8670() - 1);
            }
            if (this.field2506 != null && this.field2545[var72] != -1) {
                this.field2506[var72] = (byte) (var8.method8462() - 1);
            }
        }
        var2.field5233 = var33;
        var3.field5233 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method8462();
            if (var78 == 1) {
                var73 = var2.method8477() + var76;
                var74 = var2.method8477() + var73;
                var75 = var2.method8477() + var74;
                var76 = var75;
                this.field2514[var77] = var73;
                this.field2515[var77] = var74;
                this.field2516[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method8477() + var76;
                var76 = var75;
                this.field2514[var77] = var73;
                this.field2515[var77] = var74;
                this.field2516[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method8477() + var76;
                var76 = var75;
                this.field2514[var77] = var73;
                this.field2515[var77] = var74;
                this.field2516[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method8477() + var76;
                var76 = var75;
                this.field2514[var77] = var73;
                this.field2515[var77] = var81;
                this.field2516[var77] = var75;
            }
        }
        var2.field5233 = var50;
        var3.field5233 = var52;
        var4.field5233 = var54;
        var5.field5233 = var56;
        var6.field5233 = var58;
        var7.field5233 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field2525[var82] & 0xFF;
            if (var83 == 0) {
                this.field2526[var82] = (short) var2.method8670();
                this.field2527[var82] = (short) var2.method8670();
                this.field2528[var82] = (short) var2.method8670();
            }
        }
        var2.field5233 = var62;
        int var84 = var2.method8462();
        if (var84 == 0) {
            return;
        }
        new class263();
        var2.method8670();
        var2.method8670();
        var2.method8670();
        var2.method8682();
    }

    @ObfuscatedName("jj.aw([B)V")
    public void method4120(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class535 var4 = new class535(arg0);
        class535 var5 = new class535(arg0);
        class535 var6 = new class535(arg0);
        class535 var7 = new class535(arg0);
        class535 var8 = new class535(arg0);
        var4.field5233 = arg0.length - 18;
        int var9 = var4.method8670();
        int var10 = var4.method8670();
        int var11 = var4.method8462();
        int var12 = var4.method8462();
        int var13 = var4.method8462();
        int var14 = var4.method8462();
        int var15 = var4.method8462();
        int var16 = var4.method8462();
        int var17 = var4.method8670();
        int var18 = var4.method8670();
        int var19 = var4.method8670();
        int var20 = var4.method8670();
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
        this.field2509 = var9;
        this.field2513 = var10;
        this.field2535 = var11;
        this.field2540 = new int[var9];
        this.field2511 = new int[var9];
        this.field2512 = new int[var9];
        this.field2514 = new int[var10];
        this.field2515 = new int[var10];
        this.field2516 = new int[var10];
        if (var11 > 0) {
            this.field2525 = new byte[var11];
            this.field2526 = new short[var11];
            this.field2527 = new short[var11];
            this.field2528 = new short[var11];
        }
        if (var16 == 1) {
            this.field2510 = new int[var9];
        }
        if (var12 == 1) {
            this.field2548 = new byte[var10];
            this.field2506 = new byte[var10];
            this.field2545 = new short[var10];
        }
        if (var13 == 255) {
            this.field2518 = new byte[var10];
        } else {
            this.field2523 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2519 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2530 = new int[var10];
        }
        this.field2521 = new short[var10];
        var4.field5233 = var21;
        var5.field5233 = var36;
        var6.field5233 = var38;
        var7.field5233 = var40;
        var8.field5233 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method8462();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method8477();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method8477();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method8477();
            }
            this.field2540[var46] = var43 + var48;
            this.field2511[var46] = var44 + var49;
            this.field2512[var46] = var45 + var50;
            var43 = this.field2540[var46];
            var44 = this.field2511[var46];
            var45 = this.field2512[var46];
            if (var16 == 1) {
                this.field2510[var46] = var8.method8462();
            }
        }
        var4.field5233 = var32;
        var5.field5233 = var28;
        var6.field5233 = var26;
        var7.field5233 = var30;
        var8.field5233 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field2521[var51] = (short) var4.method8670();
            if (var12 == 1) {
                int var52 = var5.method8462();
                if ((var52 & 0x1) == 1) {
                    this.field2548[var51] = 1;
                    var2 = true;
                } else {
                    this.field2548[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field2506[var51] = (byte) (var52 >> 2);
                    this.field2545[var51] = this.field2521[var51];
                    this.field2521[var51] = 127;
                    if (this.field2545[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field2506[var51] = -1;
                    this.field2545[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field2518[var51] = var6.method8463();
            }
            if (var14 == 1) {
                this.field2519[var51] = var7.method8463();
            }
            if (var15 == 1) {
                this.field2530[var51] = var8.method8462();
            }
        }
        var4.field5233 = var25;
        var5.field5233 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method8462();
            if (var58 == 1) {
                var53 = var4.method8477() + var56;
                var54 = var4.method8477() + var53;
                var55 = var4.method8477() + var54;
                var56 = var55;
                this.field2514[var57] = var53;
                this.field2515[var57] = var54;
                this.field2516[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method8477() + var56;
                var56 = var55;
                this.field2514[var57] = var53;
                this.field2515[var57] = var54;
                this.field2516[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method8477() + var56;
                var56 = var55;
                this.field2514[var57] = var53;
                this.field2515[var57] = var54;
                this.field2516[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method8477() + var56;
                var56 = var55;
                this.field2514[var57] = var53;
                this.field2515[var57] = var61;
                this.field2516[var57] = var55;
            }
        }
        var4.field5233 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field2525[var62] = 0;
            this.field2526[var62] = (short) var4.method8670();
            this.field2527[var62] = (short) var4.method8670();
            this.field2528[var62] = (short) var4.method8670();
        }
        if (this.field2506 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field2506[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field2526[var65] & 0xFFFF) == this.field2514[var64] && (this.field2527[var65] & 0xFFFF) == this.field2515[var64] && (this.field2528[var65] & 0xFFFF) == this.field2516[var64]) {
                        this.field2506[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field2506 = null;
            }
        }
        if (!var3) {
            this.field2545 = null;
        }
        if (!var2) {
            this.field2548 = null;
        }
    }

    public class238(class238[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        this.field2509 = 0;
        this.field2513 = 0;
        this.field2535 = 0;
        this.field2523 = -1;
        for (int var10 = 0; var10 < arg1; var10++) {
            class238 var11 = arg0[var10];
            if (var11 != null) {
                this.field2509 += var11.field2509;
                this.field2513 += var11.field2513;
                this.field2535 += var11.field2535;
                if (var11.field2518 == null) {
                    if (this.field2523 == -1) {
                        this.field2523 = var11.field2523;
                    }
                    if (this.field2523 != var11.field2523) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var11.field2548 != null;
                var5 |= var11.field2519 != null;
                var6 |= var11.field2530 != null;
                var7 |= var11.field2545 != null;
                var8 |= var11.field2506 != null;
                var9 |= var11.field2533 != null;
            }
        }
        this.field2540 = new int[this.field2509];
        this.field2511 = new int[this.field2509];
        this.field2512 = new int[this.field2509];
        this.field2510 = new int[this.field2509];
        this.field2514 = new int[this.field2513];
        this.field2515 = new int[this.field2513];
        this.field2516 = new int[this.field2513];
        if (var3) {
            this.field2548 = new byte[this.field2513];
        }
        if (var4) {
            this.field2518 = new byte[this.field2513];
        }
        if (var5) {
            this.field2519 = new byte[this.field2513];
        }
        if (var6) {
            this.field2530 = new int[this.field2513];
        }
        if (var7) {
            this.field2545 = new short[this.field2513];
        }
        if (var8) {
            this.field2506 = new byte[this.field2513];
        }
        if (var9) {
            this.field2533 = new int[this.field2509][];
            this.field2534 = new int[this.field2509][];
        }
        this.field2521 = new short[this.field2513];
        if (this.field2535 > 0) {
            this.field2525 = new byte[this.field2535];
            this.field2526 = new short[this.field2535];
            this.field2527 = new short[this.field2535];
            this.field2528 = new short[this.field2535];
        }
        this.field2509 = 0;
        this.field2513 = 0;
        this.field2535 = 0;
        for (int var12 = 0; var12 < arg1; var12++) {
            class238 var13 = arg0[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < var13.field2513; var14++) {
                    if (var3 && var13.field2548 != null) {
                        this.field2548[this.field2513] = var13.field2548[var14];
                    }
                    if (var4) {
                        if (var13.field2518 == null) {
                            this.field2518[this.field2513] = var13.field2523;
                        } else {
                            this.field2518[this.field2513] = var13.field2518[var14];
                        }
                    }
                    if (var5 && var13.field2519 != null) {
                        this.field2519[this.field2513] = var13.field2519[var14];
                    }
                    if (var6 && var13.field2530 != null) {
                        this.field2530[this.field2513] = var13.field2530[var14];
                    }
                    if (var7) {
                        if (var13.field2545 == null) {
                            this.field2545[this.field2513] = -1;
                        } else {
                            this.field2545[this.field2513] = var13.field2545[var14];
                        }
                    }
                    if (var8) {
                        if (var13.field2506 == null || var13.field2506[var14] == -1) {
                            this.field2506[this.field2513] = -1;
                        } else {
                            this.field2506[this.field2513] = (byte) (var13.field2506[var14] + this.field2535);
                        }
                    }
                    this.field2521[this.field2513] = var13.field2521[var14];
                    this.field2514[this.field2513] = this.method4117(var13, var13.field2514[var14]);
                    this.field2515[this.field2513] = this.method4117(var13, var13.field2515[var14]);
                    this.field2516[this.field2513] = this.method4117(var13, var13.field2516[var14]);
                    this.field2513++;
                }
                for (int var15 = 0; var15 < var13.field2535; var15++) {
                    byte var16 = this.field2525[this.field2535] = var13.field2525[var15];
                    if (var16 == 0) {
                        this.field2526[this.field2535] = (short) this.method4117(var13, var13.field2526[var15]);
                        this.field2527[this.field2535] = (short) this.method4117(var13, var13.field2527[var15]);
                        this.field2528[this.field2535] = (short) this.method4117(var13, var13.field2528[var15]);
                    }
                    this.field2535++;
                }
            }
        }
    }

    @ObfuscatedName("jj.ad(Ljj;I)I")
    public final int method4117(class238 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field2540[arg1];
        int var5 = arg0.field2511[arg1];
        int var6 = arg0.field2512[arg1];
        for (int var7 = 0; var7 < this.field2509; var7++) {
            if (this.field2540[var7] == var4 && this.field2511[var7] == var5 && this.field2512[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field2540[this.field2509] = var4;
            this.field2511[this.field2509] = var5;
            this.field2512[this.field2509] = var6;
            if (arg0.field2510 != null) {
                this.field2510[this.field2509] = arg0.field2510[arg1];
            }
            if (arg0.field2533 != null) {
                this.field2533[this.field2509] = arg0.field2533[arg1];
                this.field2534[this.field2509] = arg0.field2534[arg1];
            }
            var3 = this.field2509++;
        }
        return var3;
    }

    public class238(class238 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field2509 = arg0.field2509;
        this.field2513 = arg0.field2513;
        this.field2535 = arg0.field2535;
        if (arg1) {
            this.field2540 = arg0.field2540;
            this.field2511 = arg0.field2511;
            this.field2512 = arg0.field2512;
        } else {
            this.field2540 = new int[this.field2509];
            this.field2511 = new int[this.field2509];
            this.field2512 = new int[this.field2509];
            for (int var6 = 0; var6 < this.field2509; var6++) {
                this.field2540[var6] = arg0.field2540[var6];
                this.field2511[var6] = arg0.field2511[var6];
                this.field2512[var6] = arg0.field2512[var6];
            }
        }
        if (arg2) {
            this.field2521 = arg0.field2521;
        } else {
            this.field2521 = new short[this.field2513];
            for (int var7 = 0; var7 < this.field2513; var7++) {
                this.field2521[var7] = arg0.field2521[var7];
            }
        }
        if (arg3 || arg0.field2545 == null) {
            this.field2545 = arg0.field2545;
        } else {
            this.field2545 = new short[this.field2513];
            for (int var8 = 0; var8 < this.field2513; var8++) {
                this.field2545[var8] = arg0.field2545[var8];
            }
        }
        if (arg4) {
            this.field2519 = arg0.field2519;
        } else {
            this.field2519 = new byte[this.field2513];
            if (arg0.field2519 == null) {
                for (int var9 = 0; var9 < this.field2513; var9++) {
                    this.field2519[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field2513; var10++) {
                    this.field2519[var10] = arg0.field2519[var10];
                }
            }
        }
        this.field2514 = arg0.field2514;
        this.field2515 = arg0.field2515;
        this.field2516 = arg0.field2516;
        this.field2548 = arg0.field2548;
        this.field2518 = arg0.field2518;
        this.field2506 = arg0.field2506;
        this.field2523 = arg0.field2523;
        this.field2525 = arg0.field2525;
        this.field2526 = arg0.field2526;
        this.field2527 = arg0.field2527;
        this.field2528 = arg0.field2528;
        this.field2510 = arg0.field2510;
        this.field2530 = arg0.field2530;
        this.field2529 = arg0.field2529;
        this.field2520 = arg0.field2520;
        this.field2536 = arg0.field2536;
        this.field2524 = arg0.field2524;
        this.field2546 = arg0.field2546;
        this.field2533 = arg0.field2533;
        this.field2534 = arg0.field2534;
        this.field2538 = arg0.field2538;
        this.field2539 = arg0.field2539;
    }

    @ObfuscatedName("jj.al()Ljj;")
    public class238 method4123() {
        class238 var1 = new class238();
        if (this.field2548 != null) {
            var1.field2548 = new byte[this.field2513];
            for (int var2 = 0; var2 < this.field2513; var2++) {
                var1.field2548[var2] = this.field2548[var2];
            }
        }
        var1.field2509 = this.field2509;
        var1.field2513 = this.field2513;
        var1.field2535 = this.field2535;
        var1.field2540 = this.field2540;
        var1.field2511 = this.field2511;
        var1.field2512 = this.field2512;
        var1.field2514 = this.field2514;
        var1.field2515 = this.field2515;
        var1.field2516 = this.field2516;
        var1.field2518 = this.field2518;
        var1.field2519 = this.field2519;
        var1.field2506 = this.field2506;
        var1.field2521 = this.field2521;
        var1.field2545 = this.field2545;
        var1.field2523 = this.field2523;
        var1.field2525 = this.field2525;
        var1.field2526 = this.field2526;
        var1.field2527 = this.field2527;
        var1.field2528 = this.field2528;
        var1.field2510 = this.field2510;
        var1.field2530 = this.field2530;
        var1.field2529 = this.field2529;
        var1.field2520 = this.field2520;
        var1.field2536 = this.field2536;
        var1.field2524 = this.field2524;
        var1.field2538 = this.field2538;
        var1.field2539 = this.field2539;
        return var1;
    }

    @ObfuscatedName("jj.as([[IIIIZI)Ljj;")
    public class238 method4124(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method4167();
        int var7 = this.field2542 + arg1;
        int var8 = this.field2531 + arg1;
        int var9 = this.field2517 + arg3;
        int var10 = this.field2544 + arg3;
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
        class238 var15;
        if (arg4) {
            var15 = new class238();
            var15.field2509 = this.field2509;
            var15.field2513 = this.field2513;
            var15.field2535 = this.field2535;
            var15.field2540 = this.field2540;
            var15.field2512 = this.field2512;
            var15.field2514 = this.field2514;
            var15.field2515 = this.field2515;
            var15.field2516 = this.field2516;
            var15.field2548 = this.field2548;
            var15.field2518 = this.field2518;
            var15.field2519 = this.field2519;
            var15.field2506 = this.field2506;
            var15.field2521 = this.field2521;
            var15.field2545 = this.field2545;
            var15.field2523 = this.field2523;
            var15.field2525 = this.field2525;
            var15.field2526 = this.field2526;
            var15.field2527 = this.field2527;
            var15.field2528 = this.field2528;
            var15.field2510 = this.field2510;
            var15.field2530 = this.field2530;
            var15.field2529 = this.field2529;
            var15.field2520 = this.field2520;
            var15.field2538 = this.field2538;
            var15.field2539 = this.field2539;
            var15.field2511 = new int[var15.field2509];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field2509; var16++) {
                int var17 = this.field2540[var16] + arg1;
                int var18 = this.field2512[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field2511[var16] = this.field2511[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field2509; var26++) {
                int var27 = (-this.field2511[var26] << 16) / this.field2716;
                if (var27 < arg5) {
                    int var28 = this.field2540[var26] + arg1;
                    int var29 = this.field2512[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field2511[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field2511[var26];
                }
            }
        }
        var15.method4154();
        return var15;
    }

    @ObfuscatedName("jj.ag()V")
    public void method4125() {
        int var10002;
        if (this.field2510 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field2509; var3++) {
                int var4 = this.field2510[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field2529 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field2529[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field2509) {
                int var7 = this.field2510[var6];
                this.field2529[var7][var1[var7]++] = var6++;
            }
            this.field2510 = null;
        }
        if (this.field2530 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field2513; var10++) {
            int var11 = this.field2530[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field2520 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field2520[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field2513) {
            int var14 = this.field2530[var13];
            this.field2520[var14][var8[var14]++] = var13++;
        }
        this.field2530 = null;
    }

    @ObfuscatedName("jj.ai()V")
    public void method4126() {
        for (int var1 = 0; var1 < this.field2509; var1++) {
            int var2 = this.field2540[var1];
            this.field2540[var1] = this.field2512[var1];
            this.field2512[var1] = -var2;
        }
        this.method4154();
    }

    @ObfuscatedName("jj.ax()V")
    public void method4122() {
        for (int var1 = 0; var1 < this.field2509; var1++) {
            this.field2540[var1] = -this.field2540[var1];
            this.field2512[var1] = -this.field2512[var1];
        }
        this.method4154();
    }

    @ObfuscatedName("jj.ar()V")
    public void method4175() {
        for (int var1 = 0; var1 < this.field2509; var1++) {
            int var2 = this.field2512[var1];
            this.field2512[var1] = this.field2540[var1];
            this.field2540[var1] = -var2;
        }
        this.method4154();
    }

    @ObfuscatedName("jj.aj(I)V")
    public void method4129(int arg0) {
        int var2 = field2549[arg0];
        int var3 = field2507[arg0];
        for (int var4 = 0; var4 < this.field2509; var4++) {
            int var5 = this.field2540[var4] * var3 + this.field2512[var4] * var2 >> 16;
            this.field2512[var4] = this.field2512[var4] * var3 - this.field2540[var4] * var2 >> 16;
            this.field2540[var4] = var5;
        }
        this.method4154();
    }

    @ObfuscatedName("jj.au(III)V")
    public void method4130(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2509; var4++) {
            this.field2540[var4] += arg0;
            this.field2511[var4] += arg1;
            this.field2512[var4] += arg2;
        }
        this.method4154();
    }

    @ObfuscatedName("jj.ay(SS)V")
    public void method4131(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2513; var3++) {
            if (this.field2521[var3] == arg0) {
                this.field2521[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("jj.ap(SS)V")
    public void method4135(short arg0, short arg1) {
        if (this.field2545 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field2513; var3++) {
            if (this.field2545[var3] == arg0) {
                this.field2545[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("jj.av()V")
    public void method4132() {
        for (int var1 = 0; var1 < this.field2509; var1++) {
            this.field2512[var1] = -this.field2512[var1];
        }
        for (int var2 = 0; var2 < this.field2513; var2++) {
            int var3 = this.field2514[var2];
            this.field2514[var2] = this.field2516[var2];
            this.field2516[var2] = var3;
        }
        this.method4154();
    }

    @ObfuscatedName("jj.aa(III)V")
    public void method4133(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2509; var4++) {
            this.field2540[var4] = this.field2540[var4] * arg0 / 128;
            this.field2511[var4] = this.field2511[var4] * arg1 / 128;
            this.field2512[var4] = this.field2512[var4] * arg2 / 128;
        }
        this.method4154();
    }

    @ObfuscatedName("jj.aq()V")
    public void method4173() {
        if (this.field2536 != null) {
            return;
        }
        this.field2536 = new class258[this.field2509];
        for (int var1 = 0; var1 < this.field2509; var1++) {
            this.field2536[var1] = new class258();
        }
        for (int var2 = 0; var2 < this.field2513; var2++) {
            int var3 = this.field2514[var2];
            int var4 = this.field2515[var2];
            int var5 = this.field2516[var2];
            int var6 = this.field2540[var4] - this.field2540[var3];
            int var7 = this.field2511[var4] - this.field2511[var3];
            int var8 = this.field2512[var4] - this.field2512[var3];
            int var9 = this.field2540[var5] - this.field2540[var3];
            int var10 = this.field2511[var5] - this.field2511[var3];
            int var11 = this.field2512[var5] - this.field2512[var3];
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
            if (this.field2548 == null) {
                var19 = 0;
            } else {
                var19 = this.field2548[var2];
            }
            if (var19 == 0) {
                class258 var20 = this.field2536[var3];
                var20.field2873 += var16;
                var20.field2871 += var17;
                var20.field2872 += var18;
                var20.field2870++;
                class258 var21 = this.field2536[var4];
                var21.field2873 += var16;
                var21.field2871 += var17;
                var21.field2872 += var18;
                var21.field2870++;
                class258 var22 = this.field2536[var5];
                var22.field2873 += var16;
                var22.field2871 += var17;
                var22.field2872 += var18;
                var22.field2870++;
            } else if (var19 == 1) {
                if (this.field2524 == null) {
                    this.field2524 = new class250[this.field2513];
                }
                class250 var23 = this.field2524[var2] = new class250();
                var23.field2721 = var16;
                var23.field2719 = var17;
                var23.field2720 = var18;
            }
        }
    }

    @ObfuscatedName("jj.am()V")
    public void method4154() {
        this.field2536 = null;
        this.field2546 = null;
        this.field2524 = null;
        this.field2508 = false;
    }

    @ObfuscatedName("jj.ac()V")
    public void method4167() {
        if (this.field2508) {
            return;
        }
        this.field2716 = 0;
        this.field2541 = 0;
        this.field2542 = 999999;
        this.field2531 = -999999;
        this.field2544 = -99999;
        this.field2517 = 99999;
        for (int var1 = 0; var1 < this.field2509; var1++) {
            int var2 = this.field2540[var1];
            int var3 = this.field2511[var1];
            int var4 = this.field2512[var1];
            if (var2 < this.field2542) {
                this.field2542 = var2;
            }
            if (var2 > this.field2531) {
                this.field2531 = var2;
            }
            if (var4 < this.field2517) {
                this.field2517 = var4;
            }
            if (var4 > this.field2544) {
                this.field2544 = var4;
            }
            if (-var3 > this.field2716) {
                this.field2716 = -var3;
            }
            if (var3 > this.field2541) {
                this.field2541 = var3;
            }
        }
        this.field2508 = true;
    }

    @ObfuscatedName("jj.ae(Ljj;Ljj;IIIZ)V")
    public static void method4137(class238 arg0, class238 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method4167();
        arg0.method4173();
        arg1.method4167();
        arg1.method4173();
        field2543++;
        int var6 = 0;
        int[] var7 = arg1.field2540;
        int var8 = arg1.field2509;
        for (int var9 = 0; var9 < arg0.field2509; var9++) {
            class258 var10 = arg0.field2536[var9];
            if (var10.field2870 != 0) {
                int var11 = arg0.field2511[var9] - arg3;
                if (var11 <= arg1.field2541) {
                    int var12 = arg0.field2540[var9] - arg2;
                    if (var12 >= arg1.field2542 && var12 <= arg1.field2531) {
                        int var13 = arg0.field2512[var9] - arg4;
                        if (var13 >= arg1.field2517 && var13 <= arg1.field2544) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class258 var15 = arg1.field2536[var14];
                                if (var7[var14] == var12 && arg1.field2512[var14] == var13 && arg1.field2511[var14] == var11 && var15.field2870 != 0) {
                                    if (arg0.field2546 == null) {
                                        arg0.field2546 = new class258[arg0.field2509];
                                    }
                                    if (arg1.field2546 == null) {
                                        arg1.field2546 = new class258[var8];
                                    }
                                    class258 var16 = arg0.field2546[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field2546[var9] = new class258(var10);
                                    }
                                    class258 var17 = arg1.field2546[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field2546[var14] = new class258(var15);
                                    }
                                    var16.field2873 += var15.field2873;
                                    var16.field2871 += var15.field2871;
                                    var16.field2872 += var15.field2872;
                                    var16.field2870 += var15.field2870;
                                    var17.field2873 += var10.field2873;
                                    var17.field2871 += var10.field2871;
                                    var17.field2872 += var10.field2872;
                                    var17.field2870 += var10.field2870;
                                    var6++;
                                    field2550[var9] = field2543;
                                    field2522[var14] = field2543;
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
        for (int var18 = 0; var18 < arg0.field2513; var18++) {
            if (field2550[arg0.field2514[var18]] == field2543 && field2550[arg0.field2515[var18]] == field2543 && field2550[arg0.field2516[var18]] == field2543) {
                if (arg0.field2548 == null) {
                    arg0.field2548 = new byte[arg0.field2513];
                }
                arg0.field2548[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field2513; var19++) {
            if (field2522[arg1.field2514[var19]] == field2543 && field2522[arg1.field2515[var19]] == field2543 && field2522[arg1.field2516[var19]] == field2543) {
                if (arg1.field2548 == null) {
                    arg1.field2548 = new byte[arg1.field2513];
                }
                arg1.field2548[var19] = 2;
            }
        }
    }

    @ObfuscatedName("jj.ak(IIIII)Ljn;")
    public final class256 method4138(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method4173();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class256 var8 = new class256();
        var8.field2793 = new int[this.field2513];
        var8.field2837 = new int[this.field2513];
        var8.field2795 = new int[this.field2513];
        if (this.field2535 > 0 && this.field2506 != null) {
            int[] var9 = new int[this.field2535];
            for (int var10 = 0; var10 < this.field2513; var10++) {
                if (this.field2506[var10] != -1) {
                    var9[this.field2506[var10] & 0xFF]++;
                }
            }
            var8.field2846 = 0;
            for (int var11 = 0; var11 < this.field2535; var11++) {
                if (var9[var11] > 0 && this.field2525[var11] == 0) {
                    var8.field2846++;
                }
            }
            var8.field2855 = new int[var8.field2846];
            var8.field2803 = new int[var8.field2846];
            var8.field2804 = new int[var8.field2846];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field2535; var13++) {
                if (var9[var13] > 0 && this.field2525[var13] == 0) {
                    var8.field2855[var12] = this.field2526[var13] & 0xFFFF;
                    var8.field2803[var12] = this.field2527[var13] & 0xFFFF;
                    var8.field2804[var12] = this.field2528[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field2798 = new byte[this.field2513];
            for (int var14 = 0; var14 < this.field2513; var14++) {
                if (this.field2506[var14] == -1) {
                    var8.field2798[var14] = -1;
                } else {
                    var8.field2798[var14] = (byte) var9[this.field2506[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field2513; var15++) {
            byte var16;
            if (this.field2548 == null) {
                var16 = 0;
            } else {
                var16 = this.field2548[var15];
            }
            byte var17;
            if (this.field2519 == null) {
                var17 = 0;
            } else {
                var17 = this.field2519[var15];
            }
            short var18;
            if (this.field2545 == null) {
                var18 = -1;
            } else {
                var18 = this.field2545[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field2521[var15] & 0xFFFF;
                    class258 var20;
                    if (this.field2546 == null || this.field2546[this.field2514[var15]] == null) {
                        var20 = this.field2536[this.field2514[var15]];
                    } else {
                        var20 = this.field2546[this.field2514[var15]];
                    }
                    int var21 = (var20.field2872 * arg4 + var20.field2873 * arg2 + var20.field2871 * arg3) / (var20.field2870 * var7) + arg0;
                    var8.field2793[var15] = method4139(var19, var21);
                    class258 var22;
                    if (this.field2546 == null || this.field2546[this.field2515[var15]] == null) {
                        var22 = this.field2536[this.field2515[var15]];
                    } else {
                        var22 = this.field2546[this.field2515[var15]];
                    }
                    int var23 = (var22.field2872 * arg4 + var22.field2873 * arg2 + var22.field2871 * arg3) / (var22.field2870 * var7) + arg0;
                    var8.field2837[var15] = method4139(var19, var23);
                    class258 var24;
                    if (this.field2546 == null || this.field2546[this.field2516[var15]] == null) {
                        var24 = this.field2536[this.field2516[var15]];
                    } else {
                        var24 = this.field2546[this.field2516[var15]];
                    }
                    int var25 = (var24.field2872 * arg4 + var24.field2873 * arg2 + var24.field2871 * arg3) / (var24.field2870 * var7) + arg0;
                    var8.field2795[var15] = method4139(var19, var25);
                } else if (var16 == 1) {
                    class250 var26 = this.field2524[var15];
                    int var27 = (var26.field2720 * arg4 + var26.field2721 * arg2 + var26.field2719 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field2793[var15] = method4139(this.field2521[var15] & 0xFFFF, var27);
                    var8.field2795[var15] = -1;
                } else if (var16 == 3) {
                    var8.field2793[var15] = 128;
                    var8.field2795[var15] = -1;
                } else {
                    var8.field2795[var15] = -2;
                }
            } else if (var16 == 0) {
                class258 var28;
                if (this.field2546 == null || this.field2546[this.field2514[var15]] == null) {
                    var28 = this.field2536[this.field2514[var15]];
                } else {
                    var28 = this.field2546[this.field2514[var15]];
                }
                int var29 = (var28.field2872 * arg4 + var28.field2873 * arg2 + var28.field2871 * arg3) / (var28.field2870 * var7) + arg0;
                var8.field2793[var15] = method4140(var29);
                class258 var30;
                if (this.field2546 == null || this.field2546[this.field2515[var15]] == null) {
                    var30 = this.field2536[this.field2515[var15]];
                } else {
                    var30 = this.field2546[this.field2515[var15]];
                }
                int var31 = (var30.field2872 * arg4 + var30.field2873 * arg2 + var30.field2871 * arg3) / (var30.field2870 * var7) + arg0;
                var8.field2837[var15] = method4140(var31);
                class258 var32;
                if (this.field2546 == null || this.field2546[this.field2516[var15]] == null) {
                    var32 = this.field2536[this.field2516[var15]];
                } else {
                    var32 = this.field2546[this.field2516[var15]];
                }
                int var33 = (var32.field2872 * arg4 + var32.field2873 * arg2 + var32.field2871 * arg3) / (var32.field2870 * var7) + arg0;
                var8.field2795[var15] = method4140(var33);
            } else if (var16 == 1) {
                class250 var34 = this.field2524[var15];
                int var35 = (var34.field2720 * arg4 + var34.field2721 * arg2 + var34.field2719 * arg3) / (var7 / 2 + var7) + arg0;
                var8.field2793[var15] = method4140(var35);
                var8.field2795[var15] = -1;
            } else {
                var8.field2795[var15] = -2;
            }
        }
        this.method4125();
        var8.field2781 = this.field2509;
        var8.field2786 = this.field2540;
        var8.field2787 = this.field2511;
        var8.field2788 = this.field2512;
        var8.field2839 = this.field2513;
        var8.field2790 = this.field2514;
        var8.field2791 = this.field2515;
        var8.field2792 = this.field2516;
        var8.field2778 = this.field2518;
        var8.field2797 = this.field2519;
        var8.field2830 = this.field2523;
        var8.field2805 = this.field2529;
        var8.field2806 = this.field2520;
        var8.field2799 = this.field2545;
        var8.field2842 = this.field2533;
        var8.field2843 = this.field2534;
        return var8;
    }

    @ObfuscatedName("jj.bp(II)I")
    public static final int method4139(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("jj.bz(I)I")
    public static final int method4140(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
