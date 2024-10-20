package deob;

@ObfuscatedName("gp")
public class class196 extends class205 {

    @ObfuscatedName("gp.v")
    public int field2247 = 0;

    @ObfuscatedName("gp.c")
    public int[] field2234;

    @ObfuscatedName("gp.q")
    public int[] field2235;

    @ObfuscatedName("gp.i")
    public int[] field2250;

    @ObfuscatedName("gp.k")
    public int field2237 = 0;

    @ObfuscatedName("gp.o")
    public int[] field2236;

    @ObfuscatedName("gp.n")
    public int[] field2257;

    @ObfuscatedName("gp.d")
    public int[] field2240;

    @ObfuscatedName("gp.a")
    public byte[] field2241;

    @ObfuscatedName("gp.m")
    public byte[] field2242;

    @ObfuscatedName("gp.u")
    public byte[] field2243;

    @ObfuscatedName("gp.l")
    public byte[] field2244;

    @ObfuscatedName("gp.z")
    public short[] field2239;

    @ObfuscatedName("gp.r")
    public short[] field2246;

    @ObfuscatedName("gp.y")
    public byte field2265 = 0;

    @ObfuscatedName("gp.p")
    public int field2248;

    @ObfuscatedName("gp.e")
    public byte[] field2249;

    @ObfuscatedName("gp.b")
    public short[] field2231;

    @ObfuscatedName("gp.x")
    public short[] field2251;

    @ObfuscatedName("gp.f")
    public short[] field2252;

    @ObfuscatedName("gp.t")
    public int[] field2253;

    @ObfuscatedName("gp.j")
    public int[] field2254;

    @ObfuscatedName("gp.g")
    public int[][] field2255;

    @ObfuscatedName("gp.ar")
    public int[][] field2256;

    @ObfuscatedName("gp.aq")
    public int[][] field2263;

    @ObfuscatedName("gp.av")
    public int[][] field2258;

    @ObfuscatedName("gp.aj")
    public class206[] field2259;

    @ObfuscatedName("gp.ax")
    public class213[] field2233;

    @ObfuscatedName("gp.ab")
    public class213[] field2261;

    @ObfuscatedName("gp.ak")
    public short field2260;

    @ObfuscatedName("gp.au")
    public short field2262;

    @ObfuscatedName("gp.ae")
    public boolean field2264 = false;

    @ObfuscatedName("gp.as")
    public int field2274;

    @ObfuscatedName("gp.ay")
    public int field2238;

    @ObfuscatedName("gp.ag")
    public int field2232;

    @ObfuscatedName("gp.ad")
    public int field2268;

    @ObfuscatedName("gp.af")
    public int field2269;

    @ObfuscatedName("gp.aw")
    public static int[] field2270 = new int[10000];

    @ObfuscatedName("gp.ai")
    public static int[] field2271 = new int[10000];

    @ObfuscatedName("gp.ap")
    public static int field2272 = 0;

    @ObfuscatedName("gp.az")
    public static int[] field2230 = class201.field2346;

    @ObfuscatedName("gp.an")
    public static int[] field2267 = class201.field2363;

    public class196() {
    }

    @ObfuscatedName("gp.s(Lls;II)Lgp;")
    public static class196 method3512(class316 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method5179(arg1, arg2);
        return var3 == null ? null : new class196(var3);
    }

