package deob;

@ObfuscatedName("gm")
public class class191 extends class199 {

    @ObfuscatedName("gm.v")
    public int field2176 = 0;

    @ObfuscatedName("gm.n")
    public int[] field2188;

    @ObfuscatedName("gm.f")
    public int[] field2195;

    @ObfuscatedName("gm.y")
    public int[] field2165;

    @ObfuscatedName("gm.p")
    public int field2198 = 0;

    @ObfuscatedName("gm.j")
    public int[] field2182;

    @ObfuscatedName("gm.r")
    public int[] field2168;

    @ObfuscatedName("gm.b")
    public int[] field2171;

    @ObfuscatedName("gm.d")
    public byte[] field2170;

    @ObfuscatedName("gm.s")
    public byte[] field2179;

    @ObfuscatedName("gm.u")
    public byte[] field2172;

    @ObfuscatedName("gm.l")
    public byte[] field2173;

    @ObfuscatedName("gm.o")
    public short[] field2174;

    @ObfuscatedName("gm.c")
    public short[] field2184;

    @ObfuscatedName("gm.e")
    public byte field2162 = 0;

    @ObfuscatedName("gm.g")
    public int field2177;

    @ObfuscatedName("gm.a")
    public byte[] field2178;

    @ObfuscatedName("gm.k")
    public short[] field2166;

    @ObfuscatedName("gm.m")
    public short[] field2180;

    @ObfuscatedName("gm.x")
    public short[] field2181;

    @ObfuscatedName("gm.z")
    public int[] field2169;

    @ObfuscatedName("gm.w")
    public int[] field2183;

    @ObfuscatedName("gm.t")
    public int[][] field2163;

    @ObfuscatedName("gm.h")
    public int[][] field2185;

    @ObfuscatedName("gm.q")
    public class200[] field2186;

    @ObfuscatedName("gm.i")
    public class207[] field2187;

    @ObfuscatedName("gm.ae")
    public class207[] field2167;

    @ObfuscatedName("gm.ap")
    public short field2189;

    @ObfuscatedName("gm.ab")
    public short field2190;

    @ObfuscatedName("gm.al")
    public boolean field2191 = false;

    @ObfuscatedName("gm.ad")
    public int field2192;

    @ObfuscatedName("gm.ai")
    public int field2193;

    @ObfuscatedName("gm.ar")
    public int field2196;

    @ObfuscatedName("gm.ag")
    public int field2175;

    @ObfuscatedName("gm.ax")
    public int field2200;

    @ObfuscatedName("gm.as")
    public static int[] field2197 = new int[10000];

    @ObfuscatedName("gm.aj")
    public static int[] field2164 = new int[10000];

    @ObfuscatedName("gm.am")
    public static int field2199 = 0;

    @ObfuscatedName("gm.az")
    public static int[] field2194 = class196.field2275;

    @ObfuscatedName("gm.av")
    public static int[] field2201 = class196.field2286;

    public class191() {
    }

    @ObfuscatedName("gm.v(Ljv;II)Lgm;")
    public static class191 method3418(class275 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method4468(arg1, arg2);
        return var3 == null ? null : new class191(var3);
    }

