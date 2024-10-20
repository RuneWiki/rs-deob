package deob;

@ObfuscatedName("g")
public final class class3 extends class38 {

    @ObfuscatedName("g.y")
    public String field38;

    @ObfuscatedName("g.d")
    public class179 field39;

    @ObfuscatedName("g.g")
    public int field31 = -1;

    @ObfuscatedName("g.w")
    public int field32 = -1;

    @ObfuscatedName("g.e")
    public int field54 = 0;

    @ObfuscatedName("g.c")
    public int field35 = 0;

    @ObfuscatedName("g.a")
    public int field29;

    @ObfuscatedName("g.q")
    public int field36 = 0;

    @ObfuscatedName("g.m")
    public int field50 = 0;

    @ObfuscatedName("g.n")
    public int field34;

    @ObfuscatedName("g.k")
    public int field52;

    @ObfuscatedName("g.o")
    public int field40;

    @ObfuscatedName("g.f")
    public class105 field41;

    @ObfuscatedName("g.s")
    public int field42;

    @ObfuscatedName("g.z")
    public int field43;

    @ObfuscatedName("g.b")
    public int field33;

    @ObfuscatedName("g.p")
    public int field45;

    @ObfuscatedName("g.r")
    public boolean field30 = false;

    @ObfuscatedName("g.x")
    public int field47 = 0;

    @ObfuscatedName("g.h")
    public boolean field48 = false;

    @ObfuscatedName("g.j")
    public int field49;

    @ObfuscatedName("g.v")
    public int field44;

    @ObfuscatedName("g.l")
    public boolean field51 = false;

    @ObfuscatedName("g.u")
    public int field37;

    @ObfuscatedName("g.t")
    public int field46;

