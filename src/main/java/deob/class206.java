package deob;

@ObfuscatedName("gk")
public class class206 extends class214 {

    @ObfuscatedName("gk.i")
    public int field2272 = 0;

    @ObfuscatedName("gk.w")
    public int[] field2249;

    @ObfuscatedName("gk.s")
    public int[] field2250;

    @ObfuscatedName("gk.a")
    public int[] field2251;

    @ObfuscatedName("gk.o")
    public int field2252 = 0;

    @ObfuscatedName("gk.g")
    public int[] field2253;

    @ObfuscatedName("gk.e")
    public int[] field2254;

    @ObfuscatedName("gk.p")
    public int[] field2255;

    @ObfuscatedName("gk.j")
    public byte[] field2259;

    @ObfuscatedName("gk.b")
    public byte[] field2257;

    @ObfuscatedName("gk.x")
    public byte[] field2277;

    @ObfuscatedName("gk.y")
    public byte[] field2262;

    @ObfuscatedName("gk.k")
    public short[] field2260;

    @ObfuscatedName("gk.t")
    public short[] field2261;

    @ObfuscatedName("gk.l")
    public byte field2287 = 0;

    @ObfuscatedName("gk.u")
    public int field2263;

    @ObfuscatedName("gk.n")
    public byte[] field2258;

    @ObfuscatedName("gk.z")
    public short[] field2265;

    @ObfuscatedName("gk.q")
    public short[] field2266;

    @ObfuscatedName("gk.d")
    public short[] field2267;

    @ObfuscatedName("gk.r")
    public int[] field2280;

    @ObfuscatedName("gk.m")
    public int[] field2282;

    @ObfuscatedName("gk.c")
    public int[][] field2285;

    @ObfuscatedName("gk.f")
    public int[][] field2264;

    @ObfuscatedName("gk.h")
    public class215[] field2283;

    @ObfuscatedName("gk.v")
    public class222[] field2273;

    @ObfuscatedName("gk.ag")
    public class222[] field2274;

    @ObfuscatedName("gk.ae")
    public short field2275;

    @ObfuscatedName("gk.aq")
    public short field2271;

    @ObfuscatedName("gk.al")
    public boolean field2269 = false;

    @ObfuscatedName("gk.am")
    public int field2278;

    @ObfuscatedName("gk.ai")
    public int field2279;

    @ObfuscatedName("gk.ah")
    public int field2276;

    @ObfuscatedName("gk.as")
    public int field2281;

    @ObfuscatedName("gk.at")
    public int field2268;

    @ObfuscatedName("gk.az")
    public static int[] field2256 = new int[10000];

    @ObfuscatedName("gk.ac")
    public static int[] field2284 = new int[10000];

    @ObfuscatedName("gk.ak")
    public static int field2270 = 0;

    @ObfuscatedName("gk.ab")
    public static int[] field2286 = class211.field2362;

    @ObfuscatedName("gk.ar")
    public static int[] field2248 = class211.field2370;

    public class206() {
    }

    @ObfuscatedName("gk.i(Lko;II)Lgk;")
    public static class206 method3658(class290 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method4743(arg1, arg2);
        return var3 == null ? null : new class206(var3);
    }