    public class191(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method3426(arg0);
        } else {
            this.method3404(arg0);
        }
    }

    @ObfuscatedName("gm.f([B)V")
    public void method3426(byte[] arg0) {
        class383 var2 = new class383(arg0);
        class383 var3 = new class383(arg0);
        class383 var4 = new class383(arg0);
        class383 var5 = new class383(arg0);
        class383 var6 = new class383(arg0);
        class383 var7 = new class383(arg0);
        class383 var8 = new class383(arg0);
        var2.field4158 = arg0.length - 23;
        int var9 = var2.method5967();
        int var10 = var2.method5967();
        int var11 = var2.method5965();
        int var12 = var2.method5965();
        int var13 = var2.method5965();
        int var14 = var2.method5965();
        int var15 = var2.method5965();
        int var16 = var2.method5965();
        int var17 = var2.method5965();
        int var18 = var2.method5967();
        int var19 = var2.method5967();
        int var20 = var2.method5967();
        int var21 = var2.method5967();
        int var22 = var2.method5967();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field2178 = new byte[var11];
            var2.field4158 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field2178[var26] = var2.method5966();
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
        this.field2176 = var9;
        this.field2198 = var10;
        this.field2177 = var11;
        this.field2188 = new int[var9];
        this.field2195 = new int[var9];
        this.field2165 = new int[var9];
        this.field2182 = new int[var10];
        this.field2168 = new int[var10];
        this.field2171 = new int[var10];
        if (var17 == 1) {
            this.field2169 = new int[var9];
        }
        if (var12 == 1) {
            this.field2170 = new byte[var10];
        }
        if (var13 == 255) {
            this.field2179 = new byte[var10];
        } else {
            this.field2162 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2172 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2183 = new int[var10];
        }
        if (var16 == 1) {
            this.field2184 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field2173 = new byte[var10];
        }
        this.field2174 = new short[var10];
        if (var11 > 0) {
            this.field2166 = new short[var11];
            this.field2180 = new short[var11];
            this.field2181 = new short[var11];
        }
        var2.field4158 = var11;
        var3.field4158 = var44;
        var4.field4158 = var46;
        var5.field4158 = var48;
        var6.field4158 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method5965();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method5978();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method5978();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method5978();
            }
            this.field2188[var67] = var64 + var69;
            this.field2195[var67] = var65 + var70;
            this.field2165[var67] = var66 + var71;
            var64 = this.field2188[var67];
            var65 = this.field2195[var67];
            var66 = this.field2165[var67];
            if (var17 == 1) {
                this.field2169[var67] = var6.method5965();
            }
        }
        var2.field4158 = var42;
        var3.field4158 = var31;
        var4.field4158 = var34;
        var5.field4158 = var37;
        var6.field4158 = var35;
        var7.field4158 = var40;
        var8.field4158 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field2174[var72] = (short) var2.method5967();
            if (var12 == 1) {
                this.field2170[var72] = var3.method5966();
            }
            if (var13 == 255) {
                this.field2179[var72] = var4.method5966();
            }
            if (var14 == 1) {
                this.field2172[var72] = var5.method5966();
            }
            if (var15 == 1) {
                this.field2183[var72] = var6.method5965();
            }
            if (var16 == 1) {
                this.field2184[var72] = (short) (var7.method5967() - 1);
            }
            if (this.field2173 != null && this.field2184[var72] != -1) {
                this.field2173[var72] = (byte) (var8.method5965() - 1);
            }
        }
        var2.field4158 = var33;
        var3.field4158 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method5965();
            if (var78 == 1) {
                var73 = var2.method5978() + var76;
                var74 = var2.method5978() + var73;
                var75 = var2.method5978() + var74;
                var76 = var75;
                this.field2182[var77] = var73;
                this.field2168[var77] = var74;
                this.field2171[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method5978() + var76;
                var76 = var75;
                this.field2182[var77] = var73;
                this.field2168[var77] = var74;
                this.field2171[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method5978() + var76;
                var76 = var75;
                this.field2182[var77] = var73;
                this.field2168[var77] = var74;
                this.field2171[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method5978() + var76;
                var76 = var75;
                this.field2182[var77] = var73;
                this.field2168[var77] = var81;
                this.field2171[var77] = var75;
            }
        }
        var2.field4158 = var50;
        var3.field4158 = var52;
        var4.field4158 = var54;
        var5.field4158 = var56;
        var6.field4158 = var58;
        var7.field4158 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field2178[var82] & 0xFF;
            if (var83 == 0) {
                this.field2166[var82] = (short) var2.method5967();
                this.field2180[var82] = (short) var2.method5967();
                this.field2181[var82] = (short) var2.method5967();
            }
        }
        var2.field4158 = var62;
        int var84 = var2.method5965();
        if (var84 == 0) {
            return;
        }
        new class209();
        var2.method5967();
        var2.method5967();
        var2.method5967();
        var2.method5970();
    }

    @ObfuscatedName("gm.y([B)V")
    public void method3404(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class383 var4 = new class383(arg0);
        class383 var5 = new class383(arg0);
        class383 var6 = new class383(arg0);
        class383 var7 = new class383(arg0);
        class383 var8 = new class383(arg0);
        var4.field4158 = arg0.length - 18;
        int var9 = var4.method5967();
        int var10 = var4.method5967();
        int var11 = var4.method5965();
        int var12 = var4.method5965();
        int var13 = var4.method5965();
        int var14 = var4.method5965();
        int var15 = var4.method5965();
        int var16 = var4.method5965();
        int var17 = var4.method5967();
        int var18 = var4.method5967();
        int var19 = var4.method5967();
        int var20 = var4.method5967();
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
        this.field2176 = var9;
        this.field2198 = var10;
        this.field2177 = var11;
        this.field2188 = new int[var9];
        this.field2195 = new int[var9];
        this.field2165 = new int[var9];
        this.field2182 = new int[var10];
        this.field2168 = new int[var10];
        this.field2171 = new int[var10];
        if (var11 > 0) {
            this.field2178 = new byte[var11];
            this.field2166 = new short[var11];
            this.field2180 = new short[var11];
            this.field2181 = new short[var11];
        }
        if (var16 == 1) {
            this.field2169 = new int[var9];
        }
        if (var12 == 1) {
            this.field2170 = new byte[var10];
            this.field2173 = new byte[var10];
            this.field2184 = new short[var10];
        }
        if (var13 == 255) {
            this.field2179 = new byte[var10];
        } else {
            this.field2162 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2172 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2183 = new int[var10];
        }
        this.field2174 = new short[var10];
        var4.field4158 = var21;
        var5.field4158 = var36;
        var6.field4158 = var38;
        var7.field4158 = var40;
        var8.field4158 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method5965();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method5978();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method5978();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method5978();
            }
            this.field2188[var46] = var43 + var48;
            this.field2195[var46] = var44 + var49;
            this.field2165[var46] = var45 + var50;
            var43 = this.field2188[var46];
            var44 = this.field2195[var46];
            var45 = this.field2165[var46];
            if (var16 == 1) {
                this.field2169[var46] = var8.method5965();
            }
        }
        var4.field4158 = var32;
        var5.field4158 = var28;
        var6.field4158 = var26;
        var7.field4158 = var30;
        var8.field4158 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field2174[var51] = (short) var4.method5967();
            if (var12 == 1) {
                int var52 = var5.method5965();
                if ((var52 & 0x1) == 1) {
                    this.field2170[var51] = 1;
                    var2 = true;
                } else {
                    this.field2170[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field2173[var51] = (byte) (var52 >> 2);
                    this.field2184[var51] = this.field2174[var51];
                    this.field2174[var51] = 127;
                    if (this.field2184[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field2173[var51] = -1;
                    this.field2184[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field2179[var51] = var6.method5966();
            }
            if (var14 == 1) {
                this.field2172[var51] = var7.method5966();
            }
            if (var15 == 1) {
                this.field2183[var51] = var8.method5965();
            }
        }
        var4.field4158 = var25;
        var5.field4158 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method5965();
            if (var58 == 1) {
                var53 = var4.method5978() + var56;
                var54 = var4.method5978() + var53;
                var55 = var4.method5978() + var54;
                var56 = var55;
                this.field2182[var57] = var53;
                this.field2168[var57] = var54;
                this.field2171[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method5978() + var56;
                var56 = var55;
                this.field2182[var57] = var53;
                this.field2168[var57] = var54;
                this.field2171[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method5978() + var56;
                var56 = var55;
                this.field2182[var57] = var53;
                this.field2168[var57] = var54;
                this.field2171[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method5978() + var56;
                var56 = var55;
                this.field2182[var57] = var53;
                this.field2168[var57] = var61;
                this.field2171[var57] = var55;
            }
        }
        var4.field4158 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field2178[var62] = 0;
            this.field2166[var62] = (short) var4.method5967();
            this.field2180[var62] = (short) var4.method5967();
            this.field2181[var62] = (short) var4.method5967();
        }
        if (this.field2173 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field2173[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field2166[var65] & 0xFFFF) == this.field2182[var64] && (this.field2180[var65] & 0xFFFF) == this.field2168[var64] && (this.field2181[var65] & 0xFFFF) == this.field2171[var64]) {
                        this.field2173[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field2173 = null;
            }
        }
        if (!var3) {
            this.field2184 = null;
        }
        if (!var2) {
            this.field2170 = null;
        }
    }

    public class191(class191[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field2176 = 0;
        this.field2198 = 0;
        this.field2177 = 0;
        this.field2162 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class191 var10 = arg0[var9];
            if (var10 != null) {
                this.field2176 += var10.field2176;
                this.field2198 += var10.field2198;
                this.field2177 += var10.field2177;
                if (var10.field2179 == null) {
                    if (this.field2162 == -1) {
                        this.field2162 = var10.field2162;
                    }
                    if (this.field2162 != var10.field2162) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field2170 != null;
                var5 |= var10.field2172 != null;
                var6 |= var10.field2183 != null;
                var7 |= var10.field2184 != null;
                var8 |= var10.field2173 != null;
            }
        }
        this.field2188 = new int[this.field2176];
        this.field2195 = new int[this.field2176];
        this.field2165 = new int[this.field2176];
        this.field2169 = new int[this.field2176];
        this.field2182 = new int[this.field2198];
        this.field2168 = new int[this.field2198];
        this.field2171 = new int[this.field2198];
        if (var3) {
            this.field2170 = new byte[this.field2198];
        }
        if (var4) {
            this.field2179 = new byte[this.field2198];
        }
        if (var5) {
            this.field2172 = new byte[this.field2198];
        }
        if (var6) {
            this.field2183 = new int[this.field2198];
        }
        if (var7) {
            this.field2184 = new short[this.field2198];
        }
        if (var8) {
            this.field2173 = new byte[this.field2198];
        }
        this.field2174 = new short[this.field2198];
        if (this.field2177 > 0) {
            this.field2178 = new byte[this.field2177];
            this.field2166 = new short[this.field2177];
            this.field2180 = new short[this.field2177];
            this.field2181 = new short[this.field2177];
        }
        this.field2176 = 0;
        this.field2198 = 0;
        this.field2177 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class191 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field2198; var13++) {
                    if (var3 && var12.field2170 != null) {
                        this.field2170[this.field2198] = var12.field2170[var13];
                    }
                    if (var4) {
                        if (var12.field2179 == null) {
                            this.field2179[this.field2198] = var12.field2162;
                        } else {
                            this.field2179[this.field2198] = var12.field2179[var13];
                        }
                    }
                    if (var5 && var12.field2172 != null) {
                        this.field2172[this.field2198] = var12.field2172[var13];
                    }
                    if (var6 && var12.field2183 != null) {
                        this.field2183[this.field2198] = var12.field2183[var13];
                    }
                    if (var7) {
                        if (var12.field2184 == null) {
                            this.field2184[this.field2198] = -1;
                        } else {
                            this.field2184[this.field2198] = var12.field2184[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field2173 == null || var12.field2173[var13] == -1) {
                            this.field2173[this.field2198] = -1;
                        } else {
                            this.field2173[this.field2198] = (byte) (var12.field2173[var13] + this.field2177);
                        }
                    }
                    this.field2174[this.field2198] = var12.field2174[var13];
                    this.field2182[this.field2198] = this.method3405(var12, var12.field2182[var13]);
                    this.field2168[this.field2198] = this.method3405(var12, var12.field2168[var13]);
                    this.field2171[this.field2198] = this.method3405(var12, var12.field2171[var13]);
                    this.field2198++;
                }
                for (int var14 = 0; var14 < var12.field2177; var14++) {
                    byte var15 = this.field2178[this.field2177] = var12.field2178[var14];
                    if (var15 == 0) {
                        this.field2166[this.field2177] = (short) this.method3405(var12, var12.field2166[var14]);
                        this.field2180[this.field2177] = (short) this.method3405(var12, var12.field2180[var14]);
                        this.field2181[this.field2177] = (short) this.method3405(var12, var12.field2181[var14]);
                    }
                    this.field2177++;
                }
            }
        }
    }

    @ObfuscatedName("gm.b(Lgm;I)I")
    public final int method3405(class191 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field2188[arg1];
        int var5 = arg0.field2195[arg1];
        int var6 = arg0.field2165[arg1];
        for (int var7 = 0; var7 < this.field2176; var7++) {
            if (this.field2188[var7] == var4 && this.field2195[var7] == var5 && this.field2165[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field2188[this.field2176] = var4;
            this.field2195[this.field2176] = var5;
            this.field2165[this.field2176] = var6;
            if (arg0.field2169 != null) {
                this.field2169[this.field2176] = arg0.field2169[arg1];
            }
            var3 = this.field2176++;
        }
        return var3;
    }

    public class191(class191 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field2176 = arg0.field2176;
        this.field2198 = arg0.field2198;
        this.field2177 = arg0.field2177;
        if (arg1) {
            this.field2188 = arg0.field2188;
            this.field2195 = arg0.field2195;
            this.field2165 = arg0.field2165;
        } else {
            this.field2188 = new int[this.field2176];
            this.field2195 = new int[this.field2176];
            this.field2165 = new int[this.field2176];
            for (int var6 = 0; var6 < this.field2176; var6++) {
                this.field2188[var6] = arg0.field2188[var6];
                this.field2195[var6] = arg0.field2195[var6];
                this.field2165[var6] = arg0.field2165[var6];
            }
        }
        if (arg2) {
            this.field2174 = arg0.field2174;
        } else {
            this.field2174 = new short[this.field2198];
            for (int var7 = 0; var7 < this.field2198; var7++) {
                this.field2174[var7] = arg0.field2174[var7];
            }
        }
        if (arg3 || arg0.field2184 == null) {
            this.field2184 = arg0.field2184;
        } else {
            this.field2184 = new short[this.field2198];
            for (int var8 = 0; var8 < this.field2198; var8++) {
                this.field2184[var8] = arg0.field2184[var8];
            }
        }
        if (arg4) {
            this.field2172 = arg0.field2172;
        } else {
            this.field2172 = new byte[this.field2198];
            if (arg0.field2172 == null) {
                for (int var9 = 0; var9 < this.field2198; var9++) {
                    this.field2172[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field2198; var10++) {
                    this.field2172[var10] = arg0.field2172[var10];
                }
            }
        }
        this.field2182 = arg0.field2182;
        this.field2168 = arg0.field2168;
        this.field2171 = arg0.field2171;
        this.field2170 = arg0.field2170;
        this.field2179 = arg0.field2179;
        this.field2173 = arg0.field2173;
        this.field2162 = arg0.field2162;
        this.field2178 = arg0.field2178;
        this.field2166 = arg0.field2166;
        this.field2180 = arg0.field2180;
        this.field2181 = arg0.field2181;
        this.field2169 = arg0.field2169;
        this.field2183 = arg0.field2183;
        this.field2163 = arg0.field2163;
        this.field2185 = arg0.field2185;
        this.field2187 = arg0.field2187;
        this.field2186 = arg0.field2186;
        this.field2167 = arg0.field2167;
        this.field2189 = arg0.field2189;
        this.field2190 = arg0.field2190;
    }

    @ObfuscatedName("gm.d()Lgm;")
    public class191 method3406() {
        class191 var1 = new class191();
        if (this.field2170 != null) {
            var1.field2170 = new byte[this.field2198];
            for (int var2 = 0; var2 < this.field2198; var2++) {
                var1.field2170[var2] = this.field2170[var2];
            }
        }
        var1.field2176 = this.field2176;
        var1.field2198 = this.field2198;
        var1.field2177 = this.field2177;
        var1.field2188 = this.field2188;
        var1.field2195 = this.field2195;
        var1.field2165 = this.field2165;
        var1.field2182 = this.field2182;
        var1.field2168 = this.field2168;
        var1.field2171 = this.field2171;
        var1.field2179 = this.field2179;
        var1.field2172 = this.field2172;
        var1.field2173 = this.field2173;
        var1.field2174 = this.field2174;
        var1.field2184 = this.field2184;
        var1.field2162 = this.field2162;
        var1.field2178 = this.field2178;
        var1.field2166 = this.field2166;
        var1.field2180 = this.field2180;
        var1.field2181 = this.field2181;
        var1.field2169 = this.field2169;
        var1.field2183 = this.field2183;
        var1.field2163 = this.field2163;
        var1.field2185 = this.field2185;
        var1.field2187 = this.field2187;
        var1.field2186 = this.field2186;
        var1.field2189 = this.field2189;
        var1.field2190 = this.field2190;
        return var1;
    }

    @ObfuscatedName("gm.s([[IIIIZI)Lgm;")
    public class191 method3407(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method3419();
        int var7 = this.field2193 + arg1;
        int var8 = this.field2196 + arg1;
        int var9 = this.field2200 + arg3;
        int var10 = this.field2175 + arg3;
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
        class191 var15;
        if (arg4) {
            var15 = new class191();
            var15.field2176 = this.field2176;
            var15.field2198 = this.field2198;
            var15.field2177 = this.field2177;
            var15.field2188 = this.field2188;
            var15.field2165 = this.field2165;
            var15.field2182 = this.field2182;
            var15.field2168 = this.field2168;
            var15.field2171 = this.field2171;
            var15.field2170 = this.field2170;
            var15.field2179 = this.field2179;
            var15.field2172 = this.field2172;
            var15.field2173 = this.field2173;
            var15.field2174 = this.field2174;
            var15.field2184 = this.field2184;
            var15.field2162 = this.field2162;
            var15.field2178 = this.field2178;
            var15.field2166 = this.field2166;
            var15.field2180 = this.field2180;
            var15.field2181 = this.field2181;
            var15.field2169 = this.field2169;
            var15.field2183 = this.field2183;
            var15.field2163 = this.field2163;
            var15.field2185 = this.field2185;
            var15.field2189 = this.field2189;
            var15.field2190 = this.field2190;
            var15.field2195 = new int[var15.field2176];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field2176; var16++) {
                int var17 = this.field2188[var16] + arg1;
                int var18 = this.field2165[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field2195[var16] = this.field2195[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field2176; var26++) {
                int var27 = (-this.field2195[var26] << 16) / this.field2360;
                if (var27 < arg5) {
                    int var28 = this.field2188[var26] + arg1;
                    int var29 = this.field2165[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field2195[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field2195[var26];
                }
            }
        }
        var15.method3400();
        return var15;
    }

    @ObfuscatedName("gm.u()V")
    public void method3455() {
        int var10002;
        if (this.field2169 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field2176; var3++) {
                int var4 = this.field2169[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field2163 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field2163[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field2176) {
                int var7 = this.field2169[var6];
                this.field2163[var7][var1[var7]++] = var6++;
            }
            this.field2169 = null;
        }
        if (this.field2183 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field2198; var10++) {
            int var11 = this.field2183[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field2185 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field2185[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field2198) {
            int var14 = this.field2183[var13];
            this.field2185[var14][var8[var14]++] = var13++;
        }
        this.field2183 = null;
    }

    @ObfuscatedName("gm.l()V")
    public void method3409() {
        for (int var1 = 0; var1 < this.field2176; var1++) {
            int var2 = this.field2188[var1];
            this.field2188[var1] = this.field2165[var1];
            this.field2165[var1] = -var2;
        }
        this.method3400();
    }

    @ObfuscatedName("gm.o()V")
    public void method3475() {
        for (int var1 = 0; var1 < this.field2176; var1++) {
            this.field2188[var1] = -this.field2188[var1];
            this.field2165[var1] = -this.field2165[var1];
        }
        this.method3400();
    }

    @ObfuscatedName("gm.c()V")
    public void method3411() {
        for (int var1 = 0; var1 < this.field2176; var1++) {
            int var2 = this.field2165[var1];
            this.field2165[var1] = this.field2188[var1];
            this.field2188[var1] = -var2;
        }
        this.method3400();
    }

    @ObfuscatedName("gm.e(I)V")
    public void method3422(int arg0) {
        int var2 = field2194[arg0];
        int var3 = field2201[arg0];
        for (int var4 = 0; var4 < this.field2176; var4++) {
            int var5 = this.field2188[var4] * var3 + this.field2165[var4] * var2 >> 16;
            this.field2165[var4] = this.field2165[var4] * var3 - this.field2188[var4] * var2 >> 16;
            this.field2188[var4] = var5;
        }
        this.method3400();
    }

    @ObfuscatedName("gm.g(III)V")
    public void method3425(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2176; var4++) {
            this.field2188[var4] += arg0;
            this.field2195[var4] += arg1;
            this.field2165[var4] += arg2;
        }
        this.method3400();
    }

    @ObfuscatedName("gm.a(SS)V")
    public void method3414(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2198; var3++) {
            if (this.field2174[var3] == arg0) {
                this.field2174[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("gm.k(SS)V")
    public void method3412(short arg0, short arg1) {
        if (this.field2184 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field2198; var3++) {
            if (this.field2184[var3] == arg0) {
                this.field2184[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("gm.m()V")
    public void method3415() {
        for (int var1 = 0; var1 < this.field2176; var1++) {
            this.field2165[var1] = -this.field2165[var1];
        }
        for (int var2 = 0; var2 < this.field2198; var2++) {
            int var3 = this.field2182[var2];
            this.field2182[var2] = this.field2171[var2];
            this.field2171[var2] = var3;
        }
        this.method3400();
    }

    @ObfuscatedName("gm.x(III)V")
    public void method3440(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2176; var4++) {
            this.field2188[var4] = this.field2188[var4] * arg0 / 128;
            this.field2195[var4] = this.field2195[var4] * arg1 / 128;
            this.field2165[var4] = this.field2165[var4] * arg2 / 128;
        }
        this.method3400();
    }

    @ObfuscatedName("gm.z()V")
    public void method3417() {
        if (this.field2187 != null) {
            return;
        }
        this.field2187 = new class207[this.field2176];
        for (int var1 = 0; var1 < this.field2176; var1++) {
            this.field2187[var1] = new class207();
        }
        for (int var2 = 0; var2 < this.field2198; var2++) {
            int var3 = this.field2182[var2];
            int var4 = this.field2168[var2];
            int var5 = this.field2171[var2];
            int var6 = this.field2188[var4] - this.field2188[var3];
            int var7 = this.field2195[var4] - this.field2195[var3];
            int var8 = this.field2165[var4] - this.field2165[var3];
            int var9 = this.field2188[var5] - this.field2188[var3];
            int var10 = this.field2195[var5] - this.field2195[var3];
            int var11 = this.field2165[var5] - this.field2165[var3];
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
            if (this.field2170 == null) {
                var19 = 0;
            } else {
                var19 = this.field2170[var2];
            }
            if (var19 == 0) {
                class207 var20 = this.field2187[var3];
                var20.field2507 += var16;
                var20.field2511 += var17;
                var20.field2508 += var18;
                var20.field2506++;
                class207 var21 = this.field2187[var4];
                var21.field2507 += var16;
                var21.field2511 += var17;
                var21.field2508 += var18;
                var21.field2506++;
                class207 var22 = this.field2187[var5];
                var22.field2507 += var16;
                var22.field2511 += var17;
                var22.field2508 += var18;
                var22.field2506++;
            } else if (var19 == 1) {
                if (this.field2186 == null) {
                    this.field2186 = new class200[this.field2198];
                }
                class200 var23 = this.field2186[var2] = new class200();
                var23.field2365 = var16;
                var23.field2363 = var17;
                var23.field2361 = var18;
            }
        }
    }

    @ObfuscatedName("gm.w()V")
    public void method3400() {
        this.field2187 = null;
        this.field2167 = null;
        this.field2186 = null;
        this.field2191 = false;
    }

    @ObfuscatedName("gm.t()V")
    public void method3419() {
        if (this.field2191) {
            return;
        }
        this.field2360 = 0;
        this.field2192 = 0;
        this.field2193 = 999999;
        this.field2196 = -999999;
        this.field2175 = -99999;
        this.field2200 = 99999;
        for (int var1 = 0; var1 < this.field2176; var1++) {
            int var2 = this.field2188[var1];
            int var3 = this.field2195[var1];
            int var4 = this.field2165[var1];
            if (var2 < this.field2193) {
                this.field2193 = var2;
            }
            if (var2 > this.field2196) {
                this.field2196 = var2;
            }
            if (var4 < this.field2200) {
                this.field2200 = var4;
            }
            if (var4 > this.field2175) {
                this.field2175 = var4;
            }
            if (-var3 > this.field2360) {
                this.field2360 = -var3;
            }
            if (var3 > this.field2192) {
                this.field2192 = var3;
            }
        }
        this.field2191 = true;
    }

    @ObfuscatedName("gm.h(Lgm;Lgm;IIIZ)V")
    public static void method3420(class191 arg0, class191 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method3419();
        arg0.method3417();
        arg1.method3419();
        arg1.method3417();
        field2199++;
        int var6 = 0;
        int[] var7 = arg1.field2188;
        int var8 = arg1.field2176;
        for (int var9 = 0; var9 < arg0.field2176; var9++) {
            class207 var10 = arg0.field2187[var9];
            if (var10.field2506 != 0) {
                int var11 = arg0.field2195[var9] - arg3;
                if (var11 <= arg1.field2192) {
                    int var12 = arg0.field2188[var9] - arg2;
                    if (var12 >= arg1.field2193 && var12 <= arg1.field2196) {
                        int var13 = arg0.field2165[var9] - arg4;
                        if (var13 >= arg1.field2200 && var13 <= arg1.field2175) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class207 var15 = arg1.field2187[var14];
                                if (var7[var14] == var12 && arg1.field2165[var14] == var13 && arg1.field2195[var14] == var11 && var15.field2506 != 0) {
                                    if (arg0.field2167 == null) {
                                        arg0.field2167 = new class207[arg0.field2176];
                                    }
                                    if (arg1.field2167 == null) {
                                        arg1.field2167 = new class207[var8];
                                    }
                                    class207 var16 = arg0.field2167[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field2167[var9] = new class207(var10);
                                    }
                                    class207 var17 = arg1.field2167[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field2167[var14] = new class207(var15);
                                    }
                                    var16.field2507 += var15.field2507;
                                    var16.field2511 += var15.field2511;
                                    var16.field2508 += var15.field2508;
                                    var16.field2506 += var15.field2506;
                                    var17.field2507 += var10.field2507;
                                    var17.field2511 += var10.field2511;
                                    var17.field2508 += var10.field2508;
                                    var17.field2506 += var10.field2506;
                                    var6++;
                                    field2197[var9] = field2199;
                                    field2164[var14] = field2199;
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
        for (int var18 = 0; var18 < arg0.field2198; var18++) {
            if (field2197[arg0.field2182[var18]] == field2199 && field2197[arg0.field2168[var18]] == field2199 && field2197[arg0.field2171[var18]] == field2199) {
                if (arg0.field2170 == null) {
                    arg0.field2170 = new byte[arg0.field2198];
                }
                arg0.field2170[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field2198; var19++) {
            if (field2164[arg1.field2182[var19]] == field2199 && field2164[arg1.field2168[var19]] == field2199 && field2164[arg1.field2171[var19]] == field2199) {
                if (arg1.field2170 == null) {
                    arg1.field2170 = new byte[arg1.field2198];
                }
                arg1.field2170[var19] = 2;
            }
        }
    }

    @ObfuscatedName("gm.q(IIIII)Lgr;")
    public final class205 method3421(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method3417();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class205 var8 = new class205();
        var8.field2431 = new int[this.field2198];
        var8.field2436 = new int[this.field2198];
        var8.field2437 = new int[this.field2198];
        if (this.field2177 > 0 && this.field2173 != null) {
            int[] var9 = new int[this.field2177];
            for (int var10 = 0; var10 < this.field2198; var10++) {
                if (this.field2173[var10] != -1) {
                    var9[this.field2173[var10] & 0xFF]++;
                }
            }
            var8.field2443 = 0;
            for (int var11 = 0; var11 < this.field2177; var11++) {
                if (var9[var11] > 0 && this.field2178[var11] == 0) {
                    var8.field2443++;
                }
            }
            var8.field2444 = new int[var8.field2443];
            var8.field2445 = new int[var8.field2443];
            var8.field2469 = new int[var8.field2443];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field2177; var13++) {
                if (var9[var13] > 0 && this.field2178[var13] == 0) {
                    var8.field2444[var12] = this.field2166[var13] & 0xFFFF;
                    var8.field2445[var12] = this.field2180[var13] & 0xFFFF;
                    var8.field2469[var12] = this.field2181[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field2440 = new byte[this.field2198];
            for (int var14 = 0; var14 < this.field2198; var14++) {
                if (this.field2173[var14] == -1) {
                    var8.field2440[var14] = -1;
                } else {
                    var8.field2440[var14] = (byte) var9[this.field2173[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field2198; var15++) {
            byte var16;
            if (this.field2170 == null) {
                var16 = 0;
            } else {
                var16 = this.field2170[var15];
            }
            byte var17;
            if (this.field2172 == null) {
                var17 = 0;
            } else {
                var17 = this.field2172[var15];
            }
            short var18;
            if (this.field2184 == null) {
                var18 = -1;
            } else {
                var18 = this.field2184[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field2174[var15] & 0xFFFF;
                    class207 var20;
                    if (this.field2167 == null || this.field2167[this.field2182[var15]] == null) {
                        var20 = this.field2187[this.field2182[var15]];
                    } else {
                        var20 = this.field2167[this.field2182[var15]];
                    }
                    int var21 = (var20.field2508 * arg4 + var20.field2511 * arg3 + var20.field2507 * arg2) / (var20.field2506 * var7) + arg0;
                    var8.field2431[var15] = method3410(var19, var21);
                    class207 var22;
                    if (this.field2167 == null || this.field2167[this.field2168[var15]] == null) {
                        var22 = this.field2187[this.field2168[var15]];
                    } else {
                        var22 = this.field2167[this.field2168[var15]];
                    }
                    int var23 = (var22.field2508 * arg4 + var22.field2511 * arg3 + var22.field2507 * arg2) / (var22.field2506 * var7) + arg0;
                    var8.field2436[var15] = method3410(var19, var23);
                    class207 var24;
                    if (this.field2167 == null || this.field2167[this.field2171[var15]] == null) {
                        var24 = this.field2187[this.field2171[var15]];
                    } else {
                        var24 = this.field2167[this.field2171[var15]];
                    }
                    int var25 = (var24.field2508 * arg4 + var24.field2511 * arg3 + var24.field2507 * arg2) / (var24.field2506 * var7) + arg0;
                    var8.field2437[var15] = method3410(var19, var25);
                } else if (var16 == 1) {
                    class200 var26 = this.field2186[var15];
                    int var27 = (var26.field2361 * arg4 + var26.field2365 * arg2 + var26.field2363 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field2431[var15] = method3410(this.field2174[var15] & 0xFFFF, var27);
                    var8.field2437[var15] = -1;
                } else if (var16 == 3) {
                    var8.field2431[var15] = 128;
                    var8.field2437[var15] = -1;
                } else {
                    var8.field2437[var15] = -2;
                }
            } else if (var16 == 0) {
                class207 var28;
                if (this.field2167 == null || this.field2167[this.field2182[var15]] == null) {
                    var28 = this.field2187[this.field2182[var15]];
                } else {
                    var28 = this.field2167[this.field2182[var15]];
                }
                int var29 = (var28.field2508 * arg4 + var28.field2511 * arg3 + var28.field2507 * arg2) / (var28.field2506 * var7) + arg0;
                var8.field2431[var15] = method3423(var29);
                class207 var30;
                if (this.field2167 == null || this.field2167[this.field2168[var15]] == null) {
                    var30 = this.field2187[this.field2168[var15]];
                } else {
                    var30 = this.field2167[this.field2168[var15]];
                }
                int var31 = (var30.field2508 * arg4 + var30.field2511 * arg3 + var30.field2507 * arg2) / (var30.field2506 * var7) + arg0;
                var8.field2436[var15] = method3423(var31);
                class207 var32;
                if (this.field2167 == null || this.field2167[this.field2171[var15]] == null) {
                    var32 = this.field2187[this.field2171[var15]];
                } else {
                    var32 = this.field2167[this.field2171[var15]];
                }
                int var33 = (var32.field2508 * arg4 + var32.field2511 * arg3 + var32.field2507 * arg2) / (var32.field2506 * var7) + arg0;
                var8.field2437[var15] = method3423(var33);
            } else if (var16 == 1) {
                class200 var34 = this.field2186[var15];
                int var35 = (var34.field2361 * arg4 + var34.field2365 * arg2 + var34.field2363 * arg3) / (var7 / 2 + var7) + arg0;
                var8.field2431[var15] = method3423(var35);
                var8.field2437[var15] = -1;
            } else {
                var8.field2437[var15] = -2;
            }
        }
        this.method3455();
        var8.field2427 = this.field2176;
        var8.field2428 = this.field2188;
        var8.field2429 = this.field2195;
        var8.field2447 = this.field2165;
        var8.field2481 = this.field2198;
        var8.field2432 = this.field2182;
        var8.field2477 = this.field2168;
        var8.field2434 = this.field2171;
        var8.field2459 = this.field2179;
        var8.field2439 = this.field2172;
        var8.field2442 = this.field2162;
        var8.field2488 = this.field2163;
        var8.field2448 = this.field2185;
        var8.field2441 = this.field2184;
        return var8;
    }

    @ObfuscatedName("gm.i(II)I")
    public static final int method3410(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("gm.ae(I)I")
    public static final int method3423(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