    @ObfuscatedName("g.y(Ldd;I)V")
    public final void method23(class119 arg0) {
        arg0.field1973 = 0;
        int var2 = arg0.method2326();
        this.field31 = arg0.method2461();
        this.field32 = arg0.method2461();
        int var3 = -1;
        this.field47 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2326();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2326();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2525();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class52.method560(var4[var5] - 512).field1155;
                    if (var8 != 0) {
                        this.field47 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2326();
            if (var11 < 0 || var11 >= Statics.field2889[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field832 = arg0.method2525();
        if (this.field832 == 65535) {
            this.field832 = -1;
        }
        this.field808 = arg0.method2525();
        if (this.field808 == 65535) {
            this.field808 = -1;
        }
        this.field862 = this.field808;
        this.field810 = arg0.method2525();
        if (this.field810 == 65535) {
            this.field810 = -1;
        }
        this.field811 = arg0.method2525();
        if (this.field811 == 65535) {
            this.field811 = -1;
        }
        this.field826 = arg0.method2525();
        if (this.field826 == 65535) {
            this.field826 = -1;
        }
        this.field829 = arg0.method2525();
        if (this.field829 == 65535) {
            this.field829 = -1;
        }
        this.field814 = arg0.method2525();
        if (this.field814 == 65535) {
            this.field814 = -1;
        }
        this.field38 = arg0.method2334();
        if (Statics.field677 == this) {
            Statics.field2205 = this.field38;
        }
        this.field54 = arg0.method2326();
        this.field35 = arg0.method2525();
        this.field48 = arg0.method2326() == 1;
        if (client.field318 == 0 && client.field295 >= 2) {
            this.field48 = false;
        }
        if (this.field39 == null) {
            this.field39 = new class179();
        }
        this.field39.method3190(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("g.d(I)I")
    public int method12() {
        return this.field39 == null || this.field39.field2888 == -1 ? 1 : class40.method2027(this.field39.field2888).field889;
    }

    @ObfuscatedName("g.g(I)Ldg;")
    public final class105 method10() {
        if (this.field39 == null) {
            return null;
        }
        class43 var1 = this.field833 != -1 && this.field836 == 0 ? class43.method750(this.field833) : null;
        class43 var2 = this.field830 == -1 || this.field30 || this.field832 == this.field830 && var1 != null ? null : class43.method750(this.field830);
        class105 var3 = this.field39.method3195(var1, this.field834, var2, this.field831);
        if (var3 == null) {
            return null;
        }
        var3.method2177();
        this.field851 = var3.field1450;
        if (!this.field30 && this.field838 != -1 && this.field850 != -1) {
            class105 var4 = class44.method3639(this.field838).method874(this.field850);
            if (var4 != null) {
                var4.method2158(0, -this.field842, 0);
                class105[] var5 = new class105[] { var3, var4 };
                var3 = new class105(var5, 2);
            }
        }
        if (!this.field30 && this.field41 != null) {
            if (client.field303 >= this.field50) {
                this.field41 = null;
            }
            if (client.field303 >= this.field36 && client.field303 < this.field50) {
                class105 var6 = this.field41;
                var6.method2158(this.field34 - this.field839, this.field52 - this.field29, this.field40 - this.field803);
                if (this.field822 == 512) {
                    var6.method2135();
                    var6.method2135();
                    var6.method2135();
                } else if (this.field822 == 1024) {
                    var6.method2135();
                    var6.method2135();
                } else if (this.field822 == 1536) {
                    var6.method2135();
                }
                class105[] var7 = new class105[] { var3, var6 };
                var3 = new class105(var7, 2);
                if (this.field822 == 512) {
                    var6.method2135();
                } else if (this.field822 == 1024) {
                    var6.method2135();
                    var6.method2135();
                } else if (this.field822 == 1536) {
                    var6.method2135();
                    var6.method2135();
                    var6.method2135();
                }
                var6.method2158(this.field839 - this.field34, this.field29 - this.field52, this.field803 - this.field40);
            }
        }
        var3.field1814 = true;
        return var3;
    }

    @ObfuscatedName("g.w(IIBB)V")
    public final void method16(int arg0, int arg1, byte arg2) {
        if (this.field833 != -1 && class43.method750(this.field833).field995 == 1) {
            this.field833 = -1;
        }
        this.field843 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method14(arg0, arg1);
        } else if (this.field856[0] >= 0 && this.field856[0] < 104 && this.field857[0] >= 0 && this.field857[0] < 104) {
            if (arg2 == 2) {
                class3 var4 = this;
                int var5 = this.field856[0];
                int var6 = this.field857[0];
                int var7 = this.method12();
                if (var5 >= var7 && var5 < 104 - var7 && var6 >= var7 && var6 < 104 - var7 && arg0 >= var7 && arg0 < 104 - var7 && arg1 >= var7 && arg1 < 104 - var7) {
                    int var8 = this.method12();
                    class107 var9 = client.method3160(arg0, arg1);
                    class108 var10 = client.field389[this.field49];
                    int[] var11 = client.field462;
                    int[] var12 = client.field520;
                    int var13 = 0;
                    label469: while (true) {
                        if (var13 >= 128) {
                            boolean var15;
                            if (var8 == 1) {
                                var15 = class106.method2911(var5, var6, var9, var10);
                            } else if (var8 == 2) {
                                var15 = class106.method160(var5, var6, var9, var10);
                            } else {
                                int var16 = var5;
                                int var17 = var6;
                                byte var18 = 64;
                                byte var19 = 64;
                                int var20 = var5 - var18;
                                int var21 = var6 - var19;
                                class106.field1856[var18][var19] = 99;
                                class106.field1854[var18][var19] = 0;
                                byte var22 = 0;
                                int var23 = 0;
                                class106.field1860[var22] = var5;
                                int var64 = var22 + 1;
                                class106.field1866[var22] = var6;
                                int[][] var24 = var10.field1892;
                                boolean var29;
                                label455: while (true) {
                                    label453: while (true) {
                                        int var25;
                                        int var26;
                                        int var27;
                                        int var28;
                                        int var30;
                                        do {
                                            do {
                                                do {
                                                    label430: do {
                                                        if (var64 == var23) {
                                                            Statics.field1555 = var16;
                                                            Statics.field1862 = var17;
                                                            var29 = false;
                                                            break label455;
                                                        }
                                                        var16 = class106.field1860[var23];
                                                        var17 = class106.field1866[var23];
                                                        var23 = var23 + 1 & 0xFFF;
                                                        var25 = var16 - var20;
                                                        var26 = var17 - var21;
                                                        var27 = var16 - var10.field1888;
                                                        var28 = var17 - var10.field1889;
                                                        if (var9.method135(var8, var16, var17, var10)) {
                                                            Statics.field1555 = var16;
                                                            Statics.field1862 = var17;
                                                            var29 = true;
                                                            break label455;
                                                        }
                                                        var30 = class106.field1854[var25][var26] + 1;
                                                        if (var25 > 0 && class106.field1856[var25 - 1][var26] == 0 && (var24[var27 - 1][var28] & 0x124010E) == 0 && (var24[var27 - 1][var8 + var28 - 1] & 0x1240138) == 0) {
                                                            int var31 = 1;
                                                            while (true) {
                                                                if (var31 >= var8 - 1) {
                                                                    class106.field1860[var64] = var16 - 1;
                                                                    class106.field1866[var64] = var17;
                                                                    var64 = var64 + 1 & 0xFFF;
                                                                    class106.field1856[var25 - 1][var26] = 2;
                                                                    class106.field1854[var25 - 1][var26] = var30;
                                                                    break;
                                                                }
                                                                if ((var24[var27 - 1][var28 + var31] & 0x124013E) != 0) {
                                                                    break;
                                                                }
                                                                var31++;
                                                            }
                                                        }
                                                        if (var25 < 128 - var8 && class106.field1856[var25 + 1][var26] == 0 && (var24[var8 + var27][var28] & 0x1240183) == 0 && (var24[var8 + var27][var8 + var28 - 1] & 0x12401E0) == 0) {
                                                            int var32 = 1;
                                                            while (true) {
                                                                if (var32 >= var8 - 1) {
                                                                    class106.field1860[var64] = var16 + 1;
                                                                    class106.field1866[var64] = var17;
                                                                    var64 = var64 + 1 & 0xFFF;
                                                                    class106.field1856[var25 + 1][var26] = 8;
                                                                    class106.field1854[var25 + 1][var26] = var30;
                                                                    break;
                                                                }
                                                                if ((var24[var8 + var27][var28 + var32] & 0x12401E3) != 0) {
                                                                    break;
                                                                }
                                                                var32++;
                                                            }
                                                        }
                                                        if (var26 > 0 && class106.field1856[var25][var26 - 1] == 0 && (var24[var27][var28 - 1] & 0x124010E) == 0 && (var24[var8 + var27 - 1][var28 - 1] & 0x1240183) == 0) {
                                                            int var33 = 1;
                                                            while (true) {
                                                                if (var33 >= var8 - 1) {
                                                                    class106.field1860[var64] = var16;
                                                                    class106.field1866[var64] = var17 - 1;
                                                                    var64 = var64 + 1 & 0xFFF;
                                                                    class106.field1856[var25][var26 - 1] = 1;
                                                                    class106.field1854[var25][var26 - 1] = var30;
                                                                    break;
                                                                }
                                                                if ((var24[var27 + var33][var28 - 1] & 0x124018F) != 0) {
                                                                    break;
                                                                }
                                                                var33++;
                                                            }
                                                        }
                                                        if (var26 < 128 - var8 && class106.field1856[var25][var26 + 1] == 0 && (var24[var27][var8 + var28] & 0x1240138) == 0 && (var24[var8 + var27 - 1][var8 + var28] & 0x12401E0) == 0) {
                                                            int var34 = 1;
                                                            while (true) {
                                                                if (var34 >= var8 - 1) {
                                                                    class106.field1860[var64] = var16;
                                                                    class106.field1866[var64] = var17 + 1;
                                                                    var64 = var64 + 1 & 0xFFF;
                                                                    class106.field1856[var25][var26 + 1] = 4;
                                                                    class106.field1854[var25][var26 + 1] = var30;
                                                                    break;
                                                                }
                                                                if ((var24[var27 + var34][var8 + var28] & 0x12401F8) != 0) {
                                                                    break;
                                                                }
                                                                var34++;
                                                            }
                                                        }
                                                        if (var25 > 0 && var26 > 0 && class106.field1856[var25 - 1][var26 - 1] == 0 && (var24[var27 - 1][var28 - 1] & 0x124010E) == 0) {
                                                            int var35 = 1;
                                                            while (true) {
                                                                if (var35 >= var8) {
                                                                    class106.field1860[var64] = var16 - 1;
                                                                    class106.field1866[var64] = var17 - 1;
                                                                    var64 = var64 + 1 & 0xFFF;
                                                                    class106.field1856[var25 - 1][var26 - 1] = 3;
                                                                    class106.field1854[var25 - 1][var26 - 1] = var30;
                                                                    break;
                                                                }
                                                                if ((var24[var27 - 1][var28 - 1 + var35] & 0x124013E) != 0 || (var24[var27 - 1 + var35][var28 - 1] & 0x124018F) != 0) {
                                                                    break;
                                                                }
                                                                var35++;
                                                            }
                                                        }
                                                        if (var25 < 128 - var8 && var26 > 0 && class106.field1856[var25 + 1][var26 - 1] == 0 && (var24[var8 + var27][var28 - 1] & 0x1240183) == 0) {
                                                            int var36 = 1;
                                                            while (true) {
                                                                if (var36 >= var8) {
                                                                    class106.field1860[var64] = var16 + 1;
                                                                    class106.field1866[var64] = var17 - 1;
                                                                    var64 = var64 + 1 & 0xFFF;
                                                                    class106.field1856[var25 + 1][var26 - 1] = 9;
                                                                    class106.field1854[var25 + 1][var26 - 1] = var30;
                                                                    break;
                                                                }
                                                                if ((var24[var8 + var27][var28 - 1 + var36] & 0x12401E3) != 0 || (var24[var27 + var36][var28 - 1] & 0x124018F) != 0) {
                                                                    break;
                                                                }
                                                                var36++;
                                                            }
                                                        }
                                                        if (var25 > 0 && var26 < 128 - var8 && class106.field1856[var25 - 1][var26 + 1] == 0 && (var24[var27 - 1][var8 + var28] & 0x1240138) == 0) {
                                                            for (int var37 = 1; var37 < var8; var37++) {
                                                                if ((var24[var27 - 1][var28 + var37] & 0x124013E) != 0 || (var24[var27 - 1 + var37][var8 + var28] & 0x12401F8) != 0) {
                                                                    continue label430;
                                                                }
                                                            }
                                                            class106.field1860[var64] = var16 - 1;
                                                            class106.field1866[var64] = var17 + 1;
                                                            var64 = var64 + 1 & 0xFFF;
                                                            class106.field1856[var25 - 1][var26 + 1] = 6;
                                                            class106.field1854[var25 - 1][var26 + 1] = var30;
                                                        }
                                                    } while (var25 >= 128 - var8);
                                                } while (var26 >= 128 - var8);
                                            } while (class106.field1856[var25 + 1][var26 + 1] != 0);
                                        } while ((var24[var8 + var27][var8 + var28] & 0x12401E0) != 0);
                                        for (int var38 = 1; var38 < var8; var38++) {
                                            if ((var24[var27 + var38][var8 + var28] & 0x12401F8) != 0 || (var24[var8 + var27][var28 + var38] & 0x12401E3) != 0) {
                                                continue label453;
                                            }
                                        }
                                        class106.field1860[var64] = var16 + 1;
                                        class106.field1866[var64] = var17 + 1;
                                        var64 = var64 + 1 & 0xFFF;
                                        class106.field1856[var25 + 1][var26 + 1] = 12;
                                        class106.field1854[var25 + 1][var26 + 1] = var30;
                                    }
                                }
                                var15 = var29;
                            }
                            int var57;
                            label508: {
                                int var39 = var5 - 64;
                                int var40 = var6 - 64;
                                int var41 = Statics.field1555;
                                int var42 = Statics.field1862;
                                if (!var15) {
                                    int var43 = Integer.MAX_VALUE;
                                    int var44 = Integer.MAX_VALUE;
                                    byte var45 = 10;
                                    int var46 = var9.field1876;
                                    int var47 = var9.field1871;
                                    int var48 = var9.field1872;
                                    int var49 = var9.field1873;
                                    for (int var50 = var46 - var45; var50 <= var45 + var46; var50++) {
                                        for (int var51 = var47 - var45; var51 <= var45 + var47; var51++) {
                                            int var52 = var50 - var39;
                                            int var53 = var51 - var40;
                                            if (var52 >= 0 && var53 >= 0 && var52 < 128 && var53 < 128 && class106.field1854[var52][var53] < 100) {
                                                int var54 = 0;
                                                if (var50 < var46) {
                                                    var54 = var46 - var50;
                                                } else if (var50 > var46 + var48 - 1) {
                                                    var54 = var50 - (var46 + var48 - 1);
                                                }
                                                int var55 = 0;
                                                if (var51 < var47) {
                                                    var55 = var47 - var51;
                                                } else if (var51 > var47 + var49 - 1) {
                                                    var55 = var51 - (var47 + var49 - 1);
                                                }
                                                int var56 = var54 * var54 + var55 * var55;
                                                if (var56 < var43 || var43 == var56 && class106.field1854[var52][var53] < var44) {
                                                    var43 = var56;
                                                    var44 = class106.field1854[var52][var53];
                                                    var41 = var50;
                                                    var42 = var51;
                                                }
                                            }
                                        }
                                    }
                                    if (var43 == Integer.MAX_VALUE) {
                                        var57 = -1;
                                        break label508;
                                    }
                                }
                                if (var5 == var41 && var6 == var42) {
                                    var57 = 0;
                                } else {
                                    byte var58 = 0;
                                    class106.field1860[var58] = var41;
                                    int var65 = var58 + 1;
                                    class106.field1866[var58] = var42;
                                    int var59;
                                    int var60 = var59 = class106.field1856[var41 - var39][var42 - var40];
                                    while (var5 != var41 || var6 != var42) {
                                        if (var59 != var60) {
                                            var59 = var60;
                                            class106.field1860[var65] = var41;
                                            class106.field1866[var65++] = var42;
                                        }
                                        if ((var60 & 0x2) != 0) {
                                            var41++;
                                        } else if ((var60 & 0x8) != 0) {
                                            var41--;
                                        }
                                        if ((var60 & 0x1) != 0) {
                                            var42++;
                                        } else if ((var60 & 0x4) != 0) {
                                            var42--;
                                        }
                                        var60 = class106.field1856[var41 - var39][var42 - var40];
                                    }
                                    int var61 = 0;
                                    while (var65-- > 0) {
                                        var11[var61] = class106.field1860[var65];
                                        var12[var61++] = class106.field1866[var65];
                                        if (var61 >= var11.length) {
                                            break;
                                        }
                                    }
                                    var57 = var61;
                                }
                            }
                            int var62 = var57;
                            if (var57 < 1) {
                                break;
                            }
                            int var63 = 0;
                            while (true) {
                                if (var63 >= var62 - 1) {
                                    break label469;
                                }
                                var4.method15(client.field462[var63], client.field520[var63], (byte) 2);
                                var63++;
                            }
                        }
                        for (int var14 = 0; var14 < 128; var14++) {
                            class106.field1856[var13][var14] = 0;
                            class106.field1854[var13][var14] = 99999999;
                        }
                        var13++;
                    }
                }
            }
            this.method15(arg0, arg1, arg2);
        } else {
            this.method14(arg0, arg1);
        }
    }

    @ObfuscatedName("g.e(III)V")
    public void method14(int arg0, int arg1) {
        this.field855 = 0;
        this.field802 = 0;
        this.field859 = 0;
        this.field856[0] = arg0;
        this.field857[0] = arg1;
        int var3 = this.method12();
        this.field839 = this.field856[0] * 128 + var3 * 64;
        this.field803 = this.field857[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("g.c(IIBB)V")
    public final void method15(int arg0, int arg1, byte arg2) {
        if (this.field855 < 9) {
            this.field855++;
        }
        for (int var4 = this.field855; var4 > 0; var4--) {
            this.field856[var4] = this.field856[var4 - 1];
            this.field857[var4] = this.field857[var4 - 1];
            this.field813[var4] = this.field813[var4 - 1];
        }
        this.field856[0] = arg0;
        this.field857[0] = arg1;
        this.field813[0] = arg2;
    }

    @ObfuscatedName("g.a(I)Z")
    public final boolean method11() {
        return this.field39 != null;
    }
}