    public class196(byte[] arg0) {
        class444 var2 = new class444(10);
        var2.method6913(-2);
        if (arg0[arg0.length - 1] == -3 && arg0[arg0.length - 2] == -1) {
            this.method3483(arg0);
        } else if (arg0[arg0.length - 1] == -2 && arg0[arg0.length - 2] == -1) {
            this.method3484(arg0);
        } else if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method3485(arg0);
        } else {
            this.method3501(arg0);
        }
    }

    @ObfuscatedName("gp.w([B)V")
    public void method3483(byte[] arg0) {
        class444 var2 = new class444(arg0);
        class444 var3 = new class444(arg0);
        class444 var4 = new class444(arg0);
        class444 var5 = new class444(arg0);
        class444 var6 = new class444(arg0);
        class444 var7 = new class444(arg0);
        class444 var8 = new class444(arg0);
        var2.field4708 = arg0.length - 26;
        int var9 = var2.method7120();
        int var10 = var2.method7120();
        int var11 = var2.method6929();
        int var12 = var2.method6929();
        int var13 = var2.method6929();
        int var14 = var2.method6929();
        int var15 = var2.method6929();
        int var16 = var2.method6929();
        int var17 = var2.method6929();
        int var18 = var2.method6929();
        int var19 = var2.method7120();
        int var20 = var2.method7120();
        int var21 = var2.method7120();
        int var22 = var2.method7120();
        int var23 = var2.method7120();
        int var24 = var2.method7120();
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        if (var11 > 0) {
            this.field2249 = new byte[var11];
            var2.field4708 = 0;
            for (int var28 = 0; var28 < var11; var28++) {
                byte var29 = this.field2249[var28] = var2.method6930();
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
        this.field2247 = var9;
        this.field2237 = var10;
        this.field2248 = var11;
        this.field2234 = new int[var9];
        this.field2235 = new int[var9];
        this.field2250 = new int[var9];
        this.field2236 = new int[var10];
        this.field2257 = new int[var10];
        this.field2240 = new int[var10];
        if (var17 == 1) {
            this.field2253 = new int[var9];
        }
        if (var12 == 1) {
            this.field2241 = new byte[var10];
        }
        if (var13 == 255) {
            this.field2242 = new byte[var10];
        } else {
            this.field2265 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2243 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2254 = new int[var10];
        }
        if (var16 == 1) {
            this.field2246 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field2244 = new byte[var10];
        }
        if (var18 == 1) {
            this.field2263 = new int[var9][];
            this.field2258 = new int[var9][];
        }
        this.field2239 = new short[var10];
        if (var11 > 0) {
            this.field2231 = new short[var11];
            this.field2251 = new short[var11];
            this.field2252 = new short[var11];
        }
        var2.field4708 = var11;
        var3.field4708 = var47;
        var4.field4708 = var49;
        var5.field4708 = var51;
        var6.field4708 = var35;
        int var67 = 0;
        int var68 = 0;
        int var69 = 0;
        for (int var70 = 0; var70 < var9; var70++) {
            int var71 = var2.method6929();
            int var72 = 0;
            if ((var71 & 0x1) != 0) {
                var72 = var3.method7044();
            }
            int var73 = 0;
            if ((var71 & 0x2) != 0) {
                var73 = var4.method7044();
            }
            int var74 = 0;
            if ((var71 & 0x4) != 0) {
                var74 = var5.method7044();
            }
            this.field2234[var70] = var67 + var72;
            this.field2235[var70] = var68 + var73;
            this.field2250[var70] = var69 + var74;
            var67 = this.field2234[var70];
            var68 = this.field2235[var70];
            var69 = this.field2250[var70];
            if (var17 == 1) {
                this.field2253[var70] = var6.method6929();
            }
        }
        if (var18 == 1) {
            for (int var75 = 0; var75 < var9; var75++) {
                int var76 = var6.method6929();
                this.field2263[var75] = new int[var76];
                this.field2258[var75] = new int[var76];
                for (int var77 = 0; var77 < var76; var77++) {
                    this.field2263[var75][var77] = var6.method6929();
                    this.field2258[var75][var77] = var6.method6929();
                }
            }
        }
        var2.field4708 = var45;
        var3.field4708 = var33;
        var4.field4708 = var36;
        var5.field4708 = var40;
        var6.field4708 = var37;
        var7.field4708 = var43;
        var8.field4708 = var42;
        for (int var78 = 0; var78 < var10; var78++) {
            this.field2239[var78] = (short) var2.method7120();
            if (var12 == 1) {
                this.field2241[var78] = var3.method6930();
            }
            if (var13 == 255) {
                this.field2242[var78] = var4.method6930();
            }
            if (var14 == 1) {
                this.field2243[var78] = var5.method6930();
            }
            if (var15 == 1) {
                this.field2254[var78] = var6.method6929();
            }
            if (var16 == 1) {
                this.field2246[var78] = (short) (var7.method7120() - 1);
            }
            if (this.field2244 != null && this.field2246[var78] != -1) {
                this.field2244[var78] = (byte) (var8.method6929() - 1);
            }
        }
        var2.field4708 = var39;
        var3.field4708 = var32;
        int var79 = 0;
        int var80 = 0;
        int var81 = 0;
        int var82 = 0;
        for (int var83 = 0; var83 < var10; var83++) {
            int var84 = var3.method6929();
            if (var84 == 1) {
                var79 = var2.method7044() + var82;
                var80 = var2.method7044() + var79;
                var81 = var2.method7044() + var80;
                var82 = var81;
                this.field2236[var83] = var79;
                this.field2257[var83] = var80;
                this.field2240[var83] = var81;
            }
            if (var84 == 2) {
                var80 = var81;
                var81 = var2.method7044() + var82;
                var82 = var81;
                this.field2236[var83] = var79;
                this.field2257[var83] = var80;
                this.field2240[var83] = var81;
            }
            if (var84 == 3) {
                var79 = var81;
                var81 = var2.method7044() + var82;
                var82 = var81;
                this.field2236[var83] = var79;
                this.field2257[var83] = var80;
                this.field2240[var83] = var81;
            }
            if (var84 == 4) {
                int var87 = var79;
                var79 = var80;
                var80 = var87;
                var81 = var2.method7044() + var82;
                var82 = var81;
                this.field2236[var83] = var79;
                this.field2257[var83] = var87;
                this.field2240[var83] = var81;
            }
        }
        var2.field4708 = var53;
        var3.field4708 = var55;
        var4.field4708 = var57;
        var5.field4708 = var59;
        var6.field4708 = var61;
        var7.field4708 = var63;
        for (int var88 = 0; var88 < var11; var88++) {
            int var89 = this.field2249[var88] & 0xFF;
            if (var89 == 0) {
                this.field2231[var88] = (short) var2.method7120();
                this.field2251[var88] = (short) var2.method7120();
                this.field2252[var88] = (short) var2.method7120();
            }
        }
        var2.field4708 = var65;
        int var90 = var2.method6929();
        if (var90 == 0) {
            return;
        }
        new class215();
        var2.method7120();
        var2.method7120();
        var2.method7120();
        var2.method6934();
    }

    @ObfuscatedName("gp.v([B)V")
    public void method3484(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class444 var4 = new class444(arg0);
        class444 var5 = new class444(arg0);
        class444 var6 = new class444(arg0);
        class444 var7 = new class444(arg0);
        class444 var8 = new class444(arg0);
        var4.field4708 = arg0.length - 23;
        int var9 = var4.method7120();
        int var10 = var4.method7120();
        int var11 = var4.method6929();
        int var12 = var4.method6929();
        int var13 = var4.method6929();
        int var14 = var4.method6929();
        int var15 = var4.method6929();
        int var16 = var4.method6929();
        int var17 = var4.method6929();
        int var18 = var4.method7120();
        int var19 = var4.method7120();
        int var20 = var4.method7120();
        int var21 = var4.method7120();
        int var22 = var4.method7120();
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
        this.field2247 = var9;
        this.field2237 = var10;
        this.field2248 = var11;
        this.field2234 = new int[var9];
        this.field2235 = new int[var9];
        this.field2250 = new int[var9];
        this.field2236 = new int[var10];
        this.field2257 = new int[var10];
        this.field2240 = new int[var10];
        if (var11 > 0) {
            this.field2249 = new byte[var11];
            this.field2231 = new short[var11];
            this.field2251 = new short[var11];
            this.field2252 = new short[var11];
        }
        if (var16 == 1) {
            this.field2253 = new int[var9];
        }
        if (var12 == 1) {
            this.field2241 = new byte[var10];
            this.field2244 = new byte[var10];
            this.field2246 = new short[var10];
        }
        if (var13 == 255) {
            this.field2242 = new byte[var10];
        } else {
            this.field2265 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2243 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2254 = new int[var10];
        }
        if (var17 == 1) {
            this.field2263 = new int[var9][];
            this.field2258 = new int[var9][];
        }
        this.field2239 = new short[var10];
        var4.field4708 = var23;
        var5.field4708 = var39;
        var6.field4708 = var41;
        var7.field4708 = var43;
        var8.field4708 = var27;
        int var46 = 0;
        int var47 = 0;
        int var48 = 0;
        for (int var49 = 0; var49 < var9; var49++) {
            int var50 = var4.method6929();
            int var51 = 0;
            if ((var50 & 0x1) != 0) {
                var51 = var5.method7044();
            }
            int var52 = 0;
            if ((var50 & 0x2) != 0) {
                var52 = var6.method7044();
            }
            int var53 = 0;
            if ((var50 & 0x4) != 0) {
                var53 = var7.method7044();
            }
            this.field2234[var49] = var46 + var51;
            this.field2235[var49] = var47 + var52;
            this.field2250[var49] = var48 + var53;
            var46 = this.field2234[var49];
            var47 = this.field2235[var49];
            var48 = this.field2250[var49];
            if (var16 == 1) {
                this.field2253[var49] = var8.method6929();
            }
        }
        if (var17 == 1) {
            for (int var54 = 0; var54 < var9; var54++) {
                int var55 = var8.method6929();
                this.field2263[var54] = new int[var55];
                this.field2258[var54] = new int[var55];
                for (int var56 = 0; var56 < var55; var56++) {
                    this.field2263[var54][var56] = var8.method6929();
                    this.field2258[var54][var56] = var8.method6929();
                }
            }
        }
        var4.field4708 = var35;
        var5.field4708 = var30;
        var6.field4708 = var28;
        var7.field4708 = var33;
        var8.field4708 = var29;
        for (int var57 = 0; var57 < var10; var57++) {
            this.field2239[var57] = (short) var4.method7120();
            if (var12 == 1) {
                int var58 = var5.method6929();
                if ((var58 & 0x1) == 1) {
                    this.field2241[var57] = 1;
                    var2 = true;
                } else {
                    this.field2241[var57] = 0;
                }
                if ((var58 & 0x2) == 2) {
                    this.field2244[var57] = (byte) (var58 >> 2);
                    this.field2246[var57] = this.field2239[var57];
                    this.field2239[var57] = 127;
                    if (this.field2246[var57] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field2244[var57] = -1;
                    this.field2246[var57] = -1;
                }
            }
            if (var13 == 255) {
                this.field2242[var57] = var6.method6930();
            }
            if (var14 == 1) {
                this.field2243[var57] = var7.method6930();
            }
            if (var15 == 1) {
                this.field2254[var57] = var8.method6929();
            }
        }
        var4.field4708 = var32;
        var5.field4708 = var25;
        int var59 = 0;
        int var60 = 0;
        int var61 = 0;
        int var62 = 0;
        for (int var63 = 0; var63 < var10; var63++) {
            int var64 = var5.method6929();
            if (var64 == 1) {
                var59 = var4.method7044() + var62;
                var60 = var4.method7044() + var59;
                var61 = var4.method7044() + var60;
                var62 = var61;
                this.field2236[var63] = var59;
                this.field2257[var63] = var60;
                this.field2240[var63] = var61;
            }
            if (var64 == 2) {
                var60 = var61;
                var61 = var4.method7044() + var62;
                var62 = var61;
                this.field2236[var63] = var59;
                this.field2257[var63] = var60;
                this.field2240[var63] = var61;
            }
            if (var64 == 3) {
                var59 = var61;
                var61 = var4.method7044() + var62;
                var62 = var61;
                this.field2236[var63] = var59;
                this.field2257[var63] = var60;
                this.field2240[var63] = var61;
            }
            if (var64 == 4) {
                int var67 = var59;
                var59 = var60;
                var60 = var67;
                var61 = var4.method7044() + var62;
                var62 = var61;
                this.field2236[var63] = var59;
                this.field2257[var63] = var67;
                this.field2240[var63] = var61;
            }
        }
        var4.field4708 = var37;
        for (int var68 = 0; var68 < var11; var68++) {
            this.field2249[var68] = 0;
            this.field2231[var68] = (short) var4.method7120();
            this.field2251[var68] = (short) var4.method7120();
            this.field2252[var68] = (short) var4.method7120();
        }
        if (this.field2244 != null) {
            boolean var69 = false;
            for (int var70 = 0; var70 < var10; var70++) {
                int var71 = this.field2244[var70] & 0xFF;
                if (var71 != 255) {
                    if ((this.field2231[var71] & 0xFFFF) == this.field2236[var70] && (this.field2251[var71] & 0xFFFF) == this.field2257[var70] && (this.field2252[var71] & 0xFFFF) == this.field2240[var70]) {
                        this.field2244[var70] = -1;
                    } else {
                        var69 = true;
                    }
                }
            }
            if (!var69) {
                this.field2244 = null;
            }
        }
        if (!var3) {
            this.field2246 = null;
        }
        if (!var2) {
            this.field2241 = null;
        }
    }

    @ObfuscatedName("gp.k([B)V")
    public void method3485(byte[] arg0) {
        class444 var2 = new class444(arg0);
        class444 var3 = new class444(arg0);
        class444 var4 = new class444(arg0);
        class444 var5 = new class444(arg0);
        class444 var6 = new class444(arg0);
        class444 var7 = new class444(arg0);
        class444 var8 = new class444(arg0);
        var2.field4708 = arg0.length - 23;
        int var9 = var2.method7120();
        int var10 = var2.method7120();
        int var11 = var2.method6929();
        int var12 = var2.method6929();
        int var13 = var2.method6929();
        int var14 = var2.method6929();
        int var15 = var2.method6929();
        int var16 = var2.method6929();
        int var17 = var2.method6929();
        int var18 = var2.method7120();
        int var19 = var2.method7120();
        int var20 = var2.method7120();
        int var21 = var2.method7120();
        int var22 = var2.method7120();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field2249 = new byte[var11];
            var2.field4708 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field2249[var26] = var2.method6930();
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
        this.field2247 = var9;
        this.field2237 = var10;
        this.field2248 = var11;
        this.field2234 = new int[var9];
        this.field2235 = new int[var9];
        this.field2250 = new int[var9];
        this.field2236 = new int[var10];
        this.field2257 = new int[var10];
        this.field2240 = new int[var10];
        if (var17 == 1) {
            this.field2253 = new int[var9];
        }
        if (var12 == 1) {
            this.field2241 = new byte[var10];
        }
        if (var13 == 255) {
            this.field2242 = new byte[var10];
        } else {
            this.field2265 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2243 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2254 = new int[var10];
        }
        if (var16 == 1) {
            this.field2246 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field2244 = new byte[var10];
        }
        this.field2239 = new short[var10];
        if (var11 > 0) {
            this.field2231 = new short[var11];
            this.field2251 = new short[var11];
            this.field2252 = new short[var11];
        }
        var2.field4708 = var11;
        var3.field4708 = var44;
        var4.field4708 = var46;
        var5.field4708 = var48;
        var6.field4708 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method6929();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method7044();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method7044();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method7044();
            }
            this.field2234[var67] = var64 + var69;
            this.field2235[var67] = var65 + var70;
            this.field2250[var67] = var66 + var71;
            var64 = this.field2234[var67];
            var65 = this.field2235[var67];
            var66 = this.field2250[var67];
            if (var17 == 1) {
                this.field2253[var67] = var6.method6929();
            }
        }
        var2.field4708 = var42;
        var3.field4708 = var31;
        var4.field4708 = var34;
        var5.field4708 = var37;
        var6.field4708 = var35;
        var7.field4708 = var40;
        var8.field4708 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field2239[var72] = (short) var2.method7120();
            if (var12 == 1) {
                this.field2241[var72] = var3.method6930();
            }
            if (var13 == 255) {
                this.field2242[var72] = var4.method6930();
            }
            if (var14 == 1) {
                this.field2243[var72] = var5.method6930();
            }
            if (var15 == 1) {
                this.field2254[var72] = var6.method6929();
            }
            if (var16 == 1) {
                this.field2246[var72] = (short) (var7.method7120() - 1);
            }
            if (this.field2244 != null && this.field2246[var72] != -1) {
                this.field2244[var72] = (byte) (var8.method6929() - 1);
            }
        }
        var2.field4708 = var33;
        var3.field4708 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method6929();
            if (var78 == 1) {
                var73 = var2.method7044() + var76;
                var74 = var2.method7044() + var73;
                var75 = var2.method7044() + var74;
                var76 = var75;
                this.field2236[var77] = var73;
                this.field2257[var77] = var74;
                this.field2240[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method7044() + var76;
                var76 = var75;
                this.field2236[var77] = var73;
                this.field2257[var77] = var74;
                this.field2240[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method7044() + var76;
                var76 = var75;
                this.field2236[var77] = var73;
                this.field2257[var77] = var74;
                this.field2240[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method7044() + var76;
                var76 = var75;
                this.field2236[var77] = var73;
                this.field2257[var77] = var81;
                this.field2240[var77] = var75;
            }
        }
        var2.field4708 = var50;
        var3.field4708 = var52;
        var4.field4708 = var54;
        var5.field4708 = var56;
        var6.field4708 = var58;
        var7.field4708 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field2249[var82] & 0xFF;
            if (var83 == 0) {
                this.field2231[var82] = (short) var2.method7120();
                this.field2251[var82] = (short) var2.method7120();
                this.field2252[var82] = (short) var2.method7120();
            }
        }
        var2.field4708 = var62;
        int var84 = var2.method6929();
        if (var84 == 0) {
            return;
        }
        new class215();
        var2.method7120();
        var2.method7120();
        var2.method7120();
        var2.method6934();
    }

    @ObfuscatedName("gp.o([B)V")
    public void method3501(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class444 var4 = new class444(arg0);
        class444 var5 = new class444(arg0);
        class444 var6 = new class444(arg0);
        class444 var7 = new class444(arg0);
        class444 var8 = new class444(arg0);
        var4.field4708 = arg0.length - 18;
        int var9 = var4.method7120();
        int var10 = var4.method7120();
        int var11 = var4.method6929();
        int var12 = var4.method6929();
        int var13 = var4.method6929();
        int var14 = var4.method6929();
        int var15 = var4.method6929();
        int var16 = var4.method6929();
        int var17 = var4.method7120();
        int var18 = var4.method7120();
        int var19 = var4.method7120();
        int var20 = var4.method7120();
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
        this.field2247 = var9;
        this.field2237 = var10;
        this.field2248 = var11;
        this.field2234 = new int[var9];
        this.field2235 = new int[var9];
        this.field2250 = new int[var9];
        this.field2236 = new int[var10];
        this.field2257 = new int[var10];
        this.field2240 = new int[var10];
        if (var11 > 0) {
            this.field2249 = new byte[var11];
            this.field2231 = new short[var11];
            this.field2251 = new short[var11];
            this.field2252 = new short[var11];
        }
        if (var16 == 1) {
            this.field2253 = new int[var9];
        }
        if (var12 == 1) {
            this.field2241 = new byte[var10];
            this.field2244 = new byte[var10];
            this.field2246 = new short[var10];
        }
        if (var13 == 255) {
            this.field2242 = new byte[var10];
        } else {
            this.field2265 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2243 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2254 = new int[var10];
        }
        this.field2239 = new short[var10];
        var4.field4708 = var21;
        var5.field4708 = var36;
        var6.field4708 = var38;
        var7.field4708 = var40;
        var8.field4708 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method6929();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method7044();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method7044();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method7044();
            }
            this.field2234[var46] = var43 + var48;
            this.field2235[var46] = var44 + var49;
            this.field2250[var46] = var45 + var50;
            var43 = this.field2234[var46];
            var44 = this.field2235[var46];
            var45 = this.field2250[var46];
            if (var16 == 1) {
                this.field2253[var46] = var8.method6929();
            }
        }
        var4.field4708 = var32;
        var5.field4708 = var28;
        var6.field4708 = var26;
        var7.field4708 = var30;
        var8.field4708 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field2239[var51] = (short) var4.method7120();
            if (var12 == 1) {
                int var52 = var5.method6929();
                if ((var52 & 0x1) == 1) {
                    this.field2241[var51] = 1;
                    var2 = true;
                } else {
                    this.field2241[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field2244[var51] = (byte) (var52 >> 2);
                    this.field2246[var51] = this.field2239[var51];
                    this.field2239[var51] = 127;
                    if (this.field2246[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field2244[var51] = -1;
                    this.field2246[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field2242[var51] = var6.method6930();
            }
            if (var14 == 1) {
                this.field2243[var51] = var7.method6930();
            }
            if (var15 == 1) {
                this.field2254[var51] = var8.method6929();
            }
        }
        var4.field4708 = var25;
        var5.field4708 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method6929();
            if (var58 == 1) {
                var53 = var4.method7044() + var56;
                var54 = var4.method7044() + var53;
                var55 = var4.method7044() + var54;
                var56 = var55;
                this.field2236[var57] = var53;
                this.field2257[var57] = var54;
                this.field2240[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method7044() + var56;
                var56 = var55;
                this.field2236[var57] = var53;
                this.field2257[var57] = var54;
                this.field2240[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method7044() + var56;
                var56 = var55;
                this.field2236[var57] = var53;
                this.field2257[var57] = var54;
                this.field2240[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method7044() + var56;
                var56 = var55;
                this.field2236[var57] = var53;
                this.field2257[var57] = var61;
                this.field2240[var57] = var55;
            }
        }
        var4.field4708 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field2249[var62] = 0;
            this.field2231[var62] = (short) var4.method7120();
            this.field2251[var62] = (short) var4.method7120();
            this.field2252[var62] = (short) var4.method7120();
        }
        if (this.field2244 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field2244[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field2231[var65] & 0xFFFF) == this.field2236[var64] && (this.field2251[var65] & 0xFFFF) == this.field2257[var64] && (this.field2252[var65] & 0xFFFF) == this.field2240[var64]) {
                        this.field2244[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field2244 = null;
            }
        }
        if (!var3) {
            this.field2246 = null;
        }
        if (!var2) {
            this.field2241 = null;
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
        this.field2247 = 0;
        this.field2237 = 0;
        this.field2248 = 0;
        this.field2265 = -1;
        for (int var10 = 0; var10 < arg1; var10++) {
            class196 var11 = arg0[var10];
            if (var11 != null) {
                this.field2247 += var11.field2247;
                this.field2237 += var11.field2237;
                this.field2248 += var11.field2248;
                if (var11.field2242 == null) {
                    if (this.field2265 == -1) {
                        this.field2265 = var11.field2265;
                    }
                    if (this.field2265 != var11.field2265) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var11.field2241 != null;
                var5 |= var11.field2243 != null;
                var6 |= var11.field2254 != null;
                var7 |= var11.field2246 != null;
                var8 |= var11.field2244 != null;
                var9 |= var11.field2263 != null;
            }
        }
        this.field2234 = new int[this.field2247];
        this.field2235 = new int[this.field2247];
        this.field2250 = new int[this.field2247];
        this.field2253 = new int[this.field2247];
        this.field2236 = new int[this.field2237];
        this.field2257 = new int[this.field2237];
        this.field2240 = new int[this.field2237];
        if (var3) {
            this.field2241 = new byte[this.field2237];
        }
        if (var4) {
            this.field2242 = new byte[this.field2237];
        }
        if (var5) {
            this.field2243 = new byte[this.field2237];
        }
        if (var6) {
            this.field2254 = new int[this.field2237];
        }
        if (var7) {
            this.field2246 = new short[this.field2237];
        }
        if (var8) {
            this.field2244 = new byte[this.field2237];
        }
        if (var9) {
            this.field2263 = new int[this.field2247][];
            this.field2258 = new int[this.field2247][];
        }
        this.field2239 = new short[this.field2237];
        if (this.field2248 > 0) {
            this.field2249 = new byte[this.field2248];
            this.field2231 = new short[this.field2248];
            this.field2251 = new short[this.field2248];
            this.field2252 = new short[this.field2248];
        }
        this.field2247 = 0;
        this.field2237 = 0;
        this.field2248 = 0;
        for (int var12 = 0; var12 < arg1; var12++) {
            class196 var13 = arg0[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < var13.field2237; var14++) {
                    if (var3 && var13.field2241 != null) {
                        this.field2241[this.field2237] = var13.field2241[var14];
                    }
                    if (var4) {
                        if (var13.field2242 == null) {
                            this.field2242[this.field2237] = var13.field2265;
                        } else {
                            this.field2242[this.field2237] = var13.field2242[var14];
                        }
                    }
                    if (var5 && var13.field2243 != null) {
                        this.field2243[this.field2237] = var13.field2243[var14];
                    }
                    if (var6 && var13.field2254 != null) {
                        this.field2254[this.field2237] = var13.field2254[var14];
                    }
                    if (var7) {
                        if (var13.field2246 == null) {
                            this.field2246[this.field2237] = -1;
                        } else {
                            this.field2246[this.field2237] = var13.field2246[var14];
                        }
                    }
                    if (var8) {
                        if (var13.field2244 == null || var13.field2244[var14] == -1) {
                            this.field2244[this.field2237] = -1;
                        } else {
                            this.field2244[this.field2237] = (byte) (var13.field2244[var14] + this.field2248);
                        }
                    }
                    this.field2239[this.field2237] = var13.field2239[var14];
                    this.field2236[this.field2237] = this.method3487(var13, var13.field2236[var14]);
                    this.field2257[this.field2237] = this.method3487(var13, var13.field2257[var14]);
                    this.field2240[this.field2237] = this.method3487(var13, var13.field2240[var14]);
                    this.field2237++;
                }
                for (int var15 = 0; var15 < var13.field2248; var15++) {
                    byte var16 = this.field2249[this.field2248] = var13.field2249[var15];
                    if (var16 == 0) {
                        this.field2231[this.field2248] = (short) this.method3487(var13, var13.field2231[var15]);
                        this.field2251[this.field2248] = (short) this.method3487(var13, var13.field2251[var15]);
                        this.field2252[this.field2248] = (short) this.method3487(var13, var13.field2252[var15]);
                    }
                    this.field2248++;
                }
            }
        }
    }

    @ObfuscatedName("gp.n(Lgp;I)I")
    public final int method3487(class196 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field2234[arg1];
        int var5 = arg0.field2235[arg1];
        int var6 = arg0.field2250[arg1];
        for (int var7 = 0; var7 < this.field2247; var7++) {
            if (this.field2234[var7] == var4 && this.field2235[var7] == var5 && this.field2250[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field2234[this.field2247] = var4;
            this.field2235[this.field2247] = var5;
            this.field2250[this.field2247] = var6;
            if (arg0.field2253 != null) {
                this.field2253[this.field2247] = arg0.field2253[arg1];
            }
            if (arg0.field2263 != null) {
                this.field2263[this.field2247] = arg0.field2263[arg1];
                this.field2258[this.field2247] = arg0.field2258[arg1];
            }
            var3 = this.field2247++;
        }
        return var3;
    }

    public class196(class196 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field2247 = arg0.field2247;
        this.field2237 = arg0.field2237;
        this.field2248 = arg0.field2248;
        if (arg1) {
            this.field2234 = arg0.field2234;
            this.field2235 = arg0.field2235;
            this.field2250 = arg0.field2250;
        } else {
            this.field2234 = new int[this.field2247];
            this.field2235 = new int[this.field2247];
            this.field2250 = new int[this.field2247];
            for (int var6 = 0; var6 < this.field2247; var6++) {
                this.field2234[var6] = arg0.field2234[var6];
                this.field2235[var6] = arg0.field2235[var6];
                this.field2250[var6] = arg0.field2250[var6];
            }
        }
        if (arg2) {
            this.field2239 = arg0.field2239;
        } else {
            this.field2239 = new short[this.field2237];
            for (int var7 = 0; var7 < this.field2237; var7++) {
                this.field2239[var7] = arg0.field2239[var7];
            }
        }
        if (arg3 || arg0.field2246 == null) {
            this.field2246 = arg0.field2246;
        } else {
            this.field2246 = new short[this.field2237];
            for (int var8 = 0; var8 < this.field2237; var8++) {
                this.field2246[var8] = arg0.field2246[var8];
            }
        }
        if (arg4) {
            this.field2243 = arg0.field2243;
        } else {
            this.field2243 = new byte[this.field2237];
            if (arg0.field2243 == null) {
                for (int var9 = 0; var9 < this.field2237; var9++) {
                    this.field2243[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field2237; var10++) {
                    this.field2243[var10] = arg0.field2243[var10];
                }
            }
        }
        this.field2236 = arg0.field2236;
        this.field2257 = arg0.field2257;
        this.field2240 = arg0.field2240;
        this.field2241 = arg0.field2241;
        this.field2242 = arg0.field2242;
        this.field2244 = arg0.field2244;
        this.field2265 = arg0.field2265;
        this.field2249 = arg0.field2249;
        this.field2231 = arg0.field2231;
        this.field2251 = arg0.field2251;
        this.field2252 = arg0.field2252;
        this.field2253 = arg0.field2253;
        this.field2254 = arg0.field2254;
        this.field2255 = arg0.field2255;
        this.field2256 = arg0.field2256;
        this.field2233 = arg0.field2233;
        this.field2259 = arg0.field2259;
        this.field2261 = arg0.field2261;
        this.field2263 = arg0.field2263;
        this.field2258 = arg0.field2258;
        this.field2260 = arg0.field2260;
        this.field2262 = arg0.field2262;
    }

    @ObfuscatedName("gp.d()Lgp;")
    public class196 method3515() {
        class196 var1 = new class196();
        if (this.field2241 != null) {
            var1.field2241 = new byte[this.field2237];
            for (int var2 = 0; var2 < this.field2237; var2++) {
                var1.field2241[var2] = this.field2241[var2];
            }
        }
        var1.field2247 = this.field2247;
        var1.field2237 = this.field2237;
        var1.field2248 = this.field2248;
        var1.field2234 = this.field2234;
        var1.field2235 = this.field2235;
        var1.field2250 = this.field2250;
        var1.field2236 = this.field2236;
        var1.field2257 = this.field2257;
        var1.field2240 = this.field2240;
        var1.field2242 = this.field2242;
        var1.field2243 = this.field2243;
        var1.field2244 = this.field2244;
        var1.field2239 = this.field2239;
        var1.field2246 = this.field2246;
        var1.field2265 = this.field2265;
        var1.field2249 = this.field2249;
        var1.field2231 = this.field2231;
        var1.field2251 = this.field2251;
        var1.field2252 = this.field2252;
        var1.field2253 = this.field2253;
        var1.field2254 = this.field2254;
        var1.field2255 = this.field2255;
        var1.field2256 = this.field2256;
        var1.field2233 = this.field2233;
        var1.field2259 = this.field2259;
        var1.field2260 = this.field2260;
        var1.field2262 = this.field2262;
        return var1;
    }

    @ObfuscatedName("gp.a([[IIIIZI)Lgp;")
    public class196 method3490(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method3554();
        int var7 = this.field2238 + arg1;
        int var8 = this.field2232 + arg1;
        int var9 = this.field2269 + arg3;
        int var10 = this.field2268 + arg3;
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
            var15.field2247 = this.field2247;
            var15.field2237 = this.field2237;
            var15.field2248 = this.field2248;
            var15.field2234 = this.field2234;
            var15.field2250 = this.field2250;
            var15.field2236 = this.field2236;
            var15.field2257 = this.field2257;
            var15.field2240 = this.field2240;
            var15.field2241 = this.field2241;
            var15.field2242 = this.field2242;
            var15.field2243 = this.field2243;
            var15.field2244 = this.field2244;
            var15.field2239 = this.field2239;
            var15.field2246 = this.field2246;
            var15.field2265 = this.field2265;
            var15.field2249 = this.field2249;
            var15.field2231 = this.field2231;
            var15.field2251 = this.field2251;
            var15.field2252 = this.field2252;
            var15.field2253 = this.field2253;
            var15.field2254 = this.field2254;
            var15.field2255 = this.field2255;
            var15.field2256 = this.field2256;
            var15.field2260 = this.field2260;
            var15.field2262 = this.field2262;
            var15.field2235 = new int[var15.field2247];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field2247; var16++) {
                int var17 = this.field2234[var16] + arg1;
                int var18 = this.field2250[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field2235[var16] = this.field2235[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field2247; var26++) {
                int var27 = (-this.field2235[var26] << 16) / this.field2449;
                if (var27 < arg5) {
                    int var28 = this.field2234[var26] + arg1;
                    int var29 = this.field2250[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field2235[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field2235[var26];
                }
            }
        }
        var15.method3502();
        return var15;
    }

    @ObfuscatedName("gp.m()V")
    public void method3542() {
        int var10002;
        if (this.field2253 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field2247; var3++) {
                int var4 = this.field2253[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field2255 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field2255[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field2247) {
                int var7 = this.field2253[var6];
                this.field2255[var7][var1[var7]++] = var6++;
            }
            this.field2253 = null;
        }
        if (this.field2254 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field2237; var10++) {
            int var11 = this.field2254[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field2256 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field2256[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field2237) {
            int var14 = this.field2254[var13];
            this.field2256[var14][var8[var14]++] = var13++;
        }
        this.field2254 = null;
    }

    @ObfuscatedName("gp.u()V")
    public void method3492() {
        for (int var1 = 0; var1 < this.field2247; var1++) {
            int var2 = this.field2234[var1];
            this.field2234[var1] = this.field2250[var1];
            this.field2250[var1] = -var2;
        }
        this.method3502();
    }

    @ObfuscatedName("gp.l()V")
    public void method3493() {
        for (int var1 = 0; var1 < this.field2247; var1++) {
            this.field2234[var1] = -this.field2234[var1];
            this.field2250[var1] = -this.field2250[var1];
        }
        this.method3502();
    }

    @ObfuscatedName("gp.z()V")
    public void method3482() {
        for (int var1 = 0; var1 < this.field2247; var1++) {
            int var2 = this.field2250[var1];
            this.field2250[var1] = this.field2234[var1];
            this.field2234[var1] = -var2;
        }
        this.method3502();
    }

    @ObfuscatedName("gp.r(I)V")
    public void method3495(int arg0) {
        int var2 = field2230[arg0];
        int var3 = field2267[arg0];
        for (int var4 = 0; var4 < this.field2247; var4++) {
            int var5 = this.field2250[var4] * var2 + this.field2234[var4] * var3 >> 16;
            this.field2250[var4] = this.field2250[var4] * var3 - this.field2234[var4] * var2 >> 16;
            this.field2234[var4] = var5;
        }
        this.method3502();
    }

    @ObfuscatedName("gp.y(III)V")
    public void method3496(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2247; var4++) {
            this.field2234[var4] += arg0;
            this.field2235[var4] += arg1;
            this.field2250[var4] += arg2;
        }
        this.method3502();
    }

    @ObfuscatedName("gp.p(SS)V")
    public void method3497(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2237; var3++) {
            if (this.field2239[var3] == arg0) {
                this.field2239[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("gp.e(SS)V")
    public void method3500(short arg0, short arg1) {
        if (this.field2246 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field2237; var3++) {
            if (this.field2246[var3] == arg0) {
                this.field2246[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("gp.b()V")
    public void method3499() {
        for (int var1 = 0; var1 < this.field2247; var1++) {
            this.field2250[var1] = -this.field2250[var1];
        }
        for (int var2 = 0; var2 < this.field2237; var2++) {
            int var3 = this.field2236[var2];
            this.field2236[var2] = this.field2240[var2];
            this.field2240[var2] = var3;
        }
        this.method3502();
    }

    @ObfuscatedName("gp.x(III)V")
    public void method3509(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2247; var4++) {
            this.field2234[var4] = this.field2234[var4] * arg0 / 128;
            this.field2235[var4] = this.field2235[var4] * arg1 / 128;
            this.field2250[var4] = this.field2250[var4] * arg2 / 128;
        }
        this.method3502();
    }

    @ObfuscatedName("gp.f()V")
    public void method3532() {
        if (this.field2233 != null) {
            return;
        }
        this.field2233 = new class213[this.field2247];
        for (int var1 = 0; var1 < this.field2247; var1++) {
            this.field2233[var1] = new class213();
        }
        for (int var2 = 0; var2 < this.field2237; var2++) {
            int var3 = this.field2236[var2];
            int var4 = this.field2257[var2];
            int var5 = this.field2240[var2];
            int var6 = this.field2234[var4] - this.field2234[var3];
            int var7 = this.field2235[var4] - this.field2235[var3];
            int var8 = this.field2250[var4] - this.field2250[var3];
            int var9 = this.field2234[var5] - this.field2234[var3];
            int var10 = this.field2235[var5] - this.field2235[var3];
            int var11 = this.field2250[var5] - this.field2250[var3];
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
            if (this.field2241 == null) {
                var19 = 0;
            } else {
                var19 = this.field2241[var2];
            }
            if (var19 == 0) {
                class213 var20 = this.field2233[var3];
                var20.field2605 += var16;
                var20.field2604 += var17;
                var20.field2603 += var18;
                var20.field2606++;
                class213 var21 = this.field2233[var4];
                var21.field2605 += var16;
                var21.field2604 += var17;
                var21.field2603 += var18;
                var21.field2606++;
                class213 var22 = this.field2233[var5];
                var22.field2605 += var16;
                var22.field2604 += var17;
                var22.field2603 += var18;
                var22.field2606++;
            } else if (var19 == 1) {
                if (this.field2259 == null) {
                    this.field2259 = new class206[this.field2237];
                }
                class206 var23 = this.field2259[var2] = new class206();
                var23.field2450 = var16;
                var23.field2451 = var17;
                var23.field2452 = var18;
            }
        }
    }

    @ObfuscatedName("gp.t()V")
    public void method3502() {
        this.field2233 = null;
        this.field2261 = null;
        this.field2259 = null;
        this.field2264 = false;
    }

    @ObfuscatedName("gp.j()V")
    public void method3554() {
        if (this.field2264) {
            return;
        }
        this.field2449 = 0;
        this.field2274 = 0;
        this.field2238 = 999999;
        this.field2232 = -999999;
        this.field2268 = -99999;
        this.field2269 = 99999;
        for (int var1 = 0; var1 < this.field2247; var1++) {
            int var2 = this.field2234[var1];
            int var3 = this.field2235[var1];
            int var4 = this.field2250[var1];
            if (var2 < this.field2238) {
                this.field2238 = var2;
            }
            if (var2 > this.field2232) {
                this.field2232 = var2;
            }
            if (var4 < this.field2269) {
                this.field2269 = var4;
            }
            if (var4 > this.field2268) {
                this.field2268 = var4;
            }
            if (-var3 > this.field2449) {
                this.field2449 = -var3;
            }
            if (var3 > this.field2274) {
                this.field2274 = var3;
            }
        }
        this.field2264 = true;
    }

    @ObfuscatedName("gp.g(Lgp;Lgp;IIIZ)V")
    public static void method3504(class196 arg0, class196 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method3554();
        arg0.method3532();
        arg1.method3554();
        arg1.method3532();
        field2272++;
        int var6 = 0;
        int[] var7 = arg1.field2234;
        int var8 = arg1.field2247;
        for (int var9 = 0; var9 < arg0.field2247; var9++) {
            class213 var10 = arg0.field2233[var9];
            if (var10.field2606 != 0) {
                int var11 = arg0.field2235[var9] - arg3;
                if (var11 <= arg1.field2274) {
                    int var12 = arg0.field2234[var9] - arg2;
                    if (var12 >= arg1.field2238 && var12 <= arg1.field2232) {
                        int var13 = arg0.field2250[var9] - arg4;
                        if (var13 >= arg1.field2269 && var13 <= arg1.field2268) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class213 var15 = arg1.field2233[var14];
                                if (var7[var14] == var12 && arg1.field2250[var14] == var13 && arg1.field2235[var14] == var11 && var15.field2606 != 0) {
                                    if (arg0.field2261 == null) {
                                        arg0.field2261 = new class213[arg0.field2247];
                                    }
                                    if (arg1.field2261 == null) {
                                        arg1.field2261 = new class213[var8];
                                    }
                                    class213 var16 = arg0.field2261[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field2261[var9] = new class213(var10);
                                    }
                                    class213 var17 = arg1.field2261[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field2261[var14] = new class213(var15);
                                    }
                                    var16.field2605 += var15.field2605;
                                    var16.field2604 += var15.field2604;
                                    var16.field2603 += var15.field2603;
                                    var16.field2606 += var15.field2606;
                                    var17.field2605 += var10.field2605;
                                    var17.field2604 += var10.field2604;
                                    var17.field2603 += var10.field2603;
                                    var17.field2606 += var10.field2606;
                                    var6++;
                                    field2270[var9] = field2272;
                                    field2271[var14] = field2272;
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
        for (int var18 = 0; var18 < arg0.field2237; var18++) {
            if (field2270[arg0.field2236[var18]] == field2272 && field2270[arg0.field2257[var18]] == field2272 && field2270[arg0.field2240[var18]] == field2272) {
                if (arg0.field2241 == null) {
                    arg0.field2241 = new byte[arg0.field2237];
                }
                arg0.field2241[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field2237; var19++) {
            if (field2271[arg1.field2236[var19]] == field2272 && field2271[arg1.field2257[var19]] == field2272 && field2271[arg1.field2240[var19]] == field2272) {
                if (arg1.field2241 == null) {
                    arg1.field2241 = new byte[arg1.field2237];
                }
                arg1.field2241[var19] = 2;
            }
        }
    }

    @ObfuscatedName("gp.ar(IIIII)Lhp;")
    public final class211 method3565(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method3532();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class211 var8 = new class211();
        var8.field2559 = new int[this.field2237];
        var8.field2523 = new int[this.field2237];
        var8.field2527 = new int[this.field2237];
        if (this.field2248 > 0 && this.field2244 != null) {
            int[] var9 = new int[this.field2248];
            for (int var10 = 0; var10 < this.field2237; var10++) {
                if (this.field2244[var10] != -1) {
                    var9[this.field2244[var10] & 0xFF]++;
                }
            }
            var8.field2533 = 0;
            for (int var11 = 0; var11 < this.field2248; var11++) {
                if (var9[var11] > 0 && this.field2249[var11] == 0) {
                    var8.field2533++;
                }
            }
            var8.field2534 = new int[var8.field2533];
            var8.field2526 = new int[var8.field2533];
            var8.field2518 = new int[var8.field2533];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field2248; var13++) {
                if (var9[var13] > 0 && this.field2249[var13] == 0) {
                    var8.field2534[var12] = this.field2231[var13] & 0xFFFF;
                    var8.field2526[var12] = this.field2251[var13] & 0xFFFF;
                    var8.field2518[var12] = this.field2252[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field2530 = new byte[this.field2237];
            for (int var14 = 0; var14 < this.field2237; var14++) {
                if (this.field2244[var14] == -1) {
                    var8.field2530[var14] = -1;
                } else {
                    var8.field2530[var14] = (byte) var9[this.field2244[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field2237; var15++) {
            byte var16;
            if (this.field2241 == null) {
                var16 = 0;
            } else {
                var16 = this.field2241[var15];
            }
            byte var17;
            if (this.field2243 == null) {
                var17 = 0;
            } else {
                var17 = this.field2243[var15];
            }
            short var18;
            if (this.field2246 == null) {
                var18 = -1;
            } else {
                var18 = this.field2246[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field2239[var15] & 0xFFFF;
                    class213 var20;
                    if (this.field2261 == null || this.field2261[this.field2236[var15]] == null) {
                        var20 = this.field2233[this.field2236[var15]];
                    } else {
                        var20 = this.field2261[this.field2236[var15]];
                    }
                    int var21 = (var20.field2603 * arg4 + var20.field2605 * arg2 + var20.field2604 * arg3) / (var20.field2606 * var7) + arg0;
                    var8.field2559[var15] = method3527(var19, var21);
                    class213 var22;
                    if (this.field2261 == null || this.field2261[this.field2257[var15]] == null) {
                        var22 = this.field2233[this.field2257[var15]];
                    } else {
                        var22 = this.field2261[this.field2257[var15]];
                    }
                    int var23 = (var22.field2603 * arg4 + var22.field2605 * arg2 + var22.field2604 * arg3) / (var22.field2606 * var7) + arg0;
                    var8.field2523[var15] = method3527(var19, var23);
                    class213 var24;
                    if (this.field2261 == null || this.field2261[this.field2240[var15]] == null) {
                        var24 = this.field2233[this.field2240[var15]];
                    } else {
                        var24 = this.field2261[this.field2240[var15]];
                    }
                    int var25 = (var24.field2603 * arg4 + var24.field2605 * arg2 + var24.field2604 * arg3) / (var24.field2606 * var7) + arg0;
                    var8.field2527[var15] = method3527(var19, var25);
                } else if (var16 == 1) {
                    class206 var26 = this.field2259[var15];
                    int var27 = (var26.field2452 * arg4 + var26.field2451 * arg3 + var26.field2450 * arg2) / (var7 / 2 + var7) + arg0;
                    var8.field2559[var15] = method3527(this.field2239[var15] & 0xFFFF, var27);
                    var8.field2527[var15] = -1;
                } else if (var16 == 3) {
                    var8.field2559[var15] = 128;
                    var8.field2527[var15] = -1;
                } else {
                    var8.field2527[var15] = -2;
                }
            } else if (var16 == 0) {
                class213 var28;
                if (this.field2261 == null || this.field2261[this.field2236[var15]] == null) {
                    var28 = this.field2233[this.field2236[var15]];
                } else {
                    var28 = this.field2261[this.field2236[var15]];
                }
                int var29 = (var28.field2603 * arg4 + var28.field2605 * arg2 + var28.field2604 * arg3) / (var28.field2606 * var7) + arg0;
                var8.field2559[var15] = method3507(var29);
                class213 var30;
                if (this.field2261 == null || this.field2261[this.field2257[var15]] == null) {
                    var30 = this.field2233[this.field2257[var15]];
                } else {
                    var30 = this.field2261[this.field2257[var15]];
                }
                int var31 = (var30.field2603 * arg4 + var30.field2605 * arg2 + var30.field2604 * arg3) / (var30.field2606 * var7) + arg0;
                var8.field2523[var15] = method3507(var31);
                class213 var32;
                if (this.field2261 == null || this.field2261[this.field2240[var15]] == null) {
                    var32 = this.field2233[this.field2240[var15]];
                } else {
                    var32 = this.field2261[this.field2240[var15]];
                }
                int var33 = (var32.field2603 * arg4 + var32.field2605 * arg2 + var32.field2604 * arg3) / (var32.field2606 * var7) + arg0;
                var8.field2527[var15] = method3507(var33);
            } else if (var16 == 1) {
                class206 var34 = this.field2259[var15];
                int var35 = (var34.field2452 * arg4 + var34.field2451 * arg3 + var34.field2450 * arg2) / (var7 / 2 + var7) + arg0;
                var8.field2559[var15] = method3507(var35);
                var8.field2527[var15] = -1;
            } else {
                var8.field2527[var15] = -2;
            }
        }
        this.method3542();
        var8.field2517 = this.field2247;
        var8.field2510 = this.field2234;
        var8.field2538 = this.field2235;
        var8.field2520 = this.field2250;
        var8.field2521 = this.field2237;
        var8.field2522 = this.field2236;
        var8.field2551 = this.field2257;
        var8.field2524 = this.field2240;
        var8.field2516 = this.field2242;
        var8.field2529 = this.field2243;
        var8.field2532 = this.field2265;
        var8.field2537 = this.field2255;
        var8.field2535 = this.field2256;
        var8.field2531 = this.field2246;
        var8.field2578 = this.field2263;
        var8.field2582 = this.field2258;
        return var8;
    }

    @ObfuscatedName("gp.aq(II)I")
    public static final int method3527(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("gp.av(I)I")
    public static final int method3507(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
