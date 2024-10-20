package deob;

@ObfuscatedName("ga")
public class class192 extends class200 {

    @ObfuscatedName("ga.f")
    public int field2183 = 0;

    @ObfuscatedName("ga.e")
    public int[] field2164;

    @ObfuscatedName("ga.v")
    public int[] field2165;

    @ObfuscatedName("ga.y")
    public int[] field2166;

    @ObfuscatedName("ga.j")
    public int field2167 = 0;

    @ObfuscatedName("ga.o")
    public int[] field2168;

    @ObfuscatedName("ga.m")
    public int[] field2163;

    @ObfuscatedName("ga.r")
    public int[] field2170;

    @ObfuscatedName("ga.h")
    public byte[] field2171;

    @ObfuscatedName("ga.d")
    public byte[] field2199;

    @ObfuscatedName("ga.z")
    public byte[] field2173;

    @ObfuscatedName("ga.b")
    public byte[] field2174;

    @ObfuscatedName("ga.i")
    public short[] field2175;

    @ObfuscatedName("ga.k")
    public short[] field2197;

    @ObfuscatedName("ga.g")
    public byte field2187 = 0;

    @ObfuscatedName("ga.t")
    public int field2178;

    @ObfuscatedName("ga.x")
    public byte[] field2179;

    @ObfuscatedName("ga.u")
    public short[] field2201;

    @ObfuscatedName("ga.q")
    public short[] field2192;

    @ObfuscatedName("ga.s")
    public short[] field2182;

    @ObfuscatedName("ga.p")
    public int[] field2176;

    @ObfuscatedName("ga.c")
    public int[] field2184;

    @ObfuscatedName("ga.n")
    public int[][] field2185;

    @ObfuscatedName("ga.l")
    public int[][] field2186;

    @ObfuscatedName("ga.w")
    public class201[] field2172;

    @ObfuscatedName("ga.a")
    public class208[] field2188;

    @ObfuscatedName("ga.aw")
    public class208[] field2169;

    @ObfuscatedName("ga.ak")
    public short field2190;

    @ObfuscatedName("ga.ad")
    public short field2191;

    @ObfuscatedName("ga.at")
    public boolean field2181 = false;

    @ObfuscatedName("ga.ah")
    public int field2193;

    @ObfuscatedName("ga.az")
    public int field2194;

    @ObfuscatedName("ga.ap")
    public int field2195;

    @ObfuscatedName("ga.ag")
    public int field2177;

    @ObfuscatedName("ga.ab")
    public int field2196;

    @ObfuscatedName("ga.aq")
    public static int[] field2198 = new int[10000];

    @ObfuscatedName("ga.ae")
    public static int[] field2180 = new int[10000];

    @ObfuscatedName("ga.ao")
    public static int field2200 = 0;

    @ObfuscatedName("ga.an")
    public static int[] field2189 = class197.field2271;

    @ObfuscatedName("ga.al")
    public static int[] field2202 = class197.field2285;

    public class192() {
    }

    @ObfuscatedName("ga.f(Ljp;II)Lga;")
    public static class192 method3422(class276 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method4504(arg1, arg2);
        return var3 == null ? null : new class192(var3);
    }

