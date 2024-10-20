package deob;

@ObfuscatedName("gl")
public class class206 extends class214 {

    @ObfuscatedName("gl.n")
    public int field2259 = 0;

    @ObfuscatedName("gl.c")
    public int[] field2233;

    @ObfuscatedName("gl.m")
    public int[] field2266;

    @ObfuscatedName("gl.k")
    public int[] field2235;

    @ObfuscatedName("gl.o")
    public int field2236 = 0;

    @ObfuscatedName("gl.g")
    public int[] field2237;

    @ObfuscatedName("gl.z")
    public int[] field2252;

    @ObfuscatedName("gl.a")
    public int[] field2265;

    @ObfuscatedName("gl.u")
    public byte[] field2264;

    @ObfuscatedName("gl.e")
    public byte[] field2241;

    @ObfuscatedName("gl.l")
    public byte[] field2232;

    @ObfuscatedName("gl.y")
    public byte[] field2240;

    @ObfuscatedName("gl.v")
    public short[] field2239;

    @ObfuscatedName("gl.f")
    public short[] field2245;

    @ObfuscatedName("gl.s")
    public byte field2262 = 0;

    @ObfuscatedName("gl.h")
    public int field2247;

    @ObfuscatedName("gl.d")
    public byte[] field2248;

    @ObfuscatedName("gl.q")
    public short[] field2249;

    @ObfuscatedName("gl.j")
    public short[] field2250;

    @ObfuscatedName("gl.x")
    public short[] field2251;

    @ObfuscatedName("gl.b")
    public int[] field2238;

    @ObfuscatedName("gl.t")
    public int[] field2253;

    @ObfuscatedName("gl.r")
    public int[][] field2243;

    @ObfuscatedName("gl.p")
    public int[][] field2255;

    @ObfuscatedName("gl.w")
    public class215[] field2256;

    @ObfuscatedName("gl.i")
    public class222[] field2257;

    @ObfuscatedName("gl.aq")
    public class222[] field2258;

    @ObfuscatedName("gl.ad")
    public short field2269;

    @ObfuscatedName("gl.al")
    public short field2260;

    @ObfuscatedName("gl.aa")
    public boolean field2261 = false;

    @ObfuscatedName("gl.aw")
    public int field2246;

    @ObfuscatedName("gl.at")
    public int field2263;

    @ObfuscatedName("gl.as")
    public int field2242;

    @ObfuscatedName("gl.ae")
    public int field2254;

    @ObfuscatedName("gl.av")
    public int field2234;

    @ObfuscatedName("gl.ak")
    public static int[] field2267 = new int[10000];

    @ObfuscatedName("gl.an")
    public static int[] field2268 = new int[10000];

    @ObfuscatedName("gl.ab")
    public static int field2244 = 0;

    @ObfuscatedName("gl.au")
    public static int[] field2270 = class211.field2346;

    @ObfuscatedName("gl.am")
    public static int[] field2271 = class211.field2357;

    public class206() {
    }

    @ObfuscatedName("gl.n(Lkk;II)Lgl;")
    public static class206 method3631(class290 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method4710(arg1, arg2);
        return var3 == null ? null : new class206(var3);
    }

