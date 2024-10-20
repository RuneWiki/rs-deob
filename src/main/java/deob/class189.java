package deob;

@ObfuscatedName("gq")
public class class189 extends class198 {

    @ObfuscatedName("gq.e")
    public int field2194 = 0;

    @ObfuscatedName("gq.r")
    public int[] field2158;

    @ObfuscatedName("gq.o")
    public int[] field2159;

    @ObfuscatedName("gq.i")
    public int[] field2168;

    @ObfuscatedName("gq.w")
    public int field2161 = 0;

    @ObfuscatedName("gq.v")
    public int[] field2162;

    @ObfuscatedName("gq.a")
    public int[] field2166;

    @ObfuscatedName("gq.y")
    public int[] field2164;

    @ObfuscatedName("gq.u")
    public byte[] field2165;

    @ObfuscatedName("gq.h")
    public byte[] field2179;

    @ObfuscatedName("gq.q")
    public byte[] field2198;

    @ObfuscatedName("gq.x")
    public byte[] field2157;

    @ObfuscatedName("gq.p")
    public short[] field2169;

    @ObfuscatedName("gq.n")
    public short[] field2178;

    @ObfuscatedName("gq.m")
    public byte field2175 = 0;

    @ObfuscatedName("gq.d")
    public int field2172;

    @ObfuscatedName("gq.j")
    public byte[] field2173;

    @ObfuscatedName("gq.f")
    public short[] field2174;

    @ObfuscatedName("gq.g")
    public short[] field2163;

    @ObfuscatedName("gq.t")
    public short[] field2176;

    @ObfuscatedName("gq.k")
    public int[] field2170;

    @ObfuscatedName("gq.b")
    public int[] field2187;

    @ObfuscatedName("gq.z")
    public int[][] field2177;

    @ObfuscatedName("gq.ap")
    public int[][] field2180;

    @ObfuscatedName("gq.af")
    public int[][] field2181;

    @ObfuscatedName("gq.ak")
    public int[][] field2182;

    @ObfuscatedName("gq.av")
    public class199[] field2183;

    @ObfuscatedName("gq.ar")
    public class206[] field2184;

    @ObfuscatedName("gq.al")
    public class206[] field2185;

    @ObfuscatedName("gq.aa")
    public short field2186;

    @ObfuscatedName("gq.ao")
    public short field2197;

    @ObfuscatedName("gq.aq")
    public boolean field2188 = false;

    @ObfuscatedName("gq.ay")
    public int field2189;

    @ObfuscatedName("gq.ac")
    public int field2190;

    @ObfuscatedName("gq.ab")
    public int field2191;

    @ObfuscatedName("gq.as")
    public int field2192;

    @ObfuscatedName("gq.ag")
    public int field2193;

    @ObfuscatedName("gq.az")
    public static int[] field2167 = new int[10000];

    @ObfuscatedName("gq.ad")
    public static int[] field2195 = new int[10000];

    @ObfuscatedName("gq.au")
    public static int field2196 = 0;

    @ObfuscatedName("gq.at")
    public static int[] field2154 = class194.field2271;

    @ObfuscatedName("gq.ae")
    public static int[] field2160 = class194.field2280;

    public class189() {
    }

    @ObfuscatedName("gq.c(Lkq;II)Lgq;")
    public static class189 method3374(class307 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method5066(arg1, arg2);
        return var3 == null ? null : new class189(var3);
    }

