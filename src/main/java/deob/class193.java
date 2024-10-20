package deob;

@ObfuscatedName("gz")
public class class193 extends class201 {

    @ObfuscatedName("gz.s")
    public int field2177 = 0;

    @ObfuscatedName("gz.t")
    public int[] field2151;

    @ObfuscatedName("gz.v")
    public int[] field2150;

    @ObfuscatedName("gz.j")
    public int[] field2153;

    @ObfuscatedName("gz.l")
    public int field2154 = 0;

    @ObfuscatedName("gz.n")
    public int[] field2155;

    @ObfuscatedName("gz.w")
    public int[] field2156;

    @ObfuscatedName("gz.f")
    public int[] field2157;

    @ObfuscatedName("gz.o")
    public byte[] field2174;

    @ObfuscatedName("gz.x")
    public byte[] field2169;

    @ObfuscatedName("gz.r")
    public byte[] field2160;

    @ObfuscatedName("gz.p")
    public byte[] field2159;

    @ObfuscatedName("gz.h")
    public short[] field2184;

    @ObfuscatedName("gz.k")
    public short[] field2158;

    @ObfuscatedName("gz.a")
    public byte field2164 = 0;

    @ObfuscatedName("gz.q")
    public int field2165;

    @ObfuscatedName("gz.u")
    public byte[] field2166;

    @ObfuscatedName("gz.e")
    public short[] field2167;

    @ObfuscatedName("gz.c")
    public short[] field2168;

    @ObfuscatedName("gz.i")
    public short[] field2161;

    @ObfuscatedName("gz.m")
    public int[] field2170;

    @ObfuscatedName("gz.b")
    public int[] field2171;

    @ObfuscatedName("gz.z")
    public int[][] field2172;

    @ObfuscatedName("gz.d")
    public int[][] field2173;

    @ObfuscatedName("gz.y")
    public class202[] field2189;

    @ObfuscatedName("gz.g")
    public class209[] field2152;

    @ObfuscatedName("gz.ae")
    public class209[] field2176;

    @ObfuscatedName("gz.an")
    public short field2175;

    @ObfuscatedName("gz.am")
    public short field2178;

    @ObfuscatedName("gz.al")
    public boolean field2179 = false;

    @ObfuscatedName("gz.aq")
    public int field2180;

    @ObfuscatedName("gz.aa")
    public int field2181;

    @ObfuscatedName("gz.ab")
    public int field2182;

    @ObfuscatedName("gz.ax")
    public int field2162;

    @ObfuscatedName("gz.au")
    public int field2183;

    @ObfuscatedName("gz.av")
    public static int[] field2185 = new int[10000];

    @ObfuscatedName("gz.as")
    public static int[] field2186 = new int[10000];

    @ObfuscatedName("gz.ao")
    public static int field2187 = 0;

    @ObfuscatedName("gz.az")
    public static int[] field2188 = class198.field2266;

    @ObfuscatedName("gz.ak")
    public static int[] field2163 = class198.field2273;

    public class193() {
    }

    @ObfuscatedName("gz.s(Ljy;II)Lgz;")
    public static class193 method3357(class277 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method4459(arg1, arg2);
        return var3 == null ? null : new class193(var3);
    }

