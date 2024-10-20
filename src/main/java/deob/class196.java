package deob;

@ObfuscatedName("gw")
public class class196 extends class205 {

    @ObfuscatedName("gw.f")
    public int field2236 = 0;

    @ObfuscatedName("gw.j")
    public int[] field2253;

    @ObfuscatedName("gw.e")
    public int[] field2239;

    @ObfuscatedName("gw.g")
    public int[] field2242;

    @ObfuscatedName("gw.w")
    public int field2244 = 0;

    @ObfuscatedName("gw.y")
    public int[] field2278;

    @ObfuscatedName("gw.i")
    public int[] field2245;

    @ObfuscatedName("gw.s")
    public int[] field2260;

    @ObfuscatedName("gw.t")
    public byte[] field2247;

    @ObfuscatedName("gw.z")
    public byte[] field2248;

    @ObfuscatedName("gw.r")
    public byte[] field2249;

    @ObfuscatedName("gw.u")
    public byte[] field2250;

    @ObfuscatedName("gw.k")
    public short[] field2251;

    @ObfuscatedName("gw.h")
    public short[] field2252;

    @ObfuscatedName("gw.x")
    public byte field2243 = 0;

    @ObfuscatedName("gw.l")
    public int field2254;

    @ObfuscatedName("gw.a")
    public byte[] field2255;

    @ObfuscatedName("gw.p")
    public short[] field2256;

    @ObfuscatedName("gw.b")
    public short[] field2276;

    @ObfuscatedName("gw.n")
    public short[] field2258;

    @ObfuscatedName("gw.o")
    public int[] field2259;

    @ObfuscatedName("gw.m")
    public int[] field2265;

    @ObfuscatedName("gw.d")
    public int[][] field2261;

    @ObfuscatedName("gw.ad")
    public int[][] field2267;

    @ObfuscatedName("gw.ak")
    public int[][] field2263;

    @ObfuscatedName("gw.al")
    public int[][] field2264;

    @ObfuscatedName("gw.ao")
    public class206[] field2273;

    @ObfuscatedName("gw.ab")
    public class213[] field2266;

    @ObfuscatedName("gw.ap")
    public class213[] field2257;

    @ObfuscatedName("gw.ac")
    public short field2268;

    @ObfuscatedName("gw.ae")
    public short field2269;

    @ObfuscatedName("gw.aj")
    public boolean field2270 = false;

    @ObfuscatedName("gw.am")
    public int field2271;

    @ObfuscatedName("gw.an")
    public int field2272;

    @ObfuscatedName("gw.af")
    public int field2277;

    @ObfuscatedName("gw.ax")
    public int field2274;

    @ObfuscatedName("gw.ar")
    public int field2275;

    @ObfuscatedName("gw.at")
    public static int[] field2240 = new int[10000];

    @ObfuscatedName("gw.ag")
    public static int[] field2241 = new int[10000];

    @ObfuscatedName("gw.aq")
    public static int field2246 = 0;

    @ObfuscatedName("gw.ah")
    public static int[] field2279 = class201.field2363;

    @ObfuscatedName("gw.ai")
    public static int[] field2280 = class201.field2352;

    public class196() {
    }

    @ObfuscatedName("gw.c(Llh;II)Lgw;")
    public static class196 method3646(class315 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method5305(arg1, arg2);
        return var3 == null ? null : new class196(var3);
    }

