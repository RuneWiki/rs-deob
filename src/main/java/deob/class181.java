package deob;

@ObfuscatedName("fw")
public class class181 extends class208 {

    @ObfuscatedName("fw.d")
    public int field2918;

    @ObfuscatedName("fw.p")
    public class63[] field2928 = new class63[128];

    @ObfuscatedName("fw.v")
    public short[] field2919 = new short[128];

    @ObfuscatedName("fw.l")
    public byte[] field2924 = new byte[128];

    @ObfuscatedName("fw.y")
    public byte[] field2921 = new byte[128];

    @ObfuscatedName("fw.w")
    public class185[] field2922 = new class185[128];

    @ObfuscatedName("fw.u")
    public byte[] field2923 = new byte[128];

    @ObfuscatedName("fw.a")
    public int[] field2926 = new int[128];

    public class181(byte[] arg0) {
        class119 var2 = new class119(arg0);
        int var3;
        for (var3 = 0; var2.field1973[var2.field1966 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method2477();
        }
        var2.field1966++;
        var3++;
        int var6 = var2.field1966;
        var2.field1966 += var3;
        int var7;
        for (var7 = 0; var2.field1973[var2.field1966 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method2477();
        }
        var2.field1966++;
        var7++;
        int var10 = var2.field1966;
        var2.field1966 += var7;
        int var11;
        for (var11 = 0; var2.field1973[var2.field1966 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method2477();
        }
        var2.field1966++;
        var11++;
        byte[] var14 = new byte[var11];
        int var16;
        if (var11 > 1) {
            var14[1] = 1;
            int var15 = 1;
            var16 = 2;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var2.method2357();
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
        class185[] var19 = new class185[var16];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class185 var21 = var19[var20] = new class185();
            int var22 = var2.method2357();
            if (var22 > 0) {
                var21.field2980 = new byte[var22 * 2];
            }
            int var23 = var2.method2357();
            if (var23 > 0) {
                var21.field2986 = new byte[var23 * 2 + 2];
                var21.field2986[1] = 64;
            }
        }
        int var24 = var2.method2357();
        byte[] var25 = var24 > 0 ? new byte[var24 * 2] : null;
        int var26 = var2.method2357();
        byte[] var27 = var26 > 0 ? new byte[var26 * 2] : null;
        int var28;
        for (var28 = 0; var2.field1973[var2.field1966 + var28] != 0; var28++) {
        }
        byte[] var29 = new byte[var28];
        for (int var30 = 0; var30 < var28; var30++) {
            var29[var30] = var2.method2477();
        }
        var2.field1966++;
        var28++;
        int var31 = 0;
        for (int var32 = 0; var32 < 128; var32++) {
            var31 += var2.method2357();
            this.field2919[var32] = (short) var31;
        }
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            var33 += var2.method2357();
            this.field2919[var34] = (short) (this.field2919[var34] + (var33 << 8));
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
                var37 = var2.method2469();
            }
            this.field2919[var38] = (short) (this.field2919[var38] + ((var37 - 1 & 0x2) << 14));
            this.field2926[var38] = var37;
            var35--;
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field2926[var42] != 0) {
                if (var39 == 0) {
                    if (var40 < var4.length) {
                        var39 = var4[var40++];
                    } else {
                        var39 = -1;
                    }
                    var41 = var2.field1973[var6++] - 1;
                }
                this.field2923[var42] = (byte) var41;
                var39--;
            }
        }
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field2926[var46] != 0) {
                if (var43 == 0) {
                    if (var44 < var8.length) {
                        var43 = var8[var44++];
                    } else {
                        var43 = -1;
                    }
                    var45 = var2.field1973[var10++] + 16 << 2;
                }
                this.field2921[var46] = (byte) var45;
                var43--;
            }
        }
        int var47 = 0;
        int var48 = 0;
        class185 var49 = null;
        for (int var50 = 0; var50 < 128; var50++) {
            if (this.field2926[var50] != 0) {
                if (var47 == 0) {
                    var49 = var19[var14[var48]];
                    if (var48 < var12.length) {
                        var47 = var12[var48++];
                    } else {
                        var47 = -1;
                    }
                }
                this.field2922[var50] = var49;
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
                if (this.field2926[var54] > 0) {
                    var53 = var2.method2357() + 1;
                }
            }
            this.field2924[var54] = (byte) var53;
            var51--;
        }
        this.field2918 = var2.method2357() + 1;
        for (int var55 = 0; var55 < var16; var55++) {
            class185 var56 = var19[var55];
            if (var56.field2980 != null) {
                for (int var57 = 1; var57 < var56.field2980.length; var57 += 2) {
                    var56.field2980[var57] = var2.method2477();
                }
            }
            if (var56.field2986 != null) {
                for (int var58 = 3; var58 < var56.field2986.length - 2; var58 += 2) {
                    var56.field2986[var58] = var2.method2477();
                }
            }
        }
        if (var25 != null) {
            for (int var59 = 1; var59 < var25.length; var59 += 2) {
                var25[var59] = var2.method2477();
            }
        }
        if (var27 != null) {
            for (int var60 = 1; var60 < var27.length; var60 += 2) {
                var27[var60] = var2.method2477();
            }
        }
        for (int var61 = 0; var61 < var16; var61++) {
            class185 var62 = var19[var61];
            if (var62.field2986 != null) {
                int var63 = 0;
                for (int var64 = 2; var64 < var62.field2986.length; var64 += 2) {
                    var63 = var63 + 1 + var2.method2357();
                    var62.field2986[var64] = (byte) var63;
                }
            }
        }
        for (int var65 = 0; var65 < var16; var65++) {
            class185 var66 = var19[var65];
            if (var66.field2980 != null) {
                int var67 = 0;
                for (int var68 = 2; var68 < var66.field2980.length; var68 += 2) {
                    var67 = var67 + 1 + var2.method2357();
                    var66.field2980[var68] = (byte) var67;
                }
            }
        }
        if (var25 != null) {
            int var69 = var2.method2357();
            var25[0] = (byte) var69;
            for (int var70 = 2; var70 < var25.length; var70 += 2) {
                var69 = var69 + 1 + var2.method2357();
                var25[var70] = (byte) var69;
            }
            byte var71 = var25[0];
            byte var72 = var25[1];
            for (int var73 = 0; var73 < var71; var73++) {
                this.field2924[var73] = (byte) (this.field2924[var73] * var72 + 32 >> 6);
            }
            for (int var74 = 2; var74 < var25.length; var74 += 2) {
                byte var75 = var25[var74];
                byte var76 = var25[var74 + 1];
                int var77 = (var75 - var71) / 2 + (var75 - var71) * var72;
                for (int var78 = var71; var78 < var75; var78++) {
                    int var79 = var75 - var71;
                    int var80 = var77 >>> 31;
                    int var81 = (var77 + var80) / var79 - var80;
                    this.field2924[var78] = (byte) (this.field2924[var78] * var81 + 32 >> 6);
                    var77 += var76 - var72;
                }
                var71 = var75;
                var72 = var76;
            }
            for (int var83 = var71; var83 < 128; var83++) {
                this.field2924[var83] = (byte) (this.field2924[var83] * var72 + 32 >> 6);
            }
            Object var84 = null;
        }
        if (var27 != null) {
            int var85 = var2.method2357();
            var27[0] = (byte) var85;
            for (int var86 = 2; var86 < var27.length; var86 += 2) {
                var85 = var85 + 1 + var2.method2357();
                var27[var86] = (byte) var85;
            }
            byte var87 = var27[0];
            int var88 = var27[1] << 1;
            for (int var89 = 0; var89 < var87; var89++) {
                int var90 = (this.field2921[var89] & 0xFF) + var88;
                if (var90 < 0) {
                    var90 = 0;
                }
                if (var90 > 128) {
                    var90 = 128;
                }
                this.field2921[var89] = (byte) var90;
            }
            for (int var91 = 2; var91 < var27.length; var91 += 2) {
                byte var92 = var27[var91];
                int var93 = var27[var91 + 1] << 1;
                int var94 = (var92 - var87) / 2 + (var92 - var87) * var88;
                for (int var95 = var87; var95 < var92; var95++) {
                    int var96 = var92 - var87;
                    int var97 = var94 >>> 31;
                    int var98 = (var94 + var97) / var96 - var97;
                    int var100 = (this.field2921[var95] & 0xFF) + var98;
                    if (var100 < 0) {
                        var100 = 0;
                    }
                    if (var100 > 128) {
                        var100 = 128;
                    }
                    this.field2921[var95] = (byte) var100;
                    var94 += var93 - var88;
                }
                var87 = var92;
                var88 = var93;
            }
            for (int var101 = var87; var101 < 128; var101++) {
                int var102 = (this.field2921[var101] & 0xFF) + var88;
                if (var102 < 0) {
                    var102 = 0;
                }
                if (var102 > 128) {
                    var102 = 128;
                }
                this.field2921[var101] = (byte) var102;
            }
            Object var103 = null;
        }
        for (int var104 = 0; var104 < var16; var104++) {
            var19[var104].field2981 = var2.method2357();
        }
        for (int var105 = 0; var105 < var16; var105++) {
            class185 var106 = var19[var105];
            if (var106.field2980 != null) {
                var106.field2982 = var2.method2357();
            }
            if (var106.field2986 != null) {
                var106.field2983 = var2.method2357();
            }
            if (var106.field2981 > 0) {
                var106.field2984 = var2.method2357();
            }
        }
        for (int var107 = 0; var107 < var16; var107++) {
            var19[var107].field2988 = var2.method2357();
        }
        for (int var108 = 0; var108 < var16; var108++) {
            class185 var109 = var19[var108];
            if (var109.field2988 > 0) {
                var109.field2985 = var2.method2357();
            }
        }
        for (int var110 = 0; var110 < var16; var110++) {
            class185 var111 = var19[var110];
            if (var111.field2985 > 0) {
                var111.field2987 = var2.method2357();
            }
        }
    }

    @ObfuscatedName("fw.d(Lbm;[B[II)Z")
    public boolean method3358(class60 arg0, byte[] arg1, int[] arg2) {
        boolean var4 = true;
        int var5 = 0;
        class63 var6 = null;
        for (int var7 = 0; var7 < 128; var7++) {
            if (arg1 == null || arg1[var7] != 0) {
                int var8 = this.field2926[var7];
                if (var8 != 0) {
                    if (var5 != var8) {
                        var5 = var8--;
                        if ((var8 & 0x1) == 0) {
                            var6 = arg0.method1214(var8 >> 2, arg2);
                        } else {
                            var6 = arg0.method1218(var8 >> 2, arg2);
                        }
                        if (var6 == null) {
                            var4 = false;
                        }
                    }
                    if (var6 != null) {
                        this.field2928[var7] = var6;
                        this.field2926[var7] = 0;
                    }
                }
            }
        }
        return var4;
    }

    @ObfuscatedName("fw.p(I)V")
    public void method3356() {
        this.field2926 = null;
    }
}
