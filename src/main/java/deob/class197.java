package deob;

@ObfuscatedName("gu")
public class class197 extends class206 {

    @ObfuscatedName("gu.n")
    public int field2270 = 0;

    @ObfuscatedName("gu.k")
    public int[] field2271;

    @ObfuscatedName("gu.w")
    public int[] field2272;

    @ObfuscatedName("gu.s")
    public int[] field2273;

    @ObfuscatedName("gu.q")
    public int field2274 = 0;

    @ObfuscatedName("gu.m")
    public int[] field2275;

    @ObfuscatedName("gu.x")
    public int[] field2283;

    @ObfuscatedName("gu.j")
    public int[] field2277;

    @ObfuscatedName("gu.v")
    public byte[] field2302;

    @ObfuscatedName("gu.h")
    public byte[] field2278;

    @ObfuscatedName("gu.t")
    public byte[] field2280;

    @ObfuscatedName("gu.u")
    public byte[] field2281;

    @ObfuscatedName("gu.d")
    public short[] field2282;

    @ObfuscatedName("gu.b")
    public short[] field2286;

    @ObfuscatedName("gu.a")
    public byte field2284 = 0;

    @ObfuscatedName("gu.l")
    public int field2285;

    @ObfuscatedName("gu.e")
    public byte[] field2305;

    @ObfuscatedName("gu.g")
    public short[] field2287;

    @ObfuscatedName("gu.y")
    public short[] field2288;

    @ObfuscatedName("gu.i")
    public short[] field2311;

    @ObfuscatedName("gu.r")
    public int[] field2290;

    @ObfuscatedName("gu.z")
    public int[] field2292;

    @ObfuscatedName("gu.o")
    public int[][] field2276;

    @ObfuscatedName("gu.as")
    public int[][] field2296;

    @ObfuscatedName("gu.ac")
    public int[][] field2294;

    @ObfuscatedName("gu.ao")
    public int[][] field2279;

    @ObfuscatedName("gu.ar")
    public class207[] field2267;

    @ObfuscatedName("gu.aq")
    public class214[] field2297;

    @ObfuscatedName("gu.ai")
    public class214[] field2298;

    @ObfuscatedName("gu.an")
    public short field2291;

    @ObfuscatedName("gu.aa")
    public short field2300;

    @ObfuscatedName("gu.ak")
    public boolean field2299 = false;

    @ObfuscatedName("gu.am")
    public int field2295;

    @ObfuscatedName("gu.ap")
    public int field2303;

    @ObfuscatedName("gu.ab")
    public int field2304;

    @ObfuscatedName("gu.az")
    public int field2301;

    @ObfuscatedName("gu.ad")
    public int field2293;

    @ObfuscatedName("gu.af")
    public static int[] field2307 = new int[10000];

    @ObfuscatedName("gu.aj")
    public static int[] field2308 = new int[10000];

    @ObfuscatedName("gu.ax")
    public static int field2309 = 0;

    @ObfuscatedName("gu.av")
    public static int[] field2310 = class202.field2396;

    @ObfuscatedName("gu.ae")
    public static int[] field2306 = class202.field2381;

    public class197() {
    }

    @ObfuscatedName("gu.c(Llv;II)Lgu;")
    public static class197 method3742(class317 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method5499(arg1, arg2);
        return var3 == null ? null : new class197(var3);
    }

