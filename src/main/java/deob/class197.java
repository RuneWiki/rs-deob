package deob;

@ObfuscatedName("gs")
public class class197 extends class206 {

    @ObfuscatedName("gs.k")
    public int field2278 = 0;

    @ObfuscatedName("gs.a")
    public int[] field2279;

    @ObfuscatedName("gs.m")
    public int[] field2280;

    @ObfuscatedName("gs.p")
    public int[] field2297;

    @ObfuscatedName("gs.s")
    public int field2282 = 0;

    @ObfuscatedName("gs.r")
    public int[] field2283;

    @ObfuscatedName("gs.v")
    public int[] field2284;

    @ObfuscatedName("gs.y")
    public int[] field2287;

    @ObfuscatedName("gs.c")
    public byte[] field2286;

    @ObfuscatedName("gs.w")
    public byte[] field2296;

    @ObfuscatedName("gs.b")
    public byte[] field2288;

    @ObfuscatedName("gs.t")
    public byte[] field2275;

    @ObfuscatedName("gs.g")
    public short[] field2304;

    @ObfuscatedName("gs.x")
    public short[] field2294;

    @ObfuscatedName("gs.n")
    public byte field2292 = 0;

    @ObfuscatedName("gs.e")
    public int field2293;

    @ObfuscatedName("gs.h")
    public byte[] field2276;

    @ObfuscatedName("gs.f")
    public short[] field2295;

    @ObfuscatedName("gs.d")
    public short[] field2289;

    @ObfuscatedName("gs.j")
    public short[] field2277;

    @ObfuscatedName("gs.z")
    public int[] field2298;

    @ObfuscatedName("gs.i")
    public int[] field2299;

    @ObfuscatedName("gs.u")
    public int[][] field2308;

    @ObfuscatedName("gs.ag")
    public int[][] field2301;

    @ObfuscatedName("gs.ar")
    public int[][] field2302;

    @ObfuscatedName("gs.am")
    public int[][] field2303;

    @ObfuscatedName("gs.ac")
    public class207[] field2281;

    @ObfuscatedName("gs.ab")
    public class214[] field2305;

    @ObfuscatedName("gs.aj")
    public class214[] field2306;

    @ObfuscatedName("gs.ae")
    public short field2307;

    @ObfuscatedName("gs.az")
    public short field2290;

    @ObfuscatedName("gs.ap")
    public boolean field2285 = false;

    @ObfuscatedName("gs.as")
    public int field2310;

    @ObfuscatedName("gs.au")
    public int field2311;

    @ObfuscatedName("gs.ak")
    public int field2316;

    @ObfuscatedName("gs.af")
    public int field2313;

    @ObfuscatedName("gs.al")
    public int field2314;

    @ObfuscatedName("gs.aq")
    public static int[] field2315 = new int[10000];

    @ObfuscatedName("gs.ad")
    public static int[] field2291 = new int[10000];

    @ObfuscatedName("gs.an")
    public static int field2309 = 0;

    @ObfuscatedName("gs.aw")
    public static int[] field2318 = class202.field2402;

    @ObfuscatedName("gs.ah")
    public static int[] field2319 = class202.field2377;

    public class197() {
    }

    @ObfuscatedName("gs.o(Llp;II)Lgs;")
    public static class197 method3507(class316 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method5249(arg1, arg2);
        return var3 == null ? null : new class197(var3);
    }

