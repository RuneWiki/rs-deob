package deob;

@ObfuscatedName("eh")
public class class143 extends class128 {

    @ObfuscatedName("eh.f")
    public int field2017;

    @ObfuscatedName("eh.i")
    public class56[] field2020 = new class56[128];

    @ObfuscatedName("eh.u")
    public short[] field2014 = new short[128];

    @ObfuscatedName("eh.h")
    public byte[] field2015 = new byte[128];

    @ObfuscatedName("eh.r")
    public byte[] field2016 = new byte[128];

    @ObfuscatedName("eh.o")
    public class138[] field2018 = new class138[128];

    @ObfuscatedName("eh.l")
    public byte[] field2013 = new byte[128];

    @ObfuscatedName("eh.n")
    public int[] field2019 = new int[128];

    public class143(byte[] arg0) {
        class154 var2 = new class154(arg0);
        int var3;
        for (var3 = 0; var2.field2114[var2.field2111 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method2667();
        }
        var2.field2111++;
        var3++;
        int var6 = var2.field2111;
        var2.field2111 += var3;
        int var7;
        for (var7 = 0; var2.field2114[var2.field2111 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method2667();
        }
        var2.field2111++;
        var7++;
        int var10 = var2.field2111;
        var2.field2111 += var7;
        int var11;
        for (var11 = 0; var2.field2114[var2.field2111 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method2667();
        }
        var2.field2111++;
        var11++;
        byte[] var14 = new byte[var11];
        int var16;
        if (var11 > 1) {
            var14[1] = 1;
            int var15 = 1;
            var16 = 2;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var2.method2666();
                if (var18 == 0) {
                    var15 = var16++;
                } else {
                    if (var18 <= var15) {
                        var18--;
                    }
                    var15 = var18;
                }
                var14[var17] = (byte) var15;
            }
        } else {
            var16 = var11;
        }
        class138[] var19 = new class138[var16];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class138 var21 = var19[var20] = new class138();
            int var22 = var2.method2666();
            if (var22 > 0) {
                var21.field1925 = new byte[var22 * 2];
            }
            int var23 = var2.method2666();
            if (var23 > 0) {
                var21.field1926 = new byte[var23 * 2 + 2];
                var21.field1926[1] = 64;
            }
        }
        int var24 = var2.method2666();
        byte[] var25 = var24 > 0 ? new byte[var24 * 2] : null;
        int var26 = var2.method2666();
        byte[] var27 = var26 > 0 ? new byte[var26 * 2] : null;
        int var28;
        for (var28 = 0; var2.field2114[var2.field2111 + var28] != 0; var28++) {
        }
        byte[] var29 = new byte[var28];
        for (int var30 = 0; var30 < var28; var30++) {
            var29[var30] = var2.method2667();
        }
        var2.field2111++;
        var28++;
        int var31 = 0;
        for (int var32 = 0; var32 < 128; var32++) {
            var31 += var2.method2666();
            this.field2014[var32] = (short) var31;
        }
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            var33 += var2.method2666();
            this.field2014[var34] = (short) (this.field2014[var34] + (var33 << 8));
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (var35 == 0) {
                if (var36 < var29.length) {
                    var35 = var29[var36++];
                } else {
                    var35 = -1;
                }
                var37 = var2.method2682();
            }
            this.field2014[var38] = (short) (this.field2014[var38] + ((var37 - 1 & 0x2) << 14));
            this.field2019[var38] = var37;
            var35--;
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field2019[var42] != 0) {
                if (var39 == 0) {
                    if (var40 < var4.length) {
                        var39 = var4[var40++];
                    } else {
                        var39 = -1;
                    }
                    var41 = var2.field2114[var6++] - 1;
                }
                this.field2013[var42] = (byte) var41;
                var39--;
            }
        }
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field2019[var46] != 0) {
                if (var43 == 0) {
                    if (var44 < var8.length) {
                        var43 = var8[var44++];
                    } else {
                        var43 = -1;
                    }
                    var45 = var2.field2114[var10++] + 16 << 2;
                }
                this.field2016[var46] = (byte) var45;
                var43--;
            }
        }
        int var47 = 0;
        int var48 = 0;
        class138 var49 = null;
        for (int var50 = 0; var50 < 128; var50++) {
            if (this.field2019[var50] != 0) {
                if (var47 == 0) {
                    var49 = var19[var14[var48]];
                    if (var48 < var12.length) {
                        var47 = var12[var48++];
                    } else {
                        var47 = -1;
                    }
                }
                this.field2018[var50] = var49;
                var47--;
            }
        }
        int var51 = 0;
        int var52 = 0;
        int var53 = 0;
        for (int var54 = 0; var54 < 128; var54++) {
            if (var51 == 0) {
                if (var52 < var29.length) {
                    var51 = var29[var52++];
                } else {
                    var51 = -1;
                }
                if (this.field2019[var54] > 0) {
                    var53 = var2.method2666() + 1;
                }
            }
            this.field2015[var54] = (byte) var53;
            var51--;
        }
        this.field2017 = var2.method2666() + 1;
        for (int var55 = 0; var55 < var16; var55++) {
            class138 var56 = var19[var55];
            if (var56.field1925 != null) {
                for (int var57 = 1; var57 < var56.field1925.length; var57 += 2) {
                    var56.field1925[var57] = var2.method2667();
                }
            }
            if (var56.field1926 != null) {
                for (int var58 = 3; var58 < var56.field1926.length - 2; var58 += 2) {
                    var56.field1926[var58] = var2.method2667();
                }
            }
        }
        if (var25 != null) {
            for (int var59 = 1; var59 < var25.length; var59 += 2) {
                var25[var59] = var2.method2667();
            }
        }
        if (var27 != null) {
            for (int var60 = 1; var60 < var27.length; var60 += 2) {
                var27[var60] = var2.method2667();
            }
        }
        for (int var61 = 0; var61 < var16; var61++) {
            class138 var62 = var19[var61];
            if (var62.field1926 != null) {
                int var63 = 0;
                for (int var64 = 2; var64 < var62.field1926.length; var64 += 2) {
                    var63 = var63 + 1 + var2.method2666();
                    var62.field1926[var64] = (byte) var63;
                }
            }
        }
        for (int var65 = 0; var65 < var16; var65++) {
            class138 var66 = var19[var65];
            if (var66.field1925 != null) {
                int var67 = 0;
                for (int var68 = 2; var68 < var66.field1925.length; var68 += 2) {
                    var67 = var67 + 1 + var2.method2666();
                    var66.field1925[var68] = (byte) var67;
                }
            }
        }
        if (var25 != null) {
            int var69 = var2.method2666();
            var25[0] = (byte) var69;
            for (int var70 = 2; var70 < var25.length; var70 += 2) {
                var69 = var69 + 1 + var2.method2666();
                var25[var70] = (byte) var69;
            }
            byte var71 = var25[0];
            byte var72 = var25[1];
            for (int var73 = 0; var73 < var71; var73++) {
                this.field2015[var73] = (byte) (this.field2015[var73] * var72 + 32 >> 6);
            }
            for (int var74 = 2; var74 < var25.length; var74 += 2) {
                byte var75 = var25[var74];
                byte var76 = var25[var74 + 1];
                int var77 = (var75 - var71) / 2 + (var75 - var71) * var72;
                for (int var78 = var71; var78 < var75; var78++) {
                    int var79 = Statics.method1996(var77, var75 - var71);
                    this.field2015[var78] = (byte) (this.field2015[var78] * var79 + 32 >> 6);
                    var77 += var76 - var72;
                }
                var71 = var75;
                var72 = var76;
            }
            for (int var80 = var71; var80 < 128; var80++) {
                this.field2015[var80] = (byte) (this.field2015[var80] * var72 + 32 >> 6);
            }
            Object var81 = null;
        }
        if (var27 != null) {
            int var82 = var2.method2666();
            var27[0] = (byte) var82;
            for (int var83 = 2; var83 < var27.length; var83 += 2) {
                var82 = var82 + 1 + var2.method2666();
                var27[var83] = (byte) var82;
            }
            byte var84 = var27[0];
            int var85 = var27[1] << 1;
            for (int var86 = 0; var86 < var84; var86++) {
                int var87 = (this.field2016[var86] & 0xFF) + var85;
                if (var87 < 0) {
                    var87 = 0;
                }
                if (var87 > 128) {
                    var87 = 128;
                }
                this.field2016[var86] = (byte) var87;
            }
            for (int var88 = 2; var88 < var27.length; var88 += 2) {
                byte var89 = var27[var88];
                int var90 = var27[var88 + 1] << 1;
                int var91 = (var89 - var84) / 2 + (var89 - var84) * var85;
                for (int var92 = var84; var92 < var89; var92++) {
                    int var93 = Statics.method1996(var91, var89 - var84);
                    int var94 = (this.field2016[var92] & 0xFF) + var93;
                    if (var94 < 0) {
                        var94 = 0;
                    }
                    if (var94 > 128) {
                        var94 = 128;
                    }
                    this.field2016[var92] = (byte) var94;
                    var91 += var90 - var85;
                }
                var84 = var89;
                var85 = var90;
            }
            for (int var95 = var84; var95 < 128; var95++) {
                int var96 = (this.field2016[var95] & 0xFF) + var85;
                if (var96 < 0) {
                    var96 = 0;
                }
                if (var96 > 128) {
                    var96 = 128;
                }
                this.field2016[var95] = (byte) var96;
            }
            Object var97 = null;
        }
        for (int var98 = 0; var98 < var16; var98++) {
            var19[var98].field1927 = var2.method2666();
        }
        for (int var99 = 0; var99 < var16; var99++) {
            class138 var100 = var19[var99];
            if (var100.field1925 != null) {
                var100.field1931 = var2.method2666();
            }
            if (var100.field1926 != null) {
                var100.field1929 = var2.method2666();
            }
            if (var100.field1927 > 0) {
                var100.field1930 = var2.method2666();
            }
        }
        for (int var101 = 0; var101 < var16; var101++) {
            var19[var101].field1932 = var2.method2666();
        }
        for (int var102 = 0; var102 < var16; var102++) {
            class138 var103 = var19[var102];
            if (var103.field1932 > 0) {
                var103.field1935 = var2.method2666();
            }
        }
        for (int var104 = 0; var104 < var16; var104++) {
            class138 var105 = var19[var104];
            if (var105.field1935 > 0) {
                var105.field1933 = var2.method2666();
            }
        }
    }

    @ObfuscatedName("eh.f(Lbv;[B[II)Z")
    public boolean method2559(class61 arg0, byte[] arg1, int[] arg2) {
        boolean var4 = true;
        int var5 = 0;
        class56 var6 = null;
        for (int var7 = 0; var7 < 128; var7++) {
            if (arg1 == null || arg1[var7] != 0) {
                int var8 = this.field2019[var7];
                if (var8 != 0) {
                    if (var5 != var8) {
                        var5 = var8--;
                        if ((var8 & 0x1) == 0) {
                            var6 = arg0.method1127(var8 >> 2, arg2);
                        } else {
                            var6 = arg0.method1132(var8 >> 2, arg2);
                        }
                        if (var6 == null) {
                            var4 = false;
                        }
                    }
                    if (var6 != null) {
                        this.field2020[var7] = var6;
                        this.field2019[var7] = 0;
                    }
                }
            }
        }
        return var4;
    }

    @ObfuscatedName("eh.i(I)V")
    public void method2555() {
        this.field2019 = null;
    }
}
