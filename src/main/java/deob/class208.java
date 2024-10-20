package deob;

@ObfuscatedName("gi")
public class class208 extends class218 {

    @ObfuscatedName("gi.x")
    public int field2398 = 0;

    @ObfuscatedName("gi.m")
    public int[] field2387;

    @ObfuscatedName("gi.q")
    public int[] field2384;

    @ObfuscatedName("gi.f")
    public int[] field2414;

    @ObfuscatedName("gi.r")
    public int field2386 = 0;

    @ObfuscatedName("gi.u")
    public int[] field2379;

    @ObfuscatedName("gi.b")
    public int[] field2388;

    @ObfuscatedName("gi.j")
    public int[] field2389;

    @ObfuscatedName("gi.g")
    public byte[] field2390;

    @ObfuscatedName("gi.i")
    public byte[] field2417;

    @ObfuscatedName("gi.o")
    public byte[] field2392;

    @ObfuscatedName("gi.n")
    public byte[] field2393;

    @ObfuscatedName("gi.k")
    public short[] field2383;

    @ObfuscatedName("gi.a")
    public short[] field2395;

    @ObfuscatedName("gi.s")
    public byte field2396 = 0;

    @ObfuscatedName("gi.l")
    public int field2382;

    @ObfuscatedName("gi.t")
    public byte[] field2412;

    @ObfuscatedName("gi.c")
    public short[] field2399;

    @ObfuscatedName("gi.p")
    public short[] field2400;

    @ObfuscatedName("gi.d")
    public short[] field2401;

    @ObfuscatedName("gi.y")
    public int[] field2385;

    @ObfuscatedName("gi.z")
    public int[] field2403;

    @ObfuscatedName("gi.w")
    public int[][] field2391;

    @ObfuscatedName("gi.as")
    public int[][] field2405;

    @ObfuscatedName("gi.ad")
    public int[][] field2406;

    @ObfuscatedName("gi.ao")
    public int[][] field2397;

    @ObfuscatedName("gi.am")
    public class219[] field2408;

    @ObfuscatedName("gi.av")
    public class226[] field2409;

    @ObfuscatedName("gi.au")
    public class226[] field2410;

    @ObfuscatedName("gi.ar")
    public short field2411;

    @ObfuscatedName("gi.at")
    public short field2419;

    @ObfuscatedName("gi.ay")
    public boolean field2413 = false;

    @ObfuscatedName("gi.an")
    public int field2407;

    @ObfuscatedName("gi.ab")
    public int field2423;

    @ObfuscatedName("gi.al")
    public int field2416;

    @ObfuscatedName("gi.ag")
    public int field2415;

    @ObfuscatedName("gi.az")
    public int field2418;

    @ObfuscatedName("gi.ak")
    public static int[] field2404 = new int[10000];

    @ObfuscatedName("gi.af")
    public static int[] field2420 = new int[10000];

    @ObfuscatedName("gi.ai")
    public static int field2421 = 0;

    @ObfuscatedName("gi.ax")
    public static int[] field2422 = class213.field2486;

    @ObfuscatedName("gi.ah")
    public static int[] field2394 = class213.field2509;

    public class208() {
    }

    @ObfuscatedName("gi.h(Lly;II)Lgi;")
    public static class208 method3813(class333 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method5909(arg1, arg2);
        return var3 == null ? null : new class208(var3);
    }