    public class197(byte[] arg0) {
        class440 var2 = new class440(10);
        var2.method6877(-2);
        if (arg0[arg0.length - 1] == -3 && arg0[arg0.length - 2] == -1) {
            this.method3509(arg0);
        } else if (arg0[arg0.length - 1] == -2 && arg0[arg0.length - 2] == -1) {
            this.method3586(arg0);
        } else if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method3511(arg0);
        } else {
            this.method3512(arg0);
        }
    }

    @ObfuscatedName("gs.l([B)V")
    public void method3509(byte[] arg0) {
        class440 var2 = new class440(arg0);
        class440 var3 = new class440(arg0);
        class440 var4 = new class440(arg0);
        class440 var5 = new class440(arg0);
        class440 var6 = new class440(arg0);
        class440 var7 = new class440(arg0);
        class440 var8 = new class440(arg0);
        var2.field4678 = arg0.length - 26;
        int var9 = var2.method7082();
        int var10 = var2.method7082();
        int var11 = var2.method7071();
        int var12 = var2.method7071();
        int var13 = var2.method7071();
        int var14 = var2.method7071();
        int var15 = var2.method7071();
        int var16 = var2.method7071();
        int var17 = var2.method7071();
        int var18 = var2.method7071();
        int var19 = var2.method7082();
        int var20 = var2.method7082();
        int var21 = var2.method7082();
        int var22 = var2.method7082();
        int var23 = var2.method7082();
        int var24 = var2.method7082();
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        if (var11 > 0) {
            this.field2276 = new byte[var11];
            var2.field4678 = 0;
            for (int var28 = 0; var28 < var11; var28++) {
                byte var29 = this.field2276[var28] = var2.method7034();
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
        this.field2278 = var9;
        this.field2282 = var10;
        this.field2293 = var11;
        this.field2279 = new int[var9];
        this.field2280 = new int[var9];
        this.field2297 = new int[var9];
        this.field2283 = new int[var10];
        this.field2284 = new int[var10];
        this.field2287 = new int[var10];
        if (var17 == 1) {
            this.field2298 = new int[var9];
        }
        if (var12 == 1) {
            this.field2286 = new byte[var10];
        }
        if (var13 == 255) {
            this.field2296 = new byte[var10];
        } else {
            this.field2292 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2288 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2299 = new int[var10];
        }
        if (var16 == 1) {
            this.field2294 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field2275 = new byte[var10];
        }
        if (var18 == 1) {
            this.field2302 = new int[var9][];
            this.field2303 = new int[var9][];
        }
        this.field2304 = new short[var10];
        if (var11 > 0) {
            this.field2295 = new short[var11];
            this.field2289 = new short[var11];
            this.field2277 = new short[var11];
        }
        var2.field4678 = var11;
        var3.field4678 = var47;
        var4.field4678 = var49;
        var5.field4678 = var51;
        var6.field4678 = var35;
        int var67 = 0;
        int var68 = 0;
        int var69 = 0;
        for (int var70 = 0; var70 < var9; var70++) {
            int var71 = var2.method7071();
            int var72 = 0;
            if ((var71 & 0x1) != 0) {
                var72 = var3.method6907();
            }
            int var73 = 0;
            if ((var71 & 0x2) != 0) {
                var73 = var4.method6907();
            }
            int var74 = 0;
            if ((var71 & 0x4) != 0) {
                var74 = var5.method6907();
            }
            this.field2279[var70] = var67 + var72;
            this.field2280[var70] = var68 + var73;
            this.field2297[var70] = var69 + var74;
            var67 = this.field2279[var70];
            var68 = this.field2280[var70];
            var69 = this.field2297[var70];
            if (var17 == 1) {
                this.field2298[var70] = var6.method7071();
            }
        }
        if (var18 == 1) {
            for (int var75 = 0; var75 < var9; var75++) {
                int var76 = var6.method7071();
                this.field2302[var75] = new int[var76];
                this.field2303[var75] = new int[var76];
                for (int var77 = 0; var77 < var76; var77++) {
                    this.field2302[var75][var77] = var6.method7071();
                    this.field2303[var75][var77] = var6.method7071();
                }
            }
        }
        var2.field4678 = var45;
        var3.field4678 = var33;
        var4.field4678 = var36;
        var5.field4678 = var40;
        var6.field4678 = var37;
        var7.field4678 = var43;
        var8.field4678 = var42;
        for (int var78 = 0; var78 < var10; var78++) {
            this.field2304[var78] = (short) var2.method7082();
            if (var12 == 1) {
                this.field2286[var78] = var3.method7034();
            }
            if (var13 == 255) {
                this.field2296[var78] = var4.method7034();
            }
            if (var14 == 1) {
                this.field2288[var78] = var5.method7034();
            }
            if (var15 == 1) {
                this.field2299[var78] = var6.method7071();
            }
            if (var16 == 1) {
                this.field2294[var78] = (short) (var7.method7082() - 1);
            }
            if (this.field2275 != null && this.field2294[var78] != -1) {
                this.field2275[var78] = (byte) (var8.method7071() - 1);
            }
        }
        var2.field4678 = var39;
        var3.field4678 = var32;
        int var79 = 0;
        int var80 = 0;
        int var81 = 0;
        int var82 = 0;
        for (int var83 = 0; var83 < var10; var83++) {
            int var84 = var3.method7071();
            if (var84 == 1) {
                var79 = var2.method6907() + var82;
                var80 = var2.method6907() + var79;
                var81 = var2.method6907() + var80;
                var82 = var81;
                this.field2283[var83] = var79;
                this.field2284[var83] = var80;
                this.field2287[var83] = var81;
            }
            if (var84 == 2) {
                var80 = var81;
                var81 = var2.method6907() + var82;
                var82 = var81;
                this.field2283[var83] = var79;
                this.field2284[var83] = var80;
                this.field2287[var83] = var81;
            }
            if (var84 == 3) {
                var79 = var81;
                var81 = var2.method6907() + var82;
                var82 = var81;
                this.field2283[var83] = var79;
                this.field2284[var83] = var80;
                this.field2287[var83] = var81;
            }
            if (var84 == 4) {
                int var87 = var79;
                var79 = var80;
                var80 = var87;
                var81 = var2.method6907() + var82;
                var82 = var81;
                this.field2283[var83] = var79;
                this.field2284[var83] = var87;
                this.field2287[var83] = var81;
            }
        }
        var2.field4678 = var53;
        var3.field4678 = var55;
        var4.field4678 = var57;
        var5.field4678 = var59;
        var6.field4678 = var61;
        var7.field4678 = var63;
        for (int var88 = 0; var88 < var11; var88++) {
            int var89 = this.field2276[var88] & 0xFF;
            if (var89 == 0) {
                this.field2295[var88] = (short) var2.method7082();
                this.field2289[var88] = (short) var2.method7082();
                this.field2277[var88] = (short) var2.method7082();
            }
        }
        var2.field4678 = var65;
        int var90 = var2.method7071();
        if (var90 == 0) {
            return;
        }
        new class216();
        var2.method7082();
        var2.method7082();
        var2.method7082();
        var2.method6898();
    }

    @ObfuscatedName("gs.k([B)V")
    public void method3586(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class440 var4 = new class440(arg0);
        class440 var5 = new class440(arg0);
        class440 var6 = new class440(arg0);
        class440 var7 = new class440(arg0);
        class440 var8 = new class440(arg0);
        var4.field4678 = arg0.length - 23;
        int var9 = var4.method7082();
        int var10 = var4.method7082();
        int var11 = var4.method7071();
        int var12 = var4.method7071();
        int var13 = var4.method7071();
        int var14 = var4.method7071();
        int var15 = var4.method7071();
        int var16 = var4.method7071();
        int var17 = var4.method7071();
        int var18 = var4.method7082();
        int var19 = var4.method7082();
        int var20 = var4.method7082();
        int var21 = var4.method7082();
        int var22 = var4.method7082();
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
        this.field2278 = var9;
        this.field2282 = var10;
        this.field2293 = var11;
        this.field2279 = new int[var9];
        this.field2280 = new int[var9];
        this.field2297 = new int[var9];
        this.field2283 = new int[var10];
        this.field2284 = new int[var10];
        this.field2287 = new int[var10];
        if (var11 > 0) {
            this.field2276 = new byte[var11];
            this.field2295 = new short[var11];
            this.field2289 = new short[var11];
            this.field2277 = new short[var11];
        }
        if (var16 == 1) {
            this.field2298 = new int[var9];
        }
        if (var12 == 1) {
            this.field2286 = new byte[var10];
            this.field2275 = new byte[var10];
            this.field2294 = new short[var10];
        }
        if (var13 == 255) {
            this.field2296 = new byte[var10];
        } else {
            this.field2292 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2288 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2299 = new int[var10];
        }
        if (var17 == 1) {
            this.field2302 = new int[var9][];
            this.field2303 = new int[var9][];
        }
        this.field2304 = new short[var10];
        var4.field4678 = var23;
        var5.field4678 = var39;
        var6.field4678 = var41;
        var7.field4678 = var43;
        var8.field4678 = var27;
        int var46 = 0;
        int var47 = 0;
        int var48 = 0;
        for (int var49 = 0; var49 < var9; var49++) {
            int var50 = var4.method7071();
            int var51 = 0;
            if ((var50 & 0x1) != 0) {
                var51 = var5.method6907();
            }
            int var52 = 0;
            if ((var50 & 0x2) != 0) {
                var52 = var6.method6907();
            }
            int var53 = 0;
            if ((var50 & 0x4) != 0) {
                var53 = var7.method6907();
            }
            this.field2279[var49] = var46 + var51;
            this.field2280[var49] = var47 + var52;
            this.field2297[var49] = var48 + var53;
            var46 = this.field2279[var49];
            var47 = this.field2280[var49];
            var48 = this.field2297[var49];
            if (var16 == 1) {
                this.field2298[var49] = var8.method7071();
            }
        }
        if (var17 == 1) {
            for (int var54 = 0; var54 < var9; var54++) {
                int var55 = var8.method7071();
                this.field2302[var54] = new int[var55];
                this.field2303[var54] = new int[var55];
                for (int var56 = 0; var56 < var55; var56++) {
                    this.field2302[var54][var56] = var8.method7071();
                    this.field2303[var54][var56] = var8.method7071();
                }
            }
        }
        var4.field4678 = var35;
        var5.field4678 = var30;
        var6.field4678 = var28;
        var7.field4678 = var33;
        var8.field4678 = var29;
        for (int var57 = 0; var57 < var10; var57++) {
            this.field2304[var57] = (short) var4.method7082();
            if (var12 == 1) {
                int var58 = var5.method7071();
                if ((var58 & 0x1) == 1) {
                    this.field2286[var57] = 1;
                    var2 = true;
                } else {
                    this.field2286[var57] = 0;
                }
                if ((var58 & 0x2) == 2) {
                    this.field2275[var57] = (byte) (var58 >> 2);
                    this.field2294[var57] = this.field2304[var57];
                    this.field2304[var57] = 127;
                    if (this.field2294[var57] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field2275[var57] = -1;
                    this.field2294[var57] = -1;
                }
            }
            if (var13 == 255) {
                this.field2296[var57] = var6.method7034();
            }
            if (var14 == 1) {
                this.field2288[var57] = var7.method7034();
            }
            if (var15 == 1) {
                this.field2299[var57] = var8.method7071();
            }
        }
        var4.field4678 = var32;
        var5.field4678 = var25;
        int var59 = 0;
        int var60 = 0;
        int var61 = 0;
        int var62 = 0;
        for (int var63 = 0; var63 < var10; var63++) {
            int var64 = var5.method7071();
            if (var64 == 1) {
                var59 = var4.method6907() + var62;
                var60 = var4.method6907() + var59;
                var61 = var4.method6907() + var60;
                var62 = var61;
                this.field2283[var63] = var59;
                this.field2284[var63] = var60;
                this.field2287[var63] = var61;
            }
            if (var64 == 2) {
                var60 = var61;
                var61 = var4.method6907() + var62;
                var62 = var61;
                this.field2283[var63] = var59;
                this.field2284[var63] = var60;
                this.field2287[var63] = var61;
            }
            if (var64 == 3) {
                var59 = var61;
                var61 = var4.method6907() + var62;
                var62 = var61;
                this.field2283[var63] = var59;
                this.field2284[var63] = var60;
                this.field2287[var63] = var61;
            }
            if (var64 == 4) {
                int var67 = var59;
                var59 = var60;
                var60 = var67;
                var61 = var4.method6907() + var62;
                var62 = var61;
                this.field2283[var63] = var59;
                this.field2284[var63] = var67;
                this.field2287[var63] = var61;
            }
        }
        var4.field4678 = var37;
        for (int var68 = 0; var68 < var11; var68++) {
            this.field2276[var68] = 0;
            this.field2295[var68] = (short) var4.method7082();
            this.field2289[var68] = (short) var4.method7082();
            this.field2277[var68] = (short) var4.method7082();
        }
        if (this.field2275 != null) {
            boolean var69 = false;
            for (int var70 = 0; var70 < var10; var70++) {
                int var71 = this.field2275[var70] & 0xFF;
                if (var71 != 255) {
                    if ((this.field2295[var71] & 0xFFFF) == this.field2283[var70] && (this.field2289[var71] & 0xFFFF) == this.field2284[var70] && (this.field2277[var71] & 0xFFFF) == this.field2287[var70]) {
                        this.field2275[var70] = -1;
                    } else {
                        var69 = true;
                    }
                }
            }
            if (!var69) {
                this.field2275 = null;
            }
        }
        if (!var3) {
            this.field2294 = null;
        }
        if (!var2) {
            this.field2286 = null;
        }
    }

    @ObfuscatedName("gs.r([B)V")
    public void method3511(byte[] arg0) {
        class440 var2 = new class440(arg0);
        class440 var3 = new class440(arg0);
        class440 var4 = new class440(arg0);
        class440 var5 = new class440(arg0);
        class440 var6 = new class440(arg0);
        class440 var7 = new class440(arg0);
        class440 var8 = new class440(arg0);
        var2.field4678 = arg0.length - 23;
        int var9 = var2.method7082();
        int var10 = var2.method7082();
        int var11 = var2.method7071();
        int var12 = var2.method7071();
        int var13 = var2.method7071();
        int var14 = var2.method7071();
        int var15 = var2.method7071();
        int var16 = var2.method7071();
        int var17 = var2.method7071();
        int var18 = var2.method7082();
        int var19 = var2.method7082();
        int var20 = var2.method7082();
        int var21 = var2.method7082();
        int var22 = var2.method7082();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field2276 = new byte[var11];
            var2.field4678 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field2276[var26] = var2.method7034();
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
        this.field2278 = var9;
        this.field2282 = var10;
        this.field2293 = var11;
        this.field2279 = new int[var9];
        this.field2280 = new int[var9];
        this.field2297 = new int[var9];
        this.field2283 = new int[var10];
        this.field2284 = new int[var10];
        this.field2287 = new int[var10];
        if (var17 == 1) {
            this.field2298 = new int[var9];
        }
        if (var12 == 1) {
            this.field2286 = new byte[var10];
        }
        if (var13 == 255) {
            this.field2296 = new byte[var10];
        } else {
            this.field2292 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2288 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2299 = new int[var10];
        }
        if (var16 == 1) {
            this.field2294 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field2275 = new byte[var10];
        }
        this.field2304 = new short[var10];
        if (var11 > 0) {
            this.field2295 = new short[var11];
            this.field2289 = new short[var11];
            this.field2277 = new short[var11];
        }
        var2.field4678 = var11;
        var3.field4678 = var44;
        var4.field4678 = var46;
        var5.field4678 = var48;
        var6.field4678 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method7071();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method6907();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method6907();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method6907();
            }
            this.field2279[var67] = var64 + var69;
            this.field2280[var67] = var65 + var70;
            this.field2297[var67] = var66 + var71;
            var64 = this.field2279[var67];
            var65 = this.field2280[var67];
            var66 = this.field2297[var67];
            if (var17 == 1) {
                this.field2298[var67] = var6.method7071();
            }
        }
        var2.field4678 = var42;
        var3.field4678 = var31;
        var4.field4678 = var34;
        var5.field4678 = var37;
        var6.field4678 = var35;
        var7.field4678 = var40;
        var8.field4678 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field2304[var72] = (short) var2.method7082();
            if (var12 == 1) {
                this.field2286[var72] = var3.method7034();
            }
            if (var13 == 255) {
                this.field2296[var72] = var4.method7034();
            }
            if (var14 == 1) {
                this.field2288[var72] = var5.method7034();
            }
            if (var15 == 1) {
                this.field2299[var72] = var6.method7071();
            }
            if (var16 == 1) {
                this.field2294[var72] = (short) (var7.method7082() - 1);
            }
            if (this.field2275 != null && this.field2294[var72] != -1) {
                this.field2275[var72] = (byte) (var8.method7071() - 1);
            }
        }
        var2.field4678 = var33;
        var3.field4678 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method7071();
            if (var78 == 1) {
                var73 = var2.method6907() + var76;
                var74 = var2.method6907() + var73;
                var75 = var2.method6907() + var74;
                var76 = var75;
                this.field2283[var77] = var73;
                this.field2284[var77] = var74;
                this.field2287[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method6907() + var76;
                var76 = var75;
                this.field2283[var77] = var73;
                this.field2284[var77] = var74;
                this.field2287[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method6907() + var76;
                var76 = var75;
                this.field2283[var77] = var73;
                this.field2284[var77] = var74;
                this.field2287[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method6907() + var76;
                var76 = var75;
                this.field2283[var77] = var73;
                this.field2284[var77] = var81;
                this.field2287[var77] = var75;
            }
        }
        var2.field4678 = var50;
        var3.field4678 = var52;
        var4.field4678 = var54;
        var5.field4678 = var56;
        var6.field4678 = var58;
        var7.field4678 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field2276[var82] & 0xFF;
            if (var83 == 0) {
                this.field2295[var82] = (short) var2.method7082();
                this.field2289[var82] = (short) var2.method7082();
                this.field2277[var82] = (short) var2.method7082();
            }
        }
        var2.field4678 = var62;
        int var84 = var2.method7071();
        if (var84 == 0) {
            return;
        }
        new class216();
        var2.method7082();
        var2.method7082();
        var2.method7082();
        var2.method6898();
    }

    @ObfuscatedName("gs.v([B)V")
    public void method3512(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class440 var4 = new class440(arg0);
        class440 var5 = new class440(arg0);
        class440 var6 = new class440(arg0);
        class440 var7 = new class440(arg0);
        class440 var8 = new class440(arg0);
        var4.field4678 = arg0.length - 18;
        int var9 = var4.method7082();
        int var10 = var4.method7082();
        int var11 = var4.method7071();
        int var12 = var4.method7071();
        int var13 = var4.method7071();
        int var14 = var4.method7071();
        int var15 = var4.method7071();
        int var16 = var4.method7071();
        int var17 = var4.method7082();
        int var18 = var4.method7082();
        int var19 = var4.method7082();
        int var20 = var4.method7082();
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
        this.field2278 = var9;
        this.field2282 = var10;
        this.field2293 = var11;
        this.field2279 = new int[var9];
        this.field2280 = new int[var9];
        this.field2297 = new int[var9];
        this.field2283 = new int[var10];
        this.field2284 = new int[var10];
        this.field2287 = new int[var10];
        if (var11 > 0) {
            this.field2276 = new byte[var11];
            this.field2295 = new short[var11];
            this.field2289 = new short[var11];
            this.field2277 = new short[var11];
        }
        if (var16 == 1) {
            this.field2298 = new int[var9];
        }
        if (var12 == 1) {
            this.field2286 = new byte[var10];
            this.field2275 = new byte[var10];
            this.field2294 = new short[var10];
        }
        if (var13 == 255) {
            this.field2296 = new byte[var10];
        } else {
            this.field2292 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2288 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2299 = new int[var10];
        }
        this.field2304 = new short[var10];
        var4.field4678 = var21;
        var5.field4678 = var36;
        var6.field4678 = var38;
        var7.field4678 = var40;
        var8.field4678 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method7071();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method6907();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method6907();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method6907();
            }
            this.field2279[var46] = var43 + var48;
            this.field2280[var46] = var44 + var49;
            this.field2297[var46] = var45 + var50;
            var43 = this.field2279[var46];
            var44 = this.field2280[var46];
            var45 = this.field2297[var46];
            if (var16 == 1) {
                this.field2298[var46] = var8.method7071();
            }
        }
        var4.field4678 = var32;
        var5.field4678 = var28;
        var6.field4678 = var26;
        var7.field4678 = var30;
        var8.field4678 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field2304[var51] = (short) var4.method7082();
            if (var12 == 1) {
                int var52 = var5.method7071();
                if ((var52 & 0x1) == 1) {
                    this.field2286[var51] = 1;
                    var2 = true;
                } else {
                    this.field2286[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field2275[var51] = (byte) (var52 >> 2);
                    this.field2294[var51] = this.field2304[var51];
                    this.field2304[var51] = 127;
                    if (this.field2294[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field2275[var51] = -1;
                    this.field2294[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field2296[var51] = var6.method7034();
            }
            if (var14 == 1) {
                this.field2288[var51] = var7.method7034();
            }
            if (var15 == 1) {
                this.field2299[var51] = var8.method7071();
            }
        }
        var4.field4678 = var25;
        var5.field4678 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method7071();
            if (var58 == 1) {
                var53 = var4.method6907() + var56;
                var54 = var4.method6907() + var53;
                var55 = var4.method6907() + var54;
                var56 = var55;
                this.field2283[var57] = var53;
                this.field2284[var57] = var54;
                this.field2287[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method6907() + var56;
                var56 = var55;
                this.field2283[var57] = var53;
                this.field2284[var57] = var54;
                this.field2287[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method6907() + var56;
                var56 = var55;
                this.field2283[var57] = var53;
                this.field2284[var57] = var54;
                this.field2287[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method6907() + var56;
                var56 = var55;
                this.field2283[var57] = var53;
                this.field2284[var57] = var61;
                this.field2287[var57] = var55;
            }
        }
        var4.field4678 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field2276[var62] = 0;
            this.field2295[var62] = (short) var4.method7082();
            this.field2289[var62] = (short) var4.method7082();
            this.field2277[var62] = (short) var4.method7082();
        }
        if (this.field2275 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field2275[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field2295[var65] & 0xFFFF) == this.field2283[var64] && (this.field2289[var65] & 0xFFFF) == this.field2284[var64] && (this.field2277[var65] & 0xFFFF) == this.field2287[var64]) {
                        this.field2275[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field2275 = null;
            }
        }
        if (!var3) {
            this.field2294 = null;
        }
        if (!var2) {
            this.field2286 = null;
        }
    }

    public class197(class197[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        this.field2278 = 0;
        this.field2282 = 0;
        this.field2293 = 0;
        this.field2292 = -1;
        for (int var10 = 0; var10 < arg1; var10++) {
            class197 var11 = arg0[var10];
            if (var11 != null) {
                this.field2278 += var11.field2278;
                this.field2282 += var11.field2282;
                this.field2293 += var11.field2293;
                if (var11.field2296 == null) {
                    if (this.field2292 == -1) {
                        this.field2292 = var11.field2292;
                    }
                    if (this.field2292 != var11.field2292) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var11.field2286 != null;
                var5 |= var11.field2288 != null;
                var6 |= var11.field2299 != null;
                var7 |= var11.field2294 != null;
                var8 |= var11.field2275 != null;
                var9 |= var11.field2302 != null;
            }
        }
        this.field2279 = new int[this.field2278];
        this.field2280 = new int[this.field2278];
        this.field2297 = new int[this.field2278];
        this.field2298 = new int[this.field2278];
        this.field2283 = new int[this.field2282];
        this.field2284 = new int[this.field2282];
        this.field2287 = new int[this.field2282];
        if (var3) {
            this.field2286 = new byte[this.field2282];
        }
        if (var4) {
            this.field2296 = new byte[this.field2282];
        }
        if (var5) {
            this.field2288 = new byte[this.field2282];
        }
        if (var6) {
            this.field2299 = new int[this.field2282];
        }
        if (var7) {
            this.field2294 = new short[this.field2282];
        }
        if (var8) {
            this.field2275 = new byte[this.field2282];
        }
        if (var9) {
            this.field2302 = new int[this.field2278][];
            this.field2303 = new int[this.field2278][];
        }
        this.field2304 = new short[this.field2282];
        if (this.field2293 > 0) {
            this.field2276 = new byte[this.field2293];
            this.field2295 = new short[this.field2293];
            this.field2289 = new short[this.field2293];
            this.field2277 = new short[this.field2293];
        }
        this.field2278 = 0;
        this.field2282 = 0;
        this.field2293 = 0;
        for (int var12 = 0; var12 < arg1; var12++) {
            class197 var13 = arg0[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < var13.field2282; var14++) {
                    if (var3 && var13.field2286 != null) {
                        this.field2286[this.field2282] = var13.field2286[var14];
                    }
                    if (var4) {
                        if (var13.field2296 == null) {
                            this.field2296[this.field2282] = var13.field2292;
                        } else {
                            this.field2296[this.field2282] = var13.field2296[var14];
                        }
                    }
                    if (var5 && var13.field2288 != null) {
                        this.field2288[this.field2282] = var13.field2288[var14];
                    }
                    if (var6 && var13.field2299 != null) {
                        this.field2299[this.field2282] = var13.field2299[var14];
                    }
                    if (var7) {
                        if (var13.field2294 == null) {
                            this.field2294[this.field2282] = -1;
                        } else {
                            this.field2294[this.field2282] = var13.field2294[var14];
                        }
                    }
                    if (var8) {
                        if (var13.field2275 == null || var13.field2275[var14] == -1) {
                            this.field2275[this.field2282] = -1;
                        } else {
                            this.field2275[this.field2282] = (byte) (var13.field2275[var14] + this.field2293);
                        }
                    }
                    this.field2304[this.field2282] = var13.field2304[var14];
                    this.field2283[this.field2282] = this.method3508(var13, var13.field2283[var14]);
                    this.field2284[this.field2282] = this.method3508(var13, var13.field2284[var14]);
                    this.field2287[this.field2282] = this.method3508(var13, var13.field2287[var14]);
                    this.field2282++;
                }
                for (int var15 = 0; var15 < var13.field2293; var15++) {
                    byte var16 = this.field2276[this.field2293] = var13.field2276[var15];
                    if (var16 == 0) {
                        this.field2295[this.field2293] = (short) this.method3508(var13, var13.field2295[var15]);
                        this.field2289[this.field2293] = (short) this.method3508(var13, var13.field2289[var15]);
                        this.field2277[this.field2293] = (short) this.method3508(var13, var13.field2277[var15]);
                    }
                    this.field2293++;
                }
            }
        }
    }

    @ObfuscatedName("gs.y(Lgs;I)I")
    public final int method3508(class197 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field2279[arg1];
        int var5 = arg0.field2280[arg1];
        int var6 = arg0.field2297[arg1];
        for (int var7 = 0; var7 < this.field2278; var7++) {
            if (this.field2279[var7] == var4 && this.field2280[var7] == var5 && this.field2297[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field2279[this.field2278] = var4;
            this.field2280[this.field2278] = var5;
            this.field2297[this.field2278] = var6;
            if (arg0.field2298 != null) {
                this.field2298[this.field2278] = arg0.field2298[arg1];
            }
            if (arg0.field2302 != null) {
                this.field2302[this.field2278] = arg0.field2302[arg1];
                this.field2303[this.field2278] = arg0.field2303[arg1];
            }
            var3 = this.field2278++;
        }
        return var3;
    }

    public class197(class197 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field2278 = arg0.field2278;
        this.field2282 = arg0.field2282;
        this.field2293 = arg0.field2293;
        if (arg1) {
            this.field2279 = arg0.field2279;
            this.field2280 = arg0.field2280;
            this.field2297 = arg0.field2297;
        } else {
            this.field2279 = new int[this.field2278];
            this.field2280 = new int[this.field2278];
            this.field2297 = new int[this.field2278];
            for (int var6 = 0; var6 < this.field2278; var6++) {
                this.field2279[var6] = arg0.field2279[var6];
                this.field2280[var6] = arg0.field2280[var6];
                this.field2297[var6] = arg0.field2297[var6];
            }
        }
        if (arg2) {
            this.field2304 = arg0.field2304;
        } else {
            this.field2304 = new short[this.field2282];
            for (int var7 = 0; var7 < this.field2282; var7++) {
                this.field2304[var7] = arg0.field2304[var7];
            }
        }
        if (arg3 || arg0.field2294 == null) {
            this.field2294 = arg0.field2294;
        } else {
            this.field2294 = new short[this.field2282];
            for (int var8 = 0; var8 < this.field2282; var8++) {
                this.field2294[var8] = arg0.field2294[var8];
            }
        }
        if (arg4) {
            this.field2288 = arg0.field2288;
        } else {
            this.field2288 = new byte[this.field2282];
            if (arg0.field2288 == null) {
                for (int var9 = 0; var9 < this.field2282; var9++) {
                    this.field2288[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field2282; var10++) {
                    this.field2288[var10] = arg0.field2288[var10];
                }
            }
        }
        this.field2283 = arg0.field2283;
        this.field2284 = arg0.field2284;
        this.field2287 = arg0.field2287;
        this.field2286 = arg0.field2286;
        this.field2296 = arg0.field2296;
        this.field2275 = arg0.field2275;
        this.field2292 = arg0.field2292;
        this.field2276 = arg0.field2276;
        this.field2295 = arg0.field2295;
        this.field2289 = arg0.field2289;
        this.field2277 = arg0.field2277;
        this.field2298 = arg0.field2298;
        this.field2299 = arg0.field2299;
        this.field2308 = arg0.field2308;
        this.field2301 = arg0.field2301;
        this.field2305 = arg0.field2305;
        this.field2281 = arg0.field2281;
        this.field2306 = arg0.field2306;
        this.field2302 = arg0.field2302;
        this.field2303 = arg0.field2303;
        this.field2307 = arg0.field2307;
        this.field2290 = arg0.field2290;
    }

    @ObfuscatedName("gs.c()Lgs;")
    public class197 method3541() {
        class197 var1 = new class197();
        if (this.field2286 != null) {
            var1.field2286 = new byte[this.field2282];
            for (int var2 = 0; var2 < this.field2282; var2++) {
                var1.field2286[var2] = this.field2286[var2];
            }
        }
        var1.field2278 = this.field2278;
        var1.field2282 = this.field2282;
        var1.field2293 = this.field2293;
        var1.field2279 = this.field2279;
        var1.field2280 = this.field2280;
        var1.field2297 = this.field2297;
        var1.field2283 = this.field2283;
        var1.field2284 = this.field2284;
        var1.field2287 = this.field2287;
        var1.field2296 = this.field2296;
        var1.field2288 = this.field2288;
        var1.field2275 = this.field2275;
        var1.field2304 = this.field2304;
        var1.field2294 = this.field2294;
        var1.field2292 = this.field2292;
        var1.field2276 = this.field2276;
        var1.field2295 = this.field2295;
        var1.field2289 = this.field2289;
        var1.field2277 = this.field2277;
        var1.field2298 = this.field2298;
        var1.field2299 = this.field2299;
        var1.field2308 = this.field2308;
        var1.field2301 = this.field2301;
        var1.field2305 = this.field2305;
        var1.field2281 = this.field2281;
        var1.field2307 = this.field2307;
        var1.field2290 = this.field2290;
        return var1;
    }

    @ObfuscatedName("gs.w([[IIIIZI)Lgs;")
    public class197 method3544(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method3570();
        int var7 = this.field2311 + arg1;
        int var8 = this.field2316 + arg1;
        int var9 = this.field2314 + arg3;
        int var10 = this.field2313 + arg3;
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
        class197 var15;
        if (arg4) {
            var15 = new class197();
            var15.field2278 = this.field2278;
            var15.field2282 = this.field2282;
            var15.field2293 = this.field2293;
            var15.field2279 = this.field2279;
            var15.field2297 = this.field2297;
            var15.field2283 = this.field2283;
            var15.field2284 = this.field2284;
            var15.field2287 = this.field2287;
            var15.field2286 = this.field2286;
            var15.field2296 = this.field2296;
            var15.field2288 = this.field2288;
            var15.field2275 = this.field2275;
            var15.field2304 = this.field2304;
            var15.field2294 = this.field2294;
            var15.field2292 = this.field2292;
            var15.field2276 = this.field2276;
            var15.field2295 = this.field2295;
            var15.field2289 = this.field2289;
            var15.field2277 = this.field2277;
            var15.field2298 = this.field2298;
            var15.field2299 = this.field2299;
            var15.field2308 = this.field2308;
            var15.field2301 = this.field2301;
            var15.field2307 = this.field2307;
            var15.field2290 = this.field2290;
            var15.field2280 = new int[var15.field2278];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field2278; var16++) {
                int var17 = this.field2279[var16] + arg1;
                int var18 = this.field2297[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field2280[var16] = this.field2280[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field2278; var26++) {
                int var27 = (-this.field2280[var26] << 16) / this.field2487;
                if (var27 < arg5) {
                    int var28 = this.field2279[var26] + arg1;
                    int var29 = this.field2297[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field2280[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field2280[var26];
                }
            }
        }
        var15.method3573();
        return var15;
    }

    @ObfuscatedName("gs.b()V")
    public void method3556() {
        int var10002;
        if (this.field2298 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field2278; var3++) {
                int var4 = this.field2298[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field2308 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field2308[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field2278) {
                int var7 = this.field2298[var6];
                this.field2308[var7][var1[var7]++] = var6++;
            }
            this.field2298 = null;
        }
        if (this.field2299 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field2282; var10++) {
            int var11 = this.field2299[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field2301 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field2301[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field2282) {
            int var14 = this.field2299[var13];
            this.field2301[var14][var8[var14]++] = var13++;
        }
        this.field2299 = null;
    }

    @ObfuscatedName("gs.t()V")
    public void method3517() {
        for (int var1 = 0; var1 < this.field2278; var1++) {
            int var2 = this.field2279[var1];
            this.field2279[var1] = this.field2297[var1];
            this.field2297[var1] = -var2;
        }
        this.method3573();
    }

    @ObfuscatedName("gs.g()V")
    public void method3551() {
        for (int var1 = 0; var1 < this.field2278; var1++) {
            this.field2279[var1] = -this.field2279[var1];
            this.field2297[var1] = -this.field2297[var1];
        }
        this.method3573();
    }

    @ObfuscatedName("gs.x()V")
    public void method3519() {
        for (int var1 = 0; var1 < this.field2278; var1++) {
            int var2 = this.field2297[var1];
            this.field2297[var1] = this.field2279[var1];
            this.field2279[var1] = -var2;
        }
        this.method3573();
    }

    @ObfuscatedName("gs.n(I)V")
    public void method3520(int arg0) {
        int var2 = field2318[arg0];
        int var3 = field2319[arg0];
        for (int var4 = 0; var4 < this.field2278; var4++) {
            int var5 = this.field2297[var4] * var2 + this.field2279[var4] * var3 >> 16;
            this.field2297[var4] = this.field2297[var4] * var3 - this.field2279[var4] * var2 >> 16;
            this.field2279[var4] = var5;
        }
        this.method3573();
    }

    @ObfuscatedName("gs.e(III)V")
    public void method3521(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2278; var4++) {
            this.field2279[var4] += arg0;
            this.field2280[var4] += arg1;
            this.field2297[var4] += arg2;
        }
        this.method3573();
    }

    @ObfuscatedName("gs.h(SS)V")
    public void method3574(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2282; var3++) {
            if (this.field2304[var3] == arg0) {
                this.field2304[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("gs.f(SS)V")
    public void method3523(short arg0, short arg1) {
        if (this.field2294 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field2282; var3++) {
            if (this.field2294[var3] == arg0) {
                this.field2294[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("gs.d()V")
    public void method3538() {
        for (int var1 = 0; var1 < this.field2278; var1++) {
            this.field2297[var1] = -this.field2297[var1];
        }
        for (int var2 = 0; var2 < this.field2282; var2++) {
            int var3 = this.field2283[var2];
            this.field2283[var2] = this.field2287[var2];
            this.field2287[var2] = var3;
        }
        this.method3573();
    }

    @ObfuscatedName("gs.j(III)V")
    public void method3525(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2278; var4++) {
            this.field2279[var4] = this.field2279[var4] * arg0 / 128;
            this.field2280[var4] = this.field2280[var4] * arg1 / 128;
            this.field2297[var4] = this.field2297[var4] * arg2 / 128;
        }
        this.method3573();
    }

    @ObfuscatedName("gs.z()V")
    public void method3526() {
        if (this.field2305 != null) {
            return;
        }
        this.field2305 = new class214[this.field2278];
        for (int var1 = 0; var1 < this.field2278; var1++) {
            this.field2305[var1] = new class214();
        }
        for (int var2 = 0; var2 < this.field2282; var2++) {
            int var3 = this.field2283[var2];
            int var4 = this.field2284[var2];
            int var5 = this.field2287[var2];
            int var6 = this.field2279[var4] - this.field2279[var3];
            int var7 = this.field2280[var4] - this.field2280[var3];
            int var8 = this.field2297[var4] - this.field2297[var3];
            int var9 = this.field2279[var5] - this.field2279[var3];
            int var10 = this.field2280[var5] - this.field2280[var3];
            int var11 = this.field2297[var5] - this.field2297[var3];
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
            if (this.field2286 == null) {
                var19 = 0;
            } else {
                var19 = this.field2286[var2];
            }
            if (var19 == 0) {
                class214 var20 = this.field2305[var3];
                var20.field2641 += var16;
                var20.field2638 += var17;
                var20.field2640 += var18;
                var20.field2637++;
                class214 var21 = this.field2305[var4];
                var21.field2641 += var16;
                var21.field2638 += var17;
                var21.field2640 += var18;
                var21.field2637++;
                class214 var22 = this.field2305[var5];
                var22.field2641 += var16;
                var22.field2638 += var17;
                var22.field2640 += var18;
                var22.field2637++;
            } else if (var19 == 1) {
                if (this.field2281 == null) {
                    this.field2281 = new class207[this.field2282];
                }
                class207 var23 = this.field2281[var2] = new class207();
                var23.field2489 = var16;
                var23.field2488 = var17;
                var23.field2490 = var18;
            }
        }
    }

    @ObfuscatedName("gs.i()V")
    public void method3573() {
        this.field2305 = null;
        this.field2306 = null;
        this.field2281 = null;
        this.field2285 = false;
    }

    @ObfuscatedName("gs.u()V")
    public void method3570() {
        if (this.field2285) {
            return;
        }
        this.field2487 = 0;
        this.field2310 = 0;
        this.field2311 = 999999;
        this.field2316 = -999999;
        this.field2313 = -99999;
        this.field2314 = 99999;
        for (int var1 = 0; var1 < this.field2278; var1++) {
            int var2 = this.field2279[var1];
            int var3 = this.field2280[var1];
            int var4 = this.field2297[var1];
            if (var2 < this.field2311) {
                this.field2311 = var2;
            }
            if (var2 > this.field2316) {
                this.field2316 = var2;
            }
            if (var4 < this.field2314) {
                this.field2314 = var4;
            }
            if (var4 > this.field2313) {
                this.field2313 = var4;
            }
            if (-var3 > this.field2487) {
                this.field2487 = -var3;
            }
            if (var3 > this.field2310) {
                this.field2310 = var3;
            }
        }
        this.field2285 = true;
    }

    @ObfuscatedName("gs.ag(Lgs;Lgs;IIIZ)V")
    public static void method3559(class197 arg0, class197 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method3570();
        arg0.method3526();
        arg1.method3570();
        arg1.method3526();
        field2309++;
        int var6 = 0;
        int[] var7 = arg1.field2279;
        int var8 = arg1.field2278;
        for (int var9 = 0; var9 < arg0.field2278; var9++) {
            class214 var10 = arg0.field2305[var9];
            if (var10.field2637 != 0) {
                int var11 = arg0.field2280[var9] - arg3;
                if (var11 <= arg1.field2310) {
                    int var12 = arg0.field2279[var9] - arg2;
                    if (var12 >= arg1.field2311 && var12 <= arg1.field2316) {
                        int var13 = arg0.field2297[var9] - arg4;
                        if (var13 >= arg1.field2314 && var13 <= arg1.field2313) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class214 var15 = arg1.field2305[var14];
                                if (var7[var14] == var12 && arg1.field2297[var14] == var13 && arg1.field2280[var14] == var11 && var15.field2637 != 0) {
                                    if (arg0.field2306 == null) {
                                        arg0.field2306 = new class214[arg0.field2278];
                                    }
                                    if (arg1.field2306 == null) {
                                        arg1.field2306 = new class214[var8];
                                    }
                                    class214 var16 = arg0.field2306[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field2306[var9] = new class214(var10);
                                    }
                                    class214 var17 = arg1.field2306[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field2306[var14] = new class214(var15);
                                    }
                                    var16.field2641 += var15.field2641;
                                    var16.field2638 += var15.field2638;
                                    var16.field2640 += var15.field2640;
                                    var16.field2637 += var15.field2637;
                                    var17.field2641 += var10.field2641;
                                    var17.field2638 += var10.field2638;
                                    var17.field2640 += var10.field2640;
                                    var17.field2637 += var10.field2637;
                                    var6++;
                                    field2315[var9] = field2309;
                                    field2291[var14] = field2309;
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
        for (int var18 = 0; var18 < arg0.field2282; var18++) {
            if (field2315[arg0.field2283[var18]] == field2309 && field2315[arg0.field2284[var18]] == field2309 && field2315[arg0.field2287[var18]] == field2309) {
                if (arg0.field2286 == null) {
                    arg0.field2286 = new byte[arg0.field2282];
                }
                arg0.field2286[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field2282; var19++) {
            if (field2291[arg1.field2283[var19]] == field2309 && field2291[arg1.field2284[var19]] == field2309 && field2291[arg1.field2287[var19]] == field2309) {
                if (arg1.field2286 == null) {
                    arg1.field2286 = new byte[arg1.field2282];
                }
                arg1.field2286[var19] = 2;
            }
        }
    }

    @ObfuscatedName("gs.ar(IIIII)Lhv;")
    public final class212 method3530(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method3526();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class212 var8 = new class212();
        var8.field2555 = new int[this.field2282];
        var8.field2563 = new int[this.field2282];
        var8.field2558 = new int[this.field2282];
        if (this.field2293 > 0 && this.field2275 != null) {
            int[] var9 = new int[this.field2293];
            for (int var10 = 0; var10 < this.field2282; var10++) {
                if (this.field2275[var10] != -1) {
                    var9[this.field2275[var10] & 0xFF]++;
                }
            }
            var8.field2570 = 0;
            for (int var11 = 0; var11 < this.field2293; var11++) {
                if (var9[var11] > 0 && this.field2276[var11] == 0) {
                    var8.field2570++;
                }
            }
            var8.field2571 = new int[var8.field2570];
            var8.field2572 = new int[var8.field2570];
            var8.field2573 = new int[var8.field2570];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field2293; var13++) {
                if (var9[var13] > 0 && this.field2276[var13] == 0) {
                    var8.field2571[var12] = this.field2295[var13] & 0xFFFF;
                    var8.field2572[var12] = this.field2289[var13] & 0xFFFF;
                    var8.field2573[var12] = this.field2277[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field2567 = new byte[this.field2282];
            for (int var14 = 0; var14 < this.field2282; var14++) {
                if (this.field2275[var14] == -1) {
                    var8.field2567[var14] = -1;
                } else {
                    var8.field2567[var14] = (byte) var9[this.field2275[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field2282; var15++) {
            byte var16;
            if (this.field2286 == null) {
                var16 = 0;
            } else {
                var16 = this.field2286[var15];
            }
            byte var17;
            if (this.field2288 == null) {
                var17 = 0;
            } else {
                var17 = this.field2288[var15];
            }
            short var18;
            if (this.field2294 == null) {
                var18 = -1;
            } else {
                var18 = this.field2294[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field2304[var15] & 0xFFFF;
                    class214 var20;
                    if (this.field2306 == null || this.field2306[this.field2283[var15]] == null) {
                        var20 = this.field2305[this.field2283[var15]];
                    } else {
                        var20 = this.field2306[this.field2283[var15]];
                    }
                    int var21 = (var20.field2640 * arg4 + var20.field2641 * arg2 + var20.field2638 * arg3) / (var20.field2637 * var7) + arg0;
                    var8.field2555[var15] = method3531(var19, var21);
                    class214 var22;
                    if (this.field2306 == null || this.field2306[this.field2284[var15]] == null) {
                        var22 = this.field2305[this.field2284[var15]];
                    } else {
                        var22 = this.field2306[this.field2284[var15]];
                    }
                    int var23 = (var22.field2640 * arg4 + var22.field2641 * arg2 + var22.field2638 * arg3) / (var22.field2637 * var7) + arg0;
                    var8.field2563[var15] = method3531(var19, var23);
                    class214 var24;
                    if (this.field2306 == null || this.field2306[this.field2287[var15]] == null) {
                        var24 = this.field2305[this.field2287[var15]];
                    } else {
                        var24 = this.field2306[this.field2287[var15]];
                    }
                    int var25 = (var24.field2640 * arg4 + var24.field2641 * arg2 + var24.field2638 * arg3) / (var24.field2637 * var7) + arg0;
                    var8.field2558[var15] = method3531(var19, var25);
                } else if (var16 == 1) {
                    class207 var26 = this.field2281[var15];
                    int var27 = (var26.field2490 * arg4 + var26.field2489 * arg2 + var26.field2488 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field2555[var15] = method3531(this.field2304[var15] & 0xFFFF, var27);
                    var8.field2558[var15] = -1;
                } else if (var16 == 3) {
                    var8.field2555[var15] = 128;
                    var8.field2558[var15] = -1;
                } else {
                    var8.field2558[var15] = -2;
                }
            } else if (var16 == 0) {
                class214 var28;
                if (this.field2306 == null || this.field2306[this.field2283[var15]] == null) {
                    var28 = this.field2305[this.field2283[var15]];
                } else {
                    var28 = this.field2306[this.field2283[var15]];
                }
                int var29 = (var28.field2640 * arg4 + var28.field2641 * arg2 + var28.field2638 * arg3) / (var28.field2637 * var7) + arg0;
                var8.field2555[var15] = method3514(var29);
                class214 var30;
                if (this.field2306 == null || this.field2306[this.field2284[var15]] == null) {
                    var30 = this.field2305[this.field2284[var15]];
                } else {
                    var30 = this.field2306[this.field2284[var15]];
                }
                int var31 = (var30.field2640 * arg4 + var30.field2641 * arg2 + var30.field2638 * arg3) / (var30.field2637 * var7) + arg0;
                var8.field2563[var15] = method3514(var31);
                class214 var32;
                if (this.field2306 == null || this.field2306[this.field2287[var15]] == null) {
                    var32 = this.field2305[this.field2287[var15]];
                } else {
                    var32 = this.field2306[this.field2287[var15]];
                }
                int var33 = (var32.field2640 * arg4 + var32.field2641 * arg2 + var32.field2638 * arg3) / (var32.field2637 * var7) + arg0;
                var8.field2558[var15] = method3514(var33);
            } else if (var16 == 1) {
                class207 var34 = this.field2281[var15];
                int var35 = (var34.field2490 * arg4 + var34.field2489 * arg2 + var34.field2488 * arg3) / (var7 / 2 + var7) + arg0;
                var8.field2555[var15] = method3514(var35);
                var8.field2558[var15] = -1;
            } else {
                var8.field2558[var15] = -2;
            }
        }
        this.method3556();
        var8.field2577 = this.field2278;
        var8.field2583 = this.field2279;
        var8.field2556 = this.field2280;
        var8.field2557 = this.field2297;
        var8.field2616 = this.field2282;
        var8.field2559 = this.field2283;
        var8.field2578 = this.field2284;
        var8.field2588 = this.field2287;
        var8.field2565 = this.field2296;
        var8.field2593 = this.field2288;
        var8.field2569 = this.field2292;
        var8.field2621 = this.field2308;
        var8.field2575 = this.field2301;
        var8.field2568 = this.field2294;
        var8.field2576 = this.field2302;
        var8.field2595 = this.field2303;
        return var8;
    }

    @ObfuscatedName("gs.am(II)I")
    public static final int method3531(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("gs.ac(I)I")
    public static final int method3514(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