    public class206(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method3660(arg0);
        } else {
            this.method3661(arg0);
        }
    }

    @ObfuscatedName("gk.s([B)V")
    public void method3660(byte[] arg0) {
        class401 var2 = new class401(arg0);
        class401 var3 = new class401(arg0);
        class401 var4 = new class401(arg0);
        class401 var5 = new class401(arg0);
        class401 var6 = new class401(arg0);
        class401 var7 = new class401(arg0);
        class401 var8 = new class401(arg0);
        var2.field4300 = arg0.length - 23;
        int var9 = var2.method6242();
        int var10 = var2.method6242();
        int var11 = var2.method6240();
        int var12 = var2.method6240();
        int var13 = var2.method6240();
        int var14 = var2.method6240();
        int var15 = var2.method6240();
        int var16 = var2.method6240();
        int var17 = var2.method6240();
        int var18 = var2.method6242();
        int var19 = var2.method6242();
        int var20 = var2.method6242();
        int var21 = var2.method6242();
        int var22 = var2.method6242();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field2258 = new byte[var11];
            var2.field4300 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field2258[var26] = var2.method6241();
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
        this.field2272 = var9;
        this.field2252 = var10;
        this.field2263 = var11;
        this.field2249 = new int[var9];
        this.field2250 = new int[var9];
        this.field2251 = new int[var9];
        this.field2253 = new int[var10];
        this.field2254 = new int[var10];
        this.field2255 = new int[var10];
        if (var17 == 1) {
            this.field2280 = new int[var9];
        }
        if (var12 == 1) {
            this.field2259 = new byte[var10];
        }
        if (var13 == 255) {
            this.field2257 = new byte[var10];
        } else {
            this.field2287 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2277 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2282 = new int[var10];
        }
        if (var16 == 1) {
            this.field2261 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field2262 = new byte[var10];
        }
        this.field2260 = new short[var10];
        if (var11 > 0) {
            this.field2265 = new short[var11];
            this.field2266 = new short[var11];
            this.field2267 = new short[var11];
        }
        var2.field4300 = var11;
        var3.field4300 = var44;
        var4.field4300 = var46;
        var5.field4300 = var48;
        var6.field4300 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method6240();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method6253();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method6253();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method6253();
            }
            this.field2249[var67] = var64 + var69;
            this.field2250[var67] = var65 + var70;
            this.field2251[var67] = var66 + var71;
            var64 = this.field2249[var67];
            var65 = this.field2250[var67];
            var66 = this.field2251[var67];
            if (var17 == 1) {
                this.field2280[var67] = var6.method6240();
            }
        }
        var2.field4300 = var42;
        var3.field4300 = var31;
        var4.field4300 = var34;
        var5.field4300 = var37;
        var6.field4300 = var35;
        var7.field4300 = var40;
        var8.field4300 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field2260[var72] = (short) var2.method6242();
            if (var12 == 1) {
                this.field2259[var72] = var3.method6241();
            }
            if (var13 == 255) {
                this.field2257[var72] = var4.method6241();
            }
            if (var14 == 1) {
                this.field2277[var72] = var5.method6241();
            }
            if (var15 == 1) {
                this.field2282[var72] = var6.method6240();
            }
            if (var16 == 1) {
                this.field2261[var72] = (short) (var7.method6242() - 1);
            }
            if (this.field2262 != null && this.field2261[var72] != -1) {
                this.field2262[var72] = (byte) (var8.method6240() - 1);
            }
        }
        var2.field4300 = var33;
        var3.field4300 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method6240();
            if (var78 == 1) {
                var73 = var2.method6253() + var76;
                var74 = var2.method6253() + var73;
                var75 = var2.method6253() + var74;
                var76 = var75;
                this.field2253[var77] = var73;
                this.field2254[var77] = var74;
                this.field2255[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method6253() + var76;
                var76 = var75;
                this.field2253[var77] = var73;
                this.field2254[var77] = var74;
                this.field2255[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method6253() + var76;
                var76 = var75;
                this.field2253[var77] = var73;
                this.field2254[var77] = var74;
                this.field2255[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method6253() + var76;
                var76 = var75;
                this.field2253[var77] = var73;
                this.field2254[var77] = var81;
                this.field2255[var77] = var75;
            }
        }
        var2.field4300 = var50;
        var3.field4300 = var52;
        var4.field4300 = var54;
        var5.field4300 = var56;
        var6.field4300 = var58;
        var7.field4300 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field2258[var82] & 0xFF;
            if (var83 == 0) {
                this.field2265[var82] = (short) var2.method6242();
                this.field2266[var82] = (short) var2.method6242();
                this.field2267[var82] = (short) var2.method6242();
            }
        }
        var2.field4300 = var62;
        int var84 = var2.method6240();
        if (var84 == 0) {
            return;
        }
        new class224();
        var2.method6242();
        var2.method6242();
        var2.method6242();
        var2.method6245();
    }

    @ObfuscatedName("gk.a([B)V")
    public void method3661(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class401 var4 = new class401(arg0);
        class401 var5 = new class401(arg0);
        class401 var6 = new class401(arg0);
        class401 var7 = new class401(arg0);
        class401 var8 = new class401(arg0);
        var4.field4300 = arg0.length - 18;
        int var9 = var4.method6242();
        int var10 = var4.method6242();
        int var11 = var4.method6240();
        int var12 = var4.method6240();
        int var13 = var4.method6240();
        int var14 = var4.method6240();
        int var15 = var4.method6240();
        int var16 = var4.method6240();
        int var17 = var4.method6242();
        int var18 = var4.method6242();
        int var19 = var4.method6242();
        int var20 = var4.method6242();
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
        this.field2272 = var9;
        this.field2252 = var10;
        this.field2263 = var11;
        this.field2249 = new int[var9];
        this.field2250 = new int[var9];
        this.field2251 = new int[var9];
        this.field2253 = new int[var10];
        this.field2254 = new int[var10];
        this.field2255 = new int[var10];
        if (var11 > 0) {
            this.field2258 = new byte[var11];
            this.field2265 = new short[var11];
            this.field2266 = new short[var11];
            this.field2267 = new short[var11];
        }
        if (var16 == 1) {
            this.field2280 = new int[var9];
        }
        if (var12 == 1) {
            this.field2259 = new byte[var10];
            this.field2262 = new byte[var10];
            this.field2261 = new short[var10];
        }
        if (var13 == 255) {
            this.field2257 = new byte[var10];
        } else {
            this.field2287 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2277 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2282 = new int[var10];
        }
        this.field2260 = new short[var10];
        var4.field4300 = var21;
        var5.field4300 = var36;
        var6.field4300 = var38;
        var7.field4300 = var40;
        var8.field4300 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method6240();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method6253();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method6253();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method6253();
            }
            this.field2249[var46] = var43 + var48;
            this.field2250[var46] = var44 + var49;
            this.field2251[var46] = var45 + var50;
            var43 = this.field2249[var46];
            var44 = this.field2250[var46];
            var45 = this.field2251[var46];
            if (var16 == 1) {
                this.field2280[var46] = var8.method6240();
            }
        }
        var4.field4300 = var32;
        var5.field4300 = var28;
        var6.field4300 = var26;
        var7.field4300 = var30;
        var8.field4300 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field2260[var51] = (short) var4.method6242();
            if (var12 == 1) {
                int var52 = var5.method6240();
                if ((var52 & 0x1) == 1) {
                    this.field2259[var51] = 1;
                    var2 = true;
                } else {
                    this.field2259[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field2262[var51] = (byte) (var52 >> 2);
                    this.field2261[var51] = this.field2260[var51];
                    this.field2260[var51] = 127;
                    if (this.field2261[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field2262[var51] = -1;
                    this.field2261[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field2257[var51] = var6.method6241();
            }
            if (var14 == 1) {
                this.field2277[var51] = var7.method6241();
            }
            if (var15 == 1) {
                this.field2282[var51] = var8.method6240();
            }
        }
        var4.field4300 = var25;
        var5.field4300 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method6240();
            if (var58 == 1) {
                var53 = var4.method6253() + var56;
                var54 = var4.method6253() + var53;
                var55 = var4.method6253() + var54;
                var56 = var55;
                this.field2253[var57] = var53;
                this.field2254[var57] = var54;
                this.field2255[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method6253() + var56;
                var56 = var55;
                this.field2253[var57] = var53;
                this.field2254[var57] = var54;
                this.field2255[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method6253() + var56;
                var56 = var55;
                this.field2253[var57] = var53;
                this.field2254[var57] = var54;
                this.field2255[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method6253() + var56;
                var56 = var55;
                this.field2253[var57] = var53;
                this.field2254[var57] = var61;
                this.field2255[var57] = var55;
            }
        }
        var4.field4300 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field2258[var62] = 0;
            this.field2265[var62] = (short) var4.method6242();
            this.field2266[var62] = (short) var4.method6242();
            this.field2267[var62] = (short) var4.method6242();
        }
        if (this.field2262 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field2262[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field2265[var65] & 0xFFFF) == this.field2253[var64] && (this.field2266[var65] & 0xFFFF) == this.field2254[var64] && (this.field2267[var65] & 0xFFFF) == this.field2255[var64]) {
                        this.field2262[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field2262 = null;
            }
        }
        if (!var3) {
            this.field2261 = null;
        }
        if (!var2) {
            this.field2259 = null;
        }
    }

    public class206(class206[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field2272 = 0;
        this.field2252 = 0;
        this.field2263 = 0;
        this.field2287 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class206 var10 = arg0[var9];
            if (var10 != null) {
                this.field2272 += var10.field2272;
                this.field2252 += var10.field2252;
                this.field2263 += var10.field2263;
                if (var10.field2257 == null) {
                    if (this.field2287 == -1) {
                        this.field2287 = var10.field2287;
                    }
                    if (this.field2287 != var10.field2287) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field2259 != null;
                var5 |= var10.field2277 != null;
                var6 |= var10.field2282 != null;
                var7 |= var10.field2261 != null;
                var8 |= var10.field2262 != null;
            }
        }
        this.field2249 = new int[this.field2272];
        this.field2250 = new int[this.field2272];
        this.field2251 = new int[this.field2272];
        this.field2280 = new int[this.field2272];
        this.field2253 = new int[this.field2252];
        this.field2254 = new int[this.field2252];
        this.field2255 = new int[this.field2252];
        if (var3) {
            this.field2259 = new byte[this.field2252];
        }
        if (var4) {
            this.field2257 = new byte[this.field2252];
        }
        if (var5) {
            this.field2277 = new byte[this.field2252];
        }
        if (var6) {
            this.field2282 = new int[this.field2252];
        }
        if (var7) {
            this.field2261 = new short[this.field2252];
        }
        if (var8) {
            this.field2262 = new byte[this.field2252];
        }
        this.field2260 = new short[this.field2252];
        if (this.field2263 > 0) {
            this.field2258 = new byte[this.field2263];
            this.field2265 = new short[this.field2263];
            this.field2266 = new short[this.field2263];
            this.field2267 = new short[this.field2263];
        }
        this.field2272 = 0;
        this.field2252 = 0;
        this.field2263 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class206 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field2252; var13++) {
                    if (var3 && var12.field2259 != null) {
                        this.field2259[this.field2252] = var12.field2259[var13];
                    }
                    if (var4) {
                        if (var12.field2257 == null) {
                            this.field2257[this.field2252] = var12.field2287;
                        } else {
                            this.field2257[this.field2252] = var12.field2257[var13];
                        }
                    }
                    if (var5 && var12.field2277 != null) {
                        this.field2277[this.field2252] = var12.field2277[var13];
                    }
                    if (var6 && var12.field2282 != null) {
                        this.field2282[this.field2252] = var12.field2282[var13];
                    }
                    if (var7) {
                        if (var12.field2261 == null) {
                            this.field2261[this.field2252] = -1;
                        } else {
                            this.field2261[this.field2252] = var12.field2261[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field2262 == null || var12.field2262[var13] == -1) {
                            this.field2262[this.field2252] = -1;
                        } else {
                            this.field2262[this.field2252] = (byte) (var12.field2262[var13] + this.field2263);
                        }
                    }
                    this.field2260[this.field2252] = var12.field2260[var13];
                    this.field2253[this.field2252] = this.method3671(var12, var12.field2253[var13]);
                    this.field2254[this.field2252] = this.method3671(var12, var12.field2254[var13]);
                    this.field2255[this.field2252] = this.method3671(var12, var12.field2255[var13]);
                    this.field2252++;
                }
                for (int var14 = 0; var14 < var12.field2263; var14++) {
                    byte var15 = this.field2258[this.field2263] = var12.field2258[var14];
                    if (var15 == 0) {
                        this.field2265[this.field2263] = (short) this.method3671(var12, var12.field2265[var14]);
                        this.field2266[this.field2263] = (short) this.method3671(var12, var12.field2266[var14]);
                        this.field2267[this.field2263] = (short) this.method3671(var12, var12.field2267[var14]);
                    }
                    this.field2263++;
                }
            }
        }
    }

    @ObfuscatedName("gk.j(Lgk;I)I")
    public final int method3671(class206 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field2249[arg1];
        int var5 = arg0.field2250[arg1];
        int var6 = arg0.field2251[arg1];
        for (int var7 = 0; var7 < this.field2272; var7++) {
            if (this.field2249[var7] == var4 && this.field2250[var7] == var5 && this.field2251[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field2249[this.field2272] = var4;
            this.field2250[this.field2272] = var5;
            this.field2251[this.field2272] = var6;
            if (arg0.field2280 != null) {
                this.field2280[this.field2272] = arg0.field2280[arg1];
            }
            var3 = this.field2272++;
        }
        return var3;
    }

    public class206(class206 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field2272 = arg0.field2272;
        this.field2252 = arg0.field2252;
        this.field2263 = arg0.field2263;
        if (arg1) {
            this.field2249 = arg0.field2249;
            this.field2250 = arg0.field2250;
            this.field2251 = arg0.field2251;
        } else {
            this.field2249 = new int[this.field2272];
            this.field2250 = new int[this.field2272];
            this.field2251 = new int[this.field2272];
            for (int var6 = 0; var6 < this.field2272; var6++) {
                this.field2249[var6] = arg0.field2249[var6];
                this.field2250[var6] = arg0.field2250[var6];
                this.field2251[var6] = arg0.field2251[var6];
            }
        }
        if (arg2) {
            this.field2260 = arg0.field2260;
        } else {
            this.field2260 = new short[this.field2252];
            for (int var7 = 0; var7 < this.field2252; var7++) {
                this.field2260[var7] = arg0.field2260[var7];
            }
        }
        if (arg3 || arg0.field2261 == null) {
            this.field2261 = arg0.field2261;
        } else {
            this.field2261 = new short[this.field2252];
            for (int var8 = 0; var8 < this.field2252; var8++) {
                this.field2261[var8] = arg0.field2261[var8];
            }
        }
        if (arg4) {
            this.field2277 = arg0.field2277;
        } else {
            this.field2277 = new byte[this.field2252];
            if (arg0.field2277 == null) {
                for (int var9 = 0; var9 < this.field2252; var9++) {
                    this.field2277[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field2252; var10++) {
                    this.field2277[var10] = arg0.field2277[var10];
                }
            }
        }
        this.field2253 = arg0.field2253;
        this.field2254 = arg0.field2254;
        this.field2255 = arg0.field2255;
        this.field2259 = arg0.field2259;
        this.field2257 = arg0.field2257;
        this.field2262 = arg0.field2262;
        this.field2287 = arg0.field2287;
        this.field2258 = arg0.field2258;
        this.field2265 = arg0.field2265;
        this.field2266 = arg0.field2266;
        this.field2267 = arg0.field2267;
        this.field2280 = arg0.field2280;
        this.field2282 = arg0.field2282;
        this.field2285 = arg0.field2285;
        this.field2264 = arg0.field2264;
        this.field2273 = arg0.field2273;
        this.field2283 = arg0.field2283;
        this.field2274 = arg0.field2274;
        this.field2275 = arg0.field2275;
        this.field2271 = arg0.field2271;
    }

    @ObfuscatedName("gk.b()Lgk;")
    public class206 method3663() {
        class206 var1 = new class206();
        if (this.field2259 != null) {
            var1.field2259 = new byte[this.field2252];
            for (int var2 = 0; var2 < this.field2252; var2++) {
                var1.field2259[var2] = this.field2259[var2];
            }
        }
        var1.field2272 = this.field2272;
        var1.field2252 = this.field2252;
        var1.field2263 = this.field2263;
        var1.field2249 = this.field2249;
        var1.field2250 = this.field2250;
        var1.field2251 = this.field2251;
        var1.field2253 = this.field2253;
        var1.field2254 = this.field2254;
        var1.field2255 = this.field2255;
        var1.field2257 = this.field2257;
        var1.field2277 = this.field2277;
        var1.field2262 = this.field2262;
        var1.field2260 = this.field2260;
        var1.field2261 = this.field2261;
        var1.field2287 = this.field2287;
        var1.field2258 = this.field2258;
        var1.field2265 = this.field2265;
        var1.field2266 = this.field2266;
        var1.field2267 = this.field2267;
        var1.field2280 = this.field2280;
        var1.field2282 = this.field2282;
        var1.field2285 = this.field2285;
        var1.field2264 = this.field2264;
        var1.field2273 = this.field2273;
        var1.field2283 = this.field2283;
        var1.field2275 = this.field2275;
        var1.field2271 = this.field2271;
        return var1;
    }

    @ObfuscatedName("gk.x([[IIIIZI)Lgk;")
    public class206 method3683(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method3733();
        int var7 = this.field2279 + arg1;
        int var8 = this.field2276 + arg1;
        int var9 = this.field2268 + arg3;
        int var10 = this.field2281 + arg3;
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
            var15.field2272 = this.field2272;
            var15.field2252 = this.field2252;
            var15.field2263 = this.field2263;
            var15.field2249 = this.field2249;
            var15.field2251 = this.field2251;
            var15.field2253 = this.field2253;
            var15.field2254 = this.field2254;
            var15.field2255 = this.field2255;
            var15.field2259 = this.field2259;
            var15.field2257 = this.field2257;
            var15.field2277 = this.field2277;
            var15.field2262 = this.field2262;
            var15.field2260 = this.field2260;
            var15.field2261 = this.field2261;
            var15.field2287 = this.field2287;
            var15.field2258 = this.field2258;
            var15.field2265 = this.field2265;
            var15.field2266 = this.field2266;
            var15.field2267 = this.field2267;
            var15.field2280 = this.field2280;
            var15.field2282 = this.field2282;
            var15.field2285 = this.field2285;
            var15.field2264 = this.field2264;
            var15.field2275 = this.field2275;
            var15.field2271 = this.field2271;
            var15.field2250 = new int[var15.field2272];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field2272; var16++) {
                int var17 = this.field2249[var16] + arg1;
                int var18 = this.field2251[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field2250[var16] = this.field2250[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field2272; var26++) {
                int var27 = (-this.field2250[var26] << 16) / this.field2444;
                if (var27 < arg5) {
                    int var28 = this.field2249[var26] + arg1;
                    int var29 = this.field2251[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field2250[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field2250[var26];
                }
            }
        }
        var15.method3676();
        return var15;
    }

    @ObfuscatedName("gk.y()V")
    public void method3695() {
        int var10002;
        if (this.field2280 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field2272; var3++) {
                int var4 = this.field2280[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field2285 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field2285[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field2272) {
                int var7 = this.field2280[var6];
                this.field2285[var7][var1[var7]++] = var6++;
            }
            this.field2280 = null;
        }
        if (this.field2282 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field2252; var10++) {
            int var11 = this.field2282[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field2264 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field2264[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field2252) {
            int var14 = this.field2282[var13];
            this.field2264[var14][var8[var14]++] = var13++;
        }
        this.field2282 = null;
    }

    @ObfuscatedName("gk.k()V")
    public void method3706() {
        for (int var1 = 0; var1 < this.field2272; var1++) {
            int var2 = this.field2249[var1];
            this.field2249[var1] = this.field2251[var1];
            this.field2251[var1] = -var2;
        }
        this.method3676();
    }

    @ObfuscatedName("gk.t()V")
    public void method3667() {
        for (int var1 = 0; var1 < this.field2272; var1++) {
            this.field2249[var1] = -this.field2249[var1];
            this.field2251[var1] = -this.field2251[var1];
        }
        this.method3676();
    }

    @ObfuscatedName("gk.l()V")
    public void method3668() {
        for (int var1 = 0; var1 < this.field2272; var1++) {
            int var2 = this.field2251[var1];
            this.field2251[var1] = this.field2249[var1];
            this.field2249[var1] = -var2;
        }
        this.method3676();
    }

    @ObfuscatedName("gk.u(I)V")
    public void method3659(int arg0) {
        int var2 = field2286[arg0];
        int var3 = field2248[arg0];
        for (int var4 = 0; var4 < this.field2272; var4++) {
            int var5 = this.field2251[var4] * var2 + this.field2249[var4] * var3 >> 16;
            this.field2251[var4] = this.field2251[var4] * var3 - this.field2249[var4] * var2 >> 16;
            this.field2249[var4] = var5;
        }
        this.method3676();
    }

    @ObfuscatedName("gk.n(III)V")
    public void method3670(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2272; var4++) {
            this.field2249[var4] += arg0;
            this.field2250[var4] += arg1;
            this.field2251[var4] += arg2;
        }
        this.method3676();
    }

    @ObfuscatedName("gk.z(SS)V")
    public void method3687(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2252; var3++) {
            if (this.field2260[var3] == arg0) {
                this.field2260[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("gk.q(SS)V")
    public void method3672(short arg0, short arg1) {
        if (this.field2261 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field2252; var3++) {
            if (this.field2261[var3] == arg0) {
                this.field2261[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("gk.d()V")
    public void method3673() {
        for (int var1 = 0; var1 < this.field2272; var1++) {
            this.field2251[var1] = -this.field2251[var1];
        }
        for (int var2 = 0; var2 < this.field2252; var2++) {
            int var3 = this.field2253[var2];
            this.field2253[var2] = this.field2255[var2];
            this.field2255[var2] = var3;
        }
        this.method3676();
    }

    @ObfuscatedName("gk.r(III)V")
    public void method3705(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2272; var4++) {
            this.field2249[var4] = this.field2249[var4] * arg0 / 128;
            this.field2250[var4] = this.field2250[var4] * arg1 / 128;
            this.field2251[var4] = this.field2251[var4] * arg2 / 128;
        }
        this.method3676();
    }

    @ObfuscatedName("gk.m()V")
    public void method3675() {
        if (this.field2273 != null) {
            return;
        }
        this.field2273 = new class222[this.field2272];
        for (int var1 = 0; var1 < this.field2272; var1++) {
            this.field2273[var1] = new class222();
        }
        for (int var2 = 0; var2 < this.field2252; var2++) {
            int var3 = this.field2253[var2];
            int var4 = this.field2254[var2];
            int var5 = this.field2255[var2];
            int var6 = this.field2249[var4] - this.field2249[var3];
            int var7 = this.field2250[var4] - this.field2250[var3];
            int var8 = this.field2251[var4] - this.field2251[var3];
            int var9 = this.field2249[var5] - this.field2249[var3];
            int var10 = this.field2250[var5] - this.field2250[var3];
            int var11 = this.field2251[var5] - this.field2251[var3];
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
            if (this.field2259 == null) {
                var19 = 0;
            } else {
                var19 = this.field2259[var2];
            }
            if (var19 == 0) {
                class222 var20 = this.field2273[var3];
                var20.field2598 += var16;
                var20.field2593 += var17;
                var20.field2594 += var18;
                var20.field2597++;
                class222 var21 = this.field2273[var4];
                var21.field2598 += var16;
                var21.field2593 += var17;
                var21.field2594 += var18;
                var21.field2597++;
                class222 var22 = this.field2273[var5];
                var22.field2598 += var16;
                var22.field2593 += var17;
                var22.field2594 += var18;
                var22.field2597++;
            } else if (var19 == 1) {
                if (this.field2283 == null) {
                    this.field2283 = new class215[this.field2252];
                }
                class215 var23 = this.field2283[var2] = new class215();
                var23.field2449 = var16;
                var23.field2446 = var17;
                var23.field2450 = var18;
            }
        }
    }

    @ObfuscatedName("gk.c()V")
    public void method3676() {
        this.field2273 = null;
        this.field2274 = null;
        this.field2283 = null;
        this.field2269 = false;
    }

    @ObfuscatedName("gk.f()V")
    public void method3733() {
        if (this.field2269) {
            return;
        }
        this.field2444 = 0;
        this.field2278 = 0;
        this.field2279 = 999999;
        this.field2276 = -999999;
        this.field2281 = -99999;
        this.field2268 = 99999;
        for (int var1 = 0; var1 < this.field2272; var1++) {
            int var2 = this.field2249[var1];
            int var3 = this.field2250[var1];
            int var4 = this.field2251[var1];
            if (var2 < this.field2279) {
                this.field2279 = var2;
            }
            if (var2 > this.field2276) {
                this.field2276 = var2;
            }
            if (var4 < this.field2268) {
                this.field2268 = var4;
            }
            if (var4 > this.field2281) {
                this.field2281 = var4;
            }
            if (-var3 > this.field2444) {
                this.field2444 = -var3;
            }
            if (var3 > this.field2278) {
                this.field2278 = var3;
            }
        }
        this.field2269 = true;
    }

    @ObfuscatedName("gk.h(Lgk;Lgk;IIIZ)V")
    public static void method3678(class206 arg0, class206 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method3733();
        arg0.method3675();
        arg1.method3733();
        arg1.method3675();
        field2270++;
        int var6 = 0;
        int[] var7 = arg1.field2249;
        int var8 = arg1.field2272;
        for (int var9 = 0; var9 < arg0.field2272; var9++) {
            class222 var10 = arg0.field2273[var9];
            if (var10.field2597 != 0) {
                int var11 = arg0.field2250[var9] - arg3;
                if (var11 <= arg1.field2278) {
                    int var12 = arg0.field2249[var9] - arg2;
                    if (var12 >= arg1.field2279 && var12 <= arg1.field2276) {
                        int var13 = arg0.field2251[var9] - arg4;
                        if (var13 >= arg1.field2268 && var13 <= arg1.field2281) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class222 var15 = arg1.field2273[var14];
                                if (var7[var14] == var12 && arg1.field2251[var14] == var13 && arg1.field2250[var14] == var11 && var15.field2597 != 0) {
                                    if (arg0.field2274 == null) {
                                        arg0.field2274 = new class222[arg0.field2272];
                                    }
                                    if (arg1.field2274 == null) {
                                        arg1.field2274 = new class222[var8];
                                    }
                                    class222 var16 = arg0.field2274[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field2274[var9] = new class222(var10);
                                    }
                                    class222 var17 = arg1.field2274[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field2274[var14] = new class222(var15);
                                    }
                                    var16.field2598 += var15.field2598;
                                    var16.field2593 += var15.field2593;
                                    var16.field2594 += var15.field2594;
                                    var16.field2597 += var15.field2597;
                                    var17.field2598 += var10.field2598;
                                    var17.field2593 += var10.field2593;
                                    var17.field2594 += var10.field2594;
                                    var17.field2597 += var10.field2597;
                                    var6++;
                                    field2256[var9] = field2270;
                                    field2284[var14] = field2270;
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
        for (int var18 = 0; var18 < arg0.field2252; var18++) {
            if (field2256[arg0.field2253[var18]] == field2270 && field2256[arg0.field2254[var18]] == field2270 && field2256[arg0.field2255[var18]] == field2270) {
                if (arg0.field2259 == null) {
                    arg0.field2259 = new byte[arg0.field2252];
                }
                arg0.field2259[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field2252; var19++) {
            if (field2284[arg1.field2253[var19]] == field2270 && field2284[arg1.field2254[var19]] == field2270 && field2284[arg1.field2255[var19]] == field2270) {
                if (arg1.field2259 == null) {
                    arg1.field2259 = new byte[arg1.field2252];
                }
                arg1.field2259[var19] = 2;
            }
        }
    }

    @ObfuscatedName("gk.v(IIIII)Lhl;")
    public final class220 method3679(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method3675();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class220 var8 = new class220();
        var8.field2521 = new int[this.field2252];
        var8.field2563 = new int[this.field2252];
        var8.field2556 = new int[this.field2252];
        if (this.field2263 > 0 && this.field2262 != null) {
            int[] var9 = new int[this.field2263];
            for (int var10 = 0; var10 < this.field2252; var10++) {
                if (this.field2262[var10] != -1) {
                    var9[this.field2262[var10] & 0xFF]++;
                }
            }
            var8.field2523 = 0;
            for (int var11 = 0; var11 < this.field2263; var11++) {
                if (var9[var11] > 0 && this.field2258[var11] == 0) {
                    var8.field2523++;
                }
            }
            var8.field2530 = new int[var8.field2523];
            var8.field2531 = new int[var8.field2523];
            var8.field2539 = new int[var8.field2523];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field2263; var13++) {
                if (var9[var13] > 0 && this.field2258[var13] == 0) {
                    var8.field2530[var12] = this.field2265[var13] & 0xFFFF;
                    var8.field2531[var12] = this.field2266[var13] & 0xFFFF;
                    var8.field2539[var12] = this.field2267[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field2567 = new byte[this.field2252];
            for (int var14 = 0; var14 < this.field2252; var14++) {
                if (this.field2262[var14] == -1) {
                    var8.field2567[var14] = -1;
                } else {
                    var8.field2567[var14] = (byte) var9[this.field2262[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field2252; var15++) {
            byte var16;
            if (this.field2259 == null) {
                var16 = 0;
            } else {
                var16 = this.field2259[var15];
            }
            byte var17;
            if (this.field2277 == null) {
                var17 = 0;
            } else {
                var17 = this.field2277[var15];
            }
            short var18;
            if (this.field2261 == null) {
                var18 = -1;
            } else {
                var18 = this.field2261[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field2260[var15] & 0xFFFF;
                    class222 var20;
                    if (this.field2274 == null || this.field2274[this.field2253[var15]] == null) {
                        var20 = this.field2273[this.field2253[var15]];
                    } else {
                        var20 = this.field2274[this.field2253[var15]];
                    }
                    int var21 = (var20.field2594 * arg4 + var20.field2598 * arg2 + var20.field2593 * arg3) / (var20.field2597 * var7) + arg0;
                    var8.field2521[var15] = method3680(var19, var21);
                    class222 var22;
                    if (this.field2274 == null || this.field2274[this.field2254[var15]] == null) {
                        var22 = this.field2273[this.field2254[var15]];
                    } else {
                        var22 = this.field2274[this.field2254[var15]];
                    }
                    int var23 = (var22.field2594 * arg4 + var22.field2598 * arg2 + var22.field2593 * arg3) / (var22.field2597 * var7) + arg0;
                    var8.field2563[var15] = method3680(var19, var23);
                    class222 var24;
                    if (this.field2274 == null || this.field2274[this.field2255[var15]] == null) {
                        var24 = this.field2273[this.field2255[var15]];
                    } else {
                        var24 = this.field2274[this.field2255[var15]];
                    }
                    int var25 = (var24.field2594 * arg4 + var24.field2598 * arg2 + var24.field2593 * arg3) / (var24.field2597 * var7) + arg0;
                    var8.field2556[var15] = method3680(var19, var25);
                } else if (var16 == 1) {
                    class215 var26 = this.field2283[var15];
                    int var27 = (var26.field2450 * arg4 + var26.field2449 * arg2 + var26.field2446 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field2521[var15] = method3680(this.field2260[var15] & 0xFFFF, var27);
                    var8.field2556[var15] = -1;
                } else if (var16 == 3) {
                    var8.field2521[var15] = 128;
                    var8.field2556[var15] = -1;
                } else {
                    var8.field2556[var15] = -2;
                }
            } else if (var16 == 0) {
                class222 var28;
                if (this.field2274 == null || this.field2274[this.field2253[var15]] == null) {
                    var28 = this.field2273[this.field2253[var15]];
                } else {
                    var28 = this.field2274[this.field2253[var15]];
                }
                int var29 = (var28.field2594 * arg4 + var28.field2598 * arg2 + var28.field2593 * arg3) / (var28.field2597 * var7) + arg0;
                var8.field2521[var15] = method3681(var29);
                class222 var30;
                if (this.field2274 == null || this.field2274[this.field2254[var15]] == null) {
                    var30 = this.field2273[this.field2254[var15]];
                } else {
                    var30 = this.field2274[this.field2254[var15]];
                }
                int var31 = (var30.field2594 * arg4 + var30.field2598 * arg2 + var30.field2593 * arg3) / (var30.field2597 * var7) + arg0;
                var8.field2563[var15] = method3681(var31);
                class222 var32;
                if (this.field2274 == null || this.field2274[this.field2255[var15]] == null) {
                    var32 = this.field2273[this.field2255[var15]];
                } else {
                    var32 = this.field2274[this.field2255[var15]];
                }
                int var33 = (var32.field2594 * arg4 + var32.field2598 * arg2 + var32.field2593 * arg3) / (var32.field2597 * var7) + arg0;
                var8.field2556[var15] = method3681(var33);
            } else if (var16 == 1) {
                class215 var34 = this.field2283[var15];
                int var35 = (var34.field2450 * arg4 + var34.field2449 * arg2 + var34.field2446 * arg3) / (var7 / 2 + var7) + arg0;
                var8.field2521[var15] = method3681(var35);
                var8.field2556[var15] = -1;
            } else {
                var8.field2556[var15] = -2;
            }
        }
        this.method3695();
        var8.field2513 = this.field2272;
        var8.field2514 = this.field2249;
        var8.field2515 = this.field2250;
        var8.field2516 = this.field2251;
        var8.field2517 = this.field2252;
        var8.field2518 = this.field2253;
        var8.field2519 = this.field2254;
        var8.field2520 = this.field2255;
        var8.field2524 = this.field2257;
        var8.field2525 = this.field2277;
        var8.field2528 = this.field2287;
        var8.field2533 = this.field2285;
        var8.field2534 = this.field2264;
        var8.field2527 = this.field2261;
        return var8;
    }

    @ObfuscatedName("gk.ag(II)I")
    public static final int method3680(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("gk.ae(I)I")
    public static final int method3681(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
