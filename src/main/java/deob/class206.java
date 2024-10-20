package deob;

@ObfuscatedName("gi")
public class class206 extends class214 {

    @ObfuscatedName("gi.l")
    public int field2249 = 0;

    @ObfuscatedName("gi.q")
    public int[] field2272;

    @ObfuscatedName("gi.f")
    public int[] field2246;

    @ObfuscatedName("gi.j")
    public int[] field2247;

    @ObfuscatedName("gi.m")
    public int field2248 = 0;

    @ObfuscatedName("gi.k")
    public int[] field2277;

    @ObfuscatedName("gi.t")
    public int[] field2261;

    @ObfuscatedName("gi.a")
    public int[] field2251;

    @ObfuscatedName("gi.e")
    public byte[] field2252;

    @ObfuscatedName("gi.i")
    public byte[] field2253;

    @ObfuscatedName("gi.y")
    public byte[] field2244;

    @ObfuscatedName("gi.w")
    public byte[] field2270;

    @ObfuscatedName("gi.g")
    public short[] field2256;

    @ObfuscatedName("gi.v")
    public short[] field2257;

    @ObfuscatedName("gi.s")
    public byte field2258 = 0;

    @ObfuscatedName("gi.c")
    public int field2260;

    @ObfuscatedName("gi.b")
    public byte[] field2259;

    @ObfuscatedName("gi.x")
    public short[] field2266;

    @ObfuscatedName("gi.p")
    public short[] field2262;

    @ObfuscatedName("gi.z")
    public short[] field2263;

    @ObfuscatedName("gi.h")
    public int[] field2282;

    @ObfuscatedName("gi.o")
    public int[] field2265;

    @ObfuscatedName("gi.r")
    public int[][] field2264;

    @ObfuscatedName("gi.n")
    public int[][] field2267;

    @ObfuscatedName("gi.u")
    public class215[] field2268;

    @ObfuscatedName("gi.d")
    public class222[] field2269;

    @ObfuscatedName("gi.ab")
    public class222[] field2279;

    @ObfuscatedName("gi.ad")
    public short field2271;

    @ObfuscatedName("gi.as")
    public short field2250;

    @ObfuscatedName("gi.ak")
    public boolean field2273 = false;

    @ObfuscatedName("gi.ah")
    public int field2274;

    @ObfuscatedName("gi.ay")
    public int field2275;

    @ObfuscatedName("gi.al")
    public int field2276;

    @ObfuscatedName("gi.ao")
    public int field2245;

    @ObfuscatedName("gi.au")
    public int field2278;

    @ObfuscatedName("gi.aa")
    public static int[] field2254 = new int[10000];

    @ObfuscatedName("gi.ag")
    public static int[] field2255 = new int[10000];

    @ObfuscatedName("gi.aq")
    public static int field2281 = 0;

    @ObfuscatedName("gi.ar")
    public static int[] field2280 = class211.field2371;

    @ObfuscatedName("gi.ac")
    public static int[] field2283 = class211.field2359;

    public class206() {
    }

    @ObfuscatedName("gi.l(Lkl;II)Lgi;")
    public static class206 method3692(class290 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method4756(arg1, arg2);
        return var3 == null ? null : new class206(var3);
    }

