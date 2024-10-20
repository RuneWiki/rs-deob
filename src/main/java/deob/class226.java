package deob;

@ObfuscatedName("hc")
public class class226 extends class235 {

    @ObfuscatedName("hc.f")
    public int field2449 = 0;

    @ObfuscatedName("hc.b")
    public int[] field2450;

    @ObfuscatedName("hc.n")
    public int[] field2451;

    @ObfuscatedName("hc.s")
    public int[] field2473;

    @ObfuscatedName("hc.l")
    public int field2458 = 0;

    @ObfuscatedName("hc.q")
    public int[] field2454;

    @ObfuscatedName("hc.o")
    public int[] field2464;

    @ObfuscatedName("hc.r")
    public int[] field2456;

    @ObfuscatedName("hc.p")
    public byte[] field2457;

    @ObfuscatedName("hc.w")
    public byte[] field2485;

    @ObfuscatedName("hc.k")
    public byte[] field2482;

    @ObfuscatedName("hc.d")
    public byte[] field2460;

    @ObfuscatedName("hc.m")
    public short[] field2461;

    @ObfuscatedName("hc.u")
    public short[] field2462;

    @ObfuscatedName("hc.t")
    public byte field2463 = 0;

    @ObfuscatedName("hc.g")
    public int field2475;

    @ObfuscatedName("hc.x")
    public byte[] field2453;

    @ObfuscatedName("hc.a")
    public short[] field2466;

    @ObfuscatedName("hc.y")
    public short[] field2489;

    @ObfuscatedName("hc.j")
    public short[] field2468;

    @ObfuscatedName("hc.e")
    public int[] field2469;

    @ObfuscatedName("hc.z")
    public int[] field2474;

    @ObfuscatedName("hc.h")
    public int[][] field2470;

    @ObfuscatedName("hc.ae")
    public int[][] field2472;

    @ObfuscatedName("hc.aq")
    public int[][] field2465;

    @ObfuscatedName("hc.aw")
    public int[][] field2477;

    @ObfuscatedName("hc.am")
    public class236[] field2471;

    @ObfuscatedName("hc.ak")
    public class243[] field2476;

    @ObfuscatedName("hc.ao")
    public class243[] field2455;

    @ObfuscatedName("hc.aj")
    public short field2478;

    @ObfuscatedName("hc.al")
    public short field2479;

    @ObfuscatedName("hc.av")
    public boolean field2480 = false;

    @ObfuscatedName("hc.at")
    public int field2446;

    @ObfuscatedName("hc.an")
    public int field2481;

    @ObfuscatedName("hc.ay")
    public int field2483;

    @ObfuscatedName("hc.ag")
    public int field2484;

    @ObfuscatedName("hc.ah")
    public int field2490;

    @ObfuscatedName("hc.ac")
    public static int[] field2486 = new int[10000];

    @ObfuscatedName("hc.ab")
    public static int[] field2487 = new int[10000];

    @ObfuscatedName("hc.au")
    public static int field2488 = 0;

    @ObfuscatedName("hc.af")
    public static int[] field2459 = class231.field2576;

    @ObfuscatedName("hc.ad")
    public static int[] field2467 = class231.field2551;

    public class226() {
    }

    @ObfuscatedName("hc.v(Lln;II)Lhc;")
    public static class226 method4089(class316 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method5296(arg1, arg2);
        return var3 == null ? null : new class226(var3);
    }