    public class189(byte[] arg0) {
        class421 var2 = new class421(10);
        var2.method6757(-2);
        if (arg0[arg0.length - 1] == -3 && arg0[arg0.length - 2] == -1) {
            this.method3376(arg0);
        } else if (arg0[arg0.length - 1] == -2 && arg0[arg0.length - 2] == -1) {
            this.method3429(arg0);
        } else if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method3378(arg0);
        } else {
            this.method3379(arg0);
        }
    }

    @ObfuscatedName("gq.s([B)V")
    public void method3376(byte[] arg0) {
        class421 var2 = new class421(arg0);
        class421 var3 = new class421(arg0);
        class421 var4 = new class421(arg0);
        class421 var5 = new class421(arg0);
        class421 var6 = new class421(arg0);
        class421 var7 = new class421(arg0);
        class421 var8 = new class421(arg0);
        var2.field4512 = arg0.length - 26;
        int var9 = var2.method6666();
        int var10 = var2.method6666();
        int var11 = var2.method6686();
        int var12 = var2.method6686();
        int var13 = var2.method6686();
        int var14 = var2.method6686();
        int var15 = var2.method6686();
        int var16 = var2.method6686();
        int var17 = var2.method6686();
        int var18 = var2.method6686();
        int var19 = var2.method6666();
        int var20 = var2.method6666();
        int var21 = var2.method6666();
        int var22 = var2.method6666();
        int var23 = var2.method6666();
        int var24 = var2.method6666();
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        if (var11 > 0) {
            this.field2173 = new byte[var11];
            var2.field4512 = 0;
            for (int var28 = 0; var28 < var11; var28++) {
                byte var29 = this.field2173[var28] = var2.method6664();
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
        this.field2194 = var9;
        this.field2161 = var10;
        this.field2172 = var11;
        this.field2158 = new int[var9];
        this.field2159 = new int[var9];
        this.field2168 = new int[var9];
        this.field2162 = new int[var10];
        this.field2166 = new int[var10];
        this.field2164 = new int[var10];
        if (var17 == 1) {
            this.field2170 = new int[var9];
        }
        if (var12 == 1) {
            this.field2165 = new byte[var10];
        }
        if (var13 == 255) {
            this.field2179 = new byte[var10];
        } else {
            this.field2175 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2198 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2187 = new int[var10];
        }
        if (var16 == 1) {
            this.field2178 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field2157 = new byte[var10];
        }
        if (var18 == 1) {
            this.field2181 = new int[var9][];
            this.field2182 = new int[var9][];
        }
        this.field2169 = new short[var10];
        if (var11 > 0) {
            this.field2174 = new short[var11];
            this.field2163 = new short[var11];
            this.field2176 = new short[var11];
        }
        var2.field4512 = var11;
        var3.field4512 = var47;
        var4.field4512 = var49;
        var5.field4512 = var51;
        var6.field4512 = var35;
        int var67 = 0;
        int var68 = 0;
        int var69 = 0;
        for (int var70 = 0; var70 < var9; var70++) {
            int var71 = var2.method6686();
            int var72 = 0;
            if ((var71 & 0x1) != 0) {
                var72 = var3.method6804();
            }
            int var73 = 0;
            if ((var71 & 0x2) != 0) {
                var73 = var4.method6804();
            }
            int var74 = 0;
            if ((var71 & 0x4) != 0) {
                var74 = var5.method6804();
            }
            this.field2158[var70] = var67 + var72;
            this.field2159[var70] = var68 + var73;
            this.field2168[var70] = var69 + var74;
            var67 = this.field2158[var70];
            var68 = this.field2159[var70];
            var69 = this.field2168[var70];
            if (var17 == 1) {
                this.field2170[var70] = var6.method6686();
            }
        }
        if (var18 == 1) {
            for (int var75 = 0; var75 < var9; var75++) {
                int var76 = var6.method6686();
                this.field2181[var75] = new int[var76];
                this.field2182[var75] = new int[var76];
                for (int var77 = 0; var77 < var76; var77++) {
                    this.field2181[var75][var77] = var6.method6686();
                    this.field2182[var75][var77] = var6.method6686();
                }
            }
        }
        var2.field4512 = var45;
        var3.field4512 = var33;
        var4.field4512 = var36;
        var5.field4512 = var40;
        var6.field4512 = var37;
        var7.field4512 = var43;
        var8.field4512 = var42;
        for (int var78 = 0; var78 < var10; var78++) {
            this.field2169[var78] = (short) var2.method6666();
            if (var12 == 1) {
                this.field2165[var78] = var3.method6664();
            }
            if (var13 == 255) {
                this.field2179[var78] = var4.method6664();
            }
            if (var14 == 1) {
                this.field2198[var78] = var5.method6664();
            }
            if (var15 == 1) {
                this.field2187[var78] = var6.method6686();
            }
            if (var16 == 1) {
                this.field2178[var78] = (short) (var7.method6666() - 1);
            }
            if (this.field2157 != null && this.field2178[var78] != -1) {
                this.field2157[var78] = (byte) (var8.method6686() - 1);
            }
        }
        var2.field4512 = var39;
        var3.field4512 = var32;
        int var79 = 0;
        int var80 = 0;
        int var81 = 0;
        int var82 = 0;
        for (int var83 = 0; var83 < var10; var83++) {
            int var84 = var3.method6686();
            if (var84 == 1) {
                var79 = var2.method6804() + var82;
                var80 = var2.method6804() + var79;
                var81 = var2.method6804() + var80;
                var82 = var81;
                this.field2162[var83] = var79;
                this.field2166[var83] = var80;
                this.field2164[var83] = var81;
            }
            if (var84 == 2) {
                var80 = var81;
                var81 = var2.method6804() + var82;
                var82 = var81;
                this.field2162[var83] = var79;
                this.field2166[var83] = var80;
                this.field2164[var83] = var81;
            }
            if (var84 == 3) {
                var79 = var81;
                var81 = var2.method6804() + var82;
                var82 = var81;
                this.field2162[var83] = var79;
                this.field2166[var83] = var80;
                this.field2164[var83] = var81;
            }
            if (var84 == 4) {
                int var87 = var79;
                var79 = var80;
                var80 = var87;
                var81 = var2.method6804() + var82;
                var82 = var81;
                this.field2162[var83] = var79;
                this.field2166[var83] = var87;
                this.field2164[var83] = var81;
            }
        }
        var2.field4512 = var53;
        var3.field4512 = var55;
        var4.field4512 = var57;
        var5.field4512 = var59;
        var6.field4512 = var61;
        var7.field4512 = var63;
        for (int var88 = 0; var88 < var11; var88++) {
            int var89 = this.field2173[var88] & 0xFF;
            if (var89 == 0) {
                this.field2174[var88] = (short) var2.method6666();
                this.field2163[var88] = (short) var2.method6666();
                this.field2176[var88] = (short) var2.method6666();
            }
        }
        var2.field4512 = var65;
        int var90 = var2.method6686();
        if (var90 == 0) {
            return;
        }
        new class208();
        var2.method6666();
        var2.method6666();
        var2.method6666();
        var2.method6669();
    }

    @ObfuscatedName("gq.e([B)V")
    public void method3429(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class421 var4 = new class421(arg0);
        class421 var5 = new class421(arg0);
        class421 var6 = new class421(arg0);
        class421 var7 = new class421(arg0);
        class421 var8 = new class421(arg0);
        var4.field4512 = arg0.length - 23;
        int var9 = var4.method6666();
        int var10 = var4.method6666();
        int var11 = var4.method6686();
        int var12 = var4.method6686();
        int var13 = var4.method6686();
        int var14 = var4.method6686();
        int var15 = var4.method6686();
        int var16 = var4.method6686();
        int var17 = var4.method6686();
        int var18 = var4.method6666();
        int var19 = var4.method6666();
        int var20 = var4.method6666();
        int var21 = var4.method6666();
        int var22 = var4.method6666();
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
        this.field2194 = var9;
        this.field2161 = var10;
        this.field2172 = var11;
        this.field2158 = new int[var9];
        this.field2159 = new int[var9];
        this.field2168 = new int[var9];
        this.field2162 = new int[var10];
        this.field2166 = new int[var10];
        this.field2164 = new int[var10];
        if (var11 > 0) {
            this.field2173 = new byte[var11];
            this.field2174 = new short[var11];
            this.field2163 = new short[var11];
            this.field2176 = new short[var11];
        }
        if (var16 == 1) {
            this.field2170 = new int[var9];
        }
        if (var12 == 1) {
            this.field2165 = new byte[var10];
            this.field2157 = new byte[var10];
            this.field2178 = new short[var10];
        }
        if (var13 == 255) {
            this.field2179 = new byte[var10];
        } else {
            this.field2175 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2198 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2187 = new int[var10];
        }
        if (var17 == 1) {
            this.field2181 = new int[var9][];
            this.field2182 = new int[var9][];
        }
        this.field2169 = new short[var10];
        var4.field4512 = var23;
        var5.field4512 = var39;
        var6.field4512 = var41;
        var7.field4512 = var43;
        var8.field4512 = var27;
        int var46 = 0;
        int var47 = 0;
        int var48 = 0;
        for (int var49 = 0; var49 < var9; var49++) {
            int var50 = var4.method6686();
            int var51 = 0;
            if ((var50 & 0x1) != 0) {
                var51 = var5.method6804();
            }
            int var52 = 0;
            if ((var50 & 0x2) != 0) {
                var52 = var6.method6804();
            }
            int var53 = 0;
            if ((var50 & 0x4) != 0) {
                var53 = var7.method6804();
            }
            this.field2158[var49] = var46 + var51;
            this.field2159[var49] = var47 + var52;
            this.field2168[var49] = var48 + var53;
            var46 = this.field2158[var49];
            var47 = this.field2159[var49];
            var48 = this.field2168[var49];
            if (var16 == 1) {
                this.field2170[var49] = var8.method6686();
            }
        }
        if (var17 == 1) {
            for (int var54 = 0; var54 < var9; var54++) {
                int var55 = var8.method6686();
                this.field2181[var54] = new int[var55];
                this.field2182[var54] = new int[var55];
                for (int var56 = 0; var56 < var55; var56++) {
                    this.field2181[var54][var56] = var8.method6686();
                    this.field2182[var54][var56] = var8.method6686();
                }
            }
        }
        var4.field4512 = var35;
        var5.field4512 = var30;
        var6.field4512 = var28;
        var7.field4512 = var33;
        var8.field4512 = var29;
        for (int var57 = 0; var57 < var10; var57++) {
            this.field2169[var57] = (short) var4.method6666();
            if (var12 == 1) {
                int var58 = var5.method6686();
                if ((var58 & 0x1) == 1) {
                    this.field2165[var57] = 1;
                    var2 = true;
                } else {
                    this.field2165[var57] = 0;
                }
                if ((var58 & 0x2) == 2) {
                    this.field2157[var57] = (byte) (var58 >> 2);
                    this.field2178[var57] = this.field2169[var57];
                    this.field2169[var57] = 127;
                    if (this.field2178[var57] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field2157[var57] = -1;
                    this.field2178[var57] = -1;
                }
            }
            if (var13 == 255) {
                this.field2179[var57] = var6.method6664();
            }
            if (var14 == 1) {
                this.field2198[var57] = var7.method6664();
            }
            if (var15 == 1) {
                this.field2187[var57] = var8.method6686();
            }
        }
        var4.field4512 = var32;
        var5.field4512 = var25;
        int var59 = 0;
        int var60 = 0;
        int var61 = 0;
        int var62 = 0;
        for (int var63 = 0; var63 < var10; var63++) {
            int var64 = var5.method6686();
            if (var64 == 1) {
                var59 = var4.method6804() + var62;
                var60 = var4.method6804() + var59;
                var61 = var4.method6804() + var60;
                var62 = var61;
                this.field2162[var63] = var59;
                this.field2166[var63] = var60;
                this.field2164[var63] = var61;
            }
            if (var64 == 2) {
                var60 = var61;
                var61 = var4.method6804() + var62;
                var62 = var61;
                this.field2162[var63] = var59;
                this.field2166[var63] = var60;
                this.field2164[var63] = var61;
            }
            if (var64 == 3) {
                var59 = var61;
                var61 = var4.method6804() + var62;
                var62 = var61;
                this.field2162[var63] = var59;
                this.field2166[var63] = var60;
                this.field2164[var63] = var61;
            }
            if (var64 == 4) {
                int var67 = var59;
                var59 = var60;
                var60 = var67;
                var61 = var4.method6804() + var62;
                var62 = var61;
                this.field2162[var63] = var59;
                this.field2166[var63] = var67;
                this.field2164[var63] = var61;
            }
        }
        var4.field4512 = var37;
        for (int var68 = 0; var68 < var11; var68++) {
            this.field2173[var68] = 0;
            this.field2174[var68] = (short) var4.method6666();
            this.field2163[var68] = (short) var4.method6666();
            this.field2176[var68] = (short) var4.method6666();
        }
        if (this.field2157 != null) {
            boolean var69 = false;
            for (int var70 = 0; var70 < var10; var70++) {
                int var71 = this.field2157[var70] & 0xFF;
                if (var71 != 255) {
                    if ((this.field2174[var71] & 0xFFFF) == this.field2162[var70] && (this.field2163[var71] & 0xFFFF) == this.field2166[var70] && (this.field2176[var71] & 0xFFFF) == this.field2164[var70]) {
                        this.field2157[var70] = -1;
                    } else {
                        var69 = true;
                    }
                }
            }
            if (!var69) {
                this.field2157 = null;
            }
        }
        if (!var3) {
            this.field2178 = null;
        }
        if (!var2) {
            this.field2165 = null;
        }
    }

    @ObfuscatedName("gq.r([B)V")
    public void method3378(byte[] arg0) {
        class421 var2 = new class421(arg0);
        class421 var3 = new class421(arg0);
        class421 var4 = new class421(arg0);
        class421 var5 = new class421(arg0);
        class421 var6 = new class421(arg0);
        class421 var7 = new class421(arg0);
        class421 var8 = new class421(arg0);
        var2.field4512 = arg0.length - 23;
        int var9 = var2.method6666();
        int var10 = var2.method6666();
        int var11 = var2.method6686();
        int var12 = var2.method6686();
        int var13 = var2.method6686();
        int var14 = var2.method6686();
        int var15 = var2.method6686();
        int var16 = var2.method6686();
        int var17 = var2.method6686();
        int var18 = var2.method6666();
        int var19 = var2.method6666();
        int var20 = var2.method6666();
        int var21 = var2.method6666();
        int var22 = var2.method6666();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field2173 = new byte[var11];
            var2.field4512 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field2173[var26] = var2.method6664();
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
        this.field2194 = var9;
        this.field2161 = var10;
        this.field2172 = var11;
        this.field2158 = new int[var9];
        this.field2159 = new int[var9];
        this.field2168 = new int[var9];
        this.field2162 = new int[var10];
        this.field2166 = new int[var10];
        this.field2164 = new int[var10];
        if (var17 == 1) {
            this.field2170 = new int[var9];
        }
        if (var12 == 1) {
            this.field2165 = new byte[var10];
        }
        if (var13 == 255) {
            this.field2179 = new byte[var10];
        } else {
            this.field2175 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2198 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2187 = new int[var10];
        }
        if (var16 == 1) {
            this.field2178 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field2157 = new byte[var10];
        }
        this.field2169 = new short[var10];
        if (var11 > 0) {
            this.field2174 = new short[var11];
            this.field2163 = new short[var11];
            this.field2176 = new short[var11];
        }
        var2.field4512 = var11;
        var3.field4512 = var44;
        var4.field4512 = var46;
        var5.field4512 = var48;
        var6.field4512 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method6686();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method6804();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method6804();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method6804();
            }
            this.field2158[var67] = var64 + var69;
            this.field2159[var67] = var65 + var70;
            this.field2168[var67] = var66 + var71;
            var64 = this.field2158[var67];
            var65 = this.field2159[var67];
            var66 = this.field2168[var67];
            if (var17 == 1) {
                this.field2170[var67] = var6.method6686();
            }
        }
        var2.field4512 = var42;
        var3.field4512 = var31;
        var4.field4512 = var34;
        var5.field4512 = var37;
        var6.field4512 = var35;
        var7.field4512 = var40;
        var8.field4512 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field2169[var72] = (short) var2.method6666();
            if (var12 == 1) {
                this.field2165[var72] = var3.method6664();
            }
            if (var13 == 255) {
                this.field2179[var72] = var4.method6664();
            }
            if (var14 == 1) {
                this.field2198[var72] = var5.method6664();
            }
            if (var15 == 1) {
                this.field2187[var72] = var6.method6686();
            }
            if (var16 == 1) {
                this.field2178[var72] = (short) (var7.method6666() - 1);
            }
            if (this.field2157 != null && this.field2178[var72] != -1) {
                this.field2157[var72] = (byte) (var8.method6686() - 1);
            }
        }
        var2.field4512 = var33;
        var3.field4512 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method6686();
            if (var78 == 1) {
                var73 = var2.method6804() + var76;
                var74 = var2.method6804() + var73;
                var75 = var2.method6804() + var74;
                var76 = var75;
                this.field2162[var77] = var73;
                this.field2166[var77] = var74;
                this.field2164[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method6804() + var76;
                var76 = var75;
                this.field2162[var77] = var73;
                this.field2166[var77] = var74;
                this.field2164[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method6804() + var76;
                var76 = var75;
                this.field2162[var77] = var73;
                this.field2166[var77] = var74;
                this.field2164[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method6804() + var76;
                var76 = var75;
                this.field2162[var77] = var73;
                this.field2166[var77] = var81;
                this.field2164[var77] = var75;
            }
        }
        var2.field4512 = var50;
        var3.field4512 = var52;
        var4.field4512 = var54;
        var5.field4512 = var56;
        var6.field4512 = var58;
        var7.field4512 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field2173[var82] & 0xFF;
            if (var83 == 0) {
                this.field2174[var82] = (short) var2.method6666();
                this.field2163[var82] = (short) var2.method6666();
                this.field2176[var82] = (short) var2.method6666();
            }
        }
        var2.field4512 = var62;
        int var84 = var2.method6686();
        if (var84 == 0) {
            return;
        }
        new class208();
        var2.method6666();
        var2.method6666();
        var2.method6666();
        var2.method6669();
    }

    @ObfuscatedName("gq.o([B)V")
    public void method3379(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class421 var4 = new class421(arg0);
        class421 var5 = new class421(arg0);
        class421 var6 = new class421(arg0);
        class421 var7 = new class421(arg0);
        class421 var8 = new class421(arg0);
        var4.field4512 = arg0.length - 18;
        int var9 = var4.method6666();
        int var10 = var4.method6666();
        int var11 = var4.method6686();
        int var12 = var4.method6686();
        int var13 = var4.method6686();
        int var14 = var4.method6686();
        int var15 = var4.method6686();
        int var16 = var4.method6686();
        int var17 = var4.method6666();
        int var18 = var4.method6666();
        int var19 = var4.method6666();
        int var20 = var4.method6666();
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
        this.field2194 = var9;
        this.field2161 = var10;
        this.field2172 = var11;
        this.field2158 = new int[var9];
        this.field2159 = new int[var9];
        this.field2168 = new int[var9];
        this.field2162 = new int[var10];
        this.field2166 = new int[var10];
        this.field2164 = new int[var10];
        if (var11 > 0) {
            this.field2173 = new byte[var11];
            this.field2174 = new short[var11];
            this.field2163 = new short[var11];
            this.field2176 = new short[var11];
        }
        if (var16 == 1) {
            this.field2170 = new int[var9];
        }
        if (var12 == 1) {
            this.field2165 = new byte[var10];
            this.field2157 = new byte[var10];
            this.field2178 = new short[var10];
        }
        if (var13 == 255) {
            this.field2179 = new byte[var10];
        } else {
            this.field2175 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2198 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2187 = new int[var10];
        }
        this.field2169 = new short[var10];
        var4.field4512 = var21;
        var5.field4512 = var36;
        var6.field4512 = var38;
        var7.field4512 = var40;
        var8.field4512 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method6686();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method6804();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method6804();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method6804();
            }
            this.field2158[var46] = var43 + var48;
            this.field2159[var46] = var44 + var49;
            this.field2168[var46] = var45 + var50;
            var43 = this.field2158[var46];
            var44 = this.field2159[var46];
            var45 = this.field2168[var46];
            if (var16 == 1) {
                this.field2170[var46] = var8.method6686();
            }
        }
        var4.field4512 = var32;
        var5.field4512 = var28;
        var6.field4512 = var26;
        var7.field4512 = var30;
        var8.field4512 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field2169[var51] = (short) var4.method6666();
            if (var12 == 1) {
                int var52 = var5.method6686();
                if ((var52 & 0x1) == 1) {
                    this.field2165[var51] = 1;
                    var2 = true;
                } else {
                    this.field2165[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field2157[var51] = (byte) (var52 >> 2);
                    this.field2178[var51] = this.field2169[var51];
                    this.field2169[var51] = 127;
                    if (this.field2178[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field2157[var51] = -1;
                    this.field2178[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field2179[var51] = var6.method6664();
            }
            if (var14 == 1) {
                this.field2198[var51] = var7.method6664();
            }
            if (var15 == 1) {
                this.field2187[var51] = var8.method6686();
            }
        }
        var4.field4512 = var25;
        var5.field4512 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method6686();
            if (var58 == 1) {
                var53 = var4.method6804() + var56;
                var54 = var4.method6804() + var53;
                var55 = var4.method6804() + var54;
                var56 = var55;
                this.field2162[var57] = var53;
                this.field2166[var57] = var54;
                this.field2164[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method6804() + var56;
                var56 = var55;
                this.field2162[var57] = var53;
                this.field2166[var57] = var54;
                this.field2164[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method6804() + var56;
                var56 = var55;
                this.field2162[var57] = var53;
                this.field2166[var57] = var54;
                this.field2164[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method6804() + var56;
                var56 = var55;
                this.field2162[var57] = var53;
                this.field2166[var57] = var61;
                this.field2164[var57] = var55;
            }
        }
        var4.field4512 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field2173[var62] = 0;
            this.field2174[var62] = (short) var4.method6666();
            this.field2163[var62] = (short) var4.method6666();
            this.field2176[var62] = (short) var4.method6666();
        }
        if (this.field2157 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field2157[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field2174[var65] & 0xFFFF) == this.field2162[var64] && (this.field2163[var65] & 0xFFFF) == this.field2166[var64] && (this.field2176[var65] & 0xFFFF) == this.field2164[var64]) {
                        this.field2157[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field2157 = null;
            }
        }
        if (!var3) {
            this.field2178 = null;
        }
        if (!var2) {
            this.field2165 = null;
        }
    }

    public class189(class189[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        this.field2194 = 0;
        this.field2161 = 0;
        this.field2172 = 0;
        this.field2175 = -1;
        for (int var10 = 0; var10 < arg1; var10++) {
            class189 var11 = arg0[var10];
            if (var11 != null) {
                this.field2194 += var11.field2194;
                this.field2161 += var11.field2161;
                this.field2172 += var11.field2172;
                if (var11.field2179 == null) {
                    if (this.field2175 == -1) {
                        this.field2175 = var11.field2175;
                    }
                    if (this.field2175 != var11.field2175) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var11.field2165 != null;
                var5 |= var11.field2198 != null;
                var6 |= var11.field2187 != null;
                var7 |= var11.field2178 != null;
                var8 |= var11.field2157 != null;
                var9 |= var11.field2181 != null;
            }
        }
        this.field2158 = new int[this.field2194];
        this.field2159 = new int[this.field2194];
        this.field2168 = new int[this.field2194];
        this.field2170 = new int[this.field2194];
        this.field2162 = new int[this.field2161];
        this.field2166 = new int[this.field2161];
        this.field2164 = new int[this.field2161];
        if (var3) {
            this.field2165 = new byte[this.field2161];
        }
        if (var4) {
            this.field2179 = new byte[this.field2161];
        }
        if (var5) {
            this.field2198 = new byte[this.field2161];
        }
        if (var6) {
            this.field2187 = new int[this.field2161];
        }
        if (var7) {
            this.field2178 = new short[this.field2161];
        }
        if (var8) {
            this.field2157 = new byte[this.field2161];
        }
        if (var9) {
            this.field2181 = new int[this.field2194][];
            this.field2182 = new int[this.field2194][];
        }
        this.field2169 = new short[this.field2161];
        if (this.field2172 > 0) {
            this.field2173 = new byte[this.field2172];
            this.field2174 = new short[this.field2172];
            this.field2163 = new short[this.field2172];
            this.field2176 = new short[this.field2172];
        }
        this.field2194 = 0;
        this.field2161 = 0;
        this.field2172 = 0;
        for (int var12 = 0; var12 < arg1; var12++) {
            class189 var13 = arg0[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < var13.field2161; var14++) {
                    if (var3 && var13.field2165 != null) {
                        this.field2165[this.field2161] = var13.field2165[var14];
                    }
                    if (var4) {
                        if (var13.field2179 == null) {
                            this.field2179[this.field2161] = var13.field2175;
                        } else {
                            this.field2179[this.field2161] = var13.field2179[var14];
                        }
                    }
                    if (var5 && var13.field2198 != null) {
                        this.field2198[this.field2161] = var13.field2198[var14];
                    }
                    if (var6 && var13.field2187 != null) {
                        this.field2187[this.field2161] = var13.field2187[var14];
                    }
                    if (var7) {
                        if (var13.field2178 == null) {
                            this.field2178[this.field2161] = -1;
                        } else {
                            this.field2178[this.field2161] = var13.field2178[var14];
                        }
                    }
                    if (var8) {
                        if (var13.field2157 == null || var13.field2157[var14] == -1) {
                            this.field2157[this.field2161] = -1;
                        } else {
                            this.field2157[this.field2161] = (byte) (var13.field2157[var14] + this.field2172);
                        }
                    }
                    this.field2169[this.field2161] = var13.field2169[var14];
                    this.field2162[this.field2161] = this.method3381(var13, var13.field2162[var14]);
                    this.field2166[this.field2161] = this.method3381(var13, var13.field2166[var14]);
                    this.field2164[this.field2161] = this.method3381(var13, var13.field2164[var14]);
                    this.field2161++;
                }
                for (int var15 = 0; var15 < var13.field2172; var15++) {
                    byte var16 = this.field2173[this.field2172] = var13.field2173[var15];
                    if (var16 == 0) {
                        this.field2174[this.field2172] = (short) this.method3381(var13, var13.field2174[var15]);
                        this.field2163[this.field2172] = (short) this.method3381(var13, var13.field2163[var15]);
                        this.field2176[this.field2172] = (short) this.method3381(var13, var13.field2176[var15]);
                    }
                    this.field2172++;
                }
            }
        }
    }

    @ObfuscatedName("gq.a(Lgq;I)I")
    public final int method3381(class189 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field2158[arg1];
        int var5 = arg0.field2159[arg1];
        int var6 = arg0.field2168[arg1];
        for (int var7 = 0; var7 < this.field2194; var7++) {
            if (this.field2158[var7] == var4 && this.field2159[var7] == var5 && this.field2168[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field2158[this.field2194] = var4;
            this.field2159[this.field2194] = var5;
            this.field2168[this.field2194] = var6;
            if (arg0.field2170 != null) {
                this.field2170[this.field2194] = arg0.field2170[arg1];
            }
            if (arg0.field2181 != null) {
                this.field2181[this.field2194] = arg0.field2181[arg1];
                this.field2182[this.field2194] = arg0.field2182[arg1];
            }
            var3 = this.field2194++;
        }
        return var3;
    }

    public class189(class189 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field2194 = arg0.field2194;
        this.field2161 = arg0.field2161;
        this.field2172 = arg0.field2172;
        if (arg1) {
            this.field2158 = arg0.field2158;
            this.field2159 = arg0.field2159;
            this.field2168 = arg0.field2168;
        } else {
            this.field2158 = new int[this.field2194];
            this.field2159 = new int[this.field2194];
            this.field2168 = new int[this.field2194];
            for (int var6 = 0; var6 < this.field2194; var6++) {
                this.field2158[var6] = arg0.field2158[var6];
                this.field2159[var6] = arg0.field2159[var6];
                this.field2168[var6] = arg0.field2168[var6];
            }
        }
        if (arg2) {
            this.field2169 = arg0.field2169;
        } else {
            this.field2169 = new short[this.field2161];
            for (int var7 = 0; var7 < this.field2161; var7++) {
                this.field2169[var7] = arg0.field2169[var7];
            }
        }
        if (arg3 || arg0.field2178 == null) {
            this.field2178 = arg0.field2178;
        } else {
            this.field2178 = new short[this.field2161];
            for (int var8 = 0; var8 < this.field2161; var8++) {
                this.field2178[var8] = arg0.field2178[var8];
            }
        }
        if (arg4) {
            this.field2198 = arg0.field2198;
        } else {
            this.field2198 = new byte[this.field2161];
            if (arg0.field2198 == null) {
                for (int var9 = 0; var9 < this.field2161; var9++) {
                    this.field2198[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field2161; var10++) {
                    this.field2198[var10] = arg0.field2198[var10];
                }
            }
        }
        this.field2162 = arg0.field2162;
        this.field2166 = arg0.field2166;
        this.field2164 = arg0.field2164;
        this.field2165 = arg0.field2165;
        this.field2179 = arg0.field2179;
        this.field2157 = arg0.field2157;
        this.field2175 = arg0.field2175;
        this.field2173 = arg0.field2173;
        this.field2174 = arg0.field2174;
        this.field2163 = arg0.field2163;
        this.field2176 = arg0.field2176;
        this.field2170 = arg0.field2170;
        this.field2187 = arg0.field2187;
        this.field2177 = arg0.field2177;
        this.field2180 = arg0.field2180;
        this.field2184 = arg0.field2184;
        this.field2183 = arg0.field2183;
        this.field2185 = arg0.field2185;
        this.field2181 = arg0.field2181;
        this.field2182 = arg0.field2182;
        this.field2186 = arg0.field2186;
        this.field2197 = arg0.field2197;
    }

    @ObfuscatedName("gq.y()Lgq;")
    public class189 method3382() {
        class189 var1 = new class189();
        if (this.field2165 != null) {
            var1.field2165 = new byte[this.field2161];
            for (int var2 = 0; var2 < this.field2161; var2++) {
                var1.field2165[var2] = this.field2165[var2];
            }
        }
        var1.field2194 = this.field2194;
        var1.field2161 = this.field2161;
        var1.field2172 = this.field2172;
        var1.field2158 = this.field2158;
        var1.field2159 = this.field2159;
        var1.field2168 = this.field2168;
        var1.field2162 = this.field2162;
        var1.field2166 = this.field2166;
        var1.field2164 = this.field2164;
        var1.field2179 = this.field2179;
        var1.field2198 = this.field2198;
        var1.field2157 = this.field2157;
        var1.field2169 = this.field2169;
        var1.field2178 = this.field2178;
        var1.field2175 = this.field2175;
        var1.field2173 = this.field2173;
        var1.field2174 = this.field2174;
        var1.field2163 = this.field2163;
        var1.field2176 = this.field2176;
        var1.field2170 = this.field2170;
        var1.field2187 = this.field2187;
        var1.field2177 = this.field2177;
        var1.field2180 = this.field2180;
        var1.field2184 = this.field2184;
        var1.field2183 = this.field2183;
        var1.field2186 = this.field2186;
        var1.field2197 = this.field2197;
        return var1;
    }

    @ObfuscatedName("gq.u([[IIIIZI)Lgq;")
    public class189 method3383(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method3394();
        int var7 = this.field2190 + arg1;
        int var8 = this.field2191 + arg1;
        int var9 = this.field2193 + arg3;
        int var10 = this.field2192 + arg3;
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
        class189 var15;
        if (arg4) {
            var15 = new class189();
            var15.field2194 = this.field2194;
            var15.field2161 = this.field2161;
            var15.field2172 = this.field2172;
            var15.field2158 = this.field2158;
            var15.field2168 = this.field2168;
            var15.field2162 = this.field2162;
            var15.field2166 = this.field2166;
            var15.field2164 = this.field2164;
            var15.field2165 = this.field2165;
            var15.field2179 = this.field2179;
            var15.field2198 = this.field2198;
            var15.field2157 = this.field2157;
            var15.field2169 = this.field2169;
            var15.field2178 = this.field2178;
            var15.field2175 = this.field2175;
            var15.field2173 = this.field2173;
            var15.field2174 = this.field2174;
            var15.field2163 = this.field2163;
            var15.field2176 = this.field2176;
            var15.field2170 = this.field2170;
            var15.field2187 = this.field2187;
            var15.field2177 = this.field2177;
            var15.field2180 = this.field2180;
            var15.field2186 = this.field2186;
            var15.field2197 = this.field2197;
            var15.field2159 = new int[var15.field2194];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field2194; var16++) {
                int var17 = this.field2158[var16] + arg1;
                int var18 = this.field2168[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field2159[var16] = this.field2159[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field2194; var26++) {
                int var27 = (-this.field2159[var26] << 16) / this.field2372;
                if (var27 < arg5) {
                    int var28 = this.field2158[var26] + arg1;
                    int var29 = this.field2168[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field2159[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field2159[var26];
                }
            }
        }
        var15.method3446();
        return var15;
    }

    @ObfuscatedName("gq.h()V")
    public void method3384() {
        int var10002;
        if (this.field2170 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field2194; var3++) {
                int var4 = this.field2170[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field2177 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field2177[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field2194) {
                int var7 = this.field2170[var6];
                this.field2177[var7][var1[var7]++] = var6++;
            }
            this.field2170 = null;
        }
        if (this.field2187 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field2161; var10++) {
            int var11 = this.field2187[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field2180 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field2180[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field2161) {
            int var14 = this.field2187[var13];
            this.field2180[var14][var8[var14]++] = var13++;
        }
        this.field2187 = null;
    }

    @ObfuscatedName("gq.q()V")
    public void method3385() {
        for (int var1 = 0; var1 < this.field2194; var1++) {
            int var2 = this.field2158[var1];
            this.field2158[var1] = this.field2168[var1];
            this.field2168[var1] = -var2;
        }
        this.method3446();
    }

    @ObfuscatedName("gq.x()V")
    public void method3386() {
        for (int var1 = 0; var1 < this.field2194; var1++) {
            this.field2158[var1] = -this.field2158[var1];
            this.field2168[var1] = -this.field2168[var1];
        }
        this.method3446();
    }

    @ObfuscatedName("gq.p()V")
    public void method3409() {
        for (int var1 = 0; var1 < this.field2194; var1++) {
            int var2 = this.field2168[var1];
            this.field2168[var1] = this.field2158[var1];
            this.field2158[var1] = -var2;
        }
        this.method3446();
    }

    @ObfuscatedName("gq.n(I)V")
    public void method3392(int arg0) {
        int var2 = field2154[arg0];
        int var3 = field2160[arg0];
        for (int var4 = 0; var4 < this.field2194; var4++) {
            int var5 = this.field2168[var4] * var2 + this.field2158[var4] * var3 >> 16;
            this.field2168[var4] = this.field2168[var4] * var3 - this.field2158[var4] * var2 >> 16;
            this.field2158[var4] = var5;
        }
        this.method3446();
    }

    @ObfuscatedName("gq.m(III)V")
    public void method3390(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2194; var4++) {
            this.field2158[var4] += arg0;
            this.field2159[var4] += arg1;
            this.field2168[var4] += arg2;
        }
        this.method3446();
    }

    @ObfuscatedName("gq.d(SS)V")
    public void method3380(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2161; var3++) {
            if (this.field2169[var3] == arg0) {
                this.field2169[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("gq.j(SS)V")
    public void method3404(short arg0, short arg1) {
        if (this.field2178 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field2161; var3++) {
            if (this.field2178[var3] == arg0) {
                this.field2178[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("gq.f()V")
    public void method3408() {
        for (int var1 = 0; var1 < this.field2194; var1++) {
            this.field2168[var1] = -this.field2168[var1];
        }
        for (int var2 = 0; var2 < this.field2161; var2++) {
            int var3 = this.field2162[var2];
            this.field2162[var2] = this.field2164[var2];
            this.field2164[var2] = var3;
        }
        this.method3446();
    }

    @ObfuscatedName("gq.g(III)V")
    public void method3391(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2194; var4++) {
            this.field2158[var4] = this.field2158[var4] * arg0 / 128;
            this.field2159[var4] = this.field2159[var4] * arg1 / 128;
            this.field2168[var4] = this.field2168[var4] * arg2 / 128;
        }
        this.method3446();
    }

    @ObfuscatedName("gq.t()V")
    public void method3389() {
        if (this.field2184 != null) {
            return;
        }
        this.field2184 = new class206[this.field2194];
        for (int var1 = 0; var1 < this.field2194; var1++) {
            this.field2184[var1] = new class206();
        }
        for (int var2 = 0; var2 < this.field2161; var2++) {
            int var3 = this.field2162[var2];
            int var4 = this.field2166[var2];
            int var5 = this.field2164[var2];
            int var6 = this.field2158[var4] - this.field2158[var3];
            int var7 = this.field2159[var4] - this.field2159[var3];
            int var8 = this.field2168[var4] - this.field2168[var3];
            int var9 = this.field2158[var5] - this.field2158[var3];
            int var10 = this.field2159[var5] - this.field2159[var3];
            int var11 = this.field2168[var5] - this.field2168[var3];
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
            if (this.field2165 == null) {
                var19 = 0;
            } else {
                var19 = this.field2165[var2];
            }
            if (var19 == 0) {
                class206 var20 = this.field2184[var3];
                var20.field2531 += var16;
                var20.field2530 += var17;
                var20.field2533 += var18;
                var20.field2532++;
                class206 var21 = this.field2184[var4];
                var21.field2531 += var16;
                var21.field2530 += var17;
                var21.field2533 += var18;
                var21.field2532++;
                class206 var22 = this.field2184[var5];
                var22.field2531 += var16;
                var22.field2530 += var17;
                var22.field2533 += var18;
                var22.field2532++;
            } else if (var19 == 1) {
                if (this.field2183 == null) {
                    this.field2183 = new class199[this.field2161];
                }
                class199 var23 = this.field2183[var2] = new class199();
                var23.field2374 = var16;
                var23.field2373 = var17;
                var23.field2375 = var18;
            }
        }
    }

    @ObfuscatedName("gq.k()V")
    public void method3446() {
        this.field2184 = null;
        this.field2185 = null;
        this.field2183 = null;
        this.field2188 = false;
    }

    @ObfuscatedName("gq.b()V")
    public void method3394() {
        if (this.field2188) {
            return;
        }
        this.field2372 = 0;
        this.field2189 = 0;
        this.field2190 = 999999;
        this.field2191 = -999999;
        this.field2192 = -99999;
        this.field2193 = 99999;
        for (int var1 = 0; var1 < this.field2194; var1++) {
            int var2 = this.field2158[var1];
            int var3 = this.field2159[var1];
            int var4 = this.field2168[var1];
            if (var2 < this.field2190) {
                this.field2190 = var2;
            }
            if (var2 > this.field2191) {
                this.field2191 = var2;
            }
            if (var4 < this.field2193) {
                this.field2193 = var4;
            }
            if (var4 > this.field2192) {
                this.field2192 = var4;
            }
            if (-var3 > this.field2372) {
                this.field2372 = -var3;
            }
            if (var3 > this.field2189) {
                this.field2189 = var3;
            }
        }
        this.field2188 = true;
    }

    @ObfuscatedName("gq.z(Lgq;Lgq;IIIZ)V")
    public static void method3377(class189 arg0, class189 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method3394();
        arg0.method3389();
        arg1.method3394();
        arg1.method3389();
        field2196++;
        int var6 = 0;
        int[] var7 = arg1.field2158;
        int var8 = arg1.field2194;
        for (int var9 = 0; var9 < arg0.field2194; var9++) {
            class206 var10 = arg0.field2184[var9];
            if (var10.field2532 != 0) {
                int var11 = arg0.field2159[var9] - arg3;
                if (var11 <= arg1.field2189) {
                    int var12 = arg0.field2158[var9] - arg2;
                    if (var12 >= arg1.field2190 && var12 <= arg1.field2191) {
                        int var13 = arg0.field2168[var9] - arg4;
                        if (var13 >= arg1.field2193 && var13 <= arg1.field2192) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class206 var15 = arg1.field2184[var14];
                                if (var7[var14] == var12 && arg1.field2168[var14] == var13 && arg1.field2159[var14] == var11 && var15.field2532 != 0) {
                                    if (arg0.field2185 == null) {
                                        arg0.field2185 = new class206[arg0.field2194];
                                    }
                                    if (arg1.field2185 == null) {
                                        arg1.field2185 = new class206[var8];
                                    }
                                    class206 var16 = arg0.field2185[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field2185[var9] = new class206(var10);
                                    }
                                    class206 var17 = arg1.field2185[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field2185[var14] = new class206(var15);
                                    }
                                    var16.field2531 += var15.field2531;
                                    var16.field2530 += var15.field2530;
                                    var16.field2533 += var15.field2533;
                                    var16.field2532 += var15.field2532;
                                    var17.field2531 += var10.field2531;
                                    var17.field2530 += var10.field2530;
                                    var17.field2533 += var10.field2533;
                                    var17.field2532 += var10.field2532;
                                    var6++;
                                    field2167[var9] = field2196;
                                    field2195[var14] = field2196;
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
        for (int var18 = 0; var18 < arg0.field2161; var18++) {
            if (field2167[arg0.field2162[var18]] == field2196 && field2167[arg0.field2166[var18]] == field2196 && field2167[arg0.field2164[var18]] == field2196) {
                if (arg0.field2165 == null) {
                    arg0.field2165 = new byte[arg0.field2161];
                }
                arg0.field2165[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field2161; var19++) {
            if (field2195[arg1.field2162[var19]] == field2196 && field2195[arg1.field2166[var19]] == field2196 && field2195[arg1.field2164[var19]] == field2196) {
                if (arg1.field2165 == null) {
                    arg1.field2165 = new byte[arg1.field2161];
                }
                arg1.field2165[var19] = 2;
            }
        }
    }

    @ObfuscatedName("gq.ap(IIIII)Lgf;")
    public final class204 method3396(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method3389();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class204 var8 = new class204();
        var8.field2449 = new int[this.field2161];
        var8.field2450 = new int[this.field2161];
        var8.field2451 = new int[this.field2161];
        if (this.field2172 > 0 && this.field2157 != null) {
            int[] var9 = new int[this.field2172];
            for (int var10 = 0; var10 < this.field2161; var10++) {
                if (this.field2157[var10] != -1) {
                    var9[this.field2157[var10] & 0xFF]++;
                }
            }
            var8.field2452 = 0;
            for (int var11 = 0; var11 < this.field2172; var11++) {
                if (var9[var11] > 0 && this.field2173[var11] == 0) {
                    var8.field2452++;
                }
            }
            var8.field2458 = new int[var8.field2452];
            var8.field2459 = new int[var8.field2452];
            var8.field2460 = new int[var8.field2452];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field2172; var13++) {
                if (var9[var13] > 0 && this.field2173[var13] == 0) {
                    var8.field2458[var12] = this.field2174[var13] & 0xFFFF;
                    var8.field2459[var12] = this.field2163[var13] & 0xFFFF;
                    var8.field2460[var12] = this.field2176[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field2454 = new byte[this.field2161];
            for (int var14 = 0; var14 < this.field2161; var14++) {
                if (this.field2157[var14] == -1) {
                    var8.field2454[var14] = -1;
                } else {
                    var8.field2454[var14] = (byte) var9[this.field2157[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field2161; var15++) {
            byte var16;
            if (this.field2165 == null) {
                var16 = 0;
            } else {
                var16 = this.field2165[var15];
            }
            byte var17;
            if (this.field2198 == null) {
                var17 = 0;
            } else {
                var17 = this.field2198[var15];
            }
            short var18;
            if (this.field2178 == null) {
                var18 = -1;
            } else {
                var18 = this.field2178[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field2169[var15] & 0xFFFF;
                    class206 var20;
                    if (this.field2185 == null || this.field2185[this.field2162[var15]] == null) {
                        var20 = this.field2184[this.field2162[var15]];
                    } else {
                        var20 = this.field2185[this.field2162[var15]];
                    }
                    int var21 = (var20.field2533 * arg4 + var20.field2531 * arg2 + var20.field2530 * arg3) / (var20.field2532 * var7) + arg0;
                    var8.field2449[var15] = method3397(var19, var21);
                    class206 var22;
                    if (this.field2185 == null || this.field2185[this.field2166[var15]] == null) {
                        var22 = this.field2184[this.field2166[var15]];
                    } else {
                        var22 = this.field2185[this.field2166[var15]];
                    }
                    int var23 = (var22.field2533 * arg4 + var22.field2531 * arg2 + var22.field2530 * arg3) / (var22.field2532 * var7) + arg0;
                    var8.field2450[var15] = method3397(var19, var23);
                    class206 var24;
                    if (this.field2185 == null || this.field2185[this.field2164[var15]] == null) {
                        var24 = this.field2184[this.field2164[var15]];
                    } else {
                        var24 = this.field2185[this.field2164[var15]];
                    }
                    int var25 = (var24.field2533 * arg4 + var24.field2531 * arg2 + var24.field2530 * arg3) / (var24.field2532 * var7) + arg0;
                    var8.field2451[var15] = method3397(var19, var25);
                } else if (var16 == 1) {
                    class199 var26 = this.field2183[var15];
                    int var27 = (var26.field2375 * arg4 + var26.field2374 * arg2 + var26.field2373 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field2449[var15] = method3397(this.field2169[var15] & 0xFFFF, var27);
                    var8.field2451[var15] = -1;
                } else if (var16 == 3) {
                    var8.field2449[var15] = 128;
                    var8.field2451[var15] = -1;
                } else {
                    var8.field2451[var15] = -2;
                }
            } else if (var16 == 0) {
                class206 var28;
                if (this.field2185 == null || this.field2185[this.field2162[var15]] == null) {
                    var28 = this.field2184[this.field2162[var15]];
                } else {
                    var28 = this.field2185[this.field2162[var15]];
                }
                int var29 = (var28.field2533 * arg4 + var28.field2531 * arg2 + var28.field2530 * arg3) / (var28.field2532 * var7) + arg0;
                var8.field2449[var15] = method3398(var29);
                class206 var30;
                if (this.field2185 == null || this.field2185[this.field2166[var15]] == null) {
                    var30 = this.field2184[this.field2166[var15]];
                } else {
                    var30 = this.field2185[this.field2166[var15]];
                }
                int var31 = (var30.field2533 * arg4 + var30.field2531 * arg2 + var30.field2530 * arg3) / (var30.field2532 * var7) + arg0;
                var8.field2450[var15] = method3398(var31);
                class206 var32;
                if (this.field2185 == null || this.field2185[this.field2164[var15]] == null) {
                    var32 = this.field2184[this.field2164[var15]];
                } else {
                    var32 = this.field2185[this.field2164[var15]];
                }
                int var33 = (var32.field2533 * arg4 + var32.field2531 * arg2 + var32.field2530 * arg3) / (var32.field2532 * var7) + arg0;
                var8.field2451[var15] = method3398(var33);
            } else if (var16 == 1) {
                class199 var34 = this.field2183[var15];
                int var35 = (var34.field2375 * arg4 + var34.field2374 * arg2 + var34.field2373 * arg3) / (var7 / 2 + var7) + arg0;
                var8.field2449[var15] = method3398(var35);
                var8.field2451[var15] = -1;
            } else {
                var8.field2451[var15] = -2;
            }
        }
        this.method3384();
        var8.field2441 = this.field2194;
        var8.field2442 = this.field2158;
        var8.field2443 = this.field2159;
        var8.field2444 = this.field2168;
        var8.field2437 = this.field2161;
        var8.field2446 = this.field2162;
        var8.field2439 = this.field2166;
        var8.field2506 = this.field2164;
        var8.field2511 = this.field2179;
        var8.field2453 = this.field2198;
        var8.field2456 = this.field2175;
        var8.field2500 = this.field2177;
        var8.field2462 = this.field2180;
        var8.field2508 = this.field2178;
        var8.field2463 = this.field2181;
        var8.field2464 = this.field2182;
        return var8;
    }

    @ObfuscatedName("gq.af(II)I")
    public static final int method3397(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("gq.ak(I)I")
    public static final int method3398(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
