package deob;

@ObfuscatedName("gs")
public class class206 extends class215 {

    @ObfuscatedName("gs.x")
    public int field2311 = 0;

    @ObfuscatedName("gs.h")
    public int[] field2312;

    @ObfuscatedName("gs.j")
    public int[] field2350;

    @ObfuscatedName("gs.y")
    public int[] field2314;

    @ObfuscatedName("gs.d")
    public int field2315 = 0;

    @ObfuscatedName("gs.n")
    public int[] field2316;

    @ObfuscatedName("gs.r")
    public int[] field2317;

    @ObfuscatedName("gs.l")
    public int[] field2318;

    @ObfuscatedName("gs.s")
    public byte[] field2319;

    @ObfuscatedName("gs.p")
    public byte[] field2320;

    @ObfuscatedName("gs.b")
    public byte[] field2321;

    @ObfuscatedName("gs.o")
    public byte[] field2334;

    @ObfuscatedName("gs.u")
    public short[] field2335;

    @ObfuscatedName("gs.z")
    public short[] field2310;

    @ObfuscatedName("gs.t")
    public byte field2325 = 0;

    @ObfuscatedName("gs.w")
    public int field2326;

    @ObfuscatedName("gs.m")
    public byte[] field2327;

    @ObfuscatedName("gs.q")
    public short[] field2330;

    @ObfuscatedName("gs.i")
    public short[] field2323;

    @ObfuscatedName("gs.e")
    public short[] field2352;

    @ObfuscatedName("gs.g")
    public int[] field2331;

    @ObfuscatedName("gs.k")
    public int[] field2332;

    @ObfuscatedName("gs.v")
    public int[][] field2333;

    @ObfuscatedName("gs.aj")
    public int[][] field2313;

    @ObfuscatedName("gs.an")
    public int[][] field2308;

    @ObfuscatedName("gs.ah")
    public int[][] field2336;

    @ObfuscatedName("gs.ao")
    public class216[] field2337;

    @ObfuscatedName("gs.ac")
    public class223[] field2338;

    @ObfuscatedName("gs.af")
    public class223[] field2339;

    @ObfuscatedName("gs.ad")
    public short field2340;

    @ObfuscatedName("gs.av")
    public short field2341;

    @ObfuscatedName("gs.ak")
    public boolean field2342 = false;

    @ObfuscatedName("gs.ae")
    public int field2343;

    @ObfuscatedName("gs.ap")
    public int field2344;

    @ObfuscatedName("gs.as")
    public int field2345;

    @ObfuscatedName("gs.aq")
    public int field2346;

    @ObfuscatedName("gs.al")
    public int field2347;

    @ObfuscatedName("gs.ag")
    public static int[] field2348 = new int[10000];

    @ObfuscatedName("gs.am")
    public static int[] field2349 = new int[10000];

    @ObfuscatedName("gs.az")
    public static int field2324 = 0;

    @ObfuscatedName("gs.ab")
    public static int[] field2309 = class211.field2437;

    @ObfuscatedName("gs.ai")
    public static int[] field2328 = class211.field2438;

    public class206() {
    }

    @ObfuscatedName("gs.a(Llg;II)Lgs;")
    public static class206 method3710(class330 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method5859(arg1, arg2);
        return var3 == null ? null : new class206(var3);
    }