    public class193(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method3372(arg0);
        } else {
            this.method3359(arg0);
        }
    }

    @ObfuscatedName("gz.v([B)V")
    public void method3372(byte[] arg0) {
        class385 var2 = new class385(arg0);
        class385 var3 = new class385(arg0);
        class385 var4 = new class385(arg0);
        class385 var5 = new class385(arg0);
        class385 var6 = new class385(arg0);
        class385 var7 = new class385(arg0);
        class385 var8 = new class385(arg0);
        var2.field4182 = arg0.length - 23;
        int var9 = var2.method6053();
        int var10 = var2.method6053();
        int var11 = var2.method5958();
        int var12 = var2.method5958();
        int var13 = var2.method5958();
        int var14 = var2.method5958();
        int var15 = var2.method5958();
        int var16 = var2.method5958();
        int var17 = var2.method5958();
        int var18 = var2.method6053();
        int var19 = var2.method6053();
        int var20 = var2.method6053();
        int var21 = var2.method6053();
        int var22 = var2.method6053();
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field2166 = new byte[var11];
            var2.field4182 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field2166[var26] = var2.method5959();
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
        this.field2177 = var9;
        this.field2154 = var10;
        this.field2165 = var11;
        this.field2151 = new int[var9];
        this.field2150 = new int[var9];
        this.field2153 = new int[var9];
        this.field2155 = new int[var10];
        this.field2156 = new int[var10];
        this.field2157 = new int[var10];
        if (var17 == 1) {
            this.field2170 = new int[var9];
        }
        if (var12 == 1) {
            this.field2174 = new byte[var10];
        }
        if (var13 == 255) {
            this.field2169 = new byte[var10];
        } else {
            this.field2164 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2160 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2171 = new int[var10];
        }
        if (var16 == 1) {
            this.field2158 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field2159 = new byte[var10];
        }
        this.field2184 = new short[var10];
        if (var11 > 0) {
            this.field2167 = new short[var11];
            this.field2168 = new short[var11];
            this.field2161 = new short[var11];
        }
        var2.field4182 = var11;
        var3.field4182 = var44;
        var4.field4182 = var46;
        var5.field4182 = var48;
        var6.field4182 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var68 = var2.method5958();
            int var69 = 0;
            if ((var68 & 0x1) != 0) {
                var69 = var3.method5971();
            }
            int var70 = 0;
            if ((var68 & 0x2) != 0) {
                var70 = var4.method5971();
            }
            int var71 = 0;
            if ((var68 & 0x4) != 0) {
                var71 = var5.method5971();
            }
            this.field2151[var67] = var64 + var69;
            this.field2150[var67] = var65 + var70;
            this.field2153[var67] = var66 + var71;
            var64 = this.field2151[var67];
            var65 = this.field2150[var67];
            var66 = this.field2153[var67];
            if (var17 == 1) {
                this.field2170[var67] = var6.method5958();
            }
        }
        var2.field4182 = var42;
        var3.field4182 = var31;
        var4.field4182 = var34;
        var5.field4182 = var37;
        var6.field4182 = var35;
        var7.field4182 = var40;
        var8.field4182 = var39;
        for (int var72 = 0; var72 < var10; var72++) {
            this.field2184[var72] = (short) var2.method6053();
            if (var12 == 1) {
                this.field2174[var72] = var3.method5959();
            }
            if (var13 == 255) {
                this.field2169[var72] = var4.method5959();
            }
            if (var14 == 1) {
                this.field2160[var72] = var5.method5959();
            }
            if (var15 == 1) {
                this.field2171[var72] = var6.method5958();
            }
            if (var16 == 1) {
                this.field2158[var72] = (short) (var7.method6053() - 1);
            }
            if (this.field2159 != null && this.field2158[var72] != -1) {
                this.field2159[var72] = (byte) (var8.method5958() - 1);
            }
        }
        var2.field4182 = var33;
        var3.field4182 = var30;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        int var76 = 0;
        for (int var77 = 0; var77 < var10; var77++) {
            int var78 = var3.method5958();
            if (var78 == 1) {
                var73 = var2.method5971() + var76;
                var74 = var2.method5971() + var73;
                var75 = var2.method5971() + var74;
                var76 = var75;
                this.field2155[var77] = var73;
                this.field2156[var77] = var74;
                this.field2157[var77] = var75;
            }
            if (var78 == 2) {
                var74 = var75;
                var75 = var2.method5971() + var76;
                var76 = var75;
                this.field2155[var77] = var73;
                this.field2156[var77] = var74;
                this.field2157[var77] = var75;
            }
            if (var78 == 3) {
                var73 = var75;
                var75 = var2.method5971() + var76;
                var76 = var75;
                this.field2155[var77] = var73;
                this.field2156[var77] = var74;
                this.field2157[var77] = var75;
            }
            if (var78 == 4) {
                int var81 = var73;
                var73 = var74;
                var74 = var81;
                var75 = var2.method5971() + var76;
                var76 = var75;
                this.field2155[var77] = var73;
                this.field2156[var77] = var81;
                this.field2157[var77] = var75;
            }
        }
        var2.field4182 = var50;
        var3.field4182 = var52;
        var4.field4182 = var54;
        var5.field4182 = var56;
        var6.field4182 = var58;
        var7.field4182 = var60;
        for (int var82 = 0; var82 < var11; var82++) {
            int var83 = this.field2166[var82] & 0xFF;
            if (var83 == 0) {
                this.field2167[var82] = (short) var2.method6053();
                this.field2168[var82] = (short) var2.method6053();
                this.field2161[var82] = (short) var2.method6053();
            }
        }
        var2.field4182 = var62;
        int var84 = var2.method5958();
        if (var84 == 0) {
            return;
        }
        new class211();
        var2.method6053();
        var2.method6053();
        var2.method6053();
        var2.method6182();
    }

    @ObfuscatedName("gz.j([B)V")
    public void method3359(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class385 var4 = new class385(arg0);
        class385 var5 = new class385(arg0);
        class385 var6 = new class385(arg0);
        class385 var7 = new class385(arg0);
        class385 var8 = new class385(arg0);
        var4.field4182 = arg0.length - 18;
        int var9 = var4.method6053();
        int var10 = var4.method6053();
        int var11 = var4.method5958();
        int var12 = var4.method5958();
        int var13 = var4.method5958();
        int var14 = var4.method5958();
        int var15 = var4.method5958();
        int var16 = var4.method5958();
        int var17 = var4.method6053();
        int var18 = var4.method6053();
        int var19 = var4.method6053();
        int var20 = var4.method6053();
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
        this.field2177 = var9;
        this.field2154 = var10;
        this.field2165 = var11;
        this.field2151 = new int[var9];
        this.field2150 = new int[var9];
        this.field2153 = new int[var9];
        this.field2155 = new int[var10];
        this.field2156 = new int[var10];
        this.field2157 = new int[var10];
        if (var11 > 0) {
            this.field2166 = new byte[var11];
            this.field2167 = new short[var11];
            this.field2168 = new short[var11];
            this.field2161 = new short[var11];
        }
        if (var16 == 1) {
            this.field2170 = new int[var9];
        }
        if (var12 == 1) {
            this.field2174 = new byte[var10];
            this.field2159 = new byte[var10];
            this.field2158 = new short[var10];
        }
        if (var13 == 255) {
            this.field2169 = new byte[var10];
        } else {
            this.field2164 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2160 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2171 = new int[var10];
        }
        this.field2184 = new short[var10];
        var4.field4182 = var21;
        var5.field4182 = var36;
        var6.field4182 = var38;
        var7.field4182 = var40;
        var8.field4182 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method5958();
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method5971();
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method5971();
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method5971();
            }
            this.field2151[var46] = var43 + var48;
            this.field2150[var46] = var44 + var49;
            this.field2153[var46] = var45 + var50;
            var43 = this.field2151[var46];
            var44 = this.field2150[var46];
            var45 = this.field2153[var46];
            if (var16 == 1) {
                this.field2170[var46] = var8.method5958();
            }
        }
        var4.field4182 = var32;
        var5.field4182 = var28;
        var6.field4182 = var26;
        var7.field4182 = var30;
        var8.field4182 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field2184[var51] = (short) var4.method6053();
            if (var12 == 1) {
                int var52 = var5.method5958();
                if ((var52 & 0x1) == 1) {
                    this.field2174[var51] = 1;
                    var2 = true;
                } else {
                    this.field2174[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field2159[var51] = (byte) (var52 >> 2);
                    this.field2158[var51] = this.field2184[var51];
                    this.field2184[var51] = 127;
                    if (this.field2158[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field2159[var51] = -1;
                    this.field2158[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field2169[var51] = var6.method5959();
            }
            if (var14 == 1) {
                this.field2160[var51] = var7.method5959();
            }
            if (var15 == 1) {
                this.field2171[var51] = var8.method5958();
            }
        }
        var4.field4182 = var25;
        var5.field4182 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method5958();
            if (var58 == 1) {
                var53 = var4.method5971() + var56;
                var54 = var4.method5971() + var53;
                var55 = var4.method5971() + var54;
                var56 = var55;
                this.field2155[var57] = var53;
                this.field2156[var57] = var54;
                this.field2157[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method5971() + var56;
                var56 = var55;
                this.field2155[var57] = var53;
                this.field2156[var57] = var54;
                this.field2157[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method5971() + var56;
                var56 = var55;
                this.field2155[var57] = var53;
                this.field2156[var57] = var54;
                this.field2157[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method5971() + var56;
                var56 = var55;
                this.field2155[var57] = var53;
                this.field2156[var57] = var61;
                this.field2157[var57] = var55;
            }
        }
        var4.field4182 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field2166[var62] = 0;
            this.field2167[var62] = (short) var4.method6053();
            this.field2168[var62] = (short) var4.method6053();
            this.field2161[var62] = (short) var4.method6053();
        }
        if (this.field2159 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field2159[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field2167[var65] & 0xFFFF) == this.field2155[var64] && (this.field2168[var65] & 0xFFFF) == this.field2156[var64] && (this.field2161[var65] & 0xFFFF) == this.field2157[var64]) {
                        this.field2159[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field2159 = null;
            }
        }
        if (!var3) {
            this.field2158 = null;
        }
        if (!var2) {
            this.field2174 = null;
        }
    }

    public class193(class193[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field2177 = 0;
        this.field2154 = 0;
        this.field2165 = 0;
        this.field2164 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class193 var10 = arg0[var9];
            if (var10 != null) {
                this.field2177 += var10.field2177;
                this.field2154 += var10.field2154;
                this.field2165 += var10.field2165;
                if (var10.field2169 == null) {
                    if (this.field2164 == -1) {
                        this.field2164 = var10.field2164;
                    }
                    if (this.field2164 != var10.field2164) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field2174 != null;
                var5 |= var10.field2160 != null;
                var6 |= var10.field2171 != null;
                var7 |= var10.field2158 != null;
                var8 |= var10.field2159 != null;
            }
        }
        this.field2151 = new int[this.field2177];
        this.field2150 = new int[this.field2177];
        this.field2153 = new int[this.field2177];
        this.field2170 = new int[this.field2177];
        this.field2155 = new int[this.field2154];
        this.field2156 = new int[this.field2154];
        this.field2157 = new int[this.field2154];
        if (var3) {
            this.field2174 = new byte[this.field2154];
        }
        if (var4) {
            this.field2169 = new byte[this.field2154];
        }
        if (var5) {
            this.field2160 = new byte[this.field2154];
        }
        if (var6) {
            this.field2171 = new int[this.field2154];
        }
        if (var7) {
            this.field2158 = new short[this.field2154];
        }
        if (var8) {
            this.field2159 = new byte[this.field2154];
        }
        this.field2184 = new short[this.field2154];
        if (this.field2165 > 0) {
            this.field2166 = new byte[this.field2165];
            this.field2167 = new short[this.field2165];
            this.field2168 = new short[this.field2165];
            this.field2161 = new short[this.field2165];
        }
        this.field2177 = 0;
        this.field2154 = 0;
        this.field2165 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class193 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field2154; var13++) {
                    if (var3 && var12.field2174 != null) {
                        this.field2174[this.field2154] = var12.field2174[var13];
                    }
                    if (var4) {
                        if (var12.field2169 == null) {
                            this.field2169[this.field2154] = var12.field2164;
                        } else {
                            this.field2169[this.field2154] = var12.field2169[var13];
                        }
                    }
                    if (var5 && var12.field2160 != null) {
                        this.field2160[this.field2154] = var12.field2160[var13];
                    }
                    if (var6 && var12.field2171 != null) {
                        this.field2171[this.field2154] = var12.field2171[var13];
                    }
                    if (var7) {
                        if (var12.field2158 == null) {
                            this.field2158[this.field2154] = -1;
                        } else {
                            this.field2158[this.field2154] = var12.field2158[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field2159 == null || var12.field2159[var13] == -1) {
                            this.field2159[this.field2154] = -1;
                        } else {
                            this.field2159[this.field2154] = (byte) (var12.field2159[var13] + this.field2165);
                        }
                    }
                    this.field2184[this.field2154] = var12.field2184[var13];
                    this.field2155[this.field2154] = this.method3395(var12, var12.field2155[var13]);
                    this.field2156[this.field2154] = this.method3395(var12, var12.field2156[var13]);
                    this.field2157[this.field2154] = this.method3395(var12, var12.field2157[var13]);
                    this.field2154++;
                }
                for (int var14 = 0; var14 < var12.field2165; var14++) {
                    byte var15 = this.field2166[this.field2165] = var12.field2166[var14];
                    if (var15 == 0) {
                        this.field2167[this.field2165] = (short) this.method3395(var12, var12.field2167[var14]);
                        this.field2168[this.field2165] = (short) this.method3395(var12, var12.field2168[var14]);
                        this.field2161[this.field2165] = (short) this.method3395(var12, var12.field2161[var14]);
                    }
                    this.field2165++;
                }
            }
        }
    }

    @ObfuscatedName("gz.l(Lgz;I)I")
    public final int method3395(class193 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field2151[arg1];
        int var5 = arg0.field2150[arg1];
        int var6 = arg0.field2153[arg1];
        for (int var7 = 0; var7 < this.field2177; var7++) {
            if (this.field2151[var7] == var4 && this.field2150[var7] == var5 && this.field2153[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field2151[this.field2177] = var4;
            this.field2150[this.field2177] = var5;
            this.field2153[this.field2177] = var6;
            if (arg0.field2170 != null) {
                this.field2170[this.field2177] = arg0.field2170[arg1];
            }
            var3 = this.field2177++;
        }
        return var3;
    }

    public class193(class193 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field2177 = arg0.field2177;
        this.field2154 = arg0.field2154;
        this.field2165 = arg0.field2165;
        if (arg1) {
            this.field2151 = arg0.field2151;
            this.field2150 = arg0.field2150;
            this.field2153 = arg0.field2153;
        } else {
            this.field2151 = new int[this.field2177];
            this.field2150 = new int[this.field2177];
            this.field2153 = new int[this.field2177];
            for (int var6 = 0; var6 < this.field2177; var6++) {
                this.field2151[var6] = arg0.field2151[var6];
                this.field2150[var6] = arg0.field2150[var6];
                this.field2153[var6] = arg0.field2153[var6];
            }
        }
        if (arg2) {
            this.field2184 = arg0.field2184;
        } else {
            this.field2184 = new short[this.field2154];
            for (int var7 = 0; var7 < this.field2154; var7++) {
                this.field2184[var7] = arg0.field2184[var7];
            }
        }
        if (arg3 || arg0.field2158 == null) {
            this.field2158 = arg0.field2158;
        } else {
            this.field2158 = new short[this.field2154];
            for (int var8 = 0; var8 < this.field2154; var8++) {
                this.field2158[var8] = arg0.field2158[var8];
            }
        }
        if (arg4) {
            this.field2160 = arg0.field2160;
        } else {
            this.field2160 = new byte[this.field2154];
            if (arg0.field2160 == null) {
                for (int var9 = 0; var9 < this.field2154; var9++) {
                    this.field2160[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field2154; var10++) {
                    this.field2160[var10] = arg0.field2160[var10];
                }
            }
        }
        this.field2155 = arg0.field2155;
        this.field2156 = arg0.field2156;
        this.field2157 = arg0.field2157;
        this.field2174 = arg0.field2174;
        this.field2169 = arg0.field2169;
        this.field2159 = arg0.field2159;
        this.field2164 = arg0.field2164;
        this.field2166 = arg0.field2166;
        this.field2167 = arg0.field2167;
        this.field2168 = arg0.field2168;
        this.field2161 = arg0.field2161;
        this.field2170 = arg0.field2170;
        this.field2171 = arg0.field2171;
        this.field2172 = arg0.field2172;
        this.field2173 = arg0.field2173;
        this.field2152 = arg0.field2152;
        this.field2189 = arg0.field2189;
        this.field2176 = arg0.field2176;
        this.field2175 = arg0.field2175;
        this.field2178 = arg0.field2178;
    }

    @ObfuscatedName("gz.n()Lgz;")
    public class193 method3361() {
        class193 var1 = new class193();
        if (this.field2174 != null) {
            var1.field2174 = new byte[this.field2154];
            for (int var2 = 0; var2 < this.field2154; var2++) {
                var1.field2174[var2] = this.field2174[var2];
            }
        }
        var1.field2177 = this.field2177;
        var1.field2154 = this.field2154;
        var1.field2165 = this.field2165;
        var1.field2151 = this.field2151;
        var1.field2150 = this.field2150;
        var1.field2153 = this.field2153;
        var1.field2155 = this.field2155;
        var1.field2156 = this.field2156;
        var1.field2157 = this.field2157;
        var1.field2169 = this.field2169;
        var1.field2160 = this.field2160;
        var1.field2159 = this.field2159;
        var1.field2184 = this.field2184;
        var1.field2158 = this.field2158;
        var1.field2164 = this.field2164;
        var1.field2166 = this.field2166;
        var1.field2167 = this.field2167;
        var1.field2168 = this.field2168;
        var1.field2161 = this.field2161;
        var1.field2170 = this.field2170;
        var1.field2171 = this.field2171;
        var1.field2172 = this.field2172;
        var1.field2173 = this.field2173;
        var1.field2152 = this.field2152;
        var1.field2189 = this.field2189;
        var1.field2175 = this.field2175;
        var1.field2178 = this.field2178;
        return var1;
    }

    @ObfuscatedName("gz.f([[IIIIZI)Lgz;")
    public class193 method3362(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method3390();
        int var7 = this.field2181 + arg1;
        int var8 = this.field2182 + arg1;
        int var9 = this.field2183 + arg3;
        int var10 = this.field2162 + arg3;
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
        class193 var15;
        if (arg4) {
            var15 = new class193();
            var15.field2177 = this.field2177;
            var15.field2154 = this.field2154;
            var15.field2165 = this.field2165;
            var15.field2151 = this.field2151;
            var15.field2153 = this.field2153;
            var15.field2155 = this.field2155;
            var15.field2156 = this.field2156;
            var15.field2157 = this.field2157;
            var15.field2174 = this.field2174;
            var15.field2169 = this.field2169;
            var15.field2160 = this.field2160;
            var15.field2159 = this.field2159;
            var15.field2184 = this.field2184;
            var15.field2158 = this.field2158;
            var15.field2164 = this.field2164;
            var15.field2166 = this.field2166;
            var15.field2167 = this.field2167;
            var15.field2168 = this.field2168;
            var15.field2161 = this.field2161;
            var15.field2170 = this.field2170;
            var15.field2171 = this.field2171;
            var15.field2172 = this.field2172;
            var15.field2173 = this.field2173;
            var15.field2175 = this.field2175;
            var15.field2178 = this.field2178;
            var15.field2150 = new int[var15.field2177];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field2177; var16++) {
                int var17 = this.field2151[var16] + arg1;
                int var18 = this.field2153[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field2150[var16] = this.field2150[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field2177; var26++) {
                int var27 = (-this.field2150[var26] << 16) / this.field2346;
                if (var27 < arg5) {
                    int var28 = this.field2151[var26] + arg1;
                    int var29 = this.field2153[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field2150[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field2150[var26];
                }
            }
        }
        var15.method3374();
        return var15;
    }

    @ObfuscatedName("gz.o()V")
    public void method3363() {
        int var10002;
        if (this.field2170 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field2177; var3++) {
                int var4 = this.field2170[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field2172 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field2172[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field2177) {
                int var7 = this.field2170[var6];
                this.field2172[var7][var1[var7]++] = var6++;
            }
            this.field2170 = null;
        }
        if (this.field2171 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field2154; var10++) {
            int var11 = this.field2171[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field2173 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field2173[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field2154) {
            int var14 = this.field2171[var13];
            this.field2173[var14][var8[var14]++] = var13++;
        }
        this.field2171 = null;
    }

    @ObfuscatedName("gz.x()V")
    public void method3356() {
        for (int var1 = 0; var1 < this.field2177; var1++) {
            int var2 = this.field2151[var1];
            this.field2151[var1] = this.field2153[var1];
            this.field2153[var1] = -var2;
        }
        this.method3374();
    }

    @ObfuscatedName("gz.r()V")
    public void method3365() {
        for (int var1 = 0; var1 < this.field2177; var1++) {
            this.field2151[var1] = -this.field2151[var1];
            this.field2153[var1] = -this.field2153[var1];
        }
        this.method3374();
    }

    @ObfuscatedName("gz.p()V")
    public void method3366() {
        for (int var1 = 0; var1 < this.field2177; var1++) {
            int var2 = this.field2153[var1];
            this.field2153[var1] = this.field2151[var1];
            this.field2151[var1] = -var2;
        }
        this.method3374();
    }

    @ObfuscatedName("gz.h(I)V")
    public void method3420(int arg0) {
        int var2 = field2188[arg0];
        int var3 = field2163[arg0];
        for (int var4 = 0; var4 < this.field2177; var4++) {
            int var5 = this.field2153[var4] * var2 + this.field2151[var4] * var3 >> 16;
            this.field2153[var4] = this.field2153[var4] * var3 - this.field2151[var4] * var2 >> 16;
            this.field2151[var4] = var5;
        }
        this.method3374();
    }

    @ObfuscatedName("gz.k(III)V")
    public void method3368(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2177; var4++) {
            this.field2151[var4] += arg0;
            this.field2150[var4] += arg1;
            this.field2153[var4] += arg2;
        }
        this.method3374();
    }

    @ObfuscatedName("gz.a(SS)V")
    public void method3403(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2154; var3++) {
            if (this.field2184[var3] == arg0) {
                this.field2184[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("gz.q(SS)V")
    public void method3370(short arg0, short arg1) {
        if (this.field2158 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field2154; var3++) {
            if (this.field2158[var3] == arg0) {
                this.field2158[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("gz.u()V")
    public void method3371() {
        for (int var1 = 0; var1 < this.field2177; var1++) {
            this.field2153[var1] = -this.field2153[var1];
        }
        for (int var2 = 0; var2 < this.field2154; var2++) {
            int var3 = this.field2155[var2];
            this.field2155[var2] = this.field2157[var2];
            this.field2157[var2] = var3;
        }
        this.method3374();
    }

    @ObfuscatedName("gz.e(III)V")
    public void method3409(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2177; var4++) {
            this.field2151[var4] = this.field2151[var4] * arg0 / 128;
            this.field2150[var4] = this.field2150[var4] * arg1 / 128;
            this.field2153[var4] = this.field2153[var4] * arg2 / 128;
        }
        this.method3374();
    }

    @ObfuscatedName("gz.c()V")
    public void method3373() {
        if (this.field2152 != null) {
            return;
        }
        this.field2152 = new class209[this.field2177];
        for (int var1 = 0; var1 < this.field2177; var1++) {
            this.field2152[var1] = new class209();
        }
        for (int var2 = 0; var2 < this.field2154; var2++) {
            int var3 = this.field2155[var2];
            int var4 = this.field2156[var2];
            int var5 = this.field2157[var2];
            int var6 = this.field2151[var4] - this.field2151[var3];
            int var7 = this.field2150[var4] - this.field2150[var3];
            int var8 = this.field2153[var4] - this.field2153[var3];
            int var9 = this.field2151[var5] - this.field2151[var3];
            int var10 = this.field2150[var5] - this.field2150[var3];
            int var11 = this.field2153[var5] - this.field2153[var3];
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
            if (this.field2174 == null) {
                var19 = 0;
            } else {
                var19 = this.field2174[var2];
            }
            if (var19 == 0) {
                class209 var20 = this.field2152[var3];
                var20.field2496 += var16;
                var20.field2494 += var17;
                var20.field2495 += var18;
                var20.field2493++;
                class209 var21 = this.field2152[var4];
                var21.field2496 += var16;
                var21.field2494 += var17;
                var21.field2495 += var18;
                var21.field2493++;
                class209 var22 = this.field2152[var5];
                var22.field2496 += var16;
                var22.field2494 += var17;
                var22.field2495 += var18;
                var22.field2493++;
            } else if (var19 == 1) {
                if (this.field2189 == null) {
                    this.field2189 = new class202[this.field2154];
                }
                class202 var23 = this.field2189[var2] = new class202();
                var23.field2347 = var16;
                var23.field2348 = var17;
                var23.field2349 = var18;
            }
        }
    }

    @ObfuscatedName("gz.i()V")
    public void method3374() {
        this.field2152 = null;
        this.field2176 = null;
        this.field2189 = null;
        this.field2179 = false;
    }

    @ObfuscatedName("gz.m()V")
    public void method3390() {
        if (this.field2179) {
            return;
        }
        this.field2346 = 0;
        this.field2180 = 0;
        this.field2181 = 999999;
        this.field2182 = -999999;
        this.field2162 = -99999;
        this.field2183 = 99999;
        for (int var1 = 0; var1 < this.field2177; var1++) {
            int var2 = this.field2151[var1];
            int var3 = this.field2150[var1];
            int var4 = this.field2153[var1];
            if (var2 < this.field2181) {
                this.field2181 = var2;
            }
            if (var2 > this.field2182) {
                this.field2182 = var2;
            }
            if (var4 < this.field2183) {
                this.field2183 = var4;
            }
            if (var4 > this.field2162) {
                this.field2162 = var4;
            }
            if (-var3 > this.field2346) {
                this.field2346 = -var3;
            }
            if (var3 > this.field2180) {
                this.field2180 = var3;
            }
        }
        this.field2179 = true;
    }

    @ObfuscatedName("gz.b(Lgz;Lgz;IIIZ)V")
    public static void method3376(class193 arg0, class193 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method3390();
        arg0.method3373();
        arg1.method3390();
        arg1.method3373();
        field2187++;
        int var6 = 0;
        int[] var7 = arg1.field2151;
        int var8 = arg1.field2177;
        for (int var9 = 0; var9 < arg0.field2177; var9++) {
            class209 var10 = arg0.field2152[var9];
            if (var10.field2493 != 0) {
                int var11 = arg0.field2150[var9] - arg3;
                if (var11 <= arg1.field2180) {
                    int var12 = arg0.field2151[var9] - arg2;
                    if (var12 >= arg1.field2181 && var12 <= arg1.field2182) {
                        int var13 = arg0.field2153[var9] - arg4;
                        if (var13 >= arg1.field2183 && var13 <= arg1.field2162) {
                            for (int var14 = 0; var14 < var8; var14++) {
                                class209 var15 = arg1.field2152[var14];
                                if (var7[var14] == var12 && arg1.field2153[var14] == var13 && arg1.field2150[var14] == var11 && var15.field2493 != 0) {
                                    if (arg0.field2176 == null) {
                                        arg0.field2176 = new class209[arg0.field2177];
                                    }
                                    if (arg1.field2176 == null) {
                                        arg1.field2176 = new class209[var8];
                                    }
                                    class209 var16 = arg0.field2176[var9];
                                    if (var16 == null) {
                                        var16 = arg0.field2176[var9] = new class209(var10);
                                    }
                                    class209 var17 = arg1.field2176[var14];
                                    if (var17 == null) {
                                        var17 = arg1.field2176[var14] = new class209(var15);
                                    }
                                    var16.field2496 += var15.field2496;
                                    var16.field2494 += var15.field2494;
                                    var16.field2495 += var15.field2495;
                                    var16.field2493 += var15.field2493;
                                    var17.field2496 += var10.field2496;
                                    var17.field2494 += var10.field2494;
                                    var17.field2495 += var10.field2495;
                                    var17.field2493 += var10.field2493;
                                    var6++;
                                    field2185[var9] = field2187;
                                    field2186[var14] = field2187;
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
        for (int var18 = 0; var18 < arg0.field2154; var18++) {
            if (field2185[arg0.field2155[var18]] == field2187 && field2185[arg0.field2156[var18]] == field2187 && field2185[arg0.field2157[var18]] == field2187) {
                if (arg0.field2174 == null) {
                    arg0.field2174 = new byte[arg0.field2154];
                }
                arg0.field2174[var18] = 2;
            }
        }
        for (int var19 = 0; var19 < arg1.field2154; var19++) {
            if (field2186[arg1.field2155[var19]] == field2187 && field2186[arg1.field2156[var19]] == field2187 && field2186[arg1.field2157[var19]] == field2187) {
                if (arg1.field2174 == null) {
                    arg1.field2174 = new byte[arg1.field2154];
                }
                arg1.field2174[var19] = 2;
            }
        }
    }

    @ObfuscatedName("gz.z(IIIII)Lgl;")
    public final class207 method3377(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method3373();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class207 var8 = new class207();
        var8.field2409 = new int[this.field2154];
        var8.field2417 = new int[this.field2154];
        var8.field2418 = new int[this.field2154];
        if (this.field2165 > 0 && this.field2159 != null) {
            int[] var9 = new int[this.field2165];
            for (int var10 = 0; var10 < this.field2154; var10++) {
                if (this.field2159[var10] != -1) {
                    var9[this.field2159[var10] & 0xFF]++;
                }
            }
            var8.field2424 = 0;
            for (int var11 = 0; var11 < this.field2165; var11++) {
                if (var9[var11] > 0 && this.field2166[var11] == 0) {
                    var8.field2424++;
                }
            }
            var8.field2454 = new int[var8.field2424];
            var8.field2426 = new int[var8.field2424];
            var8.field2427 = new int[var8.field2424];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field2165; var13++) {
                if (var9[var13] > 0 && this.field2166[var13] == 0) {
                    var8.field2454[var12] = this.field2167[var13] & 0xFFFF;
                    var8.field2426[var12] = this.field2168[var13] & 0xFFFF;
                    var8.field2427[var12] = this.field2161[var13] & 0xFFFF;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field2441 = new byte[this.field2154];
            for (int var14 = 0; var14 < this.field2154; var14++) {
                if (this.field2159[var14] == -1) {
                    var8.field2441[var14] = -1;
                } else {
                    var8.field2441[var14] = (byte) var9[this.field2159[var14] & 0xFF];
                }
            }
        }
        for (int var15 = 0; var15 < this.field2154; var15++) {
            byte var16;
            if (this.field2174 == null) {
                var16 = 0;
            } else {
                var16 = this.field2174[var15];
            }
            byte var17;
            if (this.field2160 == null) {
                var17 = 0;
            } else {
                var17 = this.field2160[var15];
            }
            short var18;
            if (this.field2158 == null) {
                var18 = -1;
            } else {
                var18 = this.field2158[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 == 0) {
                    int var19 = this.field2184[var15] & 0xFFFF;
                    class209 var20;
                    if (this.field2176 == null || this.field2176[this.field2155[var15]] == null) {
                        var20 = this.field2152[this.field2155[var15]];
                    } else {
                        var20 = this.field2176[this.field2155[var15]];
                    }
                    int var21 = (var20.field2495 * arg4 + var20.field2496 * arg2 + var20.field2494 * arg3) / (var20.field2493 * var7) + arg0;
                    var8.field2409[var15] = method3402(var19, var21);
                    class209 var22;
                    if (this.field2176 == null || this.field2176[this.field2156[var15]] == null) {
                        var22 = this.field2152[this.field2156[var15]];
                    } else {
                        var22 = this.field2176[this.field2156[var15]];
                    }
                    int var23 = (var22.field2495 * arg4 + var22.field2496 * arg2 + var22.field2494 * arg3) / (var22.field2493 * var7) + arg0;
                    var8.field2417[var15] = method3402(var19, var23);
                    class209 var24;
                    if (this.field2176 == null || this.field2176[this.field2157[var15]] == null) {
                        var24 = this.field2152[this.field2157[var15]];
                    } else {
                        var24 = this.field2176[this.field2157[var15]];
                    }
                    int var25 = (var24.field2495 * arg4 + var24.field2496 * arg2 + var24.field2494 * arg3) / (var24.field2493 * var7) + arg0;
                    var8.field2418[var15] = method3402(var19, var25);
                } else if (var16 == 1) {
                    class202 var26 = this.field2189[var15];
                    int var27 = (var26.field2349 * arg4 + var26.field2348 * arg3 + var26.field2347 * arg2) / (var7 / 2 + var7) + arg0;
                    var8.field2409[var15] = method3402(this.field2184[var15] & 0xFFFF, var27);
                    var8.field2418[var15] = -1;
                } else if (var16 == 3) {
                    var8.field2409[var15] = 128;
                    var8.field2418[var15] = -1;
                } else {
                    var8.field2418[var15] = -2;
                }
            } else if (var16 == 0) {
                class209 var28;
                if (this.field2176 == null || this.field2176[this.field2155[var15]] == null) {
                    var28 = this.field2152[this.field2155[var15]];
                } else {
                    var28 = this.field2176[this.field2155[var15]];
                }
                int var29 = (var28.field2495 * arg4 + var28.field2496 * arg2 + var28.field2494 * arg3) / (var28.field2493 * var7) + arg0;
                var8.field2409[var15] = method3379(var29);
                class209 var30;
                if (this.field2176 == null || this.field2176[this.field2156[var15]] == null) {
                    var30 = this.field2152[this.field2156[var15]];
                } else {
                    var30 = this.field2176[this.field2156[var15]];
                }
                int var31 = (var30.field2495 * arg4 + var30.field2496 * arg2 + var30.field2494 * arg3) / (var30.field2493 * var7) + arg0;
                var8.field2417[var15] = method3379(var31);
                class209 var32;
                if (this.field2176 == null || this.field2176[this.field2157[var15]] == null) {
                    var32 = this.field2152[this.field2157[var15]];
                } else {
                    var32 = this.field2176[this.field2157[var15]];
                }
                int var33 = (var32.field2495 * arg4 + var32.field2496 * arg2 + var32.field2494 * arg3) / (var32.field2493 * var7) + arg0;
                var8.field2418[var15] = method3379(var33);
            } else if (var16 == 1) {
                class202 var34 = this.field2189[var15];
                int var35 = (var34.field2349 * arg4 + var34.field2348 * arg3 + var34.field2347 * arg2) / (var7 / 2 + var7) + arg0;
                var8.field2409[var15] = method3379(var35);
                var8.field2418[var15] = -1;
            } else {
                var8.field2418[var15] = -2;
            }
        }
        this.method3363();
        var8.field2443 = this.field2177;
        var8.field2425 = this.field2151;
        var8.field2410 = this.field2150;
        var8.field2458 = this.field2153;
        var8.field2412 = this.field2154;
        var8.field2429 = this.field2155;
        var8.field2466 = this.field2156;
        var8.field2415 = this.field2157;
        var8.field2419 = this.field2169;
        var8.field2420 = this.field2160;
        var8.field2442 = this.field2164;
        var8.field2451 = this.field2172;
        var8.field2445 = this.field2173;
        var8.field2422 = this.field2158;
        return var8;
    }

    @ObfuscatedName("gz.d(II)I")
    public static final int method3402(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("gz.y(I)I")
    public static final int method3379(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }
}