    public class206(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method3651(arg0);
        } else {
            this.method3652(arg0);
        }
    }

    @ObfuscatedName("gi.f([B)V")
    public void method3651(byte[] arg0) {
        class401 var2 = new class401(arg0);
        class401 var3 = new class401(arg0);
        class401 var4 = new class401(arg0);
        class401 var5 = new class401(arg0);
        class401 var6 = new class401(arg0);
        class401 var7 = new class401(arg0);
        class401 var8 = new class401(arg0);
        var2.field4292 = arg0.length - 23;
        int var9 = var2.method6284();
        int var10 = var2.method6284();
        int var11 = var2.method6272();
        int var12 = var2.method6272();
        int var13 = var2.method6272();
        int var14 = var2.method6272();
        int var15 = var2.method6272();
        int var16 = var2.method6272();
        int var17 = var2.method6272();
        int var18 = var2.method6284();
        int var19 = var2.method6284();
        int var20 = var2.method6284();
        int var21 = var2.method6284();
        int var22 = var2.method6284();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field2259 = new byte[var11];
            var2.field4292 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field2259[var26] = var2.method6273();
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
        this.field2249 = var9;
        this.field2248 = var10;
        this.field2260 = var11;
        this.field2272 = new int[var9];
        this.field2246 = new int[var9];
        this.field2247 = new int[var9];
        this.field2277 = new int[var10];
        this.field2261 = new int[var10];
        this.field2251 = new int[var10];
        if (var17 == 1) {
            this.field2282 = new int[var9];
        }
        if (var12 == 1) {
            this.field2252 = new byte[var10];
        }
        if (var13 == 255) {
            this.field2253 = new byte[var10];
        } else {
            this.field2258 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2244 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2265 = new int[var10];
        }
        if (var16 == 1) {
            this.field2257 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field2270 = new byte[var10];
        }
        this.field2256 = new short[var10];
        if (var11 > 0) {
            this.field2266 = new short[var11];
            this.field2262 = new short[var11];
            this.field2263 = new short[var11];
        }
        var2.field4292 = var11;
        var3.field4292 = var44;
        var4.field4292 = var46;
        var5.field4292 = var48;
        var6.field4292 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method6272();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method6285();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method6285();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method6285();
            }
            this.field2272[var67] = var64 + var69;
            this.field2246[var67] = var65 + var70;
            this.field2247[var67] = var66 + var71;
            var64 = this.field2272[var67];
            var65 = this.field2246[var67];
            var66 = this.field2247[var67];
            if (var17 == 1) {
                this.field2282[var67] = var6.method6272();
            }
        }
        var2.field4292 = var42;
        var3.field4292 = var31;
        var4.field4292 = var34;
        var5.field4292 = var37;
        var6.field4292 = var35;
        var7.field4292 = var40;
        var8.field4292 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field2256[var72] = (short) var2.method6284();
            if (var12 == 1) {
                this.field2252[var72] = var3.method6273();
            }
            if (var13 == 255) {
                this.field2253[var72] = var4.method6273();
            }
            if (var14 == 1) {
                this.field2244[var72] = var5.method6273();
            }
            if (var15 == 1) {
                this.field2265[var72] = var6.method6272();
            }
            if (var16 == 1) {
                this.field2257[var72] = (short) (var7.method6284() - 1);
            }
            if (this.field2270 != null && this.field2257[var72] != -1) {
                this.field2270[var72] = (byte) (var8.method6272() - 1);
            }
        }
        var2.field4292 = var33;
        var3.field4292 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method6272();
            if (var78 == 1) {
                var73 = var2.method6285() + var76;
                var74 = var2.method6285() + var73;
                var75 = var2.method6285() + var74;
                var76 = var75;
                this.field2277[var77] = var73;
                this.field2261[var77] = var74;
                this.field2251[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method6285() + var76;
                var76 = var75;
                this.field2277[var77] = var73;
                this.field2261[var77] = var74;
                this.field2251[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method6285() + var76;
                var76 = var75;
                this.field2277[var77] = var73;
                this.field2261[var77] = var74;
                this.field2251[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method6285() + var76;
                var76 = var75;
                this.field2277[var77] = var73;
                this.field2261[var77] = var81;
                this.field2251[var77] = var75;
            }
        }
        var2.field4292 = var50;
        var3.field4292 = var52;
        var4.field4292 = var54;
        var5.field4292 = var56;
        var6.field4292 = var58;
        var7.field4292 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field2259[var82] & 0xFF;
            if (var83 == 0) {
                this.field2266[var82] = (short) var2.method6284();
                this.field2262[var82] = (short) var2.method6284();
                this.field2263[var82] = (short) var2.method6284();
            }
        }
        var2.field4292 = var62;
        int var84 = var2.method6272();
        if (var84 == 0) {
            return;
        }
        new class224();
        var2.method6284();
        var2.method6284();
        var2.method6284();
        var2.method6277();
    }

    @ObfuscatedName("gi.j([B)V")
    public void method3652(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class401 var4 = new class401(arg0);
        class401 var5 = new class401(arg0);
        class401 var6 = new class401(arg0);
        class401 var7 = new class401(arg0);
        class401 var8 = new class401(arg0);
        var4.field4292 = arg0.length - 18;
        int var9 = var4.method6284();
        int var10 = var4.method6284();
        int var11 = var4.method6272();
        int var12 = var4.method6272();
        int var13 = var4.method6272();
        int var14 = var4.method6272();
        int var15 = var4.method6272();
        int var16 = var4.method6272();
        int var17 = var4.method6284();
        int var18 = var4.method6284();
        int var19 = var4.method6284();
        int var20 = var4.method6284();
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
        this.field2249 = var9;
        this.field2248 = var10;
        this.field2260 = var11;
        this.field2272 = new int[var9];
        this.field2246 = new int[var9];
        this.field2247 = new int[var9];
        this.field2277 = new int[var10];
        this.field2261 = new int[var10];
        this.field2251 = new int[var10];
        if (var11 > 0) {
            this.field2259 = new byte[var11];
            this.field2266 = new short[var11];
            this.field2262 = new short[var11];
            this.field2263 = new short[var11];
        }
        if (var16 == 1) {
            this.field2282 = new int[var9];
        }
        if (var12 == 1) {
            this.field2252 = new byte[var10];
            this.field2270 = new byte[var10];
            this.field2257 = new short[var10];
        }
        if (var13 == 255) {
            this.field2253 = new byte[var10];
        } else {
            this.field2258 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2244 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2265 = new int[var10];
        }
        this.field2256 = new short[var10];
        var4.field4292 = var21;
        var5.field4292 = var36;
        var6.field4292 = var38;
        var7.field4292 = var40;
        var8.field4292 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method6272();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method6285();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method6285();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method6285();
            }
            this.field2272[var46] = var43 + var48;
            this.field2246[var46] = var44 + var49;
            this.field2247[var46] = var45 + var50;
            var43 = this.field2272[var46];
            var44 = this.field2246[var46];
            var45 = this.field2247[var46];
            if (var16 == 1) {
                this.field2282[var46] = var8.method6272();
            }
        }
        var4.field4292 = var32;
        var5.field4292 = var28;
        var6.field4292 = var26;
        var7.field4292 = var30;
        var8.field4292 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field2256[var51] = (short) var4.method6284();
            if (var12 == 1) {
                int var52 = var5.method6272();
                if ((var52 & 0x1) == 1) {
                    this.field2252[var51] = 1;
                    var2 = true;
                } else {
                    this.field2252[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field2270[var51] = (byte) (var52 >> 2);
                    this.field2257[var51] = this.field2256[var51];
                    this.field2256[var51] = 127;
                    if (this.field2257[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field2270[var51] = -1;
                    this.field2257[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field2253[var51] = var6.method6273();
            }
            if (var14 == 1) {
                this.field2244[var51] = var7.method6273();
            }
            if (var15 == 1) {
                this.field2265[var51] = var8.method6272();
            }
        }
        var4.field4292 = var25;
        var5.field4292 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method6272();
            if (var58 == 1) {
                var53 = var4.method6285() + var56;
                var54 = var4.method6285() + var53;
                var55 = var4.method6285() + var54;
                var56 = var55;
                this.field2277[var57] = var53;
                this.field2261[var57] = var54;
                this.field2251[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method6285() + var56;
                var56 = var55;
                this.field2277[var57] = var53;
                this.field2261[var57] = var54;
                this.field2251[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method6285() + var56;
                var56 = var55;
                this.field2277[var57] = var53;
                this.field2261[var57] = var54;
                this.field2251[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method6285() + var56;
                var56 = var55;
                this.field2277[var57] = var53;
                this.field2261[var57] = var61;
                this.field2251[var57] = var55;
            }
        }
        var4.field4292 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field2259[var62] = 0;
            this.field2266[var62] = (short) var4.method6284();
            this.field2262[var62] = (short) var4.method6284();
            this.field2263[var62] = (short) var4.method6284();
        }
        if (this.field2270 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field2270[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field2266[var65] & 0xFFFF) == this.field2277[var64] && (this.field2262[var65] & 0xFFFF) == this.field2261[var64] && (this.field2263[var65] & 0xFFFF) == this.field2251[var64]) {
                        this.field2270[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field2270 = null;
            }
        }
        if (!var3) {
            this.field2257 = null;
        }
        if (!var2) {
            this.field2252 = null;
        }
    }

    public class206(class206[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field2249 = 0;
        this.field2248 = 0;
        this.field2260 = 0;
        this.field2258 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class206 var10 = arg0[var9];
            if (var10 != null) {
                this.field2249 += var10.field2249;
                this.field2248 += var10.field2248;
                this.field2260 += var10.field2260;
                if (var10.field2253 == null) {
                    if (this.field2258 == -1) {
                        this.field2258 = var10.field2258;
                    }
                    if (this.field2258 != var10.field2258) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field2252 != null;
                var5 |= var10.field2244 != null;
                var6 |= var10.field2265 != null;
                var7 |= var10.field2257 != null;
                var8 |= var10.field2270 != null;
            }
        }
        this.field2272 = new int[this.field2249];
        this.field2246 = new int[this.field2249];
        this.field2247 = new int[this.field2249];
        this.field2282 = new int[this.field2249];
        this.field2277 = new int[this.field2248];
        this.field2261 = new int[this.field2248];
        this.field2251 = new int[this.field2248];
        if (var3) {
            this.field2252 = new byte[this.field2248];
        }
        if (var4) {
            this.field2253 = new byte[this.field2248];
        }
        if (var5) {
            this.field2244 = new byte[this.field2248];
        }
        if (var6) {
            this.field2265 = new int[this.field2248];
        }
        if (var7) {
            this.field2257 = new short[this.field2248];
        }
        if (var8) {
            this.field2270 = new byte[this.field2248];
        }
        this.field2256 = new short[this.field2248];
        if (this.field2260 > 0) {
            this.field2259 = new byte[this.field2260];
            this.field2266 = new short[this.field2260];
            this.field2262 = new short[this.field2260];
            this.field2263 = new short[this.field2260];
        }
        this.field2249 = 0;
        this.field2248 = 0;
        this.field2260 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class206 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field2248; var13++) {
                    if (var3 && var12.field2252 != null) {
                        this.field2252[this.field2248] = var12.field2252[var13];
                    }
                    if (var4) {
                        if (var12.field2253 == null) {
                            this.field2253[this.field2248] = var12.field2258;
                        } else {
                            this.field2253[this.field2248] = var12.field2253[var13];
                        }
                    }
                    if (var5 && var12.field2244 != null) {
                        this.field2244[this.field2248] = var12.field2244[var13];
                    }
                    if (var6 && var12.field2265 != null) {
                        this.field2265[this.field2248] = var12.field2265[var13];
                    }
                    if (var7) {
                        if (var12.field2257 == null) {
                            this.field2257[this.field2248] = -1;
                        } else {
                            this.field2257[this.field2248] = var12.field2257[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field2270 == null || var12.field2270[var13] == -1) {
                            this.field2270[this.field2248] = -1;
                        } else {
                            this.field2270[this.field2248] = (byte) (var12.field2270[var13] + this.field2260);
                        }
                    }
                    this.field2256[this.field2248] = var12.field2256[var13];
                    this.field2277[this.field2248] = this.method3654(var12, var12.field2277[var13]);
                    this.field2261[this.field2248] = this.method3654(var12, var12.field2261[var13]);
                    this.field2251[this.field2248] = this.method3654(var12, var12.field2251[var13]);
                    this.field2248++;
                }
                for (int var14 = 0; var14 < var12.field2260; var14++) {
                    byte var15 = this.field2259[this.field2260] = var12.field2259[var14];
                    if (var15 == 0) {
                        this.field2266[this.field2260] = (short) this.method3654(var12, var12.field2266[var14]);
                        this.field2262[this.field2260] = (short) this.method3654(var12, var12.field2262[var14]);
                        this.field2263[this.field2260] = (short) this.method3654(var12, var12.field2263[var14]);
                    }
                    this.field2260++;
                }
            }
        }
    }

    @ObfuscatedName("gi.m(Lgi;I)I")
    public final int method3654(class206 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field2272[arg1];
        int var5 = arg0.field2246[arg1];
        int var6 = arg0.field2247[arg1];
        for (int var7 = 0; var7 < this.field2249; var7++) {
            if (this.field2272[var7] == var4 && this.field2246[var7] == var5 && this.field2247[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field2272[this.field2249] = var4;
            this.field2246[this.field2249] = var5;
            this.field2247[this.field2249] = var6;
            if (arg0.field2282 != null) {
                this.field2282[this.field2249] = arg0.field2282[arg1];
            }
            var3 = this.field2249++;
        }
        return var3;
    }

    public class206(class206 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field2249 = arg0.field2249;
        this.field2248 = arg0.field2248;
        this.field2260 = arg0.field2260;
        if (arg1) {
            this.field2272 = arg0.field2272;
            this.field2246 = arg0.field2246;
            this.field2247 = arg0.field2247;
        } else {
            this.field2272 = new int[this.field2249];
            this.field2246 = new int[this.field2249];
            this.field2247 = new int[this.field2249];
            for (int var6 = 0; var6 < this.field2249; var6++) {
                this.field2272[var6] = arg0.field2272[var6];
                this.field2246[var6] = arg0.field2246[var6];
                this.field2247[var6] = arg0.field2247[var6];
            }
        }
        if (arg2) {
            this.field2256 = arg0.field2256;
        } else {
            this.field2256 = new short[this.field2248];
            for (int var7 = 0; var7 < this.field2248; var7++) {
                this.field2256[var7] = arg0.field2256[var7];
            }
        }
        if (arg3 || arg0.field2257 == null) {
            this.field2257 = arg0.field2257;
        } else {
            this.field2257 = new short[this.field2248];
            for (int var8 = 0; var8 < this.field2248; var8++) {
                this.field2257[var8] = arg0.field2257[var8];
            }
        }
        if (arg4) {
            this.field2244 = arg0.field2244;
        } else {
            this.field2244 = new byte[this.field2248];
            if (arg0.field2244 == null) {
                for (int var9 = 0; var9 < this.field2248; var9++) {
                    this.field2244[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field2248; var10++) {
                    this.field2244[var10] = arg0.field2244[var10];
                }
            }
        }
        this.field2277 = arg0.field2277;
        this.field2261 = arg0.field2261;
        this.field2251 = arg0.field2251;
        this.field2252 = arg0.field2252;
        this.field2253 = arg0.field2253;
        this.field2270 = arg0.field2270;
        this.field2258 = arg0.field2258;
        this.field2259 = arg0.field2259;
        this.field2266 = arg0.field2266;
        this.field2262 = arg0.field2262;
        this.field2263 = arg0.field2263;
        this.field2282 = arg0.field2282;
        this.field2265 = arg0.field2265;
        this.field2264 = arg0.field2264;
        this.field2267 = arg0.field2267;
        this.field2269 = arg0.field2269;
        this.field2268 = arg0.field2268;
        this.field2279 = arg0.field2279;
        this.field2271 = arg0.field2271;
        this.field2250 = arg0.field2250;
    }

    @ObfuscatedName("gi.k()Lgi;")
    public class206 method3655() {
        class206 var1 = new class206();
        if (this.field2252 != null) {
            var1.field2252 = new byte[this.field2248];
            for (int var2 = 0; var2 < this.field2248; var2++) {
                var1.field2252[var2] = this.field2252[var2];
            }
        }
        var1.field2249 = this.field2249;
        var1.field2248 = this.field2248;
        var1.field2260 = this.field2260;
        var1.field2272 = this.field2272;
        var1.field2246 = this.field2246;
        var1.field2247 = this.field2247;
        var1.field2277 = this.field2277;
        var1.field2261 = this.field2261;
        var1.field2251 = this.field2251;
        var1.field2253 = this.field2253;
        var1.field2244 = this.field2244;
        var1.field2270 = this.field2270;
        var1.field2256 = this.field2256;
        var1.field2257 = this.field2257;
        var1.field2258 = this.field2258;
        var1.field2259 = this.field2259;
        var1.field2266 = this.field2266;
        var1.field2262 = this.field2262;
        var1.field2263 = this.field2263;
        var1.field2282 = this.field2282;
        var1.field2265 = this.field2265;
        var1.field2264 = this.field2264;
        var1.field2267 = this.field2267;
        var1.field2269 = this.field2269;
        var1.field2268 = this.field2268;
        var1.field2271 = this.field2271;
        var1.field2250 = this.field2250;
        return var1;
    }

    @ObfuscatedName("gi.a([[IIIIZI)Lgi;")
    public class206 method3710(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method3672();
        int var7 = this.field2275 + arg1;
        int var8 = this.field2276 + arg1;
        int var9 = this.field2278 + arg3;
        int var10 = this.field2245 + arg3;
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
            var15.field2249 = this.field2249;
            var15.field2248 = this.field2248;
            var15.field2260 = this.field2260;
            var15.field2272 = this.field2272;
            var15.field2247 = this.field2247;
            var15.field2277 = this.field2277;
            var15.field2261 = this.field2261;
            var15.field2251 = this.field2251;
            var15.field2252 = this.field2252;
            var15.field2253 = this.field2253;
            var15.field2244 = this.field2244;
            var15.field2270 = this.field2270;
            var15.field2256 = this.field2256;
            var15.field2257 = this.field2257;
            var15.field2258 = this.field2258;
            var15.field2259 = this.field2259;
            var15.field2266 = this.field2266;
            var15.field2262 = this.field2262;
            var15.field2263 = this.field2263;
            var15.field2282 = this.field2282;
            var15.field2265 = this.field2265;
            var15.field2264 = this.field2264;
            var15.field2267 = this.field2267;
            var15.field2271 = this.field2271;
            var15.field2250 = this.field2250;
            var15.field2246 = new int[var15.field2249];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field2249; var16++) {
                int var17 = this.field2272[var16] + arg1;
                int var18 = this.field2247[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field2246[var16] = this.field2246[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field2249; var26++) {
                int var27 = (-this.field2246[var26] << 16) / this.field2449;
                if (var27 < arg5) {
                    int var28 = this.field2272[var26] + arg1;
                    int var29 = this.field2247[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field2246[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field2246[var26];
                }
            }
        }
        var15.method3668();
        return var15;
    }

    @ObfuscatedName("gi.e()V")
    public void method3657() {
        int var10002;
        if (this.field2282 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field2249; var3++) {
                int var4 = this.field2282[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field2264 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field2264[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field2249) {
                int var7 = this.field2282[var6];
                this.field2264[var7][var1[var7]++] = var6++;
            }
            this.field2282 = null;
        }
        if (this.field2265 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field2248; var10++) {
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
        while (var13 < this.field2248) {
            int var14 = this.field2265[var13];
            this.field2267[var14][var8[var14]++] = var13++;
        }
        this.field2265 = null;
    }

    @ObfuscatedName("gi.i()V")
    public void method3658() {
        for (int var1 = 0; var1 < this.field2249; var1++) {
            int var2 = this.field2272[var1];
            this.field2272[var1] = this.field2247[var1];
            this.field2247[var1] = -var2;
        }
        this.method3668();
    }

    @ObfuscatedName("gi.y()V")
    public void method3659() {
        for (int var1 = 0; var1 < this.field2249; var1++) {
            this.field2272[var1] = -this.field2272[var1];
            this.field2247[var1] = -this.field2247[var1];
        }
        this.method3668();
    }

    @ObfuscatedName("gi.w()V")
    public void method3660() {
        for (int var1 = 0; var1 < this.field2249; var1++) {
            int var2 = this.field2247[var1];
            this.field2247[var1] = this.field2272[var1];
            this.field2272[var1] = -var2;
        }
        this.method3668();
    }

    @ObfuscatedName("gi.g(I)V")
    public void method3661(int arg0) {
        int var2 = field2280[arg0];
        int var3 = field2283[arg0];
        for (int var4 = 0; var4 < this.field2249; var4++) {
            int var5 = this.field2272[var4] * var3 + this.field2247[var4] * var2 >> 16;
            this.field2247[var4] = this.field2247[var4] * var3 - this.field2272[var4] * var2 >> 16;
            this.field2272[var4] = var5;
        }
        this.method3668();
    }

    @ObfuscatedName("gi.v(III)V")
    public void method3662(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2249; var4++) {
            this.field2272[var4] += arg0;
            this.field2246[var4] += arg1;
            this.field2247[var4] += arg2;
        }
        this.method3668();
    }

    @ObfuscatedName("gi.s(SS)V")
    public void method3663(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2248; var3++) {
            if (this.field2256[var3] == arg0) {
                this.field2256[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("gi.c(SS)V")
    public void method3664(short arg0, short arg1) {
        if (this.field2257 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field2248; var3++) {
            if (this.field2257[var3] == arg0) {
                this.field2257[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("gi.b()V")
    public void method3665() {
        for (int var1 = 0; var1 < this.field2249; var1++) {
            this.field2247[var1] = -this.field2247[var1];
        }
        for (int var2 = 0; var2 < this.field2248; var2++) {
            int var3 = this.field2277[var2];
            this.field2277[var2] = this.field2251[var2];
            this.field2251[var2] = var3;
        }
        this.method3668();
    }

    @ObfuscatedName("gi.x(III)V")
    public void method3666(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2249; var4++) {
            this.field2272[var4] = this.field2272[var4] * arg0 / 128;
            this.field2246[var4] = this.field2246[var4] * arg1 / 128;
            this.field2247[var4] = this.field2247[var4] * arg2 / 128;
        }
        this.method3668();
    }

    @ObfuscatedName("gi.p()V")
    public void method3667() {
        if (this.field2269 != null) {
            return;
        }
        this.field2269 = new class222[this.field2249];
        for (int var1 = 0; var1 < this.field2249; var1++) {
            this.field2269[var1] = new class222();
        }
        for (int var2 = 0; var2 < this.field2248; var2++) {
            int var3 = this.field2277[var2];
            int var4 = this.field2261[var2];
            int var5 = this.field2251[var2];
            int var6 = this.field2272[var4] - this.field2272[var3];
            int var7 = this.field2246[var4] - this.field2246[var3];
            int var8 = this.field2247[var4] - this.field2247[var3];
            int var9 = this.field2272[var5] - this.field2272[var3];
            int var10 = this.field2246[var5] - this.field2246[var3];
            int var11 = this.field2247[var5] - this.field2247[var3];
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
            if (this.field2252 == null) {
                var19 = 0;
            } else {
                var19 = this.field2252[var2];
            }
            if (var19 == 0) {
                class222 var20 = this.field2269[var3];
                var20.field2589 += var16;
                var20.field2588 += var17;
                var20.field2587 += var18;
                var20.field2590++;
                class222 var21 = this.field2269[var4];
                var21.field2589 += var16;
                var21.field2588 += var17;
                var21.field2587 += var18;
                var21.field2590++;
                class222 var22 = this.field2269[var5];
                var22.field2589 += var16;
                var22.field2588 += var17;
                var22.field2587 += var18;
                var22.field2590++;
            } else if (var19 == 1) {
                if (this.field2268 == null) {
                    this.field2268 = new class215[this.field2248];
                }
                class215 var23 = this.field2268[var2] = new class215();
                var23.field2451 = var16;
                var23.field2450 = var17;
                var23.field2452 = var18;
            }
        }
    }

    @ObfuscatedName("gi.z()V")
    public void method3668() {
        this.field2269 = null;
        this.field2279 = null;
        this.field2268 = null;
        this.field2273 = false;
    }

    @ObfuscatedName("gi.h()V")
    public void method3672() {
        if (this.field2273) {
            return;
        }
        this.field2449 = 0;
        this.field2274 = 0;
        this.field2275 = 999999;
        this.field2276 = -999999;
        this.field2245 = -99999;
        this.field2278 = 99999;
        for (int var1 = 0; var1 < this.field2249; var1++) {
            int var2 = this.field2272[var1];
            int var3 = this.field2246[var1];
            int var4 = this.field2247[var1];
            if (var2 < this.field2275) {
                this.field2275 = var2;
            }
            if (var2 > this.field2276) {
                this.field2276 = var2;
            }
            if (var4 < this.field2278) {
                this.field2278 = var4;
            }
            if (var4 > this.field2245) {
                this.field2245 = var4;
            }
            if (-var3 > this.field2449) {
                this.field2449 = -var3;
            }
            if (var3 > this.field2274) {
                this.field2274 = var3;
            }
        }
        this.field2273 = true;
    }

    @ObfuscatedName("gi.o(Lgi;Lgi;IIIZ)V")
    public static void method3670(class206 arg0, class206 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method3672();
        arg0.method3667();
        arg1.method3672();
        arg1.method3667();
        field2281++;
        int var6 = 0;
        int[] var7 = arg1.field2272;
        int var8 = arg1.field2249;
        for (int var9 = 0; var9 < arg0.field2249; var9++) {
            class222 var10 = arg0.field2269[var9];
            if (var10.field2590 != 0) {
                int var11 = arg0.field2246[var9] - arg3;
                if (var11 <= arg1.field2274) {
                    int var12 = arg0.field2272[var9] - arg2;
                    if (var12 >= arg1.field2275 && var12 <= arg1.field2276) {
                        int var13 = arg0.field2247[var9] - arg4;
                        if (var13 >= arg1.field2278 && var13 <= arg1.field2245) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class222 var15 = arg1.field2269[var14];
                                if (var7[var14] == var12 && arg1.field2247[var14] == var13 && arg1.field2246[var14] == var11 && var15.field2590 != 0) {
                                    if (arg0.field2279 == null) {
                                        arg0.field2279 = new class222[arg0.field2249];
                                    }
                                    if (arg1.field2279 == null) {
                                        arg1.field2279 = new class222[var8];
                                    }
                                    class222 var16 = arg0.field2279[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field2279[var9] = new class222(var10);
                                    }
                                    class222 var17 = arg1.field2279[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field2279[var14] = new class222(var15);
                                    }
                                    var16.field2589 += var15.field2589;
                                    var16.field2588 += var15.field2588;
                                    var16.field2587 += var15.field2587;
                                    var16.field2590 += var15.field2590;
                                    var17.field2589 += var10.field2589;
                                    var17.field2588 += var10.field2588;
                                    var17.field2587 += var10.field2587;
                                    var17.field2590 += var10.field2590;
                                    var6++;
                                    field2254[var9] = field2281;
                                    field2255[var14] = field2281;
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
        for (int var18 = 0; var18 < arg0.field2248; var18++) {
            if (field2254[arg0.field2277[var18]] == field2281 && field2254[arg0.field2261[var18]] == field2281 && field2254[arg0.field2251[var18]] == field2281) {
                if (arg0.field2252 == null) {
                    arg0.field2252 = new byte[arg0.field2248];
                }
                arg0.field2252[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field2248; var19++) {
            if (field2255[arg1.field2277[var19]] == field2281 && field2255[arg1.field2261[var19]] == field2281 && field2255[arg1.field2251[var19]] == field2281) {
                if (arg1.field2252 == null) {
                    arg1.field2252 = new byte[arg1.field2248];
                }
                arg1.field2252[var19] = 2;
            }
        }
    }

    @ObfuscatedName("gi.r(IIIII)Lhl;")
    public final class220 method3671(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method3667();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class220 var8 = new class220();
        var8.field2517 = new int[this.field2248];
        var8.field2518 = new int[this.field2248];
        var8.field2566 = new int[this.field2248];
        if (this.field2260 > 0 && this.field2270 != null) {
            int[] var9 = new int[this.field2260];
            for (int var10 = 0; var10 < this.field2248; var10++) {
                if (this.field2270[var10] != -1) {
                    var9[this.field2270[var10] & 0xFF]++;
                }
            }
            var8.field2571 = 0;
            for (int var11 = 0; var11 < this.field2260; var11++) {
                if (var9[var11] > 0 && this.field2259[var11] == 0) {
                    var8.field2571++;
                }
            }
            var8.field2526 = new int[var8.field2571];
            var8.field2527 = new int[var8.field2571];
            var8.field2528 = new int[var8.field2571];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field2260; var13++) {
                if (var9[var13] > 0 && this.field2259[var13] == 0) {
                    var8.field2526[var12] = this.field2266[var13] & 0xFFFF;
                    var8.field2527[var12] = this.field2262[var13] & 0xFFFF;
                    var8.field2528[var12] = this.field2263[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field2505 = new byte[this.field2248];
            for (int var14 = 0; var14 < this.field2248; var14++) {
                if (this.field2270[var14] == -1) {
                    var8.field2505[var14] = -1;
                } else {
                    var8.field2505[var14] = (byte) var9[this.field2270[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field2248; var15++) {
            byte var16;
            if (this.field2252 == null) {
                var16 = 0;
            } else {
                var16 = this.field2252[var15];
            }
            byte var17;
            if (this.field2244 == null) {
                var17 = 0;
            } else {
                var17 = this.field2244[var15];
            }
            short var18;
            if (this.field2257 == null) {
                var18 = -1;
            } else {
                var18 = this.field2257[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field2256[var15] & 0xFFFF;
                    class222 var20;
                    if (this.field2279 == null || this.field2279[this.field2277[var15]] == null) {
                        var20 = this.field2269[this.field2277[var15]];
                    } else {
                        var20 = this.field2279[this.field2277[var15]];
                    }
                    int var21 = (var20.field2587 * arg4 + var20.field2589 * arg2 + var20.field2588 * arg3) / (var20.field2590 * var7) + arg0;
                    var8.field2517[var15] = method3698(var19, var21);
                    class222 var22;
                    if (this.field2279 == null || this.field2279[this.field2261[var15]] == null) {
                        var22 = this.field2269[this.field2261[var15]];
                    } else {
                        var22 = this.field2279[this.field2261[var15]];
                    }
                    int var23 = (var22.field2587 * arg4 + var22.field2589 * arg2 + var22.field2588 * arg3) / (var22.field2590 * var7) + arg0;
                    var8.field2518[var15] = method3698(var19, var23);
                    class222 var24;
                    if (this.field2279 == null || this.field2279[this.field2251[var15]] == null) {
                        var24 = this.field2269[this.field2251[var15]];
                    } else {
                        var24 = this.field2279[this.field2251[var15]];
                    }
                    int var25 = (var24.field2587 * arg4 + var24.field2589 * arg2 + var24.field2588 * arg3) / (var24.field2590 * var7) + arg0;
                    var8.field2566[var15] = method3698(var19, var25);
                } else if (var16 == 1) {
                    class215 var26 = this.field2268[var15];
                    int var27 = (var26.field2452 * arg4 + var26.field2451 * arg2 + var26.field2450 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field2517[var15] = method3698(this.field2256[var15] & 0xFFFF, var27);
                    var8.field2566[var15] = -1;
                } else if (var16 == 3) {
                    var8.field2517[var15] = 128;
                    var8.field2566[var15] = -1;
                } else {
                    var8.field2566[var15] = -2;
                }
            } else if (var16 == 0) {
                class222 var28;
                if (this.field2279 == null || this.field2279[this.field2277[var15]] == null) {
                    var28 = this.field2269[this.field2277[var15]];
                } else {
                    var28 = this.field2279[this.field2277[var15]];
                }
                int var29 = (var28.field2587 * arg4 + var28.field2589 * arg2 + var28.field2588 * arg3) / (var28.field2590 * var7) + arg0;
                var8.field2517[var15] = method3673(var29);
                class222 var30;
                if (this.field2279 == null || this.field2279[this.field2261[var15]] == null) {
                    var30 = this.field2269[this.field2261[var15]];
                } else {
                    var30 = this.field2279[this.field2261[var15]];
                }
                int var31 = (var30.field2587 * arg4 + var30.field2589 * arg2 + var30.field2588 * arg3) / (var30.field2590 * var7) + arg0;
                var8.field2518[var15] = method3673(var31);
                class222 var32;
                if (this.field2279 == null || this.field2279[this.field2251[var15]] == null) {
                    var32 = this.field2269[this.field2251[var15]];
                } else {
                    var32 = this.field2279[this.field2251[var15]];
                }
                int var33 = (var32.field2587 * arg4 + var32.field2589 * arg2 + var32.field2588 * arg3) / (var32.field2590 * var7) + arg0;
                var8.field2566[var15] = method3673(var33);
            } else if (var16 == 1) {
                class215 var34 = this.field2268[var15];
                int var35 = (var34.field2452 * arg4 + var34.field2451 * arg2 + var34.field2450 * arg3) / (var7 / 2 + var7) + arg0;
                var8.field2517[var15] = method3673(var35);
                var8.field2566[var15] = -1;
            } else {
                var8.field2566[var15] = -2;
            }
        }
        this.method3657();
        var8.field2572 = this.field2249;
        var8.field2510 = this.field2272;
        var8.field2511 = this.field2246;
        var8.field2525 = this.field2247;
        var8.field2513 = this.field2248;
        var8.field2514 = this.field2277;
        var8.field2519 = this.field2261;
        var8.field2553 = this.field2251;
        var8.field2520 = this.field2253;
        var8.field2521 = this.field2244;
        var8.field2524 = this.field2258;
        var8.field2522 = this.field2264;
        var8.field2530 = this.field2267;
        var8.field2561 = this.field2257;
        return var8;
    }

    @ObfuscatedName("gi.n(II)I")
    public static final int method3698(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("gi.u(I)I")
    public static final int method3673(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
