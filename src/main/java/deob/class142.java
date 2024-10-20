package deob;

@ObfuscatedName("ct")
public class class142 extends class144 {

    @ObfuscatedName("ct.f")
    public byte[] field2120;

    @ObfuscatedName("ct.g")
    public int[] field2135;

    @ObfuscatedName("ct.d")
    public short[] field2132;

    @ObfuscatedName("ct.e")
    public byte[] field2138;

    @ObfuscatedName("ct.b")
    public short[] field2125;

    @ObfuscatedName("ct.c")
    public short[] field2134;

    @ObfuscatedName("ct.a")
    public short[] field2139;

    @ObfuscatedName("ct.n")
    public int[] field2157;

    @ObfuscatedName("ct.o")
    public int[] field2116;

    @ObfuscatedName("ct.l")
    public short[] field2144;

    @ObfuscatedName("ct.m")
    public byte[] field2130;

    @ObfuscatedName("ct.j")
    public int field2119 = 0;

    @ObfuscatedName("ct.k")
    public short[] field2136;

    @ObfuscatedName("ct.h")
    public int field2118 = 0;

    @ObfuscatedName("ct.i")
    public byte field2114 = 0;

    @ObfuscatedName("ct.w")
    public short[] field2128;

    @ObfuscatedName("ct.v")
    public short[] field2131;

    @ObfuscatedName("ct.u")
    public short[] field2133;

    @ObfuscatedName("ct.t")
    public int[] field2117;

    @ObfuscatedName("ct.s")
    public int field2129;

    @ObfuscatedName("ct.r")
    public int[] field2126;

    @ObfuscatedName("ct.q")
    public short[] field2137;

    @ObfuscatedName("ct.p")
    public int[] field2115;

    @ObfuscatedName("ct.z")
    public byte[] field2127;

    @ObfuscatedName("ct.y")
    public short[] field2159;

    @ObfuscatedName("ct.x")
    public byte[] field2124;

    @ObfuscatedName("ct.az")
    public static int field2140 = 0;

    @ObfuscatedName("ct.ay")
    public short field2149;

    @ObfuscatedName("ct.at")
    public int[] field2141;

    @ObfuscatedName("ct.as")
    public boolean field2150 = false;

    @ObfuscatedName("ct.ar")
    public int field2153;

    @ObfuscatedName("ct.aq")
    public class147[] field2147;

    @ObfuscatedName("ct.ax")
    public int[][] field2143;

    @ObfuscatedName("ct.av")
    public static int[] field2123 = class151.field2285;

    @ObfuscatedName("ct.au")
    public int[] field2142;

    @ObfuscatedName("ct.al")
    public static int[] field2158 = new int[10000];

    @ObfuscatedName("ct.ai")
    public short field2148;

    @ObfuscatedName("ct.aj")
    public int field2152;

    @ObfuscatedName("ct.ap")
    public int field2122;

    @ObfuscatedName("ct.an")
    public static int[] field2156 = new int[10000];

    @ObfuscatedName("ct.ac")
    public int field2155;

    @ObfuscatedName("ct.ad")
    public class147[] field2146;

    @ObfuscatedName("ct.aa")
    public byte[] field2121;

    @ObfuscatedName("ct.ab")
    public int field2151;

    @ObfuscatedName("ct.ag")
    public int[][] field2154;

    @ObfuscatedName("ct.ah")
    public class158[] field2145;

    @ObfuscatedName("ct.ae")
    public static int[] field2160 = class151.field2286;