    public class226(byte[] arg0) {
        class438 var2 = new class438(10);
        var2.method6955(-2);
        if (arg0[arg0.length - 1] == -3 && arg0[arg0.length - 2] == -1) {
            this.method4033(arg0);
        } else if (arg0[arg0.length - 1] == -2 && arg0[arg0.length - 2] == -1) {
            this.method4049(arg0);
        } else if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method4035(arg0);
        } else {
            this.method4036(arg0);
        }
    }

    @ObfuscatedName("hc.i([B)V")
    public void method4033(byte[] arg0) {
        class438 var2 = new class438(arg0);
        class438 var3 = new class438(arg0);
        class438 var4 = new class438(arg0);
        class438 var5 = new class438(arg0);
        class438 var6 = new class438(arg0);
        class438 var7 = new class438(arg0);
        class438 var8 = new class438(arg0);
        var2.field4621 = arg0.length - 26;
        int var9 = var2.method7148();
        int var10 = var2.method7148();
        int var11 = var2.method6971();
        int var12 = var2.method6971();
        int var13 = var2.method6971();
        int var14 = var2.method6971();
        int var15 = var2.method6971();
        int var16 = var2.method6971();
        int var17 = var2.method6971();
        int var18 = var2.method6971();
        int var19 = var2.method7148();
        int var20 = var2.method7148();
        int var21 = var2.method7148();
        int var22 = var2.method7148();
        int var23 = var2.method7148();
        int var24 = var2.method7148();
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        if (var11 > 0) {
            this.field2453 = new byte[var11];
            var2.field4621 = 0;
            for (int var28 = 0; var28 < var11; var28++) {
                byte var29 = this.field2453[var28] = var2.method7093();
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
        this.field2449 = var9;
        this.field2458 = var10;
        this.field2475 = var11;
        this.field2450 = new int[var9];
        this.field2451 = new int[var9];
        this.field2473 = new int[var9];
        this.field2454 = new int[var10];
        this.field2464 = new int[var10];
        this.field2456 = new int[var10];
        if (var17 == 1) {
            this.field2469 = new int[var9];
        }
        if (var12 == 1) {
            this.field2457 = new byte[var10];
        }
        if (var13 == 255) {
            this.field2485 = new byte[var10];
        } else {
            this.field2463 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2482 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2474 = new int[var10];
        }
        if (var16 == 1) {
            this.field2462 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field2460 = new byte[var10];
        }
        if (var18 == 1) {
            this.field2465 = new int[var9][];
            this.field2477 = new int[var9][];
        }
        this.field2461 = new short[var10];
        if (var11 > 0) {
            this.field2466 = new short[var11];
            this.field2489 = new short[var11];
            this.field2468 = new short[var11];
        }
        var2.field4621 = var11;
        var3.field4621 = var47;
        var4.field4621 = var49;
        var5.field4621 = var51;
        var6.field4621 = var35;
        int var67 = 0;
        int var68 = 0;
        int var69 = 0;
        for (int var70 = 0; var70 < var9; var70++) {
            int var71 = var2.method6971();
            int var72 = 0;
            if ((var71 & 0x1) != 0) {
                var72 = var3.method7024();
            }
            int var73 = 0;
            if ((var71 & 0x2) != 0) {
                var73 = var4.method7024();
            }
            int var74 = 0;
            if ((var71 & 0x4) != 0) {
                var74 = var5.method7024();
            }
            this.field2450[var70] = var67 + var72;
            this.field2451[var70] = var68 + var73;
            this.field2473[var70] = var69 + var74;
            var67 = this.field2450[var70];
            var68 = this.field2451[var70];
            var69 = this.field2473[var70];
            if (var17 == 1) {
                this.field2469[var70] = var6.method6971();
            }
        }
        if (var18 == 1) {
            for (int var75 = 0; var75 < var9; var75++) {
                int var76 = var6.method6971();
                this.field2465[var75] = new int[var76];
                this.field2477[var75] = new int[var76];
                for (int var77 = 0; var77 < var76; var77++) {
                    this.field2465[var75][var77] = var6.method6971();
                    this.field2477[var75][var77] = var6.method6971();
                }
            }
        }
        var2.field4621 = var45;
        var3.field4621 = var33;
        var4.field4621 = var36;
        var5.field4621 = var40;
        var6.field4621 = var37;
        var7.field4621 = var43;
        var8.field4621 = var42;
        for (int var78 = 0; var78 < var10; var78++) {
            this.field2461[var78] = (short) var2.method7148();
            if (var12 == 1) {
                this.field2457[var78] = var3.method7093();
            }
            if (var13 == 255) {
                this.field2485[var78] = var4.method7093();
            }
            if (var14 == 1) {
                this.field2482[var78] = var5.method7093();
            }
            if (var15 == 1) {
                this.field2474[var78] = var6.method6971();
            }
            if (var16 == 1) {
                this.field2462[var78] = (short) (var7.method7148() - 1);
            }
            if (this.field2460 != null && this.field2462[var78] != -1) {
                this.field2460[var78] = (byte) (var8.method6971() - 1);
            }
        }
        var2.field4621 = var39;
        var3.field4621 = var32;
        int var79 = 0;
        int var80 = 0;
        int var81 = 0;
        int var82 = 0;
        for (int var83 = 0; var83 < var10; var83++) {
            int var84 = var3.method6971();
            if (var84 == 1) {
                var79 = var2.method7024() + var82;
                var80 = var2.method7024() + var79;
                var81 = var2.method7024() + var80;
                var82 = var81;
                this.field2454[var83] = var79;
                this.field2464[var83] = var80;
                this.field2456[var83] = var81;
            }
            if (var84 == 2) {
                var80 = var81;
                var81 = var2.method7024() + var82;
                var82 = var81;
                this.field2454[var83] = var79;
                this.field2464[var83] = var80;
                this.field2456[var83] = var81;
            }
            if (var84 == 3) {
                var79 = var81;
                var81 = var2.method7024() + var82;
                var82 = var81;
                this.field2454[var83] = var79;
                this.field2464[var83] = var80;
                this.field2456[var83] = var81;
            }
            if (var84 == 4) {
                int var87 = var79;
                var79 = var80;
                var80 = var87;
                var81 = var2.method7024() + var82;
                var82 = var81;
                this.field2454[var83] = var79;
                this.field2464[var83] = var87;
                this.field2456[var83] = var81;
            }
        }
        var2.field4621 = var53;
        var3.field4621 = var55;
        var4.field4621 = var57;
        var5.field4621 = var59;
        var6.field4621 = var61;
        var7.field4621 = var63;
        for (int var88 = 0; var88 < var11; var88++) {
            int var89 = this.field2453[var88] & 0xFF;
            if (var89 == 0) {
                this.field2466[var88] = (short) var2.method7148();
                this.field2489[var88] = (short) var2.method7148();
                this.field2468[var88] = (short) var2.method7148();
            }
        }
        var2.field4621 = var65;
        int var90 = var2.method6971();
        if (var90 == 0) {
            return;
        }
        new class245();
        var2.method7148();
        var2.method7148();
        var2.method7148();
        var2.method6976();
    }

    @ObfuscatedName("hc.f([B)V")
    public void method4049(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class438 var4 = new class438(arg0);
        class438 var5 = new class438(arg0);
        class438 var6 = new class438(arg0);
        class438 var7 = new class438(arg0);
        class438 var8 = new class438(arg0);
        var4.field4621 = arg0.length - 23;
        int var9 = var4.method7148();
        int var10 = var4.method7148();
        int var11 = var4.method6971();
        int var12 = var4.method6971();
        int var13 = var4.method6971();
        int var14 = var4.method6971();
        int var15 = var4.method6971();
        int var16 = var4.method6971();
        int var17 = var4.method6971();
        int var18 = var4.method7148();
        int var19 = var4.method7148();
        int var20 = var4.method7148();
        int var21 = var4.method7148();
        int var22 = var4.method7148();
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
        this.field2449 = var9;
        this.field2458 = var10;
        this.field2475 = var11;
        this.field2450 = new int[var9];
        this.field2451 = new int[var9];
        this.field2473 = new int[var9];
        this.field2454 = new int[var10];
        this.field2464 = new int[var10];
        this.field2456 = new int[var10];
        if (var11 > 0) {
            this.field2453 = new byte[var11];
            this.field2466 = new short[var11];
            this.field2489 = new short[var11];
            this.field2468 = new short[var11];
        }
        if (var16 == 1) {
            this.field2469 = new int[var9];
        }
        if (var12 == 1) {
            this.field2457 = new byte[var10];
            this.field2460 = new byte[var10];
            this.field2462 = new short[var10];
        }
        if (var13 == 255) {
            this.field2485 = new byte[var10];
        } else {
            this.field2463 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2482 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2474 = new int[var10];
        }
        if (var17 == 1) {
            this.field2465 = new int[var9][];
            this.field2477 = new int[var9][];
        }
        this.field2461 = new short[var10];
        var4.field4621 = var23;
        var5.field4621 = var39;
        var6.field4621 = var41;
        var7.field4621 = var43;
        var8.field4621 = var27;
        int var46 = 0;
        int var47 = 0;
        int var48 = 0;
        for (int var49 = 0; var49 < var9; var49++) {
            int var50 = var4.method6971();
            int var51 = 0;
            if ((var50 & 0x1) != 0) {
                var51 = var5.method7024();
            }
            int var52 = 0;
            if ((var50 & 0x2) != 0) {
                var52 = var6.method7024();
            }
            int var53 = 0;
            if ((var50 & 0x4) != 0) {
                var53 = var7.method7024();
            }
            this.field2450[var49] = var46 + var51;
            this.field2451[var49] = var47 + var52;
            this.field2473[var49] = var48 + var53;
            var46 = this.field2450[var49];
            var47 = this.field2451[var49];
            var48 = this.field2473[var49];
            if (var16 == 1) {
                this.field2469[var49] = var8.method6971();
            }
        }
        if (var17 == 1) {
            for (int var54 = 0; var54 < var9; var54++) {
                int var55 = var8.method6971();
                this.field2465[var54] = new int[var55];
                this.field2477[var54] = new int[var55];
                for (int var56 = 0; var56 < var55; var56++) {
                    this.field2465[var54][var56] = var8.method6971();
                    this.field2477[var54][var56] = var8.method6971();
                }
            }
        }
        var4.field4621 = var35;
        var5.field4621 = var30;
        var6.field4621 = var28;
        var7.field4621 = var33;
        var8.field4621 = var29;
        for (int var57 = 0; var57 < var10; var57++) {
            this.field2461[var57] = (short) var4.method7148();
            if (var12 == 1) {
                int var58 = var5.method6971();
                if ((var58 & 0x1) == 1) {
                    this.field2457[var57] = 1;
                    var2 = true;
                } else {
                    this.field2457[var57] = 0;
                }
                if ((var58 & 0x2) == 2) {
                    this.field2460[var57] = (byte) (var58 >> 2);
                    this.field2462[var57] = this.field2461[var57];
                    this.field2461[var57] = 127;
                    if (this.field2462[var57] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field2460[var57] = -1;
                    this.field2462[var57] = -1;
                }
            }
            if (var13 == 255) {
                this.field2485[var57] = var6.method7093();
            }
            if (var14 == 1) {
                this.field2482[var57] = var7.method7093();
            }
            if (var15 == 1) {
                this.field2474[var57] = var8.method6971();
            }
        }
        var4.field4621 = var32;
        var5.field4621 = var25;
        int var59 = 0;
        int var60 = 0;
        int var61 = 0;
        int var62 = 0;
        for (int var63 = 0; var63 < var10; var63++) {
            int var64 = var5.method6971();
            if (var64 == 1) {
                var59 = var4.method7024() + var62;
                var60 = var4.method7024() + var59;
                var61 = var4.method7024() + var60;
                var62 = var61;
                this.field2454[var63] = var59;
                this.field2464[var63] = var60;
                this.field2456[var63] = var61;
            }
            if (var64 == 2) {
                var60 = var61;
                var61 = var4.method7024() + var62;
                var62 = var61;
                this.field2454[var63] = var59;
                this.field2464[var63] = var60;
                this.field2456[var63] = var61;
            }
            if (var64 == 3) {
                var59 = var61;
                var61 = var4.method7024() + var62;
                var62 = var61;
                this.field2454[var63] = var59;
                this.field2464[var63] = var60;
                this.field2456[var63] = var61;
            }
            if (var64 == 4) {
                int var67 = var59;
                var59 = var60;
                var60 = var67;
                var61 = var4.method7024() + var62;
                var62 = var61;
                this.field2454[var63] = var59;
                this.field2464[var63] = var67;
                this.field2456[var63] = var61;
            }
        }
        var4.field4621 = var37;
        for (int var68 = 0; var68 < var11; var68++) {
            this.field2453[var68] = 0;
            this.field2466[var68] = (short) var4.method7148();
            this.field2489[var68] = (short) var4.method7148();
            this.field2468[var68] = (short) var4.method7148();
        }
        if (this.field2460 != null) {
            boolean var69 = false;
            for (int var70 = 0; var70 < var10; var70++) {
                int var71 = this.field2460[var70] & 0xFF;
                if (var71 != 255) {
                    if ((this.field2466[var71] & 0xFFFF) == this.field2454[var70] && (this.field2489[var71] & 0xFFFF) == this.field2464[var70] && (this.field2468[var71] & 0xFFFF) == this.field2456[var70]) {
                        this.field2460[var70] = -1;
                    } else {
                        var69 = true;
                    }
                }
            }
            if (!var69) {
                this.field2460 = null;
            }
        }
        if (!var3) {
            this.field2462 = null;
        }
        if (!var2) {
            this.field2457 = null;
        }
    }

    @ObfuscatedName("hc.l([B)V")
    public void method4035(byte[] arg0) {
        class438 var2 = new class438(arg0);
        class438 var3 = new class438(arg0);
        class438 var4 = new class438(arg0);
        class438 var5 = new class438(arg0);
        class438 var6 = new class438(arg0);
        class438 var7 = new class438(arg0);
        class438 var8 = new class438(arg0);
        var2.field4621 = arg0.length - 23;
        int var9 = var2.method7148();
        int var10 = var2.method7148();
        int var11 = var2.method6971();
        int var12 = var2.method6971();
        int var13 = var2.method6971();
        int var14 = var2.method6971();
        int var15 = var2.method6971();
        int var16 = var2.method6971();
        int var17 = var2.method6971();
        int var18 = var2.method7148();
        int var19 = var2.method7148();
        int var20 = var2.method7148();
        int var21 = var2.method7148();
        int var22 = var2.method7148();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field2453 = new byte[var11];
            var2.field4621 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field2453[var26] = var2.method7093();
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
        this.field2449 = var9;
        this.field2458 = var10;
        this.field2475 = var11;
        this.field2450 = new int[var9];
        this.field2451 = new int[var9];
        this.field2473 = new int[var9];
        this.field2454 = new int[var10];
        this.field2464 = new int[var10];
        this.field2456 = new int[var10];
        if (var17 == 1) {
            this.field2469 = new int[var9];
        }
        if (var12 == 1) {
            this.field2457 = new byte[var10];
        }
        if (var13 == 255) {
            this.field2485 = new byte[var10];
        } else {
            this.field2463 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2482 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2474 = new int[var10];
        }
        if (var16 == 1) {
            this.field2462 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field2460 = new byte[var10];
        }
        this.field2461 = new short[var10];
        if (var11 > 0) {
            this.field2466 = new short[var11];
            this.field2489 = new short[var11];
            this.field2468 = new short[var11];
        }
        var2.field4621 = var11;
        var3.field4621 = var44;
        var4.field4621 = var46;
        var5.field4621 = var48;
        var6.field4621 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method6971();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method7024();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method7024();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method7024();
            }
            this.field2450[var67] = var64 + var69;
            this.field2451[var67] = var65 + var70;
            this.field2473[var67] = var66 + var71;
            var64 = this.field2450[var67];
            var65 = this.field2451[var67];
            var66 = this.field2473[var67];
            if (var17 == 1) {
                this.field2469[var67] = var6.method6971();
            }
        }
        var2.field4621 = var42;
        var3.field4621 = var31;
        var4.field4621 = var34;
        var5.field4621 = var37;
        var6.field4621 = var35;
        var7.field4621 = var40;
        var8.field4621 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field2461[var72] = (short) var2.method7148();
            if (var12 == 1) {
                this.field2457[var72] = var3.method7093();
            }
            if (var13 == 255) {
                this.field2485[var72] = var4.method7093();
            }
            if (var14 == 1) {
                this.field2482[var72] = var5.method7093();
            }
            if (var15 == 1) {
                this.field2474[var72] = var6.method6971();
            }
            if (var16 == 1) {
                this.field2462[var72] = (short) (var7.method7148() - 1);
            }
            if (this.field2460 != null && this.field2462[var72] != -1) {
                this.field2460[var72] = (byte) (var8.method6971() - 1);
            }
        }
        var2.field4621 = var33;
        var3.field4621 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method6971();
            if (var78 == 1) {
                var73 = var2.method7024() + var76;
                var74 = var2.method7024() + var73;
                var75 = var2.method7024() + var74;
                var76 = var75;
                this.field2454[var77] = var73;
                this.field2464[var77] = var74;
                this.field2456[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method7024() + var76;
                var76 = var75;
                this.field2454[var77] = var73;
                this.field2464[var77] = var74;
                this.field2456[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method7024() + var76;
                var76 = var75;
                this.field2454[var77] = var73;
                this.field2464[var77] = var74;
                this.field2456[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method7024() + var76;
                var76 = var75;
                this.field2454[var77] = var73;
                this.field2464[var77] = var81;
                this.field2456[var77] = var75;
            }
        }
        var2.field4621 = var50;
        var3.field4621 = var52;
        var4.field4621 = var54;
        var5.field4621 = var56;
        var6.field4621 = var58;
        var7.field4621 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field2453[var82] & 0xFF;
            if (var83 == 0) {
                this.field2466[var82] = (short) var2.method7148();
                this.field2489[var82] = (short) var2.method7148();
                this.field2468[var82] = (short) var2.method7148();
            }
        }
        var2.field4621 = var62;
        int var84 = var2.method6971();
        if (var84 == 0) {
            return;
        }
        new class245();
        var2.method7148();
        var2.method7148();
        var2.method7148();
        var2.method6976();
    }

    @ObfuscatedName("hc.q([B)V")
    public void method4036(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class438 var4 = new class438(arg0);
        class438 var5 = new class438(arg0);
        class438 var6 = new class438(arg0);
        class438 var7 = new class438(arg0);
        class438 var8 = new class438(arg0);
        var4.field4621 = arg0.length - 18;
        int var9 = var4.method7148();
        int var10 = var4.method7148();
        int var11 = var4.method6971();
        int var12 = var4.method6971();
        int var13 = var4.method6971();
        int var14 = var4.method6971();
        int var15 = var4.method6971();
        int var16 = var4.method6971();
        int var17 = var4.method7148();
        int var18 = var4.method7148();
        int var19 = var4.method7148();
        int var20 = var4.method7148();
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
        this.field2449 = var9;
        this.field2458 = var10;
        this.field2475 = var11;
        this.field2450 = new int[var9];
        this.field2451 = new int[var9];
        this.field2473 = new int[var9];
        this.field2454 = new int[var10];
        this.field2464 = new int[var10];
        this.field2456 = new int[var10];
        if (var11 > 0) {
            this.field2453 = new byte[var11];
            this.field2466 = new short[var11];
            this.field2489 = new short[var11];
            this.field2468 = new short[var11];
        }
        if (var16 == 1) {
            this.field2469 = new int[var9];
        }
        if (var12 == 1) {
            this.field2457 = new byte[var10];
            this.field2460 = new byte[var10];
            this.field2462 = new short[var10];
        }
        if (var13 == 255) {
            this.field2485 = new byte[var10];
        } else {
            this.field2463 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2482 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2474 = new int[var10];
        }
        this.field2461 = new short[var10];
        var4.field4621 = var21;
        var5.field4621 = var36;
        var6.field4621 = var38;
        var7.field4621 = var40;
        var8.field4621 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method6971();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method7024();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method7024();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method7024();
            }
            this.field2450[var46] = var43 + var48;
            this.field2451[var46] = var44 + var49;
            this.field2473[var46] = var45 + var50;
            var43 = this.field2450[var46];
            var44 = this.field2451[var46];
            var45 = this.field2473[var46];
            if (var16 == 1) {
                this.field2469[var46] = var8.method6971();
            }
        }
        var4.field4621 = var32;
        var5.field4621 = var28;
        var6.field4621 = var26;
        var7.field4621 = var30;
        var8.field4621 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field2461[var51] = (short) var4.method7148();
            if (var12 == 1) {
                int var52 = var5.method6971();
                if ((var52 & 0x1) == 1) {
                    this.field2457[var51] = 1;
                    var2 = true;
                } else {
                    this.field2457[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field2460[var51] = (byte) (var52 >> 2);
                    this.field2462[var51] = this.field2461[var51];
                    this.field2461[var51] = 127;
                    if (this.field2462[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field2460[var51] = -1;
                    this.field2462[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field2485[var51] = var6.method7093();
            }
            if (var14 == 1) {
                this.field2482[var51] = var7.method7093();
            }
            if (var15 == 1) {
                this.field2474[var51] = var8.method6971();
            }
        }
        var4.field4621 = var25;
        var5.field4621 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method6971();
            if (var58 == 1) {
                var53 = var4.method7024() + var56;
                var54 = var4.method7024() + var53;
                var55 = var4.method7024() + var54;
                var56 = var55;
                this.field2454[var57] = var53;
                this.field2464[var57] = var54;
                this.field2456[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method7024() + var56;
                var56 = var55;
                this.field2454[var57] = var53;
                this.field2464[var57] = var54;
                this.field2456[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method7024() + var56;
                var56 = var55;
                this.field2454[var57] = var53;
                this.field2464[var57] = var54;
                this.field2456[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method7024() + var56;
                var56 = var55;
                this.field2454[var57] = var53;
                this.field2464[var57] = var61;
                this.field2456[var57] = var55;
            }
        }
        var4.field4621 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field2453[var62] = 0;
            this.field2466[var62] = (short) var4.method7148();
            this.field2489[var62] = (short) var4.method7148();
            this.field2468[var62] = (short) var4.method7148();
        }
        if (this.field2460 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field2460[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field2466[var65] & 0xFFFF) == this.field2454[var64] && (this.field2489[var65] & 0xFFFF) == this.field2464[var64] && (this.field2468[var65] & 0xFFFF) == this.field2456[var64]) {
                        this.field2460[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field2460 = null;
            }
        }
        if (!var3) {
            this.field2462 = null;
        }
        if (!var2) {
            this.field2457 = null;
        }
    }

    public class226(class226[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        this.field2449 = 0;
        this.field2458 = 0;
        this.field2475 = 0;
        this.field2463 = -1;
        for (int var10 = 0; var10 < arg1; var10++) {
            class226 var11 = arg0[var10];
            if (var11 != null) {
                this.field2449 += var11.field2449;
                this.field2458 += var11.field2458;
                this.field2475 += var11.field2475;
                if (var11.field2485 == null) {
                    if (this.field2463 == -1) {
                        this.field2463 = var11.field2463;
                    }
                    if (this.field2463 != var11.field2463) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var11.field2457 != null;
                var5 |= var11.field2482 != null;
                var6 |= var11.field2474 != null;
                var7 |= var11.field2462 != null;
                var8 |= var11.field2460 != null;
                var9 |= var11.field2465 != null;
            }
        }
        this.field2450 = new int[this.field2449];
        this.field2451 = new int[this.field2449];
        this.field2473 = new int[this.field2449];
        this.field2469 = new int[this.field2449];
        this.field2454 = new int[this.field2458];
        this.field2464 = new int[this.field2458];
        this.field2456 = new int[this.field2458];
        if (var3) {
            this.field2457 = new byte[this.field2458];
        }
        if (var4) {
            this.field2485 = new byte[this.field2458];
        }
        if (var5) {
            this.field2482 = new byte[this.field2458];
        }
        if (var6) {
            this.field2474 = new int[this.field2458];
        }
        if (var7) {
            this.field2462 = new short[this.field2458];
        }
        if (var8) {
            this.field2460 = new byte[this.field2458];
        }
        if (var9) {
            this.field2465 = new int[this.field2449][];
            this.field2477 = new int[this.field2449][];
        }
        this.field2461 = new short[this.field2458];
        if (this.field2475 > 0) {
            this.field2453 = new byte[this.field2475];
            this.field2466 = new short[this.field2475];
            this.field2489 = new short[this.field2475];
            this.field2468 = new short[this.field2475];
        }
        this.field2449 = 0;
        this.field2458 = 0;
        this.field2475 = 0;
        for (int var12 = 0; var12 < arg1; var12++) {
            class226 var13 = arg0[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < var13.field2458; var14++) {
                    if (var3 && var13.field2457 != null) {
                        this.field2457[this.field2458] = var13.field2457[var14];
                    }
                    if (var4) {
                        if (var13.field2485 == null) {
                            this.field2485[this.field2458] = var13.field2463;
                        } else {
                            this.field2485[this.field2458] = var13.field2485[var14];
                        }
                    }
                    if (var5 && var13.field2482 != null) {
                        this.field2482[this.field2458] = var13.field2482[var14];
                    }
                    if (var6 && var13.field2474 != null) {
                        this.field2474[this.field2458] = var13.field2474[var14];
                    }
                    if (var7) {
                        if (var13.field2462 == null) {
                            this.field2462[this.field2458] = -1;
                        } else {
                            this.field2462[this.field2458] = var13.field2462[var14];
                        }
                    }
                    if (var8) {
                        if (var13.field2460 == null || var13.field2460[var14] == -1) {
                            this.field2460[this.field2458] = -1;
                        } else {
                            this.field2460[this.field2458] = (byte) (var13.field2460[var14] + this.field2475);
                        }
                    }
                    this.field2461[this.field2458] = var13.field2461[var14];
                    this.field2454[this.field2458] = this.method4044(var13, var13.field2454[var14]);
                    this.field2464[this.field2458] = this.method4044(var13, var13.field2464[var14]);
                    this.field2456[this.field2458] = this.method4044(var13, var13.field2456[var14]);
                    this.field2458++;
                }
                for (int var15 = 0; var15 < var13.field2475; var15++) {
                    byte var16 = this.field2453[this.field2475] = var13.field2453[var15];
                    if (var16 == 0) {
                        this.field2466[this.field2475] = (short) this.method4044(var13, var13.field2466[var15]);
                        this.field2489[this.field2475] = (short) this.method4044(var13, var13.field2489[var15]);
                        this.field2468[this.field2475] = (short) this.method4044(var13, var13.field2468[var15]);
                    }
                    this.field2475++;
                }
            }
        }
    }

    @ObfuscatedName("hc.o(Lhc;I)I")
    public final int method4044(class226 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field2450[arg1];
        int var5 = arg0.field2451[arg1];
        int var6 = arg0.field2473[arg1];
        for (int var7 = 0; var7 < this.field2449; var7++) {
            if (this.field2450[var7] == var4 && this.field2451[var7] == var5 && this.field2473[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field2450[this.field2449] = var4;
            this.field2451[this.field2449] = var5;
            this.field2473[this.field2449] = var6;
            if (arg0.field2469 != null) {
                this.field2469[this.field2449] = arg0.field2469[arg1];
            }
            if (arg0.field2465 != null) {
                this.field2465[this.field2449] = arg0.field2465[arg1];
                this.field2477[this.field2449] = arg0.field2477[arg1];
            }
            var3 = this.field2449++;
        }
        return var3;
    }

    public class226(class226 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field2449 = arg0.field2449;
        this.field2458 = arg0.field2458;
        this.field2475 = arg0.field2475;
        if (arg1) {
            this.field2450 = arg0.field2450;
            this.field2451 = arg0.field2451;
            this.field2473 = arg0.field2473;
        } else {
            this.field2450 = new int[this.field2449];
            this.field2451 = new int[this.field2449];
            this.field2473 = new int[this.field2449];
            for (int var6 = 0; var6 < this.field2449; var6++) {
                this.field2450[var6] = arg0.field2450[var6];
                this.field2451[var6] = arg0.field2451[var6];
                this.field2473[var6] = arg0.field2473[var6];
            }
        }
        if (arg2) {
            this.field2461 = arg0.field2461;
        } else {
            this.field2461 = new short[this.field2458];
            for (int var7 = 0; var7 < this.field2458; var7++) {
                this.field2461[var7] = arg0.field2461[var7];
            }
        }
        if (arg3 || arg0.field2462 == null) {
            this.field2462 = arg0.field2462;
        } else {
            this.field2462 = new short[this.field2458];
            for (int var8 = 0; var8 < this.field2458; var8++) {
                this.field2462[var8] = arg0.field2462[var8];
            }
        }
        if (arg4) {
            this.field2482 = arg0.field2482;
        } else {
            this.field2482 = new byte[this.field2458];
            if (arg0.field2482 == null) {
                for (int var9 = 0; var9 < this.field2458; var9++) {
                    this.field2482[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field2458; var10++) {
                    this.field2482[var10] = arg0.field2482[var10];
                }
            }
        }
        this.field2454 = arg0.field2454;
        this.field2464 = arg0.field2464;
        this.field2456 = arg0.field2456;
        this.field2457 = arg0.field2457;
        this.field2485 = arg0.field2485;
        this.field2460 = arg0.field2460;
        this.field2463 = arg0.field2463;
        this.field2453 = arg0.field2453;
        this.field2466 = arg0.field2466;
        this.field2489 = arg0.field2489;
        this.field2468 = arg0.field2468;
        this.field2469 = arg0.field2469;
        this.field2474 = arg0.field2474;
        this.field2470 = arg0.field2470;
        this.field2472 = arg0.field2472;
        this.field2476 = arg0.field2476;
        this.field2471 = arg0.field2471;
        this.field2455 = arg0.field2455;
        this.field2465 = arg0.field2465;
        this.field2477 = arg0.field2477;
        this.field2478 = arg0.field2478;
        this.field2479 = arg0.field2479;
    }

    @ObfuscatedName("hc.r()Lhc;")
    public class226 method4038() {
        class226 var1 = new class226();
        if (this.field2457 != null) {
            var1.field2457 = new byte[this.field2458];
            for (int var2 = 0; var2 < this.field2458; var2++) {
                var1.field2457[var2] = this.field2457[var2];
            }
        }
        var1.field2449 = this.field2449;
        var1.field2458 = this.field2458;
        var1.field2475 = this.field2475;
        var1.field2450 = this.field2450;
        var1.field2451 = this.field2451;
        var1.field2473 = this.field2473;
        var1.field2454 = this.field2454;
        var1.field2464 = this.field2464;
        var1.field2456 = this.field2456;
        var1.field2485 = this.field2485;
        var1.field2482 = this.field2482;
        var1.field2460 = this.field2460;
        var1.field2461 = this.field2461;
        var1.field2462 = this.field2462;
        var1.field2463 = this.field2463;
        var1.field2453 = this.field2453;
        var1.field2466 = this.field2466;
        var1.field2489 = this.field2489;
        var1.field2468 = this.field2468;
        var1.field2469 = this.field2469;
        var1.field2474 = this.field2474;
        var1.field2470 = this.field2470;
        var1.field2472 = this.field2472;
        var1.field2476 = this.field2476;
        var1.field2471 = this.field2471;
        var1.field2478 = this.field2478;
        var1.field2479 = this.field2479;
        return var1;
    }

    @ObfuscatedName("hc.p([[IIIIZI)Lhc;")
    public class226 method4039(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method4052();
        int var7 = this.field2481 + arg1;
        int var8 = this.field2483 + arg1;
        int var9 = this.field2490 + arg3;
        int var10 = this.field2484 + arg3;
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
        class226 var15;
        if (arg4) {
            var15 = new class226();
            var15.field2449 = this.field2449;
            var15.field2458 = this.field2458;
            var15.field2475 = this.field2475;
            var15.field2450 = this.field2450;
            var15.field2473 = this.field2473;
            var15.field2454 = this.field2454;
            var15.field2464 = this.field2464;
            var15.field2456 = this.field2456;
            var15.field2457 = this.field2457;
            var15.field2485 = this.field2485;
            var15.field2482 = this.field2482;
            var15.field2460 = this.field2460;
            var15.field2461 = this.field2461;
            var15.field2462 = this.field2462;
            var15.field2463 = this.field2463;
            var15.field2453 = this.field2453;
            var15.field2466 = this.field2466;
            var15.field2489 = this.field2489;
            var15.field2468 = this.field2468;
            var15.field2469 = this.field2469;
            var15.field2474 = this.field2474;
            var15.field2470 = this.field2470;
            var15.field2472 = this.field2472;
            var15.field2478 = this.field2478;
            var15.field2479 = this.field2479;
            var15.field2451 = new int[var15.field2449];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field2449; var16++) {
                int var17 = this.field2450[var16] + arg1;
                int var18 = this.field2473[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field2451[var16] = this.field2451[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field2449; var26++) {
                int var27 = (-this.field2451[var26] << 16) / this.field2659;
                if (var27 < arg5) {
                    int var28 = this.field2450[var26] + arg1;
                    int var29 = this.field2473[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field2451[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field2451[var26];
                }
            }
        }
        var15.method4051();
        return var15;
    }

    @ObfuscatedName("hc.w()V")
    public void method4040() {
        int var10002;
        if (this.field2469 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field2449; var3++) {
                int var4 = this.field2469[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field2470 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field2470[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field2449) {
                int var7 = this.field2469[var6];
                this.field2470[var7][var1[var7]++] = var6++;
            }
            this.field2469 = null;
        }
        if (this.field2474 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field2458; var10++) {
            int var11 = this.field2474[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field2472 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field2472[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field2458) {
            int var14 = this.field2474[var13];
            this.field2472[var14][var8[var14]++] = var13++;
        }
        this.field2474 = null;
    }

    @ObfuscatedName("hc.k()V")
    public void method4075() {
        for (int var1 = 0; var1 < this.field2449; var1++) {
            int var2 = this.field2450[var1];
            this.field2450[var1] = this.field2473[var1];
            this.field2473[var1] = -var2;
        }
        this.method4051();
    }

    @ObfuscatedName("hc.d()V")
    public void method4042() {
        for (int var1 = 0; var1 < this.field2449; var1++) {
            this.field2450[var1] = -this.field2450[var1];
            this.field2473[var1] = -this.field2473[var1];
        }
        this.method4051();
    }

    @ObfuscatedName("hc.m()V")
    public void method4043() {
        for (int var1 = 0; var1 < this.field2449; var1++) {
            int var2 = this.field2473[var1];
            this.field2473[var1] = this.field2450[var1];
            this.field2450[var1] = -var2;
        }
        this.method4051();
    }

    @ObfuscatedName("hc.u(I)V")
    public void method4034(int arg0) {
        int var2 = field2459[arg0];
        int var3 = field2467[arg0];
        for (int var4 = 0; var4 < this.field2449; var4++) {
            int var5 = this.field2473[var4] * var2 + this.field2450[var4] * var3 >> 16;
            this.field2473[var4] = this.field2473[var4] * var3 - this.field2450[var4] * var2 >> 16;
            this.field2450[var4] = var5;
        }
        this.method4051();
    }

    @ObfuscatedName("hc.t(III)V")
    public void method4045(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2449; var4++) {
            this.field2450[var4] += arg0;
            this.field2451[var4] += arg1;
            this.field2473[var4] += arg2;
        }
        this.method4051();
    }

    @ObfuscatedName("hc.g(SS)V")
    public void method4046(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2458; var3++) {
            if (this.field2461[var3] == arg0) {
                this.field2461[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("hc.x(SS)V")
    public void method4047(short arg0, short arg1) {
        if (this.field2462 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field2458; var3++) {
            if (this.field2462[var3] == arg0) {
                this.field2462[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("hc.a()V")
    public void method4048() {
        for (int var1 = 0; var1 < this.field2449; var1++) {
            this.field2473[var1] = -this.field2473[var1];
        }
        for (int var2 = 0; var2 < this.field2458; var2++) {
            int var3 = this.field2454[var2];
            this.field2454[var2] = this.field2456[var2];
            this.field2456[var2] = var3;
        }
        this.method4051();
    }

    @ObfuscatedName("hc.y(III)V")
    public void method4080(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2449; var4++) {
            this.field2450[var4] = this.field2450[var4] * arg0 / 128;
            this.field2451[var4] = this.field2451[var4] * arg1 / 128;
            this.field2473[var4] = this.field2473[var4] * arg2 / 128;
        }
        this.method4051();
    }

    @ObfuscatedName("hc.j()V")
    public void method4050() {
        if (this.field2476 != null) {
            return;
        }
        this.field2476 = new class243[this.field2449];
        for (int var1 = 0; var1 < this.field2449; var1++) {
            this.field2476[var1] = new class243();
        }
        for (int var2 = 0; var2 < this.field2458; var2++) {
            int var3 = this.field2454[var2];
            int var4 = this.field2464[var2];
            int var5 = this.field2456[var2];
            int var6 = this.field2450[var4] - this.field2450[var3];
            int var7 = this.field2451[var4] - this.field2451[var3];
            int var8 = this.field2473[var4] - this.field2473[var3];
            int var9 = this.field2450[var5] - this.field2450[var3];
            int var10 = this.field2451[var5] - this.field2451[var3];
            int var11 = this.field2473[var5] - this.field2473[var3];
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
            if (this.field2457 == null) {
                var19 = 0;
            } else {
                var19 = this.field2457[var2];
            }
            if (var19 == 0) {
                class243 var20 = this.field2476[var3];
                var20.field2814 += var16;
                var20.field2816 += var17;
                var20.field2812 += var18;
                var20.field2815++;
                class243 var21 = this.field2476[var4];
                var21.field2814 += var16;
                var21.field2816 += var17;
                var21.field2812 += var18;
                var21.field2815++;
                class243 var22 = this.field2476[var5];
                var22.field2814 += var16;
                var22.field2816 += var17;
                var22.field2812 += var18;
                var22.field2815++;
            } else if (var19 == 1) {
                if (this.field2471 == null) {
                    this.field2471 = new class236[this.field2458];
                }
                class236 var23 = this.field2471[var2] = new class236();
                var23.field2660 = var16;
                var23.field2663 = var17;
                var23.field2662 = var18;
            }
        }
    }

    @ObfuscatedName("hc.e()V")
    public void method4051() {
        this.field2476 = null;
        this.field2455 = null;
        this.field2471 = null;
        this.field2480 = false;
    }

    @ObfuscatedName("hc.z()V")
    public void method4052() {
        if (this.field2480) {
            return;
        }
        this.field2659 = 0;
        this.field2446 = 0;
        this.field2481 = 999999;
        this.field2483 = -999999;
        this.field2484 = -99999;
        this.field2490 = 99999;
        for (int var1 = 0; var1 < this.field2449; var1++) {
            int var2 = this.field2450[var1];
            int var3 = this.field2451[var1];
            int var4 = this.field2473[var1];
            if (var2 < this.field2481) {
                this.field2481 = var2;
            }
            if (var2 > this.field2483) {
                this.field2483 = var2;
            }
            if (var4 < this.field2490) {
                this.field2490 = var4;
            }
            if (var4 > this.field2484) {
                this.field2484 = var4;
            }
            if (-var3 > this.field2659) {
                this.field2659 = -var3;
            }
            if (var3 > this.field2446) {
                this.field2446 = var3;
            }
        }
        this.field2480 = true;
    }

    @ObfuscatedName("hc.h(Lhc;Lhc;IIIZ)V")
    public static void method4053(class226 arg0, class226 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method4052();
        arg0.method4050();
        arg1.method4052();
        arg1.method4050();
        field2488++;
        int var6 = 0;
        int[] var7 = arg1.field2450;
        int var8 = arg1.field2449;
        for (int var9 = 0; var9 < arg0.field2449; var9++) {
            class243 var10 = arg0.field2476[var9];
            if (var10.field2815 != 0) {
                int var11 = arg0.field2451[var9] - arg3;
                if (var11 <= arg1.field2446) {
                    int var12 = arg0.field2450[var9] - arg2;
                    if (var12 >= arg1.field2481 && var12 <= arg1.field2483) {
                        int var13 = arg0.field2473[var9] - arg4;
                        if (var13 >= arg1.field2490 && var13 <= arg1.field2484) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class243 var15 = arg1.field2476[var14];
                                if (var7[var14] == var12 && arg1.field2473[var14] == var13 && arg1.field2451[var14] == var11 && var15.field2815 != 0) {
                                    if (arg0.field2455 == null) {
                                        arg0.field2455 = new class243[arg0.field2449];
                                    }
                                    if (arg1.field2455 == null) {
                                        arg1.field2455 = new class243[var8];
                                    }
                                    class243 var16 = arg0.field2455[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field2455[var9] = new class243(var10);
                                    }
                                    class243 var17 = arg1.field2455[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field2455[var14] = new class243(var15);
                                    }
                                    var16.field2814 += var15.field2814;
                                    var16.field2816 += var15.field2816;
                                    var16.field2812 += var15.field2812;
                                    var16.field2815 += var15.field2815;
                                    var17.field2814 += var10.field2814;
                                    var17.field2816 += var10.field2816;
                                    var17.field2812 += var10.field2812;
                                    var17.field2815 += var10.field2815;
                                    var6++;
                                    field2486[var9] = field2488;
                                    field2487[var14] = field2488;
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
        for (int var18 = 0; var18 < arg0.field2458; var18++) {
            if (field2486[arg0.field2454[var18]] == field2488 && field2486[arg0.field2464[var18]] == field2488 && field2486[arg0.field2456[var18]] == field2488) {
                if (arg0.field2457 == null) {
                    arg0.field2457 = new byte[arg0.field2458];
                }
                arg0.field2457[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field2458; var19++) {
            if (field2487[arg1.field2454[var19]] == field2488 && field2487[arg1.field2464[var19]] == field2488 && field2487[arg1.field2456[var19]] == field2488) {
                if (arg1.field2457 == null) {
                    arg1.field2457 = new byte[arg1.field2458];
                }
                arg1.field2457[var19] = 2;
            }
        }
    }

    @ObfuscatedName("hc.ae(IIIII)Liq;")
    public final class241 method4054(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method4050();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class241 var8 = new class241();
        var8.field2786 = new int[this.field2458];
        var8.field2771 = new int[this.field2458];
        var8.field2737 = new int[this.field2458];
        if (this.field2475 > 0 && this.field2460 != null) {
            int[] var9 = new int[this.field2475];
            for (int var10 = 0; var10 < this.field2458; var10++) {
                if (this.field2460[var10] != -1) {
                    var9[this.field2460[var10] & 0xFF]++;
                }
            }
            var8.field2743 = 0;
            for (int var11 = 0; var11 < this.field2475; var11++) {
                if (var9[var11] > 0 && this.field2453[var11] == 0) {
                    var8.field2743++;
                }
            }
            var8.field2744 = new int[var8.field2743];
            var8.field2745 = new int[var8.field2743];
            var8.field2795 = new int[var8.field2743];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field2475; var13++) {
                if (var9[var13] > 0 && this.field2453[var13] == 0) {
                    var8.field2744[var12] = this.field2466[var13] & 0xFFFF;
                    var8.field2745[var12] = this.field2489[var13] & 0xFFFF;
                    var8.field2795[var12] = this.field2468[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field2740 = new byte[this.field2458];
            for (int var14 = 0; var14 < this.field2458; var14++) {
                if (this.field2460[var14] == -1) {
                    var8.field2740[var14] = -1;
                } else {
                    var8.field2740[var14] = (byte) var9[this.field2460[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field2458; var15++) {
            byte var16;
            if (this.field2457 == null) {
                var16 = 0;
            } else {
                var16 = this.field2457[var15];
            }
            byte var17;
            if (this.field2482 == null) {
                var17 = 0;
            } else {
                var17 = this.field2482[var15];
            }
            short var18;
            if (this.field2462 == null) {
                var18 = -1;
            } else {
                var18 = this.field2462[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field2461[var15] & 0xFFFF;
                    class243 var20;
                    if (this.field2455 == null || this.field2455[this.field2454[var15]] == null) {
                        var20 = this.field2476[this.field2454[var15]];
                    } else {
                        var20 = this.field2455[this.field2454[var15]];
                    }
                    int var21 = (var20.field2812 * arg4 + var20.field2816 * arg3 + var20.field2814 * arg2) / (var20.field2815 * var7) + arg0;
                    var8.field2786[var15] = method4057(var19, var21);
                    class243 var22;
                    if (this.field2455 == null || this.field2455[this.field2464[var15]] == null) {
                        var22 = this.field2476[this.field2464[var15]];
                    } else {
                        var22 = this.field2455[this.field2464[var15]];
                    }
                    int var23 = (var22.field2812 * arg4 + var22.field2816 * arg3 + var22.field2814 * arg2) / (var22.field2815 * var7) + arg0;
                    var8.field2771[var15] = method4057(var19, var23);
                    class243 var24;
                    if (this.field2455 == null || this.field2455[this.field2456[var15]] == null) {
                        var24 = this.field2476[this.field2456[var15]];
                    } else {
                        var24 = this.field2455[this.field2456[var15]];
                    }
                    int var25 = (var24.field2812 * arg4 + var24.field2816 * arg3 + var24.field2814 * arg2) / (var24.field2815 * var7) + arg0;
                    var8.field2737[var15] = method4057(var19, var25);
                } else if (var16 == 1) {
                    class236 var26 = this.field2471[var15];
                    int var27 = (var26.field2662 * arg4 + var26.field2663 * arg3 + var26.field2660 * arg2) / (var7 / 2 + var7) + arg0;
                    var8.field2786[var15] = method4057(this.field2461[var15] & 0xFFFF, var27);
                    var8.field2737[var15] = -1;
                } else if (var16 == 3) {
                    var8.field2786[var15] = 128;
                    var8.field2737[var15] = -1;
                } else {
                    var8.field2737[var15] = -2;
                }
            } else if (var16 == 0) {
                class243 var28;
                if (this.field2455 == null || this.field2455[this.field2454[var15]] == null) {
                    var28 = this.field2476[this.field2454[var15]];
                } else {
                    var28 = this.field2455[this.field2454[var15]];
                }
                int var29 = (var28.field2812 * arg4 + var28.field2816 * arg3 + var28.field2814 * arg2) / (var28.field2815 * var7) + arg0;
                var8.field2786[var15] = method4056(var29);
                class243 var30;
                if (this.field2455 == null || this.field2455[this.field2464[var15]] == null) {
                    var30 = this.field2476[this.field2464[var15]];
                } else {
                    var30 = this.field2455[this.field2464[var15]];
                }
                int var31 = (var30.field2812 * arg4 + var30.field2816 * arg3 + var30.field2814 * arg2) / (var30.field2815 * var7) + arg0;
                var8.field2771[var15] = method4056(var31);
                class243 var32;
                if (this.field2455 == null || this.field2455[this.field2456[var15]] == null) {
                    var32 = this.field2476[this.field2456[var15]];
                } else {
                    var32 = this.field2455[this.field2456[var15]];
                }
                int var33 = (var32.field2812 * arg4 + var32.field2816 * arg3 + var32.field2814 * arg2) / (var32.field2815 * var7) + arg0;
                var8.field2737[var15] = method4056(var33);
            } else if (var16 == 1) {
                class236 var34 = this.field2471[var15];
                int var35 = (var34.field2662 * arg4 + var34.field2663 * arg3 + var34.field2660 * arg2) / (var7 / 2 + var7) + arg0;
                var8.field2786[var15] = method4056(var35);
                var8.field2737[var15] = -1;
            } else {
                var8.field2737[var15] = -2;
            }
        }
        this.method4040();
        var8.field2761 = this.field2449;
        var8.field2775 = this.field2450;
        var8.field2729 = this.field2451;
        var8.field2794 = this.field2473;
        var8.field2731 = this.field2458;
        var8.field2732 = this.field2454;
        var8.field2733 = this.field2464;
        var8.field2753 = this.field2456;
        var8.field2738 = this.field2485;
        var8.field2739 = this.field2482;
        var8.field2742 = this.field2463;
        var8.field2747 = this.field2470;
        var8.field2748 = this.field2472;
        var8.field2741 = this.field2462;
        var8.field2749 = this.field2465;
        var8.field2727 = this.field2477;
        return var8;
    }

    @ObfuscatedName("hc.aq(II)I")
    public static final int method4057(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("hc.aw(I)I")
    public static final int method4056(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