    public class197(byte[] arg0) {
        class445 var2 = new class445(10);
        var2.method7286(-2);
        if (arg0[arg0.length - 1] == -3 && arg0[arg0.length - 2] == -1) {
            this.method3671(arg0);
        } else if (arg0[arg0.length - 1] == -2 && arg0[arg0.length - 2] == -1) {
            this.method3672(arg0);
        } else if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method3673(arg0);
        } else {
            this.method3695(arg0);
        }
    }

    @ObfuscatedName("gu.f([B)V")
    public void method3671(byte[] arg0) {
        class445 var2 = new class445(arg0);
        class445 var3 = new class445(arg0);
        class445 var4 = new class445(arg0);
        class445 var5 = new class445(arg0);
        class445 var6 = new class445(arg0);
        class445 var7 = new class445(arg0);
        class445 var8 = new class445(arg0);
        var2.field4735 = arg0.length - 26;
        int var9 = var2.method7198();
        int var10 = var2.method7198();
        int var11 = var2.method7196();
        int var12 = var2.method7196();
        int var13 = var2.method7196();
        int var14 = var2.method7196();
        int var15 = var2.method7196();
        int var16 = var2.method7196();
        int var17 = var2.method7196();
        int var18 = var2.method7196();
        int var19 = var2.method7198();
        int var20 = var2.method7198();
        int var21 = var2.method7198();
        int var22 = var2.method7198();
        int var23 = var2.method7198();
        int var24 = var2.method7198();
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        if (var11 > 0) {
            this.field2305 = new byte[var11];
            var2.field4735 = 0;
            for (int var28 = 0; var28 < var11; var28++) {
                byte var29 = this.field2305[var28] = var2.method7197();
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
        this.field2270 = var9;
        this.field2274 = var10;
        this.field2285 = var11;
        this.field2271 = new int[var9];
        this.field2272 = new int[var9];
        this.field2273 = new int[var9];
        this.field2275 = new int[var10];
        this.field2283 = new int[var10];
        this.field2277 = new int[var10];
        if (var17 == 1) {
            this.field2290 = new int[var9];
        }
        if (var12 == 1) {
            this.field2302 = new byte[var10];
        }
        if (var13 == 255) {
            this.field2278 = new byte[var10];
        } else {
            this.field2284 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2280 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2292 = new int[var10];
        }
        if (var16 == 1) {
            this.field2286 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field2281 = new byte[var10];
        }
        if (var18 == 1) {
            this.field2294 = new int[var9][];
            this.field2279 = new int[var9][];
        }
        this.field2282 = new short[var10];
        if (var11 > 0) {
            this.field2287 = new short[var11];
            this.field2288 = new short[var11];
            this.field2311 = new short[var11];
        }
        var2.field4735 = var11;
        var3.field4735 = var47;
        var4.field4735 = var49;
        var5.field4735 = var51;
        var6.field4735 = var35;
        int var67 = 0;
        int var68 = 0;
        int var69 = 0;
        for (int var70 = 0; var70 < var9; var70++) {
            int var71 = var2.method7196();
            int var72 = 0;
            if ((var71 & 0x1) != 0) {
                var72 = var3.method7210();
            }
            int var73 = 0;
            if ((var71 & 0x2) != 0) {
                var73 = var4.method7210();
            }
            int var74 = 0;
            if ((var71 & 0x4) != 0) {
                var74 = var5.method7210();
            }
            this.field2271[var70] = var67 + var72;
            this.field2272[var70] = var68 + var73;
            this.field2273[var70] = var69 + var74;
            var67 = this.field2271[var70];
            var68 = this.field2272[var70];
            var69 = this.field2273[var70];
            if (var17 == 1) {
                this.field2290[var70] = var6.method7196();
            }
        }
        if (var18 == 1) {
            for (int var75 = 0; var75 < var9; var75++) {
                int var76 = var6.method7196();
                this.field2294[var75] = new int[var76];
                this.field2279[var75] = new int[var76];
                for (int var77 = 0; var77 < var76; var77++) {
                    this.field2294[var75][var77] = var6.method7196();
                    this.field2279[var75][var77] = var6.method7196();
                }
            }
        }
        var2.field4735 = var45;
        var3.field4735 = var33;
        var4.field4735 = var36;
        var5.field4735 = var40;
        var6.field4735 = var37;
        var7.field4735 = var43;
        var8.field4735 = var42;
        for (int var78 = 0; var78 < var10; var78++) {
            this.field2282[var78] = (short) var2.method7198();
            if (var12 == 1) {
                this.field2302[var78] = var3.method7197();
            }
            if (var13 == 255) {
                this.field2278[var78] = var4.method7197();
            }
            if (var14 == 1) {
                this.field2280[var78] = var5.method7197();
            }
            if (var15 == 1) {
                this.field2292[var78] = var6.method7196();
            }
            if (var16 == 1) {
                this.field2286[var78] = (short) (var7.method7198() - 1);
            }
            if (this.field2281 != null && this.field2286[var78] != -1) {
                this.field2281[var78] = (byte) (var8.method7196() - 1);
            }
        }
        var2.field4735 = var39;
        var3.field4735 = var32;
        int var79 = 0;
        int var80 = 0;
        int var81 = 0;
        int var82 = 0;
        for (int var83 = 0; var83 < var10; var83++) {
            int var84 = var3.method7196();
            if (var84 == 1) {
                var79 = var2.method7210() + var82;
                var80 = var2.method7210() + var79;
                var81 = var2.method7210() + var80;
                var82 = var81;
                this.field2275[var83] = var79;
                this.field2283[var83] = var80;
                this.field2277[var83] = var81;
            }
            if (var84 == 2) {
                var80 = var81;
                var81 = var2.method7210() + var82;
                var82 = var81;
                this.field2275[var83] = var79;
                this.field2283[var83] = var80;
                this.field2277[var83] = var81;
            }
            if (var84 == 3) {
                var79 = var81;
                var81 = var2.method7210() + var82;
                var82 = var81;
                this.field2275[var83] = var79;
                this.field2283[var83] = var80;
                this.field2277[var83] = var81;
            }
            if (var84 == 4) {
                int var87 = var79;
                var79 = var80;
                var80 = var87;
                var81 = var2.method7210() + var82;
                var82 = var81;
                this.field2275[var83] = var79;
                this.field2283[var83] = var87;
                this.field2277[var83] = var81;
            }
        }
        var2.field4735 = var53;
        var3.field4735 = var55;
        var4.field4735 = var57;
        var5.field4735 = var59;
        var6.field4735 = var61;
        var7.field4735 = var63;
        for (int var88 = 0; var88 < var11; var88++) {
            int var89 = this.field2305[var88] & 0xFF;
            if (var89 == 0) {
                this.field2287[var88] = (short) var2.method7198();
                this.field2288[var88] = (short) var2.method7198();
                this.field2311[var88] = (short) var2.method7198();
            }
        }
        var2.field4735 = var65;
        int var90 = var2.method7196();
        if (var90 == 0) {
            return;
        }
        new class216();
        var2.method7198();
        var2.method7198();
        var2.method7198();
        var2.method7201();
    }

    @ObfuscatedName("gu.w([B)V")
    public void method3672(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class445 var4 = new class445(arg0);
        class445 var5 = new class445(arg0);
        class445 var6 = new class445(arg0);
        class445 var7 = new class445(arg0);
        class445 var8 = new class445(arg0);
        var4.field4735 = arg0.length - 23;
        int var9 = var4.method7198();
        int var10 = var4.method7198();
        int var11 = var4.method7196();
        int var12 = var4.method7196();
        int var13 = var4.method7196();
        int var14 = var4.method7196();
        int var15 = var4.method7196();
        int var16 = var4.method7196();
        int var17 = var4.method7196();
        int var18 = var4.method7198();
        int var19 = var4.method7198();
        int var20 = var4.method7198();
        int var21 = var4.method7198();
        int var22 = var4.method7198();
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
        this.field2270 = var9;
        this.field2274 = var10;
        this.field2285 = var11;
        this.field2271 = new int[var9];
        this.field2272 = new int[var9];
        this.field2273 = new int[var9];
        this.field2275 = new int[var10];
        this.field2283 = new int[var10];
        this.field2277 = new int[var10];
        if (var11 > 0) {
            this.field2305 = new byte[var11];
            this.field2287 = new short[var11];
            this.field2288 = new short[var11];
            this.field2311 = new short[var11];
        }
        if (var16 == 1) {
            this.field2290 = new int[var9];
        }
        if (var12 == 1) {
            this.field2302 = new byte[var10];
            this.field2281 = new byte[var10];
            this.field2286 = new short[var10];
        }
        if (var13 == 255) {
            this.field2278 = new byte[var10];
        } else {
            this.field2284 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2280 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2292 = new int[var10];
        }
        if (var17 == 1) {
            this.field2294 = new int[var9][];
            this.field2279 = new int[var9][];
        }
        this.field2282 = new short[var10];
        var4.field4735 = var23;
        var5.field4735 = var39;
        var6.field4735 = var41;
        var7.field4735 = var43;
        var8.field4735 = var27;
        int var46 = 0;
        int var47 = 0;
        int var48 = 0;
        for (int var49 = 0; var49 < var9; var49++) {
            int var50 = var4.method7196();
            int var51 = 0;
            if ((var50 & 0x1) != 0) {
                var51 = var5.method7210();
            }
            int var52 = 0;
            if ((var50 & 0x2) != 0) {
                var52 = var6.method7210();
            }
            int var53 = 0;
            if ((var50 & 0x4) != 0) {
                var53 = var7.method7210();
            }
            this.field2271[var49] = var46 + var51;
            this.field2272[var49] = var47 + var52;
            this.field2273[var49] = var48 + var53;
            var46 = this.field2271[var49];
            var47 = this.field2272[var49];
            var48 = this.field2273[var49];
            if (var16 == 1) {
                this.field2290[var49] = var8.method7196();
            }
        }
        if (var17 == 1) {
            for (int var54 = 0; var54 < var9; var54++) {
                int var55 = var8.method7196();
                this.field2294[var54] = new int[var55];
                this.field2279[var54] = new int[var55];
                for (int var56 = 0; var56 < var55; var56++) {
                    this.field2294[var54][var56] = var8.method7196();
                    this.field2279[var54][var56] = var8.method7196();
                }
            }
        }
        var4.field4735 = var35;
        var5.field4735 = var30;
        var6.field4735 = var28;
        var7.field4735 = var33;
        var8.field4735 = var29;
        for (int var57 = 0; var57 < var10; var57++) {
            this.field2282[var57] = (short) var4.method7198();
            if (var12 == 1) {
                int var58 = var5.method7196();
                if ((var58 & 0x1) == 1) {
                    this.field2302[var57] = 1;
                    var2 = true;
                } else {
                    this.field2302[var57] = 0;
                }
                if ((var58 & 0x2) == 2) {
                    this.field2281[var57] = (byte) (var58 >> 2);
                    this.field2286[var57] = this.field2282[var57];
                    this.field2282[var57] = 127;
                    if (this.field2286[var57] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field2281[var57] = -1;
                    this.field2286[var57] = -1;
                }
            }
            if (var13 == 255) {
                this.field2278[var57] = var6.method7197();
            }
            if (var14 == 1) {
                this.field2280[var57] = var7.method7197();
            }
            if (var15 == 1) {
                this.field2292[var57] = var8.method7196();
            }
        }
        var4.field4735 = var32;
        var5.field4735 = var25;
        int var59 = 0;
        int var60 = 0;
        int var61 = 0;
        int var62 = 0;
        for (int var63 = 0; var63 < var10; var63++) {
            int var64 = var5.method7196();
            if (var64 == 1) {
                var59 = var4.method7210() + var62;
                var60 = var4.method7210() + var59;
                var61 = var4.method7210() + var60;
                var62 = var61;
                this.field2275[var63] = var59;
                this.field2283[var63] = var60;
                this.field2277[var63] = var61;
            }
            if (var64 == 2) {
                var60 = var61;
                var61 = var4.method7210() + var62;
                var62 = var61;
                this.field2275[var63] = var59;
                this.field2283[var63] = var60;
                this.field2277[var63] = var61;
            }
            if (var64 == 3) {
                var59 = var61;
                var61 = var4.method7210() + var62;
                var62 = var61;
                this.field2275[var63] = var59;
                this.field2283[var63] = var60;
                this.field2277[var63] = var61;
            }
            if (var64 == 4) {
                int var67 = var59;
                var59 = var60;
                var60 = var67;
                var61 = var4.method7210() + var62;
                var62 = var61;
                this.field2275[var63] = var59;
                this.field2283[var63] = var67;
                this.field2277[var63] = var61;
            }
        }
        var4.field4735 = var37;
        for (int var68 = 0; var68 < var11; var68++) {
            this.field2305[var68] = 0;
            this.field2287[var68] = (short) var4.method7198();
            this.field2288[var68] = (short) var4.method7198();
            this.field2311[var68] = (short) var4.method7198();
        }
        if (this.field2281 != null) {
            boolean var69 = false;
            for (int var70 = 0; var70 < var10; var70++) {
                int var71 = this.field2281[var70] & 0xFF;
                if (var71 != 255) {
                    if ((this.field2287[var71] & 0xFFFF) == this.field2275[var70] && (this.field2288[var71] & 0xFFFF) == this.field2283[var70] && (this.field2311[var71] & 0xFFFF) == this.field2277[var70]) {
                        this.field2281[var70] = -1;
                    } else {
                        var69 = true;
                    }
                }
            }
            if (!var69) {
                this.field2281 = null;
            }
        }
        if (!var3) {
            this.field2286 = null;
        }
        if (!var2) {
            this.field2302 = null;
        }
    }

    @ObfuscatedName("gu.s([B)V")
    public void method3673(byte[] arg0) {
        class445 var2 = new class445(arg0);
        class445 var3 = new class445(arg0);
        class445 var4 = new class445(arg0);
        class445 var5 = new class445(arg0);
        class445 var6 = new class445(arg0);
        class445 var7 = new class445(arg0);
        class445 var8 = new class445(arg0);
        var2.field4735 = arg0.length - 23;
        int var9 = var2.method7198();
        int var10 = var2.method7198();
        int var11 = var2.method7196();
        int var12 = var2.method7196();
        int var13 = var2.method7196();
        int var14 = var2.method7196();
        int var15 = var2.method7196();
        int var16 = var2.method7196();
        int var17 = var2.method7196();
        int var18 = var2.method7198();
        int var19 = var2.method7198();
        int var20 = var2.method7198();
        int var21 = var2.method7198();
        int var22 = var2.method7198();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field2305 = new byte[var11];
            var2.field4735 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field2305[var26] = var2.method7197();
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
        this.field2270 = var9;
        this.field2274 = var10;
        this.field2285 = var11;
        this.field2271 = new int[var9];
        this.field2272 = new int[var9];
        this.field2273 = new int[var9];
        this.field2275 = new int[var10];
        this.field2283 = new int[var10];
        this.field2277 = new int[var10];
        if (var17 == 1) {
            this.field2290 = new int[var9];
        }
        if (var12 == 1) {
            this.field2302 = new byte[var10];
        }
        if (var13 == 255) {
            this.field2278 = new byte[var10];
        } else {
            this.field2284 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2280 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2292 = new int[var10];
        }
        if (var16 == 1) {
            this.field2286 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field2281 = new byte[var10];
        }
        this.field2282 = new short[var10];
        if (var11 > 0) {
            this.field2287 = new short[var11];
            this.field2288 = new short[var11];
            this.field2311 = new short[var11];
        }
        var2.field4735 = var11;
        var3.field4735 = var44;
        var4.field4735 = var46;
        var5.field4735 = var48;
        var6.field4735 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method7196();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method7210();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method7210();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method7210();
            }
            this.field2271[var67] = var64 + var69;
            this.field2272[var67] = var65 + var70;
            this.field2273[var67] = var66 + var71;
            var64 = this.field2271[var67];
            var65 = this.field2272[var67];
            var66 = this.field2273[var67];
            if (var17 == 1) {
                this.field2290[var67] = var6.method7196();
            }
        }
        var2.field4735 = var42;
        var3.field4735 = var31;
        var4.field4735 = var34;
        var5.field4735 = var37;
        var6.field4735 = var35;
        var7.field4735 = var40;
        var8.field4735 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field2282[var72] = (short) var2.method7198();
            if (var12 == 1) {
                this.field2302[var72] = var3.method7197();
            }
            if (var13 == 255) {
                this.field2278[var72] = var4.method7197();
            }
            if (var14 == 1) {
                this.field2280[var72] = var5.method7197();
            }
            if (var15 == 1) {
                this.field2292[var72] = var6.method7196();
            }
            if (var16 == 1) {
                this.field2286[var72] = (short) (var7.method7198() - 1);
            }
            if (this.field2281 != null && this.field2286[var72] != -1) {
                this.field2281[var72] = (byte) (var8.method7196() - 1);
            }
        }
        var2.field4735 = var33;
        var3.field4735 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method7196();
            if (var78 == 1) {
                var73 = var2.method7210() + var76;
                var74 = var2.method7210() + var73;
                var75 = var2.method7210() + var74;
                var76 = var75;
                this.field2275[var77] = var73;
                this.field2283[var77] = var74;
                this.field2277[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method7210() + var76;
                var76 = var75;
                this.field2275[var77] = var73;
                this.field2283[var77] = var74;
                this.field2277[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method7210() + var76;
                var76 = var75;
                this.field2275[var77] = var73;
                this.field2283[var77] = var74;
                this.field2277[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method7210() + var76;
                var76 = var75;
                this.field2275[var77] = var73;
                this.field2283[var77] = var81;
                this.field2277[var77] = var75;
            }
        }
        var2.field4735 = var50;
        var3.field4735 = var52;
        var4.field4735 = var54;
        var5.field4735 = var56;
        var6.field4735 = var58;
        var7.field4735 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field2305[var82] & 0xFF;
            if (var83 == 0) {
                this.field2287[var82] = (short) var2.method7198();
                this.field2288[var82] = (short) var2.method7198();
                this.field2311[var82] = (short) var2.method7198();
            }
        }
        var2.field4735 = var62;
        int var84 = var2.method7196();
        if (var84 == 0) {
            return;
        }
        new class216();
        var2.method7198();
        var2.method7198();
        var2.method7198();
        var2.method7201();
    }

    @ObfuscatedName("gu.q([B)V")
    public void method3695(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class445 var4 = new class445(arg0);
        class445 var5 = new class445(arg0);
        class445 var6 = new class445(arg0);
        class445 var7 = new class445(arg0);
        class445 var8 = new class445(arg0);
        var4.field4735 = arg0.length - 18;
        int var9 = var4.method7198();
        int var10 = var4.method7198();
        int var11 = var4.method7196();
        int var12 = var4.method7196();
        int var13 = var4.method7196();
        int var14 = var4.method7196();
        int var15 = var4.method7196();
        int var16 = var4.method7196();
        int var17 = var4.method7198();
        int var18 = var4.method7198();
        int var19 = var4.method7198();
        int var20 = var4.method7198();
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
        this.field2270 = var9;
        this.field2274 = var10;
        this.field2285 = var11;
        this.field2271 = new int[var9];
        this.field2272 = new int[var9];
        this.field2273 = new int[var9];
        this.field2275 = new int[var10];
        this.field2283 = new int[var10];
        this.field2277 = new int[var10];
        if (var11 > 0) {
            this.field2305 = new byte[var11];
            this.field2287 = new short[var11];
            this.field2288 = new short[var11];
            this.field2311 = new short[var11];
        }
        if (var16 == 1) {
            this.field2290 = new int[var9];
        }
        if (var12 == 1) {
            this.field2302 = new byte[var10];
            this.field2281 = new byte[var10];
            this.field2286 = new short[var10];
        }
        if (var13 == 255) {
            this.field2278 = new byte[var10];
        } else {
            this.field2284 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2280 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2292 = new int[var10];
        }
        this.field2282 = new short[var10];
        var4.field4735 = var21;
        var5.field4735 = var36;
        var6.field4735 = var38;
        var7.field4735 = var40;
        var8.field4735 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method7196();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method7210();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method7210();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method7210();
            }
            this.field2271[var46] = var43 + var48;
            this.field2272[var46] = var44 + var49;
            this.field2273[var46] = var45 + var50;
            var43 = this.field2271[var46];
            var44 = this.field2272[var46];
            var45 = this.field2273[var46];
            if (var16 == 1) {
                this.field2290[var46] = var8.method7196();
            }
        }
        var4.field4735 = var32;
        var5.field4735 = var28;
        var6.field4735 = var26;
        var7.field4735 = var30;
        var8.field4735 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field2282[var51] = (short) var4.method7198();
            if (var12 == 1) {
                int var52 = var5.method7196();
                if ((var52 & 0x1) == 1) {
                    this.field2302[var51] = 1;
                    var2 = true;
                } else {
                    this.field2302[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field2281[var51] = (byte) (var52 >> 2);
                    this.field2286[var51] = this.field2282[var51];
                    this.field2282[var51] = 127;
                    if (this.field2286[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field2281[var51] = -1;
                    this.field2286[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field2278[var51] = var6.method7197();
            }
            if (var14 == 1) {
                this.field2280[var51] = var7.method7197();
            }
            if (var15 == 1) {
                this.field2292[var51] = var8.method7196();
            }
        }
        var4.field4735 = var25;
        var5.field4735 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method7196();
            if (var58 == 1) {
                var53 = var4.method7210() + var56;
                var54 = var4.method7210() + var53;
                var55 = var4.method7210() + var54;
                var56 = var55;
                this.field2275[var57] = var53;
                this.field2283[var57] = var54;
                this.field2277[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method7210() + var56;
                var56 = var55;
                this.field2275[var57] = var53;
                this.field2283[var57] = var54;
                this.field2277[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method7210() + var56;
                var56 = var55;
                this.field2275[var57] = var53;
                this.field2283[var57] = var54;
                this.field2277[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method7210() + var56;
                var56 = var55;
                this.field2275[var57] = var53;
                this.field2283[var57] = var61;
                this.field2277[var57] = var55;
            }
        }
        var4.field4735 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field2305[var62] = 0;
            this.field2287[var62] = (short) var4.method7198();
            this.field2288[var62] = (short) var4.method7198();
            this.field2311[var62] = (short) var4.method7198();
        }
        if (this.field2281 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field2281[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field2287[var65] & 0xFFFF) == this.field2275[var64] && (this.field2288[var65] & 0xFFFF) == this.field2283[var64] && (this.field2311[var65] & 0xFFFF) == this.field2277[var64]) {
                        this.field2281[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field2281 = null;
            }
        }
        if (!var3) {
            this.field2286 = null;
        }
        if (!var2) {
            this.field2302 = null;
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
        this.field2270 = 0;
        this.field2274 = 0;
        this.field2285 = 0;
        this.field2284 = -1;
        for (int var10 = 0; var10 < arg1; var10++) {
            class197 var11 = arg0[var10];
            if (var11 != null) {
                this.field2270 += var11.field2270;
                this.field2274 += var11.field2274;
                this.field2285 += var11.field2285;
                if (var11.field2278 == null) {
                    if (this.field2284 == -1) {
                        this.field2284 = var11.field2284;
                    }
                    if (this.field2284 != var11.field2284) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var11.field2302 != null;
                var5 |= var11.field2280 != null;
                var6 |= var11.field2292 != null;
                var7 |= var11.field2286 != null;
                var8 |= var11.field2281 != null;
                var9 |= var11.field2294 != null;
            }
        }
        this.field2271 = new int[this.field2270];
        this.field2272 = new int[this.field2270];
        this.field2273 = new int[this.field2270];
        this.field2290 = new int[this.field2270];
        this.field2275 = new int[this.field2274];
        this.field2283 = new int[this.field2274];
        this.field2277 = new int[this.field2274];
        if (var3) {
            this.field2302 = new byte[this.field2274];
        }
        if (var4) {
            this.field2278 = new byte[this.field2274];
        }
        if (var5) {
            this.field2280 = new byte[this.field2274];
        }
        if (var6) {
            this.field2292 = new int[this.field2274];
        }
        if (var7) {
            this.field2286 = new short[this.field2274];
        }
        if (var8) {
            this.field2281 = new byte[this.field2274];
        }
        if (var9) {
            this.field2294 = new int[this.field2270][];
            this.field2279 = new int[this.field2270][];
        }
        this.field2282 = new short[this.field2274];
        if (this.field2285 > 0) {
            this.field2305 = new byte[this.field2285];
            this.field2287 = new short[this.field2285];
            this.field2288 = new short[this.field2285];
            this.field2311 = new short[this.field2285];
        }
        this.field2270 = 0;
        this.field2274 = 0;
        this.field2285 = 0;
        for (int var12 = 0; var12 < arg1; var12++) {
            class197 var13 = arg0[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < var13.field2274; var14++) {
                    if (var3 && var13.field2302 != null) {
                        this.field2302[this.field2274] = var13.field2302[var14];
                    }
                    if (var4) {
                        if (var13.field2278 == null) {
                            this.field2278[this.field2274] = var13.field2284;
                        } else {
                            this.field2278[this.field2274] = var13.field2278[var14];
                        }
                    }
                    if (var5 && var13.field2280 != null) {
                        this.field2280[this.field2274] = var13.field2280[var14];
                    }
                    if (var6 && var13.field2292 != null) {
                        this.field2292[this.field2274] = var13.field2292[var14];
                    }
                    if (var7) {
                        if (var13.field2286 == null) {
                            this.field2286[this.field2274] = -1;
                        } else {
                            this.field2286[this.field2274] = var13.field2286[var14];
                        }
                    }
                    if (var8) {
                        if (var13.field2281 == null || var13.field2281[var14] == -1) {
                            this.field2281[this.field2274] = -1;
                        } else {
                            this.field2281[this.field2274] = (byte) (var13.field2281[var14] + this.field2285);
                        }
                    }
                    this.field2282[this.field2274] = var13.field2282[var14];
                    this.field2275[this.field2274] = this.method3675(var13, var13.field2275[var14]);
                    this.field2283[this.field2274] = this.method3675(var13, var13.field2283[var14]);
                    this.field2277[this.field2274] = this.method3675(var13, var13.field2277[var14]);
                    this.field2274++;
                }
                for (int var15 = 0; var15 < var13.field2285; var15++) {
                    byte var16 = this.field2305[this.field2285] = var13.field2305[var15];
                    if (var16 == 0) {
                        this.field2287[this.field2285] = (short) this.method3675(var13, var13.field2287[var15]);
                        this.field2288[this.field2285] = (short) this.method3675(var13, var13.field2288[var15]);
                        this.field2311[this.field2285] = (short) this.method3675(var13, var13.field2311[var15]);
                    }
                    this.field2285++;
                }
            }
        }
    }

    @ObfuscatedName("gu.m(Lgu;I)I")
    public final int method3675(class197 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field2271[arg1];
        int var5 = arg0.field2272[arg1];
        int var6 = arg0.field2273[arg1];
        for (int var7 = 0; var7 < this.field2270; var7++) {
            if (this.field2271[var7] == var4 && this.field2272[var7] == var5 && this.field2273[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field2271[this.field2270] = var4;
            this.field2272[this.field2270] = var5;
            this.field2273[this.field2270] = var6;
            if (arg0.field2290 != null) {
                this.field2290[this.field2270] = arg0.field2290[arg1];
            }
            if (arg0.field2294 != null) {
                this.field2294[this.field2270] = arg0.field2294[arg1];
                this.field2279[this.field2270] = arg0.field2279[arg1];
            }
            var3 = this.field2270++;
        }
        return var3;
    }

    public class197(class197 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field2270 = arg0.field2270;
        this.field2274 = arg0.field2274;
        this.field2285 = arg0.field2285;
        if (arg1) {
            this.field2271 = arg0.field2271;
            this.field2272 = arg0.field2272;
            this.field2273 = arg0.field2273;
        } else {
            this.field2271 = new int[this.field2270];
            this.field2272 = new int[this.field2270];
            this.field2273 = new int[this.field2270];
            for (int var6 = 0; var6 < this.field2270; var6++) {
                this.field2271[var6] = arg0.field2271[var6];
                this.field2272[var6] = arg0.field2272[var6];
                this.field2273[var6] = arg0.field2273[var6];
            }
        }
        if (arg2) {
            this.field2282 = arg0.field2282;
        } else {
            this.field2282 = new short[this.field2274];
            for (int var7 = 0; var7 < this.field2274; var7++) {
                this.field2282[var7] = arg0.field2282[var7];
            }
        }
        if (arg3 || arg0.field2286 == null) {
            this.field2286 = arg0.field2286;
        } else {
            this.field2286 = new short[this.field2274];
            for (int var8 = 0; var8 < this.field2274; var8++) {
                this.field2286[var8] = arg0.field2286[var8];
            }
        }
        if (arg4) {
            this.field2280 = arg0.field2280;
        } else {
            this.field2280 = new byte[this.field2274];
            if (arg0.field2280 == null) {
                for (int var9 = 0; var9 < this.field2274; var9++) {
                    this.field2280[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field2274; var10++) {
                    this.field2280[var10] = arg0.field2280[var10];
                }
            }
        }
        this.field2275 = arg0.field2275;
        this.field2283 = arg0.field2283;
        this.field2277 = arg0.field2277;
        this.field2302 = arg0.field2302;
        this.field2278 = arg0.field2278;
        this.field2281 = arg0.field2281;
        this.field2284 = arg0.field2284;
        this.field2305 = arg0.field2305;
        this.field2287 = arg0.field2287;
        this.field2288 = arg0.field2288;
        this.field2311 = arg0.field2311;
        this.field2290 = arg0.field2290;
        this.field2292 = arg0.field2292;
        this.field2276 = arg0.field2276;
        this.field2296 = arg0.field2296;
        this.field2297 = arg0.field2297;
        this.field2267 = arg0.field2267;
        this.field2298 = arg0.field2298;
        this.field2294 = arg0.field2294;
        this.field2279 = arg0.field2279;
        this.field2291 = arg0.field2291;
        this.field2300 = arg0.field2300;
    }

    @ObfuscatedName("gu.x()Lgu;")
    public class197 method3736() {
        class197 var1 = new class197();
        if (this.field2302 != null) {
            var1.field2302 = new byte[this.field2274];
            for (int var2 = 0; var2 < this.field2274; var2++) {
                var1.field2302[var2] = this.field2302[var2];
            }
        }
        var1.field2270 = this.field2270;
        var1.field2274 = this.field2274;
        var1.field2285 = this.field2285;
        var1.field2271 = this.field2271;
        var1.field2272 = this.field2272;
        var1.field2273 = this.field2273;
        var1.field2275 = this.field2275;
        var1.field2283 = this.field2283;
        var1.field2277 = this.field2277;
        var1.field2278 = this.field2278;
        var1.field2280 = this.field2280;
        var1.field2281 = this.field2281;
        var1.field2282 = this.field2282;
        var1.field2286 = this.field2286;
        var1.field2284 = this.field2284;
        var1.field2305 = this.field2305;
        var1.field2287 = this.field2287;
        var1.field2288 = this.field2288;
        var1.field2311 = this.field2311;
        var1.field2290 = this.field2290;
        var1.field2292 = this.field2292;
        var1.field2276 = this.field2276;
        var1.field2296 = this.field2296;
        var1.field2297 = this.field2297;
        var1.field2267 = this.field2267;
        var1.field2291 = this.field2291;
        var1.field2300 = this.field2300;
        return var1;
    }

    @ObfuscatedName("gu.j([[IIIIZI)Lgu;")
    public class197 method3689(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method3688();
        int var7 = this.field2303 + arg1;
        int var8 = this.field2304 + arg1;
        int var9 = this.field2293 + arg3;
        int var10 = this.field2301 + arg3;
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
            var15.field2270 = this.field2270;
            var15.field2274 = this.field2274;
            var15.field2285 = this.field2285;
            var15.field2271 = this.field2271;
            var15.field2273 = this.field2273;
            var15.field2275 = this.field2275;
            var15.field2283 = this.field2283;
            var15.field2277 = this.field2277;
            var15.field2302 = this.field2302;
            var15.field2278 = this.field2278;
            var15.field2280 = this.field2280;
            var15.field2281 = this.field2281;
            var15.field2282 = this.field2282;
            var15.field2286 = this.field2286;
            var15.field2284 = this.field2284;
            var15.field2305 = this.field2305;
            var15.field2287 = this.field2287;
            var15.field2288 = this.field2288;
            var15.field2311 = this.field2311;
            var15.field2290 = this.field2290;
            var15.field2292 = this.field2292;
            var15.field2276 = this.field2276;
            var15.field2296 = this.field2296;
            var15.field2291 = this.field2291;
            var15.field2300 = this.field2300;
            var15.field2272 = new int[var15.field2270];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field2270; var16++) {
                int var17 = this.field2271[var16] + arg1;
                int var18 = this.field2273[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field2272[var16] = this.field2272[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field2270; var26++) {
                int var27 = (-this.field2272[var26] << 16) / this.field2479;
                if (var27 < arg5) {
                    int var28 = this.field2271[var26] + arg1;
                    int var29 = this.field2273[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field2272[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field2272[var26];
                }
            }
        }
        var15.method3727();
        return var15;
    }

    @ObfuscatedName("gu.v()V")
    public void method3677() {
        int var10002;
        if (this.field2290 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field2270; var3++) {
                int var4 = this.field2290[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field2276 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field2276[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field2270) {
                int var7 = this.field2290[var6];
                this.field2276[var7][var1[var7]++] = var6++;
            }
            this.field2290 = null;
        }
        if (this.field2292 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field2274; var10++) {
            int var11 = this.field2292[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field2296 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field2296[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field2274) {
            int var14 = this.field2292[var13];
            this.field2296[var14][var8[var14]++] = var13++;
        }
        this.field2292 = null;
    }

    @ObfuscatedName("gu.h()V")
    public void method3684() {
        for (int var1 = 0; var1 < this.field2270; var1++) {
            int var2 = this.field2271[var1];
            this.field2271[var1] = this.field2273[var1];
            this.field2273[var1] = -var2;
        }
        this.method3727();
    }

    @ObfuscatedName("gu.t()V")
    public void method3679() {
        for (int var1 = 0; var1 < this.field2270; var1++) {
            this.field2271[var1] = -this.field2271[var1];
            this.field2273[var1] = -this.field2273[var1];
        }
        this.method3727();
    }

    @ObfuscatedName("gu.u()V")
    public void method3680() {
        for (int var1 = 0; var1 < this.field2270; var1++) {
            int var2 = this.field2273[var1];
            this.field2273[var1] = this.field2271[var1];
            this.field2271[var1] = -var2;
        }
        this.method3727();
    }

    @ObfuscatedName("gu.d(I)V")
    public void method3681(int arg0) {
        int var2 = field2310[arg0];
        int var3 = field2306[arg0];
        for (int var4 = 0; var4 < this.field2270; var4++) {
            int var5 = this.field2273[var4] * var2 + this.field2271[var4] * var3 >> 16;
            this.field2273[var4] = this.field2273[var4] * var3 - this.field2271[var4] * var2 >> 16;
            this.field2271[var4] = var5;
        }
        this.method3727();
    }

    @ObfuscatedName("gu.b(III)V")
    public void method3682(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2270; var4++) {
            this.field2271[var4] += arg0;
            this.field2272[var4] += arg1;
            this.field2273[var4] += arg2;
        }
        this.method3727();
    }

    @ObfuscatedName("gu.a(SS)V")
    public void method3683(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2274; var3++) {
            if (this.field2282[var3] == arg0) {
                this.field2282[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("gu.l(SS)V")
    public void method3722(short arg0, short arg1) {
        if (this.field2286 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field2274; var3++) {
            if (this.field2286[var3] == arg0) {
                this.field2286[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("gu.e()V")
    public void method3747() {
        for (int var1 = 0; var1 < this.field2270; var1++) {
            this.field2273[var1] = -this.field2273[var1];
        }
        for (int var2 = 0; var2 < this.field2274; var2++) {
            int var3 = this.field2275[var2];
            this.field2275[var2] = this.field2277[var2];
            this.field2277[var2] = var3;
        }
        this.method3727();
    }

    @ObfuscatedName("gu.g(III)V")
    public void method3686(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2270; var4++) {
            this.field2271[var4] = this.field2271[var4] * arg0 / 128;
            this.field2272[var4] = this.field2272[var4] * arg1 / 128;
            this.field2273[var4] = this.field2273[var4] * arg2 / 128;
        }
        this.method3727();
    }

    @ObfuscatedName("gu.y()V")
    public void method3687() {
        if (this.field2297 != null) {
            return;
        }
        this.field2297 = new class214[this.field2270];
        for (int var1 = 0; var1 < this.field2270; var1++) {
            this.field2297[var1] = new class214();
        }
        for (int var2 = 0; var2 < this.field2274; var2++) {
            int var3 = this.field2275[var2];
            int var4 = this.field2283[var2];
            int var5 = this.field2277[var2];
            int var6 = this.field2271[var4] - this.field2271[var3];
            int var7 = this.field2272[var4] - this.field2272[var3];
            int var8 = this.field2273[var4] - this.field2273[var3];
            int var9 = this.field2271[var5] - this.field2271[var3];
            int var10 = this.field2272[var5] - this.field2272[var3];
            int var11 = this.field2273[var5] - this.field2273[var3];
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
            if (this.field2302 == null) {
                var19 = 0;
            } else {
                var19 = this.field2302[var2];
            }
            if (var19 == 0) {
                class214 var20 = this.field2297[var3];
                var20.field2633 += var16;
                var20.field2632 += var17;
                var20.field2634 += var18;
                var20.field2635++;
                class214 var21 = this.field2297[var4];
                var21.field2633 += var16;
                var21.field2632 += var17;
                var21.field2634 += var18;
                var21.field2635++;
                class214 var22 = this.field2297[var5];
                var22.field2633 += var16;
                var22.field2632 += var17;
                var22.field2634 += var18;
                var22.field2635++;
            } else if (var19 == 1) {
                if (this.field2267 == null) {
                    this.field2267 = new class207[this.field2274];
                }
                class207 var23 = this.field2267[var2] = new class207();
                var23.field2481 = var16;
                var23.field2483 = var17;
                var23.field2482 = var18;
            }
        }
    }

    @ObfuscatedName("gu.i()V")
    public void method3727() {
        this.field2297 = null;
        this.field2298 = null;
        this.field2267 = null;
        this.field2299 = false;
    }

    @ObfuscatedName("gu.r()V")
    public void method3688() {
        if (this.field2299) {
            return;
        }
        this.field2479 = 0;
        this.field2295 = 0;
        this.field2303 = 999999;
        this.field2304 = -999999;
        this.field2301 = -99999;
        this.field2293 = 99999;
        for (int var1 = 0; var1 < this.field2270; var1++) {
            int var2 = this.field2271[var1];
            int var3 = this.field2272[var1];
            int var4 = this.field2273[var1];
            if (var2 < this.field2303) {
                this.field2303 = var2;
            }
            if (var2 > this.field2304) {
                this.field2304 = var2;
            }
            if (var4 < this.field2293) {
                this.field2293 = var4;
            }
            if (var4 > this.field2301) {
                this.field2301 = var4;
            }
            if (-var3 > this.field2479) {
                this.field2479 = -var3;
            }
            if (var3 > this.field2295) {
                this.field2295 = var3;
            }
        }
        this.field2299 = true;
    }

    @ObfuscatedName("gu.z(Lgu;Lgu;IIIZ)V")
    public static void method3713(class197 arg0, class197 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method3688();
        arg0.method3687();
        arg1.method3688();
        arg1.method3687();
        field2309++;
        int var6 = 0;
        int[] var7 = arg1.field2271;
        int var8 = arg1.field2270;
        for (int var9 = 0; var9 < arg0.field2270; var9++) {
            class214 var10 = arg0.field2297[var9];
            if (var10.field2635 != 0) {
                int var11 = arg0.field2272[var9] - arg3;
                if (var11 <= arg1.field2295) {
                    int var12 = arg0.field2271[var9] - arg2;
                    if (var12 >= arg1.field2303 && var12 <= arg1.field2304) {
                        int var13 = arg0.field2273[var9] - arg4;
                        if (var13 >= arg1.field2293 && var13 <= arg1.field2301) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class214 var15 = arg1.field2297[var14];
                                if (var7[var14] == var12 && arg1.field2273[var14] == var13 && arg1.field2272[var14] == var11 && var15.field2635 != 0) {
                                    if (arg0.field2298 == null) {
                                        arg0.field2298 = new class214[arg0.field2270];
                                    }
                                    if (arg1.field2298 == null) {
                                        arg1.field2298 = new class214[var8];
                                    }
                                    class214 var16 = arg0.field2298[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field2298[var9] = new class214(var10);
                                    }
                                    class214 var17 = arg1.field2298[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field2298[var14] = new class214(var15);
                                    }
                                    var16.field2633 += var15.field2633;
                                    var16.field2632 += var15.field2632;
                                    var16.field2634 += var15.field2634;
                                    var16.field2635 += var15.field2635;
                                    var17.field2633 += var10.field2633;
                                    var17.field2632 += var10.field2632;
                                    var17.field2634 += var10.field2634;
                                    var17.field2635 += var10.field2635;
                                    var6++;
                                    field2307[var9] = field2309;
                                    field2308[var14] = field2309;
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
        for (int var18 = 0; var18 < arg0.field2274; var18++) {
            if (field2307[arg0.field2275[var18]] == field2309 && field2307[arg0.field2283[var18]] == field2309 && field2307[arg0.field2277[var18]] == field2309) {
                if (arg0.field2302 == null) {
                    arg0.field2302 = new byte[arg0.field2274];
                }
                arg0.field2302[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field2274; var19++) {
            if (field2308[arg1.field2275[var19]] == field2309 && field2308[arg1.field2283[var19]] == field2309 && field2308[arg1.field2277[var19]] == field2309) {
                if (arg1.field2302 == null) {
                    arg1.field2302 = new byte[arg1.field2274];
                }
                arg1.field2302[var19] = 2;
            }
        }
    }

    @ObfuscatedName("gu.o(IIIII)Lha;")
    public final class212 method3690(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method3687();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class212 var8 = new class212();
        var8.field2610 = new int[this.field2274];
        var8.field2597 = new int[this.field2274];
        var8.field2557 = new int[this.field2274];
        if (this.field2285 > 0 && this.field2281 != null) {
            int[] var9 = new int[this.field2285];
            for (int var10 = 0; var10 < this.field2274; var10++) {
                if (this.field2281[var10] != -1) {
                    var9[this.field2281[var10] & 0xFF]++;
                }
            }
            var8.field2563 = 0;
            for (int var11 = 0; var11 < this.field2285; var11++) {
                if (var9[var11] > 0 && this.field2305[var11] == 0) {
                    var8.field2563++;
                }
            }
            var8.field2542 = new int[var8.field2563];
            var8.field2596 = new int[var8.field2563];
            var8.field2566 = new int[var8.field2563];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field2285; var13++) {
                if (var9[var13] > 0 && this.field2305[var13] == 0) {
                    var8.field2542[var12] = this.field2287[var13] & 0xFFFF;
                    var8.field2596[var12] = this.field2288[var13] & 0xFFFF;
                    var8.field2566[var12] = this.field2311[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field2560 = new byte[this.field2274];
            for (int var14 = 0; var14 < this.field2274; var14++) {
                if (this.field2281[var14] == -1) {
                    var8.field2560[var14] = -1;
                } else {
                    var8.field2560[var14] = (byte) var9[this.field2281[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field2274; var15++) {
            byte var16;
            if (this.field2302 == null) {
                var16 = 0;
            } else {
                var16 = this.field2302[var15];
            }
            byte var17;
            if (this.field2280 == null) {
                var17 = 0;
            } else {
                var17 = this.field2280[var15];
            }
            short var18;
            if (this.field2286 == null) {
                var18 = -1;
            } else {
                var18 = this.field2286[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field2282[var15] & 0xFFFF;
                    class214 var20;
                    if (this.field2298 == null || this.field2298[this.field2275[var15]] == null) {
                        var20 = this.field2297[this.field2275[var15]];
                    } else {
                        var20 = this.field2298[this.field2275[var15]];
                    }
                    int var21 = (var20.field2634 * arg4 + var20.field2633 * arg2 + var20.field2632 * arg3) / (var20.field2635 * var7) + arg0;
                    var8.field2610[var15] = method3717(var19, var21);
                    class214 var22;
                    if (this.field2298 == null || this.field2298[this.field2283[var15]] == null) {
                        var22 = this.field2297[this.field2283[var15]];
                    } else {
                        var22 = this.field2298[this.field2283[var15]];
                    }
                    int var23 = (var22.field2634 * arg4 + var22.field2633 * arg2 + var22.field2632 * arg3) / (var22.field2635 * var7) + arg0;
                    var8.field2597[var15] = method3717(var19, var23);
                    class214 var24;
                    if (this.field2298 == null || this.field2298[this.field2277[var15]] == null) {
                        var24 = this.field2297[this.field2277[var15]];
                    } else {
                        var24 = this.field2298[this.field2277[var15]];
                    }
                    int var25 = (var24.field2634 * arg4 + var24.field2633 * arg2 + var24.field2632 * arg3) / (var24.field2635 * var7) + arg0;
                    var8.field2557[var15] = method3717(var19, var25);
                } else if (var16 == 1) {
                    class207 var26 = this.field2267[var15];
                    int var27 = (var26.field2482 * arg4 + var26.field2483 * arg3 + var26.field2481 * arg2) / (var7 / 2 + var7) + arg0;
                    var8.field2610[var15] = method3717(this.field2282[var15] & 0xFFFF, var27);
                    var8.field2557[var15] = -1;
                } else if (var16 == 3) {
                    var8.field2610[var15] = 128;
                    var8.field2557[var15] = -1;
                } else {
                    var8.field2557[var15] = -2;
                }
            } else if (var16 == 0) {
                class214 var28;
                if (this.field2298 == null || this.field2298[this.field2275[var15]] == null) {
                    var28 = this.field2297[this.field2275[var15]];
                } else {
                    var28 = this.field2298[this.field2275[var15]];
                }
                int var29 = (var28.field2634 * arg4 + var28.field2633 * arg2 + var28.field2632 * arg3) / (var28.field2635 * var7) + arg0;
                var8.field2610[var15] = method3692(var29);
                class214 var30;
                if (this.field2298 == null || this.field2298[this.field2283[var15]] == null) {
                    var30 = this.field2297[this.field2283[var15]];
                } else {
                    var30 = this.field2298[this.field2283[var15]];
                }
                int var31 = (var30.field2634 * arg4 + var30.field2633 * arg2 + var30.field2632 * arg3) / (var30.field2635 * var7) + arg0;
                var8.field2597[var15] = method3692(var31);
                class214 var32;
                if (this.field2298 == null || this.field2298[this.field2277[var15]] == null) {
                    var32 = this.field2297[this.field2277[var15]];
                } else {
                    var32 = this.field2298[this.field2277[var15]];
                }
                int var33 = (var32.field2634 * arg4 + var32.field2633 * arg2 + var32.field2632 * arg3) / (var32.field2635 * var7) + arg0;
                var8.field2557[var15] = method3692(var33);
            } else if (var16 == 1) {
                class207 var34 = this.field2267[var15];
                int var35 = (var34.field2482 * arg4 + var34.field2483 * arg3 + var34.field2481 * arg2) / (var7 / 2 + var7) + arg0;
                var8.field2610[var15] = method3692(var35);
                var8.field2557[var15] = -1;
            } else {
                var8.field2557[var15] = -2;
            }
        }
        this.method3677();
        var8.field2547 = this.field2270;
        var8.field2548 = this.field2271;
        var8.field2601 = this.field2272;
        var8.field2595 = this.field2273;
        var8.field2551 = this.field2274;
        var8.field2552 = this.field2275;
        var8.field2553 = this.field2283;
        var8.field2554 = this.field2277;
        var8.field2558 = this.field2278;
        var8.field2559 = this.field2280;
        var8.field2541 = this.field2284;
        var8.field2605 = this.field2276;
        var8.field2568 = this.field2296;
        var8.field2580 = this.field2286;
        var8.field2569 = this.field2294;
        var8.field2570 = this.field2279;
        return var8;
    }

    @ObfuscatedName("gu.as(II)I")
    public static final int method3717(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("gu.ac(I)I")
    public static final int method3692(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
