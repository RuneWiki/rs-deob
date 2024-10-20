package deob;

@ObfuscatedName("jw")
public class class236 extends class247 {

    @ObfuscatedName("jw.ax")
    public int field2451 = 0;

    @ObfuscatedName("jw.ao")
    public int[] field2452;

    @ObfuscatedName("jw.ah")
    public int[] field2453;

    @ObfuscatedName("jw.ar")
    public int[] field2454;

    @ObfuscatedName("jw.ab")
    public int field2479 = 0;

    @ObfuscatedName("jw.am")
    public int[] field2456;

    @ObfuscatedName("jw.av")
    public int[] field2482;

    @ObfuscatedName("jw.ag")
    public int[] field2458;

    @ObfuscatedName("jw.aa")
    public byte[] field2489;

    @ObfuscatedName("jw.ap")
    public byte[] field2475;

    @ObfuscatedName("jw.ay")
    public byte[] field2461;

    @ObfuscatedName("jw.as")
    public byte[] field2462;

    @ObfuscatedName("jw.aj")
    public short[] field2449;

    @ObfuscatedName("jw.an")
    public short[] field2464;

    @ObfuscatedName("jw.au")
    public byte field2459 = 0;

    @ObfuscatedName("jw.ai")
    public int field2466;

    @ObfuscatedName("jw.ae")
    public byte[] field2467;

    @ObfuscatedName("jw.aw")
    public short[] field2468;

    @ObfuscatedName("jw.aq")
    public short[] field2471;

    @ObfuscatedName("jw.az")
    public short[] field2470;

    @ObfuscatedName("jw.at")
    public int[] field2457;

    @ObfuscatedName("jw.af")
    public int[] field2472;

    @ObfuscatedName("jw.ad")
    public int[][] field2455;

    @ObfuscatedName("jw.bn")
    public int[][] field2474;

    @ObfuscatedName("jw.bk")
    public int[][] field2487;

    @ObfuscatedName("jw.by")
    public int[][] field2476;

    @ObfuscatedName("jw.bd")
    public class248[] field2477;

    @ObfuscatedName("jw.be")
    public class256[] field2478;

    @ObfuscatedName("jw.bv")
    public class256[] field2448;

    @ObfuscatedName("jw.ba")
    public short field2480;

    @ObfuscatedName("jw.bz")
    public short field2481;

    @ObfuscatedName("jw.bb")
    public boolean field2469 = false;

    @ObfuscatedName("jw.bo")
    public int field2483;

    @ObfuscatedName("jw.bp")
    public int field2484;

    @ObfuscatedName("jw.bt")
    public int field2485;

    @ObfuscatedName("jw.bm")
    public int field2486;

    @ObfuscatedName("jw.br")
    public int field2465;

    @ObfuscatedName("jw.bs")
    public static int[] field2488 = new int[10000];

    @ObfuscatedName("jw.bc")
    public static int[] field2473 = new int[10000];

    @ObfuscatedName("jw.bu")
    public static int field2490 = 0;

    @ObfuscatedName("jw.bf")
    public static int[] field2491 = class241.field2553;

    @ObfuscatedName("jw.bh")
    public static int[] field2492 = class241.field2554;

    public class236() {
    }

    @ObfuscatedName("jw.ac(Lom;II)Ljw;")
    public static class236 method4058(class374 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method6342(arg1, arg2);
        return var3 == null ? null : new class236(var3);
    }