    public class192(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method3408(arg0);
        } else {
            this.method3445(arg0);
        }
    }

    @ObfuscatedName("ga.v([B)V")
    public void method3408(byte[] arg0) {
        class384 var2 = new class384(arg0);
        class384 var3 = new class384(arg0);
        class384 var4 = new class384(arg0);
        class384 var5 = new class384(arg0);
        class384 var6 = new class384(arg0);
        class384 var7 = new class384(arg0);
        class384 var8 = new class384(arg0);
        var2.field4161 = arg0.length - 23;
        int var9 = var2.method5899();
        int var10 = var2.method5899();
        int var11 = var2.method5902();
        int var12 = var2.method5902();
        int var13 = var2.method5902();
        int var14 = var2.method5902();
        int var15 = var2.method5902();
        int var16 = var2.method5902();
        int var17 = var2.method5902();
        int var18 = var2.method5899();
        int var19 = var2.method5899();
        int var20 = var2.method5899();
        int var21 = var2.method5899();
        int var22 = var2.method5899();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field2179 = new byte[var11];
            var2.field4161 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field2179[var26] = var2.method5968();
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
        this.field2183 = var9;
        this.field2167 = var10;
        this.field2178 = var11;
        this.field2164 = new int[var9];
        this.field2165 = new int[var9];
        this.field2166 = new int[var9];
        this.field2168 = new int[var10];
        this.field2163 = new int[var10];
        this.field2170 = new int[var10];
        if (var17 == 1) {
            this.field2176 = new int[var9];
        }
        if (var12 == 1) {
            this.field2171 = new byte[var10];
        }
        if (var13 == 255) {
            this.field2199 = new byte[var10];
        } else {
            this.field2187 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2173 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2184 = new int[var10];
        }
        if (var16 == 1) {
            this.field2197 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field2174 = new byte[var10];
        }
        this.field2175 = new short[var10];
        if (var11 > 0) {
            this.field2201 = new short[var11];
            this.field2192 = new short[var11];
            this.field2182 = new short[var11];
        }
        var2.field4161 = var11;
        var3.field4161 = var44;
        var4.field4161 = var46;
        var5.field4161 = var48;
        var6.field4161 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method5902();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method5910();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method5910();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method5910();
            }
            this.field2164[var67] = var64 + var69;
            this.field2165[var67] = var65 + var70;
            this.field2166[var67] = var66 + var71;
            var64 = this.field2164[var67];
            var65 = this.field2165[var67];
            var66 = this.field2166[var67];
            if (var17 == 1) {
                this.field2176[var67] = var6.method5902();
            }
        }
        var2.field4161 = var42;
        var3.field4161 = var31;
        var4.field4161 = var34;
        var5.field4161 = var37;
        var6.field4161 = var35;
        var7.field4161 = var40;
        var8.field4161 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field2175[var72] = (short) var2.method5899();
            if (var12 == 1) {
                this.field2171[var72] = var3.method5968();
            }
            if (var13 == 255) {
                this.field2199[var72] = var4.method5968();
            }
            if (var14 == 1) {
                this.field2173[var72] = var5.method5968();
            }
            if (var15 == 1) {
                this.field2184[var72] = var6.method5902();
            }
            if (var16 == 1) {
                this.field2197[var72] = (short) (var7.method5899() - 1);
            }
            if (this.field2174 != null && this.field2197[var72] != -1) {
                this.field2174[var72] = (byte) (var8.method5902() - 1);
            }
        }
        var2.field4161 = var33;
        var3.field4161 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method5902();
            if (var78 == 1) {
                var73 = var2.method5910() + var76;
                var74 = var2.method5910() + var73;
                var75 = var2.method5910() + var74;
                var76 = var75;
                this.field2168[var77] = var73;
                this.field2163[var77] = var74;
                this.field2170[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method5910() + var76;
                var76 = var75;
                this.field2168[var77] = var73;
                this.field2163[var77] = var74;
                this.field2170[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method5910() + var76;
                var76 = var75;
                this.field2168[var77] = var73;
                this.field2163[var77] = var74;
                this.field2170[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method5910() + var76;
                var76 = var75;
                this.field2168[var77] = var73;
                this.field2163[var77] = var81;
                this.field2170[var77] = var75;
            }
        }
        var2.field4161 = var50;
        var3.field4161 = var52;
        var4.field4161 = var54;
        var5.field4161 = var56;
        var6.field4161 = var58;
        var7.field4161 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field2179[var82] & 0xFF;
            if (var83 == 0) {
                this.field2201[var82] = (short) var2.method5899();
                this.field2192[var82] = (short) var2.method5899();
                this.field2182[var82] = (short) var2.method5899();
            }
        }
        var2.field4161 = var62;
        int var84 = var2.method5902();
        if (var84 == 0) {
            return;
        }
        new class210();
        var2.method5899();
        var2.method5899();
        var2.method5899();
        var2.method5965();
    }

    @ObfuscatedName("ga.j([B)V")
    public void method3445(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class384 var4 = new class384(arg0);
        class384 var5 = new class384(arg0);
        class384 var6 = new class384(arg0);
        class384 var7 = new class384(arg0);
        class384 var8 = new class384(arg0);
        var4.field4161 = arg0.length - 18;
        int var9 = var4.method5899();
        int var10 = var4.method5899();
        int var11 = var4.method5902();
        int var12 = var4.method5902();
        int var13 = var4.method5902();
        int var14 = var4.method5902();
        int var15 = var4.method5902();
        int var16 = var4.method5902();
        int var17 = var4.method5899();
        int var18 = var4.method5899();
        int var19 = var4.method5899();
        int var20 = var4.method5899();
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
        this.field2183 = var9;
        this.field2167 = var10;
        this.field2178 = var11;
        this.field2164 = new int[var9];
        this.field2165 = new int[var9];
        this.field2166 = new int[var9];
        this.field2168 = new int[var10];
        this.field2163 = new int[var10];
        this.field2170 = new int[var10];
        if (var11 > 0) {
            this.field2179 = new byte[var11];
            this.field2201 = new short[var11];
            this.field2192 = new short[var11];
            this.field2182 = new short[var11];
        }
        if (var16 == 1) {
            this.field2176 = new int[var9];
        }
        if (var12 == 1) {
            this.field2171 = new byte[var10];
            this.field2174 = new byte[var10];
            this.field2197 = new short[var10];
        }
        if (var13 == 255) {
            this.field2199 = new byte[var10];
        } else {
            this.field2187 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2173 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2184 = new int[var10];
        }
        this.field2175 = new short[var10];
        var4.field4161 = var21;
        var5.field4161 = var36;
        var6.field4161 = var38;
        var7.field4161 = var40;
        var8.field4161 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method5902();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method5910();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method5910();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method5910();
            }
            this.field2164[var46] = var43 + var48;
            this.field2165[var46] = var44 + var49;
            this.field2166[var46] = var45 + var50;
            var43 = this.field2164[var46];
            var44 = this.field2165[var46];
            var45 = this.field2166[var46];
            if (var16 == 1) {
                this.field2176[var46] = var8.method5902();
            }
        }
        var4.field4161 = var32;
        var5.field4161 = var28;
        var6.field4161 = var26;
        var7.field4161 = var30;
        var8.field4161 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field2175[var51] = (short) var4.method5899();
            if (var12 == 1) {
                int var52 = var5.method5902();
                if ((var52 & 0x1) == 1) {
                    this.field2171[var51] = 1;
                    var2 = true;
                } else {
                    this.field2171[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field2174[var51] = (byte) (var52 >> 2);
                    this.field2197[var51] = this.field2175[var51];
                    this.field2175[var51] = 127;
                    if (this.field2197[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field2174[var51] = -1;
                    this.field2197[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field2199[var51] = var6.method5968();
            }
            if (var14 == 1) {
                this.field2173[var51] = var7.method5968();
            }
            if (var15 == 1) {
                this.field2184[var51] = var8.method5902();
            }
        }
        var4.field4161 = var25;
        var5.field4161 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method5902();
            if (var58 == 1) {
                var53 = var4.method5910() + var56;
                var54 = var4.method5910() + var53;
                var55 = var4.method5910() + var54;
                var56 = var55;
                this.field2168[var57] = var53;
                this.field2163[var57] = var54;
                this.field2170[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method5910() + var56;
                var56 = var55;
                this.field2168[var57] = var53;
                this.field2163[var57] = var54;
                this.field2170[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method5910() + var56;
                var56 = var55;
                this.field2168[var57] = var53;
                this.field2163[var57] = var54;
                this.field2170[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method5910() + var56;
                var56 = var55;
                this.field2168[var57] = var53;
                this.field2163[var57] = var61;
                this.field2170[var57] = var55;
            }
        }
        var4.field4161 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field2179[var62] = 0;
            this.field2201[var62] = (short) var4.method5899();
            this.field2192[var62] = (short) var4.method5899();
            this.field2182[var62] = (short) var4.method5899();
        }
        if (this.field2174 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field2174[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field2201[var65] & 0xFFFF) == this.field2168[var64] && (this.field2192[var65] & 0xFFFF) == this.field2163[var64] && (this.field2182[var65] & 0xFFFF) == this.field2170[var64]) {
                        this.field2174[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field2174 = null;
            }
        }
        if (!var3) {
            this.field2197 = null;
        }
        if (!var2) {
            this.field2171 = null;
        }
    }

    public class192(class192[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field2183 = 0;
        this.field2167 = 0;
        this.field2178 = 0;
        this.field2187 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class192 var10 = arg0[var9];
            if (var10 != null) {
                this.field2183 += var10.field2183;
                this.field2167 += var10.field2167;
                this.field2178 += var10.field2178;
                if (var10.field2199 == null) {
                    if (this.field2187 == -1) {
                        this.field2187 = var10.field2187;
                    }
                    if (this.field2187 != var10.field2187) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field2171 != null;
                var5 |= var10.field2173 != null;
                var6 |= var10.field2184 != null;
                var7 |= var10.field2197 != null;
                var8 |= var10.field2174 != null;
            }
        }
        this.field2164 = new int[this.field2183];
        this.field2165 = new int[this.field2183];
        this.field2166 = new int[this.field2183];
        this.field2176 = new int[this.field2183];
        this.field2168 = new int[this.field2167];
        this.field2163 = new int[this.field2167];
        this.field2170 = new int[this.field2167];
        if (var3) {
            this.field2171 = new byte[this.field2167];
        }
        if (var4) {
            this.field2199 = new byte[this.field2167];
        }
        if (var5) {
            this.field2173 = new byte[this.field2167];
        }
        if (var6) {
            this.field2184 = new int[this.field2167];
        }
        if (var7) {
            this.field2197 = new short[this.field2167];
        }
        if (var8) {
            this.field2174 = new byte[this.field2167];
        }
        this.field2175 = new short[this.field2167];
        if (this.field2178 > 0) {
            this.field2179 = new byte[this.field2178];
            this.field2201 = new short[this.field2178];
            this.field2192 = new short[this.field2178];
            this.field2182 = new short[this.field2178];
        }
        this.field2183 = 0;
        this.field2167 = 0;
        this.field2178 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class192 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field2167; var13++) {
                    if (var3 && var12.field2171 != null) {
                        this.field2171[this.field2167] = var12.field2171[var13];
                    }
                    if (var4) {
                        if (var12.field2199 == null) {
                            this.field2199[this.field2167] = var12.field2187;
                        } else {
                            this.field2199[this.field2167] = var12.field2199[var13];
                        }
                    }
                    if (var5 && var12.field2173 != null) {
                        this.field2173[this.field2167] = var12.field2173[var13];
                    }
                    if (var6 && var12.field2184 != null) {
                        this.field2184[this.field2167] = var12.field2184[var13];
                    }
                    if (var7) {
                        if (var12.field2197 == null) {
                            this.field2197[this.field2167] = -1;
                        } else {
                            this.field2197[this.field2167] = var12.field2197[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field2174 == null || var12.field2174[var13] == -1) {
                            this.field2174[this.field2167] = -1;
                        } else {
                            this.field2174[this.field2167] = (byte) (var12.field2174[var13] + this.field2178);
                        }
                    }
                    this.field2175[this.field2167] = var12.field2175[var13];
                    this.field2168[this.field2167] = this.method3410(var12, var12.field2168[var13]);
                    this.field2163[this.field2167] = this.method3410(var12, var12.field2163[var13]);
                    this.field2170[this.field2167] = this.method3410(var12, var12.field2170[var13]);
                    this.field2167++;
                }
                for (int var14 = 0; var14 < var12.field2178; var14++) {
                    byte var15 = this.field2179[this.field2178] = var12.field2179[var14];
                    if (var15 == 0) {
                        this.field2201[this.field2178] = (short) this.method3410(var12, var12.field2201[var14]);
                        this.field2192[this.field2178] = (short) this.method3410(var12, var12.field2192[var14]);
                        this.field2182[this.field2178] = (short) this.method3410(var12, var12.field2182[var14]);
                    }
                    this.field2178++;
                }
            }
        }
    }

    @ObfuscatedName("ga.o(Lga;I)I")
    public final int method3410(class192 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field2164[arg1];
        int var5 = arg0.field2165[arg1];
        int var6 = arg0.field2166[arg1];
        for (int var7 = 0; var7 < this.field2183; var7++) {
            if (this.field2164[var7] == var4 && this.field2165[var7] == var5 && this.field2166[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field2164[this.field2183] = var4;
            this.field2165[this.field2183] = var5;
            this.field2166[this.field2183] = var6;
            if (arg0.field2176 != null) {
                this.field2176[this.field2183] = arg0.field2176[arg1];
            }
            var3 = this.field2183++;
        }
        return var3;
    }

    public class192(class192 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field2183 = arg0.field2183;
        this.field2167 = arg0.field2167;
        this.field2178 = arg0.field2178;
        if (arg1) {
            this.field2164 = arg0.field2164;
            this.field2165 = arg0.field2165;
            this.field2166 = arg0.field2166;
        } else {
            this.field2164 = new int[this.field2183];
            this.field2165 = new int[this.field2183];
            this.field2166 = new int[this.field2183];
            for (int var6 = 0; var6 < this.field2183; var6++) {
                this.field2164[var6] = arg0.field2164[var6];
                this.field2165[var6] = arg0.field2165[var6];
                this.field2166[var6] = arg0.field2166[var6];
            }
        }
        if (arg2) {
            this.field2175 = arg0.field2175;
        } else {
            this.field2175 = new short[this.field2167];
            for (int var7 = 0; var7 < this.field2167; var7++) {
                this.field2175[var7] = arg0.field2175[var7];
            }
        }
        if (arg3 || arg0.field2197 == null) {
            this.field2197 = arg0.field2197;
        } else {
            this.field2197 = new short[this.field2167];
            for (int var8 = 0; var8 < this.field2167; var8++) {
                this.field2197[var8] = arg0.field2197[var8];
            }
        }
        if (arg4) {
            this.field2173 = arg0.field2173;
        } else {
            this.field2173 = new byte[this.field2167];
            if (arg0.field2173 == null) {
                for (int var9 = 0; var9 < this.field2167; var9++) {
                    this.field2173[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field2167; var10++) {
                    this.field2173[var10] = arg0.field2173[var10];
                }
            }
        }
        this.field2168 = arg0.field2168;
        this.field2163 = arg0.field2163;
        this.field2170 = arg0.field2170;
        this.field2171 = arg0.field2171;
        this.field2199 = arg0.field2199;
        this.field2174 = arg0.field2174;
        this.field2187 = arg0.field2187;
        this.field2179 = arg0.field2179;
        this.field2201 = arg0.field2201;
        this.field2192 = arg0.field2192;
        this.field2182 = arg0.field2182;
        this.field2176 = arg0.field2176;
        this.field2184 = arg0.field2184;
        this.field2185 = arg0.field2185;
        this.field2186 = arg0.field2186;
        this.field2188 = arg0.field2188;
        this.field2172 = arg0.field2172;
        this.field2169 = arg0.field2169;
        this.field2190 = arg0.field2190;
        this.field2191 = arg0.field2191;
    }

    @ObfuscatedName("ga.m()Lga;")
    public class192 method3412() {
        class192 var1 = new class192();
        if (this.field2171 != null) {
            var1.field2171 = new byte[this.field2167];
            for (int var2 = 0; var2 < this.field2167; var2++) {
                var1.field2171[var2] = this.field2171[var2];
            }
        }
        var1.field2183 = this.field2183;
        var1.field2167 = this.field2167;
        var1.field2178 = this.field2178;
        var1.field2164 = this.field2164;
        var1.field2165 = this.field2165;
        var1.field2166 = this.field2166;
        var1.field2168 = this.field2168;
        var1.field2163 = this.field2163;
        var1.field2170 = this.field2170;
        var1.field2199 = this.field2199;
        var1.field2173 = this.field2173;
        var1.field2174 = this.field2174;
        var1.field2175 = this.field2175;
        var1.field2197 = this.field2197;
        var1.field2187 = this.field2187;
        var1.field2179 = this.field2179;
        var1.field2201 = this.field2201;
        var1.field2192 = this.field2192;
        var1.field2182 = this.field2182;
        var1.field2176 = this.field2176;
        var1.field2184 = this.field2184;
        var1.field2185 = this.field2185;
        var1.field2186 = this.field2186;
        var1.field2188 = this.field2188;
        var1.field2172 = this.field2172;
        var1.field2190 = this.field2190;
        var1.field2191 = this.field2191;
        return var1;
    }

    @ObfuscatedName("ga.r([[IIIIZI)Lga;")
    public class192 method3475(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method3426();
        int var7 = this.field2194 + arg1;
        int var8 = this.field2195 + arg1;
        int var9 = this.field2196 + arg3;
        int var10 = this.field2177 + arg3;
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
        class192 var15;
        if (arg4) {
            var15 = new class192();
            var15.field2183 = this.field2183;
            var15.field2167 = this.field2167;
            var15.field2178 = this.field2178;
            var15.field2164 = this.field2164;
            var15.field2166 = this.field2166;
            var15.field2168 = this.field2168;
            var15.field2163 = this.field2163;
            var15.field2170 = this.field2170;
            var15.field2171 = this.field2171;
            var15.field2199 = this.field2199;
            var15.field2173 = this.field2173;
            var15.field2174 = this.field2174;
            var15.field2175 = this.field2175;
            var15.field2197 = this.field2197;
            var15.field2187 = this.field2187;
            var15.field2179 = this.field2179;
            var15.field2201 = this.field2201;
            var15.field2192 = this.field2192;
            var15.field2182 = this.field2182;
            var15.field2176 = this.field2176;
            var15.field2184 = this.field2184;
            var15.field2185 = this.field2185;
            var15.field2186 = this.field2186;
            var15.field2190 = this.field2190;
            var15.field2191 = this.field2191;
            var15.field2165 = new int[var15.field2183];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field2183; var16++) {
                int var17 = this.field2164[var16] + arg1;
                int var18 = this.field2166[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field2165[var16] = this.field2165[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field2183; var26++) {
                int var27 = (-this.field2165[var26] << 16) / this.field2359;
                if (var27 < arg5) {
                    int var28 = this.field2164[var26] + arg1;
                    int var29 = this.field2166[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field2165[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field2165[var26];
                }
            }
        }
        var15.method3467();
        return var15;
    }

    @ObfuscatedName("ga.h()V")
    public void method3414() {
        int var10002;
        if (this.field2176 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field2183; var3++) {
                int var4 = this.field2176[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field2185 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field2185[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field2183) {
                int var7 = this.field2176[var6];
                this.field2185[var7][var1[var7]++] = var6++;
            }
            this.field2176 = null;
        }
        if (this.field2184 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field2167; var10++) {
            int var11 = this.field2184[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field2186 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field2186[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field2167) {
            int var14 = this.field2184[var13];
            this.field2186[var14][var8[var14]++] = var13++;
        }
        this.field2184 = null;
    }

    @ObfuscatedName("ga.d()V")
    public void method3415() {
        for (int var1 = 0; var1 < this.field2183; var1++) {
            int var2 = this.field2164[var1];
            this.field2164[var1] = this.field2166[var1];
            this.field2166[var1] = -var2;
        }
        this.method3467();
    }

    @ObfuscatedName("ga.z()V")
    public void method3416() {
        for (int var1 = 0; var1 < this.field2183; var1++) {
            this.field2164[var1] = -this.field2164[var1];
            this.field2166[var1] = -this.field2166[var1];
        }
        this.method3467();
    }

    @ObfuscatedName("ga.b()V")
    public void method3417() {
        for (int var1 = 0; var1 < this.field2183; var1++) {
            int var2 = this.field2166[var1];
            this.field2166[var1] = this.field2164[var1];
            this.field2164[var1] = -var2;
        }
        this.method3467();
    }

    @ObfuscatedName("ga.i(I)V")
    public void method3406(int arg0) {
        int var2 = field2189[arg0];
        int var3 = field2202[arg0];
        for (int var4 = 0; var4 < this.field2183; var4++) {
            int var5 = this.field2166[var4] * var2 + this.field2164[var4] * var3 >> 16;
            this.field2166[var4] = this.field2166[var4] * var3 - this.field2164[var4] * var2 >> 16;
            this.field2164[var4] = var5;
        }
        this.method3467();
    }

    @ObfuscatedName("ga.k(III)V")
    public void method3473(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2183; var4++) {
            this.field2164[var4] += arg0;
            this.field2165[var4] += arg1;
            this.field2166[var4] += arg2;
        }
        this.method3467();
    }

    @ObfuscatedName("ga.g(SS)V")
    public void method3420(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2167; var3++) {
            if (this.field2175[var3] == arg0) {
                this.field2175[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("ga.t(SS)V")
    public void method3474(short arg0, short arg1) {
        if (this.field2197 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field2167; var3++) {
            if (this.field2197[var3] == arg0) {
                this.field2197[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("ga.x()V")
    public void method3419() {
        for (int var1 = 0; var1 < this.field2183; var1++) {
            this.field2166[var1] = -this.field2166[var1];
        }
        for (int var2 = 0; var2 < this.field2167; var2++) {
            int var3 = this.field2168[var2];
            this.field2168[var2] = this.field2170[var2];
            this.field2170[var2] = var3;
        }
        this.method3467();
    }

    @ObfuscatedName("ga.u(III)V")
    public void method3423(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2183; var4++) {
            this.field2164[var4] = this.field2164[var4] * arg0 / 128;
            this.field2165[var4] = this.field2165[var4] * arg1 / 128;
            this.field2166[var4] = this.field2166[var4] * arg2 / 128;
        }
        this.method3467();
    }

    @ObfuscatedName("ga.q()V")
    public void method3424() {
        if (this.field2188 != null) {
            return;
        }
        this.field2188 = new class208[this.field2183];
        for (int var1 = 0; var1 < this.field2183; var1++) {
            this.field2188[var1] = new class208();
        }
        for (int var2 = 0; var2 < this.field2167; var2++) {
            int var3 = this.field2168[var2];
            int var4 = this.field2163[var2];
            int var5 = this.field2170[var2];
            int var6 = this.field2164[var4] - this.field2164[var3];
            int var7 = this.field2165[var4] - this.field2165[var3];
            int var8 = this.field2166[var4] - this.field2166[var3];
            int var9 = this.field2164[var5] - this.field2164[var3];
            int var10 = this.field2165[var5] - this.field2165[var3];
            int var11 = this.field2166[var5] - this.field2166[var3];
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
            if (this.field2171 == null) {
                var19 = 0;
            } else {
                var19 = this.field2171[var2];
            }
            if (var19 == 0) {
                class208 var20 = this.field2188[var3];
                var20.field2504 += var16;
                var20.field2503 += var17;
                var20.field2505 += var18;
                var20.field2506++;
                class208 var21 = this.field2188[var4];
                var21.field2504 += var16;
                var21.field2503 += var17;
                var21.field2505 += var18;
                var21.field2506++;
                class208 var22 = this.field2188[var5];
                var22.field2504 += var16;
                var22.field2503 += var17;
                var22.field2505 += var18;
                var22.field2506++;
            } else if (var19 == 1) {
                if (this.field2172 == null) {
                    this.field2172 = new class201[this.field2167];
                }
                class201 var23 = this.field2172[var2] = new class201();
                var23.field2362 = var16;
                var23.field2361 = var17;
                var23.field2363 = var18;
            }
        }
    }

    @ObfuscatedName("ga.s()V")
    public void method3467() {
        this.field2188 = null;
        this.field2169 = null;
        this.field2172 = null;
        this.field2181 = false;
    }

    @ObfuscatedName("ga.p()V")
    public void method3426() {
        if (this.field2181) {
            return;
        }
        this.field2359 = 0;
        this.field2193 = 0;
        this.field2194 = 999999;
        this.field2195 = -999999;
        this.field2177 = -99999;
        this.field2196 = 99999;
        for (int var1 = 0; var1 < this.field2183; var1++) {
            int var2 = this.field2164[var1];
            int var3 = this.field2165[var1];
            int var4 = this.field2166[var1];
            if (var2 < this.field2194) {
                this.field2194 = var2;
            }
            if (var2 > this.field2195) {
                this.field2195 = var2;
            }
            if (var4 < this.field2196) {
                this.field2196 = var4;
            }
            if (var4 > this.field2177) {
                this.field2177 = var4;
            }
            if (-var3 > this.field2359) {
                this.field2359 = -var3;
            }
            if (var3 > this.field2193) {
                this.field2193 = var3;
            }
        }
        this.field2181 = true;
    }

    @ObfuscatedName("ga.c(Lga;Lga;IIIZ)V")
    public static void method3427(class192 arg0, class192 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method3426();
        arg0.method3424();
        arg1.method3426();
        arg1.method3424();
        field2200++;
        int var6 = 0;
        int[] var7 = arg1.field2164;
        int var8 = arg1.field2183;
        for (int var9 = 0; var9 < arg0.field2183; var9++) {
            class208 var10 = arg0.field2188[var9];
            if (var10.field2506 != 0) {
                int var11 = arg0.field2165[var9] - arg3;
                if (var11 <= arg1.field2193) {
                    int var12 = arg0.field2164[var9] - arg2;
                    if (var12 >= arg1.field2194 && var12 <= arg1.field2195) {
                        int var13 = arg0.field2166[var9] - arg4;
                        if (var13 >= arg1.field2196 && var13 <= arg1.field2177) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class208 var15 = arg1.field2188[var14];
                                if (var7[var14] == var12 && arg1.field2166[var14] == var13 && arg1.field2165[var14] == var11 && var15.field2506 != 0) {
                                    if (arg0.field2169 == null) {
                                        arg0.field2169 = new class208[arg0.field2183];
                                    }
                                    if (arg1.field2169 == null) {
                                        arg1.field2169 = new class208[var8];
                                    }
                                    class208 var16 = arg0.field2169[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field2169[var9] = new class208(var10);
                                    }
                                    class208 var17 = arg1.field2169[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field2169[var14] = new class208(var15);
                                    }
                                    var16.field2504 += var15.field2504;
                                    var16.field2503 += var15.field2503;
                                    var16.field2505 += var15.field2505;
                                    var16.field2506 += var15.field2506;
                                    var17.field2504 += var10.field2504;
                                    var17.field2503 += var10.field2503;
                                    var17.field2505 += var10.field2505;
                                    var17.field2506 += var10.field2506;
                                    var6++;
                                    field2198[var9] = field2200;
                                    field2180[var14] = field2200;
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
        for (int var18 = 0; var18 < arg0.field2167; var18++) {
            if (field2198[arg0.field2168[var18]] == field2200 && field2198[arg0.field2163[var18]] == field2200 && field2198[arg0.field2170[var18]] == field2200) {
                if (arg0.field2171 == null) {
                    arg0.field2171 = new byte[arg0.field2167];
                }
                arg0.field2171[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field2167; var19++) {
            if (field2180[arg1.field2168[var19]] == field2200 && field2180[arg1.field2163[var19]] == field2200 && field2180[arg1.field2170[var19]] == field2200) {
                if (arg1.field2171 == null) {
                    arg1.field2171 = new byte[arg1.field2167];
                }
                arg1.field2171[var19] = 2;
            }
        }
    }

    @ObfuscatedName("ga.n(IIIII)Lgd;")
    public final class206 method3428(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method3424();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class206 var8 = new class206();
        var8.field2431 = new int[this.field2167];
        var8.field2426 = new int[this.field2167];
        var8.field2487 = new int[this.field2167];
        if (this.field2178 > 0 && this.field2174 != null) {
            int[] var9 = new int[this.field2178];
            for (int var10 = 0; var10 < this.field2167; var10++) {
                if (this.field2174[var10] != -1) {
                    var9[this.field2174[var10] & 0xFF]++;
                }
            }
            var8.field2439 = 0;
            for (int var11 = 0; var11 < this.field2178; var11++) {
                if (var9[var11] > 0 && this.field2179[var11] == 0) {
                    var8.field2439++;
                }
            }
            var8.field2450 = new int[var8.field2439];
            var8.field2441 = new int[var8.field2439];
            var8.field2442 = new int[var8.field2439];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field2178; var13++) {
                if (var9[var13] > 0 && this.field2179[var13] == 0) {
                    var8.field2450[var12] = this.field2201[var13] & 0xFFFF;
                    var8.field2441[var12] = this.field2192[var13] & 0xFFFF;
                    var8.field2442[var12] = this.field2182[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field2449 = new byte[this.field2167];
            for (int var14 = 0; var14 < this.field2167; var14++) {
                if (this.field2174[var14] == -1) {
                    var8.field2449[var14] = -1;
                } else {
                    var8.field2449[var14] = (byte) var9[this.field2174[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field2167; var15++) {
            byte var16;
            if (this.field2171 == null) {
                var16 = 0;
            } else {
                var16 = this.field2171[var15];
            }
            byte var17;
            if (this.field2173 == null) {
                var17 = 0;
            } else {
                var17 = this.field2173[var15];
            }
            short var18;
            if (this.field2197 == null) {
                var18 = -1;
            } else {
                var18 = this.field2197[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field2175[var15] & 0xFFFF;
                    class208 var20;
                    if (this.field2169 == null || this.field2169[this.field2168[var15]] == null) {
                        var20 = this.field2188[this.field2168[var15]];
                    } else {
                        var20 = this.field2169[this.field2168[var15]];
                    }
                    int var21 = (var20.field2505 * arg4 + var20.field2504 * arg2 + var20.field2503 * arg3) / (var20.field2506 * var7) + arg0;
                    var8.field2431[var15] = method3429(var19, var21);
                    class208 var22;
                    if (this.field2169 == null || this.field2169[this.field2163[var15]] == null) {
                        var22 = this.field2188[this.field2163[var15]];
                    } else {
                        var22 = this.field2169[this.field2163[var15]];
                    }
                    int var23 = (var22.field2505 * arg4 + var22.field2504 * arg2 + var22.field2503 * arg3) / (var22.field2506 * var7) + arg0;
                    var8.field2426[var15] = method3429(var19, var23);
                    class208 var24;
                    if (this.field2169 == null || this.field2169[this.field2170[var15]] == null) {
                        var24 = this.field2188[this.field2170[var15]];
                    } else {
                        var24 = this.field2169[this.field2170[var15]];
                    }
                    int var25 = (var24.field2505 * arg4 + var24.field2504 * arg2 + var24.field2503 * arg3) / (var24.field2506 * var7) + arg0;
                    var8.field2487[var15] = method3429(var19, var25);
                } else if (var16 == 1) {
                    class201 var26 = this.field2172[var15];
                    int var27 = (var26.field2363 * arg4 + var26.field2362 * arg2 + var26.field2361 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field2431[var15] = method3429(this.field2175[var15] & 0xFFFF, var27);
                    var8.field2487[var15] = -1;
                } else if (var16 == 3) {
                    var8.field2431[var15] = 128;
                    var8.field2487[var15] = -1;
                } else {
                    var8.field2487[var15] = -2;
                }
            } else if (var16 == 0) {
                class208 var28;
                if (this.field2169 == null || this.field2169[this.field2168[var15]] == null) {
                    var28 = this.field2188[this.field2168[var15]];
                } else {
                    var28 = this.field2169[this.field2168[var15]];
                }
                int var29 = (var28.field2505 * arg4 + var28.field2504 * arg2 + var28.field2503 * arg3) / (var28.field2506 * var7) + arg0;
                var8.field2431[var15] = method3430(var29);
                class208 var30;
                if (this.field2169 == null || this.field2169[this.field2163[var15]] == null) {
                    var30 = this.field2188[this.field2163[var15]];
                } else {
                    var30 = this.field2169[this.field2163[var15]];
                }
                int var31 = (var30.field2505 * arg4 + var30.field2504 * arg2 + var30.field2503 * arg3) / (var30.field2506 * var7) + arg0;
                var8.field2426[var15] = method3430(var31);
                class208 var32;
                if (this.field2169 == null || this.field2169[this.field2170[var15]] == null) {
                    var32 = this.field2188[this.field2170[var15]];
                } else {
                    var32 = this.field2169[this.field2170[var15]];
                }
                int var33 = (var32.field2505 * arg4 + var32.field2504 * arg2 + var32.field2503 * arg3) / (var32.field2506 * var7) + arg0;
                var8.field2487[var15] = method3430(var33);
            } else if (var16 == 1) {
                class201 var34 = this.field2172[var15];
                int var35 = (var34.field2363 * arg4 + var34.field2362 * arg2 + var34.field2361 * arg3) / (var7 / 2 + var7) + arg0;
                var8.field2431[var15] = method3430(var35);
                var8.field2487[var15] = -1;
            } else {
                var8.field2487[var15] = -2;
            }
        }
        this.method3414();
        var8.field2466 = this.field2183;
        var8.field2430 = this.field2164;
        var8.field2425 = this.field2165;
        var8.field2458 = this.field2166;
        var8.field2427 = this.field2167;
        var8.field2428 = this.field2168;
        var8.field2434 = this.field2163;
        var8.field2447 = this.field2170;
        var8.field2456 = this.field2199;
        var8.field2435 = this.field2173;
        var8.field2438 = this.field2187;
        var8.field2463 = this.field2185;
        var8.field2444 = this.field2186;
        var8.field2437 = this.field2197;
        return var8;
    }

    @ObfuscatedName("ga.l(II)I")
    public static final int method3429(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("ga.w(I)I")
    public static final int method3430(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