    @ObfuscatedName("ct.b(III)V")
    public void method2528(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2119; var4++) {
            this.field2115[var4] = this.field2115[var4] * arg0 / 128;
            this.field2116[var4] = this.field2116[var4] * arg1 / 128;
            this.field2117[var4] = this.field2117[var4] * arg2 / 128;
        }
        this.method2546();
    }

    @ObfuscatedName("ct.j(Leg;II)Lct;")
    public static class142 method2529(class81 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1083(arg1, arg2);
        return var3 == null ? null : new class142(var3);
    }

    public class142(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method2530(arg0);
        } else {
            this.method2531(arg0);
        }
    }

    @ObfuscatedName("ct.o([B)V")
    public void method2530(byte[] arg0) {
        class31 var2 = new class31(arg0);
        class31 var3 = new class31(arg0);
        class31 var4 = new class31(arg0);
        class31 var5 = new class31(arg0);
        class31 var6 = new class31(arg0);
        class31 var7 = new class31(arg0);
        class31 var8 = new class31(arg0);
        var2.field172 = arg0.length - 23;
        int var9 = var2.method373();
        int var10 = var2.method373();
        int var11 = var2.method512();
        int var12 = var2.method512();
        int var13 = var2.method512();
        int var14 = var2.method512();
        int var15 = var2.method512();
        int var16 = var2.method512();
        int var17 = var2.method512();
        int var18 = var2.method373();
        int var19 = var2.method373();
        int var20 = var2.method373();
        int var21 = var2.method373();
        int var22 = var2.method373();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field2130 = new byte[var11];
            var2.field172 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field2130[var26] = var2.method492();
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
        this.field2119 = var9;
        this.field2118 = var10;
        this.field2129 = var11;
        this.field2115 = new int[var9];
        this.field2116 = new int[var9];
        this.field2117 = new int[var9];
        this.field2126 = new int[var10];
        this.field2157 = new int[var10];
        this.field2135 = new int[var10];
        if (var17 == 1) {
            this.field2141 = new int[var9];
        }
        if (var12 == 1) {
            this.field2138 = new byte[var10];
        }
        if (var13 == 255) {
            this.field2120 = new byte[var10];
        } else {
            this.field2114 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2124 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2142 = new int[var10];
        }
        if (var16 == 1) {
            this.field2128 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field2127 = new byte[var10];
        }
        this.field2144 = new short[var10];
        if (var11 > 0) {
            this.field2131 = new short[var11];
            this.field2134 = new short[var11];
            this.field2133 = new short[var11];
            if (var24 > 0) {
                this.field2159 = new short[var24];
                this.field2125 = new short[var24];
                this.field2136 = new short[var24];
                this.field2137 = new short[var24];
                this.field2121 = new byte[var24];
                this.field2132 = new short[var24];
            }
            if (var25 > 0) {
                this.field2139 = new short[var25];
            }
        }
        var2.field172 = var11;
        var3.field172 = var44;
        var4.field172 = var46;
        var5.field172 = var48;
        var6.field172 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method512();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method421();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method421();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method421();
            }
            this.field2115[var67] = var64 + var69;
            this.field2116[var67] = var65 + var70;
            this.field2117[var67] = var66 + var71;
            var64 = this.field2115[var67];
            var65 = this.field2116[var67];
            var66 = this.field2117[var67];
            if (var17 == 1) {
                this.field2141[var67] = var6.method512();
            }
        }
        var2.field172 = var42;
        var3.field172 = var31;
        var4.field172 = var34;
        var5.field172 = var37;
        var6.field172 = var35;
        var7.field172 = var40;
        var8.field172 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field2144[var72] = (short) var2.method373();
            if (var12 == 1) {
                this.field2138[var72] = var3.method492();
            }
            if (var13 == 255) {
                this.field2120[var72] = var4.method492();
            }
            if (var14 == 1) {
                this.field2124[var72] = var5.method492();
            }
            if (var15 == 1) {
                this.field2142[var72] = var6.method512();
            }
            if (var16 == 1) {
                this.field2128[var72] = (short) (var7.method373() - 1);
            }
            if (this.field2127 != null && this.field2128[var72] != -1) {
                this.field2127[var72] = (byte) (var8.method512() - 1);
            }
        }
        var2.field172 = var33;
        var3.field172 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method512();
            if (var78 == 1) {
                var73 = var2.method421() + var76;
                var74 = var2.method421() + var73;
                var75 = var2.method421() + var74;
                var76 = var75;
                this.field2126[var77] = var73;
                this.field2157[var77] = var74;
                this.field2135[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method421() + var76;
                var76 = var75;
                this.field2126[var77] = var73;
                this.field2157[var77] = var74;
                this.field2135[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method421() + var76;
                var76 = var75;
                this.field2126[var77] = var73;
                this.field2157[var77] = var74;
                this.field2135[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method421() + var76;
                var76 = var75;
                this.field2126[var77] = var73;
                this.field2157[var77] = var81;
                this.field2135[var77] = var75;
            }
        }
        var2.field172 = var50;
        var3.field172 = var52;
        var4.field172 = var54;
        var5.field172 = var56;
        var6.field172 = var58;
        var7.field172 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field2130[var82] & 0xFF;
            if (var83 == 0) {
                this.field2131[var82] = (short) var2.method373();
                this.field2134[var82] = (short) var2.method373();
                this.field2133[var82] = (short) var2.method373();
            }
            if (var83 == 1) {
                this.field2131[var82] = (short) var3.method373();
                this.field2134[var82] = (short) var3.method373();
                this.field2133[var82] = (short) var3.method373();
                this.field2159[var82] = (short) var4.method373();
                this.field2125[var82] = (short) var4.method373();
                this.field2136[var82] = (short) var4.method373();
                this.field2137[var82] = (short) var5.method373();
                this.field2121[var82] = var6.method492();
                this.field2132[var82] = (short) var7.method373();
            }
            if (var83 == 2) {
                this.field2131[var82] = (short) var3.method373();
                this.field2134[var82] = (short) var3.method373();
                this.field2133[var82] = (short) var3.method373();
                this.field2159[var82] = (short) var4.method373();
                this.field2125[var82] = (short) var4.method373();
                this.field2136[var82] = (short) var4.method373();
                this.field2137[var82] = (short) var5.method373();
                this.field2121[var82] = var6.method492();
                this.field2132[var82] = (short) var7.method373();
                this.field2139[var82] = (short) var7.method373();
            }
            if (var83 == 3) {
                this.field2131[var82] = (short) var3.method373();
                this.field2134[var82] = (short) var3.method373();
                this.field2133[var82] = (short) var3.method373();
                this.field2159[var82] = (short) var4.method373();
                this.field2125[var82] = (short) var4.method373();
                this.field2136[var82] = (short) var4.method373();
                this.field2137[var82] = (short) var5.method373();
                this.field2121[var82] = var6.method492();
                this.field2132[var82] = (short) var7.method373();
            }
        }
        var2.field172 = var62;
        int var84 = var2.method512();
        if (var84 == 0) {
            return;
        }
        new class136();
        var2.method373();
        var2.method373();
        var2.method373();
        var2.method376();
    }

    @ObfuscatedName("ct.t([B)V")
    public void method2531(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class31 var4 = new class31(arg0);
        class31 var5 = new class31(arg0);
        class31 var6 = new class31(arg0);
        class31 var7 = new class31(arg0);
        class31 var8 = new class31(arg0);
        var4.field172 = arg0.length - 18;
        int var9 = var4.method373();
        int var10 = var4.method373();
        int var11 = var4.method512();
        int var12 = var4.method512();
        int var13 = var4.method512();
        int var14 = var4.method512();
        int var15 = var4.method512();
        int var16 = var4.method512();
        int var17 = var4.method373();
        int var18 = var4.method373();
        int var19 = var4.method373();
        int var20 = var4.method373();
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
        this.field2119 = var9;
        this.field2118 = var10;
        this.field2129 = var11;
        this.field2115 = new int[var9];
        this.field2116 = new int[var9];
        this.field2117 = new int[var9];
        this.field2126 = new int[var10];
        this.field2157 = new int[var10];
        this.field2135 = new int[var10];
        if (var11 > 0) {
            this.field2130 = new byte[var11];
            this.field2131 = new short[var11];
            this.field2134 = new short[var11];
            this.field2133 = new short[var11];
        }
        if (var16 == 1) {
            this.field2141 = new int[var9];
        }
        if (var12 == 1) {
            this.field2138 = new byte[var10];
            this.field2127 = new byte[var10];
            this.field2128 = new short[var10];
        }
        if (var13 == 255) {
            this.field2120 = new byte[var10];
        } else {
            this.field2114 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2124 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2142 = new int[var10];
        }
        this.field2144 = new short[var10];
        var4.field172 = var21;
        var5.field172 = var36;
        var6.field172 = var38;
        var7.field172 = var40;
        var8.field172 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method512();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method421();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method421();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method421();
            }
            this.field2115[var46] = var43 + var48;
            this.field2116[var46] = var44 + var49;
            this.field2117[var46] = var45 + var50;
            var43 = this.field2115[var46];
            var44 = this.field2116[var46];
            var45 = this.field2117[var46];
            if (var16 == 1) {
                this.field2141[var46] = var8.method512();
            }
        }
        var4.field172 = var32;
        var5.field172 = var28;
        var6.field172 = var26;
        var7.field172 = var30;
        var8.field172 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field2144[var51] = (short) var4.method373();
            if (var12 == 1) {
                int var52 = var5.method512();
                if ((var52 & 0x1) == 1) {
                    this.field2138[var51] = 1;
                    var2 = true;
                } else {
                    this.field2138[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field2127[var51] = (byte) (var52 >> 2);
                    this.field2128[var51] = this.field2144[var51];
                    this.field2144[var51] = 127;
                    if (this.field2128[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field2127[var51] = -1;
                    this.field2128[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field2120[var51] = var6.method492();
            }
            if (var14 == 1) {
                this.field2124[var51] = var7.method492();
            }
            if (var15 == 1) {
                this.field2142[var51] = var8.method512();
            }
        }
        var4.field172 = var25;
        var5.field172 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method512();
            if (var58 == 1) {
                var53 = var4.method421() + var56;
                var54 = var4.method421() + var53;
                var55 = var4.method421() + var54;
                var56 = var55;
                this.field2126[var57] = var53;
                this.field2157[var57] = var54;
                this.field2135[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method421() + var56;
                var56 = var55;
                this.field2126[var57] = var53;
                this.field2157[var57] = var54;
                this.field2135[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method421() + var56;
                var56 = var55;
                this.field2126[var57] = var53;
                this.field2157[var57] = var54;
                this.field2135[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method421() + var56;
                var56 = var55;
                this.field2126[var57] = var53;
                this.field2157[var57] = var61;
                this.field2135[var57] = var55;
            }
        }
        var4.field172 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field2130[var62] = 0;
            this.field2131[var62] = (short) var4.method373();
            this.field2134[var62] = (short) var4.method373();
            this.field2133[var62] = (short) var4.method373();
        }
        if (this.field2127 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field2127[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field2131[var65] & 0xFFFF) == this.field2126[var64] && (this.field2134[var65] & 0xFFFF) == this.field2157[var64] && (this.field2133[var65] & 0xFFFF) == this.field2135[var64]) {
                        this.field2127[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field2127 = null;
            }
        }
        if (!var3) {
            this.field2128 = null;
        }
        if (!var2) {
            this.field2138 = null;
        }
    }

    @ObfuscatedName("ct.h(Lct;I)I")
    public final int method2533(class142 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field2115[arg1];
        int var5 = arg0.field2116[arg1];
        int var6 = arg0.field2117[arg1];
        for (int var7 = 0; var7 < this.field2119; var7++) {
            if (this.field2115[var7] == var4 && this.field2116[var7] == var5 && this.field2117[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field2115[this.field2119] = var4;
            this.field2116[this.field2119] = var5;
            this.field2117[this.field2119] = var6;
            if (arg0.field2141 != null) {
                this.field2141[this.field2119] = arg0.field2141[arg1];
            }
            var3 = this.field2119++;
        }
        return var3;
    }

    @ObfuscatedName("ct.r()Lct;")
    public class142 method2535() {
        class142 var1 = new class142();
        if (this.field2138 != null) {
            var1.field2138 = new byte[this.field2118];
            for (int var2 = 0; var2 < this.field2118; var2++) {
                var1.field2138[var2] = this.field2138[var2];
            }
        }
        var1.field2119 = this.field2119;
        var1.field2118 = this.field2118;
        var1.field2129 = this.field2129;
        var1.field2115 = this.field2115;
        var1.field2116 = this.field2116;
        var1.field2117 = this.field2117;
        var1.field2126 = this.field2126;
        var1.field2157 = this.field2157;
        var1.field2135 = this.field2135;
        var1.field2120 = this.field2120;
        var1.field2124 = this.field2124;
        var1.field2127 = this.field2127;
        var1.field2144 = this.field2144;
        var1.field2128 = this.field2128;
        var1.field2114 = this.field2114;
        var1.field2130 = this.field2130;
        var1.field2131 = this.field2131;
        var1.field2134 = this.field2134;
        var1.field2133 = this.field2133;
        var1.field2159 = this.field2159;
        var1.field2125 = this.field2125;
        var1.field2136 = this.field2136;
        var1.field2137 = this.field2137;
        var1.field2121 = this.field2121;
        var1.field2132 = this.field2132;
        var1.field2139 = this.field2139;
        var1.field2141 = this.field2141;
        var1.field2142 = this.field2142;
        var1.field2143 = this.field2143;
        var1.field2154 = this.field2154;
        var1.field2146 = this.field2146;
        var1.field2145 = this.field2145;
        var1.field2148 = this.field2148;
        var1.field2149 = this.field2149;
        return var1;
    }

    @ObfuscatedName("ct.n([[IIIIZI)Lct;")
    public class142 method2536(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2547();
        int var7 = this.field2152 + arg1;
        int var8 = this.field2153 + arg1;
        int var9 = this.field2155 + arg3;
        int var10 = this.field2122 + arg3;
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
        class142 var15;
        if (arg4) {
            var15 = new class142();
            var15.field2119 = this.field2119;
            var15.field2118 = this.field2118;
            var15.field2129 = this.field2129;
            var15.field2115 = this.field2115;
            var15.field2117 = this.field2117;
            var15.field2126 = this.field2126;
            var15.field2157 = this.field2157;
            var15.field2135 = this.field2135;
            var15.field2138 = this.field2138;
            var15.field2120 = this.field2120;
            var15.field2124 = this.field2124;
            var15.field2127 = this.field2127;
            var15.field2144 = this.field2144;
            var15.field2128 = this.field2128;
            var15.field2114 = this.field2114;
            var15.field2130 = this.field2130;
            var15.field2131 = this.field2131;
            var15.field2134 = this.field2134;
            var15.field2133 = this.field2133;
            var15.field2159 = this.field2159;
            var15.field2125 = this.field2125;
            var15.field2136 = this.field2136;
            var15.field2137 = this.field2137;
            var15.field2121 = this.field2121;
            var15.field2132 = this.field2132;
            var15.field2139 = this.field2139;
            var15.field2141 = this.field2141;
            var15.field2142 = this.field2142;
            var15.field2143 = this.field2143;
            var15.field2154 = this.field2154;
            var15.field2148 = this.field2148;
            var15.field2149 = this.field2149;
            var15.field2116 = new int[var15.field2119];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field2119; var16++) {
                int var17 = this.field2115[var16] + arg1;
                int var18 = this.field2117[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field2116[var16] = this.field2116[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field2119; var26++) {
                int var27 = (-this.field2116[var26] << 16) / this.field2174;
                if (var27 < arg5) {
                    int var28 = this.field2115[var26] + arg1;
                    int var29 = this.field2117[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field2116[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field2116[var26];
                }
            }
        }
        var15.method2546();
        return var15;
    }

    public class142(class142[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field2119 = 0;
        this.field2118 = 0;
        this.field2129 = 0;
        this.field2114 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class142 var10 = arg0[var9];
            if (var10 != null) {
                this.field2119 += var10.field2119;
                this.field2118 += var10.field2118;
                this.field2129 += var10.field2129;
                if (var10.field2120 == null) {
                    if (this.field2114 == -1) {
                        this.field2114 = var10.field2114;
                    }
                    if (this.field2114 != var10.field2114) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field2138 != null;
                var5 |= var10.field2124 != null;
                var6 |= var10.field2142 != null;
                var7 |= var10.field2128 != null;
                var8 |= var10.field2127 != null;
            }
        }
        this.field2115 = new int[this.field2119];
        this.field2116 = new int[this.field2119];
        this.field2117 = new int[this.field2119];
        this.field2141 = new int[this.field2119];
        this.field2126 = new int[this.field2118];
        this.field2157 = new int[this.field2118];
        this.field2135 = new int[this.field2118];
        if (var3) {
            this.field2138 = new byte[this.field2118];
        }
        if (var4) {
            this.field2120 = new byte[this.field2118];
        }
        if (var5) {
            this.field2124 = new byte[this.field2118];
        }
        if (var6) {
            this.field2142 = new int[this.field2118];
        }
        if (var7) {
            this.field2128 = new short[this.field2118];
        }
        if (var8) {
            this.field2127 = new byte[this.field2118];
        }
        this.field2144 = new short[this.field2118];
        if (this.field2129 > 0) {
            this.field2130 = new byte[this.field2129];
            this.field2131 = new short[this.field2129];
            this.field2134 = new short[this.field2129];
            this.field2133 = new short[this.field2129];
            this.field2159 = new short[this.field2129];
            this.field2125 = new short[this.field2129];
            this.field2136 = new short[this.field2129];
            this.field2137 = new short[this.field2129];
            this.field2121 = new byte[this.field2129];
            this.field2132 = new short[this.field2129];
            this.field2139 = new short[this.field2129];
        }
        this.field2119 = 0;
        this.field2118 = 0;
        this.field2129 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class142 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field2118; var13++) {
                    if (var3 && var12.field2138 != null) {
                        this.field2138[this.field2118] = var12.field2138[var13];
                    }
                    if (var4) {
                        if (var12.field2120 == null) {
                            this.field2120[this.field2118] = var12.field2114;
                        } else {
                            this.field2120[this.field2118] = var12.field2120[var13];
                        }
                    }
                    if (var5 && var12.field2124 != null) {
                        this.field2124[this.field2118] = var12.field2124[var13];
                    }
                    if (var6 && var12.field2142 != null) {
                        this.field2142[this.field2118] = var12.field2142[var13];
                    }
                    if (var7) {
                        if (var12.field2128 == null) {
                            this.field2128[this.field2118] = -1;
                        } else {
                            this.field2128[this.field2118] = var12.field2128[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field2127 == null || var12.field2127[var13] == -1) {
                            this.field2127[this.field2118] = -1;
                        } else {
                            this.field2127[this.field2118] = (byte) (var12.field2127[var13] + this.field2129);
                        }
                    }
                    this.field2144[this.field2118] = var12.field2144[var13];
                    this.field2126[this.field2118] = this.method2533(var12, var12.field2126[var13]);
                    this.field2157[this.field2118] = this.method2533(var12, var12.field2157[var13]);
                    this.field2135[this.field2118] = this.method2533(var12, var12.field2135[var13]);
                    this.field2118++;
                }
                for (int var14 = 0; var14 < var12.field2129; var14++) {
                    byte var15 = this.field2130[this.field2129] = var12.field2130[var14];
                    if (var15 == 0) {
                        this.field2131[this.field2129] = (short) this.method2533(var12, var12.field2131[var14]);
                        this.field2134[this.field2129] = (short) this.method2533(var12, var12.field2134[var14]);
                        this.field2133[this.field2129] = (short) this.method2533(var12, var12.field2133[var14]);
                    }
                    if (var15 >= 1 && var15 <= 3) {
                        this.field2131[this.field2129] = var12.field2131[var14];
                        this.field2134[this.field2129] = var12.field2134[var14];
                        this.field2133[this.field2129] = var12.field2133[var14];
                        this.field2159[this.field2129] = var12.field2159[var14];
                        this.field2125[this.field2129] = var12.field2125[var14];
                        this.field2136[this.field2129] = var12.field2136[var14];
                        this.field2137[this.field2129] = var12.field2137[var14];
                        this.field2121[this.field2129] = var12.field2121[var14];
                        this.field2132[this.field2129] = var12.field2132[var14];
                    }
                    if (var15 == 2) {
                        this.field2139[this.field2129] = var12.field2139[var14];
                    }
                    this.field2129++;
                }
            }
        }
    }

    @ObfuscatedName("ct.a(Lct;Lct;IIIZ)V")
    public static void method2537(class142 arg0, class142 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method2547();
        arg0.method2545();
        arg1.method2547();
        arg1.method2545();
        field2140++;
        int var6 = 0;
        int[] var7 = arg1.field2115;
        int var8 = arg1.field2119;
        for (int var9 = 0; var9 < arg0.field2119; var9++) {
            class147 var10 = arg0.field2146[var9];
            if (var10.field2202 != 0) {
                int var11 = arg0.field2116[var9] - arg3;
                if (var11 <= arg1.field2151) {
                    int var12 = arg0.field2115[var9] - arg2;
                    if (var12 >= arg1.field2152 && var12 <= arg1.field2153) {
                        int var13 = arg0.field2117[var9] - arg4;
                        if (var13 >= arg1.field2155 && var13 <= arg1.field2122) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class147 var15 = arg1.field2146[var14];
                                if (var7[var14] == var12 && arg1.field2117[var14] == var13 && arg1.field2116[var14] == var11 && var15.field2202 != 0) {
                                    if (arg0.field2147 == null) {
                                        arg0.field2147 = new class147[arg0.field2119];
                                    }
                                    if (arg1.field2147 == null) {
                                        arg1.field2147 = new class147[var8];
                                    }
                                    class147 var16 = arg0.field2147[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field2147[var9] = new class147(var10);
                                    }
                                    class147 var17 = arg1.field2147[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field2147[var14] = new class147(var15);
                                    }
                                    var16.field2205 += var15.field2205;
                                    var16.field2200 += var15.field2200;
                                    var16.field2206 += var15.field2206;
                                    var16.field2202 += var15.field2202;
                                    var17.field2205 += var10.field2205;
                                    var17.field2200 += var10.field2200;
                                    var17.field2206 += var10.field2206;
                                    var17.field2202 += var10.field2202;
                                    var6++;
                                    field2156[var9] = field2140;
                                    field2158[var14] = field2140;
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
        for (int var18 = 0; var18 < arg0.field2118; var18++) {
            if (field2156[arg0.field2126[var18]] == field2140 && field2156[arg0.field2157[var18]] == field2140 && field2156[arg0.field2135[var18]] == field2140) {
                if (arg0.field2138 == null) {
                    arg0.field2138 = new byte[arg0.field2118];
                }
                arg0.field2138[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field2118; var19++) {
            if (field2158[arg1.field2126[var19]] == field2140 && field2158[arg1.field2157[var19]] == field2140 && field2158[arg1.field2135[var19]] == field2140) {
                if (arg1.field2138 == null) {
                    arg1.field2138 = new byte[arg1.field2118];
                }
                arg1.field2138[var19] = 2;
            }
        }
    }

    @ObfuscatedName("ct.i()V")
    public void method2538() {
        for (int var1 = 0; var1 < this.field2119; var1++) {
            this.field2115[var1] = -this.field2115[var1];
            this.field2117[var1] = -this.field2117[var1];
        }
        this.method2546();
    }

    @ObfuscatedName("ct.s()V")
    public void method2539() {
        for (int var1 = 0; var1 < this.field2119; var1++) {
            int var2 = this.field2117[var1];
            this.field2117[var1] = this.field2115[var1];
            this.field2115[var1] = -var2;
        }
        this.method2546();
    }

    @ObfuscatedName("ct.m(I)V")
    public void method2540(int arg0) {
        int var2 = field2123[arg0];
        int var3 = field2160[arg0];
        for (int var4 = 0; var4 < this.field2119; var4++) {
            int var5 = this.field2117[var4] * var2 + this.field2115[var4] * var3 >> 16;
            this.field2117[var4] = this.field2117[var4] * var3 - this.field2115[var4] * var2 >> 16;
            this.field2115[var4] = var5;
        }
        this.method2546();
    }

    @ObfuscatedName("ct.c(SS)V")
    public void method2542(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2118; var3++) {
            if (this.field2144[var3] == arg0) {
                this.field2144[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("ct.y()V")
    public void method2544() {
        for (int var1 = 0; var1 < this.field2119; var1++) {
            this.field2117[var1] = -this.field2117[var1];
        }
        for (int var2 = 0; var2 < this.field2118; var2++) {
            int var3 = this.field2126[var2];
            this.field2126[var2] = this.field2135[var2];
            this.field2135[var2] = var3;
        }
        this.method2546();
    }

    public class142() {
    }

    @ObfuscatedName("ct.k()V")
    public void method2545() {
        if (this.field2146 != null) {
            return;
        }
        this.field2146 = new class147[this.field2119];
        for (int var1 = 0; var1 < this.field2119; var1++) {
            this.field2146[var1] = new class147();
        }
        for (int var2 = 0; var2 < this.field2118; var2++) {
            int var3 = this.field2126[var2];
            int var4 = this.field2157[var2];
            int var5 = this.field2135[var2];
            int var6 = this.field2115[var4] - this.field2115[var3];
            int var7 = this.field2116[var4] - this.field2116[var3];
            int var8 = this.field2117[var4] - this.field2117[var3];
            int var9 = this.field2115[var5] - this.field2115[var3];
            int var10 = this.field2116[var5] - this.field2116[var3];
            int var11 = this.field2117[var5] - this.field2117[var3];
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
            if (this.field2138 == null) {
                var19 = 0;
            } else {
                var19 = this.field2138[var2];
            }
            if (var19 == 0) {
                class147 var20 = this.field2146[var3];
                var20.field2205 += var16;
                var20.field2200 += var17;
                var20.field2206 += var18;
                var20.field2202++;
                class147 var21 = this.field2146[var4];
                var21.field2205 += var16;
                var21.field2200 += var17;
                var21.field2206 += var18;
                var21.field2202++;
                class147 var22 = this.field2146[var5];
                var22.field2205 += var16;
                var22.field2200 += var17;
                var22.field2206 += var18;
                var22.field2202++;
            } else if (var19 == 1) {
                if (this.field2145 == null) {
                    this.field2145 = new class158[this.field2118];
                }
                class158 var23 = this.field2145[var2] = new class158();
                var23.field2365 = var16;
                var23.field2361 = var17;
                var23.field2362 = var18;
            }
        }
    }

    @ObfuscatedName("ct.q()V")
    public void method2546() {
        this.field2146 = null;
        this.field2147 = null;
        this.field2145 = null;
        this.field2150 = false;
    }

    @ObfuscatedName("ct.d()V")
    public void method2547() {
        if (this.field2150) {
            return;
        }
        this.field2174 = 0;
        this.field2151 = 0;
        this.field2152 = 999999;
        this.field2153 = -999999;
        this.field2122 = -99999;
        this.field2155 = 99999;
        for (int var1 = 0; var1 < this.field2119; var1++) {
            int var2 = this.field2115[var1];
            int var3 = this.field2116[var1];
            int var4 = this.field2117[var1];
            if (var2 < this.field2152) {
                this.field2152 = var2;
            }
            if (var2 > this.field2153) {
                this.field2153 = var2;
            }
            if (var4 < this.field2155) {
                this.field2155 = var4;
            }
            if (var4 > this.field2122) {
                this.field2122 = var4;
            }
            if (-var3 > this.field2174) {
                this.field2174 = -var3;
            }
            if (var3 > this.field2151) {
                this.field2151 = var3;
            }
        }
        this.field2150 = true;
    }

    @ObfuscatedName("ct.ad(I)I")
    public static final int method2551(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }

    @ObfuscatedName("ct.v(III)V")
    public void method2553(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2119; var4++) {
            this.field2115[var4] += arg0;
            this.field2116[var4] += arg1;
            this.field2117[var4] += arg2;
        }
        this.method2546();
    }

    @ObfuscatedName("ct.u(SS)V")
    public void method2555(short arg0, short arg1) {
        if (this.field2128 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field2118; var3++) {
            if (this.field2128[var3] == arg0) {
                this.field2128[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("ct.w()V")
    public void method2561() {
        for (int var1 = 0; var1 < this.field2119; var1++) {
            int var2 = this.field2115[var1];
            this.field2115[var1] = this.field2117[var1];
            this.field2117[var1] = -var2;
        }
        this.method2546();
    }

    @ObfuscatedName("ct.at(II)I")
    public static final int method2568(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    public class142(class142 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field2119 = arg0.field2119;
        this.field2118 = arg0.field2118;
        this.field2129 = arg0.field2129;
        if (arg1) {
            this.field2115 = arg0.field2115;
            this.field2116 = arg0.field2116;
            this.field2117 = arg0.field2117;
        } else {
            this.field2115 = new int[this.field2119];
            this.field2116 = new int[this.field2119];
            this.field2117 = new int[this.field2119];
            for (int var6 = 0; var6 < this.field2119; var6++) {
                this.field2115[var6] = arg0.field2115[var6];
                this.field2116[var6] = arg0.field2116[var6];
                this.field2117[var6] = arg0.field2117[var6];
            }
        }
        if (arg2) {
            this.field2144 = arg0.field2144;
        } else {
            this.field2144 = new short[this.field2118];
            for (int var7 = 0; var7 < this.field2118; var7++) {
                this.field2144[var7] = arg0.field2144[var7];
            }
        }
        if (arg3 || arg0.field2128 == null) {
            this.field2128 = arg0.field2128;
        } else {
            this.field2128 = new short[this.field2118];
            for (int var8 = 0; var8 < this.field2118; var8++) {
                this.field2128[var8] = arg0.field2128[var8];
            }
        }
        if (arg4) {
            this.field2124 = arg0.field2124;
        } else {
            this.field2124 = new byte[this.field2118];
            if (arg0.field2124 == null) {
                for (int var9 = 0; var9 < this.field2118; var9++) {
                    this.field2124[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field2118; var10++) {
                    this.field2124[var10] = arg0.field2124[var10];
                }
            }
        }
        this.field2126 = arg0.field2126;
        this.field2157 = arg0.field2157;
        this.field2135 = arg0.field2135;
        this.field2138 = arg0.field2138;
        this.field2120 = arg0.field2120;
        this.field2127 = arg0.field2127;
        this.field2114 = arg0.field2114;
        this.field2130 = arg0.field2130;
        this.field2131 = arg0.field2131;
        this.field2134 = arg0.field2134;
        this.field2133 = arg0.field2133;
        this.field2159 = arg0.field2159;
        this.field2125 = arg0.field2125;
        this.field2136 = arg0.field2136;
        this.field2137 = arg0.field2137;
        this.field2121 = arg0.field2121;
        this.field2132 = arg0.field2132;
        this.field2139 = arg0.field2139;
        this.field2141 = arg0.field2141;
        this.field2142 = arg0.field2142;
        this.field2143 = arg0.field2143;
        this.field2154 = arg0.field2154;
        this.field2146 = arg0.field2146;
        this.field2145 = arg0.field2145;
        this.field2147 = arg0.field2147;
        this.field2148 = arg0.field2148;
        this.field2149 = arg0.field2149;
    }

    @ObfuscatedName("ct.g()V")
    public void method2588() {
        int var10002;
        if (this.field2141 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field2119; var3++) {
                int var4 = this.field2141[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field2143 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field2143[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field2119) {
                int var7 = this.field2141[var6];
                this.field2143[var7][var1[var7]++] = var6++;
            }
            this.field2141 = null;
        }
        if (this.field2142 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field2118; var10++) {
            int var11 = this.field2142[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field2154 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field2154[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field2118) {
            int var14 = this.field2142[var13];
            this.field2154[var14][var8[var14]++] = var13++;
        }
        this.field2142 = null;
    }

    @ObfuscatedName("ct.aa(IIIII)Ldi;")
    public final class41 method2603(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2545();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class41 var8 = new class41();
        var8.field304 = new int[this.field2118];
        var8.field279 = new int[this.field2118];
        var8.field293 = new int[this.field2118];
        if (this.field2129 > 0 && this.field2127 != null) {
            int[] var9 = new int[this.field2129];
            for (int var10 = 0; var10 < this.field2118; var10++) {
                if (this.field2127[var10] != -1) {
                    var9[this.field2127[var10] & 0xFF]++;
                }
            }
            var8.field299 = 0;
            for (int var11 = 0; var11 < this.field2129; var11++) {
                if (var9[var11] > 0 && this.field2130[var11] == 0) {
                    var8.field299++;
                }
            }
            var8.field292 = new int[var8.field299];
            var8.field297 = new int[var8.field299];
            var8.field302 = new int[var8.field299];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field2129; var13++) {
                if (var9[var13] > 0 && this.field2130[var13] == 0) {
                    var8.field292[var12] = this.field2131[var13] & 0xFFFF;
                    var8.field297[var12] = this.field2134[var13] & 0xFFFF;
                    var8.field302[var12] = this.field2133[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field300 = new byte[this.field2118];
            for (int var14 = 0; var14 < this.field2118; var14++) {
                if (this.field2127[var14] == -1) {
                    var8.field300[var14] = -1;
                } else {
                    var8.field300[var14] = (byte) var9[this.field2127[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field2118; var15++) {
            byte var16;
            if (this.field2138 == null) {
                var16 = 0;
            } else {
                var16 = this.field2138[var15];
            }
            byte var17;
            if (this.field2124 == null) {
                var17 = 0;
            } else {
                var17 = this.field2124[var15];
            }
            short var18;
            if (this.field2128 == null) {
                var18 = -1;
            } else {
                var18 = this.field2128[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field2144[var15] & 0xFFFF;
                    class147 var20;
                    if (this.field2147 == null || this.field2147[this.field2126[var15]] == null) {
                        var20 = this.field2146[this.field2126[var15]];
                    } else {
                        var20 = this.field2147[this.field2126[var15]];
                    }
                    int var21 = (var20.field2206 * arg4 + var20.field2205 * arg2 + var20.field2200 * arg3) / (var20.field2202 * var7) + arg0;
                    var8.field304[var15] = method2568(var19, var21);
                    class147 var22;
                    if (this.field2147 == null || this.field2147[this.field2157[var15]] == null) {
                        var22 = this.field2146[this.field2157[var15]];
                    } else {
                        var22 = this.field2147[this.field2157[var15]];
                    }
                    int var23 = (var22.field2206 * arg4 + var22.field2205 * arg2 + var22.field2200 * arg3) / (var22.field2202 * var7) + arg0;
                    var8.field279[var15] = method2568(var19, var23);
                    class147 var24;
                    if (this.field2147 == null || this.field2147[this.field2135[var15]] == null) {
                        var24 = this.field2146[this.field2135[var15]];
                    } else {
                        var24 = this.field2147[this.field2135[var15]];
                    }
                    int var25 = (var24.field2206 * arg4 + var24.field2205 * arg2 + var24.field2200 * arg3) / (var24.field2202 * var7) + arg0;
                    var8.field293[var15] = method2568(var19, var25);
                } else if (var16 == 1) {
                    class158 var26 = this.field2145[var15];
                    int var27 = (var26.field2362 * arg4 + var26.field2365 * arg2 + var26.field2361 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field304[var15] = method2568(this.field2144[var15] & 0xFFFF, var27);
                    var8.field293[var15] = -1;
                } else if (var16 == 3) {
                    var8.field304[var15] = 128;
                    var8.field293[var15] = -1;
                } else {
                    var8.field293[var15] = -2;
                }
            } else if (var16 == 0) {
                class147 var28;
                if (this.field2147 == null || this.field2147[this.field2126[var15]] == null) {
                    var28 = this.field2146[this.field2126[var15]];
                } else {
                    var28 = this.field2147[this.field2126[var15]];
                }
                int var29 = (var28.field2206 * arg4 + var28.field2205 * arg2 + var28.field2200 * arg3) / (var28.field2202 * var7) + arg0;
                var8.field304[var15] = method2551(var29);
                class147 var30;
                if (this.field2147 == null || this.field2147[this.field2157[var15]] == null) {
                    var30 = this.field2146[this.field2157[var15]];
                } else {
                    var30 = this.field2147[this.field2157[var15]];
                }
                int var31 = (var30.field2206 * arg4 + var30.field2205 * arg2 + var30.field2200 * arg3) / (var30.field2202 * var7) + arg0;
                var8.field279[var15] = method2551(var31);
                class147 var32;
                if (this.field2147 == null || this.field2147[this.field2135[var15]] == null) {
                    var32 = this.field2146[this.field2135[var15]];
                } else {
                    var32 = this.field2147[this.field2135[var15]];
                }
                int var33 = (var32.field2206 * arg4 + var32.field2205 * arg2 + var32.field2200 * arg3) / (var32.field2202 * var7) + arg0;
                var8.field293[var15] = method2551(var33);
            } else if (var16 == 1) {
                class158 var34 = this.field2145[var15];
                int var35 = (var34.field2362 * arg4 + var34.field2365 * arg2 + var34.field2361 * arg3) / (var7 / 2 + var7) + arg0;
                var8.field304[var15] = method2551(var35);
                var8.field293[var15] = -1;
            } else {
                var8.field293[var15] = -2;
            }
        }
        this.method2588();
        var8.field308 = this.field2119;
        var8.field284 = this.field2115;
        var8.field341 = this.field2116;
        var8.field286 = this.field2117;
        var8.field287 = this.field2118;
        var8.field307 = this.field2126;
        var8.field289 = this.field2157;
        var8.field290 = this.field2135;
        var8.field294 = this.field2120;
        var8.field336 = this.field2124;
        var8.field298 = this.field2114;
        var8.field303 = this.field2143;
        var8.field337 = this.field2154;
        var8.field318 = this.field2128;
        return var8;
    }
}
