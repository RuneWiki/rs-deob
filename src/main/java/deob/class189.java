package deob;

@ObfuscatedName("ge")
public class class189 extends class198 {

    @ObfuscatedName("ge.m")
    public int field2172 = 0;

    @ObfuscatedName("ge.t")
    public int[] field2168;

    @ObfuscatedName("ge.s")
    public int[] field2185;

    @ObfuscatedName("ge.j")
    public int[] field2154;

    @ObfuscatedName("ge.w")
    public int field2155 = 0;

    @ObfuscatedName("ge.n")
    public int[] field2156;

    @ObfuscatedName("ge.r")
    public int[] field2157;

    @ObfuscatedName("ge.o")
    public int[] field2158;

    @ObfuscatedName("ge.v")
    public byte[] field2179;

    @ObfuscatedName("ge.d")
    public byte[] field2160;

    @ObfuscatedName("ge.h")
    public byte[] field2161;

    @ObfuscatedName("ge.g")
    public byte[] field2162;

    @ObfuscatedName("ge.e")
    public short[] field2163;

    @ObfuscatedName("ge.a")
    public short[] field2164;

    @ObfuscatedName("ge.u")
    public byte field2165 = 0;

    @ObfuscatedName("ge.k")
    public int field2166;

    @ObfuscatedName("ge.f")
    public byte[] field2167;

    @ObfuscatedName("ge.l")
    public short[] field2192;

    @ObfuscatedName("ge.q")
    public short[] field2149;

    @ObfuscatedName("ge.x")
    public short[] field2148;

    @ObfuscatedName("ge.z")
    public int[] field2175;

    @ObfuscatedName("ge.i")
    public int[] field2176;

    @ObfuscatedName("ge.y")
    public int[][] field2173;

    @ObfuscatedName("ge.ah")
    public int[][] field2171;

    @ObfuscatedName("ge.ao")
    public int[][] field2186;

    @ObfuscatedName("ge.ab")
    public int[][] field2174;

    @ObfuscatedName("ge.an")
    public class199[] field2184;

    @ObfuscatedName("ge.ax")
    public class206[] field2178;

    @ObfuscatedName("ge.am")
    public class206[] field2152;

    @ObfuscatedName("ge.az")
    public short field2170;

    @ObfuscatedName("ge.au")
    public short field2181;

    @ObfuscatedName("ge.av")
    public boolean field2182 = false;

    @ObfuscatedName("ge.ap")
    public int field2183;

    @ObfuscatedName("ge.ac")
    public int field2177;

    @ObfuscatedName("ge.aj")
    public int field2153;

    @ObfuscatedName("ge.af")
    public int field2169;

    @ObfuscatedName("ge.ar")
    public int field2187;

    @ObfuscatedName("ge.ag")
    public static int[] field2188 = new int[10000];

    @ObfuscatedName("ge.al")
    public static int[] field2189 = new int[10000];

    @ObfuscatedName("ge.aa")
    public static int field2190 = 0;

    @ObfuscatedName("ge.as")
    public static int[] field2191 = class194.field2276;

    @ObfuscatedName("ge.at")
    public static int[] field2151 = class194.field2271;

    public class189() {
    }

    @ObfuscatedName("ge.c(Lku;II)Lge;")
    public static class189 method3427(class302 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method5053(arg1, arg2);
        return var3 == null ? null : new class189(var3);
    }