    public class196(byte[] arg0) {
        class443 var2 = new class443(10);
        var2.method7244(-2);
        if (arg0[arg0.length - 1] == -3 && arg0[arg0.length - 2] == -1) {
            this.method3593(arg0);
        } else if (arg0[arg0.length - 1] == -2 && arg0[arg0.length - 2] == -1) {
            this.method3594(arg0);
        } else if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method3595(arg0);
        } else {
            this.method3650(arg0);
        }
    }

    @ObfuscatedName("gw.q([B)V")
    public void method3593(byte[] arg0) {
        class443 var2 = new class443(arg0);
        class443 var3 = new class443(arg0);
        class443 var4 = new class443(arg0);
        class443 var5 = new class443(arg0);
        class443 var6 = new class443(arg0);
        class443 var7 = new class443(arg0);
        class443 var8 = new class443(arg0);
        var2.field4700 = arg0.length - 26;
        int var9 = var2.method7049();
        int var10 = var2.method7049();
        int var11 = var2.method7047();
        int var12 = var2.method7047();
        int var13 = var2.method7047();
        int var14 = var2.method7047();
        int var15 = var2.method7047();
        int var16 = var2.method7047();
        int var17 = var2.method7047();
        int var18 = var2.method7047();
        int var19 = var2.method7049();
        int var20 = var2.method7049();
        int var21 = var2.method7049();
        int var22 = var2.method7049();
        int var23 = var2.method7049();
        int var24 = var2.method7049();
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        if (var11 > 0) {
            this.field2255 = new byte[var11];
            var2.field4700 = 0;
            for (int var28 = 0; var28 < var11; var28++) {
                byte var29 = this.field2255[var28] = var2.method7048();
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
        this.field2236 = var9;
        this.field2244 = var10;
        this.field2254 = var11;
        this.field2253 = new int[var9];
        this.field2239 = new int[var9];
        this.field2242 = new int[var9];
        this.field2278 = new int[var10];
        this.field2245 = new int[var10];
        this.field2260 = new int[var10];
        if (var17 == 1) {
            this.field2259 = new int[var9];
        }
        if (var12 == 1) {
            this.field2247 = new byte[var10];
        }
        if (var13 == 255) {
            this.field2248 = new byte[var10];
        } else {
            this.field2243 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2249 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2265 = new int[var10];
        }
        if (var16 == 1) {
            this.field2252 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field2250 = new byte[var10];
        }
        if (var18 == 1) {
            this.field2263 = new int[var9][];
            this.field2264 = new int[var9][];
        }
        this.field2251 = new short[var10];
        if (var11 > 0) {
            this.field2256 = new short[var11];
            this.field2276 = new short[var11];
            this.field2258 = new short[var11];
        }
        var2.field4700 = var11;
        var3.field4700 = var47;
        var4.field4700 = var49;
        var5.field4700 = var51;
        var6.field4700 = var35;
        int var67 = 0;
        int var68 = 0;
        int var69 = 0;
        for (int var70 = 0; var70 < var9; var70++) {
            int var71 = var2.method7047();
            int var72 = 0;
            if ((var71 & 0x1) != 0) {
                var72 = var3.method7213();
            }
            int var73 = 0;
            if ((var71 & 0x2) != 0) {
                var73 = var4.method7213();
            }
            int var74 = 0;
            if ((var71 & 0x4) != 0) {
                var74 = var5.method7213();
            }
            this.field2253[var70] = var67 + var72;
            this.field2239[var70] = var68 + var73;
            this.field2242[var70] = var69 + var74;
            var67 = this.field2253[var70];
            var68 = this.field2239[var70];
            var69 = this.field2242[var70];
            if (var17 == 1) {
                this.field2259[var70] = var6.method7047();
            }
        }
        if (var18 == 1) {
            for (int var75 = 0; var75 < var9; var75++) {
                int var76 = var6.method7047();
                this.field2263[var75] = new int[var76];
                this.field2264[var75] = new int[var76];
                for (int var77 = 0; var77 < var76; var77++) {
                    this.field2263[var75][var77] = var6.method7047();
                    this.field2264[var75][var77] = var6.method7047();
                }
            }
        }
        var2.field4700 = var45;
        var3.field4700 = var33;
        var4.field4700 = var36;
        var5.field4700 = var40;
        var6.field4700 = var37;
        var7.field4700 = var43;
        var8.field4700 = var42;
        for (int var78 = 0; var78 < var10; var78++) {
            this.field2251[var78] = (short) var2.method7049();
            if (var12 == 1) {
                this.field2247[var78] = var3.method7048();
            }
            if (var13 == 255) {
                this.field2248[var78] = var4.method7048();
            }
            if (var14 == 1) {
                this.field2249[var78] = var5.method7048();
            }
            if (var15 == 1) {
                this.field2265[var78] = var6.method7047();
            }
            if (var16 == 1) {
                this.field2252[var78] = (short) (var7.method7049() - 1);
            }
            if (this.field2250 != null && this.field2252[var78] != -1) {
                this.field2250[var78] = (byte) (var8.method7047() - 1);
            }
        }
        var2.field4700 = var39;
        var3.field4700 = var32;
        int var79 = 0;
        int var80 = 0;
        int var81 = 0;
        int var82 = 0;
        for (int var83 = 0; var83 < var10; var83++) {
            int var84 = var3.method7047();
            if (var84 == 1) {
                var79 = var2.method7213() + var82;
                var80 = var2.method7213() + var79;
                var81 = var2.method7213() + var80;
                var82 = var81;
                this.field2278[var83] = var79;
                this.field2245[var83] = var80;
                this.field2260[var83] = var81;
            }
            if (var84 == 2) {
                var80 = var81;
                var81 = var2.method7213() + var82;
                var82 = var81;
                this.field2278[var83] = var79;
                this.field2245[var83] = var80;
                this.field2260[var83] = var81;
            }
            if (var84 == 3) {
                var79 = var81;
                var81 = var2.method7213() + var82;
                var82 = var81;
                this.field2278[var83] = var79;
                this.field2245[var83] = var80;
                this.field2260[var83] = var81;
            }
            if (var84 == 4) {
                int var87 = var79;
                var79 = var80;
                var80 = var87;
                var81 = var2.method7213() + var82;
                var82 = var81;
                this.field2278[var83] = var79;
                this.field2245[var83] = var87;
                this.field2260[var83] = var81;
            }
        }
        var2.field4700 = var53;
        var3.field4700 = var55;
        var4.field4700 = var57;
        var5.field4700 = var59;
        var6.field4700 = var61;
        var7.field4700 = var63;
        for (int var88 = 0; var88 < var11; var88++) {
            int var89 = this.field2255[var88] & 0xFF;
            if (var89 == 0) {
                this.field2256[var88] = (short) var2.method7049();
                this.field2276[var88] = (short) var2.method7049();
                this.field2258[var88] = (short) var2.method7049();
            }
        }
        var2.field4700 = var65;
        int var90 = var2.method7047();
        if (var90 == 0) {
            return;
        }
        new class215();
        var2.method7049();
        var2.method7049();
        var2.method7049();
        var2.method7052();
    }

    @ObfuscatedName("gw.f([B)V")
    public void method3594(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class443 var4 = new class443(arg0);
        class443 var5 = new class443(arg0);
        class443 var6 = new class443(arg0);
        class443 var7 = new class443(arg0);
        class443 var8 = new class443(arg0);
        var4.field4700 = arg0.length - 23;
        int var9 = var4.method7049();
        int var10 = var4.method7049();
        int var11 = var4.method7047();
        int var12 = var4.method7047();
        int var13 = var4.method7047();
        int var14 = var4.method7047();
        int var15 = var4.method7047();
        int var16 = var4.method7047();
        int var17 = var4.method7047();
        int var18 = var4.method7049();
        int var19 = var4.method7049();
        int var20 = var4.method7049();
        int var21 = var4.method7049();
        int var22 = var4.method7049();
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
        this.field2236 = var9;
        this.field2244 = var10;
        this.field2254 = var11;
        this.field2253 = new int[var9];
        this.field2239 = new int[var9];
        this.field2242 = new int[var9];
        this.field2278 = new int[var10];
        this.field2245 = new int[var10];
        this.field2260 = new int[var10];
        if (var11 > 0) {
            this.field2255 = new byte[var11];
            this.field2256 = new short[var11];
            this.field2276 = new short[var11];
            this.field2258 = new short[var11];
        }
        if (var16 == 1) {
            this.field2259 = new int[var9];
        }
        if (var12 == 1) {
            this.field2247 = new byte[var10];
            this.field2250 = new byte[var10];
            this.field2252 = new short[var10];
        }
        if (var13 == 255) {
            this.field2248 = new byte[var10];
        } else {
            this.field2243 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2249 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2265 = new int[var10];
        }
        if (var17 == 1) {
            this.field2263 = new int[var9][];
            this.field2264 = new int[var9][];
        }
        this.field2251 = new short[var10];
        var4.field4700 = var23;
        var5.field4700 = var39;
        var6.field4700 = var41;
        var7.field4700 = var43;
        var8.field4700 = var27;
        int var46 = 0;
        int var47 = 0;
        int var48 = 0;
        for (int var49 = 0; var49 < var9; var49++) {
            int var50 = var4.method7047();
            int var51 = 0;
            if ((var50 & 0x1) != 0) {
                var51 = var5.method7213();
            }
            int var52 = 0;
            if ((var50 & 0x2) != 0) {
                var52 = var6.method7213();
            }
            int var53 = 0;
            if ((var50 & 0x4) != 0) {
                var53 = var7.method7213();
            }
            this.field2253[var49] = var46 + var51;
            this.field2239[var49] = var47 + var52;
            this.field2242[var49] = var48 + var53;
            var46 = this.field2253[var49];
            var47 = this.field2239[var49];
            var48 = this.field2242[var49];
            if (var16 == 1) {
                this.field2259[var49] = var8.method7047();
            }
        }
        if (var17 == 1) {
            for (int var54 = 0; var54 < var9; var54++) {
                int var55 = var8.method7047();
                this.field2263[var54] = new int[var55];
                this.field2264[var54] = new int[var55];
                for (int var56 = 0; var56 < var55; var56++) {
                    this.field2263[var54][var56] = var8.method7047();
                    this.field2264[var54][var56] = var8.method7047();
                }
            }
        }
        var4.field4700 = var35;
        var5.field4700 = var30;
        var6.field4700 = var28;
        var7.field4700 = var33;
        var8.field4700 = var29;
        for (int var57 = 0; var57 < var10; var57++) {
            this.field2251[var57] = (short) var4.method7049();
            if (var12 == 1) {
                int var58 = var5.method7047();
                if ((var58 & 0x1) == 1) {
                    this.field2247[var57] = 1;
                    var2 = true;
                } else {
                    this.field2247[var57] = 0;
                }
                if ((var58 & 0x2) == 2) {
                    this.field2250[var57] = (byte) (var58 >> 2);
                    this.field2252[var57] = this.field2251[var57];
                    this.field2251[var57] = 127;
                    if (this.field2252[var57] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field2250[var57] = -1;
                    this.field2252[var57] = -1;
                }
            }
            if (var13 == 255) {
                this.field2248[var57] = var6.method7048();
            }
            if (var14 == 1) {
                this.field2249[var57] = var7.method7048();
            }
            if (var15 == 1) {
                this.field2265[var57] = var8.method7047();
            }
        }
        var4.field4700 = var32;
        var5.field4700 = var25;
        int var59 = 0;
        int var60 = 0;
        int var61 = 0;
        int var62 = 0;
        for (int var63 = 0; var63 < var10; var63++) {
            int var64 = var5.method7047();
            if (var64 == 1) {
                var59 = var4.method7213() + var62;
                var60 = var4.method7213() + var59;
                var61 = var4.method7213() + var60;
                var62 = var61;
                this.field2278[var63] = var59;
                this.field2245[var63] = var60;
                this.field2260[var63] = var61;
            }
            if (var64 == 2) {
                var60 = var61;
                var61 = var4.method7213() + var62;
                var62 = var61;
                this.field2278[var63] = var59;
                this.field2245[var63] = var60;
                this.field2260[var63] = var61;
            }
            if (var64 == 3) {
                var59 = var61;
                var61 = var4.method7213() + var62;
                var62 = var61;
                this.field2278[var63] = var59;
                this.field2245[var63] = var60;
                this.field2260[var63] = var61;
            }
            if (var64 == 4) {
                int var67 = var59;
                var59 = var60;
                var60 = var67;
                var61 = var4.method7213() + var62;
                var62 = var61;
                this.field2278[var63] = var59;
                this.field2245[var63] = var67;
                this.field2260[var63] = var61;
            }
        }
        var4.field4700 = var37;
        for (int var68 = 0; var68 < var11; var68++) {
            this.field2255[var68] = 0;
            this.field2256[var68] = (short) var4.method7049();
            this.field2276[var68] = (short) var4.method7049();
            this.field2258[var68] = (short) var4.method7049();
        }
        if (this.field2250 != null) {
            boolean var69 = false;
            for (int var70 = 0; var70 < var10; var70++) {
                int var71 = this.field2250[var70] & 0xFF;
                if (var71 != 255) {
                    if ((this.field2256[var71] & 0xFFFF) == this.field2278[var70] && (this.field2276[var71] & 0xFFFF) == this.field2245[var70] && (this.field2258[var71] & 0xFFFF) == this.field2260[var70]) {
                        this.field2250[var70] = -1;
                    } else {
                        var69 = true;
                    }
                }
            }
            if (!var69) {
                this.field2250 = null;
            }
        }
        if (!var3) {
            this.field2252 = null;
        }
        if (!var2) {
            this.field2247 = null;
        }
    }

    @ObfuscatedName("gw.j([B)V")
    public void method3595(byte[] arg0) {
        class443 var2 = new class443(arg0);
        class443 var3 = new class443(arg0);
        class443 var4 = new class443(arg0);
        class443 var5 = new class443(arg0);
        class443 var6 = new class443(arg0);
        class443 var7 = new class443(arg0);
        class443 var8 = new class443(arg0);
        var2.field4700 = arg0.length - 23;
        int var9 = var2.method7049();
        int var10 = var2.method7049();
        int var11 = var2.method7047();
        int var12 = var2.method7047();
        int var13 = var2.method7047();
        int var14 = var2.method7047();
        int var15 = var2.method7047();
        int var16 = var2.method7047();
        int var17 = var2.method7047();
        int var18 = var2.method7049();
        int var19 = var2.method7049();
        int var20 = var2.method7049();
        int var21 = var2.method7049();
        int var22 = var2.method7049();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field2255 = new byte[var11];
            var2.field4700 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field2255[var26] = var2.method7048();
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
        this.field2236 = var9;
        this.field2244 = var10;
        this.field2254 = var11;
        this.field2253 = new int[var9];
        this.field2239 = new int[var9];
        this.field2242 = new int[var9];
        this.field2278 = new int[var10];
        this.field2245 = new int[var10];
        this.field2260 = new int[var10];
        if (var17 == 1) {
            this.field2259 = new int[var9];
        }
        if (var12 == 1) {
            this.field2247 = new byte[var10];
        }
        if (var13 == 255) {
            this.field2248 = new byte[var10];
        } else {
            this.field2243 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2249 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2265 = new int[var10];
        }
        if (var16 == 1) {
            this.field2252 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field2250 = new byte[var10];
        }
        this.field2251 = new short[var10];
        if (var11 > 0) {
            this.field2256 = new short[var11];
            this.field2276 = new short[var11];
            this.field2258 = new short[var11];
        }
        var2.field4700 = var11;
        var3.field4700 = var44;
        var4.field4700 = var46;
        var5.field4700 = var48;
        var6.field4700 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method7047();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method7213();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method7213();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method7213();
            }
            this.field2253[var67] = var64 + var69;
            this.field2239[var67] = var65 + var70;
            this.field2242[var67] = var66 + var71;
            var64 = this.field2253[var67];
            var65 = this.field2239[var67];
            var66 = this.field2242[var67];
            if (var17 == 1) {
                this.field2259[var67] = var6.method7047();
            }
        }
        var2.field4700 = var42;
        var3.field4700 = var31;
        var4.field4700 = var34;
        var5.field4700 = var37;
        var6.field4700 = var35;
        var7.field4700 = var40;
        var8.field4700 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field2251[var72] = (short) var2.method7049();
            if (var12 == 1) {
                this.field2247[var72] = var3.method7048();
            }
            if (var13 == 255) {
                this.field2248[var72] = var4.method7048();
            }
            if (var14 == 1) {
                this.field2249[var72] = var5.method7048();
            }
            if (var15 == 1) {
                this.field2265[var72] = var6.method7047();
            }
            if (var16 == 1) {
                this.field2252[var72] = (short) (var7.method7049() - 1);
            }
            if (this.field2250 != null && this.field2252[var72] != -1) {
                this.field2250[var72] = (byte) (var8.method7047() - 1);
            }
        }
        var2.field4700 = var33;
        var3.field4700 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method7047();
            if (var78 == 1) {
                var73 = var2.method7213() + var76;
                var74 = var2.method7213() + var73;
                var75 = var2.method7213() + var74;
                var76 = var75;
                this.field2278[var77] = var73;
                this.field2245[var77] = var74;
                this.field2260[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method7213() + var76;
                var76 = var75;
                this.field2278[var77] = var73;
                this.field2245[var77] = var74;
                this.field2260[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method7213() + var76;
                var76 = var75;
                this.field2278[var77] = var73;
                this.field2245[var77] = var74;
                this.field2260[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method7213() + var76;
                var76 = var75;
                this.field2278[var77] = var73;
                this.field2245[var77] = var81;
                this.field2260[var77] = var75;
            }
        }
        var2.field4700 = var50;
        var3.field4700 = var52;
        var4.field4700 = var54;
        var5.field4700 = var56;
        var6.field4700 = var58;
        var7.field4700 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field2255[var82] & 0xFF;
            if (var83 == 0) {
                this.field2256[var82] = (short) var2.method7049();
                this.field2276[var82] = (short) var2.method7049();
                this.field2258[var82] = (short) var2.method7049();
            }
        }
        var2.field4700 = var62;
        int var84 = var2.method7047();
        if (var84 == 0) {
            return;
        }
        new class215();
        var2.method7049();
        var2.method7049();
        var2.method7049();
        var2.method7052();
    }

    @ObfuscatedName("gw.w([B)V")
    public void method3650(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class443 var4 = new class443(arg0);
        class443 var5 = new class443(arg0);
        class443 var6 = new class443(arg0);
        class443 var7 = new class443(arg0);
        class443 var8 = new class443(arg0);
        var4.field4700 = arg0.length - 18;
        int var9 = var4.method7049();
        int var10 = var4.method7049();
        int var11 = var4.method7047();
        int var12 = var4.method7047();
        int var13 = var4.method7047();
        int var14 = var4.method7047();
        int var15 = var4.method7047();
        int var16 = var4.method7047();
        int var17 = var4.method7049();
        int var18 = var4.method7049();
        int var19 = var4.method7049();
        int var20 = var4.method7049();
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
        this.field2236 = var9;
        this.field2244 = var10;
        this.field2254 = var11;
        this.field2253 = new int[var9];
        this.field2239 = new int[var9];
        this.field2242 = new int[var9];
        this.field2278 = new int[var10];
        this.field2245 = new int[var10];
        this.field2260 = new int[var10];
        if (var11 > 0) {
            this.field2255 = new byte[var11];
            this.field2256 = new short[var11];
            this.field2276 = new short[var11];
            this.field2258 = new short[var11];
        }
        if (var16 == 1) {
            this.field2259 = new int[var9];
        }
        if (var12 == 1) {
            this.field2247 = new byte[var10];
            this.field2250 = new byte[var10];
            this.field2252 = new short[var10];
        }
        if (var13 == 255) {
            this.field2248 = new byte[var10];
        } else {
            this.field2243 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2249 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2265 = new int[var10];
        }
        this.field2251 = new short[var10];
        var4.field4700 = var21;
        var5.field4700 = var36;
        var6.field4700 = var38;
        var7.field4700 = var40;
        var8.field4700 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method7047();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method7213();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method7213();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method7213();
            }
            this.field2253[var46] = var43 + var48;
            this.field2239[var46] = var44 + var49;
            this.field2242[var46] = var45 + var50;
            var43 = this.field2253[var46];
            var44 = this.field2239[var46];
            var45 = this.field2242[var46];
            if (var16 == 1) {
                this.field2259[var46] = var8.method7047();
            }
        }
        var4.field4700 = var32;
        var5.field4700 = var28;
        var6.field4700 = var26;
        var7.field4700 = var30;
        var8.field4700 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field2251[var51] = (short) var4.method7049();
            if (var12 == 1) {
                int var52 = var5.method7047();
                if ((var52 & 0x1) == 1) {
                    this.field2247[var51] = 1;
                    var2 = true;
                } else {
                    this.field2247[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field2250[var51] = (byte) (var52 >> 2);
                    this.field2252[var51] = this.field2251[var51];
                    this.field2251[var51] = 127;
                    if (this.field2252[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field2250[var51] = -1;
                    this.field2252[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field2248[var51] = var6.method7048();
            }
            if (var14 == 1) {
                this.field2249[var51] = var7.method7048();
            }
            if (var15 == 1) {
                this.field2265[var51] = var8.method7047();
            }
        }
        var4.field4700 = var25;
        var5.field4700 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method7047();
            if (var58 == 1) {
                var53 = var4.method7213() + var56;
                var54 = var4.method7213() + var53;
                var55 = var4.method7213() + var54;
                var56 = var55;
                this.field2278[var57] = var53;
                this.field2245[var57] = var54;
                this.field2260[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method7213() + var56;
                var56 = var55;
                this.field2278[var57] = var53;
                this.field2245[var57] = var54;
                this.field2260[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method7213() + var56;
                var56 = var55;
                this.field2278[var57] = var53;
                this.field2245[var57] = var54;
                this.field2260[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method7213() + var56;
                var56 = var55;
                this.field2278[var57] = var53;
                this.field2245[var57] = var61;
                this.field2260[var57] = var55;
            }
        }
        var4.field4700 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field2255[var62] = 0;
            this.field2256[var62] = (short) var4.method7049();
            this.field2276[var62] = (short) var4.method7049();
            this.field2258[var62] = (short) var4.method7049();
        }
        if (this.field2250 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field2250[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field2256[var65] & 0xFFFF) == this.field2278[var64] && (this.field2276[var65] & 0xFFFF) == this.field2245[var64] && (this.field2258[var65] & 0xFFFF) == this.field2260[var64]) {
                        this.field2250[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field2250 = null;
            }
        }
        if (!var3) {
            this.field2252 = null;
        }
        if (!var2) {
            this.field2247 = null;
        }
    }

    public class196(class196[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        this.field2236 = 0;
        this.field2244 = 0;
        this.field2254 = 0;
        this.field2243 = -1;
        for (int var10 = 0; var10 < arg1; var10++) {
            class196 var11 = arg0[var10];
            if (var11 != null) {
                this.field2236 += var11.field2236;
                this.field2244 += var11.field2244;
                this.field2254 += var11.field2254;
                if (var11.field2248 == null) {
                    if (this.field2243 == -1) {
                        this.field2243 = var11.field2243;
                    }
                    if (this.field2243 != var11.field2243) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var11.field2247 != null;
                var5 |= var11.field2249 != null;
                var6 |= var11.field2265 != null;
                var7 |= var11.field2252 != null;
                var8 |= var11.field2250 != null;
                var9 |= var11.field2263 != null;
            }
        }
        this.field2253 = new int[this.field2236];
        this.field2239 = new int[this.field2236];
        this.field2242 = new int[this.field2236];
        this.field2259 = new int[this.field2236];
        this.field2278 = new int[this.field2244];
        this.field2245 = new int[this.field2244];
        this.field2260 = new int[this.field2244];
        if (var3) {
            this.field2247 = new byte[this.field2244];
        }
        if (var4) {
            this.field2248 = new byte[this.field2244];
        }
        if (var5) {
            this.field2249 = new byte[this.field2244];
        }
        if (var6) {
            this.field2265 = new int[this.field2244];
        }
        if (var7) {
            this.field2252 = new short[this.field2244];
        }
        if (var8) {
            this.field2250 = new byte[this.field2244];
        }
        if (var9) {
            this.field2263 = new int[this.field2236][];
            this.field2264 = new int[this.field2236][];
        }
        this.field2251 = new short[this.field2244];
        if (this.field2254 > 0) {
            this.field2255 = new byte[this.field2254];
            this.field2256 = new short[this.field2254];
            this.field2276 = new short[this.field2254];
            this.field2258 = new short[this.field2254];
        }
        this.field2236 = 0;
        this.field2244 = 0;
        this.field2254 = 0;
        for (int var12 = 0; var12 < arg1; var12++) {
            class196 var13 = arg0[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < var13.field2244; var14++) {
                    if (var3 && var13.field2247 != null) {
                        this.field2247[this.field2244] = var13.field2247[var14];
                    }
                    if (var4) {
                        if (var13.field2248 == null) {
                            this.field2248[this.field2244] = var13.field2243;
                        } else {
                            this.field2248[this.field2244] = var13.field2248[var14];
                        }
                    }
                    if (var5 && var13.field2249 != null) {
                        this.field2249[this.field2244] = var13.field2249[var14];
                    }
                    if (var6 && var13.field2265 != null) {
                        this.field2265[this.field2244] = var13.field2265[var14];
                    }
                    if (var7) {
                        if (var13.field2252 == null) {
                            this.field2252[this.field2244] = -1;
                        } else {
                            this.field2252[this.field2244] = var13.field2252[var14];
                        }
                    }
                    if (var8) {
                        if (var13.field2250 == null || var13.field2250[var14] == -1) {
                            this.field2250[this.field2244] = -1;
                        } else {
                            this.field2250[this.field2244] = (byte) (var13.field2250[var14] + this.field2254);
                        }
                    }
                    this.field2251[this.field2244] = var13.field2251[var14];
                    this.field2278[this.field2244] = this.method3597(var13, var13.field2278[var14]);
                    this.field2245[this.field2244] = this.method3597(var13, var13.field2245[var14]);
                    this.field2260[this.field2244] = this.method3597(var13, var13.field2260[var14]);
                    this.field2244++;
                }
                for (int var15 = 0; var15 < var13.field2254; var15++) {
                    byte var16 = this.field2255[this.field2254] = var13.field2255[var15];
                    if (var16 == 0) {
                        this.field2256[this.field2254] = (short) this.method3597(var13, var13.field2256[var15]);
                        this.field2276[this.field2254] = (short) this.method3597(var13, var13.field2276[var15]);
                        this.field2258[this.field2254] = (short) this.method3597(var13, var13.field2258[var15]);
                    }
                    this.field2254++;
                }
            }
        }
    }

    @ObfuscatedName("gw.y(Lgw;I)I")
    public final int method3597(class196 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field2253[arg1];
        int var5 = arg0.field2239[arg1];
        int var6 = arg0.field2242[arg1];
        for (int var7 = 0; var7 < this.field2236; var7++) {
            if (this.field2253[var7] == var4 && this.field2239[var7] == var5 && this.field2242[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field2253[this.field2236] = var4;
            this.field2239[this.field2236] = var5;
            this.field2242[this.field2236] = var6;
            if (arg0.field2259 != null) {
                this.field2259[this.field2236] = arg0.field2259[arg1];
            }
            if (arg0.field2263 != null) {
                this.field2263[this.field2236] = arg0.field2263[arg1];
                this.field2264[this.field2236] = arg0.field2264[arg1];
            }
            var3 = this.field2236++;
        }
        return var3;
    }

    public class196(class196 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field2236 = arg0.field2236;
        this.field2244 = arg0.field2244;
        this.field2254 = arg0.field2254;
        if (arg1) {
            this.field2253 = arg0.field2253;
            this.field2239 = arg0.field2239;
            this.field2242 = arg0.field2242;
        } else {
            this.field2253 = new int[this.field2236];
            this.field2239 = new int[this.field2236];
            this.field2242 = new int[this.field2236];
            for (int var6 = 0; var6 < this.field2236; var6++) {
                this.field2253[var6] = arg0.field2253[var6];
                this.field2239[var6] = arg0.field2239[var6];
                this.field2242[var6] = arg0.field2242[var6];
            }
        }
        if (arg2) {
            this.field2251 = arg0.field2251;
        } else {
            this.field2251 = new short[this.field2244];
            for (int var7 = 0; var7 < this.field2244; var7++) {
                this.field2251[var7] = arg0.field2251[var7];
            }
        }
        if (arg3 || arg0.field2252 == null) {
            this.field2252 = arg0.field2252;
        } else {
            this.field2252 = new short[this.field2244];
            for (int var8 = 0; var8 < this.field2244; var8++) {
                this.field2252[var8] = arg0.field2252[var8];
            }
        }
        if (arg4) {
            this.field2249 = arg0.field2249;
        } else {
            this.field2249 = new byte[this.field2244];
            if (arg0.field2249 == null) {
                for (int var9 = 0; var9 < this.field2244; var9++) {
                    this.field2249[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field2244; var10++) {
                    this.field2249[var10] = arg0.field2249[var10];
                }
            }
        }
        this.field2278 = arg0.field2278;
        this.field2245 = arg0.field2245;
        this.field2260 = arg0.field2260;
        this.field2247 = arg0.field2247;
        this.field2248 = arg0.field2248;
        this.field2250 = arg0.field2250;
        this.field2243 = arg0.field2243;
        this.field2255 = arg0.field2255;
        this.field2256 = arg0.field2256;
        this.field2276 = arg0.field2276;
        this.field2258 = arg0.field2258;
        this.field2259 = arg0.field2259;
        this.field2265 = arg0.field2265;
        this.field2261 = arg0.field2261;
        this.field2267 = arg0.field2267;
        this.field2266 = arg0.field2266;
        this.field2273 = arg0.field2273;
        this.field2257 = arg0.field2257;
        this.field2263 = arg0.field2263;
        this.field2264 = arg0.field2264;
        this.field2268 = arg0.field2268;
        this.field2269 = arg0.field2269;
    }

    @ObfuscatedName("gw.i()Lgw;")
    public class196 method3598() {
        class196 var1 = new class196();
        if (this.field2247 != null) {
            var1.field2247 = new byte[this.field2244];
            for (int var2 = 0; var2 < this.field2244; var2++) {
                var1.field2247[var2] = this.field2247[var2];
            }
        }
        var1.field2236 = this.field2236;
        var1.field2244 = this.field2244;
        var1.field2254 = this.field2254;
        var1.field2253 = this.field2253;
        var1.field2239 = this.field2239;
        var1.field2242 = this.field2242;
        var1.field2278 = this.field2278;
        var1.field2245 = this.field2245;
        var1.field2260 = this.field2260;
        var1.field2248 = this.field2248;
        var1.field2249 = this.field2249;
        var1.field2250 = this.field2250;
        var1.field2251 = this.field2251;
        var1.field2252 = this.field2252;
        var1.field2243 = this.field2243;
        var1.field2255 = this.field2255;
        var1.field2256 = this.field2256;
        var1.field2276 = this.field2276;
        var1.field2258 = this.field2258;
        var1.field2259 = this.field2259;
        var1.field2265 = this.field2265;
        var1.field2261 = this.field2261;
        var1.field2267 = this.field2267;
        var1.field2266 = this.field2266;
        var1.field2273 = this.field2273;
        var1.field2268 = this.field2268;
        var1.field2269 = this.field2269;
        return var1;
    }

    @ObfuscatedName("gw.s([[IIIIZI)Lgw;")
    public class196 method3590(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method3612();
        int var7 = this.field2272 + arg1;
        int var8 = this.field2277 + arg1;
        int var9 = this.field2275 + arg3;
        int var10 = this.field2274 + arg3;
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
        class196 var15;
        if (arg4) {
            var15 = new class196();
            var15.field2236 = this.field2236;
            var15.field2244 = this.field2244;
            var15.field2254 = this.field2254;
            var15.field2253 = this.field2253;
            var15.field2242 = this.field2242;
            var15.field2278 = this.field2278;
            var15.field2245 = this.field2245;
            var15.field2260 = this.field2260;
            var15.field2247 = this.field2247;
            var15.field2248 = this.field2248;
            var15.field2249 = this.field2249;
            var15.field2250 = this.field2250;
            var15.field2251 = this.field2251;
            var15.field2252 = this.field2252;
            var15.field2243 = this.field2243;
            var15.field2255 = this.field2255;
            var15.field2256 = this.field2256;
            var15.field2276 = this.field2276;
            var15.field2258 = this.field2258;
            var15.field2259 = this.field2259;
            var15.field2265 = this.field2265;
            var15.field2261 = this.field2261;
            var15.field2267 = this.field2267;
            var15.field2268 = this.field2268;
            var15.field2269 = this.field2269;
            var15.field2239 = new int[var15.field2236];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field2236; var16++) {
                int var17 = this.field2253[var16] + arg1;
                int var18 = this.field2242[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field2239[var16] = this.field2239[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field2236; var26++) {
                int var27 = (-this.field2239[var26] << 16) / this.field2447;
                if (var27 < arg5) {
                    int var28 = this.field2253[var26] + arg1;
                    int var29 = this.field2242[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field2239[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field2239[var26];
                }
            }
        }
        var15.method3619();
        return var15;
    }

    @ObfuscatedName("gw.t()V")
    public void method3641() {
        int var10002;
        if (this.field2259 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field2236; var3++) {
                int var4 = this.field2259[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field2261 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field2261[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field2236) {
                int var7 = this.field2259[var6];
                this.field2261[var7][var1[var7]++] = var6++;
            }
            this.field2259 = null;
        }
        if (this.field2265 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field2244; var10++) {
            int var11 = this.field2265[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field2267 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field2267[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field2244) {
            int var14 = this.field2265[var13];
            this.field2267[var14][var8[var14]++] = var13++;
        }
        this.field2265 = null;
    }

    @ObfuscatedName("gw.z()V")
    public void method3601() {
        for (int var1 = 0; var1 < this.field2236; var1++) {
            int var2 = this.field2253[var1];
            this.field2253[var1] = this.field2242[var1];
            this.field2242[var1] = -var2;
        }
        this.method3619();
    }

    @ObfuscatedName("gw.r()V")
    public void method3602() {
        for (int var1 = 0; var1 < this.field2236; var1++) {
            this.field2253[var1] = -this.field2253[var1];
            this.field2242[var1] = -this.field2242[var1];
        }
        this.method3619();
    }

    @ObfuscatedName("gw.u()V")
    public void method3611() {
        for (int var1 = 0; var1 < this.field2236; var1++) {
            int var2 = this.field2242[var1];
            this.field2242[var1] = this.field2253[var1];
            this.field2253[var1] = -var2;
        }
        this.method3619();
    }

    @ObfuscatedName("gw.k(I)V")
    public void method3604(int arg0) {
        int var2 = field2279[arg0];
        int var3 = field2280[arg0];
        for (int var4 = 0; var4 < this.field2236; var4++) {
            int var5 = this.field2253[var4] * var3 + this.field2242[var4] * var2 >> 16;
            this.field2242[var4] = this.field2242[var4] * var3 - this.field2253[var4] * var2 >> 16;
            this.field2253[var4] = var5;
        }
        this.method3619();
    }

    @ObfuscatedName("gw.h(III)V")
    public void method3605(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2236; var4++) {
            this.field2253[var4] += arg0;
            this.field2239[var4] += arg1;
            this.field2242[var4] += arg2;
        }
        this.method3619();
    }

    @ObfuscatedName("gw.x(SS)V")
    public void method3606(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2244; var3++) {
            if (this.field2251[var3] == arg0) {
                this.field2251[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("gw.l(SS)V")
    public void method3626(short arg0, short arg1) {
        if (this.field2252 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field2244; var3++) {
            if (this.field2252[var3] == arg0) {
                this.field2252[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("gw.a()V")
    public void method3642() {
        for (int var1 = 0; var1 < this.field2236; var1++) {
            this.field2242[var1] = -this.field2242[var1];
        }
        for (int var2 = 0; var2 < this.field2244; var2++) {
            int var3 = this.field2278[var2];
            this.field2278[var2] = this.field2260[var2];
            this.field2260[var2] = var3;
        }
        this.method3619();
    }

    @ObfuscatedName("gw.p(III)V")
    public void method3600(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2236; var4++) {
            this.field2253[var4] = this.field2253[var4] * arg0 / 128;
            this.field2239[var4] = this.field2239[var4] * arg1 / 128;
            this.field2242[var4] = this.field2242[var4] * arg2 / 128;
        }
        this.method3619();
    }

    @ObfuscatedName("gw.b()V")
    public void method3610() {
        if (this.field2266 != null) {
            return;
        }
        this.field2266 = new class213[this.field2236];
        for (int var1 = 0; var1 < this.field2236; var1++) {
            this.field2266[var1] = new class213();
        }
        for (int var2 = 0; var2 < this.field2244; var2++) {
            int var3 = this.field2278[var2];
            int var4 = this.field2245[var2];
            int var5 = this.field2260[var2];
            int var6 = this.field2253[var4] - this.field2253[var3];
            int var7 = this.field2239[var4] - this.field2239[var3];
            int var8 = this.field2242[var4] - this.field2242[var3];
            int var9 = this.field2253[var5] - this.field2253[var3];
            int var10 = this.field2239[var5] - this.field2239[var3];
            int var11 = this.field2242[var5] - this.field2242[var3];
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
            if (this.field2247 == null) {
                var19 = 0;
            } else {
                var19 = this.field2247[var2];
            }
            if (var19 == 0) {
                class213 var20 = this.field2266[var3];
                var20.field2603 += var16;
                var20.field2600 += var17;
                var20.field2601 += var18;
                var20.field2604++;
                class213 var21 = this.field2266[var4];
                var21.field2603 += var16;
                var21.field2600 += var17;
                var21.field2601 += var18;
                var21.field2604++;
                class213 var22 = this.field2266[var5];
                var22.field2603 += var16;
                var22.field2600 += var17;
                var22.field2601 += var18;
                var22.field2604++;
            } else if (var19 == 1) {
                if (this.field2273 == null) {
                    this.field2273 = new class206[this.field2244];
                }
                class206 var23 = this.field2273[var2] = new class206();
                var23.field2451 = var16;
                var23.field2448 = var17;
                var23.field2450 = var18;
            }
        }
    }

    @ObfuscatedName("gw.n()V")
    public void method3619() {
        this.field2266 = null;
        this.field2257 = null;
        this.field2273 = null;
        this.field2270 = false;
    }

    @ObfuscatedName("gw.o()V")
    public void method3612() {
        if (this.field2270) {
            return;
        }
        this.field2447 = 0;
        this.field2271 = 0;
        this.field2272 = 999999;
        this.field2277 = -999999;
        this.field2274 = -99999;
        this.field2275 = 99999;
        for (int var1 = 0; var1 < this.field2236; var1++) {
            int var2 = this.field2253[var1];
            int var3 = this.field2239[var1];
            int var4 = this.field2242[var1];
            if (var2 < this.field2272) {
                this.field2272 = var2;
            }
            if (var2 > this.field2277) {
                this.field2277 = var2;
            }
            if (var4 < this.field2275) {
                this.field2275 = var4;
            }
            if (var4 > this.field2274) {
                this.field2274 = var4;
            }
            if (-var3 > this.field2447) {
                this.field2447 = -var3;
            }
            if (var3 > this.field2271) {
                this.field2271 = var3;
            }
        }
        this.field2270 = true;
    }

    @ObfuscatedName("gw.m(Lgw;Lgw;IIIZ)V")
    public static void method3613(class196 arg0, class196 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method3612();
        arg0.method3610();
        arg1.method3612();
        arg1.method3610();
        field2246++;
        int var6 = 0;
        int[] var7 = arg1.field2253;
        int var8 = arg1.field2236;
        for (int var9 = 0; var9 < arg0.field2236; var9++) {
            class213 var10 = arg0.field2266[var9];
            if (var10.field2604 != 0) {
                int var11 = arg0.field2239[var9] - arg3;
                if (var11 <= arg1.field2271) {
                    int var12 = arg0.field2253[var9] - arg2;
                    if (var12 >= arg1.field2272 && var12 <= arg1.field2277) {
                        int var13 = arg0.field2242[var9] - arg4;
                        if (var13 >= arg1.field2275 && var13 <= arg1.field2274) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class213 var15 = arg1.field2266[var14];
                                if (var7[var14] == var12 && arg1.field2242[var14] == var13 && arg1.field2239[var14] == var11 && var15.field2604 != 0) {
                                    if (arg0.field2257 == null) {
                                        arg0.field2257 = new class213[arg0.field2236];
                                    }
                                    if (arg1.field2257 == null) {
                                        arg1.field2257 = new class213[var8];
                                    }
                                    class213 var16 = arg0.field2257[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field2257[var9] = new class213(var10);
                                    }
                                    class213 var17 = arg1.field2257[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field2257[var14] = new class213(var15);
                                    }
                                    var16.field2603 += var15.field2603;
                                    var16.field2600 += var15.field2600;
                                    var16.field2601 += var15.field2601;
                                    var16.field2604 += var15.field2604;
                                    var17.field2603 += var10.field2603;
                                    var17.field2600 += var10.field2600;
                                    var17.field2601 += var10.field2601;
                                    var17.field2604 += var10.field2604;
                                    var6++;
                                    field2240[var9] = field2246;
                                    field2241[var14] = field2246;
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
        for (int var18 = 0; var18 < arg0.field2244; var18++) {
            if (field2240[arg0.field2278[var18]] == field2246 && field2240[arg0.field2245[var18]] == field2246 && field2240[arg0.field2260[var18]] == field2246) {
                if (arg0.field2247 == null) {
                    arg0.field2247 = new byte[arg0.field2244];
                }
                arg0.field2247[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field2244; var19++) {
            if (field2241[arg1.field2278[var19]] == field2246 && field2241[arg1.field2245[var19]] == field2246 && field2241[arg1.field2260[var19]] == field2246) {
                if (arg1.field2247 == null) {
                    arg1.field2247 = new byte[arg1.field2244];
                }
                arg1.field2247[var19] = 2;
            }
        }
    }

    @ObfuscatedName("gw.d(IIIII)Lhy;")
    public final class211 method3658(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method3610();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class211 var8 = new class211();
        var8.field2576 = new int[this.field2244];
        var8.field2522 = new int[this.field2244];
        var8.field2542 = new int[this.field2244];
        if (this.field2254 > 0 && this.field2250 != null) {
            int[] var9 = new int[this.field2254];
            for (int var10 = 0; var10 < this.field2244; var10++) {
                if (this.field2250[var10] != -1) {
                    var9[this.field2250[var10] & 0xFF]++;
                }
            }
            var8.field2529 = 0;
            for (int var11 = 0; var11 < this.field2254; var11++) {
                if (var9[var11] > 0 && this.field2255[var11] == 0) {
                    var8.field2529++;
                }
            }
            var8.field2530 = new int[var8.field2529];
            var8.field2523 = new int[var8.field2529];
            var8.field2532 = new int[var8.field2529];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field2254; var13++) {
                if (var9[var13] > 0 && this.field2255[var13] == 0) {
                    var8.field2530[var12] = this.field2256[var13] & 0xFFFF;
                    var8.field2523[var12] = this.field2276[var13] & 0xFFFF;
                    var8.field2532[var12] = this.field2258[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field2526 = new byte[this.field2244];
            for (int var14 = 0; var14 < this.field2244; var14++) {
                if (this.field2250[var14] == -1) {
                    var8.field2526[var14] = -1;
                } else {
                    var8.field2526[var14] = (byte) var9[this.field2250[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field2244; var15++) {
            byte var16;
            if (this.field2247 == null) {
                var16 = 0;
            } else {
                var16 = this.field2247[var15];
            }
            byte var17;
            if (this.field2249 == null) {
                var17 = 0;
            } else {
                var17 = this.field2249[var15];
            }
            short var18;
            if (this.field2252 == null) {
                var18 = -1;
            } else {
                var18 = this.field2252[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field2251[var15] & 0xFFFF;
                    class213 var20;
                    if (this.field2257 == null || this.field2257[this.field2278[var15]] == null) {
                        var20 = this.field2266[this.field2278[var15]];
                    } else {
                        var20 = this.field2257[this.field2278[var15]];
                    }
                    int var21 = (var20.field2601 * arg4 + var20.field2603 * arg2 + var20.field2600 * arg3) / (var20.field2604 * var7) + arg0;
                    var8.field2576[var15] = method3615(var19, var21);
                    class213 var22;
                    if (this.field2257 == null || this.field2257[this.field2245[var15]] == null) {
                        var22 = this.field2266[this.field2245[var15]];
                    } else {
                        var22 = this.field2257[this.field2245[var15]];
                    }
                    int var23 = (var22.field2601 * arg4 + var22.field2603 * arg2 + var22.field2600 * arg3) / (var22.field2604 * var7) + arg0;
                    var8.field2522[var15] = method3615(var19, var23);
                    class213 var24;
                    if (this.field2257 == null || this.field2257[this.field2260[var15]] == null) {
                        var24 = this.field2266[this.field2260[var15]];
                    } else {
                        var24 = this.field2257[this.field2260[var15]];
                    }
                    int var25 = (var24.field2601 * arg4 + var24.field2603 * arg2 + var24.field2600 * arg3) / (var24.field2604 * var7) + arg0;
                    var8.field2542[var15] = method3615(var19, var25);
                } else if (var16 == 1) {
                    class206 var26 = this.field2273[var15];
                    int var27 = (var26.field2450 * arg4 + var26.field2451 * arg2 + var26.field2448 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field2576[var15] = method3615(this.field2251[var15] & 0xFFFF, var27);
                    var8.field2542[var15] = -1;
                } else if (var16 == 3) {
                    var8.field2576[var15] = 128;
                    var8.field2542[var15] = -1;
                } else {
                    var8.field2542[var15] = -2;
                }
            } else if (var16 == 0) {
                class213 var28;
                if (this.field2257 == null || this.field2257[this.field2278[var15]] == null) {
                    var28 = this.field2266[this.field2278[var15]];
                } else {
                    var28 = this.field2257[this.field2278[var15]];
                }
                int var29 = (var28.field2601 * arg4 + var28.field2603 * arg2 + var28.field2600 * arg3) / (var28.field2604 * var7) + arg0;
                var8.field2576[var15] = method3616(var29);
                class213 var30;
                if (this.field2257 == null || this.field2257[this.field2245[var15]] == null) {
                    var30 = this.field2266[this.field2245[var15]];
                } else {
                    var30 = this.field2257[this.field2245[var15]];
                }
                int var31 = (var30.field2601 * arg4 + var30.field2603 * arg2 + var30.field2600 * arg3) / (var30.field2604 * var7) + arg0;
                var8.field2522[var15] = method3616(var31);
                class213 var32;
                if (this.field2257 == null || this.field2257[this.field2260[var15]] == null) {
                    var32 = this.field2266[this.field2260[var15]];
                } else {
                    var32 = this.field2257[this.field2260[var15]];
                }
                int var33 = (var32.field2601 * arg4 + var32.field2603 * arg2 + var32.field2600 * arg3) / (var32.field2604 * var7) + arg0;
                var8.field2542[var15] = method3616(var33);
            } else if (var16 == 1) {
                class206 var34 = this.field2273[var15];
                int var35 = (var34.field2450 * arg4 + var34.field2451 * arg2 + var34.field2448 * arg3) / (var7 / 2 + var7) + arg0;
                var8.field2576[var15] = method3616(var35);
                var8.field2542[var15] = -1;
            } else {
                var8.field2542[var15] = -2;
            }
        }
        this.method3641();
        var8.field2572 = this.field2236;
        var8.field2514 = this.field2253;
        var8.field2515 = this.field2239;
        var8.field2516 = this.field2242;
        var8.field2517 = this.field2244;
        var8.field2518 = this.field2278;
        var8.field2519 = this.field2245;
        var8.field2547 = this.field2260;
        var8.field2524 = this.field2248;
        var8.field2555 = this.field2249;
        var8.field2528 = this.field2243;
        var8.field2539 = this.field2261;
        var8.field2534 = this.field2267;
        var8.field2527 = this.field2252;
        var8.field2535 = this.field2263;
        var8.field2520 = this.field2264;
        return var8;
    }

    @ObfuscatedName("gw.ad(II)I")
    public static final int method3615(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("gw.ak(I)I")
    public static final int method3616(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