    public class206(byte[] arg0) {
        class464 var2 = new class464(10);
        var2.method7775(-2);
        if (arg0[arg0.length - 1] == -3 && arg0[arg0.length - 2] == -1) {
            this.method3717(arg0);
        } else if (arg0[arg0.length - 1] == -2 && arg0[arg0.length - 2] == -1) {
            this.method3750(arg0);
        } else if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method3719(arg0);
        } else {
            this.method3715(arg0);
        }
    }

    @ObfuscatedName("gs.c([B)V")
    public void method3717(byte[] arg0) {
        class464 var2 = new class464(arg0);
        class464 var3 = new class464(arg0);
        class464 var4 = new class464(arg0);
        class464 var5 = new class464(arg0);
        class464 var6 = new class464(arg0);
        class464 var7 = new class464(arg0);
        class464 var8 = new class464(arg0);
        var2.field4864 = arg0.length - 26;
        int var9 = var2.method7716();
        int var10 = var2.method7716();
        int var11 = var2.method7735();
        int var12 = var2.method7735();
        int var13 = var2.method7735();
        int var14 = var2.method7735();
        int var15 = var2.method7735();
        int var16 = var2.method7735();
        int var17 = var2.method7735();
        int var18 = var2.method7735();
        int var19 = var2.method7716();
        int var20 = var2.method7716();
        int var21 = var2.method7716();
        int var22 = var2.method7716();
        int var23 = var2.method7716();
        int var24 = var2.method7716();
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        if (var11 > 0) {
            this.field2327 = new byte[var11];
            var2.field4864 = 0;
            for (int var28 = 0; var28 < var11; var28++) {
                byte var29 = this.field2327[var28] = var2.method7881();
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
        this.field2311 = var9;
        this.field2315 = var10;
        this.field2326 = var11;
        this.field2312 = new int[var9];
        this.field2350 = new int[var9];
        this.field2314 = new int[var9];
        this.field2316 = new int[var10];
        this.field2317 = new int[var10];
        this.field2318 = new int[var10];
        if (var17 == 1) {
            this.field2331 = new int[var9];
        }
        if (var12 == 1) {
            this.field2319 = new byte[var10];
        }
        if (var13 == 255) {
            this.field2320 = new byte[var10];
        } else {
            this.field2325 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2321 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2332 = new int[var10];
        }
        if (var16 == 1) {
            this.field2310 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field2334 = new byte[var10];
        }
        if (var18 == 1) {
            this.field2308 = new int[var9][];
            this.field2336 = new int[var9][];
        }
        this.field2335 = new short[var10];
        if (var11 > 0) {
            this.field2330 = new short[var11];
            this.field2323 = new short[var11];
            this.field2352 = new short[var11];
        }
        var2.field4864 = var11;
        var3.field4864 = var47;
        var4.field4864 = var49;
        var5.field4864 = var51;
        var6.field4864 = var35;
        int var67 = 0;
        int var68 = 0;
        int var69 = 0;
        for (int var70 = 0; var70 < var9; var70++) {
            int var71 = var2.method7735();
            int var72 = 0;
            if ((var71 & 0x1) != 0) {
                var72 = var3.method7813();
            }
            int var73 = 0;
            if ((var71 & 0x2) != 0) {
                var73 = var4.method7813();
            }
            int var74 = 0;
            if ((var71 & 0x4) != 0) {
                var74 = var5.method7813();
            }
            this.field2312[var70] = var67 + var72;
            this.field2350[var70] = var68 + var73;
            this.field2314[var70] = var69 + var74;
            var67 = this.field2312[var70];
            var68 = this.field2350[var70];
            var69 = this.field2314[var70];
            if (var17 == 1) {
                this.field2331[var70] = var6.method7735();
            }
        }
        if (var18 == 1) {
            for (int var75 = 0; var75 < var9; var75++) {
                int var76 = var6.method7735();
                this.field2308[var75] = new int[var76];
                this.field2336[var75] = new int[var76];
                for (int var77 = 0; var77 < var76; var77++) {
                    this.field2308[var75][var77] = var6.method7735();
                    this.field2336[var75][var77] = var6.method7735();
                }
            }
        }
        var2.field4864 = var45;
        var3.field4864 = var33;
        var4.field4864 = var36;
        var5.field4864 = var40;
        var6.field4864 = var37;
        var7.field4864 = var43;
        var8.field4864 = var42;
        for (int var78 = 0; var78 < var10; var78++) {
            this.field2335[var78] = (short) var2.method7716();
            if (var12 == 1) {
                this.field2319[var78] = var3.method7881();
            }
            if (var13 == 255) {
                this.field2320[var78] = var4.method7881();
            }
            if (var14 == 1) {
                this.field2321[var78] = var5.method7881();
            }
            if (var15 == 1) {
                this.field2332[var78] = var6.method7735();
            }
            if (var16 == 1) {
                this.field2310[var78] = (short) (var7.method7716() - 1);
            }
            if (this.field2334 != null && this.field2310[var78] != -1) {
                this.field2334[var78] = (byte) (var8.method7735() - 1);
            }
        }
        var2.field4864 = var39;
        var3.field4864 = var32;
        int var79 = 0;
        int var80 = 0;
        int var81 = 0;
        int var82 = 0;
        for (int var83 = 0; var83 < var10; var83++) {
            int var84 = var3.method7735();
            if (var84 == 1) {
                var79 = var2.method7813() + var82;
                var80 = var2.method7813() + var79;
                var81 = var2.method7813() + var80;
                var82 = var81;
                this.field2316[var83] = var79;
                this.field2317[var83] = var80;
                this.field2318[var83] = var81;
            }
            if (var84 == 2) {
                var80 = var81;
                var81 = var2.method7813() + var82;
                var82 = var81;
                this.field2316[var83] = var79;
                this.field2317[var83] = var80;
                this.field2318[var83] = var81;
            }
            if (var84 == 3) {
                var79 = var81;
                var81 = var2.method7813() + var82;
                var82 = var81;
                this.field2316[var83] = var79;
                this.field2317[var83] = var80;
                this.field2318[var83] = var81;
            }
            if (var84 == 4) {
                int var87 = var79;
                var79 = var80;
                var80 = var87;
                var81 = var2.method7813() + var82;
                var82 = var81;
                this.field2316[var83] = var79;
                this.field2317[var83] = var87;
                this.field2318[var83] = var81;
            }
        }
        var2.field4864 = var53;
        var3.field4864 = var55;
        var4.field4864 = var57;
        var5.field4864 = var59;
        var6.field4864 = var61;
        var7.field4864 = var63;
        for (int var88 = 0; var88 < var11; var88++) {
            int var89 = this.field2327[var88] & 0xFF;
            if (var89 == 0) {
                this.field2330[var88] = (short) var2.method7716();
                this.field2323[var88] = (short) var2.method7716();
                this.field2352[var88] = (short) var2.method7716();
            }
        }
        var2.field4864 = var65;
        int var90 = var2.method7735();
        if (var90 == 0) {
            return;
        }
        new class225();
        var2.method7716();
        var2.method7716();
        var2.method7716();
        var2.method7720();
    }

    @ObfuscatedName("gs.x([B)V")
    public void method3750(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class464 var4 = new class464(arg0);
        class464 var5 = new class464(arg0);
        class464 var6 = new class464(arg0);
        class464 var7 = new class464(arg0);
        class464 var8 = new class464(arg0);
        var4.field4864 = arg0.length - 23;
        int var9 = var4.method7716();
        int var10 = var4.method7716();
        int var11 = var4.method7735();
        int var12 = var4.method7735();
        int var13 = var4.method7735();
        int var14 = var4.method7735();
        int var15 = var4.method7735();
        int var16 = var4.method7735();
        int var17 = var4.method7735();
        int var18 = var4.method7716();
        int var19 = var4.method7716();
        int var20 = var4.method7716();
        int var21 = var4.method7716();
        int var22 = var4.method7716();
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
        this.field2311 = var9;
        this.field2315 = var10;
        this.field2326 = var11;
        this.field2312 = new int[var9];
        this.field2350 = new int[var9];
        this.field2314 = new int[var9];
        this.field2316 = new int[var10];
        this.field2317 = new int[var10];
        this.field2318 = new int[var10];
        if (var11 > 0) {
            this.field2327 = new byte[var11];
            this.field2330 = new short[var11];
            this.field2323 = new short[var11];
            this.field2352 = new short[var11];
        }
        if (var16 == 1) {
            this.field2331 = new int[var9];
        }
        if (var12 == 1) {
            this.field2319 = new byte[var10];
            this.field2334 = new byte[var10];
            this.field2310 = new short[var10];
        }
        if (var13 == 255) {
            this.field2320 = new byte[var10];
        } else {
            this.field2325 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2321 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2332 = new int[var10];
        }
        if (var17 == 1) {
            this.field2308 = new int[var9][];
            this.field2336 = new int[var9][];
        }
        this.field2335 = new short[var10];
        var4.field4864 = var23;
        var5.field4864 = var39;
        var6.field4864 = var41;
        var7.field4864 = var43;
        var8.field4864 = var27;
        int var46 = 0;
        int var47 = 0;
        int var48 = 0;
        for (int var49 = 0; var49 < var9; var49++) {
            int var50 = var4.method7735();
            int var51 = 0;
            if ((var50 & 0x1) != 0) {
                var51 = var5.method7813();
            }
            int var52 = 0;
            if ((var50 & 0x2) != 0) {
                var52 = var6.method7813();
            }
            int var53 = 0;
            if ((var50 & 0x4) != 0) {
                var53 = var7.method7813();
            }
            this.field2312[var49] = var46 + var51;
            this.field2350[var49] = var47 + var52;
            this.field2314[var49] = var48 + var53;
            var46 = this.field2312[var49];
            var47 = this.field2350[var49];
            var48 = this.field2314[var49];
            if (var16 == 1) {
                this.field2331[var49] = var8.method7735();
            }
        }
        if (var17 == 1) {
            for (int var54 = 0; var54 < var9; var54++) {
                int var55 = var8.method7735();
                this.field2308[var54] = new int[var55];
                this.field2336[var54] = new int[var55];
                for (int var56 = 0; var56 < var55; var56++) {
                    this.field2308[var54][var56] = var8.method7735();
                    this.field2336[var54][var56] = var8.method7735();
                }
            }
        }
        var4.field4864 = var35;
        var5.field4864 = var30;
        var6.field4864 = var28;
        var7.field4864 = var33;
        var8.field4864 = var29;
        for (int var57 = 0; var57 < var10; var57++) {
            this.field2335[var57] = (short) var4.method7716();
            if (var12 == 1) {
                int var58 = var5.method7735();
                if ((var58 & 0x1) == 1) {
                    this.field2319[var57] = 1;
                    var2 = true;
                } else {
                    this.field2319[var57] = 0;
                }
                if ((var58 & 0x2) == 2) {
                    this.field2334[var57] = (byte) (var58 >> 2);
                    this.field2310[var57] = this.field2335[var57];
                    this.field2335[var57] = 127;
                    if (this.field2310[var57] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field2334[var57] = -1;
                    this.field2310[var57] = -1;
                }
            }
            if (var13 == 255) {
                this.field2320[var57] = var6.method7881();
            }
            if (var14 == 1) {
                this.field2321[var57] = var7.method7881();
            }
            if (var15 == 1) {
                this.field2332[var57] = var8.method7735();
            }
        }
        var4.field4864 = var32;
        var5.field4864 = var25;
        int var59 = 0;
        int var60 = 0;
        int var61 = 0;
        int var62 = 0;
        for (int var63 = 0; var63 < var10; var63++) {
            int var64 = var5.method7735();
            if (var64 == 1) {
                var59 = var4.method7813() + var62;
                var60 = var4.method7813() + var59;
                var61 = var4.method7813() + var60;
                var62 = var61;
                this.field2316[var63] = var59;
                this.field2317[var63] = var60;
                this.field2318[var63] = var61;
            }
            if (var64 == 2) {
                var60 = var61;
                var61 = var4.method7813() + var62;
                var62 = var61;
                this.field2316[var63] = var59;
                this.field2317[var63] = var60;
                this.field2318[var63] = var61;
            }
            if (var64 == 3) {
                var59 = var61;
                var61 = var4.method7813() + var62;
                var62 = var61;
                this.field2316[var63] = var59;
                this.field2317[var63] = var60;
                this.field2318[var63] = var61;
            }
            if (var64 == 4) {
                int var67 = var59;
                var59 = var60;
                var60 = var67;
                var61 = var4.method7813() + var62;
                var62 = var61;
                this.field2316[var63] = var59;
                this.field2317[var63] = var67;
                this.field2318[var63] = var61;
            }
        }
        var4.field4864 = var37;
        for (int var68 = 0; var68 < var11; var68++) {
            this.field2327[var68] = 0;
            this.field2330[var68] = (short) var4.method7716();
            this.field2323[var68] = (short) var4.method7716();
            this.field2352[var68] = (short) var4.method7716();
        }
        if (this.field2334 != null) {
            boolean var69 = false;
            for (int var70 = 0; var70 < var10; var70++) {
                int var71 = this.field2334[var70] & 0xFF;
                if (var71 != 255) {
                    if ((this.field2330[var71] & 0xFFFF) == this.field2316[var70] && (this.field2323[var71] & 0xFFFF) == this.field2317[var70] && (this.field2352[var71] & 0xFFFF) == this.field2318[var70]) {
                        this.field2334[var70] = -1;
                    } else {
                        var69 = true;
                    }
                }
            }
            if (!var69) {
                this.field2334 = null;
            }
        }
        if (!var3) {
            this.field2310 = null;
        }
        if (!var2) {
            this.field2319 = null;
        }
    }

    @ObfuscatedName("gs.h([B)V")
    public void method3719(byte[] arg0) {
        class464 var2 = new class464(arg0);
        class464 var3 = new class464(arg0);
        class464 var4 = new class464(arg0);
        class464 var5 = new class464(arg0);
        class464 var6 = new class464(arg0);
        class464 var7 = new class464(arg0);
        class464 var8 = new class464(arg0);
        var2.field4864 = arg0.length - 23;
        int var9 = var2.method7716();
        int var10 = var2.method7716();
        int var11 = var2.method7735();
        int var12 = var2.method7735();
        int var13 = var2.method7735();
        int var14 = var2.method7735();
        int var15 = var2.method7735();
        int var16 = var2.method7735();
        int var17 = var2.method7735();
        int var18 = var2.method7716();
        int var19 = var2.method7716();
        int var20 = var2.method7716();
        int var21 = var2.method7716();
        int var22 = var2.method7716();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field2327 = new byte[var11];
            var2.field4864 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field2327[var26] = var2.method7881();
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
        this.field2311 = var9;
        this.field2315 = var10;
        this.field2326 = var11;
        this.field2312 = new int[var9];
        this.field2350 = new int[var9];
        this.field2314 = new int[var9];
        this.field2316 = new int[var10];
        this.field2317 = new int[var10];
        this.field2318 = new int[var10];
        if (var17 == 1) {
            this.field2331 = new int[var9];
        }
        if (var12 == 1) {
            this.field2319 = new byte[var10];
        }
        if (var13 == 255) {
            this.field2320 = new byte[var10];
        } else {
            this.field2325 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2321 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2332 = new int[var10];
        }
        if (var16 == 1) {
            this.field2310 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field2334 = new byte[var10];
        }
        this.field2335 = new short[var10];
        if (var11 > 0) {
            this.field2330 = new short[var11];
            this.field2323 = new short[var11];
            this.field2352 = new short[var11];
        }
        var2.field4864 = var11;
        var3.field4864 = var44;
        var4.field4864 = var46;
        var5.field4864 = var48;
        var6.field4864 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method7735();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method7813();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method7813();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method7813();
            }
            this.field2312[var67] = var64 + var69;
            this.field2350[var67] = var65 + var70;
            this.field2314[var67] = var66 + var71;
            var64 = this.field2312[var67];
            var65 = this.field2350[var67];
            var66 = this.field2314[var67];
            if (var17 == 1) {
                this.field2331[var67] = var6.method7735();
            }
        }
        var2.field4864 = var42;
        var3.field4864 = var31;
        var4.field4864 = var34;
        var5.field4864 = var37;
        var6.field4864 = var35;
        var7.field4864 = var40;
        var8.field4864 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field2335[var72] = (short) var2.method7716();
            if (var12 == 1) {
                this.field2319[var72] = var3.method7881();
            }
            if (var13 == 255) {
                this.field2320[var72] = var4.method7881();
            }
            if (var14 == 1) {
                this.field2321[var72] = var5.method7881();
            }
            if (var15 == 1) {
                this.field2332[var72] = var6.method7735();
            }
            if (var16 == 1) {
                this.field2310[var72] = (short) (var7.method7716() - 1);
            }
            if (this.field2334 != null && this.field2310[var72] != -1) {
                this.field2334[var72] = (byte) (var8.method7735() - 1);
            }
        }
        var2.field4864 = var33;
        var3.field4864 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method7735();
            if (var78 == 1) {
                var73 = var2.method7813() + var76;
                var74 = var2.method7813() + var73;
                var75 = var2.method7813() + var74;
                var76 = var75;
                this.field2316[var77] = var73;
                this.field2317[var77] = var74;
                this.field2318[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method7813() + var76;
                var76 = var75;
                this.field2316[var77] = var73;
                this.field2317[var77] = var74;
                this.field2318[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method7813() + var76;
                var76 = var75;
                this.field2316[var77] = var73;
                this.field2317[var77] = var74;
                this.field2318[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method7813() + var76;
                var76 = var75;
                this.field2316[var77] = var73;
                this.field2317[var77] = var81;
                this.field2318[var77] = var75;
            }
        }
        var2.field4864 = var50;
        var3.field4864 = var52;
        var4.field4864 = var54;
        var5.field4864 = var56;
        var6.field4864 = var58;
        var7.field4864 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field2327[var82] & 0xFF;
            if (var83 == 0) {
                this.field2330[var82] = (short) var2.method7716();
                this.field2323[var82] = (short) var2.method7716();
                this.field2352[var82] = (short) var2.method7716();
            }
        }
        var2.field4864 = var62;
        int var84 = var2.method7735();
        if (var84 == 0) {
            return;
        }
        new class225();
        var2.method7716();
        var2.method7716();
        var2.method7716();
        var2.method7720();
    }

    @ObfuscatedName("gs.j([B)V")
    public void method3715(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class464 var4 = new class464(arg0);
        class464 var5 = new class464(arg0);
        class464 var6 = new class464(arg0);
        class464 var7 = new class464(arg0);
        class464 var8 = new class464(arg0);
        var4.field4864 = arg0.length - 18;
        int var9 = var4.method7716();
        int var10 = var4.method7716();
        int var11 = var4.method7735();
        int var12 = var4.method7735();
        int var13 = var4.method7735();
        int var14 = var4.method7735();
        int var15 = var4.method7735();
        int var16 = var4.method7735();
        int var17 = var4.method7716();
        int var18 = var4.method7716();
        int var19 = var4.method7716();
        int var20 = var4.method7716();
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
        this.field2311 = var9;
        this.field2315 = var10;
        this.field2326 = var11;
        this.field2312 = new int[var9];
        this.field2350 = new int[var9];
        this.field2314 = new int[var9];
        this.field2316 = new int[var10];
        this.field2317 = new int[var10];
        this.field2318 = new int[var10];
        if (var11 > 0) {
            this.field2327 = new byte[var11];
            this.field2330 = new short[var11];
            this.field2323 = new short[var11];
            this.field2352 = new short[var11];
        }
        if (var16 == 1) {
            this.field2331 = new int[var9];
        }
        if (var12 == 1) {
            this.field2319 = new byte[var10];
            this.field2334 = new byte[var10];
            this.field2310 = new short[var10];
        }
        if (var13 == 255) {
            this.field2320 = new byte[var10];
        } else {
            this.field2325 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2321 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2332 = new int[var10];
        }
        this.field2335 = new short[var10];
        var4.field4864 = var21;
        var5.field4864 = var36;
        var6.field4864 = var38;
        var7.field4864 = var40;
        var8.field4864 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method7735();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method7813();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method7813();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method7813();
            }
            this.field2312[var46] = var43 + var48;
            this.field2350[var46] = var44 + var49;
            this.field2314[var46] = var45 + var50;
            var43 = this.field2312[var46];
            var44 = this.field2350[var46];
            var45 = this.field2314[var46];
            if (var16 == 1) {
                this.field2331[var46] = var8.method7735();
            }
        }
        var4.field4864 = var32;
        var5.field4864 = var28;
        var6.field4864 = var26;
        var7.field4864 = var30;
        var8.field4864 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field2335[var51] = (short) var4.method7716();
            if (var12 == 1) {
                int var52 = var5.method7735();
                if ((var52 & 0x1) == 1) {
                    this.field2319[var51] = 1;
                    var2 = true;
                } else {
                    this.field2319[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field2334[var51] = (byte) (var52 >> 2);
                    this.field2310[var51] = this.field2335[var51];
                    this.field2335[var51] = 127;
                    if (this.field2310[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field2334[var51] = -1;
                    this.field2310[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field2320[var51] = var6.method7881();
            }
            if (var14 == 1) {
                this.field2321[var51] = var7.method7881();
            }
            if (var15 == 1) {
                this.field2332[var51] = var8.method7735();
            }
        }
        var4.field4864 = var25;
        var5.field4864 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method7735();
            if (var58 == 1) {
                var53 = var4.method7813() + var56;
                var54 = var4.method7813() + var53;
                var55 = var4.method7813() + var54;
                var56 = var55;
                this.field2316[var57] = var53;
                this.field2317[var57] = var54;
                this.field2318[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method7813() + var56;
                var56 = var55;
                this.field2316[var57] = var53;
                this.field2317[var57] = var54;
                this.field2318[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method7813() + var56;
                var56 = var55;
                this.field2316[var57] = var53;
                this.field2317[var57] = var54;
                this.field2318[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method7813() + var56;
                var56 = var55;
                this.field2316[var57] = var53;
                this.field2317[var57] = var61;
                this.field2318[var57] = var55;
            }
        }
        var4.field4864 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field2327[var62] = 0;
            this.field2330[var62] = (short) var4.method7716();
            this.field2323[var62] = (short) var4.method7716();
            this.field2352[var62] = (short) var4.method7716();
        }
        if (this.field2334 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field2334[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field2330[var65] & 0xFFFF) == this.field2316[var64] && (this.field2323[var65] & 0xFFFF) == this.field2317[var64] && (this.field2352[var65] & 0xFFFF) == this.field2318[var64]) {
                        this.field2334[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field2334 = null;
            }
        }
        if (!var3) {
            this.field2310 = null;
        }
        if (!var2) {
            this.field2319 = null;
        }
    }

    public class206(class206[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        this.field2311 = 0;
        this.field2315 = 0;
        this.field2326 = 0;
        this.field2325 = -1;
        for (int var10 = 0; var10 < arg1; var10++) {
            class206 var11 = arg0[var10];
            if (var11 != null) {
                this.field2311 += var11.field2311;
                this.field2315 += var11.field2315;
                this.field2326 += var11.field2326;
                if (var11.field2320 == null) {
                    if (this.field2325 == -1) {
                        this.field2325 = var11.field2325;
                    }
                    if (this.field2325 != var11.field2325) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var11.field2319 != null;
                var5 |= var11.field2321 != null;
                var6 |= var11.field2332 != null;
                var7 |= var11.field2310 != null;
                var8 |= var11.field2334 != null;
                var9 |= var11.field2308 != null;
            }
        }
        this.field2312 = new int[this.field2311];
        this.field2350 = new int[this.field2311];
        this.field2314 = new int[this.field2311];
        this.field2331 = new int[this.field2311];
        this.field2316 = new int[this.field2315];
        this.field2317 = new int[this.field2315];
        this.field2318 = new int[this.field2315];
        if (var3) {
            this.field2319 = new byte[this.field2315];
        }
        if (var4) {
            this.field2320 = new byte[this.field2315];
        }
        if (var5) {
            this.field2321 = new byte[this.field2315];
        }
        if (var6) {
            this.field2332 = new int[this.field2315];
        }
        if (var7) {
            this.field2310 = new short[this.field2315];
        }
        if (var8) {
            this.field2334 = new byte[this.field2315];
        }
        if (var9) {
            this.field2308 = new int[this.field2311][];
            this.field2336 = new int[this.field2311][];
        }
        this.field2335 = new short[this.field2315];
        if (this.field2326 > 0) {
            this.field2327 = new byte[this.field2326];
            this.field2330 = new short[this.field2326];
            this.field2323 = new short[this.field2326];
            this.field2352 = new short[this.field2326];
        }
        this.field2311 = 0;
        this.field2315 = 0;
        this.field2326 = 0;
        for (int var12 = 0; var12 < arg1; var12++) {
            class206 var13 = arg0[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < var13.field2315; var14++) {
                    if (var3 && var13.field2319 != null) {
                        this.field2319[this.field2315] = var13.field2319[var14];
                    }
                    if (var4) {
                        if (var13.field2320 == null) {
                            this.field2320[this.field2315] = var13.field2325;
                        } else {
                            this.field2320[this.field2315] = var13.field2320[var14];
                        }
                    }
                    if (var5 && var13.field2321 != null) {
                        this.field2321[this.field2315] = var13.field2321[var14];
                    }
                    if (var6 && var13.field2332 != null) {
                        this.field2332[this.field2315] = var13.field2332[var14];
                    }
                    if (var7) {
                        if (var13.field2310 == null) {
                            this.field2310[this.field2315] = -1;
                        } else {
                            this.field2310[this.field2315] = var13.field2310[var14];
                        }
                    }
                    if (var8) {
                        if (var13.field2334 == null || var13.field2334[var14] == -1) {
                            this.field2334[this.field2315] = -1;
                        } else {
                            this.field2334[this.field2315] = (byte) (var13.field2334[var14] + this.field2326);
                        }
                    }
                    this.field2335[this.field2315] = var13.field2335[var14];
                    this.field2316[this.field2315] = this.method3733(var13, var13.field2316[var14]);
                    this.field2317[this.field2315] = this.method3733(var13, var13.field2317[var14]);
                    this.field2318[this.field2315] = this.method3733(var13, var13.field2318[var14]);
                    this.field2315++;
                }
                for (int var15 = 0; var15 < var13.field2326; var15++) {
                    byte var16 = this.field2327[this.field2326] = var13.field2327[var15];
                    if (var16 == 0) {
                        this.field2330[this.field2326] = (short) this.method3733(var13, var13.field2330[var15]);
                        this.field2323[this.field2326] = (short) this.method3733(var13, var13.field2323[var15]);
                        this.field2352[this.field2326] = (short) this.method3733(var13, var13.field2352[var15]);
                    }
                    this.field2326++;
                }
            }
        }
    }

    @ObfuscatedName("gs.n(Lgs;I)I")
    public final int method3733(class206 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field2312[arg1];
        int var5 = arg0.field2350[arg1];
        int var6 = arg0.field2314[arg1];
        for (int var7 = 0; var7 < this.field2311; var7++) {
            if (this.field2312[var7] == var4 && this.field2350[var7] == var5 && this.field2314[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field2312[this.field2311] = var4;
            this.field2350[this.field2311] = var5;
            this.field2314[this.field2311] = var6;
            if (arg0.field2331 != null) {
                this.field2331[this.field2311] = arg0.field2331[arg1];
            }
            if (arg0.field2308 != null) {
                this.field2308[this.field2311] = arg0.field2308[arg1];
                this.field2336[this.field2311] = arg0.field2336[arg1];
            }
            var3 = this.field2311++;
        }
        return var3;
    }

    public class206(class206 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field2311 = arg0.field2311;
        this.field2315 = arg0.field2315;
        this.field2326 = arg0.field2326;
        if (arg1) {
            this.field2312 = arg0.field2312;
            this.field2350 = arg0.field2350;
            this.field2314 = arg0.field2314;
        } else {
            this.field2312 = new int[this.field2311];
            this.field2350 = new int[this.field2311];
            this.field2314 = new int[this.field2311];
            for (int var6 = 0; var6 < this.field2311; var6++) {
                this.field2312[var6] = arg0.field2312[var6];
                this.field2350[var6] = arg0.field2350[var6];
                this.field2314[var6] = arg0.field2314[var6];
            }
        }
        if (arg2) {
            this.field2335 = arg0.field2335;
        } else {
            this.field2335 = new short[this.field2315];
            for (int var7 = 0; var7 < this.field2315; var7++) {
                this.field2335[var7] = arg0.field2335[var7];
            }
        }
        if (arg3 || arg0.field2310 == null) {
            this.field2310 = arg0.field2310;
        } else {
            this.field2310 = new short[this.field2315];
            for (int var8 = 0; var8 < this.field2315; var8++) {
                this.field2310[var8] = arg0.field2310[var8];
            }
        }
        if (arg4) {
            this.field2321 = arg0.field2321;
        } else {
            this.field2321 = new byte[this.field2315];
            if (arg0.field2321 == null) {
                for (int var9 = 0; var9 < this.field2315; var9++) {
                    this.field2321[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field2315; var10++) {
                    this.field2321[var10] = arg0.field2321[var10];
                }
            }
        }
        this.field2316 = arg0.field2316;
        this.field2317 = arg0.field2317;
        this.field2318 = arg0.field2318;
        this.field2319 = arg0.field2319;
        this.field2320 = arg0.field2320;
        this.field2334 = arg0.field2334;
        this.field2325 = arg0.field2325;
        this.field2327 = arg0.field2327;
        this.field2330 = arg0.field2330;
        this.field2323 = arg0.field2323;
        this.field2352 = arg0.field2352;
        this.field2331 = arg0.field2331;
        this.field2332 = arg0.field2332;
        this.field2333 = arg0.field2333;
        this.field2313 = arg0.field2313;
        this.field2338 = arg0.field2338;
        this.field2337 = arg0.field2337;
        this.field2339 = arg0.field2339;
        this.field2308 = arg0.field2308;
        this.field2336 = arg0.field2336;
        this.field2340 = arg0.field2340;
        this.field2341 = arg0.field2341;
    }

    @ObfuscatedName("gs.r()Lgs;")
    public class206 method3718() {
        class206 var1 = new class206();
        if (this.field2319 != null) {
            var1.field2319 = new byte[this.field2315];
            for (int var2 = 0; var2 < this.field2315; var2++) {
                var1.field2319[var2] = this.field2319[var2];
            }
        }
        var1.field2311 = this.field2311;
        var1.field2315 = this.field2315;
        var1.field2326 = this.field2326;
        var1.field2312 = this.field2312;
        var1.field2350 = this.field2350;
        var1.field2314 = this.field2314;
        var1.field2316 = this.field2316;
        var1.field2317 = this.field2317;
        var1.field2318 = this.field2318;
        var1.field2320 = this.field2320;
        var1.field2321 = this.field2321;
        var1.field2334 = this.field2334;
        var1.field2335 = this.field2335;
        var1.field2310 = this.field2310;
        var1.field2325 = this.field2325;
        var1.field2327 = this.field2327;
        var1.field2330 = this.field2330;
        var1.field2323 = this.field2323;
        var1.field2352 = this.field2352;
        var1.field2331 = this.field2331;
        var1.field2332 = this.field2332;
        var1.field2333 = this.field2333;
        var1.field2313 = this.field2313;
        var1.field2338 = this.field2338;
        var1.field2337 = this.field2337;
        var1.field2340 = this.field2340;
        var1.field2341 = this.field2341;
        return var1;
    }

    @ObfuscatedName("gs.l([[IIIIZI)Lgs;")
    public class206 method3734(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method3784();
        int var7 = this.field2344 + arg1;
        int var8 = this.field2345 + arg1;
        int var9 = this.field2347 + arg3;
        int var10 = this.field2346 + arg3;
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
        class206 var15;
        if (arg4) {
            var15 = new class206();
            var15.field2311 = this.field2311;
            var15.field2315 = this.field2315;
            var15.field2326 = this.field2326;
            var15.field2312 = this.field2312;
            var15.field2314 = this.field2314;
            var15.field2316 = this.field2316;
            var15.field2317 = this.field2317;
            var15.field2318 = this.field2318;
            var15.field2319 = this.field2319;
            var15.field2320 = this.field2320;
            var15.field2321 = this.field2321;
            var15.field2334 = this.field2334;
            var15.field2335 = this.field2335;
            var15.field2310 = this.field2310;
            var15.field2325 = this.field2325;
            var15.field2327 = this.field2327;
            var15.field2330 = this.field2330;
            var15.field2323 = this.field2323;
            var15.field2352 = this.field2352;
            var15.field2331 = this.field2331;
            var15.field2332 = this.field2332;
            var15.field2333 = this.field2333;
            var15.field2313 = this.field2313;
            var15.field2340 = this.field2340;
            var15.field2341 = this.field2341;
            var15.field2350 = new int[var15.field2311];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field2311; var16++) {
                int var17 = this.field2312[var16] + arg1;
                int var18 = this.field2314[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field2350[var16] = this.field2350[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field2311; var26++) {
                int var27 = (-this.field2350[var26] << 16) / this.field2521;
                if (var27 < arg5) {
                    int var28 = this.field2312[var26] + arg1;
                    int var29 = this.field2314[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field2350[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field2350[var26];
                }
            }
        }
        var15.method3745();
        return var15;
    }

    @ObfuscatedName("gs.s()V")
    public void method3720() {
        int var10002;
        if (this.field2331 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field2311; var3++) {
                int var4 = this.field2331[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field2333 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field2333[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field2311) {
                int var7 = this.field2331[var6];
                this.field2333[var7][var1[var7]++] = var6++;
            }
            this.field2331 = null;
        }
        if (this.field2332 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field2315; var10++) {
            int var11 = this.field2332[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field2313 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field2313[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field2315) {
            int var14 = this.field2332[var13];
            this.field2313[var14][var8[var14]++] = var13++;
        }
        this.field2332 = null;
    }

    @ObfuscatedName("gs.p()V")
    public void method3757() {
        for (int var1 = 0; var1 < this.field2311; var1++) {
            int var2 = this.field2312[var1];
            this.field2312[var1] = this.field2314[var1];
            this.field2314[var1] = -var2;
        }
        this.method3745();
    }

    @ObfuscatedName("gs.b()V")
    public void method3722() {
        for (int var1 = 0; var1 < this.field2311; var1++) {
            this.field2312[var1] = -this.field2312[var1];
            this.field2314[var1] = -this.field2314[var1];
        }
        this.method3745();
    }

    @ObfuscatedName("gs.o()V")
    public void method3723() {
        for (int var1 = 0; var1 < this.field2311; var1++) {
            int var2 = this.field2314[var1];
            this.field2314[var1] = this.field2312[var1];
            this.field2312[var1] = -var2;
        }
        this.method3745();
    }

    @ObfuscatedName("gs.u(I)V")
    public void method3724(int arg0) {
        int var2 = field2309[arg0];
        int var3 = field2328[arg0];
        for (int var4 = 0; var4 < this.field2311; var4++) {
            int var5 = this.field2314[var4] * var2 + this.field2312[var4] * var3 >> 16;
            this.field2314[var4] = this.field2314[var4] * var3 - this.field2312[var4] * var2 >> 16;
            this.field2312[var4] = var5;
        }
        this.method3745();
    }

    @ObfuscatedName("gs.z(III)V")
    public void method3758(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2311; var4++) {
            this.field2312[var4] += arg0;
            this.field2350[var4] += arg1;
            this.field2314[var4] += arg2;
        }
        this.method3745();
    }

    @ObfuscatedName("gs.t(SS)V")
    public void method3726(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2315; var3++) {
            if (this.field2335[var3] == arg0) {
                this.field2335[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("gs.w(SS)V")
    public void method3727(short arg0, short arg1) {
        if (this.field2310 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field2315; var3++) {
            if (this.field2310[var3] == arg0) {
                this.field2310[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("gs.m()V")
    public void method3728() {
        for (int var1 = 0; var1 < this.field2311; var1++) {
            this.field2314[var1] = -this.field2314[var1];
        }
        for (int var2 = 0; var2 < this.field2315; var2++) {
            int var3 = this.field2316[var2];
            this.field2316[var2] = this.field2318[var2];
            this.field2318[var2] = var3;
        }
        this.method3745();
    }

    @ObfuscatedName("gs.q(III)V")
    public void method3712(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2311; var4++) {
            this.field2312[var4] = this.field2312[var4] * arg0 / 128;
            this.field2350[var4] = this.field2350[var4] * arg1 / 128;
            this.field2314[var4] = this.field2314[var4] * arg2 / 128;
        }
        this.method3745();
    }

    @ObfuscatedName("gs.i()V")
    public void method3729() {
        if (this.field2338 != null) {
            return;
        }
        this.field2338 = new class223[this.field2311];
        for (int var1 = 0; var1 < this.field2311; var1++) {
            this.field2338[var1] = new class223();
        }
        for (int var2 = 0; var2 < this.field2315; var2++) {
            int var3 = this.field2316[var2];
            int var4 = this.field2317[var2];
            int var5 = this.field2318[var2];
            int var6 = this.field2312[var4] - this.field2312[var3];
            int var7 = this.field2350[var4] - this.field2350[var3];
            int var8 = this.field2314[var4] - this.field2314[var3];
            int var9 = this.field2312[var5] - this.field2312[var3];
            int var10 = this.field2350[var5] - this.field2350[var3];
            int var11 = this.field2314[var5] - this.field2314[var3];
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
            if (this.field2319 == null) {
                var19 = 0;
            } else {
                var19 = this.field2319[var2];
            }
            if (var19 == 0) {
                class223 var20 = this.field2338[var3];
                var20.field2688 += var16;
                var20.field2685 += var17;
                var20.field2686 += var18;
                var20.field2687++;
                class223 var21 = this.field2338[var4];
                var21.field2688 += var16;
                var21.field2685 += var17;
                var21.field2686 += var18;
                var21.field2687++;
                class223 var22 = this.field2338[var5];
                var22.field2688 += var16;
                var22.field2685 += var17;
                var22.field2686 += var18;
                var22.field2687++;
            } else if (var19 == 1) {
                if (this.field2337 == null) {
                    this.field2337 = new class216[this.field2315];
                }
                class216 var23 = this.field2337[var2] = new class216();
                var23.field2528 = var16;
                var23.field2523 = var17;
                var23.field2524 = var18;
            }
        }
    }

    @ObfuscatedName("gs.e()V")
    public void method3745() {
        this.field2338 = null;
        this.field2339 = null;
        this.field2337 = null;
        this.field2342 = false;
    }

    @ObfuscatedName("gs.g()V")
    public void method3784() {
        if (this.field2342) {
            return;
        }
        this.field2521 = 0;
        this.field2343 = 0;
        this.field2344 = 999999;
        this.field2345 = -999999;
        this.field2346 = -99999;
        this.field2347 = 99999;
        for (int var1 = 0; var1 < this.field2311; var1++) {
            int var2 = this.field2312[var1];
            int var3 = this.field2350[var1];
            int var4 = this.field2314[var1];
            if (var2 < this.field2344) {
                this.field2344 = var2;
            }
            if (var2 > this.field2345) {
                this.field2345 = var2;
            }
            if (var4 < this.field2347) {
                this.field2347 = var4;
            }
            if (var4 > this.field2346) {
                this.field2346 = var4;
            }
            if (-var3 > this.field2521) {
                this.field2521 = -var3;
            }
            if (var3 > this.field2343) {
                this.field2343 = var3;
            }
        }
        this.field2342 = true;
    }

    @ObfuscatedName("gs.k(Lgs;Lgs;IIIZ)V")
    public static void method3731(class206 arg0, class206 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method3784();
        arg0.method3729();
        arg1.method3784();
        arg1.method3729();
        field2324++;
        int var6 = 0;
        int[] var7 = arg1.field2312;
        int var8 = arg1.field2311;
        for (int var9 = 0; var9 < arg0.field2311; var9++) {
            class223 var10 = arg0.field2338[var9];
            if (var10.field2687 != 0) {
                int var11 = arg0.field2350[var9] - arg3;
                if (var11 <= arg1.field2343) {
                    int var12 = arg0.field2312[var9] - arg2;
                    if (var12 >= arg1.field2344 && var12 <= arg1.field2345) {
                        int var13 = arg0.field2314[var9] - arg4;
                        if (var13 >= arg1.field2347 && var13 <= arg1.field2346) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class223 var15 = arg1.field2338[var14];
                                if (var7[var14] == var12 && arg1.field2314[var14] == var13 && arg1.field2350[var14] == var11 && var15.field2687 != 0) {
                                    if (arg0.field2339 == null) {
                                        arg0.field2339 = new class223[arg0.field2311];
                                    }
                                    if (arg1.field2339 == null) {
                                        arg1.field2339 = new class223[var8];
                                    }
                                    class223 var16 = arg0.field2339[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field2339[var9] = new class223(var10);
                                    }
                                    class223 var17 = arg1.field2339[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field2339[var14] = new class223(var15);
                                    }
                                    var16.field2688 += var15.field2688;
                                    var16.field2685 += var15.field2685;
                                    var16.field2686 += var15.field2686;
                                    var16.field2687 += var15.field2687;
                                    var17.field2688 += var10.field2688;
                                    var17.field2685 += var10.field2685;
                                    var17.field2686 += var10.field2686;
                                    var17.field2687 += var10.field2687;
                                    var6++;
                                    field2348[var9] = field2324;
                                    field2349[var14] = field2324;
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
        for (int var18 = 0; var18 < arg0.field2315; var18++) {
            if (field2348[arg0.field2316[var18]] == field2324 && field2348[arg0.field2317[var18]] == field2324 && field2348[arg0.field2318[var18]] == field2324) {
                if (arg0.field2319 == null) {
                    arg0.field2319 = new byte[arg0.field2315];
                }
                arg0.field2319[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field2315; var19++) {
            if (field2349[arg1.field2316[var19]] == field2324 && field2349[arg1.field2317[var19]] == field2324 && field2349[arg1.field2318[var19]] == field2324) {
                if (arg1.field2319 == null) {
                    arg1.field2319 = new byte[arg1.field2315];
                }
                arg1.field2319[var19] = 2;
            }
        }
    }

    @ObfuscatedName("gs.v(IIIII)Lha;")
    public final class221 method3732(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method3729();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class221 var8 = new class221();
        var8.field2604 = new int[this.field2315];
        var8.field2605 = new int[this.field2315];
        var8.field2606 = new int[this.field2315];
        if (this.field2326 > 0 && this.field2334 != null) {
            int[] var9 = new int[this.field2326];
            for (int var10 = 0; var10 < this.field2315; var10++) {
                if (this.field2334[var10] != -1) {
                    var9[this.field2334[var10] & 0xFF]++;
                }
            }
            var8.field2638 = 0;
            for (int var11 = 0; var11 < this.field2326; var11++) {
                if (var9[var11] > 0 && this.field2327[var11] == 0) {
                    var8.field2638++;
                }
            }
            var8.field2647 = new int[var8.field2638];
            var8.field2614 = new int[var8.field2638];
            var8.field2615 = new int[var8.field2638];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field2326; var13++) {
                if (var9[var13] > 0 && this.field2327[var13] == 0) {
                    var8.field2647[var12] = this.field2330[var13] & 0xFFFF;
                    var8.field2614[var12] = this.field2323[var13] & 0xFFFF;
                    var8.field2615[var12] = this.field2352[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field2609 = new byte[this.field2315];
            for (int var14 = 0; var14 < this.field2315; var14++) {
                if (this.field2334[var14] == -1) {
                    var8.field2609[var14] = -1;
                } else {
                    var8.field2609[var14] = (byte) var9[this.field2334[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field2315; var15++) {
            byte var16;
            if (this.field2319 == null) {
                var16 = 0;
            } else {
                var16 = this.field2319[var15];
            }
            byte var17;
            if (this.field2321 == null) {
                var17 = 0;
            } else {
                var17 = this.field2321[var15];
            }
            short var18;
            if (this.field2310 == null) {
                var18 = -1;
            } else {
                var18 = this.field2310[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field2335[var15] & 0xFFFF;
                    class223 var20;
                    if (this.field2339 == null || this.field2339[this.field2316[var15]] == null) {
                        var20 = this.field2338[this.field2316[var15]];
                    } else {
                        var20 = this.field2339[this.field2316[var15]];
                    }
                    int var21 = (var20.field2686 * arg4 + var20.field2688 * arg2 + var20.field2685 * arg3) / (var20.field2687 * var7) + arg0;
                    var8.field2604[var15] = method3743(var19, var21);
                    class223 var22;
                    if (this.field2339 == null || this.field2339[this.field2317[var15]] == null) {
                        var22 = this.field2338[this.field2317[var15]];
                    } else {
                        var22 = this.field2339[this.field2317[var15]];
                    }
                    int var23 = (var22.field2686 * arg4 + var22.field2688 * arg2 + var22.field2685 * arg3) / (var22.field2687 * var7) + arg0;
                    var8.field2605[var15] = method3743(var19, var23);
                    class223 var24;
                    if (this.field2339 == null || this.field2339[this.field2318[var15]] == null) {
                        var24 = this.field2338[this.field2318[var15]];
                    } else {
                        var24 = this.field2339[this.field2318[var15]];
                    }
                    int var25 = (var24.field2686 * arg4 + var24.field2688 * arg2 + var24.field2685 * arg3) / (var24.field2687 * var7) + arg0;
                    var8.field2606[var15] = method3743(var19, var25);
                } else if (var16 == 1) {
                    class216 var26 = this.field2337[var15];
                    int var27 = (var26.field2524 * arg4 + var26.field2528 * arg2 + var26.field2523 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field2604[var15] = method3743(this.field2335[var15] & 0xFFFF, var27);
                    var8.field2606[var15] = -1;
                } else if (var16 == 3) {
                    var8.field2604[var15] = 128;
                    var8.field2606[var15] = -1;
                } else {
                    var8.field2606[var15] = -2;
                }
            } else if (var16 == 0) {
                class223 var28;
                if (this.field2339 == null || this.field2339[this.field2316[var15]] == null) {
                    var28 = this.field2338[this.field2316[var15]];
                } else {
                    var28 = this.field2339[this.field2316[var15]];
                }
                int var29 = (var28.field2686 * arg4 + var28.field2688 * arg2 + var28.field2685 * arg3) / (var28.field2687 * var7) + arg0;
                var8.field2604[var15] = method3764(var29);
                class223 var30;
                if (this.field2339 == null || this.field2339[this.field2317[var15]] == null) {
                    var30 = this.field2338[this.field2317[var15]];
                } else {
                    var30 = this.field2339[this.field2317[var15]];
                }
                int var31 = (var30.field2686 * arg4 + var30.field2688 * arg2 + var30.field2685 * arg3) / (var30.field2687 * var7) + arg0;
                var8.field2605[var15] = method3764(var31);
                class223 var32;
                if (this.field2339 == null || this.field2339[this.field2318[var15]] == null) {
                    var32 = this.field2338[this.field2318[var15]];
                } else {
                    var32 = this.field2339[this.field2318[var15]];
                }
                int var33 = (var32.field2686 * arg4 + var32.field2688 * arg2 + var32.field2685 * arg3) / (var32.field2687 * var7) + arg0;
                var8.field2606[var15] = method3764(var33);
            } else if (var16 == 1) {
                class216 var34 = this.field2337[var15];
                int var35 = (var34.field2524 * arg4 + var34.field2528 * arg2 + var34.field2523 * arg3) / (var7 / 2 + var7) + arg0;
                var8.field2604[var15] = method3764(var35);
                var8.field2606[var15] = -1;
            } else {
                var8.field2606[var15] = -2;
            }
        }
        this.method3720();
        var8.field2596 = this.field2311;
        var8.field2597 = this.field2312;
        var8.field2591 = this.field2350;
        var8.field2598 = this.field2314;
        var8.field2622 = this.field2315;
        var8.field2601 = this.field2316;
        var8.field2602 = this.field2317;
        var8.field2603 = this.field2318;
        var8.field2607 = this.field2320;
        var8.field2600 = this.field2321;
        var8.field2589 = this.field2325;
        var8.field2661 = this.field2333;
        var8.field2617 = this.field2313;
        var8.field2610 = this.field2310;
        var8.field2625 = this.field2308;
        var8.field2619 = this.field2336;
        return var8;
    }

    @ObfuscatedName("gs.aj(II)I")
    public static final int method3743(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("gs.an(I)I")
    public static final int method3764(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