    public class189(byte[] arg0) {
        class419 var2 = new class419(10);
        var2.method6654(-2);
        if (arg0[arg0.length - 1] == -3 && arg0[arg0.length - 2] == -1) {
            this.method3426(arg0);
        } else if (arg0[arg0.length - 1] == -2 && arg0[arg0.length - 2] == -1) {
            this.method3468(arg0);
        } else if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method3442(arg0);
        } else {
            this.method3431(arg0);
        }
    }

    @ObfuscatedName("ge.p([B)V")
    public void method3426(byte[] arg0) {
        class419 var2 = new class419(arg0);
        class419 var3 = new class419(arg0);
        class419 var4 = new class419(arg0);
        class419 var5 = new class419(arg0);
        class419 var6 = new class419(arg0);
        class419 var7 = new class419(arg0);
        class419 var8 = new class419(arg0);
        var2.field4475 = arg0.length - 26;
        int var9 = var2.method6672();
        int var10 = var2.method6672();
        int var11 = var2.method6781();
        int var12 = var2.method6781();
        int var13 = var2.method6781();
        int var14 = var2.method6781();
        int var15 = var2.method6781();
        int var16 = var2.method6781();
        int var17 = var2.method6781();
        int var18 = var2.method6781();
        int var19 = var2.method6672();
        int var20 = var2.method6672();
        int var21 = var2.method6672();
        int var22 = var2.method6672();
        int var23 = var2.method6672();
        int var24 = var2.method6672();
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        if (var11 > 0) {
            this.field2167 = new byte[var11];
            var2.field4475 = 0;
            for (int var28 = 0; var28 < var11; var28++) {
                byte var29 = this.field2167[var28] = var2.method6846();
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
        this.field2172 = var9;
        this.field2155 = var10;
        this.field2166 = var11;
        this.field2168 = new int[var9];
        this.field2185 = new int[var9];
        this.field2154 = new int[var9];
        this.field2156 = new int[var10];
        this.field2157 = new int[var10];
        this.field2158 = new int[var10];
        if (var17 == 1) {
            this.field2175 = new int[var9];
        }
        if (var12 == 1) {
            this.field2179 = new byte[var10];
        }
        if (var13 == 255) {
            this.field2160 = new byte[var10];
        } else {
            this.field2165 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2161 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2176 = new int[var10];
        }
        if (var16 == 1) {
            this.field2164 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field2162 = new byte[var10];
        }
        if (var18 == 1) {
            this.field2186 = new int[var9][];
            this.field2174 = new int[var9][];
        }
        this.field2163 = new short[var10];
        if (var11 > 0) {
            this.field2192 = new short[var11];
            this.field2149 = new short[var11];
            this.field2148 = new short[var11];
        }
        var2.field4475 = var11;
        var3.field4475 = var47;
        var4.field4475 = var49;
        var5.field4475 = var51;
        var6.field4475 = var35;
        int var67 = 0;
        int var68 = 0;
        int var69 = 0;
        for (int var70 = 0; var70 < var9; var70++) {
            int var71 = var2.method6781();
            int var72 = 0;
            if ((var71 & 0x1) != 0) {
                var72 = var3.method6799();
            }
            int var73 = 0;
            if ((var71 & 0x2) != 0) {
                var73 = var4.method6799();
            }
            int var74 = 0;
            if ((var71 & 0x4) != 0) {
                var74 = var5.method6799();
            }
            this.field2168[var70] = var67 + var72;
            this.field2185[var70] = var68 + var73;
            this.field2154[var70] = var69 + var74;
            var67 = this.field2168[var70];
            var68 = this.field2185[var70];
            var69 = this.field2154[var70];
            if (var17 == 1) {
                this.field2175[var70] = var6.method6781();
            }
        }
        if (var18 == 1) {
            for (int var75 = 0; var75 < var9; var75++) {
                int var76 = var6.method6781();
                this.field2186[var75] = new int[var76];
                this.field2174[var75] = new int[var76];
                for (int var77 = 0; var77 < var76; var77++) {
                    this.field2186[var75][var77] = var6.method6781();
                    this.field2174[var75][var77] = var6.method6781();
                }
            }
        }
        var2.field4475 = var45;
        var3.field4475 = var33;
        var4.field4475 = var36;
        var5.field4475 = var40;
        var6.field4475 = var37;
        var7.field4475 = var43;
        var8.field4475 = var42;
        for (int var78 = 0; var78 < var10; var78++) {
            this.field2163[var78] = (short) var2.method6672();
            if (var12 == 1) {
                this.field2179[var78] = var3.method6846();
            }
            if (var13 == 255) {
                this.field2160[var78] = var4.method6846();
            }
            if (var14 == 1) {
                this.field2161[var78] = var5.method6846();
            }
            if (var15 == 1) {
                this.field2176[var78] = var6.method6781();
            }
            if (var16 == 1) {
                this.field2164[var78] = (short) (var7.method6672() - 1);
            }
            if (this.field2162 != null && this.field2164[var78] != -1) {
                this.field2162[var78] = (byte) (var8.method6781() - 1);
            }
        }
        var2.field4475 = var39;
        var3.field4475 = var32;
        int var79 = 0;
        int var80 = 0;
        int var81 = 0;
        int var82 = 0;
        for (int var83 = 0; var83 < var10; var83++) {
            int var84 = var3.method6781();
            if (var84 == 1) {
                var79 = var2.method6799() + var82;
                var80 = var2.method6799() + var79;
                var81 = var2.method6799() + var80;
                var82 = var81;
                this.field2156[var83] = var79;
                this.field2157[var83] = var80;
                this.field2158[var83] = var81;
            }
            if (var84 == 2) {
                var80 = var81;
                var81 = var2.method6799() + var82;
                var82 = var81;
                this.field2156[var83] = var79;
                this.field2157[var83] = var80;
                this.field2158[var83] = var81;
            }
            if (var84 == 3) {
                var79 = var81;
                var81 = var2.method6799() + var82;
                var82 = var81;
                this.field2156[var83] = var79;
                this.field2157[var83] = var80;
                this.field2158[var83] = var81;
            }
            if (var84 == 4) {
                int var87 = var79;
                var79 = var80;
                var80 = var87;
                var81 = var2.method6799() + var82;
                var82 = var81;
                this.field2156[var83] = var79;
                this.field2157[var83] = var87;
                this.field2158[var83] = var81;
            }
        }
        var2.field4475 = var53;
        var3.field4475 = var55;
        var4.field4475 = var57;
        var5.field4475 = var59;
        var6.field4475 = var61;
        var7.field4475 = var63;
        for (int var88 = 0; var88 < var11; var88++) {
            int var89 = this.field2167[var88] & 0xFF;
            if (var89 == 0) {
                this.field2192[var88] = (short) var2.method6672();
                this.field2149[var88] = (short) var2.method6672();
                this.field2148[var88] = (short) var2.method6672();
            }
        }
        var2.field4475 = var65;
        int var90 = var2.method6781();
        if (var90 == 0) {
            return;
        }
        new class208();
        var2.method6672();
        var2.method6672();
        var2.method6672();
        var2.method6675();
    }

    @ObfuscatedName("ge.m([B)V")
    public void method3468(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class419 var4 = new class419(arg0);
        class419 var5 = new class419(arg0);
        class419 var6 = new class419(arg0);
        class419 var7 = new class419(arg0);
        class419 var8 = new class419(arg0);
        var4.field4475 = arg0.length - 23;
        int var9 = var4.method6672();
        int var10 = var4.method6672();
        int var11 = var4.method6781();
        int var12 = var4.method6781();
        int var13 = var4.method6781();
        int var14 = var4.method6781();
        int var15 = var4.method6781();
        int var16 = var4.method6781();
        int var17 = var4.method6781();
        int var18 = var4.method6672();
        int var19 = var4.method6672();
        int var20 = var4.method6672();
        int var21 = var4.method6672();
        int var22 = var4.method6672();
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
        this.field2172 = var9;
        this.field2155 = var10;
        this.field2166 = var11;
        this.field2168 = new int[var9];
        this.field2185 = new int[var9];
        this.field2154 = new int[var9];
        this.field2156 = new int[var10];
        this.field2157 = new int[var10];
        this.field2158 = new int[var10];
        if (var11 > 0) {
            this.field2167 = new byte[var11];
            this.field2192 = new short[var11];
            this.field2149 = new short[var11];
            this.field2148 = new short[var11];
        }
        if (var16 == 1) {
            this.field2175 = new int[var9];
        }
        if (var12 == 1) {
            this.field2179 = new byte[var10];
            this.field2162 = new byte[var10];
            this.field2164 = new short[var10];
        }
        if (var13 == 255) {
            this.field2160 = new byte[var10];
        } else {
            this.field2165 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2161 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2176 = new int[var10];
        }
        if (var17 == 1) {
            this.field2186 = new int[var9][];
            this.field2174 = new int[var9][];
        }
        this.field2163 = new short[var10];
        var4.field4475 = var23;
        var5.field4475 = var39;
        var6.field4475 = var41;
        var7.field4475 = var43;
        var8.field4475 = var27;
        int var46 = 0;
        int var47 = 0;
        int var48 = 0;
        for (int var49 = 0; var49 < var9; var49++) {
            int var50 = var4.method6781();
            int var51 = 0;
            if ((var50 & 0x1) != 0) {
                var51 = var5.method6799();
            }
            int var52 = 0;
            if ((var50 & 0x2) != 0) {
                var52 = var6.method6799();
            }
            int var53 = 0;
            if ((var50 & 0x4) != 0) {
                var53 = var7.method6799();
            }
            this.field2168[var49] = var46 + var51;
            this.field2185[var49] = var47 + var52;
            this.field2154[var49] = var48 + var53;
            var46 = this.field2168[var49];
            var47 = this.field2185[var49];
            var48 = this.field2154[var49];
            if (var16 == 1) {
                this.field2175[var49] = var8.method6781();
            }
        }
        if (var17 == 1) {
            for (int var54 = 0; var54 < var9; var54++) {
                int var55 = var8.method6781();
                this.field2186[var54] = new int[var55];
                this.field2174[var54] = new int[var55];
                for (int var56 = 0; var56 < var55; var56++) {
                    this.field2186[var54][var56] = var8.method6781();
                    this.field2174[var54][var56] = var8.method6781();
                }
            }
        }
        var4.field4475 = var35;
        var5.field4475 = var30;
        var6.field4475 = var28;
        var7.field4475 = var33;
        var8.field4475 = var29;
        for (int var57 = 0; var57 < var10; var57++) {
            this.field2163[var57] = (short) var4.method6672();
            if (var12 == 1) {
                int var58 = var5.method6781();
                if ((var58 & 0x1) == 1) {
                    this.field2179[var57] = 1;
                    var2 = true;
                } else {
                    this.field2179[var57] = 0;
                }
                if ((var58 & 0x2) == 2) {
                    this.field2162[var57] = (byte) (var58 >> 2);
                    this.field2164[var57] = this.field2163[var57];
                    this.field2163[var57] = 127;
                    if (this.field2164[var57] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field2162[var57] = -1;
                    this.field2164[var57] = -1;
                }
            }
            if (var13 == 255) {
                this.field2160[var57] = var6.method6846();
            }
            if (var14 == 1) {
                this.field2161[var57] = var7.method6846();
            }
            if (var15 == 1) {
                this.field2176[var57] = var8.method6781();
            }
        }
        var4.field4475 = var32;
        var5.field4475 = var25;
        int var59 = 0;
        int var60 = 0;
        int var61 = 0;
        int var62 = 0;
        for (int var63 = 0; var63 < var10; var63++) {
            int var64 = var5.method6781();
            if (var64 == 1) {
                var59 = var4.method6799() + var62;
                var60 = var4.method6799() + var59;
                var61 = var4.method6799() + var60;
                var62 = var61;
                this.field2156[var63] = var59;
                this.field2157[var63] = var60;
                this.field2158[var63] = var61;
            }
            if (var64 == 2) {
                var60 = var61;
                var61 = var4.method6799() + var62;
                var62 = var61;
                this.field2156[var63] = var59;
                this.field2157[var63] = var60;
                this.field2158[var63] = var61;
            }
            if (var64 == 3) {
                var59 = var61;
                var61 = var4.method6799() + var62;
                var62 = var61;
                this.field2156[var63] = var59;
                this.field2157[var63] = var60;
                this.field2158[var63] = var61;
            }
            if (var64 == 4) {
                int var67 = var59;
                var59 = var60;
                var60 = var67;
                var61 = var4.method6799() + var62;
                var62 = var61;
                this.field2156[var63] = var59;
                this.field2157[var63] = var67;
                this.field2158[var63] = var61;
            }
        }
        var4.field4475 = var37;
        for (int var68 = 0; var68 < var11; var68++) {
            this.field2167[var68] = 0;
            this.field2192[var68] = (short) var4.method6672();
            this.field2149[var68] = (short) var4.method6672();
            this.field2148[var68] = (short) var4.method6672();
        }
        if (this.field2162 != null) {
            boolean var69 = false;
            for (int var70 = 0; var70 < var10; var70++) {
                int var71 = this.field2162[var70] & 0xFF;
                if (var71 != 255) {
                    if ((this.field2192[var71] & 0xFFFF) == this.field2156[var70] && (this.field2149[var71] & 0xFFFF) == this.field2157[var70] && (this.field2148[var71] & 0xFFFF) == this.field2158[var70]) {
                        this.field2162[var70] = -1;
                    } else {
                        var69 = true;
                    }
                }
            }
            if (!var69) {
                this.field2162 = null;
            }
        }
        if (!var3) {
            this.field2164 = null;
        }
        if (!var2) {
            this.field2179 = null;
        }
    }

    @ObfuscatedName("ge.t([B)V")
    public void method3442(byte[] arg0) {
        class419 var2 = new class419(arg0);
        class419 var3 = new class419(arg0);
        class419 var4 = new class419(arg0);
        class419 var5 = new class419(arg0);
        class419 var6 = new class419(arg0);
        class419 var7 = new class419(arg0);
        class419 var8 = new class419(arg0);
        var2.field4475 = arg0.length - 23;
        int var9 = var2.method6672();
        int var10 = var2.method6672();
        int var11 = var2.method6781();
        int var12 = var2.method6781();
        int var13 = var2.method6781();
        int var14 = var2.method6781();
        int var15 = var2.method6781();
        int var16 = var2.method6781();
        int var17 = var2.method6781();
        int var18 = var2.method6672();
        int var19 = var2.method6672();
        int var20 = var2.method6672();
        int var21 = var2.method6672();
        int var22 = var2.method6672();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field2167 = new byte[var11];
            var2.field4475 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field2167[var26] = var2.method6846();
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
        this.field2172 = var9;
        this.field2155 = var10;
        this.field2166 = var11;
        this.field2168 = new int[var9];
        this.field2185 = new int[var9];
        this.field2154 = new int[var9];
        this.field2156 = new int[var10];
        this.field2157 = new int[var10];
        this.field2158 = new int[var10];
        if (var17 == 1) {
            this.field2175 = new int[var9];
        }
        if (var12 == 1) {
            this.field2179 = new byte[var10];
        }
        if (var13 == 255) {
            this.field2160 = new byte[var10];
        } else {
            this.field2165 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2161 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2176 = new int[var10];
        }
        if (var16 == 1) {
            this.field2164 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field2162 = new byte[var10];
        }
        this.field2163 = new short[var10];
        if (var11 > 0) {
            this.field2192 = new short[var11];
            this.field2149 = new short[var11];
            this.field2148 = new short[var11];
        }
        var2.field4475 = var11;
        var3.field4475 = var44;
        var4.field4475 = var46;
        var5.field4475 = var48;
        var6.field4475 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method6781();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method6799();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method6799();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method6799();
            }
            this.field2168[var67] = var64 + var69;
            this.field2185[var67] = var65 + var70;
            this.field2154[var67] = var66 + var71;
            var64 = this.field2168[var67];
            var65 = this.field2185[var67];
            var66 = this.field2154[var67];
            if (var17 == 1) {
                this.field2175[var67] = var6.method6781();
            }
        }
        var2.field4475 = var42;
        var3.field4475 = var31;
        var4.field4475 = var34;
        var5.field4475 = var37;
        var6.field4475 = var35;
        var7.field4475 = var40;
        var8.field4475 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field2163[var72] = (short) var2.method6672();
            if (var12 == 1) {
                this.field2179[var72] = var3.method6846();
            }
            if (var13 == 255) {
                this.field2160[var72] = var4.method6846();
            }
            if (var14 == 1) {
                this.field2161[var72] = var5.method6846();
            }
            if (var15 == 1) {
                this.field2176[var72] = var6.method6781();
            }
            if (var16 == 1) {
                this.field2164[var72] = (short) (var7.method6672() - 1);
            }
            if (this.field2162 != null && this.field2164[var72] != -1) {
                this.field2162[var72] = (byte) (var8.method6781() - 1);
            }
        }
        var2.field4475 = var33;
        var3.field4475 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method6781();
            if (var78 == 1) {
                var73 = var2.method6799() + var76;
                var74 = var2.method6799() + var73;
                var75 = var2.method6799() + var74;
                var76 = var75;
                this.field2156[var77] = var73;
                this.field2157[var77] = var74;
                this.field2158[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method6799() + var76;
                var76 = var75;
                this.field2156[var77] = var73;
                this.field2157[var77] = var74;
                this.field2158[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method6799() + var76;
                var76 = var75;
                this.field2156[var77] = var73;
                this.field2157[var77] = var74;
                this.field2158[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method6799() + var76;
                var76 = var75;
                this.field2156[var77] = var73;
                this.field2157[var77] = var81;
                this.field2158[var77] = var75;
            }
        }
        var2.field4475 = var50;
        var3.field4475 = var52;
        var4.field4475 = var54;
        var5.field4475 = var56;
        var6.field4475 = var58;
        var7.field4475 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field2167[var82] & 0xFF;
            if (var83 == 0) {
                this.field2192[var82] = (short) var2.method6672();
                this.field2149[var82] = (short) var2.method6672();
                this.field2148[var82] = (short) var2.method6672();
            }
        }
        var2.field4475 = var62;
        int var84 = var2.method6781();
        if (var84 == 0) {
            return;
        }
        new class208();
        var2.method6672();
        var2.method6672();
        var2.method6672();
        var2.method6675();
    }

    @ObfuscatedName("ge.r([B)V")
    public void method3431(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class419 var4 = new class419(arg0);
        class419 var5 = new class419(arg0);
        class419 var6 = new class419(arg0);
        class419 var7 = new class419(arg0);
        class419 var8 = new class419(arg0);
        var4.field4475 = arg0.length - 18;
        int var9 = var4.method6672();
        int var10 = var4.method6672();
        int var11 = var4.method6781();
        int var12 = var4.method6781();
        int var13 = var4.method6781();
        int var14 = var4.method6781();
        int var15 = var4.method6781();
        int var16 = var4.method6781();
        int var17 = var4.method6672();
        int var18 = var4.method6672();
        int var19 = var4.method6672();
        int var20 = var4.method6672();
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
        this.field2172 = var9;
        this.field2155 = var10;
        this.field2166 = var11;
        this.field2168 = new int[var9];
        this.field2185 = new int[var9];
        this.field2154 = new int[var9];
        this.field2156 = new int[var10];
        this.field2157 = new int[var10];
        this.field2158 = new int[var10];
        if (var11 > 0) {
            this.field2167 = new byte[var11];
            this.field2192 = new short[var11];
            this.field2149 = new short[var11];
            this.field2148 = new short[var11];
        }
        if (var16 == 1) {
            this.field2175 = new int[var9];
        }
        if (var12 == 1) {
            this.field2179 = new byte[var10];
            this.field2162 = new byte[var10];
            this.field2164 = new short[var10];
        }
        if (var13 == 255) {
            this.field2160 = new byte[var10];
        } else {
            this.field2165 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2161 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2176 = new int[var10];
        }
        this.field2163 = new short[var10];
        var4.field4475 = var21;
        var5.field4475 = var36;
        var6.field4475 = var38;
        var7.field4475 = var40;
        var8.field4475 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method6781();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method6799();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method6799();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method6799();
            }
            this.field2168[var46] = var43 + var48;
            this.field2185[var46] = var44 + var49;
            this.field2154[var46] = var45 + var50;
            var43 = this.field2168[var46];
            var44 = this.field2185[var46];
            var45 = this.field2154[var46];
            if (var16 == 1) {
                this.field2175[var46] = var8.method6781();
            }
        }
        var4.field4475 = var32;
        var5.field4475 = var28;
        var6.field4475 = var26;
        var7.field4475 = var30;
        var8.field4475 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field2163[var51] = (short) var4.method6672();
            if (var12 == 1) {
                int var52 = var5.method6781();
                if ((var52 & 0x1) == 1) {
                    this.field2179[var51] = 1;
                    var2 = true;
                } else {
                    this.field2179[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field2162[var51] = (byte) (var52 >> 2);
                    this.field2164[var51] = this.field2163[var51];
                    this.field2163[var51] = 127;
                    if (this.field2164[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field2162[var51] = -1;
                    this.field2164[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field2160[var51] = var6.method6846();
            }
            if (var14 == 1) {
                this.field2161[var51] = var7.method6846();
            }
            if (var15 == 1) {
                this.field2176[var51] = var8.method6781();
            }
        }
        var4.field4475 = var25;
        var5.field4475 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method6781();
            if (var58 == 1) {
                var53 = var4.method6799() + var56;
                var54 = var4.method6799() + var53;
                var55 = var4.method6799() + var54;
                var56 = var55;
                this.field2156[var57] = var53;
                this.field2157[var57] = var54;
                this.field2158[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method6799() + var56;
                var56 = var55;
                this.field2156[var57] = var53;
                this.field2157[var57] = var54;
                this.field2158[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method6799() + var56;
                var56 = var55;
                this.field2156[var57] = var53;
                this.field2157[var57] = var54;
                this.field2158[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method6799() + var56;
                var56 = var55;
                this.field2156[var57] = var53;
                this.field2157[var57] = var61;
                this.field2158[var57] = var55;
            }
        }
        var4.field4475 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field2167[var62] = 0;
            this.field2192[var62] = (short) var4.method6672();
            this.field2149[var62] = (short) var4.method6672();
            this.field2148[var62] = (short) var4.method6672();
        }
        if (this.field2162 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field2162[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field2192[var65] & 0xFFFF) == this.field2156[var64] && (this.field2149[var65] & 0xFFFF) == this.field2157[var64] && (this.field2148[var65] & 0xFFFF) == this.field2158[var64]) {
                        this.field2162[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field2162 = null;
            }
        }
        if (!var3) {
            this.field2164 = null;
        }
        if (!var2) {
            this.field2179 = null;
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
        this.field2172 = 0;
        this.field2155 = 0;
        this.field2166 = 0;
        this.field2165 = -1;
        for (int var10 = 0; var10 < arg1; var10++) {
            class189 var11 = arg0[var10];
            if (var11 != null) {
                this.field2172 += var11.field2172;
                this.field2155 += var11.field2155;
                this.field2166 += var11.field2166;
                if (var11.field2160 == null) {
                    if (this.field2165 == -1) {
                        this.field2165 = var11.field2165;
                    }
                    if (this.field2165 != var11.field2165) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var11.field2179 != null;
                var5 |= var11.field2161 != null;
                var6 |= var11.field2176 != null;
                var7 |= var11.field2164 != null;
                var8 |= var11.field2162 != null;
                var9 |= var11.field2186 != null;
            }
        }
        this.field2168 = new int[this.field2172];
        this.field2185 = new int[this.field2172];
        this.field2154 = new int[this.field2172];
        this.field2175 = new int[this.field2172];
        this.field2156 = new int[this.field2155];
        this.field2157 = new int[this.field2155];
        this.field2158 = new int[this.field2155];
        if (var3) {
            this.field2179 = new byte[this.field2155];
        }
        if (var4) {
            this.field2160 = new byte[this.field2155];
        }
        if (var5) {
            this.field2161 = new byte[this.field2155];
        }
        if (var6) {
            this.field2176 = new int[this.field2155];
        }
        if (var7) {
            this.field2164 = new short[this.field2155];
        }
        if (var8) {
            this.field2162 = new byte[this.field2155];
        }
        if (var9) {
            this.field2186 = new int[this.field2172][];
            this.field2174 = new int[this.field2172][];
        }
        this.field2163 = new short[this.field2155];
        if (this.field2166 > 0) {
            this.field2167 = new byte[this.field2166];
            this.field2192 = new short[this.field2166];
            this.field2149 = new short[this.field2166];
            this.field2148 = new short[this.field2166];
        }
        this.field2172 = 0;
        this.field2155 = 0;
        this.field2166 = 0;
        for (int var12 = 0; var12 < arg1; var12++) {
            class189 var13 = arg0[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < var13.field2155; var14++) {
                    if (var3 && var13.field2179 != null) {
                        this.field2179[this.field2155] = var13.field2179[var14];
                    }
                    if (var4) {
                        if (var13.field2160 == null) {
                            this.field2160[this.field2155] = var13.field2165;
                        } else {
                            this.field2160[this.field2155] = var13.field2160[var14];
                        }
                    }
                    if (var5 && var13.field2161 != null) {
                        this.field2161[this.field2155] = var13.field2161[var14];
                    }
                    if (var6 && var13.field2176 != null) {
                        this.field2176[this.field2155] = var13.field2176[var14];
                    }
                    if (var7) {
                        if (var13.field2164 == null) {
                            this.field2164[this.field2155] = -1;
                        } else {
                            this.field2164[this.field2155] = var13.field2164[var14];
                        }
                    }
                    if (var8) {
                        if (var13.field2162 == null || var13.field2162[var14] == -1) {
                            this.field2162[this.field2155] = -1;
                        } else {
                            this.field2162[this.field2155] = (byte) (var13.field2162[var14] + this.field2166);
                        }
                    }
                    this.field2163[this.field2155] = var13.field2163[var14];
                    this.field2156[this.field2155] = this.method3446(var13, var13.field2156[var14]);
                    this.field2157[this.field2155] = this.method3446(var13, var13.field2157[var14]);
                    this.field2158[this.field2155] = this.method3446(var13, var13.field2158[var14]);
                    this.field2155++;
                }
                for (int var15 = 0; var15 < var13.field2166; var15++) {
                    byte var16 = this.field2167[this.field2166] = var13.field2167[var15];
                    if (var16 == 0) {
                        this.field2192[this.field2166] = (short) this.method3446(var13, var13.field2192[var15]);
                        this.field2149[this.field2166] = (short) this.method3446(var13, var13.field2149[var15]);
                        this.field2148[this.field2166] = (short) this.method3446(var13, var13.field2148[var15]);
                    }
                    this.field2166++;
                }
            }
        }
    }

    @ObfuscatedName("ge.o(Lge;I)I")
    public final int method3446(class189 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field2168[arg1];
        int var5 = arg0.field2185[arg1];
        int var6 = arg0.field2154[arg1];
        for (int var7 = 0; var7 < this.field2172; var7++) {
            if (this.field2168[var7] == var4 && this.field2185[var7] == var5 && this.field2154[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field2168[this.field2172] = var4;
            this.field2185[this.field2172] = var5;
            this.field2154[this.field2172] = var6;
            if (arg0.field2175 != null) {
                this.field2175[this.field2172] = arg0.field2175[arg1];
            }
            if (arg0.field2186 != null) {
                this.field2186[this.field2172] = arg0.field2186[arg1];
                this.field2174[this.field2172] = arg0.field2174[arg1];
            }
            var3 = this.field2172++;
        }
        return var3;
    }

    public class189(class189 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field2172 = arg0.field2172;
        this.field2155 = arg0.field2155;
        this.field2166 = arg0.field2166;
        if (arg1) {
            this.field2168 = arg0.field2168;
            this.field2185 = arg0.field2185;
            this.field2154 = arg0.field2154;
        } else {
            this.field2168 = new int[this.field2172];
            this.field2185 = new int[this.field2172];
            this.field2154 = new int[this.field2172];
            for (int var6 = 0; var6 < this.field2172; var6++) {
                this.field2168[var6] = arg0.field2168[var6];
                this.field2185[var6] = arg0.field2185[var6];
                this.field2154[var6] = arg0.field2154[var6];
            }
        }
        if (arg2) {
            this.field2163 = arg0.field2163;
        } else {
            this.field2163 = new short[this.field2155];
            for (int var7 = 0; var7 < this.field2155; var7++) {
                this.field2163[var7] = arg0.field2163[var7];
            }
        }
        if (arg3 || arg0.field2164 == null) {
            this.field2164 = arg0.field2164;
        } else {
            this.field2164 = new short[this.field2155];
            for (int var8 = 0; var8 < this.field2155; var8++) {
                this.field2164[var8] = arg0.field2164[var8];
            }
        }
        if (arg4) {
            this.field2161 = arg0.field2161;
        } else {
            this.field2161 = new byte[this.field2155];
            if (arg0.field2161 == null) {
                for (int var9 = 0; var9 < this.field2155; var9++) {
                    this.field2161[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field2155; var10++) {
                    this.field2161[var10] = arg0.field2161[var10];
                }
            }
        }
        this.field2156 = arg0.field2156;
        this.field2157 = arg0.field2157;
        this.field2158 = arg0.field2158;
        this.field2179 = arg0.field2179;
        this.field2160 = arg0.field2160;
        this.field2162 = arg0.field2162;
        this.field2165 = arg0.field2165;
        this.field2167 = arg0.field2167;
        this.field2192 = arg0.field2192;
        this.field2149 = arg0.field2149;
        this.field2148 = arg0.field2148;
        this.field2175 = arg0.field2175;
        this.field2176 = arg0.field2176;
        this.field2173 = arg0.field2173;
        this.field2171 = arg0.field2171;
        this.field2178 = arg0.field2178;
        this.field2184 = arg0.field2184;
        this.field2152 = arg0.field2152;
        this.field2186 = arg0.field2186;
        this.field2174 = arg0.field2174;
        this.field2170 = arg0.field2170;
        this.field2181 = arg0.field2181;
    }

    @ObfuscatedName("ge.v()Lge;")
    public class189 method3435() {
        class189 var1 = new class189();
        if (this.field2179 != null) {
            var1.field2179 = new byte[this.field2155];
            for (int var2 = 0; var2 < this.field2155; var2++) {
                var1.field2179[var2] = this.field2179[var2];
            }
        }
        var1.field2172 = this.field2172;
        var1.field2155 = this.field2155;
        var1.field2166 = this.field2166;
        var1.field2168 = this.field2168;
        var1.field2185 = this.field2185;
        var1.field2154 = this.field2154;
        var1.field2156 = this.field2156;
        var1.field2157 = this.field2157;
        var1.field2158 = this.field2158;
        var1.field2160 = this.field2160;
        var1.field2161 = this.field2161;
        var1.field2162 = this.field2162;
        var1.field2163 = this.field2163;
        var1.field2164 = this.field2164;
        var1.field2165 = this.field2165;
        var1.field2167 = this.field2167;
        var1.field2192 = this.field2192;
        var1.field2149 = this.field2149;
        var1.field2148 = this.field2148;
        var1.field2175 = this.field2175;
        var1.field2176 = this.field2176;
        var1.field2173 = this.field2173;
        var1.field2171 = this.field2171;
        var1.field2178 = this.field2178;
        var1.field2184 = this.field2184;
        var1.field2170 = this.field2170;
        var1.field2181 = this.field2181;
        return var1;
    }

    @ObfuscatedName("ge.d([[IIIIZI)Lge;")
    public class189 method3436(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method3448();
        int var7 = this.field2177 + arg1;
        int var8 = this.field2153 + arg1;
        int var9 = this.field2187 + arg3;
        int var10 = this.field2169 + arg3;
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
            var15.field2172 = this.field2172;
            var15.field2155 = this.field2155;
            var15.field2166 = this.field2166;
            var15.field2168 = this.field2168;
            var15.field2154 = this.field2154;
            var15.field2156 = this.field2156;
            var15.field2157 = this.field2157;
            var15.field2158 = this.field2158;
            var15.field2179 = this.field2179;
            var15.field2160 = this.field2160;
            var15.field2161 = this.field2161;
            var15.field2162 = this.field2162;
            var15.field2163 = this.field2163;
            var15.field2164 = this.field2164;
            var15.field2165 = this.field2165;
            var15.field2167 = this.field2167;
            var15.field2192 = this.field2192;
            var15.field2149 = this.field2149;
            var15.field2148 = this.field2148;
            var15.field2175 = this.field2175;
            var15.field2176 = this.field2176;
            var15.field2173 = this.field2173;
            var15.field2171 = this.field2171;
            var15.field2170 = this.field2170;
            var15.field2181 = this.field2181;
            var15.field2185 = new int[var15.field2172];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field2172; var16++) {
                int var17 = this.field2168[var16] + arg1;
                int var18 = this.field2154[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field2185[var16] = this.field2185[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field2172; var26++) {
                int var27 = (-this.field2185[var26] << 16) / this.field2360;
                if (var27 < arg5) {
                    int var28 = this.field2168[var26] + arg1;
                    int var29 = this.field2154[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field2185[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field2185[var26];
                }
            }
        }
        var15.method3447();
        return var15;
    }

    @ObfuscatedName("ge.h()V")
    public void method3437() {
        int var10002;
        if (this.field2175 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field2172; var3++) {
                int var4 = this.field2175[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field2173 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field2173[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field2172) {
                int var7 = this.field2175[var6];
                this.field2173[var7][var1[var7]++] = var6++;
            }
            this.field2175 = null;
        }
        if (this.field2176 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field2155; var10++) {
            int var11 = this.field2176[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field2171 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field2171[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field2155) {
            int var14 = this.field2176[var13];
            this.field2171[var14][var8[var14]++] = var13++;
        }
        this.field2176 = null;
    }

    @ObfuscatedName("ge.g()V")
    public void method3438() {
        for (int var1 = 0; var1 < this.field2172; var1++) {
            int var2 = this.field2168[var1];
            this.field2168[var1] = this.field2154[var1];
            this.field2154[var1] = -var2;
        }
        this.method3447();
    }

    @ObfuscatedName("ge.e()V")
    public void method3439() {
        for (int var1 = 0; var1 < this.field2172; var1++) {
            this.field2168[var1] = -this.field2168[var1];
            this.field2154[var1] = -this.field2154[var1];
        }
        this.method3447();
    }

    @ObfuscatedName("ge.a()V")
    public void method3440() {
        for (int var1 = 0; var1 < this.field2172; var1++) {
            int var2 = this.field2154[var1];
            this.field2154[var1] = this.field2168[var1];
            this.field2168[var1] = -var2;
        }
        this.method3447();
    }

    @ObfuscatedName("ge.u(I)V")
    public void method3441(int arg0) {
        int var2 = field2191[arg0];
        int var3 = field2151[arg0];
        for (int var4 = 0; var4 < this.field2172; var4++) {
            int var5 = this.field2168[var4] * var3 + this.field2154[var4] * var2 >> 16;
            this.field2154[var4] = this.field2154[var4] * var3 - this.field2168[var4] * var2 >> 16;
            this.field2168[var4] = var5;
        }
        this.method3447();
    }

    @ObfuscatedName("ge.k(III)V")
    public void method3459(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2172; var4++) {
            this.field2168[var4] += arg0;
            this.field2185[var4] += arg1;
            this.field2154[var4] += arg2;
        }
        this.method3447();
    }

    @ObfuscatedName("ge.f(SS)V")
    public void method3443(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2155; var3++) {
            if (this.field2163[var3] == arg0) {
                this.field2163[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("ge.l(SS)V")
    public void method3456(short arg0, short arg1) {
        if (this.field2164 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field2155; var3++) {
            if (this.field2164[var3] == arg0) {
                this.field2164[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("ge.q()V")
    public void method3445() {
        for (int var1 = 0; var1 < this.field2172; var1++) {
            this.field2154[var1] = -this.field2154[var1];
        }
        for (int var2 = 0; var2 < this.field2155; var2++) {
            int var3 = this.field2156[var2];
            this.field2156[var2] = this.field2158[var2];
            this.field2158[var2] = var3;
        }
        this.method3447();
    }

    @ObfuscatedName("ge.x(III)V")
    public void method3453(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2172; var4++) {
            this.field2168[var4] = this.field2168[var4] * arg0 / 128;
            this.field2185[var4] = this.field2185[var4] * arg1 / 128;
            this.field2154[var4] = this.field2154[var4] * arg2 / 128;
        }
        this.method3447();
    }

    @ObfuscatedName("ge.z()V")
    public void method3471() {
        if (this.field2178 != null) {
            return;
        }
        this.field2178 = new class206[this.field2172];
        for (int var1 = 0; var1 < this.field2172; var1++) {
            this.field2178[var1] = new class206();
        }
        for (int var2 = 0; var2 < this.field2155; var2++) {
            int var3 = this.field2156[var2];
            int var4 = this.field2157[var2];
            int var5 = this.field2158[var2];
            int var6 = this.field2168[var4] - this.field2168[var3];
            int var7 = this.field2185[var4] - this.field2185[var3];
            int var8 = this.field2154[var4] - this.field2154[var3];
            int var9 = this.field2168[var5] - this.field2168[var3];
            int var10 = this.field2185[var5] - this.field2185[var3];
            int var11 = this.field2154[var5] - this.field2154[var3];
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
            if (this.field2179 == null) {
                var19 = 0;
            } else {
                var19 = this.field2179[var2];
            }
            if (var19 == 0) {
                class206 var20 = this.field2178[var3];
                var20.field2512 += var16;
                var20.field2513 += var17;
                var20.field2508 += var18;
                var20.field2511++;
                class206 var21 = this.field2178[var4];
                var21.field2512 += var16;
                var21.field2513 += var17;
                var21.field2508 += var18;
                var21.field2511++;
                class206 var22 = this.field2178[var5];
                var22.field2512 += var16;
                var22.field2513 += var17;
                var22.field2508 += var18;
                var22.field2511++;
            } else if (var19 == 1) {
                if (this.field2184 == null) {
                    this.field2184 = new class199[this.field2155];
                }
                class199 var23 = this.field2184[var2] = new class199();
                var23.field2365 = var16;
                var23.field2362 = var17;
                var23.field2363 = var18;
            }
        }
    }

    @ObfuscatedName("ge.i()V")
    public void method3447() {
        this.field2178 = null;
        this.field2152 = null;
        this.field2184 = null;
        this.field2182 = false;
    }

    @ObfuscatedName("ge.y()V")
    public void method3448() {
        if (this.field2182) {
            return;
        }
        this.field2360 = 0;
        this.field2183 = 0;
        this.field2177 = 999999;
        this.field2153 = -999999;
        this.field2169 = -99999;
        this.field2187 = 99999;
        for (int var1 = 0; var1 < this.field2172; var1++) {
            int var2 = this.field2168[var1];
            int var3 = this.field2185[var1];
            int var4 = this.field2154[var1];
            if (var2 < this.field2177) {
                this.field2177 = var2;
            }
            if (var2 > this.field2153) {
                this.field2153 = var2;
            }
            if (var4 < this.field2187) {
                this.field2187 = var4;
            }
            if (var4 > this.field2169) {
                this.field2169 = var4;
            }
            if (-var3 > this.field2360) {
                this.field2360 = -var3;
            }
            if (var3 > this.field2183) {
                this.field2183 = var3;
            }
        }
        this.field2182 = true;
    }

    @ObfuscatedName("ge.ah(Lge;Lge;IIIZ)V")
    public static void method3496(class189 arg0, class189 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method3448();
        arg0.method3471();
        arg1.method3448();
        arg1.method3471();
        field2190++;
        int var6 = 0;
        int[] var7 = arg1.field2168;
        int var8 = arg1.field2172;
        for (int var9 = 0; var9 < arg0.field2172; var9++) {
            class206 var10 = arg0.field2178[var9];
            if (var10.field2511 != 0) {
                int var11 = arg0.field2185[var9] - arg3;
                if (var11 <= arg1.field2183) {
                    int var12 = arg0.field2168[var9] - arg2;
                    if (var12 >= arg1.field2177 && var12 <= arg1.field2153) {
                        int var13 = arg0.field2154[var9] - arg4;
                        if (var13 >= arg1.field2187 && var13 <= arg1.field2169) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class206 var15 = arg1.field2178[var14];
                                if (var7[var14] == var12 && arg1.field2154[var14] == var13 && arg1.field2185[var14] == var11 && var15.field2511 != 0) {
                                    if (arg0.field2152 == null) {
                                        arg0.field2152 = new class206[arg0.field2172];
                                    }
                                    if (arg1.field2152 == null) {
                                        arg1.field2152 = new class206[var8];
                                    }
                                    class206 var16 = arg0.field2152[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field2152[var9] = new class206(var10);
                                    }
                                    class206 var17 = arg1.field2152[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field2152[var14] = new class206(var15);
                                    }
                                    var16.field2512 += var15.field2512;
                                    var16.field2513 += var15.field2513;
                                    var16.field2508 += var15.field2508;
                                    var16.field2511 += var15.field2511;
                                    var17.field2512 += var10.field2512;
                                    var17.field2513 += var10.field2513;
                                    var17.field2508 += var10.field2508;
                                    var17.field2511 += var10.field2511;
                                    var6++;
                                    field2188[var9] = field2190;
                                    field2189[var14] = field2190;
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
        for (int var18 = 0; var18 < arg0.field2155; var18++) {
            if (field2188[arg0.field2156[var18]] == field2190 && field2188[arg0.field2157[var18]] == field2190 && field2188[arg0.field2158[var18]] == field2190) {
                if (arg0.field2179 == null) {
                    arg0.field2179 = new byte[arg0.field2155];
                }
                arg0.field2179[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field2155; var19++) {
            if (field2189[arg1.field2156[var19]] == field2190 && field2189[arg1.field2157[var19]] == field2190 && field2189[arg1.field2158[var19]] == field2190) {
                if (arg1.field2179 == null) {
                    arg1.field2179 = new byte[arg1.field2155];
                }
                arg1.field2179[var19] = 2;
            }
        }
    }

    @ObfuscatedName("ge.ao(IIIII)Lgo;")
    public final class204 method3450(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method3471();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class204 var8 = new class204();
        var8.field2474 = new int[this.field2155];
        var8.field2436 = new int[this.field2155];
        var8.field2437 = new int[this.field2155];
        if (this.field2166 > 0 && this.field2162 != null) {
            int[] var9 = new int[this.field2166];
            for (int var10 = 0; var10 < this.field2155; var10++) {
                if (this.field2162[var10] != -1) {
                    var9[this.field2162[var10] & 0xFF]++;
                }
            }
            var8.field2443 = 0;
            for (int var11 = 0; var11 < this.field2166; var11++) {
                if (var9[var11] > 0 && this.field2167[var11] == 0) {
                    var8.field2443++;
                }
            }
            var8.field2444 = new int[var8.field2443];
            var8.field2472 = new int[var8.field2443];
            var8.field2446 = new int[var8.field2443];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field2166; var13++) {
                if (var9[var13] > 0 && this.field2167[var13] == 0) {
                    var8.field2444[var12] = this.field2192[var13] & 0xFFFF;
                    var8.field2472[var12] = this.field2149[var13] & 0xFFFF;
                    var8.field2446[var12] = this.field2148[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field2440 = new byte[this.field2155];
            for (int var14 = 0; var14 < this.field2155; var14++) {
                if (this.field2162[var14] == -1) {
                    var8.field2440[var14] = -1;
                } else {
                    var8.field2440[var14] = (byte) var9[this.field2162[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field2155; var15++) {
            byte var16;
            if (this.field2179 == null) {
                var16 = 0;
            } else {
                var16 = this.field2179[var15];
            }
            byte var17;
            if (this.field2161 == null) {
                var17 = 0;
            } else {
                var17 = this.field2161[var15];
            }
            short var18;
            if (this.field2164 == null) {
                var18 = -1;
            } else {
                var18 = this.field2164[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field2163[var15] & 0xFFFF;
                    class206 var20;
                    if (this.field2152 == null || this.field2152[this.field2156[var15]] == null) {
                        var20 = this.field2178[this.field2156[var15]];
                    } else {
                        var20 = this.field2152[this.field2156[var15]];
                    }
                    int var21 = (var20.field2508 * arg4 + var20.field2513 * arg3 + var20.field2512 * arg2) / (var20.field2511 * var7) + arg0;
                    var8.field2474[var15] = method3451(var19, var21);
                    class206 var22;
                    if (this.field2152 == null || this.field2152[this.field2157[var15]] == null) {
                        var22 = this.field2178[this.field2157[var15]];
                    } else {
                        var22 = this.field2152[this.field2157[var15]];
                    }
                    int var23 = (var22.field2508 * arg4 + var22.field2513 * arg3 + var22.field2512 * arg2) / (var22.field2511 * var7) + arg0;
                    var8.field2436[var15] = method3451(var19, var23);
                    class206 var24;
                    if (this.field2152 == null || this.field2152[this.field2158[var15]] == null) {
                        var24 = this.field2178[this.field2158[var15]];
                    } else {
                        var24 = this.field2152[this.field2158[var15]];
                    }
                    int var25 = (var24.field2508 * arg4 + var24.field2513 * arg3 + var24.field2512 * arg2) / (var24.field2511 * var7) + arg0;
                    var8.field2437[var15] = method3451(var19, var25);
                } else if (var16 == 1) {
                    class199 var26 = this.field2184[var15];
                    int var27 = (var26.field2363 * arg4 + var26.field2365 * arg2 + var26.field2362 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field2474[var15] = method3451(this.field2163[var15] & 0xFFFF, var27);
                    var8.field2437[var15] = -1;
                } else if (var16 == 3) {
                    var8.field2474[var15] = 128;
                    var8.field2437[var15] = -1;
                } else {
                    var8.field2437[var15] = -2;
                }
            } else if (var16 == 0) {
                class206 var28;
                if (this.field2152 == null || this.field2152[this.field2156[var15]] == null) {
                    var28 = this.field2178[this.field2156[var15]];
                } else {
                    var28 = this.field2152[this.field2156[var15]];
                }
                int var29 = (var28.field2508 * arg4 + var28.field2513 * arg3 + var28.field2512 * arg2) / (var28.field2511 * var7) + arg0;
                var8.field2474[var15] = method3452(var29);
                class206 var30;
                if (this.field2152 == null || this.field2152[this.field2157[var15]] == null) {
                    var30 = this.field2178[this.field2157[var15]];
                } else {
                    var30 = this.field2152[this.field2157[var15]];
                }
                int var31 = (var30.field2508 * arg4 + var30.field2513 * arg3 + var30.field2512 * arg2) / (var30.field2511 * var7) + arg0;
                var8.field2436[var15] = method3452(var31);
                class206 var32;
                if (this.field2152 == null || this.field2152[this.field2158[var15]] == null) {
                    var32 = this.field2178[this.field2158[var15]];
                } else {
                    var32 = this.field2152[this.field2158[var15]];
                }
                int var33 = (var32.field2508 * arg4 + var32.field2513 * arg3 + var32.field2512 * arg2) / (var32.field2511 * var7) + arg0;
                var8.field2437[var15] = method3452(var33);
            } else if (var16 == 1) {
                class199 var34 = this.field2184[var15];
                int var35 = (var34.field2363 * arg4 + var34.field2365 * arg2 + var34.field2362 * arg3) / (var7 / 2 + var7) + arg0;
                var8.field2474[var15] = method3452(var35);
                var8.field2437[var15] = -1;
            } else {
                var8.field2437[var15] = -2;
            }
        }
        this.method3437();
        var8.field2427 = this.field2172;
        var8.field2428 = this.field2168;
        var8.field2467 = this.field2185;
        var8.field2430 = this.field2154;
        var8.field2431 = this.field2155;
        var8.field2473 = this.field2156;
        var8.field2489 = this.field2157;
        var8.field2434 = this.field2158;
        var8.field2438 = this.field2160;
        var8.field2439 = this.field2161;
        var8.field2445 = this.field2165;
        var8.field2447 = this.field2173;
        var8.field2448 = this.field2171;
        var8.field2441 = this.field2164;
        var8.field2449 = this.field2186;
        var8.field2450 = this.field2174;
        return var8;
    }

    @ObfuscatedName("ge.ab(II)I")
    public static final int method3451(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("ge.an(I)I")
    public static final int method3452(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