    public class236(byte[] arg0) {
        class530 var2 = new class530(10);
        var2.method8349(-2);
        if (arg0[arg0.length - 1] == -3 && arg0[arg0.length - 2] == -1) {
            this.method4059(arg0);
        } else if (arg0[arg0.length - 1] == -2 && arg0[arg0.length - 2] == -1) {
            this.method4060(arg0);
        } else if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method4131(arg0);
        } else {
            this.method4062(arg0);
        }
    }

    @ObfuscatedName("jw.ak([B)V")
    public void method4059(byte[] arg0) {
        class530 var2 = new class530(arg0);
        class530 var3 = new class530(arg0);
        class530 var4 = new class530(arg0);
        class530 var5 = new class530(arg0);
        class530 var6 = new class530(arg0);
        class530 var7 = new class530(arg0);
        class530 var8 = new class530(arg0);
        var2.field5140 = arg0.length - 26;
        int var9 = var2.method8598();
        int var10 = var2.method8598();
        int var11 = var2.method8365();
        int var12 = var2.method8365();
        int var13 = var2.method8365();
        int var14 = var2.method8365();
        int var15 = var2.method8365();
        int var16 = var2.method8365();
        int var17 = var2.method8365();
        int var18 = var2.method8365();
        int var19 = var2.method8598();
        int var20 = var2.method8598();
        int var21 = var2.method8598();
        int var22 = var2.method8598();
        int var23 = var2.method8598();
        int var24 = var2.method8598();
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        if (var11 > 0) {
            this.field2467 = new byte[var11];
            var2.field5140 = 0;
            for (int var28 = 0; var28 < var11; var28++) {
                byte var29 = this.field2467[var28] = var2.method8366();
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
        this.field2451 = var9;
        this.field2479 = var10;
        this.field2466 = var11;
        this.field2452 = new int[var9];
        this.field2453 = new int[var9];
        this.field2454 = new int[var9];
        this.field2456 = new int[var10];
        this.field2482 = new int[var10];
        this.field2458 = new int[var10];
        if (var17 == 1) {
            this.field2457 = new int[var9];
        }
        if (var12 == 1) {
            this.field2489 = new byte[var10];
        }
        if (var13 == 255) {
            this.field2475 = new byte[var10];
        } else {
            this.field2459 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2461 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2472 = new int[var10];
        }
        if (var16 == 1) {
            this.field2464 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field2462 = new byte[var10];
        }
        if (var18 == 1) {
            this.field2487 = new int[var9][];
            this.field2476 = new int[var9][];
        }
        this.field2449 = new short[var10];
        if (var11 > 0) {
            this.field2468 = new short[var11];
            this.field2471 = new short[var11];
            this.field2470 = new short[var11];
        }
        var2.field5140 = var11;
        var3.field5140 = var47;
        var4.field5140 = var49;
        var5.field5140 = var51;
        var6.field5140 = var35;
        int var67 = 0;
        int var68 = 0;
        int var69 = 0;
        for (int var70 = 0; var70 < var9; var70++) {
            int var71 = var2.method8365();
            int var72 = 0;
            if ((var71 & 0x1) != 0) {
                var72 = var3.method8480();
            }
            int var73 = 0;
            if ((var71 & 0x2) != 0) {
                var73 = var4.method8480();
            }
            int var74 = 0;
            if ((var71 & 0x4) != 0) {
                var74 = var5.method8480();
            }
            this.field2452[var70] = var67 + var72;
            this.field2453[var70] = var68 + var73;
            this.field2454[var70] = var69 + var74;
            var67 = this.field2452[var70];
            var68 = this.field2453[var70];
            var69 = this.field2454[var70];
            if (var17 == 1) {
                this.field2457[var70] = var6.method8365();
            }
        }
        if (var18 == 1) {
            for (int var75 = 0; var75 < var9; var75++) {
                int var76 = var6.method8365();
                this.field2487[var75] = new int[var76];
                this.field2476[var75] = new int[var76];
                for (int var77 = 0; var77 < var76; var77++) {
                    this.field2487[var75][var77] = var6.method8365();
                    this.field2476[var75][var77] = var6.method8365();
                }
            }
        }
        var2.field5140 = var45;
        var3.field5140 = var33;
        var4.field5140 = var36;
        var5.field5140 = var40;
        var6.field5140 = var37;
        var7.field5140 = var43;
        var8.field5140 = var42;
        for (int var78 = 0; var78 < var10; var78++) {
            this.field2449[var78] = (short) var2.method8598();
            if (var12 == 1) {
                this.field2489[var78] = var3.method8366();
            }
            if (var13 == 255) {
                this.field2475[var78] = var4.method8366();
            }
            if (var14 == 1) {
                this.field2461[var78] = var5.method8366();
            }
            if (var15 == 1) {
                this.field2472[var78] = var6.method8365();
            }
            if (var16 == 1) {
                this.field2464[var78] = (short) (var7.method8598() - 1);
            }
            if (this.field2462 != null && this.field2464[var78] != -1) {
                this.field2462[var78] = (byte) (var8.method8365() - 1);
            }
        }
        var2.field5140 = var39;
        var3.field5140 = var32;
        int var79 = 0;
        int var80 = 0;
        int var81 = 0;
        int var82 = 0;
        for (int var83 = 0; var83 < var10; var83++) {
            int var84 = var3.method8365();
            if (var84 == 1) {
                var79 = var2.method8480() + var82;
                var80 = var2.method8480() + var79;
                var81 = var2.method8480() + var80;
                var82 = var81;
                this.field2456[var83] = var79;
                this.field2482[var83] = var80;
                this.field2458[var83] = var81;
            }
            if (var84 == 2) {
                var80 = var81;
                var81 = var2.method8480() + var82;
                var82 = var81;
                this.field2456[var83] = var79;
                this.field2482[var83] = var80;
                this.field2458[var83] = var81;
            }
            if (var84 == 3) {
                var79 = var81;
                var81 = var2.method8480() + var82;
                var82 = var81;
                this.field2456[var83] = var79;
                this.field2482[var83] = var80;
                this.field2458[var83] = var81;
            }
            if (var84 == 4) {
                int var87 = var79;
                var79 = var80;
                var80 = var87;
                var81 = var2.method8480() + var82;
                var82 = var81;
                this.field2456[var83] = var79;
                this.field2482[var83] = var87;
                this.field2458[var83] = var81;
            }
        }
        var2.field5140 = var53;
        var3.field5140 = var55;
        var4.field5140 = var57;
        var5.field5140 = var59;
        var6.field5140 = var61;
        var7.field5140 = var63;
        for (int var88 = 0; var88 < var11; var88++) {
            int var89 = this.field2467[var88] & 0xFF;
            if (var89 == 0) {
                this.field2468[var88] = (short) var2.method8598();
                this.field2471[var88] = (short) var2.method8598();
                this.field2470[var88] = (short) var2.method8598();
            }
        }
        var2.field5140 = var65;
        int var90 = var2.method8365();
        if (var90 == 0) {
            return;
        }
        new class261();
        var2.method8598();
        var2.method8598();
        var2.method8598();
        var2.method8371();
    }

    @ObfuscatedName("jw.ax([B)V")
    public void method4060(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class530 var4 = new class530(arg0);
        class530 var5 = new class530(arg0);
        class530 var6 = new class530(arg0);
        class530 var7 = new class530(arg0);
        class530 var8 = new class530(arg0);
        var4.field5140 = arg0.length - 23;
        int var9 = var4.method8598();
        int var10 = var4.method8598();
        int var11 = var4.method8365();
        int var12 = var4.method8365();
        int var13 = var4.method8365();
        int var14 = var4.method8365();
        int var15 = var4.method8365();
        int var16 = var4.method8365();
        int var17 = var4.method8365();
        int var18 = var4.method8598();
        int var19 = var4.method8598();
        int var20 = var4.method8598();
        int var21 = var4.method8598();
        int var22 = var4.method8598();
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
        this.field2451 = var9;
        this.field2479 = var10;
        this.field2466 = var11;
        this.field2452 = new int[var9];
        this.field2453 = new int[var9];
        this.field2454 = new int[var9];
        this.field2456 = new int[var10];
        this.field2482 = new int[var10];
        this.field2458 = new int[var10];
        if (var11 > 0) {
            this.field2467 = new byte[var11];
            this.field2468 = new short[var11];
            this.field2471 = new short[var11];
            this.field2470 = new short[var11];
        }
        if (var16 == 1) {
            this.field2457 = new int[var9];
        }
        if (var12 == 1) {
            this.field2489 = new byte[var10];
            this.field2462 = new byte[var10];
            this.field2464 = new short[var10];
        }
        if (var13 == 255) {
            this.field2475 = new byte[var10];
        } else {
            this.field2459 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2461 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2472 = new int[var10];
        }
        if (var17 == 1) {
            this.field2487 = new int[var9][];
            this.field2476 = new int[var9][];
        }
        this.field2449 = new short[var10];
        var4.field5140 = var23;
        var5.field5140 = var39;
        var6.field5140 = var41;
        var7.field5140 = var43;
        var8.field5140 = var27;
        int var46 = 0;
        int var47 = 0;
        int var48 = 0;
        for (int var49 = 0; var49 < var9; var49++) {
            int var50 = var4.method8365();
            int var51 = 0;
            if ((var50 & 0x1) != 0) {
                var51 = var5.method8480();
            }
            int var52 = 0;
            if ((var50 & 0x2) != 0) {
                var52 = var6.method8480();
            }
            int var53 = 0;
            if ((var50 & 0x4) != 0) {
                var53 = var7.method8480();
            }
            this.field2452[var49] = var46 + var51;
            this.field2453[var49] = var47 + var52;
            this.field2454[var49] = var48 + var53;
            var46 = this.field2452[var49];
            var47 = this.field2453[var49];
            var48 = this.field2454[var49];
            if (var16 == 1) {
                this.field2457[var49] = var8.method8365();
            }
        }
        if (var17 == 1) {
            for (int var54 = 0; var54 < var9; var54++) {
                int var55 = var8.method8365();
                this.field2487[var54] = new int[var55];
                this.field2476[var54] = new int[var55];
                for (int var56 = 0; var56 < var55; var56++) {
                    this.field2487[var54][var56] = var8.method8365();
                    this.field2476[var54][var56] = var8.method8365();
                }
            }
        }
        var4.field5140 = var35;
        var5.field5140 = var30;
        var6.field5140 = var28;
        var7.field5140 = var33;
        var8.field5140 = var29;
        for (int var57 = 0; var57 < var10; var57++) {
            this.field2449[var57] = (short) var4.method8598();
            if (var12 == 1) {
                int var58 = var5.method8365();
                if ((var58 & 0x1) == 1) {
                    this.field2489[var57] = 1;
                    var2 = true;
                } else {
                    this.field2489[var57] = 0;
                }
                if ((var58 & 0x2) == 2) {
                    this.field2462[var57] = (byte) (var58 >> 2);
                    this.field2464[var57] = this.field2449[var57];
                    this.field2449[var57] = 127;
                    if (this.field2464[var57] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field2462[var57] = -1;
                    this.field2464[var57] = -1;
                }
            }
            if (var13 == 255) {
                this.field2475[var57] = var6.method8366();
            }
            if (var14 == 1) {
                this.field2461[var57] = var7.method8366();
            }
            if (var15 == 1) {
                this.field2472[var57] = var8.method8365();
            }
        }
        var4.field5140 = var32;
        var5.field5140 = var25;
        int var59 = 0;
        int var60 = 0;
        int var61 = 0;
        int var62 = 0;
        for (int var63 = 0; var63 < var10; var63++) {
            int var64 = var5.method8365();
            if (var64 == 1) {
                var59 = var4.method8480() + var62;
                var60 = var4.method8480() + var59;
                var61 = var4.method8480() + var60;
                var62 = var61;
                this.field2456[var63] = var59;
                this.field2482[var63] = var60;
                this.field2458[var63] = var61;
            }
            if (var64 == 2) {
                var60 = var61;
                var61 = var4.method8480() + var62;
                var62 = var61;
                this.field2456[var63] = var59;
                this.field2482[var63] = var60;
                this.field2458[var63] = var61;
            }
            if (var64 == 3) {
                var59 = var61;
                var61 = var4.method8480() + var62;
                var62 = var61;
                this.field2456[var63] = var59;
                this.field2482[var63] = var60;
                this.field2458[var63] = var61;
            }
            if (var64 == 4) {
                int var67 = var59;
                var59 = var60;
                var60 = var67;
                var61 = var4.method8480() + var62;
                var62 = var61;
                this.field2456[var63] = var59;
                this.field2482[var63] = var67;
                this.field2458[var63] = var61;
            }
        }
        var4.field5140 = var37;
        for (int var68 = 0; var68 < var11; var68++) {
            this.field2467[var68] = 0;
            this.field2468[var68] = (short) var4.method8598();
            this.field2471[var68] = (short) var4.method8598();
            this.field2470[var68] = (short) var4.method8598();
        }
        if (this.field2462 != null) {
            boolean var69 = false;
            for (int var70 = 0; var70 < var10; var70++) {
                int var71 = this.field2462[var70] & 0xFF;
                if (var71 != 255) {
                    if ((this.field2468[var71] & 0xFFFF) == this.field2456[var70] && (this.field2471[var71] & 0xFFFF) == this.field2482[var70] && (this.field2470[var71] & 0xFFFF) == this.field2458[var70]) {
                        this.field2462[var70] = -1;
                    } else {
                        var69 = true;
                    }
                }
            }
            if (!var69) {
                this.field2462 = null;
            }
        }
        if (!var3) {
            this.field2464 = null;
        }
        if (!var2) {
            this.field2489 = null;
        }
    }

    @ObfuscatedName("jw.ao([B)V")
    public void method4131(byte[] arg0) {
        class530 var2 = new class530(arg0);
        class530 var3 = new class530(arg0);
        class530 var4 = new class530(arg0);
        class530 var5 = new class530(arg0);
        class530 var6 = new class530(arg0);
        class530 var7 = new class530(arg0);
        class530 var8 = new class530(arg0);
        var2.field5140 = arg0.length - 23;
        int var9 = var2.method8598();
        int var10 = var2.method8598();
        int var11 = var2.method8365();
        int var12 = var2.method8365();
        int var13 = var2.method8365();
        int var14 = var2.method8365();
        int var15 = var2.method8365();
        int var16 = var2.method8365();
        int var17 = var2.method8365();
        int var18 = var2.method8598();
        int var19 = var2.method8598();
        int var20 = var2.method8598();
        int var21 = var2.method8598();
        int var22 = var2.method8598();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field2467 = new byte[var11];
            var2.field5140 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field2467[var26] = var2.method8366();
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
        this.field2451 = var9;
        this.field2479 = var10;
        this.field2466 = var11;
        this.field2452 = new int[var9];
        this.field2453 = new int[var9];
        this.field2454 = new int[var9];
        this.field2456 = new int[var10];
        this.field2482 = new int[var10];
        this.field2458 = new int[var10];
        if (var17 == 1) {
            this.field2457 = new int[var9];
        }
        if (var12 == 1) {
            this.field2489 = new byte[var10];
        }
        if (var13 == 255) {
            this.field2475 = new byte[var10];
        } else {
            this.field2459 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2461 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2472 = new int[var10];
        }
        if (var16 == 1) {
            this.field2464 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field2462 = new byte[var10];
        }
        this.field2449 = new short[var10];
        if (var11 > 0) {
            this.field2468 = new short[var11];
            this.field2471 = new short[var11];
            this.field2470 = new short[var11];
        }
        var2.field5140 = var11;
        var3.field5140 = var44;
        var4.field5140 = var46;
        var5.field5140 = var48;
        var6.field5140 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method8365();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method8480();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method8480();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method8480();
            }
            this.field2452[var67] = var64 + var69;
            this.field2453[var67] = var65 + var70;
            this.field2454[var67] = var66 + var71;
            var64 = this.field2452[var67];
            var65 = this.field2453[var67];
            var66 = this.field2454[var67];
            if (var17 == 1) {
                this.field2457[var67] = var6.method8365();
            }
        }
        var2.field5140 = var42;
        var3.field5140 = var31;
        var4.field5140 = var34;
        var5.field5140 = var37;
        var6.field5140 = var35;
        var7.field5140 = var40;
        var8.field5140 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field2449[var72] = (short) var2.method8598();
            if (var12 == 1) {
                this.field2489[var72] = var3.method8366();
            }
            if (var13 == 255) {
                this.field2475[var72] = var4.method8366();
            }
            if (var14 == 1) {
                this.field2461[var72] = var5.method8366();
            }
            if (var15 == 1) {
                this.field2472[var72] = var6.method8365();
            }
            if (var16 == 1) {
                this.field2464[var72] = (short) (var7.method8598() - 1);
            }
            if (this.field2462 != null && this.field2464[var72] != -1) {
                this.field2462[var72] = (byte) (var8.method8365() - 1);
            }
        }
        var2.field5140 = var33;
        var3.field5140 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method8365();
            if (var78 == 1) {
                var73 = var2.method8480() + var76;
                var74 = var2.method8480() + var73;
                var75 = var2.method8480() + var74;
                var76 = var75;
                this.field2456[var77] = var73;
                this.field2482[var77] = var74;
                this.field2458[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method8480() + var76;
                var76 = var75;
                this.field2456[var77] = var73;
                this.field2482[var77] = var74;
                this.field2458[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method8480() + var76;
                var76 = var75;
                this.field2456[var77] = var73;
                this.field2482[var77] = var74;
                this.field2458[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method8480() + var76;
                var76 = var75;
                this.field2456[var77] = var73;
                this.field2482[var77] = var81;
                this.field2458[var77] = var75;
            }
        }
        var2.field5140 = var50;
        var3.field5140 = var52;
        var4.field5140 = var54;
        var5.field5140 = var56;
        var6.field5140 = var58;
        var7.field5140 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field2467[var82] & 0xFF;
            if (var83 == 0) {
                this.field2468[var82] = (short) var2.method8598();
                this.field2471[var82] = (short) var2.method8598();
                this.field2470[var82] = (short) var2.method8598();
            }
        }
        var2.field5140 = var62;
        int var84 = var2.method8365();
        if (var84 == 0) {
            return;
        }
        new class261();
        var2.method8598();
        var2.method8598();
        var2.method8598();
        var2.method8371();
    }

    @ObfuscatedName("jw.ar([B)V")
    public void method4062(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class530 var4 = new class530(arg0);
        class530 var5 = new class530(arg0);
        class530 var6 = new class530(arg0);
        class530 var7 = new class530(arg0);
        class530 var8 = new class530(arg0);
        var4.field5140 = arg0.length - 18;
        int var9 = var4.method8598();
        int var10 = var4.method8598();
        int var11 = var4.method8365();
        int var12 = var4.method8365();
        int var13 = var4.method8365();
        int var14 = var4.method8365();
        int var15 = var4.method8365();
        int var16 = var4.method8365();
        int var17 = var4.method8598();
        int var18 = var4.method8598();
        int var19 = var4.method8598();
        int var20 = var4.method8598();
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
        this.field2451 = var9;
        this.field2479 = var10;
        this.field2466 = var11;
        this.field2452 = new int[var9];
        this.field2453 = new int[var9];
        this.field2454 = new int[var9];
        this.field2456 = new int[var10];
        this.field2482 = new int[var10];
        this.field2458 = new int[var10];
        if (var11 > 0) {
            this.field2467 = new byte[var11];
            this.field2468 = new short[var11];
            this.field2471 = new short[var11];
            this.field2470 = new short[var11];
        }
        if (var16 == 1) {
            this.field2457 = new int[var9];
        }
        if (var12 == 1) {
            this.field2489 = new byte[var10];
            this.field2462 = new byte[var10];
            this.field2464 = new short[var10];
        }
        if (var13 == 255) {
            this.field2475 = new byte[var10];
        } else {
            this.field2459 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2461 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2472 = new int[var10];
        }
        this.field2449 = new short[var10];
        var4.field5140 = var21;
        var5.field5140 = var36;
        var6.field5140 = var38;
        var7.field5140 = var40;
        var8.field5140 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method8365();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method8480();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method8480();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method8480();
            }
            this.field2452[var46] = var43 + var48;
            this.field2453[var46] = var44 + var49;
            this.field2454[var46] = var45 + var50;
            var43 = this.field2452[var46];
            var44 = this.field2453[var46];
            var45 = this.field2454[var46];
            if (var16 == 1) {
                this.field2457[var46] = var8.method8365();
            }
        }
        var4.field5140 = var32;
        var5.field5140 = var28;
        var6.field5140 = var26;
        var7.field5140 = var30;
        var8.field5140 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field2449[var51] = (short) var4.method8598();
            if (var12 == 1) {
                int var52 = var5.method8365();
                if ((var52 & 0x1) == 1) {
                    this.field2489[var51] = 1;
                    var2 = true;
                } else {
                    this.field2489[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field2462[var51] = (byte) (var52 >> 2);
                    this.field2464[var51] = this.field2449[var51];
                    this.field2449[var51] = 127;
                    if (this.field2464[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field2462[var51] = -1;
                    this.field2464[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field2475[var51] = var6.method8366();
            }
            if (var14 == 1) {
                this.field2461[var51] = var7.method8366();
            }
            if (var15 == 1) {
                this.field2472[var51] = var8.method8365();
            }
        }
        var4.field5140 = var25;
        var5.field5140 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method8365();
            if (var58 == 1) {
                var53 = var4.method8480() + var56;
                var54 = var4.method8480() + var53;
                var55 = var4.method8480() + var54;
                var56 = var55;
                this.field2456[var57] = var53;
                this.field2482[var57] = var54;
                this.field2458[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method8480() + var56;
                var56 = var55;
                this.field2456[var57] = var53;
                this.field2482[var57] = var54;
                this.field2458[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method8480() + var56;
                var56 = var55;
                this.field2456[var57] = var53;
                this.field2482[var57] = var54;
                this.field2458[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method8480() + var56;
                var56 = var55;
                this.field2456[var57] = var53;
                this.field2482[var57] = var61;
                this.field2458[var57] = var55;
            }
        }
        var4.field5140 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field2467[var62] = 0;
            this.field2468[var62] = (short) var4.method8598();
            this.field2471[var62] = (short) var4.method8598();
            this.field2470[var62] = (short) var4.method8598();
        }
        if (this.field2462 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field2462[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field2468[var65] & 0xFFFF) == this.field2456[var64] && (this.field2471[var65] & 0xFFFF) == this.field2482[var64] && (this.field2470[var65] & 0xFFFF) == this.field2458[var64]) {
                        this.field2462[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field2462 = null;
            }
        }
        if (!var3) {
            this.field2464 = null;
        }
        if (!var2) {
            this.field2489 = null;
        }
    }

    public class236(class236[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        this.field2451 = 0;
        this.field2479 = 0;
        this.field2466 = 0;
        this.field2459 = -1;
        for (int var10 = 0; var10 < arg1; var10++) {
            class236 var11 = arg0[var10];
            if (var11 != null) {
                this.field2451 += var11.field2451;
                this.field2479 += var11.field2479;
                this.field2466 += var11.field2466;
                if (var11.field2475 == null) {
                    if (this.field2459 == -1) {
                        this.field2459 = var11.field2459;
                    }
                    if (this.field2459 != var11.field2459) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var11.field2489 != null;
                var5 |= var11.field2461 != null;
                var6 |= var11.field2472 != null;
                var7 |= var11.field2464 != null;
                var8 |= var11.field2462 != null;
                var9 |= var11.field2487 != null;
            }
        }
        this.field2452 = new int[this.field2451];
        this.field2453 = new int[this.field2451];
        this.field2454 = new int[this.field2451];
        this.field2457 = new int[this.field2451];
        this.field2456 = new int[this.field2479];
        this.field2482 = new int[this.field2479];
        this.field2458 = new int[this.field2479];
        if (var3) {
            this.field2489 = new byte[this.field2479];
        }
        if (var4) {
            this.field2475 = new byte[this.field2479];
        }
        if (var5) {
            this.field2461 = new byte[this.field2479];
        }
        if (var6) {
            this.field2472 = new int[this.field2479];
        }
        if (var7) {
            this.field2464 = new short[this.field2479];
        }
        if (var8) {
            this.field2462 = new byte[this.field2479];
        }
        if (var9) {
            this.field2487 = new int[this.field2451][];
            this.field2476 = new int[this.field2451][];
        }
        this.field2449 = new short[this.field2479];
        if (this.field2466 > 0) {
            this.field2467 = new byte[this.field2466];
            this.field2468 = new short[this.field2466];
            this.field2471 = new short[this.field2466];
            this.field2470 = new short[this.field2466];
        }
        this.field2451 = 0;
        this.field2479 = 0;
        this.field2466 = 0;
        for (int var12 = 0; var12 < arg1; var12++) {
            class236 var13 = arg0[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < var13.field2479; var14++) {
                    if (var3 && var13.field2489 != null) {
                        this.field2489[this.field2479] = var13.field2489[var14];
                    }
                    if (var4) {
                        if (var13.field2475 == null) {
                            this.field2475[this.field2479] = var13.field2459;
                        } else {
                            this.field2475[this.field2479] = var13.field2475[var14];
                        }
                    }
                    if (var5 && var13.field2461 != null) {
                        this.field2461[this.field2479] = var13.field2461[var14];
                    }
                    if (var6 && var13.field2472 != null) {
                        this.field2472[this.field2479] = var13.field2472[var14];
                    }
                    if (var7) {
                        if (var13.field2464 == null) {
                            this.field2464[this.field2479] = -1;
                        } else {
                            this.field2464[this.field2479] = var13.field2464[var14];
                        }
                    }
                    if (var8) {
                        if (var13.field2462 == null || var13.field2462[var14] == -1) {
                            this.field2462[this.field2479] = -1;
                        } else {
                            this.field2462[this.field2479] = (byte) (var13.field2462[var14] + this.field2466);
                        }
                    }
                    this.field2449[this.field2479] = var13.field2449[var14];
                    this.field2456[this.field2479] = this.method4118(var13, var13.field2456[var14]);
                    this.field2482[this.field2479] = this.method4118(var13, var13.field2482[var14]);
                    this.field2458[this.field2479] = this.method4118(var13, var13.field2458[var14]);
                    this.field2479++;
                }
                for (int var15 = 0; var15 < var13.field2466; var15++) {
                    byte var16 = this.field2467[this.field2466] = var13.field2467[var15];
                    if (var16 == 0) {
                        this.field2468[this.field2466] = (short) this.method4118(var13, var13.field2468[var15]);
                        this.field2471[this.field2466] = (short) this.method4118(var13, var13.field2471[var15]);
                        this.field2470[this.field2466] = (short) this.method4118(var13, var13.field2470[var15]);
                    }
                    this.field2466++;
                }
            }
        }
    }

    @ObfuscatedName("jw.ab(Ljw;I)I")
    public final int method4118(class236 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field2452[arg1];
        int var5 = arg0.field2453[arg1];
        int var6 = arg0.field2454[arg1];
        for (int var7 = 0; var7 < this.field2451; var7++) {
            if (this.field2452[var7] == var4 && this.field2453[var7] == var5 && this.field2454[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field2452[this.field2451] = var4;
            this.field2453[this.field2451] = var5;
            this.field2454[this.field2451] = var6;
            if (arg0.field2457 != null) {
                this.field2457[this.field2451] = arg0.field2457[arg1];
            }
            if (arg0.field2487 != null) {
                this.field2487[this.field2451] = arg0.field2487[arg1];
                this.field2476[this.field2451] = arg0.field2476[arg1];
            }
            var3 = this.field2451++;
        }
        return var3;
    }

    public class236(class236 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field2451 = arg0.field2451;
        this.field2479 = arg0.field2479;
        this.field2466 = arg0.field2466;
        if (arg1) {
            this.field2452 = arg0.field2452;
            this.field2453 = arg0.field2453;
            this.field2454 = arg0.field2454;
        } else {
            this.field2452 = new int[this.field2451];
            this.field2453 = new int[this.field2451];
            this.field2454 = new int[this.field2451];
            for (int var6 = 0; var6 < this.field2451; var6++) {
                this.field2452[var6] = arg0.field2452[var6];
                this.field2453[var6] = arg0.field2453[var6];
                this.field2454[var6] = arg0.field2454[var6];
            }
        }
        if (arg2) {
            this.field2449 = arg0.field2449;
        } else {
            this.field2449 = new short[this.field2479];
            for (int var7 = 0; var7 < this.field2479; var7++) {
                this.field2449[var7] = arg0.field2449[var7];
            }
        }
        if (arg3 || arg0.field2464 == null) {
            this.field2464 = arg0.field2464;
        } else {
            this.field2464 = new short[this.field2479];
            for (int var8 = 0; var8 < this.field2479; var8++) {
                this.field2464[var8] = arg0.field2464[var8];
            }
        }
        if (arg4) {
            this.field2461 = arg0.field2461;
        } else {
            this.field2461 = new byte[this.field2479];
            if (arg0.field2461 == null) {
                for (int var9 = 0; var9 < this.field2479; var9++) {
                    this.field2461[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field2479; var10++) {
                    this.field2461[var10] = arg0.field2461[var10];
                }
            }
        }
        this.field2456 = arg0.field2456;
        this.field2482 = arg0.field2482;
        this.field2458 = arg0.field2458;
        this.field2489 = arg0.field2489;
        this.field2475 = arg0.field2475;
        this.field2462 = arg0.field2462;
        this.field2459 = arg0.field2459;
        this.field2467 = arg0.field2467;
        this.field2468 = arg0.field2468;
        this.field2471 = arg0.field2471;
        this.field2470 = arg0.field2470;
        this.field2457 = arg0.field2457;
        this.field2472 = arg0.field2472;
        this.field2455 = arg0.field2455;
        this.field2474 = arg0.field2474;
        this.field2478 = arg0.field2478;
        this.field2477 = arg0.field2477;
        this.field2448 = arg0.field2448;
        this.field2487 = arg0.field2487;
        this.field2476 = arg0.field2476;
        this.field2480 = arg0.field2480;
        this.field2481 = arg0.field2481;
    }

    @ObfuscatedName("jw.am()Ljw;")
    public class236 method4065() {
        class236 var1 = new class236();
        if (this.field2489 != null) {
            var1.field2489 = new byte[this.field2479];
            for (int var2 = 0; var2 < this.field2479; var2++) {
                var1.field2489[var2] = this.field2489[var2];
            }
        }
        var1.field2451 = this.field2451;
        var1.field2479 = this.field2479;
        var1.field2466 = this.field2466;
        var1.field2452 = this.field2452;
        var1.field2453 = this.field2453;
        var1.field2454 = this.field2454;
        var1.field2456 = this.field2456;
        var1.field2482 = this.field2482;
        var1.field2458 = this.field2458;
        var1.field2475 = this.field2475;
        var1.field2461 = this.field2461;
        var1.field2462 = this.field2462;
        var1.field2449 = this.field2449;
        var1.field2464 = this.field2464;
        var1.field2459 = this.field2459;
        var1.field2467 = this.field2467;
        var1.field2468 = this.field2468;
        var1.field2471 = this.field2471;
        var1.field2470 = this.field2470;
        var1.field2457 = this.field2457;
        var1.field2472 = this.field2472;
        var1.field2455 = this.field2455;
        var1.field2474 = this.field2474;
        var1.field2478 = this.field2478;
        var1.field2477 = this.field2477;
        var1.field2480 = this.field2480;
        var1.field2481 = this.field2481;
        return var1;
    }

    @ObfuscatedName("jw.av([[IIIIZI)Ljw;")
    public class236 method4085(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method4078();
        int var7 = this.field2484 + arg1;
        int var8 = this.field2485 + arg1;
        int var9 = this.field2465 + arg3;
        int var10 = this.field2486 + arg3;
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
        class236 var15;
        if (arg4) {
            var15 = new class236();
            var15.field2451 = this.field2451;
            var15.field2479 = this.field2479;
            var15.field2466 = this.field2466;
            var15.field2452 = this.field2452;
            var15.field2454 = this.field2454;
            var15.field2456 = this.field2456;
            var15.field2482 = this.field2482;
            var15.field2458 = this.field2458;
            var15.field2489 = this.field2489;
            var15.field2475 = this.field2475;
            var15.field2461 = this.field2461;
            var15.field2462 = this.field2462;
            var15.field2449 = this.field2449;
            var15.field2464 = this.field2464;
            var15.field2459 = this.field2459;
            var15.field2467 = this.field2467;
            var15.field2468 = this.field2468;
            var15.field2471 = this.field2471;
            var15.field2470 = this.field2470;
            var15.field2457 = this.field2457;
            var15.field2472 = this.field2472;
            var15.field2455 = this.field2455;
            var15.field2474 = this.field2474;
            var15.field2480 = this.field2480;
            var15.field2481 = this.field2481;
            var15.field2453 = new int[var15.field2451];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field2451; var16++) {
                int var17 = this.field2452[var16] + arg1;
                int var18 = this.field2454[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field2453[var16] = this.field2453[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field2451; var26++) {
                int var27 = (-this.field2453[var26] << 16) / this.field2662;
                if (var27 < arg5) {
                    int var28 = this.field2452[var26] + arg1;
                    int var29 = this.field2454[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field2453[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field2453[var26];
                }
            }
        }
        var15.method4077();
        return var15;
    }

    @ObfuscatedName("jw.ag()V")
    public void method4067() {
        int var10002;
        if (this.field2457 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field2451; var3++) {
                int var4 = this.field2457[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field2455 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field2455[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field2451) {
                int var7 = this.field2457[var6];
                this.field2455[var7][var1[var7]++] = var6++;
            }
            this.field2457 = null;
        }
        if (this.field2472 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field2479; var10++) {
            int var11 = this.field2472[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field2474 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field2474[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field2479) {
            int var14 = this.field2472[var13];
            this.field2474[var14][var8[var14]++] = var13++;
        }
        this.field2472 = null;
    }

    @ObfuscatedName("jw.aa()V")
    public void method4068() {
        for (int var1 = 0; var1 < this.field2451; var1++) {
            int var2 = this.field2452[var1];
            this.field2452[var1] = this.field2454[var1];
            this.field2454[var1] = -var2;
        }
        this.method4077();
    }

    @ObfuscatedName("jw.ap()V")
    public void method4076() {
        for (int var1 = 0; var1 < this.field2451; var1++) {
            this.field2452[var1] = -this.field2452[var1];
            this.field2454[var1] = -this.field2454[var1];
        }
        this.method4077();
    }

    @ObfuscatedName("jw.ay()V")
    public void method4091() {
        for (int var1 = 0; var1 < this.field2451; var1++) {
            int var2 = this.field2454[var1];
            this.field2454[var1] = this.field2452[var1];
            this.field2452[var1] = -var2;
        }
        this.method4077();
    }

    @ObfuscatedName("jw.as(I)V")
    public void method4071(int arg0) {
        int var2 = field2491[arg0];
        int var3 = field2492[arg0];
        for (int var4 = 0; var4 < this.field2451; var4++) {
            int var5 = this.field2454[var4] * var2 + this.field2452[var4] * var3 >> 16;
            this.field2454[var4] = this.field2454[var4] * var3 - this.field2452[var4] * var2 >> 16;
            this.field2452[var4] = var5;
        }
        this.method4077();
    }

    @ObfuscatedName("jw.aj(III)V")
    public void method4104(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2451; var4++) {
            this.field2452[var4] += arg0;
            this.field2453[var4] += arg1;
            this.field2454[var4] += arg2;
        }
        this.method4077();
    }

    @ObfuscatedName("jw.an(SS)V")
    public void method4132(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2479; var3++) {
            if (this.field2449[var3] == arg0) {
                this.field2449[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("jw.au(SS)V")
    public void method4074(short arg0, short arg1) {
        if (this.field2464 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field2479; var3++) {
            if (this.field2464[var3] == arg0) {
                this.field2464[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("jw.ai()V")
    public void method4075() {
        for (int var1 = 0; var1 < this.field2451; var1++) {
            this.field2454[var1] = -this.field2454[var1];
        }
        for (int var2 = 0; var2 < this.field2479; var2++) {
            int var3 = this.field2456[var2];
            this.field2456[var2] = this.field2458[var2];
            this.field2458[var2] = var3;
        }
        this.method4077();
    }

    @ObfuscatedName("jw.ae(III)V")
    public void method4113(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2451; var4++) {
            this.field2452[var4] = this.field2452[var4] * arg0 / 128;
            this.field2453[var4] = this.field2453[var4] * arg1 / 128;
            this.field2454[var4] = this.field2454[var4] * arg2 / 128;
        }
        this.method4077();
    }

    @ObfuscatedName("jw.aw()V")
    public void method4064() {
        if (this.field2478 != null) {
            return;
        }
        this.field2478 = new class256[this.field2451];
        for (int var1 = 0; var1 < this.field2451; var1++) {
            this.field2478[var1] = new class256();
        }
        for (int var2 = 0; var2 < this.field2479; var2++) {
            int var3 = this.field2456[var2];
            int var4 = this.field2482[var2];
            int var5 = this.field2458[var2];
            int var6 = this.field2452[var4] - this.field2452[var3];
            int var7 = this.field2453[var4] - this.field2453[var3];
            int var8 = this.field2454[var4] - this.field2454[var3];
            int var9 = this.field2452[var5] - this.field2452[var3];
            int var10 = this.field2453[var5] - this.field2453[var3];
            int var11 = this.field2454[var5] - this.field2454[var3];
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
            if (this.field2489 == null) {
                var19 = 0;
            } else {
                var19 = this.field2489[var2];
            }
            if (var19 == 0) {
                class256 var20 = this.field2478[var3];
                var20.field2818 += var16;
                var20.field2820 += var17;
                var20.field2819 += var18;
                var20.field2817++;
                class256 var21 = this.field2478[var4];
                var21.field2818 += var16;
                var21.field2820 += var17;
                var21.field2819 += var18;
                var21.field2817++;
                class256 var22 = this.field2478[var5];
                var22.field2818 += var16;
                var22.field2820 += var17;
                var22.field2819 += var18;
                var22.field2817++;
            } else if (var19 == 1) {
                if (this.field2477 == null) {
                    this.field2477 = new class248[this.field2479];
                }
                class248 var23 = this.field2477[var2] = new class248();
                var23.field2668 = var16;
                var23.field2664 = var17;
                var23.field2667 = var18;
            }
        }
    }

    @ObfuscatedName("jw.aq()V")
    public void method4077() {
        this.field2478 = null;
        this.field2448 = null;
        this.field2477 = null;
        this.field2469 = false;
    }

    @ObfuscatedName("jw.az()V")
    public void method4078() {
        if (this.field2469) {
            return;
        }
        this.field2662 = 0;
        this.field2483 = 0;
        this.field2484 = 999999;
        this.field2485 = -999999;
        this.field2486 = -99999;
        this.field2465 = 99999;
        for (int var1 = 0; var1 < this.field2451; var1++) {
            int var2 = this.field2452[var1];
            int var3 = this.field2453[var1];
            int var4 = this.field2454[var1];
            if (var2 < this.field2484) {
                this.field2484 = var2;
            }
            if (var2 > this.field2485) {
                this.field2485 = var2;
            }
            if (var4 < this.field2465) {
                this.field2465 = var4;
            }
            if (var4 > this.field2486) {
                this.field2486 = var4;
            }
            if (-var3 > this.field2662) {
                this.field2662 = -var3;
            }
            if (var3 > this.field2483) {
                this.field2483 = var3;
            }
        }
        this.field2469 = true;
    }

    @ObfuscatedName("jw.at(Ljw;Ljw;IIIZ)V")
    public static void method4079(class236 arg0, class236 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method4078();
        arg0.method4064();
        arg1.method4078();
        arg1.method4064();
        field2490++;
        int var6 = 0;
        int[] var7 = arg1.field2452;
        int var8 = arg1.field2451;
        for (int var9 = 0; var9 < arg0.field2451; var9++) {
            class256 var10 = arg0.field2478[var9];
            if (var10.field2817 != 0) {
                int var11 = arg0.field2453[var9] - arg3;
                if (var11 <= arg1.field2483) {
                    int var12 = arg0.field2452[var9] - arg2;
                    if (var12 >= arg1.field2484 && var12 <= arg1.field2485) {
                        int var13 = arg0.field2454[var9] - arg4;
                        if (var13 >= arg1.field2465 && var13 <= arg1.field2486) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class256 var15 = arg1.field2478[var14];
                                if (var7[var14] == var12 && arg1.field2454[var14] == var13 && arg1.field2453[var14] == var11 && var15.field2817 != 0) {
                                    if (arg0.field2448 == null) {
                                        arg0.field2448 = new class256[arg0.field2451];
                                    }
                                    if (arg1.field2448 == null) {
                                        arg1.field2448 = new class256[var8];
                                    }
                                    class256 var16 = arg0.field2448[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field2448[var9] = new class256(var10);
                                    }
                                    class256 var17 = arg1.field2448[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field2448[var14] = new class256(var15);
                                    }
                                    var16.field2818 += var15.field2818;
                                    var16.field2820 += var15.field2820;
                                    var16.field2819 += var15.field2819;
                                    var16.field2817 += var15.field2817;
                                    var17.field2818 += var10.field2818;
                                    var17.field2820 += var10.field2820;
                                    var17.field2819 += var10.field2819;
                                    var17.field2817 += var10.field2817;
                                    var6++;
                                    field2488[var9] = field2490;
                                    field2473[var14] = field2490;
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
        for (int var18 = 0; var18 < arg0.field2479; var18++) {
            if (field2488[arg0.field2456[var18]] == field2490 && field2488[arg0.field2482[var18]] == field2490 && field2488[arg0.field2458[var18]] == field2490) {
                if (arg0.field2489 == null) {
                    arg0.field2489 = new byte[arg0.field2479];
                }
                arg0.field2489[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field2479; var19++) {
            if (field2473[arg1.field2456[var19]] == field2490 && field2473[arg1.field2482[var19]] == field2490 && field2473[arg1.field2458[var19]] == field2490) {
                if (arg1.field2489 == null) {
                    arg1.field2489 = new byte[arg1.field2479];
                }
                arg1.field2489[var19] = 2;
            }
        }
    }

    @ObfuscatedName("jw.af(IIIII)Ljn;")
    public final class254 method4080(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method4064();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class254 var8 = new class254();
        var8.field2790 = new int[this.field2479];
        var8.field2741 = new int[this.field2479];
        var8.field2742 = new int[this.field2479];
        if (this.field2466 > 0 && this.field2462 != null) {
            int[] var9 = new int[this.field2466];
            for (int var10 = 0; var10 < this.field2479; var10++) {
                if (this.field2462[var10] != -1) {
                    var9[this.field2462[var10] & 0xFF]++;
                }
            }
            var8.field2748 = 0;
            for (int var11 = 0; var11 < this.field2466; var11++) {
                if (var9[var11] > 0 && this.field2467[var11] == 0) {
                    var8.field2748++;
                }
            }
            var8.field2749 = new int[var8.field2748];
            var8.field2743 = new int[var8.field2748];
            var8.field2751 = new int[var8.field2748];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field2466; var13++) {
                if (var9[var13] > 0 && this.field2467[var13] == 0) {
                    var8.field2749[var12] = this.field2468[var13] & 0xFFFF;
                    var8.field2743[var12] = this.field2471[var13] & 0xFFFF;
                    var8.field2751[var12] = this.field2470[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field2745 = new byte[this.field2479];
            for (int var14 = 0; var14 < this.field2479; var14++) {
                if (this.field2462[var14] == -1) {
                    var8.field2745[var14] = -1;
                } else {
                    var8.field2745[var14] = (byte) var9[this.field2462[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field2479; var15++) {
            byte var16;
            if (this.field2489 == null) {
                var16 = 0;
            } else {
                var16 = this.field2489[var15];
            }
            byte var17;
            if (this.field2461 == null) {
                var17 = 0;
            } else {
                var17 = this.field2461[var15];
            }
            short var18;
            if (this.field2464 == null) {
                var18 = -1;
            } else {
                var18 = this.field2464[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field2449[var15] & 0xFFFF;
                    class256 var20;
                    if (this.field2448 == null || this.field2448[this.field2456[var15]] == null) {
                        var20 = this.field2478[this.field2456[var15]];
                    } else {
                        var20 = this.field2448[this.field2456[var15]];
                    }
                    int var21 = (var20.field2819 * arg4 + var20.field2820 * arg3 + var20.field2818 * arg2) / (var20.field2817 * var7) + arg0;
                    var8.field2790[var15] = method4120(var19, var21);
                    class256 var22;
                    if (this.field2448 == null || this.field2448[this.field2482[var15]] == null) {
                        var22 = this.field2478[this.field2482[var15]];
                    } else {
                        var22 = this.field2448[this.field2482[var15]];
                    }
                    int var23 = (var22.field2819 * arg4 + var22.field2820 * arg3 + var22.field2818 * arg2) / (var22.field2817 * var7) + arg0;
                    var8.field2741[var15] = method4120(var19, var23);
                    class256 var24;
                    if (this.field2448 == null || this.field2448[this.field2458[var15]] == null) {
                        var24 = this.field2478[this.field2458[var15]];
                    } else {
                        var24 = this.field2448[this.field2458[var15]];
                    }
                    int var25 = (var24.field2819 * arg4 + var24.field2820 * arg3 + var24.field2818 * arg2) / (var24.field2817 * var7) + arg0;
                    var8.field2742[var15] = method4120(var19, var25);
                } else if (var16 == 1) {
                    class248 var26 = this.field2477[var15];
                    int var27 = (var26.field2667 * arg4 + var26.field2668 * arg2 + var26.field2664 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field2790[var15] = method4120(this.field2449[var15] & 0xFFFF, var27);
                    var8.field2742[var15] = -1;
                } else if (var16 == 3) {
                    var8.field2790[var15] = 128;
                    var8.field2742[var15] = -1;
                } else {
                    var8.field2742[var15] = -2;
                }
            } else if (var16 == 0) {
                class256 var28;
                if (this.field2448 == null || this.field2448[this.field2456[var15]] == null) {
                    var28 = this.field2478[this.field2456[var15]];
                } else {
                    var28 = this.field2448[this.field2456[var15]];
                }
                int var29 = (var28.field2819 * arg4 + var28.field2820 * arg3 + var28.field2818 * arg2) / (var28.field2817 * var7) + arg0;
                var8.field2790[var15] = method4082(var29);
                class256 var30;
                if (this.field2448 == null || this.field2448[this.field2482[var15]] == null) {
                    var30 = this.field2478[this.field2482[var15]];
                } else {
                    var30 = this.field2448[this.field2482[var15]];
                }
                int var31 = (var30.field2819 * arg4 + var30.field2820 * arg3 + var30.field2818 * arg2) / (var30.field2817 * var7) + arg0;
                var8.field2741[var15] = method4082(var31);
                class256 var32;
                if (this.field2448 == null || this.field2448[this.field2458[var15]] == null) {
                    var32 = this.field2478[this.field2458[var15]];
                } else {
                    var32 = this.field2448[this.field2458[var15]];
                }
                int var33 = (var32.field2819 * arg4 + var32.field2820 * arg3 + var32.field2818 * arg2) / (var32.field2817 * var7) + arg0;
                var8.field2742[var15] = method4082(var33);
            } else if (var16 == 1) {
                class248 var34 = this.field2477[var15];
                int var35 = (var34.field2667 * arg4 + var34.field2668 * arg2 + var34.field2664 * arg3) / (var7 / 2 + var7) + arg0;
                var8.field2790[var15] = method4082(var35);
                var8.field2742[var15] = -1;
            } else {
                var8.field2742[var15] = -2;
            }
        }
        this.method4067();
        var8.field2799 = this.field2451;
        var8.field2772 = this.field2452;
        var8.field2736 = this.field2453;
        var8.field2746 = this.field2454;
        var8.field2750 = this.field2479;
        var8.field2776 = this.field2456;
        var8.field2738 = this.field2482;
        var8.field2739 = this.field2458;
        var8.field2737 = this.field2475;
        var8.field2744 = this.field2461;
        var8.field2747 = this.field2459;
        var8.field2752 = this.field2455;
        var8.field2753 = this.field2474;
        var8.field2732 = this.field2464;
        var8.field2754 = this.field2487;
        var8.field2755 = this.field2476;
        return var8;
    }

    @ObfuscatedName("jw.ad(II)I")
    public static final int method4120(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("jw.bn(I)I")
    public static final int method4082(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