    public class208(byte[] arg0) {
        class467 var2 = new class467(10);
        var2.method7776(-2);
        if (arg0[arg0.length - 1] == -3 && arg0[arg0.length - 2] == -1) {
            this.method3814(arg0);
        } else if (arg0[arg0.length - 1] == -2 && arg0[arg0.length - 2] == -1) {
            this.method3880(arg0);
        } else if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method3894(arg0);
        } else {
            this.method3889(arg0);
        }
    }

    @ObfuscatedName("gi.m([B)V")
    public void method3814(byte[] arg0) {
        class467 var2 = new class467(arg0);
        class467 var3 = new class467(arg0);
        class467 var4 = new class467(arg0);
        class467 var5 = new class467(arg0);
        class467 var6 = new class467(arg0);
        class467 var7 = new class467(arg0);
        class467 var8 = new class467(arg0);
        var2.field4915 = arg0.length - 26;
        int var9 = var2.method7794();
        int var10 = var2.method7794();
        int var11 = var2.method7792();
        int var12 = var2.method7792();
        int var13 = var2.method7792();
        int var14 = var2.method7792();
        int var15 = var2.method7792();
        int var16 = var2.method7792();
        int var17 = var2.method7792();
        int var18 = var2.method7792();
        int var19 = var2.method7794();
        int var20 = var2.method7794();
        int var21 = var2.method7794();
        int var22 = var2.method7794();
        int var23 = var2.method7794();
        int var24 = var2.method7794();
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        if (var11 > 0) {
            this.field2412 = new byte[var11];
            var2.field4915 = 0;
            for (int var28 = 0; var28 < var11; var28++) {
                byte var29 = this.field2412[var28] = var2.method7793();
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
        this.field2398 = var9;
        this.field2386 = var10;
        this.field2382 = var11;
        this.field2387 = new int[var9];
        this.field2384 = new int[var9];
        this.field2414 = new int[var9];
        this.field2379 = new int[var10];
        this.field2388 = new int[var10];
        this.field2389 = new int[var10];
        if (var17 == 1) {
            this.field2385 = new int[var9];
        }
        if (var12 == 1) {
            this.field2390 = new byte[var10];
        }
        if (var13 == 255) {
            this.field2417 = new byte[var10];
        } else {
            this.field2396 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2392 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2403 = new int[var10];
        }
        if (var16 == 1) {
            this.field2395 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field2393 = new byte[var10];
        }
        if (var18 == 1) {
            this.field2406 = new int[var9][];
            this.field2397 = new int[var9][];
        }
        this.field2383 = new short[var10];
        if (var11 > 0) {
            this.field2399 = new short[var11];
            this.field2400 = new short[var11];
            this.field2401 = new short[var11];
        }
        var2.field4915 = var11;
        var3.field4915 = var47;
        var4.field4915 = var49;
        var5.field4915 = var51;
        var6.field4915 = var35;
        int var67 = 0;
        int var68 = 0;
        int var69 = 0;
        for (int var70 = 0; var70 < var9; var70++) {
            int var71 = var2.method7792();
            int var72 = 0;
            if ((var71 & 0x1) != 0) {
                var72 = var3.method7805();
            }
            int var73 = 0;
            if ((var71 & 0x2) != 0) {
                var73 = var4.method7805();
            }
            int var74 = 0;
            if ((var71 & 0x4) != 0) {
                var74 = var5.method7805();
            }
            this.field2387[var70] = var67 + var72;
            this.field2384[var70] = var68 + var73;
            this.field2414[var70] = var69 + var74;
            var67 = this.field2387[var70];
            var68 = this.field2384[var70];
            var69 = this.field2414[var70];
            if (var17 == 1) {
                this.field2385[var70] = var6.method7792();
            }
        }
        if (var18 == 1) {
            for (int var75 = 0; var75 < var9; var75++) {
                int var76 = var6.method7792();
                this.field2406[var75] = new int[var76];
                this.field2397[var75] = new int[var76];
                for (int var77 = 0; var77 < var76; var77++) {
                    this.field2406[var75][var77] = var6.method7792();
                    this.field2397[var75][var77] = var6.method7792();
                }
            }
        }
        var2.field4915 = var45;
        var3.field4915 = var33;
        var4.field4915 = var36;
        var5.field4915 = var40;
        var6.field4915 = var37;
        var7.field4915 = var43;
        var8.field4915 = var42;
        for (int var78 = 0; var78 < var10; var78++) {
            this.field2383[var78] = (short) var2.method7794();
            if (var12 == 1) {
                this.field2390[var78] = var3.method7793();
            }
            if (var13 == 255) {
                this.field2417[var78] = var4.method7793();
            }
            if (var14 == 1) {
                this.field2392[var78] = var5.method7793();
            }
            if (var15 == 1) {
                this.field2403[var78] = var6.method7792();
            }
            if (var16 == 1) {
                this.field2395[var78] = (short) (var7.method7794() - 1);
            }
            if (this.field2393 != null && this.field2395[var78] != -1) {
                this.field2393[var78] = (byte) (var8.method7792() - 1);
            }
        }
        var2.field4915 = var39;
        var3.field4915 = var32;
        int var79 = 0;
        int var80 = 0;
        int var81 = 0;
        int var82 = 0;
        for (int var83 = 0; var83 < var10; var83++) {
            int var84 = var3.method7792();
            if (var84 == 1) {
                var79 = var2.method7805() + var82;
                var80 = var2.method7805() + var79;
                var81 = var2.method7805() + var80;
                var82 = var81;
                this.field2379[var83] = var79;
                this.field2388[var83] = var80;
                this.field2389[var83] = var81;
            }
            if (var84 == 2) {
                var80 = var81;
                var81 = var2.method7805() + var82;
                var82 = var81;
                this.field2379[var83] = var79;
                this.field2388[var83] = var80;
                this.field2389[var83] = var81;
            }
            if (var84 == 3) {
                var79 = var81;
                var81 = var2.method7805() + var82;
                var82 = var81;
                this.field2379[var83] = var79;
                this.field2388[var83] = var80;
                this.field2389[var83] = var81;
            }
            if (var84 == 4) {
                int var87 = var79;
                var79 = var80;
                var80 = var87;
                var81 = var2.method7805() + var82;
                var82 = var81;
                this.field2379[var83] = var79;
                this.field2388[var83] = var87;
                this.field2389[var83] = var81;
            }
        }
        var2.field4915 = var53;
        var3.field4915 = var55;
        var4.field4915 = var57;
        var5.field4915 = var59;
        var6.field4915 = var61;
        var7.field4915 = var63;
        for (int var88 = 0; var88 < var11; var88++) {
            int var89 = this.field2412[var88] & 0xFF;
            if (var89 == 0) {
                this.field2399[var88] = (short) var2.method7794();
                this.field2400[var88] = (short) var2.method7794();
                this.field2401[var88] = (short) var2.method7794();
            }
        }
        var2.field4915 = var65;
        int var90 = var2.method7792();
        if (var90 == 0) {
            return;
        }
        new class228();
        var2.method7794();
        var2.method7794();
        var2.method7794();
        var2.method7946();
    }

    @ObfuscatedName("gi.q([B)V")
    public void method3880(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class467 var4 = new class467(arg0);
        class467 var5 = new class467(arg0);
        class467 var6 = new class467(arg0);
        class467 var7 = new class467(arg0);
        class467 var8 = new class467(arg0);
        var4.field4915 = arg0.length - 23;
        int var9 = var4.method7794();
        int var10 = var4.method7794();
        int var11 = var4.method7792();
        int var12 = var4.method7792();
        int var13 = var4.method7792();
        int var14 = var4.method7792();
        int var15 = var4.method7792();
        int var16 = var4.method7792();
        int var17 = var4.method7792();
        int var18 = var4.method7794();
        int var19 = var4.method7794();
        int var20 = var4.method7794();
        int var21 = var4.method7794();
        int var22 = var4.method7794();
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
        this.field2398 = var9;
        this.field2386 = var10;
        this.field2382 = var11;
        this.field2387 = new int[var9];
        this.field2384 = new int[var9];
        this.field2414 = new int[var9];
        this.field2379 = new int[var10];
        this.field2388 = new int[var10];
        this.field2389 = new int[var10];
        if (var11 > 0) {
            this.field2412 = new byte[var11];
            this.field2399 = new short[var11];
            this.field2400 = new short[var11];
            this.field2401 = new short[var11];
        }
        if (var16 == 1) {
            this.field2385 = new int[var9];
        }
        if (var12 == 1) {
            this.field2390 = new byte[var10];
            this.field2393 = new byte[var10];
            this.field2395 = new short[var10];
        }
        if (var13 == 255) {
            this.field2417 = new byte[var10];
        } else {
            this.field2396 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2392 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2403 = new int[var10];
        }
        if (var17 == 1) {
            this.field2406 = new int[var9][];
            this.field2397 = new int[var9][];
        }
        this.field2383 = new short[var10];
        var4.field4915 = var23;
        var5.field4915 = var39;
        var6.field4915 = var41;
        var7.field4915 = var43;
        var8.field4915 = var27;
        int var46 = 0;
        int var47 = 0;
        int var48 = 0;
        for (int var49 = 0; var49 < var9; var49++) {
            int var50 = var4.method7792();
            int var51 = 0;
            if ((var50 & 0x1) != 0) {
                var51 = var5.method7805();
            }
            int var52 = 0;
            if ((var50 & 0x2) != 0) {
                var52 = var6.method7805();
            }
            int var53 = 0;
            if ((var50 & 0x4) != 0) {
                var53 = var7.method7805();
            }
            this.field2387[var49] = var46 + var51;
            this.field2384[var49] = var47 + var52;
            this.field2414[var49] = var48 + var53;
            var46 = this.field2387[var49];
            var47 = this.field2384[var49];
            var48 = this.field2414[var49];
            if (var16 == 1) {
                this.field2385[var49] = var8.method7792();
            }
        }
        if (var17 == 1) {
            for (int var54 = 0; var54 < var9; var54++) {
                int var55 = var8.method7792();
                this.field2406[var54] = new int[var55];
                this.field2397[var54] = new int[var55];
                for (int var56 = 0; var56 < var55; var56++) {
                    this.field2406[var54][var56] = var8.method7792();
                    this.field2397[var54][var56] = var8.method7792();
                }
            }
        }
        var4.field4915 = var35;
        var5.field4915 = var30;
        var6.field4915 = var28;
        var7.field4915 = var33;
        var8.field4915 = var29;
        for (int var57 = 0; var57 < var10; var57++) {
            this.field2383[var57] = (short) var4.method7794();
            if (var12 == 1) {
                int var58 = var5.method7792();
                if ((var58 & 0x1) == 1) {
                    this.field2390[var57] = 1;
                    var2 = true;
                } else {
                    this.field2390[var57] = 0;
                }
                if ((var58 & 0x2) == 2) {
                    this.field2393[var57] = (byte) (var58 >> 2);
                    this.field2395[var57] = this.field2383[var57];
                    this.field2383[var57] = 127;
                    if (this.field2395[var57] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field2393[var57] = -1;
                    this.field2395[var57] = -1;
                }
            }
            if (var13 == 255) {
                this.field2417[var57] = var6.method7793();
            }
            if (var14 == 1) {
                this.field2392[var57] = var7.method7793();
            }
            if (var15 == 1) {
                this.field2403[var57] = var8.method7792();
            }
        }
        var4.field4915 = var32;
        var5.field4915 = var25;
        int var59 = 0;
        int var60 = 0;
        int var61 = 0;
        int var62 = 0;
        for (int var63 = 0; var63 < var10; var63++) {
            int var64 = var5.method7792();
            if (var64 == 1) {
                var59 = var4.method7805() + var62;
                var60 = var4.method7805() + var59;
                var61 = var4.method7805() + var60;
                var62 = var61;
                this.field2379[var63] = var59;
                this.field2388[var63] = var60;
                this.field2389[var63] = var61;
            }
            if (var64 == 2) {
                var60 = var61;
                var61 = var4.method7805() + var62;
                var62 = var61;
                this.field2379[var63] = var59;
                this.field2388[var63] = var60;
                this.field2389[var63] = var61;
            }
            if (var64 == 3) {
                var59 = var61;
                var61 = var4.method7805() + var62;
                var62 = var61;
                this.field2379[var63] = var59;
                this.field2388[var63] = var60;
                this.field2389[var63] = var61;
            }
            if (var64 == 4) {
                int var67 = var59;
                var59 = var60;
                var60 = var67;
                var61 = var4.method7805() + var62;
                var62 = var61;
                this.field2379[var63] = var59;
                this.field2388[var63] = var67;
                this.field2389[var63] = var61;
            }
        }
        var4.field4915 = var37;
        for (int var68 = 0; var68 < var11; var68++) {
            this.field2412[var68] = 0;
            this.field2399[var68] = (short) var4.method7794();
            this.field2400[var68] = (short) var4.method7794();
            this.field2401[var68] = (short) var4.method7794();
        }
        if (this.field2393 != null) {
            boolean var69 = false;
            for (int var70 = 0; var70 < var10; var70++) {
                int var71 = this.field2393[var70] & 0xFF;
                if (var71 != 255) {
                    if ((this.field2399[var71] & 0xFFFF) == this.field2379[var70] && (this.field2400[var71] & 0xFFFF) == this.field2388[var70] && (this.field2401[var71] & 0xFFFF) == this.field2389[var70]) {
                        this.field2393[var70] = -1;
                    } else {
                        var69 = true;
                    }
                }
            }
            if (!var69) {
                this.field2393 = null;
            }
        }
        if (!var3) {
            this.field2395 = null;
        }
        if (!var2) {
            this.field2390 = null;
        }
    }

    @ObfuscatedName("gi.f([B)V")
    public void method3894(byte[] arg0) {
        class467 var2 = new class467(arg0);
        class467 var3 = new class467(arg0);
        class467 var4 = new class467(arg0);
        class467 var5 = new class467(arg0);
        class467 var6 = new class467(arg0);
        class467 var7 = new class467(arg0);
        class467 var8 = new class467(arg0);
        var2.field4915 = arg0.length - 23;
        int var9 = var2.method7794();
        int var10 = var2.method7794();
        int var11 = var2.method7792();
        int var12 = var2.method7792();
        int var13 = var2.method7792();
        int var14 = var2.method7792();
        int var15 = var2.method7792();
        int var16 = var2.method7792();
        int var17 = var2.method7792();
        int var18 = var2.method7794();
        int var19 = var2.method7794();
        int var20 = var2.method7794();
        int var21 = var2.method7794();
        int var22 = var2.method7794();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field2412 = new byte[var11];
            var2.field4915 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field2412[var26] = var2.method7793();
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
        this.field2398 = var9;
        this.field2386 = var10;
        this.field2382 = var11;
        this.field2387 = new int[var9];
        this.field2384 = new int[var9];
        this.field2414 = new int[var9];
        this.field2379 = new int[var10];
        this.field2388 = new int[var10];
        this.field2389 = new int[var10];
        if (var17 == 1) {
            this.field2385 = new int[var9];
        }
        if (var12 == 1) {
            this.field2390 = new byte[var10];
        }
        if (var13 == 255) {
            this.field2417 = new byte[var10];
        } else {
            this.field2396 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2392 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2403 = new int[var10];
        }
        if (var16 == 1) {
            this.field2395 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field2393 = new byte[var10];
        }
        this.field2383 = new short[var10];
        if (var11 > 0) {
            this.field2399 = new short[var11];
            this.field2400 = new short[var11];
            this.field2401 = new short[var11];
        }
        var2.field4915 = var11;
        var3.field4915 = var44;
        var4.field4915 = var46;
        var5.field4915 = var48;
        var6.field4915 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method7792();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method7805();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method7805();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method7805();
            }
            this.field2387[var67] = var64 + var69;
            this.field2384[var67] = var65 + var70;
            this.field2414[var67] = var66 + var71;
            var64 = this.field2387[var67];
            var65 = this.field2384[var67];
            var66 = this.field2414[var67];
            if (var17 == 1) {
                this.field2385[var67] = var6.method7792();
            }
        }
        var2.field4915 = var42;
        var3.field4915 = var31;
        var4.field4915 = var34;
        var5.field4915 = var37;
        var6.field4915 = var35;
        var7.field4915 = var40;
        var8.field4915 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field2383[var72] = (short) var2.method7794();
            if (var12 == 1) {
                this.field2390[var72] = var3.method7793();
            }
            if (var13 == 255) {
                this.field2417[var72] = var4.method7793();
            }
            if (var14 == 1) {
                this.field2392[var72] = var5.method7793();
            }
            if (var15 == 1) {
                this.field2403[var72] = var6.method7792();
            }
            if (var16 == 1) {
                this.field2395[var72] = (short) (var7.method7794() - 1);
            }
            if (this.field2393 != null && this.field2395[var72] != -1) {
                this.field2393[var72] = (byte) (var8.method7792() - 1);
            }
        }
        var2.field4915 = var33;
        var3.field4915 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method7792();
            if (var78 == 1) {
                var73 = var2.method7805() + var76;
                var74 = var2.method7805() + var73;
                var75 = var2.method7805() + var74;
                var76 = var75;
                this.field2379[var77] = var73;
                this.field2388[var77] = var74;
                this.field2389[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method7805() + var76;
                var76 = var75;
                this.field2379[var77] = var73;
                this.field2388[var77] = var74;
                this.field2389[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method7805() + var76;
                var76 = var75;
                this.field2379[var77] = var73;
                this.field2388[var77] = var74;
                this.field2389[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method7805() + var76;
                var76 = var75;
                this.field2379[var77] = var73;
                this.field2388[var77] = var81;
                this.field2389[var77] = var75;
            }
        }
        var2.field4915 = var50;
        var3.field4915 = var52;
        var4.field4915 = var54;
        var5.field4915 = var56;
        var6.field4915 = var58;
        var7.field4915 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field2412[var82] & 0xFF;
            if (var83 == 0) {
                this.field2399[var82] = (short) var2.method7794();
                this.field2400[var82] = (short) var2.method7794();
                this.field2401[var82] = (short) var2.method7794();
            }
        }
        var2.field4915 = var62;
        int var84 = var2.method7792();
        if (var84 == 0) {
            return;
        }
        new class228();
        var2.method7794();
        var2.method7794();
        var2.method7794();
        var2.method7946();
    }

    @ObfuscatedName("gi.r([B)V")
    public void method3889(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class467 var4 = new class467(arg0);
        class467 var5 = new class467(arg0);
        class467 var6 = new class467(arg0);
        class467 var7 = new class467(arg0);
        class467 var8 = new class467(arg0);
        var4.field4915 = arg0.length - 18;
        int var9 = var4.method7794();
        int var10 = var4.method7794();
        int var11 = var4.method7792();
        int var12 = var4.method7792();
        int var13 = var4.method7792();
        int var14 = var4.method7792();
        int var15 = var4.method7792();
        int var16 = var4.method7792();
        int var17 = var4.method7794();
        int var18 = var4.method7794();
        int var19 = var4.method7794();
        int var20 = var4.method7794();
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
        this.field2398 = var9;
        this.field2386 = var10;
        this.field2382 = var11;
        this.field2387 = new int[var9];
        this.field2384 = new int[var9];
        this.field2414 = new int[var9];
        this.field2379 = new int[var10];
        this.field2388 = new int[var10];
        this.field2389 = new int[var10];
        if (var11 > 0) {
            this.field2412 = new byte[var11];
            this.field2399 = new short[var11];
            this.field2400 = new short[var11];
            this.field2401 = new short[var11];
        }
        if (var16 == 1) {
            this.field2385 = new int[var9];
        }
        if (var12 == 1) {
            this.field2390 = new byte[var10];
            this.field2393 = new byte[var10];
            this.field2395 = new short[var10];
        }
        if (var13 == 255) {
            this.field2417 = new byte[var10];
        } else {
            this.field2396 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2392 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2403 = new int[var10];
        }
        this.field2383 = new short[var10];
        var4.field4915 = var21;
        var5.field4915 = var36;
        var6.field4915 = var38;
        var7.field4915 = var40;
        var8.field4915 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method7792();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method7805();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method7805();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method7805();
            }
            this.field2387[var46] = var43 + var48;
            this.field2384[var46] = var44 + var49;
            this.field2414[var46] = var45 + var50;
            var43 = this.field2387[var46];
            var44 = this.field2384[var46];
            var45 = this.field2414[var46];
            if (var16 == 1) {
                this.field2385[var46] = var8.method7792();
            }
        }
        var4.field4915 = var32;
        var5.field4915 = var28;
        var6.field4915 = var26;
        var7.field4915 = var30;
        var8.field4915 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field2383[var51] = (short) var4.method7794();
            if (var12 == 1) {
                int var52 = var5.method7792();
                if ((var52 & 0x1) == 1) {
                    this.field2390[var51] = 1;
                    var2 = true;
                } else {
                    this.field2390[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field2393[var51] = (byte) (var52 >> 2);
                    this.field2395[var51] = this.field2383[var51];
                    this.field2383[var51] = 127;
                    if (this.field2395[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field2393[var51] = -1;
                    this.field2395[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field2417[var51] = var6.method7793();
            }
            if (var14 == 1) {
                this.field2392[var51] = var7.method7793();
            }
            if (var15 == 1) {
                this.field2403[var51] = var8.method7792();
            }
        }
        var4.field4915 = var25;
        var5.field4915 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method7792();
            if (var58 == 1) {
                var53 = var4.method7805() + var56;
                var54 = var4.method7805() + var53;
                var55 = var4.method7805() + var54;
                var56 = var55;
                this.field2379[var57] = var53;
                this.field2388[var57] = var54;
                this.field2389[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method7805() + var56;
                var56 = var55;
                this.field2379[var57] = var53;
                this.field2388[var57] = var54;
                this.field2389[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method7805() + var56;
                var56 = var55;
                this.field2379[var57] = var53;
                this.field2388[var57] = var54;
                this.field2389[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method7805() + var56;
                var56 = var55;
                this.field2379[var57] = var53;
                this.field2388[var57] = var61;
                this.field2389[var57] = var55;
            }
        }
        var4.field4915 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field2412[var62] = 0;
            this.field2399[var62] = (short) var4.method7794();
            this.field2400[var62] = (short) var4.method7794();
            this.field2401[var62] = (short) var4.method7794();
        }
        if (this.field2393 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field2393[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field2399[var65] & 0xFFFF) == this.field2379[var64] && (this.field2400[var65] & 0xFFFF) == this.field2388[var64] && (this.field2401[var65] & 0xFFFF) == this.field2389[var64]) {
                        this.field2393[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field2393 = null;
            }
        }
        if (!var3) {
            this.field2395 = null;
        }
        if (!var2) {
            this.field2390 = null;
        }
    }

    public class208(class208[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        this.field2398 = 0;
        this.field2386 = 0;
        this.field2382 = 0;
        this.field2396 = -1;
        for (int var10 = 0; var10 < arg1; var10++) {
            class208 var11 = arg0[var10];
            if (var11 != null) {
                this.field2398 += var11.field2398;
                this.field2386 += var11.field2386;
                this.field2382 += var11.field2382;
                if (var11.field2417 == null) {
                    if (this.field2396 == -1) {
                        this.field2396 = var11.field2396;
                    }
                    if (this.field2396 != var11.field2396) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var11.field2390 != null;
                var5 |= var11.field2392 != null;
                var6 |= var11.field2403 != null;
                var7 |= var11.field2395 != null;
                var8 |= var11.field2393 != null;
                var9 |= var11.field2406 != null;
            }
        }
        this.field2387 = new int[this.field2398];
        this.field2384 = new int[this.field2398];
        this.field2414 = new int[this.field2398];
        this.field2385 = new int[this.field2398];
        this.field2379 = new int[this.field2386];
        this.field2388 = new int[this.field2386];
        this.field2389 = new int[this.field2386];
        if (var3) {
            this.field2390 = new byte[this.field2386];
        }
        if (var4) {
            this.field2417 = new byte[this.field2386];
        }
        if (var5) {
            this.field2392 = new byte[this.field2386];
        }
        if (var6) {
            this.field2403 = new int[this.field2386];
        }
        if (var7) {
            this.field2395 = new short[this.field2386];
        }
        if (var8) {
            this.field2393 = new byte[this.field2386];
        }
        if (var9) {
            this.field2406 = new int[this.field2398][];
            this.field2397 = new int[this.field2398][];
        }
        this.field2383 = new short[this.field2386];
        if (this.field2382 > 0) {
            this.field2412 = new byte[this.field2382];
            this.field2399 = new short[this.field2382];
            this.field2400 = new short[this.field2382];
            this.field2401 = new short[this.field2382];
        }
        this.field2398 = 0;
        this.field2386 = 0;
        this.field2382 = 0;
        for (int var12 = 0; var12 < arg1; var12++) {
            class208 var13 = arg0[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < var13.field2386; var14++) {
                    if (var3 && var13.field2390 != null) {
                        this.field2390[this.field2386] = var13.field2390[var14];
                    }
                    if (var4) {
                        if (var13.field2417 == null) {
                            this.field2417[this.field2386] = var13.field2396;
                        } else {
                            this.field2417[this.field2386] = var13.field2417[var14];
                        }
                    }
                    if (var5 && var13.field2392 != null) {
                        this.field2392[this.field2386] = var13.field2392[var14];
                    }
                    if (var6 && var13.field2403 != null) {
                        this.field2403[this.field2386] = var13.field2403[var14];
                    }
                    if (var7) {
                        if (var13.field2395 == null) {
                            this.field2395[this.field2386] = -1;
                        } else {
                            this.field2395[this.field2386] = var13.field2395[var14];
                        }
                    }
                    if (var8) {
                        if (var13.field2393 == null || var13.field2393[var14] == -1) {
                            this.field2393[this.field2386] = -1;
                        } else {
                            this.field2393[this.field2386] = (byte) (var13.field2393[var14] + this.field2382);
                        }
                    }
                    this.field2383[this.field2386] = var13.field2383[var14];
                    this.field2379[this.field2386] = this.method3819(var13, var13.field2379[var14]);
                    this.field2388[this.field2386] = this.method3819(var13, var13.field2388[var14]);
                    this.field2389[this.field2386] = this.method3819(var13, var13.field2389[var14]);
                    this.field2386++;
                }
                for (int var15 = 0; var15 < var13.field2382; var15++) {
                    byte var16 = this.field2412[this.field2382] = var13.field2412[var15];
                    if (var16 == 0) {
                        this.field2399[this.field2382] = (short) this.method3819(var13, var13.field2399[var15]);
                        this.field2400[this.field2382] = (short) this.method3819(var13, var13.field2400[var15]);
                        this.field2401[this.field2382] = (short) this.method3819(var13, var13.field2401[var15]);
                    }
                    this.field2382++;
                }
            }
        }
    }

    @ObfuscatedName("gi.u(Lgi;I)I")
    public final int method3819(class208 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field2387[arg1];
        int var5 = arg0.field2384[arg1];
        int var6 = arg0.field2414[arg1];
        for (int var7 = 0; var7 < this.field2398; var7++) {
            if (this.field2387[var7] == var4 && this.field2384[var7] == var5 && this.field2414[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field2387[this.field2398] = var4;
            this.field2384[this.field2398] = var5;
            this.field2414[this.field2398] = var6;
            if (arg0.field2385 != null) {
                this.field2385[this.field2398] = arg0.field2385[arg1];
            }
            if (arg0.field2406 != null) {
                this.field2406[this.field2398] = arg0.field2406[arg1];
                this.field2397[this.field2398] = arg0.field2397[arg1];
            }
            var3 = this.field2398++;
        }
        return var3;
    }

    public class208(class208 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field2398 = arg0.field2398;
        this.field2386 = arg0.field2386;
        this.field2382 = arg0.field2382;
        if (arg1) {
            this.field2387 = arg0.field2387;
            this.field2384 = arg0.field2384;
            this.field2414 = arg0.field2414;
        } else {
            this.field2387 = new int[this.field2398];
            this.field2384 = new int[this.field2398];
            this.field2414 = new int[this.field2398];
            for (int var6 = 0; var6 < this.field2398; var6++) {
                this.field2387[var6] = arg0.field2387[var6];
                this.field2384[var6] = arg0.field2384[var6];
                this.field2414[var6] = arg0.field2414[var6];
            }
        }
        if (arg2) {
            this.field2383 = arg0.field2383;
        } else {
            this.field2383 = new short[this.field2386];
            for (int var7 = 0; var7 < this.field2386; var7++) {
                this.field2383[var7] = arg0.field2383[var7];
            }
        }
        if (arg3 || arg0.field2395 == null) {
            this.field2395 = arg0.field2395;
        } else {
            this.field2395 = new short[this.field2386];
            for (int var8 = 0; var8 < this.field2386; var8++) {
                this.field2395[var8] = arg0.field2395[var8];
            }
        }
        if (arg4) {
            this.field2392 = arg0.field2392;
        } else {
            this.field2392 = new byte[this.field2386];
            if (arg0.field2392 == null) {
                for (int var9 = 0; var9 < this.field2386; var9++) {
                    this.field2392[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field2386; var10++) {
                    this.field2392[var10] = arg0.field2392[var10];
                }
            }
        }
        this.field2379 = arg0.field2379;
        this.field2388 = arg0.field2388;
        this.field2389 = arg0.field2389;
        this.field2390 = arg0.field2390;
        this.field2417 = arg0.field2417;
        this.field2393 = arg0.field2393;
        this.field2396 = arg0.field2396;
        this.field2412 = arg0.field2412;
        this.field2399 = arg0.field2399;
        this.field2400 = arg0.field2400;
        this.field2401 = arg0.field2401;
        this.field2385 = arg0.field2385;
        this.field2403 = arg0.field2403;
        this.field2391 = arg0.field2391;
        this.field2405 = arg0.field2405;
        this.field2409 = arg0.field2409;
        this.field2408 = arg0.field2408;
        this.field2410 = arg0.field2410;
        this.field2406 = arg0.field2406;
        this.field2397 = arg0.field2397;
        this.field2411 = arg0.field2411;
        this.field2419 = arg0.field2419;
    }

    @ObfuscatedName("gi.b()Lgi;")
    public class208 method3818() {
        class208 var1 = new class208();
        if (this.field2390 != null) {
            var1.field2390 = new byte[this.field2386];
            for (int var2 = 0; var2 < this.field2386; var2++) {
                var1.field2390[var2] = this.field2390[var2];
            }
        }
        var1.field2398 = this.field2398;
        var1.field2386 = this.field2386;
        var1.field2382 = this.field2382;
        var1.field2387 = this.field2387;
        var1.field2384 = this.field2384;
        var1.field2414 = this.field2414;
        var1.field2379 = this.field2379;
        var1.field2388 = this.field2388;
        var1.field2389 = this.field2389;
        var1.field2417 = this.field2417;
        var1.field2392 = this.field2392;
        var1.field2393 = this.field2393;
        var1.field2383 = this.field2383;
        var1.field2395 = this.field2395;
        var1.field2396 = this.field2396;
        var1.field2412 = this.field2412;
        var1.field2399 = this.field2399;
        var1.field2400 = this.field2400;
        var1.field2401 = this.field2401;
        var1.field2385 = this.field2385;
        var1.field2403 = this.field2403;
        var1.field2391 = this.field2391;
        var1.field2405 = this.field2405;
        var1.field2409 = this.field2409;
        var1.field2408 = this.field2408;
        var1.field2411 = this.field2411;
        var1.field2419 = this.field2419;
        return var1;
    }

    @ObfuscatedName("gi.j([[IIIIZI)Lgi;")
    public class208 method3821(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method3834();
        int var7 = this.field2423 + arg1;
        int var8 = this.field2416 + arg1;
        int var9 = this.field2418 + arg3;
        int var10 = this.field2415 + arg3;
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
        class208 var15;
        if (arg4) {
            var15 = new class208();
            var15.field2398 = this.field2398;
            var15.field2386 = this.field2386;
            var15.field2382 = this.field2382;
            var15.field2387 = this.field2387;
            var15.field2414 = this.field2414;
            var15.field2379 = this.field2379;
            var15.field2388 = this.field2388;
            var15.field2389 = this.field2389;
            var15.field2390 = this.field2390;
            var15.field2417 = this.field2417;
            var15.field2392 = this.field2392;
            var15.field2393 = this.field2393;
            var15.field2383 = this.field2383;
            var15.field2395 = this.field2395;
            var15.field2396 = this.field2396;
            var15.field2412 = this.field2412;
            var15.field2399 = this.field2399;
            var15.field2400 = this.field2400;
            var15.field2401 = this.field2401;
            var15.field2385 = this.field2385;
            var15.field2403 = this.field2403;
            var15.field2391 = this.field2391;
            var15.field2405 = this.field2405;
            var15.field2411 = this.field2411;
            var15.field2419 = this.field2419;
            var15.field2384 = new int[var15.field2398];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field2398; var16++) {
                int var17 = this.field2387[var16] + arg1;
                int var18 = this.field2414[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field2384[var16] = this.field2384[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field2398; var26++) {
                int var27 = (-this.field2384[var26] << 16) / this.field2603;
                if (var27 < arg5) {
                    int var28 = this.field2387[var26] + arg1;
                    int var29 = this.field2414[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field2384[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field2384[var26];
                }
            }
        }
        var15.method3833();
        return var15;
    }

    @ObfuscatedName("gi.g()V")
    public void method3822() {
        int var10002;
        if (this.field2385 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field2398; var3++) {
                int var4 = this.field2385[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field2391 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field2391[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field2398) {
                int var7 = this.field2385[var6];
                this.field2391[var7][var1[var7]++] = var6++;
            }
            this.field2385 = null;
        }
        if (this.field2403 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field2386; var10++) {
            int var11 = this.field2403[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field2405 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field2405[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field2386) {
            int var14 = this.field2403[var13];
            this.field2405[var14][var8[var14]++] = var13++;
        }
        this.field2403 = null;
    }

    @ObfuscatedName("gi.i()V")
    public void method3823() {
        for (int var1 = 0; var1 < this.field2398; var1++) {
            int var2 = this.field2387[var1];
            this.field2387[var1] = this.field2414[var1];
            this.field2414[var1] = -var2;
        }
        this.method3833();
    }

    @ObfuscatedName("gi.o()V")
    public void method3862() {
        for (int var1 = 0; var1 < this.field2398; var1++) {
            this.field2387[var1] = -this.field2387[var1];
            this.field2414[var1] = -this.field2414[var1];
        }
        this.method3833();
    }

    @ObfuscatedName("gi.n()V")
    public void method3825() {
        for (int var1 = 0; var1 < this.field2398; var1++) {
            int var2 = this.field2414[var1];
            this.field2414[var1] = this.field2387[var1];
            this.field2387[var1] = -var2;
        }
        this.method3833();
    }

    @ObfuscatedName("gi.k(I)V")
    public void method3826(int arg0) {
        int var2 = field2422[arg0];
        int var3 = field2394[arg0];
        for (int var4 = 0; var4 < this.field2398; var4++) {
            int var5 = this.field2414[var4] * var2 + this.field2387[var4] * var3 >> 16;
            this.field2414[var4] = this.field2414[var4] * var3 - this.field2387[var4] * var2 >> 16;
            this.field2387[var4] = var5;
        }
        this.method3833();
    }

    @ObfuscatedName("gi.a(III)V")
    public void method3827(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2398; var4++) {
            this.field2387[var4] += arg0;
            this.field2384[var4] += arg1;
            this.field2414[var4] += arg2;
        }
        this.method3833();
    }

    @ObfuscatedName("gi.s(SS)V")
    public void method3828(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2386; var3++) {
            if (this.field2383[var3] == arg0) {
                this.field2383[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("gi.l(SS)V")
    public void method3829(short arg0, short arg1) {
        if (this.field2395 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field2386; var3++) {
            if (this.field2395[var3] == arg0) {
                this.field2395[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("gi.t()V")
    public void method3830() {
        for (int var1 = 0; var1 < this.field2398; var1++) {
            this.field2414[var1] = -this.field2414[var1];
        }
        for (int var2 = 0; var2 < this.field2386; var2++) {
            int var3 = this.field2379[var2];
            this.field2379[var2] = this.field2389[var2];
            this.field2389[var2] = var3;
        }
        this.method3833();
    }

    @ObfuscatedName("gi.c(III)V")
    public void method3831(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2398; var4++) {
            this.field2387[var4] = this.field2387[var4] * arg0 / 128;
            this.field2384[var4] = this.field2384[var4] * arg1 / 128;
            this.field2414[var4] = this.field2414[var4] * arg2 / 128;
        }
        this.method3833();
    }

    @ObfuscatedName("gi.p()V")
    public void method3832() {
        if (this.field2409 != null) {
            return;
        }
        this.field2409 = new class226[this.field2398];
        for (int var1 = 0; var1 < this.field2398; var1++) {
            this.field2409[var1] = new class226();
        }
        for (int var2 = 0; var2 < this.field2386; var2++) {
            int var3 = this.field2379[var2];
            int var4 = this.field2388[var2];
            int var5 = this.field2389[var2];
            int var6 = this.field2387[var4] - this.field2387[var3];
            int var7 = this.field2384[var4] - this.field2384[var3];
            int var8 = this.field2414[var4] - this.field2414[var3];
            int var9 = this.field2387[var5] - this.field2387[var3];
            int var10 = this.field2384[var5] - this.field2384[var3];
            int var11 = this.field2414[var5] - this.field2414[var3];
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
            if (this.field2390 == null) {
                var19 = 0;
            } else {
                var19 = this.field2390[var2];
            }
            if (var19 == 0) {
                class226 var20 = this.field2409[var3];
                var20.field2758 += var16;
                var20.field2761 += var17;
                var20.field2759 += var18;
                var20.field2760++;
                class226 var21 = this.field2409[var4];
                var21.field2758 += var16;
                var21.field2761 += var17;
                var21.field2759 += var18;
                var21.field2760++;
                class226 var22 = this.field2409[var5];
                var22.field2758 += var16;
                var22.field2761 += var17;
                var22.field2759 += var18;
                var22.field2760++;
            } else if (var19 == 1) {
                if (this.field2408 == null) {
                    this.field2408 = new class219[this.field2386];
                }
                class219 var23 = this.field2408[var2] = new class219();
                var23.field2606 = var16;
                var23.field2605 = var17;
                var23.field2608 = var18;
            }
        }
    }

    @ObfuscatedName("gi.d()V")
    public void method3833() {
        this.field2409 = null;
        this.field2410 = null;
        this.field2408 = null;
        this.field2413 = false;
    }

    @ObfuscatedName("gi.y()V")
    public void method3834() {
        if (this.field2413) {
            return;
        }
        this.field2603 = 0;
        this.field2407 = 0;
        this.field2423 = 999999;
        this.field2416 = -999999;
        this.field2415 = -99999;
        this.field2418 = 99999;
        for (int var1 = 0; var1 < this.field2398; var1++) {
            int var2 = this.field2387[var1];
            int var3 = this.field2384[var1];
            int var4 = this.field2414[var1];
            if (var2 < this.field2423) {
                this.field2423 = var2;
            }
            if (var2 > this.field2416) {
                this.field2416 = var2;
            }
            if (var4 < this.field2418) {
                this.field2418 = var4;
            }
            if (var4 > this.field2415) {
                this.field2415 = var4;
            }
            if (-var3 > this.field2603) {
                this.field2603 = -var3;
            }
            if (var3 > this.field2407) {
                this.field2407 = var3;
            }
        }
        this.field2413 = true;
    }

    @ObfuscatedName("gi.z(Lgi;Lgi;IIIZ)V")
    public static void method3835(class208 arg0, class208 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method3834();
        arg0.method3832();
        arg1.method3834();
        arg1.method3832();
        field2421++;
        int var6 = 0;
        int[] var7 = arg1.field2387;
        int var8 = arg1.field2398;
        for (int var9 = 0; var9 < arg0.field2398; var9++) {
            class226 var10 = arg0.field2409[var9];
            if (var10.field2760 != 0) {
                int var11 = arg0.field2384[var9] - arg3;
                if (var11 <= arg1.field2407) {
                    int var12 = arg0.field2387[var9] - arg2;
                    if (var12 >= arg1.field2423 && var12 <= arg1.field2416) {
                        int var13 = arg0.field2414[var9] - arg4;
                        if (var13 >= arg1.field2418 && var13 <= arg1.field2415) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class226 var15 = arg1.field2409[var14];
                                if (var7[var14] == var12 && arg1.field2414[var14] == var13 && arg1.field2384[var14] == var11 && var15.field2760 != 0) {
                                    if (arg0.field2410 == null) {
                                        arg0.field2410 = new class226[arg0.field2398];
                                    }
                                    if (arg1.field2410 == null) {
                                        arg1.field2410 = new class226[var8];
                                    }
                                    class226 var16 = arg0.field2410[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field2410[var9] = new class226(var10);
                                    }
                                    class226 var17 = arg1.field2410[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field2410[var14] = new class226(var15);
                                    }
                                    var16.field2758 += var15.field2758;
                                    var16.field2761 += var15.field2761;
                                    var16.field2759 += var15.field2759;
                                    var16.field2760 += var15.field2760;
                                    var17.field2758 += var10.field2758;
                                    var17.field2761 += var10.field2761;
                                    var17.field2759 += var10.field2759;
                                    var17.field2760 += var10.field2760;
                                    var6++;
                                    field2404[var9] = field2421;
                                    field2420[var14] = field2421;
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
        for (int var18 = 0; var18 < arg0.field2386; var18++) {
            if (field2404[arg0.field2379[var18]] == field2421 && field2404[arg0.field2388[var18]] == field2421 && field2404[arg0.field2389[var18]] == field2421) {
                if (arg0.field2390 == null) {
                    arg0.field2390 = new byte[arg0.field2386];
                }
                arg0.field2390[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field2386; var19++) {
            if (field2420[arg1.field2379[var19]] == field2421 && field2420[arg1.field2388[var19]] == field2421 && field2420[arg1.field2389[var19]] == field2421) {
                if (arg1.field2390 == null) {
                    arg1.field2390 = new byte[arg1.field2386];
                }
                arg1.field2390[var19] = 2;
            }
        }
    }

    @ObfuscatedName("gi.w(IIIII)Lhh;")
    public final class224 method3836(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method3832();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class224 var8 = new class224();
        var8.field2683 = new int[this.field2386];
        var8.field2718 = new int[this.field2386];
        var8.field2685 = new int[this.field2386];
        if (this.field2382 > 0 && this.field2393 != null) {
            int[] var9 = new int[this.field2382];
            for (int var10 = 0; var10 < this.field2386; var10++) {
                if (this.field2393[var10] != -1) {
                    var9[this.field2393[var10] & 0xFF]++;
                }
            }
            var8.field2724 = 0;
            for (int var11 = 0; var11 < this.field2382; var11++) {
                if (var9[var11] > 0 && this.field2412[var11] == 0) {
                    var8.field2724++;
                }
            }
            var8.field2679 = new int[var8.field2724];
            var8.field2693 = new int[var8.field2724];
            var8.field2694 = new int[var8.field2724];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field2382; var13++) {
                if (var9[var13] > 0 && this.field2412[var13] == 0) {
                    var8.field2679[var12] = this.field2399[var13] & 0xFFFF;
                    var8.field2693[var12] = this.field2400[var13] & 0xFFFF;
                    var8.field2694[var12] = this.field2401[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field2703 = new byte[this.field2386];
            for (int var14 = 0; var14 < this.field2386; var14++) {
                if (this.field2393[var14] == -1) {
                    var8.field2703[var14] = -1;
                } else {
                    var8.field2703[var14] = (byte) var9[this.field2393[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field2386; var15++) {
            byte var16;
            if (this.field2390 == null) {
                var16 = 0;
            } else {
                var16 = this.field2390[var15];
            }
            byte var17;
            if (this.field2392 == null) {
                var17 = 0;
            } else {
                var17 = this.field2392[var15];
            }
            short var18;
            if (this.field2395 == null) {
                var18 = -1;
            } else {
                var18 = this.field2395[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field2383[var15] & 0xFFFF;
                    class226 var20;
                    if (this.field2410 == null || this.field2410[this.field2379[var15]] == null) {
                        var20 = this.field2409[this.field2379[var15]];
                    } else {
                        var20 = this.field2410[this.field2379[var15]];
                    }
                    int var21 = (var20.field2759 * arg4 + var20.field2761 * arg3 + var20.field2758 * arg2) / (var20.field2760 * var7) + arg0;
                    var8.field2683[var15] = method3837(var19, var21);
                    class226 var22;
                    if (this.field2410 == null || this.field2410[this.field2388[var15]] == null) {
                        var22 = this.field2409[this.field2388[var15]];
                    } else {
                        var22 = this.field2410[this.field2388[var15]];
                    }
                    int var23 = (var22.field2759 * arg4 + var22.field2761 * arg3 + var22.field2758 * arg2) / (var22.field2760 * var7) + arg0;
                    var8.field2718[var15] = method3837(var19, var23);
                    class226 var24;
                    if (this.field2410 == null || this.field2410[this.field2389[var15]] == null) {
                        var24 = this.field2409[this.field2389[var15]];
                    } else {
                        var24 = this.field2410[this.field2389[var15]];
                    }
                    int var25 = (var24.field2759 * arg4 + var24.field2761 * arg3 + var24.field2758 * arg2) / (var24.field2760 * var7) + arg0;
                    var8.field2685[var15] = method3837(var19, var25);
                } else if (var16 == 1) {
                    class219 var26 = this.field2408[var15];
                    int var27 = (var26.field2608 * arg4 + var26.field2606 * arg2 + var26.field2605 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field2683[var15] = method3837(this.field2383[var15] & 0xFFFF, var27);
                    var8.field2685[var15] = -1;
                } else if (var16 == 3) {
                    var8.field2683[var15] = 128;
                    var8.field2685[var15] = -1;
                } else {
                    var8.field2685[var15] = -2;
                }
            } else if (var16 == 0) {
                class226 var28;
                if (this.field2410 == null || this.field2410[this.field2379[var15]] == null) {
                    var28 = this.field2409[this.field2379[var15]];
                } else {
                    var28 = this.field2410[this.field2379[var15]];
                }
                int var29 = (var28.field2759 * arg4 + var28.field2761 * arg3 + var28.field2758 * arg2) / (var28.field2760 * var7) + arg0;
                var8.field2683[var15] = method3838(var29);
                class226 var30;
                if (this.field2410 == null || this.field2410[this.field2388[var15]] == null) {
                    var30 = this.field2409[this.field2388[var15]];
                } else {
                    var30 = this.field2410[this.field2388[var15]];
                }
                int var31 = (var30.field2759 * arg4 + var30.field2761 * arg3 + var30.field2758 * arg2) / (var30.field2760 * var7) + arg0;
                var8.field2718[var15] = method3838(var31);
                class226 var32;
                if (this.field2410 == null || this.field2410[this.field2389[var15]] == null) {
                    var32 = this.field2409[this.field2389[var15]];
                } else {
                    var32 = this.field2410[this.field2389[var15]];
                }
                int var33 = (var32.field2759 * arg4 + var32.field2761 * arg3 + var32.field2758 * arg2) / (var32.field2760 * var7) + arg0;
                var8.field2685[var15] = method3838(var33);
            } else if (var16 == 1) {
                class219 var34 = this.field2408[var15];
                int var35 = (var34.field2608 * arg4 + var34.field2606 * arg2 + var34.field2605 * arg3) / (var7 / 2 + var7) + arg0;
                var8.field2683[var15] = method3838(var35);
                var8.field2685[var15] = -1;
            } else {
                var8.field2685[var15] = -2;
            }
        }
        this.method3822();
        var8.field2675 = this.field2398;
        var8.field2702 = this.field2387;
        var8.field2709 = this.field2384;
        var8.field2725 = this.field2414;
        var8.field2717 = this.field2386;
        var8.field2692 = this.field2379;
        var8.field2688 = this.field2388;
        var8.field2682 = this.field2389;
        var8.field2728 = this.field2417;
        var8.field2716 = this.field2392;
        var8.field2690 = this.field2396;
        var8.field2695 = this.field2391;
        var8.field2696 = this.field2405;
        var8.field2715 = this.field2395;
        var8.field2697 = this.field2406;
        var8.field2698 = this.field2397;
        return var8;
    }

    @ObfuscatedName("gi.as(II)I")
    public static final int method3837(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("gi.ad(I)I")
    public static final int method3838(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