    public class206(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method3606(arg0);
        } else {
            this.method3607(arg0);
        }
    }

    @ObfuscatedName("gl.m([B)V")
    public void method3606(byte[] arg0) {
        class400 var2 = new class400(arg0);
        class400 var3 = new class400(arg0);
        class400 var4 = new class400(arg0);
        class400 var5 = new class400(arg0);
        class400 var6 = new class400(arg0);
        class400 var7 = new class400(arg0);
        class400 var8 = new class400(arg0);
        var2.field4272 = arg0.length - 23;
        int var9 = var2.method6219();
        int var10 = var2.method6219();
        int var11 = var2.method6217();
        int var12 = var2.method6217();
        int var13 = var2.method6217();
        int var14 = var2.method6217();
        int var15 = var2.method6217();
        int var16 = var2.method6217();
        int var17 = var2.method6217();
        int var18 = var2.method6219();
        int var19 = var2.method6219();
        int var20 = var2.method6219();
        int var21 = var2.method6219();
        int var22 = var2.method6219();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field2248 = new byte[var11];
            var2.field4272 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field2248[var26] = var2.method6218();
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
        this.field2259 = var9;
        this.field2236 = var10;
        this.field2247 = var11;
        this.field2233 = new int[var9];
        this.field2266 = new int[var9];
        this.field2235 = new int[var9];
        this.field2237 = new int[var10];
        this.field2252 = new int[var10];
        this.field2265 = new int[var10];
        if (var17 == 1) {
            this.field2238 = new int[var9];
        }
        if (var12 == 1) {
            this.field2264 = new byte[var10];
        }
        if (var13 == 255) {
            this.field2241 = new byte[var10];
        } else {
            this.field2262 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2232 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2253 = new int[var10];
        }
        if (var16 == 1) {
            this.field2245 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field2240 = new byte[var10];
        }
        this.field2239 = new short[var10];
        if (var11 > 0) {
            this.field2249 = new short[var11];
            this.field2250 = new short[var11];
            this.field2251 = new short[var11];
        }
        var2.field4272 = var11;
        var3.field4272 = var44;
        var4.field4272 = var46;
        var5.field4272 = var48;
        var6.field4272 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method6217();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method6230();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method6230();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method6230();
            }
            this.field2233[var67] = var64 + var69;
            this.field2266[var67] = var65 + var70;
            this.field2235[var67] = var66 + var71;
            var64 = this.field2233[var67];
            var65 = this.field2266[var67];
            var66 = this.field2235[var67];
            if (var17 == 1) {
                this.field2238[var67] = var6.method6217();
            }
        }
        var2.field4272 = var42;
        var3.field4272 = var31;
        var4.field4272 = var34;
        var5.field4272 = var37;
        var6.field4272 = var35;
        var7.field4272 = var40;
        var8.field4272 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field2239[var72] = (short) var2.method6219();
            if (var12 == 1) {
                this.field2264[var72] = var3.method6218();
            }
            if (var13 == 255) {
                this.field2241[var72] = var4.method6218();
            }
            if (var14 == 1) {
                this.field2232[var72] = var5.method6218();
            }
            if (var15 == 1) {
                this.field2253[var72] = var6.method6217();
            }
            if (var16 == 1) {
                this.field2245[var72] = (short) (var7.method6219() - 1);
            }
            if (this.field2240 != null && this.field2245[var72] != -1) {
                this.field2240[var72] = (byte) (var8.method6217() - 1);
            }
        }
        var2.field4272 = var33;
        var3.field4272 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method6217();
            if (var78 == 1) {
                var73 = var2.method6230() + var76;
                var74 = var2.method6230() + var73;
                var75 = var2.method6230() + var74;
                var76 = var75;
                this.field2237[var77] = var73;
                this.field2252[var77] = var74;
                this.field2265[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method6230() + var76;
                var76 = var75;
                this.field2237[var77] = var73;
                this.field2252[var77] = var74;
                this.field2265[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method6230() + var76;
                var76 = var75;
                this.field2237[var77] = var73;
                this.field2252[var77] = var74;
                this.field2265[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method6230() + var76;
                var76 = var75;
                this.field2237[var77] = var73;
                this.field2252[var77] = var81;
                this.field2265[var77] = var75;
            }
        }
        var2.field4272 = var50;
        var3.field4272 = var52;
        var4.field4272 = var54;
        var5.field4272 = var56;
        var6.field4272 = var58;
        var7.field4272 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field2248[var82] & 0xFF;
            if (var83 == 0) {
                this.field2249[var82] = (short) var2.method6219();
                this.field2250[var82] = (short) var2.method6219();
                this.field2251[var82] = (short) var2.method6219();
            }
        }
        var2.field4272 = var62;
        int var84 = var2.method6217();
        if (var84 == 0) {
            return;
        }
        new class224();
        var2.method6219();
        var2.method6219();
        var2.method6219();
        var2.method6222();
    }

    @ObfuscatedName("gl.k([B)V")
    public void method3607(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class400 var4 = new class400(arg0);
        class400 var5 = new class400(arg0);
        class400 var6 = new class400(arg0);
        class400 var7 = new class400(arg0);
        class400 var8 = new class400(arg0);
        var4.field4272 = arg0.length - 18;
        int var9 = var4.method6219();
        int var10 = var4.method6219();
        int var11 = var4.method6217();
        int var12 = var4.method6217();
        int var13 = var4.method6217();
        int var14 = var4.method6217();
        int var15 = var4.method6217();
        int var16 = var4.method6217();
        int var17 = var4.method6219();
        int var18 = var4.method6219();
        int var19 = var4.method6219();
        int var20 = var4.method6219();
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
        this.field2259 = var9;
        this.field2236 = var10;
        this.field2247 = var11;
        this.field2233 = new int[var9];
        this.field2266 = new int[var9];
        this.field2235 = new int[var9];
        this.field2237 = new int[var10];
        this.field2252 = new int[var10];
        this.field2265 = new int[var10];
        if (var11 > 0) {
            this.field2248 = new byte[var11];
            this.field2249 = new short[var11];
            this.field2250 = new short[var11];
            this.field2251 = new short[var11];
        }
        if (var16 == 1) {
            this.field2238 = new int[var9];
        }
        if (var12 == 1) {
            this.field2264 = new byte[var10];
            this.field2240 = new byte[var10];
            this.field2245 = new short[var10];
        }
        if (var13 == 255) {
            this.field2241 = new byte[var10];
        } else {
            this.field2262 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2232 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2253 = new int[var10];
        }
        this.field2239 = new short[var10];
        var4.field4272 = var21;
        var5.field4272 = var36;
        var6.field4272 = var38;
        var7.field4272 = var40;
        var8.field4272 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method6217();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method6230();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method6230();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method6230();
            }
            this.field2233[var46] = var43 + var48;
            this.field2266[var46] = var44 + var49;
            this.field2235[var46] = var45 + var50;
            var43 = this.field2233[var46];
            var44 = this.field2266[var46];
            var45 = this.field2235[var46];
            if (var16 == 1) {
                this.field2238[var46] = var8.method6217();
            }
        }
        var4.field4272 = var32;
        var5.field4272 = var28;
        var6.field4272 = var26;
        var7.field4272 = var30;
        var8.field4272 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field2239[var51] = (short) var4.method6219();
            if (var12 == 1) {
                int var52 = var5.method6217();
                if ((var52 & 0x1) == 1) {
                    this.field2264[var51] = 1;
                    var2 = true;
                } else {
                    this.field2264[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field2240[var51] = (byte) (var52 >> 2);
                    this.field2245[var51] = this.field2239[var51];
                    this.field2239[var51] = 127;
                    if (this.field2245[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field2240[var51] = -1;
                    this.field2245[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field2241[var51] = var6.method6218();
            }
            if (var14 == 1) {
                this.field2232[var51] = var7.method6218();
            }
            if (var15 == 1) {
                this.field2253[var51] = var8.method6217();
            }
        }
        var4.field4272 = var25;
        var5.field4272 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method6217();
            if (var58 == 1) {
                var53 = var4.method6230() + var56;
                var54 = var4.method6230() + var53;
                var55 = var4.method6230() + var54;
                var56 = var55;
                this.field2237[var57] = var53;
                this.field2252[var57] = var54;
                this.field2265[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method6230() + var56;
                var56 = var55;
                this.field2237[var57] = var53;
                this.field2252[var57] = var54;
                this.field2265[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method6230() + var56;
                var56 = var55;
                this.field2237[var57] = var53;
                this.field2252[var57] = var54;
                this.field2265[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method6230() + var56;
                var56 = var55;
                this.field2237[var57] = var53;
                this.field2252[var57] = var61;
                this.field2265[var57] = var55;
            }
        }
        var4.field4272 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field2248[var62] = 0;
            this.field2249[var62] = (short) var4.method6219();
            this.field2250[var62] = (short) var4.method6219();
            this.field2251[var62] = (short) var4.method6219();
        }
        if (this.field2240 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field2240[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field2249[var65] & 0xFFFF) == this.field2237[var64] && (this.field2250[var65] & 0xFFFF) == this.field2252[var64] && (this.field2251[var65] & 0xFFFF) == this.field2265[var64]) {
                        this.field2240[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field2240 = null;
            }
        }
        if (!var3) {
            this.field2245 = null;
        }
        if (!var2) {
            this.field2264 = null;
        }
    }

    public class206(class206[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field2259 = 0;
        this.field2236 = 0;
        this.field2247 = 0;
        this.field2262 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class206 var10 = arg0[var9];
            if (var10 != null) {
                this.field2259 += var10.field2259;
                this.field2236 += var10.field2236;
                this.field2247 += var10.field2247;
                if (var10.field2241 == null) {
                    if (this.field2262 == -1) {
                        this.field2262 = var10.field2262;
                    }
                    if (this.field2262 != var10.field2262) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field2264 != null;
                var5 |= var10.field2232 != null;
                var6 |= var10.field2253 != null;
                var7 |= var10.field2245 != null;
                var8 |= var10.field2240 != null;
            }
        }
        this.field2233 = new int[this.field2259];
        this.field2266 = new int[this.field2259];
        this.field2235 = new int[this.field2259];
        this.field2238 = new int[this.field2259];
        this.field2237 = new int[this.field2236];
        this.field2252 = new int[this.field2236];
        this.field2265 = new int[this.field2236];
        if (var3) {
            this.field2264 = new byte[this.field2236];
        }
        if (var4) {
            this.field2241 = new byte[this.field2236];
        }
        if (var5) {
            this.field2232 = new byte[this.field2236];
        }
        if (var6) {
            this.field2253 = new int[this.field2236];
        }
        if (var7) {
            this.field2245 = new short[this.field2236];
        }
        if (var8) {
            this.field2240 = new byte[this.field2236];
        }
        this.field2239 = new short[this.field2236];
        if (this.field2247 > 0) {
            this.field2248 = new byte[this.field2247];
            this.field2249 = new short[this.field2247];
            this.field2250 = new short[this.field2247];
            this.field2251 = new short[this.field2247];
        }
        this.field2259 = 0;
        this.field2236 = 0;
        this.field2247 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class206 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field2236; var13++) {
                    if (var3 && var12.field2264 != null) {
                        this.field2264[this.field2236] = var12.field2264[var13];
                    }
                    if (var4) {
                        if (var12.field2241 == null) {
                            this.field2241[this.field2236] = var12.field2262;
                        } else {
                            this.field2241[this.field2236] = var12.field2241[var13];
                        }
                    }
                    if (var5 && var12.field2232 != null) {
                        this.field2232[this.field2236] = var12.field2232[var13];
                    }
                    if (var6 && var12.field2253 != null) {
                        this.field2253[this.field2236] = var12.field2253[var13];
                    }
                    if (var7) {
                        if (var12.field2245 == null) {
                            this.field2245[this.field2236] = -1;
                        } else {
                            this.field2245[this.field2236] = var12.field2245[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field2240 == null || var12.field2240[var13] == -1) {
                            this.field2240[this.field2236] = -1;
                        } else {
                            this.field2240[this.field2236] = (byte) (var12.field2240[var13] + this.field2247);
                        }
                    }
                    this.field2239[this.field2236] = var12.field2239[var13];
                    this.field2237[this.field2236] = this.method3647(var12, var12.field2237[var13]);
                    this.field2252[this.field2236] = this.method3647(var12, var12.field2252[var13]);
                    this.field2265[this.field2236] = this.method3647(var12, var12.field2265[var13]);
                    this.field2236++;
                }
                for (int var14 = 0; var14 < var12.field2247; var14++) {
                    byte var15 = this.field2248[this.field2247] = var12.field2248[var14];
                    if (var15 == 0) {
                        this.field2249[this.field2247] = (short) this.method3647(var12, var12.field2249[var14]);
                        this.field2250[this.field2247] = (short) this.method3647(var12, var12.field2250[var14]);
                        this.field2251[this.field2247] = (short) this.method3647(var12, var12.field2251[var14]);
                    }
                    this.field2247++;
                }
            }
        }
    }

    @ObfuscatedName("gl.z(Lgl;I)I")
    public final int method3647(class206 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field2233[arg1];
        int var5 = arg0.field2266[arg1];
        int var6 = arg0.field2235[arg1];
        for (int var7 = 0; var7 < this.field2259; var7++) {
            if (this.field2233[var7] == var4 && this.field2266[var7] == var5 && this.field2235[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field2233[this.field2259] = var4;
            this.field2266[this.field2259] = var5;
            this.field2235[this.field2259] = var6;
            if (arg0.field2238 != null) {
                this.field2238[this.field2259] = arg0.field2238[arg1];
            }
            var3 = this.field2259++;
        }
        return var3;
    }

    public class206(class206 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field2259 = arg0.field2259;
        this.field2236 = arg0.field2236;
        this.field2247 = arg0.field2247;
        if (arg1) {
            this.field2233 = arg0.field2233;
            this.field2266 = arg0.field2266;
            this.field2235 = arg0.field2235;
        } else {
            this.field2233 = new int[this.field2259];
            this.field2266 = new int[this.field2259];
            this.field2235 = new int[this.field2259];
            for (int var6 = 0; var6 < this.field2259; var6++) {
                this.field2233[var6] = arg0.field2233[var6];
                this.field2266[var6] = arg0.field2266[var6];
                this.field2235[var6] = arg0.field2235[var6];
            }
        }
        if (arg2) {
            this.field2239 = arg0.field2239;
        } else {
            this.field2239 = new short[this.field2236];
            for (int var7 = 0; var7 < this.field2236; var7++) {
                this.field2239[var7] = arg0.field2239[var7];
            }
        }
        if (arg3 || arg0.field2245 == null) {
            this.field2245 = arg0.field2245;
        } else {
            this.field2245 = new short[this.field2236];
            for (int var8 = 0; var8 < this.field2236; var8++) {
                this.field2245[var8] = arg0.field2245[var8];
            }
        }
        if (arg4) {
            this.field2232 = arg0.field2232;
        } else {
            this.field2232 = new byte[this.field2236];
            if (arg0.field2232 == null) {
                for (int var9 = 0; var9 < this.field2236; var9++) {
                    this.field2232[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field2236; var10++) {
                    this.field2232[var10] = arg0.field2232[var10];
                }
            }
        }
        this.field2237 = arg0.field2237;
        this.field2252 = arg0.field2252;
        this.field2265 = arg0.field2265;
        this.field2264 = arg0.field2264;
        this.field2241 = arg0.field2241;
        this.field2240 = arg0.field2240;
        this.field2262 = arg0.field2262;
        this.field2248 = arg0.field2248;
        this.field2249 = arg0.field2249;
        this.field2250 = arg0.field2250;
        this.field2251 = arg0.field2251;
        this.field2238 = arg0.field2238;
        this.field2253 = arg0.field2253;
        this.field2243 = arg0.field2243;
        this.field2255 = arg0.field2255;
        this.field2257 = arg0.field2257;
        this.field2256 = arg0.field2256;
        this.field2258 = arg0.field2258;
        this.field2269 = arg0.field2269;
        this.field2260 = arg0.field2260;
    }

    @ObfuscatedName("gl.a()Lgl;")
    public class206 method3611() {
        class206 var1 = new class206();
        if (this.field2264 != null) {
            var1.field2264 = new byte[this.field2236];
            for (int var2 = 0; var2 < this.field2236; var2++) {
                var1.field2264[var2] = this.field2264[var2];
            }
        }
        var1.field2259 = this.field2259;
        var1.field2236 = this.field2236;
        var1.field2247 = this.field2247;
        var1.field2233 = this.field2233;
        var1.field2266 = this.field2266;
        var1.field2235 = this.field2235;
        var1.field2237 = this.field2237;
        var1.field2252 = this.field2252;
        var1.field2265 = this.field2265;
        var1.field2241 = this.field2241;
        var1.field2232 = this.field2232;
        var1.field2240 = this.field2240;
        var1.field2239 = this.field2239;
        var1.field2245 = this.field2245;
        var1.field2262 = this.field2262;
        var1.field2248 = this.field2248;
        var1.field2249 = this.field2249;
        var1.field2250 = this.field2250;
        var1.field2251 = this.field2251;
        var1.field2238 = this.field2238;
        var1.field2253 = this.field2253;
        var1.field2243 = this.field2243;
        var1.field2255 = this.field2255;
        var1.field2257 = this.field2257;
        var1.field2256 = this.field2256;
        var1.field2269 = this.field2269;
        var1.field2260 = this.field2260;
        return var1;
    }

    @ObfuscatedName("gl.u([[IIIIZI)Lgl;")
    public class206 method3612(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method3625();
        int var7 = this.field2263 + arg1;
        int var8 = this.field2242 + arg1;
        int var9 = this.field2234 + arg3;
        int var10 = this.field2254 + arg3;
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
            var15.field2259 = this.field2259;
            var15.field2236 = this.field2236;
            var15.field2247 = this.field2247;
            var15.field2233 = this.field2233;
            var15.field2235 = this.field2235;
            var15.field2237 = this.field2237;
            var15.field2252 = this.field2252;
            var15.field2265 = this.field2265;
            var15.field2264 = this.field2264;
            var15.field2241 = this.field2241;
            var15.field2232 = this.field2232;
            var15.field2240 = this.field2240;
            var15.field2239 = this.field2239;
            var15.field2245 = this.field2245;
            var15.field2262 = this.field2262;
            var15.field2248 = this.field2248;
            var15.field2249 = this.field2249;
            var15.field2250 = this.field2250;
            var15.field2251 = this.field2251;
            var15.field2238 = this.field2238;
            var15.field2253 = this.field2253;
            var15.field2243 = this.field2243;
            var15.field2255 = this.field2255;
            var15.field2269 = this.field2269;
            var15.field2260 = this.field2260;
            var15.field2266 = new int[var15.field2259];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field2259; var16++) {
                int var17 = this.field2233[var16] + arg1;
                int var18 = this.field2235[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field2266[var16] = this.field2266[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field2259; var26++) {
                int var27 = (-this.field2266[var26] << 16) / this.field2429;
                if (var27 < arg5) {
                    int var28 = this.field2233[var26] + arg1;
                    int var29 = this.field2235[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field2266[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field2266[var26];
                }
            }
        }
        var15.method3624();
        return var15;
    }

    @ObfuscatedName("gl.e()V")
    public void method3613() {
        int var10002;
        if (this.field2238 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field2259; var3++) {
                int var4 = this.field2238[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field2243 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field2243[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field2259) {
                int var7 = this.field2238[var6];
                this.field2243[var7][var1[var7]++] = var6++;
            }
            this.field2238 = null;
        }
        if (this.field2253 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field2236; var10++) {
            int var11 = this.field2253[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field2255 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field2255[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field2236) {
            int var14 = this.field2253[var13];
            this.field2255[var14][var8[var14]++] = var13++;
        }
        this.field2253 = null;
    }

    @ObfuscatedName("gl.l()V")
    public void method3614() {
        for (int var1 = 0; var1 < this.field2259; var1++) {
            int var2 = this.field2233[var1];
            this.field2233[var1] = this.field2235[var1];
            this.field2235[var1] = -var2;
        }
        this.method3624();
    }

    @ObfuscatedName("gl.y()V")
    public void method3615() {
        for (int var1 = 0; var1 < this.field2259; var1++) {
            this.field2233[var1] = -this.field2233[var1];
            this.field2235[var1] = -this.field2235[var1];
        }
        this.method3624();
    }

    @ObfuscatedName("gl.v()V")
    public void method3666() {
        for (int var1 = 0; var1 < this.field2259; var1++) {
            int var2 = this.field2235[var1];
            this.field2235[var1] = this.field2233[var1];
            this.field2233[var1] = -var2;
        }
        this.method3624();
    }

    @ObfuscatedName("gl.f(I)V")
    public void method3617(int arg0) {
        int var2 = field2270[arg0];
        int var3 = field2271[arg0];
        for (int var4 = 0; var4 < this.field2259; var4++) {
            int var5 = this.field2235[var4] * var2 + this.field2233[var4] * var3 >> 16;
            this.field2235[var4] = this.field2235[var4] * var3 - this.field2233[var4] * var2 >> 16;
            this.field2233[var4] = var5;
        }
        this.method3624();
    }

    @ObfuscatedName("gl.s(III)V")
    public void method3610(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2259; var4++) {
            this.field2233[var4] += arg0;
            this.field2266[var4] += arg1;
            this.field2235[var4] += arg2;
        }
        this.method3624();
    }

    @ObfuscatedName("gl.h(SS)V")
    public void method3673(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2236; var3++) {
            if (this.field2239[var3] == arg0) {
                this.field2239[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("gl.d(SS)V")
    public void method3620(short arg0, short arg1) {
        if (this.field2245 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field2236; var3++) {
            if (this.field2245[var3] == arg0) {
                this.field2245[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("gl.q()V")
    public void method3633() {
        for (int var1 = 0; var1 < this.field2259; var1++) {
            this.field2235[var1] = -this.field2235[var1];
        }
        for (int var2 = 0; var2 < this.field2236; var2++) {
            int var3 = this.field2237[var2];
            this.field2237[var2] = this.field2265[var2];
            this.field2265[var2] = var3;
        }
        this.method3624();
    }

    @ObfuscatedName("gl.j(III)V")
    public void method3622(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2259; var4++) {
            this.field2233[var4] = this.field2233[var4] * arg0 / 128;
            this.field2266[var4] = this.field2266[var4] * arg1 / 128;
            this.field2235[var4] = this.field2235[var4] * arg2 / 128;
        }
        this.method3624();
    }

    @ObfuscatedName("gl.x()V")
    public void method3644() {
        if (this.field2257 != null) {
            return;
        }
        this.field2257 = new class222[this.field2259];
        for (int var1 = 0; var1 < this.field2259; var1++) {
            this.field2257[var1] = new class222();
        }
        for (int var2 = 0; var2 < this.field2236; var2++) {
            int var3 = this.field2237[var2];
            int var4 = this.field2252[var2];
            int var5 = this.field2265[var2];
            int var6 = this.field2233[var4] - this.field2233[var3];
            int var7 = this.field2266[var4] - this.field2266[var3];
            int var8 = this.field2235[var4] - this.field2235[var3];
            int var9 = this.field2233[var5] - this.field2233[var3];
            int var10 = this.field2266[var5] - this.field2266[var3];
            int var11 = this.field2235[var5] - this.field2235[var3];
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
            if (this.field2264 == null) {
                var19 = 0;
            } else {
                var19 = this.field2264[var2];
            }
            if (var19 == 0) {
                class222 var20 = this.field2257[var3];
                var20.field2575 += var16;
                var20.field2576 += var17;
                var20.field2577 += var18;
                var20.field2579++;
                class222 var21 = this.field2257[var4];
                var21.field2575 += var16;
                var21.field2576 += var17;
                var21.field2577 += var18;
                var21.field2579++;
                class222 var22 = this.field2257[var5];
                var22.field2575 += var16;
                var22.field2576 += var17;
                var22.field2577 += var18;
                var22.field2579++;
            } else if (var19 == 1) {
                if (this.field2256 == null) {
                    this.field2256 = new class215[this.field2236];
                }
                class215 var23 = this.field2256[var2] = new class215();
                var23.field2433 = var16;
                var23.field2431 = var17;
                var23.field2430 = var18;
            }
        }
    }

    @ObfuscatedName("gl.b()V")
    public void method3624() {
        this.field2257 = null;
        this.field2258 = null;
        this.field2256 = null;
        this.field2261 = false;
    }

    @ObfuscatedName("gl.t()V")
    public void method3625() {
        if (this.field2261) {
            return;
        }
        this.field2429 = 0;
        this.field2246 = 0;
        this.field2263 = 999999;
        this.field2242 = -999999;
        this.field2254 = -99999;
        this.field2234 = 99999;
        for (int var1 = 0; var1 < this.field2259; var1++) {
            int var2 = this.field2233[var1];
            int var3 = this.field2266[var1];
            int var4 = this.field2235[var1];
            if (var2 < this.field2263) {
                this.field2263 = var2;
            }
            if (var2 > this.field2242) {
                this.field2242 = var2;
            }
            if (var4 < this.field2234) {
                this.field2234 = var4;
            }
            if (var4 > this.field2254) {
                this.field2254 = var4;
            }
            if (-var3 > this.field2429) {
                this.field2429 = -var3;
            }
            if (var3 > this.field2246) {
                this.field2246 = var3;
            }
        }
        this.field2261 = true;
    }

    @ObfuscatedName("gl.r(Lgl;Lgl;IIIZ)V")
    public static void method3626(class206 arg0, class206 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method3625();
        arg0.method3644();
        arg1.method3625();
        arg1.method3644();
        field2244++;
        int var6 = 0;
        int[] var7 = arg1.field2233;
        int var8 = arg1.field2259;
        for (int var9 = 0; var9 < arg0.field2259; var9++) {
            class222 var10 = arg0.field2257[var9];
            if (var10.field2579 != 0) {
                int var11 = arg0.field2266[var9] - arg3;
                if (var11 <= arg1.field2246) {
                    int var12 = arg0.field2233[var9] - arg2;
                    if (var12 >= arg1.field2263 && var12 <= arg1.field2242) {
                        int var13 = arg0.field2235[var9] - arg4;
                        if (var13 >= arg1.field2234 && var13 <= arg1.field2254) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class222 var15 = arg1.field2257[var14];
                                if (var7[var14] == var12 && arg1.field2235[var14] == var13 && arg1.field2266[var14] == var11 && var15.field2579 != 0) {
                                    if (arg0.field2258 == null) {
                                        arg0.field2258 = new class222[arg0.field2259];
                                    }
                                    if (arg1.field2258 == null) {
                                        arg1.field2258 = new class222[var8];
                                    }
                                    class222 var16 = arg0.field2258[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field2258[var9] = new class222(var10);
                                    }
                                    class222 var17 = arg1.field2258[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field2258[var14] = new class222(var15);
                                    }
                                    var16.field2575 += var15.field2575;
                                    var16.field2576 += var15.field2576;
                                    var16.field2577 += var15.field2577;
                                    var16.field2579 += var15.field2579;
                                    var17.field2575 += var10.field2575;
                                    var17.field2576 += var10.field2576;
                                    var17.field2577 += var10.field2577;
                                    var17.field2579 += var10.field2579;
                                    var6++;
                                    field2267[var9] = field2244;
                                    field2268[var14] = field2244;
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
        for (int var18 = 0; var18 < arg0.field2236; var18++) {
            if (field2267[arg0.field2237[var18]] == field2244 && field2267[arg0.field2252[var18]] == field2244 && field2267[arg0.field2265[var18]] == field2244) {
                if (arg0.field2264 == null) {
                    arg0.field2264 = new byte[arg0.field2236];
                }
                arg0.field2264[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field2236; var19++) {
            if (field2268[arg1.field2237[var19]] == field2244 && field2268[arg1.field2252[var19]] == field2244 && field2268[arg1.field2265[var19]] == field2244) {
                if (arg1.field2264 == null) {
                    arg1.field2264 = new byte[arg1.field2236];
                }
                arg1.field2264[var19] = 2;
            }
        }
    }

    @ObfuscatedName("gl.p(IIIII)Lhg;")
    public final class220 method3627(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method3644();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class220 var8 = new class220();
        var8.field2508 = new int[this.field2236];
        var8.field2507 = new int[this.field2236];
        var8.field2494 = new int[this.field2236];
        if (this.field2247 > 0 && this.field2240 != null) {
            int[] var9 = new int[this.field2247];
            for (int var10 = 0; var10 < this.field2236; var10++) {
                if (this.field2240[var10] != -1) {
                    var9[this.field2240[var10] & 0xFF]++;
                }
            }
            var8.field2514 = 0;
            for (int var11 = 0; var11 < this.field2247; var11++) {
                if (var9[var11] > 0 && this.field2248[var11] == 0) {
                    var8.field2514++;
                }
            }
            var8.field2499 = new int[var8.field2514];
            var8.field2516 = new int[var8.field2514];
            var8.field2550 = new int[var8.field2514];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field2247; var13++) {
                if (var9[var13] > 0 && this.field2248[var13] == 0) {
                    var8.field2499[var12] = this.field2249[var13] & 0xFFFF;
                    var8.field2516[var12] = this.field2250[var13] & 0xFFFF;
                    var8.field2550[var12] = this.field2251[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field2511 = new byte[this.field2236];
            for (int var14 = 0; var14 < this.field2236; var14++) {
                if (this.field2240[var14] == -1) {
                    var8.field2511[var14] = -1;
                } else {
                    var8.field2511[var14] = (byte) var9[this.field2240[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field2236; var15++) {
            byte var16;
            if (this.field2264 == null) {
                var16 = 0;
            } else {
                var16 = this.field2264[var15];
            }
            byte var17;
            if (this.field2232 == null) {
                var17 = 0;
            } else {
                var17 = this.field2232[var15];
            }
            short var18;
            if (this.field2245 == null) {
                var18 = -1;
            } else {
                var18 = this.field2245[var15];
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
                    class222 var20;
                    if (this.field2258 == null || this.field2258[this.field2237[var15]] == null) {
                        var20 = this.field2257[this.field2237[var15]];
                    } else {
                        var20 = this.field2258[this.field2237[var15]];
                    }
                    int var21 = (var20.field2577 * arg4 + var20.field2576 * arg3 + var20.field2575 * arg2) / (var20.field2579 * var7) + arg0;
                    var8.field2508[var15] = method3628(var19, var21);
                    class222 var22;
                    if (this.field2258 == null || this.field2258[this.field2252[var15]] == null) {
                        var22 = this.field2257[this.field2252[var15]];
                    } else {
                        var22 = this.field2258[this.field2252[var15]];
                    }
                    int var23 = (var22.field2577 * arg4 + var22.field2576 * arg3 + var22.field2575 * arg2) / (var22.field2579 * var7) + arg0;
                    var8.field2507[var15] = method3628(var19, var23);
                    class222 var24;
                    if (this.field2258 == null || this.field2258[this.field2265[var15]] == null) {
                        var24 = this.field2257[this.field2265[var15]];
                    } else {
                        var24 = this.field2258[this.field2265[var15]];
                    }
                    int var25 = (var24.field2577 * arg4 + var24.field2576 * arg3 + var24.field2575 * arg2) / (var24.field2579 * var7) + arg0;
                    var8.field2494[var15] = method3628(var19, var25);
                } else if (var16 == 1) {
                    class215 var26 = this.field2256[var15];
                    int var27 = (var26.field2430 * arg4 + var26.field2433 * arg2 + var26.field2431 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field2508[var15] = method3628(this.field2239[var15] & 0xFFFF, var27);
                    var8.field2494[var15] = -1;
                } else if (var16 == 3) {
                    var8.field2508[var15] = 128;
                    var8.field2494[var15] = -1;
                } else {
                    var8.field2494[var15] = -2;
                }
            } else if (var16 == 0) {
                class222 var28;
                if (this.field2258 == null || this.field2258[this.field2237[var15]] == null) {
                    var28 = this.field2257[this.field2237[var15]];
                } else {
                    var28 = this.field2258[this.field2237[var15]];
                }
                int var29 = (var28.field2577 * arg4 + var28.field2576 * arg3 + var28.field2575 * arg2) / (var28.field2579 * var7) + arg0;
                var8.field2508[var15] = method3629(var29);
                class222 var30;
                if (this.field2258 == null || this.field2258[this.field2252[var15]] == null) {
                    var30 = this.field2257[this.field2252[var15]];
                } else {
                    var30 = this.field2258[this.field2252[var15]];
                }
                int var31 = (var30.field2577 * arg4 + var30.field2576 * arg3 + var30.field2575 * arg2) / (var30.field2579 * var7) + arg0;
                var8.field2507[var15] = method3629(var31);
                class222 var32;
                if (this.field2258 == null || this.field2258[this.field2265[var15]] == null) {
                    var32 = this.field2257[this.field2265[var15]];
                } else {
                    var32 = this.field2258[this.field2265[var15]];
                }
                int var33 = (var32.field2577 * arg4 + var32.field2576 * arg3 + var32.field2575 * arg2) / (var32.field2579 * var7) + arg0;
                var8.field2494[var15] = method3629(var33);
            } else if (var16 == 1) {
                class215 var34 = this.field2256[var15];
                int var35 = (var34.field2430 * arg4 + var34.field2433 * arg2 + var34.field2431 * arg3) / (var7 / 2 + var7) + arg0;
                var8.field2508[var15] = method3629(var35);
                var8.field2494[var15] = -1;
            } else {
                var8.field2494[var15] = -2;
            }
        }
        this.method3613();
        var8.field2498 = this.field2259;
        var8.field2551 = this.field2233;
        var8.field2548 = this.field2266;
        var8.field2501 = this.field2235;
        var8.field2502 = this.field2236;
        var8.field2503 = this.field2237;
        var8.field2500 = this.field2252;
        var8.field2504 = this.field2265;
        var8.field2509 = this.field2241;
        var8.field2510 = this.field2232;
        var8.field2549 = this.field2262;
        var8.field2518 = this.field2243;
        var8.field2519 = this.field2255;
        var8.field2512 = this.field2245;
        return var8;
    }

    @ObfuscatedName("gl.w(II)I")
    public static final int method3628(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("gl.i(I)I")
    public static final int method3629(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
